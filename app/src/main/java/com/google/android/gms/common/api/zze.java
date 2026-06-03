package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zze implements android.os.Parcelable.Creator {
    public zze() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
            r2 = r3
        L9:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L43
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r5)
            r7 = 1
            if (r6 == r7) goto L3e
            r7 = 2
            if (r6 == r7) goto L39
            r7 = 3
            if (r6 == r7) goto L30
            r7 = 4
            if (r6 == r7) goto L27
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r5)
            goto L9
        L27:
            android.os.Parcelable$Creator<com.google.android.gms.common.ConnectionResult> r3 = com.google.android.gms.common.ConnectionResult.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r9, r5, r3)
            com.google.android.gms.common.ConnectionResult r3 = (com.google.android.gms.common.ConnectionResult) r3
            goto L9
        L30:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r9, r5, r2)
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2
            goto L9
        L39:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r9, r5)
            goto L9
        L3e:
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r5)
            goto L9
        L43:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r0)
            com.google.android.gms.common.api.Status r9 = new com.google.android.gms.common.api.Status
            r9.<init>(r4, r1, r2, r3)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.api.Status[] r1 = new com.google.android.gms.common.api.Status[r1]
            return r1
    }
}
