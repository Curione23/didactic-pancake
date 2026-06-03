package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzk implements java.util.Iterator {
    private java.lang.Object zza;
    private int zzb;

    protected zzk() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.zzb = r0
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r5 = this;
            int r0 = r5.zzb
            r1 = 0
            r2 = 1
            r3 = 4
            if (r0 == r3) goto L9
            r0 = r2
            goto La
        L9:
            r0 = r1
        La:
            com.google.android.gms.internal.common.zzr.zza(r0)
            int r0 = r5.zzb
            int r4 = r0 + (-1)
            if (r0 == 0) goto L2a
            if (r4 == 0) goto L29
            r0 = 2
            if (r4 == r0) goto L28
            r5.zzb = r3
            java.lang.Object r0 = r5.zza()
            r5.zza = r0
            int r0 = r5.zzb
            r3 = 3
            if (r0 == r3) goto L28
            r5.zzb = r2
            return r2
        L28:
            return r1
        L29:
            return r2
        L2a:
            r0 = 0
            throw r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            r0 = 2
            r2.zzb = r0
            java.lang.Object r0 = r2.zza
            r1 = 0
            r2.zza = r1
            return r0
        Lf:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    protected abstract java.lang.Object zza();

    protected final java.lang.Object zzb() {
            r1 = this;
            r0 = 3
            r1.zzb = r0
            r0 = 0
            return r0
    }
}
