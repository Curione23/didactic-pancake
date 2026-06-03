package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsControllerCompat {
    public static final int BEHAVIOR_DEFAULT = 1;

    @java.lang.Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;

    @java.lang.Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;
    private final androidx.core.view.WindowInsetsControllerCompat.Impl mImpl;

    private static class Impl {
        Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        void addOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r1) {
                r0 = this;
                return
        }

        void controlWindowInsetsAnimation(int r1, long r2, android.view.animation.Interpolator r4, android.os.CancellationSignal r5, androidx.core.view.WindowInsetsAnimationControlListenerCompat r6) {
                r0 = this;
                return
        }

        int getSystemBarsBehavior() {
                r1 = this;
                r0 = 0
                return r0
        }

        void hide(int r1) {
                r0 = this;
                return
        }

        public boolean isAppearanceLightNavigationBars() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean isAppearanceLightStatusBars() {
                r1 = this;
                r0 = 0
                return r0
        }

        void removeOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r1) {
                r0 = this;
                return
        }

        public void setAppearanceLightNavigationBars(boolean r1) {
                r0 = this;
                return
        }

        public void setAppearanceLightStatusBars(boolean r1) {
                r0 = this;
                return
        }

        void setSystemBarsBehavior(int r1) {
                r0 = this;
                return
        }

        void show(int r1) {
                r0 = this;
                return
        }
    }

    private static class Impl20 extends androidx.core.view.WindowInsetsControllerCompat.Impl {
        private final androidx.core.view.SoftwareKeyboardControllerCompat mSoftwareKeyboardControllerCompat;
        protected final android.view.Window mWindow;

        Impl20(android.view.Window r1, androidx.core.view.SoftwareKeyboardControllerCompat r2) {
                r0 = this;
                r0.<init>()
                r0.mWindow = r1
                r0.mSoftwareKeyboardControllerCompat = r2
                return
        }

        private void hideForType(int r2) {
                r1 = this;
                r0 = 1
                if (r2 == r0) goto L15
                r0 = 2
                if (r2 == r0) goto L11
                r0 = 8
                if (r2 == r0) goto Lb
                goto L10
            Lb:
                androidx.core.view.SoftwareKeyboardControllerCompat r2 = r1.mSoftwareKeyboardControllerCompat
                r2.hide()
            L10:
                return
            L11:
                r1.setSystemUiFlag(r0)
                return
            L15:
                r2 = 4
                r1.setSystemUiFlag(r2)
                return
        }

        private void showForType(int r2) {
                r1 = this;
                r0 = 1
                if (r2 == r0) goto L15
                r0 = 2
                if (r2 == r0) goto L11
                r0 = 8
                if (r2 == r0) goto Lb
                goto L10
            Lb:
                androidx.core.view.SoftwareKeyboardControllerCompat r2 = r1.mSoftwareKeyboardControllerCompat
                r2.show()
            L10:
                return
            L11:
                r1.unsetSystemUiFlag(r0)
                return
            L15:
                r2 = 4
                r1.unsetSystemUiFlag(r2)
                r2 = 1024(0x400, float:1.435E-42)
                r1.unsetWindowFlag(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void addOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r1) {
                r0 = this;
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void controlWindowInsetsAnimation(int r1, long r2, android.view.animation.Interpolator r4, android.os.CancellationSignal r5, androidx.core.view.WindowInsetsAnimationControlListenerCompat r6) {
                r0 = this;
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        int getSystemBarsBehavior() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void hide(int r3) {
                r2 = this;
                r0 = 1
            L1:
                r1 = 256(0x100, float:3.59E-43)
                if (r0 > r1) goto L10
                r1 = r3 & r0
                if (r1 != 0) goto La
                goto Ld
            La:
                r2.hideForType(r0)
            Ld:
                int r0 = r0 << 1
                goto L1
            L10:
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void removeOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r1) {
                r0 = this;
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void setSystemBarsBehavior(int r4) {
                r3 = this;
                if (r4 == 0) goto L1b
                r0 = 1
                r1 = 2048(0x800, float:2.87E-42)
                r2 = 4096(0x1000, float:5.74E-42)
                if (r4 == r0) goto L14
                r0 = 2
                if (r4 == r0) goto Ld
                goto L20
            Ld:
                r3.unsetSystemUiFlag(r1)
                r3.setSystemUiFlag(r2)
                goto L20
            L14:
                r3.unsetSystemUiFlag(r2)
                r3.setSystemUiFlag(r1)
                goto L20
            L1b:
                r4 = 6144(0x1800, float:8.61E-42)
                r3.unsetSystemUiFlag(r4)
            L20:
                return
        }

        protected void setSystemUiFlag(int r3) {
                r2 = this;
                android.view.Window r0 = r2.mWindow
                android.view.View r0 = r0.getDecorView()
                int r1 = r0.getSystemUiVisibility()
                r3 = r3 | r1
                r0.setSystemUiVisibility(r3)
                return
        }

        protected void setWindowFlag(int r2) {
                r1 = this;
                android.view.Window r0 = r1.mWindow
                r0.addFlags(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void show(int r3) {
                r2 = this;
                r0 = 1
            L1:
                r1 = 256(0x100, float:3.59E-43)
                if (r0 > r1) goto L10
                r1 = r3 & r0
                if (r1 != 0) goto La
                goto Ld
            La:
                r2.showForType(r0)
            Ld:
                int r0 = r0 << 1
                goto L1
            L10:
                return
        }

        protected void unsetSystemUiFlag(int r3) {
                r2 = this;
                android.view.Window r0 = r2.mWindow
                android.view.View r0 = r0.getDecorView()
                int r1 = r0.getSystemUiVisibility()
                int r3 = ~r3
                r3 = r3 & r1
                r0.setSystemUiVisibility(r3)
                return
        }

        protected void unsetWindowFlag(int r2) {
                r1 = this;
                android.view.Window r0 = r1.mWindow
                r0.clearFlags(r2)
                return
        }
    }

    private static class Impl23 extends androidx.core.view.WindowInsetsControllerCompat.Impl20 {
        Impl23(android.view.Window r1, androidx.core.view.SoftwareKeyboardControllerCompat r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
                r1 = this;
                android.view.Window r0 = r1.mWindow
                android.view.View r0 = r0.getDecorView()
                int r0 = r0.getSystemUiVisibility()
                r0 = r0 & 8192(0x2000, float:1.148E-41)
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean r2) {
                r1 = this;
                r0 = 8192(0x2000, float:1.148E-41)
                if (r2 == 0) goto L12
                r2 = 67108864(0x4000000, float:1.5046328E-36)
                r1.unsetWindowFlag(r2)
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.setWindowFlag(r2)
                r1.setSystemUiFlag(r0)
                goto L15
            L12:
                r1.unsetSystemUiFlag(r0)
            L15:
                return
        }
    }

    private static class Impl26 extends androidx.core.view.WindowInsetsControllerCompat.Impl23 {
        Impl26(android.view.Window r1, androidx.core.view.SoftwareKeyboardControllerCompat r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
                r1 = this;
                android.view.Window r0 = r1.mWindow
                android.view.View r0 = r0.getDecorView()
                int r0 = r0.getSystemUiVisibility()
                r0 = r0 & 16
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean r2) {
                r1 = this;
                r0 = 16
                if (r2 == 0) goto L12
                r2 = 134217728(0x8000000, float:3.85186E-34)
                r1.unsetWindowFlag(r2)
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1.setWindowFlag(r2)
                r1.setSystemUiFlag(r0)
                goto L15
            L12:
                r1.unsetSystemUiFlag(r0)
            L15:
                return
        }
    }

    private static class Impl30 extends androidx.core.view.WindowInsetsControllerCompat.Impl {
        final androidx.core.view.WindowInsetsControllerCompat mCompatController;
        final android.view.WindowInsetsController mInsetsController;
        private final androidx.collection.SimpleArrayMap<androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener, android.view.WindowInsetsController.OnControllableInsetsChangedListener> mListeners;
        final androidx.core.view.SoftwareKeyboardControllerCompat mSoftwareKeyboardControllerCompat;
        protected android.view.Window mWindow;


        Impl30(android.view.Window r2, androidx.core.view.WindowInsetsControllerCompat r3, androidx.core.view.SoftwareKeyboardControllerCompat r4) {
                r1 = this;
                android.view.WindowInsetsController r0 = r2.getInsetsController()
                r1.<init>(r0, r3, r4)
                r1.mWindow = r2
                return
        }

        Impl30(android.view.WindowInsetsController r2, androidx.core.view.WindowInsetsControllerCompat r3, androidx.core.view.SoftwareKeyboardControllerCompat r4) {
                r1 = this;
                r1.<init>()
                androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
                r0.<init>()
                r1.mListeners = r0
                r1.mInsetsController = r2
                r1.mCompatController = r3
                r1.mSoftwareKeyboardControllerCompat = r4
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void addOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r3) {
                r2 = this;
                androidx.collection.SimpleArrayMap<androidx.core.view.WindowInsetsControllerCompat$OnControllableInsetsChangedListener, android.view.WindowInsetsController$OnControllableInsetsChangedListener> r0 = r2.mListeners
                boolean r0 = r0.containsKey(r3)
                if (r0 == 0) goto L9
                return
            L9:
                androidx.core.view.WindowInsetsControllerCompat$Impl30$$ExternalSyntheticLambda0 r0 = new androidx.core.view.WindowInsetsControllerCompat$Impl30$$ExternalSyntheticLambda0
                r0.<init>(r2, r3)
                androidx.collection.SimpleArrayMap<androidx.core.view.WindowInsetsControllerCompat$OnControllableInsetsChangedListener, android.view.WindowInsetsController$OnControllableInsetsChangedListener> r1 = r2.mListeners
                r1.put(r3, r0)
                android.view.WindowInsetsController r3 = r2.mInsetsController
                r3.addOnControllableInsetsChangedListener(r0)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void controlWindowInsetsAnimation(int r8, long r9, android.view.animation.Interpolator r11, android.os.CancellationSignal r12, androidx.core.view.WindowInsetsAnimationControlListenerCompat r13) {
                r7 = this;
                androidx.core.view.WindowInsetsControllerCompat$Impl30$1 r6 = new androidx.core.view.WindowInsetsControllerCompat$Impl30$1
                r6.<init>(r7, r13)
                android.view.WindowInsetsController r0 = r7.mInsetsController
                r1 = r8
                r2 = r9
                r4 = r11
                r5 = r12
                r0.controlWindowInsetsAnimation(r1, r2, r4, r5, r6)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        int getSystemBarsBehavior() {
                r1 = this;
                android.view.WindowInsetsController r0 = r1.mInsetsController
                int r0 = r0.getSystemBarsBehavior()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void hide(int r2) {
                r1 = this;
                r0 = r2 & 8
                if (r0 == 0) goto L9
                androidx.core.view.SoftwareKeyboardControllerCompat r0 = r1.mSoftwareKeyboardControllerCompat
                r0.hide()
            L9:
                android.view.WindowInsetsController r0 = r1.mInsetsController
                r2 = r2 & (-9)
                r0.hide(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
                r2 = this;
                android.view.WindowInsetsController r0 = r2.mInsetsController
                r1 = 0
                r0.setSystemBarsAppearance(r1, r1)
                android.view.WindowInsetsController r0 = r2.mInsetsController
                int r0 = r0.getSystemBarsAppearance()
                r0 = r0 & 16
                if (r0 == 0) goto L11
                r1 = 1
            L11:
                return r1
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
                r2 = this;
                android.view.WindowInsetsController r0 = r2.mInsetsController
                r1 = 0
                r0.setSystemBarsAppearance(r1, r1)
                android.view.WindowInsetsController r0 = r2.mInsetsController
                int r0 = r0.getSystemBarsAppearance()
                r0 = r0 & 8
                if (r0 == 0) goto L11
                r1 = 1
            L11:
                return r1
        }

        /* JADX INFO: renamed from: lambda$addOnControllableInsetsChangedListener$0$androidx-core-view-WindowInsetsControllerCompat$Impl30, reason: not valid java name */
        /* synthetic */ void m46xe96d8c51(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r2, android.view.WindowInsetsController r3, int r4) {
                r1 = this;
                android.view.WindowInsetsController r0 = r1.mInsetsController
                if (r0 != r3) goto L9
                androidx.core.view.WindowInsetsControllerCompat r3 = r1.mCompatController
                r2.onControllableInsetsChanged(r3, r4)
            L9:
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void removeOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r2) {
                r1 = this;
                androidx.collection.SimpleArrayMap<androidx.core.view.WindowInsetsControllerCompat$OnControllableInsetsChangedListener, android.view.WindowInsetsController$OnControllableInsetsChangedListener> r0 = r1.mListeners
                java.lang.Object r2 = r0.remove(r2)
                android.view.WindowInsetsController$OnControllableInsetsChangedListener r2 = (android.view.WindowInsetsController.OnControllableInsetsChangedListener) r2
                if (r2 == 0) goto Lf
                android.view.WindowInsetsController r0 = r1.mInsetsController
                r0.removeOnControllableInsetsChangedListener(r2)
            Lf:
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean r3) {
                r2 = this;
                r0 = 16
                if (r3 == 0) goto L11
                android.view.Window r3 = r2.mWindow
                if (r3 == 0) goto Lb
                r2.setSystemUiFlag(r0)
            Lb:
                android.view.WindowInsetsController r3 = r2.mInsetsController
                r3.setSystemBarsAppearance(r0, r0)
                goto L1e
            L11:
                android.view.Window r3 = r2.mWindow
                if (r3 == 0) goto L18
                r2.unsetSystemUiFlag(r0)
            L18:
                android.view.WindowInsetsController r3 = r2.mInsetsController
                r1 = 0
                r3.setSystemBarsAppearance(r1, r0)
            L1e:
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean r3) {
                r2 = this;
                r0 = 8192(0x2000, float:1.148E-41)
                r1 = 8
                if (r3 == 0) goto L13
                android.view.Window r3 = r2.mWindow
                if (r3 == 0) goto Ld
                r2.setSystemUiFlag(r0)
            Ld:
                android.view.WindowInsetsController r3 = r2.mInsetsController
                r3.setSystemBarsAppearance(r1, r1)
                goto L20
            L13:
                android.view.Window r3 = r2.mWindow
                if (r3 == 0) goto L1a
                r2.unsetSystemUiFlag(r0)
            L1a:
                android.view.WindowInsetsController r3 = r2.mInsetsController
                r0 = 0
                r3.setSystemBarsAppearance(r0, r1)
            L20:
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void setSystemBarsBehavior(int r2) {
                r1 = this;
                android.view.WindowInsetsController r0 = r1.mInsetsController
                r0.setSystemBarsBehavior(r2)
                return
        }

        protected void setSystemUiFlag(int r3) {
                r2 = this;
                android.view.Window r0 = r2.mWindow
                android.view.View r0 = r0.getDecorView()
                int r1 = r0.getSystemUiVisibility()
                r3 = r3 | r1
                r0.setSystemUiVisibility(r3)
                return
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void show(int r2) {
                r1 = this;
                r0 = r2 & 8
                if (r0 == 0) goto L9
                androidx.core.view.SoftwareKeyboardControllerCompat r0 = r1.mSoftwareKeyboardControllerCompat
                r0.show()
            L9:
                android.view.WindowInsetsController r0 = r1.mInsetsController
                r2 = r2 & (-9)
                r0.show(r2)
                return
        }

        protected void unsetSystemUiFlag(int r3) {
                r2 = this;
                android.view.Window r0 = r2.mWindow
                android.view.View r0 = r0.getDecorView()
                int r1 = r0.getSystemUiVisibility()
                int r3 = ~r3
                r3 = r3 & r1
                r0.setSystemUiVisibility(r3)
                return
        }
    }

    public interface OnControllableInsetsChangedListener {
        void onControllableInsetsChanged(androidx.core.view.WindowInsetsControllerCompat r1, int r2);
    }

    public WindowInsetsControllerCompat(android.view.Window r3, android.view.View r4) {
            r2 = this;
            r2.<init>()
            androidx.core.view.SoftwareKeyboardControllerCompat r0 = new androidx.core.view.SoftwareKeyboardControllerCompat
            r0.<init>(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r4 < r1) goto L16
            androidx.core.view.WindowInsetsControllerCompat$Impl30 r4 = new androidx.core.view.WindowInsetsControllerCompat$Impl30
            r4.<init>(r3, r2, r0)
            r2.mImpl = r4
            goto L1d
        L16:
            androidx.core.view.WindowInsetsControllerCompat$Impl26 r4 = new androidx.core.view.WindowInsetsControllerCompat$Impl26
            r4.<init>(r3, r0)
            r2.mImpl = r4
        L1d:
            return
    }

    @java.lang.Deprecated
    private WindowInsetsControllerCompat(android.view.WindowInsetsController r3) {
            r2 = this;
            r2.<init>()
            androidx.core.view.WindowInsetsControllerCompat$Impl30 r0 = new androidx.core.view.WindowInsetsControllerCompat$Impl30
            androidx.core.view.SoftwareKeyboardControllerCompat r1 = new androidx.core.view.SoftwareKeyboardControllerCompat
            r1.<init>(r3)
            r0.<init>(r3, r2, r1)
            r2.mImpl = r0
            return
    }

    @java.lang.Deprecated
    public static androidx.core.view.WindowInsetsControllerCompat toWindowInsetsControllerCompat(android.view.WindowInsetsController r1) {
            androidx.core.view.WindowInsetsControllerCompat r0 = new androidx.core.view.WindowInsetsControllerCompat
            r0.<init>(r1)
            return r0
    }

    public void addOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r2) {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            r0.addOnControllableInsetsChangedListener(r2)
            return
    }

    public void controlWindowInsetsAnimation(int r8, long r9, android.view.animation.Interpolator r11, android.os.CancellationSignal r12, androidx.core.view.WindowInsetsAnimationControlListenerCompat r13) {
            r7 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r7.mImpl
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r0.controlWindowInsetsAnimation(r1, r2, r4, r5, r6)
            return
    }

    public int getSystemBarsBehavior() {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            int r0 = r0.getSystemBarsBehavior()
            return r0
    }

    public void hide(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            r0.hide(r2)
            return
    }

    public boolean isAppearanceLightNavigationBars() {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            boolean r0 = r0.isAppearanceLightNavigationBars()
            return r0
    }

    public boolean isAppearanceLightStatusBars() {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            boolean r0 = r0.isAppearanceLightStatusBars()
            return r0
    }

    public void removeOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener r2) {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            r0.removeOnControllableInsetsChangedListener(r2)
            return
    }

    public void setAppearanceLightNavigationBars(boolean r2) {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            r0.setAppearanceLightNavigationBars(r2)
            return
    }

    public void setAppearanceLightStatusBars(boolean r2) {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            r0.setAppearanceLightStatusBars(r2)
            return
    }

    public void setSystemBarsBehavior(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            r0.setSystemBarsBehavior(r2)
            return
    }

    public void show(int r2) {
            r1 = this;
            androidx.core.view.WindowInsetsControllerCompat$Impl r0 = r1.mImpl
            r0.show(r2)
            return
    }
}
