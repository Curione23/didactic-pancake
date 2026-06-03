package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute.class */
public class SignatureAttribute extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "Signature";

    /* JADX INFO: renamed from: javassist.bytecode.SignatureAttribute$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$ArrayType.class */
    public static class ArrayType extends javassist.bytecode.SignatureAttribute.ObjectType {
        int dim;
        javassist.bytecode.SignatureAttribute.Type componentType;

        public ArrayType(int r4, javassist.bytecode.SignatureAttribute.Type r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.dim = r1
                r0 = r3
                r1 = r5
                r0.componentType = r1
                return
        }

        public int getDimension() {
                r2 = this;
                r0 = r2
                int r0 = r0.dim
                return r0
        }

        public javassist.bytecode.SignatureAttribute.Type getComponentType() {
                r2 = this;
                r0 = r2
                javassist.bytecode.SignatureAttribute$Type r0 = r0.componentType
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r2 = r4
                javassist.bytecode.SignatureAttribute$Type r2 = r2.componentType
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                r5 = r0
                r0 = 0
                r6 = r0
            L11:
                r0 = r6
                r1 = r4
                int r1 = r1.dim
                if (r0 >= r1) goto L26
                r0 = r5
                java.lang.String r1 = "[]"
                java.lang.StringBuilder r0 = r0.append(r1)
                int r6 = r6 + 1
                goto L11
            L26:
                r0 = r5
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // javassist.bytecode.SignatureAttribute.Type
        void encode(java.lang.StringBuilder r4) {
                r3 = this;
                r0 = 0
                r5 = r0
            L2:
                r0 = r5
                r1 = r3
                int r1 = r1.dim
                if (r0 >= r1) goto L17
                r0 = r4
                r1 = 91
                java.lang.StringBuilder r0 = r0.append(r1)
                int r5 = r5 + 1
                goto L2
            L17:
                r0 = r3
                javassist.bytecode.SignatureAttribute$Type r0 = r0.componentType
                r1 = r4
                r0.encode(r1)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$BaseType.class */
    public static class BaseType extends javassist.bytecode.SignatureAttribute.Type {
        char descriptor;

        BaseType(char r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.descriptor = r1
                return
        }

        public BaseType(java.lang.String r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                java.lang.String r1 = javassist.bytecode.Descriptor.of(r1)
                r2 = 0
                char r1 = r1.charAt(r2)
                r0.<init>(r1)
                return
        }

        public char getDescriptor() {
                r2 = this;
                r0 = r2
                char r0 = r0.descriptor
                return r0
        }

        public javassist.CtClass getCtlass() {
                r2 = this;
                r0 = r2
                char r0 = r0.descriptor
                javassist.CtClass r0 = javassist.bytecode.Descriptor.toPrimitiveClass(r0)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                r0 = r2
                char r0 = r0.descriptor
                java.lang.String r0 = java.lang.Character.toString(r0)
                java.lang.String r0 = javassist.bytecode.Descriptor.toClassName(r0)
                return r0
        }

        @Override // javassist.bytecode.SignatureAttribute.Type
        void encode(java.lang.StringBuilder r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                char r1 = r1.descriptor
                java.lang.StringBuilder r0 = r0.append(r1)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$ClassSignature.class */
    public static class ClassSignature {
        javassist.bytecode.SignatureAttribute.TypeParameter[] params;
        javassist.bytecode.SignatureAttribute.ClassType superClass;
        javassist.bytecode.SignatureAttribute.ClassType[] interfaces;

        public ClassSignature(javassist.bytecode.SignatureAttribute.TypeParameter[] r4, javassist.bytecode.SignatureAttribute.ClassType r5, javassist.bytecode.SignatureAttribute.ClassType[] r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                if (r1 != 0) goto L10
                r1 = 0
                javassist.bytecode.SignatureAttribute$TypeParameter[] r1 = new javassist.bytecode.SignatureAttribute.TypeParameter[r1]
                goto L11
            L10:
                r1 = r4
            L11:
                r0.params = r1
                r0 = r3
                r1 = r5
                if (r1 != 0) goto L1f
                javassist.bytecode.SignatureAttribute$ClassType r1 = javassist.bytecode.SignatureAttribute.ClassType.OBJECT
                goto L20
            L1f:
                r1 = r5
            L20:
                r0.superClass = r1
                r0 = r3
                r1 = r6
                if (r1 != 0) goto L2f
                r1 = 0
                javassist.bytecode.SignatureAttribute$ClassType[] r1 = new javassist.bytecode.SignatureAttribute.ClassType[r1]
                goto L30
            L2f:
                r1 = r6
            L30:
                r0.interfaces = r1
                return
        }

        public ClassSignature(javassist.bytecode.SignatureAttribute.TypeParameter[] r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = 0
                r3 = 0
                r0.<init>(r1, r2, r3)
                return
        }

        public javassist.bytecode.SignatureAttribute.TypeParameter[] getParameters() {
                r2 = this;
                r0 = r2
                javassist.bytecode.SignatureAttribute$TypeParameter[] r0 = r0.params
                return r0
        }

        public javassist.bytecode.SignatureAttribute.ClassType getSuperClass() {
                r2 = this;
                r0 = r2
                javassist.bytecode.SignatureAttribute$ClassType r0 = r0.superClass
                return r0
        }

        public javassist.bytecode.SignatureAttribute.ClassType[] getInterfaces() {
                r2 = this;
                r0 = r2
                javassist.bytecode.SignatureAttribute$ClassType[] r0 = r0.interfaces
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r4
                r1 = r3
                javassist.bytecode.SignatureAttribute$TypeParameter[] r1 = r1.params
                javassist.bytecode.SignatureAttribute.TypeParameter.toString(r0, r1)
                r0 = r4
                java.lang.String r1 = " extends "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r3
                javassist.bytecode.SignatureAttribute$ClassType r1 = r1.superClass
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r3
                javassist.bytecode.SignatureAttribute$ClassType[] r0 = r0.interfaces
                int r0 = r0.length
                if (r0 <= 0) goto L35
                r0 = r4
                java.lang.String r1 = " implements "
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                r1 = r3
                javassist.bytecode.SignatureAttribute$ClassType[] r1 = r1.interfaces
                javassist.bytecode.SignatureAttribute.Type.toString(r0, r1)
            L35:
                r0 = r4
                java.lang.String r0 = r0.toString()
                return r0
        }

        public java.lang.String encode() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r3
                javassist.bytecode.SignatureAttribute$TypeParameter[] r0 = r0.params
                int r0 = r0.length
                if (r0 <= 0) goto L39
                r0 = r4
                r1 = 60
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = 0
                r5 = r0
            L19:
                r0 = r5
                r1 = r3
                javassist.bytecode.SignatureAttribute$TypeParameter[] r1 = r1.params
                int r1 = r1.length
                if (r0 >= r1) goto L32
                r0 = r3
                javassist.bytecode.SignatureAttribute$TypeParameter[] r0 = r0.params
                r1 = r5
                r0 = r0[r1]
                r1 = r4
                r0.encode(r1)
                int r5 = r5 + 1
                goto L19
            L32:
                r0 = r4
                r1 = 62
                java.lang.StringBuilder r0 = r0.append(r1)
            L39:
                r0 = r3
                javassist.bytecode.SignatureAttribute$ClassType r0 = r0.superClass
                r1 = r4
                r0.encode(r1)
                r0 = 0
                r5 = r0
            L43:
                r0 = r5
                r1 = r3
                javassist.bytecode.SignatureAttribute$ClassType[] r1 = r1.interfaces
                int r1 = r1.length
                if (r0 >= r1) goto L5c
                r0 = r3
                javassist.bytecode.SignatureAttribute$ClassType[] r0 = r0.interfaces
                r1 = r5
                r0 = r0[r1]
                r1 = r4
                r0.encode(r1)
                int r5 = r5 + 1
                goto L43
            L5c:
                r0 = r4
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$ClassType.class */
    public static class ClassType extends javassist.bytecode.SignatureAttribute.ObjectType {
        java.lang.String name;
        javassist.bytecode.SignatureAttribute.TypeArgument[] arguments;
        public static javassist.bytecode.SignatureAttribute.ClassType OBJECT;

        static javassist.bytecode.SignatureAttribute.ClassType make(java.lang.String r8, int r9, int r10, javassist.bytecode.SignatureAttribute.TypeArgument[] r11, javassist.bytecode.SignatureAttribute.ClassType r12) {
                r0 = r12
                if (r0 != 0) goto L11
                javassist.bytecode.SignatureAttribute$ClassType r0 = new javassist.bytecode.SignatureAttribute$ClassType
                r1 = r0
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r1.<init>(r2, r3, r4, r5)
                return r0
            L11:
                javassist.bytecode.SignatureAttribute$NestedClassType r0 = new javassist.bytecode.SignatureAttribute$NestedClassType
                r1 = r0
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
        }

        ClassType(java.lang.String r6, int r7, int r8, javassist.bytecode.SignatureAttribute.TypeArgument[] r9) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                java.lang.String r1 = r1.substring(r2, r3)
                r2 = 47
                r3 = 46
                java.lang.String r1 = r1.replace(r2, r3)
                r0.name = r1
                r0 = r5
                r1 = r9
                r0.arguments = r1
                return
        }

        public ClassType(java.lang.String r4, javassist.bytecode.SignatureAttribute.TypeArgument[] r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.name = r1
                r0 = r3
                r1 = r5
                r0.arguments = r1
                return
        }

        public ClassType(java.lang.String r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = 0
                r0.<init>(r1, r2)
                return
        }

        public java.lang.String getName() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.name
                return r0
        }

        public javassist.bytecode.SignatureAttribute.TypeArgument[] getTypeArguments() {
                r2 = this;
                r0 = r2
                javassist.bytecode.SignatureAttribute$TypeArgument[] r0 = r0.arguments
                return r0
        }

        public javassist.bytecode.SignatureAttribute.ClassType getDeclaringClass() {
                r2 = this;
                r0 = 0
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r3
                javassist.bytecode.SignatureAttribute$ClassType r0 = r0.getDeclaringClass()
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L1f
                r0 = r4
                r1 = r5
                java.lang.String r1 = r1.toString()
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 46
                java.lang.StringBuilder r0 = r0.append(r1)
            L1f:
                r0 = r3
                r1 = r4
                java.lang.String r0 = r0.toString2(r1)
                return r0
        }

        private java.lang.String toString2(java.lang.StringBuilder r5) {
                r4 = this;
                r0 = r5
                r1 = r4
                java.lang.String r1 = r1.name
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                javassist.bytecode.SignatureAttribute$TypeArgument[] r0 = r0.arguments
                if (r0 == 0) goto L4a
                r0 = r5
                r1 = 60
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                javassist.bytecode.SignatureAttribute$TypeArgument[] r0 = r0.arguments
                int r0 = r0.length
                r6 = r0
                r0 = 0
                r7 = r0
            L1f:
                r0 = r7
                r1 = r6
                if (r0 >= r1) goto L43
                r0 = r7
                if (r0 <= 0) goto L2f
                r0 = r5
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
            L2f:
                r0 = r5
                r1 = r4
                javassist.bytecode.SignatureAttribute$TypeArgument[] r1 = r1.arguments
                r2 = r7
                r1 = r1[r2]
                java.lang.String r1 = r1.toString()
                java.lang.StringBuilder r0 = r0.append(r1)
                int r7 = r7 + 1
                goto L1f
            L43:
                r0 = r5
                r1 = 62
                java.lang.StringBuilder r0 = r0.append(r1)
            L4a:
                r0 = r5
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // javassist.bytecode.SignatureAttribute.Type
        public java.lang.String jvmTypeName() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r3
                javassist.bytecode.SignatureAttribute$ClassType r0 = r0.getDeclaringClass()
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L1f
                r0 = r4
                r1 = r5
                java.lang.String r1 = r1.jvmTypeName()
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 36
                java.lang.StringBuilder r0 = r0.append(r1)
            L1f:
                r0 = r3
                r1 = r4
                java.lang.String r0 = r0.toString2(r1)
                return r0
        }

        @Override // javassist.bytecode.SignatureAttribute.Type
        void encode(java.lang.StringBuilder r4) {
                r3 = this;
                r0 = r4
                r1 = 76
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r3
                r1 = r4
                r0.encode2(r1)
                r0 = r4
                r1 = 59
                java.lang.StringBuilder r0 = r0.append(r1)
                return
        }

        void encode2(java.lang.StringBuilder r6) {
                r5 = this;
                r0 = r5
                javassist.bytecode.SignatureAttribute$ClassType r0 = r0.getDeclaringClass()
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L15
                r0 = r7
                r1 = r6
                r0.encode2(r1)
                r0 = r6
                r1 = 36
                java.lang.StringBuilder r0 = r0.append(r1)
            L15:
                r0 = r6
                r1 = r5
                java.lang.String r1 = r1.name
                r2 = 46
                r3 = 47
                java.lang.String r1 = r1.replace(r2, r3)
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                javassist.bytecode.SignatureAttribute$TypeArgument[] r0 = r0.arguments
                if (r0 == 0) goto L34
                r0 = r6
                r1 = r5
                javassist.bytecode.SignatureAttribute$TypeArgument[] r1 = r1.arguments
                javassist.bytecode.SignatureAttribute.TypeArgument.encode(r0, r1)
            L34:
                return
        }

        static {
                javassist.bytecode.SignatureAttribute$ClassType r0 = new javassist.bytecode.SignatureAttribute$ClassType
                r1 = r0
                java.lang.String r2 = "java.lang.Object"
                r3 = 0
                r1.<init>(r2, r3)
                javassist.bytecode.SignatureAttribute.ClassType.OBJECT = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$Cursor.class */
    private static class Cursor {
        int position;

        private Cursor() {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 0
                r0.position = r1
                return
        }

        int indexOf(java.lang.String r5, int r6) throws javassist.bytecode.BadBytecode {
                r4 = this;
                r0 = r5
                r1 = r6
                r2 = r4
                int r2 = r2.position
                int r0 = r0.indexOf(r1, r2)
                r7 = r0
                r0 = r7
                if (r0 >= 0) goto L13
                r0 = r5
                javassist.bytecode.BadBytecode r0 = javassist.bytecode.SignatureAttribute.access$000(r0)
                throw r0
            L13:
                r0 = r4
                r1 = r7
                r2 = 1
                int r1 = r1 + r2
                r0.position = r1
                r0 = r7
                return r0
        }

        /* synthetic */ Cursor(javassist.bytecode.SignatureAttribute.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$MethodSignature.class */
    public static class MethodSignature {
        javassist.bytecode.SignatureAttribute.TypeParameter[] typeParams;
        javassist.bytecode.SignatureAttribute.Type[] params;
        javassist.bytecode.SignatureAttribute.Type retType;
        javassist.bytecode.SignatureAttribute.ObjectType[] exceptions;

        public MethodSignature(javassist.bytecode.SignatureAttribute.TypeParameter[] r6, javassist.bytecode.SignatureAttribute.Type[] r7, javassist.bytecode.SignatureAttribute.Type r8, javassist.bytecode.SignatureAttribute.ObjectType[] r9) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                r1 = r6
                if (r1 != 0) goto L10
                r1 = 0
                javassist.bytecode.SignatureAttribute$TypeParameter[] r1 = new javassist.bytecode.SignatureAttribute.TypeParameter[r1]
                goto L11
            L10:
                r1 = r6
            L11:
                r0.typeParams = r1
                r0 = r5
                r1 = r7
                if (r1 != 0) goto L20
                r1 = 0
                javassist.bytecode.SignatureAttribute$Type[] r1 = new javassist.bytecode.SignatureAttribute.Type[r1]
                goto L21
            L20:
                r1 = r7
            L21:
                r0.params = r1
                r0 = r5
                r1 = r8
                if (r1 != 0) goto L35
                javassist.bytecode.SignatureAttribute$BaseType r1 = new javassist.bytecode.SignatureAttribute$BaseType
                r2 = r1
                java.lang.String r3 = "void"
                r2.<init>(r3)
                goto L36
            L35:
                r1 = r8
            L36:
                r0.retType = r1
                r0 = r5
                r1 = r9
                if (r1 != 0) goto L46
                r1 = 0
                javassist.bytecode.SignatureAttribute$ObjectType[] r1 = new javassist.bytecode.SignatureAttribute.ObjectType[r1]
                goto L48
            L46:
                r1 = r9
            L48:
                r0.exceptions = r1
                return
        }

        public javassist.bytecode.SignatureAttribute.TypeParameter[] getTypeParameters() {
                r2 = this;
                r0 = r2
                javassist.bytecode.SignatureAttribute$TypeParameter[] r0 = r0.typeParams
                return r0
        }

        public javassist.bytecode.SignatureAttribute.Type[] getParameterTypes() {
                r2 = this;
                r0 = r2
                javassist.bytecode.SignatureAttribute$Type[] r0 = r0.params
                return r0
        }

        public javassist.bytecode.SignatureAttribute.Type getReturnType() {
                r2 = this;
                r0 = r2
                javassist.bytecode.SignatureAttribute$Type r0 = r0.retType
                return r0
        }

        public javassist.bytecode.SignatureAttribute.ObjectType[] getExceptionTypes() {
                r2 = this;
                r0 = r2
                javassist.bytecode.SignatureAttribute$ObjectType[] r0 = r0.exceptions
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r4
                r1 = r3
                javassist.bytecode.SignatureAttribute$TypeParameter[] r1 = r1.typeParams
                javassist.bytecode.SignatureAttribute.TypeParameter.toString(r0, r1)
                r0 = r4
                java.lang.String r1 = " ("
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                r1 = r3
                javassist.bytecode.SignatureAttribute$Type[] r1 = r1.params
                javassist.bytecode.SignatureAttribute.Type.toString(r0, r1)
                r0 = r4
                java.lang.String r1 = ") "
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                r1 = r3
                javassist.bytecode.SignatureAttribute$Type r1 = r1.retType
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r3
                javassist.bytecode.SignatureAttribute$ObjectType[] r0 = r0.exceptions
                int r0 = r0.length
                if (r0 <= 0) goto L46
                r0 = r4
                java.lang.String r1 = " throws "
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                r1 = r3
                javassist.bytecode.SignatureAttribute$ObjectType[] r1 = r1.exceptions
                javassist.bytecode.SignatureAttribute.Type.toString(r0, r1)
            L46:
                r0 = r4
                java.lang.String r0 = r0.toString()
                return r0
        }

        public java.lang.String encode() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r3
                javassist.bytecode.SignatureAttribute$TypeParameter[] r0 = r0.typeParams
                int r0 = r0.length
                if (r0 <= 0) goto L39
                r0 = r4
                r1 = 60
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = 0
                r5 = r0
            L19:
                r0 = r5
                r1 = r3
                javassist.bytecode.SignatureAttribute$TypeParameter[] r1 = r1.typeParams
                int r1 = r1.length
                if (r0 >= r1) goto L32
                r0 = r3
                javassist.bytecode.SignatureAttribute$TypeParameter[] r0 = r0.typeParams
                r1 = r5
                r0 = r0[r1]
                r1 = r4
                r0.encode(r1)
                int r5 = r5 + 1
                goto L19
            L32:
                r0 = r4
                r1 = 62
                java.lang.StringBuilder r0 = r0.append(r1)
            L39:
                r0 = r4
                r1 = 40
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = 0
                r5 = r0
            L42:
                r0 = r5
                r1 = r3
                javassist.bytecode.SignatureAttribute$Type[] r1 = r1.params
                int r1 = r1.length
                if (r0 >= r1) goto L5b
                r0 = r3
                javassist.bytecode.SignatureAttribute$Type[] r0 = r0.params
                r1 = r5
                r0 = r0[r1]
                r1 = r4
                r0.encode(r1)
                int r5 = r5 + 1
                goto L42
            L5b:
                r0 = r4
                r1 = 41
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r3
                javassist.bytecode.SignatureAttribute$Type r0 = r0.retType
                r1 = r4
                r0.encode(r1)
                r0 = r3
                javassist.bytecode.SignatureAttribute$ObjectType[] r0 = r0.exceptions
                int r0 = r0.length
                if (r0 <= 0) goto L94
                r0 = 0
                r5 = r0
            L74:
                r0 = r5
                r1 = r3
                javassist.bytecode.SignatureAttribute$ObjectType[] r1 = r1.exceptions
                int r1 = r1.length
                if (r0 >= r1) goto L94
                r0 = r4
                r1 = 94
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r3
                javassist.bytecode.SignatureAttribute$ObjectType[] r0 = r0.exceptions
                r1 = r5
                r0 = r0[r1]
                r1 = r4
                r0.encode(r1)
                int r5 = r5 + 1
                goto L74
            L94:
                r0 = r4
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$NestedClassType.class */
    public static class NestedClassType extends javassist.bytecode.SignatureAttribute.ClassType {
        javassist.bytecode.SignatureAttribute.ClassType parent;

        NestedClassType(java.lang.String r7, int r8, int r9, javassist.bytecode.SignatureAttribute.TypeArgument[] r10, javassist.bytecode.SignatureAttribute.ClassType r11) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r0.<init>(r1, r2, r3, r4)
                r0 = r6
                r1 = r11
                r0.parent = r1
                return
        }

        public NestedClassType(javassist.bytecode.SignatureAttribute.ClassType r5, java.lang.String r6, javassist.bytecode.SignatureAttribute.TypeArgument[] r7) {
                r4 = this;
                r0 = r4
                r1 = r6
                r2 = r7
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r5
                r0.parent = r1
                return
        }

        @Override // javassist.bytecode.SignatureAttribute.ClassType
        public javassist.bytecode.SignatureAttribute.ClassType getDeclaringClass() {
                r2 = this;
                r0 = r2
                javassist.bytecode.SignatureAttribute$ClassType r0 = r0.parent
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$ObjectType.class */
    public static abstract class ObjectType extends javassist.bytecode.SignatureAttribute.Type {
        public ObjectType() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public java.lang.String encode() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r3
                r1 = r4
                r0.encode(r1)
                r0 = r4
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$Type.class */
    public static abstract class Type {
        public Type() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        abstract void encode(java.lang.StringBuilder r1);

        static void toString(java.lang.StringBuilder r4, javassist.bytecode.SignatureAttribute.Type[] r5) {
                r0 = 0
                r6 = r0
            L2:
                r0 = r6
                r1 = r5
                int r1 = r1.length
                if (r0 >= r1) goto L21
                r0 = r6
                if (r0 <= 0) goto L13
                r0 = r4
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
            L13:
                r0 = r4
                r1 = r5
                r2 = r6
                r1 = r1[r2]
                java.lang.StringBuilder r0 = r0.append(r1)
                int r6 = r6 + 1
                goto L2
            L21:
                return
        }

        public java.lang.String jvmTypeName() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$TypeArgument.class */
    public static class TypeArgument {
        javassist.bytecode.SignatureAttribute.ObjectType arg;
        char wildcard;

        TypeArgument(javassist.bytecode.SignatureAttribute.ObjectType r4, char r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.arg = r1
                r0 = r3
                r1 = r5
                r0.wildcard = r1
                return
        }

        public TypeArgument(javassist.bytecode.SignatureAttribute.ObjectType r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = 32
                r0.<init>(r1, r2)
                return
        }

        public TypeArgument() {
                r4 = this;
                r0 = r4
                r1 = 0
                r2 = 42
                r0.<init>(r1, r2)
                return
        }

        public static javassist.bytecode.SignatureAttribute.TypeArgument subclassOf(javassist.bytecode.SignatureAttribute.ObjectType r5) {
                javassist.bytecode.SignatureAttribute$TypeArgument r0 = new javassist.bytecode.SignatureAttribute$TypeArgument
                r1 = r0
                r2 = r5
                r3 = 43
                r1.<init>(r2, r3)
                return r0
        }

        public static javassist.bytecode.SignatureAttribute.TypeArgument superOf(javassist.bytecode.SignatureAttribute.ObjectType r5) {
                javassist.bytecode.SignatureAttribute$TypeArgument r0 = new javassist.bytecode.SignatureAttribute$TypeArgument
                r1 = r0
                r2 = r5
                r3 = 45
                r1.<init>(r2, r3)
                return r0
        }

        public char getKind() {
                r2 = this;
                r0 = r2
                char r0 = r0.wildcard
                return r0
        }

        public boolean isWildcard() {
                r3 = this;
                r0 = r3
                char r0 = r0.wildcard
                r1 = 32
                if (r0 == r1) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                return r0
        }

        public javassist.bytecode.SignatureAttribute.ObjectType getType() {
                r2 = this;
                r0 = r2
                javassist.bytecode.SignatureAttribute$ObjectType r0 = r0.arg
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                r0 = r3
                char r0 = r0.wildcard
                r1 = 42
                if (r0 != r1) goto Lc
                java.lang.String r0 = "?"
                return r0
            Lc:
                r0 = r3
                javassist.bytecode.SignatureAttribute$ObjectType r0 = r0.arg
                java.lang.String r0 = r0.toString()
                r4 = r0
                r0 = r3
                char r0 = r0.wildcard
                r1 = 32
                if (r0 != r1) goto L1f
                r0 = r4
                return r0
            L1f:
                r0 = r3
                char r0 = r0.wildcard
                r1 = 43
                if (r0 != r1) goto L3c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                java.lang.String r1 = "? extends "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r4
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L3c:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                java.lang.String r1 = "? super "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r4
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        static void encode(java.lang.StringBuilder r3, javassist.bytecode.SignatureAttribute.TypeArgument[] r4) {
                r0 = r3
                r1 = 60
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = 0
                r5 = r0
            L9:
                r0 = r5
                r1 = r4
                int r1 = r1.length
                if (r0 >= r1) goto L38
                r0 = r4
                r1 = r5
                r0 = r0[r1]
                r6 = r0
                r0 = r6
                boolean r0 = r0.isWildcard()
                if (r0 == 0) goto L23
                r0 = r3
                r1 = r6
                char r1 = r1.wildcard
                java.lang.StringBuilder r0 = r0.append(r1)
            L23:
                r0 = r6
                javassist.bytecode.SignatureAttribute$ObjectType r0 = r0.getType()
                if (r0 == 0) goto L32
                r0 = r6
                javassist.bytecode.SignatureAttribute$ObjectType r0 = r0.getType()
                r1 = r3
                r0.encode(r1)
            L32:
                int r5 = r5 + 1
                goto L9
            L38:
                r0 = r3
                r1 = 62
                java.lang.StringBuilder r0 = r0.append(r1)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$TypeParameter.class */
    public static class TypeParameter {
        java.lang.String name;
        javassist.bytecode.SignatureAttribute.ObjectType superClass;
        javassist.bytecode.SignatureAttribute.ObjectType[] superInterfaces;

        TypeParameter(java.lang.String r6, int r7, int r8, javassist.bytecode.SignatureAttribute.ObjectType r9, javassist.bytecode.SignatureAttribute.ObjectType[] r10) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                java.lang.String r1 = r1.substring(r2, r3)
                r0.name = r1
                r0 = r5
                r1 = r9
                r0.superClass = r1
                r0 = r5
                r1 = r10
                r0.superInterfaces = r1
                return
        }

        public TypeParameter(java.lang.String r4, javassist.bytecode.SignatureAttribute.ObjectType r5, javassist.bytecode.SignatureAttribute.ObjectType[] r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.name = r1
                r0 = r3
                r1 = r5
                r0.superClass = r1
                r0 = r6
                if (r0 != 0) goto L1d
                r0 = r3
                r1 = 0
                javassist.bytecode.SignatureAttribute$ObjectType[] r1 = new javassist.bytecode.SignatureAttribute.ObjectType[r1]
                r0.superInterfaces = r1
                goto L22
            L1d:
                r0 = r3
                r1 = r6
                r0.superInterfaces = r1
            L22:
                return
        }

        public TypeParameter(java.lang.String r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = 0
                r3 = 0
                r0.<init>(r1, r2, r3)
                return
        }

        public java.lang.String getName() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.name
                return r0
        }

        public javassist.bytecode.SignatureAttribute.ObjectType getClassBound() {
                r2 = this;
                r0 = r2
                javassist.bytecode.SignatureAttribute$ObjectType r0 = r0.superClass
                return r0
        }

        public javassist.bytecode.SignatureAttribute.ObjectType[] getInterfaceBound() {
                r2 = this;
                r0 = r2
                javassist.bytecode.SignatureAttribute$ObjectType[] r0 = r0.superInterfaces
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r2 = r4
                java.lang.String r2 = r2.getName()
                r1.<init>(r2)
                r5 = r0
                r0 = r4
                javassist.bytecode.SignatureAttribute$ObjectType r0 = r0.superClass
                if (r0 == 0) goto L24
                r0 = r5
                java.lang.String r1 = " extends "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r4
                javassist.bytecode.SignatureAttribute$ObjectType r1 = r1.superClass
                java.lang.String r1 = r1.toString()
                java.lang.StringBuilder r0 = r0.append(r1)
            L24:
                r0 = r4
                javassist.bytecode.SignatureAttribute$ObjectType[] r0 = r0.superInterfaces
                int r0 = r0.length
                r6 = r0
                r0 = r6
                if (r0 <= 0) goto L65
                r0 = 0
                r7 = r0
            L30:
                r0 = r7
                r1 = r6
                if (r0 >= r1) goto L65
                r0 = r7
                if (r0 > 0) goto L40
                r0 = r4
                javassist.bytecode.SignatureAttribute$ObjectType r0 = r0.superClass
                if (r0 == 0) goto L4a
            L40:
                r0 = r5
                java.lang.String r1 = " & "
                java.lang.StringBuilder r0 = r0.append(r1)
                goto L51
            L4a:
                r0 = r5
                java.lang.String r1 = " extends "
                java.lang.StringBuilder r0 = r0.append(r1)
            L51:
                r0 = r5
                r1 = r4
                javassist.bytecode.SignatureAttribute$ObjectType[] r1 = r1.superInterfaces
                r2 = r7
                r1 = r1[r2]
                java.lang.String r1 = r1.toString()
                java.lang.StringBuilder r0 = r0.append(r1)
                int r7 = r7 + 1
                goto L30
            L65:
                r0 = r5
                java.lang.String r0 = r0.toString()
                return r0
        }

        static void toString(java.lang.StringBuilder r4, javassist.bytecode.SignatureAttribute.TypeParameter[] r5) {
                r0 = r4
                r1 = 60
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = 0
                r6 = r0
            L9:
                r0 = r6
                r1 = r5
                int r1 = r1.length
                if (r0 >= r1) goto L28
                r0 = r6
                if (r0 <= 0) goto L1a
                r0 = r4
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
            L1a:
                r0 = r4
                r1 = r5
                r2 = r6
                r1 = r1[r2]
                java.lang.StringBuilder r0 = r0.append(r1)
                int r6 = r6 + 1
                goto L9
            L28:
                r0 = r4
                r1 = 62
                java.lang.StringBuilder r0 = r0.append(r1)
                return
        }

        void encode(java.lang.StringBuilder r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                java.lang.String r1 = r1.name
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r3
                javassist.bytecode.SignatureAttribute$ObjectType r0 = r0.superClass
                if (r0 != 0) goto L1a
                r0 = r4
                java.lang.String r1 = ":Ljava/lang/Object;"
                java.lang.StringBuilder r0 = r0.append(r1)
                goto L29
            L1a:
                r0 = r4
                r1 = 58
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r3
                javassist.bytecode.SignatureAttribute$ObjectType r0 = r0.superClass
                r1 = r4
                r0.encode(r1)
            L29:
                r0 = 0
                r5 = r0
            L2b:
                r0 = r5
                r1 = r3
                javassist.bytecode.SignatureAttribute$ObjectType[] r1 = r1.superInterfaces
                int r1 = r1.length
                if (r0 >= r1) goto L4b
                r0 = r4
                r1 = 58
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r3
                javassist.bytecode.SignatureAttribute$ObjectType[] r0 = r0.superInterfaces
                r1 = r5
                r0 = r0[r1]
                r1 = r4
                r0.encode(r1)
                int r5 = r5 + 1
                goto L2b
            L4b:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$TypeVariable.class */
    public static class TypeVariable extends javassist.bytecode.SignatureAttribute.ObjectType {
        java.lang.String name;

        TypeVariable(java.lang.String r6, int r7, int r8) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                java.lang.String r1 = r1.substring(r2, r3)
                r0.name = r1
                return
        }

        public TypeVariable(java.lang.String r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.name = r1
                return
        }

        public java.lang.String getName() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.name
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.name
                return r0
        }

        @Override // javassist.bytecode.SignatureAttribute.Type
        void encode(java.lang.StringBuilder r4) {
                r3 = this;
                r0 = r4
                r1 = 84
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r3
                java.lang.String r1 = r1.name
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 59
                java.lang.StringBuilder r0 = r0.append(r1)
                return
        }
    }

    SignatureAttribute(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public SignatureAttribute(javassist.bytecode.ConstPool r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "Signature"
            r0.<init>(r1, r2)
            r0 = r6
            r1 = r7
            int r0 = r0.addUtf8Info(r1)
            r8 = r0
            r0 = 2
            byte[] r0 = new byte[r0]
            r9 = r0
            r0 = r9
            r1 = 0
            r2 = r8
            r3 = 8
            int r2 = r2 >>> r3
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r9
            r1 = 1
            r2 = r8
            byte r2 = (byte) r2
            r0[r1] = r2
            r0 = r5
            r1 = r9
            r0.set(r1)
            return
    }

    public java.lang.String getSignature() {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r4
            byte[] r1 = r1.get()
            r2 = 0
            int r1 = javassist.bytecode.ByteArray.readU16bit(r1, r2)
            java.lang.String r0 = r0.getUtf8Info(r1)
            return r0
    }

    public void setSignature(java.lang.String r5) {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r1 = r5
            int r0 = r0.addUtf8Info(r1)
            r6 = r0
            r0 = r6
            r1 = r4
            byte[] r1 = r1.info
            r2 = 0
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            return
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r6, java.util.Map<java.lang.String, java.lang.String> r7) {
            r5 = this;
            javassist.bytecode.SignatureAttribute r0 = new javassist.bytecode.SignatureAttribute
            r1 = r0
            r2 = r6
            r3 = r5
            java.lang.String r3 = r3.getSignature()
            r1.<init>(r2, r3)
            return r0
    }

    @Override // javassist.bytecode.AttributeInfo
    void renameClass(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.getSignature()
            r1 = r5
            r2 = r6
            java.lang.String r0 = renameClass(r0, r1, r2)
            r7 = r0
            r0 = r4
            r1 = r7
            r0.setSignature(r1)
            return
    }

    @Override // javassist.bytecode.AttributeInfo
    void renameClass(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.getSignature()
            r1 = r4
            java.lang.String r0 = renameClass(r0, r1)
            r5 = r0
            r0 = r3
            r1 = r5
            r0.setSignature(r1)
            return
    }

    static java.lang.String renameClass(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            r1 = r7
            java.lang.String r0 = renameClass(r0, r1)
            return r0
    }

    static java.lang.String renameClass(java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11) {
            r0 = r11
            if (r0 == 0) goto Ld
            r0 = r11
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
        Ld:
            r0 = r10
            return r0
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = 0
            r14 = r0
        L1c:
            r0 = r10
            r1 = 76
            r2 = r14
            int r0 = r0.indexOf(r1, r2)
            r15 = r0
            r0 = r15
            if (r0 >= 0) goto L2e
            goto Lab
        L2e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r16 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r17 = r0
            r0 = r16
            r1 = r17
            r2 = r10
            r3 = r15
            int r0 = parseClassName(r0, r1, r2, r3)
            r1 = 1
            int r0 = r0 + r1
            r14 = r0
            r0 = r14
            if (r0 >= 0) goto L56
            goto Lab
        L56:
            java.lang.String r0 = "$"
            r1 = r16
            r2 = 0
            java.lang.StringBuilder[] r2 = new java.lang.StringBuilder[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            java.lang.String r0 = java.lang.String.join(r0, r1)
            r18 = r0
            r0 = r11
            r1 = r18
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r19 = r0
            r0 = r19
            if (r0 == 0) goto L95
            r0 = r10
            r1 = r11
            r2 = r18
            r3 = r19
            r4 = r12
            r5 = r13
            r6 = r15
            r7 = r16
            r8 = r17
            boolean r0 = makeNewClassName(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto La8
            r0 = r14
            r13 = r0
            goto La8
        L95:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            boolean r0 = replaceTypeArguments(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto La8
            r0 = r14
            r13 = r0
        La8:
            goto L1c
        Lab:
            r0 = r13
            if (r0 != 0) goto Lb1
            r0 = r10
            return r0
        Lb1:
            r0 = r10
            int r0 = r0.length()
            r15 = r0
            r0 = r13
            r1 = r15
            if (r0 >= r1) goto Lc9
            r0 = r12
            r1 = r10
            r2 = r13
            r3 = r15
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
        Lc9:
            r0 = r12
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static int parseClassName(java.util.ArrayList<java.lang.StringBuilder> r3, java.util.ArrayList<java.lang.StringBuilder> r4, java.lang.String r5, int r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r6
            r9 = r0
        L15:
            r0 = r5
            int r9 = r9 + 1
            r1 = r9
            char r0 = r0.charAt(r1)     // Catch: java.lang.IndexOutOfBoundsException -> La5
            r1 = r0
            r10 = r1
            r1 = 59
            if (r0 == r1) goto La2
            r0 = r10
            r1 = 60
            if (r0 != r1) goto L6d
            r0 = r8
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> La5
            r0 = 1
            r11 = r0
        L38:
            r0 = r11
            if (r0 <= 0) goto L6a
            r0 = r5
            int r9 = r9 + 1
            r1 = r9
            char r0 = r0.charAt(r1)     // Catch: java.lang.IndexOutOfBoundsException -> La5
            r10 = r0
            r0 = r8
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> La5
            r0 = r10
            r1 = 60
            if (r0 != r1) goto L5d
            int r11 = r11 + 1
            goto L38
        L5d:
            r0 = r10
            r1 = 62
            if (r0 != r1) goto L38
            int r11 = r11 + (-1)
            goto L38
        L6a:
            goto L15
        L6d:
            r0 = r10
            r1 = 46
            if (r0 != r1) goto L97
            r0 = r3
            r1 = r7
            boolean r0 = r0.add(r1)     // Catch: java.lang.IndexOutOfBoundsException -> La5
            r0 = r4
            r1 = r8
            boolean r0 = r0.add(r1)     // Catch: java.lang.IndexOutOfBoundsException -> La5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> La5
            r1 = r0
            r1.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> La5
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> La5
            r1 = r0
            r1.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> La5
            r8 = r0
            goto L15
        L97:
            r0 = r7
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IndexOutOfBoundsException -> La5
            goto L15
        La2:
            goto Laa
        La5:
            r11 = move-exception
            r0 = -2
            return r0
        Laa:
            r0 = r3
            r1 = r7
            boolean r0 = r0.add(r1)
            r0 = r4
            r1 = r8
            boolean r0 = r0.add(r1)
            r0 = r9
            return r0
    }

    private static boolean makeNewClassName(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, java.lang.String r8, java.lang.String r9, java.lang.StringBuilder r10, int r11, int r12, java.util.ArrayList<java.lang.StringBuilder> r13, java.util.ArrayList<java.lang.StringBuilder> r14) {
            r0 = r8
            java.lang.String r1 = "\\$"
            java.lang.String[] r0 = r0.split(r1)
            r15 = r0
            r0 = r9
            java.lang.String r1 = "\\$"
            java.lang.String[] r0 = r0.split(r1)
            r16 = r0
            r0 = r15
            int r0 = r0.length
            r1 = r16
            int r1 = r1.length
            if (r0 != r1) goto L117
            r0 = r13
            int r0 = r0.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r17 = r0
            r0 = 0
            r18 = r0
            r0 = 0
            r19 = r0
        L29:
            r0 = r19
            r1 = r13
            int r1 = r1.size()
            if (r0 >= r1) goto L7e
            r0 = r13
            r1 = r19
            java.lang.Object r0 = r0.get(r1)
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.util.stream.IntStream r0 = r0.chars()
            boolean r1 = (v0) -> { // java.util.function.IntPredicate.test(int):boolean
                return lambda$makeNewClassName$0(v0);
            }
            java.util.stream.IntStream r0 = r0.filter(r1)
            long r0 = r0.count()
            int r0 = (int) r0
            r1 = 1
            int r0 = r0 + r1
            r20 = r0
            java.lang.String r0 = "$"
            r1 = r16
            r2 = r18
            r3 = r18
            r4 = r20
            int r3 = r3 + r4
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            java.lang.String r0 = java.lang.String.join(r0, r1)
            r21 = r0
            r0 = r18
            r1 = r20
            int r0 = r0 + r1
            r18 = r0
            r0 = r17
            r1 = r19
            r2 = r21
            r0[r1] = r2
            int r19 = r19 + 1
            goto L29
        L7e:
            r0 = r10
            r1 = r6
            r2 = r11
            r3 = r12
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r10
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 0
            r18 = r0
        L97:
            r0 = r18
            r1 = r17
            int r1 = r1.length
            if (r0 >= r1) goto L10d
            r0 = r18
            if (r0 <= 0) goto Lac
            r0 = r10
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
        Lac:
            r0 = r10
            r1 = r17
            r2 = r18
            r1 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r14
            r1 = r18
            java.lang.Object r0 = r0.get(r1)
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            r20 = r0
            r0 = r20
            int r0 = r0.length()
            if (r0 <= 0) goto Lf8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "<"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r20
            r2 = 1
            r3 = r20
            int r3 = r3.length()
            r4 = 1
            int r3 = r3 - r4
            java.lang.String r1 = r1.substring(r2, r3)
            r2 = r7
            java.lang.String r1 = renameClass(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ">"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r19 = r0
            goto Lff
        Lf8:
            r0 = r20
            java.lang.String r0 = r0.toString()
            r19 = r0
        Lff:
            r0 = r10
            r1 = r19
            java.lang.StringBuilder r0 = r0.append(r1)
            int r18 = r18 + 1
            goto L97
        L10d:
            r0 = r10
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 1
            return r0
        L117:
            r0 = 0
            return r0
    }

    private static boolean replaceTypeArguments(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, java.lang.StringBuilder r8, int r9, int r10, java.util.ArrayList<java.lang.StringBuilder> r11, java.util.ArrayList<java.lang.StringBuilder> r12) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = 0
            r15 = r0
        Lf:
            r0 = r15
            r1 = r12
            int r1 = r1.size()
            if (r0 >= r1) goto L88
            r0 = r12
            r1 = r15
            java.lang.Object r0 = r0.get(r1)
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            r17 = r0
            r0 = r17
            int r0 = r0.length()
            if (r0 <= 0) goto L73
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "<"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r17
            r2 = 1
            r3 = r17
            int r3 = r3.length()
            r4 = 1
            int r3 = r3 - r4
            java.lang.String r1 = r1.substring(r2, r3)
            r2 = r7
            java.lang.String r1 = renameClass(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ">"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r16 = r0
            r0 = r14
            if (r0 != 0) goto L69
            r0 = r17
            java.lang.String r0 = r0.toString()
            r1 = r16
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6d
        L69:
            r0 = 1
            goto L6e
        L6d:
            r0 = 0
        L6e:
            r14 = r0
            goto L7a
        L73:
            r0 = r17
            java.lang.String r0 = r0.toString()
            r16 = r0
        L7a:
            r0 = r13
            r1 = r16
            boolean r0 = r0.add(r1)
            int r15 = r15 + 1
            goto Lf
        L88:
            r0 = r14
            if (r0 == 0) goto Le6
            r0 = r8
            r1 = r6
            r2 = r9
            r3 = r10
            java.lang.String r1 = r1.substring(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 0
            r15 = r0
        La3:
            r0 = r15
            r1 = r12
            int r1 = r1.size()
            if (r0 >= r1) goto Ldd
            r0 = r15
            if (r0 <= 0) goto Lb9
            r0 = r8
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
        Lb9:
            r0 = r8
            r1 = r11
            r2 = r15
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r8
            r1 = r13
            r2 = r15
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            int r15 = r15 + 1
            goto La3
        Ldd:
            r0 = r8
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 1
            return r0
        Le6:
            r0 = 0
            return r0
    }

    private static boolean isNamePart(int r3) {
            r0 = r3
            r1 = 59
            if (r0 == r1) goto L10
            r0 = r3
            r1 = 60
            if (r0 == r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public static javassist.bytecode.SignatureAttribute.ClassSignature toClassSignature(java.lang.String r2) throws javassist.bytecode.BadBytecode {
            r0 = r2
            javassist.bytecode.SignatureAttribute$ClassSignature r0 = parseSig(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L5
            return r0
        L5:
            r3 = move-exception
            r0 = r2
            javassist.bytecode.BadBytecode r0 = error(r0)
            throw r0
    }

    public static javassist.bytecode.SignatureAttribute.MethodSignature toMethodSignature(java.lang.String r2) throws javassist.bytecode.BadBytecode {
            r0 = r2
            javassist.bytecode.SignatureAttribute$MethodSignature r0 = parseMethodSig(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L5
            return r0
        L5:
            r3 = move-exception
            r0 = r2
            javassist.bytecode.BadBytecode r0 = error(r0)
            throw r0
    }

    public static javassist.bytecode.SignatureAttribute.ObjectType toFieldSignature(java.lang.String r5) throws javassist.bytecode.BadBytecode {
            r0 = r5
            javassist.bytecode.SignatureAttribute$Cursor r1 = new javassist.bytecode.SignatureAttribute$Cursor     // Catch: java.lang.IndexOutOfBoundsException -> Le
            r2 = r1
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.IndexOutOfBoundsException -> Le
            r2 = 0
            javassist.bytecode.SignatureAttribute$ObjectType r0 = parseObjectType(r0, r1, r2)     // Catch: java.lang.IndexOutOfBoundsException -> Le
            return r0
        Le:
            r6 = move-exception
            r0 = r5
            javassist.bytecode.BadBytecode r0 = error(r0)
            throw r0
    }

    public static javassist.bytecode.SignatureAttribute.Type toTypeSignature(java.lang.String r5) throws javassist.bytecode.BadBytecode {
            r0 = r5
            javassist.bytecode.SignatureAttribute$Cursor r1 = new javassist.bytecode.SignatureAttribute$Cursor     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            r2 = r1
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            javassist.bytecode.SignatureAttribute$Type r0 = parseType(r0, r1)     // Catch: java.lang.IndexOutOfBoundsException -> Ld
            return r0
        Ld:
            r6 = move-exception
            r0 = r5
            javassist.bytecode.BadBytecode r0 = error(r0)
            throw r0
    }

    private static javassist.bytecode.SignatureAttribute.ClassSignature parseSig(java.lang.String r6) throws javassist.bytecode.BadBytecode, java.lang.IndexOutOfBoundsException {
            javassist.bytecode.SignatureAttribute$Cursor r0 = new javassist.bytecode.SignatureAttribute$Cursor
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r7 = r0
            r0 = r6
            r1 = r7
            javassist.bytecode.SignatureAttribute$TypeParameter[] r0 = parseTypeParams(r0, r1)
            r8 = r0
            r0 = r6
            r1 = r7
            javassist.bytecode.SignatureAttribute$ClassType r0 = parseClassType(r0, r1)
            r9 = r0
            r0 = r6
            int r0 = r0.length()
            r10 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
        L24:
            r0 = r7
            int r0 = r0.position
            r1 = r10
            if (r0 >= r1) goto L4a
            r0 = r6
            r1 = r7
            int r1 = r1.position
            char r0 = r0.charAt(r1)
            r1 = 76
            if (r0 != r1) goto L4a
            r0 = r11
            r1 = r6
            r2 = r7
            javassist.bytecode.SignatureAttribute$ClassType r1 = parseClassType(r1, r2)
            boolean r0 = r0.add(r1)
            goto L24
        L4a:
            r0 = r11
            r1 = r11
            int r1 = r1.size()
            javassist.bytecode.SignatureAttribute$ClassType[] r1 = new javassist.bytecode.SignatureAttribute.ClassType[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            javassist.bytecode.SignatureAttribute$ClassType[] r0 = (javassist.bytecode.SignatureAttribute.ClassType[]) r0
            r12 = r0
            javassist.bytecode.SignatureAttribute$ClassSignature r0 = new javassist.bytecode.SignatureAttribute$ClassSignature
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r12
            r1.<init>(r2, r3, r4)
            return r0
    }

    private static javassist.bytecode.SignatureAttribute.MethodSignature parseMethodSig(java.lang.String r7) throws javassist.bytecode.BadBytecode {
            javassist.bytecode.SignatureAttribute$Cursor r0 = new javassist.bytecode.SignatureAttribute$Cursor
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r8 = r0
            r0 = r7
            r1 = r8
            javassist.bytecode.SignatureAttribute$TypeParameter[] r0 = parseTypeParams(r0, r1)
            r9 = r0
            r0 = r7
            r1 = r8
            r2 = r1
            int r2 = r2.position
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.position = r3
            char r0 = r0.charAt(r1)
            r1 = 40
            if (r0 == r1) goto L28
            r0 = r7
            javassist.bytecode.BadBytecode r0 = error(r0)
            throw r0
        L28:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r10 = r0
        L30:
            r0 = r7
            r1 = r8
            int r1 = r1.position
            char r0 = r0.charAt(r1)
            r1 = 41
            if (r0 == r1) goto L50
            r0 = r7
            r1 = r8
            javassist.bytecode.SignatureAttribute$Type r0 = parseType(r0, r1)
            r11 = r0
            r0 = r10
            r1 = r11
            boolean r0 = r0.add(r1)
            goto L30
        L50:
            r0 = r8
            r1 = r0
            int r1 = r1.position
            r2 = 1
            int r1 = r1 + r2
            r0.position = r1
            r0 = r7
            r1 = r8
            javassist.bytecode.SignatureAttribute$Type r0 = parseType(r0, r1)
            r11 = r0
            r0 = r7
            int r0 = r0.length()
            r12 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r13 = r0
        L70:
            r0 = r8
            int r0 = r0.position
            r1 = r12
            if (r0 >= r1) goto Lb2
            r0 = r7
            r1 = r8
            int r1 = r1.position
            char r0 = r0.charAt(r1)
            r1 = 94
            if (r0 != r1) goto Lb2
            r0 = r8
            r1 = r0
            int r1 = r1.position
            r2 = 1
            int r1 = r1 + r2
            r0.position = r1
            r0 = r7
            r1 = r8
            r2 = 0
            javassist.bytecode.SignatureAttribute$ObjectType r0 = parseObjectType(r0, r1, r2)
            r14 = r0
            r0 = r14
            boolean r0 = r0 instanceof javassist.bytecode.SignatureAttribute.ArrayType
            if (r0 == 0) goto La5
            r0 = r7
            javassist.bytecode.BadBytecode r0 = error(r0)
            throw r0
        La5:
            r0 = r13
            r1 = r14
            boolean r0 = r0.add(r1)
            goto L70
        Lb2:
            r0 = r10
            r1 = r10
            int r1 = r1.size()
            javassist.bytecode.SignatureAttribute$Type[] r1 = new javassist.bytecode.SignatureAttribute.Type[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            javassist.bytecode.SignatureAttribute$Type[] r0 = (javassist.bytecode.SignatureAttribute.Type[]) r0
            r14 = r0
            r0 = r13
            r1 = r13
            int r1 = r1.size()
            javassist.bytecode.SignatureAttribute$ObjectType[] r1 = new javassist.bytecode.SignatureAttribute.ObjectType[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            javassist.bytecode.SignatureAttribute$ObjectType[] r0 = (javassist.bytecode.SignatureAttribute.ObjectType[]) r0
            r15 = r0
            javassist.bytecode.SignatureAttribute$MethodSignature r0 = new javassist.bytecode.SignatureAttribute$MethodSignature
            r1 = r0
            r2 = r9
            r3 = r14
            r4 = r11
            r5 = r15
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    private static javassist.bytecode.SignatureAttribute.TypeParameter[] parseTypeParams(java.lang.String r9, javassist.bytecode.SignatureAttribute.Cursor r10) throws javassist.bytecode.BadBytecode {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = r9
            r1 = r10
            int r1 = r1.position
            char r0 = r0.charAt(r1)
            r1 = 60
            if (r0 != r1) goto Lb0
            r0 = r10
            r1 = r0
            int r1 = r1.position
            r2 = 1
            int r1 = r1 + r2
            r0.position = r1
        L1f:
            r0 = r9
            r1 = r10
            int r1 = r1.position
            char r0 = r0.charAt(r1)
            r1 = 62
            if (r0 == r1) goto La6
            r0 = r10
            int r0 = r0.position
            r12 = r0
            r0 = r10
            r1 = r9
            r2 = 58
            int r0 = r0.indexOf(r1, r2)
            r13 = r0
            r0 = r9
            r1 = r10
            r2 = 1
            javassist.bytecode.SignatureAttribute$ObjectType r0 = parseObjectType(r0, r1, r2)
            r14 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r15 = r0
        L4b:
            r0 = r9
            r1 = r10
            int r1 = r1.position
            char r0 = r0.charAt(r1)
            r1 = 58
            if (r0 != r1) goto L77
            r0 = r10
            r1 = r0
            int r1 = r1.position
            r2 = 1
            int r1 = r1 + r2
            r0.position = r1
            r0 = r9
            r1 = r10
            r2 = 0
            javassist.bytecode.SignatureAttribute$ObjectType r0 = parseObjectType(r0, r1, r2)
            r16 = r0
            r0 = r15
            r1 = r16
            boolean r0 = r0.add(r1)
            goto L4b
        L77:
            javassist.bytecode.SignatureAttribute$TypeParameter r0 = new javassist.bytecode.SignatureAttribute$TypeParameter
            r1 = r0
            r2 = r9
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r15
            int r7 = r7.size()
            javassist.bytecode.SignatureAttribute$ObjectType[] r7 = new javassist.bytecode.SignatureAttribute.ObjectType[r7]
            java.lang.Object[] r6 = r6.toArray(r7)
            javassist.bytecode.SignatureAttribute$ObjectType[] r6 = (javassist.bytecode.SignatureAttribute.ObjectType[]) r6
            r1.<init>(r2, r3, r4, r5, r6)
            r16 = r0
            r0 = r11
            r1 = r16
            boolean r0 = r0.add(r1)
            goto L1f
        La6:
            r0 = r10
            r1 = r0
            int r1 = r1.position
            r2 = 1
            int r1 = r1 + r2
            r0.position = r1
        Lb0:
            r0 = r11
            r1 = r11
            int r1 = r1.size()
            javassist.bytecode.SignatureAttribute$TypeParameter[] r1 = new javassist.bytecode.SignatureAttribute.TypeParameter[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            javassist.bytecode.SignatureAttribute$TypeParameter[] r0 = (javassist.bytecode.SignatureAttribute.TypeParameter[]) r0
            return r0
    }

    private static javassist.bytecode.SignatureAttribute.ObjectType parseObjectType(java.lang.String r6, javassist.bytecode.SignatureAttribute.Cursor r7, boolean r8) throws javassist.bytecode.BadBytecode {
            r0 = r7
            int r0 = r0.position
            r10 = r0
            r0 = r6
            r1 = r10
            char r0 = r0.charAt(r1)
            switch(r0) {
                case 76: goto L30;
                case 84: goto L37;
                case 91: goto L4d;
                default: goto L53;
            }
        L30:
            r0 = r6
            r1 = r7
            r2 = 0
            javassist.bytecode.SignatureAttribute$ClassType r0 = parseClassType2(r0, r1, r2)
            return r0
        L37:
            r0 = r7
            r1 = r6
            r2 = 59
            int r0 = r0.indexOf(r1, r2)
            r9 = r0
            javassist.bytecode.SignatureAttribute$TypeVariable r0 = new javassist.bytecode.SignatureAttribute$TypeVariable
            r1 = r0
            r2 = r6
            r3 = r10
            r4 = 1
            int r3 = r3 + r4
            r4 = r9
            r1.<init>(r2, r3, r4)
            return r0
        L4d:
            r0 = r6
            r1 = r7
            javassist.bytecode.SignatureAttribute$ObjectType r0 = parseArray(r0, r1)
            return r0
        L53:
            r0 = r8
            if (r0 == 0) goto L59
            r0 = 0
            return r0
        L59:
            r0 = r6
            javassist.bytecode.BadBytecode r0 = error(r0)
            throw r0
    }

    private static javassist.bytecode.SignatureAttribute.ClassType parseClassType(java.lang.String r4, javassist.bytecode.SignatureAttribute.Cursor r5) throws javassist.bytecode.BadBytecode {
            r0 = r4
            r1 = r5
            int r1 = r1.position
            char r0 = r0.charAt(r1)
            r1 = 76
            if (r0 != r1) goto L14
            r0 = r4
            r1 = r5
            r2 = 0
            javassist.bytecode.SignatureAttribute$ClassType r0 = parseClassType2(r0, r1, r2)
            return r0
        L14:
            r0 = r4
            javassist.bytecode.BadBytecode r0 = error(r0)
            throw r0
    }

    private static javassist.bytecode.SignatureAttribute.ClassType parseClassType2(java.lang.String r6, javassist.bytecode.SignatureAttribute.Cursor r7, javassist.bytecode.SignatureAttribute.ClassType r8) throws javassist.bytecode.BadBytecode {
            r0 = r7
            r1 = r0
            int r1 = r1.position
            r2 = 1
            int r1 = r1 + r2
            r2 = r1; r1 = r0; r0 = r2; 
            r1.position = r2
            r9 = r0
        Lc:
            r0 = r6
            r1 = r7
            r2 = r1
            int r2 = r2.position
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.position = r3
            char r0 = r0.charAt(r1)
            r10 = r0
            r0 = r10
            r1 = 36
            if (r0 == r1) goto L32
            r0 = r10
            r1 = 60
            if (r0 == r1) goto L32
            r0 = r10
            r1 = 59
            if (r0 != r1) goto Lc
        L32:
            r0 = r7
            int r0 = r0.position
            r1 = 1
            int r0 = r0 - r1
            r11 = r0
            r0 = r10
            r1 = 60
            if (r0 != r1) goto L5c
            r0 = r6
            r1 = r7
            javassist.bytecode.SignatureAttribute$TypeArgument[] r0 = parseTypeArgs(r0, r1)
            r12 = r0
            r0 = r6
            r1 = r7
            r2 = r1
            int r2 = r2.position
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.position = r3
            char r0 = r0.charAt(r1)
            r10 = r0
            goto L5f
        L5c:
            r0 = 0
            r12 = r0
        L5f:
            r0 = r6
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r8
            javassist.bytecode.SignatureAttribute$ClassType r0 = javassist.bytecode.SignatureAttribute.ClassType.make(r0, r1, r2, r3, r4)
            r13 = r0
            r0 = r10
            r1 = 36
            if (r0 == r1) goto L79
            r0 = r10
            r1 = 46
            if (r0 != r1) goto L8b
        L79:
            r0 = r7
            r1 = r0
            int r1 = r1.position
            r2 = 1
            int r1 = r1 - r2
            r0.position = r1
            r0 = r6
            r1 = r7
            r2 = r13
            javassist.bytecode.SignatureAttribute$ClassType r0 = parseClassType2(r0, r1, r2)
            return r0
        L8b:
            r0 = r13
            return r0
    }

    private static javassist.bytecode.SignatureAttribute.TypeArgument[] parseTypeArgs(java.lang.String r6, javassist.bytecode.SignatureAttribute.Cursor r7) throws javassist.bytecode.BadBytecode {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
        L8:
            r0 = r6
            r1 = r7
            r2 = r1
            int r2 = r2.position
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.position = r3
            char r0 = r0.charAt(r1)
            r1 = r0
            r9 = r1
            r1 = 62
            if (r0 == r1) goto L68
            r0 = r9
            r1 = 42
            if (r0 != r1) goto L33
            javassist.bytecode.SignatureAttribute$TypeArgument r0 = new javassist.bytecode.SignatureAttribute$TypeArgument
            r1 = r0
            r2 = 0
            r3 = 42
            r1.<init>(r2, r3)
            r10 = r0
            goto L5c
        L33:
            r0 = r9
            r1 = 43
            if (r0 == r1) goto L4c
            r0 = r9
            r1 = 45
            if (r0 == r1) goto L4c
            r0 = 32
            r9 = r0
            r0 = r7
            r1 = r0
            int r1 = r1.position
            r2 = 1
            int r1 = r1 - r2
            r0.position = r1
        L4c:
            javassist.bytecode.SignatureAttribute$TypeArgument r0 = new javassist.bytecode.SignatureAttribute$TypeArgument
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = 0
            javassist.bytecode.SignatureAttribute$ObjectType r2 = parseObjectType(r2, r3, r4)
            r3 = r9
            r1.<init>(r2, r3)
            r10 = r0
        L5c:
            r0 = r8
            r1 = r10
            boolean r0 = r0.add(r1)
            goto L8
        L68:
            r0 = r8
            r1 = r8
            int r1 = r1.size()
            javassist.bytecode.SignatureAttribute$TypeArgument[] r1 = new javassist.bytecode.SignatureAttribute.TypeArgument[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            javassist.bytecode.SignatureAttribute$TypeArgument[] r0 = (javassist.bytecode.SignatureAttribute.TypeArgument[]) r0
            return r0
    }

    private static javassist.bytecode.SignatureAttribute.ObjectType parseArray(java.lang.String r6, javassist.bytecode.SignatureAttribute.Cursor r7) throws javassist.bytecode.BadBytecode {
            r0 = 1
            r8 = r0
        L2:
            r0 = r6
            r1 = r7
            r2 = r1
            int r2 = r2.position
            r3 = 1
            int r2 = r2 + r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.position = r3
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L1c
            int r8 = r8 + 1
            goto L2
        L1c:
            javassist.bytecode.SignatureAttribute$ArrayType r0 = new javassist.bytecode.SignatureAttribute$ArrayType
            r1 = r0
            r2 = r8
            r3 = r6
            r4 = r7
            javassist.bytecode.SignatureAttribute$Type r3 = parseType(r3, r4)
            r1.<init>(r2, r3)
            return r0
    }

    private static javassist.bytecode.SignatureAttribute.Type parseType(java.lang.String r8, javassist.bytecode.SignatureAttribute.Cursor r9) throws javassist.bytecode.BadBytecode {
            r0 = r8
            r1 = r9
            r2 = 1
            javassist.bytecode.SignatureAttribute$ObjectType r0 = parseObjectType(r0, r1, r2)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L22
            javassist.bytecode.SignatureAttribute$BaseType r0 = new javassist.bytecode.SignatureAttribute$BaseType
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r3
            int r4 = r4.position
            r5 = r4; r4 = r3; r3 = r5; 
            r6 = 1
            int r5 = r5 + r6
            r4.position = r5
            char r2 = r2.charAt(r3)
            r1.<init>(r2)
            r10 = r0
        L22:
            r0 = r10
            return r0
    }

    private static javassist.bytecode.BadBytecode error(java.lang.String r5) {
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad signature: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            return r0
    }

    private static /* synthetic */ boolean lambda$makeNewClassName$0(int r3) {
            r0 = r3
            r1 = 36
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    static /* synthetic */ javassist.bytecode.BadBytecode access$000(java.lang.String r2) {
            r0 = r2
            javassist.bytecode.BadBytecode r0 = error(r0)
            return r0
    }
}
