package org.tukaani.xz.delta;

/* JADX INFO: loaded from: classes2.dex */
public class DeltaEncoder extends org.tukaani.xz.delta.DeltaCoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    static {
            return
    }

    public DeltaEncoder(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void encode(byte[] r6, int r7, int r8, byte[] r9) {
            r5 = this;
            int r0 = r5.distance
            int r0 = java.lang.Math.min(r8, r0)
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L19
            int r3 = r7 + r2
            r3 = r6[r3]
            byte[] r4 = r5.history
            r4 = r4[r2]
            int r3 = r3 - r4
            byte r3 = (byte) r3
            r9[r2] = r3
            int r2 = r2 + 1
            goto L8
        L19:
            int r0 = r5.distance
            if (r8 < r0) goto L2a
            int r0 = r7 + r8
            int r3 = r5.distance
            int r0 = r0 - r3
            byte[] r3 = r5.history
            int r4 = r5.distance
            java.lang.System.arraycopy(r6, r0, r3, r1, r4)
            goto L3c
        L2a:
            byte[] r0 = r5.history
            byte[] r3 = r5.history
            int r4 = r5.distance
            int r4 = r4 - r2
            java.lang.System.arraycopy(r0, r2, r3, r1, r4)
            byte[] r0 = r5.history
            int r1 = r5.distance
            int r1 = r1 - r2
            java.lang.System.arraycopy(r6, r7, r0, r1, r8)
        L3c:
            if (r2 >= r8) goto L4e
            int r0 = r7 + r2
            r1 = r6[r0]
            int r3 = r5.distance
            int r0 = r0 - r3
            r0 = r6[r0]
            int r1 = r1 - r0
            byte r0 = (byte) r1
            r9[r2] = r0
            int r2 = r2 + 1
            goto L3c
        L4e:
            return
    }
}
