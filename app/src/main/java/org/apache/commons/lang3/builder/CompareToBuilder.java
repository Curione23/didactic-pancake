package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes2.dex */
public class CompareToBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.Integer> {
    private int comparison;

    public CompareToBuilder() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.comparison = r0
            return
    }

    private void appendArray(java.lang.Object r2, java.lang.Object r3, java.util.Comparator<?> r4) {
            r1 = this;
            boolean r0 = r2 instanceof long[]
            if (r0 == 0) goto Lc
            long[] r2 = (long[]) r2
            long[] r3 = (long[]) r3
            r1.append(r2, r3)
            goto L67
        Lc:
            boolean r0 = r2 instanceof int[]
            if (r0 == 0) goto L18
            int[] r2 = (int[]) r2
            int[] r3 = (int[]) r3
            r1.append(r2, r3)
            goto L67
        L18:
            boolean r0 = r2 instanceof short[]
            if (r0 == 0) goto L24
            short[] r2 = (short[]) r2
            short[] r3 = (short[]) r3
            r1.append(r2, r3)
            goto L67
        L24:
            boolean r0 = r2 instanceof char[]
            if (r0 == 0) goto L30
            char[] r2 = (char[]) r2
            char[] r3 = (char[]) r3
            r1.append(r2, r3)
            goto L67
        L30:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L3c
            byte[] r2 = (byte[]) r2
            byte[] r3 = (byte[]) r3
            r1.append(r2, r3)
            goto L67
        L3c:
            boolean r0 = r2 instanceof double[]
            if (r0 == 0) goto L48
            double[] r2 = (double[]) r2
            double[] r3 = (double[]) r3
            r1.append(r2, r3)
            goto L67
        L48:
            boolean r0 = r2 instanceof float[]
            if (r0 == 0) goto L54
            float[] r2 = (float[]) r2
            float[] r3 = (float[]) r3
            r1.append(r2, r3)
            goto L67
        L54:
            boolean r0 = r2 instanceof boolean[]
            if (r0 == 0) goto L60
            boolean[] r2 = (boolean[]) r2
            boolean[] r3 = (boolean[]) r3
            r1.append(r2, r3)
            goto L67
        L60:
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r1.append(r2, r3, r4)
        L67:
            return
    }

    private static void reflectionAppend(java.lang.Object r4, java.lang.Object r5, java.lang.Class<?> r6, org.apache.commons.lang3.builder.CompareToBuilder r7, boolean r8, java.lang.String[] r9) {
            java.lang.reflect.Field[] r6 = r6.getDeclaredFields()
            r0 = 1
            java.lang.reflect.AccessibleObject.setAccessible(r6, r0)
            r0 = 0
        L9:
            int r1 = r6.length
            if (r0 >= r1) goto L4c
            int r1 = r7.comparison
            if (r1 != 0) goto L4c
            r1 = r6[r0]
            java.lang.String r2 = r1.getName()
            boolean r2 = org.apache.commons.lang3.ArrayUtils.contains(r9, r2)
            if (r2 != 0) goto L49
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "$"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L49
            if (r8 != 0) goto L34
            int r2 = r1.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isTransient(r2)
            if (r2 != 0) goto L49
        L34:
            int r2 = r1.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 != 0) goto L49
            java.lang.Object r2 = org.apache.commons.lang3.builder.Reflection.getUnchecked(r1, r4)
            java.lang.Object r1 = org.apache.commons.lang3.builder.Reflection.getUnchecked(r1, r5)
            r7.append(r2, r1)
        L49:
            int r0 = r0 + 1
            goto L9
        L4c:
            return
    }

    public static int reflectionCompare(java.lang.Object r3, java.lang.Object r4) {
            r0 = 0
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]
            int r3 = reflectionCompare(r3, r4, r1, r0, r2)
            return r3
    }

    public static int reflectionCompare(java.lang.Object r0, java.lang.Object r1, java.util.Collection<java.lang.String> r2) {
            java.lang.String[] r2 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(r2)
            int r0 = reflectionCompare(r0, r1, r2)
            return r0
    }

    public static int reflectionCompare(java.lang.Object r2, java.lang.Object r3, boolean r4) {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            int r2 = reflectionCompare(r2, r3, r4, r1, r0)
            return r2
    }

    public static int reflectionCompare(java.lang.Object r9, java.lang.Object r10, boolean r11, java.lang.Class<?> r12, java.lang.String... r13) {
            if (r9 != r10) goto L4
            r9 = 0
            return r9
        L4:
            java.lang.String r0 = "lhs"
            java.util.Objects.requireNonNull(r9, r0)
            java.lang.String r0 = "rhs"
            java.util.Objects.requireNonNull(r10, r0)
            java.lang.Class r0 = r9.getClass()
            boolean r1 = r0.isInstance(r10)
            if (r1 == 0) goto L41
            org.apache.commons.lang3.builder.CompareToBuilder r8 = new org.apache.commons.lang3.builder.CompareToBuilder
            r8.<init>()
            r1 = r9
            r2 = r10
            r3 = r0
            r4 = r8
            r5 = r11
            r6 = r13
            reflectionAppend(r1, r2, r3, r4, r5, r6)
        L26:
            java.lang.Class r1 = r0.getSuperclass()
            if (r1 == 0) goto L3c
            if (r0 == r12) goto L3c
            java.lang.Class r0 = r0.getSuperclass()
            r2 = r9
            r3 = r10
            r4 = r0
            r5 = r8
            r6 = r11
            r7 = r13
            reflectionAppend(r2, r3, r4, r5, r6, r7)
            goto L26
        L3c:
            int r9 = r8.toComparison()
            return r9
        L41:
            java.lang.ClassCastException r9 = new java.lang.ClassCastException
            r9.<init>()
            throw r9
    }

    public static int reflectionCompare(java.lang.Object r2, java.lang.Object r3, java.lang.String... r4) {
            r0 = 0
            r1 = 0
            int r2 = reflectionCompare(r2, r3, r0, r1, r4)
            return r2
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(byte r2, byte r3) {
            r1 = this;
            int r0 = r1.comparison
            if (r0 == 0) goto L5
            return r1
        L5:
            int r2 = java.lang.Byte.compare(r2, r3)
            r1.comparison = r2
            return r1
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(char r2, char r3) {
            r1 = this;
            int r0 = r1.comparison
            if (r0 == 0) goto L5
            return r1
        L5:
            int r2 = java.lang.Character.compare(r2, r3)
            r1.comparison = r2
            return r1
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(double r2, double r4) {
            r1 = this;
            int r0 = r1.comparison
            if (r0 == 0) goto L5
            return r1
        L5:
            int r2 = java.lang.Double.compare(r2, r4)
            r1.comparison = r2
            return r1
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(float r2, float r3) {
            r1 = this;
            int r0 = r1.comparison
            if (r0 == 0) goto L5
            return r1
        L5:
            int r2 = java.lang.Float.compare(r2, r3)
            r1.comparison = r2
            return r1
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(int r2, int r3) {
            r1 = this;
            int r0 = r1.comparison
            if (r0 == 0) goto L5
            return r1
        L5:
            int r2 = java.lang.Integer.compare(r2, r3)
            r1.comparison = r2
            return r1
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(long r2, long r4) {
            r1 = this;
            int r0 = r1.comparison
            if (r0 == 0) goto L5
            return r1
        L5:
            int r2 = java.lang.Long.compare(r2, r4)
            r1.comparison = r2
            return r1
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            org.apache.commons.lang3.builder.CompareToBuilder r2 = r1.append(r2, r3, r0)
            return r2
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(java.lang.Object r2, java.lang.Object r3, java.util.Comparator<?> r4) {
            r1 = this;
            int r0 = r1.comparison
            if (r0 == 0) goto L5
            return r1
        L5:
            if (r2 != r3) goto L8
            return r1
        L8:
            if (r2 != 0) goto Le
            r2 = -1
            r1.comparison = r2
            return r1
        Le:
            if (r3 != 0) goto L14
            r2 = 1
            r1.comparison = r2
            return r1
        L14:
            boolean r0 = org.apache.commons.lang3.ObjectUtils.isArray(r2)
            if (r0 == 0) goto L1e
            r1.appendArray(r2, r3, r4)
            goto L2f
        L1e:
            if (r4 != 0) goto L29
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r2.compareTo(r3)
            r1.comparison = r2
            goto L2f
        L29:
            int r2 = r4.compare(r2, r3)
            r1.comparison = r2
        L2f:
            return r1
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(short r2, short r3) {
            r1 = this;
            int r0 = r1.comparison
            if (r0 == 0) goto L5
            return r1
        L5:
            int r2 = java.lang.Short.compare(r2, r3)
            r1.comparison = r2
            return r1
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(boolean r2, boolean r3) {
            r1 = this;
            int r0 = r1.comparison
            if (r0 == 0) goto L5
            return r1
        L5:
            if (r2 != r3) goto L8
            return r1
        L8:
            if (r2 == 0) goto Le
            r2 = 1
            r1.comparison = r2
            goto L11
        Le:
            r2 = -1
            r1.comparison = r2
        L11:
            return r1
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(byte[] r5, byte[] r6) {
            r4 = this;
            int r0 = r4.comparison
            if (r0 == 0) goto L5
            return r4
        L5:
            if (r5 != r6) goto L8
            return r4
        L8:
            r0 = -1
            if (r5 != 0) goto Le
            r4.comparison = r0
            return r4
        Le:
            r1 = 1
            if (r6 != 0) goto L14
            r4.comparison = r1
            return r4
        L14:
            int r2 = r5.length
            int r3 = r6.length
            if (r2 == r3) goto L21
            int r5 = r5.length
            int r6 = r6.length
            if (r5 >= r6) goto L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            r4.comparison = r0
            return r4
        L21:
            r0 = 0
        L22:
            int r1 = r5.length
            if (r0 >= r1) goto L33
            int r1 = r4.comparison
            if (r1 != 0) goto L33
            r1 = r5[r0]
            r2 = r6[r0]
            r4.append(r1, r2)
            int r0 = r0 + 1
            goto L22
        L33:
            return r4
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(char[] r5, char[] r6) {
            r4 = this;
            int r0 = r4.comparison
            if (r0 == 0) goto L5
            return r4
        L5:
            if (r5 != r6) goto L8
            return r4
        L8:
            r0 = -1
            if (r5 != 0) goto Le
            r4.comparison = r0
            return r4
        Le:
            r1 = 1
            if (r6 != 0) goto L14
            r4.comparison = r1
            return r4
        L14:
            int r2 = r5.length
            int r3 = r6.length
            if (r2 == r3) goto L21
            int r5 = r5.length
            int r6 = r6.length
            if (r5 >= r6) goto L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            r4.comparison = r0
            return r4
        L21:
            r0 = 0
        L22:
            int r1 = r5.length
            if (r0 >= r1) goto L33
            int r1 = r4.comparison
            if (r1 != 0) goto L33
            char r1 = r5[r0]
            char r2 = r6[r0]
            r4.append(r1, r2)
            int r0 = r0 + 1
            goto L22
        L33:
            return r4
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(double[] r6, double[] r7) {
            r5 = this;
            int r0 = r5.comparison
            if (r0 == 0) goto L5
            return r5
        L5:
            if (r6 != r7) goto L8
            return r5
        L8:
            r0 = -1
            if (r6 != 0) goto Le
            r5.comparison = r0
            return r5
        Le:
            r1 = 1
            if (r7 != 0) goto L14
            r5.comparison = r1
            return r5
        L14:
            int r2 = r6.length
            int r3 = r7.length
            if (r2 == r3) goto L21
            int r6 = r6.length
            int r7 = r7.length
            if (r6 >= r7) goto L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            r5.comparison = r0
            return r5
        L21:
            r0 = 0
        L22:
            int r1 = r6.length
            if (r0 >= r1) goto L33
            int r1 = r5.comparison
            if (r1 != 0) goto L33
            r1 = r6[r0]
            r3 = r7[r0]
            r5.append(r1, r3)
            int r0 = r0 + 1
            goto L22
        L33:
            return r5
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(float[] r5, float[] r6) {
            r4 = this;
            int r0 = r4.comparison
            if (r0 == 0) goto L5
            return r4
        L5:
            if (r5 != r6) goto L8
            return r4
        L8:
            r0 = -1
            if (r5 != 0) goto Le
            r4.comparison = r0
            return r4
        Le:
            r1 = 1
            if (r6 != 0) goto L14
            r4.comparison = r1
            return r4
        L14:
            int r2 = r5.length
            int r3 = r6.length
            if (r2 == r3) goto L21
            int r5 = r5.length
            int r6 = r6.length
            if (r5 >= r6) goto L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            r4.comparison = r0
            return r4
        L21:
            r0 = 0
        L22:
            int r1 = r5.length
            if (r0 >= r1) goto L33
            int r1 = r4.comparison
            if (r1 != 0) goto L33
            r1 = r5[r0]
            r2 = r6[r0]
            r4.append(r1, r2)
            int r0 = r0 + 1
            goto L22
        L33:
            return r4
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(int[] r5, int[] r6) {
            r4 = this;
            int r0 = r4.comparison
            if (r0 == 0) goto L5
            return r4
        L5:
            if (r5 != r6) goto L8
            return r4
        L8:
            r0 = -1
            if (r5 != 0) goto Le
            r4.comparison = r0
            return r4
        Le:
            r1 = 1
            if (r6 != 0) goto L14
            r4.comparison = r1
            return r4
        L14:
            int r2 = r5.length
            int r3 = r6.length
            if (r2 == r3) goto L21
            int r5 = r5.length
            int r6 = r6.length
            if (r5 >= r6) goto L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            r4.comparison = r0
            return r4
        L21:
            r0 = 0
        L22:
            int r1 = r5.length
            if (r0 >= r1) goto L33
            int r1 = r4.comparison
            if (r1 != 0) goto L33
            r1 = r5[r0]
            r2 = r6[r0]
            r4.append(r1, r2)
            int r0 = r0 + 1
            goto L22
        L33:
            return r4
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(long[] r6, long[] r7) {
            r5 = this;
            int r0 = r5.comparison
            if (r0 == 0) goto L5
            return r5
        L5:
            if (r6 != r7) goto L8
            return r5
        L8:
            r0 = -1
            if (r6 != 0) goto Le
            r5.comparison = r0
            return r5
        Le:
            r1 = 1
            if (r7 != 0) goto L14
            r5.comparison = r1
            return r5
        L14:
            int r2 = r6.length
            int r3 = r7.length
            if (r2 == r3) goto L21
            int r6 = r6.length
            int r7 = r7.length
            if (r6 >= r7) goto L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            r5.comparison = r0
            return r5
        L21:
            r0 = 0
        L22:
            int r1 = r6.length
            if (r0 >= r1) goto L33
            int r1 = r5.comparison
            if (r1 != 0) goto L33
            r1 = r6[r0]
            r3 = r7[r0]
            r5.append(r1, r3)
            int r0 = r0 + 1
            goto L22
        L33:
            return r5
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(java.lang.Object[] r2, java.lang.Object[] r3) {
            r1 = this;
            r0 = 0
            org.apache.commons.lang3.builder.CompareToBuilder r2 = r1.append(r2, r3, r0)
            return r2
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(java.lang.Object[] r5, java.lang.Object[] r6, java.util.Comparator<?> r7) {
            r4 = this;
            int r0 = r4.comparison
            if (r0 == 0) goto L5
            return r4
        L5:
            if (r5 != r6) goto L8
            return r4
        L8:
            r0 = -1
            if (r5 != 0) goto Le
            r4.comparison = r0
            return r4
        Le:
            r1 = 1
            if (r6 != 0) goto L14
            r4.comparison = r1
            return r4
        L14:
            int r2 = r5.length
            int r3 = r6.length
            if (r2 == r3) goto L21
            int r5 = r5.length
            int r6 = r6.length
            if (r5 >= r6) goto L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            r4.comparison = r0
            return r4
        L21:
            r0 = 0
        L22:
            int r1 = r5.length
            if (r0 >= r1) goto L33
            int r1 = r4.comparison
            if (r1 != 0) goto L33
            r1 = r5[r0]
            r2 = r6[r0]
            r4.append(r1, r2, r7)
            int r0 = r0 + 1
            goto L22
        L33:
            return r4
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(short[] r5, short[] r6) {
            r4 = this;
            int r0 = r4.comparison
            if (r0 == 0) goto L5
            return r4
        L5:
            if (r5 != r6) goto L8
            return r4
        L8:
            r0 = -1
            if (r5 != 0) goto Le
            r4.comparison = r0
            return r4
        Le:
            r1 = 1
            if (r6 != 0) goto L14
            r4.comparison = r1
            return r4
        L14:
            int r2 = r5.length
            int r3 = r6.length
            if (r2 == r3) goto L21
            int r5 = r5.length
            int r6 = r6.length
            if (r5 >= r6) goto L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            r4.comparison = r0
            return r4
        L21:
            r0 = 0
        L22:
            int r1 = r5.length
            if (r0 >= r1) goto L33
            int r1 = r4.comparison
            if (r1 != 0) goto L33
            short r1 = r5[r0]
            short r2 = r6[r0]
            r4.append(r1, r2)
            int r0 = r0 + 1
            goto L22
        L33:
            return r4
    }

    public org.apache.commons.lang3.builder.CompareToBuilder append(boolean[] r5, boolean[] r6) {
            r4 = this;
            int r0 = r4.comparison
            if (r0 == 0) goto L5
            return r4
        L5:
            if (r5 != r6) goto L8
            return r4
        L8:
            r0 = -1
            if (r5 != 0) goto Le
            r4.comparison = r0
            return r4
        Le:
            r1 = 1
            if (r6 != 0) goto L14
            r4.comparison = r1
            return r4
        L14:
            int r2 = r5.length
            int r3 = r6.length
            if (r2 == r3) goto L21
            int r5 = r5.length
            int r6 = r6.length
            if (r5 >= r6) goto L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            r4.comparison = r0
            return r4
        L21:
            r0 = 0
        L22:
            int r1 = r5.length
            if (r0 >= r1) goto L33
            int r1 = r4.comparison
            if (r1 != 0) goto L33
            boolean r1 = r5[r0]
            boolean r2 = r6[r0]
            r4.append(r1, r2)
            int r0 = r0 + 1
            goto L22
        L33:
            return r4
    }

    public org.apache.commons.lang3.builder.CompareToBuilder appendSuper(int r2) {
            r1 = this;
            int r0 = r1.comparison
            if (r0 == 0) goto L5
            return r1
        L5:
            r1.comparison = r2
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.lang3.builder.Builder
    public java.lang.Integer build() {
            r1 = this;
            int r0 = r1.toComparison()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // org.apache.commons.lang3.builder.Builder
    public /* bridge */ /* synthetic */ java.lang.Integer build() {
            r1 = this;
            java.lang.Integer r0 = r1.build()
            return r0
    }

    public int toComparison() {
            r1 = this;
            int r0 = r1.comparison
            return r0
    }
}
