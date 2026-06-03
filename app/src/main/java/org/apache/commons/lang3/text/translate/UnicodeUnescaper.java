package org.apache.commons.lang3.text.translate;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class UnicodeUnescaper extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
    public UnicodeUnescaper() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.apache.commons.lang3.text.translate.CharSequenceTranslator
    public int translate(java.lang.CharSequence r5, int r6, java.io.Writer r7) throws java.io.IOException {
            r4 = this;
            char r0 = r5.charAt(r6)
            r1 = 92
            if (r0 != r1) goto L92
            int r0 = r6 + 1
            int r1 = r5.length()
            if (r0 >= r1) goto L92
            char r0 = r5.charAt(r0)
            r1 = 117(0x75, float:1.64E-43)
            if (r0 != r1) goto L92
            r0 = 2
        L19:
            int r2 = r6 + r0
            int r3 = r5.length()
            if (r2 >= r3) goto L2a
            char r3 = r5.charAt(r2)
            if (r3 != r1) goto L2a
            int r0 = r0 + 1
            goto L19
        L2a:
            int r1 = r5.length()
            if (r2 >= r1) goto L3a
            char r1 = r5.charAt(r2)
            r2 = 43
            if (r1 != r2) goto L3a
            int r0 = r0 + 1
        L3a:
            int r1 = r6 + r0
            int r2 = r1 + 4
            int r3 = r5.length()
            if (r2 > r3) goto L6f
            java.lang.CharSequence r5 = r5.subSequence(r1, r2)
            java.lang.String r6 = r5.toString()     // Catch: java.lang.NumberFormatException -> L59
            r1 = 16
            int r6 = java.lang.Integer.parseInt(r6, r1)     // Catch: java.lang.NumberFormatException -> L59
            char r6 = (char) r6     // Catch: java.lang.NumberFormatException -> L59
            r7.write(r6)     // Catch: java.lang.NumberFormatException -> L59
            int r0 = r0 + 4
            return r0
        L59:
            r6 = move-exception
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to parse unicode value: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r7.<init>(r5, r6)
            throw r7
        L6f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Less than 4 hex digits in unicode value: '"
            r0.<init>(r1)
            int r1 = r5.length()
            java.lang.CharSequence r5 = r5.subSequence(r6, r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r6 = "' due to end of CharSequence"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r7.<init>(r5)
            throw r7
        L92:
            r5 = 0
            return r5
    }
}
