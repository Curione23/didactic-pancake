package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ak {
    public static java.lang.String a(java.lang.String r7, java.lang.Object... r8) {
            int r0 = r8.length
            int r1 = r7.length()
            int r0 = r0 * 16
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + r0
            r2.<init>(r1)
            r0 = 0
            r1 = r0
        Lf:
            int r3 = r8.length
            if (r0 >= r3) goto L30
            java.lang.String r4 = "%s"
            int r4 = r7.indexOf(r4, r1)
            r5 = -1
            if (r4 != r5) goto L1c
            goto L30
        L1c:
            r2.append(r7, r1, r4)
            int r1 = r0 + 1
            r0 = r8[r0]
            java.lang.String r0 = b(r0)
            r2.append(r0)
            int r0 = r4 + 2
            r6 = r1
            r1 = r0
            r0 = r6
            goto Lf
        L30:
            int r4 = r7.length()
            r2.append(r7, r1, r4)
            if (r0 >= r3) goto L54
            java.lang.String r7 = " ["
        L3b:
            int r1 = r8.length
            if (r0 >= r1) goto L4f
            r2.append(r7)
            r7 = r8[r0]
            java.lang.String r7 = b(r7)
            r2.append(r7)
            int r0 = r0 + 1
            java.lang.String r7 = ", "
            goto L3b
        L4f:
            r7 = 93
            r2.append(r7)
        L54:
            java.lang.String r7 = r2.toString()
            return r7
    }

    private static java.lang.String b(java.lang.Object r7) {
            if (r7 != 0) goto L5
            java.lang.String r7 = "null"
            return r7
        L5:
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> La
            return r7
        La:
            r6 = move-exception
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getName()
            int r7 = java.lang.System.identityHashCode(r7)
            java.lang.String r7 = java.lang.Integer.toHexString(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "@"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r0 = "com.google.common.base.Strings"
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.String r3 = "lenientToString"
            java.lang.String r2 = "Exception during lenientFormat for "
            java.lang.String r4 = r2.concat(r7)
            java.lang.String r2 = "com.google.common.base.Strings"
            r5 = r6
            r0.logp(r1, r2, r3, r4, r5)
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "<"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = " threw "
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = ">"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            return r7
    }
}
