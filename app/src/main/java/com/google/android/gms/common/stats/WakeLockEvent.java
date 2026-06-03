package com.google.android.gms.common.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class WakeLockEvent extends com.google.android.gms.common.stats.StatsEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.stats.WakeLockEvent> CREATOR = null;
    final int zza;
    private final long zzb;
    private final int zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final int zzg;

    @javax.annotation.Nullable
    private final java.util.List zzh;
    private final java.lang.String zzi;
    private final long zzj;
    private final int zzk;
    private final java.lang.String zzl;
    private final float zzm;
    private final long zzn;
    private final boolean zzo;

    static {
            com.google.android.gms.common.stats.zza r0 = new com.google.android.gms.common.stats.zza
            r0.<init>()
            com.google.android.gms.common.stats.WakeLockEvent.CREATOR = r0
            return
    }

    WakeLockEvent(int r4, long r5, int r7, java.lang.String r8, int r9, @javax.annotation.Nullable java.util.List r10, java.lang.String r11, long r12, int r14, java.lang.String r15, java.lang.String r16, float r17, long r18, java.lang.String r20, boolean r21) {
            r3 = this;
            r0 = r3
            r3.<init>()
            r1 = r4
            r0.zza = r1
            r1 = r5
            r0.zzb = r1
            r1 = r7
            r0.zzc = r1
            r1 = r8
            r0.zzd = r1
            r1 = r15
            r0.zze = r1
            r1 = r20
            r0.zzf = r1
            r1 = r9
            r0.zzg = r1
            r1 = r10
            r0.zzh = r1
            r1 = r11
            r0.zzi = r1
            r1 = r12
            r0.zzj = r1
            r1 = r14
            r0.zzk = r1
            r1 = r16
            r0.zzl = r1
            r1 = r17
            r0.zzm = r1
            r1 = r18
            r0.zzn = r1
            r1 = r21
            r0.zzo = r1
            return
    }

    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r6)
            r0 = 1
            int r1 = r5.zza
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r0, r1)
            r0 = 2
            long r1 = r5.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r6, r0, r1)
            java.lang.String r0 = r5.zzd
            r1 = 4
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r1, r0, r2)
            r0 = 5
            int r1 = r5.zzg
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r0, r1)
            r0 = 6
            java.util.List r1 = r5.zzh
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r6, r0, r1, r2)
            r0 = 8
            long r3 = r5.zzj
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r6, r0, r3)
            r0 = 10
            java.lang.String r1 = r5.zze
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r0, r1, r2)
            r0 = 11
            int r1 = r5.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r0, r1)
            r0 = 12
            java.lang.String r1 = r5.zzi
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r0, r1, r2)
            r0 = 13
            java.lang.String r1 = r5.zzl
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r0, r1, r2)
            r0 = 14
            int r1 = r5.zzk
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r0, r1)
            r0 = 15
            float r1 = r5.zzm
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r6, r0, r1)
            r0 = 16
            long r3 = r5.zzn
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r6, r0, r3)
            r0 = 17
            java.lang.String r1 = r5.zzf
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r0, r1, r2)
            r0 = 18
            boolean r1 = r5.zzo
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r6, r0, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r7)
            return
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zza() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zzb() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final java.lang.String zzc() {
            r13 = this;
            java.util.List r0 = r13.zzh
            java.lang.String r1 = ""
            if (r0 != 0) goto L8
            r0 = r1
            goto Le
        L8:
            java.lang.String r2 = ","
            java.lang.String r0 = android.text.TextUtils.join(r2, r0)
        Le:
            int r2 = r13.zzk
            java.lang.String r3 = r13.zze
            java.lang.String r4 = r13.zzl
            float r5 = r13.zzm
            java.lang.String r6 = r13.zzf
            int r7 = r13.zzg
            java.lang.String r8 = r13.zzd
            boolean r9 = r13.zzo
            java.lang.String r10 = java.lang.String.valueOf(r8)
            int r10 = r10.length()
            java.lang.String r11 = java.lang.String.valueOf(r7)
            int r10 = r10 + 2
            int r11 = r11.length()
            int r10 = r10 + r11
            java.lang.String r11 = java.lang.String.valueOf(r0)
            int r10 = r10 + 1
            int r11 = r11.length()
            java.lang.String r12 = java.lang.String.valueOf(r2)
            int r10 = r10 + r11
            int r10 = r10 + 1
            int r11 = r12.length()
            int r10 = r10 + r11
            if (r3 != 0) goto L4a
            r3 = r1
        L4a:
            int r10 = r10 + 1
            int r11 = r3.length()
            int r10 = r10 + r11
            int r10 = r10 + 1
            if (r4 != 0) goto L56
            r4 = r1
        L56:
            int r11 = r4.length()
            int r10 = r10 + r11
            int r10 = r10 + 1
            java.lang.String r11 = java.lang.String.valueOf(r5)
            int r11 = r11.length()
            int r10 = r10 + r11
            int r10 = r10 + 1
            if (r6 != 0) goto L6b
            goto L6c
        L6b:
            r1 = r6
        L6c:
            int r6 = r1.length()
            int r10 = r10 + r6
            int r10 = r10 + 1
            java.lang.String r6 = java.lang.String.valueOf(r9)
            int r6 = r6.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r10 = r10 + r6
            r11.<init>(r10)
            java.lang.String r6 = "\t"
            r11.append(r6)
            r11.append(r8)
            r11.append(r6)
            r11.append(r7)
            r11.append(r6)
            r11.append(r0)
            r11.append(r6)
            r11.append(r2)
            r11.append(r6)
            r11.append(r3)
            r11.append(r6)
            r11.append(r4)
            r11.append(r6)
            r11.append(r5)
            r11.append(r6)
            r11.append(r1)
            r11.append(r6)
            r11.append(r9)
            java.lang.String r0 = r11.toString()
            return r0
    }
}
