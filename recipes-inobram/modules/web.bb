require inobram.inc

SYSTEMD_SERVICE:${PN} = "${PN}.timer"

RDEPENDS:${PN} += " \
    python3-crypt \
    python3-datetime \
    python3-flask \
    python3-flask-jsonpify \
    python3-flask-jwt \
    python3-gunicorn \
    python3-io \
    python3-json \
    python3-pyjwt \
    python3-sqlite3 \
    python3-werkzeug \
    sqlite3 \
"
