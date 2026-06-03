package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class az implements com.google.android.play.integrity.internal.aw {
    private final com.google.android.play.integrity.internal.az a;
    private final com.google.android.play.integrity.internal.az b;

    private az(com.google.android.play.integrity.internal.az r1, com.google.android.play.integrity.internal.az r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static com.google.android.play.core.integrity.az c(com.google.android.play.integrity.internal.az r1, com.google.android.play.integrity.internal.az r2) {
            com.google.android.play.core.integrity.az r0 = new com.google.android.play.core.integrity.az
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.android.play.integrity.internal.bb, com.google.android.play.integrity.internal.ba
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
            r1 = this;
            com.google.android.play.core.integrity.ay r0 = r1.b()
            return r0
    }

    public final com.google.android.play.core.integrity.ay b() {
            r3 = this;
            com.google.android.play.core.integrity.ay r0 = new com.google.android.play.core.integrity.ay
            com.google.android.play.integrity.internal.az r1 = r3.a
            com.google.android.play.integrity.internal.az r2 = r3.b
            r0.<init>(r1, r2)
            return r0
    }
}
