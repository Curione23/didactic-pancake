package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzak implements java.util.Iterator {
    protected zzak() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    @java.lang.Deprecated
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
