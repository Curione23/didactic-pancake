package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bz implements com.google.android.play.integrity.internal.aw {
    private final com.google.android.play.integrity.internal.az a;

    private bz(com.google.android.play.integrity.internal.az r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static com.google.android.play.core.integrity.bz b(com.google.android.play.integrity.internal.az r1) {
            com.google.android.play.core.integrity.bz r0 = new com.google.android.play.core.integrity.bz
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.play.integrity.internal.bb, com.google.android.play.integrity.internal.ba
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
            r2 = this;
            com.google.android.play.integrity.internal.az r0 = r2.a
            java.lang.Object r0 = r0.a()
            com.google.android.play.core.integrity.by r1 = new com.google.android.play.core.integrity.by
            com.google.android.play.core.integrity.bs r0 = (com.google.android.play.core.integrity.bs) r0
            r1.<init>(r0)
            return r1
    }
}
