package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/LocalVariableAttribute.class */
public class LocalVariableAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "LocalVariableTable";
    public static final java.lang.String typeTag = "LocalVariableTypeTable";

    public LocalVariableAttribute(javassist.bytecode.ConstPool r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "LocalVariableTable"
            r3 = 2
            byte[] r3 = new byte[r3]
            r0.<init>(r1, r2, r3)
            r0 = 0
            r1 = r5
            byte[] r1 = r1.info
            r2 = 0
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            return
    }

    @java.lang.Deprecated
    public LocalVariableAttribute(javassist.bytecode.ConstPool r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 2
            byte[] r3 = new byte[r3]
            r0.<init>(r1, r2, r3)
            r0 = 0
            r1 = r5
            byte[] r1 = r1.info
            r2 = 0
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            return
    }

    LocalVariableAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    LocalVariableAttribute(javassist.bytecode.ConstPool r6, java.lang.String r7, byte[] r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public void addEntry(int r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.info
            int r0 = r0.length
            r11 = r0
            r0 = r11
            r1 = 10
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            r12 = r0
            r0 = r5
            int r0 = r0.tableLength()
            r1 = 1
            int r0 = r0 + r1
            r1 = r12
            r2 = 0
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = 2
            r13 = r0
        L1f:
            r0 = r13
            r1 = r11
            if (r0 >= r1) goto L38
            r0 = r12
            r1 = r13
            r2 = r5
            byte[] r2 = r2.info
            r3 = r13
            r2 = r2[r3]
            r0[r1] = r2
            int r13 = r13 + 1
            goto L1f
        L38:
            r0 = r6
            r1 = r12
            r2 = r11
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r7
            r1 = r12
            r2 = r11
            r3 = 2
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r8
            r1 = r12
            r2 = r11
            r3 = 4
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r9
            r1 = r12
            r2 = r11
            r3 = 6
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r10
            r1 = r12
            r2 = r11
            r3 = 8
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r5
            r1 = r12
            r0.info = r1
            return
    }

    @Override // javassist.bytecode.AttributeInfo
    void renameClass(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r8 = r0
            r0 = r5
            int r0 = r0.tableLength()
            r9 = r0
            r0 = 0
            r10 = r0
        Le:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L5b
            r0 = r10
            r1 = 10
            int r0 = r0 * r1
            r1 = 2
            int r0 = r0 + r1
            r11 = r0
            r0 = r5
            byte[] r0 = r0.info
            r1 = r11
            r2 = 6
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L55
            r0 = r8
            r1 = r12
            java.lang.String r0 = r0.getUtf8Info(r1)
            r13 = r0
            r0 = r5
            r1 = r13
            r2 = r6
            r3 = r7
            java.lang.String r0 = r0.renameEntry(r1, r2, r3)
            r13 = r0
            r0 = r8
            r1 = r13
            int r0 = r0.addUtf8Info(r1)
            r1 = r5
            byte[] r1 = r1.info
            r2 = r11
            r3 = 6
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
        L55:
            int r10 = r10 + 1
            goto Le
        L5b:
            return
    }

    java.lang.String renameEntry(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1, r2)
            return r0
    }

    @Override // javassist.bytecode.AttributeInfo
    void renameClass(java.util.Map<java.lang.String, java.lang.String> r6) {
            r5 = this;
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r7 = r0
            r0 = r5
            int r0 = r0.tableLength()
            r8 = r0
            r0 = 0
            r9 = r0
        Ld:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L58
            r0 = r9
            r1 = 10
            int r0 = r0 * r1
            r1 = 2
            int r0 = r0 + r1
            r10 = r0
            r0 = r5
            byte[] r0 = r0.info
            r1 = r10
            r2 = 6
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L52
            r0 = r7
            r1 = r11
            java.lang.String r0 = r0.getUtf8Info(r1)
            r12 = r0
            r0 = r5
            r1 = r12
            r2 = r6
            java.lang.String r0 = r0.renameEntry(r1, r2)
            r12 = r0
            r0 = r7
            r1 = r12
            int r0 = r0.addUtf8Info(r1)
            r1 = r5
            byte[] r1 = r1.info
            r2 = r10
            r3 = 6
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
        L52:
            int r9 = r9 + 1
            goto Ld
        L58:
            return
    }

    java.lang.String renameEntry(java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
            r3 = this;
            r0 = r4
            r1 = r5
            java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1)
            return r0
    }

    public void shiftIndex(int r6, int r7) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.info
            int r0 = r0.length
            r8 = r0
            r0 = 2
            r9 = r0
        L9:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L39
            r0 = r5
            byte[] r0 = r0.info
            r1 = r9
            r2 = 8
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r10 = r0
            r0 = r10
            r1 = r6
            if (r0 < r1) goto L33
            r0 = r10
            r1 = r7
            int r0 = r0 + r1
            r1 = r5
            byte[] r1 = r1.info
            r2 = r9
            r3 = 8
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
        L33:
            int r9 = r9 + 10
            goto L9
        L39:
            return
    }

    public int tableLength() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.info
            r1 = 0
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public int startPc(int r5) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.info
            r1 = r5
            r2 = 10
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public int codeLength(int r5) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.info
            r1 = r5
            r2 = 10
            int r1 = r1 * r2
            r2 = 4
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    void shiftPc(int r6, int r7, boolean r8) {
            r5 = this;
            r0 = r5
            int r0 = r0.tableLength()
            r9 = r0
            r0 = 0
            r10 = r0
        L9:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L81
            r0 = r10
            r1 = 10
            int r0 = r0 * r1
            r1 = 2
            int r0 = r0 + r1
            r11 = r0
            r0 = r5
            byte[] r0 = r0.info
            r1 = r11
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r12 = r0
            r0 = r5
            byte[] r0 = r0.info
            r1 = r11
            r2 = 2
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r13 = r0
            r0 = r12
            r1 = r6
            if (r0 > r1) goto L46
            r0 = r8
            if (r0 == 0) goto L56
            r0 = r12
            r1 = r6
            if (r0 != r1) goto L56
            r0 = r12
            if (r0 == 0) goto L56
        L46:
            r0 = r12
            r1 = r7
            int r0 = r0 + r1
            r1 = r5
            byte[] r1 = r1.info
            r2 = r11
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            goto L7b
        L56:
            r0 = r12
            r1 = r13
            int r0 = r0 + r1
            r1 = r6
            if (r0 > r1) goto L6c
            r0 = r8
            if (r0 == 0) goto L7b
            r0 = r12
            r1 = r13
            int r0 = r0 + r1
            r1 = r6
            if (r0 != r1) goto L7b
        L6c:
            r0 = r13
            r1 = r7
            int r0 = r0 + r1
            r1 = r5
            byte[] r1 = r1.info
            r2 = r11
            r3 = 2
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
        L7b:
            int r10 = r10 + 1
            goto L9
        L81:
            return
    }

    public int nameIndex(int r5) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.info
            r1 = r5
            r2 = 10
            int r1 = r1 * r2
            r2 = 6
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public java.lang.String variableName(int r5) {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r4
            r2 = r5
            int r1 = r1.nameIndex(r2)
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public java.lang.String variableNameByIndex(int r4) {
            r3 = this;
            r0 = 0
            r5 = r0
        L2:
            r0 = r5
            r1 = r3
            int r1 = r1.tableLength()
            if (r0 >= r1) goto L1f
            r0 = r3
            r1 = r5
            int r0 = r0.index(r1)
            r1 = r4
            if (r0 != r1) goto L19
            r0 = r3
            r1 = r5
            java.lang.String r0 = r0.variableName(r1)
            return r0
        L19:
            int r5 = r5 + 1
            goto L2
        L1f:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public int descriptorIndex(int r5) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.info
            r1 = r5
            r2 = 10
            int r1 = r1 * r2
            r2 = 8
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public int signatureIndex(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r0 = r0.descriptorIndex(r1)
            return r0
    }

    public java.lang.String descriptor(int r5) {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r4
            r2 = r5
            int r1 = r1.descriptorIndex(r2)
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public java.lang.String signature(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.descriptor(r1)
            return r0
    }

    public int index(int r5) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.info
            r1 = r5
            r2 = 10
            int r1 = r1 * r2
            r2 = 10
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r6, java.util.Map<java.lang.String, java.lang.String> r7) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.get()
            r8 = r0
            r0 = r8
            int r0 = r0.length
            byte[] r0 = new byte[r0]
            r9 = r0
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r10 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            javassist.bytecode.LocalVariableAttribute r0 = r0.makeThisAttr(r1, r2)
            r11 = r0
            r0 = r8
            r1 = 0
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r12 = r0
            r0 = r12
            r1 = r9
            r2 = 0
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = 2
            r13 = r0
            r0 = 0
            r14 = r0
        L2f:
            r0 = r14
            r1 = r12
            if (r0 >= r1) goto Ld6
            r0 = r8
            r1 = r13
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r15 = r0
            r0 = r8
            r1 = r13
            r2 = 2
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r16 = r0
            r0 = r8
            r1 = r13
            r2 = 4
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r17 = r0
            r0 = r8
            r1 = r13
            r2 = 6
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r18 = r0
            r0 = r8
            r1 = r13
            r2 = 8
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r19 = r0
            r0 = r15
            r1 = r9
            r2 = r13
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r16
            r1 = r9
            r2 = r13
            r3 = 2
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r17
            if (r0 == 0) goto L8c
            r0 = r10
            r1 = r17
            r2 = r6
            r3 = 0
            int r0 = r0.copy(r1, r2, r3)
            r17 = r0
        L8c:
            r0 = r17
            r1 = r9
            r2 = r13
            r3 = 4
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r18
            if (r0 == 0) goto Lb5
            r0 = r10
            r1 = r18
            java.lang.String r0 = r0.getUtf8Info(r1)
            r20 = r0
            r0 = r20
            r1 = r7
            java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1)
            r20 = r0
            r0 = r6
            r1 = r20
            int r0 = r0.addUtf8Info(r1)
            r18 = r0
        Lb5:
            r0 = r18
            r1 = r9
            r2 = r13
            r3 = 6
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r19
            r1 = r9
            r2 = r13
            r3 = 8
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            int r13 = r13 + 10
            int r14 = r14 + 1
            goto L2f
        Ld6:
            r0 = r11
            return r0
    }

    javassist.bytecode.LocalVariableAttribute makeThisAttr(javassist.bytecode.ConstPool r7, byte[] r8) {
            r6 = this;
            javassist.bytecode.LocalVariableAttribute r0 = new javassist.bytecode.LocalVariableAttribute
            r1 = r0
            r2 = r7
            java.lang.String r3 = "LocalVariableTable"
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }
}
