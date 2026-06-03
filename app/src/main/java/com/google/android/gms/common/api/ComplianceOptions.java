package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ComplianceOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.ComplianceOptions> CREATOR = null;
    public static final com.google.android.gms.common.api.ComplianceOptions zza = null;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final boolean zze;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static final class Builder {
        private int zza;
        private int zzb;
        private int zzc;
        private boolean zzd;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.zza = r0
                r1.zzb = r0
                r0 = 0
                r1.zzc = r0
                r0 = 1
                r1.zzd = r0
                return
        }

        public com.google.android.gms.common.api.ComplianceOptions build() {
                r5 = this;
                com.google.android.gms.common.api.ComplianceOptions r0 = new com.google.android.gms.common.api.ComplianceOptions
                int r1 = r5.zza
                int r2 = r5.zzb
                int r3 = r5.zzc
                boolean r4 = r5.zzd
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        public com.google.android.gms.common.api.ComplianceOptions.Builder setCallerProductId(int r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }

        public com.google.android.gms.common.api.ComplianceOptions.Builder setDataOwnerProductId(int r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        public com.google.android.gms.common.api.ComplianceOptions.Builder setIsUserData(boolean r1) {
                r0 = this;
                r0.zzd = r1
                return r0
        }

        public com.google.android.gms.common.api.ComplianceOptions.Builder setProcessingReason(int r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }
    }

    static {
            com.google.android.gms.common.api.ComplianceOptions$Builder r0 = newBuilder()
            r1 = -1
            r0.setCallerProductId(r1)
            r0.setDataOwnerProductId(r1)
            r1 = 0
            r0.setProcessingReason(r1)
            r1 = 1
            r0.setIsUserData(r1)
            com.google.android.gms.common.api.ComplianceOptions r0 = r0.build()
            com.google.android.gms.common.api.ComplianceOptions.zza = r0
            com.google.android.gms.common.api.zzc r0 = new com.google.android.gms.common.api.zzc
            r0.<init>()
            com.google.android.gms.common.api.ComplianceOptions.CREATOR = r0
            return
    }

    ComplianceOptions(int r1, int r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            return
    }

    public static com.google.android.gms.common.api.ComplianceOptions.Builder newBuilder() {
            com.google.android.gms.common.api.ComplianceOptions$Builder r0 = new com.google.android.gms.common.api.ComplianceOptions$Builder
            r0.<init>()
            return r0
    }

    public static final com.google.android.gms.common.api.ComplianceOptions.Builder newBuilder(android.content.Context r0) {
            com.google.android.gms.common.api.ComplianceOptions$Builder r0 = newBuilder()
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.common.api.ComplianceOptions
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.common.api.ComplianceOptions r4 = (com.google.android.gms.common.api.ComplianceOptions) r4
            int r0 = r3.zzb
            int r2 = r4.zzb
            if (r0 != r2) goto L22
            int r0 = r3.zzc
            int r2 = r4.zzc
            if (r0 != r2) goto L22
            int r0 = r3.zzd
            int r2 = r4.zzd
            if (r0 != r2) goto L22
            boolean r0 = r3.zze
            boolean r4 = r4.zze
            if (r0 != r4) goto L22
            r4 = 1
            return r4
        L22:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.zzb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r4.zzc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r4.zzd
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r3 = r4.zze
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public com.google.android.gms.common.api.ComplianceOptions.Builder toBuilder() {
            r2 = this;
            com.google.android.gms.common.api.ComplianceOptions$Builder r0 = new com.google.android.gms.common.api.ComplianceOptions$Builder
            r0.<init>()
            int r1 = r2.zzb
            r0.setCallerProductId(r1)
            int r1 = r2.zzc
            r0.setDataOwnerProductId(r1)
            int r1 = r2.zzd
            r0.setProcessingReason(r1)
            boolean r1 = r2.zze
            r0.setIsUserData(r1)
            return r0
    }

    public final java.lang.String toString() {
            r8 = this;
            int r0 = r8.zzb
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r2 = r8.zzc
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            int r4 = r8.zzd
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            boolean r6 = r8.zze
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            int r1 = r1 + 55
            int r1 = r1 + r3
            int r1 = r1 + 19
            int r1 = r1 + r5
            int r1 = r1 + 13
            int r1 = r1 + r7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 1
            r3.<init>(r1)
            java.lang.String r1 = "ComplianceOptions{callerProductId="
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = ", dataOwnerProductId="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ", processingReason="
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = ", isUserData="
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = "}"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
    }

    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.zzb
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r4)
            r4 = 2
            int r1 = r2.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r4, r1)
            r4 = 3
            int r1 = r2.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r4, r1)
            r4 = 4
            boolean r1 = r2.zze
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r4, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r0)
            return
    }
}
