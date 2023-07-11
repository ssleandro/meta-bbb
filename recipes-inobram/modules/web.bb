SUMMARY = "MVPX Web"
LICENSE = "CLOSED"

DEPENDS = "nodejs-native"

SRC_URI = "git://git@bitbucket.org/inobram/web.git;protocol=ssh;branch=main"

S = "${WORKDIR}/git"

do_compile[network] = "1"
do_compile() {
    npm install
    npm run build
}

do_install() {
    rm -rf ${D}
    install -d ${D}${localstatedir}/www/html
    cp --no-preserve=ownership --recursive ${S}/dist/* ${D}${localstatedir}/www/html/
    install -Dm 0644 ${S}/utils/etc/nginx/sites-enabled/default_server ${D}${sysconfdir}/nginx/sites-enabled/default_server
}

RDEPENDS:${PN} += "nginx"
