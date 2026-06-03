package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public final class SPARCOptions extends org.tukaani.xz.BCJOptions {
    private static final int ALIGNMENT = 4;

    public SPARCOptions() {
            r1 = this;
            r0 = 4
            r1.<init>(r0)
            return
    }

    @Override // org.tukaani.xz.BCJOptions
    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            java.lang.Object r0 = super.clone()
            return r0
    }

    @Override // org.tukaani.xz.BCJOptions, org.tukaani.xz.FilterOptions
    public /* bridge */ /* synthetic */ int getDecoderMemoryUsage() {
            r1 = this;
            int r0 = super.getDecoderMemoryUsage()
            return r0
    }

    @Override // org.tukaani.xz.BCJOptions, org.tukaani.xz.FilterOptions
    public /* bridge */ /* synthetic */ int getEncoderMemoryUsage() {
            r1 = this;
            int r0 = super.getEncoderMemoryUsage()
            return r0
    }

    @Override // org.tukaani.xz.FilterOptions
    org.tukaani.xz.FilterEncoder getFilterEncoder() {
            r3 = this;
            org.tukaani.xz.BCJEncoder r0 = new org.tukaani.xz.BCJEncoder
            r1 = 9
            r0.<init>(r3, r1)
            return r0
    }

    @Override // org.tukaani.xz.FilterOptions
    public java.io.InputStream getInputStream(java.io.InputStream r4, org.tukaani.xz.ArrayCache r5) {
            r3 = this;
            org.tukaani.xz.SimpleInputStream r5 = new org.tukaani.xz.SimpleInputStream
            org.tukaani.xz.simple.SPARC r0 = new org.tukaani.xz.simple.SPARC
            r1 = 0
            int r2 = r3.startOffset
            r0.<init>(r1, r2)
            r5.<init>(r4, r0)
            return r5
    }

    @Override // org.tukaani.xz.FilterOptions
    public org.tukaani.xz.FinishableOutputStream getOutputStream(org.tukaani.xz.FinishableOutputStream r4, org.tukaani.xz.ArrayCache r5) {
            r3 = this;
            org.tukaani.xz.SimpleOutputStream r5 = new org.tukaani.xz.SimpleOutputStream
            org.tukaani.xz.simple.SPARC r0 = new org.tukaani.xz.simple.SPARC
            r1 = 1
            int r2 = r3.startOffset
            r0.<init>(r1, r2)
            r5.<init>(r4, r0)
            return r5
    }

    @Override // org.tukaani.xz.BCJOptions
    public /* bridge */ /* synthetic */ int getStartOffset() {
            r1 = this;
            int r0 = super.getStartOffset()
            return r0
    }

    @Override // org.tukaani.xz.BCJOptions
    public /* bridge */ /* synthetic */ void setStartOffset(int r1) throws org.tukaani.xz.UnsupportedOptionsException {
            r0 = this;
            super.setStartOffset(r1)
            return
    }
}
