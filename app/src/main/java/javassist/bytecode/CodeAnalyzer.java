package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeAnalyzer.class */
class CodeAnalyzer implements javassist.bytecode.Opcode {
    private javassist.bytecode.ConstPool constPool;
    private javassist.bytecode.CodeAttribute codeAttr;

    public CodeAnalyzer(javassist.bytecode.CodeAttribute r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.codeAttr = r1
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.getConstPool()
            r0.constPool = r1
            return
    }

    public int computeMaxStack() throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.bytecode.CodeAttribute r0 = r0.codeAttr
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r6 = r0
            r0 = r6
            int r0 = r0.getCodeLength()
            r7 = r0
            r0 = r7
            int[] r0 = new int[r0]
            r8 = r0
            r0 = r5
            r1 = r5
            javassist.bytecode.CodeAttribute r1 = r1.codeAttr
            javassist.bytecode.ConstPool r1 = r1.getConstPool()
            r0.constPool = r1
            r0 = r5
            r1 = r8
            r2 = r5
            javassist.bytecode.CodeAttribute r2 = r2.codeAttr
            r0.initStack(r1, r2)
        L25:
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
        L2b:
            r0 = r10
            r1 = r7
            if (r0 >= r1) goto L49
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            if (r0 >= 0) goto L43
            r0 = 1
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r10
            r0.visitBytecode(r1, r2, r3)
        L43:
            int r10 = r10 + 1
            goto L2b
        L49:
            r0 = r9
            if (r0 != 0) goto L25
            r0 = 1
            r10 = r0
            r0 = 0
            r11 = r0
        L54:
            r0 = r11
            r1 = r7
            if (r0 >= r1) goto L6f
            r0 = r8
            r1 = r11
            r0 = r0[r1]
            r1 = r10
            if (r0 <= r1) goto L69
            r0 = r8
            r1 = r11
            r0 = r0[r1]
            r10 = r0
        L69:
            int r11 = r11 + 1
            goto L54
        L6f:
            r0 = r10
            r1 = 1
            int r0 = r0 - r1
            return r0
    }

    private void initStack(int[] r5, javassist.bytecode.CodeAttribute r6) {
            r4 = this;
            r0 = r5
            r1 = 0
            r2 = -1
            r0[r1] = r2
            r0 = r6
            javassist.bytecode.ExceptionTable r0 = r0.getExceptionTable()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L2d
            r0 = r7
            int r0 = r0.size()
            r8 = r0
            r0 = 0
            r9 = r0
        L16:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L2d
            r0 = r5
            r1 = r7
            r2 = r9
            int r1 = r1.handlerPc(r2)
            r2 = -2
            r0[r1] = r2
            int r9 = r9 + 1
            goto L16
        L2d:
            return
    }

    private void visitBytecode(javassist.bytecode.CodeIterator r10, int[] r11, int r12) throws javassist.bytecode.BadBytecode {
            r9 = this;
            r0 = r11
            int r0 = r0.length
            r13 = r0
            r0 = r10
            r1 = r12
            r0.move(r1)
            r0 = r11
            r1 = r12
            r0 = r0[r1]
            int r0 = -r0
            r14 = r0
            r0 = 1
            int[] r0 = new int[r0]
            r15 = r0
            r0 = r15
            r1 = 0
            r2 = -1
            r0[r1] = r2
        L19:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L94
            r0 = r10
            int r0 = r0.next()
            r12 = r0
            r0 = r11
            r1 = r12
            r2 = r14
            r0[r1] = r2
            r0 = r10
            r1 = r12
            int r0 = r0.byteAt(r1)
            r16 = r0
            r0 = r9
            r1 = r16
            r2 = r10
            r3 = r12
            r4 = r14
            int r0 = r0.visitInst(r1, r2, r3, r4)
            r14 = r0
            r0 = r14
            r1 = 1
            if (r0 >= r1) goto L5e
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "stack underflow at "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r12
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L5e:
            r0 = r9
            r1 = r16
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r11
            r6 = r14
            r7 = r15
            boolean r0 = r0.processBranch(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L73
            goto L94
        L73:
            r0 = r16
            boolean r0 = isEnd(r0)
            if (r0 == 0) goto L7e
            goto L94
        L7e:
            r0 = r16
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 == r1) goto L8e
            r0 = r16
            r1 = 201(0xc9, float:2.82E-43)
            if (r0 != r1) goto L91
        L8e:
            int r14 = r14 + (-1)
        L91:
            goto L19
        L94:
            return
    }

    private boolean processBranch(int r8, javassist.bytecode.CodeIterator r9, int r10, int r11, int[] r12, int r13, int[] r14) throws javassist.bytecode.BadBytecode {
            r7 = this;
            r0 = 153(0x99, float:2.14E-43)
            r1 = r8
            if (r0 > r1) goto Le
            r0 = r8
            r1 = 166(0xa6, float:2.33E-43)
            if (r0 <= r1) goto L1c
        Le:
            r0 = r8
            r1 = 198(0xc6, float:2.77E-43)
            if (r0 == r1) goto L1c
            r0 = r8
            r1 = 199(0xc7, float:2.79E-43)
            if (r0 != r1) goto L37
        L1c:
            r0 = r10
            r1 = r9
            r2 = r10
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.s16bitAt(r2)
            int r0 = r0 + r1
            r15 = r0
            r0 = r7
            r1 = r10
            r2 = r15
            r3 = r11
            r4 = r12
            r5 = r13
            r0.checkTarget(r1, r2, r3, r4, r5)
            goto L212
        L37:
            r0 = r8
            switch(r0) {
                case 167: goto L7c;
                case 168: goto Lb0;
                case 169: goto L11f;
                case 170: goto L165;
                case 171: goto L165;
                case 200: goto L96;
                case 201: goto Lb0;
                default: goto L212;
            }
        L7c:
            r0 = r10
            r1 = r9
            r2 = r10
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.s16bitAt(r2)
            int r0 = r0 + r1
            r15 = r0
            r0 = r7
            r1 = r10
            r2 = r15
            r3 = r11
            r4 = r12
            r5 = r13
            r0.checkTarget(r1, r2, r3, r4, r5)
            r0 = 1
            return r0
        L96:
            r0 = r10
            r1 = r9
            r2 = r10
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.s32bitAt(r2)
            int r0 = r0 + r1
            r15 = r0
            r0 = r7
            r1 = r10
            r2 = r15
            r3 = r11
            r4 = r12
            r5 = r13
            r0.checkTarget(r1, r2, r3, r4, r5)
            r0 = 1
            return r0
        Lb0:
            r0 = r8
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 != r1) goto Lc5
            r0 = r10
            r1 = r9
            r2 = r10
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.s16bitAt(r2)
            int r0 = r0 + r1
            r15 = r0
            goto Ld0
        Lc5:
            r0 = r10
            r1 = r9
            r2 = r10
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.s32bitAt(r2)
            int r0 = r0 + r1
            r15 = r0
        Ld0:
            r0 = r7
            r1 = r10
            r2 = r15
            r3 = r11
            r4 = r12
            r5 = r13
            r0.checkTarget(r1, r2, r3, r4, r5)
            r0 = r14
            r1 = 0
            r0 = r0[r1]
            if (r0 >= 0) goto Lec
            r0 = r14
            r1 = 0
            r2 = r13
            r0[r1] = r2
            r0 = 0
            return r0
        Lec:
            r0 = r13
            r1 = r14
            r2 = 0
            r1 = r1[r2]
            if (r0 != r1) goto Lf7
            r0 = 0
            return r0
        Lf7:
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "sorry, cannot compute this data flow due to JSR: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r13
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ","
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r14
            r4 = 0
            r3 = r3[r4]
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L11f:
            r0 = r14
            r1 = 0
            r0 = r0[r1]
            if (r0 >= 0) goto L130
            r0 = r14
            r1 = 0
            r2 = r13
            r3 = 1
            int r2 = r2 + r3
            r0[r1] = r2
            r0 = 0
            return r0
        L130:
            r0 = r13
            r1 = 1
            int r0 = r0 + r1
            r1 = r14
            r2 = 0
            r1 = r1[r2]
            if (r0 != r1) goto L13d
            r0 = 1
            return r0
        L13d:
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "sorry, cannot compute this data flow due to RET: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r13
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ","
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r14
            r4 = 0
            r3 = r3[r4]
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L165:
            r0 = r10
            r1 = -4
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 + r1
            r16 = r0
            r0 = r10
            r1 = r9
            r2 = r16
            int r1 = r1.s32bitAt(r2)
            int r0 = r0 + r1
            r15 = r0
            r0 = r7
            r1 = r10
            r2 = r15
            r3 = r11
            r4 = r12
            r5 = r13
            r0.checkTarget(r1, r2, r3, r4, r5)
            r0 = r8
            r1 = 171(0xab, float:2.4E-43)
            if (r0 != r1) goto L1c5
            r0 = r9
            r1 = r16
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.s32bitAt(r1)
            r17 = r0
            int r16 = r16 + 12
            r0 = 0
            r18 = r0
        L19b:
            r0 = r18
            r1 = r17
            if (r0 >= r1) goto L1c2
            r0 = r10
            r1 = r9
            r2 = r16
            int r1 = r1.s32bitAt(r2)
            int r0 = r0 + r1
            r15 = r0
            r0 = r7
            r1 = r10
            r2 = r15
            r3 = r11
            r4 = r12
            r5 = r13
            r0.checkTarget(r1, r2, r3, r4, r5)
            int r16 = r16 + 8
            int r18 = r18 + 1
            goto L19b
        L1c2:
            goto L210
        L1c5:
            r0 = r9
            r1 = r16
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.s32bitAt(r1)
            r17 = r0
            r0 = r9
            r1 = r16
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.s32bitAt(r1)
            r18 = r0
            r0 = r18
            r1 = r17
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            r19 = r0
            int r16 = r16 + 12
            r0 = 0
            r20 = r0
        L1e9:
            r0 = r20
            r1 = r19
            if (r0 >= r1) goto L210
            r0 = r10
            r1 = r9
            r2 = r16
            int r1 = r1.s32bitAt(r2)
            int r0 = r0 + r1
            r15 = r0
            r0 = r7
            r1 = r10
            r2 = r15
            r3 = r11
            r4 = r12
            r5 = r13
            r0.checkTarget(r1, r2, r3, r4, r5)
            int r16 = r16 + 4
            int r20 = r20 + 1
            goto L1e9
        L210:
            r0 = 1
            return r0
        L212:
            r0 = 0
            return r0
    }

    private void checkTarget(int r6, int r7, int r8, int[] r9, int r10) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r7
            if (r0 < 0) goto L9
            r0 = r8
            r1 = r7
            if (r0 > r1) goto L24
        L9:
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad branch offset at "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r9
            r1 = r7
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L39
            r0 = r9
            r1 = r7
            r2 = r10
            int r2 = -r2
            r0[r1] = r2
            goto L77
        L39:
            r0 = r11
            r1 = r10
            if (r0 == r1) goto L77
            r0 = r11
            r1 = r10
            int r1 = -r1
            if (r0 == r1) goto L77
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "verification error ("
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ","
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ") at "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L77:
            return
    }

    private static boolean isEnd(int r3) {
            r0 = 172(0xac, float:2.41E-43)
            r1 = r3
            if (r0 > r1) goto Le
            r0 = r3
            r1 = 177(0xb1, float:2.48E-43)
            if (r0 <= r1) goto L15
        Le:
            r0 = r3
            r1 = 191(0xbf, float:2.68E-43)
            if (r0 != r1) goto L19
        L15:
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    private int visitInst(int r7, javassist.bytecode.CodeIterator r8, int r9, int r10) throws javassist.bytecode.BadBytecode {
            r6 = this;
            r0 = r7
            switch(r0) {
                case 178: goto L80;
                case 179: goto L8e;
                case 180: goto L60;
                case 181: goto L70;
                case 182: goto L9c;
                case 183: goto L9c;
                case 184: goto Lbb;
                case 185: goto Ld8;
                case 186: goto Lf7;
                case 187: goto L133;
                case 188: goto L133;
                case 189: goto L133;
                case 190: goto L133;
                case 191: goto L114;
                case 192: goto L133;
                case 193: goto L133;
                case 194: goto L133;
                case 195: goto L133;
                case 196: goto L12b;
                case 197: goto L11a;
                default: goto L133;
            }
        L60:
            r0 = r10
            r1 = r6
            r2 = r8
            r3 = r9
            int r1 = r1.getFieldSize(r2, r3)
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0 + r1
            r10 = r0
            goto L13d
        L70:
            r0 = r10
            r1 = r6
            r2 = r8
            r3 = r9
            int r1 = r1.getFieldSize(r2, r3)
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0 - r1
            r10 = r0
            goto L13d
        L80:
            r0 = r10
            r1 = r6
            r2 = r8
            r3 = r9
            int r1 = r1.getFieldSize(r2, r3)
            int r0 = r0 + r1
            r10 = r0
            goto L13d
        L8e:
            r0 = r10
            r1 = r6
            r2 = r8
            r3 = r9
            int r1 = r1.getFieldSize(r2, r3)
            int r0 = r0 - r1
            r10 = r0
            goto L13d
        L9c:
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r8
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.u16bitAt(r2)
            java.lang.String r0 = r0.getMethodrefType(r1)
            r11 = r0
            r0 = r10
            r1 = r11
            int r1 = javassist.bytecode.Descriptor.dataSize(r1)
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0 + r1
            r10 = r0
            goto L13d
        Lbb:
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r8
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.u16bitAt(r2)
            java.lang.String r0 = r0.getMethodrefType(r1)
            r11 = r0
            r0 = r10
            r1 = r11
            int r1 = javassist.bytecode.Descriptor.dataSize(r1)
            int r0 = r0 + r1
            r10 = r0
            goto L13d
        Ld8:
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r8
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.u16bitAt(r2)
            java.lang.String r0 = r0.getInterfaceMethodrefType(r1)
            r11 = r0
            r0 = r10
            r1 = r11
            int r1 = javassist.bytecode.Descriptor.dataSize(r1)
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0 + r1
            r10 = r0
            goto L13d
        Lf7:
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r8
            r2 = r9
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.u16bitAt(r2)
            java.lang.String r0 = r0.getInvokeDynamicType(r1)
            r11 = r0
            r0 = r10
            r1 = r11
            int r1 = javassist.bytecode.Descriptor.dataSize(r1)
            int r0 = r0 + r1
            r10 = r0
            goto L13d
        L114:
            r0 = 1
            r10 = r0
            goto L13d
        L11a:
            r0 = r10
            r1 = 1
            r2 = r8
            r3 = r9
            r4 = 3
            int r3 = r3 + r4
            int r2 = r2.byteAt(r3)
            int r1 = r1 - r2
            int r0 = r0 + r1
            r10 = r0
            goto L13d
        L12b:
            r0 = r8
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.byteAt(r1)
            r7 = r0
        L133:
            r0 = r10
            int[] r1 = javassist.bytecode.CodeAnalyzer.STACK_GROW
            r2 = r7
            r1 = r1[r2]
            int r0 = r0 + r1
            r10 = r0
        L13d:
            r0 = r10
            return r0
    }

    private int getFieldSize(javassist.bytecode.CodeIterator r6, int r7) {
            r5 = this;
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r6
            r2 = r7
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.u16bitAt(r2)
            java.lang.String r0 = r0.getFieldrefType(r1)
            r8 = r0
            r0 = r8
            int r0 = javassist.bytecode.Descriptor.dataSize(r0)
            return r0
    }
}
