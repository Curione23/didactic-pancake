package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtNewClass.class */
class CtNewClass extends javassist.CtClassType {
    protected boolean hasConstructor;

    CtNewClass(java.lang.String r8, javassist.ClassPool r9, boolean r10, javassist.CtClass r11) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2)
            r0 = r7
            r1 = 1
            r0.wasChanged = r1
            r0 = r10
            if (r0 != 0) goto L14
            r0 = r11
            if (r0 != 0) goto L1a
        L14:
            r0 = 0
            r12 = r0
            goto L21
        L1a:
            r0 = r11
            java.lang.String r0 = r0.getName()
            r12 = r0
        L21:
            r0 = r7
            javassist.bytecode.ClassFile r1 = new javassist.bytecode.ClassFile
            r2 = r1
            r3 = r10
            r4 = r8
            r5 = r12
            r2.<init>(r3, r4, r5)
            r0.classfile = r1
            r0 = r10
            if (r0 == 0) goto L4c
            r0 = r11
            if (r0 == 0) goto L4c
            r0 = r7
            javassist.bytecode.ClassFile r0 = r0.classfile
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            r4 = r11
            java.lang.String r4 = r4.getName()
            r2[r3] = r4
            r0.setInterfaces(r1)
        L4c:
            r0 = r7
            r1 = r7
            int r1 = r1.getModifiers()
            int r1 = javassist.Modifier.setPublic(r1)
            r0.setModifiers(r1)
            r0 = r7
            r1 = r10
            r0.hasConstructor = r1
            return
    }

    @Override // javassist.CtClassType, javassist.CtClass
    protected void extendToString(java.lang.StringBuilder r4) {
            r3 = this;
            r0 = r3
            boolean r0 = r0.hasConstructor
            if (r0 == 0) goto Le
            r0 = r4
            java.lang.String r1 = "hasConstructor "
            java.lang.StringBuilder r0 = r0.append(r1)
        Le:
            r0 = r3
            r1 = r4
            super.extendToString(r1)
            return
    }

    @Override // javassist.CtClassType, javassist.CtClass
    public void addConstructor(javassist.CtConstructor r4) throws javassist.CannotCompileException {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.hasConstructor = r1
            r0 = r3
            r1 = r4
            super.addConstructor(r1)
            return
    }

    @Override // javassist.CtClassType, javassist.CtClass
    public void toBytecode(java.io.DataOutputStream r5) throws javassist.CannotCompileException, java.io.IOException {
            r4 = this;
            r0 = r4
            boolean r0 = r0.hasConstructor
            if (r0 != 0) goto L1d
            r0 = r4
            r0.inheritAllConstructors()     // Catch: javassist.NotFoundException -> L13
            r0 = r4
            r1 = 1
            r0.hasConstructor = r1     // Catch: javassist.NotFoundException -> L13
            goto L1d
        L13:
            r6 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L1d:
            r0 = r4
            r1 = r5
            super.toBytecode(r1)
            return
    }

    public void inheritAllConstructors() throws javassist.CannotCompileException, javassist.NotFoundException {
            r5 = this;
            r0 = r5
            javassist.CtClass r0 = r0.getSuperclass()
            r6 = r0
            r0 = r6
            javassist.CtConstructor[] r0 = r0.getDeclaredConstructors()
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = 0
            r9 = r0
        Lf:
            r0 = r9
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L56
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            int r0 = r0.getModifiers()
            r11 = r0
            r0 = r5
            r1 = r11
            r2 = r6
            boolean r0 = r0.isInheritable(r1, r2)
            if (r0 == 0) goto L50
            r0 = r10
            javassist.CtClass[] r0 = r0.getParameterTypes()
            r1 = r10
            javassist.CtClass[] r1 = r1.getExceptionTypes()
            r2 = r5
            javassist.CtConstructor r0 = javassist.CtNewConstructor.make(r0, r1, r2)
            r12 = r0
            r0 = r12
            r1 = r11
            r2 = 7
            r1 = r1 & r2
            r0.setModifiers(r1)
            r0 = r5
            r1 = r12
            r0.addConstructor(r1)
            int r8 = r8 + 1
        L50:
            int r9 = r9 + 1
            goto Lf
        L56:
            r0 = r8
            r1 = 1
            if (r0 >= r1) goto L79
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "no inheritable constructor in "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L79:
            return
    }

    private boolean isInheritable(int r4, javassist.CtClass r5) {
            r3 = this;
            r0 = r4
            boolean r0 = javassist.Modifier.isPrivate(r0)
            if (r0 == 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r4
            boolean r0 = javassist.Modifier.isPackage(r0)
            if (r0 == 0) goto L31
            r0 = r3
            java.lang.String r0 = r0.getPackageName()
            r6 = r0
            r0 = r5
            java.lang.String r0 = r0.getPackageName()
            r7 = r0
            r0 = r6
            if (r0 != 0) goto L2a
            r0 = r7
            if (r0 != 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            return r0
        L2a:
            r0 = r6
            r1 = r7
            boolean r0 = r0.equals(r1)
            return r0
        L31:
            r0 = 1
            return r0
    }
}
