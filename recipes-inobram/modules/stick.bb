require inobram.inc

SRC_URI += " \
    file://99-stick.rules \
"

SYSTEMD_AUTO_ENABLE = "disable"

do_install:append () {
    rm -rf ${D}${sysconfdir}/udev
    install -Dm 0644 ${WORKDIR}/99-stick.rules ${D}${nonarch_base_libdir}/udev/rules.d/99-stick.rules
}

RDEPENDS:${PN} += "\
    updatehub-ctl \
    util-linux-mount \
    util-linux-umount \
"
