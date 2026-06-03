package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class NameFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements java.io.Serializable {
    private static final long serialVersionUID = 176844364689077340L;
    private final org.apache.commons.io.IOCase ioCase;
    private final java.lang.String[] names;

    public NameFileFilter(java.lang.String r2) {
            r1 = this;
            org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SENSITIVE
            r1.<init>(r2, r0)
            return
    }

    public NameFileFilter(java.lang.String r3, org.apache.commons.io.IOCase r4) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "name"
            java.util.Objects.requireNonNull(r3, r0)
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            r2.names = r0
            org.apache.commons.io.IOCase r3 = r2.toIOCase(r4)
            r2.ioCase = r3
            return
    }

    public NameFileFilter(java.util.List<java.lang.String> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NameFileFilter(java.util.List<java.lang.String> r2, org.apache.commons.io.IOCase r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "names"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String[] r0 = org.apache.commons.io.filefilter.NameFileFilter.EMPTY_STRING_ARRAY
            java.lang.Object[] r2 = r2.toArray(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.names = r2
            org.apache.commons.io.IOCase r2 = r1.toIOCase(r3)
            r1.ioCase = r2
            return
    }

    public NameFileFilter(java.lang.String... r2) {
            r1 = this;
            org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SENSITIVE
            r1.<init>(r2, r0)
            return
    }

    public NameFileFilter(java.lang.String[] r2, org.apache.commons.io.IOCase r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "names"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.Object r2 = r2.clone()
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.names = r2
            org.apache.commons.io.IOCase r2 = r1.toIOCase(r3)
            r1.ioCase = r2
            return
    }

    private boolean acceptBaseName(java.lang.String r3) {
            r2 = this;
            java.lang.String[] r0 = r2.names
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            org.apache.commons.io.filefilter.NameFileFilter$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.filefilter.NameFileFilter$$ExternalSyntheticLambda0
            r1.<init>(r2, r3)
            boolean r3 = r0.anyMatch(r1)
            return r3
    }

    private org.apache.commons.io.IOCase toIOCase(org.apache.commons.io.IOCase r2) {
            r1 = this;
            org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SENSITIVE
            org.apache.commons.io.IOCase r2 = org.apache.commons.io.IOCase.value(r2, r0)
            return r2
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            java.lang.String r1 = org.apache.commons.io.file.PathUtils.getFileNameString(r1)
            boolean r1 = r0.acceptBaseName(r1)
            java.nio.file.FileVisitResult r1 = r0.toFileVisitResult(r1)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r1) {
            r0 = this;
            if (r1 == 0) goto Le
            java.lang.String r1 = r1.getName()
            boolean r1 = r0.acceptBaseName(r1)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(java.io.File r1, java.lang.String r2) {
            r0 = this;
            boolean r1 = r0.acceptBaseName(r2)
            return r1
    }

    /* JADX INFO: renamed from: lambda$acceptBaseName$0$org-apache-commons-io-filefilter-NameFileFilter, reason: not valid java name */
    /* synthetic */ boolean m2597xeb0d6bf5(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.apache.commons.io.IOCase r0 = r1.ioCase
            boolean r2 = r0.checkEquals(r2, r3)
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
            java.lang.String[] r1 = r2.names
            r2.append(r1, r0)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
