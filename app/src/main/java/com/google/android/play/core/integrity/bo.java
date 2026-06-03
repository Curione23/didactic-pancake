package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class bo extends com.google.android.play.core.integrity.ag {
    final /* synthetic */ com.google.android.play.core.integrity.bp a;

    bo(com.google.android.play.core.integrity.bp r1, java.lang.String r2, long r3) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.a = r1
            r0.<init>(r2, r3)
            return
    }

    @Override // com.google.android.play.core.integrity.ag
    final com.google.android.gms.tasks.Task b(android.app.Activity r5, android.os.Bundle r6) {
            r4 = this;
            com.google.android.play.core.integrity.bp r0 = r4.a
            java.lang.String r1 = "cloud.prj"
            long r2 = com.google.android.play.core.integrity.bp.f(r0)
            r6.putLong(r1, r2)
            com.google.android.play.core.integrity.bs r0 = r0.c
            com.google.android.gms.tasks.Task r5 = r0.c(r5, r6)
            return r5
    }
}
