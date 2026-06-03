package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtNewWrappedConstructor.class */
class CtNewWrappedConstructor extends javassist.CtNewWrappedMethod {
    private static final int PASS_NONE = 0;
    private static final int PASS_PARAMS = 2;

    CtNewWrappedConstructor() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static javassist.CtConstructor wrapped(javassist.CtClass[] r7, javassist.CtClass[] r8, int r9, javassist.CtMethod r10, javassist.CtMethod.ConstParameter r11, javassist.CtClass r12) throws javassist.CannotCompileException {
            javassist.CtConstructor r0 = new javassist.CtConstructor     // Catch: javassist.NotFoundException -> L33
            r1 = r0
            r2 = r7
            r3 = r12
            r1.<init>(r2, r3)     // Catch: javassist.NotFoundException -> L33
            r13 = r0
            r0 = r13
            r1 = r8
            r0.setExceptionTypes(r1)     // Catch: javassist.NotFoundException -> L33
            r0 = r12
            r1 = r12
            javassist.bytecode.ClassFile r1 = r1.getClassFile2()     // Catch: javassist.NotFoundException -> L33
            r2 = r9
            r3 = r10
            r4 = r7
            r5 = r11
            javassist.bytecode.Bytecode r0 = makeBody(r0, r1, r2, r3, r4, r5)     // Catch: javassist.NotFoundException -> L33
            r14 = r0
            r0 = r13
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()     // Catch: javassist.NotFoundException -> L33
            r1 = r14
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()     // Catch: javassist.NotFoundException -> L33
            r0.setCodeAttribute(r1)     // Catch: javassist.NotFoundException -> L33
            r0 = r13
            return r0
        L33:
            r13 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
    }

    protected static javassist.bytecode.Bytecode makeBody(javassist.CtClass r9, javassist.bytecode.ClassFile r10, int r11, javassist.CtMethod r12, javassist.CtClass[] r13, javassist.CtMethod.ConstParameter r14) throws javassist.CannotCompileException {
            r0 = r10
            int r0 = r0.getSuperclassId()
            r17 = r0
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r10
            javassist.bytecode.ConstPool r2 = r2.getConstPool()
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r18 = r0
            r0 = r18
            r1 = 0
            r2 = r13
            r3 = 0
            r0.setMaxLocals(r1, r2, r3)
            r0 = r18
            r1 = 0
            r0.addAload(r1)
            r0 = r11
            if (r0 != 0) goto L39
            r0 = 1
            r15 = r0
            r0 = r18
            r1 = r17
            java.lang.String r2 = "<init>"
            java.lang.String r3 = "()V"
            r0.addInvokespecial(r1, r2, r3)
            goto L9d
        L39:
            r0 = r11
            r1 = 2
            if (r0 != r1) goto L5b
            r0 = r18
            r1 = r13
            r2 = 1
            int r0 = r0.addLoadParameters(r1, r2)
            r1 = 1
            int r0 = r0 + r1
            r15 = r0
            r0 = r18
            r1 = r17
            java.lang.String r2 = "<init>"
            r3 = r13
            java.lang.String r3 = javassist.bytecode.Descriptor.ofConstructor(r3)
            r0.addInvokespecial(r1, r2, r3)
            goto L9d
        L5b:
            r0 = r18
            r1 = r13
            r2 = 1
            int r0 = compileParameterList(r0, r1, r2)
            r15 = r0
            r0 = r14
            if (r0 != 0) goto L75
            r0 = 2
            r16 = r0
            java.lang.String r0 = javassist.CtMethod.ConstParameter.defaultConstDescriptor()
            r19 = r0
            goto L87
        L75:
            r0 = r14
            r1 = r18
            int r0 = r0.compile(r1)
            r1 = 2
            int r0 = r0 + r1
            r16 = r0
            r0 = r14
            java.lang.String r0 = r0.constDescriptor()
            r19 = r0
        L87:
            r0 = r15
            r1 = r16
            if (r0 >= r1) goto L92
            r0 = r16
            r15 = r0
        L92:
            r0 = r18
            r1 = r17
            java.lang.String r2 = "<init>"
            r3 = r19
            r0.addInvokespecial(r1, r2, r3)
        L9d:
            r0 = r12
            if (r0 != 0) goto Lac
            r0 = r18
            r1 = 177(0xb1, float:2.48E-43)
            r0.add(r1)
            goto Lc9
        Lac:
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = 0
            r4 = r13
            javassist.CtClass r5 = javassist.CtClass.voidType
            r6 = r14
            r7 = r18
            int r0 = makeBody0(r0, r1, r2, r3, r4, r5, r6, r7)
            r16 = r0
            r0 = r15
            r1 = r16
            if (r0 >= r1) goto Lc9
            r0 = r16
            r15 = r0
        Lc9:
            r0 = r18
            r1 = r15
            r0.setMaxStack(r1)
            r0 = r18
            return r0
    }
}
