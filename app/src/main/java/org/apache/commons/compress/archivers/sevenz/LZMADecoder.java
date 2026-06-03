package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
final class LZMADecoder extends org.apache.commons.compress.archivers.sevenz.AbstractCoder {
    LZMADecoder() {
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

    private int getDictionarySize(org.apache.commons.compress.archivers.sevenz.Coder r3) throws java.lang.IllegalArgumentException {
            r2 = this;
            byte[] r3 = r3.properties
            r0 = 1
            r1 = 4
            long r0 = org.apache.commons.compress.utils.ByteUtils.fromLittleEndian(r3, r0, r1)
            int r3 = (int) r0
            return r3
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
    java.io.InputStream decode(java.lang.String r8, java.io.InputStream r9, long r10, org.apache.commons.compress.archivers.sevenz.Coder r12, byte[] r13, int r14) throws java.io.IOException {
            r7 = this;
            byte[] r13 = r12.properties
            if (r13 == 0) goto L4e
            byte[] r13 = r12.properties
            int r13 = r13.length
            r0 = 1
            if (r13 < r0) goto L46
            byte[] r13 = r12.properties
            r0 = 0
            r5 = r13[r0]
            int r6 = r7.getDictionarySize(r12)
            r12 = 2147483632(0x7ffffff0, float:NaN)
            if (r6 > r12) goto L31
            int r8 = org.tukaani.xz.LZMAInputStream.getMemoryUsage(r6, r5)
            if (r8 > r14) goto L2a
            org.tukaani.xz.LZMAInputStream r8 = new org.tukaani.xz.LZMAInputStream
            r1 = r8
            r2 = r9
            r3 = r10
            r1.<init>(r2, r3, r5, r6)
            r8.enableRelaxedEndCondition()
            return r8
        L2a:
            org.apache.commons.compress.MemoryLimitException r9 = new org.apache.commons.compress.MemoryLimitException
            long r10 = (long) r8
            r9.<init>(r10, r14)
            throw r9
        L31:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Dictionary larger than 4GiB maximum size used in "
            r10.<init>(r11)
            java.lang.StringBuilder r8 = r10.append(r8)
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L46:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "LZMA properties too short"
            r8.<init>(r9)
            throw r8
        L4e:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "Missing LZMA properties"
            r8.<init>(r9)
            throw r8
    }

    @Override // org.apache.commons.compress.archivers.sevenz.AbstractCoder
    java.io.OutputStream encode(java.io.OutputStream r4, java.lang.Object r5) throws java.io.IOException {
            r3 = this;
            org.apache.commons.compress.utils.FlushShieldFilterOutputStream r0 = new org.apache.commons.compress.utils.FlushShieldFilterOutputStream
            org.tukaani.xz.LZMAOutputStream r1 = new org.tukaani.xz.LZMAOutputStream
            org.tukaani.xz.LZMA2Options r5 = r3.getOptions(r5)
            r2 = 0
            r1.<init>(r4, r5, r2)
            r0.<init>(r1)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.sevenz.AbstractCoder
    byte[] getOptionsAsProperties(java.lang.Object r5) throws java.io.IOException {
            r4 = this;
            org.tukaani.xz.LZMA2Options r5 = r4.getOptions(r5)
            int r0 = r5.getPb()
            r1 = 5
            int r0 = r0 * r1
            int r2 = r5.getLp()
            int r0 = r0 + r2
            int r0 = r0 * 9
            int r2 = r5.getLc()
            int r0 = r0 + r2
            byte r0 = (byte) r0
            int r5 = r5.getDictSize()
            byte[] r1 = new byte[r1]
            r2 = 0
            r1[r2] = r0
            long r2 = (long) r5
            r5 = 1
            r0 = 4
            org.apache.commons.compress.utils.ByteUtils.toLittleEndian(r1, r2, r5, r0)
            return r1
    }

    @Override // org.apache.commons.compress.archivers.sevenz.AbstractCoder
    java.lang.Object getOptionsFromCoder(org.apache.commons.compress.archivers.sevenz.Coder r4, java.io.InputStream r5) throws java.io.IOException {
            r3 = this;
            byte[] r5 = r4.properties
            if (r5 == 0) goto L36
            byte[] r5 = r4.properties
            int r5 = r5.length
            r0 = 1
            if (r5 < r0) goto L2e
            byte[] r5 = r4.properties
            r0 = 0
            r5 = r5[r0]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r0 = r5 / 45
            int r1 = r0 * 45
            int r5 = r5 - r1
            int r1 = r5 / 9
            int r2 = r1 * 9
            int r5 = r5 - r2
            org.tukaani.xz.LZMA2Options r2 = new org.tukaani.xz.LZMA2Options
            r2.<init>()
            r2.setPb(r0)
            r2.setLcLp(r5, r1)
            int r4 = r3.getDictionarySize(r4)
            r2.setDictSize(r4)
            return r2
        L2e:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "LZMA properties too short"
            r4.<init>(r5)
            throw r4
        L36:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r5 = "Missing LZMA properties"
            r4.<init>(r5)
            throw r4
    }
}
