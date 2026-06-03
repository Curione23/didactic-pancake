package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager implements androidx.fragment.app.FragmentResultOwner {
    private static boolean DEBUG = false;
    private static final java.lang.String EXTRA_CREATED_FILLIN_INTENT = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    static final java.lang.String FRAGMENT_MANAGER_STATE_TAG = "state";
    static final java.lang.String FRAGMENT_NAME_PREFIX = "fragment_";
    static final java.lang.String FRAGMENT_STATE_TAG = "state";
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    static final java.lang.String RESULT_NAME_PREFIX = "result_";
    static final java.lang.String SAVED_STATE_TAG = "android:support:fragments";
    public static final java.lang.String TAG = "FragmentManager";
    java.util.ArrayList<androidx.fragment.app.BackStackRecord> mBackStack;
    private java.util.ArrayList<androidx.fragment.app.FragmentManager.OnBackStackChangedListener> mBackStackChangeListeners;
    private final java.util.concurrent.atomic.AtomicInteger mBackStackIndex;
    private final java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> mBackStackStates;
    private androidx.fragment.app.FragmentContainer mContainer;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mCreatedMenus;
    int mCurState;
    private androidx.fragment.app.SpecialEffectsControllerFactory mDefaultSpecialEffectsControllerFactory;
    private boolean mDestroyed;
    private java.lang.Runnable mExecCommit;
    private boolean mExecutingActions;
    private androidx.fragment.app.FragmentFactory mFragmentFactory;
    private final androidx.fragment.app.FragmentStore mFragmentStore;
    private boolean mHavePendingDeferredStart;
    private androidx.fragment.app.FragmentHostCallback<?> mHost;
    private androidx.fragment.app.FragmentFactory mHostFragmentFactory;
    java.util.ArrayDeque<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> mLaunchedFragments;
    private final androidx.fragment.app.FragmentLayoutInflaterFactory mLayoutInflaterFactory;
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher mLifecycleCallbacksDispatcher;
    private final androidx.core.view.MenuProvider mMenuProvider;
    private boolean mNeedMenuInvalidate;
    private androidx.fragment.app.FragmentManagerViewModel mNonConfig;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> mOnAttachListeners;
    private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback;
    private androidx.activity.OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final androidx.core.util.Consumer<android.content.res.Configuration> mOnConfigurationChangedListener;
    private final androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> mOnMultiWindowModeChangedListener;
    private final androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> mOnPictureInPictureModeChangedListener;
    private final androidx.core.util.Consumer<java.lang.Integer> mOnTrimMemoryListener;
    private androidx.fragment.app.Fragment mParent;
    private final java.util.ArrayList<androidx.fragment.app.FragmentManager.OpGenerator> mPendingActions;
    androidx.fragment.app.Fragment mPrimaryNav;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String[]> mRequestPermissions;
    private final java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager.LifecycleAwareResultListener> mResultListeners;
    private final java.util.Map<java.lang.String, android.os.Bundle> mResults;
    private androidx.fragment.app.SpecialEffectsControllerFactory mSpecialEffectsControllerFactory;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> mStartActivityForResult;
    private androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> mStartIntentSenderForResult;
    private boolean mStateSaved;
    private boolean mStopped;
    private androidx.fragment.app.strictmode.FragmentStrictMode.Policy mStrictModePolicy;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mTmpAddedFragments;
    private java.util.ArrayList<java.lang.Boolean> mTmpIsPop;
    private java.util.ArrayList<androidx.fragment.app.BackStackRecord> mTmpRecords;











    public interface BackStackEntry {
        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbShortTitle();

        @java.lang.Deprecated
        int getBreadCrumbShortTitleRes();

        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbTitle();

        @java.lang.Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        java.lang.String getName();
    }

    private class ClearBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        private final java.lang.String mName;
        final /* synthetic */ androidx.fragment.app.FragmentManager this$0;

        ClearBackStackState(androidx.fragment.app.FragmentManager r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mName = r2
                return
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3, java.util.ArrayList<java.lang.Boolean> r4) {
                r2 = this;
                androidx.fragment.app.FragmentManager r0 = r2.this$0
                java.lang.String r1 = r2.mName
                boolean r3 = r0.clearBackStackState(r3, r4, r1)
                return r3
        }
    }

    static class FragmentIntentSenderContract extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.IntentSenderRequest, androidx.activity.result.ActivityResult> {
        FragmentIntentSenderContract() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r4, androidx.activity.result.IntentSenderRequest r5) {
                r3 = this;
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r0 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                r4.<init>(r0)
                android.content.Intent r0 = r5.getFillInIntent()
                if (r0 == 0) goto L42
                java.lang.String r1 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
                android.os.Bundle r2 = r0.getBundleExtra(r1)
                if (r2 == 0) goto L42
                r4.putExtra(r1, r2)
                r0.removeExtra(r1)
                java.lang.String r1 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
                r2 = 0
                boolean r0 = r0.getBooleanExtra(r1, r2)
                if (r0 == 0) goto L42
                androidx.activity.result.IntentSenderRequest$Builder r0 = new androidx.activity.result.IntentSenderRequest$Builder
                android.content.IntentSender r1 = r5.getIntentSender()
                r0.<init>(r1)
                r1 = 0
                androidx.activity.result.IntentSenderRequest$Builder r0 = r0.setFillInIntent(r1)
                int r1 = r5.getFlagsValues()
                int r5 = r5.getFlagsMask()
                androidx.activity.result.IntentSenderRequest$Builder r5 = r0.setFlags(r1, r5)
                androidx.activity.result.IntentSenderRequest r5 = r5.build()
            L42:
                java.lang.String r0 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                r4.putExtra(r0, r5)
                r5 = 2
                boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
                if (r5 == 0) goto L62
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r0 = "CreateIntent created the following intent: "
                r5.<init>(r0)
                java.lang.StringBuilder r5 = r5.append(r4)
                java.lang.String r5 = r5.toString()
                java.lang.String r0 = "FragmentManager"
                android.util.Log.v(r0, r5)
            L62:
                return r4
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, androidx.activity.result.IntentSenderRequest r2) {
                r0 = this;
                androidx.activity.result.IntentSenderRequest r2 = (androidx.activity.result.IntentSenderRequest) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public androidx.activity.result.ActivityResult parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
                r0.<init>(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResult parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                androidx.activity.result.ActivityResult r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    public static abstract class FragmentLifecycleCallbacks {
        public FragmentLifecycleCallbacks() {
                r0 = this;
                r0.<init>()
                return
        }

        @java.lang.Deprecated
        public void onFragmentActivityCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentAttached(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.content.Context r3) {
                r0 = this;
                return
        }

        public void onFragmentCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentDestroyed(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentDetached(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentPaused(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentPreAttached(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.content.Context r3) {
                r0 = this;
                return
        }

        public void onFragmentPreCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentResumed(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentSaveInstanceState(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentStarted(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentStopped(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentViewCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.view.View r3, android.os.Bundle r4) {
                r0 = this;
                return
        }

        public void onFragmentViewDestroyed(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }
    }

    static class LaunchedFragmentInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> CREATOR = null;
        int mRequestCode;
        java.lang.String mWho;


        static {
                androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1 r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1
                r0.<init>()
                androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.CREATOR = r0
                return
        }

        LaunchedFragmentInfo(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.mWho = r0
                int r2 = r2.readInt()
                r1.mRequestCode = r2
                return
        }

        LaunchedFragmentInfo(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.mWho = r1
                r0.mRequestCode = r2
                return
        }

        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.mWho
                r1.writeString(r2)
                int r2 = r0.mRequestCode
                r1.writeInt(r2)
                return
        }
    }

    private static class LifecycleAwareResultListener implements androidx.fragment.app.FragmentResultListener {
        private final androidx.lifecycle.Lifecycle mLifecycle;
        private final androidx.fragment.app.FragmentResultListener mListener;
        private final androidx.lifecycle.LifecycleEventObserver mObserver;

        LifecycleAwareResultListener(androidx.lifecycle.Lifecycle r1, androidx.fragment.app.FragmentResultListener r2, androidx.lifecycle.LifecycleEventObserver r3) {
                r0 = this;
                r0.<init>()
                r0.mLifecycle = r1
                r0.mListener = r2
                r0.mObserver = r3
                return
        }

        public boolean isAtLeast(androidx.lifecycle.Lifecycle.State r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.mLifecycle
                androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
                boolean r2 = r0.isAtLeast(r2)
                return r2
        }

        @Override // androidx.fragment.app.FragmentResultListener
        public void onFragmentResult(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                androidx.fragment.app.FragmentResultListener r0 = r1.mListener
                r0.onFragmentResult(r2, r3)
                return
        }

        public void removeObserver() {
                r2 = this;
                androidx.lifecycle.Lifecycle r0 = r2.mLifecycle
                androidx.lifecycle.LifecycleEventObserver r1 = r2.mObserver
                r0.removeObserver(r1)
                return
        }
    }

    public interface OnBackStackChangedListener {
        void onBackStackChanged();
    }

    interface OpGenerator {
        boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1, java.util.ArrayList<java.lang.Boolean> r2);
    }

    private class PopBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        final int mFlags;
        final int mId;
        final java.lang.String mName;
        final /* synthetic */ androidx.fragment.app.FragmentManager this$0;

        PopBackStackState(androidx.fragment.app.FragmentManager r1, java.lang.String r2, int r3, int r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mName = r2
                r0.mId = r3
                r0.mFlags = r4
                return
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7, java.util.ArrayList<java.lang.Boolean> r8) {
                r6 = this;
                androidx.fragment.app.FragmentManager r0 = r6.this$0
                androidx.fragment.app.Fragment r0 = r0.mPrimaryNav
                if (r0 == 0) goto L1e
                int r0 = r6.mId
                if (r0 >= 0) goto L1e
                java.lang.String r0 = r6.mName
                if (r0 != 0) goto L1e
                androidx.fragment.app.FragmentManager r0 = r6.this$0
                androidx.fragment.app.Fragment r0 = r0.mPrimaryNav
                androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
                boolean r0 = r0.popBackStackImmediate()
                if (r0 == 0) goto L1e
                r7 = 0
                return r7
            L1e:
                androidx.fragment.app.FragmentManager r0 = r6.this$0
                java.lang.String r3 = r6.mName
                int r4 = r6.mId
                int r5 = r6.mFlags
                r1 = r7
                r2 = r8
                boolean r7 = r0.popBackStackState(r1, r2, r3, r4, r5)
                return r7
        }
    }

    private class RestoreBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        private final java.lang.String mName;
        final /* synthetic */ androidx.fragment.app.FragmentManager this$0;

        RestoreBackStackState(androidx.fragment.app.FragmentManager r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mName = r2
                return
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3, java.util.ArrayList<java.lang.Boolean> r4) {
                r2 = this;
                androidx.fragment.app.FragmentManager r0 = r2.this$0
                java.lang.String r1 = r2.mName
                boolean r3 = r0.restoreBackStackState(r3, r4, r1)
                return r3
        }
    }

    private class SaveBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        private final java.lang.String mName;
        final /* synthetic */ androidx.fragment.app.FragmentManager this$0;

        SaveBackStackState(androidx.fragment.app.FragmentManager r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mName = r2
                return
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3, java.util.ArrayList<java.lang.Boolean> r4) {
                r2 = this;
                androidx.fragment.app.FragmentManager r0 = r2.this$0
                java.lang.String r1 = r2.mName
                boolean r3 = r0.saveBackStackState(r3, r4, r1)
                return r3
        }
    }

    static {
            return
    }

    public FragmentManager() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mPendingActions = r0
            androidx.fragment.app.FragmentStore r0 = new androidx.fragment.app.FragmentStore
            r0.<init>()
            r2.mFragmentStore = r0
            androidx.fragment.app.FragmentLayoutInflaterFactory r0 = new androidx.fragment.app.FragmentLayoutInflaterFactory
            r0.<init>(r2)
            r2.mLayoutInflaterFactory = r0
            androidx.fragment.app.FragmentManager$1 r0 = new androidx.fragment.app.FragmentManager$1
            r1 = 0
            r0.<init>(r2, r1)
            r2.mOnBackPressedCallback = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.mBackStackIndex = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.mBackStackStates = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.mResults = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.mResultListeners = r0
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = new androidx.fragment.app.FragmentLifecycleCallbacksDispatcher
            r0.<init>(r2)
            r2.mLifecycleCallbacksDispatcher = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.mOnAttachListeners = r0
            androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda0 r0 = new androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r2.mOnConfigurationChangedListener = r0
            androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda1 r0 = new androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda1
            r0.<init>(r2)
            r2.mOnTrimMemoryListener = r0
            androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda2 r0 = new androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda2
            r0.<init>(r2)
            r2.mOnMultiWindowModeChangedListener = r0
            androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda3 r0 = new androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda3
            r0.<init>(r2)
            r2.mOnPictureInPictureModeChangedListener = r0
            androidx.fragment.app.FragmentManager$2 r0 = new androidx.fragment.app.FragmentManager$2
            r0.<init>(r2)
            r2.mMenuProvider = r0
            r0 = -1
            r2.mCurState = r0
            r0 = 0
            r2.mFragmentFactory = r0
            androidx.fragment.app.FragmentManager$3 r1 = new androidx.fragment.app.FragmentManager$3
            r1.<init>(r2)
            r2.mHostFragmentFactory = r1
            r2.mSpecialEffectsControllerFactory = r0
            androidx.fragment.app.FragmentManager$4 r0 = new androidx.fragment.app.FragmentManager$4
            r0.<init>(r2)
            r2.mDefaultSpecialEffectsControllerFactory = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.mLaunchedFragments = r0
            androidx.fragment.app.FragmentManager$5 r0 = new androidx.fragment.app.FragmentManager$5
            r0.<init>(r2)
            r2.mExecCommit = r0
            return
    }

    static /* synthetic */ java.util.Map access$000(androidx.fragment.app.FragmentManager r0) {
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r0.mResults
            return r0
    }

    static /* synthetic */ java.util.Map access$100(androidx.fragment.app.FragmentManager r0) {
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r0.mResultListeners
            return r0
    }

    static /* synthetic */ androidx.fragment.app.FragmentStore access$200(androidx.fragment.app.FragmentManager r0) {
            androidx.fragment.app.FragmentStore r0 = r0.mFragmentStore
            return r0
    }

    private void checkStateLoss() {
            r2 = this;
            boolean r0 = r2.isStateSaved()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can not perform this action after onSaveInstanceState"
            r0.<init>(r1)
            throw r0
    }

    private void cleanupExec() {
            r1 = this;
            r0 = 0
            r1.mExecutingActions = r0
            java.util.ArrayList<java.lang.Boolean> r0 = r1.mTmpIsPop
            r0.clear()
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mTmpRecords
            r0.clear()
            return
    }

    private void clearBackStackStateViewModels() {
            r4 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            boolean r1 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r1 == 0) goto L11
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r0 = r0.getNonConfig()
            boolean r0 = r0.isCleared()
            goto L29
        L11:
            android.content.Context r0 = r0.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            r1 = 1
            if (r0 == 0) goto L28
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            android.content.Context r0 = r0.getContext()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            r0 = r0 ^ r1
            goto L29
        L28:
            r0 = r1
        L29:
            if (r0 == 0) goto L5d
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r0 = r4.mBackStackStates
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.BackStackState r1 = (androidx.fragment.app.BackStackState) r1
            java.util.List<java.lang.String> r1 = r1.mFragments
            java.util.Iterator r1 = r1.iterator()
        L47:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            androidx.fragment.app.FragmentStore r3 = r4.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r3 = r3.getNonConfig()
            r3.clearNonConfigState(r2)
            goto L47
        L5d:
            return
    }

    private java.util.Set<androidx.fragment.app.SpecialEffectsController> collectAllSpecialEffectsController() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            java.util.List r1 = r1.getActiveFragmentStateManagers()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            androidx.fragment.app.Fragment r2 = r2.getFragment()
            android.view.ViewGroup r2 = r2.mContainer
            if (r2 == 0) goto Lf
            androidx.fragment.app.SpecialEffectsControllerFactory r3 = r4.getSpecialEffectsControllerFactory()
            androidx.fragment.app.SpecialEffectsController r2 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r2, r3)
            r0.add(r2)
            goto Lf
        L2f:
            return r0
    }

    private java.util.Set<androidx.fragment.app.SpecialEffectsController> collectChangedControllers(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r4, int r5, int r6) {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L5:
            if (r5 >= r6) goto L32
            java.lang.Object r1 = r4.get(r5)
            androidx.fragment.app.BackStackRecord r1 = (androidx.fragment.app.BackStackRecord) r1
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r1.mOps
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            androidx.fragment.app.Fragment r2 = r2.mFragment
            if (r2 == 0) goto L13
            android.view.ViewGroup r2 = r2.mContainer
            if (r2 == 0) goto L13
            androidx.fragment.app.SpecialEffectsController r2 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r2, r3)
            r0.add(r2)
            goto L13
        L2f:
            int r5 = r5 + 1
            goto L5
        L32:
            return r0
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(androidx.fragment.app.Fragment r2) {
            r1 = this;
            if (r2 == 0) goto L11
            java.lang.String r0 = r2.mWho
            androidx.fragment.app.Fragment r0 = r1.findActiveFragment(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L11
            r2.performPrimaryNavigationFragmentChanged()
        L11:
            return
    }

    private void dispatchStateChange(int r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            r3.mExecutingActions = r0     // Catch: java.lang.Throwable -> L2a
            androidx.fragment.app.FragmentStore r2 = r3.mFragmentStore     // Catch: java.lang.Throwable -> L2a
            r2.dispatchStateChange(r4)     // Catch: java.lang.Throwable -> L2a
            r3.moveToState(r4, r1)     // Catch: java.lang.Throwable -> L2a
            java.util.Set r4 = r3.collectAllSpecialEffectsController()     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2a
        L14:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L24
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L2a
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2     // Catch: java.lang.Throwable -> L2a
            r2.forceCompleteAllOperations()     // Catch: java.lang.Throwable -> L2a
            goto L14
        L24:
            r3.mExecutingActions = r1
            r3.execPendingActions(r0)
            return
        L2a:
            r4 = move-exception
            r3.mExecutingActions = r1
            throw r4
    }

    private void doPendingDeferredStart() {
            r1 = this;
            boolean r0 = r1.mHavePendingDeferredStart
            if (r0 == 0) goto La
            r0 = 0
            r1.mHavePendingDeferredStart = r0
            r1.startPendingDeferredFragments()
        La:
            return
    }

    @java.lang.Deprecated
    public static void enableDebugLogging(boolean r0) {
            androidx.fragment.app.FragmentManager.DEBUG = r0
            return
    }

    private void endAnimatingAwayFragments() {
            r2 = this;
            java.util.Set r0 = r2.collectAllSpecialEffectsController()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController r1 = (androidx.fragment.app.SpecialEffectsController) r1
            r1.forceCompleteAllOperations()
            goto L8
        L18:
            return
    }

    private void ensureExecReady(boolean r3) {
            r2 = this;
            boolean r0 = r2.mExecutingActions
            if (r0 != 0) goto L4c
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L1c
            boolean r3 = r2.mDestroyed
            if (r3 == 0) goto L14
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager has been destroyed"
            r3.<init>(r0)
            throw r3
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager has not been attached to a host."
            r3.<init>(r0)
            throw r3
        L1c:
            android.os.Looper r0 = android.os.Looper.myLooper()
            androidx.fragment.app.FragmentHostCallback<?> r1 = r2.mHost
            android.os.Handler r1 = r1.getHandler()
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L44
            if (r3 != 0) goto L31
            r2.checkStateLoss()
        L31:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r2.mTmpRecords
            if (r3 != 0) goto L43
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mTmpRecords = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mTmpIsPop = r3
        L43:
            return
        L44:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must be called from main thread of fragment host"
            r3.<init>(r0)
            throw r3
        L4c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager is already executing transactions"
            r3.<init>(r0)
            throw r3
    }

    private static void executeOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r2, java.util.ArrayList<java.lang.Boolean> r3, int r4, int r5) {
        L0:
            if (r4 >= r5) goto L26
            java.lang.Object r0 = r2.get(r4)
            androidx.fragment.app.BackStackRecord r0 = (androidx.fragment.app.BackStackRecord) r0
            java.lang.Object r1 = r3.get(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1c
            r1 = -1
            r0.bumpBackStackNesting(r1)
            r0.executePopOps()
            goto L23
        L1c:
            r1 = 1
            r0.bumpBackStackNesting(r1)
            r0.executeOps()
        L23:
            int r4 = r4 + 1
            goto L0
        L26:
            return
    }

    private void executeOpsTogether(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9, java.util.ArrayList<java.lang.Boolean> r10, int r11, int r12) {
            r8 = this;
            java.lang.Object r0 = r9.get(r11)
            androidx.fragment.app.BackStackRecord r0 = (androidx.fragment.app.BackStackRecord) r0
            boolean r0 = r0.mReorderingAllowed
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r8.mTmpAddedFragments
            if (r1 != 0) goto L14
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8.mTmpAddedFragments = r1
            goto L17
        L14:
            r1.clear()
        L17:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r8.mTmpAddedFragments
            androidx.fragment.app.FragmentStore r2 = r8.mFragmentStore
            java.util.List r2 = r2.getFragments()
            r1.addAll(r2)
            androidx.fragment.app.Fragment r1 = r8.getPrimaryNavigationFragment()
            r2 = 0
            r3 = r11
            r4 = r2
        L29:
            r5 = 1
            if (r3 >= r12) goto L58
            java.lang.Object r6 = r9.get(r3)
            androidx.fragment.app.BackStackRecord r6 = (androidx.fragment.app.BackStackRecord) r6
            java.lang.Object r7 = r10.get(r3)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L45
            java.util.ArrayList<androidx.fragment.app.Fragment> r7 = r8.mTmpAddedFragments
            androidx.fragment.app.Fragment r1 = r6.expandOps(r7, r1)
            goto L4b
        L45:
            java.util.ArrayList<androidx.fragment.app.Fragment> r7 = r8.mTmpAddedFragments
            androidx.fragment.app.Fragment r1 = r6.trackAddedFragmentsInPop(r7, r1)
        L4b:
            if (r4 != 0) goto L54
            boolean r4 = r6.mAddToBackStack
            if (r4 == 0) goto L52
            goto L54
        L52:
            r4 = r2
            goto L55
        L54:
            r4 = r5
        L55:
            int r3 = r3 + 1
            goto L29
        L58:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r8.mTmpAddedFragments
            r1.clear()
            if (r0 != 0) goto L93
            int r0 = r8.mCurState
            if (r0 < r5) goto L93
            r0 = r11
        L64:
            if (r0 >= r12) goto L93
            java.lang.Object r1 = r9.get(r0)
            androidx.fragment.app.BackStackRecord r1 = (androidx.fragment.app.BackStackRecord) r1
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r1.mOps
            java.util.Iterator r1 = r1.iterator()
        L72:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L90
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            androidx.fragment.app.Fragment r2 = r2.mFragment
            if (r2 == 0) goto L72
            androidx.fragment.app.FragmentManager r3 = r2.mFragmentManager
            if (r3 == 0) goto L72
            androidx.fragment.app.FragmentStateManager r2 = r8.createOrGetFragmentStateManager(r2)
            androidx.fragment.app.FragmentStore r3 = r8.mFragmentStore
            r3.makeActive(r2)
            goto L72
        L90:
            int r0 = r0 + 1
            goto L64
        L93:
            executeOps(r9, r10, r11, r12)
            int r0 = r12 + (-1)
            java.lang.Object r0 = r10.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r11
        La3:
            if (r1 >= r12) goto Led
            java.lang.Object r2 = r9.get(r1)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            if (r0 == 0) goto Lcc
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r2.mOps
            int r3 = r3.size()
            int r3 = r3 - r5
        Lb4:
            if (r3 < 0) goto Lea
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r6 = r2.mOps
            java.lang.Object r6 = r6.get(r3)
            androidx.fragment.app.FragmentTransaction$Op r6 = (androidx.fragment.app.FragmentTransaction.Op) r6
            androidx.fragment.app.Fragment r6 = r6.mFragment
            if (r6 == 0) goto Lc9
            androidx.fragment.app.FragmentStateManager r6 = r8.createOrGetFragmentStateManager(r6)
            r6.moveToExpectedState()
        Lc9:
            int r3 = r3 + (-1)
            goto Lb4
        Lcc:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r2.mOps
            java.util.Iterator r2 = r2.iterator()
        Ld2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lea
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.Op) r3
            androidx.fragment.app.Fragment r3 = r3.mFragment
            if (r3 == 0) goto Ld2
            androidx.fragment.app.FragmentStateManager r3 = r8.createOrGetFragmentStateManager(r3)
            r3.moveToExpectedState()
            goto Ld2
        Lea:
            int r1 = r1 + 1
            goto La3
        Led:
            int r1 = r8.mCurState
            r8.moveToState(r1, r5)
            java.util.Set r1 = r8.collectChangedControllers(r9, r11, r12)
            java.util.Iterator r1 = r1.iterator()
        Lfa:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L110
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2
            r2.updateOperationDirection(r0)
            r2.markPostponedState()
            r2.executePendingOperations()
            goto Lfa
        L110:
            if (r11 >= r12) goto L131
            java.lang.Object r0 = r9.get(r11)
            androidx.fragment.app.BackStackRecord r0 = (androidx.fragment.app.BackStackRecord) r0
            java.lang.Object r1 = r10.get(r11)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L12b
            int r1 = r0.mIndex
            if (r1 < 0) goto L12b
            r1 = -1
            r0.mIndex = r1
        L12b:
            r0.runOnCommitRunnables()
            int r11 = r11 + 1
            goto L110
        L131:
            if (r4 == 0) goto L136
            r8.reportBackStackChanged()
        L136:
            return
    }

    private int findBackStackIndex(java.lang.String r5, int r6, boolean r7) {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r4.mBackStack
            r1 = -1
            if (r0 == 0) goto L7b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L7b
        Ld:
            if (r5 != 0) goto L1e
            if (r6 >= 0) goto L1e
            if (r7 == 0) goto L15
            r5 = 0
            return r5
        L15:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5 = r4.mBackStack
            int r5 = r5.size()
            int r5 = r5 + (-1)
            return r5
        L1e:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r4.mBackStack
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L26:
            if (r0 < 0) goto L47
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r2 = r4.mBackStack
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            if (r5 == 0) goto L3d
            java.lang.String r3 = r2.getName()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3d
            goto L47
        L3d:
            if (r6 < 0) goto L44
            int r2 = r2.mIndex
            if (r6 != r2) goto L44
            goto L47
        L44:
            int r0 = r0 + (-1)
            goto L26
        L47:
            if (r0 >= 0) goto L4a
            return r0
        L4a:
            if (r7 == 0) goto L6d
        L4c:
            if (r0 <= 0) goto L7a
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7 = r4.mBackStack
            int r1 = r0 + (-1)
            java.lang.Object r7 = r7.get(r1)
            androidx.fragment.app.BackStackRecord r7 = (androidx.fragment.app.BackStackRecord) r7
            if (r5 == 0) goto L64
            java.lang.String r1 = r7.getName()
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L6a
        L64:
            if (r6 < 0) goto L7a
            int r7 = r7.mIndex
            if (r6 != r7) goto L7a
        L6a:
            int r0 = r0 + (-1)
            goto L4c
        L6d:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5 = r4.mBackStack
            int r5 = r5.size()
            int r5 = r5 + (-1)
            if (r0 != r5) goto L78
            return r1
        L78:
            int r0 = r0 + 1
        L7a:
            return r0
        L7b:
            return r1
    }

    public static <F extends androidx.fragment.app.Fragment> F findFragment(android.view.View r3) {
            androidx.fragment.app.Fragment r0 = findViewFragment(r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "View "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " does not have a Fragment set"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    static androidx.fragment.app.FragmentManager findFragmentManager(android.view.View r4) {
            androidx.fragment.app.Fragment r0 = findViewFragment(r4)
            if (r0 == 0) goto L36
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto L11
            androidx.fragment.app.FragmentManager r4 = r0.getChildFragmentManager()
            goto L53
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "The Fragment "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " that owns View "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " has already been destroyed. Nested fragments should always use the child FragmentManager."
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
        L36:
            android.content.Context r0 = r4.getContext()
        L3a:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L4c
            boolean r1 = r0 instanceof androidx.fragment.app.FragmentActivity
            if (r1 == 0) goto L45
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            goto L4d
        L45:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L3a
        L4c:
            r0 = 0
        L4d:
            if (r0 == 0) goto L54
            androidx.fragment.app.FragmentManager r4 = r0.getSupportFragmentManager()
        L53:
            return r4
        L54:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "View "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " is not within a subclass of FragmentActivity."
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private static androidx.fragment.app.Fragment findViewFragment(android.view.View r2) {
        L0:
            r0 = 0
            if (r2 == 0) goto L17
            androidx.fragment.app.Fragment r1 = getViewFragment(r2)
            if (r1 == 0) goto La
            return r1
        La:
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L15
            android.view.View r2 = (android.view.View) r2
            goto L0
        L15:
            r2 = r0
            goto L0
        L17:
            return r0
    }

    private void forcePostponedTransactions() {
            r2 = this;
            java.util.Set r0 = r2.collectAllSpecialEffectsController()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.SpecialEffectsController r1 = (androidx.fragment.app.SpecialEffectsController) r1
            r1.forcePostponedExecutePendingOperations()
            goto L8
        L18:
            return
    }

    private boolean generateOpsForPendingActions(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6, java.util.ArrayList<java.lang.Boolean> r7) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r5.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r5.mPendingActions     // Catch: java.lang.Throwable -> L4b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4b
            r2 = 0
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            return r2
        Le:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r5.mPendingActions     // Catch: java.lang.Throwable -> L39
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L39
            r3 = r2
        L15:
            if (r2 >= r1) goto L27
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r5.mPendingActions     // Catch: java.lang.Throwable -> L39
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L39
            androidx.fragment.app.FragmentManager$OpGenerator r4 = (androidx.fragment.app.FragmentManager.OpGenerator) r4     // Catch: java.lang.Throwable -> L39
            boolean r4 = r4.generateOps(r6, r7)     // Catch: java.lang.Throwable -> L39
            r3 = r3 | r4
            int r2 = r2 + 1
            goto L15
        L27:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r6 = r5.mPendingActions     // Catch: java.lang.Throwable -> L4b
            r6.clear()     // Catch: java.lang.Throwable -> L4b
            androidx.fragment.app.FragmentHostCallback<?> r6 = r5.mHost     // Catch: java.lang.Throwable -> L4b
            android.os.Handler r6 = r6.getHandler()     // Catch: java.lang.Throwable -> L4b
            java.lang.Runnable r7 = r5.mExecCommit     // Catch: java.lang.Throwable -> L4b
            r6.removeCallbacks(r7)     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            return r3
        L39:
            r6 = move-exception
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r7 = r5.mPendingActions     // Catch: java.lang.Throwable -> L4b
            r7.clear()     // Catch: java.lang.Throwable -> L4b
            androidx.fragment.app.FragmentHostCallback<?> r7 = r5.mHost     // Catch: java.lang.Throwable -> L4b
            android.os.Handler r7 = r7.getHandler()     // Catch: java.lang.Throwable -> L4b
            java.lang.Runnable r1 = r5.mExecCommit     // Catch: java.lang.Throwable -> L4b
            r7.removeCallbacks(r1)     // Catch: java.lang.Throwable -> L4b
            throw r6     // Catch: java.lang.Throwable -> L4b
        L4b:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            throw r6
    }

    private androidx.fragment.app.FragmentManagerViewModel getChildNonConfig(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            androidx.fragment.app.FragmentManagerViewModel r2 = r0.getChildNonConfig(r2)
            return r2
    }

    private android.view.ViewGroup getFragmentContainer(androidx.fragment.app.Fragment r3) {
            r2 = this;
            android.view.ViewGroup r0 = r3.mContainer
            if (r0 == 0) goto L7
            android.view.ViewGroup r3 = r3.mContainer
            return r3
        L7:
            int r0 = r3.mContainerId
            r1 = 0
            if (r0 > 0) goto Ld
            return r1
        Ld:
            androidx.fragment.app.FragmentContainer r0 = r2.mContainer
            boolean r0 = r0.onHasView()
            if (r0 == 0) goto L24
            androidx.fragment.app.FragmentContainer r0 = r2.mContainer
            int r3 = r3.mContainerId
            android.view.View r3 = r0.onFindViewById(r3)
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L24
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
        L24:
            return r1
    }

    static androidx.fragment.app.Fragment getViewFragment(android.view.View r1) {
            int r0 = androidx.fragment.R.id.fragment_container_view_tag
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto Ld
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static boolean isLoggingEnabled(int r1) {
            boolean r0 = androidx.fragment.app.FragmentManager.DEBUG
            if (r0 != 0) goto Lf
            java.lang.String r0 = "FragmentManager"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    private boolean isMenuAvailable(androidx.fragment.app.Fragment r2) {
            r1 = this;
            boolean r0 = r2.mHasMenu
            if (r0 == 0) goto L8
            boolean r0 = r2.mMenuVisible
            if (r0 != 0) goto L10
        L8:
            androidx.fragment.app.FragmentManager r2 = r2.mChildFragmentManager
            boolean r2 = r2.checkForMenus()
            if (r2 == 0) goto L12
        L10:
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    private boolean isParentAdded() {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.mParent
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.isAdded()
            if (r0 == 0) goto L19
            androidx.fragment.app.Fragment r0 = r2.mParent
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            boolean r0 = r0.isParentAdded()
            if (r0 == 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
    }

    private boolean popBackStackImmediate(java.lang.String r9, int r10, int r11) {
            r8 = this;
            r0 = 0
            r8.execPendingActions(r0)
            r0 = 1
            r8.ensureExecReady(r0)
            androidx.fragment.app.Fragment r1 = r8.mPrimaryNav
            if (r1 == 0) goto L1b
            if (r10 >= 0) goto L1b
            if (r9 != 0) goto L1b
            androidx.fragment.app.FragmentManager r1 = r1.getChildFragmentManager()
            boolean r1 = r1.popBackStackImmediate()
            if (r1 == 0) goto L1b
            return r0
        L1b:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r8.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r4 = r8.mTmpIsPop
            r2 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            boolean r9 = r2.popBackStackState(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L3b
            r8.mExecutingActions = r0
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10 = r8.mTmpRecords     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList<java.lang.Boolean> r11 = r8.mTmpIsPop     // Catch: java.lang.Throwable -> L36
            r8.removeRedundantOperationsAndExecute(r10, r11)     // Catch: java.lang.Throwable -> L36
            r8.cleanupExec()
            goto L3b
        L36:
            r9 = move-exception
            r8.cleanupExec()
            throw r9
        L3b:
            r8.updateOnBackPressedCallbackEnabled()
            r8.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r10 = r8.mFragmentStore
            r10.burpActive()
            return r9
    }

    private void removeRedundantOperationsAndExecute(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5, java.util.ArrayList<java.lang.Boolean> r6) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r5.size()
            int r1 = r6.size()
            if (r0 != r1) goto L5f
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L17:
            if (r1 >= r0) goto L59
            java.lang.Object r3 = r5.get(r1)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            boolean r3 = r3.mReorderingAllowed
            if (r3 != 0) goto L56
            if (r2 == r1) goto L28
            r4.executeOpsTogether(r5, r6, r2, r1)
        L28:
            int r2 = r1 + 1
            java.lang.Object r3 = r6.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L51
        L36:
            if (r2 >= r0) goto L51
            java.lang.Object r3 = r6.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r5.get(r2)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            boolean r3 = r3.mReorderingAllowed
            if (r3 != 0) goto L51
            int r2 = r2 + 1
            goto L36
        L51:
            r4.executeOpsTogether(r5, r6, r1, r2)
            int r1 = r2 + (-1)
        L56:
            int r1 = r1 + 1
            goto L17
        L59:
            if (r2 == r0) goto L5e
            r4.executeOpsTogether(r5, r6, r2, r0)
        L5e:
            return
        L5f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Internal error with the back stack records"
            r5.<init>(r6)
            throw r5
    }

    private void reportBackStackChanged() {
            r2 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r2.mBackStackChangeListeners
            if (r0 == 0) goto L1b
            r0 = 0
        L5:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r1 = r2.mBackStackChangeListeners
            int r1 = r1.size()
            if (r0 >= r1) goto L1b
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r1 = r2.mBackStackChangeListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.FragmentManager$OnBackStackChangedListener r1 = (androidx.fragment.app.FragmentManager.OnBackStackChangedListener) r1
            r1.onBackStackChanged()
            int r0 = r0 + 1
            goto L5
        L1b:
            return
    }

    static int reverseTransit(int r3) {
            r0 = 8194(0x2002, float:1.1482E-41)
            r1 = 4097(0x1001, float:5.741E-42)
            if (r3 == r1) goto L19
            if (r3 == r0) goto L16
            r0 = 4100(0x1004, float:5.745E-42)
            r1 = 8197(0x2005, float:1.1486E-41)
            if (r3 == r1) goto L19
            r2 = 4099(0x1003, float:5.744E-42)
            if (r3 == r2) goto L18
            if (r3 == r0) goto L16
            r0 = 0
            goto L19
        L16:
            r0 = r1
            goto L19
        L18:
            r0 = r2
        L19:
            return r0
    }

    private void setVisibleRemovingFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            android.view.ViewGroup r0 = r3.getFragmentContainer(r4)
            if (r0 == 0) goto L37
            int r1 = r4.getEnterAnim()
            int r2 = r4.getExitAnim()
            int r1 = r1 + r2
            int r2 = r4.getPopEnterAnim()
            int r1 = r1 + r2
            int r2 = r4.getPopExitAnim()
            int r1 = r1 + r2
            if (r1 <= 0) goto L37
            int r1 = androidx.fragment.R.id.visible_removing_fragment_view_tag
            java.lang.Object r1 = r0.getTag(r1)
            if (r1 != 0) goto L28
            int r1 = androidx.fragment.R.id.visible_removing_fragment_view_tag
            r0.setTag(r1, r4)
        L28:
            int r1 = androidx.fragment.R.id.visible_removing_fragment_view_tag
            java.lang.Object r0 = r0.getTag(r1)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            boolean r4 = r4.getPopDirection()
            r0.setPopDirection(r4)
        L37:
            return
    }

    private void startPendingDeferredFragments() {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            r2.performPendingDeferredStart(r1)
            goto La
        L1a:
            return
    }

    private void throwException(java.lang.RuntimeException r8) {
            r7 = this;
            java.lang.String r0 = r8.getMessage()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "Activity state:"
            android.util.Log.e(r1, r0)
            androidx.fragment.app.LogWriter r0 = new androidx.fragment.app.LogWriter
            r0.<init>(r1)
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r0)
            androidx.fragment.app.FragmentHostCallback<?> r0 = r7.mHost
            java.lang.String r3 = "Failed dumping state"
            r4 = 0
            r5 = 0
            java.lang.String r6 = "  "
            if (r0 == 0) goto L2d
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L28
            r0.onDump(r6, r5, r2, r4)     // Catch: java.lang.Exception -> L28
            goto L37
        L28:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
            goto L37
        L2d:
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L33
            r7.dump(r6, r5, r2, r0)     // Catch: java.lang.Exception -> L33
            goto L37
        L33:
            r0 = move-exception
            android.util.Log.e(r1, r3, r0)
        L37:
            throw r8
    }

    private void updateOnBackPressedCallbackEnabled() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r3.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r3.mPendingActions     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2a
            r2 = 1
            if (r1 != 0) goto L13
            androidx.activity.OnBackPressedCallback r1 = r3.mOnBackPressedCallback     // Catch: java.lang.Throwable -> L2a
            r1.setEnabled(r2)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            androidx.activity.OnBackPressedCallback r0 = r3.mOnBackPressedCallback
            int r1 = r3.getBackStackEntryCount()
            if (r1 <= 0) goto L25
            androidx.fragment.app.Fragment r1 = r3.mParent
            boolean r1 = r3.isPrimaryNavigation(r1)
            if (r1 == 0) goto L25
            goto L26
        L25:
            r2 = 0
        L26:
            r0.setEnabled(r2)
            return
        L2a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r1
    }

    void addBackStackState(androidx.fragment.app.BackStackRecord r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mBackStack = r0
        Lb:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            r0.add(r2)
            return
    }

    androidx.fragment.app.FragmentStateManager addFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.lang.String r0 = r4.mPreviousWho
            if (r0 == 0) goto L9
            java.lang.String r0 = r4.mPreviousWho
            androidx.fragment.app.strictmode.FragmentStrictMode.onFragmentReuse(r4, r0)
        L9:
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "add: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L24:
            androidx.fragment.app.FragmentStateManager r0 = r3.createOrGetFragmentStateManager(r4)
            r4.mFragmentManager = r3
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            r1.makeActive(r0)
            boolean r1 = r4.mDetached
            if (r1 != 0) goto L4a
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            r1.addFragment(r4)
            r1 = 0
            r4.mRemoving = r1
            android.view.View r2 = r4.mView
            if (r2 != 0) goto L41
            r4.mHiddenChanged = r1
        L41:
            boolean r4 = r3.isMenuAvailable(r4)
            if (r4 == 0) goto L4a
            r4 = 1
            r3.mNeedMenuInvalidate = r4
        L4a:
            return r0
    }

    public void addFragmentOnAttachListener(androidx.fragment.app.FragmentOnAttachListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r1.mOnAttachListeners
            r0.add(r2)
            return
    }

    public void addOnBackStackChangedListener(androidx.fragment.app.FragmentManager.OnBackStackChangedListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mBackStackChangeListeners = r0
        Lb:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            r0.add(r2)
            return
    }

    void addRetainedFragment(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            r0.addRetainedFragment(r2)
            return
    }

    int allocBackStackIndex() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.mBackStackIndex
            int r0 = r0.getAndIncrement()
            return r0
    }

    void attachController(androidx.fragment.app.FragmentHostCallback<?> r4, androidx.fragment.app.FragmentContainer r5, androidx.fragment.app.Fragment r6) {
            r3 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            if (r0 != 0) goto L172
            r3.mHost = r4
            r3.mContainer = r5
            r3.mParent = r6
            if (r6 == 0) goto L15
            androidx.fragment.app.FragmentManager$7 r5 = new androidx.fragment.app.FragmentManager$7
            r5.<init>(r3, r6)
            r3.addFragmentOnAttachListener(r5)
            goto L1f
        L15:
            boolean r5 = r4 instanceof androidx.fragment.app.FragmentOnAttachListener
            if (r5 == 0) goto L1f
            r5 = r4
            androidx.fragment.app.FragmentOnAttachListener r5 = (androidx.fragment.app.FragmentOnAttachListener) r5
            r3.addFragmentOnAttachListener(r5)
        L1f:
            androidx.fragment.app.Fragment r5 = r3.mParent
            if (r5 == 0) goto L26
            r3.updateOnBackPressedCallbackEnabled()
        L26:
            boolean r5 = r4 instanceof androidx.activity.OnBackPressedDispatcherOwner
            if (r5 == 0) goto L3b
            r5 = r4
            androidx.activity.OnBackPressedDispatcherOwner r5 = (androidx.activity.OnBackPressedDispatcherOwner) r5
            androidx.activity.OnBackPressedDispatcher r0 = r5.getOnBackPressedDispatcher()
            r3.mOnBackPressedDispatcher = r0
            if (r6 == 0) goto L36
            r5 = r6
        L36:
            androidx.activity.OnBackPressedCallback r1 = r3.mOnBackPressedCallback
            r0.addCallback(r5, r1)
        L3b:
            if (r6 == 0) goto L46
            androidx.fragment.app.FragmentManager r4 = r6.mFragmentManager
            androidx.fragment.app.FragmentManagerViewModel r4 = r4.getChildNonConfig(r6)
            r3.mNonConfig = r4
            goto L5f
        L46:
            boolean r5 = r4 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r5 == 0) goto L57
            androidx.lifecycle.ViewModelStoreOwner r4 = (androidx.lifecycle.ViewModelStoreOwner) r4
            androidx.lifecycle.ViewModelStore r4 = r4.getViewModelStore()
            androidx.fragment.app.FragmentManagerViewModel r4 = androidx.fragment.app.FragmentManagerViewModel.getInstance(r4)
            r3.mNonConfig = r4
            goto L5f
        L57:
            androidx.fragment.app.FragmentManagerViewModel r4 = new androidx.fragment.app.FragmentManagerViewModel
            r5 = 0
            r4.<init>(r5)
            r3.mNonConfig = r4
        L5f:
            androidx.fragment.app.FragmentManagerViewModel r4 = r3.mNonConfig
            boolean r5 = r3.isStateSaved()
            r4.setIsStateSaved(r5)
            androidx.fragment.app.FragmentStore r4 = r3.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r5 = r3.mNonConfig
            r4.setNonConfig(r5)
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.mHost
            boolean r5 = r4 instanceof androidx.savedstate.SavedStateRegistryOwner
            if (r5 == 0) goto L90
            if (r6 != 0) goto L90
            androidx.savedstate.SavedStateRegistryOwner r4 = (androidx.savedstate.SavedStateRegistryOwner) r4
            androidx.savedstate.SavedStateRegistry r4 = r4.getSavedStateRegistry()
            androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda4 r5 = new androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda4
            r5.<init>(r3)
            java.lang.String r0 = "android:support:fragments"
            r4.registerSavedStateProvider(r0, r5)
            android.os.Bundle r4 = r4.consumeRestoredStateForKey(r0)
            if (r4 == 0) goto L90
            r3.restoreSaveStateInternal(r4)
        L90:
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.mHost
            boolean r5 = r4 instanceof androidx.activity.result.ActivityResultRegistryOwner
            if (r5 == 0) goto L12e
            androidx.activity.result.ActivityResultRegistryOwner r4 = (androidx.activity.result.ActivityResultRegistryOwner) r4
            androidx.activity.result.ActivityResultRegistry r4 = r4.getActivityResultRegistry()
            if (r6 == 0) goto Lb4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = r6.mWho
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r0 = ":"
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto Lb6
        Lb4:
            java.lang.String r5 = ""
        Lb6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FragmentManager:"
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r1 = "StartActivityForResult"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r1 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r1.<init>()
            androidx.fragment.app.FragmentManager$8 r2 = new androidx.fragment.app.FragmentManager$8
            r2.<init>(r3)
            androidx.activity.result.ActivityResultLauncher r0 = r4.register(r0, r1, r2)
            r3.mStartActivityForResult = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r1 = "StartIntentSenderForResult"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.FragmentManager$FragmentIntentSenderContract r1 = new androidx.fragment.app.FragmentManager$FragmentIntentSenderContract
            r1.<init>()
            androidx.fragment.app.FragmentManager$9 r2 = new androidx.fragment.app.FragmentManager$9
            r2.<init>(r3)
            androidx.activity.result.ActivityResultLauncher r0 = r4.register(r0, r1, r2)
            r3.mStartIntentSenderForResult = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = "RequestPermissions"
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions r0 = new androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions
            r0.<init>()
            androidx.fragment.app.FragmentManager$10 r1 = new androidx.fragment.app.FragmentManager$10
            r1.<init>(r3)
            androidx.activity.result.ActivityResultLauncher r4 = r4.register(r5, r0, r1)
            r3.mRequestPermissions = r4
        L12e:
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.mHost
            boolean r5 = r4 instanceof androidx.core.content.OnConfigurationChangedProvider
            if (r5 == 0) goto L13b
            androidx.core.content.OnConfigurationChangedProvider r4 = (androidx.core.content.OnConfigurationChangedProvider) r4
            androidx.core.util.Consumer<android.content.res.Configuration> r5 = r3.mOnConfigurationChangedListener
            r4.addOnConfigurationChangedListener(r5)
        L13b:
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.mHost
            boolean r5 = r4 instanceof androidx.core.content.OnTrimMemoryProvider
            if (r5 == 0) goto L148
            androidx.core.content.OnTrimMemoryProvider r4 = (androidx.core.content.OnTrimMemoryProvider) r4
            androidx.core.util.Consumer<java.lang.Integer> r5 = r3.mOnTrimMemoryListener
            r4.addOnTrimMemoryListener(r5)
        L148:
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.mHost
            boolean r5 = r4 instanceof androidx.core.app.OnMultiWindowModeChangedProvider
            if (r5 == 0) goto L155
            androidx.core.app.OnMultiWindowModeChangedProvider r4 = (androidx.core.app.OnMultiWindowModeChangedProvider) r4
            androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> r5 = r3.mOnMultiWindowModeChangedListener
            r4.addOnMultiWindowModeChangedListener(r5)
        L155:
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.mHost
            boolean r5 = r4 instanceof androidx.core.app.OnPictureInPictureModeChangedProvider
            if (r5 == 0) goto L162
            androidx.core.app.OnPictureInPictureModeChangedProvider r4 = (androidx.core.app.OnPictureInPictureModeChangedProvider) r4
            androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> r5 = r3.mOnPictureInPictureModeChangedListener
            r4.addOnPictureInPictureModeChangedListener(r5)
        L162:
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.mHost
            boolean r5 = r4 instanceof androidx.core.view.MenuHost
            if (r5 == 0) goto L171
            if (r6 != 0) goto L171
            androidx.core.view.MenuHost r4 = (androidx.core.view.MenuHost) r4
            androidx.core.view.MenuProvider r5 = r3.mMenuProvider
            r4.addMenuProvider(r5)
        L171:
            return
        L172:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already attached"
            r4.<init>(r5)
            throw r4
    }

    void attachFragment(androidx.fragment.app.Fragment r5) {
            r4 = this;
            r0 = 2
            boolean r1 = isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "attach: "
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1b:
            boolean r1 = r5.mDetached
            if (r1 == 0) goto L4c
            r1 = 0
            r5.mDetached = r1
            boolean r1 = r5.mAdded
            if (r1 != 0) goto L4c
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            r1.addFragment(r5)
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "add from attach: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L43:
            boolean r5 = r4.isMenuAvailable(r5)
            if (r5 == 0) goto L4c
            r5 = 1
            r4.mNeedMenuInvalidate = r5
        L4c:
            return
    }

    public androidx.fragment.app.FragmentTransaction beginTransaction() {
            r1 = this;
            androidx.fragment.app.BackStackRecord r0 = new androidx.fragment.app.BackStackRecord
            r0.<init>(r1)
            return r0
    }

    boolean checkForMenus() {
            r4 = this;
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.util.List r0 = r0.getActiveFragments()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        Lc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L1e
            boolean r2 = r4.isMenuAvailable(r3)
        L1e:
            if (r2 == 0) goto Lc
            r0 = 1
            return r0
        L22:
            return r1
    }

    public void clearBackStack(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentManager$ClearBackStackState r0 = new androidx.fragment.app.FragmentManager$ClearBackStackState
            r0.<init>(r1, r2)
            r2 = 0
            r1.enqueueAction(r0, r2)
            return
    }

    boolean clearBackStackState(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7, java.util.ArrayList<java.lang.Boolean> r8, java.lang.String r9) {
            r6 = this;
            boolean r0 = r6.restoreBackStackState(r7, r8, r9)
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            r4 = -1
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            boolean r7 = r0.popBackStackState(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResult(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r2.mResults
            r0.remove(r3)
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Clearing fragment result with key "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r3)
        L20:
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResultListener(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r2.mResultListeners
            java.lang.Object r0 = r0.remove(r3)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r0 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r0
            if (r0 == 0) goto Ld
            r0.removeObserver()
        Ld:
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Clearing FragmentResultListener for key "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r3)
        L28:
            return
    }

    androidx.fragment.app.FragmentStateManager createOrGetFragmentStateManager(androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            java.lang.String r1 = r4.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            androidx.fragment.app.FragmentStateManager r0 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r3.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r2 = r3.mFragmentStore
            r0.<init>(r1, r2, r4)
            androidx.fragment.app.FragmentHostCallback<?> r4 = r3.mHost
            android.content.Context r4 = r4.getContext()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r0.restoreState(r4)
            int r4 = r3.mCurState
            r0.setFragmentManagerState(r4)
            return r0
    }

    void detachFragment(androidx.fragment.app.Fragment r5) {
            r4 = this;
            r0 = 2
            boolean r1 = isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "detach: "
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1b:
            boolean r1 = r5.mDetached
            if (r1 != 0) goto L4e
            r1 = 1
            r5.mDetached = r1
            boolean r3 = r5.mAdded
            if (r3 == 0) goto L4e
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L3e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "remove from detach: "
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L3e:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            r0.removeFragment(r5)
            boolean r0 = r4.isMenuAvailable(r5)
            if (r0 == 0) goto L4b
            r4.mNeedMenuInvalidate = r1
        L4b:
            r4.setVisibleRemovingFragment(r5)
        L4e:
            return
    }

    void dispatchActivityCreated() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 4
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchAttach() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchConfigurationChanged(android.content.res.Configuration r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L12
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            boolean r0 = r0 instanceof androidx.core.content.OnConfigurationChangedProvider
            if (r0 == 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."
            r0.<init>(r1)
            r3.throwException(r0)
        L12:
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1c
            r1.performConfigurationChanged(r4)
            if (r5 == 0) goto L1c
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager
            r2 = 1
            r1.dispatchConfigurationChanged(r4, r2)
            goto L1c
        L36:
            return
    }

    boolean dispatchContextItemSelected(android.view.MenuItem r5) {
            r4 = this;
            int r0 = r4.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L11
            boolean r3 = r3.performContextItemSelected(r5)
            if (r3 == 0) goto L11
            return r2
        L26:
            return r1
    }

    void dispatchCreate() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 1
            r2.dispatchStateChange(r0)
            return
    }

    boolean dispatchCreateOptionsMenu(android.view.Menu r8, android.view.MenuInflater r9) {
            r7 = this;
            int r0 = r7.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r7.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
            r4 = r1
        L13:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L39
            java.lang.Object r5 = r0.next()
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            if (r5 == 0) goto L13
            boolean r6 = r7.isParentMenuVisible(r5)
            if (r6 == 0) goto L13
            boolean r6 = r5.performCreateOptionsMenu(r8, r9)
            if (r6 == 0) goto L13
            if (r3 != 0) goto L34
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L34:
            r3.add(r5)
            r4 = r2
            goto L13
        L39:
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.mCreatedMenus
            if (r8 == 0) goto L5b
        L3d:
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.mCreatedMenus
            int r8 = r8.size()
            if (r1 >= r8) goto L5b
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r7.mCreatedMenus
            java.lang.Object r8 = r8.get(r1)
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            if (r3 == 0) goto L55
            boolean r9 = r3.contains(r8)
            if (r9 != 0) goto L58
        L55:
            r8.onDestroyOptionsMenu()
        L58:
            int r1 = r1 + 1
            goto L3d
        L5b:
            r7.mCreatedMenus = r3
            return r4
    }

    void dispatchDestroy() {
            r2 = this;
            r0 = 1
            r2.mDestroyed = r0
            r2.execPendingActions(r0)
            r2.endAnimatingAwayFragments()
            r2.clearBackStackStateViewModels()
            r0 = -1
            r2.dispatchStateChange(r0)
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r1 = r0 instanceof androidx.core.content.OnTrimMemoryProvider
            if (r1 == 0) goto L1d
            androidx.core.content.OnTrimMemoryProvider r0 = (androidx.core.content.OnTrimMemoryProvider) r0
            androidx.core.util.Consumer<java.lang.Integer> r1 = r2.mOnTrimMemoryListener
            r0.removeOnTrimMemoryListener(r1)
        L1d:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r1 = r0 instanceof androidx.core.content.OnConfigurationChangedProvider
            if (r1 == 0) goto L2a
            androidx.core.content.OnConfigurationChangedProvider r0 = (androidx.core.content.OnConfigurationChangedProvider) r0
            androidx.core.util.Consumer<android.content.res.Configuration> r1 = r2.mOnConfigurationChangedListener
            r0.removeOnConfigurationChangedListener(r1)
        L2a:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r1 = r0 instanceof androidx.core.app.OnMultiWindowModeChangedProvider
            if (r1 == 0) goto L37
            androidx.core.app.OnMultiWindowModeChangedProvider r0 = (androidx.core.app.OnMultiWindowModeChangedProvider) r0
            androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> r1 = r2.mOnMultiWindowModeChangedListener
            r0.removeOnMultiWindowModeChangedListener(r1)
        L37:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r1 = r0 instanceof androidx.core.app.OnPictureInPictureModeChangedProvider
            if (r1 == 0) goto L44
            androidx.core.app.OnPictureInPictureModeChangedProvider r0 = (androidx.core.app.OnPictureInPictureModeChangedProvider) r0
            androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> r1 = r2.mOnPictureInPictureModeChangedListener
            r0.removeOnPictureInPictureModeChangedListener(r1)
        L44:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r1 = r0 instanceof androidx.core.view.MenuHost
            if (r1 == 0) goto L51
            androidx.core.view.MenuHost r0 = (androidx.core.view.MenuHost) r0
            androidx.core.view.MenuProvider r1 = r2.mMenuProvider
            r0.removeMenuProvider(r1)
        L51:
            r0 = 0
            r2.mHost = r0
            r2.mContainer = r0
            r2.mParent = r0
            androidx.activity.OnBackPressedDispatcher r1 = r2.mOnBackPressedDispatcher
            if (r1 == 0) goto L63
            androidx.activity.OnBackPressedCallback r1 = r2.mOnBackPressedCallback
            r1.remove()
            r2.mOnBackPressedDispatcher = r0
        L63:
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r2.mStartActivityForResult
            if (r0 == 0) goto L74
            r0.unregister()
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r0 = r2.mStartIntentSenderForResult
            r0.unregister()
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r0 = r2.mRequestPermissions
            r0.unregister()
        L74:
            return
    }

    void dispatchDestroyView() {
            r1 = this;
            r0 = 1
            r1.dispatchStateChange(r0)
            return
    }

    void dispatchLowMemory(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L12
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            boolean r0 = r0 instanceof androidx.core.content.OnTrimMemoryProvider
            if (r0 == 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."
            r0.<init>(r1)
            r3.throwException(r0)
        L12:
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1c
            r1.performLowMemory()
            if (r4 == 0) goto L1c
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager
            r2 = 1
            r1.dispatchLowMemory(r2)
            goto L1c
        L36:
            return
    }

    void dispatchMultiWindowModeChanged(boolean r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L12
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            boolean r0 = r0 instanceof androidx.core.app.OnMultiWindowModeChangedProvider
            if (r0 == 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."
            r0.<init>(r1)
            r3.throwException(r0)
        L12:
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1c
            r1.performMultiWindowModeChanged(r4)
            if (r5 == 0) goto L1c
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager
            r2 = 1
            r1.dispatchMultiWindowModeChanged(r4, r2)
            goto L1c
        L36:
            return
    }

    void dispatchOnAttachFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r2.mOnAttachListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentOnAttachListener r1 = (androidx.fragment.app.FragmentOnAttachListener) r1
            r1.onAttachFragment(r2, r3)
            goto L6
        L16:
            return
    }

    void dispatchOnHiddenChanged() {
            r3 = this;
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            java.util.List r0 = r0.getActiveFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto La
            boolean r2 = r1.isHidden()
            r1.onHiddenChanged(r2)
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager
            r1.dispatchOnHiddenChanged()
            goto La
        L25:
            return
    }

    boolean dispatchOptionsItemSelected(android.view.MenuItem r5) {
            r4 = this;
            int r0 = r4.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L11
            boolean r3 = r3.performOptionsItemSelected(r5)
            if (r3 == 0) goto L11
            return r2
        L26:
            return r1
    }

    void dispatchOptionsMenuClosed(android.view.Menu r3) {
            r2 = this;
            int r0 = r2.mCurState
            r1 = 1
            if (r0 >= r1) goto L6
            return
        L6:
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L10
            r1.performOptionsMenuClosed(r3)
            goto L10
        L22:
            return
    }

    void dispatchPause() {
            r1 = this;
            r0 = 5
            r1.dispatchStateChange(r0)
            return
    }

    void dispatchPictureInPictureModeChanged(boolean r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L12
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            boolean r0 = r0 instanceof androidx.core.app.OnPictureInPictureModeChangedProvider
            if (r0 == 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."
            r0.<init>(r1)
            r3.throwException(r0)
        L12:
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1c
            r1.performPictureInPictureModeChanged(r4)
            if (r5 == 0) goto L1c
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager
            r2 = 1
            r1.dispatchPictureInPictureModeChanged(r4, r2)
            goto L1c
        L36:
            return
    }

    boolean dispatchPrepareOptionsMenu(android.view.Menu r6) {
            r5 = this;
            int r0 = r5.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L11
            boolean r4 = r5.isParentMenuVisible(r3)
            if (r4 == 0) goto L11
            boolean r3 = r3.performPrepareOptionsMenu(r6)
            if (r3 == 0) goto L11
            r1 = r2
            goto L11
        L2d:
            return r1
    }

    void dispatchPrimaryNavigationFragmentChanged() {
            r1 = this;
            r1.updateOnBackPressedCallbackEnabled()
            androidx.fragment.app.Fragment r0 = r1.mPrimaryNav
            r1.dispatchParentPrimaryNavigationFragmentChanged(r0)
            return
    }

    void dispatchResume() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 7
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchStart() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 5
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchStop() {
            r2 = this;
            r0 = 1
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 4
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchViewCreated() {
            r1 = this;
            r0 = 2
            r1.dispatchStateChange(r0)
            return
    }

    public void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r1 = "    "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            r1.dump(r5, r6, r7, r8)
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r4.mCreatedMenus
            r8 = 0
            if (r6 == 0) goto L50
            int r6 = r6.size()
            if (r6 <= 0) goto L50
            r7.print(r5)
            java.lang.String r1 = "Fragments Created Menus:"
            r7.println(r1)
            r1 = r8
        L2c:
            if (r1 >= r6) goto L50
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r4.mCreatedMenus
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r7.print(r5)
            java.lang.String r3 = "  #"
            r7.print(r3)
            r7.print(r1)
            java.lang.String r3 = ": "
            r7.print(r3)
            java.lang.String r2 = r2.toString()
            r7.println(r2)
            int r1 = r1 + 1
            goto L2c
        L50:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6 = r4.mBackStack
            if (r6 == 0) goto L8a
            int r6 = r6.size()
            if (r6 <= 0) goto L8a
            r7.print(r5)
            java.lang.String r1 = "Back Stack:"
            r7.println(r1)
            r1 = r8
        L63:
            if (r1 >= r6) goto L8a
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r2 = r4.mBackStack
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            r7.print(r5)
            java.lang.String r3 = "  #"
            r7.print(r3)
            r7.print(r1)
            java.lang.String r3 = ": "
            r7.print(r3)
            java.lang.String r3 = r2.toString()
            r7.println(r3)
            r2.dump(r0, r7)
            int r1 = r1 + 1
            goto L63
        L8a:
            r7.print(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Back Stack Index: "
            r6.<init>(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r4.mBackStackIndex
            int r0 = r0.get()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r7.println(r6)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r6 = r4.mPendingActions
            monitor-enter(r6)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r4.mPendingActions     // Catch: java.lang.Throwable -> L149
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L149
            if (r0 <= 0) goto Ld8
            r7.print(r5)     // Catch: java.lang.Throwable -> L149
            java.lang.String r1 = "Pending Actions:"
            r7.println(r1)     // Catch: java.lang.Throwable -> L149
        Lb8:
            if (r8 >= r0) goto Ld8
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r4.mPendingActions     // Catch: java.lang.Throwable -> L149
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L149
            androidx.fragment.app.FragmentManager$OpGenerator r1 = (androidx.fragment.app.FragmentManager.OpGenerator) r1     // Catch: java.lang.Throwable -> L149
            r7.print(r5)     // Catch: java.lang.Throwable -> L149
            java.lang.String r2 = "  #"
            r7.print(r2)     // Catch: java.lang.Throwable -> L149
            r7.print(r8)     // Catch: java.lang.Throwable -> L149
            java.lang.String r2 = ": "
            r7.print(r2)     // Catch: java.lang.Throwable -> L149
            r7.println(r1)     // Catch: java.lang.Throwable -> L149
            int r8 = r8 + 1
            goto Lb8
        Ld8:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L149
            r7.print(r5)
            java.lang.String r6 = "FragmentManager misc state:"
            r7.println(r6)
            r7.print(r5)
            java.lang.String r6 = "  mHost="
            r7.print(r6)
            androidx.fragment.app.FragmentHostCallback<?> r6 = r4.mHost
            r7.println(r6)
            r7.print(r5)
            java.lang.String r6 = "  mContainer="
            r7.print(r6)
            androidx.fragment.app.FragmentContainer r6 = r4.mContainer
            r7.println(r6)
            androidx.fragment.app.Fragment r6 = r4.mParent
            if (r6 == 0) goto L10c
            r7.print(r5)
            java.lang.String r6 = "  mParent="
            r7.print(r6)
            androidx.fragment.app.Fragment r6 = r4.mParent
            r7.println(r6)
        L10c:
            r7.print(r5)
            java.lang.String r6 = "  mCurState="
            r7.print(r6)
            int r6 = r4.mCurState
            r7.print(r6)
            java.lang.String r6 = " mStateSaved="
            r7.print(r6)
            boolean r6 = r4.mStateSaved
            r7.print(r6)
            java.lang.String r6 = " mStopped="
            r7.print(r6)
            boolean r6 = r4.mStopped
            r7.print(r6)
            java.lang.String r6 = " mDestroyed="
            r7.print(r6)
            boolean r6 = r4.mDestroyed
            r7.println(r6)
            boolean r6 = r4.mNeedMenuInvalidate
            if (r6 == 0) goto L148
            r7.print(r5)
            java.lang.String r5 = "  mNeedMenuInvalidate="
            r7.print(r5)
            boolean r5 = r4.mNeedMenuInvalidate
            r7.println(r5)
        L148:
            return
        L149:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L149
            throw r5
    }

    void enqueueAction(androidx.fragment.app.FragmentManager.OpGenerator r3, boolean r4) {
            r2 = this;
            if (r4 != 0) goto L1d
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L1a
            boolean r3 = r2.mDestroyed
            if (r3 == 0) goto L12
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "FragmentManager has been destroyed"
            r3.<init>(r4)
            throw r3
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "FragmentManager has not been attached to a host."
            r3.<init>(r4)
            throw r3
        L1a:
            r2.checkStateLoss()
        L1d:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r2.mPendingActions
            monitor-enter(r0)
            androidx.fragment.app.FragmentHostCallback<?> r1 = r2.mHost     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L30
            if (r4 == 0) goto L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L28:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Activity has been destroyed"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            throw r3     // Catch: java.lang.Throwable -> L3a
        L30:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r2.mPendingActions     // Catch: java.lang.Throwable -> L3a
            r4.add(r3)     // Catch: java.lang.Throwable -> L3a
            r2.scheduleCommit()     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r3
    }

    boolean execPendingActions(boolean r3) {
            r2 = this;
            r2.ensureExecReady(r3)
            r3 = 0
        L4:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r2.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r1 = r2.mTmpIsPop
            boolean r0 = r2.generateOpsForPendingActions(r0, r1)
            if (r0 == 0) goto L21
            r3 = 1
            r2.mExecutingActions = r3
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r2.mTmpRecords     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayList<java.lang.Boolean> r1 = r2.mTmpIsPop     // Catch: java.lang.Throwable -> L1c
            r2.removeRedundantOperationsAndExecute(r0, r1)     // Catch: java.lang.Throwable -> L1c
            r2.cleanupExec()
            goto L4
        L1c:
            r3 = move-exception
            r2.cleanupExec()
            throw r3
        L21:
            r2.updateOnBackPressedCallbackEnabled()
            r2.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            r0.burpActive()
            return r3
    }

    void execSingleAction(androidx.fragment.app.FragmentManager.OpGenerator r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 == 0) goto La
            boolean r0 = r1.mDestroyed
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            r1.ensureExecReady(r3)
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r1.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r0 = r1.mTmpIsPop
            boolean r2 = r2.generateOps(r3, r0)
            if (r2 == 0) goto L2b
            r2 = 1
            r1.mExecutingActions = r2
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r2 = r1.mTmpRecords     // Catch: java.lang.Throwable -> L26
            java.util.ArrayList<java.lang.Boolean> r3 = r1.mTmpIsPop     // Catch: java.lang.Throwable -> L26
            r1.removeRedundantOperationsAndExecute(r2, r3)     // Catch: java.lang.Throwable -> L26
            r1.cleanupExec()
            goto L2b
        L26:
            r2 = move-exception
            r1.cleanupExec()
            throw r2
        L2b:
            r1.updateOnBackPressedCallbackEnabled()
            r1.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r2 = r1.mFragmentStore
            r2.burpActive()
            return
    }

    public boolean executePendingTransactions() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.execPendingActions(r0)
            r1.forcePostponedTransactions()
            return r0
    }

    androidx.fragment.app.Fragment findActiveFragment(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findActiveFragment(r2)
            return r2
    }

    public androidx.fragment.app.Fragment findFragmentById(int r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findFragmentById(r2)
            return r2
    }

    public androidx.fragment.app.Fragment findFragmentByTag(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findFragmentByTag(r2)
            return r2
    }

    androidx.fragment.app.Fragment findFragmentByWho(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r2 = r0.findFragmentByWho(r2)
            return r2
    }

    int getActiveFragmentCount() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            int r0 = r0.getActiveFragmentCount()
            return r0
    }

    java.util.List<androidx.fragment.app.Fragment> getActiveFragments() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            java.util.List r0 = r0.getActiveFragments()
            return r0
    }

    public androidx.fragment.app.FragmentManager.BackStackEntry getBackStackEntryAt(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.FragmentManager$BackStackEntry r2 = (androidx.fragment.app.FragmentManager.BackStackEntry) r2
            return r2
    }

    public int getBackStackEntryCount() {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            if (r0 == 0) goto L9
            int r0 = r0.size()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    androidx.fragment.app.FragmentContainer getContainer() {
            r1 = this;
            androidx.fragment.app.FragmentContainer r0 = r1.mContainer
            return r0
    }

    public androidx.fragment.app.Fragment getFragment(android.os.Bundle r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r5 = r5.getString(r6)
            if (r5 != 0) goto L8
            r5 = 0
            return r5
        L8:
            androidx.fragment.app.Fragment r0 = r4.findActiveFragment(r5)
            if (r0 != 0) goto L2f
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fragment no longer exists for key "
            r2.<init>(r3)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r2 = ": unique id "
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            r4.throwException(r1)
        L2f:
            return r0
    }

    public androidx.fragment.app.FragmentFactory getFragmentFactory() {
            r1 = this;
            androidx.fragment.app.FragmentFactory r0 = r1.mFragmentFactory
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.fragment.app.Fragment r0 = r1.mParent
            if (r0 == 0) goto L10
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.FragmentFactory r0 = r0.getFragmentFactory()
            return r0
        L10:
            androidx.fragment.app.FragmentFactory r0 = r1.mHostFragmentFactory
            return r0
    }

    androidx.fragment.app.FragmentStore getFragmentStore() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            return r0
    }

    public java.util.List<androidx.fragment.app.Fragment> getFragments() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            java.util.List r0 = r0.getFragments()
            return r0
    }

    public androidx.fragment.app.FragmentHostCallback<?> getHost() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            return r0
    }

    android.view.LayoutInflater.Factory2 getLayoutInflaterFactory() {
            r1 = this;
            androidx.fragment.app.FragmentLayoutInflaterFactory r0 = r1.mLayoutInflaterFactory
            return r0
    }

    androidx.fragment.app.FragmentLifecycleCallbacksDispatcher getLifecycleCallbacksDispatcher() {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            return r0
    }

    androidx.fragment.app.Fragment getParent() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mParent
            return r0
    }

    public androidx.fragment.app.Fragment getPrimaryNavigationFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mPrimaryNav
            return r0
    }

    androidx.fragment.app.SpecialEffectsControllerFactory getSpecialEffectsControllerFactory() {
            r1 = this;
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r1.mSpecialEffectsControllerFactory
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.fragment.app.Fragment r0 = r1.mParent
            if (r0 == 0) goto L10
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r0.getSpecialEffectsControllerFactory()
            return r0
        L10:
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r1.mDefaultSpecialEffectsControllerFactory
            return r0
    }

    public androidx.fragment.app.strictmode.FragmentStrictMode.Policy getStrictModePolicy() {
            r1 = this;
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r0 = r1.mStrictModePolicy
            return r0
    }

    androidx.lifecycle.ViewModelStore getViewModelStore(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            androidx.lifecycle.ViewModelStore r2 = r0.getViewModelStore(r2)
            return r2
    }

    void handleOnBackPressed() {
            r1 = this;
            r0 = 1
            r1.execPendingActions(r0)
            androidx.activity.OnBackPressedCallback r0 = r1.mOnBackPressedCallback
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L10
            r1.popBackStackImmediate()
            goto L15
        L10:
            androidx.activity.OnBackPressedDispatcher r0 = r1.mOnBackPressedDispatcher
            r0.onBackPressed()
        L15:
            return
    }

    void hideFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "hide: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1b:
            boolean r0 = r3.mHidden
            if (r0 != 0) goto L2a
            r0 = 1
            r3.mHidden = r0
            boolean r1 = r3.mHiddenChanged
            r0 = r0 ^ r1
            r3.mHiddenChanged = r0
            r2.setVisibleRemovingFragment(r3)
        L2a:
            return
    }

    void invalidateMenuForFragment(androidx.fragment.app.Fragment r2) {
            r1 = this;
            boolean r0 = r2.mAdded
            if (r0 == 0) goto Ld
            boolean r2 = r1.isMenuAvailable(r2)
            if (r2 == 0) goto Ld
            r2 = 1
            r1.mNeedMenuInvalidate = r2
        Ld:
            return
    }

    public boolean isDestroyed() {
            r1 = this;
            boolean r0 = r1.mDestroyed
            return r0
    }

    boolean isParentHidden(androidx.fragment.app.Fragment r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r1 = r1.isHidden()
            return r1
    }

    boolean isParentMenuVisible(androidx.fragment.app.Fragment r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 1
            return r1
        L4:
            boolean r1 = r1.isMenuVisible()
            return r1
    }

    boolean isPrimaryNavigation(androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            androidx.fragment.app.FragmentManager r1 = r4.mFragmentManager
            androidx.fragment.app.Fragment r2 = r1.getPrimaryNavigationFragment()
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L19
            androidx.fragment.app.Fragment r4 = r1.mParent
            boolean r4 = r3.isPrimaryNavigation(r4)
            if (r4 == 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    boolean isStateAtLeast(int r2) {
            r1 = this;
            int r0 = r1.mCurState
            if (r0 < r2) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            return r2
    }

    public boolean isStateSaved() {
            r1 = this;
            boolean r0 = r1.mStateSaved
            if (r0 != 0) goto Lb
            boolean r0 = r1.mStopped
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    /* JADX INFO: renamed from: lambda$attachController$4$androidx-fragment-app-FragmentManager, reason: not valid java name */
    /* synthetic */ android.os.Bundle m56lambda$attachController$4$androidxfragmentappFragmentManager() {
            r1 = this;
            android.os.Bundle r0 = r1.saveAllStateInternal()
            return r0
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-fragment-app-FragmentManager, reason: not valid java name */
    /* synthetic */ void m57lambda$new$0$androidxfragmentappFragmentManager(android.content.res.Configuration r2) {
            r1 = this;
            boolean r0 = r1.isParentAdded()
            if (r0 == 0) goto La
            r0 = 0
            r1.dispatchConfigurationChanged(r2, r0)
        La:
            return
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-fragment-app-FragmentManager, reason: not valid java name */
    /* synthetic */ void m58lambda$new$1$androidxfragmentappFragmentManager(java.lang.Integer r2) {
            r1 = this;
            boolean r0 = r1.isParentAdded()
            if (r0 == 0) goto L12
            int r2 = r2.intValue()
            r0 = 80
            if (r2 != r0) goto L12
            r2 = 0
            r1.dispatchLowMemory(r2)
        L12:
            return
    }

    /* JADX INFO: renamed from: lambda$new$2$androidx-fragment-app-FragmentManager, reason: not valid java name */
    /* synthetic */ void m59lambda$new$2$androidxfragmentappFragmentManager(androidx.core.app.MultiWindowModeChangedInfo r2) {
            r1 = this;
            boolean r0 = r1.isParentAdded()
            if (r0 == 0) goto Le
            boolean r2 = r2.isInMultiWindowMode()
            r0 = 0
            r1.dispatchMultiWindowModeChanged(r2, r0)
        Le:
            return
    }

    /* JADX INFO: renamed from: lambda$new$3$androidx-fragment-app-FragmentManager, reason: not valid java name */
    /* synthetic */ void m60lambda$new$3$androidxfragmentappFragmentManager(androidx.core.app.PictureInPictureModeChangedInfo r2) {
            r1 = this;
            boolean r0 = r1.isParentAdded()
            if (r0 == 0) goto Le
            boolean r2 = r2.isInPictureInPictureMode()
            r0 = 0
            r1.dispatchPictureInPictureModeChanged(r2, r0)
        Le:
            return
    }

    void launchRequestPermissions(androidx.fragment.app.Fragment r2, java.lang.String[] r3, int r4) {
            r1 = this;
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r0 = r1.mRequestPermissions
            if (r0 == 0) goto L16
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r2 = r2.mWho
            r0.<init>(r2, r4)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r2 = r1.mLaunchedFragments
            r2.addLast(r0)
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r2 = r1.mRequestPermissions
            r2.launch(r3)
            goto L1b
        L16:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            r0.onRequestPermissionsFromFragment(r2, r3, r4)
        L1b:
            return
    }

    void launchStartActivityForResult(androidx.fragment.app.Fragment r2, android.content.Intent r3, int r4, android.os.Bundle r5) {
            r1 = this;
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r1.mStartActivityForResult
            if (r0 == 0) goto L1f
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r2 = r2.mWho
            r0.<init>(r2, r4)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r2 = r1.mLaunchedFragments
            r2.addLast(r0)
            if (r3 == 0) goto L19
            if (r5 == 0) goto L19
            java.lang.String r2 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r3.putExtra(r2, r5)
        L19:
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r2 = r1.mStartActivityForResult
            r2.launch(r3)
            goto L24
        L1f:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            r0.onStartActivityFromFragment(r2, r3, r4, r5)
        L24:
            return
    }

    void launchStartIntentSenderForResult(androidx.fragment.app.Fragment r12, android.content.IntentSender r13, int r14, android.content.Intent r15, int r16, int r17, int r18, android.os.Bundle r19) throws android.content.IntentSender.SendIntentException {
            r11 = this;
            r0 = r11
            r2 = r12
            r9 = r19
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r1 = r0.mStartIntentSenderForResult
            if (r1 == 0) goto L96
            java.lang.String r1 = "FragmentManager"
            r3 = 2
            if (r9 == 0) goto L4e
            if (r15 != 0) goto L1b
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r5 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
            r6 = 1
            r4.putExtra(r5, r6)
            goto L1c
        L1b:
            r4 = r15
        L1c:
            boolean r5 = isLoggingEnabled(r3)
            if (r5 == 0) goto L48
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "ActivityOptions "
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r9)
            java.lang.String r6 = " were added to fillInIntent "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r6 = " for fragment "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r12)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r1, r5)
        L48:
            java.lang.String r5 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r4.putExtra(r5, r9)
            goto L4f
        L4e:
            r4 = r15
        L4f:
            androidx.activity.result.IntentSenderRequest$Builder r5 = new androidx.activity.result.IntentSenderRequest$Builder
            r6 = r13
            r5.<init>(r13)
            androidx.activity.result.IntentSenderRequest$Builder r4 = r5.setFillInIntent(r4)
            r7 = r16
            r8 = r17
            androidx.activity.result.IntentSenderRequest$Builder r4 = r4.setFlags(r8, r7)
            androidx.activity.result.IntentSenderRequest r4 = r4.build()
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r5 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r6 = r2.mWho
            r10 = r14
            r5.<init>(r6, r14)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r6 = r0.mLaunchedFragments
            r6.addLast(r5)
            boolean r3 = isLoggingEnabled(r3)
            if (r3 == 0) goto L90
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Fragment "
            r3.<init>(r5)
            java.lang.StringBuilder r2 = r3.append(r12)
            java.lang.String r3 = "is launching an IntentSender for result "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r1, r2)
        L90:
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r1 = r0.mStartIntentSenderForResult
            r1.launch(r4)
            goto Lad
        L96:
            r6 = r13
            r10 = r14
            r7 = r16
            r8 = r17
            androidx.fragment.app.FragmentHostCallback<?> r1 = r0.mHost
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r1.onStartIntentSenderFromFragment(r2, r3, r4, r5, r6, r7, r8, r9)
        Lad:
            return
    }

    void moveToState(int r2, boolean r3) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 != 0) goto L10
            r0 = -1
            if (r2 != r0) goto L8
            goto L10
        L8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "No activity"
            r2.<init>(r3)
            throw r2
        L10:
            if (r3 != 0) goto L17
            int r3 = r1.mCurState
            if (r2 != r3) goto L17
            return
        L17:
            r1.mCurState = r2
            androidx.fragment.app.FragmentStore r2 = r1.mFragmentStore
            r2.moveToExpectedState()
            r1.startPendingDeferredFragments()
            boolean r2 = r1.mNeedMenuInvalidate
            if (r2 == 0) goto L34
            androidx.fragment.app.FragmentHostCallback<?> r2 = r1.mHost
            if (r2 == 0) goto L34
            int r3 = r1.mCurState
            r0 = 7
            if (r3 != r0) goto L34
            r2.onSupportInvalidateOptionsMenu()
            r2 = 0
            r1.mNeedMenuInvalidate = r2
        L34:
            return
    }

    void noteStateNotSaved() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L19
            r1.noteStateNotSaved()
            goto L19
        L2b:
            return
    }

    void onContainerAvailable(androidx.fragment.app.FragmentContainerView r6) {
            r5 = this;
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            int r3 = r2.mContainerId
            int r4 = r6.getId()
            if (r3 != r4) goto La
            android.view.View r3 = r2.mView
            if (r3 == 0) goto La
            android.view.View r3 = r2.mView
            android.view.ViewParent r3 = r3.getParent()
            if (r3 != 0) goto La
            r2.mContainer = r6
            r1.addViewToContainer()
            goto La
        L34:
            return
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction openTransaction() {
            r1 = this;
            androidx.fragment.app.FragmentTransaction r0 = r1.beginTransaction()
            return r0
    }

    void performPendingDeferredStart(androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r3.getFragment()
            boolean r1 = r0.mDeferStart
            if (r1 == 0) goto L16
            boolean r1 = r2.mExecutingActions
            if (r1 == 0) goto L10
            r3 = 1
            r2.mHavePendingDeferredStart = r3
            return
        L10:
            r1 = 0
            r0.mDeferStart = r1
            r3.moveToExpectedState()
        L16:
            return
    }

    public void popBackStack() {
            r4 = this;
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = 0
            r2 = -1
            r3 = 0
            r0.<init>(r4, r1, r2, r3)
            r4.enqueueAction(r0, r3)
            return
    }

    public void popBackStack(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.popBackStack(r2, r3, r0)
            return
    }

    void popBackStack(int r3, int r4, boolean r5) {
            r2 = this;
            if (r3 < 0) goto Lc
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = 0
            r0.<init>(r2, r1, r3, r4)
            r2.enqueueAction(r0, r5)
            return
        Lc:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Bad id: "
            r5.<init>(r0)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public void popBackStack(java.lang.String r3, int r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = -1
            r0.<init>(r2, r3, r1, r4)
            r3 = 0
            r2.enqueueAction(r0, r3)
            return
    }

    public boolean popBackStackImmediate() {
            r3 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            boolean r0 = r3.popBackStackImmediate(r2, r0, r1)
            return r0
    }

    public boolean popBackStackImmediate(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto L8
            r0 = 0
            boolean r3 = r2.popBackStackImmediate(r0, r3, r4)
            return r3
        L8:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bad id: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public boolean popBackStackImmediate(java.lang.String r2, int r3) {
            r1 = this;
            r0 = -1
            boolean r2 = r1.popBackStackImmediate(r2, r0, r3)
            return r2
    }

    boolean popBackStackState(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3, java.util.ArrayList<java.lang.Boolean> r4, java.lang.String r5, int r6, int r7) {
            r2 = this;
            r0 = 1
            r7 = r7 & r0
            r1 = 0
            if (r7 == 0) goto L7
            r7 = r0
            goto L8
        L7:
            r7 = r1
        L8:
            int r5 = r2.findBackStackIndex(r5, r6, r7)
            if (r5 >= 0) goto Lf
            return r1
        Lf:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6 = r2.mBackStack
            int r6 = r6.size()
            int r6 = r6 - r0
        L16:
            if (r6 < r5) goto L2d
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7 = r2.mBackStack
            java.lang.Object r7 = r7.remove(r6)
            androidx.fragment.app.BackStackRecord r7 = (androidx.fragment.app.BackStackRecord) r7
            r3.add(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r4.add(r7)
            int r6 = r6 + (-1)
            goto L16
        L2d:
            return r0
    }

    public void putFragment(android.os.Bundle r4, java.lang.String r5, androidx.fragment.app.Fragment r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r6.mFragmentManager
            if (r0 == r3) goto L21
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " is not currently in the FragmentManager"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r3.throwException(r0)
        L21:
            java.lang.String r6 = r6.mWho
            r4.putString(r5, r6)
            return
    }

    public void registerFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r2, boolean r3) {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            r0.registerFragmentLifecycleCallbacks(r2, r3)
            return
    }

    void removeFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "remove: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = " nesting="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.mBackStackNesting
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L27:
            boolean r0 = r3.isInBackStack()
            boolean r1 = r3.mDetached
            if (r1 == 0) goto L31
            if (r0 != 0) goto L44
        L31:
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            r0.removeFragment(r3)
            boolean r0 = r2.isMenuAvailable(r3)
            r1 = 1
            if (r0 == 0) goto L3f
            r2.mNeedMenuInvalidate = r1
        L3f:
            r3.mRemoving = r1
            r2.setVisibleRemovingFragment(r3)
        L44:
            return
    }

    public void removeFragmentOnAttachListener(androidx.fragment.app.FragmentOnAttachListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r1.mOnAttachListeners
            r0.remove(r2)
            return
    }

    public void removeOnBackStackChangedListener(androidx.fragment.app.FragmentManager.OnBackStackChangedListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    void removeRetainedFragment(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            r0.removeRetainedFragment(r2)
            return
    }

    void restoreAllState(android.os.Parcelable r3, androidx.fragment.app.FragmentManagerNonConfig r4) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            androidx.fragment.app.FragmentManagerViewModel r0 = r2.mNonConfig
            r0.restoreFromSnapshot(r4)
            r2.restoreSaveStateInternal(r3)
            return
    }

    public void restoreBackStack(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentManager$RestoreBackStackState r0 = new androidx.fragment.app.FragmentManager$RestoreBackStackState
            r0.<init>(r1, r2)
            r2 = 0
            r1.enqueueAction(r0, r2)
            return
    }

    boolean restoreBackStackState(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7, java.util.ArrayList<java.lang.Boolean> r8, java.lang.String r9) {
            r6 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r0 = r6.mBackStackStates
            java.lang.Object r9 = r0.remove(r9)
            androidx.fragment.app.BackStackState r9 = (androidx.fragment.app.BackStackState) r9
            r0 = 0
            if (r9 != 0) goto Lc
            return r0
        Lc:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            boolean r4 = r3.mBeingSaved
            if (r4 == 0) goto L15
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r3.mOps
            java.util.Iterator r3 = r3.iterator()
        L2b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L15
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.FragmentTransaction$Op r4 = (androidx.fragment.app.FragmentTransaction.Op) r4
            androidx.fragment.app.Fragment r5 = r4.mFragment
            if (r5 == 0) goto L2b
            androidx.fragment.app.Fragment r5 = r4.mFragment
            java.lang.String r5 = r5.mWho
            androidx.fragment.app.Fragment r4 = r4.mFragment
            r1.put(r5, r4)
            goto L2b
        L45:
            java.util.List r9 = r9.instantiate(r6, r1)
            java.util.Iterator r9 = r9.iterator()
        L4d:
            r1 = r0
        L4e:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r9.next()
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            boolean r2 = r2.generateOps(r7, r8)
            if (r2 != 0) goto L62
            if (r1 == 0) goto L4d
        L62:
            r1 = 1
            goto L4e
        L64:
            return r1
    }

    void restoreSaveState(android.os.Parcelable r3) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.savedstate.SavedStateRegistryOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            r2.restoreSaveStateInternal(r3)
            return
    }

    void restoreSaveStateInternal(android.os.Parcelable r14) {
            r13 = this;
            if (r14 != 0) goto L3
            return
        L3:
            android.os.Bundle r14 = (android.os.Bundle) r14
            java.util.Set r0 = r14.keySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "result_"
            boolean r3 = r1.startsWith(r2)
            if (r3 == 0) goto Ld
            android.os.Bundle r3 = r14.getBundle(r1)
            if (r3 == 0) goto Ld
            androidx.fragment.app.FragmentHostCallback<?> r4 = r13.mHost
            android.content.Context r4 = r4.getContext()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r3.setClassLoader(r4)
            int r2 = r2.length()
            java.lang.String r1 = r1.substring(r2)
            java.util.Map<java.lang.String, android.os.Bundle> r2 = r13.mResults
            r2.put(r1, r3)
            goto Ld
        L42:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r1 = r14.keySet()
            java.util.Iterator r1 = r1.iterator()
        L4f:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "state"
            if (r2 == 0) goto L82
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "fragment_"
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto L4f
            android.os.Bundle r2 = r14.getBundle(r2)
            if (r2 == 0) goto L4f
            androidx.fragment.app.FragmentHostCallback<?> r4 = r13.mHost
            android.content.Context r4 = r4.getContext()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r2.setClassLoader(r4)
            android.os.Parcelable r2 = r2.getParcelable(r3)
            androidx.fragment.app.FragmentState r2 = (androidx.fragment.app.FragmentState) r2
            r0.add(r2)
            goto L4f
        L82:
            androidx.fragment.app.FragmentStore r1 = r13.mFragmentStore
            r1.restoreSaveState(r0)
            android.os.Parcelable r14 = r14.getParcelable(r3)
            androidx.fragment.app.FragmentManagerState r14 = (androidx.fragment.app.FragmentManagerState) r14
            if (r14 != 0) goto L90
            return
        L90:
            androidx.fragment.app.FragmentStore r0 = r13.mFragmentStore
            r0.resetActiveFragments()
            java.util.ArrayList<java.lang.String> r0 = r14.mActive
            java.util.Iterator r0 = r0.iterator()
        L9b:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "): "
            r3 = 0
            r4 = 2
            java.lang.String r5 = "FragmentManager"
            if (r1 == 0) goto L13a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            androidx.fragment.app.FragmentStore r6 = r13.mFragmentStore
            androidx.fragment.app.FragmentState r12 = r6.setSavedState(r1, r3)
            if (r12 == 0) goto L9b
            androidx.fragment.app.FragmentManagerViewModel r1 = r13.mNonConfig
            java.lang.String r3 = r12.mWho
            androidx.fragment.app.Fragment r1 = r1.findRetainedFragmentByWho(r3)
            if (r1 == 0) goto Le1
            boolean r3 = isLoggingEnabled(r4)
            if (r3 == 0) goto Ld7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "restoreSaveState: re-attaching retained "
            r3.<init>(r6)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r5, r3)
        Ld7:
            androidx.fragment.app.FragmentStateManager r3 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r6 = r13.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r7 = r13.mFragmentStore
            r3.<init>(r6, r7, r1, r12)
            goto Lf9
        Le1:
            androidx.fragment.app.FragmentStateManager r3 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r8 = r13.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r9 = r13.mFragmentStore
            androidx.fragment.app.FragmentHostCallback<?> r1 = r13.mHost
            android.content.Context r1 = r1.getContext()
            java.lang.ClassLoader r10 = r1.getClassLoader()
            androidx.fragment.app.FragmentFactory r11 = r13.getFragmentFactory()
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12)
        Lf9:
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            r1.mFragmentManager = r13
            boolean r4 = isLoggingEnabled(r4)
            if (r4 == 0) goto L121
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "restoreSaveState: active ("
            r4.<init>(r6)
            java.lang.String r6 = r1.mWho
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r5, r1)
        L121:
            androidx.fragment.app.FragmentHostCallback<?> r1 = r13.mHost
            android.content.Context r1 = r1.getContext()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r3.restoreState(r1)
            androidx.fragment.app.FragmentStore r1 = r13.mFragmentStore
            r1.makeActive(r3)
            int r1 = r13.mCurState
            r3.setFragmentManagerState(r1)
            goto L9b
        L13a:
            androidx.fragment.app.FragmentManagerViewModel r0 = r13.mNonConfig
            java.util.Collection r0 = r0.getRetainedFragments()
            java.util.Iterator r0 = r0.iterator()
        L144:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19b
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.FragmentStore r6 = r13.mFragmentStore
            java.lang.String r7 = r1.mWho
            boolean r6 = r6.containsActiveFragment(r7)
            if (r6 != 0) goto L144
            boolean r6 = isLoggingEnabled(r4)
            if (r6 == 0) goto L17e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Discarding retained Fragment "
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r7 = " that was not found in the set of active Fragments "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.util.ArrayList<java.lang.String> r7 = r14.mActive
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r5, r6)
        L17e:
            androidx.fragment.app.FragmentManagerViewModel r6 = r13.mNonConfig
            r6.removeRetainedFragment(r1)
            r1.mFragmentManager = r13
            androidx.fragment.app.FragmentStateManager r6 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r7 = r13.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r8 = r13.mFragmentStore
            r6.<init>(r7, r8, r1)
            r7 = 1
            r6.setFragmentManagerState(r7)
            r6.moveToExpectedState()
            r1.mRemoving = r7
            r6.moveToExpectedState()
            goto L144
        L19b:
            androidx.fragment.app.FragmentStore r0 = r13.mFragmentStore
            java.util.ArrayList<java.lang.String> r1 = r14.mAdded
            r0.restoreAddedFragments(r1)
            androidx.fragment.app.BackStackRecordState[] r0 = r14.mBackStack
            r1 = 0
            if (r0 == 0) goto L205
            java.util.ArrayList r0 = new java.util.ArrayList
            androidx.fragment.app.BackStackRecordState[] r3 = r14.mBackStack
            int r3 = r3.length
            r0.<init>(r3)
            r13.mBackStack = r0
            r0 = r1
        L1b2:
            androidx.fragment.app.BackStackRecordState[] r3 = r14.mBackStack
            int r3 = r3.length
            if (r0 >= r3) goto L207
            androidx.fragment.app.BackStackRecordState[] r3 = r14.mBackStack
            r3 = r3[r0]
            androidx.fragment.app.BackStackRecord r3 = r3.instantiate(r13)
            boolean r6 = isLoggingEnabled(r4)
            if (r6 == 0) goto L1fd
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "restoreAllState: back stack #"
            r6.<init>(r7)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r7 = " (index "
            java.lang.StringBuilder r6 = r6.append(r7)
            int r7 = r3.mIndex
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r5, r6)
            androidx.fragment.app.LogWriter r6 = new androidx.fragment.app.LogWriter
            r6.<init>(r5)
            java.io.PrintWriter r7 = new java.io.PrintWriter
            r7.<init>(r6)
            java.lang.String r6 = "  "
            r3.dump(r6, r7, r1)
            r7.close()
        L1fd:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6 = r13.mBackStack
            r6.add(r3)
            int r0 = r0 + 1
            goto L1b2
        L205:
            r13.mBackStack = r3
        L207:
            java.util.concurrent.atomic.AtomicInteger r0 = r13.mBackStackIndex
            int r2 = r14.mBackStackIndex
            r0.set(r2)
            java.lang.String r0 = r14.mPrimaryNavActiveWho
            if (r0 == 0) goto L21d
            java.lang.String r0 = r14.mPrimaryNavActiveWho
            androidx.fragment.app.Fragment r0 = r13.findActiveFragment(r0)
            r13.mPrimaryNav = r0
            r13.dispatchParentPrimaryNavigationFragmentChanged(r0)
        L21d:
            java.util.ArrayList<java.lang.String> r0 = r14.mBackStackStateKeys
            if (r0 == 0) goto L23d
        L221:
            int r2 = r0.size()
            if (r1 >= r2) goto L23d
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r2 = r13.mBackStackStates
            java.lang.Object r3 = r0.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            java.util.ArrayList<androidx.fragment.app.BackStackState> r4 = r14.mBackStackStates
            java.lang.Object r4 = r4.get(r1)
            androidx.fragment.app.BackStackState r4 = (androidx.fragment.app.BackStackState) r4
            r2.put(r3, r4)
            int r1 = r1 + 1
            goto L221
        L23d:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            java.util.ArrayList<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r14 = r14.mLaunchedFragments
            r0.<init>(r14)
            r13.mLaunchedFragments = r0
            return
    }

    @java.lang.Deprecated
    androidx.fragment.app.FragmentManagerNonConfig retainNonConfig() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            androidx.fragment.app.FragmentManagerViewModel r0 = r2.mNonConfig
            androidx.fragment.app.FragmentManagerNonConfig r0 = r0.getSnapshot()
            return r0
    }

    android.os.Parcelable saveAllState() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.savedstate.SavedStateRegistryOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            android.os.Bundle r0 = r2.saveAllStateInternal()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1b
            r0 = 0
        L1b:
            return r0
    }

    android.os.Bundle saveAllStateInternal() {
            r11 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r11.forcePostponedTransactions()
            r11.endAnimatingAwayFragments()
            r1 = 1
            r11.execPendingActions(r1)
            r11.mStateSaved = r1
            androidx.fragment.app.FragmentManagerViewModel r2 = r11.mNonConfig
            r2.setIsStateSaved(r1)
            androidx.fragment.app.FragmentStore r1 = r11.mFragmentStore
            java.util.ArrayList r1 = r1.saveActiveFragments()
            androidx.fragment.app.FragmentStore r2 = r11.mFragmentStore
            java.util.ArrayList r2 = r2.getAllSavedState()
            boolean r3 = r2.isEmpty()
            java.lang.String r4 = "FragmentManager"
            r5 = 2
            if (r3 == 0) goto L38
            boolean r1 = isLoggingEnabled(r5)
            if (r1 == 0) goto L125
            java.lang.String r1 = "saveAllState: no fragments!"
            android.util.Log.v(r4, r1)
            goto L125
        L38:
            androidx.fragment.app.FragmentStore r3 = r11.mFragmentStore
            java.util.ArrayList r3 = r3.saveAddedFragments()
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6 = r11.mBackStack
            if (r6 == 0) goto L87
            int r6 = r6.size()
            if (r6 <= 0) goto L87
            androidx.fragment.app.BackStackRecordState[] r7 = new androidx.fragment.app.BackStackRecordState[r6]
            r8 = 0
        L4b:
            if (r8 >= r6) goto L88
            androidx.fragment.app.BackStackRecordState r9 = new androidx.fragment.app.BackStackRecordState
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10 = r11.mBackStack
            java.lang.Object r10 = r10.get(r8)
            androidx.fragment.app.BackStackRecord r10 = (androidx.fragment.app.BackStackRecord) r10
            r9.<init>(r10)
            r7[r8] = r9
            boolean r9 = isLoggingEnabled(r5)
            if (r9 == 0) goto L84
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "saveAllState: adding back stack #"
            r9.<init>(r10)
            java.lang.StringBuilder r9 = r9.append(r8)
            java.lang.String r10 = ": "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10 = r11.mBackStack
            java.lang.Object r10 = r10.get(r8)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r4, r9)
        L84:
            int r8 = r8 + 1
            goto L4b
        L87:
            r7 = 0
        L88:
            androidx.fragment.app.FragmentManagerState r4 = new androidx.fragment.app.FragmentManagerState
            r4.<init>()
            r4.mActive = r1
            r4.mAdded = r3
            r4.mBackStack = r7
            java.util.concurrent.atomic.AtomicInteger r1 = r11.mBackStackIndex
            int r1 = r1.get()
            r4.mBackStackIndex = r1
            androidx.fragment.app.Fragment r1 = r11.mPrimaryNav
            if (r1 == 0) goto La3
            java.lang.String r1 = r1.mWho
            r4.mPrimaryNavActiveWho = r1
        La3:
            java.util.ArrayList<java.lang.String> r1 = r4.mBackStackStateKeys
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r3 = r11.mBackStackStates
            java.util.Set r3 = r3.keySet()
            r1.addAll(r3)
            java.util.ArrayList<androidx.fragment.app.BackStackState> r1 = r4.mBackStackStates
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r3 = r11.mBackStackStates
            java.util.Collection r3 = r3.values()
            r1.addAll(r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r3 = r11.mLaunchedFragments
            r1.<init>(r3)
            r4.mLaunchedFragments = r1
            java.lang.String r1 = "state"
            r0.putParcelable(r1, r4)
            java.util.Map<java.lang.String, android.os.Bundle> r3 = r11.mResults
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        Ld1:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lf8
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "result_"
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.util.Map<java.lang.String, android.os.Bundle> r6 = r11.mResults
            java.lang.Object r4 = r6.get(r4)
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0.putBundle(r5, r4)
            goto Ld1
        Lf8:
            java.util.Iterator r2 = r2.iterator()
        Lfc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L125
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.FragmentState r3 = (androidx.fragment.app.FragmentState) r3
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r4.putParcelable(r1, r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "fragment_"
            r5.<init>(r6)
            java.lang.String r3 = r3.mWho
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            r0.putBundle(r3, r4)
            goto Lfc
        L125:
            return r0
    }

    public void saveBackStack(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentManager$SaveBackStackState r0 = new androidx.fragment.app.FragmentManager$SaveBackStackState
            r0.<init>(r1, r2)
            r2 = 0
            r1.enqueueAction(r0, r2)
            return
    }

    boolean saveBackStackState(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r17, java.util.ArrayList<java.lang.Boolean> r18, java.lang.String r19) {
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = -1
            r3 = 1
            int r2 = r0.findBackStackIndex(r1, r2, r3)
            if (r2 >= 0) goto Le
            r1 = 0
            return r1
        Le:
            r4 = r2
        Lf:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5 = r0.mBackStack
            int r5 = r5.size()
            java.lang.String r6 = "saveBackStack(\""
            if (r4 >= r5) goto L4d
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5 = r0.mBackStack
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.BackStackRecord r5 = (androidx.fragment.app.BackStackRecord) r5
            boolean r7 = r5.mReorderingAllowed
            if (r7 != 0) goto L4a
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.StringBuilder r6 = r8.append(r1)
            java.lang.String r8 = "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found "
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r6 = " that did not use setReorderingAllowed(true)."
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r7.<init>(r5)
            r0.throwException(r7)
        L4a:
            int r4 = r4 + 1
            goto Lf
        L4d:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r5 = r2
        L53:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7 = r0.mBackStack
            int r7 = r7.size()
            if (r5 >= r7) goto L112
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7 = r0.mBackStack
            java.lang.Object r7 = r7.get(r5)
            androidx.fragment.app.BackStackRecord r7 = (androidx.fragment.app.BackStackRecord) r7
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r10 = r7.mOps
            java.util.Iterator r10 = r10.iterator()
        L73:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto La9
            java.lang.Object r11 = r10.next()
            androidx.fragment.app.FragmentTransaction$Op r11 = (androidx.fragment.app.FragmentTransaction.Op) r11
            androidx.fragment.app.Fragment r12 = r11.mFragment
            if (r12 != 0) goto L84
            goto L73
        L84:
            boolean r13 = r11.mFromExpandedOp
            r14 = 2
            if (r13 == 0) goto L97
            int r13 = r11.mCmd
            if (r13 == r3) goto L97
            int r13 = r11.mCmd
            if (r13 == r14) goto L97
            int r13 = r11.mCmd
            r15 = 8
            if (r13 != r15) goto L9d
        L97:
            r4.add(r12)
            r8.add(r12)
        L9d:
            int r13 = r11.mCmd
            if (r13 == r3) goto La5
            int r11 = r11.mCmd
            if (r11 != r14) goto L73
        La5:
            r9.add(r12)
            goto L73
        La9:
            r8.removeAll(r9)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L10e
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            java.lang.StringBuilder r10 = r10.append(r1)
            java.lang.String r11 = "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment"
            java.lang.StringBuilder r10 = r10.append(r11)
            int r11 = r8.size()
            if (r11 != r3) goto Le1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = " "
            r11.<init>(r12)
            java.util.Iterator r8 = r8.iterator()
            java.lang.Object r8 = r8.next()
            java.lang.StringBuilder r8 = r11.append(r8)
            java.lang.String r8 = r8.toString()
            goto Lf0
        Le1:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "s "
            r11.<init>(r12)
            java.lang.StringBuilder r8 = r11.append(r8)
            java.lang.String r8 = r8.toString()
        Lf0:
            java.lang.StringBuilder r8 = r10.append(r8)
            java.lang.String r10 = " in "
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r8 = " that were previously added to the FragmentManager through a separate FragmentTransaction."
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r9.<init>(r7)
            r0.throwException(r9)
        L10e:
            int r5 = r5 + 1
            goto L53
        L112:
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            r5.<init>(r4)
        L117:
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L177
            java.lang.Object r7 = r5.removeFirst()
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            boolean r8 = r7.mRetainInstance
            if (r8 == 0) goto L15b
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            java.lang.StringBuilder r9 = r9.append(r1)
            java.lang.String r10 = "\") must not contain retained fragments. Found "
            java.lang.StringBuilder r9 = r9.append(r10)
            boolean r10 = r4.contains(r7)
            if (r10 == 0) goto L141
            java.lang.String r10 = "direct reference to retained "
            goto L143
        L141:
            java.lang.String r10 = "retained child "
        L143:
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = "fragment "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r7)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            r0.throwException(r8)
        L15b:
            androidx.fragment.app.FragmentManager r7 = r7.mChildFragmentManager
            java.util.List r7 = r7.getActiveFragments()
            java.util.Iterator r7 = r7.iterator()
        L165:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L117
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            if (r8 == 0) goto L165
            r5.addLast(r8)
            goto L165
        L177:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L180:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L192
            java.lang.Object r6 = r4.next()
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            java.lang.String r6 = r6.mWho
            r5.add(r6)
            goto L180
        L192:
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6 = r0.mBackStack
            int r6 = r6.size()
            int r6 = r6 - r2
            r4.<init>(r6)
            r6 = r2
        L19f:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7 = r0.mBackStack
            int r7 = r7.size()
            if (r6 >= r7) goto L1ae
            r7 = 0
            r4.add(r7)
            int r6 = r6 + 1
            goto L19f
        L1ae:
            androidx.fragment.app.BackStackState r6 = new androidx.fragment.app.BackStackState
            r6.<init>(r5, r4)
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5 = r0.mBackStack
            int r5 = r5.size()
            int r5 = r5 - r3
        L1ba:
            if (r5 < r2) goto L1e9
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7 = r0.mBackStack
            java.lang.Object r7 = r7.remove(r5)
            androidx.fragment.app.BackStackRecord r7 = (androidx.fragment.app.BackStackRecord) r7
            androidx.fragment.app.BackStackRecord r8 = new androidx.fragment.app.BackStackRecord
            r8.<init>(r7)
            r8.collapseOps()
            androidx.fragment.app.BackStackRecordState r9 = new androidx.fragment.app.BackStackRecordState
            r9.<init>(r8)
            int r8 = r5 - r2
            r4.set(r8, r9)
            r7.mBeingSaved = r3
            r8 = r17
            r8.add(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            r9 = r18
            r9.add(r7)
            int r5 = r5 + (-1)
            goto L1ba
        L1e9:
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r2 = r0.mBackStackStates
            r2.put(r1, r6)
            return r3
    }

    public androidx.fragment.app.Fragment.SavedState saveFragmentInstanceState(androidx.fragment.app.Fragment r5) {
            r4 = this;
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.lang.String r1 = r5.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment r1 = r0.getFragment()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L31
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fragment "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = " is not currently in the FragmentManager"
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            r4.throwException(r1)
        L31:
            androidx.fragment.app.Fragment$SavedState r5 = r0.saveInstanceState()
            return r5
    }

    void scheduleCommit() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r3.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r3.mPendingActions     // Catch: java.lang.Throwable -> L27
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L27
            r2 = 1
            if (r1 != r2) goto L25
            androidx.fragment.app.FragmentHostCallback<?> r1 = r3.mHost     // Catch: java.lang.Throwable -> L27
            android.os.Handler r1 = r1.getHandler()     // Catch: java.lang.Throwable -> L27
            java.lang.Runnable r2 = r3.mExecCommit     // Catch: java.lang.Throwable -> L27
            r1.removeCallbacks(r2)     // Catch: java.lang.Throwable -> L27
            androidx.fragment.app.FragmentHostCallback<?> r1 = r3.mHost     // Catch: java.lang.Throwable -> L27
            android.os.Handler r1 = r1.getHandler()     // Catch: java.lang.Throwable -> L27
            java.lang.Runnable r2 = r3.mExecCommit     // Catch: java.lang.Throwable -> L27
            r1.post(r2)     // Catch: java.lang.Throwable -> L27
            r3.updateOnBackPressedCallbackEnabled()     // Catch: java.lang.Throwable -> L27
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r1
    }

    void setExitAnimationOrder(androidx.fragment.app.Fragment r2, boolean r3) {
            r1 = this;
            android.view.ViewGroup r2 = r1.getFragmentContainer(r2)
            if (r2 == 0) goto L11
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentContainerView
            if (r0 == 0) goto L11
            androidx.fragment.app.FragmentContainerView r2 = (androidx.fragment.app.FragmentContainerView) r2
            r3 = r3 ^ 1
            r2.setDrawDisappearingViewsLast(r3)
        L11:
            return
    }

    public void setFragmentFactory(androidx.fragment.app.FragmentFactory r1) {
            r0 = this;
            r0.mFragmentFactory = r1
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResult(java.lang.String r3, android.os.Bundle r4) {
            r2 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r2.mResultListeners
            java.lang.Object r0 = r0.get(r3)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r0 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r0
            if (r0 == 0) goto L16
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r0.isAtLeast(r1)
            if (r1 == 0) goto L16
            r0.onFragmentResult(r3, r4)
            goto L1b
        L16:
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r2.mResults
            r0.put(r3, r4)
        L1b:
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Setting fragment result with key "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " and result "
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
        L40:
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResultListener(java.lang.String r4, androidx.lifecycle.LifecycleOwner r5, androidx.fragment.app.FragmentResultListener r6) {
            r3 = this;
            androidx.lifecycle.Lifecycle r5 = r5.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r5.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto Ld
            return
        Ld:
            androidx.fragment.app.FragmentManager$6 r0 = new androidx.fragment.app.FragmentManager$6
            r0.<init>(r3, r4, r6, r5)
            r5.addObserver(r0)
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r1 = r3.mResultListeners
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r2 = new androidx.fragment.app.FragmentManager$LifecycleAwareResultListener
            r2.<init>(r5, r6, r0)
            java.lang.Object r0 = r1.put(r4, r2)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r0 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r0
            if (r0 == 0) goto L27
            r0.removeObserver()
        L27:
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L56
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Setting FragmentResultListener with key "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " lifecycleOwner "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " and listener "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "FragmentManager"
            android.util.Log.v(r5, r4)
        L56:
            return
    }

    void setMaxLifecycle(androidx.fragment.app.Fragment r3, androidx.lifecycle.Lifecycle.State r4) {
            r2 = this;
            java.lang.String r0 = r3.mWho
            androidx.fragment.app.Fragment r0 = r2.findActiveFragment(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 != r2) goto L17
        L14:
            r3.mMaxState = r4
            return
        L17:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fragment "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " is not an active fragment of FragmentManager "
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    void setPrimaryNavigationFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            if (r4 == 0) goto L36
            java.lang.String r0 = r4.mWho
            androidx.fragment.app.Fragment r0 = r3.findActiveFragment(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            if (r0 == 0) goto L36
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 != r3) goto L17
            goto L36
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " is not an active fragment of FragmentManager "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L36:
            androidx.fragment.app.Fragment r0 = r3.mPrimaryNav
            r3.mPrimaryNav = r4
            r3.dispatchParentPrimaryNavigationFragmentChanged(r0)
            androidx.fragment.app.Fragment r4 = r3.mPrimaryNav
            r3.dispatchParentPrimaryNavigationFragmentChanged(r4)
            return
    }

    void setSpecialEffectsControllerFactory(androidx.fragment.app.SpecialEffectsControllerFactory r1) {
            r0 = this;
            r0.mSpecialEffectsControllerFactory = r1
            return
    }

    public void setStrictModePolicy(androidx.fragment.app.strictmode.FragmentStrictMode.Policy r1) {
            r0 = this;
            r0.mStrictModePolicy = r1
            return
    }

    void showFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "show: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1b:
            boolean r0 = r3.mHidden
            if (r0 == 0) goto L28
            r0 = 0
            r3.mHidden = r0
            boolean r0 = r3.mHiddenChanged
            r0 = r0 ^ 1
            r3.mHiddenChanged = r0
        L28:
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.mParent
            java.lang.String r2 = "}"
            java.lang.String r3 = "{"
            if (r1 == 0) goto L43
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            androidx.fragment.app.Fragment r1 = r4.mParent
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r0.append(r2)
            goto L6b
        L43:
            androidx.fragment.app.FragmentHostCallback<?> r1 = r4.mHost
            if (r1 == 0) goto L66
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            androidx.fragment.app.FragmentHostCallback<?> r1 = r4.mHost
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r0.append(r2)
            goto L6b
        L66:
            java.lang.String r1 = "null"
            r0.append(r1)
        L6b:
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void unregisterFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r2) {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            r0.unregisterFragmentLifecycleCallbacks(r2)
            return
    }
}
