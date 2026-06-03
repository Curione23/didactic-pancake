package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class aq extends com.google.android.play.integrity.internal.am implements java.util.Set {
    private transient com.google.android.play.integrity.internal.ap a;

    aq() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.play.integrity.internal.aq h() {
            com.google.android.play.integrity.internal.as r0 = com.google.android.play.integrity.internal.as.a
            return r0
    }

    @Override // com.google.android.play.integrity.internal.am
    public abstract com.google.android.play.integrity.internal.at d();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.play.integrity.internal.aq
            r2 = 0
            if (r1 == 0) goto L17
            r1 = r5
            com.google.android.play.integrity.internal.aq r1 = (com.google.android.play.integrity.internal.aq) r1
            r1.i()
            int r1 = r5.hashCode()
            if (r1 != 0) goto L16
            goto L17
        L16:
            return r2
        L17:
            if (r5 != r4) goto L1a
            goto L33
        L1a:
            boolean r1 = r5 instanceof java.util.Set
            if (r1 == 0) goto L32
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L32
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L32
            if (r1 != r3) goto L32
            boolean r5 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L31
            goto L32
        L31:
            return r0
        L32:
            r0 = r2
        L33:
            return r0
    }

    public final com.google.android.play.integrity.internal.ap f() {
            r1 = this;
            com.google.android.play.integrity.internal.ap r0 = r1.a
            if (r0 != 0) goto La
            com.google.android.play.integrity.internal.ap r0 = r1.g()
            r1.a = r0
        La:
            return r0
    }

    com.google.android.play.integrity.internal.ap g() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r4 = this;
            java.util.Iterator r0 = r4.iterator()
            r1 = 0
            r2 = r1
        L6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1a
            java.lang.Object r3 = r0.next()
            if (r3 == 0) goto L17
            int r3 = r3.hashCode()
            goto L18
        L17:
            r3 = r1
        L18:
            int r2 = r2 + r3
            goto L6
        L1a:
            return r2
    }

    boolean i() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.play.integrity.internal.am, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            com.google.android.play.integrity.internal.at r0 = r1.d()
            return r0
    }
}
