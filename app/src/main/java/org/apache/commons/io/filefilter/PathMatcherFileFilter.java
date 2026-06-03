package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class PathMatcherFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter {
    private final java.nio.file.PathMatcher pathMatcher;

    public PathMatcherFileFilter(java.nio.file.PathMatcher r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "pathMatcher"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.nio.file.PathMatcher r2 = (java.nio.file.PathMatcher) r2
            r1.pathMatcher = r2
            return
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r1) {
            r0 = this;
            if (r1 == 0) goto Le
            java.nio.file.Path r1 = r1.toPath()
            boolean r1 = r0.matches(r1)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, java.nio.file.PathMatcher
    public boolean matches(java.nio.file.Path r2) {
            r1 = this;
            java.nio.file.PathMatcher r0 = r1.pathMatcher
            boolean r2 = r0.matches(r2)
            return r2
    }
}
