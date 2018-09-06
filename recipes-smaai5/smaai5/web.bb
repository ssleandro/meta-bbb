require smaai5.inc

SYSTEMD_SERVICE_${PN} += "${PN}.timer"
SYSTEMD_SERVICE_${PN}_remove = "${PN}-control.socket"

RDEPENDS_${PN} += " \
    python-crypt \
    python-datetime \
    python-flask \
    python-flask-jsonpify \
    python-flask-jwt \
    python-gunicorn \
    python-io \
    python-json \
    python-lang \
    python-pyjwt \
    python-sqlite3 \
    python-werkzeug \
    sqlite3 \
"
