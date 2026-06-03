package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public interface LifecycleFragment {
    void addCallback(java.lang.String r1, com.google.android.gms.common.api.internal.LifecycleCallback r2);

    <T extends com.google.android.gms.common.api.internal.LifecycleCallback> T getCallbackOrNull(java.lang.String r1, java.lang.Class<T> r2);

    android.app.Activity getLifecycleActivity();

    boolean isCreated();

    boolean isStarted();

    void startActivityForResult(android.content.Intent r1, int r2);
}
