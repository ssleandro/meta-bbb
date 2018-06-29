SUMMARY = "SMAAI5 device attributes scripts for UpdateHub usage"
LICENSE = "CLOSED"

SRC_URI = " \
    file://board_revision \
"

inherit allarch

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -Dm 0755 ${WORKDIR}/board_revision ${D}/${datadir}/updatehub/device-attributes.d/board_revision
}

FILES_${PN} = "${datadir}/updatehub"

RDEPENDS_${PN} += "u-boot-fw-utils"
