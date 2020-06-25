HOMEPAGE = "https://bitbucket.org/inobram/uboot"
SECTION = "bootloaders"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=30503fd321432fc713238f582193b78e"

DEPENDS += "flex-native bison-native"

SRCREV = "992a006de77e8e77009446c85db02dc53ded3110"
SRCBRANCH = "2020.07+inobram"
SRC_URI = "git://git@bitbucket.org/inobram/uboot.git;branch=${SRCBRANCH};protocol=ssh"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"
do_configure[cleandirs] = "${B}"

UBOOT_LOCALVERSION = "inobram3"
