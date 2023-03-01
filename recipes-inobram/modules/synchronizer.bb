require inobram.inc

SYSTEMD_SERVICE:${PN} = "${PN}.timer"

RDEPENDS:${PN} += " \
    nmap \
    python3-json \
    python3-sqlite3 \
    sqlite3 \
"
