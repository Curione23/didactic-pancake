package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class ReadAheadInputStream extends java.io.FilterInputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.ThreadLocal<byte[]> BYTE_ARRAY_1 = null;
    private java.nio.ByteBuffer activeBuffer;
    private final java.util.concurrent.locks.Condition asyncReadComplete;
    private boolean endOfStream;
    private final java.util.concurrent.ExecutorService executorService;
    private boolean isClosed;
    private boolean isReading;
    private boolean isUnderlyingInputStreamBeingClosed;
    private final java.util.concurrent.atomic.AtomicBoolean isWaiting;
    private boolean readAborted;
    private java.nio.ByteBuffer readAheadBuffer;
    private java.lang.Throwable readException;
    private boolean readInProgress;
    private final boolean shutdownExecutorService;
    private final java.util.concurrent.locks.ReentrantLock stateChangeLock;

    /* JADX INFO: renamed from: org.apache.commons.io.input.ReadAheadInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.ReadAheadInputStream, org.apache.commons.io.input.ReadAheadInputStream.Builder> {
        private java.util.concurrent.ExecutorService executorService;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.ReadAheadInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.ReadAheadInputStream get() throws java.io.IOException {
                r7 = this;
                org.apache.commons.io.input.ReadAheadInputStream r6 = new org.apache.commons.io.input.ReadAheadInputStream
                java.io.InputStream r1 = r7.getInputStream()
                int r2 = r7.getBufferSize()
                java.util.concurrent.ExecutorService r0 = r7.executorService
                if (r0 == 0) goto Lf
                goto L13
            Lf:
                java.util.concurrent.ExecutorService r0 = org.apache.commons.io.input.ReadAheadInputStream.access$000()
            L13:
                r3 = r0
                java.util.concurrent.ExecutorService r0 = r7.executorService
                if (r0 != 0) goto L1a
                r0 = 1
                goto L1b
            L1a:
                r0 = 0
            L1b:
                r4 = r0
                r5 = 0
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        public org.apache.commons.io.input.ReadAheadInputStream.Builder setExecutorService(java.util.concurrent.ExecutorService r1) {
                r0 = this;
                r0.executorService = r1
                return r0
        }
    }

    public static /* synthetic */ java.lang.Thread $r8$lambda$cP932H2nA4Uo10rUydLTRzAUSL0(java.lang.Runnable r0) {
            java.lang.Thread r0 = newDaemonThread(r0)
            return r0
    }

    static {
            org.apache.commons.io.input.ReadAheadInputStream$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.input.ReadAheadInputStream$$ExternalSyntheticLambda2
            r0.<init>()
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            org.apache.commons.io.input.ReadAheadInputStream.BYTE_ARRAY_1 = r0
            return
    }

    @java.lang.Deprecated
    public ReadAheadInputStream(java.io.InputStream r3, int r4) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = newExecutorService()
            r1 = 1
            r2.<init>(r3, r4, r0, r1)
            return
    }

    @java.lang.Deprecated
    public ReadAheadInputStream(java.io.InputStream r2, int r3, java.util.concurrent.ExecutorService r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    private ReadAheadInputStream(java.io.InputStream r2, int r3, java.util.concurrent.ExecutorService r4, boolean r5) {
            r1 = this;
            java.lang.String r0 = "inputStream"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.io.InputStream r2 = (java.io.InputStream) r2
            r1.<init>(r2)
            java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
            r2.<init>()
            r1.stateChangeLock = r2
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.isWaiting = r0
            java.util.concurrent.locks.Condition r2 = r2.newCondition()
            r1.asyncReadComplete = r2
            if (r3 <= 0) goto L44
            java.lang.String r2 = "executorService"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r4, r2)
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2
            r1.executorService = r2
            r1.shutdownExecutorService = r5
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r3)
            r1.activeBuffer = r2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r3)
            r1.readAheadBuffer = r2
            java.nio.ByteBuffer r2 = r1.activeBuffer
            r2.flip()
            java.nio.ByteBuffer r2 = r1.readAheadBuffer
            r2.flip()
            return
        L44:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "bufferSizeInBytes should be greater than 0, but the value is "
            r4.<init>(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    /* synthetic */ ReadAheadInputStream(java.io.InputStream r1, int r2, java.util.concurrent.ExecutorService r3, boolean r4, org.apache.commons.io.input.ReadAheadInputStream.AnonymousClass1 r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ java.util.concurrent.ExecutorService access$000() {
            java.util.concurrent.ExecutorService r0 = newExecutorService()
            return r0
    }

    public static org.apache.commons.io.input.ReadAheadInputStream.Builder builder() {
            org.apache.commons.io.input.ReadAheadInputStream$Builder r0 = new org.apache.commons.io.input.ReadAheadInputStream$Builder
            r0.<init>()
            return r0
    }

    private void checkReadException() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.readAborted
            if (r0 == 0) goto L15
            java.lang.Throwable r0 = r2.readException
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 == 0) goto Ld
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
        Ld:
            java.io.IOException r0 = new java.io.IOException
            java.lang.Throwable r1 = r2.readException
            r0.<init>(r1)
            throw r0
        L15:
            return
    }

    private void closeUnderlyingInputStreamIfNecessary() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.stateChangeLock
            r0.lock()
            r0 = 0
            r2.isReading = r0     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r2.isClosed     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L11
            boolean r1 = r2.isUnderlyingInputStreamBeingClosed     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L11
            r0 = 1
        L11:
            java.util.concurrent.locks.ReentrantLock r1 = r2.stateChangeLock
            r1.unlock()
            if (r0 == 0) goto L1b
            super.close()     // Catch: java.io.IOException -> L1b
        L1b:
            return
        L1c:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r2.stateChangeLock
            r1.unlock()
            throw r0
    }

    private boolean isEndOfStream() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.activeBuffer
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L16
            java.nio.ByteBuffer r0 = r1.readAheadBuffer
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L16
            boolean r0 = r1.endOfStream
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    static /* synthetic */ byte[] lambda$static$0() {
            r0 = 1
            byte[] r0 = new byte[r0]
            return r0
    }

    private static java.lang.Thread newDaemonThread(java.lang.Runnable r2) {
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.String r1 = "commons-io-read-ahead"
            r0.<init>(r2, r1)
            r2 = 1
            r0.setDaemon(r2)
            return r0
    }

    private static java.util.concurrent.ExecutorService newExecutorService() {
            org.apache.commons.io.input.ReadAheadInputStream$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.input.ReadAheadInputStream$$ExternalSyntheticLambda1
            r0.<init>()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            return r0
    }

    private void readAsync() throws java.io.IOException {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.stateChangeLock
            r0.lock()
            java.nio.ByteBuffer r0 = r3.readAheadBuffer     // Catch: java.lang.Throwable -> L3b
            byte[] r0 = r0.array()     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r3.endOfStream     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L35
            boolean r1 = r3.readInProgress     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L14
            goto L35
        L14:
            r3.checkReadException()     // Catch: java.lang.Throwable -> L3b
            java.nio.ByteBuffer r1 = r3.readAheadBuffer     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            r1.position(r2)     // Catch: java.lang.Throwable -> L3b
            java.nio.ByteBuffer r1 = r3.readAheadBuffer     // Catch: java.lang.Throwable -> L3b
            r1.flip()     // Catch: java.lang.Throwable -> L3b
            r1 = 1
            r3.readInProgress = r1     // Catch: java.lang.Throwable -> L3b
            java.util.concurrent.locks.ReentrantLock r1 = r3.stateChangeLock
            r1.unlock()
            java.util.concurrent.ExecutorService r1 = r3.executorService
            org.apache.commons.io.input.ReadAheadInputStream$$ExternalSyntheticLambda0 r2 = new org.apache.commons.io.input.ReadAheadInputStream$$ExternalSyntheticLambda0
            r2.<init>(r3, r0)
            r1.execute(r2)
            return
        L35:
            java.util.concurrent.locks.ReentrantLock r0 = r3.stateChangeLock
            r0.unlock()
            return
        L3b:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r3.stateChangeLock
            r1.unlock()
            throw r0
    }

    private void signalAsyncReadComplete() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.stateChangeLock
            r0.lock()
            java.util.concurrent.locks.Condition r0 = r2.asyncReadComplete     // Catch: java.lang.Throwable -> L10
            r0.signalAll()     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.locks.ReentrantLock r0 = r2.stateChangeLock
            r0.unlock()
            return
        L10:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r2.stateChangeLock
            r1.unlock()
            throw r0
    }

    private long skipInternal(long r5) throws java.io.IOException {
            r4 = this;
            r4.waitForAsyncReadComplete()
            boolean r0 = r4.isEndOfStream()
            if (r0 == 0) goto Lc
            r5 = 0
            return r5
        Lc:
            int r0 = r4.available()
            long r0 = (long) r0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L39
            int r0 = (int) r5
            java.nio.ByteBuffer r2 = r4.activeBuffer
            int r2 = r2.remaining()
            int r0 = r0 - r2
            java.nio.ByteBuffer r2 = r4.activeBuffer
            r2.position(r1)
            java.nio.ByteBuffer r1 = r4.activeBuffer
            r1.flip()
            java.nio.ByteBuffer r1 = r4.readAheadBuffer
            int r2 = r1.position()
            int r0 = r0 + r2
            r1.position(r0)
            r4.swapBuffers()
            r4.readAsync()
            return r5
        L39:
            int r0 = r4.available()
            long r2 = (long) r0
            long r5 = r5 - r2
            java.nio.ByteBuffer r0 = r4.activeBuffer
            r0.position(r1)
            java.nio.ByteBuffer r0 = r4.activeBuffer
            r0.flip()
            java.nio.ByteBuffer r0 = r4.readAheadBuffer
            r0.position(r1)
            java.nio.ByteBuffer r0 = r4.readAheadBuffer
            r0.flip()
            java.io.InputStream r0 = r4.in
            long r5 = r0.skip(r5)
            r4.readAsync()
            long r2 = r2 + r5
            return r2
    }

    private void swapBuffers() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.activeBuffer
            java.nio.ByteBuffer r1 = r2.readAheadBuffer
            r2.activeBuffer = r1
            r2.readAheadBuffer = r0
            return
    }

    private void waitForAsyncReadComplete() throws java.io.IOException {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.stateChangeLock
            r0.lock()
            r0 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.isWaiting     // Catch: java.lang.Throwable -> L2b java.lang.InterruptedException -> L2d
            r2 = 1
            r1.set(r2)     // Catch: java.lang.Throwable -> L2b java.lang.InterruptedException -> L2d
        Lc:
            boolean r1 = r4.readInProgress     // Catch: java.lang.Throwable -> L2b java.lang.InterruptedException -> L2d
            if (r1 == 0) goto L16
            java.util.concurrent.locks.Condition r1 = r4.asyncReadComplete     // Catch: java.lang.Throwable -> L2b java.lang.InterruptedException -> L2d
            r1.await()     // Catch: java.lang.Throwable -> L2b java.lang.InterruptedException -> L2d
            goto Lc
        L16:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.isWaiting     // Catch: java.lang.Throwable -> L24
            r1.set(r0)     // Catch: java.lang.Throwable -> L24
            java.util.concurrent.locks.ReentrantLock r0 = r4.stateChangeLock
            r0.unlock()
            r4.checkReadException()
            return
        L24:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r4.stateChangeLock
            r1.unlock()
            throw r0
        L2b:
            r1 = move-exception
            goto L3b
        L2d:
            r1 = move-exception
            java.io.InterruptedIOException r2 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            r2.initCause(r1)     // Catch: java.lang.Throwable -> L2b
            throw r2     // Catch: java.lang.Throwable -> L2b
        L3b:
            java.util.concurrent.atomic.AtomicBoolean r2 = r4.isWaiting     // Catch: java.lang.Throwable -> L46
            r2.set(r0)     // Catch: java.lang.Throwable -> L46
            java.util.concurrent.locks.ReentrantLock r0 = r4.stateChangeLock
            r0.unlock()
            throw r1
        L46:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r4.stateChangeLock
            r1.unlock()
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.stateChangeLock
            r0.lock()
            java.nio.ByteBuffer r0 = r4.activeBuffer     // Catch: java.lang.Throwable -> L22
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L22
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L22
            java.nio.ByteBuffer r2 = r4.readAheadBuffer     // Catch: java.lang.Throwable -> L22
            int r2 = r2.remaining()     // Catch: java.lang.Throwable -> L22
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L22
            long r0 = r0 + r2
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L22
            int r0 = (int) r0
            java.util.concurrent.locks.ReentrantLock r1 = r4.stateChangeLock
            r1.unlock()
            return r0
        L22:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r4.stateChangeLock
            r1.unlock()
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.stateChangeLock
            r0.lock()
            boolean r0 = r5.isClosed     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto Lf
            java.util.concurrent.locks.ReentrantLock r0 = r5.stateChangeLock
            r0.unlock()
            return
        Lf:
            r0 = 1
            r5.isClosed = r0     // Catch: java.lang.Throwable -> L51
            boolean r1 = r5.isReading     // Catch: java.lang.Throwable -> L51
            if (r1 != 0) goto L19
            r5.isUnderlyingInputStreamBeingClosed = r0     // Catch: java.lang.Throwable -> L51
            goto L1a
        L19:
            r0 = 0
        L1a:
            java.util.concurrent.locks.ReentrantLock r1 = r5.stateChangeLock
            r1.unlock()
            boolean r1 = r5.shutdownExecutorService
            if (r1 == 0) goto L50
            java.util.concurrent.ExecutorService r1 = r5.executorService     // Catch: java.lang.Throwable -> L3a java.lang.InterruptedException -> L3c
            r1.shutdownNow()     // Catch: java.lang.Throwable -> L3a java.lang.InterruptedException -> L3c
            java.util.concurrent.ExecutorService r1 = r5.executorService     // Catch: java.lang.Throwable -> L3a java.lang.InterruptedException -> L3c
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L3a java.lang.InterruptedException -> L3c
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1.awaitTermination(r3, r2)     // Catch: java.lang.Throwable -> L3a java.lang.InterruptedException -> L3c
            if (r0 == 0) goto L50
            super.close()
            goto L50
        L3a:
            r1 = move-exception
            goto L4a
        L3c:
            r1 = move-exception
            java.io.InterruptedIOException r2 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = r1.getMessage()     // Catch: java.lang.Throwable -> L3a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            r2.initCause(r1)     // Catch: java.lang.Throwable -> L3a
            throw r2     // Catch: java.lang.Throwable -> L3a
        L4a:
            if (r0 == 0) goto L4f
            super.close()
        L4f:
            throw r1
        L50:
            return
        L51:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r5.stateChangeLock
            r1.unlock()
            throw r0
    }

    /* JADX INFO: renamed from: lambda$readAsync$1$org-apache-commons-io-input-ReadAheadInputStream, reason: not valid java name */
    /* synthetic */ void m2606x982106fc(byte[] r7) {
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r6.stateChangeLock
            r0.lock()
            boolean r0 = r6.isClosed     // Catch: java.lang.Throwable -> Lb1
            r1 = 0
            if (r0 == 0) goto L12
            r6.readInProgress = r1     // Catch: java.lang.Throwable -> Lb1
            java.util.concurrent.locks.ReentrantLock r7 = r6.stateChangeLock
            r7.unlock()
            return
        L12:
            r0 = 1
            r6.isReading = r0     // Catch: java.lang.Throwable -> Lb1
            java.util.concurrent.locks.ReentrantLock r2 = r6.stateChangeLock
            r2.unlock()
            int r2 = r7.length
            r3 = r1
            r4 = r3
        L1d:
            java.io.InputStream r5 = r6.in     // Catch: java.lang.Throwable -> L4e
            int r4 = r5.read(r7, r3, r2)     // Catch: java.lang.Throwable -> L4e
            if (r4 > 0) goto L26
            goto L32
        L26:
            int r3 = r3 + r4
            int r2 = r2 - r4
            if (r2 <= 0) goto L32
            java.util.concurrent.atomic.AtomicBoolean r5 = r6.isWaiting     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L1d
        L32:
            java.util.concurrent.locks.ReentrantLock r7 = r6.stateChangeLock
            r7.lock()
            java.nio.ByteBuffer r7 = r6.readAheadBuffer     // Catch: java.lang.Throwable -> L47
            r7.limit(r3)     // Catch: java.lang.Throwable -> L47
            if (r4 < 0) goto L3f
            goto L41
        L3f:
            r6.endOfStream = r0     // Catch: java.lang.Throwable -> L47
        L41:
            r6.readInProgress = r1     // Catch: java.lang.Throwable -> L47
            r6.signalAsyncReadComplete()     // Catch: java.lang.Throwable -> L47
            goto L70
        L47:
            r7 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r6.stateChangeLock
            r0.unlock()
            throw r7
        L4e:
            r7 = move-exception
            boolean r2 = r7 instanceof java.lang.Error     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L80
            java.util.concurrent.locks.ReentrantLock r2 = r6.stateChangeLock
            r2.lock()
            java.nio.ByteBuffer r2 = r6.readAheadBuffer     // Catch: java.lang.Throwable -> L79
            r2.limit(r3)     // Catch: java.lang.Throwable -> L79
            if (r4 < 0) goto L69
            boolean r2 = r7 instanceof java.io.EOFException     // Catch: java.lang.Throwable -> L79
            if (r2 == 0) goto L64
            goto L69
        L64:
            r6.readAborted = r0     // Catch: java.lang.Throwable -> L79
            r6.readException = r7     // Catch: java.lang.Throwable -> L79
            goto L6b
        L69:
            r6.endOfStream = r0     // Catch: java.lang.Throwable -> L79
        L6b:
            r6.readInProgress = r1     // Catch: java.lang.Throwable -> L79
            r6.signalAsyncReadComplete()     // Catch: java.lang.Throwable -> L79
        L70:
            java.util.concurrent.locks.ReentrantLock r7 = r6.stateChangeLock
            r7.unlock()
            r6.closeUnderlyingInputStreamIfNecessary()
            return
        L79:
            r7 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r6.stateChangeLock
            r0.unlock()
            throw r7
        L80:
            r2 = r7
            java.lang.Error r2 = (java.lang.Error) r2     // Catch: java.lang.Throwable -> L84
            throw r2     // Catch: java.lang.Throwable -> L84
        L84:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantLock r5 = r6.stateChangeLock
            r5.lock()
            java.nio.ByteBuffer r5 = r6.readAheadBuffer     // Catch: java.lang.Throwable -> Laa
            r5.limit(r3)     // Catch: java.lang.Throwable -> Laa
            if (r4 < 0) goto L9a
            boolean r3 = r7 instanceof java.io.EOFException     // Catch: java.lang.Throwable -> Laa
            if (r3 != 0) goto L9a
            r6.readAborted = r0     // Catch: java.lang.Throwable -> Laa
            r6.readException = r7     // Catch: java.lang.Throwable -> Laa
            goto L9c
        L9a:
            r6.endOfStream = r0     // Catch: java.lang.Throwable -> Laa
        L9c:
            r6.readInProgress = r1     // Catch: java.lang.Throwable -> Laa
            r6.signalAsyncReadComplete()     // Catch: java.lang.Throwable -> Laa
            java.util.concurrent.locks.ReentrantLock r7 = r6.stateChangeLock
            r7.unlock()
            r6.closeUnderlyingInputStreamIfNecessary()
            throw r2
        Laa:
            r7 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r6.stateChangeLock
            r0.unlock()
            throw r7
        Lb1:
            r7 = move-exception
            java.util.concurrent.locks.ReentrantLock r0 = r6.stateChangeLock
            r0.unlock()
            throw r7
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r4 = this;
            java.nio.ByteBuffer r0 = r4.activeBuffer
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L11
            java.nio.ByteBuffer r0 = r4.activeBuffer
            byte r0 = r0.get()
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        L11:
            java.lang.ThreadLocal<byte[]> r0 = org.apache.commons.io.input.ReadAheadInputStream.BYTE_ARRAY_1
            java.lang.Object r0 = r0.get()
            byte[] r0 = (byte[]) r0
            r1 = 0
            r0[r1] = r1
            r2 = 1
            int r2 = r4.read(r0, r1, r2)
            r3 = -1
            if (r2 != r3) goto L25
            goto L29
        L25:
            r0 = r0[r1]
            r3 = r0 & 255(0xff, float:3.57E-43)
        L29:
            return r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            if (r3 < 0) goto L5a
            if (r4 < 0) goto L5a
            int r0 = r2.length
            int r0 = r0 - r3
            if (r4 > r0) goto L5a
            if (r4 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.nio.ByteBuffer r0 = r1.activeBuffer
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L4a
            java.util.concurrent.locks.ReentrantLock r0 = r1.stateChangeLock
            r0.lock()
            r1.waitForAsyncReadComplete()     // Catch: java.lang.Throwable -> L43
            java.nio.ByteBuffer r0 = r1.readAheadBuffer     // Catch: java.lang.Throwable -> L43
            boolean r0 = r0.hasRemaining()     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L37
            r1.readAsync()     // Catch: java.lang.Throwable -> L43
            r1.waitForAsyncReadComplete()     // Catch: java.lang.Throwable -> L43
            boolean r0 = r1.isEndOfStream()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L37
            java.util.concurrent.locks.ReentrantLock r2 = r1.stateChangeLock
            r2.unlock()
            r2 = -1
            return r2
        L37:
            r1.swapBuffers()     // Catch: java.lang.Throwable -> L43
            r1.readAsync()     // Catch: java.lang.Throwable -> L43
            java.util.concurrent.locks.ReentrantLock r0 = r1.stateChangeLock
            r0.unlock()
            goto L4a
        L43:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantLock r3 = r1.stateChangeLock
            r3.unlock()
            throw r2
        L4a:
            java.nio.ByteBuffer r0 = r1.activeBuffer
            int r0 = r0.remaining()
            int r4 = java.lang.Math.min(r4, r0)
            java.nio.ByteBuffer r0 = r1.activeBuffer
            r0.get(r2, r3, r4)
            return r4
        L5a:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            return r0
        L7:
            java.nio.ByteBuffer r0 = r3.activeBuffer
            int r0 = r0.remaining()
            long r0 = (long) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L1e
            java.nio.ByteBuffer r0 = r3.activeBuffer
            int r1 = (int) r4
            int r2 = r0.position()
            int r1 = r1 + r2
            r0.position(r1)
            return r4
        L1e:
            java.util.concurrent.locks.ReentrantLock r0 = r3.stateChangeLock
            r0.lock()
            long r4 = r3.skipInternal(r4)     // Catch: java.lang.Throwable -> L2d
            java.util.concurrent.locks.ReentrantLock r0 = r3.stateChangeLock
            r0.unlock()
            return r4
        L2d:
            r4 = move-exception
            java.util.concurrent.locks.ReentrantLock r5 = r3.stateChangeLock
            r5.unlock()
            throw r4
    }
}
