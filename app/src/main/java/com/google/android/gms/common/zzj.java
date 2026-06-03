package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzj extends com.google.android.gms.common.internal.zzw {
    private final int zza;

    protected zzj(byte[] r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 25
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0)
            int r3 = java.util.Arrays.hashCode(r3)
            r2.zza = r3
            return
    }

    protected static byte[] zzf(java.lang.String r1) {
            java.lang.String r0 = "ISO-8859-1"
            byte[] r1 = r1.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.common.internal.zzx
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.common.internal.zzx r4 = (com.google.android.gms.common.internal.zzx) r4     // Catch: android.os.RemoteException -> L27
            int r0 = r4.zze()     // Catch: android.os.RemoteException -> L27
            int r2 = r3.zza     // Catch: android.os.RemoteException -> L27
            if (r0 == r2) goto L11
            return r1
        L11:
            com.google.android.gms.dynamic.IObjectWrapper r4 = r4.zzd()     // Catch: android.os.RemoteException -> L27
            if (r4 == 0) goto L26
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r4)     // Catch: android.os.RemoteException -> L27
            byte[] r4 = (byte[]) r4     // Catch: android.os.RemoteException -> L27
            byte[] r0 = r3.zzc()     // Catch: android.os.RemoteException -> L27
            boolean r4 = java.util.Arrays.equals(r0, r4)     // Catch: android.os.RemoteException -> L27
            return r4
        L26:
            return r1
        L27:
            r4 = move-exception
            java.lang.String r0 = "GoogleCertificates"
            java.lang.String r2 = "Failed to get Google certificates from remote"
            android.util.Log.e(r0, r2, r4)
            return r1
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    abstract byte[] zzc();

    @Override // com.google.android.gms.common.internal.zzx
    public final com.google.android.gms.dynamic.IObjectWrapper zzd() {
            r1 = this;
            byte[] r0 = r1.zzc()
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)
            return r0
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final int zze() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }
}
