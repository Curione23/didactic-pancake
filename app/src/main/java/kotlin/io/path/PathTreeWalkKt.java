package kotlin.io.path;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0002\u0010\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"keyOf", "", "path", "Ljava/nio/file/Path;", "linkOptions", "", "Ljava/nio/file/LinkOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "createsCycle", "", "Lkotlin/io/path/PathNode;", "kotlin-stdlib-jdk7"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PathTreeWalkKt {
    public static final /* synthetic */ boolean access$createsCycle(kotlin.io.path.PathNode r0) {
            boolean r0 = createsCycle(r0)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$keyOf(java.nio.file.Path r0, java.nio.file.LinkOption[] r1) {
            java.lang.Object r0 = keyOf(r0, r1)
            return r0
    }

    private static final boolean createsCycle(kotlin.io.path.PathNode r4) {
            kotlin.io.path.PathNode r0 = r4.getParent()
        L4:
            if (r0 == 0) goto L36
            java.lang.Object r1 = r0.getKey()
            r2 = 1
            if (r1 == 0) goto L22
            java.lang.Object r1 = r4.getKey()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r3 = r4.getKey()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L31
            return r2
        L22:
            java.nio.file.Path r1 = r0.getPath()     // Catch: java.lang.Throwable -> L31
            java.nio.file.Path r3 = r4.getPath()     // Catch: java.lang.Throwable -> L31
            boolean r1 = java.nio.file.Files.isSameFile(r1, r3)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L31
            return r2
        L31:
            kotlin.io.path.PathNode r0 = r0.getParent()
            goto L4
        L36:
            r4 = 0
            return r4
    }

    private static final java.lang.Object keyOf(java.nio.file.Path r2, java.nio.file.LinkOption[] r3) {
            int r0 = r3.length     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)     // Catch: java.lang.Throwable -> L1e
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3     // Catch: java.lang.Throwable -> L1e
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r0 = java.nio.file.attribute.BasicFileAttributes.class
            int r1 = r3.length     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)     // Catch: java.lang.Throwable -> L1e
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3     // Catch: java.lang.Throwable -> L1e
            java.nio.file.attribute.BasicFileAttributes r2 = java.nio.file.Files.readAttributes(r2, r0, r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "readAttributes(this, A::class.java, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r2.fileKey()     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r2 = 0
        L1f:
            return r2
    }
}
