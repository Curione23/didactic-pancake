package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
final class StreamMap {
    final int[] fileFolderIndex;
    final int[] folderFirstFileIndex;
    final int[] folderFirstPackStreamIndex;
    final long[] packStreamOffsets;

    StreamMap(int[] r1, long[] r2, int[] r3, int[] r4) {
            r0 = this;
            r0.<init>()
            r0.folderFirstPackStreamIndex = r1
            r0.packStreamOffsets = r2
            r0.folderFirstFileIndex = r3
            r0.fileFolderIndex = r4
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StreamMap with indices of "
            r0.<init>(r1)
            int[] r1 = r2.folderFirstPackStreamIndex
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " folders, offsets of "
            java.lang.StringBuilder r0 = r0.append(r1)
            long[] r1 = r2.packStreamOffsets
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " packed streams, first files of "
            java.lang.StringBuilder r0 = r0.append(r1)
            int[] r1 = r2.folderFirstFileIndex
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " folders and folder indices for "
            java.lang.StringBuilder r0 = r0.append(r1)
            int[] r1 = r2.fileFolderIndex
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " files"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
