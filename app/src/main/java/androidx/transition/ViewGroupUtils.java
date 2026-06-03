package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class ViewGroupUtils {
    private static java.lang.reflect.Method sGetChildDrawingOrderMethod = null;
    private static boolean sGetChildDrawingOrderMethodFetched = false;
    private static boolean sTryHiddenSuppressLayout = true;

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getChildDrawingOrder(android.view.ViewGroup r0, int r1) {
                int r0 = r0.getChildDrawingOrder(r1)
                return r0
        }

        static void suppressLayout(android.view.ViewGroup r0, boolean r1) {
                r0.suppressLayout(r1)
                return
        }
    }

    static {
            return
    }

    private ViewGroupUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static int getChildDrawingOrder(android.view.ViewGroup r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            int r6 = androidx.transition.ViewGroupUtils.Api29Impl.getChildDrawingOrder(r6, r7)
            return r6
        Lb:
            boolean r0 = androidx.transition.ViewGroupUtils.sGetChildDrawingOrderMethodFetched
            if (r0 != 0) goto L2b
            r0 = 1
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            java.lang.String r2 = "getChildDrawingOrder"
            r3 = 2
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L29
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L29
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L29
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L29
            r3[r0] = r4     // Catch: java.lang.NoSuchMethodException -> L29
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L29
            androidx.transition.ViewGroupUtils.sGetChildDrawingOrderMethod = r1     // Catch: java.lang.NoSuchMethodException -> L29
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L29
        L29:
            androidx.transition.ViewGroupUtils.sGetChildDrawingOrderMethodFetched = r0
        L2b:
            java.lang.reflect.Method r0 = androidx.transition.ViewGroupUtils.sGetChildDrawingOrderMethod
            if (r0 == 0) goto L4a
            int r1 = r6.getChildCount()     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r6 = r0.invoke(r6, r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L4a
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L4a
            return r6
        L4a:
            return r7
    }

    private static void hiddenSuppressLayout(android.view.ViewGroup r1, boolean r2) {
            boolean r0 = androidx.transition.ViewGroupUtils.sTryHiddenSuppressLayout
            if (r0 == 0) goto Lb
            androidx.transition.ViewGroupUtils.Api29Impl.suppressLayout(r1, r2)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r1 = 0
            androidx.transition.ViewGroupUtils.sTryHiddenSuppressLayout = r1
        Lb:
            return
    }

    static void suppressLayout(android.view.ViewGroup r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            androidx.transition.ViewGroupUtils.Api29Impl.suppressLayout(r2, r3)
            goto Ld
        La:
            hiddenSuppressLayout(r2, r3)
        Ld:
            return
    }
}
