package okio;

/* JADX INFO: compiled from: NioFileSystemFileHandle.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\bH\u0014J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\rH\u0014J\b\u0010\u0014\u001a\u00020\rH\u0014J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokio/NioFileSystemFileHandle;", "Lokio/FileHandle;", "readWrite", "", "fileChannel", "Ljava/nio/channels/FileChannel;", "(ZLjava/nio/channels/FileChannel;)V", "protectedClose", "", "protectedFlush", "protectedRead", "", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "protectedResize", "size", "protectedSize", "protectedWrite", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NioFileSystemFileHandle extends okio.FileHandle {
    private final java.nio.channels.FileChannel fileChannel;

    public NioFileSystemFileHandle(boolean r2, java.nio.channels.FileChannel r3) {
            r1 = this;
            java.lang.String r0 = "fileChannel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>(r2)
            r1.fileChannel = r3
            return
    }

    @Override // okio.FileHandle
    protected synchronized void protectedClose() {
            r1 = this;
            monitor-enter(r1)
            java.nio.channels.FileChannel r0 = r1.fileChannel     // Catch: java.lang.Throwable -> L8
            r0.close()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // okio.FileHandle
    protected synchronized void protectedFlush() {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.FileChannel r0 = r2.fileChannel     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r0.force(r1)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // okio.FileHandle
    protected synchronized int protectedRead(long r2, byte[] r4, int r5, int r6) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)     // Catch: java.lang.Throwable -> L23
            java.nio.channels.FileChannel r0 = r1.fileChannel     // Catch: java.lang.Throwable -> L23
            r0.position(r2)     // Catch: java.lang.Throwable -> L23
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r4, r5, r6)     // Catch: java.lang.Throwable -> L23
            r3 = 0
        L10:
            if (r3 >= r6) goto L21
            java.nio.channels.FileChannel r4 = r1.fileChannel     // Catch: java.lang.Throwable -> L23
            int r4 = r4.read(r2)     // Catch: java.lang.Throwable -> L23
            r5 = -1
            if (r4 != r5) goto L1f
            if (r3 != 0) goto L21
            monitor-exit(r1)
            return r5
        L1f:
            int r3 = r3 + r4
            goto L10
        L21:
            monitor-exit(r1)
            return r3
        L23:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r2
    }

    @Override // okio.FileHandle
    protected synchronized void protectedResize(long r8) {
            r7 = this;
            monitor-enter(r7)
            long r1 = r7.size()     // Catch: java.lang.Throwable -> L1d
            long r3 = r8 - r1
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L16
            int r5 = (int) r3     // Catch: java.lang.Throwable -> L1d
            byte[] r3 = new byte[r5]     // Catch: java.lang.Throwable -> L1d
            r4 = 0
            r0 = r7
            r0.protectedWrite(r1, r3, r4, r5)     // Catch: java.lang.Throwable -> L1d
            goto L1b
        L16:
            java.nio.channels.FileChannel r0 = r7.fileChannel     // Catch: java.lang.Throwable -> L1d
            r0.truncate(r8)     // Catch: java.lang.Throwable -> L1d
        L1b:
            monitor-exit(r7)
            return
        L1d:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L1d
            throw r8
    }

    @Override // okio.FileHandle
    protected synchronized long protectedSize() {
            r2 = this;
            monitor-enter(r2)
            java.nio.channels.FileChannel r0 = r2.fileChannel     // Catch: java.lang.Throwable -> L9
            long r0 = r0.size()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // okio.FileHandle
    protected synchronized void protectedWrite(long r2, byte[] r4, int r5, int r6) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)     // Catch: java.lang.Throwable -> L16
            java.nio.channels.FileChannel r0 = r1.fileChannel     // Catch: java.lang.Throwable -> L16
            r0.position(r2)     // Catch: java.lang.Throwable -> L16
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r4, r5, r6)     // Catch: java.lang.Throwable -> L16
            java.nio.channels.FileChannel r3 = r1.fileChannel     // Catch: java.lang.Throwable -> L16
            r3.write(r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r1)
            return
        L16:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
    }
}
