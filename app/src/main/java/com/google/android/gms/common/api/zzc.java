package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc implements android.os.Parcelable.Creator {
    public zzc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 1
            r2 = 0
            r5 = r1
            r3 = r2
            r4 = r3
        L9:
            int r6 = r10.dataPosition()
            if (r6 >= r0) goto L3a
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r6)
            if (r7 == r1) goto L35
            r8 = 2
            if (r7 == r8) goto L30
            r8 = 3
            if (r7 == r8) goto L2b
            r8 = 4
            if (r7 == r8) goto L26
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r6)
            goto L9
        L26:
            boolean r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r6)
            goto L9
        L2b:
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r6)
            goto L9
        L30:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r6)
            goto L9
        L35:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r6)
            goto L9
        L3a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.common.api.ComplianceOptions r10 = new com.google.android.gms.common.api.ComplianceOptions
            r10.<init>(r2, r3, r4, r5)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.api.ComplianceOptions[] r1 = new com.google.android.gms.common.api.ComplianceOptions[r1]
            return r1
    }
}
