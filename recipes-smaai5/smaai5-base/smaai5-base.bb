SUMMARY = "Base configuration for SMAAI5"

LICENSE = "CLOSED"

DEPENDS = "connman"

SRC_URI = "file://journald-size.conf"

inherit useradd

USERADD_PACKAGES =  "${PN}"
USERADD_PARAM_${PN} = "-p '*' -G adm,dialout,sudo,plugdev,users,netdev,input inobram"

do_install () {
    install -Dm 0644 ${WORKDIR}/journald-size.conf ${D}${sysconfdir}/systemd/journald.conf.d/size.conf
}

RDEPENDS_${PN} += " \
    connman \
    procps \
    tzdata \
    zram-init \
"

ALLOW_EMPTY_${PN} = "1"
