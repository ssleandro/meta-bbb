LICENSE = "CLOSED"

SRCBRANCH ?= "master"
SRC_URI = "git://git@bitbucket.org/inobram/${BPN}.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"

inherit setuptools3 systemd

SYSTEMD_SERVICE_${PN} = "${PN}.service"

do_install_append() {
    install -Dm 0644 ${S}/etc/${PN}.service ${D}${systemd_system_unitdir}/${PN}.service
}

RDEPENDS_${PN} += "\
    python3-gevent \
    python3-redis \
"
