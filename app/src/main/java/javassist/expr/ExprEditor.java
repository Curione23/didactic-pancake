package javassist.expr;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/ExprEditor.class */
public class ExprEditor {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/ExprEditor$LoopContext.class */
    static final class LoopContext {
        javassist.expr.ExprEditor.NewOp newList;
        int maxLocals;
        int maxStack;

        LoopContext(int r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.maxLocals = r1
                r0 = r3
                r1 = 0
                r0.maxStack = r1
                r0 = r3
                r1 = 0
                r0.newList = r1
                return
        }

        void updateMax(int r4, int r5) {
                r3 = this;
                r0 = r3
                int r0 = r0.maxLocals
                r1 = r4
                if (r0 >= r1) goto Ld
                r0 = r3
                r1 = r4
                r0.maxLocals = r1
            Ld:
                r0 = r3
                int r0 = r0.maxStack
                r1 = r5
                if (r0 >= r1) goto L1a
                r0 = r3
                r1 = r5
                r0.maxStack = r1
            L1a:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/expr/ExprEditor$NewOp.class */
    static final class NewOp {
        javassist.expr.ExprEditor.NewOp next;
        int pos;
        java.lang.String type;

        NewOp(javassist.expr.ExprEditor.NewOp r4, int r5, java.lang.String r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.next = r1
                r0 = r3
                r1 = r5
                r0.pos = r1
                r0 = r3
                r1 = r6
                r0.type = r1
                return
        }
    }

    public ExprEditor() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public boolean doit(javassist.CtClass r9, javassist.bytecode.MethodInfo r10) throws javassist.CannotCompileException {
            r8 = this;
            r0 = r10
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r11 = r0
            r0 = r11
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            r0 = r11
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r12 = r0
            r0 = 0
            r13 = r0
            javassist.expr.ExprEditor$LoopContext r0 = new javassist.expr.ExprEditor$LoopContext
            r1 = r0
            r2 = r11
            int r2 = r2.getMaxLocals()
            r1.<init>(r2)
            r14 = r0
        L21:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3c
            r0 = r8
            r1 = r12
            r2 = r9
            r3 = r10
            r4 = r14
            boolean r0 = r0.loopBody(r1, r2, r3, r4)
            if (r0 == 0) goto L21
            r0 = 1
            r13 = r0
            goto L21
        L3c:
            r0 = r11
            javassist.bytecode.ExceptionTable r0 = r0.getExceptionTable()
            r15 = r0
            r0 = r15
            int r0 = r0.size()
            r16 = r0
            r0 = 0
            r17 = r0
        L4c:
            r0 = r17
            r1 = r16
            if (r0 >= r1) goto L8a
            javassist.expr.Handler r0 = new javassist.expr.Handler
            r1 = r0
            r2 = r15
            r3 = r17
            r4 = r12
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r18 = r0
            r0 = r8
            r1 = r18
            r0.edit(r1)
            r0 = r18
            boolean r0 = r0.edited()
            if (r0 == 0) goto L84
            r0 = 1
            r13 = r0
            r0 = r14
            r1 = r18
            int r1 = r1.locals()
            r2 = r18
            int r2 = r2.stack()
            r0.updateMax(r1, r2)
        L84:
            int r17 = r17 + 1
            goto L4c
        L8a:
            r0 = r11
            int r0 = r0.getMaxLocals()
            r1 = r14
            int r1 = r1.maxLocals
            if (r0 >= r1) goto L9f
            r0 = r11
            r1 = r14
            int r1 = r1.maxLocals
            r0.setMaxLocals(r1)
        L9f:
            r0 = r11
            r1 = r11
            int r1 = r1.getMaxStack()
            r2 = r14
            int r2 = r2.maxStack
            int r1 = r1 + r2
            r0.setMaxStack(r1)
            r0 = r13
            if (r0 == 0) goto Lbe
            r0 = r10
            r1 = r9
            javassist.ClassPool r1 = r1.getClassPool()     // Catch: javassist.bytecode.BadBytecode -> Lc1
            r2 = r9
            javassist.bytecode.ClassFile r2 = r2.getClassFile2()     // Catch: javassist.bytecode.BadBytecode -> Lc1
            r0.rebuildStackMapIf6(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> Lc1
        Lbe:
            goto Ld2
        Lc1:
            r17 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r17
            java.lang.String r2 = r2.getMessage()
            r3 = r17
            r1.<init>(r2, r3)
            throw r0
        Ld2:
            r0 = r13
            return r0
    }

    boolean doit(javassist.CtClass r7, javassist.bytecode.MethodInfo r8, javassist.expr.ExprEditor.LoopContext r9, javassist.bytecode.CodeIterator r10, int r11) throws javassist.CannotCompileException {
            r6 = this;
            r0 = 0
            r12 = r0
        L3:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L46
            r0 = r10
            int r0 = r0.lookAhead()
            r1 = r11
            if (r0 >= r1) goto L46
            r0 = r10
            int r0 = r0.getCodeLength()
            r13 = r0
            r0 = r6
            r1 = r10
            r2 = r7
            r3 = r8
            r4 = r9
            boolean r0 = r0.loopBody(r1, r2, r3, r4)
            if (r0 == 0) goto L43
            r0 = 1
            r12 = r0
            r0 = r10
            int r0 = r0.getCodeLength()
            r14 = r0
            r0 = r13
            r1 = r14
            if (r0 == r1) goto L43
            r0 = r11
            r1 = r14
            r2 = r13
            int r1 = r1 - r2
            int r0 = r0 + r1
            r11 = r0
        L43:
            goto L3
        L46:
            r0 = r12
            return r0
    }

    final boolean loopBody(javassist.bytecode.CodeIterator r10, javassist.CtClass r11, javassist.bytecode.MethodInfo r12, javassist.expr.ExprEditor.LoopContext r13) throws javassist.CannotCompileException {
            r9 = this;
            r0 = 0
            r14 = r0
            r0 = r10
            int r0 = r0.next()     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r15 = r0
            r0 = r10
            r1 = r15
            int r0 = r0.byteAt(r1)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r16 = r0
            r0 = r16
            r1 = 178(0xb2, float:2.5E-43)
            if (r0 >= r1) goto L1c
            goto L1d4
        L1c:
            r0 = r16
            r1 = 188(0xbc, float:2.63E-43)
            if (r0 >= r1) goto L15f
            r0 = r16
            r1 = 184(0xb8, float:2.58E-43)
            if (r0 == r1) goto L3c
            r0 = r16
            r1 = 185(0xb9, float:2.59E-43)
            if (r0 == r1) goto L3c
            r0 = r16
            r1 = 182(0xb6, float:2.55E-43)
            if (r0 != r1) goto L56
        L3c:
            javassist.expr.MethodCall r0 = new javassist.expr.MethodCall     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r1 = r0
            r2 = r15
            r3 = r10
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r14 = r0
            r0 = r9
            r1 = r14
            javassist.expr.MethodCall r1 = (javassist.expr.MethodCall) r1     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r0.edit(r1)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            goto L1d4
        L56:
            r0 = r16
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 == r1) goto L76
            r0 = r16
            r1 = 178(0xb2, float:2.5E-43)
            if (r0 == r1) goto L76
            r0 = r16
            r1 = 181(0xb5, float:2.54E-43)
            if (r0 == r1) goto L76
            r0 = r16
            r1 = 179(0xb3, float:2.51E-43)
            if (r0 != r1) goto L92
        L76:
            javassist.expr.FieldAccess r0 = new javassist.expr.FieldAccess     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r1 = r0
            r2 = r15
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r16
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r14 = r0
            r0 = r9
            r1 = r14
            javassist.expr.FieldAccess r1 = (javassist.expr.FieldAccess) r1     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r0.edit(r1)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            goto L1d4
        L92:
            r0 = r16
            r1 = 187(0xbb, float:2.62E-43)
            if (r0 != r1) goto Lc3
            r0 = r10
            r1 = r15
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.u16bitAt(r1)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r17 = r0
            r0 = r13
            javassist.expr.ExprEditor$NewOp r1 = new javassist.expr.ExprEditor$NewOp     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r2 = r1
            r3 = r13
            javassist.expr.ExprEditor$NewOp r3 = r3.newList     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r4 = r15
            r5 = r12
            javassist.bytecode.ConstPool r5 = r5.getConstPool()     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r6 = r17
            java.lang.String r5 = r5.getClassInfo(r6)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r2.<init>(r3, r4, r5)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r0.newList = r1     // Catch: javassist.bytecode.BadBytecode -> L1f4
            goto L1d4
        Lc3:
            r0 = r16
            r1 = 183(0xb7, float:2.56E-43)
            if (r0 != r1) goto L1d4
            r0 = r13
            javassist.expr.ExprEditor$NewOp r0 = r0.newList     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r17 = r0
            r0 = r17
            if (r0 == 0) goto L11c
            r0 = r12
            javassist.bytecode.ConstPool r0 = r0.getConstPool()     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r1 = r17
            java.lang.String r1 = r1.type     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r2 = r10
            r3 = r15
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.u16bitAt(r3)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            int r0 = r0.isConstructor(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            if (r0 <= 0) goto L11c
            javassist.expr.NewExpr r0 = new javassist.expr.NewExpr     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r1 = r0
            r2 = r15
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r17
            java.lang.String r6 = r6.type     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r7 = r17
            int r7 = r7.pos     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r14 = r0
            r0 = r9
            r1 = r14
            javassist.expr.NewExpr r1 = (javassist.expr.NewExpr) r1     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r0.edit(r1)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r0 = r13
            r1 = r17
            javassist.expr.ExprEditor$NewOp r1 = r1.next     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r0.newList = r1     // Catch: javassist.bytecode.BadBytecode -> L1f4
            goto L15c
        L11c:
            javassist.expr.MethodCall r0 = new javassist.expr.MethodCall     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r1 = r0
            r2 = r15
            r3 = r10
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r18 = r0
            r0 = r18
            java.lang.String r0 = r0.getMethodName()     // Catch: javassist.bytecode.BadBytecode -> L1f4
            java.lang.String r1 = "<init>"
            boolean r0 = r0.equals(r1)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            if (r0 == 0) goto L152
            javassist.expr.ConstructorCall r0 = new javassist.expr.ConstructorCall     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r1 = r0
            r2 = r15
            r3 = r10
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r19 = r0
            r0 = r19
            r14 = r0
            r0 = r9
            r1 = r19
            r0.edit(r1)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            goto L15c
        L152:
            r0 = r18
            r14 = r0
            r0 = r9
            r1 = r18
            r0.edit(r1)     // Catch: javassist.bytecode.BadBytecode -> L1f4
        L15c:
            goto L1d4
        L15f:
            r0 = r16
            r1 = 188(0xbc, float:2.63E-43)
            if (r0 == r1) goto L177
            r0 = r16
            r1 = 189(0xbd, float:2.65E-43)
            if (r0 == r1) goto L177
            r0 = r16
            r1 = 197(0xc5, float:2.76E-43)
            if (r0 != r1) goto L193
        L177:
            javassist.expr.NewArray r0 = new javassist.expr.NewArray     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r1 = r0
            r2 = r15
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r16
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r14 = r0
            r0 = r9
            r1 = r14
            javassist.expr.NewArray r1 = (javassist.expr.NewArray) r1     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r0.edit(r1)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            goto L1d4
        L193:
            r0 = r16
            r1 = 193(0xc1, float:2.7E-43)
            if (r0 != r1) goto L1b5
            javassist.expr.Instanceof r0 = new javassist.expr.Instanceof     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r1 = r0
            r2 = r15
            r3 = r10
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r14 = r0
            r0 = r9
            r1 = r14
            javassist.expr.Instanceof r1 = (javassist.expr.Instanceof) r1     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r0.edit(r1)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            goto L1d4
        L1b5:
            r0 = r16
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L1d4
            javassist.expr.Cast r0 = new javassist.expr.Cast     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r1 = r0
            r2 = r15
            r3 = r10
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r14 = r0
            r0 = r9
            r1 = r14
            javassist.expr.Cast r1 = (javassist.expr.Cast) r1     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r0.edit(r1)     // Catch: javassist.bytecode.BadBytecode -> L1f4
        L1d4:
            r0 = r14
            if (r0 == 0) goto L1f2
            r0 = r14
            boolean r0 = r0.edited()     // Catch: javassist.bytecode.BadBytecode -> L1f4
            if (r0 == 0) goto L1f2
            r0 = r13
            r1 = r14
            int r1 = r1.locals()     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r2 = r14
            int r2 = r2.stack()     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r0.updateMax(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L1f4
            r0 = 1
            return r0
        L1f2:
            r0 = 0
            return r0
        L1f4:
            r14 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            throw r0
    }

    public void edit(javassist.expr.NewExpr r2) throws javassist.CannotCompileException {
            r1 = this;
            return
    }

    public void edit(javassist.expr.NewArray r2) throws javassist.CannotCompileException {
            r1 = this;
            return
    }

    public void edit(javassist.expr.MethodCall r2) throws javassist.CannotCompileException {
            r1 = this;
            return
    }

    public void edit(javassist.expr.ConstructorCall r2) throws javassist.CannotCompileException {
            r1 = this;
            return
    }

    public void edit(javassist.expr.FieldAccess r2) throws javassist.CannotCompileException {
            r1 = this;
            return
    }

    public void edit(javassist.expr.Instanceof r2) throws javassist.CannotCompileException {
            r1 = this;
            return
    }

    public void edit(javassist.expr.Cast r2) throws javassist.CannotCompileException {
            r1 = this;
            return
    }

    public void edit(javassist.expr.Handler r2) throws javassist.CannotCompileException {
            r1 = this;
            return
    }
}
