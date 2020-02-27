SUMMARY = "The Swiss Army knife of Python web development"
DESCRIPTION = "\
Werkzeug started as simple collection of various utilities for WSGI \
applications and has become one of the most advanced WSGI utility modules. \
It includes a powerful debugger, full featured request and response objects, \
HTTP utilities to handle entity tags, cache control headers, HTTP dates, \
cookie handling, file uploads, a powerful URL routing system and a bunch \
of community contributed addon modules."
HOMEPAGE = "http://werkzeug.pocoo.org/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

SRC_URI[md5sum] = "bfa03955bdc885e8612493b5d2122e15"
SRC_URI[sha256sum] = "b353856d37dec59d6511359f97f6a4b2468442e454bd1c98298ddce53cac1f04"

PYPI_PACKAGE = "Werkzeug"

CLEANBROKEN = "1"

RDEPENDS_${PN} += " \
    ${PYTHON_PN}-datetime \
    ${PYTHON_PN}-difflib \
    ${PYTHON_PN}-email \
    ${PYTHON_PN}-html \
    ${PYTHON_PN}-io \
    ${PYTHON_PN}-json \
    ${PYTHON_PN}-netclient \
    ${PYTHON_PN}-netserver \
    ${PYTHON_PN}-numbers \
    ${PYTHON_PN}-pkgutil \
    ${PYTHON_PN}-pprint \
    ${PYTHON_PN}-simplejson \
    ${PYTHON_PN}-threading \
    ${PYTHON_PN}-unixadmin \
"
