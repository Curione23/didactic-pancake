package org.apache.commons.lang3.reflect;

/* JADX INFO: loaded from: classes2.dex */
public class ConstructorUtils {
    @java.lang.Deprecated
    public ConstructorUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> java.lang.reflect.Constructor<T> getAccessibleConstructor(java.lang.Class<T> r1, java.lang.Class<?>... r2) {
            java.lang.String r0 = "cls"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.reflect.Constructor r1 = r1.getConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> Le
            java.lang.reflect.Constructor r1 = getAccessibleConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> Le
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static <T> java.lang.reflect.Constructor<T> getAccessibleConstructor(java.lang.reflect.Constructor<T> r1) {
            java.lang.String r0 = "ctor"
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = org.apache.commons.lang3.reflect.MemberUtils.isAccessible(r1)
            if (r0 == 0) goto L16
            java.lang.Class r0 = r1.getDeclaringClass()
            boolean r0 = isAccessible(r0)
            if (r0 == 0) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    public static <T> java.lang.reflect.Constructor<T> getMatchingAccessibleConstructor(java.lang.Class<T> r5, java.lang.Class<?>... r6) {
            java.lang.String r0 = "cls"
            java.util.Objects.requireNonNull(r5, r0)
            java.lang.reflect.Constructor r0 = r5.getConstructor(r6)     // Catch: java.lang.NoSuchMethodException -> L10
            java.lang.reflect.AccessibleObject r0 = org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(r0)     // Catch: java.lang.NoSuchMethodException -> L10
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0     // Catch: java.lang.NoSuchMethodException -> L10
            return r0
        L10:
            java.lang.reflect.Constructor[] r5 = r5.getConstructors()
            int r0 = r5.length
            r1 = 0
            r2 = 0
        L17:
            if (r2 >= r0) goto L36
            r3 = r5[r2]
            boolean r4 = org.apache.commons.lang3.reflect.MemberUtils.isMatchingConstructor(r3, r6)
            if (r4 == 0) goto L33
            java.lang.reflect.Constructor r3 = getAccessibleConstructor(r3)
            if (r3 == 0) goto L33
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(r3)
            if (r1 == 0) goto L32
            int r4 = org.apache.commons.lang3.reflect.MemberUtils.compareConstructorFit(r3, r1, r6)
            if (r4 >= 0) goto L33
        L32:
            r1 = r3
        L33:
            int r2 = r2 + 1
            goto L17
        L36:
            return r1
    }

    public static <T> T invokeConstructor(java.lang.Class<T> r1, java.lang.Object... r2) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.InstantiationException {
            java.lang.Object[] r2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r2)
            java.lang.Class[] r0 = org.apache.commons.lang3.ClassUtils.toClass(r2)
            java.lang.Object r1 = invokeConstructor(r1, r2, r0)
            return r1
    }

    public static <T> T invokeConstructor(java.lang.Class<T> r1, java.lang.Object[] r2, java.lang.Class<?>[] r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.InstantiationException {
            java.lang.Object[] r2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r2)
            java.lang.Class[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.reflect.Constructor r3 = getMatchingAccessibleConstructor(r1, r3)
            if (r3 == 0) goto L21
            boolean r1 = r3.isVarArgs()
            if (r1 == 0) goto L1c
            java.lang.Class[] r1 = r3.getParameterTypes()
            java.lang.Object[] r2 = org.apache.commons.lang3.reflect.MethodUtils.getVarArgs(r2, r1)
        L1c:
            java.lang.Object r1 = r3.newInstance(r2)
            return r1
        L21:
            java.lang.NoSuchMethodException r2 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "No such accessible constructor on object: "
            r3.<init>(r0)
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static <T> T invokeExactConstructor(java.lang.Class<T> r1, java.lang.Object... r2) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.InstantiationException {
            java.lang.Object[] r2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r2)
            java.lang.Class[] r0 = org.apache.commons.lang3.ClassUtils.toClass(r2)
            java.lang.Object r1 = invokeExactConstructor(r1, r2, r0)
            return r1
    }

    public static <T> T invokeExactConstructor(java.lang.Class<T> r1, java.lang.Object[] r2, java.lang.Class<?>[] r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException, java.lang.InstantiationException {
            java.lang.Object[] r2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r2)
            java.lang.Class[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.reflect.Constructor r3 = getAccessibleConstructor(r1, r3)
            if (r3 == 0) goto L13
            java.lang.Object r1 = r3.newInstance(r2)
            return r1
        L13:
            java.lang.NoSuchMethodException r2 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "No such accessible constructor on object: "
            r3.<init>(r0)
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    private static boolean isAccessible(java.lang.Class<?> r1) {
        L0:
            if (r1 == 0) goto Lf
            boolean r0 = org.apache.commons.lang3.ClassUtils.isPublic(r1)
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            java.lang.Class r1 = r1.getEnclosingClass()
            goto L0
        Lf:
            r1 = 1
            return r1
    }
}
