package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResolvingResultCallbacks<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.ResultCallbacks<R> {
    private final android.app.Activity zza;
    private final int zzb;

    protected ResolvingResultCallbacks(android.app.Activity r2, int r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Activity must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r0 = r2
            android.app.Activity r0 = (android.app.Activity) r0
            r1.zza = r2
            r1.zzb = r3
            return
    }

    @Override // com.google.android.gms.common.api.ResultCallbacks
    public final void onFailure(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            boolean r0 = r3.hasResolution()
            if (r0 == 0) goto L21
            android.app.Activity r0 = r2.zza     // Catch: android.content.IntentSender.SendIntentException -> Le
            int r1 = r2.zzb     // Catch: android.content.IntentSender.SendIntentException -> Le
            r3.startResolutionForResult(r0, r1)     // Catch: android.content.IntentSender.SendIntentException -> Le
            return
        Le:
            r3 = move-exception
            java.lang.String r0 = "ResolvingResultCallback"
            java.lang.String r1 = "Failed to start resolution"
            android.util.Log.e(r0, r1, r3)
            com.google.android.gms.common.api.Status r3 = new com.google.android.gms.common.api.Status
            r0 = 8
            r3.<init>(r0)
            r2.onUnresolvableFailure(r3)
            return
        L21:
            r2.onUnresolvableFailure(r3)
            return
    }

    @Override // com.google.android.gms.common.api.ResultCallbacks
    public abstract void onSuccess(R r1);

    public abstract void onUnresolvableFailure(com.google.android.gms.common.api.Status r1);
}
