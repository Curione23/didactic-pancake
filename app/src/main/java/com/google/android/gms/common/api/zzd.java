package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzd implements android.os.Parcelable.Creator {
    public zzd() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r7)
            r1 = 0
            r2 = 0
        L6:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L28
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r7)
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r3)
            r5 = 1
            if (r4 == r5) goto L23
            r5 = 2
            if (r4 == r5) goto L1e
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r7, r3)
            goto L6
        L1e:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r7, r3)
            goto L6
        L23:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r7, r3)
            goto L6
        L28:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r7, r0)
            com.google.android.gms.common.api.Scope r7 = new com.google.android.gms.common.api.Scope
            r7.<init>(r2, r1)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.api.Scope[] r1 = new com.google.android.gms.common.api.Scope[r1]
            return r1
    }
}
