package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class CloseIgnoringInputStream extends java.io.FilterInputStream {
    public CloseIgnoringInputStream(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }
}
