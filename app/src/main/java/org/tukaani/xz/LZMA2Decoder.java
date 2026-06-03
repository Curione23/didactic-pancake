package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
class LZMA2Decoder extends org.tukaani.xz.LZMA2Coder implements org.tukaani.xz.FilterDecoder {
    private int dictSize;

    LZMA2Decoder(byte[] r4) throws org.tukaani.xz.UnsupportedOptionsException {
            r3 = this;
            r3.<init>()
            int r0 = r4.length
            r1 = 1
            if (r0 != r1) goto L1e
            r0 = 0
            r4 = r4[r0]
            r0 = r4 & 255(0xff, float:3.57E-43)
            r2 = 37
            if (r0 > r2) goto L1e
            r0 = r4 & 1
            r0 = r0 | 2
            r3.dictSize = r0
            int r4 = r4 >>> r1
            int r4 = r4 + 11
            int r4 = r0 << r4
            r3.dictSize = r4
            return
        L1e:
            org.tukaani.xz.UnsupportedOptionsException r4 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.String r0 = "Unsupported LZMA2 properties"
            r4.<init>(r0)
            throw r4
    }

    @Override // org.tukaani.xz.FilterDecoder
    public java.io.InputStream getInputStream(java.io.InputStream r4, org.tukaani.xz.ArrayCache r5) {
            r3 = this;
            org.tukaani.xz.LZMA2InputStream r0 = new org.tukaani.xz.LZMA2InputStream
            int r1 = r3.dictSize
            r2 = 0
            r0.<init>(r4, r1, r2, r5)
            return r0
    }

    @Override // org.tukaani.xz.FilterDecoder
    public int getMemoryUsage() {
            r1 = this;
            int r0 = r1.dictSize
            int r0 = org.tukaani.xz.LZMA2InputStream.getMemoryUsage(r0)
            return r0
    }
}
