FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "\
    file://journald-size.conf \
"

do_install() {
    install -Dm 0644 ${WORKDIR}/journald-size.conf ${D}${sysconfdir}/systemd/journald.conf.d/size.conf
}

FILES_${PN} += "${sysconfdir}/systemd/journald.conf.d/size.conf"
