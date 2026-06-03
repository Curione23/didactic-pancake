package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public class Iterators {
    private Iterators() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> boolean addAll(java.util.Collection<T> r2, java.util.Iterator<? extends T> r3) {
            java.util.Objects.requireNonNull(r2)
            java.util.Objects.requireNonNull(r3)
            r0 = 0
        L7:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.add(r1)
            r0 = r0 | r1
            goto L7
        L17:
            return r0
    }
}
