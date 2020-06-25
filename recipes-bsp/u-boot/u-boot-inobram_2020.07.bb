require ${PN}-common.inc
require recipes-bsp/u-boot/u-boot.inc

DEPENDS += "bc-native dtc-native"

SRC_URI += "\
   file://fw_env.config \
"
