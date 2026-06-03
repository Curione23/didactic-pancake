package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class GhostViewPlatform implements androidx.transition.GhostView {
    private static final java.lang.String TAG = "GhostViewApi21";
    private static java.lang.reflect.Method sAddGhostMethod;
    private static boolean sAddGhostMethodFetched;
    private static java.lang.Class<?> sGhostViewClass;
    private static boolean sGhostViewClassFetched;
    private static java.lang.reflect.Method sRemoveGhostMethod;
    private static boolean sRemoveGhostMethodFetched;
    private final android.view.View mGhostView;

    private GhostViewPlatform(android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.mGhostView = r1
            return
    }

    static androidx.transition.GhostView addGhost(android.view.View r3, android.view.ViewGroup r4, android.graphics.Matrix r5) {
            fetchAddGhostMethod()
            java.lang.reflect.Method r0 = androidx.transition.GhostViewPlatform.sAddGhostMethod
            r1 = 0
            if (r0 == 0) goto L23
            androidx.transition.GhostViewPlatform r2 = new androidx.transition.GhostViewPlatform     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L23
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5}     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L23
            java.lang.Object r3 = r0.invoke(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L23
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L23
            r2.<init>(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L23
            return r2
        L18:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.Throwable r3 = r3.getCause()
            r4.<init>(r3)
            throw r4
        L23:
            return r1
    }

    private static void fetchAddGhostMethod() {
            boolean r0 = androidx.transition.GhostViewPlatform.sAddGhostMethodFetched
            if (r0 != 0) goto L31
            r0 = 1
            fetchGhostViewClass()     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Class<?> r1 = androidx.transition.GhostViewPlatform.sGhostViewClass     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.String r2 = "addGhost"
            r3 = 3
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Class<android.view.View> r4 = android.view.View.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Class<android.view.ViewGroup> r4 = android.view.ViewGroup.class
            r3[r0] = r4     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.Class<android.graphics.Matrix> r4 = android.graphics.Matrix.class
            r5 = 2
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L27
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L27
            androidx.transition.GhostViewPlatform.sAddGhostMethod = r1     // Catch: java.lang.NoSuchMethodException -> L27
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L27
            goto L2f
        L27:
            r1 = move-exception
            java.lang.String r2 = "GhostViewApi21"
            java.lang.String r3 = "Failed to retrieve addGhost method"
            android.util.Log.i(r2, r3, r1)
        L2f:
            androidx.transition.GhostViewPlatform.sAddGhostMethodFetched = r0
        L31:
            return
    }

    private static void fetchGhostViewClass() {
            boolean r0 = androidx.transition.GhostViewPlatform.sGhostViewClassFetched
            if (r0 != 0) goto L18
            java.lang.String r0 = "android.view.GhostView"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> Ld
            androidx.transition.GhostViewPlatform.sGhostViewClass = r0     // Catch: java.lang.ClassNotFoundException -> Ld
            goto L15
        Ld:
            r0 = move-exception
            java.lang.String r1 = "GhostViewApi21"
            java.lang.String r2 = "Failed to retrieve GhostView class"
            android.util.Log.i(r1, r2, r0)
        L15:
            r0 = 1
            androidx.transition.GhostViewPlatform.sGhostViewClassFetched = r0
        L18:
            return
    }

    private static void fetchRemoveGhostMethod() {
            boolean r0 = androidx.transition.GhostViewPlatform.sRemoveGhostMethodFetched
            if (r0 != 0) goto L27
            r0 = 1
            fetchGhostViewClass()     // Catch: java.lang.NoSuchMethodException -> L1d
            java.lang.Class<?> r1 = androidx.transition.GhostViewPlatform.sGhostViewClass     // Catch: java.lang.NoSuchMethodException -> L1d
            java.lang.String r2 = "removeGhost"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L1d
            java.lang.Class<android.view.View> r4 = android.view.View.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L1d
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L1d
            androidx.transition.GhostViewPlatform.sRemoveGhostMethod = r1     // Catch: java.lang.NoSuchMethodException -> L1d
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L1d
            goto L25
        L1d:
            r1 = move-exception
            java.lang.String r2 = "GhostViewApi21"
            java.lang.String r3 = "Failed to retrieve removeGhost method"
            android.util.Log.i(r2, r3, r1)
        L25:
            androidx.transition.GhostViewPlatform.sRemoveGhostMethodFetched = r0
        L27:
            return
    }

    static void removeGhost(android.view.View r2) {
            fetchRemoveGhostMethod()
            java.lang.reflect.Method r0 = androidx.transition.GhostViewPlatform.sRemoveGhostMethod
            if (r0 == 0) goto L1b
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L1b
            r1 = 0
            r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L1b
            goto L1b
        L10:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Throwable r2 = r2.getCause()
            r0.<init>(r2)
            throw r0
        L1b:
            return
    }

    @Override // androidx.transition.GhostView
    public void reserveEndViewTransition(android.view.ViewGroup r1, android.view.View r2) {
            r0 = this;
            return
    }

    @Override // androidx.transition.GhostView
    public void setVisibility(int r2) {
            r1 = this;
            android.view.View r0 = r1.mGhostView
            r0.setVisibility(r2)
            return
    }
}
