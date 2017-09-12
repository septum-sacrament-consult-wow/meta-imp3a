SUMMARY = "Abaco CPLD IRQ Controller Driver"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

inherit module qoriq_build_64bit_kernel

PV = "git+${SRCPV}"
SRCREV = "f6453e5715d6e16063001ea7ad2ec711dd15dae8"

S = "${WORKDIR}/git"

SRC_URI += "git://git@github.com/Abaco-Systems/haswell-cpld-intc-module.git"
