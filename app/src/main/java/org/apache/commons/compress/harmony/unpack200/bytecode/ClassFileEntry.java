package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ClassFileEntry {
    protected static final org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] NONE = null;
    private boolean resolved;

    static {
            r0 = 0
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r0]
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry.NONE = r0
            return
    }

    public ClassFileEntry() {
            r0 = this;
            r0.<init>()
            return
    }

    protected abstract void doWrite(java.io.DataOutputStream r1) throws java.io.IOException;

    public abstract boolean equals(java.lang.Object r1);

    protected org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry.NONE
            return r0
    }

    public abstract int hashCode();

    protected int objectHashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r1) {
            r0 = this;
            r1 = 1
            r0.resolved = r1
            return
    }

    public abstract java.lang.String toString();

    public final void write(java.io.DataOutputStream r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.resolved
            if (r0 == 0) goto L8
            r1.doWrite(r2)
            return
        L8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Entry has not been resolved"
            r2.<init>(r0)
            throw r2
    }
}
