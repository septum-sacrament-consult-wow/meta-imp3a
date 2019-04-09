SUMMARY = "Abaco CPLD GPIO Driver"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module qoriq_build_64bit_kernel

PV = "git+${SRCPV}"
SRCREV = "bcc03f5ef27caf677c708e8a945ac8ee82099ea3"

S = "${WORKDIR}/git"

SRC_URI += "git://github.com/Abaco-Systems/haswell-cpld-gpio-module.git"