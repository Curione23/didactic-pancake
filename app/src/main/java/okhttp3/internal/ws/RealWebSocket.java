package okhttp3.internal.ws;

/* JADX INFO: compiled from: RealWebSocket.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0005_`abcB?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0002\u0010\u0010J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\f2\u0006\u00105\u001a\u000206J\b\u00107\u001a\u000203H\u0016J\u001f\u00108\u001a\u0002032\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0000¢\u0006\u0002\b=J\u001a\u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020%2\b\u0010@\u001a\u0004\u0018\u00010\u0018H\u0016J \u0010>\u001a\u00020\u00122\u0006\u0010?\u001a\u00020%2\b\u0010@\u001a\u0004\u0018\u00010\u00182\u0006\u0010A\u001a\u00020\fJ\u000e\u0010B\u001a\u0002032\u0006\u0010C\u001a\u00020DJ\u001c\u0010E\u001a\u0002032\n\u0010F\u001a\u00060Gj\u0002`H2\b\u00109\u001a\u0004\u0018\u00010:J\u0016\u0010I\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010*\u001a\u00020+J\u0006\u0010J\u001a\u000203J\u0018\u0010K\u001a\u0002032\u0006\u0010?\u001a\u00020%2\u0006\u0010@\u001a\u00020\u0018H\u0016J\u0010\u0010L\u001a\u0002032\u0006\u0010M\u001a\u00020\u0018H\u0016J\u0010\u0010L\u001a\u0002032\u0006\u0010N\u001a\u00020 H\u0016J\u0010\u0010O\u001a\u0002032\u0006\u0010P\u001a\u00020 H\u0016J\u0010\u0010Q\u001a\u0002032\u0006\u0010P\u001a\u00020 H\u0016J\u000e\u0010R\u001a\u00020\u00122\u0006\u0010P\u001a\u00020 J\u0006\u0010S\u001a\u00020\u0012J\b\u0010!\u001a\u00020\fH\u0016J\u0006\u0010'\u001a\u00020%J\u0006\u0010(\u001a\u00020%J\b\u0010T\u001a\u00020\u0006H\u0016J\b\u0010U\u001a\u000203H\u0002J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u0018H\u0016J\u0010\u0010V\u001a\u00020\u00122\u0006\u0010N\u001a\u00020 H\u0016J\u0018\u0010V\u001a\u00020\u00122\u0006\u0010W\u001a\u00020 2\u0006\u0010X\u001a\u00020%H\u0002J\u0006\u0010)\u001a\u00020%J\u0006\u0010Y\u001a\u000203J\r\u0010Z\u001a\u00020\u0012H\u0000¢\u0006\u0002\b[J\r\u0010\\\u001a\u000203H\u0000¢\u0006\u0002\b]J\f\u0010^\u001a\u00020\u0012*\u00020\u000eH\u0002R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006d"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "originalRequest", "Lokhttp3/Request;", "listener", "Lokhttp3/WebSocketListener;", "random", "Ljava/util/Random;", "pingIntervalMillis", "", "extensions", "Lokhttp3/internal/ws/WebSocketExtensions;", "minimumDeflateSize", "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;JLokhttp3/internal/ws/WebSocketExtensions;J)V", "awaitingPong", "", "call", "Lokhttp3/Call;", "enqueuedClose", "failed", "key", "", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "messageAndCloseQueue", "Ljava/util/ArrayDeque;", "", "name", "pongQueue", "Lokio/ByteString;", "queueSize", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "receivedCloseCode", "", "receivedCloseReason", "receivedPingCount", "receivedPongCount", "sentPingCount", "streams", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "taskQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "writerTask", "Lokhttp3/internal/concurrent/Task;", "awaitTermination", "", "timeout", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "cancel", "checkUpgradeSuccess", "response", "Lokhttp3/Response;", "exchange", "Lokhttp3/internal/connection/Exchange;", "checkUpgradeSuccess$okhttp", "close", "code", "reason", "cancelAfterCloseMillis", "connect", "client", "Lokhttp3/OkHttpClient;", "failWebSocket", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "initReaderAndWriter", "loopReader", "onReadClose", "onReadMessage", "text", "bytes", "onReadPing", "payload", "onReadPong", "pong", "processNextFrame", "request", "runWriter", "send", "data", "formatOpcode", "tearDown", "writeOneFrame", "writeOneFrame$okhttp", "writePingFrame", "writePingFrame$okhttp", "isValid", "Close", "Companion", "Message", "Streams", "WriterTask", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealWebSocket implements okhttp3.WebSocket, okhttp3.internal.ws.WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final okhttp3.internal.ws.RealWebSocket.Companion Companion = null;
    public static final long DEFAULT_MINIMUM_DEFLATE_SIZE = 1024;
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final java.util.List<okhttp3.Protocol> ONLY_HTTP1 = null;
    private boolean awaitingPong;
    private okhttp3.Call call;
    private boolean enqueuedClose;
    private okhttp3.internal.ws.WebSocketExtensions extensions;
    private boolean failed;
    private final java.lang.String key;
    private final okhttp3.WebSocketListener listener;
    private final java.util.ArrayDeque<java.lang.Object> messageAndCloseQueue;
    private long minimumDeflateSize;
    private java.lang.String name;
    private final okhttp3.Request originalRequest;
    private final long pingIntervalMillis;
    private final java.util.ArrayDeque<okio.ByteString> pongQueue;
    private long queueSize;
    private final java.util.Random random;
    private okhttp3.internal.ws.WebSocketReader reader;
    private int receivedCloseCode;
    private java.lang.String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private okhttp3.internal.ws.RealWebSocket.Streams streams;
    private okhttp3.internal.concurrent.TaskQueue taskQueue;
    private okhttp3.internal.ws.WebSocketWriter writer;
    private okhttp3.internal.concurrent.Task writerTask;

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "code", "", "reason", "Lokio/ByteString;", "cancelAfterCloseMillis", "", "(ILokio/ByteString;J)V", "getCancelAfterCloseMillis", "()J", "getCode", "()I", "getReason", "()Lokio/ByteString;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final okio.ByteString reason;

        public Close(int r1, okio.ByteString r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.code = r1
                r0.reason = r2
                r0.cancelAfterCloseMillis = r3
                return
        }

        public final long getCancelAfterCloseMillis() {
                r2 = this;
                long r0 = r2.cancelAfterCloseMillis
                return r0
        }

        public final int getCode() {
                r1 = this;
                int r0 = r1.code
                return r0
        }

        public final okio.ByteString getReason() {
                r1 = this;
                okio.ByteString r0 = r1.reason
                return r0
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "()V", "CANCEL_AFTER_CLOSE_MILLIS", "", "DEFAULT_MINIMUM_DEFLATE_SIZE", "MAX_QUEUE_SIZE", "ONLY_HTTP1", "", "Lokhttp3/Protocol;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "formatOpcode", "", "data", "Lokio/ByteString;", "(ILokio/ByteString;)V", "getData", "()Lokio/ByteString;", "getFormatOpcode", "()I", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Message {
        private final okio.ByteString data;
        private final int formatOpcode;

        public Message(int r2, okio.ByteString r3) {
                r1 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>()
                r1.formatOpcode = r2
                r1.data = r3
                return
        }

        public final okio.ByteString getData() {
                r1 = this;
                okio.ByteString r0 = r1.data
                return r0
        }

        public final int getFormatOpcode() {
                r1 = this;
                int r0 = r1.formatOpcode
                return r0
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "client", "", "source", "Lokio/BufferedSource;", "sink", "Lokio/BufferedSink;", "(ZLokio/BufferedSource;Lokio/BufferedSink;)V", "getClient", "()Z", "getSink", "()Lokio/BufferedSink;", "getSource", "()Lokio/BufferedSource;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Streams implements java.io.Closeable {
        private final boolean client;
        private final okio.BufferedSink sink;
        private final okio.BufferedSource source;

        public Streams(boolean r2, okio.BufferedSource r3, okio.BufferedSink r4) {
                r1 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r1.<init>()
                r1.client = r2
                r1.source = r3
                r1.sink = r4
                return
        }

        public final boolean getClient() {
                r1 = this;
                boolean r0 = r1.client
                return r0
        }

        public final okio.BufferedSink getSink() {
                r1 = this;
                okio.BufferedSink r0 = r1.sink
                return r0
        }

        public final okio.BufferedSource getSource() {
                r1 = this;
                okio.BufferedSource r0 = r1.source
                return r0
        }
    }

    /* JADX INFO: compiled from: RealWebSocket.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "(Lokhttp3/internal/ws/RealWebSocket;)V", "runOnce", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class WriterTask extends okhttp3.internal.concurrent.Task {
        final /* synthetic */ okhttp3.internal.ws.RealWebSocket this$0;

        public WriterTask(okhttp3.internal.ws.RealWebSocket r4) {
                r3 = this;
                r3.this$0 = r4
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = okhttp3.internal.ws.RealWebSocket.access$getName$p(r4)
                java.lang.StringBuilder r4 = r0.append(r4)
                java.lang.String r0 = " writer"
                java.lang.StringBuilder r4 = r4.append(r0)
                java.lang.String r4 = r4.toString()
                r0 = 2
                r1 = 0
                r2 = 0
                r3.<init>(r4, r2, r0, r1)
                return
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
                r3 = this;
                okhttp3.internal.ws.RealWebSocket r0 = r3.this$0     // Catch: java.io.IOException -> Lb
                boolean r0 = r0.writeOneFrame$okhttp()     // Catch: java.io.IOException -> Lb
                if (r0 == 0) goto L14
                r0 = 0
                return r0
            Lb:
                r0 = move-exception
                okhttp3.internal.ws.RealWebSocket r1 = r3.this$0
                java.lang.Exception r0 = (java.lang.Exception) r0
                r2 = 0
                r1.failWebSocket(r0, r2)
            L14:
                r0 = -1
                return r0
        }
    }


    static {
            okhttp3.internal.ws.RealWebSocket$Companion r0 = new okhttp3.internal.ws.RealWebSocket$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.ws.RealWebSocket.Companion = r0
            okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            okhttp3.internal.ws.RealWebSocket.ONLY_HTTP1 = r0
            return
    }

    public RealWebSocket(okhttp3.internal.concurrent.TaskRunner r2, okhttp3.Request r3, okhttp3.WebSocketListener r4, java.util.Random r5, long r6, okhttp3.internal.ws.WebSocketExtensions r8, long r9) {
            r1 = this;
            java.lang.String r0 = "taskRunner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "originalRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.originalRequest = r3
            r1.listener = r4
            r1.random = r5
            r1.pingIntervalMillis = r6
            r1.extensions = r8
            r1.minimumDeflateSize = r9
            okhttp3.internal.concurrent.TaskQueue r2 = r2.newQueue()
            r1.taskQueue = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.pongQueue = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.messageAndCloseQueue = r2
            r2 = -1
            r1.receivedCloseCode = r2
            java.lang.String r2 = "GET"
            java.lang.String r4 = r3.method()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r2 == 0) goto L60
            okio.ByteString$Companion r3 = okio.ByteString.Companion
            r2 = 16
            byte[] r4 = new byte[r2]
            r5.nextBytes(r4)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            r7 = 3
            r8 = 0
            r5 = 0
            r6 = 0
            okio.ByteString r2 = okio.ByteString.Companion.of$default(r3, r4, r5, r6, r7, r8)
            java.lang.String r2 = r2.base64()
            r1.key = r2
            return
        L60:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Request must be GET: "
            r2.<init>(r4)
            java.lang.String r3 = r3.method()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static final /* synthetic */ java.util.ArrayDeque access$getMessageAndCloseQueue$p(okhttp3.internal.ws.RealWebSocket r0) {
            java.util.ArrayDeque<java.lang.Object> r0 = r0.messageAndCloseQueue
            return r0
    }

    public static final /* synthetic */ java.lang.String access$getName$p(okhttp3.internal.ws.RealWebSocket r0) {
            java.lang.String r0 = r0.name
            return r0
    }

    public static final /* synthetic */ boolean access$isValid(okhttp3.internal.ws.RealWebSocket r0, okhttp3.internal.ws.WebSocketExtensions r1) {
            boolean r0 = r0.isValid(r1)
            return r0
    }

    public static final /* synthetic */ void access$setExtensions$p(okhttp3.internal.ws.RealWebSocket r0, okhttp3.internal.ws.WebSocketExtensions r1) {
            r0.extensions = r1
            return
    }

    private final boolean isValid(okhttp3.internal.ws.WebSocketExtensions r5) {
            r4 = this;
            boolean r0 = r5.unknownValues
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Integer r0 = r5.clientMaxWindowBits
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.lang.Integer r0 = r5.serverMaxWindowBits
            if (r0 == 0) goto L25
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r2 = 8
            r3 = 15
            r0.<init>(r2, r3)
            java.lang.Integer r5 = r5.serverMaxWindowBits
            int r5 = r5.intValue()
            boolean r5 = r0.contains(r5)
            if (r5 != 0) goto L25
            return r1
        L25:
            r5 = 1
            return r5
    }

    private final void runWriter() {
            r8 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r8)
            if (r0 == 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Thread "
            r1.<init>(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L32:
            okhttp3.internal.concurrent.Task r3 = r8.writerTask
            if (r3 == 0) goto L3f
            okhttp3.internal.concurrent.TaskQueue r2 = r8.taskQueue
            r6 = 2
            r7 = 0
            r4 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r2, r3, r4, r6, r7)
        L3f:
            return
    }

    private final synchronized boolean send(okio.ByteString r7, int r8) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.failed     // Catch: java.lang.Throwable -> L3e
            r1 = 0
            if (r0 != 0) goto L3c
            boolean r0 = r6.enqueuedClose     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto Lb
            goto L3c
        Lb:
            long r2 = r6.queueSize     // Catch: java.lang.Throwable -> L3e
            int r0 = r7.size()     // Catch: java.lang.Throwable -> L3e
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L3e
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L22
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r6)
            return r1
        L22:
            long r0 = r6.queueSize     // Catch: java.lang.Throwable -> L3e
            int r2 = r7.size()     // Catch: java.lang.Throwable -> L3e
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3e
            long r0 = r0 + r2
            r6.queueSize = r0     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch: java.lang.Throwable -> L3e
            okhttp3.internal.ws.RealWebSocket$Message r1 = new okhttp3.internal.ws.RealWebSocket$Message     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r8, r7)     // Catch: java.lang.Throwable -> L3e
            r0.add(r1)     // Catch: java.lang.Throwable -> L3e
            r6.runWriter()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r6)
            r7 = 1
            return r7
        L3c:
            monitor-exit(r6)
            return r1
        L3e:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3e
            throw r7
    }

    public final void awaitTermination(long r2, java.util.concurrent.TimeUnit r4) throws java.lang.InterruptedException {
            r1 = this;
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.internal.concurrent.TaskQueue r0 = r1.taskQueue
            java.util.concurrent.CountDownLatch r0 = r0.idleLatch()
            r0.await(r2, r4)
            return
    }

    @Override // okhttp3.WebSocket
    public void cancel() {
            r1 = this;
            okhttp3.Call r0 = r1.call
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0.cancel()
            return
    }

    public final void checkUpgradeSuccess$okhttp(okhttp3.Response r8, okhttp3.internal.connection.Exchange r9) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r8.code()
            r1 = 101(0x65, float:1.42E-43)
            r2 = 39
            if (r0 != r1) goto Lbb
            java.lang.String r0 = "Connection"
            r1 = 0
            r3 = 2
            java.lang.String r0 = okhttp3.Response.header$default(r8, r0, r1, r3, r1)
            java.lang.String r4 = "Upgrade"
            r5 = 1
            boolean r6 = kotlin.text.StringsKt.equals(r4, r0, r5)
            if (r6 == 0) goto La2
            java.lang.String r0 = okhttp3.Response.header$default(r8, r4, r1, r3, r1)
            java.lang.String r4 = "websocket"
            boolean r4 = kotlin.text.StringsKt.equals(r4, r0, r5)
            if (r4 == 0) goto L89
            java.lang.String r0 = "Sec-WebSocket-Accept"
            java.lang.String r8 = okhttp3.Response.header$default(r8, r0, r1, r3, r1)
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r7.key
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okio.ByteString r0 = r0.sha1()
            java.lang.String r0 = r0.base64()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)
            if (r1 == 0) goto L66
            if (r9 == 0) goto L5e
            return
        L5e:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.String r9 = "Web Socket exchange missing: bad interceptor?"
            r8.<init>(r9)
            throw r8
        L66:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected 'Sec-WebSocket-Accept' header value '"
            r1.<init>(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "' but was '"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L89:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected 'Upgrade' header value 'websocket' but was '"
            r9.<init>(r1)
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        La2:
            java.net.ProtocolException r8 = new java.net.ProtocolException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected 'Connection' header value 'Upgrade' but was '"
            r9.<init>(r1)
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lbb:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected HTTP 101 response but was '"
            r0.<init>(r1)
            int r1 = r8.code()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r8 = r8.message()
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
    }

    @Override // okhttp3.WebSocket
    public boolean close(int r3, java.lang.String r4) {
            r2 = this;
            r0 = 60000(0xea60, double:2.9644E-319)
            boolean r3 = r2.close(r3, r4, r0)
            return r3
    }

    public final synchronized boolean close(int r7, java.lang.String r8, long r9) {
            r6 = this;
            java.lang.String r0 = "reason.size() > 123: "
            monitor-enter(r6)
            okhttp3.internal.ws.WebSocketProtocol r1 = okhttp3.internal.ws.WebSocketProtocol.INSTANCE     // Catch: java.lang.Throwable -> L52
            r1.validateCloseCode(r7)     // Catch: java.lang.Throwable -> L52
            if (r8 == 0) goto L33
            okio.ByteString$Companion r1 = okio.ByteString.Companion     // Catch: java.lang.Throwable -> L52
            okio.ByteString r1 = r1.encodeUtf8(r8)     // Catch: java.lang.Throwable -> L52
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L52
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L52
            r4 = 123(0x7b, double:6.1E-322)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L1c
            goto L34
        L1c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L52
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L52
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L52
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L52
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L52
            throw r8     // Catch: java.lang.Throwable -> L52
        L33:
            r1 = 0
        L34:
            boolean r8 = r6.failed     // Catch: java.lang.Throwable -> L52
            if (r8 != 0) goto L4f
            boolean r8 = r6.enqueuedClose     // Catch: java.lang.Throwable -> L52
            if (r8 == 0) goto L3d
            goto L4f
        L3d:
            r8 = 1
            r6.enqueuedClose = r8     // Catch: java.lang.Throwable -> L52
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch: java.lang.Throwable -> L52
            okhttp3.internal.ws.RealWebSocket$Close r2 = new okhttp3.internal.ws.RealWebSocket$Close     // Catch: java.lang.Throwable -> L52
            r2.<init>(r7, r1, r9)     // Catch: java.lang.Throwable -> L52
            r0.add(r2)     // Catch: java.lang.Throwable -> L52
            r6.runWriter()     // Catch: java.lang.Throwable -> L52
            monitor-exit(r6)
            return r8
        L4f:
            monitor-exit(r6)
            r7 = 0
            return r7
        L52:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L52
            throw r7
    }

    public final void connect(okhttp3.OkHttpClient r5) {
            r4 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okhttp3.Request r0 = r4.originalRequest
            java.lang.String r1 = "Sec-WebSocket-Extensions"
            java.lang.String r0 = r0.header(r1)
            if (r0 == 0) goto L1d
            java.net.ProtocolException r5 = new java.net.ProtocolException
            java.lang.String r0 = "Request header not permitted: 'Sec-WebSocket-Extensions'"
            r5.<init>(r0)
            java.lang.Exception r5 = (java.lang.Exception) r5
            r0 = 0
            r4.failWebSocket(r5, r0)
            return
        L1d:
            okhttp3.OkHttpClient$Builder r5 = r5.newBuilder()
            okhttp3.EventListener r0 = okhttp3.EventListener.NONE
            okhttp3.OkHttpClient$Builder r5 = r5.eventListener(r0)
            java.util.List<okhttp3.Protocol> r0 = okhttp3.internal.ws.RealWebSocket.ONLY_HTTP1
            okhttp3.OkHttpClient$Builder r5 = r5.protocols(r0)
            okhttp3.OkHttpClient r5 = r5.build()
            okhttp3.Request r0 = r4.originalRequest
            okhttp3.Request$Builder r0 = r0.newBuilder()
            java.lang.String r2 = "websocket"
            java.lang.String r3 = "Upgrade"
            okhttp3.Request$Builder r0 = r0.header(r3, r2)
            java.lang.String r2 = "Connection"
            okhttp3.Request$Builder r0 = r0.header(r2, r3)
            java.lang.String r2 = "Sec-WebSocket-Key"
            java.lang.String r3 = r4.key
            okhttp3.Request$Builder r0 = r0.header(r2, r3)
            java.lang.String r2 = "Sec-WebSocket-Version"
            java.lang.String r3 = "13"
            okhttp3.Request$Builder r0 = r0.header(r2, r3)
            java.lang.String r2 = "permessage-deflate"
            okhttp3.Request$Builder r0 = r0.header(r1, r2)
            okhttp3.Request r0 = r0.build()
            okhttp3.internal.connection.RealCall r1 = new okhttp3.internal.connection.RealCall
            r2 = 1
            r1.<init>(r5, r0, r2)
            okhttp3.Call r1 = (okhttp3.Call) r1
            r4.call = r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okhttp3.internal.ws.RealWebSocket$connect$1 r5 = new okhttp3.internal.ws.RealWebSocket$connect$1
            r5.<init>(r4, r0)
            okhttp3.Callback r5 = (okhttp3.Callback) r5
            r1.enqueue(r5)
            return
    }

    public final void failWebSocket(java.lang.Exception r6, okhttp3.Response r7) {
            r5 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            monitor-enter(r5)
            boolean r0 = r5.failed     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto Lc
            monitor-exit(r5)
            return
        Lc:
            r0 = 1
            r5.failed = r0     // Catch: java.lang.Throwable -> L64
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r5.streams     // Catch: java.lang.Throwable -> L64
            r1 = 0
            r5.streams = r1     // Catch: java.lang.Throwable -> L64
            okhttp3.internal.ws.WebSocketReader r2 = r5.reader     // Catch: java.lang.Throwable -> L64
            r5.reader = r1     // Catch: java.lang.Throwable -> L64
            okhttp3.internal.ws.WebSocketWriter r3 = r5.writer     // Catch: java.lang.Throwable -> L64
            r5.writer = r1     // Catch: java.lang.Throwable -> L64
            okhttp3.internal.concurrent.TaskQueue r1 = r5.taskQueue     // Catch: java.lang.Throwable -> L64
            r1.shutdown()     // Catch: java.lang.Throwable -> L64
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L64
            monitor-exit(r5)
            okhttp3.WebSocketListener r1 = r5.listener     // Catch: java.lang.Throwable -> L44
            r4 = r5
            okhttp3.WebSocket r4 = (okhttp3.WebSocket) r4     // Catch: java.lang.Throwable -> L44
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> L44
            r1.onFailure(r4, r6, r7)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L35
            java.io.Closeable r0 = (java.io.Closeable) r0
            okhttp3.internal.Util.closeQuietly(r0)
        L35:
            if (r2 == 0) goto L3c
            java.io.Closeable r2 = (java.io.Closeable) r2
            okhttp3.internal.Util.closeQuietly(r2)
        L3c:
            if (r3 == 0) goto L43
            java.io.Closeable r3 = (java.io.Closeable) r3
            okhttp3.internal.Util.closeQuietly(r3)
        L43:
            return
        L44:
            r6 = move-exception
            r7 = r0
            okhttp3.internal.ws.RealWebSocket$Streams r7 = (okhttp3.internal.ws.RealWebSocket.Streams) r7
            if (r0 == 0) goto L4f
            java.io.Closeable r0 = (java.io.Closeable) r0
            okhttp3.internal.Util.closeQuietly(r0)
        L4f:
            r7 = r2
            okhttp3.internal.ws.WebSocketReader r7 = (okhttp3.internal.ws.WebSocketReader) r7
            if (r2 == 0) goto L59
            java.io.Closeable r2 = (java.io.Closeable) r2
            okhttp3.internal.Util.closeQuietly(r2)
        L59:
            r7 = r3
            okhttp3.internal.ws.WebSocketWriter r7 = (okhttp3.internal.ws.WebSocketWriter) r7
            if (r3 == 0) goto L63
            java.io.Closeable r3 = (java.io.Closeable) r3
            okhttp3.internal.Util.closeQuietly(r3)
        L63:
            throw r6
        L64:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    public final okhttp3.WebSocketListener getListener$okhttp() {
            r1 = this;
            okhttp3.WebSocketListener r0 = r1.listener
            return r0
    }

    public final void initReaderAndWriter(java.lang.String r11, okhttp3.internal.ws.RealWebSocket.Streams r12) throws java.io.IOException {
            r10 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "streams"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            okhttp3.internal.ws.WebSocketExtensions r0 = r10.extensions
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            monitor-enter(r10)
            r10.name = r11     // Catch: java.lang.Throwable -> L9a
            r10.streams = r12     // Catch: java.lang.Throwable -> L9a
            okhttp3.internal.ws.WebSocketWriter r9 = new okhttp3.internal.ws.WebSocketWriter     // Catch: java.lang.Throwable -> L9a
            boolean r2 = r12.getClient()     // Catch: java.lang.Throwable -> L9a
            okio.BufferedSink r3 = r12.getSink()     // Catch: java.lang.Throwable -> L9a
            java.util.Random r4 = r10.random     // Catch: java.lang.Throwable -> L9a
            boolean r5 = r0.perMessageDeflate     // Catch: java.lang.Throwable -> L9a
            boolean r1 = r12.getClient()     // Catch: java.lang.Throwable -> L9a
            boolean r6 = r0.noContextTakeover(r1)     // Catch: java.lang.Throwable -> L9a
            long r7 = r10.minimumDeflateSize     // Catch: java.lang.Throwable -> L9a
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9a
            r10.writer = r9     // Catch: java.lang.Throwable -> L9a
            okhttp3.internal.ws.RealWebSocket$WriterTask r1 = new okhttp3.internal.ws.RealWebSocket$WriterTask     // Catch: java.lang.Throwable -> L9a
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L9a
            okhttp3.internal.concurrent.Task r1 = (okhttp3.internal.concurrent.Task) r1     // Catch: java.lang.Throwable -> L9a
            r10.writerTask = r1     // Catch: java.lang.Throwable -> L9a
            long r1 = r10.pingIntervalMillis     // Catch: java.lang.Throwable -> L9a
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L6a
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L9a
            long r2 = r10.pingIntervalMillis     // Catch: java.lang.Throwable -> L9a
            long r1 = r1.toNanos(r2)     // Catch: java.lang.Throwable -> L9a
            okhttp3.internal.concurrent.TaskQueue r3 = r10.taskQueue     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r4.<init>()     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r11 = r4.append(r11)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = " ping"
            java.lang.StringBuilder r11 = r11.append(r4)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L9a
            okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1 r4 = new okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1     // Catch: java.lang.Throwable -> L9a
            r4.<init>(r11, r10, r1)     // Catch: java.lang.Throwable -> L9a
            okhttp3.internal.concurrent.Task r4 = (okhttp3.internal.concurrent.Task) r4     // Catch: java.lang.Throwable -> L9a
            r3.schedule(r4, r1)     // Catch: java.lang.Throwable -> L9a
        L6a:
            java.util.ArrayDeque<java.lang.Object> r11 = r10.messageAndCloseQueue     // Catch: java.lang.Throwable -> L9a
            java.util.Collection r11 = (java.util.Collection) r11     // Catch: java.lang.Throwable -> L9a
            boolean r11 = r11.isEmpty()     // Catch: java.lang.Throwable -> L9a
            if (r11 != 0) goto L77
            r10.runWriter()     // Catch: java.lang.Throwable -> L9a
        L77:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r10)
            okhttp3.internal.ws.WebSocketReader r11 = new okhttp3.internal.ws.WebSocketReader
            boolean r2 = r12.getClient()
            okio.BufferedSource r3 = r12.getSource()
            r4 = r10
            okhttp3.internal.ws.WebSocketReader$FrameCallback r4 = (okhttp3.internal.ws.WebSocketReader.FrameCallback) r4
            boolean r5 = r0.perMessageDeflate
            boolean r12 = r12.getClient()
            r12 = r12 ^ 1
            boolean r6 = r0.noContextTakeover(r12)
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r10.reader = r11
            return
        L9a:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
    }

    public final void loopReader() throws java.io.IOException {
            r2 = this;
        L0:
            int r0 = r2.receivedCloseCode
            r1 = -1
            if (r0 != r1) goto Le
            okhttp3.internal.ws.WebSocketReader r0 = r2.reader
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0.processNextFrame()
            goto L0
        Le:
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadClose(int r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = -1
            if (r6 == r0) goto L8d
            monitor-enter(r5)
            int r1 = r5.receivedCloseCode     // Catch: java.lang.Throwable -> L8a
            if (r1 != r0) goto L7e
            r5.receivedCloseCode = r6     // Catch: java.lang.Throwable -> L8a
            r5.receivedCloseReason = r7     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r5.enqueuedClose     // Catch: java.lang.Throwable -> L8a
            r1 = 0
            if (r0 == 0) goto L31
            java.util.ArrayDeque<java.lang.Object> r0 = r5.messageAndCloseQueue     // Catch: java.lang.Throwable -> L8a
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L31
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r5.streams     // Catch: java.lang.Throwable -> L8a
            r5.streams = r1     // Catch: java.lang.Throwable -> L8a
            okhttp3.internal.ws.WebSocketReader r2 = r5.reader     // Catch: java.lang.Throwable -> L8a
            r5.reader = r1     // Catch: java.lang.Throwable -> L8a
            okhttp3.internal.ws.WebSocketWriter r3 = r5.writer     // Catch: java.lang.Throwable -> L8a
            r5.writer = r1     // Catch: java.lang.Throwable -> L8a
            okhttp3.internal.concurrent.TaskQueue r1 = r5.taskQueue     // Catch: java.lang.Throwable -> L8a
            r1.shutdown()     // Catch: java.lang.Throwable -> L8a
            r1 = r0
            goto L33
        L31:
            r2 = r1
            r3 = r2
        L33:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r5)
            okhttp3.WebSocketListener r0 = r5.listener     // Catch: java.lang.Throwable -> L5e
            r4 = r5
            okhttp3.WebSocket r4 = (okhttp3.WebSocket) r4     // Catch: java.lang.Throwable -> L5e
            r0.onClosing(r4, r6, r7)     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto L48
            okhttp3.WebSocketListener r0 = r5.listener     // Catch: java.lang.Throwable -> L5e
            r4 = r5
            okhttp3.WebSocket r4 = (okhttp3.WebSocket) r4     // Catch: java.lang.Throwable -> L5e
            r0.onClosed(r4, r6, r7)     // Catch: java.lang.Throwable -> L5e
        L48:
            if (r1 == 0) goto L4f
            java.io.Closeable r1 = (java.io.Closeable) r1
            okhttp3.internal.Util.closeQuietly(r1)
        L4f:
            if (r2 == 0) goto L56
            java.io.Closeable r2 = (java.io.Closeable) r2
            okhttp3.internal.Util.closeQuietly(r2)
        L56:
            if (r3 == 0) goto L5d
            java.io.Closeable r3 = (java.io.Closeable) r3
            okhttp3.internal.Util.closeQuietly(r3)
        L5d:
            return
        L5e:
            r6 = move-exception
            r7 = r1
            okhttp3.internal.ws.RealWebSocket$Streams r7 = (okhttp3.internal.ws.RealWebSocket.Streams) r7
            if (r1 == 0) goto L69
            java.io.Closeable r1 = (java.io.Closeable) r1
            okhttp3.internal.Util.closeQuietly(r1)
        L69:
            r7 = r2
            okhttp3.internal.ws.WebSocketReader r7 = (okhttp3.internal.ws.WebSocketReader) r7
            if (r2 == 0) goto L73
            java.io.Closeable r2 = (java.io.Closeable) r2
            okhttp3.internal.Util.closeQuietly(r2)
        L73:
            r7 = r3
            okhttp3.internal.ws.WebSocketWriter r7 = (okhttp3.internal.ws.WebSocketWriter) r7
            if (r3 == 0) goto L7d
            java.io.Closeable r3 = (java.io.Closeable) r3
            okhttp3.internal.Util.closeQuietly(r3)
        L7d:
            throw r6
        L7e:
            java.lang.String r6 = "already closed"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L8a
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L8a
            throw r7     // Catch: java.lang.Throwable -> L8a
        L8a:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L8d:
            java.lang.String r6 = "Failed requirement."
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.WebSocketListener r0 = r2.listener
            r1 = r2
            okhttp3.WebSocket r1 = (okhttp3.WebSocket) r1
            r0.onMessage(r1, r3)
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public void onReadMessage(okio.ByteString r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.WebSocketListener r0 = r2.listener
            r1 = r2
            okhttp3.WebSocket r1 = (okhttp3.WebSocket) r1
            r0.onMessage(r1, r3)
            return
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPing(okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L29
            boolean r0 = r1.failed     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L27
            boolean r0 = r1.enqueuedClose     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L17
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch: java.lang.Throwable -> L29
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L17
            goto L27
        L17:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch: java.lang.Throwable -> L29
            r0.add(r2)     // Catch: java.lang.Throwable -> L29
            r1.runWriter()     // Catch: java.lang.Throwable -> L29
            int r2 = r1.receivedPingCount     // Catch: java.lang.Throwable -> L29
            int r2 = r2 + 1
            r1.receivedPingCount = r2     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)
            return
        L27:
            monitor-exit(r1)
            return
        L29:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            throw r2
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public synchronized void onReadPong(okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L11
            int r2 = r1.receivedPongCount     // Catch: java.lang.Throwable -> L11
            int r2 = r2 + 1
            r1.receivedPongCount = r2     // Catch: java.lang.Throwable -> L11
            r2 = 0
            r1.awaitingPong = r2     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    public final synchronized boolean pong(okio.ByteString r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L25
            boolean r0 = r1.failed     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L22
            boolean r0 = r1.enqueuedClose     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L17
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch: java.lang.Throwable -> L25
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L17
            goto L22
        L17:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch: java.lang.Throwable -> L25
            r0.add(r2)     // Catch: java.lang.Throwable -> L25
            r1.runWriter()     // Catch: java.lang.Throwable -> L25
            monitor-exit(r1)
            r2 = 1
            return r2
        L22:
            monitor-exit(r1)
            r2 = 0
            return r2
        L25:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
            throw r2
    }

    public final boolean processNextFrame() throws java.io.IOException {
            r3 = this;
            r0 = 0
            okhttp3.internal.ws.WebSocketReader r1 = r3.reader     // Catch: java.lang.Exception -> L10
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Exception -> L10
            r1.processNextFrame()     // Catch: java.lang.Exception -> L10
            int r1 = r3.receivedCloseCode     // Catch: java.lang.Exception -> L10
            r2 = -1
            if (r1 != r2) goto L15
            r0 = 1
            goto L15
        L10:
            r1 = move-exception
            r2 = 0
            r3.failWebSocket(r1, r2)
        L15:
            return r0
    }

    @Override // okhttp3.WebSocket
    public synchronized long queueSize() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.queueSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int receivedPingCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.receivedPingCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int receivedPongCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.receivedPongCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // okhttp3.WebSocket
    public okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            return r0
    }

    @Override // okhttp3.WebSocket
    public boolean send(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            okio.ByteString r2 = r0.encodeUtf8(r2)
            r0 = 1
            boolean r2 = r1.send(r2, r0)
            return r2
    }

    @Override // okhttp3.WebSocket
    public boolean send(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 2
            boolean r2 = r1.send(r2, r0)
            return r2
    }

    public final synchronized int sentPingCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.sentPingCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final void tearDown() throws java.lang.InterruptedException {
            r4 = this;
            okhttp3.internal.concurrent.TaskQueue r0 = r4.taskQueue
            r0.shutdown()
            okhttp3.internal.concurrent.TaskQueue r0 = r4.taskQueue
            java.util.concurrent.CountDownLatch r0 = r0.idleLatch()
            r1 = 10
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r0.await(r1, r3)
            return
    }

    public final boolean writeOneFrame$okhttp() throws java.io.IOException {
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.failed     // Catch: java.lang.Throwable -> L10e
            r1 = 0
            if (r0 == 0) goto L8
            monitor-exit(r12)
            return r1
        L8:
            okhttp3.internal.ws.WebSocketWriter r0 = r12.writer     // Catch: java.lang.Throwable -> L10e
            java.util.ArrayDeque<okio.ByteString> r2 = r12.pongQueue     // Catch: java.lang.Throwable -> L10e
            java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L10e
            r3 = 1
            r4 = 0
            r5 = -1
            if (r2 != 0) goto L74
            java.util.ArrayDeque<java.lang.Object> r6 = r12.messageAndCloseQueue     // Catch: java.lang.Throwable -> L10e
            java.lang.Object r6 = r6.poll()     // Catch: java.lang.Throwable -> L10e
            boolean r7 = r6 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> L10e
            if (r7 == 0) goto L69
            int r1 = r12.receivedCloseCode     // Catch: java.lang.Throwable -> L10e
            java.lang.String r7 = r12.receivedCloseReason     // Catch: java.lang.Throwable -> L10e
            if (r1 == r5) goto L37
            okhttp3.internal.ws.RealWebSocket$Streams r5 = r12.streams     // Catch: java.lang.Throwable -> L10e
            r12.streams = r4     // Catch: java.lang.Throwable -> L10e
            okhttp3.internal.ws.WebSocketReader r8 = r12.reader     // Catch: java.lang.Throwable -> L10e
            r12.reader = r4     // Catch: java.lang.Throwable -> L10e
            okhttp3.internal.ws.WebSocketWriter r9 = r12.writer     // Catch: java.lang.Throwable -> L10e
            r12.writer = r4     // Catch: java.lang.Throwable -> L10e
            okhttp3.internal.concurrent.TaskQueue r4 = r12.taskQueue     // Catch: java.lang.Throwable -> L10e
            r4.shutdown()     // Catch: java.lang.Throwable -> L10e
            goto L72
        L37:
            r5 = r6
            okhttp3.internal.ws.RealWebSocket$Close r5 = (okhttp3.internal.ws.RealWebSocket.Close) r5     // Catch: java.lang.Throwable -> L10e
            long r8 = r5.getCancelAfterCloseMillis()     // Catch: java.lang.Throwable -> L10e
            okhttp3.internal.concurrent.TaskQueue r5 = r12.taskQueue     // Catch: java.lang.Throwable -> L10e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10e
            r10.<init>()     // Catch: java.lang.Throwable -> L10e
            java.lang.String r11 = r12.name     // Catch: java.lang.Throwable -> L10e
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r11 = " cancel"
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.lang.Throwable -> L10e
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L10e
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L10e
            long r8 = r11.toNanos(r8)     // Catch: java.lang.Throwable -> L10e
            okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1 r11 = new okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1     // Catch: java.lang.Throwable -> L10e
            r11.<init>(r10, r3, r12)     // Catch: java.lang.Throwable -> L10e
            okhttp3.internal.concurrent.Task r11 = (okhttp3.internal.concurrent.Task) r11     // Catch: java.lang.Throwable -> L10e
            r5.schedule(r11, r8)     // Catch: java.lang.Throwable -> L10e
            r5 = r4
            r8 = r5
            r9 = r8
            goto L72
        L69:
            if (r6 != 0) goto L6d
            monitor-exit(r12)
            return r1
        L6d:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = r5
            r5 = r9
        L72:
            r4 = r6
            goto L79
        L74:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = r5
            r5 = r9
        L79:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L10e
            monitor-exit(r12)
            if (r2 == 0) goto L87
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> Lee
            okio.ByteString r2 = (okio.ByteString) r2     // Catch: java.lang.Throwable -> Lee
            r0.writePong(r2)     // Catch: java.lang.Throwable -> Lee
            goto Ld2
        L87:
            boolean r2 = r4 instanceof okhttp3.internal.ws.RealWebSocket.Message     // Catch: java.lang.Throwable -> Lee
            if (r2 == 0) goto Lb1
            okhttp3.internal.ws.RealWebSocket$Message r4 = (okhttp3.internal.ws.RealWebSocket.Message) r4     // Catch: java.lang.Throwable -> Lee
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> Lee
            int r1 = r4.getFormatOpcode()     // Catch: java.lang.Throwable -> Lee
            okio.ByteString r2 = r4.getData()     // Catch: java.lang.Throwable -> Lee
            r0.writeMessageFrame(r1, r2)     // Catch: java.lang.Throwable -> Lee
            monitor-enter(r12)     // Catch: java.lang.Throwable -> Lee
            long r0 = r12.queueSize     // Catch: java.lang.Throwable -> Lae
            okio.ByteString r2 = r4.getData()     // Catch: java.lang.Throwable -> Lae
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lae
            long r6 = (long) r2     // Catch: java.lang.Throwable -> Lae
            long r0 = r0 - r6
            r12.queueSize = r0     // Catch: java.lang.Throwable -> Lae
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lee
            goto Ld2
        Lae:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> Lee
            throw r0     // Catch: java.lang.Throwable -> Lee
        Lb1:
            boolean r2 = r4 instanceof okhttp3.internal.ws.RealWebSocket.Close     // Catch: java.lang.Throwable -> Lee
            if (r2 == 0) goto Le8
            okhttp3.internal.ws.RealWebSocket$Close r4 = (okhttp3.internal.ws.RealWebSocket.Close) r4     // Catch: java.lang.Throwable -> Lee
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> Lee
            int r2 = r4.getCode()     // Catch: java.lang.Throwable -> Lee
            okio.ByteString r4 = r4.getReason()     // Catch: java.lang.Throwable -> Lee
            r0.writeClose(r2, r4)     // Catch: java.lang.Throwable -> Lee
            if (r5 == 0) goto Ld2
            okhttp3.WebSocketListener r0 = r12.listener     // Catch: java.lang.Throwable -> Lee
            r2 = r12
            okhttp3.WebSocket r2 = (okhttp3.WebSocket) r2     // Catch: java.lang.Throwable -> Lee
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)     // Catch: java.lang.Throwable -> Lee
            r0.onClosed(r2, r1, r7)     // Catch: java.lang.Throwable -> Lee
        Ld2:
            if (r5 == 0) goto Ld9
            java.io.Closeable r5 = (java.io.Closeable) r5
            okhttp3.internal.Util.closeQuietly(r5)
        Ld9:
            if (r8 == 0) goto Le0
            java.io.Closeable r8 = (java.io.Closeable) r8
            okhttp3.internal.Util.closeQuietly(r8)
        Le0:
            if (r9 == 0) goto Le7
            java.io.Closeable r9 = (java.io.Closeable) r9
            okhttp3.internal.Util.closeQuietly(r9)
        Le7:
            return r3
        Le8:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> Lee
            r0.<init>()     // Catch: java.lang.Throwable -> Lee
            throw r0     // Catch: java.lang.Throwable -> Lee
        Lee:
            r0 = move-exception
            r1 = r5
            okhttp3.internal.ws.RealWebSocket$Streams r1 = (okhttp3.internal.ws.RealWebSocket.Streams) r1
            if (r5 == 0) goto Lf9
            java.io.Closeable r5 = (java.io.Closeable) r5
            okhttp3.internal.Util.closeQuietly(r5)
        Lf9:
            r1 = r8
            okhttp3.internal.ws.WebSocketReader r1 = (okhttp3.internal.ws.WebSocketReader) r1
            if (r8 == 0) goto L103
            java.io.Closeable r8 = (java.io.Closeable) r8
            okhttp3.internal.Util.closeQuietly(r8)
        L103:
            r1 = r9
            okhttp3.internal.ws.WebSocketWriter r1 = (okhttp3.internal.ws.WebSocketWriter) r1
            if (r9 == 0) goto L10d
            java.io.Closeable r9 = (java.io.Closeable) r9
            okhttp3.internal.Util.closeQuietly(r9)
        L10d:
            throw r0
        L10e:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
    }

    public final void writePingFrame$okhttp() {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.failed     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L7
            monitor-exit(r7)
            return
        L7:
            okhttp3.internal.ws.WebSocketWriter r0 = r7.writer     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto Ld
            monitor-exit(r7)
            return
        Ld:
            boolean r1 = r7.awaitingPong     // Catch: java.lang.Throwable -> L5e
            r2 = -1
            if (r1 == 0) goto L15
            int r1 = r7.sentPingCount     // Catch: java.lang.Throwable -> L5e
            goto L16
        L15:
            r1 = r2
        L16:
            int r3 = r7.sentPingCount     // Catch: java.lang.Throwable -> L5e
            r4 = 1
            int r3 = r3 + r4
            r7.sentPingCount = r3     // Catch: java.lang.Throwable -> L5e
            r7.awaitingPong = r4     // Catch: java.lang.Throwable -> L5e
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r7)
            r3 = 0
            if (r1 == r2) goto L51
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.<init>(r5)
            long r5 = r7.pingIntervalMillis
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r5 = "ms (after "
            java.lang.StringBuilder r2 = r2.append(r5)
            int r1 = r1 - r4
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " successful ping/pongs)"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Exception r0 = (java.lang.Exception) r0
            r7.failWebSocket(r0, r3)
            return
        L51:
            okio.ByteString r1 = okio.ByteString.EMPTY     // Catch: java.io.IOException -> L57
            r0.writePing(r1)     // Catch: java.io.IOException -> L57
            goto L5d
        L57:
            r0 = move-exception
            java.lang.Exception r0 = (java.lang.Exception) r0
            r7.failWebSocket(r0, r3)
        L5d:
            return
        L5e:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
    }
}
