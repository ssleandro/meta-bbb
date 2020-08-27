SUMMARY = "Inobram Package Group"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PROVIDES = "${PACKAGES}"

PACKAGES = "\
    packagegroup-ambientte \
    packagegroup-ambientte-modules \
"

RDEPENDS_packagegroup-ambientte = "\
    networkmanager \
"

RDEPENDS_packagegroup-ambientte-modules = "\
    alarm \
    ambientte-display \
    api-display \
    batch \
    co2 \
    heater \
    hour \
    hooter \
    humidifier \
    probe \
    relay8r \
    settings \
"
