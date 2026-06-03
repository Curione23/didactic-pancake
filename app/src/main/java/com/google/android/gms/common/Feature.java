package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class Feature extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.Feature> CREATOR = null;
    private final java.lang.String zza;

    @java.lang.Deprecated
    private final int zzb;
    private final long zzc;
    private final boolean zzd;

    static {
            com.google.android.gms.common.zzb r0 = new com.google.android.gms.common.zzb
            r0.<init>()
            com.google.android.gms.common.Feature.CREATOR = r0
            return
    }

    public Feature(java.lang.String r7, int r8, long r9) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public Feature(java.lang.String r1, int r2, long r3, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r5
            return
    }

    public Feature(java.lang.String r7, long r8) {
            r6 = this;
            r2 = -1
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public Feature(java.lang.String r7, long r8, boolean r10) {
            r6 = this;
            r2 = -1
            r0 = r6
            r1 = r7
            r3 = r8
            r5 = r10
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.gms.common.Feature
            r1 = 0
            if (r0 == 0) goto L2d
            com.google.android.gms.common.Feature r7 = (com.google.android.gms.common.Feature) r7
            java.lang.String r0 = r6.getName()
            java.lang.String r2 = r7.getName()
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L2d
            long r2 = r6.getVersion()
            long r4 = r7.getVersion()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L2d
            boolean r0 = r6.getIsFullyRolledOut()
            boolean r7 = r7.getIsFullyRolledOut()
            if (r0 != r7) goto L2d
            r7 = 1
            return r7
        L2d:
            return r1
    }

    public boolean getIsFullyRolledOut() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public long getVersion() {
            r4 = this;
            long r0 = r4.zzc
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Lb
            int r0 = r4.zzb
            long r0 = (long) r0
        Lb:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.getName()
            long r1 = r3.getVersion()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r2 = r3.getIsFullyRolledOut()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
            java.lang.String r1 = "name"
            java.lang.String r2 = r3.getName()
            r0.add(r1, r2)
            long r1 = r3.getVersion()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "version"
            r0.add(r2, r1)
            boolean r1 = r3.getIsFullyRolledOut()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "is_fully_rolled_out"
            r0.add(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.getName()
            r1 = 0
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r2, r0, r1)
            r0 = 2
            int r1 = r3.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 3
            long r1 = r3.getVersion()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r0, r1)
            r0 = 4
            boolean r1 = r3.getIsFullyRolledOut()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r0, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
