package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class CPField extends org.apache.commons.compress.harmony.unpack200.bytecode.CPMember {
    public CPField(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2, long r3, java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.CPMember, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Field: "
            r0.<init>(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r2.name
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r2.descriptor
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
