package org.apache.commons.io.filefilter;

/* JADX INFO: compiled from: D8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RegexFileFilter$$ExternalSyntheticLambda1 implements java.util.function.Function, java.io.Serializable {
    public /* synthetic */ RegexFileFilter$$ExternalSyntheticLambda1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r1) {
            r0 = this;
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.lang.String r1 = org.apache.commons.io.file.PathUtils.getFileNameString(r1)
            return r1
    }
}
