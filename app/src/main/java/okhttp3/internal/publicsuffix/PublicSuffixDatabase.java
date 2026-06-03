package okhttp3.internal.publicsuffix;

/* JADX INFO: compiled from: PublicSuffixDatabase.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "()V", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "publicSuffixExceptionListBytes", "", "publicSuffixListBytes", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "findMatchingRule", "", "", "domainLabels", "getEffectiveTldPlusOne", "domain", "readTheList", "", "readTheListUninterruptibly", "setListBytes", "splitDomain", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicSuffixDatabase {
    public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion Companion = null;
    private static final char EXCEPTION_MARKER = '!';
    private static final java.util.List<java.lang.String> PREVAILING_RULE = null;
    public static final java.lang.String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private static final byte[] WILDCARD_LABEL = null;
    private static final okhttp3.internal.publicsuffix.PublicSuffixDatabase instance = null;
    private final java.util.concurrent.atomic.AtomicBoolean listRead;
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private final java.util.concurrent.CountDownLatch readCompleteLatch;

    /* JADX INFO: compiled from: PublicSuffixDatabase.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "()V", "EXCEPTION_MARKER", "", "PREVAILING_RULE", "", "", "PUBLIC_SUFFIX_RESOURCE", "WILDCARD_LABEL", "", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "binarySearch", "labels", "", "labelIndex", "", "([B[[BI)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

        public static final /* synthetic */ java.lang.String access$binarySearch(okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion r0, byte[] r1, byte[][] r2, int r3) {
                java.lang.String r0 = r0.binarySearch(r1, r2, r3)
                return r0
        }

        private final java.lang.String binarySearch(byte[] r19, byte[][] r20, int r21) {
                r18 = this;
                r0 = r19
                int r1 = r0.length
                r3 = 0
            L4:
                if (r3 >= r1) goto L97
                int r4 = r3 + r1
                int r4 = r4 / 2
            La:
                r5 = 10
                r6 = -1
                if (r4 <= r6) goto L16
                r7 = r0[r4]
                if (r7 == r5) goto L16
                int r4 = r4 + (-1)
                goto La
            L16:
                int r7 = r4 + 1
                r8 = 1
                r9 = r8
            L1a:
                int r10 = r7 + r9
                r11 = r0[r10]
                if (r11 == r5) goto L23
                int r9 = r9 + 1
                goto L1a
            L23:
                int r5 = r10 - r7
                r11 = r21
                r9 = 0
                r12 = 0
                r13 = 0
            L2a:
                r14 = 255(0xff, float:3.57E-43)
                if (r9 == 0) goto L32
                r9 = 46
                r15 = 0
                goto L3f
            L32:
                r15 = r20[r11]
                r15 = r15[r12]
                int r15 = okhttp3.internal.Util.and(r15, r14)
                r17 = r15
                r15 = r9
                r9 = r17
            L3f:
                int r16 = r7 + r13
                r2 = r0[r16]
                int r2 = okhttp3.internal.Util.and(r2, r14)
                int r9 = r9 - r2
                if (r9 != 0) goto L65
                int r13 = r13 + 1
                int r12 = r12 + 1
                if (r13 == r5) goto L65
                r2 = r20[r11]
                int r2 = r2.length
                if (r2 != r12) goto L63
                r2 = r20
                java.lang.Object[] r2 = (java.lang.Object[]) r2
                int r2 = r2.length
                int r2 = r2 - r8
                if (r11 != r2) goto L5e
                goto L65
            L5e:
                int r11 = r11 + 1
                r12 = r6
                r9 = r8
                goto L2a
            L63:
                r9 = r15
                goto L2a
            L65:
                if (r9 >= 0) goto L69
            L67:
                r1 = r4
                goto L4
            L69:
                if (r9 <= 0) goto L6e
            L6b:
                int r3 = r10 + 1
                goto L4
            L6e:
                int r2 = r5 - r13
                r6 = r20[r11]
                int r6 = r6.length
                int r6 = r6 - r12
                int r11 = r11 + 1
                r8 = r20
                java.lang.Object[] r8 = (java.lang.Object[]) r8
                int r8 = r8.length
            L7b:
                if (r11 >= r8) goto L84
                r9 = r20[r11]
                int r9 = r9.length
                int r6 = r6 + r9
                int r11 = r11 + 1
                goto L7b
            L84:
                if (r6 >= r2) goto L87
                goto L67
            L87:
                if (r6 <= r2) goto L8a
                goto L6b
            L8a:
                java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
                java.lang.String r2 = "UTF_8"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                java.lang.String r2 = new java.lang.String
                r2.<init>(r0, r7, r5, r1)
                goto L98
            L97:
                r2 = 0
            L98:
                return r2
        }

        public final okhttp3.internal.publicsuffix.PublicSuffixDatabase get() {
                r1 = this;
                okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.access$getInstance$cp()
                return r0
        }
    }

    static {
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r0 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 42
            r2 = 0
            r0[r2] = r1
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.WILDCARD_LABEL = r0
            java.lang.String r0 = "*"
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.PREVAILING_RULE = r0
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase
            r0.<init>()
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.instance = r0
            return
    }

    public PublicSuffixDatabase() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.listRead = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.readCompleteLatch = r0
            return
    }

    public static final /* synthetic */ okhttp3.internal.publicsuffix.PublicSuffixDatabase access$getInstance$cp() {
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.instance
            return r0
    }

    private final java.util.List<java.lang.String> findMatchingRule(java.util.List<java.lang.String> r12) {
            r11 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.listRead
            boolean r0 = r0.get()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L16
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.listRead
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L16
            r11.readTheListUninterruptibly()
            goto L23
        L16:
            java.util.concurrent.CountDownLatch r0 = r11.readCompleteLatch     // Catch: java.lang.InterruptedException -> L1c
            r0.await()     // Catch: java.lang.InterruptedException -> L1c
            goto L23
        L1c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L23:
            byte[] r0 = r11.publicSuffixListBytes
            if (r0 == 0) goto L117
            int r0 = r12.size()
            byte[][] r3 = new byte[r0][]
            r4 = r1
        L2e:
            if (r4 >= r0) goto L4b
            java.lang.Object r5 = r12.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r7 = "UTF_8"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            byte[] r5 = r5.getBytes(r6)
            java.lang.String r6 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            r3[r4] = r5
            int r4 = r4 + 1
            goto L2e
        L4b:
            r12 = r3
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            int r0 = r12.length
            r4 = r1
        L50:
            java.lang.String r5 = "publicSuffixListBytes"
            r6 = 0
            if (r4 >= r0) goto L69
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r7 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            byte[] r8 = r11.publicSuffixListBytes
            if (r8 != 0) goto L5f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r8 = r6
        L5f:
            java.lang.String r7 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(r7, r8, r3, r4)
            if (r7 == 0) goto L66
            goto L6a
        L66:
            int r4 = r4 + 1
            goto L50
        L69:
            r7 = r6
        L6a:
            int r0 = r12.length
            if (r0 <= r2) goto L93
            java.lang.Object r0 = r12.clone()
            byte[][] r0 = (byte[][]) r0
            r4 = r0
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r4 = r4.length
            int r4 = r4 - r2
            r8 = r1
        L79:
            if (r8 >= r4) goto L93
            byte[] r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.WILDCARD_LABEL
            r0[r8] = r9
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            byte[] r10 = r11.publicSuffixListBytes
            if (r10 != 0) goto L89
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r10 = r6
        L89:
            java.lang.String r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(r9, r10, r0, r8)
            if (r9 == 0) goto L90
            goto L94
        L90:
            int r8 = r8 + 1
            goto L79
        L93:
            r9 = r6
        L94:
            if (r9 == 0) goto Lb2
            int r12 = r12.length
            int r12 = r12 - r2
            r0 = r1
        L99:
            if (r0 >= r12) goto Lb2
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r4 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion
            byte[] r5 = r11.publicSuffixExceptionListBytes
            if (r5 != 0) goto La7
            java.lang.String r5 = "publicSuffixExceptionListBytes"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r5 = r6
        La7:
            java.lang.String r4 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.access$binarySearch(r4, r5, r3, r0)
            if (r4 == 0) goto Laf
            r6 = r4
            goto Lb2
        Laf:
            int r0 = r0 + 1
            goto L99
        Lb2:
            r12 = 46
            if (r6 == 0) goto Ld5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "!"
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            char[] r4 = new char[r2]
            r4[r1] = r12
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            java.util.List r12 = kotlin.text.StringsKt.split$default(r3, r4, r5, r6, r7, r8)
            return r12
        Ld5:
            if (r7 != 0) goto Ldc
            if (r9 != 0) goto Ldc
            java.util.List<java.lang.String> r12 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.PREVAILING_RULE
            return r12
        Ldc:
            if (r7 == 0) goto Lef
            r3 = r7
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            char[] r4 = new char[r2]
            r4[r1] = r12
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            java.util.List r0 = kotlin.text.StringsKt.split$default(r3, r4, r5, r6, r7, r8)
            if (r0 != 0) goto Lf3
        Lef:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        Lf3:
            if (r9 == 0) goto L106
            r3 = r9
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            char[] r4 = new char[r2]
            r4[r1] = r12
            r7 = 6
            r8 = 0
            r5 = 0
            r6 = 0
            java.util.List r12 = kotlin.text.StringsKt.split$default(r3, r4, r5, r6, r7, r8)
            if (r12 != 0) goto L10a
        L106:
            java.util.List r12 = kotlin.collections.CollectionsKt.emptyList()
        L10a:
            int r1 = r0.size()
            int r2 = r12.size()
            if (r1 <= r2) goto L115
            goto L116
        L115:
            r0 = r12
        L116:
            return r0
        L117:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
    }

    private final void readTheList() throws java.io.IOException {
            r6 = this;
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> L70
            r1.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r3 = "publicsuffixes.gz"
            java.io.InputStream r2 = r2.getResourceAsStream(r3)     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L1a
            java.util.concurrent.CountDownLatch r0 = r6.readCompleteLatch
            r0.countDown()
            return
        L1a:
            okio.GzipSource r3 = new okio.GzipSource     // Catch: java.lang.Throwable -> L70
            okio.Source r2 = okio.Okio.source(r2)     // Catch: java.lang.Throwable -> L70
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L70
            okio.Source r3 = (okio.Source) r3     // Catch: java.lang.Throwable -> L70
            okio.BufferedSource r2 = okio.Okio.buffer(r3)     // Catch: java.lang.Throwable -> L70
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch: java.lang.Throwable -> L70
            r3 = r2
            okio.BufferedSource r3 = (okio.BufferedSource) r3     // Catch: java.lang.Throwable -> L69
            int r4 = r3.readInt()     // Catch: java.lang.Throwable -> L69
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L69
            byte[] r4 = r3.readByteArray(r4)     // Catch: java.lang.Throwable -> L69
            r0.element = r4     // Catch: java.lang.Throwable -> L69
            int r4 = r3.readInt()     // Catch: java.lang.Throwable -> L69
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L69
            byte[] r3 = r3.readByteArray(r4)     // Catch: java.lang.Throwable -> L69
            r1.element = r3     // Catch: java.lang.Throwable -> L69
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L69
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r2, r3)     // Catch: java.lang.Throwable -> L70
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L70
            T r0 = r0.element     // Catch: java.lang.Throwable -> L66
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L66
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L66
            r6.publicSuffixListBytes = r0     // Catch: java.lang.Throwable -> L66
            T r0 = r1.element     // Catch: java.lang.Throwable -> L66
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L66
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L66
            r6.publicSuffixExceptionListBytes = r0     // Catch: java.lang.Throwable -> L66
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L66
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L70
            java.util.concurrent.CountDownLatch r0 = r6.readCompleteLatch
            r0.countDown()
            return
        L66:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L70
            throw r0     // Catch: java.lang.Throwable -> L70
        L69:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L6b
        L6b:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r0)     // Catch: java.lang.Throwable -> L70
            throw r1     // Catch: java.lang.Throwable -> L70
        L70:
            r0 = move-exception
            java.util.concurrent.CountDownLatch r1 = r6.readCompleteLatch
            r1.countDown()
            throw r0
    }

    private final void readTheListUninterruptibly() {
            r5 = this;
            r0 = 0
        L1:
            r5.readTheList()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10 java.io.InterruptedIOException -> L29
            if (r0 == 0) goto Ld
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Ld:
            return
        Le:
            r1 = move-exception
            goto L2e
        L10:
            r1 = move-exception
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion     // Catch: java.lang.Throwable -> Le
            okhttp3.internal.platform.Platform r2 = r2.get()     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "Failed to read public suffix list"
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> Le
            r4 = 5
            r2.log(r3, r4, r1)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L28
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L28:
            return
        L29:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> Le
            r0 = 1
            goto L1
        L2e:
            if (r0 == 0) goto L37
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L37:
            throw r1
    }

    private final java.util.List<java.lang.String> splitDomain(java.lang.String r7) {
            r6 = this;
            r0 = r7
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7 = 1
            char[] r1 = new char[r7]
            r2 = 46
            r3 = 0
            r1[r3] = r2
            r4 = 6
            r5 = 0
            r2 = 0
            java.util.List r0 = kotlin.text.StringsKt.split$default(r0, r1, r2, r3, r4, r5)
            java.lang.Object r1 = kotlin.collections.CollectionsKt.last(r0)
            java.lang.String r2 = ""
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L23
            java.util.List r7 = kotlin.collections.CollectionsKt.dropLast(r0, r7)
            return r7
        L23:
            return r0
    }

    public final java.lang.String getEffectiveTldPlusOne(java.lang.String r11) {
            r10 = this;
            java.lang.String r0 = "domain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = java.net.IDN.toUnicode(r11)
            java.lang.String r1 = "unicodeDomain"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.List r0 = r10.splitDomain(r0)
            java.util.List r1 = r10.findMatchingRule(r0)
            int r2 = r0.size()
            int r3 = r1.size()
            r4 = 33
            r5 = 0
            if (r2 != r3) goto L31
            java.lang.Object r2 = r1.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            char r2 = r2.charAt(r5)
            if (r2 == r4) goto L31
            r11 = 0
            return r11
        L31:
            java.lang.Object r2 = r1.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            char r2 = r2.charAt(r5)
            if (r2 != r4) goto L46
            int r0 = r0.size()
            int r1 = r1.size()
            goto L50
        L46:
            int r0 = r0.size()
            int r1 = r1.size()
            int r1 = r1 + 1
        L50:
            int r0 = r0 - r1
            java.util.List r11 = r10.splitDomain(r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            kotlin.sequences.Sequence r11 = kotlin.collections.CollectionsKt.asSequence(r11)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.drop(r11, r0)
            java.lang.String r11 = "."
            r2 = r11
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r8 = 62
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r11 = kotlin.sequences.SequencesKt.joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public final void setListBytes(byte[] r2, byte[] r3) {
            r1 = this;
            java.lang.String r0 = "publicSuffixListBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "publicSuffixExceptionListBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.publicSuffixListBytes = r2
            r1.publicSuffixExceptionListBytes = r3
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.listRead
            r3 = 1
            r2.set(r3)
            java.util.concurrent.CountDownLatch r2 = r1.readCompleteLatch
            r2.countDown()
            return
    }
}
