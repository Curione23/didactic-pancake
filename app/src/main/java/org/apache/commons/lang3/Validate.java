package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class Validate {
    private static final java.lang.String DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE = "The value %s is not in the specified exclusive range of %s to %s";
    private static final java.lang.String DEFAULT_FINITE_EX_MESSAGE = "The value is invalid: %f";
    private static final java.lang.String DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE = "The value %s is not in the specified inclusive range of %s to %s";
    private static final java.lang.String DEFAULT_IS_ASSIGNABLE_EX_MESSAGE = "Cannot assign a %s to a %s";
    private static final java.lang.String DEFAULT_IS_INSTANCE_OF_EX_MESSAGE = "Expected type: %s, actual: %s";
    private static final java.lang.String DEFAULT_IS_NULL_EX_MESSAGE = "The validated object is null";
    private static final java.lang.String DEFAULT_IS_TRUE_EX_MESSAGE = "The validated expression is false";
    private static final java.lang.String DEFAULT_MATCHES_PATTERN_EX = "The string %s does not match the pattern %s";
    private static final java.lang.String DEFAULT_NOT_BLANK_EX_MESSAGE = "The validated character sequence is blank";
    private static final java.lang.String DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE = "The validated array is empty";
    private static final java.lang.String DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE = "The validated character sequence is empty";
    private static final java.lang.String DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE = "The validated collection is empty";
    private static final java.lang.String DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE = "The validated map is empty";
    private static final java.lang.String DEFAULT_NOT_NAN_EX_MESSAGE = "The validated value is not a number";
    private static final java.lang.String DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE = "The validated array contains null element at index: %d";
    private static final java.lang.String DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE = "The validated collection contains null element at index: %d";
    private static final java.lang.String DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE = "The validated array index is invalid: %d";
    private static final java.lang.String DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE = "The validated character sequence index is invalid: %d";
    private static final java.lang.String DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE = "The validated collection index is invalid: %d";
    private static final java.lang.String DEFAULT_VALID_STATE_EX_MESSAGE = "The validated state is false";

    public Validate() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void exclusiveBetween(double r1, double r3, double r5) {
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L9
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Double r2 = java.lang.Double.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1, r2}
            java.lang.String r2 = "The value %s is not in the specified exclusive range of %s to %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    public static void exclusiveBetween(double r0, double r2, double r4, java.lang.String r6) {
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L9
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
    }

    public static void exclusiveBetween(long r1, long r3, long r5) {
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L9
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1, r2}
            java.lang.String r2 = "The value %s is not in the specified exclusive range of %s to %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    public static void exclusiveBetween(long r0, long r2, long r4, java.lang.String r6) {
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L9
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
    }

    public static <T> void exclusiveBetween(T r2, T r3, java.lang.Comparable<T> r4) {
            int r0 = r4.compareTo(r2)
            if (r0 <= 0) goto Ld
            int r0 = r4.compareTo(r3)
            if (r0 >= 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The value %s is not in the specified exclusive range of %s to %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2, r3}
            java.lang.String r2 = java.lang.String.format(r1, r2)
            r0.<init>(r2)
            throw r0
    }

    public static <T> void exclusiveBetween(T r0, T r1, java.lang.Comparable<T> r2, java.lang.String r3, java.lang.Object... r4) {
            int r0 = r2.compareTo(r0)
            if (r0 <= 0) goto Ld
            int r0 = r2.compareTo(r1)
            if (r0 >= 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = getMessage(r3, r4)
            r0.<init>(r1)
            throw r0
    }

    public static void finite(double r2) {
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "The value is invalid: %f"
            finite(r2, r1, r0)
            return
    }

    public static void finite(double r1, java.lang.String r3, java.lang.Object... r4) {
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 != 0) goto Ld
            boolean r1 = java.lang.Double.isInfinite(r1)
            if (r1 != 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = getMessage(r3, r4)
            r1.<init>(r2)
            throw r1
    }

    private static java.lang.String getMessage(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = org.apache.commons.lang3.ArrayUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            goto Lb
        L7:
            java.lang.String r1 = java.lang.String.format(r1, r2)
        Lb:
            return r1
    }

    public static void inclusiveBetween(double r1, double r3, double r5) {
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L9
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Double r2 = java.lang.Double.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1, r2}
            java.lang.String r2 = "The value %s is not in the specified inclusive range of %s to %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    public static void inclusiveBetween(double r0, double r2, double r4, java.lang.String r6) {
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L9
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
    }

    public static void inclusiveBetween(long r1, long r3, long r5) {
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L9
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1, r2}
            java.lang.String r2 = "The value %s is not in the specified inclusive range of %s to %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    public static void inclusiveBetween(long r0, long r2, long r4, java.lang.String r6) {
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L9
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L9
            return
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
    }

    public static <T> void inclusiveBetween(T r2, T r3, java.lang.Comparable<T> r4) {
            int r0 = r4.compareTo(r2)
            if (r0 < 0) goto Ld
            int r0 = r4.compareTo(r3)
            if (r0 > 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The value %s is not in the specified inclusive range of %s to %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2, r3}
            java.lang.String r2 = java.lang.String.format(r1, r2)
            r0.<init>(r2)
            throw r0
    }

    public static <T> void inclusiveBetween(T r0, T r1, java.lang.Comparable<T> r2, java.lang.String r3, java.lang.Object... r4) {
            int r0 = r2.compareTo(r0)
            if (r0 < 0) goto Ld
            int r0 = r2.compareTo(r1)
            if (r0 > 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = getMessage(r3, r4)
            r0.<init>(r1)
            throw r0
    }

    public static void isAssignableFrom(java.lang.Class<?> r2, java.lang.Class<?> r3) {
            if (r3 == 0) goto Lb
            if (r2 == 0) goto Lb
            boolean r0 = r2.isAssignableFrom(r3)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "null type"
            java.lang.String r3 = org.apache.commons.lang3.ClassUtils.getName(r3, r1)
            java.lang.String r2 = org.apache.commons.lang3.ClassUtils.getName(r2, r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "Cannot assign a %s to a %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
    }

    public static void isAssignableFrom(java.lang.Class<?> r0, java.lang.Class<?> r1, java.lang.String r2, java.lang.Object... r3) {
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = getMessage(r2, r3)
            r0.<init>(r1)
            throw r0
    }

    public static void isInstanceOf(java.lang.Class<?> r2, java.lang.Object r3) {
            boolean r0 = r2.isInstance(r3)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.getName()
            java.lang.String r1 = "null"
            java.lang.String r3 = org.apache.commons.lang3.ClassUtils.getName(r3, r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "Expected type: %s, actual: %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
    }

    public static void isInstanceOf(java.lang.Class<?> r0, java.lang.Object r1, java.lang.String r2, java.lang.Object... r3) {
            boolean r0 = r0.isInstance(r1)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = getMessage(r2, r3)
            r0.<init>(r1)
            throw r0
    }

    public static void isTrue(boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The validated expression is false"
            r1.<init>(r0)
            throw r1
    }

    public static void isTrue(boolean r0, java.lang.String r1, double r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    public static void isTrue(boolean r0, java.lang.String r1, long r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    public static void isTrue(boolean r0, java.lang.String r1, java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = getMessage(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    static /* synthetic */ java.lang.String lambda$toSupplier$0(java.lang.String r0, java.lang.Object[] r1) {
            java.lang.String r0 = getMessage(r0, r1)
            return r0
    }

    public static void matchesPattern(java.lang.CharSequence r2, java.lang.String r3) {
            boolean r0 = java.util.regex.Pattern.matches(r3, r2)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The string %s does not match the pattern %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r2 = java.lang.String.format(r1, r2)
            r0.<init>(r2)
            throw r0
    }

    public static void matchesPattern(java.lang.CharSequence r0, java.lang.String r1, java.lang.String r2, java.lang.Object... r3) {
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = getMessage(r2, r3)
            r0.<init>(r1)
            throw r0
    }

    public static <T extends java.lang.Iterable<?>> T noNullElements(T r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "The validated collection contains null element at index: %d"
            java.lang.Iterable r2 = noNullElements(r2, r1, r0)
            return r2
    }

    public static <T extends java.lang.Iterable<?>> T noNullElements(T r3, java.lang.String r4, java.lang.Object... r5) {
            java.lang.String r0 = "iterable"
            java.util.Objects.requireNonNull(r3, r0)
            java.util.Iterator r0 = r3.iterator()
            r1 = 0
        La:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r0.next()
            if (r2 == 0) goto L19
            int r1 = r1 + 1
            goto La
        L19:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object[] r3 = org.apache.commons.lang3.ArrayUtils.addAll(r5, r3)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r3 = getMessage(r4, r3)
            r5.<init>(r3)
            throw r5
        L2f:
            return r3
    }

    public static <T> T[] noNullElements(T[] r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "The validated array contains null element at index: %d"
            java.lang.Object[] r2 = noNullElements(r2, r1, r0)
            return r2
    }

    public static <T> T[] noNullElements(T[] r2, java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r0 = "array"
            java.util.Objects.requireNonNull(r2, r0)
            r0 = 0
        L6:
            int r1 = r2.length
            if (r0 >= r1) goto L22
            r1 = r2[r0]
            if (r1 == 0) goto L10
            int r0 = r0 + 1
            goto L6
        L10:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = org.apache.commons.lang3.ArrayUtils.add(r4, r2)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r2 = getMessage(r3, r2)
            r4.<init>(r2)
            throw r4
        L22:
            return r2
    }

    public static <T extends java.lang.CharSequence> T notBlank(T r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "The validated character sequence is blank"
            java.lang.CharSequence r2 = notBlank(r2, r1, r0)
            return r2
    }

    public static <T extends java.lang.CharSequence> T notBlank(T r1, java.lang.String r2, java.lang.Object... r3) {
            java.util.function.Supplier r0 = toSupplier(r2, r3)
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = org.apache.commons.lang3.StringUtils.isBlank(r1)
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = getMessage(r2, r3)
            r1.<init>(r2)
            throw r1
    }

    public static <T extends java.lang.CharSequence> T notEmpty(T r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "The validated character sequence is empty"
            java.lang.CharSequence r2 = notEmpty(r2, r1, r0)
            return r2
    }

    public static <T extends java.lang.CharSequence> T notEmpty(T r1, java.lang.String r2, java.lang.Object... r3) {
            java.util.function.Supplier r0 = toSupplier(r2, r3)
            java.util.Objects.requireNonNull(r1, r0)
            int r0 = r1.length()
            if (r0 == 0) goto Le
            return r1
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = getMessage(r2, r3)
            r1.<init>(r2)
            throw r1
    }

    public static <T extends java.util.Collection<?>> T notEmpty(T r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "The validated collection is empty"
            java.util.Collection r2 = notEmpty(r2, r1, r0)
            return r2
    }

    public static <T extends java.util.Collection<?>> T notEmpty(T r1, java.lang.String r2, java.lang.Object... r3) {
            java.util.function.Supplier r0 = toSupplier(r2, r3)
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = getMessage(r2, r3)
            r1.<init>(r2)
            throw r1
    }

    public static <T extends java.util.Map<?, ?>> T notEmpty(T r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "The validated map is empty"
            java.util.Map r2 = notEmpty(r2, r1, r0)
            return r2
    }

    public static <T extends java.util.Map<?, ?>> T notEmpty(T r1, java.lang.String r2, java.lang.Object... r3) {
            java.util.function.Supplier r0 = toSupplier(r2, r3)
            java.util.Objects.requireNonNull(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = getMessage(r2, r3)
            r1.<init>(r2)
            throw r1
    }

    public static <T> T[] notEmpty(T[] r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "The validated array is empty"
            java.lang.Object[] r2 = notEmpty(r2, r1, r0)
            return r2
    }

    public static <T> T[] notEmpty(T[] r1, java.lang.String r2, java.lang.Object... r3) {
            java.util.function.Supplier r0 = toSupplier(r2, r3)
            java.util.Objects.requireNonNull(r1, r0)
            int r0 = r1.length
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = getMessage(r2, r3)
            r1.<init>(r2)
            throw r1
    }

    public static void notNaN(double r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "The validated value is not a number"
            notNaN(r2, r1, r0)
            return
    }

    public static void notNaN(double r0, java.lang.String r2, java.lang.Object... r3) {
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = getMessage(r2, r3)
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public static <T> T notNull(T r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "The validated object is null"
            java.lang.Object r2 = notNull(r2, r1, r0)
            return r2
    }

    public static <T> T notNull(T r0, java.lang.String r1, java.lang.Object... r2) {
            java.util.function.Supplier r1 = toSupplier(r1, r2)
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0, r1)
            return r0
    }

    private static java.util.function.Supplier<java.lang.String> toSupplier(java.lang.String r1, java.lang.Object... r2) {
            org.apache.commons.lang3.Validate$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.Validate$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }

    public static <T extends java.lang.CharSequence> T validIndex(T r2, int r3) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "The validated character sequence index is invalid: %d"
            java.lang.CharSequence r2 = validIndex(r2, r3, r1, r0)
            return r2
    }

    public static <T extends java.lang.CharSequence> T validIndex(T r1, int r2, java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r0 = "chars"
            java.util.Objects.requireNonNull(r1, r0)
            if (r2 < 0) goto Le
            int r0 = r1.length()
            if (r2 >= r0) goto Le
            return r1
        Le:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = getMessage(r3, r4)
            r1.<init>(r2)
            throw r1
    }

    public static <T extends java.util.Collection<?>> T validIndex(T r2, int r3) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "The validated collection index is invalid: %d"
            java.util.Collection r2 = validIndex(r2, r3, r1, r0)
            return r2
    }

    public static <T extends java.util.Collection<?>> T validIndex(T r1, int r2, java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r0 = "collection"
            java.util.Objects.requireNonNull(r1, r0)
            if (r2 < 0) goto Le
            int r0 = r1.size()
            if (r2 >= r0) goto Le
            return r1
        Le:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = getMessage(r3, r4)
            r1.<init>(r2)
            throw r1
    }

    public static <T> T[] validIndex(T[] r2, int r3) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "The validated array index is invalid: %d"
            java.lang.Object[] r2 = validIndex(r2, r3, r1, r0)
            return r2
    }

    public static <T> T[] validIndex(T[] r1, int r2, java.lang.String r3, java.lang.Object... r4) {
            java.lang.String r0 = "array"
            java.util.Objects.requireNonNull(r1, r0)
            if (r2 < 0) goto Lb
            int r0 = r1.length
            if (r2 >= r0) goto Lb
            return r1
        Lb:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = getMessage(r3, r4)
            r1.<init>(r2)
            throw r1
    }

    public static void validState(boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "The validated state is false"
            r1.<init>(r0)
            throw r1
    }

    public static void validState(boolean r0, java.lang.String r1, java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = getMessage(r1, r2)
            r0.<init>(r1)
            throw r0
    }
}
