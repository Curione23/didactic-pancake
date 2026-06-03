package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class LZMAOutputStream extends org.tukaani.xz.FinishableOutputStream {
    private final org.tukaani.xz.ArrayCache arrayCache;
    private long currentUncompressedSize;
    private java.io.IOException exception;
    private final long expectedUncompressedSize;
    private boolean finished;
    private org.tukaani.xz.lz.LZEncoder lz;
    private org.tukaani.xz.lzma.LZMAEncoder lzma;
    private java.io.OutputStream out;
    private final int props;
    private final org.tukaani.xz.rangecoder.RangeEncoderToStream rc;
    private final byte[] tempBuf;
    private final boolean useEndMarker;

    public LZMAOutputStream(java.io.OutputStream r7, org.tukaani.xz.LZMA2Options r8, long r9) throws java.io.IOException {
            r6 = this;
            org.tukaani.xz.ArrayCache r5 = org.tukaani.xz.ArrayCache.getDefaultCache()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public LZMAOutputStream(java.io.OutputStream r10, org.tukaani.xz.LZMA2Options r11, long r12, org.tukaani.xz.ArrayCache r14) throws java.io.IOException {
            r9 = this;
            r0 = -1
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            r5 = r0
            r4 = 1
            r1 = r9
            r2 = r10
            r3 = r11
            r6 = r12
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r8)
            return
    }

    public LZMAOutputStream(java.io.OutputStream r2, org.tukaani.xz.LZMA2Options r3, boolean r4) throws java.io.IOException {
            r1 = this;
            org.tukaani.xz.ArrayCache r0 = org.tukaani.xz.ArrayCache.getDefaultCache()
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public LZMAOutputStream(java.io.OutputStream r9, org.tukaani.xz.LZMA2Options r10, boolean r11, org.tukaani.xz.ArrayCache r12) throws java.io.IOException {
            r8 = this;
            r3 = 0
            r5 = -1
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r7)
            return
    }

    private LZMAOutputStream(java.io.OutputStream r18, org.tukaani.xz.LZMA2Options r19, boolean r20, boolean r21, long r22, org.tukaani.xz.ArrayCache r24) throws java.io.IOException {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r22
            r17.<init>()
            r4 = 0
            r0.currentUncompressedSize = r4
            r4 = 0
            r0.finished = r4
            r5 = 0
            r0.exception = r5
            r5 = 1
            byte[] r5 = new byte[r5]
            r0.tempBuf = r5
            r18.getClass()
            r5 = -1
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto Lb8
            r5 = r21
            r0.useEndMarker = r5
            r0.expectedUncompressedSize = r2
            r15 = r24
            r0.arrayCache = r15
            r0.out = r1
            org.tukaani.xz.rangecoder.RangeEncoderToStream r5 = new org.tukaani.xz.rangecoder.RangeEncoderToStream
            r5.<init>(r1)
            r0.rc = r5
            int r14 = r19.getDictSize()
            int r6 = r19.getLc()
            int r7 = r19.getLp()
            int r8 = r19.getPb()
            int r9 = r19.getMode()
            int r12 = r19.getNiceLen()
            int r13 = r19.getMatchFinder()
            int r16 = r19.getDepthLimit()
            r11 = 0
            r10 = r14
            r4 = r14
            r14 = r16
            org.tukaani.xz.lzma.LZMAEncoder r5 = org.tukaani.xz.lzma.LZMAEncoder.getInstance(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.lzma = r5
            org.tukaani.xz.lz.LZEncoder r5 = r5.getLZEncoder()
            r0.lz = r5
            byte[] r5 = r19.getPresetDict()
            if (r5 == 0) goto L7e
            int r6 = r5.length
            if (r6 <= 0) goto L7e
            if (r20 != 0) goto L76
            org.tukaani.xz.lz.LZEncoder r6 = r0.lz
            r6.setPresetDict(r4, r5)
            goto L7e
        L76:
            org.tukaani.xz.UnsupportedOptionsException r1 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.String r2 = "Preset dictionary cannot be used in .lzma files (try a raw LZMA stream instead)"
            r1.<init>(r2)
            throw r1
        L7e:
            int r5 = r19.getPb()
            int r5 = r5 * 5
            int r6 = r19.getLp()
            int r5 = r5 + r6
            int r5 = r5 * 9
            int r6 = r19.getLc()
            int r5 = r5 + r6
            r0.props = r5
            if (r20 == 0) goto Lb7
            r1.write(r5)
            r14 = r4
            r4 = 0
        L99:
            r5 = 4
            r6 = 8
            if (r4 >= r5) goto La7
            r5 = r14 & 255(0xff, float:3.57E-43)
            r1.write(r5)
            int r14 = r14 >>> r6
            int r4 = r4 + 1
            goto L99
        La7:
            r4 = 0
        La8:
            if (r4 >= r6) goto Lb7
            int r5 = r4 * 8
            long r7 = r2 >>> r5
            int r5 = (int) r7
            r5 = r5 & 255(0xff, float:3.57E-43)
            r1.write(r5)
            int r4 = r4 + 1
            goto La8
        Lb7:
            return
        Lb8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Invalid expected input size (less than -1)"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            if (r0 == 0) goto L17
            r2.finish()     // Catch: java.io.IOException -> L7
        L7:
            java.io.OutputStream r0 = r2.out     // Catch: java.io.IOException -> Ld
            r0.close()     // Catch: java.io.IOException -> Ld
            goto L14
        Ld:
            r0 = move-exception
            java.io.IOException r1 = r2.exception
            if (r1 != 0) goto L14
            r2.exception = r0
        L14:
            r0 = 0
            r2.out = r0
        L17:
            java.io.IOException r0 = r2.exception
            if (r0 != 0) goto L1c
            return
        L1c:
            throw r0
    }

    @Override // org.tukaani.xz.FinishableOutputStream
    public void finish() throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "Expected uncompressed size ("
            boolean r1 = r5.finished
            if (r1 != 0) goto L6d
            java.io.IOException r1 = r5.exception
            if (r1 != 0) goto L6c
            long r1 = r5.expectedUncompressedSize     // Catch: java.io.IOException -> L68
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L40
            long r3 = r5.currentUncompressedSize     // Catch: java.io.IOException -> L68
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L19
            goto L40
        L19:
            org.tukaani.xz.XZIOException r1 = new org.tukaani.xz.XZIOException     // Catch: java.io.IOException -> L68
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L68
            r2.<init>(r0)     // Catch: java.io.IOException -> L68
            long r3 = r5.expectedUncompressedSize     // Catch: java.io.IOException -> L68
            java.lang.StringBuilder r0 = r2.append(r3)     // Catch: java.io.IOException -> L68
            java.lang.String r2 = ") doesn't equal the number of bytes written to the stream ("
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.io.IOException -> L68
            long r2 = r5.currentUncompressedSize     // Catch: java.io.IOException -> L68
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.io.IOException -> L68
            java.lang.String r2 = ")"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.io.IOException -> L68
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L68
            r1.<init>(r0)     // Catch: java.io.IOException -> L68
            throw r1     // Catch: java.io.IOException -> L68
        L40:
            org.tukaani.xz.lz.LZEncoder r0 = r5.lz     // Catch: java.io.IOException -> L68
            r0.setFinishing()     // Catch: java.io.IOException -> L68
            org.tukaani.xz.lzma.LZMAEncoder r0 = r5.lzma     // Catch: java.io.IOException -> L68
            r0.encodeForLZMA1()     // Catch: java.io.IOException -> L68
            boolean r0 = r5.useEndMarker     // Catch: java.io.IOException -> L68
            if (r0 == 0) goto L53
            org.tukaani.xz.lzma.LZMAEncoder r0 = r5.lzma     // Catch: java.io.IOException -> L68
            r0.encodeLZMA1EndMarker()     // Catch: java.io.IOException -> L68
        L53:
            org.tukaani.xz.rangecoder.RangeEncoderToStream r0 = r5.rc     // Catch: java.io.IOException -> L68
            r0.finish()     // Catch: java.io.IOException -> L68
            r0 = 1
            r5.finished = r0
            org.tukaani.xz.lzma.LZMAEncoder r0 = r5.lzma
            org.tukaani.xz.ArrayCache r1 = r5.arrayCache
            r0.putArraysToCache(r1)
            r0 = 0
            r5.lzma = r0
            r5.lz = r0
            goto L6d
        L68:
            r0 = move-exception
            r5.exception = r0
            throw r0
        L6c:
            throw r1
        L6d:
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r2 = this;
            org.tukaani.xz.XZIOException r0 = new org.tukaani.xz.XZIOException
            java.lang.String r1 = "LZMAOutputStream does not support flushing"
            r0.<init>(r1)
            throw r0
    }

    public int getProps() {
            r1 = this;
            int r0 = r1.props
            return r0
    }

    public long getUncompressedSize() {
            r2 = this;
            long r0 = r2.currentUncompressedSize
            return r0
    }

    @Override // java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.tempBuf
            byte r3 = (byte) r3
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r2.write(r0, r1, r3)
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            if (r6 < 0) goto L65
            if (r7 < 0) goto L65
            int r0 = r6 + r7
            if (r0 < 0) goto L65
            int r1 = r5.length
            if (r0 > r1) goto L65
            java.io.IOException r0 = r4.exception
            if (r0 != 0) goto L64
            boolean r0 = r4.finished
            if (r0 != 0) goto L5c
            long r0 = r4.expectedUncompressedSize
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L41
            long r2 = r4.currentUncompressedSize
            long r0 = r0 - r2
            long r2 = (long) r7
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L24
            goto L41
        L24:
            org.tukaani.xz.XZIOException r5 = new org.tukaani.xz.XZIOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected uncompressed input size ("
            r6.<init>(r7)
            long r0 = r4.expectedUncompressedSize
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r7 = " bytes) was exceeded"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L41:
            long r0 = r4.currentUncompressedSize
            long r2 = (long) r7
            long r0 = r0 + r2
            r4.currentUncompressedSize = r0
        L47:
            if (r7 <= 0) goto L5b
            org.tukaani.xz.lz.LZEncoder r0 = r4.lz     // Catch: java.io.IOException -> L57
            int r0 = r0.fillWindow(r5, r6, r7)     // Catch: java.io.IOException -> L57
            int r6 = r6 + r0
            int r7 = r7 - r0
            org.tukaani.xz.lzma.LZMAEncoder r0 = r4.lzma     // Catch: java.io.IOException -> L57
            r0.encodeForLZMA1()     // Catch: java.io.IOException -> L57
            goto L47
        L57:
            r5 = move-exception
            r4.exception = r5
            throw r5
        L5b:
            return
        L5c:
            org.tukaani.xz.XZIOException r5 = new org.tukaani.xz.XZIOException
            java.lang.String r6 = "Stream finished or closed"
            r5.<init>(r6)
            throw r5
        L64:
            throw r0
        L65:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            r5.<init>()
            throw r5
    }
}
