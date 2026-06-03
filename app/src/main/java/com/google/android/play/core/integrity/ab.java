package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class ab implements com.google.android.play.core.integrity.ba {
    private android.content.Context a;

    private ab() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* synthetic */ ab(com.google.android.play.core.integrity.ad r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.google.android.play.core.integrity.ab a(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            r0 = r2
            android.content.Context r0 = (android.content.Context) r0
            r1.a = r2
            return r1
    }

    @Override // com.google.android.play.core.integrity.ba
    public final com.google.android.play.core.integrity.ac b() {
            r2 = this;
            android.content.Context r0 = r2.a
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            com.google.android.play.integrity.internal.ay.a(r0, r1)
            com.google.android.play.core.integrity.ac r0 = new com.google.android.play.core.integrity.ac
            android.content.Context r1 = r2.a
            r0.<init>(r1)
            return r0
    }
}
