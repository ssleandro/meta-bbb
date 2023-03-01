DESCRIPTION = "Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

DEPENDS += "lzop-native bc-native"

inherit kernel kernel-yocto

S = "${WORKDIR}/git"

LINUX_VERSION = "4.14.108-ti-r136"
KBRANCH = "${LINUX_VERSION}"
PV = "${LINUX_VERSION}+git${SRCPV}"

SRC_URI = "git://github.com/beagleboard/linux.git;nobranch=1;tag=${LINUX_VERSION};protocol=https"

KCONFIG_MODE="--alldefconfig"

COMPATIBLE_MACHINE = "smaai5-am335x"
