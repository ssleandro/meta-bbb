DESCRIPTION = "Device Tree Overlays for bb.org boards"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

PV = "1.0+git${SRCPV}"

DEPENDS = "dtc-native"

SRC_URI = "git://github.com/beagleboard/bb.org-overlays.git;branch=master"
SRCREV = "e0bb7179dac5e1e1ff270004b929737ff391e0c2"

S = "${WORKDIR}/git"

do_compile() {
    oe_runmake DTC=dtc
}

do_install() {
    oe_runmake install DESTDIR=${D}
}

FILES_${PN} = " \
    ${base_libdir}/firmware \
"
