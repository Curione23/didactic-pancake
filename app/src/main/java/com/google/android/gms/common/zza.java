package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zza implements android.os.Parcelable.Creator {
    public zza() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 0
            r2 = 0
            r6 = r1
            r7 = r6
            r8 = r7
            r4 = r2
            r5 = r4
        Lb:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L4a
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 1
            if (r2 == r3) goto L45
            r3 = 2
            if (r2 == r3) goto L40
            r3 = 3
            if (r2 == r3) goto L36
            r3 = 4
            if (r2 == r3) goto L31
            r3 = 5
            if (r2 == r3) goto L2c
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto Lb
        L2c:
            java.lang.Integer r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIntegerObject(r10, r1)
            goto Lb
        L31:
            java.lang.String r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r10, r1)
            goto Lb
        L36:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r10, r1, r2)
            r6 = r1
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            goto Lb
        L40:
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            goto Lb
        L45:
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            goto Lb
        L4a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.common.ConnectionResult r10 = new com.google.android.gms.common.ConnectionResult
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.ConnectionResult[] r1 = new com.google.android.gms.common.ConnectionResult[r1]
            return r1
    }
}
