package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class ClosedOutputStream extends java.io.OutputStream {

    @java.lang.Deprecated
    public static final org.apache.commons.io.output.ClosedOutputStream CLOSED_OUTPUT_STREAM = null;
    public static final org.apache.commons.io.output.ClosedOutputStream INSTANCE = null;

    static {
            org.apache.commons.io.output.ClosedOutputStream r0 = new org.apache.commons.io.output.ClosedOutputStream
            r0.<init>()
            org.apache.commons.io.output.ClosedOutputStream.INSTANCE = r0
            org.apache.commons.io.output.ClosedOutputStream.CLOSED_OUTPUT_STREAM = r0
            return
    }

    public ClosedOutputStream() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws java.io.IOException {
            r2 = this;
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "flush() failed: stream is closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.OutputStream
    public void write(int r2) throws java.io.IOException {
            r1 = this;
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r0 = "write(int) failed: stream is closed"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.io.OutputStream
    public void write(byte[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "write(byte[], int, int) failed: stream is closed"
            r1.<init>(r2)
            throw r1
    }
}
