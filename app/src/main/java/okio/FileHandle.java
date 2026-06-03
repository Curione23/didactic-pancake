package okio;

/* JADX INFO: compiled from: FileHandle.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002-.B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0013H$J\b\u0010\u001b\u001a\u00020\u0013H$J(\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH$J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0016H$J\b\u0010$\u001a\u00020\u0016H$J(\u0010%\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH$J&\u0010&\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rJ\u001e\u0010&\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016J \u0010(\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016H\u0002J\u0016\u0010)\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010)\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010*\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u0016J\u0006\u0010#\u001a\u00020\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u0016J&\u0010+\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rJ\u001e\u0010+\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016J \u0010,\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006/"}, d2 = {"Lokio/FileHandle;", "Ljava/io/Closeable;", "Lokio/Closeable;", "readWrite", "", "(Z)V", "closed", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "openStreamCount", "", "getReadWrite", "()Z", "appendingSink", "Lokio/Sink;", "close", "", "flush", "position", "", "sink", "source", "Lokio/Source;", "protectedClose", "protectedFlush", "protectedRead", "fileOffset", "array", "", "arrayOffset", "byteCount", "protectedResize", "size", "protectedSize", "protectedWrite", "read", "Lokio/Buffer;", "readNoCloseCheck", "reposition", "resize", "write", "writeNoCloseCheck", "FileHandleSink", "FileHandleSource", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FileHandle implements java.io.Closeable {
    private boolean closed;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private int openStreamCount;
    private final boolean readWrite;

    /* JADX INFO: compiled from: FileHandle.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lokio/FileHandle$FileHandleSink;", "Lokio/Sink;", "fileHandle", "Lokio/FileHandle;", "position", "", "(Lokio/FileHandle;J)V", "closed", "", "getClosed", "()Z", "setClosed", "(Z)V", "getFileHandle", "()Lokio/FileHandle;", "getPosition", "()J", "setPosition", "(J)V", "close", "", "flush", "timeout", "Lokio/Timeout;", "write", "source", "Lokio/Buffer;", "byteCount", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class FileHandleSink implements okio.Sink {
        private boolean closed;
        private final okio.FileHandle fileHandle;
        private long position;

        public FileHandleSink(okio.FileHandle r2, long r3) {
                r1 = this;
                java.lang.String r0 = "fileHandle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.fileHandle = r2
                r1.position = r3
                return
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                boolean r0 = r3.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.closed = r0
                okio.FileHandle r0 = r3.fileHandle
                java.util.concurrent.locks.ReentrantLock r0 = r0.getLock()
                java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
                r0.lock()
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L3e
                int r2 = okio.FileHandle.access$getOpenStreamCount$p(r1)     // Catch: java.lang.Throwable -> L3e
                int r2 = r2 + (-1)
                okio.FileHandle.access$setOpenStreamCount$p(r1, r2)     // Catch: java.lang.Throwable -> L3e
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L3e
                int r1 = okio.FileHandle.access$getOpenStreamCount$p(r1)     // Catch: java.lang.Throwable -> L3e
                if (r1 != 0) goto L3a
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L3e
                boolean r1 = okio.FileHandle.access$getClosed$p(r1)     // Catch: java.lang.Throwable -> L3e
                if (r1 != 0) goto L2f
                goto L3a
            L2f:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3e
                r0.unlock()
                okio.FileHandle r0 = r3.fileHandle
                r0.protectedClose()
                return
            L3a:
                r0.unlock()
                return
            L3e:
                r1 = move-exception
                r0.unlock()
                throw r1
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
                r2 = this;
                boolean r0 = r2.closed
                if (r0 != 0) goto La
                okio.FileHandle r0 = r2.fileHandle
                r0.protectedFlush()
                return
            La:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "closed"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public final boolean getClosed() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        public final okio.FileHandle getFileHandle() {
                r1 = this;
                okio.FileHandle r0 = r1.fileHandle
                return r0
        }

        public final long getPosition() {
                r2 = this;
                long r0 = r2.position
                return r0
        }

        public final void setClosed(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        public final void setPosition(long r1) {
                r0 = this;
                r0.position = r1
                return
        }

        @Override // okio.Sink
        public okio.Timeout timeout() {
                r1 = this;
                okio.Timeout r0 = okio.Timeout.NONE
                return r0
        }

        @Override // okio.Sink
        public void write(okio.Buffer r8, long r9) {
                r7 = this;
                java.lang.String r0 = "source"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                boolean r0 = r7.closed
                if (r0 != 0) goto L18
                okio.FileHandle r1 = r7.fileHandle
                long r2 = r7.position
                r4 = r8
                r5 = r9
                okio.FileHandle.access$writeNoCloseCheck(r1, r2, r4, r5)
                long r0 = r7.position
                long r0 = r0 + r9
                r7.position = r0
                return
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
        }
    }

    /* JADX INFO: compiled from: FileHandle.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lokio/FileHandle$FileHandleSource;", "Lokio/Source;", "fileHandle", "Lokio/FileHandle;", "position", "", "(Lokio/FileHandle;J)V", "closed", "", "getClosed", "()Z", "setClosed", "(Z)V", "getFileHandle", "()Lokio/FileHandle;", "getPosition", "()J", "setPosition", "(J)V", "close", "", "read", "sink", "Lokio/Buffer;", "byteCount", "timeout", "Lokio/Timeout;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class FileHandleSource implements okio.Source {
        private boolean closed;
        private final okio.FileHandle fileHandle;
        private long position;

        public FileHandleSource(okio.FileHandle r2, long r3) {
                r1 = this;
                java.lang.String r0 = "fileHandle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.fileHandle = r2
                r1.position = r3
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r3 = this;
                boolean r0 = r3.closed
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.closed = r0
                okio.FileHandle r0 = r3.fileHandle
                java.util.concurrent.locks.ReentrantLock r0 = r0.getLock()
                java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
                r0.lock()
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L3e
                int r2 = okio.FileHandle.access$getOpenStreamCount$p(r1)     // Catch: java.lang.Throwable -> L3e
                int r2 = r2 + (-1)
                okio.FileHandle.access$setOpenStreamCount$p(r1, r2)     // Catch: java.lang.Throwable -> L3e
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L3e
                int r1 = okio.FileHandle.access$getOpenStreamCount$p(r1)     // Catch: java.lang.Throwable -> L3e
                if (r1 != 0) goto L3a
                okio.FileHandle r1 = r3.fileHandle     // Catch: java.lang.Throwable -> L3e
                boolean r1 = okio.FileHandle.access$getClosed$p(r1)     // Catch: java.lang.Throwable -> L3e
                if (r1 != 0) goto L2f
                goto L3a
            L2f:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3e
                r0.unlock()
                okio.FileHandle r0 = r3.fileHandle
                r0.protectedClose()
                return
            L3a:
                r0.unlock()
                return
            L3e:
                r1 = move-exception
                r0.unlock()
                throw r1
        }

        public final boolean getClosed() {
                r1 = this;
                boolean r0 = r1.closed
                return r0
        }

        public final okio.FileHandle getFileHandle() {
                r1 = this;
                okio.FileHandle r0 = r1.fileHandle
                return r0
        }

        public final long getPosition() {
                r2 = this;
                long r0 = r2.position
                return r0
        }

        @Override // okio.Source
        public long read(okio.Buffer r8, long r9) {
                r7 = this;
                java.lang.String r0 = "sink"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                boolean r0 = r7.closed
                if (r0 != 0) goto L1f
                okio.FileHandle r1 = r7.fileHandle
                long r2 = r7.position
                r4 = r8
                r5 = r9
                long r8 = okio.FileHandle.access$readNoCloseCheck(r1, r2, r4, r5)
                r0 = -1
                int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r10 == 0) goto L1e
                long r0 = r7.position
                long r0 = r0 + r8
                r7.position = r0
            L1e:
                return r8
            L1f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "closed"
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
        }

        public final void setClosed(boolean r1) {
                r0 = this;
                r0.closed = r1
                return
        }

        public final void setPosition(long r1) {
                r0 = this;
                r0.position = r1
                return
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
                r1 = this;
                okio.Timeout r0 = okio.Timeout.NONE
                return r0
        }
    }

    public FileHandle(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.readWrite = r1
            java.util.concurrent.locks.ReentrantLock r1 = okio._JvmPlatformKt.newLock()
            r0.lock = r1
            return
    }

    public static final /* synthetic */ boolean access$getClosed$p(okio.FileHandle r0) {
            boolean r0 = r0.closed
            return r0
    }

    public static final /* synthetic */ int access$getOpenStreamCount$p(okio.FileHandle r0) {
            int r0 = r0.openStreamCount
            return r0
    }

    public static final /* synthetic */ long access$readNoCloseCheck(okio.FileHandle r0, long r1, okio.Buffer r3, long r4) {
            long r0 = r0.readNoCloseCheck(r1, r3, r4)
            return r0
    }

    public static final /* synthetic */ void access$setOpenStreamCount$p(okio.FileHandle r0, int r1) {
            r0.openStreamCount = r1
            return
    }

    public static final /* synthetic */ void access$writeNoCloseCheck(okio.FileHandle r0, long r1, okio.Buffer r3, long r4) {
            r0.writeNoCloseCheck(r1, r3, r4)
            return
    }

    private final long readNoCloseCheck(long r15, okio.Buffer r17, long r18) {
            r14 = this;
            r0 = r17
            r1 = r18
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L56
            long r1 = r1 + r15
            r9 = r15
        Lc:
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 >= 0) goto L54
            r3 = 1
            okio.Segment r11 = r0.writableSegment$okio(r3)
            byte[] r6 = r11.data
            int r7 = r11.limit
            long r3 = r1 - r9
            int r5 = r11.limit
            int r5 = 8192 - r5
            long r12 = (long) r5
            long r3 = java.lang.Math.min(r3, r12)
            int r8 = (int) r3
            r3 = r14
            r4 = r9
            int r3 = r3.protectedRead(r4, r6, r7, r8)
            r4 = -1
            if (r3 != r4) goto L44
            int r1 = r11.pos
            int r2 = r11.limit
            if (r1 != r2) goto L3d
            okio.Segment r1 = r11.pop()
            r0.head = r1
            okio.SegmentPool.recycle(r11)
        L3d:
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 != 0) goto L54
            r0 = -1
            return r0
        L44:
            int r4 = r11.limit
            int r4 = r4 + r3
            r11.limit = r4
            long r3 = (long) r3
            long r9 = r9 + r3
            long r5 = r17.size()
            long r5 = r5 + r3
            r0.setSize$okio(r5)
            goto Lc
        L54:
            long r9 = r9 - r15
            return r9
        L56:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "byteCount < 0: "
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ okio.Sink sink$default(okio.FileHandle r0, long r1, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Ld
            r3 = r3 & 1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            okio.Sink r0 = r0.sink(r1)
            return r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: sink"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ okio.Source source$default(okio.FileHandle r0, long r1, int r3, java.lang.Object r4) throws java.io.IOException {
            if (r4 != 0) goto Ld
            r3 = r3 & 1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            okio.Source r0 = r0.source(r1)
            return r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: source"
            r0.<init>(r1)
            throw r0
    }

    private final void writeNoCloseCheck(long r9, okio.Buffer r11, long r12) {
            r8 = this;
            long r0 = r11.size()
            r2 = 0
            r4 = r12
            okio.SegmentedByteString.checkOffsetAndCount(r0, r2, r4)
            long r12 = r12 + r9
        Lb:
            int r0 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r0 >= 0) goto L4a
            okio.Segment r6 = r11.head
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            long r0 = r12 - r9
            int r2 = r6.limit
            int r3 = r6.pos
            int r2 = r2 - r3
            long r2 = (long) r2
            long r0 = java.lang.Math.min(r0, r2)
            int r7 = (int) r0
            byte[] r3 = r6.data
            int r4 = r6.pos
            r0 = r8
            r1 = r9
            r5 = r7
            r0.protectedWrite(r1, r3, r4, r5)
            int r0 = r6.pos
            int r0 = r0 + r7
            r6.pos = r0
            long r0 = (long) r7
            long r9 = r9 + r0
            long r2 = r11.size()
            long r2 = r2 - r0
            r11.setSize$okio(r2)
            int r0 = r6.pos
            int r1 = r6.limit
            if (r0 != r1) goto Lb
            okio.Segment r0 = r6.pop()
            r11.head = r0
            okio.SegmentPool.recycle(r6)
            goto Lb
        L4a:
            return
    }

    public final okio.Sink appendingSink() throws java.io.IOException {
            r2 = this;
            long r0 = r2.size()
            okio.Sink r0 = r2.sink(r0)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto Lf
            r0.unlock()
            return
        Lf:
            r1 = 1
            r2.closed = r1     // Catch: java.lang.Throwable -> L23
            int r1 = r2.openStreamCount     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L1a
            r0.unlock()
            return
        L1a:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L23
            r0.unlock()
            r2.protectedClose()
            return
        L23:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public final void flush() throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.readWrite
            if (r0 == 0) goto L29
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            boolean r1 = r3.closed     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L18
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L24
            r0.unlock()
            r3.protectedFlush()
            return
        L18:
            java.lang.String r1 = "closed"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L24
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L24
            throw r2     // Catch: java.lang.Throwable -> L24
        L24:
            r1 = move-exception
            r0.unlock()
            throw r1
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "file handle is read-only"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final java.util.concurrent.locks.ReentrantLock getLock() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            return r0
    }

    public final boolean getReadWrite() {
            r1 = this;
            boolean r0 = r1.readWrite
            return r0
    }

    public final long position(okio.Sink r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5 instanceof okio.RealBufferedSink
            if (r0 == 0) goto L14
            okio.RealBufferedSink r5 = (okio.RealBufferedSink) r5
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            okio.Sink r5 = r5.sink
            goto L16
        L14:
            r0 = 0
        L16:
            boolean r2 = r5 instanceof okio.FileHandle.FileHandleSink
            if (r2 == 0) goto L3d
            r2 = r5
            okio.FileHandle$FileHandleSink r2 = (okio.FileHandle.FileHandleSink) r2
            okio.FileHandle r2 = r2.getFileHandle()
            if (r2 != r4) goto L3d
            okio.FileHandle$FileHandleSink r5 = (okio.FileHandle.FileHandleSink) r5
            boolean r2 = r5.getClosed()
            if (r2 != 0) goto L31
            long r2 = r5.getPosition()
            long r2 = r2 + r0
            return r2
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L3d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "sink was not created by this FileHandle"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    public final long position(okio.Source r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5 instanceof okio.RealBufferedSource
            if (r0 == 0) goto L14
            okio.RealBufferedSource r5 = (okio.RealBufferedSource) r5
            okio.Buffer r0 = r5.bufferField
            long r0 = r0.size()
            okio.Source r5 = r5.source
            goto L16
        L14:
            r0 = 0
        L16:
            boolean r2 = r5 instanceof okio.FileHandle.FileHandleSource
            if (r2 == 0) goto L3d
            r2 = r5
            okio.FileHandle$FileHandleSource r2 = (okio.FileHandle.FileHandleSource) r2
            okio.FileHandle r2 = r2.getFileHandle()
            if (r2 != r4) goto L3d
            okio.FileHandle$FileHandleSource r5 = (okio.FileHandle.FileHandleSource) r5
            boolean r2 = r5.getClosed()
            if (r2 != 0) goto L31
            long r2 = r5.getPosition()
            long r2 = r2 - r0
            return r2
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L3d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "source was not created by this FileHandle"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    protected abstract void protectedClose() throws java.io.IOException;

    protected abstract void protectedFlush() throws java.io.IOException;

    protected abstract int protectedRead(long r1, byte[] r3, int r4, int r5) throws java.io.IOException;

    protected abstract void protectedResize(long r1) throws java.io.IOException;

    protected abstract long protectedSize() throws java.io.IOException;

    protected abstract void protectedWrite(long r1, byte[] r3, int r4, int r5) throws java.io.IOException;

    public final int read(long r3, byte[] r5, int r6, int r7) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L1a
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L26
            r0.unlock()
            int r3 = r2.protectedRead(r3, r5, r6, r7)
            return r3
        L1a:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L26
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L26
            throw r4     // Catch: java.lang.Throwable -> L26
        L26:
            r3 = move-exception
            r0.unlock()
            throw r3
    }

    public final long read(long r3, okio.Buffer r5, long r6) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L1a
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L26
            r0.unlock()
            long r3 = r2.readNoCloseCheck(r3, r5, r6)
            return r3
        L1a:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L26
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L26
            throw r4     // Catch: java.lang.Throwable -> L26
        L26:
            r3 = move-exception
            r0.unlock()
            throw r3
    }

    public final void reposition(okio.Sink r5, long r6) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5 instanceof okio.RealBufferedSink
            java.lang.String r1 = "closed"
            java.lang.String r2 = "sink was not created by this FileHandle"
            if (r0 == 0) goto L41
            okio.RealBufferedSink r5 = (okio.RealBufferedSink) r5
            okio.Sink r0 = r5.sink
            boolean r3 = r0 instanceof okio.FileHandle.FileHandleSink
            if (r3 == 0) goto L37
            r3 = r0
            okio.FileHandle$FileHandleSink r3 = (okio.FileHandle.FileHandleSink) r3
            okio.FileHandle r3 = r3.getFileHandle()
            if (r3 != r4) goto L37
            okio.FileHandle$FileHandleSink r0 = (okio.FileHandle.FileHandleSink) r0
            boolean r2 = r0.getClosed()
            if (r2 != 0) goto L2d
            r5.emit()
            r0.setPosition(r6)
            goto L59
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        L37:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r2.toString()
            r5.<init>(r6)
            throw r5
        L41:
            boolean r0 = r5 instanceof okio.FileHandle.FileHandleSink
            if (r0 == 0) goto L64
            r0 = r5
            okio.FileHandle$FileHandleSink r0 = (okio.FileHandle.FileHandleSink) r0
            okio.FileHandle r0 = r0.getFileHandle()
            if (r0 != r4) goto L64
            okio.FileHandle$FileHandleSink r5 = (okio.FileHandle.FileHandleSink) r5
            boolean r0 = r5.getClosed()
            if (r0 != 0) goto L5a
            r5.setPosition(r6)
        L59:
            return
        L5a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        L64:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r2.toString()
            r5.<init>(r6)
            throw r5
    }

    public final void reposition(okio.Source r8, long r9) throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r8 instanceof okio.RealBufferedSource
            java.lang.String r1 = "closed"
            java.lang.String r2 = "source was not created by this FileHandle"
            if (r0 == 0) goto L5e
            okio.RealBufferedSource r8 = (okio.RealBufferedSource) r8
            okio.Source r0 = r8.source
            boolean r3 = r0 instanceof okio.FileHandle.FileHandleSource
            if (r3 == 0) goto L54
            r3 = r0
            okio.FileHandle$FileHandleSource r3 = (okio.FileHandle.FileHandleSource) r3
            okio.FileHandle r3 = r3.getFileHandle()
            if (r3 != r7) goto L54
            okio.FileHandle$FileHandleSource r0 = (okio.FileHandle.FileHandleSource) r0
            boolean r2 = r0.getClosed()
            if (r2 != 0) goto L4a
            okio.Buffer r1 = r8.bufferField
            long r1 = r1.size()
            long r3 = r0.getPosition()
            long r3 = r3 - r1
            long r3 = r9 - r3
            r5 = 0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 > 0) goto L41
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L41
            r8.skip(r3)
            goto L76
        L41:
            okio.Buffer r8 = r8.bufferField
            r8.clear()
            r0.setPosition(r9)
            goto L76
        L4a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        L54:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r2.toString()
            r8.<init>(r9)
            throw r8
        L5e:
            boolean r0 = r8 instanceof okio.FileHandle.FileHandleSource
            if (r0 == 0) goto L81
            r0 = r8
            okio.FileHandle$FileHandleSource r0 = (okio.FileHandle.FileHandleSource) r0
            okio.FileHandle r0 = r0.getFileHandle()
            if (r0 != r7) goto L81
            okio.FileHandle$FileHandleSource r8 = (okio.FileHandle.FileHandleSource) r8
            boolean r0 = r8.getClosed()
            if (r0 != 0) goto L77
            r8.setPosition(r9)
        L76:
            return
        L77:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        L81:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r2.toString()
            r8.<init>(r9)
            throw r8
    }

    public final void resize(long r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.readWrite
            if (r0 == 0) goto L29
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L18
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L24
            r0.unlock()
            r2.protectedResize(r3)
            return
        L18:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L24
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L24
            throw r4     // Catch: java.lang.Throwable -> L24
        L24:
            r3 = move-exception
            r0.unlock()
            throw r3
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "file handle is read-only"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public final okio.Sink sink(long r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.readWrite
            if (r0 == 0) goto L31
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L20
            int r1 = r2.openStreamCount     // Catch: java.lang.Throwable -> L2c
            int r1 = r1 + 1
            r2.openStreamCount = r1     // Catch: java.lang.Throwable -> L2c
            r0.unlock()
            okio.FileHandle$FileHandleSink r0 = new okio.FileHandle$FileHandleSink
            r0.<init>(r2, r3)
            okio.Sink r0 = (okio.Sink) r0
            return r0
        L20:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2c
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L2c
            throw r4     // Catch: java.lang.Throwable -> L2c
        L2c:
            r3 = move-exception
            r0.unlock()
            throw r3
        L31:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "file handle is read-only"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public final long size() throws java.io.IOException {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            boolean r1 = r3.closed     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L15
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L21
            r0.unlock()
            long r0 = r3.protectedSize()
            return r0
        L15:
            java.lang.String r1 = "closed"
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L21
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L21
            throw r2     // Catch: java.lang.Throwable -> L21
        L21:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    public final okio.Source source(long r3) throws java.io.IOException {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L1c
            int r1 = r2.openStreamCount     // Catch: java.lang.Throwable -> L28
            int r1 = r1 + 1
            r2.openStreamCount = r1     // Catch: java.lang.Throwable -> L28
            r0.unlock()
            okio.FileHandle$FileHandleSource r0 = new okio.FileHandle$FileHandleSource
            r0.<init>(r2, r3)
            okio.Source r0 = (okio.Source) r0
            return r0
        L1c:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L28
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L28
            throw r4     // Catch: java.lang.Throwable -> L28
        L28:
            r3 = move-exception
            r0.unlock()
            throw r3
    }

    public final void write(long r3, okio.Buffer r5, long r6) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r2.readWrite
            if (r0 == 0) goto L2e
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L1d
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L29
            r0.unlock()
            r2.writeNoCloseCheck(r3, r5, r6)
            return
        L1d:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L29
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L29
            throw r4     // Catch: java.lang.Throwable -> L29
        L29:
            r3 = move-exception
            r0.unlock()
            throw r3
        L2e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "file handle is read-only"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public final void write(long r3, byte[] r5, int r6, int r7) {
            r2 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r2.readWrite
            if (r0 == 0) goto L2e
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            boolean r1 = r2.closed     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L1d
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L29
            r0.unlock()
            r2.protectedWrite(r3, r5, r6, r7)
            return
        L1d:
            java.lang.String r3 = "closed"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L29
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L29
            throw r4     // Catch: java.lang.Throwable -> L29
        L29:
            r3 = move-exception
            r0.unlock()
            throw r3
        L2e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "file handle is read-only"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }
}
