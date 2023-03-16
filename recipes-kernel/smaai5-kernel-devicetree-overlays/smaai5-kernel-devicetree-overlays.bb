SUMMARY = "smaai5 device tree overlay"
LICENSE = "CLOSED"

SRC_URI = "\
    file://ADAFRUIT-SPI0-00A0.dts \
    file://BB-ADC-00A0.dts \
    file://BB-BONE-eMMC1-01-00A0.dts \
    file://BB-UART1-00A0.dts \
    file://BB-UART4-00A0.dts \
    file://univ-bbb-Exx-00A0.dts \
"

inherit devicetree

RPROVIDES:${PN} += "kernel-devicetree-overlays"

do_install() {
    for DTB_FILE in `ls *.dtb *.dtbo`; do
        install -Dm 0644 ${B}/${DTB_FILE} ${D}/lib/firmware/${DTB_FILE}
    done
}

FILES:${PN} = "/lib/firmware/"

COMPATIBLE_MACHINE = "smaai5-am335x"
