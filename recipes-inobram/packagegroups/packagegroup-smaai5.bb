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
    exhauster \
    heater \
    hooter \
    hour \
    inlet \
    inverter \
    lot \
    modbusfans \
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
    smaai5-display \
    statistic \
    stick \
    synchronizer \
    timer \
    updatebystick \
    watcher \
    web \
    \
    smaai5-udev-extraconf \
    smaai5-updatehub-device-attributes \
"
