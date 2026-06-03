package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzq implements android.os.Parcelable.Creator {
    public zzq() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
            r11 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r12)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r8 = r6
            r9 = r8
            r10 = r9
            r4 = r2
            r7 = r4
        Ld:
            int r1 = r12.dataPosition()
            if (r1 >= r0) goto L45
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r12)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L40;
                case 2: goto L3b;
                case 3: goto L36;
                case 4: goto L31;
                case 5: goto L2c;
                case 6: goto L27;
                case 7: goto L1e;
                case 8: goto L22;
                default: goto L1e;
            }
        L1e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r12, r1)
            goto Ld
        L22:
            boolean r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r12, r1)
            goto Ld
        L27:
            boolean r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r12, r1)
            goto Ld
        L2c:
            boolean r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r12, r1)
            goto Ld
        L31:
            android.os.IBinder r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readIBinder(r12, r1)
            goto Ld
        L36:
            boolean r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r12, r1)
            goto Ld
        L3b:
            boolean r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r12, r1)
            goto Ld
        L40:
            java.lang.String r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r12, r1)
            goto Ld
        L45:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r12, r0)
            com.google.android.gms.common.zzp r12 = new com.google.android.gms.common.zzp
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.zzp[] r1 = new com.google.android.gms.common.zzp[r1]
            return r1
    }
}
