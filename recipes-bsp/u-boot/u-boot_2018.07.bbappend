FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://0001-am335x_evm-uEnv.txt-bootz-n-fixes.patch \
    file://0002-U-Boot-BeagleBone-Cape-Manager.patch \
    file://0003-board-ti-am335x-Add-code-from-smaai-display.patch \
    file://0004-UpdateHub-Add-common-header.patch \
    file://0005-Add-UpdateHub-support-for-SMAAI5.patch \
"

UBOOT_LOCALVERSION = "inobram2"
