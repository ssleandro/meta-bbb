include recipes-kernel/linux/linux-fslc.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SRCREV = "c0969469ee07b570b054df2d47a787f2732a362a"
SRCBRANCH = "toradex_5.4.y"
LINUX_VERSION = "5.4.54"
SRC_URI = "\
    git://git.toradex.com/linux-toradex.git;protocol=https;branch=${SRCBRANCH} \
    file://defconfig \
"

# Additional file deployed by recent mainline kernels
FILES_${KERNEL_PACKAGE_NAME}-base += "${nonarch_base_libdir}/modules/${KERNEL_VERSION}/modules.builtin.modinfo"

# This option is needed to load kernel devicetree overlays
EXTRA_OEMAKE += "DTC_FLAGS=-@ "

COMPATIBLE_MACHINE = "ambientte-imx7d-r1"
