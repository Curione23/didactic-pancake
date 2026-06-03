package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class AutoCloseInputStream extends org.apache.commons.io.input.ProxyInputStream {

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.AutoCloseInputStream, org.apache.commons.io.input.AutoCloseInputStream.Builder> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.AutoCloseInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.AutoCloseInputStream get() throws java.io.IOException {
                r2 = this;
                org.apache.commons.io.input.AutoCloseInputStream r0 = new org.apache.commons.io.input.AutoCloseInputStream
                java.io.InputStream r1 = r2.getInputStream()
                r0.<init>(r1)
                return r0
        }
    }

    @java.lang.Deprecated
    public AutoCloseInputStream(java.io.InputStream r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.apache.commons.io.input.AutoCloseInputStream.Builder builder() {
            org.apache.commons.io.input.AutoCloseInputStream$Builder r0 = new org.apache.commons.io.input.AutoCloseInputStream$Builder
            r0.<init>()
            return r0
    }

    @Override // org.apache.commons.io.input.ProxyInputStream
    protected void afterRead(int r2) throws java.io.IOException {
            r1 = this;
            r0 = -1
            if (r2 != r0) goto L6
            r1.close()
        L6:
            return
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            r0.close()
            org.apache.commons.io.input.ClosedInputStream r0 = org.apache.commons.io.input.ClosedInputStream.INSTANCE
            r1.in = r0
            return
    }

    protected void finalize() throws java.lang.Throwable {
            r0 = this;
            r0.close()
            super.finalize()
            return
    }
}
