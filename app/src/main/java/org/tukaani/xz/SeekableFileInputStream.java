package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public class SeekableFileInputStream extends org.tukaani.xz.SeekableInputStream {
    protected java.io.RandomAccessFile randomAccessFile;

    public SeekableFileInputStream(java.io.File r3) throws java.io.FileNotFoundException {
            r2 = this;
            r2.<init>()
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r3, r1)
            r2.randomAccessFile = r0
            return
    }

    public SeekableFileInputStream(java.io.RandomAccessFile r1) {
            r0 = this;
            r0.<init>()
            r0.randomAccessFile = r1
            return
    }

    public SeekableFileInputStream(java.lang.String r3) throws java.io.FileNotFoundException {
            r2 = this;
            r2.<init>()
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r3, r1)
            r2.randomAccessFile = r0
            return
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.randomAccessFile
            r0.close()
            return
    }

    @Override // org.tukaani.xz.SeekableInputStream
    public long length() throws java.io.IOException {
            r2 = this;
            java.io.RandomAccessFile r0 = r2.randomAccessFile
            long r0 = r0.length()
            return r0
    }

    @Override // org.tukaani.xz.SeekableInputStream
    public long position() throws java.io.IOException {
            r2 = this;
            java.io.RandomAccessFile r0 = r2.randomAccessFile
            long r0 = r0.getFilePointer()
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

    @Override // org.tukaani.xz.SeekableInputStream
    public void seek(long r2) throws java.io.IOException {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.randomAccessFile
            r0.seek(r2)
            return
    }
}
