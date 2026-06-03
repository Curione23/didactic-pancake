package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CodeConverter.class */
public class CodeConverter {
    protected javassist.convert.Transformer transformers;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CodeConverter$ArrayAccessReplacementMethodNames.class */
    public interface ArrayAccessReplacementMethodNames {
        java.lang.String byteOrBooleanRead();

        java.lang.String byteOrBooleanWrite();

        java.lang.String charRead();

        java.lang.String charWrite();

        java.lang.String doubleRead();

        java.lang.String doubleWrite();

        java.lang.String floatRead();

        java.lang.String floatWrite();

        java.lang.String intRead();

        java.lang.String intWrite();

        java.lang.String longRead();

        java.lang.String longWrite();

        java.lang.String objectRead();

        java.lang.String objectWrite();

        java.lang.String shortRead();

        java.lang.String shortWrite();
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CodeConverter$DefaultArrayAccessReplacementMethodNames.class */
    public static class DefaultArrayAccessReplacementMethodNames implements javassist.CodeConverter.ArrayAccessReplacementMethodNames {
        public DefaultArrayAccessReplacementMethodNames() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String byteOrBooleanRead() {
                r2 = this;
                java.lang.String r0 = "arrayReadByteOrBoolean"
                return r0
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String byteOrBooleanWrite() {
                r2 = this;
                java.lang.String r0 = "arrayWriteByteOrBoolean"
                return r0
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String charRead() {
                r2 = this;
                java.lang.String r0 = "arrayReadChar"
                return r0
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String charWrite() {
                r2 = this;
                java.lang.String r0 = "arrayWriteChar"
                return r0
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String doubleRead() {
                r2 = this;
                java.lang.String r0 = "arrayReadDouble"
                return r0
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String doubleWrite() {
                r2 = this;
                java.lang.String r0 = "arrayWriteDouble"
                return r0
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String floatRead() {
                r2 = this;
                java.lang.String r0 = "arrayReadFloat"
                return r0
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String floatWrite() {
                r2 = this;
                java.lang.String r0 = "arrayWriteFloat"
                return r0
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String intRead() {
                r2 = this;
                java.lang.String r0 = "arrayReadInt"
                return r0
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String intWrite() {
                r2 = this;
                java.lang.String r0 = "arrayWriteInt"
                return r0
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String longRead() {
                r2 = this;
                java.lang.String r0 = "arrayReadLong"
                return r0
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String longWrite() {
                r2 = this;
                java.lang.String r0 = "arrayWriteLong"
                return r0
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String objectRead() {
                r2 = this;
                java.lang.String r0 = "arrayReadObject"
                return r0
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String objectWrite() {
                r2 = this;
                java.lang.String r0 = "arrayWriteObject"
                return r0
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String shortRead() {
                r2 = this;
                java.lang.String r0 = "arrayReadShort"
                return r0
        }

        @Override // javassist.CodeConverter.ArrayAccessReplacementMethodNames
        public java.lang.String shortWrite() {
                r2 = this;
                java.lang.String r0 = "arrayWriteShort"
                return r0
        }
    }

    public CodeConverter() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.transformers = r1
            return
    }

    public void replaceNew(javassist.CtClass r9, javassist.CtClass r10, java.lang.String r11) {
            r8 = this;
            r0 = r8
            javassist.convert.TransformNew r1 = new javassist.convert.TransformNew
            r2 = r1
            r3 = r8
            javassist.convert.Transformer r3 = r3.transformers
            r4 = r9
            java.lang.String r4 = r4.getName()
            r5 = r10
            java.lang.String r5 = r5.getName()
            r6 = r11
            r2.<init>(r3, r4, r5, r6)
            r0.transformers = r1
            return
    }

    public void replaceNew(javassist.CtClass r8, javassist.CtClass r9) {
            r7 = this;
            r0 = r7
            javassist.convert.TransformNewClass r1 = new javassist.convert.TransformNewClass
            r2 = r1
            r3 = r7
            javassist.convert.Transformer r3 = r3.transformers
            r4 = r8
            java.lang.String r4 = r4.getName()
            r5 = r9
            java.lang.String r5 = r5.getName()
            r2.<init>(r3, r4, r5)
            r0.transformers = r1
            return
    }

    public void redirectFieldAccess(javassist.CtField r9, javassist.CtClass r10, java.lang.String r11) {
            r8 = this;
            r0 = r8
            javassist.convert.TransformFieldAccess r1 = new javassist.convert.TransformFieldAccess
            r2 = r1
            r3 = r8
            javassist.convert.Transformer r3 = r3.transformers
            r4 = r9
            r5 = r10
            java.lang.String r5 = r5.getName()
            r6 = r11
            r2.<init>(r3, r4, r5, r6)
            r0.transformers = r1
            return
    }

    public void replaceFieldRead(javassist.CtField r9, javassist.CtClass r10, java.lang.String r11) {
            r8 = this;
            r0 = r8
            javassist.convert.TransformReadField r1 = new javassist.convert.TransformReadField
            r2 = r1
            r3 = r8
            javassist.convert.Transformer r3 = r3.transformers
            r4 = r9
            r5 = r10
            java.lang.String r5 = r5.getName()
            r6 = r11
            r2.<init>(r3, r4, r5, r6)
            r0.transformers = r1
            return
    }

    public void replaceFieldWrite(javassist.CtField r9, javassist.CtClass r10, java.lang.String r11) {
            r8 = this;
            r0 = r8
            javassist.convert.TransformWriteField r1 = new javassist.convert.TransformWriteField
            r2 = r1
            r3 = r8
            javassist.convert.Transformer r3 = r3.transformers
            r4 = r9
            r5 = r10
            java.lang.String r5 = r5.getName()
            r6 = r11
            r2.<init>(r3, r4, r5, r6)
            r0.transformers = r1
            return
    }

    public void replaceArrayAccess(javassist.CtClass r8, javassist.CodeConverter.ArrayAccessReplacementMethodNames r9) throws javassist.NotFoundException {
            r7 = this;
            r0 = r7
            javassist.convert.TransformAccessArrayField r1 = new javassist.convert.TransformAccessArrayField
            r2 = r1
            r3 = r7
            javassist.convert.Transformer r3 = r3.transformers
            r4 = r8
            java.lang.String r4 = r4.getName()
            r5 = r9
            r2.<init>(r3, r4, r5)
            r0.transformers = r1
            return
    }

    public void redirectMethodCall(javassist.CtMethod r8, javassist.CtMethod r9) throws javassist.CannotCompileException {
            r7 = this;
            r0 = r8
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            java.lang.String r0 = r0.getDescriptor()
            r10 = r0
            r0 = r9
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            java.lang.String r0 = r0.getDescriptor()
            r11 = r0
            r0 = r10
            r1 = r11
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L38
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "signature mismatch: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.String r3 = r3.getLongName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L38:
            r0 = r8
            int r0 = r0.getModifiers()
            r12 = r0
            r0 = r9
            int r0 = r0.getModifiers()
            r13 = r0
            r0 = r12
            boolean r0 = javassist.Modifier.isStatic(r0)
            r1 = r13
            boolean r1 = javassist.Modifier.isStatic(r1)
            if (r0 != r1) goto L72
            r0 = r12
            boolean r0 = javassist.Modifier.isPrivate(r0)
            if (r0 == 0) goto L61
            r0 = r13
            boolean r0 = javassist.Modifier.isPrivate(r0)
            if (r0 == 0) goto L72
        L61:
            r0 = r8
            javassist.CtClass r0 = r0.getDeclaringClass()
            boolean r0 = r0.isInterface()
            r1 = r9
            javassist.CtClass r1 = r1.getDeclaringClass()
            boolean r1 = r1.isInterface()
            if (r0 == r1) goto L90
        L72:
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "invoke-type mismatch "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.String r3 = r3.getLongName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L90:
            r0 = r7
            javassist.convert.TransformCall r1 = new javassist.convert.TransformCall
            r2 = r1
            r3 = r7
            javassist.convert.Transformer r3 = r3.transformers
            r4 = r8
            r5 = r9
            r2.<init>(r3, r4, r5)
            r0.transformers = r1
            return
    }

    public void redirectMethodCall(java.lang.String r8, javassist.CtMethod r9) throws javassist.CannotCompileException {
            r7 = this;
            r0 = r7
            javassist.convert.TransformCall r1 = new javassist.convert.TransformCall
            r2 = r1
            r3 = r7
            javassist.convert.Transformer r3 = r3.transformers
            r4 = r8
            r5 = r9
            r2.<init>(r3, r4, r5)
            r0.transformers = r1
            return
    }

    public void redirectMethodCallToStatic(javassist.CtMethod r8, javassist.CtMethod r9) {
            r7 = this;
            r0 = r7
            javassist.convert.TransformCallToStatic r1 = new javassist.convert.TransformCallToStatic
            r2 = r1
            r3 = r7
            javassist.convert.Transformer r3 = r3.transformers
            r4 = r8
            r5 = r9
            r2.<init>(r3, r4, r5)
            r0.transformers = r1
            return
    }

    public void insertBeforeMethod(javassist.CtMethod r8, javassist.CtMethod r9) throws javassist.CannotCompileException {
            r7 = this;
            r0 = r7
            javassist.convert.TransformBefore r1 = new javassist.convert.TransformBefore     // Catch: javassist.NotFoundException -> L14
            r2 = r1
            r3 = r7
            javassist.convert.Transformer r3 = r3.transformers     // Catch: javassist.NotFoundException -> L14
            r4 = r8
            r5 = r9
            r2.<init>(r3, r4, r5)     // Catch: javassist.NotFoundException -> L14
            r0.transformers = r1     // Catch: javassist.NotFoundException -> L14
            goto L1e
        L14:
            r10 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            throw r0
        L1e:
            return
    }

    public void insertAfterMethod(javassist.CtMethod r8, javassist.CtMethod r9) throws javassist.CannotCompileException {
            r7 = this;
            r0 = r7
            javassist.convert.TransformAfter r1 = new javassist.convert.TransformAfter     // Catch: javassist.NotFoundException -> L14
            r2 = r1
            r3 = r7
            javassist.convert.Transformer r3 = r3.transformers     // Catch: javassist.NotFoundException -> L14
            r4 = r8
            r5 = r9
            r2.<init>(r3, r4, r5)     // Catch: javassist.NotFoundException -> L14
            r0.transformers = r1     // Catch: javassist.NotFoundException -> L14
            goto L1e
        L14:
            r10 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            throw r0
        L1e:
            return
    }

    protected void doit(javassist.CtClass r7, javassist.bytecode.MethodInfo r8, javassist.bytecode.ConstPool r9) throws javassist.CannotCompileException {
            r6 = this;
            r0 = r8
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L12
            r0 = r6
            javassist.convert.Transformer r0 = r0.transformers
            if (r0 != 0) goto L13
        L12:
            return
        L13:
            r0 = r6
            javassist.convert.Transformer r0 = r0.transformers
            r10 = r0
        L19:
            r0 = r10
            if (r0 == 0) goto L30
            r0 = r10
            r1 = r9
            r2 = r7
            r3 = r8
            r0.initialize(r1, r2, r3)
            r0 = r10
            javassist.convert.Transformer r0 = r0.getNext()
            r10 = r0
            goto L19
        L30:
            r0 = r11
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r12 = r0
        L37:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L77
            r0 = r12
            int r0 = r0.next()     // Catch: javassist.bytecode.BadBytecode -> L6b
            r13 = r0
            r0 = r6
            javassist.convert.Transformer r0 = r0.transformers     // Catch: javassist.bytecode.BadBytecode -> L6b
            r10 = r0
        L4c:
            r0 = r10
            if (r0 == 0) goto L68
            r0 = r10
            r1 = r7
            r2 = r13
            r3 = r12
            r4 = r9
            int r0 = r0.transform(r1, r2, r3, r4)     // Catch: javassist.bytecode.BadBytecode -> L6b
            r13 = r0
            r0 = r10
            javassist.convert.Transformer r0 = r0.getNext()     // Catch: javassist.bytecode.BadBytecode -> L6b
            r10 = r0
            goto L4c
        L68:
            goto L37
        L6b:
            r13 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
        L77:
            r0 = 0
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r6
            javassist.convert.Transformer r0 = r0.transformers
            r10 = r0
        L83:
            r0 = r10
            if (r0 == 0) goto Lb6
            r0 = r10
            int r0 = r0.extraLocals()
            r15 = r0
            r0 = r15
            r1 = r13
            if (r0 <= r1) goto L9a
            r0 = r15
            r13 = r0
        L9a:
            r0 = r10
            int r0 = r0.extraStack()
            r15 = r0
            r0 = r15
            r1 = r14
            if (r0 <= r1) goto Lac
            r0 = r15
            r14 = r0
        Lac:
            r0 = r10
            javassist.convert.Transformer r0 = r0.getNext()
            r10 = r0
            goto L83
        Lb6:
            r0 = r6
            javassist.convert.Transformer r0 = r0.transformers
            r10 = r0
        Lbc:
            r0 = r10
            if (r0 == 0) goto Ld0
            r0 = r10
            r0.clean()
            r0 = r10
            javassist.convert.Transformer r0 = r0.getNext()
            r10 = r0
            goto Lbc
        Ld0:
            r0 = r13
            if (r0 <= 0) goto Le2
            r0 = r11
            r1 = r11
            int r1 = r1.getMaxLocals()
            r2 = r13
            int r1 = r1 + r2
            r0.setMaxLocals(r1)
        Le2:
            r0 = r14
            if (r0 <= 0) goto Lf4
            r0 = r11
            r1 = r11
            int r1 = r1.getMaxStack()
            r2 = r14
            int r1 = r1 + r2
            r0.setMaxStack(r1)
        Lf4:
            r0 = r8
            r1 = r7
            javassist.ClassPool r1 = r1.getClassPool()     // Catch: javassist.bytecode.BadBytecode -> L103
            r2 = r7
            javassist.bytecode.ClassFile r2 = r2.getClassFile2()     // Catch: javassist.bytecode.BadBytecode -> L103
            r0.rebuildStackMapIf6(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L103
            goto L114
        L103:
            r15 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r15
            java.lang.String r2 = r2.getMessage()
            r3 = r15
            r1.<init>(r2, r3)
            throw r0
        L114:
            return
    }
}
