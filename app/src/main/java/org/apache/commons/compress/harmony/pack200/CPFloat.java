package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class CPFloat extends org.apache.commons.compress.harmony.pack200.CPConstant<org.apache.commons.compress.harmony.pack200.CPFloat> {
    private final float theFloat;

    public CPFloat(float r1) {
            r0 = this;
            r0.<init>()
            r0.theFloat = r1
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            org.apache.commons.compress.harmony.pack200.CPFloat r1 = (org.apache.commons.compress.harmony.pack200.CPFloat) r1
            int r1 = r0.compareTo(r1)
            return r1
    }

    public int compareTo(org.apache.commons.compress.harmony.pack200.CPFloat r2) {
            r1 = this;
            float r0 = r1.theFloat
            float r2 = r2.theFloat
            int r2 = java.lang.Float.compare(r0, r2)
            return r2
    }

    public float getFloat() {
            r1 = this;
            float r0 = r1.theFloat
            return r0
    }
}
