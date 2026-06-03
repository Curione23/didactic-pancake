package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class AttributeDefinitionBands extends org.apache.commons.compress.harmony.pack200.BandSet {
    public static final int CONTEXT_CLASS = 0;
    public static final int CONTEXT_CODE = 3;
    public static final int CONTEXT_FIELD = 1;
    public static final int CONTEXT_METHOD = 2;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition> attributeDefinitions;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition> classAttributeLayouts;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition> codeAttributeLayouts;
    private final org.apache.commons.compress.harmony.pack200.CpBands cpBands;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition> fieldAttributeLayouts;
    private final java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition> methodAttributeLayouts;
    private final org.apache.commons.compress.harmony.pack200.Segment segment;

    public static class AttributeDefinition {
        public int contextType;
        public int index;
        public org.apache.commons.compress.harmony.pack200.CPUTF8 layout;
        public org.apache.commons.compress.harmony.pack200.CPUTF8 name;

        public AttributeDefinition(int r1, int r2, org.apache.commons.compress.harmony.pack200.CPUTF8 r3, org.apache.commons.compress.harmony.pack200.CPUTF8 r4) {
                r0 = this;
                r0.<init>()
                r0.index = r1
                r0.contextType = r2
                r0.name = r3
                r0.layout = r4
                return
        }
    }

    public AttributeDefinitionBands(org.apache.commons.compress.harmony.pack200.Segment r25, int r26, org.objectweb.asm.Attribute[] r27) {
            r24 = this;
            r0 = r24
            r1 = r27
            org.apache.commons.compress.harmony.pack200.SegmentHeader r2 = r25.getSegmentHeader()
            r3 = r26
            r0.<init>(r3, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.classAttributeLayouts = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.methodAttributeLayouts = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.fieldAttributeLayouts = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.codeAttributeLayouts = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.attributeDefinitions = r2
            org.apache.commons.compress.harmony.pack200.CpBands r2 = r25.getCpBands()
            r0.cpBands = r2
            r2 = r25
            r0.segment = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            int r6 = r1.length
            r7 = 0
            r8 = r7
        L51:
            if (r8 >= r6) goto La2
            r9 = r1[r8]
            org.apache.commons.compress.harmony.pack200.NewAttribute r9 = (org.apache.commons.compress.harmony.pack200.NewAttribute) r9
            boolean r10 = r9 instanceof org.apache.commons.compress.harmony.pack200.NewAttribute.ErrorAttribute
            if (r10 != 0) goto L9f
            boolean r10 = r9 instanceof org.apache.commons.compress.harmony.pack200.NewAttribute.PassAttribute
            if (r10 != 0) goto L9f
            boolean r10 = r9 instanceof org.apache.commons.compress.harmony.pack200.NewAttribute.StripAttribute
            if (r10 != 0) goto L9f
            boolean r10 = r9.isContextClass()
            if (r10 == 0) goto L72
            java.lang.String r10 = r9.type
            java.lang.String r11 = r9.getLayout()
            r2.put(r10, r11)
        L72:
            boolean r10 = r9.isContextMethod()
            if (r10 == 0) goto L81
            java.lang.String r10 = r9.type
            java.lang.String r11 = r9.getLayout()
            r3.put(r10, r11)
        L81:
            boolean r10 = r9.isContextField()
            if (r10 == 0) goto L90
            java.lang.String r10 = r9.type
            java.lang.String r11 = r9.getLayout()
            r4.put(r10, r11)
        L90:
            boolean r10 = r9.isContextCode()
            if (r10 == 0) goto L9f
            java.lang.String r10 = r9.type
            java.lang.String r9 = r9.getLayout()
            r5.put(r10, r9)
        L9f:
            int r8 = r8 + 1
            goto L51
        La2:
            int r1 = r2.size()
            r6 = 7
            r8 = 1
            if (r1 <= r6) goto Laf
            org.apache.commons.compress.harmony.pack200.SegmentHeader r1 = r0.segmentHeader
            r1.setHave_class_flags_hi(r8)
        Laf:
            int r1 = r3.size()
            r9 = 6
            if (r1 <= r9) goto Lbb
            org.apache.commons.compress.harmony.pack200.SegmentHeader r1 = r0.segmentHeader
            r1.setHave_method_flags_hi(r8)
        Lbb:
            int r1 = r4.size()
            r10 = 10
            if (r1 <= r10) goto Lc8
            org.apache.commons.compress.harmony.pack200.SegmentHeader r1 = r0.segmentHeader
            r1.setHave_field_flags_hi(r8)
        Lc8:
            int r1 = r5.size()
            r11 = 15
            if (r1 <= r11) goto Ld5
            org.apache.commons.compress.harmony.pack200.SegmentHeader r1 = r0.segmentHeader
            r1.setHave_code_flags_hi(r8)
        Ld5:
            int[] r1 = new int[r6]
            r12 = 25
            r1[r7] = r12
            r13 = 26
            r1[r8] = r13
            r14 = 2
            r15 = 27
            r1[r14] = r15
            r11 = 3
            r16 = 28
            r1[r11] = r16
            r17 = 4
            r18 = 29
            r1[r17] = r18
            r19 = 5
            r20 = 30
            r1[r19] = r20
            r21 = 31
            r1[r9] = r21
            int r12 = r2.size()
            if (r12 <= r6) goto L103
            int[] r1 = r0.addHighIndices(r1)
        L103:
            r0.addAttributeDefinitions(r2, r1, r7)
            int[] r1 = new int[r9]
            r1[r7] = r13
            r1[r8] = r15
            r1[r14] = r16
            r1[r11] = r18
            r1[r17] = r20
            r1[r19] = r21
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r2 = r0.methodAttributeLayouts
            int r2 = r2.size()
            if (r2 <= r9) goto L120
            int[] r1 = r0.addHighIndices(r1)
        L120:
            r0.addAttributeDefinitions(r3, r1, r14)
            int[] r1 = new int[r10]
            r2 = 18
            r1[r7] = r2
            r3 = 23
            r1[r8] = r3
            r12 = 24
            r1[r14] = r12
            r22 = 25
            r1[r11] = r22
            r1[r17] = r13
            r1[r19] = r15
            r1[r9] = r16
            r1[r6] = r18
            r22 = 8
            r1[r22] = r20
            r23 = 9
            r1[r23] = r21
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r15 = r0.fieldAttributeLayouts
            int r15 = r15.size()
            if (r15 <= r10) goto L151
            int[] r1 = r0.addHighIndices(r1)
        L151:
            r0.addAttributeDefinitions(r4, r1, r8)
            r1 = 15
            int[] r4 = new int[r1]
            r1 = 17
            r4[r7] = r1
            r4[r8] = r2
            r1 = 19
            r4[r14] = r1
            r1 = 20
            r4[r11] = r1
            r1 = 21
            r4[r17] = r1
            r1 = 22
            r4[r19] = r1
            r4[r9] = r3
            r4[r6] = r12
            r1 = 25
            r4[r22] = r1
            r4[r23] = r13
            r1 = 27
            r4[r10] = r1
            r1 = 11
            r4[r1] = r16
            r1 = 12
            r4[r1] = r18
            r1 = 13
            r4[r1] = r20
            r1 = 14
            r4[r1] = r21
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r1 = r0.codeAttributeLayouts
            int r1 = r1.size()
            r2 = 15
            if (r1 <= r2) goto L19a
            int[] r4 = r0.addHighIndices(r4)
        L19a:
            r0.addAttributeDefinitions(r5, r4, r11)
            return
    }

    private void addAttributeDefinitions(java.util.Map<java.lang.String, java.lang.String> r2, int[] r3, int r4) {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$$ExternalSyntheticLambda0 r0 = new org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$$ExternalSyntheticLambda0
            r0.<init>(r1, r3, r4)
            r2.forEach(r0)
            return
    }

    private int[] addHighIndices(int[] r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 32
            int r0 = r0 + r1
            int[] r0 = java.util.Arrays.copyOf(r4, r0)
            int r4 = r4.length
        L9:
            int r2 = r0.length
            if (r4 >= r2) goto L13
            r0[r4] = r1
            int r1 = r1 + 1
            int r4 = r4 + 1
            goto L9
        L13:
            return r0
    }

    private void addSyntheticDefinitions() {
            r8 = this;
            org.apache.commons.compress.harmony.pack200.Segment r0 = r8.segment
            org.apache.commons.compress.harmony.pack200.ClassBands r0 = r0.getClassBands()
            boolean r0 = r0.isAnySyntheticClasses()
            org.apache.commons.compress.harmony.pack200.Segment r1 = r8.segment
            org.apache.commons.compress.harmony.pack200.ClassBands r1 = r1.getClassBands()
            boolean r1 = r1.isAnySyntheticMethods()
            org.apache.commons.compress.harmony.pack200.Segment r2 = r8.segment
            org.apache.commons.compress.harmony.pack200.ClassBands r2 = r2.getClassBands()
            boolean r2 = r2.isAnySyntheticFields()
            if (r0 != 0) goto L24
            if (r1 != 0) goto L24
            if (r2 == 0) goto L5d
        L24:
            org.apache.commons.compress.harmony.pack200.CpBands r3 = r8.cpBands
            java.lang.String r4 = "Synthetic"
            org.apache.commons.compress.harmony.pack200.CPUTF8 r3 = r3.getCPUtf8(r4)
            org.apache.commons.compress.harmony.pack200.CpBands r4 = r8.cpBands
            java.lang.String r5 = ""
            org.apache.commons.compress.harmony.pack200.CPUTF8 r4 = r4.getCPUtf8(r5)
            r5 = 12
            if (r0 == 0) goto L43
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r0 = r8.attributeDefinitions
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition r6 = new org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition
            r7 = 0
            r6.<init>(r5, r7, r3, r4)
            r0.add(r6)
        L43:
            if (r1 == 0) goto L50
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r0 = r8.attributeDefinitions
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition r1 = new org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition
            r6 = 2
            r1.<init>(r5, r6, r3, r4)
            r0.add(r1)
        L50:
            if (r2 == 0) goto L5d
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r0 = r8.attributeDefinitions
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition r1 = new org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition
            r2 = 1
            r1.<init>(r5, r2, r3, r4)
            r0.add(r1)
        L5d:
            return
    }

    public void finaliseBands() {
            r2 = this;
            r2.addSyntheticDefinitions()
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r2.segmentHeader
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r1 = r2.attributeDefinitions
            int r1 = r1.size()
            r0.setAttribute_definition_count(r1)
            return
    }

    public java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition> getClassAttributeLayouts() {
            r1 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r0 = r1.classAttributeLayouts
            return r0
    }

    public java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition> getCodeAttributeLayouts() {
            r1 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r0 = r1.codeAttributeLayouts
            return r0
    }

    public java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition> getFieldAttributeLayouts() {
            r1 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r0 = r1.fieldAttributeLayouts
            return r0
    }

    public java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition> getMethodAttributeLayouts() {
            r1 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r0 = r1.methodAttributeLayouts
            return r0
    }

    /* JADX INFO: renamed from: lambda$addAttributeDefinitions$0$org-apache-commons-compress-harmony-pack200-AttributeDefinitionBands, reason: not valid java name */
    /* synthetic */ void m2551xf1e974a(int[] r3, int r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            r0 = 0
            r3 = r3[r0]
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition r0 = new org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPUTF8 r5 = r1.getCPUtf8(r5)
            org.apache.commons.compress.harmony.pack200.CpBands r1 = r2.cpBands
            org.apache.commons.compress.harmony.pack200.CPUTF8 r6 = r1.getCPUtf8(r6)
            r0.<init>(r3, r4, r5, r6)
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r3 = r2.attributeDefinitions
            r3.add(r0)
            if (r4 == 0) goto L37
            r3 = 1
            if (r4 == r3) goto L31
            r3 = 2
            if (r4 == r3) goto L2b
            r3 = 3
            if (r4 == r3) goto L25
            goto L3c
        L25:
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r3 = r2.codeAttributeLayouts
            r3.add(r0)
            goto L3c
        L2b:
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r3 = r2.methodAttributeLayouts
            r3.add(r0)
            goto L3c
        L31:
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r3 = r2.fieldAttributeLayouts
            r3.add(r0)
            goto L3c
        L37:
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r3 = r2.classAttributeLayouts
            r3.add(r0)
        L3c:
            return
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(java.io.OutputStream r11) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r10 = this;
            java.lang.String r0 = "Writing attribute definition bands..."
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r0 = r10.attributeDefinitions
            int r0 = r0.size()
            int[] r1 = new int[r0]
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r2 = r10.attributeDefinitions
            int r2 = r2.size()
            int[] r3 = new int[r2]
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r4 = r10.attributeDefinitions
            int r4 = r4.size()
            int[] r5 = new int[r4]
            r6 = 0
        L1e:
            if (r6 >= r4) goto L46
            java.util.List<org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition> r7 = r10.attributeDefinitions
            java.lang.Object r7 = r7.get(r6)
            org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands$AttributeDefinition r7 = (org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands.AttributeDefinition) r7
            int r8 = r7.contextType
            int r9 = r7.index
            int r9 = r9 + 1
            int r9 = r9 << 2
            r8 = r8 | r9
            r1[r6] = r8
            org.apache.commons.compress.harmony.pack200.CPUTF8 r8 = r7.name
            int r8 = r8.getIndex()
            r3[r6] = r8
            org.apache.commons.compress.harmony.pack200.CPUTF8 r7 = r7.layout
            int r7 = r7.getIndex()
            r5[r6] = r7
            int r6 = r6 + 1
            goto L1e
        L46:
            java.lang.String r6 = "attributeDefinitionHeader"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            byte[] r1 = r10.encodeBandInt(r6, r1, r7)
            r11.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Wrote "
            r6.<init>(r7)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.String r6 = " bytes from attributeDefinitionHeader["
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.lang.String r0 = "attributeDefinitionName"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r6 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r10.encodeBandInt(r0, r3, r6)
            r11.write(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r7)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " bytes from attributeDefinitionName["
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.lang.String r0 = "attributeDefinitionLayout"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r0 = r10.encodeBandInt(r0, r5, r2)
            r11.write(r0)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r7)
            int r0 = r0.length
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.String r0 = " bytes from attributeDefinitionLayout["
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.StringBuilder r11 = r11.append(r4)
            java.lang.StringBuilder r11 = r11.append(r1)
            java.lang.String r11 = r11.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r11)
            return
    }
}
