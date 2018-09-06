require smaai5.inc

SYSTEMD_SERVICE_${PN}_remove = "${PN}-control.socket"
SYSTEMD_AUTO_ENABLE = "disable"

RDEPENDS_${PN} += " \
    python-updatehub-agent-sdk \
    updatehub-sdk-statechange-trigger \
"
