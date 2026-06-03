package org.apache.commons.codec.language;

/* JADX INFO: loaded from: classes2.dex */
final class SoundexUtils {
    SoundexUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String clean(java.lang.String r7) {
            boolean r0 = isEmpty(r7)
            if (r0 == 0) goto L7
            return r7
        L7:
            int r0 = r7.length()
            char[] r1 = new char[r0]
            r2 = 0
            r3 = r2
            r4 = r3
        L10:
            if (r3 >= r0) goto L28
            char r5 = r7.charAt(r3)
            boolean r5 = java.lang.Character.isLetter(r5)
            if (r5 == 0) goto L25
            int r5 = r4 + 1
            char r6 = r7.charAt(r3)
            r1[r4] = r6
            r4 = r5
        L25:
            int r3 = r3 + 1
            goto L10
        L28:
            if (r4 != r0) goto L31
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r7 = r7.toUpperCase(r0)
            return r7
        L31:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2, r4)
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r7 = r7.toUpperCase(r0)
            return r7
    }

    static int difference(org.apache.commons.codec.StringEncoder r0, java.lang.String r1, java.lang.String r2) throws org.apache.commons.codec.EncoderException {
            java.lang.String r1 = r0.encode(r1)
            java.lang.String r0 = r0.encode(r2)
            int r0 = differenceEncoded(r1, r0)
            return r0
    }

    static int differenceEncoded(java.lang.String r5, java.lang.String r6) {
            r0 = 0
            if (r5 == 0) goto L25
            if (r6 != 0) goto L6
            goto L25
        L6:
            int r1 = r5.length()
            int r2 = r6.length()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = r0
        L13:
            if (r0 >= r1) goto L24
            char r3 = r5.charAt(r0)
            char r4 = r6.charAt(r0)
            if (r3 != r4) goto L21
            int r2 = r2 + 1
        L21:
            int r0 = r0 + 1
            goto L13
        L24:
            return r2
        L25:
            return r0
    }

    static boolean isEmpty(java.lang.CharSequence r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }
}
