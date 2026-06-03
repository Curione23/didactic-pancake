package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class ApiException extends java.lang.Exception {

    @java.lang.Deprecated
    protected final com.google.android.gms.common.api.Status mStatus;

    public ApiException(com.google.android.gms.common.api.Status r6) {
            r5 = this;
            int r0 = r6.getStatusCode()
            java.lang.String r1 = r6.getStatusMessage()
            if (r1 == 0) goto Lf
            java.lang.String r1 = r6.getStatusMessage()
            goto L11
        Lf:
            java.lang.String r1 = ""
        L11:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r2 = r2 + 2
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r0 = ": "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            r5.<init>(r0)
            r5.mStatus = r6
            return
    }

    public com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.mStatus
            return r0
    }

    public int getStatusCode() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.mStatus
            int r0 = r0.getStatusCode()
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getStatusMessage() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.mStatus
            java.lang.String r0 = r0.getStatusMessage()
            return r0
    }
}
