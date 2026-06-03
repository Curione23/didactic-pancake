package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class CloseShieldInputStream extends org.apache.commons.io.input.ProxyInputStream {
    @java.lang.Deprecated
    public CloseShieldInputStream(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.apache.commons.io.input.CloseShieldInputStream wrap(java.io.InputStream r1) {
            org.apache.commons.io.input.CloseShieldInputStream r0 = new org.apache.commons.io.input.CloseShieldInputStream
            r0.<init>(r1)
            return r0
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            org.apache.commons.io.input.ClosedInputStream r0 = org.apache.commons.io.input.ClosedInputStream.INSTANCE
            r1.in = r0
            return
    }
}
