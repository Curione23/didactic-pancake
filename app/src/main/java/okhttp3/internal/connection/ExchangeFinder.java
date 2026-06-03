package okhttp3.internal.connection;

/* JADX INFO: compiled from: ExchangeFinder.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ0\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0002J8\u0010%\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0002J\u0006\u0010'\u001a\u00020$J\n\u0010(\u001a\u0004\u0018\u00010\u0010H\u0002J\u000e\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lokhttp3/internal/connection/ExchangeFinder;", "", "connectionPool", "Lokhttp3/internal/connection/RealConnectionPool;", "address", "Lokhttp3/Address;", "call", "Lokhttp3/internal/connection/RealCall;", "eventListener", "Lokhttp3/EventListener;", "(Lokhttp3/internal/connection/RealConnectionPool;Lokhttp3/Address;Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;)V", "getAddress$okhttp", "()Lokhttp3/Address;", "connectionShutdownCount", "", "nextRouteToTry", "Lokhttp3/Route;", "otherFailureCount", "refusedStreamCount", "routeSelection", "Lokhttp3/internal/connection/RouteSelector$Selection;", "routeSelector", "Lokhttp3/internal/connection/RouteSelector;", "find", "Lokhttp3/internal/http/ExchangeCodec;", "client", "Lokhttp3/OkHttpClient;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "findConnection", "Lokhttp3/internal/connection/RealConnection;", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "connectionRetryEnabled", "", "findHealthyConnection", "doExtensiveHealthChecks", "retryAfterFailure", "retryRoute", "sameHostAndPort", "url", "Lokhttp3/HttpUrl;", "trackFailure", "", "e", "Ljava/io/IOException;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExchangeFinder {
    private final okhttp3.Address address;
    private final okhttp3.internal.connection.RealCall call;
    private final okhttp3.internal.connection.RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final okhttp3.EventListener eventListener;
    private okhttp3.Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private okhttp3.internal.connection.RouteSelector.Selection routeSelection;
    private okhttp3.internal.connection.RouteSelector routeSelector;

    public ExchangeFinder(okhttp3.internal.connection.RealConnectionPool r2, okhttp3.Address r3, okhttp3.internal.connection.RealCall r4, okhttp3.EventListener r5) {
            r1 = this;
            java.lang.String r0 = "connectionPool"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.connectionPool = r2
            r1.address = r3
            r1.call = r4
            r1.eventListener = r5
            return
    }

    private final okhttp3.internal.connection.RealConnection findConnection(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
            r14 = this;
            r1 = r14
            okhttp3.internal.connection.RealCall r0 = r1.call
            boolean r0 = r0.isCanceled()
            if (r0 != 0) goto L191
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r2 = r0.getConnection()
            r3 = 0
            if (r2 == 0) goto L62
            monitor-enter(r2)
            boolean r0 = r2.getNoNewExchanges()     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L2e
            okhttp3.Route r0 = r2.route()     // Catch: java.lang.Throwable -> L5f
            okhttp3.Address r0 = r0.address()     // Catch: java.lang.Throwable -> L5f
            okhttp3.HttpUrl r0 = r0.url()     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r14.sameHostAndPort(r0)     // Catch: java.lang.Throwable -> L5f
            if (r0 != 0) goto L2c
            goto L2e
        L2c:
            r0 = r3
            goto L34
        L2e:
            okhttp3.internal.connection.RealCall r0 = r1.call     // Catch: java.lang.Throwable -> L5f
            java.net.Socket r0 = r0.releaseConnectionNoEvents$okhttp()     // Catch: java.lang.Throwable -> L5f
        L34:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r2)
            okhttp3.internal.connection.RealCall r4 = r1.call
            okhttp3.internal.connection.RealConnection r4 = r4.getConnection()
            if (r4 == 0) goto L4e
            if (r0 != 0) goto L42
            return r2
        L42:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L4e:
            if (r0 == 0) goto L53
            okhttp3.internal.Util.closeQuietly(r0)
        L53:
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.internal.connection.RealCall r4 = r1.call
            okhttp3.Call r4 = (okhttp3.Call) r4
            okhttp3.Connection r2 = (okhttp3.Connection) r2
            r0.connectionReleased(r4, r2)
            goto L62
        L5f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L62:
            r0 = 0
            r1.refusedStreamCount = r0
            r1.connectionShutdownCount = r0
            r1.otherFailureCount = r0
            okhttp3.internal.connection.RealConnectionPool r2 = r1.connectionPool
            okhttp3.Address r4 = r1.address
            okhttp3.internal.connection.RealCall r5 = r1.call
            boolean r2 = r2.callAcquirePooledConnection(r4, r5, r3, r0)
            if (r2 == 0) goto L8b
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okhttp3.EventListener r2 = r1.eventListener
            okhttp3.internal.connection.RealCall r3 = r1.call
            okhttp3.Call r3 = (okhttp3.Call) r3
            r4 = r0
            okhttp3.Connection r4 = (okhttp3.Connection) r4
            r2.connectionAcquired(r3, r4)
            return r0
        L8b:
            okhttp3.Route r2 = r1.nextRouteToTry
            if (r2 == 0) goto L96
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r1.nextRouteToTry = r3
        L94:
            r4 = r3
            goto L102
        L96:
            okhttp3.internal.connection.RouteSelector$Selection r2 = r1.routeSelection
            if (r2 == 0) goto Lad
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto Lad
            okhttp3.internal.connection.RouteSelector$Selection r0 = r1.routeSelection
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okhttp3.Route r2 = r0.next()
            goto L94
        Lad:
            okhttp3.internal.connection.RouteSelector r2 = r1.routeSelector
            if (r2 != 0) goto Lca
            okhttp3.internal.connection.RouteSelector r2 = new okhttp3.internal.connection.RouteSelector
            okhttp3.Address r4 = r1.address
            okhttp3.internal.connection.RealCall r5 = r1.call
            okhttp3.OkHttpClient r5 = r5.getClient()
            okhttp3.internal.connection.RouteDatabase r5 = r5.getRouteDatabase()
            okhttp3.internal.connection.RealCall r6 = r1.call
            okhttp3.Call r6 = (okhttp3.Call) r6
            okhttp3.EventListener r7 = r1.eventListener
            r2.<init>(r4, r5, r6, r7)
            r1.routeSelector = r2
        Lca:
            okhttp3.internal.connection.RouteSelector$Selection r2 = r2.next()
            r1.routeSelection = r2
            java.util.List r4 = r2.getRoutes()
            okhttp3.internal.connection.RealCall r5 = r1.call
            boolean r5 = r5.isCanceled()
            if (r5 != 0) goto L189
            okhttp3.internal.connection.RealConnectionPool r5 = r1.connectionPool
            okhttp3.Address r6 = r1.address
            okhttp3.internal.connection.RealCall r7 = r1.call
            boolean r0 = r5.callAcquirePooledConnection(r6, r7, r4, r0)
            if (r0 == 0) goto Lfe
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            okhttp3.EventListener r2 = r1.eventListener
            okhttp3.internal.connection.RealCall r3 = r1.call
            okhttp3.Call r3 = (okhttp3.Call) r3
            r4 = r0
            okhttp3.Connection r4 = (okhttp3.Connection) r4
            r2.connectionAcquired(r3, r4)
            return r0
        Lfe:
            okhttp3.Route r2 = r2.next()
        L102:
            okhttp3.internal.connection.RealConnection r13 = new okhttp3.internal.connection.RealConnection
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool
            r13.<init>(r0, r2)
            okhttp3.internal.connection.RealCall r0 = r1.call
            r0.setConnectionToCancel(r13)
            okhttp3.internal.connection.RealCall r0 = r1.call     // Catch: java.lang.Throwable -> L182
            r11 = r0
            okhttp3.Call r11 = (okhttp3.Call) r11     // Catch: java.lang.Throwable -> L182
            okhttp3.EventListener r12 = r1.eventListener     // Catch: java.lang.Throwable -> L182
            r5 = r13
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r5.connect(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L182
            okhttp3.internal.connection.RealCall r0 = r1.call
            r0.setConnectionToCancel(r3)
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.OkHttpClient r0 = r0.getClient()
            okhttp3.internal.connection.RouteDatabase r0 = r0.getRouteDatabase()
            okhttp3.Route r3 = r13.route()
            r0.connected(r3)
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool
            okhttp3.Address r3 = r1.address
            okhttp3.internal.connection.RealCall r5 = r1.call
            r6 = 1
            boolean r0 = r0.callAcquirePooledConnection(r3, r5, r4, r6)
            if (r0 == 0) goto L164
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1.nextRouteToTry = r2
            java.net.Socket r2 = r13.socket()
            okhttp3.internal.Util.closeQuietly(r2)
            okhttp3.EventListener r2 = r1.eventListener
            okhttp3.internal.connection.RealCall r3 = r1.call
            okhttp3.Call r3 = (okhttp3.Call) r3
            r4 = r0
            okhttp3.Connection r4 = (okhttp3.Connection) r4
            r2.connectionAcquired(r3, r4)
            return r0
        L164:
            monitor-enter(r13)
            okhttp3.internal.connection.RealConnectionPool r0 = r1.connectionPool     // Catch: java.lang.Throwable -> L17f
            r0.put(r13)     // Catch: java.lang.Throwable -> L17f
            okhttp3.internal.connection.RealCall r0 = r1.call     // Catch: java.lang.Throwable -> L17f
            r0.acquireConnectionNoEvents(r13)     // Catch: java.lang.Throwable -> L17f
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L17f
            monitor-exit(r13)
            okhttp3.EventListener r0 = r1.eventListener
            okhttp3.internal.connection.RealCall r2 = r1.call
            okhttp3.Call r2 = (okhttp3.Call) r2
            r3 = r13
            okhttp3.Connection r3 = (okhttp3.Connection) r3
            r0.connectionAcquired(r2, r3)
            return r13
        L17f:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L182:
            r0 = move-exception
            okhttp3.internal.connection.RealCall r2 = r1.call
            r2.setConnectionToCancel(r3)
            throw r0
        L189:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L191:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
    }

    private final okhttp3.internal.connection.RealConnection findHealthyConnection(int r3, int r4, int r5, int r6, boolean r7, boolean r8) throws java.io.IOException {
            r2 = this;
        L0:
            okhttp3.internal.connection.RealConnection r0 = r2.findConnection(r3, r4, r5, r6, r7)
            boolean r1 = r0.isHealthy(r8)
            if (r1 == 0) goto Lb
            return r0
        Lb:
            r0.noNewExchanges$okhttp()
            okhttp3.Route r0 = r2.nextRouteToTry
            if (r0 != 0) goto L0
            okhttp3.internal.connection.RouteSelector$Selection r0 = r2.routeSelection
            r1 = 1
            if (r0 == 0) goto L1c
            boolean r0 = r0.hasNext()
            goto L1d
        L1c:
            r0 = r1
        L1d:
            if (r0 != 0) goto L0
            okhttp3.internal.connection.RouteSelector r0 = r2.routeSelector
            if (r0 == 0) goto L27
            boolean r1 = r0.hasNext()
        L27:
            if (r1 == 0) goto L2a
            goto L0
        L2a:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "exhausted all routes"
            r3.<init>(r4)
            throw r3
    }

    private final okhttp3.Route retryRoute() {
            r4 = this;
            int r0 = r4.refusedStreamCount
            r1 = 0
            r2 = 1
            if (r0 > r2) goto L44
            int r0 = r4.connectionShutdownCount
            if (r0 > r2) goto L44
            int r0 = r4.otherFailureCount
            if (r0 <= 0) goto Lf
            goto L44
        Lf:
            okhttp3.internal.connection.RealCall r0 = r4.call
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection()
            if (r0 != 0) goto L18
            return r1
        L18:
            monitor-enter(r0)
            int r2 = r0.getRouteFailureCount$okhttp()     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L21
            monitor-exit(r0)
            return r1
        L21:
            okhttp3.Route r2 = r0.route()     // Catch: java.lang.Throwable -> L41
            okhttp3.Address r2 = r2.address()     // Catch: java.lang.Throwable -> L41
            okhttp3.HttpUrl r2 = r2.url()     // Catch: java.lang.Throwable -> L41
            okhttp3.Address r3 = r4.address     // Catch: java.lang.Throwable -> L41
            okhttp3.HttpUrl r3 = r3.url()     // Catch: java.lang.Throwable -> L41
            boolean r2 = okhttp3.internal.Util.canReuseConnectionFor(r2, r3)     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L3b
            monitor-exit(r0)
            return r1
        L3b:
            okhttp3.Route r1 = r0.route()     // Catch: java.lang.Throwable -> L41
            monitor-exit(r0)
            return r1
        L41:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L44:
            return r1
    }

    public final okhttp3.internal.http.ExchangeCodec find(okhttp3.OkHttpClient r9, okhttp3.internal.http.RealInterceptorChain r10) {
            r8 = this;
            java.lang.String r0 = "client"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r2 = r10.getConnectTimeoutMillis$okhttp()     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            int r3 = r10.getReadTimeoutMillis$okhttp()     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            int r4 = r10.getWriteTimeoutMillis$okhttp()     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            int r5 = r9.pingIntervalMillis()     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            boolean r6 = r9.retryOnConnectionFailure()     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            okhttp3.Request r0 = r10.getRequest$okhttp()     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            java.lang.String r0 = r0.method()     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            java.lang.String r1 = "GET"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            r7 = r0 ^ 1
            r1 = r8
            okhttp3.internal.connection.RealConnection r0 = r1.findHealthyConnection(r2, r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            okhttp3.internal.http.ExchangeCodec r9 = r0.newCodec$okhttp(r9, r10)     // Catch: java.io.IOException -> L38 okhttp3.internal.connection.RouteException -> L42
            return r9
        L38:
            r9 = move-exception
            r8.trackFailure(r9)
            okhttp3.internal.connection.RouteException r10 = new okhttp3.internal.connection.RouteException
            r10.<init>(r9)
            throw r10
        L42:
            r9 = move-exception
            java.io.IOException r10 = r9.getLastConnectException()
            r8.trackFailure(r10)
            throw r9
    }

    public final okhttp3.Address getAddress$okhttp() {
            r1 = this;
            okhttp3.Address r0 = r1.address
            return r0
    }

    public final boolean retryAfterFailure() {
            r2 = this;
            int r0 = r2.refusedStreamCount
            if (r0 != 0) goto Le
            int r0 = r2.connectionShutdownCount
            if (r0 != 0) goto Le
            int r0 = r2.otherFailureCount
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            okhttp3.Route r0 = r2.nextRouteToTry
            r1 = 1
            if (r0 == 0) goto L14
            return r1
        L14:
            okhttp3.Route r0 = r2.retryRoute()
            if (r0 == 0) goto L1d
            r2.nextRouteToTry = r0
            return r1
        L1d:
            okhttp3.internal.connection.RouteSelector$Selection r0 = r2.routeSelection
            if (r0 == 0) goto L28
            boolean r0 = r0.hasNext()
            if (r0 != r1) goto L28
            return r1
        L28:
            okhttp3.internal.connection.RouteSelector r0 = r2.routeSelector
            if (r0 != 0) goto L2d
            return r1
        L2d:
            boolean r0 = r0.hasNext()
            return r0
    }

    public final boolean sameHostAndPort(okhttp3.HttpUrl r4) {
            r3 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okhttp3.Address r0 = r3.address
            okhttp3.HttpUrl r0 = r0.url()
            int r1 = r4.port()
            int r2 = r0.port()
            if (r1 != r2) goto L25
            java.lang.String r4 = r4.host()
            java.lang.String r0 = r0.host()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
            if (r4 == 0) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            return r4
    }

    public final void trackFailure(java.io.IOException r3) {
            r2 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r2.nextRouteToTry = r0
            boolean r0 = r3 instanceof okhttp3.internal.http2.StreamResetException
            if (r0 == 0) goto L1c
            r0 = r3
            okhttp3.internal.http2.StreamResetException r0 = (okhttp3.internal.http2.StreamResetException) r0
            okhttp3.internal.http2.ErrorCode r0 = r0.errorCode
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
            if (r0 != r1) goto L1c
            int r3 = r2.refusedStreamCount
            int r3 = r3 + 1
            r2.refusedStreamCount = r3
            goto L2d
        L1c:
            boolean r3 = r3 instanceof okhttp3.internal.http2.ConnectionShutdownException
            if (r3 == 0) goto L27
            int r3 = r2.connectionShutdownCount
            int r3 = r3 + 1
            r2.connectionShutdownCount = r3
            goto L2d
        L27:
            int r3 = r2.otherFailureCount
            int r3 = r3 + 1
            r2.otherFailureCount = r3
        L2d:
            return
    }
}
