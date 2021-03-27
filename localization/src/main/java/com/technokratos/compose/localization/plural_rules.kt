package com.technokratos.compose.localization

import java.util.Locale

val onlyOther = PluralRule()

val localeToPluralRule = mutableMapOf(
    Locale("bm") to onlyOther,
    Locale("bo") to onlyOther,
    Locale("dz") to onlyOther,
    Locale("id") to onlyOther,
    Locale("ig") to onlyOther,
    Locale("ii") to onlyOther,
    Locale("in") to onlyOther,
    Locale("ja") to onlyOther,
    Locale("jbo") to onlyOther,
    Locale("jv") to onlyOther,
    Locale("jw") to onlyOther,
    Locale("kde") to onlyOther,
    Locale("kea") to onlyOther,
    Locale("km") to onlyOther,
    Locale("ko") to onlyOther,
    Locale("lkt") to onlyOther,
    Locale("lo") to onlyOther,
    Locale("ms") to onlyOther,
    Locale("my") to onlyOther,
    Locale("nqo") to onlyOther,
    Locale("osa") to onlyOther,
    Locale("root") to onlyOther,
    Locale("sah") to onlyOther,
    Locale("ses") to onlyOther,
    Locale("sg") to onlyOther,
    Locale("su") to onlyOther,
    Locale("th") to onlyOther,
    Locale("to") to onlyOther,
    Locale("vi") to onlyOther,
    Locale("wo") to onlyOther,
    Locale("yo") to onlyOther,
    Locale("yue") to onlyOther,
    Locale("zh") to onlyOther,
    Locale("am") to PluralRule(
        one = { n: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L || n == 1.0
        },
    ),
    Locale("as") to PluralRule(
        one = { n: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L || n == 1.0
        },
    ),
    Locale("bn") to PluralRule(
        one = { n: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L || n == 1.0
        },
    ),
    Locale("doi") to PluralRule(
        one = { n: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L || n == 1.0
        },
    ),
    Locale("fa") to PluralRule(
        one = { n: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L || n == 1.0
        },
    ),
    Locale("gu") to PluralRule(
        one = { n: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L || n == 1.0
        },
    ),
    Locale("hi") to PluralRule(
        one = { n: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L || n == 1.0
        },
    ),
    Locale("kn") to PluralRule(
        one = { n: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L || n == 1.0
        },
    ),
    Locale("pcm") to PluralRule(
        one = { n: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L || n == 1.0
        },
    ),
    Locale("zu") to PluralRule(
        one = { n: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L || n == 1.0
        },
    ),
    Locale("ff") to PluralRule(
        one = { _: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L && i == 1L
        },
    ),
    Locale("hy") to PluralRule(
        one = { _: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L && i == 1L
        },
    ),
    Locale("kab") to PluralRule(
        one = { _: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L && i == 1L
        },
    ),
    Locale("pt") to PluralRule(
        one = { _: Double, i: Long, _: Long, _: Int, _: Int ->
            i in 0L..1L
        },
    ),
    Locale("ast") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("ca") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("de") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("en") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("et") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("fi") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("fy") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("gl") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("ia") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("io") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("it") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("ji") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("lij") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("nl") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("pt_PT") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("sc") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("scn") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("sv") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("sw") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("ur") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("yi") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
    ),
    Locale("si") to PluralRule(
        one = { n: Double, i: Long, f: Long, _: Int, _: Int ->
            n == 0.0 && n == 1.0 || i == 0L && f == 1L
        },
    ),
    Locale("ak") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n in 0.0..1.0
        },
    ),
    Locale("bho") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n in 0.0..1.0
        },
    ),
    Locale("guw") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n in 0.0..1.0
        },
    ),
    Locale("ln") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n in 0.0..1.0
        },
    ),
    Locale("mg") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n in 0.0..1.0
        },
    ),
    Locale("nso") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n in 0.0..1.0
        },
    ),
    Locale("pa") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n in 0.0..1.0
        },
    ),
    Locale("ti") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n in 0.0..1.0
        },
    ),
    Locale("wa") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n in 0.0..1.0
        },
    ),
    Locale("tzm") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n in 0.0..1.0 || n in 11.0..99.0
        },
    ),
    Locale("af") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("an") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("asa") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("az") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("bem") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("bez") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("bg") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("brx") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ce") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("cgg") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("chr") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ckb") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("dv") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ee") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("el") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("eo") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("es") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("eu") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("fo") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("fur") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("gsw") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ha") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("haw") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("hu") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("jgo") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("jmc") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ka") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("kaj") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("kcg") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("kk") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("kkj") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("kl") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ks") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ksb") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ku") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ky") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("lb") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("lg") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("mas") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("mgo") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ml") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("mn") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("mr") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("nah") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("nb") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("nd") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ne") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("nn") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("nnh") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("no") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("nr") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ny") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("nyn") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("om") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("or") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("os") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("pap") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ps") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("rm") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("rof") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("rwk") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("saq") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("sd") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("sdh") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("seh") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("sn") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("so") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("sq") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ss") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ssy") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("st") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("syr") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ta") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("te") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("teo") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("tig") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("tk") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("tn") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("tr") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ts") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ug") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("uz") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("ve") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("vo") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("vun") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("wae") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("xh") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("xog") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("da") to PluralRule(
        one = { n: Double, i: Long, f: Long, _: Int, _: Int ->
            n == 1.0 || f != 0L && i == 0L && i == 1L
        },
    ),
    Locale("is") to PluralRule(
        one = { _: Double, i: Long, f: Long, _: Int, _: Int ->
            f == 0L && i % 10 == 1L && i % 100 != 11L || f != 0L
        },
    ),
    Locale("mk") to PluralRule(
        one = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i % 10 == 1L && i % 100 != 11L || f % 10 == 1L && f % 100 != 11L
        },
    ),
    Locale("ceb") to PluralRule(
        one = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i == 1L && i == 2L && i == 3L || v == 0 && i % 10 != 4L && i % 10 != 6L && i % 10 != 9L || v != 0 && f % 10 != 4L && f % 10 != 6L && f % 10 != 9L
        },
    ),
    Locale("fil") to PluralRule(
        one = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i == 1L && i == 2L && i == 3L || v == 0 && i % 10 != 4L && i % 10 != 6L && i % 10 != 9L || v != 0 && f % 10 != 4L && f % 10 != 6L && f % 10 != 9L
        },
    ),
    Locale("tl") to PluralRule(
        one = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i == 1L && i == 2L && i == 3L || v == 0 && i % 10 != 4L && i % 10 != 6L && i % 10 != 9L || v != 0 && f % 10 != 4L && f % 10 != 6L && f % 10 != 9L
        },
    ),
    Locale("lv") to PluralRule(
        zero = { n: Double, _: Long, f: Long, v: Int, _: Int ->
            n % 10 == 0.0 || n % 100 in 11.0..19.0 || v == 2 && f % 100 in 11L..19L
        },
        one = { n: Double, _: Long, f: Long, v: Int, _: Int ->
            n % 10 == 1.0 && n % 100 != 11.0 || v == 2 && f % 10 == 1L && f % 100 != 11L || v != 2 && f % 10 == 1L
        },
    ),
    Locale("prg") to PluralRule(
        zero = { n: Double, _: Long, f: Long, v: Int, _: Int ->
            n % 10 == 0.0 || n % 100 in 11.0..19.0 || v == 2 && f % 100 in 11L..19L
        },
        one = { n: Double, _: Long, f: Long, v: Int, _: Int ->
            n % 10 == 1.0 && n % 100 != 11.0 || v == 2 && f % 10 == 1L && f % 100 != 11L || v != 2 && f % 10 == 1L
        },
    ),
    Locale("lag") to PluralRule(
        zero = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 0.0
        },
        one = { n: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L && i == 1L && n != 0.0
        },
    ),
    Locale("ksh") to PluralRule(
        zero = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 0.0
        },
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
    ),
    Locale("iu") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 2.0
        },
    ),
    Locale("naq") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 2.0
        },
    ),
    Locale("sat") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 2.0
        },
    ),
    Locale("se") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 2.0
        },
    ),
    Locale("sma") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 2.0
        },
    ),
    Locale("smi") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 2.0
        },
    ),
    Locale("smj") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 2.0
        },
    ),
    Locale("smn") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 2.0
        },
    ),
    Locale("sms") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 2.0
        },
    ),
    Locale("shi") to PluralRule(
        one = { n: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L || n == 1.0
        },
        few = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n in 2.0..10.0
        },
    ),
    Locale("mo") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
        few = { n: Double, _: Long, _: Long, v: Int, _: Int ->
            v != 0 || n == 0.0 || n % 100 in 2.0..19.0
        },
    ),
    Locale("ro") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
        few = { n: Double, _: Long, _: Long, v: Int, _: Int ->
            v != 0 || n == 0.0 || n % 100 in 2.0..19.0
        },
    ),
    Locale("bs") to PluralRule(
        one = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i % 10 == 1L && i % 100 != 11L || f % 10 == 1L && f % 100 != 11L
        },
        few = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i % 10 in 2L..4L && i % 100 !in 12L..14L || f % 10 in 2L..4L && f % 100 !in 12L..14L
        },
    ),
    Locale("hr") to PluralRule(
        one = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i % 10 == 1L && i % 100 != 11L || f % 10 == 1L && f % 100 != 11L
        },
        few = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i % 10 in 2L..4L && i % 100 !in 12L..14L || f % 10 in 2L..4L && f % 100 !in 12L..14L
        },
    ),
    Locale("sh") to PluralRule(
        one = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i % 10 == 1L && i % 100 != 11L || f % 10 == 1L && f % 100 != 11L
        },
        few = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i % 10 in 2L..4L && i % 100 !in 12L..14L || f % 10 in 2L..4L && f % 100 !in 12L..14L
        },
    ),
    Locale("sr") to PluralRule(
        one = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i % 10 == 1L && i % 100 != 11L || f % 10 == 1L && f % 100 != 11L
        },
        few = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i % 10 in 2L..4L && i % 100 !in 12L..14L || f % 10 in 2L..4L && f % 100 !in 12L..14L
        },
    ),
    Locale("fr") to PluralRule(
        one = { _: Double, i: Long, _: Long, _: Int, _: Int ->
            i == 0L && i == 1L
        },
        many = { _: Double, i: Long, _: Long, v: Int, e: Int ->
            e == 0 && i != 0L && i % 1000000 == 0L && v == 0 || e !in 0..5
        },
    ),
    Locale("gd") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0 && n == 1.01
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 2.0 && n == 12.0
        },
        few = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n in 3.0..10.0 && n in 13.0..19.0
        },
    ),
    Locale("sl") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            v == 0 && i % 100 == 1L
        },
        two = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            v == 0 && i % 100 == 2L
        },
        few = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            v == 0 && i % 100 in 3L..4L || v != 0
        },
    ),
    Locale("dsb") to PluralRule(
        one = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i % 100 == 1L || f % 100 == 1L
        },
        two = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i % 100 == 2L || f % 100 == 2L
        },
        few = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i % 100 in 3L..4L || f % 100 in 3L..4L
        },
    ),
    Locale("hsb") to PluralRule(
        one = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i % 100 == 1L || f % 100 == 1L
        },
        two = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i % 100 == 2L || f % 100 == 2L
        },
        few = { _: Double, i: Long, f: Long, v: Int, _: Int ->
            v == 0 && i % 100 in 3L..4L || f % 100 in 3L..4L
        },
    ),
    Locale("he") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
        two = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 2L && v == 0
        },
        many = { n: Double, _: Long, _: Long, v: Int, _: Int ->
            v == 0 && n !in 0.0..10.0 && n % 10 == 0.0
        },
    ),
    Locale("iw") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
        two = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 2L && v == 0
        },
        many = { n: Double, _: Long, _: Long, v: Int, _: Int ->
            v == 0 && n !in 0.0..10.0 && n % 10 == 0.0
        },
    ),
    Locale("cs") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
        few = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i in 2L..4L && v == 0
        },
        many = { _: Double, _: Long, _: Long, v: Int, _: Int ->
            v != 0
        },
    ),
    Locale("sk") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
        few = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i in 2L..4L && v == 0
        },
        many = { _: Double, _: Long, _: Long, v: Int, _: Int ->
            v != 0
        },
    ),
    Locale("pl") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            i == 1L && v == 0
        },
        few = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            v == 0 && i % 10 in 2L..4L && i % 100 !in 12L..14L
        },
        many = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            v == 0 && i != 1L && i % 10 in 0L..1L || v == 0 && i % 10 in 5L..9L || v == 0 && i % 100 in 12L..14L
        },
    ),
    Locale("be") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n % 10 == 1.0 && n % 100 != 11.0
        },
        few = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n % 10 in 2.0..4.0 && n % 100 !in 12.0..14.0
        },
        many = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n % 10 == 0.0 || n % 10 in 5.0..9.0 || n % 100 in 11.0..14.0
        },
    ),
    Locale("lt") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n % 10 == 1.0 && n % 100 !in 11.0..19.0
        },
        few = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n % 10 in 2.0..9.0 && n % 100 !in 11.0..19.0
        },
        many = { _: Double, _: Long, f: Long, _: Int, _: Int ->
            f != 0L
        },
    ),
    Locale("mt") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
        few = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 0.0 || n % 100 in 2.0..10.0
        },
        many = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n % 100 in 11.0..19.0
        },
    ),
    Locale("ru") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            v == 0 && i % 10 == 1L && i % 100 != 11L
        },
        few = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            v == 0 && i % 10 in 2L..4L && i % 100 !in 12L..14L
        },
        many = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            v == 0 && i % 10 == 0L || v == 0 && i % 10 in 5L..9L || v == 0 && i % 100 in 11L..14L
        },
    ),
    Locale("uk") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            v == 0 && i % 10 == 1L && i % 100 != 11L
        },
        few = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            v == 0 && i % 10 in 2L..4L && i % 100 !in 12L..14L
        },
        many = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            v == 0 && i % 10 == 0L || v == 0 && i % 10 in 5L..9L || v == 0 && i % 100 in 11L..14L
        },
    ),
    Locale("br") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n % 10 == 1.0 && n % 100 != 11.0 && n % 100 != 71.0 && n % 100 != 91.0
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n % 10 == 2.0 && n % 100 != 12.0 && n % 100 != 72.0 && n % 100 != 92.0
        },
        few = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n % 10 in 3.0..4.0 && n % 10 == 9.0 && n % 100 !in 10.0..19.0 && n % 100 !in 70.0..79.0 && n % 100 !in 90.0..99.0
        },
        many = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n != 0.0 && n % 1000000 == 0.0
        },
    ),
    Locale("ga") to PluralRule(
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 2.0
        },
        few = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n in 3.0..6.0
        },
        many = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n in 7.0..10.0
        },
    ),
    Locale("gv") to PluralRule(
        one = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            v == 0 && i % 10 == 1L
        },
        two = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            v == 0 && i % 10 == 2L
        },
        few = { _: Double, i: Long, _: Long, v: Int, _: Int ->
            v == 0 && i % 100 == 0L && i % 100 == 20L && i % 100 == 40L && i % 100 == 60L && i % 100 == 80L
        },
        many = { _: Double, _: Long, _: Long, v: Int, _: Int ->
            v != 0
        },
    ),
    Locale("kw") to PluralRule(
        zero = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 0.0
        },
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n % 100 == 2.0 && n % 100 == 2.02 && n % 100 == 42.0 && n % 100 == 62.0 && n % 100 == 82.0 || n % 1000 == 0.0 && n % 100000 in 1000.0..20000.0 && n % 100000 == 40000.0 && n % 100000 == 60000.0 && n % 100000 == 80000.0 || n != 0.0 && n % 1000000 == 100000.0
        },
        few = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n % 100 == 3.0 && n % 100 == 23.0 && n % 100 == 43.0 && n % 100 == 63.0 && n % 100 == 83.0
        },
        many = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n != 1.0 && n % 100 == 1.0 && n % 100 == 21.0 && n % 100 == 41.0 && n % 100 == 61.0 && n % 100 == 81.0
        },
    ),
    Locale("ar") to PluralRule(
        zero = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 0.0
        },
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 2.0
        },
        few = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n % 100 in 3.0..10.0
        },
        many = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n % 100 in 11.0..99.0
        },
    ),
    Locale("ars") to PluralRule(
        zero = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 0.0
        },
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 2.0
        },
        few = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n % 100 in 3.0..10.0
        },
        many = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n % 100 in 11.0..99.0
        },
    ),
    Locale("cy") to PluralRule(
        zero = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 0.0
        },
        one = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 1.0
        },
        two = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 2.0
        },
        few = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 3.0
        },
        many = { n: Double, _: Long, _: Long, _: Int, _: Int ->
            n == 6.0
        },
    ),
)