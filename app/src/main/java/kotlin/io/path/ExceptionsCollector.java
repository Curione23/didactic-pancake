package kotlin.io.path;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0007j\u0002`\bJ\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\fJ\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\fR\u001b\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lkotlin/io/path/ExceptionsCollector;", "", "limit", "", "(I)V", "collectedExceptions", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getCollectedExceptions", "()Ljava/util/List;", "path", "Ljava/nio/file/Path;", "getPath", "()Ljava/nio/file/Path;", "setPath", "(Ljava/nio/file/Path;)V", "<set-?>", "totalExceptions", "getTotalExceptions", "()I", "collect", "", "exception", "enterEntry", "name", "exitEntry", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ExceptionsCollector {
    private final java.util.List<java.lang.Exception> collectedExceptions;
    private final int limit;
    private java.nio.file.Path path;
    private int totalExceptions;

    public ExceptionsCollector() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public ExceptionsCollector(int r1) {
            r0 = this;
            r0.<init>()
            r0.limit = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            r0.collectedExceptions = r1
            return
    }

    public /* synthetic */ ExceptionsCollector(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 64
        L6:
            r0.<init>(r1)
            return
    }

    public final void collect(java.lang.Exception r3) {
            r2 = this;
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.totalExceptions
            int r0 = r0 + 1
            r2.totalExceptions = r0
            java.util.List<java.lang.Exception> r0 = r2.collectedExceptions
            int r0 = r0.size()
            int r1 = r2.limit
            if (r0 >= r1) goto L38
            java.nio.file.Path r0 = r2.path
            if (r0 == 0) goto L33
            java.nio.file.FileSystemException r0 = new java.nio.file.FileSystemException
            java.nio.file.Path r1 = r2.path
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Throwable r3 = r0.initCause(r3)
            java.lang.String r0 = "null cannot be cast to non-null type java.nio.file.FileSystemException"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r0)
            java.nio.file.FileSystemException r3 = (java.nio.file.FileSystemException) r3
            java.lang.Exception r3 = (java.lang.Exception) r3
        L33:
            java.util.List<java.lang.Exception> r0 = r2.collectedExceptions
            r0.add(r3)
        L38:
            return
    }

    public final void enterEntry(java.nio.file.Path r2) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.nio.file.Path r0 = r1.path
            if (r0 == 0) goto Le
            java.nio.file.Path r2 = r0.resolve(r2)
            goto Lf
        Le:
            r2 = 0
        Lf:
            r1.path = r2
            return
    }

    public final void exitEntry(java.nio.file.Path r3) {
            r2 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.nio.file.Path r0 = r2.path
            r1 = 0
            if (r0 == 0) goto Lf
            java.nio.file.Path r0 = r0.getFileName()
            goto L10
        Lf:
            r0 = r1
        L10:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r3 == 0) goto L21
            java.nio.file.Path r3 = r2.path
            if (r3 == 0) goto L1e
            java.nio.file.Path r1 = r3.getParent()
        L1e:
            r2.path = r1
            return
        L21:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public final java.util.List<java.lang.Exception> getCollectedExceptions() {
            r1 = this;
            java.util.List<java.lang.Exception> r0 = r1.collectedExceptions
            return r0
    }

    public final java.nio.file.Path getPath() {
            r1 = this;
            java.nio.file.Path r0 = r1.path
            return r0
    }

    public final int getTotalExceptions() {
            r1 = this;
            int r0 = r1.totalExceptions
            return r0
    }

    public final void setPath(java.nio.file.Path r1) {
            r0 = this;
            r0.path = r1
            return
    }
}
