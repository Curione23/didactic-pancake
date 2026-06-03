package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class QueueInputStream extends java.io.InputStream {
    private final java.util.concurrent.BlockingQueue<java.lang.Integer> blockingQueue;
    private final long timeoutNanos;

    /* JADX INFO: renamed from: org.apache.commons.io.input.QueueInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.QueueInputStream, org.apache.commons.io.input.QueueInputStream.Builder> {
        private java.util.concurrent.BlockingQueue<java.lang.Integer> blockingQueue;
        private java.time.Duration timeout;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
                r0.<init>()
                r1.blockingQueue = r0
                java.time.Duration r0 = java.time.Duration.ZERO
                r1.timeout = r0
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.QueueInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.QueueInputStream get() {
                r4 = this;
                org.apache.commons.io.input.QueueInputStream r0 = new org.apache.commons.io.input.QueueInputStream
                java.util.concurrent.BlockingQueue<java.lang.Integer> r1 = r4.blockingQueue
                java.time.Duration r2 = r4.timeout
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public org.apache.commons.io.input.QueueInputStream.Builder setBlockingQueue(java.util.concurrent.BlockingQueue<java.lang.Integer> r1) {
                r0 = this;
                if (r1 == 0) goto L3
                goto L8
            L3:
                java.util.concurrent.LinkedBlockingQueue r1 = new java.util.concurrent.LinkedBlockingQueue
                r1.<init>()
            L8:
                r0.blockingQueue = r1
                return r0
        }

        public org.apache.commons.io.input.QueueInputStream.Builder setTimeout(java.time.Duration r5) {
                r4 = this;
                if (r5 == 0) goto L15
                long r0 = r5.toNanos()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto Ld
                goto L15
            Ld:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "timeout must not be negative"
                r5.<init>(r0)
                throw r5
            L15:
                if (r5 == 0) goto L18
                goto L1a
            L18:
                java.time.Duration r5 = java.time.Duration.ZERO
            L1a:
                r4.timeout = r5
                return r4
        }
    }

    public QueueInputStream() {
            r1 = this;
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r1.<init>(r0)
            return
    }

    @java.lang.Deprecated
    public QueueInputStream(java.util.concurrent.BlockingQueue<java.lang.Integer> r2) {
            r1 = this;
            java.time.Duration r0 = java.time.Duration.ZERO
            r1.<init>(r2, r0)
            return
    }

    private QueueInputStream(java.util.concurrent.BlockingQueue<java.lang.Integer> r2, java.time.Duration r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "blockingQueue"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.util.concurrent.BlockingQueue r2 = (java.util.concurrent.BlockingQueue) r2
            r1.blockingQueue = r2
            java.lang.String r2 = "timeout"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r3, r2)
            java.time.Duration r2 = (java.time.Duration) r2
            long r2 = r2.toNanos()
            r1.timeoutNanos = r2
            return
    }

    /* synthetic */ QueueInputStream(java.util.concurrent.BlockingQueue r1, java.time.Duration r2, org.apache.commons.io.input.QueueInputStream.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.apache.commons.io.input.QueueInputStream.Builder builder() {
            org.apache.commons.io.input.QueueInputStream$Builder r0 = new org.apache.commons.io.input.QueueInputStream$Builder
            r0.<init>()
            return r0
    }

    java.util.concurrent.BlockingQueue<java.lang.Integer> getBlockingQueue() {
            r1 = this;
            java.util.concurrent.BlockingQueue<java.lang.Integer> r0 = r1.blockingQueue
            return r0
    }

    java.time.Duration getTimeout() {
            r2 = this;
            long r0 = r2.timeoutNanos
            java.time.Duration r0 = java.time.Duration.ofNanos(r0)
            return r0
    }

    public org.apache.commons.io.output.QueueOutputStream newQueueOutputStream() {
            r2 = this;
            org.apache.commons.io.output.QueueOutputStream r0 = new org.apache.commons.io.output.QueueOutputStream
            java.util.concurrent.BlockingQueue<java.lang.Integer> r1 = r2.blockingQueue
            r0.<init>(r1)
            return r0
    }

    @Override // java.io.InputStream
    public int read() {
            r4 = this;
            java.util.concurrent.BlockingQueue<java.lang.Integer> r0 = r4.blockingQueue     // Catch: java.lang.InterruptedException -> L17
            long r1 = r4.timeoutNanos     // Catch: java.lang.InterruptedException -> L17
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.InterruptedException -> L17
            java.lang.Object r0 = r0.poll(r1, r3)     // Catch: java.lang.InterruptedException -> L17
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.InterruptedException -> L17
            if (r0 != 0) goto L10
            r0 = -1
            goto L16
        L10:
            int r0 = r0.intValue()     // Catch: java.lang.InterruptedException -> L17
            r0 = r0 & 255(0xff, float:3.57E-43)
        L16:
            return r0
        L17:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }
}
