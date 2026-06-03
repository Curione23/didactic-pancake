package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class ObjectUtils {
    private static final char AT_SIGN = '@';
    public static final org.apache.commons.lang3.ObjectUtils.Null NULL = null;

    public static class Null implements java.io.Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        Null() {
                r0 = this;
                r0.<init>()
                return
        }

        private java.lang.Object readResolve() {
                r1 = this;
                org.apache.commons.lang3.ObjectUtils$Null r0 = org.apache.commons.lang3.ObjectUtils.NULL
                return r0
        }
    }

    public static /* synthetic */ void $r8$lambda$8L4ghbkDgk35qjFKgsKoZPq2PBk(java.lang.Object r0, long r1, int r3) {
            r0.wait(r1, r3)
            return
    }

    public static /* synthetic */ boolean $r8$lambda$Fuy3YCEODlM1hTmufMfW0wnfWXs(java.lang.Object r0) {
            boolean r0 = java.util.Objects.nonNull(r0)
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$e0qfpZXSjs7T3eqaqVSaHkij-aw, reason: not valid java name */
    public static /* synthetic */ boolean m2658$r8$lambda$e0qfpZXSjs7T3eqaqVSaHkijaw(java.lang.Object r0) {
            boolean r0 = java.util.Objects.nonNull(r0)
            return r0
    }

    public static /* synthetic */ boolean $r8$lambda$kfJ0NXebJpmJwCQQlfQBTrsmXnA(java.lang.Object r0) {
            boolean r0 = java.util.Objects.isNull(r0)
            return r0
    }

    static {
            org.apache.commons.lang3.ObjectUtils$Null r0 = new org.apache.commons.lang3.ObjectUtils$Null
            r0.<init>()
            org.apache.commons.lang3.ObjectUtils.NULL = r0
            return
    }

    @java.lang.Deprecated
    public ObjectUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte CONST(byte r0) {
            return r0
    }

    public static char CONST(char r0) {
            return r0
    }

    public static double CONST(double r0) {
            return r0
    }

    public static float CONST(float r0) {
            return r0
    }

    public static int CONST(int r0) {
            return r0
    }

    public static long CONST(long r0) {
            return r0
    }

    public static <T> T CONST(T r0) {
            return r0
    }

    public static short CONST(short r0) {
            return r0
    }

    public static boolean CONST(boolean r0) {
            return r0
    }

    public static byte CONST_BYTE(int r3) {
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r3 < r0) goto La
            r0 = 127(0x7f, float:1.78E-43)
            if (r3 > r0) goto La
            byte r3 = (byte) r3
            return r3
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Supplied value must be a valid byte literal between -128 and 127: ["
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static short CONST_SHORT(int r3) {
            r0 = -32768(0xffffffffffff8000, float:NaN)
            if (r3 < r0) goto La
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r3 > r0) goto La
            short r3 = (short) r3
            return r3
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Supplied value must be a valid byte literal between -32768 and 32767: ["
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static boolean allNotNull(java.lang.Object... r1) {
            if (r1 == 0) goto L13
            java.util.stream.Stream r1 = java.util.stream.Stream.of(r1)
            org.apache.commons.lang3.ObjectUtils$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.ObjectUtils$$ExternalSyntheticLambda2
            r0.<init>()
            boolean r1 = r1.noneMatch(r0)
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    public static boolean allNull(java.lang.Object... r0) {
            boolean r0 = anyNotNull(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean anyNotNull(java.lang.Object... r0) {
            java.lang.Object r0 = firstNonNull(r0)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static boolean anyNull(java.lang.Object... r0) {
            boolean r0 = allNotNull(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static <T> T clone(T r4) {
            boolean r0 = r4 instanceof java.lang.Cloneable
            if (r0 == 0) goto L5e
            java.lang.Class r0 = r4.getClass()
            boolean r1 = isArray(r4)
            if (r1 == 0) goto L34
            java.lang.Class r0 = r0.getComponentType()
            boolean r1 = r0.isPrimitive()
            if (r1 == 0) goto L2d
            int r1 = java.lang.reflect.Array.getLength(r4)
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
        L20:
            int r2 = r1 + (-1)
            if (r1 <= 0) goto L43
            java.lang.Object r1 = java.lang.reflect.Array.get(r4, r2)
            java.lang.reflect.Array.set(r0, r2, r1)
            r1 = r2
            goto L20
        L2d:
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r0 = r4.clone()
            goto L43
        L34:
            java.lang.String r1 = "clone"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.ReflectiveOperationException -> L44
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.ReflectiveOperationException -> L44
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.ReflectiveOperationException -> L44
            java.lang.Object r0 = r1.invoke(r4, r2)     // Catch: java.lang.ReflectiveOperationException -> L44
        L43:
            return r0
        L44:
            r4 = move-exception
            org.apache.commons.lang3.exception.CloneFailedException r1 = new org.apache.commons.lang3.exception.CloneFailedException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Exception cloning Cloneable type "
            r2.<init>(r3)
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0, r4)
            throw r1
        L5e:
            r4 = 0
            return r4
    }

    public static <T> T cloneIfPossible(T r1) {
            java.lang.Object r0 = clone(r1)
            if (r0 != 0) goto L7
            goto L8
        L7:
            r1 = r0
        L8:
            return r1
    }

    public static <T extends java.lang.Comparable<? super T>> int compare(T r1, T r2) {
            r0 = 0
            int r1 = compare(r1, r2, r0)
            return r1
    }

    public static <T extends java.lang.Comparable<? super T>> int compare(T r2, T r3, boolean r4) {
            if (r2 != r3) goto L4
            r2 = 0
            return r2
        L4:
            r0 = 1
            r1 = -1
            if (r2 != 0) goto Ld
            if (r4 == 0) goto Lb
            goto Lc
        Lb:
            r0 = r1
        Lc:
            return r0
        Ld:
            if (r3 != 0) goto L13
            if (r4 == 0) goto L12
            r0 = r1
        L12:
            return r0
        L13:
            int r2 = r2.compareTo(r3)
            return r2
    }

    public static <T> T defaultIfNull(T r0, T r1) {
            if (r0 == 0) goto L3
            goto L4
        L3:
            r0 = r1
        L4:
            return r0
    }

    @java.lang.Deprecated
    public static boolean equals(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = java.util.Objects.equals(r0, r1)
            return r0
    }

    @java.lang.SafeVarargs
    public static <T> T firstNonNull(T... r1) {
            java.util.stream.Stream r1 = org.apache.commons.lang3.stream.Streams.of(r1)
            org.apache.commons.lang3.ObjectUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.ObjectUtils$$ExternalSyntheticLambda0
            r0.<init>()
            java.util.stream.Stream r1 = r1.filter(r0)
            java.util.Optional r1 = r1.findFirst()
            r0 = 0
            java.lang.Object r1 = r1.orElse(r0)
            return r1
    }

    public static <T> java.lang.Class<T> getClass(T r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.lang.Class r0 = r0.getClass()
        L8:
            return r0
    }

    @java.lang.SafeVarargs
    public static <T> T getFirstNonNull(java.util.function.Supplier<T>... r1) {
            java.util.stream.Stream r1 = org.apache.commons.lang3.stream.Streams.of(r1)
            org.apache.commons.lang3.ObjectUtils$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.ObjectUtils$$ExternalSyntheticLambda3
            r0.<init>()
            java.util.stream.Stream r1 = r1.filter(r0)
            org.apache.commons.lang3.ObjectUtils$$ExternalSyntheticLambda4 r0 = new org.apache.commons.lang3.ObjectUtils$$ExternalSyntheticLambda4
            r0.<init>()
            java.util.stream.Stream r1 = r1.map(r0)
            org.apache.commons.lang3.ObjectUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.ObjectUtils$$ExternalSyntheticLambda0
            r0.<init>()
            java.util.stream.Stream r1 = r1.filter(r0)
            java.util.Optional r1 = r1.findFirst()
            r0 = 0
            java.lang.Object r1 = r1.orElse(r0)
            return r1
    }

    public static <T> T getIfNull(T r0, java.util.function.Supplier<T> r1) {
            if (r0 == 0) goto L3
            goto L7
        L3:
            java.lang.Object r0 = org.apache.commons.lang3.function.Suppliers.get(r1)
        L7:
            return r0
    }

    @java.lang.Deprecated
    public static int hashCode(java.lang.Object r0) {
            int r0 = java.util.Objects.hashCode(r0)
            return r0
    }

    public static java.lang.String hashCodeHex(java.lang.Object r0) {
            int r0 = java.util.Objects.hashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    @java.lang.Deprecated
    public static int hashCodeMulti(java.lang.Object... r4) {
            r0 = 1
            if (r4 == 0) goto L13
            int r1 = r4.length
            r2 = 0
        L5:
            if (r2 >= r1) goto L13
            r3 = r4[r2]
            int r3 = java.util.Objects.hashCode(r3)
            int r0 = r0 * 31
            int r0 = r0 + r3
            int r2 = r2 + 1
            goto L5
        L13:
            return r0
    }

    public static java.lang.String identityHashCodeHex(java.lang.Object r0) {
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    public static java.lang.String identityToString(java.lang.Object r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = identityHashCodeHex(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0.length()
            int r2 = r2 + 1
            int r3 = r4.length()
            int r2 = r2 + r3
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            r2 = 64
            java.lang.StringBuilder r0 = r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    public static void identityToString(java.lang.Appendable r1, java.lang.Object r2) throws java.io.IOException {
            java.lang.String r0 = "object"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Appendable r1 = r1.append(r0)
            r0 = 64
            java.lang.Appendable r1 = r1.append(r0)
            java.lang.String r2 = identityHashCodeHex(r2)
            r1.append(r2)
            return
    }

    public static void identityToString(java.lang.StringBuffer r3, java.lang.Object r4) {
            java.lang.String r0 = "object"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = identityHashCodeHex(r4)
            int r1 = r3.length()
            int r2 = r0.length()
            int r1 = r1 + r2
            int r1 = r1 + 1
            int r2 = r4.length()
            int r1 = r1 + r2
            r3.ensureCapacity(r1)
            java.lang.StringBuffer r3 = r3.append(r0)
            r0 = 64
            java.lang.StringBuffer r3 = r3.append(r0)
            r3.append(r4)
            return
    }

    public static void identityToString(java.lang.StringBuilder r3, java.lang.Object r4) {
            java.lang.String r0 = "object"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = identityHashCodeHex(r4)
            int r1 = r3.length()
            int r2 = r0.length()
            int r1 = r1 + r2
            int r1 = r1 + 1
            int r2 = r4.length()
            int r1 = r1 + r2
            r3.ensureCapacity(r1)
            java.lang.StringBuilder r3 = r3.append(r0)
            r0 = 64
            java.lang.StringBuilder r3 = r3.append(r0)
            r3.append(r4)
            return
    }

    @java.lang.Deprecated
    public static void identityToString(org.apache.commons.lang3.text.StrBuilder r3, java.lang.Object r4) {
            java.lang.String r0 = "object"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = identityHashCodeHex(r4)
            int r1 = r3.length()
            int r2 = r0.length()
            int r1 = r1 + r2
            int r1 = r1 + 1
            int r2 = r4.length()
            int r1 = r1 + r2
            r3.ensureCapacity(r1)
            org.apache.commons.lang3.text.StrBuilder r3 = r3.append(r0)
            r0 = 64
            org.apache.commons.lang3.text.StrBuilder r3 = r3.append(r0)
            r3.append(r4)
            return
    }

    public static boolean isArray(java.lang.Object r0) {
            if (r0 == 0) goto Le
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static boolean isEmpty(java.lang.Object r3) {
            r0 = 1
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof java.lang.CharSequence
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 != 0) goto L12
            goto L13
        L12:
            r0 = r2
        L13:
            return r0
        L14:
            boolean r1 = isArray(r3)
            if (r1 == 0) goto L23
            int r3 = java.lang.reflect.Array.getLength(r3)
            if (r3 != 0) goto L21
            goto L22
        L21:
            r0 = r2
        L22:
            return r0
        L23:
            boolean r1 = r3 instanceof java.util.Collection
            if (r1 == 0) goto L2e
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            return r3
        L2e:
            boolean r1 = r3 instanceof java.util.Map
            if (r1 == 0) goto L39
            java.util.Map r3 = (java.util.Map) r3
            boolean r3 = r3.isEmpty()
            return r3
        L39:
            boolean r1 = r3 instanceof java.util.Optional
            if (r1 == 0) goto L45
            java.util.Optional r3 = (java.util.Optional) r3
            boolean r3 = r3.isPresent()
            r3 = r3 ^ r0
            return r3
        L45:
            return r2
    }

    public static boolean isNotEmpty(java.lang.Object r0) {
            boolean r0 = isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    @java.lang.SafeVarargs
    public static <T extends java.lang.Comparable<? super T>> T max(T... r6) {
            r0 = 0
            if (r6 == 0) goto L14
            int r1 = r6.length
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r1) goto L14
            r4 = r6[r3]
            int r5 = compare(r4, r0, r2)
            if (r5 <= 0) goto L11
            r0 = r4
        L11:
            int r3 = r3 + 1
            goto L6
        L14:
            return r0
    }

    @java.lang.SafeVarargs
    public static <T extends java.lang.Comparable<? super T>> T median(T... r1) {
            org.apache.commons.lang3.Validate.notEmpty(r1)
            org.apache.commons.lang3.Validate.noNullElements(r1)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            java.util.Collections.addAll(r0, r1)
            java.lang.Object[] r1 = r0.toArray()
            int r0 = r0.size()
            int r0 = r0 + (-1)
            int r0 = r0 / 2
            r1 = r1[r0]
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            return r1
    }

    @java.lang.SafeVarargs
    public static <T> T median(java.util.Comparator<T> r2, T... r3) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "null/empty items"
            org.apache.commons.lang3.Validate.notEmpty(r3, r1, r0)
            org.apache.commons.lang3.Validate.noNullElements(r3)
            java.lang.String r0 = "comparator"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>(r2)
            java.util.Collections.addAll(r0, r3)
            java.lang.Object[] r2 = r0.toArray()
            int r3 = r0.size()
            int r3 = r3 + (-1)
            int r3 = r3 / 2
            r2 = r2[r3]
            return r2
    }

    @java.lang.SafeVarargs
    public static <T extends java.lang.Comparable<? super T>> T min(T... r5) {
            r0 = 0
            if (r5 == 0) goto L14
            int r1 = r5.length
            r2 = 0
        L5:
            if (r2 >= r1) goto L14
            r3 = r5[r2]
            r4 = 1
            int r4 = compare(r3, r0, r4)
            if (r4 >= 0) goto L11
            r0 = r3
        L11:
            int r2 = r2 + 1
            goto L5
        L14:
            return r0
    }

    @java.lang.SafeVarargs
    public static <T> T mode(T... r8) {
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(r8)
            r1 = 0
            if (r0 == 0) goto L57
            java.util.HashMap r0 = new java.util.HashMap
            int r2 = r8.length
            r0.<init>(r2)
            int r2 = r8.length
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto L2c
            r5 = r8[r4]
            java.lang.Object r6 = r0.get(r5)
            org.apache.commons.lang3.mutable.MutableInt r6 = (org.apache.commons.lang3.mutable.MutableInt) r6
            if (r6 != 0) goto L26
            org.apache.commons.lang3.mutable.MutableInt r6 = new org.apache.commons.lang3.mutable.MutableInt
            r7 = 1
            r6.<init>(r7)
            r0.put(r5, r6)
            goto L29
        L26:
            r6.increment()
        L29:
            int r4 = r4 + 1
            goto L10
        L2c:
            java.util.Set r8 = r0.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L34:
            r0 = r1
        L35:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r8.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getValue()
            org.apache.commons.lang3.mutable.MutableInt r4 = (org.apache.commons.lang3.mutable.MutableInt) r4
            int r4 = r4.intValue()
            if (r4 != r3) goto L4e
            goto L34
        L4e:
            if (r4 <= r3) goto L35
            java.lang.Object r0 = r2.getKey()
            r3 = r4
            goto L35
        L56:
            return r0
        L57:
            return r1
    }

    public static boolean notEqual(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = java.util.Objects.equals(r0, r1)
            r0 = r0 ^ 1
            return r0
    }

    public static <T> T requireNonEmpty(T r1) {
            java.lang.String r0 = "object"
            java.lang.Object r1 = requireNonEmpty(r1, r0)
            return r1
    }

    public static <T> T requireNonEmpty(T r1, java.lang.String r2) {
            java.util.Objects.requireNonNull(r1, r2)
            boolean r0 = isEmpty(r1)
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r2)
            throw r1
    }

    @java.lang.Deprecated
    public static java.lang.String toString(java.lang.Object r1) {
            java.lang.String r0 = ""
            java.lang.String r1 = java.util.Objects.toString(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static java.lang.String toString(java.lang.Object r0, java.lang.String r1) {
            java.lang.String r0 = java.util.Objects.toString(r0, r1)
            return r0
    }

    public static <T> java.lang.String toString(T r0, java.util.function.Supplier<java.lang.String> r1) {
            if (r0 != 0) goto L9
            java.lang.Object r0 = org.apache.commons.lang3.function.Suppliers.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto Ld
        L9:
            java.lang.String r0 = r0.toString()
        Ld:
            return r0
    }

    public static java.lang.String toString(java.util.function.Supplier<java.lang.Object> r0, java.util.function.Supplier<java.lang.String> r1) {
            if (r0 != 0) goto L9
            java.lang.Object r0 = org.apache.commons.lang3.function.Suppliers.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L11
        L9:
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = toString(r0, r1)
        L11:
            return r0
    }

    public static void wait(java.lang.Object r1, java.time.Duration r2) throws java.lang.InterruptedException {
            java.util.Objects.requireNonNull(r1)
            org.apache.commons.lang3.ObjectUtils$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.ObjectUtils$$ExternalSyntheticLambda1
            r0.<init>(r1)
            java.time.Duration r1 = org.apache.commons.lang3.time.DurationUtils.zeroIfNull(r2)
            org.apache.commons.lang3.time.DurationUtils.accept(r0, r1)
            return
    }
}
