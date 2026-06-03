package org.apache.commons.io.file;

/* JADX INFO: loaded from: classes2.dex */
public class AccumulatorPathVisitor extends org.apache.commons.io.file.CountingPathVisitor {
    private final java.util.List<java.nio.file.Path> dirList;
    private final java.util.List<java.nio.file.Path> fileList;

    public AccumulatorPathVisitor() {
            r1 = this;
            org.apache.commons.io.file.Counters$PathCounters r0 = org.apache.commons.io.file.Counters.noopPathCounters()
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.dirList = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.fileList = r0
            return
    }

    public AccumulatorPathVisitor(org.apache.commons.io.file.Counters.PathCounters r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.dirList = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.fileList = r1
            return
    }

    public AccumulatorPathVisitor(org.apache.commons.io.file.Counters.PathCounters r1, org.apache.commons.io.file.PathFilter r2, org.apache.commons.io.file.PathFilter r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.dirList = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.fileList = r1
            return
    }

    public AccumulatorPathVisitor(org.apache.commons.io.file.Counters.PathCounters r1, org.apache.commons.io.file.PathFilter r2, org.apache.commons.io.file.PathFilter r3, org.apache.commons.io.function.IOBiFunction<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.dirList = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.fileList = r1
            return
    }

    private void add(java.util.List<java.nio.file.Path> r1, java.nio.file.Path r2) {
            r0 = this;
            java.nio.file.Path r2 = r2.normalize()
            r1.add(r2)
            return
    }

    public static org.apache.commons.io.file.AccumulatorPathVisitor withBigIntegerCounters() {
            org.apache.commons.io.file.AccumulatorPathVisitor r0 = new org.apache.commons.io.file.AccumulatorPathVisitor
            org.apache.commons.io.file.Counters$PathCounters r1 = org.apache.commons.io.file.Counters.bigIntegerPathCounters()
            r0.<init>(r1)
            return r0
    }

    public static org.apache.commons.io.file.AccumulatorPathVisitor withBigIntegerCounters(org.apache.commons.io.file.PathFilter r2, org.apache.commons.io.file.PathFilter r3) {
            org.apache.commons.io.file.AccumulatorPathVisitor r0 = new org.apache.commons.io.file.AccumulatorPathVisitor
            org.apache.commons.io.file.Counters$PathCounters r1 = org.apache.commons.io.file.Counters.bigIntegerPathCounters()
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static org.apache.commons.io.file.AccumulatorPathVisitor withLongCounters() {
            org.apache.commons.io.file.AccumulatorPathVisitor r0 = new org.apache.commons.io.file.AccumulatorPathVisitor
            org.apache.commons.io.file.Counters$PathCounters r1 = org.apache.commons.io.file.Counters.longPathCounters()
            r0.<init>(r1)
            return r0
    }

    public static org.apache.commons.io.file.AccumulatorPathVisitor withLongCounters(org.apache.commons.io.file.PathFilter r2, org.apache.commons.io.file.PathFilter r3) {
            org.apache.commons.io.file.AccumulatorPathVisitor r0 = new org.apache.commons.io.file.AccumulatorPathVisitor
            org.apache.commons.io.file.Counters$PathCounters r1 = org.apache.commons.io.file.Counters.longPathCounters()
            r0.<init>(r1, r2, r3)
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
            boolean r1 = r5 instanceof org.apache.commons.io.file.AccumulatorPathVisitor
            if (r1 != 0) goto L11
            return r2
        L11:
            org.apache.commons.io.file.AccumulatorPathVisitor r5 = (org.apache.commons.io.file.AccumulatorPathVisitor) r5
            java.util.List<java.nio.file.Path> r1 = r4.dirList
            java.util.List<java.nio.file.Path> r3 = r5.dirList
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L28
            java.util.List<java.nio.file.Path> r1 = r4.fileList
            java.util.List<java.nio.file.Path> r5 = r5.fileList
            boolean r5 = java.util.Objects.equals(r1, r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            r0 = r2
        L29:
            return r0
    }

    public java.util.List<java.nio.file.Path> getDirList() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<java.nio.file.Path> r1 = r2.dirList
            r0.<init>(r1)
            return r0
    }

    public java.util.List<java.nio.file.Path> getFileList() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<java.nio.file.Path> r1 = r2.fileList
            r0.<init>(r1)
            return r0
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    public int hashCode() {
            r3 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            java.util.List<java.nio.file.Path> r1 = r3.dirList
            java.util.List<java.nio.file.Path> r2 = r3.fileList
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            int r1 = java.util.Objects.hash(r1)
            int r0 = r0 + r1
            return r0
    }

    public java.util.List<java.nio.file.Path> relativizeDirectories(java.nio.file.Path r2, boolean r3, java.util.Comparator<? super java.nio.file.Path> r4) {
            r1 = this;
            java.util.List r0 = r1.getDirList()
            java.util.List r2 = org.apache.commons.io.file.PathUtils.relativize(r0, r2, r3, r4)
            return r2
    }

    public java.util.List<java.nio.file.Path> relativizeFiles(java.nio.file.Path r2, boolean r3, java.util.Comparator<? super java.nio.file.Path> r4) {
            r1 = this;
            java.util.List r0 = r1.getFileList()
            java.util.List r2 = org.apache.commons.io.file.PathUtils.relativize(r0, r2, r3, r4)
            return r2
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    protected void updateDirCounter(java.nio.file.Path r1, java.io.IOException r2) {
            r0 = this;
            super.updateDirCounter(r1, r2)
            java.util.List<java.nio.file.Path> r2 = r0.dirList
            r0.add(r2, r1)
            return
    }

    @Override // org.apache.commons.io.file.CountingPathVisitor
    protected void updateFileCounters(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            super.updateFileCounters(r1, r2)
            java.util.List<java.nio.file.Path> r2 = r0.fileList
            r0.add(r2, r1)
            return
    }
}
