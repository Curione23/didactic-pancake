package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class NullWriter extends java.io.Writer {
    public static final org.apache.commons.io.output.NullWriter INSTANCE = null;

    @java.lang.Deprecated
    public static final org.apache.commons.io.output.NullWriter NULL_WRITER = null;

    static {
            org.apache.commons.io.output.NullWriter r0 = new org.apache.commons.io.output.NullWriter
            r0.<init>()
            org.apache.commons.io.output.NullWriter.INSTANCE = r0
            org.apache.commons.io.output.NullWriter.NULL_WRITER = r0
            return
    }

    @java.lang.Deprecated
    public NullWriter() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(char r1) {
            r0 = this;
            return r0
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r1) {
            r0 = this;
            return r0
    }

    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r1, int r2, int r3) {
            r0 = this;
            return r0
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(char r1) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1)
            return r1
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            java.io.Writer r1 = r0.append(r1, r2, r3)
            return r1
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
            r0 = this;
            return
    }

    @Override // java.io.Writer
    public void write(int r1) {
            r0 = this;
            return
    }

    @Override // java.io.Writer
    public void write(java.lang.String r1) {
            r0 = this;
            return
    }

    @Override // java.io.Writer
    public void write(java.lang.String r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // java.io.Writer
    public void write(char[] r1) {
            r0 = this;
            return
    }

    @Override // java.io.Writer
    public void write(char[] r1, int r2, int r3) {
            r0 = this;
            return
    }
}
