package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ai {
    private static final com.google.android.play.integrity.internal.s a = null;

    static {
            com.google.android.play.integrity.internal.s r0 = new com.google.android.play.integrity.internal.s
            java.lang.String r1 = "PhoneskyVerificationUtils"
            r0.<init>(r1)
            com.google.android.play.integrity.internal.ai.a = r0
            return
    }

    public static int a(android.content.Context r2) {
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            java.lang.String r0 = "com.android.vending"
            r1 = 64
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            if (r0 == 0) goto L22
            android.content.pm.ApplicationInfo r0 = r2.applicationInfo
            boolean r0 = r0.enabled
            if (r0 == 0) goto L22
            android.content.pm.Signature[] r0 = r2.signatures
            boolean r0 = c(r0)
            if (r0 != 0) goto L1f
            goto L22
        L1f:
            int r2 = r2.versionCode
            return r2
        L22:
            r2 = 0
            return r2
    }

    public static boolean b(android.content.Context r4) {
            java.lang.String r0 = "Play Store package is not found."
            java.lang.String r1 = "com.android.vending"
            r2 = 0
            android.content.pm.PackageManager r3 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            boolean r3 = r3.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r3 != 0) goto L1b
            com.google.android.play.integrity.internal.s r4 = com.google.android.play.integrity.internal.ai.a
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "Play Store package is disabled."
            r4.e(r1, r0)
            goto L3e
        L1b:
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            r3 = 64
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            android.content.pm.Signature[] r4 = r4.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2f
            boolean r4 = c(r4)
            if (r4 == 0) goto L3e
            r4 = 1
            return r4
        L2f:
            com.google.android.play.integrity.internal.s r4 = com.google.android.play.integrity.internal.ai.a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r4.e(r0, r1)
            goto L3e
        L37:
            com.google.android.play.integrity.internal.s r4 = com.google.android.play.integrity.internal.ai.a
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r4.e(r0, r1)
        L3e:
            return r2
    }

    private static boolean c(android.content.pm.Signature[] r7) {
            r0 = 0
            if (r7 == 0) goto L80
            int r1 = r7.length
            if (r1 != 0) goto L8
            goto L80
        L8:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = r0
        Le:
            if (r3 >= r1) goto L46
            r4 = r7[r3]
            byte[] r4 = r4.toByteArray()
            java.lang.String r4 = com.google.android.play.integrity.internal.ah.a(r4)
            r2.add(r4)
            java.lang.String r5 = "8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L44
            java.lang.String r5 = android.os.Build.TAGS
            java.lang.String r6 = "dev-keys"
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L39
            java.lang.String r5 = android.os.Build.TAGS
            java.lang.String r6 = "test-keys"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L41
        L39:
            java.lang.String r5 = "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L44
        L41:
            int r3 = r3 + 1
            goto Le
        L44:
            r7 = 1
            return r7
        L46:
            com.google.android.play.integrity.internal.s r7 = com.google.android.play.integrity.internal.ai.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6c
        L57:
            java.lang.Object r3 = r2.next()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1.append(r3)
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6c
            java.lang.String r3 = ", "
            r1.append(r3)
            goto L57
        L6c:
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Play Store package certs are not valid. Found these sha256 certs: [%s]."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r7.e(r1, r2)
            return r0
        L80:
            com.google.android.play.integrity.internal.s r7 = com.google.android.play.integrity.internal.ai.a
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Play Store package is not signed -- possibly self-built package. Could not verify."
            r7.e(r2, r1)
            return r0
    }
}
