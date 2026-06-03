package org.apache.commons.compress.compressors.deflate64;

/* JADX INFO: loaded from: classes2.dex */
public class Deflate64CompressorInputStream extends org.apache.commons.compress.compressors.CompressorInputStream implements org.apache.commons.compress.utils.InputStreamStatistics {
    private long compressedBytesRead;
    private org.apache.commons.compress.compressors.deflate64.HuffmanDecoder decoder;
    private final byte[] oneByte;
    private java.io.InputStream originalStream;

    public Deflate64CompressorInputStream(java.io.InputStream r2) {
            r1 = this;
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r0 = new org.apache.commons.compress.compressors.deflate64.HuffmanDecoder
            r0.<init>(r2)
            r1.<init>(r0)
            r1.originalStream = r2
            return
    }

    Deflate64CompressorInputStream(org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.oneByte = r0
            r1.decoder = r2
            return
    }

    private void closeDecoder() {
            r1 = this;
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r0 = r1.decoder
            org.apache.commons.io.IOUtils.closeQuietly(r0)
            r0 = 0
            r1.decoder = r0
            return
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r0 = r1.decoder
            if (r0 == 0) goto L9
            int r0 = r0.available()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r3 = this;
            r0 = 0
            r3.closeDecoder()     // Catch: java.lang.Throwable -> Le
            java.io.InputStream r1 = r3.originalStream
            if (r1 == 0) goto Ld
            r1.close()
            r3.originalStream = r0
        Ld:
            return
        Le:
            r1 = move-exception
            java.io.InputStream r2 = r3.originalStream
            if (r2 == 0) goto L1a
            java.io.InputStream r2 = r3.originalStream
            r2.close()
            r3.originalStream = r0
        L1a:
            throw r1
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
            r2 = this;
            long r0 = r2.compressedBytesRead
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r4 = this;
        L0:
            byte[] r0 = r4.oneByte
            int r0 = r4.read(r0)
            r1 = -1
            if (r0 == r1) goto L2b
            if (r0 == 0) goto L0
            r1 = 1
            if (r0 != r1) goto L16
            byte[] r0 = r4.oneByte
            r1 = 0
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid return value from read: "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L2b:
            return r1
    }

    @Override // java.io.InputStream
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            if (r5 != 0) goto L4
            r3 = 0
            return r3
        L4:
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r0 = r2.decoder
            r1 = -1
            if (r0 == 0) goto L28
            int r3 = r0.decode(r3, r4, r5)     // Catch: java.lang.RuntimeException -> L1f
            org.apache.commons.compress.compressors.deflate64.HuffmanDecoder r4 = r2.decoder
            long r4 = r4.getBytesRead()
            r2.compressedBytesRead = r4
            r2.count(r3)
            if (r3 != r1) goto L1d
            r2.closeDecoder()
        L1d:
            r1 = r3
            goto L28
        L1f:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Invalid Deflate64 input"
            r4.<init>(r5, r3)
            throw r4
        L28:
            return r1
    }
}
