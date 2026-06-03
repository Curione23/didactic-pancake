package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class CloseShieldReader extends org.apache.commons.io.input.ProxyReader {
    @java.lang.Deprecated
    public CloseShieldReader(java.io.Reader r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.apache.commons.io.input.CloseShieldReader wrap(java.io.Reader r1) {
            org.apache.commons.io.input.CloseShieldReader r0 = new org.apache.commons.io.input.CloseShieldReader
            r0.<init>(r1)
            return r0
    }

    @Override // org.apache.commons.io.input.ProxyReader, java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            org.apache.commons.io.input.ClosedReader r0 = org.apache.commons.io.input.ClosedReader.INSTANCE
            r1.in = r0
            return
    }
}
