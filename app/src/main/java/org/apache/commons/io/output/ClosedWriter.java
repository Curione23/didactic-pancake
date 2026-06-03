package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class ClosedWriter extends java.io.Writer {

    @java.lang.Deprecated
    public static final org.apache.commons.io.output.ClosedWriter CLOSED_WRITER = null;
    public static final org.apache.commons.io.output.ClosedWriter INSTANCE = null;

    static {
            org.apache.commons.io.output.ClosedWriter r0 = new org.apache.commons.io.output.ClosedWriter
            r0.<init>()
            org.apache.commons.io.output.ClosedWriter.INSTANCE = r0
            org.apache.commons.io.output.ClosedWriter.CLOSED_WRITER = r0
            return
    }

    public ClosedWriter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws java.io.IOException {
            r2 = this;
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "flush() failed: stream is closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.Writer
    public void write(char[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "write("
            r1.<init>(r2)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
            java.lang.StringBuilder r4 = r1.append(r2)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r5 = ") failed: stream is closed"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }
}
