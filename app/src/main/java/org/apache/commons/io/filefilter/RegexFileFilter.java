package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class RegexFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements java.io.Serializable {
    private static final long serialVersionUID = 4269646126155225062L;
    private final transient java.util.function.Function<java.nio.file.Path, java.lang.String> pathToString;
    private final java.util.regex.Pattern pattern;

    public static /* synthetic */ java.lang.String $r8$lambda$EVdv2IWjvSWLIgfOIrKO0OyLGhY(java.lang.Object r0) {
            java.lang.String r0 = java.util.Objects.toString(r0)
            return r0
    }

    public RegexFileFilter(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public RegexFileFilter(java.lang.String r1, int r2) {
            r0 = this;
            java.util.regex.Pattern r1 = compile(r1, r2)
            r0.<init>(r1)
            return
    }

    public RegexFileFilter(java.lang.String r1, org.apache.commons.io.IOCase r2) {
            r0 = this;
            int r2 = toFlags(r2)
            java.util.regex.Pattern r1 = compile(r1, r2)
            r0.<init>(r1)
            return
    }

    public RegexFileFilter(java.util.regex.Pattern r2) {
            r1 = this;
            org.apache.commons.io.filefilter.RegexFileFilter$$ExternalSyntheticLambda1 r0 = new org.apache.commons.io.filefilter.RegexFileFilter$$ExternalSyntheticLambda1
            r0.<init>()
            java.io.Serializable r0 = (java.io.Serializable) r0
            java.util.function.Function r0 = (java.util.function.Function) r0
            r1.<init>(r2, r0)
            return
    }

    public RegexFileFilter(java.util.regex.Pattern r2, java.util.function.Function<java.nio.file.Path, java.lang.String> r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "pattern"
            java.util.Objects.requireNonNull(r2, r0)
            r1.pattern = r2
            if (r3 == 0) goto Ld
            goto L12
        Ld:
            org.apache.commons.io.filefilter.RegexFileFilter$$ExternalSyntheticLambda0 r3 = new org.apache.commons.io.filefilter.RegexFileFilter$$ExternalSyntheticLambda0
            r3.<init>()
        L12:
            r1.pathToString = r3
            return
    }

    private static java.util.regex.Pattern compile(java.lang.String r1, int r2) {
            java.lang.String r0 = "pattern"
            java.util.Objects.requireNonNull(r1, r0)
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r2)
            return r1
    }

    private static int toFlags(org.apache.commons.io.IOCase r0) {
            boolean r0 = org.apache.commons.io.IOCase.isCaseSensitive(r0)
            if (r0 == 0) goto L8
            r0 = 0
            goto L9
        L8:
            r0 = 2
        L9:
            return r0
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            java.util.function.Function<java.nio.file.Path, java.lang.String> r2 = r0.pathToString
            java.lang.Object r1 = r2.apply(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L18
            java.util.regex.Pattern r2 = r0.pattern
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            java.nio.file.FileVisitResult r1 = r0.toFileVisitResult(r1)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(java.io.File r1, java.lang.String r2) {
            r0 = this;
            java.util.regex.Pattern r1 = r0.pattern
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.matches()
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RegexFileFilter [pattern="
            r0.<init>(r1)
            java.util.regex.Pattern r1 = r2.pattern
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
