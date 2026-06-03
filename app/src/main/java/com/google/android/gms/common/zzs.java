package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzs implements android.os.Parcelable.Creator {
    public zzs() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r13) {
            r12 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = -1
            r3 = 0
            r4 = 0
            r10 = r1
            r6 = r3
            r8 = r6
            r9 = r8
            r7 = r4
        Ld:
            int r1 = r13.dataPosition()
            if (r1 >= r0) goto L4c
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 1
            if (r2 == r3) goto L46
            r3 = 2
            if (r2 == r3) goto L40
            r3 = 3
            if (r2 == r3) goto L3a
            r3 = 4
            if (r2 == r3) goto L34
            r3 = 5
            if (r2 == r3) goto L2e
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r13, r1)
            goto Ld
        L2e:
            long r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r1)
            r10 = r1
            goto Ld
        L34:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r1)
            r9 = r1
            goto Ld
        L3a:
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r1)
            r8 = r1
            goto Ld
        L40:
            java.lang.String r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r1)
            r7 = r1
            goto Ld
        L46:
            boolean r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r1)
            r6 = r1
            goto Ld
        L4c:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r13, r0)
            com.google.android.gms.common.zzr r13 = new com.google.android.gms.common.zzr
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            return r13
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.zzr[] r1 = new com.google.android.gms.common.zzr[r1]
            return r1
    }
}
