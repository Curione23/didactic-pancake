package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes2.dex */
public class ReflectionDiffBuilder<T> implements org.apache.commons.lang3.builder.Builder<org.apache.commons.lang3.builder.DiffResult<T>> {
    private final org.apache.commons.lang3.builder.DiffBuilder<T> diffBuilder;
    private java.lang.String[] excludeFieldNames;

    /* JADX INFO: renamed from: org.apache.commons.lang3.builder.ReflectionDiffBuilder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder<T> {
        private org.apache.commons.lang3.builder.DiffBuilder<T> diffBuilder;
        private java.lang.String[] excludeFieldNames;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.lang.String[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
                r1.excludeFieldNames = r0
                return
        }

        public org.apache.commons.lang3.builder.ReflectionDiffBuilder<T> build() {
                r4 = this;
                org.apache.commons.lang3.builder.ReflectionDiffBuilder r0 = new org.apache.commons.lang3.builder.ReflectionDiffBuilder
                org.apache.commons.lang3.builder.DiffBuilder<T> r1 = r4.diffBuilder
                java.lang.String[] r2 = r4.excludeFieldNames
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        public org.apache.commons.lang3.builder.ReflectionDiffBuilder.Builder<T> setDiffBuilder(org.apache.commons.lang3.builder.DiffBuilder<T> r1) {
                r0 = this;
                r0.diffBuilder = r1
                return r0
        }

        public org.apache.commons.lang3.builder.ReflectionDiffBuilder.Builder<T> setExcludeFieldNames(java.lang.String... r1) {
                r0 = this;
                java.lang.String[] r1 = org.apache.commons.lang3.builder.ReflectionDiffBuilder.access$100(r1)
                r0.excludeFieldNames = r1
                return r0
        }
    }

    @java.lang.Deprecated
    public ReflectionDiffBuilder(T r2, T r3, org.apache.commons.lang3.builder.ToStringStyle r4) {
            r1 = this;
            org.apache.commons.lang3.builder.DiffBuilder$Builder r0 = org.apache.commons.lang3.builder.DiffBuilder.builder()
            org.apache.commons.lang3.builder.DiffBuilder$Builder r2 = r0.setLeft(r2)
            org.apache.commons.lang3.builder.DiffBuilder$Builder r2 = r2.setRight(r3)
            org.apache.commons.lang3.builder.DiffBuilder$Builder r2 = r2.setStyle(r4)
            org.apache.commons.lang3.builder.DiffBuilder r2 = r2.build()
            r3 = 0
            r1.<init>(r2, r3)
            return
    }

    private ReflectionDiffBuilder(org.apache.commons.lang3.builder.DiffBuilder<T> r1, java.lang.String[] r2) {
            r0 = this;
            r0.<init>()
            r0.diffBuilder = r1
            r0.excludeFieldNames = r2
            return
    }

    /* synthetic */ ReflectionDiffBuilder(org.apache.commons.lang3.builder.DiffBuilder r1, java.lang.String[] r2, org.apache.commons.lang3.builder.ReflectionDiffBuilder.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private boolean accept(java.lang.reflect.Field r4) {
            r3 = this;
            java.lang.String r0 = r4.getName()
            r1 = 36
            int r0 = r0.indexOf(r1)
            r1 = -1
            r2 = 0
            if (r0 == r1) goto Lf
            return r2
        Lf:
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isTransient(r0)
            if (r0 == 0) goto L1a
            return r2
        L1a:
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L25
            return r2
        L25:
            java.lang.String[] r0 = r3.excludeFieldNames
            if (r0 == 0) goto L34
            java.lang.String r1 = r4.getName()
            int r0 = java.util.Arrays.binarySearch(r0, r1)
            if (r0 < 0) goto L34
            return r2
        L34:
            java.lang.Class<org.apache.commons.lang3.builder.DiffExclude> r0 = org.apache.commons.lang3.builder.DiffExclude.class
            boolean r4 = r4.isAnnotationPresent(r0)
            r4 = r4 ^ 1
            return r4
    }

    static /* synthetic */ java.lang.String[] access$100(java.lang.String[] r0) {
            java.lang.String[] r0 = toExcludeFieldNames(r0)
            return r0
    }

    private void appendFields(java.lang.Class<?> r8) {
            r7 = this;
            java.lang.reflect.Field[] r8 = org.apache.commons.lang3.reflect.FieldUtils.getAllFields(r8)
            int r0 = r8.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L47
            r2 = r8[r1]
            boolean r3 = r7.accept(r2)
            if (r3 == 0) goto L44
            org.apache.commons.lang3.builder.DiffBuilder<T> r3 = r7.diffBuilder     // Catch: java.lang.IllegalAccessException -> L2a
            java.lang.String r4 = r2.getName()     // Catch: java.lang.IllegalAccessException -> L2a
            java.lang.Object r5 = r7.getLeft()     // Catch: java.lang.IllegalAccessException -> L2a
            java.lang.Object r5 = r7.readField(r2, r5)     // Catch: java.lang.IllegalAccessException -> L2a
            java.lang.Object r6 = r7.getRight()     // Catch: java.lang.IllegalAccessException -> L2a
            java.lang.Object r2 = r7.readField(r2, r6)     // Catch: java.lang.IllegalAccessException -> L2a
            r3.append(r4, r5, r2)     // Catch: java.lang.IllegalAccessException -> L2a
            goto L44
        L2a:
            r8 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected IllegalAccessException: "
            r1.<init>(r2)
            java.lang.String r2 = r8.getMessage()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r8)
            throw r0
        L44:
            int r1 = r1 + 1
            goto L6
        L47:
            return
    }

    public static <T> org.apache.commons.lang3.builder.ReflectionDiffBuilder.Builder<T> builder() {
            org.apache.commons.lang3.builder.ReflectionDiffBuilder$Builder r0 = new org.apache.commons.lang3.builder.ReflectionDiffBuilder$Builder
            r0.<init>()
            return r0
    }

    private T getLeft() {
            r1 = this;
            org.apache.commons.lang3.builder.DiffBuilder<T> r0 = r1.diffBuilder
            java.lang.Object r0 = r0.getLeft()
            return r0
    }

    private T getRight() {
            r1 = this;
            org.apache.commons.lang3.builder.DiffBuilder<T> r0 = r1.diffBuilder
            java.lang.Object r0 = r0.getRight()
            return r0
    }

    private java.lang.Object readField(java.lang.reflect.Field r2, java.lang.Object r3) throws java.lang.IllegalAccessException {
            r1 = this;
            r0 = 1
            java.lang.Object r2 = org.apache.commons.lang3.reflect.FieldUtils.readField(r2, r3, r0)
            return r2
    }

    private static java.lang.String[] toExcludeFieldNames(java.lang.String[] r0) {
            if (r0 != 0) goto L5
            java.lang.String[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            return r0
        L5:
            java.lang.String[] r0 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(r0)
            java.lang.Object[] r0 = org.apache.commons.lang3.ArraySorter.sort(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    @Override // org.apache.commons.lang3.builder.Builder
    public /* bridge */ /* synthetic */ java.lang.Object build() {
            r1 = this;
            org.apache.commons.lang3.builder.DiffResult r0 = r1.build()
            return r0
    }

    @Override // org.apache.commons.lang3.builder.Builder
    public org.apache.commons.lang3.builder.DiffResult<T> build() {
            r2 = this;
            java.lang.Object r0 = r2.getLeft()
            java.lang.Object r1 = r2.getRight()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            org.apache.commons.lang3.builder.DiffBuilder<T> r0 = r2.diffBuilder
            org.apache.commons.lang3.builder.DiffResult r0 = r0.build()
            return r0
        L15:
            java.lang.Object r0 = r2.getLeft()
            java.lang.Class r0 = r0.getClass()
            r2.appendFields(r0)
            org.apache.commons.lang3.builder.DiffBuilder<T> r0 = r2.diffBuilder
            org.apache.commons.lang3.builder.DiffResult r0 = r0.build()
            return r0
    }

    public java.lang.String[] getExcludeFieldNames() {
            r1 = this;
            java.lang.String[] r0 = r1.excludeFieldNames
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    @java.lang.Deprecated
    public org.apache.commons.lang3.builder.ReflectionDiffBuilder<T> setExcludeFieldNames(java.lang.String... r1) {
            r0 = this;
            java.lang.String[] r1 = toExcludeFieldNames(r1)
            r0.excludeFieldNames = r1
            return r0
    }
}
