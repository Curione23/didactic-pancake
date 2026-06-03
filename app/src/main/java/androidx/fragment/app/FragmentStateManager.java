package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentStateManager {
    private static final java.lang.String TAG = "FragmentManager";
    private static final java.lang.String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    private static final java.lang.String TARGET_STATE_TAG = "android:target_state";
    private static final java.lang.String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    private static final java.lang.String VIEW_REGISTRY_STATE_TAG = "android:view_registry_state";
    private static final java.lang.String VIEW_STATE_TAG = "android:view_state";
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher mDispatcher;
    private final androidx.fragment.app.Fragment mFragment;
    private int mFragmentManagerState;
    private final androidx.fragment.app.FragmentStore mFragmentStore;
    private boolean mMovingToState;


    /* JADX INFO: renamed from: androidx.fragment.app.FragmentStateManager$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State = null;

        static {
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State = r0
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2, androidx.fragment.app.FragmentStore r3, androidx.fragment.app.Fragment r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMovingToState = r0
            r0 = -1
            r1.mFragmentManagerState = r0
            r1.mDispatcher = r2
            r1.mFragmentStore = r3
            r1.mFragment = r4
            return
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r3, androidx.fragment.app.FragmentStore r4, androidx.fragment.app.Fragment r5, androidx.fragment.app.FragmentState r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mMovingToState = r0
            r1 = -1
            r2.mFragmentManagerState = r1
            r2.mDispatcher = r3
            r2.mFragmentStore = r4
            r2.mFragment = r5
            r3 = 0
            r5.mSavedViewState = r3
            r5.mSavedViewRegistryState = r3
            r5.mBackStackNesting = r0
            r5.mInLayout = r0
            r5.mAdded = r0
            androidx.fragment.app.Fragment r4 = r5.mTarget
            if (r4 == 0) goto L23
            androidx.fragment.app.Fragment r4 = r5.mTarget
            java.lang.String r4 = r4.mWho
            goto L24
        L23:
            r4 = r3
        L24:
            r5.mTargetWho = r4
            r5.mTarget = r3
            android.os.Bundle r3 = r6.mSavedFragmentState
            if (r3 == 0) goto L31
            android.os.Bundle r3 = r6.mSavedFragmentState
            r5.mSavedFragmentState = r3
            goto L38
        L31:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r5.mSavedFragmentState = r3
        L38:
            return
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2, androidx.fragment.app.FragmentStore r3, java.lang.ClassLoader r4, androidx.fragment.app.FragmentFactory r5, androidx.fragment.app.FragmentState r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMovingToState = r0
            r0 = -1
            r1.mFragmentManagerState = r0
            r1.mDispatcher = r2
            r1.mFragmentStore = r3
            androidx.fragment.app.Fragment r2 = r6.instantiate(r5, r4)
            r1.mFragment = r2
            r3 = 2
            boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r3 == 0) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Instantiated fragment "
            r3.<init>(r4)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L2e:
            return
    }

    private boolean isFragmentViewChild(android.view.View r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.mFragment
            android.view.View r0 = r0.mView
            r1 = 1
            if (r3 != r0) goto L8
            return r1
        L8:
            android.view.ViewParent r3 = r3.getParent()
        Lc:
            if (r3 == 0) goto L1a
            androidx.fragment.app.Fragment r0 = r2.mFragment
            android.view.View r0 = r0.mView
            if (r3 != r0) goto L15
            return r1
        L15:
            android.view.ViewParent r3 = r3.getParent()
            goto Lc
        L1a:
            r3 = 0
            return r3
    }

    private android.os.Bundle saveBasicState() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r1.performSaveInstanceState(r0)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r4.mDispatcher
            androidx.fragment.app.Fragment r2 = r4.mFragment
            r3 = 0
            r1.dispatchOnFragmentSaveInstanceState(r2, r0, r3)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L19
            r0 = 0
        L19:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.view.View r1 = r1.mView
            if (r1 == 0) goto L22
            r4.saveViewState()
        L22:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.util.SparseArray<android.os.Parcelable> r1 = r1.mSavedViewState
            if (r1 == 0) goto L38
            if (r0 != 0) goto L2f
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L2f:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.util.SparseArray<android.os.Parcelable> r1 = r1.mSavedViewState
            java.lang.String r2 = "android:view_state"
            r0.putSparseParcelableArray(r2, r1)
        L38:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedViewRegistryState
            if (r1 == 0) goto L4e
            if (r0 != 0) goto L45
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L45:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedViewRegistryState
            java.lang.String r2 = "android:view_registry_state"
            r0.putBundle(r2, r1)
        L4e:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            boolean r1 = r1.mUserVisibleHint
            if (r1 != 0) goto L64
            if (r0 != 0) goto L5b
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L5b:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            boolean r1 = r1.mUserVisibleHint
            java.lang.String r2 = "android:user_visible_hint"
            r0.putBoolean(r2, r1)
        L64:
            return r0
    }

    void activityCreated() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1d:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.performActivityCreated(r1)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r4.mDispatcher
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r2 = r1.mSavedFragmentState
            r3 = 0
            r0.dispatchOnFragmentActivityCreated(r1, r2, r3)
            return
    }

    void addViewToContainer() {
            r3 = this;
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            androidx.fragment.app.Fragment r1 = r3.mFragment
            int r0 = r0.findFragmentIndexInContainer(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            android.view.ViewGroup r1 = r1.mContainer
            androidx.fragment.app.Fragment r2 = r3.mFragment
            android.view.View r2 = r2.mView
            r1.addView(r2, r0)
            return
    }

    void attach() {
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "moveto ATTACHED: "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r6.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1d:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.Fragment r0 = r0.mTarget
            java.lang.String r1 = " that does not belong to this FragmentManager!"
            java.lang.String r2 = " declared target fragment "
            java.lang.String r3 = "Fragment "
            r4 = 0
            if (r0 == 0) goto L6b
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            androidx.fragment.app.Fragment r5 = r6.mFragment
            androidx.fragment.app.Fragment r5 = r5.mTarget
            java.lang.String r5 = r5.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r5)
            if (r0 == 0) goto L46
            androidx.fragment.app.Fragment r1 = r6.mFragment
            androidx.fragment.app.Fragment r2 = r1.mTarget
            java.lang.String r2 = r2.mWho
            r1.mTargetWho = r2
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r1.mTarget = r4
            r4 = r0
            goto La3
        L46:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            androidx.fragment.app.Fragment r3 = r6.mFragment
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r2 = r3.append(r2)
            androidx.fragment.app.Fragment r3 = r6.mFragment
            androidx.fragment.app.Fragment r3 = r3.mTarget
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L6b:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto La3
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            androidx.fragment.app.Fragment r4 = r6.mFragment
            java.lang.String r4 = r4.mTargetWho
            androidx.fragment.app.FragmentStateManager r4 = r0.getFragmentStateManager(r4)
            if (r4 == 0) goto L7e
            goto La3
        L7e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            androidx.fragment.app.Fragment r3 = r6.mFragment
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.StringBuilder r2 = r3.append(r2)
            androidx.fragment.app.Fragment r3 = r6.mFragment
            java.lang.String r3 = r3.mTargetWho
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La3:
            if (r4 == 0) goto La8
            r4.moveToExpectedState()
        La8:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r1 = r1.getHost()
            r0.mHost = r1
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            androidx.fragment.app.Fragment r1 = r1.getParent()
            r0.mParentFragment = r1
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r6.mDispatcher
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r2 = 0
            r0.dispatchOnFragmentPreAttached(r1, r2)
            androidx.fragment.app.Fragment r0 = r6.mFragment
            r0.performAttach()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r6.mDispatcher
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r0.dispatchOnFragmentAttached(r1, r2)
            return
    }

    int computeExpectedState() {
            r9 = this;
            androidx.fragment.app.Fragment r0 = r9.mFragment
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            if (r0 != 0) goto Lb
            androidx.fragment.app.Fragment r0 = r9.mFragment
            int r0 = r0.mState
            return r0
        Lb:
            int r0 = r9.mFragmentManagerState
            int[] r1 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State
            androidx.fragment.app.Fragment r2 = r9.mFragment
            androidx.lifecycle.Lifecycle$State r2 = r2.mMaxState
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = -1
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 == r7) goto L3b
            if (r1 == r6) goto L37
            if (r1 == r4) goto L32
            if (r1 == r5) goto L2c
            int r0 = java.lang.Math.min(r0, r2)
            goto L3b
        L2c:
            r1 = 0
            int r0 = java.lang.Math.min(r0, r1)
            goto L3b
        L32:
            int r0 = java.lang.Math.min(r0, r7)
            goto L3b
        L37:
            int r0 = java.lang.Math.min(r0, r3)
        L3b:
            androidx.fragment.app.Fragment r1 = r9.mFragment
            boolean r1 = r1.mFromLayout
            if (r1 == 0) goto L73
            androidx.fragment.app.Fragment r1 = r9.mFragment
            boolean r1 = r1.mInLayout
            if (r1 == 0) goto L62
            int r0 = r9.mFragmentManagerState
            int r0 = java.lang.Math.max(r0, r6)
            androidx.fragment.app.Fragment r1 = r9.mFragment
            android.view.View r1 = r1.mView
            if (r1 == 0) goto L73
            androidx.fragment.app.Fragment r1 = r9.mFragment
            android.view.View r1 = r1.mView
            android.view.ViewParent r1 = r1.getParent()
            if (r1 != 0) goto L73
            int r0 = java.lang.Math.min(r0, r6)
            goto L73
        L62:
            int r1 = r9.mFragmentManagerState
            if (r1 >= r5) goto L6f
            androidx.fragment.app.Fragment r1 = r9.mFragment
            int r1 = r1.mState
            int r0 = java.lang.Math.min(r0, r1)
            goto L73
        L6f:
            int r0 = java.lang.Math.min(r0, r7)
        L73:
            androidx.fragment.app.Fragment r1 = r9.mFragment
            boolean r1 = r1.mAdded
            if (r1 != 0) goto L7d
            int r0 = java.lang.Math.min(r0, r7)
        L7d:
            androidx.fragment.app.Fragment r1 = r9.mFragment
            android.view.ViewGroup r1 = r1.mContainer
            if (r1 == 0) goto L96
            androidx.fragment.app.Fragment r1 = r9.mFragment
            android.view.ViewGroup r1 = r1.mContainer
            androidx.fragment.app.Fragment r8 = r9.mFragment
            androidx.fragment.app.FragmentManager r8 = r8.getParentFragmentManager()
            androidx.fragment.app.SpecialEffectsController r1 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r1, r8)
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = r1.getAwaitingCompletionLifecycleImpact(r9)
            goto L97
        L96:
            r1 = 0
        L97:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r8 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            if (r1 != r8) goto La1
            r1 = 6
            int r0 = java.lang.Math.min(r0, r1)
            goto Lc1
        La1:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r8 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
            if (r1 != r8) goto Laa
            int r0 = java.lang.Math.max(r0, r4)
            goto Lc1
        Laa:
            androidx.fragment.app.Fragment r1 = r9.mFragment
            boolean r1 = r1.mRemoving
            if (r1 == 0) goto Lc1
            androidx.fragment.app.Fragment r1 = r9.mFragment
            boolean r1 = r1.isInBackStack()
            if (r1 == 0) goto Lbd
            int r0 = java.lang.Math.min(r0, r7)
            goto Lc1
        Lbd:
            int r0 = java.lang.Math.min(r0, r2)
        Lc1:
            androidx.fragment.app.Fragment r1 = r9.mFragment
            boolean r1 = r1.mDeferStart
            if (r1 == 0) goto Ld1
            androidx.fragment.app.Fragment r1 = r9.mFragment
            int r1 = r1.mState
            if (r1 >= r3) goto Ld1
            int r0 = java.lang.Math.min(r0, r5)
        Ld1:
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)
            if (r1 == 0) goto Lf7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "computeExpectedState() of "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = " for "
            java.lang.StringBuilder r1 = r1.append(r2)
            androidx.fragment.app.Fragment r2 = r9.mFragment
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        Lf7:
            return r0
    }

    void create() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "moveto CREATED: "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1d:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            boolean r0 = r0.mIsCreated
            if (r0 != 0) goto L3e
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r4.mDispatcher
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r2 = r1.mSavedFragmentState
            r3 = 0
            r0.dispatchOnFragmentPreCreated(r1, r2, r3)
            androidx.fragment.app.Fragment r0 = r4.mFragment
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.performCreate(r1)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r4.mDispatcher
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r2 = r1.mSavedFragmentState
            r0.dispatchOnFragmentCreated(r1, r2, r3)
            goto L4a
        L3e:
            androidx.fragment.app.Fragment r0 = r4.mFragment
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.restoreChildFragmentState(r1)
            androidx.fragment.app.Fragment r0 = r4.mFragment
            r1 = 1
            r0.mState = r1
        L4a:
            return
    }

    void createView() {
            r7 = this;
            androidx.fragment.app.Fragment r0 = r7.mFragment
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto CREATE_VIEW: "
            r0.<init>(r2)
            androidx.fragment.app.Fragment r2 = r7.mFragment
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L24:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.os.Bundle r2 = r0.mSavedFragmentState
            android.view.LayoutInflater r0 = r0.performGetLayoutInflater(r2)
            androidx.fragment.app.Fragment r2 = r7.mFragment
            android.view.ViewGroup r2 = r2.mContainer
            if (r2 == 0) goto L38
            androidx.fragment.app.Fragment r2 = r7.mFragment
            android.view.ViewGroup r2 = r2.mContainer
            goto Lcc
        L38:
            androidx.fragment.app.Fragment r2 = r7.mFragment
            int r2 = r2.mContainerId
            if (r2 == 0) goto Lcb
            androidx.fragment.app.Fragment r2 = r7.mFragment
            int r2 = r2.mContainerId
            r3 = -1
            if (r2 == r3) goto Lae
            androidx.fragment.app.Fragment r2 = r7.mFragment
            androidx.fragment.app.FragmentManager r2 = r2.mFragmentManager
            androidx.fragment.app.FragmentContainer r2 = r2.getContainer()
            androidx.fragment.app.Fragment r3 = r7.mFragment
            int r3 = r3.mContainerId
            android.view.View r2 = r2.onFindViewById(r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto La4
            androidx.fragment.app.Fragment r3 = r7.mFragment
            boolean r3 = r3.mRestored
            if (r3 == 0) goto L60
            goto Lcc
        L60:
            androidx.fragment.app.Fragment r0 = r7.mFragment     // Catch: android.content.res.Resources.NotFoundException -> L6f
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L6f
            androidx.fragment.app.Fragment r1 = r7.mFragment     // Catch: android.content.res.Resources.NotFoundException -> L6f
            int r1 = r1.mContainerId     // Catch: android.content.res.Resources.NotFoundException -> L6f
            java.lang.String r0 = r0.getResourceName(r1)     // Catch: android.content.res.Resources.NotFoundException -> L6f
            goto L71
        L6f:
            java.lang.String r0 = "unknown"
        L71:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No view found for id 0x"
            r2.<init>(r3)
            androidx.fragment.app.Fragment r3 = r7.mFragment
            int r3 = r3.mContainerId
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " ("
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = ") for fragment "
            java.lang.StringBuilder r0 = r0.append(r2)
            androidx.fragment.app.Fragment r2 = r7.mFragment
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        La4:
            boolean r3 = r2 instanceof androidx.fragment.app.FragmentContainerView
            if (r3 != 0) goto Lcc
            androidx.fragment.app.Fragment r3 = r7.mFragment
            androidx.fragment.app.strictmode.FragmentStrictMode.onWrongFragmentContainer(r3, r2)
            goto Lcc
        Lae:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot create fragment "
            r1.<init>(r2)
            androidx.fragment.app.Fragment r2 = r7.mFragment
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " for a container view with no id"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lcb:
            r2 = 0
        Lcc:
            androidx.fragment.app.Fragment r3 = r7.mFragment
            r3.mContainer = r2
            androidx.fragment.app.Fragment r3 = r7.mFragment
            android.os.Bundle r4 = r3.mSavedFragmentState
            r3.performCreateView(r0, r2, r4)
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            r3 = 2
            if (r0 == 0) goto L18d
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            r4 = 0
            r0.setSaveFromParentEnabled(r4)
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            int r5 = androidx.fragment.R.id.fragment_container_view_tag
            androidx.fragment.app.Fragment r6 = r7.mFragment
            r0.setTag(r5, r6)
            if (r2 == 0) goto Lf6
            r7.addViewToContainer()
        Lf6:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            boolean r0 = r0.mHidden
            if (r0 == 0) goto L105
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            r2 = 8
            r0.setVisibility(r2)
        L105:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            if (r0 == 0) goto L117
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            androidx.core.view.ViewCompat.requestApplyInsets(r0)
            goto L123
        L117:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            androidx.fragment.app.FragmentStateManager$1 r2 = new androidx.fragment.app.FragmentStateManager$1
            r2.<init>(r7, r0)
            r0.addOnAttachStateChangeListener(r2)
        L123:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            r0.performViewCreated()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r7.mDispatcher
            androidx.fragment.app.Fragment r2 = r7.mFragment
            android.view.View r5 = r2.mView
            androidx.fragment.app.Fragment r6 = r7.mFragment
            android.os.Bundle r6 = r6.mSavedFragmentState
            r0.dispatchOnFragmentViewCreated(r2, r5, r6, r4)
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            int r0 = r0.getVisibility()
            androidx.fragment.app.Fragment r2 = r7.mFragment
            android.view.View r2 = r2.mView
            float r2 = r2.getAlpha()
            androidx.fragment.app.Fragment r4 = r7.mFragment
            r4.setPostOnViewCreatedAlpha(r2)
            androidx.fragment.app.Fragment r2 = r7.mFragment
            android.view.ViewGroup r2 = r2.mContainer
            if (r2 == 0) goto L18d
            if (r0 != 0) goto L18d
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            android.view.View r0 = r0.findFocus()
            if (r0 == 0) goto L185
            androidx.fragment.app.Fragment r2 = r7.mFragment
            r2.setFocusedView(r0)
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r2 == 0) goto L185
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "requestFocus: Saved focused view "
            r2.<init>(r4)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " for Fragment "
            java.lang.StringBuilder r0 = r0.append(r2)
            androidx.fragment.app.Fragment r2 = r7.mFragment
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
        L185:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            android.view.View r0 = r0.mView
            r1 = 0
            r0.setAlpha(r1)
        L18d:
            androidx.fragment.app.Fragment r0 = r7.mFragment
            r0.mState = r3
            return
    }

    void destroy() {
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "movefrom CREATED: "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r6.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1d:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            boolean r0 = r0.mRemoving
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2f
            androidx.fragment.app.Fragment r0 = r6.mFragment
            boolean r0 = r0.isInBackStack()
            if (r0 != 0) goto L2f
            r0 = r1
            goto L30
        L2f:
            r0 = r2
        L30:
            r3 = 0
            if (r0 == 0) goto L42
            androidx.fragment.app.Fragment r4 = r6.mFragment
            boolean r4 = r4.mBeingSaved
            if (r4 != 0) goto L42
            androidx.fragment.app.FragmentStore r4 = r6.mFragmentStore
            androidx.fragment.app.Fragment r5 = r6.mFragment
            java.lang.String r5 = r5.mWho
            r4.setSavedState(r5, r3)
        L42:
            if (r0 != 0) goto L73
            androidx.fragment.app.FragmentStore r4 = r6.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r4 = r4.getNonConfig()
            androidx.fragment.app.Fragment r5 = r6.mFragment
            boolean r4 = r4.shouldDestroy(r5)
            if (r4 == 0) goto L53
            goto L73
        L53:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto L6d
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            androidx.fragment.app.Fragment r1 = r6.mFragment
            java.lang.String r1 = r1.mTargetWho
            androidx.fragment.app.Fragment r0 = r0.findActiveFragment(r1)
            if (r0 == 0) goto L6d
            boolean r1 = r0.mRetainInstance
            if (r1 == 0) goto L6d
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r1.mTarget = r0
        L6d:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            r0.mState = r2
            goto L100
        L73:
            androidx.fragment.app.Fragment r4 = r6.mFragment
            androidx.fragment.app.FragmentHostCallback<?> r4 = r4.mHost
            boolean r5 = r4 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r5 == 0) goto L86
            androidx.fragment.app.FragmentStore r1 = r6.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r1.getNonConfig()
            boolean r1 = r1.isCleared()
            goto L99
        L86:
            android.content.Context r5 = r4.getContext()
            boolean r5 = r5 instanceof android.app.Activity
            if (r5 == 0) goto L99
            android.content.Context r4 = r4.getContext()
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r4 = r4.isChangingConfigurations()
            r1 = r1 ^ r4
        L99:
            if (r0 == 0) goto La1
            androidx.fragment.app.Fragment r0 = r6.mFragment
            boolean r0 = r0.mBeingSaved
            if (r0 == 0) goto La3
        La1:
            if (r1 == 0) goto Lae
        La3:
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r0 = r0.getNonConfig()
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r0.clearNonConfigState(r1)
        Lae:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            r0.performDestroy()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r6.mDispatcher
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r0.dispatchOnFragmentDestroyed(r1, r2)
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.Iterator r0 = r0.iterator()
        Lc4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le9
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto Lc4
            androidx.fragment.app.Fragment r1 = r1.getFragment()
            androidx.fragment.app.Fragment r2 = r6.mFragment
            java.lang.String r2 = r2.mWho
            java.lang.String r4 = r1.mTargetWho
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto Lc4
            androidx.fragment.app.Fragment r2 = r6.mFragment
            r1.mTarget = r2
            r1.mTargetWho = r3
            goto Lc4
        Le9:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto Lfb
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.FragmentStore r1 = r6.mFragmentStore
            java.lang.String r2 = r0.mTargetWho
            androidx.fragment.app.Fragment r1 = r1.findActiveFragment(r2)
            r0.mTarget = r1
        Lfb:
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            r0.makeInactive(r6)
        L100:
            return
    }

    void destroyFragmentView() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "movefrom CREATE_VIEW: "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1d:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.ViewGroup r0 = r0.mContainer
            if (r0 == 0) goto L34
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L34
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.ViewGroup r0 = r0.mContainer
            androidx.fragment.app.Fragment r1 = r3.mFragment
            android.view.View r1 = r1.mView
            r0.removeView(r1)
        L34:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performDestroyView()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentViewDestroyed(r1, r2)
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r1 = 0
            r0.mContainer = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.mView = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.mViewLifecycleOwner = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r0 = r0.mViewLifecycleOwnerLiveData
            r0.setValue(r1)
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.mInLayout = r2
            return
    }

    void detach() {
            r5 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "movefrom ATTACHED: "
            r1.<init>(r3)
            androidx.fragment.app.Fragment r3 = r5.mFragment
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1d:
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.performDetach()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r5.mDispatcher
            androidx.fragment.app.Fragment r3 = r5.mFragment
            r4 = 0
            r1.dispatchOnFragmentDetached(r3, r4)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r3 = -1
            r1.mState = r3
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r3 = 0
            r1.mHost = r3
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.mParentFragment = r3
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.mFragmentManager = r3
            androidx.fragment.app.Fragment r1 = r5.mFragment
            boolean r1 = r1.mRemoving
            if (r1 == 0) goto L4b
            androidx.fragment.app.Fragment r1 = r5.mFragment
            boolean r1 = r1.isInBackStack()
            if (r1 != 0) goto L4b
            goto L59
        L4b:
            androidx.fragment.app.FragmentStore r1 = r5.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r1.getNonConfig()
            androidx.fragment.app.Fragment r3 = r5.mFragment
            boolean r1 = r1.shouldDestroy(r3)
            if (r1 == 0) goto L78
        L59:
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L73
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "initState called for fragment: "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L73:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.initState()
        L78:
            return
    }

    void ensureInflatedView() {
            r5 = this;
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L7e
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r0 = r0.mInLayout
            if (r0 == 0) goto L7e
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r0 = r0.mPerformedCreateView
            if (r0 != 0) goto L7e
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "moveto CREATE_VIEW: "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L2f:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.os.Bundle r1 = r0.mSavedFragmentState
            android.view.LayoutInflater r1 = r0.performGetLayoutInflater(r1)
            androidx.fragment.app.Fragment r2 = r5.mFragment
            android.os.Bundle r2 = r2.mSavedFragmentState
            r3 = 0
            r0.performCreateView(r1, r3, r2)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L7e
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.mView
            r1 = 0
            r0.setSaveFromParentEnabled(r1)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.mView
            int r2 = androidx.fragment.R.id.fragment_container_view_tag
            androidx.fragment.app.Fragment r3 = r5.mFragment
            r0.setTag(r2, r3)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r0 = r0.mHidden
            if (r0 == 0) goto L67
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.mView
            r2 = 8
            r0.setVisibility(r2)
        L67:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.performViewCreated()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r5.mDispatcher
            androidx.fragment.app.Fragment r2 = r5.mFragment
            android.view.View r3 = r2.mView
            androidx.fragment.app.Fragment r4 = r5.mFragment
            android.os.Bundle r4 = r4.mSavedFragmentState
            r0.dispatchOnFragmentViewCreated(r2, r3, r4, r1)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r1 = 2
            r0.mState = r1
        L7e:
            return
    }

    androidx.fragment.app.Fragment getFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mFragment
            return r0
    }

    void moveToExpectedState() {
            r8 = this;
            boolean r0 = r8.mMovingToState
            r1 = 2
            java.lang.String r2 = "FragmentManager"
            if (r0 == 0) goto L24
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            if (r0 == 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Ignoring re-entrant call to moveToExpectedState() for "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r8.getFragment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L23:
            return
        L24:
            r0 = 0
            r3 = 1
            r8.mMovingToState = r3     // Catch: java.lang.Throwable -> L1ff
            r4 = r0
        L29:
            int r5 = r8.computeExpectedState()     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r6 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            int r6 = r6.mState     // Catch: java.lang.Throwable -> L1ff
            r7 = 3
            if (r5 == r6) goto L140
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            int r4 = r4.mState     // Catch: java.lang.Throwable -> L1ff
            if (r5 <= r4) goto L9c
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            int r4 = r4.mState     // Catch: java.lang.Throwable -> L1ff
            int r4 = r4 + r3
            switch(r4) {
                case 0: goto L97;
                case 1: goto L92;
                case 2: goto L8a;
                case 3: goto L85;
                case 4: goto L55;
                case 5: goto L50;
                case 6: goto L49;
                case 7: goto L44;
                default: goto L42;
            }     // Catch: java.lang.Throwable -> L1ff
        L42:
            goto L13d
        L44:
            r8.resume()     // Catch: java.lang.Throwable -> L1ff
            goto L13d
        L49:
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            r5 = 6
            r4.mState = r5     // Catch: java.lang.Throwable -> L1ff
            goto L13d
        L50:
            r8.start()     // Catch: java.lang.Throwable -> L1ff
            goto L13d
        L55:
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            android.view.View r4 = r4.mView     // Catch: java.lang.Throwable -> L1ff
            if (r4 == 0) goto L7e
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            android.view.ViewGroup r4 = r4.mContainer     // Catch: java.lang.Throwable -> L1ff
            if (r4 == 0) goto L7e
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            android.view.ViewGroup r4 = r4.mContainer     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r5 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.FragmentManager r5 = r5.getParentFragmentManager()     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.SpecialEffectsController r4 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r4, r5)     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r5 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            android.view.View r5 = r5.mView     // Catch: java.lang.Throwable -> L1ff
            int r5 = r5.getVisibility()     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.SpecialEffectsController$Operation$State r5 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r5)     // Catch: java.lang.Throwable -> L1ff
            r4.enqueueAdd(r5, r8)     // Catch: java.lang.Throwable -> L1ff
        L7e:
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            r5 = 4
            r4.mState = r5     // Catch: java.lang.Throwable -> L1ff
            goto L13d
        L85:
            r8.activityCreated()     // Catch: java.lang.Throwable -> L1ff
            goto L13d
        L8a:
            r8.ensureInflatedView()     // Catch: java.lang.Throwable -> L1ff
            r8.createView()     // Catch: java.lang.Throwable -> L1ff
            goto L13d
        L92:
            r8.create()     // Catch: java.lang.Throwable -> L1ff
            goto L13d
        L97:
            r8.attach()     // Catch: java.lang.Throwable -> L1ff
            goto L13d
        L9c:
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            int r4 = r4.mState     // Catch: java.lang.Throwable -> L1ff
            int r4 = r4 - r3
            switch(r4) {
                case -1: goto L13a;
                case 0: goto L121;
                case 1: goto L119;
                case 2: goto L110;
                case 3: goto Lb7;
                case 4: goto Lb2;
                case 5: goto Lab;
                case 6: goto La6;
                default: goto La4;
            }     // Catch: java.lang.Throwable -> L1ff
        La4:
            goto L13d
        La6:
            r8.pause()     // Catch: java.lang.Throwable -> L1ff
            goto L13d
        Lab:
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            r5 = 5
            r4.mState = r5     // Catch: java.lang.Throwable -> L1ff
            goto L13d
        Lb2:
            r8.stop()     // Catch: java.lang.Throwable -> L1ff
            goto L13d
        Lb7:
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r7)     // Catch: java.lang.Throwable -> L1ff
            if (r4 == 0) goto Ld5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ff
            r4.<init>()     // Catch: java.lang.Throwable -> L1ff
            java.lang.String r5 = "movefrom ACTIVITY_CREATED: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r5 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L1ff
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L1ff
            android.util.Log.d(r2, r4)     // Catch: java.lang.Throwable -> L1ff
        Ld5:
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            boolean r4 = r4.mBeingSaved     // Catch: java.lang.Throwable -> L1ff
            if (r4 == 0) goto Ldf
            r8.saveState()     // Catch: java.lang.Throwable -> L1ff
            goto Lee
        Ldf:
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            android.view.View r4 = r4.mView     // Catch: java.lang.Throwable -> L1ff
            if (r4 == 0) goto Lee
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            android.util.SparseArray<android.os.Parcelable> r4 = r4.mSavedViewState     // Catch: java.lang.Throwable -> L1ff
            if (r4 != 0) goto Lee
            r8.saveViewState()     // Catch: java.lang.Throwable -> L1ff
        Lee:
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            android.view.View r4 = r4.mView     // Catch: java.lang.Throwable -> L1ff
            if (r4 == 0) goto L10b
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            android.view.ViewGroup r4 = r4.mContainer     // Catch: java.lang.Throwable -> L1ff
            if (r4 == 0) goto L10b
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            android.view.ViewGroup r4 = r4.mContainer     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r5 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.FragmentManager r5 = r5.getParentFragmentManager()     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.SpecialEffectsController r4 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r4, r5)     // Catch: java.lang.Throwable -> L1ff
            r4.enqueueRemove(r8)     // Catch: java.lang.Throwable -> L1ff
        L10b:
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            r4.mState = r7     // Catch: java.lang.Throwable -> L1ff
            goto L13d
        L110:
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            r4.mInLayout = r0     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            r4.mState = r1     // Catch: java.lang.Throwable -> L1ff
            goto L13d
        L119:
            r8.destroyFragmentView()     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            r4.mState = r3     // Catch: java.lang.Throwable -> L1ff
            goto L13d
        L121:
            androidx.fragment.app.Fragment r4 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            boolean r4 = r4.mBeingSaved     // Catch: java.lang.Throwable -> L1ff
            if (r4 == 0) goto L136
            androidx.fragment.app.FragmentStore r4 = r8.mFragmentStore     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r5 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            java.lang.String r5 = r5.mWho     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.FragmentState r4 = r4.getSavedState(r5)     // Catch: java.lang.Throwable -> L1ff
            if (r4 != 0) goto L136
            r8.saveState()     // Catch: java.lang.Throwable -> L1ff
        L136:
            r8.destroy()     // Catch: java.lang.Throwable -> L1ff
            goto L13d
        L13a:
            r8.detach()     // Catch: java.lang.Throwable -> L1ff
        L13d:
            r4 = r3
            goto L29
        L140:
            if (r4 != 0) goto L1ae
            androidx.fragment.app.Fragment r1 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            int r1 = r1.mState     // Catch: java.lang.Throwable -> L1ff
            r3 = -1
            if (r1 != r3) goto L1ae
            androidx.fragment.app.Fragment r1 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            boolean r1 = r1.mRemoving     // Catch: java.lang.Throwable -> L1ff
            if (r1 == 0) goto L1ae
            androidx.fragment.app.Fragment r1 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            boolean r1 = r1.isInBackStack()     // Catch: java.lang.Throwable -> L1ff
            if (r1 != 0) goto L1ae
            androidx.fragment.app.Fragment r1 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            boolean r1 = r1.mBeingSaved     // Catch: java.lang.Throwable -> L1ff
            if (r1 != 0) goto L1ae
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r7)     // Catch: java.lang.Throwable -> L1ff
            if (r1 == 0) goto L17b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ff
            r1.<init>()     // Catch: java.lang.Throwable -> L1ff
            java.lang.String r3 = "Cleaning up state of never attached fragment: "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r3 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L1ff
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1ff
            android.util.Log.d(r2, r1)     // Catch: java.lang.Throwable -> L1ff
        L17b:
            androidx.fragment.app.FragmentStore r1 = r8.mFragmentStore     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.FragmentManagerViewModel r1 = r1.getNonConfig()     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r3 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            r1.clearNonConfigState(r3)     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.FragmentStore r1 = r8.mFragmentStore     // Catch: java.lang.Throwable -> L1ff
            r1.makeInactive(r8)     // Catch: java.lang.Throwable -> L1ff
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r7)     // Catch: java.lang.Throwable -> L1ff
            if (r1 == 0) goto L1a9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1ff
            r1.<init>()     // Catch: java.lang.Throwable -> L1ff
            java.lang.String r3 = "initState called for fragment: "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r3 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L1ff
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1ff
            android.util.Log.d(r2, r1)     // Catch: java.lang.Throwable -> L1ff
        L1a9:
            androidx.fragment.app.Fragment r1 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            r1.initState()     // Catch: java.lang.Throwable -> L1ff
        L1ae:
            androidx.fragment.app.Fragment r1 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            boolean r1 = r1.mHiddenChanged     // Catch: java.lang.Throwable -> L1ff
            if (r1 == 0) goto L1fc
            androidx.fragment.app.Fragment r1 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            android.view.View r1 = r1.mView     // Catch: java.lang.Throwable -> L1ff
            if (r1 == 0) goto L1db
            androidx.fragment.app.Fragment r1 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            android.view.ViewGroup r1 = r1.mContainer     // Catch: java.lang.Throwable -> L1ff
            if (r1 == 0) goto L1db
            androidx.fragment.app.Fragment r1 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            android.view.ViewGroup r1 = r1.mContainer     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r2 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.FragmentManager r2 = r2.getParentFragmentManager()     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.SpecialEffectsController r1 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r1, r2)     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r2 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            boolean r2 = r2.mHidden     // Catch: java.lang.Throwable -> L1ff
            if (r2 == 0) goto L1d8
            r1.enqueueHide(r8)     // Catch: java.lang.Throwable -> L1ff
            goto L1db
        L1d8:
            r1.enqueueShow(r8)     // Catch: java.lang.Throwable -> L1ff
        L1db:
            androidx.fragment.app.Fragment r1 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.FragmentManager r1 = r1.mFragmentManager     // Catch: java.lang.Throwable -> L1ff
            if (r1 == 0) goto L1ea
            androidx.fragment.app.Fragment r1 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.FragmentManager r1 = r1.mFragmentManager     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r2 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            r1.invalidateMenuForFragment(r2)     // Catch: java.lang.Throwable -> L1ff
        L1ea:
            androidx.fragment.app.Fragment r1 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            r1.mHiddenChanged = r0     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r1 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            boolean r2 = r1.mHidden     // Catch: java.lang.Throwable -> L1ff
            r1.onHiddenChanged(r2)     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.Fragment r1 = r8.mFragment     // Catch: java.lang.Throwable -> L1ff
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager     // Catch: java.lang.Throwable -> L1ff
            r1.dispatchOnHiddenChanged()     // Catch: java.lang.Throwable -> L1ff
        L1fc:
            r8.mMovingToState = r0
            return
        L1ff:
            r1 = move-exception
            r8.mMovingToState = r0
            throw r1
    }

    void pause() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "movefrom RESUMED: "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1d:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performPause()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentPaused(r1, r2)
            return
    }

    void restoreState(java.lang.ClassLoader r4) {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.os.Bundle r0 = r0.mSavedFragmentState
            if (r0 != 0) goto L7
            return
        L7:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.os.Bundle r0 = r0.mSavedFragmentState
            r0.setClassLoader(r4)
            androidx.fragment.app.Fragment r4 = r3.mFragment
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r1)
            r4.mSavedViewState = r0
            androidx.fragment.app.Fragment r4 = r3.mFragment
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r1 = "android:view_registry_state"
            android.os.Bundle r0 = r0.getBundle(r1)
            r4.mSavedViewRegistryState = r0
            androidx.fragment.app.Fragment r4 = r3.mFragment
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r1 = "android:target_state"
            java.lang.String r0 = r0.getString(r1)
            r4.mTargetWho = r0
            androidx.fragment.app.Fragment r4 = r3.mFragment
            java.lang.String r4 = r4.mTargetWho
            if (r4 == 0) goto L45
            androidx.fragment.app.Fragment r4 = r3.mFragment
            android.os.Bundle r0 = r4.mSavedFragmentState
            java.lang.String r1 = "android:target_req_state"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            r4.mTargetRequestCode = r0
        L45:
            androidx.fragment.app.Fragment r4 = r3.mFragment
            java.lang.Boolean r4 = r4.mSavedUserVisibleHint
            r0 = 1
            if (r4 == 0) goto L5c
            androidx.fragment.app.Fragment r4 = r3.mFragment
            java.lang.Boolean r1 = r4.mSavedUserVisibleHint
            boolean r1 = r1.booleanValue()
            r4.mUserVisibleHint = r1
            androidx.fragment.app.Fragment r4 = r3.mFragment
            r1 = 0
            r4.mSavedUserVisibleHint = r1
            goto L68
        L5c:
            androidx.fragment.app.Fragment r4 = r3.mFragment
            android.os.Bundle r1 = r4.mSavedFragmentState
            java.lang.String r2 = "android:user_visible_hint"
            boolean r1 = r1.getBoolean(r2, r0)
            r4.mUserVisibleHint = r1
        L68:
            androidx.fragment.app.Fragment r4 = r3.mFragment
            boolean r4 = r4.mUserVisibleHint
            if (r4 != 0) goto L72
            androidx.fragment.app.Fragment r4 = r3.mFragment
            r4.mDeferStart = r0
        L72:
            return
    }

    void resume() {
            r5 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto RESUMED: "
            r0.<init>(r2)
            androidx.fragment.app.Fragment r2 = r5.mFragment
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1d:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.getFocusedView()
            if (r0 == 0) goto L77
            boolean r2 = r5.isFragmentViewChild(r0)
            if (r2 == 0) goto L77
            boolean r2 = r0.requestFocus()
            r3 = 2
            boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r3 == 0) goto L77
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "requestFocus: Restoring focused view "
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " "
            java.lang.StringBuilder r0 = r0.append(r3)
            if (r2 == 0) goto L4c
            java.lang.String r2 = "succeeded"
            goto L4e
        L4c:
            java.lang.String r2 = "failed"
        L4e:
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " on Fragment "
            java.lang.StringBuilder r0 = r0.append(r2)
            androidx.fragment.app.Fragment r2 = r5.mFragment
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " resulting in focused view "
            java.lang.StringBuilder r0 = r0.append(r2)
            androidx.fragment.app.Fragment r2 = r5.mFragment
            android.view.View r2 = r2.mView
            android.view.View r2 = r2.findFocus()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
        L77:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r1 = 0
            r0.setFocusedView(r1)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.performResume()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r5.mDispatcher
            androidx.fragment.app.Fragment r2 = r5.mFragment
            r3 = 0
            r0.dispatchOnFragmentResumed(r2, r3)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.mSavedFragmentState = r1
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.mSavedViewState = r1
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.mSavedViewRegistryState = r1
            return
    }

    androidx.fragment.app.Fragment.SavedState saveInstanceState() {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.mFragment
            int r0 = r0.mState
            r1 = -1
            r2 = 0
            if (r0 <= r1) goto L13
            android.os.Bundle r0 = r3.saveBasicState()
            if (r0 == 0) goto L13
            androidx.fragment.app.Fragment$SavedState r2 = new androidx.fragment.app.Fragment$SavedState
            r2.<init>(r0)
        L13:
            return r2
    }

    void saveState() {
            r4 = this;
            androidx.fragment.app.FragmentState r0 = new androidx.fragment.app.FragmentState
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            int r1 = r1.mState
            r2 = -1
            if (r1 <= r2) goto L46
            android.os.Bundle r1 = r0.mSavedFragmentState
            if (r1 != 0) goto L46
            android.os.Bundle r1 = r4.saveBasicState()
            r0.mSavedFragmentState = r1
            androidx.fragment.app.Fragment r1 = r4.mFragment
            java.lang.String r1 = r1.mTargetWho
            if (r1 == 0) goto L4c
            android.os.Bundle r1 = r0.mSavedFragmentState
            if (r1 != 0) goto L29
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.mSavedFragmentState = r1
        L29:
            android.os.Bundle r1 = r0.mSavedFragmentState
            androidx.fragment.app.Fragment r2 = r4.mFragment
            java.lang.String r2 = r2.mTargetWho
            java.lang.String r3 = "android:target_state"
            r1.putString(r3, r2)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            int r1 = r1.mTargetRequestCode
            if (r1 == 0) goto L4c
            android.os.Bundle r1 = r0.mSavedFragmentState
            androidx.fragment.app.Fragment r2 = r4.mFragment
            int r2 = r2.mTargetRequestCode
            java.lang.String r3 = "android:target_req_state"
            r1.putInt(r3, r2)
            goto L4c
        L46:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            r0.mSavedFragmentState = r1
        L4c:
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            androidx.fragment.app.Fragment r2 = r4.mFragment
            java.lang.String r2 = r2.mWho
            r1.setSavedState(r2, r0)
            return
    }

    void saveViewState() {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.mFragment
            android.view.View r0 = r0.mView
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Saving view state for fragment "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r2.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " with view "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r2.mFragment
            android.view.View r1 = r1.mView
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L32:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r2.mFragment
            android.view.View r1 = r1.mView
            r1.saveHierarchyState(r0)
            int r1 = r0.size()
            if (r1 <= 0) goto L48
            androidx.fragment.app.Fragment r1 = r2.mFragment
            r1.mSavedViewState = r0
        L48:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r2.mFragment
            androidx.fragment.app.FragmentViewLifecycleOwner r1 = r1.mViewLifecycleOwner
            r1.performSave(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L5e
            androidx.fragment.app.Fragment r1 = r2.mFragment
            r1.mSavedViewRegistryState = r0
        L5e:
            return
    }

    void setFragmentManagerState(int r1) {
            r0 = this;
            r0.mFragmentManagerState = r1
            return
    }

    void start() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "moveto STARTED: "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1d:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performStart()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentStarted(r1, r2)
            return
    }

    void stop() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "movefrom STARTED: "
            r0.<init>(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1d:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performStop()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentStopped(r1, r2)
            return
    }
}
