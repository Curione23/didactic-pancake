package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class CPDouble extends org.apache.commons.compress.harmony.pack200.CPConstant<org.apache.commons.compress.harmony.pack200.CPDouble> {
    private final double theDouble;

    public CPDouble(double r1) {
            r0 = this;
            r0.<init>()
            r0.theDouble = r1
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            org.apache.commons.compress.harmony.pack200.CPDouble r1 = (org.apache.commons.compress.harmony.pack200.CPDouble) r1
            int r1 = r0.compareTo(r1)
            return r1
    }

    public int compareTo(org.apache.commons.compress.harmony.pack200.CPDouble r5) {
            r4 = this;
            double r0 = r4.theDouble
            double r2 = r5.theDouble
            int r5 = java.lang.Double.compare(r0, r2)
            return r5
    }

    public double getDouble() {
            r2 = this;
            double r0 = r2.theDouble
            return r0
    }
}
