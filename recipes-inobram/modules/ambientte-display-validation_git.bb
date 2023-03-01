SUMMARY = "Application to test display with qt5 application"
LICENSE = "CLOSED"

DEPENDS = "qtbase qtxmlpatterns qtquickcontrols2"

SRCBRANCH = "master"
SRC_URI = "git://git@bitbucket.org/inobram/htmg-test-screen.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"

inherit qmake5 systemd

SYSTEMD_SERVICE:${PN} = "${PN}.service"

SYSTEMD_AUTO_ENABLE:${PN} = "enable"

do_install() {
    install -Dm 0755 ${B}/HtmgTestScreen ${D}${bindir}/HtmgTestScreen
    install -Dm 0644 ${S}/systemd/${PN}.service ${D}${systemd_system_unitdir}/${PN}.service
    install -Dm 0644 ${S}/systemd/${PN}.default ${D}${sysconfdir}/default/${PN}
}

SYSTEMD_DEFAULT_TARGET = "graphical.target"

RDEPENDS:${PN} += "\
    qtdeclarative-qmlplugins \
    qtgraphicaleffects-qmlplugins \
    qtquickcontrols2-qmlplugins \
    qtquickcontrols-qmlplugins \
    qtsvg \
    qtxmlpatterns-qmlplugins \
    ttf-roboto \
"
