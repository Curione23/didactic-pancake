package okio;

/* JADX INFO: compiled from: NioFileSystemWrappingFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J \u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010!\u001a\u00020\"H\u0016J\f\u0010#\u001a\u00020$*\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokio/NioFileSystemWrappingFileSystem;", "Lokio/NioSystemFileSystem;", "nioFileSystem", "Ljava/nio/file/FileSystem;", "(Ljava/nio/file/FileSystem;)V", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", "target", "canonicalize", "path", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toString", "", "resolve", "Ljava/nio/file/Path;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NioFileSystemWrappingFileSystem extends okio.NioSystemFileSystem {
    private final java.nio.file.FileSystem nioFileSystem;

    public NioFileSystemWrappingFileSystem(java.nio.file.FileSystem r2) {
            r1 = this;
            java.lang.String r0 = "nioFileSystem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.nioFileSystem = r2
            return
    }

    private final java.util.List<okio.Path> list(okio.Path r6, boolean r7) {
            r5 = this;
            java.nio.file.Path r0 = r5.resolve(r6)
            r1 = 0
            r2 = 1
            r3 = 0
            java.util.List r6 = kotlin.io.path.PathsKt.listDirectoryEntries$default(r0, r3, r2, r3)     // Catch: java.lang.Exception -> L36
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r7 = (java.util.List) r7
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Iterator r6 = r6.iterator()
        L1a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r6.next()
            java.nio.file.Path r0 = (java.nio.file.Path) r0
            okio.Path$Companion r4 = okio.Path.Companion
            okio.Path r0 = okio.Path.Companion.get$default(r4, r0, r1, r2, r3)
            r7.add(r0)
            goto L1a
        L30:
            java.util.List r7 = (java.util.List) r7
            kotlin.collections.CollectionsKt.sort(r7)
            return r7
        L36:
            if (r7 == 0) goto L70
            java.nio.file.LinkOption[] r7 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r1)
            java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
            boolean r7 = java.nio.file.Files.exists(r0, r7)
            if (r7 != 0) goto L5b
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "no such file: "
            r0.<init>(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L5b:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to list "
            r0.<init>(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L70:
            return r3
    }

    private final java.nio.file.Path resolve(okio.Path r3) {
            r2 = this;
            java.nio.file.FileSystem r0 = r2.nioFileSystem
            java.lang.String r3 = r3.toString()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r3 = r0.getPath(r3, r1)
            java.lang.String r0 = "getPath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            return r3
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Sink appendingSink(okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder()
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.APPEND
            r0.add(r1)
            if (r4 != 0) goto L15
            java.nio.file.StandardOpenOption r4 = java.nio.file.StandardOpenOption.CREATE
            r0.add(r4)
        L15:
            java.util.List r4 = kotlin.collections.CollectionsKt.build(r0)
            java.nio.file.Path r3 = r2.resolve(r3)
            java.util.Collection r4 = (java.util.Collection) r4
            r0 = 0
            java.nio.file.StandardOpenOption[] r0 = new java.nio.file.StandardOpenOption[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.nio.file.StandardOpenOption[] r4 = (java.nio.file.StandardOpenOption[]) r4
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.OutputStream r3 = java.nio.file.Files.newOutputStream(r3, r4)
            java.lang.String r4 = "newOutputStream(this, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            okio.Sink r3 = okio.Okio.sink(r3)
            return r3
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public void atomicMove(okio.Path r5, okio.Path r6) {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.nio.file.Path r5 = r4.resolve(r5)     // Catch: java.lang.UnsupportedOperationException -> L2f java.nio.file.NoSuchFileException -> L37
            java.nio.file.Path r6 = r4.resolve(r6)     // Catch: java.lang.UnsupportedOperationException -> L2f java.nio.file.NoSuchFileException -> L37
            r0 = 2
            java.nio.file.CopyOption[] r1 = new java.nio.file.CopyOption[r0]     // Catch: java.lang.UnsupportedOperationException -> L2f java.nio.file.NoSuchFileException -> L37
            java.nio.file.StandardCopyOption r2 = java.nio.file.StandardCopyOption.ATOMIC_MOVE     // Catch: java.lang.UnsupportedOperationException -> L2f java.nio.file.NoSuchFileException -> L37
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.UnsupportedOperationException -> L2f java.nio.file.NoSuchFileException -> L37
            java.nio.file.StandardCopyOption r2 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.lang.UnsupportedOperationException -> L2f java.nio.file.NoSuchFileException -> L37
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.UnsupportedOperationException -> L2f java.nio.file.NoSuchFileException -> L37
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch: java.lang.UnsupportedOperationException -> L2f java.nio.file.NoSuchFileException -> L37
            java.nio.file.CopyOption[] r0 = (java.nio.file.CopyOption[]) r0     // Catch: java.lang.UnsupportedOperationException -> L2f java.nio.file.NoSuchFileException -> L37
            java.nio.file.Path r5 = java.nio.file.Files.move(r5, r6, r0)     // Catch: java.lang.UnsupportedOperationException -> L2f java.nio.file.NoSuchFileException -> L37
            java.lang.String r6 = "move(this, target, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch: java.lang.UnsupportedOperationException -> L2f java.nio.file.NoSuchFileException -> L37
            return
        L2f:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "atomic move not supported"
            r5.<init>(r6)
            throw r5
        L37:
            r5 = move-exception
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r5 = r5.getMessage()
            r6.<init>(r5)
            throw r6
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Path canonicalize(okio.Path r6) {
            r5 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okio.Path$Companion r0 = okio.Path.Companion     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.file.Path r1 = r5.resolve(r6)     // Catch: java.nio.file.NoSuchFileException -> L1e
            r2 = 0
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r2]     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.file.Path r1 = r1.toRealPath(r3)     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.lang.String r3 = "toRealPath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch: java.nio.file.NoSuchFileException -> L1e
            r3 = 1
            r4 = 0
            okio.Path r6 = okio.Path.Companion.get$default(r0, r1, r2, r3, r4)     // Catch: java.nio.file.NoSuchFileException -> L1e
            return r6
        L1e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "no such file: "
            r1.<init>(r2)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void createDirectory(okio.Path r4, boolean r5) {
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okio.FileMetadata r0 = r3.metadataOrNull(r4)
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.isDirectory()
            r2 = 1
            if (r0 != r2) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 == 0) goto L33
            if (r5 != 0) goto L1a
            goto L33
        L1a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " already exists."
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L33:
            java.nio.file.Path r5 = r3.resolve(r4)     // Catch: java.io.IOException -> L49
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L49
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.io.IOException -> L49
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0     // Catch: java.io.IOException -> L49
            java.nio.file.Path r5 = java.nio.file.Files.createDirectory(r5, r0)     // Catch: java.io.IOException -> L49
            java.lang.String r0 = "createDirectory(this, *attributes)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch: java.io.IOException -> L49
            return
        L49:
            r5 = move-exception
            if (r2 == 0) goto L4d
            return
        L4d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "failed to create directory: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r0.<init>(r4, r5)
            throw r0
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public void createSymlink(okio.Path r3, okio.Path r4) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.nio.file.Path r3 = r2.resolve(r3)
            java.nio.file.Path r4 = r2.resolve(r4)
            r0 = 0
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r0]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0
            java.nio.file.Path r3 = java.nio.file.Files.createSymbolicLink(r3, r4, r0)
            java.lang.String r4 = "createSymbolicLink(this, target, *attributes)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            return
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void delete(okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L50
            java.nio.file.Path r0 = r2.resolve(r3)
            java.nio.file.Files.delete(r0)     // Catch: java.io.IOException -> L13 java.nio.file.NoSuchFileException -> L38
            goto L3a
        L13:
            r4 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r4]
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r4)
            java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
            boolean r4 = java.nio.file.Files.exists(r0, r4)
            if (r4 != 0) goto L23
            goto L3a
        L23:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L38:
            if (r4 != 0) goto L3b
        L3a:
            return
        L3b:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "no such file: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L50:
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException
            java.lang.String r4 = "interrupted"
            r3.<init>(r4)
            throw r3
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            java.util.List r2 = r1.list(r2, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            return r2
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            java.util.List r2 = r1.list(r2, r0)
            return r2
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.nio.file.Path r2 = r1.resolve(r2)
            okio.FileMetadata r2 = r1.metadataOrNull(r2)
            return r2
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path r5) {
            r4 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.nio.file.Path r0 = r4.resolve(r5)     // Catch: java.nio.file.NoSuchFileException -> L20
            r1 = 1
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]     // Catch: java.nio.file.NoSuchFileException -> L20
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.READ     // Catch: java.nio.file.NoSuchFileException -> L20
            r3 = 0
            r1[r3] = r2     // Catch: java.nio.file.NoSuchFileException -> L20
            java.nio.channels.FileChannel r5 = java.nio.channels.FileChannel.open(r0, r1)     // Catch: java.nio.file.NoSuchFileException -> L20
            okio.NioFileSystemFileHandle r0 = new okio.NioFileSystemFileHandle
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r0.<init>(r3, r5)
            okio.FileHandle r0 = (okio.FileHandle) r0
            return r0
        L20:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "no such file: "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path r3, boolean r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 == 0) goto L16
            if (r5 != 0) goto La
            goto L16
        La:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Cannot require mustCreate and mustExist at the same time."
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L16:
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder()
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.READ
            r0.add(r1)
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.WRITE
            r0.add(r1)
            if (r4 == 0) goto L2c
            java.nio.file.StandardOpenOption r4 = java.nio.file.StandardOpenOption.CREATE_NEW
            r0.add(r4)
            goto L33
        L2c:
            if (r5 != 0) goto L33
            java.nio.file.StandardOpenOption r4 = java.nio.file.StandardOpenOption.CREATE
            r0.add(r4)
        L33:
            java.util.List r4 = kotlin.collections.CollectionsKt.build(r0)
            java.nio.file.Path r5 = r2.resolve(r3)     // Catch: java.nio.file.NoSuchFileException -> L5d
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.nio.file.NoSuchFileException -> L5d
            r0 = 0
            java.nio.file.StandardOpenOption[] r0 = new java.nio.file.StandardOpenOption[r0]     // Catch: java.nio.file.NoSuchFileException -> L5d
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch: java.nio.file.NoSuchFileException -> L5d
            java.nio.file.StandardOpenOption[] r4 = (java.nio.file.StandardOpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L5d
            int r0 = r4.length     // Catch: java.nio.file.NoSuchFileException -> L5d
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.nio.file.NoSuchFileException -> L5d
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L5d
            java.nio.channels.FileChannel r3 = java.nio.channels.FileChannel.open(r5, r4)     // Catch: java.nio.file.NoSuchFileException -> L5d
            okio.NioFileSystemFileHandle r4 = new okio.NioFileSystemFileHandle
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r5 = 1
            r4.<init>(r5, r3)
            okio.FileHandle r4 = (okio.FileHandle) r4
            return r4
        L5d:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "no such file: "
            r5.<init>(r0)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Sink sink(okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder()
            if (r4 == 0) goto L10
            java.nio.file.StandardOpenOption r4 = java.nio.file.StandardOpenOption.CREATE_NEW
            r0.add(r4)
        L10:
            java.util.List r4 = kotlin.collections.CollectionsKt.build(r0)
            java.nio.file.Path r0 = r2.resolve(r3)     // Catch: java.nio.file.NoSuchFileException -> L3f
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.nio.file.NoSuchFileException -> L3f
            r1 = 0
            java.nio.file.StandardOpenOption[] r1 = new java.nio.file.StandardOpenOption[r1]     // Catch: java.nio.file.NoSuchFileException -> L3f
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch: java.nio.file.NoSuchFileException -> L3f
            java.nio.file.StandardOpenOption[] r4 = (java.nio.file.StandardOpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L3f
            int r1 = r4.length     // Catch: java.nio.file.NoSuchFileException -> L3f
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.nio.file.NoSuchFileException -> L3f
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L3f
            int r1 = r4.length     // Catch: java.nio.file.NoSuchFileException -> L3f
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.nio.file.NoSuchFileException -> L3f
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L3f
            java.io.OutputStream r4 = java.nio.file.Files.newOutputStream(r0, r4)     // Catch: java.nio.file.NoSuchFileException -> L3f
            java.lang.String r0 = "newOutputStream(this, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)     // Catch: java.nio.file.NoSuchFileException -> L3f
            okio.Sink r3 = okio.Okio.sink(r4)     // Catch: java.nio.file.NoSuchFileException -> L3f
            return r3
        L3f:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "no such file: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Source source(okio.Path r4) {
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.nio.file.Path r0 = r3.resolve(r4)     // Catch: java.nio.file.NoSuchFileException -> L20
            r1 = 0
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r1]     // Catch: java.nio.file.NoSuchFileException -> L20
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)     // Catch: java.nio.file.NoSuchFileException -> L20
            java.nio.file.OpenOption[] r1 = (java.nio.file.OpenOption[]) r1     // Catch: java.nio.file.NoSuchFileException -> L20
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r0, r1)     // Catch: java.nio.file.NoSuchFileException -> L20
            java.lang.String r1 = "newInputStream(this, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.nio.file.NoSuchFileException -> L20
            okio.Source r4 = okio.Okio.source(r0)     // Catch: java.nio.file.NoSuchFileException -> L20
            return r4
        L20:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "no such file: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem
    public java.lang.String toString() {
            r1 = this;
            java.nio.file.FileSystem r0 = r1.nioFileSystem
            java.lang.Class r0 = r0.getClass()
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            java.lang.String r0 = r0.getSimpleName()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }
}
