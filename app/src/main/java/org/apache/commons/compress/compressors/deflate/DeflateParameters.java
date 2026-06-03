package org.apache.commons.compress.compressors.deflate;

/* JADX INFO: loaded from: classes2.dex */
public class DeflateParameters {
    static final int MAX_LEVEL = 9;
    static final int MIN_LEVEL = 0;
    private int compressionLevel;
    private boolean zlibHeader;

    public DeflateParameters() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zlibHeader = r0
            r0 = -1
            r1.compressionLevel = r0
            return
    }

    public int getCompressionLevel() {
            r1 = this;
            int r0 = r1.compressionLevel
            return r0
    }

    public void setCompressionLevel(int r4) {
            r3 = this;
            if (r4 < 0) goto L9
            r0 = 9
            if (r4 > r0) goto L9
            r3.compressionLevel = r4
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid Deflate compression level: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public void setWithZlibHeader(boolean r1) {
            r0 = this;
            r0.zlibHeader = r1
            return
    }

    public boolean withZlibHeader() {
            r1 = this;
            boolean r0 = r1.zlibHeader
            return r0
    }
}
