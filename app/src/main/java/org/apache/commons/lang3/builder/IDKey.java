package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes2.dex */
final class IDKey {
    private final int id;
    private final java.lang.Object value;

    IDKey(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            int r0 = java.lang.System.identityHashCode(r2)
            r1.id = r0
            r1.value = r2
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof org.apache.commons.lang3.builder.IDKey
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            org.apache.commons.lang3.builder.IDKey r4 = (org.apache.commons.lang3.builder.IDKey) r4
            int r0 = r3.id
            int r2 = r4.id
            if (r0 == r2) goto Lf
            return r1
        Lf:
            java.lang.Object r0 = r3.value
            java.lang.Object r4 = r4.value
            if (r0 != r4) goto L16
            r1 = 1
        L16:
            return r1
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.id
            return r0
    }
}
