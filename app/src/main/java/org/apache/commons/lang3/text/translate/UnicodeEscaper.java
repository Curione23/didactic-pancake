package org.apache.commons.lang3.text.translate;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class UnicodeEscaper extends org.apache.commons.lang3.text.translate.CodePointTranslator {
    private final int above;
    private final int below;
    private final boolean between;

    public UnicodeEscaper() {
            r3 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 1
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    protected UnicodeEscaper(int r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.below = r1
            r0.above = r2
            r0.between = r3
            return
    }

    public static org.apache.commons.lang3.text.translate.UnicodeEscaper above(int r1) {
            r0 = 0
            org.apache.commons.lang3.text.translate.UnicodeEscaper r1 = outsideOf(r0, r1)
            return r1
    }

    public static org.apache.commons.lang3.text.translate.UnicodeEscaper below(int r1) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            org.apache.commons.lang3.text.translate.UnicodeEscaper r1 = outsideOf(r1, r0)
            return r1
    }

    public static org.apache.commons.lang3.text.translate.UnicodeEscaper between(int r2, int r3) {
            org.apache.commons.lang3.text.translate.UnicodeEscaper r0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper
            r1 = 1
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static org.apache.commons.lang3.text.translate.UnicodeEscaper outsideOf(int r2, int r3) {
            org.apache.commons.lang3.text.translate.UnicodeEscaper r0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    protected java.lang.String toUtf16Escape(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\\u"
            r0.<init>(r1)
            java.lang.String r3 = hex(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    @Override // org.apache.commons.lang3.text.translate.CodePointTranslator
    public boolean translate(int r3, java.io.Writer r4) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.between
            r1 = 0
            if (r0 == 0) goto Le
            int r0 = r2.below
            if (r3 < r0) goto Ld
            int r0 = r2.above
            if (r3 <= r0) goto L17
        Ld:
            return r1
        Le:
            int r0 = r2.below
            if (r3 < r0) goto L17
            int r0 = r2.above
            if (r3 > r0) goto L17
            return r1
        L17:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r3 <= r0) goto L24
            java.lang.String r3 = r2.toUtf16Escape(r3)
            r4.write(r3)
            goto L53
        L24:
            java.lang.String r0 = "\\u"
            r4.write(r0)
            char[] r0 = org.apache.commons.lang3.text.translate.UnicodeEscaper.HEX_DIGITS
            int r1 = r3 >> 12
            r1 = r1 & 15
            char r0 = r0[r1]
            r4.write(r0)
            char[] r0 = org.apache.commons.lang3.text.translate.UnicodeEscaper.HEX_DIGITS
            int r1 = r3 >> 8
            r1 = r1 & 15
            char r0 = r0[r1]
            r4.write(r0)
            char[] r0 = org.apache.commons.lang3.text.translate.UnicodeEscaper.HEX_DIGITS
            int r1 = r3 >> 4
            r1 = r1 & 15
            char r0 = r0[r1]
            r4.write(r0)
            char[] r0 = org.apache.commons.lang3.text.translate.UnicodeEscaper.HEX_DIGITS
            r3 = r3 & 15
            char r3 = r0[r3]
            r4.write(r3)
        L53:
            r3 = 1
            return r3
    }
}
