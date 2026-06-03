package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb implements android.os.Parcelable.Creator {
    public zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final com.google.android.gms.common.api.ApiMetadata zza(android.os.Parcel r6) {
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r6)
            r1 = 0
            r2 = 0
        L6:
            int r3 = r6.dataPosition()
            if (r3 >= r0) goto L2c
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r6)
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r3)
            r5 = 1
            if (r4 == r5) goto L23
            r5 = 2
            if (r4 == r5) goto L1e
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r6, r3)
            goto L6
        L1e:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r6, r3)
            goto L6
        L23:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.ComplianceOptions> r2 = com.google.android.gms.common.api.ComplianceOptions.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r6, r3, r2)
            com.google.android.gms.common.api.ComplianceOptions r2 = (com.google.android.gms.common.api.ComplianceOptions) r2
            goto L6
        L2c:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r6, r0)
            com.google.android.gms.common.api.ApiMetadata r6 = new com.google.android.gms.common.api.ApiMetadata
            r6.<init>(r2, r1)
            return r6
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
            r0 = this;
            com.google.android.gms.common.api.ApiMetadata r1 = zza(r1)
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.api.ApiMetadata[] r1 = new com.google.android.gms.common.api.ApiMetadata[r1]
            return r1
    }
}
