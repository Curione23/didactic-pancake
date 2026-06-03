package org.apache.commons.io.file;

/* JADX INFO: loaded from: classes2.dex */
public class CopyDirectoryVisitor extends org.apache.commons.io.file.CountingPathVisitor {
    private final java.nio.file.CopyOption[] copyOptions;
    private final java.nio.file.Path sourceDirectory;
    private final java.nio.file.Path targetDirectory;

    public CopyDirectoryVisitor(org.apache.commons.io.file.Counters.PathCounters r1, java.nio.file.Path r2, java.nio.file.Path r3, java.nio.file.CopyOption... r4) {
            r0 = this;
            r0.<init>(r1)
            r0.sourceDirectory = r2
            r0.targetDirectory = r3
            java.nio.file.CopyOption[] r1 = toCopyOption(r4)
            r0.copyOptions = r1
            return
    }

    public CopyDirectoryVisitor(org.apache.commons.io.file.Counters.PathCounters r1, org.apache.commons.io.file.PathFilter r2, org.apache.commons.io.file.PathFilter r3, java.nio.file.Path r4, java.nio.file.Path r5, java.nio.file.CopyOption... r6) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.sourceDirectory = r4
            r0.targetDirectory = r5
            java.nio.file.CopyOption[] r1 = toCopyOption(r6)
            r0.copyOptions = r1
            return
    }

    private java.nio.file.Path resolveRelativeAsString(java.nio.file.Path r3) {
            r2 = this;
            java.nio.file.Path r0 = r2.targetDirectory
            java.nio.file.Path r1 = r2.sourceDirectory
            java.nio.file.Path r3 = r1.relativize(r3)
            java.lang.String r3 = r3.toString()
            java.nio.file.Path r3 = r0.resolve(r3)
            return r3
    }

    private static java.nio.file.CopyOption[] toCopyOption(java.nio.file.CopyOption... r0) {
            if (r0 != 0) goto L5
            java.nio.file.CopyOption[] r0 = org.apache.commons.io.file.PathUtils.EMPTY_COPY_OPTIONS
            goto Lb
        L5:
            java.lang.Object r0 = r0.clone()
            java.nio.file.CopyOption[] r0 = (java.nio.file.CopyOption[]) r0
        Lb:
            return r0
    }

    protected void copy(java.nio.file.Path r2, java.nio.file.Path r3) throws java.io.IOException {
            r1 = this;
            java.nio.file.CopyOption[] r0 = r1.copyOptions
            java.nio.file.Files.copy(r2, r3, r0)
            return
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
            org.apache.commons.io.file.CopyDirectoryVisitor r5 = (org.apache.commons.io.file.CopyDirectoryVisitor) r5
            java.nio.file.CopyOption[] r1 = r4.copyOptions
            java.nio.file.CopyOption[] r3 = r5.copyOptions
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L38
            java.nio.file.Path r1 = r4.sourceDirectory
            java.nio.file.Path r3 = r5.sourceDirectory
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L38
            java.nio.file.Path r1 = r4.targetDirectory
            java.nio.file.Path r5 = r5.targetDirectory
            boolean r5 = java.util.Objects.equals(r1, r5)
            if (r5 == 0) goto L38
            goto L39
        L38:
            r0 = r2
        L39:
            return r0
    }

    public java.nio.file.CopyOption[] getCopyOptions() {
            r1 = this;
            java.nio.file.CopyOption[] r0 = r1.copyOptions
            java.lang.Object r0 = r0.clone()
            java.nio.file.CopyOption[] r0 = (java.nio.file.CopyOption[]) r0
            return r0
    }

    public java.nio.file.Path getSourceDirectory() {
            r1 = this;
            java.nio.file.Path r0 = r1.sourceDirectory
            return r0
    }

    public java.nio.file.Path getTargetDirectory() {
            r1 = this;
            java.nio.file.Path r0 = r1.targetDirectory
            return r0
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public int hashCode() {
            r3 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            java.nio.file.CopyOption[] r1 = r3.copyOptions
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.nio.file.Path r1 = r3.sourceDirectory
            java.nio.file.Path r2 = r3.targetDirectory
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
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
    public java.nio.file.FileVisitResult preVisitDirectory2(java.nio.file.Path r4, java.nio.file.attribute.BasicFileAttributes r5) throws java.io.IOException {
            r3 = this;
            java.nio.file.Path r0 = r3.resolveRelativeAsString(r4)
            r1 = 0
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r1]
            boolean r2 = java.nio.file.Files.notExists(r0, r2)
            if (r2 == 0) goto L12
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r1]
            java.nio.file.Files.createDirectory(r0, r1)
        L12:
            java.nio.file.FileVisitResult r4 = super.preVisitDirectory(r4, r5)
            return r4
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
    public java.nio.file.FileVisitResult visitFile2(java.nio.file.Path r2, java.nio.file.attribute.BasicFileAttributes r3) throws java.io.IOException {
            r1 = this;
            java.nio.file.Path r0 = r1.resolveRelativeAsString(r2)
            r1.copy(r2, r0)
            java.nio.file.FileVisitResult r2 = super.visitFile(r0, r3)
            return r2
    }
}
