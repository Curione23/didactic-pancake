package org.apache.commons.io.serialization;

/* JADX INFO: loaded from: classes2.dex */
public class ValidatingObjectInputStream extends java.io.ObjectInputStream {
    private final java.util.List<org.apache.commons.io.serialization.ClassNameMatcher> acceptMatchers;
    private final java.util.List<org.apache.commons.io.serialization.ClassNameMatcher> rejectMatchers;

    public ValidatingObjectInputStream(java.io.InputStream r1) throws java.io.IOException {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.acceptMatchers = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.rejectMatchers = r1
            return
    }

    private void checkClassName(java.lang.String r3) throws java.io.InvalidClassException {
            r2 = this;
            java.util.List<org.apache.commons.io.serialization.ClassNameMatcher> r0 = r2.rejectMatchers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            org.apache.commons.io.serialization.ClassNameMatcher r1 = (org.apache.commons.io.serialization.ClassNameMatcher) r1
            boolean r1 = r1.matches(r3)
            if (r1 == 0) goto L6
            r2.invalidClassNameFound(r3)
            goto L6
        L1c:
            java.util.List<org.apache.commons.io.serialization.ClassNameMatcher> r0 = r2.acceptMatchers
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            org.apache.commons.io.serialization.ClassNameMatcher r1 = (org.apache.commons.io.serialization.ClassNameMatcher) r1
            boolean r1 = r1.matches(r3)
            if (r1 == 0) goto L22
            goto L38
        L35:
            r2.invalidClassNameFound(r3)
        L38:
            return
    }

    static /* synthetic */ org.apache.commons.io.serialization.FullClassNameMatcher lambda$accept$0(java.lang.Class r3) {
            org.apache.commons.io.serialization.FullClassNameMatcher r0 = new org.apache.commons.io.serialization.FullClassNameMatcher
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ org.apache.commons.io.serialization.FullClassNameMatcher lambda$reject$1(java.lang.Class r3) {
            org.apache.commons.io.serialization.FullClassNameMatcher r0 = new org.apache.commons.io.serialization.FullClassNameMatcher
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = r3.getName()
            r1[r2] = r3
            r0.<init>(r1)
            return r0
    }

    public org.apache.commons.io.serialization.ValidatingObjectInputStream accept(java.util.regex.Pattern r3) {
            r2 = this;
            java.util.List<org.apache.commons.io.serialization.ClassNameMatcher> r0 = r2.acceptMatchers
            org.apache.commons.io.serialization.RegexpClassNameMatcher r1 = new org.apache.commons.io.serialization.RegexpClassNameMatcher
            r1.<init>(r3)
            r0.add(r1)
            return r2
    }

    public org.apache.commons.io.serialization.ValidatingObjectInputStream accept(org.apache.commons.io.serialization.ClassNameMatcher r2) {
            r1 = this;
            java.util.List<org.apache.commons.io.serialization.ClassNameMatcher> r0 = r1.acceptMatchers
            r0.add(r2)
            return r1
    }

    public org.apache.commons.io.serialization.ValidatingObjectInputStream accept(java.lang.Class<?>... r3) {
            r2 = this;
            java.util.stream.Stream r3 = java.util.stream.Stream.of(r3)
            org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda2 r0 = new org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda2
            r0.<init>()
            java.util.stream.Stream r3 = r3.map(r0)
            java.util.List<org.apache.commons.io.serialization.ClassNameMatcher> r0 = r2.acceptMatchers
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda1 r1 = new org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda1
            r1.<init>(r0)
            r3.forEach(r1)
            return r2
    }

    public org.apache.commons.io.serialization.ValidatingObjectInputStream accept(java.lang.String... r3) {
            r2 = this;
            java.util.stream.Stream r3 = java.util.stream.Stream.of(r3)
            org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda3 r0 = new org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda3
            r0.<init>()
            java.util.stream.Stream r3 = r3.map(r0)
            java.util.List<org.apache.commons.io.serialization.ClassNameMatcher> r0 = r2.acceptMatchers
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda4 r1 = new org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda4
            r1.<init>(r0)
            r3.forEach(r1)
            return r2
    }

    protected void invalidClassNameFound(java.lang.String r4) throws java.io.InvalidClassException {
            r3 = this;
            java.io.InvalidClassException r0 = new java.io.InvalidClassException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Class name not accepted: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public org.apache.commons.io.serialization.ValidatingObjectInputStream reject(java.util.regex.Pattern r3) {
            r2 = this;
            java.util.List<org.apache.commons.io.serialization.ClassNameMatcher> r0 = r2.rejectMatchers
            org.apache.commons.io.serialization.RegexpClassNameMatcher r1 = new org.apache.commons.io.serialization.RegexpClassNameMatcher
            r1.<init>(r3)
            r0.add(r1)
            return r2
    }

    public org.apache.commons.io.serialization.ValidatingObjectInputStream reject(org.apache.commons.io.serialization.ClassNameMatcher r2) {
            r1 = this;
            java.util.List<org.apache.commons.io.serialization.ClassNameMatcher> r0 = r1.rejectMatchers
            r0.add(r2)
            return r1
    }

    public org.apache.commons.io.serialization.ValidatingObjectInputStream reject(java.lang.Class<?>... r3) {
            r2 = this;
            java.util.stream.Stream r3 = java.util.stream.Stream.of(r3)
            org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda0
            r0.<init>()
            java.util.stream.Stream r3 = r3.map(r0)
            java.util.List<org.apache.commons.io.serialization.ClassNameMatcher> r0 = r2.rejectMatchers
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda1 r1 = new org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda1
            r1.<init>(r0)
            r3.forEach(r1)
            return r2
    }

    public org.apache.commons.io.serialization.ValidatingObjectInputStream reject(java.lang.String... r3) {
            r2 = this;
            java.util.stream.Stream r3 = java.util.stream.Stream.of(r3)
            org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda3 r0 = new org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda3
            r0.<init>()
            java.util.stream.Stream r3 = r3.map(r0)
            java.util.List<org.apache.commons.io.serialization.ClassNameMatcher> r0 = r2.rejectMatchers
            java.util.Objects.requireNonNull(r0)
            org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda4 r1 = new org.apache.commons.io.serialization.ValidatingObjectInputStream$$ExternalSyntheticLambda4
            r1.<init>(r0)
            r3.forEach(r1)
            return r2
    }

    @Override // java.io.ObjectInputStream
    protected java.lang.Class<?> resolveClass(java.io.ObjectStreamClass r2) throws java.io.IOException, java.lang.ClassNotFoundException {
            r1 = this;
            java.lang.String r0 = r2.getName()
            r1.checkClassName(r0)
            java.lang.Class r2 = super.resolveClass(r2)
            return r2
    }
}
