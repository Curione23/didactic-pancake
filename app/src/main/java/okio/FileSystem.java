package okio;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 42\u00020\u0001:\u00014B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\bH&J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H&J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006J\u001a\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0006J\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010\u0011\u001a\u00020\u0006H&J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a2\u0006\u0010\u0011\u001a\u00020\u0006H&J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\u0006\u0010\u0011\u001a\u00020\u0006J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\bH\u0016J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u0006J\u0012\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u0006J$\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\bH&J:\u0010%\u001a\u0002H&\"\u0004\b\u0000\u0010&2\u0006\u0010\u0005\u001a\u00020\u00062\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u0002H&0(¢\u0006\u0002\b*H\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000e\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020\u0006H&JD\u0010/\u001a\u0002H&\"\u0004\b\u0000\u0010&2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002H&0(¢\u0006\u0002\b*H\u0087\bø\u0001\u0000¢\u0006\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00065"}, d2 = {"Lokio/FileSystem;", "", "()V", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", "target", "canonicalize", "path", "copy", "createDirectories", "dir", "mustCreate", "createDirectory", "createSymlink", "delete", "deleteRecursively", "fileOrDirectory", "exists", "list", "", "listOrNull", "listRecursively", "Lkotlin/sequences/Sequence;", "followSymlinks", "metadata", "Lokio/FileMetadata;", "metadataOrNull", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "read", "T", "readerAction", "Lkotlin/Function1;", "Lokio/BufferedSource;", "Lkotlin/ExtensionFunctionType;", "-read", "(Lokio/Path;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "sink", "Lokio/Source;", "write", "writerAction", "Lokio/BufferedSink;", "-write", "(Lokio/Path;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FileSystem {
    public static final okio.FileSystem.Companion Companion = null;
    public static final okio.FileSystem RESOURCES = null;
    public static final okio.FileSystem SYSTEM = null;
    public static final okio.Path SYSTEM_TEMPORARY_DIRECTORY = null;

    /* JADX INFO: compiled from: FileSystem.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\b\u001a\u00020\u0004*\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lokio/FileSystem$Companion;", "", "()V", "RESOURCES", "Lokio/FileSystem;", "SYSTEM", "SYSTEM_TEMPORARY_DIRECTORY", "Lokio/Path;", "asOkioFileSystem", "Ljava/nio/file/FileSystem;", "get", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        @kotlin.jvm.JvmStatic
        public final okio.FileSystem get(java.nio.file.FileSystem r2) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                okio.NioFileSystemWrappingFileSystem r0 = new okio.NioFileSystemWrappingFileSystem
                r0.<init>(r2)
                okio.FileSystem r0 = (okio.FileSystem) r0
                return r0
        }
    }

    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m2526write$default(okio.FileSystem r1, okio.Path r2, boolean r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) throws java.io.IOException {
            if (r6 != 0) goto L4d
            r5 = r5 & 2
            if (r5 == 0) goto L7
            r3 = 0
        L7:
            java.lang.String r5 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "writerAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            okio.Sink r1 = r1.sink(r2, r3)
            okio.BufferedSink r1 = okio.Okio.buffer(r1)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = 0
            r3 = 1
            r5 = r1
            okio.BufferedSink r5 = (okio.BufferedSink) r5     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r4.invoke(r5)     // Catch: java.lang.Throwable -> L32
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            if (r1 == 0) goto L2e
            r1.close()     // Catch: java.lang.Throwable -> L2d
            goto L2e
        L2d:
            r2 = move-exception
        L2e:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            goto L46
        L32:
            r4 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            if (r1 == 0) goto L40
            r1.close()     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r1 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r4, r1)
        L40:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            r0 = r4
            r4 = r2
            r2 = r0
        L46:
            if (r2 != 0) goto L4c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            return r4
        L4c:
            throw r2
        L4d:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: write"
            r1.<init>(r2)
            throw r1
    }

    static {
            okio.FileSystem$Companion r0 = new okio.FileSystem$Companion
            r1 = 0
            r0.<init>(r1)
            okio.FileSystem.Companion = r0
            java.lang.String r0 = "java.nio.file.Files"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L15
            okio.NioSystemFileSystem r0 = new okio.NioSystemFileSystem     // Catch: java.lang.ClassNotFoundException -> L15
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L15
            okio.JvmSystemFileSystem r0 = (okio.JvmSystemFileSystem) r0     // Catch: java.lang.ClassNotFoundException -> L15
            goto L1a
        L15:
            okio.JvmSystemFileSystem r0 = new okio.JvmSystemFileSystem
            r0.<init>()
        L1a:
            okio.FileSystem r0 = (okio.FileSystem) r0
            okio.FileSystem.SYSTEM = r0
            okio.Path$Companion r0 = okio.Path.Companion
            java.lang.String r2 = "java.io.tmpdir"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.String r3 = "getProperty(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r3 = 0
            r4 = 1
            okio.Path r0 = okio.Path.Companion.get$default(r0, r2, r3, r4, r1)
            okio.FileSystem.SYSTEM_TEMPORARY_DIRECTORY = r0
            okio.internal.ResourceFileSystem r0 = new okio.internal.ResourceFileSystem
            java.lang.Class<okio.internal.ResourceFileSystem> r1 = okio.internal.ResourceFileSystem.class
            java.lang.ClassLoader r2 = r1.getClassLoader()
            java.lang.String r1 = "getClassLoader(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            okio.FileSystem r0 = (okio.FileSystem) r0
            okio.FileSystem.RESOURCES = r0
            return
    }

    public FileSystem() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ okio.Sink appendingSink$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            okio.Sink r0 = r0.appendingSink(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: appendingSink"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void createDirectories$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.createDirectories(r1, r2)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: createDirectories"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void createDirectory$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.createDirectory(r1, r2)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: createDirectory"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void delete$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.delete(r1, r2)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: delete"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void deleteRecursively$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.deleteRecursively(r1, r2)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: deleteRecursively"
            r0.<init>(r1)
            throw r0
    }

    @kotlin.jvm.JvmStatic
    public static final okio.FileSystem get(java.nio.file.FileSystem r1) {
            okio.FileSystem$Companion r0 = okio.FileSystem.Companion
            okio.FileSystem r1 = r0.get(r1)
            return r1
    }

    public static /* synthetic */ kotlin.sequences.Sequence listRecursively$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            kotlin.sequences.Sequence r0 = r0.listRecursively(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: listRecursively"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ okio.FileHandle openReadWrite$default(okio.FileSystem r1, okio.Path r2, boolean r3, boolean r4, int r5, java.lang.Object r6) throws java.io.IOException {
            if (r6 != 0) goto L12
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L8
            r3 = r0
        L8:
            r5 = r5 & 4
            if (r5 == 0) goto Ld
            r4 = r0
        Ld:
            okio.FileHandle r1 = r1.openReadWrite(r2, r3, r4)
            return r1
        L12:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: openReadWrite"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ okio.Sink sink$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            okio.Sink r0 = r0.sink(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: sink"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m2527read(okio.Path r5, kotlin.jvm.functions.Function1<? super okio.BufferedSource, ? extends T> r6) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "readerAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okio.Source r5 = r4.source(r5)
            okio.BufferedSource r5 = okio.Okio.buffer(r5)
            java.io.Closeable r5 = (java.io.Closeable) r5
            r0 = 1
            r1 = 0
            r2 = r5
            okio.BufferedSource r2 = (okio.BufferedSource) r2     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r6.invoke(r2)     // Catch: java.lang.Throwable -> L2b
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            if (r5 == 0) goto L27
            r5.close()     // Catch: java.lang.Throwable -> L26
            goto L27
        L26:
            r1 = move-exception
        L27:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            goto L3f
        L2b:
            r6 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            if (r5 == 0) goto L39
            r5.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r5 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r6, r5)
        L39:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            r3 = r1
            r1 = r6
            r6 = r3
        L3f:
            if (r1 != 0) goto L45
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            return r6
        L45:
            throw r1
    }

    /* JADX INFO: renamed from: -write, reason: not valid java name */
    public final <T> T m2528write(okio.Path r4, boolean r5, kotlin.jvm.functions.Function1<? super okio.BufferedSink, ? extends T> r6) throws java.io.IOException {
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "writerAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okio.Sink r4 = r3.sink(r4, r5)
            okio.BufferedSink r4 = okio.Okio.buffer(r4)
            java.io.Closeable r4 = (java.io.Closeable) r4
            r5 = 1
            r0 = 0
            r1 = r4
            okio.BufferedSink r1 = (okio.BufferedSink) r1     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r6.invoke(r1)     // Catch: java.lang.Throwable -> L2b
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            if (r4 == 0) goto L27
            r4.close()     // Catch: java.lang.Throwable -> L26
            goto L27
        L26:
            r0 = move-exception
        L27:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            goto L3f
        L2b:
            r6 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r5)
            if (r4 == 0) goto L39
            r4.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r4 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r6, r4)
        L39:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r5)
            r2 = r0
            r0 = r6
            r6 = r2
        L3f:
            if (r0 != 0) goto L45
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            return r6
        L45:
            throw r0
    }

    public final okio.Sink appendingSink(okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            okio.Sink r2 = r1.appendingSink(r2, r0)
            return r2
    }

    public abstract okio.Sink appendingSink(okio.Path r1, boolean r2) throws java.io.IOException;

    public abstract void atomicMove(okio.Path r1, okio.Path r2) throws java.io.IOException;

    public abstract okio.Path canonicalize(okio.Path r1) throws java.io.IOException;

    public void copy(okio.Path r2, okio.Path r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.internal.FileSystem.commonCopy(r1, r2, r3)
            return
    }

    public final void createDirectories(okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r1.createDirectories(r2, r0)
            return
    }

    public final void createDirectories(okio.Path r2, boolean r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.internal.FileSystem.commonCreateDirectories(r1, r2, r3)
            return
    }

    public final void createDirectory(okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r1.createDirectory(r2, r0)
            return
    }

    public abstract void createDirectory(okio.Path r1, boolean r2) throws java.io.IOException;

    public abstract void createSymlink(okio.Path r1, okio.Path r2) throws java.io.IOException;

    public final void delete(okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r1.delete(r2, r0)
            return
    }

    public abstract void delete(okio.Path r1, boolean r2) throws java.io.IOException;

    public final void deleteRecursively(okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "fileOrDirectory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r1.deleteRecursively(r2, r0)
            return
    }

    public void deleteRecursively(okio.Path r2, boolean r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "fileOrDirectory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.internal.FileSystem.commonDeleteRecursively(r1, r2, r3)
            return
    }

    public final boolean exists(okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r2 = okio.internal.FileSystem.commonExists(r1, r2)
            return r2
    }

    public abstract java.util.List<okio.Path> list(okio.Path r1) throws java.io.IOException;

    public abstract java.util.List<okio.Path> listOrNull(okio.Path r1);

    public final kotlin.sequences.Sequence<okio.Path> listRecursively(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            kotlin.sequences.Sequence r2 = r1.listRecursively(r2, r0)
            return r2
    }

    public kotlin.sequences.Sequence<okio.Path> listRecursively(okio.Path r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.sequences.Sequence r2 = okio.internal.FileSystem.commonListRecursively(r1, r2, r3)
            return r2
    }

    public final okio.FileMetadata metadata(okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.FileMetadata r2 = okio.internal.FileSystem.commonMetadata(r1, r2)
            return r2
    }

    public abstract okio.FileMetadata metadataOrNull(okio.Path r1) throws java.io.IOException;

    public abstract okio.FileHandle openReadOnly(okio.Path r1) throws java.io.IOException;

    public final okio.FileHandle openReadWrite(okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            okio.FileHandle r2 = r1.openReadWrite(r2, r0, r0)
            return r2
    }

    public abstract okio.FileHandle openReadWrite(okio.Path r1, boolean r2, boolean r3) throws java.io.IOException;

    public final okio.Sink sink(okio.Path r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            okio.Sink r2 = r1.sink(r2, r0)
            return r2
    }

    public abstract okio.Sink sink(okio.Path r1, boolean r2) throws java.io.IOException;

    public abstract okio.Source source(okio.Path r1) throws java.io.IOException;
}
