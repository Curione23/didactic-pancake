package okio;

/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\u0001H\u0016J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J(\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'H\u0016J \u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020'2\u0006\u0010 \u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010%\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020'2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010,\u001a\u00020\u0018H\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010-\u001a\u00020\u0012H\u0016J\u0010\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020'H\u0016J\u0018\u0010.\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020\"H\u0016J\b\u00101\u001a\u00020\"H\u0016J\b\u00102\u001a\u00020\u0012H\u0016J\b\u00103\u001a\u00020\u0012H\u0016J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u000205H\u0016J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\u0018\u00107\u001a\u0002082\u0006\u0010#\u001a\u00020\u00122\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u000208H\u0016J\u0010\u0010;\u001a\u0002082\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010<\u001a\u00020\"H\u0016J\n\u0010=\u001a\u0004\u0018\u000108H\u0016J\b\u0010>\u001a\u000208H\u0016J\u0010\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020\u0012H\u0016J\u0010\u0010@\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010A\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0012H\u0016J\b\u0010F\u001a\u00020GH\u0016J\b\u0010H\u001a\u000208H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "source", "Lokio/Source;", "(Lokio/Source;)V", "buffer", "Lokio/Buffer;", "getBuffer$annotations", "()V", "getBuffer", "()Lokio/Buffer;", "bufferField", "closed", "", "close", "", "exhausted", "indexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "peek", "rangeEquals", "offset", "bytesOffset", "", "byteCount", "read", "sink", "Ljava/nio/ByteBuffer;", "", "readAll", "Lokio/Sink;", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "", "charset", "Ljava/nio/charset/Charset;", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "skip", "timeout", "Lokio/Timeout;", "toString", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RealBufferedSource implements okio.BufferedSource {
    public final okio.Buffer bufferField;
    public boolean closed;
    public final okio.Source source;


    public RealBufferedSource(okio.Source r2) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.source = r2
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            r1.bufferField = r2
            return
    }

    public static /* synthetic */ void getBuffer$annotations() {
            return
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer buffer() {
            r1 = this;
            okio.Buffer r0 = r1.bufferField
            return r0
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto L11
            r0 = 1
            r1.closed = r0
            okio.Source r0 = r1.source
            r0.close()
            okio.Buffer r0 = r1.bufferField
            r0.clear()
        L11:
            return
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
            r4 = this;
            boolean r0 = r4.closed
            if (r0 != 0) goto L20
            okio.Buffer r0 = r4.bufferField
            boolean r0 = r0.exhausted()
            if (r0 == 0) goto L1e
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer getBuffer() {
            r1 = this;
            okio.Buffer r0 = r1.bufferField
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r7) {
            r6 = this;
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r6
            r1 = r7
            long r0 = r0.indexOf(r1, r2, r4)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r7, long r8) {
            r6 = this;
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = r6
            r1 = r7
            r2 = r8
            long r7 = r0.indexOf(r1, r2, r4)
            return r7
    }

    @Override // okio.BufferedSource
    public long indexOf(byte r10, long r11, long r13) {
            r9 = this;
            boolean r0 = r9.closed
            if (r0 != 0) goto L65
            r0 = 0
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 > 0) goto L42
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 > 0) goto L42
        Le:
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r7 = -1
            if (r0 >= 0) goto L41
            okio.Buffer r1 = r9.bufferField
            r2 = r10
            r3 = r11
            r5 = r13
            long r0 = r1.indexOf(r2, r3, r5)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L23
            r7 = r0
            goto L41
        L23:
            okio.Buffer r0 = r9.bufferField
            long r0 = r0.size()
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 >= 0) goto L41
            okio.Source r2 = r9.source
            okio.Buffer r3 = r9.bufferField
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.read(r3, r4)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L3c
            goto L41
        L3c:
            long r11 = java.lang.Math.max(r11, r0)
            goto Le
        L41:
            return r7
        L42:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "fromIndex="
            r10.<init>(r0)
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = " toIndex="
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r13)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        L65:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString r3) {
            r2 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            long r0 = r2.indexOf(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString r9, long r10) {
            r8 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r8.closed
            if (r0 != 0) goto L3a
        L9:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.indexOf(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            goto L2b
        L16:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            r0 = r2
        L2b:
            return r0
        L2c:
            int r2 = r9.size()
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            long r10 = java.lang.Math.max(r10, r0)
            goto L9
        L3a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString r3) {
            r2 = this;
            java.lang.String r0 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            long r0 = r2.indexOfElement(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOfElement(okio.ByteString r9, long r10) {
            r8 = this;
            java.lang.String r0 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r8.closed
            if (r0 != 0) goto L31
        L9:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.indexOfElement(r9, r10)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L16
            goto L2b
        L16:
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            r0 = r2
        L2b:
            return r0
        L2c:
            long r10 = java.lang.Math.max(r10, r0)
            goto L9
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    @Override // okio.BufferedSource
    public java.io.InputStream inputStream() {
            r1 = this;
            okio.RealBufferedSource$inputStream$1 r0 = new okio.RealBufferedSource$inputStream$1
            r0.<init>(r1)
            java.io.InputStream r0 = (java.io.InputStream) r0
            return r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            boolean r0 = r1.closed
            r0 = r0 ^ 1
            return r0
    }

    @Override // okio.BufferedSource
    public okio.BufferedSource peek() {
            r2 = this;
            okio.PeekSource r0 = new okio.PeekSource
            r1 = r2
            okio.BufferedSource r1 = (okio.BufferedSource) r1
            r0.<init>(r1)
            okio.Source r0 = (okio.Source) r0
            okio.BufferedSource r0 = okio.Okio.buffer(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long r8, okio.ByteString r10) {
            r7 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r5 = 0
            int r6 = r10.size()
            r1 = r7
            r2 = r8
            r4 = r10
            boolean r8 = r1.rangeEquals(r2, r4, r5, r6)
            return r8
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long r7, okio.ByteString r9, int r10, int r11) {
            r6 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r6.closed
            if (r0 != 0) goto L3f
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L3e
            if (r10 < 0) goto L3e
            if (r11 < 0) goto L3e
            int r0 = r9.size()
            int r0 = r0 - r10
            if (r0 >= r11) goto L1c
            goto L3e
        L1c:
            r0 = r1
        L1d:
            if (r0 >= r11) goto L3d
            long r2 = (long) r0
            long r2 = r2 + r7
            r4 = 1
            long r4 = r4 + r2
            boolean r4 = r6.request(r4)
            if (r4 != 0) goto L2b
            goto L3e
        L2b:
            okio.Buffer r4 = r6.bufferField
            byte r2 = r4.getByte(r2)
            int r3 = r10 + r0
            byte r3 = r9.getByte(r3)
            if (r2 == r3) goto L3a
            goto L3e
        L3a:
            int r0 = r0 + 1
            goto L1d
        L3d:
            r1 = 1
        L3e:
            return r1
        L3f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer r5) {
            r4 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L23
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L23
            r5 = -1
            return r5
        L23:
            okio.Buffer r0 = r4.bufferField
            int r5 = r0.read(r5)
            return r5
    }

    @Override // okio.BufferedSource
    public int read(byte[] r3) {
            r2 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // okio.BufferedSource
    public int read(byte[] r10, int r11, int r12) {
            r9 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r10.length
            long r1 = (long) r0
            long r3 = (long) r11
            long r7 = (long) r12
            r5 = r7
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.Buffer r12 = r9.bufferField
            long r0 = r12.size()
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L2b
            okio.Source r12 = r9.source
            okio.Buffer r0 = r9.bufferField
            r1 = 8192(0x2000, double:4.0474E-320)
            long r0 = r12.read(r0, r1)
            r2 = -1
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L2b
            r10 = -1
            goto L3c
        L2b:
            okio.Buffer r12 = r9.bufferField
            long r0 = r12.size()
            long r0 = java.lang.Math.min(r7, r0)
            int r12 = (int) r0
            okio.Buffer r0 = r9.bufferField
            int r10 = r0.read(r10, r11, r12)
        L3c:
            return r10
    }

    @Override // okio.Source
    public long read(okio.Buffer r5, long r6) {
            r4 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L47
            boolean r2 = r4.closed
            if (r2 != 0) goto L3b
            okio.Buffer r2 = r4.bufferField
            long r2 = r2.size()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L2a
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            goto L3a
        L2a:
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            long r6 = java.lang.Math.min(r6, r0)
            okio.Buffer r0 = r4.bufferField
            long r2 = r0.read(r5, r6)
        L3a:
            return r2
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L47:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount < 0: "
            r5.<init>(r0)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    @Override // okio.BufferedSource
    public long readAll(okio.Sink r9) {
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            r2 = r0
        L8:
            okio.Source r4 = r8.source
            okio.Buffer r5 = r8.bufferField
            r6 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4.read(r5, r6)
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L29
            okio.Buffer r4 = r8.bufferField
            long r4 = r4.completeSegmentByteCount()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 <= 0) goto L8
            long r2 = r2 + r4
            okio.Buffer r6 = r8.bufferField
            r9.write(r6, r4)
            goto L8
        L29:
            okio.Buffer r4 = r8.bufferField
            long r4 = r4.size()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L43
            okio.Buffer r0 = r8.bufferField
            long r0 = r0.size()
            long r2 = r2 + r0
            okio.Buffer r0 = r8.bufferField
            long r4 = r0.size()
            r9.write(r0, r4)
        L43:
            return r2
    }

    @Override // okio.BufferedSource
    public byte readByte() {
            r2 = this;
            r0 = 1
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            byte r0 = r0.readByte()
            return r0
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
            r2 = this;
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.bufferField
            byte[] r0 = r0.readByteArray()
            return r0
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long r2) {
            r1 = this;
            r1.require(r2)
            okio.Buffer r0 = r1.bufferField
            byte[] r2 = r0.readByteArray(r2)
            return r2
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString() {
            r2 = this;
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.bufferField
            okio.ByteString r0 = r0.readByteString()
            return r0
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString(long r2) {
            r1 = this;
            r1.require(r2)
            okio.Buffer r0 = r1.bufferField
            okio.ByteString r2 = r0.readByteString(r2)
            return r2
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() {
            r10 = this;
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L54
            okio.Buffer r8 = r10.bufferField
            byte r8 = r8.getByte(r4)
            r9 = 48
            if (r8 < r9) goto L1e
            r9 = 57
            if (r8 <= r9) goto L27
        L1e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            r5 = 45
            if (r8 == r5) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r4 == 0) goto L2c
            goto L54
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            r1.<init>(r2)
            r2 = 16
            int r2 = kotlin.text.CharsKt.checkRadix(r2)
            int r2 = kotlin.text.CharsKt.checkRadix(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L54:
            okio.Buffer r0 = r10.bufferField
            long r0 = r0.readDecimalLong()
            return r0
    }

    @Override // okio.BufferedSource
    public void readFully(okio.Buffer r2, long r3) {
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.require(r3)     // Catch: java.io.EOFException -> Le
            okio.Buffer r0 = r1.bufferField
            r0.readFully(r2, r3)
            return
        Le:
            r3 = move-exception
            okio.Buffer r4 = r1.bufferField
            okio.Source r4 = (okio.Source) r4
            r2.writeAll(r4)
            throw r3
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] r7) {
            r6 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r7.length     // Catch: java.io.EOFException -> L10
            long r0 = (long) r0     // Catch: java.io.EOFException -> L10
            r6.require(r0)     // Catch: java.io.EOFException -> L10
            okio.Buffer r0 = r6.bufferField
            r0.readFully(r7)
            return
        L10:
            r0 = move-exception
            r1 = 0
        L12:
            okio.Buffer r2 = r6.bufferField
            long r2 = r2.size()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L34
            okio.Buffer r2 = r6.bufferField
            long r3 = r2.size()
            int r3 = (int) r3
            int r2 = r2.read(r7, r1, r3)
            r3 = -1
            if (r2 == r3) goto L2e
            int r1 = r1 + r2
            goto L12
        L2e:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L34:
            throw r0
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() {
            r5 = this;
            r0 = 1
            r5.require(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L5c
            okio.Buffer r2 = r5.bufferField
            long r3 = (long) r0
            byte r2 = r2.getByte(r3)
            r3 = 48
            if (r2 < r3) goto L1e
            r3 = 57
            if (r2 <= r3) goto L2f
        L1e:
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L2f
        L26:
            r3 = 65
            if (r2 < r3) goto L31
            r3 = 70
            if (r2 <= r3) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L5c
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r3)
            r3 = 16
            int r3 = kotlin.text.CharsKt.checkRadix(r3)
            int r3 = kotlin.text.CharsKt.checkRadix(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5c:
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.readHexadecimalUnsignedLong()
            return r0
    }

    @Override // okio.BufferedSource
    public int readInt() {
            r2 = this;
            r0 = 4
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            int r0 = r0.readInt()
            return r0
    }

    @Override // okio.BufferedSource
    public int readIntLe() {
            r2 = this;
            r0 = 4
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            int r0 = r0.readIntLe()
            return r0
    }

    @Override // okio.BufferedSource
    public long readLong() {
            r2 = this;
            r0 = 8
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            long r0 = r0.readLong()
            return r0
    }

    @Override // okio.BufferedSource
    public long readLongLe() {
            r2 = this;
            r0 = 8
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            long r0 = r0.readLongLe()
            return r0
    }

    @Override // okio.BufferedSource
    public short readShort() {
            r2 = this;
            r0 = 2
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            short r0 = r0.readShort()
            return r0
    }

    @Override // okio.BufferedSource
    public short readShortLe() {
            r2 = this;
            r0 = 2
            r2.require(r0)
            okio.Buffer r0 = r2.bufferField
            short r0 = r0.readShortLe()
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(long r2, java.nio.charset.Charset r4) {
            r1 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.require(r2)
            okio.Buffer r0 = r1.bufferField
            java.lang.String r2 = r0.readString(r2, r4)
            return r2
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(java.nio.charset.Charset r3) {
            r2 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.bufferField
            java.lang.String r3 = r0.readString(r3)
            return r3
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8() {
            r2 = this;
            okio.Buffer r0 = r2.bufferField
            okio.Source r1 = r2.source
            r0.writeAll(r1)
            okio.Buffer r0 = r2.bufferField
            java.lang.String r0 = r0.readUtf8()
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8(long r2) {
            r1 = this;
            r1.require(r2)
            okio.Buffer r0 = r1.bufferField
            java.lang.String r2 = r0.readUtf8(r2)
            return r2
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() {
            r3 = this;
            r0 = 1
            r3.require(r0)
            okio.Buffer r0 = r3.bufferField
            r1 = 0
            byte r0 = r0.getByte(r1)
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r2 = 192(0xc0, float:2.69E-43)
            if (r1 != r2) goto L19
            r0 = 2
            r3.require(r0)
            goto L30
        L19:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r2 = 224(0xe0, float:3.14E-43)
            if (r1 != r2) goto L25
            r0 = 3
            r3.require(r0)
            goto L30
        L25:
            r0 = r0 & 248(0xf8, float:3.48E-43)
            r1 = 240(0xf0, float:3.36E-43)
            if (r0 != r1) goto L30
            r0 = 4
            r3.require(r0)
        L30:
            okio.Buffer r0 = r3.bufferField
            int r0 = r0.readUtf8CodePoint()
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8Line() {
            r4 = this;
            r0 = 10
            long r0 = r4.indexOf(r0)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L25
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            java.lang.String r0 = r4.readUtf8(r0)
            goto L2b
        L23:
            r0 = 0
            goto L2b
        L25:
            okio.Buffer r2 = r4.bufferField
            java.lang.String r0 = okio.internal.Buffer.readUtf8Line(r2, r0)
        L2b:
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict() {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r0 = r2.readUtf8LineStrict(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict(long r14) {
            r13 = this;
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 < 0) goto La9
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L13
            r5 = r0
            goto L15
        L13:
            long r5 = r14 + r3
        L15:
            r8 = 10
            r9 = 0
            r7 = r13
            r11 = r5
            long r7 = r7.indexOf(r8, r9, r11)
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L2c
            okio.Buffer r14 = r13.bufferField
            java.lang.String r14 = okio.internal.Buffer.readUtf8Line(r14, r7)
            goto L59
        L2c:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5a
            boolean r0 = r13.request(r5)
            if (r0 == 0) goto L5a
            okio.Buffer r0 = r13.bufferField
            long r1 = r5 - r3
            byte r0 = r0.getByte(r1)
            r1 = 13
            if (r0 != r1) goto L5a
            long r3 = r3 + r5
            boolean r0 = r13.request(r3)
            if (r0 == 0) goto L5a
            okio.Buffer r0 = r13.bufferField
            byte r0 = r0.getByte(r5)
            r1 = 10
            if (r0 != r1) goto L5a
            okio.Buffer r14 = r13.bufferField
            java.lang.String r14 = okio.internal.Buffer.readUtf8Line(r14, r5)
        L59:
            return r14
        L5a:
            okio.Buffer r6 = new okio.Buffer
            r6.<init>()
            okio.Buffer r0 = r13.bufferField
            long r1 = r0.size()
            r3 = 32
            long r3 = (long) r3
            long r4 = java.lang.Math.min(r3, r1)
            r2 = 0
            r1 = r6
            r0.copyTo(r1, r2, r4)
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\\n not found: limit="
            r1.<init>(r2)
            okio.Buffer r2 = r13.bufferField
            long r2 = r2.size()
            long r14 = java.lang.Math.min(r2, r14)
            java.lang.StringBuilder r14 = r1.append(r14)
            java.lang.String r15 = " content="
            java.lang.StringBuilder r14 = r14.append(r15)
            okio.ByteString r15 = r6.readByteString()
            java.lang.String r15 = r15.hex()
            java.lang.StringBuilder r14 = r14.append(r15)
            r15 = 8230(0x2026, float:1.1533E-41)
            java.lang.StringBuilder r14 = r14.append(r15)
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        La9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "limit < 0: "
            r0.<init>(r1)
            java.lang.StringBuilder r14 = r0.append(r14)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.toString()
            r15.<init>(r14)
            throw r15
    }

    @Override // okio.BufferedSource
    public boolean request(long r5) {
            r4 = this;
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L34
            boolean r0 = r4.closed
            if (r0 != 0) goto L28
        La:
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L26
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto La
            r5 = 0
            goto L27
        L26:
            r5 = 1
        L27:
            return r5
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "byteCount < 0: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    @Override // okio.BufferedSource
    public void require(long r1) {
            r0 = this;
            boolean r1 = r0.request(r1)
            if (r1 == 0) goto L7
            return
        L7:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    @Override // okio.BufferedSource
    public int select(okio.Options r6) {
            r5 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r5.closed
            if (r0 != 0) goto L3b
        L9:
            okio.Buffer r0 = r5.bufferField
            r1 = 1
            int r0 = okio.internal.Buffer.selectPrefix(r0, r6, r1)
            r1 = -2
            r2 = -1
            if (r0 == r1) goto L29
            if (r0 == r2) goto L27
            okio.ByteString[] r6 = r6.getByteStrings$okio()
            r6 = r6[r0]
            int r6 = r6.size()
            okio.Buffer r1 = r5.bufferField
            long r2 = (long) r6
            r1.skip(r2)
            goto L3a
        L27:
            r0 = r2
            goto L3a
        L29:
            okio.Source r0 = r5.source
            okio.Buffer r1 = r5.bufferField
            r3 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r3)
            r3 = -1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L9
            goto L27
        L3a:
            return r0
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    @Override // okio.BufferedSource
    public void skip(long r5) {
            r4 = this;
            boolean r0 = r4.closed
            if (r0 != 0) goto L3d
        L4:
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3c
            okio.Buffer r2 = r4.bufferField
            long r2 = r2.size()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L2b
            okio.Source r0 = r4.source
            okio.Buffer r1 = r4.bufferField
            r2 = 8192(0x2000, double:4.0474E-320)
            long r0 = r0.read(r1, r2)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L25
            goto L2b
        L25:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L2b:
            okio.Buffer r0 = r4.bufferField
            long r0 = r0.size()
            long r0 = java.lang.Math.min(r5, r0)
            okio.Buffer r2 = r4.bufferField
            r2.skip(r0)
            long r5 = r5 - r0
            goto L4
        L3c:
            return
        L3d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "closed"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.Source r0 = r1.source
            okio.Timeout r0 = r0.timeout()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffer("
            r0.<init>(r1)
            okio.Source r1 = r2.source
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
