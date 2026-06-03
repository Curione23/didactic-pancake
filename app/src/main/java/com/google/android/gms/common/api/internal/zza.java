package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zza extends android.app.Fragment implements com.google.android.gms.common.api.internal.LifecycleFragment {
    private static final java.util.WeakHashMap zza = null;
    private final com.google.android.gms.common.api.internal.zzc zzb;

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            com.google.android.gms.common.api.internal.zza.zza = r0
            return
    }

    public zza() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.common.api.internal.zzc r0 = new com.google.android.gms.common.api.internal.zzc
            r0.<init>()
            r1.zzb = r0
            return
    }

    public static com.google.android.gms.common.api.internal.zza zza(android.app.Activity r4) {
            java.lang.String r0 = "LifecycleFragmentImpl"
            java.util.WeakHashMap r1 = com.google.android.gms.common.api.internal.zza.zza
            java.lang.Object r2 = r1.get(r4)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L16
            java.lang.Object r2 = r2.get()
            com.google.android.gms.common.api.internal.zza r2 = (com.google.android.gms.common.api.internal.zza) r2
            if (r2 != 0) goto L15
            goto L16
        L15:
            return r2
        L16:
            android.app.FragmentManager r2 = r4.getFragmentManager()     // Catch: java.lang.ClassCastException -> L45
            android.app.Fragment r2 = r2.findFragmentByTag(r0)     // Catch: java.lang.ClassCastException -> L45
            com.google.android.gms.common.api.internal.zza r2 = (com.google.android.gms.common.api.internal.zza) r2     // Catch: java.lang.ClassCastException -> L45
            if (r2 == 0) goto L28
            boolean r3 = r2.isRemoving()
            if (r3 == 0) goto L3c
        L28:
            com.google.android.gms.common.api.internal.zza r2 = new com.google.android.gms.common.api.internal.zza
            r2.<init>()
            android.app.FragmentManager r3 = r4.getFragmentManager()
            android.app.FragmentTransaction r3 = r3.beginTransaction()
            android.app.FragmentTransaction r0 = r3.add(r2, r0)
            r0.commitAllowingStateLoss()
        L3c:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.put(r4, r0)
            return r2
        L45:
            r4 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl"
            r0.<init>(r1, r4)
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(java.lang.String r2, com.google.android.gms.common.api.internal.LifecycleCallback r3) {
            r1 = this;
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zzb(r2, r3)
            return
    }

    @Override // android.app.Fragment
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
            android.app.Activity r0 = r1.getActivity()
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

    @Override // android.app.Fragment
    public final void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            super.onActivityResult(r2, r3, r4)
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zzh(r2, r3, r4)
            return
    }

    @Override // android.app.Fragment
    public final void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zze(r2)
            return
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zzk()
            return
    }

    @Override // android.app.Fragment
    public final void onResume() {
            r1 = this;
            super.onResume()
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zzg()
            return
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            super.onSaveInstanceState(r2)
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zzi(r2)
            return
    }

    @Override // android.app.Fragment
    public final void onStart() {
            r1 = this;
            super.onStart()
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zzf()
            return
    }

    @Override // android.app.Fragment
    public final void onStop() {
            r1 = this;
            super.onStop()
            com.google.android.gms.common.api.internal.zzc r0 = r1.zzb
            r0.zzj()
            return
    }
}
