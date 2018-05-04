SUMMARY = "UpdateHub's agent SDK for Python"
HOMEPAGE = "https://github.com/updatehub/agent-sdk-python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

DEPENDS = "${PYTHON_PN}-setuptools"

inherit pypi

SRC_URI[md5sum] = "bf6457a1b7a1277fd03bc86a7cbca59d"
SRC_URI[sha256sum] = "8f60db1728f13d2d5b51747ca59d300fae27a58e398573ea741a2d575f694387"

RDEPENDS_${PN} += " \
    ${PYTHON_PN}-io \
    ${PYTHON_PN}-threading \
    updatehub-sdk-statechange-trigger \
"
