package org.apache.commons.compress.archivers;

/* JADX INFO: loaded from: classes2.dex */
public interface ArchiveEntry {
    public static final long SIZE_UNKNOWN = -1;

    java.util.Date getLastModifiedDate();

    java.lang.String getName();

    long getSize();

    boolean isDirectory();

    default java.nio.file.Path resolveIn(java.nio.file.Path r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = r4.getName()
            java.nio.file.Path r1 = r5.resolve(r0)
            java.nio.file.Path r1 = r1.normalize()
            boolean r2 = r1.startsWith(r5)
            if (r2 == 0) goto L13
            return r1
        L13:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Zip slip '%s' + '%s' -> '%s'"
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r0, r1}
            java.lang.String r5 = java.lang.String.format(r3, r5)
            r2.<init>(r5)
            throw r2
    }
}
