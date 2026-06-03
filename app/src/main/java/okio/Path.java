package okio;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0000H\u0096\u0002J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\rH\u0087\u0002¢\u0006\u0002\b\"J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b\"J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0002\b\"J\u0013\u0010#\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\u001eH\u0016J\u0006\u0010&\u001a\u00020\u0000J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001c¨\u0006/"}, d2 = {"Lokio/Path;", "", "bytes", "Lokio/ByteString;", "(Lokio/ByteString;)V", "getBytes$okio", "()Lokio/ByteString;", "isAbsolute", "", "()Z", "isRelative", "isRoot", "name", "", "()Ljava/lang/String;", "nameBytes", "parent", "()Lokio/Path;", "root", "getRoot", "segments", "", "getSegments", "()Ljava/util/List;", "segmentsBytes", "getSegmentsBytes", "volumeLetter", "", "()Ljava/lang/Character;", "compareTo", "", "other", "div", "child", "resolve", "equals", "", "hashCode", "normalized", "relativeTo", "normalize", "toFile", "Ljava/io/File;", "toNioPath", "Ljava/nio/file/Path;", "toString", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Path implements java.lang.Comparable<okio.Path> {
    public static final okio.Path.Companion Companion = null;
    public static final java.lang.String DIRECTORY_SEPARATOR = null;
    private final okio.ByteString bytes;

    /* JADX INFO: compiled from: Path.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokio/Path$Companion;", "", "()V", "DIRECTORY_SEPARATOR", "", "toOkioPath", "Lokio/Path;", "Ljava/io/File;", "normalize", "", "get", "Ljava/nio/file/Path;", "toPath", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public static /* synthetic */ okio.Path get$default(okio.Path.Companion r0, java.io.File r1, boolean r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okio.Path r0 = r0.get(r1, r2)
                return r0
        }

        public static /* synthetic */ okio.Path get$default(okio.Path.Companion r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okio.Path r0 = r0.get(r1, r2)
                return r0
        }

        public static /* synthetic */ okio.Path get$default(okio.Path.Companion r0, java.nio.file.Path r1, boolean r2, int r3, java.lang.Object r4) {
                r3 = r3 & 1
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                okio.Path r0 = r0.get(r1, r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.io.File r4) {
                r3 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = 1
                r1 = 0
                r2 = 0
                okio.Path r4 = get$default(r3, r4, r2, r0, r1)
                return r4
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.io.File r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r0 = "toString(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                okio.Path r2 = r1.get(r2, r3)
                return r2
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.lang.String r4) {
                r3 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = 1
                r1 = 0
                r2 = 0
                okio.Path r4 = get$default(r3, r4, r2, r0, r1)
                return r4
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.lang.String r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.Path r2 = okio.internal.Path.commonToPath(r2, r3)
                return r2
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.nio.file.Path r4) {
                r3 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r0 = 1
                r1 = 0
                r2 = 0
                okio.Path r4 = get$default(r3, r4, r2, r0, r1)
                return r4
        }

        @kotlin.jvm.JvmStatic
        public final okio.Path get(java.nio.file.Path r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r2 = r2.toString()
                okio.Path r2 = r1.get(r2, r3)
                return r2
        }
    }

    static {
            okio.Path$Companion r0 = new okio.Path$Companion
            r1 = 0
            r0.<init>(r1)
            okio.Path.Companion = r0
            java.lang.String r0 = java.io.File.separator
            java.lang.String r1 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            okio.Path.DIRECTORY_SEPARATOR = r0
            return
    }

    public Path(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.bytes = r2
            return
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.io.File r1) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.io.File r1, boolean r2) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.lang.String r1) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.lang.String r1, boolean r2) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.nio.file.Path r1) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1)
            return r1
    }

    @kotlin.jvm.JvmStatic
    public static final okio.Path get(java.nio.file.Path r1, boolean r2) {
            okio.Path$Companion r0 = okio.Path.Companion
            okio.Path r1 = r0.get(r1, r2)
            return r1
    }

    public static /* synthetic */ okio.Path resolve$default(okio.Path r0, java.lang.String r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            okio.Path r0 = r0.resolve(r1, r2)
            return r0
    }

    public static /* synthetic */ okio.Path resolve$default(okio.Path r0, okio.ByteString r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            okio.Path r0 = r0.resolve(r1, r2)
            return r0
    }

    public static /* synthetic */ okio.Path resolve$default(okio.Path r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            okio.Path r0 = r0.resolve(r1, r2)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(okio.Path r1) {
            r0 = this;
            okio.Path r1 = (okio.Path) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.ByteString r0 = r1.getBytes$okio()
            okio.ByteString r2 = r2.getBytes$okio()
            int r2 = r0.compareTo2(r2)
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof okio.Path
            if (r0 == 0) goto L16
            okio.Path r2 = (okio.Path) r2
            okio.ByteString r2 = r2.getBytes$okio()
            okio.ByteString r0 = r1.getBytes$okio()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    public final okio.ByteString getBytes$okio() {
            r1 = this;
            okio.ByteString r0 = r1.bytes
            return r0
    }

    public final okio.Path getRoot() {
            r4 = this;
            int r0 = okio.internal.Path.access$rootLength(r4)
            r1 = -1
            if (r0 != r1) goto L9
            r0 = 0
            goto L18
        L9:
            okio.Path r1 = new okio.Path
            okio.ByteString r2 = r4.getBytes$okio()
            r3 = 0
            okio.ByteString r0 = r2.substring(r3, r0)
            r1.<init>(r0)
            r0 = r1
        L18:
            return r0
    }

    public final java.util.List<java.lang.String> getSegments() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            int r1 = okio.internal.Path.access$rootLength(r7)
            r2 = -1
            r3 = 92
            if (r1 != r2) goto L12
            r1 = 0
            goto L28
        L12:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            if (r1 >= r2) goto L28
            okio.ByteString r2 = r7.getBytes$okio()
            byte r2 = r2.getByte(r1)
            if (r2 != r3) goto L28
            int r1 = r1 + 1
        L28:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            r4 = r1
        L31:
            if (r1 >= r2) goto L5c
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            r6 = 47
            if (r5 == r6) goto L49
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            if (r5 != r3) goto L59
        L49:
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            okio.ByteString r6 = r7.getBytes$okio()
            okio.ByteString r4 = r6.substring(r4, r1)
            r5.add(r4)
            int r4 = r1 + 1
        L59:
            int r1 = r1 + 1
            goto L31
        L5c:
            okio.ByteString r1 = r7.getBytes$okio()
            int r1 = r1.size()
            if (r4 >= r1) goto L7c
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            okio.ByteString r2 = r7.getBytes$okio()
            okio.ByteString r3 = r7.getBytes$okio()
            int r3 = r3.size()
            okio.ByteString r2 = r2.substring(r4, r3)
            r1.add(r2)
        L7c:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
            r1.<init>(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L8f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La3
            java.lang.Object r2 = r0.next()
            okio.ByteString r2 = (okio.ByteString) r2
            java.lang.String r2 = r2.utf8()
            r1.add(r2)
            goto L8f
        La3:
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public final java.util.List<okio.ByteString> getSegmentsBytes() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            int r1 = okio.internal.Path.access$rootLength(r7)
            r2 = -1
            r3 = 92
            if (r1 != r2) goto L12
            r1 = 0
            goto L28
        L12:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            if (r1 >= r2) goto L28
            okio.ByteString r2 = r7.getBytes$okio()
            byte r2 = r2.getByte(r1)
            if (r2 != r3) goto L28
            int r1 = r1 + 1
        L28:
            okio.ByteString r2 = r7.getBytes$okio()
            int r2 = r2.size()
            r4 = r1
        L31:
            if (r1 >= r2) goto L5c
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            r6 = 47
            if (r5 == r6) goto L49
            okio.ByteString r5 = r7.getBytes$okio()
            byte r5 = r5.getByte(r1)
            if (r5 != r3) goto L59
        L49:
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            okio.ByteString r6 = r7.getBytes$okio()
            okio.ByteString r4 = r6.substring(r4, r1)
            r5.add(r4)
            int r4 = r1 + 1
        L59:
            int r1 = r1 + 1
            goto L31
        L5c:
            okio.ByteString r1 = r7.getBytes$okio()
            int r1 = r1.size()
            if (r4 >= r1) goto L7c
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            okio.ByteString r2 = r7.getBytes$okio()
            okio.ByteString r3 = r7.getBytes$okio()
            int r3 = r3.size()
            okio.ByteString r2 = r2.substring(r4, r3)
            r1.add(r2)
        L7c:
            return r0
    }

    public int hashCode() {
            r1 = this;
            okio.ByteString r0 = r1.getBytes$okio()
            int r0 = r0.hashCode()
            return r0
    }

    public final boolean isAbsolute() {
            r2 = this;
            int r0 = okio.internal.Path.access$rootLength(r2)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final boolean isRelative() {
            r2 = this;
            int r0 = okio.internal.Path.access$rootLength(r2)
            r1 = -1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final boolean isRoot() {
            r2 = this;
            int r0 = okio.internal.Path.access$rootLength(r2)
            okio.ByteString r1 = r2.getBytes$okio()
            int r1 = r1.size()
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public final java.lang.String name() {
            r1 = this;
            okio.ByteString r0 = r1.nameBytes()
            java.lang.String r0 = r0.utf8()
            return r0
    }

    public final okio.ByteString nameBytes() {
            r5 = this;
            int r0 = okio.internal.Path.access$getIndexOfLastSlash(r5)
            r1 = -1
            r2 = 2
            if (r0 == r1) goto L15
            okio.ByteString r1 = r5.getBytes$okio()
            int r0 = r0 + 1
            r3 = 0
            r4 = 0
            okio.ByteString r0 = okio.ByteString.substring$default(r1, r0, r3, r2, r4)
            goto L2c
        L15:
            java.lang.Character r0 = r5.volumeLetter()
            if (r0 == 0) goto L28
            okio.ByteString r0 = r5.getBytes$okio()
            int r0 = r0.size()
            if (r0 != r2) goto L28
            okio.ByteString r0 = okio.ByteString.EMPTY
            goto L2c
        L28:
            okio.ByteString r0 = r5.getBytes$okio()
        L2c:
            return r0
    }

    public final okio.Path normalized() {
            r3 = this;
            okio.Path$Companion r0 = okio.Path.Companion
            java.lang.String r1 = r3.toString()
            r2 = 1
            okio.Path r0 = r0.get(r1, r2)
            return r0
    }

    public final okio.Path parent() {
            r7 = this;
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.access$getDOT$p()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r1 = 0
            if (r0 != 0) goto Lbb
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r2 = okio.internal.Path.access$getSLASH$p()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 != 0) goto Lbb
            okio.ByteString r0 = r7.getBytes$okio()
            okio.ByteString r2 = okio.internal.Path.access$getBACKSLASH$p()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 != 0) goto Lbb
            boolean r0 = okio.internal.Path.access$lastSegmentIsDotDot(r7)
            if (r0 == 0) goto L33
            goto Lbb
        L33:
            int r0 = okio.internal.Path.access$getIndexOfLastSlash(r7)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L5e
            java.lang.Character r5 = r7.volumeLetter()
            if (r5 == 0) goto L5e
            okio.ByteString r0 = r7.getBytes$okio()
            int r0 = r0.size()
            r2 = 3
            if (r0 != r2) goto L4f
            goto Lbb
        L4f:
            okio.Path r0 = new okio.Path
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r1 = okio.ByteString.substring$default(r5, r3, r2, r4, r1)
            r0.<init>(r1)
        L5c:
            r1 = r0
            goto Lbb
        L5e:
            if (r0 != r4) goto L6f
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r6 = okio.internal.Path.access$getBACKSLASH$p()
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto L6f
            goto Lbb
        L6f:
            r5 = -1
            if (r0 != r5) goto L91
            java.lang.Character r6 = r7.volumeLetter()
            if (r6 == 0) goto L91
            okio.ByteString r0 = r7.getBytes$okio()
            int r0 = r0.size()
            if (r0 != r2) goto L83
            goto Lbb
        L83:
            okio.Path r0 = new okio.Path
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r1 = okio.ByteString.substring$default(r5, r3, r2, r4, r1)
            r0.<init>(r1)
            goto L5c
        L91:
            if (r0 != r5) goto L9d
            okio.Path r1 = new okio.Path
            okio.ByteString r0 = okio.internal.Path.access$getDOT$p()
            r1.<init>(r0)
            goto Lbb
        L9d:
            if (r0 != 0) goto Lad
            okio.Path r0 = new okio.Path
            okio.ByteString r2 = r7.getBytes$okio()
            okio.ByteString r1 = okio.ByteString.substring$default(r2, r3, r4, r4, r1)
            r0.<init>(r1)
            goto L5c
        Lad:
            okio.Path r2 = new okio.Path
            okio.ByteString r5 = r7.getBytes$okio()
            okio.ByteString r0 = okio.ByteString.substring$default(r5, r3, r0, r4, r1)
            r2.<init>(r0)
            r1 = r2
        Lbb:
            return r1
    }

    public final okio.Path relativeTo(okio.Path r9) {
            r8 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            okio.Path r0 = r8.getRoot()
            okio.Path r1 = r9.getRoot()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            java.lang.String r1 = " and "
            if (r0 == 0) goto Ld6
            java.util.List r0 = r8.getSegmentsBytes()
            java.util.List r2 = r9.getSegmentsBytes()
            int r3 = r0.size()
            int r4 = r2.size()
            int r3 = java.lang.Math.min(r3, r4)
            r4 = 0
            r5 = r4
        L2b:
            if (r5 >= r3) goto L3e
            java.lang.Object r6 = r0.get(r5)
            java.lang.Object r7 = r2.get(r5)
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 == 0) goto L3e
            int r5 = r5 + 1
            goto L2b
        L3e:
            if (r5 != r3) goto L5d
            okio.ByteString r3 = r8.getBytes$okio()
            int r3 = r3.size()
            okio.ByteString r6 = r9.getBytes$okio()
            int r6 = r6.size()
            if (r3 != r6) goto L5d
            okio.Path$Companion r9 = okio.Path.Companion
            java.lang.String r0 = "."
            r1 = 0
            r2 = 1
            okio.Path r9 = okio.Path.Companion.get$default(r9, r0, r4, r2, r1)
            goto Lb4
        L5d:
            int r3 = r2.size()
            java.util.List r3 = r2.subList(r5, r3)
            okio.ByteString r6 = okio.internal.Path.access$getDOT_DOT$p()
            int r3 = r3.indexOf(r6)
            r6 = -1
            if (r3 != r6) goto Lb5
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            okio.ByteString r9 = okio.internal.Path.access$getSlash(r9)
            if (r9 != 0) goto L87
            okio.ByteString r9 = okio.internal.Path.access$getSlash(r8)
            if (r9 != 0) goto L87
            java.lang.String r9 = okio.Path.DIRECTORY_SEPARATOR
            okio.ByteString r9 = okio.internal.Path.access$toSlash(r9)
        L87:
            int r2 = r2.size()
            r3 = r5
        L8c:
            if (r3 >= r2) goto L9b
            okio.ByteString r6 = okio.internal.Path.access$getDOT_DOT$p()
            r1.write(r6)
            r1.write(r9)
            int r3 = r3 + 1
            goto L8c
        L9b:
            int r2 = r0.size()
        L9f:
            if (r5 >= r2) goto Lb0
            java.lang.Object r3 = r0.get(r5)
            okio.ByteString r3 = (okio.ByteString) r3
            r1.write(r3)
            r1.write(r9)
            int r5 = r5 + 1
            goto L9f
        Lb0:
            okio.Path r9 = okio.internal.Path.toPath(r1, r4)
        Lb4:
            return r9
        Lb5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Impossible relative path to resolve: "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r9 = r0.append(r9)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        Ld6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Paths of different roots cannot be relative to each other: "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r9 = r0.append(r9)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
    }

    public final okio.Path resolve(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.writeUtf8(r2)
            r0 = 0
            okio.Path r2 = okio.internal.Path.toPath(r2, r0)
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r0)
            return r2
    }

    public final okio.Path resolve(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.writeUtf8(r2)
            r0 = 0
            okio.Path r2 = okio.internal.Path.toPath(r2, r0)
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r3)
            return r2
    }

    public final okio.Path resolve(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.write(r2)
            r0 = 0
            okio.Path r2 = okio.internal.Path.toPath(r2, r0)
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r0)
            return r2
    }

    public final okio.Path resolve(okio.ByteString r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r2 = r0.write(r2)
            r0 = 0
            okio.Path r2 = okio.internal.Path.toPath(r2, r0)
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r3)
            return r2
    }

    public final okio.Path resolve(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r0)
            return r2
    }

    public final okio.Path resolve(okio.Path r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Path r2 = okio.internal.Path.commonResolve(r1, r2, r3)
            return r2
    }

    public final java.io.File toFile() {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            return r0
    }

    public final java.nio.file.Path toNioPath() {
            r2 = this;
            java.lang.String r0 = r2.toString()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            java.lang.String r1 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            okio.ByteString r0 = r1.getBytes$okio()
            java.lang.String r0 = r0.utf8()
            return r0
    }

    public final java.lang.Character volumeLetter() {
            r5 = this;
            okio.ByteString r0 = r5.getBytes$okio()
            okio.ByteString r1 = okio.internal.Path.access$getSLASH$p()
            r2 = 0
            r3 = 2
            r4 = 0
            int r0 = okio.ByteString.indexOf$default(r0, r1, r2, r3, r4)
            r1 = -1
            if (r0 == r1) goto L13
            goto L4a
        L13:
            okio.ByteString r0 = r5.getBytes$okio()
            int r0 = r0.size()
            if (r0 >= r3) goto L1e
            goto L4a
        L1e:
            okio.ByteString r0 = r5.getBytes$okio()
            r1 = 1
            byte r0 = r0.getByte(r1)
            r1 = 58
            if (r0 == r1) goto L2c
            goto L4a
        L2c:
            okio.ByteString r0 = r5.getBytes$okio()
            byte r0 = r0.getByte(r2)
            char r0 = (char) r0
            r1 = 97
            if (r1 > r0) goto L3e
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 >= r1) goto L3e
            goto L46
        L3e:
            r1 = 65
            if (r1 > r0) goto L4a
            r1 = 91
            if (r0 >= r1) goto L4a
        L46:
            java.lang.Character r4 = java.lang.Character.valueOf(r0)
        L4a:
            return r4
    }
}
