package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public final class ToneDeltaPair {
    private final double delta;
    private final com.google.android.material.color.utilities.TonePolarity polarity;
    private final com.google.android.material.color.utilities.DynamicColor roleA;
    private final com.google.android.material.color.utilities.DynamicColor roleB;
    private final boolean stayTogether;

    public ToneDeltaPair(com.google.android.material.color.utilities.DynamicColor r1, com.google.android.material.color.utilities.DynamicColor r2, double r3, com.google.android.material.color.utilities.TonePolarity r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.roleA = r1
            r0.roleB = r2
            r0.delta = r3
            r0.polarity = r5
            r0.stayTogether = r6
            return
    }

    public double getDelta() {
            r2 = this;
            double r0 = r2.delta
            return r0
    }

    public com.google.android.material.color.utilities.TonePolarity getPolarity() {
            r1 = this;
            com.google.android.material.color.utilities.TonePolarity r0 = r1.polarity
            return r0
    }

    public com.google.android.material.color.utilities.DynamicColor getRoleA() {
            r1 = this;
            com.google.android.material.color.utilities.DynamicColor r0 = r1.roleA
            return r0
    }

    public com.google.android.material.color.utilities.DynamicColor getRoleB() {
            r1 = this;
            com.google.android.material.color.utilities.DynamicColor r0 = r1.roleB
            return r0
    }

    public boolean getStayTogether() {
            r1 = this;
            boolean r0 = r1.stayTogether
            return r0
    }
}
