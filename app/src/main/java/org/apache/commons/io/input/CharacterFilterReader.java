package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class CharacterFilterReader extends org.apache.commons.io.input.AbstractCharacterFilterReader {
    public CharacterFilterReader(java.io.Reader r2, int r3) {
            r1 = this;
            org.apache.commons.io.input.CharacterFilterReader$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.input.CharacterFilterReader$$ExternalSyntheticLambda0
            r0.<init>(r3)
            r1.<init>(r2, r0)
            return
    }

    public CharacterFilterReader(java.io.Reader r1, java.util.function.IntPredicate r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ boolean lambda$new$0(int r0, int r1) {
            if (r1 != r0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            return r0
    }
}
