package okhttp3;

/* JADX INFO: compiled from: CacheControl.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, d2 = {"Lokhttp3/CacheControl;", "", "noCache", "", "noStore", "maxAgeSeconds", "", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", "", "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", "toString", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CacheControl {
    public static final okhttp3.CacheControl.Companion Companion = null;
    public static final okhttp3.CacheControl FORCE_CACHE = null;
    public static final okhttp3.CacheControl FORCE_NETWORK = null;
    private java.lang.String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    /* JADX INFO: compiled from: CacheControl.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/CacheControl$Builder;", "", "()V", "immutable", "", "maxAgeSeconds", "", "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", "build", "Lokhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds;
        private int maxStaleSeconds;
        private int minFreshSeconds;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.maxAgeSeconds = r0
                r1.maxStaleSeconds = r0
                r1.minFreshSeconds = r0
                return
        }

        private final int clampToInt(long r3) {
                r2 = this;
                r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 <= 0) goto Lb
                r3 = 2147483647(0x7fffffff, float:NaN)
                goto Lc
            Lb:
                int r3 = (int) r3
            Lc:
                return r3
        }

        public final okhttp3.CacheControl build() {
                r17 = this;
                r0 = r17
                okhttp3.CacheControl r16 = new okhttp3.CacheControl
                boolean r2 = r0.noCache
                boolean r3 = r0.noStore
                int r4 = r0.maxAgeSeconds
                int r9 = r0.maxStaleSeconds
                int r10 = r0.minFreshSeconds
                boolean r11 = r0.onlyIfCached
                boolean r12 = r0.noTransform
                boolean r13 = r0.immutable
                r14 = 0
                r15 = 0
                r5 = -1
                r6 = 0
                r7 = 0
                r8 = 0
                r1 = r16
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return r16
        }

        public final okhttp3.CacheControl.Builder immutable() {
                r1 = this;
                r0 = r1
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                r0 = 1
                r1.immutable = r0
                return r1
        }

        public final okhttp3.CacheControl.Builder maxAge(int r3, java.util.concurrent.TimeUnit r4) {
                r2 = this;
                java.lang.String r0 = "timeUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = r2
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                if (r3 < 0) goto L16
                long r0 = (long) r3
                long r3 = r4.toSeconds(r0)
                int r3 = r2.clampToInt(r3)
                r2.maxAgeSeconds = r3
                return r2
            L16:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r0 = "maxAge < 0: "
                r4.<init>(r0)
                java.lang.StringBuilder r3 = r4.append(r3)
                java.lang.String r3 = r3.toString()
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
        }

        public final okhttp3.CacheControl.Builder maxStale(int r3, java.util.concurrent.TimeUnit r4) {
                r2 = this;
                java.lang.String r0 = "timeUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = r2
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                if (r3 < 0) goto L16
                long r0 = (long) r3
                long r3 = r4.toSeconds(r0)
                int r3 = r2.clampToInt(r3)
                r2.maxStaleSeconds = r3
                return r2
            L16:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r0 = "maxStale < 0: "
                r4.<init>(r0)
                java.lang.StringBuilder r3 = r4.append(r3)
                java.lang.String r3 = r3.toString()
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
        }

        public final okhttp3.CacheControl.Builder minFresh(int r3, java.util.concurrent.TimeUnit r4) {
                r2 = this;
                java.lang.String r0 = "timeUnit"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = r2
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                if (r3 < 0) goto L16
                long r0 = (long) r3
                long r3 = r4.toSeconds(r0)
                int r3 = r2.clampToInt(r3)
                r2.minFreshSeconds = r3
                return r2
            L16:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r0 = "minFresh < 0: "
                r4.<init>(r0)
                java.lang.StringBuilder r3 = r4.append(r3)
                java.lang.String r3 = r3.toString()
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r3 = r3.toString()
                r4.<init>(r3)
                throw r4
        }

        public final okhttp3.CacheControl.Builder noCache() {
                r1 = this;
                r0 = r1
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                r0 = 1
                r1.noCache = r0
                return r1
        }

        public final okhttp3.CacheControl.Builder noStore() {
                r1 = this;
                r0 = r1
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                r0 = 1
                r1.noStore = r0
                return r1
        }

        public final okhttp3.CacheControl.Builder noTransform() {
                r1 = this;
                r0 = r1
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                r0 = 1
                r1.noTransform = r0
                return r1
        }

        public final okhttp3.CacheControl.Builder onlyIfCached() {
                r1 = this;
                r0 = r1
                okhttp3.CacheControl$Builder r0 = (okhttp3.CacheControl.Builder) r0
                r0 = 1
                r1.onlyIfCached = r0
                return r1
        }
    }

    /* JADX INFO: compiled from: CacheControl.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lokhttp3/CacheControl$Companion;", "", "()V", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "parse", "headers", "Lokhttp3/Headers;", "indexOfElement", "", "", "characters", "startIndex", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

        private final int indexOfElement(java.lang.String r7, java.lang.String r8, int r9) {
                r6 = this;
                int r0 = r7.length()
            L4:
                if (r9 >= r0) goto L1a
                r1 = r8
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                char r2 = r7.charAt(r9)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = kotlin.text.StringsKt.contains$default(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L17
                return r9
            L17:
                int r9 = r9 + 1
                goto L4
            L1a:
                int r7 = r7.length()
                return r7
        }

        static /* synthetic */ int indexOfElement$default(okhttp3.CacheControl.Companion r0, java.lang.String r1, java.lang.String r2, int r3, int r4, java.lang.Object r5) {
                r4 = r4 & 2
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                int r0 = r0.indexOfElement(r1, r2, r3)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.CacheControl parse(okhttp3.Headers r32) {
                r31 = this;
                r0 = r31
                r1 = r32
                java.lang.String r2 = "headers"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                int r2 = r32.size()
                r5 = 1
                r8 = r5
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L23:
                if (r7 >= r2) goto L188
                java.lang.String r3 = r1.name(r7)
                java.lang.String r6 = r1.value(r7)
                java.lang.String r4 = "Cache-Control"
                boolean r4 = kotlin.text.StringsKt.equals(r3, r4, r5)
                if (r4 == 0) goto L3a
                if (r9 == 0) goto L38
                goto L42
            L38:
                r9 = r6
                goto L43
            L3a:
                java.lang.String r4 = "Pragma"
                boolean r3 = kotlin.text.StringsKt.equals(r3, r4, r5)
                if (r3 == 0) goto L17d
            L42:
                r8 = 0
            L43:
                r3 = 0
            L44:
                int r4 = r6.length()
                if (r3 >= r4) goto L17d
                java.lang.String r4 = "=,;"
                int r4 = r0.indexOfElement(r6, r4, r3)
                java.lang.String r3 = r6.substring(r3, r4)
                java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.CharSequence r3 = kotlin.text.StringsKt.trim(r3)
                java.lang.String r3 = r3.toString()
                int r1 = r6.length()
                if (r4 == r1) goto Lc6
                char r1 = r6.charAt(r4)
                r24 = r2
                r2 = 44
                if (r1 == r2) goto Lc8
                char r1 = r6.charAt(r4)
                r2 = 59
                if (r1 != r2) goto L7c
                goto Lc8
            L7c:
                int r4 = r4 + 1
                int r1 = okhttp3.internal.Util.indexOfNonWhitespace(r6, r4)
                int r2 = r6.length()
                if (r1 >= r2) goto Lae
                char r2 = r6.charAt(r1)
                r4 = 34
                if (r2 != r4) goto Lae
                int r1 = r1 + 1
                r25 = r6
                java.lang.CharSequence r25 = (java.lang.CharSequence) r25
                r29 = 4
                r30 = 0
                r26 = 34
                r28 = 0
                r27 = r1
                int r2 = kotlin.text.StringsKt.indexOf$default(r25, r26, r27, r28, r29, r30)
                java.lang.String r1 = r6.substring(r1, r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
                r4 = 1
                int r2 = r2 + r4
                goto Lcc
            Lae:
                java.lang.String r2 = ",;"
                int r2 = r0.indexOfElement(r6, r2, r1)
                java.lang.String r1 = r6.substring(r1, r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)
                java.lang.String r1 = r1.toString()
                goto Lcc
            Lc6:
                r24 = r2
            Lc8:
                int r4 = r4 + 1
                r2 = r4
                r1 = 0
            Lcc:
                java.lang.String r4 = "no-cache"
                r5 = 1
                boolean r4 = kotlin.text.StringsKt.equals(r4, r3, r5)
                if (r4 == 0) goto Ldd
                r1 = r32
                r3 = r2
                r10 = r5
            Ld9:
                r2 = r24
                goto L44
            Ldd:
                java.lang.String r4 = "no-store"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r3, r5)
                if (r4 == 0) goto Lea
                r1 = r32
                r3 = r2
                r11 = r5
                goto Ld9
            Lea:
                java.lang.String r4 = "max-age"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r3, r5)
                if (r4 == 0) goto Lfb
                r4 = -1
                int r12 = okhttp3.internal.Util.toNonNegativeInt(r1, r4)
            Lf7:
                r1 = r32
                r3 = r2
                goto Ld9
            Lfb:
                java.lang.String r4 = "s-maxage"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r3, r5)
                if (r4 == 0) goto L109
                r4 = -1
                int r13 = okhttp3.internal.Util.toNonNegativeInt(r1, r4)
                goto Lf7
            L109:
                java.lang.String r4 = "private"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r3, r5)
                if (r4 == 0) goto L116
                r1 = r32
                r3 = r2
                r14 = r5
                goto Ld9
            L116:
                java.lang.String r4 = "public"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r3, r5)
                if (r4 == 0) goto L123
                r1 = r32
                r3 = r2
                r15 = r5
                goto Ld9
            L123:
                java.lang.String r4 = "must-revalidate"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r3, r5)
                if (r4 == 0) goto L131
                r1 = r32
                r3 = r2
                r16 = r5
                goto Ld9
            L131:
                java.lang.String r4 = "max-stale"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r3, r5)
                if (r4 == 0) goto L141
                r3 = 2147483647(0x7fffffff, float:NaN)
                int r17 = okhttp3.internal.Util.toNonNegativeInt(r1, r3)
                goto Lf7
            L141:
                java.lang.String r4 = "min-fresh"
                boolean r4 = kotlin.text.StringsKt.equals(r4, r3, r5)
                if (r4 == 0) goto L14f
                r4 = -1
                int r18 = okhttp3.internal.Util.toNonNegativeInt(r1, r4)
                goto Lf7
            L14f:
                r4 = -1
                java.lang.String r1 = "only-if-cached"
                boolean r1 = kotlin.text.StringsKt.equals(r1, r3, r5)
                if (r1 == 0) goto L15f
                r1 = r32
                r3 = r2
                r19 = r5
                goto Ld9
            L15f:
                java.lang.String r1 = "no-transform"
                boolean r1 = kotlin.text.StringsKt.equals(r1, r3, r5)
                if (r1 == 0) goto L16e
                r1 = r32
                r3 = r2
                r20 = r5
                goto Ld9
            L16e:
                java.lang.String r1 = "immutable"
                boolean r1 = kotlin.text.StringsKt.equals(r1, r3, r5)
                if (r1 == 0) goto Lf7
                r1 = r32
                r3 = r2
                r21 = r5
                goto Ld9
            L17d:
                r24 = r2
                r4 = -1
                int r7 = r7 + 1
                r1 = r32
                r2 = r24
                goto L23
            L188:
                if (r8 != 0) goto L18d
                r22 = 0
                goto L18f
            L18d:
                r22 = r9
            L18f:
                okhttp3.CacheControl r1 = new okhttp3.CacheControl
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
        }
    }

    static {
            okhttp3.CacheControl$Companion r0 = new okhttp3.CacheControl$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.CacheControl.Companion = r0
            okhttp3.CacheControl$Builder r0 = new okhttp3.CacheControl$Builder
            r0.<init>()
            okhttp3.CacheControl$Builder r0 = r0.noCache()
            okhttp3.CacheControl r0 = r0.build()
            okhttp3.CacheControl.FORCE_NETWORK = r0
            okhttp3.CacheControl$Builder r0 = new okhttp3.CacheControl$Builder
            r0.<init>()
            okhttp3.CacheControl$Builder r0 = r0.onlyIfCached()
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            okhttp3.CacheControl$Builder r0 = r0.maxStale(r1, r2)
            okhttp3.CacheControl r0 = r0.build()
            okhttp3.CacheControl.FORCE_CACHE = r0
            return
    }

    private CacheControl(boolean r1, boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, int r9, boolean r10, boolean r11, boolean r12, java.lang.String r13) {
            r0 = this;
            r0.<init>()
            r0.noCache = r1
            r0.noStore = r2
            r0.maxAgeSeconds = r3
            r0.sMaxAgeSeconds = r4
            r0.isPrivate = r5
            r0.isPublic = r6
            r0.mustRevalidate = r7
            r0.maxStaleSeconds = r8
            r0.minFreshSeconds = r9
            r0.onlyIfCached = r10
            r0.noTransform = r11
            r0.immutable = r12
            r0.headerValue = r13
            return
    }

    public /* synthetic */ CacheControl(boolean r1, boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, int r9, boolean r10, boolean r11, boolean r12, java.lang.String r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.CacheControl parse(okhttp3.Headers r1) {
            okhttp3.CacheControl$Companion r0 = okhttp3.CacheControl.Companion
            okhttp3.CacheControl r1 = r0.parse(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "immutable", imports = {}))
    /* JADX INFO: renamed from: -deprecated_immutable, reason: not valid java name */
    public final boolean m2392deprecated_immutable() {
            r1 = this;
            boolean r0 = r1.immutable
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "maxAgeSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_maxAgeSeconds, reason: not valid java name */
    public final int m2393deprecated_maxAgeSeconds() {
            r1 = this;
            int r0 = r1.maxAgeSeconds
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "maxStaleSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_maxStaleSeconds, reason: not valid java name */
    public final int m2394deprecated_maxStaleSeconds() {
            r1 = this;
            int r0 = r1.maxStaleSeconds
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "minFreshSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_minFreshSeconds, reason: not valid java name */
    public final int m2395deprecated_minFreshSeconds() {
            r1 = this;
            int r0 = r1.minFreshSeconds
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "mustRevalidate", imports = {}))
    /* JADX INFO: renamed from: -deprecated_mustRevalidate, reason: not valid java name */
    public final boolean m2396deprecated_mustRevalidate() {
            r1 = this;
            boolean r0 = r1.mustRevalidate
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noCache", imports = {}))
    /* JADX INFO: renamed from: -deprecated_noCache, reason: not valid java name */
    public final boolean m2397deprecated_noCache() {
            r1 = this;
            boolean r0 = r1.noCache
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noStore", imports = {}))
    /* JADX INFO: renamed from: -deprecated_noStore, reason: not valid java name */
    public final boolean m2398deprecated_noStore() {
            r1 = this;
            boolean r0 = r1.noStore
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "noTransform", imports = {}))
    /* JADX INFO: renamed from: -deprecated_noTransform, reason: not valid java name */
    public final boolean m2399deprecated_noTransform() {
            r1 = this;
            boolean r0 = r1.noTransform
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "onlyIfCached", imports = {}))
    /* JADX INFO: renamed from: -deprecated_onlyIfCached, reason: not valid java name */
    public final boolean m2400deprecated_onlyIfCached() {
            r1 = this;
            boolean r0 = r1.onlyIfCached
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "sMaxAgeSeconds", imports = {}))
    /* JADX INFO: renamed from: -deprecated_sMaxAgeSeconds, reason: not valid java name */
    public final int m2401deprecated_sMaxAgeSeconds() {
            r1 = this;
            int r0 = r1.sMaxAgeSeconds
            return r0
    }

    public final boolean immutable() {
            r1 = this;
            boolean r0 = r1.immutable
            return r0
    }

    public final boolean isPrivate() {
            r1 = this;
            boolean r0 = r1.isPrivate
            return r0
    }

    public final boolean isPublic() {
            r1 = this;
            boolean r0 = r1.isPublic
            return r0
    }

    public final int maxAgeSeconds() {
            r1 = this;
            int r0 = r1.maxAgeSeconds
            return r0
    }

    public final int maxStaleSeconds() {
            r1 = this;
            int r0 = r1.maxStaleSeconds
            return r0
    }

    public final int minFreshSeconds() {
            r1 = this;
            int r0 = r1.minFreshSeconds
            return r0
    }

    public final boolean mustRevalidate() {
            r1 = this;
            boolean r0 = r1.mustRevalidate
            return r0
    }

    public final boolean noCache() {
            r1 = this;
            boolean r0 = r1.noCache
            return r0
    }

    public final boolean noStore() {
            r1 = this;
            boolean r0 = r1.noStore
            return r0
    }

    public final boolean noTransform() {
            r1 = this;
            boolean r0 = r1.noTransform
            return r0
    }

    public final boolean onlyIfCached() {
            r1 = this;
            boolean r0 = r1.onlyIfCached
            return r0
    }

    public final int sMaxAgeSeconds() {
            r1 = this;
            int r0 = r1.sMaxAgeSeconds
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.headerValue
            if (r0 != 0) goto Lc4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r5.noCache
            if (r1 == 0) goto L12
            java.lang.String r1 = "no-cache, "
            r0.append(r1)
        L12:
            boolean r1 = r5.noStore
            if (r1 == 0) goto L1b
            java.lang.String r1 = "no-store, "
            r0.append(r1)
        L1b:
            int r1 = r5.maxAgeSeconds
            java.lang.String r2 = ", "
            r3 = -1
            if (r1 == r3) goto L31
            java.lang.String r1 = "max-age="
            java.lang.StringBuilder r1 = r0.append(r1)
            int r4 = r5.maxAgeSeconds
            java.lang.StringBuilder r1 = r1.append(r4)
            r1.append(r2)
        L31:
            int r1 = r5.sMaxAgeSeconds
            if (r1 == r3) goto L44
            java.lang.String r1 = "s-maxage="
            java.lang.StringBuilder r1 = r0.append(r1)
            int r4 = r5.sMaxAgeSeconds
            java.lang.StringBuilder r1 = r1.append(r4)
            r1.append(r2)
        L44:
            boolean r1 = r5.isPrivate
            if (r1 == 0) goto L4d
            java.lang.String r1 = "private, "
            r0.append(r1)
        L4d:
            boolean r1 = r5.isPublic
            if (r1 == 0) goto L56
            java.lang.String r1 = "public, "
            r0.append(r1)
        L56:
            boolean r1 = r5.mustRevalidate
            if (r1 == 0) goto L5f
            java.lang.String r1 = "must-revalidate, "
            r0.append(r1)
        L5f:
            int r1 = r5.maxStaleSeconds
            if (r1 == r3) goto L72
            java.lang.String r1 = "max-stale="
            java.lang.StringBuilder r1 = r0.append(r1)
            int r4 = r5.maxStaleSeconds
            java.lang.StringBuilder r1 = r1.append(r4)
            r1.append(r2)
        L72:
            int r1 = r5.minFreshSeconds
            if (r1 == r3) goto L85
            java.lang.String r1 = "min-fresh="
            java.lang.StringBuilder r1 = r0.append(r1)
            int r3 = r5.minFreshSeconds
            java.lang.StringBuilder r1 = r1.append(r3)
            r1.append(r2)
        L85:
            boolean r1 = r5.onlyIfCached
            if (r1 == 0) goto L8e
            java.lang.String r1 = "only-if-cached, "
            r0.append(r1)
        L8e:
            boolean r1 = r5.noTransform
            if (r1 == 0) goto L97
            java.lang.String r1 = "no-transform, "
            r0.append(r1)
        L97:
            boolean r1 = r5.immutable
            if (r1 == 0) goto La0
            java.lang.String r1 = "immutable, "
            r0.append(r1)
        La0:
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 != 0) goto Lac
            java.lang.String r0 = ""
            return r0
        Lac:
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            r0.delete(r1, r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r5.headerValue = r0
        Lc4:
            return r0
    }
}
