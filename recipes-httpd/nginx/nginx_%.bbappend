do_install:append () {
    rm -f ${D}${sysconfdir}/nginx/sites-enabled/default_server
    rm -f ${D}${sysconfdir}/nginx/sites-available/default_server
}
