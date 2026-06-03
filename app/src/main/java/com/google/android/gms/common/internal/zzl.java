package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzl implements android.os.Parcelable.Creator {
    public zzl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r11)
            r1 = 0
            r2 = 0
            r4 = r1
            r7 = r4
            r9 = r7
            r5 = r2
            r6 = r5
            r8 = r6
        Lc:
            int r1 = r11.dataPosition()
            if (r1 >= r0) goto L44
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r11)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            switch(r2) {
                case 1: goto L3a;
                case 2: goto L35;
                case 3: goto L30;
                case 4: goto L2b;
                case 5: goto L26;
                case 6: goto L21;
                default: goto L1d;
            }
        L1d:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r11, r1)
            goto Lc
        L21:
            int[] r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(r11, r1)
            goto Lc
        L26:
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r11, r1)
            goto Lc
        L2b:
            int[] r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(r11, r1)
            goto Lc
        L30:
            boolean r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r11, r1)
            goto Lc
        L35:
            boolean r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r11, r1)
            goto Lc
        L3a:
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.RootTelemetryConfiguration> r2 = com.google.android.gms.common.internal.RootTelemetryConfiguration.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r11, r1, r2)
            r4 = r1
            com.google.android.gms.common.internal.RootTelemetryConfiguration r4 = (com.google.android.gms.common.internal.RootTelemetryConfiguration) r4
            goto Lc
        L44:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r11, r0)
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration r11 = new com.google.android.gms.common.internal.ConnectionTelemetryConfiguration
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration[] r1 = new com.google.android.gms.common.internal.ConnectionTelemetryConfiguration[r1]
            return r1
    }
}
