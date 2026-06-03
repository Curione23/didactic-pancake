package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public class Sets {
    private Sets() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.SafeVarargs
    public static <E> java.util.HashSet<E> newHashSet(E... r2) {
            java.util.HashSet r0 = new java.util.HashSet
            if (r2 == 0) goto L6
            int r1 = r2.length
            goto L7
        L6:
            r1 = 0
        L7:
            r0.<init>(r1)
            if (r2 == 0) goto Lf
            java.util.Collections.addAll(r0, r2)
        Lf:
            return r0
    }
}
