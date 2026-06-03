package okio.internal;

/* JADX INFO: compiled from: ResourceFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J \u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0018\u0010'\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u001e\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\n0\t*\u00020\u0003H\u0002J\u001a\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n*\u00020+H\u0002J\u001a\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n*\u00020+H\u0002J\f\u0010-\u001a\u00020.*\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\n0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lokio/internal/ResourceFileSystem;", "Lokio/FileSystem;", "classLoader", "Ljava/lang/ClassLoader;", "indexEagerly", "", "systemFileSystem", "(Ljava/lang/ClassLoader;ZLokio/FileSystem;)V", "roots", "", "Lkotlin/Pair;", "Lokio/Path;", "getRoots", "()Ljava/util/List;", "roots$delegate", "Lkotlin/Lazy;", "appendingSink", "Lokio/Sink;", "file", "mustExist", "atomicMove", "", "source", "target", "canonicalize", "path", "canonicalizeInternal", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toClasspathRoots", "toFileRoot", "Ljava/net/URL;", "toJarRoot", "toRelativePath", "", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ResourceFileSystem extends okio.FileSystem {
    private static final okio.internal.ResourceFileSystem.Companion Companion = null;
    private static final okio.Path ROOT = null;
    private final java.lang.ClassLoader classLoader;
    private final kotlin.Lazy roots$delegate;
    private final okio.FileSystem systemFileSystem;

    /* JADX INFO: compiled from: ResourceFileSystem.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lokio/internal/ResourceFileSystem$Companion;", "", "()V", "ROOT", "Lokio/Path;", "getROOT", "()Lokio/Path;", "keepPath", "", "path", "removeBase", "base", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
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

        public static final /* synthetic */ boolean access$keepPath(okio.internal.ResourceFileSystem.Companion r0, okio.Path r1) {
                boolean r0 = r0.keepPath(r1)
                return r0
        }

        private final boolean keepPath(okio.Path r3) {
                r2 = this;
                java.lang.String r3 = r3.name()
                java.lang.String r0 = ".class"
                r1 = 1
                boolean r3 = kotlin.text.StringsKt.endsWith(r3, r0, r1)
                r3 = r3 ^ r1
                return r3
        }

        public final okio.Path getROOT() {
                r1 = this;
                okio.Path r0 = okio.internal.ResourceFileSystem.access$getROOT$cp()
                return r0
        }

        public final okio.Path removeBase(okio.Path r8, okio.Path r9) {
                r7 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "base"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                java.lang.String r9 = r9.toString()
                okio.Path r0 = r7.getROOT()
                java.lang.String r8 = r8.toString()
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                java.lang.String r1 = kotlin.text.StringsKt.removePrefix(r8, r9)
                r5 = 4
                r6 = 0
                r2 = 92
                r3 = 47
                r4 = 0
                java.lang.String r8 = kotlin.text.StringsKt.replace$default(r1, r2, r3, r4, r5, r6)
                okio.Path r8 = r0.resolve(r8)
                return r8
        }
    }

    static {
            okio.internal.ResourceFileSystem$Companion r0 = new okio.internal.ResourceFileSystem$Companion
            r1 = 0
            r0.<init>(r1)
            okio.internal.ResourceFileSystem.Companion = r0
            okio.Path$Companion r0 = okio.Path.Companion
            r2 = 0
            r3 = 1
            java.lang.String r4 = "/"
            okio.Path r0 = okio.Path.Companion.get$default(r0, r4, r2, r3, r1)
            okio.internal.ResourceFileSystem.ROOT = r0
            return
    }

    public ResourceFileSystem(java.lang.ClassLoader r2, boolean r3, okio.FileSystem r4) {
            r1 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "systemFileSystem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.classLoader = r2
            r1.systemFileSystem = r4
            okio.internal.ResourceFileSystem$roots$2 r2 = new okio.internal.ResourceFileSystem$roots$2
            r2.<init>(r1)
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            kotlin.Lazy r2 = kotlin.LazyKt.lazy(r2)
            r1.roots$delegate = r2
            if (r3 == 0) goto L27
            java.util.List r2 = r1.getRoots()
            r2.size()
        L27:
            return
    }

    public /* synthetic */ ResourceFileSystem(java.lang.ClassLoader r1, boolean r2, okio.FileSystem r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L6
            okio.FileSystem r3 = okio.FileSystem.SYSTEM
        L6:
            r0.<init>(r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.ClassLoader access$getClassLoader$p(okio.internal.ResourceFileSystem r0) {
            java.lang.ClassLoader r0 = r0.classLoader
            return r0
    }

    public static final /* synthetic */ okio.internal.ResourceFileSystem.Companion access$getCompanion$p() {
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            return r0
    }

    public static final /* synthetic */ okio.Path access$getROOT$cp() {
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            return r0
    }

    public static final /* synthetic */ java.util.List access$toClasspathRoots(okio.internal.ResourceFileSystem r0, java.lang.ClassLoader r1) {
            java.util.List r0 = r0.toClasspathRoots(r1)
            return r0
    }

    private final okio.Path canonicalizeInternal(okio.Path r3) {
            r2 = this;
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            r1 = 1
            okio.Path r3 = r0.resolve(r3, r1)
            return r3
    }

    private final java.util.List<kotlin.Pair<okio.FileSystem, okio.Path>> getRoots() {
            r1 = this;
            kotlin.Lazy r0 = r1.roots$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private final java.util.List<kotlin.Pair<okio.FileSystem, okio.Path>> toClasspathRoots(java.lang.ClassLoader r6) {
            r5 = this;
            java.lang.String r0 = ""
            java.util.Enumeration r0 = r6.getResources(r0)
            java.lang.String r1 = "getResources(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.util.ArrayList r0 = java.util.Collections.list(r0)
            java.lang.String r2 = "list(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r0.next()
            java.net.URL r4 = (java.net.URL) r4
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            kotlin.Pair r4 = r5.toFileRoot(r4)
            if (r4 == 0) goto L23
            r3.add(r4)
            goto L23
        L3c:
            java.util.List r3 = (java.util.List) r3
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.String r0 = "META-INF/MANIFEST.MF"
            java.util.Enumeration r6 = r6.getResources(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            java.util.ArrayList r6 = java.util.Collections.list(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r6 = r6.iterator()
        L5f:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r6.next()
            java.net.URL r1 = (java.net.URL) r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            kotlin.Pair r1 = r5.toJarRoot(r1)
            if (r1 == 0) goto L5f
            r0.add(r1)
            goto L5f
        L78:
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r6 = kotlin.collections.CollectionsKt.plus(r3, r0)
            return r6
    }

    private final kotlin.Pair<okio.FileSystem, okio.Path> toFileRoot(java.net.URL r6) {
            r5 = this;
            java.lang.String r0 = r6.getProtocol()
            java.lang.String r1 = "file"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            okio.FileSystem r0 = r5.systemFileSystem
            okio.Path$Companion r2 = okio.Path.Companion
            java.io.File r3 = new java.io.File
            java.net.URI r6 = r6.toURI()
            r3.<init>(r6)
            r6 = 0
            r4 = 1
            okio.Path r6 = okio.Path.Companion.get$default(r2, r3, r6, r4, r1)
            kotlin.Pair r6 = kotlin.TuplesKt.to(r0, r6)
            return r6
    }

    private final kotlin.Pair<okio.FileSystem, okio.Path> toJarRoot(java.net.URL r11) {
            r10 = this;
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            java.lang.String r0 = "jar:file:"
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r11, r0, r1, r2, r3)
            if (r0 != 0) goto L15
            return r3
        L15:
            r4 = r11
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r8 = 6
            r9 = 0
            java.lang.String r5 = "!"
            r6 = 0
            r7 = 0
            int r0 = kotlin.text.StringsKt.lastIndexOf$default(r4, r5, r6, r7, r8, r9)
            r2 = -1
            if (r0 != r2) goto L26
            return r3
        L26:
            okio.Path$Companion r2 = okio.Path.Companion
            java.io.File r4 = new java.io.File
            r5 = 4
            java.lang.String r11 = r11.substring(r5, r0)
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            java.net.URI r11 = java.net.URI.create(r11)
            r4.<init>(r11)
            r11 = 1
            okio.Path r11 = okio.Path.Companion.get$default(r2, r4, r1, r11, r3)
            okio.FileSystem r0 = r10.systemFileSystem
            okio.internal.ResourceFileSystem$toJarRoot$zip$1 r1 = okio.internal.ResourceFileSystem$toJarRoot$zip$1.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            okio.ZipFileSystem r11 = okio.internal.ZipFilesKt.openZip(r11, r0, r1)
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            kotlin.Pair r11 = kotlin.TuplesKt.to(r11, r0)
            return r11
    }

    private final java.lang.String toRelativePath(okio.Path r2) {
            r1 = this;
            okio.Path r2 = r1.canonicalizeInternal(r2)
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            okio.Path r2 = r2.relativeTo(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path r2, boolean r3) {
            r1 = this;
            java.lang.String r3 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r0 = " is read-only"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path r2, okio.Path r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r0 = " is read-only"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Path r2 = r1.canonicalizeInternal(r2)
            return r2
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path r2, boolean r3) {
            r1 = this;
            java.lang.String r3 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r0 = " is read-only"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path r2, okio.Path r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r0 = " is read-only"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public void delete(okio.Path r2, boolean r3) {
            r1 = this;
            java.lang.String r3 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r0 = " is read-only"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path r12) {
            r11 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = r11.toRelativePath(r12)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Set r1 = (java.util.Set) r1
            java.util.List r2 = r11.getRoots()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L19:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L96
            java.lang.Object r4 = r2.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            okio.FileSystem r5 = (okio.FileSystem) r5
            java.lang.Object r4 = r4.component2()
            okio.Path r4 = (okio.Path) r4
            r6 = r1
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.io.IOException -> L19
            okio.Path r7 = r4.resolve(r0)     // Catch: java.io.IOException -> L19
            java.util.List r5 = r5.list(r7)     // Catch: java.io.IOException -> L19
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.io.IOException -> L19
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.io.IOException -> L19
            r7.<init>()     // Catch: java.io.IOException -> L19
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.io.IOException -> L19
            java.util.Iterator r5 = r5.iterator()     // Catch: java.io.IOException -> L19
        L49:
            boolean r8 = r5.hasNext()     // Catch: java.io.IOException -> L19
            if (r8 == 0) goto L62
            java.lang.Object r8 = r5.next()     // Catch: java.io.IOException -> L19
            r9 = r8
            okio.Path r9 = (okio.Path) r9     // Catch: java.io.IOException -> L19
            okio.internal.ResourceFileSystem$Companion r10 = okio.internal.ResourceFileSystem.Companion     // Catch: java.io.IOException -> L19
            boolean r9 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r10, r9)     // Catch: java.io.IOException -> L19
            if (r9 == 0) goto L49
            r7.add(r8)     // Catch: java.io.IOException -> L19
            goto L49
        L62:
            java.util.List r7 = (java.util.List) r7     // Catch: java.io.IOException -> L19
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.io.IOException -> L19
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.io.IOException -> L19
            r8 = 10
            int r8 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r7, r8)     // Catch: java.io.IOException -> L19
            r5.<init>(r8)     // Catch: java.io.IOException -> L19
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.io.IOException -> L19
            java.util.Iterator r7 = r7.iterator()     // Catch: java.io.IOException -> L19
        L77:
            boolean r8 = r7.hasNext()     // Catch: java.io.IOException -> L19
            if (r8 == 0) goto L8d
            java.lang.Object r8 = r7.next()     // Catch: java.io.IOException -> L19
            okio.Path r8 = (okio.Path) r8     // Catch: java.io.IOException -> L19
            okio.internal.ResourceFileSystem$Companion r9 = okio.internal.ResourceFileSystem.Companion     // Catch: java.io.IOException -> L19
            okio.Path r8 = r9.removeBase(r8, r4)     // Catch: java.io.IOException -> L19
            r5.add(r8)     // Catch: java.io.IOException -> L19
            goto L77
        L8d:
            java.util.List r5 = (java.util.List) r5     // Catch: java.io.IOException -> L19
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.io.IOException -> L19
            kotlin.collections.CollectionsKt.addAll(r6, r5)     // Catch: java.io.IOException -> L19
            r3 = 1
            goto L19
        L96:
            if (r3 == 0) goto L9f
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r12 = kotlin.collections.CollectionsKt.toList(r1)
            return r12
        L9f:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "file not found: "
            r1.<init>(r2)
            java.lang.StringBuilder r12 = r1.append(r12)
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path r10) {
            r9 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r10 = r9.toRelativePath(r10)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r0 = (java.util.Set) r0
            java.util.List r1 = r9.getRoots()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L19:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r1.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r5 = r3.component1()
            okio.FileSystem r5 = (okio.FileSystem) r5
            java.lang.Object r3 = r3.component2()
            okio.Path r3 = (okio.Path) r3
            okio.Path r6 = r3.resolve(r10)
            java.util.List r5 = r5.listOrNull(r6)
            if (r5 == 0) goto L90
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r5 = r5.iterator()
        L49:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L62
            java.lang.Object r6 = r5.next()
            r7 = r6
            okio.Path r7 = (okio.Path) r7
            okio.internal.ResourceFileSystem$Companion r8 = okio.internal.ResourceFileSystem.Companion
            boolean r7 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r8, r7)
            if (r7 == 0) goto L49
            r4.add(r6)
            goto L49
        L62:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4, r6)
            r5.<init>(r6)
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r4 = r4.iterator()
        L77:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L8d
            java.lang.Object r6 = r4.next()
            okio.Path r6 = (okio.Path) r6
            okio.internal.ResourceFileSystem$Companion r7 = okio.internal.ResourceFileSystem.Companion
            okio.Path r6 = r7.removeBase(r6, r3)
            r5.add(r6)
            goto L77
        L8d:
            r4 = r5
            java.util.List r4 = (java.util.List) r4
        L90:
            if (r4 == 0) goto L19
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            kotlin.collections.CollectionsKt.addAll(r2, r4)
            r2 = 1
            goto L19
        L9d:
            if (r2 == 0) goto La5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r4 = kotlin.collections.CollectionsKt.toList(r0)
        La5:
            return r4
    }

    @Override // okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path r5) {
            r4 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            boolean r0 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r0, r5)
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.String r5 = r4.toRelativePath(r5)
            java.util.List r0 = r4.getRoots()
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r3 = r2.component1()
            okio.FileSystem r3 = (okio.FileSystem) r3
            java.lang.Object r2 = r2.component2()
            okio.Path r2 = (okio.Path) r2
            okio.Path r2 = r2.resolve(r5)
            okio.FileMetadata r2 = r3.metadataOrNull(r2)
            if (r2 != 0) goto L3e
            goto L1b
        L3e:
            return r2
        L3f:
            return r1
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path r6) {
            r5 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            boolean r0 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r0, r6)
            java.lang.String r1 = "file not found: "
            if (r0 == 0) goto L4f
            java.lang.String r0 = r5.toRelativePath(r6)
            java.util.List r2 = r5.getRoots()
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r2.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r4 = r3.component1()
            okio.FileSystem r4 = (okio.FileSystem) r4
            java.lang.Object r3 = r3.component2()
            okio.Path r3 = (okio.Path) r3
            okio.Path r3 = r3.resolve(r0)     // Catch: java.io.FileNotFoundException -> L1b
            okio.FileHandle r6 = r4.openReadOnly(r3)     // Catch: java.io.FileNotFoundException -> L1b
            return r6
        L3c:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L4f:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path r1, boolean r2, boolean r3) {
            r0 = this;
            java.lang.String r2 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "resources are not writable"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path r2, boolean r3) {
            r1 = this;
            java.lang.String r3 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r0 = " is read-only"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path r6) {
            r5 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            boolean r0 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r0, r6)
            java.lang.String r1 = "file not found: "
            if (r0 == 0) goto L42
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            r2 = 2
            r3 = 0
            r4 = 0
            okio.Path r2 = okio.Path.resolve$default(r0, r6, r4, r2, r3)
            okio.Path r0 = r2.relativeTo(r0)
            java.lang.ClassLoader r2 = r5.classLoader
            java.lang.String r0 = r0.toString()
            java.io.InputStream r0 = r2.getResourceAsStream(r0)
            if (r0 == 0) goto L2f
            okio.Source r0 = okio.Okio.source(r0)
            if (r0 == 0) goto L2f
            return r0
        L2f:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L42:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
    }
}
