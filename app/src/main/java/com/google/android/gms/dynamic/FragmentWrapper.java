package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentWrapper extends com.google.android.gms.dynamic.IFragmentWrapper.Stub {
    private final android.app.Fragment zza;

    private FragmentWrapper(android.app.Fragment r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public static com.google.android.gms.dynamic.FragmentWrapper wrap(android.app.Fragment r1) {
            if (r1 == 0) goto L8
            com.google.android.gms.dynamic.FragmentWrapper r0 = new com.google.android.gms.dynamic.FragmentWrapper
            r0.<init>(r1)
            return r0
        L8:
            r1 = 0
            return r1
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzA(com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.view.View r2 = (android.view.View) r2
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            android.app.Fragment r0 = r1.zza
            r0.unregisterForContextMenu(r2)
            return
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzb() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            android.app.Activity r0 = r0.getActivity()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final android.os.Bundle zzc() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            android.os.Bundle r0 = r0.getArguments()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzd() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            int r0 = r0.getId()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IFragmentWrapper zze() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            android.app.Fragment r0 = r0.getParentFragment()
            com.google.android.gms.dynamic.FragmentWrapper r0 = wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzf() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            android.content.res.Resources r0 = r0.getResources()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzg() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            boolean r0 = r0.getRetainInstance()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final java.lang.String zzh() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            java.lang.String r0 = r0.getTag()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IFragmentWrapper zzi() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            android.app.Fragment r0 = r0.getTargetFragment()
            com.google.android.gms.dynamic.FragmentWrapper r0 = wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final int zzj() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            int r0 = r0.getTargetRequestCode()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzk() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            boolean r0 = r0.getUserVisibleHint()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final com.google.android.gms.dynamic.IObjectWrapper zzl() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            android.view.View r0 = r0.getView()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzm() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            boolean r0 = r0.isAdded()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzn() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            boolean r0 = r0.isDetached()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzo() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            boolean r0 = r0.isHidden()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzp() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            boolean r0 = r0.isInLayout()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzq() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            boolean r0 = r0.isRemoving()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzr() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            boolean r0 = r0.isResumed()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final boolean zzs() {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            boolean r0 = r0.isVisible()
            return r0
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzt(com.google.android.gms.dynamic.IObjectWrapper r2) {
            r1 = this;
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)
            android.view.View r2 = (android.view.View) r2
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            android.app.Fragment r0 = r1.zza
            r0.registerForContextMenu(r2)
            return
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzu(boolean r2) {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            r0.setHasOptionsMenu(r2)
            return
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzv(boolean r2) {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            r0.setMenuVisibility(r2)
            return
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzw(boolean r2) {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            r0.setRetainInstance(r2)
            return
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzx(boolean r2) {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            r0.setUserVisibleHint(r2)
            return
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzy(android.content.Intent r2) {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            r0.startActivity(r2)
            return
    }

    @Override // com.google.android.gms.dynamic.IFragmentWrapper
    public final void zzz(android.content.Intent r2, int r3) {
            r1 = this;
            android.app.Fragment r0 = r1.zza
            r0.startActivityForResult(r2, r3)
            return
    }
}
