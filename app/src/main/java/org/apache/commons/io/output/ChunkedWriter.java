package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class ChunkedWriter extends java.io.FilterWriter {
    private static final int DEFAULT_CHUNK_SIZE = 8192;
    private final int chunkSize;

    public ChunkedWriter(java.io.Writer r2) {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0)
            return
    }

    public ChunkedWriter(java.io.Writer r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 <= 0) goto L8
            r0.chunkSize = r2
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
        L0:
            if (r5 <= 0) goto L10
            int r0 = r2.chunkSize
            int r0 = java.lang.Math.min(r5, r0)
            java.io.Writer r1 = r2.out
            r1.write(r3, r4, r0)
            int r5 = r5 - r0
            int r4 = r4 + r0
            goto L0
        L10:
            return
    }
}
