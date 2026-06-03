package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzc {
    private final java.util.Map zza;
    private int zzb;
    private android.os.Bundle zzc;

    zzc() {
            r1 = this;
            r1.<init>()
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r1.zza = r0
            r0 = 0
            r1.zzb = r0
            return
    }

    final com.google.android.gms.common.api.internal.LifecycleCallback zza(java.lang.String r2, java.lang.Class r3) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            java.lang.Object r2 = r3.cast(r2)
            com.google.android.gms.common.api.internal.LifecycleCallback r2 = (com.google.android.gms.common.api.internal.LifecycleCallback) r2
            return r2
    }

    final void zzb(java.lang.String r3, com.google.android.gms.common.api.internal.LifecycleCallback r4) {
            r2 = this;
            java.util.Map r0 = r2.zza
            boolean r1 = r0.containsKey(r3)
            if (r1 != 0) goto L21
            r0.put(r3, r4)
            int r0 = r2.zzb
            if (r0 <= 0) goto L20
            com.google.android.gms.internal.common.zzg r0 = new com.google.android.gms.internal.common.zzg
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.google.android.gms.common.api.internal.zzb r1 = new com.google.android.gms.common.api.internal.zzb
            r1.<init>(r2, r4, r3)
            r0.post(r1)
        L20:
            return
        L21:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 59
            r1.<init>(r0)
            java.lang.String r0 = "LifecycleCallback with tag "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = " already added to this fragment."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
    }

    final boolean zzc() {
            r1 = this;
            int r0 = r1.zzb
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    final boolean zzd() {
            r2 = this;
            int r0 = r2.zzb
            r1 = 2
            if (r0 < r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    final void zze(android.os.Bundle r4) {
            r3 = this;
            r0 = 1
            r3.zzb = r0
            r3.zzc = r4
            java.util.Map r0 = r3.zza
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.google.android.gms.common.api.internal.LifecycleCallback r2 = (com.google.android.gms.common.api.internal.LifecycleCallback) r2
            if (r4 == 0) goto L2e
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            android.os.Bundle r1 = r4.getBundle(r1)
            goto L2f
        L2e:
            r1 = 0
        L2f:
            r2.onCreate(r1)
            goto Lf
        L33:
            return
    }

    final void zzf() {
            r2 = this;
            r0 = 2
            r2.zzb = r0
            java.util.Map r0 = r2.zza
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = (com.google.android.gms.common.api.internal.LifecycleCallback) r1
            r1.onStart()
            goto Ld
        L1d:
            return
    }

    final void zzg() {
            r2 = this;
            r0 = 3
            r2.zzb = r0
            java.util.Map r0 = r2.zza
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = (com.google.android.gms.common.api.internal.LifecycleCallback) r1
            r1.onResume()
            goto Ld
        L1d:
            return
    }

    final void zzh(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = (com.google.android.gms.common.api.internal.LifecycleCallback) r1
            r1.onActivityResult(r3, r4, r5)
            goto La
        L1a:
            return
    }

    final void zzi(android.os.Bundle r5) {
            r4 = this;
            if (r5 != 0) goto L3
            goto L31
        L3:
            java.util.Map r0 = r4.zza
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.Object r3 = r1.getValue()
            com.google.android.gms.common.api.internal.LifecycleCallback r3 = (com.google.android.gms.common.api.internal.LifecycleCallback) r3
            r3.onSaveInstanceState(r2)
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r5.putBundle(r1, r2)
            goto Ld
        L31:
            return
    }

    final void zzj() {
            r2 = this;
            r0 = 4
            r2.zzb = r0
            java.util.Map r0 = r2.zza
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = (com.google.android.gms.common.api.internal.LifecycleCallback) r1
            r1.onStop()
            goto Ld
        L1d:
            return
    }

    final void zzk() {
            r2 = this;
            r0 = 5
            r2.zzb = r0
            java.util.Map r0 = r2.zza
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = (com.google.android.gms.common.api.internal.LifecycleCallback) r1
            r1.onDestroy()
            goto Ld
        L1d:
            return
    }

    final void zzl(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = (com.google.android.gms.common.api.internal.LifecycleCallback) r1
            r1.dump(r3, r4, r5, r6)
            goto La
        L1a:
            return
    }

    final /* synthetic */ int zzm() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    final /* synthetic */ android.os.Bundle zzn() {
            r1 = this;
            android.os.Bundle r0 = r1.zzc
            return r0
    }
}
