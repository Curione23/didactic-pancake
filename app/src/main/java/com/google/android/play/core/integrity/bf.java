package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bf implements com.google.android.play.integrity.internal.aw {
    private final com.google.android.play.integrity.internal.az a;
    private final com.google.android.play.integrity.internal.az b;

    private bf(com.google.android.play.integrity.internal.az r1, com.google.android.play.integrity.internal.az r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static com.google.android.play.core.integrity.bf b(com.google.android.play.integrity.internal.az r1, com.google.android.play.integrity.internal.az r2) {
            com.google.android.play.core.integrity.bf r0 = new com.google.android.play.core.integrity.bf
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.android.play.integrity.internal.bb, com.google.android.play.integrity.internal.ba
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
            r3 = this;
            com.google.android.play.integrity.internal.az r0 = r3.b
            com.google.android.play.integrity.internal.az r1 = r3.a
            java.lang.Object r1 = r1.a()
            java.lang.Object r0 = r0.a()
            com.google.android.play.core.integrity.be r2 = new com.google.android.play.core.integrity.be
            com.google.android.play.core.integrity.bs r1 = (com.google.android.play.core.integrity.bs) r1
            com.google.android.play.core.integrity.by r0 = (com.google.android.play.core.integrity.by) r0
            r2.<init>(r1, r0)
            return r2
    }
}
