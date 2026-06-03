package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public interface IntegrityManager {
    com.google.android.gms.tasks.Task<com.google.android.play.core.integrity.IntegrityTokenResponse> requestIntegrityToken(com.google.android.play.core.integrity.IntegrityTokenRequest r1);

    com.google.android.gms.tasks.Task<java.lang.Integer> showDialog(com.google.android.play.core.integrity.IntegrityDialogRequest r1);
}
