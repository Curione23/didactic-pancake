package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class LifecycleActivity {
    private final java.lang.Object zza;

    public LifecycleActivity(android.app.Activity r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Activity must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zza = r2
            return
    }

    @java.lang.Deprecated
    public LifecycleActivity(android.content.ContextWrapper r1) {
            r0 = this;
            r0.<init>()
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public final boolean zza() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            boolean r0 = r0 instanceof androidx.fragment.app.FragmentActivity
            return r0
    }

    public final boolean zzb() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            boolean r0 = r0 instanceof android.app.Activity
            return r0
    }

    public final android.app.Activity zzc() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
    }

    public final androidx.fragment.app.FragmentActivity zzd() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            return r0
    }
}
