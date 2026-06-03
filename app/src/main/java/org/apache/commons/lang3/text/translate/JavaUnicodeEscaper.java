package org.apache.commons.lang3.text.translate;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class JavaUnicodeEscaper extends org.apache.commons.lang3.text.translate.UnicodeEscaper {
    public JavaUnicodeEscaper(int r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper above(int r1) {
            r0 = 0
            org.apache.commons.lang3.text.translate.JavaUnicodeEscaper r1 = outsideOf(r0, r1)
            return r1
    }

    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper below(int r1) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            org.apache.commons.lang3.text.translate.JavaUnicodeEscaper r1 = outsideOf(r1, r0)
            return r1
    }

    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper between(int r2, int r3) {
            org.apache.commons.lang3.text.translate.JavaUnicodeEscaper r0 = new org.apache.commons.lang3.text.translate.JavaUnicodeEscaper
            r1 = 1
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static org.apache.commons.lang3.text.translate.JavaUnicodeEscaper outsideOf(int r2, int r3) {
            org.apache.commons.lang3.text.translate.JavaUnicodeEscaper r0 = new org.apache.commons.lang3.text.translate.JavaUnicodeEscaper
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @Override // org.apache.commons.lang3.text.translate.UnicodeEscaper
    protected java.lang.String toUtf16Escape(int r4) {
            r3 = this;
            char[] r4 = java.lang.Character.toChars(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\\u"
            r0.<init>(r1)
            r2 = 0
            char r2 = r4[r2]
            java.lang.String r2 = hex(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 1
            char r4 = r4[r1]
            java.lang.String r4 = hex(r4)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            return r4
    }
}
