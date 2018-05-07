SUMMARY = "UpdateHub's agent SDK for Python"
HOMEPAGE = "https://github.com/updatehub/agent-sdk-python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7633ba33f5204fb84beee30de6121e7"

DEPENDS = "${PYTHON_PN}-setuptools"

inherit pypi

SRC_URI[md5sum] = "9ed99c6eb0747741a5612fdb53f5e386"
SRC_URI[sha256sum] = "ae4320b3aab8e328fe1e510cc174b5885c8c025ed643aaaa4cc732e3b364fe68"

RDEPENDS_${PN} += " \
    ${PYTHON_PN}-io \
    ${PYTHON_PN}-threading \
    updatehub-sdk-statechange-trigger \
"
