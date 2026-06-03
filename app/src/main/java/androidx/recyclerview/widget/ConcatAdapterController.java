package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
class ConcatAdapterController implements androidx.recyclerview.widget.NestedAdapterWrapper.Callback {
    private java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> mAttachedRecyclerViews;
    private final java.util.IdentityHashMap<androidx.recyclerview.widget.RecyclerView.ViewHolder, androidx.recyclerview.widget.NestedAdapterWrapper> mBinderLookup;
    private final androidx.recyclerview.widget.ConcatAdapter mConcatAdapter;
    private androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition mReusableHolder;
    private final androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode mStableIdMode;
    private final androidx.recyclerview.widget.StableIdStorage mStableIdStorage;
    private final androidx.recyclerview.widget.ViewTypeStorage mViewTypeStorage;
    private java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> mWrappers;

    static class WrapperAndLocalPosition {
        boolean mInUse;
        int mLocalPosition;
        androidx.recyclerview.widget.NestedAdapterWrapper mWrapper;

        WrapperAndLocalPosition() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    ConcatAdapterController(androidx.recyclerview.widget.ConcatAdapter r2, androidx.recyclerview.widget.ConcatAdapter.Config r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mAttachedRecyclerViews = r0
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            r1.mBinderLookup = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mWrappers = r0
            androidx.recyclerview.widget.ConcatAdapterController$WrapperAndLocalPosition r0 = new androidx.recyclerview.widget.ConcatAdapterController$WrapperAndLocalPosition
            r0.<init>()
            r1.mReusableHolder = r0
            r1.mConcatAdapter = r2
            boolean r2 = r3.isolateViewTypes
            if (r2 == 0) goto L2d
            androidx.recyclerview.widget.ViewTypeStorage$IsolatedViewTypeStorage r2 = new androidx.recyclerview.widget.ViewTypeStorage$IsolatedViewTypeStorage
            r2.<init>()
            r1.mViewTypeStorage = r2
            goto L34
        L2d:
            androidx.recyclerview.widget.ViewTypeStorage$SharedIdRangeViewTypeStorage r2 = new androidx.recyclerview.widget.ViewTypeStorage$SharedIdRangeViewTypeStorage
            r2.<init>()
            r1.mViewTypeStorage = r2
        L34:
            androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r2 = r3.stableIdMode
            r1.mStableIdMode = r2
            androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r2 = r3.stableIdMode
            androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r0 = androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS
            if (r2 != r0) goto L46
            androidx.recyclerview.widget.StableIdStorage$NoStableIdStorage r2 = new androidx.recyclerview.widget.StableIdStorage$NoStableIdStorage
            r2.<init>()
            r1.mStableIdStorage = r2
            goto L61
        L46:
            androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r2 = r3.stableIdMode
            androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r0 = androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS
            if (r2 != r0) goto L54
            androidx.recyclerview.widget.StableIdStorage$IsolatedStableIdStorage r2 = new androidx.recyclerview.widget.StableIdStorage$IsolatedStableIdStorage
            r2.<init>()
            r1.mStableIdStorage = r2
            goto L61
        L54:
            androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r2 = r3.stableIdMode
            androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r3 = androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS
            if (r2 != r3) goto L62
            androidx.recyclerview.widget.StableIdStorage$SharedPoolStableIdStorage r2 = new androidx.recyclerview.widget.StableIdStorage$SharedPoolStableIdStorage
            r2.<init>()
            r1.mStableIdStorage = r2
        L61:
            return
        L62:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "unknown stable id mode"
            r2.<init>(r3)
            throw r2
    }

    private void calculateAndUpdateStateRestorationPolicy() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r0 = r2.computeStateRestorationPolicy()
            androidx.recyclerview.widget.ConcatAdapter r1 = r2.mConcatAdapter
            androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = r1.getStateRestorationPolicy()
            if (r0 == r1) goto L11
            androidx.recyclerview.widget.ConcatAdapter r1 = r2.mConcatAdapter
            r1.internalSetStateRestorationPolicy(r0)
        L11:
            return
    }

    private androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy computeStateRestorationPolicy() {
            r4 = this;
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r4.mWrappers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            androidx.recyclerview.widget.NestedAdapterWrapper r1 = (androidx.recyclerview.widget.NestedAdapterWrapper) r1
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r1.adapter
            androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r2 = r2.getStateRestorationPolicy()
            androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r3 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT
            if (r2 != r3) goto L1f
            androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT
            return r0
        L1f:
            androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r3 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY
            if (r2 != r3) goto L6
            int r1 = r1.getCachedItemCount()
            if (r1 != 0) goto L6
            androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT
            return r0
        L2c:
            androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.ALLOW
            return r0
    }

    private int countItemsBefore(androidx.recyclerview.widget.NestedAdapterWrapper r4) {
            r3 = this;
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r3.mWrappers
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r0.next()
            androidx.recyclerview.widget.NestedAdapterWrapper r2 = (androidx.recyclerview.widget.NestedAdapterWrapper) r2
            if (r2 == r4) goto L1b
            int r2 = r2.getCachedItemCount()
            int r1 = r1 + r2
            goto L7
        L1b:
            return r1
    }

    private androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition findWrapperAndLocalPosition(int r6) {
            r5 = this;
            androidx.recyclerview.widget.ConcatAdapterController$WrapperAndLocalPosition r0 = r5.mReusableHolder
            boolean r0 = r0.mInUse
            if (r0 == 0) goto Lc
            androidx.recyclerview.widget.ConcatAdapterController$WrapperAndLocalPosition r0 = new androidx.recyclerview.widget.ConcatAdapterController$WrapperAndLocalPosition
            r0.<init>()
            goto L13
        Lc:
            androidx.recyclerview.widget.ConcatAdapterController$WrapperAndLocalPosition r0 = r5.mReusableHolder
            r1 = 1
            r0.mInUse = r1
            androidx.recyclerview.widget.ConcatAdapterController$WrapperAndLocalPosition r0 = r5.mReusableHolder
        L13:
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r1 = r5.mWrappers
            java.util.Iterator r1 = r1.iterator()
            r2 = r6
        L1a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L37
            java.lang.Object r3 = r1.next()
            androidx.recyclerview.widget.NestedAdapterWrapper r3 = (androidx.recyclerview.widget.NestedAdapterWrapper) r3
            int r4 = r3.getCachedItemCount()
            if (r4 <= r2) goto L31
            r0.mWrapper = r3
            r0.mLocalPosition = r2
            goto L37
        L31:
            int r3 = r3.getCachedItemCount()
            int r2 = r2 - r3
            goto L1a
        L37:
            androidx.recyclerview.widget.NestedAdapterWrapper r1 = r0.mWrapper
            if (r1 == 0) goto L3c
            return r0
        L3c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot find wrapper for "
            r1.<init>(r2)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
    }

    private androidx.recyclerview.widget.NestedAdapterWrapper findWrapperFor(androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> r2) {
            r1 = this;
            int r2 = r1.indexOfWrapper(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r2 = 0
            return r2
        L9:
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r1.mWrappers
            java.lang.Object r2 = r0.get(r2)
            androidx.recyclerview.widget.NestedAdapterWrapper r2 = (androidx.recyclerview.widget.NestedAdapterWrapper) r2
            return r2
    }

    private androidx.recyclerview.widget.NestedAdapterWrapper getWrapper(androidx.recyclerview.widget.RecyclerView.ViewHolder r4) {
            r3 = this;
            java.util.IdentityHashMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r3.mBinderLookup
            java.lang.Object r0 = r0.get(r4)
            androidx.recyclerview.widget.NestedAdapterWrapper r0 = (androidx.recyclerview.widget.NestedAdapterWrapper) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot find wrapper for "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ", seems like it is not bound by this adapter: "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private int indexOfWrapper(androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> r4) {
            r3 = this;
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r3.mWrappers
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L19
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r2 = r3.mWrappers
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.NestedAdapterWrapper r2 = (androidx.recyclerview.widget.NestedAdapterWrapper) r2
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r2.adapter
            if (r2 != r4) goto L16
            return r1
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            r4 = -1
            return r4
    }

    private boolean isAttachedTo(androidx.recyclerview.widget.RecyclerView r3) {
            r2 = this;
            java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> r0 = r2.mAttachedRecyclerViews
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            if (r1 != r3) goto L6
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    private void releaseWrapperAndLocalPosition(androidx.recyclerview.widget.ConcatAdapterController.WrapperAndLocalPosition r2) {
            r1 = this;
            r0 = 0
            r2.mInUse = r0
            r0 = 0
            r2.mWrapper = r0
            r0 = -1
            r2.mLocalPosition = r0
            r1.mReusableHolder = r2
            return
    }

    boolean addAdapter(int r4, androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> r5) {
            r3 = this;
            if (r4 < 0) goto L77
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r3.mWrappers
            int r0 = r0.size()
            if (r4 > r0) goto L77
            boolean r0 = r3.hasStableIds()
            if (r0 == 0) goto L1a
            boolean r0 = r5.hasStableIds()
            java.lang.String r1 = "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS"
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            goto L27
        L1a:
            boolean r0 = r5.hasStableIds()
            if (r0 == 0) goto L27
            java.lang.String r0 = "ConcatAdapter"
            java.lang.String r1 = "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids"
            android.util.Log.w(r0, r1)
        L27:
            androidx.recyclerview.widget.NestedAdapterWrapper r0 = r3.findWrapperFor(r5)
            if (r0 == 0) goto L2f
            r4 = 0
            return r4
        L2f:
            androidx.recyclerview.widget.NestedAdapterWrapper r0 = new androidx.recyclerview.widget.NestedAdapterWrapper
            androidx.recyclerview.widget.ViewTypeStorage r1 = r3.mViewTypeStorage
            androidx.recyclerview.widget.StableIdStorage r2 = r3.mStableIdStorage
            androidx.recyclerview.widget.StableIdStorage$StableIdLookup r2 = r2.createStableIdLookup()
            r0.<init>(r5, r3, r1, r2)
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r1 = r3.mWrappers
            r1.add(r4, r0)
            java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> r4 = r3.mAttachedRecyclerViews
            java.util.Iterator r4 = r4.iterator()
        L47:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r4.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 == 0) goto L47
            r5.onAttachedToRecyclerView(r1)
            goto L47
        L5f:
            int r4 = r0.getCachedItemCount()
            if (r4 <= 0) goto L72
            androidx.recyclerview.widget.ConcatAdapter r4 = r3.mConcatAdapter
            int r5 = r3.countItemsBefore(r0)
            int r0 = r0.getCachedItemCount()
            r4.notifyItemRangeInserted(r5, r0)
        L72:
            r3.calculateAndUpdateStateRestorationPolicy()
            r4 = 1
            return r4
        L77:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Index must be between 0 and "
            r0.<init>(r1)
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r1 = r3.mWrappers
            int r1 = r1.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ". Given:"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    boolean addAdapter(androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r1.mWrappers
            int r0 = r0.size()
            boolean r2 = r1.addAdapter(r0, r2)
            return r2
    }

    public boolean canRestoreState() {
            r2 = this;
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r2.mWrappers
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.recyclerview.widget.NestedAdapterWrapper r1 = (androidx.recyclerview.widget.NestedAdapterWrapper) r1
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r1.adapter
            boolean r1 = r1.canRestoreState()
            if (r1 != 0) goto L6
            r0 = 0
            return r0
        L1c:
            r0 = 1
            return r0
    }

    public androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> getBoundAdapter(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            java.util.IdentityHashMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r1.mBinderLookup
            java.lang.Object r2 = r0.get(r2)
            androidx.recyclerview.widget.NestedAdapterWrapper r2 = (androidx.recyclerview.widget.NestedAdapterWrapper) r2
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r2.adapter
            return r2
    }

    public java.util.List<androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>> getCopyOfAdapters() {
            r3 = this;
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r3.mWrappers
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        Ld:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r1 = r3.mWrappers
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r1 = r3.mWrappers
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            androidx.recyclerview.widget.NestedAdapterWrapper r2 = (androidx.recyclerview.widget.NestedAdapterWrapper) r2
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r2.adapter
            r0.add(r2)
            goto L1e
        L30:
            return r0
    }

    public long getItemId(int r3) {
            r2 = this;
            androidx.recyclerview.widget.ConcatAdapterController$WrapperAndLocalPosition r3 = r2.findWrapperAndLocalPosition(r3)
            androidx.recyclerview.widget.NestedAdapterWrapper r0 = r3.mWrapper
            int r1 = r3.mLocalPosition
            long r0 = r0.getItemId(r1)
            r2.releaseWrapperAndLocalPosition(r3)
            return r0
    }

    public int getItemViewType(int r3) {
            r2 = this;
            androidx.recyclerview.widget.ConcatAdapterController$WrapperAndLocalPosition r3 = r2.findWrapperAndLocalPosition(r3)
            androidx.recyclerview.widget.NestedAdapterWrapper r0 = r3.mWrapper
            int r1 = r3.mLocalPosition
            int r0 = r0.getItemViewType(r1)
            r2.releaseWrapperAndLocalPosition(r3)
            return r0
    }

    public int getLocalAdapterPosition(androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder> r5, androidx.recyclerview.widget.RecyclerView.ViewHolder r6, int r7) {
            r4 = this;
            java.util.IdentityHashMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r4.mBinderLookup
            java.lang.Object r0 = r0.get(r6)
            androidx.recyclerview.widget.NestedAdapterWrapper r0 = (androidx.recyclerview.widget.NestedAdapterWrapper) r0
            if (r0 != 0) goto Lc
            r5 = -1
            return r5
        Lc:
            int r1 = r4.countItemsBefore(r0)
            int r7 = r7 - r1
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r0.adapter
            int r1 = r1.getItemCount()
            if (r7 < 0) goto L22
            if (r7 >= r1) goto L22
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r0.adapter
            int r5 = r0.findRelativeAdapterPositionIn(r5, r6, r7)
            return r5
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Detected inconsistent adapter updates. The local position of the view holder maps to "
            r2.<init>(r3)
            java.lang.StringBuilder r7 = r2.append(r7)
            java.lang.String r2 = " which is out of bounds for the adapter with size "
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r1 = ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:"
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r7 = "adapter:"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    public int getTotalCount() {
            r3 = this;
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r3.mWrappers
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            androidx.recyclerview.widget.NestedAdapterWrapper r2 = (androidx.recyclerview.widget.NestedAdapterWrapper) r2
            int r2 = r2.getCachedItemCount()
            int r1 = r1 + r2
            goto L7
        L19:
            return r1
    }

    public android.util.Pair<androidx.recyclerview.widget.RecyclerView.Adapter<? extends androidx.recyclerview.widget.RecyclerView.ViewHolder>, java.lang.Integer> getWrappedAdapterAndPosition(int r4) {
            r3 = this;
            androidx.recyclerview.widget.ConcatAdapterController$WrapperAndLocalPosition r4 = r3.findWrapperAndLocalPosition(r4)
            android.util.Pair r0 = new android.util.Pair
            androidx.recyclerview.widget.NestedAdapterWrapper r1 = r4.mWrapper
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r1.adapter
            int r2 = r4.mLocalPosition
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r2)
            r3.releaseWrapperAndLocalPosition(r4)
            return r0
    }

    public boolean hasStableIds() {
            r2 = this;
            androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r0 = r2.mStableIdMode
            androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode r1 = androidx.recyclerview.widget.ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView r3) {
            r2 = this;
            boolean r0 = r2.isAttachedTo(r3)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> r0 = r2.mAttachedRecyclerViews
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.add(r1)
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r2.mWrappers
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            androidx.recyclerview.widget.NestedAdapterWrapper r1 = (androidx.recyclerview.widget.NestedAdapterWrapper) r1
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r1.adapter
            r1.onAttachedToRecyclerView(r3)
            goto L17
        L29:
            return
    }

    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.ConcatAdapterController$WrapperAndLocalPosition r4 = r2.findWrapperAndLocalPosition(r4)
            java.util.IdentityHashMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r2.mBinderLookup
            androidx.recyclerview.widget.NestedAdapterWrapper r1 = r4.mWrapper
            r0.put(r3, r1)
            androidx.recyclerview.widget.NestedAdapterWrapper r0 = r4.mWrapper
            int r1 = r4.mLocalPosition
            r0.onBindViewHolder(r3, r1)
            r2.releaseWrapperAndLocalPosition(r4)
            return
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onChanged(androidx.recyclerview.widget.NestedAdapterWrapper r1) {
            r0 = this;
            androidx.recyclerview.widget.ConcatAdapter r1 = r0.mConcatAdapter
            r1.notifyDataSetChanged()
            r0.calculateAndUpdateStateRestorationPolicy()
            return
    }

    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.ViewTypeStorage r0 = r1.mViewTypeStorage
            androidx.recyclerview.widget.NestedAdapterWrapper r0 = r0.getWrapperForGlobalType(r3)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r0.onCreateViewHolder(r2, r3)
            return r2
    }

    public void onDetachedFromRecyclerView(androidx.recyclerview.widget.RecyclerView r4) {
            r3 = this;
            java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> r0 = r3.mAttachedRecyclerViews
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L2d
            java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> r1 = r3.mAttachedRecyclerViews
            java.lang.Object r1 = r1.get(r0)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            if (r2 != 0) goto L1e
            java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> r1 = r3.mAttachedRecyclerViews
            r1.remove(r0)
            goto L2a
        L1e:
            java.lang.Object r1 = r1.get()
            if (r1 != r4) goto L2a
            java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> r1 = r3.mAttachedRecyclerViews
            r1.remove(r0)
            goto L2d
        L2a:
            int r0 = r0 + (-1)
            goto L8
        L2d:
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r3.mWrappers
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()
            androidx.recyclerview.widget.NestedAdapterWrapper r1 = (androidx.recyclerview.widget.NestedAdapterWrapper) r1
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r1.adapter
            r1.onDetachedFromRecyclerView(r4)
            goto L33
        L45:
            return
    }

    public boolean onFailedToRecycleView(androidx.recyclerview.widget.RecyclerView.ViewHolder r4) {
            r3 = this;
            java.util.IdentityHashMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r3.mBinderLookup
            java.lang.Object r0 = r0.get(r4)
            androidx.recyclerview.widget.NestedAdapterWrapper r0 = (androidx.recyclerview.widget.NestedAdapterWrapper) r0
            if (r0 == 0) goto L16
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r0.adapter
            boolean r0 = r0.onFailedToRecycleView(r4)
            java.util.IdentityHashMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.NestedAdapterWrapper> r1 = r3.mBinderLookup
            r1.remove(r4)
            return r0
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot find wrapper for "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ", seems like it is not bound by this adapter: "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeChanged(androidx.recyclerview.widget.NestedAdapterWrapper r2, int r3, int r4) {
            r1 = this;
            int r2 = r1.countItemsBefore(r2)
            androidx.recyclerview.widget.ConcatAdapter r0 = r1.mConcatAdapter
            int r3 = r3 + r2
            r0.notifyItemRangeChanged(r3, r4)
            return
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeChanged(androidx.recyclerview.widget.NestedAdapterWrapper r2, int r3, int r4, java.lang.Object r5) {
            r1 = this;
            int r2 = r1.countItemsBefore(r2)
            androidx.recyclerview.widget.ConcatAdapter r0 = r1.mConcatAdapter
            int r3 = r3 + r2
            r0.notifyItemRangeChanged(r3, r4, r5)
            return
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeInserted(androidx.recyclerview.widget.NestedAdapterWrapper r2, int r3, int r4) {
            r1 = this;
            int r2 = r1.countItemsBefore(r2)
            androidx.recyclerview.widget.ConcatAdapter r0 = r1.mConcatAdapter
            int r3 = r3 + r2
            r0.notifyItemRangeInserted(r3, r4)
            return
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeMoved(androidx.recyclerview.widget.NestedAdapterWrapper r2, int r3, int r4) {
            r1 = this;
            int r2 = r1.countItemsBefore(r2)
            androidx.recyclerview.widget.ConcatAdapter r0 = r1.mConcatAdapter
            int r3 = r3 + r2
            int r4 = r4 + r2
            r0.notifyItemMoved(r3, r4)
            return
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onItemRangeRemoved(androidx.recyclerview.widget.NestedAdapterWrapper r2, int r3, int r4) {
            r1 = this;
            int r2 = r1.countItemsBefore(r2)
            androidx.recyclerview.widget.ConcatAdapter r0 = r1.mConcatAdapter
            int r3 = r3 + r2
            r0.notifyItemRangeRemoved(r3, r4)
            return
    }

    @Override // androidx.recyclerview.widget.NestedAdapterWrapper.Callback
    public void onStateRestorationPolicyChanged(androidx.recyclerview.widget.NestedAdapterWrapper r1) {
            r0 = this;
            r0.calculateAndUpdateStateRestorationPolicy()
            return
    }

    public void onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            androidx.recyclerview.widget.NestedAdapterWrapper r0 = r1.getWrapper(r2)
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r0.adapter
            r0.onViewAttachedToWindow(r2)
            return
    }

    public void onViewDetachedFromWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
            r1 = this;
            androidx.recyclerview.widget.NestedAdapterWrapper r0 = r1.getWrapper(r2)
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r0.adapter
            r0.onViewDetachedFromWindow(r2)
            return
    }

    public void onViewRecycled(androidx.recyclerview.widget.RecyclerView.ViewHolder r4) {
            r3 = this;
            java.util.IdentityHashMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r3.mBinderLookup
            java.lang.Object r0 = r0.get(r4)
            androidx.recyclerview.widget.NestedAdapterWrapper r0 = (androidx.recyclerview.widget.NestedAdapterWrapper) r0
            if (r0 == 0) goto L15
            androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r0 = r0.adapter
            r0.onViewRecycled(r4)
            java.util.IdentityHashMap<androidx.recyclerview.widget.RecyclerView$ViewHolder, androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r3.mBinderLookup
            r0.remove(r4)
            return
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot find wrapper for "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = ", seems like it is not bound by this adapter: "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    boolean removeAdapter(androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> r5) {
            r4 = this;
            int r0 = r4.indexOfWrapper(r5)
            r1 = -1
            if (r0 != r1) goto L9
            r5 = 0
            return r5
        L9:
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r1 = r4.mWrappers
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.NestedAdapterWrapper r1 = (androidx.recyclerview.widget.NestedAdapterWrapper) r1
            int r2 = r4.countItemsBefore(r1)
            java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper> r3 = r4.mWrappers
            r3.remove(r0)
            androidx.recyclerview.widget.ConcatAdapter r0 = r4.mConcatAdapter
            int r3 = r1.getCachedItemCount()
            r0.notifyItemRangeRemoved(r2, r3)
            java.util.List<java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> r0 = r4.mAttachedRecyclerViews
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            if (r2 == 0) goto L29
            r5.onDetachedFromRecyclerView(r2)
            goto L29
        L41:
            r1.dispose()
            r4.calculateAndUpdateStateRestorationPolicy()
            r5 = 1
            return r5
    }
}
