package okhttp3.internal.connection;

/* JADX INFO: compiled from: RealCall.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000§\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001.\u0018\u00002\u00020\u0001:\u0002deB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u00101\u001a\u0002022\u0006\u0010\u0010\u001a\u00020\u000fJ!\u00103\u001a\u0002H4\"\n\b\u0000\u00104*\u0004\u0018\u0001052\u0006\u00106\u001a\u0002H4H\u0002¢\u0006\u0002\u00107J\b\u00108\u001a\u000202H\u0002J\b\u00109\u001a\u000202H\u0016J\b\u0010:\u001a\u00020\u0000H\u0016J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u0002022\u0006\u0010@\u001a\u00020AH\u0016J\u0016\u0010B\u001a\u0002022\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u0007J\b\u0010E\u001a\u00020FH\u0016J\u0015\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020\u0007H\u0000¢\u0006\u0002\bIJ\r\u0010J\u001a\u00020FH\u0000¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020NH\u0000¢\u0006\u0002\bOJ\b\u0010P\u001a\u00020\u0007H\u0016J\b\u0010Q\u001a\u00020\u0007H\u0016J;\u0010R\u001a\u0002H4\"\n\b\u0000\u00104*\u0004\u0018\u0001052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020\u00072\u0006\u0010T\u001a\u00020\u00072\u0006\u00106\u001a\u0002H4H\u0000¢\u0006\u0004\bU\u0010VJ\u0019\u0010W\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0002\bXJ\r\u0010Y\u001a\u00020ZH\u0000¢\u0006\u0002\b[J\u000f\u0010\\\u001a\u0004\u0018\u00010]H\u0000¢\u0006\u0002\b^J\b\u0010C\u001a\u00020\u0005H\u0016J\u0006\u0010_\u001a\u00020\u0007J\b\u0010-\u001a\u00020`H\u0016J\u0006\u00100\u001a\u000202J!\u0010a\u001a\u0002H4\"\n\b\u0000\u00104*\u0004\u0018\u0001052\u0006\u0010b\u001a\u0002H4H\u0002¢\u0006\u0002\u00107J\b\u0010c\u001a\u00020ZH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\"\u0010&\u001a\u0004\u0018\u00010\u001e2\b\u0010\u000e\u001a\u0004\u0018\u00010\u001e@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0004\n\u0002\u0010/R\u000e\u00100\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Lokhttp3/internal/connection/RealCall;", "Lokhttp3/Call;", "client", "Lokhttp3/OkHttpClient;", "originalRequest", "Lokhttp3/Request;", "forWebSocket", "", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V", "callStackTrace", "", "canceled", "getClient", "()Lokhttp3/OkHttpClient;", "<set-?>", "Lokhttp3/internal/connection/RealConnection;", "connection", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "connectionToCancel", "getConnectionToCancel", "setConnectionToCancel", "(Lokhttp3/internal/connection/RealConnection;)V", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "exchange", "Lokhttp3/internal/connection/Exchange;", "exchangeFinder", "Lokhttp3/internal/connection/ExchangeFinder;", "executed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "expectMoreExchanges", "getForWebSocket", "()Z", "interceptorScopedExchange", "getInterceptorScopedExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "getOriginalRequest", "()Lokhttp3/Request;", "requestBodyOpen", "responseBodyOpen", "timeout", "okhttp3/internal/connection/RealCall$timeout$1", "Lokhttp3/internal/connection/RealCall$timeout$1;", "timeoutEarlyExit", "acquireConnectionNoEvents", "", "callDone", "E", "Ljava/io/IOException;", "e", "(Ljava/io/IOException;)Ljava/io/IOException;", "callStart", "cancel", "clone", "createAddress", "Lokhttp3/Address;", "url", "Lokhttp3/HttpUrl;", "enqueue", "responseCallback", "Lokhttp3/Callback;", "enterNetworkInterceptorExchange", "request", "newExchangeFinder", "execute", "Lokhttp3/Response;", "exitNetworkInterceptorExchange", "closeExchange", "exitNetworkInterceptorExchange$okhttp", "getResponseWithInterceptorChain", "getResponseWithInterceptorChain$okhttp", "initExchange", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "initExchange$okhttp", "isCanceled", "isExecuted", "messageDone", "requestDone", "responseDone", "messageDone$okhttp", "(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;", "noMoreExchanges", "noMoreExchanges$okhttp", "redactedUrl", "", "redactedUrl$okhttp", "releaseConnectionNoEvents", "Ljava/net/Socket;", "releaseConnectionNoEvents$okhttp", "retryAfterFailure", "Lokio/AsyncTimeout;", "timeoutExit", "cause", "toLoggableString", "AsyncCall", "CallReference", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealCall implements okhttp3.Call {
    private java.lang.Object callStackTrace;
    private volatile boolean canceled;
    private final okhttp3.OkHttpClient client;
    private okhttp3.internal.connection.RealConnection connection;
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;
    private volatile okhttp3.internal.connection.RealConnection connectionToCancel;
    private final okhttp3.EventListener eventListener;
    private volatile okhttp3.internal.connection.Exchange exchange;
    private okhttp3.internal.connection.ExchangeFinder exchangeFinder;
    private final java.util.concurrent.atomic.AtomicBoolean executed;
    private boolean expectMoreExchanges;
    private final boolean forWebSocket;
    private okhttp3.internal.connection.Exchange interceptorScopedExchange;
    private final okhttp3.Request originalRequest;
    private boolean requestBodyOpen;
    private boolean responseBodyOpen;
    private final okhttp3.internal.connection.RealCall.AnonymousClass1 timeout;
    private boolean timeoutEarlyExit;

    /* JADX INFO: compiled from: RealCall.kt */
    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u0000R\u00020\u0006J\b\u0010\u001c\u001a\u00020\u0017H\u0016R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/connection/RealCall$AsyncCall;", "Ljava/lang/Runnable;", "responseCallback", "Lokhttp3/Callback;", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/Callback;)V", "call", "Lokhttp3/internal/connection/RealCall;", "getCall", "()Lokhttp3/internal/connection/RealCall;", "<set-?>", "Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "getCallsPerHost", "()Ljava/util/concurrent/atomic/AtomicInteger;", "host", "", "getHost", "()Ljava/lang/String;", "request", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "executeOn", "", "executorService", "Ljava/util/concurrent/ExecutorService;", "reuseCallsPerHostFrom", "other", "run", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class AsyncCall implements java.lang.Runnable {
        private volatile java.util.concurrent.atomic.AtomicInteger callsPerHost;
        private final okhttp3.Callback responseCallback;
        final /* synthetic */ okhttp3.internal.connection.RealCall this$0;

        public AsyncCall(okhttp3.internal.connection.RealCall r2, okhttp3.Callback r3) {
                r1 = this;
                java.lang.String r0 = "responseCallback"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.responseCallback = r3
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r3 = 0
                r2.<init>(r3)
                r1.callsPerHost = r2
                return
        }

        public final void executeOn(java.util.concurrent.ExecutorService r4) {
                r3 = this;
                java.lang.String r0 = "executorService"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okhttp3.internal.connection.RealCall r0 = r3.this$0
                okhttp3.OkHttpClient r0 = r0.getClient()
                okhttp3.Dispatcher r0 = r0.dispatcher()
                boolean r1 = okhttp3.internal.Util.assertionsEnabled
                if (r1 == 0) goto L41
                boolean r1 = java.lang.Thread.holdsLock(r0)
                if (r1 != 0) goto L1a
                goto L41
            L1a:
                java.lang.AssertionError r4 = new java.lang.AssertionError
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Thread "
                r1.<init>(r2)
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.String r2 = r2.getName()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " MUST NOT hold lock on "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
            L41:
                r0 = r3
                java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L48 java.util.concurrent.RejectedExecutionException -> L4a
                r4.execute(r0)     // Catch: java.lang.Throwable -> L48 java.util.concurrent.RejectedExecutionException -> L4a
                goto L77
            L48:
                r4 = move-exception
                goto L78
            L4a:
                r4 = move-exception
                java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L48
                java.lang.String r1 = "executor rejected"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L48
                java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> L48
                r0.initCause(r4)     // Catch: java.lang.Throwable -> L48
                okhttp3.internal.connection.RealCall r4 = r3.this$0     // Catch: java.lang.Throwable -> L48
                r1 = r0
                java.io.IOException r1 = (java.io.IOException) r1     // Catch: java.lang.Throwable -> L48
                r4.noMoreExchanges$okhttp(r1)     // Catch: java.lang.Throwable -> L48
                okhttp3.Callback r4 = r3.responseCallback     // Catch: java.lang.Throwable -> L48
                okhttp3.internal.connection.RealCall r1 = r3.this$0     // Catch: java.lang.Throwable -> L48
                okhttp3.Call r1 = (okhttp3.Call) r1     // Catch: java.lang.Throwable -> L48
                java.io.IOException r0 = (java.io.IOException) r0     // Catch: java.lang.Throwable -> L48
                r4.onFailure(r1, r0)     // Catch: java.lang.Throwable -> L48
                okhttp3.internal.connection.RealCall r4 = r3.this$0
                okhttp3.OkHttpClient r4 = r4.getClient()
                okhttp3.Dispatcher r4 = r4.dispatcher()
                r4.finished$okhttp(r3)
            L77:
                return
            L78:
                okhttp3.internal.connection.RealCall r0 = r3.this$0
                okhttp3.OkHttpClient r0 = r0.getClient()
                okhttp3.Dispatcher r0 = r0.dispatcher()
                r0.finished$okhttp(r3)
                throw r4
        }

        public final okhttp3.internal.connection.RealCall getCall() {
                r1 = this;
                okhttp3.internal.connection.RealCall r0 = r1.this$0
                return r0
        }

        public final java.util.concurrent.atomic.AtomicInteger getCallsPerHost() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.callsPerHost
                return r0
        }

        public final java.lang.String getHost() {
                r1 = this;
                okhttp3.internal.connection.RealCall r0 = r1.this$0
                okhttp3.Request r0 = r0.getOriginalRequest()
                okhttp3.HttpUrl r0 = r0.url()
                java.lang.String r0 = r0.host()
                return r0
        }

        public final okhttp3.Request getRequest() {
                r1 = this;
                okhttp3.internal.connection.RealCall r0 = r1.this$0
                okhttp3.Request r0 = r0.getOriginalRequest()
                return r0
        }

        public final void reuseCallsPerHostFrom(okhttp3.internal.connection.RealCall.AsyncCall r2) {
                r1 = this;
                java.lang.String r0 = "other"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.util.concurrent.atomic.AtomicInteger r2 = r2.callsPerHost
                r1.callsPerHost = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r9 = this;
                java.lang.String r0 = "canceled due to "
                java.lang.String r1 = "Callback failure for "
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "OkHttp "
                r2.<init>(r3)
                okhttp3.internal.connection.RealCall r3 = r9.this$0
                java.lang.String r3 = r3.redactedUrl$okhttp()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                okhttp3.internal.connection.RealCall r3 = r9.this$0
                java.lang.Thread r4 = java.lang.Thread.currentThread()
                java.lang.String r5 = r4.getName()
                r4.setName(r2)
                okhttp3.internal.connection.RealCall$timeout$1 r2 = okhttp3.internal.connection.RealCall.access$getTimeout$p(r3)     // Catch: java.lang.Throwable -> Lb8
                r2.enter()     // Catch: java.lang.Throwable -> Lb8
                r2 = 0
                okhttp3.Response r2 = r3.getResponseWithInterceptorChain$okhttp()     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L76
                r6 = 1
                okhttp3.Callback r7 = r9.responseCallback     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
                r8 = r3
                okhttp3.Call r8 = (okhttp3.Call) r8     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
                r7.onResponse(r8, r2)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
                okhttp3.OkHttpClient r0 = r3.getClient()     // Catch: java.lang.Throwable -> Lb8
                okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch: java.lang.Throwable -> Lb8
            L43:
                r0.finished$okhttp(r9)     // Catch: java.lang.Throwable -> Lb8
                goto La8
            L47:
                r1 = move-exception
                r2 = r6
                goto L4e
            L4a:
                r0 = move-exception
                r2 = r6
                goto L77
            L4d:
                r1 = move-exception
            L4e:
                r3.cancel()     // Catch: java.lang.Throwable -> L74
                if (r2 != 0) goto L73
                java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L74
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
                r6.<init>(r0)     // Catch: java.lang.Throwable -> L74
                java.lang.StringBuilder r0 = r6.append(r1)     // Catch: java.lang.Throwable -> L74
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L74
                r2.<init>(r0)     // Catch: java.lang.Throwable -> L74
                r0 = r2
                java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L74
                kotlin.ExceptionsKt.addSuppressed(r0, r1)     // Catch: java.lang.Throwable -> L74
                okhttp3.Callback r0 = r9.responseCallback     // Catch: java.lang.Throwable -> L74
                r6 = r3
                okhttp3.Call r6 = (okhttp3.Call) r6     // Catch: java.lang.Throwable -> L74
                r0.onFailure(r6, r2)     // Catch: java.lang.Throwable -> L74
            L73:
                throw r1     // Catch: java.lang.Throwable -> L74
            L74:
                r0 = move-exception
                goto Lac
            L76:
                r0 = move-exception
            L77:
                if (r2 == 0) goto L97
                okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L74
                okhttp3.internal.platform.Platform r2 = r2.get()     // Catch: java.lang.Throwable -> L74
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
                r6.<init>(r1)     // Catch: java.lang.Throwable -> L74
                java.lang.String r1 = okhttp3.internal.connection.RealCall.access$toLoggableString(r3)     // Catch: java.lang.Throwable -> L74
                java.lang.StringBuilder r1 = r6.append(r1)     // Catch: java.lang.Throwable -> L74
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L74
                java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L74
                r6 = 4
                r2.log(r1, r6, r0)     // Catch: java.lang.Throwable -> L74
                goto L9f
            L97:
                okhttp3.Callback r1 = r9.responseCallback     // Catch: java.lang.Throwable -> L74
                r2 = r3
                okhttp3.Call r2 = (okhttp3.Call) r2     // Catch: java.lang.Throwable -> L74
                r1.onFailure(r2, r0)     // Catch: java.lang.Throwable -> L74
            L9f:
                okhttp3.OkHttpClient r0 = r3.getClient()     // Catch: java.lang.Throwable -> Lb8
                okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch: java.lang.Throwable -> Lb8
                goto L43
            La8:
                r4.setName(r5)
                return
            Lac:
                okhttp3.OkHttpClient r1 = r3.getClient()     // Catch: java.lang.Throwable -> Lb8
                okhttp3.Dispatcher r1 = r1.dispatcher()     // Catch: java.lang.Throwable -> Lb8
                r1.finished$okhttp(r9)     // Catch: java.lang.Throwable -> Lb8
                throw r0     // Catch: java.lang.Throwable -> Lb8
            Lb8:
                r0 = move-exception
                r4.setName(r5)
                throw r0
        }
    }

    /* JADX INFO: compiled from: RealCall.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/connection/RealCall$CallReference;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/RealCall;", "referent", "callStackTrace", "", "(Lokhttp3/internal/connection/RealCall;Ljava/lang/Object;)V", "getCallStackTrace", "()Ljava/lang/Object;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CallReference extends java.lang.ref.WeakReference<okhttp3.internal.connection.RealCall> {
        private final java.lang.Object callStackTrace;

        public CallReference(okhttp3.internal.connection.RealCall r2, java.lang.Object r3) {
                r1 = this;
                java.lang.String r0 = "referent"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>(r2)
                r1.callStackTrace = r3
                return
        }

        public final java.lang.Object getCallStackTrace() {
                r1 = this;
                java.lang.Object r0 = r1.callStackTrace
                return r0
        }
    }


    public RealCall(okhttp3.OkHttpClient r3, okhttp3.Request r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "originalRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r2.<init>()
            r2.client = r3
            r2.originalRequest = r4
            r2.forWebSocket = r5
            okhttp3.ConnectionPool r4 = r3.connectionPool()
            okhttp3.internal.connection.RealConnectionPool r4 = r4.getDelegate$okhttp()
            r2.connectionPool = r4
            okhttp3.EventListener$Factory r4 = r3.eventListenerFactory()
            r5 = r2
            okhttp3.Call r5 = (okhttp3.Call) r5
            okhttp3.EventListener r4 = r4.create(r5)
            r2.eventListener = r4
            okhttp3.internal.connection.RealCall$timeout$1 r4 = new okhttp3.internal.connection.RealCall$timeout$1
            r4.<init>(r2)
            int r3 = r3.callTimeoutMillis()
            long r0 = (long) r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r4.timeout(r0, r3)
            r2.timeout = r4
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r2.executed = r3
            r3 = 1
            r2.expectMoreExchanges = r3
            return
    }

    public static final /* synthetic */ okhttp3.internal.connection.RealCall.AnonymousClass1 access$getTimeout$p(okhttp3.internal.connection.RealCall r0) {
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r0.timeout
            return r0
    }

    public static final /* synthetic */ java.lang.String access$toLoggableString(okhttp3.internal.connection.RealCall r0) {
            java.lang.String r0 = r0.toLoggableString()
            return r0
    }

    private final <E extends java.io.IOException> E callDone(E r4) {
            r3 = this;
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Thread "
            r0.<init>(r1)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " MUST NOT hold lock on "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L32:
            okhttp3.internal.connection.RealConnection r0 = r3.connection
            if (r0 == 0) goto L94
            boolean r1 = okhttp3.internal.Util.assertionsEnabled
            if (r1 == 0) goto L68
            boolean r1 = java.lang.Thread.holdsLock(r0)
            if (r1 != 0) goto L41
            goto L68
        L41:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Thread "
            r1.<init>(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " MUST NOT hold lock on "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L68:
            monitor-enter(r0)
            java.net.Socket r1 = r3.releaseConnectionNoEvents$okhttp()     // Catch: java.lang.Throwable -> L91
            monitor-exit(r0)
            okhttp3.internal.connection.RealConnection r2 = r3.connection
            if (r2 != 0) goto L82
            if (r1 == 0) goto L77
            okhttp3.internal.Util.closeQuietly(r1)
        L77:
            okhttp3.EventListener r1 = r3.eventListener
            r2 = r3
            okhttp3.Call r2 = (okhttp3.Call) r2
            okhttp3.Connection r0 = (okhttp3.Connection) r0
            r1.connectionReleased(r2, r0)
            goto L94
        L82:
            if (r1 != 0) goto L85
            goto L94
        L85:
            java.lang.String r4 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L91:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L94:
            java.io.IOException r0 = r3.timeoutExit(r4)
            if (r4 == 0) goto La6
            okhttp3.EventListener r4 = r3.eventListener
            r1 = r3
            okhttp3.Call r1 = (okhttp3.Call) r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r4.callFailed(r1, r0)
            goto Lae
        La6:
            okhttp3.EventListener r4 = r3.eventListener
            r1 = r3
            okhttp3.Call r1 = (okhttp3.Call) r1
            r4.callEnd(r1)
        Lae:
            return r0
    }

    private final void callStart() {
            r2 = this;
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            okhttp3.internal.platform.Platform r0 = r0.get()
            java.lang.String r1 = "response.body().close()"
            java.lang.Object r0 = r0.getStackTraceForCloseable(r1)
            r2.callStackTrace = r0
            okhttp3.EventListener r0 = r2.eventListener
            r1 = r2
            okhttp3.Call r1 = (okhttp3.Call) r1
            r0.callStart(r1)
            return
    }

    private final okhttp3.Address createAddress(okhttp3.HttpUrl r15) {
            r14 = this;
            boolean r0 = r15.isHttps()
            if (r0 == 0) goto L1c
            okhttp3.OkHttpClient r0 = r14.client
            javax.net.ssl.SSLSocketFactory r0 = r0.sslSocketFactory()
            okhttp3.OkHttpClient r1 = r14.client
            javax.net.ssl.HostnameVerifier r1 = r1.hostnameVerifier()
            okhttp3.OkHttpClient r2 = r14.client
            okhttp3.CertificatePinner r2 = r2.certificatePinner()
            r6 = r0
            r7 = r1
            r8 = r2
            goto L20
        L1c:
            r0 = 0
            r6 = r0
            r7 = r6
            r8 = r7
        L20:
            okhttp3.Address r0 = new okhttp3.Address
            java.lang.String r2 = r15.host()
            int r3 = r15.port()
            okhttp3.OkHttpClient r15 = r14.client
            okhttp3.Dns r4 = r15.dns()
            okhttp3.OkHttpClient r15 = r14.client
            javax.net.SocketFactory r5 = r15.socketFactory()
            okhttp3.OkHttpClient r15 = r14.client
            okhttp3.Authenticator r9 = r15.proxyAuthenticator()
            okhttp3.OkHttpClient r15 = r14.client
            java.net.Proxy r10 = r15.proxy()
            okhttp3.OkHttpClient r15 = r14.client
            java.util.List r11 = r15.protocols()
            okhttp3.OkHttpClient r15 = r14.client
            java.util.List r12 = r15.connectionSpecs()
            okhttp3.OkHttpClient r15 = r14.client
            java.net.ProxySelector r13 = r15.proxySelector()
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    private final <E extends java.io.IOException> E timeoutExit(E r3) {
            r2 = this;
            boolean r0 = r2.timeoutEarlyExit
            if (r0 == 0) goto L5
            return r3
        L5:
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r2.timeout
            boolean r0 = r0.exit()
            if (r0 != 0) goto Le
            return r3
        Le:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto L1c
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r0.initCause(r3)
        L1c:
            java.io.IOException r0 = (java.io.IOException) r0
            return r0
    }

    private final java.lang.String toLoggableString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r2.isCanceled()
            if (r1 == 0) goto Le
            java.lang.String r1 = "canceled "
            goto L10
        Le:
            java.lang.String r1 = ""
        L10:
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.forWebSocket
            if (r1 == 0) goto L1b
            java.lang.String r1 = "web socket"
            goto L1d
        L1b:
            java.lang.String r1 = "call"
        L1d:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " to "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.redactedUrl$okhttp()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void acquireConnectionNoEvents(okhttp3.internal.connection.RealConnection r4) {
            r3 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r4)
            if (r0 == 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Thread "
            r1.<init>(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L37:
            okhttp3.internal.connection.RealConnection r0 = r3.connection
            if (r0 != 0) goto L4c
            r3.connection = r4
            java.util.List r4 = r4.getCalls()
            okhttp3.internal.connection.RealCall$CallReference r0 = new okhttp3.internal.connection.RealCall$CallReference
            java.lang.Object r1 = r3.callStackTrace
            r0.<init>(r3, r1)
            r4.add(r0)
            return
        L4c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Override // okhttp3.Call
    public void cancel() {
            r2 = this;
            boolean r0 = r2.canceled
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.canceled = r0
            okhttp3.internal.connection.Exchange r0 = r2.exchange
            if (r0 == 0) goto Lf
            r0.cancel()
        Lf:
            okhttp3.internal.connection.RealConnection r0 = r2.connectionToCancel
            if (r0 == 0) goto L16
            r0.cancel()
        L16:
            okhttp3.EventListener r0 = r2.eventListener
            r1 = r2
            okhttp3.Call r1 = (okhttp3.Call) r1
            r0.canceled(r1)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.clone()
            return r0
    }

    @Override // okhttp3.Call
    public /* bridge */ /* synthetic */ okhttp3.Call clone() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.clone()
            okhttp3.Call r0 = (okhttp3.Call) r0
            return r0
    }

    @Override // okhttp3.Call
    public okhttp3.internal.connection.RealCall clone() {
            r4 = this;
            okhttp3.internal.connection.RealCall r0 = new okhttp3.internal.connection.RealCall
            okhttp3.OkHttpClient r1 = r4.client
            okhttp3.Request r2 = r4.originalRequest
            boolean r3 = r4.forWebSocket
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // okhttp3.Call
    public void enqueue(okhttp3.Callback r4) {
            r3 = this;
            java.lang.String r0 = "responseCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.executed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L21
            r3.callStart()
            okhttp3.OkHttpClient r0 = r3.client
            okhttp3.Dispatcher r0 = r0.dispatcher()
            okhttp3.internal.connection.RealCall$AsyncCall r1 = new okhttp3.internal.connection.RealCall$AsyncCall
            r1.<init>(r3, r4)
            r0.enqueue$okhttp(r1)
            return
        L21:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already Executed"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    public final void enterNetworkInterceptorExchange(okhttp3.Request r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.internal.connection.Exchange r0 = r2.interceptorScopedExchange
            if (r0 != 0) goto L46
            monitor-enter(r2)
            boolean r0 = r2.responseBodyOpen     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L37
            boolean r0 = r2.requestBodyOpen     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L2b
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L43
            monitor-exit(r2)
            if (r4 == 0) goto L2a
            okhttp3.internal.connection.ExchangeFinder r4 = new okhttp3.internal.connection.ExchangeFinder
            okhttp3.internal.connection.RealConnectionPool r0 = r2.connectionPool
            okhttp3.HttpUrl r3 = r3.url()
            okhttp3.Address r3 = r2.createAddress(r3)
            okhttp3.EventListener r1 = r2.eventListener
            r4.<init>(r0, r3, r2, r1)
            r2.exchangeFinder = r4
        L2a:
            return
        L2b:
            java.lang.String r3 = "Check failed."
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L43
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L43
            throw r4     // Catch: java.lang.Throwable -> L43
        L37:
            java.lang.String r3 = "cannot make a new request because the previous response is still open: please call response.close()"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L43
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L43
            throw r4     // Catch: java.lang.Throwable -> L43
        L43:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L46:
            java.lang.String r3 = "Check failed."
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // okhttp3.Call
    public okhttp3.Response execute() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.executed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L34
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r3.timeout
            r0.enter()
            r3.callStart()
            okhttp3.OkHttpClient r0 = r3.client     // Catch: java.lang.Throwable -> L29
            okhttp3.Dispatcher r0 = r0.dispatcher()     // Catch: java.lang.Throwable -> L29
            r0.executed$okhttp(r3)     // Catch: java.lang.Throwable -> L29
            okhttp3.Response r0 = r3.getResponseWithInterceptorChain$okhttp()     // Catch: java.lang.Throwable -> L29
            okhttp3.OkHttpClient r1 = r3.client
            okhttp3.Dispatcher r1 = r1.dispatcher()
            r1.finished$okhttp(r3)
            return r0
        L29:
            r0 = move-exception
            okhttp3.OkHttpClient r1 = r3.client
            okhttp3.Dispatcher r1 = r1.dispatcher()
            r1.finished$okhttp(r3)
            throw r0
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already Executed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void exitNetworkInterceptorExchange$okhttp(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.expectMoreExchanges     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L15
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L21
            monitor-exit(r1)
            if (r2 == 0) goto L11
            okhttp3.internal.connection.Exchange r2 = r1.exchange
            if (r2 == 0) goto L11
            r2.detachWithViolence()
        L11:
            r2 = 0
            r1.interceptorScopedExchange = r2
            return
        L15:
            java.lang.String r2 = "released"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L21
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L21
            throw r0     // Catch: java.lang.Throwable -> L21
        L21:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final okhttp3.OkHttpClient getClient() {
            r1 = this;
            okhttp3.OkHttpClient r0 = r1.client
            return r0
    }

    public final okhttp3.internal.connection.RealConnection getConnection() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.connection
            return r0
    }

    public final okhttp3.internal.connection.RealConnection getConnectionToCancel() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.connectionToCancel
            return r0
    }

    public final okhttp3.EventListener getEventListener$okhttp() {
            r1 = this;
            okhttp3.EventListener r0 = r1.eventListener
            return r0
    }

    public final boolean getForWebSocket() {
            r1 = this;
            boolean r0 = r1.forWebSocket
            return r0
    }

    public final okhttp3.internal.connection.Exchange getInterceptorScopedExchange$okhttp() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.interceptorScopedExchange
            return r0
    }

    public final okhttp3.Request getOriginalRequest() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            return r0
    }

    public final okhttp3.Response getResponseWithInterceptorChain$okhttp() throws java.io.IOException {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            okhttp3.OkHttpClient r1 = r10.client
            java.util.List r1 = r1.interceptors()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.collections.CollectionsKt.addAll(r0, r1)
            okhttp3.internal.http.RetryAndFollowUpInterceptor r1 = new okhttp3.internal.http.RetryAndFollowUpInterceptor
            okhttp3.OkHttpClient r2 = r10.client
            r1.<init>(r2)
            r0.add(r1)
            okhttp3.internal.http.BridgeInterceptor r1 = new okhttp3.internal.http.BridgeInterceptor
            okhttp3.OkHttpClient r2 = r10.client
            okhttp3.CookieJar r2 = r2.cookieJar()
            r1.<init>(r2)
            r0.add(r1)
            okhttp3.internal.cache.CacheInterceptor r1 = new okhttp3.internal.cache.CacheInterceptor
            okhttp3.OkHttpClient r2 = r10.client
            okhttp3.Cache r2 = r2.cache()
            r1.<init>(r2)
            r0.add(r1)
            okhttp3.internal.connection.ConnectInterceptor r1 = okhttp3.internal.connection.ConnectInterceptor.INSTANCE
            r0.add(r1)
            boolean r1 = r10.forWebSocket
            if (r1 != 0) goto L50
            okhttp3.OkHttpClient r1 = r10.client
            java.util.List r1 = r1.networkInterceptors()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.collections.CollectionsKt.addAll(r0, r1)
        L50:
            okhttp3.internal.http.CallServerInterceptor r1 = new okhttp3.internal.http.CallServerInterceptor
            boolean r2 = r10.forWebSocket
            r1.<init>(r2)
            r0.add(r1)
            okhttp3.internal.http.RealInterceptorChain r0 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.Request r6 = r10.originalRequest
            okhttp3.OkHttpClient r1 = r10.client
            int r7 = r1.connectTimeoutMillis()
            okhttp3.OkHttpClient r1 = r10.client
            int r8 = r1.readTimeoutMillis()
            okhttp3.OkHttpClient r1 = r10.client
            int r9 = r1.writeTimeoutMillis()
            r4 = 0
            r5 = 0
            r1 = r0
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 0
            r2 = 0
            okhttp3.Request r3 = r10.originalRequest     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            okhttp3.Response r0 = r0.proceed(r3)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            boolean r3 = r10.isCanceled()     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            if (r3 != 0) goto L89
            r10.noMoreExchanges$okhttp(r1)
            return r0
        L89:
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            okhttp3.internal.Util.closeQuietly(r0)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            throw r0     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
        L96:
            r0 = move-exception
            goto La6
        L98:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r10.noMoreExchanges$okhttp(r0)     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r3)     // Catch: java.lang.Throwable -> L96
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.Throwable -> L96
        La6:
            if (r2 != 0) goto Lab
            r10.noMoreExchanges$okhttp(r1)
        Lab:
            throw r0
    }

    public final okhttp3.internal.connection.Exchange initExchange$okhttp(okhttp3.internal.http.RealInterceptorChain r4) {
            r3 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            monitor-enter(r3)
            boolean r0 = r3.expectMoreExchanges     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L5c
            boolean r0 = r3.responseBodyOpen     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L50
            boolean r0 = r3.requestBodyOpen     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L44
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L68
            monitor-exit(r3)
            okhttp3.internal.connection.ExchangeFinder r0 = r3.exchangeFinder
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okhttp3.OkHttpClient r1 = r3.client
            okhttp3.internal.http.ExchangeCodec r4 = r0.find(r1, r4)
            okhttp3.internal.connection.Exchange r1 = new okhttp3.internal.connection.Exchange
            okhttp3.EventListener r2 = r3.eventListener
            r1.<init>(r3, r2, r0, r4)
            r3.interceptorScopedExchange = r1
            r3.exchange = r1
            monitor-enter(r3)
            r4 = 1
            r3.requestBodyOpen = r4     // Catch: java.lang.Throwable -> L41
            r3.responseBodyOpen = r4     // Catch: java.lang.Throwable -> L41
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L41
            monitor-exit(r3)
            boolean r4 = r3.canceled
            if (r4 != 0) goto L39
            return r1
        L39:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r4.<init>(r0)
            throw r4
        L41:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L44:
            java.lang.String r4 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L68
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L68
            throw r0     // Catch: java.lang.Throwable -> L68
        L50:
            java.lang.String r4 = "Check failed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L68
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L68
            throw r0     // Catch: java.lang.Throwable -> L68
        L5c:
            java.lang.String r4 = "released"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L68
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L68
            throw r0     // Catch: java.lang.Throwable -> L68
        L68:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    @Override // okhttp3.Call
    public boolean isCanceled() {
            r1 = this;
            boolean r0 = r1.canceled
            return r0
    }

    @Override // okhttp3.Call
    public boolean isExecuted() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.executed
            boolean r0 = r0.get()
            return r0
    }

    public final <E extends java.io.IOException> E messageDone$okhttp(okhttp3.internal.connection.Exchange r2, boolean r3, boolean r4, E r5) {
            r1 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r2 != 0) goto Le
            return r5
        Le:
            monitor-enter(r1)
            r2 = 0
            if (r3 == 0) goto L19
            boolean r0 = r1.requestBodyOpen     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1f
            goto L19
        L17:
            r2 = move-exception
            goto L59
        L19:
            if (r4 == 0) goto L41
            boolean r0 = r1.responseBodyOpen     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L41
        L1f:
            if (r3 == 0) goto L23
            r1.requestBodyOpen = r2     // Catch: java.lang.Throwable -> L17
        L23:
            if (r4 == 0) goto L27
            r1.responseBodyOpen = r2     // Catch: java.lang.Throwable -> L17
        L27:
            boolean r3 = r1.requestBodyOpen     // Catch: java.lang.Throwable -> L17
            r4 = 1
            if (r3 != 0) goto L32
            boolean r0 = r1.responseBodyOpen     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L32
            r0 = r4
            goto L33
        L32:
            r0 = r2
        L33:
            if (r3 != 0) goto L3e
            boolean r3 = r1.responseBodyOpen     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            boolean r3 = r1.expectMoreExchanges     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L3e
            r2 = r4
        L3e:
            r3 = r2
            r2 = r0
            goto L42
        L41:
            r3 = r2
        L42:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            if (r2 == 0) goto L51
            r2 = 0
            r1.exchange = r2
            okhttp3.internal.connection.RealConnection r2 = r1.connection
            if (r2 == 0) goto L51
            r2.incrementSuccessCount$okhttp()
        L51:
            if (r3 == 0) goto L58
            java.io.IOException r2 = r1.callDone(r5)
            return r2
        L58:
            return r5
        L59:
            monitor-exit(r1)
            throw r2
    }

    public final java.io.IOException noMoreExchanges$okhttp(java.io.IOException r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.expectMoreExchanges     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            if (r0 == 0) goto L12
            r2.expectMoreExchanges = r1     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r2.requestBodyOpen     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L12
            boolean r0 = r2.responseBodyOpen     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L12
            r0 = 1
            r1 = r0
        L12:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)
            if (r1 == 0) goto L1b
            java.io.IOException r3 = r2.callDone(r3)
        L1b:
            return r3
        L1c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    public final java.lang.String redactedUrl$okhttp() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.redact()
            return r0
    }

    public final java.net.Socket releaseConnectionNoEvents$okhttp() {
            r6 = this;
            okhttp3.internal.connection.RealConnection r0 = r6.connection
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r1 = okhttp3.internal.Util.assertionsEnabled
            if (r1 == 0) goto L37
            boolean r1 = java.lang.Thread.holdsLock(r0)
            if (r1 == 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Thread "
            r2.<init>(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " MUST hold lock on "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L37:
            java.util.List r1 = r0.getCalls()
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
        L40:
            boolean r4 = r2.hasNext()
            r5 = -1
            if (r4 == 0) goto L5b
            java.lang.Object r4 = r2.next()
            java.lang.ref.Reference r4 = (java.lang.ref.Reference) r4
            java.lang.Object r4 = r4.get()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
            if (r4 == 0) goto L58
            goto L5c
        L58:
            int r3 = r3 + 1
            goto L40
        L5b:
            r3 = r5
        L5c:
            if (r3 == r5) goto L7f
            r1.remove(r3)
            r2 = 0
            r6.connection = r2
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7e
            long r3 = java.lang.System.nanoTime()
            r0.setIdleAtNs$okhttp(r3)
            okhttp3.internal.connection.RealConnectionPool r1 = r6.connectionPool
            boolean r1 = r1.connectionBecameIdle(r0)
            if (r1 == 0) goto L7e
            java.net.Socket r0 = r0.socket()
            return r0
        L7e:
            return r2
        L7f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.Call
    public okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.originalRequest
            return r0
    }

    public final boolean retryAfterFailure() {
            r1 = this;
            okhttp3.internal.connection.ExchangeFinder r0 = r1.exchangeFinder
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r0 = r0.retryAfterFailure()
            return r0
    }

    public final void setConnectionToCancel(okhttp3.internal.connection.RealConnection r1) {
            r0 = this;
            r0.connectionToCancel = r1
            return
    }

    @Override // okhttp3.Call
    public okio.AsyncTimeout timeout() {
            r1 = this;
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r1.timeout
            okio.AsyncTimeout r0 = (okio.AsyncTimeout) r0
            return r0
    }

    @Override // okhttp3.Call
    public /* bridge */ /* synthetic */ okio.Timeout timeout() {
            r1 = this;
            okio.AsyncTimeout r0 = r1.timeout()
            okio.Timeout r0 = (okio.Timeout) r0
            return r0
    }

    public final void timeoutEarlyExit() {
            r2 = this;
            boolean r0 = r2.timeoutEarlyExit
            if (r0 != 0) goto Ld
            r0 = 1
            r2.timeoutEarlyExit = r0
            okhttp3.internal.connection.RealCall$timeout$1 r0 = r2.timeout
            r0.exit()
            return
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
