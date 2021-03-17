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
    airflow \
    alarm \
    ambientte-api \
    ambientte-display \
    batch \
    co2 \
    curtain \
    exhauster \
    heater \
    hooter \
    hour \
    humidifier \
    inlet \
    module4to20 \
    power-manager \
    probe \
    relay8r \
    settings \
    web-n-pro \
"
