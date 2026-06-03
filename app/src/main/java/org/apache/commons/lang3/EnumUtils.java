package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class EnumUtils {
    private static final java.lang.String CANNOT_STORE_S_S_VALUES_IN_S_BITS = "Cannot store %s %s values in %s bits";
    private static final java.lang.String ENUM_CLASS_MUST_BE_DEFINED = "EnumClass must be defined.";
    private static final java.lang.String NULL_ELEMENTS_NOT_PERMITTED = "null elements not permitted";
    private static final java.lang.String S_DOES_NOT_SEEM_TO_BE_AN_ENUM_TYPE = "%s does not seem to be an Enum type";

    public static /* synthetic */ java.lang.String $r8$lambda$9acruJBYBH7BiqWr1IfysXXSSsw(java.lang.Enum r0) {
            java.lang.String r0 = r0.name()
            return r0
    }

    @java.lang.Deprecated
    public EnumUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static <E extends java.lang.Enum<E>> java.lang.Class<E> asEnum(java.lang.Class<E> r3) {
            java.lang.String r0 = "EnumClass must be defined."
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = r3.isEnum()
            java.lang.String r1 = "%s does not seem to be an Enum type"
            java.lang.Object[] r2 = new java.lang.Object[]{r3}
            org.apache.commons.lang3.Validate.isTrue(r0, r1, r2)
            return r3
    }

    private static <E extends java.lang.Enum<E>> java.lang.Class<E> checkBitVectorable(java.lang.Class<E> r4) {
            java.lang.Class r0 = asEnum(r4)
            java.lang.Object[] r0 = r0.getEnumConstants()
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            int r1 = r0.length
            r2 = 64
            if (r1 > r2) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = r4.getSimpleName()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3, r2}
            java.lang.String r2 = "Cannot store %s %s values in %s bits"
            org.apache.commons.lang3.Validate.isTrue(r1, r2, r0)
            return r4
    }

    public static <E extends java.lang.Enum<E>> long generateBitVector(java.lang.Class<E> r4, java.lang.Iterable<? extends E> r5) {
            checkBitVectorable(r4)
            java.lang.String r4 = "values"
            java.util.Objects.requireNonNull(r5, r4)
            java.util.Iterator r4 = r5.iterator()
            r0 = 0
        Le:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L28
            java.lang.Object r5 = r4.next()
            java.lang.Enum r5 = (java.lang.Enum) r5
            java.lang.String r2 = "null elements not permitted"
            java.util.Objects.requireNonNull(r5, r2)
            r2 = 1
            int r5 = r5.ordinal()
            long r2 = r2 << r5
            long r0 = r0 | r2
            goto Le
        L28:
            return r0
    }

    @java.lang.SafeVarargs
    public static <E extends java.lang.Enum<E>> long generateBitVector(java.lang.Class<E> r0, E... r1) {
            org.apache.commons.lang3.Validate.noNullElements(r1)
            java.util.List r1 = java.util.Arrays.asList(r1)
            long r0 = generateBitVector(r0, r1)
            return r0
    }

    public static <E extends java.lang.Enum<E>> long[] generateBitVectors(java.lang.Class<E> r6, java.lang.Iterable<? extends E> r7) {
            asEnum(r6)
            java.lang.String r0 = "values"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r6)
            org.apache.commons.lang3.EnumUtils$$ExternalSyntheticLambda3 r1 = new org.apache.commons.lang3.EnumUtils$$ExternalSyntheticLambda3
            r1.<init>(r0)
            r7.forEach(r1)
            java.lang.Object[] r6 = r6.getEnumConstants()
            java.lang.Enum[] r6 = (java.lang.Enum[]) r6
            int r6 = r6.length
            int r6 = r6 + (-1)
            int r6 = r6 / 64
            int r6 = r6 + 1
            long[] r6 = new long[r6]
            java.util.Iterator r7 = r0.iterator()
        L27:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r7.next()
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r1 = r0.ordinal()
            int r1 = r1 / 64
            r2 = r6[r1]
            int r0 = r0.ordinal()
            int r0 = r0 % 64
            r4 = 1
            long r4 = r4 << r0
            long r2 = r2 | r4
            r6[r1] = r2
            goto L27
        L48:
            org.apache.commons.lang3.ArrayUtils.reverse(r6)
            return r6
    }

    @java.lang.SafeVarargs
    public static <E extends java.lang.Enum<E>> long[] generateBitVectors(java.lang.Class<E> r6, E... r7) {
            asEnum(r6)
            org.apache.commons.lang3.Validate.noNullElements(r7)
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r6)
            java.util.Collections.addAll(r0, r7)
            java.lang.Object[] r6 = r6.getEnumConstants()
            java.lang.Enum[] r6 = (java.lang.Enum[]) r6
            int r6 = r6.length
            int r6 = r6 + (-1)
            int r6 = r6 / 64
            int r6 = r6 + 1
            long[] r6 = new long[r6]
            java.util.Iterator r7 = r0.iterator()
        L20:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r7.next()
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r1 = r0.ordinal()
            int r1 = r1 / 64
            r2 = r6[r1]
            int r0 = r0.ordinal()
            int r0 = r0 % 64
            r4 = 1
            long r4 = r4 << r0
            long r2 = r2 | r4
            r6[r1] = r2
            goto L20
        L41:
            org.apache.commons.lang3.ArrayUtils.reverse(r6)
            return r6
    }

    public static <E extends java.lang.Enum<E>> E getEnum(java.lang.Class<E> r1, java.lang.String r2) {
            r0 = 0
            java.lang.Enum r1 = getEnum(r1, r2, r0)
            return r1
    }

    public static <E extends java.lang.Enum<E>> E getEnum(java.lang.Class<E> r0, java.lang.String r1, E r2) {
            if (r1 != 0) goto L3
            return r2
        L3:
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L8
            return r0
        L8:
            return r2
    }

    public static <E extends java.lang.Enum<E>> E getEnumIgnoreCase(java.lang.Class<E> r1, java.lang.String r2) {
            r0 = 0
            java.lang.Enum r1 = getEnumIgnoreCase(r1, r2, r0)
            return r1
    }

    public static <E extends java.lang.Enum<E>> E getEnumIgnoreCase(java.lang.Class<E> r1, java.lang.String r2, E r3) {
            org.apache.commons.lang3.EnumUtils$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.EnumUtils$$ExternalSyntheticLambda2
            r0.<init>()
            java.lang.Enum r1 = getFirstEnumIgnoreCase(r1, r2, r0, r3)
            return r1
    }

    public static <E extends java.lang.Enum<E>> java.util.List<E> getEnumList(java.lang.Class<E> r1) {
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.Object[] r1 = r1.getEnumConstants()
            java.lang.Enum[] r1 = (java.lang.Enum[]) r1
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            return r0
    }

    public static <E extends java.lang.Enum<E>> java.util.Map<java.lang.String, E> getEnumMap(java.lang.Class<E> r1) {
            org.apache.commons.lang3.EnumUtils$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.EnumUtils$$ExternalSyntheticLambda2
            r0.<init>()
            java.util.Map r1 = getEnumMap(r1, r0)
            return r1
    }

    public static <E extends java.lang.Enum<E>, K> java.util.Map<K, E> getEnumMap(java.lang.Class<E> r1, java.util.function.Function<E, K> r2) {
            java.lang.Object[] r1 = r1.getEnumConstants()
            java.lang.Enum[] r1 = (java.lang.Enum[]) r1
            java.util.stream.Stream r1 = java.util.stream.Stream.of(r1)
            java.util.Objects.requireNonNull(r2)
            org.apache.commons.lang3.EnumUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.EnumUtils$$ExternalSyntheticLambda0
            r0.<init>(r2)
            java.util.function.Function r2 = java.util.function.Function.identity()
            java.util.stream.Collector r2 = java.util.stream.Collectors.toMap(r0, r2)
            java.lang.Object r1 = r1.collect(r2)
            java.util.Map r1 = (java.util.Map) r1
            return r1
    }

    public static <E extends java.lang.Enum<E>> E getEnumSystemProperty(java.lang.Class<E> r0, java.lang.String r1, E r2) {
            if (r0 == 0) goto Ld
            if (r1 != 0) goto L5
            goto Ld
        L5:
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.Enum r2 = getEnum(r0, r1, r2)
        Ld:
            return r2
    }

    public static <E extends java.lang.Enum<E>> E getFirstEnumIgnoreCase(java.lang.Class<E> r1, java.lang.String r2, java.util.function.Function<E, java.lang.String> r3, E r4) {
            if (r2 == 0) goto L27
            boolean r0 = r1.isEnum()
            if (r0 != 0) goto L9
            goto L27
        L9:
            java.lang.Object[] r1 = r1.getEnumConstants()
            java.lang.Enum[] r1 = (java.lang.Enum[]) r1
            java.util.stream.Stream r1 = java.util.stream.Stream.of(r1)
            org.apache.commons.lang3.EnumUtils$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.EnumUtils$$ExternalSyntheticLambda1
            r0.<init>(r2, r3)
            java.util.stream.Stream r1 = r1.filter(r0)
            java.util.Optional r1 = r1.findFirst()
            java.lang.Object r1 = r1.orElse(r4)
            java.lang.Enum r1 = (java.lang.Enum) r1
            return r1
        L27:
            return r4
    }

    public static <E extends java.lang.Enum<E>> boolean isValidEnum(java.lang.Class<E> r0, java.lang.String r1) {
            java.lang.Enum r0 = getEnum(r0, r1)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static <E extends java.lang.Enum<E>> boolean isValidEnumIgnoreCase(java.lang.Class<E> r0, java.lang.String r1) {
            java.lang.Enum r0 = getEnumIgnoreCase(r0, r1)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    static /* synthetic */ void lambda$generateBitVectors$0(java.util.EnumSet r1, java.lang.Enum r2) {
            java.lang.String r0 = "null elements not permitted"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.lang.Enum r2 = (java.lang.Enum) r2
            r1.add(r2)
            return
    }

    static /* synthetic */ boolean lambda$getFirstEnumIgnoreCase$1(java.lang.String r0, java.util.function.Function r1, java.lang.Enum r2) {
            java.lang.Object r1 = r1.apply(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }

    public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> processBitVector(java.lang.Class<E> r2, long r3) {
            java.lang.Class r0 = checkBitVectorable(r2)
            r0.getEnumConstants()
            r0 = 1
            long[] r0 = new long[r0]
            r1 = 0
            r0[r1] = r3
            java.util.EnumSet r2 = processBitVectors(r2, r0)
            return r2
    }

    public static <E extends java.lang.Enum<E>> java.util.EnumSet<E> processBitVectors(java.lang.Class<E> r9, long... r10) {
            java.lang.Class r0 = asEnum(r9)
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
            java.lang.String r1 = "values"
            java.lang.Object r10 = java.util.Objects.requireNonNull(r10, r1)
            long[] r10 = (long[]) r10
            long[] r10 = org.apache.commons.lang3.ArrayUtils.clone(r10)
            org.apache.commons.lang3.ArrayUtils.reverse(r10)
            java.lang.Object[] r9 = r9.getEnumConstants()
            java.lang.Enum[] r9 = (java.lang.Enum[]) r9
            int r1 = r9.length
            r2 = 0
        L1f:
            if (r2 >= r1) goto L45
            r3 = r9[r2]
            int r4 = r3.ordinal()
            int r4 = r4 / 64
            int r5 = r10.length
            if (r4 >= r5) goto L42
            r4 = r10[r4]
            int r6 = r3.ordinal()
            int r6 = r6 % 64
            r7 = 1
            long r6 = r7 << r6
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L42
            r0.add(r3)
        L42:
            int r2 = r2 + 1
            goto L1f
        L45:
            return r0
    }
}
