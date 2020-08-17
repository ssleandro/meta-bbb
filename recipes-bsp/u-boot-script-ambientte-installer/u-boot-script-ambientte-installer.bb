LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

DEPENDS = "u-boot-mkimage-native"

inherit deploy

do_generate_bootscript() {
    cat > ${B}/boot.cmd <<EOF
setenv bootargs ''

load mmc \${devnum}:2 \${kernel_addr_r} /boot/${KERNEL_IMAGETYPE}
load mmc \${devnum}:2 \${fdt_addr_r} /boot/${KERNEL_DEVICETREE}
fdt addr \${fdt_addr_r} && fdt resize 0x20000 && \
load mmc \${devnum}:2 \${loadaddr} ${KERNEL_DEVICETREE_OVERLAY_PATH}/${KERNEL_DEVICETREE_OVERLAY} && \
fdt apply \${loadaddr}
part uuid mmc \${devnum}:2 uuid

setenv bootargs "console=\${console},\${baudrate} root=PARTUUID=\${uuid} rootwait rw fsck.mode=force fsck.repair=yes"
bootz \${kernel_addr_r} - \${fdt_addr_r}
EOF
}
do_generate_bootscript[dirs] = "${B}"

addtask generate_bootscript after do_configure before do_mkimage

do_mkimage() {
    uboot-mkimage -A arm -O linux -T script -C none -a 0 -e 0 \
                  -n "boot-installer.script" -d ${B}/boot.cmd ${B}/boot-installer.scr
}
do_mkimage[dirs] = "${B}"

addtask mkimage after do_generate_bootscript before do_install

do_install() {
    install -Dm 0644 ${B}/boot-installer.scr ${D}/boot-installer.scr
}

do_deploy() {
    install -Dm 0644 ${D}/boot-installer.scr ${DEPLOYDIR}/boot-installer.scr-${MACHINE}-${PV}-${PR}
    cd ${DEPLOYDIR}
    rm -f boot-installer.scr-${MACHINE}
    ln -sf boot-installer.scr-${MACHINE}-${PV}-${PR} boot-installer.scr-${MACHINE}
}

addtask deploy after do_install before do_build

FILES_${PN} += "/"

PACKAGE_ARCH = "${MACHINE_ARCH}"

COMPATIBLE_MACHINE = "ambientte-imx7d-r1"
