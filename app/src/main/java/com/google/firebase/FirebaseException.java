package com.google.firebase;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public class FirebaseException extends java.lang.Exception {
    @java.lang.Deprecated
    protected FirebaseException() {
            r0 = this;
            r0.<init>()
            return
    }

    public FirebaseException(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "Detail message must not be empty"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2, r0)
            r1.<init>(r2)
            return
    }

    public FirebaseException(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r0 = "Detail message must not be empty"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2, r0)
            r1.<init>(r2, r3)
            return
    }
}
