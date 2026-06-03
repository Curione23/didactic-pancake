package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
final class Folder {
    static final org.apache.commons.compress.archivers.sevenz.Folder[] EMPTY_FOLDER_ARRAY = null;
    org.apache.commons.compress.archivers.sevenz.BindPair[] bindPairs;
    org.apache.commons.compress.archivers.sevenz.Coder[] coders;
    long crc;
    boolean hasCrc;
    int numUnpackSubStreams;
    long[] packedStreams;
    long totalInputStreams;
    long totalOutputStreams;
    long[] unpackSizes;

    static {
            r0 = 0
            org.apache.commons.compress.archivers.sevenz.Folder[] r0 = new org.apache.commons.compress.archivers.sevenz.Folder[r0]
            org.apache.commons.compress.archivers.sevenz.Folder.EMPTY_FOLDER_ARRAY = r0
            return
    }

    Folder() {
            r0 = this;
            r0.<init>()
            return
    }

    int findBindPairForInStream(int r6) {
            r5 = this;
            org.apache.commons.compress.archivers.sevenz.BindPair[] r0 = r5.bindPairs
            if (r0 == 0) goto L17
            r0 = 0
        L5:
            org.apache.commons.compress.archivers.sevenz.BindPair[] r1 = r5.bindPairs
            int r2 = r1.length
            if (r0 >= r2) goto L17
            r1 = r1[r0]
            long r1 = r1.inIndex
            long r3 = (long) r6
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L14
            return r0
        L14:
            int r0 = r0 + 1
            goto L5
        L17:
            r6 = -1
            return r6
    }

    int findBindPairForOutStream(int r6) {
            r5 = this;
            org.apache.commons.compress.archivers.sevenz.BindPair[] r0 = r5.bindPairs
            if (r0 == 0) goto L17
            r0 = 0
        L5:
            org.apache.commons.compress.archivers.sevenz.BindPair[] r1 = r5.bindPairs
            int r2 = r1.length
            if (r0 >= r2) goto L17
            r1 = r1[r0]
            long r1 = r1.outIndex
            long r3 = (long) r6
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L14
            return r0
        L14:
            int r0 = r0 + 1
            goto L5
        L17:
            r6 = -1
            return r6
    }

    java.lang.Iterable<org.apache.commons.compress.archivers.sevenz.Coder> getOrderedCoders() throws java.io.IOException {
            r4 = this;
            long[] r0 = r4.packedStreams
            if (r0 == 0) goto L4a
            org.apache.commons.compress.archivers.sevenz.Coder[] r1 = r4.coders
            if (r1 == 0) goto L4a
            int r0 = r0.length
            if (r0 == 0) goto L4a
            int r0 = r1.length
            if (r0 != 0) goto Lf
            goto L4a
        Lf:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            long[] r1 = r4.packedStreams
            r2 = 0
            r2 = r1[r2]
            int r1 = (int) r2
        L1a:
            if (r1 < 0) goto L49
            org.apache.commons.compress.archivers.sevenz.Coder[] r2 = r4.coders
            int r3 = r2.length
            if (r1 >= r3) goto L49
            r2 = r2[r1]
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L41
            org.apache.commons.compress.archivers.sevenz.Coder[] r2 = r4.coders
            r2 = r2[r1]
            r0.addLast(r2)
            int r1 = r4.findBindPairForOutStream(r1)
            r2 = -1
            if (r1 == r2) goto L3f
            org.apache.commons.compress.archivers.sevenz.BindPair[] r2 = r4.bindPairs
            r1 = r2[r1]
            long r1 = r1.inIndex
            int r1 = (int) r1
            goto L1a
        L3f:
            r1 = r2
            goto L1a
        L41:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "folder uses the same coder more than once in coder chain"
            r0.<init>(r1)
            throw r0
        L49:
            return r0
        L4a:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    long getUnpackSize() {
            r5 = this;
            long r0 = r5.totalOutputStreams
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return r2
        L9:
            int r0 = (int) r0
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L1c
            int r1 = r5.findBindPairForOutStream(r0)
            if (r1 >= 0) goto L19
            long[] r1 = r5.unpackSizes
            r0 = r1[r0]
            return r0
        L19:
            int r0 = r0 + (-1)
            goto Lc
        L1c:
            return r2
    }

    long getUnpackSizeForCoder(org.apache.commons.compress.archivers.sevenz.Coder r4) {
            r3 = this;
            org.apache.commons.compress.archivers.sevenz.Coder[] r0 = r3.coders
            if (r0 == 0) goto L16
            r0 = 0
        L5:
            org.apache.commons.compress.archivers.sevenz.Coder[] r1 = r3.coders
            int r2 = r1.length
            if (r0 >= r2) goto L16
            r1 = r1[r0]
            if (r1 != r4) goto L13
            long[] r4 = r3.unpackSizes
            r0 = r4[r0]
            return r0
        L13:
            int r0 = r0 + 1
            goto L5
        L16:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Folder with "
            r0.<init>(r1)
            org.apache.commons.compress.archivers.sevenz.Coder[] r1 = r4.coders
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " coders, "
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r4.totalInputStreams
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " input streams, "
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r4.totalOutputStreams
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " output streams, "
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.compress.archivers.sevenz.BindPair[] r1 = r4.bindPairs
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " bind pairs, "
            java.lang.StringBuilder r0 = r0.append(r1)
            long[] r1 = r4.packedStreams
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " packed streams, "
            java.lang.StringBuilder r0 = r0.append(r1)
            long[] r1 = r4.unpackSizes
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " unpack sizes, "
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r4.hasCrc
            if (r1 == 0) goto L69
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "with CRC "
            r1.<init>(r2)
            long r2 = r4.crc
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L6b
        L69:
            java.lang.String r1 = "without CRC"
        L6b:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " and "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r4.numUnpackSubStreams
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " unpack streams"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
