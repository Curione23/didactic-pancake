package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class an extends com.google.android.play.integrity.internal.al {
    private final com.google.android.play.integrity.internal.ap a;

    an(com.google.android.play.integrity.internal.ap r2, int r3) {
            r1 = this;
            int r0 = r2.size()
            r1.<init>(r0, r3)
            r1.a = r2
            return
    }

    @Override // com.google.android.play.integrity.internal.al
    protected final java.lang.Object a(int r2) {
            r1 = this;
            com.google.android.play.integrity.internal.ap r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            return r2
    }
}
