package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/InnerClassesAttribute.class */
public class InnerClassesAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "InnerClasses";

    InnerClassesAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    private InnerClassesAttribute(javassist.bytecode.ConstPool r6, byte[] r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "InnerClasses"
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    public InnerClassesAttribute(javassist.bytecode.ConstPool r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "InnerClasses"
            r3 = 2
            byte[] r3 = new byte[r3]
            r0.<init>(r1, r2, r3)
            r0 = 0
            r1 = r5
            byte[] r1 = r1.get()
            r2 = 0
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            return
    }

    public int tableLength() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.get()
            r1 = 0
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public int innerClassIndex(int r5) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.get()
            r1 = r5
            r2 = 8
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public java.lang.String innerClass(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r0 = r0.innerClassIndex(r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r5
            java.lang.String r0 = r0.getClassInfo(r1)
            return r0
    }

    public void setInnerClassIndex(int r6, int r7) {
            r5 = this;
            r0 = r7
            r1 = r5
            byte[] r1 = r1.get()
            r2 = r6
            r3 = 8
            int r2 = r2 * r3
            r3 = 2
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            return
    }

    public int outerClassIndex(int r5) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.get()
            r1 = r5
            r2 = 8
            int r1 = r1 * r2
            r2 = 4
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public java.lang.String outerClass(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r0 = r0.outerClassIndex(r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r5
            java.lang.String r0 = r0.getClassInfo(r1)
            return r0
    }

    public void setOuterClassIndex(int r6, int r7) {
            r5 = this;
            r0 = r7
            r1 = r5
            byte[] r1 = r1.get()
            r2 = r6
            r3 = 8
            int r2 = r2 * r3
            r3 = 4
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            return
    }

    public int innerNameIndex(int r5) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.get()
            r1 = r5
            r2 = 8
            int r1 = r1 * r2
            r2 = 6
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public java.lang.String innerName(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r0 = r0.innerNameIndex(r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r5
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public void setInnerNameIndex(int r6, int r7) {
            r5 = this;
            r0 = r7
            r1 = r5
            byte[] r1 = r1.get()
            r2 = r6
            r3 = 8
            int r2 = r2 * r3
            r3 = 6
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            return
    }

    public int accessFlags(int r5) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.get()
            r1 = r5
            r2 = 8
            int r1 = r1 * r2
            r2 = 8
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public void setAccessFlags(int r6, int r7) {
            r5 = this;
            r0 = r7
            r1 = r5
            byte[] r1 = r1.get()
            r2 = r6
            r3 = 8
            int r2 = r2 * r3
            r3 = 8
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            return
    }

    public int find(java.lang.String r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.tableLength()
            r6 = r0
            r0 = 0
            r7 = r0
        L7:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L20
            r0 = r5
            r1 = r4
            r2 = r7
            java.lang.String r1 = r1.innerClass(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            r0 = r7
            return r0
        L1a:
            int r7 = r7 + 1
            goto L7
        L20:
            r0 = -1
            return r0
    }

    public void append(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10) {
            r6 = this;
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            int r0 = r0.addClassInfo(r1)
            r11 = r0
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r8
            int r0 = r0.addClassInfo(r1)
            r12 = r0
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r9
            int r0 = r0.addUtf8Info(r1)
            r13 = r0
            r0 = r6
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r10
            r0.append(r1, r2, r3, r4)
            return
    }

    public void append(int r6, int r7, int r8, int r9) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.get()
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = r11
            r1 = 8
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            r12 = r0
            r0 = 2
            r13 = r0
        L17:
            r0 = r13
            r1 = r11
            if (r0 >= r1) goto L2e
            r0 = r12
            r1 = r13
            r2 = r10
            r3 = r13
            r2 = r2[r3]
            r0[r1] = r2
            int r13 = r13 + 1
            goto L17
        L2e:
            r0 = r10
            r1 = 0
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r13 = r0
            r0 = r13
            r1 = 1
            int r0 = r0 + r1
            r1 = r12
            r2 = 0
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
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
            r0 = r5
            r1 = r12
            r0.set(r1)
            return
    }

    public int remove(int r6) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.get()
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = r8
            r1 = 10
            if (r0 >= r1) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r7
            r1 = 0
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r9 = r0
            r0 = 2
            r1 = r6
            r2 = 8
            int r1 = r1 * r2
            int r0 = r0 + r1
            r10 = r0
            r0 = r9
            r1 = r6
            if (r0 > r1) goto L28
            r0 = r9
            return r0
        L28:
            r0 = r8
            r1 = 8
            int r0 = r0 - r1
            byte[] r0 = new byte[r0]
            r11 = r0
            r0 = r9
            r1 = 1
            int r0 = r0 - r1
            r1 = r11
            r2 = 0
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = 2
            r12 = r0
            r0 = 2
            r13 = r0
        L40:
            r0 = r12
            r1 = r8
            if (r0 >= r1) goto L65
            r0 = r12
            r1 = r10
            if (r0 != r1) goto L53
            int r12 = r12 + 8
            goto L40
        L53:
            r0 = r11
            r1 = r13
            int r13 = r13 + 1
            r2 = r7
            r3 = r12
            int r12 = r12 + 1
            r2 = r2[r3]
            r0[r1] = r2
            goto L40
        L65:
            r0 = r5
            r1 = r11
            r0.set(r1)
            r0 = r9
            r1 = 1
            int r0 = r0 - r1
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
            javassist.bytecode.InnerClassesAttribute r0 = new javassist.bytecode.InnerClassesAttribute
            r1 = r0
            r2 = r6
            r3 = r9
            r1.<init>(r2, r3)
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
        L32:
            r0 = r14
            r1 = r12
            if (r0 >= r1) goto Lc4
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
            r0 = r15
            if (r0 == 0) goto L70
            r0 = r10
            r1 = r15
            r2 = r6
            r3 = r7
            int r0 = r0.copy(r1, r2, r3)
            r15 = r0
        L70:
            r0 = r15
            r1 = r9
            r2 = r13
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r16
            if (r0 == 0) goto L89
            r0 = r10
            r1 = r16
            r2 = r6
            r3 = r7
            int r0 = r0.copy(r1, r2, r3)
            r16 = r0
        L89:
            r0 = r16
            r1 = r9
            r2 = r13
            r3 = 2
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r17
            if (r0 == 0) goto La4
            r0 = r10
            r1 = r17
            r2 = r6
            r3 = r7
            int r0 = r0.copy(r1, r2, r3)
            r17 = r0
        La4:
            r0 = r17
            r1 = r9
            r2 = r13
            r3 = 4
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            r0 = r18
            r1 = r9
            r2 = r13
            r3 = 6
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            int r13 = r13 + 8
            int r14 = r14 + 1
            goto L32
        Lc4:
            r0 = r11
            return r0
    }
}
