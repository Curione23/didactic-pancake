package org.apache.commons.lang3.reflect;

/* JADX INFO: loaded from: classes2.dex */
public class InheritanceUtils {
    @java.lang.Deprecated
    public InheritanceUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int distance(java.lang.Class<?> r3, java.lang.Class<?> r4) {
            r0 = -1
            if (r3 == 0) goto L27
            if (r4 != 0) goto L6
            goto L27
        L6:
            boolean r1 = r3.equals(r4)
            if (r1 == 0) goto Le
            r3 = 0
            return r3
        Le:
            java.lang.Class r3 = r3.getSuperclass()
            boolean r1 = r4.equals(r3)
            int r1 = org.apache.commons.lang3.BooleanUtils.toInteger(r1)
            r2 = 1
            if (r1 != r2) goto L1e
            return r1
        L1e:
            int r3 = distance(r3, r4)
            int r1 = r1 + r3
            if (r1 <= 0) goto L27
            int r0 = r1 + 1
        L27:
            return r0
    }
}
