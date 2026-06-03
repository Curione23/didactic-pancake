package okhttp3.internal.platform;

/* JADX INFO: compiled from: AndroidPlatform.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J-\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0011\u0010\u0014\u001a\r\u0012\t\u0012\u00070\u0015¢\u0006\u0002\b\u00160\u0006H\u0016J \u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u0013H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010 H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020(H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform;", "Lokhttp3/internal/platform/Platform;", "()V", "closeGuard", "Lokhttp3/internal/platform/android/CloseGuard;", "socketAdapters", "", "Lokhttp3/internal/platform/android/SocketAdapter;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "buildTrustRootIndex", "Lokhttp3/internal/tls/TrustRootIndex;", "configureTlsExtensions", "", "sslSocket", "Ljavax/net/ssl/SSLSocket;", "hostname", "", "protocols", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "connectSocket", "socket", "Ljava/net/Socket;", "address", "Ljava/net/InetSocketAddress;", "connectTimeout", "", "getSelectedProtocol", "getStackTraceForCloseable", "", "closer", "isCleartextTrafficPermitted", "", "logCloseableLeak", "message", "stackTrace", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Companion", "CustomTrustRootIndex", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidPlatform extends okhttp3.internal.platform.Platform {
    public static final okhttp3.internal.platform.AndroidPlatform.Companion Companion = null;
    private static final boolean isSupported = false;
    private final okhttp3.internal.platform.android.CloseGuard closeGuard;
    private final java.util.List<okhttp3.internal.platform.android.SocketAdapter> socketAdapters;

    /* JADX INFO: compiled from: AndroidPlatform.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$Companion;", "", "()V", "isSupported", "", "()Z", "buildIfSupported", "Lokhttp3/internal/platform/Platform;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

        public final okhttp3.internal.platform.Platform buildIfSupported() {
                r1 = this;
                boolean r0 = r1.isSupported()
                if (r0 == 0) goto Le
                okhttp3.internal.platform.AndroidPlatform r0 = new okhttp3.internal.platform.AndroidPlatform
                r0.<init>()
                okhttp3.internal.platform.Platform r0 = (okhttp3.internal.platform.Platform) r0
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public final boolean isSupported() {
                r1 = this;
                boolean r0 = okhttp3.internal.platform.AndroidPlatform.access$isSupported$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: AndroidPlatform.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\t\u0010\b\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/platform/AndroidPlatform$CustomTrustRootIndex;", "Lokhttp3/internal/tls/TrustRootIndex;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "findByIssuerAndSignatureMethod", "Ljava/lang/reflect/Method;", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "component1", "component2", "copy", "equals", "", "other", "", "findByIssuerAndSignature", "Ljava/security/cert/X509Certificate;", "cert", "hashCode", "", "toString", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CustomTrustRootIndex implements okhttp3.internal.tls.TrustRootIndex {
        private final java.lang.reflect.Method findByIssuerAndSignatureMethod;
        private final javax.net.ssl.X509TrustManager trustManager;

        public CustomTrustRootIndex(javax.net.ssl.X509TrustManager r2, java.lang.reflect.Method r3) {
                r1 = this;
                java.lang.String r0 = "trustManager"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "findByIssuerAndSignatureMethod"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.<init>()
                r1.trustManager = r2
                r1.findByIssuerAndSignatureMethod = r3
                return
        }

        private final javax.net.ssl.X509TrustManager component1() {
                r1 = this;
                javax.net.ssl.X509TrustManager r0 = r1.trustManager
                return r0
        }

        private final java.lang.reflect.Method component2() {
                r1 = this;
                java.lang.reflect.Method r0 = r1.findByIssuerAndSignatureMethod
                return r0
        }

        public static /* synthetic */ okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex copy$default(okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex r0, javax.net.ssl.X509TrustManager r1, java.lang.reflect.Method r2, int r3, java.lang.Object r4) {
                r4 = r3 & 1
                if (r4 == 0) goto L6
                javax.net.ssl.X509TrustManager r1 = r0.trustManager
            L6:
                r3 = r3 & 2
                if (r3 == 0) goto Lc
                java.lang.reflect.Method r2 = r0.findByIssuerAndSignatureMethod
            Lc:
                okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex r0 = r0.copy(r1, r2)
                return r0
        }

        public final okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex copy(javax.net.ssl.X509TrustManager r2, java.lang.reflect.Method r3) {
                r1 = this;
                java.lang.String r0 = "trustManager"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "findByIssuerAndSignatureMethod"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex r0 = new okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex
                r0.<init>(r2, r3)
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex r5 = (okhttp3.internal.platform.AndroidPlatform.CustomTrustRootIndex) r5
                javax.net.ssl.X509TrustManager r1 = r4.trustManager
                javax.net.ssl.X509TrustManager r3 = r5.trustManager
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.reflect.Method r1 = r4.findByIssuerAndSignatureMethod
                java.lang.reflect.Method r5 = r5.findByIssuerAndSignatureMethod
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        @Override // okhttp3.internal.tls.TrustRootIndex
        public java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate r3) {
                r2 = this;
                java.lang.String r0 = "cert"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.reflect.Method r0 = r2.findByIssuerAndSignatureMethod     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                javax.net.ssl.X509TrustManager r1 = r2.trustManager     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                java.lang.Object r3 = r0.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                java.lang.String r0 = "null cannot be cast to non-null type java.security.cert.TrustAnchor"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                java.security.cert.TrustAnchor r3 = (java.security.cert.TrustAnchor) r3     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                java.security.cert.X509Certificate r3 = r3.getTrustedCert()     // Catch: java.lang.reflect.InvocationTargetException -> L1d java.lang.IllegalAccessException -> L1f
                goto L1e
            L1d:
                r3 = 0
            L1e:
                return r3
            L1f:
                r3 = move-exception
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "unable to get issues and signature"
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                r0.<init>(r1, r3)
                throw r0
        }

        public int hashCode() {
                r2 = this;
                javax.net.ssl.X509TrustManager r0 = r2.trustManager
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.reflect.Method r1 = r2.findByIssuerAndSignatureMethod
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "CustomTrustRootIndex(trustManager="
                r0.<init>(r1)
                javax.net.ssl.X509TrustManager r1 = r2.trustManager
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", findByIssuerAndSignatureMethod="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.reflect.Method r1 = r2.findByIssuerAndSignatureMethod
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 41
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            okhttp3.internal.platform.AndroidPlatform$Companion r0 = new okhttp3.internal.platform.AndroidPlatform$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.platform.AndroidPlatform.Companion = r0
            okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion
            boolean r0 = r0.isAndroid()
            r1 = 0
            if (r0 != 0) goto L12
            goto L1a
        L12:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L19
            goto L1a
        L19:
            r1 = 1
        L1a:
            okhttp3.internal.platform.AndroidPlatform.isSupported = r1
            return
    }

    public AndroidPlatform() {
            r4 = this;
            r4.<init>()
            r0 = 4
            okhttp3.internal.platform.android.SocketAdapter[] r0 = new okhttp3.internal.platform.android.SocketAdapter[r0]
            okhttp3.internal.platform.android.StandardAndroidSocketAdapter$Companion r1 = okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion
            r2 = 0
            r3 = 1
            okhttp3.internal.platform.android.SocketAdapter r1 = okhttp3.internal.platform.android.StandardAndroidSocketAdapter.Companion.buildIfSupported$default(r1, r2, r3, r2)
            r2 = 0
            r0[r2] = r1
            okhttp3.internal.platform.android.DeferredSocketAdapter r1 = new okhttp3.internal.platform.android.DeferredSocketAdapter
            okhttp3.internal.platform.android.AndroidSocketAdapter$Companion r2 = okhttp3.internal.platform.android.AndroidSocketAdapter.Companion
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r2 = r2.getPlayProviderFactory()
            r1.<init>(r2)
            r0[r3] = r1
            okhttp3.internal.platform.android.DeferredSocketAdapter r1 = new okhttp3.internal.platform.android.DeferredSocketAdapter
            okhttp3.internal.platform.android.ConscryptSocketAdapter$Companion r2 = okhttp3.internal.platform.android.ConscryptSocketAdapter.Companion
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r2 = r2.getFactory()
            r1.<init>(r2)
            r2 = 2
            r0[r2] = r1
            okhttp3.internal.platform.android.DeferredSocketAdapter r1 = new okhttp3.internal.platform.android.DeferredSocketAdapter
            okhttp3.internal.platform.android.BouncyCastleSocketAdapter$Companion r2 = okhttp3.internal.platform.android.BouncyCastleSocketAdapter.Companion
            okhttp3.internal.platform.android.DeferredSocketAdapter$Factory r2 = r2.getFactory()
            r1.<init>(r2)
            r2 = 3
            r0[r2] = r1
            java.util.List r0 = kotlin.collections.CollectionsKt.listOfNotNull(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L4b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r0.next()
            r3 = r2
            okhttp3.internal.platform.android.SocketAdapter r3 = (okhttp3.internal.platform.android.SocketAdapter) r3
            boolean r3 = r3.isSupported()
            if (r3 == 0) goto L4b
            r1.add(r2)
            goto L4b
        L62:
            java.util.List r1 = (java.util.List) r1
            r4.socketAdapters = r1
            okhttp3.internal.platform.android.CloseGuard$Companion r0 = okhttp3.internal.platform.android.CloseGuard.Companion
            okhttp3.internal.platform.android.CloseGuard r0 = r0.get()
            r4.closeGuard = r0
            return
    }

    public static final /* synthetic */ boolean access$isSupported$cp() {
            boolean r0 = okhttp3.internal.platform.AndroidPlatform.isSupported
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public okhttp3.internal.tls.CertificateChainCleaner buildCertificateChainCleaner(javax.net.ssl.X509TrustManager r2) {
            r1 = this;
            java.lang.String r0 = "trustManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.internal.platform.android.AndroidCertificateChainCleaner$Companion r0 = okhttp3.internal.platform.android.AndroidCertificateChainCleaner.Companion
            okhttp3.internal.platform.android.AndroidCertificateChainCleaner r0 = r0.buildIfSupported(r2)
            if (r0 == 0) goto L10
            okhttp3.internal.tls.CertificateChainCleaner r0 = (okhttp3.internal.tls.CertificateChainCleaner) r0
            goto L14
        L10:
            okhttp3.internal.tls.CertificateChainCleaner r0 = super.buildCertificateChainCleaner(r2)
        L14:
            return r0
    }

    @Override // okhttp3.internal.platform.Platform
    public okhttp3.internal.tls.TrustRootIndex buildTrustRootIndex(javax.net.ssl.X509TrustManager r7) {
            r6 = this;
            java.lang.String r0 = "trustManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.String r1 = "findTrustAnchorByIssuerAndSignature"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Class<java.security.cert.X509Certificate> r4 = java.security.cert.X509Certificate.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.NoSuchMethodException -> L27
            r0.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L27
            okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex r1 = new okhttp3.internal.platform.AndroidPlatform$CustomTrustRootIndex     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.String r2 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch: java.lang.NoSuchMethodException -> L27
            r1.<init>(r7, r0)     // Catch: java.lang.NoSuchMethodException -> L27
            okhttp3.internal.tls.TrustRootIndex r1 = (okhttp3.internal.tls.TrustRootIndex) r1     // Catch: java.lang.NoSuchMethodException -> L27
            goto L2b
        L27:
            okhttp3.internal.tls.TrustRootIndex r1 = super.buildTrustRootIndex(r7)
        L2b:
            return r1
    }

    @Override // okhttp3.internal.platform.Platform
    public void configureTlsExtensions(javax.net.ssl.SSLSocket r4, java.lang.String r5, java.util.List<okhttp3.Protocol> r6) {
            r3 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "protocols"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.List<okhttp3.internal.platform.android.SocketAdapter> r0 = r3.socketAdapters
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            r2 = r1
            okhttp3.internal.platform.android.SocketAdapter r2 = (okhttp3.internal.platform.android.SocketAdapter) r2
            boolean r2 = r2.matchesSocket(r4)
            if (r2 == 0) goto L12
            goto L27
        L26:
            r1 = 0
        L27:
            okhttp3.internal.platform.android.SocketAdapter r1 = (okhttp3.internal.platform.android.SocketAdapter) r1
            if (r1 == 0) goto L2e
            r1.configureTlsExtensions(r4, r5, r6)
        L2e:
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public void connectSocket(java.net.Socket r2, java.net.InetSocketAddress r3, int r4) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "socket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.net.SocketAddress r3 = (java.net.SocketAddress) r3     // Catch: java.lang.ClassCastException -> L10
            r2.connect(r3, r4)     // Catch: java.lang.ClassCastException -> L10
            return
        L10:
            r2 = move-exception
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 != r4) goto L21
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "Exception in connect"
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r3.<init>(r4, r2)
            throw r3
        L21:
            throw r2
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.String getSelectedProtocol(javax.net.ssl.SSLSocket r5) {
            r4 = this;
            java.lang.String r0 = "sslSocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.List<okhttp3.internal.platform.android.SocketAdapter> r0 = r4.socketAdapters
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            r3 = r1
            okhttp3.internal.platform.android.SocketAdapter r3 = (okhttp3.internal.platform.android.SocketAdapter) r3
            boolean r3 = r3.matchesSocket(r5)
            if (r3 == 0) goto Ld
            goto L23
        L22:
            r1 = r2
        L23:
            okhttp3.internal.platform.android.SocketAdapter r1 = (okhttp3.internal.platform.android.SocketAdapter) r1
            if (r1 == 0) goto L2b
            java.lang.String r2 = r1.getSelectedProtocol(r5)
        L2b:
            return r2
    }

    @Override // okhttp3.internal.platform.Platform
    public java.lang.Object getStackTraceForCloseable(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "closer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.internal.platform.android.CloseGuard r0 = r1.closeGuard
            java.lang.Object r2 = r0.createAndOpen(r2)
            return r2
    }

    @Override // okhttp3.internal.platform.Platform
    public boolean isCleartextTrafficPermitted(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r2 = r0.isCleartextTrafficPermitted(r2)
            return r2
    }

    @Override // okhttp3.internal.platform.Platform
    public void logCloseableLeak(java.lang.String r7, java.lang.Object r8) {
            r6 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            okhttp3.internal.platform.android.CloseGuard r0 = r6.closeGuard
            boolean r8 = r0.warnIfOpen(r8)
            if (r8 != 0) goto L18
            r0 = r6
            okhttp3.internal.platform.Platform r0 = (okhttp3.internal.platform.Platform) r0
            r4 = 4
            r5 = 0
            r2 = 5
            r3 = 0
            r1 = r7
            okhttp3.internal.platform.Platform.log$default(r0, r1, r2, r3, r4, r5)
        L18:
            return
    }

    @Override // okhttp3.internal.platform.Platform
    public javax.net.ssl.X509TrustManager trustManager(javax.net.ssl.SSLSocketFactory r5) {
            r4 = this;
            java.lang.String r0 = "sslSocketFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.List<okhttp3.internal.platform.android.SocketAdapter> r0 = r4.socketAdapters
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            r3 = r1
            okhttp3.internal.platform.android.SocketAdapter r3 = (okhttp3.internal.platform.android.SocketAdapter) r3
            boolean r3 = r3.matchesSocketFactory(r5)
            if (r3 == 0) goto Ld
            goto L23
        L22:
            r1 = r2
        L23:
            okhttp3.internal.platform.android.SocketAdapter r1 = (okhttp3.internal.platform.android.SocketAdapter) r1
            if (r1 == 0) goto L2b
            javax.net.ssl.X509TrustManager r2 = r1.trustManager(r5)
        L2b:
            return r2
    }
}
