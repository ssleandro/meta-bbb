FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://zram_swap.service \
"

do_install:append () {
    install -Dm 0644 ${WORKDIR}/zram_swap.service ${D}${systemd_unitdir}/system/zram_swap.service
}
