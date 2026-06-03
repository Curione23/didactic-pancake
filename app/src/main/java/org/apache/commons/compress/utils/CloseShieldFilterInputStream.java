package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class CloseShieldFilterInputStream extends java.io.FilterInputStream {
    public CloseShieldFilterInputStream(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r0 = this;
            return
    }
}
