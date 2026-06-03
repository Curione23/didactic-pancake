package org.apache.commons.compress.archivers;

import org.apache.commons.compress.archivers.ArchiveEntry;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ArchiveOutputStream<E extends org.apache.commons.compress.archivers.ArchiveEntry> extends java.io.FilterOutputStream {
    static final int BYTE_MASK = 255;
    private long bytesWritten;
    private boolean closed;
    private boolean finished;
    private final byte[] oneByte;

    public ArchiveOutputStream() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.oneByte = r0
            return
    }

    public ArchiveOutputStream(java.io.OutputStream r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            byte[] r1 = new byte[r1]
            r0.oneByte = r1
            return
    }

    public boolean canWriteEntryData(org.apache.commons.compress.archivers.ArchiveEntry r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    protected void checkFinished() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.isFinished()
            if (r0 != 0) goto L7
            return
        L7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Stream has already been finished."
            r0.<init>(r1)
            throw r0
    }

    protected void checkOpen() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L7
            return
        L7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Stream closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            super.close()
            r0 = 1
            r1.closed = r0
            return
    }

    public abstract void closeArchiveEntry() throws java.io.IOException;

    protected void count(int r3) {
            r2 = this;
            long r0 = (long) r3
            r2.count(r0)
            return
    }

    protected void count(long r3) {
            r2 = this;
            r0 = -1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            long r0 = r2.bytesWritten
            long r0 = r0 + r3
            r2.bytesWritten = r0
        Lb:
            return
    }

    public abstract E createArchiveEntry(java.io.File r1, java.lang.String r2) throws java.io.IOException;

    public E createArchiveEntry(java.nio.file.Path r1, java.lang.String r2, java.nio.file.LinkOption... r3) throws java.io.IOException {
            r0 = this;
            java.io.File r1 = r1.toFile()
            org.apache.commons.compress.archivers.ArchiveEntry r1 = r0.createArchiveEntry(r1, r2)
            return r1
    }

    public void finish() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.finished = r0
            return
    }

    public long getBytesWritten() {
            r2 = this;
            long r0 = r2.bytesWritten
            return r0
    }

    @java.lang.Deprecated
    public int getCount() {
            r2 = this;
            long r0 = r2.bytesWritten
            int r0 = (int) r0
            return r0
    }

    protected boolean isClosed() {
            r1 = this;
            boolean r0 = r1.closed
            return r0
    }

    protected boolean isFinished() {
            r1 = this;
            boolean r0 = r1.finished
            return r0
    }

    public abstract void putArchiveEntry(E r1) throws java.io.IOException;

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.oneByte
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r2.write(r0, r1, r3)
            return
    }
}
