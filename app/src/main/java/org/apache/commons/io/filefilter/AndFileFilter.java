package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class AndFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements org.apache.commons.io.filefilter.ConditionalFileFilter, java.io.Serializable {
    private static final long serialVersionUID = 7215974688563965257L;
    private final java.util.List<org.apache.commons.io.filefilter.IOFileFilter> fileFilters;

    public AndFileFilter() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    private AndFileFilter(int r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    private AndFileFilter(java.util.ArrayList<org.apache.commons.io.filefilter.IOFileFilter> r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "initialList"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.util.List r2 = (java.util.List) r2
            r1.fileFilters = r2
            return
    }

    public AndFileFilter(java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r1 = "fileFilters"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r1)
            java.util.Collection r3 = (java.util.Collection) r3
            r0.<init>(r3)
            r2.<init>(r0)
            return
    }

    public AndFileFilter(org.apache.commons.io.filefilter.IOFileFilter r2, org.apache.commons.io.filefilter.IOFileFilter r3) {
            r1 = this;
            r0 = 2
            r1.<init>(r0)
            r1.addFileFilter(r2)
            r1.addFileFilter(r3)
            return
    }

    public AndFileFilter(org.apache.commons.io.filefilter.IOFileFilter... r2) {
            r1 = this;
            java.lang.String r0 = "fileFilters"
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.io.filefilter.IOFileFilter[] r0 = (org.apache.commons.io.filefilter.IOFileFilter[]) r0
            int r0 = r0.length
            r1.<init>(r0)
            r1.addFileFilter(r2)
            return
    }

    private boolean isEmpty() {
            r1 = this;
            java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r0 = r1.fileFilters
            boolean r0 = r0.isEmpty()
            return r0
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
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            java.nio.file.FileVisitResult r3 = java.nio.file.FileVisitResult.TERMINATE
            goto L1c
        L9:
            java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r0 = r2.fileFilters
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.io.filefilter.AndFileFilter$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.filefilter.AndFileFilter$$ExternalSyntheticLambda0
            r1.<init>(r3, r4)
            boolean r3 = r0.allMatch(r1)
            java.nio.file.FileVisitResult r3 = toDefaultFileVisitResult(r3)
        L1c:
            return r3
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r3) {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L19
            java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r0 = r2.fileFilters
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.io.filefilter.AndFileFilter$$ExternalSyntheticLambda2 r1 = new org.apache.commons.io.filefilter.AndFileFilter$$ExternalSyntheticLambda2
            r1.<init>(r3)
            boolean r3 = r0.allMatch(r1)
            if (r3 == 0) goto L19
            r3 = 1
            goto L1a
        L19:
            r3 = 0
        L1a:
            return r3
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(java.io.File r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L19
            java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r0 = r2.fileFilters
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.io.filefilter.AndFileFilter$$ExternalSyntheticLambda3 r1 = new org.apache.commons.io.filefilter.AndFileFilter$$ExternalSyntheticLambda3
            r1.<init>(r3, r4)
            boolean r3 = r0.allMatch(r1)
            if (r3 == 0) goto L19
            r3 = 1
            goto L1a
        L19:
            r3 = 0
        L1a:
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
            org.apache.commons.io.filefilter.AndFileFilter$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.filefilter.AndFileFilter$$ExternalSyntheticLambda1
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
    public void setFileFilters(java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r2) {
            r1 = this;
            java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r0 = r1.fileFilters
            r0.clear()
            java.util.List<org.apache.commons.io.filefilter.IOFileFilter> r0 = r1.fileFilters
            r0.addAll(r2)
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
