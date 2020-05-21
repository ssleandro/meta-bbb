DESCRIPTION = "repo - The Multiple Git Repository Tool"
HOMEPAGE = "https://gerrit.googlesource.com/git-repo/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI[sha256sum] = "0874383088cce5a1189adb2bc5611fd7eb64d53ad22cd57fe9c68f89634297c9"
SRC_URI = "https://github.com/GerritCodeReview/git-repo/archive/v${PV}.tar.gz"

S = "${WORKDIR}/git-repo-${PV}"

do_install() {
    install -Dm 0755 ${S}/repo ${D}${bindir}/repo
}

RDEPENDS_${PN} += "\
    git \
    gnupg \
    ${PYTHON_PN}-ctypes \
    ${PYTHON_PN}-datetime \
    ${PYTHON_PN}-fcntl \
    ${PYTHON_PN}-html \
    ${PYTHON_PN}-json \
    ${PYTHON_PN}-misc \
    ${PYTHON_PN}-mmap \
    ${PYTHON_PN}-multiprocessing \
    ${PYTHON_PN}-netclient \
    ${PYTHON_PN}-numbers \
    ${PYTHON_PN}-shell \
    ${PYTHON_PN}-threading \
    ${PYTHON_PN}-unixadmin \
    ${PYTHON_PN}-xml \
    ${PYTHON_PN}-xmlrpc \
"
