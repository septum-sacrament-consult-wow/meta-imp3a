DESCRIPTION = "Userspace application for I2C eeprom dip switch"
LICENSE = "GPLv2"
S = "${WORKDIR}/git"

#avoid GNU_HASH error in Bitbake
TARGET_CC_ARCH += "${LDFLAGS}"
RDEPENDS_${PN} = " man "
inherit manpages

LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=fcb02dc552a041dee27e4b85c7396067"

SRCREV = "d858f6752448aae74f4410b05c80a31816ccdbf5"

SRC_URI = "https://github.com/Abaco-Systems/eeprom-dip.git;branch=master \
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

