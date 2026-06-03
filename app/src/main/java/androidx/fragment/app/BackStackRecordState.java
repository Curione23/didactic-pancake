package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
final class BackStackRecordState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.BackStackRecordState> CREATOR = null;
    private static final java.lang.String TAG = "FragmentManager";
    final int mBreadCrumbShortTitleRes;
    final java.lang.CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final java.lang.CharSequence mBreadCrumbTitleText;
    final int[] mCurrentMaxLifecycleStates;
    final java.util.ArrayList<java.lang.String> mFragmentWhos;
    final int mIndex;
    final java.lang.String mName;
    final int[] mOldMaxLifecycleStates;
    final int[] mOps;
    final boolean mReorderingAllowed;
    final java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
    final java.util.ArrayList<java.lang.String> mSharedElementTargetNames;
    final int mTransition;


    static {
            androidx.fragment.app.BackStackRecordState$1 r0 = new androidx.fragment.app.BackStackRecordState$1
            r0.<init>()
            androidx.fragment.app.BackStackRecordState.CREATOR = r0
            return
    }

    BackStackRecordState(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int[] r0 = r2.createIntArray()
            r1.mOps = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mFragmentWhos = r0
            int[] r0 = r2.createIntArray()
            r1.mOldMaxLifecycleStates = r0
            int[] r0 = r2.createIntArray()
            r1.mCurrentMaxLifecycleStates = r0
            int r0 = r2.readInt()
            r1.mTransition = r0
            java.lang.String r0 = r2.readString()
            r1.mName = r0
            int r0 = r2.readInt()
            r1.mIndex = r0
            int r0 = r2.readInt()
            r1.mBreadCrumbTitleRes = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.mBreadCrumbTitleText = r0
            int r0 = r2.readInt()
            r1.mBreadCrumbShortTitleRes = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.mBreadCrumbShortTitleText = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mSharedElementSourceNames = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.mSharedElementTargetNames = r0
            int r2 = r2.readInt()
            if (r2 == 0) goto L61
            r2 = 1
            goto L62
        L61:
            r2 = 0
        L62:
            r1.mReorderingAllowed = r2
            return
    }

    BackStackRecordState(androidx.fragment.app.BackStackRecord r9) {
            r8 = this;
            r8.<init>()
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r9.mOps
            int r0 = r0.size()
            int r1 = r0 * 6
            int[] r1 = new int[r1]
            r8.mOps = r1
            boolean r1 = r9.mAddToBackStack
            if (r1 == 0) goto Lad
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r8.mFragmentWhos = r1
            int[] r1 = new int[r0]
            r8.mOldMaxLifecycleStates = r1
            int[] r1 = new int[r0]
            r8.mCurrentMaxLifecycleStates = r1
            r1 = 0
            r2 = r1
        L24:
            if (r1 >= r0) goto L84
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r9.mOps
            java.lang.Object r3 = r3.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.Op) r3
            int[] r4 = r8.mOps
            int r5 = r2 + 1
            int r6 = r3.mCmd
            r4[r2] = r6
            java.util.ArrayList<java.lang.String> r4 = r8.mFragmentWhos
            androidx.fragment.app.Fragment r6 = r3.mFragment
            if (r6 == 0) goto L41
            androidx.fragment.app.Fragment r6 = r3.mFragment
            java.lang.String r6 = r6.mWho
            goto L42
        L41:
            r6 = 0
        L42:
            r4.add(r6)
            int[] r4 = r8.mOps
            int r6 = r2 + 2
            boolean r7 = r3.mFromExpandedOp
            r4[r5] = r7
            int[] r4 = r8.mOps
            int r5 = r2 + 3
            int r7 = r3.mEnterAnim
            r4[r6] = r7
            int[] r4 = r8.mOps
            int r6 = r2 + 4
            int r7 = r3.mExitAnim
            r4[r5] = r7
            int[] r4 = r8.mOps
            int r5 = r2 + 5
            int r7 = r3.mPopEnterAnim
            r4[r6] = r7
            int[] r4 = r8.mOps
            int r2 = r2 + 6
            int r6 = r3.mPopExitAnim
            r4[r5] = r6
            int[] r4 = r8.mOldMaxLifecycleStates
            androidx.lifecycle.Lifecycle$State r5 = r3.mOldMaxState
            int r5 = r5.ordinal()
            r4[r1] = r5
            int[] r4 = r8.mCurrentMaxLifecycleStates
            androidx.lifecycle.Lifecycle$State r3 = r3.mCurrentMaxState
            int r3 = r3.ordinal()
            r4[r1] = r3
            int r1 = r1 + 1
            goto L24
        L84:
            int r0 = r9.mTransition
            r8.mTransition = r0
            java.lang.String r0 = r9.mName
            r8.mName = r0
            int r0 = r9.mIndex
            r8.mIndex = r0
            int r0 = r9.mBreadCrumbTitleRes
            r8.mBreadCrumbTitleRes = r0
            java.lang.CharSequence r0 = r9.mBreadCrumbTitleText
            r8.mBreadCrumbTitleText = r0
            int r0 = r9.mBreadCrumbShortTitleRes
            r8.mBreadCrumbShortTitleRes = r0
            java.lang.CharSequence r0 = r9.mBreadCrumbShortTitleText
            r8.mBreadCrumbShortTitleText = r0
            java.util.ArrayList<java.lang.String> r0 = r9.mSharedElementSourceNames
            r8.mSharedElementSourceNames = r0
            java.util.ArrayList<java.lang.String> r0 = r9.mSharedElementTargetNames
            r8.mSharedElementTargetNames = r0
            boolean r9 = r9.mReorderingAllowed
            r8.mReorderingAllowed = r9
            return
        Lad:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not on back stack"
            r9.<init>(r0)
            throw r9
    }

    private void fillInBackStackRecord(androidx.fragment.app.BackStackRecord r9) {
            r8 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            int[] r3 = r8.mOps
            int r3 = r3.length
            r4 = 1
            if (r1 >= r3) goto La4
            androidx.fragment.app.FragmentTransaction$Op r3 = new androidx.fragment.app.FragmentTransaction$Op
            r3.<init>()
            int[] r5 = r8.mOps
            int r6 = r1 + 1
            r5 = r5[r1]
            r3.mCmd = r5
            r5 = 2
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
            if (r5 == 0) goto L49
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Instantiate "
            r5.<init>(r7)
            java.lang.StringBuilder r5 = r5.append(r9)
            java.lang.String r7 = " op #"
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r7 = " base fragment #"
            java.lang.StringBuilder r5 = r5.append(r7)
            int[] r7 = r8.mOps
            r7 = r7[r6]
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "FragmentManager"
            android.util.Log.v(r7, r5)
        L49:
            androidx.lifecycle.Lifecycle$State[] r5 = androidx.lifecycle.Lifecycle.State.values()
            int[] r7 = r8.mOldMaxLifecycleStates
            r7 = r7[r2]
            r5 = r5[r7]
            r3.mOldMaxState = r5
            androidx.lifecycle.Lifecycle$State[] r5 = androidx.lifecycle.Lifecycle.State.values()
            int[] r7 = r8.mCurrentMaxLifecycleStates
            r7 = r7[r2]
            r5 = r5[r7]
            r3.mCurrentMaxState = r5
            int[] r5 = r8.mOps
            int r7 = r1 + 2
            r5 = r5[r6]
            if (r5 == 0) goto L6a
            goto L6b
        L6a:
            r4 = r0
        L6b:
            r3.mFromExpandedOp = r4
            int[] r4 = r8.mOps
            int r5 = r1 + 3
            r4 = r4[r7]
            r3.mEnterAnim = r4
            int[] r4 = r8.mOps
            int r6 = r1 + 4
            r4 = r4[r5]
            r3.mExitAnim = r4
            int[] r4 = r8.mOps
            int r5 = r1 + 5
            r4 = r4[r6]
            r3.mPopEnterAnim = r4
            int[] r4 = r8.mOps
            int r1 = r1 + 6
            r4 = r4[r5]
            r3.mPopExitAnim = r4
            int r4 = r3.mEnterAnim
            r9.mEnterAnim = r4
            int r4 = r3.mExitAnim
            r9.mExitAnim = r4
            int r4 = r3.mPopEnterAnim
            r9.mPopEnterAnim = r4
            int r4 = r3.mPopExitAnim
            r9.mPopExitAnim = r4
            r9.addOp(r3)
            int r2 = r2 + 1
            goto L3
        La4:
            int r0 = r8.mTransition
            r9.mTransition = r0
            java.lang.String r0 = r8.mName
            r9.mName = r0
            r9.mAddToBackStack = r4
            int r0 = r8.mBreadCrumbTitleRes
            r9.mBreadCrumbTitleRes = r0
            java.lang.CharSequence r0 = r8.mBreadCrumbTitleText
            r9.mBreadCrumbTitleText = r0
            int r0 = r8.mBreadCrumbShortTitleRes
            r9.mBreadCrumbShortTitleRes = r0
            java.lang.CharSequence r0 = r8.mBreadCrumbShortTitleText
            r9.mBreadCrumbShortTitleText = r0
            java.util.ArrayList<java.lang.String> r0 = r8.mSharedElementSourceNames
            r9.mSharedElementSourceNames = r0
            java.util.ArrayList<java.lang.String> r0 = r8.mSharedElementTargetNames
            r9.mSharedElementTargetNames = r0
            boolean r0 = r8.mReorderingAllowed
            r9.mReorderingAllowed = r0
            return
    }

    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public androidx.fragment.app.BackStackRecord instantiate(androidx.fragment.app.FragmentManager r5) {
            r4 = this;
            androidx.fragment.app.BackStackRecord r0 = new androidx.fragment.app.BackStackRecord
            r0.<init>(r5)
            r4.fillInBackStackRecord(r0)
            int r1 = r4.mIndex
            r0.mIndex = r1
            r1 = 0
        Ld:
            java.util.ArrayList<java.lang.String> r2 = r4.mFragmentWhos
            int r2 = r2.size()
            if (r1 >= r2) goto L30
            java.util.ArrayList<java.lang.String> r2 = r4.mFragmentWhos
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L2d
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r0.mOps
            java.lang.Object r3 = r3.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.Op) r3
            androidx.fragment.app.Fragment r2 = r5.findActiveFragment(r2)
            r3.mFragment = r2
        L2d:
            int r1 = r1 + 1
            goto Ld
        L30:
            r5 = 1
            r0.bumpBackStackNesting(r5)
            return r0
    }

    public androidx.fragment.app.BackStackRecord instantiate(androidx.fragment.app.FragmentManager r4, java.util.Map<java.lang.String, androidx.fragment.app.Fragment> r5) {
            r3 = this;
            androidx.fragment.app.BackStackRecord r0 = new androidx.fragment.app.BackStackRecord
            r0.<init>(r4)
            r3.fillInBackStackRecord(r0)
            r4 = 0
        L9:
            java.util.ArrayList<java.lang.String> r1 = r3.mFragmentWhos
            int r1 = r1.size()
            if (r4 >= r1) goto L58
            java.util.ArrayList<java.lang.String> r1 = r3.mFragmentWhos
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L55
            java.lang.Object r2 = r5.get(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L2e
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r0.mOps
            java.lang.Object r1 = r1.get(r4)
            androidx.fragment.app.FragmentTransaction$Op r1 = (androidx.fragment.app.FragmentTransaction.Op) r1
            r1.mFragment = r2
            goto L55
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Restoring FragmentTransaction "
            r5.<init>(r0)
            java.lang.String r0 = r3.mName
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r0 = " failed due to missing saved state for Fragment ("
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r0 = ")"
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L55:
            int r4 = r4 + 1
            goto L9
        L58:
            return r0
    }

    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int[] r3 = r1.mOps
            r2.writeIntArray(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.mFragmentWhos
            r2.writeStringList(r3)
            int[] r3 = r1.mOldMaxLifecycleStates
            r2.writeIntArray(r3)
            int[] r3 = r1.mCurrentMaxLifecycleStates
            r2.writeIntArray(r3)
            int r3 = r1.mTransition
            r2.writeInt(r3)
            java.lang.String r3 = r1.mName
            r2.writeString(r3)
            int r3 = r1.mIndex
            r2.writeInt(r3)
            int r3 = r1.mBreadCrumbTitleRes
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.mBreadCrumbTitleText
            r0 = 0
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            int r3 = r1.mBreadCrumbShortTitleRes
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.mBreadCrumbShortTitleText
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            java.util.ArrayList<java.lang.String> r3 = r1.mSharedElementSourceNames
            r2.writeStringList(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.mSharedElementTargetNames
            r2.writeStringList(r3)
            boolean r3 = r1.mReorderingAllowed
            r2.writeInt(r3)
            return
    }
}
