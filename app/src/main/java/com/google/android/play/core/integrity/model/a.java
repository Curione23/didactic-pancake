package com.google.android.play.core.integrity.model;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    private static final java.util.Map a = null;
    private static final java.util.Map b = null;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.play.core.integrity.model.a.a = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.play.core.integrity.model.a.b = r1
            r2 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "Integrity API is not available.\nIntegrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure that Integrity API is enabled in Google Play Console.\n2) Ask the user to update Play Store.\n"
            r0.put(r2, r3)
            r3 = -2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n"
            r0.put(r3, r4)
            r4 = -3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Network error: unable to obtain integrity details.\nRecommended actions:\n1) Ask the user to check and enable their network connection.\n2) For a guided user experience to help the user establish a network connection, you can show either the 'GET_INTEGRITY' or 'GET_STRONG_INTEGRITY' dialog.\n"
            r0.put(r4, r5)
            r5 = -4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "No active account found in the Play Store app. Note that the Play Integrity API now supports unauthenticated requests. This error code is used only for older Play Store versions that lack support.\nAsk the user to authenticate in Play Store.\n"
            r0.put(r5, r6)
            r6 = -5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n"
            r0.put(r6, r7)
            r7 = -6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "Google Play Services is not available or version is too old.\nRecommended actions:\n1) Ask the user to install or update Play Services.\n2) For a guided user experience that helps the user to enable, install or update Play Services, you can show either the 'GET_INTEGRITY' or 'GET_STRONG_INTEGRITY' dialog.\n"
            r0.put(r7, r8)
            r8 = -7
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n"
            r0.put(r8, r9)
            r9 = -8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r10 = "The calling app has made too many requests to the API and has been throttled, or your app has exceeded its daily request quota.\nRetry with an exponential backoff. Request an increase to your daily request quota if you're at your daily request limit.\n"
            r0.put(r9, r10)
            r10 = -9
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r11 = "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n"
            r0.put(r10, r11)
            r11 = -10
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = "Nonce length is too short. The nonce must be a minimum of 16 bytes (before base64 encoding) to allow for a better security.\nRetry with a longer nonce.\n"
            r0.put(r11, r12)
            r12 = -11
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = "Nonce length is too long. The nonce must be less than 500 bytes before base64 encoding.\nRetry with a shorter nonce.\n"
            r0.put(r12, r13)
            r13 = -12
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n"
            r0.put(r13, r14)
            r14 = -13
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r15 = "Nonce is not encoded as a base64 web-safe no-wrap string.\nRetry with correct nonce format.\n"
            r0.put(r14, r15)
            r15 = -14
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r16 = r13
            java.lang.String r13 = "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n"
            r0.put(r15, r13)
            r13 = -15
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r17 = r14
            java.lang.String r14 = "Play Services needs to be updated.\nRecommended actions:\n1) Ask the user to update Google Play Services.\n2) For a guided user experience that helps the user to update Play Services, you can show either the 'GET_INTEGRITY' or 'GET_STRONG_INTEGRITY' dialog.\n"
            r0.put(r13, r14)
            r14 = -16
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r18 = r12
            java.lang.String r12 = "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n"
            r0.put(r14, r12)
            r12 = -100
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r19 = r14
            java.lang.String r14 = "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n"
            r0.put(r12, r14)
            r14 = -17
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r20 = r12
            java.lang.String r12 = "There is a transient error on the calling device.\nRetry with an exponential backoff.\n"
            r0.put(r14, r12)
            java.lang.String r0 = "API_NOT_AVAILABLE"
            r1.put(r2, r0)
            java.lang.String r0 = "NETWORK_ERROR"
            r1.put(r4, r0)
            java.lang.String r0 = "PLAY_STORE_NOT_FOUND"
            r1.put(r3, r0)
            java.lang.String r0 = "PLAY_STORE_ACCOUNT_NOT_FOUND"
            r1.put(r5, r0)
            java.lang.String r0 = "PLAY_STORE_VERSION_OUTDATED"
            r1.put(r15, r0)
            java.lang.String r0 = "APP_NOT_INSTALLED"
            r1.put(r6, r0)
            java.lang.String r0 = "PLAY_SERVICES_NOT_FOUND"
            r1.put(r7, r0)
            java.lang.String r0 = "PLAY_SERVICES_VERSION_OUTDATED"
            r1.put(r13, r0)
            java.lang.String r0 = "APP_UID_MISMATCH"
            r1.put(r8, r0)
            java.lang.String r0 = "TOO_MANY_REQUESTS"
            r1.put(r9, r0)
            java.lang.String r0 = "CANNOT_BIND_TO_SERVICE"
            r1.put(r10, r0)
            java.lang.String r0 = "NONCE_TOO_SHORT"
            r1.put(r11, r0)
            java.lang.String r0 = "NONCE_TOO_LONG"
            r2 = r18
            r1.put(r2, r0)
            java.lang.String r0 = "NONCE_IS_NOT_BASE64"
            r2 = r17
            r1.put(r2, r0)
            java.lang.String r0 = "CLOUD_PROJECT_NUMBER_IS_INVALID"
            r2 = r19
            r1.put(r2, r0)
            java.lang.String r0 = "GOOGLE_SERVER_UNAVAILABLE"
            r2 = r16
            r1.put(r2, r0)
            java.lang.String r0 = "INTERNAL_ERROR"
            r2 = r20
            r1.put(r2, r0)
            java.lang.String r0 = "CLIENT_TRANSIENT_ERROR"
            r1.put(r14, r0)
            return
    }

    public static java.lang.String a(int r3) {
            java.util.Map r0 = com.google.android.play.core.integrity.model.a.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r1 = r0.containsKey(r3)
            if (r1 == 0) goto L3b
            java.util.Map r1 = com.google.android.play.core.integrity.model.a.b
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L15
            goto L3b
        L15:
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
        L3b:
            java.lang.String r3 = ""
            return r3
    }
}
