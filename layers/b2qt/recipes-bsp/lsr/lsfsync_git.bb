# Copyright (C) 2019 Luxoft Sweden AB
# Released under the MIT license (see LICENSE for the terms)

DESCRIPTION = "Sends alive signals to LSR on ARP"
LICENSE = "MPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"

inherit systemd

S = "${WORKDIR}/git"

PV = "1.0.0-git-${SRCPV}"
RDEPENDS_${PN} = "pcie-debug python3"

SRC_URI = "\
    git://git@github.com/pelagicore/lsfsync.git;protocol=https\
    file://lsfsync.service\
"
SRCREV = "fc6edbf9829c79a62c80e88490d9ba0b3e9e1ce5"

SYSTEMD_SERVICE_${PN} = "lsfsync.service"

do_install() {
    install -Dm 0755 ${S}/sfsync.py ${D}${bindir}/lsfsync
    install -Dm 0644 ${WORKDIR}/lsfsync.service ${D}${systemd_unitdir}/system/lsfsync.service
}
