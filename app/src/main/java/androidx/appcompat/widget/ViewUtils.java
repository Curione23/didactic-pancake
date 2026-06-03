package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ViewUtils {
    static final boolean SDK_LEVEL_SUPPORTS_AUTOSIZE = false;
    private static final java.lang.String TAG = "ViewUtils";
    private static java.lang.reflect.Method sComputeFitSystemWindowsMethod;
    private static boolean sInitComputeFitSystemWindowsMethod;

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void computeFitSystemWindows(android.view.View r2, android.graphics.Rect r3, android.graphics.Rect r4) {
                android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                r0.<init>()
                android.graphics.Insets r1 = android.graphics.Insets.of(r3)
                android.view.WindowInsets$Builder r0 = r0.setSystemWindowInsets(r1)
                android.view.WindowInsets r0 = r0.build()
                android.view.WindowInsets r2 = r2.computeSystemWindowInsets(r0, r4)
                android.graphics.Insets r2 = r2.getSystemWindowInsets()
                int r4 = r2.left
                int r0 = r2.top
                int r1 = r2.right
                int r2 = r2.bottom
                r3.set(r4, r0, r1, r2)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE = r0
            return
    }

    private ViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void computeFitSystemWindows(android.view.View r7, android.graphics.Rect r8, android.graphics.Rect r9) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            androidx.appcompat.widget.ViewUtils.Api29Impl.computeFitSystemWindows(r7, r8, r9)
            goto L4c
        La:
            boolean r0 = androidx.appcompat.widget.ViewUtils.sInitComputeFitSystemWindowsMethod
            java.lang.String r1 = "ViewUtils"
            if (r0 != 0) goto L3a
            r0 = 1
            androidx.appcompat.widget.ViewUtils.sInitComputeFitSystemWindowsMethod = r0
            java.lang.Class<android.view.View> r2 = android.view.View.class
            java.lang.String r3 = "computeFitSystemWindows"
            r4 = 2
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L35
            java.lang.Class<android.graphics.Rect> r5 = android.graphics.Rect.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L35
            java.lang.Class<android.graphics.Rect> r5 = android.graphics.Rect.class
            r4[r0] = r5     // Catch: java.lang.NoSuchMethodException -> L35
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L35
            androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod = r2     // Catch: java.lang.NoSuchMethodException -> L35
            boolean r2 = r2.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L35
            if (r2 != 0) goto L3a
            java.lang.reflect.Method r2 = androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod     // Catch: java.lang.NoSuchMethodException -> L35
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L35
            goto L3a
        L35:
            java.lang.String r0 = "Could not find method computeFitSystemWindows. Oh well."
            android.util.Log.d(r1, r0)
        L3a:
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod
            if (r0 == 0) goto L4c
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r9}     // Catch: java.lang.Exception -> L46
            r0.invoke(r7, r8)     // Catch: java.lang.Exception -> L46
            goto L4c
        L46:
            r7 = move-exception
            java.lang.String r8 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r1, r8, r7)
        L4c:
            return
    }

    public static boolean isLayoutRtl(android.view.View r1) {
            int r1 = r1.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static void makeOptionalFitsSystemWindows(android.view.View r6) {
            java.lang.String r0 = "Could not invoke makeOptionalFitsSystemWindows"
            java.lang.String r1 = "ViewUtils"
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2b
            java.lang.String r3 = "makeOptionalFitsSystemWindows"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2b
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2b
            boolean r3 = r2.isAccessible()     // Catch: java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2b
            if (r3 != 0) goto L1b
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2b
        L1b:
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2b
            r2.invoke(r6, r3)     // Catch: java.lang.IllegalAccessException -> L21 java.lang.reflect.InvocationTargetException -> L26 java.lang.NoSuchMethodException -> L2b
            goto L30
        L21:
            r6 = move-exception
            android.util.Log.d(r1, r0, r6)
            goto L30
        L26:
            r6 = move-exception
            android.util.Log.d(r1, r0, r6)
            goto L30
        L2b:
            java.lang.String r6 = "Could not find method makeOptionalFitsSystemWindows. Oh well..."
            android.util.Log.d(r1, r6)
        L30:
            return
    }
}
