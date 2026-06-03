package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class BcBands extends org.apache.commons.compress.harmony.pack200.BandSet {
    private static final int ALOAD_0 = 42;
    private static final int IINC = 132;
    private static final int INVOKEINTERFACE = 185;
    private static final int LOOKUPSWITCH = 171;
    private static final int MULTIANEWARRAY = 197;
    private static final int TABLESWITCH = 170;
    private static final int WIDE = 196;
    private static final int endMarker = 255;
    private final org.apache.commons.compress.harmony.pack200.IntList bcByte;
    private final org.apache.commons.compress.harmony.pack200.IntList bcCaseCount;
    private final org.apache.commons.compress.harmony.pack200.IntList bcCaseValue;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> bcClassRef;
    private final org.apache.commons.compress.harmony.pack200.IntList bcCodes;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPDouble> bcDoubleRef;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPMethodOrField> bcFieldRef;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPFloat> bcFloatRef;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPMethodOrField> bcIMethodRef;
    private java.util.List bcInitRef;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPInt> bcIntref;
    private final java.util.List bcLabel;
    private final org.apache.commons.compress.harmony.pack200.IntList bcLabelRelativeOffsets;
    private final org.apache.commons.compress.harmony.pack200.IntList bcLocal;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPLong> bcLongRef;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPMethodOrField> bcMethodRef;
    private final org.apache.commons.compress.harmony.pack200.IntList bcShort;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPString> bcStringRef;
    private final java.util.List bcSuperField;
    private java.util.List bcSuperMethod;
    private java.util.List bcThisField;
    private java.util.List bcThisMethod;
    private final org.apache.commons.compress.harmony.pack200.IntList bciRenumbering;
    private int byteCodeOffset;
    private final org.apache.commons.compress.harmony.pack200.CpBands cpBands;
    private java.lang.String currentClass;
    private java.lang.String currentNewClass;
    private final java.util.Map<org.objectweb.asm.Label, java.lang.Integer> labelsToOffsets;
    private int renumberedOffset;
    private final org.apache.commons.compress.harmony.pack200.Segment segment;
    private java.lang.String superClass;

    public BcBands(org.apache.commons.compress.harmony.pack200.CpBands r2, org.apache.commons.compress.harmony.pack200.Segment r3, int r4) {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r3.getSegmentHeader()
            r1.<init>(r4, r0)
            org.apache.commons.compress.harmony.pack200.IntList r4 = new org.apache.commons.compress.harmony.pack200.IntList
            r4.<init>()
            r1.bcCodes = r4
            org.apache.commons.compress.harmony.pack200.IntList r4 = new org.apache.commons.compress.harmony.pack200.IntList
            r4.<init>()
            r1.bcCaseCount = r4
            org.apache.commons.compress.harmony.pack200.IntList r4 = new org.apache.commons.compress.harmony.pack200.IntList
            r4.<init>()
            r1.bcCaseValue = r4
            org.apache.commons.compress.harmony.pack200.IntList r4 = new org.apache.commons.compress.harmony.pack200.IntList
            r4.<init>()
            r1.bcByte = r4
            org.apache.commons.compress.harmony.pack200.IntList r4 = new org.apache.commons.compress.harmony.pack200.IntList
            r4.<init>()
            r1.bcShort = r4
            org.apache.commons.compress.harmony.pack200.IntList r4 = new org.apache.commons.compress.harmony.pack200.IntList
            r4.<init>()
            r1.bcLocal = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.bcLabel = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.bcIntref = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.bcFloatRef = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.bcLongRef = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.bcDoubleRef = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.bcStringRef = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.bcClassRef = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.bcFieldRef = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.bcMethodRef = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.bcIMethodRef = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.bcThisField = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.bcSuperField = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.bcThisMethod = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.bcSuperMethod = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.bcInitRef = r4
            org.apache.commons.compress.harmony.pack200.IntList r4 = new org.apache.commons.compress.harmony.pack200.IntList
            r4.<init>()
            r1.bciRenumbering = r4
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r1.labelsToOffsets = r4
            org.apache.commons.compress.harmony.pack200.IntList r4 = new org.apache.commons.compress.harmony.pack200.IntList
            r4.<init>()
            r1.bcLabelRelativeOffsets = r4
            r1.cpBands = r2
            r1.segment = r3
            return
    }

    private java.util.List<java.lang.Integer> getIndexInClass(java.util.List<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r3) {
            r2 = this;
            java.util.stream.Stream r3 = r3.stream()
            org.apache.commons.compress.harmony.pack200.BcBands$$ExternalSyntheticLambda0 r0 = new org.apache.commons.compress.harmony.pack200.BcBands$$ExternalSyntheticLambda0
            r0.<init>()
            java.util.stream.Collector r1 = java.util.stream.Collectors.toList()
            java.util.stream.Collector r0 = java.util.stream.Collectors.mapping(r0, r1)
            java.lang.Object r3 = r3.collect(r0)
            java.util.List r3 = (java.util.List) r3
            return r3
    }

    private java.util.List<java.lang.Integer> getIndexInClassForConstructor(java.util.List<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r3) {
            r2 = this;
            java.util.stream.Stream r3 = r3.stream()
            org.apache.commons.compress.harmony.pack200.BcBands$$ExternalSyntheticLambda1 r0 = new org.apache.commons.compress.harmony.pack200.BcBands$$ExternalSyntheticLambda1
            r0.<init>()
            java.util.stream.Collector r1 = java.util.stream.Collectors.toList()
            java.util.stream.Collector r0 = java.util.stream.Collectors.mapping(r0, r1)
            java.lang.Object r3 = r3.collect(r0)
            java.util.List r3 = (java.util.List) r3
            return r3
    }

    private void updateRenumbering() {
            r3 = this;
            org.apache.commons.compress.harmony.pack200.IntList r0 = r3.bciRenumbering
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Le
            org.apache.commons.compress.harmony.pack200.IntList r0 = r3.bciRenumbering
            r1 = 0
            r0.add(r1)
        Le:
            int r0 = r3.renumberedOffset
            int r0 = r0 + 1
            r3.renumberedOffset = r0
            org.apache.commons.compress.harmony.pack200.IntList r0 = r3.bciRenumbering
            int r0 = r0.size()
        L1a:
            int r1 = r3.byteCodeOffset
            if (r0 >= r1) goto L27
            org.apache.commons.compress.harmony.pack200.IntList r1 = r3.bciRenumbering
            r2 = -1
            r1.add(r2)
            int r0 = r0 + 1
            goto L1a
        L27:
            org.apache.commons.compress.harmony.pack200.IntList r0 = r3.bciRenumbering
            int r1 = r3.renumberedOffset
            r0.add(r1)
            return
    }

    public void finaliseBands() {
            r1 = this;
            java.util.List r0 = r1.bcThisField
            java.util.List r0 = r1.getIndexInClass(r0)
            r1.bcThisField = r0
            java.util.List r0 = r1.bcThisMethod
            java.util.List r0 = r1.getIndexInClass(r0)
            r1.bcThisMethod = r0
            java.util.List r0 = r1.bcSuperMethod
            java.util.List r0 = r1.getIndexInClass(r0)
            r1.bcSuperMethod = r0
            java.util.List r0 = r1.bcInitRef
            java.util.List r0 = r1.getIndexInClassForConstructor(r0)
            r1.bcInitRef = r0
            return
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(java.io.OutputStream r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r5 = this;
            java.lang.String r0 = "Writing byte code bands..."
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r5.bcCodes
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r1 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            java.lang.String r2 = "bcCodes"
            byte[] r0 = r5.encodeBandInt(r2, r0, r1)
            r6.write(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrote "
            r1.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " bytes from bcCodes["
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.compress.harmony.pack200.IntList r1 = r5.bcCodes
            int r1 = r1.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r5.bcCaseCount
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "bcCaseCount"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcCaseCount["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r5.bcCaseCount
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r5.bcCaseValue
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r4 = "bcCaseValue"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcCaseValue["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r5.bcCaseValue
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r5.bcByte
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            java.lang.String r4 = "bcByte"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcByte["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r5.bcByte
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r5.bcShort
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r4 = "bcShort"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcShort["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r5.bcShort
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r5.bcLocal
            int[] r0 = r0.toArray()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "bcLocal"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcLocal["
            java.lang.StringBuilder r0 = r0.append(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r5.bcLocal
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List r0 = r5.bcLabel
            int[] r0 = r5.integerListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.BRANCH5
            java.lang.String r4 = "bcLabel"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcLabel["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List r3 = r5.bcLabel
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPInt> r0 = r5.bcIntref
            int[] r0 = r5.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r4 = "bcIntref"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcIntref["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPInt> r3 = r5.bcIntref
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPFloat> r0 = r5.bcFloatRef
            int[] r0 = r5.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r4 = "bcFloatRef"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcFloatRef["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPFloat> r3 = r5.bcFloatRef
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPLong> r0 = r5.bcLongRef
            int[] r0 = r5.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r4 = "bcLongRef"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcLongRef["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPLong> r3 = r5.bcLongRef
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPDouble> r0 = r5.bcDoubleRef
            int[] r0 = r5.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r4 = "bcDoubleRef"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcDoubleRef["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPDouble> r3 = r5.bcDoubleRef
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPString> r0 = r5.bcStringRef
            int[] r0 = r5.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r4 = "bcStringRef"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcStringRef["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPString> r3 = r5.bcStringRef
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r0 = r5.bcClassRef
            int[] r0 = r5.cpEntryOrNullListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "bcClassRef"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcClassRef["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r3 = r5.bcClassRef
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r0 = r5.bcFieldRef
            int[] r0 = r5.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r4 = "bcFieldRef"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcFieldRef["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r3 = r5.bcFieldRef
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r0 = r5.bcMethodRef
            int[] r0 = r5.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "bcMethodRef"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcMethodRef["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r3 = r5.bcMethodRef
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r0 = r5.bcIMethodRef
            int[] r0 = r5.cpEntryListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            java.lang.String r4 = "bcIMethodRef"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcIMethodRef["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r3 = r5.bcIMethodRef
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List r0 = r5.bcThisField
            int[] r0 = r5.integerListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "bcThisField"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcThisField["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List r3 = r5.bcThisField
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List r0 = r5.bcSuperField
            int[] r0 = r5.integerListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "bcSuperField"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcSuperField["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List r3 = r5.bcSuperField
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List r0 = r5.bcThisMethod
            int[] r0 = r5.integerListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "bcThisMethod"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcThisMethod["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List r3 = r5.bcThisMethod
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List r0 = r5.bcSuperMethod
            int[] r0 = r5.integerListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "bcSuperMethod"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from bcSuperMethod["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.util.List r3 = r5.bcSuperMethod
            int r3 = r3.size()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List r0 = r5.bcInitRef
            int[] r0 = r5.integerListToArray(r0)
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String r4 = "bcInitRef"
            byte[] r0 = r5.encodeBandInt(r4, r0, r3)
            r6.write(r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            int r0 = r0.length
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = " bytes from bcInitRef["
            java.lang.StringBuilder r6 = r6.append(r0)
            java.util.List r0 = r5.bcInitRef
            int r0 = r0.size()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r6)
            return
    }

    public void setCurrentClass(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.currentClass = r1
            r0.superClass = r2
            return
    }

    public void visitEnd() {
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            org.apache.commons.compress.harmony.pack200.IntList r2 = r6.bciRenumbering
            int r2 = r2.size()
            if (r1 >= r2) goto L26
            org.apache.commons.compress.harmony.pack200.IntList r2 = r6.bciRenumbering
            int r2 = r2.get(r1)
            r3 = -1
            if (r2 != r3) goto L23
            org.apache.commons.compress.harmony.pack200.IntList r2 = r6.bciRenumbering
            r2.remove(r1)
            org.apache.commons.compress.harmony.pack200.IntList r2 = r6.bciRenumbering
            int r3 = r6.renumberedOffset
            int r3 = r3 + 1
            r6.renumberedOffset = r3
            r2.add(r1, r3)
        L23:
            int r1 = r1 + 1
            goto L2
        L26:
            int r1 = r6.renumberedOffset
            if (r1 == 0) goto La8
            int r1 = r1 + 1
            org.apache.commons.compress.harmony.pack200.IntList r2 = r6.bciRenumbering
            int r2 = r2.size()
            if (r1 != r2) goto La0
            java.util.List r1 = r6.bcLabel
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L3c:
            if (r1 < 0) goto L7d
            java.util.List r2 = r6.bcLabel
            java.lang.Object r2 = r2.get(r1)
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L49
            goto L7d
        L49:
            boolean r3 = r2 instanceof org.objectweb.asm.Label
            if (r3 == 0) goto L7a
            java.util.List r3 = r6.bcLabel
            r3.remove(r1)
            java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r3 = r6.labelsToOffsets
            java.lang.Object r2 = r3.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            org.apache.commons.compress.harmony.pack200.IntList r3 = r6.bcLabelRelativeOffsets
            int r3 = r3.get(r1)
            java.util.List r4 = r6.bcLabel
            org.apache.commons.compress.harmony.pack200.IntList r5 = r6.bciRenumbering
            int r2 = r2.intValue()
            int r2 = r5.get(r2)
            org.apache.commons.compress.harmony.pack200.IntList r5 = r6.bciRenumbering
            int r3 = r5.get(r3)
            int r2 = r2 - r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.add(r1, r2)
        L7a:
            int r1 = r1 + (-1)
            goto L3c
        L7d:
            org.apache.commons.compress.harmony.pack200.IntList r1 = r6.bcCodes
            r2 = 255(0xff, float:3.57E-43)
            r1.add(r2)
            org.apache.commons.compress.harmony.pack200.Segment r1 = r6.segment
            org.apache.commons.compress.harmony.pack200.ClassBands r1 = r1.getClassBands()
            org.apache.commons.compress.harmony.pack200.IntList r2 = r6.bciRenumbering
            java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r3 = r6.labelsToOffsets
            r1.doBciRenumbering(r2, r3)
            org.apache.commons.compress.harmony.pack200.IntList r1 = r6.bciRenumbering
            r1.clear()
            java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r1 = r6.labelsToOffsets
            r1.clear()
            r6.byteCodeOffset = r0
            r6.renumberedOffset = r0
            goto La8
        La0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Mistake made with renumbering"
            r0.<init>(r1)
            throw r0
        La8:
            return
    }

    public void visitFieldInsn(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            int r0 = r4.byteCodeOffset
            int r0 = r0 + 3
            r4.byteCodeOffset = r0
            r4.updateRenumbering()
            org.apache.commons.compress.harmony.pack200.IntList r0 = r4.bcCodes
            int r0 = r0.size()
            r1 = 42
            if (r0 <= 0) goto L2c
            org.apache.commons.compress.harmony.pack200.IntList r0 = r4.bcCodes
            int r2 = r0.size()
            r3 = 1
            int r2 = r2 - r3
            int r0 = r0.get(r2)
            if (r0 != r1) goto L2c
            org.apache.commons.compress.harmony.pack200.IntList r0 = r4.bcCodes
            int r2 = r0.size()
            int r2 = r2 - r3
            r0.remove(r2)
            goto L2d
        L2c:
            r3 = 0
        L2d:
            org.apache.commons.compress.harmony.pack200.CpBands r0 = r4.cpBands
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r7 = r0.getCPField(r6, r7, r8)
            if (r3 == 0) goto L37
            int r5 = r5 + 7
        L37:
            java.lang.String r8 = r4.currentClass
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L47
            int r5 = r5 + 24
            java.util.List r6 = r4.bcThisField
            r6.add(r7)
            goto L55
        L47:
            if (r3 == 0) goto L50
            int r5 = r5 + (-7)
            org.apache.commons.compress.harmony.pack200.IntList r6 = r4.bcCodes
            r6.add(r1)
        L50:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r6 = r4.bcFieldRef
            r6.add(r7)
        L55:
            org.apache.commons.compress.harmony.pack200.IntList r6 = r4.bcCodes
            r6.add(r5)
            return
    }

    public void visitIincInsn(int r4, int r5) {
            r3 = this;
            r0 = 132(0x84, float:1.85E-43)
            r1 = 255(0xff, float:3.57E-43)
            if (r4 > r1) goto L20
            if (r5 <= r1) goto L9
            goto L20
        L9:
            int r2 = r3.byteCodeOffset
            int r2 = r2 + 3
            r3.byteCodeOffset = r2
            org.apache.commons.compress.harmony.pack200.IntList r2 = r3.bcCodes
            r2.add(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r3.bcLocal
            r0.add(r4)
            org.apache.commons.compress.harmony.pack200.IntList r4 = r3.bcByte
            r5 = r5 & r1
            r4.add(r5)
            goto L3c
        L20:
            int r1 = r3.byteCodeOffset
            int r1 = r1 + 6
            r3.byteCodeOffset = r1
            org.apache.commons.compress.harmony.pack200.IntList r1 = r3.bcCodes
            r2 = 196(0xc4, float:2.75E-43)
            r1.add(r2)
            org.apache.commons.compress.harmony.pack200.IntList r1 = r3.bcCodes
            r1.add(r0)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r3.bcLocal
            r0.add(r4)
            org.apache.commons.compress.harmony.pack200.IntList r4 = r3.bcShort
            r4.add(r5)
        L3c:
            r3.updateRenumbering()
            return
    }

    public void visitInsn(int r2) {
            r1 = this;
            r0 = 202(0xca, float:2.83E-43)
            if (r2 >= r0) goto L13
            org.apache.commons.compress.harmony.pack200.IntList r0 = r1.bcCodes
            r0.add(r2)
            int r2 = r1.byteCodeOffset
            int r2 = r2 + 1
            r1.byteCodeOffset = r2
            r1.updateRenumbering()
            return
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Non-standard bytecode instructions not supported"
            r2.<init>(r0)
            throw r2
    }

    public void visitIntInsn(int r2, int r3) {
            r1 = this;
            r0 = 16
            if (r2 == r0) goto L1e
            r0 = 17
            if (r2 == r0) goto Ld
            r0 = 188(0xbc, float:2.63E-43)
            if (r2 == r0) goto L1e
            goto L30
        Ld:
            org.apache.commons.compress.harmony.pack200.IntList r0 = r1.bcCodes
            r0.add(r2)
            org.apache.commons.compress.harmony.pack200.IntList r2 = r1.bcShort
            r2.add(r3)
            int r2 = r1.byteCodeOffset
            int r2 = r2 + 3
            r1.byteCodeOffset = r2
            goto L30
        L1e:
            org.apache.commons.compress.harmony.pack200.IntList r0 = r1.bcCodes
            r0.add(r2)
            org.apache.commons.compress.harmony.pack200.IntList r2 = r1.bcByte
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2.add(r3)
            int r2 = r1.byteCodeOffset
            int r2 = r2 + 2
            r1.byteCodeOffset = r2
        L30:
            r1.updateRenumbering()
            return
    }

    public void visitJumpInsn(int r2, org.objectweb.asm.Label r3) {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.IntList r0 = r1.bcCodes
            r0.add(r2)
            java.util.List r2 = r1.bcLabel
            r2.add(r3)
            org.apache.commons.compress.harmony.pack200.IntList r2 = r1.bcLabelRelativeOffsets
            int r3 = r1.byteCodeOffset
            r2.add(r3)
            int r2 = r1.byteCodeOffset
            int r2 = r2 + 3
            r1.byteCodeOffset = r2
            r1.updateRenumbering()
            return
    }

    public void visitLabel(org.objectweb.asm.Label r3) {
            r2 = this;
            java.util.Map<org.objectweb.asm.Label, java.lang.Integer> r0 = r2.labelsToOffsets
            int r1 = r2.byteCodeOffset
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
            return
    }

    public void visitLdcInsn(java.lang.Object r3) {
            r2 = this;
            org.apache.commons.compress.harmony.pack200.CpBands r0 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPConstant r3 = r0.getConstant(r3)
            org.apache.commons.compress.harmony.pack200.Segment r0 = r2.segment
            boolean r0 = r0.lastConstantHadWideIndex()
            if (r0 != 0) goto L6d
            boolean r0 = r3 instanceof org.apache.commons.compress.harmony.pack200.CPLong
            if (r0 != 0) goto L6d
            boolean r0 = r3 instanceof org.apache.commons.compress.harmony.pack200.CPDouble
            if (r0 == 0) goto L17
            goto L6d
        L17:
            int r0 = r2.byteCodeOffset
            int r0 = r0 + 2
            r2.byteCodeOffset = r0
            boolean r0 = r3 instanceof org.apache.commons.compress.harmony.pack200.CPInt
            if (r0 == 0) goto L31
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            r1 = 234(0xea, float:3.28E-43)
            r0.add(r1)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPInt> r0 = r2.bcIntref
            org.apache.commons.compress.harmony.pack200.CPInt r3 = (org.apache.commons.compress.harmony.pack200.CPInt) r3
            r0.add(r3)
            goto Le4
        L31:
            boolean r0 = r3 instanceof org.apache.commons.compress.harmony.pack200.CPFloat
            if (r0 == 0) goto L45
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            r1 = 235(0xeb, float:3.3E-43)
            r0.add(r1)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPFloat> r0 = r2.bcFloatRef
            org.apache.commons.compress.harmony.pack200.CPFloat r3 = (org.apache.commons.compress.harmony.pack200.CPFloat) r3
            r0.add(r3)
            goto Le4
        L45:
            boolean r0 = r3 instanceof org.apache.commons.compress.harmony.pack200.CPString
            if (r0 == 0) goto L59
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            r1 = 18
            r0.add(r1)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPString> r0 = r2.bcStringRef
            org.apache.commons.compress.harmony.pack200.CPString r3 = (org.apache.commons.compress.harmony.pack200.CPString) r3
            r0.add(r3)
            goto Le4
        L59:
            boolean r0 = r3 instanceof org.apache.commons.compress.harmony.pack200.CPClass
            if (r0 == 0) goto Le4
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            r1 = 233(0xe9, float:3.27E-43)
            r0.add(r1)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r0 = r2.bcClassRef
            org.apache.commons.compress.harmony.pack200.CPClass r3 = (org.apache.commons.compress.harmony.pack200.CPClass) r3
            r0.add(r3)
            goto Le4
        L6d:
            int r0 = r2.byteCodeOffset
            int r0 = r0 + 3
            r2.byteCodeOffset = r0
            boolean r0 = r3 instanceof org.apache.commons.compress.harmony.pack200.CPInt
            if (r0 == 0) goto L86
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            r1 = 237(0xed, float:3.32E-43)
            r0.add(r1)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPInt> r0 = r2.bcIntref
            org.apache.commons.compress.harmony.pack200.CPInt r3 = (org.apache.commons.compress.harmony.pack200.CPInt) r3
            r0.add(r3)
            goto Le4
        L86:
            boolean r0 = r3 instanceof org.apache.commons.compress.harmony.pack200.CPFloat
            if (r0 == 0) goto L99
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            r1 = 238(0xee, float:3.34E-43)
            r0.add(r1)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPFloat> r0 = r2.bcFloatRef
            org.apache.commons.compress.harmony.pack200.CPFloat r3 = (org.apache.commons.compress.harmony.pack200.CPFloat) r3
            r0.add(r3)
            goto Le4
        L99:
            boolean r0 = r3 instanceof org.apache.commons.compress.harmony.pack200.CPLong
            if (r0 == 0) goto Lac
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            r1 = 20
            r0.add(r1)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPLong> r0 = r2.bcLongRef
            org.apache.commons.compress.harmony.pack200.CPLong r3 = (org.apache.commons.compress.harmony.pack200.CPLong) r3
            r0.add(r3)
            goto Le4
        Lac:
            boolean r0 = r3 instanceof org.apache.commons.compress.harmony.pack200.CPDouble
            if (r0 == 0) goto Lbf
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            r1 = 239(0xef, float:3.35E-43)
            r0.add(r1)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPDouble> r0 = r2.bcDoubleRef
            org.apache.commons.compress.harmony.pack200.CPDouble r3 = (org.apache.commons.compress.harmony.pack200.CPDouble) r3
            r0.add(r3)
            goto Le4
        Lbf:
            boolean r0 = r3 instanceof org.apache.commons.compress.harmony.pack200.CPString
            if (r0 == 0) goto Ld2
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            r1 = 19
            r0.add(r1)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPString> r0 = r2.bcStringRef
            org.apache.commons.compress.harmony.pack200.CPString r3 = (org.apache.commons.compress.harmony.pack200.CPString) r3
            r0.add(r3)
            goto Le4
        Ld2:
            boolean r0 = r3 instanceof org.apache.commons.compress.harmony.pack200.CPClass
            if (r0 == 0) goto Le8
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            r1 = 236(0xec, float:3.31E-43)
            r0.add(r1)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r0 = r2.bcClassRef
            org.apache.commons.compress.harmony.pack200.CPClass r3 = (org.apache.commons.compress.harmony.pack200.CPClass) r3
            r0.add(r3)
        Le4:
            r2.updateRenumbering()
            return
        Le8:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Constant should not be null"
            r3.<init>(r0)
            throw r3
    }

    public void visitLookupSwitchInsn(org.objectweb.asm.Label r4, int[] r5, org.objectweb.asm.Label[] r6) {
            r3 = this;
            org.apache.commons.compress.harmony.pack200.IntList r0 = r3.bcCodes
            r1 = 171(0xab, float:2.4E-43)
            r0.add(r1)
            java.util.List r0 = r3.bcLabel
            r0.add(r4)
            org.apache.commons.compress.harmony.pack200.IntList r4 = r3.bcLabelRelativeOffsets
            int r0 = r3.byteCodeOffset
            r4.add(r0)
            org.apache.commons.compress.harmony.pack200.IntList r4 = r3.bcCaseCount
            int r0 = r5.length
            r4.add(r0)
            r4 = 0
            r0 = r4
        L1b:
            int r1 = r6.length
            if (r0 >= r1) goto L36
            org.apache.commons.compress.harmony.pack200.IntList r1 = r3.bcCaseValue
            r2 = r5[r0]
            r1.add(r2)
            java.util.List r1 = r3.bcLabel
            r2 = r6[r0]
            r1.add(r2)
            org.apache.commons.compress.harmony.pack200.IntList r1 = r3.bcLabelRelativeOffsets
            int r2 = r3.byteCodeOffset
            r1.add(r2)
            int r0 = r0 + 1
            goto L1b
        L36:
            int r6 = r3.byteCodeOffset
            int r0 = r6 + 1
            int r0 = r0 % 4
            if (r0 != 0) goto L3f
            goto L45
        L3f:
            int r4 = r6 + 1
            int r4 = r4 % 4
            int r4 = 4 - r4
        L45:
            int r4 = r4 + 9
            int r5 = r5.length
            int r5 = r5 * 8
            int r4 = r4 + r5
            int r6 = r6 + r4
            r3.byteCodeOffset = r6
            r3.updateRenumbering()
            return
    }

    public void visitMethodInsn(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            int r0 = r4.byteCodeOffset
            int r1 = r0 + 3
            r4.byteCodeOffset = r1
            switch(r5) {
                case 182: goto L23;
                case 183: goto L23;
                case 184: goto L23;
                case 185: goto Lb;
                default: goto L9;
            }
        L9:
            goto Le1
        Lb:
            int r0 = r0 + 5
            r4.byteCodeOffset = r0
            org.apache.commons.compress.harmony.pack200.CpBands r5 = r4.cpBands
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r5 = r5.getCPIMethod(r6, r7, r8)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r6 = r4.bcIMethodRef
            r6.add(r5)
            org.apache.commons.compress.harmony.pack200.IntList r5 = r4.bcCodes
            r6 = 185(0xb9, float:2.59E-43)
            r5.add(r6)
            goto Le1
        L23:
            org.apache.commons.compress.harmony.pack200.IntList r0 = r4.bcCodes
            int r0 = r0.size()
            r1 = 42
            if (r0 <= 0) goto L48
            org.apache.commons.compress.harmony.pack200.IntList r0 = r4.bcCodes
            int r2 = r0.size()
            r3 = 1
            int r2 = r2 - r3
            int r0 = r0.get(r2)
            if (r0 != r1) goto L48
            org.apache.commons.compress.harmony.pack200.IntList r0 = r4.bcCodes
            int r2 = r0.size()
            int r2 = r2 - r3
            r0.remove(r2)
            int r5 = r5 + 7
            goto L49
        L48:
            r3 = 0
        L49:
            java.lang.String r0 = r4.currentClass
            boolean r0 = r6.equals(r0)
            java.lang.String r2 = "<init>"
            if (r0 == 0) goto L7a
            int r5 = r5 + 24
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L6e
            r0 = 207(0xcf, float:2.9E-43)
            if (r5 != r0) goto L6e
            java.util.List r5 = r4.bcInitRef
            org.apache.commons.compress.harmony.pack200.CpBands r0 = r4.cpBands
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r6 = r0.getCPMethod(r6, r7, r8)
            r5.add(r6)
            r5 = 230(0xe6, float:3.22E-43)
            goto Ldc
        L6e:
            java.util.List r0 = r4.bcThisMethod
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r4.cpBands
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r6 = r1.getCPMethod(r6, r7, r8)
            r0.add(r6)
            goto Ldc
        L7a:
            java.lang.String r0 = r4.superClass
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto La8
            int r5 = r5 + 38
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto L9c
            r0 = 221(0xdd, float:3.1E-43)
            if (r5 != r0) goto L9c
            java.util.List r5 = r4.bcInitRef
            org.apache.commons.compress.harmony.pack200.CpBands r0 = r4.cpBands
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r6 = r0.getCPMethod(r6, r7, r8)
            r5.add(r6)
            r5 = 231(0xe7, float:3.24E-43)
            goto Ldc
        L9c:
            java.util.List r0 = r4.bcSuperMethod
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r4.cpBands
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r6 = r1.getCPMethod(r6, r7, r8)
            r0.add(r6)
            goto Ldc
        La8:
            if (r3 == 0) goto Lb1
            int r5 = r5 + (-7)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r4.bcCodes
            r0.add(r1)
        Lb1:
            boolean r0 = r7.equals(r2)
            if (r0 == 0) goto Ld1
            r0 = 183(0xb7, float:2.56E-43)
            if (r5 != r0) goto Ld1
            java.lang.String r0 = r4.currentNewClass
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Ld1
            java.util.List r5 = r4.bcInitRef
            org.apache.commons.compress.harmony.pack200.CpBands r0 = r4.cpBands
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r6 = r0.getCPMethod(r6, r7, r8)
            r5.add(r6)
            r5 = 232(0xe8, float:3.25E-43)
            goto Ldc
        Ld1:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r0 = r4.bcMethodRef
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r4.cpBands
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r6 = r1.getCPMethod(r6, r7, r8)
            r0.add(r6)
        Ldc:
            org.apache.commons.compress.harmony.pack200.IntList r6 = r4.bcCodes
            r6.add(r5)
        Le1:
            r4.updateRenumbering()
            return
    }

    public void visitMultiANewArrayInsn(java.lang.String r3, int r4) {
            r2 = this;
            int r0 = r2.byteCodeOffset
            int r0 = r0 + 4
            r2.byteCodeOffset = r0
            r2.updateRenumbering()
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            r1 = 197(0xc5, float:2.76E-43)
            r0.add(r1)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r0 = r2.bcClassRef
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPClass r3 = r1.getCPClass(r3)
            r0.add(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r2.bcByte
            r4 = r4 & 255(0xff, float:3.57E-43)
            r3.add(r4)
            return
    }

    public void visitTableSwitchInsn(int r3, int r4, org.objectweb.asm.Label r5, org.objectweb.asm.Label... r6) {
            r2 = this;
            org.apache.commons.compress.harmony.pack200.IntList r4 = r2.bcCodes
            r0 = 170(0xaa, float:2.38E-43)
            r4.add(r0)
            java.util.List r4 = r2.bcLabel
            r4.add(r5)
            org.apache.commons.compress.harmony.pack200.IntList r4 = r2.bcLabelRelativeOffsets
            int r5 = r2.byteCodeOffset
            r4.add(r5)
            org.apache.commons.compress.harmony.pack200.IntList r4 = r2.bcCaseValue
            r4.add(r3)
            int r3 = r6.length
            org.apache.commons.compress.harmony.pack200.IntList r4 = r2.bcCaseCount
            r4.add(r3)
            r4 = 0
            r5 = r4
        L20:
            if (r5 >= r3) goto L33
            java.util.List r0 = r2.bcLabel
            r1 = r6[r5]
            r0.add(r1)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcLabelRelativeOffsets
            int r1 = r2.byteCodeOffset
            r0.add(r1)
            int r5 = r5 + 1
            goto L20
        L33:
            int r3 = r2.byteCodeOffset
            int r5 = r3 % 4
            if (r5 != 0) goto L3a
            goto L3e
        L3a:
            int r4 = r3 % 4
            int r4 = 4 - r4
        L3e:
            int r4 = r4 + 12
            int r5 = r6.length
            int r5 = r5 * 4
            int r4 = r4 + r5
            int r3 = r3 + r4
            r2.byteCodeOffset = r3
            r2.updateRenumbering()
            return
    }

    public void visitTypeInsn(int r3, java.lang.String r4) {
            r2 = this;
            int r0 = r2.byteCodeOffset
            int r0 = r0 + 3
            r2.byteCodeOffset = r0
            r2.updateRenumbering()
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            r0.add(r3)
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r0 = r2.bcClassRef
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPClass r1 = r1.getCPClass(r4)
            r0.add(r1)
            r0 = 187(0xbb, float:2.62E-43)
            if (r3 != r0) goto L1f
            r2.currentNewClass = r4
        L1f:
            return
    }

    public void visitVarInsn(int r3, int r4) {
            r2 = this;
            r0 = 255(0xff, float:3.57E-43)
            if (r4 <= r0) goto L1c
            int r0 = r2.byteCodeOffset
            int r0 = r0 + 4
            r2.byteCodeOffset = r0
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            r1 = 196(0xc4, float:2.75E-43)
            r0.add(r1)
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            r0.add(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r2.bcLocal
            r3.add(r4)
            goto L6e
        L1c:
            r0 = 3
            if (r4 > r0) goto L5e
            r0 = 169(0xa9, float:2.37E-43)
            if (r3 != r0) goto L24
            goto L5e
        L24:
            int r0 = r2.byteCodeOffset
            int r0 = r0 + 1
            r2.byteCodeOffset = r0
            switch(r3) {
                case 21: goto L55;
                case 22: goto L4c;
                case 23: goto L43;
                case 24: goto L3a;
                case 25: goto L31;
                default: goto L2d;
            }
        L2d:
            switch(r3) {
                case 54: goto L55;
                case 55: goto L4c;
                case 56: goto L43;
                case 57: goto L3a;
                case 58: goto L31;
                default: goto L30;
            }
        L30:
            goto L6e
        L31:
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            int r3 = r3 + 17
            int r3 = r3 + r4
            r0.add(r3)
            goto L6e
        L3a:
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            int r3 = r3 + 14
            int r3 = r3 + r4
            r0.add(r3)
            goto L6e
        L43:
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            int r3 = r3 + 11
            int r3 = r3 + r4
            r0.add(r3)
            goto L6e
        L4c:
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            int r3 = r3 + 8
            int r3 = r3 + r4
            r0.add(r3)
            goto L6e
        L55:
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            int r3 = r3 + 5
            int r3 = r3 + r4
            r0.add(r3)
            goto L6e
        L5e:
            int r0 = r2.byteCodeOffset
            int r0 = r0 + 2
            r2.byteCodeOffset = r0
            org.apache.commons.compress.harmony.pack200.IntList r0 = r2.bcCodes
            r0.add(r3)
            org.apache.commons.compress.harmony.pack200.IntList r3 = r2.bcLocal
            r3.add(r4)
        L6e:
            r2.updateRenumbering()
            return
    }
}
