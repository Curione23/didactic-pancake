package com.google.android.gms.common.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class StatsEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public interface Types {
        public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;
    }

    public StatsEvent() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.String toString() {
            r7 = this;
            long r0 = r7.zza()
            int r2 = r7.zzb()
            java.lang.String r3 = r7.zzc()
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r5 = r5.length()
            int r6 = r3.length()
            int r4 = r4 + 1
            int r4 = r4 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 3
            int r4 = r4 + r6
            r5.<init>(r4)
            r5.append(r0)
            java.lang.String r0 = "\t"
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = "\t-1"
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = r5.toString()
            return r0
    }

    public abstract long zza();

    public abstract int zzb();

    public abstract java.lang.String zzc();
}
