package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class ByteArrayOutputStream extends org.apache.commons.io.output.AbstractByteArrayOutputStream {
    /* JADX INFO: renamed from: $r8$lambda$6y4jQ-FsQ6NEye1Y_s5VEmsevM0, reason: not valid java name */
    public static /* synthetic */ java.io.ByteArrayInputStream m2642$r8$lambda$6y4jQFsQ6NEye1Y_s5VEmsevM0(byte[] r1, int r2, int r3) {
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1, r2, r3)
            return r0
    }

    public ByteArrayOutputStream() {
            r1 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1.<init>(r0)
            return
    }

    public ByteArrayOutputStream(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 < 0) goto Le
            monitor-enter(r3)
            r3.needNewBuffer(r4)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb
            throw r4
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Negative initial size: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public static java.io.InputStream toBufferedInputStream(java.io.InputStream r1) throws java.io.IOException {
            r0 = 1024(0x400, float:1.435E-42)
            java.io.InputStream r1 = toBufferedInputStream(r1, r0)
            return r1
    }

    public static java.io.InputStream toBufferedInputStream(java.io.InputStream r1, int r2) throws java.io.IOException {
            org.apache.commons.io.output.ByteArrayOutputStream r0 = new org.apache.commons.io.output.ByteArrayOutputStream
            r0.<init>(r2)
            r0.write(r1)     // Catch: java.lang.Throwable -> L10
            java.io.InputStream r1 = r0.toInputStream()     // Catch: java.lang.Throwable -> L10
            r0.close()
            return r1
        L10:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r2 = move-exception
            r1.addSuppressed(r2)
        L19:
            throw r1
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized void reset() {
            r1 = this;
            monitor-enter(r1)
            r1.resetImpl()     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized int size() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.count     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized byte[] toByteArray() {
            r1 = this;
            monitor-enter(r1)
            byte[] r0 = r1.toByteArrayImpl()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r0
        L7:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized java.io.InputStream toInputStream() {
            r1 = this;
            monitor-enter(r1)
            org.apache.commons.io.output.ByteArrayOutputStream$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.output.ByteArrayOutputStream$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> Lc
            r0.<init>()     // Catch: java.lang.Throwable -> Lc
            java.io.InputStream r0 = r1.toInputStream(r0)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized int write(java.io.InputStream r1) throws java.io.IOException {
            r0 = this;
            monitor-enter(r0)
            int r1 = r0.writeImpl(r1)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.writeImpl(r1)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return
        L6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            throw r1
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) {
            r2 = this;
            if (r4 < 0) goto L1a
            int r0 = r3.length
            if (r4 > r0) goto L1a
            if (r5 < 0) goto L1a
            int r0 = r4 + r5
            int r1 = r3.length
            if (r0 > r1) goto L1a
            if (r0 < 0) goto L1a
            if (r5 != 0) goto L11
            return
        L11:
            monitor-enter(r2)
            r2.writeImpl(r3, r4, r5)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r3
        L1a:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized void writeTo(java.io.OutputStream r1) throws java.io.IOException {
            r0 = this;
            monitor-enter(r0)
            r0.writeToImpl(r1)     // Catch: java.lang.Throwable -> L6
            monitor-exit(r0)
            return
        L6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            throw r1
    }
}
