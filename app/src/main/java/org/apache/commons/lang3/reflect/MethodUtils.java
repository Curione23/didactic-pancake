package org.apache.commons.lang3.reflect;

/* JADX INFO: loaded from: classes2.dex */
public class MethodUtils {
    private static final java.util.Comparator<java.lang.reflect.Method> METHOD_BY_SIGNATURE = null;

    /* JADX INFO: renamed from: $r8$lambda$VeZtvGbK7hPBl8kn6KCA-fm_v-U, reason: not valid java name */
    public static /* synthetic */ java.lang.String m2669$r8$lambda$VeZtvGbK7hPBl8kn6KCAfm_vU(java.lang.reflect.Method r0) {
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static /* synthetic */ java.util.stream.Stream $r8$lambda$XZ9zIzHeAlWd_HtDQ2d0_2n0phw(java.lang.Object[] r0) {
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            return r0
    }

    public static /* synthetic */ java.lang.reflect.Method[] $r8$lambda$bY2PdQPIOAniZZDNlND4YIm04w4(java.lang.Class r0) {
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$uUffGyNc0T3js_oPV9Wu--BHnAk, reason: not valid java name */
    public static /* synthetic */ java.lang.String m2670$r8$lambda$uUffGyNc0T3js_oPV9WuBHnAk(java.lang.Object r0) {
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    static {
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda2
            r0.<init>()
            java.util.Comparator r0 = java.util.Comparator.comparing(r0)
            org.apache.commons.lang3.reflect.MethodUtils.METHOD_BY_SIGNATURE = r0
            return
    }

    @java.lang.Deprecated
    public MethodUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int distance(java.lang.Class<?>[] r7, java.lang.Class<?>[] r8) {
            r0 = 1
            boolean r1 = org.apache.commons.lang3.ClassUtils.isAssignable(r7, r8, r0)
            if (r1 != 0) goto L9
            r7 = -1
            return r7
        L9:
            r1 = 0
            r2 = r1
            r3 = r2
        Lc:
            int r4 = r7.length
            if (r2 >= r4) goto L30
            r4 = r7[r2]
            r5 = r8[r2]
            if (r4 == 0) goto L2d
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L1c
            goto L2d
        L1c:
            boolean r6 = org.apache.commons.lang3.ClassUtils.isAssignable(r4, r5, r0)
            if (r6 == 0) goto L2b
            boolean r4 = org.apache.commons.lang3.ClassUtils.isAssignable(r4, r5, r1)
            if (r4 != 0) goto L2b
            int r3 = r3 + 1
            goto L2d
        L2b:
            int r3 = r3 + 2
        L2d:
            int r2 = r2 + 1
            goto Lc
        L30:
            return r3
    }

    public static java.lang.reflect.Method getAccessibleMethod(java.lang.Class<?> r0, java.lang.String r1, java.lang.Class<?>... r2) {
            java.lang.reflect.Method r0 = getMethodObject(r0, r1, r2)
            java.lang.reflect.Method r0 = getAccessibleMethod(r0)
            return r0
    }

    public static java.lang.reflect.Method getAccessibleMethod(java.lang.reflect.Method r3) {
            boolean r0 = org.apache.commons.lang3.reflect.MemberUtils.isAccessible(r3)
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.Class r0 = r3.getDeclaringClass()
            boolean r1 = org.apache.commons.lang3.ClassUtils.isPublic(r0)
            if (r1 == 0) goto L13
            return r3
        L13:
            java.lang.String r1 = r3.getName()
            java.lang.Class[] r3 = r3.getParameterTypes()
            java.lang.reflect.Method r2 = getAccessibleMethodFromInterfaceNest(r0, r1, r3)
            if (r2 != 0) goto L25
            java.lang.reflect.Method r2 = getAccessibleMethodFromSuperclass(r0, r1, r3)
        L25:
            return r2
    }

    private static java.lang.reflect.Method getAccessibleMethodFromInterfaceNest(java.lang.Class<?> r5, java.lang.String r6, java.lang.Class<?>... r7) {
        L0:
            if (r5 == 0) goto L27
            java.lang.Class[] r0 = r5.getInterfaces()
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L22
            r3 = r0[r2]
            boolean r4 = org.apache.commons.lang3.ClassUtils.isPublic(r3)
            if (r4 != 0) goto L13
            goto L1f
        L13:
            java.lang.reflect.Method r5 = r3.getDeclaredMethod(r6, r7)     // Catch: java.lang.NoSuchMethodException -> L18
            return r5
        L18:
            java.lang.reflect.Method r3 = getAccessibleMethodFromInterfaceNest(r3, r6, r7)
            if (r3 == 0) goto L1f
            return r3
        L1f:
            int r2 = r2 + 1
            goto L8
        L22:
            java.lang.Class r5 = r5.getSuperclass()
            goto L0
        L27:
            r5 = 0
            return r5
    }

    private static java.lang.reflect.Method getAccessibleMethodFromSuperclass(java.lang.Class<?> r1, java.lang.String r2, java.lang.Class<?>... r3) {
            java.lang.Class r1 = r1.getSuperclass()
        L4:
            if (r1 == 0) goto L16
            boolean r0 = org.apache.commons.lang3.ClassUtils.isPublic(r1)
            if (r0 == 0) goto L11
            java.lang.reflect.Method r1 = getMethodObject(r1, r2, r3)
            return r1
        L11:
            java.lang.Class r1 = r1.getSuperclass()
            goto L4
        L16:
            r1 = 0
            return r1
    }

    private static java.util.List<java.lang.Class<?>> getAllSuperclassesAndInterfaces(java.lang.Class<?> r6) {
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = org.apache.commons.lang3.ClassUtils.getAllSuperclasses(r6)
            java.util.List r6 = org.apache.commons.lang3.ClassUtils.getAllInterfaces(r6)
            r2 = 0
            r3 = r2
        L13:
            int r4 = r6.size()
            if (r2 < r4) goto L21
            int r4 = r1.size()
            if (r3 >= r4) goto L20
            goto L21
        L20:
            return r0
        L21:
            int r4 = r6.size()
            if (r2 < r4) goto L30
            int r4 = r3 + 1
            java.lang.Object r3 = r1.get(r3)
            java.lang.Class r3 = (java.lang.Class) r3
            goto L4e
        L30:
            int r4 = r1.size()
            if (r3 >= r4) goto L42
            if (r3 < r2) goto L39
            goto L42
        L39:
            int r4 = r3 + 1
            java.lang.Object r3 = r1.get(r3)
            java.lang.Class r3 = (java.lang.Class) r3
            goto L4e
        L42:
            int r4 = r2 + 1
            java.lang.Object r2 = r6.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            r5 = r3
            r3 = r2
            r2 = r4
            r4 = r5
        L4e:
            r0.add(r3)
            r3 = r4
            goto L13
    }

    public static <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.reflect.Method r4, java.lang.Class<A> r5, boolean r6, boolean r7) {
            java.lang.String r0 = "method"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String r0 = "annotationCls"
            java.util.Objects.requireNonNull(r5, r0)
            if (r7 != 0) goto L14
            boolean r0 = org.apache.commons.lang3.reflect.MemberUtils.isAccessible(r4)
            if (r0 != 0) goto L14
            r4 = 0
            return r4
        L14:
            java.lang.annotation.Annotation r0 = r4.getAnnotation(r5)
            if (r0 != 0) goto L57
            if (r6 == 0) goto L57
            java.lang.Class r6 = r4.getDeclaringClass()
            java.util.List r6 = getAllSuperclassesAndInterfaces(r6)
            java.util.Iterator r6 = r6.iterator()
        L28:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r6.next()
            java.lang.Class r1 = (java.lang.Class) r1
            if (r7 == 0) goto L43
            java.lang.String r2 = r4.getName()
            java.lang.Class[] r3 = r4.getParameterTypes()
            java.lang.reflect.Method r1 = getMatchingMethod(r1, r2, r3)
            goto L4f
        L43:
            java.lang.String r2 = r4.getName()
            java.lang.Class[] r3 = r4.getParameterTypes()
            java.lang.reflect.Method r1 = getMatchingAccessibleMethod(r1, r2, r3)
        L4f:
            if (r1 == 0) goto L28
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r5)
            if (r0 == 0) goto L28
        L57:
            return r0
    }

    public static java.lang.reflect.Method getMatchingAccessibleMethod(java.lang.Class<?> r3, java.lang.String r4, java.lang.Class<?>... r5) {
            java.lang.reflect.Method r0 = getMethodObject(r3, r4, r5)
            if (r0 == 0) goto Ld
            java.lang.reflect.AccessibleObject r3 = org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(r0)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            return r3
        Ld:
            java.lang.reflect.Method[] r3 = r3.getMethods()
            java.util.stream.Stream r3 = java.util.stream.Stream.of(r3)
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda5 r0 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda5
            r0.<init>(r4, r5)
            java.util.stream.Stream r3 = r3.filter(r0)
            java.util.stream.Collector r4 = java.util.stream.Collectors.toList()
            java.lang.Object r3 = r3.collect(r4)
            java.util.List r3 = (java.util.List) r3
            java.util.Comparator<java.lang.reflect.Method> r4 = org.apache.commons.lang3.reflect.MethodUtils.METHOD_BY_SIGNATURE
            r3.sort(r4)
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r0 = r4
        L33:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r3.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.reflect.Method r1 = getAccessibleMethod(r1)
            if (r1 == 0) goto L33
            if (r0 == 0) goto L4d
            int r2 = org.apache.commons.lang3.reflect.MemberUtils.compareMethodFit(r1, r0, r5)
            if (r2 >= 0) goto L33
        L4d:
            r0 = r1
            goto L33
        L4f:
            if (r0 == 0) goto L54
            org.apache.commons.lang3.reflect.MemberUtils.setAccessibleWorkaround(r0)
        L54:
            if (r0 == 0) goto La5
            boolean r3 = r0.isVarArgs()
            if (r3 == 0) goto La5
            java.lang.Class[] r3 = r0.getParameterTypes()
            int r3 = r3.length
            if (r3 <= 0) goto La5
            int r3 = r5.length
            if (r3 <= 0) goto La5
            java.lang.Class[] r3 = r0.getParameterTypes()
            int r1 = r3.length
            int r1 = r1 + (-1)
            r3 = r3[r1]
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Class r3 = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(r3)
            java.lang.String r3 = r3.getName()
            int r1 = r5.length
            int r1 = r1 + (-1)
            r5 = r5[r1]
            if (r5 != 0) goto L84
            r1 = r4
            goto L88
        L84:
            java.lang.String r1 = r5.getName()
        L88:
            if (r5 != 0) goto L8c
            r5 = r4
            goto L94
        L8c:
            java.lang.Class r5 = r5.getSuperclass()
            java.lang.String r5 = r5.getName()
        L94:
            if (r1 == 0) goto La5
            if (r5 == 0) goto La5
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto La5
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto La5
            return r4
        La5:
            return r0
    }

    public static java.lang.reflect.Method getMatchingMethod(java.lang.Class<?> r5, java.lang.String r6, java.lang.Class<?>... r7) {
            java.lang.String r0 = "cls"
            java.util.Objects.requireNonNull(r5, r0)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "methodName"
            org.apache.commons.lang3.Validate.notEmpty(r6, r2, r1)
            java.lang.reflect.Method[] r1 = r5.getDeclaredMethods()
            java.util.stream.Stream r1 = java.util.stream.Stream.of(r1)
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda8 r2 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda8
            r2.<init>(r6)
            java.util.stream.Stream r1 = r1.filter(r2)
            java.util.stream.Collector r2 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r2)
            java.util.List r1 = (java.util.List) r1
            java.util.List r2 = org.apache.commons.lang3.ClassUtils.getAllSuperclasses(r5)
            java.util.stream.Stream r2 = r2.stream()
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda9 r3 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda9
            r3.<init>()
            java.util.stream.Stream r2 = r2.map(r3)
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda10 r3 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda10
            r3.<init>()
            java.util.stream.Stream r2 = r2.flatMap(r3)
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda11 r3 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda11
            r3.<init>(r6)
            java.util.stream.Stream r2 = r2.filter(r3)
            java.util.Objects.requireNonNull(r1)
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda12 r3 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda12
            r3.<init>(r1)
            r2.forEach(r3)
            java.util.Iterator r2 = r1.iterator()
        L5a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L71
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Class[] r4 = r3.getParameterTypes()
            boolean r4 = java.util.Arrays.deepEquals(r4, r7)
            if (r4 == 0) goto L5a
            return r3
        L71:
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            java.util.stream.Stream r1 = r1.stream()
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda13 r3 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda13
            r3.<init>(r7)
            java.util.stream.Stream r1 = r1.filter(r3)
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda14 r3 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda14
            r3.<init>(r7, r2)
            r1.forEach(r3)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L93
            r5 = 0
            return r5
        L93:
            java.util.Collection r1 = r2.values()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.util.List r1 = (java.util.List) r1
            int r2 = r1.size()
            r3 = 1
            if (r2 == r3) goto L11e
            java.lang.Object r2 = r1.get(r0)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class r2 = r2.getDeclaringClass()
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Class r3 = r3.getDeclaringClass()
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 != 0) goto Lc3
            goto L11e
        Lc3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r6 = r2.append(r6)
            java.util.stream.Stream r7 = java.util.stream.Stream.of(r7)
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda1 r2 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda1
            r2.<init>()
            java.util.stream.Stream r7 = r7.map(r2)
            java.lang.String r2 = "("
            java.lang.String r3 = ")"
            java.lang.String r4 = ","
            java.util.stream.Collector r2 = java.util.stream.Collectors.joining(r4, r2, r3)
            java.lang.Object r7 = r7.collect(r2)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r5 = r5.getName()
            java.util.stream.Stream r7 = r1.stream()
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda2 r1 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda2
            r1.<init>()
            java.util.stream.Stream r7 = r7.map(r1)
            java.lang.String r1 = "["
            java.lang.String r2 = "]"
            java.util.stream.Collector r1 = java.util.stream.Collectors.joining(r4, r1, r2)
            java.lang.Object r7 = r7.collect(r1)
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r5, r7}
            java.lang.String r6 = "Found multiple candidates for method %s on class %s : %s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            r0.<init>(r5)
            throw r0
        L11e:
            java.lang.Object r5 = r1.get(r0)
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            return r5
    }

    public static java.lang.reflect.Method getMethodObject(java.lang.Class<?> r0, java.lang.String r1, java.lang.Class<?>... r2) {
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static java.util.List<java.lang.reflect.Method> getMethodsListWithAnnotation(java.lang.Class<?> r1, java.lang.Class<? extends java.lang.annotation.Annotation> r2) {
            r0 = 0
            java.util.List r1 = getMethodsListWithAnnotation(r1, r2, r0, r0)
            return r1
    }

    public static java.util.List<java.lang.reflect.Method> getMethodsListWithAnnotation(java.lang.Class<?> r1, java.lang.Class<? extends java.lang.annotation.Annotation> r2, boolean r3, boolean r4) {
            java.lang.String r0 = "cls"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.String r0 = "annotationCls"
            java.util.Objects.requireNonNull(r2, r0)
            if (r3 == 0) goto L11
            java.util.List r3 = getAllSuperclassesAndInterfaces(r1)
            goto L16
        L11:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L16:
            r0 = 0
            r3.add(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda7 r0 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda7
            r0.<init>(r4, r2, r1)
            r3.forEach(r0)
            return r1
    }

    public static java.lang.reflect.Method[] getMethodsWithAnnotation(java.lang.Class<?> r1, java.lang.Class<? extends java.lang.annotation.Annotation> r2) {
            r0 = 0
            java.lang.reflect.Method[] r1 = getMethodsWithAnnotation(r1, r2, r0, r0)
            return r1
    }

    public static java.lang.reflect.Method[] getMethodsWithAnnotation(java.lang.Class<?> r0, java.lang.Class<? extends java.lang.annotation.Annotation> r1, boolean r2, boolean r3) {
            java.util.List r0 = getMethodsListWithAnnotation(r0, r1, r2, r3)
            java.lang.reflect.Method[] r1 = org.apache.commons.lang3.ArrayUtils.EMPTY_METHOD_ARRAY
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.reflect.Method[] r0 = (java.lang.reflect.Method[]) r0
            return r0
    }

    public static java.util.Set<java.lang.reflect.Method> getOverrideHierarchy(java.lang.reflect.Method r8, org.apache.commons.lang3.ClassUtils.Interfaces r9) {
            java.lang.String r0 = "method"
            java.util.Objects.requireNonNull(r8, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r0.add(r8)
            java.lang.Class[] r1 = r8.getParameterTypes()
            java.lang.Class r2 = r8.getDeclaringClass()
            java.lang.Iterable r9 = org.apache.commons.lang3.ClassUtils.hierarchy(r2, r9)
            java.util.Iterator r9 = r9.iterator()
            r9.next()
        L20:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L73
            java.lang.Object r3 = r9.next()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.String r4 = r8.getName()
            java.lang.reflect.Method r3 = getMatchingAccessibleMethod(r3, r4, r1)
            if (r3 != 0) goto L37
            goto L20
        L37:
            java.lang.Class[] r4 = r3.getParameterTypes()
            boolean r4 = java.util.Arrays.equals(r4, r1)
            if (r4 == 0) goto L45
            r0.add(r3)
            goto L20
        L45:
            java.lang.Class r4 = r3.getDeclaringClass()
            java.util.Map r4 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(r2, r4)
            r5 = 0
        L4e:
            int r6 = r1.length
            if (r5 >= r6) goto L6f
            java.lang.reflect.Type[] r6 = r8.getGenericParameterTypes()
            r6 = r6[r5]
            java.lang.reflect.Type r6 = org.apache.commons.lang3.reflect.TypeUtils.unrollVariables(r4, r6)
            java.lang.reflect.Type[] r7 = r3.getGenericParameterTypes()
            r7 = r7[r5]
            java.lang.reflect.Type r7 = org.apache.commons.lang3.reflect.TypeUtils.unrollVariables(r4, r7)
            boolean r6 = org.apache.commons.lang3.reflect.TypeUtils.equals(r6, r7)
            if (r6 != 0) goto L6c
            goto L20
        L6c:
            int r5 = r5 + 1
            goto L4e
        L6f:
            r0.add(r3)
            goto L20
        L73:
            return r0
    }

    static java.lang.Object[] getVarArgs(java.lang.Object[] r6, java.lang.Class<?>[] r7) {
            int r0 = r6.length
            int r1 = r7.length
            if (r0 != r1) goto L20
            int r0 = r6.length
            int r0 = r0 + (-1)
            r0 = r6[r0]
            if (r0 == 0) goto L1f
            int r0 = r6.length
            int r0 = r0 + (-1)
            r0 = r6[r0]
            java.lang.Class r0 = r0.getClass()
            int r1 = r7.length
            int r1 = r1 + (-1)
            r1 = r7[r1]
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
        L1f:
            return r6
        L20:
            int r0 = r7.length
            int r0 = r0 + (-1)
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda0 r1 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda0
            r1.<init>(r7)
            r2 = 0
            java.lang.Object r0 = org.apache.commons.lang3.ArrayUtils.arraycopy(r6, r2, r2, r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r7.length
            int r1 = r1 + (-1)
            r1 = r7[r1]
            java.lang.Class r1 = r1.getComponentType()
            int r3 = r6.length
            int r4 = r7.length
            int r3 = r3 - r4
            int r3 = r3 + 1
            int r4 = r7.length
            int r4 = r4 + (-1)
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda6 r5 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda6
            r5.<init>(r1, r3)
            java.lang.Object r6 = org.apache.commons.lang3.ArrayUtils.arraycopy(r6, r4, r2, r3, r5)
            boolean r1 = r1.isPrimitive()
            if (r1 == 0) goto L53
            java.lang.Object r6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(r6)
        L53:
            int r7 = r7.length
            int r7 = r7 + (-1)
            r0[r7] = r6
            return r0
    }

    public static java.lang.Object invokeExactMethod(java.lang.Object r2, java.lang.String r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY
            r1 = 0
            java.lang.Object r2 = invokeExactMethod(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.Object invokeExactMethod(java.lang.Object r1, java.lang.String r2, java.lang.Object... r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.Class[] r0 = org.apache.commons.lang3.ClassUtils.toClass(r3)
            java.lang.Object r1 = invokeExactMethod(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.Object invokeExactMethod(java.lang.Object r1, java.lang.String r2, java.lang.Object[] r3, java.lang.Class<?>[] r4) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.String r0 = "object"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.Class[] r4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r4)
            java.lang.Class r0 = r1.getClass()
            java.lang.reflect.Method r4 = getAccessibleMethod(r0, r2, r4)
            if (r4 == 0) goto L1c
            java.lang.Object r1 = r4.invoke(r1, r3)
            return r1
        L1c:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No such accessible method: "
            r3.<init>(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = "() on object: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r0.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object... r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.Class[] r0 = org.apache.commons.lang3.ClassUtils.toClass(r3)
            java.lang.Object r1 = invokeExactStaticMethod(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.Object invokeExactStaticMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object[] r3, java.lang.Class<?>[] r4) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.Class[] r4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r4)
            java.lang.reflect.Method r4 = getAccessibleMethod(r1, r2, r4)
            if (r4 == 0) goto L14
            r1 = 0
            java.lang.Object r1 = r4.invoke(r1, r3)
            return r1
        L14:
            java.lang.NoSuchMethodException r3 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "No such accessible method: "
            r4.<init>(r0)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = "() on class: "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r3.<init>(r1)
            throw r3
    }

    public static java.lang.Object invokeMethod(java.lang.Object r2, java.lang.String r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY
            r1 = 0
            java.lang.Object r2 = invokeMethod(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.Object invokeMethod(java.lang.Object r1, java.lang.String r2, java.lang.Object... r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.Class[] r0 = org.apache.commons.lang3.ClassUtils.toClass(r3)
            java.lang.Object r1 = invokeMethod(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.Object invokeMethod(java.lang.Object r1, java.lang.String r2, java.lang.Object[] r3, java.lang.Class<?>[] r4) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r0 = 0
            java.lang.Object r1 = invokeMethod(r1, r0, r2, r3, r4)
            return r1
    }

    public static java.lang.Object invokeMethod(java.lang.Object r2, boolean r3, java.lang.String r4) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY
            r1 = 0
            java.lang.Object r2 = invokeMethod(r2, r3, r4, r0, r1)
            return r2
    }

    public static java.lang.Object invokeMethod(java.lang.Object r1, boolean r2, java.lang.String r3, java.lang.Object... r4) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r4)
            java.lang.Class[] r0 = org.apache.commons.lang3.ClassUtils.toClass(r4)
            java.lang.Object r1 = invokeMethod(r1, r2, r3, r4, r0)
            return r1
    }

    public static java.lang.Object invokeMethod(java.lang.Object r1, boolean r2, java.lang.String r3, java.lang.Object[] r4, java.lang.Class<?>[] r5) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.String r0 = "object"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.Class[] r5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r5)
            java.lang.Object[] r4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r4)
            java.lang.Class r0 = r1.getClass()
            if (r2 == 0) goto L26
            java.lang.reflect.Method r2 = getMatchingMethod(r0, r3, r5)
            if (r2 == 0) goto L23
            boolean r5 = r2.isAccessible()
            if (r5 != 0) goto L23
            r5 = 1
            r2.setAccessible(r5)
        L23:
            java.lang.String r5 = "No such method: "
            goto L2c
        L26:
            java.lang.reflect.Method r2 = getMatchingAccessibleMethod(r0, r3, r5)
            java.lang.String r5 = "No such accessible method: "
        L2c:
            if (r2 == 0) goto L37
            java.lang.Object[] r3 = toVarArgs(r2, r4)
            java.lang.Object r1 = r2.invoke(r1, r3)
            return r1
        L37:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "() on object: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r0.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.Object invokeStaticMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object... r3) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.Class[] r0 = org.apache.commons.lang3.ClassUtils.toClass(r3)
            java.lang.Object r1 = invokeStaticMethod(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.Object invokeStaticMethod(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object[] r3, java.lang.Class<?>[] r4) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r3)
            java.lang.Class[] r4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r4)
            java.lang.reflect.Method r4 = getMatchingAccessibleMethod(r1, r2, r4)
            if (r4 == 0) goto L18
            java.lang.Object[] r1 = toVarArgs(r4, r3)
            r2 = 0
            java.lang.Object r1 = r4.invoke(r2, r1)
            return r1
        L18:
            java.lang.NoSuchMethodException r3 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "No such accessible method: "
            r4.<init>(r0)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = "() on class: "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r3.<init>(r1)
            throw r3
    }

    static /* synthetic */ boolean lambda$getMatchingAccessibleMethod$0(java.lang.String r1, java.lang.Class[] r2, java.lang.reflect.Method r3) {
            java.lang.String r0 = r3.getName()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L12
            boolean r1 = org.apache.commons.lang3.reflect.MemberUtils.isMatchingMethod(r3, r2)
            if (r1 == 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    static /* synthetic */ boolean lambda$getMatchingMethod$1(java.lang.String r0, java.lang.reflect.Method r1) {
            java.lang.String r1 = r1.getName()
            boolean r0 = r1.equals(r0)
            return r0
    }

    static /* synthetic */ boolean lambda$getMatchingMethod$2(java.lang.String r0, java.lang.reflect.Method r1) {
            java.lang.String r1 = r1.getName()
            boolean r0 = r1.equals(r0)
            return r0
    }

    static /* synthetic */ boolean lambda$getMatchingMethod$3(java.lang.Class[] r1, java.lang.reflect.Method r2) {
            java.lang.Class[] r2 = r2.getParameterTypes()
            r0 = 1
            boolean r1 = org.apache.commons.lang3.ClassUtils.isAssignable(r1, r2, r0)
            return r1
    }

    static /* synthetic */ java.util.List lambda$getMatchingMethod$4(java.lang.Integer r0) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    static /* synthetic */ void lambda$getMatchingMethod$5(java.lang.Class[] r1, java.util.TreeMap r2, java.lang.reflect.Method r3) {
            java.lang.Class[] r0 = r3.getParameterTypes()
            int r1 = distance(r1, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda3
            r0.<init>()
            java.lang.Object r1 = r2.computeIfAbsent(r1, r0)
            java.util.List r1 = (java.util.List) r1
            r1.add(r3)
            return
    }

    static /* synthetic */ boolean lambda$getMethodsListWithAnnotation$6(java.lang.Class r0, java.lang.reflect.Method r1) {
            boolean r0 = r1.isAnnotationPresent(r0)
            return r0
    }

    static /* synthetic */ void lambda$getMethodsListWithAnnotation$7(boolean r0, java.lang.Class r1, java.util.List r2, java.lang.Class r3) {
            if (r0 == 0) goto L7
            java.lang.reflect.Method[] r0 = r3.getDeclaredMethods()
            goto Lb
        L7:
            java.lang.reflect.Method[] r0 = r3.getMethods()
        Lb:
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda4 r3 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda4
            r3.<init>(r1)
            java.util.stream.Stream r0 = r0.filter(r3)
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda12 r1 = new org.apache.commons.lang3.reflect.MethodUtils$$ExternalSyntheticLambda12
            r1.<init>(r2)
            r0.forEachOrdered(r1)
            return
    }

    static /* synthetic */ java.lang.Object[] lambda$getVarArgs$8(java.lang.Class[] r0) {
            int r0 = r0.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$getVarArgs$9(java.lang.Class r0, int r1, java.lang.Integer r2) {
            java.lang.Class r0 = org.apache.commons.lang3.ClassUtils.primitiveToWrapper(r0)
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            return r0
    }

    private static java.lang.Object[] toVarArgs(java.lang.reflect.Method r1, java.lang.Object[] r2) {
            boolean r0 = r1.isVarArgs()
            if (r0 == 0) goto Le
            java.lang.Class[] r1 = r1.getParameterTypes()
            java.lang.Object[] r2 = getVarArgs(r2, r1)
        Le:
            return r2
    }
}
