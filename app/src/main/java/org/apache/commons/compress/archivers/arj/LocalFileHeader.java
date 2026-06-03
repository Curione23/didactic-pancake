package org.apache.commons.compress.archivers.arj;

/* JADX INFO: loaded from: classes2.dex */
final class LocalFileHeader {
    int archiverVersionNumber;
    int arjFlags;
    java.lang.String comment;
    long compressedSize;
    int dateTimeAccessed;
    int dateTimeCreated;
    int dateTimeModified;
    int extendedFilePosition;
    byte[][] extendedHeaders;
    int fileAccessMode;
    int fileSpecPosition;
    int fileType;
    int firstChapter;
    int hostOS;
    int lastChapter;
    int method;
    int minVersionToExtract;
    java.lang.String name;
    long originalCrc32;
    long originalSize;
    int originalSizeEvenForVolumes;
    int reserved;

    static final class FileTypes {
        static final int BINARY = 0;
        static final int CHAPTER_LABEL = 5;
        static final int COMMENT_HEADER = 2;
        static final int DIRECTORY = 3;
        static final int SEVEN_BIT_TEXT = 1;
        static final int VOLUME_LABEL = 4;

        FileTypes() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static final class Flags {
        static final int BACKUP = 32;
        static final int EXTFILE = 8;
        static final int GARBLED = 1;
        static final int PATHSYM = 16;
        static final int VOLUME = 4;

        Flags() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static final class Methods {
        static final int COMPRESSED = 2;
        static final int COMPRESSED_FASTER = 3;
        static final int COMPRESSED_FASTEST = 4;
        static final int COMPRESSED_MOST = 1;
        static final int NO_DATA = 9;
        static final int NO_DATA_NO_CRC = 8;
        static final int STORED = 0;

        Methods() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    LocalFileHeader() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto Lae
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L13
            goto Lae
        L13:
            org.apache.commons.compress.archivers.arj.LocalFileHeader r7 = (org.apache.commons.compress.archivers.arj.LocalFileHeader) r7
            int r2 = r6.archiverVersionNumber
            int r3 = r7.archiverVersionNumber
            if (r2 != r3) goto Lac
            int r2 = r6.minVersionToExtract
            int r3 = r7.minVersionToExtract
            if (r2 != r3) goto Lac
            int r2 = r6.hostOS
            int r3 = r7.hostOS
            if (r2 != r3) goto Lac
            int r2 = r6.arjFlags
            int r3 = r7.arjFlags
            if (r2 != r3) goto Lac
            int r2 = r6.method
            int r3 = r7.method
            if (r2 != r3) goto Lac
            int r2 = r6.fileType
            int r3 = r7.fileType
            if (r2 != r3) goto Lac
            int r2 = r6.reserved
            int r3 = r7.reserved
            if (r2 != r3) goto Lac
            int r2 = r6.dateTimeModified
            int r3 = r7.dateTimeModified
            if (r2 != r3) goto Lac
            long r2 = r6.compressedSize
            long r4 = r7.compressedSize
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lac
            long r2 = r6.originalSize
            long r4 = r7.originalSize
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lac
            long r2 = r6.originalCrc32
            long r4 = r7.originalCrc32
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lac
            int r2 = r6.fileSpecPosition
            int r3 = r7.fileSpecPosition
            if (r2 != r3) goto Lac
            int r2 = r6.fileAccessMode
            int r3 = r7.fileAccessMode
            if (r2 != r3) goto Lac
            int r2 = r6.firstChapter
            int r3 = r7.firstChapter
            if (r2 != r3) goto Lac
            int r2 = r6.lastChapter
            int r3 = r7.lastChapter
            if (r2 != r3) goto Lac
            int r2 = r6.extendedFilePosition
            int r3 = r7.extendedFilePosition
            if (r2 != r3) goto Lac
            int r2 = r6.dateTimeAccessed
            int r3 = r7.dateTimeAccessed
            if (r2 != r3) goto Lac
            int r2 = r6.dateTimeCreated
            int r3 = r7.dateTimeCreated
            if (r2 != r3) goto Lac
            int r2 = r6.originalSizeEvenForVolumes
            int r3 = r7.originalSizeEvenForVolumes
            if (r2 != r3) goto Lac
            java.lang.String r2 = r6.name
            java.lang.String r3 = r7.name
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto Lac
            java.lang.String r2 = r6.comment
            java.lang.String r3 = r7.comment
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto Lac
            byte[][] r2 = r6.extendedHeaders
            byte[][] r7 = r7.extendedHeaders
            boolean r7 = java.util.Arrays.deepEquals(r2, r7)
            if (r7 == 0) goto Lac
            goto Lad
        Lac:
            r0 = r1
        Lad:
            return r0
        Lae:
            return r1
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.name
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LocalFileHeader [archiverVersionNumber="
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
            java.lang.String r1 = ", method="
            r0.append(r1)
            int r1 = r3.method
            r0.append(r1)
            java.lang.String r1 = ", fileType="
            r0.append(r1)
            int r1 = r3.fileType
            r0.append(r1)
            java.lang.String r1 = ", reserved="
            r0.append(r1)
            int r1 = r3.reserved
            r0.append(r1)
            java.lang.String r1 = ", dateTimeModified="
            r0.append(r1)
            int r1 = r3.dateTimeModified
            r0.append(r1)
            java.lang.String r1 = ", compressedSize="
            r0.append(r1)
            long r1 = r3.compressedSize
            r0.append(r1)
            java.lang.String r1 = ", originalSize="
            r0.append(r1)
            long r1 = r3.originalSize
            r0.append(r1)
            java.lang.String r1 = ", originalCrc32="
            r0.append(r1)
            long r1 = r3.originalCrc32
            r0.append(r1)
            java.lang.String r1 = ", fileSpecPosition="
            r0.append(r1)
            int r1 = r3.fileSpecPosition
            r0.append(r1)
            java.lang.String r1 = ", fileAccessMode="
            r0.append(r1)
            int r1 = r3.fileAccessMode
            r0.append(r1)
            java.lang.String r1 = ", firstChapter="
            r0.append(r1)
            int r1 = r3.firstChapter
            r0.append(r1)
            java.lang.String r1 = ", lastChapter="
            r0.append(r1)
            int r1 = r3.lastChapter
            r0.append(r1)
            java.lang.String r1 = ", extendedFilePosition="
            r0.append(r1)
            int r1 = r3.extendedFilePosition
            r0.append(r1)
            java.lang.String r1 = ", dateTimeAccessed="
            r0.append(r1)
            int r1 = r3.dateTimeAccessed
            r0.append(r1)
            java.lang.String r1 = ", dateTimeCreated="
            r0.append(r1)
            int r1 = r3.dateTimeCreated
            r0.append(r1)
            java.lang.String r1 = ", originalSizeEvenForVolumes="
            r0.append(r1)
            int r1 = r3.originalSizeEvenForVolumes
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = ", comment="
            r0.append(r1)
            java.lang.String r1 = r3.comment
            r0.append(r1)
            java.lang.String r1 = ", extendedHeaders="
            r0.append(r1)
            byte[][] r1 = r3.extendedHeaders
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
