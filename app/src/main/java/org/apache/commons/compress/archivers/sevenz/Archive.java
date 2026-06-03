package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
final class Archive {
    org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] files;
    org.apache.commons.compress.archivers.sevenz.Folder[] folders;
    long[] packCrcs;
    java.util.BitSet packCrcsDefined;
    long packPos;
    long[] packSizes;
    org.apache.commons.compress.archivers.sevenz.StreamMap streamMap;
    org.apache.commons.compress.archivers.sevenz.SubStreamsInfo subStreamsInfo;

    Archive() {
            r1 = this;
            r1.<init>()
            r0 = 0
            long[] r0 = new long[r0]
            r1.packSizes = r0
            org.apache.commons.compress.archivers.sevenz.Folder[] r0 = org.apache.commons.compress.archivers.sevenz.Folder.EMPTY_FOLDER_ARRAY
            r1.folders = r0
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r0 = org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry.EMPTY_SEVEN_Z_ARCHIVE_ENTRY_ARRAY
            r1.files = r0
            return
    }

    private static java.lang.String lengthOf(long[] r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = "(null)"
            goto La
        L5:
            int r0 = r0.length
            java.lang.String r0 = java.lang.Integer.toString(r0)
        La:
            return r0
    }

    private static java.lang.String lengthOf(java.lang.Object[] r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = "(null)"
            goto La
        L5:
            int r0 = r0.length
            java.lang.String r0 = java.lang.Integer.toString(r0)
        La:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Archive with packed streams starting at offset "
            r0.<init>(r1)
            long r1 = r3.packPos
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            long[] r1 = r3.packSizes
            java.lang.String r1 = lengthOf(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " pack sizes, "
            java.lang.StringBuilder r0 = r0.append(r1)
            long[] r1 = r3.packCrcs
            java.lang.String r1 = lengthOf(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " CRCs, "
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.compress.archivers.sevenz.Folder[] r1 = r3.folders
            java.lang.String r1 = lengthOf(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " folders, "
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry[] r1 = r3.files
            java.lang.String r1 = lengthOf(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " files and "
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.compress.archivers.sevenz.StreamMap r1 = r3.streamMap
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
