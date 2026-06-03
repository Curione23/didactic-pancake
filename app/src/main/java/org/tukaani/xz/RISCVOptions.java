package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
public final class RISCVOptions extends org.tukaani.xz.BCJOptions {
    private static final int ALIGNMENT = 2;

    public RISCVOptions() {
            r1 = this;
            r0 = 2
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
            r1 = 11
            r0.<init>(r3, r1)
            return r0
    }

    @Override // org.tukaani.xz.FilterOptions
    public java.io.InputStream getInputStream(java.io.InputStream r3, org.tukaani.xz.ArrayCache r4) {
            r2 = this;
            org.tukaani.xz.SimpleInputStream r4 = new org.tukaani.xz.SimpleInputStream
            org.tukaani.xz.simple.RISCVDecoder r0 = new org.tukaani.xz.simple.RISCVDecoder
            int r1 = r2.startOffset
            r0.<init>(r1)
            r4.<init>(r3, r0)
            return r4
    }

    @Override // org.tukaani.xz.FilterOptions
    public org.tukaani.xz.FinishableOutputStream getOutputStream(org.tukaani.xz.FinishableOutputStream r3, org.tukaani.xz.ArrayCache r4) {
            r2 = this;
            org.tukaani.xz.SimpleOutputStream r4 = new org.tukaani.xz.SimpleOutputStream
            org.tukaani.xz.simple.RISCVEncoder r0 = new org.tukaani.xz.simple.RISCVEncoder
            int r1 = r2.startOffset
            r0.<init>(r1)
            r4.<init>(r3, r0)
            return r4
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
