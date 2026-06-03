package org.apache.commons.io.serialization;

/* JADX INFO: loaded from: classes2.dex */
final class WildcardClassNameMatcher implements org.apache.commons.io.serialization.ClassNameMatcher {
    private final java.lang.String pattern;

    public WildcardClassNameMatcher(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.pattern = r1
            return
    }

    @Override // org.apache.commons.io.serialization.ClassNameMatcher
    public boolean matches(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.pattern
            boolean r2 = org.apache.commons.io.FilenameUtils.wildcardMatch(r2, r0)
            return r2
    }
}
