package okhttp3.internal.http2;

/* JADX INFO: compiled from: Http2Stream.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 _2\u00020\u0001:\u0004_`abB1\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020#J\r\u0010C\u001a\u00020AH\u0000¢\u0006\u0002\bDJ\r\u0010E\u001a\u00020AH\u0000¢\u0006\u0002\bFJ\u0018\u0010G\u001a\u00020A2\u0006\u0010H\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u001a\u0010I\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u000e\u0010J\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010K\u001a\u00020A2\u0006\u0010L\u001a\u00020\nJ\u0006\u0010M\u001a\u00020NJ\u0006\u0010O\u001a\u00020PJ\u0006\u0010,\u001a\u00020QJ\u0016\u0010R\u001a\u00020A2\u0006\u00104\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0003J\u0016\u0010U\u001a\u00020A2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010V\u001a\u00020A2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010W\u001a\u00020\nJ\u0006\u0010L\u001a\u00020\nJ\r\u0010X\u001a\u00020AH\u0000¢\u0006\u0002\bYJ$\u0010Z\u001a\u00020A2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020]0\\2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u0007J\u0006\u0010>\u001a\u00020QR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010 R$\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\u0018\u0010,\u001a\u00060-R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u00100\u001a\u000601R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u00104\u001a\u000605R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R$\u00108\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R$\u0010;\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010&\"\u0004\b=\u0010(R\u0018\u0010>\u001a\u00060-R\u00020\u0000X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010/¨\u0006c"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "id", "", "connection", "Lokhttp3/internal/http2/Http2Connection;", "outFinished", "", "inFinished", "headers", "Lokhttp3/Headers;", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "(Lokhttp3/internal/http2/ErrorCode;)V", "errorException", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "hasResponseHeaders", "headersQueue", "Ljava/util/ArrayDeque;", "getId", "()I", "isLocallyInitiated", "()Z", "isOpen", "<set-?>", "", "readBytesAcknowledged", "getReadBytesAcknowledged", "()J", "setReadBytesAcknowledged$okhttp", "(J)V", "readBytesTotal", "getReadBytesTotal", "setReadBytesTotal$okhttp", "readTimeout", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "source", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeTimeout", "getWriteTimeout$okhttp", "addBytesToWriteWindow", "", "delta", "cancelStreamIfNecessary", "cancelStreamIfNecessary$okhttp", "checkOutNotClosed", "checkOutNotClosed$okhttp", "close", "rstStatusCode", "closeInternal", "closeLater", "enqueueTrailers", "trailers", "getSink", "Lokio/Sink;", "getSource", "Lokio/Source;", "Lokio/Timeout;", "receiveData", "Lokio/BufferedSource;", "length", "receiveHeaders", "receiveRstStream", "takeHeaders", "waitForIo", "waitForIo$okhttp", "writeHeaders", "responseHeaders", "", "Lokhttp3/internal/http2/Header;", "flushHeaders", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Http2Stream {
    public static final okhttp3.internal.http2.Http2Stream.Companion Companion = null;
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final okhttp3.internal.http2.Http2Connection connection;
    private okhttp3.internal.http2.ErrorCode errorCode;
    private java.io.IOException errorException;
    private boolean hasResponseHeaders;
    private final java.util.ArrayDeque<okhttp3.Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final okhttp3.internal.http2.Http2Stream.StreamTimeout readTimeout;
    private final okhttp3.internal.http2.Http2Stream.FramingSink sink;
    private final okhttp3.internal.http2.Http2Stream.FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final okhttp3.internal.http2.Http2Stream.StreamTimeout writeTimeout;

    /* JADX INFO: compiled from: Http2Stream.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "()V", "EMIT_BUFFER_SIZE", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokio/Sink;", "finished", "", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "closed", "getClosed", "()Z", "setClosed", "(Z)V", "getFinished", "setFinished", "sendBuffer", "Lokio/Buffer;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "close", "", "emitFrame", "outFinishedOnLastFrame", "flush", "timeout", "Lokio/Timeout;", "write", "source", "byteCount", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FramingSink implements okio.Sink {
        private boolean closed;
        private boolean finished;
        private final okio.Buffer sendBuffer;
        final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;
        private okhttp3.Headers trailers;

        public FramingSink(okhttp3.internal.http2.Http2Stream r1, boolean r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.finished = r2
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r0.sendBuffer = r1
                return
        }

        public /* synthetic */ FramingSink(okhttp3.internal.http2.Http2Stream r1, boolean r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
                r0 = this;
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                r0.<init>(r1, r2)
                return
        }

        private final void emitFrame(boolean r12) throws java.io.IOException {
                r11 = this;
                okhttp3.internal.http2.Http2Stream r0 = r11.this$0
                monitor-enter(r0)
                okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r0.getWriteTimeout$okhttp()     // Catch: java.lang.Throwable -> L98
                r1.enter()     // Catch: java.lang.Throwable -> L98
            La:
                long r1 = r0.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L8f
                long r3 = r0.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L8f
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 < 0) goto L28
                boolean r1 = r11.finished     // Catch: java.lang.Throwable -> L8f
                if (r1 != 0) goto L28
                boolean r1 = r11.closed     // Catch: java.lang.Throwable -> L8f
                if (r1 != 0) goto L28
                okhttp3.internal.http2.ErrorCode r1 = r0.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> L8f
                if (r1 != 0) goto L28
                r0.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L8f
                goto La
            L28:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r0.getWriteTimeout$okhttp()     // Catch: java.lang.Throwable -> L98
                r1.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L98
                r0.checkOutNotClosed$okhttp()     // Catch: java.lang.Throwable -> L98
                long r1 = r0.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L98
                long r3 = r0.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L98
                long r1 = r1 - r3
                okio.Buffer r3 = r11.sendBuffer     // Catch: java.lang.Throwable -> L98
                long r3 = r3.size()     // Catch: java.lang.Throwable -> L98
                long r9 = java.lang.Math.min(r1, r3)     // Catch: java.lang.Throwable -> L98
                long r1 = r0.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L98
                long r1 = r1 + r9
                r0.setWriteBytesTotal$okhttp(r1)     // Catch: java.lang.Throwable -> L98
                if (r12 == 0) goto L5b
                okio.Buffer r12 = r11.sendBuffer     // Catch: java.lang.Throwable -> L98
                long r1 = r12.size()     // Catch: java.lang.Throwable -> L98
                int r12 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
                if (r12 != 0) goto L5b
                r12 = 1
                goto L5c
            L5b:
                r12 = 0
            L5c:
                r7 = r12
                kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L98
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r12 = r11.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r12 = r12.getWriteTimeout$okhttp()
                r12.enter()
                okhttp3.internal.http2.Http2Stream r12 = r11.this$0     // Catch: java.lang.Throwable -> L84
                okhttp3.internal.http2.Http2Connection r5 = r12.getConnection()     // Catch: java.lang.Throwable -> L84
                okhttp3.internal.http2.Http2Stream r12 = r11.this$0     // Catch: java.lang.Throwable -> L84
                int r6 = r12.getId()     // Catch: java.lang.Throwable -> L84
                okio.Buffer r8 = r11.sendBuffer     // Catch: java.lang.Throwable -> L84
                r5.writeData(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L84
                okhttp3.internal.http2.Http2Stream r12 = r11.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r12 = r12.getWriteTimeout$okhttp()
                r12.exitAndThrowIfTimedOut()
                return
            L84:
                r12 = move-exception
                okhttp3.internal.http2.Http2Stream r0 = r11.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.getWriteTimeout$okhttp()
                r0.exitAndThrowIfTimedOut()
                throw r12
            L8f:
                r12 = move-exception
                okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r0.getWriteTimeout$okhttp()     // Catch: java.lang.Throwable -> L98
                r1.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L98
                throw r12     // Catch: java.lang.Throwable -> L98
            L98:
                r12 = move-exception
                monitor-exit(r0)
                throw r12
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r10 = this;
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L34
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto Ld
                goto L34
            Ld:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Thread "
                r2.<init>(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r0 = r2.append(r0)
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L34:
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                monitor-enter(r0)
                boolean r1 = r10.closed     // Catch: java.lang.Throwable -> Lce
                if (r1 == 0) goto L3d
                monitor-exit(r0)
                return
            L3d:
                okhttp3.internal.http2.ErrorCode r1 = r0.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> Lce
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L47
                r1 = r3
                goto L48
            L47:
                r1 = r2
            L48:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lce
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                okhttp3.internal.http2.Http2Stream$FramingSink r0 = r0.getSink$okhttp()
                boolean r0 = r0.finished
                if (r0 != 0) goto Lb4
                okio.Buffer r0 = r10.sendBuffer
                long r4 = r0.size()
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L63
                r0 = r3
                goto L64
            L63:
                r0 = r2
            L64:
                okhttp3.Headers r4 = r10.trailers
                if (r4 == 0) goto L8f
            L68:
                okio.Buffer r0 = r10.sendBuffer
                long r4 = r0.size()
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r0 <= 0) goto L76
                r10.emitFrame(r2)
                goto L68
            L76:
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r2 = r10.this$0
                int r2 = r2.getId()
                okhttp3.Headers r4 = r10.trailers
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                java.util.List r4 = okhttp3.internal.Util.toHeaderList(r4)
                r0.writeHeaders$okhttp(r2, r1, r4)
                goto Lb4
            L8f:
                if (r0 == 0) goto L9f
            L91:
                okio.Buffer r0 = r10.sendBuffer
                long r0 = r0.size()
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto Lb4
                r10.emitFrame(r3)
                goto L91
            L9f:
                if (r1 == 0) goto Lb4
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                okhttp3.internal.http2.Http2Connection r4 = r0.getConnection()
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                int r5 = r0.getId()
                r7 = 0
                r8 = 0
                r6 = 1
                r4.writeData(r5, r6, r7, r8)
            Lb4:
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                monitor-enter(r0)
                r10.closed = r3     // Catch: java.lang.Throwable -> Lcb
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lcb
                monitor-exit(r0)
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = r10.this$0
                r0.cancelStreamIfNecessary$okhttp()
                return
            Lcb:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            Lce:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws java.io.IOException {
                r4 = this;
                okhttp3.internal.http2.Http2Stream r0 = r4.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L34
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto Ld
                goto L34
            Ld:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Thread "
                r2.<init>(r3)
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = " MUST NOT hold lock on "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r0 = r2.append(r0)
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            L34:
                okhttp3.internal.http2.Http2Stream r0 = r4.this$0
                monitor-enter(r0)
                r0.checkOutNotClosed$okhttp()     // Catch: java.lang.Throwable -> L58
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L58
                monitor-exit(r0)
            L3d:
                okio.Buffer r0 = r4.sendBuffer
                long r0 = r0.size()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L57
                r0 = 0
                r4.emitFrame(r0)
                okhttp3.internal.http2.Http2Stream r0 = r4.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.flush()
                goto L3d
            L57:
                return
            L58:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        public final boolean getClosed() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        public final boolean getFinished() {
                r1 = this;
                boolean r0 = r1.finished
                return r0
        }

        public final okhttp3.Headers getTrailers() {
                r1 = this;
                okhttp3.Headers r0 = r1.trailers
                return r0
        }

        public final void setClosed(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        public final void setFinished(boolean r1) {
                r0 = this;
                r0.finished = r1
                return
        }

        public final void setTrailers(okhttp3.Headers r1) {
                r0 = this;
                r0.trailers = r1
                return
        }

        @Override // okio.Sink
        public okio.Timeout timeout() {
                r1 = this;
                okhttp3.internal.http2.Http2Stream r0 = r1.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.getWriteTimeout$okhttp()
                okio.Timeout r0 = (okio.Timeout) r0
                return r0
        }

        @Override // okio.Sink
        public void write(okio.Buffer r3, long r4) throws java.io.IOException {
                r2 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L39
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L12
                goto L39
            L12:
                java.lang.AssertionError r3 = new java.lang.AssertionError
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Thread "
                r4.<init>(r5)
                java.lang.Thread r5 = java.lang.Thread.currentThread()
                java.lang.String r5 = r5.getName()
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.String r5 = " MUST NOT hold lock on "
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.StringBuilder r4 = r4.append(r0)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L39:
                okio.Buffer r0 = r2.sendBuffer
                r0.write(r3, r4)
            L3e:
                okio.Buffer r3 = r2.sendBuffer
                long r3 = r3.size()
                r0 = 16384(0x4000, double:8.095E-320)
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 < 0) goto L4f
                r3 = 0
                r2.emitFrame(r3)
                goto L3e
            L4f:
                return
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\u001d\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\"J\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002R\u001a\u0010\u0007\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokio/Source;", "maxByteCount", "", "finished", "", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "getFinished$okhttp", "setFinished$okhttp", "readBuffer", "Lokio/Buffer;", "getReadBuffer", "()Lokio/Buffer;", "receiveBuffer", "getReceiveBuffer", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "close", "", "read", "sink", "byteCount", "receive", "source", "Lokio/BufferedSource;", "receive$okhttp", "timeout", "Lokio/Timeout;", "updateConnectionFlowControl", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class FramingSource implements okio.Source {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private final okio.Buffer readBuffer;
        private final okio.Buffer receiveBuffer;
        final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;
        private okhttp3.Headers trailers;

        public FramingSource(okhttp3.internal.http2.Http2Stream r1, long r2, boolean r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.maxByteCount = r2
                r0.finished = r4
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r0.receiveBuffer = r1
                okio.Buffer r1 = new okio.Buffer
                r1.<init>()
                r0.readBuffer = r1
                return
        }

        private final void updateConnectionFlowControl(long r3) {
                r2 = this;
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L34
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto Ld
                goto L34
            Ld:
                java.lang.AssertionError r3 = new java.lang.AssertionError
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r1 = "Thread "
                r4.<init>(r1)
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r1 = r1.getName()
                java.lang.StringBuilder r4 = r4.append(r1)
                java.lang.String r1 = " MUST NOT hold lock on "
                java.lang.StringBuilder r4 = r4.append(r1)
                java.lang.StringBuilder r4 = r4.append(r0)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L34:
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.updateConnectionFlowControl$okhttp(r3)
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r5 = this;
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                monitor-enter(r0)
                r1 = 1
                r5.closed = r1     // Catch: java.lang.Throwable -> L2e
                okio.Buffer r1 = r5.readBuffer     // Catch: java.lang.Throwable -> L2e
                long r1 = r1.size()     // Catch: java.lang.Throwable -> L2e
                okio.Buffer r3 = r5.readBuffer     // Catch: java.lang.Throwable -> L2e
                r3.clear()     // Catch: java.lang.Throwable -> L2e
                java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r3)     // Catch: java.lang.Throwable -> L2e
                r3 = r0
                java.lang.Object r3 = (java.lang.Object) r3     // Catch: java.lang.Throwable -> L2e
                r3.notifyAll()     // Catch: java.lang.Throwable -> L2e
                kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r0)
                r3 = 0
                int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r0 <= 0) goto L28
                r5.updateConnectionFlowControl(r1)
            L28:
                okhttp3.internal.http2.Http2Stream r0 = r5.this$0
                r0.cancelStreamIfNecessary$okhttp()
                return
            L2e:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        public final boolean getClosed$okhttp() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        public final boolean getFinished$okhttp() {
                r1 = this;
                boolean r0 = r1.finished
                return r0
        }

        public final okio.Buffer getReadBuffer() {
                r1 = this;
                okio.Buffer r0 = r1.readBuffer
                return r0
        }

        public final okio.Buffer getReceiveBuffer() {
                r1 = this;
                okio.Buffer r0 = r1.receiveBuffer
                return r0
        }

        public final okhttp3.Headers getTrailers() {
                r1 = this;
                okhttp3.Headers r0 = r1.trailers
                return r0
        }

        @Override // okio.Source
        public long read(okio.Buffer r19, long r20) throws java.io.IOException {
                r18 = this;
                r1 = r18
                r0 = r19
                r2 = r20
                java.lang.String r4 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto Lce
            L11:
                okhttp3.internal.http2.Http2Stream r6 = r1.this$0
                monitor-enter(r6)
                okhttp3.internal.http2.Http2Stream$StreamTimeout r7 = r6.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Lcb
                r7.enter()     // Catch: java.lang.Throwable -> Lcb
                okhttp3.internal.http2.ErrorCode r7 = r6.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> Lc2
                if (r7 == 0) goto L3a
                boolean r7 = r1.finished     // Catch: java.lang.Throwable -> Lc2
                if (r7 != 0) goto L3a
                java.io.IOException r7 = r6.getErrorException$okhttp()     // Catch: java.lang.Throwable -> Lc2
                if (r7 != 0) goto L3b
                okhttp3.internal.http2.StreamResetException r7 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> Lc2
                okhttp3.internal.http2.ErrorCode r8 = r6.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> Lc2
                kotlin.jvm.internal.Intrinsics.checkNotNull(r8)     // Catch: java.lang.Throwable -> Lc2
                r7.<init>(r8)     // Catch: java.lang.Throwable -> Lc2
                java.io.IOException r7 = (java.io.IOException) r7     // Catch: java.lang.Throwable -> Lc2
                goto L3b
            L3a:
                r7 = 0
            L3b:
                boolean r8 = r1.closed     // Catch: java.lang.Throwable -> Lc2
                if (r8 != 0) goto Lba
                okio.Buffer r8 = r1.readBuffer     // Catch: java.lang.Throwable -> Lc2
                long r8 = r8.size()     // Catch: java.lang.Throwable -> Lc2
                int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                r9 = -1
                r11 = 0
                if (r8 <= 0) goto L94
                okio.Buffer r8 = r1.readBuffer     // Catch: java.lang.Throwable -> Lc2
                long r12 = r8.size()     // Catch: java.lang.Throwable -> Lc2
                long r12 = java.lang.Math.min(r2, r12)     // Catch: java.lang.Throwable -> Lc2
                long r12 = r8.read(r0, r12)     // Catch: java.lang.Throwable -> Lc2
                long r14 = r6.getReadBytesTotal()     // Catch: java.lang.Throwable -> Lc2
                long r14 = r14 + r12
                r6.setReadBytesTotal$okhttp(r14)     // Catch: java.lang.Throwable -> Lc2
                long r14 = r6.getReadBytesTotal()     // Catch: java.lang.Throwable -> Lc2
                long r16 = r6.getReadBytesAcknowledged()     // Catch: java.lang.Throwable -> Lc2
                long r14 = r14 - r16
                if (r7 != 0) goto L9f
                okhttp3.internal.http2.Http2Connection r8 = r6.getConnection()     // Catch: java.lang.Throwable -> Lc2
                okhttp3.internal.http2.Settings r8 = r8.getOkHttpSettings()     // Catch: java.lang.Throwable -> Lc2
                int r8 = r8.getInitialWindowSize()     // Catch: java.lang.Throwable -> Lc2
                int r8 = r8 / 2
                long r4 = (long) r8     // Catch: java.lang.Throwable -> Lc2
                int r4 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
                if (r4 < 0) goto L9f
                okhttp3.internal.http2.Http2Connection r4 = r6.getConnection()     // Catch: java.lang.Throwable -> Lc2
                int r5 = r6.getId()     // Catch: java.lang.Throwable -> Lc2
                r4.writeWindowUpdateLater$okhttp(r5, r14)     // Catch: java.lang.Throwable -> Lc2
                long r4 = r6.getReadBytesTotal()     // Catch: java.lang.Throwable -> Lc2
                r6.setReadBytesAcknowledged$okhttp(r4)     // Catch: java.lang.Throwable -> Lc2
                goto L9f
            L94:
                boolean r4 = r1.finished     // Catch: java.lang.Throwable -> Lc2
                if (r4 != 0) goto L9e
                if (r7 != 0) goto L9e
                r6.waitForIo$okhttp()     // Catch: java.lang.Throwable -> Lc2
                r11 = 1
            L9e:
                r12 = r9
            L9f:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r4 = r6.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Lcb
                r4.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Lcb
                kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lcb
                monitor-exit(r6)
                if (r11 == 0) goto Laf
                r4 = 0
                goto L11
            Laf:
                int r0 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
                if (r0 == 0) goto Lb4
                return r12
            Lb4:
                if (r7 != 0) goto Lb7
                return r9
            Lb7:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                throw r7
            Lba:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lc2
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch: java.lang.Throwable -> Lc2
                throw r0     // Catch: java.lang.Throwable -> Lc2
            Lc2:
                r0 = move-exception
                okhttp3.internal.http2.Http2Stream$StreamTimeout r2 = r6.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Lcb
                r2.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Lcb
                throw r0     // Catch: java.lang.Throwable -> Lcb
            Lcb:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            Lce:
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

        public final void receive$okhttp(okio.BufferedSource r12, long r13) throws java.io.IOException {
                r11 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                okhttp3.internal.http2.Http2Stream r0 = r11.this$0
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L39
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L12
                goto L39
            L12:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                java.lang.String r14 = "Thread "
                r13.<init>(r14)
                java.lang.Thread r14 = java.lang.Thread.currentThread()
                java.lang.String r14 = r14.getName()
                java.lang.StringBuilder r13 = r13.append(r14)
                java.lang.String r14 = " MUST NOT hold lock on "
                java.lang.StringBuilder r13 = r13.append(r14)
                java.lang.StringBuilder r13 = r13.append(r0)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            L39:
                r0 = r13
            L3a:
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto Lb9
                okhttp3.internal.http2.Http2Stream r4 = r11.this$0
                monitor-enter(r4)
                boolean r5 = r11.finished     // Catch: java.lang.Throwable -> Lb6
                okio.Buffer r6 = r11.readBuffer     // Catch: java.lang.Throwable -> Lb6
                long r6 = r6.size()     // Catch: java.lang.Throwable -> Lb6
                long r6 = r6 + r0
                long r8 = r11.maxByteCount     // Catch: java.lang.Throwable -> Lb6
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                r7 = 1
                r8 = 0
                if (r6 <= 0) goto L56
                r6 = r7
                goto L57
            L56:
                r6 = r8
            L57:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb6
                monitor-exit(r4)
                if (r6 == 0) goto L67
                r12.skip(r0)
                okhttp3.internal.http2.Http2Stream r12 = r11.this$0
                okhttp3.internal.http2.ErrorCode r13 = okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR
                r12.closeLater(r13)
                return
            L67:
                if (r5 == 0) goto L6d
                r12.skip(r0)
                return
            L6d:
                okio.Buffer r4 = r11.receiveBuffer
                long r4 = r12.read(r4, r0)
                r9 = -1
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 == 0) goto Lb0
                long r0 = r0 - r4
                okhttp3.internal.http2.Http2Stream r4 = r11.this$0
                monitor-enter(r4)
                boolean r5 = r11.closed     // Catch: java.lang.Throwable -> Lad
                if (r5 == 0) goto L87
                okio.Buffer r2 = r11.receiveBuffer     // Catch: java.lang.Throwable -> Lad
                r2.clear()     // Catch: java.lang.Throwable -> Lad
                goto La9
            L87:
                okio.Buffer r5 = r11.readBuffer     // Catch: java.lang.Throwable -> Lad
                long r5 = r5.size()     // Catch: java.lang.Throwable -> Lad
                int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
                if (r2 != 0) goto L92
                goto L93
            L92:
                r7 = r8
            L93:
                okio.Buffer r2 = r11.readBuffer     // Catch: java.lang.Throwable -> Lad
                okio.Buffer r3 = r11.receiveBuffer     // Catch: java.lang.Throwable -> Lad
                okio.Source r3 = (okio.Source) r3     // Catch: java.lang.Throwable -> Lad
                r2.writeAll(r3)     // Catch: java.lang.Throwable -> Lad
                if (r7 == 0) goto La9
                java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r2)     // Catch: java.lang.Throwable -> Lad
                r2 = r4
                java.lang.Object r2 = (java.lang.Object) r2     // Catch: java.lang.Throwable -> Lad
                r2.notifyAll()     // Catch: java.lang.Throwable -> Lad
            La9:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lad
                monitor-exit(r4)
                goto L3a
            Lad:
                r12 = move-exception
                monitor-exit(r4)
                throw r12
            Lb0:
                java.io.EOFException r12 = new java.io.EOFException
                r12.<init>()
                throw r12
            Lb6:
                r12 = move-exception
                monitor-exit(r4)
                throw r12
            Lb9:
                r11.updateConnectionFlowControl(r13)
                return
        }

        public final void setClosed$okhttp(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        public final void setFinished$okhttp(boolean r1) {
                r0 = this;
                r0.finished = r1
                return
        }

        public final void setTrailers(okhttp3.Headers r1) {
                r0 = this;
                r0.trailers = r1
                return
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
                r1 = this;
                okhttp3.internal.http2.Http2Stream r0 = r1.this$0
                okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r0.getReadTimeout$okhttp()
                okio.Timeout r0 = (okio.Timeout) r0
                return r0
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\t"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokio/AsyncTimeout;", "(Lokhttp3/internal/http2/Http2Stream;)V", "exitAndThrowIfTimedOut", "", "newTimeoutException", "Ljava/io/IOException;", "cause", "timedOut", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class StreamTimeout extends okio.AsyncTimeout {
        final /* synthetic */ okhttp3.internal.http2.Http2Stream this$0;

        public StreamTimeout(okhttp3.internal.http2.Http2Stream r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public final void exitAndThrowIfTimedOut() throws java.io.IOException {
                r1 = this;
                boolean r0 = r1.exit()
                if (r0 != 0) goto L7
                return
            L7:
                r0 = 0
                java.io.IOException r0 = r1.newTimeoutException(r0)
                throw r0
        }

        @Override // okio.AsyncTimeout
        protected java.io.IOException newTimeoutException(java.io.IOException r3) {
                r2 = this;
                java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
                java.lang.String r1 = "timeout"
                r0.<init>(r1)
                if (r3 == 0) goto Le
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r0.initCause(r3)
            Le:
                java.io.IOException r0 = (java.io.IOException) r0
                return r0
        }

        @Override // okio.AsyncTimeout
        protected void timedOut() {
                r2 = this;
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL
                r0.closeLater(r1)
                okhttp3.internal.http2.Http2Stream r0 = r2.this$0
                okhttp3.internal.http2.Http2Connection r0 = r0.getConnection()
                r0.sendDegradedPingLater$okhttp()
                return
        }
    }

    static {
            okhttp3.internal.http2.Http2Stream$Companion r0 = new okhttp3.internal.http2.Http2Stream$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.Http2Stream.Companion = r0
            return
    }

    public Http2Stream(int r4, okhttp3.internal.http2.Http2Connection r5, boolean r6, boolean r7, okhttp3.Headers r8) {
            r3 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r3.<init>()
            r3.id = r4
            r3.connection = r5
            okhttp3.internal.http2.Settings r4 = r5.getPeerSettings()
            int r4 = r4.getInitialWindowSize()
            long r0 = (long) r4
            r3.writeBytesMaximum = r0
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            r3.headersQueue = r4
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = new okhttp3.internal.http2.Http2Stream$FramingSource
            okhttp3.internal.http2.Settings r5 = r5.getOkHttpSettings()
            int r5 = r5.getInitialWindowSize()
            long r1 = (long) r5
            r0.<init>(r3, r1, r7)
            r3.source = r0
            okhttp3.internal.http2.Http2Stream$FramingSink r5 = new okhttp3.internal.http2.Http2Stream$FramingSink
            r5.<init>(r3, r6)
            r3.sink = r5
            okhttp3.internal.http2.Http2Stream$StreamTimeout r5 = new okhttp3.internal.http2.Http2Stream$StreamTimeout
            r5.<init>(r3)
            r3.readTimeout = r5
            okhttp3.internal.http2.Http2Stream$StreamTimeout r5 = new okhttp3.internal.http2.Http2Stream$StreamTimeout
            r5.<init>(r3)
            r3.writeTimeout = r5
            if (r8 == 0) goto L5d
            boolean r5 = r3.isLocallyInitiated()
            if (r5 != 0) goto L51
            java.util.Collection r4 = (java.util.Collection) r4
            r4.add(r8)
            goto L63
        L51:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "locally-initiated streams shouldn't have headers yet"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L5d:
            boolean r4 = r3.isLocallyInitiated()
            if (r4 == 0) goto L64
        L63:
            return
        L64:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "remotely-initiated streams should have headers"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private final boolean closeInternal(okhttp3.internal.http2.ErrorCode r3, java.io.IOException r4) {
            r2 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Thread "
            r4.<init>(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L32:
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L67
            r1 = 0
            if (r0 == 0) goto L3a
            monitor-exit(r2)
            return r1
        L3a:
            r2.errorCode = r3     // Catch: java.lang.Throwable -> L67
            r2.errorException = r4     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)     // Catch: java.lang.Throwable -> L67
            r3 = r2
            java.lang.Object r3 = (java.lang.Object) r3     // Catch: java.lang.Throwable -> L67
            r3.notifyAll()     // Catch: java.lang.Throwable -> L67
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.source     // Catch: java.lang.Throwable -> L67
            boolean r3 = r3.getFinished$okhttp()     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L5b
            okhttp3.internal.http2.Http2Stream$FramingSink r3 = r2.sink     // Catch: java.lang.Throwable -> L67
            boolean r3 = r3.getFinished()     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L5b
            monitor-exit(r2)
            return r1
        L5b:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L67
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.id
            r3.removeStream$okhttp(r4)
            r3 = 1
            return r3
        L67:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final void addBytesToWriteWindow(long r3) {
            r2 = this;
            long r0 = r2.writeBytesMaximum
            long r0 = r0 + r3
            r2.writeBytesMaximum = r0
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L16
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            r3 = r2
            java.lang.Object r3 = (java.lang.Object) r3
            r3.notifyAll()
        L16:
            return
    }

    public final void cancelStreamIfNecessary$okhttp() throws java.io.IOException {
            r3 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Thread "
            r1.<init>(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L32:
            monitor-enter(r3)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r3.source     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L55
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r3.source     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.getClosed$okhttp()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L55
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r3.sink     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.getFinished()     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L53
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r3.sink     // Catch: java.lang.Throwable -> L70
            boolean r0 = r0.getClosed()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L55
        L53:
            r0 = 1
            goto L56
        L55:
            r0 = 0
        L56:
            boolean r1 = r3.isOpen()     // Catch: java.lang.Throwable -> L70
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L70
            monitor-exit(r3)
            if (r0 == 0) goto L66
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL
            r1 = 0
            r3.close(r0, r1)
            goto L6f
        L66:
            if (r1 != 0) goto L6f
            okhttp3.internal.http2.Http2Connection r0 = r3.connection
            int r1 = r3.id
            r0.removeStream$okhttp(r1)
        L6f:
            return
        L70:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final void checkOutNotClosed$okhttp() throws java.io.IOException {
            r2 = this;
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            boolean r0 = r0.getClosed()
            if (r0 != 0) goto L2f
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            boolean r0 = r0.getFinished()
            if (r0 != 0) goto L27
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode
            if (r0 == 0) goto L26
            java.io.IOException r0 = r2.errorException
            if (r0 == 0) goto L19
            goto L23
        L19:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.<init>(r1)
        L23:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L26:
            return
        L27:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "stream finished"
            r0.<init>(r1)
            throw r0
        L2f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "stream closed"
            r0.<init>(r1)
            throw r0
    }

    public final void close(okhttp3.internal.http2.ErrorCode r2, java.io.IOException r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "rstStatusCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r3 = r1.closeInternal(r2, r3)
            if (r3 != 0) goto Lc
            return
        Lc:
            okhttp3.internal.http2.Http2Connection r3 = r1.connection
            int r0 = r1.id
            r3.writeSynReset$okhttp(r0, r2)
            return
    }

    public final void closeLater(okhttp3.internal.http2.ErrorCode r3) {
            r2 = this;
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            boolean r0 = r2.closeInternal(r3, r0)
            if (r0 != 0) goto Ld
            return
        Ld:
            okhttp3.internal.http2.Http2Connection r0 = r2.connection
            int r1 = r2.id
            r0.writeSynResetLater$okhttp(r1, r3)
            return
    }

    public final void enqueueTrailers(okhttp3.Headers r2) {
            r1 = this;
            java.lang.String r0 = "trailers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            monitor-enter(r1)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r1.sink     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.getFinished()     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L29
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L1d
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r1.sink     // Catch: java.lang.Throwable -> L35
            r0.setTrailers(r2)     // Catch: java.lang.Throwable -> L35
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L35
            monitor-exit(r1)
            return
        L1d:
            java.lang.String r2 = "trailers.size() == 0"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L35
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L35
            throw r0     // Catch: java.lang.Throwable -> L35
        L29:
            java.lang.String r2 = "already finished"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L35
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L35
            throw r0     // Catch: java.lang.Throwable -> L35
        L35:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final okhttp3.internal.http2.Http2Connection getConnection() {
            r1 = this;
            okhttp3.internal.http2.Http2Connection r0 = r1.connection
            return r0
    }

    public final synchronized okhttp3.internal.http2.ErrorCode getErrorCode$okhttp() {
            r1 = this;
            monitor-enter(r1)
            okhttp3.internal.http2.ErrorCode r0 = r1.errorCode     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final java.io.IOException getErrorException$okhttp() {
            r1 = this;
            java.io.IOException r0 = r1.errorException
            return r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.id
            return r0
    }

    public final long getReadBytesAcknowledged() {
            r2 = this;
            long r0 = r2.readBytesAcknowledged
            return r0
    }

    public final long getReadBytesTotal() {
            r2 = this;
            long r0 = r2.readBytesTotal
            return r0
    }

    public final okhttp3.internal.http2.Http2Stream.StreamTimeout getReadTimeout$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.readTimeout
            return r0
    }

    public final okio.Sink getSink() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L18
            boolean r0 = r2.isLocallyInitiated()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto Lc
            goto L18
        Lc:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L20
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L20
        L18:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            okio.Sink r0 = (okio.Sink) r0
            return r0
        L20:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final okhttp3.internal.http2.Http2Stream.FramingSink getSink$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r1.sink
            return r0
    }

    public final okio.Source getSource() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r1.source
            okio.Source r0 = (okio.Source) r0
            return r0
    }

    public final okhttp3.internal.http2.Http2Stream.FramingSource getSource$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r1.source
            return r0
    }

    public final long getWriteBytesMaximum() {
            r2 = this;
            long r0 = r2.writeBytesMaximum
            return r0
    }

    public final long getWriteBytesTotal() {
            r2 = this;
            long r0 = r2.writeBytesTotal
            return r0
    }

    public final okhttp3.internal.http2.Http2Stream.StreamTimeout getWriteTimeout$okhttp() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.writeTimeout
            return r0
    }

    public final boolean isLocallyInitiated() {
            r4 = this;
            int r0 = r4.id
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 != r1) goto L9
            r0 = r1
            goto La
        L9:
            r0 = r2
        La:
            okhttp3.internal.http2.Http2Connection r3 = r4.connection
            boolean r3 = r3.getClient$okhttp()
            if (r3 != r0) goto L13
            goto L14
        L13:
            r1 = r2
        L14:
            return r1
    }

    public final synchronized boolean isOpen() {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L31
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r2)
            return r1
        L8:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L18
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.getClosed$okhttp()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2e
        L18:
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.getFinished()     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L28
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink     // Catch: java.lang.Throwable -> L31
            boolean r0 = r0.getClosed()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2e
        L28:
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2e
            monitor-exit(r2)
            return r1
        L2e:
            monitor-exit(r2)
            r0 = 1
            return r0
        L31:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            throw r0
    }

    public final okio.Timeout readTimeout() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.readTimeout
            okio.Timeout r0 = (okio.Timeout) r0
            return r0
    }

    public final void receiveData(okio.BufferedSource r4, int r5) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Thread "
            r5.<init>(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L37:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r3.source
            long r1 = (long) r5
            r0.receive$okhttp(r4, r1)
            return
    }

    public final void receiveHeaders(okhttp3.Headers r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Thread "
            r4.<init>(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L37:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L72
            r1 = 1
            if (r0 == 0) goto L46
            if (r4 != 0) goto L40
            goto L46
        L40:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L72
            r0.setTrailers(r3)     // Catch: java.lang.Throwable -> L72
            goto L4f
        L46:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L72
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L72
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L72
            r0.add(r3)     // Catch: java.lang.Throwable -> L72
        L4f:
            if (r4 == 0) goto L56
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.source     // Catch: java.lang.Throwable -> L72
            r3.setFinished$okhttp(r1)     // Catch: java.lang.Throwable -> L72
        L56:
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L72
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)     // Catch: java.lang.Throwable -> L72
            r4 = r2
            java.lang.Object r4 = (java.lang.Object) r4     // Catch: java.lang.Throwable -> L72
            r4.notifyAll()     // Catch: java.lang.Throwable -> L72
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L72
            monitor-exit(r2)
            if (r3 != 0) goto L71
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.id
            r3.removeStream$okhttp(r4)
        L71:
            return
        L72:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final synchronized void receiveRstStream(okhttp3.internal.http2.ErrorCode r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L19
            okhttp3.internal.http2.ErrorCode r0 = r1.errorCode     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L17
            r1.errorCode = r2     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L19
            r2 = r1
            java.lang.Object r2 = (java.lang.Object) r2     // Catch: java.lang.Throwable -> L19
            r2.notifyAll()     // Catch: java.lang.Throwable -> L19
        L17:
            monitor-exit(r1)
            return
        L19:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r2
    }

    public final void setErrorCode$okhttp(okhttp3.internal.http2.ErrorCode r1) {
            r0 = this;
            r0.errorCode = r1
            return
    }

    public final void setErrorException$okhttp(java.io.IOException r1) {
            r0 = this;
            r0.errorException = r1
            return
    }

    public final void setReadBytesAcknowledged$okhttp(long r1) {
            r0 = this;
            r0.readBytesAcknowledged = r1
            return
    }

    public final void setReadBytesTotal$okhttp(long r1) {
            r0 = this;
            r0.readBytesTotal = r1
            return
    }

    public final void setWriteBytesMaximum$okhttp(long r1) {
            r0 = this;
            r0.writeBytesMaximum = r1
            return
    }

    public final void setWriteBytesTotal$okhttp(long r1) {
            r0 = this;
            r0.writeBytesTotal = r1
            return
    }

    public final synchronized okhttp3.Headers takeHeaders() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L4e
            r0.enter()     // Catch: java.lang.Throwable -> L4e
        L6:
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L16
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L16
            r2.waitForIo$okhttp()     // Catch: java.lang.Throwable -> L47
            goto L6
        L16:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r2.readTimeout     // Catch: java.lang.Throwable -> L4e
            r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L4e
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L4e
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L4e
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L34
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r0 = r0.removeFirst()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = "headersQueue.removeFirst()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L4e
            okhttp3.Headers r0 = (okhttp3.Headers) r0     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r2)
            return r0
        L34:
            java.io.IOException r0 = r2.errorException     // Catch: java.lang.Throwable -> L4e
            if (r0 == 0) goto L3b
        L38:
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L4e
            goto L46
        L3b:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L4e
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode     // Catch: java.lang.Throwable -> L4e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L4e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4e
            goto L38
        L46:
            throw r0     // Catch: java.lang.Throwable -> L4e
        L47:
            r0 = move-exception
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r2.readTimeout     // Catch: java.lang.Throwable -> L4e
            r1.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e
            throw r0
    }

    public final synchronized okhttp3.Headers trailers() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.getFinished$okhttp()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L2d
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4c
            okio.Buffer r0 = r0.getReceiveBuffer()     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.exhausted()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L2d
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4c
            okio.Buffer r0 = r0.getReadBuffer()     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.exhausted()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L2d
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L4c
            okhttp3.Headers r0 = r0.getTrailers()     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L2b
            okhttp3.Headers r0 = okhttp3.internal.Util.EMPTY_HEADERS     // Catch: java.lang.Throwable -> L4c
        L2b:
            monitor-exit(r2)
            return r0
        L2d:
            okhttp3.internal.http2.ErrorCode r0 = r2.errorCode     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L44
            java.io.IOException r0 = r2.errorException     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L38
        L35:
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L4c
            goto L43
        L38:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L4c
            okhttp3.internal.http2.ErrorCode r1 = r2.errorCode     // Catch: java.lang.Throwable -> L4c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L4c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            goto L35
        L43:
            throw r0     // Catch: java.lang.Throwable -> L4c
        L44:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = "too early; can't read the trailers yet"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            throw r0     // Catch: java.lang.Throwable -> L4c
        L4c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            throw r0
    }

    public final void waitForIo$okhttp() throws java.io.InterruptedIOException {
            r1 = this;
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)     // Catch: java.lang.InterruptedException -> Lc
            r0 = r1
            java.lang.Object r0 = (java.lang.Object) r0     // Catch: java.lang.InterruptedException -> Lc
            r0.wait()     // Catch: java.lang.InterruptedException -> Lc
            return
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
    }

    public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r6, boolean r7, boolean r8) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "responseHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r5)
            if (r0 != 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r6 = new java.lang.AssertionError
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Thread "
            r7.<init>(r8)
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = " MUST NOT hold lock on "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r5)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L37:
            monitor-enter(r5)
            r0 = 1
            r5.hasResponseHeaders = r0     // Catch: java.lang.Throwable -> L73
            if (r7 == 0) goto L42
            okhttp3.internal.http2.Http2Stream$FramingSink r1 = r5.sink     // Catch: java.lang.Throwable -> L73
            r1.setFinished(r0)     // Catch: java.lang.Throwable -> L73
        L42:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L73
            monitor-exit(r5)
            if (r8 != 0) goto L64
            okhttp3.internal.http2.Http2Connection r8 = r5.connection
            monitor-enter(r8)
            okhttp3.internal.http2.Http2Connection r1 = r5.connection     // Catch: java.lang.Throwable -> L61
            long r1 = r1.getWriteBytesTotal()     // Catch: java.lang.Throwable -> L61
            okhttp3.internal.http2.Http2Connection r3 = r5.connection     // Catch: java.lang.Throwable -> L61
            long r3 = r3.getWriteBytesMaximum()     // Catch: java.lang.Throwable -> L61
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L5b
            goto L5c
        L5b:
            r0 = 0
        L5c:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L61
            monitor-exit(r8)
            r8 = r0
            goto L64
        L61:
            r6 = move-exception
            monitor-exit(r8)
            throw r6
        L64:
            okhttp3.internal.http2.Http2Connection r0 = r5.connection
            int r1 = r5.id
            r0.writeHeaders$okhttp(r1, r7, r6)
            if (r8 == 0) goto L72
            okhttp3.internal.http2.Http2Connection r6 = r5.connection
            r6.flush()
        L72:
            return
        L73:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public final okio.Timeout writeTimeout() {
            r1 = this;
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r1.writeTimeout
            okio.Timeout r0 = (okio.Timeout) r0
            return r0
    }
}
