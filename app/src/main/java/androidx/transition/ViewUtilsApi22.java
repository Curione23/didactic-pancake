package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class ViewUtilsApi22 extends androidx.transition.ViewUtilsApi21 {
    private static boolean sTryHiddenSetLeftTopRightBottom = true;

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setLeftTopRightBottom(android.view.View r0, int r1, int r2, int r3, int r4) {
                r0.setLeftTopRightBottom(r1, r2, r3, r4)
                return
        }
    }

    static {
            return
    }

    ViewUtilsApi22() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void setLeftTopRightBottom(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            boolean r0 = androidx.transition.ViewUtilsApi22.sTryHiddenSetLeftTopRightBottom
            if (r0 == 0) goto Lb
            androidx.transition.ViewUtilsApi22.Api29Impl.setLeftTopRightBottom(r2, r3, r4, r5, r6)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r2 = 0
            androidx.transition.ViewUtilsApi22.sTryHiddenSetLeftTopRightBottom = r2
        Lb:
            return
    }
}
