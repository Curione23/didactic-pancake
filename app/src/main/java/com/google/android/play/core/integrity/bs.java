package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class bs {
    final com.google.android.play.integrity.internal.ae a;
    private final com.google.android.play.integrity.internal.s b;
    private final java.lang.String c;
    private final com.google.android.gms.tasks.TaskCompletionSource d;
    private final com.google.android.play.core.integrity.ay e;
    private final com.google.android.play.core.integrity.t f;

    bs(android.content.Context r10, com.google.android.play.integrity.internal.s r11, com.google.android.play.core.integrity.ay r12, com.google.android.play.core.integrity.t r13) {
            r9 = this;
            r9.<init>()
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r9.d = r0
            java.lang.String r1 = r10.getPackageName()
            r9.c = r1
            r9.b = r11
            r9.e = r12
            r9.f = r13
            com.google.android.play.integrity.internal.ae r12 = new com.google.android.play.integrity.internal.ae
            android.content.Intent r6 = com.google.android.play.core.integrity.bt.a
            com.google.android.play.core.integrity.bi r7 = new com.google.android.play.core.integrity.bi
            r7.<init>()
            java.lang.String r5 = "ExpressIntegrityService"
            r8 = 0
            r2 = r12
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.a = r12
            com.google.android.play.core.integrity.bj r11 = new com.google.android.play.core.integrity.bj
            r11.<init>(r9, r0, r10)
            android.os.Handler r10 = r12.c()
            r10.post(r11)
            return
    }

    static /* bridge */ /* synthetic */ android.os.Bundle a(com.google.android.play.core.integrity.bs r2, com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest r3, long r4, long r6, int r8) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "package.name"
            java.lang.String r2 = r2.c
            r0.putString(r1, r2)
            java.lang.String r2 = "cloud.prj"
            r0.putLong(r2, r4)
            java.lang.String r2 = "nonce"
            java.lang.String r4 = r3.requestHash()
            r0.putString(r2, r4)
            java.lang.String r2 = "warm.up.sid"
            r0.putLong(r2, r6)
            java.lang.String r2 = "playcore.integrity.version.major"
            r4 = 1
            r0.putInt(r2, r4)
            java.lang.String r2 = "playcore.integrity.version.minor"
            r4 = 6
            r0.putInt(r2, r4)
            java.lang.String r2 = "playcore.integrity.version.patch"
            r4 = 0
            r0.putInt(r2, r4)
            java.lang.String r2 = "webview.request.mode"
            r0.putInt(r2, r8)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set r3 = r3.verdictOptOut()
            r2.<init>(r3)
            java.lang.String r3 = "request.verdict.opt.out"
            r0.putIntegerArrayList(r3, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 5
            com.google.android.play.integrity.internal.d.b(r3, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.List r2 = com.google.android.play.integrity.internal.d.a(r2)
            r3.<init>(r2)
            java.lang.String r2 = "event_timestamps"
            r0.putParcelableArrayList(r2, r3)
            return r0
    }

    static /* bridge */ /* synthetic */ android.os.Bundle b(com.google.android.play.core.integrity.bs r2, long r3, int r5) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "package.name"
            java.lang.String r2 = r2.c
            r0.putString(r1, r2)
            java.lang.String r2 = "cloud.prj"
            r0.putLong(r2, r3)
            java.lang.String r2 = "playcore.integrity.version.major"
            r3 = 1
            r0.putInt(r2, r3)
            java.lang.String r2 = "playcore.integrity.version.minor"
            r3 = 6
            r0.putInt(r2, r3)
            java.lang.String r2 = "playcore.integrity.version.patch"
            r3 = 0
            r0.putInt(r2, r3)
            java.lang.String r2 = "webview.request.mode"
            r0.putInt(r2, r5)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 4
            com.google.android.play.integrity.internal.d.b(r3, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.List r2 = com.google.android.play.integrity.internal.d.a(r2)
            r3.<init>(r2)
            java.lang.String r2 = "event_timestamps"
            r0.putParcelableArrayList(r2, r3)
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource g(com.google.android.play.core.integrity.bs r0) {
            com.google.android.gms.tasks.TaskCompletionSource r0 = r0.d
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.play.core.integrity.t h(com.google.android.play.core.integrity.bs r0) {
            com.google.android.play.core.integrity.t r0 = r0.f
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.play.core.integrity.ay i(com.google.android.play.core.integrity.bs r0) {
            com.google.android.play.core.integrity.ay r0 = r0.e
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.play.integrity.internal.s j(com.google.android.play.core.integrity.bs r0) {
            com.google.android.play.integrity.internal.s r0 = r0.b
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String k(com.google.android.play.core.integrity.bs r0) {
            java.lang.String r0 = r0.c
            return r0
    }

    static /* bridge */ /* synthetic */ boolean l(com.google.android.play.core.integrity.bs r1, int r2) {
            com.google.android.gms.tasks.TaskCompletionSource r1 = r1.d
            com.google.android.gms.tasks.Task r0 = r1.getTask()
            boolean r0 = r0.isSuccessful()
            if (r0 == 0) goto L27
            if (r2 != 0) goto L12
            r2 = 83420000(0x4f8e360, float:5.851333E-36)
            goto L15
        L12:
            r2 = 83830000(0x4ff24f0, float:5.9984134E-36)
        L15:
            com.google.android.gms.tasks.Task r1 = r1.getTask()
            java.lang.Object r1 = r1.getResult()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 >= r2) goto L27
            r1 = 1
            return r1
        L27:
            r1 = 0
            return r1
    }

    static /* bridge */ /* synthetic */ boolean m(com.google.android.play.core.integrity.bs r1) {
            com.google.android.gms.tasks.TaskCompletionSource r1 = r1.d
            com.google.android.gms.tasks.Task r0 = r1.getTask()
            boolean r0 = r0.isSuccessful()
            if (r0 == 0) goto L1e
            com.google.android.gms.tasks.Task r1 = r1.getTask()
            java.lang.Object r1 = r1.getResult()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L1e
            r1 = 1
            return r1
        L1e:
            r1 = 0
            return r1
    }

    final com.google.android.gms.tasks.Task c(android.app.Activity r10, android.os.Bundle r11) {
            r9 = this;
            java.lang.String r0 = "dialog.intent.type"
            int r7 = r11.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.google.android.play.integrity.internal.s r1 = r9.b
            java.lang.String r2 = "requestAndShowDialog(%s)"
            r1.d(r2, r0)
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            com.google.android.play.core.integrity.bm r8 = new com.google.android.play.core.integrity.bm
            r1 = r8
            r2 = r9
            r3 = r0
            r4 = r11
            r5 = r10
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.android.play.integrity.internal.ae r10 = r9.a
            r10.u(r8, r0)
            com.google.android.gms.tasks.Task r10 = r0.getTask()
            return r10
    }

    public final com.google.android.gms.tasks.Task d(com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest r14, long r15, long r17, int r19) {
            r13 = this;
            r10 = r13
            java.lang.Long r0 = java.lang.Long.valueOf(r17)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.google.android.play.integrity.internal.s r1 = r10.b
            java.lang.String r2 = "requestExpressIntegrityToken(%s)"
            r1.d(r2, r0)
            com.google.android.gms.tasks.TaskCompletionSource r11 = new com.google.android.gms.tasks.TaskCompletionSource
            r11.<init>()
            com.google.android.play.core.integrity.bl r12 = new com.google.android.play.core.integrity.bl
            r0 = r12
            r1 = r13
            r2 = r11
            r3 = r19
            r4 = r14
            r5 = r15
            r7 = r17
            r9 = r11
            r0.<init>(r1, r2, r3, r4, r5, r7, r9)
            com.google.android.play.integrity.internal.ae r0 = r10.a
            r0.u(r12, r11)
            com.google.android.gms.tasks.Task r0 = r11.getTask()
            return r0
    }

    public final com.google.android.gms.tasks.Task e(com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest r7) {
            r6 = this;
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityDialogRequest$StandardIntegrityResponse r0 = r7.standardIntegrityResponse()
            int r1 = r7.typeCode()
            boolean r0 = r0.b(r1)
            r1 = 0
            if (r0 != 0) goto L18
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.tasks.Task r7 = com.google.android.gms.tasks.Tasks.forResult(r7)
            return r7
        L18:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityDialogRequest$StandardIntegrityResponse r0 = r7.standardIntegrityResponse()
            r2 = 1
            r0.a(r2)
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
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityDialogRequest$StandardIntegrityResponse r1 = r7.standardIntegrityResponse()
            boolean r2 = r1 instanceof com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse.TokenResponse
            if (r2 == 0) goto L66
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityDialogRequest$StandardIntegrityResponse$TokenResponse r1 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse.TokenResponse) r1
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r1 = r1.getToken()
            boolean r2 = r1 instanceof com.google.android.play.core.integrity.bw
            if (r2 == 0) goto L66
            com.google.android.play.core.integrity.bw r1 = (com.google.android.play.core.integrity.bw) r1
            long r1 = r1.a()
            java.lang.String r4 = "request.token.sid"
            r3.putLong(r4, r1)
        L66:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityDialogRequest$StandardIntegrityResponse r7 = r7.standardIntegrityResponse()
            boolean r1 = r7 instanceof com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse.ExceptionDetails
            if (r1 == 0) goto L7d
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityDialogRequest$StandardIntegrityResponse$ExceptionDetails r7 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityDialogRequest.StandardIntegrityResponse.ExceptionDetails) r7
            com.google.android.play.core.integrity.StandardIntegrityException r7 = r7.getException()
            int r7 = r7.getErrorCode()
            java.lang.String r1 = "error.to.remediate"
            r3.putInt(r1, r7)
        L7d:
            com.google.android.gms.tasks.Task r7 = r6.c(r0, r3)
            return r7
    }

    public final com.google.android.gms.tasks.Task f(long r11, int r13) {
            r10 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.google.android.play.integrity.internal.s r1 = r10.b
            java.lang.String r2 = "warmUpIntegrityToken(%s)"
            r1.d(r2, r0)
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            com.google.android.play.core.integrity.bk r1 = new com.google.android.play.core.integrity.bk
            r3 = r1
            r4 = r10
            r5 = r0
            r6 = r13
            r7 = r11
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r9)
            com.google.android.play.integrity.internal.ae r11 = r10.a
            r11.u(r1, r0)
            com.google.android.gms.tasks.Task r11 = r0.getTask()
            return r11
    }
}
