require inobram-setuptools.inc

SYSTEMD_PACKAGES += "actuators"
SYSTEMD_SERVICE_actuators = "actuators.service"

PACKAGES += "actuators"

do_install_append() {
    install -Dm 0644 ${S}/etc/actuators.service ${D}${systemd_system_unitdir}/actuators.service
    install -Dm 0644 ${S}/etc/actuators-control.socket ${D}${systemd_system_unitdir}/actuators-control.socket
}

FILES_actuators += "\
    ${systemd_system_unitdir}/actuators.service \
    ${systemd_system_unitdir}/actuators-control.socket \
"

RDEPENDS_${PN} += "\
    actuators \
"
