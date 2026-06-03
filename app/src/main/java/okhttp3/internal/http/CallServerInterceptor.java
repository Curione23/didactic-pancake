package okhttp3.internal.http;

/* JADX INFO: compiled from: CallServerInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "code", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CallServerInterceptor implements okhttp3.Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.forWebSocket = r1
            return
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int r3) {
            r2 = this;
            r0 = 100
            r1 = 1
            if (r3 != r0) goto L6
            goto L10
        L6:
            r0 = 102(0x66, float:1.43E-43)
            if (r0 > r3) goto Lf
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 >= r0) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r15) throws java.io.IOException {
            r14 = this;
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "close"
            java.lang.String r2 = "HTTP "
            java.lang.String r3 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r3)
            okhttp3.internal.http.RealInterceptorChain r15 = (okhttp3.internal.http.RealInterceptorChain) r15
            okhttp3.internal.connection.Exchange r3 = r15.getExchange$okhttp()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okhttp3.Request r15 = r15.getRequest$okhttp()
            okhttp3.RequestBody r4 = r15.body()
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 0
            r8 = 1
            r9 = 0
            r3.writeRequestHeaders(r15)     // Catch: java.io.IOException -> L9c
            java.lang.String r10 = r15.method()     // Catch: java.io.IOException -> L9c
            boolean r10 = okhttp3.internal.http.HttpMethod.permitsRequestBody(r10)     // Catch: java.io.IOException -> L9c
            if (r10 == 0) goto L88
            if (r4 == 0) goto L88
            java.lang.String r10 = "100-continue"
            java.lang.String r11 = "Expect"
            java.lang.String r11 = r15.header(r11)     // Catch: java.io.IOException -> L9c
            boolean r10 = kotlin.text.StringsKt.equals(r10, r11, r8)     // Catch: java.io.IOException -> L9c
            if (r10 == 0) goto L4f
            r3.flushRequest()     // Catch: java.io.IOException -> L9c
            okhttp3.Response$Builder r10 = r3.readResponseHeaders(r8)     // Catch: java.io.IOException -> L9c
            r3.responseHeadersStart()     // Catch: java.io.IOException -> L4c
            r11 = r7
            goto L51
        L4c:
            r4 = move-exception
            r11 = r8
            goto L9f
        L4f:
            r11 = r8
            r10 = r9
        L51:
            if (r10 != 0) goto L77
            boolean r12 = r4.isDuplex()     // Catch: java.io.IOException -> L9a
            if (r12 == 0) goto L68
            r3.flushRequest()     // Catch: java.io.IOException -> L9a
            okio.Sink r12 = r3.createRequestBody(r15, r8)     // Catch: java.io.IOException -> L9a
            okio.BufferedSink r12 = okio.Okio.buffer(r12)     // Catch: java.io.IOException -> L9a
            r4.writeTo(r12)     // Catch: java.io.IOException -> L9a
            goto L8d
        L68:
            okio.Sink r12 = r3.createRequestBody(r15, r7)     // Catch: java.io.IOException -> L9a
            okio.BufferedSink r12 = okio.Okio.buffer(r12)     // Catch: java.io.IOException -> L9a
            r4.writeTo(r12)     // Catch: java.io.IOException -> L9a
            r12.close()     // Catch: java.io.IOException -> L9a
            goto L8d
        L77:
            r3.noRequestBody()     // Catch: java.io.IOException -> L9a
            okhttp3.internal.connection.RealConnection r12 = r3.getConnection$okhttp()     // Catch: java.io.IOException -> L9a
            boolean r12 = r12.isMultiplexed$okhttp()     // Catch: java.io.IOException -> L9a
            if (r12 != 0) goto L8d
            r3.noNewExchangesOnConnection()     // Catch: java.io.IOException -> L9a
            goto L8d
        L88:
            r3.noRequestBody()     // Catch: java.io.IOException -> L9c
            r11 = r8
            r10 = r9
        L8d:
            if (r4 == 0) goto L95
            boolean r4 = r4.isDuplex()     // Catch: java.io.IOException -> L9a
            if (r4 != 0) goto L98
        L95:
            r3.finishRequest()     // Catch: java.io.IOException -> L9a
        L98:
            r4 = r9
            goto La9
        L9a:
            r4 = move-exception
            goto L9f
        L9c:
            r4 = move-exception
            r11 = r8
            r10 = r9
        L9f:
            boolean r12 = r4 instanceof okhttp3.internal.http2.ConnectionShutdownException
            if (r12 != 0) goto L1ad
            boolean r12 = r3.getHasFailure$okhttp()
            if (r12 == 0) goto L1ac
        La9:
            if (r10 != 0) goto Lb8
            okhttp3.Response$Builder r10 = r3.readResponseHeaders(r7)     // Catch: java.io.IOException -> L19f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)     // Catch: java.io.IOException -> L19f
            if (r11 == 0) goto Lb8
            r3.responseHeadersStart()     // Catch: java.io.IOException -> L19f
            r11 = r7
        Lb8:
            okhttp3.Response$Builder r10 = r10.request(r15)     // Catch: java.io.IOException -> L19f
            okhttp3.internal.connection.RealConnection r12 = r3.getConnection$okhttp()     // Catch: java.io.IOException -> L19f
            okhttp3.Handshake r12 = r12.handshake()     // Catch: java.io.IOException -> L19f
            okhttp3.Response$Builder r10 = r10.handshake(r12)     // Catch: java.io.IOException -> L19f
            okhttp3.Response$Builder r10 = r10.sentRequestAtMillis(r5)     // Catch: java.io.IOException -> L19f
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L19f
            okhttp3.Response$Builder r10 = r10.receivedResponseAtMillis(r12)     // Catch: java.io.IOException -> L19f
            okhttp3.Response r10 = r10.build()     // Catch: java.io.IOException -> L19f
            int r12 = r10.code()     // Catch: java.io.IOException -> L19f
            boolean r13 = r14.shouldIgnoreAndWaitForRealResponse(r12)     // Catch: java.io.IOException -> L19f
            if (r13 == 0) goto L112
            okhttp3.Response$Builder r7 = r3.readResponseHeaders(r7)     // Catch: java.io.IOException -> L19f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)     // Catch: java.io.IOException -> L19f
            if (r11 == 0) goto Lee
            r3.responseHeadersStart()     // Catch: java.io.IOException -> L19f
        Lee:
            okhttp3.Response$Builder r15 = r7.request(r15)     // Catch: java.io.IOException -> L19f
            okhttp3.internal.connection.RealConnection r7 = r3.getConnection$okhttp()     // Catch: java.io.IOException -> L19f
            okhttp3.Handshake r7 = r7.handshake()     // Catch: java.io.IOException -> L19f
            okhttp3.Response$Builder r15 = r15.handshake(r7)     // Catch: java.io.IOException -> L19f
            okhttp3.Response$Builder r15 = r15.sentRequestAtMillis(r5)     // Catch: java.io.IOException -> L19f
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L19f
            okhttp3.Response$Builder r15 = r15.receivedResponseAtMillis(r5)     // Catch: java.io.IOException -> L19f
            okhttp3.Response r10 = r15.build()     // Catch: java.io.IOException -> L19f
            int r12 = r10.code()     // Catch: java.io.IOException -> L19f
        L112:
            r3.responseHeadersEnd(r10)     // Catch: java.io.IOException -> L19f
            boolean r15 = r14.forWebSocket     // Catch: java.io.IOException -> L19f
            if (r15 == 0) goto L12c
            r15 = 101(0x65, float:1.42E-43)
            if (r12 != r15) goto L12c
            okhttp3.Response$Builder r15 = r10.newBuilder()     // Catch: java.io.IOException -> L19f
            okhttp3.ResponseBody r5 = okhttp3.internal.Util.EMPTY_RESPONSE     // Catch: java.io.IOException -> L19f
            okhttp3.Response$Builder r15 = r15.body(r5)     // Catch: java.io.IOException -> L19f
            okhttp3.Response r15 = r15.build()     // Catch: java.io.IOException -> L19f
            goto L13c
        L12c:
            okhttp3.Response$Builder r15 = r10.newBuilder()     // Catch: java.io.IOException -> L19f
            okhttp3.ResponseBody r5 = r3.openResponseBody(r10)     // Catch: java.io.IOException -> L19f
            okhttp3.Response$Builder r15 = r15.body(r5)     // Catch: java.io.IOException -> L19f
            okhttp3.Response r15 = r15.build()     // Catch: java.io.IOException -> L19f
        L13c:
            okhttp3.Request r5 = r15.request()     // Catch: java.io.IOException -> L19f
            java.lang.String r5 = r5.header(r0)     // Catch: java.io.IOException -> L19f
            boolean r5 = kotlin.text.StringsKt.equals(r1, r5, r8)     // Catch: java.io.IOException -> L19f
            if (r5 != 0) goto L155
            r5 = 2
            java.lang.String r0 = okhttp3.Response.header$default(r15, r0, r9, r5, r9)     // Catch: java.io.IOException -> L19f
            boolean r0 = kotlin.text.StringsKt.equals(r1, r0, r8)     // Catch: java.io.IOException -> L19f
            if (r0 == 0) goto L158
        L155:
            r3.noNewExchangesOnConnection()     // Catch: java.io.IOException -> L19f
        L158:
            r0 = 204(0xcc, float:2.86E-43)
            if (r12 == r0) goto L160
            r0 = 205(0xcd, float:2.87E-43)
            if (r12 != r0) goto L19e
        L160:
            okhttp3.ResponseBody r0 = r15.body()     // Catch: java.io.IOException -> L19f
            if (r0 == 0) goto L16b
            long r0 = r0.contentLength()     // Catch: java.io.IOException -> L19f
            goto L16d
        L16b:
            r0 = -1
        L16d:
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L19e
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch: java.io.IOException -> L19f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L19f
            r1.<init>(r2)     // Catch: java.io.IOException -> L19f
            java.lang.StringBuilder r1 = r1.append(r12)     // Catch: java.io.IOException -> L19f
            java.lang.String r2 = " had non-zero Content-Length: "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.IOException -> L19f
            okhttp3.ResponseBody r15 = r15.body()     // Catch: java.io.IOException -> L19f
            if (r15 == 0) goto L192
            long r2 = r15.contentLength()     // Catch: java.io.IOException -> L19f
            java.lang.Long r9 = java.lang.Long.valueOf(r2)     // Catch: java.io.IOException -> L19f
        L192:
            java.lang.StringBuilder r15 = r1.append(r9)     // Catch: java.io.IOException -> L19f
            java.lang.String r15 = r15.toString()     // Catch: java.io.IOException -> L19f
            r0.<init>(r15)     // Catch: java.io.IOException -> L19f
            throw r0     // Catch: java.io.IOException -> L19f
        L19e:
            return r15
        L19f:
            r15 = move-exception
            if (r4 == 0) goto L1ab
            r0 = r4
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            kotlin.ExceptionsKt.addSuppressed(r0, r15)
            throw r4
        L1ab:
            throw r15
        L1ac:
            throw r4
        L1ad:
            throw r4
    }
}
