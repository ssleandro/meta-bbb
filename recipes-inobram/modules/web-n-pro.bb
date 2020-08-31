SUMMARY = "Ambientte N-Pro Web"
LICENSE = "CLOSED"

DEPENDS = "nodejs-native"

SRCREV = "bdc801fc09ac095b13231d575421dd091392ff55"
SRC_URI = "git://git@bitbucket.org/inobram/web-n-pro.git;protocol=ssh"

S = "${WORKDIR}/git"

do_compile() {
    npm install
    npm run build
}

do_install() {
    rm -rf ${D}
    install -d ${D}${localstatedir}/www/html
    cp --no-preserve=ownership --recursive ${S}/dist/* ${D}${localstatedir}/www/html/
}

RDEPENDS_${PN} += "nginx"
