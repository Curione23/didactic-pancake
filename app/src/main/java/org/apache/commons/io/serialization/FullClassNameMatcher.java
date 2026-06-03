package org.apache.commons.io.serialization;

/* JADX INFO: loaded from: classes2.dex */
final class FullClassNameMatcher implements org.apache.commons.io.serialization.ClassNameMatcher {
    private final java.util.Set<java.lang.String> classesSet;

    public FullClassNameMatcher(java.lang.String... r2) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.<init>(r2)
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r0)
            r1.classesSet = r2
            return
    }

    @Override // org.apache.commons.io.serialization.ClassNameMatcher
    public boolean matches(java.lang.String r2) {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.classesSet
            boolean r2 = r0.contains(r2)
            return r2
    }
}
