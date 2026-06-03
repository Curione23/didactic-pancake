package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class BoundedInputStream extends org.apache.commons.io.input.BoundedInputStream {
    public BoundedInputStream(java.io.InputStream r1, long r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.setPropagateClose(r1)
            return
    }

    public long getBytesRemaining() {
            r4 = this;
            long r0 = r4.getMaxCount()
            long r2 = r4.getCount()
            long r0 = r0 - r2
            return r0
    }
}
