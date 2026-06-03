package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzb extends com.google.android.gms.internal.common.zzg {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;

    public zzb(com.google.android.gms.common.internal.BaseGmsClient r1, android.os.Looper r2) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            r0.<init>(r2)
            return
    }

    private static final void zza(android.os.Message r0) {
            java.lang.Object r0 = r0.obj
            com.google.android.gms.common.internal.zzc r0 = (com.google.android.gms.common.internal.zzc) r0
            if (r0 == 0) goto L9
            r0.zze()
        L9:
            return
    }

    private static final boolean zzb(android.os.Message r3) {
            int r0 = r3.what
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L12
            int r0 = r3.what
            if (r0 == r2) goto L12
            int r3 = r3.what
            r0 = 7
            if (r3 != r0) goto L10
            goto L12
        L10:
            r3 = 0
            return r3
        L12:
            return r2
    }

    public final void handleMessage(android.os.Message r9) {
            r8 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r8.zza
            java.util.concurrent.atomic.AtomicInteger r1 = r0.zzd
            int r1 = r1.get()
            int r2 = r9.arg1
            if (r1 == r2) goto L16
            boolean r0 = zzb(r9)
            if (r0 == 0) goto L15
            zza(r9)
        L15:
            return
        L16:
            int r1 = r9.what
            r2 = 4
            r3 = 1
            r4 = 5
            if (r1 == r3) goto L30
            int r1 = r9.what
            r5 = 7
            if (r1 == r5) goto L30
            int r1 = r9.what
            if (r1 != r2) goto L2c
            boolean r1 = r0.enableLocalFallback()
            if (r1 == 0) goto L30
        L2c:
            int r1 = r9.what
            if (r1 != r4) goto L36
        L30:
            boolean r1 = r0.isConnecting()
            if (r1 == 0) goto L114
        L36:
            int r1 = r9.what
            r5 = 8
            r6 = 3
            r7 = 0
            if (r1 != r2) goto L72
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            int r9 = r9.arg2
            r1.<init>(r9)
            r0.zzn(r1)
            boolean r9 = r0.zzg()
            if (r9 == 0) goto L59
            boolean r9 = r0.zzo()
            if (r9 == 0) goto L55
            goto L59
        L55:
            r0.zzd(r6, r7)
            return
        L59:
            com.google.android.gms.common.ConnectionResult r9 = r0.zzm()
            if (r9 == 0) goto L64
            com.google.android.gms.common.ConnectionResult r9 = r0.zzm()
            goto L69
        L64:
            com.google.android.gms.common.ConnectionResult r9 = new com.google.android.gms.common.ConnectionResult
            r9.<init>(r5)
        L69:
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r1 = r0.zzc
            r1.onReportServiceBinding(r9)
            r0.onConnectionFailed(r9)
            return
        L72:
            int r1 = r9.what
            if (r1 != r4) goto L8f
            com.google.android.gms.common.ConnectionResult r9 = r0.zzm()
            if (r9 == 0) goto L81
            com.google.android.gms.common.ConnectionResult r9 = r0.zzm()
            goto L86
        L81:
            com.google.android.gms.common.ConnectionResult r9 = new com.google.android.gms.common.ConnectionResult
            r9.<init>(r5)
        L86:
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r1 = r0.zzc
            r1.onReportServiceBinding(r9)
            r0.onConnectionFailed(r9)
            return
        L8f:
            int r1 = r9.what
            if (r1 != r6) goto Lae
            java.lang.Object r1 = r9.obj
            boolean r1 = r1 instanceof android.app.PendingIntent
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r9.obj
            r7 = r1
            android.app.PendingIntent r7 = (android.app.PendingIntent) r7
        L9e:
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            int r9 = r9.arg2
            r1.<init>(r9, r7)
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r9 = r0.zzc
            r9.onReportServiceBinding(r1)
            r0.onConnectionFailed(r1)
            return
        Lae:
            int r1 = r9.what
            r2 = 6
            if (r1 != r2) goto Lce
            r0.zzd(r4, r7)
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r1 = r0.zzk()
            if (r1 == 0) goto Lc5
            int r1 = r9.arg2
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r2 = r0.zzk()
            r2.onConnectionSuspended(r1)
        Lc5:
            int r9 = r9.arg2
            r0.onConnectionSuspended(r9)
            r0.zze(r4, r3, r7)
            return
        Lce:
            int r1 = r9.what
            r2 = 2
            if (r1 != r2) goto Lde
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto Lda
            goto Lde
        Lda:
            zza(r9)
            return
        Lde:
            boolean r0 = zzb(r9)
            if (r0 == 0) goto Lec
            java.lang.Object r9 = r9.obj
            com.google.android.gms.common.internal.zzc r9 = (com.google.android.gms.common.internal.zzc) r9
            r9.zzd()
            return
        Lec:
            int r9 = r9.what
            java.lang.String r0 = java.lang.String.valueOf(r9)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 34
            r1.<init>(r0)
            java.lang.String r0 = "Don't know how to handle message: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r9, r0)
            return
        L114:
            zza(r9)
            return
    }
}
