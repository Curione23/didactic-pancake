package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
final class LZMA2Decoder extends org.apache.commons.compress.archivers.sevenz.AbstractCoder {
    LZMA2Decoder() {
            r3 = this;
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<org.tukaani.xz.LZMA2Options> r2 = org.tukaani.xz.LZMA2Options.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<java.lang.Number> r2 = java.lang.Number.class
            r0[r1] = r2
            r3.<init>(r0)
            return
    }

    private int getDictSize(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.tukaani.xz.LZMA2Options
            if (r0 == 0) goto Lb
            org.tukaani.xz.LZMA2Options r2 = (org.tukaani.xz.LZMA2Options) r2
            int r2 = r2.getDictSize()
            return r2
        Lb:
            int r2 = r1.numberOptionOrDefault(r2)
            return r2
    }

    private int getDictionarySize(org.apache.commons.compress.archivers.sevenz.Coder r4) throws java.io.IOException {
            r3 = this;
            byte[] r0 = r4.properties
            if (r0 == 0) goto L3e
            byte[] r0 = r4.properties
            int r0 = r0.length
            r1 = 1
            if (r0 < r1) goto L36
            byte[] r4 = r4.properties
            r0 = 0
            r4 = r4[r0]
            r0 = r4 & 255(0xff, float:3.57E-43)
            r2 = r4 & 192(0xc0, float:2.69E-43)
            if (r2 != 0) goto L2e
            r2 = 40
            if (r0 > r2) goto L26
            if (r0 != r2) goto L1d
            r4 = -1
            return r4
        L1d:
            r4 = r4 & r1
            r4 = r4 | 2
            int r0 = r0 / 2
            int r0 = r0 + 11
            int r4 = r4 << r0
            return r4
        L26:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Dictionary larger than 4GiB maximum size"
            r4.<init>(r0)
            throw r4
        L2e:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Unsupported LZMA2 property bits"
            r4.<init>(r0)
            throw r4
        L36:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "LZMA2 properties too short"
            r4.<init>(r0)
            throw r4
        L3e:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "Missing LZMA2 properties"
            r4.<init>(r0)
            throw r4
    }

    private org.tukaani.xz.LZMA2Options getOptions(java.lang.Object r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r2 instanceof org.tukaani.xz.LZMA2Options
            if (r0 == 0) goto L7
            org.tukaani.xz.LZMA2Options r2 = (org.tukaani.xz.LZMA2Options) r2
            return r2
        L7:
            org.tukaani.xz.LZMA2Options r0 = new org.tukaani.xz.LZMA2Options
            r0.<init>()
            int r2 = r1.numberOptionOrDefault(r2)
            r0.setDictSize(r2)
            return r0
    }

    private int numberOptionOrDefault(java.lang.Object r2) {
            r1 = this;
            r0 = 8388608(0x800000, float:1.1754944E-38)
            int r2 = toInt(r2, r0)
            return r2
    }

    @Override // org.apache.commons.compress.archivers.sevenz.AbstractCoder
    java.io.InputStream decode(java.lang.String r1, java.io.InputStream r2, long r3, org.apache.commons.compress.archivers.sevenz.Coder r5, byte[] r6, int r7) throws java.io.IOException {
            r0 = this;
            int r1 = r0.getDictionarySize(r5)     // Catch: java.lang.IllegalArgumentException -> L17
            int r3 = org.tukaani.xz.LZMA2InputStream.getMemoryUsage(r1)     // Catch: java.lang.IllegalArgumentException -> L17
            if (r3 > r7) goto L10
            org.tukaani.xz.LZMA2InputStream r3 = new org.tukaani.xz.LZMA2InputStream     // Catch: java.lang.IllegalArgumentException -> L17
            r3.<init>(r2, r1)     // Catch: java.lang.IllegalArgumentException -> L17
            return r3
        L10:
            org.apache.commons.compress.MemoryLimitException r1 = new org.apache.commons.compress.MemoryLimitException     // Catch: java.lang.IllegalArgumentException -> L17
            long r2 = (long) r3     // Catch: java.lang.IllegalArgumentException -> L17
            r1.<init>(r2, r7)     // Catch: java.lang.IllegalArgumentException -> L17
            throw r1     // Catch: java.lang.IllegalArgumentException -> L17
        L17:
            r1 = move-exception
            java.io.IOException r2 = new java.io.IOException
            r2.<init>(r1)
            throw r2
    }

    @Override // org.apache.commons.compress.archivers.sevenz.AbstractCoder
    java.io.OutputStream encode(java.io.OutputStream r2, java.lang.Object r3) throws java.io.IOException {
            r1 = this;
            org.tukaani.xz.LZMA2Options r3 = r1.getOptions(r3)
            org.tukaani.xz.FinishableWrapperOutputStream r0 = new org.tukaani.xz.FinishableWrapperOutputStream
            r0.<init>(r2)
            org.tukaani.xz.FinishableOutputStream r2 = r3.getOutputStream(r0)
            return r2
    }

    @Override // org.apache.commons.compress.archivers.sevenz.AbstractCoder
    byte[] getOptionsAsProperties(java.lang.Object r3) {
            r2 = this;
            int r3 = r2.getDictSize(r3)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r3)
            int r1 = 30 - r0
            int r3 = r3 >>> r1
            int r3 = r3 + (-2)
            int r0 = 19 - r0
            int r0 = r0 * 2
            int r0 = r0 + r3
            byte r3 = (byte) r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r3
            return r0
    }

    @Override // org.apache.commons.compress.archivers.sevenz.AbstractCoder
    java.lang.Object getOptionsFromCoder(org.apache.commons.compress.archivers.sevenz.Coder r1, java.io.InputStream r2) throws java.io.IOException {
            r0 = this;
            int r1 = r0.getDictionarySize(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }
}
