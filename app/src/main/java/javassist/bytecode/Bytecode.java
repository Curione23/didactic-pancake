package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/Bytecode.class */
public class Bytecode extends javassist.bytecode.ByteVector implements java.lang.Cloneable, javassist.bytecode.Opcode {
    public static final javassist.CtClass THIS = null;
    javassist.bytecode.ConstPool constPool;
    int maxStack;
    int maxLocals;
    javassist.bytecode.ExceptionTable tryblocks;
    private int stackDepth;

    public Bytecode(javassist.bytecode.ConstPool r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = r6
            r0.constPool = r1
            r0 = r5
            r1 = r7
            r0.maxStack = r1
            r0 = r5
            r1 = r8
            r0.maxLocals = r1
            r0 = r5
            javassist.bytecode.ExceptionTable r1 = new javassist.bytecode.ExceptionTable
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.tryblocks = r1
            r0 = r5
            r1 = 0
            r0.stackDepth = r1
            return
    }

    public Bytecode(javassist.bytecode.ConstPool r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // javassist.bytecode.ByteVector
    public java.lang.Object clone() {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L18
            javassist.bytecode.Bytecode r0 = (javassist.bytecode.Bytecode) r0     // Catch: java.lang.CloneNotSupportedException -> L18
            r5 = r0
            r0 = r5
            r1 = r4
            javassist.bytecode.ExceptionTable r1 = r1.tryblocks     // Catch: java.lang.CloneNotSupportedException -> L18
            java.lang.Object r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> L18
            javassist.bytecode.ExceptionTable r1 = (javassist.bytecode.ExceptionTable) r1     // Catch: java.lang.CloneNotSupportedException -> L18
            r0.tryblocks = r1     // Catch: java.lang.CloneNotSupportedException -> L18
            r0 = r5
            return r0
        L18:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }

    public javassist.bytecode.ConstPool getConstPool() {
            r2 = this;
            r0 = r2
            javassist.bytecode.ConstPool r0 = r0.constPool
            return r0
    }

    public javassist.bytecode.ExceptionTable getExceptionTable() {
            r2 = this;
            r0 = r2
            javassist.bytecode.ExceptionTable r0 = r0.tryblocks
            return r0
    }

    public javassist.bytecode.CodeAttribute toCodeAttribute() {
            r8 = this;
            javassist.bytecode.CodeAttribute r0 = new javassist.bytecode.CodeAttribute
            r1 = r0
            r2 = r8
            javassist.bytecode.ConstPool r2 = r2.constPool
            r3 = r8
            int r3 = r3.maxStack
            r4 = r8
            int r4 = r4.maxLocals
            r5 = r8
            byte[] r5 = r5.get()
            r6 = r8
            javassist.bytecode.ExceptionTable r6 = r6.tryblocks
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    public int length() {
            r2 = this;
            r0 = r2
            int r0 = r0.getSize()
            return r0
    }

    public byte[] get() {
            r2 = this;
            r0 = r2
            byte[] r0 = r0.copy()
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

    public void setMaxLocals(boolean r4, javassist.CtClass[] r5, int r6) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto L7
            int r6 = r6 + 1
        L7:
            r0 = r5
            if (r0 == 0) goto L46
            javassist.CtClass r0 = javassist.CtClass.doubleType
            r7 = r0
            javassist.CtClass r0 = javassist.CtClass.longType
            r8 = r0
            r0 = r5
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r10 = r0
        L1c:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L46
            r0 = r5
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            r1 = r7
            if (r0 == r1) goto L37
            r0 = r11
            r1 = r8
            if (r0 != r1) goto L3d
        L37:
            int r6 = r6 + 2
            goto L40
        L3d:
            int r6 = r6 + 1
        L40:
            int r10 = r10 + 1
            goto L1c
        L46:
            r0 = r3
            r1 = r6
            r0.maxLocals = r1
            return
    }

    public void incMaxLocals(int r5) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.maxLocals
            r2 = r5
            int r1 = r1 + r2
            r0.maxLocals = r1
            return
    }

    public void addExceptionHandler(int r8, int r9, int r10, javassist.CtClass r11) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r7
            javassist.bytecode.ConstPool r4 = r4.constPool
            r5 = r11
            int r4 = r4.addClassInfo(r5)
            r0.addExceptionHandler(r1, r2, r3, r4)
            return
    }

    public void addExceptionHandler(int r8, int r9, int r10, java.lang.String r11) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r7
            javassist.bytecode.ConstPool r4 = r4.constPool
            r5 = r11
            int r4 = r4.addClassInfo(r5)
            r0.addExceptionHandler(r1, r2, r3, r4)
            return
    }

    public void addExceptionHandler(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            javassist.bytecode.ExceptionTable r0 = r0.tryblocks
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.add(r1, r2, r3, r4)
            return
    }

    public int currentPc() {
            r2 = this;
            r0 = r2
            int r0 = r0.getSize()
            return r0
    }

    @Override // javassist.bytecode.ByteVector
    public int read(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r0 = super.read(r1)
            return r0
    }

    public int read16bit(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            int r0 = r0.read(r1)
            r6 = r0
            r0 = r4
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.read(r1)
            r7 = r0
            r0 = r6
            r1 = 8
            int r0 = r0 << r1
            r1 = r7
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            int r0 = r0 + r1
            return r0
    }

    public int read32bit(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            int r0 = r0.read16bit(r1)
            r6 = r0
            r0 = r4
            r1 = r5
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.read16bit(r1)
            r7 = r0
            r0 = r6
            r1 = 16
            int r0 = r0 << r1
            r1 = r7
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            int r0 = r0 + r1
            return r0
    }

    @Override // javassist.bytecode.ByteVector
    public void write(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            super.write(r1, r2)
            return
    }

    public void write16bit(int r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 8
            int r2 = r2 >> r3
            r0.write(r1, r2)
            r0 = r5
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r2 = r7
            r0.write(r1, r2)
            return
    }

    public void write32bit(int r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 16
            int r2 = r2 >> r3
            r0.write16bit(r1, r2)
            r0 = r5
            r1 = r6
            r2 = 2
            int r1 = r1 + r2
            r2 = r7
            r0.write16bit(r1, r2)
            return
    }

    @Override // javassist.bytecode.ByteVector
    public void add(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.add(r1)
            return
    }

    public void add32bit(int r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = 24
            int r1 = r1 >> r2
            r2 = r7
            r3 = 16
            int r2 = r2 >> r3
            r3 = r7
            r4 = 8
            int r3 = r3 >> r4
            r4 = r7
            r0.add(r1, r2, r3, r4)
            return
    }

    @Override // javassist.bytecode.ByteVector
    public void addGap(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.addGap(r1)
            return
    }

    public void addOpcode(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.add(r1)
            r0 = r4
            int[] r1 = javassist.bytecode.Bytecode.STACK_GROW
            r2 = r5
            r1 = r1[r2]
            r0.growStack(r1)
            return
    }

    public void growStack(int r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            int r1 = r1.stackDepth
            r2 = r5
            int r1 = r1 + r2
            r0.setStackDepth(r1)
            return
    }

    public int getStackDepth() {
            r2 = this;
            r0 = r2
            int r0 = r0.stackDepth
            return r0
    }

    public void setStackDepth(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.stackDepth = r1
            r0 = r3
            int r0 = r0.stackDepth
            r1 = r3
            int r1 = r1.maxStack
            if (r0 <= r1) goto L18
            r0 = r3
            r1 = r3
            int r1 = r1.stackDepth
            r0.maxStack = r1
        L18:
            return
    }

    public void addIndex(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 8
            int r1 = r1 >> r2
            r2 = r5
            r0.add(r1, r2)
            return
    }

    public void addAload(int r5) {
            r4 = this;
            r0 = r5
            r1 = 4
            if (r0 >= r1) goto L10
            r0 = r4
            r1 = 42
            r2 = r5
            int r1 = r1 + r2
            r0.addOpcode(r1)
            goto L37
        L10:
            r0 = r5
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L25
            r0 = r4
            r1 = 25
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.add(r1)
            goto L37
        L25:
            r0 = r4
            r1 = 196(0xc4, float:2.75E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = 25
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.addIndex(r1)
        L37:
            return
    }

    public void addAstore(int r5) {
            r4 = this;
            r0 = r5
            r1 = 4
            if (r0 >= r1) goto L10
            r0 = r4
            r1 = 75
            r2 = r5
            int r1 = r1 + r2
            r0.addOpcode(r1)
            goto L37
        L10:
            r0 = r5
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L25
            r0 = r4
            r1 = 58
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.add(r1)
            goto L37
        L25:
            r0 = r4
            r1 = 196(0xc4, float:2.75E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = 58
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.addIndex(r1)
        L37:
            return
    }

    public void addIconst(int r5) {
            r4 = this;
            r0 = r5
            r1 = 6
            if (r0 >= r1) goto L16
            r0 = -2
            r1 = r5
            if (r0 >= r1) goto L16
            r0 = r4
            r1 = 3
            r2 = r5
            int r1 = r1 + r2
            r0.addOpcode(r1)
            goto L60
        L16:
            r0 = r5
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L30
            r0 = -128(0xffffffffffffff80, float:NaN)
            r1 = r5
            if (r0 > r1) goto L30
            r0 = r4
            r1 = 16
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.add(r1)
            goto L60
        L30:
            r0 = r5
            r1 = 32767(0x7fff, float:4.5916E-41)
            if (r0 > r1) goto L54
            r0 = -32768(0xffffffffffff8000, float:NaN)
            r1 = r5
            if (r0 > r1) goto L54
            r0 = r4
            r1 = 17
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r2 = 8
            int r1 = r1 >> r2
            r0.add(r1)
            r0 = r4
            r1 = r5
            r0.add(r1)
            goto L60
        L54:
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            int r1 = r1.addIntegerInfo(r2)
            r0.addLdc(r1)
        L60:
            return
    }

    public void addConstZero(javassist.CtClass r5) {
            r4 = this;
            r0 = r5
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L50
            r0 = r5
            javassist.CtClass r1 = javassist.CtClass.longType
            if (r0 != r1) goto L17
            r0 = r4
            r1 = 9
            r0.addOpcode(r1)
            goto L55
        L17:
            r0 = r5
            javassist.CtClass r1 = javassist.CtClass.floatType
            if (r0 != r1) goto L27
            r0 = r4
            r1 = 11
            r0.addOpcode(r1)
            goto L55
        L27:
            r0 = r5
            javassist.CtClass r1 = javassist.CtClass.doubleType
            if (r0 != r1) goto L37
            r0 = r4
            r1 = 14
            r0.addOpcode(r1)
            goto L55
        L37:
            r0 = r5
            javassist.CtClass r1 = javassist.CtClass.voidType
            if (r0 != r1) goto L48
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "void type?"
            r1.<init>(r2)
            throw r0
        L48:
            r0 = r4
            r1 = 3
            r0.addOpcode(r1)
            goto L55
        L50:
            r0 = r4
            r1 = 1
            r0.addOpcode(r1)
        L55:
            return
    }

    public void addIload(int r5) {
            r4 = this;
            r0 = r5
            r1 = 4
            if (r0 >= r1) goto L10
            r0 = r4
            r1 = 26
            r2 = r5
            int r1 = r1 + r2
            r0.addOpcode(r1)
            goto L37
        L10:
            r0 = r5
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L25
            r0 = r4
            r1 = 21
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.add(r1)
            goto L37
        L25:
            r0 = r4
            r1 = 196(0xc4, float:2.75E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = 21
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.addIndex(r1)
        L37:
            return
    }

    public void addIstore(int r5) {
            r4 = this;
            r0 = r5
            r1 = 4
            if (r0 >= r1) goto L10
            r0 = r4
            r1 = 59
            r2 = r5
            int r1 = r1 + r2
            r0.addOpcode(r1)
            goto L37
        L10:
            r0 = r5
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L25
            r0 = r4
            r1 = 54
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.add(r1)
            goto L37
        L25:
            r0 = r4
            r1 = 196(0xc4, float:2.75E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = 54
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.addIndex(r1)
        L37:
            return
    }

    public void addLconst(long r6) {
            r5 = this;
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = 1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L18
        Lc:
            r0 = r5
            r1 = 9
            r2 = r6
            int r2 = (int) r2
            int r1 = r1 + r2
            r0.addOpcode(r1)
            goto L1d
        L18:
            r0 = r5
            r1 = r6
            r0.addLdc2w(r1)
        L1d:
            return
    }

    public void addLload(int r5) {
            r4 = this;
            r0 = r5
            r1 = 4
            if (r0 >= r1) goto L10
            r0 = r4
            r1 = 30
            r2 = r5
            int r1 = r1 + r2
            r0.addOpcode(r1)
            goto L37
        L10:
            r0 = r5
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L25
            r0 = r4
            r1 = 22
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.add(r1)
            goto L37
        L25:
            r0 = r4
            r1 = 196(0xc4, float:2.75E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = 22
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.addIndex(r1)
        L37:
            return
    }

    public void addLstore(int r5) {
            r4 = this;
            r0 = r5
            r1 = 4
            if (r0 >= r1) goto L10
            r0 = r4
            r1 = 63
            r2 = r5
            int r1 = r1 + r2
            r0.addOpcode(r1)
            goto L37
        L10:
            r0 = r5
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L25
            r0 = r4
            r1 = 55
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.add(r1)
            goto L37
        L25:
            r0 = r4
            r1 = 196(0xc4, float:2.75E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = 55
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.addIndex(r1)
        L37:
            return
    }

    public void addDconst(double r6) {
            r5 = this;
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L18
        Lc:
            r0 = r5
            r1 = 14
            r2 = r6
            int r2 = (int) r2
            int r1 = r1 + r2
            r0.addOpcode(r1)
            goto L1d
        L18:
            r0 = r5
            r1 = r6
            r0.addLdc2w(r1)
        L1d:
            return
    }

    public void addDload(int r5) {
            r4 = this;
            r0 = r5
            r1 = 4
            if (r0 >= r1) goto L10
            r0 = r4
            r1 = 38
            r2 = r5
            int r1 = r1 + r2
            r0.addOpcode(r1)
            goto L37
        L10:
            r0 = r5
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L25
            r0 = r4
            r1 = 24
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.add(r1)
            goto L37
        L25:
            r0 = r4
            r1 = 196(0xc4, float:2.75E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = 24
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.addIndex(r1)
        L37:
            return
    }

    public void addDstore(int r5) {
            r4 = this;
            r0 = r5
            r1 = 4
            if (r0 >= r1) goto L10
            r0 = r4
            r1 = 71
            r2 = r5
            int r1 = r1 + r2
            r0.addOpcode(r1)
            goto L37
        L10:
            r0 = r5
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L25
            r0 = r4
            r1 = 57
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.add(r1)
            goto L37
        L25:
            r0 = r4
            r1 = 196(0xc4, float:2.75E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = 57
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.addIndex(r1)
        L37:
            return
    }

    public void addFconst(float r5) {
            r4 = this;
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L12
            r0 = r5
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L12
            r0 = r5
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1e
        L12:
            r0 = r4
            r1 = 11
            r2 = r5
            int r2 = (int) r2
            int r1 = r1 + r2
            r0.addOpcode(r1)
            goto L2a
        L1e:
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            int r1 = r1.addFloatInfo(r2)
            r0.addLdc(r1)
        L2a:
            return
    }

    public void addFload(int r5) {
            r4 = this;
            r0 = r5
            r1 = 4
            if (r0 >= r1) goto L10
            r0 = r4
            r1 = 34
            r2 = r5
            int r1 = r1 + r2
            r0.addOpcode(r1)
            goto L37
        L10:
            r0 = r5
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L25
            r0 = r4
            r1 = 23
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.add(r1)
            goto L37
        L25:
            r0 = r4
            r1 = 196(0xc4, float:2.75E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = 23
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.addIndex(r1)
        L37:
            return
    }

    public void addFstore(int r5) {
            r4 = this;
            r0 = r5
            r1 = 4
            if (r0 >= r1) goto L10
            r0 = r4
            r1 = 67
            r2 = r5
            int r1 = r1 + r2
            r0.addOpcode(r1)
            goto L37
        L10:
            r0 = r5
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L25
            r0 = r4
            r1 = 56
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.add(r1)
            goto L37
        L25:
            r0 = r4
            r1 = 196(0xc4, float:2.75E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = 56
            r0.addOpcode(r1)
            r0 = r4
            r1 = r5
            r0.addIndex(r1)
        L37:
            return
    }

    public int addLoad(int r5, javassist.CtClass r6) {
            r4 = this;
            r0 = r6
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L67
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.booleanType
            if (r0 == r1) goto L2a
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.charType
            if (r0 == r1) goto L2a
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.byteType
            if (r0 == r1) goto L2a
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.shortType
            if (r0 == r1) goto L2a
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.intType
            if (r0 != r1) goto L32
        L2a:
            r0 = r4
            r1 = r5
            r0.addIload(r1)
            goto L6c
        L32:
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.longType
            if (r0 != r1) goto L40
            r0 = r4
            r1 = r5
            r0.addLload(r1)
            r0 = 2
            return r0
        L40:
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.floatType
            if (r0 != r1) goto L4f
            r0 = r4
            r1 = r5
            r0.addFload(r1)
            goto L6c
        L4f:
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.doubleType
            if (r0 != r1) goto L5d
            r0 = r4
            r1 = r5
            r0.addDload(r1)
            r0 = 2
            return r0
        L5d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "void type?"
            r1.<init>(r2)
            throw r0
        L67:
            r0 = r4
            r1 = r5
            r0.addAload(r1)
        L6c:
            r0 = 1
            return r0
    }

    public int addStore(int r5, javassist.CtClass r6) {
            r4 = this;
            r0 = r6
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L67
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.booleanType
            if (r0 == r1) goto L2a
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.charType
            if (r0 == r1) goto L2a
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.byteType
            if (r0 == r1) goto L2a
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.shortType
            if (r0 == r1) goto L2a
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.intType
            if (r0 != r1) goto L32
        L2a:
            r0 = r4
            r1 = r5
            r0.addIstore(r1)
            goto L6c
        L32:
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.longType
            if (r0 != r1) goto L40
            r0 = r4
            r1 = r5
            r0.addLstore(r1)
            r0 = 2
            return r0
        L40:
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.floatType
            if (r0 != r1) goto L4f
            r0 = r4
            r1 = r5
            r0.addFstore(r1)
            goto L6c
        L4f:
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.doubleType
            if (r0 != r1) goto L5d
            r0 = r4
            r1 = r5
            r0.addDstore(r1)
            r0 = 2
            return r0
        L5d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "void type?"
            r1.<init>(r2)
            throw r0
        L67:
            r0 = r4
            r1 = r5
            r0.addAstore(r1)
        L6c:
            r0 = 1
            return r0
    }

    public int addLoadParameters(javassist.CtClass[] r7, int r8) {
            r6 = this;
            r0 = 0
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L28
            r0 = r7
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        Ld:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L28
            r0 = r9
            r1 = r6
            r2 = r9
            r3 = r8
            int r2 = r2 + r3
            r3 = r7
            r4 = r11
            r3 = r3[r4]
            int r1 = r1.addLoad(r2, r3)
            int r0 = r0 + r1
            r9 = r0
            int r11 = r11 + 1
            goto Ld
        L28:
            r0 = r9
            return r0
    }

    public void addCheckcast(javassist.CtClass r5) {
            r4 = this;
            r0 = r4
            r1 = 192(0xc0, float:2.69E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            int r1 = r1.addClassInfo(r2)
            r0.addIndex(r1)
            return
    }

    public void addCheckcast(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = 192(0xc0, float:2.69E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            int r1 = r1.addClassInfo(r2)
            r0.addIndex(r1)
            return
    }

    public void addInstanceof(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = 193(0xc1, float:2.7E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            int r1 = r1.addClassInfo(r2)
            r0.addIndex(r1)
            return
    }

    public void addGetfield(javassist.CtClass r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r1 = 180(0xb4, float:2.52E-43)
            r0.add(r1)
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            int r0 = r0.addClassInfo(r1)
            r10 = r0
            r0 = r6
            r1 = r6
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r10
            r3 = r8
            r4 = r9
            int r1 = r1.addFieldrefInfo(r2, r3, r4)
            r0.addIndex(r1)
            r0 = r6
            r1 = r9
            int r1 = javassist.bytecode.Descriptor.dataSize(r1)
            r2 = 1
            int r1 = r1 - r2
            r0.growStack(r1)
            return
    }

    public void addGetfield(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r1 = 180(0xb4, float:2.52E-43)
            r0.add(r1)
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            int r0 = r0.addClassInfo(r1)
            r10 = r0
            r0 = r6
            r1 = r6
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r10
            r3 = r8
            r4 = r9
            int r1 = r1.addFieldrefInfo(r2, r3, r4)
            r0.addIndex(r1)
            r0 = r6
            r1 = r9
            int r1 = javassist.bytecode.Descriptor.dataSize(r1)
            r2 = 1
            int r1 = r1 - r2
            r0.growStack(r1)
            return
    }

    public void addGetstatic(javassist.CtClass r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r1 = 178(0xb2, float:2.5E-43)
            r0.add(r1)
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            int r0 = r0.addClassInfo(r1)
            r10 = r0
            r0 = r6
            r1 = r6
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r10
            r3 = r8
            r4 = r9
            int r1 = r1.addFieldrefInfo(r2, r3, r4)
            r0.addIndex(r1)
            r0 = r6
            r1 = r9
            int r1 = javassist.bytecode.Descriptor.dataSize(r1)
            r0.growStack(r1)
            return
    }

    public void addGetstatic(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r1 = 178(0xb2, float:2.5E-43)
            r0.add(r1)
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            int r0 = r0.addClassInfo(r1)
            r10 = r0
            r0 = r6
            r1 = r6
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r10
            r3 = r8
            r4 = r9
            int r1 = r1.addFieldrefInfo(r2, r3, r4)
            r0.addIndex(r1)
            r0 = r6
            r1 = r9
            int r1 = javassist.bytecode.Descriptor.dataSize(r1)
            r0.growStack(r1)
            return
    }

    public void addInvokespecial(javassist.CtClass r6, java.lang.String r7, javassist.CtClass r8, javassist.CtClass[] r9) {
            r5 = this;
            r0 = r8
            r1 = r9
            java.lang.String r0 = javassist.bytecode.Descriptor.ofMethod(r0, r1)
            r10 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r10
            r0.addInvokespecial(r1, r2, r3)
            return
    }

    public void addInvokespecial(javassist.CtClass r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r7
            if (r0 != 0) goto L8
            r0 = 0
            goto Lc
        L8:
            r0 = r7
            boolean r0 = r0.isInterface()
        Lc:
            r10 = r0
            r0 = r6
            r1 = r10
            r2 = r6
            javassist.bytecode.ConstPool r2 = r2.constPool
            r3 = r7
            int r2 = r2.addClassInfo(r3)
            r3 = r8
            r4 = r9
            r0.addInvokespecial(r1, r2, r3, r4)
            return
    }

    public void addInvokespecial(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r1 = 0
            r2 = r6
            javassist.bytecode.ConstPool r2 = r2.constPool
            r3 = r7
            int r2 = r2.addClassInfo(r3)
            r3 = r8
            r4 = r9
            r0.addInvokespecial(r1, r2, r3, r4)
            return
    }

    public void addInvokespecial(int r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r1 = 0
            r2 = r7
            r3 = r8
            r4 = r9
            r0.addInvokespecial(r1, r2, r3, r4)
            return
    }

    public void addInvokespecial(boolean r6, int r7, java.lang.String r8, java.lang.String r9) {
            r5 = this;
            r0 = r6
            if (r0 == 0) goto L14
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            r2 = r8
            r3 = r9
            int r0 = r0.addInterfaceMethodrefInfo(r1, r2, r3)
            r10 = r0
            goto L21
        L14:
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            r2 = r8
            r3 = r9
            int r0 = r0.addMethodrefInfo(r1, r2, r3)
            r10 = r0
        L21:
            r0 = r5
            r1 = r10
            r2 = r9
            r0.addInvokespecial(r1, r2)
            return
    }

    public void addInvokespecial(int r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r1 = 183(0xb7, float:2.56E-43)
            r0.add(r1)
            r0 = r4
            r1 = r5
            r0.addIndex(r1)
            r0 = r4
            r1 = r6
            int r1 = javassist.bytecode.Descriptor.dataSize(r1)
            r2 = 1
            int r1 = r1 - r2
            r0.growStack(r1)
            return
    }

    public void addInvokestatic(javassist.CtClass r6, java.lang.String r7, javassist.CtClass r8, javassist.CtClass[] r9) {
            r5 = this;
            r0 = r8
            r1 = r9
            java.lang.String r0 = javassist.bytecode.Descriptor.ofMethod(r0, r1)
            r10 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r10
            r0.addInvokestatic(r1, r2, r3)
            return
    }

    public void addInvokestatic(javassist.CtClass r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r7
            javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
            if (r0 != r1) goto Ld
            r0 = 0
            r10 = r0
            goto L13
        Ld:
            r0 = r7
            boolean r0 = r0.isInterface()
            r10 = r0
        L13:
            r0 = r6
            r1 = r6
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r7
            int r1 = r1.addClassInfo(r2)
            r2 = r8
            r3 = r9
            r4 = r10
            r0.addInvokestatic(r1, r2, r3, r4)
            return
    }

    public void addInvokestatic(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            r1 = r5
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r6
            int r1 = r1.addClassInfo(r2)
            r2 = r7
            r3 = r8
            r0.addInvokestatic(r1, r2, r3)
            return
    }

    public void addInvokestatic(int r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 0
            r0.addInvokestatic(r1, r2, r3, r4)
            return
    }

    private void addInvokestatic(int r6, java.lang.String r7, java.lang.String r8, boolean r9) {
            r5 = this;
            r0 = r5
            r1 = 184(0xb8, float:2.58E-43)
            r0.add(r1)
            r0 = r9
            if (r0 == 0) goto L1b
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r6
            r2 = r7
            r3 = r8
            int r0 = r0.addInterfaceMethodrefInfo(r1, r2, r3)
            r10 = r0
            goto L27
        L1b:
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r6
            r2 = r7
            r3 = r8
            int r0 = r0.addMethodrefInfo(r1, r2, r3)
            r10 = r0
        L27:
            r0 = r5
            r1 = r10
            r0.addIndex(r1)
            r0 = r5
            r1 = r8
            int r1 = javassist.bytecode.Descriptor.dataSize(r1)
            r0.growStack(r1)
            return
    }

    public void addInvokevirtual(javassist.CtClass r6, java.lang.String r7, javassist.CtClass r8, javassist.CtClass[] r9) {
            r5 = this;
            r0 = r8
            r1 = r9
            java.lang.String r0 = javassist.bytecode.Descriptor.ofMethod(r0, r1)
            r10 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r10
            r0.addInvokevirtual(r1, r2, r3)
            return
    }

    public void addInvokevirtual(javassist.CtClass r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            r1 = r5
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r6
            int r1 = r1.addClassInfo(r2)
            r2 = r7
            r3 = r8
            r0.addInvokevirtual(r1, r2, r3)
            return
    }

    public void addInvokevirtual(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            r1 = r5
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r6
            int r1 = r1.addClassInfo(r2)
            r2 = r7
            r3 = r8
            r0.addInvokevirtual(r1, r2, r3)
            return
    }

    public void addInvokevirtual(int r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r1 = 182(0xb6, float:2.55E-43)
            r0.add(r1)
            r0 = r6
            r1 = r6
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r7
            r3 = r8
            r4 = r9
            int r1 = r1.addMethodrefInfo(r2, r3, r4)
            r0.addIndex(r1)
            r0 = r6
            r1 = r9
            int r1 = javassist.bytecode.Descriptor.dataSize(r1)
            r2 = 1
            int r1 = r1 - r2
            r0.growStack(r1)
            return
    }

    public void addInvokeinterface(javassist.CtClass r7, java.lang.String r8, javassist.CtClass r9, javassist.CtClass[] r10, int r11) {
            r6 = this;
            r0 = r9
            r1 = r10
            java.lang.String r0 = javassist.bytecode.Descriptor.ofMethod(r0, r1)
            r12 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r12
            r4 = r11
            r0.addInvokeinterface(r1, r2, r3, r4)
            return
    }

    public void addInvokeinterface(javassist.CtClass r7, java.lang.String r8, java.lang.String r9, int r10) {
            r6 = this;
            r0 = r6
            r1 = r6
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r7
            int r1 = r1.addClassInfo(r2)
            r2 = r8
            r3 = r9
            r4 = r10
            r0.addInvokeinterface(r1, r2, r3, r4)
            return
    }

    public void addInvokeinterface(java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10) {
            r6 = this;
            r0 = r6
            r1 = r6
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r7
            int r1 = r1.addClassInfo(r2)
            r2 = r8
            r3 = r9
            r4 = r10
            r0.addInvokeinterface(r1, r2, r3, r4)
            return
    }

    public void addInvokeinterface(int r7, java.lang.String r8, java.lang.String r9, int r10) {
            r6 = this;
            r0 = r6
            r1 = 185(0xb9, float:2.59E-43)
            r0.add(r1)
            r0 = r6
            r1 = r6
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r7
            r3 = r8
            r4 = r9
            int r1 = r1.addInterfaceMethodrefInfo(r2, r3, r4)
            r0.addIndex(r1)
            r0 = r6
            r1 = r10
            r0.add(r1)
            r0 = r6
            r1 = 0
            r0.add(r1)
            r0 = r6
            r1 = r9
            int r1 = javassist.bytecode.Descriptor.dataSize(r1)
            r2 = 1
            int r1 = r1 - r2
            r0.growStack(r1)
            return
    }

    public void addInvokedynamic(int r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r6
            r2 = r7
            int r0 = r0.addNameAndTypeInfo(r1, r2)
            r8 = r0
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r5
            r2 = r8
            int r0 = r0.addInvokeDynamicInfo(r1, r2)
            r9 = r0
            r0 = r4
            r1 = 186(0xba, float:2.6E-43)
            r0.add(r1)
            r0 = r4
            r1 = r9
            r0.addIndex(r1)
            r0 = r4
            r1 = 0
            r2 = 0
            r0.add(r1, r2)
            r0 = r4
            r1 = r7
            int r1 = javassist.bytecode.Descriptor.dataSize(r1)
            r0.growStack(r1)
            return
    }

    public void addLdc(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            int r1 = r1.addStringInfo(r2)
            r0.addLdc(r1)
            return
    }

    public void addLdc(int r4) {
            r3 = this;
            r0 = r4
            r1 = 255(0xff, float:3.57E-43)
            if (r0 <= r1) goto L15
            r0 = r3
            r1 = 19
            r0.addOpcode(r1)
            r0 = r3
            r1 = r4
            r0.addIndex(r1)
            goto L20
        L15:
            r0 = r3
            r1 = 18
            r0.addOpcode(r1)
            r0 = r3
            r1 = r4
            r0.add(r1)
        L20:
            return
    }

    public void addLdc2w(long r6) {
            r5 = this;
            r0 = r5
            r1 = 20
            r0.addOpcode(r1)
            r0 = r5
            r1 = r5
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r6
            int r1 = r1.addLongInfo(r2)
            r0.addIndex(r1)
            return
    }

    public void addLdc2w(double r6) {
            r5 = this;
            r0 = r5
            r1 = 20
            r0.addOpcode(r1)
            r0 = r5
            r1 = r5
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r6
            int r1 = r1.addDoubleInfo(r2)
            r0.addIndex(r1)
            return
    }

    public void addNew(javassist.CtClass r5) {
            r4 = this;
            r0 = r4
            r1 = 187(0xbb, float:2.62E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            int r1 = r1.addClassInfo(r2)
            r0.addIndex(r1)
            return
    }

    public void addNew(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = 187(0xbb, float:2.62E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            int r1 = r1.addClassInfo(r2)
            r0.addIndex(r1)
            return
    }

    public void addAnewarray(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = 189(0xbd, float:2.65E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            int r1 = r1.addClassInfo(r2)
            r0.addIndex(r1)
            return
    }

    public void addAnewarray(javassist.CtClass r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r6
            r0.addIconst(r1)
            r0 = r4
            r1 = 189(0xbd, float:2.65E-43)
            r0.addOpcode(r1)
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            int r1 = r1.addClassInfo(r2)
            r0.addIndex(r1)
            return
    }

    public void addNewarray(int r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.addIconst(r1)
            r0 = r3
            r1 = 188(0xbc, float:2.63E-43)
            r0.addOpcode(r1)
            r0 = r3
            r1 = r4
            r0.add(r1)
            return
    }

    public int addMultiNewarray(javassist.CtClass r5, int[] r6) {
            r4 = this;
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L6:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L1a
            r0 = r4
            r1 = r6
            r2 = r8
            r1 = r1[r2]
            r0.addIconst(r1)
            int r8 = r8 + 1
            goto L6
        L1a:
            r0 = r4
            r1 = r7
            r0.growStack(r1)
            r0 = r4
            r1 = r5
            r2 = r7
            int r0 = r0.addMultiNewarray(r1, r2)
            return r0
    }

    public int addMultiNewarray(javassist.CtClass r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = 197(0xc5, float:2.76E-43)
            r0.add(r1)
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            int r1 = r1.addClassInfo(r2)
            r0.addIndex(r1)
            r0 = r4
            r1 = r6
            r0.add(r1)
            r0 = r4
            r1 = 1
            r2 = r6
            int r1 = r1 - r2
            r0.growStack(r1)
            r0 = r6
            return r0
    }

    public int addMultiNewarray(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = 197(0xc5, float:2.76E-43)
            r0.add(r1)
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            int r1 = r1.addClassInfo(r2)
            r0.addIndex(r1)
            r0 = r4
            r1 = r6
            r0.add(r1)
            r0 = r4
            r1 = 1
            r2 = r6
            int r1 = r1 - r2
            r0.growStack(r1)
            r0 = r6
            return r0
    }

    public void addPutfield(javassist.CtClass r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = 0
            r3 = r8
            r4 = r9
            r0.addPutfield0(r1, r2, r3, r4)
            return
    }

    public void addPutfield(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r1 = 0
            r2 = r7
            r3 = r8
            r4 = r9
            r0.addPutfield0(r1, r2, r3, r4)
            return
    }

    private void addPutfield0(javassist.CtClass r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            r0 = r6
            r1 = 181(0xb5, float:2.54E-43)
            r0.add(r1)
            r0 = r8
            if (r0 != 0) goto L16
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            int r0 = r0.addClassInfo(r1)
            goto L1e
        L16:
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r8
            int r0 = r0.addClassInfo(r1)
        L1e:
            r11 = r0
            r0 = r6
            r1 = r6
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r11
            r3 = r9
            r4 = r10
            int r1 = r1.addFieldrefInfo(r2, r3, r4)
            r0.addIndex(r1)
            r0 = r6
            r1 = -1
            r2 = r10
            int r2 = javassist.bytecode.Descriptor.dataSize(r2)
            int r1 = r1 - r2
            r0.growStack(r1)
            return
    }

    public void addPutstatic(javassist.CtClass r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = 0
            r3 = r8
            r4 = r9
            r0.addPutstatic0(r1, r2, r3, r4)
            return
    }

    public void addPutstatic(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r1 = 0
            r2 = r7
            r3 = r8
            r4 = r9
            r0.addPutstatic0(r1, r2, r3, r4)
            return
    }

    private void addPutstatic0(javassist.CtClass r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            r0 = r6
            r1 = 179(0xb3, float:2.51E-43)
            r0.add(r1)
            r0 = r8
            if (r0 != 0) goto L16
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            int r0 = r0.addClassInfo(r1)
            goto L1e
        L16:
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r8
            int r0 = r0.addClassInfo(r1)
        L1e:
            r11 = r0
            r0 = r6
            r1 = r6
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r11
            r3 = r9
            r4 = r10
            int r1 = r1.addFieldrefInfo(r2, r3, r4)
            r0.addIndex(r1)
            r0 = r6
            r1 = r10
            int r1 = javassist.bytecode.Descriptor.dataSize(r1)
            int r1 = -r1
            r0.growStack(r1)
            return
    }

    public void addReturn(javassist.CtClass r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto Le
            r0 = r3
            r1 = 177(0xb1, float:2.48E-43)
            r0.addOpcode(r1)
            goto L2c
        Le:
            r0 = r4
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L25
            r0 = r4
            javassist.CtPrimitiveType r0 = (javassist.CtPrimitiveType) r0
            r5 = r0
            r0 = r3
            r1 = r5
            int r1 = r1.getReturnOp()
            r0.addOpcode(r1)
            goto L2c
        L25:
            r0 = r3
            r1 = 176(0xb0, float:2.47E-43)
            r0.addOpcode(r1)
        L2c:
            return
    }

    public void addRet(int r4) {
            r3 = this;
            r0 = r4
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L16
            r0 = r3
            r1 = 169(0xa9, float:2.37E-43)
            r0.addOpcode(r1)
            r0 = r3
            r1 = r4
            r0.add(r1)
            goto L29
        L16:
            r0 = r3
            r1 = 196(0xc4, float:2.75E-43)
            r0.addOpcode(r1)
            r0 = r3
            r1 = 169(0xa9, float:2.37E-43)
            r0.addOpcode(r1)
            r0 = r3
            r1 = r4
            r0.addIndex(r1)
        L29:
            return
    }

    public void addPrintln(java.lang.String r6) {
            r5 = this;
            r0 = r5
            java.lang.String r1 = "java.lang.System"
            java.lang.String r2 = "err"
            java.lang.String r3 = "Ljava/io/PrintStream;"
            r0.addGetstatic(r1, r2, r3)
            r0 = r5
            r1 = r6
            r0.addLdc(r1)
            r0 = r5
            java.lang.String r1 = "java.io.PrintStream"
            java.lang.String r2 = "println"
            java.lang.String r3 = "(Ljava/lang/String;)V"
            r0.addInvokevirtual(r1, r2, r3)
            return
    }

    @Override // javassist.bytecode.ByteVector
    public /* bridge */ /* synthetic */ void add(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.add(r1, r2, r3, r4)
            return
    }

    @Override // javassist.bytecode.ByteVector
    public /* bridge */ /* synthetic */ void add(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            super.add(r1, r2)
            return
    }

    static {
            javassist.CtClass r0 = javassist.bytecode.ConstPool.THIS
            javassist.bytecode.Bytecode.THIS = r0
            return
    }
}
