package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class DelegateFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements java.io.Serializable {
    private static final long serialVersionUID = -8723373124984771318L;
    private final transient java.io.FileFilter fileFilter;
    private final transient java.io.FilenameFilter fileNameFilter;

    public DelegateFileFilter(java.io.FileFilter r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "filter"
            java.util.Objects.requireNonNull(r2, r0)
            r1.fileFilter = r2
            r2 = 0
            r1.fileNameFilter = r2
            return
    }

    public DelegateFileFilter(java.io.FilenameFilter r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "filter"
            java.util.Objects.requireNonNull(r2, r0)
            r1.fileNameFilter = r2
            r2 = 0
            r1.fileFilter = r2
            return
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r2) {
            r1 = this;
            java.io.FileFilter r0 = r1.fileFilter
            if (r0 == 0) goto L9
            boolean r2 = r0.accept(r2)
            return r2
        L9:
            boolean r2 = super.accept(r2)
            return r2
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(java.io.File r2, java.lang.String r3) {
            r1 = this;
            java.io.FilenameFilter r0 = r1.fileNameFilter
            if (r0 == 0) goto L9
            boolean r2 = r0.accept(r2, r3)
            return r2
        L9:
            boolean r2 = super.accept(r2, r3)
            return r2
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public java.lang.String toString() {
            r3 = this;
            java.io.FileFilter r0 = r3.fileFilter
            if (r0 == 0) goto L5
            goto L7
        L5:
            java.io.FilenameFilter r0 = r3.fileNameFilter
        L7:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = super.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "("
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
