SUMMARY = "Inobram Package Group"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PROVIDES = "${PACKAGES}"

PACKAGES = "\
    packagegroup-ambientte \
    packagegroup-ambientte-modules \
"

RDEPENDS:packagegroup-ambientte = "\
    networkmanager-nmcli \
"

RDEPENDS:packagegroup-ambientte-modules = "\
    actuators \
    airflow \
    alarm \
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
    inobramlibs \
    interface-api \
    module4to20 \
    power-manager \
    probe \
    product-manager \
    reading \
    relay8r \
    scale \
    services-supervisor \
    settings \
    statistic \
    timer \
    tunneldoor \
    update-manager \
    usb-manager \
    watcher \
    web \
"
