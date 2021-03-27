from xml.dom import minidom
import re

dom = minidom.parse("../cldr/common/supplemental/plurals.xml")

firstIterationPattern = re.compile(r"([infve]( % \d+)? (==|!=)) ((\S+,)+\S+)")

pattern = re.compile(r"([infve])( % \d+)? (==|!=) \d+(\.\.\d+)?")

def get_suffix(op: str, modulo: bool):
    if op in ("i", "f"): #or op == "n" and modulo:
        return "L"
    elif op == "n":
        return ".0"
    else:
        return ""

def insertBefore(host: str, index: int, insertion: str):
    if index < 0 or index > len(host):
        print("index {} is out of bounds of '{}' string".format(index, host))
        return host
    return host[:index] + insertion + host[index:]

def get_symbol(sym: str, rule: str):
    return sym if sym in rule else "_"

def substitute(substitutions: dict, text: str):
    for key, value in substitutions.items():
        text = text.replace(key, value)
    return text

with open("../localization/src/main/java/com/technokratos/compose/localization/plural_rules.kt", "w") as f:
    f.write("package com.technokratos.compose.localization\n\n")
    f.write("import java.util.Locale\n\n")

    f.write("val onlyOther = PluralRule()\n\n")

    f.write("val localeToPluralRule = mutableMapOf(\n")

    for plural in dom.getElementsByTagName("plurals")[0].getElementsByTagName("pluralRules"):
        for locale in plural.getAttribute("locales").split(" "):
            if len(plural.getElementsByTagName("pluralRule")) < 2:
                f.write("\tLocale(\"{}\") to onlyOther,\n".format(locale))
                continue
            else: 
                f.write("\tLocale(\"{}\") to PluralRule(\n".format(locale))
            for rule in plural.getElementsByTagName("pluralRule"):
                attr = rule.getAttribute("count")
                if attr == "other":
                    continue
                f.write("        {} = ".format(attr))
                rule_text = rule.firstChild.data
                at = rule_text.find("@")
                if at < 0:
                    rule_text = rule_text[0:len(rule_text)]
                else:
                    rule_text = rule_text[0:(at - 1)]

                rule_text = rule_text.replace("t", "f")
                rule_text = rule_text.replace("or", "||")
                rule_text = rule_text.replace("and", "&&")
                rule_text = rule_text.replace(" = ", " == ")

                f.write("{ " + "{n}: Double, {i}: Long, {f}: Long, {v}: Int, {e}: Int ->\n".format(
                    n = get_symbol("n", rule_text),
                    i = get_symbol("i", rule_text),
                    f = get_symbol("f", rule_text),
                    v = get_symbol("v", rule_text),
                    e = get_symbol("e", rule_text)
                ))

                substitutions = {}

                for match in firstIterationPattern.finditer(rule_text):
                    operands = match.group(4).split(',')
                    substitutions[match.group()] = " && ".join([common + " " + operand for common, operand in zip([match.group(1)] * len(operands), operands)])

                rule_text = substitute(substitutions, rule_text)

                for match in pattern.finditer(rule_text):
                    suffix = get_suffix(match.group(1), match.group(2) is not None) 
                    statement = match.group()
                    statement = insertBefore(statement, len(statement), suffix)

                    if match.group(4) is not None:
                        statement = insertBefore(statement, statement.index(".."), suffix)
                        statement = statement.replace("==", "in")
                        statement = statement.replace("!=", "!in")
                        
                    substitutions[match.group()] = statement

                rule_text = substitute(substitutions, rule_text)

                f.write("            {}\n".format(rule_text))
                f.write("        },\n")
            f.write("    ),\n")
    f.write(")")