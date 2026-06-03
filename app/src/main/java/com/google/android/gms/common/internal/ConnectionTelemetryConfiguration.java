package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.ConnectionTelemetryConfiguration> CREATOR = null;
    private final com.google.android.gms.common.internal.RootTelemetryConfiguration zza;
    private final boolean zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final int zze;
    private final int[] zzf;

    static {
            com.google.android.gms.common.internal.zzl r0 = new com.google.android.gms.common.internal.zzl
            r0.<init>()
            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration.CREATOR = r0
            return
    }

    public ConnectionTelemetryConfiguration(com.google.android.gms.common.internal.RootTelemetryConfiguration r1, boolean r2, boolean r3, int[] r4, int r5, int[] r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            return
    }

    public int getMaxMethodInvocationsLogged() {
            r1 = this;
            int r0 = r1.zze
            return r0
    }

    public int[] getMethodInvocationMethodKeyAllowlist() {
            r1 = this;
            int[] r0 = r1.zzd
            return r0
    }

    public int[] getMethodInvocationMethodKeyDisallowlist() {
            r1 = this;
            int[] r0 = r1.zzf
            return r0
    }

    public boolean getMethodInvocationTelemetryEnabled() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }

    public boolean getMethodTimingTelemetryEnabled() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }

    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.common.internal.RootTelemetryConfiguration r1 = r4.zza
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            r6 = 2
            boolean r1 = r4.getMethodInvocationTelemetryEnabled()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r1)
            r6 = 3
            boolean r1 = r4.getMethodTimingTelemetryEnabled()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r1)
            r6 = 4
            int[] r1 = r4.getMethodInvocationMethodKeyAllowlist()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(r5, r6, r1, r3)
            r6 = 5
            int r1 = r4.getMaxMethodInvocationsLogged()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r6, r1)
            r6 = 6
            int[] r1 = r4.getMethodInvocationMethodKeyDisallowlist()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(r5, r6, r1, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final com.google.android.gms.common.internal.RootTelemetryConfiguration zza() {
            r1 = this;
            com.google.android.gms.common.internal.RootTelemetryConfiguration r0 = r1.zza
            return r0
    }
}
