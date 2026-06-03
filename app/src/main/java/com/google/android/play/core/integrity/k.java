package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class k extends com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest {
    private final long a;
    private final int b;

    /* synthetic */ k(long r1, int r3, java.lang.String r4, com.google.android.play.core.integrity.j r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            return
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final int a() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    public final long b() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    final java.lang.String c() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L21
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest) r8
            long r3 = r7.a
            long r5 = r8.b()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L21
            int r1 = r7.b
            int r3 = r8.a()
            if (r1 != r3) goto L21
            r8.c()
            return r0
        L21:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.a
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r0 = (int) r0
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r4.b
            r0 = r0 ^ r2
            int r0 = r0 * r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PrepareIntegrityTokenRequest{cloudProjectNumber="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", webViewRequestMode="
            r0.append(r1)
            int r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", sessionId=null}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
