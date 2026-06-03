package org.tukaani.xz.delta;

/* JADX INFO: loaded from: classes2.dex */
public class DeltaDecoder extends org.tukaani.xz.delta.DeltaCoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    static {
            return
    }

    public DeltaDecoder(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void decode(byte[] r7, int r8, int r9) {
            r6 = this;
            int r0 = r6.distance
            int r0 = java.lang.Math.min(r9, r0)
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L19
            int r3 = r8 + r2
            r4 = r7[r3]
            byte[] r5 = r6.history
            r5 = r5[r2]
            int r4 = r4 + r5
            byte r4 = (byte) r4
            r7[r3] = r4
            int r2 = r2 + 1
            goto L8
        L19:
            if (r2 >= r9) goto L2c
            int r0 = r8 + r2
            r3 = r7[r0]
            int r4 = r6.distance
            int r4 = r0 - r4
            r4 = r7[r4]
            int r3 = r3 + r4
            byte r3 = (byte) r3
            r7[r0] = r3
            int r2 = r2 + 1
            goto L19
        L2c:
            int r0 = r6.distance
            if (r9 < r0) goto L3c
            int r8 = r8 + r9
            int r9 = r6.distance
            int r8 = r8 - r9
            byte[] r9 = r6.history
            int r0 = r6.distance
            java.lang.System.arraycopy(r7, r8, r9, r1, r0)
            goto L4e
        L3c:
            byte[] r0 = r6.history
            byte[] r3 = r6.history
            int r4 = r6.distance
            int r4 = r4 - r2
            java.lang.System.arraycopy(r0, r2, r3, r1, r4)
            byte[] r0 = r6.history
            int r1 = r6.distance
            int r1 = r1 - r2
            java.lang.System.arraycopy(r7, r8, r0, r1, r9)
        L4e:
            return
    }
}
