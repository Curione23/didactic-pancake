package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class DemuxInputStream extends java.io.InputStream {
    private final java.lang.InheritableThreadLocal<java.io.InputStream> inputStreamLocal;

    public DemuxInputStream() {
            r1 = this;
            r1.<init>()
            java.lang.InheritableThreadLocal r0 = new java.lang.InheritableThreadLocal
            r0.<init>()
            r1.inputStreamLocal = r0
            return
    }

    public java.io.InputStream bindStream(java.io.InputStream r3) {
            r2 = this;
            java.lang.InheritableThreadLocal<java.io.InputStream> r0 = r2.inputStreamLocal
            java.lang.Object r0 = r0.get()
            java.io.InputStream r0 = (java.io.InputStream) r0
            java.lang.InheritableThreadLocal<java.io.InputStream> r1 = r2.inputStreamLocal
            r1.set(r3)
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.lang.InheritableThreadLocal<java.io.InputStream> r0 = r1.inputStreamLocal
            java.lang.Object r0 = r0.get()
            java.io.Closeable r0 = (java.io.Closeable) r0
            org.apache.commons.io.IOUtils.close(r0)
            return
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r1 = this;
            java.lang.InheritableThreadLocal<java.io.InputStream> r0 = r1.inputStreamLocal
            java.lang.Object r0 = r0.get()
            java.io.InputStream r0 = (java.io.InputStream) r0
            if (r0 == 0) goto Lf
            int r0 = r0.read()
            return r0
        Lf:
            r0 = -1
            return r0
    }
}
