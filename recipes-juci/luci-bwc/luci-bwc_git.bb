# Copyright (C) 2016 Khem Raj <raj.khem@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "This package provides the binary luci-bwc utility for juci"

HOMEPAGE = "https://github.com/mkschreder/luci-bwc"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://luci-bwc.c;beginline=1;endline=17;md5=d948e459c944d4cad8d53ae1f33781d2"
SECTION = "apps"

SRCREV = "105d5b36ce5c3e75891c30cd67722372bce997ab"
SRC_URI = "git://github.com/mkschreder/luci-bwc"

S = "${WORKDIR}/git"

do_install() {
	install -Dm 0755 ${B}/luci-bwc ${D}${bindir}/luci-bwc
}

RDEPENDS_${PN} += "iwinfo"

