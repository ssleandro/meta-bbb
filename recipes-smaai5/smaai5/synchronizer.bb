require smaai5.inc

SYSTEMD_SERVICE_${PN} += "${PN}.timer"

RDEPENDS_${PN} += " \
    python-json \
    python-sqlite3 \
    python-re \
    sqlite3 \
"
