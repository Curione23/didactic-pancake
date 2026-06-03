package org.apache.commons.lang3.compare;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectToStringComparator implements java.util.Comparator<java.lang.Object>, java.io.Serializable {
    public static final org.apache.commons.lang3.compare.ObjectToStringComparator INSTANCE = null;
    private static final long serialVersionUID = 1;

    static {
            org.apache.commons.lang3.compare.ObjectToStringComparator r0 = new org.apache.commons.lang3.compare.ObjectToStringComparator
            r0.<init>()
            org.apache.commons.lang3.compare.ObjectToStringComparator.INSTANCE = r0
            return
    }

    @java.lang.Deprecated
    public ObjectToStringComparator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L6
            if (r5 != 0) goto L6
            return r0
        L6:
            r1 = 1
            if (r4 != 0) goto La
            return r1
        La:
            r2 = -1
            if (r5 != 0) goto Le
            return r2
        Le:
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = r5.toString()
            if (r4 != 0) goto L1b
            if (r5 != 0) goto L1b
            return r0
        L1b:
            if (r4 != 0) goto L1e
            return r1
        L1e:
            if (r5 != 0) goto L21
            return r2
        L21:
            int r4 = r4.compareTo(r5)
            return r4
    }
}
