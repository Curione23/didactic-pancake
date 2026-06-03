package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class IntegrityTokenResponse {
    public IntegrityTokenResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public abstract com.google.android.gms.tasks.Task<java.lang.Integer> showDialog(android.app.Activity r1, int r2);

    public abstract java.lang.String token();
}
