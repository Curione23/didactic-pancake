package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ApiMetadata extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.ApiMetadata> CREATOR = null;
    public static final com.google.android.gms.common.api.ApiMetadata zza = null;
    private static final com.google.android.gms.common.api.ApiMetadata zzb = null;
    private final com.google.android.gms.common.api.ComplianceOptions zzc;
    private final boolean zzd;
    private boolean zze;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static final class Builder {
        private com.google.android.gms.common.api.ComplianceOptions zza;
        private boolean zzb;
        private boolean zzc;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.zzb = r0
                return
        }

        public com.google.android.gms.common.api.ApiMetadata build() {
                r3 = this;
                com.google.android.gms.common.api.ApiMetadata r0 = new com.google.android.gms.common.api.ApiMetadata
                com.google.android.gms.common.api.ComplianceOptions r1 = r3.zza
                boolean r2 = r3.zzb
                r0.<init>(r1, r2)
                boolean r1 = r3.zzc
                r0.zza(r1)
                return r0
        }

        public com.google.android.gms.common.api.ApiMetadata.Builder setCallbackSupportEnabled(boolean r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        public com.google.android.gms.common.api.ApiMetadata.Builder setComplianceOptions(com.google.android.gms.common.api.ComplianceOptions r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }

        final /* synthetic */ com.google.android.gms.common.api.ApiMetadata.Builder zza(boolean r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }
    }

    static {
            com.google.android.gms.common.api.zza r0 = com.google.android.gms.common.api.zza.zza()
            com.google.android.gms.common.api.ApiMetadata.CREATOR = r0
            com.google.android.gms.common.api.ApiMetadata$Builder r0 = newBuilder()
            com.google.android.gms.common.api.ApiMetadata r0 = r0.build()
            com.google.android.gms.common.api.ApiMetadata.zzb = r0
            com.google.android.gms.common.api.ApiMetadata$Builder r0 = newBuilder()
            r1 = 1
            r0.zza(r1)
            com.google.android.gms.common.api.ApiMetadata r0 = r0.build()
            com.google.android.gms.common.api.ApiMetadata.zza = r0
            return
    }

    ApiMetadata(com.google.android.gms.common.api.ComplianceOptions r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzd = r2
            return
    }

    public static final com.google.android.gms.common.api.ApiMetadata fromComplianceOptions(com.google.android.gms.common.api.ComplianceOptions r1) {
            com.google.android.gms.common.api.ApiMetadata$Builder r0 = newBuilder()
            r0.setComplianceOptions(r1)
            com.google.android.gms.common.api.ApiMetadata r1 = r0.build()
            return r1
    }

    public static final com.google.android.gms.common.api.ApiMetadata getEmptyInstance() {
            com.google.android.gms.common.api.ApiMetadata r0 = com.google.android.gms.common.api.ApiMetadata.zzb
            return r0
    }

    public static com.google.android.gms.common.api.ApiMetadata.Builder newBuilder() {
            com.google.android.gms.common.api.ApiMetadata$Builder r0 = new com.google.android.gms.common.api.ApiMetadata$Builder
            r0.<init>()
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.common.api.ApiMetadata
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.common.api.ApiMetadata r4 = (com.google.android.gms.common.api.ApiMetadata) r4
            com.google.android.gms.common.api.ComplianceOptions r0 = r3.zzc
            com.google.android.gms.common.api.ComplianceOptions r2 = r4.zzc
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L20
            boolean r0 = r3.zze
            boolean r2 = r4.zze
            if (r0 != r2) goto L20
            boolean r0 = r3.zzd
            boolean r4 = r4.zzd
            if (r0 != r4) goto L20
            r4 = 1
            return r4
        L20:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            com.google.android.gms.common.api.ComplianceOptions r0 = r3.zzc
            boolean r1 = r3.zze
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r2 = r3.zzd
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public com.google.android.gms.common.api.ApiMetadata.Builder toBuilder() {
            r2 = this;
            com.google.android.gms.common.api.ApiMetadata$Builder r0 = newBuilder()
            com.google.android.gms.common.api.ComplianceOptions r1 = r2.zzc
            r0.setComplianceOptions(r1)
            boolean r1 = r2.zzd
            r0.setCallbackSupportEnabled(r1)
            boolean r1 = r2.zze
            r0.zza(r1)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.api.ComplianceOptions r0 = r3.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 31
            r2.<init>(r1)
            java.lang.String r1 = "ApiMetadata(complianceOptions="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            boolean r0 = r4.zze
            if (r0 == 0) goto L17
            int r6 = r5.dataPosition()
            int r6 = r6 + (-4)
            r5.setDataPosition(r6)
            int r6 = r5.dataSize()
            int r6 = r6 + (-4)
            r5.setDataSize(r6)
            return
        L17:
            r0 = -204102970(0xfffffffff3d5a2c6, float:-3.385195E31)
            r5.writeInt(r0)
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.common.api.ComplianceOptions r1 = r4.zzc
            r2 = 0
            r3 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r3, r1, r6, r2)
            r6 = 2
            boolean r1 = r4.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    final /* synthetic */ void zza(boolean r1) {
            r0 = this;
            r0.zze = r1
            return
    }
}
