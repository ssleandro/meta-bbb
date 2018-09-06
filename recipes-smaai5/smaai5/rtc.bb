require smaai5.inc

SYSTEMD_SERVICE_${PN}_remove = "${PN}-control.socket"

RDEPENDS_${PN} += " \
    i2c-tools \
    python-smbus \
"
