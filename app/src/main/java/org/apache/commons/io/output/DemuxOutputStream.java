package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class DemuxOutputStream extends java.io.OutputStream {
    private final java.lang.InheritableThreadLocal<java.io.OutputStream> outputStreamThreadLocal;

    public DemuxOutputStream() {
            r1 = this;
            r1.<init>()
            java.lang.InheritableThreadLocal r0 = new java.lang.InheritableThreadLocal
            r0.<init>()
            r1.outputStreamThreadLocal = r0
            return
    }

    public java.io.OutputStream bindStream(java.io.OutputStream r3) {
            r2 = this;
            java.lang.InheritableThreadLocal<java.io.OutputStream> r0 = r2.outputStreamThreadLocal
            java.lang.Object r0 = r0.get()
            java.io.OutputStream r0 = (java.io.OutputStream) r0
            java.lang.InheritableThreadLocal<java.io.OutputStream> r1 = r2.outputStreamThreadLocal
            r1.set(r3)
            return r0
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.lang.InheritableThreadLocal<java.io.OutputStream> r0 = r1.outputStreamThreadLocal
            java.lang.Object r0 = r0.get()
            java.io.Closeable r0 = (java.io.Closeable) r0
            org.apache.commons.io.IOUtils.close(r0)
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r1 = this;
            java.lang.InheritableThreadLocal<java.io.OutputStream> r0 = r1.outputStreamThreadLocal
            java.lang.Object r0 = r0.get()
            java.io.OutputStream r0 = (java.io.OutputStream) r0
            if (r0 == 0) goto Ld
            r0.flush()
        Ld:
            return
    }

    @Override // java.io.OutputStream
    public void write(int r2) throws java.io.IOException {
            r1 = this;
            java.lang.InheritableThreadLocal<java.io.OutputStream> r0 = r1.outputStreamThreadLocal
            java.lang.Object r0 = r0.get()
            java.io.OutputStream r0 = (java.io.OutputStream) r0
            if (r0 == 0) goto Ld
            r0.write(r2)
        Ld:
            return
    }
}
