package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
class DeltaDecoder extends org.tukaani.xz.DeltaCoder implements org.tukaani.xz.FilterDecoder {
    private final int distance;

    DeltaDecoder(byte[] r3) throws org.tukaani.xz.UnsupportedOptionsException {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 1
            if (r0 != r1) goto L10
            r0 = 0
            r3 = r3[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r1
            r2.distance = r3
            return
        L10:
            org.tukaani.xz.UnsupportedOptionsException r3 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.String r0 = "Unsupported Delta filter properties"
            r3.<init>(r0)
            throw r3
    }

    @Override // org.tukaani.xz.FilterDecoder
    public java.io.InputStream getInputStream(java.io.InputStream r2, org.tukaani.xz.ArrayCache r3) {
            r1 = this;
            org.tukaani.xz.DeltaInputStream r3 = new org.tukaani.xz.DeltaInputStream
            int r0 = r1.distance
            r3.<init>(r2, r0)
            return r3
    }

    @Override // org.tukaani.xz.FilterDecoder
    public int getMemoryUsage() {
            r1 = this;
            r0 = 1
            return r0
    }
}
