require smaai5.inc

SYSTEMD_SERVICE_${PN} += "${PN}.timer"

RDEPENDS_${PN} += " \
    nmap \
    python-json \
    python-sqlite3 \
    python-re \
    sqlite3 \
"
