package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class CPMethodRef extends org.apache.commons.compress.harmony.unpack200.bytecode.CPRef {
    private int cachedHashCode;
    private boolean hashCodeComputed;

    public CPMethodRef(org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r2, org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r3, int r4) {
            r1 = this;
            r0 = 10
            r1.<init>(r0, r2, r3, r4)
            return
    }

    private void generateHashCode() {
            r2 = this;
            r0 = 1
            r2.hashCodeComputed = r0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r0 = r2.className
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * r1
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r1 = r2.nameAndType
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            r2.cachedHashCode = r0
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.CPRef, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r3 = this;
            r0 = 2
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r0]
            r1 = 0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r2 = r3.className
            r0[r1] = r2
            r1 = 1
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r2 = r3.nameAndType
            r0[r1] = r2
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
            r1 = this;
            boolean r0 = r1.hashCodeComputed
            if (r0 != 0) goto L7
            r1.generateHashCode()
        L7:
            int r0 = r1.cachedHashCode
            return r0
    }
}
