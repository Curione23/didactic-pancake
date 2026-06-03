package okio;

/* JADX INFO: compiled from: CipherSink.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0018H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lokio/CipherSink;", "Lokio/Sink;", "sink", "Lokio/BufferedSink;", "cipher", "Ljavax/crypto/Cipher;", "(Lokio/BufferedSink;Ljavax/crypto/Cipher;)V", "blockSize", "", "getCipher", "()Ljavax/crypto/Cipher;", "closed", "", "close", "", "doFinal", "", "flush", "timeout", "Lokio/Timeout;", "update", "source", "Lokio/Buffer;", "remaining", "", "write", "byteCount", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CipherSink implements okio.Sink {
    private final int blockSize;
    private final javax.crypto.Cipher cipher;
    private boolean closed;
    private final okio.BufferedSink sink;

    public CipherSink(okio.BufferedSink r2, javax.crypto.Cipher r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "cipher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.sink = r2
            r1.cipher = r3
            int r2 = r3.getBlockSize()
            r1.blockSize = r2
            if (r2 <= 0) goto L1a
            return
        L1a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Block cipher required "
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private final java.lang.Throwable doFinal() {
            r8 = this;
            javax.crypto.Cipher r0 = r8.cipher
            r1 = 0
            int r0 = r0.getOutputSize(r1)
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            r2 = 8192(0x2000, float:1.148E-41)
            if (r0 <= r2) goto L22
            okio.BufferedSink r0 = r8.sink     // Catch: java.lang.Throwable -> L20
            javax.crypto.Cipher r2 = r8.cipher     // Catch: java.lang.Throwable -> L20
            byte[] r2 = r2.doFinal()     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "doFinal(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> L20
            r0.write(r2)     // Catch: java.lang.Throwable -> L20
            return r1
        L20:
            r0 = move-exception
            return r0
        L22:
            okio.BufferedSink r2 = r8.sink
            okio.Buffer r2 = r2.getBuffer()
            okio.Segment r0 = r2.writableSegment$okio(r0)
            javax.crypto.Cipher r3 = r8.cipher     // Catch: java.lang.Throwable -> L45
            byte[] r4 = r0.data     // Catch: java.lang.Throwable -> L45
            int r5 = r0.limit     // Catch: java.lang.Throwable -> L45
            int r3 = r3.doFinal(r4, r5)     // Catch: java.lang.Throwable -> L45
            int r4 = r0.limit     // Catch: java.lang.Throwable -> L45
            int r4 = r4 + r3
            r0.limit = r4     // Catch: java.lang.Throwable -> L45
            long r4 = r2.size()     // Catch: java.lang.Throwable -> L45
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L45
            long r4 = r4 + r6
            r2.setSize$okio(r4)     // Catch: java.lang.Throwable -> L45
            goto L46
        L45:
            r1 = move-exception
        L46:
            int r3 = r0.pos
            int r4 = r0.limit
            if (r3 != r4) goto L55
            okio.Segment r3 = r0.pop()
            r2.head = r3
            okio.SegmentPool.recycle(r0)
        L55:
            return r1
    }

    private final int update(okio.Buffer r11, long r12) {
            r10 = this;
            okio.Segment r0 = r11.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r12, r1)
            int r1 = (int) r1
            okio.BufferedSink r2 = r10.sink
            okio.Buffer r2 = r2.getBuffer()
            javax.crypto.Cipher r3 = r10.cipher
            int r3 = r3.getOutputSize(r1)
        L1c:
            r4 = 8192(0x2000, float:1.148E-41)
            if (r3 <= r4) goto L42
            int r3 = r10.blockSize
            if (r1 > r3) goto L3a
            okio.BufferedSink r0 = r10.sink
            javax.crypto.Cipher r1 = r10.cipher
            byte[] r11 = r11.readByteArray(r12)
            byte[] r11 = r1.update(r11)
            java.lang.String r1 = "update(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
            r0.write(r11)
            int r11 = (int) r12
            return r11
        L3a:
            int r1 = r1 - r3
            javax.crypto.Cipher r3 = r10.cipher
            int r3 = r3.getOutputSize(r1)
            goto L1c
        L42:
            okio.Segment r12 = r2.writableSegment$okio(r3)
            javax.crypto.Cipher r4 = r10.cipher
            byte[] r5 = r0.data
            int r6 = r0.pos
            byte[] r8 = r12.data
            int r9 = r12.limit
            r7 = r1
            int r13 = r4.update(r5, r6, r7, r8, r9)
            int r3 = r12.limit
            int r3 = r3 + r13
            r12.limit = r3
            long r3 = r2.size()
            long r5 = (long) r13
            long r3 = r3 + r5
            r2.setSize$okio(r3)
            int r13 = r12.pos
            int r3 = r12.limit
            if (r13 != r3) goto L72
            okio.Segment r13 = r12.pop()
            r2.head = r13
            okio.SegmentPool.recycle(r12)
        L72:
            okio.BufferedSink r12 = r10.sink
            r12.emitCompleteSegments()
            long r12 = r11.size()
            long r2 = (long) r1
            long r12 = r12 - r2
            r11.setSize$okio(r12)
            int r12 = r0.pos
            int r12 = r12 + r1
            r0.pos = r12
            int r12 = r0.pos
            int r13 = r0.limit
            if (r12 != r13) goto L94
            okio.Segment r12 = r0.pop()
            r11.head = r12
            okio.SegmentPool.recycle(r0)
        L94:
            return r1
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.closed = r0
            java.lang.Throwable r0 = r2.doFinal()
            okio.BufferedSink r1 = r2.sink     // Catch: java.lang.Throwable -> L12
            r1.close()     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r1 = move-exception
            if (r0 != 0) goto L16
            r0 = r1
        L16:
            if (r0 != 0) goto L19
            return
        L19:
            throw r0
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            r0.flush()
            return
    }

    public final javax.crypto.Cipher getCipher() {
            r1 = this;
            javax.crypto.Cipher r0 = r1.cipher
            return r0
    }

    @Override // okio.Sink
    public okio.Timeout timeout() {
            r1 = this;
            okio.BufferedSink r0 = r1.sink
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    @Override // okio.Sink
    public void write(okio.Buffer r8, long r9) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            long r1 = r8.size()
            r3 = 0
            r5 = r9
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            boolean r0 = r7.closed
            if (r0 != 0) goto L21
        L13:
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L20
            int r0 = r7.update(r8, r9)
            long r0 = (long) r0
            long r9 = r9 - r0
            goto L13
        L20:
            return
        L21:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }
}
