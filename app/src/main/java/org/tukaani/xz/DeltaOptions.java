package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public final class DeltaOptions extends org.tukaani.xz.FilterOptions {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DISTANCE_MAX = 256;
    public static final int DISTANCE_MIN = 1;
    private int distance;

    static {
            return
    }

    public DeltaOptions() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.distance = r0
            return
    }

    public DeltaOptions(int r2) throws org.tukaani.xz.UnsupportedOptionsException {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.distance = r0
            r1.setDistance(r2)
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
            r0 = 1
            return r0
    }

    public int getDistance() {
            r1 = this;
            int r0 = r1.distance
            return r0
    }

    @Override // org.tukaani.xz.FilterOptions
    public int getEncoderMemoryUsage() {
            r1 = this;
            int r0 = org.tukaani.xz.DeltaOutputStream.getMemoryUsage()
            return r0
    }

    @Override // org.tukaani.xz.FilterOptions
    org.tukaani.xz.FilterEncoder getFilterEncoder() {
            r1 = this;
            org.tukaani.xz.DeltaEncoder r0 = new org.tukaani.xz.DeltaEncoder
            r0.<init>(r1)
            return r0
    }

    @Override // org.tukaani.xz.FilterOptions
    public java.io.InputStream getInputStream(java.io.InputStream r2, org.tukaani.xz.ArrayCache r3) {
            r1 = this;
            org.tukaani.xz.DeltaInputStream r3 = new org.tukaani.xz.DeltaInputStream
            int r0 = r1.distance
            r3.<init>(r2, r0)
            return r3
    }

    @Override // org.tukaani.xz.FilterOptions
    public org.tukaani.xz.FinishableOutputStream getOutputStream(org.tukaani.xz.FinishableOutputStream r1, org.tukaani.xz.ArrayCache r2) {
            r0 = this;
            org.tukaani.xz.DeltaOutputStream r2 = new org.tukaani.xz.DeltaOutputStream
            r2.<init>(r1, r0)
            return r2
    }

    public void setDistance(int r4) throws org.tukaani.xz.UnsupportedOptionsException {
            r3 = this;
            r0 = 1
            if (r4 < r0) goto La
            r0 = 256(0x100, float:3.59E-43)
            if (r4 > r0) goto La
            r3.distance = r4
            return
        La:
            org.tukaani.xz.UnsupportedOptionsException r0 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Delta distance must be in the range [1, 256]: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }
}
