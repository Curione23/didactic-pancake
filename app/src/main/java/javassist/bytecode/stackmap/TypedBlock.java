package javassist.bytecode.stackmap;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/TypedBlock.class */
public class TypedBlock extends javassist.bytecode.stackmap.BasicBlock {
    public int stackTop;
    public int numLocals;
    public javassist.bytecode.stackmap.TypeData[] localsTypes;
    public javassist.bytecode.stackmap.TypeData[] stackTypes;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/TypedBlock$Maker.class */
    public static class Maker extends javassist.bytecode.stackmap.BasicBlock.Maker {
        public Maker() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // javassist.bytecode.stackmap.BasicBlock.Maker
        protected javassist.bytecode.stackmap.BasicBlock makeBlock(int r5) {
                r4 = this;
                javassist.bytecode.stackmap.TypedBlock r0 = new javassist.bytecode.stackmap.TypedBlock
                r1 = r0
                r2 = r5
                r1.<init>(r2)
                return r0
        }

        @Override // javassist.bytecode.stackmap.BasicBlock.Maker
        protected javassist.bytecode.stackmap.BasicBlock[] makeArray(int r3) {
                r2 = this;
                r0 = r3
                javassist.bytecode.stackmap.TypedBlock[] r0 = new javassist.bytecode.stackmap.TypedBlock[r0]
                return r0
        }
    }

    public static javassist.bytecode.stackmap.TypedBlock[] makeBlocks(javassist.bytecode.MethodInfo r8, javassist.bytecode.CodeAttribute r9, boolean r10) throws javassist.bytecode.BadBytecode {
            javassist.bytecode.stackmap.TypedBlock$Maker r0 = new javassist.bytecode.stackmap.TypedBlock$Maker
            r1 = r0
            r1.<init>()
            r1 = r8
            javassist.bytecode.stackmap.BasicBlock[] r0 = r0.make(r1)
            javassist.bytecode.stackmap.TypedBlock[] r0 = (javassist.bytecode.stackmap.TypedBlock[]) r0
            r11 = r0
            r0 = r10
            if (r0 == 0) goto L29
            r0 = r11
            int r0 = r0.length
            r1 = 2
            if (r0 >= r1) goto L29
            r0 = r11
            int r0 = r0.length
            if (r0 == 0) goto L27
            r0 = r11
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.incoming
            if (r0 != 0) goto L29
        L27:
            r0 = 0
            return r0
        L29:
            r0 = r8
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r12 = r0
            r0 = r8
            int r0 = r0.getAccessFlags()
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L3d
            r0 = 1
            goto L3e
        L3d:
            r0 = 0
        L3e:
            r13 = r0
            r0 = r11
            r1 = 0
            r0 = r0[r1]
            r1 = r9
            int r1 = r1.getMaxStack()
            r2 = r9
            int r2 = r2.getMaxLocals()
            r3 = r12
            java.lang.String r3 = r3.getClassName()
            r4 = r8
            java.lang.String r4 = r4.getDescriptor()
            r5 = r13
            r6 = r8
            boolean r6 = r6.isConstructor()
            r0.initFirstBlock(r1, r2, r3, r4, r5, r6)
            r0 = r11
            return r0
    }

    protected TypedBlock(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = 0
            r0.localsTypes = r1
            return
    }

    @Override // javassist.bytecode.stackmap.BasicBlock
    protected void toString2(java.lang.StringBuilder r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            super.toString2(r1)
            r0 = r6
            java.lang.String r1 = ",\n stack={"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r6
            r2 = r5
            int r2 = r2.stackTop
            r3 = r5
            javassist.bytecode.stackmap.TypeData[] r3 = r3.stackTypes
            r0.printTypes(r1, r2, r3)
            r0 = r6
            java.lang.String r1 = "}, locals={"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r6
            r2 = r5
            int r2 = r2.numLocals
            r3 = r5
            javassist.bytecode.stackmap.TypeData[] r3 = r3.localsTypes
            r0.printTypes(r1, r2, r3)
            r0 = r6
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }

    private void printTypes(java.lang.StringBuilder r4, int r5, javassist.bytecode.stackmap.TypeData[] r6) {
            r3 = this;
            r0 = r6
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r7 = r0
        L8:
            r0 = r7
            r1 = r5
            if (r0 >= r1) goto L3a
            r0 = r7
            if (r0 <= 0) goto L1a
            r0 = r4
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        L1a:
            r0 = r6
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r4
            r1 = r8
            if (r1 != 0) goto L2b
            java.lang.String r1 = "<>"
            goto L30
        L2b:
            r1 = r8
            java.lang.String r1 = r1.toString()
        L30:
            java.lang.StringBuilder r0 = r0.append(r1)
            int r7 = r7 + 1
            goto L8
        L3a:
            return
    }

    public boolean alreadySet() {
            r2 = this;
            r0 = r2
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public void setStackMap(int r4, javassist.bytecode.stackmap.TypeData[] r5, int r6, javassist.bytecode.stackmap.TypeData[] r7) throws javassist.bytecode.BadBytecode {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.stackTop = r1
            r0 = r3
            r1 = r5
            r0.stackTypes = r1
            r0 = r3
            r1 = r6
            r0.numLocals = r1
            r0 = r3
            r1 = r7
            r0.localsTypes = r1
            return
    }

    public void resetNumLocals() {
            r4 = this;
            r0 = r4
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            if (r0 == 0) goto L43
            r0 = r4
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            int r0 = r0.length
            r5 = r0
        Ld:
            r0 = r5
            if (r0 <= 0) goto L3e
            r0 = r4
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            r1 = r5
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            javassist.bytecode.stackmap.TypeData$BasicType r0 = r0.isBasicType()
            javassist.bytecode.stackmap.TypeData$BasicType r1 = javassist.bytecode.stackmap.TypeTag.TOP
            if (r0 != r1) goto L3e
            r0 = r5
            r1 = 1
            if (r0 <= r1) goto L38
            r0 = r4
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            r1 = r5
            r2 = 2
            int r1 = r1 - r2
            r0 = r0[r1]
            boolean r0 = r0.is2WordType()
            if (r0 == 0) goto L38
            goto L3e
        L38:
            int r5 = r5 + (-1)
            goto Ld
        L3e:
            r0 = r4
            r1 = r5
            r0.numLocals = r1
        L43:
            return
    }

    void initFirstBlock(int r7, int r8, java.lang.String r9, java.lang.String r10, boolean r11, boolean r12) throws javassist.bytecode.BadBytecode {
            r6 = this;
            r0 = r10
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 40
            if (r0 == r1) goto L27
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "no method descriptor: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L27:
            r0 = r6
            r1 = 0
            r0.stackTop = r1
            r0 = r6
            r1 = r7
            javassist.bytecode.stackmap.TypeData[] r1 = javassist.bytecode.stackmap.TypeData.make(r1)
            r0.stackTypes = r1
            r0 = r8
            javassist.bytecode.stackmap.TypeData[] r0 = javassist.bytecode.stackmap.TypeData.make(r0)
            r13 = r0
            r0 = r12
            if (r0 == 0) goto L4e
            r0 = r13
            r1 = 0
            javassist.bytecode.stackmap.TypeData$UninitThis r2 = new javassist.bytecode.stackmap.TypeData$UninitThis
            r3 = r2
            r4 = r9
            r3.<init>(r4)
            r0[r1] = r2
            goto L5f
        L4e:
            r0 = r11
            if (r0 != 0) goto L5f
            r0 = r13
            r1 = 0
            javassist.bytecode.stackmap.TypeData$ClassName r2 = new javassist.bytecode.stackmap.TypeData$ClassName
            r3 = r2
            r4 = r9
            r3.<init>(r4)
            r0[r1] = r2
        L5f:
            r0 = r11
            if (r0 == 0) goto L68
            r0 = -1
            goto L69
        L68:
            r0 = 0
        L69:
            r14 = r0
            r0 = 1
            r15 = r0
        L6e:
            r0 = r10
            r1 = r15
            int r14 = r14 + 1
            r2 = r14
            r3 = r13
            int r0 = descToTag(r0, r1, r2, r3)     // Catch: java.lang.StringIndexOutOfBoundsException -> L9e
            r1 = r0
            r15 = r1
            if (r0 <= 0) goto L9b
            r0 = r13
            r1 = r14
            r0 = r0[r1]     // Catch: java.lang.StringIndexOutOfBoundsException -> L9e
            boolean r0 = r0.is2WordType()     // Catch: java.lang.StringIndexOutOfBoundsException -> L9e
            if (r0 == 0) goto L6e
            r0 = r13
            int r14 = r14 + 1
            r1 = r14
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.TypeTag.TOP     // Catch: java.lang.StringIndexOutOfBoundsException -> L9e
            r0[r1] = r2     // Catch: java.lang.StringIndexOutOfBoundsException -> L9e
            goto L6e
        L9b:
            goto Lbc
        L9e:
            r16 = move-exception
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad method descriptor: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lbc:
            r0 = r6
            r1 = r14
            r0.numLocals = r1
            r0 = r6
            r1 = r13
            r0.localsTypes = r1
            return
    }

    private static int descToTag(java.lang.String r9, int r10, int r11, javassist.bytecode.stackmap.TypeData[] r12) throws javassist.bytecode.BadBytecode {
            r0 = r10
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r9
            r1 = r10
            char r0 = r0.charAt(r1)
            r15 = r0
            r0 = r15
            r1 = 41
            if (r0 != r1) goto L16
            r0 = 0
            return r0
        L16:
            r0 = r15
            r1 = 91
            if (r0 != r1) goto L2d
            int r14 = r14 + 1
            r0 = r9
            int r10 = r10 + 1
            r1 = r10
            char r0 = r0.charAt(r1)
            r15 = r0
            goto L16
        L2d:
            r0 = r15
            r1 = 76
            if (r0 != r1) goto L80
            r0 = r9
            r1 = 59
            int r10 = r10 + 1
            r2 = r10
            int r0 = r0.indexOf(r1, r2)
            r16 = r0
            r0 = r14
            if (r0 <= 0) goto L5d
            r0 = r12
            r1 = r11
            javassist.bytecode.stackmap.TypeData$ClassName r2 = new javassist.bytecode.stackmap.TypeData$ClassName
            r3 = r2
            r4 = r9
            r5 = r13
            int r16 = r16 + 1
            r6 = r16
            java.lang.String r4 = r4.substring(r5, r6)
            r3.<init>(r4)
            r0[r1] = r2
            goto L7d
        L5d:
            r0 = r12
            r1 = r11
            javassist.bytecode.stackmap.TypeData$ClassName r2 = new javassist.bytecode.stackmap.TypeData$ClassName
            r3 = r2
            r4 = r9
            r5 = r13
            r6 = 1
            int r5 = r5 + r6
            int r16 = r16 + 1
            r6 = r16
            r7 = 1
            int r6 = r6 - r7
            java.lang.String r4 = r4.substring(r5, r6)
            r5 = 47
            r6 = 46
            java.lang.String r4 = r4.replace(r5, r6)
            r3.<init>(r4)
            r0[r1] = r2
        L7d:
            r0 = r16
            return r0
        L80:
            r0 = r14
            if (r0 <= 0) goto L9b
            r0 = r12
            r1 = r11
            javassist.bytecode.stackmap.TypeData$ClassName r2 = new javassist.bytecode.stackmap.TypeData$ClassName
            r3 = r2
            r4 = r9
            r5 = r13
            int r10 = r10 + 1
            r6 = r10
            java.lang.String r4 = r4.substring(r5, r6)
            r3.<init>(r4)
            r0[r1] = r2
            r0 = r10
            return r0
        L9b:
            r0 = r15
            javassist.bytecode.stackmap.TypeData r0 = toPrimitiveTag(r0)
            r16 = r0
            r0 = r16
            if (r0 != 0) goto Lc2
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad method descriptor: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lc2:
            r0 = r12
            r1 = r11
            r2 = r16
            r0[r1] = r2
            r0 = r10
            r1 = 1
            int r0 = r0 + r1
            return r0
    }

    private static javassist.bytecode.stackmap.TypeData toPrimitiveTag(char r2) {
            r0 = r2
            switch(r0) {
                case 66: goto L74;
                case 67: goto L74;
                case 68: goto L80;
                case 69: goto L84;
                case 70: goto L7c;
                case 71: goto L84;
                case 72: goto L84;
                case 73: goto L74;
                case 74: goto L78;
                case 75: goto L84;
                case 76: goto L84;
                case 77: goto L84;
                case 78: goto L84;
                case 79: goto L84;
                case 80: goto L84;
                case 81: goto L84;
                case 82: goto L84;
                case 83: goto L74;
                case 84: goto L84;
                case 85: goto L84;
                case 86: goto L84;
                case 87: goto L84;
                case 88: goto L84;
                case 89: goto L84;
                case 90: goto L74;
                default: goto L84;
            }
        L74:
            javassist.bytecode.stackmap.TypeData$BasicType r0 = javassist.bytecode.stackmap.TypeTag.INTEGER
            return r0
        L78:
            javassist.bytecode.stackmap.TypeData$BasicType r0 = javassist.bytecode.stackmap.TypeTag.LONG
            return r0
        L7c:
            javassist.bytecode.stackmap.TypeData$BasicType r0 = javassist.bytecode.stackmap.TypeTag.FLOAT
            return r0
        L80:
            javassist.bytecode.stackmap.TypeData$BasicType r0 = javassist.bytecode.stackmap.TypeTag.DOUBLE
            return r0
        L84:
            r0 = 0
            return r0
    }

    public static java.lang.String getRetType(java.lang.String r5) {
            r0 = r5
            r1 = 41
            int r0 = r0.indexOf(r1)
            r6 = r0
            r0 = r6
            if (r0 >= 0) goto Le
            java.lang.String r0 = "java.lang.Object"
            return r0
        Le:
            r0 = r5
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r7
            r1 = 91
            if (r0 != r1) goto L24
            r0 = r5
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            return r0
        L24:
            r0 = r7
            r1 = 76
            if (r0 != r1) goto L3f
            r0 = r5
            r1 = r6
            r2 = 2
            int r1 = r1 + r2
            r2 = r5
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
        L3f:
            java.lang.String r0 = "java.lang.Object"
            return r0
    }
}
