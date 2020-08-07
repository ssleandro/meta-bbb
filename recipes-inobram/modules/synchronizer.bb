require smaai5.inc

SYSTEMD_SERVICE_${PN} = "${PN}.timer"

RDEPENDS_${PN} += " \
    nmap \
    python3-json \
    python3-sqlite3 \
    sqlite3 \
"
