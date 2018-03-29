DESCRIPTION = "Device Tree Overlays for bb.org boards"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

PV = "1.0+git${SRCPV}"

DEPENDS = "dtc-native"

inherit systemd

SRCREV = "f4035b85bea9bb3a17b8027e0f8f308d593ab414"
SRC_URI = " \
    git://github.com/RobertCNelson/bb.org-overlays.git;branch=master \
    file://beaglebone-universal-io.service \
    file://config-pin.conf \
    file://config-pin-Use-bin-sh-instead-of-bin-dash.patch \
"

S = "${WORKDIR}/git"

SYSTEMD_PACKAGES = "beaglebone-universal-io"
SYSTEMD_SERVICE_beaglebone-universal-io = "beaglebone-universal-io.service"

do_configure[noexec] = "1"

do_compile() {
    oe_runmake DTC=dtc
}

do_install() {
    oe_runmake install DESTDIR=${D}
    install -Dm 0755 ${S}/tools/beaglebone-universal-io/config-pin ${D}${bindir}/config-pin
    install -Dm 0644 ${WORKDIR}/config-pin.conf ${D}${sysconfdir}/config-pin.conf
    install -Dm 0644 ${WORKDIR}/beaglebone-universal-io.service ${D}${systemd_unitdir}/system/beaglebone-universal-io.service
}

FILES_${PN} = " \
    ${base_libdir}/firmware \
"

PACKAGES += "beaglebone-universal-io"
FILES_beaglebone-universal-io = " \
    ${bindir}/config-pin \
    ${sysconfdir}/config-pin.conf \
    ${systemd_unitdir}/system/beaglebone-universal-io.service \
"

RDEPENDS_${PN} += "beaglebone-universal-io"
