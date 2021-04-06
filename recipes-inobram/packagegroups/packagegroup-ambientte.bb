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
    networkmanager-nmcli \
"

RDEPENDS_packagegroup-ambientte-modules = "\
    actuators \
    airflow \
    alarm \
    ambientte-api \
    ambientte-display \
    batch \
    co2 \
    curtain \
    device-manager \
    exhauster \
    flush \
    heater \
    hooter \
    hour \
    humidifier \
    inlet \
    module4to20 \
    power-manager \
    probe \
    relay8r \
    rtc \
    settings \
    timer \
    tunneldoor \
    web-n-pro \
"
