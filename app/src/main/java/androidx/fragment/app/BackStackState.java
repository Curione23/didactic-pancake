package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class BackStackState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.BackStackState> CREATOR = null;
    final java.util.List<java.lang.String> mFragments;
    final java.util.List<androidx.fragment.app.BackStackRecordState> mTransactions;


    static {
            androidx.fragment.app.BackStackState$1 r0 = new androidx.fragment.app.BackStackState$1
            r0.<init>()
            androidx.fragment.app.BackStackState.CREATOR = r0
            return
    }

    BackStackState(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mFragments = r0
            android.os.Parcelable$Creator<androidx.fragment.app.BackStackRecordState> r0 = androidx.fragment.app.BackStackRecordState.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.mTransactions = r2
            return
    }

    BackStackState(java.util.List<java.lang.String> r1, java.util.List<androidx.fragment.app.BackStackRecordState> r2) {
            r0 = this;
            r0.<init>()
            r0.mFragments = r1
            r0.mTransactions = r2
            return
    }

    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    java.util.List<androidx.fragment.app.BackStackRecord> instantiate(androidx.fragment.app.FragmentManager r6, java.util.Map<java.lang.String, androidx.fragment.app.Fragment> r7) {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            java.util.List<java.lang.String> r1 = r5.mFragments
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List<java.lang.String> r1 = r5.mFragments
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r7.get(r2)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L2b
            java.lang.String r2 = r3.mWho
            r0.put(r2, r3)
            goto L11
        L2b:
            androidx.fragment.app.FragmentStore r3 = r6.getFragmentStore()
            r4 = 0
            androidx.fragment.app.FragmentState r2 = r3.setSavedState(r2, r4)
            if (r2 == 0) goto L11
            androidx.fragment.app.FragmentFactory r3 = r6.getFragmentFactory()
            androidx.fragment.app.FragmentHostCallback r4 = r6.getHost()
            android.content.Context r4 = r4.getContext()
            java.lang.ClassLoader r4 = r4.getClassLoader()
            androidx.fragment.app.Fragment r2 = r2.instantiate(r3, r4)
            java.lang.String r3 = r2.mWho
            r0.put(r3, r2)
            goto L11
        L50:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List<androidx.fragment.app.BackStackRecordState> r1 = r5.mTransactions
            java.util.Iterator r1 = r1.iterator()
        L5b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.BackStackRecordState r2 = (androidx.fragment.app.BackStackRecordState) r2
            androidx.fragment.app.BackStackRecord r2 = r2.instantiate(r6, r0)
            r7.add(r2)
            goto L5b
        L6f:
            return r7
    }

    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.util.List<java.lang.String> r2 = r0.mFragments
            r1.writeStringList(r2)
            java.util.List<androidx.fragment.app.BackStackRecordState> r2 = r0.mTransactions
            r1.writeTypedList(r2)
            return
    }
}
