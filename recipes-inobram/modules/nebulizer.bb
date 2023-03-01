require inobram.inc

SYSTEMD_PACKAGES += "${PN}-manager"
SYSTEMD_SERVICE:${PN}-manager = "${PN}-manager.service"

PACKAGES += "${PN}-manager"

RDEPENDS:${PN} += " \
    ${PN}-manager \
    python3-datetime \
"
