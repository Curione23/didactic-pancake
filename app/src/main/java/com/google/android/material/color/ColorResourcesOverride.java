package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
public interface ColorResourcesOverride {
    static com.google.android.material.color.ColorResourcesOverride getInstance() {
            r0 = 30
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r0 > r1) goto L11
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 > r1) goto L11
            com.google.android.material.color.ColorResourcesOverride r0 = com.google.android.material.color.ResourcesLoaderColorResourcesOverride.getInstance()
            return r0
        L11:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L1c
            com.google.android.material.color.ColorResourcesOverride r0 = com.google.android.material.color.ResourcesLoaderColorResourcesOverride.getInstance()
            return r0
        L1c:
            r0 = 0
            return r0
    }

    boolean applyIfPossible(android.content.Context r1, java.util.Map<java.lang.Integer, java.lang.Integer> r2);

    android.content.Context wrapContextIfPossible(android.content.Context r1, java.util.Map<java.lang.Integer, java.lang.Integer> r2);
}
