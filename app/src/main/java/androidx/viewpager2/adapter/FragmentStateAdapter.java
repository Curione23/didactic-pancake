package androidx.viewpager2.adapter;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.viewpager2.adapter.FragmentViewHolder> implements androidx.viewpager2.adapter.StatefulAdapter {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final java.lang.String KEY_PREFIX_FRAGMENT = "f#";
    private static final java.lang.String KEY_PREFIX_STATE = "s#";
    androidx.viewpager2.adapter.FragmentStateAdapter.FragmentEventDispatcher mFragmentEventDispatcher;
    final androidx.fragment.app.FragmentManager mFragmentManager;
    private androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    final androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final androidx.collection.LongSparseArray<java.lang.Integer> mItemIdToViewHolder;
    final androidx.lifecycle.Lifecycle mLifecycle;
    private final androidx.collection.LongSparseArray<androidx.fragment.app.Fragment.SavedState> mSavedStates;





    private static abstract class DataSetChangeObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        private DataSetChangeObserver() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ DataSetChangeObserver(androidx.viewpager2.adapter.FragmentStateAdapter.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int r1, int r2, java.lang.Object r3) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int r1, int r2, int r3) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }
    }

    public @interface ExperimentalFragmentStateAdapterApi {
    }

    static class FragmentEventDispatcher {
        private java.util.List<androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback> mCallbacks;

        FragmentEventDispatcher() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
                r0.<init>()
                r1.mCallbacks = r0
                return
        }

        public java.util.List<androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener> dispatchMaxLifecyclePreUpdated(androidx.fragment.app.Fragment r4, androidx.lifecycle.Lifecycle.State r5) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List<androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback> r1 = r3.mCallbacks
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L1f
                java.lang.Object r2 = r1.next()
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback r2 = (androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback) r2
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$OnPostEventListener r2 = r2.onFragmentMaxLifecyclePreUpdated(r4, r5)
                r0.add(r2)
                goto Lb
            L1f:
                return r0
        }

        public void dispatchPostEvents(java.util.List<androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L14
                java.lang.Object r0 = r2.next()
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$OnPostEventListener r0 = (androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener) r0
                r0.onPost()
                goto L4
            L14:
                return
        }

        public java.util.List<androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener> dispatchPreAdded(androidx.fragment.app.Fragment r4) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List<androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback> r1 = r3.mCallbacks
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L1f
                java.lang.Object r2 = r1.next()
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback r2 = (androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback) r2
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$OnPostEventListener r2 = r2.onFragmentPreAdded(r4)
                r0.add(r2)
                goto Lb
            L1f:
                return r0
        }

        public java.util.List<androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener> dispatchPreRemoved(androidx.fragment.app.Fragment r4) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List<androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback> r1 = r3.mCallbacks
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L1f
                java.lang.Object r2 = r1.next()
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback r2 = (androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback) r2
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$OnPostEventListener r2 = r2.onFragmentPreRemoved(r4)
                r0.add(r2)
                goto Lb
            L1f:
                return r0
        }

        public java.util.List<androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener> dispatchPreSavedInstanceState(androidx.fragment.app.Fragment r4) {
                r3 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List<androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback> r1 = r3.mCallbacks
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L1f
                java.lang.Object r2 = r1.next()
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback r2 = (androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback) r2
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$OnPostEventListener r2 = r2.onFragmentPreSavedInstanceState(r4)
                r0.add(r2)
                goto Lb
            L1f:
                return r0
        }

        public void registerCallback(androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback r2) {
                r1 = this;
                java.util.List<androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback> r0 = r1.mCallbacks
                r0.add(r2)
                return
        }

        public void unregisterCallback(androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback r2) {
                r1 = this;
                java.util.List<androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback> r0 = r1.mCallbacks
                r0.remove(r2)
                return
        }
    }

    class FragmentMaxLifecycleEnforcer {
        private androidx.recyclerview.widget.RecyclerView.AdapterDataObserver mDataObserver;
        private androidx.lifecycle.LifecycleEventObserver mLifecycleObserver;
        private androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback mPageChangeCallback;
        private long mPrimaryItemId;
        private androidx.viewpager2.widget.ViewPager2 mViewPager;
        final /* synthetic */ androidx.viewpager2.adapter.FragmentStateAdapter this$0;




        FragmentMaxLifecycleEnforcer(androidx.viewpager2.adapter.FragmentStateAdapter r3) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                r0 = -1
                r2.mPrimaryItemId = r0
                return
        }

        private androidx.viewpager2.widget.ViewPager2 inferViewPager(androidx.recyclerview.widget.RecyclerView r4) {
                r3 = this;
                android.view.ViewParent r4 = r4.getParent()
                boolean r0 = r4 instanceof androidx.viewpager2.widget.ViewPager2
                if (r0 == 0) goto Lb
                androidx.viewpager2.widget.ViewPager2 r4 = (androidx.viewpager2.widget.ViewPager2) r4
                return r4
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Expected ViewPager2 instance. Got: "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        void register(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                androidx.viewpager2.widget.ViewPager2 r2 = r1.inferViewPager(r2)
                r1.mViewPager = r2
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$1 r2 = new androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$1
                r2.<init>(r1)
                r1.mPageChangeCallback = r2
                androidx.viewpager2.widget.ViewPager2 r0 = r1.mViewPager
                r0.registerOnPageChangeCallback(r2)
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$2 r2 = new androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$2
                r2.<init>(r1)
                r1.mDataObserver = r2
                androidx.viewpager2.adapter.FragmentStateAdapter r0 = r1.this$0
                r0.registerAdapterDataObserver(r2)
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 r2 = new androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
                r2.<init>(r1)
                r1.mLifecycleObserver = r2
                androidx.viewpager2.adapter.FragmentStateAdapter r2 = r1.this$0
                androidx.lifecycle.Lifecycle r2 = r2.mLifecycle
                androidx.lifecycle.LifecycleEventObserver r0 = r1.mLifecycleObserver
                r2.addObserver(r0)
                return
        }

        void unregister(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                androidx.viewpager2.widget.ViewPager2 r2 = r1.inferViewPager(r2)
                androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback r0 = r1.mPageChangeCallback
                r2.unregisterOnPageChangeCallback(r0)
                androidx.viewpager2.adapter.FragmentStateAdapter r2 = r1.this$0
                androidx.recyclerview.widget.RecyclerView$AdapterDataObserver r0 = r1.mDataObserver
                r2.unregisterAdapterDataObserver(r0)
                androidx.viewpager2.adapter.FragmentStateAdapter r2 = r1.this$0
                androidx.lifecycle.Lifecycle r2 = r2.mLifecycle
                androidx.lifecycle.LifecycleEventObserver r0 = r1.mLifecycleObserver
                r2.removeObserver(r0)
                r2 = 0
                r1.mViewPager = r2
                return
        }

        void updateFragmentMaxLifecycle(boolean r10) {
                r9 = this;
                androidx.viewpager2.adapter.FragmentStateAdapter r0 = r9.this$0
                boolean r0 = r0.shouldDelayFragmentTransactions()
                if (r0 == 0) goto L9
                return
            L9:
                androidx.viewpager2.widget.ViewPager2 r0 = r9.mViewPager
                int r0 = r0.getScrollState()
                if (r0 == 0) goto L12
                return
            L12:
                androidx.viewpager2.adapter.FragmentStateAdapter r0 = r9.this$0
                androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r0 = r0.mFragments
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto Lee
                androidx.viewpager2.adapter.FragmentStateAdapter r0 = r9.this$0
                int r0 = r0.getItemCount()
                if (r0 != 0) goto L26
                goto Lee
            L26:
                androidx.viewpager2.widget.ViewPager2 r0 = r9.mViewPager
                int r0 = r0.getCurrentItem()
                androidx.viewpager2.adapter.FragmentStateAdapter r1 = r9.this$0
                int r1 = r1.getItemCount()
                if (r0 < r1) goto L35
                return
            L35:
                androidx.viewpager2.adapter.FragmentStateAdapter r1 = r9.this$0
                long r0 = r1.getItemId(r0)
                long r2 = r9.mPrimaryItemId
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L44
                if (r10 != 0) goto L44
                return
            L44:
                androidx.viewpager2.adapter.FragmentStateAdapter r10 = r9.this$0
                androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r10 = r10.mFragments
                java.lang.Object r10 = r10.get(r0)
                androidx.fragment.app.Fragment r10 = (androidx.fragment.app.Fragment) r10
                if (r10 == 0) goto Lee
                boolean r10 = r10.isAdded()
                if (r10 != 0) goto L58
                goto Lee
            L58:
                r9.mPrimaryItemId = r0
                androidx.viewpager2.adapter.FragmentStateAdapter r10 = r9.this$0
                androidx.fragment.app.FragmentManager r10 = r10.mFragmentManager
                androidx.fragment.app.FragmentTransaction r10 = r10.beginTransaction()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
                r2 = 0
                r3 = r1
            L6a:
                androidx.viewpager2.adapter.FragmentStateAdapter r4 = r9.this$0
                androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r4 = r4.mFragments
                int r4 = r4.size()
                if (r3 >= r4) goto Lb6
                androidx.viewpager2.adapter.FragmentStateAdapter r4 = r9.this$0
                androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r4 = r4.mFragments
                long r4 = r4.keyAt(r3)
                androidx.viewpager2.adapter.FragmentStateAdapter r6 = r9.this$0
                androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r6 = r6.mFragments
                java.lang.Object r6 = r6.valueAt(r3)
                androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
                boolean r7 = r6.isAdded()
                if (r7 != 0) goto L8d
                goto Lb3
            L8d:
                long r7 = r9.mPrimaryItemId
                int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r7 == 0) goto La6
                androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.STARTED
                r10.setMaxLifecycle(r6, r7)
                androidx.viewpager2.adapter.FragmentStateAdapter r7 = r9.this$0
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentEventDispatcher r7 = r7.mFragmentEventDispatcher
                androidx.lifecycle.Lifecycle$State r8 = androidx.lifecycle.Lifecycle.State.STARTED
                java.util.List r7 = r7.dispatchMaxLifecyclePreUpdated(r6, r8)
                r0.add(r7)
                goto La7
            La6:
                r2 = r6
            La7:
                long r7 = r9.mPrimaryItemId
                int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r4 != 0) goto Laf
                r4 = 1
                goto Lb0
            Laf:
                r4 = r1
            Lb0:
                r6.setMenuVisibility(r4)
            Lb3:
                int r3 = r3 + 1
                goto L6a
            Lb6:
                if (r2 == 0) goto Lca
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED
                r10.setMaxLifecycle(r2, r1)
                androidx.viewpager2.adapter.FragmentStateAdapter r1 = r9.this$0
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentEventDispatcher r1 = r1.mFragmentEventDispatcher
                androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.RESUMED
                java.util.List r1 = r1.dispatchMaxLifecyclePreUpdated(r2, r3)
                r0.add(r1)
            Lca:
                boolean r1 = r10.isEmpty()
                if (r1 != 0) goto Lee
                r10.commitNow()
                java.util.Collections.reverse(r0)
                java.util.Iterator r10 = r0.iterator()
            Lda:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto Lee
                java.lang.Object r0 = r10.next()
                java.util.List r0 = (java.util.List) r0
                androidx.viewpager2.adapter.FragmentStateAdapter r1 = r9.this$0
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentEventDispatcher r1 = r1.mFragmentEventDispatcher
                r1.dispatchPostEvents(r0)
                goto Lda
            Lee:
                return
        }
    }

    public static abstract class FragmentTransactionCallback {
        private static final androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener NO_OP = null;


        public interface OnPostEventListener {
            void onPost();
        }

        static {
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$1 r0 = new androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$1
                r0.<init>()
                androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.NO_OP = r0
                return
        }

        public FragmentTransactionCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener onFragmentMaxLifecyclePreUpdated(androidx.fragment.app.Fragment r1, androidx.lifecycle.Lifecycle.State r2) {
                r0 = this;
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$OnPostEventListener r1 = androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.NO_OP
                return r1
        }

        public androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener onFragmentPreAdded(androidx.fragment.app.Fragment r1) {
                r0 = this;
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$OnPostEventListener r1 = androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.NO_OP
                return r1
        }

        public androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener onFragmentPreRemoved(androidx.fragment.app.Fragment r1) {
                r0 = this;
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$OnPostEventListener r1 = androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.NO_OP
                return r1
        }

        public androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.OnPostEventListener onFragmentPreSavedInstanceState(androidx.fragment.app.Fragment r1) {
                r0 = this;
                androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$OnPostEventListener r1 = androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback.NO_OP
                return r1
        }
    }

    public FragmentStateAdapter(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r2.getChildFragmentManager()
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r1.<init>(r0, r2)
            return
    }

    public FragmentStateAdapter(androidx.fragment.app.FragmentActivity r2) {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r2.getSupportFragmentManager()
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r1.<init>(r0, r2)
            return
    }

    public FragmentStateAdapter(androidx.fragment.app.FragmentManager r2, androidx.lifecycle.Lifecycle r3) {
            r1 = this;
            r1.<init>()
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            r0.<init>()
            r1.mFragments = r0
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            r0.<init>()
            r1.mSavedStates = r0
            androidx.collection.LongSparseArray r0 = new androidx.collection.LongSparseArray
            r0.<init>()
            r1.mItemIdToViewHolder = r0
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentEventDispatcher r0 = new androidx.viewpager2.adapter.FragmentStateAdapter$FragmentEventDispatcher
            r0.<init>()
            r1.mFragmentEventDispatcher = r0
            r0 = 0
            r1.mIsInGracePeriod = r0
            r1.mHasStaleFragments = r0
            r1.mFragmentManager = r2
            r1.mLifecycle = r3
            r2 = 1
            super.setHasStableIds(r2)
            return
    }

    private static java.lang.String createKey(java.lang.String r1, long r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    private void ensureFragment(int r4) {
            r3 = this;
            long r0 = r3.getItemId(r4)
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r2 = r3.mFragments
            boolean r2 = r2.containsKey(r0)
            if (r2 != 0) goto L20
            androidx.fragment.app.Fragment r4 = r3.createFragment(r4)
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment$SavedState> r2 = r3.mSavedStates
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.Fragment$SavedState r2 = (androidx.fragment.app.Fragment.SavedState) r2
            r4.setInitialSavedState(r2)
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r2 = r3.mFragments
            r2.put(r0, r4)
        L20:
            return
    }

    private boolean isFragmentViewBound(long r3) {
            r2 = this;
            androidx.collection.LongSparseArray<java.lang.Integer> r0 = r2.mItemIdToViewHolder
            boolean r0 = r0.containsKey(r3)
            r1 = 1
            if (r0 == 0) goto La
            return r1
        La:
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r0 = r2.mFragments
            java.lang.Object r3 = r0.get(r3)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r4 = 0
            if (r3 != 0) goto L16
            return r4
        L16:
            android.view.View r3 = r3.getView()
            if (r3 != 0) goto L1d
            return r4
        L1d:
            android.view.ViewParent r3 = r3.getParent()
            if (r3 == 0) goto L24
            goto L25
        L24:
            r1 = r4
        L25:
            return r1
    }

    private static boolean isValidKey(java.lang.String r1, java.lang.String r2) {
            boolean r0 = r1.startsWith(r2)
            if (r0 == 0) goto L12
            int r1 = r1.length()
            int r2 = r2.length()
            if (r1 <= r2) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    private java.lang.Long itemForViewHolder(int r5) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            androidx.collection.LongSparseArray<java.lang.Integer> r2 = r4.mItemIdToViewHolder
            int r2 = r2.size()
            if (r1 >= r2) goto L30
            androidx.collection.LongSparseArray<java.lang.Integer> r2 = r4.mItemIdToViewHolder
            java.lang.Object r2 = r2.valueAt(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r5) goto L2d
            if (r0 != 0) goto L25
            androidx.collection.LongSparseArray<java.lang.Integer> r0 = r4.mItemIdToViewHolder
            long r2 = r0.keyAt(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L2d
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Design assumption violated: a ViewHolder can only be bound to one item at a time."
            r5.<init>(r0)
            throw r5
        L2d:
            int r1 = r1 + 1
            goto L2
        L30:
            return r0
    }

    private static long parseIdFromKey(java.lang.String r0, java.lang.String r1) {
            int r1 = r1.length()
            java.lang.String r0 = r0.substring(r1)
            long r0 = java.lang.Long.parseLong(r0)
            return r0
    }

    private void removeFragment(long r5) {
            r4 = this;
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r0 = r4.mFragments
            java.lang.Object r0 = r0.get(r5)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L20
            android.view.View r1 = r0.getView()
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L20
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1.removeAllViews()
        L20:
            boolean r1 = r4.containsItem(r5)
            if (r1 != 0) goto L2b
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment$SavedState> r1 = r4.mSavedStates
            r1.remove(r5)
        L2b:
            boolean r1 = r0.isAdded()
            if (r1 != 0) goto L37
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r0 = r4.mFragments
            r0.remove(r5)
            return
        L37:
            boolean r1 = r4.shouldDelayFragmentTransactions()
            if (r1 == 0) goto L41
            r5 = 1
            r4.mHasStaleFragments = r5
            return
        L41:
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto L63
            boolean r1 = r4.containsItem(r5)
            if (r1 == 0) goto L63
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentEventDispatcher r1 = r4.mFragmentEventDispatcher
            java.util.List r1 = r1.dispatchPreSavedInstanceState(r0)
            androidx.fragment.app.FragmentManager r2 = r4.mFragmentManager
            androidx.fragment.app.Fragment$SavedState r2 = r2.saveFragmentInstanceState(r0)
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentEventDispatcher r3 = r4.mFragmentEventDispatcher
            r3.dispatchPostEvents(r1)
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment$SavedState> r1 = r4.mSavedStates
            r1.put(r5, r2)
        L63:
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentEventDispatcher r1 = r4.mFragmentEventDispatcher
            java.util.List r1 = r1.dispatchPreRemoved(r0)
            androidx.fragment.app.FragmentManager r2 = r4.mFragmentManager     // Catch: java.lang.Throwable -> L81
            androidx.fragment.app.FragmentTransaction r2 = r2.beginTransaction()     // Catch: java.lang.Throwable -> L81
            androidx.fragment.app.FragmentTransaction r0 = r2.remove(r0)     // Catch: java.lang.Throwable -> L81
            r0.commitNow()     // Catch: java.lang.Throwable -> L81
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r0 = r4.mFragments     // Catch: java.lang.Throwable -> L81
            r0.remove(r5)     // Catch: java.lang.Throwable -> L81
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentEventDispatcher r5 = r4.mFragmentEventDispatcher
            r5.dispatchPostEvents(r1)
            return
        L81:
            r5 = move-exception
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentEventDispatcher r6 = r4.mFragmentEventDispatcher
            r6.dispatchPostEvents(r1)
            throw r5
    }

    private void scheduleGracePeriodEnd() {
            r4 = this;
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            androidx.viewpager2.adapter.FragmentStateAdapter$3 r1 = new androidx.viewpager2.adapter.FragmentStateAdapter$3
            r1.<init>(r4)
            androidx.lifecycle.Lifecycle r2 = r4.mLifecycle
            androidx.viewpager2.adapter.FragmentStateAdapter$4 r3 = new androidx.viewpager2.adapter.FragmentStateAdapter$4
            r3.<init>(r4, r0, r1)
            r2.addObserver(r3)
            r2 = 10000(0x2710, double:4.9407E-320)
            r0.postDelayed(r1, r2)
            return
    }

    private void scheduleViewAttach(androidx.fragment.app.Fragment r3, android.widget.FrameLayout r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.viewpager2.adapter.FragmentStateAdapter$2 r1 = new androidx.viewpager2.adapter.FragmentStateAdapter$2
            r1.<init>(r2, r3, r4)
            r3 = 0
            r0.registerFragmentLifecycleCallbacks(r1, r3)
            return
    }

    void addViewToContainer(android.view.View r3, android.widget.FrameLayout r4) {
            r2 = this;
            int r0 = r4.getChildCount()
            r1 = 1
            if (r0 > r1) goto L2a
            android.view.ViewParent r0 = r3.getParent()
            if (r0 != r4) goto Le
            return
        Le:
            int r0 = r4.getChildCount()
            if (r0 <= 0) goto L17
            r4.removeAllViews()
        L17:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L26
            android.view.ViewParent r0 = r3.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r3)
        L26:
            r4.addView(r3)
            return
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Design assumption violated."
            r3.<init>(r4)
            throw r3
    }

    public boolean containsItem(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L11
            int r0 = r2.getItemCount()
            long r0 = (long) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 >= 0) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            return r3
    }

    public abstract androidx.fragment.app.Fragment createFragment(int r1);

    void gcFragments() {
            r6 = this;
            boolean r0 = r6.mHasStaleFragments
            if (r0 == 0) goto L71
            boolean r0 = r6.shouldDelayFragmentTransactions()
            if (r0 == 0) goto Lb
            goto L71
        Lb:
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            r0.<init>()
            r1 = 0
            r2 = r1
        L12:
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r3 = r6.mFragments
            int r3 = r3.size()
            if (r2 >= r3) goto L35
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r3 = r6.mFragments
            long r3 = r3.keyAt(r2)
            boolean r5 = r6.containsItem(r3)
            if (r5 != 0) goto L32
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r0.add(r5)
            androidx.collection.LongSparseArray<java.lang.Integer> r5 = r6.mItemIdToViewHolder
            r5.remove(r3)
        L32:
            int r2 = r2 + 1
            goto L12
        L35:
            boolean r2 = r6.mIsInGracePeriod
            if (r2 != 0) goto L59
            r6.mHasStaleFragments = r1
        L3b:
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r2 = r6.mFragments
            int r2 = r2.size()
            if (r1 >= r2) goto L59
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r2 = r6.mFragments
            long r2 = r2.keyAt(r1)
            boolean r4 = r6.isFragmentViewBound(r2)
            if (r4 != 0) goto L56
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.add(r2)
        L56:
            int r1 = r1 + 1
            goto L3b
        L59:
            java.util.Iterator r0 = r0.iterator()
        L5d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.removeFragment(r1)
            goto L5d
        L71:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer r0 = r1.mFragmentMaxLifecycleEnforcer
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            androidx.core.util.Preconditions.checkArgument(r0)
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer r0 = new androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer
            r0.<init>(r1)
            r1.mFragmentMaxLifecycleEnforcer = r0
            r0.register(r2)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            androidx.viewpager2.adapter.FragmentViewHolder r1 = (androidx.viewpager2.adapter.FragmentViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public final void onBindViewHolder(androidx.viewpager2.adapter.FragmentViewHolder r8, int r9) {
            r7 = this;
            long r0 = r8.getItemId()
            android.widget.FrameLayout r2 = r8.getContainer()
            int r2 = r2.getId()
            java.lang.Long r3 = r7.itemForViewHolder(r2)
            if (r3 == 0) goto L2a
            long r4 = r3.longValue()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 == 0) goto L2a
            long r4 = r3.longValue()
            r7.removeFragment(r4)
            androidx.collection.LongSparseArray<java.lang.Integer> r4 = r7.mItemIdToViewHolder
            long r5 = r3.longValue()
            r4.remove(r5)
        L2a:
            androidx.collection.LongSparseArray<java.lang.Integer> r3 = r7.mItemIdToViewHolder
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.put(r0, r2)
            r7.ensureFragment(r9)
            android.widget.FrameLayout r9 = r8.getContainer()
            boolean r9 = androidx.core.view.ViewCompat.isAttachedToWindow(r9)
            if (r9 == 0) goto L43
            r7.placeFragmentInViewHolder(r8)
        L43:
            r7.gcFragments()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
            r0 = this;
            androidx.viewpager2.adapter.FragmentViewHolder r1 = r0.onCreateViewHolder(r1, r2)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final androidx.viewpager2.adapter.FragmentViewHolder onCreateViewHolder(android.view.ViewGroup r1, int r2) {
            r0 = this;
            androidx.viewpager2.adapter.FragmentViewHolder r1 = androidx.viewpager2.adapter.FragmentViewHolder.create(r1)
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer r0 = r1.mFragmentMaxLifecycleEnforcer
            r0.unregister(r2)
            r2 = 0
            r1.mFragmentMaxLifecycleEnforcer = r2
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ boolean onFailedToRecycleView(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            androidx.viewpager2.adapter.FragmentViewHolder r1 = (androidx.viewpager2.adapter.FragmentViewHolder) r1
            boolean r1 = r0.onFailedToRecycleView(r1)
            return r1
    }

    public final boolean onFailedToRecycleView(androidx.viewpager2.adapter.FragmentViewHolder r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            androidx.viewpager2.adapter.FragmentViewHolder r1 = (androidx.viewpager2.adapter.FragmentViewHolder) r1
            r0.onViewAttachedToWindow(r1)
            return
    }

    public final void onViewAttachedToWindow(androidx.viewpager2.adapter.FragmentViewHolder r1) {
            r0 = this;
            r0.placeFragmentInViewHolder(r1)
            r0.gcFragments()
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewRecycled(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
            r0 = this;
            androidx.viewpager2.adapter.FragmentViewHolder r1 = (androidx.viewpager2.adapter.FragmentViewHolder) r1
            r0.onViewRecycled(r1)
            return
    }

    public final void onViewRecycled(androidx.viewpager2.adapter.FragmentViewHolder r4) {
            r3 = this;
            android.widget.FrameLayout r4 = r4.getContainer()
            int r4 = r4.getId()
            java.lang.Long r4 = r3.itemForViewHolder(r4)
            if (r4 == 0) goto L1e
            long r0 = r4.longValue()
            r3.removeFragment(r0)
            androidx.collection.LongSparseArray<java.lang.Integer> r0 = r3.mItemIdToViewHolder
            long r1 = r4.longValue()
            r0.remove(r1)
        L1e:
            return
    }

    void placeFragmentInViewHolder(androidx.viewpager2.adapter.FragmentViewHolder r9) {
            r8 = this;
            java.lang.String r0 = "f"
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r1 = r8.mFragments
            long r2 = r9.getItemId()
            java.lang.Object r1 = r1.get(r2)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r2 = "Design assumption violated."
            if (r1 == 0) goto Lb2
            android.widget.FrameLayout r3 = r9.getContainer()
            android.view.View r4 = r1.getView()
            boolean r5 = r1.isAdded()
            if (r5 != 0) goto L29
            if (r4 != 0) goto L23
            goto L29
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
            throw r9
        L29:
            boolean r2 = r1.isAdded()
            if (r2 == 0) goto L35
            if (r4 != 0) goto L35
            r8.scheduleViewAttach(r1, r3)
            return
        L35:
            boolean r2 = r1.isAdded()
            if (r2 == 0) goto L4b
            android.view.ViewParent r2 = r4.getParent()
            if (r2 == 0) goto L4b
            android.view.ViewParent r9 = r4.getParent()
            if (r9 == r3) goto L4a
            r8.addViewToContainer(r4, r3)
        L4a:
            return
        L4b:
            boolean r2 = r1.isAdded()
            if (r2 == 0) goto L55
            r8.addViewToContainer(r4, r3)
            return
        L55:
            boolean r2 = r8.shouldDelayFragmentTransactions()
            if (r2 != 0) goto L9e
            r8.scheduleViewAttach(r1, r3)
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentEventDispatcher r2 = r8.mFragmentEventDispatcher
            java.util.List r2 = r2.dispatchPreAdded(r1)
            r3 = 0
            r1.setMenuVisibility(r3)     // Catch: java.lang.Throwable -> L97
            androidx.fragment.app.FragmentManager r4 = r8.mFragmentManager     // Catch: java.lang.Throwable -> L97
            androidx.fragment.app.FragmentTransaction r4 = r4.beginTransaction()     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L97
            long r6 = r9.getItemId()     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r9 = r5.append(r6)     // Catch: java.lang.Throwable -> L97
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L97
            androidx.fragment.app.FragmentTransaction r9 = r4.add(r1, r9)     // Catch: java.lang.Throwable -> L97
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.Throwable -> L97
            androidx.fragment.app.FragmentTransaction r9 = r9.setMaxLifecycle(r1, r0)     // Catch: java.lang.Throwable -> L97
            r9.commitNow()     // Catch: java.lang.Throwable -> L97
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer r9 = r8.mFragmentMaxLifecycleEnforcer     // Catch: java.lang.Throwable -> L97
            r9.updateFragmentMaxLifecycle(r3)     // Catch: java.lang.Throwable -> L97
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentEventDispatcher r9 = r8.mFragmentEventDispatcher
            r9.dispatchPostEvents(r2)
            goto Lb1
        L97:
            r9 = move-exception
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentEventDispatcher r0 = r8.mFragmentEventDispatcher
            r0.dispatchPostEvents(r2)
            throw r9
        L9e:
            androidx.fragment.app.FragmentManager r0 = r8.mFragmentManager
            boolean r0 = r0.isDestroyed()
            if (r0 == 0) goto La7
            return
        La7:
            androidx.lifecycle.Lifecycle r0 = r8.mLifecycle
            androidx.viewpager2.adapter.FragmentStateAdapter$1 r1 = new androidx.viewpager2.adapter.FragmentStateAdapter$1
            r1.<init>(r8, r9)
            r0.addObserver(r1)
        Lb1:
            return
        Lb2:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
            throw r9
    }

    public void registerFragmentTransactionCallback(androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback r2) {
            r1 = this;
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentEventDispatcher r0 = r1.mFragmentEventDispatcher
            r0.registerCallback(r2)
            return
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(android.os.Parcelable r6) {
            r5 = this;
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment$SavedState> r0 = r5.mSavedStates
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L96
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r0 = r5.mFragments
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L96
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.ClassLoader r0 = r6.getClassLoader()
            if (r0 != 0) goto L23
            java.lang.Class r0 = r5.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r6.setClassLoader(r0)
        L23:
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "f#"
            boolean r3 = isValidKey(r1, r2)
            if (r3 == 0) goto L4f
            long r2 = parseIdFromKey(r1, r2)
            androidx.fragment.app.FragmentManager r4 = r5.mFragmentManager
            androidx.fragment.app.Fragment r1 = r4.getFragment(r6, r1)
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r4 = r5.mFragments
            r4.put(r2, r1)
            goto L2b
        L4f:
            java.lang.String r2 = "s#"
            boolean r3 = isValidKey(r1, r2)
            if (r3 == 0) goto L6d
            long r2 = parseIdFromKey(r1, r2)
            android.os.Parcelable r1 = r6.getParcelable(r1)
            androidx.fragment.app.Fragment$SavedState r1 = (androidx.fragment.app.Fragment.SavedState) r1
            boolean r4 = r5.containsItem(r2)
            if (r4 == 0) goto L2b
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment$SavedState> r4 = r5.mSavedStates
            r4.put(r2, r1)
            goto L2b
        L6d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected key in savedState: "
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L82:
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r6 = r5.mFragments
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L95
            r6 = 1
            r5.mHasStaleFragments = r6
            r5.mIsInGracePeriod = r6
            r5.gcFragments()
            r5.scheduleGracePeriodEnd()
        L95:
            return
        L96:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Expected the adapter to be 'fresh' while restoring state."
            r6.<init>(r0)
            throw r6
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final android.os.Parcelable saveState() {
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r1 = r7.mFragments
            int r1 = r1.size()
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment$SavedState> r2 = r7.mSavedStates
            int r2 = r2.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            r1 = 0
            r2 = r1
        L14:
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r3 = r7.mFragments
            int r3 = r3.size()
            if (r2 >= r3) goto L40
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r3 = r7.mFragments
            long r3 = r3.keyAt(r2)
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment> r5 = r7.mFragments
            java.lang.Object r5 = r5.get(r3)
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            if (r5 == 0) goto L3d
            boolean r6 = r5.isAdded()
            if (r6 == 0) goto L3d
            java.lang.String r6 = "f#"
            java.lang.String r3 = createKey(r6, r3)
            androidx.fragment.app.FragmentManager r4 = r7.mFragmentManager
            r4.putFragment(r0, r3, r5)
        L3d:
            int r2 = r2 + 1
            goto L14
        L40:
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment$SavedState> r2 = r7.mSavedStates
            int r2 = r2.size()
            if (r1 >= r2) goto L68
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment$SavedState> r2 = r7.mSavedStates
            long r2 = r2.keyAt(r1)
            boolean r4 = r7.containsItem(r2)
            if (r4 == 0) goto L65
            java.lang.String r4 = "s#"
            java.lang.String r4 = createKey(r4, r2)
            androidx.collection.LongSparseArray<androidx.fragment.app.Fragment$SavedState> r5 = r7.mSavedStates
            java.lang.Object r2 = r5.get(r2)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            r0.putParcelable(r4, r2)
        L65:
            int r1 = r1 + 1
            goto L40
        L68:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag."
            r2.<init>(r0)
            throw r2
    }

    boolean shouldDelayFragmentTransactions() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            boolean r0 = r0.isStateSaved()
            return r0
    }

    public void unregisterFragmentTransactionCallback(androidx.viewpager2.adapter.FragmentStateAdapter.FragmentTransactionCallback r2) {
            r1 = this;
            androidx.viewpager2.adapter.FragmentStateAdapter$FragmentEventDispatcher r0 = r1.mFragmentEventDispatcher
            r0.unregisterCallback(r2)
            return
    }
}
