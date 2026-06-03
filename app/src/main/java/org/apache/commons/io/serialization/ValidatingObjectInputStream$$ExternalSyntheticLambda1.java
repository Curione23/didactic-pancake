package org.apache.commons.io.serialization;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ValidatingObjectInputStream$$ExternalSyntheticLambda1 implements java.util.function.Consumer {
    public final /* synthetic */ java.util.List f$0;

    public /* synthetic */ ValidatingObjectInputStream$$ExternalSyntheticLambda1(java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.f$0 = r1
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r2) {
            r1 = this;
            java.util.List r0 = r1.f$0
            org.apache.commons.io.serialization.FullClassNameMatcher r2 = (org.apache.commons.io.serialization.FullClassNameMatcher) r2
            r0.add(r2)
            return
    }
}
