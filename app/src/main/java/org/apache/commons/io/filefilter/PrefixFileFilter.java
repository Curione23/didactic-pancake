package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class PrefixFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements java.io.Serializable {
    private static final long serialVersionUID = 8533897440809599867L;
    private final org.apache.commons.io.IOCase isCase;
    private final java.lang.String[] prefixes;

    public PrefixFileFilter(java.lang.String r2) {
            r1 = this;
            org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SENSITIVE
            r1.<init>(r2, r0)
            return
    }

    public PrefixFileFilter(java.lang.String r3, org.apache.commons.io.IOCase r4) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "prefix"
            java.util.Objects.requireNonNull(r3, r0)
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            r2.prefixes = r0
            org.apache.commons.io.IOCase r3 = org.apache.commons.io.IOCase.SENSITIVE
            org.apache.commons.io.IOCase r3 = org.apache.commons.io.IOCase.value(r4, r3)
            r2.isCase = r3
            return
    }

    public PrefixFileFilter(java.util.List<java.lang.String> r2) {
            r1 = this;
            org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SENSITIVE
            r1.<init>(r2, r0)
            return
    }

    public PrefixFileFilter(java.util.List<java.lang.String> r2, org.apache.commons.io.IOCase r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "prefixes"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String[] r0 = org.apache.commons.io.filefilter.PrefixFileFilter.EMPTY_STRING_ARRAY
            java.lang.Object[] r2 = r2.toArray(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.prefixes = r2
            org.apache.commons.io.IOCase r2 = org.apache.commons.io.IOCase.SENSITIVE
            org.apache.commons.io.IOCase r2 = org.apache.commons.io.IOCase.value(r3, r2)
            r1.isCase = r2
            return
    }

    public PrefixFileFilter(java.lang.String... r2) {
            r1 = this;
            org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SENSITIVE
            r1.<init>(r2, r0)
            return
    }

    public PrefixFileFilter(java.lang.String[] r2, org.apache.commons.io.IOCase r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "prefixes"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.Object r2 = r2.clone()
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.prefixes = r2
            org.apache.commons.io.IOCase r2 = org.apache.commons.io.IOCase.SENSITIVE
            org.apache.commons.io.IOCase r2 = org.apache.commons.io.IOCase.value(r3, r2)
            r1.isCase = r2
            return
    }

    private boolean accept(java.lang.String r3) {
            r2 = this;
            java.lang.String[] r0 = r2.prefixes
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            org.apache.commons.io.filefilter.PrefixFileFilter$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.filefilter.PrefixFileFilter$$ExternalSyntheticLambda0
            r1.<init>(r2, r3)
            boolean r3 = r0.anyMatch(r1)
            return r3
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            org.apache.commons.io.FileUtils$$ExternalSyntheticLambda19 r2 = new org.apache.commons.io.FileUtils$$ExternalSyntheticLambda19
            r2.<init>()
            java.lang.Object r1 = org.apache.commons.io.file.PathUtils.getFileName(r1, r2)
            java.io.File r1 = (java.io.File) r1
            boolean r1 = r0.accept(r1)
            java.nio.file.FileVisitResult r1 = r0.toFileVisitResult(r1)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            goto L8
        L4:
            java.lang.String r1 = r1.getName()
        L8:
            boolean r1 = r0.accept(r1)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(java.io.File r1, java.lang.String r2) {
            r0 = this;
            boolean r1 = r0.accept(r2)
            return r1
    }

    /* JADX INFO: renamed from: lambda$accept$0$org-apache-commons-io-filefilter-PrefixFileFilter, reason: not valid java name */
    /* synthetic */ boolean m2599x16e103a0(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.apache.commons.io.IOCase r0 = r1.isCase
            boolean r2 = r0.checkStartsWith(r2, r3)
            return r2
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.String[] r1 = r2.prefixes
            r2.append(r1, r0)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
