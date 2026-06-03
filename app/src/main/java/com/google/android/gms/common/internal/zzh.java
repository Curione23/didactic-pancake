package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzh implements android.os.Parcelable.Creator {
    zzh() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r3) {
            r2 = this;
            com.google.android.gms.common.internal.BinderWrapper r0 = new com.google.android.gms.common.internal.BinderWrapper
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.internal.BinderWrapper[] r1 = new com.google.android.gms.common.internal.BinderWrapper[r1]
            return r1
    }
}
