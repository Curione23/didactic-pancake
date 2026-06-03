package kotlin.io.path;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0082\b¢\u0006\u0002\b\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\n\u001a\u001d\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\r\u001a&\u0010\u000e\u001a\u0004\u0018\u0001H\u000f\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0005H\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011\u001aw\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2Q\b\u0002\u0010\u0014\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0017\u0012\u00150\u0019j\u0002`\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007\u001a´\u0001\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2Q\b\u0002\u0010\u0014\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0017\u0012\u00150\u0019j\u0002`\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u001d\u001a\u00020\u001e2C\b\u0002\u0010 \u001a=\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\"0\u0015¢\u0006\u0002\b#H\u0007\u001a\f\u0010$\u001a\u00020\u0001*\u00020\tH\u0007\u001a\u001b\u0010%\u001a\f\u0012\b\u0012\u00060\u0019j\u0002`\u001a0&*\u00020\tH\u0002¢\u0006\u0002\b'\u001a'\u0010(\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0)2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b*\u001a'\u0010+\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0)2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b,\u001a5\u0010-\u001a\u00020\u001e*\b\u0012\u0004\u0012\u00020\t0)2\u0006\u0010.\u001a\u00020\t2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020100\"\u000201H\u0002¢\u0006\u0004\b2\u00103\u001a\u0011\u00104\u001a\u000205*\u00020\"H\u0003¢\u0006\u0002\b6\u001a\u0011\u00104\u001a\u000205*\u00020\u001cH\u0003¢\u0006\u0002\b6¨\u00067"}, d2 = {"collectIfThrows", "", "collector", "Lkotlin/io/path/ExceptionsCollector;", "function", "Lkotlin/Function0;", "collectIfThrows$PathsKt__PathRecursiveFunctionsKt", "insecureEnterDirectory", "path", "Ljava/nio/file/Path;", "insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt", "insecureHandleEntry", "entry", "insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt", "tryIgnoreNoSuchFileException", "R", "tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "copyToRecursively", "target", "onError", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "source", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lkotlin/io/path/OnErrorResult;", "followLinks", "", "overwrite", "copyAction", "Lkotlin/io/path/CopyActionContext;", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/ExtensionFunctionType;", "deleteRecursively", "deleteRecursivelyImpl", "", "deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt", "enterDirectory", "Ljava/nio/file/SecureDirectoryStream;", "enterDirectory$PathsKt__PathRecursiveFunctionsKt", "handleEntry", "handleEntry$PathsKt__PathRecursiveFunctionsKt", "isDirectory", "entryName", "options", "", "Ljava/nio/file/LinkOption;", "isDirectory$PathsKt__PathRecursiveFunctionsKt", "(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "toFileVisitResult", "Ljava/nio/file/FileVisitResult;", "toFileVisitResult$PathsKt__PathRecursiveFunctionsKt", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
class PathsKt__PathRecursiveFunctionsKt extends kotlin.io.path.PathsKt__PathReadWriteKt {

    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
                kotlin.io.path.CopyActionResult[] r0 = kotlin.io.path.CopyActionResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                kotlin.io.path.CopyActionResult r2 = kotlin.io.path.CopyActionResult.CONTINUE     // Catch: java.lang.NoSuchFieldError -> L10
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                r2 = 2
                kotlin.io.path.CopyActionResult r3 = kotlin.io.path.CopyActionResult.TERMINATE     // Catch: java.lang.NoSuchFieldError -> L19
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r0[r3] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.io.path.CopyActionResult r3 = kotlin.io.path.CopyActionResult.SKIP_SUBTREE     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r4 = 3
                r0[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$0 = r0
                kotlin.io.path.OnErrorResult[] r0 = kotlin.io.path.OnErrorResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.io.path.OnErrorResult r3 = kotlin.io.path.OnErrorResult.TERMINATE     // Catch: java.lang.NoSuchFieldError -> L33
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r0[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                kotlin.io.path.OnErrorResult r1 = kotlin.io.path.OnErrorResult.SKIP_SUBTREE     // Catch: java.lang.NoSuchFieldError -> L3b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3b
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3b
            L3b:
                kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$1 = r0
                return
        }
    }






    public PathsKt__PathRecursiveFunctionsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.nio.file.FileVisitResult access$copyToRecursively$copy(kotlin.jvm.functions.Function3 r0, java.nio.file.Path r1, java.nio.file.Path r2, kotlin.jvm.functions.Function3 r3, java.nio.file.Path r4, java.nio.file.attribute.BasicFileAttributes r5) {
            java.nio.file.FileVisitResult r0 = copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static final /* synthetic */ java.nio.file.FileVisitResult access$copyToRecursively$error(kotlin.jvm.functions.Function3 r0, java.nio.file.Path r1, java.nio.file.Path r2, java.nio.file.Path r3, java.lang.Exception r4) {
            java.nio.file.FileVisitResult r0 = copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(r0, r1, r2, r3, r4)
            return r0
    }

    private static final void collectIfThrows$PathsKt__PathRecursiveFunctionsKt(kotlin.io.path.ExceptionsCollector r0, kotlin.jvm.functions.Function0<kotlin.Unit> r1) {
            r1.invoke()     // Catch: java.lang.Exception -> L4
            goto L8
        L4:
            r1 = move-exception
            r0.collect(r1)
        L8:
            return
    }

    public static final java.nio.file.Path copyToRecursively(java.nio.file.Path r7, java.nio.file.Path r8, kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r9, boolean r10, kotlin.jvm.functions.Function3<? super kotlin.io.path.CopyActionContext, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.io.path.CopyActionResult> r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "copyAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            kotlin.io.path.LinkFollowing r0 = kotlin.io.path.LinkFollowing.INSTANCE
            java.nio.file.LinkOption[] r0 = r0.toLinkOptions(r10)
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = java.nio.file.Files.exists(r7, r0)
            if (r0 == 0) goto Ld2
            r0 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = java.nio.file.Files.exists(r7, r1)
            if (r1 == 0) goto Lc1
            if (r10 != 0) goto L45
            boolean r1 = java.nio.file.Files.isSymbolicLink(r7)
            if (r1 != 0) goto Lc1
        L45:
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = java.nio.file.Files.exists(r8, r1)
            r2 = 1
            if (r1 == 0) goto L5c
            boolean r1 = java.nio.file.Files.isSymbolicLink(r8)
            if (r1 != 0) goto L5c
            r1 = r2
            goto L5d
        L5c:
            r1 = r0
        L5d:
            if (r1 == 0) goto L65
            boolean r3 = java.nio.file.Files.isSameFile(r7, r8)
            if (r3 != 0) goto Lc1
        L65:
            java.nio.file.FileSystem r3 = r7.getFileSystem()
            java.nio.file.FileSystem r4 = r8.getFileSystem()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L74
            goto Lae
        L74:
            if (r1 == 0) goto L87
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r1 = r8.toRealPath(r1)
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r0 = r7.toRealPath(r0)
            boolean r0 = r1.startsWith(r0)
            goto Lae
        L87:
            java.nio.file.Path r1 = r8.getParent()
            if (r1 == 0) goto Lae
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r0]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            boolean r3 = java.nio.file.Files.exists(r1, r3)
            if (r3 == 0) goto Lae
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r1 = r1.toRealPath(r3)
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r3 = r7.toRealPath(r3)
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto Lae
            r0 = r2
        Lae:
            if (r0 != 0) goto Lb1
            goto Lc1
        Lb1:
            java.nio.file.FileSystemException r9 = new java.nio.file.FileSystemException
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = r8.toString()
            java.lang.String r10 = "Recursively copying a directory into its subdirectory is prohibited."
            r9.<init>(r7, r8, r10)
            throw r9
        Lc1:
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5 r0 = new kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5
            r0.<init>(r11, r7, r8, r9)
            r4 = r0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r5 = 1
            r6 = 0
            r2 = 0
            r1 = r7
            r3 = r10
            kotlin.io.path.PathsKt.visitFileTree$default(r1, r2, r3, r4, r5, r6)
            return r8
        Ld2:
            java.nio.file.NoSuchFileException r9 = new java.nio.file.NoSuchFileException
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = r8.toString()
            java.lang.String r10 = "The source file doesn't exist."
            r9.<init>(r7, r8, r10)
            throw r9
    }

    public static final java.nio.file.Path copyToRecursively(java.nio.file.Path r7, java.nio.file.Path r8, kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r9, boolean r10, boolean r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            if (r11 == 0) goto L1d
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2 r11 = new kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2
            r11.<init>(r10)
            kotlin.jvm.functions.Function3 r11 = (kotlin.jvm.functions.Function3) r11
            java.nio.file.Path r7 = kotlin.io.path.PathsKt.copyToRecursively(r7, r8, r9, r10, r11)
            goto L29
        L1d:
            r5 = 8
            r6 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            java.nio.file.Path r7 = kotlin.io.path.PathsKt.copyToRecursively$default(r0, r1, r2, r3, r4, r5, r6)
        L29:
            return r7
    }

    private static final java.nio.file.FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(kotlin.jvm.functions.Function3<? super kotlin.io.path.CopyActionContext, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.io.path.CopyActionResult> r1, java.nio.file.Path r2, java.nio.file.Path r3, kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r4, java.nio.file.Path r5, java.nio.file.attribute.BasicFileAttributes r6) {
            kotlin.io.path.DefaultCopyActionContext r6 = kotlin.io.path.DefaultCopyActionContext.INSTANCE     // Catch: java.lang.Exception -> L11
            java.nio.file.Path r0 = copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(r2, r3, r5)     // Catch: java.lang.Exception -> L11
            java.lang.Object r1 = r1.invoke(r6, r5, r0)     // Catch: java.lang.Exception -> L11
            kotlin.io.path.CopyActionResult r1 = (kotlin.io.path.CopyActionResult) r1     // Catch: java.lang.Exception -> L11
            java.nio.file.FileVisitResult r1 = toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(r1)     // Catch: java.lang.Exception -> L11
            goto L16
        L11:
            r1 = move-exception
            java.nio.file.FileVisitResult r1 = copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(r4, r2, r3, r5, r1)
        L16:
            return r1
    }

    public static /* synthetic */ java.nio.file.Path copyToRecursively$default(java.nio.file.Path r0, java.nio.file.Path r1, kotlin.jvm.functions.Function3 r2, boolean r3, kotlin.jvm.functions.Function3 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L8
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3 r2 = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.AnonymousClass3.INSTANCE
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
        L8:
            r5 = r5 & 8
            if (r5 == 0) goto L13
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4 r4 = new kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4
            r4.<init>(r3)
            kotlin.jvm.functions.Function3 r4 = (kotlin.jvm.functions.Function3) r4
        L13:
            java.nio.file.Path r0 = kotlin.io.path.PathsKt.copyToRecursively(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path copyToRecursively$default(java.nio.file.Path r0, java.nio.file.Path r1, kotlin.jvm.functions.Function3 r2, boolean r3, boolean r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L8
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$1 r2 = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.AnonymousClass1.INSTANCE
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
        L8:
            java.nio.file.Path r0 = kotlin.io.path.PathsKt.copyToRecursively(r0, r1, r2, r3, r4)
            return r0
    }

    private static final java.nio.file.Path copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path r0, java.nio.file.Path r1, java.nio.file.Path r2) {
            java.nio.file.Path r0 = kotlin.io.path.PathsKt.relativeTo(r2, r0)
            java.lang.String r0 = r0.toString()
            java.nio.file.Path r0 = r1.resolve(r0)
            java.lang.String r1 = "target.resolve(relativePath.pathString)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.FileVisitResult copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r0, java.nio.file.Path r1, java.nio.file.Path r2, java.nio.file.Path r3, java.lang.Exception r4) {
            java.nio.file.Path r1 = copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(r1, r2, r3)
            java.lang.Object r0 = r0.invoke(r3, r1, r4)
            kotlin.io.path.OnErrorResult r0 = (kotlin.io.path.OnErrorResult) r0
            java.nio.file.FileVisitResult r0 = toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(r0)
            return r0
    }

    public static final void deleteRecursively(java.nio.file.Path r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.List r3 = deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(r3)
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L37
            java.nio.file.FileSystemException r0 = new java.nio.file.FileSystemException
            java.lang.String r1 = "Failed to delete one or more files. See suppressed exceptions for details."
            r0.<init>(r1)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r3.next()
            java.lang.Exception r1 = (java.lang.Exception) r1
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            kotlin.ExceptionsKt.addSuppressed(r2, r1)
            goto L1f
        L34:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L37:
            return
    }

    private static final java.util.List<java.lang.Exception> deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path r8) {
            kotlin.io.path.ExceptionsCollector r0 = new kotlin.io.path.ExceptionsCollector
            r1 = 0
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.nio.file.Path r4 = r8.getParent()
            if (r4 == 0) goto L40
            java.nio.file.DirectoryStream r5 = java.nio.file.Files.newDirectoryStream(r4)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r5 = r3
        L14:
            if (r5 == 0) goto L40
            java.io.Closeable r5 = (java.io.Closeable) r5
            r6 = r5
            java.nio.file.DirectoryStream r6 = (java.nio.file.DirectoryStream) r6     // Catch: java.lang.Throwable -> L39
            boolean r7 = r6 instanceof java.nio.file.SecureDirectoryStream     // Catch: java.lang.Throwable -> L39
            if (r7 == 0) goto L31
            r0.setPath(r4)     // Catch: java.lang.Throwable -> L39
            java.nio.file.SecureDirectoryStream r6 = (java.nio.file.SecureDirectoryStream) r6     // Catch: java.lang.Throwable -> L39
            java.nio.file.Path r2 = r8.getFileName()     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = "this.fileName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)     // Catch: java.lang.Throwable -> L39
            handleEntry$PathsKt__PathRecursiveFunctionsKt(r6, r2, r0)     // Catch: java.lang.Throwable -> L39
            goto L32
        L31:
            r1 = r2
        L32:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L39
            kotlin.io.CloseableKt.closeFinally(r5, r3)
            r2 = r1
            goto L40
        L39:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> L3b
        L3b:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r5, r8)
            throw r0
        L40:
            if (r2 == 0) goto L45
            insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(r8, r0)
        L45:
            java.util.List r8 = r0.getCollectedExceptions()
            return r8
    }

    private static final void enterDirectory$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r4, java.nio.file.Path r5, kotlin.io.path.ExceptionsCollector r6) {
            r0 = 1
            r1 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]     // Catch: java.lang.Exception -> Le java.nio.file.NoSuchFileException -> L10
            java.nio.file.LinkOption r2 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Exception -> Le java.nio.file.NoSuchFileException -> L10
            r3 = 0
            r0[r3] = r2     // Catch: java.lang.Exception -> Le java.nio.file.NoSuchFileException -> L10
            java.nio.file.SecureDirectoryStream r4 = r4.newDirectoryStream(r5, r0)     // Catch: java.lang.Exception -> Le java.nio.file.NoSuchFileException -> L10
            goto L11
        Le:
            r4 = move-exception
            goto L42
        L10:
            r4 = r1
        L11:
            if (r4 == 0) goto L45
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.lang.Exception -> Le
            r5 = r4
            java.nio.file.SecureDirectoryStream r5 = (java.nio.file.SecureDirectoryStream) r5     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r0 = r5.iterator()     // Catch: java.lang.Throwable -> L3b
        L1c:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L35
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L3b
            java.nio.file.Path r2 = (java.nio.file.Path) r2     // Catch: java.lang.Throwable -> L3b
            java.nio.file.Path r2 = r2.getFileName()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "entry.fileName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> L3b
            handleEntry$PathsKt__PathRecursiveFunctionsKt(r5, r2, r6)     // Catch: java.lang.Throwable -> L3b
            goto L1c
        L35:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3b
            kotlin.io.CloseableKt.closeFinally(r4, r1)     // Catch: java.lang.Exception -> Le
            goto L45
        L3b:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L3d
        L3d:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r4, r5)     // Catch: java.lang.Exception -> Le
            throw r0     // Catch: java.lang.Exception -> Le
        L42:
            r6.collect(r4)
        L45:
            return
    }

    private static final void handleEntry$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r3, java.nio.file.Path r4, kotlin.io.path.ExceptionsCollector r5) {
            r5.enterEntry(r4)
            r0 = 1
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]     // Catch: java.lang.Exception -> L2a
            java.nio.file.LinkOption r1 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Exception -> L2a
            r2 = 0
            r0[r2] = r1     // Catch: java.lang.Exception -> L2a
            boolean r0 = isDirectory$PathsKt__PathRecursiveFunctionsKt(r3, r4, r0)     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L24
            int r0 = r5.getTotalExceptions()     // Catch: java.lang.Exception -> L2a
            enterDirectory$PathsKt__PathRecursiveFunctionsKt(r3, r4, r5)     // Catch: java.lang.Exception -> L2a
            int r1 = r5.getTotalExceptions()     // Catch: java.lang.Exception -> L2a
            if (r0 != r1) goto L2e
            r3.deleteDirectory(r4)     // Catch: java.lang.Exception -> L2a java.nio.file.NoSuchFileException -> L2e
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L2a java.nio.file.NoSuchFileException -> L2e
            goto L2e
        L24:
            r3.deleteFile(r4)     // Catch: java.lang.Exception -> L2a java.nio.file.NoSuchFileException -> L2e
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L2a java.nio.file.NoSuchFileException -> L2e
            goto L2e
        L2a:
            r3 = move-exception
            r5.collect(r3)
        L2e:
            r5.exitEntry(r4)
            return
    }

    private static final void insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path r4, kotlin.io.path.ExceptionsCollector r5) {
            r0 = 0
            java.nio.file.DirectoryStream r4 = java.nio.file.Files.newDirectoryStream(r4)     // Catch: java.lang.Exception -> L6 java.nio.file.NoSuchFileException -> L8
            goto L9
        L6:
            r4 = move-exception
            goto L36
        L8:
            r4 = r0
        L9:
            if (r4 == 0) goto L39
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.lang.Exception -> L6
            r1 = r4
            java.nio.file.DirectoryStream r1 = (java.nio.file.DirectoryStream) r1     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2f
        L14:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2f
            java.nio.file.Path r2 = (java.nio.file.Path) r2     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "entry"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> L2f
            insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(r2, r5)     // Catch: java.lang.Throwable -> L2f
            goto L14
        L29:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2f
            kotlin.io.CloseableKt.closeFinally(r4, r0)     // Catch: java.lang.Exception -> L6
            goto L39
        L2f:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L31
        L31:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r4, r0)     // Catch: java.lang.Exception -> L6
            throw r1     // Catch: java.lang.Exception -> L6
        L36:
            r5.collect(r4)
        L39:
            return
    }

    private static final void insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path r4, kotlin.io.path.ExceptionsCollector r5) {
            r0 = 1
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]     // Catch: java.lang.Exception -> L29
            java.nio.file.LinkOption r2 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Exception -> L29
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> L29
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch: java.lang.Exception -> L29
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0     // Catch: java.lang.Exception -> L29
            boolean r0 = java.nio.file.Files.isDirectory(r4, r0)     // Catch: java.lang.Exception -> L29
            if (r0 == 0) goto L25
            int r0 = r5.getTotalExceptions()     // Catch: java.lang.Exception -> L29
            insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(r4, r5)     // Catch: java.lang.Exception -> L29
            int r1 = r5.getTotalExceptions()     // Catch: java.lang.Exception -> L29
            if (r0 != r1) goto L2d
            java.nio.file.Files.deleteIfExists(r4)     // Catch: java.lang.Exception -> L29
            goto L2d
        L25:
            java.nio.file.Files.deleteIfExists(r4)     // Catch: java.lang.Exception -> L29
            goto L2d
        L29:
            r4 = move-exception
            r5.collect(r4)
        L2d:
            return
    }

    private static final boolean isDirectory$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r2, java.nio.file.Path r3, java.nio.file.LinkOption... r4) {
            java.lang.Class<java.nio.file.attribute.BasicFileAttributeView> r0 = java.nio.file.attribute.BasicFileAttributeView.class
            int r1 = r4.length     // Catch: java.nio.file.NoSuchFileException -> L1c
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.nio.file.NoSuchFileException -> L1c
            java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L1c
            java.nio.file.attribute.FileAttributeView r2 = r2.getFileAttributeView(r3, r0, r4)     // Catch: java.nio.file.NoSuchFileException -> L1c
            java.nio.file.attribute.BasicFileAttributeView r2 = (java.nio.file.attribute.BasicFileAttributeView) r2     // Catch: java.nio.file.NoSuchFileException -> L1c
            java.nio.file.attribute.BasicFileAttributes r2 = r2.readAttributes()     // Catch: java.nio.file.NoSuchFileException -> L1c
            boolean r2 = r2.isDirectory()     // Catch: java.nio.file.NoSuchFileException -> L1c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.nio.file.NoSuchFileException -> L1c
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto L24
            boolean r2 = r2.booleanValue()
            goto L25
        L24:
            r2 = 0
        L25:
            return r2
    }

    private static final java.nio.file.FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(kotlin.io.path.CopyActionResult r1) {
            int[] r0 = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L1d
            r0 = 2
            if (r1 == r0) goto L1a
            r0 = 3
            if (r1 != r0) goto L14
            java.nio.file.FileVisitResult r1 = java.nio.file.FileVisitResult.SKIP_SUBTREE
            goto L1f
        L14:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L1a:
            java.nio.file.FileVisitResult r1 = java.nio.file.FileVisitResult.TERMINATE
            goto L1f
        L1d:
            java.nio.file.FileVisitResult r1 = java.nio.file.FileVisitResult.CONTINUE
        L1f:
            return r1
    }

    private static final java.nio.file.FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(kotlin.io.path.OnErrorResult r1) {
            int[] r0 = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$1
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L17
            r0 = 2
            if (r1 != r0) goto L11
            java.nio.file.FileVisitResult r1 = java.nio.file.FileVisitResult.SKIP_SUBTREE
            goto L19
        L11:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L17:
            java.nio.file.FileVisitResult r1 = java.nio.file.FileVisitResult.TERMINATE
        L19:
            return r1
    }

    private static final <R> R tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt(kotlin.jvm.functions.Function0<? extends R> r0) {
            java.lang.Object r0 = r0.invoke()     // Catch: java.nio.file.NoSuchFileException -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }
}
