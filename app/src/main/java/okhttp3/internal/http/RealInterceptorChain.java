package okhttp3.internal.http;

/* JADX INFO: compiled from: RealInterceptorChain.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0002\u0010\u0010J\b\u0010\u0002\u001a\u00020\u001cH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010'\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\u0018\u0010(\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015¨\u0006)"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/Interceptor$Chain;", "call", "Lokhttp3/internal/connection/RealCall;", "interceptors", "", "Lokhttp3/Interceptor;", "index", "", "exchange", "Lokhttp3/internal/connection/Exchange;", "request", "Lokhttp3/Request;", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/Request;III)V", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "calls", "getConnectTimeoutMillis$okhttp", "()I", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "getReadTimeoutMillis$okhttp", "getRequest$okhttp", "()Lokhttp3/Request;", "getWriteTimeoutMillis$okhttp", "Lokhttp3/Call;", "connection", "Lokhttp3/Connection;", "copy", "copy$okhttp", "proceed", "Lokhttp3/Response;", "withConnectTimeout", "timeout", "unit", "Ljava/util/concurrent/TimeUnit;", "withReadTimeout", "withWriteTimeout", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RealInterceptorChain implements okhttp3.Interceptor.Chain {
    private final okhttp3.internal.connection.RealCall call;
    private int calls;
    private final int connectTimeoutMillis;
    private final okhttp3.internal.connection.Exchange exchange;
    private final int index;
    private final java.util.List<okhttp3.Interceptor> interceptors;
    private final int readTimeoutMillis;
    private final okhttp3.Request request;
    private final int writeTimeoutMillis;

    public RealInterceptorChain(okhttp3.internal.connection.RealCall r2, java.util.List<? extends okhttp3.Interceptor> r3, int r4, okhttp3.internal.connection.Exchange r5, okhttp3.Request r6, int r7, int r8, int r9) {
            r1 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "interceptors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r1.<init>()
            r1.call = r2
            r1.interceptors = r3
            r1.index = r4
            r1.exchange = r5
            r1.request = r6
            r1.connectTimeoutMillis = r7
            r1.readTimeoutMillis = r8
            r1.writeTimeoutMillis = r9
            return
    }

    public static /* synthetic */ okhttp3.internal.http.RealInterceptorChain copy$okhttp$default(okhttp3.internal.http.RealInterceptorChain r4, int r5, okhttp3.internal.connection.Exchange r6, okhttp3.Request r7, int r8, int r9, int r10, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            int r5 = r4.index
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            okhttp3.internal.connection.Exchange r6 = r4.exchange
        Lc:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L13
            okhttp3.Request r7 = r4.request
        L13:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L1a
            int r8 = r4.connectTimeoutMillis
        L1a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L21
            int r9 = r4.readTimeoutMillis
        L21:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L28
            int r10 = r4.writeTimeoutMillis
        L28:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            okhttp3.internal.http.RealInterceptorChain r4 = r6.copy$okhttp(r7, r8, r9, r10, r11, r12)
            return r4
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Call call() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.call
            okhttp3.Call r0 = (okhttp3.Call) r0
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    public int connectTimeoutMillis() {
            r1 = this;
            int r0 = r1.connectTimeoutMillis
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Connection connection() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            if (r0 == 0) goto L9
            okhttp3.internal.connection.RealConnection r0 = r0.getConnection$okhttp()
            goto La
        L9:
            r0 = 0
        La:
            okhttp3.Connection r0 = (okhttp3.Connection) r0
            return r0
    }

    public final okhttp3.internal.http.RealInterceptorChain copy$okhttp(int r12, okhttp3.internal.connection.Exchange r13, okhttp3.Request r14, int r15, int r16, int r17) {
            r11 = this;
            r0 = r11
            java.lang.String r1 = "request"
            r7 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            okhttp3.internal.http.RealInterceptorChain r1 = new okhttp3.internal.http.RealInterceptorChain
            okhttp3.internal.connection.RealCall r3 = r0.call
            java.util.List<okhttp3.Interceptor> r4 = r0.interceptors
            r2 = r1
            r5 = r12
            r6 = r13
            r8 = r15
            r9 = r16
            r10 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
    }

    public final okhttp3.internal.connection.RealCall getCall$okhttp() {
            r1 = this;
            okhttp3.internal.connection.RealCall r0 = r1.call
            return r0
    }

    public final int getConnectTimeoutMillis$okhttp() {
            r1 = this;
            int r0 = r1.connectTimeoutMillis
            return r0
    }

    public final okhttp3.internal.connection.Exchange getExchange$okhttp() {
            r1 = this;
            okhttp3.internal.connection.Exchange r0 = r1.exchange
            return r0
    }

    public final int getReadTimeoutMillis$okhttp() {
            r1 = this;
            int r0 = r1.readTimeoutMillis
            return r0
    }

    public final okhttp3.Request getRequest$okhttp() {
            r1 = this;
            okhttp3.Request r0 = r1.request
            return r0
    }

    public final int getWriteTimeoutMillis$okhttp() {
            r1 = this;
            int r0 = r1.writeTimeoutMillis
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Response proceed(okhttp3.Request r14) throws java.io.IOException {
            r13 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            int r0 = r13.index
            java.util.List<okhttp3.Interceptor> r1 = r13.interceptors
            int r1 = r1.size()
            if (r0 >= r1) goto L10c
            int r0 = r13.calls
            r1 = 1
            int r0 = r0 + r1
            r13.calls = r0
            okhttp3.internal.connection.Exchange r0 = r13.exchange
            java.lang.String r2 = " must call proceed() exactly once"
            java.lang.String r3 = "network interceptor "
            if (r0 == 0) goto L7a
            okhttp3.internal.connection.ExchangeFinder r0 = r0.getFinder$okhttp()
            okhttp3.HttpUrl r4 = r14.url()
            boolean r0 = r0.sameHostAndPort(r4)
            if (r0 == 0) goto L54
            int r0 = r13.calls
            if (r0 != r1) goto L30
            goto L7a
        L30:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r3)
            java.util.List<okhttp3.Interceptor> r0 = r13.interceptors
            int r3 = r13.index
            int r3 = r3 - r1
            java.lang.Object r0 = r0.get(r3)
            java.lang.StringBuilder r14 = r14.append(r0)
            java.lang.StringBuilder r14 = r14.append(r2)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L54:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r3)
            java.util.List<okhttp3.Interceptor> r0 = r13.interceptors
            int r2 = r13.index
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            java.lang.StringBuilder r14 = r14.append(r0)
            java.lang.String r0 = " must retain the same host and port"
            java.lang.StringBuilder r14 = r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L7a:
            int r0 = r13.index
            int r5 = r0 + 1
            r11 = 58
            r12 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r13
            r7 = r14
            okhttp3.internal.http.RealInterceptorChain r14 = copy$okhttp$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.List<okhttp3.Interceptor> r0 = r13.interceptors
            int r4 = r13.index
            java.lang.Object r0 = r0.get(r4)
            okhttp3.Interceptor r0 = (okhttp3.Interceptor) r0
            r4 = r14
            okhttp3.Interceptor$Chain r4 = (okhttp3.Interceptor.Chain) r4
            okhttp3.Response r4 = r0.intercept(r4)
            java.lang.String r5 = "interceptor "
            if (r4 == 0) goto Lf3
            okhttp3.internal.connection.Exchange r6 = r13.exchange
            if (r6 == 0) goto Lcf
            int r6 = r13.index
            int r6 = r6 + r1
            java.util.List<okhttp3.Interceptor> r7 = r13.interceptors
            int r7 = r7.size()
            if (r6 >= r7) goto Lcf
            int r14 = r14.calls
            if (r14 != r1) goto Lb4
            goto Lcf
        Lb4:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r3)
            java.lang.StringBuilder r14 = r14.append(r0)
            java.lang.StringBuilder r14 = r14.append(r2)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        Lcf:
            okhttp3.ResponseBody r14 = r4.body()
            if (r14 == 0) goto Ld6
            return r4
        Ld6:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r5)
            java.lang.StringBuilder r14 = r14.append(r0)
            java.lang.String r0 = " returned a response with no body"
            java.lang.StringBuilder r14 = r14.append(r0)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        Lf3:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " returned null"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L10c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
    }

    @Override // okhttp3.Interceptor.Chain
    public int readTimeoutMillis() {
            r1 = this;
            int r0 = r1.readTimeoutMillis
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Request request() {
            r1 = this;
            okhttp3.Request r0 = r1.request
            return r0
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Interceptor.Chain withConnectTimeout(int r13, java.util.concurrent.TimeUnit r14) {
            r12 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            okhttp3.internal.connection.Exchange r0 = r12.exchange
            if (r0 != 0) goto L20
            java.lang.String r0 = "connectTimeout"
            long r1 = (long) r13
            int r7 = okhttp3.internal.Util.checkDuration(r0, r1, r14)
            r10 = 55
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r3 = r12
            okhttp3.internal.http.RealInterceptorChain r13 = copy$okhttp$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            okhttp3.Interceptor$Chain r13 = (okhttp3.Interceptor.Chain) r13
            return r13
        L20:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Timeouts can't be adjusted in a network interceptor"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Interceptor.Chain withReadTimeout(int r13, java.util.concurrent.TimeUnit r14) {
            r12 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            okhttp3.internal.connection.Exchange r0 = r12.exchange
            if (r0 != 0) goto L20
            java.lang.String r0 = "readTimeout"
            long r1 = (long) r13
            int r8 = okhttp3.internal.Util.checkDuration(r0, r1, r14)
            r10 = 47
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r3 = r12
            okhttp3.internal.http.RealInterceptorChain r13 = copy$okhttp$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            okhttp3.Interceptor$Chain r13 = (okhttp3.Interceptor.Chain) r13
            return r13
        L20:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Timeouts can't be adjusted in a network interceptor"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
    }

    @Override // okhttp3.Interceptor.Chain
    public okhttp3.Interceptor.Chain withWriteTimeout(int r13, java.util.concurrent.TimeUnit r14) {
            r12 = this;
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            okhttp3.internal.connection.Exchange r0 = r12.exchange
            if (r0 != 0) goto L20
            java.lang.String r0 = "writeTimeout"
            long r1 = (long) r13
            int r9 = okhttp3.internal.Util.checkDuration(r0, r1, r14)
            r10 = 31
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r12
            okhttp3.internal.http.RealInterceptorChain r13 = copy$okhttp$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            okhttp3.Interceptor$Chain r13 = (okhttp3.Interceptor.Chain) r13
            return r13
        L20:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Timeouts can't be adjusted in a network interceptor"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
    }

    @Override // okhttp3.Interceptor.Chain
    public int writeTimeoutMillis() {
            r1 = this;
            int r0 = r1.writeTimeoutMillis
            return r0
    }
}
