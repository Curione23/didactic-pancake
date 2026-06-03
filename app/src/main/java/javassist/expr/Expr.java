package javassist.expr;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/Expr.class */
public abstract class Expr implements javassist.bytecode.Opcode {
    int currentPos;
    javassist.bytecode.CodeIterator iterator;
    javassist.CtClass thisClass;
    javassist.bytecode.MethodInfo thisMethod;
    boolean edited;
    int maxLocals;
    int maxStack;
    static final java.lang.String javaLangObject = "java.lang.Object";

    protected Expr(int r4, javassist.bytecode.CodeIterator r5, javassist.CtClass r6, javassist.bytecode.MethodInfo r7) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.currentPos = r1
            r0 = r3
            r1 = r5
            r0.iterator = r1
            r0 = r3
            r1 = r6
            r0.thisClass = r1
            r0 = r3
            r1 = r7
            r0.thisMethod = r1
            return
    }

    public javassist.CtClass getEnclosingClass() {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.thisClass
            return r0
    }

    protected final javassist.bytecode.ConstPool getConstPool() {
            r2 = this;
            r0 = r2
            javassist.bytecode.MethodInfo r0 = r0.thisMethod
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            return r0
    }

    protected final boolean edited() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.edited
            return r0
    }

    protected final int locals() {
            r2 = this;
            r0 = r2
            int r0 = r0.maxLocals
            return r0
    }

    protected final int stack() {
            r2 = this;
            r0 = r2
            int r0 = r0.maxStack
            return r0
    }

    protected final boolean withinStatic() {
            r3 = this;
            r0 = r3
            javassist.bytecode.MethodInfo r0 = r0.thisMethod
            int r0 = r0.getAccessFlags()
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public javassist.CtBehavior where() {
            r4 = this;
            r0 = r4
            javassist.bytecode.MethodInfo r0 = r0.thisMethod
            r5 = r0
            r0 = r4
            javassist.CtClass r0 = r0.thisClass
            javassist.CtBehavior[] r0 = r0.getDeclaredBehaviors()
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r7 = r0
        L12:
            r0 = r7
            if (r0 < 0) goto L2a
            r0 = r6
            r1 = r7
            r0 = r0[r1]
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            r1 = r5
            if (r0 != r1) goto L24
            r0 = r6
            r1 = r7
            r0 = r0[r1]
            return r0
        L24:
            int r7 = r7 + (-1)
            goto L12
        L2a:
            r0 = r4
            javassist.CtClass r0 = r0.thisClass
            javassist.CtConstructor r0 = r0.getClassInitializer()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L40
            r0 = r7
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            r1 = r5
            if (r0 != r1) goto L40
            r0 = r7
            return r0
        L40:
            r0 = r6
            int r0 = r0.length
            r1 = 1
            int r0 = r0 - r1
            r8 = r0
        L46:
            r0 = r8
            if (r0 < 0) goto L84
            r0 = r4
            javassist.bytecode.MethodInfo r0 = r0.thisMethod
            java.lang.String r0 = r0.getName()
            r1 = r6
            r2 = r8
            r1 = r1[r2]
            javassist.bytecode.MethodInfo r1 = r1.getMethodInfo2()
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7e
            r0 = r4
            javassist.bytecode.MethodInfo r0 = r0.thisMethod
            java.lang.String r0 = r0.getDescriptor()
            r1 = r6
            r2 = r8
            r1 = r1[r2]
            javassist.bytecode.MethodInfo r1 = r1.getMethodInfo2()
            java.lang.String r1 = r1.getDescriptor()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7e
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            return r0
        L7e:
            int r8 = r8 + (-1)
            goto L46
        L84:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "fatal: not found"
            r1.<init>(r2)
            throw r0
    }

    public javassist.CtClass[] mayThrow() {
            r5 = this;
            r0 = r5
            javassist.CtClass r0 = r0.thisClass
            javassist.ClassPool r0 = r0.getClassPool()
            r6 = r0
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.thisMethod
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r7 = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.thisMethod     // Catch: java.lang.NullPointerException -> L81
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()     // Catch: java.lang.NullPointerException -> L81
            r9 = r0
            r0 = r9
            javassist.bytecode.ExceptionTable r0 = r0.getExceptionTable()     // Catch: java.lang.NullPointerException -> L81
            r10 = r0
            r0 = r5
            int r0 = r0.currentPos     // Catch: java.lang.NullPointerException -> L81
            r11 = r0
            r0 = r10
            int r0 = r0.size()     // Catch: java.lang.NullPointerException -> L81
            r12 = r0
            r0 = 0
            r13 = r0
        L38:
            r0 = r13
            r1 = r12
            if (r0 >= r1) goto L7e
            r0 = r10
            r1 = r13
            int r0 = r0.startPc(r1)     // Catch: java.lang.NullPointerException -> L81
            r1 = r11
            if (r0 > r1) goto L78
            r0 = r11
            r1 = r10
            r2 = r13
            int r1 = r1.endPc(r2)     // Catch: java.lang.NullPointerException -> L81
            if (r0 >= r1) goto L78
            r0 = r10
            r1 = r13
            int r0 = r0.catchType(r1)     // Catch: java.lang.NullPointerException -> L81
            r14 = r0
            r0 = r14
            if (r0 <= 0) goto L78
            r0 = r8
            r1 = r6
            r2 = r7
            r3 = r14
            java.lang.String r2 = r2.getClassInfo(r3)     // Catch: javassist.NotFoundException -> L76 java.lang.NullPointerException -> L81
            javassist.CtClass r1 = r1.get(r2)     // Catch: javassist.NotFoundException -> L76 java.lang.NullPointerException -> L81
            addClass(r0, r1)     // Catch: javassist.NotFoundException -> L76 java.lang.NullPointerException -> L81
            goto L78
        L76:
            r15 = move-exception
        L78:
            int r13 = r13 + 1
            goto L38
        L7e:
            goto L83
        L81:
            r9 = move-exception
        L83:
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.thisMethod
            javassist.bytecode.ExceptionsAttribute r0 = r0.getExceptionsAttribute()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto Lc4
            r0 = r9
            java.lang.String[] r0 = r0.getExceptions()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto Lc4
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r12 = r0
        La5:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto Lc4
            r0 = r8
            r1 = r6
            r2 = r10
            r3 = r12
            r2 = r2[r3]     // Catch: javassist.NotFoundException -> Lbc
            javassist.CtClass r1 = r1.get(r2)     // Catch: javassist.NotFoundException -> Lbc
            addClass(r0, r1)     // Catch: javassist.NotFoundException -> Lbc
            goto Lbe
        Lbc:
            r13 = move-exception
        Lbe:
            int r12 = r12 + 1
            goto La5
        Lc4:
            r0 = r8
            r1 = r8
            int r1 = r1.size()
            javassist.CtClass[] r1 = new javassist.CtClass[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            javassist.CtClass[] r0 = (javassist.CtClass[]) r0
            return r0
    }

    private static void addClass(java.util.List<javassist.CtClass> r3, javassist.CtClass r4) {
            r0 = r3
            r1 = r4
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            r0 = r3
            r1 = r4
            boolean r0 = r0.add(r1)
            return
    }

    public int indexOfBytecode() {
            r2 = this;
            r0 = r2
            int r0 = r0.currentPos
            return r0
    }

    public int getLineNumber() {
            r3 = this;
            r0 = r3
            javassist.bytecode.MethodInfo r0 = r0.thisMethod
            r1 = r3
            int r1 = r1.currentPos
            int r0 = r0.getLineNumber(r1)
            return r0
    }

    public java.lang.String getFileName() {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.thisClass
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r3 = r0
            r0 = r3
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r3
            java.lang.String r0 = r0.getSourceFile()
            return r0
    }

    static final boolean checkResultValue(javassist.CtClass r4, java.lang.String r5) throws javassist.CannotCompileException {
            r0 = r5
            java.lang.String r1 = "$_"
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L24
            r0 = r4
            javassist.CtClass r1 = javassist.CtClass.voidType
            if (r0 == r1) goto L24
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "the resulting value is not stored in $_"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r6
            return r0
    }

    static final void storeStack(javassist.CtClass[] r6, boolean r7, int r8, javassist.bytecode.Bytecode r9) {
            r0 = 0
            r1 = r6
            int r1 = r1.length
            r2 = r6
            r3 = r8
            r4 = 1
            int r3 = r3 + r4
            r4 = r9
            storeStack0(r0, r1, r2, r3, r4)
            r0 = r7
            if (r0 == 0) goto L14
            r0 = r9
            r1 = 1
            r0.addOpcode(r1)
        L14:
            r0 = r9
            r1 = r8
            r0.addAstore(r1)
            return
    }

    private static void storeStack0(int r6, int r7, javassist.CtClass[] r8, int r9, javassist.bytecode.Bytecode r10) {
            r0 = r6
            r1 = r7
            if (r0 < r1) goto L6
            return
        L6:
            r0 = r8
            r1 = r6
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            boolean r0 = r0 instanceof javassist.CtPrimitiveType
            if (r0 == 0) goto L20
            r0 = r11
            javassist.CtPrimitiveType r0 = (javassist.CtPrimitiveType) r0
            int r0 = r0.getDataSize()
            r12 = r0
            goto L23
        L20:
            r0 = 1
            r12 = r0
        L23:
            r0 = r6
            r1 = 1
            int r0 = r0 + r1
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r12
            int r3 = r3 + r4
            r4 = r10
            storeStack0(r0, r1, r2, r3, r4)
            r0 = r10
            r1 = r9
            r2 = r11
            int r0 = r0.addStore(r1, r2)
            return
    }

    public abstract void replace(java.lang.String r1) throws javassist.CannotCompileException;

    public void replace(java.lang.String r5, javassist.expr.ExprEditor r6) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.replace(r1)
            r0 = r6
            if (r0 == 0) goto L12
            r0 = r4
            r1 = r6
            r2 = r4
            javassist.bytecode.CodeIterator r2 = r2.iterator
            r0.runEditor(r1, r2)
        L12:
            return
    }

    protected void replace0(int r6, javassist.bytecode.Bytecode r7, int r8) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r7
            byte[] r0 = r0.get()
            r9 = r0
            r0 = r5
            r1 = 1
            r0.edited = r1
            r0 = r9
            int r0 = r0.length
            r1 = r8
            int r0 = r0 - r1
            r10 = r0
            r0 = 0
            r11 = r0
        L15:
            r0 = r11
            r1 = r8
            if (r0 >= r1) goto L2d
            r0 = r5
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = 0
            r2 = r6
            r3 = r11
            int r2 = r2 + r3
            r0.writeByte(r1, r2)
            int r11 = r11 + 1
            goto L15
        L2d:
            r0 = r10
            if (r0 <= 0) goto L41
            r0 = r5
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r6
            r2 = r10
            r3 = 0
            javassist.bytecode.CodeIterator$Gap r0 = r0.insertGapAt(r1, r2, r3)
            int r0 = r0.position
            r6 = r0
        L41:
            r0 = r5
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r9
            r2 = r6
            r0.write(r1, r2)
            r0 = r5
            javassist.bytecode.CodeIterator r0 = r0.iterator
            r1 = r7
            javassist.bytecode.ExceptionTable r1 = r1.getExceptionTable()
            r2 = r6
            r0.insert(r1, r2)
            r0 = r5
            r1 = r7
            int r1 = r1.getMaxLocals()
            r0.maxLocals = r1
            r0 = r5
            r1 = r7
            int r1 = r1.getMaxStack()
            r0.maxStack = r1
            return
    }

    protected void runEditor(javassist.expr.ExprEditor r8, javassist.bytecode.CodeIterator r9) throws javassist.CannotCompileException {
            r7 = this;
            r0 = r9
            javassist.bytecode.CodeAttribute r0 = r0.get()
            r10 = r0
            r0 = r10
            int r0 = r0.getMaxLocals()
            r11 = r0
            r0 = r10
            int r0 = r0.getMaxStack()
            r12 = r0
            r0 = r7
            int r0 = r0.locals()
            r13 = r0
            r0 = r10
            r1 = r7
            int r1 = r1.stack()
            r0.setMaxStack(r1)
            r0 = r10
            r1 = r13
            r0.setMaxLocals(r1)
            javassist.expr.ExprEditor$LoopContext r0 = new javassist.expr.ExprEditor$LoopContext
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            r14 = r0
            r0 = r9
            int r0 = r0.getCodeLength()
            r15 = r0
            r0 = r9
            int r0 = r0.lookAhead()
            r16 = r0
            r0 = r9
            r1 = r7
            int r1 = r1.currentPos
            r0.move(r1)
            r0 = r8
            r1 = r7
            javassist.CtClass r1 = r1.thisClass
            r2 = r7
            javassist.bytecode.MethodInfo r2 = r2.thisMethod
            r3 = r14
            r4 = r9
            r5 = r16
            boolean r0 = r0.doit(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L5d
            r0 = r7
            r1 = 1
            r0.edited = r1
        L5d:
            r0 = r9
            r1 = r16
            r2 = r9
            int r2 = r2.getCodeLength()
            int r1 = r1 + r2
            r2 = r15
            int r1 = r1 - r2
            r0.move(r1)
            r0 = r10
            r1 = r11
            r0.setMaxLocals(r1)
            r0 = r10
            r1 = r12
            r0.setMaxStack(r1)
            r0 = r7
            r1 = r14
            int r1 = r1.maxLocals
            r0.maxLocals = r1
            r0 = r7
            r1 = r0
            int r1 = r1.maxStack
            r2 = r14
            int r2 = r2.maxStack
            int r1 = r1 + r2
            r0.maxStack = r1
            return
    }
}
