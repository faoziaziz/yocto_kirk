SUMMARY = "QT Example Recipe"
LICENSE = "CLOSED"

SRC_URI = "file://qtexample.pro \
           file://qtexample.cpp \
           file://mainwindow.cpp \
           file://mainwindow.h \
           "

DEPENDS += "qtbase qtwayland"
RDEPENDS_${PN} += "qtwayland"

S = "${WORKDIR}"

do_install:append() {
    install -d ${D}${bindir}
    install -m 0755 qtexample ${D}${bindir}
}



inherit qmake5
