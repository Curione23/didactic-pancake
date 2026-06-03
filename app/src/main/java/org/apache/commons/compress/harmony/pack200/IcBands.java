package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class IcBands extends org.apache.commons.compress.harmony.pack200.BandSet {
    private int bit16Count;
    private final org.apache.commons.compress.harmony.pack200.CpBands cpBands;
    private final java.util.Set<org.apache.commons.compress.harmony.pack200.IcBands.IcTuple> innerClasses;
    private final java.util.Map<java.lang.String, java.util.List<org.apache.commons.compress.harmony.pack200.IcBands.IcTuple>> outerToInner;

    static class IcTuple implements java.lang.Comparable<org.apache.commons.compress.harmony.pack200.IcBands.IcTuple> {
        protected org.apache.commons.compress.harmony.pack200.CPClass C;
        protected org.apache.commons.compress.harmony.pack200.CPClass C2;
        protected int F;
        protected org.apache.commons.compress.harmony.pack200.CPUTF8 N;

        IcTuple(org.apache.commons.compress.harmony.pack200.CPClass r1, int r2, org.apache.commons.compress.harmony.pack200.CPClass r3, org.apache.commons.compress.harmony.pack200.CPUTF8 r4) {
                r0 = this;
                r0.<init>()
                r0.C = r1
                r0.F = r2
                r0.C2 = r3
                r0.N = r4
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(org.apache.commons.compress.harmony.pack200.IcBands.IcTuple r1) {
                r0 = this;
                org.apache.commons.compress.harmony.pack200.IcBands$IcTuple r1 = (org.apache.commons.compress.harmony.pack200.IcBands.IcTuple) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(org.apache.commons.compress.harmony.pack200.IcBands.IcTuple r2) {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.CPClass r0 = r1.C
                org.apache.commons.compress.harmony.pack200.CPClass r2 = r2.C
                int r2 = r0.compareTo(r2)
                return r2
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof org.apache.commons.compress.harmony.pack200.IcBands.IcTuple
                r1 = 0
                if (r0 == 0) goto L2c
                org.apache.commons.compress.harmony.pack200.IcBands$IcTuple r4 = (org.apache.commons.compress.harmony.pack200.IcBands.IcTuple) r4
                org.apache.commons.compress.harmony.pack200.CPClass r0 = r3.C
                org.apache.commons.compress.harmony.pack200.CPClass r2 = r4.C
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L2c
                int r0 = r3.F
                int r2 = r4.F
                if (r0 != r2) goto L2c
                org.apache.commons.compress.harmony.pack200.CPClass r0 = r3.C2
                org.apache.commons.compress.harmony.pack200.CPClass r2 = r4.C2
                boolean r0 = java.util.Objects.equals(r0, r2)
                if (r0 == 0) goto L2c
                org.apache.commons.compress.harmony.pack200.CPUTF8 r0 = r3.N
                org.apache.commons.compress.harmony.pack200.CPUTF8 r4 = r4.N
                boolean r4 = java.util.Objects.equals(r0, r4)
                if (r4 == 0) goto L2c
                r1 = 1
            L2c:
                return r1
        }

        public boolean isAnonymous() {
                r2 = this;
                org.apache.commons.compress.harmony.pack200.CPClass r0 = r2.C
                java.lang.String r0 = r0.toString()
                r1 = 36
                int r1 = r0.lastIndexOf(r1)
                int r1 = r1 + 1
                java.lang.String r0 = r0.substring(r1)
                r1 = 0
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isDigit(r0)
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                org.apache.commons.compress.harmony.pack200.CPClass r0 = r1.C
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public IcBands(org.apache.commons.compress.harmony.pack200.SegmentHeader r1, org.apache.commons.compress.harmony.pack200.CpBands r2, int r3) {
            r0 = this;
            r0.<init>(r3, r1)
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            r0.innerClasses = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.outerToInner = r1
            r0.cpBands = r2
            return
    }

    private void addToMap(java.lang.String r3, org.apache.commons.compress.harmony.pack200.IcBands.IcTuple r4) {
            r2 = this;
            java.util.Map<java.lang.String, java.util.List<org.apache.commons.compress.harmony.pack200.IcBands$IcTuple>> r0 = r2.outerToInner
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L15
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map<java.lang.String, java.util.List<org.apache.commons.compress.harmony.pack200.IcBands$IcTuple>> r1 = r2.outerToInner
            r1.put(r3, r0)
            goto L2c
        L15:
            java.util.Iterator r3 = r0.iterator()
        L19:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            org.apache.commons.compress.harmony.pack200.IcBands$IcTuple r1 = (org.apache.commons.compress.harmony.pack200.IcBands.IcTuple) r1
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L19
            return
        L2c:
            r0.add(r4)
            return
    }

    private java.lang.String getOuter(java.lang.String r3) {
            r2 = this;
            r0 = 36
            int r0 = r3.lastIndexOf(r0)
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
            return r3
    }

    private boolean namesArePredictable(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = r0.append(r3)
            r0 = 36
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L26
            int r2 = r4.indexOf(r0)
            r3 = -1
            if (r2 != r3) goto L26
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            return r2
    }

    public void addInnerClass(java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L1e
            if (r6 == 0) goto L6
            goto L1e
        L6:
            org.apache.commons.compress.harmony.pack200.IcBands$IcTuple r5 = new org.apache.commons.compress.harmony.pack200.IcBands$IcTuple
            org.apache.commons.compress.harmony.pack200.CpBands r6 = r3.cpBands
            org.apache.commons.compress.harmony.pack200.CPClass r6 = r6.getCPClass(r4)
            r5.<init>(r6, r7, r0, r0)
            java.lang.String r4 = r3.getOuter(r4)
            r3.addToMap(r4, r5)
            java.util.Set<org.apache.commons.compress.harmony.pack200.IcBands$IcTuple> r4 = r3.innerClasses
            r4.add(r5)
            goto L63
        L1e:
            boolean r1 = r3.namesArePredictable(r4, r5, r6)
            if (r1 == 0) goto L38
            org.apache.commons.compress.harmony.pack200.IcBands$IcTuple r6 = new org.apache.commons.compress.harmony.pack200.IcBands$IcTuple
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r3.cpBands
            org.apache.commons.compress.harmony.pack200.CPClass r4 = r1.getCPClass(r4)
            r6.<init>(r4, r7, r0, r0)
            r3.addToMap(r5, r6)
            java.util.Set<org.apache.commons.compress.harmony.pack200.IcBands$IcTuple> r4 = r3.innerClasses
            r4.add(r6)
            goto L63
        L38:
            r0 = 65536(0x10000, float:9.1835E-41)
            r7 = r7 | r0
            org.apache.commons.compress.harmony.pack200.IcBands$IcTuple r0 = new org.apache.commons.compress.harmony.pack200.IcBands$IcTuple
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r3.cpBands
            org.apache.commons.compress.harmony.pack200.CPClass r4 = r1.getCPClass(r4)
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r3.cpBands
            org.apache.commons.compress.harmony.pack200.CPClass r1 = r1.getCPClass(r5)
            org.apache.commons.compress.harmony.pack200.CpBands r2 = r3.cpBands
            org.apache.commons.compress.harmony.pack200.CPUTF8 r6 = r2.getCPUtf8(r6)
            r0.<init>(r4, r7, r1, r6)
            java.util.Set<org.apache.commons.compress.harmony.pack200.IcBands$IcTuple> r4 = r3.innerClasses
            boolean r4 = r4.add(r0)
            if (r4 == 0) goto L63
            int r4 = r3.bit16Count
            int r4 = r4 + 1
            r3.bit16Count = r4
            r3.addToMap(r5, r0)
        L63:
            return
    }

    public void finaliseBands() {
            r2 = this;
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r2.segmentHeader
            java.util.Set<org.apache.commons.compress.harmony.pack200.IcBands$IcTuple> r1 = r2.innerClasses
            int r1 = r1.size()
            r0.setIc_count(r1)
            return
    }

    public org.apache.commons.compress.harmony.pack200.IcBands.IcTuple getIcTuple(org.apache.commons.compress.harmony.pack200.CPClass r4) {
            r3 = this;
            java.util.Set<org.apache.commons.compress.harmony.pack200.IcBands$IcTuple> r0 = r3.innerClasses
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.pack200.IcBands$IcTuple r1 = (org.apache.commons.compress.harmony.pack200.IcBands.IcTuple) r1
            org.apache.commons.compress.harmony.pack200.CPClass r2 = r1.C
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            return r1
        L1b:
            r4 = 0
            return r4
    }

    public java.util.List<org.apache.commons.compress.harmony.pack200.IcBands.IcTuple> getInnerClassesForOuter(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.util.List<org.apache.commons.compress.harmony.pack200.IcBands$IcTuple>> r0 = r1.outerToInner
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(java.io.OutputStream r15) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r14 = this;
            java.lang.String r0 = "Writing internal class bands..."
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.Set<org.apache.commons.compress.harmony.pack200.IcBands$IcTuple> r0 = r14.innerClasses
            int r0 = r0.size()
            int[] r1 = new int[r0]
            java.util.Set<org.apache.commons.compress.harmony.pack200.IcBands$IcTuple> r2 = r14.innerClasses
            int r2 = r2.size()
            int[] r3 = new int[r2]
            int r4 = r14.bit16Count
            int[] r5 = new int[r4]
            int[] r6 = new int[r4]
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.Set<org.apache.commons.compress.harmony.pack200.IcBands$IcTuple> r8 = r14.innerClasses
            r7.<init>(r8)
            r8 = 0
            r9 = r8
            r10 = r9
        L25:
            if (r9 >= r0) goto L65
            java.lang.Object r11 = r7.get(r9)
            org.apache.commons.compress.harmony.pack200.IcBands$IcTuple r11 = (org.apache.commons.compress.harmony.pack200.IcBands.IcTuple) r11
            org.apache.commons.compress.harmony.pack200.CPClass r12 = r11.C
            int r12 = r12.getIndex()
            r1[r9] = r12
            int r12 = r11.F
            r3[r9] = r12
            int r12 = r11.F
            r13 = 65536(0x10000, float:9.1835E-41)
            r12 = r12 & r13
            if (r12 == 0) goto L62
            org.apache.commons.compress.harmony.pack200.CPClass r12 = r11.C2
            if (r12 != 0) goto L46
            r12 = r8
            goto L4e
        L46:
            org.apache.commons.compress.harmony.pack200.CPClass r12 = r11.C2
            int r12 = r12.getIndex()
            int r12 = r12 + 1
        L4e:
            r5[r10] = r12
            org.apache.commons.compress.harmony.pack200.CPUTF8 r12 = r11.N
            if (r12 != 0) goto L56
            r11 = r8
            goto L5e
        L56:
            org.apache.commons.compress.harmony.pack200.CPUTF8 r11 = r11.N
            int r11 = r11.getIndex()
            int r11 = r11 + 1
        L5e:
            r6[r10] = r11
            int r10 = r10 + 1
        L62:
            int r9 = r9 + 1
            goto L25
        L65:
            java.lang.String r7 = "ic_this_class"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r8 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            byte[] r1 = r14.encodeBandInt(r7, r1, r8)
            r15.write(r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Wrote "
            r7.<init>(r8)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r7.append(r1)
            java.lang.String r7 = " bytes from ic_this_class["
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.lang.String r0 = "ic_flags"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r14.encodeBandInt(r0, r3, r7)
            r15.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r8)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from ic_flags["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.lang.String r0 = "ic_outer_class"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            byte[] r0 = r14.encodeBandInt(r0, r5, r2)
            r15.write(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " bytes from ic_outer_class["
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.lang.String r0 = "ic_name"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            byte[] r0 = r14.encodeBandInt(r0, r6, r2)
            r15.write(r0)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r8)
            int r0 = r0.length
            java.lang.StringBuilder r15 = r15.append(r0)
            java.lang.String r0 = " bytes from ic_name["
            java.lang.StringBuilder r15 = r15.append(r0)
            java.lang.StringBuilder r15 = r15.append(r4)
            java.lang.StringBuilder r15 = r15.append(r1)
            java.lang.String r15 = r15.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r15)
            return
    }
}
