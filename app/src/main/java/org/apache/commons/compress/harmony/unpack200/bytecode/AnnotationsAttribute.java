package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AnnotationsAttribute extends org.apache.commons.compress.harmony.unpack200.bytecode.Attribute {

    public static class Annotation {
        private final org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] elementNames;
        private final org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.ElementValue[] elementValues;
        private int[] nameIndexes;
        private final int numPairs;
        private final org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 type;
        private int typeIndex;

        public Annotation(int r1, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r3, org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.ElementValue[] r4) {
                r0 = this;
                r0.<init>()
                r0.numPairs = r1
                r0.type = r2
                r0.elementNames = r3
                r0.elementValues = r4
                return
        }

        public java.util.List<java.lang.Object> getClassFileEntries() {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
            L6:
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r2 = r4.elementNames
                int r3 = r2.length
                if (r1 >= r3) goto L1e
                r2 = r2[r1]
                r0.add(r2)
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue[] r2 = r4.elementValues
                r2 = r2[r1]
                java.util.List r2 = r2.getClassFileEntries()
                r0.addAll(r2)
                int r1 = r1 + 1
                goto L6
            L1e:
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r4.type
                r0.add(r1)
                return r0
        }

        public int getLength() {
                r3 = this;
                r0 = 4
                r1 = 0
            L2:
                int r2 = r3.numPairs
                if (r1 >= r2) goto L14
                int r0 = r0 + 2
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue[] r2 = r3.elementValues
                r2 = r2[r1]
                int r2 = r2.getLength()
                int r0 = r0 + r2
                int r1 = r1 + 1
                goto L2
            L14:
                return r0
        }

        public void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r4) {
                r3 = this;
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r3.type
                r0.resolve(r4)
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r3.type
                int r0 = r4.indexOf(r0)
                r3.typeIndex = r0
                int r0 = r3.numPairs
                int[] r0 = new int[r0]
                r3.nameIndexes = r0
                r0 = 0
            L14:
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r1 = r3.elementNames
                int r2 = r1.length
                if (r0 >= r2) goto L34
                r1 = r1[r0]
                r1.resolve(r4)
                int[] r1 = r3.nameIndexes
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r2 = r3.elementNames
                r2 = r2[r0]
                int r2 = r4.indexOf(r2)
                r1[r0] = r2
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue[] r1 = r3.elementValues
                r1 = r1[r0]
                r1.resolve(r4)
                int r0 = r0 + 1
                goto L14
            L34:
                return
        }

        public void writeBody(java.io.DataOutputStream r3) throws java.io.IOException {
                r2 = this;
                int r0 = r2.typeIndex
                r3.writeShort(r0)
                int r0 = r2.numPairs
                r3.writeShort(r0)
                r0 = 0
            Lb:
                int r1 = r2.numPairs
                if (r0 >= r1) goto L20
                int[] r1 = r2.nameIndexes
                r1 = r1[r0]
                r3.writeShort(r1)
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue[] r1 = r2.elementValues
                r1 = r1[r0]
                r1.writeBody(r3)
                int r0 = r0 + 1
                goto Lb
            L20:
                return
        }
    }

    public static class ElementValue {
        private int constantValueIndex;
        private final int tag;
        private final java.lang.Object value;

        public ElementValue(int r2, java.lang.Object r3) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.constantValueIndex = r0
                r1.tag = r2
                r1.value = r3
                return
        }

        public java.util.List<java.lang.Object> getClassFileEntries() {
                r5 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 1
                r0.<init>(r1)
                java.lang.Object r1 = r5.value
                boolean r2 = r1 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType
                if (r2 == 0) goto L1d
                org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType) r1
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r1.name
                r0.add(r1)
                java.lang.Object r1 = r5.value
                org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType) r1
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r1.descriptor
                r0.add(r1)
                goto L48
            L1d:
                boolean r2 = r1 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
                if (r2 == 0) goto L25
                r0.add(r1)
                goto L48
            L25:
                boolean r2 = r1 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.ElementValue[]
                if (r2 == 0) goto L3b
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue[] r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.ElementValue[]) r1
                int r2 = r1.length
                r3 = 0
            L2d:
                if (r3 >= r2) goto L48
                r4 = r1[r3]
                java.util.List r4 = r4.getClassFileEntries()
                r0.addAll(r4)
                int r3 = r3 + 1
                goto L2d
            L3b:
                boolean r2 = r1 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation
                if (r2 == 0) goto L48
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation) r1
                java.util.List r1 = r1.getClassFileEntries()
                r0.addAll(r1)
            L48:
                return r0
        }

        public int getLength() {
                r5 = this;
                int r0 = r5.tag
                r1 = 64
                if (r0 == r1) goto L45
                r1 = 70
                r2 = 3
                if (r0 == r1) goto L44
                r1 = 83
                if (r0 == r1) goto L44
                r1 = 99
                if (r0 == r1) goto L44
                r1 = 101(0x65, float:1.42E-43)
                if (r0 == r1) goto L42
                r1 = 115(0x73, float:1.61E-43)
                if (r0 == r1) goto L44
                r1 = 73
                if (r0 == r1) goto L44
                r1 = 74
                if (r0 == r1) goto L44
                r1 = 90
                if (r0 == r1) goto L44
                r1 = 91
                r3 = 0
                if (r0 == r1) goto L30
                switch(r0) {
                    case 66: goto L44;
                    case 67: goto L44;
                    case 68: goto L44;
                    default: goto L2f;
                }
            L2f:
                return r3
            L30:
                java.lang.Object r0 = r5.value
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue[] r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.ElementValue[]) r0
                int r1 = r0.length
            L35:
                if (r3 >= r1) goto L41
                r4 = r0[r3]
                int r4 = r4.getLength()
                int r2 = r2 + r4
                int r3 = r3 + 1
                goto L35
            L41:
                return r2
            L42:
                r0 = 5
                return r0
            L44:
                return r2
            L45:
                java.lang.Object r0 = r5.value
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation) r0
                int r0 = r0.getLength()
                int r0 = r0 + 1
                return r0
        }

        public void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r5) {
                r4 = this;
                java.lang.Object r0 = r4.value
                boolean r1 = r0 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.CPConstant
                if (r1 == 0) goto L16
                org.apache.commons.compress.harmony.unpack200.bytecode.CPConstant r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPConstant) r0
                r0.resolve(r5)
                java.lang.Object r0 = r4.value
                org.apache.commons.compress.harmony.unpack200.bytecode.CPConstant r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPConstant) r0
                int r5 = r5.indexOf(r0)
                r4.constantValueIndex = r5
                goto L64
            L16:
                boolean r1 = r0 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.CPClass
                if (r1 == 0) goto L2a
                org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPClass) r0
                r0.resolve(r5)
                java.lang.Object r0 = r4.value
                org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPClass) r0
                int r5 = r5.indexOf(r0)
                r4.constantValueIndex = r5
                goto L64
            L2a:
                boolean r1 = r0 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8
                if (r1 == 0) goto L3e
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r0
                r0.resolve(r5)
                java.lang.Object r0 = r4.value
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r0
                int r5 = r5.indexOf(r0)
                r4.constantValueIndex = r5
                goto L64
            L3e:
                boolean r1 = r0 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType
                if (r1 == 0) goto L48
                org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType) r0
                r0.resolve(r5)
                goto L64
            L48:
                boolean r1 = r0 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation
                if (r1 == 0) goto L52
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation) r0
                r0.resolve(r5)
                goto L64
            L52:
                boolean r1 = r0 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.ElementValue[]
                if (r1 == 0) goto L64
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue[] r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.ElementValue[]) r0
                int r1 = r0.length
                r2 = 0
            L5a:
                if (r2 >= r1) goto L64
                r3 = r0[r2]
                r3.resolve(r5)
                int r2 = r2 + 1
                goto L5a
            L64:
                return
        }

        public void writeBody(java.io.DataOutputStream r5) throws java.io.IOException {
                r4 = this;
                int r0 = r4.tag
                r5.writeByte(r0)
                int r0 = r4.constantValueIndex
                r1 = -1
                if (r0 == r1) goto Le
                r5.writeShort(r0)
                goto L3a
            Le:
                java.lang.Object r0 = r4.value
                boolean r1 = r0 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType
                if (r1 == 0) goto L1a
                org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType) r0
                r0.writeBody(r5)
                goto L3a
            L1a:
                boolean r1 = r0 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation
                if (r1 == 0) goto L24
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation) r0
                r0.writeBody(r5)
                goto L3a
            L24:
                boolean r1 = r0 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.ElementValue[]
                if (r1 == 0) goto L3b
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue[] r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.ElementValue[]) r0
                int r1 = r0.length
                r5.writeShort(r1)
                int r1 = r0.length
                r2 = 0
            L30:
                if (r2 >= r1) goto L3a
                r3 = r0[r2]
                r3.writeBody(r5)
                int r2 = r2 + 1
                goto L30
            L3a:
                return
            L3b:
                java.lang.Error r5 = new java.lang.Error
                java.lang.String r0 = ""
                r5.<init>(r0)
                throw r5
        }
    }

    public AnnotationsAttribute(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }
}
