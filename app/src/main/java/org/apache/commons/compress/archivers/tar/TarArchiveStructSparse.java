package org.apache.commons.compress.archivers.tar;

/* JADX INFO: loaded from: classes2.dex */
public final class TarArchiveStructSparse {
    private final long numbytes;
    private final long offset;

    public TarArchiveStructSparse(long r4, long r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L1a
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L12
            r3.offset = r4
            r3.numbytes = r6
            return
        L12:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "numbytes must not be negative"
            r4.<init>(r5)
            throw r4
        L1a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "offset must not be negative"
            r4.<init>(r5)
            throw r4
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L27
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L12
            goto L27
        L12:
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse r7 = (org.apache.commons.compress.archivers.tar.TarArchiveStructSparse) r7
            long r2 = r6.offset
            long r4 = r7.offset
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L25
            long r2 = r6.numbytes
            long r4 = r7.numbytes
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L25
            goto L26
        L25:
            r0 = r1
        L26:
            return r0
        L27:
            return r1
    }

    public long getNumbytes() {
            r2 = this;
            long r0 = r2.numbytes
            return r0
    }

    public long getOffset() {
            r2 = this;
            long r0 = r2.offset
            return r0
    }

    public int hashCode() {
            r3 = this;
            long r0 = r3.offset
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r3.numbytes
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TarArchiveStructSparse{offset="
            r0.<init>(r1)
            long r1 = r3.offset
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", numbytes="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.numbytes
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
