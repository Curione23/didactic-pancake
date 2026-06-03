package org.tukaani.xz;

/* JADX INFO: loaded from: classes2.dex */
class RawCoder {
    RawCoder() {
            r0 = this;
            r0.<init>()
            return
    }

    static void validate(org.tukaani.xz.FilterCoder[] r4) throws org.tukaani.xz.UnsupportedOptionsException {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r4.length
            int r2 = r2 + (-1)
            java.lang.String r3 = "Unsupported XZ filter chain"
            if (r1 >= r2) goto L1a
            r2 = r4[r1]
            boolean r2 = r2.nonLastOK()
            if (r2 == 0) goto L14
            int r1 = r1 + 1
            goto L2
        L14:
            org.tukaani.xz.UnsupportedOptionsException r4 = new org.tukaani.xz.UnsupportedOptionsException
            r4.<init>(r3)
            throw r4
        L1a:
            int r1 = r4.length
            int r1 = r1 + (-1)
            r1 = r4[r1]
            boolean r1 = r1.lastOK()
            if (r1 == 0) goto L40
            r1 = r0
        L26:
            int r2 = r4.length
            if (r0 >= r2) goto L36
            r2 = r4[r0]
            boolean r2 = r2.changesSize()
            if (r2 == 0) goto L33
            int r1 = r1 + 1
        L33:
            int r0 = r0 + 1
            goto L26
        L36:
            r4 = 3
            if (r1 > r4) goto L3a
            return
        L3a:
            org.tukaani.xz.UnsupportedOptionsException r4 = new org.tukaani.xz.UnsupportedOptionsException
            r4.<init>(r3)
            throw r4
        L40:
            org.tukaani.xz.UnsupportedOptionsException r4 = new org.tukaani.xz.UnsupportedOptionsException
            r4.<init>(r3)
            throw r4
    }
}
