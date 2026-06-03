package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bu implements com.google.android.play.integrity.internal.aw {
    private final com.google.android.play.integrity.internal.az a;
    private final com.google.android.play.integrity.internal.az b;
    private final com.google.android.play.integrity.internal.az c;

    private bu(com.google.android.play.integrity.internal.az r1, com.google.android.play.integrity.internal.az r2, com.google.android.play.integrity.internal.az r3, com.google.android.play.integrity.internal.az r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static com.google.android.play.core.integrity.bu b(com.google.android.play.integrity.internal.az r1, com.google.android.play.integrity.internal.az r2, com.google.android.play.integrity.internal.az r3, com.google.android.play.integrity.internal.az r4) {
            com.google.android.play.core.integrity.bu r0 = new com.google.android.play.core.integrity.bu
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // com.google.android.play.integrity.internal.bb, com.google.android.play.integrity.internal.ba
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
            r6 = this;
            com.google.android.play.integrity.internal.az r0 = r6.a
            java.lang.Object r0 = r0.a()
            android.content.Context r0 = (android.content.Context) r0
            com.google.android.play.integrity.internal.az r1 = r6.b
            java.lang.Object r1 = r1.a()
            com.google.android.play.integrity.internal.s r1 = (com.google.android.play.integrity.internal.s) r1
            com.google.android.play.integrity.internal.az r2 = r6.c
            com.google.android.play.core.integrity.az r2 = (com.google.android.play.core.integrity.az) r2
            com.google.android.play.core.integrity.ay r2 = r2.b()
            com.google.android.play.core.integrity.s r3 = new com.google.android.play.core.integrity.s
            r3.<init>()
            com.google.android.play.core.integrity.bs r4 = new com.google.android.play.core.integrity.bs
            r5 = r2
            com.google.android.play.core.integrity.ay r5 = (com.google.android.play.core.integrity.ay) r5
            com.google.android.play.core.integrity.t r3 = (com.google.android.play.core.integrity.t) r3
            r4.<init>(r0, r1, r2, r3)
            return r4
    }
}
