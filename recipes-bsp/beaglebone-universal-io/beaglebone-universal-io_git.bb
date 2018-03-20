DESCRIPTION = "Device tree overlay and support scripts for using most available \
hardware I/O on the BeagleBone without editing dts files or rebuilding the kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e8c1458438ead3c34974bc0be3a03ed6"

inherit systemd

S = "${WORKDIR}/git"

SRCREV = "e75cd0c3e3896b9ec4030333358bade9efa77bfd"
SRC_URI = " \
    git://github.com/cdsteinkuehler/beaglebone-universal-io.git \
    file://config-pin.conf \
    file://${PN}.service \
    file://config-pin-Use-bin-sh-not-bin-dash.patch \
"

SYSTEMD_SERVICE_${PN} = "${PN}.service"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -Dm 0755 ${S}/config-pin ${D}${bindir}/config-pin
    install -Dm 0644 ${WORKDIR}/config-pin.conf ${D}${sysconfdir}/config-pin.conf
    install -Dm 0644 ${WORKDIR}/${PN}.service ${D}${systemd_unitdir}/system/${PN}.service
}
