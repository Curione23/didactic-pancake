package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class CpBands extends org.apache.commons.compress.harmony.pack200.BandSet {
    private final java.util.Set<org.apache.commons.compress.harmony.pack200.CPClass> cp_Class;
    private final java.util.Set<org.apache.commons.compress.harmony.pack200.CPNameAndType> cp_Descr;
    private final java.util.Set<org.apache.commons.compress.harmony.pack200.CPDouble> cp_Double;
    private final java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> cp_Field;
    private final java.util.Set<org.apache.commons.compress.harmony.pack200.CPFloat> cp_Float;
    private final java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> cp_Imethod;
    private final java.util.Set<org.apache.commons.compress.harmony.pack200.CPInt> cp_Int;
    private final java.util.Set<org.apache.commons.compress.harmony.pack200.CPLong> cp_Long;
    private final java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> cp_Method;
    private final java.util.Set<org.apache.commons.compress.harmony.pack200.CPSignature> cp_Signature;
    private final java.util.Set<org.apache.commons.compress.harmony.pack200.CPString> cp_String;
    private final java.util.Set<org.apache.commons.compress.harmony.pack200.CPUTF8> cp_Utf8;
    private final java.util.Set<java.lang.String> defaultAttributeNames;
    private final java.util.Map<java.lang.Object, org.apache.commons.compress.harmony.pack200.CPConstant<?>> objectsToCPConstant;
    private final org.apache.commons.compress.harmony.pack200.Segment segment;
    private final java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPClass> stringsToCpClass;
    private final java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPMethodOrField> stringsToCpField;
    private final java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPMethodOrField> stringsToCpIMethod;
    private final java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPMethodOrField> stringsToCpMethod;
    private final java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPNameAndType> stringsToCpNameAndType;
    private final java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPSignature> stringsToCpSignature;
    private final java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPUTF8> stringsToCpUtf8;

    public CpBands(org.apache.commons.compress.harmony.pack200.Segment r2, int r3) {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r2.getSegmentHeader()
            r1.<init>(r3, r0)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r1.defaultAttributeNames = r3
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1.cp_Utf8 = r0
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1.cp_Int = r0
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1.cp_Float = r0
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1.cp_Long = r0
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1.cp_Double = r0
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1.cp_String = r0
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1.cp_Class = r0
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1.cp_Signature = r0
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1.cp_Descr = r0
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1.cp_Field = r0
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1.cp_Method = r0
            java.util.TreeSet r0 = new java.util.TreeSet
            r0.<init>()
            r1.cp_Imethod = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.stringsToCpUtf8 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.stringsToCpNameAndType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.stringsToCpClass = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.stringsToCpSignature = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.stringsToCpMethod = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.stringsToCpField = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.stringsToCpIMethod = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.objectsToCPConstant = r0
            r1.segment = r2
            java.lang.String r2 = "AnnotationDefault"
            r3.add(r2)
            java.lang.String r2 = "RuntimeVisibleAnnotations"
            r3.add(r2)
            java.lang.String r2 = "RuntimeInvisibleAnnotations"
            r3.add(r2)
            java.lang.String r2 = "RuntimeVisibleParameterAnnotations"
            r3.add(r2)
            java.lang.String r2 = "RuntimeInvisibleParameterAnnotations"
            r3.add(r2)
            java.lang.String r2 = "Code"
            r3.add(r2)
            java.lang.String r2 = "LineNumberTable"
            r3.add(r2)
            java.lang.String r2 = "LocalVariableTable"
            r3.add(r2)
            java.lang.String r2 = "LocalVariableTypeTable"
            r3.add(r2)
            java.lang.String r2 = "ConstantValue"
            r3.add(r2)
            java.lang.String r2 = "Deprecated"
            r3.add(r2)
            java.lang.String r2 = "EnclosingMethod"
            r3.add(r2)
            java.lang.String r2 = "Exceptions"
            r3.add(r2)
            java.lang.String r2 = "InnerClasses"
            r3.add(r2)
            java.lang.String r2 = "Signature"
            r3.add(r2)
            java.lang.String r2 = "SourceFile"
            r3.add(r2)
            return
    }

    private void addCharacters(java.util.List<java.lang.Character> r4, char[] r5) {
            r3 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            char r2 = r5[r1]
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r4.add(r2)
            int r1 = r1 + 1
            goto L2
        L10:
            return
    }

    private void addIndices() {
            r6 = this;
            r0 = 12
            java.util.Set[] r0 = new java.util.Set[r0]
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPUTF8> r1 = r6.cp_Utf8
            r2 = 0
            r0[r2] = r1
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPInt> r1 = r6.cp_Int
            r3 = 1
            r0[r3] = r1
            r1 = 2
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPFloat> r4 = r6.cp_Float
            r0[r1] = r4
            r1 = 3
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPLong> r4 = r6.cp_Long
            r0[r1] = r4
            r1 = 4
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPDouble> r4 = r6.cp_Double
            r0[r1] = r4
            r1 = 5
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPString> r4 = r6.cp_String
            r0[r1] = r4
            r1 = 6
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPClass> r4 = r6.cp_Class
            r0[r1] = r4
            r1 = 7
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPSignature> r4 = r6.cp_Signature
            r0[r1] = r4
            r1 = 8
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPNameAndType> r4 = r6.cp_Descr
            r0[r1] = r4
            r1 = 9
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r4 = r6.cp_Field
            r0[r1] = r4
            r1 = 10
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r4 = r6.cp_Method
            r0[r1] = r4
            r1 = 11
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r4 = r6.cp_Imethod
            r0[r1] = r4
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r0.next()
            java.util.Set r1 = (java.util.Set) r1
            java.util.Iterator r1 = r1.iterator()
            r4 = r2
        L5d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L4c
            java.lang.Object r5 = r1.next()
            org.apache.commons.compress.harmony.pack200.ConstantPoolEntry r5 = (org.apache.commons.compress.harmony.pack200.ConstantPoolEntry) r5
            r5.setIndex(r4)
            int r4 = r4 + r3
            goto L5d
        L6e:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r1 = r6.cp_Field
            org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda1 r2 = new org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda1
            r2.<init>(r0)
            r1.forEach(r2)
            r0.clear()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r2 = r6.cp_Method
            org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda2 r3 = new org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda2
            r3.<init>(r0, r1)
            r2.forEach(r3)
            return
    }

    static /* synthetic */ void lambda$addIndices$0(java.util.Map r3, org.apache.commons.compress.harmony.pack200.CPMethodOrField r4) {
            org.apache.commons.compress.harmony.pack200.CPClass r0 = r4.getClassName()
            java.lang.Object r1 = r3.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 1
            if (r1 != 0) goto L19
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r3.put(r0, r1)
            r3 = 0
            r4.setIndexInClass(r3)
            goto L28
        L19:
            int r1 = r1.intValue()
            r4.setIndexInClass(r1)
            int r1 = r1 + r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3.put(r0, r4)
        L28:
            return
    }

    static /* synthetic */ void lambda$addIndices$1(java.util.Map r5, java.util.Map r6, org.apache.commons.compress.harmony.pack200.CPMethodOrField r7) {
            org.apache.commons.compress.harmony.pack200.CPClass r0 = r7.getClassName()
            java.lang.Object r1 = r5.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r1 != 0) goto L19
            r5.put(r0, r4)
            r7.setIndexInClass(r2)
            goto L28
        L19:
            int r1 = r1.intValue()
            r7.setIndexInClass(r1)
            int r1 = r1 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.put(r0, r1)
        L28:
            org.apache.commons.compress.harmony.pack200.CPNameAndType r5 = r7.getDesc()
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "<init>"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L56
            java.lang.Object r5 = r6.get(r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L47
            r6.put(r0, r4)
            r7.setIndexInClassForConstructor(r2)
            goto L56
        L47:
            int r5 = r5.intValue()
            r7.setIndexInClassForConstructor(r5)
            int r5 = r5 + r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.put(r0, r5)
        L56:
            return
    }

    static /* synthetic */ int lambda$writeCpSignature$3(java.util.List r0, int r1) {
            java.lang.Object r0 = r0.get(r1)
            org.apache.commons.compress.harmony.pack200.CPClass r0 = (org.apache.commons.compress.harmony.pack200.CPClass) r0
            int r0 = r0.getIndex()
            return r0
    }

    static /* synthetic */ int lambda$writeCpUtf8$4(java.util.List r0, int r1) {
            java.lang.Object r0 = r0.get(r1)
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            return r0
    }

    static /* synthetic */ int lambda$writeCpUtf8$5(java.util.List r0, int r1) {
            r1 = 0
            java.lang.Object r0 = r0.remove(r1)
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            return r0
    }

    private void removeCpUtf8(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPUTF8> r0 = r2.stringsToCpUtf8
            java.lang.Object r0 = r0.get(r3)
            org.apache.commons.compress.harmony.pack200.CPUTF8 r0 = (org.apache.commons.compress.harmony.pack200.CPUTF8) r0
            if (r0 == 0) goto L1c
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPClass> r1 = r2.stringsToCpClass
            java.lang.Object r1 = r1.get(r3)
            if (r1 != 0) goto L1c
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPUTF8> r1 = r2.stringsToCpUtf8
            r1.remove(r3)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPUTF8> r3 = r2.cp_Utf8
            r3.remove(r0)
        L1c:
            return
    }

    private void removeSignaturesFromCpUTF8() {
            r2 = this;
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPSignature> r0 = r2.cp_Signature
            org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda0
            r1.<init>(r2)
            r0.forEach(r1)
            return
    }

    private void writeCpClass(java.io.OutputStream r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Writing "
            r0.<init>(r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPClass> r1 = r5.cp_Class
            int r1 = r1.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " Class entries..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPClass> r0 = r5.cp_Class
            int r0 = r0.size()
            int[] r1 = new int[r0]
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPClass> r2 = r5.cp_Class
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L2d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r2.next()
            org.apache.commons.compress.harmony.pack200.CPClass r4 = (org.apache.commons.compress.harmony.pack200.CPClass) r4
            int r4 = r4.getIndexInCpUtf8()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L2d
        L42:
            java.lang.String r2 = "cpClass"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            byte[] r1 = r5.encodeBandInt(r2, r1, r3)
            r6.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrote "
            r6.<init>(r2)
            int r1 = r1.length
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r1 = " bytes from cpClass["
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = "]"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r6)
            return
    }

    private void writeCpDescr(java.io.OutputStream r9) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Writing "
            r0.<init>(r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPNameAndType> r1 = r8.cp_Descr
            int r1 = r1.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " Descriptor entries..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPNameAndType> r0 = r8.cp_Descr
            int r0 = r0.size()
            int[] r1 = new int[r0]
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPNameAndType> r2 = r8.cp_Descr
            int r2 = r2.size()
            int[] r3 = new int[r2]
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPNameAndType> r4 = r8.cp_Descr
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L35:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L50
            java.lang.Object r6 = r4.next()
            org.apache.commons.compress.harmony.pack200.CPNameAndType r6 = (org.apache.commons.compress.harmony.pack200.CPNameAndType) r6
            int r7 = r6.getNameIndex()
            r1[r5] = r7
            int r6 = r6.getTypeIndex()
            r3[r5] = r6
            int r5 = r5 + 1
            goto L35
        L50:
            java.lang.String r4 = "cp_Descr_Name"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            byte[] r1 = r8.encodeBandInt(r4, r1, r5)
            r9.write(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Wrote "
            r4.<init>(r5)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r4 = " bytes from cp_Descr_Name["
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.lang.String r0 = "cp_Descr_Type"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            byte[] r0 = r8.encodeBandInt(r0, r3, r4)
            r9.write(r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r5)
            int r0 = r0.length
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r0 = " bytes from cp_Descr_Type["
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.StringBuilder r9 = r9.append(r2)
            java.lang.StringBuilder r9 = r9.append(r1)
            java.lang.String r9 = r9.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r9)
            return
    }

    private void writeCpDouble(java.io.OutputStream r11) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Writing "
            r0.<init>(r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPDouble> r1 = r10.cp_Double
            int r1 = r1.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " Double entries..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPDouble> r0 = r10.cp_Double
            int r0 = r0.size()
            int[] r1 = new int[r0]
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPDouble> r2 = r10.cp_Double
            int r2 = r2.size()
            int[] r3 = new int[r2]
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPDouble> r4 = r10.cp_Double
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L35:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L56
            java.lang.Object r6 = r4.next()
            org.apache.commons.compress.harmony.pack200.CPDouble r6 = (org.apache.commons.compress.harmony.pack200.CPDouble) r6
            double r6 = r6.getDouble()
            long r6 = java.lang.Double.doubleToLongBits(r6)
            r8 = 32
            long r8 = r6 >> r8
            int r8 = (int) r8
            r1[r5] = r8
            int r6 = (int) r6
            r3[r5] = r6
            int r5 = r5 + 1
            goto L35
        L56:
            java.lang.String r4 = "cp_Double_hi"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            byte[] r1 = r10.encodeBandInt(r4, r1, r5)
            r11.write(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Wrote "
            r4.<init>(r5)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r4 = " bytes from cp_Double_hi["
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.lang.String r0 = "cp_Double_lo"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            byte[] r0 = r10.encodeBandInt(r0, r3, r4)
            r11.write(r0)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r5)
            int r0 = r0.length
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.String r0 = " bytes from cp_Double_lo["
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.StringBuilder r11 = r11.append(r2)
            java.lang.StringBuilder r11 = r11.append(r1)
            java.lang.String r11 = r11.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r11)
            return
    }

    private void writeCpFloat(java.io.OutputStream r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Writing "
            r0.<init>(r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPFloat> r1 = r5.cp_Float
            int r1 = r1.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " Float entries..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPFloat> r0 = r5.cp_Float
            int r0 = r0.size()
            int[] r1 = new int[r0]
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPFloat> r2 = r5.cp_Float
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L2d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L46
            java.lang.Object r4 = r2.next()
            org.apache.commons.compress.harmony.pack200.CPFloat r4 = (org.apache.commons.compress.harmony.pack200.CPFloat) r4
            float r4 = r4.getFloat()
            int r4 = java.lang.Float.floatToIntBits(r4)
            r1[r3] = r4
            int r3 = r3 + 1
            goto L2d
        L46:
            java.lang.String r2 = "cp_Float"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            byte[] r1 = r5.encodeBandInt(r2, r1, r3)
            r6.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrote "
            r6.<init>(r2)
            int r1 = r1.length
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r1 = " bytes from cp_Float["
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = "]"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r6)
            return
    }

    private void writeCpInt(java.io.OutputStream r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Writing "
            r0.<init>(r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPInt> r1 = r5.cp_Int
            int r1 = r1.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " Integer entries..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPInt> r0 = r5.cp_Int
            int r0 = r0.size()
            int[] r1 = new int[r0]
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPInt> r2 = r5.cp_Int
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L2d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r2.next()
            org.apache.commons.compress.harmony.pack200.CPInt r4 = (org.apache.commons.compress.harmony.pack200.CPInt) r4
            int r4 = r4.getInt()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L2d
        L42:
            java.lang.String r2 = "cp_Int"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            byte[] r1 = r5.encodeBandInt(r2, r1, r3)
            r6.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrote "
            r6.<init>(r2)
            int r1 = r1.length
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r1 = " bytes from cp_Int["
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = "]"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r6)
            return
    }

    private void writeCpLong(java.io.OutputStream r11) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Writing "
            r0.<init>(r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPLong> r1 = r10.cp_Long
            int r1 = r1.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " Long entries..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPLong> r0 = r10.cp_Long
            int r0 = r0.size()
            int[] r1 = new int[r0]
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPLong> r2 = r10.cp_Long
            int r2 = r2.size()
            int[] r3 = new int[r2]
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPLong> r4 = r10.cp_Long
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L35:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L52
            java.lang.Object r6 = r4.next()
            org.apache.commons.compress.harmony.pack200.CPLong r6 = (org.apache.commons.compress.harmony.pack200.CPLong) r6
            long r6 = r6.getLong()
            r8 = 32
            long r8 = r6 >> r8
            int r8 = (int) r8
            r1[r5] = r8
            int r6 = (int) r6
            r3[r5] = r6
            int r5 = r5 + 1
            goto L35
        L52:
            java.lang.String r4 = "cp_Long_hi"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            byte[] r1 = r10.encodeBandInt(r4, r1, r5)
            r11.write(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Wrote "
            r4.<init>(r5)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.String r4 = " bytes from cp_Long_hi["
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.lang.String r0 = "cp_Long_lo"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            byte[] r0 = r10.encodeBandInt(r0, r3, r4)
            r11.write(r0)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r5)
            int r0 = r0.length
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.String r0 = " bytes from cp_Long_lo["
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.StringBuilder r11 = r11.append(r2)
            java.lang.StringBuilder r11 = r11.append(r1)
            java.lang.String r11 = r11.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r11)
            return
    }

    private void writeCpMethodOrField(java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r8, java.io.OutputStream r9, java.lang.String r10) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Writing "
            r0.<init>(r1)
            int r1 = r8.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " Method and Field entries..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            int r0 = r8.size()
            int[] r1 = new int[r0]
            int r2 = r8.size()
            int[] r3 = new int[r2]
            java.util.Iterator r8 = r8.iterator()
            r4 = 0
        L2d:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L48
            java.lang.Object r5 = r8.next()
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r5 = (org.apache.commons.compress.harmony.pack200.CPMethodOrField) r5
            int r6 = r5.getClassIndex()
            r1[r4] = r6
            int r5 = r5.getDescIndex()
            r3[r4] = r5
            int r4 = r4 + 1
            goto L2d
        L48:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r4 = "_class"
            java.lang.StringBuilder r8 = r8.append(r4)
            java.lang.String r8 = r8.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r4 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            byte[] r8 = r7.encodeBandInt(r8, r1, r4)
            r9.write(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Wrote "
            r1.<init>(r4)
            int r8 = r8.length
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r1 = " bytes from "
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r5 = "_class["
            java.lang.StringBuilder r8 = r8.append(r5)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r0 = "]"
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r5 = "_desc"
            java.lang.StringBuilder r8 = r8.append(r5)
            java.lang.String r8 = r8.toString()
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            byte[] r8 = r7.encodeBandInt(r8, r3, r5)
            r9.write(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r4)
            int r8 = r8.length
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r9 = "_desc["
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r8)
            return
    }

    private void writeCpSignature(java.io.OutputStream r8) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Writing "
            r0.<init>(r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPSignature> r1 = r7.cp_Signature
            int r1 = r1.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " Signature entries..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPSignature> r0 = r7.cp_Signature
            int r0 = r0.size()
            int[] r1 = new int[r0]
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPSignature> r3 = r7.cp_Signature
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L32:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r3.next()
            org.apache.commons.compress.harmony.pack200.CPSignature r5 = (org.apache.commons.compress.harmony.pack200.CPSignature) r5
            java.util.List r6 = r5.getClasses()
            r2.addAll(r6)
            int r5 = r5.getIndexInCpUtf8()
            r1[r4] = r5
            int r4 = r4 + 1
            goto L32
        L4e:
            int r3 = r2.size()
            int[] r4 = new int[r3]
            org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda3 r5 = new org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda3
            r5.<init>(r2)
            java.util.Arrays.setAll(r4, r5)
            java.lang.String r2 = "cpSignatureForm"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r5 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            byte[] r1 = r7.encodeBandInt(r2, r1, r5)
            r8.write(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Wrote "
            r2.<init>(r5)
            int r1 = r1.length
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " bytes from cpSignatureForm["
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.lang.String r0 = "cpSignatureClasses"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r2 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            byte[] r0 = r7.encodeBandInt(r0, r4, r2)
            r8.write(r0)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r5)
            int r0 = r0.length
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r0 = " bytes from cpSignatureClasses["
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r8 = r8.append(r3)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r8 = r8.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r8)
            return
    }

    private void writeCpString(java.io.OutputStream r6) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Writing "
            r0.<init>(r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPString> r1 = r5.cp_String
            int r1 = r1.size()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " String entries..."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPString> r0 = r5.cp_String
            int r0 = r0.size()
            int[] r1 = new int[r0]
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPString> r2 = r5.cp_String
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L2d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r2.next()
            org.apache.commons.compress.harmony.pack200.CPString r4 = (org.apache.commons.compress.harmony.pack200.CPString) r4
            int r4 = r4.getIndexInCpUtf8()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L2d
        L42:
            java.lang.String r2 = "cpString"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.UDELTA5
            byte[] r1 = r5.encodeBandInt(r2, r1, r3)
            r6.write(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Wrote "
            r6.<init>(r2)
            int r1 = r1.length
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r1 = " bytes from cpString["
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = "]"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r6)
            return
    }

    private void writeCpUtf8(java.io.OutputStream r20) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Writing "
            r2.<init>(r3)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPUTF8> r3 = r0.cp_Utf8
            int r3 = r3.size()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " UTF8 entries..."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r2)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPUTF8> r2 = r0.cp_Utf8
            int r2 = r2.size()
            r3 = 2
            int r2 = r2 - r3
            int[] r4 = new int[r2]
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPUTF8> r5 = r0.cp_Utf8
            int r5 = r5.size()
            r6 = 1
            int r5 = r5 - r6
            int[] r7 = new int[r5]
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPUTF8> r11 = r0.cp_Utf8
            java.lang.Object[] r11 = r11.toArray()
            r6 = r11[r6]
            org.apache.commons.compress.harmony.pack200.CPUTF8 r6 = (org.apache.commons.compress.harmony.pack200.CPUTF8) r6
            java.lang.String r6 = r6.getUnderlyingString()
            int r12 = r6.length()
            r13 = 0
            r7[r13] = r12
            char[] r6 = r6.toCharArray()
            r0.addCharacters(r8, r6)
        L61:
            int r6 = r11.length
            if (r3 >= r6) goto Lc5
            int r6 = r3 + (-1)
            r12 = r11[r6]
            org.apache.commons.compress.harmony.pack200.CPUTF8 r12 = (org.apache.commons.compress.harmony.pack200.CPUTF8) r12
            java.lang.String r12 = r12.getUnderlyingString()
            char[] r12 = r12.toCharArray()
            r14 = r11[r3]
            org.apache.commons.compress.harmony.pack200.CPUTF8 r14 = (org.apache.commons.compress.harmony.pack200.CPUTF8) r14
            java.lang.String r14 = r14.getUnderlyingString()
            char[] r15 = r14.toCharArray()
            r17 = r5
            r16 = r11
            r11 = r13
        L83:
            int r5 = r12.length
            if (r13 >= r5) goto L96
            char r5 = r12[r13]
            r18 = r12
            char r12 = r15[r13]
            if (r5 == r12) goto L8f
            goto L96
        L8f:
            int r11 = r11 + 1
            int r13 = r13 + 1
            r12 = r18
            goto L83
        L96:
            int r5 = r3 + (-2)
            r4[r5] = r11
            java.lang.String r5 = r14.substring(r11)
            char[] r5 = r5.toCharArray()
            int r11 = r5.length
            r12 = 1000(0x3e8, float:1.401E-42)
            if (r11 <= r12) goto Lb6
            r11 = 0
            r7[r6] = r11
            int r6 = r5.length
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.add(r6)
            r0.addCharacters(r10, r5)
            goto Lbd
        Lb6:
            r11 = 0
            int r12 = r5.length
            r7[r6] = r12
            r0.addCharacters(r8, r5)
        Lbd:
            int r3 = r3 + 1
            r13 = r11
            r11 = r16
            r5 = r17
            goto L61
        Lc5:
            r17 = r5
            r11 = r13
            int r3 = r8.size()
            int[] r5 = new int[r3]
            int r6 = r9.size()
            int[] r12 = new int[r6]
            int r13 = r9.size()
            int[][] r14 = new int[r13][]
            org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda4 r15 = new org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda4
            r15.<init>(r8)
            java.util.Arrays.setAll(r5, r15)
            r8 = r11
        Le3:
            if (r8 >= r6) goto L101
            java.lang.Object r15 = r9.get(r8)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r12[r8] = r15
            int[] r15 = new int[r15]
            r14[r8] = r15
            org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda5 r11 = new org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda5
            r11.<init>(r10)
            java.util.Arrays.setAll(r15, r11)
            int r8 = r8 + 1
            r11 = 0
            goto Le3
        L101:
            java.lang.String r8 = "cpUtf8Prefix"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r9 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            byte[] r4 = r0.encodeBandInt(r8, r4, r9)
            r1.write(r4)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Wrote "
            r8.<init>(r9)
            int r4 = r4.length
            java.lang.StringBuilder r4 = r8.append(r4)
            java.lang.String r8 = " bytes from cpUtf8Prefix["
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = "]"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r2)
            java.lang.String r2 = "cpUtf8Suffix"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r8 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            byte[] r2 = r0.encodeBandInt(r2, r7, r8)
            r1.write(r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r9)
            int r2 = r2.length
            java.lang.StringBuilder r2 = r7.append(r2)
            java.lang.String r7 = " bytes from cpUtf8Suffix["
            java.lang.StringBuilder r2 = r2.append(r7)
            r7 = r17
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r2)
            java.lang.String r2 = "cpUtf8Chars"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r7 = org.apache.commons.compress.harmony.pack200.Codec.CHAR3
            byte[] r2 = r0.encodeBandInt(r2, r5, r7)
            r1.write(r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r9)
            int r2 = r2.length
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.String r5 = " bytes from cpUtf8Chars["
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r2)
            java.lang.String r2 = "cpUtf8BigSuffix"
            org.apache.commons.compress.harmony.pack200.BHSDCodec r3 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            byte[] r2 = r0.encodeBandInt(r2, r12, r3)
            r1.write(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r9)
            int r2 = r2.length
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = " bytes from cpUtf8BigSuffix["
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r2)
            r2 = 0
        L1b0:
            if (r2 >= r13) goto L1fb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "cpUtf8BigChars "
            r3.<init>(r5)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            r5 = r14[r2]
            org.apache.commons.compress.harmony.pack200.BHSDCodec r6 = org.apache.commons.compress.harmony.pack200.Codec.DELTA5
            byte[] r3 = r0.encodeBandInt(r3, r5, r6)
            r1.write(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r9)
            int r3 = r3.length
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r5 = " bytes from cpUtf8BigChars"
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r5 = "["
            java.lang.StringBuilder r3 = r3.append(r5)
            r5 = r14[r2]
            int r5 = r5.length
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r3)
            int r2 = r2 + 1
            goto L1b0
        L1fb:
            return
    }

    public void addCPClass(java.lang.String r1) {
            r0 = this;
            r0.getCPClass(r1)
            return
    }

    void addCPUtf8(java.lang.String r1) {
            r0 = this;
            r0.getCPUtf8(r1)
            return
    }

    public boolean existsCpClass(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPClass> r0 = r1.stringsToCpClass
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    public void finaliseBands() {
            r2 = this;
            java.lang.String r0 = ""
            r2.addCPUtf8(r0)
            r2.removeSignaturesFromCpUTF8()
            r2.addIndices()
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r2.segmentHeader
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPUTF8> r1 = r2.cp_Utf8
            int r1 = r1.size()
            r0.setCp_Utf8_count(r1)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r2.segmentHeader
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPInt> r1 = r2.cp_Int
            int r1 = r1.size()
            r0.setCp_Int_count(r1)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r2.segmentHeader
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPFloat> r1 = r2.cp_Float
            int r1 = r1.size()
            r0.setCp_Float_count(r1)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r2.segmentHeader
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPLong> r1 = r2.cp_Long
            int r1 = r1.size()
            r0.setCp_Long_count(r1)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r2.segmentHeader
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPDouble> r1 = r2.cp_Double
            int r1 = r1.size()
            r0.setCp_Double_count(r1)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r2.segmentHeader
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPString> r1 = r2.cp_String
            int r1 = r1.size()
            r0.setCp_String_count(r1)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r2.segmentHeader
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPClass> r1 = r2.cp_Class
            int r1 = r1.size()
            r0.setCp_Class_count(r1)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r2.segmentHeader
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPSignature> r1 = r2.cp_Signature
            int r1 = r1.size()
            r0.setCp_Signature_count(r1)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r2.segmentHeader
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPNameAndType> r1 = r2.cp_Descr
            int r1 = r1.size()
            r0.setCp_Descr_count(r1)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r2.segmentHeader
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r1 = r2.cp_Field
            int r1 = r1.size()
            r0.setCp_Field_count(r1)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r2.segmentHeader
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r1 = r2.cp_Method
            int r1 = r1.size()
            r0.setCp_Method_count(r1)
            org.apache.commons.compress.harmony.pack200.SegmentHeader r0 = r2.segmentHeader
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r1 = r2.cp_Imethod
            int r1 = r1.size()
            r0.setCp_Imethod_count(r1)
            return
    }

    public org.apache.commons.compress.harmony.pack200.CPClass getCPClass(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            r0 = 46
            r1 = 47
            java.lang.String r3 = r3.replace(r0, r1)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPClass> r0 = r2.stringsToCpClass
            java.lang.Object r0 = r0.get(r3)
            org.apache.commons.compress.harmony.pack200.CPClass r0 = (org.apache.commons.compress.harmony.pack200.CPClass) r0
            if (r0 != 0) goto L2a
            org.apache.commons.compress.harmony.pack200.CPUTF8 r0 = r2.getCPUtf8(r3)
            org.apache.commons.compress.harmony.pack200.CPClass r1 = new org.apache.commons.compress.harmony.pack200.CPClass
            r1.<init>(r0)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPClass> r0 = r2.cp_Class
            r0.add(r1)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPClass> r0 = r2.stringsToCpClass
            r0.put(r3, r1)
            r0 = r1
        L2a:
            boolean r3 = r0.isInnerClass()
            if (r3 == 0) goto L39
            org.apache.commons.compress.harmony.pack200.Segment r3 = r2.segment
            org.apache.commons.compress.harmony.pack200.ClassBands r3 = r3.getClassBands()
            r3.currentClassReferencesInnerClass(r0)
        L39:
            return r0
    }

    public org.apache.commons.compress.harmony.pack200.CPMethodOrField getCPField(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            org.apache.commons.compress.harmony.pack200.CPClass r1 = r0.getCPClass(r1)
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r1 = r0.getCPField(r1, r2, r3)
            return r1
    }

    public org.apache.commons.compress.harmony.pack200.CPMethodOrField getCPField(org.apache.commons.compress.harmony.pack200.CPClass r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPMethodOrField> r1 = r2.stringsToCpField
            java.lang.Object r1 = r1.get(r0)
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r1 = (org.apache.commons.compress.harmony.pack200.CPMethodOrField) r1
            if (r1 != 0) goto L40
            org.apache.commons.compress.harmony.pack200.CPNameAndType r4 = r2.getCPNameAndType(r4, r5)
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r1 = new org.apache.commons.compress.harmony.pack200.CPMethodOrField
            r1.<init>(r3, r4)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r3 = r2.cp_Field
            r3.add(r1)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPMethodOrField> r3 = r2.stringsToCpField
            r3.put(r0, r1)
        L40:
            return r1
    }

    public org.apache.commons.compress.harmony.pack200.CPMethodOrField getCPIMethod(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            org.apache.commons.compress.harmony.pack200.CPClass r1 = r0.getCPClass(r1)
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r1 = r0.getCPIMethod(r1, r2, r3)
            return r1
    }

    public org.apache.commons.compress.harmony.pack200.CPMethodOrField getCPIMethod(org.apache.commons.compress.harmony.pack200.CPClass r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPMethodOrField> r1 = r2.stringsToCpIMethod
            java.lang.Object r1 = r1.get(r0)
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r1 = (org.apache.commons.compress.harmony.pack200.CPMethodOrField) r1
            if (r1 != 0) goto L40
            org.apache.commons.compress.harmony.pack200.CPNameAndType r4 = r2.getCPNameAndType(r4, r5)
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r1 = new org.apache.commons.compress.harmony.pack200.CPMethodOrField
            r1.<init>(r3, r4)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r3 = r2.cp_Imethod
            r3.add(r1)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPMethodOrField> r3 = r2.stringsToCpIMethod
            r3.put(r0, r1)
        L40:
            return r1
    }

    public org.apache.commons.compress.harmony.pack200.CPMethodOrField getCPMethod(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            org.apache.commons.compress.harmony.pack200.CPClass r1 = r0.getCPClass(r1)
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r1 = r0.getCPMethod(r1, r2, r3)
            return r1
    }

    public org.apache.commons.compress.harmony.pack200.CPMethodOrField getCPMethod(org.apache.commons.compress.harmony.pack200.CPClass r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPMethodOrField> r1 = r2.stringsToCpMethod
            java.lang.Object r1 = r1.get(r0)
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r1 = (org.apache.commons.compress.harmony.pack200.CPMethodOrField) r1
            if (r1 != 0) goto L40
            org.apache.commons.compress.harmony.pack200.CPNameAndType r4 = r2.getCPNameAndType(r4, r5)
            org.apache.commons.compress.harmony.pack200.CPMethodOrField r1 = new org.apache.commons.compress.harmony.pack200.CPMethodOrField
            r1.<init>(r3, r4)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r3 = r2.cp_Method
            r3.add(r1)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPMethodOrField> r3 = r2.stringsToCpMethod
            r3.put(r0, r1)
        L40:
            return r1
    }

    public org.apache.commons.compress.harmony.pack200.CPNameAndType getCPNameAndType(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPNameAndType> r1 = r2.stringsToCpNameAndType
            java.lang.Object r1 = r1.get(r0)
            org.apache.commons.compress.harmony.pack200.CPNameAndType r1 = (org.apache.commons.compress.harmony.pack200.CPNameAndType) r1
            if (r1 != 0) goto L38
            org.apache.commons.compress.harmony.pack200.CPNameAndType r1 = new org.apache.commons.compress.harmony.pack200.CPNameAndType
            org.apache.commons.compress.harmony.pack200.CPUTF8 r3 = r2.getCPUtf8(r3)
            org.apache.commons.compress.harmony.pack200.CPSignature r4 = r2.getCPSignature(r4)
            r1.<init>(r3, r4)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPNameAndType> r3 = r2.stringsToCpNameAndType
            r3.put(r0, r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPNameAndType> r3 = r2.cp_Descr
            r3.add(r1)
        L38:
            return r1
    }

    public org.apache.commons.compress.harmony.pack200.CPSignature getCPSignature(java.lang.String r14) {
            r13 = this;
            r0 = 0
            if (r14 != 0) goto L4
            return r0
        L4:
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPSignature> r1 = r13.stringsToCpSignature
            java.lang.Object r1 = r1.get(r14)
            org.apache.commons.compress.harmony.pack200.CPSignature r1 = (org.apache.commons.compress.harmony.pack200.CPSignature) r1
            if (r1 != 0) goto Ld0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r14.length()
            r3 = 1
            if (r2 <= r3) goto Lbc
            r2 = 76
            int r4 = r14.indexOf(r2)
            r5 = -1
            if (r4 == r5) goto Lbc
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            char[] r5 = r14.toCharArray()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 0
        L32:
            int r8 = r5.length
            r9 = 47
            if (r7 >= r8) goto L74
            char r8 = r5[r7]
            r6.append(r8)
            char r8 = r5[r7]
            if (r8 != r2) goto L72
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r10 = r7 + 1
        L47:
            int r11 = r5.length
            if (r10 >= r11) goto L72
            char r11 = r5[r10]
            boolean r12 = java.lang.Character.isLetter(r11)
            if (r12 != 0) goto L6c
            boolean r12 = java.lang.Character.isDigit(r11)
            if (r12 != 0) goto L6c
            if (r11 == r9) goto L6c
            r12 = 36
            if (r11 == r12) goto L6c
            r12 = 95
            if (r11 == r12) goto L6c
            java.lang.String r7 = r8.toString()
            r4.add(r7)
            int r7 = r10 + (-1)
            goto L72
        L6c:
            r8.append(r11)
            int r10 = r10 + 1
            goto L47
        L72:
            int r7 = r7 + r3
            goto L32
        L74:
            r13.removeCpUtf8(r14)
            java.util.Iterator r2 = r4.iterator()
        L7b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb3
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lae
            r4 = 46
            java.lang.String r3 = r3.replace(r4, r9)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPClass> r4 = r13.stringsToCpClass
            java.lang.Object r4 = r4.get(r3)
            org.apache.commons.compress.harmony.pack200.CPClass r4 = (org.apache.commons.compress.harmony.pack200.CPClass) r4
            if (r4 != 0) goto Laf
            org.apache.commons.compress.harmony.pack200.CPUTF8 r4 = r13.getCPUtf8(r3)
            org.apache.commons.compress.harmony.pack200.CPClass r5 = new org.apache.commons.compress.harmony.pack200.CPClass
            r5.<init>(r4)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPClass> r4 = r13.cp_Class
            r4.add(r5)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPClass> r4 = r13.stringsToCpClass
            r4.put(r3, r5)
            r4 = r5
            goto Laf
        Lae:
            r4 = r0
        Laf:
            r1.add(r4)
            goto L7b
        Lb3:
            java.lang.String r0 = r6.toString()
            org.apache.commons.compress.harmony.pack200.CPUTF8 r0 = r13.getCPUtf8(r0)
            goto Lc0
        Lbc:
            org.apache.commons.compress.harmony.pack200.CPUTF8 r0 = r13.getCPUtf8(r14)
        Lc0:
            org.apache.commons.compress.harmony.pack200.CPSignature r2 = new org.apache.commons.compress.harmony.pack200.CPSignature
            r2.<init>(r14, r0, r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPSignature> r0 = r13.cp_Signature
            r0.add(r2)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPSignature> r0 = r13.stringsToCpSignature
            r0.put(r14, r2)
            r1 = r2
        Ld0:
            return r1
    }

    public org.apache.commons.compress.harmony.pack200.CPUTF8 getCPUtf8(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPUTF8> r0 = r2.stringsToCpUtf8
            java.lang.Object r0 = r0.get(r3)
            org.apache.commons.compress.harmony.pack200.CPUTF8 r0 = (org.apache.commons.compress.harmony.pack200.CPUTF8) r0
            if (r0 != 0) goto L1d
            org.apache.commons.compress.harmony.pack200.CPUTF8 r0 = new org.apache.commons.compress.harmony.pack200.CPUTF8
            r0.<init>(r3)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPUTF8> r1 = r2.cp_Utf8
            r1.add(r0)
            java.util.Map<java.lang.String, org.apache.commons.compress.harmony.pack200.CPUTF8> r1 = r2.stringsToCpUtf8
            r1.put(r3, r0)
        L1d:
            return r0
    }

    public org.apache.commons.compress.harmony.pack200.CPConstant<?> getConstant(java.lang.Object r6) {
            r5 = this;
            java.util.Map<java.lang.Object, org.apache.commons.compress.harmony.pack200.CPConstant<?>> r0 = r5.objectsToCPConstant
            java.lang.Object r0 = r0.get(r6)
            org.apache.commons.compress.harmony.pack200.CPConstant r0 = (org.apache.commons.compress.harmony.pack200.CPConstant) r0
            if (r0 != 0) goto Lf4
            boolean r1 = r6 instanceof java.lang.Integer
            if (r1 == 0) goto L24
            org.apache.commons.compress.harmony.pack200.CPInt r0 = new org.apache.commons.compress.harmony.pack200.CPInt
            r1 = r6
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.<init>(r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPInt> r1 = r5.cp_Int
            r2 = r0
            org.apache.commons.compress.harmony.pack200.CPInt r2 = (org.apache.commons.compress.harmony.pack200.CPInt) r2
            r1.add(r0)
            goto Lef
        L24:
            boolean r1 = r6 instanceof java.lang.Long
            if (r1 == 0) goto L3e
            org.apache.commons.compress.harmony.pack200.CPLong r0 = new org.apache.commons.compress.harmony.pack200.CPLong
            r1 = r6
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r0.<init>(r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPLong> r1 = r5.cp_Long
            r2 = r0
            org.apache.commons.compress.harmony.pack200.CPLong r2 = (org.apache.commons.compress.harmony.pack200.CPLong) r2
            r1.add(r0)
            goto Lef
        L3e:
            boolean r1 = r6 instanceof java.lang.Float
            if (r1 == 0) goto L58
            org.apache.commons.compress.harmony.pack200.CPFloat r0 = new org.apache.commons.compress.harmony.pack200.CPFloat
            r1 = r6
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.<init>(r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPFloat> r1 = r5.cp_Float
            r2 = r0
            org.apache.commons.compress.harmony.pack200.CPFloat r2 = (org.apache.commons.compress.harmony.pack200.CPFloat) r2
            r1.add(r0)
            goto Lef
        L58:
            boolean r1 = r6 instanceof java.lang.Double
            if (r1 == 0) goto L72
            org.apache.commons.compress.harmony.pack200.CPDouble r0 = new org.apache.commons.compress.harmony.pack200.CPDouble
            r1 = r6
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            r0.<init>(r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPDouble> r1 = r5.cp_Double
            r2 = r0
            org.apache.commons.compress.harmony.pack200.CPDouble r2 = (org.apache.commons.compress.harmony.pack200.CPDouble) r2
            r1.add(r0)
            goto Lef
        L72:
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L8b
            org.apache.commons.compress.harmony.pack200.CPString r0 = new org.apache.commons.compress.harmony.pack200.CPString
            r1 = r6
            java.lang.String r1 = (java.lang.String) r1
            org.apache.commons.compress.harmony.pack200.CPUTF8 r1 = r5.getCPUtf8(r1)
            r0.<init>(r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPString> r1 = r5.cp_String
            r2 = r0
            org.apache.commons.compress.harmony.pack200.CPString r2 = (org.apache.commons.compress.harmony.pack200.CPString) r2
            r1.add(r0)
            goto Lef
        L8b:
            boolean r1 = r6 instanceof org.objectweb.asm.Type
            if (r1 == 0) goto Lef
            r0 = r6
            org.objectweb.asm.Type r0 = (org.objectweb.asm.Type) r0
            java.lang.String r0 = r0.getClassName()
            java.lang.String r1 = "[]"
            boolean r2 = r0.endsWith(r1)
            if (r2 == 0) goto Leb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[L"
            r2.<init>(r3)
            int r3 = r0.length()
            int r3 = r3 + (-2)
            r4 = 0
            java.lang.String r0 = r0.substring(r4, r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
        Lb8:
            boolean r2 = r0.endsWith(r1)
            if (r2 == 0) goto Ld8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "["
            r2.<init>(r3)
            int r3 = r0.length()
            int r3 = r3 + (-2)
            java.lang.String r0 = r0.substring(r4, r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            goto Lb8
        Ld8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ";"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        Leb:
            org.apache.commons.compress.harmony.pack200.CPClass r0 = r5.getCPClass(r0)
        Lef:
            java.util.Map<java.lang.Object, org.apache.commons.compress.harmony.pack200.CPConstant<?>> r1 = r5.objectsToCPConstant
            r1.put(r6, r0)
        Lf4:
            return r0
    }

    /* JADX INFO: renamed from: lambda$removeSignaturesFromCpUTF8$2$org-apache-commons-compress-harmony-pack200-CpBands, reason: not valid java name */
    /* synthetic */ void m2553x611111b4(org.apache.commons.compress.harmony.pack200.CPSignature r2) {
            r1 = this;
            java.lang.String r0 = r2.getUnderlyingString()
            org.apache.commons.compress.harmony.pack200.CPUTF8 r2 = r2.getSignatureForm()
            java.lang.String r2 = r2.getUnderlyingString()
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L15
            r1.removeCpUtf8(r0)
        L15:
            return
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(java.io.OutputStream r3) throws java.io.IOException, org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            java.lang.String r0 = "Writing constant pool bands..."
            org.apache.commons.compress.harmony.pack200.PackingUtils.log(r0)
            r2.writeCpUtf8(r3)
            r2.writeCpInt(r3)
            r2.writeCpFloat(r3)
            r2.writeCpLong(r3)
            r2.writeCpDouble(r3)
            r2.writeCpString(r3)
            r2.writeCpClass(r3)
            r2.writeCpSignature(r3)
            r2.writeCpDescr(r3)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r0 = r2.cp_Field
            java.lang.String r1 = "cp_Field"
            r2.writeCpMethodOrField(r0, r3, r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r0 = r2.cp_Method
            java.lang.String r1 = "cp_Method"
            r2.writeCpMethodOrField(r0, r3, r1)
            java.util.Set<org.apache.commons.compress.harmony.pack200.CPMethodOrField> r0 = r2.cp_Imethod
            java.lang.String r1 = "cp_Imethod"
            r2.writeCpMethodOrField(r0, r3, r1)
            return
    }
}
