package javassist.bytecode.stackmap;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/MapMaker.class */
public class MapMaker extends javassist.bytecode.stackmap.Tracer {
    public static javassist.bytecode.StackMapTable make(javassist.ClassPool r6, javassist.bytecode.MethodInfo r7) throws javassist.bytecode.BadBytecode {
            r0 = r7
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r8 = r0
            r0 = r8
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            r0 = r7
            r1 = r8
            r2 = 1
            javassist.bytecode.stackmap.TypedBlock[] r0 = javassist.bytecode.stackmap.TypedBlock.makeBlocks(r0, r1, r2)     // Catch: javassist.bytecode.stackmap.BasicBlock.JsrBytecode -> L15
            r9 = r0
            goto L19
        L15:
            r10 = move-exception
            r0 = 0
            return r0
        L19:
            r0 = r9
            if (r0 != 0) goto L1f
            r0 = 0
            return r0
        L1f:
            javassist.bytecode.stackmap.MapMaker r0 = new javassist.bytecode.stackmap.MapMaker
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r10
            r1 = r9
            r2 = r8
            byte[] r2 = r2.getCode()     // Catch: javassist.bytecode.BadBytecode -> L38
            r0.make(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L38
            goto L45
        L38:
            r11 = move-exception
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            r2 = r7
            r3 = r11
            r1.<init>(r2, r3)
            throw r0
        L45:
            r0 = r10
            r1 = r9
            javassist.bytecode.StackMapTable r0 = r0.toStackMap(r1)
            return r0
    }

    public static javassist.bytecode.StackMap make2(javassist.ClassPool r6, javassist.bytecode.MethodInfo r7) throws javassist.bytecode.BadBytecode {
            r0 = r7
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r8 = r0
            r0 = r8
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            r0 = r7
            r1 = r8
            r2 = 1
            javassist.bytecode.stackmap.TypedBlock[] r0 = javassist.bytecode.stackmap.TypedBlock.makeBlocks(r0, r1, r2)     // Catch: javassist.bytecode.stackmap.BasicBlock.JsrBytecode -> L15
            r9 = r0
            goto L19
        L15:
            r10 = move-exception
            r0 = 0
            return r0
        L19:
            r0 = r9
            if (r0 != 0) goto L1f
            r0 = 0
            return r0
        L1f:
            javassist.bytecode.stackmap.MapMaker r0 = new javassist.bytecode.stackmap.MapMaker
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r10
            r1 = r9
            r2 = r8
            byte[] r2 = r2.getCode()     // Catch: javassist.bytecode.BadBytecode -> L38
            r0.make(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L38
            goto L45
        L38:
            r11 = move-exception
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            r2 = r7
            r3 = r11
            r1.<init>(r2, r3)
            throw r0
        L45:
            r0 = r10
            r1 = r7
            javassist.bytecode.ConstPool r1 = r1.getConstPool()
            r2 = r9
            javassist.bytecode.StackMap r0 = r0.toStackMap2(r1, r2)
            return r0
    }

    public MapMaker(javassist.ClassPool r8, javassist.bytecode.MethodInfo r9, javassist.bytecode.CodeAttribute r10) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            javassist.bytecode.ConstPool r2 = r2.getConstPool()
            r3 = r10
            int r3 = r3.getMaxStack()
            r4 = r10
            int r4 = r4.getMaxLocals()
            r5 = r9
            java.lang.String r5 = r5.getDescriptor()
            java.lang.String r5 = javassist.bytecode.stackmap.TypedBlock.getRetType(r5)
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    protected MapMaker(javassist.bytecode.stackmap.MapMaker r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    void make(javassist.bytecode.stackmap.TypedBlock[] r6, byte[] r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            r1 = r7
            r2 = r6
            r3 = 0
            r2 = r2[r3]
            r0.make(r1, r2)
            r0 = r5
            r1 = r7
            r2 = r6
            r0.findDeadCatchers(r1, r2)
            r0 = r5
            r1 = r7
            r2 = r6
            r0.fixTypes(r1, r2)     // Catch: javassist.NotFoundException -> L17
            goto L23
        L17:
            r8 = move-exception
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.String r2 = "failed to resolve types"
            r3 = r8
            r1.<init>(r2, r3)
            throw r0
        L23:
            return
    }

    private void make(byte[] r6, javassist.bytecode.stackmap.TypedBlock r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r7
            int r0 = r0.stackTop
            r1 = r7
            javassist.bytecode.stackmap.TypeData[] r1 = r1.stackTypes
            r2 = r5
            javassist.bytecode.stackmap.TypeData[] r2 = r2.stackTypes
            copyTypeData(r0, r1, r2)
            r0 = r5
            r1 = r7
            int r1 = r1.stackTop
            r0.stackTop = r1
            r0 = r7
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            int r0 = r0.length
            r1 = r7
            javassist.bytecode.stackmap.TypeData[] r1 = r1.localsTypes
            r2 = r5
            javassist.bytecode.stackmap.TypeData[] r2 = r2.localsTypes
            copyTypeData(r0, r1, r2)
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.bytecode.stackmap.BasicBlock$Catch r2 = r2.toCatch
            r0.traceException(r1, r2)
            r0 = r7
            int r0 = r0.position
            r8 = r0
            r0 = r8
            r1 = r7
            int r1 = r1.length
            int r0 = r0 + r1
            r9 = r0
        L3d:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L58
            r0 = r8
            r1 = r5
            r2 = r8
            r3 = r6
            int r1 = r1.doOpcode(r2, r3)
            int r0 = r0 + r1
            r8 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.bytecode.stackmap.BasicBlock$Catch r2 = r2.toCatch
            r0.traceException(r1, r2)
            goto L3d
        L58:
            r0 = r7
            javassist.bytecode.stackmap.BasicBlock[] r0 = r0.exit
            if (r0 == 0) goto La8
            r0 = 0
            r10 = r0
        L62:
            r0 = r10
            r1 = r7
            javassist.bytecode.stackmap.BasicBlock[] r1 = r1.exit
            int r1 = r1.length
            if (r0 >= r1) goto La8
            r0 = r7
            javassist.bytecode.stackmap.BasicBlock[] r0 = r0.exit
            r1 = r10
            r0 = r0[r1]
            javassist.bytecode.stackmap.TypedBlock r0 = (javassist.bytecode.stackmap.TypedBlock) r0
            r11 = r0
            r0 = r11
            boolean r0 = r0.alreadySet()
            if (r0 == 0) goto L8a
            r0 = r5
            r1 = r11
            r2 = 1
            r0.mergeMap(r1, r2)
            goto La2
        L8a:
            r0 = r5
            r1 = r11
            r0.recordStackMap(r1)
            javassist.bytecode.stackmap.MapMaker r0 = new javassist.bytecode.stackmap.MapMaker
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r12 = r0
            r0 = r12
            r1 = r6
            r2 = r11
            r0.make(r1, r2)
        La2:
            int r10 = r10 + 1
            goto L62
        La8:
            return
    }

    private void traceException(byte[] r8, javassist.bytecode.stackmap.BasicBlock.Catch r9) throws javassist.bytecode.BadBytecode {
            r7 = this;
        L0:
            r0 = r9
            if (r0 == 0) goto L7c
            r0 = r9
            javassist.bytecode.stackmap.BasicBlock r0 = r0.body
            javassist.bytecode.stackmap.TypedBlock r0 = (javassist.bytecode.stackmap.TypedBlock) r0
            r10 = r0
            r0 = r10
            boolean r0 = r0.alreadySet()
            if (r0 == 0) goto L5a
            r0 = r7
            r1 = r10
            r2 = 0
            r0.mergeMap(r1, r2)
            r0 = r10
            int r0 = r0.stackTop
            r1 = 1
            if (r0 >= r1) goto L3f
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad catch clause: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            int r3 = r3.typeIndex
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L3f:
            r0 = r10
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = 0
            r2 = r7
            r3 = r7
            r4 = r9
            int r4 = r4.typeIndex
            javassist.bytecode.stackmap.TypeData$ClassName r3 = r3.toExceptionType(r4)
            r4 = r10
            javassist.bytecode.stackmap.TypeData[] r4 = r4.stackTypes
            r5 = 0
            r4 = r4[r5]
            javassist.bytecode.stackmap.TypeData r2 = r2.merge(r3, r4)
            r0[r1] = r2
            goto L74
        L5a:
            r0 = r7
            r1 = r10
            r2 = r9
            int r2 = r2.typeIndex
            r0.recordStackMap(r1, r2)
            javassist.bytecode.stackmap.MapMaker r0 = new javassist.bytecode.stackmap.MapMaker
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            r1 = r8
            r2 = r10
            r0.make(r1, r2)
        L74:
            r0 = r9
            javassist.bytecode.stackmap.BasicBlock$Catch r0 = r0.next
            r9 = r0
            goto L0
        L7c:
            return
    }

    private void mergeMap(javassist.bytecode.stackmap.TypedBlock r8, boolean r9) throws javassist.bytecode.BadBytecode {
            r7 = this;
            r0 = r7
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L9:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L31
            r0 = r8
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            r1 = r11
            r2 = r7
            r3 = r7
            javassist.bytecode.stackmap.TypeData[] r3 = r3.localsTypes
            r4 = r10
            r5 = r11
            javassist.bytecode.stackmap.TypeData r3 = validateTypeData(r3, r4, r5)
            r4 = r8
            javassist.bytecode.stackmap.TypeData[] r4 = r4.localsTypes
            r5 = r11
            r4 = r4[r5]
            javassist.bytecode.stackmap.TypeData r2 = r2.merge(r3, r4)
            r0[r1] = r2
            int r11 = r11 + 1
            goto L9
        L31:
            r0 = r9
            if (r0 == 0) goto L62
            r0 = r7
            int r0 = r0.stackTop
            r10 = r0
            r0 = 0
            r11 = r0
        L3d:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L62
            r0 = r8
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r11
            r2 = r7
            r3 = r7
            javassist.bytecode.stackmap.TypeData[] r3 = r3.stackTypes
            r4 = r11
            r3 = r3[r4]
            r4 = r8
            javassist.bytecode.stackmap.TypeData[] r4 = r4.stackTypes
            r5 = r11
            r4 = r4[r5]
            javassist.bytecode.stackmap.TypeData r2 = r2.merge(r3, r4)
            r0[r1] = r2
            int r11 = r11 + 1
            goto L3d
        L62:
            return
    }

    private javassist.bytecode.stackmap.TypeData merge(javassist.bytecode.stackmap.TypeData r5, javassist.bytecode.stackmap.TypeData r6) throws javassist.bytecode.BadBytecode {
            r4 = this;
            r0 = r5
            r1 = r6
            if (r0 != r1) goto L7
            r0 = r6
            return r0
        L7:
            r0 = r6
            boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.ClassName
            if (r0 != 0) goto L15
            r0 = r6
            boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.BasicType
            if (r0 == 0) goto L17
        L15:
            r0 = r6
            return r0
        L17:
            r0 = r6
            boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.AbsTypeVar
            if (r0 == 0) goto L28
            r0 = r6
            javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = (javassist.bytecode.stackmap.TypeData.AbsTypeVar) r0
            r1 = r5
            r0.merge(r1)
            r0 = r6
            return r0
        L28:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "fatal: this should never happen"
            r1.<init>(r2)
            throw r0
    }

    private void recordStackMap(javassist.bytecode.stackmap.TypedBlock r6) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            int r0 = r0.length
            javassist.bytecode.stackmap.TypeData[] r0 = javassist.bytecode.stackmap.TypeData.make(r0)
            r7 = r0
            r0 = r5
            int r0 = r0.stackTop
            r8 = r0
            r0 = r8
            r1 = r5
            javassist.bytecode.stackmap.TypeData[] r1 = r1.stackTypes
            r2 = r7
            int r0 = recordTypeData(r0, r1, r2)
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r7
            r0.recordStackMap0(r1, r2, r3)
            return
    }

    private void recordStackMap(javassist.bytecode.stackmap.TypedBlock r6, int r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            int r0 = r0.length
            javassist.bytecode.stackmap.TypeData[] r0 = javassist.bytecode.stackmap.TypeData.make(r0)
            r8 = r0
            r0 = r8
            r1 = 0
            r2 = r5
            r3 = r7
            javassist.bytecode.stackmap.TypeData$ClassName r2 = r2.toExceptionType(r3)
            javassist.bytecode.stackmap.TypeData r2 = r2.join()
            r0[r1] = r2
            r0 = r5
            r1 = r6
            r2 = 1
            r3 = r8
            r0.recordStackMap0(r1, r2, r3)
            return
    }

    private javassist.bytecode.stackmap.TypeData.ClassName toExceptionType(int r5) {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto La
            java.lang.String r0 = "java.lang.Throwable"
            r6 = r0
            goto L13
        La:
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.cpool
            r1 = r5
            java.lang.String r0 = r0.getClassInfo(r1)
            r6 = r0
        L13:
            javassist.bytecode.stackmap.TypeData$ClassName r0 = new javassist.bytecode.stackmap.TypeData$ClassName
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            return r0
    }

    private void recordStackMap0(javassist.bytecode.stackmap.TypedBlock r7, int r8, javassist.bytecode.stackmap.TypeData[] r9) throws javassist.bytecode.BadBytecode {
            r6 = this;
            r0 = r6
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            int r0 = r0.length
            r10 = r0
            r0 = r10
            javassist.bytecode.stackmap.TypeData[] r0 = javassist.bytecode.stackmap.TypeData.make(r0)
            r11 = r0
            r0 = r10
            r1 = r6
            javassist.bytecode.stackmap.TypeData[] r1 = r1.localsTypes
            r2 = r11
            int r0 = recordTypeData(r0, r1, r2)
            r12 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r12
            r4 = r11
            r0.setStackMap(r1, r2, r3, r4)
            return
    }

    protected static int recordTypeData(int r4, javassist.bytecode.stackmap.TypeData[] r5, javassist.bytecode.stackmap.TypeData[] r6) {
            r0 = -1
            r7 = r0
            r0 = 0
            r8 = r0
        L5:
            r0 = r8
            r1 = r4
            if (r0 >= r1) goto L30
            r0 = r5
            r1 = r4
            r2 = r8
            javassist.bytecode.stackmap.TypeData r0 = validateTypeData(r0, r1, r2)
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            javassist.bytecode.stackmap.TypeData r2 = r2.join()
            r0[r1] = r2
            r0 = r9
            javassist.bytecode.stackmap.TypeData$BasicType r1 = javassist.bytecode.stackmap.MapMaker.TOP
            if (r0 == r1) goto L2a
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r7 = r0
        L2a:
            int r8 = r8 + 1
            goto L5
        L30:
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            return r0
    }

    protected static void copyTypeData(int r6, javassist.bytecode.stackmap.TypeData[] r7, javassist.bytecode.stackmap.TypeData[] r8) {
            r0 = r7
            r1 = 0
            r2 = r8
            r3 = 0
            r4 = r6
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            return
    }

    private static javassist.bytecode.stackmap.TypeData validateTypeData(javassist.bytecode.stackmap.TypeData[] r4, int r5, int r6) {
            r0 = r4
            r1 = r6
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            boolean r0 = r0.is2WordType()
            if (r0 == 0) goto L21
            r0 = r6
            r1 = 1
            int r0 = r0 + r1
            r1 = r5
            if (r0 >= r1) goto L21
            r0 = r4
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            javassist.bytecode.stackmap.TypeData$BasicType r1 = javassist.bytecode.stackmap.MapMaker.TOP
            if (r0 == r1) goto L21
            javassist.bytecode.stackmap.TypeData$BasicType r0 = javassist.bytecode.stackmap.MapMaker.TOP
            return r0
        L21:
            r0 = r7
            return r0
    }

    private void findDeadCatchers(byte[] r5, javassist.bytecode.stackmap.TypedBlock[] r6) throws javassist.bytecode.BadBytecode {
            r4 = this;
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L6:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L5d
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            boolean r0 = r0.alreadySet()
            if (r0 != 0) goto L57
            r0 = r4
            r1 = r5
            r2 = r9
            r0.fixDeadcode(r1, r2)
            r0 = r9
            javassist.bytecode.stackmap.BasicBlock$Catch r0 = r0.toCatch
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L57
            r0 = r10
            javassist.bytecode.stackmap.BasicBlock r0 = r0.body
            javassist.bytecode.stackmap.TypedBlock r0 = (javassist.bytecode.stackmap.TypedBlock) r0
            r11 = r0
            r0 = r11
            boolean r0 = r0.alreadySet()
            if (r0 != 0) goto L57
            r0 = r4
            r1 = r11
            r2 = r10
            int r2 = r2.typeIndex
            r0.recordStackMap(r1, r2)
            r0 = r4
            r1 = r5
            r2 = r11
            r0.fixDeadcode(r1, r2)
            r0 = r11
            r1 = 1
            r0.incoming = r1
        L57:
            int r8 = r8 + 1
            goto L6
        L5d:
            return
    }

    private void fixDeadcode(byte[] r6, javassist.bytecode.stackmap.TypedBlock r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r7
            int r0 = r0.position
            r8 = r0
            r0 = r7
            int r0 = r0.length
            r1 = 3
            int r0 = r0 - r1
            r9 = r0
            r0 = r9
            if (r0 >= 0) goto L34
            r0 = r9
            r1 = -1
            if (r0 != r1) goto L1c
            r0 = r6
            r1 = r8
            r2 = 0
            r0[r1] = r2
        L1c:
            r0 = r6
            r1 = r8
            r2 = r7
            int r2 = r2.length
            int r1 = r1 + r2
            r2 = 1
            int r1 = r1 - r2
            r2 = -65
            r0[r1] = r2
            r0 = r7
            r1 = 1
            r0.incoming = r1
            r0 = r5
            r1 = r7
            r2 = 0
            r0.recordStackMap(r1, r2)
            return
        L34:
            r0 = r7
            r1 = 0
            r0.incoming = r1
            r0 = 0
            r10 = r0
        L3c:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L50
            r0 = r6
            r1 = r8
            r2 = r10
            int r1 = r1 + r2
            r2 = 0
            r0[r1] = r2
            int r10 = r10 + 1
            goto L3c
        L50:
            r0 = r6
            r1 = r8
            r2 = r9
            int r1 = r1 + r2
            r2 = -89
            r0[r1] = r2
            r0 = r9
            int r0 = -r0
            r1 = r6
            r2 = r8
            r3 = r9
            int r2 = r2 + r3
            r3 = 1
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            return
    }

    private void fixTypes(byte[] r6, javassist.bytecode.stackmap.TypedBlock[] r7) throws javassist.NotFoundException, javassist.bytecode.BadBytecode {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r7
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
        L12:
            r0 = r11
            r1 = r9
            if (r0 >= r1) goto L84
            r0 = r7
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            boolean r0 = r0.alreadySet()
            if (r0 == 0) goto L7e
            r0 = r12
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r14 = r0
        L32:
            r0 = r14
            r1 = r13
            if (r0 >= r1) goto L53
            r0 = r12
            javassist.bytecode.stackmap.TypeData[] r0 = r0.localsTypes
            r1 = r14
            r0 = r0[r1]
            r1 = r8
            r2 = r10
            r3 = r5
            javassist.ClassPool r3 = r3.classPool
            int r0 = r0.dfs(r1, r2, r3)
            r10 = r0
            int r14 = r14 + 1
            goto L32
        L53:
            r0 = r12
            int r0 = r0.stackTop
            r13 = r0
            r0 = 0
            r14 = r0
        L5d:
            r0 = r14
            r1 = r13
            if (r0 >= r1) goto L7e
            r0 = r12
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = r14
            r0 = r0[r1]
            r1 = r8
            r2 = r10
            r3 = r5
            javassist.ClassPool r3 = r3.classPool
            int r0 = r0.dfs(r1, r2, r3)
            r10 = r0
            int r14 = r14 + 1
            goto L5d
        L7e:
            int r11 = r11 + 1
            goto L12
        L84:
            return
    }

    public javassist.bytecode.StackMapTable toStackMap(javassist.bytecode.stackmap.TypedBlock[] r8) {
            r7 = this;
            javassist.bytecode.StackMapTable$Writer r0 = new javassist.bytecode.StackMapTable$Writer
            r1 = r0
            r2 = 32
            r1.<init>(r2)
            r9 = r0
            r0 = r8
            int r0 = r0.length
            r10 = r0
            r0 = r8
            r1 = 0
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            int r0 = r0.length
            r12 = r0
            r0 = r11
            int r0 = r0.incoming
            if (r0 <= 0) goto L29
            r0 = r9
            r1 = 0
            r0.sameFrame(r1)
            int r12 = r12 + (-1)
        L29:
            r0 = 1
            r13 = r0
        L2c:
            r0 = r13
            r1 = r10
            if (r0 >= r1) goto Lac
            r0 = r8
            r1 = r13
            r0 = r0[r1]
            r14 = r0
            r0 = r7
            r1 = r14
            r2 = r8
            r3 = r13
            r4 = 1
            int r3 = r3 - r4
            r2 = r2[r3]
            boolean r0 = r0.isTarget(r1, r2)
            if (r0 == 0) goto L82
            r0 = r14
            r0.resetNumLocals()
            r0 = r11
            int r0 = r0.numLocals
            r1 = r11
            javassist.bytecode.stackmap.TypeData[] r1 = r1.localsTypes
            r2 = r14
            int r2 = r2.numLocals
            r3 = r14
            javassist.bytecode.stackmap.TypeData[] r3 = r3.localsTypes
            int r0 = stackMapDiff(r0, r1, r2, r3)
            r15 = r0
            r0 = r7
            r1 = r9
            r2 = r14
            r3 = r15
            r4 = r12
            r5 = r11
            r0.toStackMapBody(r1, r2, r3, r4, r5)
            r0 = r14
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r12 = r0
            r0 = r14
            r11 = r0
            goto La6
        L82:
            r0 = r14
            int r0 = r0.incoming
            if (r0 != 0) goto L9c
            r0 = r9
            r1 = r12
            r0.sameFrame(r1)
            r0 = r14
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r12 = r0
            goto La6
        L9c:
            r0 = r12
            r1 = r14
            int r1 = r1.length
            int r0 = r0 + r1
            r12 = r0
        La6:
            int r13 = r13 + 1
            goto L2c
        Lac:
            r0 = r9
            r1 = r7
            javassist.bytecode.ConstPool r1 = r1.cpool
            javassist.bytecode.StackMapTable r0 = r0.toStackMapTable(r1)
            return r0
    }

    private boolean isTarget(javassist.bytecode.stackmap.TypedBlock r4, javassist.bytecode.stackmap.TypedBlock r5) {
            r3 = this;
            r0 = r4
            int r0 = r0.incoming
            r6 = r0
            r0 = r6
            r1 = 1
            if (r0 <= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = r6
            r1 = 1
            if (r0 >= r1) goto L13
            r0 = 0
            return r0
        L13:
            r0 = r5
            boolean r0 = r0.stop
            return r0
    }

    private void toStackMapBody(javassist.bytecode.StackMapTable.Writer r8, javassist.bytecode.stackmap.TypedBlock r9, int r10, int r11, javassist.bytecode.stackmap.TypedBlock r12) {
            r7 = this;
            r0 = r9
            int r0 = r0.stackTop
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L5f
            r0 = r10
            if (r0 != 0) goto L16
            r0 = r8
            r1 = r11
            r0.sameFrame(r1)
            return
        L16:
            r0 = 0
            r1 = r10
            if (r0 <= r1) goto L2a
            r0 = r10
            r1 = -3
            if (r0 < r1) goto L2a
            r0 = r8
            r1 = r11
            r2 = r10
            int r2 = -r2
            r0.chopFrame(r1, r2)
            return
        L2a:
            r0 = 0
            r1 = r10
            if (r0 >= r1) goto Lb5
            r0 = r10
            r1 = 3
            if (r0 > r1) goto Lb5
            r0 = r10
            int[] r0 = new int[r0]
            r14 = r0
            r0 = r7
            r1 = r9
            int r1 = r1.numLocals
            r2 = r12
            int r2 = r2.numLocals
            int r1 = r1 - r2
            r2 = r12
            int r2 = r2.numLocals
            r3 = r14
            r4 = r9
            javassist.bytecode.stackmap.TypeData[] r4 = r4.localsTypes
            int[] r0 = r0.fillStackMap(r1, r2, r3, r4)
            r15 = r0
            r0 = r8
            r1 = r11
            r2 = r15
            r3 = r14
            r0.appendFrame(r1, r2, r3)
            return
        L5f:
            r0 = r13
            r1 = 1
            if (r0 != r1) goto L86
            r0 = r10
            if (r0 != 0) goto L86
            r0 = r9
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = 0
            r0 = r0[r1]
            r14 = r0
            r0 = r8
            r1 = r11
            r2 = r14
            int r2 = r2.getTypeTag()
            r3 = r14
            r4 = r7
            javassist.bytecode.ConstPool r4 = r4.cpool
            int r3 = r3.getTypeData(r4)
            r0.sameLocals(r1, r2, r3)
            return
        L86:
            r0 = r13
            r1 = 2
            if (r0 != r1) goto Lb5
            r0 = r10
            if (r0 != 0) goto Lb5
            r0 = r9
            javassist.bytecode.stackmap.TypeData[] r0 = r0.stackTypes
            r1 = 0
            r0 = r0[r1]
            r14 = r0
            r0 = r14
            boolean r0 = r0.is2WordType()
            if (r0 == 0) goto Lb5
            r0 = r8
            r1 = r11
            r2 = r14
            int r2 = r2.getTypeTag()
            r3 = r14
            r4 = r7
            javassist.bytecode.ConstPool r4 = r4.cpool
            int r3 = r3.getTypeData(r4)
            r0.sameLocals(r1, r2, r3)
            return
        Lb5:
            r0 = r13
            int[] r0 = new int[r0]
            r14 = r0
            r0 = r7
            r1 = r13
            r2 = 0
            r3 = r14
            r4 = r9
            javassist.bytecode.stackmap.TypeData[] r4 = r4.stackTypes
            int[] r0 = r0.fillStackMap(r1, r2, r3, r4)
            r15 = r0
            r0 = r9
            int r0 = r0.numLocals
            int[] r0 = new int[r0]
            r16 = r0
            r0 = r7
            r1 = r9
            int r1 = r1.numLocals
            r2 = 0
            r3 = r16
            r4 = r9
            javassist.bytecode.stackmap.TypeData[] r4 = r4.localsTypes
            int[] r0 = r0.fillStackMap(r1, r2, r3, r4)
            r17 = r0
            r0 = r8
            r1 = r11
            r2 = r17
            r3 = r16
            r4 = r15
            r5 = r14
            r0.fullFrame(r1, r2, r3, r4, r5)
            return
    }

    private int[] fillStackMap(int r6, int r7, int[] r8, javassist.bytecode.stackmap.TypeData[] r9) {
            r5 = this;
            r0 = r9
            r1 = r7
            r2 = r7
            r3 = r6
            int r2 = r2 + r3
            int r0 = diffSize(r0, r1, r2)
            r10 = r0
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.cpool
            r11 = r0
            r0 = r10
            int[] r0 = new int[r0]
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = 0
            r14 = r0
        L1d:
            r0 = r14
            r1 = r6
            if (r0 >= r1) goto L55
            r0 = r9
            r1 = r7
            r2 = r14
            int r1 = r1 + r2
            r0 = r0[r1]
            r15 = r0
            r0 = r12
            r1 = r13
            r2 = r15
            int r2 = r2.getTypeTag()
            r0[r1] = r2
            r0 = r8
            r1 = r13
            r2 = r15
            r3 = r11
            int r2 = r2.getTypeData(r3)
            r0[r1] = r2
            r0 = r15
            boolean r0 = r0.is2WordType()
            if (r0 == 0) goto L4c
            int r14 = r14 + 1
        L4c:
            int r13 = r13 + 1
            int r14 = r14 + 1
            goto L1d
        L55:
            r0 = r12
            return r0
    }

    private static int stackMapDiff(int r4, javassist.bytecode.stackmap.TypeData[] r5, int r6, javassist.bytecode.stackmap.TypeData[] r7) {
            r0 = r6
            r1 = r4
            int r0 = r0 - r1
            r8 = r0
            r0 = r8
            if (r0 <= 0) goto L10
            r0 = r4
            r9 = r0
            goto L13
        L10:
            r0 = r6
            r9 = r0
        L13:
            r0 = r5
            r1 = r7
            r2 = r9
            boolean r0 = stackMapEq(r0, r1, r2)
            if (r0 == 0) goto L33
            r0 = r8
            if (r0 <= 0) goto L2a
            r0 = r7
            r1 = r9
            r2 = r6
            int r0 = diffSize(r0, r1, r2)
            return r0
        L2a:
            r0 = r5
            r1 = r9
            r2 = r4
            int r0 = diffSize(r0, r1, r2)
            int r0 = -r0
            return r0
        L33:
            r0 = -100
            return r0
    }

    private static boolean stackMapEq(javassist.bytecode.stackmap.TypeData[] r4, javassist.bytecode.stackmap.TypeData[] r5, int r6) {
            r0 = 0
            r7 = r0
        L2:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L1b
            r0 = r4
            r1 = r7
            r0 = r0[r1]
            r1 = r5
            r2 = r7
            r1 = r1[r2]
            boolean r0 = r0.eq(r1)
            if (r0 != 0) goto L15
            r0 = 0
            return r0
        L15:
            int r7 = r7 + 1
            goto L2
        L1b:
            r0 = 1
            return r0
    }

    private static int diffSize(javassist.bytecode.stackmap.TypeData[] r3, int r4, int r5) {
            r0 = 0
            r6 = r0
        L2:
            r0 = r4
            r1 = r5
            if (r0 >= r1) goto L20
            r0 = r3
            r1 = r4
            int r4 = r4 + 1
            r0 = r0[r1]
            r7 = r0
            int r6 = r6 + 1
            r0 = r7
            boolean r0 = r0.is2WordType()
            if (r0 == 0) goto L1d
            int r4 = r4 + 1
        L1d:
            goto L2
        L20:
            r0 = r6
            return r0
    }

    public javassist.bytecode.StackMap toStackMap2(javassist.bytecode.ConstPool r9, javassist.bytecode.stackmap.TypedBlock[] r10) {
            r8 = this;
            javassist.bytecode.StackMap$Writer r0 = new javassist.bytecode.StackMap$Writer
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r10
            int r0 = r0.length
            r12 = r0
            r0 = r12
            boolean[] r0 = new boolean[r0]
            r13 = r0
            r0 = r10
            r1 = 0
            r0 = r0[r1]
            r14 = r0
            r0 = r13
            r1 = 0
            r2 = r14
            int r2 = r2.incoming
            if (r2 <= 0) goto L26
            r2 = 1
            goto L27
        L26:
            r2 = 0
        L27:
            r0[r1] = r2
            r0 = r13
            r1 = 0
            r0 = r0[r1]
            if (r0 == 0) goto L33
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            r15 = r0
            r0 = 1
            r16 = r0
        L39:
            r0 = r16
            r1 = r12
            if (r0 >= r1) goto L6d
            r0 = r10
            r1 = r16
            r0 = r0[r1]
            r17 = r0
            r0 = r13
            r1 = r16
            r2 = r8
            r3 = r17
            r4 = r10
            r5 = r16
            r6 = 1
            int r5 = r5 - r6
            r4 = r4[r5]
            boolean r2 = r2.isTarget(r3, r4)
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            r1[r2] = r3
            if (r0 == 0) goto L67
            r0 = r17
            r0.resetNumLocals()
            r0 = r17
            r14 = r0
            int r15 = r15 + 1
        L67:
            int r16 = r16 + 1
            goto L39
        L6d:
            r0 = r15
            if (r0 != 0) goto L74
            r0 = 0
            return r0
        L74:
            r0 = r11
            r1 = r15
            r0.write16bit(r1)
            r0 = 0
            r16 = r0
        L7d:
            r0 = r16
            r1 = r12
            if (r0 >= r1) goto La3
            r0 = r13
            r1 = r16
            r0 = r0[r1]
            if (r0 == 0) goto L9d
            r0 = r8
            r1 = r11
            r2 = r9
            r3 = r10
            r4 = r16
            r3 = r3[r4]
            int r3 = r3.position
            r4 = r10
            r5 = r16
            r4 = r4[r5]
            r0.writeStackFrame(r1, r2, r3, r4)
        L9d:
            int r16 = r16 + 1
            goto L7d
        La3:
            r0 = r11
            r1 = r9
            javassist.bytecode.StackMap r0 = r0.toStackMap(r1)
            return r0
    }

    private void writeStackFrame(javassist.bytecode.StackMap.Writer r7, javassist.bytecode.ConstPool r8, int r9, javassist.bytecode.stackmap.TypedBlock r10) {
            r6 = this;
            r0 = r7
            r1 = r9
            r0.write16bit(r1)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            javassist.bytecode.stackmap.TypeData[] r3 = r3.localsTypes
            r4 = r10
            int r4 = r4.numLocals
            r0.writeVerifyTypeInfo(r1, r2, r3, r4)
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            javassist.bytecode.stackmap.TypeData[] r3 = r3.stackTypes
            r4 = r10
            int r4 = r4.stackTop
            r0.writeVerifyTypeInfo(r1, r2, r3, r4)
            return
    }

    private void writeVerifyTypeInfo(javassist.bytecode.StackMap.Writer r6, javassist.bytecode.ConstPool r7, javassist.bytecode.stackmap.TypeData[] r8, int r9) {
            r5 = this;
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
        L6:
            r0 = r11
            r1 = r9
            if (r0 >= r1) goto L2c
            r0 = r8
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L26
            r0 = r12
            boolean r0 = r0.is2WordType()
            if (r0 == 0) goto L26
            int r10 = r10 + 1
            int r11 = r11 + 1
        L26:
            int r11 = r11 + 1
            goto L6
        L2c:
            r0 = r6
            r1 = r9
            r2 = r10
            int r1 = r1 - r2
            r0.write16bit(r1)
            r0 = 0
            r11 = r0
        L38:
            r0 = r11
            r1 = r9
            if (r0 >= r1) goto L65
            r0 = r8
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r6
            r1 = r12
            int r1 = r1.getTypeTag()
            r2 = r12
            r3 = r7
            int r2 = r2.getTypeData(r3)
            r0.writeVerifyTypeInfo(r1, r2)
            r0 = r12
            boolean r0 = r0.is2WordType()
            if (r0 == 0) goto L5f
            int r11 = r11 + 1
        L5f:
            int r11 = r11 + 1
            goto L38
        L65:
            return
    }
}
