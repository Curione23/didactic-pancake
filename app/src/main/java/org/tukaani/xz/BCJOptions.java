package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
abstract class BCJOptions extends org.tukaani.xz.FilterOptions {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final int alignment;
    int startOffset;

    static {
            return
    }

    BCJOptions(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.startOffset = r0
            r1.alignment = r2
            return
    }

    public java.lang.Object clone() {
            r1 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L5
            return r0
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
    }

    @Override // org.tukaani.xz.FilterOptions
    public int getDecoderMemoryUsage() {
            r1 = this;
            int r0 = org.tukaani.xz.SimpleInputStream.getMemoryUsage()
            return r0
    }

    @Override // org.tukaani.xz.FilterOptions
    public int getEncoderMemoryUsage() {
            r1 = this;
            int r0 = org.tukaani.xz.SimpleOutputStream.getMemoryUsage()
            return r0
    }

    public int getStartOffset() {
            r1 = this;
            int r0 = r1.startOffset
            return r0
    }

    public void setStartOffset(int r3) throws org.tukaani.xz.UnsupportedOptionsException {
            r2 = this;
            int r0 = r2.alignment
            int r0 = r0 + (-1)
            r0 = r0 & r3
            if (r0 != 0) goto La
            r2.startOffset = r3
            return
        La:
            org.tukaani.xz.UnsupportedOptionsException r3 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Start offset must be a multiple of "
            r0.<init>(r1)
            int r1 = r2.alignment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }
}
