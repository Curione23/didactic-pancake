package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class MarkShieldInputStream extends org.apache.commons.io.input.ProxyInputStream {
    public MarkShieldInputStream(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int r1) {
            r0 = this;
            return
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws java.io.IOException {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = org.apache.commons.io.input.UnsupportedOperationExceptions.reset()
            throw r0
    }
}
