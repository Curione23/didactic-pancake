package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes2.dex */
public class DiffBuilder<T> implements org.apache.commons.lang3.builder.Builder<org.apache.commons.lang3.builder.DiffResult<T>> {
    static final java.lang.String TO_STRING_FORMAT = "%s differs from %s";
    private final java.util.List<org.apache.commons.lang3.builder.Diff<?>> diffs;
    private final boolean equals;
    private final T left;
    private final T right;
    private final org.apache.commons.lang3.builder.ToStringStyle style;
    private final java.lang.String toStringFormat;

    /* JADX INFO: renamed from: org.apache.commons.lang3.builder.DiffBuilder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder<T> {
        private T left;
        private T right;
        private org.apache.commons.lang3.builder.ToStringStyle style;
        private boolean testObjectsEquals;
        private java.lang.String toStringFormat;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.testObjectsEquals = r0
                java.lang.String r0 = "%s differs from %s"
                r1.toStringFormat = r0
                return
        }

        public org.apache.commons.lang3.builder.DiffBuilder<T> build() {
                r8 = this;
                org.apache.commons.lang3.builder.DiffBuilder r7 = new org.apache.commons.lang3.builder.DiffBuilder
                T r1 = r8.left
                T r2 = r8.right
                org.apache.commons.lang3.builder.ToStringStyle r3 = r8.style
                boolean r4 = r8.testObjectsEquals
                java.lang.String r5 = r8.toStringFormat
                r6 = 0
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        public org.apache.commons.lang3.builder.DiffBuilder.Builder<T> setLeft(T r1) {
                r0 = this;
                r0.left = r1
                return r0
        }

        public org.apache.commons.lang3.builder.DiffBuilder.Builder<T> setRight(T r1) {
                r0 = this;
                r0.right = r1
                return r0
        }

        public org.apache.commons.lang3.builder.DiffBuilder.Builder<T> setStyle(org.apache.commons.lang3.builder.ToStringStyle r1) {
                r0 = this;
                if (r1 == 0) goto L3
                goto L5
            L3:
                org.apache.commons.lang3.builder.ToStringStyle r1 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE
            L5:
                r0.style = r1
                return r0
        }

        public org.apache.commons.lang3.builder.DiffBuilder.Builder<T> setTestObjectsEquals(boolean r1) {
                r0 = this;
                r0.testObjectsEquals = r1
                return r0
        }

        public org.apache.commons.lang3.builder.DiffBuilder.Builder<T> setToStringFormat(java.lang.String r1) {
                r0 = this;
                if (r1 == 0) goto L3
                goto L5
            L3:
                java.lang.String r1 = "%s differs from %s"
            L5:
                r0.toStringFormat = r1
                return r0
        }
    }

    private static final class SDiff<T> extends org.apache.commons.lang3.builder.Diff<T> {
        private static final long serialVersionUID = 1;
        private final transient java.util.function.Supplier<T> leftSupplier;
        private final transient java.util.function.Supplier<T> rightSupplier;

        private SDiff(java.lang.String r1, java.util.function.Supplier<T> r2, java.util.function.Supplier<T> r3, java.lang.Class<T> r4) {
                r0 = this;
                r0.<init>(r1, r4)
                java.lang.Object r1 = java.util.Objects.requireNonNull(r2)
                java.util.function.Supplier r1 = (java.util.function.Supplier) r1
                r0.leftSupplier = r1
                java.lang.Object r1 = java.util.Objects.requireNonNull(r3)
                java.util.function.Supplier r1 = (java.util.function.Supplier) r1
                r0.rightSupplier = r1
                return
        }

        /* synthetic */ SDiff(java.lang.String r1, java.util.function.Supplier r2, java.util.function.Supplier r3, java.lang.Class r4, org.apache.commons.lang3.builder.DiffBuilder.AnonymousClass1 r5) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // org.apache.commons.lang3.tuple.Pair
        public T getLeft() {
                r1 = this;
                java.util.function.Supplier<T> r0 = r1.leftSupplier
                java.lang.Object r0 = r0.get()
                return r0
        }

        @Override // org.apache.commons.lang3.tuple.Pair
        public T getRight() {
                r1 = this;
                java.util.function.Supplier<T> r0 = r1.rightSupplier
                java.lang.Object r0 = r0.get()
                return r0
        }
    }

    @java.lang.Deprecated
    public DiffBuilder(T r2, T r3, org.apache.commons.lang3.builder.ToStringStyle r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    @java.lang.Deprecated
    public DiffBuilder(T r7, T r8, org.apache.commons.lang3.builder.ToStringStyle r9, boolean r10) {
            r6 = this;
            java.lang.String r5 = "%s differs from %s"
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private DiffBuilder(T r2, T r3, org.apache.commons.lang3.builder.ToStringStyle r4, boolean r5, java.lang.String r6) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "left"
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2, r0)
            r1.left = r0
            java.lang.String r0 = "right"
            java.lang.Object r0 = java.util.Objects.requireNonNull(r3, r0)
            r1.right = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.diffs = r0
            r1.toStringFormat = r6
            if (r4 == 0) goto L1f
            goto L21
        L1f:
            org.apache.commons.lang3.builder.ToStringStyle r4 = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE
        L21:
            r1.style = r4
            if (r5 == 0) goto L2d
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L2d
            r2 = 1
            goto L2e
        L2d:
            r2 = 0
        L2e:
            r1.equals = r2
            return
    }

    /* synthetic */ DiffBuilder(java.lang.Object r1, java.lang.Object r2, org.apache.commons.lang3.builder.ToStringStyle r3, boolean r4, java.lang.String r5, org.apache.commons.lang3.builder.DiffBuilder.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private <F> org.apache.commons.lang3.builder.DiffBuilder<T> add(java.lang.String r9, java.util.function.Supplier<F> r10, java.util.function.Supplier<F> r11, java.lang.Class<F> r12) {
            r8 = this;
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r0 = r8.diffs
            org.apache.commons.lang3.builder.DiffBuilder$SDiff r7 = new org.apache.commons.lang3.builder.DiffBuilder$SDiff
            r6 = 0
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.add(r7)
            return r8
    }

    public static <T> org.apache.commons.lang3.builder.DiffBuilder.Builder<T> builder() {
            org.apache.commons.lang3.builder.DiffBuilder$Builder r0 = new org.apache.commons.lang3.builder.DiffBuilder$Builder
            r0.<init>()
            return r0
    }

    static /* synthetic */ java.lang.Boolean lambda$append$0(boolean r0) {
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Boolean lambda$append$1(boolean r0) {
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Character[] lambda$append$10(char[] r0) {
            java.lang.Character[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Character[] lambda$append$11(char[] r0) {
            java.lang.Character[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$append$13(double r0) {
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$append$14(double r0) {
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Double[] lambda$append$15(double[] r0) {
            java.lang.Double[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Double[] lambda$append$16(double[] r0) {
            java.lang.Double[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Float lambda$append$17(float r0) {
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Float lambda$append$18(float r0) {
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Float[] lambda$append$19(float[] r0) {
            java.lang.Float[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Boolean[] lambda$append$2(boolean[] r0) {
            java.lang.Boolean[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Float[] lambda$append$20(float[] r0) {
            java.lang.Float[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Integer lambda$append$21(int r0) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Integer lambda$append$22(int r0) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Integer[] lambda$append$23(int[] r0) {
            java.lang.Integer[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Integer[] lambda$append$24(int[] r0) {
            java.lang.Integer[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Long lambda$append$25(long r0) {
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Long lambda$append$26(long r0) {
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Long[] lambda$append$27(long[] r0) {
            java.lang.Long[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Long[] lambda$append$28(long[] r0) {
            java.lang.Long[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$append$29(java.lang.Object r0) {
            return r0
    }

    static /* synthetic */ java.lang.Boolean[] lambda$append$3(boolean[] r0) {
            java.lang.Boolean[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$append$30(java.lang.Object r0) {
            return r0
    }

    static /* synthetic */ java.lang.Object[] lambda$append$31(java.lang.Object[] r0) {
            return r0
    }

    static /* synthetic */ java.lang.Object[] lambda$append$32(java.lang.Object[] r0) {
            return r0
    }

    static /* synthetic */ java.lang.Short lambda$append$33(short r0) {
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Short lambda$append$34(short r0) {
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Short[] lambda$append$35(short[] r0) {
            java.lang.Short[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Short[] lambda$append$36(short[] r0) {
            java.lang.Short[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Byte lambda$append$4(byte r0) {
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Byte lambda$append$5(byte r0) {
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Byte[] lambda$append$6(byte[] r0) {
            java.lang.Byte[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Byte[] lambda$append$7(byte[] r0) {
            java.lang.Byte[] r0 = org.apache.commons.lang3.ArrayUtils.toObject(r0)
            return r0
    }

    static /* synthetic */ java.lang.Character lambda$append$8(char r0) {
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Character lambda$append$9(char r0) {
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, byte r3, byte r4) {
            r1 = this;
            boolean r0 = r1.equals
            if (r0 != 0) goto L18
            if (r3 != r4) goto L7
            goto L18
        L7:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda15 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda15
            r0.<init>(r3)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda16 r3 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda16
            r3.<init>(r4)
            java.lang.Class<java.lang.Byte> r4 = java.lang.Byte.class
            org.apache.commons.lang3.builder.DiffBuilder r2 = r1.add(r2, r0, r3, r4)
            goto L19
        L18:
            r2 = r1
        L19:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, char r3, char r4) {
            r1 = this;
            boolean r0 = r1.equals
            if (r0 != 0) goto L18
            if (r3 != r4) goto L7
            goto L18
        L7:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda1
            r0.<init>(r3)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda2 r3 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda2
            r3.<init>(r4)
            java.lang.Class<java.lang.Character> r4 = java.lang.Character.class
            org.apache.commons.lang3.builder.DiffBuilder r2 = r1.add(r2, r0, r3, r4)
            goto L19
        L18:
            r2 = r1
        L19:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r5, double r6, double r8) {
            r4 = this;
            boolean r0 = r4.equals
            if (r0 != 0) goto L22
            long r0 = java.lang.Double.doubleToLongBits(r6)
            long r2 = java.lang.Double.doubleToLongBits(r8)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L11
            goto L22
        L11:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda31 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda31
            r0.<init>(r6)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda32 r6 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda32
            r6.<init>(r8)
            java.lang.Class<java.lang.Double> r7 = java.lang.Double.class
            org.apache.commons.lang3.builder.DiffBuilder r5 = r4.add(r5, r0, r6, r7)
            goto L23
        L22:
            r5 = r4
        L23:
            return r5
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r3, float r4, float r5) {
            r2 = this;
            boolean r0 = r2.equals
            if (r0 != 0) goto L20
            int r0 = java.lang.Float.floatToIntBits(r4)
            int r1 = java.lang.Float.floatToIntBits(r5)
            if (r0 != r1) goto Lf
            goto L20
        Lf:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda33 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda33
            r0.<init>(r4)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda34 r4 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda34
            r4.<init>(r5)
            java.lang.Class<java.lang.Float> r5 = java.lang.Float.class
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.add(r3, r0, r4, r5)
            goto L21
        L20:
            r3 = r2
        L21:
            return r3
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.equals
            if (r0 != 0) goto L18
            if (r3 != r4) goto L7
            goto L18
        L7:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda21 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda21
            r0.<init>(r3)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda23 r3 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda23
            r3.<init>(r4)
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            org.apache.commons.lang3.builder.DiffBuilder r2 = r1.add(r2, r0, r3, r4)
            goto L19
        L18:
            r2 = r1
        L19:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, long r3, long r5) {
            r1 = this;
            boolean r0 = r1.equals
            if (r0 != 0) goto L1a
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L9
            goto L1a
        L9:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda7 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda7
            r0.<init>(r3)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda8 r3 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda8
            r3.<init>(r5)
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            org.apache.commons.lang3.builder.DiffBuilder r2 = r1.add(r2, r0, r3, r4)
            goto L1b
        L1a:
            r2 = r1
        L1b:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            boolean r0 = r2.equals
            if (r0 != 0) goto L9d
            if (r4 != r5) goto L8
            goto L9d
        L8:
            if (r4 == 0) goto Lc
            r0 = r4
            goto Ld
        Lc:
            r0 = r5
        Ld:
            boolean r1 = org.apache.commons.lang3.ObjectUtils.isArray(r0)
            if (r1 == 0) goto L84
            boolean r1 = r0 instanceof boolean[]
            if (r1 == 0) goto L20
            boolean[] r4 = (boolean[]) r4
            boolean[] r5 = (boolean[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L20:
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto L2d
            byte[] r4 = (byte[]) r4
            byte[] r5 = (byte[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L2d:
            boolean r1 = r0 instanceof char[]
            if (r1 == 0) goto L3a
            char[] r4 = (char[]) r4
            char[] r5 = (char[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L3a:
            boolean r1 = r0 instanceof double[]
            if (r1 == 0) goto L47
            double[] r4 = (double[]) r4
            double[] r5 = (double[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L47:
            boolean r1 = r0 instanceof float[]
            if (r1 == 0) goto L54
            float[] r4 = (float[]) r4
            float[] r5 = (float[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L54:
            boolean r1 = r0 instanceof int[]
            if (r1 == 0) goto L61
            int[] r4 = (int[]) r4
            int[] r5 = (int[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L61:
            boolean r1 = r0 instanceof long[]
            if (r1 == 0) goto L6e
            long[] r4 = (long[]) r4
            long[] r5 = (long[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L6e:
            boolean r0 = r0 instanceof short[]
            if (r0 == 0) goto L7b
            short[] r4 = (short[]) r4
            short[] r5 = (short[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L7b:
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.append(r3, r4, r5)
            return r3
        L84:
            boolean r0 = java.util.Objects.equals(r4, r5)
            if (r0 == 0) goto L8c
            r3 = r2
            goto L9c
        L8c:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda19 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda19
            r0.<init>(r4)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda20 r4 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda20
            r4.<init>(r5)
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            org.apache.commons.lang3.builder.DiffBuilder r3 = r2.add(r3, r0, r4, r5)
        L9c:
            return r3
        L9d:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, org.apache.commons.lang3.builder.DiffResult<?> r3) {
            r1 = this;
            java.lang.String r0 = "diffResult"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = r1.equals
            if (r0 == 0) goto La
            return r1
        La:
            java.util.List r3 = r3.getDiffs()
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda14 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda14
            r0.<init>(r1, r2)
            r3.forEach(r0)
            return r1
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, short r3, short r4) {
            r1 = this;
            boolean r0 = r1.equals
            if (r0 != 0) goto L18
            if (r3 != r4) goto L7
            goto L18
        L7:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda35 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda35
            r0.<init>(r3)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda36 r3 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda36
            r3.<init>(r4)
            java.lang.Class<java.lang.Short> r4 = java.lang.Short.class
            org.apache.commons.lang3.builder.DiffBuilder r2 = r1.add(r2, r0, r3, r4)
            goto L19
        L18:
            r2 = r1
        L19:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, boolean r3, boolean r4) {
            r1 = this;
            boolean r0 = r1.equals
            if (r0 != 0) goto L18
            if (r3 != r4) goto L7
            goto L18
        L7:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda5 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda5
            r0.<init>(r3)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda6 r3 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda6
            r3.<init>(r4)
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            org.apache.commons.lang3.builder.DiffBuilder r2 = r1.add(r2, r0, r3, r4)
            goto L19
        L18:
            r2 = r1
        L19:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, byte[] r3, byte[] r4) {
            r1 = this;
            boolean r0 = r1.equals
            if (r0 != 0) goto L1c
            boolean r0 = java.util.Arrays.equals(r3, r4)
            if (r0 == 0) goto Lb
            goto L1c
        Lb:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda12 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda12
            r0.<init>(r3)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda13 r3 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda13
            r3.<init>(r4)
            java.lang.Class<java.lang.Byte[]> r4 = java.lang.Byte[].class
            org.apache.commons.lang3.builder.DiffBuilder r2 = r1.add(r2, r0, r3, r4)
            goto L1d
        L1c:
            r2 = r1
        L1d:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, char[] r3, char[] r4) {
            r1 = this;
            boolean r0 = r1.equals
            if (r0 != 0) goto L1c
            boolean r0 = java.util.Arrays.equals(r3, r4)
            if (r0 == 0) goto Lb
            goto L1c
        Lb:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda9 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda9
            r0.<init>(r3)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda10 r3 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda10
            r3.<init>(r4)
            java.lang.Class<java.lang.Character[]> r4 = java.lang.Character[].class
            org.apache.commons.lang3.builder.DiffBuilder r2 = r1.add(r2, r0, r3, r4)
            goto L1d
        L1c:
            r2 = r1
        L1d:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, double[] r3, double[] r4) {
            r1 = this;
            boolean r0 = r1.equals
            if (r0 != 0) goto L1c
            boolean r0 = java.util.Arrays.equals(r3, r4)
            if (r0 == 0) goto Lb
            goto L1c
        Lb:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda26 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda26
            r0.<init>(r3)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda27 r3 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda27
            r3.<init>(r4)
            java.lang.Class<java.lang.Double[]> r4 = java.lang.Double[].class
            org.apache.commons.lang3.builder.DiffBuilder r2 = r1.add(r2, r0, r3, r4)
            goto L1d
        L1c:
            r2 = r1
        L1d:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, float[] r3, float[] r4) {
            r1 = this;
            boolean r0 = r1.equals
            if (r0 != 0) goto L1c
            boolean r0 = java.util.Arrays.equals(r3, r4)
            if (r0 == 0) goto Lb
            goto L1c
        Lb:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda17 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda17
            r0.<init>(r3)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda18 r3 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda18
            r3.<init>(r4)
            java.lang.Class<java.lang.Float[]> r4 = java.lang.Float[].class
            org.apache.commons.lang3.builder.DiffBuilder r2 = r1.add(r2, r0, r3, r4)
            goto L1d
        L1c:
            r2 = r1
        L1d:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, int[] r3, int[] r4) {
            r1 = this;
            boolean r0 = r1.equals
            if (r0 != 0) goto L1c
            boolean r0 = java.util.Arrays.equals(r3, r4)
            if (r0 == 0) goto Lb
            goto L1c
        Lb:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda28 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda28
            r0.<init>(r3)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda29 r3 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda29
            r3.<init>(r4)
            java.lang.Class<java.lang.Integer[]> r4 = java.lang.Integer[].class
            org.apache.commons.lang3.builder.DiffBuilder r2 = r1.add(r2, r0, r3, r4)
            goto L1d
        L1c:
            r2 = r1
        L1d:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, long[] r3, long[] r4) {
            r1 = this;
            boolean r0 = r1.equals
            if (r0 != 0) goto L1c
            boolean r0 = java.util.Arrays.equals(r3, r4)
            if (r0 == 0) goto Lb
            goto L1c
        Lb:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda3 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda3
            r0.<init>(r3)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda4 r3 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda4
            r3.<init>(r4)
            java.lang.Class<java.lang.Long[]> r4 = java.lang.Long[].class
            org.apache.commons.lang3.builder.DiffBuilder r2 = r1.add(r2, r0, r3, r4)
            goto L1d
        L1c:
            r2 = r1
        L1d:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, java.lang.Object[] r3, java.lang.Object[] r4) {
            r1 = this;
            boolean r0 = r1.equals
            if (r0 != 0) goto L1c
            boolean r0 = java.util.Arrays.equals(r3, r4)
            if (r0 == 0) goto Lb
            goto L1c
        Lb:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda0
            r0.<init>(r3)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda11 r3 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda11
            r3.<init>(r4)
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            org.apache.commons.lang3.builder.DiffBuilder r2 = r1.add(r2, r0, r3, r4)
            goto L1d
        L1c:
            r2 = r1
        L1d:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, short[] r3, short[] r4) {
            r1 = this;
            boolean r0 = r1.equals
            if (r0 != 0) goto L1c
            boolean r0 = java.util.Arrays.equals(r3, r4)
            if (r0 == 0) goto Lb
            goto L1c
        Lb:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda22 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda22
            r0.<init>(r3)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda30 r3 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda30
            r3.<init>(r4)
            java.lang.Class<java.lang.Short[]> r4 = java.lang.Short[].class
            org.apache.commons.lang3.builder.DiffBuilder r2 = r1.add(r2, r0, r3, r4)
            goto L1d
        L1c:
            r2 = r1
        L1d:
            return r2
    }

    public org.apache.commons.lang3.builder.DiffBuilder<T> append(java.lang.String r2, boolean[] r3, boolean[] r4) {
            r1 = this;
            boolean r0 = r1.equals
            if (r0 != 0) goto L1c
            boolean r0 = java.util.Arrays.equals(r3, r4)
            if (r0 == 0) goto Lb
            goto L1c
        Lb:
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda24 r0 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda24
            r0.<init>(r3)
            org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda25 r3 = new org.apache.commons.lang3.builder.DiffBuilder$$ExternalSyntheticLambda25
            r3.<init>(r4)
            java.lang.Class<java.lang.Boolean[]> r4 = java.lang.Boolean[].class
            org.apache.commons.lang3.builder.DiffBuilder r2 = r1.add(r2, r0, r3, r4)
            goto L1d
        L1c:
            r2 = r1
        L1d:
            return r2
    }

    @Override // org.apache.commons.lang3.builder.Builder
    public /* bridge */ /* synthetic */ java.lang.Object build() {
            r1 = this;
            org.apache.commons.lang3.builder.DiffResult r0 = r1.build()
            return r0
    }

    @Override // org.apache.commons.lang3.builder.Builder
    public org.apache.commons.lang3.builder.DiffResult<T> build() {
            r7 = this;
            org.apache.commons.lang3.builder.DiffResult r6 = new org.apache.commons.lang3.builder.DiffResult
            T r1 = r7.left
            T r2 = r7.right
            java.util.List<org.apache.commons.lang3.builder.Diff<?>> r3 = r7.diffs
            org.apache.commons.lang3.builder.ToStringStyle r4 = r7.style
            java.lang.String r5 = r7.toStringFormat
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    T getLeft() {
            r1 = this;
            T r0 = r1.left
            return r0
    }

    T getRight() {
            r1 = this;
            T r0 = r1.right
            return r0
    }

    /* JADX INFO: renamed from: lambda$append$12$org-apache-commons-lang3-builder-DiffBuilder, reason: not valid java name */
    /* synthetic */ void m2662lambda$append$12$orgapachecommonslang3builderDiffBuilder(java.lang.String r2, org.apache.commons.lang3.builder.Diff r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = "."
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r0 = r3.getFieldName()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.Object r0 = r3.getLeft()
            java.lang.Object r3 = r3.getRight()
            r1.append(r2, r0, r3)
            return
    }
}
