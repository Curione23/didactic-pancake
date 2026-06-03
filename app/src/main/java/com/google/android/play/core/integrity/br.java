package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class br extends com.google.android.play.integrity.internal.t {
    final /* synthetic */ com.google.android.play.core.integrity.bs g;

    br(com.google.android.play.core.integrity.bs r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.g = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void a(java.lang.Exception r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.play.integrity.internal.af
            if (r0 != 0) goto L8
            super.a(r4)
            return
        L8:
            com.google.android.play.core.integrity.bs r0 = r3.g
            boolean r0 = com.google.android.play.core.integrity.bs.m(r0)
            r1 = 0
            if (r0 == 0) goto L1b
            com.google.android.play.core.integrity.StandardIntegrityException r0 = new com.google.android.play.core.integrity.StandardIntegrityException
            r2 = -2
            r0.<init>(r2, r1, r4)
            super.a(r0)
            return
        L1b:
            com.google.android.play.core.integrity.StandardIntegrityException r0 = new com.google.android.play.core.integrity.StandardIntegrityException
            r2 = -9
            r0.<init>(r2, r1, r4)
            super.a(r0)
            return
    }
}
