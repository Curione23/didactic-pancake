package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/AccessorMaker.class */
public class AccessorMaker {
    private javassist.CtClass clazz;
    private int uniqueNumber;
    private java.util.Map<java.lang.String, java.lang.Object> accessors;
    static final java.lang.String lastParamType = "javassist.runtime.Inner";

    public AccessorMaker(javassist.CtClass r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.clazz = r1
            r0 = r4
            r1 = 1
            r0.uniqueNumber = r1
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.accessors = r1
            return
    }

    public java.lang.String getConstructor(javassist.CtClass r7, java.lang.String r8, javassist.bytecode.MethodInfo r9) throws javassist.compiler.CompileError {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "<init>:"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10 = r0
            r0 = r6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.accessors
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L2d
            r0 = r11
            return r0
        L2d:
            java.lang.String r0 = "javassist.runtime.Inner"
            r1 = r8
            java.lang.String r0 = javassist.bytecode.Descriptor.appendParameter(r0, r1)
            r11 = r0
            r0 = r6
            javassist.CtClass r0 = r0.clazz
            javassist.bytecode.ClassFile r0 = r0.getClassFile()
            r12 = r0
            r0 = r12
            javassist.bytecode.ConstPool r0 = r0.getConstPool()     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r13 = r0
            r0 = r6
            javassist.CtClass r0 = r0.clazz     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            javassist.ClassPool r0 = r0.getClassPool()     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r14 = r0
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r1 = r0
            r2 = r13
            java.lang.String r3 = "<init>"
            r4 = r11
            r1.<init>(r2, r3, r4)     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r15 = r0
            r0 = r15
            r1 = 0
            r0.setAccessFlags(r1)     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r0 = r15
            javassist.bytecode.SyntheticAttribute r1 = new javassist.bytecode.SyntheticAttribute     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r2 = r1
            r3 = r13
            r2.<init>(r3)     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r0.addAttribute(r1)     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r0 = r9
            javassist.bytecode.ExceptionsAttribute r0 = r0.getExceptionsAttribute()     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L89
            r0 = r15
            r1 = r16
            r2 = r13
            r3 = 0
            javassist.bytecode.AttributeInfo r1 = r1.copy(r2, r3)     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r0.addAttribute(r1)     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
        L89:
            r0 = r8
            r1 = r14
            javassist.CtClass[] r0 = javassist.bytecode.Descriptor.getParameterTypes(r0, r1)     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r17 = r0
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r1 = r0
            r2 = r13
            r1.<init>(r2)     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r18 = r0
            r0 = r18
            r1 = 0
            r0.addAload(r1)     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r0 = 1
            r19 = r0
            r0 = 0
            r20 = r0
        La8:
            r0 = r20
            r1 = r17
            int r1 = r1.length     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            if (r0 >= r1) goto Lc7
            r0 = r19
            r1 = r18
            r2 = r19
            r3 = r17
            r4 = r20
            r3 = r3[r4]     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            int r1 = r1.addLoad(r2, r3)     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            int r0 = r0 + r1
            r19 = r0
            int r20 = r20 + 1
            goto La8
        Lc7:
            r0 = r18
            r1 = r19
            r2 = 1
            int r1 = r1 + r2
            r0.setMaxLocals(r1)     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r0 = r18
            r1 = r6
            javassist.CtClass r1 = r1.clazz     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            java.lang.String r2 = "<init>"
            r3 = r8
            r0.addInvokespecial(r1, r2, r3)     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r0 = r18
            r1 = 0
            r0.addReturn(r1)     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r0 = r15
            r1 = r18
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r0.setCodeAttribute(r1)     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            r0 = r12
            r1 = r15
            r0.addMethod(r1)     // Catch: javassist.CannotCompileException -> Lf6 javassist.NotFoundException -> L102
            goto L10e
        Lf6:
            r13 = move-exception
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
        L102:
            r13 = move-exception
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
        L10e:
            r0 = r6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.accessors
            r1 = r10
            r2 = r11
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r11
            return r0
    }

    public java.lang.String getMethodAccessor(java.lang.String r7, java.lang.String r8, java.lang.String r9, javassist.bytecode.MethodInfo r10) throws javassist.compiler.CompileError {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11 = r0
            r0 = r6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.accessors
            r1 = r11
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L31
            r0 = r12
            return r0
        L31:
            r0 = r6
            javassist.CtClass r0 = r0.clazz
            javassist.bytecode.ClassFile r0 = r0.getClassFile()
            r13 = r0
            r0 = r6
            r1 = r13
            java.lang.String r0 = r0.findAccessorName(r1)
            r12 = r0
            r0 = r13
            javassist.bytecode.ConstPool r0 = r0.getConstPool()     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r14 = r0
            r0 = r6
            javassist.CtClass r0 = r0.clazz     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            javassist.ClassPool r0 = r0.getClassPool()     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r15 = r0
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r1 = r0
            r2 = r14
            r3 = r12
            r4 = r9
            r1.<init>(r2, r3, r4)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r16 = r0
            r0 = r16
            r1 = 8
            r0.setAccessFlags(r1)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r0 = r16
            javassist.bytecode.SyntheticAttribute r1 = new javassist.bytecode.SyntheticAttribute     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r2 = r1
            r3 = r14
            r2.<init>(r3)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r0.addAttribute(r1)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r0 = r10
            javassist.bytecode.ExceptionsAttribute r0 = r0.getExceptionsAttribute()     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r17 = r0
            r0 = r17
            if (r0 == 0) goto L8e
            r0 = r16
            r1 = r17
            r2 = r14
            r3 = 0
            javassist.bytecode.AttributeInfo r1 = r1.copy(r2, r3)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r0.addAttribute(r1)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
        L8e:
            r0 = r9
            r1 = r15
            javassist.CtClass[] r0 = javassist.bytecode.Descriptor.getParameterTypes(r0, r1)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r18 = r0
            r0 = 0
            r19 = r0
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r1 = r0
            r2 = r14
            r1.<init>(r2)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r20 = r0
            r0 = 0
            r21 = r0
        La7:
            r0 = r21
            r1 = r18
            int r1 = r1.length     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            if (r0 >= r1) goto Lc6
            r0 = r19
            r1 = r20
            r2 = r19
            r3 = r18
            r4 = r21
            r3 = r3[r4]     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            int r1 = r1.addLoad(r2, r3)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            int r0 = r0 + r1
            r19 = r0
            int r21 = r21 + 1
            goto La7
        Lc6:
            r0 = r20
            r1 = r19
            r0.setMaxLocals(r1)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r0 = r8
            r1 = r9
            if (r0 != r1) goto Le0
            r0 = r20
            r1 = r6
            javassist.CtClass r1 = r1.clazz     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r2 = r7
            r3 = r8
            r0.addInvokestatic(r1, r2, r3)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            goto Leb
        Le0:
            r0 = r20
            r1 = r6
            javassist.CtClass r1 = r1.clazz     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r2 = r7
            r3 = r8
            r0.addInvokevirtual(r1, r2, r3)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
        Leb:
            r0 = r20
            r1 = r8
            r2 = r15
            javassist.CtClass r1 = javassist.bytecode.Descriptor.getReturnType(r1, r2)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r0.addReturn(r1)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r0 = r16
            r1 = r20
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r0.setCodeAttribute(r1)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            r0 = r13
            r1 = r16
            r0.addMethod(r1)     // Catch: javassist.CannotCompileException -> L10a javassist.NotFoundException -> L116
            goto L122
        L10a:
            r14 = move-exception
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            throw r0
        L116:
            r14 = move-exception
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            throw r0
        L122:
            r0 = r6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.accessors
            r1 = r11
            r2 = r12
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r12
            return r0
    }

    public javassist.bytecode.MethodInfo getFieldGetter(javassist.bytecode.FieldInfo r7, boolean r8) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            java.lang.String r0 = r0.getName()
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":getter"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10 = r0
            r0 = r6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.accessors
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L32
            r0 = r11
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0
            return r0
        L32:
            r0 = r6
            javassist.CtClass r0 = r0.clazz
            javassist.bytecode.ClassFile r0 = r0.getClassFile()
            r12 = r0
            r0 = r6
            r1 = r12
            java.lang.String r0 = r0.findAccessorName(r1)
            r13 = r0
            r0 = r12
            javassist.bytecode.ConstPool r0 = r0.getConstPool()     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r14 = r0
            r0 = r6
            javassist.CtClass r0 = r0.clazz     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            javassist.ClassPool r0 = r0.getClassPool()     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r15 = r0
            r0 = r7
            java.lang.String r0 = r0.getDescriptor()     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r16 = r0
            r0 = r8
            if (r0 == 0) goto L76
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r1 = r0
            r1.<init>()     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            java.lang.String r1 = "()"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r1 = r16
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            java.lang.String r0 = r0.toString()     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r17 = r0
            goto L9b
        L76:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r1 = r0
            r1.<init>()     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r1 = r6
            javassist.CtClass r1 = r1.clazz     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            java.lang.String r1 = javassist.bytecode.Descriptor.of(r1)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r1 = r16
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            java.lang.String r0 = r0.toString()     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r17 = r0
        L9b:
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r1 = r0
            r2 = r14
            r3 = r13
            r4 = r17
            r1.<init>(r2, r3, r4)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r18 = r0
            r0 = r18
            r1 = 8
            r0.setAccessFlags(r1)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r0 = r18
            javassist.bytecode.SyntheticAttribute r1 = new javassist.bytecode.SyntheticAttribute     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r2 = r1
            r3 = r14
            r2.<init>(r3)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r0.addAttribute(r1)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r1 = r0
            r2 = r14
            r1.<init>(r2)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r19 = r0
            r0 = r8
            if (r0 == 0) goto Ldc
            r0 = r19
            javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r2 = r9
            r3 = r16
            r0.addGetstatic(r1, r2, r3)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            goto Lf3
        Ldc:
            r0 = r19
            r1 = 0
            r0.addAload(r1)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r0 = r19
            javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r2 = r9
            r3 = r16
            r0.addGetfield(r1, r2, r3)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r0 = r19
            r1 = 1
            r0.setMaxLocals(r1)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
        Lf3:
            r0 = r19
            r1 = r16
            r2 = r15
            javassist.CtClass r1 = javassist.bytecode.Descriptor.toCtClass(r1, r2)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r0.addReturn(r1)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r0 = r18
            r1 = r19
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r0.setCodeAttribute(r1)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r0 = r12
            r1 = r18
            r0.addMethod(r1)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r0 = r6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.accessors     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r1 = r10
            r2 = r18
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: javassist.CannotCompileException -> L121 javassist.NotFoundException -> L12d
            r0 = r18
            return r0
        L121:
            r14 = move-exception
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            throw r0
        L12d:
            r14 = move-exception
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            throw r0
    }

    public javassist.bytecode.MethodInfo getFieldSetter(javassist.bytecode.FieldInfo r7, boolean r8) throws javassist.compiler.CompileError {
            r6 = this;
            r0 = r7
            java.lang.String r0 = r0.getName()
            r9 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":setter"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10 = r0
            r0 = r6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.accessors
            r1 = r10
            java.lang.Object r0 = r0.get(r1)
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L32
            r0 = r11
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0
            return r0
        L32:
            r0 = r6
            javassist.CtClass r0 = r0.clazz
            javassist.bytecode.ClassFile r0 = r0.getClassFile()
            r12 = r0
            r0 = r6
            r1 = r12
            java.lang.String r0 = r0.findAccessorName(r1)
            r13 = r0
            r0 = r12
            javassist.bytecode.ConstPool r0 = r0.getConstPool()     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r14 = r0
            r0 = r6
            javassist.CtClass r0 = r0.clazz     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            javassist.ClassPool r0 = r0.getClassPool()     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r15 = r0
            r0 = r7
            java.lang.String r0 = r0.getDescriptor()     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r16 = r0
            r0 = r8
            if (r0 == 0) goto L7b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r1 = r0
            r1.<init>()     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r1 = r16
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            java.lang.String r1 = ")V"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            java.lang.String r0 = r0.toString()     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r17 = r0
            goto La0
        L7b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r1 = r0
            r1.<init>()     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r1 = r6
            javassist.CtClass r1 = r1.clazz     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            java.lang.String r1 = javassist.bytecode.Descriptor.of(r1)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r1 = r16
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            java.lang.String r1 = ")V"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            java.lang.String r0 = r0.toString()     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r17 = r0
        La0:
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r1 = r0
            r2 = r14
            r3 = r13
            r4 = r17
            r1.<init>(r2, r3, r4)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r18 = r0
            r0 = r18
            r1 = 8
            r0.setAccessFlags(r1)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r0 = r18
            javassist.bytecode.SyntheticAttribute r1 = new javassist.bytecode.SyntheticAttribute     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r2 = r1
            r3 = r14
            r2.<init>(r3)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r0.addAttribute(r1)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r1 = r0
            r2 = r14
            r1.<init>(r2)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r19 = r0
            r0 = r8
            if (r0 == 0) goto Lf0
            r0 = r19
            r1 = 0
            r2 = r16
            r3 = r15
            javassist.CtClass r2 = javassist.bytecode.Descriptor.toCtClass(r2, r3)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            int r0 = r0.addLoad(r1, r2)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r20 = r0
            r0 = r19
            javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r2 = r9
            r3 = r16
            r0.addPutstatic(r1, r2, r3)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            goto L112
        Lf0:
            r0 = r19
            r1 = 0
            r0.addAload(r1)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r0 = r19
            r1 = 1
            r2 = r16
            r3 = r15
            javassist.CtClass r2 = javassist.bytecode.Descriptor.toCtClass(r2, r3)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            int r0 = r0.addLoad(r1, r2)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r1 = 1
            int r0 = r0 + r1
            r20 = r0
            r0 = r19
            javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r2 = r9
            r3 = r16
            r0.addPutfield(r1, r2, r3)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
        L112:
            r0 = r19
            r1 = 0
            r0.addReturn(r1)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r0 = r19
            r1 = r20
            r0.setMaxLocals(r1)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r0 = r18
            r1 = r19
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r0.setCodeAttribute(r1)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r0 = r12
            r1 = r18
            r0.addMethod(r1)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r0 = r6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.accessors     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r1 = r10
            r2 = r18
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: javassist.CannotCompileException -> L141 javassist.NotFoundException -> L14d
            r0 = r18
            return r0
        L141:
            r14 = move-exception
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            throw r0
        L14d:
            r14 = move-exception
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            throw r0
    }

    private java.lang.String findAccessorName(javassist.bytecode.ClassFile r7) {
            r6 = this;
        L0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "access$"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            r2 = r1
            int r2 = r2.uniqueNumber
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.uniqueNumber = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8 = r0
            r0 = r7
            r1 = r8
            javassist.bytecode.MethodInfo r0 = r0.getMethod(r1)
            if (r0 != 0) goto L0
            r0 = r8
            return r0
    }
}
