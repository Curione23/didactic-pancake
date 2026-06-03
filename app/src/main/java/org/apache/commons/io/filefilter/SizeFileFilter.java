package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class SizeFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements java.io.Serializable {
    private static final long serialVersionUID = 7388077430788600069L;
    private final boolean acceptLarger;
    private final long size;

    public SizeFileFilter(long r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public SizeFileFilter(long r3, boolean r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Le
            r2.size = r3
            r2.acceptLarger = r5
            return
        Le:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The size must be non-negative"
            r3.<init>(r4)
            throw r3
    }

    private boolean accept(long r4) {
            r3 = this;
            boolean r0 = r3.acceptLarger
            long r1 = r3.size
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r5 = 1
            r1 = 0
            if (r4 >= 0) goto Lc
            r4 = r5
            goto Ld
        Lc:
            r4 = r1
        Ld:
            if (r0 == r4) goto L10
            goto L11
        L10:
            r5 = r1
        L11:
            return r5
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            org.apache.commons.io.filefilter.SizeFileFilter$$ExternalSyntheticLambda0 r2 = new org.apache.commons.io.filefilter.SizeFileFilter$$ExternalSyntheticLambda0
            r2.<init>(r0, r1)
            java.nio.file.FileVisitResult r1 = r0.get(r2)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r3) {
            r2 = this;
            if (r3 == 0) goto L7
            long r0 = r3.length()
            goto L9
        L7:
            r0 = 0
        L9:
            boolean r3 = r2.accept(r0)
            return r3
    }

    /* JADX INFO: renamed from: lambda$accept$0$org-apache-commons-io-filefilter-SizeFileFilter, reason: not valid java name */
    /* synthetic */ java.nio.file.FileVisitResult m2600lambda$accept$0$orgapachecommonsiofilefilterSizeFileFilter(java.nio.file.Path r3) throws java.io.IOException {
            r2 = this;
            long r0 = java.nio.file.Files.size(r3)
            boolean r3 = r2.accept(r0)
            java.nio.file.FileVisitResult r3 = r2.toFileVisitResult(r3)
            return r3
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.acceptLarger
            if (r0 == 0) goto L7
            java.lang.String r0 = ">="
            goto L9
        L7:
            java.lang.String r0 = "<"
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = super.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "("
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            long r1 = r3.size
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult visitFile(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.nio.file.FileVisitResult r1 = r0.visitFile2(r1, r2)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    /* JADX INFO: renamed from: visitFile, reason: avoid collision after fix types in other method */
    public java.nio.file.FileVisitResult visitFile2(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) throws java.io.IOException {
            r0 = this;
            long r1 = java.nio.file.Files.size(r1)
            boolean r1 = r0.accept(r1)
            java.nio.file.FileVisitResult r1 = r0.toFileVisitResult(r1)
            return r1
    }
}
