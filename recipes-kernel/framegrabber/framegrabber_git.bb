SUMMARY = "Framegrabber kernel module"
DESCRIPTION = "Kernel module to load video frames captured from ARP cameras into memory"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"
PV = "1.0+git${SRCREV}"
PR = "r0"

inherit module

SRCREV = "6b3a71c1e5093d5d3a60bd34bf070fdd46768162"

SRC_URI = "git://github.com/Pelagicore/framegrabber.git;protocol=https;branch=master"

S = "${WORKDIR}/git"
