FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

inherit kernel-yocto

SRC_URI += "file://consistent_size.cfg"
