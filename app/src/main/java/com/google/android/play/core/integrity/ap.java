package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class ap extends com.google.android.play.core.integrity.ag {
    final /* synthetic */ com.google.android.play.core.integrity.aq a;

    ap(com.google.android.play.core.integrity.aq r1, java.lang.String r2, long r3) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.a = r1
            r0.<init>(r2, r3)
            return
    }

    @Override // com.google.android.play.core.integrity.ag
    final com.google.android.gms.tasks.Task b(android.app.Activity r2, android.os.Bundle r3) {
            r1 = this;
            com.google.android.play.core.integrity.aq r0 = r1.a
            com.google.android.play.core.integrity.ar r0 = r0.a
            com.google.android.gms.tasks.Task r2 = r0.b(r2, r3)
            return r2
    }
}
