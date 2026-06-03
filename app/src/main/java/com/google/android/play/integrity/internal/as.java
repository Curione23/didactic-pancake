package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class as extends com.google.android.play.integrity.internal.aq {
    static final com.google.android.play.integrity.internal.as a = null;
    private static final java.lang.Object[] d = null;
    final transient java.lang.Object[] b;
    final transient java.lang.Object[] c;

    static {
            r0 = 0
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.google.android.play.integrity.internal.as.d = r4
            com.google.android.play.integrity.internal.as r0 = new com.google.android.play.integrity.internal.as
            r5 = 0
            r6 = 0
            r3 = 0
            r1 = r0
            r2 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.play.integrity.internal.as.a = r0
            return
    }

    as(java.lang.Object[] r1, int r2, java.lang.Object[] r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r3
            return
    }

    @Override // com.google.android.play.integrity.internal.am
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            if (r1 == 0) goto L5
            java.lang.Object[] r1 = r0.c
            int r1 = r1.length
        L5:
            r1 = 0
            return r1
    }

    @Override // com.google.android.play.integrity.internal.aq, com.google.android.play.integrity.internal.am
    public final com.google.android.play.integrity.internal.at d() {
            r2 = this;
            com.google.android.play.integrity.internal.ap r0 = r2.f()
            r1 = 0
            com.google.android.play.integrity.internal.au r0 = r0.g(r1)
            return r0
    }

    @Override // com.google.android.play.integrity.internal.am
    final java.lang.Object[] e() {
            r1 = this;
            java.lang.Object[] r0 = r1.b
            return r0
    }

    @Override // com.google.android.play.integrity.internal.aq
    final com.google.android.play.integrity.internal.ap g() {
            r1 = this;
            int r0 = com.google.android.play.integrity.internal.ap.d
            com.google.android.play.integrity.internal.ap r0 = com.google.android.play.integrity.internal.ar.a
            return r0
    }

    @Override // com.google.android.play.integrity.internal.aq, java.util.Collection, java.util.Set
    public final int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.play.integrity.internal.aq
    final boolean i() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.play.integrity.internal.aq, com.google.android.play.integrity.internal.am, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r2 = this;
            com.google.android.play.integrity.internal.ap r0 = r2.f()
            r1 = 0
            com.google.android.play.integrity.internal.au r0 = r0.g(r1)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
            r1 = this;
            r0 = 0
            return r0
    }
}
