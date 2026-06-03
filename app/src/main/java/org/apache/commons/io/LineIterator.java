package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public class LineIterator implements java.util.Iterator<java.lang.String>, java.io.Closeable {
    private final java.io.BufferedReader bufferedReader;
    private java.lang.String cachedLine;
    private boolean finished;

    /* JADX INFO: renamed from: $r8$lambda$bSj2-mxKOl1wpbSxx_L6s-i3vOM, reason: not valid java name */
    public static /* synthetic */ void m2572$r8$lambda$bSj2mxKOl1wpbSxx_L6si3vOM(java.io.IOException r0, java.lang.Throwable r1) {
            r0.addSuppressed(r1)
            return
    }

    public LineIterator(java.io.Reader r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "reader"
            java.util.Objects.requireNonNull(r2, r0)
            boolean r0 = r2 instanceof java.io.BufferedReader
            if (r0 == 0) goto L11
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            r1.bufferedReader = r2
            goto L18
        L11:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r2)
            r1.bufferedReader = r0
        L18:
            return
    }

    @java.lang.Deprecated
    public static void closeQuietly(org.apache.commons.io.LineIterator r0) {
            org.apache.commons.io.IOUtils.closeQuietly(r0)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.finished = r0
            r0 = 0
            r1.cachedLine = r0
            java.io.BufferedReader r0 = r1.bufferedReader
            org.apache.commons.io.IOUtils.close(r0)
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r4 = this;
            java.lang.String r0 = r4.cachedLine
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r4.finished
            r2 = 0
            if (r0 == 0) goto Lc
            return r2
        Lc:
            java.io.BufferedReader r0 = r4.bufferedReader     // Catch: java.io.IOException -> L20
            java.lang.String r0 = r0.readLine()     // Catch: java.io.IOException -> L20
            if (r0 != 0) goto L17
            r4.finished = r1     // Catch: java.io.IOException -> L20
            return r2
        L17:
            boolean r3 = r4.isValidLine(r0)     // Catch: java.io.IOException -> L20
            if (r3 == 0) goto Lc
            r4.cachedLine = r0     // Catch: java.io.IOException -> L20
            return r1
        L20:
            r0 = move-exception
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.LineIterator$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.LineIterator$$ExternalSyntheticLambda0
            r1.<init>(r0)
            org.apache.commons.io.IOUtils.closeQuietly(r4, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
    }

    protected boolean isValidLine(java.lang.String r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.String next() {
            r1 = this;
            java.lang.String r0 = r1.next2()
            return r0
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
    public java.lang.String next2() {
            r1 = this;
            java.lang.String r0 = r1.nextLine()
            return r0
    }

    public java.lang.String nextLine() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lc
            java.lang.String r0 = r2.cachedLine
            r1 = 0
            r2.cachedLine = r1
            return r0
        Lc:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "No more lines"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "remove not supported"
            r0.<init>(r1)
            throw r0
    }
}
