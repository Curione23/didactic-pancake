package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
class BCJDecoder extends org.tukaani.xz.BCJCoder implements org.tukaani.xz.FilterDecoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final long filterID;
    private final int startOffset;

    static {
            return
    }

    BCJDecoder(long r4, byte[] r6) throws org.tukaani.xz.UnsupportedOptionsException {
            r3 = this;
            r3.<init>()
            r3.filterID = r4
            int r4 = r6.length
            r5 = 0
            if (r4 != 0) goto Lc
            r3.startOffset = r5
            goto L20
        Lc:
            int r4 = r6.length
            r0 = 4
            if (r4 != r0) goto L21
            r4 = r5
        L11:
            if (r5 >= r0) goto L1e
            r1 = r6[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r5 * 8
            int r1 = r1 << r2
            r4 = r4 | r1
            int r5 = r5 + 1
            goto L11
        L1e:
            r3.startOffset = r4
        L20:
            return
        L21:
            org.tukaani.xz.UnsupportedOptionsException r4 = new org.tukaani.xz.UnsupportedOptionsException
            java.lang.String r5 = "Unsupported BCJ filter properties"
            r4.<init>(r5)
            throw r4
    }

    @Override // org.tukaani.xz.FilterDecoder
    public java.io.InputStream getInputStream(java.io.InputStream r6, org.tukaani.xz.ArrayCache r7) {
            r5 = this;
            long r0 = r5.filterID
            r2 = 4
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = 0
            if (r7 != 0) goto L11
            org.tukaani.xz.simple.X86 r7 = new org.tukaani.xz.simple.X86
            int r0 = r5.startOffset
            r7.<init>(r2, r0)
            goto L74
        L11:
            r3 = 5
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 != 0) goto L1f
            org.tukaani.xz.simple.PowerPC r7 = new org.tukaani.xz.simple.PowerPC
            int r0 = r5.startOffset
            r7.<init>(r2, r0)
            goto L74
        L1f:
            r3 = 6
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 != 0) goto L2d
            org.tukaani.xz.simple.IA64 r7 = new org.tukaani.xz.simple.IA64
            int r0 = r5.startOffset
            r7.<init>(r2, r0)
            goto L74
        L2d:
            r3 = 7
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 != 0) goto L3b
            org.tukaani.xz.simple.ARM r7 = new org.tukaani.xz.simple.ARM
            int r0 = r5.startOffset
            r7.<init>(r2, r0)
            goto L74
        L3b:
            r3 = 8
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 != 0) goto L49
            org.tukaani.xz.simple.ARMThumb r7 = new org.tukaani.xz.simple.ARMThumb
            int r0 = r5.startOffset
            r7.<init>(r2, r0)
            goto L74
        L49:
            r3 = 9
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 != 0) goto L57
            org.tukaani.xz.simple.SPARC r7 = new org.tukaani.xz.simple.SPARC
            int r0 = r5.startOffset
            r7.<init>(r2, r0)
            goto L74
        L57:
            r3 = 10
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 != 0) goto L65
            org.tukaani.xz.simple.ARM64 r7 = new org.tukaani.xz.simple.ARM64
            int r0 = r5.startOffset
            r7.<init>(r2, r0)
            goto L74
        L65:
            r2 = 11
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 != 0) goto L73
            org.tukaani.xz.simple.RISCVDecoder r7 = new org.tukaani.xz.simple.RISCVDecoder
            int r0 = r5.startOffset
            r7.<init>(r0)
            goto L74
        L73:
            r7 = 0
        L74:
            org.tukaani.xz.SimpleInputStream r0 = new org.tukaani.xz.SimpleInputStream
            r0.<init>(r6, r7)
            return r0
    }

    @Override // org.tukaani.xz.FilterDecoder
    public int getMemoryUsage() {
            r1 = this;
            int r0 = org.tukaani.xz.SimpleInputStream.getMemoryUsage()
            return r0
    }
}
