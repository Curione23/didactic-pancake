package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DowngradeableSafeParcel extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    private static final java.lang.Object zza = null;
    private boolean zzb;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.internal.DowngradeableSafeParcel.zza = r0
            return
    }

    public DowngradeableSafeParcel() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            return
    }

    protected static boolean canUnparcelSafely(java.lang.String r1) {
            java.lang.Object r1 = com.google.android.gms.common.internal.DowngradeableSafeParcel.zza
            monitor-enter(r1)
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            r1 = 1
            return r1
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    protected static java.lang.Integer getUnparcelClientVersion() {
            java.lang.Object r0 = com.google.android.gms.common.internal.DowngradeableSafeParcel.zza
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            r0 = 0
            return r0
        L6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6
            throw r1
    }

    protected abstract boolean prepareForClientVersion(int r1);

    public void setShouldDowngrade(boolean r1) {
            r0 = this;
            r0.zzb = r1
            return
    }

    protected boolean shouldDowngrade() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }
}
