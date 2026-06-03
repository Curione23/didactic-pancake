package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class al extends com.google.android.play.integrity.internal.au {
    private final int a;
    private int b;

    protected al(int r2, int r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "index"
            com.google.android.play.integrity.internal.aj.b(r3, r2, r0)
            r1.a = r2
            r1.b = r3
            return
    }

    protected abstract java.lang.Object a(int r1);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.b
            int r1 = r2.a
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.b
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L11
            int r0 = r2.b
            int r1 = r0 + 1
            r2.b = r1
            java.lang.Object r0 = r2.a(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r1 = this;
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L11
            int r0 = r1.b
            int r0 = r0 + (-1)
            r1.b = r0
            java.lang.Object r0 = r1.a(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.b
            int r0 = r0 + (-1)
            return r0
    }
}
