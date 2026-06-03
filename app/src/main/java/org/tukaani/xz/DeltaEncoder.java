package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
class DeltaEncoder extends org.tukaani.xz.DeltaCoder implements org.tukaani.xz.FilterEncoder {
    private final org.tukaani.xz.DeltaOptions options;
    private final byte[] props;

    DeltaEncoder(org.tukaani.xz.DeltaOptions r4) {
            r3 = this;
            r3.<init>()
            r0 = 1
            byte[] r1 = new byte[r0]
            r3.props = r1
            int r2 = r4.getDistance()
            int r2 = r2 - r0
            byte r0 = (byte) r2
            r2 = 0
            r1[r2] = r0
            java.lang.Object r4 = r4.clone()
            org.tukaani.xz.DeltaOptions r4 = (org.tukaani.xz.DeltaOptions) r4
            r3.options = r4
            return
    }

    @Override // org.tukaani.xz.FilterEncoder
    public long getFilterID() {
            r2 = this;
            r0 = 3
            return r0
    }

    @Override // org.tukaani.xz.FilterEncoder
    public byte[] getFilterProps() {
            r1 = this;
            byte[] r0 = r1.props
            return r0
    }

    @Override // org.tukaani.xz.FilterEncoder
    public org.tukaani.xz.FinishableOutputStream getOutputStream(org.tukaani.xz.FinishableOutputStream r2, org.tukaani.xz.ArrayCache r3) {
            r1 = this;
            org.tukaani.xz.DeltaOptions r0 = r1.options
            org.tukaani.xz.FinishableOutputStream r2 = r0.getOutputStream(r2, r3)
            return r2
    }

    @Override // org.tukaani.xz.FilterEncoder
    public boolean supportsFlushing() {
            r1 = this;
            r0 = 1
            return r0
    }
}
