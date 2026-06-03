package okio;

/* JADX INFO: compiled from: GzipSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lokio/GzipSource;", "Lokio/Source;", "source", "(Lokio/Source;)V", "crc", "Ljava/util/zip/CRC32;", "inflater", "Ljava/util/zip/Inflater;", "inflaterSource", "Lokio/InflaterSource;", "section", "", "Lokio/RealBufferedSource;", "checkEqual", "", "name", "", "expected", "", "actual", "close", "consumeHeader", "consumeTrailer", "read", "", "sink", "Lokio/Buffer;", "byteCount", "timeout", "Lokio/Timeout;", "updateCrc", "buffer", "offset", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GzipSource implements okio.Source {
    private final java.util.zip.CRC32 crc;
    private final java.util.zip.Inflater inflater;
    private final okio.InflaterSource inflaterSource;
    private byte section;
    private final okio.RealBufferedSource source;

    public GzipSource(okio.Source r3) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>()
            okio.RealBufferedSource r0 = new okio.RealBufferedSource
            r0.<init>(r3)
            r2.source = r0
            java.util.zip.Inflater r3 = new java.util.zip.Inflater
            r1 = 1
            r3.<init>(r1)
            r2.inflater = r3
            okio.InflaterSource r1 = new okio.InflaterSource
            okio.BufferedSource r0 = (okio.BufferedSource) r0
            r1.<init>(r0, r3)
            r2.inflaterSource = r1
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32
            r3.<init>()
            r2.crc = r3
            return
    }

    private final void checkEqual(java.lang.String r2, int r3, int r4) {
            r1 = this;
            if (r4 != r3) goto L3
            return
        L3:
            java.io.IOException r0 = new java.io.IOException
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4, r3}
            r3 = 3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r3 = "%s: actual 0x%08x != expected 0x%08x"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "format(this, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r0.<init>(r2)
            throw r0
    }

    private final void consumeHeader() throws java.io.IOException {
            r17 = this;
            r6 = r17
            okio.RealBufferedSource r0 = r6.source
            r1 = 10
            r0.require(r1)
            okio.RealBufferedSource r0 = r6.source
            okio.Buffer r0 = r0.bufferField
            r1 = 3
            byte r7 = r0.getByte(r1)
            int r0 = r7 >> 1
            r8 = 1
            r0 = r0 & r8
            r9 = 0
            if (r0 != r8) goto L1c
            r10 = r8
            goto L1d
        L1c:
            r10 = r9
        L1d:
            if (r10 == 0) goto L2c
            okio.RealBufferedSource r0 = r6.source
            okio.Buffer r1 = r0.bufferField
            r2 = 0
            r4 = 10
            r0 = r17
            r0.updateCrc(r1, r2, r4)
        L2c:
            okio.RealBufferedSource r0 = r6.source
            short r0 = r0.readShort()
            java.lang.String r1 = "ID1ID2"
            r2 = 8075(0x1f8b, float:1.1315E-41)
            r6.checkEqual(r1, r2, r0)
            okio.RealBufferedSource r0 = r6.source
            r1 = 8
            r0.skip(r1)
            int r0 = r7 >> 2
            r0 = r0 & r8
            if (r0 != r8) goto L80
            okio.RealBufferedSource r0 = r6.source
            r1 = 2
            r0.require(r1)
            if (r10 == 0) goto L5b
            okio.RealBufferedSource r0 = r6.source
            okio.Buffer r1 = r0.bufferField
            r2 = 0
            r4 = 2
            r0 = r17
            r0.updateCrc(r1, r2, r4)
        L5b:
            okio.RealBufferedSource r0 = r6.source
            okio.Buffer r0 = r0.bufferField
            short r0 = r0.readShortLe()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            long r11 = (long) r0
            okio.RealBufferedSource r0 = r6.source
            r0.require(r11)
            if (r10 == 0) goto L7b
            okio.RealBufferedSource r0 = r6.source
            okio.Buffer r1 = r0.bufferField
            r2 = 0
            r0 = r17
            r4 = r11
            r0.updateCrc(r1, r2, r4)
        L7b:
            okio.RealBufferedSource r0 = r6.source
            r0.skip(r11)
        L80:
            int r0 = r7 >> 3
            r0 = r0 & r8
            r11 = -1
            r13 = 1
            if (r0 != r8) goto Lb0
            okio.RealBufferedSource r0 = r6.source
            long r15 = r0.indexOf(r9)
            int r0 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r0 == 0) goto Laa
            if (r10 == 0) goto La2
            okio.RealBufferedSource r0 = r6.source
            okio.Buffer r1 = r0.bufferField
            r2 = 0
            long r4 = r15 + r13
            r0 = r17
            r0.updateCrc(r1, r2, r4)
        La2:
            okio.RealBufferedSource r0 = r6.source
            long r1 = r15 + r13
            r0.skip(r1)
            goto Lb0
        Laa:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Lb0:
            int r0 = r7 >> 4
            r0 = r0 & r8
            if (r0 != r8) goto Ldb
            okio.RealBufferedSource r0 = r6.source
            long r7 = r0.indexOf(r9)
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 == 0) goto Ld5
            if (r10 == 0) goto Lce
            okio.RealBufferedSource r0 = r6.source
            okio.Buffer r1 = r0.bufferField
            r2 = 0
            long r4 = r7 + r13
            r0 = r17
            r0.updateCrc(r1, r2, r4)
        Lce:
            okio.RealBufferedSource r0 = r6.source
            long r7 = r7 + r13
            r0.skip(r7)
            goto Ldb
        Ld5:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Ldb:
            if (r10 == 0) goto Lf5
            okio.RealBufferedSource r0 = r6.source
            short r0 = r0.readShortLe()
            java.util.zip.CRC32 r1 = r6.crc
            long r1 = r1.getValue()
            int r1 = (int) r1
            short r1 = (short) r1
            java.lang.String r2 = "FHCRC"
            r6.checkEqual(r2, r0, r1)
            java.util.zip.CRC32 r0 = r6.crc
            r0.reset()
        Lf5:
            return
    }

    private final void consumeTrailer() throws java.io.IOException {
            r3 = this;
            okio.RealBufferedSource r0 = r3.source
            int r0 = r0.readIntLe()
            java.util.zip.CRC32 r1 = r3.crc
            long r1 = r1.getValue()
            int r1 = (int) r1
            java.lang.String r2 = "CRC"
            r3.checkEqual(r2, r0, r1)
            okio.RealBufferedSource r0 = r3.source
            int r0 = r0.readIntLe()
            java.util.zip.Inflater r1 = r3.inflater
            long r1 = r1.getBytesWritten()
            int r1 = (int) r1
            java.lang.String r2 = "ISIZE"
            r3.checkEqual(r2, r0, r1)
            return
    }

    private final void updateCrc(okio.Buffer r5, long r6, long r8) {
            r4 = this;
            okio.Segment r5 = r5.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
        L5:
            int r0 = r5.limit
            int r1 = r5.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L1c
            int r0 = r5.limit
            int r1 = r5.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r6 = r6 - r0
            okio.Segment r5 = r5.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            goto L5
        L1c:
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L40
            int r2 = r5.pos
            long r2 = (long) r2
            long r2 = r2 + r6
            int r6 = (int) r2
            int r7 = r5.limit
            int r7 = r7 - r6
            long r2 = (long) r7
            long r2 = java.lang.Math.min(r2, r8)
            int r7 = (int) r2
            java.util.zip.CRC32 r2 = r4.crc
            byte[] r3 = r5.data
            r2.update(r3, r6, r7)
            long r6 = (long) r7
            long r8 = r8 - r6
            okio.Segment r5 = r5.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r6 = r0
            goto L1c
        L40:
            return
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okio.InflaterSource r0 = r1.inflaterSource
            r0.close()
            return
    }

    @Override // okio.Source
    public long read(okio.Buffer r12, long r13) throws java.io.IOException {
            r11 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L52
            if (r2 != 0) goto Le
            return r0
        Le:
            byte r0 = r11.section
            r1 = 1
            if (r0 != 0) goto L18
            r11.consumeHeader()
            r11.section = r1
        L18:
            byte r0 = r11.section
            r2 = -1
            r4 = 2
            if (r0 != r1) goto L36
            long r7 = r12.size()
            okio.InflaterSource r0 = r11.inflaterSource
            long r13 = r0.read(r12, r13)
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto L34
            r5 = r11
            r6 = r12
            r9 = r13
            r5.updateCrc(r6, r7, r9)
            return r13
        L34:
            r11.section = r4
        L36:
            byte r12 = r11.section
            if (r12 != r4) goto L51
            r11.consumeTrailer()
            r12 = 3
            r11.section = r12
            okio.RealBufferedSource r12 = r11.source
            boolean r12 = r12.exhausted()
            if (r12 == 0) goto L49
            goto L51
        L49:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "gzip finished without exhausting source"
            r12.<init>(r13)
            throw r12
        L51:
            return r2
        L52:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount < 0: "
            r12.<init>(r0)
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.RealBufferedSource r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }
}
