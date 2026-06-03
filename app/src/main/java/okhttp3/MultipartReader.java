package okhttp3;

/* JADX INFO: compiled from: MultipartReader.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001c\u001d\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0018\u00010\u0010R\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "response", "Lokhttp3/ResponseBody;", "(Lokhttp3/ResponseBody;)V", "source", "Lokio/BufferedSource;", "boundary", "", "(Lokio/BufferedSource;Ljava/lang/String;)V", "()Ljava/lang/String;", "closed", "", "crlfDashDashBoundary", "Lokio/ByteString;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "dashDashBoundary", "noMoreParts", "partCount", "", "close", "", "currentPartBytesRemaining", "", "maxResult", "nextPart", "Lokhttp3/MultipartReader$Part;", "Companion", "Part", "PartSource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultipartReader implements java.io.Closeable {
    public static final okhttp3.MultipartReader.Companion Companion = null;
    private static final okio.Options afterBoundaryOptions = null;
    private final java.lang.String boundary;
    private boolean closed;
    private final okio.ByteString crlfDashDashBoundary;
    private okhttp3.MultipartReader.PartSource currentPart;
    private final okio.ByteString dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final okio.BufferedSource source;

    /* JADX INFO: compiled from: MultipartReader.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "()V", "afterBoundaryOptions", "Lokio/Options;", "getAfterBoundaryOptions", "()Lokio/Options;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okio.Options getAfterBoundaryOptions() {
                r1 = this;
                okio.Options r0 = okhttp3.MultipartReader.access$getAfterBoundaryOptions$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: MultipartReader.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\nH\u0096\u0001R\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\b¨\u0006\u000b"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "headers", "Lokhttp3/Headers;", "body", "Lokio/BufferedSource;", "(Lokhttp3/Headers;Lokio/BufferedSource;)V", "()Lokio/BufferedSource;", "()Lokhttp3/Headers;", "close", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Part implements java.io.Closeable {
        private final okio.BufferedSource body;
        private final okhttp3.Headers headers;

        public Part(okhttp3.Headers r2, okio.BufferedSource r3) {
                r1 = this;
                java.lang.String r0 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "body"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>()
                r1.headers = r2
                r1.body = r3
                return
        }

        public final okio.BufferedSource body() {
                r1 = this;
                okio.BufferedSource r0 = r1.body
                return r0
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                okio.BufferedSource r0 = r1.body
                r0.close()
                return
        }

        public final okhttp3.Headers headers() {
                r1 = this;
                okhttp3.Headers r0 = r1.headers
                return r0
        }
    }

    /* JADX INFO: compiled from: MultipartReader.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\u0003\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lokio/Source;", "(Lokhttp3/MultipartReader;)V", "timeout", "Lokio/Timeout;", "close", "", "read", "", "sink", "Lokio/Buffer;", "byteCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class PartSource implements okio.Source {
        final /* synthetic */ okhttp3.MultipartReader this$0;
        private final okio.Timeout timeout;

        public PartSource(okhttp3.MultipartReader r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                okio.Timeout r1 = new okio.Timeout
                r1.<init>()
                r0.timeout = r1
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r2 = this;
                okhttp3.MultipartReader r0 = r2.this$0
                okhttp3.MultipartReader$PartSource r0 = okhttp3.MultipartReader.access$getCurrentPart$p(r0)
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
                if (r0 == 0) goto L12
                okhttp3.MultipartReader r0 = r2.this$0
                r1 = 0
                okhttp3.MultipartReader.access$setCurrentPart$p(r0, r1)
            L12:
                return
        }

        @Override // okio.Source
        public long read(okio.Buffer r17, long r18) {
                r16 = this;
                r1 = r16
                r0 = r17
                r2 = r18
                java.lang.String r4 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto Le2
                okhttp3.MultipartReader r6 = r1.this$0
                okhttp3.MultipartReader$PartSource r6 = okhttp3.MultipartReader.access$getCurrentPart$p(r6)
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r1)
                if (r6 == 0) goto Ld6
                okhttp3.MultipartReader r6 = r1.this$0
                okio.BufferedSource r6 = okhttp3.MultipartReader.access$getSource$p(r6)
                okio.Timeout r6 = r6.timeout()
                okio.Timeout r7 = r1.timeout
                okhttp3.MultipartReader r8 = r1.this$0
                long r9 = r6.timeoutNanos()
                okio.Timeout$Companion r11 = okio.Timeout.Companion
                long r12 = r7.timeoutNanos()
                long r14 = r6.timeoutNanos()
                long r11 = r11.minTimeout(r12, r14)
                java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS
                r6.timeout(r11, r13)
                boolean r11 = r6.hasDeadline()
                if (r11 == 0) goto L95
                long r14 = r6.deadlineNanoTime()
                boolean r11 = r7.hasDeadline()
                if (r11 == 0) goto L61
                long r12 = r6.deadlineNanoTime()
                long r4 = r7.deadlineNanoTime()
                long r4 = java.lang.Math.min(r12, r4)
                r6.deadlineNanoTime(r4)
            L61:
                long r2 = okhttp3.MultipartReader.access$currentPartBytesRemaining(r8, r2)     // Catch: java.lang.Throwable -> L85
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 != 0) goto L6e
                r12 = -1
                goto L76
            L6e:
                okio.BufferedSource r4 = okhttp3.MultipartReader.access$getSource$p(r8)     // Catch: java.lang.Throwable -> L85
                long r12 = r4.read(r0, r2)     // Catch: java.lang.Throwable -> L85
            L76:
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
                r6.timeout(r9, r0)
                boolean r0 = r7.hasDeadline()
                if (r0 == 0) goto L84
                r6.deadlineNanoTime(r14)
            L84:
                return r12
            L85:
                r0 = move-exception
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
                r6.timeout(r9, r2)
                boolean r2 = r7.hasDeadline()
                if (r2 == 0) goto L94
                r6.deadlineNanoTime(r14)
            L94:
                throw r0
            L95:
                boolean r4 = r7.hasDeadline()
                if (r4 == 0) goto La2
                long r4 = r7.deadlineNanoTime()
                r6.deadlineNanoTime(r4)
            La2:
                long r2 = okhttp3.MultipartReader.access$currentPartBytesRemaining(r8, r2)     // Catch: java.lang.Throwable -> Lc6
                r4 = 0
                int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r4 != 0) goto Laf
                r12 = -1
                goto Lb7
            Laf:
                okio.BufferedSource r4 = okhttp3.MultipartReader.access$getSource$p(r8)     // Catch: java.lang.Throwable -> Lc6
                long r12 = r4.read(r0, r2)     // Catch: java.lang.Throwable -> Lc6
            Lb7:
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
                r6.timeout(r9, r0)
                boolean r0 = r7.hasDeadline()
                if (r0 == 0) goto Lc5
                r6.clearDeadline()
            Lc5:
                return r12
            Lc6:
                r0 = move-exception
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
                r6.timeout(r9, r2)
                boolean r2 = r7.hasDeadline()
                if (r2 == 0) goto Ld5
                r6.clearDeadline()
            Ld5:
                throw r0
            Ld6:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "closed"
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            Le2:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r4 = "byteCount < 0: "
                r0.<init>(r4)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
                r1 = this;
                okio.Timeout r0 = r1.timeout
                return r0
        }
    }

    static {
            okhttp3.MultipartReader$Companion r0 = new okhttp3.MultipartReader$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.MultipartReader.Companion = r0
            okio.Options$Companion r0 = okio.Options.Companion
            r1 = 4
            okio.ByteString[] r1 = new okio.ByteString[r1]
            okio.ByteString$Companion r2 = okio.ByteString.Companion
            java.lang.String r3 = "\r\n"
            okio.ByteString r2 = r2.encodeUtf8(r3)
            r3 = 0
            r1[r3] = r2
            okio.ByteString$Companion r2 = okio.ByteString.Companion
            java.lang.String r3 = "--"
            okio.ByteString r2 = r2.encodeUtf8(r3)
            r3 = 1
            r1[r3] = r2
            okio.ByteString$Companion r2 = okio.ByteString.Companion
            java.lang.String r3 = " "
            okio.ByteString r2 = r2.encodeUtf8(r3)
            r3 = 2
            r1[r3] = r2
            okio.ByteString$Companion r2 = okio.ByteString.Companion
            java.lang.String r3 = "\t"
            okio.ByteString r2 = r2.encodeUtf8(r3)
            r3 = 3
            r1[r3] = r2
            okio.Options r0 = r0.of(r1)
            okhttp3.MultipartReader.afterBoundaryOptions = r0
            return
    }

    public MultipartReader(okhttp3.ResponseBody r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.BufferedSource r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L1b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L1b
            r2.<init>(r0, r3)
            return
        L1b:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
    }

    public MultipartReader(okio.BufferedSource r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "boundary"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.source = r2
            r1.boundary = r3
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            java.lang.String r0 = "--"
            okio.Buffer r2 = r2.writeUtf8(r0)
            okio.Buffer r2 = r2.writeUtf8(r3)
            okio.ByteString r2 = r2.readByteString()
            r1.dashDashBoundary = r2
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            java.lang.String r0 = "\r\n--"
            okio.Buffer r2 = r2.writeUtf8(r0)
            okio.Buffer r2 = r2.writeUtf8(r3)
            okio.ByteString r2 = r2.readByteString()
            r1.crlfDashDashBoundary = r2
            return
    }

    public static final /* synthetic */ long access$currentPartBytesRemaining(okhttp3.MultipartReader r0, long r1) {
            long r0 = r0.currentPartBytesRemaining(r1)
            return r0
    }

    public static final /* synthetic */ okio.Options access$getAfterBoundaryOptions$cp() {
            okio.Options r0 = okhttp3.MultipartReader.afterBoundaryOptions
            return r0
    }

    public static final /* synthetic */ okhttp3.MultipartReader.PartSource access$getCurrentPart$p(okhttp3.MultipartReader r0) {
            okhttp3.MultipartReader$PartSource r0 = r0.currentPart
            return r0
    }

    public static final /* synthetic */ okio.BufferedSource access$getSource$p(okhttp3.MultipartReader r0) {
            okio.BufferedSource r0 = r0.source
            return r0
    }

    public static final /* synthetic */ void access$setCurrentPart$p(okhttp3.MultipartReader r0, okhttp3.MultipartReader.PartSource r1) {
            r0.currentPart = r1
            return
    }

    private final long currentPartBytesRemaining(long r5) {
            r4 = this;
            okio.BufferedSource r0 = r4.source
            okio.ByteString r1 = r4.crlfDashDashBoundary
            int r1 = r1.size()
            long r1 = (long) r1
            r0.require(r1)
            okio.BufferedSource r0 = r4.source
            okio.Buffer r0 = r0.getBuffer()
            okio.ByteString r1 = r4.crlfDashDashBoundary
            long r0 = r0.indexOf(r1)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L38
            okio.BufferedSource r0 = r4.source
            okio.Buffer r0 = r0.getBuffer()
            long r0 = r0.size()
            okio.ByteString r2 = r4.crlfDashDashBoundary
            int r2 = r2.size()
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            long r5 = java.lang.Math.min(r5, r0)
            goto L3c
        L38:
            long r5 = java.lang.Math.min(r5, r0)
        L3c:
            return r5
    }

    public final java.lang.String boundary() {
            r1 = this;
            java.lang.String r0 = r1.boundary
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.closed = r0
            r0 = 0
            r1.currentPart = r0
            okio.BufferedSource r0 = r1.source
            r0.close()
            return
    }

    public final okhttp3.MultipartReader.Part nextPart() throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.closed
            if (r0 != 0) goto L9f
            boolean r0 = r6.noMoreParts
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            int r0 = r6.partCount
            r2 = 0
            if (r0 != 0) goto L27
            okio.BufferedSource r0 = r6.source
            okio.ByteString r4 = r6.dashDashBoundary
            boolean r0 = r0.rangeEquals(r2, r4)
            if (r0 == 0) goto L27
            okio.BufferedSource r0 = r6.source
            okio.ByteString r2 = r6.dashDashBoundary
            int r2 = r2.size()
            long r2 = (long) r2
            r0.skip(r2)
            goto L43
        L27:
            r4 = 8192(0x2000, double:4.0474E-320)
            long r4 = r6.currentPartBytesRemaining(r4)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L37
            okio.BufferedSource r0 = r6.source
            r0.skip(r4)
            goto L27
        L37:
            okio.BufferedSource r0 = r6.source
            okio.ByteString r2 = r6.crlfDashDashBoundary
            int r2 = r2.size()
            long r2 = (long) r2
            r0.skip(r2)
        L43:
            r0 = 0
        L44:
            okio.BufferedSource r2 = r6.source
            okio.Options r3 = okhttp3.MultipartReader.afterBoundaryOptions
            int r2 = r2.select(r3)
            r3 = -1
            java.lang.String r4 = "unexpected characters after boundary"
            if (r2 == r3) goto L99
            r3 = 1
            if (r2 == 0) goto L76
            if (r2 == r3) goto L5f
            r4 = 2
            if (r2 == r4) goto L5d
            r4 = 3
            if (r2 == r4) goto L5d
            goto L44
        L5d:
            r0 = r3
            goto L44
        L5f:
            if (r0 != 0) goto L70
            int r0 = r6.partCount
            if (r0 == 0) goto L68
            r6.noMoreParts = r3
            return r1
        L68:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "expected at least 1 part"
            r0.<init>(r1)
            throw r0
        L70:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r4)
            throw r0
        L76:
            int r0 = r6.partCount
            int r0 = r0 + r3
            r6.partCount = r0
            okhttp3.internal.http1.HeadersReader r0 = new okhttp3.internal.http1.HeadersReader
            okio.BufferedSource r1 = r6.source
            r0.<init>(r1)
            okhttp3.Headers r0 = r0.readHeaders()
            okhttp3.MultipartReader$PartSource r1 = new okhttp3.MultipartReader$PartSource
            r1.<init>(r6)
            r6.currentPart = r1
            okhttp3.MultipartReader$Part r2 = new okhttp3.MultipartReader$Part
            okio.Source r1 = (okio.Source) r1
            okio.BufferedSource r1 = okio.Okio.buffer(r1)
            r2.<init>(r0, r1)
            return r2
        L99:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            r0.<init>(r4)
            throw r0
        L9f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "closed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
