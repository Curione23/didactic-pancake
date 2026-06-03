package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class ar extends com.google.android.play.integrity.internal.ap {
    static final com.google.android.play.integrity.internal.ap a = null;
    final transient java.lang.Object[] b;

    static {
            com.google.android.play.integrity.internal.ar r0 = new com.google.android.play.integrity.internal.ar
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            com.google.android.play.integrity.internal.ar.a = r0
            return
    }

    ar(java.lang.Object[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            return
    }

    @Override // com.google.android.play.integrity.internal.ap, com.google.android.play.integrity.internal.am
    final int a(java.lang.Object[] r2, int r3) {
            r1 = this;
            java.lang.Object[] r3 = r1.b
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r2, r0, r0)
            return r0
    }

    @Override // com.google.android.play.integrity.internal.am
    final int b() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.play.integrity.internal.am
    final int c() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.play.integrity.internal.am
    final java.lang.Object[] e() {
            r1 = this;
            java.lang.Object[] r0 = r1.b
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "index"
            com.google.android.play.integrity.internal.aj.a(r3, r0, r1)
            java.lang.Object[] r0 = r2.b
            r3 = r0[r3]
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            r0 = 0
            return r0
    }
}
