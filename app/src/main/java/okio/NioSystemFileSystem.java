package okio;

/* JADX INFO: compiled from: NioSystemFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lokio/NioSystemFileSystem;", "Lokio/JvmSystemFileSystem;", "()V", "atomicMove", "", "source", "Lokio/Path;", "target", "createSymlink", "metadataOrNull", "Lokio/FileMetadata;", "nioPath", "Ljava/nio/file/Path;", "path", "toString", "", "zeroToNull", "", "Ljava/nio/file/attribute/FileTime;", "(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class NioSystemFileSystem extends okio.JvmSystemFileSystem {
    public NioSystemFileSystem() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.Long zeroToNull(java.nio.file.attribute.FileTime r5) {
            r4 = this;
            long r0 = r5.toMillis()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r0 = r5
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            goto L17
        L16:
            r5 = 0
        L17:
            return r5
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void atomicMove(okio.Path r4, okio.Path r5) {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.nio.file.Path r4 = r4.toNioPath()     // Catch: java.lang.UnsupportedOperationException -> L23 java.nio.file.NoSuchFileException -> L2b
            java.nio.file.Path r5 = r5.toNioPath()     // Catch: java.lang.UnsupportedOperationException -> L23 java.nio.file.NoSuchFileException -> L2b
            r0 = 2
            java.nio.file.CopyOption[] r0 = new java.nio.file.CopyOption[r0]     // Catch: java.lang.UnsupportedOperationException -> L23 java.nio.file.NoSuchFileException -> L2b
            java.nio.file.StandardCopyOption r1 = java.nio.file.StandardCopyOption.ATOMIC_MOVE     // Catch: java.lang.UnsupportedOperationException -> L23 java.nio.file.NoSuchFileException -> L2b
            r2 = 0
            r0[r2] = r1     // Catch: java.lang.UnsupportedOperationException -> L23 java.nio.file.NoSuchFileException -> L2b
            java.nio.file.StandardCopyOption r1 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.lang.UnsupportedOperationException -> L23 java.nio.file.NoSuchFileException -> L2b
            r2 = 1
            r0[r2] = r1     // Catch: java.lang.UnsupportedOperationException -> L23 java.nio.file.NoSuchFileException -> L2b
            java.nio.file.Files.move(r4, r5, r0)     // Catch: java.lang.UnsupportedOperationException -> L23 java.nio.file.NoSuchFileException -> L2b
            return
        L23:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "atomic move not supported"
            r4.<init>(r5)
            throw r4
        L2b:
            r4 = move-exception
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r4 = r4.getMessage()
            r5.<init>(r4)
            throw r5
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void createSymlink(okio.Path r2, okio.Path r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.nio.file.Path r2 = r2.toNioPath()
            java.nio.file.Path r3 = r3.toNioPath()
            r0 = 0
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r0]
            java.nio.file.Files.createSymbolicLink(r2, r3, r0)
            return
    }

    protected final okio.FileMetadata metadataOrNull(java.nio.file.Path r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "nioPath"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r3 = java.nio.file.attribute.BasicFileAttributes.class
            r4 = 1
            java.nio.file.LinkOption[] r5 = new java.nio.file.LinkOption[r4]     // Catch: java.lang.Throwable -> L71
            java.nio.file.LinkOption r6 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Throwable -> L71
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L71
            java.nio.file.attribute.BasicFileAttributes r3 = java.nio.file.Files.readAttributes(r1, r3, r5)     // Catch: java.lang.Throwable -> L71
            boolean r5 = r3.isSymbolicLink()
            if (r5 == 0) goto L23
            java.nio.file.Path r1 = java.nio.file.Files.readSymbolicLink(r20)
            goto L24
        L23:
            r1 = r2
        L24:
            okio.FileMetadata r5 = new okio.FileMetadata
            boolean r9 = r3.isRegularFile()
            boolean r10 = r3.isDirectory()
            if (r1 == 0) goto L38
            okio.Path$Companion r6 = okio.Path.Companion
            okio.Path r1 = okio.Path.Companion.get$default(r6, r1, r7, r4, r2)
            r11 = r1
            goto L39
        L38:
            r11 = r2
        L39:
            long r6 = r3.size()
            java.lang.Long r12 = java.lang.Long.valueOf(r6)
            java.nio.file.attribute.FileTime r1 = r3.creationTime()
            if (r1 == 0) goto L4d
            java.lang.Long r1 = r0.zeroToNull(r1)
            r13 = r1
            goto L4e
        L4d:
            r13 = r2
        L4e:
            java.nio.file.attribute.FileTime r1 = r3.lastModifiedTime()
            if (r1 == 0) goto L5a
            java.lang.Long r1 = r0.zeroToNull(r1)
            r14 = r1
            goto L5b
        L5a:
            r14 = r2
        L5b:
            java.nio.file.attribute.FileTime r1 = r3.lastAccessTime()
            if (r1 == 0) goto L65
            java.lang.Long r2 = r0.zeroToNull(r1)
        L65:
            r15 = r2
            r17 = 128(0x80, float:1.8E-43)
            r18 = 0
            r16 = 0
            r8 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r5
        L71:
            return r2
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.nio.file.Path r2 = r2.toNioPath()
            okio.FileMetadata r2 = r1.metadataOrNull(r2)
            return r2
    }

    @Override // okio.JvmSystemFileSystem
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "NioSystemFileSystem"
            return r0
    }
}
