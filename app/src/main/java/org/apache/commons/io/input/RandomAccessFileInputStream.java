package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class RandomAccessFileInputStream extends java.io.InputStream {
    private final boolean closeOnClose;
    private final java.io.RandomAccessFile randomAccessFile;

    public static class Builder extends org.apache.commons.io.build.AbstractStreamBuilder<org.apache.commons.io.input.RandomAccessFileInputStream, org.apache.commons.io.input.RandomAccessFileInputStream.Builder> {
        private boolean closeOnClose;
        private java.io.RandomAccessFile randomAccessFile;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.input.RandomAccessFileInputStream r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.input.RandomAccessFileInputStream get() throws java.io.IOException {
                r3 = this;
                java.io.RandomAccessFile r0 = r3.randomAccessFile
                if (r0 == 0) goto L2a
                org.apache.commons.io.build.AbstractOrigin r0 = r3.getOrigin()
                if (r0 != 0) goto L14
                org.apache.commons.io.input.RandomAccessFileInputStream r0 = new org.apache.commons.io.input.RandomAccessFileInputStream
                java.io.RandomAccessFile r1 = r3.randomAccessFile
                boolean r2 = r3.closeOnClose
                r0.<init>(r1, r2)
                return r0
            L14:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.io.RandomAccessFile r1 = r3.randomAccessFile
                org.apache.commons.io.build.AbstractOrigin r2 = r3.getOrigin()
                java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
                java.lang.String r2 = "Only set one of RandomAccessFile (%s) or origin (%s)"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1)
                throw r0
            L2a:
                org.apache.commons.io.input.RandomAccessFileInputStream r0 = new org.apache.commons.io.input.RandomAccessFileInputStream
                org.apache.commons.io.RandomAccessFileMode r1 = org.apache.commons.io.RandomAccessFileMode.READ_ONLY
                org.apache.commons.io.build.AbstractOrigin r2 = r3.checkOrigin()
                java.io.File r2 = r2.getFile()
                java.io.RandomAccessFile r1 = r1.create(r2)
                boolean r2 = r3.closeOnClose
                r0.<init>(r1, r2)
                return r0
        }

        public org.apache.commons.io.input.RandomAccessFileInputStream.Builder setCloseOnClose(boolean r1) {
                r0 = this;
                r0.closeOnClose = r1
                return r0
        }

        public org.apache.commons.io.input.RandomAccessFileInputStream.Builder setRandomAccessFile(java.io.RandomAccessFile r1) {
                r0 = this;
                r0.randomAccessFile = r1
                return r0
        }
    }

    @java.lang.Deprecated
    public RandomAccessFileInputStream(java.io.RandomAccessFile r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public RandomAccessFileInputStream(java.io.RandomAccessFile r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "file"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.io.RandomAccessFile r2 = (java.io.RandomAccessFile) r2
            r1.randomAccessFile = r2
            r1.closeOnClose = r3
            return
    }

    public static org.apache.commons.io.input.RandomAccessFileInputStream.Builder builder() {
            org.apache.commons.io.input.RandomAccessFileInputStream$Builder r0 = new org.apache.commons.io.input.RandomAccessFileInputStream$Builder
            r0.<init>()
            return r0
    }

    @Override // java.io.InputStream
    public int available() throws java.io.IOException {
            r4 = this;
            long r0 = r4.availableLong()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lf
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        Lf:
            int r0 = (int) r0
            return r0
    }

    public long availableLong() throws java.io.IOException {
            r4 = this;
            java.io.RandomAccessFile r0 = r4.randomAccessFile
            long r0 = r0.length()
            java.io.RandomAccessFile r2 = r4.randomAccessFile
            long r2 = r2.getFilePointer()
            long r0 = r0 - r2
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            super.close()
            boolean r0 = r1.closeOnClose
            if (r0 == 0) goto Lc
            java.io.RandomAccessFile r0 = r1.randomAccessFile
            r0.close()
        Lc:
            return
    }

    public java.io.RandomAccessFile getRandomAccessFile() {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.randomAccessFile
            return r0
    }

    public boolean isCloseOnClose() {
            r1 = this;
            boolean r0 = r1.closeOnClose
            return r0
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.randomAccessFile
            int r0 = r0.read()
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.randomAccessFile
            int r2 = r0.read(r2)
            return r2
    }

    @Override // java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.randomAccessFile
            int r2 = r0.read(r2, r3, r4)
            return r2
    }

    @Override // java.io.InputStream
    public long skip(long r8) throws java.io.IOException {
            r7 = this;
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            return r0
        L7:
            java.io.RandomAccessFile r2 = r7.randomAccessFile
            long r2 = r2.getFilePointer()
            java.io.RandomAccessFile r4 = r7.randomAccessFile
            long r4 = r4.length()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L18
            return r0
        L18:
            long r8 = r8 + r2
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 <= 0) goto L21
            r8 = 1
            long r8 = r4 - r8
        L21:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2a
            java.io.RandomAccessFile r0 = r7.randomAccessFile
            r0.seek(r8)
        L2a:
            java.io.RandomAccessFile r8 = r7.randomAccessFile
            long r8 = r8.getFilePointer()
            long r8 = r8 - r2
            return r8
    }
}
