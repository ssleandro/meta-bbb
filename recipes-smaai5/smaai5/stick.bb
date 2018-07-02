require smaai5.inc

SRC_URI += "file://rules.d-90-stick.rules-Change-rule-to-use-with-Updat.patch"

SYSTEMD_AUTO_ENABLE = "disable"

RDEPENDS_${PN} += "util-linux-mount util-linux-umount"
