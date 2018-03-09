do_install_append() {
    install -d ${D}${sysconfdir}
    echo 'inobram ALL=(ALL:ALL) NOPASSWD:ALL' > ${D}${sysconfdir}/sudoers.d/inobram
    chmod 660 ${D}${sysconfdir}/sudoers.d/inobram
}
