package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
final class WeightTypefaceApi21 {
    private static final java.lang.String NATIVE_CREATE_FROM_TYPEFACE_METHOD = "nativeCreateFromTypeface";
    private static final java.lang.String NATIVE_CREATE_WEIGHT_ALIAS_METHOD = "nativeCreateWeightAlias";
    private static final java.lang.String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final java.lang.String TAG = "WeightTypeface";
    private static final java.lang.reflect.Constructor<android.graphics.Typeface> sConstructor = null;
    private static final java.lang.reflect.Method sNativeCreateFromTypeface = null;
    private static final java.lang.reflect.Method sNativeCreateWeightAlias = null;
    private static final java.lang.reflect.Field sNativeInstance = null;
    private static final java.lang.Object sWeightCacheLock = null;
    private static final androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> sWeightTypefaceCache = null;

    static {
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r1 = "native_instance"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            java.lang.Class<android.graphics.Typeface> r1 = android.graphics.Typeface.class
            java.lang.String r2 = "nativeCreateFromTypeface"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            r1.setAccessible(r7)     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            java.lang.Class<android.graphics.Typeface> r2 = android.graphics.Typeface.class
            java.lang.String r4 = "nativeCreateWeightAlias"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            r3[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            r3[r7] = r5     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r3)     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            r2.setAccessible(r7)     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            java.lang.Class<android.graphics.Typeface> r3 = android.graphics.Typeface.class
            java.lang.Class[] r4 = new java.lang.Class[r7]     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            r4[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            r3.setAccessible(r7)     // Catch: java.lang.NoSuchMethodException -> L45 java.lang.NoSuchFieldException -> L47
            goto L59
        L45:
            r0 = move-exception
            goto L48
        L47:
            r0 = move-exception
        L48:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "WeightTypeface"
            android.util.Log.e(r2, r1, r0)
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L59:
            androidx.core.graphics.WeightTypefaceApi21.sNativeInstance = r0
            androidx.core.graphics.WeightTypefaceApi21.sNativeCreateFromTypeface = r1
            androidx.core.graphics.WeightTypefaceApi21.sNativeCreateWeightAlias = r2
            androidx.core.graphics.WeightTypefaceApi21.sConstructor = r3
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            r1 = 3
            r0.<init>(r1)
            androidx.core.graphics.WeightTypefaceApi21.sWeightTypefaceCache = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.graphics.WeightTypefaceApi21.sWeightCacheLock = r0
            return
    }

    private WeightTypefaceApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.graphics.Typeface create(long r2) {
            r0 = 0
            java.lang.reflect.Constructor<android.graphics.Typeface> r1 = androidx.core.graphics.WeightTypefaceApi21.sConstructor     // Catch: java.lang.Throwable -> L12
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L12
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            return r0
    }

    static android.graphics.Typeface createWeightStyle(android.graphics.Typeface r7, int r8, boolean r9) {
            boolean r0 = isPrivateApiAvailable()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            int r0 = r8 << 1
            r0 = r0 | r9
            java.lang.Object r1 = androidx.core.graphics.WeightTypefaceApi21.sWeightCacheLock
            monitor-enter(r1)
            long r2 = getNativeInstance(r7)     // Catch: java.lang.Throwable -> L4c
            androidx.collection.LongSparseArray<android.util.SparseArray<android.graphics.Typeface>> r4 = androidx.core.graphics.WeightTypefaceApi21.sWeightTypefaceCache     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r5 = r4.get(r2)     // Catch: java.lang.Throwable -> L4c
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L4c
            if (r5 != 0) goto L26
            android.util.SparseArray r5 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L4c
            r6 = 4
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4c
            r4.put(r2, r5)     // Catch: java.lang.Throwable -> L4c
            goto L30
        L26:
            java.lang.Object r4 = r5.get(r0)     // Catch: java.lang.Throwable -> L4c
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            return r4
        L30:
            boolean r7 = r7.isItalic()     // Catch: java.lang.Throwable -> L4c
            if (r9 != r7) goto L3f
            long r7 = nativeCreateWeightAlias(r2, r8)     // Catch: java.lang.Throwable -> L4c
            android.graphics.Typeface r7 = create(r7)     // Catch: java.lang.Throwable -> L4c
            goto L47
        L3f:
            long r7 = nativeCreateFromTypefaceWithExactStyle(r2, r8, r9)     // Catch: java.lang.Throwable -> L4c
            android.graphics.Typeface r7 = create(r7)     // Catch: java.lang.Throwable -> L4c
        L47:
            r5.put(r0, r7)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            return r7
        L4c:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            throw r7
    }

    private static long getNativeInstance(android.graphics.Typeface r2) {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi21.sNativeInstance     // Catch: java.lang.IllegalAccessException -> L7
            long r0 = r0.getLong(r2)     // Catch: java.lang.IllegalAccessException -> L7
            return r0
        L7:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    private static boolean isPrivateApiAvailable() {
            java.lang.reflect.Field r0 = androidx.core.graphics.WeightTypefaceApi21.sNativeInstance
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private static long nativeCreateFromTypefaceWithExactStyle(long r2, int r4, boolean r5) {
            if (r5 == 0) goto L4
            r5 = 2
            goto L5
        L4:
            r5 = 0
        L5:
            java.lang.reflect.Method r0 = androidx.core.graphics.WeightTypefaceApi21.sNativeCreateFromTypeface     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L3e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L3e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L3e
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L3e
            r3 = 0
            java.lang.Object r2 = r0.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L3e
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L3e
            long r0 = r2.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L3e
            java.lang.reflect.Method r2 = androidx.core.graphics.WeightTypefaceApi21.sNativeCreateWeightAlias     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L3e
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L3e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L3e
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L3e
            java.lang.Object r2 = r2.invoke(r3, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L3e
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L3e
            long r2 = r2.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L37 java.lang.IllegalAccessException -> L3e
            return r2
        L37:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
        L3e:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            r3.<init>(r2)
            throw r3
    }

    private static long nativeCreateWeightAlias(long r1, int r3) {
            java.lang.reflect.Method r0 = androidx.core.graphics.WeightTypefaceApi21.sNativeCreateWeightAlias     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            r2 = 0
            java.lang.Object r1 = r0.invoke(r2, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            long r1 = r1.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L21
            return r1
        L1a:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L21:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }
}
