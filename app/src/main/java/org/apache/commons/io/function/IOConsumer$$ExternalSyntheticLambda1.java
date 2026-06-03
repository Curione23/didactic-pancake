package org.apache.commons.io.function;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class IOConsumer$$ExternalSyntheticLambda1 implements java.util.function.BiFunction {
    public /* synthetic */ IOConsumer$$ExternalSyntheticLambda1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.function.BiFunction
    public final java.lang.Object apply(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            org.apache.commons.io.IOIndexedException r0 = new org.apache.commons.io.IOIndexedException
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.io.IOException r3 = (java.io.IOException) r3
            r0.<init>(r2, r3)
            java.io.IOException r0 = (java.io.IOException) r0
            return r0
    }
}
