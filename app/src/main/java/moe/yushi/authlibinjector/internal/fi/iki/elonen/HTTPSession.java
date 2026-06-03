package moe.yushi.authlibinjector.internal.fi.iki.elonen;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/fi/iki/elonen/HTTPSession.class */
class HTTPSession implements moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession {
    public static final int BUFSIZE = 8192;
    private final java.io.OutputStream outputStream;
    private final java.io.BufferedInputStream inputStream;
    private final java.net.InetSocketAddress remoteAddr;
    private java.lang.String uri;
    private java.lang.String method;
    private java.lang.String queryParameterString;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> parms;
    private java.util.Map<java.lang.String, java.lang.String> headers;
    private java.lang.String protocolVersion;
    private java.io.InputStream parsedInputStream;
    private boolean expect100Continue;
    private boolean continueSent;
    private boolean isServing;
    private final java.lang.Object servingLock;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/internal/fi/iki/elonen/HTTPSession$ConnectionCloseException.class */
    public static class ConnectionCloseException extends java.net.SocketException {
        public ConnectionCloseException() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    public HTTPSession(java.io.InputStream r7, java.io.OutputStream r8, java.net.InetSocketAddress r9) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.servingLock = r1
            r0 = r6
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r2 = r1
            r3 = r7
            r4 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r3, r4)
            r0.inputStream = r1
            r0 = r6
            r1 = r8
            r0.outputStream = r1
            r0 = r6
            r1 = r9
            r0.remoteAddr = r1
            return
    }

    private java.io.ByteArrayInputStream readHeader() throws java.io.IOException {
            r6 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = -1
            r10 = r0
            r0 = r6
            java.io.BufferedInputStream r0 = r0.inputStream
            r1 = 8192(0x2000, float:1.148E-41)
            r0.mark(r1)
            r0 = r6
            java.io.BufferedInputStream r0 = r0.inputStream     // Catch: java.io.IOException -> L28
            r1 = r7
            r2 = 0
            r3 = 8192(0x2000, float:1.148E-41)
            int r0 = r0.read(r1, r2, r3)     // Catch: java.io.IOException -> L28
            r10 = r0
            goto L40
        L28:
            r11 = move-exception
            r0 = r6
            java.io.BufferedInputStream r0 = r0.inputStream
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
            r0 = r6
            java.io.OutputStream r0 = r0.outputStream
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession$ConnectionCloseException r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession$ConnectionCloseException
            r1 = r0
            r1.<init>()
            throw r0
        L40:
            r0 = r10
            r1 = -1
            if (r0 != r1) goto L5c
            r0 = r6
            java.io.BufferedInputStream r0 = r0.inputStream
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
            r0 = r6
            java.io.OutputStream r0 = r0.outputStream
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession$ConnectionCloseException r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession$ConnectionCloseException
            r1 = r0
            r1.<init>()
            throw r0
        L5c:
            r0 = r10
            if (r0 <= 0) goto L86
            r0 = r9
            r1 = r10
            int r0 = r0 + r1
            r9 = r0
            r0 = r7
            r1 = r9
            int r0 = findHeaderEnd(r0, r1)
            r8 = r0
            r0 = r8
            if (r0 <= 0) goto L73
            goto L86
        L73:
            r0 = r6
            java.io.BufferedInputStream r0 = r0.inputStream
            r1 = r7
            r2 = r9
            r3 = 8192(0x2000, float:1.148E-41)
            r4 = r9
            int r3 = r3 - r4
            int r0 = r0.read(r1, r2, r3)
            r10 = r0
            goto L5c
        L86:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L9c
            r0 = r6
            java.io.BufferedInputStream r0 = r0.inputStream
            r0.reset()
            r0 = r6
            java.io.BufferedInputStream r0 = r0.inputStream
            r1 = r8
            long r1 = (long) r1
            long r0 = r0.skip(r1)
        L9c:
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r1 = r0
            r2 = r7
            r3 = 0
            r4 = r9
            r1.<init>(r2, r3, r4)
            return r0
    }

    private void parseHeader(java.io.BufferedReader r7) throws moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException {
            r6 = this;
            r0 = r7
            java.lang.String r0 = r0.readLine()     // Catch: java.io.IOException -> L12c
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L16
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException     // Catch: java.io.IOException -> L12c
            r1 = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r2 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.BAD_REQUEST     // Catch: java.io.IOException -> L12c
            java.lang.String r3 = "BAD REQUEST: Syntax error."
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L12c
            throw r0     // Catch: java.io.IOException -> L12c
        L16:
            java.util.StringTokenizer r0 = new java.util.StringTokenizer     // Catch: java.io.IOException -> L12c
            r1 = r0
            r2 = r8
            r1.<init>(r2)     // Catch: java.io.IOException -> L12c
            r9 = r0
            r0 = r9
            boolean r0 = r0.hasMoreTokens()     // Catch: java.io.IOException -> L12c
            if (r0 != 0) goto L33
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException     // Catch: java.io.IOException -> L12c
            r1 = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r2 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.BAD_REQUEST     // Catch: java.io.IOException -> L12c
            java.lang.String r3 = "BAD REQUEST: Syntax error."
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L12c
            throw r0     // Catch: java.io.IOException -> L12c
        L33:
            r0 = r6
            r1 = r9
            java.lang.String r1 = r1.nextToken()     // Catch: java.io.IOException -> L12c
            r0.method = r1     // Catch: java.io.IOException -> L12c
            r0 = r9
            boolean r0 = r0.hasMoreTokens()     // Catch: java.io.IOException -> L12c
            if (r0 != 0) goto L4f
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException     // Catch: java.io.IOException -> L12c
            r1 = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r2 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.BAD_REQUEST     // Catch: java.io.IOException -> L12c
            java.lang.String r3 = "BAD REQUEST: Missing URI."
            r1.<init>(r2, r3)     // Catch: java.io.IOException -> L12c
            throw r0     // Catch: java.io.IOException -> L12c
        L4f:
            r0 = r9
            java.lang.String r0 = r0.nextToken()     // Catch: java.io.IOException -> L12c
            r10 = r0
            r0 = r10
            r1 = 63
            int r0 = r0.indexOf(r1)     // Catch: java.io.IOException -> L12c
            r11 = r0
            r0 = r11
            if (r0 < 0) goto L90
            r0 = r6
            r1 = r10
            r2 = r11
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r1 = r1.substring(r2)     // Catch: java.io.IOException -> L12c
            r0.queryParameterString = r1     // Catch: java.io.IOException -> L12c
            r0 = r6
            r1 = r6
            java.lang.String r1 = r1.queryParameterString     // Catch: java.io.IOException -> L12c
            java.util.Map r1 = decodeParms(r1)     // Catch: java.io.IOException -> L12c
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)     // Catch: java.io.IOException -> L12c
            r0.parms = r1     // Catch: java.io.IOException -> L12c
            r0 = r6
            r1 = r10
            r2 = 0
            r3 = r11
            java.lang.String r1 = r1.substring(r2, r3)     // Catch: java.io.IOException -> L12c
            java.lang.String r1 = decodePercent(r1)     // Catch: java.io.IOException -> L12c
            r0.uri = r1     // Catch: java.io.IOException -> L12c
            goto La5
        L90:
            r0 = r6
            r1 = 0
            r0.queryParameterString = r1     // Catch: java.io.IOException -> L12c
            r0 = r6
            java.util.Map r1 = java.util.Collections.emptyMap()     // Catch: java.io.IOException -> L12c
            r0.parms = r1     // Catch: java.io.IOException -> L12c
            r0 = r6
            r1 = r10
            java.lang.String r1 = decodePercent(r1)     // Catch: java.io.IOException -> L12c
            r0.uri = r1     // Catch: java.io.IOException -> L12c
        La5:
            r0 = r9
            boolean r0 = r0.hasMoreTokens()     // Catch: java.io.IOException -> L12c
            if (r0 == 0) goto Lb7
            r0 = r6
            r1 = r9
            java.lang.String r1 = r1.nextToken()     // Catch: java.io.IOException -> L12c
            r0.protocolVersion = r1     // Catch: java.io.IOException -> L12c
            goto Lc5
        Lb7:
            r0 = r6
            java.lang.String r1 = "HTTP/1.1"
            r0.protocolVersion = r1     // Catch: java.io.IOException -> L12c
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG     // Catch: java.io.IOException -> L12c
            java.lang.String r1 = "no protocol version specified, strange. Assuming HTTP/1.1."
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)     // Catch: java.io.IOException -> L12c
        Lc5:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.io.IOException -> L12c
            r1 = r0
            r1.<init>()     // Catch: java.io.IOException -> L12c
            r12 = r0
            r0 = r7
            java.lang.String r0 = r0.readLine()     // Catch: java.io.IOException -> L12c
            r13 = r0
        Ld4:
            r0 = r13
            if (r0 == 0) goto L120
            r0 = r13
            java.lang.String r0 = r0.trim()     // Catch: java.io.IOException -> L12c
            boolean r0 = r0.isEmpty()     // Catch: java.io.IOException -> L12c
            if (r0 != 0) goto L120
            r0 = r13
            r1 = 58
            int r0 = r0.indexOf(r1)     // Catch: java.io.IOException -> L12c
            r14 = r0
            r0 = r14
            if (r0 < 0) goto L117
            r0 = r12
            r1 = r13
            r2 = 0
            r3 = r14
            java.lang.String r1 = r1.substring(r2, r3)     // Catch: java.io.IOException -> L12c
            java.lang.String r1 = r1.trim()     // Catch: java.io.IOException -> L12c
            java.util.Locale r2 = java.util.Locale.ROOT     // Catch: java.io.IOException -> L12c
            java.lang.String r1 = r1.toLowerCase(r2)     // Catch: java.io.IOException -> L12c
            r2 = r13
            r3 = r14
            r4 = 1
            int r3 = r3 + r4
            java.lang.String r2 = r2.substring(r3)     // Catch: java.io.IOException -> L12c
            java.lang.String r2 = r2.trim()     // Catch: java.io.IOException -> L12c
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.io.IOException -> L12c
        L117:
            r0 = r7
            java.lang.String r0 = r0.readLine()     // Catch: java.io.IOException -> L12c
            r13 = r0
            goto Ld4
        L120:
            r0 = r6
            r1 = r12
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)     // Catch: java.io.IOException -> L12c
            r0.headers = r1     // Catch: java.io.IOException -> L12c
            goto L14f
        L12c:
            r8 = move-exception
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException
            r1 = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r2 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.INTERNAL_ERROR
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = r3
            r4.<init>()
            java.lang.String r4 = "SERVER INTERNAL ERROR: IOException: "
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = r8
            java.lang.String r4 = r4.getMessage()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = r8
            r1.<init>(r2, r3, r4)
            throw r0
        L14f:
            return
    }

    public void execute(java.util.function.Function<moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession, moe.yushi.authlibinjector.internal.fi.iki.elonen.Response> r9) throws java.io.IOException {
            r8 = this;
            r0 = 0
            r10 = r0
            r0 = r8
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r2 = r1
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r4 = r3
            r5 = r8
            java.io.ByteArrayInputStream r5 = r5.readHeader()     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r4.<init>(r5, r6)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r2.<init>(r3)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0.parseHeader(r1)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0 = r8
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.headers     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            java.lang.String r1 = "transfer-encoding"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r11 = r0
            r0 = r8
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.headers     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            java.lang.String r1 = "content-length"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r12 = r0
            r0 = r11
            if (r0 == 0) goto L6f
            r0 = r12
            if (r0 != 0) goto L6f
            java.lang.String r0 = "chunked"
            r1 = r11
            boolean r0 = r0.equals(r1)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            if (r0 == 0) goto L61
            r0 = r8
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ChunkedInputStream r1 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.ChunkedInputStream     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r2 = r1
            r3 = r8
            java.io.BufferedInputStream r3 = r3.inputStream     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r2.<init>(r3)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0.parsedInputStream = r1     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            goto Lcb
        L61:
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r1 = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r2 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.NOT_IMPLEMENTED     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            java.lang.String r3 = "Unsupported Transfer-Encoding"
            r1.<init>(r2, r3)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            throw r0     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
        L6f:
            r0 = r11
            if (r0 != 0) goto Laf
            r0 = r12
            if (r0 == 0) goto Laf
            r0 = -1
            r13 = r0
            r0 = r12
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L85 java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r13 = r0
            goto L87
        L85:
            r14 = move-exception
        L87:
            r0 = r13
            if (r0 >= 0) goto L9a
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r1 = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r2 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.BAD_REQUEST     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            java.lang.String r3 = "The request has an invalid Content-Length header."
            r1.<init>(r2, r3)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            throw r0     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
        L9a:
            r0 = r8
            moe.yushi.authlibinjector.internal.fi.iki.elonen.FixedLengthInputStream r1 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.FixedLengthInputStream     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r2 = r1
            r3 = r8
            java.io.BufferedInputStream r3 = r3.inputStream     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r4 = r13
            long r4 = (long) r4     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r2.<init>(r3, r4)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0.parsedInputStream = r1     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            goto Lcb
        Laf:
            r0 = r11
            if (r0 == 0) goto Lc6
            r0 = r12
            if (r0 == 0) goto Lc6
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r1 = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r2 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.BAD_REQUEST     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            java.lang.String r3 = "Content-Length and Transfer-Encoding cannot exist at the same time."
            r1.<init>(r2, r3)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            throw r0     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
        Lc6:
            r0 = r8
            r1 = 0
            r0.parsedInputStream = r1     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
        Lcb:
            r0 = r8
            java.lang.String r1 = "HTTP/1.1"
            r2 = r8
            java.lang.String r2 = r2.protocolVersion     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            boolean r1 = r1.equals(r2)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            if (r1 == 0) goto Lf8
            java.lang.String r1 = "100-continue"
            r2 = r8
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.headers     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            java.lang.String r3 = "expect"
            java.lang.Object r2 = r2.get(r3)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            boolean r1 = r1.equals(r2)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            if (r1 == 0) goto Lf8
            r1 = r8
            java.io.InputStream r1 = r1.parsedInputStream     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            if (r1 == 0) goto Lf8
            r1 = 1
            goto Lf9
        Lf8:
            r1 = 0
        Lf9:
            r0.expect100Continue = r1     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0 = r8
            r1 = 0
            r0.continueSent = r1     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0 = r8
            r1 = 1
            r0.isServing = r1     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0 = r9
            r1 = r8
            java.lang.Object r0 = r0.apply(r1)     // Catch: java.lang.Throwable -> L12f java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = (moe.yushi.authlibinjector.internal.fi.iki.elonen.Response) r0     // Catch: java.lang.Throwable -> L12f java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r10 = r0
            r0 = r8
            java.lang.Object r0 = r0.servingLock     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r1 = r0
            r13 = r1
            monitor-enter(r0)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0 = r8
            r1 = 0
            r0.isServing = r1     // Catch: java.lang.Throwable -> L124 java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0 = r13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L124 java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            goto L12c
        L124:
            r15 = move-exception
            r0 = r13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L124 java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0 = r15
            throw r0     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
        L12c:
            goto L14f
        L12f:
            r16 = move-exception
            r0 = r8
            java.lang.Object r0 = r0.servingLock     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r1 = r0
            r17 = r1
            monitor-enter(r0)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0 = r8
            r1 = 0
            r0.isServing = r1     // Catch: java.lang.Throwable -> L144 java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0 = r17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L144 java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            goto L14c
        L144:
            r18 = move-exception
            r0 = r17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L144 java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0 = r18
            throw r0     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
        L14c:
            r0 = r16
            throw r0     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
        L14f:
            r0 = r8
            java.io.InputStream r0 = r0.parsedInputStream     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            if (r0 == 0) goto L172
            r0 = r8
            boolean r0 = r0.expect100Continue     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            if (r0 == 0) goto L164
            r0 = r8
            boolean r0 = r0.continueSent     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            if (r0 == 0) goto L172
        L164:
            r0 = r8
            java.io.InputStream r0 = r0.parsedInputStream     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            int r0 = r0.read()     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r1 = -1
            if (r0 == r1) goto L172
            goto L164
        L172:
            java.lang.String r0 = "HTTP/1.1"
            r1 = r8
            java.lang.String r1 = r1.protocolVersion     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            boolean r0 = r0.equals(r1)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            if (r0 == 0) goto L197
            java.lang.String r0 = "close"
            r1 = r8
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.headers     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            java.lang.String r2 = "connection"
            java.lang.Object r1 = r1.get(r2)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            boolean r0 = r0.equals(r1)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            if (r0 != 0) goto L197
            r0 = 1
            goto L198
        L197:
            r0 = 0
        L198:
            r13 = r0
            r0 = r10
            if (r0 != 0) goto L1ac
            moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r1 = r0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r2 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.INTERNAL_ERROR     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            java.lang.String r3 = "SERVER INTERNAL ERROR: Serve() returned a null response."
            r1.<init>(r2, r3)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            throw r0     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
        L1ac:
            r0 = r10
            r1 = r8
            java.lang.String r1 = r1.method     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0.setRequestMethod(r1)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0 = r10
            r1 = r13
            r0.setKeepAlive(r1)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0 = r10
            r1 = r8
            java.io.OutputStream r1 = r1.outputStream     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0.send(r1)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r0 = r13
            if (r0 == 0) goto L1d7
            java.lang.String r0 = "close"
            r1 = r10
            java.lang.String r2 = "connection"
            java.lang.String r1 = r1.getHeader(r2)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            boolean r0 = r0.equals(r1)     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            if (r0 == 0) goto L1df
        L1d7:
            moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession$ConnectionCloseException r0 = new moe.yushi.authlibinjector.internal.fi.iki.elonen.HTTPSession$ConnectionCloseException     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            r1 = r0
            r1.<init>()     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
            throw r0     // Catch: java.net.SocketException -> L1e6 java.net.SocketTimeoutException -> L1e9 java.io.IOException -> L1ec moe.yushi.authlibinjector.internal.fi.iki.elonen.ResponseException -> L225 java.lang.Throwable -> L24d
        L1df:
            r0 = r10
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
            goto L256
        L1e6:
            r11 = move-exception
            r0 = r11
            throw r0     // Catch: java.lang.Throwable -> L24d
        L1e9:
            r11 = move-exception
            r0 = r11
            throw r0     // Catch: java.lang.Throwable -> L24d
        L1ec:
            r11 = move-exception
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Status.INTERNAL_ERROR     // Catch: java.lang.Throwable -> L24d
            java.lang.String r1 = "text/plain; charset=utf-8"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24d
            r3 = r2
            r3.<init>()     // Catch: java.lang.Throwable -> L24d
            java.lang.String r3 = "SERVER INTERNAL ERROR: IOException: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L24d
            r3 = r11
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L24d
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L24d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L24d
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)     // Catch: java.lang.Throwable -> L24d
            r12 = r0
            r0 = r12
            r1 = r8
            java.io.OutputStream r1 = r1.outputStream     // Catch: java.lang.Throwable -> L24d
            r0.send(r1)     // Catch: java.lang.Throwable -> L24d
            r0 = r8
            java.io.OutputStream r0 = r0.outputStream     // Catch: java.lang.Throwable -> L24d
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)     // Catch: java.lang.Throwable -> L24d
            r0 = r10
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
            goto L256
        L225:
            r11 = move-exception
            r0 = r11
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Status r0 = r0.getStatus()     // Catch: java.lang.Throwable -> L24d
            java.lang.String r1 = "text/plain; charset=utf-8"
            r2 = r11
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L24d
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2)     // Catch: java.lang.Throwable -> L24d
            r12 = r0
            r0 = r12
            r1 = r8
            java.io.OutputStream r1 = r1.outputStream     // Catch: java.lang.Throwable -> L24d
            r0.send(r1)     // Catch: java.lang.Throwable -> L24d
            r0 = r8
            java.io.OutputStream r0 = r0.outputStream     // Catch: java.lang.Throwable -> L24d
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)     // Catch: java.lang.Throwable -> L24d
            r0 = r10
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
            goto L256
        L24d:
            r19 = move-exception
            r0 = r10
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD.safeClose(r0)
            r0 = r19
            throw r0
        L256:
            return
    }

    @Override // moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession
    public final java.util.Map<java.lang.String, java.lang.String> getHeaders() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.headers
            return r0
    }

    @Override // moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession
    public final java.io.InputStream getInputStream() throws java.io.IOException {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.servingLock
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r4
            boolean r0 = r0.isServing     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L16
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3e
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3e
        L16:
            r0 = r4
            boolean r0 = r0.expect100Continue     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L39
            r0 = r4
            boolean r0 = r0.continueSent     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L39
            r0 = r4
            r1 = 1
            r0.continueSent = r1     // Catch: java.lang.Throwable -> L3e
            r0 = r4
            java.io.OutputStream r0 = r0.outputStream     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = "HTTP/1.1 100 Continue\r\n\r\n"
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch: java.lang.Throwable -> L3e
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L3e
            r0.write(r1)     // Catch: java.lang.Throwable -> L3e
        L39:
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            goto L43
        L3e:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = r6
            throw r0
        L43:
            r0 = r4
            java.io.InputStream r0 = r0.parsedInputStream
            return r0
    }

    @Override // moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession
    public final java.lang.String getMethod() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.method
            return r0
    }

    @Override // moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getParameters() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r0.parms
            return r0
    }

    @Override // moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession
    public java.lang.String getQueryParameterString() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.queryParameterString
            return r0
    }

    @Override // moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession
    public final java.lang.String getUri() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.uri
            return r0
    }

    @Override // moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession
    public java.net.InetSocketAddress getRemoteAddress() {
            r2 = this;
            r0 = r2
            java.net.InetSocketAddress r0 = r0.remoteAddr
            return r0
    }

    private static int findHeaderEnd(byte[] r4, int r5) {
            r0 = 0
            r6 = r0
        L2:
            r0 = r6
            r1 = 1
            int r0 = r0 + r1
            r1 = r5
            if (r0 >= r1) goto L56
            r0 = r4
            r1 = r6
            r0 = r0[r1]
            r1 = 13
            if (r0 != r1) goto L3a
            r0 = r4
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 10
            if (r0 != r1) goto L3a
            r0 = r6
            r1 = 3
            int r0 = r0 + r1
            r1 = r5
            if (r0 >= r1) goto L3a
            r0 = r4
            r1 = r6
            r2 = 2
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 13
            if (r0 != r1) goto L3a
            r0 = r4
            r1 = r6
            r2 = 3
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 10
            if (r0 != r1) goto L3a
            r0 = r6
            r1 = 4
            int r0 = r0 + r1
            return r0
        L3a:
            r0 = r4
            r1 = r6
            r0 = r0[r1]
            r1 = 10
            if (r0 != r1) goto L50
            r0 = r4
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 10
            if (r0 != r1) goto L50
            r0 = r6
            r1 = 2
            int r0 = r0 + r1
            return r0
        L50:
            int r6 = r6 + 1
            goto L2
        L56:
            r0 = 0
            return r0
    }

    private static java.lang.String decodePercent(java.lang.String r4) {
            r0 = r4
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> L8
            return r0
        L8:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }

    private static java.util.Map<java.lang.String, java.util.List<java.lang.String>> decodeParms(java.lang.String r5) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = r0
            r1.<init>()
            r6 = r0
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r1 = r0
            r2 = r5
            java.lang.String r3 = "&"
            r1.<init>(r2, r3)
            r7 = r0
        L14:
            r0 = r7
            boolean r0 = r0.hasMoreTokens()
            if (r0 == 0) goto L93
            r0 = r7
            java.lang.String r0 = r0.nextToken()
            r8 = r0
            r0 = r8
            r1 = 61
            int r0 = r0.indexOf(r1)
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r9
            if (r0 < 0) goto L52
            r0 = r8
            r1 = 0
            r2 = r9
            java.lang.String r0 = r0.substring(r1, r2)
            java.lang.String r0 = decodePercent(r0)
            java.lang.String r0 = r0.trim()
            r10 = r0
            r0 = r8
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r0 = decodePercent(r0)
            r11 = r0
            goto L60
        L52:
            r0 = r8
            java.lang.String r0 = decodePercent(r0)
            java.lang.String r0 = r0.trim()
            r10 = r0
            java.lang.String r0 = ""
            r11 = r0
        L60:
            r0 = r6
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L86
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r6
            r1 = r10
            r2 = r12
            java.lang.Object r0 = r0.put(r1, r2)
        L86:
            r0 = r12
            r1 = r11
            boolean r0 = r0.add(r1)
            goto L14
        L93:
            r0 = r6
            return r0
    }
}
