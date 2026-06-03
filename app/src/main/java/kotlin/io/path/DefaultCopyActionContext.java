package kotlin.io.path;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lkotlin/io/path/DefaultCopyActionContext;", "Lkotlin/io/path/CopyActionContext;", "()V", "copyToIgnoringExistingDirectory", "Lkotlin/io/path/CopyActionResult;", "Ljava/nio/file/Path;", "target", "followLinks", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DefaultCopyActionContext implements kotlin.io.path.CopyActionContext {
    public static final kotlin.io.path.DefaultCopyActionContext INSTANCE = null;

    static {
            kotlin.io.path.DefaultCopyActionContext r0 = new kotlin.io.path.DefaultCopyActionContext
            r0.<init>()
            kotlin.io.path.DefaultCopyActionContext.INSTANCE = r0
            return
    }

    private DefaultCopyActionContext() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.io.path.CopyActionContext
    public kotlin.io.path.CopyActionResult copyToIgnoringExistingDirectory(java.nio.file.Path r5, java.nio.file.Path r6, boolean r7) {
            r4 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.io.path.LinkFollowing r0 = kotlin.io.path.LinkFollowing.INSTANCE
            java.nio.file.LinkOption[] r7 = r0.toLinkOptions(r7)
            int r0 = r7.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r7, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = java.nio.file.Files.isDirectory(r5, r0)
            if (r0 == 0) goto L38
            r0 = 1
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            r2 = 0
            java.nio.file.LinkOption r3 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r1[r2] = r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = java.nio.file.Files.isDirectory(r6, r0)
            if (r0 != 0) goto L4f
        L38:
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.nio.file.CopyOption[] r7 = (java.nio.file.CopyOption[]) r7
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.nio.file.CopyOption[] r7 = (java.nio.file.CopyOption[]) r7
            java.nio.file.Path r5 = java.nio.file.Files.copy(r5, r6, r7)
            java.lang.String r6 = "copy(this, target, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
        L4f:
            kotlin.io.path.CopyActionResult r5 = kotlin.io.path.CopyActionResult.CONTINUE
            return r5
    }
}
