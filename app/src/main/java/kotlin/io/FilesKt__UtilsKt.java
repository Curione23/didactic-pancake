package kotlin.io;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a*\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", "target", "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", "other", "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
class FilesKt__UtilsKt extends kotlin.io.FilesKt__FileTreeWalkKt {



    public FilesKt__UtilsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final boolean copyRecursively(java.io.File r11, java.io.File r12, boolean r13, kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.OnErrorAction> r14) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            boolean r0 = r11.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2e
            kotlin.io.NoSuchFileException r12 = new kotlin.io.NoSuchFileException
            r7 = 2
            r8 = 0
            r5 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r14.invoke(r11, r12)
            kotlin.io.OnErrorAction r12 = kotlin.io.OnErrorAction.TERMINATE
            if (r11 == r12) goto L2c
            goto L2d
        L2c:
            r1 = r2
        L2d:
            return r1
        L2e:
            kotlin.io.FileTreeWalk r0 = kotlin.io.FilesKt.walkTopDown(r11)     // Catch: kotlin.io.TerminateException -> Ld9
            kotlin.io.FilesKt__UtilsKt$copyRecursively$2 r3 = new kotlin.io.FilesKt__UtilsKt$copyRecursively$2     // Catch: kotlin.io.TerminateException -> Ld9
            r3.<init>(r14)     // Catch: kotlin.io.TerminateException -> Ld9
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3     // Catch: kotlin.io.TerminateException -> Ld9
            kotlin.io.FileTreeWalk r0 = r0.onFail(r3)     // Catch: kotlin.io.TerminateException -> Ld9
            java.util.Iterator r0 = r0.iterator()     // Catch: kotlin.io.TerminateException -> Ld9
        L41:
            boolean r3 = r0.hasNext()     // Catch: kotlin.io.TerminateException -> Ld9
            if (r3 == 0) goto Ld8
            java.lang.Object r3 = r0.next()     // Catch: kotlin.io.TerminateException -> Ld9
            java.io.File r3 = (java.io.File) r3     // Catch: kotlin.io.TerminateException -> Ld9
            boolean r4 = r3.exists()     // Catch: kotlin.io.TerminateException -> Ld9
            if (r4 != 0) goto L68
            kotlin.io.NoSuchFileException r10 = new kotlin.io.NoSuchFileException     // Catch: kotlin.io.TerminateException -> Ld9
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r6 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: kotlin.io.TerminateException -> Ld9
            java.lang.Object r3 = r14.invoke(r3, r10)     // Catch: kotlin.io.TerminateException -> Ld9
            kotlin.io.OnErrorAction r4 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.TerminateException -> Ld9
            if (r3 != r4) goto L41
            return r2
        L68:
            java.lang.String r4 = kotlin.io.FilesKt.toRelativeString(r3, r11)     // Catch: kotlin.io.TerminateException -> Ld9
            java.io.File r5 = new java.io.File     // Catch: kotlin.io.TerminateException -> Ld9
            r5.<init>(r12, r4)     // Catch: kotlin.io.TerminateException -> Ld9
            boolean r4 = r5.exists()     // Catch: kotlin.io.TerminateException -> Ld9
            if (r4 == 0) goto La9
            boolean r4 = r3.isDirectory()     // Catch: kotlin.io.TerminateException -> Ld9
            if (r4 == 0) goto L83
            boolean r4 = r5.isDirectory()     // Catch: kotlin.io.TerminateException -> Ld9
            if (r4 != 0) goto La9
        L83:
            if (r13 != 0) goto L86
            goto L99
        L86:
            boolean r4 = r5.isDirectory()     // Catch: kotlin.io.TerminateException -> Ld9
            if (r4 == 0) goto L93
            boolean r4 = kotlin.io.FilesKt.deleteRecursively(r5)     // Catch: kotlin.io.TerminateException -> Ld9
            if (r4 != 0) goto La9
            goto L99
        L93:
            boolean r4 = r5.delete()     // Catch: kotlin.io.TerminateException -> Ld9
            if (r4 != 0) goto La9
        L99:
            kotlin.io.FileAlreadyExistsException r4 = new kotlin.io.FileAlreadyExistsException     // Catch: kotlin.io.TerminateException -> Ld9
            java.lang.String r6 = "The destination file already exists."
            r4.<init>(r3, r5, r6)     // Catch: kotlin.io.TerminateException -> Ld9
            java.lang.Object r3 = r14.invoke(r5, r4)     // Catch: kotlin.io.TerminateException -> Ld9
            kotlin.io.OnErrorAction r4 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.TerminateException -> Ld9
            if (r3 != r4) goto L41
            return r2
        La9:
            boolean r4 = r3.isDirectory()     // Catch: kotlin.io.TerminateException -> Ld9
            if (r4 == 0) goto Lb3
            r5.mkdirs()     // Catch: kotlin.io.TerminateException -> Ld9
            goto L41
        Lb3:
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r3
            r6 = r13
            java.io.File r4 = kotlin.io.FilesKt.copyTo$default(r4, r5, r6, r7, r8, r9)     // Catch: kotlin.io.TerminateException -> Ld9
            long r4 = r4.length()     // Catch: kotlin.io.TerminateException -> Ld9
            long r6 = r3.length()     // Catch: kotlin.io.TerminateException -> Ld9
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L41
            java.io.IOException r4 = new java.io.IOException     // Catch: kotlin.io.TerminateException -> Ld9
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch: kotlin.io.TerminateException -> Ld9
            java.lang.Object r3 = r14.invoke(r3, r4)     // Catch: kotlin.io.TerminateException -> Ld9
            kotlin.io.OnErrorAction r4 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.TerminateException -> Ld9
            if (r3 != r4) goto L41
            return r2
        Ld8:
            return r1
        Ld9:
            return r2
    }

    public static /* synthetic */ boolean copyRecursively$default(java.io.File r0, java.io.File r1, boolean r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            kotlin.io.FilesKt__UtilsKt$copyRecursively$1 r3 = kotlin.io.FilesKt__UtilsKt.AnonymousClass1.INSTANCE
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
        Ld:
            boolean r0 = kotlin.io.FilesKt.copyRecursively(r0, r1, r2, r3)
            return r0
    }

    public static final java.io.File copyTo(java.io.File r6, java.io.File r7, boolean r8, int r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L7e
            boolean r0 = r7.exists()
            if (r0 == 0) goto L2f
            if (r8 == 0) goto L27
            boolean r8 = r7.delete()
            if (r8 == 0) goto L1f
            goto L2f
        L1f:
            kotlin.io.FileAlreadyExistsException r8 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r9 = "Tried to overwrite the destination, but failed to delete it."
            r8.<init>(r6, r7, r9)
            throw r8
        L27:
            kotlin.io.FileAlreadyExistsException r8 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r9 = "The destination file already exists."
            r8.<init>(r6, r7, r9)
            throw r8
        L2f:
            boolean r8 = r6.isDirectory()
            if (r8 == 0) goto L44
            boolean r8 = r7.mkdirs()
            if (r8 == 0) goto L3c
            goto L6f
        L3c:
            kotlin.io.FileSystemException r8 = new kotlin.io.FileSystemException
            java.lang.String r9 = "Failed to create target directory."
            r8.<init>(r6, r7, r9)
            throw r8
        L44:
            java.io.File r8 = r7.getParentFile()
            if (r8 == 0) goto L4d
            r8.mkdirs()
        L4d:
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r6)
            java.io.Closeable r8 = (java.io.Closeable) r8
            r6 = r8
            java.io.FileInputStream r6 = (java.io.FileInputStream) r6     // Catch: java.lang.Throwable -> L77
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L77
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L77
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch: java.lang.Throwable -> L77
            r1 = r0
            java.io.FileOutputStream r1 = (java.io.FileOutputStream) r1     // Catch: java.lang.Throwable -> L70
            java.io.InputStream r6 = (java.io.InputStream) r6     // Catch: java.lang.Throwable -> L70
            java.io.OutputStream r1 = (java.io.OutputStream) r1     // Catch: java.lang.Throwable -> L70
            kotlin.io.ByteStreamsKt.copyTo(r6, r1, r9)     // Catch: java.lang.Throwable -> L70
            r6 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r6)     // Catch: java.lang.Throwable -> L77
            kotlin.io.CloseableKt.closeFinally(r8, r6)
        L6f:
            return r7
        L70:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L72
        L72:
            r7 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r6)     // Catch: java.lang.Throwable -> L77
            throw r7     // Catch: java.lang.Throwable -> L77
        L77:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L79
        L79:
            r7 = move-exception
            kotlin.io.CloseableKt.closeFinally(r8, r6)
            throw r7
        L7e:
            kotlin.io.NoSuchFileException r7 = new kotlin.io.NoSuchFileException
            r4 = 2
            r5 = 0
            r2 = 0
            java.lang.String r3 = "The source file doesn't exist."
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
    }

    public static /* synthetic */ java.io.File copyTo$default(java.io.File r0, java.io.File r1, boolean r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 8192(0x2000, float:1.148E-41)
        Lb:
            java.io.File r0 = kotlin.io.FilesKt.copyTo(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final java.io.File createTempDir(java.lang.String r1, java.lang.String r2, java.io.File r3) {
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.File r1 = java.io.File.createTempFile(r1, r2, r3)
            r1.delete()
            boolean r2 = r1.mkdir()
            if (r2 == 0) goto L18
            java.lang.String r2 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        L18:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to create temporary directory "
            r3.<init>(r0)
            java.lang.StringBuilder r1 = r3.append(r1)
            r3 = 46
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ java.io.File createTempDir$default(java.lang.String r1, java.lang.String r2, java.io.File r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = "tmp"
        L6:
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto Lc
            r2 = r0
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            r3 = r0
        L11:
            java.io.File r1 = kotlin.io.FilesKt.createTempDir(r1, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final java.io.File createTempFile(java.lang.String r1, java.lang.String r2, java.io.File r3) {
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.File r1 = java.io.File.createTempFile(r1, r2, r3)
            java.lang.String r2 = "createTempFile(prefix, suffix, directory)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public static /* synthetic */ java.io.File createTempFile$default(java.lang.String r1, java.lang.String r2, java.io.File r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = "tmp"
        L6:
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto Lc
            r2 = r0
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            r3 = r0
        L11:
            java.io.File r1 = kotlin.io.FilesKt.createTempFile(r1, r2, r3)
            return r1
    }

    public static final boolean deleteRecursively(java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.io.FileTreeWalk r4 = kotlin.io.FilesKt.walkBottomUp(r4)
            kotlin.sequences.Sequence r4 = (kotlin.sequences.Sequence) r4
            java.util.Iterator r4 = r4.iterator()
            r0 = 1
        L10:
            r1 = r0
        L11:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r4.next()
            java.io.File r2 = (java.io.File) r2
            boolean r3 = r2.delete()
            if (r3 != 0) goto L29
            boolean r2 = r2.exists()
            if (r2 != 0) goto L2c
        L29:
            if (r1 == 0) goto L2c
            goto L10
        L2c:
            r1 = 0
            goto L11
        L2e:
            return r1
    }

    public static final boolean endsWith(java.io.File r3, java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.io.FilePathComponents r0 = kotlin.io.FilesKt.toComponents(r3)
            kotlin.io.FilePathComponents r1 = kotlin.io.FilesKt.toComponents(r4)
            boolean r2 = r1.isRooted()
            if (r2 == 0) goto L1d
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            return r3
        L1d:
            int r3 = r0.getSize()
            int r4 = r1.getSize()
            int r3 = r3 - r4
            if (r3 >= 0) goto L2a
            r3 = 0
            goto L3e
        L2a:
            java.util.List r4 = r0.getSegments()
            int r0 = r0.getSize()
            java.util.List r3 = r4.subList(r3, r0)
            java.util.List r4 = r1.getSegments()
            boolean r3 = r3.equals(r4)
        L3e:
            return r3
    }

    public static final boolean endsWith(java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r1 = kotlin.io.FilesKt.endsWith(r1, r0)
            return r1
    }

    public static final java.lang.String getExtension(java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r0 = 46
            java.lang.String r1 = ""
            java.lang.String r2 = kotlin.text.StringsKt.substringAfterLast(r2, r0, r1)
            return r2
    }

    public static final java.lang.String getInvariantSeparatorsPath(java.io.File r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            char r0 = java.io.File.separatorChar
            r1 = 47
            java.lang.String r2 = "path"
            if (r0 == r1) goto L20
            java.lang.String r3 = r9.getPath()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            char r4 = java.io.File.separatorChar
            r7 = 4
            r8 = 0
            r5 = 47
            r6 = 0
            java.lang.String r9 = kotlin.text.StringsKt.replace$default(r3, r4, r5, r6, r7, r8)
            goto L27
        L20:
            java.lang.String r9 = r9.getPath()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
        L27:
            return r9
    }

    public static final java.lang.String getNameWithoutExtension(java.io.File r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r0 = 0
            r1 = 2
            java.lang.String r2 = "."
            java.lang.String r3 = kotlin.text.StringsKt.substringBeforeLast$default(r3, r2, r0, r1, r0)
            return r3
    }

    public static final java.io.File normalize(java.io.File r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.io.FilePathComponents r10 = kotlin.io.FilesKt.toComponents(r10)
            java.io.File r0 = r10.getRoot()
            java.util.List r10 = r10.getSegments()
            java.util.List r10 = normalize$FilesKt__UtilsKt(r10)
            r1 = r10
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r10 = java.io.File.separator
            java.lang.String r2 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)
            r2 = r10
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r8 = 62
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r10 = kotlin.collections.CollectionsKt.joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.io.File r10 = kotlin.io.FilesKt.resolve(r0, r10)
            return r10
    }

    private static final java.util.List<java.io.File> normalize$FilesKt__UtilsKt(java.util.List<? extends java.io.File> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r4.next()
            java.io.File r1 = (java.io.File) r1
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "."
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r3 != 0) goto Lf
            java.lang.String r3 = ".."
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L53
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L4f
            java.lang.Object r2 = kotlin.collections.CollectionsKt.last(r0)
            java.io.File r2 = (java.io.File) r2
            java.lang.String r2 = r2.getName()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L4f
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            goto Lf
        L4f:
            r0.add(r1)
            goto Lf
        L53:
            r0.add(r1)
            goto Lf
        L57:
            return r0
    }

    private static final kotlin.io.FilePathComponents normalize$FilesKt__UtilsKt(kotlin.io.FilePathComponents r2) {
            kotlin.io.FilePathComponents r0 = new kotlin.io.FilePathComponents
            java.io.File r1 = r2.getRoot()
            java.util.List r2 = r2.getSegments()
            java.util.List r2 = normalize$FilesKt__UtilsKt(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public static final java.io.File relativeTo(java.io.File r1, java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = kotlin.io.FilesKt.toRelativeString(r1, r2)
            r0.<init>(r1)
            return r0
    }

    public static final java.io.File relativeToOrNull(java.io.File r1, java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r1 = toRelativeStringOrNull$FilesKt__UtilsKt(r1, r2)
            if (r1 == 0) goto L16
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    public static final java.io.File relativeToOrSelf(java.io.File r1, java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = toRelativeStringOrNull$FilesKt__UtilsKt(r1, r2)
            if (r2 == 0) goto L15
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
        L15:
            return r1
    }

    public static final java.io.File resolve(java.io.File r5, java.io.File r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = kotlin.io.FilesKt.isRooted(r6)
            if (r0 == 0) goto L11
            return r6
        L11:
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "this.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r0.length()
            if (r1 != 0) goto L24
            goto L2f
        L24:
            char r1 = java.io.File.separatorChar
            r2 = 2
            r3 = 0
            r4 = 0
            boolean r0 = kotlin.text.StringsKt.endsWith$default(r0, r1, r4, r2, r3)
            if (r0 == 0) goto L46
        L2f:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            goto L62
        L46:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r5 = r1.append(r5)
            char r1 = java.io.File.separatorChar
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
        L62:
            return r0
    }

    public static final java.io.File resolve(java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.File r1 = kotlin.io.FilesKt.resolve(r1, r0)
            return r1
    }

    public static final java.io.File resolveSibling(java.io.File r2, java.io.File r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.io.FilePathComponents r2 = kotlin.io.FilesKt.toComponents(r2)
            int r0 = r2.getSize()
            if (r0 != 0) goto L1c
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ".."
            r0.<init>(r1)
            goto L27
        L1c:
            int r0 = r2.getSize()
            int r0 = r0 + (-1)
            r1 = 0
            java.io.File r0 = r2.subPath(r1, r0)
        L27:
            java.io.File r2 = r2.getRoot()
            java.io.File r2 = kotlin.io.FilesKt.resolve(r2, r0)
            java.io.File r2 = kotlin.io.FilesKt.resolve(r2, r3)
            return r2
    }

    public static final java.io.File resolveSibling(java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.File r1 = kotlin.io.FilesKt.resolveSibling(r1, r0)
            return r1
    }

    public static final boolean startsWith(java.io.File r3, java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.io.FilePathComponents r3 = kotlin.io.FilesKt.toComponents(r3)
            kotlin.io.FilePathComponents r4 = kotlin.io.FilesKt.toComponents(r4)
            java.io.File r0 = r3.getRoot()
            java.io.File r1 = r4.getRoot()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r1 = 0
            if (r0 != 0) goto L22
            return r1
        L22:
            int r0 = r3.getSize()
            int r2 = r4.getSize()
            if (r0 >= r2) goto L2d
            goto L41
        L2d:
            java.util.List r3 = r3.getSegments()
            int r0 = r4.getSize()
            java.util.List r3 = r3.subList(r1, r0)
            java.util.List r4 = r4.getSegments()
            boolean r1 = r3.equals(r4)
        L41:
            return r1
    }

    public static final boolean startsWith(java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r1 = kotlin.io.FilesKt.startsWith(r1, r0)
            return r1
    }

    public static final java.lang.String toRelativeString(java.io.File r3, java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = toRelativeStringOrNull$FilesKt__UtilsKt(r3, r4)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "this and base files have different roots: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " and "
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = 46
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private static final java.lang.String toRelativeStringOrNull$FilesKt__UtilsKt(java.io.File r14, java.io.File r15) {
            kotlin.io.FilePathComponents r14 = kotlin.io.FilesKt.toComponents(r14)
            kotlin.io.FilePathComponents r14 = normalize$FilesKt__UtilsKt(r14)
            kotlin.io.FilePathComponents r15 = kotlin.io.FilesKt.toComponents(r15)
            kotlin.io.FilePathComponents r15 = normalize$FilesKt__UtilsKt(r15)
            java.io.File r0 = r14.getRoot()
            java.io.File r1 = r15.getRoot()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r1 = 0
            if (r0 != 0) goto L20
            return r1
        L20:
            int r0 = r15.getSize()
            int r2 = r14.getSize()
            int r3 = java.lang.Math.min(r2, r0)
            r4 = 0
        L2d:
            if (r4 >= r3) goto L48
            java.util.List r5 = r14.getSegments()
            java.lang.Object r5 = r5.get(r4)
            java.util.List r6 = r15.getSegments()
            java.lang.Object r6 = r6.get(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 == 0) goto L48
            int r4 = r4 + 1
            goto L2d
        L48:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r5 = r0 + (-1)
            if (r4 > r5) goto L77
        L51:
            java.util.List r6 = r15.getSegments()
            java.lang.Object r6 = r6.get(r5)
            java.io.File r6 = (java.io.File) r6
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = ".."
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 == 0) goto L68
            return r1
        L68:
            r3.append(r7)
            if (r5 == r4) goto L72
            char r6 = java.io.File.separatorChar
            r3.append(r6)
        L72:
            if (r5 == r4) goto L77
            int r5 = r5 + (-1)
            goto L51
        L77:
            if (r4 >= r2) goto La5
            if (r4 >= r0) goto L80
            char r15 = java.io.File.separatorChar
            r3.append(r15)
        L80:
            java.util.List r14 = r14.getSegments()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.List r14 = kotlin.collections.CollectionsKt.drop(r14, r4)
            r4 = r14
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = r3
            java.lang.Appendable r5 = (java.lang.Appendable) r5
            java.lang.String r14 = java.io.File.separator
            java.lang.String r15 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r15)
            r6 = r14
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r12 = 124(0x7c, float:1.74E-43)
            r13 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            kotlin.collections.CollectionsKt.joinTo$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        La5:
            java.lang.String r14 = r3.toString()
            return r14
    }
}
