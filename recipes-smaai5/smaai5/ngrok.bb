require smaai5.inc

SYSTEMD_SERVICE_${PN} = "${PN}.timer"

SYSTEMD_PACKAGES += "${PN}m"
SYSTEMD_SERVICE_${PN}m = "${PN}m.timer"

PACKAGES += "${PN}m"
FILES_${PN}m += "${systemd_system_unitdir}/${PN}m.service"

RDEPENDS_${PN} += " \
    ${PN}m \
    python3-httplib2 \
    python3-io \
"
