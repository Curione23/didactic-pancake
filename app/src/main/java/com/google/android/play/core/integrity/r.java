package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements com.google.android.play.core.integrity.t {
    r() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.integrity.t
    public final com.google.android.gms.common.api.ApiException a(android.os.Bundle r4) {
            r3 = this;
            java.lang.String r0 = "error"
            int r0 = r4.getInt(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r2 = "is.error.remediable"
            boolean r4 = r4.getBoolean(r2)
            com.google.android.play.core.integrity.IntegrityServiceException r2 = new com.google.android.play.core.integrity.IntegrityServiceException
            r2.<init>(r0, r4, r1)
            return r2
    }
}
