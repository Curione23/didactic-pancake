package com.google.android.gms.common.util.concurrent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class NumberedThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.lang.String zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb;
    private final java.util.concurrent.ThreadFactory zzc;

    public NumberedThreadFactory(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.zzb = r0
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r1.zzc = r0
            java.lang.String r0 = "Name must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0
            r1.zza = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r6) {
            r5 = this;
            com.google.android.gms.common.util.concurrent.zza r0 = new com.google.android.gms.common.util.concurrent.zza
            r1 = 0
            r0.<init>(r6, r1)
            java.util.concurrent.ThreadFactory r6 = r5.zzc
            java.lang.Thread r6 = r6.newThread(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r5.zzb
            int r0 = r0.getAndIncrement()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = r5.zza
            int r4 = r3.length()
            int r4 = r4 + 1
            int r4 = r4 + r1
            int r4 = r4 + 1
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r1 = "["
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.setName(r0)
            return r6
    }
}
