package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    private final java.lang.String a;

    public s(java.lang.String r5) {
            r4 = this;
            r4.<init>()
            int r0 = android.os.Process.myUid()
            int r1 = android.os.Process.myPid()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "UID: ["
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "]  PID: ["
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "] "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r5 = r0.concat(r5)
            r4.a = r5
            return
    }

    private static java.lang.String f(java.lang.String r4, java.lang.String r5, java.lang.Object... r6) {
            int r0 = r6.length
            if (r0 <= 0) goto L39
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.util.IllegalFormatException -> La
            java.lang.String r5 = java.lang.String.format(r0, r5, r6)     // Catch: java.util.IllegalFormatException -> La
            goto L39
        La:
            r0 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "PlayCore"
            java.lang.String r3 = "Unable to format "
            java.lang.String r1 = r3.concat(r1)
            android.util.Log.e(r2, r1, r0)
            java.lang.String r0 = ", "
            java.lang.String r6 = android.text.TextUtils.join(r0, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = " ["
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = "]"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
        L39:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = " : "
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            return r4
    }

    public final int a(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            r0 = 3
            java.lang.String r1 = "PlayCore"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L14
            java.lang.String r0 = r2.a
            java.lang.String r3 = f(r0, r3, r4)
            int r3 = android.util.Log.d(r1, r3)
            return r3
        L14:
            r3 = 0
            return r3
    }

    public final int b(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            r0 = 6
            java.lang.String r1 = "PlayCore"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L14
            java.lang.String r0 = r2.a
            java.lang.String r3 = f(r0, r3, r4)
            int r3 = android.util.Log.e(r1, r3)
            return r3
        L14:
            r3 = 0
            return r3
    }

    public final int c(java.lang.Throwable r3, java.lang.String r4, java.lang.Object... r5) {
            r2 = this;
            r0 = 6
            java.lang.String r1 = "PlayCore"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L14
            java.lang.String r0 = r2.a
            java.lang.String r4 = f(r0, r4, r5)
            int r3 = android.util.Log.e(r1, r4, r3)
            return r3
        L14:
            r3 = 0
            return r3
    }

    public final int d(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            r0 = 4
            java.lang.String r1 = "PlayCore"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L14
            java.lang.String r0 = r2.a
            java.lang.String r3 = f(r0, r3, r4)
            int r3 = android.util.Log.i(r1, r3)
            return r3
        L14:
            r3 = 0
            return r3
    }

    public final int e(java.lang.String r3, java.lang.Object... r4) {
            r2 = this;
            r0 = 5
            java.lang.String r1 = "PlayCore"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L14
            java.lang.String r0 = r2.a
            java.lang.String r3 = f(r0, r3, r4)
            int r3 = android.util.Log.w(r1, r3)
            return r3
        L14:
            r3 = 0
            return r3
    }
}
