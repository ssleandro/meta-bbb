FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-updatehub-server-Remove-mount-command-from-udev-rule.patch;patchdir=${S}/src/${GO_IMPORT}"
