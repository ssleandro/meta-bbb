include recipes-kernel/linux/linux-fslc.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

DEPENDS:append = " lzop-native"

SRCREV = "f5d73fd6e9f806fea129d0f26ca7c555d408ba09"
SRCBRANCH = "toradex_5.4.y"
LINUX_VERSION = "5.4.193"
SRC_URI = "\
    git://git.toradex.com/linux-toradex.git;protocol=https;branch=${SRCBRANCH} \
    file://0001-gpio-poweroff-Ignore-if-pm_power_off-is-already-defi.patch \
    file://0001-arm-imx-add-smp-support-for-imx7d.patch \
    file://defconfig \
    file://disable-logotux.cfg \
"

# Additional file deployed by recent mainline kernels
FILES:${KERNEL_PACKAGE_NAME}-base += "${nonarch_base_libdir}/modules/${KERNEL_VERSION}/modules.builtin.modinfo"

# This option is needed to load kernel devicetree overlays
EXTRA_OEMAKE += "DTC_FLAGS=-@ "

COMPATIBLE_MACHINE = "ambientte-imx7d-r1"
