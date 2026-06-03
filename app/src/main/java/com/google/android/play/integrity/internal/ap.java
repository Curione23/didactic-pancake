package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ap extends com.google.android.play.integrity.internal.am implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.play.integrity.internal.au a = null;
    public static final /* synthetic */ int d = 0;

    static {
            com.google.android.play.integrity.internal.an r0 = new com.google.android.play.integrity.internal.an
            com.google.android.play.integrity.internal.ap r1 = com.google.android.play.integrity.internal.ar.a
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.play.integrity.internal.ap.a = r0
            return
    }

    ap() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.play.integrity.internal.am
    int a(java.lang.Object[] r3, int r4) {
            r2 = this;
            int r4 = r2.size()
            r0 = 0
        L5:
            if (r0 >= r4) goto L10
            java.lang.Object r1 = r2.get(r0)
            r3[r0] = r1
            int r0 = r0 + 1
            goto L5
        L10:
            return r4
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // com.google.android.play.integrity.internal.am
    public final com.google.android.play.integrity.internal.at d() {
            r1 = this;
            r0 = 0
            com.google.android.play.integrity.internal.au r0 = r1.g(r0)
            return r0
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            goto L5b
        L4:
            boolean r1 = r7 instanceof java.util.List
            r2 = 0
            if (r1 != 0) goto Lb
        L9:
            r0 = r2
            goto L5b
        Lb:
            java.util.List r7 = (java.util.List) r7
            int r1 = r6.size()
            int r3 = r7.size()
            if (r1 == r3) goto L18
            goto L9
        L18:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L31
            r3 = r2
        L1d:
            if (r3 >= r1) goto L5b
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 != 0) goto L2e
            goto L9
        L2e:
            int r3 = r3 + 1
            goto L1d
        L31:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L39:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L55
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L46
            goto L9
        L46:
            java.lang.Object r3 = r1.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = java.util.Objects.equals(r3, r4)
            if (r3 != 0) goto L39
            goto L9
        L55:
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L9
        L5b:
            return r0
    }

    public com.google.android.play.integrity.internal.ap f(int r2, int r3) {
            r1 = this;
            int r0 = r1.size()
            com.google.android.play.integrity.internal.aj.c(r2, r3, r0)
            int r3 = r3 - r2
            int r0 = r1.size()
            if (r3 != r0) goto Lf
            return r1
        Lf:
            if (r3 != 0) goto L14
            com.google.android.play.integrity.internal.ap r2 = com.google.android.play.integrity.internal.ar.a
            return r2
        L14:
            com.google.android.play.integrity.internal.ao r0 = new com.google.android.play.integrity.internal.ao
            r0.<init>(r1, r2, r3)
            return r0
    }

    public final com.google.android.play.integrity.internal.au g(int r3) {
            r2 = this;
            int r0 = r2.size()
            java.lang.String r1 = "index"
            com.google.android.play.integrity.internal.aj.b(r3, r0, r1)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L12
            com.google.android.play.integrity.internal.au r3 = com.google.android.play.integrity.internal.ap.a
            return r3
        L12:
            com.google.android.play.integrity.internal.an r0 = new com.google.android.play.integrity.internal.an
            r0.<init>(r2, r3)
            return r0
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
            r2 = 1
        L6:
            if (r1 >= r0) goto L16
            int r2 = r2 * 31
            java.lang.Object r3 = r4.get(r1)
            int r3 = r3.hashCode()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L16:
            return r2
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            r0 = -1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L1a
            java.lang.Object r3 = r4.get(r2)
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L17
            r0 = r2
            goto L1a
        L17:
            int r2 = r2 + 1
            goto L9
        L1a:
            return r0
    }

    @Override // com.google.android.play.integrity.internal.am, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            com.google.android.play.integrity.internal.au r0 = r1.g(r0)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3.size()
            int r1 = r1 + r0
        L9:
            if (r1 < 0) goto L1a
            java.lang.Object r2 = r3.get(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L17
            r0 = r1
            goto L1a
        L17:
            int r1 = r1 + (-1)
            goto L9
        L1a:
            return r0
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            com.google.android.play.integrity.internal.au r0 = r1.g(r0)
            return r0
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            com.google.android.play.integrity.internal.au r1 = r0.g(r1)
            return r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.google.android.play.integrity.internal.ap r1 = r0.f(r1, r2)
            return r1
    }
}
