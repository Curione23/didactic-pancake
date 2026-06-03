package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtMethod.class */
public final class CtMethod extends javassist.CtBehavior {
    protected java.lang.String cachedStringRep;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtMethod$ConstParameter.class */
    public static class ConstParameter {
        public static javassist.CtMethod.ConstParameter integer(int r4) {
                javassist.CtMethod$IntConstParameter r0 = new javassist.CtMethod$IntConstParameter
                r1 = r0
                r2 = r4
                r1.<init>(r2)
                return r0
        }

        public static javassist.CtMethod.ConstParameter integer(long r5) {
                javassist.CtMethod$LongConstParameter r0 = new javassist.CtMethod$LongConstParameter
                r1 = r0
                r2 = r5
                r1.<init>(r2)
                return r0
        }

        public static javassist.CtMethod.ConstParameter string(java.lang.String r4) {
                javassist.CtMethod$StringConstParameter r0 = new javassist.CtMethod$StringConstParameter
                r1 = r0
                r2 = r4
                r1.<init>(r2)
                return r0
        }

        ConstParameter() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        int compile(javassist.bytecode.Bytecode r3) throws javassist.CannotCompileException {
                r2 = this;
                r0 = 0
                return r0
        }

        java.lang.String descriptor() {
                r2 = this;
                java.lang.String r0 = defaultDescriptor()
                return r0
        }

        static java.lang.String defaultDescriptor() {
                java.lang.String r0 = "([Ljava/lang/Object;)Ljava/lang/Object;"
                return r0
        }

        java.lang.String constDescriptor() {
                r2 = this;
                java.lang.String r0 = defaultConstDescriptor()
                return r0
        }

        static java.lang.String defaultConstDescriptor() {
                java.lang.String r0 = "([Ljava/lang/Object;)V"
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtMethod$IntConstParameter.class */
    static class IntConstParameter extends javassist.CtMethod.ConstParameter {
        int param;

        IntConstParameter(int r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.param = r1
                return
        }

        @Override // javassist.CtMethod.ConstParameter
        int compile(javassist.bytecode.Bytecode r4) throws javassist.CannotCompileException {
                r3 = this;
                r0 = r4
                r1 = r3
                int r1 = r1.param
                r0.addIconst(r1)
                r0 = 1
                return r0
        }

        @Override // javassist.CtMethod.ConstParameter
        java.lang.String descriptor() {
                r2 = this;
                java.lang.String r0 = "([Ljava/lang/Object;I)Ljava/lang/Object;"
                return r0
        }

        @Override // javassist.CtMethod.ConstParameter
        java.lang.String constDescriptor() {
                r2 = this;
                java.lang.String r0 = "([Ljava/lang/Object;I)V"
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtMethod$LongConstParameter.class */
    static class LongConstParameter extends javassist.CtMethod.ConstParameter {
        long param;

        LongConstParameter(long r5) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.param = r1
                return
        }

        @Override // javassist.CtMethod.ConstParameter
        int compile(javassist.bytecode.Bytecode r5) throws javassist.CannotCompileException {
                r4 = this;
                r0 = r5
                r1 = r4
                long r1 = r1.param
                r0.addLconst(r1)
                r0 = 2
                return r0
        }

        @Override // javassist.CtMethod.ConstParameter
        java.lang.String descriptor() {
                r2 = this;
                java.lang.String r0 = "([Ljava/lang/Object;J)Ljava/lang/Object;"
                return r0
        }

        @Override // javassist.CtMethod.ConstParameter
        java.lang.String constDescriptor() {
                r2 = this;
                java.lang.String r0 = "([Ljava/lang/Object;J)V"
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtMethod$StringConstParameter.class */
    static class StringConstParameter extends javassist.CtMethod.ConstParameter {
        java.lang.String param;

        StringConstParameter(java.lang.String r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.param = r1
                return
        }

        @Override // javassist.CtMethod.ConstParameter
        int compile(javassist.bytecode.Bytecode r4) throws javassist.CannotCompileException {
                r3 = this;
                r0 = r4
                r1 = r3
                java.lang.String r1 = r1.param
                r0.addLdc(r1)
                r0 = 1
                return r0
        }

        @Override // javassist.CtMethod.ConstParameter
        java.lang.String descriptor() {
                r2 = this;
                java.lang.String r0 = "([Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;"
                return r0
        }

        @Override // javassist.CtMethod.ConstParameter
        java.lang.String constDescriptor() {
                r2 = this;
                java.lang.String r0 = "([Ljava/lang/Object;Ljava/lang/String;)V"
                return r0
        }
    }

    CtMethod(javassist.bytecode.MethodInfo r5, javassist.CtClass r6) {
            r4 = this;
            r0 = r4
            r1 = r6
            r2 = r5
            r0.<init>(r1, r2)
            r0 = r4
            r1 = 0
            r0.cachedStringRep = r1
            return
    }

    public CtMethod(javassist.CtClass r8, java.lang.String r9, javassist.CtClass[] r10, javassist.CtClass r11) {
            r7 = this;
            r0 = r7
            r1 = 0
            r2 = r11
            r0.<init>(r1, r2)
            r0 = r11
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r12 = r0
            r0 = r8
            r1 = r10
            java.lang.String r0 = javassist.bytecode.Descriptor.ofMethod(r0, r1)
            r13 = r0
            r0 = r7
            javassist.bytecode.MethodInfo r1 = new javassist.bytecode.MethodInfo
            r2 = r1
            r3 = r12
            r4 = r9
            r5 = r13
            r2.<init>(r3, r4, r5)
            r0.methodInfo = r1
            r0 = r7
            r1 = 1025(0x401, float:1.436E-42)
            r0.setModifiers(r1)
            return
    }

    public CtMethod(javassist.CtMethod r6, javassist.CtClass r7, javassist.ClassMap r8) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            r1 = 0
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = r8
            r0.copy(r1, r2, r3)
            return
    }

    public static javassist.CtMethod make(java.lang.String r3, javassist.CtClass r4) throws javassist.CannotCompileException {
            r0 = r3
            r1 = r4
            javassist.CtMethod r0 = javassist.CtNewMethod.make(r0, r1)
            return r0
    }

    public static javassist.CtMethod make(javassist.bytecode.MethodInfo r5, javassist.CtClass r6) throws javassist.CannotCompileException {
            r0 = r6
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r5
            javassist.bytecode.ConstPool r1 = r1.getConstPool()
            if (r0 == r1) goto L18
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "bad declaring class"
            r1.<init>(r2)
            throw r0
        L18:
            javassist.CtMethod r0 = new javassist.CtMethod
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public int hashCode() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.getStringRep()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // javassist.CtMember
    void nameReplaced() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.cachedStringRep = r1
            return
    }

    final java.lang.String getStringRep() {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.cachedStringRep
            if (r0 != 0) goto L2c
            r0 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r4
            javassist.bytecode.MethodInfo r2 = r2.methodInfo
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r4
            javassist.bytecode.MethodInfo r2 = r2.methodInfo
            java.lang.String r2 = r2.getDescriptor()
            java.lang.String r2 = javassist.bytecode.Descriptor.getParamDescriptor(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.cachedStringRep = r1
        L2c:
            r0 = r4
            java.lang.String r0 = r0.cachedStringRep
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            if (r0 == 0) goto L20
            r0 = r4
            boolean r0 = r0 instanceof javassist.CtMethod
            if (r0 == 0) goto L20
            r0 = r4
            javassist.CtMethod r0 = (javassist.CtMethod) r0
            java.lang.String r0 = r0.getStringRep()
            r1 = r3
            java.lang.String r1 = r1.getStringRep()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    @Override // javassist.CtBehavior
    public java.lang.String getLongName() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            javassist.CtClass r1 = r1.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.getSignature()
            java.lang.String r1 = javassist.bytecode.Descriptor.toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // javassist.CtMember
    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            java.lang.String r0 = r0.getName()
            return r0
    }

    public void setName(java.lang.String r4) {
            r3 = this;
            r0 = r3
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r3
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            r1 = r4
            r0.setName(r1)
            return
    }

    public javassist.CtClass getReturnType() throws javassist.NotFoundException {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.getReturnType0()
            return r0
    }

    @Override // javassist.CtBehavior
    public boolean isEmpty() {
            r3 = this;
            r0 = r3
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L1d
            r0 = r3
            int r0 = r0.getModifiers()
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
        L1d:
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r5 = r0
            r0 = r5
            boolean r0 = r0.hasNext()     // Catch: javassist.bytecode.BadBytecode -> L44
            if (r0 == 0) goto L42
            r0 = r5
            r1 = r5
            int r1 = r1.next()     // Catch: javassist.bytecode.BadBytecode -> L44
            int r0 = r0.byteAt(r1)     // Catch: javassist.bytecode.BadBytecode -> L44
            r1 = 177(0xb1, float:2.48E-43)
            if (r0 != r1) goto L42
            r0 = r5
            boolean r0 = r0.hasNext()     // Catch: javassist.bytecode.BadBytecode -> L44
            if (r0 != 0) goto L42
            r0 = 1
            goto L43
        L42:
            r0 = 0
        L43:
            return r0
        L44:
            r6 = move-exception
            r0 = 0
            return r0
    }

    public void setBody(javassist.CtMethod r7, javassist.ClassMap r8) throws javassist.CannotCompileException {
            r6 = this;
            r0 = r7
            javassist.CtClass r0 = r0.declaringClass
            r1 = r7
            javassist.bytecode.MethodInfo r1 = r1.methodInfo
            r2 = r6
            javassist.CtClass r2 = r2.declaringClass
            r3 = r6
            javassist.bytecode.MethodInfo r3 = r3.methodInfo
            r4 = r8
            setBody0(r0, r1, r2, r3, r4)
            return
    }

    public void setWrappedBody(javassist.CtMethod r8, javassist.CtMethod.ConstParameter r9) throws javassist.CannotCompileException {
            r7 = this;
            r0 = r7
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r7
            javassist.CtClass r0 = r0.getDeclaringClass()
            r10 = r0
            r0 = r7
            javassist.CtClass[] r0 = r0.getParameterTypes()     // Catch: javassist.NotFoundException -> L1b
            r11 = r0
            r0 = r7
            javassist.CtClass r0 = r0.getReturnType()     // Catch: javassist.NotFoundException -> L1b
            r12 = r0
            goto L27
        L1b:
            r13 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
        L27:
            r0 = r10
            r1 = r10
            javassist.bytecode.ClassFile r1 = r1.getClassFile2()
            r2 = r8
            r3 = r11
            r4 = r12
            r5 = r9
            javassist.bytecode.Bytecode r0 = javassist.CtNewWrappedMethod.makeBody(r0, r1, r2, r3, r4, r5)
            r13 = r0
            r0 = r13
            javassist.bytecode.CodeAttribute r0 = r0.toCodeAttribute()
            r14 = r0
            r0 = r7
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            r1 = r14
            r0.setCodeAttribute(r1)
            r0 = r7
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            r1 = r7
            javassist.bytecode.MethodInfo r1 = r1.methodInfo
            int r1 = r1.getAccessFlags()
            r2 = -1025(0xfffffffffffffbff, float:NaN)
            r1 = r1 & r2
            r0.setAccessFlags(r1)
            return
    }
}
