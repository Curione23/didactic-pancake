package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes2.dex */
public class ReflectionToStringBuilder extends org.apache.commons.lang3.builder.ToStringBuilder {
    private boolean appendStatics;
    private boolean appendTransients;
    protected java.lang.String[] excludeFieldNames;
    private boolean excludeNullValues;
    protected java.lang.String[] includeFieldNames;
    private java.lang.Class<?> upToClass;

    /* JADX INFO: renamed from: $r8$lambda$6BnAbYJmibGRfb4s1pNJoOP-kGs, reason: not valid java name */
    public static /* synthetic */ java.lang.String m2664$r8$lambda$6BnAbYJmibGRfb4s1pNJoOPkGs(java.lang.reflect.Field r0) {
            java.lang.String r0 = r0.getName()
            return r0
    }

    public static /* synthetic */ java.lang.String $r8$lambda$bEK12JPJND67JDB1iFKO0s8n4NA(java.lang.Object r0) {
            java.lang.String r0 = java.util.Objects.toString(r0)
            return r0
    }

    public ReflectionToStringBuilder(java.lang.Object r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ReflectionToStringBuilder(java.lang.Object r1, org.apache.commons.lang3.builder.ToStringStyle r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public ReflectionToStringBuilder(java.lang.Object r1, org.apache.commons.lang3.builder.ToStringStyle r2, java.lang.StringBuffer r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public <T> ReflectionToStringBuilder(T r1, org.apache.commons.lang3.builder.ToStringStyle r2, java.lang.StringBuffer r3, java.lang.Class<? super T> r4, boolean r5, boolean r6) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.setUpToClass(r4)
            r0.setAppendTransients(r5)
            r0.setAppendStatics(r6)
            return
    }

    public <T> ReflectionToStringBuilder(T r1, org.apache.commons.lang3.builder.ToStringStyle r2, java.lang.StringBuffer r3, java.lang.Class<? super T> r4, boolean r5, boolean r6, boolean r7) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.setUpToClass(r4)
            r0.setAppendTransients(r5)
            r0.setAppendStatics(r6)
            r0.setExcludeNullValues(r7)
            return
    }

    static /* synthetic */ java.lang.String[] lambda$toNoNullStringArray$0(int r0) {
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    static java.lang.String[] toNoNullStringArray(java.util.Collection<java.lang.String> r0) {
            if (r0 != 0) goto L5
            java.lang.String[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            return r0
        L5:
            java.lang.Object[] r0 = r0.toArray()
            java.lang.String[] r0 = toNoNullStringArray(r0)
            return r0
    }

    static java.lang.String[] toNoNullStringArray(java.lang.Object[] r1) {
            java.util.stream.Stream r1 = org.apache.commons.lang3.stream.Streams.nonNull(r1)
            org.apache.commons.lang3.builder.ReflectionToStringBuilder$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder$$ExternalSyntheticLambda0
            r0.<init>()
            java.util.stream.Stream r1 = r1.map(r0)
            org.apache.commons.lang3.builder.ReflectionToStringBuilder$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder$$ExternalSyntheticLambda1
            r0.<init>()
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            return r1
    }

    public static java.lang.String toString(java.lang.Object r2) {
            r0 = 0
            r1 = 0
            java.lang.String r2 = toString(r2, r0, r1, r1, r0)
            return r2
    }

    public static java.lang.String toString(java.lang.Object r2, org.apache.commons.lang3.builder.ToStringStyle r3) {
            r0 = 0
            r1 = 0
            java.lang.String r2 = toString(r2, r3, r0, r0, r1)
            return r2
    }

    public static java.lang.String toString(java.lang.Object r2, org.apache.commons.lang3.builder.ToStringStyle r3, boolean r4) {
            r0 = 0
            r1 = 0
            java.lang.String r2 = toString(r2, r3, r4, r0, r1)
            return r2
    }

    public static java.lang.String toString(java.lang.Object r1, org.apache.commons.lang3.builder.ToStringStyle r2, boolean r3, boolean r4) {
            r0 = 0
            java.lang.String r1 = toString(r1, r2, r3, r4, r0)
            return r1
    }

    public static <T> java.lang.String toString(T r8, org.apache.commons.lang3.builder.ToStringStyle r9, boolean r10, boolean r11, java.lang.Class<? super T> r12) {
            org.apache.commons.lang3.builder.ReflectionToStringBuilder r7 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder
            r3 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r12
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = r7.toString()
            return r8
    }

    public static <T> java.lang.String toString(T r9, org.apache.commons.lang3.builder.ToStringStyle r10, boolean r11, boolean r12, boolean r13, java.lang.Class<? super T> r14) {
            org.apache.commons.lang3.builder.ReflectionToStringBuilder r8 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder
            r3 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r14
            r5 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r9 = r8.toString()
            return r9
    }

    public static java.lang.String toStringExclude(java.lang.Object r0, java.util.Collection<java.lang.String> r1) {
            java.lang.String[] r1 = toNoNullStringArray(r1)
            java.lang.String r0 = toStringExclude(r0, r1)
            return r0
    }

    public static java.lang.String toStringExclude(java.lang.Object r1, java.lang.String... r2) {
            org.apache.commons.lang3.builder.ReflectionToStringBuilder r0 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder
            r0.<init>(r1)
            org.apache.commons.lang3.builder.ReflectionToStringBuilder r1 = r0.setExcludeFieldNames(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static java.lang.String toStringInclude(java.lang.Object r0, java.util.Collection<java.lang.String> r1) {
            java.lang.String[] r1 = toNoNullStringArray(r1)
            java.lang.String r0 = toStringInclude(r0, r1)
            return r0
    }

    public static java.lang.String toStringInclude(java.lang.Object r1, java.lang.String... r2) {
            org.apache.commons.lang3.builder.ReflectionToStringBuilder r0 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder
            r0.<init>(r1)
            org.apache.commons.lang3.builder.ReflectionToStringBuilder r1 = r0.setIncludeFieldNames(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    private void validate() {
            r2 = this;
            java.lang.String[] r0 = r2.excludeFieldNames
            java.lang.String[] r1 = r2.includeFieldNames
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            boolean r0 = org.apache.commons.lang3.ArrayUtils.containsAny(r0, r1)
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.Object r0 = r2.getObject()
            org.apache.commons.lang3.builder.ToStringStyle.unregister(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "includeFieldNames and excludeFieldNames must not intersect"
            r0.<init>(r1)
            throw r0
    }

    protected boolean accept(java.lang.reflect.Field r4) {
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
            if (r0 == 0) goto L20
            boolean r0 = r3.isAppendTransients()
            if (r0 != 0) goto L20
            return r2
        L20:
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L31
            boolean r0 = r3.isAppendStatics()
            if (r0 != 0) goto L31
            return r2
        L31:
            java.lang.String[] r0 = r3.excludeFieldNames
            if (r0 == 0) goto L40
            java.lang.String r1 = r4.getName()
            int r0 = java.util.Arrays.binarySearch(r0, r1)
            if (r0 < 0) goto L40
            return r2
        L40:
            java.lang.String[] r0 = r3.includeFieldNames
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(r0)
            r1 = 1
            if (r0 == 0) goto L57
            java.lang.String[] r0 = r3.includeFieldNames
            java.lang.String r4 = r4.getName()
            int r4 = java.util.Arrays.binarySearch(r0, r4)
            if (r4 < 0) goto L56
            r2 = r1
        L56:
            return r2
        L57:
            java.lang.Class<org.apache.commons.lang3.builder.ToStringExclude> r0 = org.apache.commons.lang3.builder.ToStringExclude.class
            boolean r4 = r4.isAnnotationPresent(r0)
            r4 = r4 ^ r1
            return r4
    }

    protected void appendFieldsIn(java.lang.Class<?> r8) {
            r7 = this;
            boolean r0 = r8.isArray()
            if (r0 == 0) goto Le
            java.lang.Object r8 = r7.getObject()
            r7.reflectionAppendArray(r8)
            return
        Le:
            java.lang.reflect.Field[] r8 = r8.getDeclaredFields()
            org.apache.commons.lang3.builder.ReflectionToStringBuilder$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.builder.ReflectionToStringBuilder$$ExternalSyntheticLambda2
            r0.<init>()
            java.util.Comparator r0 = java.util.Comparator.comparing(r0)
            java.lang.Object[] r8 = org.apache.commons.lang3.ArraySorter.sort(r8, r0)
            java.lang.reflect.Field[] r8 = (java.lang.reflect.Field[]) r8
            r0 = 1
            java.lang.reflect.AccessibleObject.setAccessible(r8, r0)
            int r1 = r8.length
            r2 = 0
        L27:
            if (r2 >= r1) goto L54
            r3 = r8[r2]
            java.lang.String r4 = r3.getName()
            boolean r5 = r7.accept(r3)
            if (r5 == 0) goto L51
            java.lang.Object r5 = r7.getValue(r3)     // Catch: java.lang.IllegalAccessException -> L4a
            boolean r6 = r7.excludeNullValues     // Catch: java.lang.IllegalAccessException -> L4a
            if (r6 == 0) goto L3f
            if (r5 == 0) goto L51
        L3f:
            java.lang.Class<org.apache.commons.lang3.builder.ToStringSummary> r6 = org.apache.commons.lang3.builder.ToStringSummary.class
            boolean r3 = r3.isAnnotationPresent(r6)     // Catch: java.lang.IllegalAccessException -> L4a
            r3 = r3 ^ r0
            r7.append(r4, r5, r3)     // Catch: java.lang.IllegalAccessException -> L4a
            goto L51
        L4a:
            r8 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L51:
            int r2 = r2 + 1
            goto L27
        L54:
            return
    }

    public java.lang.String[] getExcludeFieldNames() {
            r1 = this;
            java.lang.String[] r0 = r1.excludeFieldNames
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public java.lang.String[] getIncludeFieldNames() {
            r1 = this;
            java.lang.String[] r0 = r1.includeFieldNames
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public java.lang.Class<?> getUpToClass() {
            r1 = this;
            java.lang.Class<?> r0 = r1.upToClass
            return r0
    }

    protected java.lang.Object getValue(java.lang.reflect.Field r2) throws java.lang.IllegalAccessException {
            r1 = this;
            java.lang.Object r0 = r1.getObject()
            java.lang.Object r2 = r2.get(r0)
            return r2
    }

    public boolean isAppendStatics() {
            r1 = this;
            boolean r0 = r1.appendStatics
            return r0
    }

    public boolean isAppendTransients() {
            r1 = this;
            boolean r0 = r1.appendTransients
            return r0
    }

    public boolean isExcludeNullValues() {
            r1 = this;
            boolean r0 = r1.excludeNullValues
            return r0
    }

    public org.apache.commons.lang3.builder.ReflectionToStringBuilder reflectionAppendArray(java.lang.Object r4) {
            r3 = this;
            org.apache.commons.lang3.builder.ToStringStyle r0 = r3.getStyle()
            java.lang.StringBuffer r1 = r3.getStringBuffer()
            r2 = 0
            r0.reflectionAppendArrayDetail(r1, r2, r4)
            return r3
    }

    public void setAppendStatics(boolean r1) {
            r0 = this;
            r0.appendStatics = r1
            return
    }

    public void setAppendTransients(boolean r1) {
            r0 = this;
            r0.appendTransients = r1
            return
    }

    public org.apache.commons.lang3.builder.ReflectionToStringBuilder setExcludeFieldNames(java.lang.String... r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r1 = 0
            r0.excludeFieldNames = r1
            goto L12
        L6:
            java.lang.String[] r1 = toNoNullStringArray(r1)
            java.lang.Object[] r1 = org.apache.commons.lang3.ArraySorter.sort(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.excludeFieldNames = r1
        L12:
            return r0
    }

    public void setExcludeNullValues(boolean r1) {
            r0 = this;
            r0.excludeNullValues = r1
            return
    }

    public org.apache.commons.lang3.builder.ReflectionToStringBuilder setIncludeFieldNames(java.lang.String... r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r1 = 0
            r0.includeFieldNames = r1
            goto L12
        L6:
            java.lang.String[] r1 = toNoNullStringArray(r1)
            java.lang.Object[] r1 = org.apache.commons.lang3.ArraySorter.sort(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.includeFieldNames = r1
        L12:
            return r0
    }

    public void setUpToClass(java.lang.Class<?> r2) {
            r1 = this;
            if (r2 == 0) goto L17
            java.lang.Object r0 = r1.getObject()
            if (r0 == 0) goto L17
            boolean r0 = r2.isInstance(r0)
            if (r0 == 0) goto Lf
            goto L17
        Lf:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Specified class is not a superclass of the object"
            r2.<init>(r0)
            throw r2
        L17:
            r1.upToClass = r2
            return
    }

    @Override // org.apache.commons.lang3.builder.ToStringBuilder
    public java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.getObject()
            if (r0 != 0) goto Lf
            org.apache.commons.lang3.builder.ToStringStyle r0 = r2.getStyle()
            java.lang.String r0 = r0.getNullText()
            return r0
        Lf:
            r2.validate()
            java.lang.Object r0 = r2.getObject()
            java.lang.Class r0 = r0.getClass()
            r2.appendFieldsIn(r0)
        L1d:
            java.lang.Class r1 = r0.getSuperclass()
            if (r1 == 0) goto L31
            java.lang.Class r1 = r2.getUpToClass()
            if (r0 == r1) goto L31
            java.lang.Class r0 = r0.getSuperclass()
            r2.appendFieldsIn(r0)
            goto L1d
        L31:
            java.lang.String r0 = super.toString()
            return r0
    }
}
