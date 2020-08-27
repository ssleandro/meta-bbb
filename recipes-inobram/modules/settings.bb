require inobram-setuptools.inc
require inobram-manager-setuptools.inc

SYSTEMD_PACKAGES += "fail"
SYSTEMD_SERVICE_fail = "fail.service"
SYSTEMD_AUTO_ENABLE_fail = "disable"

do_install_append() {
    install -Dm 0644 ${S}/etc/fail.service ${D}${systemd_system_unitdir}/fail.service
}

PACKAGES += "fail"

FILES_fail += "${systemd_system_unitdir}/fail.service"

RDEPENDS_${PN} += "\
    fail \
"
