FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://cmd-updatehub-server-udev.rules-Change-device-match-.patch;patchdir=${S}/src/${GO_IMPORT}"

SRCREV = "b80d7705488cedb21706043c96db0544b0b242f6"
