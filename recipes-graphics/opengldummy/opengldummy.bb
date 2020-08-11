############################################################################
##
## Copyright (C) 2016 The Qt Company Ltd.
## Contact: https://www.qt.io/licensing/
##
## This file is part of the Boot to Qt meta layer.
##
## $QT_BEGIN_LICENSE:GPL$
## Commercial License Usage
## Licensees holding valid commercial Qt licenses may use this file in
## accordance with the commercial license agreement provided with the
## Software or, alternatively, in accordance with the terms contained in
## a written agreement between you and The Qt Company. For licensing terms
## and conditions see https://www.qt.io/terms-conditions. For further
## information use the contact form at https://www.qt.io/contact-us.
##
## GNU General Public License Usage
## Alternatively, this file may be used under the terms of the GNU
## General Public License version 3 or (at your option) any later version
## approved by the KDE Free Qt Foundation. The licenses are as published by
## the Free Software Foundation and appearing in the file LICENSE.GPL3
## included in the packaging of this file. Please review the following
## information to ensure the GNU General Public License requirements will
## be met: https://www.gnu.org/licenses/gpl-3.0.html.
##
## $QT_END_LICENSE$
##
############################################################################

DESCRIPTION = "OpenGL dummy library provides headers and a dummy library for EGL/GLES"
SECTION = "devel"
LICENSE = "The-Qt-Company-Commercial"
LIC_FILES_CHKSUM = "file://${BOOT2QTBASE}/licenses/The-Qt-Company-Commercial;md5=c8b6dd132d52c6e5a545df07a4e3e283"

PV = "1.0.0"

require opengldummy.inc

do_compile() {
    ${CC} ${LDFLAGS} -DQGS_BUILD_CLIENT_DLL -fPIC -shared -Wl,-soname,libEGL.so.1 -I${WORKDIR}/headers -o libEGL.so.1 ${WORKDIR}/egl.cpp
    ${CC} ${LDFLAGS} -DQGS_BUILD_CLIENT_DLL -fPIC -shared -Wl,-soname,libGLESv2.so.2 -I${WORKDIR}/headers -o libGLESv2.so.2 ${WORKDIR}/gles2.cpp
}

do_install_append() {
    install -m 0755 -d ${D}${libdir}
    install -m 0755 ${S}/libEGL.so.1 ${D}${libdir}
    ln -s libEGL.so.1 ${D}${libdir}/libEGL.so
    install -m 0755 ${S}/libGLESv2.so.2 ${D}${libdir}
    ln -s libGLESv2.so.2 ${D}${libdir}/libGLESv2.so
}
