require smaai5.inc

do_install_append() {
    rm ${D}${libdir}/scale/.test_probes.py.swp
}
