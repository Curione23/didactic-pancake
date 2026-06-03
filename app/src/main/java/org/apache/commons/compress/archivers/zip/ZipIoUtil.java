package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
class ZipIoUtil {
    private ZipIoUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static void writeFully(java.nio.channels.SeekableByteChannel r4, java.nio.ByteBuffer r5) throws java.io.IOException {
        L0:
            boolean r0 = r5.hasRemaining()
            if (r0 == 0) goto L3a
            int r0 = r5.remaining()
            int r1 = r4.write(r5)
            if (r1 <= 0) goto L11
            goto L0
        L11:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to fully write: channel="
            r2.<init>(r3)
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r2 = " length="
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = " written="
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L3a:
            return
    }

    static void writeFullyAt(java.nio.channels.FileChannel r2, java.nio.ByteBuffer r3, long r4) throws java.io.IOException {
        L0:
            boolean r0 = r3.hasRemaining()
            if (r0 == 0) goto L3c
            int r0 = r3.remaining()
            int r1 = r2.write(r3, r4)
            if (r1 <= 0) goto L13
            long r0 = (long) r1
            long r4 = r4 + r0
            goto L0
        L13:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to fully write: channel="
            r4.<init>(r5)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " length="
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r4 = " written="
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L3c:
            return
    }
}
