package org.apache.commons.lang3.text;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class StrBuilder$$ExternalSyntheticLambda2 implements java.util.function.Supplier {
    public final /* synthetic */ org.apache.commons.lang3.text.StrBuilder f$0;

    public /* synthetic */ StrBuilder$$ExternalSyntheticLambda2(org.apache.commons.lang3.text.StrBuilder r1) {
            r0 = this;
            r0.<init>()
            r0.f$0 = r1
            return
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
            r1 = this;
            org.apache.commons.lang3.text.StrBuilder r0 = r1.f$0
            java.lang.String r0 = r0.getNullText()
            return r0
    }
}
