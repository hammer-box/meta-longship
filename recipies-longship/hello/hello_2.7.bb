DESCRIPTION = "GNU Helloworld application" 
SECTION = "examples" 
LICENSE = "GPLv3+" 
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504" 
PR = "r0" 
SRC_URI = "${GNU_MIRROR}/hello/hello-${PV}.tar.gz" 
inherit autotools gettext 
