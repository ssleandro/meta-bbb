require inobram-setuptools.inc

SRCBRANCH = "master"

SYSTEMD_SERVICE:${PN} = "${PN}.timer"

SYSTEMD_PACKAGES += "${PN}m"
SYSTEMD_SERVICE:${PN}m = "${PN}m.timer"

# Override inobram_install task as ngrok doesn't have PN-control.socket and
# install .timer units.
inobram_install() {
    install -Dm 0644 ${S}/etc/${PN}.service ${D}${systemd_system_unitdir}/${PN}.service
    install -Dm 0644 ${S}/etc/${PN}.timer ${D}${systemd_system_unitdir}/${PN}.timer
    install -Dm 0644 ${S}/etc/${PN}m.service ${D}${systemd_system_unitdir}/${PN}m.service
    install -Dm 0644 ${S}/etc/${PN}m.timer ${D}${systemd_system_unitdir}/${PN}m.timer
}

PACKAGES += "${PN}m"
FILES:${PN}m += "${systemd_system_unitdir}/${PN}m.service"

FILES:${PN} += "${systemd_system_unitdir}/${PN}.service"

RDEPENDS:${PN} += " \
    ${PN}m \
    ${PYTHON_PN}-httplib2 \
    ${PYTHON_PN}-io \
    ${PYTHON_PN}-netclient \
    ${PYTHON_PN}-sqlite3 \
"
