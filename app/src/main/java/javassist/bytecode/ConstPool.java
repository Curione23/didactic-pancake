package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ConstPool.class */
public final class ConstPool {
    javassist.bytecode.LongVector items;
    int numOfItems;
    int thisClassInfo;
    java.util.Map<javassist.bytecode.ConstInfo, javassist.bytecode.ConstInfo> itemsCache;
    public static final int CONST_Class = 7;
    public static final int CONST_Fieldref = 9;
    public static final int CONST_Methodref = 10;
    public static final int CONST_InterfaceMethodref = 11;
    public static final int CONST_String = 8;
    public static final int CONST_Integer = 3;
    public static final int CONST_Float = 4;
    public static final int CONST_Long = 5;
    public static final int CONST_Double = 6;
    public static final int CONST_NameAndType = 12;
    public static final int CONST_Utf8 = 1;
    public static final int CONST_MethodHandle = 15;
    public static final int CONST_MethodType = 16;
    public static final int CONST_Dynamic = 17;
    public static final int CONST_DynamicCallSite = 18;
    public static final int CONST_InvokeDynamic = 18;
    public static final int CONST_Module = 19;
    public static final int CONST_Package = 20;
    public static final javassist.CtClass THIS = null;
    public static final int REF_getField = 1;
    public static final int REF_getStatic = 2;
    public static final int REF_putField = 3;
    public static final int REF_putStatic = 4;
    public static final int REF_invokeVirtual = 5;
    public static final int REF_invokeStatic = 6;
    public static final int REF_invokeSpecial = 7;
    public static final int REF_newInvokeSpecial = 8;
    public static final int REF_invokeInterface = 9;

    public ConstPool(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            javassist.bytecode.LongVector r1 = new javassist.bytecode.LongVector
            r2 = r1
            r2.<init>()
            r0.items = r1
            r0 = r4
            r1 = 0
            r0.itemsCache = r1
            r0 = r4
            r1 = 0
            r0.numOfItems = r1
            r0 = r4
            r1 = 0
            int r0 = r0.addItem0(r1)
            r0 = r4
            r1 = r4
            r2 = r5
            int r1 = r1.addClassInfo(r2)
            r0.thisClassInfo = r1
            return
    }

    public ConstPool(java.io.DataInputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.itemsCache = r1
            r0 = r3
            r1 = 0
            r0.thisClassInfo = r1
            r0 = r3
            r1 = r4
            r0.read(r1)
            return
    }

    void prune() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.itemsCache = r1
            return
    }

    public int getSize() {
            r2 = this;
            r0 = r2
            int r0 = r0.numOfItems
            return r0
    }

    public java.lang.String getClassName() {
            r3 = this;
            r0 = r3
            r1 = r3
            int r1 = r1.thisClassInfo
            java.lang.String r0 = r0.getClassInfo(r1)
            return r0
    }

    public int getThisClassInfo() {
            r2 = this;
            r0 = r2
            int r0 = r0.thisClassInfo
            return r0
    }

    void setThisClassInfo(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.thisClassInfo = r1
            return
    }

    javassist.bytecode.ConstInfo getItem(int r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.LongVector r0 = r0.items
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.elementAt(r1)
            return r0
    }

    public int getTag(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            int r0 = r0.getTag()
            return r0
    }

    public java.lang.String getClassInfo(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.ClassInfo r0 = (javassist.bytecode.ClassInfo) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r3
            r1 = r5
            int r1 = r1.name
            java.lang.String r0 = r0.getUtf8Info(r1)
            java.lang.String r0 = javassist.bytecode.Descriptor.toJavaName(r0)
            return r0
    }

    public java.lang.String getClassInfoByDescriptor(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.ClassInfo r0 = (javassist.bytecode.ClassInfo) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r3
            r1 = r5
            int r1 = r1.name
            java.lang.String r0 = r0.getUtf8Info(r1)
            r6 = r0
            r0 = r6
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L24
            r0 = r6
            return r0
        L24:
            r0 = r6
            java.lang.String r0 = javassist.bytecode.Descriptor.of(r0)
            return r0
    }

    public int getNameAndTypeName(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.NameAndTypeInfo r0 = (javassist.bytecode.NameAndTypeInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.memberName
            return r0
    }

    public int getNameAndTypeDescriptor(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.NameAndTypeInfo r0 = (javassist.bytecode.NameAndTypeInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.typeDescriptor
            return r0
    }

    public int getMemberClass(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MemberrefInfo r0 = (javassist.bytecode.MemberrefInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.classIndex
            return r0
    }

    public int getMemberNameAndType(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MemberrefInfo r0 = (javassist.bytecode.MemberrefInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.nameAndTypeIndex
            return r0
    }

    public int getFieldrefClass(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.FieldrefInfo r0 = (javassist.bytecode.FieldrefInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.classIndex
            return r0
    }

    public java.lang.String getFieldrefClassName(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.FieldrefInfo r0 = (javassist.bytecode.FieldrefInfo) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r3
            r1 = r5
            int r1 = r1.classIndex
            java.lang.String r0 = r0.getClassInfo(r1)
            return r0
    }

    public int getFieldrefNameAndType(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.FieldrefInfo r0 = (javassist.bytecode.FieldrefInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.nameAndTypeIndex
            return r0
    }

    public java.lang.String getFieldrefName(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.FieldrefInfo r0 = (javassist.bytecode.FieldrefInfo) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r3
            r1 = r5
            int r1 = r1.nameAndTypeIndex
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.NameAndTypeInfo r0 = (javassist.bytecode.NameAndTypeInfo) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = r3
            r1 = r6
            int r1 = r1.memberName
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public java.lang.String getFieldrefType(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.FieldrefInfo r0 = (javassist.bytecode.FieldrefInfo) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r3
            r1 = r5
            int r1 = r1.nameAndTypeIndex
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.NameAndTypeInfo r0 = (javassist.bytecode.NameAndTypeInfo) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = r3
            r1 = r6
            int r1 = r1.typeDescriptor
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public int getMethodrefClass(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MemberrefInfo r0 = (javassist.bytecode.MemberrefInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.classIndex
            return r0
    }

    public java.lang.String getMethodrefClassName(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MemberrefInfo r0 = (javassist.bytecode.MemberrefInfo) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r3
            r1 = r5
            int r1 = r1.classIndex
            java.lang.String r0 = r0.getClassInfo(r1)
            return r0
    }

    public int getMethodrefNameAndType(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MemberrefInfo r0 = (javassist.bytecode.MemberrefInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.nameAndTypeIndex
            return r0
    }

    public java.lang.String getMethodrefName(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MemberrefInfo r0 = (javassist.bytecode.MemberrefInfo) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r3
            r1 = r5
            int r1 = r1.nameAndTypeIndex
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.NameAndTypeInfo r0 = (javassist.bytecode.NameAndTypeInfo) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = r3
            r1 = r6
            int r1 = r1.memberName
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public java.lang.String getMethodrefType(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MemberrefInfo r0 = (javassist.bytecode.MemberrefInfo) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r3
            r1 = r5
            int r1 = r1.nameAndTypeIndex
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.NameAndTypeInfo r0 = (javassist.bytecode.NameAndTypeInfo) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = r3
            r1 = r6
            int r1 = r1.typeDescriptor
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public int getInterfaceMethodrefClass(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MemberrefInfo r0 = (javassist.bytecode.MemberrefInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.classIndex
            return r0
    }

    public java.lang.String getInterfaceMethodrefClassName(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MemberrefInfo r0 = (javassist.bytecode.MemberrefInfo) r0
            r5 = r0
            r0 = r3
            r1 = r5
            int r1 = r1.classIndex
            java.lang.String r0 = r0.getClassInfo(r1)
            return r0
    }

    public int getInterfaceMethodrefNameAndType(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MemberrefInfo r0 = (javassist.bytecode.MemberrefInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.nameAndTypeIndex
            return r0
    }

    public java.lang.String getInterfaceMethodrefName(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MemberrefInfo r0 = (javassist.bytecode.MemberrefInfo) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r3
            r1 = r5
            int r1 = r1.nameAndTypeIndex
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.NameAndTypeInfo r0 = (javassist.bytecode.NameAndTypeInfo) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = r3
            r1 = r6
            int r1 = r1.memberName
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public java.lang.String getInterfaceMethodrefType(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MemberrefInfo r0 = (javassist.bytecode.MemberrefInfo) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r3
            r1 = r5
            int r1 = r1.nameAndTypeIndex
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.NameAndTypeInfo r0 = (javassist.bytecode.NameAndTypeInfo) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = r3
            r1 = r6
            int r1 = r1.typeDescriptor
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public java.lang.Object getLdcValue(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            boolean r0 = r0 instanceof javassist.bytecode.StringInfo
            if (r0 == 0) goto L18
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.getStringInfo(r1)
            r6 = r0
            goto L61
        L18:
            r0 = r5
            boolean r0 = r0 instanceof javassist.bytecode.FloatInfo
            if (r0 == 0) goto L2b
            r0 = r3
            r1 = r4
            float r0 = r0.getFloatInfo(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r6 = r0
            goto L61
        L2b:
            r0 = r5
            boolean r0 = r0 instanceof javassist.bytecode.IntegerInfo
            if (r0 == 0) goto L3e
            r0 = r3
            r1 = r4
            int r0 = r0.getIntegerInfo(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = r0
            goto L61
        L3e:
            r0 = r5
            boolean r0 = r0 instanceof javassist.bytecode.LongInfo
            if (r0 == 0) goto L51
            r0 = r3
            r1 = r4
            long r0 = r0.getLongInfo(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6 = r0
            goto L61
        L51:
            r0 = r5
            boolean r0 = r0 instanceof javassist.bytecode.DoubleInfo
            if (r0 == 0) goto L61
            r0 = r3
            r1 = r4
            double r0 = r0.getDoubleInfo(r1)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r6 = r0
        L61:
            r0 = r6
            return r0
    }

    public int getIntegerInfo(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.IntegerInfo r0 = (javassist.bytecode.IntegerInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.value
            return r0
    }

    public float getFloatInfo(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.FloatInfo r0 = (javassist.bytecode.FloatInfo) r0
            r5 = r0
            r0 = r5
            float r0 = r0.value
            return r0
    }

    public long getLongInfo(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.LongInfo r0 = (javassist.bytecode.LongInfo) r0
            r5 = r0
            r0 = r5
            long r0 = r0.value
            return r0
    }

    public double getDoubleInfo(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.DoubleInfo r0 = (javassist.bytecode.DoubleInfo) r0
            r5 = r0
            r0 = r5
            double r0 = r0.value
            return r0
    }

    public java.lang.String getStringInfo(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.StringInfo r0 = (javassist.bytecode.StringInfo) r0
            r5 = r0
            r0 = r3
            r1 = r5
            int r1 = r1.string
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public java.lang.String getUtf8Info(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.Utf8Info r0 = (javassist.bytecode.Utf8Info) r0
            r5 = r0
            r0 = r5
            java.lang.String r0 = r0.string
            return r0
    }

    public int getMethodHandleKind(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MethodHandleInfo r0 = (javassist.bytecode.MethodHandleInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.refKind
            return r0
    }

    public int getMethodHandleIndex(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MethodHandleInfo r0 = (javassist.bytecode.MethodHandleInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.refIndex
            return r0
    }

    public int getMethodTypeInfo(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MethodTypeInfo r0 = (javassist.bytecode.MethodTypeInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.descriptor
            return r0
    }

    public int getInvokeDynamicBootstrap(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.InvokeDynamicInfo r0 = (javassist.bytecode.InvokeDynamicInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.bootstrap
            return r0
    }

    public int getInvokeDynamicNameAndType(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.InvokeDynamicInfo r0 = (javassist.bytecode.InvokeDynamicInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.nameAndType
            return r0
    }

    public java.lang.String getInvokeDynamicType(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.InvokeDynamicInfo r0 = (javassist.bytecode.InvokeDynamicInfo) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r3
            r1 = r5
            int r1 = r1.nameAndType
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.NameAndTypeInfo r0 = (javassist.bytecode.NameAndTypeInfo) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = r3
            r1 = r6
            int r1 = r1.typeDescriptor
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public int getDynamicBootstrap(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.DynamicInfo r0 = (javassist.bytecode.DynamicInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.bootstrap
            return r0
    }

    public int getDynamicNameAndType(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.DynamicInfo r0 = (javassist.bytecode.DynamicInfo) r0
            r5 = r0
            r0 = r5
            int r0 = r0.nameAndType
            return r0
    }

    public java.lang.String getDynamicType(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.DynamicInfo r0 = (javassist.bytecode.DynamicInfo) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r3
            r1 = r5
            int r1 = r1.nameAndType
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.NameAndTypeInfo r0 = (javassist.bytecode.NameAndTypeInfo) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L21
            r0 = 0
            return r0
        L21:
            r0 = r3
            r1 = r6
            int r1 = r1.typeDescriptor
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public java.lang.String getModuleInfo(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.ModuleInfo r0 = (javassist.bytecode.ModuleInfo) r0
            r5 = r0
            r0 = r3
            r1 = r5
            int r1 = r1.name
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public java.lang.String getPackageInfo(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.PackageInfo r0 = (javassist.bytecode.PackageInfo) r0
            r5 = r0
            r0 = r3
            r1 = r5
            int r1 = r1.name
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public int isConstructor(java.lang.String r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "<init>"
            r3 = r7
            int r0 = r0.isMember(r1, r2, r3)
            return r0
    }

    public int isMember(java.lang.String r4, java.lang.String r5, int r6) {
            r3 = this;
            r0 = r3
            r1 = r6
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MemberrefInfo r0 = (javassist.bytecode.MemberrefInfo) r0
            r7 = r0
            r0 = r3
            r1 = r7
            int r1 = r1.classIndex
            java.lang.String r0 = r0.getClassInfo(r1)
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            r0 = r3
            r1 = r7
            int r1 = r1.nameAndTypeIndex
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.NameAndTypeInfo r0 = (javassist.bytecode.NameAndTypeInfo) r0
            r8 = r0
            r0 = r3
            r1 = r8
            int r1 = r1.memberName
            java.lang.String r0 = r0.getUtf8Info(r1)
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            r0 = r8
            int r0 = r0.typeDescriptor
            return r0
        L3e:
            r0 = 0
            return r0
    }

    public java.lang.String eqMember(java.lang.String r4, java.lang.String r5, int r6) {
            r3 = this;
            r0 = r3
            r1 = r6
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.MemberrefInfo r0 = (javassist.bytecode.MemberrefInfo) r0
            r7 = r0
            r0 = r3
            r1 = r7
            int r1 = r1.nameAndTypeIndex
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            javassist.bytecode.NameAndTypeInfo r0 = (javassist.bytecode.NameAndTypeInfo) r0
            r8 = r0
            r0 = r3
            r1 = r8
            int r1 = r1.memberName
            java.lang.String r0 = r0.getUtf8Info(r1)
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L42
            r0 = r3
            r1 = r8
            int r1 = r1.typeDescriptor
            java.lang.String r0 = r0.getUtf8Info(r1)
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L42
            r0 = r3
            r1 = r7
            int r1 = r1.classIndex
            java.lang.String r0 = r0.getClassInfo(r1)
            return r0
        L42:
            r0 = 0
            return r0
    }

    private int addItem0(javassist.bytecode.ConstInfo r6) {
            r5 = this;
            r0 = r5
            javassist.bytecode.LongVector r0 = r0.items
            r1 = r6
            r0.addElement(r1)
            r0 = r5
            r1 = r0
            int r1 = r1.numOfItems
            r2 = r1; r1 = r0; r0 = r2; 
            r3 = 1
            int r2 = r2 + r3
            r1.numOfItems = r2
            return r0
    }

    private int addItem(javassist.bytecode.ConstInfo r6) {
            r5 = this;
            r0 = r5
            java.util.Map<javassist.bytecode.ConstInfo, javassist.bytecode.ConstInfo> r0 = r0.itemsCache
            if (r0 != 0) goto L12
            r0 = r5
            r1 = r5
            javassist.bytecode.LongVector r1 = r1.items
            java.util.Map r1 = makeItemsCache(r1)
            r0.itemsCache = r1
        L12:
            r0 = r5
            java.util.Map<javassist.bytecode.ConstInfo, javassist.bytecode.ConstInfo> r0 = r0.itemsCache
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.ConstInfo r0 = (javassist.bytecode.ConstInfo) r0
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L29
            r0 = r7
            int r0 = r0.index
            return r0
        L29:
            r0 = r5
            javassist.bytecode.LongVector r0 = r0.items
            r1 = r6
            r0.addElement(r1)
            r0 = r5
            java.util.Map<javassist.bytecode.ConstInfo, javassist.bytecode.ConstInfo> r0 = r0.itemsCache
            r1 = r6
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            r1 = r0
            int r1 = r1.numOfItems
            r2 = r1; r1 = r0; r0 = r2; 
            r3 = 1
            int r2 = r2 + r3
            r1.numOfItems = r2
            return r0
    }

    public int copy(int r6, javassist.bytecode.ConstPool r7, java.util.Map<java.lang.String, java.lang.String> r8) {
            r5 = this;
            r0 = r6
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r5
            r1 = r6
            javassist.bytecode.ConstInfo r0 = r0.getItem(r1)
            r9 = r0
            r0 = r9
            r1 = r5
            r2 = r7
            r3 = r8
            int r0 = r0.copy(r1, r2, r3)
            return r0
    }

    int addConstInfoPadding() {
            r5 = this;
            r0 = r5
            javassist.bytecode.ConstInfoPadding r1 = new javassist.bytecode.ConstInfoPadding
            r2 = r1
            r3 = r5
            int r3 = r3.numOfItems
            r2.<init>(r3)
            int r0 = r0.addItem0(r1)
            return r0
    }

    public int addClassInfo(javassist.CtClass r4) {
            r3 = this;
            r0 = r4
            javassist.CtClass r1 = javassist.bytecode.ConstPool.THIS
            if (r0 != r1) goto Lc
            r0 = r3
            int r0 = r0.thisClassInfo
            return r0
        Lc:
            r0 = r4
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L1c
            r0 = r3
            r1 = r4
            java.lang.String r1 = r1.getName()
            int r0 = r0.addClassInfo(r1)
            return r0
        L1c:
            r0 = r3
            r1 = r4
            java.lang.String r1 = javassist.bytecode.Descriptor.toJvmName(r1)
            int r0 = r0.addClassInfo(r1)
            return r0
    }

    public int addClassInfo(java.lang.String r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            java.lang.String r1 = javassist.bytecode.Descriptor.toJvmName(r1)
            int r0 = r0.addUtf8Info(r1)
            r8 = r0
            r0 = r6
            javassist.bytecode.ClassInfo r1 = new javassist.bytecode.ClassInfo
            r2 = r1
            r3 = r8
            r4 = r6
            int r4 = r4.numOfItems
            r2.<init>(r3, r4)
            int r0 = r0.addItem(r1)
            return r0
    }

    public int addNameAndTypeInfo(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            r1 = r5
            r2 = r6
            int r1 = r1.addUtf8Info(r2)
            r2 = r5
            r3 = r7
            int r2 = r2.addUtf8Info(r3)
            int r0 = r0.addNameAndTypeInfo(r1, r2)
            return r0
    }

    public int addNameAndTypeInfo(int r8, int r9) {
            r7 = this;
            r0 = r7
            javassist.bytecode.NameAndTypeInfo r1 = new javassist.bytecode.NameAndTypeInfo
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r7
            int r5 = r5.numOfItems
            r2.<init>(r3, r4, r5)
            int r0 = r0.addItem(r1)
            return r0
    }

    public int addFieldrefInfo(int r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            r0 = r4
            r1 = r6
            r2 = r7
            int r0 = r0.addNameAndTypeInfo(r1, r2)
            r8 = r0
            r0 = r4
            r1 = r5
            r2 = r8
            int r0 = r0.addFieldrefInfo(r1, r2)
            return r0
    }

    public int addFieldrefInfo(int r8, int r9) {
            r7 = this;
            r0 = r7
            javassist.bytecode.FieldrefInfo r1 = new javassist.bytecode.FieldrefInfo
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r7
            int r5 = r5.numOfItems
            r2.<init>(r3, r4, r5)
            int r0 = r0.addItem(r1)
            return r0
    }

    public int addMethodrefInfo(int r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            r0 = r4
            r1 = r6
            r2 = r7
            int r0 = r0.addNameAndTypeInfo(r1, r2)
            r8 = r0
            r0 = r4
            r1 = r5
            r2 = r8
            int r0 = r0.addMethodrefInfo(r1, r2)
            return r0
    }

    public int addMethodrefInfo(int r8, int r9) {
            r7 = this;
            r0 = r7
            javassist.bytecode.MethodrefInfo r1 = new javassist.bytecode.MethodrefInfo
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r7
            int r5 = r5.numOfItems
            r2.<init>(r3, r4, r5)
            int r0 = r0.addItem(r1)
            return r0
    }

    public int addInterfaceMethodrefInfo(int r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            r0 = r4
            r1 = r6
            r2 = r7
            int r0 = r0.addNameAndTypeInfo(r1, r2)
            r8 = r0
            r0 = r4
            r1 = r5
            r2 = r8
            int r0 = r0.addInterfaceMethodrefInfo(r1, r2)
            return r0
    }

    public int addInterfaceMethodrefInfo(int r8, int r9) {
            r7 = this;
            r0 = r7
            javassist.bytecode.InterfaceMethodrefInfo r1 = new javassist.bytecode.InterfaceMethodrefInfo
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r7
            int r5 = r5.numOfItems
            r2.<init>(r3, r4, r5)
            int r0 = r0.addItem(r1)
            return r0
    }

    public int addStringInfo(java.lang.String r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            int r0 = r0.addUtf8Info(r1)
            r8 = r0
            r0 = r6
            javassist.bytecode.StringInfo r1 = new javassist.bytecode.StringInfo
            r2 = r1
            r3 = r8
            r4 = r6
            int r4 = r4.numOfItems
            r2.<init>(r3, r4)
            int r0 = r0.addItem(r1)
            return r0
    }

    public int addIntegerInfo(int r7) {
            r6 = this;
            r0 = r6
            javassist.bytecode.IntegerInfo r1 = new javassist.bytecode.IntegerInfo
            r2 = r1
            r3 = r7
            r4 = r6
            int r4 = r4.numOfItems
            r2.<init>(r3, r4)
            int r0 = r0.addItem(r1)
            return r0
    }

    public int addFloatInfo(float r7) {
            r6 = this;
            r0 = r6
            javassist.bytecode.FloatInfo r1 = new javassist.bytecode.FloatInfo
            r2 = r1
            r3 = r7
            r4 = r6
            int r4 = r4.numOfItems
            r2.<init>(r3, r4)
            int r0 = r0.addItem(r1)
            return r0
    }

    public int addLongInfo(long r8) {
            r7 = this;
            r0 = r7
            javassist.bytecode.LongInfo r1 = new javassist.bytecode.LongInfo
            r2 = r1
            r3 = r8
            r4 = r7
            int r4 = r4.numOfItems
            r2.<init>(r3, r4)
            int r0 = r0.addItem(r1)
            r10 = r0
            r0 = r10
            r1 = r7
            int r1 = r1.numOfItems
            r2 = 1
            int r1 = r1 - r2
            if (r0 != r1) goto L20
            r0 = r7
            int r0 = r0.addConstInfoPadding()
        L20:
            r0 = r10
            return r0
    }

    public int addDoubleInfo(double r8) {
            r7 = this;
            r0 = r7
            javassist.bytecode.DoubleInfo r1 = new javassist.bytecode.DoubleInfo
            r2 = r1
            r3 = r8
            r4 = r7
            int r4 = r4.numOfItems
            r2.<init>(r3, r4)
            int r0 = r0.addItem(r1)
            r10 = r0
            r0 = r10
            r1 = r7
            int r1 = r1.numOfItems
            r2 = 1
            int r1 = r1 - r2
            if (r0 != r1) goto L20
            r0 = r7
            int r0 = r0.addConstInfoPadding()
        L20:
            r0 = r10
            return r0
    }

    public int addUtf8Info(java.lang.String r7) {
            r6 = this;
            r0 = r6
            javassist.bytecode.Utf8Info r1 = new javassist.bytecode.Utf8Info
            r2 = r1
            r3 = r7
            r4 = r6
            int r4 = r4.numOfItems
            r2.<init>(r3, r4)
            int r0 = r0.addItem(r1)
            return r0
    }

    public int addMethodHandleInfo(int r8, int r9) {
            r7 = this;
            r0 = r7
            javassist.bytecode.MethodHandleInfo r1 = new javassist.bytecode.MethodHandleInfo
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r7
            int r5 = r5.numOfItems
            r2.<init>(r3, r4, r5)
            int r0 = r0.addItem(r1)
            return r0
    }

    public int addMethodTypeInfo(int r7) {
            r6 = this;
            r0 = r6
            javassist.bytecode.MethodTypeInfo r1 = new javassist.bytecode.MethodTypeInfo
            r2 = r1
            r3 = r7
            r4 = r6
            int r4 = r4.numOfItems
            r2.<init>(r3, r4)
            int r0 = r0.addItem(r1)
            return r0
    }

    public int addInvokeDynamicInfo(int r8, int r9) {
            r7 = this;
            r0 = r7
            javassist.bytecode.InvokeDynamicInfo r1 = new javassist.bytecode.InvokeDynamicInfo
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r7
            int r5 = r5.numOfItems
            r2.<init>(r3, r4, r5)
            int r0 = r0.addItem(r1)
            return r0
    }

    public int addDynamicInfo(int r8, int r9) {
            r7 = this;
            r0 = r7
            javassist.bytecode.DynamicInfo r1 = new javassist.bytecode.DynamicInfo
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r7
            int r5 = r5.numOfItems
            r2.<init>(r3, r4, r5)
            int r0 = r0.addItem(r1)
            return r0
    }

    public int addModuleInfo(int r7) {
            r6 = this;
            r0 = r6
            javassist.bytecode.ModuleInfo r1 = new javassist.bytecode.ModuleInfo
            r2 = r1
            r3 = r7
            r4 = r6
            int r4 = r4.numOfItems
            r2.<init>(r3, r4)
            int r0 = r0.addItem(r1)
            return r0
    }

    public int addPackageInfo(int r7) {
            r6 = this;
            r0 = r6
            javassist.bytecode.PackageInfo r1 = new javassist.bytecode.PackageInfo
            r2 = r1
            r3 = r7
            r4 = r6
            int r4 = r4.numOfItems
            r2.<init>(r3, r4)
            int r0 = r0.addItem(r1)
            return r0
    }

    public java.util.Set<java.lang.String> getClassNames() {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r3
            javassist.bytecode.LongVector r0 = r0.items
            r5 = r0
            r0 = r3
            int r0 = r0.numOfItems
            r6 = r0
            r0 = 1
            r7 = r0
        L15:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L3b
            r0 = r5
            r1 = r7
            javassist.bytecode.ConstInfo r0 = r0.elementAt(r1)
            r1 = r3
            java.lang.String r0 = r0.getClassName(r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L35
            r0 = r4
            r1 = r8
            boolean r0 = r0.add(r1)
        L35:
            int r7 = r7 + 1
            goto L15
        L3b:
            r0 = r4
            return r0
    }

    public void renameClass(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r0 = r6
            javassist.bytecode.LongVector r0 = r0.items
            r9 = r0
            r0 = r6
            int r0 = r0.numOfItems
            r10 = r0
            r0 = 1
            r11 = r0
        Le:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L2f
            r0 = r9
            r1 = r11
            javassist.bytecode.ConstInfo r0 = r0.elementAt(r1)
            r12 = r0
            r0 = r12
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r6
            java.util.Map<javassist.bytecode.ConstInfo, javassist.bytecode.ConstInfo> r4 = r4.itemsCache
            r0.renameClass(r1, r2, r3, r4)
            int r11 = r11 + 1
            goto Le
        L2f:
            return
    }

    public void renameClass(java.util.Map<java.lang.String, java.lang.String> r6) {
            r5 = this;
            r0 = r5
            javassist.bytecode.LongVector r0 = r0.items
            r7 = r0
            r0 = r5
            int r0 = r0.numOfItems
            r8 = r0
            r0 = 1
            r9 = r0
        Ld:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L2c
            r0 = r7
            r1 = r9
            javassist.bytecode.ConstInfo r0 = r0.elementAt(r1)
            r10 = r0
            r0 = r10
            r1 = r5
            r2 = r6
            r3 = r5
            java.util.Map<javassist.bytecode.ConstInfo, javassist.bytecode.ConstInfo> r3 = r3.itemsCache
            r0.renameClass(r1, r2, r3)
            int r9 = r9 + 1
            goto Ld
        L2c:
            return
    }

    private void read(java.io.DataInputStream r6) throws java.io.IOException {
            r5 = this;
            r0 = r6
            int r0 = r0.readUnsignedShort()
            r7 = r0
            r0 = r5
            javassist.bytecode.LongVector r1 = new javassist.bytecode.LongVector
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.items = r1
            r0 = r5
            r1 = 0
            r0.numOfItems = r1
            r0 = r5
            r1 = 0
            int r0 = r0.addItem0(r1)
        L1c:
            int r7 = r7 + (-1)
            r0 = r7
            if (r0 <= 0) goto L3f
            r0 = r5
            r1 = r6
            int r0 = r0.readOne(r1)
            r8 = r0
            r0 = r8
            r1 = 5
            if (r0 == r1) goto L34
            r0 = r8
            r1 = 6
            if (r0 != r1) goto L3c
        L34:
            r0 = r5
            int r0 = r0.addConstInfoPadding()
            int r7 = r7 + (-1)
        L3c:
            goto L1c
        L3f:
            return
    }

    private static java.util.Map<javassist.bytecode.ConstInfo, javassist.bytecode.ConstInfo> makeItemsCache(javassist.bytecode.LongVector r4) {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = 1
            r6 = r0
        La:
            r0 = r4
            r1 = r6
            int r6 = r6 + 1
            javassist.bytecode.ConstInfo r0 = r0.elementAt(r1)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L1a
            goto L26
        L1a:
            r0 = r5
            r1 = r7
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
            goto La
        L26:
            r0 = r5
            return r0
    }

    private int readOne(java.io.DataInputStream r6) throws java.io.IOException {
            r5 = this;
            r0 = r6
            int r0 = r0.readUnsignedByte()
            r8 = r0
            r0 = r8
            switch(r0) {
                case 1: goto L64;
                case 2: goto L174;
                case 3: goto L74;
                case 4: goto L84;
                case 5: goto L94;
                case 6: goto La4;
                case 7: goto Lb4;
                case 8: goto Lc4;
                case 9: goto Ld4;
                case 10: goto Le4;
                case 11: goto Lf4;
                case 12: goto L104;
                case 13: goto L174;
                case 14: goto L174;
                case 15: goto L114;
                case 16: goto L124;
                case 17: goto L134;
                case 18: goto L144;
                case 19: goto L154;
                case 20: goto L164;
                default: goto L174;
            }
        L64:
            javassist.bytecode.Utf8Info r0 = new javassist.bytecode.Utf8Info
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        L74:
            javassist.bytecode.IntegerInfo r0 = new javassist.bytecode.IntegerInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        L84:
            javassist.bytecode.FloatInfo r0 = new javassist.bytecode.FloatInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        L94:
            javassist.bytecode.LongInfo r0 = new javassist.bytecode.LongInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        La4:
            javassist.bytecode.DoubleInfo r0 = new javassist.bytecode.DoubleInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        Lb4:
            javassist.bytecode.ClassInfo r0 = new javassist.bytecode.ClassInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        Lc4:
            javassist.bytecode.StringInfo r0 = new javassist.bytecode.StringInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        Ld4:
            javassist.bytecode.FieldrefInfo r0 = new javassist.bytecode.FieldrefInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        Le4:
            javassist.bytecode.MethodrefInfo r0 = new javassist.bytecode.MethodrefInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        Lf4:
            javassist.bytecode.InterfaceMethodrefInfo r0 = new javassist.bytecode.InterfaceMethodrefInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        L104:
            javassist.bytecode.NameAndTypeInfo r0 = new javassist.bytecode.NameAndTypeInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        L114:
            javassist.bytecode.MethodHandleInfo r0 = new javassist.bytecode.MethodHandleInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        L124:
            javassist.bytecode.MethodTypeInfo r0 = new javassist.bytecode.MethodTypeInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        L134:
            javassist.bytecode.DynamicInfo r0 = new javassist.bytecode.DynamicInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        L144:
            javassist.bytecode.InvokeDynamicInfo r0 = new javassist.bytecode.InvokeDynamicInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        L154:
            javassist.bytecode.ModuleInfo r0 = new javassist.bytecode.ModuleInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        L164:
            javassist.bytecode.PackageInfo r0 = new javassist.bytecode.PackageInfo
            r1 = r0
            r2 = r6
            r3 = r5
            int r3 = r3.numOfItems
            r1.<init>(r2, r3)
            r7 = r0
            goto L19d
        L174:
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "invalid constant type: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " at "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.numOfItems
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L19d:
            r0 = r5
            r1 = r7
            int r0 = r0.addItem0(r1)
            r0 = r8
            return r0
    }

    public void write(java.io.DataOutputStream r6) throws java.io.IOException {
            r5 = this;
            r0 = r5
            int r0 = r0.numOfItems
            if (r0 < 0) goto L11
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r5
            int r1 = r1.numOfItems
            if (r0 >= r1) goto L30
        L11:
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "too many constant pool items "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            int r3 = r3.numOfItems
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L30:
            r0 = r6
            r1 = r5
            int r1 = r1.numOfItems
            r0.writeShort(r1)
            r0 = r5
            javassist.bytecode.LongVector r0 = r0.items
            r7 = r0
            r0 = r5
            int r0 = r0.numOfItems
            r8 = r0
            r0 = 1
            r9 = r0
        L45:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L5b
            r0 = r7
            r1 = r9
            javassist.bytecode.ConstInfo r0 = r0.elementAt(r1)
            r1 = r6
            r0.write(r1)
            int r9 = r9 + 1
            goto L45
        L5b:
            return
    }

    public void print() {
            r6 = this;
            r0 = r6
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r2 = r1
            java.io.PrintStream r3 = java.lang.System.out
            r4 = 1
            r2.<init>(r3, r4)
            r0.print(r1)
            return
    }

    public void print(java.io.PrintWriter r4) {
            r3 = this;
            r0 = r3
            int r0 = r0.numOfItems
            r5 = r0
            r0 = 1
            r6 = r0
        L7:
            r0 = r6
            r1 = r5
            if (r0 >= r1) goto L2a
            r0 = r4
            r1 = r6
            r0.print(r1)
            r0 = r4
            java.lang.String r1 = " "
            r0.print(r1)
            r0 = r3
            javassist.bytecode.LongVector r0 = r0.items
            r1 = r6
            javassist.bytecode.ConstInfo r0 = r0.elementAt(r1)
            r1 = r4
            r0.print(r1)
            int r6 = r6 + 1
            goto L7
        L2a:
            return
    }

    static {
            r0 = 0
            javassist.bytecode.ConstPool.THIS = r0
            return
    }
}
