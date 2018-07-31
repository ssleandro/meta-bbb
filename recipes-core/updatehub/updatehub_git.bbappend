FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://217.patch;patchdir=${S}/src/${GO_IMPORT}"
