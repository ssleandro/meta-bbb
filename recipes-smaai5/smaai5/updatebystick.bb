require smaai5.inc

SRC_URI += "file://updatebystick.rules"

do_install_append() {
    install -Dm 0644 ${WORKDIR}/updatebystick.rules ${D}${nonarch_base_libdir}/udev/rules.d/98-updatebystick.rules
}

RDEPENDS_${PN} += " \
    python-updatehub-agent-sdk \
"
