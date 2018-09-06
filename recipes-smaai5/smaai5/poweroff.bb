require smaai5.inc

SYSTEMD_SERVICE_${PN}_remove = "${PN}-control.socket"
SYSTEMD_SERVICE_${PN} += "${PN}.timer"

RDEPENDS_${PN} += " \
    python-datetime \
"
