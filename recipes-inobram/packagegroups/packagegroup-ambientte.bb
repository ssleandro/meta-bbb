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
    inobramlibs \
    module4to20 \
    ngrok \
    power-manager \
    probe \
    product-manager \
    reading \
    relay8r \
    rtc \
    services-supervisor \
    settings \
    statistic \
    timer \
    tunneldoor \
    update-manager \
    usb-manager \
    watcher \
    web-n-pro \
"
