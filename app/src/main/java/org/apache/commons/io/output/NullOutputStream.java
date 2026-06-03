package org.apache.commons.io.output;

/* JADX INFO: loaded from: classes2.dex */
public class NullOutputStream extends java.io.OutputStream {
    public static final org.apache.commons.io.output.NullOutputStream INSTANCE = null;

    @java.lang.Deprecated
    public static final org.apache.commons.io.output.NullOutputStream NULL_OUTPUT_STREAM = null;

    static {
            org.apache.commons.io.output.NullOutputStream r0 = new org.apache.commons.io.output.NullOutputStream
            r0.<init>()
            org.apache.commons.io.output.NullOutputStream.INSTANCE = r0
            org.apache.commons.io.output.NullOutputStream.NULL_OUTPUT_STREAM = r0
            return
    }

    @java.lang.Deprecated
    public NullOutputStream() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.io.OutputStream
    public void write(int r1) {
            r0 = this;
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r1) throws java.io.IOException {
            r0 = this;
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r1, int r2, int r3) {
            r0 = this;
            return
    }
}
