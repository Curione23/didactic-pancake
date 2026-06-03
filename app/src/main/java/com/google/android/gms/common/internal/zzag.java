package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzag implements android.os.Parcelable.Creator {
    public zzag() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r10)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        La:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L44
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r10)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r8 = 1
            if (r2 == r8) goto L3f
            r8 = 2
            if (r2 == r8) goto L3a
            r8 = 3
            if (r2 == r8) goto L35
            r8 = 4
            if (r2 == r8) goto L30
            r8 = 5
            if (r2 == r8) goto L2b
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r10, r1)
            goto La
        L2b:
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            goto La
        L30:
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            goto La
        L35:
            boolean r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r1)
            goto La
        L3a:
            boolean r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r10, r1)
            goto La
        L3f:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r10, r1)
            goto La
        L44:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r10, r0)
            com.google.android.gms.common.internal.RootTelemetryConfiguration r10 = new com.google.android.gms.common.internal.RootTelemetryConfiguration
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.RootTelemetryConfiguration[] r1 = new com.google.android.gms.common.internal.RootTelemetryConfiguration[r1]
            return r1
    }
}
