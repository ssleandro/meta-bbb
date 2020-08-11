require inobram.inc

SRCBRANCH = "ambientte_1.0.x"

SYSTEMD_PACKAGES += "${PN}-manager"
SYSTEMD_SERVICE_${PN}-manager = "${PN}-manager.service"

# FIXME: This file need to be removed in the repository
do_install_prepend() {
    rm -rf ${S}/curtain/usr/lib/curtain/.gitignore
}

PACKAGES += "${PN}-manager"

RDEPENDS_${PN} += " \
    ${PN}-manager \
    python3-wrapt \
"
