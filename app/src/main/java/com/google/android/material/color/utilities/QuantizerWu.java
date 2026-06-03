package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public final class QuantizerWu implements com.google.android.material.color.utilities.Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    com.google.android.material.color.utilities.QuantizerWu.Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    /* JADX INFO: renamed from: com.google.android.material.color.utilities.QuantizerWu$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction = null;

        static {
                com.google.android.material.color.utilities.QuantizerWu$Direction[] r0 = com.google.android.material.color.utilities.QuantizerWu.Direction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction = r0
                com.google.android.material.color.utilities.QuantizerWu$Direction r1 = com.google.android.material.color.utilities.QuantizerWu.Direction.RED     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.android.material.color.utilities.QuantizerWu$Direction r1 = com.google.android.material.color.utilities.QuantizerWu.Direction.GREEN     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.android.material.color.utilities.QuantizerWu$Direction r1 = com.google.android.material.color.utilities.QuantizerWu.Direction.BLUE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    private static final class Box {
        int b0;
        int b1;
        int g0;
        int g1;
        int r0;
        int r1;
        int vol;

        private Box() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.r0 = r0
                r1.r1 = r0
                r1.g0 = r0
                r1.g1 = r0
                r1.b0 = r0
                r1.b1 = r0
                r1.vol = r0
                return
        }

        /* synthetic */ Box(com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private static final class CreateBoxesResult {
        int resultCount;

        CreateBoxesResult(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.resultCount = r2
                return
        }
    }

    private enum Direction extends java.lang.Enum<com.google.android.material.color.utilities.QuantizerWu.Direction> {
        private static final /* synthetic */ com.google.android.material.color.utilities.QuantizerWu.Direction[] $VALUES = null;
        public static final com.google.android.material.color.utilities.QuantizerWu.Direction BLUE = null;
        public static final com.google.android.material.color.utilities.QuantizerWu.Direction GREEN = null;
        public static final com.google.android.material.color.utilities.QuantizerWu.Direction RED = null;

        static {
                com.google.android.material.color.utilities.QuantizerWu$Direction r0 = new com.google.android.material.color.utilities.QuantizerWu$Direction
                java.lang.String r1 = "RED"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.material.color.utilities.QuantizerWu.Direction.RED = r0
                com.google.android.material.color.utilities.QuantizerWu$Direction r1 = new com.google.android.material.color.utilities.QuantizerWu$Direction
                java.lang.String r2 = "GREEN"
                r3 = 1
                r1.<init>(r2, r3)
                com.google.android.material.color.utilities.QuantizerWu.Direction.GREEN = r1
                com.google.android.material.color.utilities.QuantizerWu$Direction r2 = new com.google.android.material.color.utilities.QuantizerWu$Direction
                java.lang.String r3 = "BLUE"
                r4 = 2
                r2.<init>(r3, r4)
                com.google.android.material.color.utilities.QuantizerWu.Direction.BLUE = r2
                com.google.android.material.color.utilities.QuantizerWu$Direction[] r0 = new com.google.android.material.color.utilities.QuantizerWu.Direction[]{r0, r1, r2}
                com.google.android.material.color.utilities.QuantizerWu.Direction.$VALUES = r0
                return
        }

        Direction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.material.color.utilities.QuantizerWu.Direction valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.material.color.utilities.QuantizerWu$Direction> r0 = com.google.android.material.color.utilities.QuantizerWu.Direction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.material.color.utilities.QuantizerWu$Direction r1 = (com.google.android.material.color.utilities.QuantizerWu.Direction) r1
                return r1
        }

        public static com.google.android.material.color.utilities.QuantizerWu.Direction[] values() {
                com.google.android.material.color.utilities.QuantizerWu$Direction[] r0 = com.google.android.material.color.utilities.QuantizerWu.Direction.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.material.color.utilities.QuantizerWu$Direction[] r0 = (com.google.android.material.color.utilities.QuantizerWu.Direction[]) r0
                return r0
        }
    }

    private static final class MaximizeResult {
        int cutLocation;
        double maximum;

        MaximizeResult(int r1, double r2) {
                r0 = this;
                r0.<init>()
                r0.cutLocation = r1
                r0.maximum = r2
                return
        }
    }

    public QuantizerWu() {
            r0 = this;
            r0.<init>()
            return
    }

    static int bottom(com.google.android.material.color.utilities.QuantizerWu.Box r3, com.google.android.material.color.utilities.QuantizerWu.Direction r4, int[] r5) {
            int[] r0 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L8f
            r1 = 2
            if (r0 == r1) goto L5b
            r1 = 3
            if (r0 != r1) goto L46
            int r4 = r3.r1
            int r0 = r3.g1
            int r1 = r3.b0
            int r4 = getIndex(r4, r0, r1)
            r4 = r5[r4]
            int r4 = -r4
            int r0 = r3.r1
            int r1 = r3.g0
            int r2 = r3.b0
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.r0
            int r1 = r3.g1
            int r2 = r3.b0
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.r0
            int r1 = r3.g0
            int r3 = r3.b0
            int r3 = getIndex(r0, r1, r3)
            r3 = r5[r3]
        L44:
            int r4 = r4 - r3
            return r4
        L46:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected direction "
            r5.<init>(r0)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L5b:
            int r4 = r3.r1
            int r0 = r3.g0
            int r1 = r3.b1
            int r4 = getIndex(r4, r0, r1)
            r4 = r5[r4]
            int r4 = -r4
            int r0 = r3.r1
            int r1 = r3.g0
            int r2 = r3.b0
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.r0
            int r1 = r3.g0
            int r2 = r3.b1
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.r0
            int r1 = r3.g0
            int r3 = r3.b0
            int r3 = getIndex(r0, r1, r3)
            r3 = r5[r3]
            goto L44
        L8f:
            int r4 = r3.r0
            int r0 = r3.g1
            int r1 = r3.b1
            int r4 = getIndex(r4, r0, r1)
            r4 = r5[r4]
            int r4 = -r4
            int r0 = r3.r0
            int r1 = r3.g1
            int r2 = r3.b0
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.r0
            int r1 = r3.g0
            int r2 = r3.b1
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r4 = r4 + r0
            int r0 = r3.r0
            int r1 = r3.g0
            int r3 = r3.b0
            int r3 = getIndex(r0, r1, r3)
            r3 = r5[r3]
            goto L44
    }

    static int getIndex(int r2, int r3, int r4) {
            int r0 = r2 << 10
            int r1 = r2 << 6
            int r0 = r0 + r1
            int r0 = r0 + r2
            int r2 = r3 << 5
            int r0 = r0 + r2
            int r0 = r0 + r3
            int r0 = r0 + r4
            return r0
    }

    static int top(com.google.android.material.color.utilities.QuantizerWu.Box r2, com.google.android.material.color.utilities.QuantizerWu.Direction r3, int r4, int[] r5) {
            int[] r0 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L7d
            r1 = 2
            if (r0 == r1) goto L52
            r1 = 3
            if (r0 != r1) goto L3d
            int r3 = r2.r1
            int r0 = r2.g1
            int r3 = getIndex(r3, r0, r4)
            r3 = r5[r3]
            int r0 = r2.r1
            int r1 = r2.g0
            int r0 = getIndex(r0, r1, r4)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.r0
            int r1 = r2.g1
            int r0 = getIndex(r0, r1, r4)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.r0
            int r2 = r2.g0
            int r2 = getIndex(r0, r2, r4)
            r2 = r5[r2]
        L3b:
            int r3 = r3 + r2
            return r3
        L3d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "unexpected direction "
            r4.<init>(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L52:
            int r3 = r2.r1
            int r0 = r2.b1
            int r3 = getIndex(r3, r4, r0)
            r3 = r5[r3]
            int r0 = r2.r1
            int r1 = r2.b0
            int r0 = getIndex(r0, r4, r1)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.r0
            int r1 = r2.b1
            int r0 = getIndex(r0, r4, r1)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.r0
            int r2 = r2.b0
            int r2 = getIndex(r0, r4, r2)
            r2 = r5[r2]
            goto L3b
        L7d:
            int r3 = r2.g1
            int r0 = r2.b1
            int r3 = getIndex(r4, r3, r0)
            r3 = r5[r3]
            int r0 = r2.g1
            int r1 = r2.b0
            int r0 = getIndex(r4, r0, r1)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.g0
            int r1 = r2.b1
            int r0 = getIndex(r4, r0, r1)
            r0 = r5[r0]
            int r3 = r3 - r0
            int r0 = r2.g0
            int r2 = r2.b0
            int r2 = getIndex(r4, r0, r2)
            r2 = r5[r2]
            goto L3b
    }

    static int volume(com.google.android.material.color.utilities.QuantizerWu.Box r4, int[] r5) {
            int r0 = r4.r1
            int r1 = r4.g1
            int r2 = r4.b1
            int r0 = getIndex(r0, r1, r2)
            r0 = r5[r0]
            int r1 = r4.r1
            int r2 = r4.g1
            int r3 = r4.b0
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 - r1
            int r1 = r4.r1
            int r2 = r4.g0
            int r3 = r4.b1
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 - r1
            int r1 = r4.r1
            int r2 = r4.g0
            int r3 = r4.b0
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 + r1
            int r1 = r4.r0
            int r2 = r4.g1
            int r3 = r4.b1
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 - r1
            int r1 = r4.r0
            int r2 = r4.g1
            int r3 = r4.b0
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 + r1
            int r1 = r4.r0
            int r2 = r4.g0
            int r3 = r4.b1
            int r1 = getIndex(r1, r2, r3)
            r1 = r5[r1]
            int r0 = r0 + r1
            int r1 = r4.r0
            int r2 = r4.g0
            int r4 = r4.b0
            int r4 = getIndex(r1, r2, r4)
            r4 = r5[r4]
            int r0 = r0 - r4
            return r0
    }

    void constructHistogram(java.util.Map<java.lang.Integer, java.lang.Integer> r9) {
            r8 = this;
            r0 = 35937(0x8c61, float:5.0358E-41)
            int[] r1 = new int[r0]
            r8.weights = r1
            int[] r1 = new int[r0]
            r8.momentsR = r1
            int[] r1 = new int[r0]
            r8.momentsG = r1
            int[] r1 = new int[r0]
            r8.momentsB = r1
            double[] r0 = new double[r0]
            r8.moments = r0
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L1f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r2 = com.google.android.material.color.utilities.ColorUtils.redFromArgb(r1)
            int r3 = com.google.android.material.color.utilities.ColorUtils.greenFromArgb(r1)
            int r1 = com.google.android.material.color.utilities.ColorUtils.blueFromArgb(r1)
            int r4 = r2 >> 3
            int r4 = r4 + 1
            int r5 = r3 >> 3
            int r5 = r5 + 1
            int r6 = r1 >> 3
            int r6 = r6 + 1
            int r4 = getIndex(r4, r5, r6)
            int[] r5 = r8.weights
            r6 = r5[r4]
            int r6 = r6 + r0
            r5[r4] = r6
            int[] r5 = r8.momentsR
            r6 = r5[r4]
            int r7 = r2 * r0
            int r6 = r6 + r7
            r5[r4] = r6
            int[] r5 = r8.momentsG
            r6 = r5[r4]
            int r7 = r3 * r0
            int r6 = r6 + r7
            r5[r4] = r6
            int[] r5 = r8.momentsB
            r6 = r5[r4]
            int r7 = r1 * r0
            int r6 = r6 + r7
            r5[r4] = r6
            double[] r5 = r8.moments
            r6 = r5[r4]
            int r2 = r2 * r2
            int r3 = r3 * r3
            int r2 = r2 + r3
            int r1 = r1 * r1
            int r2 = r2 + r1
            int r0 = r0 * r2
            double r0 = (double) r0
            double r6 = r6 + r0
            r5[r4] = r6
            goto L1f
        L8c:
            return
    }

    com.google.android.material.color.utilities.QuantizerWu.CreateBoxesResult createBoxes(int r14) {
            r13 = this;
            com.google.android.material.color.utilities.QuantizerWu$Box[] r0 = new com.google.android.material.color.utilities.QuantizerWu.Box[r14]
            r13.cubes = r0
            r0 = 0
            r1 = r0
        L6:
            if (r1 >= r14) goto L15
            com.google.android.material.color.utilities.QuantizerWu$Box[] r2 = r13.cubes
            com.google.android.material.color.utilities.QuantizerWu$Box r3 = new com.google.android.material.color.utilities.QuantizerWu$Box
            r4 = 0
            r3.<init>(r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L6
        L15:
            double[] r1 = new double[r14]
            com.google.android.material.color.utilities.QuantizerWu$Box[] r2 = r13.cubes
            r2 = r2[r0]
            r3 = 32
            r2.r1 = r3
            r2.g1 = r3
            r2.b1 = r3
            r2 = 1
            r4 = r0
            r3 = r2
        L26:
            if (r3 >= r14) goto L82
            com.google.android.material.color.utilities.QuantizerWu$Box[] r5 = r13.cubes
            r6 = r5[r4]
            r5 = r5[r3]
            java.lang.Boolean r5 = r13.cut(r6, r5)
            boolean r5 = r5.booleanValue()
            r6 = 0
            if (r5 == 0) goto L63
            com.google.android.material.color.utilities.QuantizerWu$Box[] r5 = r13.cubes
            r5 = r5[r4]
            int r5 = r5.vol
            if (r5 <= r2) goto L4b
            com.google.android.material.color.utilities.QuantizerWu$Box[] r5 = r13.cubes
            r5 = r5[r4]
            double r8 = r13.variance(r5)
            goto L4c
        L4b:
            r8 = r6
        L4c:
            r1[r4] = r8
            com.google.android.material.color.utilities.QuantizerWu$Box[] r4 = r13.cubes
            r4 = r4[r3]
            int r4 = r4.vol
            if (r4 <= r2) goto L5f
            com.google.android.material.color.utilities.QuantizerWu$Box[] r4 = r13.cubes
            r4 = r4[r3]
            double r4 = r13.variance(r4)
            goto L60
        L5f:
            r4 = r6
        L60:
            r1[r3] = r4
            goto L67
        L63:
            r1[r4] = r6
            int r3 = r3 + (-1)
        L67:
            r4 = r1[r0]
            r8 = r0
            r9 = r2
        L6b:
            if (r9 > r3) goto L78
            r10 = r1[r9]
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 <= 0) goto L75
            r8 = r9
            r4 = r10
        L75:
            int r9 = r9 + 1
            goto L6b
        L78:
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 > 0) goto L7e
            int r3 = r3 + r2
            goto L83
        L7e:
            int r3 = r3 + 1
            r4 = r8
            goto L26
        L82:
            r3 = r14
        L83:
            com.google.android.material.color.utilities.QuantizerWu$CreateBoxesResult r0 = new com.google.android.material.color.utilities.QuantizerWu$CreateBoxesResult
            r0.<init>(r14, r3)
            return r0
    }

    void createMoments() {
            r22 = this;
            r0 = r22
            r2 = 1
        L3:
            r3 = 33
            if (r2 >= r3) goto La1
            int[] r4 = new int[r3]
            int[] r5 = new int[r3]
            int[] r6 = new int[r3]
            int[] r7 = new int[r3]
            double[] r8 = new double[r3]
            r9 = 1
        L12:
            if (r9 >= r3) goto L9d
            r10 = 0
            r11 = 0
            r13 = r10
            r14 = r11
            r1 = 1
            r11 = r13
            r12 = r11
        L1c:
            if (r1 >= r3) goto L97
            int r16 = getIndex(r2, r9, r1)
            int[] r3 = r0.weights
            r3 = r3[r16]
            int r10 = r10 + r3
            int[] r3 = r0.momentsR
            r3 = r3[r16]
            int r11 = r11 + r3
            int[] r3 = r0.momentsG
            r3 = r3[r16]
            int r12 = r12 + r3
            int[] r3 = r0.momentsB
            r3 = r3[r16]
            int r13 = r13 + r3
            double[] r3 = r0.moments
            r17 = r3[r16]
            double r14 = r14 + r17
            r3 = r4[r1]
            int r3 = r3 + r10
            r4[r1] = r3
            r3 = r5[r1]
            int r3 = r3 + r11
            r5[r1] = r3
            r3 = r6[r1]
            int r3 = r3 + r12
            r6[r1] = r3
            r3 = r7[r1]
            int r3 = r3 + r13
            r7[r1] = r3
            r17 = r8[r1]
            double r17 = r17 + r14
            r8[r1] = r17
            int r3 = r2 + (-1)
            int r3 = getIndex(r3, r9, r1)
            r17 = r10
            int[] r10 = r0.weights
            r18 = r10[r3]
            r19 = r4[r1]
            int r18 = r18 + r19
            r10[r16] = r18
            int[] r10 = r0.momentsR
            r18 = r10[r3]
            r19 = r5[r1]
            int r18 = r18 + r19
            r10[r16] = r18
            int[] r10 = r0.momentsG
            r18 = r10[r3]
            r19 = r6[r1]
            int r18 = r18 + r19
            r10[r16] = r18
            int[] r10 = r0.momentsB
            r18 = r10[r3]
            r19 = r7[r1]
            int r18 = r18 + r19
            r10[r16] = r18
            double[] r10 = r0.moments
            r18 = r10[r3]
            r20 = r8[r1]
            double r18 = r18 + r20
            r10[r16] = r18
            int r1 = r1 + 1
            r10 = r17
            r3 = 33
            goto L1c
        L97:
            int r9 = r9 + 1
            r3 = 33
            goto L12
        L9d:
            int r2 = r2 + 1
            goto L3
        La1:
            return
    }

    java.util.List<java.lang.Integer> createResult(int r8) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            if (r1 >= r8) goto L42
            com.google.android.material.color.utilities.QuantizerWu$Box[] r2 = r7.cubes
            r2 = r2[r1]
            int[] r3 = r7.weights
            int r3 = volume(r2, r3)
            if (r3 <= 0) goto L3f
            int[] r4 = r7.momentsR
            int r4 = volume(r2, r4)
            int r4 = r4 / r3
            int[] r5 = r7.momentsG
            int r5 = volume(r2, r5)
            int r5 = r5 / r3
            int[] r6 = r7.momentsB
            int r2 = volume(r2, r6)
            int r2 = r2 / r3
            r3 = r4 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 | r4
            r4 = r5 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r3 = r3 | r4
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
        L3f:
            int r1 = r1 + 1
            goto L6
        L42:
            return r0
    }

    java.lang.Boolean cut(com.google.android.material.color.utilities.QuantizerWu.Box r18, com.google.android.material.color.utilities.QuantizerWu.Box r19) {
            r17 = this;
            r9 = r17
            r10 = r18
            r11 = r19
            int[] r0 = r9.momentsR
            int r12 = volume(r10, r0)
            int[] r0 = r9.momentsG
            int r13 = volume(r10, r0)
            int[] r0 = r9.momentsB
            int r14 = volume(r10, r0)
            int[] r0 = r9.weights
            int r15 = volume(r10, r0)
            com.google.android.material.color.utilities.QuantizerWu$Direction r2 = com.google.android.material.color.utilities.QuantizerWu.Direction.RED
            int r0 = r10.r0
            r8 = 1
            int r3 = r0 + 1
            int r4 = r10.r1
            r0 = r17
            r1 = r18
            r5 = r12
            r6 = r13
            r7 = r14
            r9 = r8
            r8 = r15
            com.google.android.material.color.utilities.QuantizerWu$MaximizeResult r8 = r0.maximize(r1, r2, r3, r4, r5, r6, r7, r8)
            com.google.android.material.color.utilities.QuantizerWu$Direction r2 = com.google.android.material.color.utilities.QuantizerWu.Direction.GREEN
            int r0 = r10.g0
            int r3 = r0 + 1
            int r4 = r10.g1
            r0 = r17
            r16 = r8
            r8 = r15
            com.google.android.material.color.utilities.QuantizerWu$MaximizeResult r8 = r0.maximize(r1, r2, r3, r4, r5, r6, r7, r8)
            com.google.android.material.color.utilities.QuantizerWu$Direction r2 = com.google.android.material.color.utilities.QuantizerWu.Direction.BLUE
            int r0 = r10.b0
            int r3 = r0 + 1
            int r4 = r10.b1
            r0 = r17
            r12 = r8
            r8 = r15
            com.google.android.material.color.utilities.QuantizerWu$MaximizeResult r0 = r0.maximize(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r16
            double r2 = r1.maximum
            double r4 = r12.maximum
            double r6 = r0.maximum
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 < 0) goto L72
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 < 0) goto L72
            int r2 = r1.cutLocation
            if (r2 >= 0) goto L6f
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L6f:
            com.google.android.material.color.utilities.QuantizerWu$Direction r2 = com.google.android.material.color.utilities.QuantizerWu.Direction.RED
            goto L7f
        L72:
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L7d
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L7d
            com.google.android.material.color.utilities.QuantizerWu$Direction r2 = com.google.android.material.color.utilities.QuantizerWu.Direction.GREEN
            goto L7f
        L7d:
            com.google.android.material.color.utilities.QuantizerWu$Direction r2 = com.google.android.material.color.utilities.QuantizerWu.Direction.BLUE
        L7f:
            int r3 = r10.r1
            r11.r1 = r3
            int r3 = r10.g1
            r11.g1 = r3
            int r3 = r10.b1
            r11.b1 = r3
            int[] r3 = com.google.android.material.color.utilities.QuantizerWu.AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction
            int r2 = r2.ordinal()
            r2 = r3[r2]
            if (r2 == r9) goto Lbe
            r1 = 2
            if (r2 == r1) goto Lad
            r1 = 3
            if (r2 == r1) goto L9c
            goto Lce
        L9c:
            int r0 = r0.cutLocation
            r10.b1 = r0
            int r0 = r10.r0
            r11.r0 = r0
            int r0 = r10.g0
            r11.g0 = r0
            int r0 = r10.b1
            r11.b0 = r0
            goto Lce
        Lad:
            int r0 = r12.cutLocation
            r10.g1 = r0
            int r0 = r10.r0
            r11.r0 = r0
            int r0 = r10.g1
            r11.g0 = r0
            int r0 = r10.b0
            r11.b0 = r0
            goto Lce
        Lbe:
            int r0 = r1.cutLocation
            r10.r1 = r0
            int r0 = r10.r1
            r11.r0 = r0
            int r0 = r10.g0
            r11.g0 = r0
            int r0 = r10.b0
            r11.b0 = r0
        Lce:
            int r0 = r10.r1
            int r1 = r10.r0
            int r0 = r0 - r1
            int r1 = r10.g1
            int r2 = r10.g0
            int r1 = r1 - r2
            int r0 = r0 * r1
            int r1 = r10.b1
            int r2 = r10.b0
            int r1 = r1 - r2
            int r0 = r0 * r1
            r10.vol = r0
            int r0 = r11.r1
            int r1 = r11.r0
            int r0 = r0 - r1
            int r1 = r11.g1
            int r2 = r11.g0
            int r1 = r1 - r2
            int r0 = r0 * r1
            int r1 = r11.b1
            int r2 = r11.b0
            int r1 = r1 - r2
            int r0 = r0 * r1
            r11.vol = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            return r0
    }

    com.google.android.material.color.utilities.QuantizerWu.MaximizeResult maximize(com.google.android.material.color.utilities.QuantizerWu.Box r19, com.google.android.material.color.utilities.QuantizerWu.Direction r20, int r21, int r22, int r23, int r24, int r25, int r26) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            int[] r3 = r0.momentsR
            int r3 = bottom(r1, r2, r3)
            int[] r4 = r0.momentsG
            int r4 = bottom(r1, r2, r4)
            int[] r5 = r0.momentsB
            int r5 = bottom(r1, r2, r5)
            int[] r6 = r0.weights
            int r6 = bottom(r1, r2, r6)
            r7 = 0
            r9 = -1
            r11 = r22
            r10 = r9
            r8 = r7
            r7 = r21
        L27:
            if (r7 >= r11) goto L7e
            int[] r12 = r0.momentsR
            int r12 = top(r1, r2, r7, r12)
            int r12 = r12 + r3
            int[] r13 = r0.momentsG
            int r13 = top(r1, r2, r7, r13)
            int r13 = r13 + r4
            int[] r14 = r0.momentsB
            int r14 = top(r1, r2, r7, r14)
            int r14 = r14 + r5
            int[] r15 = r0.weights
            int r15 = top(r1, r2, r7, r15)
            int r15 = r15 + r6
            if (r15 != 0) goto L4a
            r16 = r3
            goto L73
        L4a:
            int r16 = r12 * r12
            int r17 = r13 * r13
            int r16 = r16 + r17
            int r17 = r14 * r14
            int r0 = r16 + r17
            double r0 = (double) r0
            r16 = r3
            double r2 = (double) r15
            double r0 = r0 / r2
            int r2 = r23 - r12
            int r3 = r24 - r13
            int r12 = r25 - r14
            int r13 = r26 - r15
            if (r13 != 0) goto L64
            goto L73
        L64:
            int r2 = r2 * r2
            int r3 = r3 * r3
            int r2 = r2 + r3
            int r12 = r12 * r12
            int r2 = r2 + r12
            double r2 = (double) r2
            double r12 = (double) r13
            double r2 = r2 / r12
            double r0 = r0 + r2
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L73
            r8 = r0
            r10 = r7
        L73:
            int r7 = r7 + 1
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r16
            goto L27
        L7e:
            com.google.android.material.color.utilities.QuantizerWu$MaximizeResult r0 = new com.google.android.material.color.utilities.QuantizerWu$MaximizeResult
            r0.<init>(r10, r8)
            return r0
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public com.google.android.material.color.utilities.QuantizerResult quantize(int[] r3, int r4) {
            r2 = this;
            com.google.android.material.color.utilities.QuantizerMap r0 = new com.google.android.material.color.utilities.QuantizerMap
            r0.<init>()
            com.google.android.material.color.utilities.QuantizerResult r3 = r0.quantize(r3, r4)
            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = r3.colorToCount
            r2.constructHistogram(r3)
            r2.createMoments()
            com.google.android.material.color.utilities.QuantizerWu$CreateBoxesResult r3 = r2.createBoxes(r4)
            int r3 = r3.resultCount
            java.util.List r3 = r2.createResult(r3)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L24:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r3.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.put(r0, r1)
            goto L24
        L41:
            com.google.android.material.color.utilities.QuantizerResult r3 = new com.google.android.material.color.utilities.QuantizerResult
            r3.<init>(r4)
            return r3
    }

    double variance(com.google.android.material.color.utilities.QuantizerWu.Box r10) {
            r9 = this;
            int[] r0 = r9.momentsR
            int r0 = volume(r10, r0)
            int[] r1 = r9.momentsG
            int r1 = volume(r10, r1)
            int[] r2 = r9.momentsB
            int r2 = volume(r10, r2)
            double[] r3 = r9.moments
            int r4 = r10.r1
            int r5 = r10.g1
            int r6 = r10.b1
            int r4 = getIndex(r4, r5, r6)
            r4 = r3[r4]
            double[] r3 = r9.moments
            int r6 = r10.r1
            int r7 = r10.g1
            int r8 = r10.b0
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 - r6
            double[] r3 = r9.moments
            int r6 = r10.r1
            int r7 = r10.g0
            int r8 = r10.b1
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 - r6
            double[] r3 = r9.moments
            int r6 = r10.r1
            int r7 = r10.g0
            int r8 = r10.b0
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 + r6
            double[] r3 = r9.moments
            int r6 = r10.r0
            int r7 = r10.g1
            int r8 = r10.b1
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 - r6
            double[] r3 = r9.moments
            int r6 = r10.r0
            int r7 = r10.g1
            int r8 = r10.b0
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 + r6
            double[] r3 = r9.moments
            int r6 = r10.r0
            int r7 = r10.g0
            int r8 = r10.b1
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 + r6
            double[] r3 = r9.moments
            int r6 = r10.r0
            int r7 = r10.g0
            int r8 = r10.b0
            int r6 = getIndex(r6, r7, r8)
            r6 = r3[r6]
            double r4 = r4 - r6
            int r0 = r0 * r0
            int r1 = r1 * r1
            int r0 = r0 + r1
            int r2 = r2 * r2
            int r0 = r0 + r2
            int[] r1 = r9.weights
            int r10 = volume(r10, r1)
            double r0 = (double) r0
            double r2 = (double) r10
            double r0 = r0 / r2
            double r4 = r4 - r0
            return r4
    }
}
