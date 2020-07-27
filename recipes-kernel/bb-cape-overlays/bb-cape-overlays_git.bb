DESCRIPTION = "Device Tree Overlays for bb.org boards"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

PV = "1.0+git${SRCPV}"

DEPENDS = "dtc-native"

SRCREV = "7e8a169d1985f77451ee54233d95e870ad9b011a"
SRC_URI = " \
    git://github.com/beagleboard/bb.org-overlays.git;branch=legacy-dtc-1.4.4 \
    file://0001-univ-bbb-Exx-00A0-Remove-spi0-and-spi1-devices.patch \
    file://0002-Makefile-Use-CC-variable-instead-of-call-gcc-directl.patch \
"

S = "${WORKDIR}/git"

SECURITY_CFLAGS = ""

do_configure[noexec] = "1"

do_compile() {
    oe_runmake DTC=dtc
}

do_install() {
    oe_runmake install DESTDIR=${D}
}

FILES_${PN} =+ " \
    ${base_libdir}/firmware \
"
