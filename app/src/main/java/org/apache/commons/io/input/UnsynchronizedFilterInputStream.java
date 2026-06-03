package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class UnsynchronizedFilterInputStream extends java.io.InputStream {
    protected volatile java.io.InputStream inputStream;

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.UnsynchronizedFilterInputStream, org.apache.commons.io.input.UnsynchronizedFilterInputStream.Builder> {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.UnsynchronizedFilterInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.UnsynchronizedFilterInputStream get() throws java.io.IOException {
                r2 = this;
                org.apache.commons.io.input.UnsynchronizedFilterInputStream r0 = new org.apache.commons.io.input.UnsynchronizedFilterInputStream
                java.io.InputStream r1 = r2.getInputStream()
                r0.<init>(r1)
                return r0
        }
    }

    UnsynchronizedFilterInputStream(java.io.InputStream r1) {
            r0 = this;
            r0.<init>()
            r0.inputStream = r1
            return
    }

    public static org.apache.commons.io.input.UnsynchronizedFilterInputStream.Builder builder() {
            org.apache.commons.io.input.UnsynchronizedFilterInputStream$Builder r0 = new org.apache.commons.io.input.UnsynchronizedFilterInputStream$Builder
            r0.<init>()
            return r0
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.inputStream
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.inputStream
            r0.close()
            return
    }

    @Override // java.io.InputStream
    public void mark(int r2) {
            r1 = this;
            java.io.InputStream r0 = r1.inputStream
            r0.mark(r2)
            return
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            java.io.InputStream r0 = r1.inputStream
            boolean r0 = r0.markSupported()
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.inputStream
            int r0 = r0.read()
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.inputStream
            int r2 = r0.read(r2, r3, r4)
            return r2
    }

    @Override // java.io.InputStream
    public void reset() throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.inputStream
            r0.reset()
            return
    }

    @Override // java.io.InputStream
    public long skip(long r2) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.inputStream
            long r2 = r0.skip(r2)
            return r2
    }
}
