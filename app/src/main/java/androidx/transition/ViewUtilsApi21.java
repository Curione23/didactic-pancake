package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class ViewUtilsApi21 extends androidx.transition.ViewUtilsApi19 {
    private static boolean sTryHiddenSetAnimationMatrix = true;
    private static boolean sTryHiddenTransformMatrixToGlobal = true;
    private static boolean sTryHiddenTransformMatrixToLocal = true;

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setAnimationMatrix(android.view.View r0, android.graphics.Matrix r1) {
                r0.setAnimationMatrix(r1)
                return
        }

        static void transformMatrixToGlobal(android.view.View r0, android.graphics.Matrix r1) {
                r0.transformMatrixToGlobal(r1)
                return
        }

        static void transformMatrixToLocal(android.view.View r0, android.graphics.Matrix r1) {
                r0.transformMatrixToLocal(r1)
                return
        }
    }

    static {
            return
    }

    ViewUtilsApi21() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void setAnimationMatrix(android.view.View r2, android.graphics.Matrix r3) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi21.sTryHiddenSetAnimationMatrix
            if (r0 == 0) goto Lb
            androidx.transition.ViewUtilsApi21.Api29Impl.setAnimationMatrix(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r2 = 0
            androidx.transition.ViewUtilsApi21.sTryHiddenSetAnimationMatrix = r2
        Lb:
            return
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void transformMatrixToGlobal(android.view.View r2, android.graphics.Matrix r3) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi21.sTryHiddenTransformMatrixToGlobal
            if (r0 == 0) goto Lb
            androidx.transition.ViewUtilsApi21.Api29Impl.transformMatrixToGlobal(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r2 = 0
            androidx.transition.ViewUtilsApi21.sTryHiddenTransformMatrixToGlobal = r2
        Lb:
            return
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void transformMatrixToLocal(android.view.View r2, android.graphics.Matrix r3) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi21.sTryHiddenTransformMatrixToLocal
            if (r0 == 0) goto Lb
            androidx.transition.ViewUtilsApi21.Api29Impl.transformMatrixToLocal(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r2 = 0
            androidx.transition.ViewUtilsApi21.sTryHiddenTransformMatrixToLocal = r2
        Lb:
            return
    }
}
