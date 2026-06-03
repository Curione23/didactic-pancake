package moe.yushi.authlibinjector.httpd;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/httpd/URLProcessor.class */
public class URLProcessor {
    private static final java.util.regex.Pattern URL_REGEX = null;
    private static final java.util.regex.Pattern LOCAL_URL_REGEX = null;
    private java.util.List<moe.yushi.authlibinjector.httpd.URLFilter> filters;
    private moe.yushi.authlibinjector.httpd.URLRedirector redirector;
    private moe.yushi.authlibinjector.httpd.DebugApiEndpoint debugApi;
    private volatile moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD httpd;
    private final java.lang.Object httpdLock;
    private static final java.util.Set<java.lang.String> ignoredHeaders = null;



    public URLProcessor(java.util.List<moe.yushi.authlibinjector.httpd.URLFilter> r5, moe.yushi.authlibinjector.httpd.URLRedirector r6) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            moe.yushi.authlibinjector.httpd.DebugApiEndpoint r1 = new moe.yushi.authlibinjector.httpd.DebugApiEndpoint
            r2 = r1
            r2.<init>()
            r0.debugApi = r1
            r0 = r4
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.httpdLock = r1
            r0 = r4
            r1 = r5
            r0.filters = r1
            r0 = r4
            r1 = r6
            r0.redirector = r1
            return
    }

    public java.util.Optional<java.lang.String> transformURL(java.lang.String r6) {
            r5 = this;
            r0 = r6
            java.lang.String r1 = "http"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto Ld
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
        Ld:
            java.util.regex.Pattern r0 = moe.yushi.authlibinjector.httpd.URLProcessor.URL_REGEX
            r1 = r6
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0.find()
            if (r0 != 0) goto L20
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
        L20:
            r0 = r7
            java.lang.String r1 = "protocol"
            java.lang.String r0 = r0.group(r1)
            r8 = r0
            r0 = r7
            java.lang.String r1 = "domain"
            java.lang.String r0 = r0.group(r1)
            r9 = r0
            r0 = r7
            java.lang.String r1 = "path"
            java.lang.String r0 = r0.group(r1)
            r10 = r0
            r0 = r5
            r1 = r8
            r2 = r9
            r3 = r10
            java.util.Optional r0 = r0.transform(r1, r2, r3)
            r11 = r0
            r0 = r11
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L78
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Transformed url ["
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "] to ["
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r11
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "]"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
        L78:
            r0 = r11
            return r0
    }

    private java.util.Optional<java.lang.String> transform(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            r0 = 0
            r8 = r0
            r0 = r4
            java.util.List<moe.yushi.authlibinjector.httpd.URLFilter> r0 = r0.filters
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        Le:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L38
            r0 = r9
            java.lang.Object r0 = r0.next()
            moe.yushi.authlibinjector.httpd.URLFilter r0 = (moe.yushi.authlibinjector.httpd.URLFilter) r0
            r10 = r0
            r0 = r10
            r1 = r6
            boolean r0 = r0.canHandle(r1)
            if (r0 == 0) goto L35
            r0 = 1
            r8 = r0
            goto L38
        L35:
            goto Le
        L38:
            r0 = r8
            if (r0 == 0) goto L6d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "http://127.0.0.1:"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            int r1 = r1.getLocalApiPort()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L6d:
            r0 = r4
            moe.yushi.authlibinjector.httpd.URLRedirector r0 = r0.redirector
            r1 = r6
            r2 = r7
            java.util.Optional r0 = r0.redirect(r1, r2)
            return r0
    }

    private int getLocalApiPort() {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.httpdLock
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r4
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r0 = r0.httpd     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L4a
            r0 = r4
            r1 = r4
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r1 = r1.createHttpd()     // Catch: java.lang.Throwable -> L54
            r0.httpd = r1     // Catch: java.lang.Throwable -> L54
            r0 = r4
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r0 = r0.httpd     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L54
            r0.start()     // Catch: java.io.IOException -> L20 java.lang.Throwable -> L54
            goto L2b
        L20:
            r6 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L54
            r1 = r0
            java.lang.String r2 = "Httpd failed to start"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L54
            throw r0     // Catch: java.lang.Throwable -> L54
        L2b:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.INFO     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = "Httpd is running on port "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L54
            r2 = r4
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r2 = r2.httpd     // Catch: java.lang.Throwable -> L54
            int r2 = r2.getListeningPort()     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L54
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)     // Catch: java.lang.Throwable -> L54
        L4a:
            r0 = r4
            moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD r0 = r0.httpd     // Catch: java.lang.Throwable -> L54
            int r0 = r0.getListeningPort()     // Catch: java.lang.Throwable -> L54
            r1 = r5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            return r0
        L54:
            r7 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            r0 = r7
            throw r0
    }

    private moe.yushi.authlibinjector.internal.fi.iki.elonen.NanoHTTPD createHttpd() {
            r6 = this;
            moe.yushi.authlibinjector.httpd.URLProcessor$1 r0 = new moe.yushi.authlibinjector.httpd.URLProcessor$1
            r1 = r0
            r2 = r6
            java.lang.String r3 = "127.0.0.1"
            int r4 = moe.yushi.authlibinjector.Config.httpdPort
            r1.<init>(r2, r3, r4)
            return r0
    }

    private moe.yushi.authlibinjector.internal.fi.iki.elonen.Response reverseProxy(moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession r7, java.lang.String r8) throws java.io.IOException {
            r6 = this;
            r0 = r7
            java.lang.String r0 = r0.getMethod()
            r9 = r0
            r0 = r7
            java.lang.String r0 = r0.getQueryParameterString()
            if (r0 != 0) goto L14
            r0 = r8
            goto L30
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "?"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.String r1 = r1.getQueryParameterString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L30:
            r10 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = r0
            r2 = r7
            java.util.Map r2 = r2.getHeaders()
            r1.<init>(r2)
            r11 = r0
            java.util.Set<java.lang.String> r0 = moe.yushi.authlibinjector.httpd.URLProcessor.ignoredHeaders
            r1 = r11
            r2 = r1
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r1 = (v1) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                r1.remove(v1);
            }
            r0.forEach(r1)
            r0 = r7
            java.io.InputStream r0 = r0.getInputStream()
            r12 = r0
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Reverse proxy: > "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r10
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", headers: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r11
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            java.net.URL r0 = new java.net.URL
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r13 = r0
            r0 = r13
            r1 = r9
            r0.setRequestMethod(r1)
            r0 = r13
            r1 = r12
            if (r1 == 0) goto Laf
            r1 = 1
            goto Lb0
        Laf:
            r1 = 0
        Lb0:
            r0.setDoOutput(r1)
            r0 = r11
            r1 = r13
            r2 = r1
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2)
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r1 = r1::setRequestProperty
            r0.forEach(r1)
            r0 = r12
            if (r0 == 0) goto L115
            r0 = r9
            java.lang.String r1 = "GET"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L115
            r0 = r9
            java.lang.String r1 = "HEAD"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L115
            r0 = r13
            java.io.OutputStream r0 = r0.getOutputStream()
            r14 = r0
            r0 = r12
            r1 = r14
            moe.yushi.authlibinjector.util.IOUtils.transfer(r0, r1)     // Catch: java.lang.Throwable -> Lfa
            r0 = r14
            if (r0 == 0) goto L115
            r0 = r14
            r0.close()
            goto L115
        Lfa:
            r15 = move-exception
            r0 = r14
            if (r0 == 0) goto L112
            r0 = r14
            r0.close()     // Catch: java.lang.Throwable -> L109
            goto L112
        L109:
            r16 = move-exception
            r0 = r15
            r1 = r16
            r0.addSuppressed(r1)
        L112:
            r0 = r15
            throw r0
        L115:
            r0 = r13
            int r0 = r0.getResponseCode()
            r14 = r0
            r0 = r13
            java.lang.String r0 = r0.getResponseMessage()
            r15 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r13
            java.util.Map r0 = r0.getHeaderFields()
            r1 = r16
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r1 = (v1, v2) -> { // java.util.function.BiConsumer.accept(java.lang.Object, java.lang.Object):void
                lambda$reverseProxy$0(r1, v1, v2);
            }
            r0.forEach(r1)
            r0 = r13
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.io.IOException -> L147
            r17 = r0
            goto L150
        L147:
            r18 = move-exception
            r0 = r13
            java.io.InputStream r0 = r0.getErrorStream()
            r17 = r0
        L150:
            moe.yushi.authlibinjector.util.Logging$Level r0 = moe.yushi.authlibinjector.util.Logging.Level.DEBUG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Reverse proxy: < "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r14
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r15
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " , headers: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            moe.yushi.authlibinjector.util.Logging.log(r0, r1)
            moe.yushi.authlibinjector.httpd.URLProcessor$2 r0 = new moe.yushi.authlibinjector.httpd.URLProcessor$2
            r1 = r0
            r2 = r6
            r3 = r14
            r4 = r15
            r1.<init>(r2, r3, r4)
            r18 = r0
            r0 = -1
            r19 = r0
            r0 = r16
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r21 = r0
        L1a2:
            r0 = r21
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L1e9
            r0 = r21
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r22 = r0
            java.lang.String r0 = "content-length"
            r1 = r22
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1e6
            r0 = r22
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            long r0 = java.lang.Long.parseLong(r0)
            r19 = r0
            goto L1e9
        L1e6:
            goto L1a2
        L1e9:
            r0 = r19
            r1 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L218
            r0 = r13
            java.lang.String r1 = "transfer-encoding"
            java.lang.String r0 = r0.getHeaderField(r1)
            if (r0 != 0) goto L20b
            r0 = r18
            r1 = 0
            r2 = r17
            r3 = 0
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2, r3)
            r21 = r0
            goto L224
        L20b:
            r0 = r18
            r1 = 0
            r2 = r17
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newChunked(r0, r1, r2)
            r21 = r0
            goto L224
        L218:
            r0 = r18
            r1 = 0
            r2 = r17
            r3 = r19
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = moe.yushi.authlibinjector.internal.fi.iki.elonen.Response.newFixedLength(r0, r1, r2, r3)
            r21 = r0
        L224:
            r0 = r16
            r1 = r21
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r1 = (v1, v2) -> { // java.util.function.BiConsumer.accept(java.lang.Object, java.lang.Object):void
                lambda$reverseProxy$2(r1, v1, v2);
            }
            r0.forEach(r1)
            r0 = r21
            return r0
    }

    private static /* synthetic */ void lambda$reverseProxy$2(moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r4, java.lang.String r5, java.util.List r6) {
            r0 = r6
            r1 = r4
            r2 = r5
            void r1 = (v2) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                lambda$reverseProxy$1(r1, r2, v2);
            }
            r0.forEach(r1)
            return
    }

    private static /* synthetic */ void lambda$reverseProxy$1(moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r4, java.lang.String r5, java.lang.String r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            r0.addHeader(r1, r2)
            return
    }

    private static /* synthetic */ void lambda$reverseProxy$0(java.util.Map r4, java.lang.String r5, java.util.List r6) {
            r0 = r5
            if (r0 == 0) goto L1c
            java.util.Set<java.lang.String> r0 = moe.yushi.authlibinjector.httpd.URLProcessor.ignoredHeaders
            r1 = r5
            java.lang.String r1 = r1.toLowerCase()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1c
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
        L1c:
            return
    }

    static /* synthetic */ moe.yushi.authlibinjector.httpd.DebugApiEndpoint access$000(moe.yushi.authlibinjector.httpd.URLProcessor r2) {
            r0 = r2
            moe.yushi.authlibinjector.httpd.DebugApiEndpoint r0 = r0.debugApi
            return r0
    }

    static /* synthetic */ java.util.regex.Pattern access$100() {
            java.util.regex.Pattern r0 = moe.yushi.authlibinjector.httpd.URLProcessor.LOCAL_URL_REGEX
            return r0
    }

    static /* synthetic */ java.util.List access$200(moe.yushi.authlibinjector.httpd.URLProcessor r2) {
            r0 = r2
            java.util.List<moe.yushi.authlibinjector.httpd.URLFilter> r0 = r0.filters
            return r0
    }

    static /* synthetic */ moe.yushi.authlibinjector.httpd.URLRedirector access$300(moe.yushi.authlibinjector.httpd.URLProcessor r2) {
            r0 = r2
            moe.yushi.authlibinjector.httpd.URLRedirector r0 = r0.redirector
            return r0
    }

    static /* synthetic */ moe.yushi.authlibinjector.internal.fi.iki.elonen.Response access$400(moe.yushi.authlibinjector.httpd.URLProcessor r4, moe.yushi.authlibinjector.internal.fi.iki.elonen.IHTTPSession r5, java.lang.String r6) throws java.io.IOException {
            r0 = r4
            r1 = r5
            r2 = r6
            moe.yushi.authlibinjector.internal.fi.iki.elonen.Response r0 = r0.reverseProxy(r1, r2)
            return r0
    }

    static {
            java.lang.String r0 = "^(?<protocol>https?):\\/\\/(?<domain>[^\\/]+)(?<path>\\/?.*)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            moe.yushi.authlibinjector.httpd.URLProcessor.URL_REGEX = r0
            java.lang.String r0 = "^/(?<protocol>https?)/(?<domain>[^\\/]+)(?<path>\\/.*)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            moe.yushi.authlibinjector.httpd.URLProcessor.LOCAL_URL_REGEX = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = 5
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            java.lang.String r5 = "host"
            r3[r4] = r5
            r3 = r2
            r4 = 1
            java.lang.String r5 = "expect"
            r3[r4] = r5
            r3 = r2
            r4 = 2
            java.lang.String r5 = "connection"
            r3[r4] = r5
            r3 = r2
            r4 = 3
            java.lang.String r5 = "keep-alive"
            r3[r4] = r5
            r3 = r2
            r4 = 4
            java.lang.String r5 = "transfer-encoding"
            r3[r4] = r5
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.<init>(r2)
            moe.yushi.authlibinjector.httpd.URLProcessor.ignoredHeaders = r0
            return
    }
}
