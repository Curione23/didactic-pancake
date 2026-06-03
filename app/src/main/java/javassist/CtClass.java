package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtClass.class */
public abstract class CtClass {
    protected java.lang.String qualifiedName;
    public static java.lang.String debugDump;
    public static final java.lang.String version = "3.29.2-GA";
    static final java.lang.String javaLangObject = "java.lang.Object";
    public static javassist.CtClass booleanType;
    public static javassist.CtClass charType;
    public static javassist.CtClass byteType;
    public static javassist.CtClass shortType;
    public static javassist.CtClass intType;
    public static javassist.CtClass longType;
    public static javassist.CtClass floatType;
    public static javassist.CtClass doubleType;
    public static javassist.CtClass voidType;
    static javassist.CtClass[] primitiveTypes;


    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtClass$DelayedFileOutputStream.class */
    static class DelayedFileOutputStream extends java.io.OutputStream {
        private java.io.FileOutputStream file;
        private java.lang.String filename;

        DelayedFileOutputStream(java.lang.String r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 0
                r0.file = r1
                r0 = r3
                r1 = r4
                r0.filename = r1
                return
        }

        private void init() throws java.io.IOException {
                r5 = this;
                r0 = r5
                java.io.FileOutputStream r0 = r0.file
                if (r0 != 0) goto L16
                r0 = r5
                java.io.FileOutputStream r1 = new java.io.FileOutputStream
                r2 = r1
                r3 = r5
                java.lang.String r3 = r3.filename
                r2.<init>(r3)
                r0.file = r1
            L16:
                return
        }

        @Override // java.io.OutputStream
        public void write(int r4) throws java.io.IOException {
                r3 = this;
                r0 = r3
                r0.init()
                r0 = r3
                java.io.FileOutputStream r0 = r0.file
                r1 = r4
                r0.write(r1)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r4) throws java.io.IOException {
                r3 = this;
                r0 = r3
                r0.init()
                r0 = r3
                java.io.FileOutputStream r0 = r0.file
                r1 = r4
                r0.write(r1)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r6, int r7, int r8) throws java.io.IOException {
                r5 = this;
                r0 = r5
                r0.init()
                r0 = r5
                java.io.FileOutputStream r0 = r0.file
                r1 = r6
                r2 = r7
                r3 = r8
                r0.write(r1, r2, r3)
                return
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws java.io.IOException {
                r2 = this;
                r0 = r2
                r0.init()
                r0 = r2
                java.io.FileOutputStream r0 = r0.file
                r0.flush()
                return
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r2 = this;
                r0 = r2
                r0.init()
                r0 = r2
                java.io.FileOutputStream r0 = r0.file
                r0.close()
                return
        }
    }

    public static void main(java.lang.String[] r3) {
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Javassist version 3.29.2-GA"
            r0.println(r1)
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Copyright (C) 1999-2022 Shigeru Chiba. All Rights Reserved."
            r0.println(r1)
            return
    }

    protected CtClass(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.qualifiedName = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r4
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.<init>(r2)
            r5 = r0
            r0 = r5
            r1 = 64
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r5
            r0.extendToString(r1)
            r0 = r5
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    protected void extendToString(java.lang.StringBuilder r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }

    public javassist.ClassPool getClassPool() {
            r2 = this;
            r0 = 0
            return r0
    }

    public javassist.bytecode.ClassFile getClassFile() {
            r2 = this;
            r0 = r2
            r0.checkModify()
            r0 = r2
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            return r0
    }

    public javassist.bytecode.ClassFile getClassFile2() {
            r2 = this;
            r0 = 0
            return r0
    }

    public javassist.compiler.AccessorMaker getAccessorMaker() {
            r2 = this;
            r0 = 0
            return r0
    }

    public java.net.URL getURL() throws javassist.NotFoundException {
            r4 = this;
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r4
            java.lang.String r2 = r2.getName()
            r1.<init>(r2)
            throw r0
    }

    public boolean isModified() {
            r2 = this;
            r0 = 0
            return r0
    }

    public boolean isFrozen() {
            r2 = this;
            r0 = 1
            return r0
    }

    public void freeze() {
            r1 = this;
            return
    }

    void checkModify() throws java.lang.RuntimeException {
            r5 = this;
            r0 = r5
            boolean r0 = r0.isFrozen()
            if (r0 == 0) goto L25
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " class is frozen"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L25:
            return
    }

    public void defrost() {
            r5 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "cannot defrost "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public boolean isPrimitive() {
            r2 = this;
            r0 = 0
            return r0
    }

    public boolean isArray() {
            r2 = this;
            r0 = 0
            return r0
    }

    public boolean isKotlin() {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "kotlin.Metadata"
            boolean r0 = r0.hasAnnotation(r1)
            return r0
    }

    public javassist.CtClass getComponentType() throws javassist.NotFoundException {
            r2 = this;
            r0 = 0
            return r0
    }

    public boolean subtypeOf(javassist.CtClass r4) throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            r1 = r4
            if (r0 == r1) goto L13
            r0 = r3
            java.lang.String r0 = r0.getName()
            r1 = r4
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17
        L13:
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            return r0
    }

    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.qualifiedName
            return r0
    }

    public final java.lang.String getSimpleName() {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.qualifiedName
            r5 = r0
            r0 = r5
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r6 = r0
            r0 = r6
            if (r0 >= 0) goto L12
            r0 = r5
            return r0
        L12:
            r0 = r5
            r1 = r6
            r2 = 1
            int r1 = r1 + r2
            java.lang.String r0 = r0.substring(r1)
            return r0
    }

    public final java.lang.String getPackageName() {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.qualifiedName
            r5 = r0
            r0 = r5
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r6 = r0
            r0 = r6
            if (r0 >= 0) goto L12
            r0 = 0
            return r0
        L12:
            r0 = r5
            r1 = 0
            r2 = r6
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }

    public void setName(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r0.checkModify()
            r0 = r4
            if (r0 == 0) goto Ld
            r0 = r3
            r1 = r4
            r0.qualifiedName = r1
        Ld:
            return
    }

    public java.lang.String getGenericSignature() {
            r2 = this;
            r0 = 0
            return r0
    }

    public void setGenericSignature(java.lang.String r3) {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public void replaceClassName(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public void replaceClassName(javassist.ClassMap r3) {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public synchronized java.util.Collection<java.lang.String> getRefClasses() {
            r4 = this;
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L1c
            javassist.CtClass$1 r0 = new javassist.CtClass$1
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r6 = r0
            r0 = r5
            r1 = r6
            r0.getRefClasses(r1)
            r0 = r6
            java.util.Collection r0 = r0.values()
            return r0
        L1c:
            r0 = 0
            return r0
    }

    public boolean isInterface() {
            r2 = this;
            r0 = 0
            return r0
    }

    public boolean isAnnotation() {
            r2 = this;
            r0 = 0
            return r0
    }

    public boolean isEnum() {
            r2 = this;
            r0 = 0
            return r0
    }

    public int getModifiers() {
            r2 = this;
            r0 = 0
            return r0
    }

    public boolean hasAnnotation(java.lang.Class<?> r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.hasAnnotation(r1)
            return r0
    }

    public boolean hasAnnotation(java.lang.String r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    public java.lang.Object getAnnotation(java.lang.Class<?> r3) throws java.lang.ClassNotFoundException {
            r2 = this;
            r0 = 0
            return r0
    }

    public java.lang.Object[] getAnnotations() throws java.lang.ClassNotFoundException {
            r2 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
    }

    public java.lang.Object[] getAvailableAnnotations() {
            r2 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
    }

    public javassist.CtClass[] getDeclaredClasses() throws javassist.NotFoundException {
            r2 = this;
            r0 = r2
            javassist.CtClass[] r0 = r0.getNestedClasses()
            return r0
    }

    public javassist.CtClass[] getNestedClasses() throws javassist.NotFoundException {
            r2 = this;
            r0 = 0
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            return r0
    }

    public void setModifiers(int r3) {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public boolean subclassOf(javassist.CtClass r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    public javassist.CtClass getSuperclass() throws javassist.NotFoundException {
            r2 = this;
            r0 = 0
            return r0
    }

    public void setSuperclass(javassist.CtClass r3) throws javassist.CannotCompileException {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public javassist.CtClass[] getInterfaces() throws javassist.NotFoundException {
            r2 = this;
            r0 = 0
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            return r0
    }

    public void setInterfaces(javassist.CtClass[] r3) {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public void addInterface(javassist.CtClass r3) {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public javassist.CtClass getDeclaringClass() throws javassist.NotFoundException {
            r2 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public final javassist.CtMethod getEnclosingMethod() throws javassist.NotFoundException {
            r5 = this;
            r0 = r5
            javassist.CtBehavior r0 = r0.getEnclosingBehavior()
            r6 = r0
            r0 = r6
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            r0 = r6
            boolean r0 = r0 instanceof javassist.CtMethod
            if (r0 == 0) goto L17
            r0 = r6
            javassist.CtMethod r0 = (javassist.CtMethod) r0
            return r0
        L17:
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r6
            java.lang.String r3 = r3.getLongName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " is enclosing "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public javassist.CtBehavior getEnclosingBehavior() throws javassist.NotFoundException {
            r2 = this;
            r0 = 0
            return r0
    }

    public javassist.CtClass makeNestedClass(java.lang.String r6, boolean r7) {
            r5 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " is not a class"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public javassist.CtField[] getFields() {
            r2 = this;
            r0 = 0
            javassist.CtField[] r0 = new javassist.CtField[r0]
            return r0
    }

    public javassist.CtField getField(java.lang.String r5) throws javassist.NotFoundException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            javassist.CtField r0 = r0.getField(r1, r2)
            return r0
    }

    public javassist.CtField getField(java.lang.String r5, java.lang.String r6) throws javassist.NotFoundException {
            r4 = this;
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }

    javassist.CtField getField2(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            return r0
    }

    public javassist.CtField[] getDeclaredFields() {
            r2 = this;
            r0 = 0
            javassist.CtField[] r0 = new javassist.CtField[r0]
            return r0
    }

    public javassist.CtField getDeclaredField(java.lang.String r5) throws javassist.NotFoundException {
            r4 = this;
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }

    public javassist.CtField getDeclaredField(java.lang.String r5, java.lang.String r6) throws javassist.NotFoundException {
            r4 = this;
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }

    public javassist.CtBehavior[] getDeclaredBehaviors() {
            r2 = this;
            r0 = 0
            javassist.CtBehavior[] r0 = new javassist.CtBehavior[r0]
            return r0
    }

    public javassist.CtConstructor[] getConstructors() {
            r2 = this;
            r0 = 0
            javassist.CtConstructor[] r0 = new javassist.CtConstructor[r0]
            return r0
    }

    public javassist.CtConstructor getConstructor(java.lang.String r5) throws javassist.NotFoundException {
            r4 = this;
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            java.lang.String r2 = "no such constructor"
            r1.<init>(r2)
            throw r0
    }

    public javassist.CtConstructor[] getDeclaredConstructors() {
            r2 = this;
            r0 = 0
            javassist.CtConstructor[] r0 = new javassist.CtConstructor[r0]
            return r0
    }

    public javassist.CtConstructor getDeclaredConstructor(javassist.CtClass[] r4) throws javassist.NotFoundException {
            r3 = this;
            r0 = r4
            java.lang.String r0 = javassist.bytecode.Descriptor.ofConstructor(r0)
            r5 = r0
            r0 = r3
            r1 = r5
            javassist.CtConstructor r0 = r0.getConstructor(r1)
            return r0
    }

    public javassist.CtConstructor getClassInitializer() {
            r2 = this;
            r0 = 0
            return r0
    }

    public javassist.CtMethod[] getMethods() {
            r2 = this;
            r0 = 0
            javassist.CtMethod[] r0 = new javassist.CtMethod[r0]
            return r0
    }

    public javassist.CtMethod getMethod(java.lang.String r5, java.lang.String r6) throws javassist.NotFoundException {
            r4 = this;
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }

    public javassist.CtMethod[] getDeclaredMethods() {
            r2 = this;
            r0 = 0
            javassist.CtMethod[] r0 = new javassist.CtMethod[r0]
            return r0
    }

    public javassist.CtMethod getDeclaredMethod(java.lang.String r5, javassist.CtClass[] r6) throws javassist.NotFoundException {
            r4 = this;
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }

    public javassist.CtMethod[] getDeclaredMethods(java.lang.String r5) throws javassist.NotFoundException {
            r4 = this;
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }

    public javassist.CtMethod getDeclaredMethod(java.lang.String r5) throws javassist.NotFoundException {
            r4 = this;
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
    }

    public javassist.CtConstructor makeClassInitializer() throws javassist.CannotCompileException {
            r4 = this;
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "not a class"
            r1.<init>(r2)
            throw r0
    }

    public void addConstructor(javassist.CtConstructor r3) throws javassist.CannotCompileException {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public void removeConstructor(javassist.CtConstructor r3) throws javassist.NotFoundException {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public void addMethod(javassist.CtMethod r3) throws javassist.CannotCompileException {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public void removeMethod(javassist.CtMethod r3) throws javassist.NotFoundException {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public void addField(javassist.CtField r5) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            javassist.CtField$Initializer r2 = (javassist.CtField.Initializer) r2
            r0.addField(r1, r2)
            return
    }

    public void addField(javassist.CtField r3, java.lang.String r4) throws javassist.CannotCompileException {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public void addField(javassist.CtField r3, javassist.CtField.Initializer r4) throws javassist.CannotCompileException {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public void removeField(javassist.CtField r3) throws javassist.NotFoundException {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public byte[] getAttribute(java.lang.String r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    public void setAttribute(java.lang.String r3, byte[] r4) {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public void instrument(javassist.CodeConverter r3) throws javassist.CannotCompileException {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public void instrument(javassist.expr.ExprEditor r3) throws javassist.CannotCompileException {
            r2 = this;
            r0 = r2
            r0.checkModify()
            return
    }

    public java.lang.Class<?> toClass() throws javassist.CannotCompileException {
            r3 = this;
            r0 = r3
            javassist.ClassPool r0 = r0.getClassPool()
            r1 = r3
            java.lang.Class r0 = r0.toClass(r1)
            return r0
    }

    public java.lang.Class<?> toClass(java.lang.Class<?> r5) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            javassist.ClassPool r0 = r0.getClassPool()
            r1 = r4
            r2 = r5
            java.lang.Class r0 = r0.toClass(r1, r2)
            return r0
    }

    public java.lang.Class<?> toClass(java.lang.invoke.MethodHandles.Lookup r5) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            javassist.ClassPool r0 = r0.getClassPool()
            r1 = r4
            r2 = r5
            java.lang.Class r0 = r0.toClass(r1, r2)
            return r0
    }

    public java.lang.Class<?> toClass(java.lang.ClassLoader r7, java.security.ProtectionDomain r8) throws javassist.CannotCompileException {
            r6 = this;
            r0 = r6
            javassist.ClassPool r0 = r0.getClassPool()
            r9 = r0
            r0 = r7
            if (r0 != 0) goto Le
            r0 = r9
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r7 = r0
        Le:
            r0 = r9
            r1 = r6
            r2 = 0
            r3 = r7
            r4 = r8
            java.lang.Class r0 = r0.toClass(r1, r2, r3, r4)
            return r0
    }

    @java.lang.Deprecated
    public final java.lang.Class<?> toClass(java.lang.ClassLoader r7) throws javassist.CannotCompileException {
            r6 = this;
            r0 = r6
            javassist.ClassPool r0 = r0.getClassPool()
            r1 = r6
            r2 = 0
            r3 = r7
            r4 = 0
            java.lang.Class r0 = r0.toClass(r1, r2, r3, r4)
            return r0
    }

    public void detach() {
            r5 = this;
            r0 = r5
            javassist.ClassPool r0 = r0.getClassPool()
            r6 = r0
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.getName()
            javassist.CtClass r0 = r0.removeCached(r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L21
            r0 = r7
            r1 = r5
            if (r0 == r1) goto L21
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.getName()
            r2 = r7
            r3 = 0
            r0.cacheCtClass(r1, r2, r3)
        L21:
            return
    }

    public boolean stopPruning(boolean r3) {
            r2 = this;
            r0 = 1
            return r0
    }

    public void prune() {
            r1 = this;
            return
    }

    void incGetCounter() {
            r1 = this;
            return
    }

    public void rebuildClassFile() {
            r1 = this;
            return
    }

    public byte[] toBytecode() throws java.io.IOException, javassist.CannotCompileException {
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = r0
            r1.<init>()
            r5 = r0
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r4
            r1 = r6
            r0.toBytecode(r1)     // Catch: java.lang.Throwable -> L1d
            r0 = r6
            r0.close()
            goto L24
        L1d:
            r7 = move-exception
            r0 = r6
            r0.close()
            r0 = r7
            throw r0
        L24:
            r0 = r5
            byte[] r0 = r0.toByteArray()
            return r0
    }

    public void writeFile() throws javassist.NotFoundException, java.io.IOException, javassist.CannotCompileException {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "."
            r0.writeFile(r1)
            return
    }

    public void writeFile(java.lang.String r4) throws javassist.CannotCompileException, java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r4
            java.io.DataOutputStream r0 = r0.makeFileOutput(r1)
            r5 = r0
            r0 = r3
            r1 = r5
            r0.toBytecode(r1)     // Catch: java.lang.Throwable -> L12
            r0 = r5
            r0.close()
            goto L19
        L12:
            r6 = move-exception
            r0 = r5
            r0.close()
            r0 = r6
            throw r0
        L19:
            return
    }

    protected java.io.DataOutputStream makeFileOutput(java.lang.String r9) {
            r8 = this;
            r0 = r8
            java.lang.String r0 = r0.getName()
            r10 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            char r1 = java.io.File.separatorChar
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            r2 = 46
            char r3 = java.io.File.separatorChar
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".class"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11 = r0
            r0 = r11
            char r1 = java.io.File.separatorChar
            int r0 = r0.lastIndexOf(r1)
            r12 = r0
            r0 = r12
            if (r0 <= 0) goto L59
            r0 = r11
            r1 = 0
            r2 = r12
            java.lang.String r0 = r0.substring(r1, r2)
            r13 = r0
            r0 = r13
            java.lang.String r1 = "."
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            boolean r0 = r0.mkdirs()
        L59:
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r1 = r0
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            r3 = r2
            javassist.CtClass$DelayedFileOutputStream r4 = new javassist.CtClass$DelayedFileOutputStream
            r5 = r4
            r6 = r11
            r5.<init>(r6)
            r3.<init>(r4)
            r1.<init>(r2)
            return r0
    }

    public void debugWriteFile() {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "."
            r0.debugWriteFile(r1)
            return
    }

    public void debugWriteFile(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = 1
            boolean r0 = r0.stopPruning(r1)     // Catch: java.lang.Exception -> L18
            r6 = r0
            r0 = r4
            r1 = r5
            r0.writeFile(r1)     // Catch: java.lang.Exception -> L18
            r0 = r4
            r0.defrost()     // Catch: java.lang.Exception -> L18
            r0 = r4
            r1 = r6
            boolean r0 = r0.stopPruning(r1)     // Catch: java.lang.Exception -> L18
            goto L22
        L18:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L22:
            return
    }

    public void toBytecode(java.io.DataOutputStream r5) throws javassist.CannotCompileException, java.io.IOException {
            r4 = this;
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "not a class"
            r1.<init>(r2)
            throw r0
    }

    public java.lang.String makeUniqueName(java.lang.String r6) {
            r5 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "not available in "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    void compress() {
            r1 = this;
            return
    }

    static {
            r0 = 0
            javassist.CtClass.debugDump = r0
            r0 = 9
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            javassist.CtClass.primitiveTypes = r0
            javassist.CtPrimitiveType r0 = new javassist.CtPrimitiveType
            r1 = r0
            java.lang.String r2 = "boolean"
            r3 = 90
            java.lang.String r4 = "java.lang.Boolean"
            java.lang.String r5 = "booleanValue"
            java.lang.String r6 = "()Z"
            r7 = 172(0xac, float:2.41E-43)
            r8 = 4
            r9 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            javassist.CtClass.booleanType = r0
            javassist.CtClass[] r0 = javassist.CtClass.primitiveTypes
            r1 = 0
            javassist.CtClass r2 = javassist.CtClass.booleanType
            r0[r1] = r2
            javassist.CtPrimitiveType r0 = new javassist.CtPrimitiveType
            r1 = r0
            java.lang.String r2 = "char"
            r3 = 67
            java.lang.String r4 = "java.lang.Character"
            java.lang.String r5 = "charValue"
            java.lang.String r6 = "()C"
            r7 = 172(0xac, float:2.41E-43)
            r8 = 5
            r9 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            javassist.CtClass.charType = r0
            javassist.CtClass[] r0 = javassist.CtClass.primitiveTypes
            r1 = 1
            javassist.CtClass r2 = javassist.CtClass.charType
            r0[r1] = r2
            javassist.CtPrimitiveType r0 = new javassist.CtPrimitiveType
            r1 = r0
            java.lang.String r2 = "byte"
            r3 = 66
            java.lang.String r4 = "java.lang.Byte"
            java.lang.String r5 = "byteValue"
            java.lang.String r6 = "()B"
            r7 = 172(0xac, float:2.41E-43)
            r8 = 8
            r9 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            javassist.CtClass.byteType = r0
            javassist.CtClass[] r0 = javassist.CtClass.primitiveTypes
            r1 = 2
            javassist.CtClass r2 = javassist.CtClass.byteType
            r0[r1] = r2
            javassist.CtPrimitiveType r0 = new javassist.CtPrimitiveType
            r1 = r0
            java.lang.String r2 = "short"
            r3 = 83
            java.lang.String r4 = "java.lang.Short"
            java.lang.String r5 = "shortValue"
            java.lang.String r6 = "()S"
            r7 = 172(0xac, float:2.41E-43)
            r8 = 9
            r9 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            javassist.CtClass.shortType = r0
            javassist.CtClass[] r0 = javassist.CtClass.primitiveTypes
            r1 = 3
            javassist.CtClass r2 = javassist.CtClass.shortType
            r0[r1] = r2
            javassist.CtPrimitiveType r0 = new javassist.CtPrimitiveType
            r1 = r0
            java.lang.String r2 = "int"
            r3 = 73
            java.lang.String r4 = "java.lang.Integer"
            java.lang.String r5 = "intValue"
            java.lang.String r6 = "()I"
            r7 = 172(0xac, float:2.41E-43)
            r8 = 10
            r9 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            javassist.CtClass.intType = r0
            javassist.CtClass[] r0 = javassist.CtClass.primitiveTypes
            r1 = 4
            javassist.CtClass r2 = javassist.CtClass.intType
            r0[r1] = r2
            javassist.CtPrimitiveType r0 = new javassist.CtPrimitiveType
            r1 = r0
            java.lang.String r2 = "long"
            r3 = 74
            java.lang.String r4 = "java.lang.Long"
            java.lang.String r5 = "longValue"
            java.lang.String r6 = "()J"
            r7 = 173(0xad, float:2.42E-43)
            r8 = 11
            r9 = 2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            javassist.CtClass.longType = r0
            javassist.CtClass[] r0 = javassist.CtClass.primitiveTypes
            r1 = 5
            javassist.CtClass r2 = javassist.CtClass.longType
            r0[r1] = r2
            javassist.CtPrimitiveType r0 = new javassist.CtPrimitiveType
            r1 = r0
            java.lang.String r2 = "float"
            r3 = 70
            java.lang.String r4 = "java.lang.Float"
            java.lang.String r5 = "floatValue"
            java.lang.String r6 = "()F"
            r7 = 174(0xae, float:2.44E-43)
            r8 = 6
            r9 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            javassist.CtClass.floatType = r0
            javassist.CtClass[] r0 = javassist.CtClass.primitiveTypes
            r1 = 6
            javassist.CtClass r2 = javassist.CtClass.floatType
            r0[r1] = r2
            javassist.CtPrimitiveType r0 = new javassist.CtPrimitiveType
            r1 = r0
            java.lang.String r2 = "double"
            r3 = 68
            java.lang.String r4 = "java.lang.Double"
            java.lang.String r5 = "doubleValue"
            java.lang.String r6 = "()D"
            r7 = 175(0xaf, float:2.45E-43)
            r8 = 7
            r9 = 2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            javassist.CtClass.doubleType = r0
            javassist.CtClass[] r0 = javassist.CtClass.primitiveTypes
            r1 = 7
            javassist.CtClass r2 = javassist.CtClass.doubleType
            r0[r1] = r2
            javassist.CtPrimitiveType r0 = new javassist.CtPrimitiveType
            r1 = r0
            java.lang.String r2 = "void"
            r3 = 86
            java.lang.String r4 = "java.lang.Void"
            r5 = 0
            r6 = 0
            r7 = 177(0xb1, float:2.48E-43)
            r8 = 0
            r9 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            javassist.CtClass.voidType = r0
            javassist.CtClass[] r0 = javassist.CtClass.primitiveTypes
            r1 = 8
            javassist.CtClass r2 = javassist.CtClass.voidType
            r0[r1] = r2
            return
    }
}
