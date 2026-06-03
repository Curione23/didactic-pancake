package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class AttrDefinitionBands extends org.apache.commons.compress.harmony.unpack200.BandSet {
    private int[] attributeDefinitionHeader;
    private java.lang.String[] attributeDefinitionLayout;
    private org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap attributeDefinitionMap;
    private java.lang.String[] attributeDefinitionName;
    private final java.lang.String[] cpUTF8;

    public AttrDefinitionBands(org.apache.commons.compress.harmony.unpack200.Segment r1) {
            r0 = this;
            r0.<init>(r1)
            org.apache.commons.compress.harmony.unpack200.CpBands r1 = r1.getCpBands()
            java.lang.String[] r1 = r1.getCpUTF8()
            r0.cpUTF8 = r1
            return
    }

    private void setupDefaultAttributeNames() {
            r2 = this;
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "AnnotationDefault"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute.setAttributeName(r0)
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "Code"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute.setAttributeName(r0)
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "ConstantValue"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute.setAttributeName(r0)
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "Deprecated"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute.setAttributeName(r0)
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "EnclosingMethod"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute.setAttributeName(r0)
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "Exceptions"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute.setAttributeName(r0)
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "InnerClasses"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute.setAttributeName(r0)
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "LineNumberTable"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute.setAttributeName(r0)
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "LocalVariableTable"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute.setAttributeName(r0)
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "LocalVariableTypeTable"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute.setAttributeName(r0)
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "Signature"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute.setAttributeName(r0)
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "SourceFile"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute.setAttributeName(r0)
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.MetadataBandGroup.setRvaAttributeName(r0)
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.MetadataBandGroup.setRiaAttributeName(r0)
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "RuntimeVisibleParameterAnnotations"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.MetadataBandGroup.setRvpaAttributeName(r0)
            org.apache.commons.compress.harmony.unpack200.Segment r0 = r2.segment
            org.apache.commons.compress.harmony.unpack200.CpBands r0 = r0.getCpBands()
            java.lang.String r1 = "RuntimeInvisibleParameterAnnotations"
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r0.cpUTF8Value(r1)
            org.apache.commons.compress.harmony.unpack200.MetadataBandGroup.setRipaAttributeName(r0)
            return
    }

    public org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap getAttributeDefinitionMap() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r0 = r1.attributeDefinitionMap
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void read(java.io.InputStream r10) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r9 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r0 = r9.header
            int r0 = r0.getAttributeDefinitionCount()
            java.lang.String r1 = "attr_definition_headers"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            int[] r1 = r9.decodeBandInt(r1, r10, r2, r0)
            r9.attributeDefinitionHeader = r1
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String[] r6 = r9.cpUTF8
            java.lang.String r2 = "attr_definition_name"
            r1 = r9
            r3 = r10
            r5 = r0
            java.lang.String[] r1 = r1.parseReferences(r2, r3, r4, r5, r6)
            r9.attributeDefinitionName = r1
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            java.lang.String[] r6 = r9.cpUTF8
            java.lang.String r2 = "attr_definition_layout"
            r1 = r9
            java.lang.String[] r10 = r1.parseReferences(r2, r3, r4, r5, r6)
            r9.attributeDefinitionLayout = r10
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r10 = new org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap
            r10.<init>()
            r9.attributeDefinitionMap = r10
            org.apache.commons.compress.harmony.unpack200.Segment r10 = r9.segment
            org.apache.commons.compress.harmony.unpack200.SegmentHeader r10 = r10.getSegmentHeader()
            org.apache.commons.compress.harmony.unpack200.SegmentOptions r10 = r10.getOptions()
            boolean r10 = r10.hasClassFlagsHi()
            if (r10 == 0) goto L46
            r10 = 63
            goto L48
        L46:
            r10 = 32
        L48:
            r1 = 0
        L49:
            if (r1 >= r0) goto L7c
            int[] r2 = r9.attributeDefinitionHeader
            r2 = r2[r1]
            r5 = r2 & 3
            int r2 = r2 >> 2
            int r2 = r2 + (-1)
            r3 = -1
            if (r2 != r3) goto L5d
            int r2 = r10 + 1
            r7 = r10
            r10 = r2
            goto L5e
        L5d:
            r7 = r2
        L5e:
            org.apache.commons.compress.harmony.unpack200.AttributeLayout r2 = new org.apache.commons.compress.harmony.unpack200.AttributeLayout
            java.lang.String[] r3 = r9.attributeDefinitionName
            r4 = r3[r1]
            java.lang.String[] r3 = r9.attributeDefinitionLayout
            r6 = r3[r1]
            r8 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            org.apache.commons.compress.harmony.unpack200.NewAttributeBands r3 = new org.apache.commons.compress.harmony.unpack200.NewAttributeBands
            org.apache.commons.compress.harmony.unpack200.Segment r4 = r9.segment
            r3.<init>(r4, r2)
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r4 = r9.attributeDefinitionMap
            r4.add(r2, r3)
            int r1 = r1 + 1
            goto L49
        L7c:
            org.apache.commons.compress.harmony.unpack200.AttributeLayoutMap r10 = r9.attributeDefinitionMap
            r10.checkMap()
            r9.setupDefaultAttributeNames()
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void unpack() throws org.apache.commons.compress.harmony.pack200.Pack200Exception, java.io.IOException {
            r0 = this;
            return
    }
}
