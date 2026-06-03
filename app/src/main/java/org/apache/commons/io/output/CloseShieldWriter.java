package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class CloseShieldWriter extends org.apache.commons.io.output.ProxyWriter {
    @java.lang.Deprecated
    public CloseShieldWriter(java.io.Writer r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.apache.commons.io.output.CloseShieldWriter wrap(java.io.Writer r1) {
            org.apache.commons.io.output.CloseShieldWriter r0 = new org.apache.commons.io.output.CloseShieldWriter
            r0.<init>(r1)
            return r0
    }

    @Override // org.apache.commons.io.output.ProxyWriter, java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            org.apache.commons.io.output.ClosedWriter r0 = org.apache.commons.io.output.ClosedWriter.INSTANCE
            r1.out = r0
            return
    }
}
