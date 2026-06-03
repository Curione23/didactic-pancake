package androidx.activity;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements androidx.activity.contextaware.ContextAware, androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner, androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner, androidx.activity.OnBackPressedDispatcherOwner, androidx.activity.result.ActivityResultRegistryOwner, androidx.activity.result.ActivityResultCaller, androidx.core.content.OnConfigurationChangedProvider, androidx.core.content.OnTrimMemoryProvider, androidx.core.app.OnNewIntentProvider, androidx.core.app.OnMultiWindowModeChangedProvider, androidx.core.app.OnPictureInPictureModeChangedProvider, androidx.core.view.MenuHost, androidx.activity.FullyDrawnReporterOwner {
    private static final java.lang.String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final androidx.activity.result.ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final androidx.activity.contextaware.ContextAwareHelper mContextAwareHelper;
    private androidx.lifecycle.ViewModelProvider.Factory mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final androidx.activity.FullyDrawnReporter mFullyDrawnReporter;
    private final androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;
    private final androidx.core.view.MenuHostHelper mMenuHostHelper;
    private final java.util.concurrent.atomic.AtomicInteger mNextLocalRequestCode;
    private androidx.activity.OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.res.Configuration>> mOnConfigurationChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> mOnMultiWindowModeChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.Intent>> mOnNewIntentListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> mOnPictureInPictureModeChangedListeners;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<java.lang.Integer>> mOnTrimMemoryListeners;
    final androidx.activity.ComponentActivity.ReportFullyDrawnExecutor mReportFullyDrawnExecutor;
    final androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController;
    private androidx.lifecycle.ViewModelStore mViewModelStore;







    static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void cancelPendingInputEvents(android.view.View r0) {
                r0.cancelPendingInputEvents()
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
    }

    static final class NonConfigurationInstances {
        java.lang.Object custom;
        androidx.lifecycle.ViewModelStore viewModelStore;

        NonConfigurationInstances() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private interface ReportFullyDrawnExecutor extends java.util.concurrent.Executor {
        void activityDestroyed();

        void viewCreated(android.view.View r1);
    }

    static class ReportFullyDrawnExecutorApi1 implements androidx.activity.ComponentActivity.ReportFullyDrawnExecutor {
        final android.os.Handler mHandler;

        ReportFullyDrawnExecutorApi1() {
                r1 = this;
                r1.<init>()
                android.os.Handler r0 = r1.createHandler()
                r1.mHandler = r0
                return
        }

        private android.os.Handler createHandler() {
                r2 = this;
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Handler r1 = new android.os.Handler
                if (r0 != 0) goto Lc
                android.os.Looper r0 = android.os.Looper.getMainLooper()
            Lc:
                r1.<init>(r0)
                return r1
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void activityDestroyed() {
                r0 = this;
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r2) {
                r1 = this;
                android.os.Handler r0 = r1.mHandler
                r0.postAtFrontOfQueue(r2)
                return
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void viewCreated(android.view.View r1) {
                r0 = this;
                return
        }
    }

    class ReportFullyDrawnExecutorApi16Impl implements androidx.activity.ComponentActivity.ReportFullyDrawnExecutor, android.view.ViewTreeObserver.OnDrawListener, java.lang.Runnable {
        final long mEndWatchTimeMillis;
        boolean mOnDrawScheduled;
        java.lang.Runnable mRunnable;
        final /* synthetic */ androidx.activity.ComponentActivity this$0;

        ReportFullyDrawnExecutorApi16Impl(androidx.activity.ComponentActivity r5) {
                r4 = this;
                r4.this$0 = r5
                r4.<init>()
                long r0 = android.os.SystemClock.uptimeMillis()
                r2 = 10000(0x2710, double:4.9407E-320)
                long r0 = r0 + r2
                r4.mEndWatchTimeMillis = r0
                r5 = 0
                r4.mOnDrawScheduled = r5
                return
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void activityDestroyed() {
                r1 = this;
                androidx.activity.ComponentActivity r0 = r1.this$0
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                r0.removeCallbacks(r1)
                androidx.activity.ComponentActivity r0 = r1.this$0
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnDrawListener(r1)
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r3) {
                r2 = this;
                r2.mRunnable = r3
                androidx.activity.ComponentActivity r3 = r2.this$0
                android.view.Window r3 = r3.getWindow()
                android.view.View r3 = r3.getDecorView()
                boolean r0 = r2.mOnDrawScheduled
                if (r0 == 0) goto L22
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                if (r0 != r1) goto L1e
                r3.invalidate()
                goto L2a
            L1e:
                r3.postInvalidate()
                goto L2a
            L22:
                androidx.activity.ComponentActivity$ReportFullyDrawnExecutorApi16Impl$$ExternalSyntheticLambda0 r0 = new androidx.activity.ComponentActivity$ReportFullyDrawnExecutorApi16Impl$$ExternalSyntheticLambda0
                r0.<init>(r2)
                r3.postOnAnimation(r0)
            L2a:
                return
        }

        /* JADX INFO: renamed from: lambda$execute$0$androidx-activity-ComponentActivity$ReportFullyDrawnExecutorApi16Impl, reason: not valid java name */
        /* synthetic */ void m7x96b76666() {
                r1 = this;
                java.lang.Runnable r0 = r1.mRunnable
                if (r0 == 0) goto La
                r0.run()
                r0 = 0
                r1.mRunnable = r0
            La:
                return
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
                r6 = this;
                java.lang.Runnable r0 = r6.mRunnable
                r1 = 0
                if (r0 == 0) goto L25
                r0.run()
                r0 = 0
                r6.mRunnable = r0
                androidx.activity.ComponentActivity r0 = r6.this$0
                androidx.activity.FullyDrawnReporter r0 = r0.mFullyDrawnReporter
                boolean r0 = r0.isFullyDrawnReported()
                if (r0 == 0) goto L3e
                r6.mOnDrawScheduled = r1
                androidx.activity.ComponentActivity r0 = r6.this$0
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                r0.post(r6)
                goto L3e
            L25:
                long r2 = android.os.SystemClock.uptimeMillis()
                long r4 = r6.mEndWatchTimeMillis
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L3e
                r6.mOnDrawScheduled = r1
                androidx.activity.ComponentActivity r0 = r6.this$0
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                r0.post(r6)
            L3e:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.activity.ComponentActivity r0 = r1.this$0
                android.view.Window r0 = r0.getWindow()
                android.view.View r0 = r0.getDecorView()
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnDrawListener(r1)
                return
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void viewCreated(android.view.View r2) {
                r1 = this;
                boolean r0 = r1.mOnDrawScheduled
                if (r0 != 0) goto Le
                r0 = 1
                r1.mOnDrawScheduled = r0
                android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
                r2.addOnDrawListener(r1)
            Le:
                return
        }
    }

    public ComponentActivity() {
            r4 = this;
            r4.<init>()
            androidx.activity.contextaware.ContextAwareHelper r0 = new androidx.activity.contextaware.ContextAwareHelper
            r0.<init>()
            r4.mContextAwareHelper = r0
            androidx.core.view.MenuHostHelper r0 = new androidx.core.view.MenuHostHelper
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda0 r1 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda0
            r1.<init>(r4)
            r0.<init>(r1)
            r4.mMenuHostHelper = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r4)
            r4.mLifecycleRegistry = r0
            androidx.savedstate.SavedStateRegistryController r0 = androidx.savedstate.SavedStateRegistryController.create(r4)
            r4.mSavedStateRegistryController = r0
            r1 = 0
            r4.mOnBackPressedDispatcher = r1
            androidx.activity.ComponentActivity$ReportFullyDrawnExecutor r1 = r4.createFullyDrawnExecutor()
            r4.mReportFullyDrawnExecutor = r1
            androidx.activity.FullyDrawnReporter r2 = new androidx.activity.FullyDrawnReporter
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda1 r3 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda1
            r3.<init>(r4)
            r2.<init>(r1, r3)
            r4.mFullyDrawnReporter = r2
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            r4.mNextLocalRequestCode = r1
            androidx.activity.ComponentActivity$1 r1 = new androidx.activity.ComponentActivity$1
            r1.<init>(r4)
            r4.mActivityResultRegistry = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r4.mOnConfigurationChangedListeners = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r4.mOnTrimMemoryListeners = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r4.mOnNewIntentListeners = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r4.mOnMultiWindowModeChangedListeners = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r4.mOnPictureInPictureModeChangedListeners = r1
            r1 = 0
            r4.mDispatchingOnMultiWindowModeChanged = r1
            r4.mDispatchingOnPictureInPictureModeChanged = r1
            androidx.lifecycle.Lifecycle r1 = r4.getLifecycle()
            if (r1 == 0) goto Lb5
            androidx.lifecycle.Lifecycle r1 = r4.getLifecycle()
            androidx.activity.ComponentActivity$2 r2 = new androidx.activity.ComponentActivity$2
            r2.<init>(r4)
            r1.addObserver(r2)
            androidx.lifecycle.Lifecycle r1 = r4.getLifecycle()
            androidx.activity.ComponentActivity$3 r2 = new androidx.activity.ComponentActivity$3
            r2.<init>(r4)
            r1.addObserver(r2)
            androidx.lifecycle.Lifecycle r1 = r4.getLifecycle()
            androidx.activity.ComponentActivity$4 r2 = new androidx.activity.ComponentActivity$4
            r2.<init>(r4)
            r1.addObserver(r2)
            r0.performAttach()
            androidx.lifecycle.SavedStateHandleSupport.enableSavedStateHandles(r4)
            androidx.savedstate.SavedStateRegistry r0 = r4.getSavedStateRegistry()
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda2 r1 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda2
            r1.<init>(r4)
            java.lang.String r2 = "android:support:activity-result"
            r0.registerSavedStateProvider(r2, r1)
            androidx.activity.ComponentActivity$$ExternalSyntheticLambda3 r0 = new androidx.activity.ComponentActivity$$ExternalSyntheticLambda3
            r0.<init>(r4)
            r4.addOnContextAvailableListener(r0)
            return
        Lb5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."
            r0.<init>(r1)
            throw r0
    }

    public ComponentActivity(int r1) {
            r0 = this;
            r0.<init>()
            r0.mContentLayoutId = r1
            return
    }

    static /* synthetic */ void access$001(androidx.activity.ComponentActivity r0) {
            super.onBackPressed()
            return
    }

    static /* synthetic */ androidx.activity.OnBackPressedDispatcher access$100(androidx.activity.ComponentActivity r0) {
            androidx.activity.OnBackPressedDispatcher r0 = r0.mOnBackPressedDispatcher
            return r0
    }

    private androidx.activity.ComponentActivity.ReportFullyDrawnExecutor createFullyDrawnExecutor() {
            r1 = this;
            androidx.activity.ComponentActivity$ReportFullyDrawnExecutorApi16Impl r0 = new androidx.activity.ComponentActivity$ReportFullyDrawnExecutorApi16Impl
            r0.<init>(r1)
            return r0
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$ReportFullyDrawnExecutor r0 = r2.mReportFullyDrawnExecutor
            android.view.Window r1 = r2.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0.viewCreated(r1)
            super.addContentView(r3, r4)
            return
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider r2) {
            r1 = this;
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            r0.addMenuProvider(r2)
            return
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider r2, androidx.lifecycle.LifecycleOwner r3) {
            r1 = this;
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            r0.addMenuProvider(r2, r3)
            return
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.State r4) {
            r1 = this;
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            r0.addMenuProvider(r2, r3, r4)
            return
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.res.Configuration>> r0 = r1.mOnConfigurationChangedListeners
            r0.add(r2)
            return
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener r2) {
            r1 = this;
            androidx.activity.contextaware.ContextAwareHelper r0 = r1.mContextAwareHelper
            r0.addOnContextAvailableListener(r2)
            return
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> r0 = r1.mOnMultiWindowModeChangedListeners
            r0.add(r2)
            return
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(androidx.core.util.Consumer<android.content.Intent> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.Intent>> r0 = r1.mOnNewIntentListeners
            r0.add(r2)
            return
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> r0 = r1.mOnPictureInPictureModeChangedListeners
            r0.add(r2)
            return
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<java.lang.Integer>> r0 = r1.mOnTrimMemoryListeners
            r0.add(r2)
            return
    }

    void ensureViewModelStore() {
            r1 = this;
            androidx.lifecycle.ViewModelStore r0 = r1.mViewModelStore
            if (r0 != 0) goto L1b
            java.lang.Object r0 = r1.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$NonConfigurationInstances r0 = (androidx.activity.ComponentActivity.NonConfigurationInstances) r0
            if (r0 == 0) goto L10
            androidx.lifecycle.ViewModelStore r0 = r0.viewModelStore
            r1.mViewModelStore = r0
        L10:
            androidx.lifecycle.ViewModelStore r0 = r1.mViewModelStore
            if (r0 != 0) goto L1b
            androidx.lifecycle.ViewModelStore r0 = new androidx.lifecycle.ViewModelStore
            r0.<init>()
            r1.mViewModelStore = r0
        L1b:
            return
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    public final androidx.activity.result.ActivityResultRegistry getActivityResultRegistry() {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.mActivityResultRegistry
            return r0
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
            r3 = this;
            androidx.lifecycle.viewmodel.MutableCreationExtras r0 = new androidx.lifecycle.viewmodel.MutableCreationExtras
            r0.<init>()
            android.app.Application r1 = r3.getApplication()
            if (r1 == 0) goto L14
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.app.Application> r1 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
            android.app.Application r2 = r3.getApplication()
            r0.set(r1, r2)
        L14:
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.savedstate.SavedStateRegistryOwner> r1 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            r0.set(r1, r3)
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.lifecycle.ViewModelStoreOwner> r1 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            r0.set(r1, r3)
            android.content.Intent r1 = r3.getIntent()
            if (r1 == 0) goto L3b
            android.content.Intent r1 = r3.getIntent()
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L3b
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.os.Bundle> r1 = androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY
            android.content.Intent r2 = r3.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            r0.set(r1, r2)
        L3b:
            return r0
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
            r3 = this;
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            if (r0 != 0) goto L1f
            androidx.lifecycle.SavedStateViewModelFactory r0 = new androidx.lifecycle.SavedStateViewModelFactory
            android.app.Application r1 = r3.getApplication()
            android.content.Intent r2 = r3.getIntent()
            if (r2 == 0) goto L19
            android.content.Intent r2 = r3.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            goto L1a
        L19:
            r2 = 0
        L1a:
            r0.<init>(r1, r3, r2)
            r3.mDefaultFactory = r0
        L1f:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r3.mDefaultFactory
            return r0
    }

    @Override // androidx.activity.FullyDrawnReporterOwner
    public androidx.activity.FullyDrawnReporter getFullyDrawnReporter() {
            r1 = this;
            androidx.activity.FullyDrawnReporter r0 = r1.mFullyDrawnReporter
            return r0
    }

    @java.lang.Deprecated
    public java.lang.Object getLastCustomNonConfigurationInstance() {
            r1 = this;
            java.lang.Object r0 = r1.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$NonConfigurationInstances r0 = (androidx.activity.ComponentActivity.NonConfigurationInstances) r0
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.custom
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            return r0
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
            r2 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r2.mOnBackPressedDispatcher
            if (r0 != 0) goto L1c
            androidx.activity.OnBackPressedDispatcher r0 = new androidx.activity.OnBackPressedDispatcher
            androidx.activity.ComponentActivity$5 r1 = new androidx.activity.ComponentActivity$5
            r1.<init>(r2)
            r0.<init>(r1)
            r2.mOnBackPressedDispatcher = r0
            androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
            androidx.activity.ComponentActivity$6 r1 = new androidx.activity.ComponentActivity$6
            r1.<init>(r2)
            r0.addObserver(r1)
        L1c:
            androidx.activity.OnBackPressedDispatcher r0 = r2.mOnBackPressedDispatcher
            return r0
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            return r0
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r2 = this;
            android.app.Application r0 = r2.getApplication()
            if (r0 == 0) goto Lc
            r2.ensureViewModelStore()
            androidx.lifecycle.ViewModelStore r0 = r2.mViewModelStore
            return r0
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call."
            r0.<init>(r1)
            throw r0
    }

    public void initializeViewTreeOwners() {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r1)
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r0, r1)
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r0, r1)
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.activity.ViewTreeOnBackPressedDispatcherOwner.set(r0, r1)
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.activity.ViewTreeFullyDrawnReporterOwner.set(r0, r1)
            return
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
            r0 = this;
            r0.invalidateOptionsMenu()
            return
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-activity-ComponentActivity, reason: not valid java name */
    /* synthetic */ kotlin.Unit m4lambda$new$0$androidxactivityComponentActivity() {
            r1 = this;
            r1.reportFullyDrawn()
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-activity-ComponentActivity, reason: not valid java name */
    /* synthetic */ android.os.Bundle m5lambda$new$1$androidxactivityComponentActivity() {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.activity.result.ActivityResultRegistry r1 = r2.mActivityResultRegistry
            r1.onSaveInstanceState(r0)
            return r0
    }

    /* JADX INFO: renamed from: lambda$new$2$androidx-activity-ComponentActivity, reason: not valid java name */
    /* synthetic */ void m6lambda$new$2$androidxactivityComponentActivity(android.content.Context r2) {
            r1 = this;
            androidx.savedstate.SavedStateRegistry r2 = r1.getSavedStateRegistry()
            java.lang.String r0 = "android:support:activity-result"
            android.os.Bundle r2 = r2.consumeRestoredStateForKey(r0)
            if (r2 == 0) goto L11
            androidx.activity.result.ActivityResultRegistry r0 = r1.mActivityResultRegistry
            r0.onRestoreInstanceState(r2)
        L11:
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.mActivityResultRegistry
            boolean r0 = r0.dispatchResult(r2, r3, r4)
            if (r0 != 0) goto Lb
            super.onActivityResult(r2, r3, r4)
        Lb:
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void onBackPressed() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.getOnBackPressedDispatcher()
            r0.onBackPressed()
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            super.onConfigurationChanged(r3)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.res.Configuration>> r0 = r2.mOnConfigurationChangedListeners
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            r1.accept(r3)
            goto L9
        L19:
            return
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r2) {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            r0.performRestore(r2)
            androidx.activity.contextaware.ContextAwareHelper r0 = r1.mContextAwareHelper
            r0.dispatchOnContextAvailable(r1)
            super.onCreate(r2)
            androidx.lifecycle.ReportFragment.injectIfNeededIn(r1)
            int r2 = r1.mContentLayoutId
            if (r2 == 0) goto L17
            r1.setContentView(r2)
        L17:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            if (r2 != 0) goto Le
            super.onCreatePanelMenu(r2, r3)
            androidx.core.view.MenuHostHelper r2 = r1.mMenuHostHelper
            android.view.MenuInflater r0 = r1.getMenuInflater()
            r2.onCreateMenu(r3, r0)
        Le:
            r2 = 1
            return r2
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.onMenuItemSelected(r2, r3)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            if (r2 != 0) goto L11
            androidx.core.view.MenuHostHelper r2 = r1.mMenuHostHelper
            boolean r2 = r2.onMenuItemSelected(r3)
            return r2
        L11:
            r2 = 0
            return r2
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r4) {
            r3 = this;
            boolean r0 = r3.mDispatchingOnMultiWindowModeChanged
            if (r0 == 0) goto L5
            return
        L5:
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> r0 = r3.mOnMultiWindowModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            androidx.core.app.MultiWindowModeChangedInfo r2 = new androidx.core.app.MultiWindowModeChangedInfo
            r2.<init>(r4)
            r1.accept(r2)
            goto Lb
        L20:
            return
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean r4, android.content.res.Configuration r5) {
            r3 = this;
            r0 = 1
            r3.mDispatchingOnMultiWindowModeChanged = r0
            r0 = 0
            super.onMultiWindowModeChanged(r4, r5)     // Catch: java.lang.Throwable -> L25
            r3.mDispatchingOnMultiWindowModeChanged = r0
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> r0 = r3.mOnMultiWindowModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            androidx.core.app.MultiWindowModeChangedInfo r2 = new androidx.core.app.MultiWindowModeChangedInfo
            r2.<init>(r4, r5)
            r1.accept(r2)
            goto Lf
        L24:
            return
        L25:
            r4 = move-exception
            r3.mDispatchingOnMultiWindowModeChanged = r0
            throw r4
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent r3) {
            r2 = this;
            super.onNewIntent(r3)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.Intent>> r0 = r2.mOnNewIntentListeners
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            r1.accept(r3)
            goto L9
        L19:
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            r0.onMenuClosed(r3)
            super.onPanelClosed(r2, r3)
            return
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r4) {
            r3 = this;
            boolean r0 = r3.mDispatchingOnPictureInPictureModeChanged
            if (r0 == 0) goto L5
            return
        L5:
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> r0 = r3.mOnPictureInPictureModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            androidx.core.app.PictureInPictureModeChangedInfo r2 = new androidx.core.app.PictureInPictureModeChangedInfo
            r2.<init>(r4)
            r1.accept(r2)
            goto Lb
        L20:
            return
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean r4, android.content.res.Configuration r5) {
            r3 = this;
            r0 = 1
            r3.mDispatchingOnPictureInPictureModeChanged = r0
            r0 = 0
            super.onPictureInPictureModeChanged(r4, r5)     // Catch: java.lang.Throwable -> L25
            r3.mDispatchingOnPictureInPictureModeChanged = r0
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> r0 = r3.mOnPictureInPictureModeChangedListeners
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            androidx.core.app.PictureInPictureModeChangedInfo r2 = new androidx.core.app.PictureInPictureModeChangedInfo
            r2.<init>(r4, r5)
            r1.accept(r2)
            goto Lf
        L24:
            return
        L25:
            r4 = move-exception
            r3.mDispatchingOnPictureInPictureModeChanged = r0
            throw r4
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int r1, android.view.View r2, android.view.Menu r3) {
            r0 = this;
            if (r1 != 0) goto La
            super.onPreparePanel(r1, r2, r3)
            androidx.core.view.MenuHostHelper r1 = r0.mMenuHostHelper
            r1.onPrepareMenu(r3)
        La:
            r1 = 1
            return r1
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int r4, java.lang.String[] r5, int[] r6) {
            r3 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r3.mActivityResultRegistry
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "androidx.activity.result.contract.extra.PERMISSIONS"
            android.content.Intent r1 = r1.putExtra(r2, r5)
            java.lang.String r2 = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"
            android.content.Intent r1 = r1.putExtra(r2, r6)
            r2 = -1
            boolean r0 = r0.dispatchResult(r4, r2, r1)
            if (r0 != 0) goto L1d
            super.onRequestPermissionsResult(r4, r5, r6)
        L1d:
            return
    }

    @java.lang.Deprecated
    public java.lang.Object onRetainCustomNonConfigurationInstance() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
            r3 = this;
            java.lang.Object r0 = r3.onRetainCustomNonConfigurationInstance()
            androidx.lifecycle.ViewModelStore r1 = r3.mViewModelStore
            if (r1 != 0) goto L12
            java.lang.Object r2 = r3.getLastNonConfigurationInstance()
            androidx.activity.ComponentActivity$NonConfigurationInstances r2 = (androidx.activity.ComponentActivity.NonConfigurationInstances) r2
            if (r2 == 0) goto L12
            androidx.lifecycle.ViewModelStore r1 = r2.viewModelStore
        L12:
            if (r1 != 0) goto L18
            if (r0 != 0) goto L18
            r0 = 0
            return r0
        L18:
            androidx.activity.ComponentActivity$NonConfigurationInstances r2 = new androidx.activity.ComponentActivity$NonConfigurationInstances
            r2.<init>()
            r2.custom = r0
            r2.viewModelStore = r1
            return r2
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
            boolean r1 = r0 instanceof androidx.lifecycle.LifecycleRegistry
            if (r1 == 0) goto Lf
            androidx.lifecycle.LifecycleRegistry r0 = (androidx.lifecycle.LifecycleRegistry) r0
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            r0.setCurrentState(r1)
        Lf:
            super.onSaveInstanceState(r3)
            androidx.savedstate.SavedStateRegistryController r0 = r2.mSavedStateRegistryController
            r0.performSave(r3)
            return
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int r4) {
            r3 = this;
            super.onTrimMemory(r4)
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<java.lang.Integer>> r0 = r3.mOnTrimMemoryListeners
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            androidx.core.util.Consumer r1 = (androidx.core.util.Consumer) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.accept(r2)
            goto L9
        L1d:
            return
    }

    @Override // androidx.activity.contextaware.ContextAware
    public android.content.Context peekAvailableContext() {
            r1 = this;
            androidx.activity.contextaware.ContextAwareHelper r0 = r1.mContextAwareHelper
            android.content.Context r0 = r0.peekAvailableContext()
            return r0
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> r2, androidx.activity.result.ActivityResultCallback<O> r3) {
            r1 = this;
            androidx.activity.result.ActivityResultRegistry r0 = r1.mActivityResultRegistry
            androidx.activity.result.ActivityResultLauncher r2 = r1.registerForActivityResult(r2, r0, r3)
            return r2
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> r3, androidx.activity.result.ActivityResultRegistry r4, androidx.activity.result.ActivityResultCallback<O> r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "activity_rq#"
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r2.mNextLocalRequestCode
            int r1 = r1.getAndIncrement()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.activity.result.ActivityResultLauncher r3 = r4.register(r0, r2, r3, r5)
            return r3
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(androidx.core.view.MenuProvider r2) {
            r1 = this;
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            r0.removeMenuProvider(r2)
            return
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.res.Configuration>> r0 = r1.mOnConfigurationChangedListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener r2) {
            r1 = this;
            androidx.activity.contextaware.ContextAwareHelper r0 = r1.mContextAwareHelper
            r0.removeOnContextAvailableListener(r2)
            return
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo>> r0 = r1.mOnMultiWindowModeChangedListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(androidx.core.util.Consumer<android.content.Intent> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<android.content.Intent>> r0 = r1.mOnNewIntentListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo>> r0 = r1.mOnPictureInPictureModeChangedListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.core.util.Consumer<java.lang.Integer>> r0 = r1.mOnTrimMemoryListeners
            r0.remove(r2)
            return
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
            r1 = this;
            boolean r0 = androidx.tracing.Trace.isEnabled()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Lb
            java.lang.String r0 = "reportFullyDrawn() for ComponentActivity"
            androidx.tracing.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L17
        Lb:
            super.reportFullyDrawn()     // Catch: java.lang.Throwable -> L17
            androidx.activity.FullyDrawnReporter r0 = r1.mFullyDrawnReporter     // Catch: java.lang.Throwable -> L17
            r0.fullyDrawnReported()     // Catch: java.lang.Throwable -> L17
            androidx.tracing.Trace.endSection()
            return
        L17:
            r0 = move-exception
            androidx.tracing.Trace.endSection()
            throw r0
    }

    @Override // android.app.Activity
    public void setContentView(int r3) {
            r2 = this;
            r2.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$ReportFullyDrawnExecutor r0 = r2.mReportFullyDrawnExecutor
            android.view.Window r1 = r2.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0.viewCreated(r1)
            super.setContentView(r3)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r3) {
            r2 = this;
            r2.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$ReportFullyDrawnExecutor r0 = r2.mReportFullyDrawnExecutor
            android.view.Window r1 = r2.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0.viewCreated(r1)
            super.setContentView(r3)
            return
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.initializeViewTreeOwners()
            androidx.activity.ComponentActivity$ReportFullyDrawnExecutor r0 = r2.mReportFullyDrawnExecutor
            android.view.Window r1 = r2.getWindow()
            android.view.View r1 = r1.getDecorView()
            r0.viewCreated(r1)
            super.setContentView(r3, r4)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent r1, int r2) {
            r0 = this;
            super.startActivityForResult(r1, r2)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent r1, int r2, android.os.Bundle r3) {
            r0 = this;
            super.startActivityForResult(r1, r2, r3)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.app.Activity
    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender r1, int r2, android.content.Intent r3, int r4, int r5, int r6, android.os.Bundle r7) throws android.content.IntentSender.SendIntentException {
            r0 = this;
            super.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7)
            return
    }
}
