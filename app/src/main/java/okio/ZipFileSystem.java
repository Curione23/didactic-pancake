package okio;

/* JADX INFO: compiled from: ZipFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B5\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J \u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u0003H\u0016J \u0010$\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020&2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lokio/ZipFileSystem;", "Lokio/FileSystem;", "zipPath", "Lokio/Path;", "fileSystem", "entries", "", "Lokio/internal/ZipEntry;", "comment", "", "(Lokio/Path;Lokio/FileSystem;Ljava/util/Map;Ljava/lang/String;)V", "appendingSink", "Lokio/Sink;", "file", "mustExist", "", "atomicMove", "", "source", "target", "canonicalize", "path", "canonicalizeInternal", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ZipFileSystem extends okio.FileSystem {
    private static final okio.ZipFileSystem.Companion Companion = null;
    private static final okio.Path ROOT = null;
    private final java.lang.String comment;
    private final java.util.Map<okio.Path, okio.internal.ZipEntry> entries;
    private final okio.FileSystem fileSystem;
    private final okio.Path zipPath;

    /* JADX INFO: compiled from: ZipFileSystem.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokio/ZipFileSystem$Companion;", "", "()V", "ROOT", "Lokio/Path;", "getROOT", "()Lokio/Path;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public final okio.Path getROOT() {
                r1 = this;
                okio.Path r0 = okio.ZipFileSystem.access$getROOT$cp()
                return r0
        }
    }

    static {
            okio.ZipFileSystem$Companion r0 = new okio.ZipFileSystem$Companion
            r1 = 0
            r0.<init>(r1)
            okio.ZipFileSystem.Companion = r0
            okio.Path$Companion r0 = okio.Path.Companion
            r2 = 0
            r3 = 1
            java.lang.String r4 = "/"
            okio.Path r0 = okio.Path.Companion.get$default(r0, r4, r2, r3, r1)
            okio.ZipFileSystem.ROOT = r0
            return
    }

    public ZipFileSystem(okio.Path r2, okio.FileSystem r3, java.util.Map<okio.Path, okio.internal.ZipEntry> r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "zipPath"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "entries"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.zipPath = r2
            r1.fileSystem = r3
            r1.entries = r4
            r1.comment = r5
            return
    }

    public static final /* synthetic */ okio.Path access$getROOT$cp() {
            okio.Path r0 = okio.ZipFileSystem.ROOT
            return r0
    }

    private final okio.Path canonicalizeInternal(okio.Path r3) {
            r2 = this;
            okio.Path r0 = okio.ZipFileSystem.ROOT
            r1 = 1
            okio.Path r3 = r0.resolve(r3, r1)
            return r3
    }

    private final java.util.List<okio.Path> list(okio.Path r3, boolean r4) {
            r2 = this;
            okio.Path r0 = r2.canonicalizeInternal(r3)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r1 = r2.entries
            java.lang.Object r0 = r1.get(r0)
            okio.internal.ZipEntry r0 = (okio.internal.ZipEntry) r0
            if (r0 != 0) goto L27
            if (r4 != 0) goto L12
            r3 = 0
            return r3
        L12:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "not a directory: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L27:
            java.util.List r3 = r0.getChildren()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.CollectionsKt.toList(r3)
            return r3
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path r2, okio.Path r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "zip file systems are read-only"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path r3) {
            r2 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.Path r0 = r2.canonicalizeInternal(r3)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r1 = r2.entries
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L12
            return r0
        L12:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path r2, okio.Path r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "zip file systems are read-only"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public void delete(okio.Path r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            java.util.List r2 = r1.list(r2, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            return r2
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            java.util.List r2 = r1.list(r2, r0)
            return r2
    }

    @Override // okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path r14) {
            r13 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            okio.Path r14 = r13.canonicalizeInternal(r14)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r0 = r13.entries
            java.lang.Object r14 = r0.get(r14)
            okio.internal.ZipEntry r14 = (okio.internal.ZipEntry) r14
            r0 = 0
            if (r14 != 0) goto L15
            return r0
        L15:
            okio.FileMetadata r12 = new okio.FileMetadata
            boolean r1 = r14.isDirectory()
            r2 = r1 ^ 1
            boolean r3 = r14.isDirectory()
            boolean r1 = r14.isDirectory()
            if (r1 == 0) goto L29
            r5 = r0
            goto L32
        L29:
            long r4 = r14.getSize()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r5 = r1
        L32:
            java.lang.Long r7 = r14.getLastModifiedAtMillis()
            r10 = 128(0x80, float:1.8E-43)
            r11 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            long r1 = r14.getOffset()
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L4c
            return r12
        L4c:
            okio.FileSystem r1 = r13.fileSystem
            okio.Path r2 = r13.zipPath
            okio.FileHandle r1 = r1.openReadOnly(r2)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = r1
            okio.FileHandle r2 = (okio.FileHandle) r2     // Catch: java.lang.Throwable -> L93
            long r3 = r14.getOffset()     // Catch: java.lang.Throwable -> L93
            okio.Source r14 = r2.source(r3)     // Catch: java.lang.Throwable -> L93
            okio.BufferedSource r14 = okio.Okio.buffer(r14)     // Catch: java.lang.Throwable -> L93
            java.io.Closeable r14 = (java.io.Closeable) r14     // Catch: java.lang.Throwable -> L93
            r2 = r14
            okio.BufferedSource r2 = (okio.BufferedSource) r2     // Catch: java.lang.Throwable -> L78
            okio.FileMetadata r2 = okio.internal.ZipFilesKt.readLocalHeader(r2, r12)     // Catch: java.lang.Throwable -> L78
            if (r14 == 0) goto L76
            r14.close()     // Catch: java.lang.Throwable -> L74
            goto L76
        L74:
            r14 = move-exception
            goto L85
        L76:
            r14 = r0
            goto L85
        L78:
            r2 = move-exception
            if (r14 == 0) goto L83
            r14.close()     // Catch: java.lang.Throwable -> L7f
            goto L83
        L7f:
            r14 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r2, r14)     // Catch: java.lang.Throwable -> L93
        L83:
            r14 = r2
            r2 = r0
        L85:
            if (r14 != 0) goto L92
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto La0
            r1.close()     // Catch: java.lang.Throwable -> L90
            goto La0
        L90:
            r0 = move-exception
            goto La0
        L92:
            throw r14     // Catch: java.lang.Throwable -> L93
        L93:
            r14 = move-exception
            if (r1 == 0) goto L9e
            r1.close()     // Catch: java.lang.Throwable -> L9a
            goto L9e
        L9a:
            r1 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r14, r1)
        L9e:
            r2 = r0
            r0 = r14
        La0:
            if (r0 != 0) goto La6
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            return r2
        La6:
            throw r0
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "not implemented yet!"
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path r1, boolean r2, boolean r3) {
            r0 = this;
            java.lang.String r2 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip entries are not writable"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path r8) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            okio.Path r0 = r7.canonicalizeInternal(r8)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r1 = r7.entries
            java.lang.Object r0 = r1.get(r0)
            okio.internal.ZipEntry r0 = (okio.internal.ZipEntry) r0
            if (r0 == 0) goto L88
            okio.FileSystem r8 = r7.fileSystem
            okio.Path r1 = r7.zipPath
            okio.FileHandle r8 = r8.openReadOnly(r1)
            java.io.Closeable r8 = (java.io.Closeable) r8
            r1 = 0
            r2 = r8
            okio.FileHandle r2 = (okio.FileHandle) r2     // Catch: java.lang.Throwable -> L35
            long r3 = r0.getOffset()     // Catch: java.lang.Throwable -> L35
            okio.Source r2 = r2.source(r3)     // Catch: java.lang.Throwable -> L35
            okio.BufferedSource r2 = okio.Okio.buffer(r2)     // Catch: java.lang.Throwable -> L35
            if (r8 == 0) goto L43
            r8.close()     // Catch: java.lang.Throwable -> L33
            goto L43
        L33:
            r1 = move-exception
            goto L43
        L35:
            r2 = move-exception
            if (r8 == 0) goto L40
            r8.close()     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r8 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r2, r8)
        L40:
            r6 = r2
            r2 = r1
            r1 = r6
        L43:
            if (r1 != 0) goto L87
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            okio.internal.ZipFilesKt.skipLocalHeader(r2)
            int r8 = r0.getCompressionMethod()
            r1 = 1
            if (r8 != 0) goto L60
            okio.internal.FixedLengthSource r8 = new okio.internal.FixedLengthSource
            okio.Source r2 = (okio.Source) r2
            long r3 = r0.getSize()
            r8.<init>(r2, r3, r1)
            okio.Source r8 = (okio.Source) r8
            goto L86
        L60:
            okio.InflaterSource r8 = new okio.InflaterSource
            okio.internal.FixedLengthSource r3 = new okio.internal.FixedLengthSource
            okio.Source r2 = (okio.Source) r2
            long r4 = r0.getCompressedSize()
            r3.<init>(r2, r4, r1)
            okio.Source r3 = (okio.Source) r3
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r2.<init>(r1)
            r8.<init>(r3, r2)
            okio.internal.FixedLengthSource r1 = new okio.internal.FixedLengthSource
            okio.Source r8 = (okio.Source) r8
            long r2 = r0.getSize()
            r0 = 0
            r1.<init>(r8, r2, r0)
            r8 = r1
            okio.Source r8 = (okio.Source) r8
        L86:
            return r8
        L87:
            throw r1
        L88:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "no such file: "
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
    }
}
