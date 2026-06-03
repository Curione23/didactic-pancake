package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class SoftwareKeyboardControllerCompat {
    private final androidx.core.view.SoftwareKeyboardControllerCompat.Impl mImpl;

    private static class Impl {
        Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        void hide() {
                r0 = this;
                return
        }

        void show() {
                r0 = this;
                return
        }
    }

    private static class Impl20 extends androidx.core.view.SoftwareKeyboardControllerCompat.Impl {
        private final android.view.View mView;

        Impl20(android.view.View r1) {
                r0 = this;
                r0.<init>()
                r0.mView = r1
                return
        }

        static /* synthetic */ void lambda$show$0(android.view.View r2) {
                android.content.Context r0 = r2.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r1 = 0
                r0.showSoftInput(r2, r1)
                return
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void hide() {
                r3 = this;
                android.view.View r0 = r3.mView
                if (r0 == 0) goto L1a
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                android.view.View r1 = r3.mView
                android.os.IBinder r1 = r1.getWindowToken()
                r2 = 0
                r0.hideSoftInputFromWindow(r1, r2)
            L1a:
                return
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void show() {
                r2 = this;
                android.view.View r0 = r2.mView
                if (r0 != 0) goto L5
                return
            L5:
                boolean r1 = r0.isInEditMode()
                if (r1 != 0) goto L1b
                boolean r1 = r0.onCheckIsTextEditor()
                if (r1 == 0) goto L12
                goto L1b
            L12:
                android.view.View r0 = r0.getRootView()
                android.view.View r0 = r0.findFocus()
                goto L1e
            L1b:
                r0.requestFocus()
            L1e:
                if (r0 != 0) goto L2d
                android.view.View r0 = r2.mView
                android.view.View r0 = r0.getRootView()
                r1 = 16908290(0x1020002, float:2.3877235E-38)
                android.view.View r0 = r0.findViewById(r1)
            L2d:
                if (r0 == 0) goto L3d
                boolean r1 = r0.hasWindowFocus()
                if (r1 == 0) goto L3d
                androidx.core.view.SoftwareKeyboardControllerCompat$Impl20$$ExternalSyntheticLambda0 r1 = new androidx.core.view.SoftwareKeyboardControllerCompat$Impl20$$ExternalSyntheticLambda0
                r1.<init>(r0)
                r0.post(r1)
            L3d:
                return
        }
    }

    private static class Impl30 extends androidx.core.view.SoftwareKeyboardControllerCompat.Impl20 {
        private android.view.View mView;
        private android.view.WindowInsetsController mWindowInsetsController;

        Impl30(android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                r0.mView = r1
                return
        }

        Impl30(android.view.WindowInsetsController r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mWindowInsetsController = r2
                return
        }

        static /* synthetic */ void lambda$hide$0(java.util.concurrent.atomic.AtomicBoolean r0, android.view.WindowInsetsController r1, int r2) {
                r1 = r2 & 8
                if (r1 == 0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                r0.set(r1)
                return
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void hide() {
                r5 = this;
                android.view.WindowInsetsController r0 = r5.mWindowInsetsController
                if (r0 == 0) goto L5
                goto Lf
            L5:
                android.view.View r0 = r5.mView
                if (r0 == 0) goto Le
                android.view.WindowInsetsController r0 = r0.getWindowInsetsController()
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 == 0) goto L49
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r2 = 0
                r1.<init>(r2)
                androidx.core.view.SoftwareKeyboardControllerCompat$Impl30$$ExternalSyntheticLambda0 r3 = new androidx.core.view.SoftwareKeyboardControllerCompat$Impl30$$ExternalSyntheticLambda0
                r3.<init>(r1)
                r0.addOnControllableInsetsChangedListener(r3)
                boolean r1 = r1.get()
                if (r1 != 0) goto L3e
                android.view.View r1 = r5.mView
                if (r1 == 0) goto L3e
                android.content.Context r1 = r1.getContext()
                java.lang.String r4 = "input_method"
                java.lang.Object r1 = r1.getSystemService(r4)
                android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
                android.view.View r4 = r5.mView
                android.os.IBinder r4 = r4.getWindowToken()
                r1.hideSoftInputFromWindow(r4, r2)
            L3e:
                r0.removeOnControllableInsetsChangedListener(r3)
                int r1 = android.view.WindowInsets.Type.ime()
                r0.hide(r1)
                goto L4c
            L49:
                super.hide()
            L4c:
                return
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void show() {
                r2 = this;
                android.view.View r0 = r2.mView
                if (r0 == 0) goto L1b
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 33
                if (r0 >= r1) goto L1b
                android.view.View r0 = r2.mView
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r0.isActive()
            L1b:
                android.view.WindowInsetsController r0 = r2.mWindowInsetsController
                if (r0 == 0) goto L20
                goto L2a
            L20:
                android.view.View r0 = r2.mView
                if (r0 == 0) goto L29
                android.view.WindowInsetsController r0 = r0.getWindowInsetsController()
                goto L2a
            L29:
                r0 = 0
            L2a:
                if (r0 == 0) goto L34
                int r1 = android.view.WindowInsets.Type.ime()
                r0.show(r1)
                goto L37
            L34:
                super.show()
            L37:
                return
        }
    }

    public SoftwareKeyboardControllerCompat(android.view.View r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl30 r0 = new androidx.core.view.SoftwareKeyboardControllerCompat$Impl30
            r0.<init>(r3)
            r2.mImpl = r0
            goto L18
        L11:
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl20 r0 = new androidx.core.view.SoftwareKeyboardControllerCompat$Impl20
            r0.<init>(r3)
            r2.mImpl = r0
        L18:
            return
    }

    @java.lang.Deprecated
    SoftwareKeyboardControllerCompat(android.view.WindowInsetsController r2) {
            r1 = this;
            r1.<init>()
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl30 r0 = new androidx.core.view.SoftwareKeyboardControllerCompat$Impl30
            r0.<init>(r2)
            r1.mImpl = r0
            return
    }

    public void hide() {
            r1 = this;
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl r0 = r1.mImpl
            r0.hide()
            return
    }

    public void show() {
            r1 = this;
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl r0 = r1.mImpl
            r0.show()
            return
    }
}
