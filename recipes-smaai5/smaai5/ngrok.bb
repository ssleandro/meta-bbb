require smaai5.inc

SYSTEMD_SERVICE_${PN} += "${PN}.timer"

SYSTEMD_PACKAGES += "${PN}m"
SYSTEMD_SERVICE_${PN}m = "${PN}m.service ${PN}m.timer"

PACKAGES += "${PN}m"

RDEPENDS_${PN} += " \
    ${PN}m \
    python-httplib2 \
    python-io \
    python-subprocess \
"
