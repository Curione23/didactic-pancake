package org.apache.commons.io.filefilter;

/* JADX INFO: loaded from: classes2.dex */
public class WildcardFileFilter extends org.apache.commons.io.filefilter.AbstractFileFilter implements java.io.Serializable {
    private static final long serialVersionUID = -7426486598995782105L;
    private final org.apache.commons.io.IOCase ioCase;
    private final java.lang.String[] wildcards;

    /* JADX INFO: renamed from: org.apache.commons.io.filefilter.WildcardFileFilter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.io.build.AbstractSupplier<org.apache.commons.io.filefilter.WildcardFileFilter, org.apache.commons.io.filefilter.WildcardFileFilter.Builder> {
        private org.apache.commons.io.IOCase ioCase;
        private java.lang.String[] wildcards;

        public Builder() {
                r1 = this;
                r1.<init>()
                org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SENSITIVE
                r1.ioCase = r0
                return
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public /* bridge */ /* synthetic */ java.lang.Object get() throws java.io.IOException {
                r1 = this;
                org.apache.commons.io.filefilter.WildcardFileFilter r0 = r1.get()
                return r0
        }

        @Override // org.apache.commons.io.function.IOSupplier
        public org.apache.commons.io.filefilter.WildcardFileFilter get() {
                r4 = this;
                org.apache.commons.io.filefilter.WildcardFileFilter r0 = new org.apache.commons.io.filefilter.WildcardFileFilter
                org.apache.commons.io.IOCase r1 = r4.ioCase
                java.lang.String[] r2 = r4.wildcards
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public org.apache.commons.io.filefilter.WildcardFileFilter.Builder setIoCase(org.apache.commons.io.IOCase r2) {
                r1 = this;
                org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SENSITIVE
                org.apache.commons.io.IOCase r2 = org.apache.commons.io.IOCase.value(r2, r0)
                r1.ioCase = r2
                return r1
        }

        public org.apache.commons.io.filefilter.WildcardFileFilter.Builder setWildcards(java.util.List<java.lang.String> r2) {
                r1 = this;
                java.lang.Object r2 = org.apache.commons.io.filefilter.WildcardFileFilter.access$100(r2)
                java.util.List r2 = (java.util.List) r2
                java.lang.String[] r0 = org.apache.commons.io.filefilter.IOFileFilter.EMPTY_STRING_ARRAY
                java.lang.Object[] r2 = r2.toArray(r0)
                java.lang.String[] r2 = (java.lang.String[]) r2
                r1.setWildcards(r2)
                return r1
        }

        public org.apache.commons.io.filefilter.WildcardFileFilter.Builder setWildcards(java.lang.String... r1) {
                r0 = this;
                java.lang.Object r1 = org.apache.commons.io.filefilter.WildcardFileFilter.access$100(r1)
                java.lang.String[] r1 = (java.lang.String[]) r1
                r0.wildcards = r1
                return r0
        }
    }

    @java.lang.Deprecated
    public WildcardFileFilter(java.lang.String r4) {
            r3 = this;
            org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SENSITIVE
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object r4 = requireWildcards(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2 = 0
            r1[r2] = r4
            r3.<init>(r0, r1)
            return
    }

    @java.lang.Deprecated
    public WildcardFileFilter(java.lang.String r3, org.apache.commons.io.IOCase r4) {
            r2 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r3
            r2.<init>(r4, r0)
            return
    }

    @java.lang.Deprecated
    public WildcardFileFilter(java.util.List<java.lang.String> r2) {
            r1 = this;
            org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SENSITIVE
            r1.<init>(r2, r0)
            return
    }

    @java.lang.Deprecated
    public WildcardFileFilter(java.util.List<java.lang.String> r2, org.apache.commons.io.IOCase r3) {
            r1 = this;
            java.lang.Object r2 = requireWildcards(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.String[] r0 = org.apache.commons.io.filefilter.WildcardFileFilter.EMPTY_STRING_ARRAY
            java.lang.Object[] r2 = r2.toArray(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.<init>(r3, r2)
            return
    }

    private WildcardFileFilter(org.apache.commons.io.IOCase r1, java.lang.String... r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r2 = requireWildcards(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.Object r2 = r2.clone()
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.wildcards = r2
            org.apache.commons.io.IOCase r2 = org.apache.commons.io.IOCase.SENSITIVE
            org.apache.commons.io.IOCase r1 = org.apache.commons.io.IOCase.value(r1, r2)
            r0.ioCase = r1
            return
    }

    /* synthetic */ WildcardFileFilter(org.apache.commons.io.IOCase r1, java.lang.String[] r2, org.apache.commons.io.filefilter.WildcardFileFilter.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @java.lang.Deprecated
    public WildcardFileFilter(java.lang.String... r2) {
            r1 = this;
            org.apache.commons.io.IOCase r0 = org.apache.commons.io.IOCase.SENSITIVE
            r1.<init>(r0, r2)
            return
    }

    @java.lang.Deprecated
    public WildcardFileFilter(java.lang.String[] r1, org.apache.commons.io.IOCase r2) {
            r0 = this;
            r0.<init>(r2, r1)
            return
    }

    private boolean accept(java.lang.String r3) {
            r2 = this;
            java.lang.String[] r0 = r2.wildcards
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            org.apache.commons.io.filefilter.WildcardFileFilter$$ExternalSyntheticLambda0 r1 = new org.apache.commons.io.filefilter.WildcardFileFilter$$ExternalSyntheticLambda0
            r1.<init>(r2, r3)
            boolean r3 = r0.anyMatch(r1)
            return r3
    }

    static /* synthetic */ java.lang.Object access$100(java.lang.Object r0) {
            java.lang.Object r0 = requireWildcards(r0)
            return r0
    }

    public static org.apache.commons.io.filefilter.WildcardFileFilter.Builder builder() {
            org.apache.commons.io.filefilter.WildcardFileFilter$Builder r0 = new org.apache.commons.io.filefilter.WildcardFileFilter$Builder
            r0.<init>()
            return r0
    }

    private static <T> T requireWildcards(T r1) {
            java.lang.String r0 = "wildcards"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.IOFileFilter, org.apache.commons.io.file.PathFilter
    public java.nio.file.FileVisitResult accept(java.nio.file.Path r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            java.lang.String r1 = org.apache.commons.io.file.PathUtils.getFileNameString(r1)
            boolean r1 = r0.accept(r1)
            java.nio.file.FileVisitResult r1 = r0.toFileVisitResult(r1)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(java.io.File r1) {
            r0 = this;
            java.lang.String r1 = r1.getName()
            boolean r1 = r0.accept(r1)
            return r1
    }

    @Override // org.apache.commons.io.filefilter.AbstractFileFilter, org.apache.commons.io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(java.io.File r1, java.lang.String r2) {
            r0 = this;
            boolean r1 = r0.accept(r2)
            return r1
    }

    /* JADX INFO: renamed from: lambda$accept$0$org-apache-commons-io-filefilter-WildcardFileFilter, reason: not valid java name */
    /* synthetic */ boolean m2602xf9a09e68(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            org.apache.commons.io.IOCase r0 = r1.ioCase
            boolean r2 = org.apache.commons.io.FilenameUtils.wildcardMatch(r2, r3, r0)
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
            java.lang.String[] r1 = r2.wildcards
            r2.append(r1, r0)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
