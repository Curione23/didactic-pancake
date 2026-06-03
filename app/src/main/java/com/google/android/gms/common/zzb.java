package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb implements android.os.Parcelable.Creator {
    public zzb() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
            r11 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r12)
            r1 = 0
            r2 = -1
            r4 = 0
            r7 = r1
            r10 = r7
            r8 = r2
            r6 = r4
        Lc:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L42
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r12)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 1
            if (r2 == r3) goto L3c
            r3 = 2
            if (r2 == r3) goto L36
            r3 = 3
            if (r2 == r3) goto L30
            r3 = 4
            if (r2 == r3) goto L2a
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r12, r1)
            goto Lc
        L2a:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r12, r1)
            r10 = r1
            goto Lc
        L30:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r12, r1)
            r8 = r1
            goto Lc
        L36:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r12, r1)
            r7 = r1
            goto Lc
        L3c:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r12, r1)
            r6 = r1
            goto Lc
        L42:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r12, r0)
            com.google.android.gms.common.Feature r12 = new com.google.android.gms.common.Feature
            r5 = r12
            r5.<init>(r6, r7, r8, r10)
            return r12
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r1]
            return r1
    }
}
