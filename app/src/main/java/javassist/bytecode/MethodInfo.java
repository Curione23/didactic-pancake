package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/MethodInfo.class */
public class MethodInfo {
    javassist.bytecode.ConstPool constPool;
    int accessFlags;
    int name;
    java.lang.String cachedName;
    int descriptor;
    java.util.List<javassist.bytecode.AttributeInfo> attribute;
    public static boolean doPreverify;
    public static final java.lang.String nameInit = "<init>";
    public static final java.lang.String nameClinit = "<clinit>";

    private MethodInfo(javassist.bytecode.ConstPool r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.constPool = r1
            r0 = r3
            r1 = 0
            r0.attribute = r1
            return
    }

    public MethodInfo(javassist.bytecode.ConstPool r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r4
            r1 = 0
            r0.accessFlags = r1
            r0 = r4
            r1 = r5
            r2 = r6
            int r1 = r1.addUtf8Info(r2)
            r0.name = r1
            r0 = r4
            r1 = r6
            r0.cachedName = r1
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r7
            int r1 = r1.addUtf8Info(r2)
            r0.descriptor = r1
            return
    }

    MethodInfo(javassist.bytecode.ConstPool r4, java.io.DataInputStream r5) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.read(r1)
            return
    }

    public MethodInfo(javassist.bytecode.ConstPool r6, java.lang.String r7, javassist.bytecode.MethodInfo r8, java.util.Map<java.lang.String, java.lang.String> r9) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            r1 = r6
            r0.<init>(r1)
            r0 = r5
            r1 = r8
            r2 = r7
            r3 = r9
            r0.read(r1, r2, r3)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.getDescriptor()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    void compact(javassist.bytecode.ConstPool r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r4
            java.lang.String r2 = r2.getName()
            int r1 = r1.addUtf8Info(r2)
            r0.name = r1
            r0 = r4
            r1 = r5
            r2 = r4
            java.lang.String r2 = r2.getDescriptor()
            int r1 = r1.addUtf8Info(r2)
            r0.descriptor = r1
            r0 = r4
            r1 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r1 = r1.attribute
            r2 = r5
            java.util.List r1 = javassist.bytecode.AttributeInfo.copyAll(r1, r2)
            r0.attribute = r1
            r0 = r4
            r1 = r5
            r0.constPool = r1
            return
    }

    void prune(javassist.bytecode.ConstPool r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r4
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L22
            r0 = r7
            r1 = r5
            r2 = 0
            javassist.bytecode.AttributeInfo r0 = r0.copy(r1, r2)
            r7 = r0
            r0 = r6
            r1 = r7
            boolean r0 = r0.add(r1)
        L22:
            r0 = r4
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L41
            r0 = r8
            r1 = r5
            r2 = 0
            javassist.bytecode.AttributeInfo r0 = r0.copy(r1, r2)
            r8 = r0
            r0 = r6
            r1 = r8
            boolean r0 = r0.add(r1)
        L41:
            r0 = r4
            java.lang.String r1 = "RuntimeInvisibleParameterAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L60
            r0 = r9
            r1 = r5
            r2 = 0
            javassist.bytecode.AttributeInfo r0 = r0.copy(r1, r2)
            r9 = r0
            r0 = r6
            r1 = r9
            boolean r0 = r0.add(r1)
        L60:
            r0 = r4
            java.lang.String r1 = "RuntimeVisibleParameterAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L7f
            r0 = r10
            r1 = r5
            r2 = 0
            javassist.bytecode.AttributeInfo r0 = r0.copy(r1, r2)
            r10 = r0
            r0 = r6
            r1 = r10
            boolean r0 = r0.add(r1)
        L7f:
            r0 = r4
            java.lang.String r1 = "AnnotationDefault"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationDefaultAttribute r0 = (javassist.bytecode.AnnotationDefaultAttribute) r0
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L98
            r0 = r6
            r1 = r11
            boolean r0 = r0.add(r1)
        L98:
            r0 = r4
            javassist.bytecode.ExceptionsAttribute r0 = r0.getExceptionsAttribute()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto Lac
            r0 = r6
            r1 = r12
            boolean r0 = r0.add(r1)
        Lac:
            r0 = r4
            java.lang.String r1 = "Signature"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            r13 = r0
            r0 = r13
            if (r0 == 0) goto Lcb
            r0 = r13
            r1 = r5
            r2 = 0
            javassist.bytecode.AttributeInfo r0 = r0.copy(r1, r2)
            r13 = r0
            r0 = r6
            r1 = r13
            boolean r0 = r0.add(r1)
        Lcb:
            r0 = r4
            r1 = r6
            r0.attribute = r1
            r0 = r4
            r1 = r5
            r2 = r4
            java.lang.String r2 = r2.getName()
            int r1 = r1.addUtf8Info(r2)
            r0.name = r1
            r0 = r4
            r1 = r5
            r2 = r4
            java.lang.String r2 = r2.getDescriptor()
            int r1 = r1.addUtf8Info(r2)
            r0.descriptor = r1
            r0 = r4
            r1 = r5
            r0.constPool = r1
            return
    }

    public java.lang.String getName() {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.cachedName
            if (r0 != 0) goto L16
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r4
            int r2 = r2.name
            java.lang.String r1 = r1.getUtf8Info(r2)
            r0.cachedName = r1
        L16:
            r0 = r4
            java.lang.String r0 = r0.cachedName
            return r0
    }

    public void setName(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            int r1 = r1.addUtf8Info(r2)
            r0.name = r1
            r0 = r4
            r1 = r5
            r0.cachedName = r1
            return
    }

    public boolean isMethod() {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.getName()
            r4 = r0
            r0 = r4
            java.lang.String r1 = "<init>"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b
            r0 = r4
            java.lang.String r1 = "<clinit>"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    public javassist.bytecode.ConstPool getConstPool() {
            r2 = this;
            r0 = r2
            javassist.bytecode.ConstPool r0 = r0.constPool
            return r0
    }

    public boolean isConstructor() {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "<init>"
            boolean r0 = r0.equals(r1)
            return r0
    }

    public boolean isStaticInitializer() {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "<clinit>"
            boolean r0 = r0.equals(r1)
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
            r0 = r3
            r1 = r4
            r0.accessFlags = r1
            return
    }

    public java.lang.String getDescriptor() {
            r3 = this;
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r3
            int r1 = r1.descriptor
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public void setDescriptor(java.lang.String r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            java.lang.String r1 = r1.getDescriptor()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            r0 = r4
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            int r1 = r1.addUtf8Info(r2)
            r0.descriptor = r1
        L17:
            return
    }

    public java.util.List<javassist.bytecode.AttributeInfo> getAttributes() {
            r4 = this;
            r0 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            if (r0 != 0) goto L12
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.attribute = r1
        L12:
            r0 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            return r0
    }

    public javassist.bytecode.AttributeInfo getAttribute(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            r1 = r4
            javassist.bytecode.AttributeInfo r0 = javassist.bytecode.AttributeInfo.lookup(r0, r1)
            return r0
    }

    public javassist.bytecode.AttributeInfo removeAttribute(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            r1 = r4
            javassist.bytecode.AttributeInfo r0 = javassist.bytecode.AttributeInfo.remove(r0, r1)
            return r0
    }

    public void addAttribute(javassist.bytecode.AttributeInfo r5) {
            r4 = this;
            r0 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            if (r0 != 0) goto L12
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.attribute = r1
        L12:
            r0 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            r1 = r5
            java.lang.String r1 = r1.getName()
            javassist.bytecode.AttributeInfo r0 = javassist.bytecode.AttributeInfo.remove(r0, r1)
            r0 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            r1 = r5
            boolean r0 = r0.add(r1)
            return
    }

    public javassist.bytecode.ExceptionsAttribute getExceptionsAttribute() {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            java.lang.String r1 = "Exceptions"
            javassist.bytecode.AttributeInfo r0 = javassist.bytecode.AttributeInfo.lookup(r0, r1)
            r4 = r0
            r0 = r4
            javassist.bytecode.ExceptionsAttribute r0 = (javassist.bytecode.ExceptionsAttribute) r0
            return r0
    }

    public javassist.bytecode.CodeAttribute getCodeAttribute() {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            java.lang.String r1 = "Code"
            javassist.bytecode.AttributeInfo r0 = javassist.bytecode.AttributeInfo.lookup(r0, r1)
            r4 = r0
            r0 = r4
            javassist.bytecode.CodeAttribute r0 = (javassist.bytecode.CodeAttribute) r0
            return r0
    }

    public void removeExceptionsAttribute() {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            java.lang.String r1 = "Exceptions"
            javassist.bytecode.AttributeInfo r0 = javassist.bytecode.AttributeInfo.remove(r0, r1)
            return
    }

    public void setExceptionsAttribute(javassist.bytecode.ExceptionsAttribute r5) {
            r4 = this;
            r0 = r4
            r0.removeExceptionsAttribute()
            r0 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            if (r0 != 0) goto L16
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.attribute = r1
        L16:
            r0 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            r1 = r5
            boolean r0 = r0.add(r1)
            return
    }

    public void removeCodeAttribute() {
            r3 = this;
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            java.lang.String r1 = "Code"
            javassist.bytecode.AttributeInfo r0 = javassist.bytecode.AttributeInfo.remove(r0, r1)
            return
    }

    public void setCodeAttribute(javassist.bytecode.CodeAttribute r5) {
            r4 = this;
            r0 = r4
            r0.removeCodeAttribute()
            r0 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            if (r0 != 0) goto L16
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.attribute = r1
        L16:
            r0 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            r1 = r5
            boolean r0 = r0.add(r1)
            return
    }

    public void rebuildStackMapIf6(javassist.ClassPool r4, javassist.bytecode.ClassFile r5) throws javassist.bytecode.BadBytecode {
            r3 = this;
            r0 = r5
            int r0 = r0.getMajorVersion()
            r1 = 50
            if (r0 < r1) goto Le
            r0 = r3
            r1 = r4
            r0.rebuildStackMap(r1)
        Le:
            boolean r0 = javassist.bytecode.MethodInfo.doPreverify
            if (r0 == 0) goto L19
            r0 = r3
            r1 = r4
            r0.rebuildStackMapForME(r1)
        L19:
            return
    }

    public void rebuildStackMap(javassist.ClassPool r4) throws javassist.bytecode.BadBytecode {
            r3 = this;
            r0 = r3
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L14
            r0 = r4
            r1 = r3
            javassist.bytecode.StackMapTable r0 = javassist.bytecode.stackmap.MapMaker.make(r0, r1)
            r6 = r0
            r0 = r5
            r1 = r6
            r0.setAttribute(r1)
        L14:
            return
    }

    public void rebuildStackMapForME(javassist.ClassPool r4) throws javassist.bytecode.BadBytecode {
            r3 = this;
            r0 = r3
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L14
            r0 = r4
            r1 = r3
            javassist.bytecode.StackMap r0 = javassist.bytecode.stackmap.MapMaker.make2(r0, r1)
            r6 = r0
            r0 = r5
            r1 = r6
            r0.setAttribute(r1)
        L14:
            return
    }

    public int getLineNumber(int r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lb
            r0 = -1
            return r0
        Lb:
            r0 = r5
            java.lang.String r1 = "LineNumberTable"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.LineNumberAttribute r0 = (javassist.bytecode.LineNumberAttribute) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L1b
            r0 = -1
            return r0
        L1b:
            r0 = r6
            r1 = r4
            int r0 = r0.toLineNumber(r1)
            return r0
    }

    public void setSuperclass(java.lang.String r6) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            boolean r0 = r0.isConstructor()
            if (r0 != 0) goto L8
            return
        L8:
            r0 = r5
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r7 = r0
            r0 = r7
            byte[] r0 = r0.getCode()
            r8 = r0
            r0 = r7
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r9 = r0
            r0 = r9
            int r0 = r0.skipSuperConstructor()
            r10 = r0
            r0 = r10
            if (r0 < 0) goto L5a
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r11 = r0
            r0 = r8
            r1 = r10
            r2 = 1
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r12 = r0
            r0 = r11
            r1 = r12
            int r0 = r0.getMethodrefNameAndType(r1)
            r13 = r0
            r0 = r11
            r1 = r6
            int r0 = r0.addClassInfo(r1)
            r14 = r0
            r0 = r11
            r1 = r14
            r2 = r13
            int r0 = r0.addMethodrefInfo(r1, r2)
            r15 = r0
            r0 = r15
            r1 = r8
            r2 = r10
            r3 = 1
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
        L5a:
            return
    }

    private void read(javassist.bytecode.MethodInfo r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
            r5 = this;
            r0 = r5
            javassist.bytecode.ConstPool r0 = r0.constPool
            r9 = r0
            r0 = r5
            r1 = r6
            int r1 = r1.accessFlags
            r0.accessFlags = r1
            r0 = r5
            r1 = r9
            r2 = r7
            int r1 = r1.addUtf8Info(r2)
            r0.name = r1
            r0 = r5
            r1 = r7
            r0.cachedName = r1
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r10 = r0
            r0 = r10
            r1 = r6
            int r1 = r1.descriptor
            java.lang.String r0 = r0.getUtf8Info(r1)
            r11 = r0
            r0 = r11
            r1 = r8
            java.lang.String r0 = javassist.bytecode.Descriptor.rename(r0, r1)
            r12 = r0
            r0 = r5
            r1 = r9
            r2 = r12
            int r1 = r1.addUtf8Info(r2)
            r0.descriptor = r1
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.attribute = r1
            r0 = r6
            javassist.bytecode.ExceptionsAttribute r0 = r0.getExceptionsAttribute()
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L69
            r0 = r5
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            r1 = r13
            r2 = r9
            r3 = r8
            javassist.bytecode.AttributeInfo r1 = r1.copy(r2, r3)
            boolean r0 = r0.add(r1)
        L69:
            r0 = r6
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L86
            r0 = r5
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            r1 = r14
            r2 = r9
            r3 = r8
            javassist.bytecode.AttributeInfo r1 = r1.copy(r2, r3)
            boolean r0 = r0.add(r1)
        L86:
            return
    }

    private void read(java.io.DataInputStream r5) throws java.io.IOException {
            r4 = this;
            r0 = r4
            r1 = r5
            int r1 = r1.readUnsignedShort()
            r0.accessFlags = r1
            r0 = r4
            r1 = r5
            int r1 = r1.readUnsignedShort()
            r0.name = r1
            r0 = r4
            r1 = r5
            int r1 = r1.readUnsignedShort()
            r0.descriptor = r1
            r0 = r5
            int r0 = r0.readUnsignedShort()
            r6 = r0
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.attribute = r1
            r0 = 0
            r7 = r0
        L2a:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L47
            r0 = r4
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.constPool
            r2 = r5
            javassist.bytecode.AttributeInfo r1 = javassist.bytecode.AttributeInfo.read(r1, r2)
            boolean r0 = r0.add(r1)
            int r7 = r7 + 1
            goto L2a
        L47:
            return
    }

    void write(java.io.DataOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.accessFlags
            r0.writeShort(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.name
            r0.writeShort(r1)
            r0 = r4
            r1 = r3
            int r1 = r1.descriptor
            r0.writeShort(r1)
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            if (r0 != 0) goto L27
            r0 = r4
            r1 = 0
            r0.writeShort(r1)
            goto L3c
        L27:
            r0 = r4
            r1 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r1 = r1.attribute
            int r1 = r1.size()
            r0.writeShort(r1)
            r0 = r3
            java.util.List<javassist.bytecode.AttributeInfo> r0 = r0.attribute
            r1 = r4
            javassist.bytecode.AttributeInfo.writeAll(r0, r1)
        L3c:
            return
    }

    static {
            r0 = 0
            javassist.bytecode.MethodInfo.doPreverify = r0
            return
    }
}
