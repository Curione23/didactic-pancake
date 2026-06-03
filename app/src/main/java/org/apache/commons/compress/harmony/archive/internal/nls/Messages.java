package org.apache.commons.compress.harmony.archive.internal.nls;

/* JADX INFO: loaded from: classes2.dex */
public class Messages {
    private static java.util.ResourceBundle bundle;

    static {
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = "org.apache.commons.compress.harmony.archive.internal.nls.messages"
            java.util.ResourceBundle r0 = setLocale(r0, r1)     // Catch: java.lang.Throwable -> Ld
            org.apache.commons.compress.harmony.archive.internal.nls.Messages.bundle = r0     // Catch: java.lang.Throwable -> Ld
            goto L11
        Ld:
            r0 = move-exception
            r0.printStackTrace()
        L11:
            return
    }

    public Messages() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String format(java.lang.String r9, java.lang.Object[] r10) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r9.length()
            int r2 = r10.length
            int r2 = r2 * 20
            int r1 = r1 + r2
            r0.<init>(r1)
            int r1 = r10.length
            java.lang.String[] r2 = new java.lang.String[r1]
            org.apache.commons.compress.harmony.archive.internal.nls.Messages$$ExternalSyntheticLambda1 r3 = new org.apache.commons.compress.harmony.archive.internal.nls.Messages$$ExternalSyntheticLambda1
            r3.<init>(r10)
            java.util.Arrays.setAll(r2, r3)
            r10 = 123(0x7b, float:1.72E-43)
            r3 = 0
        L1b:
            int r4 = r9.indexOf(r10, r3)
            if (r4 < 0) goto L8c
            if (r4 == 0) goto L3e
            int r5 = r4 + (-1)
            char r6 = r9.charAt(r5)
            r7 = 92
            if (r6 != r7) goto L3e
            r6 = 1
            if (r4 == r6) goto L37
            java.lang.String r3 = r9.substring(r3, r5)
            r0.append(r3)
        L37:
            r0.append(r10)
            int r4 = r4 + 1
        L3c:
            r3 = r4
            goto L1b
        L3e:
            int r5 = r9.length()
            int r5 = r5 + (-3)
            if (r4 <= r5) goto L52
            java.lang.String r3 = r9.substring(r3)
            r0.append(r3)
            int r3 = r9.length()
            goto L1b
        L52:
            int r5 = r4 + 1
            char r6 = r9.charAt(r5)
            r7 = 10
            int r6 = java.lang.Character.digit(r6, r7)
            byte r6 = (byte) r6
            if (r6 < 0) goto L83
            int r7 = r4 + 2
            char r7 = r9.charAt(r7)
            r8 = 125(0x7d, float:1.75E-43)
            if (r7 == r8) goto L6c
            goto L83
        L6c:
            java.lang.String r3 = r9.substring(r3, r4)
            r0.append(r3)
            if (r6 < r1) goto L7b
            java.lang.String r3 = "<missing argument>"
            r0.append(r3)
            goto L80
        L7b:
            r3 = r2[r6]
            r0.append(r3)
        L80:
            int r4 = r4 + 3
            goto L3c
        L83:
            java.lang.String r3 = r9.substring(r3, r5)
            r0.append(r3)
            r3 = r5
            goto L1b
        L8c:
            int r10 = r9.length()
            if (r3 >= r10) goto L99
            java.lang.String r9 = r9.substring(r3)
            r0.append(r9)
        L99:
            java.lang.String r9 = r0.toString()
            return r9
    }

    public static java.lang.String getString(java.lang.String r2) {
            java.util.ResourceBundle r0 = org.apache.commons.compress.harmony.archive.internal.nls.Messages.bundle
            if (r0 != 0) goto L5
            return r2
        L5:
            java.lang.String r2 = r0.getString(r2)     // Catch: java.util.MissingResourceException -> La
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Missing message: "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static java.lang.String getString(java.lang.String r0, char r1) {
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = getString(r0, r1)
            return r0
    }

    public static java.lang.String getString(java.lang.String r0, int r1) {
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = getString(r0, r1)
            return r0
    }

    public static java.lang.String getString(java.lang.String r0, java.lang.Object r1) {
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = getString(r0, r1)
            return r0
    }

    public static java.lang.String getString(java.lang.String r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r0 = getString(r0, r1)
            return r0
    }

    public static java.lang.String getString(java.lang.String r1, java.lang.Object[] r2) {
            java.util.ResourceBundle r0 = org.apache.commons.compress.harmony.archive.internal.nls.Messages.bundle
            if (r0 == 0) goto L8
            java.lang.String r1 = r0.getString(r1)     // Catch: java.util.MissingResourceException -> L8
        L8:
            java.lang.String r1 = format(r1, r2)
            return r1
    }

    static /* synthetic */ java.lang.String lambda$format$0(java.lang.Object[] r0, int r1) {
            r0 = r0[r1]
            java.lang.String r1 = "<null>"
            java.lang.String r0 = java.util.Objects.toString(r0, r1)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$setLocale$1(java.lang.String r0, java.util.Locale r1, java.lang.ClassLoader r2) {
            if (r2 == 0) goto L3
            goto L7
        L3:
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()
        L7:
            java.util.ResourceBundle r0 = java.util.ResourceBundle.getBundle(r0, r1, r2)
            return r0
    }

    public static java.util.ResourceBundle setLocale(java.util.Locale r2, java.lang.String r3) {
            r0 = 0
            org.apache.commons.compress.harmony.archive.internal.nls.Messages$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.harmony.archive.internal.nls.Messages$$ExternalSyntheticLambda0     // Catch: java.util.MissingResourceException -> Ld
            r1.<init>(r3, r2, r0)     // Catch: java.util.MissingResourceException -> Ld
            java.lang.Object r2 = java.security.AccessController.doPrivileged(r1)     // Catch: java.util.MissingResourceException -> Ld
            java.util.ResourceBundle r2 = (java.util.ResourceBundle) r2     // Catch: java.util.MissingResourceException -> Ld
            return r2
        Ld:
            return r0
    }
}
