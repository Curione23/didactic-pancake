package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ExceptionTable.class */
public class ExceptionTable implements java.lang.Cloneable {
    private javassist.bytecode.ConstPool constPool;
    private java.util.List<javassist.bytecode.ExceptionTableEntry> entries;

    public ExceptionTable(javassist.bytecode.ConstPool r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.constPool = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.entries = r1
            return
    }

    ExceptionTable(javassist.bytecode.ConstPool r9, java.io.DataInputStream r10) throws java.io.IOException {
            r8 = this;
            r0 = r8
            r0.<init>()
            r0 = r8
            r1 = r9
            r0.constPool = r1
            r0 = r10
            int r0 = r0.readUnsignedShort()
            r11 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            r12 = r0
            r0 = 0
            r13 = r0
        L1b:
            r0 = r13
            r1 = r11
            if (r0 >= r1) goto L56
            r0 = r10
            int r0 = r0.readUnsignedShort()
            r14 = r0
            r0 = r10
            int r0 = r0.readUnsignedShort()
            r15 = r0
            r0 = r10
            int r0 = r0.readUnsignedShort()
            r16 = r0
            r0 = r10
            int r0 = r0.readUnsignedShort()
            r17 = r0
            r0 = r12
            javassist.bytecode.ExceptionTableEntry r1 = new javassist.bytecode.ExceptionTableEntry
            r2 = r1
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
            int r13 = r13 + 1
            goto L1b
        L56:
            r0 = r8
            r1 = r12
            r0.entries = r1
            return
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r5 = this;
            r0 = r5
            java.lang.Object r0 = super.clone()
            javassist.bytecode.ExceptionTable r0 = (javassist.bytecode.ExceptionTable) r0
            r6 = r0
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r3 = r5
            java.util.List<javassist.bytecode.ExceptionTableEntry> r3 = r3.entries
            r2.<init>(r3)
            r0.entries = r1
            r0 = r6
            return r0
    }

    public int size() {
            r2 = this;
            r0 = r2
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            int r0 = r0.size()
            return r0
    }

    public int startPc(int r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.ExceptionTableEntry r0 = (javassist.bytecode.ExceptionTableEntry) r0
            int r0 = r0.startPc
            return r0
    }

    public void setStartPc(int r4, int r5) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.ExceptionTableEntry r0 = (javassist.bytecode.ExceptionTableEntry) r0
            r1 = r5
            r0.startPc = r1
            return
    }

    public int endPc(int r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.ExceptionTableEntry r0 = (javassist.bytecode.ExceptionTableEntry) r0
            int r0 = r0.endPc
            return r0
    }

    public void setEndPc(int r4, int r5) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.ExceptionTableEntry r0 = (javassist.bytecode.ExceptionTableEntry) r0
            r1 = r5
            r0.endPc = r1
            return
    }

    public int handlerPc(int r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.ExceptionTableEntry r0 = (javassist.bytecode.ExceptionTableEntry) r0
            int r0 = r0.handlerPc
            return r0
    }

    public void setHandlerPc(int r4, int r5) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.ExceptionTableEntry r0 = (javassist.bytecode.ExceptionTableEntry) r0
            r1 = r5
            r0.handlerPc = r1
            return
    }

    public int catchType(int r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.ExceptionTableEntry r0 = (javassist.bytecode.ExceptionTableEntry) r0
            int r0 = r0.catchType
            return r0
    }

    public void setCatchType(int r4, int r5) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.ExceptionTableEntry r0 = (javassist.bytecode.ExceptionTableEntry) r0
            r1 = r5
            r0.catchType = r1
            return
    }

    public void add(int r8, javassist.bytecode.ExceptionTable r9, int r10) {
            r7 = this;
            r0 = r9
            int r0 = r0.size()
            r11 = r0
        L6:
            int r11 = r11 + (-1)
            r0 = r11
            if (r0 < 0) goto L40
            r0 = r9
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.ExceptionTableEntry r0 = (javassist.bytecode.ExceptionTableEntry) r0
            r12 = r0
            r0 = r7
            r1 = r8
            r2 = r12
            int r2 = r2.startPc
            r3 = r10
            int r2 = r2 + r3
            r3 = r12
            int r3 = r3.endPc
            r4 = r10
            int r3 = r3 + r4
            r4 = r12
            int r4 = r4.handlerPc
            r5 = r10
            int r4 = r4 + r5
            r5 = r12
            int r5 = r5.catchType
            r0.add(r1, r2, r3, r4, r5)
            goto L6
        L40:
            return
    }

    public void add(int r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            r0 = r11
            r1 = r12
            if (r0 >= r1) goto L1c
            r0 = r9
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            r1 = r10
            javassist.bytecode.ExceptionTableEntry r2 = new javassist.bytecode.ExceptionTableEntry
            r3 = r2
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r3.<init>(r4, r5, r6, r7)
            r0.add(r1, r2)
        L1c:
            return
    }

    public void add(int r9, int r10, int r11, int r12) {
            r8 = this;
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L1b
            r0 = r8
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            javassist.bytecode.ExceptionTableEntry r1 = new javassist.bytecode.ExceptionTableEntry
            r2 = r1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
        L1b:
            return
    }

    public void remove(int r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            r1 = r4
            java.lang.Object r0 = r0.remove(r1)
            return
    }

    public javassist.bytecode.ExceptionTable copy(javassist.bytecode.ConstPool r7, java.util.Map<java.lang.String, java.lang.String> r8) {
            r6 = this;
            javassist.bytecode.ExceptionTable r0 = new javassist.bytecode.ExceptionTable
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r9 = r0
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r10 = r0
            r0 = r6
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L1a:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L56
            r0 = r11
            java.lang.Object r0 = r0.next()
            javassist.bytecode.ExceptionTableEntry r0 = (javassist.bytecode.ExceptionTableEntry) r0
            r12 = r0
            r0 = r10
            r1 = r12
            int r1 = r1.catchType
            r2 = r7
            r3 = r8
            int r0 = r0.copy(r1, r2, r3)
            r13 = r0
            r0 = r9
            r1 = r12
            int r1 = r1.startPc
            r2 = r12
            int r2 = r2.endPc
            r3 = r12
            int r3 = r3.handlerPc
            r4 = r13
            r0.add(r1, r2, r3, r4)
            goto L1a
        L56:
            r0 = r9
            return r0
    }

    void shiftPc(int r7, int r8, boolean r9) {
            r6 = this;
            r0 = r6
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        Lb:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L54
            r0 = r10
            java.lang.Object r0 = r0.next()
            javassist.bytecode.ExceptionTableEntry r0 = (javassist.bytecode.ExceptionTableEntry) r0
            r11 = r0
            r0 = r11
            r1 = r11
            int r1 = r1.startPc
            r2 = r7
            r3 = r8
            r4 = r9
            int r1 = shiftPc(r1, r2, r3, r4)
            r0.startPc = r1
            r0 = r11
            r1 = r11
            int r1 = r1.endPc
            r2 = r7
            r3 = r8
            r4 = r9
            int r1 = shiftPc(r1, r2, r3, r4)
            r0.endPc = r1
            r0 = r11
            r1 = r11
            int r1 = r1.handlerPc
            r2 = r7
            r3 = r8
            r4 = r9
            int r1 = shiftPc(r1, r2, r3, r4)
            r0.handlerPc = r1
            goto Lb
        L54:
            return
    }

    private static int shiftPc(int r3, int r4, int r5, boolean r6) {
            r0 = r3
            r1 = r4
            if (r0 > r1) goto Le
            r0 = r6
            if (r0 == 0) goto L12
            r0 = r3
            r1 = r4
            if (r0 != r1) goto L12
        Le:
            r0 = r3
            r1 = r5
            int r0 = r0 + r1
            r3 = r0
        L12:
            r0 = r3
            return r0
    }

    void write(java.io.DataOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.size()
            r0.writeShort(r1)
            r0 = r3
            java.util.List<javassist.bytecode.ExceptionTableEntry> r0 = r0.entries
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L12:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L48
            r0 = r5
            java.lang.Object r0 = r0.next()
            javassist.bytecode.ExceptionTableEntry r0 = (javassist.bytecode.ExceptionTableEntry) r0
            r6 = r0
            r0 = r4
            r1 = r6
            int r1 = r1.startPc
            r0.writeShort(r1)
            r0 = r4
            r1 = r6
            int r1 = r1.endPc
            r0.writeShort(r1)
            r0 = r4
            r1 = r6
            int r1 = r1.handlerPc
            r0.writeShort(r1)
            r0 = r4
            r1 = r6
            int r1 = r1.catchType
            r0.writeShort(r1)
            goto L12
        L48:
            return
    }
}
