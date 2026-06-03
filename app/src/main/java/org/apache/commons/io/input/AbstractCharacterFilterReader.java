package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractCharacterFilterReader extends java.io.FilterReader {
    protected static final java.util.function.IntPredicate SKIP_NONE = null;
    private final java.util.function.IntPredicate skip;

    static {
            org.apache.commons.io.input.AbstractCharacterFilterReader$$ExternalSyntheticLambda0 r0 = new org.apache.commons.io.input.AbstractCharacterFilterReader$$ExternalSyntheticLambda0
            r0.<init>()
            org.apache.commons.io.input.AbstractCharacterFilterReader.SKIP_NONE = r0
            return
    }

    protected AbstractCharacterFilterReader(java.io.Reader r2) {
            r1 = this;
            java.util.function.IntPredicate r0 = org.apache.commons.io.input.AbstractCharacterFilterReader.SKIP_NONE
            r1.<init>(r2, r0)
            return
    }

    protected AbstractCharacterFilterReader(java.io.Reader r1, java.util.function.IntPredicate r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 != 0) goto L7
            java.util.function.IntPredicate r2 = org.apache.commons.io.input.AbstractCharacterFilterReader.SKIP_NONE
        L7:
            r0.skip = r2
            return
    }

    static /* synthetic */ boolean lambda$static$0(int r0) {
            r0 = 0
            return r0
    }

    protected boolean filter(int r2) {
            r1 = this;
            java.util.function.IntPredicate r0 = r1.skip
            boolean r2 = r0.test(r2)
            return r2
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws java.io.IOException {
            r2 = this;
        L0:
            java.io.Reader r0 = r2.in
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto Lf
            boolean r1 = r2.filter(r0)
            if (r1 != 0) goto L0
        Lf:
            return r0
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            int r6 = super.read(r4, r5, r6)
            r0 = -1
            if (r6 != r0) goto L8
            return r0
        L8:
            int r0 = r5 + (-1)
            r1 = r5
        Lb:
            int r2 = r5 + r6
            if (r1 >= r2) goto L23
            char r2 = r4[r1]
            boolean r2 = r3.filter(r2)
            if (r2 == 0) goto L18
            goto L20
        L18:
            int r0 = r0 + 1
            if (r0 >= r1) goto L20
            char r2 = r4[r1]
            r4[r0] = r2
        L20:
            int r1 = r1 + 1
            goto Lb
        L23:
            int r0 = r0 - r5
            int r0 = r0 + 1
            return r0
    }
}
