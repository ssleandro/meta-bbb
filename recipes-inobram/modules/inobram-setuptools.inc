LICENSE = "CLOSED"

SRCBRANCH ?= "master"
SRC_URI = "git://git@bitbucket.org/inobram/${BPN}.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"

inherit setuptools3 systemd

SYSTEMD_SERVICE_${PN} = "${PN}.service"

# Use a custom install function to allow recipes to modify the default behavior
inobram_install() {
    install -Dm 0644 ${S}/etc/${PN}.service ${D}${systemd_system_unitdir}/${PN}.service
    install -Dm 0644 ${S}/etc/${PN}-control.socket ${D}${systemd_system_unitdir}/${PN}-control.socket
}
do_install[postfuncs] += "inobram_install"

FILES_${PN} += "${systemd_system_unitdir}/${PN}-control.socket"

RDEPENDS_${PN} += "\
    python3-gevent \
    python3-redis \
"
