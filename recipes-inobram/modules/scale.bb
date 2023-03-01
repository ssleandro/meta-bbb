require inobram.inc

do_install:append() {
    rm ${D}${libdir}/scale/.test_probes.py.swp
}
