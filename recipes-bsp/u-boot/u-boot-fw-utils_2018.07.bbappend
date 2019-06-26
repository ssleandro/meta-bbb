FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://fw_env.config \
"

UBOOT_MACHINE = ""
UBOOT_CONFIG = "emmc"

do_install_append () {
    # Install file fw_env.config from workdir with customer customizations
    install -m 0644 ${WORKDIR}/fw_env.config ${D}${sysconfdir}/fw_env.config
}
