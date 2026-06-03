package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class IntegrityManagerFactory {
    private IntegrityManagerFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.play.core.integrity.IntegrityManager create(android.content.Context r0) {
            com.google.android.play.core.integrity.z r0 = com.google.android.play.core.integrity.ah.a(r0)
            com.google.android.play.integrity.internal.az r0 = r0.e
            java.lang.Object r0 = r0.a()
            com.google.android.play.core.integrity.IntegrityManager r0 = (com.google.android.play.core.integrity.IntegrityManager) r0
            return r0
    }

    public static com.google.android.play.core.integrity.StandardIntegrityManager createStandard(android.content.Context r1) {
            r0 = 0
            com.google.android.play.core.integrity.ac r1 = com.google.android.play.core.integrity.bb.a(r1, r0)
            com.google.android.play.integrity.internal.az r1 = r1.f
            java.lang.Object r1 = r1.a()
            com.google.android.play.core.integrity.StandardIntegrityManager r1 = (com.google.android.play.core.integrity.StandardIntegrityManager) r1
            return r1
    }
}
