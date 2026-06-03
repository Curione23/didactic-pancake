package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class AnnotationDefaultAttribute extends org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute {
    private static org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 attributeName;
    private final org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.ElementValue elementValue;

    public AnnotationDefaultAttribute(org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute.ElementValue r2) {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute.attributeName
            r1.<init>(r0)
            r1.elementValue = r2
            return
    }

    public static void setAttributeName(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0) {
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute.attributeName = r0
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected int getLength() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue r0 = r1.elementValue
            int r0 = r0.getLength()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute.attributeName
            r0.add(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue r1 = r5.elementValue
            java.util.List r1 = r1.getClassFileEntries()
            r0.addAll(r1)
            int r1 = r0.size()
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r2 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r1]
            r3 = 0
        L1a:
            if (r3 >= r1) goto L27
            java.lang.Object r4 = r0.get(r3)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r4 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L1a
        L27:
            return r2
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r2) {
            r1 = this;
            super.resolve(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue r0 = r1.elementValue
            r0.resolve(r2)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnnotationDefault: "
            r0.<init>(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue r1 = r2.elementValue
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected void writeBody(java.io.DataOutputStream r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute$ElementValue r0 = r1.elementValue
            r0.writeBody(r2)
            return
    }
}
