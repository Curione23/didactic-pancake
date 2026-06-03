package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class y implements com.google.android.play.core.integrity.ae {
    private android.content.Context a;

    private y() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* synthetic */ y(com.google.android.play.core.integrity.aa r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.google.android.play.core.integrity.y a(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            r0 = r2
            android.content.Context r0 = (android.content.Context) r0
            r1.a = r2
            return r1
    }

    @Override // com.google.android.play.core.integrity.ae
    public final com.google.android.play.core.integrity.z b() {
            r2 = this;
            android.content.Context r0 = r2.a
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            com.google.android.play.integrity.internal.ay.a(r0, r1)
            com.google.android.play.core.integrity.z r0 = new com.google.android.play.core.integrity.z
            android.content.Context r1 = r2.a
            r0.<init>(r1)
            return r0
    }
}
