DESCRIPTION = "python-nmap is a python library which helps in using nmap port scanner"
HOMEPAGE = "https://xael.org/pages/python-nmap-en.html"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://gpl-3.0.txt;md5=d32239bcb673463ab874e80d47fae504"

inherit pypi setuptools3

PYPI_PACKAGE = "python-nmap"

SRC_URI[md5sum] = "2795bfcbc05cbbbccfcf4df59facaab1"
SRC_URI[sha256sum] = "80ba0eb10a52283a54a633f40b5baa9c2ff08675d6621dd089ead942852f5bd3"

RDEPENDS_${PN} += "${PYTHON_PN}-xml nmap"
