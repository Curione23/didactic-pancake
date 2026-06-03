package com.google.android.material.motion;

/* JADX INFO: loaded from: classes.dex */
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(androidx.activity.BackEventCompat r1);

    void updateBackProgress(androidx.activity.BackEventCompat r1);
}
