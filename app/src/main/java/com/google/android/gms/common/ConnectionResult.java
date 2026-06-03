package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ConnectionResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int API_DISABLED = 23;
    public static final int API_DISABLED_FOR_CONNECTION = 24;
    public static final int API_UNAVAILABLE = 16;
    public static final int CANCELED = 13;
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.ConnectionResult> CREATOR = null;
    public static final int DEVELOPER_ERROR = 10;

    @java.lang.Deprecated
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 1500;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 7;
    public static final int RESOLUTION_ACTIVITY_NOT_FOUND = 22;
    public static final int RESOLUTION_REQUIRED = 6;
    public static final int RESTRICTED_PROFILE = 20;
    public static final com.google.android.gms.common.ConnectionResult RESULT_SUCCESS = null;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UPDATING = 18;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 17;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;
    public static final int UNKNOWN = -1;
    final int zza;
    private final int zzb;
    private final android.app.PendingIntent zzc;
    private final java.lang.String zzd;
    private final java.lang.Integer zze;

    static {
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS = r0
            com.google.android.gms.common.zza r0 = new com.google.android.gms.common.zza
            r0.<init>()
            com.google.android.gms.common.ConnectionResult.CREATOR = r0
            return
    }

    public ConnectionResult(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    ConnectionResult(int r1, int r2, android.app.PendingIntent r3, java.lang.String r4, java.lang.Integer r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            return
    }

    public ConnectionResult(int r2, android.app.PendingIntent r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ConnectionResult(int r7, android.app.PendingIntent r8, java.lang.String r9) {
            r6 = this;
            r1 = 1
            r5 = 0
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public ConnectionResult(int r7, android.app.PendingIntent r8, java.lang.String r9, java.lang.Integer r10) {
            r6 = this;
            r1 = 1
            r0 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    static java.lang.String zza(int r2) {
            r0 = 99
            if (r2 == r0) goto L83
            r0 = 1500(0x5dc, float:2.102E-42)
            if (r2 == r0) goto L80
            switch(r2) {
                case -1: goto L7d;
                case 0: goto L7a;
                case 1: goto L77;
                case 2: goto L74;
                case 3: goto L71;
                case 4: goto L6e;
                case 5: goto L6b;
                case 6: goto L68;
                case 7: goto L65;
                case 8: goto L62;
                case 9: goto L5f;
                case 10: goto L5c;
                case 11: goto L59;
                default: goto Lb;
            }
        Lb:
            switch(r2) {
                case 13: goto L56;
                case 14: goto L53;
                case 15: goto L50;
                case 16: goto L4d;
                case 17: goto L4a;
                case 18: goto L47;
                case 19: goto L44;
                case 20: goto L41;
                case 21: goto L3e;
                case 22: goto L3b;
                case 23: goto L38;
                case 24: goto L34;
                case 25: goto L30;
                default: goto Le;
            }
        Le:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 20
            r1.<init>(r0)
            java.lang.String r0 = "UNKNOWN_ERROR_CODE("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            goto L85
        L30:
            java.lang.String r2 = "API_INSTALL_REQUIRED"
            goto L85
        L34:
            java.lang.String r2 = "API_DISABLED_FOR_CONNECTION"
            goto L85
        L38:
            java.lang.String r2 = "API_DISABLED"
            goto L85
        L3b:
            java.lang.String r2 = "RESOLUTION_ACTIVITY_NOT_FOUND"
            goto L85
        L3e:
            java.lang.String r2 = "API_VERSION_UPDATE_REQUIRED"
            goto L85
        L41:
            java.lang.String r2 = "RESTRICTED_PROFILE"
            goto L85
        L44:
            java.lang.String r2 = "SERVICE_MISSING_PERMISSION"
            goto L85
        L47:
            java.lang.String r2 = "SERVICE_UPDATING"
            goto L85
        L4a:
            java.lang.String r2 = "SIGN_IN_FAILED"
            goto L85
        L4d:
            java.lang.String r2 = "API_UNAVAILABLE"
            goto L85
        L50:
            java.lang.String r2 = "INTERRUPTED"
            goto L85
        L53:
            java.lang.String r2 = "TIMEOUT"
            goto L85
        L56:
            java.lang.String r2 = "CANCELED"
            goto L85
        L59:
            java.lang.String r2 = "LICENSE_CHECK_FAILED"
            goto L85
        L5c:
            java.lang.String r2 = "DEVELOPER_ERROR"
            goto L85
        L5f:
            java.lang.String r2 = "SERVICE_INVALID"
            goto L85
        L62:
            java.lang.String r2 = "INTERNAL_ERROR"
            goto L85
        L65:
            java.lang.String r2 = "NETWORK_ERROR"
            goto L85
        L68:
            java.lang.String r2 = "RESOLUTION_REQUIRED"
            goto L85
        L6b:
            java.lang.String r2 = "INVALID_ACCOUNT"
            goto L85
        L6e:
            java.lang.String r2 = "SIGN_IN_REQUIRED"
            goto L85
        L71:
            java.lang.String r2 = "SERVICE_DISABLED"
            goto L85
        L74:
            java.lang.String r2 = "SERVICE_VERSION_UPDATE_REQUIRED"
            goto L85
        L77:
            java.lang.String r2 = "SERVICE_MISSING"
            goto L85
        L7a:
            java.lang.String r2 = "SUCCESS"
            goto L85
        L7d:
            java.lang.String r2 = "UNKNOWN"
            goto L85
        L80:
            java.lang.String r2 = "DRIVE_EXTERNAL_STORAGE_REQUIRED"
            goto L85
        L83:
            java.lang.String r2 = "UNFINISHED"
        L85:
            return r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.common.ConnectionResult
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.common.ConnectionResult r5 = (com.google.android.gms.common.ConnectionResult) r5
            int r1 = r4.zzb
            int r3 = r5.zzb
            if (r1 != r3) goto L31
            android.app.PendingIntent r1 = r4.zzc
            android.app.PendingIntent r3 = r5.zzc
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L31
            java.lang.String r1 = r4.zzd
            java.lang.String r3 = r5.zzd
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L31
            java.lang.Integer r1 = r4.zze
            java.lang.Integer r5 = r5.zze
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r1, r5)
            if (r5 == 0) goto L31
            return r0
        L31:
            return r2
    }

    public java.lang.Integer getClientMethodKey() {
            r1 = this;
            java.lang.Integer r0 = r1.zze
            return r0
    }

    public int getErrorCode() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public java.lang.String getErrorMessage() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    public android.app.PendingIntent getResolution() {
            r1 = this;
            android.app.PendingIntent r0 = r1.zzc
            return r0
    }

    public boolean hasResolution() {
            r1 = this;
            int r0 = r1.zzb
            if (r0 == 0) goto La
            android.app.PendingIntent r0 = r1.zzc
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r4 = this;
            int r0 = r4.zzb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.app.PendingIntent r1 = r4.zzc
            java.lang.String r2 = r4.zzd
            java.lang.Integer r3 = r4.zze
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public boolean isSuccess() {
            r1 = this;
            int r0 = r1.zzb
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void startResolutionForResult(android.app.Activity r10, int r11) throws android.content.IntentSender.SendIntentException {
            r9 = this;
            boolean r0 = r9.hasResolution()
            if (r0 != 0) goto L7
            return
        L7:
            android.app.PendingIntent r0 = r9.zzc
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r1 = r0
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            android.content.IntentSender r3 = r0.getIntentSender()
            r7 = 0
            r8 = 0
            r5 = 0
            r6 = 0
            r2 = r10
            r4 = r11
            r2.startIntentSenderForResult(r3, r4, r5, r6, r7, r8)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            int r1 = r3.zzb
            java.lang.String r2 = "statusCode"
            java.lang.String r1 = zza(r1)
            r0.add(r2, r1)
            java.lang.String r1 = "resolution"
            android.app.PendingIntent r2 = r3.zzc
            r0.add(r1, r2)
            java.lang.String r1 = "message"
            java.lang.String r2 = r3.zzd
            r0.add(r1, r2)
            java.lang.String r1 = "clientMethodKey"
            java.lang.Integer r2 = r3.zze
            r0.add(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = r4.zza
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            r0 = 2
            int r2 = r4.getErrorCode()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r0, r2)
            android.app.PendingIntent r0 = r4.getResolution()
            r2 = 3
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            r6 = 4
            java.lang.String r0 = r4.getErrorMessage()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r0, r3)
            r6 = 5
            java.lang.Integer r0 = r4.getClientMethodKey()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(r5, r6, r0, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
