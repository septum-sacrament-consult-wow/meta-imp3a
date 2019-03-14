SUMMARY = "Abaco CPLD IRQ Controller Driver"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module qoriq_build_64bit_kernel

PV = "git+${SRCPV}"
SRCREV = "47ceeb73925958455b16180bfa65b6614de0f5c1"

S = "${WORKDIR}/git"

SRC_URI += "https://github.com/Abaco-Systems/haswell-cpld-intc-module.git"
