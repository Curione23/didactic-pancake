package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class RuntimeVisibleorInvisibleParameterAnnotationsAttribute extends org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute {
    private final int numParameters;
    private final org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] parameterAnnotations;

    public static class ParameterAnnotation {
        private final org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation[] annotations;
        private final int numAnnotations;

        public ParameterAnnotation(org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation[] r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.length
                r1.numAnnotations = r0
                r1.annotations = r2
                return
        }

        public java.util.List<java.lang.Object> getClassFileEntries() {
                r5 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation[] r1 = r5.annotations
                int r2 = r1.length
                r3 = 0
            L9:
                if (r3 >= r2) goto L17
                r4 = r1[r3]
                java.util.List r4 = r4.getClassFileEntries()
                r0.addAll(r4)
                int r3 = r3 + 1
                goto L9
            L17:
                return r0
        }

        public int getLength() {
                r5 = this;
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation[] r0 = r5.annotations
                int r1 = r0.length
                r2 = 2
                r3 = 0
            L5:
                if (r3 >= r1) goto L11
                r4 = r0[r3]
                int r4 = r4.getLength()
                int r2 = r2 + r4
                int r3 = r3 + 1
                goto L5
            L11:
                return r2
        }

        public void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r5) {
                r4 = this;
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation[] r0 = r4.annotations
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto Le
                r3 = r0[r2]
                r3.resolve(r5)
                int r2 = r2 + 1
                goto L4
            Le:
                return
        }

        public void writeBody(java.io.DataOutputStream r5) throws java.io.IOException {
                r4 = this;
                int r0 = r4.numAnnotations
                r5.writeShort(r0)
                org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation[] r0 = r4.annotations
                int r1 = r0.length
                r2 = 0
            L9:
                if (r2 >= r1) goto L13
                r3 = r0[r2]
                r3.writeBody(r5)
                int r2 = r2 + 1
                goto L9
            L13:
                return
        }
    }

    public RuntimeVisibleorInvisibleParameterAnnotationsAttribute(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1, org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] r2) {
            r0 = this;
            r0.<init>(r1)
            int r1 = r2.length
            r0.numParameters = r1
            r0.parameterAnnotations = r2
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected int getLength() {
            r3 = this;
            r0 = 1
            r1 = 0
        L2:
            int r2 = r3.numParameters
            if (r1 >= r2) goto L12
            org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation[] r2 = r3.parameterAnnotations
            r2 = r2[r1]
            int r2 = r2.getLength()
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L12:
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r5.attributeName
            r0.add(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation[] r1 = r5.parameterAnnotations
            int r2 = r1.length
            r3 = 0
        Le:
            if (r3 >= r2) goto L1c
            r4 = r1[r3]
            java.util.List r4 = r4.getClassFileEntries()
            r0.addAll(r4)
            int r3 = r3 + 1
            goto Le
        L1c:
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r1 = org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute.NONE
            java.lang.Object[] r0 = r0.toArray(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[]) r0
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r5) {
            r4 = this;
            super.resolve(r5)
            org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation[] r0 = r4.parameterAnnotations
            int r1 = r0.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L11
            r3 = r0[r2]
            r3.resolve(r5)
            int r2 = r2 + 1
            goto L7
        L11:
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r2.attributeName
            java.lang.String r1 = r1.underlyingString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.numParameters
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " parameter annotations"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected void writeBody(java.io.DataOutputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.numParameters
            r3.writeByte(r0)
            r0 = 0
        L6:
            int r1 = r2.numParameters
            if (r0 >= r1) goto L14
            org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute$ParameterAnnotation[] r1 = r2.parameterAnnotations
            r1 = r1[r0]
            r1.writeBody(r3)
            int r0 = r0 + 1
            goto L6
        L14:
            return
    }
}
