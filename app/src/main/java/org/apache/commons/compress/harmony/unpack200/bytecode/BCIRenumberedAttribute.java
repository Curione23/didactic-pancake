package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BCIRenumberedAttribute extends org.apache.commons.compress.harmony.unpack200.bytecode.Attribute {
    protected boolean renumbered;

    public BCIRenumberedAttribute(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ int lambda$renumber$0(java.util.List r0, int[] r1, int r2) {
            r1 = r1[r2]
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected abstract int getLength();

    protected abstract int[] getStartPCs();

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    public boolean hasBCIRenumbering() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void renumber(java.util.List<java.lang.Integer> r3) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            boolean r0 = r2.renumbered
            if (r0 != 0) goto L14
            r0 = 1
            r2.renumbered = r0
            int[] r0 = r2.getStartPCs()
            org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute$$ExternalSyntheticLambda0
            r1.<init>(r3, r0)
            java.util.Arrays.setAll(r0, r1)
            return
        L14:
            java.lang.Error r3 = new java.lang.Error
            java.lang.String r0 = "Trying to renumber a line number table that has already been renumbered"
            r3.<init>(r0)
            throw r3
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public abstract java.lang.String toString();

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected abstract void writeBody(java.io.DataOutputStream r1) throws java.io.IOException;
}
