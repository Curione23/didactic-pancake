package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Scope> CREATOR = null;
    final int zza;
    private final java.lang.String zzb;

    static {
            com.google.android.gms.common.api.zzd r0 = new com.google.android.gms.common.api.zzd
            r0.<init>()
            com.google.android.gms.common.api.Scope.CREATOR = r0
            return
    }

    Scope(int r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "scopeUri must not be null or empty"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3, r0)
            r1.zza = r2
            r1.zzb = r3
            return
    }

    public Scope(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r2)
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.common.api.Scope
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.String r0 = r1.zzb
            com.google.android.gms.common.api.Scope r2 = (com.google.android.gms.common.api.Scope) r2
            java.lang.String r2 = r2.zzb
            boolean r2 = r0.equals(r2)
            return r2
    }

    public java.lang.String getScopeUri() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            java.lang.String r5 = r3.getScopeUri()
            r1 = 0
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r2, r5, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
