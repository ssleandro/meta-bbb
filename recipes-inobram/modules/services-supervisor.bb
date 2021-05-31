require inobram-setuptools.inc

SYSTEMD_SERVICE_${PN} = "${PN}.timer"

# Override inobram_install task as services-supervisor doesn't have
# PN-control.socket and install .timer units.
inobram_install() {
    install -Dm 0644 ${S}/etc/${PN}.service ${D}${systemd_system_unitdir}/${PN}.service
    install -Dm 0644 ${S}/etc/${PN}.timer ${D}${systemd_system_unitdir}/${PN}.timer
}

FILES_${PN} += "${systemd_system_unitdir}/${PN}.service"
