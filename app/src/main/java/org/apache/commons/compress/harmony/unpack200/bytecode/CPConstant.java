package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CPConstant extends org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry {
    private final java.lang.Object value;

    public CPConstant(byte r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.<init>(r1, r3)
            java.lang.String r1 = "value"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r2, r1)
            r0.value = r1
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L13
            return r0
        L13:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPConstant r4 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPConstant) r4
            java.lang.Object r0 = r3.value
            java.lang.Object r4 = r4.value
            boolean r4 = java.util.Objects.equals(r0, r4)
            return r4
    }

    protected java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.value
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.value
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }
}
