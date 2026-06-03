package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class WildcardFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements java.io.Serializable {
    private static final long serialVersionUID = -5037645902506953517L;
    private final java.lang.String[] wildcards;

    public WildcardFilter(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "wildcard"
            java.util.Objects.requireNonNull(r3, r0)
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            r2.wildcards = r0
            return
    }

    public WildcardFilter(java.util.List<java.lang.String> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "wildcards"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String[] r0 = org.apache.commons.io.filefilter.WildcardFilter.EMPTY_STRING_ARRAY
            java.lang.Object[] r2 = r2.toArray(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.wildcards = r2
            return
    }

    public WildcardFilter(java.lang.String... r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "wildcards"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.Object r2 = r2.clone()
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.wildcards = r2
            return
    }

    static /* synthetic */ boolean lambda$accept$0(java.io.File r0, java.lang.String r1) {
            java.lang.String r0 = r0.getName()
            boolean r0 = org.apache.commons.io.FilenameUtils.wildcardMatch(r0, r1)
            return r0
    }

    static /* synthetic */ boolean lambda$accept$1(java.lang.String r0, java.lang.String r1) {
            boolean r0 = org.apache.commons.io.FilenameUtils.wildcardMatch(r0, r1)
            return r0
    }

    static /* synthetic */ boolean lambda$accept$2(java.nio.file.Path r0, java.lang.String r1) {
            java.lang.String r0 = org.apache.commons.io.file.PathUtils.getFileNameString(r0)
            boolean r0 = org.apache.commons.io.FilenameUtils.wildcardMatch(r0, r1)
            return r0
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r2, java.nio.file.attribute.BasicFileAttributes r3) {
            r1 = this;
            r3 = 0
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r3]
            boolean r3 = java.nio.file.Files.isDirectory(r2, r3)
            if (r3 == 0) goto Lc
            java.nio.file.FileVisitResult r2 = java.nio.file.FileVisitResult.TERMINATE
            return r2
        Lc:
            java.lang.String[] r3 = r1.wildcards
            java.util.stream.Stream r3 = java.util.stream.Stream.of(r3)
            org.apache.commons.io.filefilter.WildcardFilter$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.filefilter.WildcardFilter$$ExternalSyntheticLambda2
            r0.<init>(r2)
            boolean r2 = r3.anyMatch(r0)
            java.nio.file.FileVisitResult r2 = toDefaultFileVisitResult(r2)
            return r2
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r3) {
            r2 = this;
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.String[] r0 = r2.wildcards
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            org.apache.commons.io.filefilter.WildcardFilter$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.filefilter.WildcardFilter$$ExternalSyntheticLambda0
            r1.<init>(r3)
            boolean r3 = r0.anyMatch(r1)
            return r3
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(java.io.File r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto Lf
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r3)
            boolean r2 = r0.isDirectory()
            if (r2 == 0) goto Lf
            r2 = 0
            return r2
        Lf:
            java.lang.String[] r2 = r1.wildcards
            java.util.stream.Stream r2 = java.util.stream.Stream.of(r2)
            org.apache.commons.io.filefilter.WildcardFilter$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.filefilter.WildcardFilter$$ExternalSyntheticLambda1
            r0.<init>(r3)
            boolean r2 = r2.anyMatch(r0)
            return r2
    }
}
