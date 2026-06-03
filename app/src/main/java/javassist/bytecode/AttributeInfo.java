package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/AttributeInfo.class */
public class AttributeInfo {
    protected javassist.bytecode.ConstPool constPool;
    int name;
    byte[] info;

    protected AttributeInfo(javassist.bytecode.ConstPool r4, int r5, byte[] r6) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.constPool = r1
            r0 = r3
            r1 = r5
            r0.name = r1
            r0 = r3
            r1 = r6
            r0.info = r1
            return
    }

    protected AttributeInfo(javassist.bytecode.ConstPool r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            byte[] r3 = (byte[]) r3
            r0.<init>(r1, r2, r3)
            return
    }

    public AttributeInfo(javassist.bytecode.ConstPool r6, java.lang.String r7, byte[] r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r6
            r3 = r7
            int r2 = r2.addUtf8Info(r3)
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    protected AttributeInfo(javassist.bytecode.ConstPool r4, int r5, java.io.DataInputStream r6) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.constPool = r1
            r0 = r3
            r1 = r5
            r0.name = r1
            r0 = r6
            int r0 = r0.readInt()
            r7 = r0
            r0 = r3
            r1 = r7
            byte[] r1 = new byte[r1]
            r0.info = r1
            r0 = r7
            if (r0 <= 0) goto L29
            r0 = r6
            r1 = r3
            byte[] r1 = r1.info
            r0.readFully(r1)
        L29:
            return
    }

    static javassist.bytecode.AttributeInfo read(javassist.bytecode.ConstPool r6, java.io.DataInputStream r7) throws java.io.IOException {
            r0 = r7
            int r0 = r0.readUnsignedShort()
            r8 = r0
            r0 = r6
            r1 = r8
            java.lang.String r0 = r0.getUtf8Info(r1)
            r9 = r0
            r0 = r9
            r1 = 0
            char r0 = r0.charAt(r1)
            r10 = r0
            r0 = r10
            r1 = 69
            if (r0 >= r1) goto L7d
            r0 = r9
            java.lang.String r1 = "AnnotationDefault"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2d
            javassist.bytecode.AnnotationDefaultAttribute r0 = new javassist.bytecode.AnnotationDefaultAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L2d:
            r0 = r9
            java.lang.String r1 = "BootstrapMethods"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L41
            javassist.bytecode.BootstrapMethodsAttribute r0 = new javassist.bytecode.BootstrapMethodsAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L41:
            r0 = r9
            java.lang.String r1 = "Code"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L55
            javassist.bytecode.CodeAttribute r0 = new javassist.bytecode.CodeAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L55:
            r0 = r9
            java.lang.String r1 = "ConstantValue"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L69
            javassist.bytecode.ConstantAttribute r0 = new javassist.bytecode.ConstantAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L69:
            r0 = r9
            java.lang.String r1 = "Deprecated"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7d
            javassist.bytecode.DeprecatedAttribute r0 = new javassist.bytecode.DeprecatedAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L7d:
            r0 = r10
            r1 = 77
            if (r0 >= r1) goto Lfc
            r0 = r9
            java.lang.String r1 = "EnclosingMethod"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L98
            javassist.bytecode.EnclosingMethodAttribute r0 = new javassist.bytecode.EnclosingMethodAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L98:
            r0 = r9
            java.lang.String r1 = "Exceptions"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lac
            javassist.bytecode.ExceptionsAttribute r0 = new javassist.bytecode.ExceptionsAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        Lac:
            r0 = r9
            java.lang.String r1 = "InnerClasses"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc0
            javassist.bytecode.InnerClassesAttribute r0 = new javassist.bytecode.InnerClassesAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        Lc0:
            r0 = r9
            java.lang.String r1 = "LineNumberTable"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld4
            javassist.bytecode.LineNumberAttribute r0 = new javassist.bytecode.LineNumberAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        Ld4:
            r0 = r9
            java.lang.String r1 = "LocalVariableTable"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le8
            javassist.bytecode.LocalVariableAttribute r0 = new javassist.bytecode.LocalVariableAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        Le8:
            r0 = r9
            java.lang.String r1 = "LocalVariableTypeTable"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lfc
            javassist.bytecode.LocalVariableTypeAttribute r0 = new javassist.bytecode.LocalVariableTypeAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        Lfc:
            r0 = r10
            r1 = 83
            if (r0 >= r1) goto L196
            r0 = r9
            java.lang.String r1 = "MethodParameters"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L117
            javassist.bytecode.MethodParametersAttribute r0 = new javassist.bytecode.MethodParametersAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L117:
            r0 = r9
            java.lang.String r1 = "NestHost"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L12b
            javassist.bytecode.NestHostAttribute r0 = new javassist.bytecode.NestHostAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L12b:
            r0 = r9
            java.lang.String r1 = "NestMembers"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13f
            javassist.bytecode.NestMembersAttribute r0 = new javassist.bytecode.NestMembersAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L13f:
            r0 = r9
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L151
            r0 = r9
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15c
        L151:
            javassist.bytecode.AnnotationsAttribute r0 = new javassist.bytecode.AnnotationsAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L15c:
            r0 = r9
            java.lang.String r1 = "RuntimeVisibleParameterAnnotations"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16e
            r0 = r9
            java.lang.String r1 = "RuntimeInvisibleParameterAnnotations"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L179
        L16e:
            javassist.bytecode.ParameterAnnotationsAttribute r0 = new javassist.bytecode.ParameterAnnotationsAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L179:
            r0 = r9
            java.lang.String r1 = "RuntimeVisibleTypeAnnotations"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18b
            r0 = r9
            java.lang.String r1 = "RuntimeInvisibleTypeAnnotations"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L196
        L18b:
            javassist.bytecode.TypeAnnotationsAttribute r0 = new javassist.bytecode.TypeAnnotationsAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L196:
            r0 = r10
            r1 = 83
            if (r0 < r1) goto L201
            r0 = r9
            java.lang.String r1 = "Signature"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b1
            javassist.bytecode.SignatureAttribute r0 = new javassist.bytecode.SignatureAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L1b1:
            r0 = r9
            java.lang.String r1 = "SourceFile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c5
            javassist.bytecode.SourceFileAttribute r0 = new javassist.bytecode.SourceFileAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L1c5:
            r0 = r9
            java.lang.String r1 = "Synthetic"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1d9
            javassist.bytecode.SyntheticAttribute r0 = new javassist.bytecode.SyntheticAttribute
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L1d9:
            r0 = r9
            java.lang.String r1 = "StackMap"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1ed
            javassist.bytecode.StackMap r0 = new javassist.bytecode.StackMap
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L1ed:
            r0 = r9
            java.lang.String r1 = "StackMapTable"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L201
            javassist.bytecode.StackMapTable r0 = new javassist.bytecode.StackMapTable
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
        L201:
            javassist.bytecode.AttributeInfo r0 = new javassist.bytecode.AttributeInfo
            r1 = r0
            r2 = r6
            r3 = r8
            r4 = r7
            r1.<init>(r2, r3, r4)
            return r0
    }

    public java.lang.String getName() {
            r3 = this;
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.constPool
            r1 = r3
            int r1 = r1.name
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public javassist.bytecode.ConstPool getConstPool() {
            r2 = this;
            r0 = r2
            javassist.bytecode.ConstPool r0 = r0.constPool
            return r0
    }

    public int length() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.info
            int r0 = r0.length
            r1 = 6
            int r0 = r0 + r1
            return r0
    }

    public byte[] get() {
            r2 = this;
            r0 = r2
            byte[] r0 = r0.info
            return r0
    }

    public void set(byte[] r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.info = r1
            return
    }

    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r8, java.util.Map<java.lang.String, java.lang.String> r9) {
            r7 = this;
            javassist.bytecode.AttributeInfo r0 = new javassist.bytecode.AttributeInfo
            r1 = r0
            r2 = r8
            r3 = r7
            java.lang.String r3 = r3.getName()
            r4 = r7
            byte[] r4 = r4.info
            r5 = r7
            byte[] r5 = r5.info
            int r5 = r5.length
            byte[] r4 = java.util.Arrays.copyOf(r4, r5)
            r1.<init>(r2, r3, r4)
            return r0
    }

    void write(java.io.DataOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = r3
            int r1 = r1.name
            r0.writeShort(r1)
            r0 = r4
            r1 = r3
            byte[] r1 = r1.info
            int r1 = r1.length
            r0.writeInt(r1)
            r0 = r3
            byte[] r0 = r0.info
            int r0 = r0.length
            if (r0 <= 0) goto L21
            r0 = r4
            r1 = r3
            byte[] r1 = r1.info
            r0.write(r1)
        L21:
            return
    }

    static int getLength(java.util.List<javassist.bytecode.AttributeInfo> r3) {
            r0 = 0
            r4 = r0
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L9:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L26
            r0 = r5
            java.lang.Object r0 = r0.next()
            javassist.bytecode.AttributeInfo r0 = (javassist.bytecode.AttributeInfo) r0
            r6 = r0
            r0 = r4
            r1 = r6
            int r1 = r1.length()
            int r0 = r0 + r1
            r4 = r0
            goto L9
        L26:
            r0 = r4
            return r0
    }

    static javassist.bytecode.AttributeInfo lookup(java.util.List<javassist.bytecode.AttributeInfo> r3, java.lang.String r4) {
            r0 = r3
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        Ld:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L30
            r0 = r5
            java.lang.Object r0 = r0.next()
            javassist.bytecode.AttributeInfo r0 = (javassist.bytecode.AttributeInfo) r0
            r6 = r0
            r0 = r6
            java.lang.String r0 = r0.getName()
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2d
            r0 = r6
            return r0
        L2d:
            goto Ld
        L30:
            r0 = 0
            return r0
    }

    static synchronized javassist.bytecode.AttributeInfo remove(java.util.List<javassist.bytecode.AttributeInfo> r3, java.lang.String r4) {
            r0 = r3
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        Ld:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3a
            r0 = r5
            java.lang.Object r0 = r0.next()
            javassist.bytecode.AttributeInfo r0 = (javassist.bytecode.AttributeInfo) r0
            r6 = r0
            r0 = r6
            java.lang.String r0 = r0.getName()
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r0 = r3
            r1 = r6
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L37
            r0 = r6
            return r0
        L37:
            goto Ld
        L3a:
            r0 = 0
            return r0
    }

    static void writeAll(java.util.List<javassist.bytecode.AttributeInfo> r3, java.io.DataOutputStream r4) throws java.io.IOException {
            r0 = r3
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        Lc:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L27
            r0 = r5
            java.lang.Object r0 = r0.next()
            javassist.bytecode.AttributeInfo r0 = (javassist.bytecode.AttributeInfo) r0
            r6 = r0
            r0 = r6
            r1 = r4
            r0.write(r1)
            goto Lc
        L27:
            return
    }

    static java.util.List<javassist.bytecode.AttributeInfo> copyAll(java.util.List<javassist.bytecode.AttributeInfo> r5, javassist.bytecode.ConstPool r6) {
            r0 = r5
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r5
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L15:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L3a
            r0 = r8
            java.lang.Object r0 = r0.next()
            javassist.bytecode.AttributeInfo r0 = (javassist.bytecode.AttributeInfo) r0
            r9 = r0
            r0 = r7
            r1 = r9
            r2 = r6
            r3 = 0
            javassist.bytecode.AttributeInfo r1 = r1.copy(r2, r3)
            boolean r0 = r0.add(r1)
            goto L15
        L3a:
            r0 = r7
            return r0
    }

    void renameClass(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            return
    }

    void renameClass(java.util.Map<java.lang.String, java.lang.String> r2) {
            r1 = this;
            return
    }

    static void renameClass(java.util.List<javassist.bytecode.AttributeInfo> r4, java.lang.String r5, java.lang.String r6) {
            r0 = r4
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        Lc:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2a
            r0 = r7
            java.lang.Object r0 = r0.next()
            javassist.bytecode.AttributeInfo r0 = (javassist.bytecode.AttributeInfo) r0
            r8 = r0
            r0 = r8
            r1 = r5
            r2 = r6
            r0.renameClass(r1, r2)
            goto Lc
        L2a:
            return
    }

    static void renameClass(java.util.List<javassist.bytecode.AttributeInfo> r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r0 = r3
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        Lc:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L27
            r0 = r5
            java.lang.Object r0 = r0.next()
            javassist.bytecode.AttributeInfo r0 = (javassist.bytecode.AttributeInfo) r0
            r6 = r0
            r0 = r6
            r1 = r4
            r0.renameClass(r1)
            goto Lc
        L27:
            return
    }

    void getRefClasses(java.util.Map<java.lang.String, java.lang.String> r2) {
            r1 = this;
            return
    }

    static void getRefClasses(java.util.List<javassist.bytecode.AttributeInfo> r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r0 = r3
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r3
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        Lc:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L27
            r0 = r5
            java.lang.Object r0 = r0.next()
            javassist.bytecode.AttributeInfo r0 = (javassist.bytecode.AttributeInfo) r0
            r6 = r0
            r0 = r6
            r1 = r4
            r0.getRefClasses(r1)
            goto Lc
        L27:
            return
    }
}
