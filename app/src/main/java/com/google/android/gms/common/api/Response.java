package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class Response<T extends com.google.android.gms.common.api.Result> {
    private com.google.android.gms.common.api.Result zza;

    public Response() {
            r0 = this;
            r0.<init>()
            return
    }

    protected Response(T r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    protected T getResult() {
            r1 = this;
            com.google.android.gms.common.api.Result r0 = r1.zza
            return r0
    }

    public void setResult(T r1) {
            r0 = this;
            r0.zza = r1
            return
    }
}
