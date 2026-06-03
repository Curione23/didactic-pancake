package org.apache.commons.compress.archivers.arj;

/* JADX INFO: loaded from: classes2.dex */
final class MainHeader {
    long archiveSize;
    int archiverVersionNumber;
    int arjFlags;
    int arjFlags2;
    int arjProtectionFactor;
    java.lang.String comment;
    int dateTimeCreated;
    int dateTimeModified;
    int encryptionVersion;
    byte[] extendedHeaderBytes;
    int fileSpecPosition;
    int fileType;
    int hostOS;
    int lastChapter;
    int minVersionToExtract;
    java.lang.String name;
    int reserved;
    int securityEnvelopeFilePosition;
    int securityEnvelopeLength;
    int securityVersion;

    static final class Flags {
        static final int ALTNAME = 128;
        static final int ARJPROT = 8;
        static final int BACKUP = 32;
        static final int GARBLED = 1;
        static final int OLD_SECURED_NEW_ANSI_PAGE = 2;
        static final int PATHSYM = 16;
        static final int SECURED = 64;
        static final int VOLUME = 4;

        Flags() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static final class HostOS {
        static final int AMIGA = 3;
        static final int APPLE_GS = 6;
        static final int ATARI_ST = 7;
        static final int MAC_OS = 4;
        static final int MS_DOS = 0;
        static final int NeXT = 8;
        static final int OS2 = 5;
        static final int PRIMOS = 1;
        static final int UNIX = 2;
        static final int VAX_VMS = 9;
        static final int WIN32 = 11;
        static final int WIN95 = 10;

        HostOS() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    MainHeader() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MainHeader [archiverVersionNumber="
            r0.<init>(r1)
            int r1 = r3.archiverVersionNumber
            r0.append(r1)
            java.lang.String r1 = ", minVersionToExtract="
            r0.append(r1)
            int r1 = r3.minVersionToExtract
            r0.append(r1)
            java.lang.String r1 = ", hostOS="
            r0.append(r1)
            int r1 = r3.hostOS
            r0.append(r1)
            java.lang.String r1 = ", arjFlags="
            r0.append(r1)
            int r1 = r3.arjFlags
            r0.append(r1)
            java.lang.String r1 = ", securityVersion="
            r0.append(r1)
            int r1 = r3.securityVersion
            r0.append(r1)
            java.lang.String r1 = ", fileType="
            r0.append(r1)
            int r1 = r3.fileType
            r0.append(r1)
            java.lang.String r1 = ", reserved="
            r0.append(r1)
            int r1 = r3.reserved
            r0.append(r1)
            java.lang.String r1 = ", dateTimeCreated="
            r0.append(r1)
            int r1 = r3.dateTimeCreated
            r0.append(r1)
            java.lang.String r1 = ", dateTimeModified="
            r0.append(r1)
            int r1 = r3.dateTimeModified
            r0.append(r1)
            java.lang.String r1 = ", archiveSize="
            r0.append(r1)
            long r1 = r3.archiveSize
            r0.append(r1)
            java.lang.String r1 = ", securityEnvelopeFilePosition="
            r0.append(r1)
            int r1 = r3.securityEnvelopeFilePosition
            r0.append(r1)
            java.lang.String r1 = ", fileSpecPosition="
            r0.append(r1)
            int r1 = r3.fileSpecPosition
            r0.append(r1)
            java.lang.String r1 = ", securityEnvelopeLength="
            r0.append(r1)
            int r1 = r3.securityEnvelopeLength
            r0.append(r1)
            java.lang.String r1 = ", encryptionVersion="
            r0.append(r1)
            int r1 = r3.encryptionVersion
            r0.append(r1)
            java.lang.String r1 = ", lastChapter="
            r0.append(r1)
            int r1 = r3.lastChapter
            r0.append(r1)
            java.lang.String r1 = ", arjProtectionFactor="
            r0.append(r1)
            int r1 = r3.arjProtectionFactor
            r0.append(r1)
            java.lang.String r1 = ", arjFlags2="
            r0.append(r1)
            int r1 = r3.arjFlags2
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = ", comment="
            r0.append(r1)
            java.lang.String r1 = r3.comment
            r0.append(r1)
            java.lang.String r1 = ", extendedHeaderBytes="
            r0.append(r1)
            byte[] r1 = r3.extendedHeaderBytes
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
