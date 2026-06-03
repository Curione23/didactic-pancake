package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class OrFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements org.apache.commons.io.filefilter.ConditionalFileFilter, java.io.Serializable {
    private static final long serialVersionUID = 5767770777065432721L;
    private final java.util.List<org.apache.commons.io.filefilter.IOFileFilter> fileFilters;

    public OrFileFilter() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    private OrFileFilter(int r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    private OrFileFilter(java.util.ArrayList<org.apache.commons.io.filefilter.IOFileFilter> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "initialList"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.util.List r2 = (java.util.List) r2
            r1.fileFilters = r2
            return
    }

    public OrFileFilter(java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "fileFilters"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r1)
            java.util.Collection r3 = (java.util.Collection) r3
            r0.<init>(r3)
            r2.<init>(r0)
            return
    }

    public OrFileFilter(org.apache.commons.io.filefilter.IOFileFilter r2, org.apache.commons.io.filefilter.IOFileFilter r3) {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            r1.addFileFilter(r2)
            r1.addFileFilter(r3)
            return
    }

    public OrFileFilter(org.apache.commons.io.filefilter.IOFileFilter... r2) {
            r1 = this;
            java.lang.String r0 = "fileFilters"
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.filefilter.IOFileFilter[] r0 = (org.apache.commons.io.filefilter.IOFileFilter[]) r0
            int r0 = r0.length
            r1.<init>(r0)
            r1.addFileFilter(r2)
            return
    }

    static /* synthetic */ boolean lambda$accept$0(java.io.File r0, org.apache.commons.io.filefilter.IOFileFilter r1) {
            boolean r0 = r1.accept(r0)
            return r0
    }

    static /* synthetic */ boolean lambda$accept$1(java.io.File r0, java.lang.String r1, org.apache.commons.io.filefilter.IOFileFilter r2) {
            boolean r0 = r2.accept(r0, r1)
            return r0
    }

    static /* synthetic */ boolean lambda$accept$2(java.nio.file.Path r0, java.nio.file.attribute.BasicFileAttributes r1, org.apache.commons.io.filefilter.IOFileFilter r2) {
            java.nio.file.FileVisitResult r0 = r2.accept(r0, r1)
            java.nio.file.FileVisitResult r1 = java.nio.file.FileVisitResult.CONTINUE
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r3, java.nio.file.attribute.BasicFileAttributes r4) {
            r2 = this;
            java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r0 = r2.fileFilters
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.io.filefilter.OrFileFilter$$ExternalSyntheticLambda3 r1 = new org.apache.commons.io.filefilter.OrFileFilter$$ExternalSyntheticLambda3
            r1.<init>(r3, r4)
            boolean r3 = r0.anyMatch(r1)
            java.nio.file.FileVisitResult r3 = toDefaultFileVisitResult(r3)
            return r3
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r3) {
            r2 = this;
            java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r0 = r2.fileFilters
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.io.filefilter.OrFileFilter$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.filefilter.OrFileFilter$$ExternalSyntheticLambda0
            r1.<init>(r3)
            boolean r3 = r0.anyMatch(r1)
            return r3
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(java.io.File r3, java.lang.String r4) {
            r2 = this;
            java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r0 = r2.fileFilters
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.io.filefilter.OrFileFilter$$ExternalSyntheticLambda2 r1 = new org.apache.commons.io.filefilter.OrFileFilter$$ExternalSyntheticLambda2
            r1.<init>(r3, r4)
            boolean r3 = r0.anyMatch(r1)
            return r3
    }

    @Override // org.apache.commons.io.filefilter.ConditionalFileFilter
    public void addFileFilter(org.apache.commons.io.filefilter.IOFileFilter r3) {
            r2 = this;
            java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r0 = r2.fileFilters
            java.lang.String r1 = "fileFilter"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r1)
            org.apache.commons.io.filefilter.IOFileFilter r3 = (org.apache.commons.io.filefilter.IOFileFilter) r3
            r0.add(r3)
            return
    }

    public void addFileFilter(org.apache.commons.io.filefilter.IOFileFilter... r2) {
            r1 = this;
            java.lang.String r0 = "fileFilters"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.filefilter.IOFileFilter[] r2 = (org.apache.commons.io.filefilter.IOFileFilter[]) r2
            java.util.stream.Stream r2 = java.util.stream.Stream.of(r2)
            org.apache.commons.io.filefilter.OrFileFilter$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.filefilter.OrFileFilter$$ExternalSyntheticLambda1
            r0.<init>(r1)
            r2.forEach(r0)
            return
    }

    @Override // org.apache.commons.io.filefilter.ConditionalFileFilter
    public java.util.List<org.apache.commons.io.filefilter.IOFileFilter> getFileFilters() {
            r1 = this;
            java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r0 = r1.fileFilters
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // org.apache.commons.io.filefilter.ConditionalFileFilter
    public boolean removeFileFilter(org.apache.commons.io.filefilter.IOFileFilter r2) {
            r1 = this;
            java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r0 = r1.fileFilters
            boolean r2 = r0.remove(r2)
            return r2
    }

    @Override // org.apache.commons.io.filefilter.ConditionalFileFilter
    public void setFileFilters(java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r3) {
            r2 = this;
            java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r0 = r2.fileFilters
            r0.clear()
            java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r0 = r2.fileFilters
            java.lang.String r1 = "fileFilters"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r1)
            java.util.Collection r3 = (java.util.Collection) r3
            r0.addAll(r3)
            return
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
            java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r1 = r2.fileFilters
            r2.append(r1, r0)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
