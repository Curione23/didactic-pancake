package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatApi28Impl extends androidx.core.graphics.TypefaceCompatApi26Impl {
    private static final java.lang.String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final java.lang.String DEFAULT_FAMILY = "sans-serif";
    private static final int RESOLVE_BY_FONT_TABLE = -1;

    public TypefaceCompatApi28Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.core.graphics.TypefaceCompatApi26Impl
    protected android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object r5) {
            r4 = this;
            java.lang.Class<?> r0 = r4.mFontFamily     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r1 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r1 = 0
            java.lang.reflect.Array.set(r0, r1, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.reflect.Method r5 = r4.mCreateFromFamiliesWithDefault     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.String r1 = "sans-serif"
            r2 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r3, r2}     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r1 = 0
            java.lang.Object r5 = r5.invoke(r1, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            return r5
        L24:
            r5 = move-exception
            goto L27
        L26:
            r5 = move-exception
        L27:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
    }

    @Override // androidx.core.graphics.TypefaceCompatApi26Impl, androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    android.graphics.Typeface createWeightStyle(android.content.Context r1, android.graphics.Typeface r2, int r3, boolean r4) {
            r0 = this;
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r2, r3, r4)
            return r1
    }

    @Override // androidx.core.graphics.TypefaceCompatApi26Impl
    protected java.lang.reflect.Method obtainCreateFromFamiliesWithDefaultMethod(java.lang.Class<?> r5) throws java.lang.NoSuchMethodException {
            r4 = this;
            r0 = 1
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r0)
            java.lang.Class<android.graphics.Typeface> r1 = android.graphics.Typeface.class
            r2 = 4
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = 0
            java.lang.Class r5 = r5.getClass()
            r2[r3] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r2[r0] = r5
            r5 = 2
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r5] = r3
            r5 = 3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r5] = r3
            java.lang.String r5 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r2)
            r5.setAccessible(r0)
            return r5
    }
}
