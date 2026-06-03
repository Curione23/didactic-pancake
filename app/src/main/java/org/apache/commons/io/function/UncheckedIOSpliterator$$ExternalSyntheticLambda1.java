package org.apache.commons.io.function;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class UncheckedIOSpliterator$$ExternalSyntheticLambda1 implements org.apache.commons.io.function.IOConsumer {
    public final /* synthetic */ java.util.function.Consumer f$0;

    public /* synthetic */ UncheckedIOSpliterator$$ExternalSyntheticLambda1(java.util.function.Consumer r1) {
            r0 = this;
            r0.<init>()
            r0.f$0 = r1
            return
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public final void accept(java.lang.Object r2) {
            r1 = this;
            java.util.function.Consumer r0 = r1.f$0
            r0.accept(r2)
            return
    }
}
