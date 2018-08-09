FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://systemd-udevd-re-enable-mount-propagation-for-udevd.patch"

PACKAGECONFIG_remove = " \
    backlight \
    hibernate \
    ima \
    networkd \
    quotacheck \
    resolved \
    smack \
    xz \
"
