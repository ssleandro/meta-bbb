SUMMARY = "Ambientte Qt5 Display"
LICENSE = "CLOSED"

DEPENDS = "qtbase qtquickcontrols2"

SRCREV = "8e4959bda4c91879c04cbaa730f2b9aaa08d835a"
SRCBRANCH = "wip/yocto"
SRC_URI = "git://git@bitbucket.org/inobram/display_qt.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"

inherit qmake5 systemd

SYSTEMD_SERVICE_${PN} = "${PN}.service"

do_install() {
    install -Dm 0755 ${B}/display_QT ${D}${bindir}/${PN}
    install -Dm 0644 ${S}/systemd/${PN}.service ${D}${systemd_system_unitdir}/${PN}.service
    install -Dm 0644 ${S}/systemd/${PN}.default ${D}${sysconfdir}/default/${PN}
}

RDEPENDS_${PN} += "\
    qtdeclarative-qmlplugins \
    qtgraphicaleffects-qmlplugins \
    qtquickcontrols2-qmlplugins \
    qtquickcontrols-qmlplugins \
    ttf-roboto \
"
