package org.apache.commons.io.serialization;

/* JADX INFO: loaded from: classes2.dex */
final class RegexpClassNameMatcher implements org.apache.commons.io.serialization.ClassNameMatcher {
    private final java.util.regex.Pattern pattern;

    public RegexpClassNameMatcher(java.lang.String r1) {
            r0 = this;
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r0.<init>(r1)
            return
    }

    public RegexpClassNameMatcher(java.util.regex.Pattern r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "pattern"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.util.regex.Pattern r2 = (java.util.regex.Pattern) r2
            r1.pattern = r2
            return
    }

    @Override // org.apache.commons.io.serialization.ClassNameMatcher
    public boolean matches(java.lang.String r2) {
            r1 = this;
            java.util.regex.Pattern r0 = r1.pattern
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r2 = r2.matches()
            return r2
    }
}
