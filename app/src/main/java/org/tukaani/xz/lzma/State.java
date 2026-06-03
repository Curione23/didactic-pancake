package org.tukaani.xz.lzma;

/* JADX INFO: loaded from: classes2.dex */
final class State {
    private static final int LIT_LIT = 0;
    private static final int LIT_LONGREP = 8;
    private static final int LIT_MATCH = 7;
    private static final int LIT_SHORTREP = 9;
    private static final int LIT_STATES = 7;
    private static final int MATCH_LIT = 4;
    private static final int MATCH_LIT_LIT = 1;
    private static final int NONLIT_MATCH = 10;
    private static final int NONLIT_REP = 11;
    private static final int REP_LIT = 5;
    private static final int REP_LIT_LIT = 2;
    private static final int SHORTREP_LIT = 6;
    private static final int SHORTREP_LIT_LIT = 3;
    static final int STATES = 12;
    private int state;

    State() {
            r0 = this;
            r0.<init>()
            return
    }

    State(org.tukaani.xz.lzma.State r1) {
            r0 = this;
            r0.<init>()
            int r1 = r1.state
            r0.state = r1
            return
    }

    int get() {
            r1 = this;
            int r0 = r1.state
            return r0
    }

    boolean isLiteral() {
            r2 = this;
            int r0 = r2.state
            r1 = 7
            if (r0 >= r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    void reset() {
            r1 = this;
            r0 = 0
            r1.state = r0
            return
    }

    void set(org.tukaani.xz.lzma.State r1) {
            r0 = this;
            int r1 = r1.state
            r0.state = r1
            return
    }

    void updateLiteral() {
            r3 = this;
            int r0 = r3.state
            r1 = 3
            if (r0 > r1) goto L9
            r0 = 0
            r3.state = r0
            goto L15
        L9:
            r2 = 9
            if (r0 > r2) goto L11
            int r0 = r0 - r1
            r3.state = r0
            goto L15
        L11:
            int r0 = r0 + (-6)
            r3.state = r0
        L15:
            return
    }

    void updateLongRep() {
            r2 = this;
            int r0 = r2.state
            r1 = 7
            if (r0 >= r1) goto L8
            r0 = 8
            goto La
        L8:
            r0 = 11
        La:
            r2.state = r0
            return
    }

    void updateMatch() {
            r2 = this;
            int r0 = r2.state
            r1 = 7
            if (r0 >= r1) goto L6
            goto L8
        L6:
            r1 = 10
        L8:
            r2.state = r1
            return
    }

    void updateShortRep() {
            r2 = this;
            int r0 = r2.state
            r1 = 7
            if (r0 >= r1) goto L8
            r0 = 9
            goto La
        L8:
            r0 = 11
        La:
            r2.state = r0
            return
    }
}
