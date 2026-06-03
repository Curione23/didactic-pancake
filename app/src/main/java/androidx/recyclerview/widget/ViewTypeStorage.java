package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
interface ViewTypeStorage {

    public static class IsolatedViewTypeStorage implements androidx.recyclerview.widget.ViewTypeStorage {
        android.util.SparseArray<androidx.recyclerview.widget.NestedAdapterWrapper> mGlobalTypeToWrapper;
        int mNextViewType;

        class WrapperViewTypeLookup implements androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup {
            private android.util.SparseIntArray mGlobalToLocalMapping;
            private android.util.SparseIntArray mLocalToGlobalMapping;
            final androidx.recyclerview.widget.NestedAdapterWrapper mWrapper;
            final /* synthetic */ androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage this$0;

            WrapperViewTypeLookup(androidx.recyclerview.widget.ViewTypeStorage.IsolatedViewTypeStorage r2, androidx.recyclerview.widget.NestedAdapterWrapper r3) {
                    r1 = this;
                    r1.this$0 = r2
                    r1.<init>()
                    android.util.SparseIntArray r2 = new android.util.SparseIntArray
                    r0 = 1
                    r2.<init>(r0)
                    r1.mLocalToGlobalMapping = r2
                    android.util.SparseIntArray r2 = new android.util.SparseIntArray
                    r2.<init>(r0)
                    r1.mGlobalToLocalMapping = r2
                    r1.mWrapper = r3
                    return
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                    r2 = this;
                    androidx.recyclerview.widget.ViewTypeStorage$IsolatedViewTypeStorage r0 = r2.this$0
                    androidx.recyclerview.widget.NestedAdapterWrapper r1 = r2.mWrapper
                    r0.removeWrapper(r1)
                    return
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int r4) {
                    r3 = this;
                    android.util.SparseIntArray r0 = r3.mGlobalToLocalMapping
                    int r0 = r0.indexOfKey(r4)
                    if (r0 < 0) goto Lf
                    android.util.SparseIntArray r4 = r3.mGlobalToLocalMapping
                    int r4 = r4.valueAt(r0)
                    return r4
                Lf:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "requested global type "
                    r1.<init>(r2)
                    java.lang.StringBuilder r4 = r1.append(r4)
                    java.lang.String r1 = " does not belong to the adapter:"
                    java.lang.StringBuilder r4 = r4.append(r1)
                    androidx.recyclerview.widget.NestedAdapterWrapper r1 = r3.mWrapper
                    androidx.recyclerview.widget.RecyclerView$Adapter<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r1.adapter
                    java.lang.StringBuilder r4 = r4.append(r1)
                    java.lang.String r4 = r4.toString()
                    r0.<init>(r4)
                    throw r0
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int r3) {
                    r2 = this;
                    android.util.SparseIntArray r0 = r2.mLocalToGlobalMapping
                    int r0 = r0.indexOfKey(r3)
                    r1 = -1
                    if (r0 <= r1) goto L10
                    android.util.SparseIntArray r3 = r2.mLocalToGlobalMapping
                    int r3 = r3.valueAt(r0)
                    return r3
                L10:
                    androidx.recyclerview.widget.ViewTypeStorage$IsolatedViewTypeStorage r0 = r2.this$0
                    androidx.recyclerview.widget.NestedAdapterWrapper r1 = r2.mWrapper
                    int r0 = r0.obtainViewType(r1)
                    android.util.SparseIntArray r1 = r2.mLocalToGlobalMapping
                    r1.put(r3, r0)
                    android.util.SparseIntArray r1 = r2.mGlobalToLocalMapping
                    r1.put(r0, r3)
                    return r0
            }
        }

        public IsolatedViewTypeStorage() {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mGlobalTypeToWrapper = r0
                r0 = 0
                r1.mNextViewType = r0
                return
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup createViewTypeWrapper(androidx.recyclerview.widget.NestedAdapterWrapper r2) {
                r1 = this;
                androidx.recyclerview.widget.ViewTypeStorage$IsolatedViewTypeStorage$WrapperViewTypeLookup r0 = new androidx.recyclerview.widget.ViewTypeStorage$IsolatedViewTypeStorage$WrapperViewTypeLookup
                r0.<init>(r1, r2)
                return r0
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public androidx.recyclerview.widget.NestedAdapterWrapper getWrapperForGlobalType(int r4) {
                r3 = this;
                android.util.SparseArray<androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r3.mGlobalTypeToWrapper
                java.lang.Object r0 = r0.get(r4)
                androidx.recyclerview.widget.NestedAdapterWrapper r0 = (androidx.recyclerview.widget.NestedAdapterWrapper) r0
                if (r0 == 0) goto Lb
                return r0
            Lb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Cannot find the wrapper for global view type "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        int obtainViewType(androidx.recyclerview.widget.NestedAdapterWrapper r3) {
                r2 = this;
                int r0 = r2.mNextViewType
                int r1 = r0 + 1
                r2.mNextViewType = r1
                android.util.SparseArray<androidx.recyclerview.widget.NestedAdapterWrapper> r1 = r2.mGlobalTypeToWrapper
                r1.put(r0, r3)
                return r0
        }

        void removeWrapper(androidx.recyclerview.widget.NestedAdapterWrapper r3) {
                r2 = this;
                android.util.SparseArray<androidx.recyclerview.widget.NestedAdapterWrapper> r0 = r2.mGlobalTypeToWrapper
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L1c
                android.util.SparseArray<androidx.recyclerview.widget.NestedAdapterWrapper> r1 = r2.mGlobalTypeToWrapper
                java.lang.Object r1 = r1.valueAt(r0)
                androidx.recyclerview.widget.NestedAdapterWrapper r1 = (androidx.recyclerview.widget.NestedAdapterWrapper) r1
                if (r1 != r3) goto L19
                android.util.SparseArray<androidx.recyclerview.widget.NestedAdapterWrapper> r1 = r2.mGlobalTypeToWrapper
                r1.removeAt(r0)
            L19:
                int r0 = r0 + (-1)
                goto L8
            L1c:
                return
        }
    }

    public static class SharedIdRangeViewTypeStorage implements androidx.recyclerview.widget.ViewTypeStorage {
        android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> mGlobalTypeToWrapper;

        class WrapperViewTypeLookup implements androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup {
            final androidx.recyclerview.widget.NestedAdapterWrapper mWrapper;
            final /* synthetic */ androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage this$0;

            WrapperViewTypeLookup(androidx.recyclerview.widget.ViewTypeStorage.SharedIdRangeViewTypeStorage r1, androidx.recyclerview.widget.NestedAdapterWrapper r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.mWrapper = r2
                    return
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                    r2 = this;
                    androidx.recyclerview.widget.ViewTypeStorage$SharedIdRangeViewTypeStorage r0 = r2.this$0
                    androidx.recyclerview.widget.NestedAdapterWrapper r1 = r2.mWrapper
                    r0.removeWrapper(r1)
                    return
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int r1) {
                    r0 = this;
                    return r1
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int r3) {
                    r2 = this;
                    androidx.recyclerview.widget.ViewTypeStorage$SharedIdRangeViewTypeStorage r0 = r2.this$0
                    android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> r0 = r0.mGlobalTypeToWrapper
                    java.lang.Object r0 = r0.get(r3)
                    java.util.List r0 = (java.util.List) r0
                    if (r0 != 0) goto L18
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    androidx.recyclerview.widget.ViewTypeStorage$SharedIdRangeViewTypeStorage r1 = r2.this$0
                    android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> r1 = r1.mGlobalTypeToWrapper
                    r1.put(r3, r0)
                L18:
                    androidx.recyclerview.widget.NestedAdapterWrapper r1 = r2.mWrapper
                    boolean r1 = r0.contains(r1)
                    if (r1 != 0) goto L25
                    androidx.recyclerview.widget.NestedAdapterWrapper r1 = r2.mWrapper
                    r0.add(r1)
                L25:
                    return r3
            }
        }

        public SharedIdRangeViewTypeStorage() {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mGlobalTypeToWrapper = r0
                return
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup createViewTypeWrapper(androidx.recyclerview.widget.NestedAdapterWrapper r2) {
                r1 = this;
                androidx.recyclerview.widget.ViewTypeStorage$SharedIdRangeViewTypeStorage$WrapperViewTypeLookup r0 = new androidx.recyclerview.widget.ViewTypeStorage$SharedIdRangeViewTypeStorage$WrapperViewTypeLookup
                r0.<init>(r1, r2)
                return r0
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public androidx.recyclerview.widget.NestedAdapterWrapper getWrapperForGlobalType(int r4) {
                r3 = this;
                android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> r0 = r3.mGlobalTypeToWrapper
                java.lang.Object r0 = r0.get(r4)
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L18
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L18
                r4 = 0
                java.lang.Object r4 = r0.get(r4)
                androidx.recyclerview.widget.NestedAdapterWrapper r4 = (androidx.recyclerview.widget.NestedAdapterWrapper) r4
                return r4
            L18:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Cannot find the wrapper for global view type "
                r1.<init>(r2)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        void removeWrapper(androidx.recyclerview.widget.NestedAdapterWrapper r4) {
                r3 = this;
                android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> r0 = r3.mGlobalTypeToWrapper
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L26
                android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> r1 = r3.mGlobalTypeToWrapper
                java.lang.Object r1 = r1.valueAt(r0)
                java.util.List r1 = (java.util.List) r1
                boolean r2 = r1.remove(r4)
                if (r2 == 0) goto L23
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L23
                android.util.SparseArray<java.util.List<androidx.recyclerview.widget.NestedAdapterWrapper>> r1 = r3.mGlobalTypeToWrapper
                r1.removeAt(r0)
            L23:
                int r0 = r0 + (-1)
                goto L8
            L26:
                return
        }
    }

    public interface ViewTypeLookup {
        void dispose();

        int globalToLocal(int r1);

        int localToGlobal(int r1);
    }

    androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup createViewTypeWrapper(androidx.recyclerview.widget.NestedAdapterWrapper r1);

    androidx.recyclerview.widget.NestedAdapterWrapper getWrapperForGlobalType(int r1);
}
