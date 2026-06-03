package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class ClosedInputStream extends java.io.InputStream {

    @java.lang.Deprecated
    public static final org.apache.commons.io.input.ClosedInputStream CLOSED_INPUT_STREAM = null;
    public static final org.apache.commons.io.input.ClosedInputStream INSTANCE = null;

    static {
            org.apache.commons.io.input.ClosedInputStream r0 = new org.apache.commons.io.input.ClosedInputStream
            r0.<init>()
            org.apache.commons.io.input.ClosedInputStream.INSTANCE = r0
            org.apache.commons.io.input.ClosedInputStream.CLOSED_INPUT_STREAM = r0
            return
    }

    public ClosedInputStream() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.io.InputStream
    public int read() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            r1 = -1
            return r1
    }
}
