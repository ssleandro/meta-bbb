FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "\
    file://journald-size.conf \
    file://watchdog.conf \
"

do_install() {
    install -Dm 0644 ${WORKDIR}/journald-size.conf ${D}${sysconfdir}/systemd/journald.conf.d/size.conf
    install -Dm 0644 ${WORKDIR}/watchdog.conf ${D}${sysconfdir}/systemd/system.conf.d/watchdog.conf
}

FILES_${PN} += "\
    ${sysconfdir}/systemd/journald.conf.d/size.conf \
    ${sysconfdir}/systemd/system.conf.d/watchdog.conf \
"

FILES_${PN} += "${sysconfdir}/systemd/journald.conf.d/size.conf"

