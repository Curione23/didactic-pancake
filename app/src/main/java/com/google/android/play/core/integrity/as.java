package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class as {
    static final android.content.Intent a = null;

    static {
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.play.core.integrityservice.BIND_INTEGRITY_SERVICE"
            r0.<init>(r1)
            java.lang.String r1 = "com.android.vending"
            android.content.Intent r0 = r0.setPackage(r1)
            com.google.android.play.core.integrity.as.a = r0
            return
    }
}
