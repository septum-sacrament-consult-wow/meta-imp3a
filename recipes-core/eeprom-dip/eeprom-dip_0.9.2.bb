DESCRIPTION = "Userspace application for I2C eeprom dip switch"
LICENSE = "GPLv2"
S = "${WORKDIR}/git"

#avoid GNU_HASH error in Bitbake
TARGET_CC_ARCH += "${LDFLAGS}"
RDEPENDS_${PN} = " man "
inherit manpages

LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=fcb02dc552a041dee27e4b85c7396067"

SRCREV = "e86a0fd3a20ae67c5613ffbaad827a3e01befe36"

SRC_URI = "git://git@towgit01/stever/eeprom-dip.git;protocol=ssh;branch=master \
           "

do_install() {
        install -d  ${D}${mandir}/man1/
        install -m 0644 ${S}/eeprom-dip.1 ${D}${mandir}/man1
        install -d  ${D}/${bindir}
	install -m 0755 ${S}/eeprom-dip   ${D}/${bindir}
        install -d  ${D}/etc
	install -m 0644 ${S}/sbc314-dip.conf ${D}/etc/abaco-dip.conf
}


FILES_${PN} = " ${bindir}/eeprom-dip /etc/abaco-dip.conf "
FILES_${PN}-doc = " ${mandir}/man1/eeprom-dip.1 "

