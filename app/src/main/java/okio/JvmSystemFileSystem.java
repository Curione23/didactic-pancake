package okio;

/* JADX INFO: compiled from: JvmSystemFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J \u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\f\u0010!\u001a\u00020\n*\u00020\u0006H\u0002J\f\u0010\"\u001a\u00020\n*\u00020\u0006H\u0002¨\u0006#"}, d2 = {"Lokio/JvmSystemFileSystem;", "Lokio/FileSystem;", "()V", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", "target", "canonicalize", "path", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toString", "", "requireCreate", "requireExist", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class JvmSystemFileSystem extends okio.FileSystem {
    public JvmSystemFileSystem() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.List<okio.Path> list(okio.Path r5, boolean r6) {
            r4 = this;
            java.io.File r0 = r5.toFile()
            java.lang.String[] r1 = r0.list()
            if (r1 != 0) goto L3e
            if (r6 == 0) goto L3c
            boolean r6 = r0.exists()
            if (r6 != 0) goto L27
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "no such file: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L27:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to list "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L3c:
            r5 = 0
            return r5
        L3e:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
            java.util.Collection r6 = (java.util.Collection) r6
            int r0 = r1.length
            r2 = 0
        L49:
            if (r2 >= r0) goto L5a
            r3 = r1[r2]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            okio.Path r3 = r5.resolve(r3)
            r6.add(r3)
            int r2 = r2 + 1
            goto L49
        L5a:
            java.util.List r6 = (java.util.List) r6
            kotlin.collections.CollectionsKt.sort(r6)
            return r6
    }

    private final void requireCreate(okio.Path r3) {
            r2 = this;
            boolean r0 = r2.exists(r3)
            if (r0 != 0) goto L7
            return
        L7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " already exists."
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private final void requireExist(okio.Path r3) {
            r2 = this;
            boolean r0 = r2.exists(r3)
            if (r0 == 0) goto L7
            return
        L7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " doesn't exist."
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto La
            r1.requireExist(r2)
        La:
            java.io.File r2 = r2.toFile()
            r3 = 1
            okio.Sink r2 = okio.Okio.sink(r2, r3)
            return r2
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path r4, okio.Path r5) {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.io.File r0 = r4.toFile()
            java.io.File r1 = r5.toFile()
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto L19
            return
        L19:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "failed to move "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " to "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path r5) {
            r4 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.io.File r5 = r5.toFile()
            java.io.File r5 = r5.getCanonicalFile()
            boolean r0 = r5.exists()
            if (r0 == 0) goto L20
            okio.Path$Companion r0 = okio.Path.Companion
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r1 = 1
            r2 = 0
            r3 = 0
            okio.Path r5 = okio.Path.Companion.get$default(r0, r5, r3, r1, r2)
            return r5
        L20:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r0 = "no such file"
            r5.<init>(r0)
            throw r5
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.File r0 = r3.toFile()
            boolean r0 = r0.mkdir()
            if (r0 != 0) goto L4d
            okio.FileMetadata r0 = r2.metadataOrNull(r3)
            if (r0 == 0) goto L38
            boolean r0 = r0.isDirectory()
            r1 = 1
            if (r0 != r1) goto L38
            if (r4 != 0) goto L1f
            return
        L1f:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " already exists."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L38:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to create directory: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L4d:
            return
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path r2, okio.Path r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "unsupported"
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.FileSystem
    public void delete(okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L49
            java.io.File r0 = r3.toFile()
            boolean r1 = r0.delete()
            if (r1 != 0) goto L48
            boolean r0 = r0.exists()
            if (r0 != 0) goto L33
            if (r4 != 0) goto L1e
            goto L48
        L1e:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "no such file: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L33:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L48:
            return
        L49:
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException
            java.lang.String r4 = "interrupted"
            r3.<init>(r4)
            throw r3
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
    public okio.FileMetadata metadataOrNull(okio.Path r13) {
            r12 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.io.File r13 = r13.toFile()
            boolean r1 = r13.isFile()
            boolean r2 = r13.isDirectory()
            long r3 = r13.lastModified()
            long r5 = r13.length()
            if (r1 != 0) goto L2f
            if (r2 != 0) goto L2f
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L2f
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L2f
            boolean r13 = r13.exists()
            if (r13 != 0) goto L2f
            r13 = 0
            return r13
        L2f:
            okio.FileMetadata r13 = new okio.FileMetadata
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r9 = 128(0x80, float:1.8E-43)
            r10 = 0
            r3 = 0
            r7 = 0
            r8 = 0
            r11 = 0
            r0 = r13
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r13
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path r4) {
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okio.JvmFileHandle r0 = new okio.JvmFileHandle
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.io.File r4 = r4.toFile()
            java.lang.String r2 = "r"
            r1.<init>(r4, r2)
            r4 = 0
            r0.<init>(r4, r1)
            okio.FileHandle r0 = (okio.FileHandle) r0
            return r0
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path r2, boolean r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L16
            if (r4 != 0) goto La
            goto L16
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Cannot require mustCreate and mustExist at the same time."
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L16:
            if (r3 == 0) goto L1b
            r1.requireCreate(r2)
        L1b:
            if (r4 == 0) goto L20
            r1.requireExist(r2)
        L20:
            okio.JvmFileHandle r3 = new okio.JvmFileHandle
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile
            java.io.File r2 = r2.toFile()
            java.lang.String r0 = "rw"
            r4.<init>(r2, r0)
            r2 = 1
            r3.<init>(r2, r4)
            okio.FileHandle r3 = (okio.FileHandle) r3
            return r3
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 == 0) goto La
            r2.requireCreate(r3)
        La:
            java.io.File r3 = r3.toFile()
            r4 = 1
            r0 = 0
            r1 = 0
            okio.Sink r3 = okio.Okio.sink$default(r3, r1, r4, r0)
            return r3
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r2 = r2.toFile()
            okio.Source r2 = okio.Okio.source(r2)
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "JvmSystemFileSystem"
            return r0
    }
}
