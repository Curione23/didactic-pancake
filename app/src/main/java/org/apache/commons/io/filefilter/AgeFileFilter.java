package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class AgeFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements java.io.Serializable {
    private static final long serialVersionUID = -2132740084016138541L;
    private final boolean acceptOlder;
    private final java.time.Instant cutoffInstant;

    public AgeFileFilter(long r1) {
            r0 = this;
            java.time.Instant r1 = java.time.Instant.ofEpochMilli(r1)
            r2 = 1
            r0.<init>(r1, r2)
            return
    }

    public AgeFileFilter(long r1, boolean r3) {
            r0 = this;
            java.time.Instant r1 = java.time.Instant.ofEpochMilli(r1)
            r0.<init>(r1, r3)
            return
    }

    public AgeFileFilter(java.io.File r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public AgeFileFilter(java.io.File r3, boolean r4) {
            r2 = this;
            long r0 = org.apache.commons.io.FileUtils.lastModifiedUnchecked(r3)
            r2.<init>(r0, r4)
            return
    }

    public AgeFileFilter(java.time.Instant r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public AgeFileFilter(java.time.Instant r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.acceptOlder = r2
            r0.cutoffInstant = r1
            return
    }

    public AgeFileFilter(java.util.Date r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public AgeFileFilter(java.util.Date r1, boolean r2) {
            r0 = this;
            java.time.Instant r1 = r1.toInstant()
            r0.<init>(r1, r2)
            return
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            org.apache.commons.io.filefilter.AgeFileFilter$$ExternalSyntheticLambda0 r2 = new org.apache.commons.io.filefilter.AgeFileFilter$$ExternalSyntheticLambda0
            r2.<init>(r0, r1)
            java.nio.file.FileVisitResult r1 = r0.get(r2)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r3) {
            r2 = this;
            boolean r0 = r2.acceptOlder
            java.time.Instant r1 = r2.cutoffInstant
            boolean r3 = org.apache.commons.io.FileUtils.isFileNewer(r3, r1)
            if (r0 == r3) goto Lc
            r3 = 1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            return r3
    }

    /* JADX INFO: renamed from: lambda$accept$0$org-apache-commons-io-filefilter-AgeFileFilter, reason: not valid java name */
    /* synthetic */ java.nio.file.FileVisitResult m2594lambda$accept$0$orgapachecommonsiofilefilterAgeFileFilter(java.nio.file.Path r5) throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.acceptOlder
            java.time.Instant r1 = r4.cutoffInstant
            r2 = 0
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r2]
            boolean r5 = org.apache.commons.io.file.PathUtils.isNewer(r5, r1, r3)
            if (r0 == r5) goto Le
            r2 = 1
        Le:
            java.nio.file.FileVisitResult r5 = r4.toFileVisitResult(r2)
            return r5
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.acceptOlder
            if (r0 == 0) goto L7
            java.lang.String r0 = "<="
            goto L9
        L7:
            java.lang.String r0 = ">"
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = super.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "("
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.time.Instant r1 = r3.cutoffInstant
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
