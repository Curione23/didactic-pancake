package okio.internal;

/* JADX INFO: renamed from: okio.internal.-Path, reason: invalid class name */
/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\u001a\u0015\u0010\u0014\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0080\b\u001a\u0017\u0010\u0016\u001a\u00020\u0017*\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0018H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\r*\u00020\u000eH\u0080\b\u001a\r\u0010\u001a\u001a\u00020\u0017*\u00020\u000eH\u0080\b\u001a\r\u0010\u001b\u001a\u00020\u0017*\u00020\u000eH\u0080\b\u001a\r\u0010\u001c\u001a\u00020\u0017*\u00020\u000eH\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u000eH\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0001*\u00020\u000eH\u0080\b\u001a\r\u0010 \u001a\u00020\u000e*\u00020\u000eH\u0080\b\u001a\u000f\u0010!\u001a\u0004\u0018\u00010\u000e*\u00020\u000eH\u0080\b\u001a\u0015\u0010\"\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0080\b\u001a\u001d\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0017H\u0080\b\u001a\u001d\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0017H\u0080\b\u001a\u001d\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0017H\u0080\b\u001a\u001c\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0017H\u0000\u001a\u000f\u0010'\u001a\u0004\u0018\u00010\u000e*\u00020\u000eH\u0080\b\u001a\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0)*\u00020\u000eH\u0080\b\u001a\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010)*\u00020\u000eH\u0080\b\u001a\u0014\u0010+\u001a\u00020\u000e*\u00020\u001e2\u0006\u0010%\u001a\u00020\u0017H\u0000\u001a\r\u0010,\u001a\u00020\u001e*\u00020\u000eH\u0080\b\u001a\u0014\u0010-\u001a\u0004\u0018\u00010.*\u00020\u000eH\u0080\b¢\u0006\u0002\u0010/\u001a\f\u00100\u001a\u00020\u0017*\u00020\u000eH\u0002\u001a\f\u00101\u001a\u00020\r*\u00020\u000eH\u0002\u001a\u0014\u00102\u001a\u00020\u0017*\u00020&2\u0006\u0010\u0011\u001a\u00020\u0001H\u0002\u001a\u0014\u00103\u001a\u00020\u000e*\u00020&2\u0006\u0010%\u001a\u00020\u0017H\u0000\u001a\f\u00104\u001a\u00020\u0001*\u000205H\u0002\u001a\f\u00104\u001a\u00020\u0001*\u00020\u001eH\u0002\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003\"\u0016\u0010\n\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003\"\u0018\u0010\f\u001a\u00020\r*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00066"}, d2 = {"ANY_SLASH", "Lokio/ByteString;", "getANY_SLASH$annotations", "()V", "BACKSLASH", "getBACKSLASH$annotations", "DOT", "getDOT$annotations", "DOT_DOT", "getDOT_DOT$annotations", "SLASH", "getSLASH$annotations", "indexOfLastSlash", "", "Lokio/Path;", "getIndexOfLastSlash", "(Lokio/Path;)I", "slash", "getSlash", "(Lokio/Path;)Lokio/ByteString;", "commonCompareTo", "other", "commonEquals", "", "", "commonHashCode", "commonIsAbsolute", "commonIsRelative", "commonIsRoot", "commonName", "", "commonNameBytes", "commonNormalized", "commonParent", "commonRelativeTo", "commonResolve", "child", "normalize", "Lokio/Buffer;", "commonRoot", "commonSegments", "", "commonSegmentsBytes", "commonToPath", "commonToString", "commonVolumeLetter", "", "(Lokio/Path;)Ljava/lang/Character;", "lastSegmentIsDotDot", "rootLength", "startsWithVolumeLetterAndColon", "toPath", "toSlash", "", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Path {
    private static final okio.ByteString ANY_SLASH = null;
    private static final okio.ByteString BACKSLASH = null;
    private static final okio.ByteString DOT = null;
    private static final okio.ByteString DOT_DOT = null;
    private static final okio.ByteString SLASH = null;

    static {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "/"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okio.internal.Path.SLASH = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "\\"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okio.internal.Path.BACKSLASH = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "/\\"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okio.internal.Path.ANY_SLASH = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "."
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okio.internal.Path.DOT = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = ".."
            okio.ByteString r0 = r0.encodeUtf8(r1)
            okio.internal.Path.DOT_DOT = r0
            return
    }

    public static final /* synthetic */ okio.ByteString access$getBACKSLASH$p() {
            okio.ByteString r0 = okio.internal.Path.BACKSLASH
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$getDOT$p() {
            okio.ByteString r0 = okio.internal.Path.DOT
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$getDOT_DOT$p() {
            okio.ByteString r0 = okio.internal.Path.DOT_DOT
            return r0
    }

    public static final /* synthetic */ int access$getIndexOfLastSlash(okio.Path r0) {
            int r0 = getIndexOfLastSlash(r0)
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$getSLASH$p() {
            okio.ByteString r0 = okio.internal.Path.SLASH
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$getSlash(okio.Path r0) {
            okio.ByteString r0 = getSlash(r0)
            return r0
    }

    public static final /* synthetic */ boolean access$lastSegmentIsDotDot(okio.Path r0) {
            boolean r0 = lastSegmentIsDotDot(r0)
            return r0
    }

    public static final /* synthetic */ int access$rootLength(okio.Path r0) {
            int r0 = rootLength(r0)
            return r0
    }

    public static final /* synthetic */ okio.ByteString access$toSlash(java.lang.String r0) {
            okio.ByteString r0 = toSlash(r0)
            return r0
    }

    public static final int commonCompareTo(okio.Path r1, okio.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.ByteString r1 = r1.getBytes$okio()
            okio.ByteString r2 = r2.getBytes$okio()
            int r1 = r1.compareTo2(r2)
            return r1
    }

    public static final boolean commonEquals(okio.Path r1, java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r2 instanceof okio.Path
            if (r0 == 0) goto L1b
            okio.Path r2 = (okio.Path) r2
            okio.ByteString r2 = r2.getBytes$okio()
            okio.ByteString r1 = r1.getBytes$okio()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r1)
            if (r1 == 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            return r1
    }

    public static final int commonHashCode(okio.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.ByteString r1 = r1.getBytes$okio()
            int r1 = r1.hashCode()
            return r1
    }

    public static final boolean commonIsAbsolute(okio.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = access$rootLength(r1)
            r0 = -1
            if (r1 == r0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static final boolean commonIsRelative(okio.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = access$rootLength(r1)
            r0 = -1
            if (r1 != r0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static final boolean commonIsRoot(okio.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = access$rootLength(r1)
            okio.ByteString r1 = r1.getBytes$okio()
            int r1 = r1.size()
            if (r0 != r1) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    public static final java.lang.String commonName(okio.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.ByteString r1 = r1.nameBytes()
            java.lang.String r1 = r1.utf8()
            return r1
    }

    public static final okio.ByteString commonNameBytes(okio.Path r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = access$getIndexOfLastSlash(r4)
            r1 = -1
            r2 = 2
            if (r0 == r1) goto L1a
            okio.ByteString r4 = r4.getBytes$okio()
            int r0 = r0 + 1
            r1 = 0
            r3 = 0
            okio.ByteString r4 = okio.ByteString.substring$default(r4, r0, r1, r2, r3)
            goto L31
        L1a:
            java.lang.Character r0 = r4.volumeLetter()
            if (r0 == 0) goto L2d
            okio.ByteString r0 = r4.getBytes$okio()
            int r0 = r0.size()
            if (r0 != r2) goto L2d
            okio.ByteString r4 = okio.ByteString.EMPTY
            goto L31
        L2d:
            okio.ByteString r4 = r4.getBytes$okio()
        L31:
            return r4
    }

    public static final okio.Path commonNormalized(okio.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Path$Companion r0 = okio.Path.Companion
            java.lang.String r2 = r2.toString()
            r1 = 1
            okio.Path r2 = r0.get(r2, r1)
            return r2
    }

    public static final okio.Path commonParent(okio.Path r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r1 = access$getDOT$p()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r1 = 0
            if (r0 != 0) goto Lbe
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r2 = access$getSLASH$p()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 != 0) goto Lbe
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r2 = access$getBACKSLASH$p()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 != 0) goto Lbe
            boolean r0 = access$lastSegmentIsDotDot(r7)
            if (r0 == 0) goto L38
            goto Lbe
        L38:
            int r0 = access$getIndexOfLastSlash(r7)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L61
            java.lang.Character r5 = r7.volumeLetter()
            if (r5 == 0) goto L61
            okio.ByteString r0 = r7.getBytes$okio()
            int r0 = r0.size()
            r2 = 3
            if (r0 != r2) goto L53
            return r1
        L53:
            okio.Path r0 = new okio.Path
            okio.ByteString r7 = r7.getBytes$okio()
            okio.ByteString r7 = okio.ByteString.substring$default(r7, r3, r2, r4, r1)
            r0.<init>(r7)
            return r0
        L61:
            if (r0 != r4) goto L72
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r6 = access$getBACKSLASH$p()
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L72
            return r1
        L72:
            r5 = -1
            if (r0 != r5) goto L94
            java.lang.Character r6 = r7.volumeLetter()
            if (r6 == 0) goto L94
            okio.ByteString r0 = r7.getBytes$okio()
            int r0 = r0.size()
            if (r0 != r2) goto L86
            return r1
        L86:
            okio.Path r0 = new okio.Path
            okio.ByteString r7 = r7.getBytes$okio()
            okio.ByteString r7 = okio.ByteString.substring$default(r7, r3, r2, r4, r1)
            r0.<init>(r7)
            return r0
        L94:
            if (r0 != r5) goto La0
            okio.Path r7 = new okio.Path
            okio.ByteString r0 = access$getDOT$p()
            r7.<init>(r0)
            return r7
        La0:
            if (r0 != 0) goto Lb0
            okio.Path r0 = new okio.Path
            okio.ByteString r7 = r7.getBytes$okio()
            okio.ByteString r7 = okio.ByteString.substring$default(r7, r3, r4, r4, r1)
            r0.<init>(r7)
            return r0
        Lb0:
            okio.Path r2 = new okio.Path
            okio.ByteString r7 = r7.getBytes$okio()
            okio.ByteString r7 = okio.ByteString.substring$default(r7, r3, r0, r4, r1)
            r2.<init>(r7)
            return r2
        Lbe:
            return r1
    }

    public static final okio.Path commonRelativeTo(okio.Path r8, okio.Path r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            okio.Path r0 = r8.getRoot()
            okio.Path r1 = r9.getRoot()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            java.lang.String r1 = " and "
            if (r0 == 0) goto Ldb
            java.util.List r0 = r8.getSegmentsBytes()
            java.util.List r2 = r9.getSegmentsBytes()
            int r3 = r0.size()
            int r4 = r2.size()
            int r3 = java.lang.Math.min(r3, r4)
            r4 = 0
            r5 = r4
        L30:
            if (r5 >= r3) goto L43
            java.lang.Object r6 = r0.get(r5)
            java.lang.Object r7 = r2.get(r5)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 == 0) goto L43
            int r5 = r5 + 1
            goto L30
        L43:
            if (r5 != r3) goto L62
            okio.ByteString r3 = r8.getBytes$okio()
            int r3 = r3.size()
            okio.ByteString r6 = r9.getBytes$okio()
            int r6 = r6.size()
            if (r3 != r6) goto L62
            okio.Path$Companion r8 = okio.Path.Companion
            java.lang.String r9 = "."
            r0 = 0
            r1 = 1
            okio.Path r8 = okio.Path.Companion.get$default(r8, r9, r4, r1, r0)
            return r8
        L62:
            int r3 = r2.size()
            java.util.List r3 = r2.subList(r5, r3)
            okio.ByteString r6 = access$getDOT_DOT$p()
            int r3 = r3.indexOf(r6)
            r6 = -1
            if (r3 != r6) goto Lba
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.ByteString r9 = access$getSlash(r9)
            if (r9 != 0) goto L8c
            okio.ByteString r9 = access$getSlash(r8)
            if (r9 != 0) goto L8c
            java.lang.String r8 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r9 = access$toSlash(r8)
        L8c:
            int r8 = r2.size()
            r2 = r5
        L91:
            if (r2 >= r8) goto La0
            okio.ByteString r3 = access$getDOT_DOT$p()
            r1.write(r3)
            r1.write(r9)
            int r2 = r2 + 1
            goto L91
        La0:
            int r8 = r0.size()
        La4:
            if (r5 >= r8) goto Lb5
            java.lang.Object r2 = r0.get(r5)
            okio.ByteString r2 = (okio.ByteString) r2
            r1.write(r2)
            r1.write(r9)
            int r5 = r5 + 1
            goto La4
        Lb5:
            okio.Path r8 = toPath(r1, r4)
            return r8
        Lba:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Impossible relative path to resolve: "
            r0.<init>(r2)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        Ldb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Paths of different roots cannot be relative to each other: "
            r0.<init>(r2)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
    }

    public static final okio.Path commonResolve(okio.Path r1, java.lang.String r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.writeUtf8(r2)
            r0 = 0
            okio.Path r2 = toPath(r2, r0)
            okio.Path r1 = commonResolve(r1, r2, r3)
            return r1
    }

    public static final okio.Path commonResolve(okio.Path r1, okio.Buffer r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            okio.Path r2 = toPath(r2, r0)
            okio.Path r1 = commonResolve(r1, r2, r3)
            return r1
    }

    public static final okio.Path commonResolve(okio.Path r1, okio.ByteString r2, boolean r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.write(r2)
            r0 = 0
            okio.Path r2 = toPath(r2, r0)
            okio.Path r1 = commonResolve(r1, r2, r3)
            return r1
    }

    public static final okio.Path commonResolve(okio.Path r6, okio.Path r7, boolean r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r7.isAbsolute()
            if (r0 != 0) goto L4e
            java.lang.Character r0 = r7.volumeLetter()
            if (r0 == 0) goto L17
            goto L4e
        L17:
            okio.ByteString r0 = getSlash(r6)
            if (r0 != 0) goto L29
            okio.ByteString r0 = getSlash(r7)
            if (r0 != 0) goto L29
            java.lang.String r0 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r0 = toSlash(r0)
        L29:
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.ByteString r6 = r6.getBytes$okio()
            r1.write(r6)
            long r2 = r1.size()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L42
            r1.write(r0)
        L42:
            okio.ByteString r6 = r7.getBytes$okio()
            r1.write(r6)
            okio.Path r6 = toPath(r1, r8)
            return r6
        L4e:
            return r7
    }

    public static final okio.Path commonRoot(okio.Path r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = access$rootLength(r3)
            r1 = -1
            if (r0 != r1) goto Le
            r3 = 0
            goto L1d
        Le:
            okio.Path r1 = new okio.Path
            okio.ByteString r3 = r3.getBytes$okio()
            r2 = 0
            okio.ByteString r3 = r3.substring(r2, r0)
            r1.<init>(r3)
            r3 = r1
        L1d:
            return r3
    }

    public static final java.util.List<java.lang.String> commonSegments(okio.Path r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            int r1 = access$rootLength(r7)
            r2 = -1
            r3 = 92
            if (r1 != r2) goto L17
            r1 = 0
            goto L2d
        L17:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            if (r1 >= r2) goto L2d
            okio.ByteString r2 = r7.getBytes$okio()
            byte r2 = r2.getByte(r1)
            if (r2 != r3) goto L2d
            int r1 = r1 + 1
        L2d:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            r4 = r1
        L36:
            if (r1 >= r2) goto L61
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            r6 = 47
            if (r5 == r6) goto L4e
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            if (r5 != r3) goto L5e
        L4e:
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            okio.ByteString r6 = r7.getBytes$okio()
            okio.ByteString r4 = r6.substring(r4, r1)
            r5.add(r4)
            int r4 = r1 + 1
        L5e:
            int r1 = r1 + 1
            goto L36
        L61:
            okio.ByteString r1 = r7.getBytes$okio()
            int r1 = r1.size()
            if (r4 >= r1) goto L81
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            okio.ByteString r2 = r7.getBytes$okio()
            okio.ByteString r7 = r7.getBytes$okio()
            int r7 = r7.size()
            okio.ByteString r7 = r2.substring(r4, r7)
            r1.add(r7)
        L81:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r1)
            r7.<init>(r1)
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Iterator r0 = r0.iterator()
        L94:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La8
            java.lang.Object r1 = r0.next()
            okio.ByteString r1 = (okio.ByteString) r1
            java.lang.String r1 = r1.utf8()
            r7.add(r1)
            goto L94
        La8:
            java.util.List r7 = (java.util.List) r7
            return r7
    }

    public static final java.util.List<okio.ByteString> commonSegmentsBytes(okio.Path r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            int r1 = access$rootLength(r7)
            r2 = -1
            r3 = 92
            if (r1 != r2) goto L17
            r1 = 0
            goto L2d
        L17:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            if (r1 >= r2) goto L2d
            okio.ByteString r2 = r7.getBytes$okio()
            byte r2 = r2.getByte(r1)
            if (r2 != r3) goto L2d
            int r1 = r1 + 1
        L2d:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            r4 = r1
        L36:
            if (r1 >= r2) goto L61
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            r6 = 47
            if (r5 == r6) goto L4e
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            if (r5 != r3) goto L5e
        L4e:
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            okio.ByteString r6 = r7.getBytes$okio()
            okio.ByteString r4 = r6.substring(r4, r1)
            r5.add(r4)
            int r4 = r1 + 1
        L5e:
            int r1 = r1 + 1
            goto L36
        L61:
            okio.ByteString r1 = r7.getBytes$okio()
            int r1 = r1.size()
            if (r4 >= r1) goto L81
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            okio.ByteString r2 = r7.getBytes$okio()
            okio.ByteString r7 = r7.getBytes$okio()
            int r7 = r7.size()
            okio.ByteString r7 = r2.substring(r4, r7)
            r1.add(r7)
        L81:
            return r0
    }

    public static final okio.Path commonToPath(java.lang.String r1, boolean r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r1 = r0.writeUtf8(r1)
            okio.Path r1 = toPath(r1, r2)
            return r1
    }

    public static final java.lang.String commonToString(okio.Path r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.ByteString r1 = r1.getBytes$okio()
            java.lang.String r1 = r1.utf8()
            return r1
    }

    public static final java.lang.Character commonVolumeLetter(okio.Path r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r1 = access$getSLASH$p()
            r2 = 0
            r3 = 2
            r4 = 0
            int r0 = okio.ByteString.indexOf$default(r0, r1, r2, r3, r4)
            r1 = -1
            if (r0 == r1) goto L18
            return r4
        L18:
            okio.ByteString r0 = r5.getBytes$okio()
            int r0 = r0.size()
            if (r0 >= r3) goto L23
            return r4
        L23:
            okio.ByteString r0 = r5.getBytes$okio()
            r1 = 1
            byte r0 = r0.getByte(r1)
            r1 = 58
            if (r0 == r1) goto L31
            return r4
        L31:
            okio.ByteString r5 = r5.getBytes$okio()
            byte r5 = r5.getByte(r2)
            char r5 = (char) r5
            r0 = 97
            if (r0 > r5) goto L43
            r0 = 123(0x7b, float:1.72E-43)
            if (r5 >= r0) goto L43
            goto L4b
        L43:
            r0 = 65
            if (r0 > r5) goto L50
            r0 = 91
            if (r5 >= r0) goto L50
        L4b:
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            return r5
        L50:
            return r4
    }

    private static /* synthetic */ void getANY_SLASH$annotations() {
            return
    }

    private static /* synthetic */ void getBACKSLASH$annotations() {
            return
    }

    private static /* synthetic */ void getDOT$annotations() {
            return
    }

    private static /* synthetic */ void getDOT_DOT$annotations() {
            return
    }

    private static final int getIndexOfLastSlash(okio.Path r5) {
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.SLASH
            r2 = 0
            r3 = 2
            r4 = 0
            int r0 = okio.ByteString.lastIndexOf$default(r0, r1, r2, r3, r4)
            r1 = -1
            if (r0 == r1) goto L11
            return r0
        L11:
            okio.ByteString r5 = r5.getBytes$okio()
            okio.ByteString r0 = okio.internal.Path.BACKSLASH
            int r5 = okio.ByteString.lastIndexOf$default(r5, r0, r2, r3, r4)
            return r5
    }

    private static /* synthetic */ void getSLASH$annotations() {
            return
    }

    private static final okio.ByteString getSlash(okio.Path r6) {
            okio.ByteString r0 = r6.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.SLASH
            r2 = 0
            r3 = 2
            r4 = 0
            int r0 = okio.ByteString.indexOf$default(r0, r1, r2, r3, r4)
            r5 = -1
            if (r0 == r5) goto L11
            goto L1f
        L11:
            okio.ByteString r6 = r6.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.BACKSLASH
            int r6 = okio.ByteString.indexOf$default(r6, r1, r2, r3, r4)
            if (r6 == r5) goto L1e
            goto L1f
        L1e:
            r1 = r4
        L1f:
            return r1
    }

    private static final boolean lastSegmentIsDotDot(okio.Path r5) {
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.DOT_DOT
            boolean r0 = r0.endsWith(r1)
            r1 = 0
            if (r0 == 0) goto L48
            okio.ByteString r0 = r5.getBytes$okio()
            int r0 = r0.size()
            r2 = 2
            r3 = 1
            if (r0 != r2) goto L1a
            return r3
        L1a:
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r2 = r5.getBytes$okio()
            int r2 = r2.size()
            int r2 = r2 + (-3)
            okio.ByteString r4 = okio.internal.Path.SLASH
            boolean r0 = r0.rangeEquals(r2, r4, r1, r3)
            if (r0 == 0) goto L31
            return r3
        L31:
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r5 = r5.getBytes$okio()
            int r5 = r5.size()
            int r5 = r5 + (-3)
            okio.ByteString r2 = okio.internal.Path.BACKSLASH
            boolean r5 = r0.rangeEquals(r5, r2, r1, r3)
            if (r5 == 0) goto L48
            return r3
        L48:
            return r1
    }

    private static final int rootLength(okio.Path r6) {
            okio.ByteString r0 = r6.getBytes$okio()
            int r0 = r0.size()
            r1 = -1
            if (r0 != 0) goto Lc
            return r1
        Lc:
            okio.ByteString r0 = r6.getBytes$okio()
            r2 = 0
            byte r0 = r0.getByte(r2)
            r3 = 47
            r4 = 1
            if (r0 != r3) goto L1b
            return r4
        L1b:
            okio.ByteString r0 = r6.getBytes$okio()
            byte r0 = r0.getByte(r2)
            r3 = 92
            r5 = 2
            if (r0 != r3) goto L52
            okio.ByteString r0 = r6.getBytes$okio()
            int r0 = r0.size()
            if (r0 <= r5) goto L51
            okio.ByteString r0 = r6.getBytes$okio()
            byte r0 = r0.getByte(r4)
            if (r0 != r3) goto L51
            okio.ByteString r0 = r6.getBytes$okio()
            okio.ByteString r2 = okio.internal.Path.BACKSLASH
            int r0 = r0.indexOf(r2, r5)
            if (r0 != r1) goto L50
            okio.ByteString r6 = r6.getBytes$okio()
            int r0 = r6.size()
        L50:
            return r0
        L51:
            return r4
        L52:
            okio.ByteString r0 = r6.getBytes$okio()
            int r0 = r0.size()
            if (r0 <= r5) goto L8e
            okio.ByteString r0 = r6.getBytes$okio()
            byte r0 = r0.getByte(r4)
            r4 = 58
            if (r0 != r4) goto L8e
            okio.ByteString r0 = r6.getBytes$okio()
            byte r0 = r0.getByte(r5)
            if (r0 != r3) goto L8e
            okio.ByteString r6 = r6.getBytes$okio()
            byte r6 = r6.getByte(r2)
            char r6 = (char) r6
            r0 = 97
            if (r0 > r6) goto L84
            r0 = 123(0x7b, float:1.72E-43)
            if (r6 >= r0) goto L84
            goto L8c
        L84:
            r0 = 65
            if (r0 > r6) goto L8e
            r0 = 91
            if (r6 >= r0) goto L8e
        L8c:
            r6 = 3
            return r6
        L8e:
            return r1
    }

    private static final boolean startsWithVolumeLetterAndColon(okio.Buffer r5, okio.ByteString r6) {
            okio.ByteString r0 = okio.internal.Path.BACKSLASH
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)
            r0 = 0
            if (r6 != 0) goto La
            return r0
        La:
            long r1 = r5.size()
            r3 = 2
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 >= 0) goto L15
            return r0
        L15:
            r1 = 1
            byte r6 = r5.getByte(r1)
            r1 = 58
            if (r6 == r1) goto L20
            return r0
        L20:
            r1 = 0
            byte r5 = r5.getByte(r1)
            char r5 = (char) r5
            r6 = 97
            if (r6 > r5) goto L30
            r6 = 123(0x7b, float:1.72E-43)
            if (r5 >= r6) goto L30
            goto L38
        L30:
            r6 = 65
            if (r6 > r5) goto L39
            r6 = 91
            if (r5 >= r6) goto L39
        L38:
            r0 = 1
        L39:
            return r0
    }

    public static final okio.Path toPath(okio.Buffer r16, boolean r17) {
            r0 = r16
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r2 = 0
            r3 = 0
            r4 = r3
        Lf:
            okio.ByteString r5 = okio.internal.Path.SLASH
            r6 = 0
            boolean r5 = r0.rangeEquals(r6, r5)
            if (r5 != 0) goto L11c
            okio.ByteString r5 = okio.internal.Path.BACKSLASH
            boolean r8 = r0.rangeEquals(r6, r5)
            if (r8 == 0) goto L23
            goto L11c
        L23:
            r8 = 2
            r9 = 1
            if (r4 < r8) goto L2f
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r5)
            if (r5 == 0) goto L2f
            r5 = r9
            goto L30
        L2f:
            r5 = r3
        L30:
            r10 = -1
            if (r5 == 0) goto L3e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r1.write(r2)
            r1.write(r2)
            goto L77
        L3e:
            if (r4 <= 0) goto L47
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r1.write(r2)
            goto L77
        L47:
            okio.ByteString r4 = okio.internal.Path.ANY_SLASH
            long r12 = r0.indexOfElement(r4)
            if (r2 != 0) goto L62
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 != 0) goto L5a
            java.lang.String r2 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r2 = toSlash(r2)
            goto L62
        L5a:
            byte r2 = r0.getByte(r12)
            okio.ByteString r2 = toSlash(r2)
        L62:
            boolean r4 = startsWithVolumeLetterAndColon(r0, r2)
            if (r4 == 0) goto L77
            r14 = 2
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 != 0) goto L74
            r12 = 3
            r1.write(r0, r12)
            goto L77
        L74:
            r1.write(r0, r14)
        L77:
            long r12 = r1.size()
            int r4 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r4 <= 0) goto L81
            r4 = r9
            goto L82
        L81:
            r4 = r3
        L82:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.List r8 = (java.util.List) r8
        L89:
            boolean r12 = r16.exhausted()
            if (r12 != 0) goto Lee
            okio.ByteString r12 = okio.internal.Path.ANY_SLASH
            long r12 = r0.indexOfElement(r12)
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 != 0) goto L9e
            okio.ByteString r12 = r16.readByteString()
            goto La5
        L9e:
            okio.ByteString r12 = r0.readByteString(r12)
            r16.readByte()
        La5:
            okio.ByteString r13 = okio.internal.Path.DOT_DOT
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r13)
            if (r14 == 0) goto Lda
            if (r4 == 0) goto Lb5
            boolean r14 = r8.isEmpty()
            if (r14 != 0) goto L89
        Lb5:
            if (r17 == 0) goto Ld6
            if (r4 != 0) goto Lca
            boolean r14 = r8.isEmpty()
            if (r14 != 0) goto Ld6
            java.lang.Object r14 = kotlin.collections.CollectionsKt.last(r8)
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r13)
            if (r13 == 0) goto Lca
            goto Ld6
        Lca:
            if (r5 == 0) goto Ld2
            int r12 = r8.size()
            if (r12 == r9) goto L89
        Ld2:
            kotlin.collections.CollectionsKt.removeLastOrNull(r8)
            goto L89
        Ld6:
            r8.add(r12)
            goto L89
        Lda:
            okio.ByteString r13 = okio.internal.Path.DOT
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r13)
            if (r13 != 0) goto L89
            okio.ByteString r13 = okio.ByteString.EMPTY
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r13)
            if (r13 != 0) goto L89
            r8.add(r12)
            goto L89
        Lee:
            int r0 = r8.size()
        Lf2:
            if (r3 >= r0) goto L105
            if (r3 <= 0) goto Lf9
            r1.write(r2)
        Lf9:
            java.lang.Object r4 = r8.get(r3)
            okio.ByteString r4 = (okio.ByteString) r4
            r1.write(r4)
            int r3 = r3 + 1
            goto Lf2
        L105:
            long r2 = r1.size()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L112
            okio.ByteString r0 = okio.internal.Path.DOT
            r1.write(r0)
        L112:
            okio.Path r0 = new okio.Path
            okio.ByteString r1 = r1.readByteString()
            r0.<init>(r1)
            return r0
        L11c:
            byte r5 = r16.readByte()
            if (r2 != 0) goto L126
            okio.ByteString r2 = toSlash(r5)
        L126:
            int r4 = r4 + 1
            goto Lf
    }

    private static final okio.ByteString toSlash(byte r3) {
            r0 = 47
            if (r3 == r0) goto L20
            r0 = 92
            if (r3 != r0) goto Lb
            okio.ByteString r3 = okio.internal.Path.BACKSLASH
            goto L22
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "not a directory separator: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L20:
            okio.ByteString r3 = okio.internal.Path.SLASH
        L22:
            return r3
    }

    private static final okio.ByteString toSlash(java.lang.String r3) {
            java.lang.String r0 = "/"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto Lb
            okio.ByteString r3 = okio.internal.Path.SLASH
            goto L15
        Lb:
            java.lang.String r0 = "\\"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L16
            okio.ByteString r3 = okio.internal.Path.BACKSLASH
        L15:
            return r3
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "not a directory separator: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }
}
