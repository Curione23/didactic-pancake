package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class CPUTF8 extends org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry {
    private int cachedHashCode;
    private boolean hashCodeComputed;
    private final java.lang.String utf8;

    public CPUTF8(java.lang.String r2) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0)
            return
    }

    public CPUTF8(java.lang.String r2, int r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r0, r3)
            java.lang.String r3 = "utf8"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r3)
            java.lang.String r2 = (java.lang.String) r2
            r1.utf8 = r2
            return
    }

    private void generateHashCode() {
            r1 = this;
            r0 = 1
            r1.hashCodeComputed = r0
            java.lang.String r0 = r1.utf8
            int r0 = r0.hashCode()
            int r0 = r0 + 31
            r1.cachedHashCode = r0
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
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r4 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r4
            java.lang.String r0 = r3.utf8
            java.lang.String r4 = r4.utf8
            boolean r4 = r0.equals(r4)
            return r4
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

    public void setGlobalIndex(int r1) {
            r0 = this;
            r0.globalIndex = r1
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r1 = r1.name()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.utf8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String underlyingString() {
            r1 = this;
            java.lang.String r0 = r1.utf8
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry
    protected void writeBody(java.io.DataOutputStream r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = r1.utf8
            r2.writeUTF(r0)
            return
    }
}
