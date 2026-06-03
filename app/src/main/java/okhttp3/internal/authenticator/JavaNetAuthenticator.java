package okhttp3.internal.authenticator;

/* JADX INFO: compiled from: JavaNetAuthenticator.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/authenticator/JavaNetAuthenticator;", "Lokhttp3/Authenticator;", "defaultDns", "Lokhttp3/Dns;", "(Lokhttp3/Dns;)V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "connectToInetAddress", "Ljava/net/InetAddress;", "Ljava/net/Proxy;", "url", "Lokhttp3/HttpUrl;", "dns", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JavaNetAuthenticator implements okhttp3.Authenticator {
    private final okhttp3.Dns defaultDns;

    /* JADX INFO: compiled from: JavaNetAuthenticator.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                java.net.Proxy$Type[] r0 = java.net.Proxy.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                okhttp3.internal.authenticator.JavaNetAuthenticator.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public JavaNetAuthenticator() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public JavaNetAuthenticator(okhttp3.Dns r2) {
            r1 = this;
            java.lang.String r0 = "defaultDns"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.defaultDns = r2
            return
    }

    public /* synthetic */ JavaNetAuthenticator(okhttp3.Dns r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            okhttp3.Dns r1 = okhttp3.Dns.SYSTEM
        L6:
            r0.<init>(r1)
            return
    }

    private final java.net.InetAddress connectToInetAddress(java.net.Proxy r3, okhttp3.HttpUrl r4, okhttp3.Dns r5) throws java.io.IOException {
            r2 = this;
            java.net.Proxy$Type r0 = r3.type()
            if (r0 != 0) goto L8
            r0 = -1
            goto L10
        L8:
            int[] r1 = okhttp3.internal.authenticator.JavaNetAuthenticator.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L10:
            r1 = 1
            if (r0 != r1) goto L22
            java.lang.String r3 = r4.host()
            java.util.List r3 = r5.lookup(r3)
            java.lang.Object r3 = kotlin.collections.CollectionsKt.first(r3)
            java.net.InetAddress r3 = (java.net.InetAddress) r3
            goto L36
        L22:
            java.net.SocketAddress r3 = r3.address()
            java.lang.String r4 = "null cannot be cast to non-null type java.net.InetSocketAddress"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            java.net.InetSocketAddress r3 = (java.net.InetSocketAddress) r3
            java.net.InetAddress r3 = r3.getAddress()
            java.lang.String r4 = "address() as InetSocketAddress).address"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
        L36:
            return r3
    }

    @Override // okhttp3.Authenticator
    public okhttp3.Request authenticate(okhttp3.Route r20, okhttp3.Response r21) throws java.io.IOException {
            r19 = this;
            r0 = r19
            java.lang.String r1 = "response"
            r2 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.util.List r1 = r21.challenges()
            okhttp3.Request r3 = r21.request()
            okhttp3.HttpUrl r4 = r3.url()
            int r2 = r21.code()
            r5 = 407(0x197, float:5.7E-43)
            r6 = 1
            if (r2 != r5) goto L20
            r2 = r6
            goto L21
        L20:
            r2 = 0
        L21:
            if (r20 == 0) goto L29
            java.net.Proxy r5 = r20.proxy()
            if (r5 != 0) goto L2b
        L29:
            java.net.Proxy r5 = java.net.Proxy.NO_PROXY
        L2b:
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto Le9
            java.lang.Object r7 = r1.next()
            okhttp3.Challenge r7 = (okhttp3.Challenge) r7
            java.lang.String r8 = "Basic"
            java.lang.String r9 = r7.scheme()
            boolean r8 = kotlin.text.StringsKt.equals(r8, r9, r6)
            if (r8 != 0) goto L48
            goto L2f
        L48:
            if (r20 == 0) goto L56
            okhttp3.Address r8 = r20.address()
            if (r8 == 0) goto L56
            okhttp3.Dns r8 = r8.dns()
            if (r8 != 0) goto L58
        L56:
            okhttp3.Dns r8 = r0.defaultDns
        L58:
            java.lang.String r9 = "proxy"
            if (r2 == 0) goto L8d
            java.net.SocketAddress r10 = r5.address()
            java.lang.String r11 = "null cannot be cast to non-null type java.net.InetSocketAddress"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r11)
            java.net.InetSocketAddress r10 = (java.net.InetSocketAddress) r10
            java.lang.String r11 = r10.getHostName()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r9)
            java.net.InetAddress r12 = r0.connectToInetAddress(r5, r4, r8)
            int r13 = r10.getPort()
            java.lang.String r14 = r4.scheme()
            java.lang.String r15 = r7.realm()
            java.lang.String r16 = r7.scheme()
            java.net.URL r17 = r4.url()
            java.net.Authenticator$RequestorType r18 = java.net.Authenticator.RequestorType.PROXY
            java.net.PasswordAuthentication r8 = java.net.Authenticator.requestPasswordAuthentication(r11, r12, r13, r14, r15, r16, r17, r18)
            goto Lb4
        L8d:
            java.lang.String r10 = r4.host()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r9)
            java.net.InetAddress r8 = r0.connectToInetAddress(r5, r4, r8)
            int r11 = r4.port()
            java.lang.String r12 = r4.scheme()
            java.lang.String r13 = r7.realm()
            java.lang.String r14 = r7.scheme()
            java.net.URL r15 = r4.url()
            java.net.Authenticator$RequestorType r16 = java.net.Authenticator.RequestorType.SERVER
            r9 = r10
            r10 = r8
            java.net.PasswordAuthentication r8 = java.net.Authenticator.requestPasswordAuthentication(r9, r10, r11, r12, r13, r14, r15, r16)
        Lb4:
            if (r8 == 0) goto L2f
            if (r2 == 0) goto Lbb
            java.lang.String r1 = "Proxy-Authorization"
            goto Lbd
        Lbb:
            java.lang.String r1 = "Authorization"
        Lbd:
            java.lang.String r2 = r8.getUserName()
            java.lang.String r4 = "auth.userName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            char[] r4 = r8.getPassword()
            java.lang.String r5 = "auth.password"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r5 = new java.lang.String
            r5.<init>(r4)
            java.nio.charset.Charset r4 = r7.charset()
            java.lang.String r2 = okhttp3.Credentials.basic(r2, r5, r4)
            okhttp3.Request$Builder r3 = r3.newBuilder()
            okhttp3.Request$Builder r1 = r3.header(r1, r2)
            okhttp3.Request r1 = r1.build()
            return r1
        Le9:
            r1 = 0
            return r1
    }
}
