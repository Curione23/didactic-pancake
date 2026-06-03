package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BandSet {
    private static final byte[] EMPTY_BYTE_ARRAY = null;
    private static final int[] effortThresholds = null;
    private long[] canonicalLargest;
    private long[] canonicalSmallest;
    final int effort;
    protected final org.apache.commons.compress.harmony.pack200.SegmentHeader segmentHeader;

    public class BandAnalysisResults {
        private org.apache.commons.compress.harmony.pack200.Codec betterCodec;
        private byte[] encodedBand;
        private int[] extraMetadata;
        private int numCodecsTried;
        private int saved;
        final /* synthetic */ org.apache.commons.compress.harmony.pack200.BandSet this$0;

        public BandAnalysisResults(org.apache.commons.compress.harmony.pack200.BandSet r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        static /* synthetic */ byte[] access$000(org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults r0) {
                byte[] r0 = r0.encodedBand
                return r0
        }

        static /* synthetic */ byte[] access$002(org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults r0, byte[] r1) {
                r0.encodedBand = r1
                return r1
        }

        static /* synthetic */ org.apache.commons.compress.harmony.pack200.Codec access$200(org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults r0) {
                org.apache.commons.compress.harmony.pack200.Codec r0 = r0.betterCodec
                return r0
        }

        static /* synthetic */ org.apache.commons.compress.harmony.pack200.Codec access$202(org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults r0, org.apache.commons.compress.harmony.pack200.Codec r1) {
                r0.betterCodec = r1
                return r1
        }

        static /* synthetic */ int[] access$300(org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults r0) {
                int[] r0 = r0.extraMetadata
                return r0
        }

        static /* synthetic */ int[] access$302(org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults r0, int[] r1) {
                r0.extraMetadata = r1
                return r1
        }

        static /* synthetic */ int access$400(org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults r0) {
                int r0 = r0.numCodecsTried
                return r0
        }

        static /* synthetic */ int access$408(org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults r2) {
                int r0 = r2.numCodecsTried
                int r1 = r0 + 1
                r2.numCodecsTried = r1
                return r0
        }

        static /* synthetic */ int access$412(org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults r1, int r2) {
                int r0 = r1.numCodecsTried
                int r0 = r0 + r2
                r1.numCodecsTried = r0
                return r0
        }

        static /* synthetic */ int access$600(org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults r0) {
                int r0 = r0.saved
                return r0
        }

        static /* synthetic */ int access$602(org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults r0, int r1) {
                r0.saved = r1
                return r1
        }

        static /* synthetic */ int access$612(org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults r1, int r2) {
                int r0 = r1.saved
                int r0 = r0 + r2
                r1.saved = r0
                return r0
        }
    }

    public class BandData {
        private double averageAbsoluteDelta;
        private double averageAbsoluteValue;
        private final int[] band;
        private int deltaIsAscending;
        private java.util.Map<java.lang.Integer, java.lang.Integer> distinctValues;
        private int largest;
        private int largestDelta;
        private int smallDeltaCount;
        private int smallest;
        private int smallestDelta;
        final /* synthetic */ org.apache.commons.compress.harmony.pack200.BandSet this$0;

        public BandData(org.apache.commons.compress.harmony.pack200.BandSet r12, int[] r13) {
                r11 = this;
                r11.this$0 = r12
                r11.<init>()
                r0 = 2147483647(0x7fffffff, float:NaN)
                r11.smallest = r0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r11.largest = r0
                r11.band = r13
                r0 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                r2 = 0
                r3 = r2
            L17:
                int r4 = r13.length
                if (r3 >= r4) goto La7
                r4 = r13[r3]
                int r5 = r11.smallest
                if (r4 >= r5) goto L22
                r11.smallest = r4
            L22:
                int r5 = r11.largest
                if (r4 <= r5) goto L28
                r11.largest = r4
            L28:
                if (r3 == 0) goto L5e
                int r5 = r3 + (-1)
                r5 = r13[r5]
                int r4 = r4 - r5
                int r5 = r11.smallestDelta
                if (r4 >= r5) goto L35
                r11.smallestDelta = r4
            L35:
                int r5 = r11.largestDelta
                if (r4 <= r5) goto L3b
                r11.largestDelta = r4
            L3b:
                if (r4 < 0) goto L42
                int r5 = r11.deltaIsAscending
                int r5 = r5 + r0
                r11.deltaIsAscending = r5
            L42:
                double r5 = r11.averageAbsoluteDelta
                int r7 = java.lang.Math.abs(r4)
                double r7 = (double) r7
                int r9 = r13.length
                int r9 = r9 - r0
                double r9 = (double) r9
                double r7 = r7 / r9
                double r5 = r5 + r7
                r11.averageAbsoluteDelta = r5
                int r4 = java.lang.Math.abs(r4)
                r5 = 256(0x100, float:3.59E-43)
                if (r4 >= r5) goto L64
                int r4 = r11.smallDeltaCount
                int r4 = r4 + r0
                r11.smallDeltaCount = r4
                goto L64
            L5e:
                r4 = r13[r2]
                r11.smallestDelta = r4
                r11.largestDelta = r4
            L64:
                double r4 = r11.averageAbsoluteValue
                r6 = r13[r3]
                int r6 = java.lang.Math.abs(r6)
                double r6 = (double) r6
                int r8 = r13.length
                double r8 = (double) r8
                double r6 = r6 / r8
                double r4 = r4 + r6
                r11.averageAbsoluteValue = r4
                int r4 = r12.effort
                r5 = 3
                if (r4 <= r5) goto La3
                java.util.Map<java.lang.Integer, java.lang.Integer> r4 = r11.distinctValues
                if (r4 != 0) goto L83
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                r11.distinctValues = r4
            L83:
                r4 = r13[r3]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.util.Map<java.lang.Integer, java.lang.Integer> r5 = r11.distinctValues
                java.lang.Object r5 = r5.get(r4)
                java.lang.Integer r5 = (java.lang.Integer) r5
                if (r5 != 0) goto L95
                r5 = r1
                goto L9e
            L95:
                int r5 = r5.intValue()
                int r5 = r5 + r0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            L9e:
                java.util.Map<java.lang.Integer, java.lang.Integer> r6 = r11.distinctValues
                r6.put(r4, r5)
            La3:
                int r3 = r3 + 1
                goto L17
            La7:
                return
        }

        static /* synthetic */ int access$100(org.apache.commons.compress.harmony.pack200.BandSet.BandData r0) {
                int r0 = r0.largest
                return r0
        }

        static /* synthetic */ java.util.Map access$500(org.apache.commons.compress.harmony.pack200.BandSet.BandData r0) {
                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.distinctValues
                return r0
        }

        static /* synthetic */ int access$700(org.apache.commons.compress.harmony.pack200.BandSet.BandData r0) {
                int r0 = r0.largestDelta
                return r0
        }

        static /* synthetic */ int access$800(org.apache.commons.compress.harmony.pack200.BandSet.BandData r0) {
                int r0 = r0.smallestDelta
                return r0
        }

        static /* synthetic */ int access$900(org.apache.commons.compress.harmony.pack200.BandSet.BandData r0) {
                int r0 = r0.smallest
                return r0
        }

        public boolean anyNegatives() {
                r1 = this;
                int r0 = r1.smallest
                if (r0 >= 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public boolean mainlyPositiveDeltas() {
                r2 = this;
                int r0 = r2.deltaIsAscending
                float r0 = (float) r0
                int[] r1 = r2.band
                int r1 = r1.length
                float r1 = (float) r1
                float r0 = r0 / r1
                r1 = 1064514355(0x3f733333, float:0.95)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L11
                r0 = 1
                goto L12
            L11:
                r0 = 0
            L12:
                return r0
        }

        public boolean mainlySmallDeltas() {
                r2 = this;
                int r0 = r2.smallDeltaCount
                float r0 = (float) r0
                int[] r1 = r2.band
                int r1 = r1.length
                float r1 = (float) r1
                float r0 = r0 / r1
                r1 = 1060320051(0x3f333333, float:0.7)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L11
                r0 = 1
                goto L12
            L11:
                r0 = 0
            L12:
                return r0
        }

        public int numDistinctValues() {
                r1 = this;
                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r1.distinctValues
                if (r0 != 0) goto L8
                int[] r0 = r1.band
                int r0 = r0.length
                return r0
            L8:
                int r0 = r0.size()
                return r0
        }

        public boolean wellCorrelated() {
                r4 = this;
                double r0 = r4.averageAbsoluteDelta
                r2 = 4614162998222441677(0x4008cccccccccccd, double:3.1)
                double r0 = r0 * r2
                double r2 = r4.averageAbsoluteValue
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 >= 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }
    }

    public static /* synthetic */ int $r8$lambda$RqCD3zSvnfgO6EXcT0JyNGOcuC0(java.lang.Integer r0) {
            int r0 = r0.intValue()
            return r0
    }

    public static /* synthetic */ long $r8$lambda$jYZje6IE9GevyXAfkN1d0xvKij4(java.lang.Long r2) {
            long r0 = r2.longValue()
            return r0
    }

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            org.apache.commons.compress.harmony.pack200.BandSet.EMPTY_BYTE_ARRAY = r0
            r0 = 10
            int[] r0 = new int[r0]
            r0 = {x0010: FILL_ARRAY_DATA , data: [0, 0, 1000, 500, 100, 100, 100, 100, 100, 0} // fill-array
            org.apache.commons.compress.harmony.pack200.BandSet.effortThresholds = r0
            return
    }

    public BandSet(int r1, org.apache.commons.compress.harmony.pack200.SegmentHeader r2) {
            r0 = this;
            r0.<init>()
            r0.effort = r1
            r0.segmentHeader = r2
            return
    }

    private org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults analyseBand(java.lang.String r11, int[] r12, org.apache.commons.compress.harmony.pack200.BHSDCodec r13) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r10 = this;
            org.apache.commons.compress.harmony.pack200.BandSet$BandAnalysisResults r7 = new org.apache.commons.compress.harmony.pack200.BandSet$BandAnalysisResults
            r7.<init>(r10)
            long[] r0 = r10.canonicalLargest
            if (r0 != 0) goto L32
            r0 = 116(0x74, float:1.63E-43)
            long[] r1 = new long[r0]
            r10.canonicalLargest = r1
            long[] r0 = new long[r0]
            r10.canonicalSmallest = r0
            r0 = 1
        L14:
            long[] r1 = r10.canonicalLargest
            int r2 = r1.length
            if (r0 >= r2) goto L32
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.CodecEncoding.getCanonicalCodec(r0)
            long r2 = r2.largest()
            r1[r0] = r2
            long[] r1 = r10.canonicalSmallest
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.CodecEncoding.getCanonicalCodec(r0)
            long r2 = r2.smallest()
            r1[r0] = r2
            int r0 = r0 + 1
            goto L14
        L32:
            org.apache.commons.compress.harmony.pack200.BandSet$BandData r8 = new org.apache.commons.compress.harmony.pack200.BandSet$BandData
            r8.<init>(r10, r12)
            byte[] r9 = r13.encode(r12)
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$002(r7, r9)
            int r0 = r9.length
            int r1 = r12.length
            int r1 = r1 + 23
            int r2 = r10.effort
            int r2 = r2 * 2
            int r1 = r1 - r2
            if (r0 > r1) goto L4a
            return r7
        L4a:
            boolean r0 = r8.anyNegatives()
            if (r0 != 0) goto L6e
            int r0 = org.apache.commons.compress.harmony.pack200.BandSet.BandData.access$100(r8)
            long r0 = (long) r0
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            long r2 = r2.largest()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L6e
            org.apache.commons.compress.harmony.pack200.BHSDCodec r11 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            byte[] r11 = r11.encode(r12)
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$002(r7, r11)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r11 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$202(r7, r11)
            return r7
        L6e:
            int r0 = r10.effort
            r1 = 3
            if (r0 <= r1) goto La9
            java.lang.String r0 = "POPULATION"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto La9
            int r11 = r8.numDistinctValues()
            float r0 = (float) r11
            int r1 = r12.length
            float r1 = (float) r1
            float r0 = r0 / r1
            r1 = 100
            if (r11 < r1) goto L9f
            double r0 = (double) r0
            r2 = 4581421828931458171(0x3f947ae147ae147b, double:0.02)
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 < 0) goto L9f
            int r11 = r10.effort
            r2 = 6
            if (r11 <= r2) goto La9
            r2 = 4585925428558828667(0x3fa47ae147ae147b, double:0.04)
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 >= 0) goto La9
        L9f:
            r10.encodeWithPopulationCodec(r12, r13, r8, r7)
            boolean r11 = r10.timeToStop(r7)
            if (r11 == 0) goto La9
            return r7
        La9:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            boolean r0 = r8.mainlyPositiveDeltas()
            if (r0 == 0) goto Lbf
            boolean r0 = r8.mainlySmallDeltas()
            if (r0 == 0) goto Lbf
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaUnsignedCodecs2
            r11.add(r0)
        Lbf:
            boolean r0 = r8.wellCorrelated()
            if (r0 == 0) goto L11e
            boolean r0 = r8.mainlyPositiveDeltas()
            if (r0 == 0) goto Lfa
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaUnsignedCodecs1
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaUnsignedCodecs3
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaUnsignedCodecs4
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaUnsignedCodecs5
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.nonDeltaUnsignedCodecs1
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.nonDeltaUnsignedCodecs3
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.nonDeltaUnsignedCodecs4
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.nonDeltaUnsignedCodecs5
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.nonDeltaUnsignedCodecs2
            r11.add(r0)
            goto L175
        Lfa:
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaSignedCodecs1
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaSignedCodecs3
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaSignedCodecs2
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaSignedCodecs4
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaSignedCodecs5
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.nonDeltaSignedCodecs1
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.nonDeltaSignedCodecs2
            r11.add(r0)
            goto L175
        L11e:
            boolean r0 = r8.anyNegatives()
            if (r0 == 0) goto L148
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.nonDeltaSignedCodecs1
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.nonDeltaSignedCodecs2
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaSignedCodecs1
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaSignedCodecs2
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaSignedCodecs3
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaSignedCodecs4
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaSignedCodecs5
            r11.add(r0)
            goto L175
        L148:
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.nonDeltaUnsignedCodecs1
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.nonDeltaUnsignedCodecs3
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.nonDeltaUnsignedCodecs4
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.nonDeltaUnsignedCodecs5
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.nonDeltaUnsignedCodecs2
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaUnsignedCodecs1
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaUnsignedCodecs3
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaUnsignedCodecs4
            r11.add(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r0 = org.apache.commons.compress.harmony.pack200.CanonicalCodecFamilies.deltaUnsignedCodecs5
            r11.add(r0)
        L175:
            java.util.Iterator r11 = r11.iterator()
        L179:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L195
            java.lang.Object r0 = r11.next()
            r6 = r0
            org.apache.commons.compress.harmony.pack200.BHSDCodec[] r6 = (org.apache.commons.compress.harmony.pack200.BHSDCodec[]) r6
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r8
            r4 = r7
            r5 = r9
            r0.tryCodecs(r1, r2, r3, r4, r5, r6)
            boolean r0 = r10.timeToStop(r7)
            if (r0 == 0) goto L179
        L195:
            return r7
    }

    private void encodeWithPopulationCodec(int[] r18, org.apache.commons.compress.harmony.pack200.BHSDCodec r19, org.apache.commons.compress.harmony.pack200.BandSet.BandData r20, org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults r21) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = 3
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$412(r3, r4)
            java.util.Map r5 = org.apache.commons.compress.harmony.pack200.BandSet.BandData.access$500(r20)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda4 r7 = new org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda4
            r7.<init>(r5, r6)
            r5.forEach(r7)
            int r7 = r5.size()
            r8 = 255(0xff, float:3.57E-43)
            if (r7 <= r8) goto L2d
            org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda5 r7 = new org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda5
            r7.<init>(r5)
            r6.sort(r7)
        L2d:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r7 = 0
            r8 = r7
        L34:
            int r9 = r6.size()
            if (r8 >= r9) goto L4a
            java.lang.Object r9 = r6.get(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r5.put(r9, r10)
            int r8 = r8 + 1
            goto L34
        L4a:
            org.apache.commons.compress.harmony.pack200.IntList r8 = new org.apache.commons.compress.harmony.pack200.IntList
            r8.<init>()
            int r9 = r1.length
            int[] r9 = new int[r9]
            r10 = r7
        L53:
            int r11 = r1.length
            r12 = 1
            if (r10 >= r11) goto L77
            r11 = r1[r10]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r11 = r5.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 != 0) goto L6d
            r9[r10] = r7
            r11 = r1[r10]
            r8.add(r11)
            goto L74
        L6d:
            int r11 = r11.intValue()
            int r11 = r11 + r12
            r9[r10] = r11
        L74:
            int r10 = r10 + 1
            goto L53
        L77:
            int r1 = r6.size()
            int r1 = r1 - r12
            java.lang.Object r1 = r6.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r6.add(r1)
            int[] r1 = r0.integerListToArray(r6)
            int[] r5 = r8.toArray()
            java.lang.String r8 = "POPULATION"
            org.apache.commons.compress.harmony.pack200.BandSet$BandAnalysisResults r1 = r0.analyseBand(r8, r1, r2)
            org.apache.commons.compress.harmony.pack200.BandSet$BandAnalysisResults r5 = r0.analyseBand(r8, r5, r2)
            int r6 = r6.size()
            int r6 = r6 - r12
            r10 = 256(0x100, float:3.59E-43)
            r13 = 0
            if (r6 >= r10) goto Lad
            org.apache.commons.compress.harmony.pack200.BHSDCodec r6 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            byte[] r6 = r6.encode(r9)
            r15 = r6
            r14 = r7
            r6 = r12
            r9 = r13
            goto L10b
        Lad:
            org.apache.commons.compress.harmony.pack200.BandSet$BandAnalysisResults r8 = r0.analyseBand(r8, r9, r2)
            org.apache.commons.compress.harmony.pack200.Codec r9 = org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$200(r8)
            byte[] r8 = org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$000(r8)
            if (r9 != 0) goto Lbc
            r9 = r2
        Lbc:
            r10 = r9
            org.apache.commons.compress.harmony.pack200.BHSDCodec r10 = (org.apache.commons.compress.harmony.pack200.BHSDCodec) r10
            int r14 = r10.getL()
            int r15 = r10.getH()
            int r16 = r10.getS()
            int r11 = r10.getB()
            boolean r10 = r10.isDelta()
            if (r16 != 0) goto L109
            if (r10 != 0) goto L109
            if (r11 <= r12) goto Lea
            org.apache.commons.compress.harmony.pack200.BHSDCodec r10 = new org.apache.commons.compress.harmony.pack200.BHSDCodec
            int r11 = r11 - r12
            r10.<init>(r11, r15)
            long r10 = r10.largest()
            r15 = r8
            long r7 = (long) r6
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 < 0) goto Leb
            goto L10a
        Lea:
            r15 = r8
        Leb:
            switch(r14) {
                case 4: goto L107;
                case 8: goto L105;
                case 16: goto L103;
                case 32: goto L101;
                case 64: goto Lff;
                case 128: goto Lfd;
                case 192: goto Lfb;
                case 224: goto Lf8;
                case 240: goto Lf5;
                case 248: goto Lf2;
                case 252: goto Lef;
                default: goto Lee;
            }
        Lee:
            goto L10a
        Lef:
            r6 = 11
            goto L10b
        Lf2:
            r6 = 10
            goto L10b
        Lf5:
            r6 = 9
            goto L10b
        Lf8:
            r6 = 8
            goto L10b
        Lfb:
            r6 = 7
            goto L10b
        Lfd:
            r6 = 6
            goto L10b
        Lff:
            r6 = 5
            goto L10b
        L101:
            r6 = 4
            goto L10b
        L103:
            r6 = r4
            goto L10b
        L105:
            r6 = 2
            goto L10b
        L107:
            r6 = r12
            goto L10b
        L109:
            r15 = r8
        L10a:
            r6 = 0
        L10b:
            byte[] r7 = org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$000(r1)
            byte[] r8 = org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$000(r5)
            org.apache.commons.compress.harmony.pack200.Codec r1 = org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$200(r1)
            org.apache.commons.compress.harmony.pack200.Codec r5 = org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$200(r5)
            if (r1 != 0) goto L11e
            goto L11f
        L11e:
            r12 = 0
        L11f:
            int r12 = r12 + 141
            int r10 = r6 * 4
            int r12 = r12 + r10
            if (r5 != 0) goto L128
            r11 = 2
            goto L129
        L128:
            r11 = 0
        L129:
            int r12 = r12 + r11
            org.apache.commons.compress.harmony.pack200.IntList r10 = new org.apache.commons.compress.harmony.pack200.IntList
            r10.<init>(r4)
            if (r1 == 0) goto L144
            int[] r4 = org.apache.commons.compress.harmony.pack200.CodecEncoding.getSpecifier(r1, r13)
            java.util.stream.IntStream r4 = java.util.stream.IntStream.of(r4)
            java.util.Objects.requireNonNull(r10)
            org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda6 r11 = new org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda6
            r11.<init>(r10)
            r4.forEach(r11)
        L144:
            if (r6 != 0) goto L159
            int[] r4 = org.apache.commons.compress.harmony.pack200.CodecEncoding.getSpecifier(r9, r13)
            java.util.stream.IntStream r4 = java.util.stream.IntStream.of(r4)
            java.util.Objects.requireNonNull(r10)
            org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda6 r6 = new org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda6
            r6.<init>(r10)
            r4.forEach(r6)
        L159:
            if (r5 == 0) goto L16e
            int[] r4 = org.apache.commons.compress.harmony.pack200.CodecEncoding.getSpecifier(r5, r13)
            java.util.stream.IntStream r4 = java.util.stream.IntStream.of(r4)
            java.util.Objects.requireNonNull(r10)
            org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda6 r6 = new org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda6
            r6.<init>(r10)
            r4.forEach(r6)
        L16e:
            int[] r4 = r10.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r6 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r6 = r6.encode(r4)
            boolean r10 = r19.isSigned()
            if (r10 == 0) goto L181
            int r10 = (-1) - r12
            goto L186
        L181:
            int r10 = r19.getL()
            int r10 = r10 + r12
        L186:
            int[] r10 = new int[]{r10}
            byte[] r2 = r2.encode(r10)
            int r10 = r2.length
            int r11 = r7.length
            int r10 = r10 + r11
            int r11 = r15.length
            int r10 = r10 + r11
            int r11 = r8.length
            int r10 = r10 + r11
            int r11 = r6.length
            int r11 = r11 + r10
            byte[] r12 = org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$000(r21)
            int r12 = r12.length
            if (r11 >= r12) goto L1de
            byte[] r11 = org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$000(r21)
            int r11 = r11.length
            int r6 = r6.length
            int r6 = r6 + r10
            int r11 = r11 - r6
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$612(r3, r11)
            byte[] r6 = new byte[r10]
            int r10 = r2.length
            r11 = 0
            java.lang.System.arraycopy(r2, r11, r6, r11, r10)
            int r10 = r2.length
            int r12 = r7.length
            java.lang.System.arraycopy(r7, r11, r6, r10, r12)
            int r10 = r2.length
            int r12 = r7.length
            int r10 = r10 + r12
            int r12 = r15.length
            java.lang.System.arraycopy(r15, r11, r6, r10, r12)
            int r2 = r2.length
            int r7 = r7.length
            int r2 = r2 + r7
            int r7 = r15.length
            int r2 = r2 + r7
            int r7 = r8.length
            java.lang.System.arraycopy(r8, r11, r6, r2, r7)
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$002(r3, r6)
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$302(r3, r4)
            if (r14 == 0) goto L1d6
            org.apache.commons.compress.harmony.pack200.PopulationCodec r2 = new org.apache.commons.compress.harmony.pack200.PopulationCodec
            r2.<init>(r1, r14, r5)
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$202(r3, r2)
            goto L1de
        L1d6:
            org.apache.commons.compress.harmony.pack200.PopulationCodec r2 = new org.apache.commons.compress.harmony.pack200.PopulationCodec
            r2.<init>(r1, r9, r5)
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$202(r3, r2)
        L1de:
            return
    }

    private long[] flatten(long[][] r11) {
            r10 = this;
            int r0 = r11.length
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            if (r2 >= r0) goto Ld
            r4 = r11[r2]
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L4
        Ld:
            long[] r0 = new long[r3]
            int r2 = r11.length
            r3 = r1
            r4 = r3
        L12:
            if (r3 >= r2) goto L26
            r5 = r11[r3]
            int r6 = r5.length
            r7 = r1
        L18:
            if (r7 >= r6) goto L23
            r8 = r5[r7]
            r0[r4] = r8
            int r4 = r4 + 1
            int r7 = r7 + 1
            goto L18
        L23:
            int r3 = r3 + 1
            goto L12
        L26:
            return r0
    }

    static /* synthetic */ int lambda$encodeFlags$0(long[] r2, int r3) {
            r0 = r2[r3]
            int r2 = (int) r0
            return r2
    }

    static /* synthetic */ void lambda$encodeWithPopulationCodec$1(java.util.Map r1, java.util.List r2, java.lang.Integer r3, java.lang.Integer r4) {
            int r4 = r4.intValue()
            r0 = 2
            if (r4 > r0) goto Lf
            int r1 = r1.size()
            r4 = 256(0x100, float:3.59E-43)
            if (r1 >= r4) goto L12
        Lf:
            r2.add(r3)
        L12:
            return
    }

    static /* synthetic */ int lambda$encodeWithPopulationCodec$2(java.util.Map r0, java.lang.Integer r1, java.lang.Integer r2) {
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r2.compareTo(r0)
            return r0
    }

    private boolean timeToStop(org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults r5) {
            r4 = this;
            int r0 = r4.effort
            r1 = 6
            r2 = 1
            r3 = 0
            if (r0 <= r1) goto L14
            int r5 = org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$400(r5)
            int r0 = r4.effort
            int r0 = r0 * 2
            if (r5 < r0) goto L12
            goto L13
        L12:
            r2 = r3
        L13:
            return r2
        L14:
            int r5 = org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$400(r5)
            int r0 = r4.effort
            if (r5 < r0) goto L1d
            goto L1e
        L1d:
            r2 = r3
        L1e:
            return r2
    }

    private void tryCodecs(int[] r10, org.apache.commons.compress.harmony.pack200.BHSDCodec r11, org.apache.commons.compress.harmony.pack200.BandSet.BandData r12, org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults r13, byte[] r14, org.apache.commons.compress.harmony.pack200.BHSDCodec[] r15) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r9 = this;
            int r0 = r15.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lb4
            r2 = r15[r1]
            boolean r3 = r2.equals(r11)
            if (r3 == 0) goto Ld
            return
        Ld:
            boolean r3 = r2.isDelta()
            r4 = 0
            if (r3 == 0) goto L6c
            long r5 = r2.largest()
            int r3 = org.apache.commons.compress.harmony.pack200.BandSet.BandData.access$700(r12)
            long r7 = (long) r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto La9
            long r5 = r2.smallest()
            int r3 = org.apache.commons.compress.harmony.pack200.BandSet.BandData.access$800(r12)
            long r7 = (long) r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 > 0) goto La9
            long r5 = r2.largest()
            int r3 = org.apache.commons.compress.harmony.pack200.BandSet.BandData.access$100(r12)
            long r7 = (long) r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto La9
            long r5 = r2.smallest()
            int r3 = org.apache.commons.compress.harmony.pack200.BandSet.BandData.access$900(r12)
            long r7 = (long) r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 > 0) goto La9
            byte[] r3 = r2.encode(r10)
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$408(r13)
            int[] r4 = org.apache.commons.compress.harmony.pack200.CodecEncoding.getSpecifier(r2, r4)
            byte[] r4 = r11.encode(r4)
            int r5 = r14.length
            int r6 = r3.length
            int r5 = r5 - r6
            int r4 = r4.length
            int r5 = r5 - r4
            int r4 = org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$600(r13)
            if (r5 <= r4) goto La9
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$202(r13, r2)
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$002(r13, r3)
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$602(r13, r5)
            goto La9
        L6c:
            long r5 = r2.largest()
            int r3 = org.apache.commons.compress.harmony.pack200.BandSet.BandData.access$100(r12)
            long r7 = (long) r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto La9
            long r5 = r2.smallest()
            int r3 = org.apache.commons.compress.harmony.pack200.BandSet.BandData.access$900(r12)
            long r7 = (long) r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 > 0) goto La9
            byte[] r3 = r2.encode(r10)
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$408(r13)
            int[] r4 = org.apache.commons.compress.harmony.pack200.CodecEncoding.getSpecifier(r2, r4)
            byte[] r4 = r11.encode(r4)
            int r5 = r14.length
            int r6 = r3.length
            int r5 = r5 - r6
            int r4 = r4.length
            int r5 = r5 - r4
            int r4 = org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$600(r13)
            if (r5 <= r4) goto La9
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$202(r13, r2)
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$002(r13, r3)
            org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$602(r13, r5)
        La9:
            boolean r2 = r9.timeToStop(r13)
            if (r2 == 0) goto Lb0
            return
        Lb0:
            int r1 = r1 + 1
            goto L2
        Lb4:
            return
    }

    protected int[] cpEntryListToArray(java.util.List<? extends org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r5) {
            r4 = this;
            int r0 = r5.size()
            int[] r1 = new int[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L22
            java.lang.Object r3 = r5.get(r2)
            org.apache.commons.compress.harmony.pack200.ConstantPoolEntry r3 = (org.apache.commons.compress.harmony.pack200.ConstantPoolEntry) r3
            int r3 = r3.getIndex()
            r1[r2] = r3
            if (r3 < 0) goto L1a
            int r2 = r2 + 1
            goto L7
        L1a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Index should be > 0"
            r5.<init>(r0)
            throw r5
        L22:
            return r1
    }

    protected int[] cpEntryOrNullListToArray(java.util.List<? extends org.apache.commons.compress.harmony.pack200.ConstantPoolEntry> r7) {
            r6 = this;
            int r0 = r7.size()
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r0) goto L30
            java.lang.Object r4 = r7.get(r3)
            org.apache.commons.compress.harmony.pack200.ConstantPoolEntry r4 = (org.apache.commons.compress.harmony.pack200.ConstantPoolEntry) r4
            if (r4 != 0) goto L14
            r5 = r2
            goto L1a
        L14:
            int r5 = r4.getIndex()
            int r5 = r5 + 1
        L1a:
            r1[r3] = r5
            if (r4 == 0) goto L2d
            int r4 = r4.getIndex()
            if (r4 < 0) goto L25
            goto L2d
        L25:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Index should be > 0"
            r7.<init>(r0)
            throw r7
        L2d:
            int r3 = r3 + 1
            goto L8
        L30:
            return r1
    }

    public byte[] encodeBandInt(java.lang.String r7, int[] r8, org.apache.commons.compress.harmony.pack200.BHSDCodec r9) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r6 = this;
            int r0 = r6.effort
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 <= r3) goto L78
            int r4 = r8.length
            int[] r5 = org.apache.commons.compress.harmony.pack200.BandSet.effortThresholds
            r0 = r5[r0]
            if (r4 < r0) goto L78
            org.apache.commons.compress.harmony.pack200.BandSet$BandAnalysisResults r7 = r6.analyseBand(r7, r8, r9)
            org.apache.commons.compress.harmony.pack200.Codec r0 = org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$200(r7)
            byte[] r4 = org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$000(r7)
            if (r0 == 0) goto L79
            boolean r5 = r0 instanceof org.apache.commons.compress.harmony.pack200.BHSDCodec
            if (r5 == 0) goto L5b
            int[] r7 = org.apache.commons.compress.harmony.pack200.CodecEncoding.getSpecifier(r0, r9)
            r8 = r7[r2]
            int r0 = r7.length
            if (r0 <= r3) goto L36
        L29:
            int r0 = r7.length
            if (r3 >= r0) goto L36
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r6.segmentHeader
            r5 = r7[r3]
            r0.appendBandCodingSpecifier(r5)
            int r3 = r3 + 1
            goto L29
        L36:
            boolean r7 = r9.isSigned()
            if (r7 == 0) goto L3e
            int r1 = r1 - r8
            goto L44
        L3e:
            int r7 = r9.getL()
            int r1 = r8 + r7
        L44:
            int[] r7 = new int[]{r1}
            byte[] r7 = r9.encode(r7)
            int r8 = r7.length
            int r9 = r4.length
            int r8 = r8 + r9
            byte[] r8 = new byte[r8]
            int r9 = r7.length
            java.lang.System.arraycopy(r7, r2, r8, r2, r9)
            int r7 = r7.length
            int r9 = r4.length
            java.lang.System.arraycopy(r4, r2, r8, r7, r9)
            return r8
        L5b:
            boolean r5 = r0 instanceof org.apache.commons.compress.harmony.pack200.PopulationCodec
            if (r5 == 0) goto L75
            int[] r7 = org.apache.commons.compress.harmony.pack200.BandSet.BandAnalysisResults.access$300(r7)
            java.util.stream.IntStream r7 = java.util.stream.IntStream.of(r7)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r8 = r6.segmentHeader
            java.util.Objects.requireNonNull(r8)
            org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda0 r9 = new org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda0
            r9.<init>(r8)
            r7.forEach(r9)
            return r4
        L75:
            boolean r7 = r0 instanceof org.apache.commons.compress.harmony.pack200.RunCodec
            goto L79
        L78:
            r4 = 0
        L79:
            int r7 = r8.length
            if (r7 <= 0) goto Le7
            if (r4 != 0) goto L82
            byte[] r4 = r9.encode(r8)
        L82:
            r7 = r8[r2]
            int r8 = r9.getB()
            if (r8 == r3) goto Le6
            boolean r8 = r9.isSigned()
            if (r8 == 0) goto Lb2
            r8 = -256(0xffffffffffffff00, float:NaN)
            if (r7 < r8) goto Lb2
            if (r7 > r1) goto Lb2
            int r7 = org.apache.commons.compress.harmony.pack200.CodecEncoding.getSpecifierForDefaultCodec(r9)
            int r1 = r1 - r7
            int[] r7 = new int[]{r1}
            byte[] r7 = r9.encode(r7)
            int r8 = r7.length
            int r9 = r4.length
            int r8 = r8 + r9
            byte[] r8 = new byte[r8]
            int r9 = r7.length
            java.lang.System.arraycopy(r7, r2, r8, r2, r9)
            int r7 = r7.length
            int r9 = r4.length
            java.lang.System.arraycopy(r4, r2, r8, r7, r9)
            return r8
        Lb2:
            boolean r8 = r9.isSigned()
            if (r8 != 0) goto Le6
            int r8 = r9.getL()
            if (r7 < r8) goto Le6
            int r8 = r9.getL()
            int r8 = r8 + 255
            if (r7 > r8) goto Le6
            int r7 = org.apache.commons.compress.harmony.pack200.CodecEncoding.getSpecifierForDefaultCodec(r9)
            int r8 = r9.getL()
            int r7 = r7 + r8
            int[] r7 = new int[]{r7}
            byte[] r7 = r9.encode(r7)
            int r8 = r7.length
            int r9 = r4.length
            int r8 = r8 + r9
            byte[] r8 = new byte[r8]
            int r9 = r7.length
            java.lang.System.arraycopy(r7, r2, r8, r2, r9)
            int r7 = r7.length
            int r9 = r4.length
            java.lang.System.arraycopy(r4, r2, r8, r7, r9)
            return r8
        Le6:
            return r4
        Le7:
            byte[] r7 = org.apache.commons.compress.harmony.pack200.BandSet.EMPTY_BYTE_ARRAY
            return r7
    }

    protected byte[] encodeFlags(java.lang.String r8, long[] r9, org.apache.commons.compress.harmony.pack200.BHSDCodec r10, org.apache.commons.compress.harmony.pack200.BHSDCodec r11, boolean r12) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r7 = this;
            if (r12 != 0) goto L12
            int r11 = r9.length
            int[] r11 = new int[r11]
            org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda2 r12 = new org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda2
            r12.<init>(r9)
            java.util.Arrays.setAll(r11, r12)
            byte[] r8 = r7.encodeBandInt(r8, r11, r10)
            return r8
        L12:
            int r12 = r9.length
            int[] r12 = new int[r12]
            int r0 = r9.length
            int[] r0 = new int[r0]
            r1 = 0
            r2 = r1
        L1a:
            int r3 = r9.length
            if (r2 >= r3) goto L2c
            r3 = r9[r2]
            r5 = 32
            long r5 = r3 >> r5
            int r5 = (int) r5
            r12[r2] = r5
            int r3 = (int) r3
            r0[r2] = r3
            int r2 = r2 + 1
            goto L1a
        L2c:
            byte[] r9 = r7.encodeBandInt(r8, r12, r11)
            byte[] r8 = r7.encodeBandInt(r8, r0, r10)
            int r10 = r9.length
            int r11 = r8.length
            int r10 = r10 + r11
            byte[] r10 = new byte[r10]
            int r11 = r9.length
            java.lang.System.arraycopy(r9, r1, r10, r1, r11)
            int r9 = r9.length
            int r9 = r9 + 1
            int r11 = r8.length
            java.lang.System.arraycopy(r8, r1, r10, r9, r11)
            return r10
    }

    protected byte[] encodeFlags(java.lang.String r7, long[][] r8, org.apache.commons.compress.harmony.pack200.BHSDCodec r9, org.apache.commons.compress.harmony.pack200.BHSDCodec r10, boolean r11) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r6 = this;
            long[] r2 = r6.flatten(r8)
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            byte[] r7 = r0.encodeFlags(r1, r2, r3, r4, r5)
            return r7
    }

    public byte[] encodeScalar(int r1, org.apache.commons.compress.harmony.pack200.BHSDCodec r2) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r0 = this;
            byte[] r1 = r2.encode(r1)
            return r1
    }

    public byte[] encodeScalar(int[] r1, org.apache.commons.compress.harmony.pack200.BHSDCodec r2) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r0 = this;
            byte[] r1 = r2.encode(r1)
            return r1
    }

    protected int[] integerListToArray(java.util.List<java.lang.Integer> r2) {
            r1 = this;
            java.util.stream.Stream r2 = r2.stream()
            org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda3 r0 = new org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda3
            r0.<init>()
            java.util.stream.IntStream r2 = r2.mapToInt(r0)
            int[] r2 = r2.toArray()
            return r2
    }

    protected long[] longListToArray(java.util.List<java.lang.Long> r2) {
            r1 = this;
            java.util.stream.Stream r2 = r2.stream()
            org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda1 r0 = new org.apache.commons.compress.harmony.pack200.BandSet$$ExternalSyntheticLambda1
            r0.<init>()
            java.util.stream.LongStream r2 = r2.mapToLong(r0)
            long[] r2 = r2.toArray()
            return r2
    }

    public abstract void pack(java.io.OutputStream r1) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception;
}
