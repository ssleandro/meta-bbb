SUMMARY = "SMAAI5 extra udev rules"
LICENSE = "CLOSED"

SRC_URI = " \
    file://50-spi.rules \
    file://60-i2c-tools.rules \
    file://60-omap-tty.rules \
"

S = "${WORKDIR}"

do_install() {
    install -Dm 0644 ${WORKDIR}/50-spi.rules ${D}${nonarch_base_libdir}/udev/rules.d/50-spi.rules
    install -Dm 0644 ${WORKDIR}/60-i2c-tools.rules ${D}${nonarch_base_libdir}/udev/rules.d/60-i2c-tools.rules
    install -Dm 0644 ${WORKDIR}/60-omap-tty.rules ${D}${nonarch_base_libdir}/udev/rules.d/60-omap-tty.rules
}

FILES:${PN} = "${nonarch_base_libdir}/udev"
RDEPENDS:${PN} = "udev"
