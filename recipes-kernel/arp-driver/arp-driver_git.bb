SUMMARY = "ARP driver kernel module"
DESCRIPTION = "Automotive Reference Platform Kernel module"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
PV = "1.0+git${SRCREV}"
PR = "r0"

inherit module

SRCREV = "68a414f9fcc73ec2ae5081e57de62cd24c91930a"

SRC_URI = "git://github.com/Pelagicore/arp-driver.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
