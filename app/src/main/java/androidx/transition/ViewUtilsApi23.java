package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class ViewUtilsApi23 extends androidx.transition.ViewUtilsApi22 {
    private static boolean sTryHiddenSetTransitionVisibility = true;

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setTransitionVisibility(android.view.View r0, int r1) {
                r0.setTransitionVisibility(r1)
                return
        }
    }

    static {
            return
    }

    ViewUtilsApi23() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void setTransitionVisibility(android.view.View r3, int r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 != r1) goto La
            super.setTransitionVisibility(r3, r4)
            goto L15
        La:
            boolean r0 = androidx.transition.ViewUtilsApi23.sTryHiddenSetTransitionVisibility
            if (r0 == 0) goto L15
            androidx.transition.ViewUtilsApi23.Api29Impl.setTransitionVisibility(r3, r4)     // Catch: java.lang.NoSuchMethodError -> L12
            goto L15
        L12:
            r3 = 0
            androidx.transition.ViewUtilsApi23.sTryHiddenSetTransitionVisibility = r3
        L15:
            return
    }
}
