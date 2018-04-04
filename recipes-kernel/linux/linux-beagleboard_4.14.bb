DESCRIPTION = "Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel siteinfo

S = "${WORKDIR}/git"

PV = "4.14.31-ti-r41+git${SRCPV}"

SRCBRANCH = "4.14"
SRCREV = "67d74832ccd3b57d3bf7bab90babcb8e3f926ee4"
SRC_URI = " \
    git://github.com/beagleboard/linux.git;branch=${SRCBRANCH} \
    file://defconfig \
"
