package org.apache.commons.compress.harmony.unpack200;

/* JADX INFO: loaded from: classes2.dex */
public class AttributeLayout implements org.apache.commons.compress.harmony.unpack200.IMatcher {
    public static final java.lang.String ACC_ABSTRACT = "ACC_ABSTRACT";
    public static final java.lang.String ACC_ANNOTATION = "ACC_ANNOTATION";
    public static final java.lang.String ACC_ENUM = "ACC_ENUM";
    public static final java.lang.String ACC_FINAL = "ACC_FINAL";
    public static final java.lang.String ACC_INTERFACE = "ACC_INTERFACE";
    public static final java.lang.String ACC_NATIVE = "ACC_NATIVE";
    public static final java.lang.String ACC_PRIVATE = "ACC_PRIVATE";
    public static final java.lang.String ACC_PROTECTED = "ACC_PROTECTED";
    public static final java.lang.String ACC_PUBLIC = "ACC_PUBLIC";
    public static final java.lang.String ACC_STATIC = "ACC_STATIC";
    public static final java.lang.String ACC_STRICT = "ACC_STRICT";
    public static final java.lang.String ACC_SYNCHRONIZED = "ACC_SYNCHRONIZED";
    public static final java.lang.String ACC_SYNTHETIC = "ACC_SYNTHETIC";
    public static final java.lang.String ACC_TRANSIENT = "ACC_TRANSIENT";
    public static final java.lang.String ACC_VOLATILE = "ACC_VOLATILE";
    public static final java.lang.String ATTRIBUTE_ANNOTATION_DEFAULT = "AnnotationDefault";
    public static final java.lang.String ATTRIBUTE_CLASS_FILE_VERSION = "class-file version";
    public static final java.lang.String ATTRIBUTE_CODE = "Code";
    public static final java.lang.String ATTRIBUTE_CONSTANT_VALUE = "ConstantValue";
    public static final java.lang.String ATTRIBUTE_DEPRECATED = "Deprecated";
    public static final java.lang.String ATTRIBUTE_ENCLOSING_METHOD = "EnclosingMethod";
    public static final java.lang.String ATTRIBUTE_EXCEPTIONS = "Exceptions";
    public static final java.lang.String ATTRIBUTE_INNER_CLASSES = "InnerClasses";
    public static final java.lang.String ATTRIBUTE_LINE_NUMBER_TABLE = "LineNumberTable";
    public static final java.lang.String ATTRIBUTE_LOCAL_VARIABLE_TABLE = "LocalVariableTable";
    public static final java.lang.String ATTRIBUTE_LOCAL_VARIABLE_TYPE_TABLE = "LocalVariableTypeTable";
    public static final java.lang.String ATTRIBUTE_RUNTIME_INVISIBLE_ANNOTATIONS = "RuntimeInvisibleAnnotations";
    public static final java.lang.String ATTRIBUTE_RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS = "RuntimeInvisibleParameterAnnotations";
    public static final java.lang.String ATTRIBUTE_RUNTIME_VISIBLE_ANNOTATIONS = "RuntimeVisibleAnnotations";
    public static final java.lang.String ATTRIBUTE_RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS = "RuntimeVisibleParameterAnnotations";
    public static final java.lang.String ATTRIBUTE_SIGNATURE = "Signature";
    public static final java.lang.String ATTRIBUTE_SOURCE_FILE = "SourceFile";
    public static final int CONTEXT_CLASS = 0;
    public static final int CONTEXT_CODE = 3;
    public static final int CONTEXT_FIELD = 1;
    public static final int CONTEXT_METHOD = 2;
    public static final java.lang.String[] contextNames = null;
    private int backwardsCallCount;
    private final int context;
    private final int index;
    private final boolean isDefault;
    private final java.lang.String layout;
    private long mask;
    private final java.lang.String name;

    static {
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "Class"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "Field"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "Method"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "Code"
            r0[r1] = r2
            org.apache.commons.compress.harmony.unpack200.AttributeLayout.contextNames = r0
            return
    }

    public AttributeLayout(java.lang.String r7, int r8, java.lang.String r9, int r10) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r6 = this;
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public AttributeLayout(java.lang.String r3, int r4, java.lang.String r5, int r6, boolean r7) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            r2.<init>()
            r2.index = r6
            r2.context = r4
            if (r6 < 0) goto Lf
            r0 = 1
            long r0 = r0 << r6
            r2.mask = r0
            goto L13
        Lf:
            r0 = 0
            r2.mask = r0
        L13:
            if (r4 == 0) goto L34
            r6 = 3
            if (r4 == r6) goto L34
            r6 = 1
            if (r4 == r6) goto L34
            r6 = 2
            if (r4 != r6) goto L1f
            goto L34
        L1f:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r3 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Attribute context out of range: "
            r5.<init>(r6)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L34:
            if (r5 == 0) goto L4d
            if (r3 == 0) goto L45
            int r4 = r3.length()
            if (r4 == 0) goto L45
            r2.name = r3
            r2.layout = r5
            r2.isDefault = r7
            return
        L45:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r3 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r4 = "Cannot have an unnamed layout"
            r3.<init>(r4)
            throw r3
        L4d:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r3 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r4 = "Cannot have a null layout"
            r3.<init>(r4)
            throw r3
    }

    private static org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry getValue(java.lang.String r4, long r5, org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r7) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            java.lang.String r0 = "R"
            boolean r0 = r4.startsWith(r0)
            r1 = 1
            if (r0 == 0) goto L31
            r0 = 78
            int r0 = r4.indexOf(r0)
            r2 = -1
            if (r0 == r2) goto L15
            r2 = 1
            long r5 = r5 - r2
        L15:
            java.lang.String r0 = "RU"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L22
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r4 = r7.getValue(r1, r5)
            return r4
        L22:
            java.lang.String r0 = "RS"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L73
            r4 = 8
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r4 = r7.getValue(r4, r5)
            return r4
        L31:
            java.lang.String r0 = "K"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L73
            char r0 = r4.charAt(r1)
            r1 = 67
            if (r0 == r1) goto L6d
            r1 = 68
            if (r0 == r1) goto L67
            r1 = 70
            if (r0 == r1) goto L61
            r1 = 83
            if (r0 == r1) goto L5b
            r1 = 73
            if (r0 == r1) goto L6d
            r1 = 74
            if (r0 != r1) goto L73
            r4 = 4
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r4 = r7.getValue(r4, r5)
            return r4
        L5b:
            r4 = 6
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r4 = r7.getValue(r4, r5)
            return r4
        L61:
            r4 = 3
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r4 = r7.getValue(r4, r5)
            return r4
        L67:
            r4 = 5
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r4 = r7.getValue(r4, r5)
            return r4
        L6d:
            r4 = 2
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r4 = r7.getValue(r4, r5)
            return r4
        L73:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r5 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Unknown layout encoding: "
            r6.<init>(r7)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public org.apache.commons.compress.harmony.pack200.Codec getCodec() {
            r2 = this;
            java.lang.String r0 = r2.layout
            r1 = 79
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto Ld
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = org.apache.commons.compress.harmony.pack200.Codec.BRANCH5
            return r0
        Ld:
            java.lang.String r0 = r2.layout
            r1 = 80
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto L1a
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = org.apache.commons.compress.harmony.pack200.Codec.BCI5
            return r0
        L1a:
            java.lang.String r0 = r2.layout
            r1 = 83
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto L3b
            java.lang.String r0 = r2.layout
            java.lang.String r1 = "KS"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L3b
            java.lang.String r0 = r2.layout
            java.lang.String r1 = "RS"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L3b
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = org.apache.commons.compress.harmony.pack200.Codec.SIGNED5
            return r0
        L3b:
            java.lang.String r0 = r2.layout
            r1 = 66
            int r0 = r0.indexOf(r1)
            if (r0 < 0) goto L48
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = org.apache.commons.compress.harmony.pack200.Codec.BYTE1
            return r0
        L48:
            org.apache.commons.compress.harmony.pack200.BHSDCodec r0 = org.apache.commons.compress.harmony.pack200.Codec.UNSIGNED5
            return r0
    }

    public int getContext() {
            r1 = this;
            int r0 = r1.context
            return r0
    }

    public int getIndex() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    public java.lang.String getLayout() {
            r1 = this;
            java.lang.String r0 = r1.layout
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry getValue(long r3, java.lang.String r5, org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r6) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r2 = this;
            java.lang.String r0 = r2.layout
            java.lang.String r1 = "KQ"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L11
            java.lang.String r5 = r2.layout
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r3 = getValue(r5, r3, r6)
            return r3
        L11:
            java.lang.String r0 = "Ljava/lang/String;"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L20
            java.lang.String r5 = "KS"
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r3 = getValue(r5, r3, r6)
            return r3
        L20:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "K"
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = r2.layout
            r1 = 2
            java.lang.String r0 = r0.substring(r1)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r3 = getValue(r5, r3, r6)
            return r3
    }

    public org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry getValue(long r2, org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r4) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r1 = this;
            java.lang.String r0 = r1.layout
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r2 = getValue(r0, r2, r4)
            return r2
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.name
            r1 = 31
            if (r0 == 0) goto Lc
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            goto Ld
        Lc:
            r0 = 1
        Ld:
            java.lang.String r2 = r3.layout
            if (r2 == 0) goto L18
            int r0 = r0 * 31
            int r2 = r2.hashCode()
            int r0 = r0 + r2
        L18:
            int r0 = r0 * r1
            int r2 = r3.index
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r1 = r3.context
            int r0 = r0 + r1
            return r0
    }

    public boolean isDefaultLayout() {
            r1 = this;
            boolean r0 = r1.isDefault
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.IMatcher
    public boolean matches(long r3) {
            r2 = this;
            long r0 = r2.mask
            long r3 = r3 & r0
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto Lb
            r3 = 1
            goto Lc
        Lb:
            r3 = 0
        Lc:
            return r3
    }

    public int numBackwardsCallables() {
            r2 = this;
            java.lang.String r0 = "*"
            java.lang.String r1 = r2.layout
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            int r0 = r2.backwardsCallCount
            return r0
    }

    public void setBackwardsCallCount(int r1) {
            r0 = this;
            r0.backwardsCallCount = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String[] r1 = org.apache.commons.compress.harmony.unpack200.AttributeLayout.contextNames
            int r2 = r3.context
            r1 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.name
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
