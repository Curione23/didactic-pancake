package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class AppCompatDelegateImpl extends androidx.appcompat.app.AppCompatDelegate implements androidx.appcompat.view.menu.MenuBuilder.Callback, android.view.LayoutInflater.Factory2 {
    static final java.lang.String EXCEPTION_HANDLER_MESSAGE_SUFFIX = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    private static final boolean IS_PRE_LOLLIPOP = false;
    private static final boolean sCanReturnDifferentContext = false;
    private static boolean sInstalledExceptionHandler;
    private static final androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> sLocalNightModes = null;
    private static final int[] sWindowBackgroundStyleable = null;
    androidx.appcompat.app.ActionBar mActionBar;
    private androidx.appcompat.app.AppCompatDelegateImpl.ActionMenuPresenterCallback mActionMenuPresenterCallback;
    androidx.appcompat.view.ActionMode mActionMode;
    android.widget.PopupWindow mActionModePopup;
    androidx.appcompat.widget.ActionBarContextView mActionModeView;
    private int mActivityHandlesConfigFlags;
    private boolean mActivityHandlesConfigFlagsChecked;
    final androidx.appcompat.app.AppCompatCallback mAppCompatCallback;
    private androidx.appcompat.app.AppCompatViewInflater mAppCompatViewInflater;
    private androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback mAppCompatWindowCallback;
    private androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager mAutoBatteryNightModeManager;
    private androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager mAutoTimeNightModeManager;
    private android.window.OnBackInvokedCallback mBackCallback;
    private boolean mBaseContextAttached;
    private boolean mClosingActionMenu;
    final android.content.Context mContext;
    private boolean mCreated;
    private androidx.appcompat.widget.DecorContentParent mDecorContentParent;
    boolean mDestroyed;
    private android.window.OnBackInvokedDispatcher mDispatcher;
    private android.content.res.Configuration mEffectiveConfiguration;
    private boolean mEnableDefaultActionBarUp;
    androidx.core.view.ViewPropertyAnimatorCompat mFadeAnim;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private boolean mHandleNativeActionModes;
    boolean mHasActionBar;
    final java.lang.Object mHost;
    int mInvalidatePanelMenuFeatures;
    boolean mInvalidatePanelMenuPosted;
    private final java.lang.Runnable mInvalidatePanelMenuRunnable;
    boolean mIsFloating;
    private androidx.appcompat.app.LayoutIncludeDetector mLayoutIncludeDetector;
    private int mLocalNightMode;
    private boolean mLongPressBackDown;
    android.view.MenuInflater mMenuInflater;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    private androidx.appcompat.app.AppCompatDelegateImpl.PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[] mPanels;
    private androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState mPreparedPanel;
    java.lang.Runnable mShowActionModePopup;
    private android.view.View mStatusGuard;
    android.view.ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private android.graphics.Rect mTempRect1;
    private android.graphics.Rect mTempRect2;
    private int mThemeResId;
    private java.lang.CharSequence mTitle;
    private android.widget.TextView mTitleView;
    android.view.Window mWindow;
    boolean mWindowNoTitle;

    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$1, reason: invalid class name */
    class AnonymousClass1 implements java.lang.Thread.UncaughtExceptionHandler {
        final /* synthetic */ java.lang.Thread.UncaughtExceptionHandler val$defHandler;

        AnonymousClass1(java.lang.Thread.UncaughtExceptionHandler r1) {
                r0 = this;
                r0.val$defHandler = r1
                r0.<init>()
                return
        }

        private boolean shouldWrapException(java.lang.Throwable r3) {
                r2 = this;
                boolean r0 = r3 instanceof android.content.res.Resources.NotFoundException
                r1 = 0
                if (r0 == 0) goto L1c
                java.lang.String r3 = r3.getMessage()
                if (r3 == 0) goto L1c
                java.lang.String r0 = "drawable"
                boolean r0 = r3.contains(r0)
                if (r0 != 0) goto L1b
                java.lang.String r0 = "Drawable"
                boolean r3 = r3.contains(r0)
                if (r3 == 0) goto L1c
            L1b:
                r1 = 1
            L1c:
                return r1
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(java.lang.Thread r4, java.lang.Throwable r5) {
                r3 = this;
                boolean r0 = r3.shouldWrapException(r5)
                if (r0 == 0) goto L36
                android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r5.getMessage()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info."
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                java.lang.Throwable r1 = r5.getCause()
                r0.initCause(r1)
                java.lang.StackTraceElement[] r5 = r5.getStackTrace()
                r0.setStackTrace(r5)
                java.lang.Thread$UncaughtExceptionHandler r5 = r3.val$defHandler
                r5.uncaughtException(r4, r0)
                goto L3b
            L36:
                java.lang.Thread$UncaughtExceptionHandler r0 = r3.val$defHandler
                r0.uncaughtException(r4, r5)
            L3b:
                return
        }
    }



    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$4, reason: invalid class name */
    class AnonymousClass4 implements androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener {
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        AnonymousClass4(androidx.appcompat.app.AppCompatDelegateImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
        public void onFitSystemWindows(android.graphics.Rect r3) {
                r2 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r2.this$0
                r1 = 0
                int r0 = r0.updateStatusGuard(r1, r3)
                r3.top = r0
                return
        }
    }




    private class ActionBarDrawableToggleImpl implements androidx.appcompat.app.ActionBarDrawerToggle.Delegate {
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        ActionBarDrawableToggleImpl(androidx.appcompat.app.AppCompatDelegateImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.content.Context getActionBarThemedContext() {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                android.content.Context r0 = r0.getActionBarThemedContext()
                return r0
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.graphics.drawable.Drawable getThemeUpIndicator() {
                r3 = this;
                android.content.Context r0 = r3.getActionBarThemedContext()
                int r1 = androidx.appcompat.R.attr.homeAsUpIndicator
                int[] r1 = new int[]{r1}
                r2 = 0
                androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r2, r1)
                r1 = 0
                android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
                r0.recycle()
                return r1
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                androidx.appcompat.app.ActionBar r0 = r0.getSupportActionBar()
                if (r0 == 0) goto L12
                int r0 = r0.getDisplayOptions()
                r0 = r0 & 4
                if (r0 == 0) goto L12
                r0 = 1
                goto L13
            L12:
                r0 = 0
            L13:
                return r0
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int r2) {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                androidx.appcompat.app.ActionBar r0 = r0.getSupportActionBar()
                if (r0 == 0) goto Lb
                r0.setHomeActionContentDescription(r2)
            Lb:
                return
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(android.graphics.drawable.Drawable r2, int r3) {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                androidx.appcompat.app.ActionBar r0 = r0.getSupportActionBar()
                if (r0 == 0) goto Le
                r0.setHomeAsUpIndicator(r2)
                r0.setHomeActionContentDescription(r3)
            Le:
                return
        }
    }

    interface ActionBarMenuCallback {
        android.view.View onCreatePanelView(int r1);

        boolean onPreparePanel(int r1);
    }

    private final class ActionMenuPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        ActionMenuPresenterCallback(androidx.appcompat.app.AppCompatDelegateImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r1, boolean r2) {
                r0 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r2 = r0.this$0
                r2.checkCloseActionMenu(r1)
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder r3) {
                r2 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r2.this$0
                android.view.Window$Callback r0 = r0.getWindowCallback()
                if (r0 == 0) goto Ld
                r1 = 108(0x6c, float:1.51E-43)
                r0.onMenuOpened(r1, r3)
            Ld:
                r3 = 1
                return r3
        }
    }

    class ActionModeCallbackWrapperV9 implements androidx.appcompat.view.ActionMode.Callback {
        private androidx.appcompat.view.ActionMode.Callback mWrapped;
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;


        public ActionModeCallbackWrapperV9(androidx.appcompat.app.AppCompatDelegateImpl r1, androidx.appcompat.view.ActionMode.Callback r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mWrapped = r2
                return
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onActionItemClicked(androidx.appcompat.view.ActionMode r2, android.view.MenuItem r3) {
                r1 = this;
                androidx.appcompat.view.ActionMode$Callback r0 = r1.mWrapped
                boolean r2 = r0.onActionItemClicked(r2, r3)
                return r2
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onCreateActionMode(androidx.appcompat.view.ActionMode r2, android.view.Menu r3) {
                r1 = this;
                androidx.appcompat.view.ActionMode$Callback r0 = r1.mWrapped
                boolean r2 = r0.onCreateActionMode(r2, r3)
                return r2
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void onDestroyActionMode(androidx.appcompat.view.ActionMode r3) {
                r2 = this;
                androidx.appcompat.view.ActionMode$Callback r0 = r2.mWrapped
                r0.onDestroyActionMode(r3)
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r2.this$0
                android.widget.PopupWindow r3 = r3.mActionModePopup
                if (r3 == 0) goto L1a
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r2.this$0
                android.view.Window r3 = r3.mWindow
                android.view.View r3 = r3.getDecorView()
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r2.this$0
                java.lang.Runnable r0 = r0.mShowActionModePopup
                r3.removeCallbacks(r0)
            L1a:
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r2.this$0
                androidx.appcompat.widget.ActionBarContextView r3 = r3.mActionModeView
                if (r3 == 0) goto L40
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r2.this$0
                r3.endOnGoingFadeAnimation()
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r2.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r3.mActionModeView
                androidx.core.view.ViewPropertyAnimatorCompat r0 = androidx.core.view.ViewCompat.animate(r0)
                r1 = 0
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r0.alpha(r1)
                r3.mFadeAnim = r0
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r2.this$0
                androidx.core.view.ViewPropertyAnimatorCompat r3 = r3.mFadeAnim
                androidx.appcompat.app.AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1
                r0.<init>(r2)
                r3.setListener(r0)
            L40:
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r2.this$0
                androidx.appcompat.app.AppCompatCallback r3 = r3.mAppCompatCallback
                if (r3 == 0) goto L51
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r2.this$0
                androidx.appcompat.app.AppCompatCallback r3 = r3.mAppCompatCallback
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r2.this$0
                androidx.appcompat.view.ActionMode r0 = r0.mActionMode
                r3.onSupportActionModeFinished(r0)
            L51:
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r2.this$0
                r0 = 0
                r3.mActionMode = r0
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r2.this$0
                android.view.ViewGroup r3 = r3.mSubDecor
                androidx.core.view.ViewCompat.requestApplyInsets(r3)
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r2.this$0
                r3.updateBackInvokedCallbackState()
                return
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onPrepareActionMode(androidx.appcompat.view.ActionMode r2, android.view.Menu r3) {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                android.view.ViewGroup r0 = r0.mSubDecor
                androidx.core.view.ViewCompat.requestApplyInsets(r0)
                androidx.appcompat.view.ActionMode$Callback r0 = r1.mWrapped
                boolean r2 = r0.onPrepareActionMode(r2, r3)
                return r2
        }
    }

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isPowerSaveMode(android.os.PowerManager r0) {
                boolean r0 = r0.isPowerSaveMode()
                return r0
        }

        static java.lang.String toLanguageTag(java.util.Locale r0) {
                java.lang.String r0 = r0.toLanguageTag()
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void generateConfigDelta_locale(android.content.res.Configuration r1, android.content.res.Configuration r2, android.content.res.Configuration r3) {
                android.os.LocaleList r1 = r1.getLocales()
                android.os.LocaleList r0 = r2.getLocales()
                boolean r1 = r1.equals(r0)
                if (r1 != 0) goto L15
                r3.setLocales(r0)
                java.util.Locale r1 = r2.locale
                r3.locale = r1
            L15:
                return
        }

        static androidx.core.os.LocaleListCompat getLocales(android.content.res.Configuration r0) {
                android.os.LocaleList r0 = r0.getLocales()
                java.lang.String r0 = r0.toLanguageTags()
                androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.forLanguageTags(r0)
                return r0
        }

        public static void setDefaultLocales(androidx.core.os.LocaleListCompat r0) {
                java.lang.String r0 = r0.toLanguageTags()
                android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
                android.os.LocaleList.setDefault(r0)
                return
        }

        static void setLocales(android.content.res.Configuration r0, androidx.core.os.LocaleListCompat r1) {
                java.lang.String r1 = r1.toLanguageTags()
                android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r1)
                r0.setLocales(r1)
                return
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void generateConfigDelta_colorMode(android.content.res.Configuration r2, android.content.res.Configuration r3, android.content.res.Configuration r4) {
                int r0 = r2.colorMode
                r0 = r0 & 3
                int r1 = r3.colorMode
                r1 = r1 & 3
                if (r0 == r1) goto L13
                int r0 = r4.colorMode
                int r1 = r3.colorMode
                r1 = r1 & 3
                r0 = r0 | r1
                r4.colorMode = r0
            L13:
                int r2 = r2.colorMode
                r2 = r2 & 12
                int r0 = r3.colorMode
                r0 = r0 & 12
                if (r2 == r0) goto L26
                int r2 = r4.colorMode
                int r3 = r3.colorMode
                r3 = r3 & 12
                r2 = r2 | r3
                r4.colorMode = r2
            L26:
                return
        }
    }

    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher(android.app.Activity r0) {
                android.window.OnBackInvokedDispatcher r0 = r0.getOnBackInvokedDispatcher()
                return r0
        }

        static android.window.OnBackInvokedCallback registerOnBackPressedCallback(java.lang.Object r1, androidx.appcompat.app.AppCompatDelegateImpl r2) {
                java.util.Objects.requireNonNull(r2)
                androidx.appcompat.app.AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticLambda0 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticLambda0
                r0.<init>(r2)
                android.window.OnBackInvokedDispatcher r1 = (android.window.OnBackInvokedDispatcher) r1
                r2 = 1000000(0xf4240, float:1.401298E-39)
                r1.registerOnBackInvokedCallback(r2, r0)
                return r0
        }

        static void unregisterOnBackInvokedCallback(java.lang.Object r0, java.lang.Object r1) {
                android.window.OnBackInvokedCallback r1 = (android.window.OnBackInvokedCallback) r1
                android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
                r0.unregisterOnBackInvokedCallback(r1)
                return
        }
    }

    class AppCompatWindowCallback extends androidx.appcompat.view.WindowCallbackWrapper {
        private androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback mActionBarCallback;
        private boolean mDispatchKeyEventBypassEnabled;
        private boolean mOnContentChangedBypassEnabled;
        private boolean mOnPanelClosedBypassEnabled;
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        AppCompatWindowCallback(androidx.appcompat.app.AppCompatDelegateImpl r1, android.view.Window.Callback r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        public boolean bypassDispatchKeyEvent(android.view.Window.Callback r3, android.view.KeyEvent r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.mDispatchKeyEventBypassEnabled = r0     // Catch: java.lang.Throwable -> Lb
                boolean r3 = r3.dispatchKeyEvent(r4)     // Catch: java.lang.Throwable -> Lb
                r2.mDispatchKeyEventBypassEnabled = r1
                return r3
            Lb:
                r3 = move-exception
                r2.mDispatchKeyEventBypassEnabled = r1
                throw r3
        }

        public void bypassOnContentChanged(android.view.Window.Callback r3) {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.mOnContentChangedBypassEnabled = r0     // Catch: java.lang.Throwable -> La
                r3.onContentChanged()     // Catch: java.lang.Throwable -> La
                r2.mOnContentChangedBypassEnabled = r1
                return
            La:
                r3 = move-exception
                r2.mOnContentChangedBypassEnabled = r1
                throw r3
        }

        public void bypassOnPanelClosed(android.view.Window.Callback r3, int r4, android.view.Menu r5) {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.mOnPanelClosedBypassEnabled = r0     // Catch: java.lang.Throwable -> La
                r3.onPanelClosed(r4, r5)     // Catch: java.lang.Throwable -> La
                r2.mOnPanelClosedBypassEnabled = r1
                return
            La:
                r3 = move-exception
                r2.mOnPanelClosedBypassEnabled = r1
                throw r3
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
                r1 = this;
                boolean r0 = r1.mDispatchKeyEventBypassEnabled
                if (r0 == 0) goto Ld
                android.view.Window$Callback r0 = r1.getWrapped()
                boolean r2 = r0.dispatchKeyEvent(r2)
                return r2
            Ld:
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                boolean r0 = r0.dispatchKeyEvent(r2)
                if (r0 != 0) goto L1e
                boolean r2 = super.dispatchKeyEvent(r2)
                if (r2 == 0) goto L1c
                goto L1e
            L1c:
                r2 = 0
                goto L1f
            L1e:
                r2 = 1
            L1f:
                return r2
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r3) {
                r2 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r3)
                if (r0 != 0) goto L15
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r2.this$0
                int r1 = r3.getKeyCode()
                boolean r3 = r0.onKeyShortcut(r1, r3)
                if (r3 == 0) goto L13
                goto L15
            L13:
                r3 = 0
                goto L16
            L15:
                r3 = 1
            L16:
                return r3
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
                r1 = this;
                boolean r0 = r1.mOnContentChangedBypassEnabled
                if (r0 == 0) goto Lb
                android.view.Window$Callback r0 = r1.getWrapped()
                r0.onContentChanged()
            Lb:
                return
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
                r1 = this;
                if (r2 != 0) goto L8
                boolean r0 = r3 instanceof androidx.appcompat.view.menu.MenuBuilder
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                boolean r2 = super.onCreatePanelMenu(r2, r3)
                return r2
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.View onCreatePanelView(int r2) {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl$ActionBarMenuCallback r0 = r1.mActionBarCallback
                if (r0 == 0) goto Lb
                android.view.View r0 = r0.onCreatePanelView(r2)
                if (r0 == 0) goto Lb
                return r0
            Lb:
                android.view.View r2 = super.onCreatePanelView(r2)
                return r2
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int r1, android.view.Menu r2) {
                r0 = this;
                super.onMenuOpened(r1, r2)
                androidx.appcompat.app.AppCompatDelegateImpl r2 = r0.this$0
                r2.onMenuOpened(r1)
                r1 = 1
                return r1
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int r2, android.view.Menu r3) {
                r1 = this;
                boolean r0 = r1.mOnPanelClosedBypassEnabled
                if (r0 == 0) goto Lc
                android.view.Window$Callback r0 = r1.getWrapped()
                r0.onPanelClosed(r2, r3)
                return
            Lc:
                super.onPanelClosed(r2, r3)
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r1.this$0
                r3.onPanelClosed(r2)
                return
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int r5, android.view.View r6, android.view.Menu r7) {
                r4 = this;
                boolean r0 = r7 instanceof androidx.appcompat.view.menu.MenuBuilder
                if (r0 == 0) goto L8
                r0 = r7
                androidx.appcompat.view.menu.MenuBuilder r0 = (androidx.appcompat.view.menu.MenuBuilder) r0
                goto L9
            L8:
                r0 = 0
            L9:
                r1 = 0
                if (r5 != 0) goto Lf
                if (r0 != 0) goto Lf
                return r1
            Lf:
                r2 = 1
                if (r0 == 0) goto L15
                r0.setOverrideVisibleItems(r2)
            L15:
                androidx.appcompat.app.AppCompatDelegateImpl$ActionBarMenuCallback r3 = r4.mActionBarCallback
                if (r3 == 0) goto L20
                boolean r3 = r3.onPreparePanel(r5)
                if (r3 == 0) goto L20
                goto L21
            L20:
                r2 = r1
            L21:
                if (r2 != 0) goto L27
                boolean r2 = super.onPreparePanel(r5, r6, r7)
            L27:
                if (r0 == 0) goto L2c
                r0.setOverrideVisibleItems(r1)
            L2c:
                return r2
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> r4, android.view.Menu r5, int r6) {
                r3 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r3.this$0
                r1 = 0
                r2 = 1
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r0.getPanelState(r1, r2)
                if (r0 == 0) goto L14
                androidx.appcompat.view.menu.MenuBuilder r1 = r0.menu
                if (r1 == 0) goto L14
                androidx.appcompat.view.menu.MenuBuilder r5 = r0.menu
                super.onProvideKeyboardShortcuts(r4, r5, r6)
                goto L17
            L14:
                super.onProvideKeyboardShortcuts(r4, r5, r6)
            L17:
                return
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2, int r3) {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                boolean r0 = r0.isHandleNativeActionModesEnabled()
                if (r0 == 0) goto L10
                if (r3 == 0) goto Lb
                goto L10
            Lb:
                android.view.ActionMode r2 = r1.startAsSupportActionMode(r2)
                return r2
            L10:
                android.view.ActionMode r2 = super.onWindowStartingActionMode(r2, r3)
                return r2
        }

        void setActionBarCallback(androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback r1) {
                r0 = this;
                r0.mActionBarCallback = r1
                return
        }

        final android.view.ActionMode startAsSupportActionMode(android.view.ActionMode.Callback r3) {
                r2 = this;
                androidx.appcompat.view.SupportActionModeWrapper$CallbackWrapper r0 = new androidx.appcompat.view.SupportActionModeWrapper$CallbackWrapper
                androidx.appcompat.app.AppCompatDelegateImpl r1 = r2.this$0
                android.content.Context r1 = r1.mContext
                r0.<init>(r1, r3)
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r2.this$0
                androidx.appcompat.view.ActionMode r3 = r3.startSupportActionMode(r0)
                if (r3 == 0) goto L16
                android.view.ActionMode r3 = r0.getActionModeWrapper(r3)
                return r3
            L16:
                r3 = 0
                return r3
        }
    }

    private class AutoBatteryNightModeManager extends androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager {
        private final android.os.PowerManager mPowerManager;
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        AutoBatteryNightModeManager(androidx.appcompat.app.AppCompatDelegateImpl r1, android.content.Context r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                android.content.Context r1 = r2.getApplicationContext()
                java.lang.String r2 = "power"
                java.lang.Object r1 = r1.getSystemService(r2)
                android.os.PowerManager r1 = (android.os.PowerManager) r1
                r0.mPowerManager = r1
                return
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        android.content.IntentFilter createIntentFilterForBroadcastReceiver() {
                r2 = this;
                android.content.IntentFilter r0 = new android.content.IntentFilter
                r0.<init>()
                java.lang.String r1 = "android.os.action.POWER_SAVE_MODE_CHANGED"
                r0.addAction(r1)
                return r0
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int getApplyableNightMode() {
                r1 = this;
                android.os.PowerManager r0 = r1.mPowerManager
                boolean r0 = androidx.appcompat.app.AppCompatDelegateImpl.Api21Impl.isPowerSaveMode(r0)
                if (r0 == 0) goto La
                r0 = 2
                goto Lb
            La:
                r0 = 1
            Lb:
                return r0
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void onChange() {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                r0.applyDayNight()
                return
        }
    }

    abstract class AutoNightModeManager {
        private android.content.BroadcastReceiver mReceiver;
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;


        AutoNightModeManager(androidx.appcompat.app.AppCompatDelegateImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        void cleanup() {
                r2 = this;
                android.content.BroadcastReceiver r0 = r2.mReceiver
                if (r0 == 0) goto L10
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r2.this$0     // Catch: java.lang.IllegalArgumentException -> Ld
                android.content.Context r0 = r0.mContext     // Catch: java.lang.IllegalArgumentException -> Ld
                android.content.BroadcastReceiver r1 = r2.mReceiver     // Catch: java.lang.IllegalArgumentException -> Ld
                r0.unregisterReceiver(r1)     // Catch: java.lang.IllegalArgumentException -> Ld
            Ld:
                r0 = 0
                r2.mReceiver = r0
            L10:
                return
        }

        abstract android.content.IntentFilter createIntentFilterForBroadcastReceiver();

        abstract int getApplyableNightMode();

        boolean isListening() {
                r1 = this;
                android.content.BroadcastReceiver r0 = r1.mReceiver
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        abstract void onChange();

        void setup() {
                r3 = this;
                r3.cleanup()
                android.content.IntentFilter r0 = r3.createIntentFilterForBroadcastReceiver()
                if (r0 == 0) goto L24
                int r1 = r0.countActions()
                if (r1 != 0) goto L10
                goto L24
            L10:
                android.content.BroadcastReceiver r1 = r3.mReceiver
                if (r1 != 0) goto L1b
                androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager$1 r1 = new androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager$1
                r1.<init>(r3)
                r3.mReceiver = r1
            L1b:
                androidx.appcompat.app.AppCompatDelegateImpl r1 = r3.this$0
                android.content.Context r1 = r1.mContext
                android.content.BroadcastReceiver r2 = r3.mReceiver
                r1.registerReceiver(r2, r0)
            L24:
                return
        }
    }

    private class AutoTimeNightModeManager extends androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager {
        private final androidx.appcompat.app.TwilightManager mTwilightManager;
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        AutoTimeNightModeManager(androidx.appcompat.app.AppCompatDelegateImpl r1, androidx.appcompat.app.TwilightManager r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                r0.mTwilightManager = r2
                return
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        android.content.IntentFilter createIntentFilterForBroadcastReceiver() {
                r2 = this;
                android.content.IntentFilter r0 = new android.content.IntentFilter
                r0.<init>()
                java.lang.String r1 = "android.intent.action.TIME_SET"
                r0.addAction(r1)
                java.lang.String r1 = "android.intent.action.TIMEZONE_CHANGED"
                r0.addAction(r1)
                java.lang.String r1 = "android.intent.action.TIME_TICK"
                r0.addAction(r1)
                return r0
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int getApplyableNightMode() {
                r1 = this;
                androidx.appcompat.app.TwilightManager r0 = r1.mTwilightManager
                boolean r0 = r0.isNight()
                if (r0 == 0) goto La
                r0 = 2
                goto Lb
            La:
                r0 = 1
            Lb:
                return r0
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void onChange() {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                r0.applyDayNight()
                return
        }
    }

    private class ListMenuDecorView extends androidx.appcompat.widget.ContentFrameLayout {
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        public ListMenuDecorView(androidx.appcompat.app.AppCompatDelegateImpl r1, android.content.Context r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        private boolean isOutOfBounds(int r2, int r3) {
                r1 = this;
                r0 = -5
                if (r2 < r0) goto L18
                if (r3 < r0) goto L18
                int r0 = r1.getWidth()
                int r0 = r0 + 5
                if (r2 > r0) goto L18
                int r2 = r1.getHeight()
                int r2 = r2 + 5
                if (r3 <= r2) goto L16
                goto L18
            L16:
                r2 = 0
                goto L19
            L18:
                r2 = 1
            L19:
                return r2
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                boolean r0 = r0.dispatchKeyEvent(r2)
                if (r0 != 0) goto L11
                boolean r2 = super.dispatchKeyEvent(r2)
                if (r2 == 0) goto Lf
                goto L11
            Lf:
                r2 = 0
                goto L12
            L11:
                r2 = 1
            L12:
                return r2
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent r3) {
                r2 = this;
                int r0 = r3.getAction()
                if (r0 != 0) goto L1e
                float r0 = r3.getX()
                int r0 = (int) r0
                float r1 = r3.getY()
                int r1 = (int) r1
                boolean r0 = r2.isOutOfBounds(r0, r1)
                if (r0 == 0) goto L1e
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r2.this$0
                r0 = 0
                r3.closePanel(r0)
                r3 = 1
                return r3
            L1e:
                boolean r3 = super.onInterceptTouchEvent(r3)
                return r3
        }

        @Override // android.view.View
        public void setBackgroundResource(int r2) {
                r1 = this;
                android.content.Context r0 = r1.getContext()
                android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
                r1.setBackgroundDrawable(r2)
                return
        }
    }

    protected static final class PanelFeatureState {
        int background;
        android.view.View createdPanelView;
        android.view.ViewGroup decorView;
        int featureId;
        android.os.Bundle frozenActionViewState;
        android.os.Bundle frozenMenuState;
        int gravity;
        boolean isHandled;
        boolean isOpen;
        boolean isPrepared;
        androidx.appcompat.view.menu.ListMenuPresenter listMenuPresenter;
        android.content.Context listPresenterContext;
        androidx.appcompat.view.menu.MenuBuilder menu;
        public boolean qwertyMode;
        boolean refreshDecorView;
        boolean refreshMenuContent;
        android.view.View shownPanelView;
        boolean wasLastOpen;
        int windowAnimations;
        int x;
        int y;

        private static class SavedState implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState> CREATOR = null;
            int featureId;
            boolean isOpen;
            android.os.Bundle menuState;


            static {
                    androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$1 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$1
                    r0.<init>()
                    androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.CREATOR = r0
                    return
            }

            SavedState() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState readFromParcel(android.os.Parcel r3, java.lang.ClassLoader r4) {
                    androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState r0 = new androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState
                    r0.<init>()
                    int r1 = r3.readInt()
                    r0.featureId = r1
                    int r1 = r3.readInt()
                    r2 = 1
                    if (r1 != r2) goto L13
                    goto L14
                L13:
                    r2 = 0
                L14:
                    r0.isOpen = r2
                    if (r2 == 0) goto L1e
                    android.os.Bundle r3 = r3.readBundle(r4)
                    r0.menuState = r3
                L1e:
                    return r0
            }

            public int describeContents() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            public void writeToParcel(android.os.Parcel r1, int r2) {
                    r0 = this;
                    int r2 = r0.featureId
                    r1.writeInt(r2)
                    boolean r2 = r0.isOpen
                    r1.writeInt(r2)
                    boolean r2 = r0.isOpen
                    if (r2 == 0) goto L13
                    android.os.Bundle r2 = r0.menuState
                    r1.writeBundle(r2)
                L13:
                    return
            }
        }

        PanelFeatureState(int r1) {
                r0 = this;
                r0.<init>()
                r0.featureId = r1
                r1 = 0
                r0.refreshDecorView = r1
                return
        }

        void applyFrozenState() {
                r2 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.menu
                if (r0 == 0) goto Le
                android.os.Bundle r1 = r2.frozenMenuState
                if (r1 == 0) goto Le
                r0.restorePresenterStates(r1)
                r0 = 0
                r2.frozenMenuState = r0
            Le:
                return
        }

        public void clearMenuPresenters() {
                r2 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.menu
                if (r0 == 0) goto L9
                androidx.appcompat.view.menu.ListMenuPresenter r1 = r2.listMenuPresenter
                r0.removeMenuPresenter(r1)
            L9:
                r0 = 0
                r2.listMenuPresenter = r0
                return
        }

        androidx.appcompat.view.menu.MenuView getListMenuView(androidx.appcompat.view.menu.MenuPresenter.Callback r4) {
                r3 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r3.menu
                if (r0 != 0) goto L6
                r4 = 0
                return r4
            L6:
                androidx.appcompat.view.menu.ListMenuPresenter r0 = r3.listMenuPresenter
                if (r0 != 0) goto L1f
                androidx.appcompat.view.menu.ListMenuPresenter r0 = new androidx.appcompat.view.menu.ListMenuPresenter
                android.content.Context r1 = r3.listPresenterContext
                int r2 = androidx.appcompat.R.layout.abc_list_menu_item_layout
                r0.<init>(r1, r2)
                r3.listMenuPresenter = r0
                r0.setCallback(r4)
                androidx.appcompat.view.menu.MenuBuilder r4 = r3.menu
                androidx.appcompat.view.menu.ListMenuPresenter r0 = r3.listMenuPresenter
                r4.addMenuPresenter(r0)
            L1f:
                androidx.appcompat.view.menu.ListMenuPresenter r4 = r3.listMenuPresenter
                android.view.ViewGroup r0 = r3.decorView
                androidx.appcompat.view.menu.MenuView r4 = r4.getMenuView(r0)
                return r4
        }

        public boolean hasPanelItems() {
                r3 = this;
                android.view.View r0 = r3.shownPanelView
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.view.View r0 = r3.createdPanelView
                r2 = 1
                if (r0 == 0) goto Lc
                return r2
            Lc:
                androidx.appcompat.view.menu.ListMenuPresenter r0 = r3.listMenuPresenter
                android.widget.ListAdapter r0 = r0.getAdapter()
                int r0 = r0.getCount()
                if (r0 <= 0) goto L19
                r1 = r2
            L19:
                return r1
        }

        void onRestoreInstanceState(android.os.Parcelable r2) {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState r2 = (androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState) r2
                int r0 = r2.featureId
                r1.featureId = r0
                boolean r0 = r2.isOpen
                r1.wasLastOpen = r0
                android.os.Bundle r2 = r2.menuState
                r1.frozenMenuState = r2
                r2 = 0
                r1.shownPanelView = r2
                r1.decorView = r2
                return
        }

        android.os.Parcelable onSaveInstanceState() {
                r3 = this;
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState r0 = new androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState
                r0.<init>()
                int r1 = r3.featureId
                r0.featureId = r1
                boolean r1 = r3.isOpen
                r0.isOpen = r1
                androidx.appcompat.view.menu.MenuBuilder r1 = r3.menu
                if (r1 == 0) goto L1f
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                r0.menuState = r1
                androidx.appcompat.view.menu.MenuBuilder r1 = r3.menu
                android.os.Bundle r2 = r0.menuState
                r1.savePresenterStates(r2)
            L1f:
                return r0
        }

        void setMenu(androidx.appcompat.view.menu.MenuBuilder r3) {
                r2 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.menu
                if (r3 != r0) goto L5
                return
            L5:
                if (r0 == 0) goto Lc
                androidx.appcompat.view.menu.ListMenuPresenter r1 = r2.listMenuPresenter
                r0.removeMenuPresenter(r1)
            Lc:
                r2.menu = r3
                if (r3 == 0) goto L17
                androidx.appcompat.view.menu.ListMenuPresenter r0 = r2.listMenuPresenter
                if (r0 == 0) goto L17
                r3.addMenuPresenter(r0)
            L17:
                return
        }

        void setStyle(android.content.Context r5) {
                r4 = this;
                android.util.TypedValue r0 = new android.util.TypedValue
                r0.<init>()
                android.content.res.Resources r1 = r5.getResources()
                android.content.res.Resources$Theme r1 = r1.newTheme()
                android.content.res.Resources$Theme r2 = r5.getTheme()
                r1.setTo(r2)
                int r2 = androidx.appcompat.R.attr.actionBarPopupTheme
                r3 = 1
                r1.resolveAttribute(r2, r0, r3)
                int r2 = r0.resourceId
                if (r2 == 0) goto L23
                int r2 = r0.resourceId
                r1.applyStyle(r2, r3)
            L23:
                int r2 = androidx.appcompat.R.attr.panelMenuListTheme
                r1.resolveAttribute(r2, r0, r3)
                int r2 = r0.resourceId
                if (r2 == 0) goto L32
                int r0 = r0.resourceId
                r1.applyStyle(r0, r3)
                goto L37
            L32:
                int r0 = androidx.appcompat.R.style.Theme_AppCompat_CompactMenu
                r1.applyStyle(r0, r3)
            L37:
                androidx.appcompat.view.ContextThemeWrapper r0 = new androidx.appcompat.view.ContextThemeWrapper
                r2 = 0
                r0.<init>(r5, r2)
                android.content.res.Resources$Theme r5 = r0.getTheme()
                r5.setTo(r1)
                r4.listPresenterContext = r0
                int[] r5 = androidx.appcompat.R.styleable.AppCompatTheme
                android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5)
                int r0 = androidx.appcompat.R.styleable.AppCompatTheme_panelBackground
                int r0 = r5.getResourceId(r0, r2)
                r4.background = r0
                int r0 = androidx.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle
                int r0 = r5.getResourceId(r0, r2)
                r4.windowAnimations = r0
                r5.recycle()
                return
        }
    }

    private final class PanelMenuPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        PanelMenuPresenterCallback(androidx.appcompat.app.AppCompatDelegateImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r5, boolean r6) {
                r4 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r5.getRootMenu()
                r1 = 1
                if (r0 == r5) goto L9
                r2 = r1
                goto La
            L9:
                r2 = 0
            La:
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r4.this$0
                if (r2 == 0) goto Lf
                r5 = r0
            Lf:
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r5 = r3.findMenuPanel(r5)
                if (r5 == 0) goto L29
                if (r2 == 0) goto L24
                androidx.appcompat.app.AppCompatDelegateImpl r6 = r4.this$0
                int r2 = r5.featureId
                r6.callOnPanelClosed(r2, r5, r0)
                androidx.appcompat.app.AppCompatDelegateImpl r6 = r4.this$0
                r6.closePanel(r5, r1)
                goto L29
            L24:
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.this$0
                r0.closePanel(r5, r6)
            L29:
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder r3) {
                r2 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r3.getRootMenu()
                if (r3 != r0) goto L1f
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r2.this$0
                boolean r0 = r0.mHasActionBar
                if (r0 == 0) goto L1f
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r2.this$0
                android.view.Window$Callback r0 = r0.getWindowCallback()
                if (r0 == 0) goto L1f
                androidx.appcompat.app.AppCompatDelegateImpl r1 = r2.this$0
                boolean r1 = r1.mDestroyed
                if (r1 != 0) goto L1f
                r1 = 108(0x6c, float:1.51E-43)
                r0.onMenuOpened(r1, r3)
            L1f:
                r3 = 1
                return r3
        }
    }

    static {
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            androidx.appcompat.app.AppCompatDelegateImpl.sLocalNightModes = r0
            r0 = 0
            androidx.appcompat.app.AppCompatDelegateImpl.IS_PRE_LOLLIPOP = r0
            r0 = 16842836(0x1010054, float:2.3693793E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.app.AppCompatDelegateImpl.sWindowBackgroundStyleable = r0
            java.lang.String r0 = "robolectric"
            java.lang.String r1 = android.os.Build.FINGERPRINT
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            androidx.appcompat.app.AppCompatDelegateImpl.sCanReturnDifferentContext = r0
            return
    }

    AppCompatDelegateImpl(android.app.Activity r2, androidx.appcompat.app.AppCompatCallback r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3, r2)
            return
    }

    AppCompatDelegateImpl(android.app.Dialog r3, androidx.appcompat.app.AppCompatCallback r4) {
            r2 = this;
            android.content.Context r0 = r3.getContext()
            android.view.Window r1 = r3.getWindow()
            r2.<init>(r0, r1, r4, r3)
            return
    }

    AppCompatDelegateImpl(android.content.Context r2, android.app.Activity r3, androidx.appcompat.app.AppCompatCallback r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r4, r3)
            return
    }

    AppCompatDelegateImpl(android.content.Context r1, android.view.Window r2, androidx.appcompat.app.AppCompatCallback r3) {
            r0 = this;
            r0.<init>(r1, r2, r3, r1)
            return
    }

    private AppCompatDelegateImpl(android.content.Context r3, android.view.Window r4, androidx.appcompat.app.AppCompatCallback r5, java.lang.Object r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mFadeAnim = r0
            r0 = 1
            r2.mHandleNativeActionModes = r0
            r0 = -100
            r2.mLocalNightMode = r0
            androidx.appcompat.app.AppCompatDelegateImpl$2 r1 = new androidx.appcompat.app.AppCompatDelegateImpl$2
            r1.<init>(r2)
            r2.mInvalidatePanelMenuRunnable = r1
            r2.mContext = r3
            r2.mAppCompatCallback = r5
            r2.mHost = r6
            int r3 = r2.mLocalNightMode
            if (r3 != r0) goto L32
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L32
            androidx.appcompat.app.AppCompatActivity r3 = r2.tryUnwrapContext()
            if (r3 == 0) goto L32
            androidx.appcompat.app.AppCompatDelegate r3 = r3.getDelegate()
            int r3 = r3.getLocalNightMode()
            r2.mLocalNightMode = r3
        L32:
            int r3 = r2.mLocalNightMode
            if (r3 != r0) goto L59
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r3 = androidx.appcompat.app.AppCompatDelegateImpl.sLocalNightModes
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L59
            int r5 = r5.intValue()
            r2.mLocalNightMode = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L59:
            if (r4 == 0) goto L5e
            r2.attachToWindow(r4)
        L5e:
            androidx.appcompat.widget.AppCompatDrawableManager.preload()
            return
    }

    private boolean applyApplicationSpecificConfig(boolean r2) {
            r1 = this;
            r0 = 1
            boolean r2 = r1.applyApplicationSpecificConfig(r2, r0)
            return r2
    }

    private boolean applyApplicationSpecificConfig(boolean r5, boolean r6) {
            r4 = this;
            boolean r0 = r4.mDestroyed
            if (r0 == 0) goto L6
            r5 = 0
            return r5
        L6:
            int r0 = r4.calculateNightMode()
            android.content.Context r1 = r4.mContext
            int r1 = r4.mapNightMode(r1, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 >= r3) goto L1d
            android.content.Context r2 = r4.mContext
            androidx.core.os.LocaleListCompat r2 = r4.calculateApplicationLocales(r2)
            goto L1e
        L1d:
            r2 = 0
        L1e:
            if (r6 != 0) goto L30
            if (r2 == 0) goto L30
            android.content.Context r6 = r4.mContext
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            androidx.core.os.LocaleListCompat r2 = r4.getConfigurationLocales(r6)
        L30:
            boolean r5 = r4.updateAppConfiguration(r1, r2, r5)
            if (r0 != 0) goto L40
            android.content.Context r6 = r4.mContext
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r6 = r4.getAutoTimeNightModeManager(r6)
            r6.setup()
            goto L47
        L40:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r6 = r4.mAutoTimeNightModeManager
            if (r6 == 0) goto L47
            r6.cleanup()
        L47:
            r6 = 3
            if (r0 != r6) goto L54
            android.content.Context r6 = r4.mContext
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r6 = r4.getAutoBatteryNightModeManager(r6)
            r6.setup()
            goto L5b
        L54:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r6 = r4.mAutoBatteryNightModeManager
            if (r6 == 0) goto L5b
            r6.cleanup()
        L5b:
            return r5
    }

    private void applyFixedSizeWindow() {
            r5 = this;
            android.view.ViewGroup r0 = r5.mSubDecor
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ContentFrameLayout r0 = (androidx.appcompat.widget.ContentFrameLayout) r0
            android.view.Window r1 = r5.mWindow
            android.view.View r1 = r1.getDecorView()
            int r2 = r1.getPaddingLeft()
            int r3 = r1.getPaddingTop()
            int r4 = r1.getPaddingRight()
            int r1 = r1.getPaddingBottom()
            r0.setDecorPadding(r2, r3, r4, r1)
            android.content.Context r1 = r5.mContext
            int[] r2 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2)
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor
            android.util.TypedValue r3 = r0.getMinWidthMajor()
            r1.getValue(r2, r3)
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor
            android.util.TypedValue r3 = r0.getMinWidthMinor()
            r1.getValue(r2, r3)
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L4f
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor
            android.util.TypedValue r3 = r0.getFixedWidthMajor()
            r1.getValue(r2, r3)
        L4f:
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L60
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor
            android.util.TypedValue r3 = r0.getFixedWidthMinor()
            r1.getValue(r2, r3)
        L60:
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L71
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor
            android.util.TypedValue r3 = r0.getFixedHeightMajor()
            r1.getValue(r2, r3)
        L71:
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L82
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor
            android.util.TypedValue r3 = r0.getFixedHeightMinor()
            r1.getValue(r2, r3)
        L82:
            r1.recycle()
            r0.requestLayout()
            return
    }

    private void attachToWindow(android.view.Window r4) {
            r3 = this;
            android.view.Window r0 = r3.mWindow
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L44
            android.view.Window$Callback r0 = r4.getCallback()
            boolean r2 = r0 instanceof androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback
            if (r2 != 0) goto L3e
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r1 = new androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback
            r1.<init>(r3, r0)
            r3.mAppCompatWindowCallback = r1
            r4.setCallback(r1)
            android.content.Context r0 = r3.mContext
            int[] r1 = androidx.appcompat.app.AppCompatDelegateImpl.sWindowBackgroundStyleable
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r2, r1)
            r1 = 0
            android.graphics.drawable.Drawable r1 = r0.getDrawableIfKnown(r1)
            if (r1 == 0) goto L2b
            r4.setBackgroundDrawable(r1)
        L2b:
            r0.recycle()
            r3.mWindow = r4
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r4 < r0) goto L3d
            android.window.OnBackInvokedDispatcher r4 = r3.mDispatcher
            if (r4 != 0) goto L3d
            r3.setOnBackInvokedDispatcher(r2)
        L3d:
            return
        L3e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
        L44:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r1)
            throw r4
    }

    private int calculateNightMode() {
            r2 = this;
            int r0 = r2.mLocalNightMode
            r1 = -100
            if (r0 == r1) goto L7
            goto Lb
        L7:
            int r0 = getDefaultNightMode()
        Lb:
            return r0
    }

    private void cleanupAutoManagers() {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r1.mAutoTimeNightModeManager
            if (r0 == 0) goto L7
            r0.cleanup()
        L7:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r1.mAutoBatteryNightModeManager
            if (r0 == 0) goto Le
            r0.cleanup()
        Le:
            return
    }

    private android.content.res.Configuration createOverrideAppConfiguration(android.content.Context r2, int r3, androidx.core.os.LocaleListCompat r4, android.content.res.Configuration r5, boolean r6) {
            r1 = this;
            r0 = 1
            if (r3 == r0) goto L1e
            r0 = 2
            if (r3 == r0) goto L1b
            if (r6 == 0) goto La
            r2 = 0
            goto L20
        La:
            android.content.Context r2 = r2.getApplicationContext()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            goto L20
        L1b:
            r2 = 32
            goto L20
        L1e:
            r2 = 16
        L20:
            android.content.res.Configuration r3 = new android.content.res.Configuration
            r3.<init>()
            r6 = 0
            r3.fontScale = r6
            if (r5 == 0) goto L2d
            r3.setTo(r5)
        L2d:
            int r5 = r3.uiMode
            r5 = r5 & (-49)
            r2 = r2 | r5
            r3.uiMode = r2
            if (r4 == 0) goto L39
            r1.setConfigurationLocales(r3, r4)
        L39:
            return r3
    }

    private android.view.ViewGroup createSubDecor() {
            r7 = this;
            android.content.Context r0 = r7.mContext
            int[] r1 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L197
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowNoTitle
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            r3 = 1
            if (r1 == 0) goto L1e
            r7.requestWindowFeature(r3)
            goto L2b
        L1e:
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L2b
            r1 = 108(0x6c, float:1.51E-43)
            r7.requestWindowFeature(r1)
        L2b:
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay
            boolean r1 = r0.getBoolean(r1, r2)
            r4 = 109(0x6d, float:1.53E-43)
            if (r1 == 0) goto L38
            r7.requestWindowFeature(r4)
        L38:
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L45
            r1 = 10
            r7.requestWindowFeature(r1)
        L45:
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating
            boolean r1 = r0.getBoolean(r1, r2)
            r7.mIsFloating = r1
            r0.recycle()
            r7.ensureWindow()
            android.view.Window r0 = r7.mWindow
            r0.getDecorView()
            android.content.Context r0 = r7.mContext
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            boolean r1 = r7.mWindowNoTitle
            r5 = 0
            if (r1 != 0) goto Ld6
            boolean r1 = r7.mIsFloating
            if (r1 == 0) goto L75
            int r1 = androidx.appcompat.R.layout.abc_dialog_title_material
            android.view.View r0 = r0.inflate(r1, r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7.mOverlayActionBar = r2
            r7.mHasActionBar = r2
            goto Leb
        L75:
            boolean r0 = r7.mHasActionBar
            if (r0 == 0) goto Ld4
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r7.mContext
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r6 = androidx.appcompat.R.attr.actionBarTheme
            r1.resolveAttribute(r6, r0, r3)
            int r1 = r0.resourceId
            if (r1 == 0) goto L97
            androidx.appcompat.view.ContextThemeWrapper r1 = new androidx.appcompat.view.ContextThemeWrapper
            android.content.Context r3 = r7.mContext
            int r0 = r0.resourceId
            r1.<init>(r3, r0)
            goto L99
        L97:
            android.content.Context r1 = r7.mContext
        L99:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r1)
            int r1 = androidx.appcompat.R.layout.abc_screen_toolbar
            android.view.View r0 = r0.inflate(r1, r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = androidx.appcompat.R.id.decor_content_parent
            android.view.View r1 = r0.findViewById(r1)
            androidx.appcompat.widget.DecorContentParent r1 = (androidx.appcompat.widget.DecorContentParent) r1
            r7.mDecorContentParent = r1
            android.view.Window$Callback r3 = r7.getWindowCallback()
            r1.setWindowCallback(r3)
            boolean r1 = r7.mOverlayActionBar
            if (r1 == 0) goto Lbf
            androidx.appcompat.widget.DecorContentParent r1 = r7.mDecorContentParent
            r1.initFeature(r4)
        Lbf:
            boolean r1 = r7.mFeatureProgress
            if (r1 == 0) goto Lc9
            androidx.appcompat.widget.DecorContentParent r1 = r7.mDecorContentParent
            r3 = 2
            r1.initFeature(r3)
        Lc9:
            boolean r1 = r7.mFeatureIndeterminateProgress
            if (r1 == 0) goto Leb
            androidx.appcompat.widget.DecorContentParent r1 = r7.mDecorContentParent
            r3 = 5
            r1.initFeature(r3)
            goto Leb
        Ld4:
            r0 = r5
            goto Leb
        Ld6:
            boolean r1 = r7.mOverlayActionMode
            if (r1 == 0) goto Le3
            int r1 = androidx.appcompat.R.layout.abc_screen_simple_overlay_action_mode
            android.view.View r0 = r0.inflate(r1, r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto Leb
        Le3:
            int r1 = androidx.appcompat.R.layout.abc_screen_simple
            android.view.View r0 = r0.inflate(r1, r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        Leb:
            if (r0 == 0) goto L14a
            androidx.appcompat.app.AppCompatDelegateImpl$3 r1 = new androidx.appcompat.app.AppCompatDelegateImpl$3
            r1.<init>(r7)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r0, r1)
            androidx.appcompat.widget.DecorContentParent r1 = r7.mDecorContentParent
            if (r1 != 0) goto L103
            int r1 = androidx.appcompat.R.id.title
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7.mTitleView = r1
        L103:
            androidx.appcompat.widget.ViewUtils.makeOptionalFitsSystemWindows(r0)
            int r1 = androidx.appcompat.R.id.action_bar_activity_content
            android.view.View r1 = r0.findViewById(r1)
            androidx.appcompat.widget.ContentFrameLayout r1 = (androidx.appcompat.widget.ContentFrameLayout) r1
            android.view.Window r3 = r7.mWindow
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r3.findViewById(r4)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L13c
        L11b:
            int r6 = r3.getChildCount()
            if (r6 <= 0) goto L12c
            android.view.View r6 = r3.getChildAt(r2)
            r3.removeViewAt(r2)
            r1.addView(r6)
            goto L11b
        L12c:
            r2 = -1
            r3.setId(r2)
            r1.setId(r4)
            boolean r2 = r3 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L13c
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r3.setForeground(r5)
        L13c:
            android.view.Window r2 = r7.mWindow
            r2.setContentView(r0)
            androidx.appcompat.app.AppCompatDelegateImpl$5 r2 = new androidx.appcompat.app.AppCompatDelegateImpl$5
            r2.<init>(r7)
            r1.setAttachListener(r2)
            return r0
        L14a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "AppCompat does not support the current theme features: { windowActionBar: "
            r1.<init>(r2)
            boolean r2 = r7.mHasActionBar
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", windowActionBarOverlay: "
            java.lang.StringBuilder r1 = r1.append(r2)
            boolean r2 = r7.mOverlayActionBar
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", android:windowIsFloating: "
            java.lang.StringBuilder r1 = r1.append(r2)
            boolean r2 = r7.mIsFloating
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", windowActionModeOverlay: "
            java.lang.StringBuilder r1 = r1.append(r2)
            boolean r2 = r7.mOverlayActionMode
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", windowNoTitle: "
            java.lang.StringBuilder r1 = r1.append(r2)
            boolean r2 = r7.mWindowNoTitle
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " }"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L197:
            r0.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You need to use a Theme.AppCompat theme (or descendant) with this activity."
            r0.<init>(r1)
            throw r0
    }

    private void ensureSubDecor() {
            r2 = this;
            boolean r0 = r2.mSubDecorInstalled
            if (r0 != 0) goto L50
            android.view.ViewGroup r0 = r2.createSubDecor()
            r2.mSubDecor = r0
            java.lang.CharSequence r0 = r2.getTitle()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L31
            androidx.appcompat.widget.DecorContentParent r1 = r2.mDecorContentParent
            if (r1 == 0) goto L1c
            r1.setWindowTitle(r0)
            goto L31
        L1c:
            androidx.appcompat.app.ActionBar r1 = r2.peekSupportActionBar()
            if (r1 == 0) goto L2a
            androidx.appcompat.app.ActionBar r1 = r2.peekSupportActionBar()
            r1.setWindowTitle(r0)
            goto L31
        L2a:
            android.widget.TextView r1 = r2.mTitleView
            if (r1 == 0) goto L31
            r1.setText(r0)
        L31:
            r2.applyFixedSizeWindow()
            android.view.ViewGroup r0 = r2.mSubDecor
            r2.onSubDecorInstalled(r0)
            r0 = 1
            r2.mSubDecorInstalled = r0
            r0 = 0
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r2.getPanelState(r0, r0)
            boolean r1 = r2.mDestroyed
            if (r1 != 0) goto L50
            if (r0 == 0) goto L4b
            androidx.appcompat.view.menu.MenuBuilder r0 = r0.menu
            if (r0 != 0) goto L50
        L4b:
            r0 = 108(0x6c, float:1.51E-43)
            r2.invalidatePanelMenu(r0)
        L50:
            return
    }

    private void ensureWindow() {
            r2 = this;
            android.view.Window r0 = r2.mWindow
            if (r0 != 0) goto L13
            java.lang.Object r0 = r2.mHost
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L13
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            r2.attachToWindow(r0)
        L13:
            android.view.Window r0 = r2.mWindow
            if (r0 == 0) goto L18
            return
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "We have not been given a Window"
            r0.<init>(r1)
            throw r0
    }

    private static android.content.res.Configuration generateConfigDelta(android.content.res.Configuration r3, android.content.res.Configuration r4) {
            android.content.res.Configuration r0 = new android.content.res.Configuration
            r0.<init>()
            r1 = 0
            r0.fontScale = r1
            if (r4 == 0) goto L10e
            int r1 = r3.diff(r4)
            if (r1 != 0) goto L12
            goto L10e
        L12:
            float r1 = r3.fontScale
            float r2 = r4.fontScale
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L1e
            float r1 = r4.fontScale
            r0.fontScale = r1
        L1e:
            int r1 = r3.mcc
            int r2 = r4.mcc
            if (r1 == r2) goto L28
            int r1 = r4.mcc
            r0.mcc = r1
        L28:
            int r1 = r3.mnc
            int r2 = r4.mnc
            if (r1 == r2) goto L32
            int r1 = r4.mnc
            r0.mnc = r1
        L32:
            androidx.appcompat.app.AppCompatDelegateImpl.Api24Impl.generateConfigDelta_locale(r3, r4, r0)
            int r1 = r3.touchscreen
            int r2 = r4.touchscreen
            if (r1 == r2) goto L3f
            int r1 = r4.touchscreen
            r0.touchscreen = r1
        L3f:
            int r1 = r3.keyboard
            int r2 = r4.keyboard
            if (r1 == r2) goto L49
            int r1 = r4.keyboard
            r0.keyboard = r1
        L49:
            int r1 = r3.keyboardHidden
            int r2 = r4.keyboardHidden
            if (r1 == r2) goto L53
            int r1 = r4.keyboardHidden
            r0.keyboardHidden = r1
        L53:
            int r1 = r3.navigation
            int r2 = r4.navigation
            if (r1 == r2) goto L5d
            int r1 = r4.navigation
            r0.navigation = r1
        L5d:
            int r1 = r3.navigationHidden
            int r2 = r4.navigationHidden
            if (r1 == r2) goto L67
            int r1 = r4.navigationHidden
            r0.navigationHidden = r1
        L67:
            int r1 = r3.orientation
            int r2 = r4.orientation
            if (r1 == r2) goto L71
            int r1 = r4.orientation
            r0.orientation = r1
        L71:
            int r1 = r3.screenLayout
            r1 = r1 & 15
            int r2 = r4.screenLayout
            r2 = r2 & 15
            if (r1 == r2) goto L84
            int r1 = r0.screenLayout
            int r2 = r4.screenLayout
            r2 = r2 & 15
            r1 = r1 | r2
            r0.screenLayout = r1
        L84:
            int r1 = r3.screenLayout
            r1 = r1 & 192(0xc0, float:2.69E-43)
            int r2 = r4.screenLayout
            r2 = r2 & 192(0xc0, float:2.69E-43)
            if (r1 == r2) goto L97
            int r1 = r0.screenLayout
            int r2 = r4.screenLayout
            r2 = r2 & 192(0xc0, float:2.69E-43)
            r1 = r1 | r2
            r0.screenLayout = r1
        L97:
            int r1 = r3.screenLayout
            r1 = r1 & 48
            int r2 = r4.screenLayout
            r2 = r2 & 48
            if (r1 == r2) goto Laa
            int r1 = r0.screenLayout
            int r2 = r4.screenLayout
            r2 = r2 & 48
            r1 = r1 | r2
            r0.screenLayout = r1
        Laa:
            int r1 = r3.screenLayout
            r1 = r1 & 768(0x300, float:1.076E-42)
            int r2 = r4.screenLayout
            r2 = r2 & 768(0x300, float:1.076E-42)
            if (r1 == r2) goto Lbd
            int r1 = r0.screenLayout
            int r2 = r4.screenLayout
            r2 = r2 & 768(0x300, float:1.076E-42)
            r1 = r1 | r2
            r0.screenLayout = r1
        Lbd:
            androidx.appcompat.app.AppCompatDelegateImpl.Api26Impl.generateConfigDelta_colorMode(r3, r4, r0)
            int r1 = r3.uiMode
            r1 = r1 & 15
            int r2 = r4.uiMode
            r2 = r2 & 15
            if (r1 == r2) goto Ld3
            int r1 = r0.uiMode
            int r2 = r4.uiMode
            r2 = r2 & 15
            r1 = r1 | r2
            r0.uiMode = r1
        Ld3:
            int r1 = r3.uiMode
            r1 = r1 & 48
            int r2 = r4.uiMode
            r2 = r2 & 48
            if (r1 == r2) goto Le6
            int r1 = r0.uiMode
            int r2 = r4.uiMode
            r2 = r2 & 48
            r1 = r1 | r2
            r0.uiMode = r1
        Le6:
            int r1 = r3.screenWidthDp
            int r2 = r4.screenWidthDp
            if (r1 == r2) goto Lf0
            int r1 = r4.screenWidthDp
            r0.screenWidthDp = r1
        Lf0:
            int r1 = r3.screenHeightDp
            int r2 = r4.screenHeightDp
            if (r1 == r2) goto Lfa
            int r1 = r4.screenHeightDp
            r0.screenHeightDp = r1
        Lfa:
            int r1 = r3.smallestScreenWidthDp
            int r2 = r4.smallestScreenWidthDp
            if (r1 == r2) goto L104
            int r1 = r4.smallestScreenWidthDp
            r0.smallestScreenWidthDp = r1
        L104:
            int r3 = r3.densityDpi
            int r1 = r4.densityDpi
            if (r3 == r1) goto L10e
            int r3 = r4.densityDpi
            r0.densityDpi = r3
        L10e:
            return r0
    }

    private int getActivityHandlesConfigChangesFlags(android.content.Context r6) {
            r5 = this;
            boolean r0 = r5.mActivityHandlesConfigFlagsChecked
            if (r0 != 0) goto L3d
            java.lang.Object r0 = r5.mHost
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L3d
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33
            r3 = 29
            if (r2 < r3) goto L1b
            r2 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L1d
        L1b:
            r2 = 786432(0xc0000, float:1.102026E-39)
        L1d:
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33
            java.lang.Object r4 = r5.mHost     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33
            java.lang.Class r4 = r4.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33
            r3.<init>(r6, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33
            android.content.pm.ActivityInfo r6 = r0.getActivityInfo(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33
            if (r6 == 0) goto L3d
            int r6 = r6.configChanges     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33
            r5.mActivityHandlesConfigFlags = r6     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L33
            goto L3d
        L33:
            r6 = move-exception
            java.lang.String r0 = "AppCompatDelegate"
            java.lang.String r2 = "Exception while getting ActivityInfo"
            android.util.Log.d(r0, r2, r6)
            r5.mActivityHandlesConfigFlags = r1
        L3d:
            r6 = 1
            r5.mActivityHandlesConfigFlagsChecked = r6
            int r6 = r5.mActivityHandlesConfigFlags
            return r6
    }

    private androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager getAutoBatteryNightModeManager(android.content.Context r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r1.mAutoBatteryNightModeManager
            if (r0 != 0) goto Lb
            androidx.appcompat.app.AppCompatDelegateImpl$AutoBatteryNightModeManager r0 = new androidx.appcompat.app.AppCompatDelegateImpl$AutoBatteryNightModeManager
            r0.<init>(r1, r2)
            r1.mAutoBatteryNightModeManager = r0
        Lb:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r2 = r1.mAutoBatteryNightModeManager
            return r2
    }

    private androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager getAutoTimeNightModeManager(android.content.Context r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r1.mAutoTimeNightModeManager
            if (r0 != 0) goto Lf
            androidx.appcompat.app.AppCompatDelegateImpl$AutoTimeNightModeManager r0 = new androidx.appcompat.app.AppCompatDelegateImpl$AutoTimeNightModeManager
            androidx.appcompat.app.TwilightManager r2 = androidx.appcompat.app.TwilightManager.getInstance(r2)
            r0.<init>(r1, r2)
            r1.mAutoTimeNightModeManager = r0
        Lf:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r2 = r1.mAutoTimeNightModeManager
            return r2
    }

    private void initWindowDecorActionBar() {
            r3 = this;
            r3.ensureSubDecor()
            boolean r0 = r3.mHasActionBar
            if (r0 == 0) goto L38
            androidx.appcompat.app.ActionBar r0 = r3.mActionBar
            if (r0 == 0) goto Lc
            goto L38
        Lc:
            java.lang.Object r0 = r3.mHost
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.WindowDecorActionBar r0 = new androidx.appcompat.app.WindowDecorActionBar
            java.lang.Object r1 = r3.mHost
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.mOverlayActionBar
            r0.<init>(r1, r2)
            r3.mActionBar = r0
            goto L2f
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2f
            androidx.appcompat.app.WindowDecorActionBar r0 = new androidx.appcompat.app.WindowDecorActionBar
            java.lang.Object r1 = r3.mHost
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            r3.mActionBar = r0
        L2f:
            androidx.appcompat.app.ActionBar r0 = r3.mActionBar
            if (r0 == 0) goto L38
            boolean r1 = r3.mEnableDefaultActionBarUp
            r0.setDefaultDisplayHomeAsUpEnabled(r1)
        L38:
            return
    }

    private boolean initializePanelContent(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r4) {
            r3 = this;
            android.view.View r0 = r4.createdPanelView
            r1 = 1
            if (r0 == 0) goto La
            android.view.View r0 = r4.createdPanelView
            r4.shownPanelView = r0
            return r1
        La:
            androidx.appcompat.view.menu.MenuBuilder r0 = r4.menu
            r2 = 0
            if (r0 != 0) goto L10
            return r2
        L10:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelMenuPresenterCallback r0 = r3.mPanelMenuPresenterCallback
            if (r0 != 0) goto L1b
            androidx.appcompat.app.AppCompatDelegateImpl$PanelMenuPresenterCallback r0 = new androidx.appcompat.app.AppCompatDelegateImpl$PanelMenuPresenterCallback
            r0.<init>(r3)
            r3.mPanelMenuPresenterCallback = r0
        L1b:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelMenuPresenterCallback r0 = r3.mPanelMenuPresenterCallback
            androidx.appcompat.view.menu.MenuView r0 = r4.getListMenuView(r0)
            android.view.View r0 = (android.view.View) r0
            r4.shownPanelView = r0
            android.view.View r4 = r4.shownPanelView
            if (r4 == 0) goto L2a
            goto L2b
        L2a:
            r1 = r2
        L2b:
            return r1
    }

    private boolean initializePanelDecor(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r3) {
            r2 = this;
            android.content.Context r0 = r2.getActionBarThemedContext()
            r3.setStyle(r0)
            androidx.appcompat.app.AppCompatDelegateImpl$ListMenuDecorView r0 = new androidx.appcompat.app.AppCompatDelegateImpl$ListMenuDecorView
            android.content.Context r1 = r3.listPresenterContext
            r0.<init>(r2, r1)
            r3.decorView = r0
            r0 = 81
            r3.gravity = r0
            r3 = 1
            return r3
    }

    private boolean initializePanelMenu(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r7) {
            r6 = this;
            android.content.Context r0 = r6.mContext
            int r1 = r7.featureId
            r2 = 1
            if (r1 == 0) goto Ld
            int r1 = r7.featureId
            r3 = 108(0x6c, float:1.51E-43)
            if (r1 != r3) goto L65
        Ld:
            androidx.appcompat.widget.DecorContentParent r1 = r6.mDecorContentParent
            if (r1 == 0) goto L65
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r3 = r0.getTheme()
            int r4 = androidx.appcompat.R.attr.actionBarTheme
            r3.resolveAttribute(r4, r1, r2)
            int r4 = r1.resourceId
            if (r4 == 0) goto L39
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Resources$Theme r4 = r4.newTheme()
            r4.setTo(r3)
            int r5 = r1.resourceId
            r4.applyStyle(r5, r2)
            int r5 = androidx.appcompat.R.attr.actionBarWidgetTheme
            r4.resolveAttribute(r5, r1, r2)
            goto L3f
        L39:
            int r4 = androidx.appcompat.R.attr.actionBarWidgetTheme
            r3.resolveAttribute(r4, r1, r2)
            r4 = 0
        L3f:
            int r5 = r1.resourceId
            if (r5 == 0) goto L55
            if (r4 != 0) goto L50
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Resources$Theme r4 = r4.newTheme()
            r4.setTo(r3)
        L50:
            int r1 = r1.resourceId
            r4.applyStyle(r1, r2)
        L55:
            if (r4 == 0) goto L65
            androidx.appcompat.view.ContextThemeWrapper r1 = new androidx.appcompat.view.ContextThemeWrapper
            r3 = 0
            r1.<init>(r0, r3)
            android.content.res.Resources$Theme r0 = r1.getTheme()
            r0.setTo(r4)
            r0 = r1
        L65:
            androidx.appcompat.view.menu.MenuBuilder r1 = new androidx.appcompat.view.menu.MenuBuilder
            r1.<init>(r0)
            r1.setCallback(r6)
            r7.setMenu(r1)
            return r2
    }

    private void invalidatePanelMenu(int r3) {
            r2 = this;
            int r0 = r2.mInvalidatePanelMenuFeatures
            r1 = 1
            int r3 = r1 << r3
            r3 = r3 | r0
            r2.mInvalidatePanelMenuFeatures = r3
            boolean r3 = r2.mInvalidatePanelMenuPosted
            if (r3 != 0) goto L19
            android.view.Window r3 = r2.mWindow
            android.view.View r3 = r3.getDecorView()
            java.lang.Runnable r0 = r2.mInvalidatePanelMenuRunnable
            androidx.core.view.ViewCompat.postOnAnimation(r3, r0)
            r2.mInvalidatePanelMenuPosted = r1
        L19:
            return
    }

    private boolean onKeyDownPanel(int r2, android.view.KeyEvent r3) {
            r1 = this;
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L14
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r1.getPanelState(r2, r0)
            boolean r0 = r2.isOpen
            if (r0 != 0) goto L14
            boolean r2 = r1.preparePanel(r2, r3)
            return r2
        L14:
            r2 = 0
            return r2
    }

    private boolean onKeyUpPanel(int r4, android.view.KeyEvent r5) {
            r3 = this;
            androidx.appcompat.view.ActionMode r0 = r3.mActionMode
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r3.getPanelState(r4, r0)
            if (r4 != 0) goto L43
            androidx.appcompat.widget.DecorContentParent r4 = r3.mDecorContentParent
            if (r4 == 0) goto L43
            boolean r4 = r4.canShowOverflowMenu()
            if (r4 == 0) goto L43
            android.content.Context r4 = r3.mContext
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L43
            androidx.appcompat.widget.DecorContentParent r4 = r3.mDecorContentParent
            boolean r4 = r4.isOverflowMenuShowing()
            if (r4 != 0) goto L3c
            boolean r4 = r3.mDestroyed
            if (r4 != 0) goto L62
            boolean r4 = r3.preparePanel(r2, r5)
            if (r4 == 0) goto L62
            androidx.appcompat.widget.DecorContentParent r4 = r3.mDecorContentParent
            boolean r0 = r4.showOverflowMenu()
            goto L6a
        L3c:
            androidx.appcompat.widget.DecorContentParent r4 = r3.mDecorContentParent
            boolean r0 = r4.hideOverflowMenu()
            goto L6a
        L43:
            boolean r4 = r2.isOpen
            if (r4 != 0) goto L64
            boolean r4 = r2.isHandled
            if (r4 == 0) goto L4c
            goto L64
        L4c:
            boolean r4 = r2.isPrepared
            if (r4 == 0) goto L62
            boolean r4 = r2.refreshMenuContent
            if (r4 == 0) goto L5b
            r2.isPrepared = r1
            boolean r4 = r3.preparePanel(r2, r5)
            goto L5c
        L5b:
            r4 = r0
        L5c:
            if (r4 == 0) goto L62
            r3.openPanel(r2, r5)
            goto L6a
        L62:
            r0 = r1
            goto L6a
        L64:
            boolean r4 = r2.isOpen
            r3.closePanel(r2, r0)
            r0 = r4
        L6a:
            if (r0 == 0) goto L87
            android.content.Context r4 = r3.mContext
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.String r5 = "audio"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            if (r4 == 0) goto L80
            r4.playSoundEffect(r1)
            goto L87
        L80:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r5 = "Couldn't get audio manager"
            android.util.Log.w(r4, r5)
        L87:
            return r0
    }

    private void openPanel(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r12, android.view.KeyEvent r13) {
            r11 = this;
            boolean r0 = r12.isOpen
            if (r0 != 0) goto Lf9
            boolean r0 = r11.mDestroyed
            if (r0 == 0) goto La
            goto Lf9
        La:
            int r0 = r12.featureId
            if (r0 != 0) goto L20
            android.content.Context r0 = r11.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r1 = 4
            if (r0 != r1) goto L20
            return
        L20:
            android.view.Window$Callback r0 = r11.getWindowCallback()
            r1 = 1
            if (r0 == 0) goto L35
            int r2 = r12.featureId
            androidx.appcompat.view.menu.MenuBuilder r3 = r12.menu
            boolean r0 = r0.onMenuOpened(r2, r3)
            if (r0 != 0) goto L35
            r11.closePanel(r12, r1)
            return
        L35:
            android.content.Context r0 = r11.mContext
            java.lang.String r2 = "window"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L42
            return
        L42:
            boolean r13 = r11.preparePanel(r12, r13)
            if (r13 != 0) goto L49
            return
        L49:
            android.view.ViewGroup r13 = r12.decorView
            r2 = -2
            if (r13 == 0) goto L66
            boolean r13 = r12.refreshDecorView
            if (r13 == 0) goto L53
            goto L66
        L53:
            android.view.View r13 = r12.createdPanelView
            if (r13 == 0) goto Lcc
            android.view.View r13 = r12.createdPanelView
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            if (r13 == 0) goto Lcc
            int r13 = r13.width
            r3 = -1
            if (r13 != r3) goto Lcc
            r4 = r3
            goto Lcd
        L66:
            android.view.ViewGroup r13 = r12.decorView
            if (r13 != 0) goto L75
            boolean r13 = r11.initializePanelDecor(r12)
            if (r13 == 0) goto L74
            android.view.ViewGroup r13 = r12.decorView
            if (r13 != 0) goto L86
        L74:
            return
        L75:
            boolean r13 = r12.refreshDecorView
            if (r13 == 0) goto L86
            android.view.ViewGroup r13 = r12.decorView
            int r13 = r13.getChildCount()
            if (r13 <= 0) goto L86
            android.view.ViewGroup r13 = r12.decorView
            r13.removeAllViews()
        L86:
            boolean r13 = r11.initializePanelContent(r12)
            if (r13 == 0) goto Lf7
            boolean r13 = r12.hasPanelItems()
            if (r13 != 0) goto L93
            goto Lf7
        L93:
            android.view.View r13 = r12.shownPanelView
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            if (r13 != 0) goto La0
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r2, r2)
        La0:
            int r3 = r12.background
            android.view.ViewGroup r4 = r12.decorView
            r4.setBackgroundResource(r3)
            android.view.View r3 = r12.shownPanelView
            android.view.ViewParent r3 = r3.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto Lb8
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r4 = r12.shownPanelView
            r3.removeView(r4)
        Lb8:
            android.view.ViewGroup r3 = r12.decorView
            android.view.View r4 = r12.shownPanelView
            r3.addView(r4, r13)
            android.view.View r13 = r12.shownPanelView
            boolean r13 = r13.hasFocus()
            if (r13 != 0) goto Lcc
            android.view.View r13 = r12.shownPanelView
            r13.requestFocus()
        Lcc:
            r4 = r2
        Lcd:
            r13 = 0
            r12.isHandled = r13
            android.view.WindowManager$LayoutParams r13 = new android.view.WindowManager$LayoutParams
            int r6 = r12.x
            int r7 = r12.y
            r9 = 8519680(0x820000, float:1.1938615E-38)
            r10 = -3
            r5 = -2
            r8 = 1002(0x3ea, float:1.404E-42)
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            int r2 = r12.gravity
            r13.gravity = r2
            int r2 = r12.windowAnimations
            r13.windowAnimations = r2
            android.view.ViewGroup r2 = r12.decorView
            r0.addView(r2, r13)
            r12.isOpen = r1
            int r12 = r12.featureId
            if (r12 != 0) goto Lf6
            r11.updateBackInvokedCallbackState()
        Lf6:
            return
        Lf7:
            r12.refreshDecorView = r1
        Lf9:
            return
    }

    private boolean performPanelShortcut(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r3, int r4, android.view.KeyEvent r5, int r6) {
            r2 = this;
            boolean r0 = r5.isSystem()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r3.isPrepared
            if (r0 != 0) goto L12
            boolean r0 = r2.preparePanel(r3, r5)
            if (r0 == 0) goto L1c
        L12:
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.menu
            if (r0 == 0) goto L1c
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.menu
            boolean r1 = r0.performShortcut(r4, r5, r6)
        L1c:
            if (r1 == 0) goto L2a
            r4 = 1
            r5 = r6 & 1
            if (r5 != 0) goto L2a
            androidx.appcompat.widget.DecorContentParent r5 = r2.mDecorContentParent
            if (r5 != 0) goto L2a
            r2.closePanel(r3, r4)
        L2a:
            return r1
    }

    private boolean preparePanel(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r9, android.view.KeyEvent r10) {
            r8 = this;
            boolean r0 = r8.mDestroyed
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r9.isPrepared
            r2 = 1
            if (r0 == 0) goto Lc
            return r2
        Lc:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r8.mPreparedPanel
            if (r0 == 0) goto L15
            if (r0 == r9) goto L15
            r8.closePanel(r0, r1)
        L15:
            android.view.Window$Callback r0 = r8.getWindowCallback()
            if (r0 == 0) goto L23
            int r3 = r9.featureId
            android.view.View r3 = r0.onCreatePanelView(r3)
            r9.createdPanelView = r3
        L23:
            int r3 = r9.featureId
            if (r3 == 0) goto L30
            int r3 = r9.featureId
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 != r4) goto L2e
            goto L30
        L2e:
            r3 = r1
            goto L31
        L30:
            r3 = r2
        L31:
            if (r3 == 0) goto L3a
            androidx.appcompat.widget.DecorContentParent r4 = r8.mDecorContentParent
            if (r4 == 0) goto L3a
            r4.setMenuPrepared()
        L3a:
            android.view.View r4 = r9.createdPanelView
            if (r4 != 0) goto Lea
            if (r3 == 0) goto L48
            androidx.appcompat.app.ActionBar r4 = r8.peekSupportActionBar()
            boolean r4 = r4 instanceof androidx.appcompat.app.ToolbarActionBar
            if (r4 != 0) goto Lea
        L48:
            androidx.appcompat.view.menu.MenuBuilder r4 = r9.menu
            r5 = 0
            if (r4 == 0) goto L51
            boolean r4 = r9.refreshMenuContent
            if (r4 == 0) goto L9a
        L51:
            androidx.appcompat.view.menu.MenuBuilder r4 = r9.menu
            if (r4 != 0) goto L60
            boolean r4 = r8.initializePanelMenu(r9)
            if (r4 == 0) goto L5f
            androidx.appcompat.view.menu.MenuBuilder r4 = r9.menu
            if (r4 != 0) goto L60
        L5f:
            return r1
        L60:
            if (r3 == 0) goto L7a
            androidx.appcompat.widget.DecorContentParent r4 = r8.mDecorContentParent
            if (r4 == 0) goto L7a
            androidx.appcompat.app.AppCompatDelegateImpl$ActionMenuPresenterCallback r4 = r8.mActionMenuPresenterCallback
            if (r4 != 0) goto L71
            androidx.appcompat.app.AppCompatDelegateImpl$ActionMenuPresenterCallback r4 = new androidx.appcompat.app.AppCompatDelegateImpl$ActionMenuPresenterCallback
            r4.<init>(r8)
            r8.mActionMenuPresenterCallback = r4
        L71:
            androidx.appcompat.widget.DecorContentParent r4 = r8.mDecorContentParent
            androidx.appcompat.view.menu.MenuBuilder r6 = r9.menu
            androidx.appcompat.app.AppCompatDelegateImpl$ActionMenuPresenterCallback r7 = r8.mActionMenuPresenterCallback
            r4.setMenu(r6, r7)
        L7a:
            androidx.appcompat.view.menu.MenuBuilder r4 = r9.menu
            r4.stopDispatchingItemsChanged()
            int r4 = r9.featureId
            androidx.appcompat.view.menu.MenuBuilder r6 = r9.menu
            boolean r4 = r0.onCreatePanelMenu(r4, r6)
            if (r4 != 0) goto L98
            r9.setMenu(r5)
            if (r3 == 0) goto L97
            androidx.appcompat.widget.DecorContentParent r9 = r8.mDecorContentParent
            if (r9 == 0) goto L97
            androidx.appcompat.app.AppCompatDelegateImpl$ActionMenuPresenterCallback r10 = r8.mActionMenuPresenterCallback
            r9.setMenu(r5, r10)
        L97:
            return r1
        L98:
            r9.refreshMenuContent = r1
        L9a:
            androidx.appcompat.view.menu.MenuBuilder r4 = r9.menu
            r4.stopDispatchingItemsChanged()
            android.os.Bundle r4 = r9.frozenActionViewState
            if (r4 == 0) goto Lac
            androidx.appcompat.view.menu.MenuBuilder r4 = r9.menu
            android.os.Bundle r6 = r9.frozenActionViewState
            r4.restoreActionViewStates(r6)
            r9.frozenActionViewState = r5
        Lac:
            android.view.View r4 = r9.createdPanelView
            androidx.appcompat.view.menu.MenuBuilder r6 = r9.menu
            boolean r0 = r0.onPreparePanel(r1, r4, r6)
            if (r0 != 0) goto Lc7
            if (r3 == 0) goto Lc1
            androidx.appcompat.widget.DecorContentParent r10 = r8.mDecorContentParent
            if (r10 == 0) goto Lc1
            androidx.appcompat.app.AppCompatDelegateImpl$ActionMenuPresenterCallback r0 = r8.mActionMenuPresenterCallback
            r10.setMenu(r5, r0)
        Lc1:
            androidx.appcompat.view.menu.MenuBuilder r9 = r9.menu
            r9.startDispatchingItemsChanged()
            return r1
        Lc7:
            if (r10 == 0) goto Lce
            int r10 = r10.getDeviceId()
            goto Lcf
        Lce:
            r10 = -1
        Lcf:
            android.view.KeyCharacterMap r10 = android.view.KeyCharacterMap.load(r10)
            int r10 = r10.getKeyboardType()
            if (r10 == r2) goto Ldb
            r10 = r2
            goto Ldc
        Ldb:
            r10 = r1
        Ldc:
            r9.qwertyMode = r10
            androidx.appcompat.view.menu.MenuBuilder r10 = r9.menu
            boolean r0 = r9.qwertyMode
            r10.setQwertyMode(r0)
            androidx.appcompat.view.menu.MenuBuilder r10 = r9.menu
            r10.startDispatchingItemsChanged()
        Lea:
            r9.isPrepared = r2
            r9.isHandled = r1
            r8.mPreparedPanel = r9
            return r2
    }

    private void reopenMenu(boolean r6) {
            r5 = this;
            androidx.appcompat.widget.DecorContentParent r0 = r5.mDecorContentParent
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L84
            boolean r0 = r0.canShowOverflowMenu()
            if (r0 == 0) goto L84
            android.content.Context r0 = r5.mContext
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            if (r0 == 0) goto L20
            androidx.appcompat.widget.DecorContentParent r0 = r5.mDecorContentParent
            boolean r0 = r0.isOverflowMenuShowPending()
            if (r0 == 0) goto L84
        L20:
            android.view.Window$Callback r0 = r5.getWindowCallback()
            androidx.appcompat.widget.DecorContentParent r3 = r5.mDecorContentParent
            boolean r3 = r3.isOverflowMenuShowing()
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == 0) goto L44
            if (r6 != 0) goto L31
            goto L44
        L31:
            androidx.appcompat.widget.DecorContentParent r6 = r5.mDecorContentParent
            r6.hideOverflowMenu()
            boolean r6 = r5.mDestroyed
            if (r6 != 0) goto L83
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r6 = r5.getPanelState(r2, r1)
            androidx.appcompat.view.menu.MenuBuilder r6 = r6.menu
            r0.onPanelClosed(r4, r6)
            goto L83
        L44:
            if (r0 == 0) goto L83
            boolean r6 = r5.mDestroyed
            if (r6 != 0) goto L83
            boolean r6 = r5.mInvalidatePanelMenuPosted
            if (r6 == 0) goto L63
            int r6 = r5.mInvalidatePanelMenuFeatures
            r6 = r6 & r1
            if (r6 == 0) goto L63
            android.view.Window r6 = r5.mWindow
            android.view.View r6 = r6.getDecorView()
            java.lang.Runnable r3 = r5.mInvalidatePanelMenuRunnable
            r6.removeCallbacks(r3)
            java.lang.Runnable r6 = r5.mInvalidatePanelMenuRunnable
            r6.run()
        L63:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r6 = r5.getPanelState(r2, r1)
            androidx.appcompat.view.menu.MenuBuilder r1 = r6.menu
            if (r1 == 0) goto L83
            boolean r1 = r6.refreshMenuContent
            if (r1 != 0) goto L83
            android.view.View r1 = r6.createdPanelView
            androidx.appcompat.view.menu.MenuBuilder r3 = r6.menu
            boolean r1 = r0.onPreparePanel(r2, r1, r3)
            if (r1 == 0) goto L83
            androidx.appcompat.view.menu.MenuBuilder r6 = r6.menu
            r0.onMenuOpened(r4, r6)
            androidx.appcompat.widget.DecorContentParent r6 = r5.mDecorContentParent
            r6.showOverflowMenu()
        L83:
            return
        L84:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r6 = r5.getPanelState(r2, r1)
            r6.refreshDecorView = r1
            r5.closePanel(r6, r2)
            r0 = 0
            r5.openPanel(r6, r0)
            return
    }

    private int sanitizeWindowFeatureId(int r3) {
            r2 = this;
            r0 = 8
            java.lang.String r1 = "AppCompatDelegate"
            if (r3 != r0) goto Le
            java.lang.String r3 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."
            android.util.Log.i(r1, r3)
            r3 = 108(0x6c, float:1.51E-43)
            return r3
        Le:
            r0 = 9
            if (r3 != r0) goto L19
            java.lang.String r3 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."
            android.util.Log.i(r1, r3)
            r3 = 109(0x6d, float:1.53E-43)
        L19:
            return r3
    }

    private boolean shouldInheritContext(android.view.ViewParent r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            android.view.Window r1 = r3.mWindow
            android.view.View r1 = r1.getDecorView()
        La:
            if (r4 != 0) goto Le
            r4 = 1
            return r4
        Le:
            if (r4 == r1) goto L23
            boolean r2 = r4 instanceof android.view.View
            if (r2 == 0) goto L23
            r2 = r4
            android.view.View r2 = (android.view.View) r2
            boolean r2 = r2.isAttachedToWindow()
            if (r2 == 0) goto L1e
            goto L23
        L1e:
            android.view.ViewParent r4 = r4.getParent()
            goto La
        L23:
            return r0
    }

    private void throwFeatureRequestIfSubDecorInstalled() {
            r2 = this;
            boolean r0 = r2.mSubDecorInstalled
            if (r0 != 0) goto L5
            return
        L5:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.String r1 = "Window feature must be requested before adding content"
            r0.<init>(r1)
            throw r0
    }

    private androidx.appcompat.app.AppCompatActivity tryUnwrapContext() {
            r3 = this;
            android.content.Context r0 = r3.mContext
        L2:
            r1 = 0
            if (r0 == 0) goto L17
            boolean r2 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            if (r2 == 0) goto Lc
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            return r0
        Lc:
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L17
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L2
        L17:
            return r1
    }

    private void updateActivityConfiguration(android.content.res.Configuration r4) {
            r3 = this;
            java.lang.Object r0 = r3.mHost
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r1 = r0 instanceof androidx.lifecycle.LifecycleOwner
            if (r1 == 0) goto L1f
            r1 = r0
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r1.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r1 = r1.isAtLeast(r2)
            if (r1 == 0) goto L2a
            r0.onConfigurationChanged(r4)
            goto L2a
        L1f:
            boolean r1 = r3.mCreated
            if (r1 == 0) goto L2a
            boolean r1 = r3.mDestroyed
            if (r1 != 0) goto L2a
            r0.onConfigurationChanged(r4)
        L2a:
            return
    }

    private boolean updateAppConfiguration(int r10, androidx.core.os.LocaleListCompat r11, boolean r12) {
            r9 = this;
            android.content.Context r1 = r9.mContext
            r4 = 0
            r5 = 0
            r0 = r9
            r2 = r10
            r3 = r11
            android.content.res.Configuration r0 = r0.createOverrideAppConfiguration(r1, r2, r3, r4, r5)
            android.content.Context r1 = r9.mContext
            int r1 = r9.getActivityHandlesConfigChangesFlags(r1)
            android.content.res.Configuration r2 = r9.mEffectiveConfiguration
            if (r2 != 0) goto L1f
            android.content.Context r2 = r9.mContext
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.LocaleListCompat r2 = r9.getConfigurationLocales(r2)
            r5 = 0
            if (r11 != 0) goto L30
            r6 = r5
            goto L34
        L30:
            androidx.core.os.LocaleListCompat r6 = r9.getConfigurationLocales(r0)
        L34:
            r7 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r3 = r7
        L3b:
            if (r6 == 0) goto L45
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L45
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r2 = ~r1
            r2 = r2 & r3
            r8 = 1
            if (r2 == 0) goto L8c
            if (r12 == 0) goto L8c
            boolean r12 = r9.mBaseContextAttached
            if (r12 == 0) goto L8c
            boolean r12 = androidx.appcompat.app.AppCompatDelegateImpl.sCanReturnDifferentContext
            if (r12 != 0) goto L58
            boolean r12 = r9.mCreated
            if (r12 == 0) goto L8c
        L58:
            java.lang.Object r12 = r9.mHost
            boolean r2 = r12 instanceof android.app.Activity
            if (r2 == 0) goto L8c
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r12 = r12.isChild()
            if (r12 != 0) goto L8c
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r12 < r2) goto L83
            r12 = r3 & 8192(0x2000, float:1.148E-41)
            if (r12 == 0) goto L83
            java.lang.Object r12 = r9.mHost
            android.app.Activity r12 = (android.app.Activity) r12
            android.view.Window r12 = r12.getWindow()
            android.view.View r12 = r12.getDecorView()
            int r0 = r0.getLayoutDirection()
            r12.setLayoutDirection(r0)
        L83:
            java.lang.Object r12 = r9.mHost
            android.app.Activity r12 = (android.app.Activity) r12
            androidx.core.app.ActivityCompat.recreate(r12)
            r12 = r8
            goto L8d
        L8c:
            r12 = r7
        L8d:
            if (r12 != 0) goto L9a
            if (r3 == 0) goto L9a
            r12 = r3 & r1
            if (r12 != r3) goto L96
            r7 = r8
        L96:
            r9.updateResourcesConfiguration(r4, r6, r7, r5)
            goto L9b
        L9a:
            r8 = r12
        L9b:
            if (r8 == 0) goto Lb7
            java.lang.Object r12 = r9.mHost
            boolean r0 = r12 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto Lb7
            r0 = r3 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto Lac
            androidx.appcompat.app.AppCompatActivity r12 = (androidx.appcompat.app.AppCompatActivity) r12
            r12.onNightModeChanged(r10)
        Lac:
            r10 = r3 & 4
            if (r10 == 0) goto Lb7
            java.lang.Object r10 = r9.mHost
            androidx.appcompat.app.AppCompatActivity r10 = (androidx.appcompat.app.AppCompatActivity) r10
            r10.onLocalesChanged(r11)
        Lb7:
            if (r6 == 0) goto Lca
            android.content.Context r10 = r9.mContext
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            androidx.core.os.LocaleListCompat r10 = r9.getConfigurationLocales(r10)
            r9.setDefaultLocalesForLocaleList(r10)
        Lca:
            return r8
    }

    private void updateResourcesConfiguration(int r4, androidx.core.os.LocaleListCompat r5, boolean r6, android.content.res.Configuration r7) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r1 = new android.content.res.Configuration
            android.content.res.Configuration r2 = r0.getConfiguration()
            r1.<init>(r2)
            if (r7 == 0) goto L14
            r1.updateFrom(r7)
        L14:
            android.content.res.Configuration r7 = r0.getConfiguration()
            int r7 = r7.uiMode
            r7 = r7 & (-49)
            r4 = r4 | r7
            r1.uiMode = r4
            if (r5 == 0) goto L24
            r3.setConfigurationLocales(r1, r5)
        L24:
            r4 = 0
            r0.updateConfiguration(r1, r4)
            int r4 = r3.mThemeResId
            if (r4 == 0) goto L3d
            android.content.Context r5 = r3.mContext
            r5.setTheme(r4)
            android.content.Context r4 = r3.mContext
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = r3.mThemeResId
            r7 = 1
            r4.applyStyle(r5, r7)
        L3d:
            if (r6 == 0) goto L48
            java.lang.Object r4 = r3.mHost
            boolean r4 = r4 instanceof android.app.Activity
            if (r4 == 0) goto L48
            r3.updateActivityConfiguration(r1)
        L48:
            return
    }

    private void updateStatusGuardColor(android.view.View r3) {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getWindowSystemUiVisibility(r3)
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L11
            android.content.Context r0 = r2.mContext
            int r1 = androidx.appcompat.R.color.abc_decor_view_status_guard_light
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
            goto L19
        L11:
            android.content.Context r0 = r2.mContext
            int r1 = androidx.appcompat.R.color.abc_decor_view_status_guard
            int r0 = androidx.core.content.ContextCompat.getColor(r0, r1)
        L19:
            r3.setBackgroundColor(r0)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void addContentView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.ensureSubDecor()
            android.view.ViewGroup r0 = r2.mSubDecor
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r3, r4)
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r3 = r2.mAppCompatWindowCallback
            android.view.Window r4 = r2.mWindow
            android.view.Window$Callback r4 = r4.getCallback()
            r3.bypassOnContentChanged(r4)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    boolean applyAppLocales() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            boolean r0 = isAutoStorageOptedIn(r0)
            if (r0 == 0) goto L21
            androidx.core.os.LocaleListCompat r0 = getRequestedAppLocales()
            if (r0 == 0) goto L21
            androidx.core.os.LocaleListCompat r0 = getRequestedAppLocales()
            androidx.core.os.LocaleListCompat r1 = getStoredAppLocales()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            android.content.Context r0 = r2.mContext
            r2.asyncExecuteSyncRequestedAndStoredLocales(r0)
        L21:
            r0 = 1
            boolean r0 = r2.applyApplicationSpecificConfig(r0)
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean applyDayNight() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.applyApplicationSpecificConfig(r0)
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public android.content.Context attachBaseContext2(android.content.Context r9) {
            r8 = this;
            r0 = 1
            r8.mBaseContextAttached = r0
            int r0 = r8.calculateNightMode()
            int r0 = r8.mapNightMode(r9, r0)
            boolean r1 = isAutoStorageOptedIn(r9)
            if (r1 == 0) goto L14
            syncRequestedAndStoredLocales(r9)
        L14:
            androidx.core.os.LocaleListCompat r7 = r8.calculateApplicationLocales(r9)
            boolean r1 = r9 instanceof android.view.ContextThemeWrapper
            if (r1 == 0) goto L2d
            r5 = 0
            r6 = 0
            r1 = r8
            r2 = r9
            r3 = r0
            r4 = r7
            android.content.res.Configuration r1 = r1.createOverrideAppConfiguration(r2, r3, r4, r5, r6)
            r2 = r9
            android.view.ContextThemeWrapper r2 = (android.view.ContextThemeWrapper) r2     // Catch: java.lang.IllegalStateException -> L2d
            r2.applyOverrideConfiguration(r1)     // Catch: java.lang.IllegalStateException -> L2d
            return r9
        L2d:
            boolean r1 = r9 instanceof androidx.appcompat.view.ContextThemeWrapper
            if (r1 == 0) goto L42
            r5 = 0
            r6 = 0
            r1 = r8
            r2 = r9
            r3 = r0
            r4 = r7
            android.content.res.Configuration r1 = r1.createOverrideAppConfiguration(r2, r3, r4, r5, r6)
            r2 = r9
            androidx.appcompat.view.ContextThemeWrapper r2 = (androidx.appcompat.view.ContextThemeWrapper) r2     // Catch: java.lang.IllegalStateException -> L42
            r2.applyOverrideConfiguration(r1)     // Catch: java.lang.IllegalStateException -> L42
            return r9
        L42:
            boolean r1 = androidx.appcompat.app.AppCompatDelegateImpl.sCanReturnDifferentContext
            if (r1 != 0) goto L4b
            android.content.Context r9 = super.attachBaseContext2(r9)
            return r9
        L4b:
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = -1
            r1.uiMode = r2
            r2 = 0
            r1.fontScale = r2
            android.content.Context r1 = r9.createConfigurationContext(r1)
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            android.content.res.Resources r2 = r9.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r3 = r2.uiMode
            r1.uiMode = r3
            boolean r3 = r1.equals(r2)
            if (r3 != 0) goto L79
            android.content.res.Configuration r1 = generateConfigDelta(r1, r2)
            goto L7a
        L79:
            r1 = 0
        L7a:
            r5 = r1
            r6 = 1
            r1 = r8
            r2 = r9
            r3 = r0
            r4 = r7
            android.content.res.Configuration r0 = r1.createOverrideAppConfiguration(r2, r3, r4, r5, r6)
            androidx.appcompat.view.ContextThemeWrapper r1 = new androidx.appcompat.view.ContextThemeWrapper
            int r2 = androidx.appcompat.R.style.Theme_AppCompat_Empty
            r1.<init>(r9, r2)
            r1.applyOverrideConfiguration(r0)
            android.content.res.Resources$Theme r9 = r9.getTheme()     // Catch: java.lang.NullPointerException -> L9b
            if (r9 == 0) goto L9b
            android.content.res.Resources$Theme r9 = r1.getTheme()
            androidx.core.content.res.ResourcesCompat.ThemeCompat.rebase(r9)
        L9b:
            android.content.Context r9 = super.attachBaseContext2(r1)
            return r9
    }

    androidx.core.os.LocaleListCompat calculateApplicationLocales(android.content.Context r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            if (r0 < r1) goto L8
            return r2
        L8:
            androidx.core.os.LocaleListCompat r0 = getRequestedAppLocales()
            if (r0 != 0) goto Lf
            return r2
        Lf:
            android.content.Context r4 = r4.getApplicationContext()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            androidx.core.os.LocaleListCompat r4 = r3.getConfigurationLocales(r4)
            androidx.core.os.LocaleListCompat r0 = androidx.appcompat.app.LocaleOverlayHelper.combineLocalesIfOverlayExists(r0, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2a
            goto L2b
        L2a:
            r4 = r0
        L2b:
            return r4
    }

    void callOnPanelClosed(int r3, androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r4, android.view.Menu r5) {
            r2 = this;
            if (r5 != 0) goto L11
            if (r4 != 0) goto Ld
            if (r3 < 0) goto Ld
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState[] r0 = r2.mPanels
            int r1 = r0.length
            if (r3 >= r1) goto Ld
            r4 = r0[r3]
        Ld:
            if (r4 == 0) goto L11
            androidx.appcompat.view.menu.MenuBuilder r5 = r4.menu
        L11:
            if (r4 == 0) goto L18
            boolean r4 = r4.isOpen
            if (r4 != 0) goto L18
            return
        L18:
            boolean r4 = r2.mDestroyed
            if (r4 != 0) goto L27
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r4 = r2.mAppCompatWindowCallback
            android.view.Window r0 = r2.mWindow
            android.view.Window$Callback r0 = r0.getCallback()
            r4.bypassOnPanelClosed(r0, r3, r5)
        L27:
            return
    }

    void checkCloseActionMenu(androidx.appcompat.view.menu.MenuBuilder r3) {
            r2 = this;
            boolean r0 = r2.mClosingActionMenu
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.mClosingActionMenu = r0
            androidx.appcompat.widget.DecorContentParent r0 = r2.mDecorContentParent
            r0.dismissPopups()
            android.view.Window$Callback r0 = r2.getWindowCallback()
            if (r0 == 0) goto L1c
            boolean r1 = r2.mDestroyed
            if (r1 != 0) goto L1c
            r1 = 108(0x6c, float:1.51E-43)
            r0.onPanelClosed(r1, r3)
        L1c:
            r3 = 0
            r2.mClosingActionMenu = r3
            return
    }

    void closePanel(int r2) {
            r1 = this;
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r1.getPanelState(r2, r0)
            r1.closePanel(r2, r0)
            return
    }

    void closePanel(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L16
            int r0 = r4.featureId
            if (r0 != 0) goto L16
            androidx.appcompat.widget.DecorContentParent r0 = r3.mDecorContentParent
            if (r0 == 0) goto L16
            boolean r0 = r0.isOverflowMenuShowing()
            if (r0 == 0) goto L16
            androidx.appcompat.view.menu.MenuBuilder r4 = r4.menu
            r3.checkCloseActionMenu(r4)
            return
        L16:
            android.content.Context r0 = r3.mContext
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r1 = 0
            if (r0 == 0) goto L37
            boolean r2 = r4.isOpen
            if (r2 == 0) goto L37
            android.view.ViewGroup r2 = r4.decorView
            if (r2 == 0) goto L37
            android.view.ViewGroup r2 = r4.decorView
            r0.removeView(r2)
            if (r5 == 0) goto L37
            int r5 = r4.featureId
            r3.callOnPanelClosed(r5, r4, r1)
        L37:
            r5 = 0
            r4.isPrepared = r5
            r4.isHandled = r5
            r4.isOpen = r5
            r4.shownPanelView = r1
            r5 = 1
            r4.refreshDecorView = r5
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r5 = r3.mPreparedPanel
            if (r5 != r4) goto L49
            r3.mPreparedPanel = r1
        L49:
            int r4 = r4.featureId
            if (r4 != 0) goto L50
            r3.updateBackInvokedCallbackState()
        L50:
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public android.view.View createView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
            r11 = this;
            androidx.appcompat.app.AppCompatViewInflater r0 = r11.mAppCompatViewInflater
            r1 = 0
            if (r0 != 0) goto L5d
            android.content.Context r0 = r11.mContext
            int[] r2 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_viewInflaterClass
            java.lang.String r2 = r0.getString(r2)
            r0.recycle()
            if (r2 != 0) goto L20
            androidx.appcompat.app.AppCompatViewInflater r0 = new androidx.appcompat.app.AppCompatViewInflater
            r0.<init>()
            r11.mAppCompatViewInflater = r0
            goto L5d
        L20:
            android.content.Context r0 = r11.mContext     // Catch: java.lang.Throwable -> L3b
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L3b
            java.lang.Class r0 = r0.loadClass(r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L3b
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r0 = r0.newInstance(r3)     // Catch: java.lang.Throwable -> L3b
            androidx.appcompat.app.AppCompatViewInflater r0 = (androidx.appcompat.app.AppCompatViewInflater) r0     // Catch: java.lang.Throwable -> L3b
            r11.mAppCompatViewInflater = r0     // Catch: java.lang.Throwable -> L3b
            goto L5d
        L3b:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.<init>(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = ". Falling back to default."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r2, r0)
            androidx.appcompat.app.AppCompatViewInflater r0 = new androidx.appcompat.app.AppCompatViewInflater
            r0.<init>()
            r11.mAppCompatViewInflater = r0
        L5d:
            boolean r8 = androidx.appcompat.app.AppCompatDelegateImpl.IS_PRE_LOLLIPOP
            if (r8 == 0) goto L8e
            androidx.appcompat.app.LayoutIncludeDetector r0 = r11.mLayoutIncludeDetector
            if (r0 != 0) goto L6c
            androidx.appcompat.app.LayoutIncludeDetector r0 = new androidx.appcompat.app.LayoutIncludeDetector
            r0.<init>()
            r11.mLayoutIncludeDetector = r0
        L6c:
            androidx.appcompat.app.LayoutIncludeDetector r0 = r11.mLayoutIncludeDetector
            boolean r0 = r0.detect(r15)
            r2 = 1
            if (r0 == 0) goto L77
            r7 = r2
            goto L8f
        L77:
            boolean r0 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r0 == 0) goto L86
            r0 = r15
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r2) goto L8e
            r1 = r2
            goto L8e
        L86:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.shouldInheritContext(r0)
            r1 = r0
        L8e:
            r7 = r1
        L8f:
            androidx.appcompat.app.AppCompatViewInflater r2 = r11.mAppCompatViewInflater
            r9 = 1
            boolean r10 = androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.createView(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    void dismissPopups() {
            r2 = this;
            androidx.appcompat.widget.DecorContentParent r0 = r2.mDecorContentParent
            if (r0 == 0) goto L7
            r0.dismissPopups()
        L7:
            android.widget.PopupWindow r0 = r2.mActionModePopup
            if (r0 == 0) goto L26
            android.view.Window r0 = r2.mWindow
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r2.mShowActionModePopup
            r0.removeCallbacks(r1)
            android.widget.PopupWindow r0 = r2.mActionModePopup
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L23
            android.widget.PopupWindow r0 = r2.mActionModePopup     // Catch: java.lang.IllegalArgumentException -> L23
            r0.dismiss()     // Catch: java.lang.IllegalArgumentException -> L23
        L23:
            r0 = 0
            r2.mActionModePopup = r0
        L26:
            r2.endOnGoingFadeAnimation()
            r0 = 0
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r2.getPanelState(r0, r0)
            if (r0 == 0) goto L39
            androidx.appcompat.view.menu.MenuBuilder r1 = r0.menu
            if (r1 == 0) goto L39
            androidx.appcompat.view.menu.MenuBuilder r0 = r0.menu
            r0.close()
        L39:
            return
    }

    boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            java.lang.Object r0 = r3.mHost
            boolean r1 = r0 instanceof androidx.core.view.KeyEventDispatcher.Component
            r2 = 1
            if (r1 != 0) goto Lb
            boolean r0 = r0 instanceof androidx.appcompat.app.AppCompatDialog
            if (r0 == 0) goto L1a
        Lb:
            android.view.Window r0 = r3.mWindow
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L1a
            boolean r0 = androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(r0, r4)
            if (r0 == 0) goto L1a
            return r2
        L1a:
            int r0 = r4.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L31
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r0 = r3.mAppCompatWindowCallback
            android.view.Window r1 = r3.mWindow
            android.view.Window$Callback r1 = r1.getCallback()
            boolean r0 = r0.bypassDispatchKeyEvent(r1, r4)
            if (r0 == 0) goto L31
            return r2
        L31:
            int r0 = r4.getKeyCode()
            int r1 = r4.getAction()
            if (r1 != 0) goto L40
            boolean r4 = r3.onKeyDown(r0, r4)
            goto L44
        L40:
            boolean r4 = r3.onKeyUp(r0, r4)
        L44:
            return r4
    }

    void doInvalidatePanelMenu(int r5) {
            r4 = this;
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r1 = r4.getPanelState(r5, r0)
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.menu
            if (r2 == 0) goto L25
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            androidx.appcompat.view.menu.MenuBuilder r3 = r1.menu
            r3.saveActionViewStates(r2)
            int r3 = r2.size()
            if (r3 <= 0) goto L1b
            r1.frozenActionViewState = r2
        L1b:
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.menu
            r2.stopDispatchingItemsChanged()
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.menu
            r2.clear()
        L25:
            r1.refreshMenuContent = r0
            r1.refreshDecorView = r0
            r0 = 108(0x6c, float:1.51E-43)
            if (r5 == r0) goto L2f
            if (r5 != 0) goto L40
        L2f:
            androidx.appcompat.widget.DecorContentParent r5 = r4.mDecorContentParent
            if (r5 == 0) goto L40
            r5 = 0
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r4.getPanelState(r5, r5)
            if (r0 == 0) goto L40
            r0.isPrepared = r5
            r5 = 0
            r4.preparePanel(r0, r5)
        L40:
            return
    }

    void endOnGoingFadeAnimation() {
            r1 = this;
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r1.mFadeAnim
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState findMenuPanel(android.view.Menu r6) {
            r5 = this;
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState[] r0 = r5.mPanels
            r1 = 0
            if (r0 == 0) goto L7
            int r2 = r0.length
            goto L8
        L7:
            r2 = r1
        L8:
            if (r1 >= r2) goto L16
            r3 = r0[r1]
            if (r3 == 0) goto L13
            androidx.appcompat.view.menu.MenuBuilder r4 = r3.menu
            if (r4 != r6) goto L13
            return r3
        L13:
            int r1 = r1 + 1
            goto L8
        L16:
            r6 = 0
            return r6
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public <T extends android.view.View> T findViewById(int r2) {
            r1 = this;
            r1.ensureSubDecor()
            android.view.Window r0 = r1.mWindow
            android.view.View r2 = r0.findViewById(r2)
            return r2
    }

    final android.content.Context getActionBarThemedContext() {
            r1 = this;
            androidx.appcompat.app.ActionBar r0 = r1.getSupportActionBar()
            if (r0 == 0) goto Lb
            android.content.Context r0 = r0.getThemedContext()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L10
            android.content.Context r0 = r1.mContext
        L10:
            return r0
    }

    final androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager getAutoTimeNightModeManager() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r1.getAutoTimeNightModeManager(r0)
            return r0
    }

    androidx.core.os.LocaleListCompat getConfigurationLocales(android.content.res.Configuration r1) {
            r0 = this;
            androidx.core.os.LocaleListCompat r1 = androidx.appcompat.app.AppCompatDelegateImpl.Api24Impl.getLocales(r1)
            return r1
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public android.content.Context getContextForDelegate() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegateImpl$ActionBarDrawableToggleImpl r0 = new androidx.appcompat.app.AppCompatDelegateImpl$ActionBarDrawableToggleImpl
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public int getLocalNightMode() {
            r1 = this;
            int r0 = r1.mLocalNightMode
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public android.view.MenuInflater getMenuInflater() {
            r2 = this;
            android.view.MenuInflater r0 = r2.mMenuInflater
            if (r0 != 0) goto L19
            r2.initWindowDecorActionBar()
            androidx.appcompat.view.SupportMenuInflater r0 = new androidx.appcompat.view.SupportMenuInflater
            androidx.appcompat.app.ActionBar r1 = r2.mActionBar
            if (r1 == 0) goto L12
            android.content.Context r1 = r1.getThemedContext()
            goto L14
        L12:
            android.content.Context r1 = r2.mContext
        L14:
            r0.<init>(r1)
            r2.mMenuInflater = r0
        L19:
            android.view.MenuInflater r0 = r2.mMenuInflater
            return r0
    }

    protected androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState getPanelState(int r4, boolean r5) {
            r3 = this;
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState[] r5 = r3.mPanels
            if (r5 == 0) goto L7
            int r0 = r5.length
            if (r0 > r4) goto L15
        L7:
            int r0 = r4 + 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState[] r0 = new androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[r0]
            if (r5 == 0) goto L12
            int r1 = r5.length
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r1)
        L12:
            r3.mPanels = r0
            r5 = r0
        L15:
            r0 = r5[r4]
            if (r0 != 0) goto L20
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = new androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState
            r0.<init>(r4)
            r5[r4] = r0
        L20:
            return r0
    }

    android.view.ViewGroup getSubDecor() {
            r1 = this;
            android.view.ViewGroup r0 = r1.mSubDecor
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public androidx.appcompat.app.ActionBar getSupportActionBar() {
            r1 = this;
            r1.initWindowDecorActionBar()
            androidx.appcompat.app.ActionBar r0 = r1.mActionBar
            return r0
    }

    final java.lang.CharSequence getTitle() {
            r2 = this;
            java.lang.Object r0 = r2.mHost
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto Ld
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
        Ld:
            java.lang.CharSequence r0 = r2.mTitle
            return r0
    }

    final android.view.Window.Callback getWindowCallback() {
            r1 = this;
            android.view.Window r0 = r1.mWindow
            android.view.Window$Callback r0 = r0.getCallback()
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean hasWindowFeature(int r5) {
            r4 = this;
            int r0 = r4.sanitizeWindowFeatureId(r5)
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L2b
            r3 = 2
            if (r0 == r3) goto L28
            r3 = 5
            if (r0 == r3) goto L25
            r3 = 10
            if (r0 == r3) goto L22
            r3 = 108(0x6c, float:1.51E-43)
            if (r0 == r3) goto L1f
            r3 = 109(0x6d, float:1.53E-43)
            if (r0 == r3) goto L1c
            r0 = r2
            goto L2d
        L1c:
            boolean r0 = r4.mOverlayActionBar
            goto L2d
        L1f:
            boolean r0 = r4.mHasActionBar
            goto L2d
        L22:
            boolean r0 = r4.mOverlayActionMode
            goto L2d
        L25:
            boolean r0 = r4.mFeatureIndeterminateProgress
            goto L2d
        L28:
            boolean r0 = r4.mFeatureProgress
            goto L2d
        L2b:
            boolean r0 = r4.mWindowNoTitle
        L2d:
            if (r0 != 0) goto L39
            android.view.Window r0 = r4.mWindow
            boolean r5 = r0.hasFeature(r5)
            if (r5 == 0) goto L38
            goto L39
        L38:
            r1 = r2
        L39:
            return r1
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void installViewFactory() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.LayoutInflater$Factory r1 = r0.getFactory()
            if (r1 != 0) goto L10
            androidx.core.view.LayoutInflaterCompat.setFactory2(r0, r2)
            goto L1f
        L10:
            android.view.LayoutInflater$Factory2 r0 = r0.getFactory2()
            boolean r0 = r0 instanceof androidx.appcompat.app.AppCompatDelegateImpl
            if (r0 != 0) goto L1f
            java.lang.String r0 = "AppCompatDelegate"
            java.lang.String r1 = "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's"
            android.util.Log.i(r0, r1)
        L1f:
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void invalidateOptionsMenu() {
            r1 = this;
            androidx.appcompat.app.ActionBar r0 = r1.peekSupportActionBar()
            if (r0 == 0) goto L15
            androidx.appcompat.app.ActionBar r0 = r1.getSupportActionBar()
            boolean r0 = r0.invalidateOptionsMenu()
            if (r0 == 0) goto L11
            goto L15
        L11:
            r0 = 0
            r1.invalidatePanelMenu(r0)
        L15:
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean isHandleNativeActionModesEnabled() {
            r1 = this;
            boolean r0 = r1.mHandleNativeActionModes
            return r0
    }

    int mapNightMode(android.content.Context r3, int r4) {
            r2 = this;
            r0 = -100
            r1 = -1
            if (r4 == r0) goto L40
            if (r4 == r1) goto L3f
            if (r4 == 0) goto L23
            r0 = 1
            if (r4 == r0) goto L3f
            r0 = 2
            if (r4 == r0) goto L3f
            r0 = 3
            if (r4 != r0) goto L1b
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r3 = r2.getAutoBatteryNightModeManager(r3)
            int r3 = r3.getApplyableNightMode()
            return r3
        L1b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."
            r3.<init>(r4)
            throw r3
        L23:
            android.content.Context r4 = r3.getApplicationContext()
            java.lang.String r0 = "uimode"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.app.UiModeManager r4 = (android.app.UiModeManager) r4
            int r4 = r4.getNightMode()
            if (r4 != 0) goto L36
            return r1
        L36:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r3 = r2.getAutoTimeNightModeManager(r3)
            int r3 = r3.getApplyableNightMode()
            return r3
        L3f:
            return r4
        L40:
            return r1
    }

    boolean onBackPressed() {
            r5 = this;
            boolean r0 = r5.mLongPressBackDown
            r1 = 0
            r5.mLongPressBackDown = r1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r5.getPanelState(r1, r1)
            r3 = 1
            if (r2 == 0) goto L16
            boolean r4 = r2.isOpen
            if (r4 == 0) goto L16
            if (r0 != 0) goto L15
            r5.closePanel(r2, r3)
        L15:
            return r3
        L16:
            androidx.appcompat.view.ActionMode r0 = r5.mActionMode
            if (r0 == 0) goto L1e
            r0.finish()
            return r3
        L1e:
            androidx.appcompat.app.ActionBar r0 = r5.getSupportActionBar()
            if (r0 == 0) goto L2b
            boolean r0 = r0.collapseActionView()
            if (r0 == 0) goto L2b
            return r3
        L2b:
            return r1
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            boolean r0 = r1.mHasActionBar
            if (r0 == 0) goto L11
            boolean r0 = r1.mSubDecorInstalled
            if (r0 == 0) goto L11
            androidx.appcompat.app.ActionBar r0 = r1.getSupportActionBar()
            if (r0 == 0) goto L11
            r0.onConfigurationChanged(r2)
        L11:
            androidx.appcompat.widget.AppCompatDrawableManager r2 = androidx.appcompat.widget.AppCompatDrawableManager.get()
            android.content.Context r0 = r1.mContext
            r2.onConfigurationChanged(r0)
            android.content.res.Configuration r2 = new android.content.res.Configuration
            android.content.Context r0 = r1.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            r2.<init>(r0)
            r1.mEffectiveConfiguration = r2
            r2 = 0
            r1.applyApplicationSpecificConfig(r2, r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            r3 = 1
            r2.mBaseContextAttached = r3
            r0 = 0
            r2.applyApplicationSpecificConfig(r0)
            r2.ensureWindow()
            java.lang.Object r0 = r2.mHost
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L29
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.IllegalArgumentException -> L17
            java.lang.String r0 = androidx.core.app.NavUtils.getParentActivityName(r0)     // Catch: java.lang.IllegalArgumentException -> L17
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 == 0) goto L26
            androidx.appcompat.app.ActionBar r0 = r2.peekSupportActionBar()
            if (r0 != 0) goto L23
            r2.mEnableDefaultActionBarUp = r3
            goto L26
        L23:
            r0.setDefaultDisplayHomeAsUpEnabled(r3)
        L26:
            addActiveDelegate(r2)
        L29:
            android.content.res.Configuration r0 = new android.content.res.Configuration
            android.content.Context r1 = r2.mContext
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            r0.<init>(r1)
            r2.mEffectiveConfiguration = r0
            r2.mCreated = r3
            return
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r1, java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r0 = this;
            android.view.View r1 = r0.createView(r1, r2, r3, r4)
            return r1
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.onCreateView(r0, r2, r3, r4)
            return r2
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onDestroy() {
            r3 = this;
            java.lang.Object r0 = r3.mHost
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            removeActivityDelegate(r3)
        L9:
            boolean r0 = r3.mInvalidatePanelMenuPosted
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.mWindow
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.mInvalidatePanelMenuRunnable
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.mDestroyed = r0
            int r0 = r3.mLocalNightMode
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.mHost
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.sLocalNightModes
            java.lang.Object r1 = r3.mHost
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.mLocalNightMode
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.sLocalNightModes
            java.lang.Object r1 = r3.mHost
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.ActionBar r0 = r3.mActionBar
            if (r0 == 0) goto L5b
            r0.onDestroy()
        L5b:
            r3.cleanupAutoManagers()
            return
    }

    boolean onKeyDown(int r4, android.view.KeyEvent r5) {
            r3 = this;
            r0 = 4
            r1 = 1
            r2 = 0
            if (r4 == r0) goto Le
            r0 = 82
            if (r4 == r0) goto La
            goto L1a
        La:
            r3.onKeyDownPanel(r2, r5)
            return r1
        Le:
            int r4 = r5.getFlags()
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 == 0) goto L17
            goto L18
        L17:
            r1 = r2
        L18:
            r3.mLongPressBackDown = r1
        L1a:
            return r2
    }

    boolean onKeyShortcut(int r4, android.view.KeyEvent r5) {
            r3 = this;
            androidx.appcompat.app.ActionBar r0 = r3.getSupportActionBar()
            r1 = 1
            if (r0 == 0) goto Le
            boolean r4 = r0.onKeyShortcut(r4, r5)
            if (r4 == 0) goto Le
            return r1
        Le:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r4 = r3.mPreparedPanel
            if (r4 == 0) goto L23
            int r0 = r5.getKeyCode()
            boolean r4 = r3.performPanelShortcut(r4, r0, r5, r1)
            if (r4 == 0) goto L23
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r4 = r3.mPreparedPanel
            if (r4 == 0) goto L22
            r4.isHandled = r1
        L22:
            return r1
        L23:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r4 = r3.mPreparedPanel
            r0 = 0
            if (r4 != 0) goto L3c
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r4 = r3.getPanelState(r0, r1)
            r3.preparePanel(r4, r5)
            int r2 = r5.getKeyCode()
            boolean r5 = r3.performPanelShortcut(r4, r2, r5, r1)
            r4.isPrepared = r0
            if (r5 == 0) goto L3c
            return r1
        L3c:
            return r0
    }

    boolean onKeyUp(int r4, android.view.KeyEvent r5) {
            r3 = this;
            r0 = 4
            r1 = 1
            r2 = 0
            if (r4 == r0) goto Le
            r0 = 82
            if (r4 == r0) goto La
            goto L15
        La:
            r3.onKeyUpPanel(r2, r5)
            return r1
        Le:
            boolean r4 = r3.onBackPressed()
            if (r4 == 0) goto L15
            return r1
        L15:
            return r2
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder r3, android.view.MenuItem r4) {
            r2 = this;
            android.view.Window$Callback r0 = r2.getWindowCallback()
            if (r0 == 0) goto L1b
            boolean r1 = r2.mDestroyed
            if (r1 != 0) goto L1b
            androidx.appcompat.view.menu.MenuBuilder r3 = r3.getRootMenu()
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r2.findMenuPanel(r3)
            if (r3 == 0) goto L1b
            int r3 = r3.featureId
            boolean r3 = r0.onMenuItemSelected(r3, r4)
            return r3
        L1b:
            r3 = 0
            return r3
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder r1) {
            r0 = this;
            r1 = 1
            r0.reopenMenu(r1)
            return
    }

    void onMenuOpened(int r2) {
            r1 = this;
            r0 = 108(0x6c, float:1.51E-43)
            if (r2 != r0) goto Le
            androidx.appcompat.app.ActionBar r2 = r1.getSupportActionBar()
            if (r2 == 0) goto Le
            r0 = 1
            r2.dispatchMenuVisibilityChanged(r0)
        Le:
            return
    }

    void onPanelClosed(int r3) {
            r2 = this;
            r0 = 108(0x6c, float:1.51E-43)
            r1 = 0
            if (r3 != r0) goto Lf
            androidx.appcompat.app.ActionBar r3 = r2.getSupportActionBar()
            if (r3 == 0) goto L1d
            r3.dispatchMenuVisibilityChanged(r1)
            goto L1d
        Lf:
            if (r3 != 0) goto L1d
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r2.getPanelState(r3, r0)
            boolean r0 = r3.isOpen
            if (r0 == 0) goto L1d
            r2.closePanel(r3, r1)
        L1d:
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostCreate(android.os.Bundle r1) {
            r0 = this;
            r0.ensureSubDecor()
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostResume() {
            r2 = this;
            androidx.appcompat.app.ActionBar r0 = r2.getSupportActionBar()
            if (r0 == 0) goto La
            r1 = 1
            r0.setShowHideAnimationEnabled(r1)
        La:
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStart() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.applyApplicationSpecificConfig(r0, r1)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStop() {
            r2 = this;
            androidx.appcompat.app.ActionBar r0 = r2.getSupportActionBar()
            if (r0 == 0) goto La
            r1 = 0
            r0.setShowHideAnimationEnabled(r1)
        La:
            return
    }

    void onSubDecorInstalled(android.view.ViewGroup r1) {
            r0 = this;
            return
    }

    final androidx.appcompat.app.ActionBar peekSupportActionBar() {
            r1 = this;
            androidx.appcompat.app.ActionBar r0 = r1.mActionBar
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean requestWindowFeature(int r5) {
            r4 = this;
            int r5 = r4.sanitizeWindowFeatureId(r5)
            boolean r0 = r4.mWindowNoTitle
            r1 = 0
            r2 = 108(0x6c, float:1.51E-43)
            if (r0 == 0) goto Le
            if (r5 != r2) goto Le
            return r1
        Le:
            boolean r0 = r4.mHasActionBar
            r3 = 1
            if (r0 == 0) goto L17
            if (r5 != r3) goto L17
            r4.mHasActionBar = r1
        L17:
            if (r5 == r3) goto L4e
            r0 = 2
            if (r5 == r0) goto L48
            r0 = 5
            if (r5 == r0) goto L42
            r0 = 10
            if (r5 == r0) goto L3c
            if (r5 == r2) goto L36
            r0 = 109(0x6d, float:1.53E-43)
            if (r5 == r0) goto L30
            android.view.Window r0 = r4.mWindow
            boolean r5 = r0.requestFeature(r5)
            return r5
        L30:
            r4.throwFeatureRequestIfSubDecorInstalled()
            r4.mOverlayActionBar = r3
            return r3
        L36:
            r4.throwFeatureRequestIfSubDecorInstalled()
            r4.mHasActionBar = r3
            return r3
        L3c:
            r4.throwFeatureRequestIfSubDecorInstalled()
            r4.mOverlayActionMode = r3
            return r3
        L42:
            r4.throwFeatureRequestIfSubDecorInstalled()
            r4.mFeatureIndeterminateProgress = r3
            return r3
        L48:
            r4.throwFeatureRequestIfSubDecorInstalled()
            r4.mFeatureProgress = r3
            return r3
        L4e:
            r4.throwFeatureRequestIfSubDecorInstalled()
            r4.mWindowNoTitle = r3
            return r3
    }

    void setConfigurationLocales(android.content.res.Configuration r1, androidx.core.os.LocaleListCompat r2) {
            r0 = this;
            androidx.appcompat.app.AppCompatDelegateImpl.Api24Impl.setLocales(r1, r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(int r3) {
            r2 = this;
            r2.ensureSubDecor()
            android.view.ViewGroup r0 = r2.mSubDecor
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            android.content.Context r1 = r2.mContext
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r1.inflate(r3, r0)
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r3 = r2.mAppCompatWindowCallback
            android.view.Window r0 = r2.mWindow
            android.view.Window$Callback r0 = r0.getCallback()
            r3.bypassOnContentChanged(r0)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(android.view.View r3) {
            r2 = this;
            r2.ensureSubDecor()
            android.view.ViewGroup r0 = r2.mSubDecor
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r3)
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r3 = r2.mAppCompatWindowCallback
            android.view.Window r0 = r2.mWindow
            android.view.Window$Callback r0 = r0.getCallback()
            r3.bypassOnContentChanged(r0)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.ensureSubDecor()
            android.view.ViewGroup r0 = r2.mSubDecor
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r3, r4)
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r3 = r2.mAppCompatWindowCallback
            android.view.Window r4 = r2.mWindow
            android.view.Window$Callback r4 = r4.getCallback()
            r3.bypassOnContentChanged(r4)
            return
    }

    void setDefaultLocalesForLocaleList(androidx.core.os.LocaleListCompat r1) {
            r0 = this;
            androidx.appcompat.app.AppCompatDelegateImpl.Api24Impl.setDefaultLocales(r1)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setHandleNativeActionModesEnabled(boolean r1) {
            r0 = this;
            r0.mHandleNativeActionModes = r1
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setLocalNightMode(int r2) {
            r1 = this;
            int r0 = r1.mLocalNightMode
            if (r0 == r2) goto Ld
            r1.mLocalNightMode = r2
            boolean r2 = r1.mBaseContextAttached
            if (r2 == 0) goto Ld
            r1.applyDayNight()
        Ld:
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher r3) {
            r2 = this;
            super.setOnBackInvokedDispatcher(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.mDispatcher
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.mBackCallback
            if (r1 == 0) goto L11
            androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.unregisterOnBackInvokedCallback(r0, r1)
            r0 = 0
            r2.mBackCallback = r0
        L11:
            if (r3 != 0) goto L2c
            java.lang.Object r0 = r2.mHost
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2c
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r2.mHost
            android.app.Activity r3 = (android.app.Activity) r3
            android.window.OnBackInvokedDispatcher r3 = androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.getOnBackInvokedDispatcher(r3)
            r2.mDispatcher = r3
            goto L2e
        L2c:
            r2.mDispatcher = r3
        L2e:
            r2.updateBackInvokedCallbackState()
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setSupportActionBar(androidx.appcompat.widget.Toolbar r4) {
            r3 = this;
            java.lang.Object r0 = r3.mHost
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 != 0) goto L7
            return
        L7:
            androidx.appcompat.app.ActionBar r0 = r3.getSupportActionBar()
            boolean r1 = r0 instanceof androidx.appcompat.app.WindowDecorActionBar
            if (r1 != 0) goto L3d
            r1 = 0
            r3.mMenuInflater = r1
            if (r0 == 0) goto L17
            r0.onDestroy()
        L17:
            r3.mActionBar = r1
            if (r4 == 0) goto L34
            androidx.appcompat.app.ToolbarActionBar r0 = new androidx.appcompat.app.ToolbarActionBar
            java.lang.CharSequence r1 = r3.getTitle()
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r2 = r3.mAppCompatWindowCallback
            r0.<init>(r4, r1, r2)
            r3.mActionBar = r0
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r1 = r3.mAppCompatWindowCallback
            androidx.appcompat.app.AppCompatDelegateImpl$ActionBarMenuCallback r0 = r0.mMenuCallback
            r1.setActionBarCallback(r0)
            r0 = 1
            r4.setBackInvokedCallbackEnabled(r0)
            goto L39
        L34:
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r4 = r3.mAppCompatWindowCallback
            r4.setActionBarCallback(r1)
        L39:
            r3.invalidateOptionsMenu()
            return
        L3d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."
            r4.<init>(r0)
            throw r4
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setTheme(int r1) {
            r0 = this;
            r0.mThemeResId = r1
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            r1.mTitle = r2
            androidx.appcompat.widget.DecorContentParent r0 = r1.mDecorContentParent
            if (r0 == 0) goto La
            r0.setWindowTitle(r2)
            goto L1f
        La:
            androidx.appcompat.app.ActionBar r0 = r1.peekSupportActionBar()
            if (r0 == 0) goto L18
            androidx.appcompat.app.ActionBar r0 = r1.peekSupportActionBar()
            r0.setWindowTitle(r2)
            goto L1f
        L18:
            android.widget.TextView r0 = r1.mTitleView
            if (r0 == 0) goto L1f
            r0.setText(r2)
        L1f:
            return
    }

    final boolean shouldAnimateActionModeView() {
            r1 = this;
            boolean r0 = r1.mSubDecorInstalled
            if (r0 == 0) goto L10
            android.view.ViewGroup r0 = r1.mSubDecor
            if (r0 == 0) goto L10
            boolean r0 = r0.isLaidOut()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    boolean shouldRegisterBackInvokedCallback() {
            r3 = this;
            android.window.OnBackInvokedDispatcher r0 = r3.mDispatcher
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r3.getPanelState(r1, r1)
            r2 = 1
            if (r0 == 0) goto L12
            boolean r0 = r0.isOpen
            if (r0 == 0) goto L12
            return r2
        L12:
            androidx.appcompat.view.ActionMode r0 = r3.mActionMode
            if (r0 == 0) goto L17
            return r2
        L17:
            return r1
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public androidx.appcompat.view.ActionMode startSupportActionMode(androidx.appcompat.view.ActionMode.Callback r3) {
            r2 = this;
            if (r3 == 0) goto L33
            androidx.appcompat.view.ActionMode r0 = r2.mActionMode
            if (r0 == 0) goto L9
            r0.finish()
        L9:
            androidx.appcompat.app.AppCompatDelegateImpl$ActionModeCallbackWrapperV9 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$ActionModeCallbackWrapperV9
            r0.<init>(r2, r3)
            androidx.appcompat.app.ActionBar r3 = r2.getSupportActionBar()
            if (r3 == 0) goto L23
            androidx.appcompat.view.ActionMode r3 = r3.startActionMode(r0)
            r2.mActionMode = r3
            if (r3 == 0) goto L23
            androidx.appcompat.app.AppCompatCallback r1 = r2.mAppCompatCallback
            if (r1 == 0) goto L23
            r1.onSupportActionModeStarted(r3)
        L23:
            androidx.appcompat.view.ActionMode r3 = r2.mActionMode
            if (r3 != 0) goto L2d
            androidx.appcompat.view.ActionMode r3 = r2.startSupportActionModeFromWindow(r0)
            r2.mActionMode = r3
        L2d:
            r2.updateBackInvokedCallbackState()
            androidx.appcompat.view.ActionMode r3 = r2.mActionMode
            return r3
        L33:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ActionMode callback can not be null."
            r3.<init>(r0)
            throw r3
    }

    androidx.appcompat.view.ActionMode startSupportActionModeFromWindow(androidx.appcompat.view.ActionMode.Callback r8) {
            r7 = this;
            r7.endOnGoingFadeAnimation()
            androidx.appcompat.view.ActionMode r0 = r7.mActionMode
            if (r0 == 0) goto La
            r0.finish()
        La:
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9
            if (r0 != 0) goto L14
            androidx.appcompat.app.AppCompatDelegateImpl$ActionModeCallbackWrapperV9 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$ActionModeCallbackWrapperV9
            r0.<init>(r7, r8)
            r8 = r0
        L14:
            androidx.appcompat.app.AppCompatCallback r0 = r7.mAppCompatCallback
            r1 = 0
            if (r0 == 0) goto L22
            boolean r2 = r7.mDestroyed
            if (r2 != 0) goto L22
            androidx.appcompat.view.ActionMode r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch: java.lang.AbstractMethodError -> L22
            goto L23
        L22:
            r0 = r1
        L23:
            if (r0 == 0) goto L29
            r7.mActionMode = r0
            goto L15b
        L29:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.mActionModeView
            r2 = 0
            r3 = 1
            if (r0 != 0) goto Ld4
            boolean r0 = r7.mIsFloating
            if (r0 == 0) goto Lb5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.mContext
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = androidx.appcompat.R.attr.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L68
            android.content.Context r5 = r7.mContext
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            androidx.appcompat.view.ContextThemeWrapper r4 = new androidx.appcompat.view.ContextThemeWrapper
            android.content.Context r6 = r7.mContext
            r4.<init>(r6, r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L6a
        L68:
            android.content.Context r4 = r7.mContext
        L6a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.mActionModeView = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = androidx.appcompat.R.attr.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.mActionModePopup = r5
            r6 = 2
            androidx.core.widget.PopupWindowCompat.setWindowLayoutType(r5, r6)
            android.widget.PopupWindow r5 = r7.mActionModePopup
            androidx.appcompat.widget.ActionBarContextView r6 = r7.mActionModeView
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.mActionModePopup
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = androidx.appcompat.R.attr.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.mActionModeView
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.mActionModePopup
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.AppCompatDelegateImpl$6 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$6
            r0.<init>(r7)
            r7.mShowActionModePopup = r0
            goto Ld4
        Lb5:
            android.view.ViewGroup r0 = r7.mSubDecor
            int r4 = androidx.appcompat.R.id.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto Ld4
            android.content.Context r4 = r7.getActionBarThemedContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.inflate()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.mActionModeView = r0
        Ld4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.mActionModeView
            if (r0 == 0) goto L15b
            r7.endOnGoingFadeAnimation()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.mActionModeView
            r0.killMode()
            androidx.appcompat.view.StandaloneActionMode r0 = new androidx.appcompat.view.StandaloneActionMode
            androidx.appcompat.widget.ActionBarContextView r4 = r7.mActionModeView
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.mActionModeView
            android.widget.PopupWindow r6 = r7.mActionModePopup
            if (r6 != 0) goto Lef
            goto Lf0
        Lef:
            r3 = r2
        Lf0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.getMenu()
            boolean r8 = r8.onCreateActionMode(r0, r3)
            if (r8 == 0) goto L159
            r0.invalidate()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.mActionModeView
            r8.initForMode(r0)
            r7.mActionMode = r0
            boolean r8 = r7.shouldAnimateActionModeView()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L12a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.mActionModeView
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.mActionModeView
            androidx.core.view.ViewPropertyAnimatorCompat r8 = androidx.core.view.ViewCompat.animate(r8)
            androidx.core.view.ViewPropertyAnimatorCompat r8 = r8.alpha(r0)
            r7.mFadeAnim = r8
            androidx.appcompat.app.AppCompatDelegateImpl$7 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$7
            r0.<init>(r7)
            r8.setListener(r0)
            goto L149
        L12a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.mActionModeView
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.mActionModeView
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.mActionModeView
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L149
            androidx.appcompat.widget.ActionBarContextView r8 = r7.mActionModeView
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.ViewCompat.requestApplyInsets(r8)
        L149:
            android.widget.PopupWindow r8 = r7.mActionModePopup
            if (r8 == 0) goto L15b
            android.view.Window r8 = r7.mWindow
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.mShowActionModePopup
            r8.post(r0)
            goto L15b
        L159:
            r7.mActionMode = r1
        L15b:
            androidx.appcompat.view.ActionMode r8 = r7.mActionMode
            if (r8 == 0) goto L166
            androidx.appcompat.app.AppCompatCallback r0 = r7.mAppCompatCallback
            if (r0 == 0) goto L166
            r0.onSupportActionModeStarted(r8)
        L166:
            r7.updateBackInvokedCallbackState()
            androidx.appcompat.view.ActionMode r8 = r7.mActionMode
            return r8
    }

    void updateBackInvokedCallbackState() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L27
            boolean r0 = r2.shouldRegisterBackInvokedCallback()
            if (r0 == 0) goto L19
            android.window.OnBackInvokedCallback r1 = r2.mBackCallback
            if (r1 != 0) goto L19
            android.window.OnBackInvokedDispatcher r0 = r2.mDispatcher
            android.window.OnBackInvokedCallback r0 = androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.registerOnBackPressedCallback(r0, r2)
            r2.mBackCallback = r0
            goto L27
        L19:
            if (r0 != 0) goto L27
            android.window.OnBackInvokedCallback r0 = r2.mBackCallback
            if (r0 == 0) goto L27
            android.window.OnBackInvokedDispatcher r1 = r2.mDispatcher
            androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.unregisterOnBackInvokedCallback(r1, r0)
            r0 = 0
            r2.mBackCallback = r0
        L27:
            return
    }

    final int updateStatusGuard(androidx.core.view.WindowInsetsCompat r11, android.graphics.Rect r12) {
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L8
            int r1 = r11.getSystemWindowInsetTop()
            goto Le
        L8:
            if (r12 == 0) goto Ld
            int r1 = r12.top
            goto Le
        Ld:
            r1 = r0
        Le:
            androidx.appcompat.widget.ActionBarContextView r2 = r10.mActionModeView
            r3 = 8
            if (r2 == 0) goto L10f
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r2 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L10f
            androidx.appcompat.widget.ActionBarContextView r2 = r10.mActionModeView
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            androidx.appcompat.widget.ActionBarContextView r4 = r10.mActionModeView
            boolean r4 = r4.isShown()
            r5 = 1
            if (r4 == 0) goto Lfd
            android.graphics.Rect r4 = r10.mTempRect1
            if (r4 != 0) goto L3f
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r10.mTempRect1 = r4
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r10.mTempRect2 = r4
        L3f:
            android.graphics.Rect r4 = r10.mTempRect1
            android.graphics.Rect r6 = r10.mTempRect2
            if (r11 != 0) goto L49
            r4.set(r12)
            goto L5c
        L49:
            int r12 = r11.getSystemWindowInsetLeft()
            int r7 = r11.getSystemWindowInsetTop()
            int r8 = r11.getSystemWindowInsetRight()
            int r11 = r11.getSystemWindowInsetBottom()
            r4.set(r12, r7, r8, r11)
        L5c:
            android.view.ViewGroup r11 = r10.mSubDecor
            androidx.appcompat.widget.ViewUtils.computeFitSystemWindows(r11, r4, r6)
            int r11 = r4.top
            int r12 = r4.left
            int r4 = r4.right
            android.view.ViewGroup r6 = r10.mSubDecor
            androidx.core.view.WindowInsetsCompat r6 = androidx.core.view.ViewCompat.getRootWindowInsets(r6)
            if (r6 != 0) goto L71
            r7 = r0
            goto L75
        L71:
            int r7 = r6.getSystemWindowInsetLeft()
        L75:
            if (r6 != 0) goto L79
            r6 = r0
            goto L7d
        L79:
            int r6 = r6.getSystemWindowInsetRight()
        L7d:
            int r8 = r2.topMargin
            if (r8 != r11) goto L8c
            int r8 = r2.leftMargin
            if (r8 != r12) goto L8c
            int r8 = r2.rightMargin
            if (r8 == r4) goto L8a
            goto L8c
        L8a:
            r12 = r0
            goto L93
        L8c:
            r2.topMargin = r11
            r2.leftMargin = r12
            r2.rightMargin = r4
            r12 = r5
        L93:
            if (r11 <= 0) goto Lbb
            android.view.View r11 = r10.mStatusGuard
            if (r11 != 0) goto Lbb
            android.view.View r11 = new android.view.View
            android.content.Context r4 = r10.mContext
            r11.<init>(r4)
            r10.mStatusGuard = r11
            r11.setVisibility(r3)
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            int r4 = r2.topMargin
            r8 = 51
            r9 = -1
            r11.<init>(r9, r4, r8)
            r11.leftMargin = r7
            r11.rightMargin = r6
            android.view.ViewGroup r4 = r10.mSubDecor
            android.view.View r6 = r10.mStatusGuard
            r4.addView(r6, r9, r11)
            goto Le0
        Lbb:
            android.view.View r11 = r10.mStatusGuard
            if (r11 == 0) goto Le0
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            int r4 = r11.height
            int r8 = r2.topMargin
            if (r4 != r8) goto Ld3
            int r4 = r11.leftMargin
            if (r4 != r7) goto Ld3
            int r4 = r11.rightMargin
            if (r4 == r6) goto Le0
        Ld3:
            int r4 = r2.topMargin
            r11.height = r4
            r11.leftMargin = r7
            r11.rightMargin = r6
            android.view.View r4 = r10.mStatusGuard
            r4.setLayoutParams(r11)
        Le0:
            android.view.View r11 = r10.mStatusGuard
            if (r11 == 0) goto Le5
            goto Le6
        Le5:
            r5 = r0
        Le6:
            if (r5 == 0) goto Lf3
            int r11 = r11.getVisibility()
            if (r11 == 0) goto Lf3
            android.view.View r11 = r10.mStatusGuard
            r10.updateStatusGuardColor(r11)
        Lf3:
            boolean r11 = r10.mOverlayActionMode
            if (r11 != 0) goto Lfa
            if (r5 == 0) goto Lfa
            r1 = r0
        Lfa:
            r11 = r5
            r5 = r12
            goto L107
        Lfd:
            int r11 = r2.topMargin
            if (r11 == 0) goto L105
            r2.topMargin = r0
            r11 = r0
            goto L107
        L105:
            r11 = r0
            r5 = r11
        L107:
            if (r5 == 0) goto L110
            androidx.appcompat.widget.ActionBarContextView r12 = r10.mActionModeView
            r12.setLayoutParams(r2)
            goto L110
        L10f:
            r11 = r0
        L110:
            android.view.View r12 = r10.mStatusGuard
            if (r12 == 0) goto L11b
            if (r11 == 0) goto L117
            goto L118
        L117:
            r0 = r3
        L118:
            r12.setVisibility(r0)
        L11b:
            return r1
    }
}
