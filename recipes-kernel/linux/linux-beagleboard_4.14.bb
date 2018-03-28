DESCRIPTION = "Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel siteinfo

S = "${WORKDIR}/git"

PV = "4.14.29-ti-r40+git${SRCPV}"

SRCBRANCH = "4.14"
SRCREV = "31c152f3e2f29fc5a6628ac57c5a54613925ff72"
SRC_URI = " \
    git://github.com/beagleboard/linux.git;branch=${SRCBRANCH} \
    file://defconfig \
"
