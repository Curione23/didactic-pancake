package okhttp3.internal.connection;

/* JADX INFO: compiled from: RouteSelector.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0002!\"B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0016H\u0086\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\t\u0010\u0018\u001a\u00020\u0019H\u0086\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\u001a\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lokhttp3/internal/connection/RouteSelector;", "", "address", "Lokhttp3/Address;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "call", "Lokhttp3/Call;", "eventListener", "Lokhttp3/EventListener;", "(Lokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/Call;Lokhttp3/EventListener;)V", "inetSocketAddresses", "", "Ljava/net/InetSocketAddress;", "nextProxyIndex", "", "postponedRoutes", "", "Lokhttp3/Route;", "proxies", "Ljava/net/Proxy;", "hasNext", "", "hasNextProxy", "next", "Lokhttp3/internal/connection/RouteSelector$Selection;", "nextProxy", "resetNextInetSocketAddress", "", "proxy", "resetNextProxy", "url", "Lokhttp3/HttpUrl;", "Companion", "Selection", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RouteSelector {
    public static final okhttp3.internal.connection.RouteSelector.Companion Companion = null;
    private final okhttp3.Address address;
    private final okhttp3.Call call;
    private final okhttp3.EventListener eventListener;
    private java.util.List<? extends java.net.InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final java.util.List<okhttp3.Route> postponedRoutes;
    private java.util.List<? extends java.net.Proxy> proxies;
    private final okhttp3.internal.connection.RouteDatabase routeDatabase;

    /* JADX INFO: compiled from: RouteSelector.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", "", "()V", "socketHost", "", "Ljava/net/InetSocketAddress;", "getSocketHost", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

        public final java.lang.String getSocketHost(java.net.InetSocketAddress r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.net.InetAddress r0 = r2.getAddress()
                if (r0 != 0) goto L15
                java.lang.String r2 = r2.getHostName()
                java.lang.String r0 = "hostName"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                return r2
            L15:
                java.lang.String r2 = r0.getHostAddress()
                java.lang.String r0 = "address.hostAddress"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                return r2
        }
    }

    /* JADX INFO: compiled from: RouteSelector.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u000bH\u0086\u0002J\t\u0010\f\u001a\u00020\u0004H\u0086\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", "", "routes", "", "Lokhttp3/Route;", "(Ljava/util/List;)V", "nextRouteIndex", "", "getRoutes", "()Ljava/util/List;", "hasNext", "", "next", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Selection {
        private int nextRouteIndex;
        private final java.util.List<okhttp3.Route> routes;

        public Selection(java.util.List<okhttp3.Route> r2) {
                r1 = this;
                java.lang.String r0 = "routes"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.routes = r2
                return
        }

        public final java.util.List<okhttp3.Route> getRoutes() {
                r1 = this;
                java.util.List<okhttp3.Route> r0 = r1.routes
                return r0
        }

        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.nextRouteIndex
                java.util.List<okhttp3.Route> r1 = r2.routes
                int r1 = r1.size()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public final okhttp3.Route next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L15
                java.util.List<okhttp3.Route> r0 = r3.routes
                int r1 = r3.nextRouteIndex
                int r2 = r1 + 1
                r3.nextRouteIndex = r2
                java.lang.Object r0 = r0.get(r1)
                okhttp3.Route r0 = (okhttp3.Route) r0
                return r0
            L15:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    static {
            okhttp3.internal.connection.RouteSelector$Companion r0 = new okhttp3.internal.connection.RouteSelector$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.connection.RouteSelector.Companion = r0
            return
    }

    public RouteSelector(okhttp3.Address r2, okhttp3.internal.connection.RouteDatabase r3, okhttp3.Call r4, okhttp3.EventListener r5) {
            r1 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "routeDatabase"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "eventListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.address = r2
            r1.routeDatabase = r3
            r1.call = r4
            r1.eventListener = r5
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            r1.proxies = r3
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            r1.inetSocketAddresses = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            r1.postponedRoutes = r3
            okhttp3.HttpUrl r3 = r2.url()
            java.net.Proxy r2 = r2.proxy()
            r1.resetNextProxy(r3, r2)
            return
    }

    private final boolean hasNextProxy() {
            r2 = this;
            int r0 = r2.nextProxyIndex
            java.util.List<? extends java.net.Proxy> r1 = r2.proxies
            int r1 = r1.size()
            if (r0 >= r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private final java.net.Proxy nextProxy() throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.hasNextProxy()
            if (r0 == 0) goto L18
            java.util.List<? extends java.net.Proxy> r0 = r3.proxies
            int r1 = r3.nextProxyIndex
            int r2 = r1 + 1
            r3.nextProxyIndex = r2
            java.lang.Object r0 = r0.get(r1)
            java.net.Proxy r0 = (java.net.Proxy) r0
            r3.resetNextInetSocketAddress(r0)
            return r0
        L18:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No route to "
            r1.<init>(r2)
            okhttp3.Address r2 = r3.address
            okhttp3.HttpUrl r2 = r2.url()
            java.lang.String r2 = r2.host()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "; exhausted proxy configurations: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.util.List<? extends java.net.Proxy> r2 = r3.proxies
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final void resetNextInetSocketAddress(java.net.Proxy r6) throws java.io.IOException {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r5.inetSocketAddresses = r0
            java.net.Proxy$Type r1 = r6.type()
            java.net.Proxy$Type r2 = java.net.Proxy.Type.DIRECT
            if (r1 == r2) goto L51
            java.net.Proxy$Type r1 = r6.type()
            java.net.Proxy$Type r2 = java.net.Proxy.Type.SOCKS
            if (r1 != r2) goto L1a
            goto L51
        L1a:
            java.net.SocketAddress r1 = r6.address()
            boolean r2 = r1 instanceof java.net.InetSocketAddress
            if (r2 == 0) goto L34
            okhttp3.internal.connection.RouteSelector$Companion r2 = okhttp3.internal.connection.RouteSelector.Companion
            java.lang.String r3 = "proxyAddress"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.net.InetSocketAddress r1 = (java.net.InetSocketAddress) r1
            java.lang.String r2 = r2.getSocketHost(r1)
            int r1 = r1.getPort()
            goto L65
        L34:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Proxy.address() is not an InetSocketAddress: "
            r6.<init>(r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L51:
            okhttp3.Address r1 = r5.address
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r2 = r1.host()
            okhttp3.Address r1 = r5.address
            okhttp3.HttpUrl r1 = r1.url()
            int r1 = r1.port()
        L65:
            r3 = 1
            if (r3 > r1) goto Leb
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r1 >= r3) goto Leb
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r3 = java.net.Proxy.Type.SOCKS
            if (r6 != r3) goto L7e
            java.util.Collection r0 = (java.util.Collection) r0
            java.net.InetSocketAddress r6 = java.net.InetSocketAddress.createUnresolved(r2, r1)
            r0.add(r6)
            goto Lc7
        L7e:
            boolean r6 = okhttp3.internal.Util.canParseAsIpAddress(r2)
            if (r6 == 0) goto L8d
            java.net.InetAddress r6 = java.net.InetAddress.getByName(r2)
            java.util.List r6 = kotlin.collections.CollectionsKt.listOf(r6)
            goto Lab
        L8d:
            okhttp3.EventListener r6 = r5.eventListener
            okhttp3.Call r3 = r5.call
            r6.dnsStart(r3, r2)
            okhttp3.Address r6 = r5.address
            okhttp3.Dns r6 = r6.dns()
            java.util.List r6 = r6.lookup(r2)
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto Lc8
            okhttp3.EventListener r3 = r5.eventListener
            okhttp3.Call r4 = r5.call
            r3.dnsEnd(r4, r2, r6)
        Lab:
            java.util.Iterator r6 = r6.iterator()
        Laf:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lc7
            java.lang.Object r2 = r6.next()
            java.net.InetAddress r2 = (java.net.InetAddress) r2
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            java.net.InetSocketAddress r4 = new java.net.InetSocketAddress
            r4.<init>(r2, r1)
            r3.add(r4)
            goto Laf
        Lc7:
            return
        Lc8:
            java.net.UnknownHostException r6 = new java.net.UnknownHostException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            okhttp3.Address r1 = r5.address
            okhttp3.Dns r1 = r1.dns()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " returned no addresses for "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        Leb:
            java.net.SocketException r6 = new java.net.SocketException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "No route to "
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r2)
            r2 = 58
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "; port is out of range"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    private final void resetNextProxy(okhttp3.HttpUrl r3, java.net.Proxy r4) {
            r2 = this;
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.Call r1 = r2.call
            r0.proxySelectStart(r1, r3)
            java.util.List r4 = resetNextProxy$selectProxies(r4, r3, r2)
            r2.proxies = r4
            r0 = 0
            r2.nextProxyIndex = r0
            okhttp3.EventListener r0 = r2.eventListener
            okhttp3.Call r1 = r2.call
            r0.proxySelectEnd(r1, r3, r4)
            return
    }

    private static final java.util.List<java.net.Proxy> resetNextProxy$selectProxies(java.net.Proxy r2, okhttp3.HttpUrl r3, okhttp3.internal.connection.RouteSelector r4) {
            if (r2 == 0) goto L7
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            return r2
        L7:
            java.net.URI r2 = r3.uri()
            java.lang.String r3 = r2.getHost()
            r0 = 0
            r1 = 1
            if (r3 != 0) goto L1e
            java.net.Proxy[] r2 = new java.net.Proxy[r1]
            java.net.Proxy r3 = java.net.Proxy.NO_PROXY
            r2[r0] = r3
            java.util.List r2 = okhttp3.internal.Util.immutableListOf(r2)
            return r2
        L1e:
            okhttp3.Address r3 = r4.address
            java.net.ProxySelector r3 = r3.proxySelector()
            java.util.List r2 = r3.select(r2)
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L3e
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L34
            goto L3e
        L34:
            java.lang.String r3 = "proxiesOrNull"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.util.List r2 = okhttp3.internal.Util.toImmutableList(r2)
            return r2
        L3e:
            java.net.Proxy[] r2 = new java.net.Proxy[r1]
            java.net.Proxy r3 = java.net.Proxy.NO_PROXY
            r2[r0] = r3
            java.util.List r2 = okhttp3.internal.Util.immutableListOf(r2)
            return r2
    }

    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.hasNextProxy()
            if (r0 != 0) goto L13
            java.util.List<okhttp3.Route> r0 = r1.postponedRoutes
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    public final okhttp3.internal.connection.RouteSelector.Selection next() throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        Ld:
            boolean r1 = r6.hasNextProxy()
            if (r1 == 0) goto L50
            java.net.Proxy r1 = r6.nextProxy()
            java.util.List<? extends java.net.InetSocketAddress> r2 = r6.inetSocketAddresses
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r2.next()
            java.net.InetSocketAddress r3 = (java.net.InetSocketAddress) r3
            okhttp3.Route r4 = new okhttp3.Route
            okhttp3.Address r5 = r6.address
            r4.<init>(r5, r1, r3)
            okhttp3.internal.connection.RouteDatabase r3 = r6.routeDatabase
            boolean r3 = r3.shouldPostpone(r4)
            if (r3 == 0) goto L40
            java.util.List<okhttp3.Route> r3 = r6.postponedRoutes
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r4)
            goto L1d
        L40:
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r4)
            goto L1d
        L47:
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Ld
        L50:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L65
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List<okhttp3.Route> r2 = r6.postponedRoutes
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.collections.CollectionsKt.addAll(r1, r2)
            java.util.List<okhttp3.Route> r1 = r6.postponedRoutes
            r1.clear()
        L65:
            okhttp3.internal.connection.RouteSelector$Selection r1 = new okhttp3.internal.connection.RouteSelector$Selection
            r1.<init>(r0)
            return r1
        L6b:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }
}
