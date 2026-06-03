package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class CharSequenceInputStream extends java.io.InputStream {
    private static final int NO_MARK = -1;
    private final java.nio.ByteBuffer bBuf;
    private int bBufMark;
    private final java.nio.CharBuffer cBuf;
    private int cBufMark;
    private final java.nio.charset.CharsetEncoder charsetEncoder;

    /* JADX INFO: renamed from: org.apache.commons.io.input.CharSequenceInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.CharSequenceInputStream, org.apache.commons.io.input.CharSequenceInputStream.Builder> {
        private java.nio.charset.CharsetEncoder charsetEncoder;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.nio.charset.Charset r0 = r1.getCharset()
                java.nio.charset.CharsetEncoder r0 = org.apache.commons.io.input.CharSequenceInputStream.access$000(r0)
                r1.charsetEncoder = r0
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.CharSequenceInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.CharSequenceInputStream get() {
                r1 = this;
                org.apache.commons.io.input.CharSequenceInputStream$Builder$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.input.CharSequenceInputStream$Builder$$ExternalSyntheticLambda1
                r0.<init>(r1)
                java.lang.Object r0 = org.apache.commons.io.function.Uncheck.get(r0)
                org.apache.commons.io.input.CharSequenceInputStream r0 = (org.apache.commons.io.input.CharSequenceInputStream) r0
                return r0
        }

        java.nio.charset.CharsetEncoder getCharsetEncoder() {
                r1 = this;
                java.nio.charset.CharsetEncoder r0 = r1.charsetEncoder
                return r0
        }

        /* JADX INFO: renamed from: lambda$get$0$org-apache-commons-io-input-CharSequenceInputStream$Builder, reason: not valid java name */
        /* synthetic */ org.apache.commons.io.input.CharSequenceInputStream m2604xc0c8f29c() throws java.io.IOException {
                r5 = this;
                org.apache.commons.io.input.CharSequenceInputStream r0 = new org.apache.commons.io.input.CharSequenceInputStream
                java.lang.CharSequence r1 = r5.getCharSequence()
                int r2 = r5.getBufferSize()
                java.nio.charset.CharsetEncoder r3 = r5.charsetEncoder
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        /* JADX INFO: renamed from: lambda$setCharsetEncoder$1$org-apache-commons-io-input-CharSequenceInputStream$Builder, reason: not valid java name */
        /* synthetic */ java.nio.charset.CharsetEncoder m2605xabe124b9() {
                r1 = this;
                java.nio.charset.Charset r0 = r1.getCharsetDefault()
                java.nio.charset.CharsetEncoder r0 = org.apache.commons.io.input.CharSequenceInputStream.access$000(r0)
                return r0
        }

        @Override // org.apache.commons.io.build.AbstractStreamBuilder
        public /* bridge */ /* synthetic */ org.apache.commons.io.build.AbstractStreamBuilder setCharset(java.nio.charset.Charset r1) {
                r0 = this;
                org.apache.commons.io.input.CharSequenceInputStream$Builder r1 = r0.setCharset(r1)
                return r1
        }

        @Override // org.apache.commons.io.build.AbstractStreamBuilder
        public org.apache.commons.io.input.CharSequenceInputStream.Builder setCharset(java.nio.charset.Charset r1) {
                r0 = this;
                super.setCharset(r1)
                java.nio.charset.Charset r1 = r0.getCharset()
                java.nio.charset.CharsetEncoder r1 = org.apache.commons.io.input.CharSequenceInputStream.access$000(r1)
                r0.charsetEncoder = r1
                return r0
        }

        public org.apache.commons.io.input.CharSequenceInputStream.Builder setCharsetEncoder(java.nio.charset.CharsetEncoder r2) {
                r1 = this;
                org.apache.commons.io.input.CharSequenceInputStream$Builder$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.input.CharSequenceInputStream$Builder$$ExternalSyntheticLambda0
                r0.<init>(r1)
                java.nio.charset.CharsetEncoder r2 = org.apache.commons.io.charset.CharsetEncoders.toCharsetEncoder(r2, r0)
                r1.charsetEncoder = r2
                java.nio.charset.Charset r2 = r2.charset()
                super.setCharset(r2)
                return r1
        }
    }

    private CharSequenceInputStream(java.lang.CharSequence r1, int r2, java.nio.charset.CharsetEncoder r3) {
            r0 = this;
            r0.<init>()
            r0.charsetEncoder = r3
            int r2 = org.apache.commons.io.input.ReaderInputStream.checkMinBufferSize(r3, r2)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r0.bBuf = r2
            r2.flip()
            java.nio.CharBuffer r1 = java.nio.CharBuffer.wrap(r1)
            r0.cBuf = r1
            r1 = -1
            r0.cBufMark = r1
            r0.bBufMark = r1
            r0.fillBuffer()     // Catch: java.nio.charset.CharacterCodingException -> L21
            goto L30
        L21:
            java.nio.ByteBuffer r1 = r0.bBuf
            r1.clear()
            java.nio.ByteBuffer r1 = r0.bBuf
            r1.flip()
            java.nio.CharBuffer r1 = r0.cBuf
            r1.rewind()
        L30:
            return
    }

    /* synthetic */ CharSequenceInputStream(java.lang.CharSequence r1, int r2, java.nio.charset.CharsetEncoder r3, org.apache.commons.io.input.CharSequenceInputStream.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public CharSequenceInputStream(java.lang.CharSequence r2, java.lang.String r3) {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public CharSequenceInputStream(java.lang.CharSequence r1, java.lang.String r2, int r3) {
            r0 = this;
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            r0.<init>(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public CharSequenceInputStream(java.lang.CharSequence r2, java.nio.charset.Charset r3) {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public CharSequenceInputStream(java.lang.CharSequence r1, java.nio.charset.Charset r2, int r3) {
            r0 = this;
            java.nio.charset.CharsetEncoder r2 = newEncoder(r2)
            r0.<init>(r1, r3, r2)
            return
    }

    static /* synthetic */ java.nio.charset.CharsetEncoder access$000(java.nio.charset.Charset r0) {
            java.nio.charset.CharsetEncoder r0 = newEncoder(r0)
            return r0
    }

    public static org.apache.commons.io.input.CharSequenceInputStream.Builder builder() {
            org.apache.commons.io.input.CharSequenceInputStream$Builder r0 = new org.apache.commons.io.input.CharSequenceInputStream$Builder
            r0.<init>()
            return r0
    }

    private void fillBuffer() throws java.nio.charset.CharacterCodingException {
            r4 = this;
            java.nio.ByteBuffer r0 = r4.bBuf
            r0.compact()
            java.nio.charset.CharsetEncoder r0 = r4.charsetEncoder
            java.nio.CharBuffer r1 = r4.cBuf
            java.nio.ByteBuffer r2 = r4.bBuf
            r3 = 1
            java.nio.charset.CoderResult r0 = r0.encode(r1, r2, r3)
            boolean r1 = r0.isError()
            if (r1 == 0) goto L19
            r0.throwException()
        L19:
            java.nio.ByteBuffer r0 = r4.bBuf
            r0.flip()
            return
    }

    private static java.nio.charset.CharsetEncoder newEncoder(java.nio.charset.Charset r1) {
            java.nio.charset.Charset r1 = org.apache.commons.io.Charsets.toCharset(r1)
            java.nio.charset.CharsetEncoder r1 = r1.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r1 = r1.onMalformedInput(r0)
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r1 = r1.onUnmappableCharacter(r0)
            return r1
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.bBuf
            int r0 = r0.remaining()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    java.nio.charset.CharsetEncoder getCharsetEncoder() {
            r1 = this;
            java.nio.charset.CharsetEncoder r0 = r1.charsetEncoder
            return r0
    }

    @Override // java.io.InputStream
    public synchronized void mark(int r1) {
            r0 = this;
            monitor-enter(r0)
            java.nio.CharBuffer r1 = r0.cBuf     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.position()     // Catch: java.lang.Throwable -> L1d
            r0.cBufMark = r1     // Catch: java.lang.Throwable -> L1d
            java.nio.ByteBuffer r1 = r0.bBuf     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.position()     // Catch: java.lang.Throwable -> L1d
            r0.bBufMark = r1     // Catch: java.lang.Throwable -> L1d
            java.nio.CharBuffer r1 = r0.cBuf     // Catch: java.lang.Throwable -> L1d
            r1.mark()     // Catch: java.lang.Throwable -> L1d
            java.nio.ByteBuffer r1 = r0.bBuf     // Catch: java.lang.Throwable -> L1d
            r1.mark()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return
        L1d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r1 = this;
        L0:
            java.nio.ByteBuffer r0 = r1.bBuf
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r0 = r1.bBuf
            byte r0 = r0.get()
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        L11:
            r1.fillBuffer()
            java.nio.ByteBuffer r0 = r1.bBuf
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L0
            java.nio.CharBuffer r0 = r1.cBuf
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L0
            r0 = -1
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // java.io.InputStream
    public int read(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "array"
            java.util.Objects.requireNonNull(r5, r0)
            if (r7 < 0) goto L5f
            int r0 = r6 + r7
            int r1 = r5.length
            if (r0 > r1) goto L5f
            r0 = 0
            if (r7 != 0) goto L10
            return r0
        L10:
            java.nio.ByteBuffer r1 = r4.bBuf
            boolean r1 = r1.hasRemaining()
            r2 = -1
            if (r1 != 0) goto L22
            java.nio.CharBuffer r1 = r4.cBuf
            boolean r1 = r1.hasRemaining()
            if (r1 != 0) goto L22
            return r2
        L22:
            if (r7 <= 0) goto L52
            java.nio.ByteBuffer r1 = r4.bBuf
            boolean r1 = r1.hasRemaining()
            if (r1 == 0) goto L3f
            java.nio.ByteBuffer r1 = r4.bBuf
            int r1 = r1.remaining()
            int r1 = java.lang.Math.min(r1, r7)
            java.nio.ByteBuffer r3 = r4.bBuf
            r3.get(r5, r6, r1)
            int r6 = r6 + r1
            int r7 = r7 - r1
            int r0 = r0 + r1
            goto L22
        L3f:
            r4.fillBuffer()
            java.nio.ByteBuffer r1 = r4.bBuf
            boolean r1 = r1.hasRemaining()
            if (r1 != 0) goto L22
            java.nio.CharBuffer r1 = r4.cBuf
            boolean r1 = r1.hasRemaining()
            if (r1 != 0) goto L22
        L52:
            if (r0 != 0) goto L5d
            java.nio.CharBuffer r5 = r4.cBuf
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L5d
            goto L5e
        L5d:
            r2 = r0
        L5e:
            return r2
        L5f:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Array Size="
            r1.<init>(r2)
            int r5 = r5.length
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = ", offset="
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = ", length="
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.cBufMark     // Catch: java.lang.Throwable -> L81
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L7c
            java.nio.CharBuffer r0 = r4.cBuf     // Catch: java.lang.Throwable -> L81
            int r0 = r0.position()     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L3b
            java.nio.charset.CharsetEncoder r0 = r4.charsetEncoder     // Catch: java.lang.Throwable -> L81
            r0.reset()     // Catch: java.lang.Throwable -> L81
            java.nio.CharBuffer r0 = r4.cBuf     // Catch: java.lang.Throwable -> L81
            r0.rewind()     // Catch: java.lang.Throwable -> L81
            java.nio.ByteBuffer r0 = r4.bBuf     // Catch: java.lang.Throwable -> L81
            r0.rewind()     // Catch: java.lang.Throwable -> L81
            java.nio.ByteBuffer r0 = r4.bBuf     // Catch: java.lang.Throwable -> L81
            r0.limit(r1)     // Catch: java.lang.Throwable -> L81
        L23:
            java.nio.CharBuffer r0 = r4.cBuf     // Catch: java.lang.Throwable -> L81
            int r0 = r0.position()     // Catch: java.lang.Throwable -> L81
            int r3 = r4.cBufMark     // Catch: java.lang.Throwable -> L81
            if (r0 >= r3) goto L3b
            java.nio.ByteBuffer r0 = r4.bBuf     // Catch: java.lang.Throwable -> L81
            r0.rewind()     // Catch: java.lang.Throwable -> L81
            java.nio.ByteBuffer r0 = r4.bBuf     // Catch: java.lang.Throwable -> L81
            r0.limit(r1)     // Catch: java.lang.Throwable -> L81
            r4.fillBuffer()     // Catch: java.lang.Throwable -> L81
            goto L23
        L3b:
            java.nio.CharBuffer r0 = r4.cBuf     // Catch: java.lang.Throwable -> L81
            int r0 = r0.position()     // Catch: java.lang.Throwable -> L81
            int r3 = r4.cBufMark     // Catch: java.lang.Throwable -> L81
            if (r0 != r3) goto L51
            java.nio.ByteBuffer r0 = r4.bBuf     // Catch: java.lang.Throwable -> L81
            int r3 = r4.bBufMark     // Catch: java.lang.Throwable -> L81
            r0.position(r3)     // Catch: java.lang.Throwable -> L81
            r4.cBufMark = r2     // Catch: java.lang.Throwable -> L81
            r4.bBufMark = r2     // Catch: java.lang.Throwable -> L81
            goto L7c
        L51:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r1.<init>()     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "Unexpected CharBuffer position: actual="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L81
            java.nio.CharBuffer r2 = r4.cBuf     // Catch: java.lang.Throwable -> L81
            int r2 = r2.position()     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = " expected="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L81
            int r2 = r4.cBufMark     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L81
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L81
            throw r0     // Catch: java.lang.Throwable -> L81
        L7c:
            r4.mark(r1)     // Catch: java.lang.Throwable -> L81
            monitor-exit(r4)
            return
        L81:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L81
            throw r0
    }

    @Override // java.io.InputStream
    public long skip(long r7) throws java.io.IOException {
            r6 = this;
            r0 = 0
            r2 = r0
        L3:
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r4 <= 0) goto L15
            int r4 = r6.available()
            if (r4 <= 0) goto L15
            r6.read()
            r4 = 1
            long r7 = r7 - r4
            long r2 = r2 + r4
            goto L3
        L15:
            return r2
    }
}
