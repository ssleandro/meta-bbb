SUMMARY = "Ambientte device tree overlay for H-Board-Colibri"
LICENSE = "CLOSED"

SRC_URI = "file://h-board-nvd-imx7.dts"

inherit devicetree

RPROVIDES_${PN} += "kernel-devicetree-overlays"

COMPATIBLE_MACHINE = "ambientte-imx7d-r1"
