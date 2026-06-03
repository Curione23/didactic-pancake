package org.apache.commons.lang3.builder;

/* JADX INFO: loaded from: classes2.dex */
public class EqualsBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.Boolean> {
    private static final java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>>> REGISTRY = null;
    private java.util.List<java.lang.Class<?>> bypassReflectionClasses;
    private java.lang.String[] excludeFields;
    private boolean isEquals;
    private java.lang.Class<?> reflectUpToClass;
    private boolean testRecursive;
    private boolean testTransients;

    public static /* synthetic */ java.util.HashSet $r8$lambda$9sNe9Z0ULfWboQeEjPzVPZGTMDM() {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            return r0
    }

    static {
            org.apache.commons.lang3.builder.EqualsBuilder$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.builder.EqualsBuilder$$ExternalSyntheticLambda0
            r0.<init>()
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            org.apache.commons.lang3.builder.EqualsBuilder.REGISTRY = r0
            return
    }

    public EqualsBuilder() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.isEquals = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2.bypassReflectionClasses = r1
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1.add(r0)
            return
    }

    private void appendArray(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Class r0 = r3.getClass()
            java.lang.Class r1 = r4.getClass()
            if (r0 == r1) goto L10
            r3 = 0
            r2.setEquals(r3)
            goto L77
        L10:
            boolean r0 = r3 instanceof long[]
            if (r0 == 0) goto L1c
            long[] r3 = (long[]) r3
            long[] r4 = (long[]) r4
            r2.append(r3, r4)
            goto L77
        L1c:
            boolean r0 = r3 instanceof int[]
            if (r0 == 0) goto L28
            int[] r3 = (int[]) r3
            int[] r4 = (int[]) r4
            r2.append(r3, r4)
            goto L77
        L28:
            boolean r0 = r3 instanceof short[]
            if (r0 == 0) goto L34
            short[] r3 = (short[]) r3
            short[] r4 = (short[]) r4
            r2.append(r3, r4)
            goto L77
        L34:
            boolean r0 = r3 instanceof char[]
            if (r0 == 0) goto L40
            char[] r3 = (char[]) r3
            char[] r4 = (char[]) r4
            r2.append(r3, r4)
            goto L77
        L40:
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L4c
            byte[] r3 = (byte[]) r3
            byte[] r4 = (byte[]) r4
            r2.append(r3, r4)
            goto L77
        L4c:
            boolean r0 = r3 instanceof double[]
            if (r0 == 0) goto L58
            double[] r3 = (double[]) r3
            double[] r4 = (double[]) r4
            r2.append(r3, r4)
            goto L77
        L58:
            boolean r0 = r3 instanceof float[]
            if (r0 == 0) goto L64
            float[] r3 = (float[]) r3
            float[] r4 = (float[]) r4
            r2.append(r3, r4)
            goto L77
        L64:
            boolean r0 = r3 instanceof boolean[]
            if (r0 == 0) goto L70
            boolean[] r3 = (boolean[]) r3
            boolean[] r4 = (boolean[]) r4
            r2.append(r3, r4)
            goto L77
        L70:
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r2.append(r3, r4)
        L77:
            return
    }

    static org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey> getRegisterPair(java.lang.Object r1, java.lang.Object r2) {
            org.apache.commons.lang3.builder.IDKey r0 = new org.apache.commons.lang3.builder.IDKey
            r0.<init>(r1)
            org.apache.commons.lang3.builder.IDKey r1 = new org.apache.commons.lang3.builder.IDKey
            r1.<init>(r2)
            org.apache.commons.lang3.tuple.Pair r1 = org.apache.commons.lang3.tuple.Pair.of(r0, r1)
            return r1
    }

    static java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>> getRegistry() {
            java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>>> r0 = org.apache.commons.lang3.builder.EqualsBuilder.REGISTRY
            java.lang.Object r0 = r0.get()
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    static boolean isRegistered(java.lang.Object r2, java.lang.Object r3) {
            java.util.Set r0 = getRegistry()
            org.apache.commons.lang3.tuple.Pair r2 = getRegisterPair(r2, r3)
            java.lang.Object r3 = r2.getRight()
            org.apache.commons.lang3.builder.IDKey r3 = (org.apache.commons.lang3.builder.IDKey) r3
            java.lang.Object r1 = r2.getLeft()
            org.apache.commons.lang3.builder.IDKey r1 = (org.apache.commons.lang3.builder.IDKey) r1
            org.apache.commons.lang3.tuple.Pair r3 = org.apache.commons.lang3.tuple.Pair.of(r3, r1)
            if (r0 == 0) goto L28
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L26
            boolean r2 = r0.contains(r3)
            if (r2 == 0) goto L28
        L26:
            r2 = 1
            goto L29
        L28:
            r2 = 0
        L29:
            return r2
    }

    private void reflectionAppend(java.lang.Object r5, java.lang.Object r6, java.lang.Class<?> r7) {
            r4 = this;
            boolean r0 = isRegistered(r5, r6)
            if (r0 == 0) goto L7
            return
        L7:
            register(r5, r6)     // Catch: java.lang.Throwable -> L66
            java.lang.reflect.Field[] r7 = r7.getDeclaredFields()     // Catch: java.lang.Throwable -> L66
            r0 = 1
            java.lang.reflect.AccessibleObject.setAccessible(r7, r0)     // Catch: java.lang.Throwable -> L66
            r0 = 0
        L13:
            int r1 = r7.length     // Catch: java.lang.Throwable -> L66
            if (r0 >= r1) goto L62
            boolean r1 = r4.isEquals     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L62
            r1 = r7[r0]     // Catch: java.lang.Throwable -> L66
            java.lang.String[] r2 = r4.excludeFields     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L66
            boolean r2 = org.apache.commons.lang3.ArrayUtils.contains(r2, r3)     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L5f
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = "$"
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L5f
            boolean r2 = r4.testTransients     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L42
            int r2 = r1.getModifiers()     // Catch: java.lang.Throwable -> L66
            boolean r2 = java.lang.reflect.Modifier.isTransient(r2)     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L5f
        L42:
            int r2 = r1.getModifiers()     // Catch: java.lang.Throwable -> L66
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L5f
            java.lang.Class<org.apache.commons.lang3.builder.EqualsExclude> r2 = org.apache.commons.lang3.builder.EqualsExclude.class
            boolean r2 = r1.isAnnotationPresent(r2)     // Catch: java.lang.Throwable -> L66
            if (r2 != 0) goto L5f
            java.lang.Object r2 = org.apache.commons.lang3.builder.Reflection.getUnchecked(r1, r5)     // Catch: java.lang.Throwable -> L66
            java.lang.Object r1 = org.apache.commons.lang3.builder.Reflection.getUnchecked(r1, r6)     // Catch: java.lang.Throwable -> L66
            r4.append(r2, r1)     // Catch: java.lang.Throwable -> L66
        L5f:
            int r0 = r0 + 1
            goto L13
        L62:
            unregister(r5, r6)
            return
        L66:
            r7 = move-exception
            unregister(r5, r6)
            throw r7
    }

    public static boolean reflectionEquals(java.lang.Object r0, java.lang.Object r1, java.util.Collection<java.lang.String> r2) {
            java.lang.String[] r2 = org.apache.commons.lang3.builder.ReflectionToStringBuilder.toNoNullStringArray(r2)
            boolean r0 = reflectionEquals(r0, r1, r2)
            return r0
    }

    public static boolean reflectionEquals(java.lang.Object r2, java.lang.Object r3, boolean r4) {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            boolean r2 = reflectionEquals(r2, r3, r4, r1, r0)
            return r2
    }

    public static boolean reflectionEquals(java.lang.Object r1, java.lang.Object r2, boolean r3, java.lang.Class<?> r4, boolean r5, java.lang.String... r6) {
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            if (r1 == 0) goto L27
            if (r2 != 0) goto L9
            goto L27
        L9:
            org.apache.commons.lang3.builder.EqualsBuilder r0 = new org.apache.commons.lang3.builder.EqualsBuilder
            r0.<init>()
            org.apache.commons.lang3.builder.EqualsBuilder r6 = r0.setExcludeFields(r6)
            org.apache.commons.lang3.builder.EqualsBuilder r4 = r6.setReflectUpToClass(r4)
            org.apache.commons.lang3.builder.EqualsBuilder r3 = r4.setTestTransients(r3)
            org.apache.commons.lang3.builder.EqualsBuilder r3 = r3.setTestRecursive(r5)
            org.apache.commons.lang3.builder.EqualsBuilder r1 = r3.reflectionAppend(r1, r2)
            boolean r1 = r1.isEquals()
            return r1
        L27:
            r1 = 0
            return r1
    }

    public static boolean reflectionEquals(java.lang.Object r6, java.lang.Object r7, boolean r8, java.lang.Class<?> r9, java.lang.String... r10) {
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            boolean r6 = reflectionEquals(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static boolean reflectionEquals(java.lang.Object r2, java.lang.Object r3, java.lang.String... r4) {
            r0 = 0
            r1 = 0
            boolean r2 = reflectionEquals(r2, r3, r0, r1, r4)
            return r2
    }

    private static void register(java.lang.Object r1, java.lang.Object r2) {
            java.util.Set r0 = getRegistry()
            org.apache.commons.lang3.tuple.Pair r1 = getRegisterPair(r1, r2)
            r0.add(r1)
            return
    }

    private static void unregister(java.lang.Object r1, java.lang.Object r2) {
            java.util.Set r0 = getRegistry()
            org.apache.commons.lang3.tuple.Pair r1 = getRegisterPair(r1, r2)
            r0.remove(r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L16
            java.lang.ThreadLocal<java.util.Set<org.apache.commons.lang3.tuple.Pair<org.apache.commons.lang3.builder.IDKey, org.apache.commons.lang3.builder.IDKey>>> r1 = org.apache.commons.lang3.builder.EqualsBuilder.REGISTRY
            r1.remove()
        L16:
            return
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(byte r2, byte r3) {
            r1 = this;
            boolean r0 = r1.isEquals
            if (r0 == 0) goto Lb
            if (r2 != r3) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            r1.isEquals = r2
        Lb:
            return r1
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(char r2, char r3) {
            r1 = this;
            boolean r0 = r1.isEquals
            if (r0 == 0) goto Lb
            if (r2 != r3) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            r1.isEquals = r2
        Lb:
            return r1
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(double r2, double r4) {
            r1 = this;
            boolean r0 = r1.isEquals
            if (r0 == 0) goto L11
            long r2 = java.lang.Double.doubleToLongBits(r2)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            org.apache.commons.lang3.builder.EqualsBuilder r2 = r1.append(r2, r4)
            return r2
        L11:
            return r1
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(float r2, float r3) {
            r1 = this;
            boolean r0 = r1.isEquals
            if (r0 == 0) goto L11
            int r2 = java.lang.Float.floatToIntBits(r2)
            int r3 = java.lang.Float.floatToIntBits(r3)
            org.apache.commons.lang3.builder.EqualsBuilder r2 = r1.append(r2, r3)
            return r2
        L11:
            return r1
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.isEquals
            if (r0 == 0) goto Lb
            if (r2 != r3) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            r1.isEquals = r2
        Lb:
            return r1
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(long r2, long r4) {
            r1 = this;
            boolean r0 = r1.isEquals
            if (r0 == 0) goto Ld
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            r1.isEquals = r2
        Ld:
            return r1
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            boolean r0 = r2.isEquals
            if (r0 != 0) goto L5
            return r2
        L5:
            if (r3 != r4) goto L8
            return r2
        L8:
            if (r3 == 0) goto L30
            if (r4 != 0) goto Ld
            goto L30
        Ld:
            java.lang.Class r0 = r3.getClass()
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L1b
            r2.appendArray(r3, r4)
            goto L2f
        L1b:
            boolean r1 = r2.testRecursive
            if (r1 == 0) goto L29
            boolean r0 = org.apache.commons.lang3.ClassUtils.isPrimitiveOrWrapper(r0)
            if (r0 != 0) goto L29
            r2.reflectionAppend(r3, r4)
            goto L2f
        L29:
            boolean r3 = r3.equals(r4)
            r2.isEquals = r3
        L2f:
            return r2
        L30:
            r3 = 0
            r2.setEquals(r3)
            return r2
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(short r2, short r3) {
            r1 = this;
            boolean r0 = r1.isEquals
            if (r0 == 0) goto Lb
            if (r2 != r3) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            r1.isEquals = r2
        Lb:
            return r1
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.isEquals
            if (r0 != 0) goto L5
            return r1
        L5:
            if (r2 != r3) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            r1.isEquals = r2
            return r1
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(byte[] r4, byte[] r5) {
            r3 = this;
            boolean r0 = r3.isEquals
            if (r0 != 0) goto L5
            return r3
        L5:
            if (r4 != r5) goto L8
            return r3
        L8:
            r0 = 0
            if (r4 == 0) goto L28
            if (r5 != 0) goto Le
            goto L28
        Le:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 == r2) goto L16
            r3.setEquals(r0)
            return r3
        L16:
            int r1 = r4.length
            if (r0 >= r1) goto L27
            boolean r1 = r3.isEquals
            if (r1 == 0) goto L27
            r1 = r4[r0]
            r2 = r5[r0]
            r3.append(r1, r2)
            int r0 = r0 + 1
            goto L16
        L27:
            return r3
        L28:
            r3.setEquals(r0)
            return r3
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(char[] r4, char[] r5) {
            r3 = this;
            boolean r0 = r3.isEquals
            if (r0 != 0) goto L5
            return r3
        L5:
            if (r4 != r5) goto L8
            return r3
        L8:
            r0 = 0
            if (r4 == 0) goto L28
            if (r5 != 0) goto Le
            goto L28
        Le:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 == r2) goto L16
            r3.setEquals(r0)
            return r3
        L16:
            int r1 = r4.length
            if (r0 >= r1) goto L27
            boolean r1 = r3.isEquals
            if (r1 == 0) goto L27
            char r1 = r4[r0]
            char r2 = r5[r0]
            r3.append(r1, r2)
            int r0 = r0 + 1
            goto L16
        L27:
            return r3
        L28:
            r3.setEquals(r0)
            return r3
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(double[] r6, double[] r7) {
            r5 = this;
            boolean r0 = r5.isEquals
            if (r0 != 0) goto L5
            return r5
        L5:
            if (r6 != r7) goto L8
            return r5
        L8:
            r0 = 0
            if (r6 == 0) goto L28
            if (r7 != 0) goto Le
            goto L28
        Le:
            int r1 = r6.length
            int r2 = r7.length
            if (r1 == r2) goto L16
            r5.setEquals(r0)
            return r5
        L16:
            int r1 = r6.length
            if (r0 >= r1) goto L27
            boolean r1 = r5.isEquals
            if (r1 == 0) goto L27
            r1 = r6[r0]
            r3 = r7[r0]
            r5.append(r1, r3)
            int r0 = r0 + 1
            goto L16
        L27:
            return r5
        L28:
            r5.setEquals(r0)
            return r5
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(float[] r4, float[] r5) {
            r3 = this;
            boolean r0 = r3.isEquals
            if (r0 != 0) goto L5
            return r3
        L5:
            if (r4 != r5) goto L8
            return r3
        L8:
            r0 = 0
            if (r4 == 0) goto L28
            if (r5 != 0) goto Le
            goto L28
        Le:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 == r2) goto L16
            r3.setEquals(r0)
            return r3
        L16:
            int r1 = r4.length
            if (r0 >= r1) goto L27
            boolean r1 = r3.isEquals
            if (r1 == 0) goto L27
            r1 = r4[r0]
            r2 = r5[r0]
            r3.append(r1, r2)
            int r0 = r0 + 1
            goto L16
        L27:
            return r3
        L28:
            r3.setEquals(r0)
            return r3
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(int[] r4, int[] r5) {
            r3 = this;
            boolean r0 = r3.isEquals
            if (r0 != 0) goto L5
            return r3
        L5:
            if (r4 != r5) goto L8
            return r3
        L8:
            r0 = 0
            if (r4 == 0) goto L28
            if (r5 != 0) goto Le
            goto L28
        Le:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 == r2) goto L16
            r3.setEquals(r0)
            return r3
        L16:
            int r1 = r4.length
            if (r0 >= r1) goto L27
            boolean r1 = r3.isEquals
            if (r1 == 0) goto L27
            r1 = r4[r0]
            r2 = r5[r0]
            r3.append(r1, r2)
            int r0 = r0 + 1
            goto L16
        L27:
            return r3
        L28:
            r3.setEquals(r0)
            return r3
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(long[] r6, long[] r7) {
            r5 = this;
            boolean r0 = r5.isEquals
            if (r0 != 0) goto L5
            return r5
        L5:
            if (r6 != r7) goto L8
            return r5
        L8:
            r0 = 0
            if (r6 == 0) goto L28
            if (r7 != 0) goto Le
            goto L28
        Le:
            int r1 = r6.length
            int r2 = r7.length
            if (r1 == r2) goto L16
            r5.setEquals(r0)
            return r5
        L16:
            int r1 = r6.length
            if (r0 >= r1) goto L27
            boolean r1 = r5.isEquals
            if (r1 == 0) goto L27
            r1 = r6[r0]
            r3 = r7[r0]
            r5.append(r1, r3)
            int r0 = r0 + 1
            goto L16
        L27:
            return r5
        L28:
            r5.setEquals(r0)
            return r5
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(java.lang.Object[] r4, java.lang.Object[] r5) {
            r3 = this;
            boolean r0 = r3.isEquals
            if (r0 != 0) goto L5
            return r3
        L5:
            if (r4 != r5) goto L8
            return r3
        L8:
            r0 = 0
            if (r4 == 0) goto L28
            if (r5 != 0) goto Le
            goto L28
        Le:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 == r2) goto L16
            r3.setEquals(r0)
            return r3
        L16:
            int r1 = r4.length
            if (r0 >= r1) goto L27
            boolean r1 = r3.isEquals
            if (r1 == 0) goto L27
            r1 = r4[r0]
            r2 = r5[r0]
            r3.append(r1, r2)
            int r0 = r0 + 1
            goto L16
        L27:
            return r3
        L28:
            r3.setEquals(r0)
            return r3
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(short[] r4, short[] r5) {
            r3 = this;
            boolean r0 = r3.isEquals
            if (r0 != 0) goto L5
            return r3
        L5:
            if (r4 != r5) goto L8
            return r3
        L8:
            r0 = 0
            if (r4 == 0) goto L28
            if (r5 != 0) goto Le
            goto L28
        Le:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 == r2) goto L16
            r3.setEquals(r0)
            return r3
        L16:
            int r1 = r4.length
            if (r0 >= r1) goto L27
            boolean r1 = r3.isEquals
            if (r1 == 0) goto L27
            short r1 = r4[r0]
            short r2 = r5[r0]
            r3.append(r1, r2)
            int r0 = r0 + 1
            goto L16
        L27:
            return r3
        L28:
            r3.setEquals(r0)
            return r3
    }

    public org.apache.commons.lang3.builder.EqualsBuilder append(boolean[] r4, boolean[] r5) {
            r3 = this;
            boolean r0 = r3.isEquals
            if (r0 != 0) goto L5
            return r3
        L5:
            if (r4 != r5) goto L8
            return r3
        L8:
            r0 = 0
            if (r4 == 0) goto L28
            if (r5 != 0) goto Le
            goto L28
        Le:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 == r2) goto L16
            r3.setEquals(r0)
            return r3
        L16:
            int r1 = r4.length
            if (r0 >= r1) goto L27
            boolean r1 = r3.isEquals
            if (r1 == 0) goto L27
            boolean r1 = r4[r0]
            boolean r2 = r5[r0]
            r3.append(r1, r2)
            int r0 = r0 + 1
            goto L16
        L27:
            return r3
        L28:
            r3.setEquals(r0)
            return r3
    }

    public org.apache.commons.lang3.builder.EqualsBuilder appendSuper(boolean r2) {
            r1 = this;
            boolean r0 = r1.isEquals
            if (r0 != 0) goto L5
            return r1
        L5:
            r1.isEquals = r2
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.apache.commons.lang3.builder.Builder
    public java.lang.Boolean build() {
            r1 = this;
            boolean r0 = r1.isEquals()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @Override // org.apache.commons.lang3.builder.Builder
    public /* bridge */ /* synthetic */ java.lang.Boolean build() {
            r1 = this;
            java.lang.Boolean r0 = r1.build()
            return r0
    }

    public boolean isEquals() {
            r1 = this;
            boolean r0 = r1.isEquals
            return r0
    }

    public org.apache.commons.lang3.builder.EqualsBuilder reflectionAppend(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            boolean r0 = r5.isEquals
            if (r0 != 0) goto L5
            return r5
        L5:
            if (r6 != r7) goto L8
            return r5
        L8:
            r0 = 0
            if (r6 == 0) goto L70
            if (r7 != 0) goto Le
            goto L70
        Le:
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r2 = r7.getClass()
            boolean r3 = r1.isInstance(r7)
            if (r3 == 0) goto L23
            boolean r3 = r2.isInstance(r6)
            if (r3 != 0) goto L2f
            goto L31
        L23:
            boolean r3 = r2.isInstance(r6)
            if (r3 == 0) goto L6d
            boolean r3 = r1.isInstance(r7)
            if (r3 != 0) goto L31
        L2f:
            r3 = r1
            goto L32
        L31:
            r3 = r2
        L32:
            boolean r4 = r3.isArray()     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r4 == 0) goto L3c
            r5.append(r6, r7)     // Catch: java.lang.IllegalArgumentException -> L6a
            goto L6c
        L3c:
            java.util.List<java.lang.Class<?>> r4 = r5.bypassReflectionClasses     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r4 == 0) goto L55
            boolean r1 = r4.contains(r1)     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r1 != 0) goto L4e
            java.util.List<java.lang.Class<?>> r1 = r5.bypassReflectionClasses     // Catch: java.lang.IllegalArgumentException -> L6a
            boolean r1 = r1.contains(r2)     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r1 == 0) goto L55
        L4e:
            boolean r6 = r6.equals(r7)     // Catch: java.lang.IllegalArgumentException -> L6a
            r5.isEquals = r6     // Catch: java.lang.IllegalArgumentException -> L6a
            goto L6c
        L55:
            r5.reflectionAppend(r6, r7, r3)     // Catch: java.lang.IllegalArgumentException -> L6a
        L58:
            java.lang.Class r1 = r3.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r1 == 0) goto L6c
            java.lang.Class<?> r1 = r5.reflectUpToClass     // Catch: java.lang.IllegalArgumentException -> L6a
            if (r3 == r1) goto L6c
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.IllegalArgumentException -> L6a
            r5.reflectionAppend(r6, r7, r3)     // Catch: java.lang.IllegalArgumentException -> L6a
            goto L58
        L6a:
            r5.isEquals = r0
        L6c:
            return r5
        L6d:
            r5.isEquals = r0
            return r5
        L70:
            r5.isEquals = r0
            return r5
    }

    public void reset() {
            r1 = this;
            r0 = 1
            r1.isEquals = r0
            return
    }

    public org.apache.commons.lang3.builder.EqualsBuilder setBypassReflectionClasses(java.util.List<java.lang.Class<?>> r1) {
            r0 = this;
            r0.bypassReflectionClasses = r1
            return r0
    }

    protected void setEquals(boolean r1) {
            r0 = this;
            r0.isEquals = r1
            return
    }

    public org.apache.commons.lang3.builder.EqualsBuilder setExcludeFields(java.lang.String... r1) {
            r0 = this;
            r0.excludeFields = r1
            return r0
    }

    public org.apache.commons.lang3.builder.EqualsBuilder setReflectUpToClass(java.lang.Class<?> r1) {
            r0 = this;
            r0.reflectUpToClass = r1
            return r0
    }

    public org.apache.commons.lang3.builder.EqualsBuilder setTestRecursive(boolean r1) {
            r0 = this;
            r0.testRecursive = r1
            return r0
    }

    public org.apache.commons.lang3.builder.EqualsBuilder setTestTransients(boolean r1) {
            r0 = this;
            r0.testTransients = r1
            return r0
    }
}
