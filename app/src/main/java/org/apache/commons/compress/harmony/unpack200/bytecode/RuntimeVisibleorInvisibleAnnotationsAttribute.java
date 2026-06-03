package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class RuntimeVisibleorInvisibleAnnotationsAttribute extends org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute {
    private final org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation[] annotations;
    private final int numAnnotations;

    public RuntimeVisibleorInvisibleAnnotationsAttribute(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1, org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.Annotation[] r2) {
            r0 = this;
            r0.<init>(r1)
            int r1 = r2.length
            r0.numAnnotations = r1
            r0.annotations = r2
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected int getLength() {
            r3 = this;
            r0 = 2
            r1 = 0
        L2:
            int r2 = r3.numAnnotations
            if (r1 >= r2) goto L12
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation[] r2 = r3.annotations
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
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation[] r1 = r5.annotations
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
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r1 = org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute.NONE
            java.lang.Object[] r0 = r0.toArray(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[]) r0
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r5) {
            r4 = this;
            super.resolve(r5)
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation[] r0 = r4.annotations
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
            int r1 = r2.numAnnotations
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " annotations"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected void writeBody(java.io.DataOutputStream r4) throws java.io.IOException {
            r3 = this;
            int r0 = r4.size()
            int r1 = r3.numAnnotations
            r4.writeShort(r1)
            r1 = 0
        La:
            int r2 = r3.numAnnotations
            if (r1 >= r2) goto L18
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$Annotation[] r2 = r3.annotations
            r2 = r2[r1]
            r2.writeBody(r4)
            int r1 = r1 + 1
            goto La
        L18:
            int r4 = r4.size()
            int r4 = r4 - r0
            int r0 = r3.getLength()
            if (r4 != r0) goto L24
            return
        L24:
            java.lang.Error r4 = new java.lang.Error
            r4.<init>()
            throw r4
    }
}
