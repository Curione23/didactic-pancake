package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class NullInputStream extends java.io.InputStream {
    public static final org.apache.commons.io.input.NullInputStream INSTANCE = null;
    private boolean eof;
    private long mark;
    private final boolean markSupported;
    private long position;
    private long readLimit;
    private final long size;
    private final boolean throwEofException;

    static {
            org.apache.commons.io.input.NullInputStream r0 = new org.apache.commons.io.input.NullInputStream
            r0.<init>()
            org.apache.commons.io.input.NullInputStream.INSTANCE = r0
            return
    }

    public NullInputStream() {
            r4 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r4.<init>(r2, r0, r1)
            return
    }

    public NullInputStream(long r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public NullInputStream(long r3, boolean r5, boolean r6) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mark = r0
            r2.size = r3
            r2.markSupported = r5
            r2.throwEofException = r6
            return
    }

    private void checkThrowEof(java.lang.String r2) throws java.io.EOFException {
            r1 = this;
            boolean r0 = r1.throwEofException
            if (r0 != 0) goto L5
            return
        L5:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>(r2)
            throw r0
    }

    private int handleEof() throws java.io.EOFException {
            r1 = this;
            r0 = 1
            r1.eof = r0
            java.lang.String r0 = "handleEof()"
            r1.checkThrowEof(r0)
            r0 = -1
            return r0
    }

    @Override // java.io.InputStream
    public int available() {
            r4 = this;
            long r0 = r4.size
            long r2 = r4.position
            long r0 = r0 - r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L18
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        L18:
            int r0 = (int) r0
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            r0 = 0
            r2.eof = r0
            r0 = 0
            r2.position = r0
            r0 = -1
            r2.mark = r0
            return
    }

    public long getPosition() {
            r2 = this;
            long r0 = r2.position
            return r0
    }

    public long getSize() {
            r2 = this;
            long r0 = r2.size
            return r0
    }

    @Override // java.io.InputStream
    public synchronized void mark(int r3) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.markSupported     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto Le
            long r0 = r2.position     // Catch: java.lang.Throwable -> L13
            r2.mark = r0     // Catch: java.lang.Throwable -> L13
            long r0 = (long) r3     // Catch: java.lang.Throwable -> L13
            r2.readLimit = r0     // Catch: java.lang.Throwable -> L13
            monitor-exit(r2)
            return
        Le:
            java.lang.UnsupportedOperationException r3 = org.apache.commons.io.input.UnsupportedOperationExceptions.mark()     // Catch: java.lang.Throwable -> L13
            throw r3     // Catch: java.lang.Throwable -> L13
        L13:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            boolean r0 = r1.markSupported
            return r0
    }

    protected int processByte() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected void processBytes(byte[] r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.eof
            if (r0 == 0) goto Lb
            java.lang.String r0 = "read()"
            r4.checkThrowEof(r0)
            r0 = -1
            return r0
        Lb:
            long r0 = r4.position
            long r2 = r4.size
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L18
            int r0 = r4.handleEof()
            return r0
        L18:
            r2 = 1
            long r0 = r0 + r2
            r4.position = r0
            int r0 = r4.processByte()
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // java.io.InputStream
    public int read(byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.eof
            if (r0 == 0) goto Lb
            java.lang.String r7 = "read(byte[], int, int)"
            r6.checkThrowEof(r7)
            r7 = -1
            return r7
        Lb:
            long r0 = r6.position
            long r2 = r6.size
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L18
            int r7 = r6.handleEof()
            return r7
        L18:
            long r4 = (long) r9
            long r0 = r0 + r4
            r6.position = r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L25
            long r0 = r0 - r2
            int r0 = (int) r0
            int r9 = r9 - r0
            r6.position = r2
        L25:
            r6.processBytes(r7, r8, r9)
            return r9
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
            r7 = this;
            java.lang.String r0 = "Marked position ["
            monitor-enter(r7)
            boolean r1 = r7.markSupported     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L4e
            long r1 = r7.mark     // Catch: java.lang.Throwable -> L53
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L46
            long r3 = r7.position     // Catch: java.lang.Throwable -> L53
            long r5 = r7.readLimit     // Catch: java.lang.Throwable -> L53
            long r5 = r5 + r1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L1f
            r7.position = r1     // Catch: java.lang.Throwable -> L53
            r0 = 0
            r7.eof = r0     // Catch: java.lang.Throwable -> L53
            monitor-exit(r7)
            return
        L1f:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L53
            long r3 = r7.mark     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r0 = r2.append(r3)     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "] is no longer valid - passed the read limit ["
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L53
            long r2 = r7.readLimit     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "]"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L53
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L53
            throw r1     // Catch: java.lang.Throwable -> L53
        L46:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = "No position has been marked"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L53
            throw r0     // Catch: java.lang.Throwable -> L53
        L4e:
            java.lang.UnsupportedOperationException r0 = org.apache.commons.io.input.UnsupportedOperationExceptions.reset()     // Catch: java.lang.Throwable -> L53
            throw r0     // Catch: java.lang.Throwable -> L53
        L53:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L53
            throw r0
    }

    @Override // java.io.InputStream
    public long skip(long r6) throws java.io.IOException {
            r5 = this;
            boolean r0 = r5.eof
            if (r0 == 0) goto Lc
            java.lang.String r6 = "skip(long)"
            r5.checkThrowEof(r6)
            r6 = -1
            return r6
        Lc:
            long r0 = r5.position
            long r2 = r5.size
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L1a
            int r6 = r5.handleEof()
            long r6 = (long) r6
            return r6
        L1a:
            long r0 = r0 + r6
            r5.position = r0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L25
            long r0 = r0 - r2
            long r6 = r6 - r0
            r5.position = r2
        L25:
            return r6
    }
}
