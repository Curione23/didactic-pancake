package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class UserRecoverableException extends java.lang.Exception {
    private final android.content.Intent zza;

    public UserRecoverableException(java.lang.String r1, android.content.Intent r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zza = r2
            return
    }

    public android.content.Intent getIntent() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Intent r1 = r2.zza
            r0.<init>(r1)
            return r0
    }
}
