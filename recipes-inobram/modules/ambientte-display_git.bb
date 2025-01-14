SUMMARY = "Ambientte Qt5 Display"
LICENSE = "CLOSED"

DEPENDS = "qtbase qtxmlpatterns qtquickcontrols2"

SRCBRANCH = "master"
SRC_URI = "git://git@bitbucket.org/inobram/display_qt.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"

inherit qmake5 systemd

SYSTEMD_SERVICE:${PN} = "${PN}.service"

do_install() {
    install -Dm 0755 ${B}/display_QT ${D}${bindir}/${PN}
    install -Dm 0644 ${S}/systemd/${PN}.service ${D}${systemd_system_unitdir}/${PN}.service
    install -Dm 0644 ${S}/systemd/${PN}.default ${D}${sysconfdir}/default/${PN}
}

RDEPENDS:${PN} += "\
    qtdeclarative-qmlplugins \
    qtgraphicaleffects-qmlplugins \
    qtquickcontrols2-qmlplugins \
    qtquickcontrols-qmlplugins \
    qtsvg \
    qtxmlpatterns-qmlplugins \
    ttf-roboto \
"
