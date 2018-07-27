require smaai5.inc

FILES_${PN} += "${systemd_unitdir}/system/web.socket"

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
