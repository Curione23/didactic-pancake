package okio;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0090\u0001B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0000H\u0016J\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0000H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\u0000J$\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\fJ \u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0000H\u0016J\b\u0010!\u001a\u00020\u0000H\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020#H\u0016J\b\u0010'\u001a\u00020\u0012H\u0016J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\fH\u0087\u0002¢\u0006\u0002\b+J\u0015\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\fH\u0007¢\u0006\u0002\b-J\b\u0010.\u001a\u00020/H\u0016J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\u001dH\u0002J\u000e\u00102\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00103\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u000e\u00104\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001dJ\u0010\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)H\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\fH\u0016J \u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020)2\u0006\u00107\u001a\u00020\f2\u0006\u00108\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J\u0018\u00105\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\u0010\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001dH\u0016J\u0018\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fH\u0016J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020#H\u0016J\u0006\u0010?\u001a\u00020\u001dJ\b\u0010@\u001a\u00020\u0019H\u0016J\b\u0010A\u001a\u00020\u0001H\u0016J\u0018\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001dH\u0016J(\u0010B\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020GH\u0016J \u0010D\u001a\u00020/2\u0006\u0010E\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010H\u001a\u00020\f2\u0006\u0010E\u001a\u00020IH\u0016J\u0012\u0010J\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010M\u001a\u00020)H\u0016J\b\u0010N\u001a\u00020GH\u0016J\u0010\u0010N\u001a\u00020G2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010O\u001a\u00020\u001dH\u0016J\u0010\u0010O\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010P\u001a\u00020\fH\u0016J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=J\u0016\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\fJ \u0010Q\u001a\u00020\u00122\u0006\u0010R\u001a\u00020=2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010S\u001a\u00020#H\u0002J\u0010\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020GH\u0016J\u0018\u0010T\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010U\u001a\u00020\fH\u0016J\b\u0010V\u001a\u00020/H\u0016J\b\u0010W\u001a\u00020/H\u0016J\b\u0010X\u001a\u00020\fH\u0016J\b\u0010Y\u001a\u00020\fH\u0016J\b\u0010Z\u001a\u00020[H\u0016J\b\u0010\\\u001a\u00020[H\u0016J\u0010\u0010]\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J\u0018\u0010]\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010^\u001a\u00020_H\u0016J\u0012\u0010`\u001a\u00020K2\b\b\u0002\u0010L\u001a\u00020KH\u0007J\b\u0010a\u001a\u00020\u001fH\u0016J\u0010\u0010a\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010b\u001a\u00020/H\u0016J\n\u0010c\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010d\u001a\u00020\u001fH\u0016J\u0010\u0010d\u001a\u00020\u001f2\u0006\u0010e\u001a\u00020\fH\u0016J\u0010\u0010f\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010g\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010h\u001a\u00020/2\u0006\u0010i\u001a\u00020jH\u0016J\u0006\u0010k\u001a\u00020\u001dJ\u0006\u0010l\u001a\u00020\u001dJ\u0006\u0010m\u001a\u00020\u001dJ\r\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0002\bnJ\u0010\u0010o\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0006\u0010p\u001a\u00020\u001dJ\u000e\u0010p\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020/J\b\u0010q\u001a\u00020rH\u0016J\b\u0010s\u001a\u00020\u001fH\u0016J\u0015\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020/H\u0000¢\u0006\u0002\bvJ\u0010\u0010w\u001a\u00020/2\u0006\u0010x\u001a\u00020FH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020GH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020G2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00122\u0006\u0010x\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001dH\u0016J \u0010w\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020/2\u0006\u0010\u001b\u001a\u00020/H\u0016J\u0018\u0010w\u001a\u00020\u00002\u0006\u0010x\u001a\u00020z2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010{\u001a\u00020\f2\u0006\u0010x\u001a\u00020zH\u0016J\u0010\u0010|\u001a\u00020\u00002\u0006\u00106\u001a\u00020/H\u0016J\u0010\u0010}\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0010\u0010\u007f\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020/H\u0016J\u0011\u0010\u0083\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0011\u0010\u0084\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u00020\fH\u0016J\u0012\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u0012\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0086\u0001\u001a\u00020/H\u0016J\u001a\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0006\u0010^\u001a\u00020_H\u0016J,\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/2\u0006\u0010^\u001a\u00020_H\u0016J\u001b\u0010\u008c\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0007J\u0012\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001fH\u0016J$\u0010\u008d\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020\u001f2\u0007\u0010\u008a\u0001\u001a\u00020/2\u0007\u0010\u008b\u0001\u001a\u00020/H\u0016J\u0012\u0010\u008e\u0001\u001a\u00020\u00002\u0007\u0010\u008f\u0001\u001a\u00020/H\u0016R\u0014\u0010\u0006\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0091\u0001"}, d2 = {"Lokio/Buffer;", "Lokio/BufferedSource;", "Lokio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "()V", "buffer", "getBuffer", "()Lokio/Buffer;", "head", "Lokio/Segment;", "<set-?>", "", "size", "()J", "setSize$okio", "(J)V", "clear", "", "clone", "close", "completeSegmentByteCount", "copy", "copyTo", "out", "Ljava/io/OutputStream;", "offset", "byteCount", "digest", "Lokio/ByteString;", "algorithm", "", "emit", "emitCompleteSegments", "equals", "", "other", "", "exhausted", "flush", "get", "", "pos", "getByte", "index", "-deprecated_getByte", "hashCode", "", "hmac", "key", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "b", "fromIndex", "toIndex", "bytes", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "isOpen", "md5", "outputStream", "peek", "rangeEquals", "bytesOffset", "read", "sink", "Ljava/nio/ByteBuffer;", "", "readAll", "Lokio/Sink;", "readAndWriteUnsafe", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFrom", "input", "forever", "readFully", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "charset", "Ljava/nio/charset/Charset;", "readUnsafe", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "sha1", "sha256", "sha512", "-deprecated_size", "skip", "snapshot", "timeout", "Lokio/Timeout;", "toString", "writableSegment", "minimumCapacity", "writableSegment$okio", "write", "source", "byteString", "Lokio/Source;", "writeAll", "writeByte", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", "s", "writeShortLe", "writeString", "string", "beginIndex", "endIndex", "writeTo", "writeUtf8", "writeUtf8CodePoint", "codePoint", "UnsafeCursor", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Buffer implements okio.BufferedSource, okio.BufferedSink, java.lang.Cloneable, java.nio.channels.ByteChannel {
    public okio.Segment head;
    private long size;

    /* JADX INFO: compiled from: Buffer.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lokio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "()V", "buffer", "Lokio/Buffer;", "data", "", "end", "", "offset", "", "readWrite", "", "segment", "Lokio/Segment;", "getSegment$okio", "()Lokio/Segment;", "setSegment$okio", "(Lokio/Segment;)V", "start", "close", "", "expandBuffer", "minByteCount", "next", "resizeBuffer", "newSize", "seek", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnsafeCursor implements java.io.Closeable {
        public okio.Buffer buffer;
        public byte[] data;
        public int end;
        public long offset;
        public boolean readWrite;
        private okio.Segment segment;
        public int start;

        public UnsafeCursor() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.offset = r0
                r0 = -1
                r2.start = r0
                r2.end = r0
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                okio.Buffer r0 = r3.buffer
                if (r0 == 0) goto L16
                r0 = 0
                r3.buffer = r0
                r3.setSegment$okio(r0)
                r1 = -1
                r3.offset = r1
                r3.data = r0
                r0 = -1
                r3.start = r0
                r3.end = r0
                return
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "not attached to a buffer"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public final long expandBuffer(int r10) {
                r9 = this;
                if (r10 <= 0) goto L63
                r0 = 8192(0x2000, float:1.148E-41)
                if (r10 > r0) goto L4a
                okio.Buffer r1 = r9.buffer
                if (r1 == 0) goto L3e
                boolean r2 = r9.readWrite
                if (r2 == 0) goto L32
                long r2 = r1.size()
                okio.Segment r10 = r1.writableSegment$okio(r10)
                int r4 = r10.limit
                int r4 = 8192 - r4
                r10.limit = r0
                long r5 = (long) r4
                long r7 = r2 + r5
                r1.setSize$okio(r7)
                r9.setSegment$okio(r10)
                r9.offset = r2
                byte[] r10 = r10.data
                r9.data = r10
                int r10 = 8192 - r4
                r9.start = r10
                r9.end = r0
                return r5
            L32:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "expandBuffer() only permitted for read/write buffers"
                java.lang.String r0 = r0.toString()
                r10.<init>(r0)
                throw r10
            L3e:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "not attached to a buffer"
                java.lang.String r0 = r0.toString()
                r10.<init>(r0)
                throw r10
            L4a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "minByteCount > Segment.SIZE: "
                r0.<init>(r1)
                java.lang.StringBuilder r10 = r0.append(r10)
                java.lang.String r10 = r10.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r10 = r10.toString()
                r0.<init>(r10)
                throw r0
            L63:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "minByteCount <= 0: "
                r0.<init>(r1)
                java.lang.StringBuilder r10 = r0.append(r10)
                java.lang.String r10 = r10.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r10 = r10.toString()
                r0.<init>(r10)
                throw r0
        }

        public final okio.Segment getSegment$okio() {
                r1 = this;
                okio.Segment r0 = r1.segment
                return r0
        }

        public final int next() {
                r4 = this;
                long r0 = r4.offset
                okio.Buffer r2 = r4.buffer
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                long r2 = r2.size()
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L26
                long r0 = r4.offset
                r2 = -1
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L1a
                r0 = 0
                goto L21
            L1a:
                int r2 = r4.end
                int r3 = r4.start
                int r2 = r2 - r3
                long r2 = (long) r2
                long r0 = r0 + r2
            L21:
                int r0 = r4.seek(r0)
                return r0
            L26:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "no more bytes"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public final long resizeBuffer(long r14) {
                r13 = this;
                okio.Buffer r0 = r13.buffer
                if (r0 == 0) goto Lad
                boolean r1 = r13.readWrite
                if (r1 == 0) goto La1
                long r1 = r0.size()
                int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                r4 = 0
                if (r3 > 0) goto L68
                int r3 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
                if (r3 < 0) goto L4f
                long r6 = r1 - r14
            L18:
                int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r3 <= 0) goto L41
                okio.Segment r3 = r0.head
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                okio.Segment r3 = r3.prev
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r8 = r3.limit
                int r9 = r3.pos
                int r8 = r8 - r9
                long r8 = (long) r8
                int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r10 > 0) goto L3b
                okio.Segment r10 = r3.pop()
                r0.head = r10
                okio.SegmentPool.recycle(r3)
                long r6 = r6 - r8
                goto L18
            L3b:
                int r4 = r3.limit
                int r5 = (int) r6
                int r4 = r4 - r5
                r3.limit = r4
            L41:
                r3 = 0
                r13.setSegment$okio(r3)
                r13.offset = r14
                r13.data = r3
                r3 = -1
                r13.start = r3
                r13.end = r3
                goto L9d
            L4f:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "newSize < 0: "
                r0.<init>(r1)
                java.lang.StringBuilder r14 = r0.append(r14)
                java.lang.String r14 = r14.toString()
                java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
                java.lang.String r14 = r14.toString()
                r15.<init>(r14)
                throw r15
            L68:
                if (r3 <= 0) goto L9d
                long r6 = r14 - r1
                r3 = 1
                r8 = r3
            L6e:
                int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r9 <= 0) goto L9d
                okio.Segment r9 = r0.writableSegment$okio(r3)
                int r10 = r9.limit
                int r10 = 8192 - r10
                long r10 = (long) r10
                long r10 = java.lang.Math.min(r6, r10)
                int r10 = (int) r10
                int r11 = r9.limit
                int r11 = r11 + r10
                r9.limit = r11
                long r11 = (long) r10
                long r6 = r6 - r11
                if (r8 == 0) goto L6e
                r13.setSegment$okio(r9)
                r13.offset = r1
                byte[] r8 = r9.data
                r13.data = r8
                int r8 = r9.limit
                int r8 = r8 - r10
                r13.start = r8
                int r8 = r9.limit
                r13.end = r8
                r8 = 0
                goto L6e
            L9d:
                r0.setSize$okio(r14)
                return r1
            La1:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "resizeBuffer() only permitted for read/write buffers"
                java.lang.String r15 = r15.toString()
                r14.<init>(r15)
                throw r14
            Lad:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "not attached to a buffer"
                java.lang.String r15 = r15.toString()
                r14.<init>(r15)
                throw r14
        }

        public final int seek(long r13) {
                r12 = this;
                okio.Buffer r0 = r12.buffer
                if (r0 == 0) goto Lf0
                r1 = -1
                int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
                if (r1 < 0) goto Lcd
                long r2 = r0.size()
                int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
                if (r2 > 0) goto Lcd
                if (r1 == 0) goto Lbf
                long r1 = r0.size()
                int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
                if (r1 != 0) goto L1e
                goto Lbf
            L1e:
                long r1 = r0.size()
                okio.Segment r3 = r0.head
                okio.Segment r4 = r0.head
                okio.Segment r5 = r12.getSegment$okio()
                r6 = 0
                if (r5 == 0) goto L4d
                long r8 = r12.offset
                int r5 = r12.start
                okio.Segment r10 = r12.getSegment$okio()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
                int r10 = r10.pos
                int r5 = r5 - r10
                long r10 = (long) r5
                long r8 = r8 - r10
                int r5 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r5 <= 0) goto L48
                okio.Segment r4 = r12.getSegment$okio()
                r1 = r8
                goto L4d
            L48:
                okio.Segment r3 = r12.getSegment$okio()
                r6 = r8
            L4d:
                long r8 = r1 - r13
                long r10 = r13 - r6
                int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r5 <= 0) goto L6d
            L55:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                int r1 = r3.limit
                int r2 = r3.pos
                int r1 = r1 - r2
                long r1 = (long) r1
                long r1 = r1 + r6
                int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
                if (r1 < 0) goto L83
                int r1 = r3.limit
                int r2 = r3.pos
                int r1 = r1 - r2
                long r1 = (long) r1
                long r6 = r6 + r1
                okio.Segment r3 = r3.next
                goto L55
            L6d:
                int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
                if (r3 <= 0) goto L81
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                okio.Segment r4 = r4.prev
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                int r3 = r4.limit
                int r5 = r4.pos
                int r3 = r3 - r5
                long r5 = (long) r3
                long r1 = r1 - r5
                goto L6d
            L81:
                r6 = r1
                r3 = r4
            L83:
                boolean r1 = r12.readWrite
                if (r1 == 0) goto La4
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                boolean r1 = r3.shared
                if (r1 == 0) goto La4
                okio.Segment r1 = r3.unsharedCopy()
                okio.Segment r2 = r0.head
                if (r2 != r3) goto L98
                r0.head = r1
            L98:
                okio.Segment r3 = r3.push(r1)
                okio.Segment r0 = r3.prev
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r0.pop()
            La4:
                r12.setSegment$okio(r3)
                r12.offset = r13
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                byte[] r0 = r3.data
                r12.data = r0
                int r0 = r3.pos
                long r13 = r13 - r6
                int r13 = (int) r13
                int r0 = r0 + r13
                r12.start = r0
                int r13 = r3.limit
                r12.end = r13
                int r14 = r12.start
                int r13 = r13 - r14
                goto Lcc
            Lbf:
                r0 = 0
                r12.setSegment$okio(r0)
                r12.offset = r13
                r12.data = r0
                r13 = -1
                r12.start = r13
                r12.end = r13
            Lcc:
                return r13
            Lcd:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "offset="
                r2.<init>(r3)
                java.lang.StringBuilder r13 = r2.append(r13)
                java.lang.String r14 = " > size="
                java.lang.StringBuilder r13 = r13.append(r14)
                long r2 = r0.size()
                java.lang.StringBuilder r13 = r13.append(r2)
                java.lang.String r13 = r13.toString()
                r1.<init>(r13)
                throw r1
            Lf0:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "not attached to a buffer"
                java.lang.String r14 = r14.toString()
                r13.<init>(r14)
                throw r13
        }

        public final void setSegment$okio(okio.Segment r1) {
                r0 = this;
                r0.segment = r1
                return
        }
    }



    public Buffer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer r6, java.io.OutputStream r7, long r8, long r10, int r12, java.lang.Object r13) throws java.io.IOException {
            r13 = r12 & 2
            if (r13 == 0) goto L6
            r8 = 0
        L6:
            r2 = r8
            r8 = r12 & 4
            if (r8 == 0) goto Lf
            long r8 = r6.size
            long r10 = r8 - r2
        Lf:
            r4 = r10
            r0 = r6
            r1 = r7
            okio.Buffer r6 = r0.copyTo(r1, r2, r4)
            return r6
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer r0, okio.Buffer r1, long r2, int r4, java.lang.Object r5) {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            r2 = 0
        L6:
            okio.Buffer r0 = r0.copyTo(r1, r2)
            return r0
    }

    public static /* synthetic */ okio.Buffer copyTo$default(okio.Buffer r6, okio.Buffer r7, long r8, long r10, int r12, java.lang.Object r13) {
            r12 = r12 & 2
            if (r12 == 0) goto L6
            r8 = 0
        L6:
            r2 = r8
            r0 = r6
            r1 = r7
            r4 = r10
            okio.Buffer r6 = r0.copyTo(r1, r2, r4)
            return r6
    }

    private final okio.ByteString digest(java.lang.String r7) {
            r6 = this;
            java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)
            okio.Segment r0 = r6.head
            if (r0 == 0) goto L2d
            byte[] r1 = r0.data
            int r2 = r0.pos
            int r3 = r0.limit
            int r4 = r0.pos
            int r3 = r3 - r4
            r7.update(r1, r2, r3)
            okio.Segment r1 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
        L19:
            if (r1 == r0) goto L2d
            byte[] r2 = r1.data
            int r3 = r1.pos
            int r4 = r1.limit
            int r5 = r1.pos
            int r4 = r4 - r5
            r7.update(r2, r3, r4)
            okio.Segment r1 = r1.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            goto L19
        L2d:
            okio.ByteString r0 = new okio.ByteString
            byte[] r7 = r7.digest()
            java.lang.String r1 = "digest(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)
            r0.<init>(r7)
            return r0
    }

    private final okio.ByteString hmac(java.lang.String r6, okio.ByteString r7) {
            r5 = this;
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r6)     // Catch: java.security.InvalidKeyException -> L4a
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L4a
            byte[] r7 = r7.internalArray$okio()     // Catch: java.security.InvalidKeyException -> L4a
            r1.<init>(r7, r6)     // Catch: java.security.InvalidKeyException -> L4a
            java.security.Key r1 = (java.security.Key) r1     // Catch: java.security.InvalidKeyException -> L4a
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L4a
            okio.Segment r6 = r5.head     // Catch: java.security.InvalidKeyException -> L4a
            if (r6 == 0) goto L3b
            byte[] r7 = r6.data     // Catch: java.security.InvalidKeyException -> L4a
            int r1 = r6.pos     // Catch: java.security.InvalidKeyException -> L4a
            int r2 = r6.limit     // Catch: java.security.InvalidKeyException -> L4a
            int r3 = r6.pos     // Catch: java.security.InvalidKeyException -> L4a
            int r2 = r2 - r3
            r0.update(r7, r1, r2)     // Catch: java.security.InvalidKeyException -> L4a
            okio.Segment r7 = r6.next     // Catch: java.security.InvalidKeyException -> L4a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)     // Catch: java.security.InvalidKeyException -> L4a
        L27:
            if (r7 == r6) goto L3b
            byte[] r1 = r7.data     // Catch: java.security.InvalidKeyException -> L4a
            int r2 = r7.pos     // Catch: java.security.InvalidKeyException -> L4a
            int r3 = r7.limit     // Catch: java.security.InvalidKeyException -> L4a
            int r4 = r7.pos     // Catch: java.security.InvalidKeyException -> L4a
            int r3 = r3 - r4
            r0.update(r1, r2, r3)     // Catch: java.security.InvalidKeyException -> L4a
            okio.Segment r7 = r7.next     // Catch: java.security.InvalidKeyException -> L4a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)     // Catch: java.security.InvalidKeyException -> L4a
            goto L27
        L3b:
            okio.ByteString r6 = new okio.ByteString     // Catch: java.security.InvalidKeyException -> L4a
            byte[] r7 = r0.doFinal()     // Catch: java.security.InvalidKeyException -> L4a
            java.lang.String r0 = "doFinal(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)     // Catch: java.security.InvalidKeyException -> L4a
            r6.<init>(r7)     // Catch: java.security.InvalidKeyException -> L4a
            return r6
        L4a:
            r6 = move-exception
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            r7.<init>(r6)
            throw r7
    }

    public static /* synthetic */ okio.Buffer.UnsafeCursor readAndWriteUnsafe$default(okio.Buffer r0, okio.Buffer.UnsafeCursor r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L8
            okio.Buffer$UnsafeCursor r1 = okio.SegmentedByteString.getDEFAULT__new_UnsafeCursor()
        L8:
            okio.Buffer$UnsafeCursor r0 = r0.readAndWriteUnsafe(r1)
            return r0
    }

    private final void readFrom(java.io.InputStream r5, long r6, boolean r8) throws java.io.IOException {
            r4 = this;
        L0:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto La
            if (r8 == 0) goto L9
            goto La
        L9:
            return
        La:
            r0 = 1
            okio.Segment r0 = r4.writableSegment$okio(r0)
            int r1 = r0.limit
            int r1 = 8192 - r1
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r6, r1)
            int r1 = (int) r1
            byte[] r2 = r0.data
            int r3 = r0.limit
            int r1 = r5.read(r2, r3, r1)
            r2 = -1
            if (r1 != r2) goto L3c
            int r5 = r0.pos
            int r6 = r0.limit
            if (r5 != r6) goto L33
            okio.Segment r5 = r0.pop()
            r4.head = r5
            okio.SegmentPool.recycle(r0)
        L33:
            if (r8 == 0) goto L36
            return
        L36:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L3c:
            int r2 = r0.limit
            int r2 = r2 + r1
            r0.limit = r2
            long r2 = r4.size
            long r0 = (long) r1
            long r2 = r2 + r0
            r4.size = r2
            long r6 = r6 - r0
            goto L0
    }

    public static /* synthetic */ okio.Buffer.UnsafeCursor readUnsafe$default(okio.Buffer r0, okio.Buffer.UnsafeCursor r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L8
            okio.Buffer$UnsafeCursor r1 = okio.SegmentedByteString.getDEFAULT__new_UnsafeCursor()
        L8:
            okio.Buffer$UnsafeCursor r0 = r0.readUnsafe(r1)
            return r0
    }

    public static /* synthetic */ okio.Buffer writeTo$default(okio.Buffer r0, java.io.OutputStream r1, long r2, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            long r2 = r0.size
        L6:
            okio.Buffer r0 = r0.writeTo(r1, r2)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to operator function", replaceWith = @kotlin.ReplaceWith(expression = "this[index]", imports = {}))
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m2514deprecated_getByte(long r1) {
            r0 = this;
            byte r1 = r0.getByte(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "size", imports = {}))
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final long m2515deprecated_size() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer buffer() {
            r0 = this;
            return r0
    }

    public final void clear() {
            r2 = this;
            long r0 = r2.size()
            r2.skip(r0)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            okio.Buffer r0 = r1.m2516clone()
            return r0
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public okio.Buffer m2516clone() {
            r1 = this;
            okio.Buffer r0 = r1.copy()
            return r0
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    public final long completeSegmentByteCount() {
            r5 = this;
            long r0 = r5.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lb
            goto L27
        Lb:
            okio.Segment r2 = r5.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okio.Segment r2 = r2.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.limit
            r4 = 8192(0x2000, float:1.148E-41)
            if (r3 >= r4) goto L26
            boolean r3 = r2.owner
            if (r3 == 0) goto L26
            int r3 = r2.limit
            int r2 = r2.pos
            int r3 = r3 - r2
            long r2 = (long) r3
            long r0 = r0 - r2
        L26:
            r2 = r0
        L27:
            return r2
    }

    public final okio.Buffer copy() {
            r6 = this;
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            long r1 = r6.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L10
            goto L3e
        L10:
            okio.Segment r1 = r6.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.Segment r2 = r1.sharedCopy()
            r0.head = r2
            r2.prev = r2
            okio.Segment r3 = r2.prev
            r2.next = r3
            okio.Segment r3 = r1.next
        L23:
            if (r3 == r1) goto L37
            okio.Segment r4 = r2.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r5 = r3.sharedCopy()
            r4.push(r5)
            okio.Segment r3 = r3.next
            goto L23
        L37:
            long r1 = r6.size()
            r0.setSize$okio(r1)
        L3e:
            return r0
    }

    public final okio.Buffer copyTo(java.io.OutputStream r10) throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r7 = 6
            r8 = 0
            r3 = 0
            r5 = 0
            r1 = r9
            r2 = r10
            okio.Buffer r10 = copyTo$default(r1, r2, r3, r5, r7, r8)
            return r10
    }

    public final okio.Buffer copyTo(java.io.OutputStream r10, long r11) throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r7 = 4
            r8 = 0
            r5 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            okio.Buffer r10 = copyTo$default(r1, r2, r3, r5, r7, r8)
            return r10
    }

    public final okio.Buffer copyTo(java.io.OutputStream r8, long r9, long r11) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            long r1 = r7.size
            r3 = r9
            r5 = r11
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 != 0) goto L13
            return r7
        L13:
            okio.Segment r2 = r7.head
        L15:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.limit
            int r4 = r2.pos
            int r3 = r3 - r4
            long r3 = (long) r3
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 < 0) goto L2c
            int r3 = r2.limit
            int r4 = r2.pos
            int r3 = r3 - r4
            long r3 = (long) r3
            long r9 = r9 - r3
            okio.Segment r2 = r2.next
            goto L15
        L2c:
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 <= 0) goto L4c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.pos
            long r3 = (long) r3
            long r3 = r3 + r9
            int r9 = (int) r3
            int r10 = r2.limit
            int r10 = r10 - r9
            long r3 = (long) r10
            long r3 = java.lang.Math.min(r3, r11)
            int r10 = (int) r3
            byte[] r3 = r2.data
            r8.write(r3, r9, r10)
            long r9 = (long) r10
            long r11 = r11 - r9
            okio.Segment r2 = r2.next
            r9 = r0
            goto L2c
        L4c:
            return r7
    }

    public final okio.Buffer copyTo(okio.Buffer r9, long r10) {
            r8 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r0 = r8.size
            long r6 = r0 - r10
            r2 = r8
            r3 = r9
            r4 = r10
            okio.Buffer r9 = r2.copyTo(r3, r4, r6)
            return r9
    }

    public final okio.Buffer copyTo(okio.Buffer r8, long r9, long r11) {
            r7 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            long r1 = r7.size()
            r3 = r9
            r5 = r11
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 != 0) goto L15
            goto L78
        L15:
            long r2 = r8.size()
            long r2 = r2 + r11
            r8.setSize$okio(r2)
            okio.Segment r2 = r7.head
        L1f:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.limit
            int r4 = r2.pos
            int r3 = r3 - r4
            long r3 = (long) r3
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 < 0) goto L36
            int r3 = r2.limit
            int r4 = r2.pos
            int r3 = r3 - r4
            long r3 = (long) r3
            long r9 = r9 - r3
            okio.Segment r2 = r2.next
            goto L1f
        L36:
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 <= 0) goto L78
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okio.Segment r3 = r2.sharedCopy()
            int r4 = r3.pos
            int r9 = (int) r9
            int r4 = r4 + r9
            r3.pos = r4
            int r9 = r3.pos
            int r10 = (int) r11
            int r9 = r9 + r10
            int r10 = r3.limit
            int r9 = java.lang.Math.min(r9, r10)
            r3.limit = r9
            okio.Segment r9 = r8.head
            if (r9 != 0) goto L62
            r3.prev = r3
            okio.Segment r9 = r3.prev
            r3.next = r9
            okio.Segment r9 = r3.next
            r8.head = r9
            goto L6d
        L62:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            okio.Segment r9 = r9.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            r9.push(r3)
        L6d:
            int r9 = r3.limit
            int r10 = r3.pos
            int r9 = r9 - r10
            long r9 = (long) r9
            long r11 = r11 - r9
            okio.Segment r2 = r2.next
            r9 = r0
            goto L36
        L78:
            return r7
    }

    @Override // okio.BufferedSink
    public okio.Buffer emit() {
            r0 = this;
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink emit() {
            r1 = this;
            okio.Buffer r0 = r1.emit()
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer emitCompleteSegments() {
            r0 = this;
            return r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink emitCompleteSegments() {
            r1 = this;
            okio.Buffer r0 = r1.emitCompleteSegments()
            okio.BufferedSink r0 = (okio.BufferedSink) r0
            return r0
    }

    public boolean equals(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L9
            goto L81
        L9:
            boolean r3 = r1 instanceof okio.Buffer
            r4 = 0
            if (r3 != 0) goto L11
        Le:
            r2 = r4
            goto L81
        L11:
            long r5 = r18.size()
            okio.Buffer r1 = (okio.Buffer) r1
            long r7 = r1.size()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L20
            goto Le
        L20:
            long r5 = r18.size()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L2b
            goto L81
        L2b:
            okio.Segment r3 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r1 = r1.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r5 = r3.pos
            int r6 = r1.pos
            r9 = r7
        L3a:
            long r11 = r18.size()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L81
            int r11 = r3.limit
            int r11 = r11 - r5
            int r12 = r1.limit
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L4e:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L69
            byte[] r15 = r3.data
            int r16 = r5 + 1
            r5 = r15[r5]
            byte[] r15 = r1.data
            int r17 = r6 + 1
            r6 = r15[r6]
            if (r5 == r6) goto L61
            goto Le
        L61:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L4e
        L69:
            int r13 = r3.limit
            if (r5 != r13) goto L74
            okio.Segment r3 = r3.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r5 = r3.pos
        L74:
            int r13 = r1.limit
            if (r6 != r13) goto L7f
            okio.Segment r1 = r1.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r6 = r1.pos
        L7f:
            long r9 = r9 + r11
            goto L3a
        L81:
            return r2
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
            r4 = this;
            long r0 = r4.size
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
            r0 = this;
            return
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public okio.Buffer getBuffer() {
            r0 = this;
            return r0
    }

    public final byte getByte(long r7) {
            r6 = this;
            long r0 = r6.size()
            r4 = 1
            r2 = r7
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            okio.Segment r0 = r6.head
            if (r0 == 0) goto L5c
            long r1 = r6.size()
            long r1 = r1 - r7
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L3a
            long r1 = r6.size()
        L1b:
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 <= 0) goto L2c
            okio.Segment r0 = r0.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r3 = r0.limit
            int r4 = r0.pos
            int r3 = r3 - r4
            long r3 = (long) r3
            long r1 = r1 - r3
            goto L1b
        L2c:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            byte[] r3 = r0.data
            int r0 = r0.pos
            long r4 = (long) r0
            long r4 = r4 + r7
            long r4 = r4 - r1
            int r7 = (int) r4
            r7 = r3[r7]
            goto L5b
        L3a:
            r1 = 0
        L3c:
            int r3 = r0.limit
            int r4 = r0.pos
            int r3 = r3 - r4
            long r3 = (long) r3
            long r3 = r3 + r1
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 > 0) goto L4e
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r3
            goto L3c
        L4e:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            byte[] r3 = r0.data
            int r0 = r0.pos
            long r4 = (long) r0
            long r4 = r4 + r7
            long r4 = r4 - r1
            int r7 = (int) r4
            r7 = r3[r7]
        L5b:
            return r7
        L5c:
            r7 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            byte[] r8 = r7.data
            throw r7
    }

    public int hashCode() {
            r5 = this;
            okio.Segment r0 = r5.head
            if (r0 != 0) goto L6
            r0 = 0
            goto L21
        L6:
            r1 = 1
        L7:
            int r2 = r0.pos
            int r3 = r0.limit
        Lb:
            if (r2 >= r3) goto L17
            int r1 = r1 * 31
            byte[] r4 = r0.data
            r4 = r4[r2]
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto Lb
        L17:
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okio.Segment r2 = r5.head
            if (r0 != r2) goto L7
            r0 = r1
        L21:
            return r0
    }

    public final okio.ByteString hmacSha1(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "HmacSHA1"
            okio.ByteString r2 = r1.hmac(r0, r2)
            return r2
    }

    public final okio.ByteString hmacSha256(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "HmacSHA256"
            okio.ByteString r2 = r1.hmac(r0, r2)
            return r2
    }

    public final okio.ByteString hmacSha512(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "HmacSHA512"
            okio.ByteString r2 = r1.hmac(r0, r2)
            return r2
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
    public long indexOf(byte r11, long r12, long r14) {
            r10 = this;
            r0 = 0
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 > 0) goto Lc4
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 > 0) goto Lc4
            long r2 = r10.size()
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 <= 0) goto L16
            long r14 = r10.size()
        L16:
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r3 = -1
            if (r2 != 0) goto L1e
            goto Lc3
        L1e:
            okio.Segment r2 = r10.head
            if (r2 != 0) goto L24
            goto Lc3
        L24:
            long r5 = r10.size()
            long r5 = r5 - r12
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 >= 0) goto L77
            long r0 = r10.size()
        L31:
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 <= 0) goto L42
            okio.Segment r2 = r2.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r5 = r2.limit
            int r6 = r2.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r0 = r0 - r5
            goto L31
        L42:
            if (r2 != 0) goto L46
            goto Lc3
        L46:
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r5 >= 0) goto Lc3
            byte[] r5 = r2.data
            int r6 = r2.limit
            long r6 = (long) r6
            int r8 = r2.pos
            long r8 = (long) r8
            long r8 = r8 + r14
            long r8 = r8 - r0
            long r6 = java.lang.Math.min(r6, r8)
            int r6 = (int) r6
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r12
            long r7 = r7 - r0
            int r12 = (int) r7
        L5f:
            if (r12 >= r6) goto L69
            r13 = r5[r12]
            if (r13 != r11) goto L66
            goto Lab
        L66:
            int r12 = r12 + 1
            goto L5f
        L69:
            int r12 = r2.limit
            int r13 = r2.pos
            int r12 = r12 - r13
            long r12 = (long) r12
            long r0 = r0 + r12
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r12 = r0
            goto L46
        L77:
            int r5 = r2.limit
            int r6 = r2.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r5 = r5 + r0
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 > 0) goto L89
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0 = r5
            goto L77
        L89:
            if (r2 != 0) goto L8c
            goto Lc3
        L8c:
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r5 >= 0) goto Lc3
            byte[] r5 = r2.data
            int r6 = r2.limit
            long r6 = (long) r6
            int r8 = r2.pos
            long r8 = (long) r8
            long r8 = r8 + r14
            long r8 = r8 - r0
            long r6 = java.lang.Math.min(r6, r8)
            int r6 = (int) r6
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r12
            long r7 = r7 - r0
            int r12 = (int) r7
        La5:
            if (r12 >= r6) goto Lb5
            r13 = r5[r12]
            if (r13 != r11) goto Lb2
        Lab:
            int r11 = r2.pos
            int r12 = r12 - r11
            long r11 = (long) r12
            long r3 = r11 + r0
            goto Lc3
        Lb2:
            int r12 = r12 + 1
            goto La5
        Lb5:
            int r12 = r2.limit
            int r13 = r2.pos
            int r12 = r12 - r13
            long r12 = (long) r12
            long r0 = r0 + r12
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r12 = r0
            goto L8c
        Lc3:
            return r3
        Lc4:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "size="
            r11.<init>(r0)
            long r0 = r10.size()
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.String r0 = " fromIndex="
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = " toIndex="
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r14)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            long r0 = r2.indexOf(r3, r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long indexOf(okio.ByteString r19, long r20) throws java.io.IOException {
            r18 = this;
            r0 = r20
            java.lang.String r2 = "bytes"
            r3 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            int r2 = r19.size()
            if (r2 <= 0) goto L117
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto Lfc
            r2 = r18
            okio.Segment r6 = r2.head
            if (r6 != 0) goto L1f
        L1b:
            r7 = -1
            goto Lfb
        L1f:
            long r9 = r18.size()
            long r9 = r9 - r0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r10 = 1
            r12 = 0
            if (r9 >= 0) goto L92
            long r4 = r18.size()
        L2f:
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 <= 0) goto L40
            okio.Segment r6 = r6.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            int r9 = r6.limit
            int r14 = r6.pos
            int r9 = r9 - r14
            long r14 = (long) r9
            long r4 = r4 - r14
            goto L2f
        L40:
            if (r6 != 0) goto L43
            goto L1b
        L43:
            byte[] r9 = r19.internalArray$okio()
            r12 = r9[r12]
            int r3 = r19.size()
            long r14 = r18.size()
            long r7 = (long) r3
            long r14 = r14 - r7
            long r14 = r14 + r10
        L54:
            int r7 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r7 >= 0) goto L1b
            byte[] r7 = r6.data
            int r8 = r6.limit
            int r10 = r6.pos
            long r10 = (long) r10
            long r10 = r10 + r14
            long r10 = r10 - r4
            r16 = r14
            long r13 = (long) r8
            long r10 = java.lang.Math.min(r13, r10)
            int r8 = (int) r10
            int r10 = r6.pos
            long r10 = (long) r10
            long r10 = r10 + r0
            long r10 = r10 - r4
            int r0 = (int) r10
        L6f:
            if (r0 >= r8) goto L82
            r1 = r7[r0]
            if (r1 != r12) goto L7f
            int r1 = r0 + 1
            r10 = 1
            boolean r1 = okio.internal.Buffer.rangeEquals(r6, r1, r9, r10, r3)
            if (r1 == 0) goto L7f
            goto Le1
        L7f:
            int r0 = r0 + 1
            goto L6f
        L82:
            int r0 = r6.limit
            int r1 = r6.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r4 = r4 + r0
            okio.Segment r6 = r6.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r0 = r4
            r14 = r16
            goto L54
        L92:
            int r7 = r6.limit
            int r8 = r6.pos
            int r7 = r7 - r8
            long r7 = (long) r7
            long r7 = r7 + r4
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 > 0) goto La4
            okio.Segment r6 = r6.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r4 = r7
            goto L92
        La4:
            if (r6 != 0) goto La8
            goto L1b
        La8:
            byte[] r7 = r19.internalArray$okio()
            r8 = r7[r12]
            int r3 = r19.size()
            long r12 = r18.size()
            long r14 = (long) r3
            long r12 = r12 - r14
            long r12 = r12 + r10
        Lb9:
            int r9 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r9 >= 0) goto L1b
            byte[] r9 = r6.data
            int r10 = r6.limit
            int r11 = r6.pos
            long r14 = (long) r11
            long r14 = r14 + r12
            long r14 = r14 - r4
            long r10 = (long) r10
            long r10 = java.lang.Math.min(r10, r14)
            int r10 = (int) r10
            int r11 = r6.pos
            long r14 = (long) r11
            long r14 = r14 + r0
            long r14 = r14 - r4
            int r0 = (int) r14
        Ld2:
            if (r0 >= r10) goto Lec
            r1 = r9[r0]
            if (r1 != r8) goto Le8
            int r1 = r0 + 1
            r11 = 1
            boolean r1 = okio.internal.Buffer.rangeEquals(r6, r1, r7, r11, r3)
            if (r1 == 0) goto Le9
        Le1:
            int r1 = r6.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r7 = r0 + r4
            goto Lfb
        Le8:
            r11 = 1
        Le9:
            int r0 = r0 + 1
            goto Ld2
        Lec:
            r11 = 1
            int r0 = r6.limit
            int r1 = r6.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r4 = r4 + r0
            okio.Segment r6 = r6.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r0 = r4
            goto Lb9
        Lfb:
            return r7
        Lfc:
            r2 = r18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "fromIndex < 0: "
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L117:
            r2 = r18
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bytes is empty"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
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
    public long indexOfElement(okio.ByteString r12, long r13) {
            r11 = this;
            java.lang.String r0 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L13c
            okio.Segment r2 = r11.head
            r3 = -1
            if (r2 != 0) goto L13
            goto L13b
        L13:
            long r5 = r11.size()
            long r5 = r5 - r13
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 >= 0) goto Lab
            long r0 = r11.size()
        L23:
            int r5 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r5 <= 0) goto L34
            okio.Segment r2 = r2.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r5 = r2.limit
            int r9 = r2.pos
            int r5 = r5 - r9
            long r9 = (long) r5
            long r0 = r0 - r9
            goto L23
        L34:
            if (r2 != 0) goto L38
            goto L13b
        L38:
            int r5 = r12.size()
            if (r5 != r6) goto L73
            byte r5 = r12.getByte(r7)
            byte r12 = r12.getByte(r8)
        L46:
            long r6 = r11.size()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L13b
            byte[] r6 = r2.data
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r2.limit
        L58:
            if (r13 >= r14) goto L65
            r7 = r6[r13]
            if (r7 == r5) goto Led
            if (r7 != r12) goto L62
            goto Led
        L62:
            int r13 = r13 + 1
            goto L58
        L65:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r13 = r0
            goto L46
        L73:
            byte[] r12 = r12.internalArray$okio()
        L77:
            long r5 = r11.size()
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L13b
            byte[] r5 = r2.data
            int r6 = r2.pos
            long r8 = (long) r6
            long r8 = r8 + r13
            long r8 = r8 - r0
            int r13 = (int) r8
            int r14 = r2.limit
        L89:
            if (r13 >= r14) goto L9d
            r6 = r5[r13]
            int r8 = r12.length
            r9 = r7
        L8f:
            if (r9 >= r8) goto L9a
            r10 = r12[r9]
            if (r6 != r10) goto L97
            goto L124
        L97:
            int r9 = r9 + 1
            goto L8f
        L9a:
            int r13 = r13 + 1
            goto L89
        L9d:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r13 = r0
            goto L77
        Lab:
            int r5 = r2.limit
            int r9 = r2.pos
            int r5 = r5 - r9
            long r9 = (long) r5
            long r9 = r9 + r0
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 > 0) goto Lbd
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0 = r9
            goto Lab
        Lbd:
            if (r2 != 0) goto Lc1
            goto L13b
        Lc1:
            int r5 = r12.size()
            if (r5 != r6) goto L102
            byte r5 = r12.getByte(r7)
            byte r12 = r12.getByte(r8)
        Lcf:
            long r6 = r11.size()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L13b
            byte[] r6 = r2.data
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r2.limit
        Le1:
            if (r13 >= r14) goto Lf4
            r7 = r6[r13]
            if (r7 == r5) goto Led
            if (r7 != r12) goto Lea
            goto Led
        Lea:
            int r13 = r13 + 1
            goto Le1
        Led:
            int r12 = r2.pos
        Lef:
            int r13 = r13 - r12
            long r12 = (long) r13
            long r3 = r12 + r0
            goto L13b
        Lf4:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r13 = r0
            goto Lcf
        L102:
            byte[] r12 = r12.internalArray$okio()
        L106:
            long r5 = r11.size()
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L13b
            byte[] r5 = r2.data
            int r6 = r2.pos
            long r8 = (long) r6
            long r8 = r8 + r13
            long r8 = r8 - r0
            int r13 = (int) r8
            int r14 = r2.limit
        L118:
            if (r13 >= r14) goto L12d
            r6 = r5[r13]
            int r8 = r12.length
            r9 = r7
        L11e:
            if (r9 >= r8) goto L12a
            r10 = r12[r9]
            if (r6 != r10) goto L127
        L124:
            int r12 = r2.pos
            goto Lef
        L127:
            int r9 = r9 + 1
            goto L11e
        L12a:
            int r13 = r13 + 1
            goto L118
        L12d:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r13 = r0
            goto L106
        L13b:
            return r3
        L13c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "fromIndex < 0: "
            r12.<init>(r0)
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
    }

    @Override // okio.BufferedSource
    public java.io.InputStream inputStream() {
            r1 = this;
            okio.Buffer$inputStream$1 r0 = new okio.Buffer$inputStream$1
            r0.<init>(r1)
            java.io.InputStream r0 = (java.io.InputStream) r0
            return r0
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final okio.ByteString md5() {
            r1 = this;
            java.lang.String r0 = "MD5"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    @Override // okio.BufferedSink
    public java.io.OutputStream outputStream() {
            r1 = this;
            okio.Buffer$outputStream$1 r0 = new okio.Buffer$outputStream$1
            r0.<init>(r1)
            java.io.OutputStream r0 = (java.io.OutputStream) r0
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
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L38
            if (r10 < 0) goto L38
            if (r11 < 0) goto L38
            long r2 = r6.size()
            long r2 = r2 - r7
            long r4 = (long) r11
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L38
            int r0 = r9.size()
            int r0 = r0 - r10
            if (r0 >= r11) goto L22
            goto L38
        L22:
            r0 = r1
        L23:
            if (r0 >= r11) goto L37
            long r2 = (long) r0
            long r2 = r2 + r7
            byte r2 = r6.getByte(r2)
            int r3 = r10 + r0
            byte r3 = r9.getByte(r3)
            if (r2 == r3) goto L34
            goto L38
        L34:
            int r0 = r0 + 1
            goto L23
        L37:
            r1 = 1
        L38:
            return r1
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(java.nio.ByteBuffer r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            okio.Segment r0 = r6.head
            if (r0 != 0) goto Lb
            r7 = -1
            return r7
        Lb:
            int r1 = r7.remaining()
            int r2 = r0.limit
            int r3 = r0.pos
            int r2 = r2 - r3
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.data
            int r3 = r0.pos
            r7.put(r2, r3, r1)
            int r7 = r0.pos
            int r7 = r7 + r1
            r0.pos = r7
            long r2 = r6.size
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.size = r2
            int r7 = r0.pos
            int r2 = r0.limit
            if (r7 != r2) goto L39
            okio.Segment r7 = r0.pop()
            r6.head = r7
            okio.SegmentPool.recycle(r0)
        L39:
            return r1
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
    public int read(byte[] r8, int r9, int r10) {
            r7 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.Segment r0 = r7.head
            if (r0 != 0) goto L12
            r8 = -1
            goto L43
        L12:
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            int r10 = java.lang.Math.min(r10, r1)
            byte[] r1 = r0.data
            int r2 = r0.pos
            int r3 = r0.pos
            int r3 = r3 + r10
            kotlin.collections.ArraysKt.copyInto(r1, r8, r9, r2, r3)
            int r8 = r0.pos
            int r8 = r8 + r10
            r0.pos = r8
            long r8 = r7.size()
            long r1 = (long) r10
            long r8 = r8 - r1
            r7.setSize$okio(r8)
            int r8 = r0.pos
            int r9 = r0.limit
            if (r8 != r9) goto L42
            okio.Segment r8 = r0.pop()
            r7.head = r8
            okio.SegmentPool.recycle(r0)
        L42:
            r8 = r10
        L43:
            return r8
    }

    @Override // okio.Source
    public long read(okio.Buffer r5, long r6) {
            r4 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L27
            long r2 = r4.size()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L16
            r5 = -1
            goto L26
        L16:
            long r0 = r4.size()
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L22
            long r6 = r4.size()
        L22:
            r5.write(r4, r6)
            r5 = r6
        L26:
            return r5
        L27:
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
    public long readAll(okio.Sink r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = r4.size()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L12
            r5.write(r4, r0)
        L12:
            return r0
    }

    public final okio.Buffer.UnsafeCursor readAndWriteUnsafe() {
            r2 = this;
            r0 = 0
            r1 = 1
            okio.Buffer$UnsafeCursor r0 = readAndWriteUnsafe$default(r2, r0, r1, r0)
            return r0
    }

    public final okio.Buffer.UnsafeCursor readAndWriteUnsafe(okio.Buffer.UnsafeCursor r2) {
            r1 = this;
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer$UnsafeCursor r2 = okio.internal.Buffer.commonReadAndWriteUnsafe(r1, r2)
            return r2
    }

    @Override // okio.BufferedSource
    public byte readByte() throws java.io.EOFException {
            r9 = this;
            long r0 = r9.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L32
            okio.Segment r0 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            int r2 = r0.limit
            byte[] r3 = r0.data
            int r4 = r1 + 1
            r1 = r3[r1]
            long r5 = r9.size()
            r7 = 1
            long r5 = r5 - r7
            r9.setSize$okio(r5)
            if (r4 != r2) goto L2f
            okio.Segment r2 = r0.pop()
            r9.head = r2
            okio.SegmentPool.recycle(r0)
            goto L31
        L2f:
            r0.pos = r4
        L31:
            return r1
        L32:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
            r2 = this;
            long r0 = r2.size()
            byte[] r0 = r2.readByteArray(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long r3) throws java.io.EOFException {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L22
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L22
            long r0 = r2.size()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L1c
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r2.readFully(r3)
            return r3
        L1c:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L22:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "byteCount: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString() {
            r2 = this;
            long r0 = r2.size()
            okio.ByteString r0 = r2.readByteString(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public okio.ByteString readByteString(long r3) throws java.io.EOFException {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L34
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L34
            long r0 = r2.size()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L2e
            r0 = 4096(0x1000, double:2.0237E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L24
            int r0 = (int) r3
            okio.ByteString r0 = r2.snapshot(r0)
            r2.skip(r3)
            goto L2d
        L24:
            okio.ByteString r0 = new okio.ByteString
            byte[] r3 = r2.readByteArray(r3)
            r0.<init>(r3)
        L2d:
            return r0
        L2e:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "byteCount: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws java.io.EOFException {
            r18 = this;
            r0 = r18
            long r1 = r18.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Lec
            r1 = 0
            r5 = -7
            r2 = r1
            r8 = r3
            r6 = r5
            r5 = r2
        L13:
            okio.Segment r10 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            byte[] r11 = r10.data
            int r12 = r10.pos
            int r13 = r10.limit
        L1e:
            if (r12 >= r13) goto L80
            r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L6e
            r14 = 57
            if (r15 > r14) goto L6e
            int r14 = 48 - r15
            r16 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r16 < 0) goto L43
            if (r16 != 0) goto L3d
            long r3 = (long) r14
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L3d
            goto L43
        L3d:
            r3 = 10
            long r8 = r8 * r3
            long r3 = (long) r14
            long r8 = r8 + r3
            goto L78
        L43:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.Buffer r1 = r1.writeDecimalLong(r8)
            okio.Buffer r1 = r1.writeByte(r15)
            if (r2 != 0) goto L55
            r1.readByte()
        L55:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Number too large: "
            r3.<init>(r4)
            java.lang.String r1 = r1.readUtf8()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L6e:
            r3 = 45
            if (r15 != r3) goto L7f
            if (r1 != 0) goto L7f
            r2 = 1
            long r6 = r6 - r2
            r2 = 1
        L78:
            int r12 = r12 + 1
            int r1 = r1 + 1
            r3 = 0
            goto L1e
        L7f:
            r5 = 1
        L80:
            if (r12 != r13) goto L8c
            okio.Segment r3 = r10.pop()
            r0.head = r3
            okio.SegmentPool.recycle(r10)
            goto L8e
        L8c:
            r10.pos = r12
        L8e:
            if (r5 != 0) goto L99
            okio.Segment r3 = r0.head
            if (r3 != 0) goto L95
            goto L99
        L95:
            r3 = 0
            goto L13
        L99:
            long r3 = r18.size()
            long r5 = (long) r1
            long r3 = r3 - r5
            r0.setSize$okio(r3)
            if (r2 == 0) goto La6
            r14 = 2
            goto La7
        La6:
            r14 = 1
        La7:
            if (r1 >= r14) goto Le7
            long r3 = r18.size()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto Le1
            if (r2 == 0) goto Lb8
            java.lang.String r1 = "Expected a digit"
            goto Lba
        Lb8:
            java.lang.String r1 = "Expected a digit or '-'"
        Lba:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = " but was 0x"
            java.lang.StringBuilder r1 = r1.append(r3)
            r3 = 0
            byte r3 = r0.getByte(r3)
            java.lang.String r3 = okio.SegmentedByteString.toHexString(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        Le1:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        Le7:
            if (r2 == 0) goto Lea
            goto Leb
        Lea:
            long r8 = -r8
        Leb:
            return r8
        Lec:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
    }

    public final okio.Buffer readFrom(java.io.InputStream r4) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 1
            r3.readFrom(r4, r0, r2)
            return r3
    }

    public final okio.Buffer readFrom(java.io.InputStream r3, long r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            r0 = 0
            r2.readFrom(r3, r4, r0)
            return r2
        L10:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount < 0: "
            r3.<init>(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // okio.BufferedSource
    public void readFully(okio.Buffer r3, long r4) throws java.io.EOFException {
            r2 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            long r0 = r2.size()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L11
            r3.write(r2, r4)
            return
        L11:
            long r4 = r2.size()
            r3.write(r2, r4)
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] r4) throws java.io.EOFException {
            r3 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
        L6:
            int r1 = r4.length
            if (r0 >= r1) goto L1a
            int r1 = r4.length
            int r1 = r1 - r0
            int r1 = r3.read(r4, r0, r1)
            r2 = -1
            if (r1 == r2) goto L14
            int r0 = r0 + r1
            goto L6
        L14:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
        L1a:
            return
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lad
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            okio.Segment r6 = r14.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L8f
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L72
            r11 = 70
            if (r10 > r11) goto L72
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.readUtf8()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L72:
            if (r0 == 0) goto L76
            r1 = 1
            goto L8f
        L76:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = okio.SegmentedByteString.toHexString(r10)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8f:
            if (r8 != r9) goto L9b
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto L9d
        L9b:
            r6.pos = r8
        L9d:
            if (r1 != 0) goto La3
            okio.Segment r6 = r14.head
            if (r6 != 0) goto Ld
        La3:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lad:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // okio.BufferedSource
    public int readInt() throws java.io.EOFException {
            r9 = this;
            long r0 = r9.size()
            r2 = 4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L77
            okio.Segment r0 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            long r5 = (long) r5
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L3c
            byte r0 = r9.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            goto L76
        L3c:
            byte[] r5 = r0.data
            int r6 = r1 + 1
            r7 = r5[r1]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 24
            int r8 = r1 + 2
            r6 = r5[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r6 = r6 | r7
            int r7 = r1 + 3
            r8 = r5[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r6 = r6 | r8
            int r1 = r1 + 4
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            long r6 = r9.size()
            long r6 = r6 - r2
            r9.setSize$okio(r6)
            if (r1 != r4) goto L73
            okio.Segment r1 = r0.pop()
            r9.head = r1
            okio.SegmentPool.recycle(r0)
            goto L75
        L73:
            r0.pos = r1
        L75:
            r0 = r5
        L76:
            return r0
        L77:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws java.io.EOFException {
            r1 = this;
            int r0 = r1.readInt()
            int r0 = okio.SegmentedByteString.reverseBytes(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public long readLong() throws java.io.EOFException {
            r15 = this;
            long r0 = r15.size()
            r2 = 8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L98
            okio.Segment r0 = r15.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            long r5 = (long) r5
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 32
            if (r5 >= 0) goto L30
            int r0 = r15.readInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = r0 << r6
            int r4 = r15.readInt()
            long r4 = (long) r4
            long r2 = r2 & r4
            long r0 = r0 | r2
            goto L97
        L30:
            byte[] r5 = r0.data
            int r7 = r1 + 1
            r8 = r5[r1]
            long r8 = (long) r8
            r10 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r10
            r12 = 56
            long r8 = r8 << r12
            int r12 = r1 + 2
            r7 = r5[r7]
            long r13 = (long) r7
            long r13 = r13 & r10
            r7 = 48
            long r13 = r13 << r7
            long r7 = r8 | r13
            int r9 = r1 + 3
            r12 = r5[r12]
            long r12 = (long) r12
            long r12 = r12 & r10
            r14 = 40
            long r12 = r12 << r14
            long r7 = r7 | r12
            int r12 = r1 + 4
            r9 = r5[r9]
            long r13 = (long) r9
            long r13 = r13 & r10
            long r13 = r13 << r6
            long r6 = r7 | r13
            int r8 = r1 + 5
            r9 = r5[r12]
            long r12 = (long) r9
            long r12 = r12 & r10
            r9 = 24
            long r12 = r12 << r9
            long r6 = r6 | r12
            int r9 = r1 + 6
            r8 = r5[r8]
            long r12 = (long) r8
            long r12 = r12 & r10
            r8 = 16
            long r12 = r12 << r8
            long r6 = r6 | r12
            int r8 = r1 + 7
            r9 = r5[r9]
            long r12 = (long) r9
            long r12 = r12 & r10
            r9 = 8
            long r12 = r12 << r9
            long r6 = r6 | r12
            int r1 = r1 + r9
            r5 = r5[r8]
            long r8 = (long) r5
            long r8 = r8 & r10
            long r5 = r6 | r8
            long r7 = r15.size()
            long r7 = r7 - r2
            r15.setSize$okio(r7)
            if (r1 != r4) goto L94
            okio.Segment r1 = r0.pop()
            r15.head = r1
            okio.SegmentPool.recycle(r0)
            goto L96
        L94:
            r0.pos = r1
        L96:
            r0 = r5
        L97:
            return r0
        L98:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws java.io.EOFException {
            r2 = this;
            long r0 = r2.readLong()
            long r0 = okio.SegmentedByteString.reverseBytes(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public short readShort() throws java.io.EOFException {
            r9 = this;
            long r0 = r9.size()
            r2 = 2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L51
            okio.Segment r0 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            r6 = 2
            if (r5 >= r6) goto L29
            byte r0 = r9.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            short r0 = (short) r0
            goto L50
        L29:
            byte[] r5 = r0.data
            int r7 = r1 + 1
            r8 = r5[r1]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            int r1 = r1 + r6
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r8
            long r6 = r9.size()
            long r6 = r6 - r2
            r9.setSize$okio(r6)
            if (r1 != r4) goto L4d
            okio.Segment r1 = r0.pop()
            r9.head = r1
            okio.SegmentPool.recycle(r0)
            goto L4f
        L4d:
            r0.pos = r1
        L4f:
            short r0 = (short) r5
        L50:
            return r0
        L51:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws java.io.EOFException {
            r1 = this;
            short r0 = r1.readShort()
            short r0 = okio.SegmentedByteString.reverseBytes(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(long r6, java.nio.charset.Charset r8) throws java.io.EOFException {
            r5 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L61
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 > 0) goto L61
            long r1 = r5.size
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L5b
            if (r0 != 0) goto L1d
            java.lang.String r6 = ""
            return r6
        L1d:
            okio.Segment r0 = r5.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            long r1 = (long) r1
            long r1 = r1 + r6
            int r3 = r0.limit
            long r3 = (long) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L37
            java.lang.String r0 = new java.lang.String
            byte[] r6 = r5.readByteArray(r6)
            r0.<init>(r6, r8)
            return r0
        L37:
            java.lang.String r1 = new java.lang.String
            byte[] r2 = r0.data
            int r3 = r0.pos
            int r4 = (int) r6
            r1.<init>(r2, r3, r4, r8)
            int r8 = r0.pos
            int r8 = r8 + r4
            r0.pos = r8
            long r2 = r5.size
            long r2 = r2 - r6
            r5.size = r2
            int r6 = r0.pos
            int r7 = r0.limit
            if (r6 != r7) goto L5a
            okio.Segment r6 = r0.pop()
            r5.head = r6
            okio.SegmentPool.recycle(r0)
        L5a:
            return r1
        L5b:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L61:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount: "
            r8.<init>(r0)
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    @Override // okio.BufferedSource
    public java.lang.String readString(java.nio.charset.Charset r3) {
            r2 = this;
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            long r0 = r2.size
            java.lang.String r3 = r2.readString(r0, r3)
            return r3
    }

    public final okio.Buffer.UnsafeCursor readUnsafe() {
            r2 = this;
            r0 = 0
            r1 = 1
            okio.Buffer$UnsafeCursor r0 = readUnsafe$default(r2, r0, r1, r0)
            return r0
    }

    public final okio.Buffer.UnsafeCursor readUnsafe(okio.Buffer.UnsafeCursor r2) {
            r1 = this;
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer$UnsafeCursor r2 = okio.internal.Buffer.commonReadUnsafe(r1, r2)
            return r2
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8() {
            r3 = this;
            long r0 = r3.size
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
            java.lang.String r0 = r3.readString(r0, r2)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8(long r2) throws java.io.EOFException {
            r1 = this;
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            java.lang.String r2 = r1.readString(r2, r0)
            return r2
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws java.io.EOFException {
            r12 = this;
            long r0 = r12.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb6
            byte r0 = r12.getByte(r2)
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 1
            r3 = 128(0x80, float:1.8E-43)
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r1 != 0) goto L1e
            r1 = r0 & 127(0x7f, float:1.78E-43)
            r5 = 0
            r6 = r5
            r5 = r2
            goto L40
        L1e:
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L29
            r1 = r0 & 31
            r5 = 2
            r6 = r3
            goto L40
        L29:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r1 != r5) goto L35
            r1 = r0 & 15
            r5 = 3
            r6 = 2048(0x800, float:2.87E-42)
            goto L40
        L35:
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r5 = 240(0xf0, float:3.36E-43)
            if (r1 != r5) goto Lb0
            r1 = r0 & 7
            r5 = 4
            r6 = 65536(0x10000, float:9.1835E-41)
        L40:
            long r7 = r12.size()
            long r9 = (long) r5
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L79
        L49:
            if (r2 >= r5) goto L60
            long r7 = (long) r2
            byte r0 = r12.getByte(r7)
            r11 = r0 & 192(0xc0, float:2.69E-43)
            if (r11 != r3) goto L5c
            int r1 = r1 << 6
            r0 = r0 & 63
            r1 = r1 | r0
            int r2 = r2 + 1
            goto L49
        L5c:
            r12.skip(r7)
            goto Lb5
        L60:
            r12.skip(r9)
            r0 = 1114111(0x10ffff, float:1.561202E-39)
            if (r1 <= r0) goto L69
            goto Lb5
        L69:
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r0 > r1) goto L74
            r0 = 57344(0xe000, float:8.0356E-41)
            if (r1 >= r0) goto L74
            goto Lb5
        L74:
            if (r1 >= r6) goto L77
            goto Lb5
        L77:
            r4 = r1
            goto Lb5
        L79:
            java.io.EOFException r1 = new java.io.EOFException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "size < "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = r2.append(r3)
            long r3 = r12.size()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " (to read code point prefixed 0x"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r0 = okio.SegmentedByteString.toHexString(r0)
            java.lang.StringBuilder r0 = r2.append(r0)
            r2 = 41
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lb0:
            r0 = 1
            r12.skip(r0)
        Lb5:
            return r4
        Lb6:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8Line() throws java.io.EOFException {
            r4 = this;
            r0 = 10
            long r0 = r4.indexOf(r0)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L11
            java.lang.String r0 = okio.internal.Buffer.readUtf8Line(r4, r0)
            goto L25
        L11:
            long r0 = r4.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L24
            long r0 = r4.size()
            java.lang.String r0 = r4.readUtf8(r0)
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict() throws java.io.EOFException {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r0 = r2.readUtf8LineStrict(r0)
            return r0
    }

    @Override // okio.BufferedSource
    public java.lang.String readUtf8LineStrict(long r12) throws java.io.EOFException {
            r11 = this;
            r0 = 0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 < 0) goto L94
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L12
            goto L14
        L12:
            long r0 = r12 + r3
        L14:
            r6 = 10
            r7 = 0
            r5 = r11
            r9 = r0
            long r5 = r5.indexOf(r6, r7, r9)
            r7 = -1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L29
            java.lang.String r12 = okio.internal.Buffer.readUtf8Line(r11, r5)
            goto L47
        L29:
            long r5 = r11.size()
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L48
            long r2 = r0 - r3
            byte r2 = r11.getByte(r2)
            r3 = 13
            if (r2 != r3) goto L48
            byte r2 = r11.getByte(r0)
            r3 = 10
            if (r2 != r3) goto L48
            java.lang.String r12 = okio.internal.Buffer.readUtf8Line(r11, r0)
        L47:
            return r12
        L48:
            okio.Buffer r6 = new okio.Buffer
            r6.<init>()
            long r0 = r11.size()
            r2 = 32
            long r2 = (long) r2
            long r4 = java.lang.Math.min(r2, r0)
            r2 = 0
            r0 = r11
            r1 = r6
            r0.copyTo(r1, r2, r4)
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\\n not found: limit="
            r1.<init>(r2)
            long r2 = r11.size()
            long r12 = java.lang.Math.min(r2, r12)
            java.lang.StringBuilder r12 = r1.append(r12)
            java.lang.String r13 = " content="
            java.lang.StringBuilder r12 = r12.append(r13)
            okio.ByteString r13 = r6.readByteString()
            java.lang.String r13 = r13.hex()
            java.lang.StringBuilder r12 = r12.append(r13)
            r13 = 8230(0x2026, float:1.1533E-41)
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
        L94:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "limit < 0: "
            r0.<init>(r1)
            java.lang.StringBuilder r12 = r0.append(r12)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
    }

    @Override // okio.BufferedSource
    public boolean request(long r3) {
            r2 = this;
            long r0 = r2.size
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            return r3
    }

    @Override // okio.BufferedSource
    public void require(long r3) throws java.io.EOFException {
            r2 = this;
            long r0 = r2.size
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L7
            return
        L7:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
    }

    @Override // okio.BufferedSource
    public int select(okio.Options r4) {
            r3 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            int r0 = okio.internal.Buffer.selectPrefix$default(r3, r4, r2, r0, r1)
            r1 = -1
            if (r0 != r1) goto L11
            r0 = r1
            goto L1f
        L11:
            okio.ByteString[] r4 = r4.getByteStrings$okio()
            r4 = r4[r0]
            int r4 = r4.size()
            long r1 = (long) r4
            r3.skip(r1)
        L1f:
            return r0
    }

    public final void setSize$okio(long r1) {
            r0 = this;
            r0.size = r1
            return
    }

    public final okio.ByteString sha1() {
            r1 = this;
            java.lang.String r0 = "SHA-1"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    public final okio.ByteString sha256() {
            r1 = this;
            java.lang.String r0 = "SHA-256"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    public final okio.ByteString sha512() {
            r1 = this;
            java.lang.String r0 = "SHA-512"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    public final long size() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @Override // okio.BufferedSource
    public void skip(long r7) throws java.io.EOFException {
            r6 = this;
        L0:
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3a
            okio.Segment r0 = r6.head
            if (r0 == 0) goto L34
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r7, r1)
            int r1 = (int) r1
            long r2 = r6.size()
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.setSize$okio(r2)
            long r7 = r7 - r4
            int r2 = r0.pos
            int r2 = r2 + r1
            r0.pos = r2
            int r1 = r0.pos
            int r2 = r0.limit
            if (r1 != r2) goto L0
            okio.Segment r1 = r0.pop()
            r6.head = r1
            okio.SegmentPool.recycle(r0)
            goto L0
        L34:
            java.io.EOFException r7 = new java.io.EOFException
            r7.<init>()
            throw r7
        L3a:
            return
    }

    public final okio.ByteString snapshot() {
            r4 = this;
            long r0 = r4.size()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L15
            long r0 = r4.size()
            int r0 = (int) r0
            okio.ByteString r0 = r4.snapshot(r0)
            return r0
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "size > Int.MAX_VALUE: "
            r0.<init>(r1)
            long r1 = r4.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public final okio.ByteString snapshot(int r8) {
            r7 = this;
            if (r8 != 0) goto L5
            okio.ByteString r8 = okio.ByteString.EMPTY
            goto L68
        L5:
            long r0 = r7.size()
            r2 = 0
            long r4 = (long) r8
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            okio.Segment r0 = r7.head
            r1 = 0
            r2 = r1
            r3 = r2
        L14:
            if (r2 >= r8) goto L32
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r4 = r0.limit
            int r5 = r0.pos
            if (r4 == r5) goto L2a
            int r4 = r0.limit
            int r5 = r0.pos
            int r4 = r4 - r5
            int r2 = r2 + r4
            int r3 = r3 + 1
            okio.Segment r0 = r0.next
            goto L14
        L2a:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r0 = "s.limit == s.pos"
            r8.<init>(r0)
            throw r8
        L32:
            byte[][] r0 = new byte[r3][]
            int r3 = r3 * 2
            int[] r2 = new int[r3]
            okio.Segment r3 = r7.head
            r4 = r3
            r3 = r1
        L3c:
            if (r1 >= r8) goto L61
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            byte[] r5 = r4.data
            r0[r3] = r5
            int r5 = r4.limit
            int r6 = r4.pos
            int r5 = r5 - r6
            int r1 = r1 + r5
            int r5 = java.lang.Math.min(r1, r8)
            r2[r3] = r5
            r5 = r0
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r5 = r5.length
            int r5 = r5 + r3
            int r6 = r4.pos
            r2[r5] = r6
            r5 = 1
            r4.shared = r5
            int r3 = r3 + r5
            okio.Segment r4 = r4.next
            goto L3c
        L61:
            okio.SegmentedByteString r8 = new okio.SegmentedByteString
            r8.<init>(r0, r2)
            okio.ByteString r8 = (okio.ByteString) r8
        L68:
            return r8
    }

    @Override // okio.Source
    public okio.Timeout timeout() {
            r1 = this;
            okio.Timeout r0 = okio.Timeout.NONE
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            okio.ByteString r0 = r1.snapshot()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final okio.Segment writableSegment$okio(int r4) {
            r3 = this;
            r0 = 1
            if (r4 < r0) goto L33
            r0 = 8192(0x2000, float:1.148E-41)
            if (r4 > r0) goto L33
            okio.Segment r1 = r3.head
            if (r1 != 0) goto L16
            okio.Segment r4 = okio.SegmentPool.take()
            r3.head = r4
            r4.prev = r4
            r4.next = r4
            goto L32
        L16:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.Segment r1 = r1.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r1.limit
            int r2 = r2 + r4
            if (r2 > r0) goto L2a
            boolean r4 = r1.owner
            if (r4 != 0) goto L28
            goto L2a
        L28:
            r4 = r1
            goto L32
        L2a:
            okio.Segment r4 = okio.SegmentPool.take()
            okio.Segment r4 = r1.push(r4)
        L32:
            return r4
        L33:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unexpected capacity"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(java.nio.ByteBuffer r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r7.remaining()
            r1 = r0
        La:
            if (r1 <= 0) goto L27
            r2 = 1
            okio.Segment r2 = r6.writableSegment$okio(r2)
            int r3 = r2.limit
            int r3 = 8192 - r3
            int r3 = java.lang.Math.min(r1, r3)
            byte[] r4 = r2.data
            int r5 = r2.limit
            r7.get(r4, r5, r3)
            int r1 = r1 - r3
            int r4 = r2.limit
            int r4 = r4 + r3
            r2.limit = r4
            goto La
        L27:
            long r1 = r6.size
            long r3 = (long) r0
            long r1 = r1 + r3
            r6.size = r1
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(okio.ByteString r3) {
            r2 = this;
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r3.size()
            r3.write$okio(r2, r0, r1)
            return r2
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(okio.ByteString r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r2.write$okio(r1, r3, r4)
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(okio.Source r5, long r6) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
        L5:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1d
            long r0 = r5.read(r4, r6)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L17
            long r6 = r6 - r0
            goto L5
        L17:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L1d:
            return r4
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(byte[] r3) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r3.length
            okio.Buffer r3 = r2.write(r3, r0, r1)
            return r3
    }

    @Override // okio.BufferedSink
    public okio.Buffer write(byte[] r10, int r11, int r12) {
            r9 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r10.length
            long r1 = (long) r0
            long r3 = (long) r11
            long r7 = (long) r12
            r5 = r7
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            int r12 = r12 + r11
        Le:
            if (r11 >= r12) goto L2f
            r0 = 1
            okio.Segment r0 = r9.writableSegment$okio(r0)
            int r1 = r12 - r11
            int r2 = r0.limit
            int r2 = 8192 - r2
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.data
            int r3 = r0.limit
            int r4 = r11 + r1
            kotlin.collections.ArraysKt.copyInto(r10, r2, r3, r11, r4)
            int r11 = r0.limit
            int r11 = r11 + r1
            r0.limit = r11
            r11 = r4
            goto Le
        L2f:
            long r10 = r9.size()
            long r10 = r10 + r7
            r9.setSize$okio(r10)
            return r9
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(okio.ByteString r1) {
            r0 = this;
            okio.Buffer r1 = r0.write(r1)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(okio.ByteString r1, int r2, int r3) {
            r0 = this;
            okio.Buffer r1 = r0.write(r1, r2, r3)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(okio.Source r1, long r2) {
            r0 = this;
            okio.Buffer r1 = r0.write(r1, r2)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(byte[] r1) {
            r0 = this;
            okio.Buffer r1 = r0.write(r1)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink write(byte[] r1, int r2, int r3) {
            r0 = this;
            okio.Buffer r1 = r0.write(r1, r2, r3)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.Sink
    public void write(okio.Buffer r8, long r9) {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            if (r8 == r7) goto Lb7
            long r1 = r8.size()
            r3 = 0
            r5 = r9
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
        L11:
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lb6
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.limit
            okio.Segment r1 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L76
            okio.Segment r0 = r7.head
            if (r0 == 0) goto L35
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okio.Segment r0 = r0.prev
            goto L36
        L35:
            r0 = 0
        L36:
            if (r0 == 0) goto L6a
            boolean r1 = r0.owner
            if (r1 == 0) goto L6a
            int r1 = r0.limit
            long r1 = (long) r1
            long r1 = r1 + r9
            boolean r3 = r0.shared
            if (r3 == 0) goto L46
            r3 = 0
            goto L48
        L46:
            int r3 = r0.pos
        L48:
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 8192(0x2000, double:4.0474E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L6a
            okio.Segment r1 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = (int) r9
            r1.writeTo(r0, r2)
            long r0 = r8.size()
            long r0 = r0 - r9
            r8.setSize$okio(r0)
            long r0 = r7.size()
            long r0 = r0 + r9
            r7.setSize$okio(r0)
            goto Lb6
        L6a:
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = (int) r9
            okio.Segment r0 = r0.split(r1)
            r8.head = r0
        L76:
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            okio.Segment r3 = r0.pop()
            r8.head = r3
            okio.Segment r3 = r7.head
            if (r3 != 0) goto L94
            r7.head = r0
            r0.prev = r0
            okio.Segment r3 = r0.prev
            r0.next = r3
            goto La3
        L94:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r3 = r3.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r0 = r3.push(r0)
            r0.compact()
        La3:
            long r3 = r8.size()
            long r3 = r3 - r1
            r8.setSize$okio(r3)
            long r3 = r7.size()
            long r3 = r3 + r1
            r7.setSize$okio(r3)
            long r9 = r9 - r1
            goto L11
        Lb6:
            return
        Lb7:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "source == this"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    @Override // okio.BufferedSink
    public long writeAll(okio.Source r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
        L7:
            r2 = 8192(0x2000, double:4.0474E-320)
            long r2 = r7.read(r6, r2)
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L15
            long r0 = r0 + r2
            goto L7
        L15:
            return r0
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeByte(int r5) {
            r4 = this;
            r0 = 1
            okio.Segment r0 = r4.writableSegment$okio(r0)
            byte[] r1 = r0.data
            int r2 = r0.limit
            int r3 = r2 + 1
            r0.limit = r3
            byte r5 = (byte) r5
            r1[r2] = r5
            long r0 = r4.size()
            r2 = 1
            long r0 = r0 + r2
            r4.setSize$okio(r0)
            return r4
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeByte(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeByte(r1)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeDecimalLong(long r13) {
            r12 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto Le
            r13 = 48
            okio.Buffer r13 = r12.writeByte(r13)
            goto L11e
        Le:
            r3 = 1
            if (r2 >= 0) goto L20
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1e
            java.lang.String r13 = "-9223372036854775808"
            okio.Buffer r13 = r12.writeUtf8(r13)
            goto L11e
        L1e:
            r2 = r3
            goto L21
        L20:
            r2 = 0
        L21:
            r4 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            r5 = 10
            if (r4 >= 0) goto L6f
            r6 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 >= 0) goto L4d
            r6 = 100
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 >= 0) goto L41
            r6 = 10
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 >= 0) goto L3e
            goto Le6
        L3e:
            r3 = 2
            goto Le6
        L41:
            r3 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L4a
            r3 = 3
            goto Le6
        L4a:
            r3 = 4
            goto Le6
        L4d:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L61
            r3 = 100000(0x186a0, double:4.94066E-319)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L5e
            r3 = 5
            goto Le6
        L5e:
            r3 = 6
            goto Le6
        L61:
            r3 = 10000000(0x989680, double:4.9406565E-317)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L6b
            r3 = 7
            goto Le6
        L6b:
            r3 = 8
            goto Le6
        L6f:
            r3 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9c
            r3 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L8d
            r3 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L8b
            r3 = 9
            goto Le6
        L8b:
            r3 = r5
            goto Le6
        L8d:
            r3 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r3 = 11
            goto Le6
        L99:
            r3 = 12
            goto Le6
        L9c:
            r3 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lc0
            r3 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lb1
            r3 = 13
            goto Le6
        Lb1:
            r3 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lbd
            r3 = 14
            goto Le6
        Lbd:
            r3 = 15
            goto Le6
        Lc0:
            r3 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Ld8
            r3 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Ld5
            r3 = 16
            goto Le6
        Ld5:
            r3 = 17
            goto Le6
        Ld8:
            r3 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Le4
            r3 = 18
            goto Le6
        Le4:
            r3 = 19
        Le6:
            if (r2 == 0) goto Lea
            int r3 = r3 + 1
        Lea:
            okio.Segment r4 = r12.writableSegment$okio(r3)
            byte[] r6 = r4.data
            int r7 = r4.limit
            int r7 = r7 + r3
        Lf3:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L107
            long r8 = (long) r5
            long r10 = r13 % r8
            int r10 = (int) r10
            int r7 = r7 + (-1)
            byte[] r11 = okio.internal.Buffer.getHEX_DIGIT_BYTES()
            r10 = r11[r10]
            r6[r7] = r10
            long r13 = r13 / r8
            goto Lf3
        L107:
            if (r2 == 0) goto L10f
            int r7 = r7 + (-1)
            r13 = 45
            r6[r7] = r13
        L10f:
            int r13 = r4.limit
            int r13 = r13 + r3
            r4.limit = r13
            long r13 = r12.size()
            long r0 = (long) r3
            long r13 = r13 + r0
            r12.setSize$okio(r13)
            r13 = r12
        L11e:
            return r13
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeDecimalLong(long r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeDecimalLong(r1)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeHexadecimalUnsignedLong(long r13) {
            r12 = this;
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld
            r13 = 48
            okio.Buffer r13 = r12.writeByte(r13)
            goto L84
        Ld:
            r0 = 1
            long r1 = r13 >>> r0
            long r1 = r1 | r13
            r3 = 2
            long r4 = r1 >>> r3
            long r1 = r1 | r4
            r4 = 4
            long r5 = r1 >>> r4
            long r1 = r1 | r5
            r5 = 8
            long r6 = r1 >>> r5
            long r1 = r1 | r6
            r6 = 16
            long r7 = r1 >>> r6
            long r1 = r1 | r7
            r7 = 32
            long r8 = r1 >>> r7
            long r1 = r1 | r8
            long r8 = r1 >>> r0
            r10 = 6148914691236517205(0x5555555555555555, double:1.1945305291614955E103)
            long r8 = r8 & r10
            long r1 = r1 - r8
            long r8 = r1 >>> r3
            r10 = 3689348814741910323(0x3333333333333333, double:4.667261458395856E-62)
            long r8 = r8 & r10
            long r1 = r1 & r10
            long r8 = r8 + r1
            long r1 = r8 >>> r4
            long r1 = r1 + r8
            r8 = 1085102592571150095(0xf0f0f0f0f0f0f0f, double:3.815736827118017E-236)
            long r1 = r1 & r8
            long r8 = r1 >>> r5
            long r1 = r1 + r8
            long r5 = r1 >>> r6
            long r1 = r1 + r5
            r5 = 63
            long r8 = r1 & r5
            long r1 = r1 >>> r7
            long r1 = r1 & r5
            long r8 = r8 + r1
            r1 = 3
            long r1 = (long) r1
            long r8 = r8 + r1
            long r1 = (long) r4
            long r8 = r8 / r1
            int r1 = (int) r8
            okio.Segment r2 = r12.writableSegment$okio(r1)
            byte[] r3 = r2.data
            int r5 = r2.limit
            int r5 = r5 + r1
            int r5 = r5 - r0
            int r0 = r2.limit
        L63:
            if (r5 < r0) goto L75
            byte[] r6 = okio.internal.Buffer.getHEX_DIGIT_BYTES()
            r7 = 15
            long r7 = r7 & r13
            int r7 = (int) r7
            r6 = r6[r7]
            r3[r5] = r6
            long r13 = r13 >>> r4
            int r5 = r5 + (-1)
            goto L63
        L75:
            int r13 = r2.limit
            int r13 = r13 + r1
            r2.limit = r13
            long r13 = r12.size()
            long r0 = (long) r1
            long r13 = r13 + r0
            r12.setSize$okio(r13)
            r13 = r12
        L84:
            return r13
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeHexadecimalUnsignedLong(long r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeHexadecimalUnsignedLong(r1)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeInt(int r8) {
            r7 = this;
            r0 = 4
            okio.Segment r1 = r7.writableSegment$okio(r0)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            int r5 = r8 >>> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r5 = r3 + 2
            int r6 = r8 >>> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 3
            int r6 = r8 >>> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r5] = r6
            int r3 = r3 + r0
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r2[r4] = r8
            r1.limit = r3
            long r0 = r7.size()
            r2 = 4
            long r0 = r0 + r2
            r7.setSize$okio(r0)
            return r7
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeInt(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeInt(r1)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeIntLe(int r1) {
            r0 = this;
            int r1 = okio.SegmentedByteString.reverseBytes(r1)
            okio.Buffer r1 = r0.writeInt(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeIntLe(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeIntLe(r1)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeLong(long r12) {
            r11 = this;
            r0 = 8
            okio.Segment r1 = r11.writableSegment$okio(r0)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            r5 = 56
            long r5 = r12 >>> r5
            r7 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r7
            int r5 = (int) r5
            byte r5 = (byte) r5
            r2[r3] = r5
            int r5 = r3 + 2
            r6 = 48
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 3
            r6 = 40
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r5] = r6
            int r5 = r3 + 4
            r6 = 32
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 5
            r6 = 24
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r5] = r6
            int r5 = r3 + 6
            r6 = 16
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 7
            long r9 = r12 >>> r0
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r5] = r6
            int r3 = r3 + r0
            long r12 = r12 & r7
            int r12 = (int) r12
            byte r12 = (byte) r12
            r2[r4] = r12
            r1.limit = r3
            long r12 = r11.size()
            r0 = 8
            long r12 = r12 + r0
            r11.setSize$okio(r12)
            return r11
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeLong(long r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeLong(r1)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeLongLe(long r1) {
            r0 = this;
            long r1 = okio.SegmentedByteString.reverseBytes(r1)
            okio.Buffer r1 = r0.writeLong(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeLongLe(long r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeLongLe(r1)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeShort(int r7) {
            r6 = this;
            r0 = 2
            okio.Segment r1 = r6.writableSegment$okio(r0)
            byte[] r2 = r1.data
            int r3 = r1.limit
            int r4 = r3 + 1
            int r5 = r7 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r3 + r0
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r2[r4] = r7
            r1.limit = r3
            long r0 = r6.size()
            r2 = 2
            long r0 = r0 + r2
            r6.setSize$okio(r0)
            return r6
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeShort(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeShort(r1)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeShortLe(int r1) {
            r0 = this;
            short r1 = (short) r1
            short r1 = okio.SegmentedByteString.reverseBytes(r1)
            okio.Buffer r1 = r0.writeShort(r1)
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeShortLe(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeShortLe(r1)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeString(java.lang.String r2, int r3, int r4, java.nio.charset.Charset r5) {
            r1 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            if (r3 < 0) goto L84
            if (r4 < r3) goto L61
            int r0 = r2.length()
            if (r4 > r0) goto L3a
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            if (r0 == 0) goto L21
            okio.Buffer r2 = r1.writeUtf8(r2, r3, r4)
            return r2
        L21:
            java.lang.String r2 = r2.substring(r3, r4)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            byte[] r2 = r2.getBytes(r5)
            java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r3 = 0
            int r4 = r2.length
            okio.Buffer r2 = r1.write(r2, r3, r4)
            return r2
        L3a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "endIndex > string.length: "
            r3.<init>(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " > "
            java.lang.StringBuilder r3 = r3.append(r4)
            int r2 = r2.length()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L61:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "endIndex < beginIndex: "
            r2.<init>(r5)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = " < "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L84:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "beginIndex < 0: "
            r2.<init>(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeString(java.lang.String r3, java.nio.charset.Charset r4) {
            r2 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r1 = r3.length()
            okio.Buffer r3 = r2.writeString(r3, r0, r1, r4)
            return r3
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeString(java.lang.String r1, int r2, int r3, java.nio.charset.Charset r4) {
            r0 = this;
            okio.Buffer r1 = r0.writeString(r1, r2, r3, r4)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeString(java.lang.String r1, java.nio.charset.Charset r2) {
            r0 = this;
            okio.Buffer r1 = r0.writeString(r1, r2)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    public final okio.Buffer writeTo(java.io.OutputStream r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r5 = 2
            r6 = 0
            r3 = 0
            r1 = r7
            r2 = r8
            okio.Buffer r8 = writeTo$default(r1, r2, r3, r5, r6)
            return r8
    }

    public final okio.Buffer writeTo(java.io.OutputStream r8, long r9) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            long r1 = r7.size
            r3 = 0
            r5 = r9
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.Segment r0 = r7.head
        Lf:
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 <= 0) goto L47
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r9, r1)
            int r1 = (int) r1
            byte[] r2 = r0.data
            int r3 = r0.pos
            r8.write(r2, r3, r1)
            int r2 = r0.pos
            int r2 = r2 + r1
            r0.pos = r2
            long r2 = r7.size
            long r4 = (long) r1
            long r2 = r2 - r4
            r7.size = r2
            long r9 = r9 - r4
            int r1 = r0.pos
            int r2 = r0.limit
            if (r1 != r2) goto Lf
            okio.Segment r1 = r0.pop()
            r7.head = r1
            okio.SegmentPool.recycle(r0)
            r0 = r1
            goto Lf
        L47:
            return r7
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeUtf8(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r3.length()
            okio.Buffer r3 = r2.writeUtf8(r3, r0, r1)
            return r3
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeUtf8(java.lang.String r12, int r13, int r14) {
            r11 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            if (r13 < 0) goto L181
            if (r14 < r13) goto L15e
            int r0 = r12.length()
            if (r14 > r0) goto L137
        Lf:
            if (r13 >= r14) goto L136
            char r0 = r12.charAt(r13)
            r1 = 128(0x80, float:1.8E-43)
            r2 = 1
            if (r0 >= r1) goto L52
            okio.Segment r2 = r11.writableSegment$okio(r2)
            byte[] r3 = r2.data
            int r4 = r2.limit
            int r4 = r4 - r13
            int r5 = 8192 - r4
            int r5 = java.lang.Math.min(r14, r5)
            int r6 = r13 + 1
            int r13 = r13 + r4
            byte r0 = (byte) r0
            r3[r13] = r0
        L2f:
            r13 = r6
            if (r13 >= r5) goto L3f
            char r0 = r12.charAt(r13)
            if (r0 >= r1) goto L3f
            int r6 = r13 + 1
            int r13 = r13 + r4
            byte r0 = (byte) r0
            r3[r13] = r0
            goto L2f
        L3f:
            int r4 = r4 + r13
            int r0 = r2.limit
            int r4 = r4 - r0
            int r0 = r2.limit
            int r0 = r0 + r4
            r2.limit = r0
            long r0 = r11.size()
            long r2 = (long) r4
            long r0 = r0 + r2
            r11.setSize$okio(r0)
            goto Lf
        L52:
            r3 = 2048(0x800, float:2.87E-42)
            r4 = 2
            if (r0 >= r3) goto L83
            okio.Segment r3 = r11.writableSegment$okio(r4)
            byte[] r5 = r3.data
            int r6 = r3.limit
            int r7 = r0 >> 6
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            byte[] r5 = r3.data
            int r6 = r3.limit
            int r6 = r6 + r2
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r5[r6] = r0
            int r0 = r3.limit
            int r0 = r0 + r4
            r3.limit = r0
            long r0 = r11.size()
            r2 = 2
            long r0 = r0 + r2
            r11.setSize$okio(r0)
        L80:
            int r13 = r13 + 1
            goto Lf
        L83:
            r3 = 55296(0xd800, float:7.7486E-41)
            r5 = 3
            r6 = 63
            if (r0 < r3) goto Lff
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r0 <= r3) goto L91
            goto Lff
        L91:
            int r3 = r13 + 1
            if (r3 >= r14) goto L9a
            char r7 = r12.charAt(r3)
            goto L9b
        L9a:
            r7 = 0
        L9b:
            r8 = 56319(0xdbff, float:7.892E-41)
            if (r0 > r8) goto Lf9
            r8 = 56320(0xdc00, float:7.8921E-41)
            if (r8 > r7) goto Lf9
            r8 = 57344(0xe000, float:8.0356E-41)
            if (r7 >= r8) goto Lf9
            r0 = r0 & 1023(0x3ff, float:1.434E-42)
            int r0 = r0 << 10
            r3 = r7 & 1023(0x3ff, float:1.434E-42)
            r0 = r0 | r3
            r3 = 65536(0x10000, float:9.1835E-41)
            int r0 = r0 + r3
            r3 = 4
            okio.Segment r7 = r11.writableSegment$okio(r3)
            byte[] r8 = r7.data
            int r9 = r7.limit
            int r10 = r0 >> 18
            r10 = r10 | 240(0xf0, float:3.36E-43)
            byte r10 = (byte) r10
            r8[r9] = r10
            byte[] r8 = r7.data
            int r9 = r7.limit
            int r9 = r9 + r2
            int r2 = r0 >> 12
            r2 = r2 & r6
            r2 = r2 | r1
            byte r2 = (byte) r2
            r8[r9] = r2
            byte[] r2 = r7.data
            int r8 = r7.limit
            int r8 = r8 + r4
            int r4 = r0 >> 6
            r4 = r4 & r6
            r4 = r4 | r1
            byte r4 = (byte) r4
            r2[r8] = r4
            byte[] r2 = r7.data
            int r4 = r7.limit
            int r4 = r4 + r5
            r0 = r0 & r6
            r0 = r0 | r1
            byte r0 = (byte) r0
            r2[r4] = r0
            int r0 = r7.limit
            int r0 = r0 + r3
            r7.limit = r0
            long r0 = r11.size()
            r2 = 4
            long r0 = r0 + r2
            r11.setSize$okio(r0)
            int r13 = r13 + 2
            goto Lf
        Lf9:
            r11.writeByte(r6)
            r13 = r3
            goto Lf
        Lff:
            okio.Segment r3 = r11.writableSegment$okio(r5)
            byte[] r7 = r3.data
            int r8 = r3.limit
            int r9 = r0 >> 12
            r9 = r9 | 224(0xe0, float:3.14E-43)
            byte r9 = (byte) r9
            r7[r8] = r9
            byte[] r7 = r3.data
            int r8 = r3.limit
            int r8 = r8 + r2
            int r2 = r0 >> 6
            r2 = r2 & r6
            r2 = r2 | r1
            byte r2 = (byte) r2
            r7[r8] = r2
            byte[] r2 = r3.data
            int r6 = r3.limit
            int r6 = r6 + r4
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r2[r6] = r0
            int r0 = r3.limit
            int r0 = r0 + r5
            r3.limit = r0
            long r0 = r11.size()
            r2 = 3
            long r0 = r0 + r2
            r11.setSize$okio(r0)
            goto L80
        L136:
            return r11
        L137:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "endIndex > string.length: "
            r13.<init>(r0)
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r14 = " > "
            java.lang.StringBuilder r13 = r13.append(r14)
            int r12 = r12.length()
            java.lang.StringBuilder r12 = r13.append(r12)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        L15e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "endIndex < beginIndex: "
            r12.<init>(r0)
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.String r14 = " < "
            java.lang.StringBuilder r12 = r12.append(r14)
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        L181:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "beginIndex < 0: "
            r12.<init>(r14)
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeUtf8(java.lang.String r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeUtf8(r1)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeUtf8(java.lang.String r1, int r2, int r3) {
            r0 = this;
            okio.Buffer r1 = r0.writeUtf8(r1, r2, r3)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }

    @Override // okio.BufferedSink
    public okio.Buffer writeUtf8CodePoint(int r10) {
            r9 = this;
            r0 = 128(0x80, float:1.8E-43)
            if (r10 >= r0) goto L9
            r9.writeByte(r10)
            goto Lcc
        L9:
            r1 = 2048(0x800, float:2.87E-42)
            r2 = 2
            r3 = 63
            if (r10 >= r1) goto L3b
            okio.Segment r1 = r9.writableSegment$okio(r2)
            byte[] r4 = r1.data
            int r5 = r1.limit
            int r6 = r10 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            byte[] r4 = r1.data
            int r5 = r1.limit
            int r5 = r5 + 1
            r10 = r10 & r3
            r10 = r10 | r0
            byte r10 = (byte) r10
            r4[r5] = r10
            int r10 = r1.limit
            int r10 = r10 + r2
            r1.limit = r10
            long r0 = r9.size()
            r2 = 2
            long r0 = r0 + r2
            r9.setSize$okio(r0)
            goto Lcc
        L3b:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r1 > r10) goto L4a
            r1 = 57344(0xe000, float:8.0356E-41)
            if (r10 >= r1) goto L4a
            r9.writeByte(r3)
            goto Lcc
        L4a:
            r1 = 65536(0x10000, float:9.1835E-41)
            r4 = 3
            if (r10 >= r1) goto L85
            okio.Segment r1 = r9.writableSegment$okio(r4)
            byte[] r5 = r1.data
            int r6 = r1.limit
            int r7 = r10 >> 12
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            byte[] r5 = r1.data
            int r6 = r1.limit
            int r6 = r6 + 1
            int r7 = r10 >> 6
            r7 = r7 & r3
            r7 = r7 | r0
            byte r7 = (byte) r7
            r5[r6] = r7
            byte[] r5 = r1.data
            int r6 = r1.limit
            int r6 = r6 + r2
            r10 = r10 & r3
            r10 = r10 | r0
            byte r10 = (byte) r10
            r5[r6] = r10
            int r10 = r1.limit
            int r10 = r10 + r4
            r1.limit = r10
            long r0 = r9.size()
            r2 = 3
            long r0 = r0 + r2
            r9.setSize$okio(r0)
            goto Lcc
        L85:
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r10 > r1) goto Lcd
            r1 = 4
            okio.Segment r5 = r9.writableSegment$okio(r1)
            byte[] r6 = r5.data
            int r7 = r5.limit
            int r8 = r10 >> 18
            r8 = r8 | 240(0xf0, float:3.36E-43)
            byte r8 = (byte) r8
            r6[r7] = r8
            byte[] r6 = r5.data
            int r7 = r5.limit
            int r7 = r7 + 1
            int r8 = r10 >> 12
            r8 = r8 & r3
            r8 = r8 | r0
            byte r8 = (byte) r8
            r6[r7] = r8
            byte[] r6 = r5.data
            int r7 = r5.limit
            int r7 = r7 + r2
            int r2 = r10 >> 6
            r2 = r2 & r3
            r2 = r2 | r0
            byte r2 = (byte) r2
            r6[r7] = r2
            byte[] r2 = r5.data
            int r6 = r5.limit
            int r6 = r6 + r4
            r10 = r10 & r3
            r10 = r10 | r0
            byte r10 = (byte) r10
            r2[r6] = r10
            int r10 = r5.limit
            int r10 = r10 + r1
            r5.limit = r10
            long r0 = r9.size()
            r2 = 4
            long r0 = r0 + r2
            r9.setSize$okio(r0)
        Lcc:
            return r9
        Lcd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected code point: 0x"
            r1.<init>(r2)
            java.lang.String r10 = okio.SegmentedByteString.toHexString(r10)
            java.lang.StringBuilder r10 = r1.append(r10)
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
    }

    @Override // okio.BufferedSink
    public /* bridge */ /* synthetic */ okio.BufferedSink writeUtf8CodePoint(int r1) {
            r0 = this;
            okio.Buffer r1 = r0.writeUtf8CodePoint(r1)
            okio.BufferedSink r1 = (okio.BufferedSink) r1
            return r1
    }
}
