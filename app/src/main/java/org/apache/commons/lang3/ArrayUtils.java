package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class ArrayUtils {
    public static final boolean[] EMPTY_BOOLEAN_ARRAY = null;
    public static final java.lang.Boolean[] EMPTY_BOOLEAN_OBJECT_ARRAY = null;
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    public static final java.lang.Byte[] EMPTY_BYTE_OBJECT_ARRAY = null;
    public static final java.lang.Character[] EMPTY_CHARACTER_OBJECT_ARRAY = null;
    public static final char[] EMPTY_CHAR_ARRAY = null;
    public static final java.lang.Class<?>[] EMPTY_CLASS_ARRAY = null;
    public static final double[] EMPTY_DOUBLE_ARRAY = null;
    public static final java.lang.Double[] EMPTY_DOUBLE_OBJECT_ARRAY = null;
    public static final java.lang.reflect.Field[] EMPTY_FIELD_ARRAY = null;
    public static final float[] EMPTY_FLOAT_ARRAY = null;
    public static final java.lang.Float[] EMPTY_FLOAT_OBJECT_ARRAY = null;
    public static final java.lang.Integer[] EMPTY_INTEGER_OBJECT_ARRAY = null;
    public static final int[] EMPTY_INT_ARRAY = null;
    public static final long[] EMPTY_LONG_ARRAY = null;
    public static final java.lang.Long[] EMPTY_LONG_OBJECT_ARRAY = null;
    public static final java.lang.reflect.Method[] EMPTY_METHOD_ARRAY = null;
    public static final java.lang.Object[] EMPTY_OBJECT_ARRAY = null;
    public static final short[] EMPTY_SHORT_ARRAY = null;
    public static final java.lang.Short[] EMPTY_SHORT_OBJECT_ARRAY = null;
    public static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    public static final java.lang.Throwable[] EMPTY_THROWABLE_ARRAY = null;
    public static final java.lang.reflect.Type[] EMPTY_TYPE_ARRAY = null;
    public static final int INDEX_NOT_FOUND = -1;

    static {
            r0 = 0
            boolean[] r1 = new boolean[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY = r1
            java.lang.Boolean[] r1 = new java.lang.Boolean[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY = r1
            byte[] r1 = new byte[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY = r1
            java.lang.Byte[] r1 = new java.lang.Byte[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY = r1
            char[] r1 = new char[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY = r1
            java.lang.Character[] r1 = new java.lang.Character[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY = r1
            java.lang.Class[] r1 = new java.lang.Class[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY = r1
            double[] r1 = new double[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY = r1
            java.lang.Double[] r1 = new java.lang.Double[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY = r1
            java.lang.reflect.Field[] r1 = new java.lang.reflect.Field[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_FIELD_ARRAY = r1
            float[] r1 = new float[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY = r1
            java.lang.Float[] r1 = new java.lang.Float[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY = r1
            int[] r1 = new int[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY = r1
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY = r1
            long[] r1 = new long[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY = r1
            java.lang.Long[] r1 = new java.lang.Long[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY = r1
            java.lang.reflect.Method[] r1 = new java.lang.reflect.Method[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_METHOD_ARRAY = r1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY = r1
            short[] r1 = new short[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY = r1
            java.lang.Short[] r1 = new java.lang.Short[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY = r1
            java.lang.String[] r1 = new java.lang.String[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY = r1
            java.lang.Throwable[] r1 = new java.lang.Throwable[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_THROWABLE_ARRAY = r1
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            org.apache.commons.lang3.ArrayUtils.EMPTY_TYPE_ARRAY = r0
            return
    }

    @java.lang.Deprecated
    public ArrayUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.Object add(java.lang.Object r3, int r4, java.lang.Object r5, java.lang.Class<?> r6) {
            java.lang.String r0 = "Index: "
            r1 = 0
            if (r3 != 0) goto L29
            if (r4 != 0) goto L10
            r3 = 1
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r6, r3)
            java.lang.reflect.Array.set(r3, r1, r5)
            return r3
        L10:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = ", Length: 0"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L29:
            int r2 = java.lang.reflect.Array.getLength(r3)
            if (r4 > r2) goto L46
            if (r4 < 0) goto L46
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda14 r0 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda14
            r0.<init>(r6, r2)
            java.lang.Object r6 = arraycopy(r3, r1, r1, r4, r0)
            java.lang.reflect.Array.set(r6, r4, r5)
            if (r4 >= r2) goto L45
            int r5 = r4 + 1
            int r2 = r2 - r4
            java.lang.System.arraycopy(r3, r4, r6, r5, r2)
        L45:
            return r6
        L46:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = ", Length: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public static byte[] add(byte[] r1, byte r2) {
            java.lang.Class r0 = java.lang.Byte.TYPE
            java.lang.Object r1 = copyArrayGrow1(r1, r0)
            byte[] r1 = (byte[]) r1
            int r0 = r1.length
            int r0 = r0 + (-1)
            r1[r0] = r2
            return r1
    }

    @java.lang.Deprecated
    public static byte[] add(byte[] r1, int r2, byte r3) {
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            java.lang.Class r0 = java.lang.Byte.TYPE
            java.lang.Object r1 = add(r1, r2, r3, r0)
            byte[] r1 = (byte[]) r1
            return r1
    }

    public static char[] add(char[] r1, char r2) {
            java.lang.Class r0 = java.lang.Character.TYPE
            java.lang.Object r1 = copyArrayGrow1(r1, r0)
            char[] r1 = (char[]) r1
            int r0 = r1.length
            int r0 = r0 + (-1)
            r1[r0] = r2
            return r1
    }

    @java.lang.Deprecated
    public static char[] add(char[] r1, int r2, char r3) {
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            java.lang.Class r0 = java.lang.Character.TYPE
            java.lang.Object r1 = add(r1, r2, r3, r0)
            char[] r1 = (char[]) r1
            return r1
    }

    public static double[] add(double[] r1, double r2) {
            java.lang.Class r0 = java.lang.Double.TYPE
            java.lang.Object r1 = copyArrayGrow1(r1, r0)
            double[] r1 = (double[]) r1
            int r0 = r1.length
            int r0 = r0 + (-1)
            r1[r0] = r2
            return r1
    }

    @java.lang.Deprecated
    public static double[] add(double[] r0, int r1, double r2) {
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Class r3 = java.lang.Double.TYPE
            java.lang.Object r0 = add(r0, r1, r2, r3)
            double[] r0 = (double[]) r0
            return r0
    }

    public static float[] add(float[] r1, float r2) {
            java.lang.Class r0 = java.lang.Float.TYPE
            java.lang.Object r1 = copyArrayGrow1(r1, r0)
            float[] r1 = (float[]) r1
            int r0 = r1.length
            int r0 = r0 + (-1)
            r1[r0] = r2
            return r1
    }

    @java.lang.Deprecated
    public static float[] add(float[] r1, int r2, float r3) {
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Class r0 = java.lang.Float.TYPE
            java.lang.Object r1 = add(r1, r2, r3, r0)
            float[] r1 = (float[]) r1
            return r1
    }

    public static int[] add(int[] r1, int r2) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Object r1 = copyArrayGrow1(r1, r0)
            int[] r1 = (int[]) r1
            int r0 = r1.length
            int r0 = r0 + (-1)
            r1[r0] = r2
            return r1
    }

    @java.lang.Deprecated
    public static int[] add(int[] r1, int r2, int r3) {
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Object r1 = add(r1, r2, r3, r0)
            int[] r1 = (int[]) r1
            return r1
    }

    @java.lang.Deprecated
    public static long[] add(long[] r0, int r1, long r2) {
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Class r3 = java.lang.Long.TYPE
            java.lang.Object r0 = add(r0, r1, r2, r3)
            long[] r0 = (long[]) r0
            return r0
    }

    public static long[] add(long[] r1, long r2) {
            java.lang.Class r0 = java.lang.Long.TYPE
            java.lang.Object r1 = copyArrayGrow1(r1, r0)
            long[] r1 = (long[]) r1
            int r0 = r1.length
            int r0 = r0 + (-1)
            r1[r0] = r2
            return r1
    }

    @java.lang.Deprecated
    public static <T> T[] add(T[] r1, int r2, T r3) {
            if (r1 == 0) goto L7
            java.lang.Class r0 = getComponentType(r1)
            goto Ld
        L7:
            if (r3 == 0) goto L14
            java.lang.Class r0 = org.apache.commons.lang3.ObjectUtils.getClass(r3)
        Ld:
            java.lang.Object r1 = add(r1, r2, r3, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            return r1
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Array and element cannot both be null"
            r1.<init>(r2)
            throw r1
    }

    public static <T> T[] add(T[] r1, T r2) {
            if (r1 == 0) goto Lb
            java.lang.Class r0 = r1.getClass()
            java.lang.Class r0 = r0.getComponentType()
            goto L11
        Lb:
            if (r2 == 0) goto L1d
            java.lang.Class r0 = r2.getClass()
        L11:
            java.lang.Object r1 = copyArrayGrow1(r1, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r0 = r1.length
            int r0 = r0 + (-1)
            r1[r0] = r2
            return r1
        L1d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Arguments cannot both be null"
            r1.<init>(r2)
            throw r1
    }

    @java.lang.Deprecated
    public static short[] add(short[] r1, int r2, short r3) {
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            java.lang.Class r0 = java.lang.Short.TYPE
            java.lang.Object r1 = add(r1, r2, r3, r0)
            short[] r1 = (short[]) r1
            return r1
    }

    public static short[] add(short[] r1, short r2) {
            java.lang.Class r0 = java.lang.Short.TYPE
            java.lang.Object r1 = copyArrayGrow1(r1, r0)
            short[] r1 = (short[]) r1
            int r0 = r1.length
            int r0 = r0 + (-1)
            r1[r0] = r2
            return r1
    }

    @java.lang.Deprecated
    public static boolean[] add(boolean[] r1, int r2, boolean r3) {
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.Object r1 = add(r1, r2, r3, r0)
            boolean[] r1 = (boolean[]) r1
            return r1
    }

    public static boolean[] add(boolean[] r1, boolean r2) {
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.Object r1 = copyArrayGrow1(r1, r0)
            boolean[] r1 = (boolean[]) r1
            int r0 = r1.length
            int r0 = r0 + (-1)
            r1[r0] = r2
            return r1
    }

    public static byte[] addAll(byte[] r3, byte... r4) {
            if (r3 != 0) goto L7
            byte[] r3 = clone(r4)
            return r3
        L7:
            if (r4 != 0) goto Le
            byte[] r3 = clone(r3)
            return r3
        Le:
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            int r3 = r3.length
            int r1 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r3, r1)
            return r0
    }

    public static char[] addAll(char[] r3, char... r4) {
            if (r3 != 0) goto L7
            char[] r3 = clone(r4)
            return r3
        L7:
            if (r4 != 0) goto Le
            char[] r3 = clone(r3)
            return r3
        Le:
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 + r1
            char[] r0 = new char[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            int r3 = r3.length
            int r1 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r3, r1)
            return r0
    }

    public static double[] addAll(double[] r3, double... r4) {
            if (r3 != 0) goto L7
            double[] r3 = clone(r4)
            return r3
        L7:
            if (r4 != 0) goto Le
            double[] r3 = clone(r3)
            return r3
        Le:
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 + r1
            double[] r0 = new double[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            int r3 = r3.length
            int r1 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r3, r1)
            return r0
    }

    public static float[] addAll(float[] r3, float... r4) {
            if (r3 != 0) goto L7
            float[] r3 = clone(r4)
            return r3
        L7:
            if (r4 != 0) goto Le
            float[] r3 = clone(r3)
            return r3
        Le:
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 + r1
            float[] r0 = new float[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            int r3 = r3.length
            int r1 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r3, r1)
            return r0
    }

    public static int[] addAll(int[] r3, int... r4) {
            if (r3 != 0) goto L7
            int[] r3 = clone(r4)
            return r3
        L7:
            if (r4 != 0) goto Le
            int[] r3 = clone(r3)
            return r3
        Le:
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            int r3 = r3.length
            int r1 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r3, r1)
            return r0
    }

    public static long[] addAll(long[] r3, long... r4) {
            if (r3 != 0) goto L7
            long[] r3 = clone(r4)
            return r3
        L7:
            if (r4 != 0) goto Le
            long[] r3 = clone(r3)
            return r3
        Le:
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 + r1
            long[] r0 = new long[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            int r3 = r3.length
            int r1 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r3, r1)
            return r0
    }

    public static <T> T[] addAll(T[] r4, T... r5) {
            if (r4 != 0) goto L7
            java.lang.Object[] r4 = clone(r5)
            return r4
        L7:
            if (r5 != 0) goto Le
            java.lang.Object[] r4 = clone(r4)
            return r4
        Le:
            java.lang.Class r0 = getComponentType(r4)
            int r1 = r4.length
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda1 r2 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda1
            r2.<init>(r0, r4, r5)
            r3 = 0
            java.lang.Object r1 = arraycopy(r4, r3, r3, r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r4 = r4.length     // Catch: java.lang.ArrayStoreException -> L25
            int r2 = r5.length     // Catch: java.lang.ArrayStoreException -> L25
            java.lang.System.arraycopy(r5, r3, r1, r4, r2)     // Catch: java.lang.ArrayStoreException -> L25
            return r1
        L25:
            r4 = move-exception
            java.lang.Class r5 = r5.getClass()
            java.lang.Class r5 = r5.getComponentType()
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L5b
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot store "
            r2.<init>(r3)
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = " in an array of "
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r4)
            throw r1
        L5b:
            throw r4
    }

    public static short[] addAll(short[] r3, short... r4) {
            if (r3 != 0) goto L7
            short[] r3 = clone(r4)
            return r3
        L7:
            if (r4 != 0) goto Le
            short[] r3 = clone(r3)
            return r3
        Le:
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 + r1
            short[] r0 = new short[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            int r3 = r3.length
            int r1 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r3, r1)
            return r0
    }

    public static boolean[] addAll(boolean[] r3, boolean... r4) {
            if (r3 != 0) goto L7
            boolean[] r3 = clone(r4)
            return r3
        L7:
            if (r4 != 0) goto Le
            boolean[] r3 = clone(r3)
            return r3
        Le:
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 + r1
            boolean[] r0 = new boolean[r0]
            int r1 = r3.length
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r0, r2, r1)
            int r3 = r3.length
            int r1 = r4.length
            java.lang.System.arraycopy(r4, r2, r0, r3, r1)
            return r0
    }

    public static byte[] addFirst(byte[] r2, byte r3) {
            if (r2 != 0) goto L7
            byte[] r2 = add(r2, r3)
            goto L11
        L7:
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r3
            byte[] r2 = insert(r1, r2, r0)
        L11:
            return r2
    }

    public static char[] addFirst(char[] r2, char r3) {
            if (r2 != 0) goto L7
            char[] r2 = add(r2, r3)
            goto L11
        L7:
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 0
            r0[r1] = r3
            char[] r2 = insert(r1, r2, r0)
        L11:
            return r2
    }

    public static double[] addFirst(double[] r2, double r3) {
            if (r2 != 0) goto L7
            double[] r2 = add(r2, r3)
            goto L11
        L7:
            r0 = 1
            double[] r0 = new double[r0]
            r1 = 0
            r0[r1] = r3
            double[] r2 = insert(r1, r2, r0)
        L11:
            return r2
    }

    public static float[] addFirst(float[] r2, float r3) {
            if (r2 != 0) goto L7
            float[] r2 = add(r2, r3)
            goto L11
        L7:
            r0 = 1
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r3
            float[] r2 = insert(r1, r2, r0)
        L11:
            return r2
    }

    public static int[] addFirst(int[] r1, int r2) {
            if (r1 != 0) goto L7
            int[] r1 = add(r1, r2)
            goto L10
        L7:
            r0 = 0
            int[] r2 = new int[]{r2}
            int[] r1 = insert(r0, r1, r2)
        L10:
            return r1
    }

    public static long[] addFirst(long[] r2, long r3) {
            if (r2 != 0) goto L7
            long[] r2 = add(r2, r3)
            goto L11
        L7:
            r0 = 1
            long[] r0 = new long[r0]
            r1 = 0
            r0[r1] = r3
            long[] r2 = insert(r1, r2, r0)
        L11:
            return r2
    }

    public static <T> T[] addFirst(T[] r1, T r2) {
            if (r1 != 0) goto L7
            java.lang.Object[] r1 = add(r1, r2)
            goto L10
        L7:
            r0 = 0
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r1 = insert(r0, r1, r2)
        L10:
            return r1
    }

    public static short[] addFirst(short[] r2, short r3) {
            if (r2 != 0) goto L7
            short[] r2 = add(r2, r3)
            goto L11
        L7:
            r0 = 1
            short[] r0 = new short[r0]
            r1 = 0
            r0[r1] = r3
            short[] r2 = insert(r1, r2, r0)
        L11:
            return r2
    }

    public static boolean[] addFirst(boolean[] r2, boolean r3) {
            if (r2 != 0) goto L7
            boolean[] r2 = add(r2, r3)
            goto L11
        L7:
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r1 = 0
            r0[r1] = r3
            boolean[] r2 = insert(r1, r2, r0)
        L11:
            return r2
    }

    public static <T> T arraycopy(T r1, int r2, int r3, int r4, java.util.function.Function<java.lang.Integer, T> r5) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.apply(r0)
            java.lang.Object r1 = arraycopy(r1, r2, r5, r3, r4)
            return r1
    }

    public static <T> T arraycopy(T r0, int r1, int r2, int r3, java.util.function.Supplier<T> r4) {
            java.lang.Object r4 = r4.get()
            java.lang.Object r0 = arraycopy(r0, r1, r4, r2, r3)
            return r0
    }

    public static <T> T arraycopy(T r0, int r1, T r2, int r3, int r4) {
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            return r2
    }

    public static byte[] clone(byte[] r0) {
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static char[] clone(char[] r0) {
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.clone()
            char[] r0 = (char[]) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static double[] clone(double[] r0) {
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.clone()
            double[] r0 = (double[]) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static float[] clone(float[] r0) {
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.clone()
            float[] r0 = (float[]) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static int[] clone(int[] r0) {
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.clone()
            int[] r0 = (int[]) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static long[] clone(long[] r0) {
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.clone()
            long[] r0 = (long[]) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static <T> T[] clone(T[] r0) {
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static short[] clone(short[] r0) {
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.clone()
            short[] r0 = (short[]) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static boolean[] clone(boolean[] r0) {
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.clone()
            boolean[] r0 = (boolean[]) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static boolean contains(byte[] r0, byte r1) {
            int r0 = indexOf(r0, r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static boolean contains(char[] r0, char r1) {
            int r0 = indexOf(r0, r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static boolean contains(double[] r0, double r1) {
            int r0 = indexOf(r0, r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static boolean contains(double[] r6, double r7, double r9) {
            r3 = 0
            r0 = r6
            r1 = r7
            r4 = r9
            int r6 = indexOf(r0, r1, r3, r4)
            r7 = -1
            if (r6 == r7) goto Ld
            r6 = 1
            goto Le
        Ld:
            r6 = 0
        Le:
            return r6
    }

    public static boolean contains(float[] r0, float r1) {
            int r0 = indexOf(r0, r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static boolean contains(int[] r0, int r1) {
            int r0 = indexOf(r0, r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static boolean contains(long[] r0, long r1) {
            int r0 = indexOf(r0, r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static boolean contains(java.lang.Object[] r0, java.lang.Object r1) {
            int r0 = indexOf(r0, r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static boolean contains(short[] r0, short r1) {
            int r0 = indexOf(r0, r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static boolean contains(boolean[] r0, boolean r1) {
            int r0 = indexOf(r0, r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static boolean containsAny(java.lang.Object[] r1, java.lang.Object... r2) {
            java.util.stream.Stream r2 = org.apache.commons.lang3.stream.Streams.of(r2)
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda0
            r0.<init>(r1)
            boolean r1 = r2.anyMatch(r0)
            return r1
    }

    private static java.lang.Object copyArrayGrow1(java.lang.Object r2, java.lang.Class<?> r3) {
            if (r2 == 0) goto L19
            int r3 = java.lang.reflect.Array.getLength(r2)
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r1 = r3 + 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            return r0
        L19:
            r2 = 1
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r3, r2)
            return r2
    }

    public static <T> T get(T[] r1, int r2) {
            r0 = 0
            java.lang.Object r1 = get(r1, r2, r0)
            return r1
    }

    public static <T> T get(T[] r1, int r2, T r3) {
            boolean r0 = isArrayIndexValid(r1, r2)
            if (r0 == 0) goto L8
            r3 = r1[r2]
        L8:
            return r3
    }

    public static <T> java.lang.Class<T> getComponentType(T[] r0) {
            java.lang.Class r0 = org.apache.commons.lang3.ObjectUtils.getClass(r0)
            java.lang.Class r0 = org.apache.commons.lang3.ClassUtils.getComponentType(r0)
            return r0
    }

    public static int getLength(java.lang.Object r0) {
            if (r0 == 0) goto L7
            int r0 = java.lang.reflect.Array.getLength(r0)
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public static int hashCode(java.lang.Object r1) {
            org.apache.commons.lang3.builder.HashCodeBuilder r0 = new org.apache.commons.lang3.builder.HashCodeBuilder
            r0.<init>()
            org.apache.commons.lang3.builder.HashCodeBuilder r1 = r0.append(r1)
            int r1 = r1.toHashCode()
            return r1
    }

    public static int indexOf(byte[] r1, byte r2) {
            r0 = 0
            int r1 = indexOf(r1, r2, r0)
            return r1
    }

    public static int indexOf(byte[] r2, byte r3, int r4) {
            r0 = -1
            if (r2 != 0) goto L4
            return r0
        L4:
            int r4 = max0(r4)
        L8:
            int r1 = r2.length
            if (r4 >= r1) goto L13
            r1 = r2[r4]
            if (r3 != r1) goto L10
            return r4
        L10:
            int r4 = r4 + 1
            goto L8
        L13:
            return r0
    }

    public static int indexOf(char[] r1, char r2) {
            r0 = 0
            int r1 = indexOf(r1, r2, r0)
            return r1
    }

    public static int indexOf(char[] r2, char r3, int r4) {
            r0 = -1
            if (r2 != 0) goto L4
            return r0
        L4:
            int r4 = max0(r4)
        L8:
            int r1 = r2.length
            if (r4 >= r1) goto L13
            char r1 = r2[r4]
            if (r3 != r1) goto L10
            return r4
        L10:
            int r4 = r4 + 1
            goto L8
        L13:
            return r0
    }

    public static int indexOf(double[] r1, double r2) {
            r0 = 0
            int r1 = indexOf(r1, r2, r0)
            return r1
    }

    public static int indexOf(double[] r6, double r7, double r9) {
            r3 = 0
            r0 = r6
            r1 = r7
            r4 = r9
            int r6 = indexOf(r0, r1, r3, r4)
            return r6
    }

    public static int indexOf(double[] r5, double r6, int r8) {
            boolean r0 = isEmpty(r5)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = java.lang.Double.isNaN(r6)
            int r8 = max0(r8)
        L10:
            int r2 = r5.length
            if (r8 >= r2) goto L26
            r2 = r5[r8]
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L25
            if (r0 == 0) goto L22
            boolean r2 = java.lang.Double.isNaN(r2)
            if (r2 == 0) goto L22
            goto L25
        L22:
            int r8 = r8 + 1
            goto L10
        L25:
            return r8
        L26:
            return r1
    }

    public static int indexOf(double[] r4, double r5, int r7, double r8) {
            boolean r0 = isEmpty(r4)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            double r2 = r5 - r8
            double r5 = r5 + r8
            int r7 = max0(r7)
        Lf:
            int r8 = r4.length
            if (r7 >= r8) goto L20
            r8 = r4[r7]
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 < 0) goto L1d
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 > 0) goto L1d
            return r7
        L1d:
            int r7 = r7 + 1
            goto Lf
        L20:
            return r1
    }

    public static int indexOf(float[] r1, float r2) {
            r0 = 0
            int r1 = indexOf(r1, r2, r0)
            return r1
    }

    public static int indexOf(float[] r4, float r5, int r6) {
            boolean r0 = isEmpty(r4)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = java.lang.Float.isNaN(r5)
            int r6 = max0(r6)
        L10:
            int r2 = r4.length
            if (r6 >= r2) goto L26
            r2 = r4[r6]
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r3 == 0) goto L25
            if (r0 == 0) goto L22
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto L22
            goto L25
        L22:
            int r6 = r6 + 1
            goto L10
        L25:
            return r6
        L26:
            return r1
    }

    public static int indexOf(int[] r1, int r2) {
            r0 = 0
            int r1 = indexOf(r1, r2, r0)
            return r1
    }

    public static int indexOf(int[] r2, int r3, int r4) {
            r0 = -1
            if (r2 != 0) goto L4
            return r0
        L4:
            int r4 = max0(r4)
        L8:
            int r1 = r2.length
            if (r4 >= r1) goto L13
            r1 = r2[r4]
            if (r3 != r1) goto L10
            return r4
        L10:
            int r4 = r4 + 1
            goto L8
        L13:
            return r0
    }

    public static int indexOf(long[] r1, long r2) {
            r0 = 0
            int r1 = indexOf(r1, r2, r0)
            return r1
    }

    public static int indexOf(long[] r3, long r4, int r6) {
            r0 = -1
            if (r3 != 0) goto L4
            return r0
        L4:
            int r6 = max0(r6)
        L8:
            int r1 = r3.length
            if (r6 >= r1) goto L15
            r1 = r3[r6]
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L12
            return r6
        L12:
            int r6 = r6 + 1
            goto L8
        L15:
            return r0
    }

    public static int indexOf(java.lang.Object[] r1, java.lang.Object r2) {
            r0 = 0
            int r1 = indexOf(r1, r2, r0)
            return r1
    }

    public static int indexOf(java.lang.Object[] r2, java.lang.Object r3, int r4) {
            r0 = -1
            if (r2 != 0) goto L4
            return r0
        L4:
            int r4 = max0(r4)
            if (r3 != 0) goto L15
        La:
            int r3 = r2.length
            if (r4 >= r3) goto L24
            r3 = r2[r4]
            if (r3 != 0) goto L12
            return r4
        L12:
            int r4 = r4 + 1
            goto La
        L15:
            int r1 = r2.length
            if (r4 >= r1) goto L24
            r1 = r2[r4]
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L21
            return r4
        L21:
            int r4 = r4 + 1
            goto L15
        L24:
            return r0
    }

    public static int indexOf(short[] r1, short r2) {
            r0 = 0
            int r1 = indexOf(r1, r2, r0)
            return r1
    }

    public static int indexOf(short[] r2, short r3, int r4) {
            r0 = -1
            if (r2 != 0) goto L4
            return r0
        L4:
            int r4 = max0(r4)
        L8:
            int r1 = r2.length
            if (r4 >= r1) goto L13
            short r1 = r2[r4]
            if (r3 != r1) goto L10
            return r4
        L10:
            int r4 = r4 + 1
            goto L8
        L13:
            return r0
    }

    public static int indexOf(boolean[] r1, boolean r2) {
            r0 = 0
            int r1 = indexOf(r1, r2, r0)
            return r1
    }

    public static int indexOf(boolean[] r2, boolean r3, int r4) {
            boolean r0 = isEmpty(r2)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            int r4 = max0(r4)
        Lc:
            int r0 = r2.length
            if (r4 >= r0) goto L17
            boolean r0 = r2[r4]
            if (r3 != r0) goto L14
            return r4
        L14:
            int r4 = r4 + 1
            goto Lc
        L17:
            return r1
    }

    public static java.util.BitSet indexesOf(byte[] r1, byte r2) {
            r0 = 0
            java.util.BitSet r1 = indexesOf(r1, r2, r0)
            return r1
    }

    public static java.util.BitSet indexesOf(byte[] r2, byte r3, int r4) {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            if (r2 != 0) goto L8
            return r0
        L8:
            int r1 = r2.length
            if (r4 >= r1) goto L19
            int r4 = indexOf(r2, r3, r4)
            r1 = -1
            if (r4 != r1) goto L13
            goto L19
        L13:
            r0.set(r4)
            int r4 = r4 + 1
            goto L8
        L19:
            return r0
    }

    public static java.util.BitSet indexesOf(char[] r1, char r2) {
            r0 = 0
            java.util.BitSet r1 = indexesOf(r1, r2, r0)
            return r1
    }

    public static java.util.BitSet indexesOf(char[] r2, char r3, int r4) {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            if (r2 != 0) goto L8
            return r0
        L8:
            int r1 = r2.length
            if (r4 >= r1) goto L19
            int r4 = indexOf(r2, r3, r4)
            r1 = -1
            if (r4 != r1) goto L13
            goto L19
        L13:
            r0.set(r4)
            int r4 = r4 + 1
            goto L8
        L19:
            return r0
    }

    public static java.util.BitSet indexesOf(double[] r1, double r2) {
            r0 = 0
            java.util.BitSet r1 = indexesOf(r1, r2, r0)
            return r1
    }

    public static java.util.BitSet indexesOf(double[] r6, double r7, double r9) {
            r3 = 0
            r0 = r6
            r1 = r7
            r4 = r9
            java.util.BitSet r6 = indexesOf(r0, r1, r3, r4)
            return r6
    }

    public static java.util.BitSet indexesOf(double[] r2, double r3, int r5) {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            if (r2 != 0) goto L8
            return r0
        L8:
            int r1 = r2.length
            if (r5 >= r1) goto L19
            int r5 = indexOf(r2, r3, r5)
            r1 = -1
            if (r5 != r1) goto L13
            goto L19
        L13:
            r0.set(r5)
            int r5 = r5 + 1
            goto L8
        L19:
            return r0
    }

    public static java.util.BitSet indexesOf(double[] r7, double r8, int r10, double r11) {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            r4 = r10
        L9:
            int r10 = r7.length
            if (r4 >= r10) goto L1d
            r1 = r7
            r2 = r8
            r5 = r11
            int r10 = indexOf(r1, r2, r4, r5)
            r1 = -1
            if (r10 != r1) goto L17
            goto L1d
        L17:
            r0.set(r10)
            int r4 = r10 + 1
            goto L9
        L1d:
            return r0
    }

    public static java.util.BitSet indexesOf(float[] r1, float r2) {
            r0 = 0
            java.util.BitSet r1 = indexesOf(r1, r2, r0)
            return r1
    }

    public static java.util.BitSet indexesOf(float[] r2, float r3, int r4) {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            if (r2 != 0) goto L8
            return r0
        L8:
            int r1 = r2.length
            if (r4 >= r1) goto L19
            int r4 = indexOf(r2, r3, r4)
            r1 = -1
            if (r4 != r1) goto L13
            goto L19
        L13:
            r0.set(r4)
            int r4 = r4 + 1
            goto L8
        L19:
            return r0
    }

    public static java.util.BitSet indexesOf(int[] r1, int r2) {
            r0 = 0
            java.util.BitSet r1 = indexesOf(r1, r2, r0)
            return r1
    }

    public static java.util.BitSet indexesOf(int[] r2, int r3, int r4) {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            if (r2 != 0) goto L8
            return r0
        L8:
            int r1 = r2.length
            if (r4 >= r1) goto L19
            int r4 = indexOf(r2, r3, r4)
            r1 = -1
            if (r4 != r1) goto L13
            goto L19
        L13:
            r0.set(r4)
            int r4 = r4 + 1
            goto L8
        L19:
            return r0
    }

    public static java.util.BitSet indexesOf(long[] r1, long r2) {
            r0 = 0
            java.util.BitSet r1 = indexesOf(r1, r2, r0)
            return r1
    }

    public static java.util.BitSet indexesOf(long[] r2, long r3, int r5) {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            if (r2 != 0) goto L8
            return r0
        L8:
            int r1 = r2.length
            if (r5 >= r1) goto L19
            int r5 = indexOf(r2, r3, r5)
            r1 = -1
            if (r5 != r1) goto L13
            goto L19
        L13:
            r0.set(r5)
            int r5 = r5 + 1
            goto L8
        L19:
            return r0
    }

    public static java.util.BitSet indexesOf(java.lang.Object[] r1, java.lang.Object r2) {
            r0 = 0
            java.util.BitSet r1 = indexesOf(r1, r2, r0)
            return r1
    }

    public static java.util.BitSet indexesOf(java.lang.Object[] r2, java.lang.Object r3, int r4) {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            if (r2 != 0) goto L8
            return r0
        L8:
            int r1 = r2.length
            if (r4 >= r1) goto L19
            int r4 = indexOf(r2, r3, r4)
            r1 = -1
            if (r4 != r1) goto L13
            goto L19
        L13:
            r0.set(r4)
            int r4 = r4 + 1
            goto L8
        L19:
            return r0
    }

    public static java.util.BitSet indexesOf(short[] r1, short r2) {
            r0 = 0
            java.util.BitSet r1 = indexesOf(r1, r2, r0)
            return r1
    }

    public static java.util.BitSet indexesOf(short[] r2, short r3, int r4) {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            if (r2 != 0) goto L8
            return r0
        L8:
            int r1 = r2.length
            if (r4 >= r1) goto L19
            int r4 = indexOf(r2, r3, r4)
            r1 = -1
            if (r4 != r1) goto L13
            goto L19
        L13:
            r0.set(r4)
            int r4 = r4 + 1
            goto L8
        L19:
            return r0
    }

    public static java.util.BitSet indexesOf(boolean[] r1, boolean r2) {
            r0 = 0
            java.util.BitSet r1 = indexesOf(r1, r2, r0)
            return r1
    }

    public static java.util.BitSet indexesOf(boolean[] r2, boolean r3, int r4) {
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            if (r2 != 0) goto L8
            return r0
        L8:
            int r1 = r2.length
            if (r4 >= r1) goto L19
            int r4 = indexOf(r2, r3, r4)
            r1 = -1
            if (r4 != r1) goto L13
            goto L19
        L13:
            r0.set(r4)
            int r4 = r4 + 1
            goto L8
        L19:
            return r0
    }

    public static byte[] insert(int r3, byte[] r4, byte... r5) {
            if (r4 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = isEmpty(r5)
            if (r0 == 0) goto Lf
            byte[] r3 = clone(r4)
            return r3
        Lf:
            if (r3 < 0) goto L2e
            int r0 = r4.length
            if (r3 > r0) goto L2e
            int r0 = r4.length
            int r1 = r5.length
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            int r1 = r5.length
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r3, r1)
            if (r3 <= 0) goto L23
            java.lang.System.arraycopy(r4, r2, r0, r2, r3)
        L23:
            int r1 = r4.length
            if (r3 >= r1) goto L2d
            int r5 = r5.length
            int r5 = r5 + r3
            int r1 = r4.length
            int r1 = r1 - r3
            java.lang.System.arraycopy(r4, r3, r0, r5, r1)
        L2d:
            return r0
        L2e:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Index: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ", Length: "
            java.lang.StringBuilder r3 = r3.append(r0)
            int r4 = r4.length
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    public static char[] insert(int r3, char[] r4, char... r5) {
            if (r4 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = isEmpty(r5)
            if (r0 == 0) goto Lf
            char[] r3 = clone(r4)
            return r3
        Lf:
            if (r3 < 0) goto L2e
            int r0 = r4.length
            if (r3 > r0) goto L2e
            int r0 = r4.length
            int r1 = r5.length
            int r0 = r0 + r1
            char[] r0 = new char[r0]
            int r1 = r5.length
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r3, r1)
            if (r3 <= 0) goto L23
            java.lang.System.arraycopy(r4, r2, r0, r2, r3)
        L23:
            int r1 = r4.length
            if (r3 >= r1) goto L2d
            int r5 = r5.length
            int r5 = r5 + r3
            int r1 = r4.length
            int r1 = r1 - r3
            java.lang.System.arraycopy(r4, r3, r0, r5, r1)
        L2d:
            return r0
        L2e:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Index: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ", Length: "
            java.lang.StringBuilder r3 = r3.append(r0)
            int r4 = r4.length
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    public static double[] insert(int r3, double[] r4, double... r5) {
            if (r4 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = isEmpty(r5)
            if (r0 == 0) goto Lf
            double[] r3 = clone(r4)
            return r3
        Lf:
            if (r3 < 0) goto L2e
            int r0 = r4.length
            if (r3 > r0) goto L2e
            int r0 = r4.length
            int r1 = r5.length
            int r0 = r0 + r1
            double[] r0 = new double[r0]
            int r1 = r5.length
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r3, r1)
            if (r3 <= 0) goto L23
            java.lang.System.arraycopy(r4, r2, r0, r2, r3)
        L23:
            int r1 = r4.length
            if (r3 >= r1) goto L2d
            int r5 = r5.length
            int r5 = r5 + r3
            int r1 = r4.length
            int r1 = r1 - r3
            java.lang.System.arraycopy(r4, r3, r0, r5, r1)
        L2d:
            return r0
        L2e:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Index: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ", Length: "
            java.lang.StringBuilder r3 = r3.append(r0)
            int r4 = r4.length
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    public static float[] insert(int r3, float[] r4, float... r5) {
            if (r4 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = isEmpty(r5)
            if (r0 == 0) goto Lf
            float[] r3 = clone(r4)
            return r3
        Lf:
            if (r3 < 0) goto L2e
            int r0 = r4.length
            if (r3 > r0) goto L2e
            int r0 = r4.length
            int r1 = r5.length
            int r0 = r0 + r1
            float[] r0 = new float[r0]
            int r1 = r5.length
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r3, r1)
            if (r3 <= 0) goto L23
            java.lang.System.arraycopy(r4, r2, r0, r2, r3)
        L23:
            int r1 = r4.length
            if (r3 >= r1) goto L2d
            int r5 = r5.length
            int r5 = r5 + r3
            int r1 = r4.length
            int r1 = r1 - r3
            java.lang.System.arraycopy(r4, r3, r0, r5, r1)
        L2d:
            return r0
        L2e:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Index: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ", Length: "
            java.lang.StringBuilder r3 = r3.append(r0)
            int r4 = r4.length
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    public static int[] insert(int r3, int[] r4, int... r5) {
            if (r4 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = isEmpty(r5)
            if (r0 == 0) goto Lf
            int[] r3 = clone(r4)
            return r3
        Lf:
            if (r3 < 0) goto L2e
            int r0 = r4.length
            if (r3 > r0) goto L2e
            int r0 = r4.length
            int r1 = r5.length
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            int r1 = r5.length
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r3, r1)
            if (r3 <= 0) goto L23
            java.lang.System.arraycopy(r4, r2, r0, r2, r3)
        L23:
            int r1 = r4.length
            if (r3 >= r1) goto L2d
            int r5 = r5.length
            int r5 = r5 + r3
            int r1 = r4.length
            int r1 = r1 - r3
            java.lang.System.arraycopy(r4, r3, r0, r5, r1)
        L2d:
            return r0
        L2e:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Index: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ", Length: "
            java.lang.StringBuilder r3 = r3.append(r0)
            int r4 = r4.length
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    public static long[] insert(int r3, long[] r4, long... r5) {
            if (r4 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = isEmpty(r5)
            if (r0 == 0) goto Lf
            long[] r3 = clone(r4)
            return r3
        Lf:
            if (r3 < 0) goto L2e
            int r0 = r4.length
            if (r3 > r0) goto L2e
            int r0 = r4.length
            int r1 = r5.length
            int r0 = r0 + r1
            long[] r0 = new long[r0]
            int r1 = r5.length
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r3, r1)
            if (r3 <= 0) goto L23
            java.lang.System.arraycopy(r4, r2, r0, r2, r3)
        L23:
            int r1 = r4.length
            if (r3 >= r1) goto L2d
            int r5 = r5.length
            int r5 = r5 + r3
            int r1 = r4.length
            int r1 = r1 - r3
            java.lang.System.arraycopy(r4, r3, r0, r5, r1)
        L2d:
            return r0
        L2e:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Index: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ", Length: "
            java.lang.StringBuilder r3 = r3.append(r0)
            int r4 = r4.length
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    @java.lang.SafeVarargs
    public static <T> T[] insert(int r3, T[] r4, T... r5) {
            if (r4 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = isEmpty(r5)
            if (r0 == 0) goto Lf
            java.lang.Object[] r3 = clone(r4)
            return r3
        Lf:
            if (r3 < 0) goto L34
            int r0 = r4.length
            if (r3 > r0) goto L34
            java.lang.Class r0 = getComponentType(r4)
            int r1 = r4.length
            int r2 = r5.length
            int r1 = r1 + r2
            java.lang.Object[] r0 = newInstance(r0, r1)
            int r1 = r5.length
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r3, r1)
            if (r3 <= 0) goto L29
            java.lang.System.arraycopy(r4, r2, r0, r2, r3)
        L29:
            int r1 = r4.length
            if (r3 >= r1) goto L33
            int r5 = r5.length
            int r5 = r5 + r3
            int r1 = r4.length
            int r1 = r1 - r3
            java.lang.System.arraycopy(r4, r3, r0, r5, r1)
        L33:
            return r0
        L34:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Index: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ", Length: "
            java.lang.StringBuilder r3 = r3.append(r0)
            int r4 = r4.length
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    public static short[] insert(int r3, short[] r4, short... r5) {
            if (r4 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = isEmpty(r5)
            if (r0 == 0) goto Lf
            short[] r3 = clone(r4)
            return r3
        Lf:
            if (r3 < 0) goto L2e
            int r0 = r4.length
            if (r3 > r0) goto L2e
            int r0 = r4.length
            int r1 = r5.length
            int r0 = r0 + r1
            short[] r0 = new short[r0]
            int r1 = r5.length
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r3, r1)
            if (r3 <= 0) goto L23
            java.lang.System.arraycopy(r4, r2, r0, r2, r3)
        L23:
            int r1 = r4.length
            if (r3 >= r1) goto L2d
            int r5 = r5.length
            int r5 = r5 + r3
            int r1 = r4.length
            int r1 = r1 - r3
            java.lang.System.arraycopy(r4, r3, r0, r5, r1)
        L2d:
            return r0
        L2e:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Index: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ", Length: "
            java.lang.StringBuilder r3 = r3.append(r0)
            int r4 = r4.length
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    public static boolean[] insert(int r3, boolean[] r4, boolean... r5) {
            if (r4 != 0) goto L4
            r3 = 0
            return r3
        L4:
            boolean r0 = isEmpty(r5)
            if (r0 == 0) goto Lf
            boolean[] r3 = clone(r4)
            return r3
        Lf:
            if (r3 < 0) goto L2e
            int r0 = r4.length
            if (r3 > r0) goto L2e
            int r0 = r4.length
            int r1 = r5.length
            int r0 = r0 + r1
            boolean[] r0 = new boolean[r0]
            int r1 = r5.length
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r3, r1)
            if (r3 <= 0) goto L23
            java.lang.System.arraycopy(r4, r2, r0, r2, r3)
        L23:
            int r1 = r4.length
            if (r3 >= r1) goto L2d
            int r5 = r5.length
            int r5 = r5 + r3
            int r1 = r4.length
            int r1 = r1 - r3
            java.lang.System.arraycopy(r4, r3, r0, r5, r1)
        L2d:
            return r0
        L2e:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Index: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ", Length: "
            java.lang.StringBuilder r3 = r3.append(r0)
            int r4 = r4.length
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    private static boolean isArrayEmpty(java.lang.Object r0) {
            int r0 = getLength(r0)
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static <T> boolean isArrayIndexValid(T[] r0, int r1) {
            if (r1 < 0) goto La
            int r0 = getLength(r0)
            if (r0 <= r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public static boolean isEmpty(byte[] r0) {
            boolean r0 = isArrayEmpty(r0)
            return r0
    }

    public static boolean isEmpty(char[] r0) {
            boolean r0 = isArrayEmpty(r0)
            return r0
    }

    public static boolean isEmpty(double[] r0) {
            boolean r0 = isArrayEmpty(r0)
            return r0
    }

    public static boolean isEmpty(float[] r0) {
            boolean r0 = isArrayEmpty(r0)
            return r0
    }

    public static boolean isEmpty(int[] r0) {
            boolean r0 = isArrayEmpty(r0)
            return r0
    }

    public static boolean isEmpty(long[] r0) {
            boolean r0 = isArrayEmpty(r0)
            return r0
    }

    public static boolean isEmpty(java.lang.Object[] r0) {
            boolean r0 = isArrayEmpty(r0)
            return r0
    }

    public static boolean isEmpty(short[] r0) {
            boolean r0 = isArrayEmpty(r0)
            return r0
    }

    public static boolean isEmpty(boolean[] r0) {
            boolean r0 = isArrayEmpty(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean isEquals(java.lang.Object r1, java.lang.Object r2) {
            org.apache.commons.lang3.builder.EqualsBuilder r0 = new org.apache.commons.lang3.builder.EqualsBuilder
            r0.<init>()
            org.apache.commons.lang3.builder.EqualsBuilder r1 = r0.append(r1, r2)
            boolean r1 = r1.isEquals()
            return r1
    }

    public static boolean isNotEmpty(byte[] r0) {
            boolean r0 = isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isNotEmpty(char[] r0) {
            boolean r0 = isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isNotEmpty(double[] r0) {
            boolean r0 = isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isNotEmpty(float[] r0) {
            boolean r0 = isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isNotEmpty(int[] r0) {
            boolean r0 = isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isNotEmpty(long[] r0) {
            boolean r0 = isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static <T> boolean isNotEmpty(T[] r0) {
            boolean r0 = isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isNotEmpty(short[] r0) {
            boolean r0 = isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isNotEmpty(boolean[] r0) {
            boolean r0 = isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isSameLength(java.lang.Object r0, java.lang.Object r1) {
            int r0 = getLength(r0)
            int r1 = getLength(r1)
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isSameLength(byte[] r0, byte[] r1) {
            int r0 = getLength(r0)
            int r1 = getLength(r1)
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isSameLength(char[] r0, char[] r1) {
            int r0 = getLength(r0)
            int r1 = getLength(r1)
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isSameLength(double[] r0, double[] r1) {
            int r0 = getLength(r0)
            int r1 = getLength(r1)
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isSameLength(float[] r0, float[] r1) {
            int r0 = getLength(r0)
            int r1 = getLength(r1)
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isSameLength(int[] r0, int[] r1) {
            int r0 = getLength(r0)
            int r1 = getLength(r1)
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isSameLength(long[] r0, long[] r1) {
            int r0 = getLength(r0)
            int r1 = getLength(r1)
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isSameLength(java.lang.Object[] r0, java.lang.Object[] r1) {
            int r0 = getLength(r0)
            int r1 = getLength(r1)
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isSameLength(short[] r0, short[] r1) {
            int r0 = getLength(r0)
            int r1 = getLength(r1)
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isSameLength(boolean[] r0, boolean[] r1) {
            int r0 = getLength(r0)
            int r1 = getLength(r1)
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isSameType(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == 0) goto L19
            if (r1 == 0) goto L19
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            return r0
        L19:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The Array must not be null"
            r0.<init>(r1)
            throw r0
    }

    public static boolean isSorted(byte[] r6) {
            int r0 = getLength(r6)
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto L9
            return r2
        L9:
            r0 = 0
            r1 = r6[r0]
            int r3 = r6.length
            r4 = r2
        Le:
            if (r4 >= r3) goto L1d
            r5 = r6[r4]
            int r1 = org.apache.commons.lang3.math.NumberUtils.compare(r1, r5)
            if (r1 <= 0) goto L19
            return r0
        L19:
            int r4 = r4 + 1
            r1 = r5
            goto Le
        L1d:
            return r2
    }

    public static boolean isSorted(char[] r6) {
            int r0 = getLength(r6)
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto L9
            return r2
        L9:
            r0 = 0
            char r1 = r6[r0]
            int r3 = r6.length
            r4 = r2
        Le:
            if (r4 >= r3) goto L1d
            char r5 = r6[r4]
            int r1 = org.apache.commons.lang3.CharUtils.compare(r1, r5)
            if (r1 <= 0) goto L19
            return r0
        L19:
            int r4 = r4 + 1
            r1 = r5
            goto Le
        L1d:
            return r2
    }

    public static boolean isSorted(double[] r8) {
            int r0 = getLength(r8)
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto L9
            return r2
        L9:
            r0 = 0
            r3 = r8[r0]
            int r1 = r8.length
            r5 = r2
        Le:
            if (r5 >= r1) goto L1d
            r6 = r8[r5]
            int r3 = java.lang.Double.compare(r3, r6)
            if (r3 <= 0) goto L19
            return r0
        L19:
            int r5 = r5 + 1
            r3 = r6
            goto Le
        L1d:
            return r2
    }

    public static boolean isSorted(float[] r6) {
            int r0 = getLength(r6)
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto L9
            return r2
        L9:
            r0 = 0
            r1 = r6[r0]
            int r3 = r6.length
            r4 = r2
        Le:
            if (r4 >= r3) goto L1d
            r5 = r6[r4]
            int r1 = java.lang.Float.compare(r1, r5)
            if (r1 <= 0) goto L19
            return r0
        L19:
            int r4 = r4 + 1
            r1 = r5
            goto Le
        L1d:
            return r2
    }

    public static boolean isSorted(int[] r6) {
            int r0 = getLength(r6)
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto L9
            return r2
        L9:
            r0 = 0
            r1 = r6[r0]
            int r3 = r6.length
            r4 = r2
        Le:
            if (r4 >= r3) goto L1d
            r5 = r6[r4]
            int r1 = org.apache.commons.lang3.math.NumberUtils.compare(r1, r5)
            if (r1 <= 0) goto L19
            return r0
        L19:
            int r4 = r4 + 1
            r1 = r5
            goto Le
        L1d:
            return r2
    }

    public static boolean isSorted(long[] r8) {
            int r0 = getLength(r8)
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto L9
            return r2
        L9:
            r0 = 0
            r3 = r8[r0]
            int r1 = r8.length
            r5 = r2
        Le:
            if (r5 >= r1) goto L1d
            r6 = r8[r5]
            int r3 = org.apache.commons.lang3.math.NumberUtils.compare(r3, r6)
            if (r3 <= 0) goto L19
            return r0
        L19:
            int r5 = r5 + 1
            r3 = r6
            goto Le
        L1d:
            return r2
    }

    public static <T extends java.lang.Comparable<? super T>> boolean isSorted(T[] r1) {
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda10 r0 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda10
            r0.<init>()
            boolean r1 = isSorted(r1, r0)
            return r1
    }

    public static <T> boolean isSorted(T[] r6, java.util.Comparator<T> r7) {
            java.lang.String r0 = "comparator"
            java.util.Objects.requireNonNull(r7, r0)
            int r0 = getLength(r6)
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto Le
            return r2
        Le:
            r0 = 0
            r1 = r6[r0]
            int r3 = r6.length
            r4 = r2
        L13:
            if (r4 >= r3) goto L22
            r5 = r6[r4]
            int r1 = r7.compare(r1, r5)
            if (r1 <= 0) goto L1e
            return r0
        L1e:
            int r4 = r4 + 1
            r1 = r5
            goto L13
        L22:
            return r2
    }

    public static boolean isSorted(short[] r6) {
            int r0 = getLength(r6)
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto L9
            return r2
        L9:
            r0 = 0
            short r1 = r6[r0]
            int r3 = r6.length
            r4 = r2
        Le:
            if (r4 >= r3) goto L1d
            short r5 = r6[r4]
            int r1 = org.apache.commons.lang3.math.NumberUtils.compare(r1, r5)
            if (r1 <= 0) goto L19
            return r0
        L19:
            int r4 = r4 + 1
            r1 = r5
            goto Le
        L1d:
            return r2
    }

    public static boolean isSorted(boolean[] r6) {
            int r0 = getLength(r6)
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto L9
            return r2
        L9:
            r0 = 0
            boolean r1 = r6[r0]
            int r3 = r6.length
            r4 = r2
        Le:
            if (r4 >= r3) goto L1d
            boolean r5 = r6[r4]
            int r1 = org.apache.commons.lang3.BooleanUtils.compare(r1, r5)
            if (r1 <= 0) goto L19
            return r0
        L19:
            int r4 = r4 + 1
            r1 = r5
            goto Le
        L1d:
            return r2
    }

    static /* synthetic */ java.lang.Object lambda$add$0(java.lang.Class r0, int r1) {
            int r1 = r1 + 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            return r0
    }

    static /* synthetic */ java.lang.Object[] lambda$addAll$1(java.lang.Class r0, java.lang.Object[] r1, java.lang.Object[] r2) {
            int r1 = r1.length
            int r2 = r2.length
            int r1 = r1 + r2
            java.lang.Object[] r0 = newInstance(r0, r1)
            return r0
    }

    static /* synthetic */ boolean lambda$containsAny$2(java.lang.Object[] r0, java.lang.Object r1) {
            boolean r0 = contains(r0, r1)
            return r0
    }

    static /* synthetic */ short[] lambda$subarray$10(int r0) {
            short[] r0 = new short[r0]
            return r0
    }

    static /* synthetic */ java.lang.Object[] lambda$subarray$11(java.lang.Class r0, int r1) {
            java.lang.Object[] r0 = newInstance(r0, r1)
            return r0
    }

    static /* synthetic */ boolean[] lambda$subarray$3(int r0) {
            boolean[] r0 = new boolean[r0]
            return r0
    }

    static /* synthetic */ byte[] lambda$subarray$4(int r0) {
            byte[] r0 = new byte[r0]
            return r0
    }

    static /* synthetic */ char[] lambda$subarray$5(int r0) {
            char[] r0 = new char[r0]
            return r0
    }

    static /* synthetic */ double[] lambda$subarray$6(int r0) {
            double[] r0 = new double[r0]
            return r0
    }

    static /* synthetic */ float[] lambda$subarray$7(int r0) {
            float[] r0 = new float[r0]
            return r0
    }

    static /* synthetic */ int[] lambda$subarray$8(int r0) {
            int[] r0 = new int[r0]
            return r0
    }

    static /* synthetic */ long[] lambda$subarray$9(int r0) {
            long[] r0 = new long[r0]
            return r0
    }

    static /* synthetic */ java.lang.Boolean lambda$toObject$12(boolean[] r0, int r1) {
            boolean r0 = r0[r1]
            if (r0 == 0) goto L7
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L9
        L7:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L9:
            return r0
    }

    static /* synthetic */ java.lang.Byte lambda$toObject$13(byte[] r0, int r1) {
            r0 = r0[r1]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Character lambda$toObject$14(char[] r0, int r1) {
            char r0 = r0[r1]
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Double lambda$toObject$15(double[] r2, int r3) {
            r0 = r2[r3]
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
    }

    static /* synthetic */ java.lang.Float lambda$toObject$16(float[] r0, int r1) {
            r0 = r0[r1]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Integer lambda$toObject$17(int[] r0, int r1) {
            r0 = r0[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Long lambda$toObject$18(long[] r2, int r3) {
            r0 = r2[r3]
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
    }

    static /* synthetic */ java.lang.Short lambda$toObject$19(short[] r0, int r1) {
            short r0 = r0[r1]
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
    }

    public static int lastIndexOf(byte[] r1, byte r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = lastIndexOf(r1, r2, r0)
            return r1
    }

    public static int lastIndexOf(byte[] r2, byte r3, int r4) {
            r0 = -1
            if (r2 == 0) goto L16
            if (r4 >= 0) goto L6
            goto L16
        L6:
            int r1 = r2.length
            if (r4 < r1) goto Lc
            int r4 = r2.length
            int r4 = r4 + (-1)
        Lc:
            if (r4 < 0) goto L16
            r1 = r2[r4]
            if (r3 != r1) goto L13
            return r4
        L13:
            int r4 = r4 + (-1)
            goto Lc
        L16:
            return r0
    }

    public static int lastIndexOf(char[] r1, char r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = lastIndexOf(r1, r2, r0)
            return r1
    }

    public static int lastIndexOf(char[] r2, char r3, int r4) {
            r0 = -1
            if (r2 == 0) goto L16
            if (r4 >= 0) goto L6
            goto L16
        L6:
            int r1 = r2.length
            if (r4 < r1) goto Lc
            int r4 = r2.length
            int r4 = r4 + (-1)
        Lc:
            if (r4 < 0) goto L16
            char r1 = r2[r4]
            if (r3 != r1) goto L13
            return r4
        L13:
            int r4 = r4 + (-1)
            goto Lc
        L16:
            return r0
    }

    public static int lastIndexOf(double[] r1, double r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = lastIndexOf(r1, r2, r0)
            return r1
    }

    public static int lastIndexOf(double[] r6, double r7, double r9) {
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0 = r6
            r1 = r7
            r4 = r9
            int r6 = lastIndexOf(r0, r1, r3, r4)
            return r6
    }

    public static int lastIndexOf(double[] r4, double r5, int r7) {
            boolean r0 = isEmpty(r4)
            r1 = -1
            if (r0 != 0) goto L1c
            if (r7 >= 0) goto La
            goto L1c
        La:
            int r0 = r4.length
            if (r7 < r0) goto L10
            int r7 = r4.length
            int r7 = r7 + (-1)
        L10:
            if (r7 < 0) goto L1c
            r2 = r4[r7]
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L19
            return r7
        L19:
            int r7 = r7 + (-1)
            goto L10
        L1c:
            return r1
    }

    public static int lastIndexOf(double[] r4, double r5, int r7, double r8) {
            boolean r0 = isEmpty(r4)
            r1 = -1
            if (r0 != 0) goto L23
            if (r7 >= 0) goto La
            goto L23
        La:
            int r0 = r4.length
            if (r7 < r0) goto L10
            int r7 = r4.length
            int r7 = r7 + (-1)
        L10:
            double r2 = r5 - r8
            double r5 = r5 + r8
        L13:
            if (r7 < 0) goto L23
            r8 = r4[r7]
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 < 0) goto L20
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 > 0) goto L20
            return r7
        L20:
            int r7 = r7 + (-1)
            goto L13
        L23:
            return r1
    }

    public static int lastIndexOf(float[] r1, float r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = lastIndexOf(r1, r2, r0)
            return r1
    }

    public static int lastIndexOf(float[] r2, float r3, int r4) {
            boolean r0 = isEmpty(r2)
            r1 = -1
            if (r0 != 0) goto L1c
            if (r4 >= 0) goto La
            goto L1c
        La:
            int r0 = r2.length
            if (r4 < r0) goto L10
            int r4 = r2.length
            int r4 = r4 + (-1)
        L10:
            if (r4 < 0) goto L1c
            r0 = r2[r4]
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L19
            return r4
        L19:
            int r4 = r4 + (-1)
            goto L10
        L1c:
            return r1
    }

    public static int lastIndexOf(int[] r1, int r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = lastIndexOf(r1, r2, r0)
            return r1
    }

    public static int lastIndexOf(int[] r2, int r3, int r4) {
            r0 = -1
            if (r2 == 0) goto L16
            if (r4 >= 0) goto L6
            goto L16
        L6:
            int r1 = r2.length
            if (r4 < r1) goto Lc
            int r4 = r2.length
            int r4 = r4 + (-1)
        Lc:
            if (r4 < 0) goto L16
            r1 = r2[r4]
            if (r3 != r1) goto L13
            return r4
        L13:
            int r4 = r4 + (-1)
            goto Lc
        L16:
            return r0
    }

    public static int lastIndexOf(long[] r1, long r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = lastIndexOf(r1, r2, r0)
            return r1
    }

    public static int lastIndexOf(long[] r3, long r4, int r6) {
            r0 = -1
            if (r3 == 0) goto L18
            if (r6 >= 0) goto L6
            goto L18
        L6:
            int r1 = r3.length
            if (r6 < r1) goto Lc
            int r6 = r3.length
            int r6 = r6 + (-1)
        Lc:
            if (r6 < 0) goto L18
            r1 = r3[r6]
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L15
            return r6
        L15:
            int r6 = r6 + (-1)
            goto Lc
        L18:
            return r0
    }

    public static int lastIndexOf(java.lang.Object[] r1, java.lang.Object r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = lastIndexOf(r1, r2, r0)
            return r1
    }

    public static int lastIndexOf(java.lang.Object[] r2, java.lang.Object r3, int r4) {
            r0 = -1
            if (r2 == 0) goto L34
            if (r4 >= 0) goto L6
            goto L34
        L6:
            int r1 = r2.length
            if (r4 < r1) goto Lc
            int r4 = r2.length
            int r4 = r4 + (-1)
        Lc:
            if (r3 != 0) goto L18
        Le:
            if (r4 < 0) goto L34
            r3 = r2[r4]
            if (r3 != 0) goto L15
            return r4
        L15:
            int r4 = r4 + (-1)
            goto Le
        L18:
            java.lang.Class r1 = r2.getClass()
            java.lang.Class r1 = r1.getComponentType()
            boolean r1 = r1.isInstance(r3)
            if (r1 == 0) goto L34
        L26:
            if (r4 < 0) goto L34
            r1 = r2[r4]
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L31
            return r4
        L31:
            int r4 = r4 + (-1)
            goto L26
        L34:
            return r0
    }

    public static int lastIndexOf(short[] r1, short r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = lastIndexOf(r1, r2, r0)
            return r1
    }

    public static int lastIndexOf(short[] r2, short r3, int r4) {
            r0 = -1
            if (r2 == 0) goto L16
            if (r4 >= 0) goto L6
            goto L16
        L6:
            int r1 = r2.length
            if (r4 < r1) goto Lc
            int r4 = r2.length
            int r4 = r4 + (-1)
        Lc:
            if (r4 < 0) goto L16
            short r1 = r2[r4]
            if (r3 != r1) goto L13
            return r4
        L13:
            int r4 = r4 + (-1)
            goto Lc
        L16:
            return r0
    }

    public static int lastIndexOf(boolean[] r1, boolean r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = lastIndexOf(r1, r2, r0)
            return r1
    }

    public static int lastIndexOf(boolean[] r2, boolean r3, int r4) {
            boolean r0 = isEmpty(r2)
            r1 = -1
            if (r0 != 0) goto L1a
            if (r4 >= 0) goto La
            goto L1a
        La:
            int r0 = r2.length
            if (r4 < r0) goto L10
            int r4 = r2.length
            int r4 = r4 + (-1)
        L10:
            if (r4 < 0) goto L1a
            boolean r0 = r2[r4]
            if (r3 != r0) goto L17
            return r4
        L17:
            int r4 = r4 + (-1)
            goto L10
        L1a:
            return r1
    }

    private static int max0(int r1) {
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }

    public static <T> T[] newInstance(java.lang.Class<T> r0, int r1) {
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    public static <T> T[] nullTo(T[] r1, T[] r2) {
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto L7
            r1 = r2
        L7:
            return r1
    }

    public static byte[] nullToEmpty(byte[] r1) {
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto L8
            byte[] r1 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY
        L8:
            return r1
    }

    public static char[] nullToEmpty(char[] r1) {
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto L8
            char[] r1 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY
        L8:
            return r1
    }

    public static double[] nullToEmpty(double[] r1) {
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto L8
            double[] r1 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY
        L8:
            return r1
    }

    public static float[] nullToEmpty(float[] r1) {
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto L8
            float[] r1 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY
        L8:
            return r1
    }

    public static int[] nullToEmpty(int[] r1) {
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto L8
            int[] r1 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY
        L8:
            return r1
    }

    public static long[] nullToEmpty(long[] r1) {
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto L8
            long[] r1 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY
        L8:
            return r1
    }

    public static java.lang.Boolean[] nullToEmpty(java.lang.Boolean[] r1) {
            java.lang.Boolean[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY
            java.lang.Object[] r1 = nullTo(r1, r0)
            java.lang.Boolean[] r1 = (java.lang.Boolean[]) r1
            return r1
    }

    public static java.lang.Byte[] nullToEmpty(java.lang.Byte[] r1) {
            java.lang.Byte[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY
            java.lang.Object[] r1 = nullTo(r1, r0)
            java.lang.Byte[] r1 = (java.lang.Byte[]) r1
            return r1
    }

    public static java.lang.Character[] nullToEmpty(java.lang.Character[] r1) {
            java.lang.Character[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY
            java.lang.Object[] r1 = nullTo(r1, r0)
            java.lang.Character[] r1 = (java.lang.Character[]) r1
            return r1
    }

    public static java.lang.Class<?>[] nullToEmpty(java.lang.Class<?>[] r1) {
            java.lang.Class<?>[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CLASS_ARRAY
            java.lang.Object[] r1 = nullTo(r1, r0)
            java.lang.Class[] r1 = (java.lang.Class[]) r1
            return r1
    }

    public static java.lang.Double[] nullToEmpty(java.lang.Double[] r1) {
            java.lang.Double[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY
            java.lang.Object[] r1 = nullTo(r1, r0)
            java.lang.Double[] r1 = (java.lang.Double[]) r1
            return r1
    }

    public static java.lang.Float[] nullToEmpty(java.lang.Float[] r1) {
            java.lang.Float[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY
            java.lang.Object[] r1 = nullTo(r1, r0)
            java.lang.Float[] r1 = (java.lang.Float[]) r1
            return r1
    }

    public static java.lang.Integer[] nullToEmpty(java.lang.Integer[] r1) {
            java.lang.Integer[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY
            java.lang.Object[] r1 = nullTo(r1, r0)
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1
            return r1
    }

    public static java.lang.Long[] nullToEmpty(java.lang.Long[] r1) {
            java.lang.Long[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY
            java.lang.Object[] r1 = nullTo(r1, r0)
            java.lang.Long[] r1 = (java.lang.Long[]) r1
            return r1
    }

    public static java.lang.Object[] nullToEmpty(java.lang.Object[] r1) {
            java.lang.Object[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY
            java.lang.Object[] r1 = nullTo(r1, r0)
            return r1
    }

    public static <T> T[] nullToEmpty(T[] r1, java.lang.Class<T[]> r2) {
            if (r2 == 0) goto L14
            if (r1 != 0) goto L13
            java.lang.Class r1 = r2.getComponentType()
            r0 = 0
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r0)
            java.lang.Object r1 = r2.cast(r1)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
        L13:
            return r1
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The type must not be null"
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.Short[] nullToEmpty(java.lang.Short[] r1) {
            java.lang.Short[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY
            java.lang.Object[] r1 = nullTo(r1, r0)
            java.lang.Short[] r1 = (java.lang.Short[]) r1
            return r1
    }

    public static java.lang.String[] nullToEmpty(java.lang.String[] r1) {
            java.lang.String[] r0 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            java.lang.Object[] r1 = nullTo(r1, r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            return r1
    }

    public static short[] nullToEmpty(short[] r1) {
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto L8
            short[] r1 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY
        L8:
            return r1
    }

    public static boolean[] nullToEmpty(boolean[] r1) {
            boolean r0 = isEmpty(r1)
            if (r0 == 0) goto L8
            boolean[] r1 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY
        L8:
            return r1
    }

    private static java.util.concurrent.ThreadLocalRandom random() {
            java.util.concurrent.ThreadLocalRandom r0 = java.util.concurrent.ThreadLocalRandom.current()
            return r0
    }

    private static java.lang.Object remove(java.lang.Object r4, int r5) {
            int r0 = getLength(r4)
            if (r5 < 0) goto L25
            if (r5 >= r0) goto L25
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r1 = r1.getComponentType()
            int r2 = r0 + (-1)
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            r3 = 0
            java.lang.System.arraycopy(r4, r3, r1, r3, r5)
            if (r5 >= r2) goto L24
            int r2 = r5 + 1
            int r0 = r0 - r5
            int r0 = r0 + (-1)
            java.lang.System.arraycopy(r4, r2, r1, r5, r0)
        L24:
            return r1
        L25:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Index: "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = ", Length: "
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public static byte[] remove(byte[] r0, int r1) {
            java.lang.Object r0 = remove(r0, r1)
            byte[] r0 = (byte[]) r0
            return r0
    }

    public static char[] remove(char[] r0, int r1) {
            java.lang.Object r0 = remove(r0, r1)
            char[] r0 = (char[]) r0
            return r0
    }

    public static double[] remove(double[] r0, int r1) {
            java.lang.Object r0 = remove(r0, r1)
            double[] r0 = (double[]) r0
            return r0
    }

    public static float[] remove(float[] r0, int r1) {
            java.lang.Object r0 = remove(r0, r1)
            float[] r0 = (float[]) r0
            return r0
    }

    public static int[] remove(int[] r0, int r1) {
            java.lang.Object r0 = remove(r0, r1)
            int[] r0 = (int[]) r0
            return r0
    }

    public static long[] remove(long[] r0, int r1) {
            java.lang.Object r0 = remove(r0, r1)
            long[] r0 = (long[]) r0
            return r0
    }

    public static <T> T[] remove(T[] r0, int r1) {
            java.lang.Object r0 = remove(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    public static short[] remove(short[] r0, int r1) {
            java.lang.Object r0 = remove(r0, r1)
            short[] r0 = (short[]) r0
            return r0
    }

    public static boolean[] remove(boolean[] r0, int r1) {
            java.lang.Object r0 = remove(r0, r1)
            boolean[] r0 = (boolean[]) r0
            return r0
    }

    static java.lang.Object removeAll(java.lang.Object r6, java.util.BitSet r7) {
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            int r0 = getLength(r6)
            int r1 = r7.cardinality()
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r2 = r2.getComponentType()
            int r1 = r0 - r1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r1)
            r2 = 0
            r3 = r2
        L1c:
            int r4 = r7.nextSetBit(r2)
            r5 = -1
            if (r4 == r5) goto L30
            int r5 = r4 - r2
            if (r5 <= 0) goto L2b
            java.lang.System.arraycopy(r6, r2, r1, r3, r5)
            int r3 = r3 + r5
        L2b:
            int r2 = r7.nextClearBit(r4)
            goto L1c
        L30:
            int r0 = r0 - r2
            if (r0 <= 0) goto L36
            java.lang.System.arraycopy(r6, r2, r1, r3, r0)
        L36:
            return r1
    }

    static java.lang.Object removeAll(java.lang.Object r8, int... r9) {
            if (r8 != 0) goto L4
            r8 = 0
            return r8
        L4:
            int r0 = getLength(r8)
            int[] r9 = clone(r9)
            int[] r9 = org.apache.commons.lang3.ArraySorter.sort(r9)
            boolean r1 = isNotEmpty(r9)
            r2 = 0
            if (r1 == 0) goto L4a
            int r1 = r9.length
            r4 = r0
            r3 = r2
        L1a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L4b
            r5 = r9[r1]
            if (r5 < 0) goto L2b
            if (r5 >= r0) goto L2b
            if (r5 < r4) goto L27
            goto L1a
        L27:
            int r3 = r3 + 1
            r4 = r5
            goto L1a
        L2b:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Index: "
            r9.<init>(r1)
            java.lang.StringBuilder r9 = r9.append(r5)
            java.lang.String r1 = ", Length: "
            java.lang.StringBuilder r9 = r9.append(r1)
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L4a:
            r3 = r2
        L4b:
            java.lang.Class r1 = r8.getClass()
            java.lang.Class r1 = r1.getComponentType()
            int r4 = r0 - r3
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r4)
            if (r3 >= r0) goto L78
            if (r9 == 0) goto L78
            int r3 = r9.length
            r5 = 1
            int r3 = r3 - r5
        L60:
            if (r3 < 0) goto L73
            r6 = r9[r3]
            int r0 = r0 - r6
            if (r0 <= r5) goto L6f
            int r0 = r0 + (-1)
            int r4 = r4 - r0
            int r7 = r6 + 1
            java.lang.System.arraycopy(r8, r7, r1, r4, r0)
        L6f:
            int r3 = r3 + (-1)
            r0 = r6
            goto L60
        L73:
            if (r0 <= 0) goto L78
            java.lang.System.arraycopy(r8, r2, r1, r2, r0)
        L78:
            return r1
    }

    public static byte[] removeAll(byte[] r0, int... r1) {
            java.lang.Object r0 = removeAll(r0, r1)
            byte[] r0 = (byte[]) r0
            return r0
    }

    public static char[] removeAll(char[] r0, int... r1) {
            java.lang.Object r0 = removeAll(r0, r1)
            char[] r0 = (char[]) r0
            return r0
    }

    public static double[] removeAll(double[] r0, int... r1) {
            java.lang.Object r0 = removeAll(r0, r1)
            double[] r0 = (double[]) r0
            return r0
    }

    public static float[] removeAll(float[] r0, int... r1) {
            java.lang.Object r0 = removeAll(r0, r1)
            float[] r0 = (float[]) r0
            return r0
    }

    public static int[] removeAll(int[] r0, int... r1) {
            java.lang.Object r0 = removeAll(r0, r1)
            int[] r0 = (int[]) r0
            return r0
    }

    public static long[] removeAll(long[] r0, int... r1) {
            java.lang.Object r0 = removeAll(r0, r1)
            long[] r0 = (long[]) r0
            return r0
    }

    public static <T> T[] removeAll(T[] r0, int... r1) {
            java.lang.Object r0 = removeAll(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    public static short[] removeAll(short[] r0, int... r1) {
            java.lang.Object r0 = removeAll(r0, r1)
            short[] r0 = (short[]) r0
            return r0
    }

    public static boolean[] removeAll(boolean[] r0, int... r1) {
            java.lang.Object r0 = removeAll(r0, r1)
            boolean[] r0 = (boolean[]) r0
            return r0
    }

    @java.lang.Deprecated
    public static byte[] removeAllOccurences(byte[] r0, byte r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            byte[] r0 = (byte[]) r0
            return r0
    }

    @java.lang.Deprecated
    public static char[] removeAllOccurences(char[] r0, char r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            char[] r0 = (char[]) r0
            return r0
    }

    @java.lang.Deprecated
    public static double[] removeAllOccurences(double[] r0, double r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            double[] r0 = (double[]) r0
            return r0
    }

    @java.lang.Deprecated
    public static float[] removeAllOccurences(float[] r0, float r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            float[] r0 = (float[]) r0
            return r0
    }

    @java.lang.Deprecated
    public static int[] removeAllOccurences(int[] r0, int r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            int[] r0 = (int[]) r0
            return r0
    }

    @java.lang.Deprecated
    public static long[] removeAllOccurences(long[] r0, long r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            long[] r0 = (long[]) r0
            return r0
    }

    @java.lang.Deprecated
    public static <T> T[] removeAllOccurences(T[] r0, T r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    @java.lang.Deprecated
    public static short[] removeAllOccurences(short[] r0, short r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            short[] r0 = (short[]) r0
            return r0
    }

    @java.lang.Deprecated
    public static boolean[] removeAllOccurences(boolean[] r0, boolean r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            boolean[] r0 = (boolean[]) r0
            return r0
    }

    public static byte[] removeAllOccurrences(byte[] r0, byte r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            byte[] r0 = (byte[]) r0
            return r0
    }

    public static char[] removeAllOccurrences(char[] r0, char r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            char[] r0 = (char[]) r0
            return r0
    }

    public static double[] removeAllOccurrences(double[] r0, double r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            double[] r0 = (double[]) r0
            return r0
    }

    public static float[] removeAllOccurrences(float[] r0, float r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            float[] r0 = (float[]) r0
            return r0
    }

    public static int[] removeAllOccurrences(int[] r0, int r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            int[] r0 = (int[]) r0
            return r0
    }

    public static long[] removeAllOccurrences(long[] r0, long r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            long[] r0 = (long[]) r0
            return r0
    }

    public static <T> T[] removeAllOccurrences(T[] r0, T r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    public static short[] removeAllOccurrences(short[] r0, short r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            short[] r0 = (short[]) r0
            return r0
    }

    public static boolean[] removeAllOccurrences(boolean[] r0, boolean r1) {
            java.util.BitSet r1 = indexesOf(r0, r1)
            java.lang.Object r0 = removeAll(r0, r1)
            boolean[] r0 = (boolean[]) r0
            return r0
    }

    public static byte[] removeElement(byte[] r1, byte r2) {
            int r2 = indexOf(r1, r2)
            r0 = -1
            if (r2 != r0) goto Lc
            byte[] r1 = clone(r1)
            goto L10
        Lc:
            byte[] r1 = remove(r1, r2)
        L10:
            return r1
    }

    public static char[] removeElement(char[] r1, char r2) {
            int r2 = indexOf(r1, r2)
            r0 = -1
            if (r2 != r0) goto Lc
            char[] r1 = clone(r1)
            goto L10
        Lc:
            char[] r1 = remove(r1, r2)
        L10:
            return r1
    }

    public static double[] removeElement(double[] r0, double r1) {
            int r1 = indexOf(r0, r1)
            r2 = -1
            if (r1 != r2) goto Lc
            double[] r0 = clone(r0)
            goto L10
        Lc:
            double[] r0 = remove(r0, r1)
        L10:
            return r0
    }

    public static float[] removeElement(float[] r1, float r2) {
            int r2 = indexOf(r1, r2)
            r0 = -1
            if (r2 != r0) goto Lc
            float[] r1 = clone(r1)
            goto L10
        Lc:
            float[] r1 = remove(r1, r2)
        L10:
            return r1
    }

    public static int[] removeElement(int[] r1, int r2) {
            int r2 = indexOf(r1, r2)
            r0 = -1
            if (r2 != r0) goto Lc
            int[] r1 = clone(r1)
            goto L10
        Lc:
            int[] r1 = remove(r1, r2)
        L10:
            return r1
    }

    public static long[] removeElement(long[] r0, long r1) {
            int r1 = indexOf(r0, r1)
            r2 = -1
            if (r1 != r2) goto Lc
            long[] r0 = clone(r0)
            goto L10
        Lc:
            long[] r0 = remove(r0, r1)
        L10:
            return r0
    }

    public static <T> T[] removeElement(T[] r1, java.lang.Object r2) {
            int r2 = indexOf(r1, r2)
            r0 = -1
            if (r2 != r0) goto Lc
            java.lang.Object[] r1 = clone(r1)
            goto L10
        Lc:
            java.lang.Object[] r1 = remove(r1, r2)
        L10:
            return r1
    }

    public static short[] removeElement(short[] r1, short r2) {
            int r2 = indexOf(r1, r2)
            r0 = -1
            if (r2 != r0) goto Lc
            short[] r1 = clone(r1)
            goto L10
        Lc:
            short[] r1 = remove(r1, r2)
        L10:
            return r1
    }

    public static boolean[] removeElement(boolean[] r1, boolean r2) {
            int r2 = indexOf(r1, r2)
            r0 = -1
            if (r2 != r0) goto Lc
            boolean[] r1 = clone(r1)
            goto L10
        Lc:
            boolean[] r1 = remove(r1, r2)
        L10:
            return r1
    }

    public static byte[] removeElements(byte[] r7, byte... r8) {
            boolean r0 = isEmpty(r7)
            if (r0 != 0) goto L66
            boolean r0 = isEmpty(r8)
            if (r0 == 0) goto Ld
            goto L66
        Ld:
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L16:
            if (r3 >= r1) goto L36
            r4 = r8[r3]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            java.lang.Object r5 = r0.get(r4)
            org.apache.commons.lang3.mutable.MutableInt r5 = (org.apache.commons.lang3.mutable.MutableInt) r5
            if (r5 != 0) goto L30
            org.apache.commons.lang3.mutable.MutableInt r5 = new org.apache.commons.lang3.mutable.MutableInt
            r6 = 1
            r5.<init>(r6)
            r0.put(r4, r5)
            goto L33
        L30:
            r5.increment()
        L33:
            int r3 = r3 + 1
            goto L16
        L36:
            java.util.BitSet r8 = new java.util.BitSet
            r8.<init>()
        L3b:
            int r1 = r7.length
            if (r2 >= r1) goto L5f
            r1 = r7[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r1)
            java.lang.Object r3 = r0.get(r3)
            org.apache.commons.lang3.mutable.MutableInt r3 = (org.apache.commons.lang3.mutable.MutableInt) r3
            if (r3 == 0) goto L5c
            int r3 = r3.decrementAndGet()
            if (r3 != 0) goto L59
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r0.remove(r1)
        L59:
            r8.set(r2)
        L5c:
            int r2 = r2 + 1
            goto L3b
        L5f:
            java.lang.Object r7 = removeAll(r7, r8)
            byte[] r7 = (byte[]) r7
            return r7
        L66:
            byte[] r7 = clone(r7)
            return r7
    }

    public static char[] removeElements(char[] r7, char... r8) {
            boolean r0 = isEmpty(r7)
            if (r0 != 0) goto L66
            boolean r0 = isEmpty(r8)
            if (r0 == 0) goto Ld
            goto L66
        Ld:
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L16:
            if (r3 >= r1) goto L36
            char r4 = r8[r3]
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Object r5 = r0.get(r4)
            org.apache.commons.lang3.mutable.MutableInt r5 = (org.apache.commons.lang3.mutable.MutableInt) r5
            if (r5 != 0) goto L30
            org.apache.commons.lang3.mutable.MutableInt r5 = new org.apache.commons.lang3.mutable.MutableInt
            r6 = 1
            r5.<init>(r6)
            r0.put(r4, r5)
            goto L33
        L30:
            r5.increment()
        L33:
            int r3 = r3 + 1
            goto L16
        L36:
            java.util.BitSet r8 = new java.util.BitSet
            r8.<init>()
        L3b:
            int r1 = r7.length
            if (r2 >= r1) goto L5f
            char r1 = r7[r2]
            java.lang.Character r3 = java.lang.Character.valueOf(r1)
            java.lang.Object r3 = r0.get(r3)
            org.apache.commons.lang3.mutable.MutableInt r3 = (org.apache.commons.lang3.mutable.MutableInt) r3
            if (r3 == 0) goto L5c
            int r3 = r3.decrementAndGet()
            if (r3 != 0) goto L59
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r0.remove(r1)
        L59:
            r8.set(r2)
        L5c:
            int r2 = r2 + 1
            goto L3b
        L5f:
            java.lang.Object r7 = removeAll(r7, r8)
            char[] r7 = (char[]) r7
            return r7
        L66:
            char[] r7 = clone(r7)
            return r7
    }

    public static double[] removeElements(double[] r7, double... r8) {
            boolean r0 = isEmpty(r7)
            if (r0 != 0) goto L66
            boolean r0 = isEmpty(r8)
            if (r0 == 0) goto Ld
            goto L66
        Ld:
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L16:
            if (r3 >= r1) goto L36
            r4 = r8[r3]
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object r5 = r0.get(r4)
            org.apache.commons.lang3.mutable.MutableInt r5 = (org.apache.commons.lang3.mutable.MutableInt) r5
            if (r5 != 0) goto L30
            org.apache.commons.lang3.mutable.MutableInt r5 = new org.apache.commons.lang3.mutable.MutableInt
            r6 = 1
            r5.<init>(r6)
            r0.put(r4, r5)
            goto L33
        L30:
            r5.increment()
        L33:
            int r3 = r3 + 1
            goto L16
        L36:
            java.util.BitSet r8 = new java.util.BitSet
            r8.<init>()
        L3b:
            int r1 = r7.length
            if (r2 >= r1) goto L5f
            r3 = r7[r2]
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            java.lang.Object r1 = r0.get(r1)
            org.apache.commons.lang3.mutable.MutableInt r1 = (org.apache.commons.lang3.mutable.MutableInt) r1
            if (r1 == 0) goto L5c
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L59
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r0.remove(r1)
        L59:
            r8.set(r2)
        L5c:
            int r2 = r2 + 1
            goto L3b
        L5f:
            java.lang.Object r7 = removeAll(r7, r8)
            double[] r7 = (double[]) r7
            return r7
        L66:
            double[] r7 = clone(r7)
            return r7
    }

    public static float[] removeElements(float[] r7, float... r8) {
            boolean r0 = isEmpty(r7)
            if (r0 != 0) goto L66
            boolean r0 = isEmpty(r8)
            if (r0 == 0) goto Ld
            goto L66
        Ld:
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L16:
            if (r3 >= r1) goto L36
            r4 = r8[r3]
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object r5 = r0.get(r4)
            org.apache.commons.lang3.mutable.MutableInt r5 = (org.apache.commons.lang3.mutable.MutableInt) r5
            if (r5 != 0) goto L30
            org.apache.commons.lang3.mutable.MutableInt r5 = new org.apache.commons.lang3.mutable.MutableInt
            r6 = 1
            r5.<init>(r6)
            r0.put(r4, r5)
            goto L33
        L30:
            r5.increment()
        L33:
            int r3 = r3 + 1
            goto L16
        L36:
            java.util.BitSet r8 = new java.util.BitSet
            r8.<init>()
        L3b:
            int r1 = r7.length
            if (r2 >= r1) goto L5f
            r1 = r7[r2]
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            java.lang.Object r3 = r0.get(r3)
            org.apache.commons.lang3.mutable.MutableInt r3 = (org.apache.commons.lang3.mutable.MutableInt) r3
            if (r3 == 0) goto L5c
            int r3 = r3.decrementAndGet()
            if (r3 != 0) goto L59
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0.remove(r1)
        L59:
            r8.set(r2)
        L5c:
            int r2 = r2 + 1
            goto L3b
        L5f:
            java.lang.Object r7 = removeAll(r7, r8)
            float[] r7 = (float[]) r7
            return r7
        L66:
            float[] r7 = clone(r7)
            return r7
    }

    public static int[] removeElements(int[] r7, int... r8) {
            boolean r0 = isEmpty(r7)
            if (r0 != 0) goto L66
            boolean r0 = isEmpty(r8)
            if (r0 == 0) goto Ld
            goto L66
        Ld:
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L16:
            if (r3 >= r1) goto L36
            r4 = r8[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r0.get(r4)
            org.apache.commons.lang3.mutable.MutableInt r5 = (org.apache.commons.lang3.mutable.MutableInt) r5
            if (r5 != 0) goto L30
            org.apache.commons.lang3.mutable.MutableInt r5 = new org.apache.commons.lang3.mutable.MutableInt
            r6 = 1
            r5.<init>(r6)
            r0.put(r4, r5)
            goto L33
        L30:
            r5.increment()
        L33:
            int r3 = r3 + 1
            goto L16
        L36:
            java.util.BitSet r8 = new java.util.BitSet
            r8.<init>()
        L3b:
            int r1 = r7.length
            if (r2 >= r1) goto L5f
            r1 = r7[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r0.get(r3)
            org.apache.commons.lang3.mutable.MutableInt r3 = (org.apache.commons.lang3.mutable.MutableInt) r3
            if (r3 == 0) goto L5c
            int r3 = r3.decrementAndGet()
            if (r3 != 0) goto L59
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.remove(r1)
        L59:
            r8.set(r2)
        L5c:
            int r2 = r2 + 1
            goto L3b
        L5f:
            java.lang.Object r7 = removeAll(r7, r8)
            int[] r7 = (int[]) r7
            return r7
        L66:
            int[] r7 = clone(r7)
            return r7
    }

    public static long[] removeElements(long[] r7, long... r8) {
            boolean r0 = isEmpty(r7)
            if (r0 != 0) goto L66
            boolean r0 = isEmpty(r8)
            if (r0 == 0) goto Ld
            goto L66
        Ld:
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L16:
            if (r3 >= r1) goto L36
            r4 = r8[r3]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r5 = r0.get(r4)
            org.apache.commons.lang3.mutable.MutableInt r5 = (org.apache.commons.lang3.mutable.MutableInt) r5
            if (r5 != 0) goto L30
            org.apache.commons.lang3.mutable.MutableInt r5 = new org.apache.commons.lang3.mutable.MutableInt
            r6 = 1
            r5.<init>(r6)
            r0.put(r4, r5)
            goto L33
        L30:
            r5.increment()
        L33:
            int r3 = r3 + 1
            goto L16
        L36:
            java.util.BitSet r8 = new java.util.BitSet
            r8.<init>()
        L3b:
            int r1 = r7.length
            if (r2 >= r1) goto L5f
            r3 = r7[r2]
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Object r1 = r0.get(r1)
            org.apache.commons.lang3.mutable.MutableInt r1 = (org.apache.commons.lang3.mutable.MutableInt) r1
            if (r1 == 0) goto L5c
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L59
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r0.remove(r1)
        L59:
            r8.set(r2)
        L5c:
            int r2 = r2 + 1
            goto L3b
        L5f:
            java.lang.Object r7 = removeAll(r7, r8)
            long[] r7 = (long[]) r7
            return r7
        L66:
            long[] r7 = clone(r7)
            return r7
    }

    @java.lang.SafeVarargs
    public static <T> T[] removeElements(T[] r7, T... r8) {
            boolean r0 = isEmpty(r7)
            if (r0 != 0) goto L5a
            boolean r0 = isEmpty(r8)
            if (r0 == 0) goto Ld
            goto L5a
        Ld:
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L16:
            if (r3 >= r1) goto L32
            r4 = r8[r3]
            java.lang.Object r5 = r0.get(r4)
            org.apache.commons.lang3.mutable.MutableInt r5 = (org.apache.commons.lang3.mutable.MutableInt) r5
            if (r5 != 0) goto L2c
            org.apache.commons.lang3.mutable.MutableInt r5 = new org.apache.commons.lang3.mutable.MutableInt
            r6 = 1
            r5.<init>(r6)
            r0.put(r4, r5)
            goto L2f
        L2c:
            r5.increment()
        L2f:
            int r3 = r3 + 1
            goto L16
        L32:
            java.util.BitSet r8 = new java.util.BitSet
            r8.<init>()
        L37:
            int r1 = r7.length
            if (r2 >= r1) goto L53
            r1 = r7[r2]
            java.lang.Object r3 = r0.get(r1)
            org.apache.commons.lang3.mutable.MutableInt r3 = (org.apache.commons.lang3.mutable.MutableInt) r3
            if (r3 == 0) goto L50
            int r3 = r3.decrementAndGet()
            if (r3 != 0) goto L4d
            r0.remove(r1)
        L4d:
            r8.set(r2)
        L50:
            int r2 = r2 + 1
            goto L37
        L53:
            java.lang.Object r7 = removeAll(r7, r8)
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            return r7
        L5a:
            java.lang.Object[] r7 = clone(r7)
            return r7
    }

    public static short[] removeElements(short[] r7, short... r8) {
            boolean r0 = isEmpty(r7)
            if (r0 != 0) goto L66
            boolean r0 = isEmpty(r8)
            if (r0 == 0) goto Ld
            goto L66
        Ld:
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r8.length
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L16:
            if (r3 >= r1) goto L36
            short r4 = r8[r3]
            java.lang.Short r4 = java.lang.Short.valueOf(r4)
            java.lang.Object r5 = r0.get(r4)
            org.apache.commons.lang3.mutable.MutableInt r5 = (org.apache.commons.lang3.mutable.MutableInt) r5
            if (r5 != 0) goto L30
            org.apache.commons.lang3.mutable.MutableInt r5 = new org.apache.commons.lang3.mutable.MutableInt
            r6 = 1
            r5.<init>(r6)
            r0.put(r4, r5)
            goto L33
        L30:
            r5.increment()
        L33:
            int r3 = r3 + 1
            goto L16
        L36:
            java.util.BitSet r8 = new java.util.BitSet
            r8.<init>()
        L3b:
            int r1 = r7.length
            if (r2 >= r1) goto L5f
            short r1 = r7[r2]
            java.lang.Short r3 = java.lang.Short.valueOf(r1)
            java.lang.Object r3 = r0.get(r3)
            org.apache.commons.lang3.mutable.MutableInt r3 = (org.apache.commons.lang3.mutable.MutableInt) r3
            if (r3 == 0) goto L5c
            int r3 = r3.decrementAndGet()
            if (r3 != 0) goto L59
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            r0.remove(r1)
        L59:
            r8.set(r2)
        L5c:
            int r2 = r2 + 1
            goto L3b
        L5f:
            java.lang.Object r7 = removeAll(r7, r8)
            short[] r7 = (short[]) r7
            return r7
        L66:
            short[] r7 = clone(r7)
            return r7
    }

    public static boolean[] removeElements(boolean[] r7, boolean... r8) {
            boolean r0 = isEmpty(r7)
            if (r0 != 0) goto L66
            boolean r0 = isEmpty(r8)
            if (r0 == 0) goto Ld
            goto L66
        Ld:
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 2
            r0.<init>(r1)
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L16:
            if (r3 >= r1) goto L36
            boolean r4 = r8[r3]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r5 = r0.get(r4)
            org.apache.commons.lang3.mutable.MutableInt r5 = (org.apache.commons.lang3.mutable.MutableInt) r5
            if (r5 != 0) goto L30
            org.apache.commons.lang3.mutable.MutableInt r5 = new org.apache.commons.lang3.mutable.MutableInt
            r6 = 1
            r5.<init>(r6)
            r0.put(r4, r5)
            goto L33
        L30:
            r5.increment()
        L33:
            int r3 = r3 + 1
            goto L16
        L36:
            java.util.BitSet r8 = new java.util.BitSet
            r8.<init>()
        L3b:
            int r1 = r7.length
            if (r2 >= r1) goto L5f
            boolean r1 = r7[r2]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r3 = r0.get(r3)
            org.apache.commons.lang3.mutable.MutableInt r3 = (org.apache.commons.lang3.mutable.MutableInt) r3
            if (r3 == 0) goto L5c
            int r3 = r3.decrementAndGet()
            if (r3 != 0) goto L59
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.remove(r1)
        L59:
            r8.set(r2)
        L5c:
            int r2 = r2 + 1
            goto L3b
        L5f:
            java.lang.Object r7 = removeAll(r7, r8)
            boolean[] r7 = (boolean[]) r7
            return r7
        L66:
            boolean[] r7 = clone(r7)
            return r7
    }

    public static void reverse(byte[] r2) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            reverse(r2, r0, r1)
        L7:
            return
    }

    public static void reverse(byte[] r2, int r3, int r4) {
            if (r2 != 0) goto L3
            return
        L3:
            r0 = 0
            int r3 = java.lang.Math.max(r3, r0)
            int r0 = r2.length
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + (-1)
        Lf:
            if (r4 <= r3) goto L1e
            r0 = r2[r4]
            r1 = r2[r3]
            r2[r4] = r1
            r2[r3] = r0
            int r4 = r4 + (-1)
            int r3 = r3 + 1
            goto Lf
        L1e:
            return
    }

    public static void reverse(char[] r2) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            reverse(r2, r0, r1)
        L7:
            return
    }

    public static void reverse(char[] r2, int r3, int r4) {
            if (r2 != 0) goto L3
            return
        L3:
            r0 = 0
            int r3 = java.lang.Math.max(r3, r0)
            int r0 = r2.length
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + (-1)
        Lf:
            if (r4 <= r3) goto L1e
            char r0 = r2[r4]
            char r1 = r2[r3]
            r2[r4] = r1
            r2[r3] = r0
            int r4 = r4 + (-1)
            int r3 = r3 + 1
            goto Lf
        L1e:
            return
    }

    public static void reverse(double[] r2) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            reverse(r2, r0, r1)
        L7:
            return
    }

    public static void reverse(double[] r4, int r5, int r6) {
            if (r4 != 0) goto L3
            return
        L3:
            r0 = 0
            int r5 = java.lang.Math.max(r5, r0)
            int r0 = r4.length
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r6 + (-1)
        Lf:
            if (r6 <= r5) goto L1e
            r0 = r4[r6]
            r2 = r4[r5]
            r4[r6] = r2
            r4[r5] = r0
            int r6 = r6 + (-1)
            int r5 = r5 + 1
            goto Lf
        L1e:
            return
    }

    public static void reverse(float[] r2) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            reverse(r2, r0, r1)
        L7:
            return
    }

    public static void reverse(float[] r2, int r3, int r4) {
            if (r2 != 0) goto L3
            return
        L3:
            r0 = 0
            int r3 = java.lang.Math.max(r3, r0)
            int r0 = r2.length
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + (-1)
        Lf:
            if (r4 <= r3) goto L1e
            r0 = r2[r4]
            r1 = r2[r3]
            r2[r4] = r1
            r2[r3] = r0
            int r4 = r4 + (-1)
            int r3 = r3 + 1
            goto Lf
        L1e:
            return
    }

    public static void reverse(int[] r2) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            reverse(r2, r0, r1)
        L7:
            return
    }

    public static void reverse(int[] r2, int r3, int r4) {
            if (r2 != 0) goto L3
            return
        L3:
            r0 = 0
            int r3 = java.lang.Math.max(r3, r0)
            int r0 = r2.length
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + (-1)
        Lf:
            if (r4 <= r3) goto L1e
            r0 = r2[r4]
            r1 = r2[r3]
            r2[r4] = r1
            r2[r3] = r0
            int r4 = r4 + (-1)
            int r3 = r3 + 1
            goto Lf
        L1e:
            return
    }

    public static void reverse(long[] r2) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            reverse(r2, r0, r1)
        L7:
            return
    }

    public static void reverse(long[] r4, int r5, int r6) {
            if (r4 != 0) goto L3
            return
        L3:
            r0 = 0
            int r5 = java.lang.Math.max(r5, r0)
            int r0 = r4.length
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r6 + (-1)
        Lf:
            if (r6 <= r5) goto L1e
            r0 = r4[r6]
            r2 = r4[r5]
            r4[r6] = r2
            r4[r5] = r0
            int r6 = r6 + (-1)
            int r5 = r5 + 1
            goto Lf
        L1e:
            return
    }

    public static void reverse(java.lang.Object[] r2) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            reverse(r2, r0, r1)
        L7:
            return
    }

    public static void reverse(java.lang.Object[] r2, int r3, int r4) {
            if (r2 != 0) goto L3
            return
        L3:
            r0 = 0
            int r3 = java.lang.Math.max(r3, r0)
            int r0 = r2.length
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + (-1)
        Lf:
            if (r4 <= r3) goto L1e
            r0 = r2[r4]
            r1 = r2[r3]
            r2[r4] = r1
            r2[r3] = r0
            int r4 = r4 + (-1)
            int r3 = r3 + 1
            goto Lf
        L1e:
            return
    }

    public static void reverse(short[] r2) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            reverse(r2, r0, r1)
        L7:
            return
    }

    public static void reverse(short[] r2, int r3, int r4) {
            if (r2 != 0) goto L3
            return
        L3:
            r0 = 0
            int r3 = java.lang.Math.max(r3, r0)
            int r0 = r2.length
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + (-1)
        Lf:
            if (r4 <= r3) goto L1e
            short r0 = r2[r4]
            short r1 = r2[r3]
            r2[r4] = r1
            r2[r3] = r0
            int r4 = r4 + (-1)
            int r3 = r3 + 1
            goto Lf
        L1e:
            return
    }

    public static void reverse(boolean[] r2) {
            if (r2 != 0) goto L3
            return
        L3:
            r0 = 0
            int r1 = r2.length
            reverse(r2, r0, r1)
            return
    }

    public static void reverse(boolean[] r2, int r3, int r4) {
            if (r2 != 0) goto L3
            return
        L3:
            r0 = 0
            int r3 = java.lang.Math.max(r3, r0)
            int r0 = r2.length
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + (-1)
        Lf:
            if (r4 <= r3) goto L1e
            boolean r0 = r2[r4]
            boolean r1 = r2[r3]
            r2[r4] = r1
            r2[r3] = r0
            int r4 = r4 + (-1)
            int r3 = r3 + 1
            goto Lf
        L1e:
            return
    }

    public static <T> T[] setAll(T[] r0, java.util.function.IntFunction<? extends T> r1) {
            if (r0 == 0) goto L7
            if (r1 == 0) goto L7
            java.util.Arrays.setAll(r0, r1)
        L7:
            return r0
    }

    public static <T> T[] setAll(T[] r2, java.util.function.Supplier<? extends T> r3) {
            if (r2 == 0) goto L11
            if (r3 == 0) goto L11
            r0 = 0
        L5:
            int r1 = r2.length
            if (r0 >= r1) goto L11
            java.lang.Object r1 = r3.get()
            r2[r0] = r1
            int r0 = r0 + 1
            goto L5
        L11:
            return r2
    }

    public static void shift(byte[] r2, int r3) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            shift(r2, r0, r1, r3)
        L7:
            return
    }

    public static void shift(byte[] r3, int r4, int r5, int r6) {
            if (r3 == 0) goto L3c
            int r0 = r3.length
            r1 = 1
            int r0 = r0 - r1
            if (r4 >= r0) goto L3c
            if (r5 > 0) goto La
            goto L3c
        La:
            int r4 = max0(r4)
            int r0 = r3.length
            int r5 = java.lang.Math.min(r5, r0)
            int r5 = r5 - r4
            if (r5 > r1) goto L17
            return
        L17:
            int r6 = r6 % r5
            if (r6 >= 0) goto L1b
            int r6 = r6 + r5
        L1b:
            if (r5 <= r1) goto L3c
            if (r6 <= 0) goto L3c
            int r0 = r5 - r6
            if (r6 <= r0) goto L2e
            int r5 = r5 + r4
            int r5 = r5 - r0
            swap(r3, r4, r5, r0)
            int r5 = r6 - r0
            r2 = r6
            r6 = r5
            r5 = r2
            goto L1b
        L2e:
            if (r6 >= r0) goto L38
            int r5 = r4 + r0
            swap(r3, r4, r5, r6)
            int r4 = r4 + r6
            r5 = r0
            goto L1b
        L38:
            int r0 = r0 + r4
            swap(r3, r4, r0, r6)
        L3c:
            return
    }

    public static void shift(char[] r2, int r3) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            shift(r2, r0, r1, r3)
        L7:
            return
    }

    public static void shift(char[] r3, int r4, int r5, int r6) {
            if (r3 == 0) goto L3c
            int r0 = r3.length
            r1 = 1
            int r0 = r0 - r1
            if (r4 >= r0) goto L3c
            if (r5 > 0) goto La
            goto L3c
        La:
            int r4 = max0(r4)
            int r0 = r3.length
            int r5 = java.lang.Math.min(r5, r0)
            int r5 = r5 - r4
            if (r5 > r1) goto L17
            return
        L17:
            int r6 = r6 % r5
            if (r6 >= 0) goto L1b
            int r6 = r6 + r5
        L1b:
            if (r5 <= r1) goto L3c
            if (r6 <= 0) goto L3c
            int r0 = r5 - r6
            if (r6 <= r0) goto L2e
            int r5 = r5 + r4
            int r5 = r5 - r0
            swap(r3, r4, r5, r0)
            int r5 = r6 - r0
            r2 = r6
            r6 = r5
            r5 = r2
            goto L1b
        L2e:
            if (r6 >= r0) goto L38
            int r5 = r4 + r0
            swap(r3, r4, r5, r6)
            int r4 = r4 + r6
            r5 = r0
            goto L1b
        L38:
            int r0 = r0 + r4
            swap(r3, r4, r0, r6)
        L3c:
            return
    }

    public static void shift(double[] r2, int r3) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            shift(r2, r0, r1, r3)
        L7:
            return
    }

    public static void shift(double[] r3, int r4, int r5, int r6) {
            if (r3 == 0) goto L3c
            int r0 = r3.length
            r1 = 1
            int r0 = r0 - r1
            if (r4 >= r0) goto L3c
            if (r5 > 0) goto La
            goto L3c
        La:
            int r4 = max0(r4)
            int r0 = r3.length
            int r5 = java.lang.Math.min(r5, r0)
            int r5 = r5 - r4
            if (r5 > r1) goto L17
            return
        L17:
            int r6 = r6 % r5
            if (r6 >= 0) goto L1b
            int r6 = r6 + r5
        L1b:
            if (r5 <= r1) goto L3c
            if (r6 <= 0) goto L3c
            int r0 = r5 - r6
            if (r6 <= r0) goto L2e
            int r5 = r5 + r4
            int r5 = r5 - r0
            swap(r3, r4, r5, r0)
            int r5 = r6 - r0
            r2 = r6
            r6 = r5
            r5 = r2
            goto L1b
        L2e:
            if (r6 >= r0) goto L38
            int r5 = r4 + r0
            swap(r3, r4, r5, r6)
            int r4 = r4 + r6
            r5 = r0
            goto L1b
        L38:
            int r0 = r0 + r4
            swap(r3, r4, r0, r6)
        L3c:
            return
    }

    public static void shift(float[] r2, int r3) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            shift(r2, r0, r1, r3)
        L7:
            return
    }

    public static void shift(float[] r3, int r4, int r5, int r6) {
            if (r3 == 0) goto L3c
            int r0 = r3.length
            r1 = 1
            int r0 = r0 - r1
            if (r4 >= r0) goto L3c
            if (r5 > 0) goto La
            goto L3c
        La:
            int r4 = max0(r4)
            int r0 = r3.length
            int r5 = java.lang.Math.min(r5, r0)
            int r5 = r5 - r4
            if (r5 > r1) goto L17
            return
        L17:
            int r6 = r6 % r5
            if (r6 >= 0) goto L1b
            int r6 = r6 + r5
        L1b:
            if (r5 <= r1) goto L3c
            if (r6 <= 0) goto L3c
            int r0 = r5 - r6
            if (r6 <= r0) goto L2e
            int r5 = r5 + r4
            int r5 = r5 - r0
            swap(r3, r4, r5, r0)
            int r5 = r6 - r0
            r2 = r6
            r6 = r5
            r5 = r2
            goto L1b
        L2e:
            if (r6 >= r0) goto L38
            int r5 = r4 + r0
            swap(r3, r4, r5, r6)
            int r4 = r4 + r6
            r5 = r0
            goto L1b
        L38:
            int r0 = r0 + r4
            swap(r3, r4, r0, r6)
        L3c:
            return
    }

    public static void shift(int[] r2, int r3) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            shift(r2, r0, r1, r3)
        L7:
            return
    }

    public static void shift(int[] r3, int r4, int r5, int r6) {
            if (r3 == 0) goto L3c
            int r0 = r3.length
            r1 = 1
            int r0 = r0 - r1
            if (r4 >= r0) goto L3c
            if (r5 > 0) goto La
            goto L3c
        La:
            int r4 = max0(r4)
            int r0 = r3.length
            int r5 = java.lang.Math.min(r5, r0)
            int r5 = r5 - r4
            if (r5 > r1) goto L17
            return
        L17:
            int r6 = r6 % r5
            if (r6 >= 0) goto L1b
            int r6 = r6 + r5
        L1b:
            if (r5 <= r1) goto L3c
            if (r6 <= 0) goto L3c
            int r0 = r5 - r6
            if (r6 <= r0) goto L2e
            int r5 = r5 + r4
            int r5 = r5 - r0
            swap(r3, r4, r5, r0)
            int r5 = r6 - r0
            r2 = r6
            r6 = r5
            r5 = r2
            goto L1b
        L2e:
            if (r6 >= r0) goto L38
            int r5 = r4 + r0
            swap(r3, r4, r5, r6)
            int r4 = r4 + r6
            r5 = r0
            goto L1b
        L38:
            int r0 = r0 + r4
            swap(r3, r4, r0, r6)
        L3c:
            return
    }

    public static void shift(long[] r2, int r3) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            shift(r2, r0, r1, r3)
        L7:
            return
    }

    public static void shift(long[] r3, int r4, int r5, int r6) {
            if (r3 == 0) goto L3c
            int r0 = r3.length
            r1 = 1
            int r0 = r0 - r1
            if (r4 >= r0) goto L3c
            if (r5 > 0) goto La
            goto L3c
        La:
            int r4 = max0(r4)
            int r0 = r3.length
            int r5 = java.lang.Math.min(r5, r0)
            int r5 = r5 - r4
            if (r5 > r1) goto L17
            return
        L17:
            int r6 = r6 % r5
            if (r6 >= 0) goto L1b
            int r6 = r6 + r5
        L1b:
            if (r5 <= r1) goto L3c
            if (r6 <= 0) goto L3c
            int r0 = r5 - r6
            if (r6 <= r0) goto L2e
            int r5 = r5 + r4
            int r5 = r5 - r0
            swap(r3, r4, r5, r0)
            int r5 = r6 - r0
            r2 = r6
            r6 = r5
            r5 = r2
            goto L1b
        L2e:
            if (r6 >= r0) goto L38
            int r5 = r4 + r0
            swap(r3, r4, r5, r6)
            int r4 = r4 + r6
            r5 = r0
            goto L1b
        L38:
            int r0 = r0 + r4
            swap(r3, r4, r0, r6)
        L3c:
            return
    }

    public static void shift(java.lang.Object[] r2, int r3) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            shift(r2, r0, r1, r3)
        L7:
            return
    }

    public static void shift(java.lang.Object[] r3, int r4, int r5, int r6) {
            if (r3 == 0) goto L3c
            int r0 = r3.length
            r1 = 1
            int r0 = r0 - r1
            if (r4 >= r0) goto L3c
            if (r5 > 0) goto La
            goto L3c
        La:
            int r4 = max0(r4)
            int r0 = r3.length
            int r5 = java.lang.Math.min(r5, r0)
            int r5 = r5 - r4
            if (r5 > r1) goto L17
            return
        L17:
            int r6 = r6 % r5
            if (r6 >= 0) goto L1b
            int r6 = r6 + r5
        L1b:
            if (r5 <= r1) goto L3c
            if (r6 <= 0) goto L3c
            int r0 = r5 - r6
            if (r6 <= r0) goto L2e
            int r5 = r5 + r4
            int r5 = r5 - r0
            swap(r3, r4, r5, r0)
            int r5 = r6 - r0
            r2 = r6
            r6 = r5
            r5 = r2
            goto L1b
        L2e:
            if (r6 >= r0) goto L38
            int r5 = r4 + r0
            swap(r3, r4, r5, r6)
            int r4 = r4 + r6
            r5 = r0
            goto L1b
        L38:
            int r0 = r0 + r4
            swap(r3, r4, r0, r6)
        L3c:
            return
    }

    public static void shift(short[] r2, int r3) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            shift(r2, r0, r1, r3)
        L7:
            return
    }

    public static void shift(short[] r3, int r4, int r5, int r6) {
            if (r3 == 0) goto L3c
            int r0 = r3.length
            r1 = 1
            int r0 = r0 - r1
            if (r4 >= r0) goto L3c
            if (r5 > 0) goto La
            goto L3c
        La:
            int r4 = max0(r4)
            int r0 = r3.length
            int r5 = java.lang.Math.min(r5, r0)
            int r5 = r5 - r4
            if (r5 > r1) goto L17
            return
        L17:
            int r6 = r6 % r5
            if (r6 >= 0) goto L1b
            int r6 = r6 + r5
        L1b:
            if (r5 <= r1) goto L3c
            if (r6 <= 0) goto L3c
            int r0 = r5 - r6
            if (r6 <= r0) goto L2e
            int r5 = r5 + r4
            int r5 = r5 - r0
            swap(r3, r4, r5, r0)
            int r5 = r6 - r0
            r2 = r6
            r6 = r5
            r5 = r2
            goto L1b
        L2e:
            if (r6 >= r0) goto L38
            int r5 = r4 + r0
            swap(r3, r4, r5, r6)
            int r4 = r4 + r6
            r5 = r0
            goto L1b
        L38:
            int r0 = r0 + r4
            swap(r3, r4, r0, r6)
        L3c:
            return
    }

    public static void shift(boolean[] r2, int r3) {
            if (r2 == 0) goto L7
            r0 = 0
            int r1 = r2.length
            shift(r2, r0, r1, r3)
        L7:
            return
    }

    public static void shift(boolean[] r3, int r4, int r5, int r6) {
            if (r3 == 0) goto L3c
            int r0 = r3.length
            r1 = 1
            int r0 = r0 - r1
            if (r4 >= r0) goto L3c
            if (r5 > 0) goto La
            goto L3c
        La:
            int r4 = max0(r4)
            int r0 = r3.length
            int r5 = java.lang.Math.min(r5, r0)
            int r5 = r5 - r4
            if (r5 > r1) goto L17
            return
        L17:
            int r6 = r6 % r5
            if (r6 >= 0) goto L1b
            int r6 = r6 + r5
        L1b:
            if (r5 <= r1) goto L3c
            if (r6 <= 0) goto L3c
            int r0 = r5 - r6
            if (r6 <= r0) goto L2e
            int r5 = r5 + r4
            int r5 = r5 - r0
            swap(r3, r4, r5, r0)
            int r5 = r6 - r0
            r2 = r6
            r6 = r5
            r5 = r2
            goto L1b
        L2e:
            if (r6 >= r0) goto L38
            int r5 = r4 + r0
            swap(r3, r4, r5, r6)
            int r4 = r4 + r6
            r5 = r0
            goto L1b
        L38:
            int r0 = r0 + r4
            swap(r3, r4, r0, r6)
        L3c:
            return
    }

    public static void shuffle(byte[] r1) {
            java.util.concurrent.ThreadLocalRandom r0 = random()
            shuffle(r1, r0)
            return
    }

    public static void shuffle(byte[] r4, java.util.Random r5) {
            int r0 = r4.length
        L1:
            r1 = 1
            if (r0 <= r1) goto L10
            int r2 = r0 + (-1)
            int r3 = r5.nextInt(r0)
            swap(r4, r2, r3, r1)
            int r0 = r0 + (-1)
            goto L1
        L10:
            return
    }

    public static void shuffle(char[] r1) {
            java.util.concurrent.ThreadLocalRandom r0 = random()
            shuffle(r1, r0)
            return
    }

    public static void shuffle(char[] r4, java.util.Random r5) {
            int r0 = r4.length
        L1:
            r1 = 1
            if (r0 <= r1) goto L10
            int r2 = r0 + (-1)
            int r3 = r5.nextInt(r0)
            swap(r4, r2, r3, r1)
            int r0 = r0 + (-1)
            goto L1
        L10:
            return
    }

    public static void shuffle(double[] r1) {
            java.util.concurrent.ThreadLocalRandom r0 = random()
            shuffle(r1, r0)
            return
    }

    public static void shuffle(double[] r4, java.util.Random r5) {
            int r0 = r4.length
        L1:
            r1 = 1
            if (r0 <= r1) goto L10
            int r2 = r0 + (-1)
            int r3 = r5.nextInt(r0)
            swap(r4, r2, r3, r1)
            int r0 = r0 + (-1)
            goto L1
        L10:
            return
    }

    public static void shuffle(float[] r1) {
            java.util.concurrent.ThreadLocalRandom r0 = random()
            shuffle(r1, r0)
            return
    }

    public static void shuffle(float[] r4, java.util.Random r5) {
            int r0 = r4.length
        L1:
            r1 = 1
            if (r0 <= r1) goto L10
            int r2 = r0 + (-1)
            int r3 = r5.nextInt(r0)
            swap(r4, r2, r3, r1)
            int r0 = r0 + (-1)
            goto L1
        L10:
            return
    }

    public static void shuffle(int[] r1) {
            java.util.concurrent.ThreadLocalRandom r0 = random()
            shuffle(r1, r0)
            return
    }

    public static void shuffle(int[] r4, java.util.Random r5) {
            int r0 = r4.length
        L1:
            r1 = 1
            if (r0 <= r1) goto L10
            int r2 = r0 + (-1)
            int r3 = r5.nextInt(r0)
            swap(r4, r2, r3, r1)
            int r0 = r0 + (-1)
            goto L1
        L10:
            return
    }

    public static void shuffle(long[] r1) {
            java.util.concurrent.ThreadLocalRandom r0 = random()
            shuffle(r1, r0)
            return
    }

    public static void shuffle(long[] r4, java.util.Random r5) {
            int r0 = r4.length
        L1:
            r1 = 1
            if (r0 <= r1) goto L10
            int r2 = r0 + (-1)
            int r3 = r5.nextInt(r0)
            swap(r4, r2, r3, r1)
            int r0 = r0 + (-1)
            goto L1
        L10:
            return
    }

    public static void shuffle(java.lang.Object[] r1) {
            java.util.concurrent.ThreadLocalRandom r0 = random()
            shuffle(r1, r0)
            return
    }

    public static void shuffle(java.lang.Object[] r4, java.util.Random r5) {
            int r0 = r4.length
        L1:
            r1 = 1
            if (r0 <= r1) goto L10
            int r2 = r0 + (-1)
            int r3 = r5.nextInt(r0)
            swap(r4, r2, r3, r1)
            int r0 = r0 + (-1)
            goto L1
        L10:
            return
    }

    public static void shuffle(short[] r1) {
            java.util.concurrent.ThreadLocalRandom r0 = random()
            shuffle(r1, r0)
            return
    }

    public static void shuffle(short[] r4, java.util.Random r5) {
            int r0 = r4.length
        L1:
            r1 = 1
            if (r0 <= r1) goto L10
            int r2 = r0 + (-1)
            int r3 = r5.nextInt(r0)
            swap(r4, r2, r3, r1)
            int r0 = r0 + (-1)
            goto L1
        L10:
            return
    }

    public static void shuffle(boolean[] r1) {
            java.util.concurrent.ThreadLocalRandom r0 = random()
            shuffle(r1, r0)
            return
    }

    public static void shuffle(boolean[] r4, java.util.Random r5) {
            int r0 = r4.length
        L1:
            r1 = 1
            if (r0 <= r1) goto L10
            int r2 = r0 + (-1)
            int r3 = r5.nextInt(r0)
            swap(r4, r2, r3, r1)
            int r0 = r0 + (-1)
            goto L1
        L10:
            return
    }

    public static byte[] subarray(byte[] r2, int r3, int r4) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r3 = max0(r3)
            int r0 = r2.length
            int r4 = java.lang.Math.min(r4, r0)
            int r4 = r4 - r3
            if (r4 > 0) goto L13
            byte[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY
            return r2
        L13:
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda12 r0 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda12
            r0.<init>()
            r1 = 0
            java.lang.Object r2 = arraycopy(r2, r3, r1, r4, r0)
            byte[] r2 = (byte[]) r2
            return r2
    }

    public static char[] subarray(char[] r2, int r3, int r4) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r3 = max0(r3)
            int r0 = r2.length
            int r4 = java.lang.Math.min(r4, r0)
            int r4 = r4 - r3
            if (r4 > 0) goto L13
            char[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY
            return r2
        L13:
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda19 r0 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda19
            r0.<init>()
            r1 = 0
            java.lang.Object r2 = arraycopy(r2, r3, r1, r4, r0)
            char[] r2 = (char[]) r2
            return r2
    }

    public static double[] subarray(double[] r2, int r3, int r4) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r3 = max0(r3)
            int r0 = r2.length
            int r4 = java.lang.Math.min(r4, r0)
            int r4 = r4 - r3
            if (r4 > 0) goto L13
            double[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY
            return r2
        L13:
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda11 r0 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda11
            r0.<init>()
            r1 = 0
            java.lang.Object r2 = arraycopy(r2, r3, r1, r4, r0)
            double[] r2 = (double[]) r2
            return r2
    }

    public static float[] subarray(float[] r2, int r3, int r4) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r3 = max0(r3)
            int r0 = r2.length
            int r4 = java.lang.Math.min(r4, r0)
            int r4 = r4 - r3
            if (r4 > 0) goto L13
            float[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY
            return r2
        L13:
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda5 r0 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda5
            r0.<init>()
            r1 = 0
            java.lang.Object r2 = arraycopy(r2, r3, r1, r4, r0)
            float[] r2 = (float[]) r2
            return r2
    }

    public static int[] subarray(int[] r2, int r3, int r4) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r3 = max0(r3)
            int r0 = r2.length
            int r4 = java.lang.Math.min(r4, r0)
            int r4 = r4 - r3
            if (r4 > 0) goto L13
            int[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY
            return r2
        L13:
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda6 r0 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda6
            r0.<init>()
            r1 = 0
            java.lang.Object r2 = arraycopy(r2, r3, r1, r4, r0)
            int[] r2 = (int[]) r2
            return r2
    }

    public static long[] subarray(long[] r2, int r3, int r4) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r3 = max0(r3)
            int r0 = r2.length
            int r4 = java.lang.Math.min(r4, r0)
            int r4 = r4 - r3
            if (r4 > 0) goto L13
            long[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY
            return r2
        L13:
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda2 r0 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda2
            r0.<init>()
            r1 = 0
            java.lang.Object r2 = arraycopy(r2, r3, r1, r4, r0)
            long[] r2 = (long[]) r2
            return r2
    }

    public static <T> T[] subarray(T[] r3, int r4, int r5) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r4 = max0(r4)
            int r0 = r3.length
            int r5 = java.lang.Math.min(r5, r0)
            int r5 = r5 - r4
            java.lang.Class r0 = getComponentType(r3)
            r1 = 0
            if (r5 > 0) goto L1a
            java.lang.Object[] r3 = newInstance(r0, r1)
            return r3
        L1a:
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda20 r2 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda20
            r2.<init>(r0, r5)
            java.lang.Object r3 = arraycopy(r3, r4, r1, r5, r2)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            return r3
    }

    public static short[] subarray(short[] r2, int r3, int r4) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r3 = max0(r3)
            int r0 = r2.length
            int r4 = java.lang.Math.min(r4, r0)
            int r4 = r4 - r3
            if (r4 > 0) goto L13
            short[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY
            return r2
        L13:
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda15 r0 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda15
            r0.<init>()
            r1 = 0
            java.lang.Object r2 = arraycopy(r2, r3, r1, r4, r0)
            short[] r2 = (short[]) r2
            return r2
    }

    public static boolean[] subarray(boolean[] r2, int r3, int r4) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r3 = max0(r3)
            int r0 = r2.length
            int r4 = java.lang.Math.min(r4, r0)
            int r4 = r4 - r3
            if (r4 > 0) goto L13
            boolean[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY
            return r2
        L13:
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda17 r0 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda17
            r0.<init>()
            r1 = 0
            java.lang.Object r2 = arraycopy(r2, r3, r1, r4, r0)
            boolean[] r2 = (boolean[]) r2
            return r2
    }

    public static void swap(byte[] r1, int r2, int r3) {
            r0 = 1
            swap(r1, r2, r3, r0)
            return
    }

    public static void swap(byte[] r3, int r4, int r5, int r6) {
            boolean r0 = isEmpty(r3)
            if (r0 != 0) goto L33
            int r0 = r3.length
            if (r4 >= r0) goto L33
            int r0 = r3.length
            if (r5 < r0) goto Ld
            goto L33
        Ld:
            int r4 = max0(r4)
            int r5 = max0(r5)
            int r0 = r3.length
            int r0 = r0 - r4
            int r6 = java.lang.Math.min(r6, r0)
            int r0 = r3.length
            int r0 = r0 - r5
            int r6 = java.lang.Math.min(r6, r0)
            r0 = 0
        L22:
            if (r0 >= r6) goto L33
            r1 = r3[r4]
            r2 = r3[r5]
            r3[r4] = r2
            r3[r5] = r1
            int r0 = r0 + 1
            int r4 = r4 + 1
            int r5 = r5 + 1
            goto L22
        L33:
            return
    }

    public static void swap(char[] r1, int r2, int r3) {
            r0 = 1
            swap(r1, r2, r3, r0)
            return
    }

    public static void swap(char[] r3, int r4, int r5, int r6) {
            boolean r0 = isEmpty(r3)
            if (r0 != 0) goto L33
            int r0 = r3.length
            if (r4 >= r0) goto L33
            int r0 = r3.length
            if (r5 < r0) goto Ld
            goto L33
        Ld:
            int r4 = max0(r4)
            int r5 = max0(r5)
            int r0 = r3.length
            int r0 = r0 - r4
            int r6 = java.lang.Math.min(r6, r0)
            int r0 = r3.length
            int r0 = r0 - r5
            int r6 = java.lang.Math.min(r6, r0)
            r0 = 0
        L22:
            if (r0 >= r6) goto L33
            char r1 = r3[r4]
            char r2 = r3[r5]
            r3[r4] = r2
            r3[r5] = r1
            int r0 = r0 + 1
            int r4 = r4 + 1
            int r5 = r5 + 1
            goto L22
        L33:
            return
    }

    public static void swap(double[] r1, int r2, int r3) {
            r0 = 1
            swap(r1, r2, r3, r0)
            return
    }

    public static void swap(double[] r5, int r6, int r7, int r8) {
            boolean r0 = isEmpty(r5)
            if (r0 != 0) goto L33
            int r0 = r5.length
            if (r6 >= r0) goto L33
            int r0 = r5.length
            if (r7 < r0) goto Ld
            goto L33
        Ld:
            int r6 = max0(r6)
            int r7 = max0(r7)
            int r0 = r5.length
            int r0 = r0 - r6
            int r8 = java.lang.Math.min(r8, r0)
            int r0 = r5.length
            int r0 = r0 - r7
            int r8 = java.lang.Math.min(r8, r0)
            r0 = 0
        L22:
            if (r0 >= r8) goto L33
            r1 = r5[r6]
            r3 = r5[r7]
            r5[r6] = r3
            r5[r7] = r1
            int r0 = r0 + 1
            int r6 = r6 + 1
            int r7 = r7 + 1
            goto L22
        L33:
            return
    }

    public static void swap(float[] r1, int r2, int r3) {
            r0 = 1
            swap(r1, r2, r3, r0)
            return
    }

    public static void swap(float[] r3, int r4, int r5, int r6) {
            boolean r0 = isEmpty(r3)
            if (r0 != 0) goto L33
            int r0 = r3.length
            if (r4 >= r0) goto L33
            int r0 = r3.length
            if (r5 < r0) goto Ld
            goto L33
        Ld:
            int r4 = max0(r4)
            int r5 = max0(r5)
            int r0 = r3.length
            int r0 = r0 - r4
            int r6 = java.lang.Math.min(r6, r0)
            int r0 = r3.length
            int r0 = r0 - r5
            int r6 = java.lang.Math.min(r6, r0)
            r0 = 0
        L22:
            if (r0 >= r6) goto L33
            r1 = r3[r4]
            r2 = r3[r5]
            r3[r4] = r2
            r3[r5] = r1
            int r0 = r0 + 1
            int r4 = r4 + 1
            int r5 = r5 + 1
            goto L22
        L33:
            return
    }

    public static void swap(int[] r1, int r2, int r3) {
            r0 = 1
            swap(r1, r2, r3, r0)
            return
    }

    public static void swap(int[] r3, int r4, int r5, int r6) {
            boolean r0 = isEmpty(r3)
            if (r0 != 0) goto L33
            int r0 = r3.length
            if (r4 >= r0) goto L33
            int r0 = r3.length
            if (r5 < r0) goto Ld
            goto L33
        Ld:
            int r4 = max0(r4)
            int r5 = max0(r5)
            int r0 = r3.length
            int r0 = r0 - r4
            int r6 = java.lang.Math.min(r6, r0)
            int r0 = r3.length
            int r0 = r0 - r5
            int r6 = java.lang.Math.min(r6, r0)
            r0 = 0
        L22:
            if (r0 >= r6) goto L33
            r1 = r3[r4]
            r2 = r3[r5]
            r3[r4] = r2
            r3[r5] = r1
            int r0 = r0 + 1
            int r4 = r4 + 1
            int r5 = r5 + 1
            goto L22
        L33:
            return
    }

    public static void swap(long[] r1, int r2, int r3) {
            r0 = 1
            swap(r1, r2, r3, r0)
            return
    }

    public static void swap(long[] r5, int r6, int r7, int r8) {
            boolean r0 = isEmpty(r5)
            if (r0 != 0) goto L33
            int r0 = r5.length
            if (r6 >= r0) goto L33
            int r0 = r5.length
            if (r7 < r0) goto Ld
            goto L33
        Ld:
            int r6 = max0(r6)
            int r7 = max0(r7)
            int r0 = r5.length
            int r0 = r0 - r6
            int r8 = java.lang.Math.min(r8, r0)
            int r0 = r5.length
            int r0 = r0 - r7
            int r8 = java.lang.Math.min(r8, r0)
            r0 = 0
        L22:
            if (r0 >= r8) goto L33
            r1 = r5[r6]
            r3 = r5[r7]
            r5[r6] = r3
            r5[r7] = r1
            int r0 = r0 + 1
            int r6 = r6 + 1
            int r7 = r7 + 1
            goto L22
        L33:
            return
    }

    public static void swap(java.lang.Object[] r1, int r2, int r3) {
            r0 = 1
            swap(r1, r2, r3, r0)
            return
    }

    public static void swap(java.lang.Object[] r3, int r4, int r5, int r6) {
            boolean r0 = isEmpty(r3)
            if (r0 != 0) goto L33
            int r0 = r3.length
            if (r4 >= r0) goto L33
            int r0 = r3.length
            if (r5 < r0) goto Ld
            goto L33
        Ld:
            int r4 = max0(r4)
            int r5 = max0(r5)
            int r0 = r3.length
            int r0 = r0 - r4
            int r6 = java.lang.Math.min(r6, r0)
            int r0 = r3.length
            int r0 = r0 - r5
            int r6 = java.lang.Math.min(r6, r0)
            r0 = 0
        L22:
            if (r0 >= r6) goto L33
            r1 = r3[r4]
            r2 = r3[r5]
            r3[r4] = r2
            r3[r5] = r1
            int r0 = r0 + 1
            int r4 = r4 + 1
            int r5 = r5 + 1
            goto L22
        L33:
            return
    }

    public static void swap(short[] r1, int r2, int r3) {
            r0 = 1
            swap(r1, r2, r3, r0)
            return
    }

    public static void swap(short[] r3, int r4, int r5, int r6) {
            boolean r0 = isEmpty(r3)
            if (r0 != 0) goto L36
            int r0 = r3.length
            if (r4 >= r0) goto L36
            int r0 = r3.length
            if (r5 < r0) goto Ld
            goto L36
        Ld:
            int r4 = max0(r4)
            int r5 = max0(r5)
            if (r4 != r5) goto L18
            return
        L18:
            int r0 = r3.length
            int r0 = r0 - r4
            int r6 = java.lang.Math.min(r6, r0)
            int r0 = r3.length
            int r0 = r0 - r5
            int r6 = java.lang.Math.min(r6, r0)
            r0 = 0
        L25:
            if (r0 >= r6) goto L36
            short r1 = r3[r4]
            short r2 = r3[r5]
            r3[r4] = r2
            r3[r5] = r1
            int r0 = r0 + 1
            int r4 = r4 + 1
            int r5 = r5 + 1
            goto L25
        L36:
            return
    }

    public static void swap(boolean[] r1, int r2, int r3) {
            r0 = 1
            swap(r1, r2, r3, r0)
            return
    }

    public static void swap(boolean[] r3, int r4, int r5, int r6) {
            boolean r0 = isEmpty(r3)
            if (r0 != 0) goto L33
            int r0 = r3.length
            if (r4 >= r0) goto L33
            int r0 = r3.length
            if (r5 < r0) goto Ld
            goto L33
        Ld:
            int r4 = max0(r4)
            int r5 = max0(r5)
            int r0 = r3.length
            int r0 = r0 - r4
            int r6 = java.lang.Math.min(r6, r0)
            int r0 = r3.length
            int r0 = r0 - r5
            int r6 = java.lang.Math.min(r6, r0)
            r0 = 0
        L22:
            if (r0 >= r6) goto L33
            boolean r1 = r3[r4]
            boolean r2 = r3[r5]
            r3[r4] = r2
            r3[r5] = r1
            int r0 = r0 + 1
            int r4 = r4 + 1
            int r5 = r5 + 1
            goto L22
        L33:
            return
    }

    public static <T> T[] toArray(T... r0) {
            return r0
    }

    public static java.util.Map<java.lang.Object, java.lang.Object> toMap(java.lang.Object[] r9) {
            if (r9 != 0) goto L4
            r9 = 0
            return r9
        L4:
            java.util.HashMap r0 = new java.util.HashMap
            int r1 = r9.length
            double r1 = (double) r1
            r3 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r1 = r1 * r3
            int r1 = (int) r1
            r0.<init>(r1)
            r1 = 0
            r2 = r1
        L11:
            int r3 = r9.length
            if (r2 >= r3) goto L84
            r3 = r9[r2]
            boolean r4 = r3 instanceof java.util.Map.Entry
            if (r4 == 0) goto L28
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            r0.put(r4, r3)
            goto L3f
        L28:
            boolean r4 = r3 instanceof java.lang.Object[]
            java.lang.String r5 = ", '"
            java.lang.String r6 = "Array element "
            if (r4 == 0) goto L63
            r4 = r3
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r7 = r4.length
            r8 = 2
            if (r7 < r8) goto L42
            r3 = r4[r1]
            r5 = 1
            r4 = r4[r5]
            r0.put(r3, r4)
        L3f:
            int r2 = r2 + 1
            goto L11
        L42:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "', has a length less than 2"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L63:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "', is neither of type Map.Entry nor an Array"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L84:
            return r0
    }

    public static java.lang.Boolean[] toObject(boolean[] r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length
            if (r0 != 0) goto La
            java.lang.Boolean[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY
            return r2
        La:
            int r0 = r2.length
            java.lang.Boolean[] r0 = new java.lang.Boolean[r0]
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda8 r1 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda8
            r1.<init>(r2)
            java.lang.Object[] r2 = setAll(r0, r1)
            java.lang.Boolean[] r2 = (java.lang.Boolean[]) r2
            return r2
    }

    public static java.lang.Byte[] toObject(byte[] r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length
            if (r0 != 0) goto La
            java.lang.Byte[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY
            return r2
        La:
            int r0 = r2.length
            java.lang.Byte[] r0 = new java.lang.Byte[r0]
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda18 r1 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda18
            r1.<init>(r2)
            java.lang.Object[] r2 = setAll(r0, r1)
            java.lang.Byte[] r2 = (java.lang.Byte[]) r2
            return r2
    }

    public static java.lang.Character[] toObject(char[] r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length
            if (r0 != 0) goto La
            java.lang.Character[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY
            return r2
        La:
            int r0 = r2.length
            java.lang.Character[] r0 = new java.lang.Character[r0]
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda4 r1 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda4
            r1.<init>(r2)
            java.lang.Object[] r2 = setAll(r0, r1)
            java.lang.Character[] r2 = (java.lang.Character[]) r2
            return r2
    }

    public static java.lang.Double[] toObject(double[] r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length
            if (r0 != 0) goto La
            java.lang.Double[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY
            return r2
        La:
            int r0 = r2.length
            java.lang.Double[] r0 = new java.lang.Double[r0]
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda9 r1 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda9
            r1.<init>(r2)
            java.lang.Object[] r2 = setAll(r0, r1)
            java.lang.Double[] r2 = (java.lang.Double[]) r2
            return r2
    }

    public static java.lang.Float[] toObject(float[] r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length
            if (r0 != 0) goto La
            java.lang.Float[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY
            return r2
        La:
            int r0 = r2.length
            java.lang.Float[] r0 = new java.lang.Float[r0]
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda3 r1 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda3
            r1.<init>(r2)
            java.lang.Object[] r2 = setAll(r0, r1)
            java.lang.Float[] r2 = (java.lang.Float[]) r2
            return r2
    }

    public static java.lang.Integer[] toObject(int[] r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length
            if (r0 != 0) goto La
            java.lang.Integer[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY
            return r2
        La:
            int r0 = r2.length
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda7 r1 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda7
            r1.<init>(r2)
            java.lang.Object[] r2 = setAll(r0, r1)
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2
            return r2
    }

    public static java.lang.Long[] toObject(long[] r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length
            if (r0 != 0) goto La
            java.lang.Long[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY
            return r2
        La:
            int r0 = r2.length
            java.lang.Long[] r0 = new java.lang.Long[r0]
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda13 r1 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda13
            r1.<init>(r2)
            java.lang.Object[] r2 = setAll(r0, r1)
            java.lang.Long[] r2 = (java.lang.Long[]) r2
            return r2
    }

    public static java.lang.Short[] toObject(short[] r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            int r0 = r2.length
            if (r0 != 0) goto La
            java.lang.Short[] r2 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY
            return r2
        La:
            int r0 = r2.length
            java.lang.Short[] r0 = new java.lang.Short[r0]
            org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda16 r1 = new org.apache.commons.lang3.ArrayUtils$$ExternalSyntheticLambda16
            r1.<init>(r2)
            java.lang.Object[] r2 = setAll(r0, r1)
            java.lang.Short[] r2 = (java.lang.Short[]) r2
            return r2
    }

    public static java.lang.Object toPrimitive(java.lang.Object r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = r0.getComponentType()
            java.lang.Class r0 = org.apache.commons.lang3.ClassUtils.wrapperToPrimitive(r0)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1f
            java.lang.Boolean[] r2 = (java.lang.Boolean[]) r2
            boolean[] r2 = toPrimitive(r2)
            return r2
        L1f:
            java.lang.Class r1 = java.lang.Character.TYPE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L2e
            java.lang.Character[] r2 = (java.lang.Character[]) r2
            char[] r2 = toPrimitive(r2)
            return r2
        L2e:
            java.lang.Class r1 = java.lang.Byte.TYPE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L3d
            java.lang.Byte[] r2 = (java.lang.Byte[]) r2
            byte[] r2 = toPrimitive(r2)
            return r2
        L3d:
            java.lang.Class r1 = java.lang.Integer.TYPE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L4c
            java.lang.Integer[] r2 = (java.lang.Integer[]) r2
            int[] r2 = toPrimitive(r2)
            return r2
        L4c:
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L5b
            java.lang.Long[] r2 = (java.lang.Long[]) r2
            long[] r2 = toPrimitive(r2)
            return r2
        L5b:
            java.lang.Class r1 = java.lang.Short.TYPE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L6a
            java.lang.Short[] r2 = (java.lang.Short[]) r2
            short[] r2 = toPrimitive(r2)
            return r2
        L6a:
            java.lang.Class r1 = java.lang.Double.TYPE
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L79
            java.lang.Double[] r2 = (java.lang.Double[]) r2
            double[] r2 = toPrimitive(r2)
            return r2
        L79:
            java.lang.Class r1 = java.lang.Float.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L87
            java.lang.Float[] r2 = (java.lang.Float[]) r2
            float[] r2 = toPrimitive(r2)
        L87:
            return r2
    }

    public static byte[] toPrimitive(java.lang.Byte[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            if (r0 != 0) goto La
            byte[] r3 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY
            return r3
        La:
            int r0 = r3.length
            byte[] r0 = new byte[r0]
            r1 = 0
        Le:
            int r2 = r3.length
            if (r1 >= r2) goto L1c
            r2 = r3[r1]
            byte r2 = r2.byteValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L1c:
            return r0
    }

    public static byte[] toPrimitive(java.lang.Byte[] r3, byte r4) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            if (r0 != 0) goto La
            byte[] r3 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY
            return r3
        La:
            int r0 = r3.length
            byte[] r0 = new byte[r0]
            r1 = 0
        Le:
            int r2 = r3.length
            if (r1 >= r2) goto L20
            r2 = r3[r1]
            if (r2 != 0) goto L17
            r2 = r4
            goto L1b
        L17:
            byte r2 = r2.byteValue()
        L1b:
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L20:
            return r0
    }

    public static char[] toPrimitive(java.lang.Character[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            if (r0 != 0) goto La
            char[] r3 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY
            return r3
        La:
            int r0 = r3.length
            char[] r0 = new char[r0]
            r1 = 0
        Le:
            int r2 = r3.length
            if (r1 >= r2) goto L1c
            r2 = r3[r1]
            char r2 = r2.charValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L1c:
            return r0
    }

    public static char[] toPrimitive(java.lang.Character[] r3, char r4) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            if (r0 != 0) goto La
            char[] r3 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHAR_ARRAY
            return r3
        La:
            int r0 = r3.length
            char[] r0 = new char[r0]
            r1 = 0
        Le:
            int r2 = r3.length
            if (r1 >= r2) goto L20
            r2 = r3[r1]
            if (r2 != 0) goto L17
            r2 = r4
            goto L1b
        L17:
            char r2 = r2.charValue()
        L1b:
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L20:
            return r0
    }

    public static double[] toPrimitive(java.lang.Double[] r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r4.length
            if (r0 != 0) goto La
            double[] r4 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY
            return r4
        La:
            int r0 = r4.length
            double[] r0 = new double[r0]
            r1 = 0
        Le:
            int r2 = r4.length
            if (r1 >= r2) goto L1c
            r2 = r4[r1]
            double r2 = r2.doubleValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L1c:
            return r0
    }

    public static double[] toPrimitive(java.lang.Double[] r4, double r5) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r4.length
            if (r0 != 0) goto La
            double[] r4 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_ARRAY
            return r4
        La:
            int r0 = r4.length
            double[] r0 = new double[r0]
            r1 = 0
        Le:
            int r2 = r4.length
            if (r1 >= r2) goto L20
            r2 = r4[r1]
            if (r2 != 0) goto L17
            r2 = r5
            goto L1b
        L17:
            double r2 = r2.doubleValue()
        L1b:
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L20:
            return r0
    }

    public static float[] toPrimitive(java.lang.Float[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            if (r0 != 0) goto La
            float[] r3 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY
            return r3
        La:
            int r0 = r3.length
            float[] r0 = new float[r0]
            r1 = 0
        Le:
            int r2 = r3.length
            if (r1 >= r2) goto L1c
            r2 = r3[r1]
            float r2 = r2.floatValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L1c:
            return r0
    }

    public static float[] toPrimitive(java.lang.Float[] r3, float r4) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            if (r0 != 0) goto La
            float[] r3 = org.apache.commons.lang3.ArrayUtils.EMPTY_FLOAT_ARRAY
            return r3
        La:
            int r0 = r3.length
            float[] r0 = new float[r0]
            r1 = 0
        Le:
            int r2 = r3.length
            if (r1 >= r2) goto L20
            r2 = r3[r1]
            if (r2 != 0) goto L17
            r2 = r4
            goto L1b
        L17:
            float r2 = r2.floatValue()
        L1b:
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L20:
            return r0
    }

    public static int[] toPrimitive(java.lang.Integer[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            if (r0 != 0) goto La
            int[] r3 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY
            return r3
        La:
            int r0 = r3.length
            int[] r0 = new int[r0]
            r1 = 0
        Le:
            int r2 = r3.length
            if (r1 >= r2) goto L1c
            r2 = r3[r1]
            int r2 = r2.intValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L1c:
            return r0
    }

    public static int[] toPrimitive(java.lang.Integer[] r3, int r4) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            if (r0 != 0) goto La
            int[] r3 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY
            return r3
        La:
            int r0 = r3.length
            int[] r0 = new int[r0]
            r1 = 0
        Le:
            int r2 = r3.length
            if (r1 >= r2) goto L20
            r2 = r3[r1]
            if (r2 != 0) goto L17
            r2 = r4
            goto L1b
        L17:
            int r2 = r2.intValue()
        L1b:
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L20:
            return r0
    }

    public static long[] toPrimitive(java.lang.Long[] r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r4.length
            if (r0 != 0) goto La
            long[] r4 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY
            return r4
        La:
            int r0 = r4.length
            long[] r0 = new long[r0]
            r1 = 0
        Le:
            int r2 = r4.length
            if (r1 >= r2) goto L1c
            r2 = r4[r1]
            long r2 = r2.longValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L1c:
            return r0
    }

    public static long[] toPrimitive(java.lang.Long[] r4, long r5) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r4.length
            if (r0 != 0) goto La
            long[] r4 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_ARRAY
            return r4
        La:
            int r0 = r4.length
            long[] r0 = new long[r0]
            r1 = 0
        Le:
            int r2 = r4.length
            if (r1 >= r2) goto L20
            r2 = r4[r1]
            if (r2 != 0) goto L17
            r2 = r5
            goto L1b
        L17:
            long r2 = r2.longValue()
        L1b:
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L20:
            return r0
    }

    public static short[] toPrimitive(java.lang.Short[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            if (r0 != 0) goto La
            short[] r3 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY
            return r3
        La:
            int r0 = r3.length
            short[] r0 = new short[r0]
            r1 = 0
        Le:
            int r2 = r3.length
            if (r1 >= r2) goto L1c
            r2 = r3[r1]
            short r2 = r2.shortValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L1c:
            return r0
    }

    public static short[] toPrimitive(java.lang.Short[] r3, short r4) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            if (r0 != 0) goto La
            short[] r3 = org.apache.commons.lang3.ArrayUtils.EMPTY_SHORT_ARRAY
            return r3
        La:
            int r0 = r3.length
            short[] r0 = new short[r0]
            r1 = 0
        Le:
            int r2 = r3.length
            if (r1 >= r2) goto L20
            r2 = r3[r1]
            if (r2 != 0) goto L17
            r2 = r4
            goto L1b
        L17:
            short r2 = r2.shortValue()
        L1b:
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L20:
            return r0
    }

    public static boolean[] toPrimitive(java.lang.Boolean[] r1) {
            r0 = 0
            boolean[] r1 = toPrimitive(r1, r0)
            return r1
    }

    public static boolean[] toPrimitive(java.lang.Boolean[] r3, boolean r4) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            if (r0 != 0) goto La
            boolean[] r3 = org.apache.commons.lang3.ArrayUtils.EMPTY_BOOLEAN_ARRAY
            return r3
        La:
            int r0 = r3.length
            boolean[] r0 = new boolean[r0]
            r1 = 0
        Le:
            int r2 = r3.length
            if (r1 >= r2) goto L20
            r2 = r3[r1]
            if (r2 != 0) goto L17
            r2 = r4
            goto L1b
        L17:
            boolean r2 = r2.booleanValue()
        L1b:
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L20:
            return r0
    }

    public static java.lang.String toString(java.lang.Object r1) {
            java.lang.String r0 = "{}"
            java.lang.String r1 = toString(r1, r0)
            return r1
    }

    public static java.lang.String toString(java.lang.Object r1, java.lang.String r2) {
            if (r1 != 0) goto L3
            return r2
        L3:
            org.apache.commons.lang3.builder.ToStringBuilder r2 = new org.apache.commons.lang3.builder.ToStringBuilder
            org.apache.commons.lang3.builder.ToStringStyle r0 = org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE
            r2.<init>(r1, r0)
            org.apache.commons.lang3.builder.ToStringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static java.lang.String[] toStringArray(java.lang.Object[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            if (r0 != 0) goto La
            java.lang.String[] r3 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            return r3
        La:
            int r0 = r3.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        Le:
            int r2 = r3.length
            if (r1 >= r2) goto L1c
            r2 = r3[r1]
            java.lang.String r2 = r2.toString()
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L1c:
            return r0
    }

    public static java.lang.String[] toStringArray(java.lang.Object[] r3, java.lang.String r4) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            if (r0 != 0) goto La
            java.lang.String[] r3 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            return r3
        La:
            int r0 = r3.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        Le:
            int r2 = r3.length
            if (r1 >= r2) goto L1c
            r2 = r3[r1]
            java.lang.String r2 = java.util.Objects.toString(r2, r4)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Le
        L1c:
            return r0
    }
}
