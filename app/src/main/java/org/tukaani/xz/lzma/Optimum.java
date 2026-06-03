package org.tukaani.xz.lzma;

/* JADX INFO: loaded from: classes2.dex */
final class Optimum {
    private static final int INFINITY_PRICE = 1073741824;
    int backPrev;
    int backPrev2;
    boolean hasPrev2;
    int optPrev;
    int optPrev2;
    boolean prev1IsLiteral;
    int price;
    final int[] reps;
    final org.tukaani.xz.lzma.State state;

    Optimum() {
            r1 = this;
            r1.<init>()
            org.tukaani.xz.lzma.State r0 = new org.tukaani.xz.lzma.State
            r0.<init>()
            r1.state = r0
            r0 = 4
            int[] r0 = new int[r0]
            r1.reps = r0
            return
    }

    void reset() {
            r1 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            r1.price = r0
            return
    }

    void set1(int r1, int r2, int r3) {
            r0 = this;
            r0.price = r1
            r0.optPrev = r2
            r0.backPrev = r3
            r1 = 0
            r0.prev1IsLiteral = r1
            return
    }

    void set2(int r1, int r2, int r3) {
            r0 = this;
            r0.price = r1
            r1 = 1
            int r2 = r2 + r1
            r0.optPrev = r2
            r0.backPrev = r3
            r0.prev1IsLiteral = r1
            r1 = 0
            r0.hasPrev2 = r1
            return
    }

    void set3(int r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.price = r1
            int r4 = r4 + r2
            r1 = 1
            int r4 = r4 + r1
            r0.optPrev = r4
            r0.backPrev = r5
            r0.prev1IsLiteral = r1
            r0.hasPrev2 = r1
            r0.optPrev2 = r2
            r0.backPrev2 = r3
            return
    }
}
