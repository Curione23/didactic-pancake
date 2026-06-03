package org.apache.commons.lang3.text.translate;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public abstract class CodePointTranslator extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
    public CodePointTranslator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.apache.commons.lang3.text.translate.CharSequenceTranslator
    public final int translate(java.lang.CharSequence r1, int r2, java.io.Writer r3) throws java.io.IOException {
            r0 = this;
            int r1 = java.lang.Character.codePointAt(r1, r2)
            boolean r1 = r0.translate(r1, r3)
            return r1
    }

    public abstract boolean translate(int r1, java.io.Writer r2) throws java.io.IOException;
}
