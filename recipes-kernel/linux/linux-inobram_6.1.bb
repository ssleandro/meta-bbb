DESCRIPTION = "Linux kernel"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

DEPENDS += "lzop-native bc-native"

inherit kernel kernel-yocto

KBUILD_DEFCONFIG = "multi_v7_defconfig"

PV = "${LINUX_VERSION}+git${SRCPV}"

SRCBRANCH = "linux-6.1.y"
SRCREV="7eaef76fbc4621ced374c85dbc000dd80dc681d7"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;branch=${SRCBRANCH};protocol=https \
    file://smaai5-fragment.cfg \
"

S = "${WORKDIR}/git"

LINUX_VERSION = "6.1.20"

# FIXME: When the u-boot and updatehub is updated
do_install:append() {
    install -Dm 0644 ${WORKDIR}/build/arch/arm/boot/dts/am335x-boneblack.dtb ${D}/boot/am335x-boneblack-uboot.dtb
}

KCONFIG_MODE="--alldefconfig"

export DTC_FLAGS = "-@"

COMPATIBLE_MACHINE = "smaai5-am335x"
