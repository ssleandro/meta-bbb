FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://cmd-updatehub-server-udev.rules-Change-device-match-.patch;patchdir=${S}/src/${GO_IMPORT}"

SRCREV = "15224018ab7c2c7cf0ee532e54694222e80da789"
