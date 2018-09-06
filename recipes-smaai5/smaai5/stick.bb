require smaai5.inc

SRC_URI += " \
    file://99-stick.rules \
"

SYSTEMD_AUTO_ENABLE = "disable"

do_install_append () {
    rm -rf ${D}${sysconfdir}/udev
    install -Dm 0644 ${WORKDIR}/99-stick.rules ${D}${nonarch_base_libdir}/udev/rules.d/99-stick.rules
}

RDEPENDS_${PN} += "util-linux-mount util-linux-umount updatehub-server at"
