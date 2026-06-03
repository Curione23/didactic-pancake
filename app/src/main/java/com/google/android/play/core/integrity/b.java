package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class b extends com.google.android.play.core.integrity.bv {
    private java.lang.String a;
    private long b;
    private com.google.android.play.core.integrity.ag c;
    private byte d;

    b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.play.core.integrity.bv
    final com.google.android.play.core.integrity.bv a(com.google.android.play.core.integrity.ag r1) {
            r0 = this;
            r0.c = r1
            return r0
    }

    @Override // com.google.android.play.core.integrity.bv
    final com.google.android.play.core.integrity.bv b(long r1) {
            r0 = this;
            r0.b = r1
            r1 = 1
            r0.d = r1
            return r0
    }

    @Override // com.google.android.play.core.integrity.bv
    final com.google.android.play.core.integrity.bv c(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.a = r2
            return r1
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "Null token"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.android.play.core.integrity.bv
    final com.google.android.play.core.integrity.bw d() {
            r5 = this;
            byte r0 = r5.d
            r1 = 1
            if (r0 != r1) goto L16
            java.lang.String r0 = r5.a
            if (r0 == 0) goto L16
            com.google.android.play.core.integrity.ag r1 = r5.c
            if (r1 != 0) goto Le
            goto L16
        Le:
            com.google.android.play.core.integrity.bw r2 = new com.google.android.play.core.integrity.bw
            long r3 = r5.b
            r2.<init>(r0, r3, r1)
            return r2
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.a
            if (r1 != 0) goto L24
            java.lang.String r1 = " token"
            r0.append(r1)
        L24:
            byte r1 = r5.d
            if (r1 != 0) goto L2d
            java.lang.String r1 = " requestTokenSessionId"
            r0.append(r1)
        L2d:
            com.google.android.play.core.integrity.ag r1 = r5.c
            if (r1 != 0) goto L36
            java.lang.String r1 = " integrityDialogWrapper"
            r0.append(r1)
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }
}
