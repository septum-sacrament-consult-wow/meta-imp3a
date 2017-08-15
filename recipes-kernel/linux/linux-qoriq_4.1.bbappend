SRC_URI = "git://git@towgit01/mitchellj/linux.git;branch=qoriq-sdk-2.0-abaco;protocol=ssh;nobranch=1 \
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
SRCREV = " 14d39e736363e89a62c4a760c50b658801e9640f"
