package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeAttribute.class */
public class CodeAttribute extends javassist.bytecode.AttributeInfo implements javassist.bytecode.Opcode {
    public static final java.lang.String tag = "Code";
    private int maxStack;
    private int maxLocals;
    private javassist.bytecode.ExceptionTable exceptions;
    private java.util.List<javassist.bytecode.AttributeInfo> attributes;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeAttribute$LdcEntry.class */
    static class LdcEntry {
        javassist.bytecode.CodeAttribute.LdcEntry next;
        int where;
        int index;

        LdcEntry() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static byte[] doit(byte[] r5, javassist.bytecode.CodeAttribute.LdcEntry r6, javassist.bytecode.ExceptionTable r7, javassist.bytecode.CodeAttribute r8) throws javassist.bytecode.BadBytecode {
                r0 = r6
                if (r0 == 0) goto Lc
                r0 = r5
                r1 = r7
                r2 = r8
                r3 = r6
                byte[] r0 = javassist.bytecode.CodeIterator.changeLdcToLdcW(r0, r1, r2, r3)
                r5 = r0
            Lc:
                r0 = r5
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeAttribute$RuntimeCopyException.class */
    public static class RuntimeCopyException extends java.lang.RuntimeException {
        private static final long serialVersionUID = 1;

        public RuntimeCopyException(java.lang.String r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    public CodeAttribute(javassist.bytecode.ConstPool r5, int r6, int r7, byte[] r8, javassist.bytecode.ExceptionTable r9) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.String r2 = "Code"
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r6
            r0.maxStack = r1
            r0 = r4
            r1 = r7
            r0.maxLocals = r1
            r0 = r4
            r1 = r8
            r0.info = r1
            r0 = r4
            r1 = r9
            r0.exceptions = r1
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.attributes = r1
            return
    }

    private CodeAttribute(javassist.bytecode.ConstPool r8, javassist.bytecode.CodeAttribute r9, java.util.Map<java.lang.String, java.lang.String> r10) throws javassist.bytecode.BadBytecode {
            r7 = this;
            r0 = r7
            r1 = r8
            java.lang.String r2 = "Code"
            r0.<init>(r1, r2)
            r0 = r7
            r1 = r9
            int r1 = r1.getMaxStack()
            r0.maxStack = r1
            r0 = r7
            r1 = r9
            int r1 = r1.getMaxLocals()
            r0.maxLocals = r1
            r0 = r7
            r1 = r9
            javassist.bytecode.ExceptionTable r1 = r1.getExceptionTable()
            r2 = r8
            r3 = r10
            javassist.bytecode.ExceptionTable r1 = r1.copy(r2, r3)
            r0.exceptions = r1
            r0 = r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.attributes = r1
            r0 = r9
            java.util.List r0 = r0.getAttributes()
            r11 = r0
            r0 = r11
            int r0 = r0.size()
            r12 = r0
            r0 = 0
            r13 = r0
        L41:
            r0 = r13
            r1 = r12
            if (r0 >= r1) goto L6d
            r0 = r11
            r1 = r13
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.AttributeInfo r0 = (javassist.bytecode.AttributeInfo) r0
            r14 = r0
            r0 = r7
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r14
            r2 = r8
            r3 = r10
            javassist.bytecode.AttributeInfo r1 = r1.copy(r2, r3)
            boolean r0 = r0.add(r1)
            int r13 = r13 + 1
            goto L41
        L6d:
            r0 = r7
            r1 = r9
            r2 = r8
            r3 = r10
            r4 = r7
            javassist.bytecode.ExceptionTable r4 = r4.exceptions
            r5 = r7
            byte[] r1 = r1.copyCode(r2, r3, r4, r5)
            r0.info = r1
            return
    }

    CodeAttribute(javassist.bytecode.ConstPool r7, int r8, java.io.DataInputStream r9) throws java.io.IOException {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = 0
            byte[] r3 = (byte[]) r3
            r0.<init>(r1, r2, r3)
            r0 = r9
            int r0 = r0.readInt()
            r10 = r0
            r0 = r6
            r1 = r9
            int r1 = r1.readUnsignedShort()
            r0.maxStack = r1
            r0 = r6
            r1 = r9
            int r1 = r1.readUnsignedShort()
            r0.maxLocals = r1
            r0 = r9
            int r0 = r0.readInt()
            r11 = r0
            r0 = r6
            r1 = r11
            byte[] r1 = new byte[r1]
            r0.info = r1
            r0 = r9
            r1 = r6
            byte[] r1 = r1.info
            r0.readFully(r1)
            r0 = r6
            javassist.bytecode.ExceptionTable r1 = new javassist.bytecode.ExceptionTable
            r2 = r1
            r3 = r7
            r4 = r9
            r2.<init>(r3, r4)
            r0.exceptions = r1
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.attributes = r1
            r0 = r9
            int r0 = r0.readUnsignedShort()
            r12 = r0
            r0 = 0
            r13 = r0
        L57:
            r0 = r13
            r1 = r12
            if (r0 >= r1) goto L73
            r0 = r6
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r7
            r2 = r9
            javassist.bytecode.AttributeInfo r1 = javassist.bytecode.AttributeInfo.read(r1, r2)
            boolean r0 = r0.add(r1)
            int r13 = r13 + 1
            goto L57
        L73:
            return
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r7, java.util.Map<java.lang.String, java.lang.String> r8) throws javassist.bytecode.CodeAttribute.RuntimeCopyException {
            r6 = this;
            javassist.bytecode.CodeAttribute r0 = new javassist.bytecode.CodeAttribute     // Catch: javassist.bytecode.BadBytecode -> Lb
            r1 = r0
            r2 = r7
            r3 = r6
            r4 = r8
            r1.<init>(r2, r3, r4)     // Catch: javassist.bytecode.BadBytecode -> Lb
            return r0
        Lb:
            r9 = move-exception
            javassist.bytecode.CodeAttribute$RuntimeCopyException r0 = new javassist.bytecode.CodeAttribute$RuntimeCopyException
            r1 = r0
            java.lang.String r2 = "bad bytecode. fatal?"
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.bytecode.AttributeInfo
    public int length() {
            r4 = this;
            r0 = 18
            r1 = r4
            byte[] r1 = r1.info
            int r1 = r1.length
            int r0 = r0 + r1
            r1 = r4
            javassist.bytecode.ExceptionTable r1 = r1.exceptions
            int r1 = r1.size()
            r2 = 8
            int r1 = r1 * r2
            int r0 = r0 + r1
            r1 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r1 = r1.attributes
            int r1 = javassist.bytecode.AttributeInfo.getLength(r1)
            int r0 = r0 + r1
            return r0
    }

    @Override // javassist.bytecode.AttributeInfo
    void write(java.io.DataOutputStream r5) throws java.io.IOException {
            r4 = this;
            r0 = r5
            r1 = r4
            int r1 = r1.name
            r0.writeShort(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.length()
            r2 = 6
            int r1 = r1 - r2
            r0.writeInt(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.maxStack
            r0.writeShort(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.maxLocals
            r0.writeShort(r1)
            r0 = r5
            r1 = r4
            byte[] r1 = r1.info
            int r1 = r1.length
            r0.writeInt(r1)
            r0 = r5
            r1 = r4
            byte[] r1 = r1.info
            r0.write(r1)
            r0 = r4
            javassist.bytecode.ExceptionTable r0 = r0.exceptions
            r1 = r5
            r0.write(r1)
            r0 = r5
            r1 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r1 = r1.attributes
            int r1 = r1.size()
            r0.writeShort(r1)
            r0 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r5
            javassist.bytecode.AttributeInfo.writeAll(r0, r1)
            return
    }

    @Override // javassist.bytecode.AttributeInfo
    public byte[] get() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "CodeAttribute.get()"
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.bytecode.AttributeInfo
    public void set(byte[] r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "CodeAttribute.set()"
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.bytecode.AttributeInfo
    void renameClass(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r5
            r2 = r6
            javassist.bytecode.AttributeInfo.renameClass(r0, r1, r2)
            return
    }

    @Override // javassist.bytecode.AttributeInfo
    void renameClass(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r4
            javassist.bytecode.AttributeInfo.renameClass(r0, r1)
            return
    }

    @Override // javassist.bytecode.AttributeInfo
    void getRefClasses(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r4
            javassist.bytecode.AttributeInfo.getRefClasses(r0, r1)
            return
    }

    public java.lang.String getDeclaringClass() {
            r2 = this;
            r0 = r2
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r3 = r0
            r0 = r3
            java.lang.String r0 = r0.getClassName()
            return r0
    }

    public int getMaxStack() {
            r2 = this;
            r0 = r2
            int r0 = r0.maxStack
            return r0
    }

    public void setMaxStack(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.maxStack = r1
            return
    }

    public int computeMaxStack() throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.bytecode.CodeAnalyzer r1 = new javassist.bytecode.CodeAnalyzer
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            int r1 = r1.computeMaxStack()
            r0.maxStack = r1
            r0 = r5
            int r0 = r0.maxStack
            return r0
    }

    public int getMaxLocals() {
            r2 = this;
            r0 = r2
            int r0 = r0.maxLocals
            return r0
    }

    public void setMaxLocals(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.maxLocals = r1
            return
    }

    public int getCodeLength() {
            r2 = this;
            r0 = r2
            byte[] r0 = r0.info
            int r0 = r0.length
            return r0
    }

    public byte[] getCode() {
            r2 = this;
            r0 = r2
            byte[] r0 = r0.info
            return r0
    }

    void setCode(byte[] r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.set(r1)
            return
    }

    public javassist.bytecode.CodeIterator iterator() {
            r4 = this;
            javassist.bytecode.CodeIterator r0 = new javassist.bytecode.CodeIterator
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
    }

    public javassist.bytecode.ExceptionTable getExceptionTable() {
            r2 = this;
            r0 = r2
            javassist.bytecode.ExceptionTable r0 = r0.exceptions
            return r0
    }

    public java.util.List<javassist.bytecode.AttributeInfo> getAttributes() {
            r2 = this;
            r0 = r2
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            return r0
    }

    public javassist.bytecode.AttributeInfo getAttribute(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r4
            javassist.bytecode.AttributeInfo r0 = javassist.bytecode.AttributeInfo.lookup(r0, r1)
            return r0
    }

    public void setAttribute(javassist.bytecode.StackMapTable r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            java.lang.String r1 = "StackMapTable"
            javassist.bytecode.AttributeInfo r0 = javassist.bytecode.AttributeInfo.remove(r0, r1)
            r0 = r4
            if (r0 == 0) goto L19
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r4
            boolean r0 = r0.add(r1)
        L19:
            return
    }

    public void setAttribute(javassist.bytecode.StackMap r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            java.lang.String r1 = "StackMap"
            javassist.bytecode.AttributeInfo r0 = javassist.bytecode.AttributeInfo.remove(r0, r1)
            r0 = r4
            if (r0 == 0) goto L19
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r4
            boolean r0 = r0.add(r1)
        L19:
            return
    }

    private byte[] copyCode(javassist.bytecode.ConstPool r9, java.util.Map<java.lang.String, java.lang.String> r10, javassist.bytecode.ExceptionTable r11, javassist.bytecode.CodeAttribute r12) throws javassist.bytecode.BadBytecode {
            r8 = this;
            r0 = r8
            int r0 = r0.getCodeLength()
            r13 = r0
            r0 = r13
            byte[] r0 = new byte[r0]
            r14 = r0
            r0 = r12
            r1 = r14
            r0.info = r1
            r0 = r8
            byte[] r0 = r0.info
            r1 = 0
            r2 = r13
            r3 = r8
            javassist.bytecode.ConstPool r3 = r3.getConstPool()
            r4 = r14
            r5 = r9
            r6 = r10
            javassist.bytecode.CodeAttribute$LdcEntry r0 = copyCode(r0, r1, r2, r3, r4, r5, r6)
            r15 = r0
            r0 = r14
            r1 = r15
            r2 = r11
            r3 = r12
            byte[] r0 = javassist.bytecode.CodeAttribute.LdcEntry.doit(r0, r1, r2, r3)
            return r0
    }

    private static javassist.bytecode.CodeAttribute.LdcEntry copyCode(byte[] r7, int r8, int r9, javassist.bytecode.ConstPool r10, byte[] r11, javassist.bytecode.ConstPool r12, java.util.Map<java.lang.String, java.lang.String> r13) throws javassist.bytecode.BadBytecode {
            r0 = 0
            r16 = r0
            r0 = r8
            r17 = r0
        L6:
            r0 = r17
            r1 = r9
            if (r0 >= r1) goto L1b4
            r0 = r7
            r1 = r17
            int r0 = javassist.bytecode.CodeIterator.nextOpcode(r0, r1)
            r14 = r0
            r0 = r7
            r1 = r17
            r0 = r0[r1]
            r18 = r0
            r0 = r11
            r1 = r17
            r2 = r18
            r0[r1] = r2
            r0 = r18
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            switch(r0) {
                case 18: goto Lca;
                case 19: goto Lb8;
                case 20: goto Lb8;
                case 178: goto Lb8;
                case 179: goto Lb8;
                case 180: goto Lb8;
                case 181: goto Lb8;
                case 182: goto Lb8;
                case 183: goto Lb8;
                case 184: goto Lb8;
                case 185: goto L12a;
                case 186: goto L156;
                case 187: goto Lb8;
                case 189: goto Lb8;
                case 192: goto Lb8;
                case 193: goto Lb8;
                case 197: goto L178;
                default: goto L197;
            }
        Lb8:
            r0 = r17
            r1 = 1
            int r0 = r0 + r1
            r1 = r7
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            copyConstPoolInfo(r0, r1, r2, r3, r4, r5)
            goto L1ad
        Lca:
            r0 = r7
            r1 = r17
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r15 = r0
            r0 = r10
            r1 = r15
            r2 = r12
            r3 = r13
            int r0 = r0.copy(r1, r2, r3)
            r15 = r0
            r0 = r15
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto Lf7
            r0 = r11
            r1 = r17
            r2 = 1
            int r1 = r1 + r2
            r2 = r15
            byte r2 = (byte) r2
            r0[r1] = r2
            goto L1ad
        Lf7:
            r0 = r11
            r1 = r17
            r2 = 0
            r0[r1] = r2
            r0 = r11
            r1 = r17
            r2 = 1
            int r1 = r1 + r2
            r2 = 0
            r0[r1] = r2
            javassist.bytecode.CodeAttribute$LdcEntry r0 = new javassist.bytecode.CodeAttribute$LdcEntry
            r1 = r0
            r1.<init>()
            r19 = r0
            r0 = r19
            r1 = r17
            r0.where = r1
            r0 = r19
            r1 = r15
            r0.index = r1
            r0 = r19
            r1 = r16
            r0.next = r1
            r0 = r19
            r16 = r0
            goto L1ad
        L12a:
            r0 = r17
            r1 = 1
            int r0 = r0 + r1
            r1 = r7
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            copyConstPoolInfo(r0, r1, r2, r3, r4, r5)
            r0 = r11
            r1 = r17
            r2 = 3
            int r1 = r1 + r2
            r2 = r7
            r3 = r17
            r4 = 3
            int r3 = r3 + r4
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r11
            r1 = r17
            r2 = 4
            int r1 = r1 + r2
            r2 = r7
            r3 = r17
            r4 = 4
            int r3 = r3 + r4
            r2 = r2[r3]
            r0[r1] = r2
            goto L1ad
        L156:
            r0 = r17
            r1 = 1
            int r0 = r0 + r1
            r1 = r7
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            copyConstPoolInfo(r0, r1, r2, r3, r4, r5)
            r0 = r11
            r1 = r17
            r2 = 3
            int r1 = r1 + r2
            r2 = 0
            r0[r1] = r2
            r0 = r11
            r1 = r17
            r2 = 4
            int r1 = r1 + r2
            r2 = 0
            r0[r1] = r2
            goto L1ad
        L178:
            r0 = r17
            r1 = 1
            int r0 = r0 + r1
            r1 = r7
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            copyConstPoolInfo(r0, r1, r2, r3, r4, r5)
            r0 = r11
            r1 = r17
            r2 = 3
            int r1 = r1 + r2
            r2 = r7
            r3 = r17
            r4 = 3
            int r3 = r3 + r4
            r2 = r2[r3]
            r0[r1] = r2
            goto L1ad
        L197:
            int r17 = r17 + 1
            r0 = r17
            r1 = r14
            if (r0 >= r1) goto L1ad
            r0 = r11
            r1 = r17
            r2 = r7
            r3 = r17
            r2 = r2[r3]
            r0[r1] = r2
            goto L197
        L1ad:
            r0 = r14
            r17 = r0
            goto L6
        L1b4:
            r0 = r16
            return r0
    }

    private static void copyConstPoolInfo(int r5, byte[] r6, javassist.bytecode.ConstPool r7, byte[] r8, javassist.bytecode.ConstPool r9, java.util.Map<java.lang.String, java.lang.String> r10) {
            r0 = r6
            r1 = r5
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 << r1
            r1 = r6
            r2 = r5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            r11 = r0
            r0 = r7
            r1 = r11
            r2 = r9
            r3 = r10
            int r0 = r0.copy(r1, r2, r3)
            r11 = r0
            r0 = r8
            r1 = r5
            r2 = r11
            r3 = 8
            int r2 = r2 >> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r8
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            r2 = r11
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    public void insertLocalVar(int r5, int r6) throws javassist.bytecode.BadBytecode {
            r4 = this;
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r7 = r0
        L5:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L15
            r0 = r7
            r1 = r5
            r2 = r6
            shiftIndex(r0, r1, r2)
            goto L5
        L15:
            r0 = r4
            r1 = r4
            int r1 = r1.getMaxLocals()
            r2 = r6
            int r1 = r1 + r2
            r0.setMaxLocals(r1)
            return
    }

    private static void shiftIndex(javassist.bytecode.CodeIterator r8, int r9, int r10) throws javassist.bytecode.BadBytecode {
            r0 = r8
            int r0 = r0.next()
            r11 = r0
            r0 = r8
            r1 = r11
            int r0 = r0.byteAt(r1)
            r12 = r0
            r0 = r12
            r1 = 21
            if (r0 >= r1) goto L14
            return
        L14:
            r0 = r12
            r1 = 79
            if (r0 >= r1) goto L70
            r0 = r12
            r1 = 26
            if (r0 >= r1) goto L2e
            r0 = r8
            r1 = r11
            r2 = r12
            r3 = r9
            r4 = r10
            shiftIndex8(r0, r1, r2, r3, r4)
            goto L11b
        L2e:
            r0 = r12
            r1 = 46
            if (r0 >= r1) goto L45
            r0 = r8
            r1 = r11
            r2 = r12
            r3 = r9
            r4 = r10
            r5 = 26
            r6 = 21
            shiftIndex0(r0, r1, r2, r3, r4, r5, r6)
            goto L11b
        L45:
            r0 = r12
            r1 = 54
            if (r0 >= r1) goto L4d
            return
        L4d:
            r0 = r12
            r1 = 59
            if (r0 >= r1) goto L60
            r0 = r8
            r1 = r11
            r2 = r12
            r3 = r9
            r4 = r10
            shiftIndex8(r0, r1, r2, r3, r4)
            goto L11b
        L60:
            r0 = r8
            r1 = r11
            r2 = r12
            r3 = r9
            r4 = r10
            r5 = 59
            r6 = 54
            shiftIndex0(r0, r1, r2, r3, r4, r5, r6)
            goto L11b
        L70:
            r0 = r12
            r1 = 132(0x84, float:1.85E-43)
            if (r0 != r1) goto Le0
            r0 = r8
            r1 = r11
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r13 = r0
            r0 = r13
            r1 = r9
            if (r0 >= r1) goto L88
            return
        L88:
            r0 = r13
            r1 = r10
            int r0 = r0 + r1
            r13 = r0
            r0 = r13
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto La2
            r0 = r8
            r1 = r13
            r2 = r11
            r3 = 1
            int r2 = r2 + r3
            r0.writeByte(r1, r2)
            goto Ldd
        La2:
            r0 = r8
            r1 = r11
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            byte r0 = (byte) r0
            r14 = r0
            r0 = r8
            r1 = 3
            int r0 = r0.insertExGap(r1)
            r15 = r0
            r0 = r8
            r1 = 196(0xc4, float:2.75E-43)
            r2 = r15
            r3 = 3
            int r2 = r2 - r3
            r0.writeByte(r1, r2)
            r0 = r8
            r1 = 132(0x84, float:1.85E-43)
            r2 = r15
            r3 = 2
            int r2 = r2 - r3
            r0.writeByte(r1, r2)
            r0 = r8
            r1 = r13
            r2 = r15
            r3 = 1
            int r2 = r2 - r3
            r0.write16bit(r1, r2)
            r0 = r8
            r1 = r14
            r2 = r15
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
        Ldd:
            goto L11b
        Le0:
            r0 = r12
            r1 = 169(0xa9, float:2.37E-43)
            if (r0 != r1) goto Lf4
            r0 = r8
            r1 = r11
            r2 = r12
            r3 = r9
            r4 = r10
            shiftIndex8(r0, r1, r2, r3, r4)
            goto L11b
        Lf4:
            r0 = r12
            r1 = 196(0xc4, float:2.75E-43)
            if (r0 != r1) goto L11b
            r0 = r8
            r1 = r11
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)
            r13 = r0
            r0 = r13
            r1 = r9
            if (r0 >= r1) goto L10c
            return
        L10c:
            r0 = r13
            r1 = r10
            int r0 = r0 + r1
            r13 = r0
            r0 = r8
            r1 = r13
            r2 = r11
            r3 = 2
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
        L11b:
            return
    }

    private static void shiftIndex8(javassist.bytecode.CodeIterator r5, int r6, int r7, int r8, int r9) throws javassist.bytecode.BadBytecode {
            r0 = r5
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r10 = r0
            r0 = r10
            r1 = r8
            if (r0 >= r1) goto L10
            return
        L10:
            r0 = r10
            r1 = r9
            int r0 = r0 + r1
            r10 = r0
            r0 = r10
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L2b
            r0 = r5
            r1 = r10
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r0.writeByte(r1, r2)
            goto L4e
        L2b:
            r0 = r5
            r1 = 2
            int r0 = r0.insertExGap(r1)
            r11 = r0
            r0 = r5
            r1 = 196(0xc4, float:2.75E-43)
            r2 = r11
            r3 = 2
            int r2 = r2 - r3
            r0.writeByte(r1, r2)
            r0 = r5
            r1 = r7
            r2 = r11
            r3 = 1
            int r2 = r2 - r3
            r0.writeByte(r1, r2)
            r0 = r5
            r1 = r10
            r2 = r11
            r0.write16bit(r1, r2)
        L4e:
            return
    }

    private static void shiftIndex0(javassist.bytecode.CodeIterator r5, int r6, int r7, int r8, int r9, int r10, int r11) throws javassist.bytecode.BadBytecode {
            r0 = r7
            r1 = r10
            int r0 = r0 - r1
            r1 = 4
            int r0 = r0 % r1
            r12 = r0
            r0 = r12
            r1 = r8
            if (r0 >= r1) goto Lf
            return
        Lf:
            r0 = r12
            r1 = r9
            int r0 = r0 + r1
            r12 = r0
            r0 = r12
            r1 = 4
            if (r0 >= r1) goto L28
            r0 = r5
            r1 = r7
            r2 = r9
            int r1 = r1 + r2
            r2 = r6
            r0.writeByte(r1, r2)
            goto L78
        L28:
            r0 = r7
            r1 = r10
            int r0 = r0 - r1
            r1 = 4
            int r0 = r0 / r1
            r1 = r11
            int r0 = r0 + r1
            r7 = r0
            r0 = r12
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L55
            r0 = r5
            r1 = 1
            int r0 = r0.insertExGap(r1)
            r13 = r0
            r0 = r5
            r1 = r7
            r2 = r13
            r3 = 1
            int r2 = r2 - r3
            r0.writeByte(r1, r2)
            r0 = r5
            r1 = r12
            r2 = r13
            r0.writeByte(r1, r2)
            goto L78
        L55:
            r0 = r5
            r1 = 3
            int r0 = r0.insertExGap(r1)
            r13 = r0
            r0 = r5
            r1 = 196(0xc4, float:2.75E-43)
            r2 = r13
            r3 = 1
            int r2 = r2 - r3
            r0.writeByte(r1, r2)
            r0 = r5
            r1 = r7
            r2 = r13
            r0.writeByte(r1, r2)
            r0 = r5
            r1 = r12
            r2 = r13
            r3 = 1
            int r2 = r2 + r3
            r0.write16bit(r1, r2)
        L78:
            return
    }
}
