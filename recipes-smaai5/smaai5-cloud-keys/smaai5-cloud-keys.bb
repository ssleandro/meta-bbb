DESCRIPTION = "Generate SMAAI5 cloud keys"
LICENSE = "CLOSED"

SRC_URI = " \
    file://smaai5-generate-cloud-keys \
    file://smaai5-generate-cloud-keys.service \
"

inherit systemd

do_configure[noexec] = "1"
do_compile[noexec] = "1"

SYSTEMD_SERVICE_${PN} = "smaai5-generate-cloud-keys.service"

do_install() {
    install -Dm 0755 ${WORKDIR}/smaai5-generate-cloud-keys ${D}${bindir}/smaai5-generate-cloud-keys
    install -Dm 0644 ${WORKDIR}/smaai5-generate-cloud-keys.service ${D}${systemd_unitdir}/system/smaai5-generate-cloud-keys.service
}

RDEPENDS_${PN} += "openssl"
