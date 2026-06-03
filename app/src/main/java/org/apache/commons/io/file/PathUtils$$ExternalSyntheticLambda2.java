package org.apache.commons.io.file;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class PathUtils$$ExternalSyntheticLambda2 implements org.apache.commons.io.function.IOSupplier {
    public final /* synthetic */ java.net.URL f$0;

    public /* synthetic */ PathUtils$$ExternalSyntheticLambda2(java.net.URL r1) {
            r0 = this;
            r0.<init>()
            r0.f$0 = r1
            return
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public final java.lang.Object get() {
            r1 = this;
            java.net.URL r0 = r1.f$0
            java.io.InputStream r0 = org.apache.commons.io.file.PathUtils.$r8$lambda$GF8JHa7vXNEFej4auUeh7g5xcuU(r0)
            return r0
    }
}
