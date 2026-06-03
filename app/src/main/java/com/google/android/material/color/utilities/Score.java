package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public final class Score {
    private static final int BLUE_500 = -12417548;
    private static final double CUTOFF_CHROMA = 5.0d;
    private static final double CUTOFF_EXCITED_PROPORTION = 0.01d;
    private static final int MAX_COLOR_COUNT = 4;
    private static final double TARGET_CHROMA = 48.0d;
    private static final double WEIGHT_CHROMA_ABOVE = 0.3d;
    private static final double WEIGHT_CHROMA_BELOW = 0.1d;
    private static final double WEIGHT_PROPORTION = 0.7d;

    private static class ScoredComparator implements java.util.Comparator<com.google.android.material.color.utilities.Score.ScoredHCT> {
        public ScoredComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(com.google.android.material.color.utilities.Score.ScoredHCT r3, com.google.android.material.color.utilities.Score.ScoredHCT r4) {
                r2 = this;
                double r0 = r4.score
                double r3 = r3.score
                int r3 = java.lang.Double.compare(r0, r3)
                return r3
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(com.google.android.material.color.utilities.Score.ScoredHCT r1, com.google.android.material.color.utilities.Score.ScoredHCT r2) {
                r0 = this;
                com.google.android.material.color.utilities.Score$ScoredHCT r1 = (com.google.android.material.color.utilities.Score.ScoredHCT) r1
                com.google.android.material.color.utilities.Score$ScoredHCT r2 = (com.google.android.material.color.utilities.Score.ScoredHCT) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    private static class ScoredHCT {
        public final com.google.android.material.color.utilities.Hct hct;
        public final double score;

        public ScoredHCT(com.google.android.material.color.utilities.Hct r1, double r2) {
                r0 = this;
                r0.<init>()
                r0.hct = r1
                r0.score = r2
                return
        }
    }

    private Score() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.List<java.lang.Integer> score(java.util.Map<java.lang.Integer, java.lang.Integer> r3) {
            r0 = -12417548(0xffffffffff4285f4, float:-2.5856576E38)
            r1 = 1
            r2 = 4
            java.util.List r3 = score(r3, r2, r0, r1)
            return r3
    }

    public static java.util.List<java.lang.Integer> score(java.util.Map<java.lang.Integer, java.lang.Integer> r2, int r3) {
            r0 = -12417548(0xffffffffff4285f4, float:-2.5856576E38)
            r1 = 1
            java.util.List r2 = score(r2, r3, r0, r1)
            return r2
    }

    public static java.util.List<java.lang.Integer> score(java.util.Map<java.lang.Integer, java.lang.Integer> r1, int r2, int r3) {
            r0 = 1
            java.util.List r1 = score(r1, r2, r3, r0)
            return r1
    }

    public static java.util.List<java.lang.Integer> score(java.util.Map<java.lang.Integer, java.lang.Integer> r12, int r13, int r14, boolean r15) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 360(0x168, float:5.04E-43)
            int[] r2 = new int[r1]
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
            r3 = 0
        L13:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L4b
            java.lang.Object r5 = r12.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            com.google.android.material.color.utilities.Hct r6 = com.google.android.material.color.utilities.Hct.fromInt(r6)
            r0.add(r6)
            double r6 = r6.getHue()
            double r6 = java.lang.Math.floor(r6)
            int r6 = (int) r6
            java.lang.Object r5 = r5.getValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7 = r2[r6]
            int r7 = r7 + r5
            r2[r6] = r7
            double r5 = (double) r5
            double r3 = r3 + r5
            goto L13
        L4b:
            double[] r12 = new double[r1]
            r5 = 0
        L4e:
            if (r5 >= r1) goto L69
            r6 = r2[r5]
            double r6 = (double) r6
            double r6 = r6 / r3
            int r8 = r5 + (-14)
        L56:
            int r9 = r5 + 16
            if (r8 >= r9) goto L66
            int r9 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesInt(r8)
            r10 = r12[r9]
            double r10 = r10 + r6
            r12[r9] = r10
            int r8 = r8 + 1
            goto L56
        L66:
            int r5 = r5 + 1
            goto L4e
        L69:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L72:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Ld1
            java.lang.Object r2 = r0.next()
            com.google.android.material.color.utilities.Hct r2 = (com.google.android.material.color.utilities.Hct) r2
            double r3 = r2.getHue()
            long r3 = java.lang.Math.round(r3)
            int r3 = (int) r3
            int r3 = com.google.android.material.color.utilities.MathUtils.sanitizeDegreesInt(r3)
            r3 = r12[r3]
            if (r15 == 0) goto La3
            double r5 = r2.getChroma()
            r7 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L72
            r5 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 > 0) goto La3
            goto L72
        La3:
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r5
            r5 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r3 = r3 * r5
            double r5 = r2.getChroma()
            r7 = 4631952216750555136(0x4048000000000000, double:48.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto Lbc
            r5 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            goto Lc1
        Lbc:
            r5 = 4599075939470750515(0x3fd3333333333333, double:0.3)
        Lc1:
            double r9 = r2.getChroma()
            double r9 = r9 - r7
            double r9 = r9 * r5
            double r3 = r3 + r9
            com.google.android.material.color.utilities.Score$ScoredHCT r5 = new com.google.android.material.color.utilities.Score$ScoredHCT
            r5.<init>(r2, r3)
            r1.add(r5)
            goto L72
        Ld1:
            com.google.android.material.color.utilities.Score$ScoredComparator r12 = new com.google.android.material.color.utilities.Score$ScoredComparator
            r12.<init>()
            java.util.Collections.sort(r1, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r15 = 90
        Le0:
            r0 = 15
            if (r15 < r0) goto L12e
            r12.clear()
            java.util.Iterator r0 = r1.iterator()
        Leb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L124
            java.lang.Object r2 = r0.next()
            com.google.android.material.color.utilities.Score$ScoredHCT r2 = (com.google.android.material.color.utilities.Score.ScoredHCT) r2
            com.google.android.material.color.utilities.Hct r2 = r2.hct
            java.util.Iterator r3 = r12.iterator()
        Lfd:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L11b
            java.lang.Object r4 = r3.next()
            com.google.android.material.color.utilities.Hct r4 = (com.google.android.material.color.utilities.Hct) r4
            double r5 = r2.getHue()
            double r7 = r4.getHue()
            double r4 = com.google.android.material.color.utilities.MathUtils.differenceDegrees(r5, r7)
            double r6 = (double) r15
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto Lfd
            goto L11e
        L11b:
            r12.add(r2)
        L11e:
            int r2 = r12.size()
            if (r2 < r13) goto Leb
        L124:
            int r0 = r12.size()
            if (r0 < r13) goto L12b
            goto L12e
        L12b:
            int r15 = r15 + (-1)
            goto Le0
        L12e:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            boolean r15 = r12.isEmpty()
            if (r15 == 0) goto L141
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            r13.add(r12)
            return r13
        L141:
            java.util.Iterator r12 = r12.iterator()
        L145:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L15d
            java.lang.Object r14 = r12.next()
            com.google.android.material.color.utilities.Hct r14 = (com.google.android.material.color.utilities.Hct) r14
            int r14 = r14.toInt()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13.add(r14)
            goto L145
        L15d:
            return r13
    }
}
