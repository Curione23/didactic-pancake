package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class BoundedReader extends java.io.Reader {
    private static final int INVALID = -1;
    private int charsRead;
    private int markedAt;
    private final int maxCharsFromTargetReader;
    private int readAheadLimit;
    private final java.io.Reader target;

    public BoundedReader(java.io.Reader r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.markedAt = r0
            r1.target = r2
            r1.maxCharsFromTargetReader = r3
            return
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.Reader r0 = r1.target
            r0.close()
            return
    }

    @Override // java.io.Reader
    public void mark(int r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.charsRead
            int r1 = r3 - r0
            r2.readAheadLimit = r1
            r2.markedAt = r0
            java.io.Reader r0 = r2.target
            r0.mark(r3)
            return
    }

    @Override // java.io.Reader
    public int read() throws java.io.IOException {
            r4 = this;
            int r0 = r4.charsRead
            int r1 = r4.maxCharsFromTargetReader
            r2 = -1
            if (r0 < r1) goto L8
            return r2
        L8:
            int r1 = r4.markedAt
            if (r1 < 0) goto L13
            int r1 = r0 - r1
            int r3 = r4.readAheadLimit
            if (r1 < r3) goto L13
            return r2
        L13:
            int r0 = r0 + 1
            r4.charsRead = r0
            java.io.Reader r0 = r4.target
            int r0 = r0.read()
            return r0
    }

    @Override // java.io.Reader
    public int read(char[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            if (r0 >= r6) goto L16
            int r1 = r3.read()
            r2 = -1
            if (r1 != r2) goto Le
            if (r0 != 0) goto Ld
            r0 = r2
        Ld:
            return r0
        Le:
            int r2 = r5 + r0
            char r1 = (char) r1
            r4[r2] = r1
            int r0 = r0 + 1
            goto L1
        L16:
            return r6
    }

    @Override // java.io.Reader
    public void reset() throws java.io.IOException {
            r1 = this;
            int r0 = r1.markedAt
            r1.charsRead = r0
            java.io.Reader r0 = r1.target
            r0.reset()
            return
    }
}
