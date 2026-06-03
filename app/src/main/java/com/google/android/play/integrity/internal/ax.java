package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ax implements com.google.android.play.integrity.internal.aw {
    private final java.lang.Object a;

    private ax(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static com.google.android.play.integrity.internal.aw b(java.lang.Object r1) {
            com.google.android.play.integrity.internal.ax r0 = new com.google.android.play.integrity.internal.ax
            if (r1 == 0) goto L8
            r0.<init>(r1)
            return r0
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "instance cannot be null"
            r1.<init>(r0)
            throw r1
    }

    @Override // com.google.android.play.integrity.internal.bb, com.google.android.play.integrity.internal.ba
    public final java.lang.Object a() {
            r1 = this;
            java.lang.Object r0 = r1.a
            return r0
    }
}
