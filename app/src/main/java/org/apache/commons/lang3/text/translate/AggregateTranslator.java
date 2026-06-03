package org.apache.commons.lang3.text.translate;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class AggregateTranslator extends org.apache.commons.lang3.text.translate.CharSequenceTranslator {
    private final org.apache.commons.lang3.text.translate.CharSequenceTranslator[] translators;

    public AggregateTranslator(org.apache.commons.lang3.text.translate.CharSequenceTranslator... r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object[] r1 = org.apache.commons.lang3.ArrayUtils.clone(r1)
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r1 = (org.apache.commons.lang3.text.translate.CharSequenceTranslator[]) r1
            r0.translators = r1
            return
    }

    @Override // org.apache.commons.lang3.text.translate.CharSequenceTranslator
    public int translate(java.lang.CharSequence r6, int r7, java.io.Writer r8) throws java.io.IOException {
            r5 = this;
            org.apache.commons.lang3.text.translate.CharSequenceTranslator[] r0 = r5.translators
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r1) goto L13
            r4 = r0[r3]
            int r4 = r4.translate(r6, r7, r8)
            if (r4 == 0) goto L10
            return r4
        L10:
            int r3 = r3 + 1
            goto L5
        L13:
            return r2
    }
}
