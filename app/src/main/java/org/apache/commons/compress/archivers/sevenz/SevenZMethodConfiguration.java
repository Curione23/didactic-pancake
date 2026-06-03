package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
public class SevenZMethodConfiguration {
    private final org.apache.commons.compress.archivers.sevenz.SevenZMethod method;
    private final java.lang.Object options;

    public SevenZMethodConfiguration(org.apache.commons.compress.archivers.sevenz.SevenZMethod r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SevenZMethodConfiguration(org.apache.commons.compress.archivers.sevenz.SevenZMethod r4, java.lang.Object r5) {
            r3 = this;
            r3.<init>()
            r3.method = r4
            r3.options = r5
            if (r5 == 0) goto L37
            org.apache.commons.compress.archivers.sevenz.AbstractCoder r0 = org.apache.commons.compress.archivers.sevenz.Coders.findByMethod(r4)
            boolean r0 = r0.isOptionInstance(r5)
            if (r0 == 0) goto L14
            goto L37
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " method doesn't support options of type "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.Class r5 = r5.getClass()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L37:
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2b
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L2b
        L12:
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration r5 = (org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration) r5
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r2 = r4.method
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r3 = r5.method
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L29
            java.lang.Object r2 = r4.options
            java.lang.Object r5 = r5.options
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L29
            goto L2a
        L29:
            r0 = r1
        L2a:
            return r0
        L2b:
            return r1
    }

    public org.apache.commons.compress.archivers.sevenz.SevenZMethod getMethod() {
            r1 = this;
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = r1.method
            return r0
    }

    public java.lang.Object getOptions() {
            r1 = this;
            java.lang.Object r0 = r1.options
            return r0
    }

    public int hashCode() {
            r1 = this;
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = r1.method
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }
}
