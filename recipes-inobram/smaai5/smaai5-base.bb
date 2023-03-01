SUMMARY = "Base configuration for SMAAI5"

LICENSE = "CLOSED"

DEPENDS = "connman"

SRC_URI = " \
    file://systemd-udevd.service \
"

inherit useradd

USERADD_PACKAGES =  "${PN}"
USERADD_PARAM:${PN} = "-p '*' -G adm,dialout,sudo,plugdev,users,input inobram"

do_install() {
    install -Dm 0644 ${WORKDIR}/systemd-udevd.service ${D}${sysconfdir}/systemd/system/systemd-udevd.service
}

ALLOW_EMPTY:${PN} = "1"
