package org.apache.commons.lang3.text.translate;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class OctalUnescaper extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
    public OctalUnescaper() {
            r0 = this;
            r0.<init>()
            return
    }

    private boolean isOctalDigit(char r2) {
            r1 = this;
            r0 = 48
            if (r2 < r0) goto La
            r0 = 55
            if (r2 > r0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    private boolean isZeroToThree(char r2) {
            r1 = this;
            r0 = 48
            if (r2 < r0) goto La
            r0 = 51
            if (r2 > r0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    @Override // org.apache.commons.lang3.text.translate.CharSequenceTranslator
    public int translate(java.lang.CharSequence r7, int r8, java.io.Writer r9) throws java.io.IOException {
            r6 = this;
            int r0 = r7.length()
            int r0 = r0 - r8
            r1 = 1
            int r0 = r0 - r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            char r3 = r7.charAt(r8)
            r4 = 92
            if (r3 != r4) goto L71
            if (r0 <= 0) goto L71
            int r3 = r8 + 1
            char r4 = r7.charAt(r3)
            boolean r4 = r6.isOctalDigit(r4)
            if (r4 == 0) goto L71
            int r4 = r8 + 2
            int r8 = r8 + 3
            char r5 = r7.charAt(r3)
            r2.append(r5)
            if (r0 <= r1) goto L5e
            char r5 = r7.charAt(r4)
            boolean r5 = r6.isOctalDigit(r5)
            if (r5 == 0) goto L5e
            char r4 = r7.charAt(r4)
            r2.append(r4)
            r4 = 2
            if (r0 <= r4) goto L5e
            char r0 = r7.charAt(r3)
            boolean r0 = r6.isZeroToThree(r0)
            if (r0 == 0) goto L5e
            char r0 = r7.charAt(r8)
            boolean r0 = r6.isOctalDigit(r0)
            if (r0 == 0) goto L5e
            char r7 = r7.charAt(r8)
            r2.append(r7)
        L5e:
            java.lang.String r7 = r2.toString()
            r8 = 8
            int r7 = java.lang.Integer.parseInt(r7, r8)
            r9.write(r7)
            int r7 = r2.length()
            int r7 = r7 + r1
            return r7
        L71:
            r7 = 0
            return r7
    }
}
