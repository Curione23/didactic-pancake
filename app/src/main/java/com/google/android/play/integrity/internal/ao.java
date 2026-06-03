package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class ao extends com.google.android.play.integrity.internal.ap {
    final transient int a;
    final transient int b;
    final /* synthetic */ com.google.android.play.integrity.internal.ap c;

    ao(com.google.android.play.integrity.internal.ap r1, int r2, int r3) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.c = r1
            r0.<init>()
            r0.a = r2
            r0.b = r3
            return
    }

    @Override // com.google.android.play.integrity.internal.am
    final int b() {
            r2 = this;
            com.google.android.play.integrity.internal.ap r0 = r2.c
            int r0 = r0.c()
            int r1 = r2.a
            int r0 = r0 + r1
            int r1 = r2.b
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.play.integrity.internal.am
    final int c() {
            r2 = this;
            com.google.android.play.integrity.internal.ap r0 = r2.c
            int r0 = r0.c()
            int r1 = r2.a
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.play.integrity.internal.am
    final java.lang.Object[] e() {
            r1 = this;
            com.google.android.play.integrity.internal.ap r0 = r1.c
            java.lang.Object[] r0 = r0.e()
            return r0
    }

    @Override // com.google.android.play.integrity.internal.ap
    public final com.google.android.play.integrity.internal.ap f(int r3, int r4) {
            r2 = this;
            int r0 = r2.b
            com.google.android.play.integrity.internal.aj.c(r3, r4, r0)
            int r0 = r2.a
            com.google.android.play.integrity.internal.ap r1 = r2.c
            int r3 = r3 + r0
            int r4 = r4 + r0
            com.google.android.play.integrity.internal.ap r3 = r1.f(r3, r4)
            return r3
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.b
            java.lang.String r1 = "index"
            com.google.android.play.integrity.internal.aj.a(r3, r0, r1)
            com.google.android.play.integrity.internal.ap r0 = r2.c
            int r1 = r2.a
            int r3 = r3 + r1
            java.lang.Object r3 = r0.get(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // com.google.android.play.integrity.internal.ap, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.google.android.play.integrity.internal.ap r1 = r0.f(r1, r2)
            return r1
    }
}
