require smaai5.inc

do_install() {
    cp -r ${S}/${BPN}/* ${D}/
    rm -rf ${D}${localstatedir}/run
    chmod -R 0755 ${D}${bindir}
}

INSANE_SKIP_${PN} += "already-stripped"
