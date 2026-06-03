package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
class BCJEncoder extends org.tukaani.xz.BCJCoder implements org.tukaani.xz.FilterEncoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final long filterID;
    private final org.tukaani.xz.BCJOptions options;
    private final byte[] props;

    static {
            return
    }

    BCJEncoder(org.tukaani.xz.BCJOptions r6, long r7) {
            r5 = this;
            r5.<init>()
            int r0 = r6.getStartOffset()
            r1 = 0
            if (r0 != 0) goto Lf
            byte[] r0 = new byte[r1]
            r5.props = r0
            goto L22
        Lf:
            r2 = 4
            byte[] r3 = new byte[r2]
            r5.props = r3
        L14:
            if (r1 >= r2) goto L22
            byte[] r3 = r5.props
            int r4 = r1 * 8
            int r4 = r0 >>> r4
            byte r4 = (byte) r4
            r3[r1] = r4
            int r1 = r1 + 1
            goto L14
        L22:
            r5.filterID = r7
            java.lang.Object r6 = r6.clone()
            org.tukaani.xz.BCJOptions r6 = (org.tukaani.xz.BCJOptions) r6
            r5.options = r6
            return
    }

    @Override // org.tukaani.xz.FilterEncoder
    public long getFilterID() {
            r2 = this;
            long r0 = r2.filterID
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
            org.tukaani.xz.BCJOptions r0 = r1.options
            org.tukaani.xz.FinishableOutputStream r2 = r0.getOutputStream(r2, r3)
            return r2
    }

    @Override // org.tukaani.xz.FilterEncoder
    public boolean supportsFlushing() {
            r1 = this;
            r0 = 0
            return r0
    }
}
