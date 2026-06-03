package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
class LZMA2Encoder extends org.tukaani.xz.LZMA2Coder implements org.tukaani.xz.FilterEncoder {
    private final org.tukaani.xz.LZMA2Options options;
    private final byte[] props;

    LZMA2Encoder(org.tukaani.xz.LZMA2Options r6) {
            r5 = this;
            r5.<init>()
            r0 = 1
            byte[] r1 = new byte[r0]
            r5.props = r1
            byte[] r2 = r6.getPresetDict()
            if (r2 != 0) goto L35
            int r2 = r6.getMode()
            r3 = 0
            if (r2 != 0) goto L18
            r1[r3] = r3
            goto L2c
        L18:
            int r2 = r6.getDictSize()
            r4 = 4096(0x1000, float:5.74E-42)
            int r2 = java.lang.Math.max(r2, r4)
            int r2 = r2 - r0
            int r0 = org.tukaani.xz.lzma.LZMAEncoder.getDistSlot(r2)
            int r0 = r0 + (-23)
            byte r0 = (byte) r0
            r1[r3] = r0
        L2c:
            java.lang.Object r6 = r6.clone()
            org.tukaani.xz.LZMA2Options r6 = (org.tukaani.xz.LZMA2Options) r6
            r5.options = r6
            return
        L35:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "XZ doesn't support a preset dictionary for now"
            r6.<init>(r0)
            throw r6
    }

    @Override // org.tukaani.xz.FilterEncoder
    public long getFilterID() {
            r2 = this;
            r0 = 33
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
            org.tukaani.xz.LZMA2Options r0 = r1.options
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
