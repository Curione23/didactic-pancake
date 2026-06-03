package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    private static final class Distance implements java.lang.Comparable<com.google.android.material.color.utilities.QuantizerWsmeans.Distance> {
        double distance;
        int index;

        Distance() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.index = r0
                r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                r2.distance = r0
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.google.android.material.color.utilities.QuantizerWsmeans.Distance r4) {
                r3 = this;
                double r0 = r3.distance
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                double r1 = r4.distance
                java.lang.Double r4 = java.lang.Double.valueOf(r1)
                int r4 = r0.compareTo(r4)
                return r4
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.google.android.material.color.utilities.QuantizerWsmeans.Distance r1) {
                r0 = this;
                com.google.android.material.color.utilities.QuantizerWsmeans$Distance r1 = (com.google.android.material.color.utilities.QuantizerWsmeans.Distance) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }
    }

    private QuantizerWsmeans() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.Map<java.lang.Integer, java.lang.Integer> quantize(int[] r25, int[] r26, int r27) {
            r0 = r25
            r1 = r26
            java.util.Random r2 = new java.util.Random
            r3 = 272008(0x42688, double:1.3439E-318)
            r2.<init>(r3)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            int r4 = r0.length
            double[][] r4 = new double[r4][]
            int r5 = r0.length
            int[] r5 = new int[r5]
            com.google.android.material.color.utilities.PointProviderLab r6 = new com.google.android.material.color.utilities.PointProviderLab
            r6.<init>()
            r8 = 0
            r9 = 0
        L1e:
            int r10 = r0.length
            r11 = 1
            if (r8 >= r10) goto L59
            r10 = r0[r8]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            java.lang.Object r12 = r3.get(r12)
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 != 0) goto L46
            double[] r12 = r6.fromInt(r10)
            r4[r9] = r12
            r5[r9] = r10
            int r9 = r9 + 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3.put(r10, r11)
            goto L56
        L46:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r12 = r12.intValue()
            int r12 = r12 + r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r3.put(r10, r11)
        L56:
            int r8 = r8 + 1
            goto L1e
        L59:
            int[] r0 = new int[r9]
            r8 = 0
        L5c:
            if (r8 >= r9) goto L73
            r10 = r5[r8]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r3.get(r10)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0[r8] = r10
            int r8 = r8 + 1
            goto L5c
        L73:
            r8 = r27
            int r3 = java.lang.Math.min(r8, r9)
            int r5 = r1.length
            if (r5 == 0) goto L81
            int r5 = r1.length
            int r3 = java.lang.Math.min(r3, r5)
        L81:
            double[][] r5 = new double[r3][]
            r8 = 0
            r10 = 0
        L85:
            int r12 = r1.length
            if (r8 >= r12) goto L95
            r12 = r1[r8]
            double[] r12 = r6.fromInt(r12)
            r5[r8] = r12
            int r10 = r10 + 1
            int r8 = r8 + 1
            goto L85
        L95:
            int r1 = r3 - r10
            if (r1 <= 0) goto L9f
            r8 = 0
        L9a:
            if (r8 >= r1) goto L9f
            int r8 = r8 + 1
            goto L9a
        L9f:
            int[] r1 = new int[r9]
            r8 = 0
        La2:
            if (r8 >= r9) goto Lad
            int r10 = r2.nextInt(r3)
            r1[r8] = r10
            int r8 = r8 + 1
            goto La2
        Lad:
            int[][] r2 = new int[r3][]
            r8 = 0
        Lb0:
            if (r8 >= r3) goto Lb9
            int[] r10 = new int[r3]
            r2[r8] = r10
            int r8 = r8 + 1
            goto Lb0
        Lb9:
            com.google.android.material.color.utilities.QuantizerWsmeans$Distance[][] r8 = new com.google.android.material.color.utilities.QuantizerWsmeans.Distance[r3][]
            r10 = 0
        Lbc:
            if (r10 >= r3) goto Ld4
            com.google.android.material.color.utilities.QuantizerWsmeans$Distance[] r12 = new com.google.android.material.color.utilities.QuantizerWsmeans.Distance[r3]
            r8[r10] = r12
            r12 = 0
        Lc3:
            if (r12 >= r3) goto Ld1
            r13 = r8[r10]
            com.google.android.material.color.utilities.QuantizerWsmeans$Distance r14 = new com.google.android.material.color.utilities.QuantizerWsmeans$Distance
            r14.<init>()
            r13[r12] = r14
            int r12 = r12 + 1
            goto Lc3
        Ld1:
            int r10 = r10 + 1
            goto Lbc
        Ld4:
            int[] r10 = new int[r3]
            r12 = 0
        Ld7:
            r13 = 10
            if (r12 >= r13) goto L228
            r13 = 0
        Ldc:
            if (r13 >= r3) goto L127
            int r14 = r13 + 1
            r15 = r14
        Le1:
            if (r15 >= r3) goto L10b
            r11 = r5[r13]
            r7 = r5[r15]
            r25 = r10
            double r10 = r6.distance(r11, r7)
            r7 = r8[r15]
            r7 = r7[r13]
            r7.distance = r10
            r7 = r8[r15]
            r7 = r7[r13]
            r7.index = r13
            r7 = r8[r13]
            r7 = r7[r15]
            r7.distance = r10
            r7 = r8[r13]
            r7 = r7[r15]
            r7.index = r15
            int r15 = r15 + 1
            r10 = r25
            r11 = 1
            goto Le1
        L10b:
            r25 = r10
            r7 = r8[r13]
            java.util.Arrays.sort(r7)
            r7 = 0
        L113:
            if (r7 >= r3) goto L122
            r10 = r2[r13]
            r11 = r8[r13]
            r11 = r11[r7]
            int r11 = r11.index
            r10[r7] = r11
            int r7 = r7 + 1
            goto L113
        L122:
            r11 = 1
            r10 = r25
            r13 = r14
            goto Ldc
        L127:
            r25 = r10
            r7 = 0
            r10 = 0
        L12b:
            if (r7 >= r9) goto L191
            r11 = r4[r7]
            r13 = r1[r7]
            r14 = r5[r13]
            double r14 = r6.distance(r11, r14)
            r26 = r2
            r18 = r0
            r19 = r14
            r0 = -1
            r2 = 0
        L13f:
            if (r2 >= r3) goto L168
            r21 = r8[r13]
            r22 = r8
            r8 = r21[r2]
            r21 = r9
            double r8 = r8.distance
            r23 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r23 = r23 * r14
            int r8 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r8 < 0) goto L154
            goto L161
        L154:
            r8 = r5[r2]
            double r8 = r6.distance(r11, r8)
            int r23 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r23 >= 0) goto L161
            r0 = r2
            r19 = r8
        L161:
            int r2 = r2 + 1
            r9 = r21
            r8 = r22
            goto L13f
        L168:
            r22 = r8
            r21 = r9
            r2 = -1
            if (r0 == r2) goto L186
            double r8 = java.lang.Math.sqrt(r19)
            double r13 = java.lang.Math.sqrt(r14)
            double r8 = r8 - r13
            double r8 = java.lang.Math.abs(r8)
            r13 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r2 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r2 <= 0) goto L186
            int r10 = r10 + 1
            r1[r7] = r0
        L186:
            int r7 = r7 + 1
            r2 = r26
            r0 = r18
            r9 = r21
            r8 = r22
            goto L12b
        L191:
            r18 = r0
            r26 = r2
            r22 = r8
            r21 = r9
            if (r10 != 0) goto L1a2
            if (r12 == 0) goto L1a2
            r12 = 0
            r9 = r25
            goto L22a
        L1a2:
            double[] r0 = new double[r3]
            double[] r2 = new double[r3]
            double[] r7 = new double[r3]
            r9 = r25
            r8 = 0
            java.util.Arrays.fill(r9, r8)
            r10 = r8
        L1af:
            r13 = r21
            if (r10 >= r13) goto L1ea
            r14 = r1[r10]
            r15 = r4[r10]
            r11 = r18[r10]
            r17 = r9[r14]
            int r17 = r17 + r11
            r9[r14] = r17
            r19 = r0[r14]
            r23 = r15[r8]
            r8 = r12
            double r11 = (double) r11
            double r23 = r23 * r11
            double r19 = r19 + r23
            r0[r14] = r19
            r19 = r2[r14]
            r16 = 1
            r23 = r15[r16]
            double r23 = r23 * r11
            double r19 = r19 + r23
            r2[r14] = r19
            r19 = r7[r14]
            r21 = 2
            r23 = r15[r21]
            double r23 = r23 * r11
            double r19 = r19 + r23
            r7[r14] = r19
            int r10 = r10 + 1
            r12 = r8
            r21 = r13
            r8 = 0
            goto L1af
        L1ea:
            r8 = r12
            r10 = 0
        L1ec:
            if (r10 >= r3) goto L218
            r11 = r9[r10]
            if (r11 != 0) goto L1fe
            r11 = 3
            double[] r11 = new double[r11]
            r11 = {x0258: FILL_ARRAY_DATA , data: [0, 0, 0} // fill-array
            r5[r10] = r11
            r12 = 0
            r14 = 1
            r15 = 2
            goto L215
        L1fe:
            r14 = r0[r10]
            double r11 = (double) r11
            double r14 = r14 / r11
            r19 = r2[r10]
            double r19 = r19 / r11
            r23 = r7[r10]
            double r23 = r23 / r11
            r11 = r5[r10]
            r12 = 0
            r11[r12] = r14
            r14 = 1
            r11[r14] = r19
            r15 = 2
            r11[r15] = r23
        L215:
            int r10 = r10 + 1
            goto L1ec
        L218:
            r12 = 0
            r14 = 1
            int r0 = r8 + 1
            r2 = r26
            r12 = r0
            r10 = r9
            r9 = r13
            r11 = r14
            r0 = r18
            r8 = r22
            goto Ld7
        L228:
            r9 = r10
            r12 = 0
        L22a:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r7 = r12
        L230:
            if (r7 >= r3) goto L256
            r1 = r9[r7]
            if (r1 != 0) goto L237
            goto L253
        L237:
            r2 = r5[r7]
            int r2 = r6.toInt(r2)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r4 = r0.containsKey(r4)
            if (r4 == 0) goto L248
            goto L253
        L248:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r1)
        L253:
            int r7 = r7 + 1
            goto L230
        L256:
            return r0
    }
}
