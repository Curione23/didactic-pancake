package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class CloseShieldOutputStream extends org.apache.commons.io.output.ProxyOutputStream {
    @java.lang.Deprecated
    public CloseShieldOutputStream(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.apache.commons.io.output.CloseShieldOutputStream wrap(java.io.OutputStream r1) {
            org.apache.commons.io.output.CloseShieldOutputStream r0 = new org.apache.commons.io.output.CloseShieldOutputStream
            r0.<init>(r1)
            return r0
    }

    @Override // org.apache.commons.io.output.ProxyOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            org.apache.commons.io.output.ClosedOutputStream r0 = org.apache.commons.io.output.ClosedOutputStream.INSTANCE
            r1.out = r0
            return
    }
}
