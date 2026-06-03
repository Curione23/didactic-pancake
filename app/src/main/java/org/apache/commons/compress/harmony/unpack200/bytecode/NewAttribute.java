package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class NewAttribute extends org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute {
    private final java.util.List<java.lang.Object> body;
    private final int layoutIndex;
    private final java.util.List<java.lang.Integer> lengths;
    private org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool pool;

    /* JADX INFO: renamed from: org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static abstract class AbstractBcValue {
        int actualValue;

        private AbstractBcValue() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ AbstractBcValue(org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public void setActualValue(int r1) {
                r0 = this;
                r0.actualValue = r1
                return
        }
    }

    private static final class BCIndex extends org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.AbstractBcValue {
        private final int index;

        BCIndex(int r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.index = r2
                return
        }

        static /* synthetic */ int access$100(org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCIndex r0) {
                int r0 = r0.index
                return r0
        }
    }

    private static final class BCLength extends org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.AbstractBcValue {
        private final int length;

        BCLength(int r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.length = r2
                return
        }

        static /* synthetic */ int access$400(org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCLength r0) {
                int r0 = r0.length
                return r0
        }
    }

    private static final class BCOffset extends org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.AbstractBcValue {
        private int index;
        private final int offset;

        BCOffset(int r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.offset = r2
                return
        }

        static /* synthetic */ int access$200(org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCOffset r0) {
                int r0 = r0.offset
                return r0
        }

        static /* synthetic */ int access$300(org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCOffset r0) {
                int r0 = r0.index
                return r0
        }

        public void setIndex(int r1) {
                r0 = this;
                r0.index = r1
                return
        }
    }

    public NewAttribute(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.lengths = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.body = r1
            r0.layoutIndex = r2
            return
    }

    public void addBCIndex(int r2, int r3) {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.lengths
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Object> r2 = r1.body
            org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCIndex r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCIndex
            r0.<init>(r3)
            r2.add(r0)
            return
    }

    public void addBCLength(int r2, int r3) {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.lengths
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Object> r2 = r1.body
            org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCLength r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCLength
            r0.<init>(r3)
            r2.add(r0)
            return
    }

    public void addBCOffset(int r2, int r3) {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.lengths
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Object> r2 = r1.body
            org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCOffset r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCOffset
            r0.<init>(r3)
            r2.add(r0)
            return
    }

    public void addInteger(int r2, long r3) {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.lengths
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Object> r2 = r1.body
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.add(r3)
            return
    }

    public void addToBody(int r2, java.lang.Object r3) {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.lengths
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            java.util.List<java.lang.Object> r2 = r1.body
            r2.add(r3)
            return
    }

    public int getLayoutIndex() {
            r1 = this;
            int r0 = r1.layoutIndex
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute, org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected int getLength() {
            r3 = this;
            java.util.List<java.lang.Integer> r0 = r3.lengths
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r1 = r1 + r2
            goto L7
        L19:
            return r1
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r5 = this;
            java.util.List<java.lang.Object> r0 = r5.body
            java.util.Iterator r0 = r0.iterator()
            r1 = 1
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L19
            java.lang.Object r3 = r0.next()
            boolean r3 = r3 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
            if (r3 == 0) goto L8
            int r2 = r2 + 1
            goto L8
        L19:
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r2]
            r2 = 0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r3 = r5.getAttributeName()
            r0[r2] = r3
            java.util.List<java.lang.Object> r2 = r5.body
            java.util.Iterator r2 = r2.iterator()
        L28:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3d
            java.lang.Object r3 = r2.next()
            boolean r4 = r3 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
            if (r4 == 0) goto L28
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r3 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry) r3
            r0[r1] = r3
            int r1 = r1 + 1
            goto L28
        L3d:
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute
    protected int[] getStartPCs() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute
    public void renumber(java.util.List<java.lang.Integer> r7) {
            r6 = this;
            boolean r0 = r6.renumbered
            if (r0 != 0) goto Lb0
            java.util.List<java.lang.Object> r0 = r6.body
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lad
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCIndex
            if (r3 == 0) goto L2f
            r1 = r2
            org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCIndex r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCIndex) r1
            int r3 = org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCIndex.access$100(r1)
            java.lang.Object r3 = r7.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setActualValue(r3)
            goto Laa
        L2f:
            boolean r3 = r2 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCOffset
            if (r3 == 0) goto L88
            r3 = r2
            org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCOffset r3 = (org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCOffset) r3
            boolean r4 = r1 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCIndex
            if (r4 == 0) goto L56
            org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCIndex r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCIndex) r1
            int r1 = org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCIndex.access$100(r1)
            int r4 = org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCOffset.access$200(r3)
            int r1 = r1 + r4
            r3.setIndex(r1)
            java.lang.Object r1 = r7.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.setActualValue(r1)
            goto Laa
        L56:
            boolean r4 = r1 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCOffset
            if (r4 == 0) goto L76
            org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCOffset r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCOffset) r1
            int r1 = org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCOffset.access$300(r1)
            int r4 = org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCOffset.access$200(r3)
            int r1 = r1 + r4
            r3.setIndex(r1)
            java.lang.Object r1 = r7.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.setActualValue(r1)
            goto Laa
        L76:
            int r1 = org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCOffset.access$200(r3)
            java.lang.Object r1 = r7.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.setActualValue(r1)
            goto Laa
        L88:
            boolean r3 = r2 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCLength
            if (r3 == 0) goto Laa
            r3 = r2
            org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCLength r3 = (org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCLength) r3
            org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$BCIndex r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCIndex) r1
            int r4 = org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCIndex.access$100(r1)
            int r5 = org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.BCLength.access$400(r3)
            int r4 = r4 + r5
            java.lang.Object r4 = r7.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r1 = r1.actualValue
            int r4 = r4 - r1
            r3.setActualValue(r4)
        Laa:
            r1 = r2
            goto Lb
        Lad:
            r7 = 1
            r6.renumbered = r7
        Lb0:
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r4) {
            r3 = this;
            super.resolve(r4)
            java.util.List<java.lang.Object> r0 = r3.body
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
            if (r2 == 0) goto L9
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry) r1
            r1.resolve(r4)
            goto L9
        L1d:
            r3.pool = r4
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r1.attributeName
            java.lang.String r0 = r0.underlyingString()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute, org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected void writeBody(java.io.DataOutputStream r6) throws java.io.IOException {
            r5 = this;
            r0 = 0
        L1:
            java.util.List<java.lang.Integer> r1 = r5.lengths
            int r1 = r1.size()
            if (r0 >= r1) goto L62
            java.util.List<java.lang.Integer> r1 = r5.lengths
            java.lang.Object r1 = r1.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.List<java.lang.Object> r2 = r5.body
            java.lang.Object r2 = r2.get(r0)
            boolean r3 = r2 instanceof java.lang.Long
            if (r3 == 0) goto L26
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            goto L3f
        L26:
            boolean r3 = r2 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
            if (r3 == 0) goto L34
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r3 = r5.pool
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r2 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry) r2
            int r2 = r3.indexOf(r2)
        L32:
            long r2 = (long) r2
            goto L3f
        L34:
            boolean r3 = r2 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.AbstractBcValue
            if (r3 == 0) goto L3d
            org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute$AbstractBcValue r2 = (org.apache.commons.compress.harmony.unpack200.bytecode.NewAttribute.AbstractBcValue) r2
            int r2 = r2.actualValue
            goto L32
        L3d:
            r2 = 0
        L3f:
            r4 = 1
            if (r1 == r4) goto L5b
            r4 = 2
            if (r1 == r4) goto L56
            r4 = 4
            if (r1 == r4) goto L51
            r4 = 8
            if (r1 == r4) goto L4d
            goto L5f
        L4d:
            r6.writeLong(r2)
            goto L5f
        L51:
            int r1 = (int) r2
            r6.writeInt(r1)
            goto L5f
        L56:
            int r1 = (int) r2
            r6.writeShort(r1)
            goto L5f
        L5b:
            int r1 = (int) r2
            r6.writeByte(r1)
        L5f:
            int r0 = r0 + 1
            goto L1
        L62:
            return
    }
}
