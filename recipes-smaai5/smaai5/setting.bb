require smaai5.inc

SYSTEMD_PACKAGES += "${PN}-fail"
SYSTEMD_SERVICE_${PN}-fail = "fail.service"

PACKAGES += "${PN}-fail"

RDEPENDS_${PN} += " \
    ${PN}-fail \
    python-datetime \
    python-db \
"
