package okhttp3;

/* JADX INFO: compiled from: Cache.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0004BCDEB\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0018\u00010\"R\u00020\fH\u0002J\b\u0010#\u001a\u00020 H\u0016J\u0006\u0010$\u001a\u00020 J\r\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b%J\u0006\u0010&\u001a\u00020 J\b\u0010'\u001a\u00020 H\u0016J\u0017\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010-\u001a\u00020 J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0011J\u0017\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020)H\u0000¢\u0006\u0002\b1J\u0015\u00102\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b3J\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u00104\u001a\u00020\u0006J\r\u00105\u001a\u00020 H\u0000¢\u0006\u0002\b6J\u0015\u00107\u001a\u00020 2\u0006\u00108\u001a\u000209H\u0000¢\u0006\u0002\b:J\u001d\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020)H\u0000¢\u0006\u0002\b>J\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@J\u0006\u0010\u0017\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\u0011R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0011X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006F"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "directory", "Ljava/io/File;", "maxSize", "", "(Ljava/io/File;J)V", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V", "cache", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "()Ljava/io/File;", "hitCount", "", "isClosed", "", "()Z", "networkCount", "requestCount", "writeAbortCount", "getWriteAbortCount$okhttp", "()I", "setWriteAbortCount$okhttp", "(I)V", "writeSuccessCount", "getWriteSuccessCount$okhttp", "setWriteSuccessCount$okhttp", "abortQuietly", "", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "close", "delete", "-deprecated_directory", "evictAll", "flush", "get", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "get$okhttp", "initialize", "put", "Lokhttp3/internal/cache/CacheRequest;", "response", "put$okhttp", "remove", "remove$okhttp", "size", "trackConditionalCacheHit", "trackConditionalCacheHit$okhttp", "trackResponse", "cacheStrategy", "Lokhttp3/internal/cache/CacheStrategy;", "trackResponse$okhttp", "update", "cached", "network", "update$okhttp", "urls", "", "", "CacheResponseBody", "Companion", "Entry", "RealCacheRequest", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Cache implements java.io.Closeable, java.io.Flushable {
    public static final okhttp3.Cache.Companion Companion = null;
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final okhttp3.internal.cache.DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* JADX INFO: compiled from: Cache.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0007\u001a\u00020\rH\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "contentType", "", "contentLength", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V", "bodySource", "Lokio/BufferedSource;", "getSnapshot", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "", "Lokhttp3/MediaType;", "source", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class CacheResponseBody extends okhttp3.ResponseBody {
        private final okio.BufferedSource bodySource;
        private final java.lang.String contentLength;
        private final java.lang.String contentType;
        private final okhttp3.internal.cache.DiskLruCache.Snapshot snapshot;


        public CacheResponseBody(okhttp3.internal.cache.DiskLruCache.Snapshot r2, java.lang.String r3, java.lang.String r4) {
                r1 = this;
                java.lang.String r0 = "snapshot"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.snapshot = r2
                r1.contentType = r3
                r1.contentLength = r4
                r3 = 1
                okio.Source r2 = r2.getSource(r3)
                okhttp3.Cache$CacheResponseBody$1 r3 = new okhttp3.Cache$CacheResponseBody$1
                r3.<init>(r2, r1)
                okio.Source r3 = (okio.Source) r3
                okio.BufferedSource r2 = okio.Okio.buffer(r3)
                r1.bodySource = r2
                return
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
                r3 = this;
                java.lang.String r0 = r3.contentLength
                r1 = -1
                if (r0 == 0) goto La
                long r1 = okhttp3.internal.Util.toLongOrDefault(r0, r1)
            La:
                return r1
        }

        @Override // okhttp3.ResponseBody
        public okhttp3.MediaType contentType() {
                r2 = this;
                java.lang.String r0 = r2.contentType
                if (r0 == 0) goto Lb
                okhttp3.MediaType$Companion r1 = okhttp3.MediaType.Companion
                okhttp3.MediaType r0 = r1.parse(r0)
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        public final okhttp3.internal.cache.DiskLruCache.Snapshot getSnapshot() {
                r1 = this;
                okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r1.snapshot
                return r0
        }

        @Override // okhttp3.ResponseBody
        public okio.BufferedSource source() {
                r1 = this;
                okio.BufferedSource r0 = r1.bodySource
                return r0
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ\n\u0010\u001b\u001a\u00020\u0015*\u00020\u0017J\u0012\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001d*\u00020\u0011H\u0002J\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lokhttp3/Cache$Companion;", "", "()V", "ENTRY_BODY", "", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "key", "", "url", "Lokhttp3/HttpUrl;", "readInt", "source", "Lokio/BufferedSource;", "readInt$okhttp", "varyHeaders", "Lokhttp3/Headers;", "requestHeaders", "responseHeaders", "varyMatches", "", "cachedResponse", "Lokhttp3/Response;", "cachedRequest", "newRequest", "Lokhttp3/Request;", "hasVaryAll", "varyFields", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

        private final java.util.Set<java.lang.String> varyFields(okhttp3.Headers r14) {
                r13 = this;
                int r0 = r14.size()
                r1 = 0
                r2 = 0
                r3 = r2
            L7:
                if (r3 >= r0) goto L5c
                java.lang.String r4 = "Vary"
                java.lang.String r5 = r14.name(r3)
                r6 = 1
                boolean r4 = kotlin.text.StringsKt.equals(r4, r5, r6)
                if (r4 != 0) goto L17
                goto L59
            L17:
                java.lang.String r4 = r14.value(r3)
                if (r1 != 0) goto L2a
                java.util.TreeSet r1 = new java.util.TreeSet
                kotlin.jvm.internal.StringCompanionObject r5 = kotlin.jvm.internal.StringCompanionObject.INSTANCE
                java.util.Comparator r5 = kotlin.text.StringsKt.getCASE_INSENSITIVE_ORDER(r5)
                r1.<init>(r5)
                java.util.Set r1 = (java.util.Set) r1
            L2a:
                r7 = r4
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                char[] r8 = new char[r6]
                r4 = 44
                r8[r2] = r4
                r11 = 6
                r12 = 0
                r9 = 0
                r10 = 0
                java.util.List r4 = kotlin.text.StringsKt.split$default(r7, r8, r9, r10, r11, r12)
                java.util.Iterator r4 = r4.iterator()
            L3f:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L59
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                java.lang.CharSequence r5 = kotlin.text.StringsKt.trim(r5)
                java.lang.String r5 = r5.toString()
                r1.add(r5)
                goto L3f
            L59:
                int r3 = r3 + 1
                goto L7
            L5c:
                if (r1 != 0) goto L62
                java.util.Set r1 = kotlin.collections.SetsKt.emptySet()
            L62:
                return r1
        }

        private final okhttp3.Headers varyHeaders(okhttp3.Headers r6, okhttp3.Headers r7) {
                r5 = this;
                java.util.Set r7 = r5.varyFields(r7)
                boolean r0 = r7.isEmpty()
                if (r0 == 0) goto Ld
                okhttp3.Headers r6 = okhttp3.internal.Util.EMPTY_HEADERS
                return r6
            Ld:
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
                r0.<init>()
                int r1 = r6.size()
                r2 = 0
            L17:
                if (r2 >= r1) goto L2d
                java.lang.String r3 = r6.name(r2)
                boolean r4 = r7.contains(r3)
                if (r4 == 0) goto L2a
                java.lang.String r4 = r6.value(r2)
                r0.add(r3, r4)
            L2a:
                int r2 = r2 + 1
                goto L17
            L2d:
                okhttp3.Headers r6 = r0.build()
                return r6
        }

        public final boolean hasVaryAll(okhttp3.Response r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.Headers r2 = r2.headers()
                java.util.Set r2 = r1.varyFields(r2)
                java.lang.String r0 = "*"
                boolean r2 = r2.contains(r0)
                return r2
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String key(okhttp3.HttpUrl r2) {
                r1 = this;
                java.lang.String r0 = "url"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.ByteString$Companion r0 = okio.ByteString.Companion
                java.lang.String r2 = r2.toString()
                okio.ByteString r2 = r0.encodeUtf8(r2)
                okio.ByteString r2 = r2.md5()
                java.lang.String r2 = r2.hex()
                return r2
        }

        public final int readInt$okhttp(okio.BufferedSource r6) throws java.io.IOException {
                r5 = this;
                java.lang.String r0 = "expected an int but was \""
                java.lang.String r1 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
                long r1 = r6.readDecimalLong()     // Catch: java.lang.NumberFormatException -> L44
                java.lang.String r6 = r6.readUtf8LineStrict()     // Catch: java.lang.NumberFormatException -> L44
                r3 = 0
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 < 0) goto L27
                r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r3 > 0) goto L27
                r3 = r6
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.NumberFormatException -> L44
                int r3 = r3.length()     // Catch: java.lang.NumberFormatException -> L44
                if (r3 > 0) goto L27
                int r6 = (int) r1     // Catch: java.lang.NumberFormatException -> L44
                return r6
            L27:
                java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.NumberFormatException -> L44
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L44
                r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> L44
                java.lang.StringBuilder r0 = r4.append(r1)     // Catch: java.lang.NumberFormatException -> L44
                java.lang.StringBuilder r6 = r0.append(r6)     // Catch: java.lang.NumberFormatException -> L44
                r0 = 34
                java.lang.StringBuilder r6 = r6.append(r0)     // Catch: java.lang.NumberFormatException -> L44
                java.lang.String r6 = r6.toString()     // Catch: java.lang.NumberFormatException -> L44
                r3.<init>(r6)     // Catch: java.lang.NumberFormatException -> L44
                throw r3     // Catch: java.lang.NumberFormatException -> L44
            L44:
                r6 = move-exception
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r6 = r6.getMessage()
                r0.<init>(r6)
                throw r0
        }

        public final okhttp3.Headers varyHeaders(okhttp3.Response r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.Response r0 = r2.networkResponse()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                okhttp3.Request r0 = r0.request()
                okhttp3.Headers r0 = r0.headers()
                okhttp3.Headers r2 = r2.headers()
                okhttp3.Headers r2 = r1.varyHeaders(r0, r2)
                return r2
        }

        public final boolean varyMatches(okhttp3.Response r4, okhttp3.Headers r5, okhttp3.Request r6) {
                r3 = this;
                java.lang.String r0 = "cachedResponse"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "cachedRequest"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "newRequest"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                okhttp3.Headers r4 = r4.headers()
                java.util.Set r4 = r3.varyFields(r4)
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                boolean r0 = r4 instanceof java.util.Collection
                r1 = 1
                if (r0 == 0) goto L28
                r0 = r4
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L28
                goto L47
            L28:
                java.util.Iterator r4 = r4.iterator()
            L2c:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L47
                java.lang.Object r0 = r4.next()
                java.lang.String r0 = (java.lang.String) r0
                java.util.List r2 = r5.values(r0)
                java.util.List r0 = r6.headers(r0)
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
                if (r0 != 0) goto L2c
                r1 = 0
            L47:
                return r1
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\u0010$\u001a\u00060%R\u00020&J\u001e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u0012\u0010,\u001a\u00020(2\n\u0010-\u001a\u00060.R\u00020&R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lokhttp3/Cache$Entry;", "", "rawSource", "Lokio/Source;", "(Lokio/Source;)V", "response", "Lokhttp3/Response;", "(Lokhttp3/Response;)V", "code", "", "handshake", "Lokhttp3/Handshake;", "isHttps", "", "()Z", "message", "", "protocol", "Lokhttp3/Protocol;", "receivedResponseMillis", "", "requestMethod", "responseHeaders", "Lokhttp3/Headers;", "sentRequestMillis", "url", "Lokhttp3/HttpUrl;", "varyHeaders", "matches", "request", "Lokhttp3/Request;", "readCertificateList", "", "Ljava/security/cert/Certificate;", "source", "Lokio/BufferedSource;", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "writeCertList", "", "sink", "Lokio/BufferedSink;", "certificates", "writeTo", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Entry {
        public static final okhttp3.Cache.Entry.Companion Companion = null;
        private static final java.lang.String RECEIVED_MILLIS = null;
        private static final java.lang.String SENT_MILLIS = null;
        private final int code;
        private final okhttp3.Handshake handshake;
        private final java.lang.String message;
        private final okhttp3.Protocol protocol;
        private final long receivedResponseMillis;
        private final java.lang.String requestMethod;
        private final okhttp3.Headers responseHeaders;
        private final long sentRequestMillis;
        private final okhttp3.HttpUrl url;
        private final okhttp3.Headers varyHeaders;

        /* JADX INFO: compiled from: Cache.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/Cache$Entry$Companion;", "", "()V", "RECEIVED_MILLIS", "", "SENT_MILLIS", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
        }

        static {
                okhttp3.Cache$Entry$Companion r0 = new okhttp3.Cache$Entry$Companion
                r1 = 0
                r0.<init>(r1)
                okhttp3.Cache.Entry.Companion = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
                okhttp3.internal.platform.Platform r1 = r1.get()
                java.lang.String r1 = r1.getPrefix()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "-Sent-Millis"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                okhttp3.Cache.Entry.SENT_MILLIS = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                okhttp3.internal.platform.Platform$Companion r1 = okhttp3.internal.platform.Platform.Companion
                okhttp3.internal.platform.Platform r1 = r1.get()
                java.lang.String r1 = r1.getPrefix()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "-Received-Millis"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                okhttp3.Cache.Entry.RECEIVED_MILLIS = r0
                return
        }

        public Entry(okhttp3.Response r3) {
                r2 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r2.<init>()
                okhttp3.Request r0 = r3.request()
                okhttp3.HttpUrl r0 = r0.url()
                r2.url = r0
                okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
                okhttp3.Headers r0 = r0.varyHeaders(r3)
                r2.varyHeaders = r0
                okhttp3.Request r0 = r3.request()
                java.lang.String r0 = r0.method()
                r2.requestMethod = r0
                okhttp3.Protocol r0 = r3.protocol()
                r2.protocol = r0
                int r0 = r3.code()
                r2.code = r0
                java.lang.String r0 = r3.message()
                r2.message = r0
                okhttp3.Headers r0 = r3.headers()
                r2.responseHeaders = r0
                okhttp3.Handshake r0 = r3.handshake()
                r2.handshake = r0
                long r0 = r3.sentRequestAtMillis()
                r2.sentRequestMillis = r0
                long r0 = r3.receivedResponseAtMillis()
                r2.receivedResponseMillis = r0
                return
        }

        public Entry(okio.Source r9) throws java.io.IOException {
                r8 = this;
                java.lang.String r0 = "Cache corruption for "
                java.lang.String r1 = "rawSource"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
                r8.<init>()
                r1 = r9
                java.io.Closeable r1 = (java.io.Closeable) r1
                r2 = r1
                okio.Source r2 = (okio.Source) r2     // Catch: java.lang.Throwable -> L12d
                okio.BufferedSource r9 = okio.Okio.buffer(r9)     // Catch: java.lang.Throwable -> L12d
                java.lang.String r2 = r9.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L12d
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion     // Catch: java.lang.Throwable -> L12d
                okhttp3.HttpUrl r3 = r3.parse(r2)     // Catch: java.lang.Throwable -> L12d
                if (r3 == 0) goto L109
                r8.url = r3     // Catch: java.lang.Throwable -> L12d
                java.lang.String r0 = r9.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L12d
                r8.requestMethod = r0     // Catch: java.lang.Throwable -> L12d
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder     // Catch: java.lang.Throwable -> L12d
                r0.<init>()     // Catch: java.lang.Throwable -> L12d
                okhttp3.Cache$Companion r2 = okhttp3.Cache.Companion     // Catch: java.lang.Throwable -> L12d
                int r2 = r2.readInt$okhttp(r9)     // Catch: java.lang.Throwable -> L12d
                r3 = 0
                r4 = r3
            L35:
                if (r4 >= r2) goto L41
                java.lang.String r5 = r9.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L12d
                r0.addLenient$okhttp(r5)     // Catch: java.lang.Throwable -> L12d
                int r4 = r4 + 1
                goto L35
            L41:
                okhttp3.Headers r0 = r0.build()     // Catch: java.lang.Throwable -> L12d
                r8.varyHeaders = r0     // Catch: java.lang.Throwable -> L12d
                okhttp3.internal.http.StatusLine$Companion r0 = okhttp3.internal.http.StatusLine.Companion     // Catch: java.lang.Throwable -> L12d
                java.lang.String r2 = r9.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L12d
                okhttp3.internal.http.StatusLine r0 = r0.parse(r2)     // Catch: java.lang.Throwable -> L12d
                okhttp3.Protocol r2 = r0.protocol     // Catch: java.lang.Throwable -> L12d
                r8.protocol = r2     // Catch: java.lang.Throwable -> L12d
                int r2 = r0.code     // Catch: java.lang.Throwable -> L12d
                r8.code = r2     // Catch: java.lang.Throwable -> L12d
                java.lang.String r0 = r0.message     // Catch: java.lang.Throwable -> L12d
                r8.message = r0     // Catch: java.lang.Throwable -> L12d
                okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder     // Catch: java.lang.Throwable -> L12d
                r0.<init>()     // Catch: java.lang.Throwable -> L12d
                okhttp3.Cache$Companion r2 = okhttp3.Cache.Companion     // Catch: java.lang.Throwable -> L12d
                int r2 = r2.readInt$okhttp(r9)     // Catch: java.lang.Throwable -> L12d
            L68:
                if (r3 >= r2) goto L74
                java.lang.String r4 = r9.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L12d
                r0.addLenient$okhttp(r4)     // Catch: java.lang.Throwable -> L12d
                int r3 = r3 + 1
                goto L68
            L74:
                java.lang.String r2 = okhttp3.Cache.Entry.SENT_MILLIS     // Catch: java.lang.Throwable -> L12d
                java.lang.String r3 = r0.get(r2)     // Catch: java.lang.Throwable -> L12d
                java.lang.String r4 = okhttp3.Cache.Entry.RECEIVED_MILLIS     // Catch: java.lang.Throwable -> L12d
                java.lang.String r5 = r0.get(r4)     // Catch: java.lang.Throwable -> L12d
                r0.removeAll(r2)     // Catch: java.lang.Throwable -> L12d
                r0.removeAll(r4)     // Catch: java.lang.Throwable -> L12d
                r6 = 0
                if (r3 == 0) goto L8f
                long r2 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L12d
                goto L90
            L8f:
                r2 = r6
            L90:
                r8.sentRequestMillis = r2     // Catch: java.lang.Throwable -> L12d
                if (r5 == 0) goto L98
                long r6 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Throwable -> L12d
            L98:
                r8.receivedResponseMillis = r6     // Catch: java.lang.Throwable -> L12d
                okhttp3.Headers r0 = r0.build()     // Catch: java.lang.Throwable -> L12d
                r8.responseHeaders = r0     // Catch: java.lang.Throwable -> L12d
                boolean r0 = r8.isHttps()     // Catch: java.lang.Throwable -> L12d
                r2 = 0
                if (r0 == 0) goto L101
                java.lang.String r0 = r9.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L12d
                r3 = r0
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch: java.lang.Throwable -> L12d
                int r3 = r3.length()     // Catch: java.lang.Throwable -> L12d
                if (r3 > 0) goto Le2
                java.lang.String r0 = r9.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L12d
                okhttp3.CipherSuite$Companion r3 = okhttp3.CipherSuite.Companion     // Catch: java.lang.Throwable -> L12d
                okhttp3.CipherSuite r0 = r3.forJavaName(r0)     // Catch: java.lang.Throwable -> L12d
                java.util.List r3 = r8.readCertificateList(r9)     // Catch: java.lang.Throwable -> L12d
                java.util.List r4 = r8.readCertificateList(r9)     // Catch: java.lang.Throwable -> L12d
                boolean r5 = r9.exhausted()     // Catch: java.lang.Throwable -> L12d
                if (r5 != 0) goto Ld7
                okhttp3.TlsVersion$Companion r5 = okhttp3.TlsVersion.Companion     // Catch: java.lang.Throwable -> L12d
                java.lang.String r9 = r9.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L12d
                okhttp3.TlsVersion r9 = r5.forJavaName(r9)     // Catch: java.lang.Throwable -> L12d
                goto Ld9
            Ld7:
                okhttp3.TlsVersion r9 = okhttp3.TlsVersion.SSL_3_0     // Catch: java.lang.Throwable -> L12d
            Ld9:
                okhttp3.Handshake$Companion r5 = okhttp3.Handshake.Companion     // Catch: java.lang.Throwable -> L12d
                okhttp3.Handshake r9 = r5.get(r9, r0, r3, r4)     // Catch: java.lang.Throwable -> L12d
                r8.handshake = r9     // Catch: java.lang.Throwable -> L12d
                goto L103
            Le2:
                java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L12d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12d
                r2.<init>()     // Catch: java.lang.Throwable -> L12d
                java.lang.String r3 = "expected \"\" but was \""
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L12d
                java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L12d
                r2 = 34
                java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L12d
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12d
                r9.<init>(r0)     // Catch: java.lang.Throwable -> L12d
                throw r9     // Catch: java.lang.Throwable -> L12d
            L101:
                r8.handshake = r2     // Catch: java.lang.Throwable -> L12d
            L103:
                kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L12d
                kotlin.io.CloseableKt.closeFinally(r1, r2)
                return
            L109:
                java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L12d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12d
                r3.<init>(r0)     // Catch: java.lang.Throwable -> L12d
                java.lang.StringBuilder r0 = r3.append(r2)     // Catch: java.lang.Throwable -> L12d
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12d
                r9.<init>(r0)     // Catch: java.lang.Throwable -> L12d
                okhttp3.internal.platform.Platform$Companion r0 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> L12d
                okhttp3.internal.platform.Platform r0 = r0.get()     // Catch: java.lang.Throwable -> L12d
                java.lang.String r2 = "cache corruption"
                r3 = r9
                java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Throwable -> L12d
                r4 = 5
                r0.log(r2, r4, r3)     // Catch: java.lang.Throwable -> L12d
                java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch: java.lang.Throwable -> L12d
                throw r9     // Catch: java.lang.Throwable -> L12d
            L12d:
                r9 = move-exception
                throw r9     // Catch: java.lang.Throwable -> L12f
            L12f:
                r0 = move-exception
                kotlin.io.CloseableKt.closeFinally(r1, r9)
                throw r0
        }

        private final boolean isHttps() {
                r2 = this;
                okhttp3.HttpUrl r0 = r2.url
                java.lang.String r0 = r0.scheme()
                java.lang.String r1 = "https"
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                return r0
        }

        private final java.util.List<java.security.cert.Certificate> readCertificateList(okio.BufferedSource r8) throws java.io.IOException {
                r7 = this;
                okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
                int r0 = r0.readInt$okhttp(r8)
                r1 = -1
                if (r0 != r1) goto Le
                java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
                return r8
            Le:
                java.lang.String r1 = "X.509"
                java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.security.cert.CertificateException -> L49
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.security.cert.CertificateException -> L49
                r2.<init>(r0)     // Catch: java.security.cert.CertificateException -> L49
                r3 = 0
            L1a:
                if (r3 >= r0) goto L46
                java.lang.String r4 = r8.readUtf8LineStrict()     // Catch: java.security.cert.CertificateException -> L49
                okio.Buffer r5 = new okio.Buffer     // Catch: java.security.cert.CertificateException -> L49
                r5.<init>()     // Catch: java.security.cert.CertificateException -> L49
                okio.ByteString$Companion r6 = okio.ByteString.Companion     // Catch: java.security.cert.CertificateException -> L49
                okio.ByteString r4 = r6.decodeBase64(r4)     // Catch: java.security.cert.CertificateException -> L49
                if (r4 == 0) goto L3e
                r5.write(r4)     // Catch: java.security.cert.CertificateException -> L49
                java.io.InputStream r4 = r5.inputStream()     // Catch: java.security.cert.CertificateException -> L49
                java.security.cert.Certificate r4 = r1.generateCertificate(r4)     // Catch: java.security.cert.CertificateException -> L49
                r2.add(r4)     // Catch: java.security.cert.CertificateException -> L49
                int r3 = r3 + 1
                goto L1a
            L3e:
                java.io.IOException r8 = new java.io.IOException     // Catch: java.security.cert.CertificateException -> L49
                java.lang.String r0 = "Corrupt certificate in cache entry"
                r8.<init>(r0)     // Catch: java.security.cert.CertificateException -> L49
                throw r8     // Catch: java.security.cert.CertificateException -> L49
            L46:
                java.util.List r2 = (java.util.List) r2     // Catch: java.security.cert.CertificateException -> L49
                return r2
            L49:
                r8 = move-exception
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r8 = r8.getMessage()
                r0.<init>(r8)
                throw r0
        }

        private final void writeCertList(okio.BufferedSink r9, java.util.List<? extends java.security.cert.Certificate> r10) throws java.io.IOException {
                r8 = this;
                int r0 = r10.size()     // Catch: java.security.cert.CertificateEncodingException -> L3e
                long r0 = (long) r0     // Catch: java.security.cert.CertificateEncodingException -> L3e
                okio.BufferedSink r0 = r9.writeDecimalLong(r0)     // Catch: java.security.cert.CertificateEncodingException -> L3e
                r1 = 10
                r0.writeByte(r1)     // Catch: java.security.cert.CertificateEncodingException -> L3e
                java.util.Iterator r10 = r10.iterator()     // Catch: java.security.cert.CertificateEncodingException -> L3e
            L12:
                boolean r0 = r10.hasNext()     // Catch: java.security.cert.CertificateEncodingException -> L3e
                if (r0 == 0) goto L3d
                java.lang.Object r0 = r10.next()     // Catch: java.security.cert.CertificateEncodingException -> L3e
                java.security.cert.Certificate r0 = (java.security.cert.Certificate) r0     // Catch: java.security.cert.CertificateEncodingException -> L3e
                byte[] r3 = r0.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> L3e
                okio.ByteString$Companion r2 = okio.ByteString.Companion     // Catch: java.security.cert.CertificateEncodingException -> L3e
                java.lang.String r0 = "bytes"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)     // Catch: java.security.cert.CertificateEncodingException -> L3e
                r6 = 3
                r7 = 0
                r4 = 0
                r5 = 0
                okio.ByteString r0 = okio.ByteString.Companion.of$default(r2, r3, r4, r5, r6, r7)     // Catch: java.security.cert.CertificateEncodingException -> L3e
                java.lang.String r0 = r0.base64()     // Catch: java.security.cert.CertificateEncodingException -> L3e
                okio.BufferedSink r0 = r9.writeUtf8(r0)     // Catch: java.security.cert.CertificateEncodingException -> L3e
                r0.writeByte(r1)     // Catch: java.security.cert.CertificateEncodingException -> L3e
                goto L12
            L3d:
                return
            L3e:
                r9 = move-exception
                java.io.IOException r10 = new java.io.IOException
                java.lang.String r9 = r9.getMessage()
                r10.<init>(r9)
                throw r10
        }

        public final boolean matches(okhttp3.Request r3, okhttp3.Response r4) {
                r2 = this;
                java.lang.String r0 = "request"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                okhttp3.HttpUrl r0 = r2.url
                okhttp3.HttpUrl r1 = r3.url()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L2e
                java.lang.String r0 = r2.requestMethod
                java.lang.String r1 = r3.method()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L2e
                okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
                okhttp3.Headers r1 = r2.varyHeaders
                boolean r3 = r0.varyMatches(r4, r1, r3)
                if (r3 == 0) goto L2e
                r3 = 1
                goto L2f
            L2e:
                r3 = 0
            L2f:
                return r3
        }

        public final okhttp3.Response response(okhttp3.internal.cache.DiskLruCache.Snapshot r6) {
                r5 = this;
                java.lang.String r0 = "snapshot"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                okhttp3.Headers r0 = r5.responseHeaders
                java.lang.String r1 = "Content-Type"
                java.lang.String r0 = r0.get(r1)
                okhttp3.Headers r1 = r5.responseHeaders
                java.lang.String r2 = "Content-Length"
                java.lang.String r1 = r1.get(r2)
                okhttp3.Request$Builder r2 = new okhttp3.Request$Builder
                r2.<init>()
                okhttp3.HttpUrl r3 = r5.url
                okhttp3.Request$Builder r2 = r2.url(r3)
                java.lang.String r3 = r5.requestMethod
                r4 = 0
                okhttp3.Request$Builder r2 = r2.method(r3, r4)
                okhttp3.Headers r3 = r5.varyHeaders
                okhttp3.Request$Builder r2 = r2.headers(r3)
                okhttp3.Request r2 = r2.build()
                okhttp3.Response$Builder r3 = new okhttp3.Response$Builder
                r3.<init>()
                okhttp3.Response$Builder r2 = r3.request(r2)
                okhttp3.Protocol r3 = r5.protocol
                okhttp3.Response$Builder r2 = r2.protocol(r3)
                int r3 = r5.code
                okhttp3.Response$Builder r2 = r2.code(r3)
                java.lang.String r3 = r5.message
                okhttp3.Response$Builder r2 = r2.message(r3)
                okhttp3.Headers r3 = r5.responseHeaders
                okhttp3.Response$Builder r2 = r2.headers(r3)
                okhttp3.Cache$CacheResponseBody r3 = new okhttp3.Cache$CacheResponseBody
                r3.<init>(r6, r0, r1)
                okhttp3.ResponseBody r3 = (okhttp3.ResponseBody) r3
                okhttp3.Response$Builder r6 = r2.body(r3)
                okhttp3.Handshake r0 = r5.handshake
                okhttp3.Response$Builder r6 = r6.handshake(r0)
                long r0 = r5.sentRequestMillis
                okhttp3.Response$Builder r6 = r6.sentRequestAtMillis(r0)
                long r0 = r5.receivedResponseMillis
                okhttp3.Response$Builder r6 = r6.receivedResponseAtMillis(r0)
                okhttp3.Response r6 = r6.build()
                return r6
        }

        public final void writeTo(okhttp3.internal.cache.DiskLruCache.Editor r9) throws java.io.IOException {
                r8 = this;
                java.lang.String r0 = "editor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r0 = 0
                okio.Sink r9 = r9.newSink(r0)
                okio.BufferedSink r9 = okio.Okio.buffer(r9)
                java.io.Closeable r9 = (java.io.Closeable) r9
                r1 = r9
                okio.BufferedSink r1 = (okio.BufferedSink) r1     // Catch: java.lang.Throwable -> L11b
                okhttp3.HttpUrl r2 = r8.url     // Catch: java.lang.Throwable -> L11b
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r2 = r1.writeUtf8(r2)     // Catch: java.lang.Throwable -> L11b
                r3 = 10
                r2.writeByte(r3)     // Catch: java.lang.Throwable -> L11b
                java.lang.String r2 = r8.requestMethod     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r2 = r1.writeUtf8(r2)     // Catch: java.lang.Throwable -> L11b
                r2.writeByte(r3)     // Catch: java.lang.Throwable -> L11b
                okhttp3.Headers r2 = r8.varyHeaders     // Catch: java.lang.Throwable -> L11b
                int r2 = r2.size()     // Catch: java.lang.Throwable -> L11b
                long r4 = (long) r2     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r2 = r1.writeDecimalLong(r4)     // Catch: java.lang.Throwable -> L11b
                r2.writeByte(r3)     // Catch: java.lang.Throwable -> L11b
                okhttp3.Headers r2 = r8.varyHeaders     // Catch: java.lang.Throwable -> L11b
                int r2 = r2.size()     // Catch: java.lang.Throwable -> L11b
                r4 = r0
            L40:
                java.lang.String r5 = ": "
                if (r4 >= r2) goto L62
                okhttp3.Headers r6 = r8.varyHeaders     // Catch: java.lang.Throwable -> L11b
                java.lang.String r6 = r6.name(r4)     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r6 = r1.writeUtf8(r6)     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r5 = r6.writeUtf8(r5)     // Catch: java.lang.Throwable -> L11b
                okhttp3.Headers r6 = r8.varyHeaders     // Catch: java.lang.Throwable -> L11b
                java.lang.String r6 = r6.value(r4)     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r5 = r5.writeUtf8(r6)     // Catch: java.lang.Throwable -> L11b
                r5.writeByte(r3)     // Catch: java.lang.Throwable -> L11b
                int r4 = r4 + 1
                goto L40
            L62:
                okhttp3.internal.http.StatusLine r2 = new okhttp3.internal.http.StatusLine     // Catch: java.lang.Throwable -> L11b
                okhttp3.Protocol r4 = r8.protocol     // Catch: java.lang.Throwable -> L11b
                int r6 = r8.code     // Catch: java.lang.Throwable -> L11b
                java.lang.String r7 = r8.message     // Catch: java.lang.Throwable -> L11b
                r2.<init>(r4, r6, r7)     // Catch: java.lang.Throwable -> L11b
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r2 = r1.writeUtf8(r2)     // Catch: java.lang.Throwable -> L11b
                r2.writeByte(r3)     // Catch: java.lang.Throwable -> L11b
                okhttp3.Headers r2 = r8.responseHeaders     // Catch: java.lang.Throwable -> L11b
                int r2 = r2.size()     // Catch: java.lang.Throwable -> L11b
                int r2 = r2 + 2
                long r6 = (long) r2     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r2 = r1.writeDecimalLong(r6)     // Catch: java.lang.Throwable -> L11b
                r2.writeByte(r3)     // Catch: java.lang.Throwable -> L11b
                okhttp3.Headers r2 = r8.responseHeaders     // Catch: java.lang.Throwable -> L11b
                int r2 = r2.size()     // Catch: java.lang.Throwable -> L11b
            L8e:
                if (r0 >= r2) goto Lae
                okhttp3.Headers r4 = r8.responseHeaders     // Catch: java.lang.Throwable -> L11b
                java.lang.String r4 = r4.name(r0)     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r4 = r1.writeUtf8(r4)     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r4 = r4.writeUtf8(r5)     // Catch: java.lang.Throwable -> L11b
                okhttp3.Headers r6 = r8.responseHeaders     // Catch: java.lang.Throwable -> L11b
                java.lang.String r6 = r6.value(r0)     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r4 = r4.writeUtf8(r6)     // Catch: java.lang.Throwable -> L11b
                r4.writeByte(r3)     // Catch: java.lang.Throwable -> L11b
                int r0 = r0 + 1
                goto L8e
            Lae:
                java.lang.String r0 = okhttp3.Cache.Entry.SENT_MILLIS     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r0 = r1.writeUtf8(r0)     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r0 = r0.writeUtf8(r5)     // Catch: java.lang.Throwable -> L11b
                long r6 = r8.sentRequestMillis     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r0 = r0.writeDecimalLong(r6)     // Catch: java.lang.Throwable -> L11b
                r0.writeByte(r3)     // Catch: java.lang.Throwable -> L11b
                java.lang.String r0 = okhttp3.Cache.Entry.RECEIVED_MILLIS     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r0 = r1.writeUtf8(r0)     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r0 = r0.writeUtf8(r5)     // Catch: java.lang.Throwable -> L11b
                long r4 = r8.receivedResponseMillis     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r0 = r0.writeDecimalLong(r4)     // Catch: java.lang.Throwable -> L11b
                r0.writeByte(r3)     // Catch: java.lang.Throwable -> L11b
                boolean r0 = r8.isHttps()     // Catch: java.lang.Throwable -> L11b
                if (r0 == 0) goto L114
                r1.writeByte(r3)     // Catch: java.lang.Throwable -> L11b
                okhttp3.Handshake r0 = r8.handshake     // Catch: java.lang.Throwable -> L11b
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L11b
                okhttp3.CipherSuite r0 = r0.cipherSuite()     // Catch: java.lang.Throwable -> L11b
                java.lang.String r0 = r0.javaName()     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r0 = r1.writeUtf8(r0)     // Catch: java.lang.Throwable -> L11b
                r0.writeByte(r3)     // Catch: java.lang.Throwable -> L11b
                okhttp3.Handshake r0 = r8.handshake     // Catch: java.lang.Throwable -> L11b
                java.util.List r0 = r0.peerCertificates()     // Catch: java.lang.Throwable -> L11b
                r8.writeCertList(r1, r0)     // Catch: java.lang.Throwable -> L11b
                okhttp3.Handshake r0 = r8.handshake     // Catch: java.lang.Throwable -> L11b
                java.util.List r0 = r0.localCertificates()     // Catch: java.lang.Throwable -> L11b
                r8.writeCertList(r1, r0)     // Catch: java.lang.Throwable -> L11b
                okhttp3.Handshake r0 = r8.handshake     // Catch: java.lang.Throwable -> L11b
                okhttp3.TlsVersion r0 = r0.tlsVersion()     // Catch: java.lang.Throwable -> L11b
                java.lang.String r0 = r0.javaName()     // Catch: java.lang.Throwable -> L11b
                okio.BufferedSink r0 = r1.writeUtf8(r0)     // Catch: java.lang.Throwable -> L11b
                r0.writeByte(r3)     // Catch: java.lang.Throwable -> L11b
            L114:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L11b
                r0 = 0
                kotlin.io.CloseableKt.closeFinally(r9, r0)
                return
            L11b:
                r0 = move-exception
                throw r0     // Catch: java.lang.Throwable -> L11d
            L11d:
                r1 = move-exception
                kotlin.io.CloseableKt.closeFinally(r9, r0)
                throw r1
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0012\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "(Lokhttp3/Cache;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "body", "Lokio/Sink;", "cacheOut", "done", "", "getDone", "()Z", "setDone", "(Z)V", "abort", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class RealCacheRequest implements okhttp3.internal.cache.CacheRequest {
        private final okio.Sink body;
        private final okio.Sink cacheOut;
        private boolean done;
        private final okhttp3.internal.cache.DiskLruCache.Editor editor;
        final /* synthetic */ okhttp3.Cache this$0;


        public RealCacheRequest(okhttp3.Cache r2, okhttp3.internal.cache.DiskLruCache.Editor r3) {
                r1 = this;
                java.lang.String r0 = "editor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.editor = r3
                r0 = 1
                okio.Sink r3 = r3.newSink(r0)
                r1.cacheOut = r3
                okhttp3.Cache$RealCacheRequest$1 r0 = new okhttp3.Cache$RealCacheRequest$1
                r0.<init>(r2, r1, r3)
                okio.Sink r0 = (okio.Sink) r0
                r1.body = r0
                return
        }

        public static final /* synthetic */ okhttp3.internal.cache.DiskLruCache.Editor access$getEditor$p(okhttp3.Cache.RealCacheRequest r0) {
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r0.editor
                return r0
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
                r3 = this;
                okhttp3.Cache r0 = r3.this$0
                monitor-enter(r0)
                boolean r1 = r3.done     // Catch: java.lang.Throwable -> L22
                if (r1 == 0) goto L9
                monitor-exit(r0)
                return
            L9:
                r1 = 1
                r3.done = r1     // Catch: java.lang.Throwable -> L22
                int r2 = r0.getWriteAbortCount$okhttp()     // Catch: java.lang.Throwable -> L22
                int r2 = r2 + r1
                r0.setWriteAbortCount$okhttp(r2)     // Catch: java.lang.Throwable -> L22
                monitor-exit(r0)
                okio.Sink r0 = r3.cacheOut
                java.io.Closeable r0 = (java.io.Closeable) r0
                okhttp3.internal.Util.closeQuietly(r0)
                okhttp3.internal.cache.DiskLruCache$Editor r0 = r3.editor     // Catch: java.io.IOException -> L21
                r0.abort()     // Catch: java.io.IOException -> L21
            L21:
                return
            L22:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public okio.Sink body() {
                r1 = this;
                okio.Sink r0 = r1.body
                return r0
        }

        public final boolean getDone() {
                r1 = this;
                boolean r0 = r1.done
                return r0
        }

        public final void setDone(boolean r1) {
                r0 = this;
                r0.done = r1
                return
        }
    }

    /* JADX INFO: renamed from: okhttp3.Cache$urls$1, reason: invalid class name */
    /* JADX INFO: compiled from: Cache.kt */
    @kotlin.Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\t\u001a\u00020\u0004H\u0096\u0002J\t\u0010\n\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"okhttp3/Cache$urls$1", "", "", "canRemove", "", "delegate", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "nextUrl", "hasNext", "next", "remove", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<java.lang.String>, kotlin.jvm.internal.markers.KMutableIterator {
        private boolean canRemove;
        private final java.util.Iterator<okhttp3.internal.cache.DiskLruCache.Snapshot> delegate;
        private java.lang.String nextUrl;

        AnonymousClass1(okhttp3.Cache r1) {
                r0 = this;
                r0.<init>()
                okhttp3.internal.cache.DiskLruCache r1 = r1.getCache$okhttp()
                java.util.Iterator r1 = r1.snapshots()
                r0.delegate = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r5 = this;
                java.lang.String r0 = r5.nextUrl
                r1 = 1
                if (r0 == 0) goto L6
                return r1
            L6:
                r0 = 0
                r5.canRemove = r0
            L9:
                java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r2 = r5.delegate
                boolean r2 = r2.hasNext()
                if (r2 == 0) goto L36
                java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r2 = r5.delegate     // Catch: java.io.IOException -> L9
                java.lang.Object r2 = r2.next()     // Catch: java.io.IOException -> L9
                java.io.Closeable r2 = (java.io.Closeable) r2     // Catch: java.io.IOException -> L9
                r3 = r2
                okhttp3.internal.cache.DiskLruCache$Snapshot r3 = (okhttp3.internal.cache.DiskLruCache.Snapshot) r3     // Catch: java.lang.Throwable -> L2f
                okio.Source r3 = r3.getSource(r0)     // Catch: java.lang.Throwable -> L2f
                okio.BufferedSource r3 = okio.Okio.buffer(r3)     // Catch: java.lang.Throwable -> L2f
                java.lang.String r3 = r3.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L2f
                r5.nextUrl = r3     // Catch: java.lang.Throwable -> L2f
                r3 = 0
                kotlin.io.CloseableKt.closeFinally(r2, r3)     // Catch: java.io.IOException -> L9
                return r1
            L2f:
                r3 = move-exception
                throw r3     // Catch: java.lang.Throwable -> L31
            L31:
                r4 = move-exception
                kotlin.io.CloseableKt.closeFinally(r2, r3)     // Catch: java.io.IOException -> L9
                throw r4     // Catch: java.io.IOException -> L9
            L36:
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.String next() {
                r1 = this;
                java.lang.String r0 = r1.next2()
                return r0
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
        public java.lang.String next2() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L12
                java.lang.String r0 = r2.nextUrl
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r1 = 0
                r2.nextUrl = r1
                r1 = 1
                r2.canRemove = r1
                return r0
            L12:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.canRemove
                if (r0 == 0) goto La
                java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r0 = r2.delegate
                r0.remove()
                return
            La:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "remove() before next()"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            okhttp3.Cache$Companion r0 = new okhttp3.Cache$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.Cache.Companion = r0
            return
    }

    public Cache(java.io.File r2, long r3) {
            r1 = this;
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okhttp3.internal.io.FileSystem r0 = okhttp3.internal.io.FileSystem.SYSTEM
            r1.<init>(r2, r3, r0)
            return
    }

    public Cache(java.io.File r10, long r11, okhttp3.internal.io.FileSystem r13) {
            r9 = this;
            java.lang.String r0 = "directory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r9.<init>()
            okhttp3.internal.cache.DiskLruCache r0 = new okhttp3.internal.cache.DiskLruCache
            r5 = 2
            okhttp3.internal.concurrent.TaskRunner r8 = okhttp3.internal.concurrent.TaskRunner.INSTANCE
            r4 = 201105(0x31191, float:2.81808E-40)
            r1 = r0
            r2 = r13
            r3 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6, r8)
            r9.cache = r0
            return
    }

    private final void abortQuietly(okhttp3.internal.cache.DiskLruCache.Editor r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.abort()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String key(okhttp3.HttpUrl r1) {
            okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
            java.lang.String r1 = r0.key(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "directory", imports = {}))
    /* JADX INFO: renamed from: -deprecated_directory, reason: not valid java name */
    public final java.io.File m2391deprecated_directory() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            java.io.File r0 = r0.getDirectory()
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.close()
            return
    }

    public final void delete() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.delete()
            return
    }

    public final java.io.File directory() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            java.io.File r0 = r0.getDirectory()
            return r0
    }

    public final void evictAll() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.evictAll()
            return
    }

    @Override // java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.flush()
            return
    }

    public final okhttp3.Response get$okhttp(okhttp3.Request r5) {
            r4 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
            okhttp3.HttpUrl r1 = r5.url()
            java.lang.String r0 = r0.key(r1)
            r1 = 0
            okhttp3.internal.cache.DiskLruCache r2 = r4.cache     // Catch: java.io.IOException -> L3f
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r2.get(r0)     // Catch: java.io.IOException -> L3f
            if (r0 != 0) goto L19
            return r1
        L19:
            okhttp3.Cache$Entry r2 = new okhttp3.Cache$Entry     // Catch: java.io.IOException -> L3a
            r3 = 0
            okio.Source r3 = r0.getSource(r3)     // Catch: java.io.IOException -> L3a
            r2.<init>(r3)     // Catch: java.io.IOException -> L3a
            okhttp3.Response r0 = r2.response(r0)
            boolean r5 = r2.matches(r5, r0)
            if (r5 != 0) goto L39
            okhttp3.ResponseBody r5 = r0.body()
            if (r5 == 0) goto L38
            java.io.Closeable r5 = (java.io.Closeable) r5
            okhttp3.internal.Util.closeQuietly(r5)
        L38:
            return r1
        L39:
            return r0
        L3a:
            java.io.Closeable r0 = (java.io.Closeable) r0
            okhttp3.internal.Util.closeQuietly(r0)
        L3f:
            return r1
    }

    public final okhttp3.internal.cache.DiskLruCache getCache$okhttp() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            return r0
    }

    public final int getWriteAbortCount$okhttp() {
            r1 = this;
            int r0 = r1.writeAbortCount
            return r0
    }

    public final int getWriteSuccessCount$okhttp() {
            r1 = this;
            int r0 = r1.writeSuccessCount
            return r0
    }

    public final synchronized int hitCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.hitCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final void initialize() throws java.io.IOException {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            r0.initialize()
            return
    }

    public final boolean isClosed() {
            r1 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r1.cache
            boolean r0 = r0.isClosed()
            return r0
    }

    public final long maxSize() {
            r2 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r2.cache
            long r0 = r0.getMaxSize()
            return r0
    }

    public final synchronized int networkCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.networkCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final okhttp3.internal.cache.CacheRequest put$okhttp(okhttp3.Response r10) {
            r9 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            okhttp3.Request r0 = r10.request()
            java.lang.String r0 = r0.method()
            okhttp3.internal.http.HttpMethod r1 = okhttp3.internal.http.HttpMethod.INSTANCE
            okhttp3.Request r2 = r10.request()
            java.lang.String r2 = r2.method()
            boolean r1 = r1.invalidatesCache(r2)
            r2 = 0
            if (r1 == 0) goto L26
            okhttp3.Request r10 = r10.request()     // Catch: java.io.IOException -> L25
            r9.remove$okhttp(r10)     // Catch: java.io.IOException -> L25
        L25:
            return r2
        L26:
            java.lang.String r1 = "GET"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L2f
            return r2
        L2f:
            okhttp3.Cache$Companion r0 = okhttp3.Cache.Companion
            boolean r1 = r0.hasVaryAll(r10)
            if (r1 == 0) goto L38
            return r2
        L38:
            okhttp3.Cache$Entry r1 = new okhttp3.Cache$Entry
            r1.<init>(r10)
            okhttp3.internal.cache.DiskLruCache r3 = r9.cache     // Catch: java.io.IOException -> L61
            okhttp3.Request r10 = r10.request()     // Catch: java.io.IOException -> L61
            okhttp3.HttpUrl r10 = r10.url()     // Catch: java.io.IOException -> L61
            java.lang.String r4 = r0.key(r10)     // Catch: java.io.IOException -> L61
            r7 = 2
            r8 = 0
            r5 = 0
            okhttp3.internal.cache.DiskLruCache$Editor r10 = okhttp3.internal.cache.DiskLruCache.edit$default(r3, r4, r5, r7, r8)     // Catch: java.io.IOException -> L61
            if (r10 != 0) goto L56
            return r2
        L56:
            r1.writeTo(r10)     // Catch: java.io.IOException -> L62
            okhttp3.Cache$RealCacheRequest r0 = new okhttp3.Cache$RealCacheRequest     // Catch: java.io.IOException -> L62
            r0.<init>(r9, r10)     // Catch: java.io.IOException -> L62
            okhttp3.internal.cache.CacheRequest r0 = (okhttp3.internal.cache.CacheRequest) r0     // Catch: java.io.IOException -> L62
            return r0
        L61:
            r10 = r2
        L62:
            r9.abortQuietly(r10)
            return r2
    }

    public final void remove$okhttp(okhttp3.Request r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.internal.cache.DiskLruCache r0 = r2.cache
            okhttp3.Cache$Companion r1 = okhttp3.Cache.Companion
            okhttp3.HttpUrl r3 = r3.url()
            java.lang.String r3 = r1.key(r3)
            r0.remove(r3)
            return
    }

    public final synchronized int requestCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.requestCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final void setWriteAbortCount$okhttp(int r1) {
            r0 = this;
            r0.writeAbortCount = r1
            return
    }

    public final void setWriteSuccessCount$okhttp(int r1) {
            r0 = this;
            r0.writeSuccessCount = r1
            return
    }

    public final long size() throws java.io.IOException {
            r2 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r2.cache
            long r0 = r0.size()
            return r0
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.hitCount     // Catch: java.lang.Throwable -> L9
            int r0 = r0 + 1
            r1.hitCount = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public final synchronized void trackResponse$okhttp(okhttp3.internal.cache.CacheStrategy r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "cacheStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)     // Catch: java.lang.Throwable -> L27
            int r0 = r1.requestCount     // Catch: java.lang.Throwable -> L27
            int r0 = r0 + 1
            r1.requestCount = r0     // Catch: java.lang.Throwable -> L27
            okhttp3.Request r0 = r2.getNetworkRequest()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L19
            int r2 = r1.networkCount     // Catch: java.lang.Throwable -> L27
            int r2 = r2 + 1
            r1.networkCount = r2     // Catch: java.lang.Throwable -> L27
            goto L25
        L19:
            okhttp3.Response r2 = r2.getCacheResponse()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L25
            int r2 = r1.hitCount     // Catch: java.lang.Throwable -> L27
            int r2 = r2 + 1
            r1.hitCount = r2     // Catch: java.lang.Throwable -> L27
        L25:
            monitor-exit(r1)
            return
        L27:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
    }

    public final void update$okhttp(okhttp3.Response r2, okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "cached"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "network"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okhttp3.Cache$Entry r0 = new okhttp3.Cache$Entry
            r0.<init>(r3)
            okhttp3.ResponseBody r2 = r2.body()
            java.lang.String r3 = "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            okhttp3.Cache$CacheResponseBody r2 = (okhttp3.Cache.CacheResponseBody) r2
            okhttp3.internal.cache.DiskLruCache$Snapshot r2 = r2.getSnapshot()
            okhttp3.internal.cache.DiskLruCache$Editor r2 = r2.edit()     // Catch: java.io.IOException -> L2c
            if (r2 != 0) goto L25
            return
        L25:
            r0.writeTo(r2)     // Catch: java.io.IOException -> L2d
            r2.commit()     // Catch: java.io.IOException -> L2d
            goto L30
        L2c:
            r2 = 0
        L2d:
            r1.abortQuietly(r2)
        L30:
            return
    }

    public final java.util.Iterator<java.lang.String> urls() throws java.io.IOException {
            r1 = this;
            okhttp3.Cache$urls$1 r0 = new okhttp3.Cache$urls$1
            r0.<init>(r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    public final synchronized int writeAbortCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.writeAbortCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public final synchronized int writeSuccessCount() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.writeSuccessCount     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }
}
