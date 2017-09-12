require recipes-kernel/linux/linux-qoriq_4.1.bb

SRC_URI = "git://git@github.com/Abaco-Systems/linux-qoriq-abaco.git;branch=linux-qoriq-abaco-4.1;nobranch=1 \
    file://0003-use-static-inline-in-ARM-lifeboot.h.patch \
    file://fix-the-compile-issue-under-gcc6.patch \
    file://only-set-vmpic_msi_feature-if-CONFIG_EPAPR_PARAVIRT-.patch \
    file://powerpc-fsl-Fix-build-of-the-dtb-embedded-kernel-images.patch \
    file://CVE-2016-2053.patch \
    file://CVE-2016-0758.patch \
    file://powerpc-64e-Convert-cmpi-to-cmpwi-in-head_64.S.patch \
    file://powerpc-vdso64-Use-double-word-compare-on-pointers.patch \
"

PV = "4.1+git${SRCPV}"
SRCREV = "f881c16a75ea9c1ebe40168ea2613c87d4adca51"
