package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtArray.class */
final class CtArray extends javassist.CtClass {
    protected javassist.ClassPool pool;
    private javassist.CtClass[] interfaces;

    CtArray(java.lang.String r4, javassist.ClassPool r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = 0
            r0.interfaces = r1
            r0 = r3
            r1 = r5
            r0.pool = r1
            return
    }

    @Override // javassist.CtClass
    public javassist.ClassPool getClassPool() {
            r2 = this;
            r0 = r2
            javassist.ClassPool r0 = r0.pool
            return r0
    }

    @Override // javassist.CtClass
    public boolean isArray() {
            r2 = this;
            r0 = 1
            return r0
    }

    @Override // javassist.CtClass
    public int getModifiers() {
            r4 = this;
            r0 = 16
            r5 = r0
            r0 = r5
            r1 = r4
            javassist.CtClass r1 = r1.getComponentType()     // Catch: javassist.NotFoundException -> L13
            int r1 = r1.getModifiers()     // Catch: javassist.NotFoundException -> L13
            r2 = 7
            r1 = r1 & r2
            r0 = r0 | r1
            r5 = r0
            goto L14
        L13:
            r6 = move-exception
        L14:
            r0 = r5
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtClass[] getInterfaces() throws javassist.NotFoundException {
            r6 = this;
            r0 = r6
            javassist.CtClass[] r0 = r0.interfaces
            if (r0 != 0) goto L37
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class[] r0 = r0.getInterfaces()
            r7 = r0
            r0 = r6
            r1 = r7
            int r1 = r1.length
            javassist.CtClass[] r1 = new javassist.CtClass[r1]
            r0.interfaces = r1
            r0 = 0
            r8 = r0
        L18:
            r0 = r8
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L37
            r0 = r6
            javassist.CtClass[] r0 = r0.interfaces
            r1 = r8
            r2 = r6
            javassist.ClassPool r2 = r2.pool
            r3 = r7
            r4 = r8
            r3 = r3[r4]
            java.lang.String r3 = r3.getName()
            javassist.CtClass r2 = r2.get(r3)
            r0[r1] = r2
            int r8 = r8 + 1
            goto L18
        L37:
            r0 = r6
            javassist.CtClass[] r0 = r0.interfaces
            return r0
    }

    @Override // javassist.CtClass
    public boolean subtypeOf(javassist.CtClass r4) throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            r1 = r4
            boolean r0 = super.subtypeOf(r1)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = r4
            java.lang.String r0 = r0.getName()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "java.lang.Object"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            r0 = r3
            javassist.CtClass[] r0 = r0.getInterfaces()
            r6 = r0
            r0 = 0
            r7 = r0
        L22:
            r0 = r7
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L3c
            r0 = r6
            r1 = r7
            r0 = r0[r1]
            r1 = r4
            boolean r0 = r0.subtypeOf(r1)
            if (r0 == 0) goto L36
            r0 = 1
            return r0
        L36:
            int r7 = r7 + 1
            goto L22
        L3c:
            r0 = r4
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L55
            r0 = r3
            javassist.CtClass r0 = r0.getComponentType()
            r1 = r4
            javassist.CtClass r1 = r1.getComponentType()
            boolean r0 = r0.subtypeOf(r1)
            if (r0 == 0) goto L55
            r0 = 1
            goto L56
        L55:
            r0 = 0
        L56:
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtClass getComponentType() throws javassist.NotFoundException {
            r6 = this;
            r0 = r6
            java.lang.String r0 = r0.getName()
            r7 = r0
            r0 = r6
            javassist.ClassPool r0 = r0.pool
            r1 = r7
            r2 = 0
            r3 = r7
            int r3 = r3.length()
            r4 = 2
            int r3 = r3 - r4
            java.lang.String r1 = r1.substring(r2, r3)
            javassist.CtClass r0 = r0.get(r1)
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtClass getSuperclass() throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.ClassPool r0 = r0.pool
            java.lang.String r1 = "java.lang.Object"
            javassist.CtClass r0 = r0.get(r1)
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtMethod[] getMethods() {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.getSuperclass()     // Catch: javassist.NotFoundException -> L8
            javassist.CtMethod[] r0 = r0.getMethods()     // Catch: javassist.NotFoundException -> L8
            return r0
        L8:
            r3 = move-exception
            r0 = r2
            javassist.CtMethod[] r0 = super.getMethods()
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtMethod getMethod(java.lang.String r5, java.lang.String r6) throws javassist.NotFoundException {
            r4 = this;
            r0 = r4
            javassist.CtClass r0 = r0.getSuperclass()
            r1 = r5
            r2 = r6
            javassist.CtMethod r0 = r0.getMethod(r1, r2)
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtConstructor[] getConstructors() {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.getSuperclass()     // Catch: javassist.NotFoundException -> L8
            javassist.CtConstructor[] r0 = r0.getConstructors()     // Catch: javassist.NotFoundException -> L8
            return r0
        L8:
            r3 = move-exception
            r0 = r2
            javassist.CtConstructor[] r0 = super.getConstructors()
            return r0
    }
}
