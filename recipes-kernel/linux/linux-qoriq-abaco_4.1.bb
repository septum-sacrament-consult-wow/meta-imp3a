require recipes-kernel/linux/linux-qoriq_4.1.bb

SRC_URI = "git://git@towgit01/linux/linux-qoriq-abaco.git;protocol=ssh;branch=linux-qoriq-abaco-4.1;nobranch=1"

PV = "4.1+git${SRCPV}"

SRCREV = "${AUTOREV}"

COMPATIBLE_MACHINE = "(sbc314-t1042|sbc314-t2081)"
