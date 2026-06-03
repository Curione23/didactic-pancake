package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzq {
    static final java.lang.CharSequence zza(java.lang.Object r0, java.lang.String r1) {
            java.util.Objects.requireNonNull(r0)
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto La
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            goto Le
        La:
            java.lang.String r0 = r0.toString()
        Le:
            return r0
    }
}
