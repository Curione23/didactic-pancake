package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class ClassUtils {
    private static final java.util.Comparator<java.lang.Class<?>> COMPARATOR = null;
    public static final java.lang.String INNER_CLASS_SEPARATOR = null;
    public static final char INNER_CLASS_SEPARATOR_CHAR = '$';
    public static final java.lang.String PACKAGE_SEPARATOR = null;
    public static final char PACKAGE_SEPARATOR_CHAR = '.';
    private static final java.util.Map<java.lang.String, java.lang.String> abbreviationMap = null;
    private static final java.util.Map<java.lang.String, java.lang.Class<?>> namePrimitiveMap = null;
    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> primitiveWrapperMap = null;
    private static final java.util.Map<java.lang.String, java.lang.String> reverseAbbreviationMap = null;
    private static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> wrapperPrimitiveMap = null;



    public enum Interfaces extends java.lang.Enum<org.apache.commons.lang3.ClassUtils.Interfaces> {
        private static final /* synthetic */ org.apache.commons.lang3.ClassUtils.Interfaces[] $VALUES = null;
        public static final org.apache.commons.lang3.ClassUtils.Interfaces EXCLUDE = null;
        public static final org.apache.commons.lang3.ClassUtils.Interfaces INCLUDE = null;

        private static /* synthetic */ org.apache.commons.lang3.ClassUtils.Interfaces[] $values() {
                org.apache.commons.lang3.ClassUtils$Interfaces r0 = org.apache.commons.lang3.ClassUtils.Interfaces.INCLUDE
                org.apache.commons.lang3.ClassUtils$Interfaces r1 = org.apache.commons.lang3.ClassUtils.Interfaces.EXCLUDE
                org.apache.commons.lang3.ClassUtils$Interfaces[] r0 = new org.apache.commons.lang3.ClassUtils.Interfaces[]{r0, r1}
                return r0
        }

        static {
                org.apache.commons.lang3.ClassUtils$Interfaces r0 = new org.apache.commons.lang3.ClassUtils$Interfaces
                java.lang.String r1 = "INCLUDE"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.lang3.ClassUtils.Interfaces.INCLUDE = r0
                org.apache.commons.lang3.ClassUtils$Interfaces r0 = new org.apache.commons.lang3.ClassUtils$Interfaces
                java.lang.String r1 = "EXCLUDE"
                r2 = 1
                r0.<init>(r1, r2)
                org.apache.commons.lang3.ClassUtils.Interfaces.EXCLUDE = r0
                org.apache.commons.lang3.ClassUtils$Interfaces[] r0 = $values()
                org.apache.commons.lang3.ClassUtils.Interfaces.$VALUES = r0
                return
        }

        Interfaces(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.lang3.ClassUtils.Interfaces valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.lang3.ClassUtils$Interfaces> r0 = org.apache.commons.lang3.ClassUtils.Interfaces.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.lang3.ClassUtils$Interfaces r1 = (org.apache.commons.lang3.ClassUtils.Interfaces) r1
                return r1
        }

        public static org.apache.commons.lang3.ClassUtils.Interfaces[] values() {
                org.apache.commons.lang3.ClassUtils$Interfaces[] r0 = org.apache.commons.lang3.ClassUtils.Interfaces.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.lang3.ClassUtils$Interfaces[] r0 = (org.apache.commons.lang3.ClassUtils.Interfaces[]) r0
                return r0
        }
    }

    public static /* synthetic */ int $r8$lambda$CGqWnFBBj6VUOcQV6XqGdh42EF8(java.lang.String r0, java.lang.String r1) {
            int r0 = r0.compareTo(r1)
            return r0
    }

    static {
            org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.lang3.ClassUtils.COMPARATOR = r0
            r0 = 46
            java.lang.String r0 = java.lang.String.valueOf(r0)
            org.apache.commons.lang3.ClassUtils.PACKAGE_SEPARATOR = r0
            r0 = 36
            java.lang.String r0 = java.lang.String.valueOf(r0)
            org.apache.commons.lang3.ClassUtils.INNER_CLASS_SEPARATOR = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.apache.commons.lang3.ClassUtils.namePrimitiveMap = r0
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.String r1 = r1.getSimpleName()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.String r1 = r1.getSimpleName()
            java.lang.Class r2 = java.lang.Byte.TYPE
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.String r1 = r1.getSimpleName()
            java.lang.Class r2 = java.lang.Character.TYPE
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.String r1 = r1.getSimpleName()
            java.lang.Class r2 = java.lang.Double.TYPE
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.String r1 = r1.getSimpleName()
            java.lang.Class r2 = java.lang.Float.TYPE
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.String r1 = r1.getSimpleName()
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.String r1 = r1.getSimpleName()
            java.lang.Class r2 = java.lang.Long.TYPE
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.String r1 = r1.getSimpleName()
            java.lang.Class r2 = java.lang.Short.TYPE
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Void.TYPE
            java.lang.String r1 = r1.getSimpleName()
            java.lang.Class r2 = java.lang.Void.TYPE
            r0.put(r1, r2)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.apache.commons.lang3.ClassUtils.primitiveWrapperMap = r0
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Void.TYPE
            java.lang.Class r2 = java.lang.Void.TYPE
            r0.put(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            org.apache.commons.lang3.ClassUtils.wrapperPrimitiveMap = r1
            org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda3 r1 = new org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda3
            r1.<init>()
            r0.forEach(r1)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "int"
            java.lang.String r2 = "I"
            r0.put(r1, r2)
            java.lang.String r1 = "boolean"
            java.lang.String r2 = "Z"
            r0.put(r1, r2)
            java.lang.String r1 = "float"
            java.lang.String r2 = "F"
            r0.put(r1, r2)
            java.lang.String r1 = "long"
            java.lang.String r2 = "J"
            r0.put(r1, r2)
            java.lang.String r1 = "short"
            java.lang.String r2 = "S"
            r0.put(r1, r2)
            java.lang.String r1 = "byte"
            java.lang.String r2 = "B"
            r0.put(r1, r2)
            java.lang.String r1 = "double"
            java.lang.String r2 = "D"
            r0.put(r1, r2)
            java.lang.String r1 = "char"
            java.lang.String r2 = "C"
            r0.put(r1, r2)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)
            org.apache.commons.lang3.ClassUtils.abbreviationMap = r1
            java.util.Set r0 = r0.entrySet()
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda4 r1 = new org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda4
            r1.<init>()
            org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda5 r2 = new org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda5
            r2.<init>()
            java.util.stream.Collector r1 = java.util.stream.Collectors.toMap(r1, r2)
            java.lang.Object r0 = r0.collect(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            org.apache.commons.lang3.ClassUtils.reverseAbbreviationMap = r0
            return
    }

    @java.lang.Deprecated
    public ClassUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.Comparator<java.lang.Class<?>> comparator() {
            java.util.Comparator<java.lang.Class<?>> r0 = org.apache.commons.lang3.ClassUtils.COMPARATOR
            return r0
    }

    public static java.util.List<java.lang.Class<?>> convertClassNamesToClasses(java.util.List<java.lang.String> r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda6 r1 = new org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda6
            r1.<init>(r0)
            r2.forEach(r1)
            return r0
    }

    public static java.util.List<java.lang.String> convertClassesToClassNames(java.util.List<java.lang.Class<?>> r1) {
            if (r1 != 0) goto L4
            r1 = 0
            goto L1b
        L4:
            java.util.stream.Stream r1 = r1.stream()
            org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda10 r0 = new org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda10
            r0.<init>()
            java.util.stream.Stream r1 = r1.map(r0)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r0)
            java.util.List r1 = (java.util.List) r1
        L1b:
            return r1
    }

    public static java.lang.String getAbbreviatedName(java.lang.Class<?> r0, int r1) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getAbbreviatedName(r0, r1)
            return r0
    }

    public static java.lang.String getAbbreviatedName(java.lang.String r6, int r7) {
            if (r7 <= 0) goto L4c
            if (r6 != 0) goto L7
            java.lang.String r6 = ""
            return r6
        L7:
            int r0 = r6.length()
            if (r0 > r7) goto Le
            return r6
        Le:
            char[] r6 = r6.toCharArray()
            r0 = 0
            r1 = r0
            r2 = r1
        L15:
            int r3 = r6.length
            if (r1 >= r3) goto L46
            r3 = r2
        L19:
            int r4 = r6.length
            if (r1 >= r4) goto L2a
            char r4 = r6[r1]
            r5 = 46
            if (r4 == r5) goto L2a
            int r5 = r3 + 1
            int r1 = r1 + 1
            r6[r3] = r4
            r3 = r5
            goto L19
        L2a:
            int r2 = r2 + 1
            int r4 = r6.length
            boolean r4 = useFull(r3, r1, r4, r7)
            if (r4 != 0) goto L37
            if (r2 <= r3) goto L36
            goto L37
        L36:
            r3 = r2
        L37:
            int r2 = r6.length
            if (r1 >= r2) goto L44
            int r2 = r3 + 1
            int r4 = r1 + 1
            char r1 = r6[r1]
            r6[r3] = r1
            r1 = r4
            goto L15
        L44:
            r2 = r3
            goto L15
        L46:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6, r0, r2)
            return r7
        L4c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "len must be > 0"
            r6.<init>(r7)
            throw r6
    }

    public static java.util.List<java.lang.Class<?>> getAllInterfaces(java.lang.Class<?> r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            getAllInterfaces(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            return r1
    }

    private static void getAllInterfaces(java.lang.Class<?> r5, java.util.HashSet<java.lang.Class<?>> r6) {
        L0:
            if (r5 == 0) goto L1d
            java.lang.Class[] r0 = r5.getInterfaces()
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            boolean r4 = r6.add(r3)
            if (r4 == 0) goto L15
            getAllInterfaces(r3, r6)
        L15:
            int r2 = r2 + 1
            goto L8
        L18:
            java.lang.Class r5 = r5.getSuperclass()
            goto L0
        L1d:
            return
    }

    public static java.util.List<java.lang.Class<?>> getAllSuperclasses(java.lang.Class<?> r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class r1 = r1.getSuperclass()
        Ld:
            if (r1 == 0) goto L17
            r0.add(r1)
            java.lang.Class r1 = r1.getSuperclass()
            goto Ld
        L17:
            return r0
    }

    public static java.lang.String getCanonicalName(java.lang.Class<?> r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = getCanonicalName(r1, r0)
            return r1
    }

    public static java.lang.String getCanonicalName(java.lang.Class<?> r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            java.lang.String r0 = r0.getCanonicalName()
            if (r0 != 0) goto La
            goto Lb
        La:
            r1 = r0
        Lb:
            return r1
    }

    public static java.lang.String getCanonicalName(java.lang.Object r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = getCanonicalName(r1, r0)
            return r1
    }

    public static java.lang.String getCanonicalName(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            if (r0 != 0) goto Le
            goto Lf
        Le:
            r1 = r0
        Lf:
            return r1
    }

    private static java.lang.String getCanonicalName(java.lang.String r4) {
            java.lang.String r4 = org.apache.commons.lang3.StringUtils.deleteWhitespace(r4)
            if (r4 != 0) goto L8
            r4 = 0
            return r4
        L8:
            r0 = 0
            r1 = r0
        La:
            java.lang.String r2 = "["
            boolean r2 = r4.startsWith(r2)
            r3 = 1
            if (r2 == 0) goto L1a
            int r1 = r1 + 1
            java.lang.String r4 = r4.substring(r3)
            goto La
        L1a:
            if (r1 >= r3) goto L1d
            return r4
        L1d:
            java.lang.String r2 = "L"
            boolean r2 = r4.startsWith(r2)
            if (r2 == 0) goto L3c
            java.lang.String r2 = ";"
            boolean r2 = r4.endsWith(r2)
            if (r2 == 0) goto L33
            int r2 = r4.length()
            int r2 = r2 - r3
            goto L37
        L33:
            int r2 = r4.length()
        L37:
            java.lang.String r4 = r4.substring(r3, r2)
            goto L4e
        L3c:
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L4e
            java.util.Map<java.lang.String, java.lang.String> r2 = org.apache.commons.lang3.ClassUtils.reverseAbbreviationMap
            java.lang.String r4 = r4.substring(r0, r3)
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
        L4e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
        L53:
            if (r0 >= r1) goto L5d
            java.lang.String r4 = "[]"
            r2.append(r4)
            int r0 = r0 + 1
            goto L53
        L5d:
            java.lang.String r4 = r2.toString()
            return r4
    }

    public static java.lang.Class<?> getClass(java.lang.ClassLoader r1, java.lang.String r2) throws java.lang.ClassNotFoundException {
            r0 = 1
            java.lang.Class r1 = getClass(r1, r2, r0)
            return r1
    }

    public static java.lang.Class<?> getClass(java.lang.ClassLoader r4, java.lang.String r5, boolean r6) throws java.lang.ClassNotFoundException {
            java.lang.Class r0 = getPrimitiveClass(r5)     // Catch: java.lang.ClassNotFoundException -> L10
            if (r0 == 0) goto L7
            goto Lf
        L7:
            java.lang.String r0 = toCanonicalName(r5)     // Catch: java.lang.ClassNotFoundException -> L10
            java.lang.Class r0 = java.lang.Class.forName(r0, r6, r4)     // Catch: java.lang.ClassNotFoundException -> L10
        Lf:
            return r0
        L10:
            r0 = move-exception
            r1 = 46
            int r1 = r5.lastIndexOf(r1)
            r2 = -1
            if (r1 == r2) goto L41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L41
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L41
            r3 = 0
            java.lang.String r3 = r5.substring(r3, r1)     // Catch: java.lang.ClassNotFoundException -> L41
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.ClassNotFoundException -> L41
            r3 = 36
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.ClassNotFoundException -> L41
            int r1 = r1 + 1
            java.lang.String r5 = r5.substring(r1)     // Catch: java.lang.ClassNotFoundException -> L41
            java.lang.StringBuilder r5 = r2.append(r5)     // Catch: java.lang.ClassNotFoundException -> L41
            java.lang.String r5 = r5.toString()     // Catch: java.lang.ClassNotFoundException -> L41
            java.lang.Class r4 = getClass(r4, r5, r6)     // Catch: java.lang.ClassNotFoundException -> L41
            return r4
        L41:
            throw r0
    }

    public static java.lang.Class<?> getClass(java.lang.String r1) throws java.lang.ClassNotFoundException {
            r0 = 1
            java.lang.Class r1 = getClass(r1, r0)
            return r1
    }

    public static java.lang.Class<?> getClass(java.lang.String r1, boolean r2) throws java.lang.ClassNotFoundException {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            if (r0 != 0) goto L10
            java.lang.Class<org.apache.commons.lang3.ClassUtils> r0 = org.apache.commons.lang3.ClassUtils.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
        L10:
            java.lang.Class r1 = getClass(r0, r1, r2)
            return r1
    }

    public static <T> java.lang.Class<T> getComponentType(java.lang.Class<T[]> r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.lang.Class r0 = r0.getComponentType()
        L8:
            return r0
    }

    public static java.lang.String getName(java.lang.Class<?> r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = getName(r1, r0)
            return r1
    }

    public static java.lang.String getName(java.lang.Class<?> r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            goto L7
        L3:
            java.lang.String r1 = r0.getName()
        L7:
            return r1
    }

    public static java.lang.String getName(java.lang.Object r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = getName(r1, r0)
            return r1
    }

    public static java.lang.String getName(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            goto Lb
        L3:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getName()
        Lb:
            return r1
    }

    public static java.lang.String getPackageCanonicalName(java.lang.Class<?> r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getPackageCanonicalName(r0)
            return r0
    }

    public static java.lang.String getPackageCanonicalName(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getPackageCanonicalName(r0)
            return r0
    }

    public static java.lang.String getPackageCanonicalName(java.lang.String r0) {
            java.lang.String r0 = getCanonicalName(r0)
            java.lang.String r0 = getPackageName(r0)
            return r0
    }

    public static java.lang.String getPackageName(java.lang.Class<?> r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getPackageName(r0)
            return r0
    }

    public static java.lang.String getPackageName(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = getPackageName(r0)
            return r0
    }

    public static java.lang.String getPackageName(java.lang.String r5) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r5)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            r0 = 0
            char r2 = r5.charAt(r0)
            r3 = 91
            r4 = 1
            if (r2 != r3) goto L18
            java.lang.String r5 = r5.substring(r4)
            goto L9
        L18:
            char r2 = r5.charAt(r0)
            r3 = 76
            if (r2 != r3) goto L31
            int r2 = r5.length()
            int r2 = r2 - r4
            char r2 = r5.charAt(r2)
            r3 = 59
            if (r2 != r3) goto L31
            java.lang.String r5 = r5.substring(r4)
        L31:
            r2 = 46
            int r2 = r5.lastIndexOf(r2)
            r3 = -1
            if (r2 != r3) goto L3b
            return r1
        L3b:
            java.lang.String r5 = r5.substring(r0, r2)
            return r5
    }

    static java.lang.Class<?> getPrimitiveClass(java.lang.String r1) {
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = org.apache.commons.lang3.ClassUtils.namePrimitiveMap
            java.lang.Object r1 = r0.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    public static java.lang.reflect.Method getPublicMethod(java.lang.Class<?> r2, java.lang.String r3, java.lang.Class<?>... r4) throws java.lang.NoSuchMethodException {
            java.lang.reflect.Method r0 = r2.getMethod(r3, r4)
            java.lang.Class r1 = r0.getDeclaringClass()
            boolean r1 = isPublic(r1)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = getAllInterfaces(r2)
            r0.<init>(r1)
            java.util.List r2 = getAllSuperclasses(r2)
            r0.addAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L23:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r2.next()
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = isPublic(r0)
            if (r1 != 0) goto L36
            goto L23
        L36:
            java.lang.reflect.Method r0 = r0.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L23
            java.lang.Class r1 = r0.getDeclaringClass()
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L23
            return r0
        L49:
            java.lang.NoSuchMethodException r2 = new java.lang.NoSuchMethodException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't find a public method for "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " "
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = org.apache.commons.lang3.ArrayUtils.toString(r4)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static java.lang.String getShortCanonicalName(java.lang.Class<?> r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            goto Ld
        L5:
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.String r0 = getShortCanonicalName(r0)
        Ld:
            return r0
    }

    public static java.lang.String getShortCanonicalName(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            goto Lf
        L3:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.String r1 = getShortCanonicalName(r0)
        Lf:
            return r1
    }

    public static java.lang.String getShortCanonicalName(java.lang.String r0) {
            java.lang.String r0 = getCanonicalName(r0)
            java.lang.String r0 = getShortClassName(r0)
            return r0
    }

    public static java.lang.String getShortClassName(java.lang.Class<?> r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = getShortClassName(r0)
            return r0
    }

    public static java.lang.String getShortClassName(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            return r1
        L3:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = getShortClassName(r0)
            return r0
    }

    public static java.lang.String getShortClassName(java.lang.String r7) {
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r7)
            if (r0 == 0) goto L9
            java.lang.String r7 = ""
            return r7
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            boolean r1 = r7.startsWith(r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L56
        L18:
            char r1 = r7.charAt(r2)
            r4 = 91
            if (r1 != r4) goto L2a
            java.lang.String r7 = r7.substring(r3)
            java.lang.String r1 = "[]"
            r0.append(r1)
            goto L18
        L2a:
            char r1 = r7.charAt(r2)
            r4 = 76
            if (r1 != r4) goto L48
            int r1 = r7.length()
            int r1 = r1 - r3
            char r1 = r7.charAt(r1)
            r4 = 59
            if (r1 != r4) goto L48
            int r1 = r7.length()
            int r1 = r1 - r3
            java.lang.String r7 = r7.substring(r3, r1)
        L48:
            java.util.Map<java.lang.String, java.lang.String> r1 = org.apache.commons.lang3.ClassUtils.reverseAbbreviationMap
            boolean r4 = r1.containsKey(r7)
            if (r4 == 0) goto L56
            java.lang.Object r7 = r1.get(r7)
            java.lang.String r7 = (java.lang.String) r7
        L56:
            r1 = 46
            int r4 = r7.lastIndexOf(r1)
            r5 = -1
            if (r4 != r5) goto L60
            goto L62
        L60:
            int r2 = r4 + 1
        L62:
            r6 = 36
            int r2 = r7.indexOf(r6, r2)
            int r4 = r4 + r3
            java.lang.String r7 = r7.substring(r4)
            if (r2 == r5) goto L73
            java.lang.String r7 = r7.replace(r6, r1)
        L73:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r7 = r7.toString()
            return r7
    }

    public static java.lang.String getSimpleName(java.lang.Class<?> r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = getSimpleName(r1, r0)
            return r1
    }

    public static java.lang.String getSimpleName(java.lang.Class<?> r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            goto L7
        L3:
            java.lang.String r1 = r0.getSimpleName()
        L7:
            return r1
    }

    public static java.lang.String getSimpleName(java.lang.Object r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = getSimpleName(r1, r0)
            return r1
    }

    public static java.lang.String getSimpleName(java.lang.Object r0, java.lang.String r1) {
            if (r0 != 0) goto L3
            goto Lb
        L3:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getSimpleName()
        Lb:
            return r1
    }

    public static java.lang.Iterable<java.lang.Class<?>> hierarchy(java.lang.Class<?> r1) {
            org.apache.commons.lang3.ClassUtils$Interfaces r0 = org.apache.commons.lang3.ClassUtils.Interfaces.EXCLUDE
            java.lang.Iterable r1 = hierarchy(r1, r0)
            return r1
    }

    public static java.lang.Iterable<java.lang.Class<?>> hierarchy(java.lang.Class<?> r1, org.apache.commons.lang3.ClassUtils.Interfaces r2) {
            org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda7 r0 = new org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda7
            r0.<init>(r1)
            org.apache.commons.lang3.ClassUtils$Interfaces r1 = org.apache.commons.lang3.ClassUtils.Interfaces.INCLUDE
            if (r2 == r1) goto La
            return r0
        La:
            org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda8 r1 = new org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda8
            r1.<init>(r0)
            return r1
    }

    public static boolean isAssignable(java.lang.Class<?> r1, java.lang.Class<?> r2) {
            r0 = 1
            boolean r1 = isAssignable(r1, r2, r0)
            return r1
    }

    public static boolean isAssignable(java.lang.Class<?> r2, java.lang.Class<?> r3, boolean r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r2 != 0) goto Ld
            boolean r2 = r3.isPrimitive()
            r2 = r2 ^ r1
            return r2
        Ld:
            if (r4 == 0) goto L35
            boolean r4 = r2.isPrimitive()
            if (r4 == 0) goto L22
            boolean r4 = r3.isPrimitive()
            if (r4 != 0) goto L22
            java.lang.Class r2 = primitiveToWrapper(r2)
            if (r2 != 0) goto L22
            return r0
        L22:
            boolean r4 = r3.isPrimitive()
            if (r4 == 0) goto L35
            boolean r4 = r2.isPrimitive()
            if (r4 != 0) goto L35
            java.lang.Class r2 = wrapperToPrimitive(r2)
            if (r2 != 0) goto L35
            return r0
        L35:
            boolean r4 = r2.equals(r3)
            if (r4 == 0) goto L3c
            return r1
        L3c:
            boolean r4 = r2.isPrimitive()
            if (r4 == 0) goto L10b
            boolean r4 = r3.isPrimitive()
            if (r4 != 0) goto L49
            return r0
        L49:
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L6b
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L69
            java.lang.Class r2 = java.lang.Float.TYPE
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L69
            java.lang.Class r2 = java.lang.Double.TYPE
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6a
        L69:
            r0 = r1
        L6a:
            return r0
        L6b:
            java.lang.Class r4 = java.lang.Long.TYPE
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L85
            java.lang.Class r2 = java.lang.Float.TYPE
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L83
            java.lang.Class r2 = java.lang.Double.TYPE
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L84
        L83:
            r0 = r1
        L84:
            return r0
        L85:
            java.lang.Class r4 = java.lang.Boolean.TYPE
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L8e
            return r0
        L8e:
            java.lang.Class r4 = java.lang.Double.TYPE
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L97
            return r0
        L97:
            java.lang.Class r4 = java.lang.Float.TYPE
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto La6
            java.lang.Class r2 = java.lang.Double.TYPE
            boolean r2 = r2.equals(r3)
            return r2
        La6:
            java.lang.Class r4 = java.lang.Character.TYPE
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto Le9
            java.lang.Class r4 = java.lang.Short.TYPE
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto Lb7
            goto Le9
        Lb7:
            java.lang.Class r4 = java.lang.Byte.TYPE
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Le8
            java.lang.Class r2 = java.lang.Short.TYPE
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Le7
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Le7
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Le7
            java.lang.Class r2 = java.lang.Float.TYPE
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Le7
            java.lang.Class r2 = java.lang.Double.TYPE
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Le8
        Le7:
            r0 = r1
        Le8:
            return r0
        Le9:
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L109
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L109
            java.lang.Class r2 = java.lang.Float.TYPE
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L109
            java.lang.Class r2 = java.lang.Double.TYPE
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L10a
        L109:
            r0 = r1
        L10a:
            return r0
        L10b:
            boolean r2 = r3.isAssignableFrom(r2)
            return r2
    }

    public static boolean isAssignable(java.lang.Class<?>[] r1, java.lang.Class<?>... r2) {
            r0 = 1
            boolean r1 = isAssignable(r1, r2, r0)
            return r1
    }

    public static boolean isAssignable(java.lang.Class<?>[] r4, java.lang.Class<?>[] r5, boolean r6) {
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isSameLength(r4, r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Class[] r4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r4)
            java.lang.Class[] r5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(r5)
            r0 = r1
        L11:
            int r2 = r4.length
            if (r0 >= r2) goto L22
            r2 = r4[r0]
            r3 = r5[r0]
            boolean r2 = isAssignable(r2, r3, r6)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            int r0 = r0 + 1
            goto L11
        L22:
            r4 = 1
            return r4
    }

    public static boolean isInnerClass(java.lang.Class<?> r0) {
            if (r0 == 0) goto La
            java.lang.Class r0 = r0.getEnclosingClass()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public static boolean isPrimitiveOrWrapper(java.lang.Class<?> r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2.isPrimitive()
            if (r1 != 0) goto L10
            boolean r2 = isPrimitiveWrapper(r2)
            if (r2 == 0) goto L11
        L10:
            r0 = 1
        L11:
            return r0
    }

    public static boolean isPrimitiveWrapper(java.lang.Class<?> r1) {
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = org.apache.commons.lang3.ClassUtils.wrapperPrimitiveMap
            boolean r1 = r0.containsKey(r1)
            return r1
    }

    public static boolean isPublic(java.lang.Class<?> r0) {
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            return r0
    }

    static /* synthetic */ void lambda$convertClassNamesToClasses$3(java.util.List r0, java.lang.String r1) {
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L8
            r0.add(r1)     // Catch: java.lang.Exception -> L8
            goto Lc
        L8:
            r1 = 0
            r0.add(r1)
        Lc:
            return
    }

    static /* synthetic */ java.lang.String lambda$convertClassesToClassNames$2(java.lang.Class r1) {
            r0 = 0
            java.lang.String r1 = getName(r1, r0)
            return r1
    }

    static /* synthetic */ java.util.Iterator lambda$hierarchy$4(java.lang.Class r1) {
            org.apache.commons.lang3.mutable.MutableObject r0 = new org.apache.commons.lang3.mutable.MutableObject
            r0.<init>(r1)
            org.apache.commons.lang3.ClassUtils$1 r1 = new org.apache.commons.lang3.ClassUtils$1
            r1.<init>(r0)
            return r1
    }

    static /* synthetic */ java.util.Iterator lambda$hierarchy$5(java.lang.Iterable r2) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
            org.apache.commons.lang3.ClassUtils$2 r1 = new org.apache.commons.lang3.ClassUtils$2
            r1.<init>(r2, r0)
            return r1
    }

    static /* synthetic */ java.lang.Class lambda$primitivesToWrappers$6(java.lang.Class[] r0, int r1) {
            r0 = r0[r1]
            java.lang.Class r0 = primitiveToWrapper(r0)
            return r0
    }

    static /* synthetic */ int lambda$static$0(java.lang.Class r1, java.lang.Class r2) {
            java.lang.String r1 = getName(r1)
            java.lang.String r2 = getName(r2)
            org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda9 r0 = new org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda9
            r0.<init>()
            int r1 = java.util.Objects.compare(r1, r2, r0)
            return r1
    }

    static /* synthetic */ void lambda$static$1(java.lang.Class r1, java.lang.Class r2) {
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto Lb
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = org.apache.commons.lang3.ClassUtils.wrapperPrimitiveMap
            r0.put(r2, r1)
        Lb:
            return
    }

    static /* synthetic */ java.lang.Class lambda$toClass$7(java.lang.Object[] r0, int r1) {
            r0 = r0[r1]
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.Class r0 = r0.getClass()
        La:
            return r0
    }

    static /* synthetic */ java.lang.Class lambda$wrappersToPrimitives$8(java.lang.Class[] r0, int r1) {
            r0 = r0[r1]
            java.lang.Class r0 = wrapperToPrimitive(r0)
            return r0
    }

    public static java.lang.Class<?> primitiveToWrapper(java.lang.Class<?> r1) {
            if (r1 == 0) goto L10
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L10
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = org.apache.commons.lang3.ClassUtils.primitiveWrapperMap
            java.lang.Object r1 = r0.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
        L10:
            return r1
    }

    public static java.lang.Class<?>[] primitivesToWrappers(java.lang.Class<?>... r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length
            if (r0 != 0) goto L8
            return r2
        L8:
            int r0 = r2.length
            java.lang.Class[] r0 = new java.lang.Class[r0]
            org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda2 r1 = new org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda2
            r1.<init>(r2)
            java.util.Arrays.setAll(r0, r1)
            return r0
    }

    private static java.lang.String toCanonicalName(java.lang.String r4) {
            java.lang.String r4 = org.apache.commons.lang3.StringUtils.deleteWhitespace(r4)
            java.lang.String r0 = "className"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String r0 = "[]"
            boolean r1 = r4.endsWith(r0)
            if (r1 == 0) goto L4e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L16:
            boolean r2 = r4.endsWith(r0)
            if (r2 == 0) goto L2d
            int r2 = r4.length()
            int r2 = r2 + (-2)
            r3 = 0
            java.lang.String r4 = r4.substring(r3, r2)
            java.lang.String r2 = "["
            r1.append(r2)
            goto L16
        L2d:
            java.util.Map<java.lang.String, java.lang.String> r0 = org.apache.commons.lang3.ClassUtils.abbreviationMap
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L3b
            r1.append(r0)
            goto L4a
        L3b:
            java.lang.String r0 = "L"
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = ";"
            r4.append(r0)
        L4a:
            java.lang.String r4 = r1.toString()
        L4e:
            return r4
    }

    public static java.lang.Class<?>[] toClass(java.lang.Object... r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length
            if (r0 != 0) goto La
            java.lang.Class<?>[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY
            return r2
        La:
            int r0 = r2.length
            java.lang.Class[] r0 = new java.lang.Class[r0]
            org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda11 r1 = new org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda11
            r1.<init>(r2)
            java.util.Arrays.setAll(r0, r1)
            return r0
    }

    private static boolean useFull(int r0, int r1, int r2, int r3) {
            if (r1 >= r2) goto L9
            int r0 = r0 + r2
            int r0 = r0 - r1
            if (r0 > r3) goto L7
            goto L9
        L7:
            r0 = 0
            goto La
        L9:
            r0 = 1
        La:
            return r0
    }

    public static java.lang.Class<?> wrapperToPrimitive(java.lang.Class<?> r1) {
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = org.apache.commons.lang3.ClassUtils.wrapperPrimitiveMap
            java.lang.Object r1 = r0.get(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    public static java.lang.Class<?>[] wrappersToPrimitives(java.lang.Class<?>... r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length
            if (r0 != 0) goto L8
            return r2
        L8:
            int r0 = r2.length
            java.lang.Class[] r0 = new java.lang.Class[r0]
            org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda1 r1 = new org.apache.commons.lang3.ClassUtils$$ExternalSyntheticLambda1
            r1.<init>(r2)
            java.util.Arrays.setAll(r0, r1)
            return r0
    }
}
