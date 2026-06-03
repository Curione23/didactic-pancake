package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class CharacterSetFilterReader extends org.apache.commons.io.input.AbstractCharacterFilterReader {
    public CharacterSetFilterReader(java.io.Reader r1, java.util.Set<java.lang.Integer> r2) {
            r0 = this;
            java.util.function.IntPredicate r2 = toIntPredicate(r2)
            r0.<init>(r1, r2)
            return
    }

    public CharacterSetFilterReader(java.io.Reader r2, java.lang.Integer... r3) {
            r1 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0.<init>(r3)
            r1.<init>(r2, r0)
            return
    }

    static /* synthetic */ boolean lambda$toIntPredicate$0(java.util.Set r0, int r1) {
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            return r0
    }

    private static java.util.function.IntPredicate toIntPredicate(java.util.Set<java.lang.Integer> r1) {
            if (r1 != 0) goto L5
            java.util.function.IntPredicate r1 = org.apache.commons.io.input.CharacterSetFilterReader.SKIP_NONE
            return r1
        L5:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            org.apache.commons.io.input.CharacterSetFilterReader$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.input.CharacterSetFilterReader$$ExternalSyntheticLambda0
            r0.<init>(r1)
            return r0
    }
}
