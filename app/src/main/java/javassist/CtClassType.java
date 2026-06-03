package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtClassType.class */
class CtClassType extends javassist.CtClass {
    javassist.ClassPool classPool;
    boolean wasChanged;
    private boolean wasFrozen;
    boolean wasPruned;
    boolean gcConstPool;
    javassist.bytecode.ClassFile classfile;
    byte[] rawClassfile;
    private java.lang.ref.Reference<javassist.CtMember.Cache> memberCache;
    private javassist.compiler.AccessorMaker accessors;
    private javassist.FieldInitLink fieldInitializers;
    private java.util.Map<javassist.CtMethod, java.lang.String> hiddenMethods;
    private int uniqueNumberSeed;
    private boolean doPruning;
    private int getCount;
    private static final int GET_THRESHOLD = 2;

    CtClassType(java.lang.String r8, javassist.ClassPool r9) {
            r7 = this;
            r0 = r7
            r1 = r8
            r0.<init>(r1)
            r0 = r7
            boolean r1 = javassist.ClassPool.doPruning
            r0.doPruning = r1
            r0 = r7
            r1 = r9
            r0.classPool = r1
            r0 = r7
            r1 = r7
            r2 = r7
            r3 = r7
            r4 = 0
            r5 = r4; r4 = r3; r3 = r5; 
            r4.gcConstPool = r5
            r4 = r3; r3 = r2; r2 = r4; 
            r3.wasPruned = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.wasFrozen = r3
            r0.wasChanged = r1
            r0 = r7
            r1 = 0
            r0.classfile = r1
            r0 = r7
            r1 = 0
            r0.rawClassfile = r1
            r0 = r7
            r1 = 0
            r0.memberCache = r1
            r0 = r7
            r1 = 0
            r0.accessors = r1
            r0 = r7
            r1 = 0
            r0.fieldInitializers = r1
            r0 = r7
            r1 = 0
            r0.hiddenMethods = r1
            r0 = r7
            r1 = 0
            r0.uniqueNumberSeed = r1
            r0 = r7
            r1 = 0
            r0.getCount = r1
            return
    }

    CtClassType(java.io.InputStream r8, javassist.ClassPool r9) throws java.io.IOException {
            r7 = this;
            r0 = r7
            r1 = 0
            java.lang.String r1 = (java.lang.String) r1
            r2 = r9
            r0.<init>(r1, r2)
            r0 = r7
            javassist.bytecode.ClassFile r1 = new javassist.bytecode.ClassFile
            r2 = r1
            java.io.DataInputStream r3 = new java.io.DataInputStream
            r4 = r3
            r5 = r8
            r4.<init>(r5)
            r2.<init>(r3)
            r0.classfile = r1
            r0 = r7
            r1 = r7
            javassist.bytecode.ClassFile r1 = r1.classfile
            java.lang.String r1 = r1.getName()
            r0.qualifiedName = r1
            return
    }

    CtClassType(javassist.bytecode.ClassFile r5, javassist.ClassPool r6) {
            r4 = this;
            r0 = r4
            r1 = 0
            java.lang.String r1 = (java.lang.String) r1
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.classfile = r1
            r0 = r4
            r1 = r4
            javassist.bytecode.ClassFile r1 = r1.classfile
            java.lang.String r1 = r1.getName()
            r0.qualifiedName = r1
            return
    }

    @Override // javassist.CtClass
    protected void extendToString(java.lang.StringBuilder r7) {
            r6 = this;
            r0 = r6
            boolean r0 = r0.wasChanged
            if (r0 == 0) goto Le
            r0 = r7
            java.lang.String r1 = "changed "
            java.lang.StringBuilder r0 = r0.append(r1)
        Le:
            r0 = r6
            boolean r0 = r0.wasFrozen
            if (r0 == 0) goto L1c
            r0 = r7
            java.lang.String r1 = "frozen "
            java.lang.StringBuilder r0 = r0.append(r1)
        L1c:
            r0 = r6
            boolean r0 = r0.wasPruned
            if (r0 == 0) goto L2a
            r0 = r7
            java.lang.String r1 = "pruned "
            java.lang.StringBuilder r0 = r0.append(r1)
        L2a:
            r0 = r7
            r1 = r6
            int r1 = r1.getModifiers()
            java.lang.String r1 = javassist.Modifier.toString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            java.lang.String r1 = " class "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            r1 = r6
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            javassist.CtClass r0 = r0.getSuperclass()     // Catch: javassist.NotFoundException -> L6e
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L6b
            r0 = r8
            java.lang.String r0 = r0.getName()     // Catch: javassist.NotFoundException -> L6e
            r9 = r0
            r0 = r9
            java.lang.String r1 = "java.lang.Object"
            boolean r0 = r0.equals(r1)     // Catch: javassist.NotFoundException -> L6e
            if (r0 != 0) goto L6b
            r0 = r7
            java.lang.String r1 = " extends "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> L6e
            r1 = r8
            java.lang.String r1 = r1.getName()     // Catch: javassist.NotFoundException -> L6e
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> L6e
        L6b:
            goto L76
        L6e:
            r8 = move-exception
            r0 = r7
            java.lang.String r1 = " extends ??"
            java.lang.StringBuilder r0 = r0.append(r1)
        L76:
            r0 = r6
            javassist.CtClass[] r0 = r0.getInterfaces()     // Catch: javassist.NotFoundException -> Laa
            r8 = r0
            r0 = r8
            int r0 = r0.length     // Catch: javassist.NotFoundException -> Laa
            if (r0 <= 0) goto L87
            r0 = r7
            java.lang.String r1 = " implements "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> Laa
        L87:
            r0 = 0
            r9 = r0
        L89:
            r0 = r9
            r1 = r8
            int r1 = r1.length     // Catch: javassist.NotFoundException -> Laa
            if (r0 >= r1) goto La7
            r0 = r7
            r1 = r8
            r2 = r9
            r1 = r1[r2]     // Catch: javassist.NotFoundException -> Laa
            java.lang.String r1 = r1.getName()     // Catch: javassist.NotFoundException -> Laa
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> Laa
            r0 = r7
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: javassist.NotFoundException -> Laa
            int r9 = r9 + 1
            goto L89
        La7:
            goto Lb2
        Laa:
            r8 = move-exception
            r0 = r7
            java.lang.String r1 = " extends ??"
            java.lang.StringBuilder r0 = r0.append(r1)
        Lb2:
            r0 = r6
            javassist.CtMember$Cache r0 = r0.getMembers()
            r8 = r0
            r0 = r6
            r1 = r7
            java.lang.String r2 = " fields="
            r3 = r8
            javassist.CtMember r3 = r3.fieldHead()
            r4 = r8
            javassist.CtMember r4 = r4.lastField()
            r0.exToString(r1, r2, r3, r4)
            r0 = r6
            r1 = r7
            java.lang.String r2 = " constructors="
            r3 = r8
            javassist.CtMember r3 = r3.consHead()
            r4 = r8
            javassist.CtMember r4 = r4.lastCons()
            r0.exToString(r1, r2, r3, r4)
            r0 = r6
            r1 = r7
            java.lang.String r2 = " methods="
            r3 = r8
            javassist.CtMember r3 = r3.methodHead()
            r4 = r8
            javassist.CtMember r4 = r4.lastMethod()
            r0.exToString(r1, r2, r3, r4)
            return
    }

    private void exToString(java.lang.StringBuilder r4, java.lang.String r5, javassist.CtMember r6, javassist.CtMember r7) {
            r3 = this;
            r0 = r4
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
        L6:
            r0 = r6
            r1 = r7
            if (r0 == r1) goto L21
            r0 = r6
            javassist.CtMember r0 = r0.next()
            r6 = r0
            r0 = r4
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L6
        L21:
            return
    }

    @Override // javassist.CtClass
    public javassist.compiler.AccessorMaker getAccessorMaker() {
            r5 = this;
            r0 = r5
            javassist.compiler.AccessorMaker r0 = r0.accessors
            if (r0 != 0) goto L13
            r0 = r5
            javassist.compiler.AccessorMaker r1 = new javassist.compiler.AccessorMaker
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.accessors = r1
        L13:
            r0 = r5
            javassist.compiler.AccessorMaker r0 = r0.accessors
            return r0
    }

    @Override // javassist.CtClass
    public javassist.bytecode.ClassFile getClassFile2() {
            r3 = this;
            r0 = r3
            r1 = 1
            javassist.bytecode.ClassFile r0 = r0.getClassFile3(r1)
            return r0
    }

    public javassist.bytecode.ClassFile getClassFile3(boolean r9) {
            r8 = this;
            r0 = r8
            javassist.bytecode.ClassFile r0 = r0.classfile
            r10 = r0
            r0 = r10
            if (r0 == 0) goto Lb
            r0 = r10
            return r0
        Lb:
            r0 = r9
            if (r0 == 0) goto L16
            r0 = r8
            javassist.ClassPool r0 = r0.classPool
            r0.compress()
        L16:
            r0 = r8
            r1 = r0
            r12 = r1
            monitor-enter(r0)
            r0 = r8
            javassist.bytecode.ClassFile r0 = r0.classfile     // Catch: java.lang.Throwable -> L34
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L29
            r0 = r10
            r1 = r12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            return r0
        L29:
            r0 = r8
            byte[] r0 = r0.rawClassfile     // Catch: java.lang.Throwable -> L34
            r11 = r0
            r0 = r12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            goto L3c
        L34:
            r13 = move-exception
            r0 = r12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            r0 = r13
            throw r0
        L3c:
            r0 = r11
            if (r0 == 0) goto L8d
            javassist.bytecode.ClassFile r0 = new javassist.bytecode.ClassFile     // Catch: java.io.IOException -> L5b
            r1 = r0
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch: java.io.IOException -> L5b
            r3 = r2
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.io.IOException -> L5b
            r5 = r4
            r6 = r11
            r5.<init>(r6)     // Catch: java.io.IOException -> L5b
            r3.<init>(r4)     // Catch: java.io.IOException -> L5b
            r1.<init>(r2)     // Catch: java.io.IOException -> L5b
            r12 = r0
            goto L6c
        L5b:
            r13 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r13
            java.lang.String r2 = r2.toString()
            r3 = r13
            r1.<init>(r2, r3)
            throw r0
        L6c:
            r0 = r8
            r1 = 2
            r0.getCount = r1
            r0 = r8
            r1 = r0
            r13 = r1
            monitor-enter(r0)
            r0 = r8
            r1 = 0
            r0.rawClassfile = r1     // Catch: java.lang.Throwable -> L85
            r0 = r8
            r1 = r12
            javassist.bytecode.ClassFile r0 = r0.setClassFile(r1)     // Catch: java.lang.Throwable -> L85
            r1 = r13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L85
            return r0
        L85:
            r14 = move-exception
            r0 = r13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L85
            r0 = r14
            throw r0
        L8d:
            r0 = 0
            r12 = r0
            r0 = r8
            javassist.ClassPool r0 = r0.classPool     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r1 = r8
            java.lang.String r1 = r1.getName()     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            java.io.InputStream r0 = r0.openClassfile(r1)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r12 = r0
            r0 = r12
            if (r0 != 0) goto Lae
            javassist.NotFoundException r0 = new javassist.NotFoundException     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.getName()     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r1.<init>(r2)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            throw r0     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
        Lae:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r1 = r0
            r2 = r12
            r1.<init>(r2)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r12 = r0
            javassist.bytecode.ClassFile r0 = new javassist.bytecode.ClassFile     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r1 = r0
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r3 = r2
            r4 = r12
            r3.<init>(r4)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r1.<init>(r2)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r13 = r0
            r0 = r13
            java.lang.String r0 = r0.getName()     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r1 = r8
            java.lang.String r1 = r1.qualifiedName     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            boolean r0 = r0.equals(r1)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            if (r0 != 0) goto L11d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r3 = r2
            r3.<init>()     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            java.lang.String r3 = "cannot find "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r3 = r8
            java.lang.String r3 = r3.qualifiedName     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r3 = r13
            java.lang.String r3 = r3.getName()     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            java.lang.String r3 = " found in "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r3 = r8
            java.lang.String r3 = r3.qualifiedName     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r4 = 46
            r5 = 47
            java.lang.String r3 = r3.replace(r4, r5)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            java.lang.String r3 = ".class"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            java.lang.String r2 = r2.toString()     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r1.<init>(r2)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            throw r0     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
        L11d:
            r0 = r8
            r1 = r13
            javassist.bytecode.ClassFile r0 = r0.setClassFile(r1)     // Catch: javassist.NotFoundException -> L137 java.io.IOException -> L148 java.lang.Throwable -> L159
            r14 = r0
            r0 = r12
            if (r0 == 0) goto L134
            r0 = r12
            r0.close()     // Catch: java.io.IOException -> L132
            goto L134
        L132:
            r15 = move-exception
        L134:
            r0 = r14
            return r0
        L137:
            r13 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L159
            r1 = r0
            r2 = r13
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L159
            r3 = r13
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L159
            throw r0     // Catch: java.lang.Throwable -> L159
        L148:
            r13 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L159
            r1 = r0
            r2 = r13
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L159
            r3 = r13
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L159
            throw r0     // Catch: java.lang.Throwable -> L159
        L159:
            r16 = move-exception
            r0 = r12
            if (r0 == 0) goto L16a
            r0 = r12
            r0.close()     // Catch: java.io.IOException -> L168
            goto L16a
        L168:
            r17 = move-exception
        L16a:
            r0 = r16
            throw r0
    }

    @Override // javassist.CtClass
    final void incGetCounter() {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.getCount
            r2 = 1
            int r1 = r1 + r2
            r0.getCount = r1
            return
    }

    @Override // javassist.CtClass
    void compress() {
            r3 = this;
            r0 = r3
            int r0 = r0.getCount
            r1 = 2
            if (r0 >= r1) goto L2e
            r0 = r3
            boolean r0 = r0.isModified()
            if (r0 != 0) goto L1c
            boolean r0 = javassist.ClassPool.releaseUnmodifiedClassFile
            if (r0 == 0) goto L1c
            r0 = r3
            r0.removeClassFile()
            goto L2e
        L1c:
            r0 = r3
            boolean r0 = r0.isFrozen()
            if (r0 == 0) goto L2e
            r0 = r3
            boolean r0 = r0.wasPruned
            if (r0 != 0) goto L2e
            r0 = r3
            r0.saveClassFile()
        L2e:
            r0 = r3
            r1 = 0
            r0.getCount = r1
            return
    }

    private synchronized void saveClassFile() {
            r4 = this;
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.classfile
            if (r0 == 0) goto Le
            r0 = r4
            javassist.CtMember$Cache r0 = r0.hasMemberCache()
            if (r0 == 0) goto Lf
        Le:
            return
        Lf:
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
            javassist.bytecode.ClassFile r0 = r0.classfile     // Catch: java.io.IOException -> L3c
            r1 = r6
            r0.write(r1)     // Catch: java.io.IOException -> L3c
            r0 = r5
            r0.close()     // Catch: java.io.IOException -> L3c
            r0 = r4
            r1 = r5
            byte[] r1 = r1.toByteArray()     // Catch: java.io.IOException -> L3c
            r0.rawClassfile = r1     // Catch: java.io.IOException -> L3c
            r0 = r4
            r1 = 0
            r0.classfile = r1     // Catch: java.io.IOException -> L3c
            goto L3d
        L3c:
            r7 = move-exception
        L3d:
            return
    }

    private synchronized void removeClassFile() {
            r3 = this;
            r0 = r3
            javassist.bytecode.ClassFile r0 = r0.classfile
            if (r0 == 0) goto L1a
            r0 = r3
            boolean r0 = r0.isModified()
            if (r0 != 0) goto L1a
            r0 = r3
            javassist.CtMember$Cache r0 = r0.hasMemberCache()
            if (r0 != 0) goto L1a
            r0 = r3
            r1 = 0
            r0.classfile = r1
        L1a:
            return
    }

    private synchronized javassist.bytecode.ClassFile setClassFile(javassist.bytecode.ClassFile r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.ClassFile r0 = r0.classfile
            if (r0 != 0) goto Lc
            r0 = r3
            r1 = r4
            r0.classfile = r1
        Lc:
            r0 = r3
            javassist.bytecode.ClassFile r0 = r0.classfile
            return r0
    }

    @Override // javassist.CtClass
    public javassist.ClassPool getClassPool() {
            r2 = this;
            r0 = r2
            javassist.ClassPool r0 = r0.classPool
            return r0
    }

    void setClassPool(javassist.ClassPool r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.classPool = r1
            return
    }

    @Override // javassist.CtClass
    public java.net.URL getURL() throws javassist.NotFoundException {
            r4 = this;
            r0 = r4
            javassist.ClassPool r0 = r0.classPool
            r1 = r4
            java.lang.String r1 = r1.getName()
            java.net.URL r0 = r0.find(r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L1c
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r4
            java.lang.String r2 = r2.getName()
            r1.<init>(r2)
            throw r0
        L1c:
            r0 = r5
            return r0
    }

    @Override // javassist.CtClass
    public boolean isModified() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.wasChanged
            return r0
    }

    @Override // javassist.CtClass
    public boolean isFrozen() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.wasFrozen
            return r0
    }

    @Override // javassist.CtClass
    public void freeze() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.wasFrozen = r1
            return
    }

    @Override // javassist.CtClass
    void checkModify() throws java.lang.RuntimeException {
            r4 = this;
            r0 = r4
            boolean r0 = r0.isFrozen()
            if (r0 == 0) goto L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " class is frozen"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5 = r0
            r0 = r4
            boolean r0 = r0.wasPruned
            if (r0 == 0) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " and pruned"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5 = r0
        L3b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L44:
            r0 = r4
            r1 = 1
            r0.wasChanged = r1
            return
    }

    @Override // javassist.CtClass
    public void defrost() {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "defrost"
            r0.checkPruned(r1)
            r0 = r3
            r1 = 0
            r0.wasFrozen = r1
            return
    }

    @Override // javassist.CtClass
    public boolean subtypeOf(javassist.CtClass r5) throws javassist.NotFoundException {
            r4 = this;
            r0 = r5
            java.lang.String r0 = r0.getName()
            r7 = r0
            r0 = r4
            r1 = r5
            if (r0 == r1) goto L15
            r0 = r4
            java.lang.String r0 = r0.getName()
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L17
        L15:
            r0 = 1
            return r0
        L17:
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.getSuperclass()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L34
            r0 = r9
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            r0 = 1
            return r0
        L34:
            r0 = r8
            java.lang.String[] r0 = r0.getInterfaces()
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r6 = r0
        L42:
            r0 = r6
            r1 = r11
            if (r0 >= r1) goto L5b
            r0 = r10
            r1 = r6
            r0 = r0[r1]
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L55
            r0 = 1
            return r0
        L55:
            int r6 = r6 + 1
            goto L42
        L5b:
            r0 = r9
            if (r0 == 0) goto L72
            r0 = r4
            javassist.ClassPool r0 = r0.classPool
            r1 = r9
            javassist.CtClass r0 = r0.get(r1)
            r1 = r5
            boolean r0 = r0.subtypeOf(r1)
            if (r0 == 0) goto L72
            r0 = 1
            return r0
        L72:
            r0 = 0
            r6 = r0
        L74:
            r0 = r6
            r1 = r11
            if (r0 >= r1) goto L94
            r0 = r4
            javassist.ClassPool r0 = r0.classPool
            r1 = r10
            r2 = r6
            r1 = r1[r2]
            javassist.CtClass r0 = r0.get(r1)
            r1 = r5
            boolean r0 = r0.subtypeOf(r1)
            if (r0 == 0) goto L8e
            r0 = 1
            return r0
        L8e:
            int r6 = r6 + 1
            goto L74
        L94:
            r0 = 0
            return r0
    }

    @Override // javassist.CtClass
    public void setName(java.lang.String r5) throws java.lang.RuntimeException {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.getName()
            r6 = r0
            r0 = r5
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le
            return
        Le:
            r0 = r4
            javassist.ClassPool r0 = r0.classPool
            r1 = r5
            r0.checkNotFrozen(r1)
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r7 = r0
            r0 = r4
            r1 = r5
            super.setName(r1)
            r0 = r7
            r1 = r5
            r0.setName(r1)
            r0 = r4
            r0.nameReplaced()
            r0 = r4
            javassist.ClassPool r0 = r0.classPool
            r1 = r6
            r2 = r4
            r0.classNameChanged(r1, r2)
            return
    }

    @Override // javassist.CtClass
    public java.lang.String getGenericSignature() {
            r3 = this;
            r0 = r3
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            java.lang.String r1 = "Signature"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.SignatureAttribute r0 = (javassist.bytecode.SignatureAttribute) r0
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L16
            r0 = 0
            goto L1a
        L16:
            r0 = r4
            java.lang.String r0 = r0.getSignature()
        L1a:
            return r0
    }

    @Override // javassist.CtClass
    public void setGenericSignature(java.lang.String r6) {
            r5 = this;
            r0 = r5
            javassist.bytecode.ClassFile r0 = r0.getClassFile()
            r7 = r0
            javassist.bytecode.SignatureAttribute r0 = new javassist.bytecode.SignatureAttribute
            r1 = r0
            r2 = r7
            javassist.bytecode.ConstPool r2 = r2.getConstPool()
            r3 = r6
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r7
            r1 = r8
            r0.addAttribute(r1)
            return
    }

    @Override // javassist.CtClass
    public void replaceClassName(javassist.ClassMap r5) throws java.lang.RuntimeException {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.getName()
            r6 = r0
            r0 = r5
            r1 = r6
            java.lang.String r1 = javassist.bytecode.Descriptor.toJvmName(r1)
            java.lang.String r0 = r0.get(r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L1f
            r0 = r7
            java.lang.String r0 = javassist.bytecode.Descriptor.toJavaName(r0)
            r7 = r0
            r0 = r4
            javassist.ClassPool r0 = r0.classPool
            r1 = r7
            r0.checkNotFrozen(r1)
        L1f:
            r0 = r4
            r1 = r5
            super.replaceClassName(r1)
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r8 = r0
            r0 = r8
            r1 = r5
            r0.renameClass(r1)
            r0 = r4
            r0.nameReplaced()
            r0 = r7
            if (r0 == 0) goto L46
            r0 = r4
            r1 = r7
            super.setName(r1)
            r0 = r4
            javassist.ClassPool r0 = r0.classPool
            r1 = r6
            r2 = r4
            r0.classNameChanged(r1, r2)
        L46:
            return
    }

    @Override // javassist.CtClass
    public void replaceClassName(java.lang.String r5, java.lang.String r6) throws java.lang.RuntimeException {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.getName()
            r7 = r0
            r0 = r7
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            r0 = r4
            r1 = r6
            r0.setName(r1)
            goto L28
        L15:
            r0 = r4
            r1 = r5
            r2 = r6
            super.replaceClassName(r1, r2)
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r1 = r5
            r2 = r6
            r0.renameClass(r1, r2)
            r0 = r4
            r0.nameReplaced()
        L28:
            return
    }

    @Override // javassist.CtClass
    public boolean isInterface() {
            r2 = this;
            r0 = r2
            int r0 = r0.getModifiers()
            boolean r0 = javassist.Modifier.isInterface(r0)
            return r0
    }

    @Override // javassist.CtClass
    public boolean isAnnotation() {
            r2 = this;
            r0 = r2
            int r0 = r0.getModifiers()
            boolean r0 = javassist.Modifier.isAnnotation(r0)
            return r0
    }

    @Override // javassist.CtClass
    public boolean isEnum() {
            r2 = this;
            r0 = r2
            int r0 = r0.getModifiers()
            boolean r0 = javassist.Modifier.isEnum(r0)
            return r0
    }

    @Override // javassist.CtClass
    public int getModifiers() {
            r3 = this;
            r0 = r3
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r4 = r0
            r0 = r4
            int r0 = r0.getAccessFlags()
            r5 = r0
            r0 = r5
            r1 = 32
            int r0 = javassist.bytecode.AccessFlag.clear(r0, r1)
            r5 = r0
            r0 = r4
            int r0 = r0.getInnerAccessFlags()
            r6 = r0
            r0 = r6
            r1 = -1
            if (r0 == r1) goto L50
            r0 = r6
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L27
            r0 = r5
            r1 = 8
            r0 = r0 | r1
            r5 = r0
        L27:
            r0 = r6
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L34
            r0 = r5
            r1 = 1
            r0 = r0 | r1
            r5 = r0
            goto L50
        L34:
            r0 = r5
            r1 = -2
            r0 = r0 & r1
            r5 = r0
            r0 = r6
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto L46
            r0 = r5
            r1 = 4
            r0 = r0 | r1
            r5 = r0
            goto L50
        L46:
            r0 = r6
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L50
            r0 = r5
            r1 = 2
            r0 = r0 | r1
            r5 = r0
        L50:
            r0 = r5
            int r0 = javassist.bytecode.AccessFlag.toModifier(r0)
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtClass[] getNestedClasses() throws javassist.NotFoundException {
            r4 = this;
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "InnerClasses"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.InnerClassesAttribute r0 = (javassist.bytecode.InnerClassesAttribute) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L19
            r0 = 0
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            return r0
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r5
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "$"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7 = r0
            r0 = r6
            int r0 = r0.tableLength()
            r8 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r9 = r0
            r0 = 0
            r10 = r0
        L45:
            r0 = r10
            r1 = r8
            if (r0 >= r1) goto L87
            r0 = r6
            r1 = r10
            java.lang.String r0 = r0.innerClass(r1)
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L81
            r0 = r11
            r1 = r7
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L81
            r0 = r11
            r1 = 36
            int r0 = r0.lastIndexOf(r1)
            r1 = r7
            int r1 = r1.length()
            if (r0 >= r1) goto L81
            r0 = r9
            r1 = r4
            javassist.ClassPool r1 = r1.classPool
            r2 = r11
            javassist.CtClass r1 = r1.get(r2)
            boolean r0 = r0.add(r1)
        L81:
            int r10 = r10 + 1
            goto L45
        L87:
            r0 = r9
            r1 = r9
            int r1 = r1.size()
            javassist.CtClass[] r1 = new javassist.CtClass[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            javassist.CtClass[] r0 = (javassist.CtClass[]) r0
            return r0
    }

    @Override // javassist.CtClass
    public void setModifiers(int r6) {
            r5 = this;
            r0 = r5
            r0.checkModify()
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.getName()
            r2 = r5
            r3 = 1
            updateInnerEntry(r0, r1, r2, r3)
            r0 = r5
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r7 = r0
            r0 = r7
            r1 = r6
            r2 = -9
            r1 = r1 & r2
            int r1 = javassist.bytecode.AccessFlag.of(r1)
            r0.setAccessFlags(r1)
            return
    }

    private static void updateInnerEntry(int r5, java.lang.String r6, javassist.CtClass r7, boolean r8) {
            r0 = r7
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r9 = r0
            r0 = r9
            java.lang.String r1 = "InnerClasses"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.InnerClassesAttribute r0 = (javassist.bytecode.InnerClassesAttribute) r0
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L9f
            r0 = r5
            r1 = -9
            r0 = r0 & r1
            r11 = r0
            r0 = r10
            r1 = r6
            int r0 = r0.find(r1)
            r12 = r0
            r0 = r12
            if (r0 < 0) goto L9f
            r0 = r10
            r1 = r12
            int r0 = r0.accessFlags(r1)
            r1 = 8
            r0 = r0 & r1
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L43
            r0 = r5
            boolean r0 = javassist.Modifier.isStatic(r0)
            if (r0 != 0) goto L9f
        L43:
            r0 = r7
            r0.checkModify()
            r0 = r10
            r1 = r12
            r2 = r11
            int r2 = javassist.bytecode.AccessFlag.of(r2)
            r3 = r13
            r2 = r2 | r3
            r0.setAccessFlags(r1, r2)
            r0 = r10
            r1 = r12
            java.lang.String r0 = r0.outerClass(r1)
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L9e
            r0 = r8
            if (r0 == 0) goto L9e
            r0 = r7
            javassist.ClassPool r0 = r0.getClassPool()     // Catch: javassist.NotFoundException -> L7f
            r1 = r14
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> L7f
            r15 = r0
            r0 = r11
            r1 = r6
            r2 = r15
            r3 = 0
            updateInnerEntry(r0, r1, r2, r3)     // Catch: javassist.NotFoundException -> L7f
            goto L9e
        L7f:
            r15 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "cannot find the declaring class: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r14
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L9e:
            return
        L9f:
            r0 = r5
            boolean r0 = javassist.Modifier.isStatic(r0)
            if (r0 == 0) goto Lcb
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "cannot change "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.String r3 = javassist.bytecode.Descriptor.toJavaName(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " into a static class"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lcb:
            return
    }

    @Override // javassist.CtClass
    public boolean hasAnnotation(java.lang.String r6) {
            r5 = this;
            r0 = r5
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r8 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r9 = r0
            r0 = r6
            r1 = r5
            javassist.ClassPool r1 = r1.getClassPool()
            r2 = r8
            r3 = r9
            boolean r0 = hasAnnotationType(r0, r1, r2, r3)
            return r0
    }

    @java.lang.Deprecated
    static boolean hasAnnotationType(java.lang.Class<?> r5, javassist.ClassPool r6, javassist.bytecode.AnnotationsAttribute r7, javassist.bytecode.AnnotationsAttribute r8) {
            r0 = r5
            java.lang.String r0 = r0.getName()
            r1 = r6
            r2 = r7
            r3 = r8
            boolean r0 = hasAnnotationType(r0, r1, r2, r3)
            return r0
    }

    static boolean hasAnnotationType(java.lang.String r3, javassist.ClassPool r4, javassist.bytecode.AnnotationsAttribute r5, javassist.bytecode.AnnotationsAttribute r6) {
            r0 = r5
            if (r0 != 0) goto La
            r0 = 0
            r7 = r0
            goto L10
        La:
            r0 = r5
            javassist.bytecode.annotation.Annotation[] r0 = r0.getAnnotations()
            r7 = r0
        L10:
            r0 = r6
            if (r0 != 0) goto L1a
            r0 = 0
            r8 = r0
            goto L20
        L1a:
            r0 = r6
            javassist.bytecode.annotation.Annotation[] r0 = r0.getAnnotations()
            r8 = r0
        L20:
            r0 = r7
            if (r0 == 0) goto L47
            r0 = 0
            r9 = r0
        L28:
            r0 = r9
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L47
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            java.lang.String r0 = r0.getTypeName()
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L41
            r0 = 1
            return r0
        L41:
            int r9 = r9 + 1
            goto L28
        L47:
            r0 = r8
            if (r0 == 0) goto L6e
            r0 = 0
            r9 = r0
        L4f:
            r0 = r9
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto L6e
            r0 = r8
            r1 = r9
            r0 = r0[r1]
            java.lang.String r0 = r0.getTypeName()
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L68
            r0 = 1
            return r0
        L68:
            int r9 = r9 + 1
            goto L4f
        L6e:
            r0 = 0
            return r0
    }

    @Override // javassist.CtClass
    public java.lang.Object getAnnotation(java.lang.Class<?> r6) throws java.lang.ClassNotFoundException {
            r5 = this;
            r0 = r5
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r8 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r9 = r0
            r0 = r6
            r1 = r5
            javassist.ClassPool r1 = r1.getClassPool()
            r2 = r8
            r3 = r9
            java.lang.Object r0 = getAnnotationType(r0, r1, r2, r3)
            return r0
    }

    static java.lang.Object getAnnotationType(java.lang.Class<?> r3, javassist.ClassPool r4, javassist.bytecode.AnnotationsAttribute r5, javassist.bytecode.AnnotationsAttribute r6) throws java.lang.ClassNotFoundException {
            r0 = r5
            if (r0 != 0) goto La
            r0 = 0
            r7 = r0
            goto L10
        La:
            r0 = r5
            javassist.bytecode.annotation.Annotation[] r0 = r0.getAnnotations()
            r7 = r0
        L10:
            r0 = r6
            if (r0 != 0) goto L1a
            r0 = 0
            r8 = r0
            goto L20
        L1a:
            r0 = r6
            javassist.bytecode.annotation.Annotation[] r0 = r0.getAnnotations()
            r8 = r0
        L20:
            r0 = r3
            java.lang.String r0 = r0.getName()
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L56
            r0 = 0
            r10 = r0
        L2e:
            r0 = r10
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L56
            r0 = r7
            r1 = r10
            r0 = r0[r1]
            java.lang.String r0 = r0.getTypeName()
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
            r0 = r7
            r1 = r10
            r0 = r0[r1]
            r1 = r4
            java.lang.Object r0 = toAnnoType(r0, r1)
            return r0
        L50:
            int r10 = r10 + 1
            goto L2e
        L56:
            r0 = r8
            if (r0 == 0) goto L86
            r0 = 0
            r10 = r0
        L5e:
            r0 = r10
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto L86
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            java.lang.String r0 = r0.getTypeName()
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L80
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r1 = r4
            java.lang.Object r0 = toAnnoType(r0, r1)
            return r0
        L80:
            int r10 = r10 + 1
            goto L5e
        L86:
            r0 = 0
            return r0
    }

    @Override // javassist.CtClass
    public java.lang.Object[] getAnnotations() throws java.lang.ClassNotFoundException {
            r3 = this;
            r0 = r3
            r1 = 0
            java.lang.Object[] r0 = r0.getAnnotations(r1)
            return r0
    }

    @Override // javassist.CtClass
    public java.lang.Object[] getAvailableAnnotations() {
            r5 = this;
            r0 = r5
            r1 = 1
            java.lang.Object[] r0 = r0.getAnnotations(r1)     // Catch: java.lang.ClassNotFoundException -> L6
            return r0
        L6:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Unexpected exception "
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
    }

    private java.lang.Object[] getAnnotations(boolean r6) throws java.lang.ClassNotFoundException {
            r5 = this;
            r0 = r5
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r8 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r9 = r0
            r0 = r6
            r1 = r5
            javassist.ClassPool r1 = r1.getClassPool()
            r2 = r8
            r3 = r9
            java.lang.Object[] r0 = toAnnotationType(r0, r1, r2, r3)
            return r0
    }

    static java.lang.Object[] toAnnotationType(boolean r5, javassist.ClassPool r6, javassist.bytecode.AnnotationsAttribute r7, javassist.bytecode.AnnotationsAttribute r8) throws java.lang.ClassNotFoundException {
            r0 = r7
            if (r0 != 0) goto Ld
            r0 = 0
            r9 = r0
            r0 = 0
            r11 = r0
            goto L18
        Ld:
            r0 = r7
            javassist.bytecode.annotation.Annotation[] r0 = r0.getAnnotations()
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r11 = r0
        L18:
            r0 = r8
            if (r0 != 0) goto L25
            r0 = 0
            r10 = r0
            r0 = 0
            r12 = r0
            goto L30
        L25:
            r0 = r8
            javassist.bytecode.annotation.Annotation[] r0 = r0.getAnnotations()
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r12 = r0
        L30:
            r0 = r5
            if (r0 != 0) goto L80
            r0 = r11
            r1 = r12
            int r0 = r0 + r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r13 = r0
            r0 = 0
            r14 = r0
        L41:
            r0 = r14
            r1 = r11
            if (r0 >= r1) goto L5c
            r0 = r13
            r1 = r14
            r2 = r9
            r3 = r14
            r2 = r2[r3]
            r3 = r6
            java.lang.Object r2 = toAnnoType(r2, r3)
            r0[r1] = r2
            int r14 = r14 + 1
            goto L41
        L5c:
            r0 = 0
            r14 = r0
        L5f:
            r0 = r14
            r1 = r12
            if (r0 >= r1) goto L7d
            r0 = r13
            r1 = r14
            r2 = r11
            int r1 = r1 + r2
            r2 = r10
            r3 = r14
            r2 = r2[r3]
            r3 = r6
            java.lang.Object r2 = toAnnoType(r2, r3)
            r0[r1] = r2
            int r14 = r14 + 1
            goto L5f
        L7d:
            r0 = r13
            return r0
        L80:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = 0
            r14 = r0
        L8c:
            r0 = r14
            r1 = r11
            if (r0 >= r1) goto Laf
            r0 = r13
            r1 = r9
            r2 = r14
            r1 = r1[r2]     // Catch: java.lang.ClassNotFoundException -> La7
            r2 = r6
            java.lang.Object r1 = toAnnoType(r1, r2)     // Catch: java.lang.ClassNotFoundException -> La7
            boolean r0 = r0.add(r1)     // Catch: java.lang.ClassNotFoundException -> La7
            goto La9
        La7:
            r15 = move-exception
        La9:
            int r14 = r14 + 1
            goto L8c
        Laf:
            r0 = 0
            r14 = r0
        Lb2:
            r0 = r14
            r1 = r12
            if (r0 >= r1) goto Ld5
            r0 = r13
            r1 = r10
            r2 = r14
            r1 = r1[r2]     // Catch: java.lang.ClassNotFoundException -> Lcd
            r2 = r6
            java.lang.Object r1 = toAnnoType(r1, r2)     // Catch: java.lang.ClassNotFoundException -> Lcd
            boolean r0 = r0.add(r1)     // Catch: java.lang.ClassNotFoundException -> Lcd
            goto Lcf
        Lcd:
            r15 = move-exception
        Lcf:
            int r14 = r14 + 1
            goto Lb2
        Ld5:
            r0 = r13
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    static java.lang.Object[][] toAnnotationType(boolean r5, javassist.ClassPool r6, javassist.bytecode.ParameterAnnotationsAttribute r7, javassist.bytecode.ParameterAnnotationsAttribute r8, javassist.bytecode.MethodInfo r9) throws java.lang.ClassNotFoundException {
            r0 = 0
            r10 = r0
            r0 = r7
            if (r0 == 0) goto L10
            r0 = r7
            int r0 = r0.numParameters()
            r10 = r0
            goto L27
        L10:
            r0 = r8
            if (r0 == 0) goto L1d
            r0 = r8
            int r0 = r0.numParameters()
            r10 = r0
            goto L27
        L1d:
            r0 = r9
            java.lang.String r0 = r0.getDescriptor()
            int r0 = javassist.bytecode.Descriptor.numOfParameters(r0)
            r10 = r0
        L27:
            r0 = r10
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r11 = r0
            r0 = 0
            r12 = r0
        L31:
            r0 = r12
            r1 = r10
            if (r0 >= r1) goto L12e
            r0 = r7
            if (r0 != 0) goto L45
            r0 = 0
            r13 = r0
            r0 = 0
            r15 = r0
            goto L53
        L45:
            r0 = r7
            javassist.bytecode.annotation.Annotation[][] r0 = r0.getAnnotations()
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            int r0 = r0.length
            r15 = r0
        L53:
            r0 = r8
            if (r0 != 0) goto L60
            r0 = 0
            r14 = r0
            r0 = 0
            r16 = r0
            goto L6e
        L60:
            r0 = r8
            javassist.bytecode.annotation.Annotation[][] r0 = r0.getAnnotations()
            r1 = r12
            r0 = r0[r1]
            r14 = r0
            r0 = r14
            int r0 = r0.length
            r16 = r0
        L6e:
            r0 = r5
            if (r0 != 0) goto Lc7
            r0 = r11
            r1 = r12
            r2 = r15
            r3 = r16
            int r2 = r2 + r3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0[r1] = r2
            r0 = 0
            r17 = r0
        L82:
            r0 = r17
            r1 = r15
            if (r0 >= r1) goto La0
            r0 = r11
            r1 = r12
            r0 = r0[r1]
            r1 = r17
            r2 = r13
            r3 = r17
            r2 = r2[r3]
            r3 = r6
            java.lang.Object r2 = toAnnoType(r2, r3)
            r0[r1] = r2
            int r17 = r17 + 1
            goto L82
        La0:
            r0 = 0
            r17 = r0
        La3:
            r0 = r17
            r1 = r16
            if (r0 >= r1) goto Lc4
            r0 = r11
            r1 = r12
            r0 = r0[r1]
            r1 = r17
            r2 = r15
            int r1 = r1 + r2
            r2 = r14
            r3 = r17
            r2 = r2[r3]
            r3 = r6
            java.lang.Object r2 = toAnnoType(r2, r3)
            r0[r1] = r2
            int r17 = r17 + 1
            goto La3
        Lc4:
            goto L128
        Lc7:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = 0
            r18 = r0
        Ld3:
            r0 = r18
            r1 = r15
            if (r0 >= r1) goto Lf6
            r0 = r17
            r1 = r13
            r2 = r18
            r1 = r1[r2]     // Catch: java.lang.ClassNotFoundException -> Lee
            r2 = r6
            java.lang.Object r1 = toAnnoType(r1, r2)     // Catch: java.lang.ClassNotFoundException -> Lee
            boolean r0 = r0.add(r1)     // Catch: java.lang.ClassNotFoundException -> Lee
            goto Lf0
        Lee:
            r19 = move-exception
        Lf0:
            int r18 = r18 + 1
            goto Ld3
        Lf6:
            r0 = 0
            r18 = r0
        Lf9:
            r0 = r18
            r1 = r16
            if (r0 >= r1) goto L11c
            r0 = r17
            r1 = r14
            r2 = r18
            r1 = r1[r2]     // Catch: java.lang.ClassNotFoundException -> L114
            r2 = r6
            java.lang.Object r1 = toAnnoType(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L114
            boolean r0 = r0.add(r1)     // Catch: java.lang.ClassNotFoundException -> L114
            goto L116
        L114:
            r19 = move-exception
        L116:
            int r18 = r18 + 1
            goto Lf9
        L11c:
            r0 = r11
            r1 = r12
            r2 = r17
            java.lang.Object[] r2 = r2.toArray()
            r0[r1] = r2
        L128:
            int r12 = r12 + 1
            goto L31
        L12e:
            r0 = r11
            return r0
    }

    private static java.lang.Object toAnnoType(javassist.bytecode.annotation.Annotation r5, javassist.ClassPool r6) throws java.lang.ClassNotFoundException {
            r0 = r6
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> Lc
            r7 = r0
            r0 = r5
            r1 = r7
            r2 = r6
            java.lang.Object r0 = r0.toAnnotationType(r1, r2)     // Catch: java.lang.ClassNotFoundException -> Lc
            return r0
        Lc:
            r7 = move-exception
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r8 = r0
            r0 = r5
            r1 = r8
            r2 = r6
            java.lang.Object r0 = r0.toAnnotationType(r1, r2)     // Catch: java.lang.ClassNotFoundException -> L1c
            return r0
        L1c:
            r9 = move-exception
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.getTypeName()     // Catch: java.lang.Throwable -> L38
            javassist.CtClass r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.Class r0 = r0.toClass()     // Catch: java.lang.Throwable -> L38
            r10 = r0
            r0 = r10
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L38
            r1 = r10
            r2 = r6
            r3 = r5
            java.lang.Object r0 = javassist.bytecode.annotation.AnnotationImpl.make(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L38
            return r0
        L38:
            r10 = move-exception
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r1 = r0
            r2 = r5
            java.lang.String r2 = r2.getTypeName()
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.CtClass
    public boolean subclassOf(javassist.CtClass r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r4
            java.lang.String r0 = r0.getName()
            r5 = r0
            r0 = r3
            r6 = r0
        Ld:
            r0 = r6
            if (r0 == 0) goto L26
            r0 = r6
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L29
            r1 = r5
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L29
            if (r0 == 0) goto L1e
            r0 = 1
            return r0
        L1e:
            r0 = r6
            javassist.CtClass r0 = r0.getSuperclass()     // Catch: java.lang.Exception -> L29
            r6 = r0
            goto Ld
        L26:
            goto L2b
        L29:
            r7 = move-exception
        L2b:
            r0 = 0
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtClass getSuperclass() throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            java.lang.String r0 = r0.getSuperclass()
            r4 = r0
            r0 = r4
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r3
            javassist.ClassPool r0 = r0.classPool
            r1 = r4
            javassist.CtClass r0 = r0.get(r1)
            return r0
    }

    @Override // javassist.CtClass
    public void setSuperclass(javassist.CtClass r4) throws javassist.CannotCompileException {
            r3 = this;
            r0 = r3
            r0.checkModify()
            r0 = r3
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L13
            r0 = r3
            r1 = r4
            r0.addInterface(r1)
            goto L1e
        L13:
            r0 = r3
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r1 = r4
            java.lang.String r1 = r1.getName()
            r0.setSuperclass(r1)
        L1e:
            return
    }

    @Override // javassist.CtClass
    public javassist.CtClass[] getInterfaces() throws javassist.NotFoundException {
            r6 = this;
            r0 = r6
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            java.lang.String[] r0 = r0.getInterfaces()
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = r8
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            r9 = r0
            r0 = 0
            r10 = r0
        L13:
            r0 = r10
            r1 = r8
            if (r0 >= r1) goto L2e
            r0 = r9
            r1 = r10
            r2 = r6
            javassist.ClassPool r2 = r2.classPool
            r3 = r7
            r4 = r10
            r3 = r3[r4]
            javassist.CtClass r2 = r2.get(r3)
            r0[r1] = r2
            int r10 = r10 + 1
            goto L13
        L2e:
            r0 = r9
            return r0
    }

    @Override // javassist.CtClass
    public void setInterfaces(javassist.CtClass[] r6) {
            r5 = this;
            r0 = r5
            r0.checkModify()
            r0 = r6
            if (r0 != 0) goto L10
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r7 = r0
            goto L32
        L10:
            r0 = r6
            int r0 = r0.length
            r8 = r0
            r0 = r8
            java.lang.String[] r0 = new java.lang.String[r0]
            r7 = r0
            r0 = 0
            r9 = r0
        L1b:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L32
            r0 = r7
            r1 = r9
            r2 = r6
            r3 = r9
            r2 = r2[r3]
            java.lang.String r2 = r2.getName()
            r0[r1] = r2
            int r9 = r9 + 1
            goto L1b
        L32:
            r0 = r5
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r1 = r7
            r0.setInterfaces(r1)
            return
    }

    @Override // javassist.CtClass
    public void addInterface(javassist.CtClass r4) {
            r3 = this;
            r0 = r3
            r0.checkModify()
            r0 = r4
            if (r0 == 0) goto L13
            r0 = r3
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r1 = r4
            java.lang.String r1 = r1.getName()
            r0.addInterface(r1)
        L13:
            return
    }

    @Override // javassist.CtClass
    public javassist.CtClass getDeclaringClass() throws javassist.NotFoundException {
            r4 = this;
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "InnerClasses"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.InnerClassesAttribute r0 = (javassist.bytecode.InnerClassesAttribute) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L16
            r0 = 0
            return r0
        L16:
            r0 = r4
            java.lang.String r0 = r0.getName()
            r7 = r0
            r0 = r6
            int r0 = r0.tableLength()
            r8 = r0
            r0 = 0
            r9 = r0
        L24:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L73
            r0 = r7
            r1 = r6
            r2 = r9
            java.lang.String r1 = r1.innerClass(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6d
            r0 = r6
            r1 = r9
            java.lang.String r0 = r0.outerClass(r1)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L4f
            r0 = r4
            javassist.ClassPool r0 = r0.classPool
            r1 = r10
            javassist.CtClass r0 = r0.get(r1)
            return r0
        L4f:
            r0 = r5
            java.lang.String r1 = "EnclosingMethod"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.EnclosingMethodAttribute r0 = (javassist.bytecode.EnclosingMethodAttribute) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L6d
            r0 = r4
            javassist.ClassPool r0 = r0.classPool
            r1 = r11
            java.lang.String r1 = r1.className()
            javassist.CtClass r0 = r0.get(r1)
            return r0
        L6d:
            int r9 = r9 + 1
            goto L24
        L73:
            r0 = 0
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtBehavior getEnclosingBehavior() throws javassist.NotFoundException {
            r4 = this;
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "EnclosingMethod"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.EnclosingMethodAttribute r0 = (javassist.bytecode.EnclosingMethodAttribute) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L16
            r0 = 0
            return r0
        L16:
            r0 = r4
            javassist.ClassPool r0 = r0.classPool
            r1 = r6
            java.lang.String r1 = r1.className()
            javassist.CtClass r0 = r0.get(r1)
            r7 = r0
            r0 = r6
            java.lang.String r0 = r0.methodName()
            r8 = r0
            java.lang.String r0 = "<init>"
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
            r0 = r7
            r1 = r6
            java.lang.String r1 = r1.methodDescriptor()
            javassist.CtConstructor r0 = r0.getConstructor(r1)
            return r0
        L3c:
            java.lang.String r0 = "<clinit>"
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4c
            r0 = r7
            javassist.CtConstructor r0 = r0.getClassInitializer()
            return r0
        L4c:
            r0 = r7
            r1 = r8
            r2 = r6
            java.lang.String r2 = r2.methodDescriptor()
            javassist.CtMethod r0 = r0.getMethod(r1, r2)
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtClass makeNestedClass(java.lang.String r8, boolean r9) {
            r7 = this;
            r0 = r9
            if (r0 != 0) goto Lf
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "sorry, only nested static class is supported"
            r1.<init>(r2)
            throw r0
        Lf:
            r0 = r7
            r0.checkModify()
            r0 = r7
            javassist.ClassPool r0 = r0.classPool
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r7
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "$"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            javassist.CtClass r0 = r0.makeNestedClass(r1)
            r10 = r0
            r0 = r7
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r11 = r0
            r0 = r10
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r12 = r0
            r0 = r11
            java.lang.String r1 = "InnerClasses"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.InnerClassesAttribute r0 = (javassist.bytecode.InnerClassesAttribute) r0
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L69
            javassist.bytecode.InnerClassesAttribute r0 = new javassist.bytecode.InnerClassesAttribute
            r1 = r0
            r2 = r11
            javassist.bytecode.ConstPool r2 = r2.getConstPool()
            r1.<init>(r2)
            r13 = r0
            r0 = r11
            r1 = r13
            r0.addAttribute(r1)
        L69:
            r0 = r13
            r1 = r10
            java.lang.String r1 = r1.getName()
            r2 = r7
            java.lang.String r2 = r2.getName()
            r3 = r8
            r4 = r12
            int r4 = r4.getAccessFlags()
            r5 = -33
            r4 = r4 & r5
            r5 = 8
            r4 = r4 | r5
            r0.append(r1, r2, r3, r4)
            r0 = r12
            r1 = r13
            r2 = r12
            javassist.bytecode.ConstPool r2 = r2.getConstPool()
            r3 = 0
            javassist.bytecode.AttributeInfo r1 = r1.copy(r2, r3)
            r0.addAttribute(r1)
            r0 = r10
            return r0
    }

    private void nameReplaced() {
            r3 = this;
            r0 = r3
            javassist.CtMember$Cache r0 = r0.hasMemberCache()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L24
            r0 = r4
            javassist.CtMember r0 = r0.methodHead()
            r5 = r0
            r0 = r4
            javassist.CtMember r0 = r0.lastMethod()
            r6 = r0
        L13:
            r0 = r5
            r1 = r6
            if (r0 == r1) goto L24
            r0 = r5
            javassist.CtMember r0 = r0.next()
            r5 = r0
            r0 = r5
            r0.nameReplaced()
            goto L13
        L24:
            return
    }

    protected javassist.CtMember.Cache hasMemberCache() {
            r2 = this;
            r0 = r2
            java.lang.ref.Reference<javassist.CtMember$Cache> r0 = r0.memberCache
            if (r0 == 0) goto L12
            r0 = r2
            java.lang.ref.Reference<javassist.CtMember$Cache> r0 = r0.memberCache
            java.lang.Object r0 = r0.get()
            javassist.CtMember$Cache r0 = (javassist.CtMember.Cache) r0
            return r0
        L12:
            r0 = 0
            return r0
    }

    protected synchronized javassist.CtMember.Cache getMembers() {
            r5 = this;
            r0 = 0
            r6 = r0
            r0 = r5
            java.lang.ref.Reference<javassist.CtMember$Cache> r0 = r0.memberCache
            if (r0 == 0) goto L18
            r0 = r5
            java.lang.ref.Reference<javassist.CtMember$Cache> r0 = r0.memberCache
            java.lang.Object r0 = r0.get()
            javassist.CtMember$Cache r0 = (javassist.CtMember.Cache) r0
            r1 = r0
            r6 = r1
            if (r0 != 0) goto L37
        L18:
            javassist.CtMember$Cache r0 = new javassist.CtMember$Cache
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r5
            r1 = r6
            r0.makeFieldCache(r1)
            r0 = r5
            r1 = r6
            r0.makeBehaviorCache(r1)
            r0 = r5
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.memberCache = r1
        L37:
            r0 = r6
            return r0
    }

    private void makeFieldCache(javassist.CtMember.Cache r7) {
            r6 = this;
            r0 = r6
            r1 = 0
            javassist.bytecode.ClassFile r0 = r0.getClassFile3(r1)
            java.util.List r0 = r0.getFields()
            r8 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        L10:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L35
            r0 = r9
            java.lang.Object r0 = r0.next()
            javassist.bytecode.FieldInfo r0 = (javassist.bytecode.FieldInfo) r0
            r10 = r0
            r0 = r7
            javassist.CtField r1 = new javassist.CtField
            r2 = r1
            r3 = r10
            r4 = r6
            r2.<init>(r3, r4)
            r0.addField(r1)
            goto L10
        L35:
            return
    }

    private void makeBehaviorCache(javassist.CtMember.Cache r7) {
            r6 = this;
            r0 = r6
            r1 = 0
            javassist.bytecode.ClassFile r0 = r0.getClassFile3(r1)
            java.util.List r0 = r0.getMethods()
            r8 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        L10:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L4e
            r0 = r9
            java.lang.Object r0 = r0.next()
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0
            r10 = r0
            r0 = r10
            boolean r0 = r0.isMethod()
            if (r0 == 0) goto L3d
            r0 = r7
            javassist.CtMethod r1 = new javassist.CtMethod
            r2 = r1
            r3 = r10
            r4 = r6
            r2.<init>(r3, r4)
            r0.addMethod(r1)
            goto L4b
        L3d:
            r0 = r7
            javassist.CtConstructor r1 = new javassist.CtConstructor
            r2 = r1
            r3 = r10
            r4 = r6
            r2.<init>(r3, r4)
            r0.addConstructor(r1)
        L4b:
            goto L10
        L4e:
            return
    }

    @Override // javassist.CtClass
    public javassist.CtField[] getFields() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r3
            getFields(r0, r1)
            r0 = r4
            r1 = r4
            int r1 = r1.size()
            javassist.CtField[] r1 = new javassist.CtField[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            javassist.CtField[] r0 = (javassist.CtField[]) r0
            return r0
    }

    private static void getFields(java.util.List<javassist.CtMember> r3, javassist.CtClass r4) {
            r0 = r4
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r3
            r1 = r4
            javassist.CtClass r1 = r1.getSuperclass()     // Catch: javassist.NotFoundException -> L10
            getFields(r0, r1)     // Catch: javassist.NotFoundException -> L10
            goto L11
        L10:
            r5 = move-exception
        L11:
            r0 = r4
            javassist.CtClass[] r0 = r0.getInterfaces()     // Catch: javassist.NotFoundException -> L3b
            r5 = r0
            r0 = r5
            r6 = r0
            r0 = r6
            int r0 = r0.length     // Catch: javassist.NotFoundException -> L3b
            r7 = r0
            r0 = 0
            r8 = r0
        L1f:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L38
            r0 = r6
            r1 = r8
            r0 = r0[r1]     // Catch: javassist.NotFoundException -> L3b
            r9 = r0
            r0 = r3
            r1 = r9
            getFields(r0, r1)     // Catch: javassist.NotFoundException -> L3b
            int r8 = r8 + 1
            goto L1f
        L38:
            goto L3c
        L3b:
            r5 = move-exception
        L3c:
            r0 = r4
            javassist.CtClassType r0 = (javassist.CtClassType) r0
            javassist.CtMember$Cache r0 = r0.getMembers()
            r5 = r0
            r0 = r5
            javassist.CtMember r0 = r0.fieldHead()
            r6 = r0
            r0 = r5
            javassist.CtMember r0 = r0.lastField()
            r7 = r0
        L4f:
            r0 = r6
            r1 = r7
            if (r0 == r1) goto L6f
            r0 = r6
            javassist.CtMember r0 = r0.next()
            r6 = r0
            r0 = r6
            int r0 = r0.getModifiers()
            boolean r0 = javassist.Modifier.isPrivate(r0)
            if (r0 != 0) goto L4f
            r0 = r3
            r1 = r6
            boolean r0 = r0.add(r1)
            goto L4f
        L6f:
            return
    }

    @Override // javassist.CtClass
    public javassist.CtField getField(java.lang.String r6, java.lang.String r7) throws javassist.NotFoundException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.CtField r0 = r0.getField2(r1, r2)
            r8 = r0
            r0 = r5
            r1 = r8
            r2 = r6
            r3 = r7
            javassist.CtField r0 = r0.checkGetField(r1, r2, r3)
            return r0
    }

    private javassist.CtField checkGetField(javassist.CtField r6, java.lang.String r7, java.lang.String r8) throws javassist.NotFoundException {
            r5 = this;
            r0 = r6
            if (r0 != 0) goto L5d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "field: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " type "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9 = r0
        L39:
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " in "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L5d:
            r0 = r6
            return r0
    }

    @Override // javassist.CtClass
    javassist.CtField getField2(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            javassist.CtField r0 = r0.getDeclaredField2(r1, r2)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto Ld
            r0 = r7
            return r0
        Ld:
            r0 = r4
            javassist.CtClass[] r0 = r0.getInterfaces()     // Catch: javassist.NotFoundException -> L5a
            r8 = r0
            r0 = r8
            r9 = r0
            r0 = r9
            int r0 = r0.length     // Catch: javassist.NotFoundException -> L5a
            r10 = r0
            r0 = 0
            r11 = r0
        L1f:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L44
            r0 = r9
            r1 = r11
            r0 = r0[r1]     // Catch: javassist.NotFoundException -> L5a
            r12 = r0
            r0 = r12
            r1 = r5
            r2 = r6
            javassist.CtField r0 = r0.getField2(r1, r2)     // Catch: javassist.NotFoundException -> L5a
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L3e
            r0 = r13
            return r0
        L3e:
            int r11 = r11 + 1
            goto L1f
        L44:
            r0 = r4
            javassist.CtClass r0 = r0.getSuperclass()     // Catch: javassist.NotFoundException -> L5a
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L57
            r0 = r9
            r1 = r5
            r2 = r6
            javassist.CtField r0 = r0.getField2(r1, r2)     // Catch: javassist.NotFoundException -> L5a
            return r0
        L57:
            goto L5c
        L5a:
            r8 = move-exception
        L5c:
            r0 = 0
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtField[] getDeclaredFields() {
            r4 = this;
            r0 = r4
            javassist.CtMember$Cache r0 = r0.getMembers()
            r5 = r0
            r0 = r5
            javassist.CtMember r0 = r0.fieldHead()
            r6 = r0
            r0 = r5
            javassist.CtMember r0 = r0.lastField()
            r7 = r0
            r0 = r6
            r1 = r7
            int r0 = javassist.CtMember.Cache.count(r0, r1)
            r8 = r0
            r0 = r8
            javassist.CtField[] r0 = new javassist.CtField[r0]
            r9 = r0
            r0 = 0
            r10 = r0
        L20:
            r0 = r6
            r1 = r7
            if (r0 == r1) goto L39
            r0 = r6
            javassist.CtMember r0 = r0.next()
            r6 = r0
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            r2 = r6
            javassist.CtField r2 = (javassist.CtField) r2
            r0[r1] = r2
            goto L20
        L39:
            r0 = r9
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtField getDeclaredField(java.lang.String r5) throws javassist.NotFoundException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            javassist.CtField r0 = r0.getDeclaredField(r1, r2)
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtField getDeclaredField(java.lang.String r6, java.lang.String r7) throws javassist.NotFoundException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.CtField r0 = r0.getDeclaredField2(r1, r2)
            r8 = r0
            r0 = r5
            r1 = r8
            r2 = r6
            r3 = r7
            javassist.CtField r0 = r0.checkGetField(r1, r2, r3)
            return r0
    }

    private javassist.CtField getDeclaredField2(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = r3
            javassist.CtMember$Cache r0 = r0.getMembers()
            r6 = r0
            r0 = r6
            javassist.CtMember r0 = r0.fieldHead()
            r7 = r0
            r0 = r6
            javassist.CtMember r0 = r0.lastField()
            r8 = r0
        L11:
            r0 = r7
            r1 = r8
            if (r0 == r1) goto L41
            r0 = r7
            javassist.CtMember r0 = r0.next()
            r7 = r0
            r0 = r7
            java.lang.String r0 = r0.getName()
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11
            r0 = r5
            if (r0 == 0) goto L3b
            r0 = r5
            r1 = r7
            java.lang.String r1 = r1.getSignature()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11
        L3b:
            r0 = r7
            javassist.CtField r0 = (javassist.CtField) r0
            return r0
        L41:
            r0 = 0
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtBehavior[] getDeclaredBehaviors() {
            r4 = this;
            r0 = r4
            javassist.CtMember$Cache r0 = r0.getMembers()
            r5 = r0
            r0 = r5
            javassist.CtMember r0 = r0.consHead()
            r6 = r0
            r0 = r5
            javassist.CtMember r0 = r0.lastCons()
            r7 = r0
            r0 = r6
            r1 = r7
            int r0 = javassist.CtMember.Cache.count(r0, r1)
            r8 = r0
            r0 = r5
            javassist.CtMember r0 = r0.methodHead()
            r9 = r0
            r0 = r5
            javassist.CtMember r0 = r0.lastMethod()
            r10 = r0
            r0 = r9
            r1 = r10
            int r0 = javassist.CtMember.Cache.count(r0, r1)
            r11 = r0
            r0 = r8
            r1 = r11
            int r0 = r0 + r1
            javassist.CtBehavior[] r0 = new javassist.CtBehavior[r0]
            r12 = r0
            r0 = 0
            r13 = r0
        L38:
            r0 = r6
            r1 = r7
            if (r0 == r1) goto L51
            r0 = r6
            javassist.CtMember r0 = r0.next()
            r6 = r0
            r0 = r12
            r1 = r13
            int r13 = r13 + 1
            r2 = r6
            javassist.CtBehavior r2 = (javassist.CtBehavior) r2
            r0[r1] = r2
            goto L38
        L51:
            r0 = r9
            r1 = r10
            if (r0 == r1) goto L6f
            r0 = r9
            javassist.CtMember r0 = r0.next()
            r9 = r0
            r0 = r12
            r1 = r13
            int r13 = r13 + 1
            r2 = r9
            javassist.CtBehavior r2 = (javassist.CtBehavior) r2
            r0[r1] = r2
            goto L51
        L6f:
            r0 = r12
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtConstructor[] getConstructors() {
            r4 = this;
            r0 = r4
            javassist.CtMember$Cache r0 = r0.getMembers()
            r5 = r0
            r0 = r5
            javassist.CtMember r0 = r0.consHead()
            r6 = r0
            r0 = r5
            javassist.CtMember r0 = r0.lastCons()
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r6
            r9 = r0
        L15:
            r0 = r9
            r1 = r7
            if (r0 == r1) goto L33
            r0 = r9
            javassist.CtMember r0 = r0.next()
            r9 = r0
            r0 = r9
            javassist.CtConstructor r0 = (javassist.CtConstructor) r0
            boolean r0 = isPubCons(r0)
            if (r0 == 0) goto L15
            int r8 = r8 + 1
            goto L15
        L33:
            r0 = r8
            javassist.CtConstructor[] r0 = new javassist.CtConstructor[r0]
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r6
            r9 = r0
        L40:
            r0 = r9
            r1 = r7
            if (r0 == r1) goto L69
            r0 = r9
            javassist.CtMember r0 = r0.next()
            r9 = r0
            r0 = r9
            javassist.CtConstructor r0 = (javassist.CtConstructor) r0
            r12 = r0
            r0 = r12
            boolean r0 = isPubCons(r0)
            if (r0 == 0) goto L66
            r0 = r10
            r1 = r11
            int r11 = r11 + 1
            r2 = r12
            r0[r1] = r2
        L66:
            goto L40
        L69:
            r0 = r10
            return r0
    }

    private static boolean isPubCons(javassist.CtConstructor r2) {
            r0 = r2
            int r0 = r0.getModifiers()
            boolean r0 = javassist.Modifier.isPrivate(r0)
            if (r0 != 0) goto L15
            r0 = r2
            boolean r0 = r0.isConstructor()
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtConstructor getConstructor(java.lang.String r4) throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.CtMember$Cache r0 = r0.getMembers()
            r5 = r0
            r0 = r5
            javassist.CtMember r0 = r0.consHead()
            r6 = r0
            r0 = r5
            javassist.CtMember r0 = r0.lastCons()
            r7 = r0
        L10:
            r0 = r6
            r1 = r7
            if (r0 == r1) goto L3e
            r0 = r6
            javassist.CtMember r0 = r0.next()
            r6 = r0
            r0 = r6
            javassist.CtConstructor r0 = (javassist.CtConstructor) r0
            r8 = r0
            r0 = r8
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            java.lang.String r0 = r0.getDescriptor()
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3b
            r0 = r8
            boolean r0 = r0.isConstructor()
            if (r0 == 0) goto L3b
            r0 = r8
            return r0
        L3b:
            goto L10
        L3e:
            r0 = r3
            r1 = r4
            javassist.CtConstructor r0 = super.getConstructor(r1)
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtConstructor[] getDeclaredConstructors() {
            r4 = this;
            r0 = r4
            javassist.CtMember$Cache r0 = r0.getMembers()
            r5 = r0
            r0 = r5
            javassist.CtMember r0 = r0.consHead()
            r6 = r0
            r0 = r5
            javassist.CtMember r0 = r0.lastCons()
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r6
            r9 = r0
        L15:
            r0 = r9
            r1 = r7
            if (r0 == r1) goto L37
            r0 = r9
            javassist.CtMember r0 = r0.next()
            r9 = r0
            r0 = r9
            javassist.CtConstructor r0 = (javassist.CtConstructor) r0
            r10 = r0
            r0 = r10
            boolean r0 = r0.isConstructor()
            if (r0 == 0) goto L34
            int r8 = r8 + 1
        L34:
            goto L15
        L37:
            r0 = r8
            javassist.CtConstructor[] r0 = new javassist.CtConstructor[r0]
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r6
            r9 = r0
        L44:
            r0 = r9
            r1 = r7
            if (r0 == r1) goto L6d
            r0 = r9
            javassist.CtMember r0 = r0.next()
            r9 = r0
            r0 = r9
            javassist.CtConstructor r0 = (javassist.CtConstructor) r0
            r12 = r0
            r0 = r12
            boolean r0 = r0.isConstructor()
            if (r0 == 0) goto L6a
            r0 = r10
            r1 = r11
            int r11 = r11 + 1
            r2 = r12
            r0[r1] = r2
        L6a:
            goto L44
        L6d:
            r0 = r10
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtConstructor getClassInitializer() {
            r3 = this;
            r0 = r3
            javassist.CtMember$Cache r0 = r0.getMembers()
            r4 = r0
            r0 = r4
            javassist.CtMember r0 = r0.consHead()
            r5 = r0
            r0 = r4
            javassist.CtMember r0 = r0.lastCons()
            r6 = r0
        Lf:
            r0 = r5
            r1 = r6
            if (r0 == r1) goto L2d
            r0 = r5
            javassist.CtMember r0 = r0.next()
            r5 = r0
            r0 = r5
            javassist.CtConstructor r0 = (javassist.CtConstructor) r0
            r7 = r0
            r0 = r7
            boolean r0 = r0.isClassInitializer()
            if (r0 == 0) goto L2a
            r0 = r7
            return r0
        L2a:
            goto Lf
        L2d:
            r0 = 0
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtMethod[] getMethods() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r3
            getMethods0(r0, r1)
            r0 = r4
            java.util.Collection r0 = r0.values()
            r1 = r4
            int r1 = r1.size()
            javassist.CtMethod[] r1 = new javassist.CtMethod[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            javassist.CtMethod[] r0 = (javassist.CtMethod[]) r0
            return r0
    }

    private static void getMethods0(java.util.Map<java.lang.String, javassist.CtMember> r4, javassist.CtClass r5) {
            r0 = r5
            javassist.CtClass[] r0 = r0.getInterfaces()     // Catch: javassist.NotFoundException -> L2a
            r6 = r0
            r0 = r6
            r7 = r0
            r0 = r7
            int r0 = r0.length     // Catch: javassist.NotFoundException -> L2a
            r8 = r0
            r0 = 0
            r9 = r0
        Le:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L27
            r0 = r7
            r1 = r9
            r0 = r0[r1]     // Catch: javassist.NotFoundException -> L2a
            r10 = r0
            r0 = r4
            r1 = r10
            getMethods0(r0, r1)     // Catch: javassist.NotFoundException -> L2a
            int r9 = r9 + 1
            goto Le
        L27:
            goto L2b
        L2a:
            r6 = move-exception
        L2b:
            r0 = r5
            javassist.CtClass r0 = r0.getSuperclass()     // Catch: javassist.NotFoundException -> L3c
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L39
            r0 = r4
            r1 = r6
            getMethods0(r0, r1)     // Catch: javassist.NotFoundException -> L3c
        L39:
            goto L3d
        L3c:
            r6 = move-exception
        L3d:
            r0 = r5
            boolean r0 = r0 instanceof javassist.CtClassType
            if (r0 == 0) goto L7e
            r0 = r5
            javassist.CtClassType r0 = (javassist.CtClassType) r0
            javassist.CtMember$Cache r0 = r0.getMembers()
            r6 = r0
            r0 = r6
            javassist.CtMember r0 = r0.methodHead()
            r7 = r0
            r0 = r6
            javassist.CtMember r0 = r0.lastMethod()
            r8 = r0
        L57:
            r0 = r7
            r1 = r8
            if (r0 == r1) goto L7e
            r0 = r7
            javassist.CtMember r0 = r0.next()
            r7 = r0
            r0 = r7
            int r0 = r0.getModifiers()
            boolean r0 = javassist.Modifier.isPrivate(r0)
            if (r0 != 0) goto L57
            r0 = r4
            r1 = r7
            javassist.CtMethod r1 = (javassist.CtMethod) r1
            java.lang.String r1 = r1.getStringRep()
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
            goto L57
        L7e:
            return
    }

    @Override // javassist.CtClass
    public javassist.CtMethod getMethod(java.lang.String r6, java.lang.String r7) throws javassist.NotFoundException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.CtMethod r0 = getMethod0(r0, r1, r2)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto Ld
            r0 = r8
            return r0
        Ld:
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "(..) is not found in "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private static javassist.CtMethod getMethod0(javassist.CtClass r4, java.lang.String r5, java.lang.String r6) {
            r0 = r4
            boolean r0 = r0 instanceof javassist.CtClassType
            if (r0 == 0) goto L4d
            r0 = r4
            javassist.CtClassType r0 = (javassist.CtClassType) r0
            javassist.CtMember$Cache r0 = r0.getMembers()
            r7 = r0
            r0 = r7
            javassist.CtMember r0 = r0.methodHead()
            r8 = r0
            r0 = r7
            javassist.CtMember r0 = r0.lastMethod()
            r9 = r0
        L1b:
            r0 = r8
            r1 = r9
            if (r0 == r1) goto L4d
            r0 = r8
            javassist.CtMember r0 = r0.next()
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.getName()
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b
            r0 = r8
            javassist.CtMethod r0 = (javassist.CtMethod) r0
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            java.lang.String r0 = r0.getDescriptor()
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b
            r0 = r8
            javassist.CtMethod r0 = (javassist.CtMethod) r0
            return r0
        L4d:
            r0 = r4
            javassist.CtClass r0 = r0.getSuperclass()     // Catch: javassist.NotFoundException -> L69
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L66
            r0 = r7
            r1 = r5
            r2 = r6
            javassist.CtMethod r0 = getMethod0(r0, r1, r2)     // Catch: javassist.NotFoundException -> L69
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L66
            r0 = r8
            return r0
        L66:
            goto L6a
        L69:
            r7 = move-exception
        L6a:
            r0 = r4
            javassist.CtClass[] r0 = r0.getInterfaces()     // Catch: javassist.NotFoundException -> La2
            r7 = r0
            r0 = r7
            r8 = r0
            r0 = r8
            int r0 = r0.length     // Catch: javassist.NotFoundException -> La2
            r9 = r0
            r0 = 0
            r10 = r0
        L7a:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L9f
            r0 = r8
            r1 = r10
            r0 = r0[r1]     // Catch: javassist.NotFoundException -> La2
            r11 = r0
            r0 = r11
            r1 = r5
            r2 = r6
            javassist.CtMethod r0 = getMethod0(r0, r1, r2)     // Catch: javassist.NotFoundException -> La2
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L99
            r0 = r12
            return r0
        L99:
            int r10 = r10 + 1
            goto L7a
        L9f:
            goto La3
        La2:
            r7 = move-exception
        La3:
            r0 = 0
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtMethod[] getDeclaredMethods() {
            r3 = this;
            r0 = r3
            javassist.CtMember$Cache r0 = r0.getMembers()
            r4 = r0
            r0 = r4
            javassist.CtMember r0 = r0.methodHead()
            r5 = r0
            r0 = r4
            javassist.CtMember r0 = r0.lastMethod()
            r6 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
        L18:
            r0 = r5
            r1 = r6
            if (r0 == r1) goto L2e
            r0 = r5
            javassist.CtMember r0 = r0.next()
            r5 = r0
            r0 = r7
            r1 = r5
            boolean r0 = r0.add(r1)
            goto L18
        L2e:
            r0 = r7
            r1 = r7
            int r1 = r1.size()
            javassist.CtMethod[] r1 = new javassist.CtMethod[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            javassist.CtMethod[] r0 = (javassist.CtMethod[]) r0
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtMethod[] getDeclaredMethods(java.lang.String r4) throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.CtMember$Cache r0 = r0.getMembers()
            r5 = r0
            r0 = r5
            javassist.CtMember r0 = r0.methodHead()
            r6 = r0
            r0 = r5
            javassist.CtMember r0 = r0.lastMethod()
            r7 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
        L19:
            r0 = r6
            r1 = r7
            if (r0 == r1) goto L3b
            r0 = r6
            javassist.CtMember r0 = r0.next()
            r6 = r0
            r0 = r6
            java.lang.String r0 = r0.getName()
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L19
            r0 = r8
            r1 = r6
            boolean r0 = r0.add(r1)
            goto L19
        L3b:
            r0 = r8
            r1 = r8
            int r1 = r1.size()
            javassist.CtMethod[] r1 = new javassist.CtMethod[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            javassist.CtMethod[] r0 = (javassist.CtMethod[]) r0
            return r0
    }

    @Override // javassist.CtClass
    public javassist.CtMethod getDeclaredMethod(java.lang.String r6) throws javassist.NotFoundException {
            r5 = this;
            r0 = r5
            javassist.CtMember$Cache r0 = r0.getMembers()
            r7 = r0
            r0 = r7
            javassist.CtMember r0 = r0.methodHead()
            r8 = r0
            r0 = r7
            javassist.CtMember r0 = r0.lastMethod()
            r9 = r0
        L10:
            r0 = r8
            r1 = r9
            if (r0 == r1) goto L2b
            r0 = r8
            javassist.CtMember r0 = r0.next()
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.getName()
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L10
            r0 = r8
            javassist.CtMethod r0 = (javassist.CtMethod) r0
            return r0
        L2b:
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "(..) is not found in "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.CtClass
    public javassist.CtMethod getDeclaredMethod(java.lang.String r6, javassist.CtClass[] r7) throws javassist.NotFoundException {
            r5 = this;
            r0 = r7
            java.lang.String r0 = javassist.bytecode.Descriptor.ofParameters(r0)
            r8 = r0
            r0 = r5
            javassist.CtMember$Cache r0 = r0.getMembers()
            r9 = r0
            r0 = r9
            javassist.CtMember r0 = r0.methodHead()
            r10 = r0
            r0 = r9
            javassist.CtMember r0 = r0.lastMethod()
            r11 = r0
        L19:
            r0 = r10
            r1 = r11
            if (r0 == r1) goto L4b
            r0 = r10
            javassist.CtMember r0 = r0.next()
            r10 = r0
            r0 = r10
            java.lang.String r0 = r0.getName()
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L19
            r0 = r10
            javassist.CtMethod r0 = (javassist.CtMethod) r0
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            java.lang.String r0 = r0.getDescriptor()
            r1 = r8
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L19
            r0 = r10
            javassist.CtMethod r0 = (javassist.CtMethod) r0
            return r0
        L4b:
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "(..) is not found in "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.CtClass
    public void addField(javassist.CtField r5, java.lang.String r6) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            javassist.CtField$Initializer r2 = javassist.CtField.Initializer.byExpr(r2)
            r0.addField(r1, r2)
            return
    }

    @Override // javassist.CtClass
    public void addField(javassist.CtField r7, javassist.CtField.Initializer r8) throws javassist.CannotCompileException {
            r6 = this;
            r0 = r6
            r0.checkModify()
            r0 = r7
            javassist.CtClass r0 = r0.getDeclaringClass()
            r1 = r6
            if (r0 == r1) goto L17
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "cannot add"
            r1.<init>(r2)
            throw r0
        L17:
            r0 = r8
            if (r0 != 0) goto L20
            r0 = r7
            javassist.CtField$Initializer r0 = r0.getInit()
            r8 = r0
        L20:
            r0 = r8
            if (r0 == 0) goto L72
            r0 = r8
            r1 = r7
            java.lang.String r1 = r1.getSignature()
            r0.check(r1)
            r0 = r7
            int r0 = r0.getModifiers()
            r9 = r0
            r0 = r9
            boolean r0 = javassist.Modifier.isStatic(r0)
            if (r0 == 0) goto L72
            r0 = r9
            boolean r0 = javassist.Modifier.isFinal(r0)
            if (r0 == 0) goto L72
            r0 = r6
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()     // Catch: javassist.NotFoundException -> L70
            javassist.bytecode.ConstPool r0 = r0.getConstPool()     // Catch: javassist.NotFoundException -> L70
            r10 = r0
            r0 = r8
            r1 = r10
            r2 = r7
            javassist.CtClass r2 = r2.getType()     // Catch: javassist.NotFoundException -> L70
            int r0 = r0.getConstantValue(r1, r2)     // Catch: javassist.NotFoundException -> L70
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L6d
            r0 = r7
            javassist.bytecode.FieldInfo r0 = r0.getFieldInfo2()     // Catch: javassist.NotFoundException -> L70
            javassist.bytecode.ConstantAttribute r1 = new javassist.bytecode.ConstantAttribute     // Catch: javassist.NotFoundException -> L70
            r2 = r1
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4)     // Catch: javassist.NotFoundException -> L70
            r0.addAttribute(r1)     // Catch: javassist.NotFoundException -> L70
            r0 = 0
            r8 = r0
        L6d:
            goto L72
        L70:
            r10 = move-exception
        L72:
            r0 = r6
            javassist.CtMember$Cache r0 = r0.getMembers()
            r1 = r7
            r0.addField(r1)
            r0 = r6
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r1 = r7
            javassist.bytecode.FieldInfo r1 = r1.getFieldInfo2()
            r0.addField(r1)
            r0 = r8
            if (r0 == 0) goto Lbe
            javassist.FieldInitLink r0 = new javassist.FieldInitLink
            r1 = r0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3)
            r9 = r0
            r0 = r6
            javassist.FieldInitLink r0 = r0.fieldInitializers
            r10 = r0
            r0 = r10
            if (r0 != 0) goto La6
            r0 = r6
            r1 = r9
            r0.fieldInitializers = r1
            goto Lbe
        La6:
            r0 = r10
            javassist.FieldInitLink r0 = r0.next
            if (r0 == 0) goto Lb8
            r0 = r10
            javassist.FieldInitLink r0 = r0.next
            r10 = r0
            goto La6
        Lb8:
            r0 = r10
            r1 = r9
            r0.next = r1
        Lbe:
            return
    }

    @Override // javassist.CtClass
    public void removeField(javassist.CtField r5) throws javassist.NotFoundException {
            r4 = this;
            r0 = r4
            r0.checkModify()
            r0 = r5
            javassist.bytecode.FieldInfo r0 = r0.getFieldInfo2()
            r6 = r0
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r7 = r0
            r0 = r7
            java.util.List r0 = r0.getFields()
            r1 = r6
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L2b
            r0 = r4
            javassist.CtMember$Cache r0 = r0.getMembers()
            r1 = r5
            r0.remove(r1)
            r0 = r4
            r1 = 1
            r0.gcConstPool = r1
            goto L37
        L2b:
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r5
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L37:
            return
    }

    @Override // javassist.CtClass
    public javassist.CtConstructor makeClassInitializer() throws javassist.CannotCompileException {
            r6 = this;
            r0 = r6
            javassist.CtConstructor r0 = r0.getClassInitializer()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto Lb
            r0 = r7
            return r0
        Lb:
            r0 = r6
            r0.checkModify()
            r0 = r6
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r8 = r0
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r8
            javassist.bytecode.ConstPool r2 = r2.getConstPool()
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = 0
            r4 = 0
            r0.modifyClassConstructor(r1, r2, r3, r4)
            r0 = r6
            javassist.CtConstructor r0 = r0.getClassInitializer()
            return r0
    }

    @Override // javassist.CtClass
    public void addConstructor(javassist.CtConstructor r5) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            r0.checkModify()
            r0 = r5
            javassist.CtClass r0 = r0.getDeclaringClass()
            r1 = r4
            if (r0 == r1) goto L17
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "cannot add"
            r1.<init>(r2)
            throw r0
        L17:
            r0 = r4
            javassist.CtMember$Cache r0 = r0.getMembers()
            r1 = r5
            r0.addConstructor(r1)
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r1 = r5
            javassist.bytecode.MethodInfo r1 = r1.getMethodInfo2()
            r0.addMethod(r1)
            return
    }

    @Override // javassist.CtClass
    public void removeConstructor(javassist.CtConstructor r5) throws javassist.NotFoundException {
            r4 = this;
            r0 = r4
            r0.checkModify()
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            r6 = r0
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r7 = r0
            r0 = r7
            java.util.List r0 = r0.getMethods()
            r1 = r6
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L2b
            r0 = r4
            javassist.CtMember$Cache r0 = r0.getMembers()
            r1 = r5
            r0.remove(r1)
            r0 = r4
            r1 = 1
            r0.gcConstPool = r1
            goto L37
        L2b:
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r5
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L37:
            return
    }

    @Override // javassist.CtClass
    public void addMethod(javassist.CtMethod r6) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            r0.checkModify()
            r0 = r6
            javassist.CtClass r0 = r0.getDeclaringClass()
            r1 = r5
            if (r0 == r1) goto L17
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "bad declaring class"
            r1.<init>(r2)
            throw r0
        L17:
            r0 = r6
            int r0 = r0.getModifiers()
            r7 = r0
            r0 = r5
            int r0 = r0.getModifiers()
            r1 = 512(0x200, float:7.17E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L5b
            r0 = r7
            boolean r0 = javassist.Modifier.isProtected(r0)
            if (r0 != 0) goto L35
            r0 = r7
            boolean r0 = javassist.Modifier.isPrivate(r0)
            if (r0 == 0) goto L54
        L35:
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "an interface method must be public: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L54:
            r0 = r6
            r1 = r7
            r2 = 1
            r1 = r1 | r2
            r0.setModifiers(r1)
        L5b:
            r0 = r5
            javassist.CtMember$Cache r0 = r0.getMembers()
            r1 = r6
            r0.addMethod(r1)
            r0 = r5
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r1 = r6
            javassist.bytecode.MethodInfo r1 = r1.getMethodInfo2()
            r0.addMethod(r1)
            r0 = r7
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L82
            r0 = r5
            r1 = r5
            int r1 = r1.getModifiers()
            r2 = 1024(0x400, float:1.435E-42)
            r1 = r1 | r2
            r0.setModifiers(r1)
        L82:
            return
    }

    @Override // javassist.CtClass
    public void removeMethod(javassist.CtMethod r5) throws javassist.NotFoundException {
            r4 = this;
            r0 = r4
            r0.checkModify()
            r0 = r5
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            r6 = r0
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r7 = r0
            r0 = r7
            java.util.List r0 = r0.getMethods()
            r1 = r6
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L2b
            r0 = r4
            javassist.CtMember$Cache r0 = r0.getMembers()
            r1 = r5
            r0.remove(r1)
            r0 = r4
            r1 = 1
            r0.gcConstPool = r1
            goto L37
        L2b:
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r5
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L37:
            return
    }

    @Override // javassist.CtClass
    public byte[] getAttribute(java.lang.String r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r1 = r4
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r5
            byte[] r0 = r0.get()
            return r0
    }

    @Override // javassist.CtClass
    public void setAttribute(java.lang.String r8, byte[] r9) {
            r7 = this;
            r0 = r7
            r0.checkModify()
            r0 = r7
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r10 = r0
            r0 = r10
            javassist.bytecode.AttributeInfo r1 = new javassist.bytecode.AttributeInfo
            r2 = r1
            r3 = r10
            javassist.bytecode.ConstPool r3 = r3.getConstPool()
            r4 = r8
            r5 = r9
            r2.<init>(r3, r4, r5)
            r0.addAttribute(r1)
            return
    }

    @Override // javassist.CtClass
    public void instrument(javassist.CodeConverter r6) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            r0.checkModify()
            r0 = r5
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r7 = r0
            r0 = r7
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r8 = r0
            r0 = r7
            java.util.List r0 = r0.getMethods()
            r9 = r0
            r0 = r9
            r1 = r9
            int r1 = r1.size()
            javassist.bytecode.MethodInfo[] r1 = new javassist.bytecode.MethodInfo[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            javassist.bytecode.MethodInfo[] r0 = (javassist.bytecode.MethodInfo[]) r0
            r10 = r0
            r0 = r10
            int r0 = r0.length
            r11 = r0
            r0 = 0
            r12 = r0
        L32:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L4e
            r0 = r10
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r6
            r1 = r5
            r2 = r13
            r3 = r8
            r0.doit(r1, r2, r3)
            int r12 = r12 + 1
            goto L32
        L4e:
            return
    }

    @Override // javassist.CtClass
    public void instrument(javassist.expr.ExprEditor r5) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r4
            r0.checkModify()
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r6 = r0
            r0 = r6
            java.util.List r0 = r0.getMethods()
            r7 = r0
            r0 = r7
            r1 = r7
            int r1 = r1.size()
            javassist.bytecode.MethodInfo[] r1 = new javassist.bytecode.MethodInfo[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            javassist.bytecode.MethodInfo[] r0 = (javassist.bytecode.MethodInfo[]) r0
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r10 = r0
        L2a:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L46
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r5
            r1 = r4
            r2 = r11
            boolean r0 = r0.doit(r1, r2)
            int r10 = r10 + 1
            goto L2a
        L46:
            return
    }

    @Override // javassist.CtClass
    public void prune() {
            r5 = this;
            r0 = r5
            boolean r0 = r0.wasPruned
            if (r0 == 0) goto L8
            return
        L8:
            r0 = r5
            r1 = r5
            r2 = 1
            r3 = r2; r2 = r1; r1 = r3; 
            r2.wasFrozen = r3
            r0.wasPruned = r1
            r0 = r5
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r0.prune()
            return
    }

    @Override // javassist.CtClass
    public void rebuildClassFile() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.gcConstPool = r1
            return
    }

    @Override // javassist.CtClass
    public void toBytecode(java.io.DataOutputStream r5) throws javassist.CannotCompileException, java.io.IOException {
            r4 = this;
            r0 = r4
            boolean r0 = r0.isModified()     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            if (r0 == 0) goto L59
            r0 = r4
            java.lang.String r1 = "toBytecode"
            r0.checkPruned(r1)     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            r6 = r0
            r0 = r4
            boolean r0 = r0.gcConstPool     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            if (r0 == 0) goto L23
            r0 = r6
            r0.compact()     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            r0 = r4
            r1 = 0
            r0.gcConstPool = r1     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
        L23:
            r0 = r4
            r1 = r6
            r0.modifyClassConstructor(r1)     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            r0 = r4
            r1 = r6
            r0.modifyConstructors(r1)     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            java.lang.String r0 = javassist.CtClassType.debugDump     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            if (r0 == 0) goto L38
            r0 = r4
            r1 = r6
            r0.dumpClassFile(r1)     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
        L38:
            r0 = r6
            r1 = r5
            r0.write(r1)     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            r0 = r5
            r0.flush()     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            r0 = r4
            r1 = 0
            r0.fieldInitializers = r1     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            r0 = r4
            boolean r0 = r0.doPruning     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            if (r0 == 0) goto L56
            r0 = r6
            r0.prune()     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            r0 = r4
            r1 = 1
            r0.wasPruned = r1     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
        L56:
            goto L65
        L59:
            r0 = r4
            javassist.ClassPool r0 = r0.classPool     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            r1 = r4
            java.lang.String r1 = r1.getName()     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            r2 = r5
            r0.writeClassfile(r1, r2)     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
        L65:
            r0 = r4
            r1 = 0
            r0.getCount = r1     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            r0 = r4
            r1 = 1
            r0.wasFrozen = r1     // Catch: javassist.NotFoundException -> L72 java.io.IOException -> L7c
            goto L86
        L72:
            r6 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L7c:
            r6 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L86:
            return
    }

    private void dumpClassFile(javassist.bytecode.ClassFile r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            java.lang.String r1 = javassist.CtClassType.debugDump
            java.io.DataOutputStream r0 = r0.makeFileOutput(r1)
            r5 = r0
            r0 = r4
            r1 = r5
            r0.write(r1)     // Catch: java.lang.Throwable -> L14
            r0 = r5
            r0.close()
            goto L1b
        L14:
            r6 = move-exception
            r0 = r5
            r0.close()
            r0 = r6
            throw r0
        L1b:
            return
    }

    private void checkPruned(java.lang.String r6) {
            r5 = this;
            r0 = r5
            boolean r0 = r0.wasPruned
            if (r0 == 0) goto L30
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "(): "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " was pruned."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L30:
            return
    }

    @Override // javassist.CtClass
    public boolean stopPruning(boolean r4) {
            r3 = this;
            r0 = r3
            boolean r0 = r0.doPruning
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r5 = r0
            r0 = r3
            r1 = r4
            if (r1 != 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            r0.doPruning = r1
            r0 = r5
            return r0
    }

    private void modifyClassConstructor(javassist.bytecode.ClassFile r7) throws javassist.CannotCompileException, javassist.NotFoundException {
            r6 = this;
            r0 = r6
            javassist.FieldInitLink r0 = r0.fieldInitializers
            if (r0 != 0) goto L8
            return
        L8:
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r7
            javassist.bytecode.ConstPool r2 = r2.getConstPool()
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4)
            r8 = r0
            javassist.compiler.Javac r0 = new javassist.compiler.Javac
            r1 = r0
            r2 = r8
            r3 = r6
            r1.<init>(r2, r3)
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r6
            javassist.FieldInitLink r0 = r0.fieldInitializers
            r12 = r0
        L2c:
            r0 = r12
            if (r0 == 0) goto L71
            r0 = r12
            javassist.CtField r0 = r0.field
            r13 = r0
            r0 = r13
            int r0 = r0.getModifiers()
            boolean r0 = javassist.Modifier.isStatic(r0)
            if (r0 == 0) goto L67
            r0 = 1
            r11 = r0
            r0 = r12
            javassist.CtField$Initializer r0 = r0.init
            r1 = r13
            javassist.CtClass r1 = r1.getType()
            r2 = r13
            java.lang.String r2 = r2.getName()
            r3 = r8
            r4 = r9
            int r0 = r0.compileIfStatic(r1, r2, r3, r4)
            r14 = r0
            r0 = r10
            r1 = r14
            if (r0 >= r1) goto L67
            r0 = r14
            r10 = r0
        L67:
            r0 = r12
            javassist.FieldInitLink r0 = r0.next
            r12 = r0
            goto L2c
        L71:
            r0 = r11
            if (r0 == 0) goto L7f
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            r4 = 0
            r0.modifyClassConstructor(r1, r2, r3, r4)
        L7f:
            return
    }

    private void modifyClassConstructor(javassist.bytecode.ClassFile r7, javassist.bytecode.Bytecode r8, int r9, int r10) throws javassist.CannotCompileException {
            r6 = this;
            r0 = r7
            javassist.bytecode.MethodInfo r0 = r0.getStaticInitializer()
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L63
            r0 = r8
            r1 = 177(0xb1, float:2.48E-43)
            r0.add(r1)
            r0 = r8
            r1 = r9
            r0.setMaxStack(r1)
            r0 = r8
            r1 = r10
            r0.setMaxLocals(r1)
            javassist.bytecode.MethodInfo r0 = new javassist.bytecode.MethodInfo
            r1 = r0
            r2 = r7
            javassist.bytecode.ConstPool r2 = r2.getConstPool()
            java.lang.String r3 = "<clinit>"
            java.lang.String r4 = "()V"
            r1.<init>(r2, r3, r4)
            r11 = r0
            r0 = r11
            r1 = 8
            r0.setAccessFlags(r1)
            r0 = r11
            r1 = r8
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()
            r0.setCodeAttribute(r1)
            r0 = r7
            r1 = r11
            r0.addMethod(r1)
            r0 = r6
            javassist.CtMember$Cache r0 = r0.hasMemberCache()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L60
            r0 = r12
            javassist.CtConstructor r1 = new javassist.CtConstructor
            r2 = r1
            r3 = r11
            r4 = r6
            r2.<init>(r3, r4)
            r0.addConstructor(r1)
        L60:
            goto Lce
        L63:
            r0 = r11
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L7a
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "empty <clinit>"
            r1.<init>(r2)
            throw r0
        L7a:
            r0 = r12
            javassist.bytecode.CodeIterator r0 = r0.iterator()     // Catch: javassist.bytecode.BadBytecode -> Lc2
            r13 = r0
            r0 = r13
            r1 = r8
            byte[] r1 = r1.get()     // Catch: javassist.bytecode.BadBytecode -> Lc2
            int r0 = r0.insertEx(r1)     // Catch: javassist.bytecode.BadBytecode -> Lc2
            r14 = r0
            r0 = r13
            r1 = r8
            javassist.bytecode.ExceptionTable r1 = r1.getExceptionTable()     // Catch: javassist.bytecode.BadBytecode -> Lc2
            r2 = r14
            r0.insert(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> Lc2
            r0 = r12
            int r0 = r0.getMaxStack()     // Catch: javassist.bytecode.BadBytecode -> Lc2
            r15 = r0
            r0 = r15
            r1 = r9
            if (r0 >= r1) goto Laa
            r0 = r12
            r1 = r9
            r0.setMaxStack(r1)     // Catch: javassist.bytecode.BadBytecode -> Lc2
        Laa:
            r0 = r12
            int r0 = r0.getMaxLocals()     // Catch: javassist.bytecode.BadBytecode -> Lc2
            r16 = r0
            r0 = r16
            r1 = r10
            if (r0 >= r1) goto Lbf
            r0 = r12
            r1 = r10
            r0.setMaxLocals(r1)     // Catch: javassist.bytecode.BadBytecode -> Lc2
        Lbf:
            goto Lce
        Lc2:
            r13 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
        Lce:
            r0 = r11
            r1 = r6
            javassist.ClassPool r1 = r1.classPool     // Catch: javassist.bytecode.BadBytecode -> Ldb
            r2 = r7
            r0.rebuildStackMapIf6(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> Ldb
            goto Le7
        Ldb:
            r12 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            throw r0
        Le7:
            return
    }

    private void modifyConstructors(javassist.bytecode.ClassFile r7) throws javassist.CannotCompileException, javassist.NotFoundException {
            r6 = this;
            r0 = r6
            javassist.FieldInitLink r0 = r0.fieldInitializers
            if (r0 != 0) goto L8
            return
        L8:
            r0 = r7
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r8 = r0
            r0 = r7
            java.util.List r0 = r0.getMethods()
            r9 = r0
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        L1a:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L91
            r0 = r10
            java.lang.Object r0 = r0.next()
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0
            r11 = r0
            r0 = r11
            boolean r0 = r0.isConstructor()
            if (r0 == 0) goto L8e
            r0 = r11
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L8e
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode     // Catch: javassist.bytecode.BadBytecode -> L82
            r1 = r0
            r2 = r8
            r3 = 0
            r4 = r12
            int r4 = r4.getMaxLocals()     // Catch: javassist.bytecode.BadBytecode -> L82
            r1.<init>(r2, r3, r4)     // Catch: javassist.bytecode.BadBytecode -> L82
            r13 = r0
            r0 = r11
            java.lang.String r0 = r0.getDescriptor()     // Catch: javassist.bytecode.BadBytecode -> L82
            r1 = r6
            javassist.ClassPool r1 = r1.classPool     // Catch: javassist.bytecode.BadBytecode -> L82
            javassist.CtClass[] r0 = javassist.bytecode.Descriptor.getParameterTypes(r0, r1)     // Catch: javassist.bytecode.BadBytecode -> L82
            r14 = r0
            r0 = r6
            r1 = r13
            r2 = r14
            int r0 = r0.makeFieldInitializer(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L82
            r15 = r0
            r0 = r12
            r1 = r13
            r2 = r15
            insertAuxInitializer(r0, r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L82
            r0 = r11
            r1 = r6
            javassist.ClassPool r1 = r1.classPool     // Catch: javassist.bytecode.BadBytecode -> L82
            r2 = r7
            r0.rebuildStackMapIf6(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> L82
            goto L8e
        L82:
            r13 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
        L8e:
            goto L1a
        L91:
            return
    }

    private static void insertAuxInitializer(javassist.bytecode.CodeAttribute r4, javassist.bytecode.Bytecode r5, int r6) throws javassist.bytecode.BadBytecode {
            r0 = r4
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r7 = r0
            r0 = r7
            int r0 = r0.skipSuperConstructor()
            r8 = r0
            r0 = r8
            if (r0 >= 0) goto L1c
            r0 = r7
            int r0 = r0.skipThisConstructor()
            r8 = r0
            r0 = r8
            if (r0 < 0) goto L1c
            return
        L1c:
            r0 = r7
            r1 = r5
            byte[] r1 = r1.get()
            int r0 = r0.insertEx(r1)
            r9 = r0
            r0 = r7
            r1 = r5
            javassist.bytecode.ExceptionTable r1 = r1.getExceptionTable()
            r2 = r9
            r0.insert(r1, r2)
            r0 = r4
            int r0 = r0.getMaxStack()
            r10 = r0
            r0 = r10
            r1 = r6
            if (r0 >= r1) goto L41
            r0 = r4
            r1 = r6
            r0.setMaxStack(r1)
        L41:
            return
    }

    private int makeFieldInitializer(javassist.bytecode.Bytecode r8, javassist.CtClass[] r9) throws javassist.CannotCompileException, javassist.NotFoundException {
            r7 = this;
            r0 = 0
            r10 = r0
            javassist.compiler.Javac r0 = new javassist.compiler.Javac
            r1 = r0
            r2 = r8
            r3 = r7
            r1.<init>(r2, r3)
            r11 = r0
            r0 = r11
            r1 = r9
            r2 = 0
            int r0 = r0.recordParams(r1, r2)     // Catch: javassist.compiler.CompileError -> L18
            goto L24
        L18:
            r12 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r12
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r7
            javassist.FieldInitLink r0 = r0.fieldInitializers
            r12 = r0
        L2a:
            r0 = r12
            if (r0 == 0) goto L6c
            r0 = r12
            javassist.CtField r0 = r0.field
            r13 = r0
            r0 = r13
            int r0 = r0.getModifiers()
            boolean r0 = javassist.Modifier.isStatic(r0)
            if (r0 != 0) goto L62
            r0 = r12
            javassist.CtField$Initializer r0 = r0.init
            r1 = r13
            javassist.CtClass r1 = r1.getType()
            r2 = r13
            java.lang.String r2 = r2.getName()
            r3 = r8
            r4 = r9
            r5 = r11
            int r0 = r0.compile(r1, r2, r3, r4, r5)
            r14 = r0
            r0 = r10
            r1 = r14
            if (r0 >= r1) goto L62
            r0 = r14
            r10 = r0
        L62:
            r0 = r12
            javassist.FieldInitLink r0 = r0.next
            r12 = r0
            goto L2a
        L6c:
            r0 = r10
            return r0
    }

    java.util.Map<javassist.CtMethod, java.lang.String> getHiddenMethods() {
            r4 = this;
            r0 = r4
            java.util.Map<javassist.CtMethod, java.lang.String> r0 = r0.hiddenMethods
            if (r0 != 0) goto L12
            r0 = r4
            java.util.Hashtable r1 = new java.util.Hashtable
            r2 = r1
            r2.<init>()
            r0.hiddenMethods = r1
        L12:
            r0 = r4
            java.util.Map<javassist.CtMethod, java.lang.String> r0 = r0.hiddenMethods
            return r0
    }

    int getUniqueNumber() {
            r5 = this;
            r0 = r5
            r1 = r0
            int r1 = r1.uniqueNumberSeed
            r2 = r1; r1 = r0; r0 = r2; 
            r3 = 1
            int r2 = r2 + r3
            r1.uniqueNumberSeed = r2
            return r0
    }

    @Override // javassist.CtClass
    public java.lang.String makeUniqueName(java.lang.String r5) {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r4
            r1 = r6
            r0.makeMemberList(r1)
            r0 = r6
            java.util.Set r0 = r0.keySet()
            r7 = r0
            r0 = r7
            int r0 = r0.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r8 = r0
            r0 = r7
            r1 = r8
            java.lang.Object[] r0 = r0.toArray(r1)
            r0 = r5
            r1 = r8
            boolean r0 = notFindInArray(r0, r1)
            if (r0 == 0) goto L33
            r0 = r5
            return r0
        L33:
            r0 = 100
            r9 = r0
        L37:
            r0 = r9
            r1 = 999(0x3e7, float:1.4E-42)
            if (r0 <= r1) goto L4a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "too many unique name"
            r1.<init>(r2)
            throw r0
        L4a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int r9 = r9 + 1
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10 = r0
            r0 = r10
            r1 = r8
            boolean r0 = notFindInArray(r0, r1)
            if (r0 == 0) goto L37
            r0 = r10
            return r0
    }

    private static boolean notFindInArray(java.lang.String r3, java.lang.String[] r4) {
            r0 = r4
            int r0 = r0.length
            r5 = r0
            r0 = 0
            r6 = r0
        L5:
            r0 = r6
            r1 = r5
            if (r0 >= r1) goto L1c
            r0 = r4
            r1 = r6
            r0 = r0[r1]
            r1 = r3
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L16
            r0 = 0
            return r0
        L16:
            int r6 = r6 + 1
            goto L5
        L1c:
            r0 = 1
            return r0
    }

    private void makeMemberList(java.util.Map<java.lang.Object, javassist.CtClassType> r5) {
            r4 = this;
            r0 = r4
            int r0 = r0.getModifiers()
            r6 = r0
            r0 = r6
            boolean r0 = javassist.Modifier.isAbstract(r0)
            if (r0 != 0) goto L13
            r0 = r6
            boolean r0 = javassist.Modifier.isInterface(r0)
            if (r0 == 0) goto L51
        L13:
            r0 = r4
            javassist.CtClass[] r0 = r0.getInterfaces()     // Catch: javassist.NotFoundException -> L50
            r7 = r0
            r0 = r7
            r8 = r0
            r0 = r8
            int r0 = r0.length     // Catch: javassist.NotFoundException -> L50
            r9 = r0
            r0 = 0
            r10 = r0
        L23:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L4d
            r0 = r8
            r1 = r10
            r0 = r0[r1]     // Catch: javassist.NotFoundException -> L50
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L47
            r0 = r11
            boolean r0 = r0 instanceof javassist.CtClassType     // Catch: javassist.NotFoundException -> L50
            if (r0 == 0) goto L47
            r0 = r11
            javassist.CtClassType r0 = (javassist.CtClassType) r0     // Catch: javassist.NotFoundException -> L50
            r1 = r5
            r0.makeMemberList(r1)     // Catch: javassist.NotFoundException -> L50
        L47:
            int r10 = r10 + 1
            goto L23
        L4d:
            goto L51
        L50:
            r7 = move-exception
        L51:
            r0 = r4
            javassist.CtClass r0 = r0.getSuperclass()     // Catch: javassist.NotFoundException -> L6c
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L69
            r0 = r7
            boolean r0 = r0 instanceof javassist.CtClassType     // Catch: javassist.NotFoundException -> L6c
            if (r0 == 0) goto L69
            r0 = r7
            javassist.CtClassType r0 = (javassist.CtClassType) r0     // Catch: javassist.NotFoundException -> L6c
            r1 = r5
            r0.makeMemberList(r1)     // Catch: javassist.NotFoundException -> L6c
        L69:
            goto L6d
        L6c:
            r7 = move-exception
        L6d:
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            java.util.List r0 = r0.getMethods()
            r7 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L7d:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto La3
            r0 = r8
            java.lang.Object r0 = r0.next()
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0
            r9 = r0
            r0 = r5
            r1 = r9
            java.lang.String r1 = r1.getName()
            r2 = r4
            java.lang.Object r0 = r0.put(r1, r2)
            goto L7d
        La3:
            r0 = r4
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            java.util.List r0 = r0.getFields()
            r8 = r0
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        Lb5:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Ldb
            r0 = r9
            java.lang.Object r0 = r0.next()
            javassist.bytecode.FieldInfo r0 = (javassist.bytecode.FieldInfo) r0
            r10 = r0
            r0 = r5
            r1 = r10
            java.lang.String r1 = r1.getName()
            r2 = r4
            java.lang.Object r0 = r0.put(r1, r2)
            goto Lb5
        Ldb:
            return
    }
}
