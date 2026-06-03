package org.apache.commons.compress.compressors;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CompressorOutputStream<T extends java.io.OutputStream> extends java.io.FilterOutputStream {
    public CompressorOutputStream() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public CompressorOutputStream(T r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected T out() {
            r1 = this;
            java.io.OutputStream r0 = r1.out
            return r0
    }
}
