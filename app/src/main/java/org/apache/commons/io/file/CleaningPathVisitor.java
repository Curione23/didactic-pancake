package org.apache.commons.io.file;

/* JADX INFO: loaded from: classes2.dex */
public class CleaningPathVisitor extends org.apache.commons.io.file.CountingPathVisitor {
    private final boolean overrideReadOnly;
    private final java.lang.String[] skip;

    public CleaningPathVisitor(org.apache.commons.io.file.Counters.PathCounters r2, java.lang.String... r3) {
            r1 = this;
            org.apache.commons.io.file.DeleteOption[] r0 = org.apache.commons.io.file.PathUtils.EMPTY_DELETE_OPTION_ARRAY
            r1.<init>(r2, r0, r3)
            return
    }

    public CleaningPathVisitor(org.apache.commons.io.file.Counters.PathCounters r1, org.apache.commons.io.file.DeleteOption[] r2, java.lang.String... r3) {
            r0 = this;
            r0.<init>(r1)
            if (r3 == 0) goto Lc
            java.lang.Object r1 = r3.clone()
            java.lang.String[] r1 = (java.lang.String[]) r1
            goto Le
        Lc:
            java.lang.String[] r1 = org.apache.commons.io.file.CleaningPathVisitor.EMPTY_STRING_ARRAY
        Le:
            java.util.Arrays.sort(r1)
            r0.skip = r1
            boolean r1 = org.apache.commons.io.file.StandardDeleteOption.overrideReadOnly(r2)
            r0.overrideReadOnly = r1
            return
    }

    private boolean accept(java.nio.file.Path r2) {
            r1 = this;
            java.lang.String[] r0 = r1.skip
            java.lang.String r2 = org.apache.commons.io.file.PathUtils.getFileNameString(r2)
            int r2 = java.util.Arrays.binarySearch(r0, r2)
            if (r2 >= 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    public static org.apache.commons.io.file.CountingPathVisitor withBigIntegerCounters() {
            org.apache.commons.io.file.CleaningPathVisitor r0 = new org.apache.commons.io.file.CleaningPathVisitor
            org.apache.commons.io.file.Counters$PathCounters r1 = org.apache.commons.io.file.Counters.bigIntegerPathCounters()
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            r0.<init>(r1, r2)
            return r0
    }

    public static org.apache.commons.io.file.CountingPathVisitor withLongCounters() {
            org.apache.commons.io.file.CleaningPathVisitor r0 = new org.apache.commons.io.file.CleaningPathVisitor
            org.apache.commons.io.file.Counters$PathCounters r1 = org.apache.commons.io.file.Counters.longPathCounters()
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            r0.<init>(r1, r2)
            return r0
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = super.equals(r5)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r1 == r3) goto L17
            return r2
        L17:
            org.apache.commons.io.file.CleaningPathVisitor r5 = (org.apache.commons.io.file.CleaningPathVisitor) r5
            boolean r1 = r4.overrideReadOnly
            boolean r3 = r5.overrideReadOnly
            if (r1 != r3) goto L2a
            java.lang.String[] r1 = r4.skip
            java.lang.String[] r5 = r5.skip
            boolean r5 = java.util.Arrays.equals(r1, r5)
            if (r5 == 0) goto L2a
            goto L2b
        L2a:
            r0 = r2
        L2b:
            return r0
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            java.lang.String[] r1 = r2.skip
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.overrideReadOnly
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            int r1 = java.util.Objects.hash(r1)
            int r0 = r0 + r1
            return r0
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult preVisitDirectory(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.nio.file.FileVisitResult r1 = r0.preVisitDirectory2(r1, r2)
            return r1
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    /* JADX INFO: renamed from: preVisitDirectory, reason: avoid collision after fix types in other method */
    public java.nio.file.FileVisitResult preVisitDirectory2(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) throws java.io.IOException {
            r0 = this;
            super.preVisitDirectory(r1, r2)
            boolean r1 = r0.accept(r1)
            if (r1 == 0) goto Lc
            java.nio.file.FileVisitResult r1 = java.nio.file.FileVisitResult.CONTINUE
            goto Le
        Lc:
            java.nio.file.FileVisitResult r1 = java.nio.file.FileVisitResult.SKIP_SUBTREE
        Le:
            return r1
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult visitFile(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.nio.file.FileVisitResult r1 = r0.visitFile2(r1, r2)
            return r1
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    /* JADX INFO: renamed from: visitFile, reason: avoid collision after fix types in other method */
    public java.nio.file.FileVisitResult visitFile2(java.nio.file.Path r5, java.nio.file.attribute.BasicFileAttributes r6) throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.accept(r5)
            if (r0 == 0) goto L24
            r0 = 1
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.nio.file.LinkOption r2 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r3 = 0
            r1[r3] = r2
            boolean r1 = java.nio.file.Files.exists(r5, r1)
            if (r1 == 0) goto L24
            boolean r1 = r4.overrideReadOnly
            if (r1 == 0) goto L21
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            java.nio.file.LinkOption r1 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r0[r3] = r1
            org.apache.commons.io.file.PathUtils.setReadOnly(r5, r3, r0)
        L21:
            java.nio.file.Files.deleteIfExists(r5)
        L24:
            r4.updateFileCounters(r5, r6)
            java.nio.file.FileVisitResult r5 = java.nio.file.FileVisitResult.CONTINUE
            return r5
    }
}
