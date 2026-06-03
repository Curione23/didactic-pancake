package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public enum TonePolarity extends java.lang.Enum<com.google.android.material.color.utilities.TonePolarity> {
    private static final /* synthetic */ com.google.android.material.color.utilities.TonePolarity[] $VALUES = null;
    public static final com.google.android.material.color.utilities.TonePolarity DARKER = null;
    public static final com.google.android.material.color.utilities.TonePolarity FARTHER = null;
    public static final com.google.android.material.color.utilities.TonePolarity LIGHTER = null;
    public static final com.google.android.material.color.utilities.TonePolarity NEARER = null;

    static {
            com.google.android.material.color.utilities.TonePolarity r0 = new com.google.android.material.color.utilities.TonePolarity
            java.lang.String r1 = "DARKER"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.material.color.utilities.TonePolarity.DARKER = r0
            com.google.android.material.color.utilities.TonePolarity r1 = new com.google.android.material.color.utilities.TonePolarity
            java.lang.String r2 = "LIGHTER"
            r3 = 1
            r1.<init>(r2, r3)
            com.google.android.material.color.utilities.TonePolarity.LIGHTER = r1
            com.google.android.material.color.utilities.TonePolarity r2 = new com.google.android.material.color.utilities.TonePolarity
            java.lang.String r3 = "NEARER"
            r4 = 2
            r2.<init>(r3, r4)
            com.google.android.material.color.utilities.TonePolarity.NEARER = r2
            com.google.android.material.color.utilities.TonePolarity r3 = new com.google.android.material.color.utilities.TonePolarity
            java.lang.String r4 = "FARTHER"
            r5 = 3
            r3.<init>(r4, r5)
            com.google.android.material.color.utilities.TonePolarity.FARTHER = r3
            com.google.android.material.color.utilities.TonePolarity[] r0 = new com.google.android.material.color.utilities.TonePolarity[]{r0, r1, r2, r3}
            com.google.android.material.color.utilities.TonePolarity.$VALUES = r0
            return
    }

    TonePolarity(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.android.material.color.utilities.TonePolarity valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.material.color.utilities.TonePolarity> r0 = com.google.android.material.color.utilities.TonePolarity.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.material.color.utilities.TonePolarity r1 = (com.google.android.material.color.utilities.TonePolarity) r1
            return r1
    }

    public static com.google.android.material.color.utilities.TonePolarity[] values() {
            com.google.android.material.color.utilities.TonePolarity[] r0 = com.google.android.material.color.utilities.TonePolarity.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.android.material.color.utilities.TonePolarity[] r0 = (com.google.android.material.color.utilities.TonePolarity[]) r0
            return r0
    }
}
