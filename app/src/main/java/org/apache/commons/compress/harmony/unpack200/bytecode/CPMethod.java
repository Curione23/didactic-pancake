package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class CPMethod extends org.apache.commons.compress.harmony.unpack200.bytecode.CPMember {
    private int cachedHashCode;
    private boolean hashCodeComputed;

    public CPMethod(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2, long r3, java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5)
            return
    }

    private void generateHashCode() {
            r2 = this;
            r0 = 1
            r2.hashCodeComputed = r0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r2.name
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * r1
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r2.descriptor
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            r2.cachedHashCode = r0
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.CPMember, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
            r1 = this;
            boolean r0 = r1.hashCodeComputed
            if (r0 != 0) goto L7
            r1.generateHashCode()
        L7:
            int r0 = r1.cachedHashCode
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.CPMember, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Method: "
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
