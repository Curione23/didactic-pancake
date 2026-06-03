package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class ChunkedOutputStream extends java.io.FilterOutputStream {
    private final int chunkSize;

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.output.ChunkedOutputStream, org.apache.commons.io.output.ChunkedOutputStream.Builder> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.output.ChunkedOutputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.output.ChunkedOutputStream get() throws java.io.IOException {
                r3 = this;
                org.apache.commons.io.output.ChunkedOutputStream r0 = new org.apache.commons.io.output.ChunkedOutputStream
                java.io.OutputStream r1 = r3.getOutputStream()
                int r2 = r3.getBufferSize()
                r0.<init>(r1, r2)
                return r0
        }
    }

    @java.lang.Deprecated
    public ChunkedOutputStream(java.io.OutputStream r2) {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public ChunkedOutputStream(java.io.OutputStream r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 <= 0) goto L8
            r0.chunkSize = r2
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "chunkSize <= 0"
            r1.<init>(r2)
            throw r1
    }

    public static org.apache.commons.io.output.ChunkedOutputStream.Builder builder() {
            org.apache.commons.io.output.ChunkedOutputStream$Builder r0 = new org.apache.commons.io.output.ChunkedOutputStream$Builder
            r0.<init>()
            return r0
    }

    int getChunkSize() {
            r1 = this;
            int r0 = r1.chunkSize
            return r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
        L0:
            if (r5 <= 0) goto L10
            int r0 = r2.chunkSize
            int r0 = java.lang.Math.min(r5, r0)
            java.io.OutputStream r1 = r2.out
            r1.write(r3, r4, r0)
            int r5 = r5 - r0
            int r4 = r4 + r0
            goto L0
        L10:
            return
    }
}
