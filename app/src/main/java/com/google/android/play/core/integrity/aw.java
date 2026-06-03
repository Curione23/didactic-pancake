package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class aw extends android.os.ResultReceiver {
    final /* synthetic */ com.google.android.play.core.integrity.ax a;

    aw(com.google.android.play.core.integrity.ax r1, android.os.Handler r2) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.a = r1
            r0.<init>(r2)
            return
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int r3, android.os.Bundle r4) {
            r2 = this;
            r4 = 3
            r0 = 1
            if (r3 == r0) goto L22
            r1 = 2
            if (r3 == r1) goto L16
            if (r3 == r4) goto La
            return
        La:
            com.google.android.play.core.integrity.ax r3 = r2.a
            com.google.android.gms.tasks.TaskCompletionSource r3 = r3.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r3.trySetResult(r4)
            return
        L16:
            com.google.android.play.core.integrity.ax r3 = r2.a
            com.google.android.gms.tasks.TaskCompletionSource r3 = r3.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3.trySetResult(r4)
            return
        L22:
            com.google.android.play.core.integrity.ax r3 = r2.a
            com.google.android.gms.tasks.TaskCompletionSource r3 = r3.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.trySetResult(r4)
            return
    }
}
