package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class av implements com.google.android.play.integrity.internal.az {
    private static final java.lang.Object a = null;
    private volatile com.google.android.play.integrity.internal.az b;
    private volatile java.lang.Object c;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.play.integrity.internal.av.a = r0
            return
    }

    private av(com.google.android.play.integrity.internal.az r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.android.play.integrity.internal.av.a
            r1.c = r0
            r1.b = r2
            return
    }

    public static com.google.android.play.integrity.internal.az b(com.google.android.play.integrity.internal.az r1) {
            boolean r0 = r1 instanceof com.google.android.play.integrity.internal.av
            if (r0 == 0) goto L5
            return r1
        L5:
            com.google.android.play.integrity.internal.av r0 = new com.google.android.play.integrity.internal.av
            r0.<init>(r1)
            return r0
    }

    private final synchronized java.lang.Object c() {
            r5 = this;
            java.lang.String r0 = "Scoped provider was invoked recursively returning different results: "
            monitor-enter(r5)
            java.lang.Object r1 = r5.c     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r2 = com.google.android.play.integrity.internal.av.a     // Catch: java.lang.Throwable -> L3e
            if (r1 != r2) goto L3c
            com.google.android.play.integrity.internal.az r1 = r5.b     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r3 = r5.c     // Catch: java.lang.Throwable -> L3e
            if (r3 == r2) goto L35
            if (r3 != r1) goto L16
            goto L35
        L16:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L3e
            r4.append(r3)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = " & "
            r4.append(r0)     // Catch: java.lang.Throwable -> L3e
            r4.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = ". This is likely due to a circular dependency."
            r4.append(r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L3e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3e
            throw r2     // Catch: java.lang.Throwable -> L3e
        L35:
            r5.c = r1     // Catch: java.lang.Throwable -> L3e
            r0 = 0
            r5.b = r0     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r5)
            return r1
        L3c:
            monitor-exit(r5)
            return r1
        L3e:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3e
            throw r0
    }

    @Override // com.google.android.play.integrity.internal.bb, com.google.android.play.integrity.internal.ba
    public final java.lang.Object a() {
            r2 = this;
            java.lang.Object r0 = r2.c
            java.lang.Object r1 = com.google.android.play.integrity.internal.av.a
            if (r0 != r1) goto La
            java.lang.Object r0 = r2.c()
        La:
            return r0
    }
}
