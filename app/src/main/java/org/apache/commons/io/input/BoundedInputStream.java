package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class BoundedInputStream extends org.apache.commons.io.input.ProxyInputStream {
    private long count;
    private long mark;
    private final long maxCount;
    private boolean propagateClose;

    static abstract class AbstractBuilder<T extends org.apache.commons.io.input.BoundedInputStream.AbstractBuilder<T>> extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.BoundedInputStream, T> {
        private long count;
        private long maxCount;
        private boolean propagateClose;

        AbstractBuilder() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.maxCount = r0
                r0 = 1
                r2.propagateClose = r0
                return
        }

        long getCount() {
                r2 = this;
                long r0 = r2.count
                return r0
        }

        long getMaxCount() {
                r2 = this;
                long r0 = r2.maxCount
                return r0
        }

        boolean isPropagateClose() {
                r1 = this;
                boolean r0 = r1.propagateClose
                return r0
        }

        public T setCount(long r3) {
                r2 = this;
                r0 = 0
                long r3 = java.lang.Math.max(r0, r3)
                r2.count = r3
                org.apache.commons.io.build.AbstractSupplier r3 = r2.asThis()
                org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r3 = (org.apache.commons.io.input.BoundedInputStream.AbstractBuilder) r3
                return r3
        }

        public T setMaxCount(long r3) {
                r2 = this;
                r0 = -1
                long r3 = java.lang.Math.max(r0, r3)
                r2.maxCount = r3
                org.apache.commons.io.build.AbstractSupplier r3 = r2.asThis()
                org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r3 = (org.apache.commons.io.input.BoundedInputStream.AbstractBuilder) r3
                return r3
        }

        public T setPropagateClose(boolean r1) {
                r0 = this;
                r0.propagateClose = r1
                org.apache.commons.io.build.AbstractSupplier r1 = r0.asThis()
                org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r1 = (org.apache.commons.io.input.BoundedInputStream.AbstractBuilder) r1
                return r1
        }
    }

    public static class Builder extends org.apache.commons.io.input.BoundedInputStream.AbstractBuilder<org.apache.commons.io.input.BoundedInputStream.Builder> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.BoundedInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.BoundedInputStream get() throws java.io.IOException {
                r8 = this;
                org.apache.commons.io.input.BoundedInputStream r7 = new org.apache.commons.io.input.BoundedInputStream
                java.io.InputStream r1 = r8.getInputStream()
                long r2 = r8.getCount()
                long r4 = r8.getMaxCount()
                boolean r6 = r8.isPropagateClose()
                r0 = r7
                r0.<init>(r1, r2, r4, r6)
                return r7
        }

        @Override // org.apache.commons.io.input.BoundedInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ org.apache.commons.io.input.BoundedInputStream.AbstractBuilder setCount(long r1) {
                r0 = this;
                org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r1 = super.setCount(r1)
                return r1
        }

        @Override // org.apache.commons.io.input.BoundedInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ org.apache.commons.io.input.BoundedInputStream.AbstractBuilder setMaxCount(long r1) {
                r0 = this;
                org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r1 = super.setMaxCount(r1)
                return r1
        }

        @Override // org.apache.commons.io.input.BoundedInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ org.apache.commons.io.input.BoundedInputStream.AbstractBuilder setPropagateClose(boolean r1) {
                r0 = this;
                org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r1 = super.setPropagateClose(r1)
                return r1
        }
    }

    @java.lang.Deprecated
    public BoundedInputStream(java.io.InputStream r3) {
            r2 = this;
            r0 = -1
            r2.<init>(r3, r0)
            return
    }

    @java.lang.Deprecated
    public BoundedInputStream(java.io.InputStream r8, long r9) {
            r7 = this;
            r2 = 0
            r6 = 1
            r0 = r7
            r1 = r8
            r4 = r9
            r0.<init>(r1, r2, r4, r6)
            return
    }

    BoundedInputStream(java.io.InputStream r1, long r2, long r4, boolean r6) {
            r0 = this;
            r0.<init>(r1)
            r0.count = r2
            r0.maxCount = r4
            r0.propagateClose = r6
            return
    }

    public static org.apache.commons.io.input.BoundedInputStream.Builder builder() {
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = new org.apache.commons.io.input.BoundedInputStream$Builder
            r0.<init>()
            return r0
    }

    private boolean isMaxCount() {
            r4 = this;
            long r0 = r4.maxCount
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L14
            long r0 = r4.getCount()
            long r2 = r4.maxCount
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    private long toReadLen(long r5) {
            r4 = this;
            long r0 = r4.maxCount
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L11
            long r2 = r4.getCount()
            long r0 = r0 - r2
            long r5 = java.lang.Math.min(r5, r0)
        L11:
            return r5
    }

    @Override // org.apache.commons.io.input.ProxyInputStream
    protected synchronized void afterRead(int r5) throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            r0 = -1
            if (r5 == r0) goto Le
            long r0 = r4.count     // Catch: java.lang.Throwable -> Lb
            long r2 = (long) r5     // Catch: java.lang.Throwable -> Lb
            long r0 = r0 + r2
            r4.count = r0     // Catch: java.lang.Throwable -> Lb
            goto Le
        Lb:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb
            throw r5
        Le:
            monitor-exit(r4)
            return
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.isMaxCount()
            if (r0 == 0) goto L11
            long r0 = r4.maxCount
            long r2 = r4.getCount()
            r4.onMaxLength(r0, r2)
            r0 = 0
            return r0
        L11:
            java.io.InputStream r0 = r4.in
            int r0 = r0.available()
            return r0
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.propagateClose
            if (r0 == 0) goto L9
            java.io.InputStream r0 = r1.in
            r0.close()
        L9:
            return
    }

    public synchronized long getCount() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.count     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public long getMaxCount() {
            r2 = this;
            long r0 = r2.maxCount
            return r0
    }

    @java.lang.Deprecated
    public long getMaxLength() {
            r2 = this;
            long r0 = r2.maxCount
            return r0
    }

    public long getRemaining() {
            r4 = this;
            long r0 = r4.getMaxCount()
            long r2 = r4.getCount()
            long r0 = r0 - r2
            r2 = 0
            long r0 = java.lang.Math.max(r2, r0)
            return r0
    }

    public boolean isPropagateClose() {
            r1 = this;
            boolean r0 = r1.propagateClose
            return r0
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r3) {
            r2 = this;
            monitor-enter(r2)
            java.io.InputStream r0 = r2.in     // Catch: java.lang.Throwable -> Lc
            r0.mark(r3)     // Catch: java.lang.Throwable -> Lc
            long r0 = r2.count     // Catch: java.lang.Throwable -> Lc
            r2.mark = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            java.io.InputStream r0 = r1.in
            boolean r0 = r0.markSupported()
            return r0
    }

    protected void onMaxLength(long r1, long r3) throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.isMaxCount()
            if (r0 == 0) goto L11
            long r0 = r4.maxCount
            long r2 = r4.getCount()
            r4.onMaxLength(r0, r2)
            r0 = -1
            return r0
        L11:
            int r0 = super.read()
            return r0
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.isMaxCount()
            if (r0 == 0) goto L11
            long r3 = r2.maxCount
            long r0 = r2.getCount()
            r2.onMaxLength(r3, r0)
            r3 = -1
            return r3
        L11:
            long r0 = (long) r5
            long r0 = r2.toReadLen(r0)
            int r5 = (int) r0
            int r3 = super.read(r3, r4, r5)
            return r3
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            java.io.InputStream r0 = r2.in     // Catch: java.lang.Throwable -> Lc
            r0.reset()     // Catch: java.lang.Throwable -> Lc
            long r0 = r2.mark     // Catch: java.lang.Throwable -> Lc
            r2.count = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @java.lang.Deprecated
    public void setPropagateClose(boolean r1) {
            r0 = this;
            r0.propagateClose = r1
            return
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            long r3 = r2.toReadLen(r3)     // Catch: java.lang.Throwable -> L10
            long r3 = super.skip(r3)     // Catch: java.lang.Throwable -> L10
            long r0 = r2.count     // Catch: java.lang.Throwable -> L10
            long r0 = r0 + r3
            r2.count = r0     // Catch: java.lang.Throwable -> L10
            monitor-exit(r2)
            return r3
        L10:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r3
    }

    public java.lang.String toString() {
            r1 = this;
            java.io.InputStream r0 = r1.in
            java.lang.String r0 = r0.toString()
            return r0
    }
}
