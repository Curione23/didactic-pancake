package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ResultCallbacks<R extends com.google.android.gms.common.api.Result> implements com.google.android.gms.common.api.ResultCallback<R> {
    public ResultCallbacks() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void onFailure(com.google.android.gms.common.api.Status r1);

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void onResult(R r4) {
            r3 = this;
            com.google.android.gms.common.api.Status r0 = r4.getStatus()
            boolean r1 = r0.isSuccess()
            if (r1 == 0) goto Le
            r3.onSuccess(r4)
            return
        Le:
            r3.onFailure(r0)
            boolean r0 = r4 instanceof com.google.android.gms.common.api.Releasable
            if (r0 == 0) goto L33
            r0 = r4
            com.google.android.gms.common.api.Releasable r0 = (com.google.android.gms.common.api.Releasable) r0     // Catch: java.lang.RuntimeException -> L1c
            r0.release()     // Catch: java.lang.RuntimeException -> L1c
            return
        L1c:
            r0 = move-exception
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String.valueOf(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "ResultCallbacks"
            java.lang.String r2 = "Unable to release "
            java.lang.String r4 = r2.concat(r4)
            android.util.Log.w(r1, r4, r0)
        L33:
            return
    }

    public abstract void onSuccess(R r1);
}
