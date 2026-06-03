package org.apache.commons.lang3.text.translate;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public abstract class CharSequenceTranslator {
    static final char[] HEX_DIGITS = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            org.apache.commons.lang3.text.translate.CharSequenceTranslator.HEX_DIGITS = r0
            return
    }

    public CharSequenceTranslator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String hex(int r1) {
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toUpperCase(r0)
            return r1
    }

    public abstract int translate(java.lang.CharSequence r1, int r2, java.io.Writer r3) throws java.io.IOException;

    public final java.lang.String translate(java.lang.CharSequence r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.io.IOException -> L17
            int r1 = r3.length()     // Catch: java.io.IOException -> L17
            int r1 = r1 * 2
            r0.<init>(r1)     // Catch: java.io.IOException -> L17
            r2.translate(r3, r0)     // Catch: java.io.IOException -> L17
            java.lang.String r3 = r0.toString()     // Catch: java.io.IOException -> L17
            return r3
        L17:
            r3 = move-exception
            java.io.UncheckedIOException r0 = new java.io.UncheckedIOException
            r0.<init>(r3)
            throw r0
    }

    public final void translate(java.lang.CharSequence r7, java.io.Writer r8) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "writer"
            java.util.Objects.requireNonNull(r8, r0)
            if (r7 != 0) goto L8
            return
        L8:
            int r0 = r7.length()
            r1 = 0
            r2 = r1
        Le:
            if (r2 >= r0) goto L48
            int r3 = r6.translate(r7, r2, r8)
            if (r3 != 0) goto L39
            char r3 = r7.charAt(r2)
            r8.write(r3)
            int r4 = r2 + 1
            boolean r3 = java.lang.Character.isHighSurrogate(r3)
            if (r3 == 0) goto L37
            if (r4 >= r0) goto L37
            char r3 = r7.charAt(r4)
            boolean r5 = java.lang.Character.isLowSurrogate(r3)
            if (r5 == 0) goto L37
            r8.write(r3)
            int r2 = r2 + 2
            goto Le
        L37:
            r2 = r4
            goto Le
        L39:
            r4 = r1
        L3a:
            if (r4 >= r3) goto Le
            int r5 = java.lang.Character.codePointAt(r7, r2)
            int r5 = java.lang.Character.charCount(r5)
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto L3a
        L48:
            return
    }

    public final org.apache.commons.lang3.text.translate.CharSequenceTranslator with(org.apache.commons.lang3.text.translate.CharSequenceTranslator... r6) {
            r5 = this;
            int r0 = r6.length
            r1 = 1
            int r0 = r0 + r1
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r0 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[r0]
            r2 = 0
            r0[r2] = r5
            org.apache.commons.lang3.text.translate.AggregateTranslator r3 = new org.apache.commons.lang3.text.translate.AggregateTranslator
            int r4 = r6.length
            java.lang.Object r6 = org.apache.commons.lang3.ArrayUtils.arraycopy(r6, r2, r0, r1, r4)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r6 = (org.apache.commons.lang3.text.translate.CharSequenceTranslator[]) r6
            r3.<init>(r6)
            return r3
    }
}
