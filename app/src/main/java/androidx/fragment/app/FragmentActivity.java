package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends androidx.activity.ComponentActivity implements androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator {
    static final java.lang.String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.LifecycleRegistry mFragmentLifecycleRegistry;
    final androidx.fragment.app.FragmentController mFragments;
    boolean mResumed;
    boolean mStopped;

    class HostCallbacks extends androidx.fragment.app.FragmentHostCallback<androidx.fragment.app.FragmentActivity> implements androidx.core.content.OnConfigurationChangedProvider, androidx.core.content.OnTrimMemoryProvider, androidx.core.app.OnMultiWindowModeChangedProvider, androidx.core.app.OnPictureInPictureModeChangedProvider, androidx.lifecycle.ViewModelStoreOwner, androidx.activity.OnBackPressedDispatcherOwner, androidx.activity.result.ActivityResultRegistryOwner, androidx.savedstate.SavedStateRegistryOwner, androidx.fragment.app.FragmentOnAttachListener, androidx.core.view.MenuHost {
        final /* synthetic */ androidx.fragment.app.FragmentActivity this$0;

        public HostCallbacks(androidx.fragment.app.FragmentActivity r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // androidx.core.view.MenuHost
        public void addMenuProvider(androidx.core.view.MenuProvider r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                r0.addMenuProvider(r2)
                return
        }

        @Override // androidx.core.view.MenuHost
        public void addMenuProvider(androidx.core.view.MenuProvider r2, androidx.lifecycle.LifecycleOwner r3) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                r0.addMenuProvider(r2, r3)
                return
        }

        @Override // androidx.core.view.MenuHost
        public void addMenuProvider(androidx.core.view.MenuProvider r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.State r4) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                r0.addMenuProvider(r2, r3, r4)
                return
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public void addOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                r0.addOnConfigurationChangedListener(r2)
                return
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public void addOnMultiWindowModeChangedListener(androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                r0.addOnMultiWindowModeChangedListener(r2)
                return
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public void addOnPictureInPictureModeChangedListener(androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                r0.addOnPictureInPictureModeChangedListener(r2)
                return
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public void addOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                r0.addOnTrimMemoryListener(r2)
                return
        }

        @Override // androidx.activity.result.ActivityResultRegistryOwner
        public androidx.activity.result.ActivityResultRegistry getActivityResultRegistry() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                androidx.activity.result.ActivityResultRegistry r0 = r0.getActivityResultRegistry()
                return r0
        }

        @Override // androidx.lifecycle.LifecycleOwner
        public androidx.lifecycle.Lifecycle getLifecycle() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                androidx.lifecycle.LifecycleRegistry r0 = r0.mFragmentLifecycleRegistry
                return r0
        }

        @Override // androidx.activity.OnBackPressedDispatcherOwner
        public androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                androidx.activity.OnBackPressedDispatcher r0 = r0.getOnBackPressedDispatcher()
                return r0
        }

        @Override // androidx.savedstate.SavedStateRegistryOwner
        public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
                return r0
        }

        @Override // androidx.lifecycle.ViewModelStoreOwner
        public androidx.lifecycle.ViewModelStore getViewModelStore() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
                return r0
        }

        @Override // androidx.core.view.MenuHost
        public void invalidateMenu() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                r0.invalidateOptionsMenu()
                return
        }

        @Override // androidx.fragment.app.FragmentOnAttachListener
        public void onAttachFragment(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                androidx.fragment.app.FragmentActivity r1 = r0.this$0
                r1.onAttachFragment(r2)
                return
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onDump(java.lang.String r2, java.io.FileDescriptor r3, java.io.PrintWriter r4, java.lang.String[] r5) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                r0.dump(r2, r3, r4, r5)
                return
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public android.view.View onFindViewById(int r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                android.view.View r2 = r0.findViewById(r2)
                return r2
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.fragment.app.FragmentHostCallback
        public androidx.fragment.app.FragmentActivity onGetHost() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                return r0
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public /* bridge */ /* synthetic */ androidx.fragment.app.FragmentActivity onGetHost() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.onGetHost()
                return r0
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public android.view.LayoutInflater onGetLayoutInflater() {
                r2 = this;
                androidx.fragment.app.FragmentActivity r0 = r2.this$0
                android.view.LayoutInflater r0 = r0.getLayoutInflater()
                androidx.fragment.app.FragmentActivity r1 = r2.this$0
                android.view.LayoutInflater r0 = r0.cloneInContext(r1)
                return r0
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public int onGetWindowAnimations() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                android.view.Window r0 = r0.getWindow()
                if (r0 != 0) goto La
                r0 = 0
                goto L10
            La:
                android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
                int r0 = r0.windowAnimations
            L10:
                return r0
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public boolean onHasView() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                android.view.Window r0 = r0.getWindow()
                if (r0 == 0) goto L10
                android.view.View r0 = r0.peekDecorView()
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onHasWindowAnimations() {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                android.view.Window r0 = r0.getWindow()
                if (r0 == 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onShouldSaveFragmentState(androidx.fragment.app.Fragment r1) {
                r0 = this;
                androidx.fragment.app.FragmentActivity r1 = r0.this$0
                boolean r1 = r1.isFinishing()
                r1 = r1 ^ 1
                return r1
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onShouldShowRequestPermissionRationale(java.lang.String r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                boolean r2 = androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(r0, r2)
                return r2
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onSupportInvalidateOptionsMenu() {
                r0 = this;
                r0.invalidateMenu()
                return
        }

        @Override // androidx.core.view.MenuHost
        public void removeMenuProvider(androidx.core.view.MenuProvider r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                r0.removeMenuProvider(r2)
                return
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public void removeOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                r0.removeOnConfigurationChangedListener(r2)
                return
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public void removeOnMultiWindowModeChangedListener(androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                r0.removeOnMultiWindowModeChangedListener(r2)
                return
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public void removeOnPictureInPictureModeChangedListener(androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                r0.removeOnPictureInPictureModeChangedListener(r2)
                return
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public void removeOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> r2) {
                r1 = this;
                androidx.fragment.app.FragmentActivity r0 = r1.this$0
                r0.removeOnTrimMemoryListener(r2)
                return
        }
    }

    public FragmentActivity() {
            r1 = this;
            r1.<init>()
            androidx.fragment.app.FragmentActivity$HostCallbacks r0 = new androidx.fragment.app.FragmentActivity$HostCallbacks
            r0.<init>(r1)
            androidx.fragment.app.FragmentController r0 = androidx.fragment.app.FragmentController.createController(r0)
            r1.mFragments = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.mFragmentLifecycleRegistry = r0
            r0 = 1
            r1.mStopped = r0
            r1.init()
            return
    }

    public FragmentActivity(int r1) {
            r0 = this;
            r0.<init>(r1)
            androidx.fragment.app.FragmentActivity$HostCallbacks r1 = new androidx.fragment.app.FragmentActivity$HostCallbacks
            r1.<init>(r0)
            androidx.fragment.app.FragmentController r1 = androidx.fragment.app.FragmentController.createController(r1)
            r0.mFragments = r1
            androidx.lifecycle.LifecycleRegistry r1 = new androidx.lifecycle.LifecycleRegistry
            r1.<init>(r0)
            r0.mFragmentLifecycleRegistry = r1
            r1 = 1
            r0.mStopped = r1
            r0.init()
            return
    }

    private void init() {
            r3 = this;
            androidx.savedstate.SavedStateRegistry r0 = r3.getSavedStateRegistry()
            androidx.fragment.app.FragmentActivity$$ExternalSyntheticLambda0 r1 = new androidx.fragment.app.FragmentActivity$$ExternalSyntheticLambda0
            r1.<init>(r3)
            java.lang.String r2 = "android:support:lifecycle"
            r0.registerSavedStateProvider(r2, r1)
            androidx.fragment.app.FragmentActivity$$ExternalSyntheticLambda1 r0 = new androidx.fragment.app.FragmentActivity$$ExternalSyntheticLambda1
            r0.<init>(r3)
            r3.addOnConfigurationChangedListener(r0)
            androidx.fragment.app.FragmentActivity$$ExternalSyntheticLambda2 r0 = new androidx.fragment.app.FragmentActivity$$ExternalSyntheticLambda2
            r0.<init>(r3)
            r3.addOnNewIntentListener(r0)
            androidx.fragment.app.FragmentActivity$$ExternalSyntheticLambda3 r0 = new androidx.fragment.app.FragmentActivity$$ExternalSyntheticLambda3
            r0.<init>(r3)
            r3.addOnContextAvailableListener(r0)
            return
    }

    private static boolean markState(androidx.fragment.app.FragmentManager r5, androidx.lifecycle.Lifecycle.State r6) {
            java.util.List r5 = r5.getFragments()
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r5.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 != 0) goto L18
            goto L9
        L18:
            java.lang.Object r2 = r1.getHost()
            if (r2 == 0) goto L27
            androidx.fragment.app.FragmentManager r2 = r1.getChildFragmentManager()
            boolean r2 = markState(r2, r6)
            r0 = r0 | r2
        L27:
            androidx.fragment.app.FragmentViewLifecycleOwner r2 = r1.mViewLifecycleOwner
            r3 = 1
            if (r2 == 0) goto L44
            androidx.fragment.app.FragmentViewLifecycleOwner r2 = r1.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r2 = r2.isAtLeast(r4)
            if (r2 == 0) goto L44
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r1.mViewLifecycleOwner
            r0.setCurrentState(r6)
            r0 = r3
        L44:
            androidx.lifecycle.LifecycleRegistry r2 = r1.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r2 = r2.isAtLeast(r4)
            if (r2 == 0) goto L9
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            r0.setCurrentState(r6)
            r0 = r3
            goto L9
        L59:
            return r0
    }

    final android.view.View dispatchFragmentsOnCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            androidx.fragment.app.FragmentController r0 = r1.mFragments
            android.view.View r2 = r0.onCreateView(r2, r3, r4, r5)
            return r2
    }

    @Override // android.app.Activity
    public void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
            r2 = this;
            super.dump(r3, r4, r5, r6)
            boolean r0 = r2.shouldDumpInternalState(r6)
            if (r0 != 0) goto La
            return
        La:
            r5.print(r3)
            java.lang.String r0 = "Local FragmentActivity "
            r5.print(r0)
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " State:"
            r5.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "  "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.print(r0)
            java.lang.String r1 = "mCreated="
            r5.print(r1)
            boolean r1 = r2.mCreated
            r5.print(r1)
            java.lang.String r1 = " mResumed="
            r5.print(r1)
            boolean r1 = r2.mResumed
            r5.print(r1)
            java.lang.String r1 = " mStopped="
            r5.print(r1)
            boolean r1 = r2.mStopped
            r5.print(r1)
            android.app.Application r1 = r2.getApplication()
            if (r1 == 0) goto L63
            androidx.loader.app.LoaderManager r1 = androidx.loader.app.LoaderManager.getInstance(r2)
            r1.dump(r0, r4, r5, r6)
        L63:
            androidx.fragment.app.FragmentController r0 = r2.mFragments
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            r0.dump(r3, r4, r5, r6)
            return
    }

    public androidx.fragment.app.FragmentManager getSupportFragmentManager() {
            r1 = this;
            androidx.fragment.app.FragmentController r0 = r1.mFragments
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            return r0
    }

    @java.lang.Deprecated
    public androidx.loader.app.LoaderManager getSupportLoaderManager() {
            r1 = this;
            androidx.loader.app.LoaderManager r0 = androidx.loader.app.LoaderManager.getInstance(r1)
            return r0
    }

    /* JADX INFO: renamed from: lambda$init$0$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    /* synthetic */ android.os.Bundle m52lambda$init$0$androidxfragmentappFragmentActivity() {
            r2 = this;
            r2.markFragmentsCreated()
            androidx.lifecycle.LifecycleRegistry r0 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r0.handleLifecycleEvent(r1)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    /* JADX INFO: renamed from: lambda$init$1$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    /* synthetic */ void m53lambda$init$1$androidxfragmentappFragmentActivity(android.content.res.Configuration r1) {
            r0 = this;
            androidx.fragment.app.FragmentController r1 = r0.mFragments
            r1.noteStateNotSaved()
            return
    }

    /* JADX INFO: renamed from: lambda$init$2$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    /* synthetic */ void m54lambda$init$2$androidxfragmentappFragmentActivity(android.content.Intent r1) {
            r0 = this;
            androidx.fragment.app.FragmentController r1 = r0.mFragments
            r1.noteStateNotSaved()
            return
    }

    /* JADX INFO: renamed from: lambda$init$3$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    /* synthetic */ void m55lambda$init$3$androidxfragmentappFragmentActivity(android.content.Context r2) {
            r1 = this;
            androidx.fragment.app.FragmentController r2 = r1.mFragments
            r0 = 0
            r2.attachHost(r0)
            return
    }

    void markFragmentsCreated() {
            r2 = this;
        L0:
            androidx.fragment.app.FragmentManager r0 = r2.getSupportFragmentManager()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r0 = markState(r0, r1)
            if (r0 != 0) goto L0
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            androidx.fragment.app.FragmentController r0 = r1.mFragments
            r0.noteStateNotSaved()
            super.onActivityResult(r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    public void onAttachFragment(androidx.fragment.app.Fragment r1) {
            r0 = this;
            return
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            androidx.lifecycle.LifecycleRegistry r2 = r1.mFragmentLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r2.handleLifecycleEvent(r0)
            androidx.fragment.app.FragmentController r2 = r1.mFragments
            r2.dispatchCreate()
            return
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            android.view.View r0 = r1.dispatchFragmentsOnCreateView(r2, r3, r4, r5)
            if (r0 != 0) goto Lb
            android.view.View r2 = super.onCreateView(r2, r3, r4, r5)
            return r2
        Lb:
            return r0
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r0 = r1.dispatchFragmentsOnCreateView(r0, r2, r3, r4)
            if (r0 != 0) goto Lc
            android.view.View r2 = super.onCreateView(r2, r3, r4)
            return r2
        Lc:
            return r0
    }

    @Override // android.app.Activity
    protected void onDestroy() {
            r2 = this;
            super.onDestroy()
            androidx.fragment.app.FragmentController r0 = r2.mFragments
            r0.dispatchDestroy()
            androidx.lifecycle.LifecycleRegistry r0 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r0.handleLifecycleEvent(r1)
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            boolean r0 = super.onMenuItemSelected(r2, r3)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            r0 = 6
            if (r2 != r0) goto L12
            androidx.fragment.app.FragmentController r2 = r1.mFragments
            boolean r2 = r2.dispatchContextItemSelected(r3)
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // android.app.Activity
    protected void onPause() {
            r2 = this;
            super.onPause()
            r0 = 0
            r2.mResumed = r0
            androidx.fragment.app.FragmentController r0 = r2.mFragments
            r0.dispatchPause()
            androidx.lifecycle.LifecycleRegistry r0 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r0.handleLifecycleEvent(r1)
            return
    }

    @Override // android.app.Activity
    protected void onPostResume() {
            r0 = this;
            super.onPostResume()
            r0.onResumeFragments()
            return
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            androidx.fragment.app.FragmentController r0 = r1.mFragments
            r0.noteStateNotSaved()
            super.onRequestPermissionsResult(r2, r3, r4)
            return
    }

    @Override // android.app.Activity
    protected void onResume() {
            r1 = this;
            androidx.fragment.app.FragmentController r0 = r1.mFragments
            r0.noteStateNotSaved()
            super.onResume()
            r0 = 1
            r1.mResumed = r0
            androidx.fragment.app.FragmentController r0 = r1.mFragments
            r0.execPendingActions()
            return
    }

    protected void onResumeFragments() {
            r2 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.handleLifecycleEvent(r1)
            androidx.fragment.app.FragmentController r0 = r2.mFragments
            r0.dispatchResume()
            return
    }

    @Override // android.app.Activity
    protected void onStart() {
            r2 = this;
            androidx.fragment.app.FragmentController r0 = r2.mFragments
            r0.noteStateNotSaved()
            super.onStart()
            r0 = 0
            r2.mStopped = r0
            boolean r0 = r2.mCreated
            if (r0 != 0) goto L17
            r0 = 1
            r2.mCreated = r0
            androidx.fragment.app.FragmentController r0 = r2.mFragments
            r0.dispatchActivityCreated()
        L17:
            androidx.fragment.app.FragmentController r0 = r2.mFragments
            r0.execPendingActions()
            androidx.lifecycle.LifecycleRegistry r0 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
            r0.handleLifecycleEvent(r1)
            androidx.fragment.app.FragmentController r0 = r2.mFragments
            r0.dispatchStart()
            return
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
            r1 = this;
            androidx.fragment.app.FragmentController r0 = r1.mFragments
            r0.noteStateNotSaved()
            return
    }

    @Override // android.app.Activity
    protected void onStop() {
            r2 = this;
            super.onStop()
            r0 = 1
            r2.mStopped = r0
            r2.markFragmentsCreated()
            androidx.fragment.app.FragmentController r0 = r2.mFragments
            r0.dispatchStop()
            androidx.lifecycle.LifecycleRegistry r0 = r2.mFragmentLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r0.handleLifecycleEvent(r1)
            return
    }

    public void setEnterSharedElementCallback(androidx.core.app.SharedElementCallback r1) {
            r0 = this;
            androidx.core.app.ActivityCompat.setEnterSharedElementCallback(r0, r1)
            return
    }

    public void setExitSharedElementCallback(androidx.core.app.SharedElementCallback r1) {
            r0 = this;
            androidx.core.app.ActivityCompat.setExitSharedElementCallback(r0, r1)
            return
    }

    public void startActivityFromFragment(androidx.fragment.app.Fragment r2, android.content.Intent r3, int r4) {
            r1 = this;
            r0 = 0
            r1.startActivityFromFragment(r2, r3, r4, r0)
            return
    }

    public void startActivityFromFragment(androidx.fragment.app.Fragment r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
            r1 = this;
            r0 = -1
            if (r4 != r0) goto L7
            androidx.core.app.ActivityCompat.startActivityForResult(r1, r3, r0, r5)
            return
        L7:
            r2.startActivityForResult(r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public void startIntentSenderFromFragment(androidx.fragment.app.Fragment r10, android.content.IntentSender r11, int r12, android.content.Intent r13, int r14, int r15, int r16, android.os.Bundle r17) throws android.content.IntentSender.SendIntentException {
            r9 = this;
            r0 = -1
            r3 = r12
            if (r3 != r0) goto L12
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            androidx.core.app.ActivityCompat.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L12:
            r10.startIntentSenderForResult(r11, r12, r13, r14, r15, r16, r17)
            return
    }

    public void supportFinishAfterTransition() {
            r0 = this;
            androidx.core.app.ActivityCompat.finishAfterTransition(r0)
            return
    }

    @java.lang.Deprecated
    public void supportInvalidateOptionsMenu() {
            r0 = this;
            r0.invalidateOptionsMenu()
            return
    }

    public void supportPostponeEnterTransition() {
            r0 = this;
            androidx.core.app.ActivityCompat.postponeEnterTransition(r0)
            return
    }

    public void supportStartPostponedEnterTransition() {
            r0 = this;
            androidx.core.app.ActivityCompat.startPostponedEnterTransition(r0)
            return
    }

    @Override // androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
    @java.lang.Deprecated
    public final void validateRequestPermissionsRequestCode(int r1) {
            r0 = this;
            return
    }
}
