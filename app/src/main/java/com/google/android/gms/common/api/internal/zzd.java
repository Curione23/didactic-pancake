package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzd extends androidx.fragment.app.Fragment implements com.google.android.gms.common.api.internal.LifecycleFragment {
    private static final java.util.WeakHashMap zza = null;
    private final com.google.android.gms.common.api.internal.zzc zzb;

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            com.google.android.gms.common.api.internal.zzd.zza = r0
            return
    }

    public zzd() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.common.api.internal.zzc r0 = new com.google.android.gms.common.api.internal.zzc
            r0.<init>()
            r1.zzb = r0
            return
    }

    public static com.google.android.gms.common.api.internal.zzd zza(androidx.fragment.app.FragmentActivity r5) {
            java.lang.String r0 = "SLifecycleFragmentImpl"
            androidx.fragment.app.FragmentManager r1 = r5.getSupportFragmentManager()
            java.util.WeakHashMap r2 = com.google.android.gms.common.api.internal.zzd.zza
            java.lang.Object r3 = r2.get(r5)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L19
            java.lang.Object r3 = r3.get()
            com.google.android.gms.common.api.internal.zzd r3 = (com.google.android.gms.common.api.internal.zzd) r3
            if (r3 == 0) goto L19
            goto L3f
        L19:
            androidx.fragment.app.Fragment r3 = r1.findFragmentByTag(r0)     // Catch: java.lang.ClassCastException -> L40
            com.google.android.gms.common.api.internal.zzd r3 = (com.google.android.gms.common.api.internal.zzd) r3     // Catch: java.lang.ClassCastException -> L40
            if (r3 == 0) goto L27
            boolean r4 = r3.isRemoving()
            if (r4 == 0) goto L37
        L27:
            com.google.android.gms.common.api.internal.zzd r3 = new com.google.android.gms.common.api.internal.zzd
            r3.<init>()
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            androidx.fragment.app.FragmentTransaction r0 = r1.add(r3, r0)
            r0.commitAllowingStateLoss()
        L37:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.put(r5, r0)
        L3f:
            return r3
        L40:
            r5 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            r0.<init>(r1, r5)
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(java.lang.String r2, com.google.android.gms.common.api.internal.LifecycleCallback r3) {
            r1 = this;
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zzb(r2, r3)
            return
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(java.lang.String r2, java.io.FileDescriptor r3, java.io.PrintWriter r4, java.lang.String[] r5) {
            r1 = this;
            super.dump(r2, r3, r4, r5)
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zzl(r2, r3, r4, r5)
            return
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final <T extends com.google.android.gms.common.api.internal.LifecycleCallback> T getCallbackOrNull(java.lang.String r2, java.lang.Class<T> r3) {
            r1 = this;
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            com.google.android.gms.common.api.internal.LifecycleCallback r2 = r0.zza(r2, r3)
            return r2
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final android.app.Activity getLifecycleActivity() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
            r1 = this;
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            boolean r0 = r0.zzc()
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
            r1 = this;
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            boolean r0 = r0.zzd()
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            super.onActivityResult(r2, r3, r4)
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zzh(r2, r3, r4)
            return
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zze(r2)
            return
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zzk()
            return
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
            r1 = this;
            super.onResume()
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zzg()
            return
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            super.onSaveInstanceState(r2)
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zzi(r2)
            return
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
            r1 = this;
            super.onStart()
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zzf()
            return
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
            r1 = this;
            super.onStop()
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zzj()
            return
    }
}
