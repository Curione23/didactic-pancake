package com.google.android.material.color.utilities;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MaterialDynamicColors$$ExternalSyntheticLambda162 implements java.util.function.Function {
    public final /* synthetic */ com.google.android.material.color.utilities.MaterialDynamicColors f$0;

    public /* synthetic */ MaterialDynamicColors$$ExternalSyntheticLambda162(com.google.android.material.color.utilities.MaterialDynamicColors r1) {
            r0 = this;
            r0.<init>()
            r0.f$0 = r1
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r2) {
            r1 = this;
            com.google.android.material.color.utilities.MaterialDynamicColors r0 = r1.f$0
            com.google.android.material.color.utilities.DynamicScheme r2 = (com.google.android.material.color.utilities.DynamicScheme) r2
            com.google.android.material.color.utilities.DynamicColor r2 = r0.highestSurface(r2)
            return r2
    }
}
