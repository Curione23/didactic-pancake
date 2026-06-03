package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class IcTuple {
    static final org.apache.commons.compress.harmony.unpack200.IcTuple[] EMPTY_ARRAY = null;
    private static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    public static final int NESTED_CLASS_FLAG = 65536;
    protected java.lang.String C;
    protected java.lang.String C2;
    protected int F;
    protected java.lang.String N;
    private boolean anonymous;
    private final int c2Index;
    private final int cIndex;
    private int cachedHashCode;
    private int cachedOuterClassIndex;
    private java.lang.String cachedOuterClassString;
    private java.lang.String cachedSimpleClassName;
    private int cachedSimpleClassNameIndex;
    private boolean hashCodeComputed;
    private boolean initialized;
    private boolean member;
    private final int nIndex;
    private boolean outerIsAnonymous;
    private boolean predictOuter;
    private boolean predictSimple;
    private final int tIndex;

    static {
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            org.apache.commons.compress.harmony.unpack200.IcTuple.EMPTY_STRING_ARRAY = r1
            org.apache.commons.compress.harmony.unpack200.IcTuple[] r0 = new org.apache.commons.compress.harmony.unpack200.IcTuple[r0]
            org.apache.commons.compress.harmony.unpack200.IcTuple.EMPTY_ARRAY = r0
            return
    }

    public IcTuple(java.lang.String r3, int r4, java.lang.String r5, java.lang.String r6, int r7, int r8, int r9, int r10) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.member = r0
            r1 = -1
            r2.cachedOuterClassIndex = r1
            r2.cachedSimpleClassNameIndex = r1
            r2.C = r3
            r2.F = r4
            r2.C2 = r5
            r2.N = r6
            r2.cIndex = r7
            r2.c2Index = r8
            r2.nIndex = r9
            r2.tIndex = r10
            if (r6 != 0) goto L1f
            r2.predictSimple = r0
        L1f:
            if (r5 != 0) goto L23
            r2.predictOuter = r0
        L23:
            r2.initializeClassStrings()
            return
    }

    private boolean computeOuterIsAnonymous() {
            r5 = this;
            java.lang.String r0 = r5.cachedOuterClassString
            java.lang.String[] r0 = r5.innerBreakAtDollar(r0)
            int r1 = r0.length
            if (r1 == 0) goto L1c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L1b
            r4 = r0[r3]
            boolean r4 = r5.isAllDigits(r4)
            if (r4 == 0) goto L18
            r0 = 1
            return r0
        L18:
            int r3 = r3 + 1
            goto Lc
        L1b:
            return r2
        L1c:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "Should have an outer before checking if it's anonymous"
            r0.<init>(r1)
            throw r0
    }

    private void generateHashCode() {
            r1 = this;
            r0 = 1
            r1.hashCodeComputed = r0
            r0 = 17
            r1.cachedHashCode = r0
            java.lang.String r0 = r1.C
            if (r0 == 0) goto L11
            int r0 = r0.hashCode()
            r1.cachedHashCode = r0
        L11:
            java.lang.String r0 = r1.C2
            if (r0 == 0) goto L1b
            int r0 = r0.hashCode()
            r1.cachedHashCode = r0
        L1b:
            java.lang.String r0 = r1.N
            if (r0 == 0) goto L25
            int r0 = r0.hashCode()
            r1.cachedHashCode = r0
        L25:
            return
    }

    private void initializeClassStrings() {
            r7 = this;
            boolean r0 = r7.initialized
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r7.initialized = r0
            boolean r1 = r7.predictSimple
            if (r1 != 0) goto L10
            java.lang.String r1 = r7.N
            r7.cachedSimpleClassName = r1
        L10:
            boolean r1 = r7.predictOuter
            if (r1 != 0) goto L18
            java.lang.String r1 = r7.C2
            r7.cachedOuterClassString = r1
        L18:
            java.lang.String r1 = r7.C
            java.lang.String[] r1 = r7.innerBreakAtDollar(r1)
            int r2 = r1.length
            int r2 = r1.length
            int r2 = r1.length
            r3 = 2
            if (r2 >= r3) goto L25
            return
        L25:
            int r2 = r1.length
            int r2 = r2 - r0
            r3 = r1[r2]
            r7.cachedSimpleClassName = r3
            java.lang.String r3 = ""
            r7.cachedOuterClassString = r3
            r3 = 0
            r4 = r3
        L31:
            if (r4 >= r2) goto L70
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r7.cachedOuterClassString
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = r1[r4]
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r7.cachedOuterClassString = r5
            r5 = r1[r4]
            boolean r5 = r7.isAllDigits(r5)
            if (r5 == 0) goto L54
            r7.member = r3
        L54:
            int r4 = r4 + 1
            if (r4 == r2) goto L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r7.cachedOuterClassString
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = 36
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r7.cachedOuterClassString = r5
            goto L31
        L70:
            boolean r1 = r7.predictSimple
            if (r1 != 0) goto L7c
            java.lang.String r1 = r7.N
            r7.cachedSimpleClassName = r1
            int r1 = r7.nIndex
            r7.cachedSimpleClassNameIndex = r1
        L7c:
            boolean r1 = r7.predictOuter
            if (r1 != 0) goto L88
            java.lang.String r1 = r7.C2
            r7.cachedOuterClassString = r1
            int r1 = r7.c2Index
            r7.cachedOuterClassIndex = r1
        L88:
            java.lang.String r1 = r7.cachedSimpleClassName
            boolean r1 = r7.isAllDigits(r1)
            if (r1 == 0) goto L9c
            r7.anonymous = r0
            r7.member = r3
            boolean r1 = r7.nestedExplicitFlagSet()
            if (r1 == 0) goto L9c
            r7.member = r0
        L9c:
            boolean r0 = r7.computeOuterIsAnonymous()
            r7.outerIsAnonymous = r0
            return
    }

    private boolean isAllDigits(java.lang.String r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            r1 = r0
        L5:
            int r2 = r4.length()
            if (r1 >= r2) goto L19
            char r2 = r4.charAt(r1)
            boolean r2 = java.lang.Character.isDigit(r2)
            if (r2 != 0) goto L16
            return r0
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r4 = 1
            return r4
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L2f
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r2 = r3.getClass()
            if (r1 == r2) goto Le
            goto L2f
        Le:
            org.apache.commons.compress.harmony.unpack200.IcTuple r4 = (org.apache.commons.compress.harmony.unpack200.IcTuple) r4
            java.lang.String r1 = r3.C
            java.lang.String r2 = r4.C
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L2f
            java.lang.String r1 = r3.C2
            java.lang.String r2 = r4.C2
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L2f
            java.lang.String r1 = r3.N
            java.lang.String r4 = r4.N
            boolean r4 = java.util.Objects.equals(r1, r4)
            if (r4 == 0) goto L2f
            r0 = 1
        L2f:
            return r0
    }

    public java.lang.String getC() {
            r1 = this;
            java.lang.String r0 = r1.C
            return r0
    }

    public java.lang.String getC2() {
            r1 = this;
            java.lang.String r0 = r1.C2
            return r0
    }

    public int getF() {
            r1 = this;
            int r0 = r1.F
            return r0
    }

    public java.lang.String getN() {
            r1 = this;
            java.lang.String r0 = r1.N
            return r0
    }

    public int getTupleIndex() {
            r1 = this;
            int r0 = r1.tIndex
            return r0
    }

    public int hashCode() {
            r1 = this;
            boolean r0 = r1.hashCodeComputed
            if (r0 != 0) goto L7
            r1.generateHashCode()
        L7:
            int r0 = r1.cachedHashCode
            return r0
    }

    public java.lang.String[] innerBreakAtDollar(java.lang.String r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            int r3 = r6.length()
            if (r1 >= r3) goto L2e
            char r3 = r6.charAt(r1)
            r4 = 36
            if (r3 > r4) goto L1e
            java.lang.String r2 = r6.substring(r2, r1)
            r0.add(r2)
            int r2 = r1 + 1
        L1e:
            int r1 = r1 + 1
            int r3 = r6.length()
            if (r1 < r3) goto L7
            java.lang.String r3 = r6.substring(r2)
            r0.add(r3)
            goto L7
        L2e:
            java.lang.String[] r6 = org.apache.commons.compress.harmony.unpack200.IcTuple.EMPTY_STRING_ARRAY
            java.lang.Object[] r6 = r0.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            return r6
    }

    public boolean isAnonymous() {
            r1 = this;
            boolean r0 = r1.anonymous
            return r0
    }

    public boolean isMember() {
            r1 = this;
            boolean r0 = r1.member
            return r0
    }

    public boolean nestedExplicitFlagSet() {
            r2 = this;
            int r0 = r2.F
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public boolean nullSafeEquals(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            if (r1 != 0) goto L8
            if (r2 != 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
        L8:
            boolean r1 = r1.equals(r2)
            return r1
    }

    public int outerClassIndex() {
            r1 = this;
            int r0 = r1.cachedOuterClassIndex
            return r0
    }

    public java.lang.String outerClassString() {
            r1 = this;
            java.lang.String r0 = r1.cachedOuterClassString
            return r0
    }

    public boolean outerIsAnonymous() {
            r1 = this;
            boolean r0 = r1.outerIsAnonymous
            return r0
    }

    public boolean predicted() {
            r1 = this;
            boolean r0 = r1.predictOuter
            if (r0 != 0) goto Lb
            boolean r0 = r1.predictSimple
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    public java.lang.String simpleClassName() {
            r1 = this;
            java.lang.String r0 = r1.cachedSimpleClassName
            return r0
    }

    public int simpleClassNameIndex() {
            r1 = this;
            int r0 = r1.cachedSimpleClassNameIndex
            return r0
    }

    public int thisClassIndex() {
            r1 = this;
            boolean r0 = r1.predicted()
            if (r0 == 0) goto L9
            int r0 = r1.cIndex
            return r0
        L9:
            r0 = -1
            return r0
    }

    public java.lang.String thisClassString() {
            r2 = this;
            boolean r0 = r2.predicted()
            if (r0 == 0) goto L9
            java.lang.String r0 = r2.C
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.C2
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "$"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.N
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IcTuple ("
            r0.<init>(r1)
            java.lang.String r1 = r2.simpleClassName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " in "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.outerClassString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
