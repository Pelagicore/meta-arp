
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

ACRN_PLATFORM = "uefi"

SRC_URI += "\
    file://arp.config \
    "

do_configure_prepend() {
    cd ${S}/arch/x86/configs/
    cp ${WORKDIR}/arp.config ${MACHINE}.config
}

RELEASE="0"
