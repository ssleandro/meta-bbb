DESCRIPTION = "Device Tree Overlays for bb.org boards"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

PV = "1.0+git${SRCPV}"

DEPENDS = "dtc-native"

SRCREV = "f4035b85bea9bb3a17b8027e0f8f308d593ab414"
SRC_URI = " \
    git://github.com/RobertCNelson/bb.org-overlays.git;branch=master \
"

S = "${WORKDIR}/git"

do_configure[noexec] = "1"

do_compile() {
    oe_runmake DTC=dtc
}

do_install() {
    oe_runmake install DESTDIR=${D}
}

FILES_${PN} = " \
    ${base_libdir}/firmware \
"
