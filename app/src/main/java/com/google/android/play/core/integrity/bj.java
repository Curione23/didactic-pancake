package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class bj extends com.google.android.play.integrity.internal.t {
    final /* synthetic */ android.content.Context a;
    final /* synthetic */ com.google.android.play.core.integrity.bs b;

    bj(com.google.android.play.core.integrity.bs r1, com.google.android.gms.tasks.TaskCompletionSource r2, android.content.Context r3) {
            r0 = this;
            r0.a = r3
            java.util.Objects.requireNonNull(r1)
            r0.b = r1
            r0.<init>(r2)
            return
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
            r2 = this;
            android.content.Context r0 = r2.a
            com.google.android.play.core.integrity.bs r1 = r2.b
            com.google.android.gms.tasks.TaskCompletionSource r1 = com.google.android.play.core.integrity.bs.g(r1)
            int r0 = com.google.android.play.integrity.internal.ai.a(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.trySetResult(r0)
            return
    }
}
