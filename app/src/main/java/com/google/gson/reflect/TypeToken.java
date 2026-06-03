package com.google.gson.reflect;

/* JADX INFO: loaded from: classes2.dex */
public class TypeToken<T> {
    private final int hashCode;
    private final java.lang.Class<? super T> rawType;
    private final java.lang.reflect.Type type;

    protected TypeToken() {
            r2 = this;
            r2.<init>()
            java.lang.reflect.Type r0 = r2.getTypeTokenTypeArgument()
            r2.type = r0
            java.lang.Class r1 = com.google.gson.internal.C$Gson$Types.getRawType(r0)
            r2.rawType = r1
            int r0 = r0.hashCode()
            r2.hashCode = r0
            return
    }

    private TypeToken(java.lang.reflect.Type r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.reflect.Type r2 = com.google.gson.internal.C$Gson$Types.canonicalize(r2)
            r1.type = r2
            java.lang.Class r0 = com.google.gson.internal.C$Gson$Types.getRawType(r2)
            r1.rawType = r0
            int r2 = r2.hashCode()
            r1.hashCode = r2
            return
    }

    private static java.lang.IllegalArgumentException buildUnsupportedTypeException(java.lang.reflect.Type r5, java.lang.Class<?>... r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported type, expected one of: "
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L1d
            r3 = r6[r2]
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r4 = ", "
            r3.append(r4)
            int r2 = r2 + 1
            goto L9
        L1d:
            java.lang.String r6 = "but got: "
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.Class r1 = r5.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r1 = ", for type token: "
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r5 = r5.toString()
            r6.append(r5)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            return r5
    }

    public static <T> com.google.gson.reflect.TypeToken<T> get(java.lang.Class<T> r1) {
            com.google.gson.reflect.TypeToken r0 = new com.google.gson.reflect.TypeToken
            r0.<init>(r1)
            return r0
    }

    public static com.google.gson.reflect.TypeToken<?> get(java.lang.reflect.Type r1) {
            com.google.gson.reflect.TypeToken r0 = new com.google.gson.reflect.TypeToken
            r0.<init>(r1)
            return r0
    }

    public static com.google.gson.reflect.TypeToken<?> getArray(java.lang.reflect.Type r1) {
            com.google.gson.reflect.TypeToken r0 = new com.google.gson.reflect.TypeToken
            java.lang.reflect.GenericArrayType r1 = com.google.gson.internal.C$Gson$Types.arrayOf(r1)
            r0.<init>(r1)
            return r0
    }

    public static com.google.gson.reflect.TypeToken<?> getParameterized(java.lang.reflect.Type r11, java.lang.reflect.Type... r12) {
            java.util.Objects.requireNonNull(r11)
            java.util.Objects.requireNonNull(r12)
            boolean r0 = r11 instanceof java.lang.Class
            if (r0 == 0) goto Lcf
            r0 = r11
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.reflect.TypeVariable[] r1 = r0.getTypeParameters()
            int r2 = r1.length
            int r3 = r12.length
            if (r3 != r2) goto La4
            int r3 = r12.length
            if (r3 != 0) goto L1d
            com.google.gson.reflect.TypeToken r11 = get(r0)
            return r11
        L1d:
            boolean r3 = com.google.gson.internal.C$Gson$Types.requiresOwnerType(r11)
            if (r3 != 0) goto L85
            r0 = 0
            r3 = r0
        L25:
            if (r3 >= r2) goto L7a
            r4 = r12[r3]
            java.lang.String r5 = "Type argument must not be null"
            java.lang.Object r4 = java.util.Objects.requireNonNull(r4, r5)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            java.lang.Class r5 = com.google.gson.internal.C$Gson$Types.getRawType(r4)
            r6 = r1[r3]
            java.lang.reflect.Type[] r7 = r6.getBounds()
            int r8 = r7.length
            r9 = r0
        L3d:
            if (r9 >= r8) goto L77
            r10 = r7[r9]
            java.lang.Class r10 = com.google.gson.internal.C$Gson$Types.getRawType(r10)
            boolean r10 = r10.isAssignableFrom(r5)
            if (r10 == 0) goto L4e
            int r9 = r9 + 1
            goto L3d
        L4e:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Type argument "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = " does not satisfy bounds for type variable "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r1 = " declared by "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r11 = r0.append(r11)
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L77:
            int r3 = r3 + 1
            goto L25
        L7a:
            com.google.gson.reflect.TypeToken r0 = new com.google.gson.reflect.TypeToken
            r1 = 0
            java.lang.reflect.ParameterizedType r11 = com.google.gson.internal.C$Gson$Types.newParameterizedTypeWithOwner(r1, r11, r12)
            r0.<init>(r11)
            return r0
        L85:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "Raw type "
            r12.<init>(r1)
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r0 = " is not supported because it requires specifying an owner type"
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        La4:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r0 = " requires "
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.StringBuilder r12 = r12.append(r2)
            java.lang.String r0 = " type arguments, but got "
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.StringBuilder r12 = r12.append(r3)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        Lcf:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "rawType must be of type Class, but was "
            r0.<init>(r1)
            java.lang.StringBuilder r11 = r0.append(r11)
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    private java.lang.reflect.Type getTypeTokenTypeArgument() {
            r3 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            java.lang.Class<com.google.gson.reflect.TypeToken> r2 = com.google.gson.reflect.TypeToken.class
            if (r1 == 0) goto L2b
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r1 = r0.getRawType()
            if (r1 != r2) goto L48
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.canonicalize(r0)
            boolean r1 = isCapturingTypeVariablesForbidden()
            if (r1 == 0) goto L2a
            verifyNoTypeVariable(r0)
        L2a:
            return r0
        L2b:
            if (r0 != r2) goto L48
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee "
            r1.<init>(r2)
            java.lang.String r2 = "type-token-raw"
            java.lang.String r2 = com.google.gson.internal.TroubleshootingGuide.createUrl(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L48:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must only create direct subclasses of TypeToken"
            r0.<init>(r1)
            throw r0
    }

    private static boolean isAssignableFrom(java.lang.reflect.Type r1, java.lang.reflect.GenericArrayType r2) {
            java.lang.reflect.Type r2 = r2.getGenericComponentType()
            boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L30
            boolean r0 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L13
            java.lang.reflect.GenericArrayType r1 = (java.lang.reflect.GenericArrayType) r1
            java.lang.reflect.Type r1 = r1.getGenericComponentType()
            goto L24
        L13:
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L24
            java.lang.Class r1 = (java.lang.Class) r1
        L19:
            boolean r0 = r1.isArray()
            if (r0 == 0) goto L24
            java.lang.Class r1 = r1.getComponentType()
            goto L19
        L24:
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r1 = isAssignableFrom(r1, r2, r0)
            return r1
        L30:
            r1 = 1
            return r1
    }

    private static boolean isAssignableFrom(java.lang.reflect.Type r9, java.lang.reflect.ParameterizedType r10, java.util.Map<java.lang.String, java.lang.reflect.Type> r11) {
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            boolean r1 = r10.equals(r9)
            r2 = 1
            if (r1 == 0) goto Lc
            return r2
        Lc:
            java.lang.Class r1 = com.google.gson.internal.C$Gson$Types.getRawType(r9)
            boolean r3 = r9 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L17
            java.lang.reflect.ParameterizedType r9 = (java.lang.reflect.ParameterizedType) r9
            goto L18
        L17:
            r9 = 0
        L18:
            if (r9 == 0) goto L4c
            java.lang.reflect.Type[] r3 = r9.getActualTypeArguments()
            java.lang.reflect.TypeVariable[] r4 = r1.getTypeParameters()
            r5 = r0
        L23:
            int r6 = r3.length
            if (r5 >= r6) goto L45
            r6 = r3[r5]
            r7 = r4[r5]
        L2a:
            boolean r8 = r6 instanceof java.lang.reflect.TypeVariable
            if (r8 == 0) goto L3b
            java.lang.reflect.TypeVariable r6 = (java.lang.reflect.TypeVariable) r6
            java.lang.String r6 = r6.getName()
            java.lang.Object r6 = r11.get(r6)
            java.lang.reflect.Type r6 = (java.lang.reflect.Type) r6
            goto L2a
        L3b:
            java.lang.String r7 = r7.getName()
            r11.put(r7, r6)
            int r5 = r5 + 1
            goto L23
        L45:
            boolean r9 = typeEquals(r9, r10, r11)
            if (r9 == 0) goto L4c
            return r2
        L4c:
            java.lang.reflect.Type[] r9 = r1.getGenericInterfaces()
            int r3 = r9.length
        L51:
            if (r0 >= r3) goto L64
            r4 = r9[r0]
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>(r11)
            boolean r4 = isAssignableFrom(r4, r10, r5)
            if (r4 == 0) goto L61
            return r2
        L61:
            int r0 = r0 + 1
            goto L51
        L64:
            java.lang.reflect.Type r9 = r1.getGenericSuperclass()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r11)
            boolean r9 = isAssignableFrom(r9, r10, r0)
            return r9
    }

    private static boolean isCapturingTypeVariablesForbidden() {
            java.lang.String r0 = "gson.allowCapturingTypeVariables"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "true"
            boolean r0 = java.util.Objects.equals(r0, r1)
            r0 = r0 ^ 1
            return r0
    }

    private static boolean matches(java.lang.reflect.Type r1, java.lang.reflect.Type r2, java.util.Map<java.lang.String, java.lang.reflect.Type> r3) {
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L1d
            boolean r0 = r1 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L1b
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.String r1 = r1.getName()
            java.lang.Object r1 = r3.get(r1)
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1b
            goto L1d
        L1b:
            r1 = 0
            goto L1e
        L1d:
            r1 = 1
        L1e:
            return r1
    }

    private static boolean typeEquals(java.lang.reflect.ParameterizedType r4, java.lang.reflect.ParameterizedType r5, java.util.Map<java.lang.String, java.lang.reflect.Type> r6) {
            java.lang.reflect.Type r0 = r4.getRawType()
            java.lang.reflect.Type r1 = r5.getRawType()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L2b
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            r0 = r1
        L18:
            int r2 = r4.length
            if (r0 >= r2) goto L29
            r2 = r4[r0]
            r3 = r5[r0]
            boolean r2 = matches(r2, r3, r6)
            if (r2 != 0) goto L26
            return r1
        L26:
            int r0 = r0 + 1
            goto L18
        L29:
            r4 = 1
            return r4
        L2b:
            return r1
    }

    private static void verifyNoTypeVariable(java.lang.reflect.Type r5) {
            boolean r0 = r5 instanceof java.lang.reflect.TypeVariable
            if (r0 != 0) goto L61
            boolean r0 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L12
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            verifyNoTypeVariable(r5)
            goto L58
        L12:
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            r1 = 0
            if (r0 == 0) goto L31
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r0 = r5.getOwnerType()
            if (r0 == 0) goto L22
            verifyNoTypeVariable(r0)
        L22:
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            int r0 = r5.length
        L27:
            if (r1 >= r0) goto L58
            r2 = r5[r1]
            verifyNoTypeVariable(r2)
            int r1 = r1 + 1
            goto L27
        L31:
            boolean r0 = r5 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L56
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r0 = r5.getLowerBounds()
            int r2 = r0.length
            r3 = r1
        L3d:
            if (r3 >= r2) goto L47
            r4 = r0[r3]
            verifyNoTypeVariable(r4)
            int r3 = r3 + 1
            goto L3d
        L47:
            java.lang.reflect.Type[] r5 = r5.getUpperBounds()
            int r0 = r5.length
        L4c:
            if (r1 >= r0) goto L58
            r2 = r5[r1]
            verifyNoTypeVariable(r2)
            int r1 = r1 + 1
            goto L4c
        L56:
            if (r5 == 0) goto L59
        L58:
            return
        L59:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "TypeToken captured `null` as type argument; probably a compiler / runtime bug"
            r5.<init>(r0)
            throw r5
        L61:
            java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "TypeToken type argument must not contain a type variable; captured type variable "
            r1.<init>(r2)
            java.lang.String r2 = r5.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " declared by "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.reflect.GenericDeclaration r5 = r5.getGenericDeclaration()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = "\nSee "
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r1 = "typetoken-type-variable"
            java.lang.String r1 = com.google.gson.internal.TroubleshootingGuide.createUrl(r1)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.gson.reflect.TypeToken
            if (r0 == 0) goto L12
            java.lang.reflect.Type r0 = r1.type
            com.google.gson.reflect.TypeToken r2 = (com.google.gson.reflect.TypeToken) r2
            java.lang.reflect.Type r2 = r2.type
            boolean r2 = com.google.gson.internal.C$Gson$Types.equals(r0, r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public final java.lang.Class<? super T> getRawType() {
            r1 = this;
            java.lang.Class<? super T> r0 = r1.rawType
            return r0
    }

    public final java.lang.reflect.Type getType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.hashCode
            return r0
    }

    @java.lang.Deprecated
    public boolean isAssignableFrom(com.google.gson.reflect.TypeToken<?> r1) {
            r0 = this;
            java.lang.reflect.Type r1 = r1.getType()
            boolean r1 = r0.isAssignableFrom(r1)
            return r1
    }

    @java.lang.Deprecated
    public boolean isAssignableFrom(java.lang.Class<?> r1) {
            r0 = this;
            boolean r1 = r0.isAssignableFrom(r1)
            return r1
    }

    @java.lang.Deprecated
    public boolean isAssignableFrom(java.lang.reflect.Type r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.reflect.Type r1 = r4.type
            boolean r1 = r1.equals(r5)
            r2 = 1
            if (r1 == 0) goto Le
            return r2
        Le:
            java.lang.reflect.Type r1 = r4.type
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L1f
            java.lang.Class<? super T> r0 = r4.rawType
            java.lang.Class r5 = com.google.gson.internal.C$Gson$Types.getRawType(r5)
            boolean r5 = r0.isAssignableFrom(r5)
            return r5
        L1f:
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L2f
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r5 = isAssignableFrom(r5, r1, r0)
            return r5
        L2f:
            boolean r3 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r3 == 0) goto L4b
            java.lang.Class<? super T> r1 = r4.rawType
            java.lang.Class r3 = com.google.gson.internal.C$Gson$Types.getRawType(r5)
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L4a
            java.lang.reflect.Type r1 = r4.type
            java.lang.reflect.GenericArrayType r1 = (java.lang.reflect.GenericArrayType) r1
            boolean r5 = isAssignableFrom(r5, r1)
            if (r5 == 0) goto L4a
            r0 = r2
        L4a:
            return r0
        L4b:
            r5 = 3
            java.lang.Class[] r5 = new java.lang.Class[r5]
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            r5[r0] = r3
            java.lang.Class<java.lang.reflect.ParameterizedType> r0 = java.lang.reflect.ParameterizedType.class
            r5[r2] = r0
            r0 = 2
            java.lang.Class<java.lang.reflect.GenericArrayType> r2 = java.lang.reflect.GenericArrayType.class
            r5[r0] = r2
            java.lang.IllegalArgumentException r5 = buildUnsupportedTypeException(r1, r5)
            throw r5
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            java.lang.String r0 = com.google.gson.internal.C$Gson$Types.typeToString(r0)
            return r0
    }
}
