package okhttp3;

/* JADX INFO: compiled from: MediaType.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0003J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0019"}, d2 = {"Lokhttp3/MediaType;", "", "mediaType", "", "type", "subtype", "parameterNamesAndValues", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "[Ljava/lang/String;", "()Ljava/lang/String;", "charset", "Ljava/nio/charset/Charset;", "defaultValue", "equals", "", "other", "hashCode", "", "parameter", "name", "-deprecated_subtype", "toString", "-deprecated_type", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MediaType {
    public static final okhttp3.MediaType.Companion Companion = null;
    private static final java.util.regex.Pattern PARAMETER = null;
    private static final java.lang.String QUOTED = "\"([^\"]*)\"";
    private static final java.lang.String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private static final java.util.regex.Pattern TYPE_SUBTYPE = null;
    private final java.lang.String mediaType;
    private final java.lang.String[] parameterNamesAndValues;
    private final java.lang.String subtype;
    private final java.lang.String type;

    /* JADX INFO: compiled from: MediaType.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u000fJ\u0011\u0010\u0010\u001a\u00020\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\nJ\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\u000eR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lokhttp3/MediaType$Companion;", "", "()V", "PARAMETER", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "QUOTED", "", "TOKEN", "TYPE_SUBTYPE", "get", "Lokhttp3/MediaType;", "mediaType", "-deprecated_get", "parse", "-deprecated_parse", "toMediaType", "toMediaTypeOrNull", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final okhttp3.MediaType m2456deprecated_get(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "mediaType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.MediaType r2 = r1.get(r2)
                return r2
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final okhttp3.MediaType m2457deprecated_parse(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "mediaType"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.MediaType r2 = r1.parse(r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.MediaType get(java.lang.String r14) {
                r13 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                java.util.regex.Pattern r0 = okhttp3.MediaType.access$getTYPE_SUBTYPE$cp()
                r1 = r14
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                java.util.regex.Matcher r0 = r0.matcher(r1)
                boolean r2 = r0.lookingAt()
                r3 = 34
                if (r2 == 0) goto Lfb
                r2 = 1
                java.lang.String r4 = r0.group(r2)
                java.lang.String r5 = "typeSubtype.group(1)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                java.util.Locale r5 = java.util.Locale.US
                java.lang.String r6 = "US"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
                java.lang.String r9 = r4.toLowerCase(r5)
                java.lang.String r4 = "this as java.lang.String).toLowerCase(locale)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)
                r5 = 2
                java.lang.String r7 = r0.group(r5)
                java.lang.String r8 = "typeSubtype.group(2)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
                java.util.Locale r8 = java.util.Locale.US
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
                java.lang.String r10 = r7.toLowerCase(r8)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r4)
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.List r4 = (java.util.List) r4
                java.util.regex.Pattern r6 = okhttp3.MediaType.access$getPARAMETER$cp()
                java.util.regex.Matcher r1 = r6.matcher(r1)
                int r0 = r0.end()
            L5b:
                int r6 = r14.length()
                r7 = 0
                if (r0 >= r6) goto Le7
                int r6 = r14.length()
                r1.region(r0, r6)
                boolean r6 = r1.lookingAt()
                if (r6 == 0) goto Lb7
                java.lang.String r0 = r1.group(r2)
                if (r0 != 0) goto L7a
                int r0 = r1.end()
                goto L5b
            L7a:
                java.lang.String r6 = r1.group(r5)
                if (r6 != 0) goto L86
                r6 = 3
                java.lang.String r6 = r1.group(r6)
                goto La9
            L86:
                java.lang.String r8 = "'"
                r11 = 0
                boolean r12 = kotlin.text.StringsKt.startsWith$default(r6, r8, r7, r5, r11)
                if (r12 == 0) goto La9
                boolean r7 = kotlin.text.StringsKt.endsWith$default(r6, r8, r7, r5, r11)
                if (r7 == 0) goto La9
                int r7 = r6.length()
                if (r7 <= r5) goto La9
                int r7 = r6.length()
                int r7 = r7 - r2
                java.lang.String r6 = r6.substring(r2, r7)
                java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            La9:
                r7 = r4
                java.util.Collection r7 = (java.util.Collection) r7
                r7.add(r0)
                r7.add(r6)
                int r0 = r1.end()
                goto L5b
            Lb7:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Parameter is not formatted correctly: \""
                r1.<init>(r2)
                java.lang.String r0 = r14.substring(r0)
                java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r1 = "\" for: \""
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r14 = r0.append(r14)
                java.lang.StringBuilder r14 = r14.append(r3)
                java.lang.String r14 = r14.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r14 = r14.toString()
                r0.<init>(r14)
                throw r0
            Le7:
                okhttp3.MediaType r0 = new okhttp3.MediaType
                java.util.Collection r4 = (java.util.Collection) r4
                java.lang.String[] r1 = new java.lang.String[r7]
                java.lang.Object[] r1 = r4.toArray(r1)
                r11 = r1
                java.lang.String[] r11 = (java.lang.String[]) r11
                r12 = 0
                r7 = r0
                r8 = r14
                r7.<init>(r8, r9, r10, r11, r12)
                return r0
            Lfb:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "No subtype found for: \""
                r0.<init>(r1)
                java.lang.StringBuilder r14 = r0.append(r14)
                java.lang.StringBuilder r14 = r14.append(r3)
                java.lang.String r14 = r14.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r14 = r14.toString()
                r0.<init>(r14)
                throw r0
        }

        @kotlin.jvm.JvmStatic
        public final okhttp3.MediaType parse(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okhttp3.MediaType r2 = r1.get(r2)     // Catch: java.lang.IllegalArgumentException -> La
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }
    }

    static {
            okhttp3.MediaType$Companion r0 = new okhttp3.MediaType$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.MediaType.Companion = r0
            java.lang.String r0 = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.MediaType.TYPE_SUBTYPE = r0
            java.lang.String r0 = ";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.MediaType.PARAMETER = r0
            return
    }

    private MediaType(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>()
            r0.mediaType = r1
            r0.type = r2
            r0.subtype = r3
            r0.parameterNamesAndValues = r4
            return
    }

    public /* synthetic */ MediaType(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String[] r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getPARAMETER$cp() {
            java.util.regex.Pattern r0 = okhttp3.MediaType.PARAMETER
            return r0
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getTYPE_SUBTYPE$cp() {
            java.util.regex.Pattern r0 = okhttp3.MediaType.TYPE_SUBTYPE
            return r0
    }

    public static /* synthetic */ java.nio.charset.Charset charset$default(okhttp3.MediaType r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.nio.charset.Charset r0 = r0.charset(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.MediaType get(java.lang.String r1) {
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            okhttp3.MediaType r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    public static final okhttp3.MediaType parse(java.lang.String r1) {
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            okhttp3.MediaType r1 = r0.parse(r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "subtype", imports = {}))
    /* JADX INFO: renamed from: -deprecated_subtype, reason: not valid java name */
    public final java.lang.String m2454deprecated_subtype() {
            r1 = this;
            java.lang.String r0 = r1.subtype
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.ReplaceWith(expression = "type", imports = {}))
    /* JADX INFO: renamed from: -deprecated_type, reason: not valid java name */
    public final java.lang.String m2455deprecated_type() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }

    public final java.nio.charset.Charset charset() {
            r2 = this;
            r0 = 0
            r1 = 1
            java.nio.charset.Charset r0 = charset$default(r2, r0, r1, r0)
            return r0
    }

    public final java.nio.charset.Charset charset(java.nio.charset.Charset r2) {
            r1 = this;
            java.lang.String r0 = "charset"
            java.lang.String r0 = r1.parameter(r0)
            if (r0 != 0) goto L9
            return r2
        L9:
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> Ld
        Ld:
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okhttp3.MediaType
            if (r0 == 0) goto L12
            okhttp3.MediaType r2 = (okhttp3.MediaType) r2
            java.lang.String r2 = r2.mediaType
            java.lang.String r0 = r1.mediaType
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.mediaType
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String parameter(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String[] r0 = r4.parameterNamesAndValues
            int r0 = r0.length
            int r0 = r0 + (-1)
            r1 = 2
            r2 = 0
            int r0 = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(r2, r0, r1)
            if (r0 < 0) goto L28
        L12:
            java.lang.String[] r1 = r4.parameterNamesAndValues
            r1 = r1[r2]
            r3 = 1
            boolean r1 = kotlin.text.StringsKt.equals(r1, r5, r3)
            if (r1 == 0) goto L23
            java.lang.String[] r5 = r4.parameterNamesAndValues
            int r2 = r2 + r3
            r5 = r5[r2]
            return r5
        L23:
            if (r2 == r0) goto L28
            int r2 = r2 + 2
            goto L12
        L28:
            r5 = 0
            return r5
    }

    public final java.lang.String subtype() {
            r1 = this;
            java.lang.String r0 = r1.subtype
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mediaType
            return r0
    }

    public final java.lang.String type() {
            r1 = this;
            java.lang.String r0 = r1.type
            return r0
    }
}
