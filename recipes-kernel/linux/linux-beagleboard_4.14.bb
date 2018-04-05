DESCRIPTION = "Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel siteinfo

S = "${WORKDIR}/git"

PV = "4.14.32-ti-r42+git${SRCPV}"

SRCBRANCH = "4.14"
SRCREV = "5402f1399ad3aa0054cb339db198ef901bb95c62"
SRC_URI = " \
    git://github.com/beagleboard/linux.git;branch=${SRCBRANCH} \
    file://defconfig \
"
