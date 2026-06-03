package org.apache.commons.io.comparator;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractFileComparator implements java.util.Comparator<java.io.File> {
    AbstractFileComparator() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List<java.io.File> sort(java.util.List<java.io.File> r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.sort(r0)
        L5:
            return r1
    }

    public java.io.File[] sort(java.io.File... r1) {
            r0 = this;
            if (r1 == 0) goto L5
            java.util.Arrays.sort(r1, r0)
        L5:
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }
}
