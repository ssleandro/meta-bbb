FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://cmd-updatehub-server-udev.rules-Change-device-match-.patch;patchdir=${S}/src/${GO_IMPORT}"
