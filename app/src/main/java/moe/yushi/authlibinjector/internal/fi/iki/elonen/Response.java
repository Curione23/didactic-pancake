package moe.yushi.authlibinjector.internal.fi.iki.elonen;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/fi/iki/elonen/Response.class */
public class Response implements java.io.Closeable {
    private moe.yushi.authlibinjector.internal.fi.iki.elonen.IStatus status;
    private java.lang.String mimeType;
    private java.io.InputStream data;
    private long contentLength;
    private final java.util.Map<java.lang.String, java.lang.String> headers;
    private java.lang.String requestMethod;
    private boolean chunkedTransfer;
    private boolean keepAlive;

    protected Response(moe.yushi.authlibinjector.internal.fi.iki.elonen.IStatus r7, java.lang.String r8, java.io.InputStream r9, long r10) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = r1
            r2.<init>()
            r0.headers = r1
            r0 = r6
            r1 = r7
            r0.status = r1
            r0 = r6
            r1 = r8
            r0.mimeType = r1
            r0 = r9
            if (r0 != 0) goto L33
            r0 = r6
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r2 = r1
            r3 = 0
            byte[] r3 = new byte[r3]
            r2.<init>(r3)
            r0.data = r1
            r0 = r6
            r1 = 0
            r0.contentLength = r1
            goto L3e
        L33:
            r0 = r6
            r1 = r9
            r0.data = r1
            r0 = r6
            r1 = r10
            r0.contentLength = r1
        L3e:
            r0 = r6
            r1 = r6
            long r1 = r1.contentLength
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L4c
            r1 = 1
            goto L4d
        L4c:
            r1 = 0
        L4d:
            r0.chunkedTransfer = r1
            r0 = r6
            r1 = 1
            r0.keepAlive = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            r0 = r2
            java.io.InputStream r0 = r0.data
            if (r0 == 0) goto Le
            r0 = r2
            java.io.InputStream r0 = r0.data
            r0.close()
        Le:
            return
    }

    public void addHeader(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.headers
            r1 = r5
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            r2 = r6
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    public java.lang.String getHeader(java.lang.String r5) {
            r4 = this;
            r0 = r4
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.headers
            r1 = r5
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.io.InputStream getData() {
            r2 = this;
            r0 = r2
            java.io.InputStream r0 = r0.data
            return r0
    }

    public java.lang.String getMimeType() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.mimeType
            return r0
    }

    public java.lang.String getRequestMethod() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.requestMethod
            return r0
    }

    public moe.yushi.authlibinjector.internal.fi.iki.elonen.IStatus getStatus() {
            r2 = this;
            r0 = r2
            moe.yushi.authlibinjector.internal.fi.iki.elonen.IStatus r0 = r0.status
            return r0
    }

    public void setKeepAlive(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.keepAlive = r1
            return
    }

    protected void send(java.io.OutputStream r12) throws java.io.IOException {
            r11 = this;
            r0 = r11
            moe.yushi.authlibinjector.internal.fi.iki.elonen.IStatus r0 = r0.status
            if (r0 != 0) goto L11
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "sendResponse(): Status can't be null."
            r1.<init>(r2)
            throw r0
        L11:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r1 = r0
            java.lang.String r2 = "E, d MMM yyyy HH:mm:ss 'GMT'"
            java.util.Locale r3 = java.util.Locale.US
            r1.<init>(r2, r3)
            r13 = r0
            r0 = r13
            java.lang.String r1 = "GMT"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r1 = r0
            java.io.BufferedWriter r2 = new java.io.BufferedWriter
            r3 = r2
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter
            r5 = r4
            r6 = r12
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ContentType r7 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.ContentType
            r8 = r7
            r9 = r11
            java.lang.String r9 = r9.mimeType
            r8.<init>(r9)
            java.lang.String r7 = r7.getEncoding()
            r5.<init>(r6, r7)
            r3.<init>(r4)
            r3 = 0
            r1.<init>(r2, r3)
            r14 = r0
            r0 = r14
            java.lang.String r1 = "HTTP/1.1 "
            java.io.PrintWriter r0 = r0.append(r1)
            r1 = r11
            moe.yushi.authlibinjector.internal.fi.iki.elonen.IStatus r1 = r1.status
            java.lang.String r1 = r1.getDescription()
            java.io.PrintWriter r0 = r0.append(r1)
            java.lang.String r1 = " \r\n"
            java.io.PrintWriter r0 = r0.append(r1)
            r0 = r11
            java.lang.String r0 = r0.mimeType
            if (r0 == 0) goto L77
            r0 = r11
            r1 = r14
            java.lang.String r2 = "Content-Type"
            r3 = r11
            java.lang.String r3 = r3.mimeType
            r0.printHeader(r1, r2, r3)
        L77:
            r0 = r11
            java.lang.String r1 = "date"
            java.lang.String r0 = r0.getHeader(r1)
            if (r0 != 0) goto L92
            r0 = r11
            r1 = r14
            java.lang.String r2 = "Date"
            r3 = r13
            java.util.Date r4 = new java.util.Date
            r5 = r4
            r5.<init>()
            java.lang.String r3 = r3.format(r4)
            r0.printHeader(r1, r2, r3)
        L92:
            r0 = r11
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.headers
            r1 = r11
            r2 = r14
            void r1 = (v2, v3) -> { // java.util.function.BiConsumer.accept(java.lang.Object, java.lang.Object):void
                r1.lambda$send$0(r2, v2, v3);
            }
            r0.forEach(r1)
            r0 = r11
            java.lang.String r1 = "connection"
            java.lang.String r0 = r0.getHeader(r1)
            if (r0 != 0) goto Lc0
            r0 = r11
            r1 = r14
            java.lang.String r2 = "Connection"
            r3 = r11
            boolean r3 = r3.keepAlive
            if (r3 == 0) goto Lbb
            java.lang.String r3 = "keep-alive"
            goto Lbd
        Lbb:
            java.lang.String r3 = "close"
        Lbd:
            r0.printHeader(r1, r2, r3)
        Lc0:
            r0 = r11
            java.io.InputStream r0 = r0.data
            if (r0 == 0) goto Lce
            r0 = r11
            long r0 = r0.contentLength
            goto Lcf
        Lce:
            r0 = 0
        Lcf:
            r15 = r0
            java.lang.String r0 = "HEAD"
            r1 = r11
            java.lang.String r1 = r1.requestMethod
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lf0
            r0 = r11
            boolean r0 = r0.chunkedTransfer
            if (r0 == 0) goto Lf0
            r0 = r11
            r1 = r14
            java.lang.String r2 = "Transfer-Encoding"
            java.lang.String r3 = "chunked"
            r0.printHeader(r1, r2, r3)
            goto Lf9
        Lf0:
            r0 = r11
            r1 = r14
            r2 = r15
            long r0 = r0.sendContentLengthHeaderIfNotAlreadyPresent(r1, r2)
            r15 = r0
        Lf9:
            r0 = r14
            java.lang.String r1 = "\r\n"
            java.io.PrintWriter r0 = r0.append(r1)
            r0 = r14
            r0.flush()
            r0 = r11
            r1 = r12
            r2 = r15
            r0.sendBodyWithCorrectTransferAndEncoding(r1, r2)
            r0 = r12
            r0.flush()
            r0 = r11
            java.io.InputStream r0 = r0.data
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
            return
    }

    protected void printHeader(java.io.PrintWriter r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            r0 = r4
            r1 = r5
            java.io.PrintWriter r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.io.PrintWriter r0 = r0.append(r1)
            r1 = r6
            java.io.PrintWriter r0 = r0.append(r1)
            java.lang.String r1 = "\r\n"
            java.io.PrintWriter r0 = r0.append(r1)
            return
    }

    protected long sendContentLengthHeaderIfNotAlreadyPresent(java.io.PrintWriter r6, long r7) {
            r5 = this;
            r0 = r5
            java.lang.String r1 = "content-length"
            java.lang.String r0 = r0.getHeader(r1)
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L2d
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Content-Length: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\r\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
            r0 = r7
            return r0
        L2d:
            r0 = r7
            r10 = r0
            r0 = r9
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L3a
            r10 = r0
            goto L57
        L3a:
            r12 = move-exception
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.ERROR
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "content-length was not number "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
        L57:
            r0 = r10
            return r0
    }

    private void sendBodyWithCorrectTransferAndEncoding(java.io.OutputStream r6, long r7) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = "HEAD"
            r1 = r5
            java.lang.String r1 = r1.requestMethod
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            r0 = r5
            boolean r0 = r0.chunkedTransfer
            if (r0 == 0) goto L2e
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ChunkedOutputStream r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.ChunkedOutputStream
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r9 = r0
            r0 = r5
            r1 = r9
            r2 = -1
            r0.sendBody(r1, r2)
            r0 = r9
            r0.finish()
            goto L34
        L2e:
            r0 = r5
            r1 = r6
            r2 = r7
            r0.sendBody(r1, r2)
        L34:
            return
    }

    private void sendBody(java.io.OutputStream r7, long r8) throws java.io.IOException {
            r6 = this;
            r0 = 16384(0x4000, double:8.095E-320)
            r10 = r0
            r0 = r10
            int r0 = (int) r0
            byte[] r0 = new byte[r0]
            r12 = r0
            r0 = r8
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            r13 = r0
        L1b:
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L26
            r0 = r13
            if (r0 == 0) goto L66
        L26:
            r0 = r13
            if (r0 == 0) goto L30
            r0 = r10
            goto L36
        L30:
            r0 = r8
            r1 = r10
            long r0 = java.lang.Math.min(r0, r1)
        L36:
            r14 = r0
            r0 = r6
            java.io.InputStream r0 = r0.data
            r1 = r12
            r2 = 0
            r3 = r14
            int r3 = (int) r3
            int r0 = r0.read(r1, r2, r3)
            r16 = r0
            r0 = r16
            if (r0 > 0) goto L4f
            goto L66
        L4f:
            r0 = r7
            r1 = r12
            r2 = 0
            r3 = r16
            r0.write(r1, r2, r3)
            r0 = r13
            if (r0 != 0) goto L63
            r0 = r8
            r1 = r16
            long r1 = (long) r1
            long r0 = r0 - r1
            r8 = r0
        L63:
            goto L1b
        L66:
            return
    }

    public void setChunkedTransfer(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.chunkedTransfer = r1
            return
    }

    public void setData(java.io.InputStream r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.data = r1
            return
    }

    public void setMimeType(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.mimeType = r1
            return
    }

    public void setRequestMethod(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.requestMethod = r1
            return
    }

    public void setStatus(moe.yushi.authlibinjector.internal.fi.iki.elonen.IStatus r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.status = r1
            return
    }

    public static moe.yushi.authlibinjector.internal.fi.iki.elonen.Response newFixedLength(moe.yushi.authlibinjector.internal.fi.iki.elonen.IStatus r6, java.lang.String r7, java.lang.String r8) {
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ContentType r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.ContentType
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r9 = r0
            r0 = r8
            if (r0 != 0) goto L1e
            r0 = r6
            r1 = r7
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r3 = r2
            r4 = 0
            byte[] r4 = new byte[r4]
            r3.<init>(r4)
            r3 = 0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = newFixedLength(r0, r1, r2, r3)
            return r0
        L1e:
            r0 = r9
            java.lang.String r0 = r0.getEncoding()     // Catch: java.io.UnsupportedEncodingException -> L45
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch: java.io.UnsupportedEncodingException -> L45
            java.nio.charset.CharsetEncoder r0 = r0.newEncoder()     // Catch: java.io.UnsupportedEncodingException -> L45
            r11 = r0
            r0 = r11
            r1 = r8
            boolean r0 = r0.canEncode(r1)     // Catch: java.io.UnsupportedEncodingException -> L45
            if (r0 != 0) goto L38
            r0 = r9
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ContentType r0 = r0.tryUTF8()     // Catch: java.io.UnsupportedEncodingException -> L45
            r9 = r0
        L38:
            r0 = r8
            r1 = r9
            java.lang.String r1 = r1.getEncoding()     // Catch: java.io.UnsupportedEncodingException -> L45
            byte[] r0 = r0.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L45
            r10 = r0
            goto L51
        L45:
            r11 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            throw r0
        L51:
            r0 = r6
            r1 = r9
            java.lang.String r1 = r1.getContentTypeHeader()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r3 = r2
            r4 = r10
            r3.<init>(r4)
            r3 = r10
            int r3 = r3.length
            long r3 = (long) r3
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = newFixedLength(r0, r1, r2, r3)
            return r0
    }

    public static moe.yushi.authlibinjector.internal.fi.iki.elonen.Response newFixedLength(moe.yushi.authlibinjector.internal.fi.iki.elonen.IStatus r8, java.lang.String r9, java.io.InputStream r10, long r11) {
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Response
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    public static moe.yushi.authlibinjector.internal.fi.iki.elonen.Response newChunked(moe.yushi.authlibinjector.internal.fi.iki.elonen.IStatus r8, java.lang.String r9, java.io.InputStream r10) {
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.Response
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = -1
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    private /* synthetic */ void lambda$send$0(java.io.PrintWriter r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.printHeader(r1, r2, r3)
            return
    }
}
