FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://zram_swap.service \
    file://zram_tmp.service \
"

do_install_append () {
    install -Dm 0644 ${WORKDIR}/zram_swap.service ${D}${systemd_unitdir}/system/zram_swap.service
    install -Dm 0644 ${WORKDIR}/zram_tmp.service ${D}${systemd_unitdir}/system/zram_tmp.service
}