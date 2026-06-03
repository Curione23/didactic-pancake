package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtNewMethod.class */
public class CtNewMethod {
    public CtNewMethod() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static javassist.CtMethod make(java.lang.String r5, javassist.CtClass r6) throws javassist.CannotCompileException {
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = 0
            javassist.CtMethod r0 = make(r0, r1, r2, r3)
            return r0
    }

    public static javassist.CtMethod make(java.lang.String r4, javassist.CtClass r5, java.lang.String r6, java.lang.String r7) throws javassist.CannotCompileException {
            javassist.compiler.Javac r0 = new javassist.compiler.Javac
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L15
            r0 = r8
            r1 = r6
            r2 = r7
            r0.recordProceed(r1, r2)     // Catch: javassist.compiler.CompileError -> L2e
        L15:
            r0 = r8
            r1 = r4
            javassist.CtMember r0 = r0.compile(r1)     // Catch: javassist.compiler.CompileError -> L2e
            r9 = r0
            r0 = r9
            boolean r0 = r0 instanceof javassist.CtMethod     // Catch: javassist.compiler.CompileError -> L2e
            if (r0 == 0) goto L2b
            r0 = r9
            javassist.CtMethod r0 = (javassist.CtMethod) r0     // Catch: javassist.compiler.CompileError -> L2e
            return r0
        L2b:
            goto L3a
        L2e:
            r9 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
        L3a:
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "not a method"
            r1.<init>(r2)
            throw r0
    }

    public static javassist.CtMethod make(javassist.CtClass r8, java.lang.String r9, javassist.CtClass[] r10, javassist.CtClass[] r11, java.lang.String r12, javassist.CtClass r13) throws javassist.CannotCompileException {
            r0 = 1
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            javassist.CtMethod r0 = make(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static javassist.CtMethod make(int r7, javassist.CtClass r8, java.lang.String r9, javassist.CtClass[] r10, javassist.CtClass[] r11, java.lang.String r12, javassist.CtClass r13) throws javassist.CannotCompileException {
            javassist.CtMethod r0 = new javassist.CtMethod     // Catch: javassist.NotFoundException -> L25
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r13
            r1.<init>(r2, r3, r4, r5)     // Catch: javassist.NotFoundException -> L25
            r14 = r0
            r0 = r14
            r1 = r7
            r0.setModifiers(r1)     // Catch: javassist.NotFoundException -> L25
            r0 = r14
            r1 = r11
            r0.setExceptionTypes(r1)     // Catch: javassist.NotFoundException -> L25
            r0 = r14
            r1 = r12
            r0.setBody(r1)     // Catch: javassist.NotFoundException -> L25
            r0 = r14
            return r0
        L25:
            r14 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            throw r0
    }

    public static javassist.CtMethod copy(javassist.CtMethod r6, javassist.CtClass r7, javassist.ClassMap r8) throws javassist.CannotCompileException {
            javassist.CtMethod r0 = new javassist.CtMethod
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }

    public static javassist.CtMethod copy(javassist.CtMethod r6, java.lang.String r7, javassist.CtClass r8, javassist.ClassMap r9) throws javassist.CannotCompileException {
            javassist.CtMethod r0 = new javassist.CtMethod
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r10
            r1 = r7
            r0.setName(r1)
            r0 = r10
            return r0
    }

    public static javassist.CtMethod abstractMethod(javassist.CtClass r7, java.lang.String r8, javassist.CtClass[] r9, javassist.CtClass[] r10, javassist.CtClass r11) throws javassist.NotFoundException {
            javassist.CtMethod r0 = new javassist.CtMethod
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r11
            r1.<init>(r2, r3, r4, r5)
            r12 = r0
            r0 = r12
            r1 = r10
            r0.setExceptionTypes(r1)
            r0 = r12
            return r0
    }

    public static javassist.CtMethod getter(java.lang.String r6, javassist.CtField r7) throws javassist.CannotCompileException {
            r0 = r7
            javassist.bytecode.FieldInfo r0 = r0.getFieldInfo2()
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.getDescriptor()
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "()"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10 = r0
            r0 = r8
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r11 = r0
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo
            r1 = r0
            r2 = r11
            r3 = r6
            r4 = r10
            r1.<init>(r2, r3, r4)
            r12 = r0
            r0 = r12
            r1 = 1
            r0.setAccessFlags(r1)
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r11
            r3 = 2
            r4 = 1
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r8
            java.lang.String r0 = r0.getName()     // Catch: javassist.NotFoundException -> L81
            r14 = r0
            r0 = r8
            int r0 = r0.getAccessFlags()     // Catch: javassist.NotFoundException -> L81
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L6a
            r0 = r13
            r1 = 0
            r0.addAload(r1)     // Catch: javassist.NotFoundException -> L81
            r0 = r13
            javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS     // Catch: javassist.NotFoundException -> L81
            r2 = r14
            r3 = r9
            r0.addGetfield(r1, r2, r3)     // Catch: javassist.NotFoundException -> L81
            goto L75
        L6a:
            r0 = r13
            javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS     // Catch: javassist.NotFoundException -> L81
            r2 = r14
            r3 = r9
            r0.addGetstatic(r1, r2, r3)     // Catch: javassist.NotFoundException -> L81
        L75:
            r0 = r13
            r1 = r7
            javassist.CtClass r1 = r1.getType()     // Catch: javassist.NotFoundException -> L81
            r0.addReturn(r1)     // Catch: javassist.NotFoundException -> L81
            goto L8d
        L81:
            r14 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            throw r0
        L8d:
            r0 = r12
            r1 = r13
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()
            r0.setCodeAttribute(r1)
            r0 = r7
            javassist.CtClass r0 = r0.getDeclaringClass()
            r14 = r0
            javassist.CtMethod r0 = new javassist.CtMethod
            r1 = r0
            r2 = r12
            r3 = r14
            r1.<init>(r2, r3)
            return r0
    }

    public static javassist.CtMethod setter(java.lang.String r6, javassist.CtField r7) throws javassist.CannotCompileException {
            r0 = r7
            javassist.bytecode.FieldInfo r0 = r0.getFieldInfo2()
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.getDescriptor()
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")V"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10 = r0
            r0 = r8
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r11 = r0
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo
            r1 = r0
            r2 = r11
            r3 = r6
            r4 = r10
            r1.<init>(r2, r3, r4)
            r12 = r0
            r0 = r12
            r1 = 1
            r0.setAccessFlags(r1)
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r11
            r3 = 3
            r4 = 3
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r8
            java.lang.String r0 = r0.getName()     // Catch: javassist.NotFoundException -> L99
            r14 = r0
            r0 = r8
            int r0 = r0.getAccessFlags()     // Catch: javassist.NotFoundException -> L99
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L7a
            r0 = r13
            r1 = 0
            r0.addAload(r1)     // Catch: javassist.NotFoundException -> L99
            r0 = r13
            r1 = 1
            r2 = r7
            javassist.CtClass r2 = r2.getType()     // Catch: javassist.NotFoundException -> L99
            int r0 = r0.addLoad(r1, r2)     // Catch: javassist.NotFoundException -> L99
            r0 = r13
            javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS     // Catch: javassist.NotFoundException -> L99
            r2 = r14
            r3 = r9
            r0.addPutfield(r1, r2, r3)     // Catch: javassist.NotFoundException -> L99
            goto L90
        L7a:
            r0 = r13
            r1 = 1
            r2 = r7
            javassist.CtClass r2 = r2.getType()     // Catch: javassist.NotFoundException -> L99
            int r0 = r0.addLoad(r1, r2)     // Catch: javassist.NotFoundException -> L99
            r0 = r13
            javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS     // Catch: javassist.NotFoundException -> L99
            r2 = r14
            r3 = r9
            r0.addPutstatic(r1, r2, r3)     // Catch: javassist.NotFoundException -> L99
        L90:
            r0 = r13
            r1 = 0
            r0.addReturn(r1)     // Catch: javassist.NotFoundException -> L99
            goto La5
        L99:
            r14 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            throw r0
        La5:
            r0 = r12
            r1 = r13
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()
            r0.setCodeAttribute(r1)
            r0 = r7
            javassist.CtClass r0 = r0.getDeclaringClass()
            r14 = r0
            javassist.CtMethod r0 = new javassist.CtMethod
            r1 = r0
            r2 = r12
            r3 = r14
            r1.<init>(r2, r3)
            return r0
    }

    public static javassist.CtMethod delegator(javassist.CtMethod r4, javassist.CtClass r5) throws javassist.CannotCompileException {
            r0 = r4
            r1 = r5
            javassist.CtMethod r0 = delegator0(r0, r1)     // Catch: javassist.NotFoundException -> L6
            return r0
        L6:
            r6 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    private static javassist.CtMethod delegator0(javassist.CtMethod r6, javassist.CtClass r7) throws javassist.CannotCompileException, javassist.NotFoundException {
            r0 = r6
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.getName()
            r9 = r0
            r0 = r8
            java.lang.String r0 = r0.getDescriptor()
            r10 = r0
            r0 = r7
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r11 = r0
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo
            r1 = r0
            r2 = r11
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4)
            r12 = r0
            r0 = r12
            r1 = r8
            int r1 = r1.getAccessFlags()
            r0.setAccessFlags(r1)
            r0 = r8
            javassist.bytecode.ExceptionsAttribute r0 = r0.getExceptionsAttribute()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L4b
            r0 = r12
            r1 = r13
            r2 = r11
            r3 = 0
            javassist.bytecode.AttributeInfo r1 = r1.copy(r2, r3)
            javassist.bytecode.ExceptionsAttribute r1 = (javassist.bytecode.ExceptionsAttribute) r1
            r0.setExceptionsAttribute(r1)
        L4b:
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r11
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r14 = r0
            r0 = r6
            int r0 = r0.getModifiers()
            boolean r0 = javassist.Modifier.isStatic(r0)
            r15 = r0
            r0 = r6
            javassist.CtClass r0 = r0.getDeclaringClass()
            r16 = r0
            r0 = r6
            javassist.CtClass[] r0 = r0.getParameterTypes()
            r17 = r0
            r0 = r15
            if (r0 == 0) goto L89
            r0 = r14
            r1 = r17
            r2 = 0
            int r0 = r0.addLoadParameters(r1, r2)
            r18 = r0
            r0 = r14
            r1 = r16
            r2 = r9
            r3 = r10
            r0.addInvokestatic(r1, r2, r3)
            goto La6
        L89:
            r0 = r14
            r1 = 0
            r2 = r16
            int r0 = r0.addLoad(r1, r2)
            r0 = r14
            r1 = r17
            r2 = 1
            int r0 = r0.addLoadParameters(r1, r2)
            r18 = r0
            r0 = r14
            r1 = r16
            r2 = r9
            r3 = r10
            r0.addInvokespecial(r1, r2, r3)
        La6:
            r0 = r14
            r1 = r6
            javassist.CtClass r1 = r1.getReturnType()
            r0.addReturn(r1)
            r0 = r14
            int r18 = r18 + 1
            r1 = r18
            r0.setMaxLocals(r1)
            r0 = r14
            r1 = r18
            r2 = 2
            if (r1 >= r2) goto Lc5
            r1 = 2
            goto Lc7
        Lc5:
            r1 = r18
        Lc7:
            r0.setMaxStack(r1)
            r0 = r12
            r1 = r14
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()
            r0.setCodeAttribute(r1)
            javassist.CtMethod r0 = new javassist.CtMethod
            r1 = r0
            r2 = r12
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static javassist.CtMethod wrapped(javassist.CtClass r8, java.lang.String r9, javassist.CtClass[] r10, javassist.CtClass[] r11, javassist.CtMethod r12, javassist.CtMethod.ConstParameter r13, javassist.CtClass r14) throws javassist.CannotCompileException {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            javassist.CtMethod r0 = javassist.CtNewWrappedMethod.wrapped(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }
}
