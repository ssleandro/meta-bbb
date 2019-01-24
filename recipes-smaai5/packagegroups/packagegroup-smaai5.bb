SUMMARY = "SMAAI5 Package Group"
LICENSE = "CLOSED"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} += " \
    adc \
    airflow \
    alarm \
    buzzer \
    co2 \
    curtain \
    disarm \
    display \
    exhauster \
    heater \
    hooter \
    hour \
    inlet \
    inverter \
    lot \
    modbus \
    nebulizer \
    ngrok \
    poweroff \
    probe \
    reading \
    redis \
    relay \
    report-alarm \
    rtc \
    scale \
    sensation \
    setting \
    statistic \
    stick \
    synchronizer \
    timer \
    updatebystick \
    watchdog \
    watcher \
    web \
    \
    smaai5-udev-extraconf \
    smaai5-updatehub-device-attributes \
"
