require inobram-setuptools.inc

# As API display doesn't have PN-control.socket we need to override the
# inobram_install task from inobram-setuptools.inc
inobram_install() {
    install -Dm 0644 ${S}/etc/${PN}.service ${D}${systemd_system_unitdir}/${PN}.service
}

RDEPENDS:${PN} += "\
    python3-flask \
    python3-flask-restx \
    python3-gunicorn \
    python3-json \
    python3-pyjwt \
    python3-werkzeug \
"
