package org.apache.commons.lang3.reflect;

/* JADX INFO: loaded from: classes2.dex */
public class FieldUtils {
    @java.lang.Deprecated
    public FieldUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.reflect.Field[] getAllFields(java.lang.Class<?> r1) {
            java.util.List r1 = getAllFieldsList(r1)
            java.lang.reflect.Field[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FIELD_ARRAY
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.reflect.Field[] r1 = (java.lang.reflect.Field[]) r1
            return r1
    }

    public static java.util.List<java.lang.reflect.Field> getAllFieldsList(java.lang.Class<?> r2) {
            java.lang.String r0 = "cls"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        La:
            if (r2 == 0) goto L18
            java.lang.reflect.Field[] r1 = r2.getDeclaredFields()
            java.util.Collections.addAll(r0, r1)
            java.lang.Class r2 = r2.getSuperclass()
            goto La
        L18:
            return r0
    }

    public static java.lang.reflect.Field getDeclaredField(java.lang.Class<?> r1, java.lang.String r2) {
            r0 = 0
            java.lang.reflect.Field r1 = getDeclaredField(r1, r2, r0)
            return r1
    }

    public static java.lang.reflect.Field getDeclaredField(java.lang.Class<?> r3, java.lang.String r4, boolean r5) {
            java.lang.String r0 = "cls"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = org.apache.commons.lang3.StringUtils.isNotBlank(r4)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "The field name must not be blank/empty"
            org.apache.commons.lang3.Validate.isTrue(r0, r2, r1)
            r0 = 0
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L24
            boolean r4 = org.apache.commons.lang3.reflect.MemberUtils.isAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L24
            if (r4 != 0) goto L23
            if (r5 != 0) goto L1f
            return r0
        L1f:
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.NoSuchFieldException -> L24
        L23:
            return r3
        L24:
            return r0
    }

    public static java.lang.reflect.Field getField(java.lang.Class<?> r1, java.lang.String r2) {
            r0 = 0
            java.lang.reflect.Field r1 = getField(r1, r2, r0)
            java.lang.reflect.AccessibleObject r1 = org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(r1)
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            return r1
    }

    public static java.lang.reflect.Field getField(java.lang.Class<?> r7, java.lang.String r8, boolean r9) {
            java.lang.String r0 = "cls"
            java.util.Objects.requireNonNull(r7, r0)
            boolean r0 = org.apache.commons.lang3.StringUtils.isNotBlank(r8)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "The field name must not be blank/empty"
            org.apache.commons.lang3.Validate.isTrue(r0, r3, r2)
            r0 = r7
        L12:
            r2 = 1
            if (r0 == 0) goto L2b
            java.lang.reflect.Field r3 = r0.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L26
            boolean r4 = org.apache.commons.lang3.reflect.MemberUtils.isPublic(r3)     // Catch: java.lang.NoSuchFieldException -> L26
            if (r4 != 0) goto L25
            if (r9 != 0) goto L22
            goto L26
        L22:
            r3.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L26
        L25:
            return r3
        L26:
            java.lang.Class r0 = r0.getSuperclass()
            goto L12
        L2b:
            java.util.List r9 = org.apache.commons.lang3.ClassUtils.getAllInterfaces(r7)
            java.util.Iterator r9 = r9.iterator()
            r0 = 0
        L34:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L54
            java.lang.Object r3 = r9.next()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.NoSuchFieldException -> L34
            if (r0 != 0) goto L48
            r4 = r2
            goto L49
        L48:
            r4 = r1
        L49:
            java.lang.String r5 = "Reference to field %s is ambiguous relative to %s; a matching field exists on two or more implemented interfaces."
            java.lang.Object[] r6 = new java.lang.Object[]{r8, r7}     // Catch: java.lang.NoSuchFieldException -> L34
            org.apache.commons.lang3.Validate.isTrue(r4, r5, r6)     // Catch: java.lang.NoSuchFieldException -> L34
            r0 = r3
            goto L34
        L54:
            return r0
    }

    public static java.util.List<java.lang.reflect.Field> getFieldsListWithAnnotation(java.lang.Class<?> r1, java.lang.Class<? extends java.lang.annotation.Annotation> r2) {
            java.lang.String r0 = "annotationCls"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.List r1 = getAllFieldsList(r1)
            java.util.stream.Stream r1 = r1.stream()
            org.apache.commons.lang3.reflect.FieldUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.reflect.FieldUtils$$ExternalSyntheticLambda0
            r0.<init>(r2)
            java.util.stream.Stream r1 = r1.filter(r0)
            java.util.stream.Collector r2 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r2)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static java.lang.reflect.Field[] getFieldsWithAnnotation(java.lang.Class<?> r0, java.lang.Class<? extends java.lang.annotation.Annotation> r1) {
            java.util.List r0 = getFieldsListWithAnnotation(r0, r1)
            java.lang.reflect.Field[] r1 = org.apache.commons.lang3.ArrayUtils.EMPTY_FIELD_ARRAY
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.reflect.Field[] r0 = (java.lang.reflect.Field[]) r0
            return r0
    }

    static /* synthetic */ boolean lambda$getFieldsListWithAnnotation$0(java.lang.Class r0, java.lang.reflect.Field r1) {
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static java.lang.Object readDeclaredField(java.lang.Object r1, java.lang.String r2) throws java.lang.IllegalAccessException {
            r0 = 0
            java.lang.Object r1 = readDeclaredField(r1, r2, r0)
            return r1
    }

    public static java.lang.Object readDeclaredField(java.lang.Object r4, java.lang.String r5, boolean r6) throws java.lang.IllegalAccessException {
            java.lang.String r0 = "target"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.Class r0 = r4.getClass()
            java.lang.reflect.Field r6 = getDeclaredField(r0, r5, r6)
            r1 = 0
            if (r6 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = r1
        L13:
            java.lang.String r3 = "Cannot locate declared field %s.%s"
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r5}
            org.apache.commons.lang3.Validate.isTrue(r2, r3, r5)
            java.lang.Object r4 = readField(r6, r4, r1)
            return r4
    }

    public static java.lang.Object readDeclaredStaticField(java.lang.Class<?> r1, java.lang.String r2) throws java.lang.IllegalAccessException {
            r0 = 0
            java.lang.Object r1 = readDeclaredStaticField(r1, r2, r0)
            return r1
    }

    public static java.lang.Object readDeclaredStaticField(java.lang.Class<?> r0, java.lang.String r1, boolean r2) throws java.lang.IllegalAccessException {
            java.lang.reflect.Field r2 = getDeclaredField(r0, r1, r2)
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "Cannot locate declared field %s.%s"
            org.apache.commons.lang3.Validate.notNull(r2, r1, r0)
            r0 = 0
            java.lang.Object r0 = readStaticField(r2, r0)
            return r0
    }

    public static java.lang.Object readField(java.lang.Object r1, java.lang.String r2) throws java.lang.IllegalAccessException {
            r0 = 0
            java.lang.Object r1 = readField(r1, r2, r0)
            return r1
    }

    public static java.lang.Object readField(java.lang.Object r4, java.lang.String r5, boolean r6) throws java.lang.IllegalAccessException {
            java.lang.String r0 = "target"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.Class r0 = r4.getClass()
            java.lang.reflect.Field r6 = getField(r0, r5, r6)
            r1 = 0
            if (r6 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = r1
        L13:
            java.lang.String r3 = "Cannot locate field %s on %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r0}
            org.apache.commons.lang3.Validate.isTrue(r2, r3, r5)
            java.lang.Object r4 = readField(r6, r4, r1)
            return r4
    }

    public static java.lang.Object readField(java.lang.reflect.Field r1, java.lang.Object r2) throws java.lang.IllegalAccessException {
            r0 = 0
            java.lang.Object r1 = readField(r1, r2, r0)
            return r1
    }

    public static java.lang.Object readField(java.lang.reflect.Field r1, java.lang.Object r2, boolean r3) throws java.lang.IllegalAccessException {
            java.lang.String r0 = "field"
            java.util.Objects.requireNonNull(r1, r0)
            if (r3 == 0) goto L12
            boolean r3 = r1.isAccessible()
            if (r3 != 0) goto L12
            r3 = 1
            r1.setAccessible(r3)
            goto L15
        L12:
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(r1)
        L15:
            java.lang.Object r1 = r1.get(r2)
            return r1
    }

    public static java.lang.Object readStaticField(java.lang.Class<?> r1, java.lang.String r2) throws java.lang.IllegalAccessException {
            r0 = 0
            java.lang.Object r1 = readStaticField(r1, r2, r0)
            return r1
    }

    public static java.lang.Object readStaticField(java.lang.Class<?> r1, java.lang.String r2, boolean r3) throws java.lang.IllegalAccessException {
            java.lang.reflect.Field r3 = getField(r1, r2, r3)
            java.lang.String r0 = "Cannot locate field '%s' on %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            org.apache.commons.lang3.Validate.notNull(r3, r0, r1)
            r1 = 0
            java.lang.Object r1 = readStaticField(r3, r1)
            return r1
    }

    public static java.lang.Object readStaticField(java.lang.reflect.Field r1) throws java.lang.IllegalAccessException {
            r0 = 0
            java.lang.Object r1 = readStaticField(r1, r0)
            return r1
    }

    public static java.lang.Object readStaticField(java.lang.reflect.Field r3, boolean r4) throws java.lang.IllegalAccessException {
            java.lang.String r0 = "field"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = org.apache.commons.lang3.reflect.MemberUtils.isStatic(r3)
            java.lang.String r1 = r3.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "The field '%s' is not static"
            org.apache.commons.lang3.Validate.isTrue(r0, r2, r1)
            r0 = 0
            java.lang.Object r3 = readField(r3, r0, r4)
            return r3
    }

    public static void removeFinalModifier(java.lang.reflect.Field r1) {
            r0 = 1
            removeFinalModifier(r1, r0)
            return
    }

    @java.lang.Deprecated
    public static void removeFinalModifier(java.lang.reflect.Field r3, boolean r4) {
            java.lang.String r0 = "field"
            java.util.Objects.requireNonNull(r3, r0)
            int r0 = r3.getModifiers()     // Catch: java.lang.IllegalAccessException -> L3f java.lang.NoSuchFieldException -> L41
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)     // Catch: java.lang.IllegalAccessException -> L3f java.lang.NoSuchFieldException -> L41
            if (r0 == 0) goto L4a
            java.lang.Class<java.lang.reflect.Field> r0 = java.lang.reflect.Field.class
            java.lang.String r1 = "modifiers"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.IllegalAccessException -> L3f java.lang.NoSuchFieldException -> L41
            r1 = 1
            r2 = 0
            if (r4 == 0) goto L23
            boolean r4 = r0.isAccessible()     // Catch: java.lang.IllegalAccessException -> L3f java.lang.NoSuchFieldException -> L41
            if (r4 != 0) goto L23
            r4 = r1
            goto L24
        L23:
            r4 = r2
        L24:
            if (r4 == 0) goto L29
            r0.setAccessible(r1)     // Catch: java.lang.IllegalAccessException -> L3f java.lang.NoSuchFieldException -> L41
        L29:
            int r1 = r3.getModifiers()     // Catch: java.lang.Throwable -> L38
            r1 = r1 & (-17)
            r0.setInt(r3, r1)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L4a
            r0.setAccessible(r2)     // Catch: java.lang.IllegalAccessException -> L3f java.lang.NoSuchFieldException -> L41
            goto L4a
        L38:
            r3 = move-exception
            if (r4 == 0) goto L3e
            r0.setAccessible(r2)     // Catch: java.lang.IllegalAccessException -> L3f java.lang.NoSuchFieldException -> L41
        L3e:
            throw r3     // Catch: java.lang.IllegalAccessException -> L3f java.lang.NoSuchFieldException -> L41
        L3f:
            r3 = move-exception
            goto L42
        L41:
            r3 = move-exception
        L42:
            org.apache.commons.lang3.JavaVersion r4 = org.apache.commons.lang3.JavaVersion.JAVA_12
            boolean r4 = org.apache.commons.lang3.SystemUtils.isJavaVersionAtLeast(r4)
            if (r4 != 0) goto L4b
        L4a:
            return
        L4b:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "In java 12+ final cannot be removed."
            r4.<init>(r0, r3)
            throw r4
    }

    public static void writeDeclaredField(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) throws java.lang.IllegalAccessException {
            r0 = 0
            writeDeclaredField(r1, r2, r3, r0)
            return
    }

    public static void writeDeclaredField(java.lang.Object r3, java.lang.String r4, java.lang.Object r5, boolean r6) throws java.lang.IllegalAccessException {
            java.lang.String r0 = "target"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.Class r0 = r3.getClass()
            java.lang.reflect.Field r6 = getDeclaredField(r0, r4, r6)
            r1 = 0
            if (r6 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = r1
        L13:
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4}
            java.lang.String r0 = "Cannot locate declared field %s.%s"
            org.apache.commons.lang3.Validate.isTrue(r2, r0, r4)
            writeField(r6, r3, r5, r1)
            return
    }

    public static void writeDeclaredStaticField(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object r3) throws java.lang.IllegalAccessException {
            r0 = 0
            writeDeclaredStaticField(r1, r2, r3, r0)
            return
    }

    public static void writeDeclaredStaticField(java.lang.Class<?> r0, java.lang.String r1, java.lang.Object r2, boolean r3) throws java.lang.IllegalAccessException {
            java.lang.reflect.Field r3 = getDeclaredField(r0, r1, r3)
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "Cannot locate declared field %s.%s"
            org.apache.commons.lang3.Validate.notNull(r3, r1, r0)
            r0 = 0
            r1 = 0
            writeField(r3, r0, r2, r1)
            return
    }

    public static void writeField(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) throws java.lang.IllegalAccessException {
            r0 = 0
            writeField(r1, r2, r3, r0)
            return
    }

    public static void writeField(java.lang.Object r3, java.lang.String r4, java.lang.Object r5, boolean r6) throws java.lang.IllegalAccessException {
            java.lang.String r0 = "target"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.Class r0 = r3.getClass()
            java.lang.reflect.Field r6 = getField(r0, r4, r6)
            r1 = 0
            if (r6 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = r1
        L13:
            java.lang.String r0 = r0.getName()
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4}
            java.lang.String r0 = "Cannot locate declared field %s.%s"
            org.apache.commons.lang3.Validate.isTrue(r2, r0, r4)
            writeField(r6, r3, r5, r1)
            return
    }

    public static void writeField(java.lang.reflect.Field r1, java.lang.Object r2, java.lang.Object r3) throws java.lang.IllegalAccessException {
            r0 = 0
            writeField(r1, r2, r3, r0)
            return
    }

    public static void writeField(java.lang.reflect.Field r1, java.lang.Object r2, java.lang.Object r3, boolean r4) throws java.lang.IllegalAccessException {
            java.lang.String r0 = "field"
            java.util.Objects.requireNonNull(r1, r0)
            if (r4 == 0) goto L12
            boolean r4 = r1.isAccessible()
            if (r4 != 0) goto L12
            r4 = 1
            r1.setAccessible(r4)
            goto L15
        L12:
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(r1)
        L15:
            r1.set(r2, r3)
            return
    }

    public static void writeStaticField(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object r3) throws java.lang.IllegalAccessException {
            r0 = 0
            writeStaticField(r1, r2, r3, r0)
            return
    }

    public static void writeStaticField(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object r3, boolean r4) throws java.lang.IllegalAccessException {
            java.lang.reflect.Field r4 = getField(r1, r2, r4)
            java.lang.String r0 = "Cannot locate field %s on %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            org.apache.commons.lang3.Validate.notNull(r4, r0, r1)
            r1 = 0
            writeStaticField(r4, r3, r1)
            return
    }

    public static void writeStaticField(java.lang.reflect.Field r1, java.lang.Object r2) throws java.lang.IllegalAccessException {
            r0 = 0
            writeStaticField(r1, r2, r0)
            return
    }

    public static void writeStaticField(java.lang.reflect.Field r3, java.lang.Object r4, boolean r5) throws java.lang.IllegalAccessException {
            java.lang.String r0 = "field"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = org.apache.commons.lang3.reflect.MemberUtils.isStatic(r3)
            java.lang.Class r1 = r3.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = r3.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "The field %s.%s is not static"
            org.apache.commons.lang3.Validate.isTrue(r0, r2, r1)
            r0 = 0
            writeField(r3, r0, r4, r5)
            return
    }
}
