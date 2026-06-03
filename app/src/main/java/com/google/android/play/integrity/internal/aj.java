package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class aj {
    public static int a(int r1, int r2, java.lang.String r3) {
            if (r1 < 0) goto L6
            if (r1 < r2) goto L5
            goto L6
        L5:
            return r1
        L6:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "index"
            if (r1 < 0) goto L35
            if (r2 >= 0) goto L22
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "negative size: "
            r3.<init>(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L22:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r2 = "%s (%s) must be less than size (%s)"
            java.lang.String r1 = com.google.android.play.integrity.internal.ak.a(r2, r1)
            goto L43
        L35:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r2 = "%s (%s) must not be negative"
            java.lang.String r1 = com.google.android.play.integrity.internal.ak.a(r2, r1)
        L43:
            r3.<init>(r1)
            throw r3
    }

    public static int b(int r1, int r2, java.lang.String r3) {
            if (r1 < 0) goto L5
            if (r1 > r2) goto L5
            return r1
        L5:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "index"
            java.lang.String r1 = d(r1, r2, r0)
            r3.<init>(r1)
            throw r3
    }

    public static void c(int r1, int r2, int r3) {
            if (r1 < 0) goto L8
            if (r2 < r1) goto L8
            if (r2 <= r3) goto L7
            goto L8
        L7:
            return
        L8:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            if (r1 < 0) goto L2d
            if (r1 > r3) goto L2d
            if (r2 < 0) goto L26
            if (r2 <= r3) goto L13
            goto L26
        L13:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.String r2 = "end index (%s) must not be less than start index (%s)"
            java.lang.String r1 = com.google.android.play.integrity.internal.ak.a(r2, r1)
            goto L33
        L26:
            java.lang.String r1 = "end index"
            java.lang.String r1 = d(r2, r3, r1)
            goto L33
        L2d:
            java.lang.String r2 = "start index"
            java.lang.String r1 = d(r1, r3, r2)
        L33:
            r0.<init>(r1)
            throw r0
    }

    private static java.lang.String d(int r1, int r2, java.lang.String r3) {
            if (r1 >= 0) goto L11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
            java.lang.String r2 = "%s (%s) must not be negative"
            java.lang.String r1 = com.google.android.play.integrity.internal.ak.a(r2, r1)
            return r1
        L11:
            if (r2 < 0) goto L26
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1, r2}
            java.lang.String r2 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r1 = com.google.android.play.integrity.internal.ak.a(r2, r1)
            return r1
        L26:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "negative size: "
            r3.<init>(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
    }
}
