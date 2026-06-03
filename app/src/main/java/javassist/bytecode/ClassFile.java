package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ClassFile.class */
public final class ClassFile {
    int major;
    int minor;
    javassist.bytecode.ConstPool constPool;
    int thisClass;
    int accessFlags;
    int superClass;
    int[] interfaces;
    java.util.List<javassist.bytecode.FieldInfo> fields;
    java.util.List<javassist.bytecode.MethodInfo> methods;
    java.util.List<javassist.bytecode.AttributeInfo> attributes;
    java.lang.String thisclassname;
    java.lang.String[] cachedInterfaces;
    java.lang.String cachedSuperclass;
    public static final int JAVA_1 = 45;
    public static final int JAVA_2 = 46;
    public static final int JAVA_3 = 47;
    public static final int JAVA_4 = 48;
    public static final int JAVA_5 = 49;
    public static final int JAVA_6 = 50;
    public static final int JAVA_7 = 51;
    public static final int JAVA_8 = 52;
    public static final int JAVA_9 = 53;
    public static final int JAVA_10 = 54;
    public static final int JAVA_11 = 55;
    public static final int MAJOR_VERSION = 0;

    public ClassFile(java.io.DataInputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.read(r1)
            return
    }

    public ClassFile(boolean r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            int r1 = javassist.bytecode.ClassFile.MAJOR_VERSION
            r0.major = r1
            r0 = r6
            r1 = 0
            r0.minor = r1
            r0 = r6
            javassist.bytecode.ConstPool r1 = new javassist.bytecode.ConstPool
            r2 = r1
            r3 = r8
            r2.<init>(r3)
            r0.constPool = r1
            r0 = r6
            r1 = r6
            javassist.bytecode.ConstPool r1 = r1.constPool
            int r1 = r1.getThisClassInfo()
            r0.thisClass = r1
            r0 = r7
            if (r0 == 0) goto L35
            r0 = r6
            r1 = 1536(0x600, float:2.152E-42)
            r0.accessFlags = r1
            goto L3b
        L35:
            r0 = r6
            r1 = 32
            r0.accessFlags = r1
        L3b:
            r0 = r6
            r1 = r9
            r0.initSuperclass(r1)
            r0 = r6
            r1 = 0
            r0.interfaces = r1
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.fields = r1
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.methods = r1
            r0 = r6
            r1 = r8
            r0.thisclassname = r1
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.attributes = r1
            r0 = r6
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            javassist.bytecode.SourceFileAttribute r1 = new javassist.bytecode.SourceFileAttribute
            r2 = r1
            r3 = r6
            javassist.bytecode.ConstPool r3 = r3.constPool
            r4 = r6
            java.lang.String r4 = r4.thisclassname
            java.lang.String r4 = getSourcefileName(r4)
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            return
    }

    private void initSuperclass(java.lang.String r5) {
            r4 = this;
            r0 = r5
            if (r0 == 0) goto L18
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            int r1 = r1.addClassInfo(r2)
            r0.superClass = r1
            r0 = r4
            r1 = r5
            r0.cachedSuperclass = r1
            goto L2b
        L18:
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            java.lang.String r2 = "java.lang.Object"
            int r1 = r1.addClassInfo(r2)
            r0.superClass = r1
            r0 = r4
            java.lang.String r1 = "java.lang.Object"
            r0.cachedSuperclass = r1
        L2b:
            return
    }

    private static java.lang.String getSourcefileName(java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r5
            java.lang.String r2 = "^.*\\."
            java.lang.String r3 = ""
            java.lang.String r1 = r1.replaceAll(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".java"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void compact() {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.compact0()
            r5 = r0
            r0 = r4
            java.util.List<javassist.bytecode.MethodInfo> r0 = r0.methods
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        Lf:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2a
            r0 = r6
            java.lang.Object r0 = r0.next()
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0
            r7 = r0
            r0 = r7
            r1 = r5
            r0.compact(r1)
            goto Lf
        L2a:
            r0 = r4
            java.util.List<javassist.bytecode.FieldInfo> r0 = r0.fields
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L34:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L4f
            r0 = r6
            java.lang.Object r0 = r0.next()
            javassist.bytecode.FieldInfo r0 = (javassist.bytecode.FieldInfo) r0
            r7 = r0
            r0 = r7
            r1 = r5
            r0.compact(r1)
            goto L34
        L4f:
            r0 = r4
            r1 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r1 = r1.attributes
            r2 = r5
            java.util.List r1 = javassist.bytecode.AttributeInfo.copyAll(r1, r2)
            r0.attributes = r1
            r0 = r4
            r1 = r5
            r0.constPool = r1
            return
    }

    private javassist.bytecode.ConstPool compact0() {
            r7 = this;
            javassist.bytecode.ConstPool r0 = new javassist.bytecode.ConstPool
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.thisclassname
            r1.<init>(r2)
            r8 = r0
            r0 = r7
            r1 = r8
            int r1 = r1.getThisClassInfo()
            r0.thisClass = r1
            r0 = r7
            java.lang.String r0 = r0.getSuperclass()
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L29
            r0 = r7
            r1 = r8
            r2 = r7
            java.lang.String r2 = r2.getSuperclass()
            int r1 = r1.addClassInfo(r2)
            r0.superClass = r1
        L29:
            r0 = r7
            int[] r0 = r0.interfaces
            if (r0 == 0) goto L58
            r0 = 0
            r10 = r0
        L32:
            r0 = r10
            r1 = r7
            int[] r1 = r1.interfaces
            int r1 = r1.length
            if (r0 >= r1) goto L58
            r0 = r7
            int[] r0 = r0.interfaces
            r1 = r10
            r2 = r8
            r3 = r7
            javassist.bytecode.ConstPool r3 = r3.constPool
            r4 = r7
            int[] r4 = r4.interfaces
            r5 = r10
            r4 = r4[r5]
            java.lang.String r3 = r3.getClassInfo(r4)
            int r2 = r2.addClassInfo(r3)
            r0[r1] = r2
            int r10 = r10 + 1
            goto L32
        L58:
            r0 = r8
            return r0
    }

    public void prune() {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.compact0()
            r5 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r4
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L27
            r0 = r7
            r1 = r5
            r2 = 0
            javassist.bytecode.AttributeInfo r0 = r0.copy(r1, r2)
            r7 = r0
            r0 = r6
            r1 = r7
            boolean r0 = r0.add(r1)
        L27:
            r0 = r4
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L46
            r0 = r8
            r1 = r5
            r2 = 0
            javassist.bytecode.AttributeInfo r0 = r0.copy(r1, r2)
            r8 = r0
            r0 = r6
            r1 = r8
            boolean r0 = r0.add(r1)
        L46:
            r0 = r4
            java.lang.String r1 = "Signature"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L65
            r0 = r9
            r1 = r5
            r2 = 0
            javassist.bytecode.AttributeInfo r0 = r0.copy(r1, r2)
            r9 = r0
            r0 = r6
            r1 = r9
            boolean r0 = r0.add(r1)
        L65:
            r0 = r4
            java.util.List<javassist.bytecode.MethodInfo> r0 = r0.methods
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        L70:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L8f
            r0 = r10
            java.lang.Object r0 = r0.next()
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0
            r11 = r0
            r0 = r11
            r1 = r5
            r0.prune(r1)
            goto L70
        L8f:
            r0 = r4
            java.util.List<javassist.bytecode.FieldInfo> r0 = r0.fields
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        L9a:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lb9
            r0 = r10
            java.lang.Object r0 = r0.next()
            javassist.bytecode.FieldInfo r0 = (javassist.bytecode.FieldInfo) r0
            r11 = r0
            r0 = r11
            r1 = r5
            r0.prune(r1)
            goto L9a
        Lb9:
            r0 = r4
            r1 = r6
            r0.attributes = r1
            r0 = r4
            r1 = r5
            r0.constPool = r1
            return
    }

    public javassist.bytecode.ConstPool getConstPool() {
            r2 = this;
            r0 = r2
            javassist.bytecode.ConstPool r0 = r0.constPool
            return r0
    }

    public boolean isInterface() {
            r3 = this;
            r0 = r3
            int r0 = r0.accessFlags
            r1 = 512(0x200, float:7.17E-43)
            r0 = r0 & r1
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public boolean isFinal() {
            r3 = this;
            r0 = r3
            int r0 = r0.accessFlags
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public boolean isAbstract() {
            r3 = this;
            r0 = r3
            int r0 = r0.accessFlags
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r1
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public int getAccessFlags() {
            r2 = this;
            r0 = r2
            int r0 = r0.accessFlags
            return r0
    }

    public void setAccessFlags(int r4) {
            r3 = this;
            r0 = r4
            r1 = 512(0x200, float:7.17E-43)
            r0 = r0 & r1
            if (r0 != 0) goto Ld
            r0 = r4
            r1 = 32
            r0 = r0 | r1
            r4 = r0
        Ld:
            r0 = r3
            r1 = r4
            r0.accessFlags = r1
            return
    }

    public int getInnerAccessFlags() {
            r4 = this;
            r0 = r4
            java.lang.String r1 = "InnerClasses"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.InnerClassesAttribute r0 = (javassist.bytecode.InnerClassesAttribute) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L10
            r0 = -1
            return r0
        L10:
            r0 = r4
            java.lang.String r0 = r0.getName()
            r6 = r0
            r0 = r5
            int r0 = r0.tableLength()
            r7 = r0
            r0 = 0
            r8 = r0
        L1d:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L3d
            r0 = r6
            r1 = r5
            r2 = r8
            java.lang.String r1 = r1.innerClass(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r0 = r5
            r1 = r8
            int r0 = r0.accessFlags(r1)
            return r0
        L37:
            int r8 = r8 + 1
            goto L1d
        L3d:
            r0 = -1
            return r0
    }

    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.thisclassname
            return r0
    }

    public void setName(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            java.lang.String r1 = r1.thisclassname
            r2 = r5
            r0.renameClass(r1, r2)
            return
    }

    public java.lang.String getSuperclass() {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.cachedSuperclass
            if (r0 != 0) goto L16
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r4
            int r2 = r2.superClass
            java.lang.String r1 = r1.getClassInfo(r2)
            r0.cachedSuperclass = r1
        L16:
            r0 = r4
            java.lang.String r0 = r0.cachedSuperclass
            return r0
    }

    public int getSuperclassId() {
            r2 = this;
            r0 = r2
            int r0 = r0.superClass
            return r0
    }

    public void setSuperclass(java.lang.String r5) throws javassist.CannotCompileException {
            r4 = this;
            r0 = r5
            if (r0 != 0) goto L7
            java.lang.String r0 = "java.lang.Object"
            r5 = r0
        L7:
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool     // Catch: javassist.bytecode.BadBytecode -> L3b
            r2 = r5
            int r1 = r1.addClassInfo(r2)     // Catch: javassist.bytecode.BadBytecode -> L3b
            r0.superClass = r1     // Catch: javassist.bytecode.BadBytecode -> L3b
            r0 = r4
            java.util.List<javassist.bytecode.MethodInfo> r0 = r0.methods     // Catch: javassist.bytecode.BadBytecode -> L3b
            java.util.Iterator r0 = r0.iterator()     // Catch: javassist.bytecode.BadBytecode -> L3b
            r6 = r0
        L1d:
            r0 = r6
            boolean r0 = r0.hasNext()     // Catch: javassist.bytecode.BadBytecode -> L3b
            if (r0 == 0) goto L38
            r0 = r6
            java.lang.Object r0 = r0.next()     // Catch: javassist.bytecode.BadBytecode -> L3b
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0     // Catch: javassist.bytecode.BadBytecode -> L3b
            r7 = r0
            r0 = r7
            r1 = r5
            r0.setSuperclass(r1)     // Catch: javassist.bytecode.BadBytecode -> L3b
            goto L1d
        L38:
            goto L45
        L3b:
            r6 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L45:
            r0 = r4
            r1 = r5
            r0.cachedSuperclass = r1
            return
    }

    public final void renameClass(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            r0 = r6
            r1 = r7
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L9
            return
        L9:
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.thisclassname
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L19
            r0 = r5
            r1 = r7
            r0.thisclassname = r1
        L19:
            r0 = r6
            java.lang.String r0 = javassist.bytecode.Descriptor.toJvmName(r0)
            r6 = r0
            r0 = r7
            java.lang.String r0 = javassist.bytecode.Descriptor.toJvmName(r0)
            r7 = r0
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r6
            r2 = r7
            r0.renameClass(r1, r2)
            r0 = r5
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r6
            r2 = r7
            javassist.bytecode.AttributeInfo.renameClass(r0, r1, r2)
            r0 = r5
            java.util.List<javassist.bytecode.MethodInfo> r0 = r0.methods
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L3f:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L73
            r0 = r8
            java.lang.Object r0 = r0.next()
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0
            r9 = r0
            r0 = r9
            java.lang.String r0 = r0.getDescriptor()
            r10 = r0
            r0 = r9
            r1 = r10
            r2 = r6
            r3 = r7
            java.lang.String r1 = javassist.bytecode.Descriptor.rename(r1, r2, r3)
            r0.setDescriptor(r1)
            r0 = r9
            java.util.List r0 = r0.getAttributes()
            r1 = r6
            r2 = r7
            javassist.bytecode.AttributeInfo.renameClass(r0, r1, r2)
            goto L3f
        L73:
            r0 = r5
            java.util.List<javassist.bytecode.FieldInfo> r0 = r0.fields
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L7d:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lb1
            r0 = r8
            java.lang.Object r0 = r0.next()
            javassist.bytecode.FieldInfo r0 = (javassist.bytecode.FieldInfo) r0
            r9 = r0
            r0 = r9
            java.lang.String r0 = r0.getDescriptor()
            r10 = r0
            r0 = r9
            r1 = r10
            r2 = r6
            r3 = r7
            java.lang.String r1 = javassist.bytecode.Descriptor.rename(r1, r2, r3)
            r0.setDescriptor(r1)
            r0 = r9
            java.util.List r0 = r0.getAttributes()
            r1 = r6
            r2 = r7
            javassist.bytecode.AttributeInfo.renameClass(r0, r1, r2)
            goto L7d
        Lb1:
            return
    }

    public final void renameClass(java.util.Map<java.lang.String, java.lang.String> r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            java.lang.String r1 = r1.thisclassname
            java.lang.String r1 = javassist.bytecode.Descriptor.toJvmName(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L1d
            r0 = r4
            r1 = r6
            java.lang.String r1 = javassist.bytecode.Descriptor.toJavaName(r1)
            r0.thisclassname = r1
        L1d:
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r5
            r0.renameClass(r1)
            r0 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r5
            javassist.bytecode.AttributeInfo.renameClass(r0, r1)
            r0 = r4
            java.util.List<javassist.bytecode.MethodInfo> r0 = r0.methods
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L37:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L69
            r0 = r7
            java.lang.Object r0 = r0.next()
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.getDescriptor()
            r9 = r0
            r0 = r8
            r1 = r9
            r2 = r5
            java.lang.String r1 = javassist.bytecode.Descriptor.rename(r1, r2)
            r0.setDescriptor(r1)
            r0 = r8
            java.util.List r0 = r0.getAttributes()
            r1 = r5
            javassist.bytecode.AttributeInfo.renameClass(r0, r1)
            goto L37
        L69:
            r0 = r4
            java.util.List<javassist.bytecode.FieldInfo> r0 = r0.fields
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L73:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto La5
            r0 = r7
            java.lang.Object r0 = r0.next()
            javassist.bytecode.FieldInfo r0 = (javassist.bytecode.FieldInfo) r0
            r8 = r0
            r0 = r8
            java.lang.String r0 = r0.getDescriptor()
            r9 = r0
            r0 = r8
            r1 = r9
            r2 = r5
            java.lang.String r1 = javassist.bytecode.Descriptor.rename(r1, r2)
            r0.setDescriptor(r1)
            r0 = r8
            java.util.List r0 = r0.getAttributes()
            r1 = r5
            javassist.bytecode.AttributeInfo.renameClass(r0, r1)
            goto L73
        La5:
            return
    }

    public final void getRefClasses(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r4
            r0.renameClass(r1)
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r4
            javassist.bytecode.AttributeInfo.getRefClasses(r0, r1)
            r0 = r3
            java.util.List<javassist.bytecode.MethodInfo> r0 = r0.methods
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L1a:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L45
            r0 = r5
            java.lang.Object r0 = r0.next()
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0
            r6 = r0
            r0 = r6
            java.lang.String r0 = r0.getDescriptor()
            r7 = r0
            r0 = r7
            r1 = r4
            java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1)
            r0 = r6
            java.util.List r0 = r0.getAttributes()
            r1 = r4
            javassist.bytecode.AttributeInfo.getRefClasses(r0, r1)
            goto L1a
        L45:
            r0 = r3
            java.util.List<javassist.bytecode.FieldInfo> r0 = r0.fields
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L4f:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L7a
            r0 = r5
            java.lang.Object r0 = r0.next()
            javassist.bytecode.FieldInfo r0 = (javassist.bytecode.FieldInfo) r0
            r6 = r0
            r0 = r6
            java.lang.String r0 = r0.getDescriptor()
            r7 = r0
            r0 = r7
            r1 = r4
            java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1)
            r0 = r6
            java.util.List r0 = r0.getAttributes()
            r1 = r4
            javassist.bytecode.AttributeInfo.getRefClasses(r0, r1)
            goto L4f
        L7a:
            return
    }

    public java.lang.String[] getInterfaces() {
            r6 = this;
            r0 = r6
            java.lang.String[] r0 = r0.cachedInterfaces
            if (r0 == 0) goto Lc
            r0 = r6
            java.lang.String[] r0 = r0.cachedInterfaces
            return r0
        Lc:
            r0 = 0
            r7 = r0
            r0 = r6
            int[] r0 = r0.interfaces
            if (r0 != 0) goto L1d
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r7 = r0
            goto L49
        L1d:
            r0 = r6
            int[] r0 = r0.interfaces
            int r0 = r0.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r8 = r0
            r0 = 0
            r9 = r0
        L28:
            r0 = r9
            r1 = r6
            int[] r1 = r1.interfaces
            int r1 = r1.length
            if (r0 >= r1) goto L47
            r0 = r8
            r1 = r9
            r2 = r6
            javassist.bytecode.ConstPool r2 = r2.constPool
            r3 = r6
            int[] r3 = r3.interfaces
            r4 = r9
            r3 = r3[r4]
            java.lang.String r2 = r2.getClassInfo(r3)
            r0[r1] = r2
            int r9 = r9 + 1
            goto L28
        L47:
            r0 = r8
            r7 = r0
        L49:
            r0 = r6
            r1 = r7
            r0.cachedInterfaces = r1
            r0 = r7
            return r0
    }

    public void setInterfaces(java.lang.String[] r7) {
            r6 = this;
            r0 = r6
            r1 = 0
            r0.cachedInterfaces = r1
            r0 = r7
            if (r0 == 0) goto L2f
            r0 = r6
            r1 = r7
            int r1 = r1.length
            int[] r1 = new int[r1]
            r0.interfaces = r1
            r0 = 0
            r8 = r0
        L13:
            r0 = r8
            r1 = r7
            int r1 = r1.length
            if (r0 >= r1) goto L2f
            r0 = r6
            int[] r0 = r0.interfaces
            r1 = r8
            r2 = r6
            javassist.bytecode.ConstPool r2 = r2.constPool
            r3 = r7
            r4 = r8
            r3 = r3[r4]
            int r2 = r2.addClassInfo(r3)
            r0[r1] = r2
            int r8 = r8 + 1
            goto L13
        L2f:
            return
    }

    public void addInterface(java.lang.String r7) {
            r6 = this;
            r0 = r6
            r1 = 0
            r0.cachedInterfaces = r1
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r7
            int r0 = r0.addClassInfo(r1)
            r8 = r0
            r0 = r6
            int[] r0 = r0.interfaces
            if (r0 != 0) goto L26
            r0 = r6
            r1 = 1
            int[] r1 = new int[r1]
            r0.interfaces = r1
            r0 = r6
            int[] r0 = r0.interfaces
            r1 = 0
            r2 = r8
            r0[r1] = r2
            goto L4a
        L26:
            r0 = r6
            int[] r0 = r0.interfaces
            int r0 = r0.length
            r9 = r0
            r0 = r9
            r1 = 1
            int r0 = r0 + r1
            int[] r0 = new int[r0]
            r10 = r0
            r0 = r6
            int[] r0 = r0.interfaces
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = r9
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r10
            r1 = r9
            r2 = r8
            r0[r1] = r2
            r0 = r6
            r1 = r10
            r0.interfaces = r1
        L4a:
            return
    }

    public java.util.List<javassist.bytecode.FieldInfo> getFields() {
            r2 = this;
            r0 = r2
            java.util.List<javassist.bytecode.FieldInfo> r0 = r0.fields
            return r0
    }

    public void addField(javassist.bytecode.FieldInfo r5) throws javassist.bytecode.DuplicateMemberException {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.getName()
            r2 = r5
            java.lang.String r2 = r2.getDescriptor()
            r0.testExistingField(r1, r2)
            r0 = r4
            java.util.List<javassist.bytecode.FieldInfo> r0 = r0.fields
            r1 = r5
            boolean r0 = r0.add(r1)
            return
    }

    public final void addField2(javassist.bytecode.FieldInfo r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.FieldInfo> r0 = r0.fields
            r1 = r4
            boolean r0 = r0.add(r1)
            return
    }

    private void testExistingField(java.lang.String r6, java.lang.String r7) throws javassist.bytecode.DuplicateMemberException {
            r5 = this;
            r0 = r5
            java.util.List<javassist.bytecode.FieldInfo> r0 = r0.fields
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        La:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L49
            r0 = r8
            java.lang.Object r0 = r0.next()
            javassist.bytecode.FieldInfo r0 = (javassist.bytecode.FieldInfo) r0
            r9 = r0
            r0 = r9
            java.lang.String r0 = r0.getName()
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L46
            javassist.bytecode.DuplicateMemberException r0 = new javassist.bytecode.DuplicateMemberException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "duplicate field: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L46:
            goto La
        L49:
            return
    }

    public java.util.List<javassist.bytecode.MethodInfo> getMethods() {
            r2 = this;
            r0 = r2
            java.util.List<javassist.bytecode.MethodInfo> r0 = r0.methods
            return r0
    }

    public javassist.bytecode.MethodInfo getMethod(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.MethodInfo> r0 = r0.methods
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        La:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2d
            r0 = r5
            java.lang.Object r0 = r0.next()
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0
            r6 = r0
            r0 = r6
            java.lang.String r0 = r0.getName()
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2a
            r0 = r6
            return r0
        L2a:
            goto La
        L2d:
            r0 = 0
            return r0
    }

    public javassist.bytecode.MethodInfo getStaticInitializer() {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "<clinit>"
            javassist.bytecode.MethodInfo r0 = r0.getMethod(r1)
            return r0
    }

    public void addMethod(javassist.bytecode.MethodInfo r4) throws javassist.bytecode.DuplicateMemberException {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.testExistingMethod(r1)
            r0 = r3
            java.util.List<javassist.bytecode.MethodInfo> r0 = r0.methods
            r1 = r4
            boolean r0 = r0.add(r1)
            return
    }

    public final void addMethod2(javassist.bytecode.MethodInfo r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.MethodInfo> r0 = r0.methods
            r1 = r4
            boolean r0 = r0.add(r1)
            return
    }

    private void testExistingMethod(javassist.bytecode.MethodInfo r7) throws javassist.bytecode.DuplicateMemberException {
            r6 = this;
            r0 = r7
            java.lang.String r0 = r0.getName()
            r8 = r0
            r0 = r7
            java.lang.String r0 = r0.getDescriptor()
            r9 = r0
            r0 = r6
            java.util.List<javassist.bytecode.MethodInfo> r0 = r0.methods
            r1 = 0
            java.util.ListIterator r0 = r0.listIterator(r1)
            r10 = r0
        L16:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L5e
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            java.lang.Object r3 = r3.next()
            javassist.bytecode.MethodInfo r3 = (javassist.bytecode.MethodInfo) r3
            r4 = r10
            boolean r0 = isDuplicated(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L16
            javassist.bytecode.DuplicateMemberException r0 = new javassist.bytecode.DuplicateMemberException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "duplicate method: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " in "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L5e:
            return
    }

    private static boolean isDuplicated(javassist.bytecode.MethodInfo r3, java.lang.String r4, java.lang.String r5, javassist.bytecode.MethodInfo r6, java.util.ListIterator<javassist.bytecode.MethodInfo> r7) {
            r0 = r6
            java.lang.String r0 = r0.getName()
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r6
            java.lang.String r0 = r0.getDescriptor()
            r8 = r0
            r0 = r8
            r1 = r5
            boolean r0 = javassist.bytecode.Descriptor.eqParamTypes(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            r0 = r8
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L39
            r0 = r6
            boolean r0 = notBridgeMethod(r0)
            if (r0 == 0) goto L30
            r0 = 1
            return r0
        L30:
            r0 = r7
            r0.remove()
            r0 = 0
            return r0
        L39:
            r0 = 0
            return r0
    }

    private static boolean notBridgeMethod(javassist.bytecode.MethodInfo r3) {
            r0 = r3
            int r0 = r0.getAccessFlags()
            r1 = 64
            r0 = r0 & r1
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public java.util.List<javassist.bytecode.AttributeInfo> getAttributes() {
            r2 = this;
            r0 = r2
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            return r0
    }

    public javassist.bytecode.AttributeInfo getAttribute(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        La:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2d
            r0 = r5
            java.lang.Object r0 = r0.next()
            javassist.bytecode.AttributeInfo r0 = (javassist.bytecode.AttributeInfo) r0
            r6 = r0
            r0 = r6
            java.lang.String r0 = r0.getName()
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2a
            r0 = r6
            return r0
        L2a:
            goto La
        L2d:
            r0 = 0
            return r0
    }

    public javassist.bytecode.AttributeInfo removeAttribute(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r4
            javassist.bytecode.AttributeInfo r0 = javassist.bytecode.AttributeInfo.remove(r0, r1)
            return r0
    }

    public void addAttribute(javassist.bytecode.AttributeInfo r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r4
            java.lang.String r1 = r1.getName()
            javassist.bytecode.AttributeInfo r0 = javassist.bytecode.AttributeInfo.remove(r0, r1)
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r4
            boolean r0 = r0.add(r1)
            return
    }

    public java.lang.String getSourceFile() {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "SourceFile"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.SourceFileAttribute r0 = (javassist.bytecode.SourceFileAttribute) r0
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L11
            r0 = 0
            return r0
        L11:
            r0 = r4
            java.lang.String r0 = r0.getFileName()
            return r0
    }

    private void read(java.io.DataInputStream r7) throws java.io.IOException {
            r6 = this;
            r0 = r7
            int r0 = r0.readInt()
            r10 = r0
            r0 = r10
            r1 = -889275714(0xffffffffcafebabe, float:-8346975.0)
            if (r0 == r1) goto L2e
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad magic number: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L2e:
            r0 = r6
            r1 = r7
            int r1 = r1.readUnsignedShort()
            r0.minor = r1
            r0 = r6
            r1 = r7
            int r1 = r1.readUnsignedShort()
            r0.major = r1
            r0 = r6
            javassist.bytecode.ConstPool r1 = new javassist.bytecode.ConstPool
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.constPool = r1
            r0 = r6
            r1 = r7
            int r1 = r1.readUnsignedShort()
            r0.accessFlags = r1
            r0 = r6
            r1 = r7
            int r1 = r1.readUnsignedShort()
            r0.thisClass = r1
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r6
            int r1 = r1.thisClass
            r0.setThisClassInfo(r1)
            r0 = r6
            r1 = r7
            int r1 = r1.readUnsignedShort()
            r0.superClass = r1
            r0 = r7
            int r0 = r0.readUnsignedShort()
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L7e
            r0 = r6
            r1 = 0
            r0.interfaces = r1
            goto L9c
        L7e:
            r0 = r6
            r1 = r9
            int[] r1 = new int[r1]
            r0.interfaces = r1
            r0 = 0
            r8 = r0
        L87:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L9c
            r0 = r6
            int[] r0 = r0.interfaces
            r1 = r8
            r2 = r7
            int r2 = r2.readUnsignedShort()
            r0[r1] = r2
            int r8 = r8 + 1
            goto L87
        L9c:
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r11 = r0
            r0 = r7
            int r0 = r0.readUnsignedShort()
            r9 = r0
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.fields = r1
            r0 = 0
            r8 = r0
        Lb4:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto Lcd
            r0 = r6
            javassist.bytecode.FieldInfo r1 = new javassist.bytecode.FieldInfo
            r2 = r1
            r3 = r11
            r4 = r7
            r2.<init>(r3, r4)
            r0.addField2(r1)
            int r8 = r8 + 1
            goto Lb4
        Lcd:
            r0 = r7
            int r0 = r0.readUnsignedShort()
            r9 = r0
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.methods = r1
            r0 = 0
            r8 = r0
        Ldf:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto Lf8
            r0 = r6
            javassist.bytecode.MethodInfo r1 = new javassist.bytecode.MethodInfo
            r2 = r1
            r3 = r11
            r4 = r7
            r2.<init>(r3, r4)
            r0.addMethod2(r1)
            int r8 = r8 + 1
            goto Ldf
        Lf8:
            r0 = r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.attributes = r1
            r0 = r7
            int r0 = r0.readUnsignedShort()
            r9 = r0
            r0 = 0
            r8 = r0
        L10a:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L11f
            r0 = r6
            r1 = r11
            r2 = r7
            javassist.bytecode.AttributeInfo r1 = javassist.bytecode.AttributeInfo.read(r1, r2)
            r0.addAttribute(r1)
            int r8 = r8 + 1
            goto L10a
        L11f:
            r0 = r6
            r1 = r6
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r6
            int r2 = r2.thisClass
            java.lang.String r1 = r1.getClassInfo(r2)
            r0.thisclassname = r1
            return
    }

    public void write(java.io.DataOutputStream r5) throws java.io.IOException {
            r4 = this;
            r0 = r5
            r1 = -889275714(0xffffffffcafebabe, float:-8346975.0)
            r0.writeInt(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.minor
            r0.writeShort(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.major
            r0.writeShort(r1)
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r5
            r0.write(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.accessFlags
            r0.writeShort(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.thisClass
            r0.writeShort(r1)
            r0 = r5
            r1 = r4
            int r1 = r1.superClass
            r0.writeShort(r1)
            r0 = r4
            int[] r0 = r0.interfaces
            if (r0 != 0) goto L43
            r0 = 0
            r7 = r0
            goto L49
        L43:
            r0 = r4
            int[] r0 = r0.interfaces
            int r0 = r0.length
            r7 = r0
        L49:
            r0 = r5
            r1 = r7
            r0.writeShort(r1)
            r0 = 0
            r6 = r0
        L50:
            r0 = r6
            r1 = r7
            if (r0 >= r1) goto L65
            r0 = r5
            r1 = r4
            int[] r1 = r1.interfaces
            r2 = r6
            r1 = r1[r2]
            r0.writeShort(r1)
            int r6 = r6 + 1
            goto L50
        L65:
            r0 = r4
            java.util.List<javassist.bytecode.FieldInfo> r0 = r0.fields
            int r0 = r0.size()
            r7 = r0
            r0 = r5
            r1 = r7
            r0.writeShort(r1)
            r0 = 0
            r6 = r0
        L76:
            r0 = r6
            r1 = r7
            if (r0 >= r1) goto L96
            r0 = r4
            java.util.List<javassist.bytecode.FieldInfo> r0 = r0.fields
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.FieldInfo r0 = (javassist.bytecode.FieldInfo) r0
            r8 = r0
            r0 = r8
            r1 = r5
            r0.write(r1)
            int r6 = r6 + 1
            goto L76
        L96:
            r0 = r5
            r1 = r4
            java.util.List<javassist.bytecode.MethodInfo> r1 = r1.methods
            int r1 = r1.size()
            r0.writeShort(r1)
            r0 = r4
            java.util.List<javassist.bytecode.MethodInfo> r0 = r0.methods
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        Lae:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lcd
            r0 = r8
            java.lang.Object r0 = r0.next()
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0
            r9 = r0
            r0 = r9
            r1 = r5
            r0.write(r1)
            goto Lae
        Lcd:
            r0 = r5
            r1 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r1 = r1.attributes
            int r1 = r1.size()
            r0.writeShort(r1)
            r0 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attributes
            r1 = r5
            javassist.bytecode.AttributeInfo.writeAll(r0, r1)
            return
    }

    public int getMajorVersion() {
            r2 = this;
            r0 = r2
            int r0 = r0.major
            return r0
    }

    public void setMajorVersion(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.major = r1
            return
    }

    public int getMinorVersion() {
            r2 = this;
            r0 = r2
            int r0 = r0.minor
            return r0
    }

    public void setMinorVersion(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.minor = r1
            return
    }

    public void setVersionToJava5() {
            r3 = this;
            r0 = r3
            r1 = 49
            r0.major = r1
            r0 = r3
            r1 = 0
            r0.minor = r1
            return
    }

    static {
            r0 = 47
            r7 = r0
            java.lang.String r0 = "java.lang.StringBuilder"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L66
            r0 = 49
            r7 = r0
            java.lang.String r0 = "java.util.zip.DeflaterInputStream"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L66
            r0 = 50
            r7 = r0
            java.lang.String r0 = "java.lang.invoke.CallSite"
            r1 = 0
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch: java.lang.Throwable -> L66
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)     // Catch: java.lang.Throwable -> L66
            r0 = 51
            r7 = r0
            java.lang.String r0 = "java.util.function.Function"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L66
            r0 = 52
            r7 = r0
            java.lang.String r0 = "java.lang.Module"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L66
            r0 = 53
            r7 = r0
            java.lang.Class<java.util.List> r0 = java.util.List.class
            java.lang.String r1 = "copyOf"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L66
            r3 = r2
            r4 = 0
            java.lang.Class<java.util.Collection> r5 = java.util.Collection.class
            r3[r4] = r5     // Catch: java.lang.Throwable -> L66
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L66
            r0 = 54
            r7 = r0
            java.lang.String r0 = "java.util.Optional"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = "isEmpty"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L66
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L66
            r0 = 55
            r7 = r0
            goto L67
        L66:
            r8 = move-exception
        L67:
            r0 = r7
            javassist.bytecode.ClassFile.MAJOR_VERSION = r0
            return
    }
}
