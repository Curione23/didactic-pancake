package okio.internal;

/* JADX INFO: renamed from: okio.internal.-Buffer, reason: invalid class name */
/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\r\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0080\b\u001a\r\u0010\u0016\u001a\u00020\u0014*\u00020\u0017H\u0080\b\u001a\r\u0010\u0018\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0015*\u00020\u0015H\u0080\b\u001a%\u0010\u001a\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0017\u0010\u001e\u001a\u00020\f*\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0080\b\u001a\u0015\u0010!\u001a\u00020\u0007*\u00020\u00172\u0006\u0010\"\u001a\u00020\nH\u0080\b\u001a\u0015\u0010#\u001a\u00020$*\u00020\u00152\u0006\u0010%\u001a\u00020\u0007H\u0080\b\u001a\r\u0010&\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a%\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010'\u001a\u00020\u0007*\u00020\u00152\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010,\u001a\u00020\u0007*\u00020\u00152\u0006\u0010-\u001a\u00020+2\u0006\u0010)\u001a\u00020\u0007H\u0080\b\u001a\r\u0010.\u001a\u00020\n*\u00020\u0017H\u0080\b\u001a-\u0010/\u001a\u00020\f*\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020+2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a%\u00100\u001a\u00020\n*\u00020\u00152\u0006\u00101\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u00100\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00102\u001a\u00020\u0007*\u00020\u00152\u0006\u00101\u001a\u000203H\u0080\b\u001a\u0014\u00104\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\r\u00106\u001a\u00020$*\u00020\u0015H\u0080\b\u001a\r\u00107\u001a\u00020\u0001*\u00020\u0015H\u0080\b\u001a\u0015\u00107\u001a\u00020\u0001*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00108\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u00108\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\u0015\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010:\u001a\u00020\u0014*\u00020\u00152\u0006\u00101\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010;\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010<\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\r\u0010=\u001a\u00020\u0007*\u00020\u0015H\u0080\b\u001a\r\u0010>\u001a\u00020?*\u00020\u0015H\u0080\b\u001a\u0014\u0010@\u001a\u00020\u0017*\u00020\u00152\u0006\u00105\u001a\u00020\u0017H\u0000\u001a\u0015\u0010A\u001a\u00020B*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010C\u001a\u00020\n*\u00020\u0015H\u0080\b\u001a\u000f\u0010D\u001a\u0004\u0018\u00010B*\u00020\u0015H\u0080\b\u001a\u0015\u0010E\u001a\u00020B*\u00020\u00152\u0006\u0010F\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010G\u001a\u00020\u0007*\u00020\u00172\u0006\u0010H\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010I\u001a\u00020\n*\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010J\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020LH\u0080\b\u001a\u0015\u0010M\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\r\u0010N\u001a\u00020+*\u00020\u0015H\u0080\b\u001a\u0015\u0010N\u001a\u00020+*\u00020\u00152\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u0015\u0010O\u001a\u00020\u000e*\u00020\u00152\u0006\u0010P\u001a\u00020\nH\u0080\b\u001a\u0015\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u0001H\u0080\b\u001a%\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0014*\u00020\u00152\u0006\u0010R\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a)\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010S\u001a\u00020+2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\nH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u0015*\u00020\u00152\u0006\u0010R\u001a\u00020T2\u0006\u0010\u001d\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010U\u001a\u00020\u0007*\u00020\u00152\u0006\u0010R\u001a\u00020TH\u0080\b\u001a\u0015\u0010V\u001a\u00020\u0015*\u00020\u00152\u0006\u0010(\u001a\u00020\nH\u0080\b\u001a\u0015\u0010W\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Y\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010Z\u001a\u00020\u0015*\u00020\u00152\u0006\u0010[\u001a\u00020\nH\u0080\b\u001a\u0015\u0010\\\u001a\u00020\u0015*\u00020\u00152\u0006\u0010X\u001a\u00020\u0007H\u0080\b\u001a\u0015\u0010]\u001a\u00020\u0015*\u00020\u00152\u0006\u0010^\u001a\u00020\nH\u0080\b\u001a%\u0010_\u001a\u00020\u0015*\u00020\u00152\u0006\u0010`\u001a\u00020B2\u0006\u0010a\u001a\u00020\n2\u0006\u0010b\u001a\u00020\nH\u0080\b\u001a\u0015\u0010c\u001a\u00020\u0015*\u00020\u00152\u0006\u0010d\u001a\u00020\nH\u0080\b\u001a\u0014\u0010e\u001a\u00020B*\u00020\u00152\u0006\u0010f\u001a\u00020\u0007H\u0000\u001a?\u0010g\u001a\u0002Hh\"\u0004\b\u0000\u0010h*\u00020\u00152\u0006\u0010)\u001a\u00020\u00072\u001a\u0010i\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002Hh0jH\u0080\bø\u0001\u0000¢\u0006\u0002\u0010k\u001a\u001e\u0010l\u001a\u00020\n*\u00020\u00152\u0006\u0010K\u001a\u00020L2\b\b\u0002\u0010m\u001a\u00020\fH\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006n"}, d2 = {"HEX_DIGIT_BYTES", "", "getHEX_DIGIT_BYTES$annotations", "()V", "getHEX_DIGIT_BYTES", "()[B", "OVERFLOW_DIGIT_START", "", "OVERFLOW_ZONE", "SEGMENTING_THRESHOLD", "", "rangeEquals", "", "segment", "Lokio/Segment;", "segmentPos", "bytes", "bytesOffset", "bytesLimit", "commonClear", "", "Lokio/Buffer;", "commonClose", "Lokio/Buffer$UnsafeCursor;", "commonCompleteSegmentByteCount", "commonCopy", "commonCopyTo", "out", "offset", "byteCount", "commonEquals", "other", "", "commonExpandBuffer", "minByteCount", "commonGet", "", "pos", "commonHashCode", "commonIndexOf", "b", "fromIndex", "toIndex", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonNext", "commonRangeEquals", "commonRead", "sink", "commonReadAll", "Lokio/Sink;", "commonReadAndWriteUnsafe", "unsafeCursor", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadLong", "commonReadShort", "", "commonReadUnsafe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonResizeBuffer", "newSize", "commonSeek", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonSnapshot", "commonWritableSegment", "minimumCapacity", "commonWrite", "source", "byteString", "Lokio/Source;", "commonWriteAll", "commonWriteByte", "commonWriteDecimalLong", "v", "commonWriteHexadecimalUnsignedLong", "commonWriteInt", "i", "commonWriteLong", "commonWriteShort", "s", "commonWriteUtf8", "string", "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "readUtf8Line", "newline", "seek", "T", "lambda", "Lkotlin/Function2;", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "selectPrefix", "selectTruncated", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Buffer {
    private static final byte[] HEX_DIGIT_BYTES = null;
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    static {
            java.lang.String r0 = "0123456789abcdef"
            byte[] r0 = okio._JvmPlatformKt.asUtf8ToByteArray(r0)
            okio.internal.Buffer.HEX_DIGIT_BYTES = r0
            return
    }

    public static final void commonClear(okio.Buffer r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long r0 = r2.size()
            r2.skip(r0)
            return
    }

    public static final void commonClose(okio.Buffer.UnsafeCursor r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.Buffer r0 = r3.buffer
            if (r0 == 0) goto L1b
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
        L1b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "not attached to a buffer"
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public static final long commonCompleteSegmentByteCount(okio.Buffer r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = r5.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            return r2
        L10:
            okio.Segment r5 = r5.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            okio.Segment r5 = r5.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r2 = r5.limit
            r3 = 8192(0x2000, float:1.148E-41)
            if (r2 >= r3) goto L2b
            boolean r2 = r5.owner
            if (r2 == 0) goto L2b
            int r2 = r5.limit
            int r5 = r5.pos
            int r2 = r2 - r5
            long r2 = (long) r2
            long r0 = r0 - r2
        L2b:
            return r0
    }

    public static final okio.Buffer commonCopy(okio.Buffer r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            long r1 = r6.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L15
            return r0
        L15:
            okio.Segment r1 = r6.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.Segment r2 = r1.sharedCopy()
            r0.head = r2
            okio.Segment r3 = r0.head
            r2.prev = r3
            okio.Segment r3 = r2.prev
            r2.next = r3
            okio.Segment r3 = r1.next
        L2a:
            if (r3 == r1) goto L3e
            okio.Segment r4 = r2.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r5 = r3.sharedCopy()
            r4.push(r5)
            okio.Segment r3 = r3.next
            goto L2a
        L3e:
            long r1 = r6.size()
            r0.setSize$okio(r1)
            return r0
    }

    public static final okio.Buffer commonCopyTo(okio.Buffer r7, okio.Buffer r8, long r9, long r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            long r1 = r7.size()
            r3 = r9
            r5 = r11
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 != 0) goto L1a
            return r7
        L1a:
            long r2 = r8.size()
            long r2 = r2 + r11
            r8.setSize$okio(r2)
            okio.Segment r2 = r7.head
        L24:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r3 = r2.limit
            int r4 = r2.pos
            int r3 = r3 - r4
            long r3 = (long) r3
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 < 0) goto L3b
            int r3 = r2.limit
            int r4 = r2.pos
            int r3 = r3 - r4
            long r3 = (long) r3
            long r9 = r9 - r3
            okio.Segment r2 = r2.next
            goto L24
        L3b:
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 <= 0) goto L7f
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
            if (r9 != 0) goto L67
            r3.prev = r3
            okio.Segment r9 = r3.prev
            r3.next = r9
            okio.Segment r9 = r3.next
            r8.head = r9
            goto L74
        L67:
            okio.Segment r9 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            okio.Segment r9 = r9.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            r9.push(r3)
        L74:
            int r9 = r3.limit
            int r10 = r3.pos
            int r9 = r9 - r10
            long r9 = (long) r9
            long r11 = r11 - r9
            okio.Segment r2 = r2.next
            r9 = r0
            goto L3b
        L7f:
            return r7
    }

    public static final boolean commonEquals(okio.Buffer r18, java.lang.Object r19) {
            r0 = r18
            r1 = r19
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = 1
            if (r0 != r1) goto Ld
            return r2
        Ld:
            boolean r3 = r1 instanceof okio.Buffer
            r4 = 0
            if (r3 != 0) goto L13
            return r4
        L13:
            long r5 = r18.size()
            okio.Buffer r1 = (okio.Buffer) r1
            long r7 = r1.size()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L22
            return r4
        L22:
            long r5 = r18.size()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L2d
            return r2
        L2d:
            okio.Segment r3 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r1 = r1.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r5 = r3.pos
            int r6 = r1.pos
            r9 = r7
        L3c:
            long r11 = r18.size()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L83
            int r11 = r3.limit
            int r11 = r11 - r5
            int r12 = r1.limit
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L50:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L6b
            byte[] r15 = r3.data
            int r16 = r5 + 1
            r5 = r15[r5]
            byte[] r15 = r1.data
            int r17 = r6 + 1
            r6 = r15[r6]
            if (r5 == r6) goto L63
            return r4
        L63:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L50
        L6b:
            int r13 = r3.limit
            if (r5 != r13) goto L76
            okio.Segment r3 = r3.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r5 = r3.pos
        L76:
            int r13 = r1.limit
            if (r6 != r13) goto L81
            okio.Segment r1 = r1.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r6 = r1.pos
        L81:
            long r9 = r9 + r11
            goto L3c
        L83:
            return r2
    }

    public static final long commonExpandBuffer(okio.Buffer.UnsafeCursor r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            if (r10 <= 0) goto L68
            r0 = 8192(0x2000, float:1.148E-41)
            if (r10 > r0) goto L4f
            okio.Buffer r1 = r9.buffer
            if (r1 == 0) goto L43
            boolean r2 = r9.readWrite
            if (r2 == 0) goto L37
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
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "expandBuffer() only permitted for read/write buffers"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L43:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "not attached to a buffer"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L4f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "minByteCount > Segment.SIZE: "
            r9.<init>(r0)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L68:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "minByteCount <= 0: "
            r9.<init>(r0)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static final byte commonGet(okio.Buffer r7, long r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            long r1 = r7.size()
            r5 = 1
            r3 = r8
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.Segment r0 = r7.head
            if (r0 == 0) goto L61
            long r1 = r7.size()
            long r1 = r1 - r8
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 >= 0) goto L3f
            long r1 = r7.size()
        L20:
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 <= 0) goto L31
            okio.Segment r0 = r0.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r7 = r0.limit
            int r3 = r0.pos
            int r7 = r7 - r3
            long r3 = (long) r7
            long r1 = r1 - r3
            goto L20
        L31:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            byte[] r7 = r0.data
            int r0 = r0.pos
            long r3 = (long) r0
            long r3 = r3 + r8
            long r3 = r3 - r1
            int r8 = (int) r3
            r7 = r7[r8]
            return r7
        L3f:
            r1 = 0
        L41:
            int r7 = r0.limit
            int r3 = r0.pos
            int r7 = r7 - r3
            long r3 = (long) r7
            long r3 = r3 + r1
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 > 0) goto L53
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r3
            goto L41
        L53:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            byte[] r7 = r0.data
            int r0 = r0.pos
            long r3 = (long) r0
            long r3 = r3 + r8
            long r3 = r3 - r1
            int r8 = (int) r3
            r7 = r7[r8]
            return r7
        L61:
            r7 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            byte[] r8 = r7.data
            throw r7
    }

    public static final int commonHashCode(okio.Buffer r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okio.Segment r0 = r5.head
            if (r0 != 0) goto Lb
            r5 = 0
            return r5
        Lb:
            r1 = 1
        Lc:
            int r2 = r0.pos
            int r3 = r0.limit
        L10:
            if (r2 >= r3) goto L1c
            int r1 = r1 * 31
            byte[] r4 = r0.data
            r4 = r4[r2]
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto L10
        L1c:
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okio.Segment r2 = r5.head
            if (r0 != r2) goto Lc
            return r1
    }

    public static final long commonIndexOf(okio.Buffer r9, byte r10, long r11, long r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto Lc6
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 > 0) goto Lc6
            long r2 = r9.size()
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1b
            long r13 = r9.size()
        L1b:
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r3 = -1
            if (r2 != 0) goto L22
            return r3
        L22:
            okio.Segment r2 = r9.head
            if (r2 != 0) goto L27
            return r3
        L27:
            long r5 = r9.size()
            long r5 = r5 - r11
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L7f
            long r0 = r9.size()
        L34:
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 <= 0) goto L45
            okio.Segment r2 = r2.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r9 = r2.limit
            int r5 = r2.pos
            int r9 = r9 - r5
            long r5 = (long) r9
            long r0 = r0 - r5
            goto L34
        L45:
            if (r2 != 0) goto L48
            return r3
        L48:
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 >= 0) goto L7e
            byte[] r9 = r2.data
            int r5 = r2.limit
            long r5 = (long) r5
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            long r5 = java.lang.Math.min(r5, r7)
            int r5 = (int) r5
            int r6 = r2.pos
            long r6 = (long) r6
            long r6 = r6 + r11
            long r6 = r6 - r0
            int r11 = (int) r6
        L61:
            if (r11 >= r5) goto L70
            r12 = r9[r11]
            if (r12 != r10) goto L6d
        L67:
            int r9 = r2.pos
            int r11 = r11 - r9
            long r9 = (long) r11
            long r9 = r9 + r0
            return r9
        L6d:
            int r11 = r11 + 1
            goto L61
        L70:
            int r9 = r2.limit
            int r11 = r2.pos
            int r9 = r9 - r11
            long r11 = (long) r9
            long r0 = r0 + r11
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r11 = r0
            goto L48
        L7e:
            return r3
        L7f:
            int r9 = r2.limit
            int r5 = r2.pos
            int r9 = r9 - r5
            long r5 = (long) r9
            long r5 = r5 + r0
            int r9 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r9 > 0) goto L91
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0 = r5
            goto L7f
        L91:
            if (r2 != 0) goto L94
            return r3
        L94:
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 >= 0) goto Lc5
            byte[] r9 = r2.data
            int r5 = r2.limit
            long r5 = (long) r5
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            long r5 = java.lang.Math.min(r5, r7)
            int r5 = (int) r5
            int r6 = r2.pos
            long r6 = (long) r6
            long r6 = r6 + r11
            long r6 = r6 - r0
            int r11 = (int) r6
        Lad:
            if (r11 >= r5) goto Lb7
            r12 = r9[r11]
            if (r12 != r10) goto Lb4
            goto L67
        Lb4:
            int r11 = r11 + 1
            goto Lad
        Lb7:
            int r9 = r2.limit
            int r11 = r2.pos
            int r9 = r9 - r11
            long r11 = (long) r9
            long r0 = r0 + r11
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r11 = r0
            goto L94
        Lc5:
            return r3
        Lc6:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "size="
            r10.<init>(r0)
            long r0 = r9.size()
            java.lang.StringBuilder r9 = r10.append(r0)
            java.lang.String r10 = " fromIndex="
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r10 = " toIndex="
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r13)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static final long commonIndexOf(okio.Buffer r18, okio.ByteString r19, long r20) {
            r0 = r18
            r1 = r20
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "bytes"
            r4 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            int r3 = r19.size()
            if (r3 <= 0) goto L123
            r5 = 0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L10a
            okio.Segment r3 = r0.head
            r7 = -1
            if (r3 != 0) goto L23
            return r7
        L23:
            long r9 = r18.size()
            long r9 = r9 - r1
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r10 = 1
            r12 = 0
            r13 = 1
            if (r9 >= 0) goto L9a
            long r5 = r18.size()
        L34:
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 <= 0) goto L45
            okio.Segment r3 = r3.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r9 = r3.limit
            int r14 = r3.pos
            int r9 = r9 - r14
            long r14 = (long) r9
            long r5 = r5 - r14
            goto L34
        L45:
            if (r3 != 0) goto L48
            return r7
        L48:
            byte[] r9 = r19.internalArray$okio()
            r12 = r9[r12]
            int r4 = r19.size()
            long r14 = r18.size()
            long r7 = (long) r4
            long r14 = r14 - r7
            long r14 = r14 + r10
        L59:
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 >= 0) goto L97
            byte[] r0 = r3.data
            int r7 = r3.limit
            int r8 = r3.pos
            long r10 = (long) r8
            long r10 = r10 + r14
            long r10 = r10 - r5
            long r7 = (long) r7
            long r7 = java.lang.Math.min(r7, r10)
            int r7 = (int) r7
            int r8 = r3.pos
            long r10 = (long) r8
            long r10 = r10 + r1
            long r10 = r10 - r5
            int r1 = (int) r10
        L72:
            if (r1 >= r7) goto L89
            r2 = r0[r1]
            if (r2 != r12) goto L86
            int r2 = r1 + 1
            boolean r2 = rangeEquals(r3, r2, r9, r13, r4)
            if (r2 == 0) goto L86
        L80:
            int r0 = r3.pos
            int r1 = r1 - r0
            long r0 = (long) r1
            long r0 = r0 + r5
            return r0
        L86:
            int r1 = r1 + 1
            goto L72
        L89:
            int r0 = r3.limit
            int r1 = r3.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r5 = r5 + r0
            okio.Segment r3 = r3.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r1 = r5
            goto L59
        L97:
            r0 = -1
            return r0
        L9a:
            int r7 = r3.limit
            int r8 = r3.pos
            int r7 = r7 - r8
            long r7 = (long) r7
            long r7 = r7 + r5
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 > 0) goto Lac
            okio.Segment r3 = r3.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r5 = r7
            goto L9a
        Lac:
            if (r3 != 0) goto Lb1
            r7 = -1
            return r7
        Lb1:
            byte[] r7 = r19.internalArray$okio()
            r8 = r7[r12]
            int r4 = r19.size()
            long r14 = r18.size()
            r16 = r5
            long r5 = (long) r4
            long r14 = r14 - r5
            long r14 = r14 + r10
            r5 = r16
        Lc6:
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 >= 0) goto L107
            byte[] r0 = r3.data
            int r9 = r3.limit
            int r10 = r3.pos
            long r10 = (long) r10
            long r10 = r10 + r14
            long r10 = r10 - r5
            r18 = r14
            long r13 = (long) r9
            long r9 = java.lang.Math.min(r13, r10)
            int r9 = (int) r9
            int r10 = r3.pos
            long r10 = (long) r10
            long r10 = r10 + r1
            long r10 = r10 - r5
            int r1 = (int) r10
        Le1:
            if (r1 >= r9) goto Lf5
            r2 = r0[r1]
            if (r2 != r8) goto Lf1
            int r2 = r1 + 1
            r10 = 1
            boolean r2 = rangeEquals(r3, r2, r7, r10, r4)
            if (r2 == 0) goto Lf2
            goto L80
        Lf1:
            r10 = 1
        Lf2:
            int r1 = r1 + 1
            goto Le1
        Lf5:
            r10 = 1
            int r0 = r3.limit
            int r1 = r3.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            long r5 = r5 + r0
            okio.Segment r3 = r3.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r14 = r18
            r1 = r5
            r13 = r10
            goto Lc6
        L107:
            r0 = -1
            return r0
        L10a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "fromIndex < 0: "
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L123:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bytes is empty"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final long commonIndexOfElement(okio.Buffer r11, okio.ByteString r12, long r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "targetBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L13e
            okio.Segment r2 = r11.head
            r3 = -1
            if (r2 != 0) goto L17
            return r3
        L17:
            long r5 = r11.size()
            long r5 = r5 - r13
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 >= 0) goto Lb5
            long r0 = r11.size()
        L27:
            int r5 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r5 <= 0) goto L38
            okio.Segment r2 = r2.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r5 = r2.limit
            int r9 = r2.pos
            int r5 = r5 - r9
            long r9 = (long) r5
            long r0 = r0 - r9
            goto L27
        L38:
            if (r2 != 0) goto L3b
            return r3
        L3b:
            int r5 = r12.size()
            if (r5 != r6) goto L7b
            byte r5 = r12.getByte(r7)
            byte r12 = r12.getByte(r8)
        L49:
            long r6 = r11.size()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto Lb4
            byte[] r6 = r2.data
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r2.limit
        L5b:
            if (r13 >= r14) goto L6d
            r7 = r6[r13]
            if (r7 == r5) goto L67
            if (r7 != r12) goto L64
            goto L67
        L64:
            int r13 = r13 + 1
            goto L5b
        L67:
            int r11 = r2.pos
        L69:
            int r13 = r13 - r11
            long r11 = (long) r13
            long r11 = r11 + r0
            return r11
        L6d:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r13 = r0
            goto L49
        L7b:
            byte[] r12 = r12.internalArray$okio()
        L7f:
            long r5 = r11.size()
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto Lb4
            byte[] r5 = r2.data
            int r6 = r2.pos
            long r8 = (long) r6
            long r8 = r8 + r13
            long r8 = r8 - r0
            int r13 = (int) r8
            int r14 = r2.limit
        L91:
            if (r13 >= r14) goto La6
            r6 = r5[r13]
            int r8 = r12.length
            r9 = r7
        L97:
            if (r9 >= r8) goto La3
            r10 = r12[r9]
            if (r6 != r10) goto La0
        L9d:
            int r11 = r2.pos
            goto L69
        La0:
            int r9 = r9 + 1
            goto L97
        La3:
            int r13 = r13 + 1
            goto L91
        La6:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r13 = r0
            goto L7f
        Lb4:
            return r3
        Lb5:
            int r5 = r2.limit
            int r9 = r2.pos
            int r5 = r5 - r9
            long r9 = (long) r5
            long r9 = r9 + r0
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 > 0) goto Lc7
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0 = r9
            goto Lb5
        Lc7:
            if (r2 != 0) goto Lca
            return r3
        Lca:
            int r5 = r12.size()
            if (r5 != r6) goto L105
            byte r5 = r12.getByte(r7)
            byte r12 = r12.getByte(r8)
        Ld8:
            long r6 = r11.size()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L13d
            byte[] r6 = r2.data
            int r7 = r2.pos
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r2.limit
        Lea:
            if (r13 >= r14) goto Lf7
            r7 = r6[r13]
            if (r7 == r5) goto L67
            if (r7 != r12) goto Lf4
            goto L67
        Lf4:
            int r13 = r13 + 1
            goto Lea
        Lf7:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r13 = r0
            goto Ld8
        L105:
            byte[] r12 = r12.internalArray$okio()
        L109:
            long r5 = r11.size()
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L13d
            byte[] r5 = r2.data
            int r6 = r2.pos
            long r8 = (long) r6
            long r8 = r8 + r13
            long r8 = r8 - r0
            int r13 = (int) r8
            int r14 = r2.limit
        L11b:
            if (r13 >= r14) goto L12f
            r6 = r5[r13]
            int r8 = r12.length
            r9 = r7
        L121:
            if (r9 >= r8) goto L12c
            r10 = r12[r9]
            if (r6 != r10) goto L129
            goto L9d
        L129:
            int r9 = r9 + 1
            goto L121
        L12c:
            int r13 = r13 + 1
            goto L11b
        L12f:
            int r13 = r2.limit
            int r14 = r2.pos
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            okio.Segment r2 = r2.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r13 = r0
            goto L109
        L13d:
            return r3
        L13e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "fromIndex < 0: "
            r11.<init>(r12)
            java.lang.StringBuilder r11 = r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    public static final int commonNext(okio.Buffer.UnsafeCursor r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = r4.offset
            okio.Buffer r2 = r4.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            long r2 = r2.size()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2d
            long r0 = r4.offset
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1f
            r0 = 0
            goto L28
        L1f:
            long r0 = r4.offset
            int r2 = r4.end
            int r3 = r4.start
            int r2 = r2 - r3
            long r2 = (long) r2
            long r0 = r0 + r2
        L28:
            int r4 = r4.seek(r0)
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "no more bytes"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    public static final boolean commonRangeEquals(okio.Buffer r6, long r7, okio.ByteString r9, int r10, int r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L3e
            if (r10 < 0) goto L3e
            if (r11 < 0) goto L3e
            long r2 = r6.size()
            long r2 = r2 - r7
            long r4 = (long) r11
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L3e
            int r0 = r9.size()
            int r0 = r0 - r10
            if (r0 >= r11) goto L27
            goto L3e
        L27:
            r0 = r1
        L28:
            if (r0 >= r11) goto L3c
            long r2 = (long) r0
            long r2 = r2 + r7
            byte r2 = r6.getByte(r2)
            int r3 = r10 + r0
            byte r3 = r9.getByte(r3)
            if (r2 == r3) goto L39
            return r1
        L39:
            int r0 = r0 + 1
            goto L28
        L3c:
            r6 = 1
            return r6
        L3e:
            return r1
    }

    public static final int commonRead(okio.Buffer r2, byte[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r3.length
            int r2 = r2.read(r3, r0, r1)
            return r2
    }

    public static final int commonRead(okio.Buffer r7, byte[] r8, int r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.Segment r0 = r7.head
            if (r0 != 0) goto L17
            r7 = -1
            return r7
        L17:
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
            if (r8 != r9) goto L47
            okio.Segment r8 = r0.pop()
            r7.head = r8
            okio.SegmentPool.recycle(r0)
        L47:
            return r10
    }

    public static final long commonRead(okio.Buffer r4, okio.Buffer r5, long r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L2b
            long r2 = r4.size()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L1b
            r4 = -1
            return r4
        L1b:
            long r0 = r4.size()
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L27
            long r6 = r4.size()
        L27:
            r5.write(r4, r6)
            return r6
        L2b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "byteCount < 0: "
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public static final long commonReadAll(okio.Buffer r4, okio.Sink r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            long r0 = r4.size()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L17
            r5.write(r4, r0)
        L17:
            return r0
    }

    public static final okio.Buffer.UnsafeCursor commonReadAndWriteUnsafe(okio.Buffer r1, okio.Buffer.UnsafeCursor r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer$UnsafeCursor r2 = okio.SegmentedByteString.resolveDefaultParameter(r2)
            okio.Buffer r0 = r2.buffer
            if (r0 != 0) goto L18
            r2.buffer = r1
            r1 = 1
            r2.readWrite = r1
            return r2
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "already attached to a buffer"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final byte commonReadByte(okio.Buffer r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r0 = r9.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L37
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
            if (r4 != r2) goto L34
            okio.Segment r2 = r0.pop()
            r9.head = r2
            okio.SegmentPool.recycle(r0)
            goto L36
        L34:
            r0.pos = r4
        L36:
            return r1
        L37:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>()
            throw r9
    }

    public static final byte[] commonReadByteArray(okio.Buffer r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long r0 = r2.size()
            byte[] r2 = r2.readByteArray(r0)
            return r2
    }

    public static final byte[] commonReadByteArray(okio.Buffer r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L27
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L27
            long r0 = r2.size()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L21
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r2.readFully(r3)
            return r3
        L21:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L27:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount: "
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static final okio.ByteString commonReadByteString(okio.Buffer r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long r0 = r2.size()
            okio.ByteString r2 = r2.readByteString(r0)
            return r2
    }

    public static final okio.ByteString commonReadByteString(okio.Buffer r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L39
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L39
            long r0 = r2.size()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L33
            r0 = 4096(0x1000, double:2.0237E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L29
            int r0 = (int) r3
            okio.ByteString r0 = r2.snapshot(r0)
            r2.skip(r3)
            return r0
        L29:
            okio.ByteString r0 = new okio.ByteString
            byte[] r2 = r2.readByteArray(r3)
            r0.<init>(r2)
            return r0
        L33:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L39:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount: "
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static final long commonReadDecimalLong(okio.Buffer r18) {
            r0 = r18
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            long r1 = r18.size()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Lf1
            r1 = 0
            r5 = -7
            r2 = r1
            r8 = r3
            r6 = r5
            r5 = r2
        L18:
            okio.Segment r10 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            byte[] r11 = r10.data
            int r12 = r10.pos
            int r13 = r10.limit
        L23:
            if (r12 >= r13) goto L85
            r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L73
            r14 = 57
            if (r15 > r14) goto L73
            int r14 = 48 - r15
            r16 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r16 < 0) goto L48
            if (r16 != 0) goto L42
            long r3 = (long) r14
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L42
            goto L48
        L42:
            r3 = 10
            long r8 = r8 * r3
            long r3 = (long) r14
            long r8 = r8 + r3
            goto L7d
        L48:
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r0 = r0.writeDecimalLong(r8)
            okio.Buffer r0 = r0.writeByte(r15)
            if (r2 != 0) goto L5a
            r0.readByte()
        L5a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.readUtf8()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L73:
            r3 = 45
            if (r15 != r3) goto L84
            if (r1 != 0) goto L84
            r2 = 1
            long r6 = r6 - r2
            r2 = 1
        L7d:
            int r12 = r12 + 1
            int r1 = r1 + 1
            r3 = 0
            goto L23
        L84:
            r5 = 1
        L85:
            if (r12 != r13) goto L91
            okio.Segment r3 = r10.pop()
            r0.head = r3
            okio.SegmentPool.recycle(r10)
            goto L93
        L91:
            r10.pos = r12
        L93:
            if (r5 != 0) goto L9e
            okio.Segment r3 = r0.head
            if (r3 != 0) goto L9a
            goto L9e
        L9a:
            r3 = 0
            goto L18
        L9e:
            long r3 = r18.size()
            long r5 = (long) r1
            long r3 = r3 - r5
            r0.setSize$okio(r3)
            if (r2 == 0) goto Lab
            r14 = 2
            goto Lac
        Lab:
            r14 = 1
        Lac:
            if (r1 >= r14) goto Lec
            long r3 = r18.size()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto Le6
            if (r2 == 0) goto Lbd
            java.lang.String r1 = "Expected a digit"
            goto Lbf
        Lbd:
            java.lang.String r1 = "Expected a digit or '-'"
        Lbf:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = " but was 0x"
            java.lang.StringBuilder r1 = r1.append(r3)
            r3 = 0
            byte r0 = r0.getByte(r3)
            java.lang.String r0 = okio.SegmentedByteString.toHexString(r0)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        Le6:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Lec:
            if (r2 == 0) goto Lef
            goto Lf0
        Lef:
            long r8 = -r8
        Lf0:
            return r8
        Lf1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    public static final void commonReadFully(okio.Buffer r2, okio.Buffer r3, long r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            long r0 = r2.size()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L16
            r3.write(r2, r4)
            return
        L16:
            long r4 = r2.size()
            r3.write(r2, r4)
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    public static final void commonReadFully(okio.Buffer r3, byte[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
        Lb:
            int r1 = r4.length
            if (r0 >= r1) goto L1f
            int r1 = r4.length
            int r1 = r1 - r0
            int r1 = r3.read(r4, r0, r1)
            r2 = -1
            if (r1 == r2) goto L19
            int r0 = r0 + r1
            goto Lb
        L19:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L1f:
            return
    }

    public static final long commonReadHexadecimalUnsignedLong(okio.Buffer r14) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb2
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            okio.Segment r6 = r14.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1d:
            if (r8 >= r9) goto L94
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2c
            r11 = 57
            if (r10 > r11) goto L2c
            int r11 = r10 + (-48)
            goto L41
        L2c:
            r11 = 97
            if (r10 < r11) goto L37
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L37
            int r11 = r10 + (-87)
            goto L41
        L37:
            r11 = 65
            if (r10 < r11) goto L77
            r11 = 70
            if (r10 > r11) goto L77
            int r11 = r10 + (-55)
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L51:
            okio.Buffer r14 = new okio.Buffer
            r14.<init>()
            okio.Buffer r14 = r14.writeHexadecimalUnsignedLong(r4)
            okio.Buffer r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number too large: "
            r1.<init>(r2)
            java.lang.String r14 = r14.readUtf8()
            java.lang.StringBuilder r14 = r1.append(r14)
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L77:
            if (r0 == 0) goto L7b
            r1 = 1
            goto L94
        L7b:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.<init>(r1)
            java.lang.String r1 = okio.SegmentedByteString.toHexString(r10)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L94:
            if (r8 != r9) goto La0
            okio.Segment r7 = r6.pop()
            r14.head = r7
            okio.SegmentPool.recycle(r6)
            goto La2
        La0:
            r6.pos = r8
        La2:
            if (r1 != 0) goto La8
            okio.Segment r6 = r14.head
            if (r6 != 0) goto L12
        La8:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lb2:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
    }

    public static final int commonReadInt(okio.Buffer r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r0 = r9.size()
            r2 = 4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L7b
            okio.Segment r0 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            long r5 = (long) r5
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L41
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
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r0
            return r9
        L41:
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
            if (r1 != r4) goto L78
            okio.Segment r1 = r0.pop()
            r9.head = r1
            okio.SegmentPool.recycle(r0)
            goto L7a
        L78:
            r0.pos = r1
        L7a:
            return r5
        L7b:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>()
            throw r9
    }

    public static final long commonReadLong(okio.Buffer r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            long r0 = r15.size()
            r2 = 8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L9c
            okio.Segment r0 = r15.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            long r5 = (long) r5
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 32
            if (r5 >= 0) goto L35
            int r0 = r15.readInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = r0 << r6
            int r15 = r15.readInt()
            long r4 = (long) r15
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
        L35:
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
            if (r1 != r4) goto L99
            okio.Segment r1 = r0.pop()
            r15.head = r1
            okio.SegmentPool.recycle(r0)
            goto L9b
        L99:
            r0.pos = r1
        L9b:
            return r5
        L9c:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
    }

    public static final short commonReadShort(okio.Buffer r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            long r0 = r9.size()
            r2 = 2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L56
            okio.Segment r0 = r9.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            int r4 = r0.limit
            int r5 = r4 - r1
            r6 = 2
            if (r5 >= r6) goto L2e
            byte r0 = r9.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r0
            short r9 = (short) r9
            return r9
        L2e:
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
            if (r1 != r4) goto L52
            okio.Segment r1 = r0.pop()
            r9.head = r1
            okio.SegmentPool.recycle(r0)
            goto L54
        L52:
            r0.pos = r1
        L54:
            short r9 = (short) r5
            return r9
        L56:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>()
            throw r9
    }

    public static final okio.Buffer.UnsafeCursor commonReadUnsafe(okio.Buffer r1, okio.Buffer.UnsafeCursor r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer$UnsafeCursor r2 = okio.SegmentedByteString.resolveDefaultParameter(r2)
            okio.Buffer r0 = r2.buffer
            if (r0 != 0) goto L18
            r2.buffer = r1
            r1 = 0
            r2.readWrite = r1
            return r2
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "already attached to a buffer"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final java.lang.String commonReadUtf8(okio.Buffer r5, long r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L6a
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 > 0) goto L6a
            long r1 = r5.size()
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L64
            if (r0 != 0) goto L1f
            java.lang.String r5 = ""
            return r5
        L1f:
            okio.Segment r0 = r5.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.pos
            long r1 = (long) r1
            long r1 = r1 + r6
            int r3 = r0.limit
            long r3 = (long) r3
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L3b
            byte[] r5 = r5.readByteArray(r6)
            r6 = 3
            r7 = 0
            r0 = 0
            java.lang.String r5 = okio.internal._Utf8Kt.commonToUtf8String$default(r5, r0, r0, r6, r7)
            return r5
        L3b:
            byte[] r1 = r0.data
            int r2 = r0.pos
            int r3 = r0.pos
            int r4 = (int) r6
            int r3 = r3 + r4
            java.lang.String r1 = okio.internal._Utf8Kt.commonToUtf8String(r1, r2, r3)
            int r2 = r0.pos
            int r2 = r2 + r4
            r0.pos = r2
            long r2 = r5.size()
            long r2 = r2 - r6
            r5.setSize$okio(r2)
            int r6 = r0.pos
            int r7 = r0.limit
            if (r6 != r7) goto L63
            okio.Segment r6 = r0.pop()
            r5.head = r6
            okio.SegmentPool.recycle(r0)
        L63:
            return r1
        L64:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>()
            throw r5
        L6a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "byteCount: "
            r5.<init>(r0)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    public static final int commonReadUtf8CodePoint(okio.Buffer r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            long r0 = r12.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lbb
            byte r0 = r12.getByte(r2)
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 1
            r3 = 128(0x80, float:1.8E-43)
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r1 != 0) goto L23
            r1 = r0 & 127(0x7f, float:1.78E-43)
            r5 = 0
            r6 = r5
            r5 = r2
            goto L45
        L23:
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L2e
            r1 = r0 & 31
            r5 = 2
            r6 = r3
            goto L45
        L2e:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r1 != r5) goto L3a
            r1 = r0 & 15
            r5 = 3
            r6 = 2048(0x800, float:2.87E-42)
            goto L45
        L3a:
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r5 = 240(0xf0, float:3.36E-43)
            if (r1 != r5) goto Lb5
            r1 = r0 & 7
            r5 = 4
            r6 = 65536(0x10000, float:9.1835E-41)
        L45:
            long r7 = r12.size()
            long r9 = (long) r5
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L7e
        L4e:
            if (r2 >= r5) goto L65
            long r7 = (long) r2
            byte r0 = r12.getByte(r7)
            r11 = r0 & 192(0xc0, float:2.69E-43)
            if (r11 != r3) goto L61
            int r1 = r1 << 6
            r0 = r0 & 63
            r1 = r1 | r0
            int r2 = r2 + 1
            goto L4e
        L61:
            r12.skip(r7)
            return r4
        L65:
            r12.skip(r9)
            r12 = 1114111(0x10ffff, float:1.561202E-39)
            if (r1 <= r12) goto L6e
            goto L7d
        L6e:
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r12 > r1) goto L79
            r12 = 57344(0xe000, float:8.0356E-41)
            if (r1 >= r12) goto L79
            goto L7d
        L79:
            if (r1 >= r6) goto L7c
            goto L7d
        L7c:
            r4 = r1
        L7d:
            return r4
        L7e:
            java.io.EOFException r1 = new java.io.EOFException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "size < "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = r2.append(r3)
            long r3 = r12.size()
            java.lang.StringBuilder r12 = r2.append(r3)
            java.lang.String r2 = " (to read code point prefixed 0x"
            java.lang.StringBuilder r12 = r12.append(r2)
            java.lang.String r0 = okio.SegmentedByteString.toHexString(r0)
            java.lang.StringBuilder r12 = r12.append(r0)
            r0 = 41
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r12 = r12.toString()
            r1.<init>(r12)
            throw r1
        Lb5:
            r0 = 1
            r12.skip(r0)
            return r4
        Lbb:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
    }

    public static final java.lang.String commonReadUtf8Line(okio.Buffer r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 10
            long r0 = r4.indexOf(r0)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L16
            java.lang.String r4 = readUtf8Line(r4, r0)
            goto L2a
        L16:
            long r0 = r4.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L29
            long r0 = r4.size()
            java.lang.String r4 = r4.readUtf8(r0)
            goto L2a
        L29:
            r4 = 0
        L2a:
            return r4
    }

    public static final java.lang.String commonReadUtf8LineStrict(okio.Buffer r11, long r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 < 0) goto L99
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L17
            goto L19
        L17:
            long r0 = r12 + r3
        L19:
            r6 = 10
            r7 = 0
            r5 = r11
            r9 = r0
            long r5 = r5.indexOf(r6, r7, r9)
            r7 = -1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L2e
            java.lang.String r11 = readUtf8Line(r11, r5)
            return r11
        L2e:
            long r5 = r11.size()
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L4d
            long r2 = r0 - r3
            byte r2 = r11.getByte(r2)
            r3 = 13
            if (r2 != r3) goto L4d
            byte r2 = r11.getByte(r0)
            r3 = 10
            if (r2 != r3) goto L4d
            java.lang.String r11 = readUtf8Line(r11, r0)
            return r11
        L4d:
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
            long r11 = java.lang.Math.min(r2, r12)
            java.lang.StringBuilder r11 = r1.append(r11)
            java.lang.String r12 = " content="
            java.lang.StringBuilder r11 = r11.append(r12)
            okio.ByteString r12 = r6.readByteString()
            java.lang.String r12 = r12.hex()
            java.lang.StringBuilder r11 = r11.append(r12)
            r12 = 8230(0x2026, float:1.1533E-41)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            r0.<init>(r11)
            throw r0
        L99:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "limit < 0: "
            r11.<init>(r0)
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    public static final long commonResizeBuffer(okio.Buffer.UnsafeCursor r13, long r14) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            okio.Buffer r0 = r13.buffer
            if (r0 == 0) goto Lb2
            boolean r1 = r13.readWrite
            if (r1 == 0) goto La6
            long r1 = r0.size()
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            r4 = 0
            if (r3 > 0) goto L6d
            int r3 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r3 < 0) goto L54
            long r6 = r1 - r14
        L1d:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L46
            okio.Segment r3 = r0.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r3 = r3.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r8 = r3.limit
            int r9 = r3.pos
            int r8 = r8 - r9
            long r8 = (long) r8
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 > 0) goto L40
            okio.Segment r10 = r3.pop()
            r0.head = r10
            okio.SegmentPool.recycle(r3)
            long r6 = r6 - r8
            goto L1d
        L40:
            int r4 = r3.limit
            int r5 = (int) r6
            int r4 = r4 - r5
            r3.limit = r4
        L46:
            r3 = 0
            r13.setSegment$okio(r3)
            r13.offset = r14
            r13.data = r3
            r3 = -1
            r13.start = r3
            r13.end = r3
            goto La2
        L54:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "newSize < 0: "
            r13.<init>(r0)
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L6d:
            if (r3 <= 0) goto La2
            long r6 = r14 - r1
            r3 = 1
            r8 = r3
        L73:
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 <= 0) goto La2
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
            if (r8 == 0) goto L73
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
            goto L73
        La2:
            r0.setSize$okio(r14)
            return r1
        La6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "resizeBuffer() only permitted for read/write buffers"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        Lb2:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "not attached to a buffer"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
    }

    public static final int commonSeek(okio.Buffer.UnsafeCursor r12, long r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            okio.Buffer r0 = r12.buffer
            if (r0 == 0) goto Lf7
            r1 = -1
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 < 0) goto Ld4
            long r2 = r0.size()
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 > 0) goto Ld4
            if (r1 == 0) goto Lc6
            long r1 = r0.size()
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 != 0) goto L23
            goto Lc6
        L23:
            long r1 = r0.size()
            okio.Segment r3 = r0.head
            okio.Segment r4 = r0.head
            okio.Segment r5 = r12.getSegment$okio()
            r6 = 0
            if (r5 == 0) goto L52
            long r8 = r12.offset
            int r5 = r12.start
            okio.Segment r10 = r12.getSegment$okio()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            int r10 = r10.pos
            int r5 = r5 - r10
            long r10 = (long) r5
            long r8 = r8 - r10
            int r5 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r5 <= 0) goto L4d
            okio.Segment r4 = r12.getSegment$okio()
            r1 = r8
            goto L52
        L4d:
            okio.Segment r3 = r12.getSegment$okio()
            r6 = r8
        L52:
            long r8 = r1 - r13
            long r10 = r13 - r6
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 <= 0) goto L72
        L5a:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r1 = r3.limit
            int r2 = r3.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = r1 + r6
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 < 0) goto L88
            int r1 = r3.limit
            int r2 = r3.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            long r6 = r6 + r1
            okio.Segment r3 = r3.next
            goto L5a
        L72:
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 <= 0) goto L86
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            okio.Segment r4 = r4.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r4.limit
            int r5 = r4.pos
            int r3 = r3 - r5
            long r5 = (long) r3
            long r1 = r1 - r5
            goto L72
        L86:
            r6 = r1
            r3 = r4
        L88:
            boolean r1 = r12.readWrite
            if (r1 == 0) goto La9
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            boolean r1 = r3.shared
            if (r1 == 0) goto La9
            okio.Segment r1 = r3.unsharedCopy()
            okio.Segment r2 = r0.head
            if (r2 != r3) goto L9d
            r0.head = r1
        L9d:
            okio.Segment r3 = r3.push(r1)
            okio.Segment r0 = r3.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0.pop()
        La9:
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
            int r13 = r12.end
            int r12 = r12.start
            int r13 = r13 - r12
            return r13
        Lc6:
            r0 = 0
            r12.setSegment$okio(r0)
            r12.offset = r13
            r12.data = r0
            r13 = -1
            r12.start = r13
            r12.end = r13
            return r13
        Ld4:
            java.lang.ArrayIndexOutOfBoundsException r12 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "offset="
            r1.<init>(r2)
            java.lang.StringBuilder r13 = r1.append(r13)
            java.lang.String r14 = " > size="
            java.lang.StringBuilder r13 = r13.append(r14)
            long r0 = r0.size()
            java.lang.StringBuilder r13 = r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        Lf7:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "not attached to a buffer"
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
    }

    public static final int commonSelect(okio.Buffer r3, okio.Options r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            int r0 = selectPrefix$default(r3, r4, r2, r0, r1)
            r1 = -1
            if (r0 != r1) goto L15
            return r1
        L15:
            okio.ByteString[] r4 = r4.getByteStrings$okio()
            r4 = r4[r0]
            int r4 = r4.size()
            long r1 = (long) r4
            r3.skip(r1)
            return r0
    }

    public static final void commonSkip(okio.Buffer r6, long r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
        L5:
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3f
            okio.Segment r0 = r6.head
            if (r0 == 0) goto L39
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
            if (r1 != r2) goto L5
            okio.Segment r1 = r0.pop()
            r6.head = r1
            okio.SegmentPool.recycle(r0)
            goto L5
        L39:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L3f:
            return
    }

    public static final okio.ByteString commonSnapshot(okio.Buffer r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = r4.size()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L1a
            long r0 = r4.size()
            int r0 = (int) r0
            okio.ByteString r4 = r4.snapshot(r0)
            return r4
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "size > Int.MAX_VALUE: "
            r0.<init>(r1)
            long r1 = r4.size()
            java.lang.StringBuilder r4 = r0.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public static final okio.ByteString commonSnapshot(okio.Buffer r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            if (r7 != 0) goto La
            okio.ByteString r6 = okio.ByteString.EMPTY
            return r6
        La:
            long r0 = r6.size()
            r2 = 0
            long r4 = (long) r7
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            okio.Segment r0 = r6.head
            r1 = 0
            r2 = r1
            r3 = r2
        L19:
            if (r2 >= r7) goto L37
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r4 = r0.limit
            int r5 = r0.pos
            if (r4 == r5) goto L2f
            int r4 = r0.limit
            int r5 = r0.pos
            int r4 = r4 - r5
            int r2 = r2 + r4
            int r3 = r3 + 1
            okio.Segment r0 = r0.next
            goto L19
        L2f:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.String r7 = "s.limit == s.pos"
            r6.<init>(r7)
            throw r6
        L37:
            byte[][] r0 = new byte[r3][]
            int r3 = r3 * 2
            int[] r2 = new int[r3]
            okio.Segment r6 = r6.head
            r3 = r1
        L40:
            if (r1 >= r7) goto L65
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r4 = r6.data
            r0[r3] = r4
            int r4 = r6.limit
            int r5 = r6.pos
            int r4 = r4 - r5
            int r1 = r1 + r4
            int r4 = java.lang.Math.min(r1, r7)
            r2[r3] = r4
            r4 = r0
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r4 = r4.length
            int r4 = r4 + r3
            int r5 = r6.pos
            r2[r4] = r5
            r4 = 1
            r6.shared = r4
            int r3 = r3 + r4
            okio.Segment r6 = r6.next
            goto L40
        L65:
            okio.SegmentedByteString r6 = new okio.SegmentedByteString
            r6.<init>(r0, r2)
            okio.ByteString r6 = (okio.ByteString) r6
            return r6
    }

    public static final okio.Segment commonWritableSegment(okio.Buffer r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            if (r3 < r0) goto L37
            r0 = 8192(0x2000, float:1.148E-41)
            if (r3 > r0) goto L37
            okio.Segment r1 = r2.head
            if (r1 != 0) goto L1b
            okio.Segment r3 = okio.SegmentPool.take()
            r2.head = r3
            r3.prev = r3
            r3.next = r3
            return r3
        L1b:
            okio.Segment r2 = r2.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okio.Segment r2 = r2.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r1 = r2.limit
            int r1 = r1 + r3
            if (r1 > r0) goto L2e
            boolean r3 = r2.owner
            if (r3 != 0) goto L36
        L2e:
            okio.Segment r3 = okio.SegmentPool.take()
            okio.Segment r2 = r2.push(r3)
        L36:
            return r2
        L37:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "unexpected capacity"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static final okio.Buffer commonWrite(okio.Buffer r1, okio.ByteString r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r2.write$okio(r1, r3, r4)
            return r1
    }

    public static final okio.Buffer commonWrite(okio.Buffer r4, okio.Source r5, long r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
        La:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L22
            long r0 = r5.read(r4, r6)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1c
            long r6 = r6 - r0
            goto La
        L1c:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
        L22:
            return r4
    }

    public static final okio.Buffer commonWrite(okio.Buffer r2, byte[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r3.length
            okio.Buffer r2 = r2.write(r3, r0, r1)
            return r2
    }

    public static final okio.Buffer commonWrite(okio.Buffer r9, byte[] r10, int r11, int r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r10.length
            long r1 = (long) r0
            long r3 = (long) r11
            long r7 = (long) r12
            r5 = r7
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            int r12 = r12 + r11
        L13:
            if (r11 >= r12) goto L34
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
            goto L13
        L34:
            long r10 = r9.size()
            long r10 = r10 + r7
            r9.setSize$okio(r10)
            return r9
    }

    public static final void commonWrite(okio.Buffer r7, okio.Buffer r8, long r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            if (r8 == r7) goto Lc0
            long r1 = r8.size()
            r3 = 0
            r5 = r9
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
        L16:
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lbf
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.limit
            okio.Segment r1 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.pos
            int r0 = r0 - r1
            long r0 = (long) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L7d
            okio.Segment r0 = r7.head
            if (r0 == 0) goto L3c
            okio.Segment r0 = r7.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okio.Segment r0 = r0.prev
            goto L3d
        L3c:
            r0 = 0
        L3d:
            if (r0 == 0) goto L71
            boolean r1 = r0.owner
            if (r1 == 0) goto L71
            int r1 = r0.limit
            long r1 = (long) r1
            long r1 = r1 + r9
            boolean r3 = r0.shared
            if (r3 == 0) goto L4d
            r3 = 0
            goto L4f
        L4d:
            int r3 = r0.pos
        L4f:
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 8192(0x2000, double:4.0474E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L71
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
            return
        L71:
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = (int) r9
            okio.Segment r0 = r0.split(r1)
            r8.head = r0
        L7d:
            okio.Segment r0 = r8.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r0.limit
            int r2 = r0.pos
            int r1 = r1 - r2
            long r1 = (long) r1
            okio.Segment r3 = r0.pop()
            r8.head = r3
            okio.Segment r3 = r7.head
            if (r3 != 0) goto L9b
            r7.head = r0
            r0.prev = r0
            okio.Segment r3 = r0.prev
            r0.next = r3
            goto Lac
        L9b:
            okio.Segment r3 = r7.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r3 = r3.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Segment r0 = r3.push(r0)
            r0.compact()
        Lac:
            long r3 = r8.size()
            long r3 = r3 - r1
            r8.setSize$okio(r3)
            long r3 = r7.size()
            long r3 = r3 + r1
            r7.setSize$okio(r3)
            long r9 = r9 - r1
            goto L16
        Lbf:
            return
        Lc0:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "source == this"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer r0, okio.ByteString r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r1.size()
        Ld:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "byteString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            r1.write$okio(r0, r2, r3)
            return r0
    }

    public static final long commonWriteAll(okio.Buffer r6, okio.Source r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
        Lc:
            r2 = 8192(0x2000, double:4.0474E-320)
            long r2 = r7.read(r6, r2)
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L1a
            long r0 = r0 + r2
            goto Lc
        L1a:
            return r0
    }

    public static final okio.Buffer commonWriteByte(okio.Buffer r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
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

    public static final okio.Buffer commonWriteDecimalLong(okio.Buffer r12, long r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L12
            r13 = 48
            okio.Buffer r12 = r12.writeByte(r13)
            return r12
        L12:
            r3 = 1
            if (r2 >= 0) goto L23
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L21
            java.lang.String r13 = "-9223372036854775808"
            okio.Buffer r12 = r12.writeUtf8(r13)
            return r12
        L21:
            r2 = r3
            goto L24
        L23:
            r2 = 0
        L24:
            r4 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            r5 = 10
            if (r4 >= 0) goto L72
            r6 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 >= 0) goto L50
            r6 = 100
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 >= 0) goto L44
            r6 = 10
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 >= 0) goto L41
            goto Le9
        L41:
            r3 = 2
            goto Le9
        L44:
            r3 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L4d
            r3 = 3
            goto Le9
        L4d:
            r3 = 4
            goto Le9
        L50:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L64
            r3 = 100000(0x186a0, double:4.94066E-319)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L61
            r3 = 5
            goto Le9
        L61:
            r3 = 6
            goto Le9
        L64:
            r3 = 10000000(0x989680, double:4.9406565E-317)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L6e
            r3 = 7
            goto Le9
        L6e:
            r3 = 8
            goto Le9
        L72:
            r3 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9f
            r3 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L90
            r3 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L8e
            r3 = 9
            goto Le9
        L8e:
            r3 = r5
            goto Le9
        L90:
            r3 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9c
            r3 = 11
            goto Le9
        L9c:
            r3 = 12
            goto Le9
        L9f:
            r3 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lc3
            r3 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lb4
            r3 = 13
            goto Le9
        Lb4:
            r3 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lc0
            r3 = 14
            goto Le9
        Lc0:
            r3 = 15
            goto Le9
        Lc3:
            r3 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Ldb
            r3 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Ld8
            r3 = 16
            goto Le9
        Ld8:
            r3 = 17
            goto Le9
        Ldb:
            r3 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Le7
            r3 = 18
            goto Le9
        Le7:
            r3 = 19
        Le9:
            if (r2 == 0) goto Led
            int r3 = r3 + 1
        Led:
            okio.Segment r4 = r12.writableSegment$okio(r3)
            byte[] r6 = r4.data
            int r7 = r4.limit
            int r7 = r7 + r3
        Lf6:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L10a
            long r8 = (long) r5
            long r10 = r13 % r8
            int r10 = (int) r10
            int r7 = r7 + (-1)
            byte[] r11 = getHEX_DIGIT_BYTES()
            r10 = r11[r10]
            r6[r7] = r10
            long r13 = r13 / r8
            goto Lf6
        L10a:
            if (r2 == 0) goto L112
            int r7 = r7 + (-1)
            r13 = 45
            r6[r7] = r13
        L112:
            int r13 = r4.limit
            int r13 = r13 + r3
            r4.limit = r13
            long r13 = r12.size()
            long r0 = (long) r3
            long r13 = r13 + r0
            r12.setSize$okio(r13)
            return r12
    }

    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(okio.Buffer r12, long r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
            r13 = 48
            okio.Buffer r12 = r12.writeByte(r13)
            return r12
        L12:
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
        L68:
            if (r5 < r0) goto L7a
            byte[] r6 = getHEX_DIGIT_BYTES()
            r7 = 15
            long r7 = r7 & r13
            int r7 = (int) r7
            r6 = r6[r7]
            r3[r5] = r6
            long r13 = r13 >>> r4
            int r5 = r5 + (-1)
            goto L68
        L7a:
            int r13 = r2.limit
            int r13 = r13 + r1
            r2.limit = r13
            long r13 = r12.size()
            long r0 = (long) r1
            long r13 = r13 + r0
            r12.setSize$okio(r13)
            return r12
    }

    public static final okio.Buffer commonWriteInt(okio.Buffer r7, int r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
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

    public static final okio.Buffer commonWriteLong(okio.Buffer r11, long r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
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

    public static final okio.Buffer commonWriteShort(okio.Buffer r6, int r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
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

    public static final okio.Buffer commonWriteUtf8(okio.Buffer r11, java.lang.String r12, int r13, int r14) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "string"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            if (r13 < 0) goto L186
            if (r14 < r13) goto L163
            int r0 = r12.length()
            if (r14 > r0) goto L13c
        L14:
            if (r13 >= r14) goto L13b
            char r0 = r12.charAt(r13)
            r1 = 128(0x80, float:1.8E-43)
            r2 = 1
            if (r0 >= r1) goto L57
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
        L34:
            r13 = r6
            if (r13 >= r5) goto L44
            char r0 = r12.charAt(r13)
            if (r0 >= r1) goto L44
            int r6 = r13 + 1
            int r13 = r13 + r4
            byte r0 = (byte) r0
            r3[r13] = r0
            goto L34
        L44:
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
            goto L14
        L57:
            r3 = 2048(0x800, float:2.87E-42)
            r4 = 2
            if (r0 >= r3) goto L88
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
        L85:
            int r13 = r13 + 1
            goto L14
        L88:
            r3 = 55296(0xd800, float:7.7486E-41)
            r5 = 3
            r6 = 63
            if (r0 < r3) goto L104
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r0 <= r3) goto L96
            goto L104
        L96:
            int r3 = r13 + 1
            if (r3 >= r14) goto L9f
            char r7 = r12.charAt(r3)
            goto La0
        L9f:
            r7 = 0
        La0:
            r8 = 56319(0xdbff, float:7.892E-41)
            if (r0 > r8) goto Lfe
            r8 = 56320(0xdc00, float:7.8921E-41)
            if (r8 > r7) goto Lfe
            r8 = 57344(0xe000, float:8.0356E-41)
            if (r7 >= r8) goto Lfe
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
            goto L14
        Lfe:
            r11.writeByte(r6)
            r13 = r3
            goto L14
        L104:
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
            goto L85
        L13b:
            return r11
        L13c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "endIndex > string.length: "
            r11.<init>(r13)
            java.lang.StringBuilder r11 = r11.append(r14)
            java.lang.String r13 = " > "
            java.lang.StringBuilder r11 = r11.append(r13)
            int r12 = r12.length()
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L163:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "endIndex < beginIndex: "
            r11.<init>(r12)
            java.lang.StringBuilder r11 = r11.append(r14)
            java.lang.String r12 = " < "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L186:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "beginIndex < 0: "
            r11.<init>(r12)
            java.lang.StringBuilder r11 = r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    public static final okio.Buffer commonWriteUtf8CodePoint(okio.Buffer r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 128(0x80, float:1.8E-43)
            if (r10 >= r0) goto Le
            r9.writeByte(r10)
            goto Ld1
        Le:
            r1 = 2048(0x800, float:2.87E-42)
            r2 = 2
            r3 = 63
            if (r10 >= r1) goto L40
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
            goto Ld1
        L40:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r1 > r10) goto L4f
            r1 = 57344(0xe000, float:8.0356E-41)
            if (r10 >= r1) goto L4f
            r9.writeByte(r3)
            goto Ld1
        L4f:
            r1 = 65536(0x10000, float:9.1835E-41)
            r4 = 3
            if (r10 >= r1) goto L8a
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
            goto Ld1
        L8a:
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r10 > r1) goto Ld2
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
        Ld1:
            return r9
        Ld2:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected code point: 0x"
            r0.<init>(r1)
            java.lang.String r10 = okio.SegmentedByteString.toHexString(r10)
            java.lang.StringBuilder r10 = r0.append(r10)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    public static final byte[] getHEX_DIGIT_BYTES() {
            byte[] r0 = okio.internal.Buffer.HEX_DIGIT_BYTES
            return r0
    }

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
            return
    }

    public static final boolean rangeEquals(okio.Segment r5, int r6, byte[] r7, int r8, int r9) {
            java.lang.String r0 = "segment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r5.limit
            byte[] r1 = r5.data
        Le:
            if (r8 >= r9) goto L2e
            if (r6 != r0) goto L21
            okio.Segment r5 = r5.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            byte[] r6 = r5.data
            int r0 = r5.pos
            int r1 = r5.limit
            r4 = r1
            r1 = r6
            r6 = r0
            r0 = r4
        L21:
            r2 = r1[r6]
            r3 = r7[r8]
            if (r2 == r3) goto L29
            r5 = 0
            return r5
        L29:
            int r6 = r6 + 1
            int r8 = r8 + 1
            goto Le
        L2e:
            r5 = 1
            return r5
    }

    public static final java.lang.String readUtf8Line(okio.Buffer r6, long r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L21
            long r3 = r7 - r1
            byte r0 = r6.getByte(r3)
            r5 = 13
            if (r0 != r5) goto L21
            java.lang.String r7 = r6.readUtf8(r3)
            r0 = 2
            r6.skip(r0)
            goto L28
        L21:
            java.lang.String r7 = r6.readUtf8(r7)
            r6.skip(r1)
        L28:
            return r7
    }

    public static final <T> T seek(okio.Buffer r5, long r6, kotlin.jvm.functions.Function2<? super okio.Segment, ? super java.lang.Long, ? extends T> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "lambda"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            okio.Segment r0 = r5.head
            if (r0 != 0) goto L1a
            r5 = -1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            java.lang.Object r5 = r8.invoke(r6, r5)
            return r5
        L1a:
            long r1 = r5.size()
            long r1 = r1 - r6
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto L41
            long r1 = r5.size()
        L27:
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 <= 0) goto L38
            okio.Segment r0 = r0.prev
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r5 = r0.limit
            int r3 = r0.pos
            int r5 = r5 - r3
            long r3 = (long) r5
            long r1 = r1 - r3
            goto L27
        L38:
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            java.lang.Object r5 = r8.invoke(r0, r5)
            return r5
        L41:
            r1 = 0
        L43:
            int r5 = r0.limit
            int r3 = r0.pos
            int r5 = r5 - r3
            long r3 = (long) r5
            long r3 = r3 + r1
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 > 0) goto L55
            okio.Segment r0 = r0.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r3
            goto L43
        L55:
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            java.lang.Object r5 = r8.invoke(r0, r5)
            return r5
    }

    public static final int selectPrefix(okio.Buffer r17, okio.Options r18, boolean r19) {
            r0 = r17
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "options"
            r2 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            okio.Segment r0 = r0.head
            r1 = -2
            r3 = -1
            if (r0 != 0) goto L19
            if (r19 == 0) goto L17
            goto L18
        L17:
            r1 = r3
        L18:
            return r1
        L19:
            byte[] r4 = r0.data
            int r5 = r0.pos
            int r6 = r0.limit
            int[] r2 = r18.getTrie$okio()
            r7 = 0
            r9 = r0
            r10 = r3
            r8 = r7
        L27:
            int r11 = r8 + 1
            r12 = r2[r8]
            int r8 = r8 + 2
            r11 = r2[r11]
            if (r11 == r3) goto L32
            r10 = r11
        L32:
            if (r9 != 0) goto L35
            goto L65
        L35:
            r11 = 0
            if (r12 >= 0) goto L7f
            int r12 = r12 * (-1)
            int r13 = r8 + r12
        L3c:
            int r12 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + 1
            r8 = r2[r8]
            if (r5 == r8) goto L49
            return r10
        L49:
            if (r14 != r13) goto L4d
            r5 = 1
            goto L4e
        L4d:
            r5 = r7
        L4e:
            if (r12 != r6) goto L6f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            okio.Segment r4 = r9.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r6 = r4.pos
            byte[] r8 = r4.data
            int r9 = r4.limit
            if (r4 != r0) goto L69
            if (r5 == 0) goto L65
            r4 = r8
            r8 = r11
            goto L72
        L65:
            if (r19 == 0) goto L68
            return r1
        L68:
            return r10
        L69:
            r16 = r8
            r8 = r4
            r4 = r16
            goto L72
        L6f:
            r8 = r9
            r9 = r6
            r6 = r12
        L72:
            if (r5 == 0) goto L7a
            r5 = r2[r14]
            r13 = r6
            r6 = r9
            r9 = r8
            goto La4
        L7a:
            r5 = r6
            r6 = r9
            r9 = r8
            r8 = r14
            goto L3c
        L7f:
            int r13 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + r12
        L87:
            if (r8 != r14) goto L8a
            return r10
        L8a:
            r15 = r2[r8]
            if (r5 != r15) goto Lab
            int r8 = r8 + r12
            r5 = r2[r8]
            if (r13 != r6) goto La4
            okio.Segment r9 = r9.next
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)
            int r4 = r9.pos
            byte[] r6 = r9.data
            int r8 = r9.limit
            r13 = r4
            r4 = r6
            r6 = r8
            if (r9 != r0) goto La4
            r9 = r11
        La4:
            if (r5 < 0) goto La7
            return r5
        La7:
            int r8 = -r5
            r5 = r13
            goto L27
        Lab:
            int r8 = r8 + 1
            goto L87
    }

    public static /* synthetic */ int selectPrefix$default(okio.Buffer r0, okio.Options r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            int r0 = selectPrefix(r0, r1, r2)
            return r0
    }
}
