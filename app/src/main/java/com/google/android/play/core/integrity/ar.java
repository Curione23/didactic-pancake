package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class ar {
    final com.google.android.play.integrity.internal.ae a;
    private final com.google.android.play.integrity.internal.s b;
    private final java.lang.String c;
    private final android.content.Context d;
    private final com.google.android.play.core.integrity.ay e;
    private final com.google.android.play.core.integrity.t f;

    ar(android.content.Context r8, com.google.android.play.integrity.internal.s r9, com.google.android.play.core.integrity.ay r10, com.google.android.play.core.integrity.t r11) {
            r7 = this;
            r7.<init>()
            java.lang.String r0 = r8.getPackageName()
            r7.c = r0
            r7.b = r9
            r7.e = r10
            r7.f = r11
            r7.d = r8
            boolean r10 = com.google.android.play.integrity.internal.ai.b(r8)
            if (r10 != 0) goto L23
            r8 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r10 = "Phonesky is not installed."
            r9.b(r10, r8)
            r8 = 0
            r7.a = r8
            return
        L23:
            com.google.android.play.integrity.internal.ae r10 = new com.google.android.play.integrity.internal.ae
            android.content.Intent r4 = com.google.android.play.core.integrity.as.a
            com.google.android.play.core.integrity.am r5 = new com.google.android.play.core.integrity.am
            r5.<init>()
            java.lang.String r3 = "IntegrityService"
            r6 = 0
            r0 = r10
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a = r10
            return
    }

    static /* bridge */ /* synthetic */ android.os.Bundle a(com.google.android.play.core.integrity.ar r2, byte[] r3, java.lang.Long r4) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "package.name"
            java.lang.String r2 = r2.c
            r0.putString(r1, r2)
            java.lang.String r2 = "nonce"
            r0.putByteArray(r2, r3)
            java.lang.String r2 = "playcore.integrity.version.major"
            r3 = 1
            r0.putInt(r2, r3)
            java.lang.String r2 = "playcore.integrity.version.minor"
            r3 = 6
            r0.putInt(r2, r3)
            java.lang.String r2 = "playcore.integrity.version.patch"
            r3 = 0
            r0.putInt(r2, r3)
            if (r4 == 0) goto L2e
            java.lang.String r2 = "cloud.prj"
            long r3 = r4.longValue()
            r0.putLong(r2, r3)
        L2e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 3
            com.google.android.play.integrity.internal.d.b(r3, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.List r2 = com.google.android.play.integrity.internal.d.a(r2)
            r3.<init>(r2)
            java.lang.String r2 = "event_timestamps"
            r0.putParcelableArrayList(r2, r3)
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.play.core.integrity.t e(com.google.android.play.core.integrity.ar r0) {
            com.google.android.play.core.integrity.t r0 = r0.f
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.play.core.integrity.ay f(com.google.android.play.core.integrity.ar r0) {
            com.google.android.play.core.integrity.ay r0 = r0.e
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.play.integrity.internal.s g(com.google.android.play.core.integrity.ar r0) {
            com.google.android.play.integrity.internal.s r0 = r0.b
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String h(com.google.android.play.core.integrity.ar r0) {
            java.lang.String r0 = r0.c
            return r0
    }

    final com.google.android.gms.tasks.Task b(android.app.Activity r11, android.os.Bundle r12) {
            r10 = this;
            com.google.android.play.integrity.internal.ae r0 = r10.a
            if (r0 != 0) goto L11
            com.google.android.play.core.integrity.IntegrityServiceException r11 = new com.google.android.play.core.integrity.IntegrityServiceException
            r12 = 0
            r0 = 0
            r1 = -2
            r11.<init>(r1, r12, r0)
            com.google.android.gms.tasks.Task r11 = com.google.android.gms.tasks.Tasks.forException(r11)
            return r11
        L11:
            java.lang.String r1 = "dialog.intent.type"
            int r8 = r12.getInt(r1)
            com.google.android.play.integrity.internal.s r1 = r10.b
            java.lang.String r2 = r10.c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "requestAndShowDialog(%s, %s)"
            r1.d(r3, r2)
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            com.google.android.play.core.integrity.ao r9 = new com.google.android.play.core.integrity.ao
            r2 = r9
            r3 = r10
            r4 = r1
            r5 = r12
            r6 = r11
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.u(r9, r1)
            com.google.android.gms.tasks.Task r11 = r1.getTask()
            return r11
    }

    public final com.google.android.gms.tasks.Task c(com.google.android.play.core.integrity.IntegrityTokenRequest r11) {
            r10 = this;
            com.google.android.play.integrity.internal.ae r0 = r10.a
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L5c
            android.content.Context r0 = r10.d
            int r0 = com.google.android.play.integrity.internal.ai.a(r0)
            r3 = 82380000(0x4e904e0, float:5.4782514E-36)
            if (r0 < r3) goto L50
            java.lang.String r0 = r11.nonce()     // Catch: java.lang.IllegalArgumentException -> L43
            r1 = 10
            byte[] r6 = android.util.Base64.decode(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L43
            java.lang.Long r7 = r11.cloudProjectNumber()
            com.google.android.play.integrity.internal.s r0 = r10.b
            java.lang.Object[] r1 = new java.lang.Object[]{r11}
            java.lang.String r2 = "requestIntegrityToken(%s)"
            r0.d(r2, r1)
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            com.google.android.play.integrity.internal.ae r1 = r10.a
            com.google.android.play.core.integrity.an r2 = new com.google.android.play.core.integrity.an
            r3 = r2
            r4 = r10
            r5 = r0
            r8 = r0
            r9 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1.u(r2, r0)
            com.google.android.gms.tasks.Task r11 = r0.getTask()
            return r11
        L43:
            r11 = move-exception
            com.google.android.play.core.integrity.IntegrityServiceException r0 = new com.google.android.play.core.integrity.IntegrityServiceException
            r1 = -13
            r0.<init>(r1, r2, r11)
            com.google.android.gms.tasks.Task r11 = com.google.android.gms.tasks.Tasks.forException(r0)
            return r11
        L50:
            com.google.android.play.core.integrity.IntegrityServiceException r11 = new com.google.android.play.core.integrity.IntegrityServiceException
            r0 = -14
            r11.<init>(r0, r2, r1)
            com.google.android.gms.tasks.Task r11 = com.google.android.gms.tasks.Tasks.forException(r11)
            return r11
        L5c:
            com.google.android.play.core.integrity.IntegrityServiceException r11 = new com.google.android.play.core.integrity.IntegrityServiceException
            r0 = -2
            r11.<init>(r0, r2, r1)
            com.google.android.gms.tasks.Task r11 = com.google.android.gms.tasks.Tasks.forException(r11)
            return r11
    }

    public final com.google.android.gms.tasks.Task d(com.google.android.play.core.integrity.IntegrityDialogRequest r7) {
            r6 = this;
            com.google.android.play.core.integrity.IntegrityDialogRequest$IntegrityResponse r0 = r7.integrityResponse()
            int r1 = r7.typeCode()
            boolean r0 = r0.c(r1)
            r1 = 0
            if (r0 != 0) goto L18
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.tasks.Task r7 = com.google.android.gms.tasks.Tasks.forResult(r7)
            return r7
        L18:
            com.google.android.play.core.integrity.IntegrityDialogRequest$IntegrityResponse r0 = r7.integrityResponse()
            r2 = 1
            r0.b(r2)
            com.google.android.play.integrity.internal.s r0 = r6.b
            int r3 = r7.typeCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "checkAndShowDialog(%s)"
            r0.a(r4, r3)
            android.app.Activity r0 = r7.activity()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            int r4 = r7.typeCode()
            java.lang.String r5 = "dialog.intent.type"
            r3.putInt(r5, r4)
            java.lang.String r4 = r6.c
            java.lang.String r5 = "package.name"
            r3.putString(r5, r4)
            java.lang.String r4 = "playcore.integrity.version.major"
            r3.putInt(r4, r2)
            java.lang.String r2 = "playcore.integrity.version.minor"
            r4 = 6
            r3.putInt(r2, r4)
            java.lang.String r2 = "playcore.integrity.version.patch"
            r3.putInt(r2, r1)
            com.google.android.play.core.integrity.IntegrityDialogRequest$IntegrityResponse r1 = r7.integrityResponse()
            boolean r2 = r1 instanceof com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse.TokenResponse
            if (r2 == 0) goto L79
            com.google.android.play.core.integrity.IntegrityDialogRequest$IntegrityResponse$TokenResponse r1 = (com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse.TokenResponse) r1
            com.google.android.play.core.integrity.IntegrityTokenResponse r1 = r1.a()
            boolean r2 = r1 instanceof com.google.android.play.core.integrity.av
            if (r2 == 0) goto L79
            com.google.android.play.core.integrity.av r1 = (com.google.android.play.core.integrity.av) r1
            long r1 = r1.a()
            java.lang.String r4 = "request.token.sid"
            r3.putLong(r4, r1)
        L79:
            com.google.android.play.core.integrity.IntegrityDialogRequest$IntegrityResponse r7 = r7.integrityResponse()
            boolean r1 = r7 instanceof com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse.ExceptionDetails
            if (r1 == 0) goto L90
            com.google.android.play.core.integrity.IntegrityDialogRequest$IntegrityResponse$ExceptionDetails r7 = (com.google.android.play.core.integrity.IntegrityDialogRequest.IntegrityResponse.ExceptionDetails) r7
            com.google.android.play.core.integrity.IntegrityServiceException r7 = r7.a()
            int r7 = r7.getErrorCode()
            java.lang.String r1 = "error.to.remediate"
            r3.putInt(r1, r7)
        L90:
            com.google.android.gms.tasks.Task r7 = r6.b(r0, r3)
            return r7
    }
}
