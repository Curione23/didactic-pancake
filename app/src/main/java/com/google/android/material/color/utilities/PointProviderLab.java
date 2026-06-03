package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public final class PointProviderLab implements com.google.android.material.color.utilities.PointProvider {
    public PointProviderLab() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public double distance(double[] r8, double[] r9) {
            r7 = this;
            r0 = 0
            r1 = r8[r0]
            r3 = r9[r0]
            double r1 = r1 - r3
            r0 = 1
            r3 = r8[r0]
            r5 = r9[r0]
            double r3 = r3 - r5
            r0 = 2
            r5 = r8[r0]
            r8 = r9[r0]
            double r5 = r5 - r8
            double r1 = r1 * r1
            double r3 = r3 * r3
            double r1 = r1 + r3
            double r5 = r5 * r5
            double r1 = r1 + r5
            return r1
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public double[] fromInt(int r10) {
            r9 = this;
            double[] r10 = com.google.android.material.color.utilities.ColorUtils.labFromArgb(r10)
            r0 = 0
            r1 = r10[r0]
            r3 = 1
            r4 = r10[r3]
            r6 = 2
            r7 = r10[r6]
            r10 = 3
            double[] r10 = new double[r10]
            r10[r0] = r1
            r10[r3] = r4
            r10[r6] = r7
            return r10
    }

    @Override // com.google.android.material.color.utilities.PointProvider
    public int toInt(double[] r8) {
            r7 = this;
            r0 = 0
            r1 = r8[r0]
            r0 = 1
            r3 = r8[r0]
            r0 = 2
            r5 = r8[r0]
            int r8 = com.google.android.material.color.utilities.ColorUtils.argbFromLab(r1, r3, r5)
            return r8
    }
}
