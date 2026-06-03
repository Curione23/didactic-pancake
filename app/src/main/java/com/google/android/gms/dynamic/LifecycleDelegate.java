package com.google.android.gms.dynamic;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public interface LifecycleDelegate {
    void onCreate(android.os.Bundle r1);

    android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3);

    void onDestroy();

    void onDestroyView();

    void onInflate(android.app.Activity r1, android.os.Bundle r2, android.os.Bundle r3);

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(android.os.Bundle r1);

    void onStart();

    void onStop();
}
