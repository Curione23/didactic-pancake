package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/FieldInfo.class */
public final class FieldInfo {
    javassist.bytecode.ConstPool constPool;
    int accessFlags;
    int name;
    java.lang.String cachedName;
    java.lang.String cachedType;
    int descriptor;
    java.util.List<javassist.bytecode.AttributeInfo> attribute;

    private FieldInfo(javassist.bytecode.ConstPool r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.constPool = r1
            r0 = r3
            r1 = 0
            r0.accessFlags = r1
            r0 = r3
            r1 = 0
            r0.attribute = r1
            return
    }

    public FieldInfo(javassist.bytecode.ConstPool r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r4
            r1 = r5
            r2 = r6
            int r1 = r1.addUtf8Info(r2)
            r0.name = r1
            r0 = r4
            r1 = r6
            r0.cachedName = r1
            r0 = r4
            r1 = r5
            r2 = r7
            int r1 = r1.addUtf8Info(r2)
            r0.descriptor = r1
            return
    }

    FieldInfo(javassist.bytecode.ConstPool r4, java.io.DataInputStream r5) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            r0 = r3
            r1 = r5
            r0.read(r1)
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

    void prune(javassist.bytecode.ConstPool r7) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r6
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L22
            r0 = r9
            r1 = r7
            r2 = 0
            javassist.bytecode.AttributeInfo r0 = r0.copy(r1, r2)
            r9 = r0
            r0 = r8
            r1 = r9
            boolean r0 = r0.add(r1)
        L22:
            r0 = r6
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L41
            r0 = r10
            r1 = r7
            r2 = 0
            javassist.bytecode.AttributeInfo r0 = r0.copy(r1, r2)
            r10 = r0
            r0 = r8
            r1 = r10
            boolean r0 = r0.add(r1)
        L41:
            r0 = r6
            java.lang.String r1 = "Signature"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L60
            r0 = r11
            r1 = r7
            r2 = 0
            javassist.bytecode.AttributeInfo r0 = r0.copy(r1, r2)
            r11 = r0
            r0 = r8
            r1 = r11
            boolean r0 = r0.add(r1)
        L60:
            r0 = r6
            int r0 = r0.getConstantValue()
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L89
            r0 = r6
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r12
            r2 = r7
            r3 = 0
            int r0 = r0.copy(r1, r2, r3)
            r12 = r0
            r0 = r8
            javassist.bytecode.ConstantAttribute r1 = new javassist.bytecode.ConstantAttribute
            r2 = r1
            r3 = r7
            r4 = r12
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
        L89:
            r0 = r6
            r1 = r8
            r0.attribute = r1
            r0 = r6
            r1 = r7
            r2 = r6
            java.lang.String r2 = r2.getName()
            int r1 = r1.addUtf8Info(r2)
            r0.name = r1
            r0 = r6
            r1 = r7
            r2 = r6
            java.lang.String r2 = r2.getDescriptor()
            int r1 = r1.addUtf8Info(r2)
            r0.descriptor = r1
            r0 = r6
            r1 = r7
            r0.constPool = r1
            return
    }

    public javassist.bytecode.ConstPool getConstPool() {
            r2 = this;
            r0 = r2
            javassist.bytecode.ConstPool r0 = r0.constPool
            return r0
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

    public int getConstantValue() {
            r3 = this;
            r0 = r3
            int r0 = r0.accessFlags
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r3
            java.lang.String r1 = "ConstantValue"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.ConstantAttribute r0 = (javassist.bytecode.ConstantAttribute) r0
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L1c
            r0 = 0
            return r0
        L1c:
            r0 = r4
            int r0 = r0.getConstantValue()
            return r0
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
}
