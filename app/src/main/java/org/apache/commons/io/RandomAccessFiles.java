package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public class RandomAccessFiles {
    public static /* synthetic */ int $r8$lambda$fCVYdj23SqCdcsyWj6BY79RXmVQ(java.io.RandomAccessFile r0, byte[] r1, int r2, int r3) {
            int r0 = r0.read(r1, r2, r3)
            return r0
    }

    @java.lang.Deprecated
    public RandomAccessFiles() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean contentEquals(java.io.RandomAccessFile r8, java.io.RandomAccessFile r9) throws java.io.IOException {
            boolean r0 = java.util.Objects.equals(r8, r9)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            long r2 = length(r8)
            long r4 = length(r9)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L16
            r8 = 0
            return r8
        L16:
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L21
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L21
            return r1
        L21:
            java.nio.channels.FileChannel r8 = r8.getChannel()
            java.nio.channels.FileChannel r9 = r9.getChannel()
            r0 = 8192(0x2000, float:1.148E-41)
            boolean r8 = org.apache.commons.io.channels.FileChannels.contentEquals(r8, r9, r0)
            return r8
    }

    private static long length(java.io.RandomAccessFile r2) throws java.io.IOException {
            if (r2 == 0) goto L7
            long r0 = r2.length()
            goto L9
        L7:
            r0 = 0
        L9:
            return r0
    }

    public static byte[] read(java.io.RandomAccessFile r0, long r1, int r3) throws java.io.IOException {
            r0.seek(r1)
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.RandomAccessFiles$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.RandomAccessFiles$$ExternalSyntheticLambda0
            r1.<init>(r0)
            byte[] r0 = org.apache.commons.io.IOUtils.toByteArray(r1, r3)
            return r0
    }

    public static java.io.RandomAccessFile reset(java.io.RandomAccessFile r2) throws java.io.IOException {
            r0 = 0
            r2.seek(r0)
            return r2
    }
}
