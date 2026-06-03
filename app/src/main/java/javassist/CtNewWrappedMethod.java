package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtNewWrappedMethod.class */
class CtNewWrappedMethod {
    private static final java.lang.String addedWrappedMethod = "_added_m$";

    CtNewWrappedMethod() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static javassist.CtMethod wrapped(javassist.CtClass r7, java.lang.String r8, javassist.CtClass[] r9, javassist.CtClass[] r10, javassist.CtMethod r11, javassist.CtMethod.ConstParameter r12, javassist.CtClass r13) throws javassist.CannotCompileException {
            javassist.CtMethod r0 = new javassist.CtMethod
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r13
            r1.<init>(r2, r3, r4, r5)
            r14 = r0
            r0 = r14
            r1 = r11
            int r1 = r1.getModifiers()
            r0.setModifiers(r1)
            r0 = r14
            r1 = r10
            r0.setExceptionTypes(r1)     // Catch: javassist.NotFoundException -> L21
            goto L2d
        L21:
            r15 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            throw r0
        L2d:
            r0 = r13
            r1 = r13
            javassist.bytecode.ClassFile r1 = r1.getClassFile2()
            r2 = r11
            r3 = r9
            r4 = r7
            r5 = r12
            javassist.bytecode.Bytecode r0 = makeBody(r0, r1, r2, r3, r4, r5)
            r15 = r0
            r0 = r14
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            r16 = r0
            r0 = r16
            r1 = r15
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()
            r0.setCodeAttribute(r1)
            r0 = r14
            return r0
    }

    static javassist.bytecode.Bytecode makeBody(javassist.CtClass r9, javassist.bytecode.ClassFile r10, javassist.CtMethod r11, javassist.CtClass[] r12, javassist.CtClass r13, javassist.CtMethod.ConstParameter r14) throws javassist.CannotCompileException {
            r0 = r11
            int r0 = r0.getModifiers()
            boolean r0 = javassist.Modifier.isStatic(r0)
            r15 = r0
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r10
            javassist.bytecode.ConstPool r2 = r2.getConstPool()
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r16 = r0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r15
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r16
            int r0 = makeBody0(r0, r1, r2, r3, r4, r5, r6, r7)
            r17 = r0
            r0 = r16
            r1 = r17
            r0.setMaxStack(r1)
            r0 = r16
            r1 = r15
            r2 = r12
            r3 = 0
            r0.setMaxLocals(r1, r2, r3)
            r0 = r16
            return r0
    }

    protected static int makeBody0(javassist.CtClass r5, javassist.bytecode.ClassFile r6, javassist.CtMethod r7, boolean r8, javassist.CtClass[] r9, javassist.CtClass r10, javassist.CtMethod.ConstParameter r11, javassist.bytecode.Bytecode r12) throws javassist.CannotCompileException {
            r0 = r5
            boolean r0 = r0 instanceof javassist.CtClassType
            if (r0 != 0) goto L25
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad declaring class"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L25:
            r0 = r8
            if (r0 != 0) goto L2f
            r0 = r12
            r1 = 0
            r0.addAload(r1)
        L2f:
            r0 = r12
            r1 = r9
            r2 = r8
            if (r2 == 0) goto L3b
            r2 = 0
            goto L3c
        L3b:
            r2 = 1
        L3c:
            int r0 = compileParameterList(r0, r1, r2)
            r13 = r0
            r0 = r11
            if (r0 != 0) goto L51
            r0 = 0
            r14 = r0
            java.lang.String r0 = javassist.CtMethod.ConstParameter.defaultDescriptor()
            r15 = r0
            goto L61
        L51:
            r0 = r11
            r1 = r12
            int r0 = r0.compile(r1)
            r14 = r0
            r0 = r11
            java.lang.String r0 = r0.descriptor()
            r15 = r0
        L61:
            r0 = r7
            r1 = r15
            checkSignature(r0, r1)
            r0 = r5
            javassist.CtClassType r0 = (javassist.CtClassType) r0     // Catch: javassist.bytecode.BadBytecode -> L75
            r1 = r6
            r2 = r7
            java.lang.String r0 = addBodyMethod(r0, r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L75
            r16 = r0
            goto L81
        L75:
            r17 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r17
            r1.<init>(r2)
            throw r0
        L81:
            r0 = r8
            if (r0 == 0) goto L94
            r0 = r12
            javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
            r2 = r16
            r3 = r15
            r0.addInvokestatic(r1, r2, r3)
            goto La0
        L94:
            r0 = r12
            javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
            r2 = r16
            r3 = r15
            r0.addInvokespecial(r1, r2, r3)
        La0:
            r0 = r12
            r1 = r10
            compileReturn(r0, r1)
            r0 = r13
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            if (r0 >= r1) goto Lb6
            r0 = r14
            r1 = 2
            int r0 = r0 + r1
            r13 = r0
        Lb6:
            r0 = r13
            return r0
    }

    private static void checkSignature(javassist.CtMethod r5, java.lang.String r6) throws javassist.CannotCompileException {
            r0 = r6
            r1 = r5
            javassist.bytecode.MethodInfo r1 = r1.getMethodInfo2()
            java.lang.String r1 = r1.getDescriptor()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "wrapped method with a bad signature: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            javassist.CtClass r3 = r3.getDeclaringClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = 46
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L3b:
            return
    }

    private static java.lang.String addBodyMethod(javassist.CtClassType r7, javassist.bytecode.ClassFile r8, javassist.CtMethod r9) throws javassist.bytecode.BadBytecode, javassist.CannotCompileException {
            r0 = r7
            java.util.Map r0 = r0.getHiddenMethods()
            r10 = r0
            r0 = r10
            r1 = r9
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r11
            if (r0 != 0) goto Lb1
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "_added_m$"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            int r1 = r1.getUniqueNumber()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11 = r0
            r0 = r8
            r1 = r11
            javassist.bytecode.MethodInfo r0 = r0.getMethod(r1)
            if (r0 != 0) goto L16
            javassist.ClassMap r0 = new javassist.ClassMap
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r12
            r1 = r9
            javassist.CtClass r1 = r1.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r2 = r7
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = r0.put(r1, r2)
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo
            r1 = r0
            r2 = r8
            javassist.bytecode.ConstPool r2 = r2.getConstPool()
            r3 = r11
            r4 = r9
            javassist.bytecode.MethodInfo r4 = r4.getMethodInfo2()
            r5 = r12
            r1.<init>(r2, r3, r4, r5)
            r13 = r0
            r0 = r13
            int r0 = r0.getAccessFlags()
            r14 = r0
            r0 = r13
            r1 = r14
            int r1 = javassist.bytecode.AccessFlag.setPrivate(r1)
            r0.setAccessFlags(r1)
            r0 = r13
            javassist.bytecode.SyntheticAttribute r1 = new javassist.bytecode.SyntheticAttribute
            r2 = r1
            r3 = r8
            javassist.bytecode.ConstPool r3 = r3.getConstPool()
            r2.<init>(r3)
            r0.addAttribute(r1)
            r0 = r8
            r1 = r13
            r0.addMethod(r1)
            r0 = r10
            r1 = r9
            r2 = r11
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            javassist.CtMember$Cache r0 = r0.hasMemberCache()
            r15 = r0
            r0 = r15
            if (r0 == 0) goto Lb1
            r0 = r15
            javassist.CtMethod r1 = new javassist.CtMethod
            r2 = r1
            r3 = r13
            r4 = r7
            r2.<init>(r3, r4)
            r0.addMethod(r1)
        Lb1:
            r0 = r11
            return r0
    }

    static int compileParameterList(javassist.bytecode.Bytecode r4, javassist.CtClass[] r5, int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = javassist.compiler.JvstCodeGen.compileParameterList(r0, r1, r2)
            return r0
    }

    private static void compileReturn(javassist.bytecode.Bytecode r5, javassist.CtClass r6) {
            r0 = r6
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L35
            r0 = r6
            javassist.CtPrimitiveType r0 = (javassist.CtPrimitiveType) r0
            r7 = r0
            r0 = r7
            javassist.CtClass r1 = javassist.CtClass.voidType
            if (r0 == r1) goto L2a
            r0 = r7
            java.lang.String r0 = r0.getWrapperName()
            r8 = r0
            r0 = r5
            r1 = r8
            r0.addCheckcast(r1)
            r0 = r5
            r1 = r8
            r2 = r7
            java.lang.String r2 = r2.getGetMethodName()
            r3 = r7
            java.lang.String r3 = r3.getGetMethodDescriptor()
            r0.addInvokevirtual(r1, r2, r3)
        L2a:
            r0 = r5
            r1 = r7
            int r1 = r1.getReturnOp()
            r0.addOpcode(r1)
            goto L41
        L35:
            r0 = r5
            r1 = r6
            r0.addCheckcast(r1)
            r0 = r5
            r1 = 176(0xb0, float:2.47E-43)
            r0.addOpcode(r1)
        L41:
            return
    }
}
