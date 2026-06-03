package org.tukaani.xz.lz;

/* JADX INFO: loaded from: classes2.dex */
final class MatchLength {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int EXTRA_SIZE = 0;

    static {
            return
    }

    MatchLength() {
            r0 = this;
            r0.<init>()
            return
    }

    static int getLen(byte[] r2, int r3, int r4, int r5, int r6) {
            int r6 = r6 + r3
            int r5 = r5 + r3
        L2:
            if (r5 >= r6) goto Lf
            r0 = r2[r5]
            int r1 = r5 - r4
            r1 = r2[r1]
            if (r0 != r1) goto Lf
            int r5 = r5 + 1
            goto L2
        Lf:
            int r5 = r5 - r3
            return r5
    }
}
