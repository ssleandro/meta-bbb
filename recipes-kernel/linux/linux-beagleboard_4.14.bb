DESCRIPTION = "Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel siteinfo

S = "${WORKDIR}/git"

PV = "4.14.61-ti-r68+git${SRCPV}"

SRCBRANCH = "4.14"
SRCREV = "578ad77d95821bcba8c3df2503b5bd001b014d43"
SRC_URI = " \
    git://github.com/beagleboard/linux.git;branch=${SRCBRANCH} \
    file://defconfig \
"
