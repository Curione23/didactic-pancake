package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class SharedPreferencesUtils {
    private SharedPreferencesUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static void publishWorldReadableSharedPreferences(android.content.Context r0, android.content.SharedPreferences.Editor r1, java.lang.String r2) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "world-readable shared preferences should only be used by apk"
            r0.<init>(r1)
            throw r0
    }
}
