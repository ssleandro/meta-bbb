FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://99-updatehub.rules"

do_install_append() {
    install -Dm 0644 ${WORKDIR}/99-updatehub.rules ${D}${nonarch_base_libdir}/udev/rules.d/99-updatehub.rules
}

RDEPENDS_${PN}-local-update += "at"
