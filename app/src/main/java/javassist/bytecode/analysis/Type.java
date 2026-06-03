package javassist.bytecode.analysis;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/Type.class */
public class Type {
    private final javassist.CtClass clazz;
    private final boolean special;
    private static final java.util.Map<javassist.CtClass, javassist.bytecode.analysis.Type> prims = null;
    public static final javassist.bytecode.analysis.Type DOUBLE = null;
    public static final javassist.bytecode.analysis.Type BOOLEAN = null;
    public static final javassist.bytecode.analysis.Type LONG = null;
    public static final javassist.bytecode.analysis.Type CHAR = null;
    public static final javassist.bytecode.analysis.Type BYTE = null;
    public static final javassist.bytecode.analysis.Type SHORT = null;
    public static final javassist.bytecode.analysis.Type INTEGER = null;
    public static final javassist.bytecode.analysis.Type FLOAT = null;
    public static final javassist.bytecode.analysis.Type VOID = null;
    public static final javassist.bytecode.analysis.Type UNINIT = null;
    public static final javassist.bytecode.analysis.Type RETURN_ADDRESS = null;
    public static final javassist.bytecode.analysis.Type TOP = null;
    public static final javassist.bytecode.analysis.Type BOGUS = null;
    public static final javassist.bytecode.analysis.Type OBJECT = null;
    public static final javassist.bytecode.analysis.Type SERIALIZABLE = null;
    public static final javassist.bytecode.analysis.Type CLONEABLE = null;
    public static final javassist.bytecode.analysis.Type THROWABLE = null;

    public static javassist.bytecode.analysis.Type get(javassist.CtClass r4) {
            java.util.Map<javassist.CtClass, javassist.bytecode.analysis.Type> r0 = javassist.bytecode.analysis.Type.prims
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.analysis.Type r0 = (javassist.bytecode.analysis.Type) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L15
            r0 = r5
            goto L1d
        L15:
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            r2 = r4
            r1.<init>(r2)
        L1d:
            return r0
    }

    private static javassist.bytecode.analysis.Type lookupType(java.lang.String r5) {
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type     // Catch: javassist.NotFoundException -> Lf
            r1 = r0
            javassist.ClassPool r2 = javassist.ClassPool.getDefault()     // Catch: javassist.NotFoundException -> Lf
            r3 = r5
            javassist.CtClass r2 = r2.get(r3)     // Catch: javassist.NotFoundException -> Lf
            r1.<init>(r2)     // Catch: javassist.NotFoundException -> Lf
            return r0
        Lf:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    Type(javassist.CtClass r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    private Type(javassist.CtClass r4, boolean r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.clazz = r1
            r0 = r3
            r1 = r5
            r0.special = r1
            return
    }

    boolean popChanged() {
            r2 = this;
            r0 = 0
            return r0
    }

    public int getSize() {
            r3 = this;
            r0 = r3
            javassist.CtClass r0 = r0.clazz
            javassist.CtClass r1 = javassist.CtClass.doubleType
            if (r0 == r1) goto L1b
            r0 = r3
            javassist.CtClass r0 = r0.clazz
            javassist.CtClass r1 = javassist.CtClass.longType
            if (r0 == r1) goto L1b
            r0 = r3
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.TOP
            if (r0 != r1) goto L1f
        L1b:
            r0 = 2
            goto L20
        L1f:
            r0 = 1
        L20:
            return r0
    }

    public javassist.CtClass getCtClass() {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.clazz
            return r0
    }

    public boolean isReference() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.special
            if (r0 != 0) goto L1c
            r0 = r2
            javassist.CtClass r0 = r0.clazz
            if (r0 == 0) goto L18
            r0 = r2
            javassist.CtClass r0 = r0.clazz
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto L1c
        L18:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    public boolean isSpecial() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.special
            return r0
    }

    public boolean isArray() {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.clazz
            if (r0 == 0) goto L15
            r0 = r2
            javassist.CtClass r0 = r0.clazz
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    public int getDimensions() {
            r3 = this;
            r0 = r3
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r3
            javassist.CtClass r0 = r0.clazz
            java.lang.String r0 = r0.getName()
            r4 = r0
            r0 = r4
            int r0 = r0.length()
            r1 = 1
            int r0 = r0 - r1
            r5 = r0
            r0 = 0
            r6 = r0
        L1a:
            r0 = r4
            r1 = r5
            char r0 = r0.charAt(r1)
            r1 = 93
            if (r0 != r1) goto L2d
            int r5 = r5 + (-2)
            int r6 = r6 + 1
            goto L1a
        L2d:
            r0 = r6
            return r0
    }

    public javassist.bytecode.analysis.Type getComponent() {
            r4 = this;
            r0 = r4
            javassist.CtClass r0 = r0.clazz
            if (r0 == 0) goto L11
            r0 = r4
            javassist.CtClass r0 = r0.clazz
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L13
        L11:
            r0 = 0
            return r0
        L13:
            r0 = r4
            javassist.CtClass r0 = r0.clazz     // Catch: javassist.NotFoundException -> L1e
            javassist.CtClass r0 = r0.getComponentType()     // Catch: javassist.NotFoundException -> L1e
            r5 = r0
            goto L28
        L1e:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L28:
            java.util.Map<javassist.CtClass, javassist.bytecode.analysis.Type> r0 = javassist.bytecode.analysis.Type.prims
            r1 = r5
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.analysis.Type r0 = (javassist.bytecode.analysis.Type) r0
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L3d
            r0 = r6
            goto L45
        L3d:
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            r2 = r5
            r1.<init>(r2)
        L45:
            return r0
    }

    public boolean isAssignableFrom(javassist.bytecode.analysis.Type r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = r5
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.UNINIT
            if (r0 != r1) goto L15
            r0 = r4
            boolean r0 = r0.isReference()
            if (r0 != 0) goto L23
        L15:
            r0 = r4
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.UNINIT
            if (r0 != r1) goto L25
            r0 = r5
            boolean r0 = r0.isReference()
            if (r0 == 0) goto L25
        L23:
            r0 = 1
            return r0
        L25:
            r0 = r5
            boolean r0 = r0 instanceof javassist.bytecode.analysis.MultiType
            if (r0 == 0) goto L35
            r0 = r5
            javassist.bytecode.analysis.MultiType r0 = (javassist.bytecode.analysis.MultiType) r0
            r1 = r4
            boolean r0 = r0.isAssignableTo(r1)
            return r0
        L35:
            r0 = r5
            boolean r0 = r0 instanceof javassist.bytecode.analysis.MultiArrayType
            if (r0 == 0) goto L45
            r0 = r5
            javassist.bytecode.analysis.MultiArrayType r0 = (javassist.bytecode.analysis.MultiArrayType) r0
            r1 = r4
            boolean r0 = r0.isAssignableTo(r1)
            return r0
        L45:
            r0 = r4
            javassist.CtClass r0 = r0.clazz
            if (r0 == 0) goto L56
            r0 = r4
            javassist.CtClass r0 = r0.clazz
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L58
        L56:
            r0 = 0
            return r0
        L58:
            r0 = r5
            javassist.CtClass r0 = r0.clazz     // Catch: java.lang.Exception -> L64
            r1 = r4
            javassist.CtClass r1 = r1.clazz     // Catch: java.lang.Exception -> L64
            boolean r0 = r0.subtypeOf(r1)     // Catch: java.lang.Exception -> L64
            return r0
        L64:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    public javassist.bytecode.analysis.Type merge(javassist.bytecode.analysis.Type r5) {
            r4 = this;
            r0 = r5
            r1 = r4
            if (r0 != r1) goto L7
            r0 = r4
            return r0
        L7:
            r0 = r5
            if (r0 != 0) goto Ld
            r0 = r4
            return r0
        Ld:
            r0 = r5
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.UNINIT
            if (r0 != r1) goto L16
            r0 = r4
            return r0
        L16:
            r0 = r4
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.UNINIT
            if (r0 != r1) goto L1f
            r0 = r5
            return r0
        L1f:
            r0 = r5
            boolean r0 = r0.isReference()
            if (r0 == 0) goto L2d
            r0 = r4
            boolean r0 = r0.isReference()
            if (r0 != 0) goto L31
        L2d:
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.BOGUS
            return r0
        L31:
            r0 = r5
            boolean r0 = r0 instanceof javassist.bytecode.analysis.MultiType
            if (r0 == 0) goto L3e
            r0 = r5
            r1 = r4
            javassist.bytecode.analysis.Type r0 = r0.merge(r1)
            return r0
        L3e:
            r0 = r5
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L52
            r0 = r4
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L52
            r0 = r4
            r1 = r5
            javassist.bytecode.analysis.Type r0 = r0.mergeArray(r1)
            return r0
        L52:
            r0 = r4
            r1 = r5
            javassist.bytecode.analysis.Type r0 = r0.mergeClasses(r1)     // Catch: javassist.NotFoundException -> L58
            return r0
        L58:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    javassist.bytecode.analysis.Type getRootComponent(javassist.bytecode.analysis.Type r3) {
            r2 = this;
        L0:
            r0 = r3
            boolean r0 = r0.isArray()
            if (r0 == 0) goto Lf
            r0 = r3
            javassist.bytecode.analysis.Type r0 = r0.getComponent()
            r3 = r0
            goto L0
        Lf:
            r0 = r3
            return r0
    }

    private javassist.bytecode.analysis.Type createArray(javassist.bytecode.analysis.Type r6, int r7) {
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof javassist.bytecode.analysis.MultiType
            if (r0 == 0) goto L14
            javassist.bytecode.analysis.MultiArrayType r0 = new javassist.bytecode.analysis.MultiArrayType
            r1 = r0
            r2 = r6
            javassist.bytecode.analysis.MultiType r2 = (javassist.bytecode.analysis.MultiType) r2
            r3 = r7
            r1.<init>(r2, r3)
            return r0
        L14:
            r0 = r5
            r1 = r6
            javassist.CtClass r1 = r1.clazz
            java.lang.String r1 = r1.getName()
            r2 = r7
            java.lang.String r0 = r0.arrayName(r1, r2)
            r8 = r0
            r0 = r5
            r1 = r6
            javassist.ClassPool r0 = r0.getClassPool(r1)     // Catch: javassist.NotFoundException -> L32
            r1 = r8
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> L32
            javassist.bytecode.analysis.Type r0 = get(r0)     // Catch: javassist.NotFoundException -> L32
            r9 = r0
            goto L3e
        L32:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            throw r0
        L3e:
            r0 = r9
            return r0
    }

    java.lang.String arrayName(java.lang.String r7, int r8) {
            r6 = this;
            r0 = r7
            int r0 = r0.length()
            r9 = r0
            r0 = r9
            r1 = r8
            r2 = 2
            int r1 = r1 * r2
            int r0 = r0 + r1
            r10 = r0
            r0 = r10
            char[] r0 = new char[r0]
            r11 = r0
            r0 = r7
            r1 = 0
            r2 = r9
            r3 = r11
            r4 = 0
            r0.getChars(r1, r2, r3, r4)
        L1b:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L36
            r0 = r11
            r1 = r9
            int r9 = r9 + 1
            r2 = 91
            r0[r1] = r2
            r0 = r11
            r1 = r9
            int r9 = r9 + 1
            r2 = 93
            r0[r1] = r2
            goto L1b
        L36:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            return r0
    }

    private javassist.ClassPool getClassPool(javassist.bytecode.analysis.Type r3) {
            r2 = this;
            r0 = r3
            javassist.CtClass r0 = r0.clazz
            javassist.ClassPool r0 = r0.getClassPool()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L10
            r0 = r4
            goto L13
        L10:
            javassist.ClassPool r0 = javassist.ClassPool.getDefault()
        L13:
            return r0
    }

    private javassist.bytecode.analysis.Type mergeArray(javassist.bytecode.analysis.Type r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            javassist.bytecode.analysis.Type r0 = r0.getRootComponent(r1)
            r6 = r0
            r0 = r4
            r1 = r4
            javassist.bytecode.analysis.Type r0 = r0.getRootComponent(r1)
            r7 = r0
            r0 = r5
            int r0 = r0.getDimensions()
            r8 = r0
            r0 = r4
            int r0 = r0.getDimensions()
            r9 = r0
            r0 = r8
            r1 = r9
            if (r0 != r1) goto L3b
            r0 = r7
            r1 = r6
            javassist.bytecode.analysis.Type r0 = r0.merge(r1)
            r10 = r0
            r0 = r10
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.BOGUS
            if (r0 != r1) goto L32
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.OBJECT
            return r0
        L32:
            r0 = r4
            r1 = r10
            r2 = r9
            javassist.bytecode.analysis.Type r0 = r0.createArray(r1, r2)
            return r0
        L3b:
            r0 = r8
            r1 = r9
            if (r0 >= r1) goto L4c
            r0 = r6
            r10 = r0
            r0 = r8
            r11 = r0
            goto L53
        L4c:
            r0 = r7
            r10 = r0
            r0 = r9
            r11 = r0
        L53:
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.CLONEABLE
            javassist.CtClass r0 = r0.clazz
            r1 = r10
            javassist.CtClass r1 = r1.clazz
            boolean r0 = eq(r0, r1)
            if (r0 != 0) goto L75
            javassist.bytecode.analysis.Type r0 = javassist.bytecode.analysis.Type.SERIALIZABLE
            javassist.CtClass r0 = r0.clazz
            r1 = r10
            javassist.CtClass r1 = r1.clazz
            boolean r0 = eq(r0, r1)
            if (r0 == 0) goto L7e
        L75:
            r0 = r4
            r1 = r10
            r2 = r11
            javassist.bytecode.analysis.Type r0 = r0.createArray(r1, r2)
            return r0
        L7e:
            r0 = r4
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.OBJECT
            r2 = r11
            javassist.bytecode.analysis.Type r0 = r0.createArray(r1, r2)
            return r0
    }

    private static javassist.CtClass findCommonSuperClass(javassist.CtClass r3, javassist.CtClass r4) throws javassist.NotFoundException {
            r0 = r3
            r5 = r0
            r0 = r4
            r6 = r0
            r0 = r6
            r7 = r0
            r0 = r5
            r8 = r0
        La:
            r0 = r5
            r1 = r6
            boolean r0 = eq(r0, r1)
            if (r0 == 0) goto L1b
            r0 = r5
            javassist.CtClass r0 = r0.getSuperclass()
            if (r0 == 0) goto L1b
            r0 = r5
            return r0
        L1b:
            r0 = r5
            javassist.CtClass r0 = r0.getSuperclass()
            r9 = r0
            r0 = r6
            javassist.CtClass r0 = r0.getSuperclass()
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L32
            r0 = r7
            r6 = r0
            goto L52
        L32:
            r0 = r9
            if (r0 != 0) goto L49
            r0 = r8
            r5 = r0
            r0 = r7
            r8 = r0
            r0 = r5
            r7 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            r6 = r0
            goto L52
        L49:
            r0 = r9
            r5 = r0
            r0 = r10
            r6 = r0
            goto La
        L52:
            r0 = r5
            javassist.CtClass r0 = r0.getSuperclass()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L5e
            goto L68
        L5e:
            r0 = r8
            javassist.CtClass r0 = r0.getSuperclass()
            r8 = r0
            goto L52
        L68:
            r0 = r8
            r5 = r0
        L6b:
            r0 = r5
            r1 = r6
            boolean r0 = eq(r0, r1)
            if (r0 != 0) goto L80
            r0 = r5
            javassist.CtClass r0 = r0.getSuperclass()
            r5 = r0
            r0 = r6
            javassist.CtClass r0 = r0.getSuperclass()
            r6 = r0
            goto L6b
        L80:
            r0 = r5
            return r0
    }

    private javassist.bytecode.analysis.Type mergeClasses(javassist.bytecode.analysis.Type r8) throws javassist.NotFoundException {
            r7 = this;
            r0 = r7
            javassist.CtClass r0 = r0.clazz
            r1 = r8
            javassist.CtClass r1 = r1.clazz
            javassist.CtClass r0 = findCommonSuperClass(r0, r1)
            r9 = r0
            r0 = r9
            javassist.CtClass r0 = r0.getSuperclass()
            if (r0 != 0) goto L5a
            r0 = r7
            r1 = r8
            java.util.Map r0 = r0.findCommonInterfaces(r1)
            r10 = r0
            r0 = r10
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L3e
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            r2 = r10
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
            javassist.CtClass r2 = (javassist.CtClass) r2
            r1.<init>(r2)
            return r0
        L3e:
            r0 = r10
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L51
            javassist.bytecode.analysis.MultiType r0 = new javassist.bytecode.analysis.MultiType
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            return r0
        L51:
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            return r0
        L5a:
            r0 = r7
            r1 = r8
            r2 = r9
            java.util.Map r0 = r0.findExclusiveDeclaredInterfaces(r1, r2)
            r10 = r0
            r0 = r10
            int r0 = r0.size()
            if (r0 <= 0) goto L7b
            javassist.bytecode.analysis.MultiType r0 = new javassist.bytecode.analysis.MultiType
            r1 = r0
            r2 = r10
            javassist.bytecode.analysis.Type r3 = new javassist.bytecode.analysis.Type
            r4 = r3
            r5 = r9
            r4.<init>(r5)
            r1.<init>(r2, r3)
            return r0
        L7b:
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            return r0
    }

    private java.util.Map<java.lang.String, javassist.CtClass> findCommonInterfaces(javassist.bytecode.analysis.Type r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            javassist.CtClass r1 = r1.clazz
            r2 = 0
            java.util.Map r0 = r0.getAllInterfaces(r1, r2)
            r6 = r0
            r0 = r4
            r1 = r4
            javassist.CtClass r1 = r1.clazz
            r2 = 0
            java.util.Map r0 = r0.getAllInterfaces(r1, r2)
            r7 = r0
            r0 = r4
            r1 = r6
            r2 = r7
            java.util.Map r0 = r0.findCommonInterfaces(r1, r2)
            return r0
    }

    private java.util.Map<java.lang.String, javassist.CtClass> findExclusiveDeclaredInterfaces(javassist.bytecode.analysis.Type r5, javassist.CtClass r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            javassist.CtClass r1 = r1.clazz
            r2 = 0
            java.util.Map r0 = r0.getDeclaredInterfaces(r1, r2)
            r7 = r0
            r0 = r4
            r1 = r4
            javassist.CtClass r1 = r1.clazz
            r2 = 0
            java.util.Map r0 = r0.getDeclaredInterfaces(r1, r2)
            r8 = r0
            r0 = r4
            r1 = r6
            r2 = 0
            java.util.Map r0 = r0.getAllInterfaces(r1, r2)
            r9 = r0
            r0 = r9
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        L2b:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L57
            r0 = r10
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r7
            r1 = r11
            java.lang.Object r0 = r0.remove(r1)
            r0 = r8
            r1 = r11
            java.lang.Object r0 = r0.remove(r1)
            goto L2b
        L57:
            r0 = r4
            r1 = r7
            r2 = r8
            java.util.Map r0 = r0.findCommonInterfaces(r1, r2)
            return r0
    }

    java.util.Map<java.lang.String, javassist.CtClass> findCommonInterfaces(java.util.Map<java.lang.String, javassist.CtClass> r5, java.util.Map<java.lang.String, javassist.CtClass> r6) {
            r4 = this;
            r0 = r6
            if (r0 != 0) goto Lc
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r6 = r0
        Lc:
            r0 = r5
            if (r0 == 0) goto L19
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1f
        L19:
            r0 = r6
            r0.clear()
        L1f:
            r0 = r6
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L2b:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L53
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            r0 = r5
            r1 = r8
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L50
            r0 = r7
            r0.remove()
        L50:
            goto L2b
        L53:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r6
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        L69:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto La1
            r0 = r9
            java.lang.Object r0 = r0.next()
            javassist.CtClass r0 = (javassist.CtClass) r0
            r10 = r0
            r0 = r8
            r1 = r10
            javassist.CtClass[] r1 = r1.getInterfaces()     // Catch: javassist.NotFoundException -> L92
            java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: javassist.NotFoundException -> L92
            boolean r0 = r0.addAll(r1)     // Catch: javassist.NotFoundException -> L92
            goto L9e
        L92:
            r11 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            throw r0
        L9e:
            goto L69
        La1:
            r0 = r8
            java.util.Iterator r0 = r0.iterator()
            r9 = r0
        Laa:
            r0 = r9
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lcf
            r0 = r9
            java.lang.Object r0 = r0.next()
            javassist.CtClass r0 = (javassist.CtClass) r0
            r10 = r0
            r0 = r6
            r1 = r10
            java.lang.String r1 = r1.getName()
            java.lang.Object r0 = r0.remove(r1)
            goto Laa
        Lcf:
            r0 = r6
            return r0
    }

    java.util.Map<java.lang.String, javassist.CtClass> getAllInterfaces(javassist.CtClass r5, java.util.Map<java.lang.String, javassist.CtClass> r6) {
            r4 = this;
            r0 = r6
            if (r0 != 0) goto Lc
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r6 = r0
        Lc:
            r0 = r5
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L1f
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.getName()
            r2 = r5
            java.lang.Object r0 = r0.put(r1, r2)
        L1f:
            r0 = r5
            javassist.CtClass[] r0 = r0.getInterfaces()     // Catch: javassist.NotFoundException -> L61
            r7 = r0
            r0 = r7
            r8 = r0
            r0 = r8
            int r0 = r0.length     // Catch: javassist.NotFoundException -> L61
            r9 = r0
            r0 = 0
            r10 = r0
        L2f:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L59
            r0 = r8
            r1 = r10
            r0 = r0[r1]     // Catch: javassist.NotFoundException -> L61
            r11 = r0
            r0 = r6
            r1 = r11
            java.lang.String r1 = r1.getName()     // Catch: javassist.NotFoundException -> L61
            r2 = r11
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: javassist.NotFoundException -> L61
            r0 = r4
            r1 = r11
            r2 = r6
            java.util.Map r0 = r0.getAllInterfaces(r1, r2)     // Catch: javassist.NotFoundException -> L61
            int r10 = r10 + 1
            goto L2f
        L59:
            r0 = r5
            javassist.CtClass r0 = r0.getSuperclass()     // Catch: javassist.NotFoundException -> L61
            r5 = r0
            goto L6b
        L61:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
        L6b:
            r0 = r5
            if (r0 != 0) goto L1f
            r0 = r6
            return r0
    }

    java.util.Map<java.lang.String, javassist.CtClass> getDeclaredInterfaces(javassist.CtClass r5, java.util.Map<java.lang.String, javassist.CtClass> r6) {
            r4 = this;
            r0 = r6
            if (r0 != 0) goto Lc
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r6 = r0
        Lc:
            r0 = r5
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L1f
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.getName()
            r2 = r5
            java.lang.Object r0 = r0.put(r1, r2)
        L1f:
            r0 = r5
            javassist.CtClass[] r0 = r0.getInterfaces()     // Catch: javassist.NotFoundException -> L27
            r7 = r0
            goto L33
        L27:
            r8 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            throw r0
        L33:
            r0 = r7
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r10 = r0
        L3e:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L68
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r6
            r1 = r11
            java.lang.String r1 = r1.getName()
            r2 = r11
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            r1 = r11
            r2 = r6
            java.util.Map r0 = r0.getDeclaredInterfaces(r1, r2)
            int r10 = r10 + 1
            goto L3e
        L68:
            r0 = r6
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = r3
            java.lang.Class r0 = r0.getClass()
            int r0 = r0.hashCode()
            r1 = r3
            javassist.CtClass r1 = r1.clazz
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof javassist.bytecode.analysis.Type
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            r1 = r3
            java.lang.Class r1 = r1.getClass()
            if (r0 != r1) goto L29
            r0 = r3
            javassist.CtClass r0 = r0.clazz
            r1 = r4
            javassist.bytecode.analysis.Type r1 = (javassist.bytecode.analysis.Type) r1
            javassist.CtClass r1 = r1.clazz
            boolean r0 = eq(r0, r1)
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            return r0
    }

    static boolean eq(javassist.CtClass r3, javassist.CtClass r4) {
            r0 = r3
            r1 = r4
            if (r0 == r1) goto L1b
            r0 = r3
            if (r0 == 0) goto L1f
            r0 = r4
            if (r0 == 0) goto L1f
            r0 = r3
            java.lang.String r0 = r0.getName()
            r1 = r4
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
        L1b:
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = r3
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.BOGUS
            if (r0 != r1) goto Lb
            java.lang.String r0 = "BOGUS"
            return r0
        Lb:
            r0 = r3
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.UNINIT
            if (r0 != r1) goto L16
            java.lang.String r0 = "UNINIT"
            return r0
        L16:
            r0 = r3
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.RETURN_ADDRESS
            if (r0 != r1) goto L21
            java.lang.String r0 = "RETURN ADDRESS"
            return r0
        L21:
            r0 = r3
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.TOP
            if (r0 != r1) goto L2c
            java.lang.String r0 = "TOP"
            return r0
        L2c:
            r0 = r3
            javassist.CtClass r0 = r0.clazz
            if (r0 != 0) goto L39
            java.lang.String r0 = "null"
            goto L40
        L39:
            r0 = r3
            javassist.CtClass r0 = r0.clazz
            java.lang.String r0 = r0.getName()
        L40:
            return r0
    }

    static {
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r1 = r0
            r1.<init>()
            javassist.bytecode.analysis.Type.prims = r0
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            javassist.CtClass r2 = javassist.CtClass.doubleType
            r1.<init>(r2)
            javassist.bytecode.analysis.Type.DOUBLE = r0
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            javassist.CtClass r2 = javassist.CtClass.booleanType
            r1.<init>(r2)
            javassist.bytecode.analysis.Type.BOOLEAN = r0
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            javassist.CtClass r2 = javassist.CtClass.longType
            r1.<init>(r2)
            javassist.bytecode.analysis.Type.LONG = r0
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            javassist.CtClass r2 = javassist.CtClass.charType
            r1.<init>(r2)
            javassist.bytecode.analysis.Type.CHAR = r0
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            javassist.CtClass r2 = javassist.CtClass.byteType
            r1.<init>(r2)
            javassist.bytecode.analysis.Type.BYTE = r0
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            javassist.CtClass r2 = javassist.CtClass.shortType
            r1.<init>(r2)
            javassist.bytecode.analysis.Type.SHORT = r0
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            javassist.CtClass r2 = javassist.CtClass.intType
            r1.<init>(r2)
            javassist.bytecode.analysis.Type.INTEGER = r0
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            javassist.CtClass r2 = javassist.CtClass.floatType
            r1.<init>(r2)
            javassist.bytecode.analysis.Type.FLOAT = r0
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            javassist.CtClass r2 = javassist.CtClass.voidType
            r1.<init>(r2)
            javassist.bytecode.analysis.Type.VOID = r0
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            javassist.bytecode.analysis.Type.UNINIT = r0
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            r2 = 0
            r3 = 1
            r1.<init>(r2, r3)
            javassist.bytecode.analysis.Type.RETURN_ADDRESS = r0
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            r2 = 0
            r3 = 1
            r1.<init>(r2, r3)
            javassist.bytecode.analysis.Type.TOP = r0
            javassist.bytecode.analysis.Type r0 = new javassist.bytecode.analysis.Type
            r1 = r0
            r2 = 0
            r3 = 1
            r1.<init>(r2, r3)
            javassist.bytecode.analysis.Type.BOGUS = r0
            java.lang.String r0 = "java.lang.Object"
            javassist.bytecode.analysis.Type r0 = lookupType(r0)
            javassist.bytecode.analysis.Type.OBJECT = r0
            java.lang.String r0 = "java.io.Serializable"
            javassist.bytecode.analysis.Type r0 = lookupType(r0)
            javassist.bytecode.analysis.Type.SERIALIZABLE = r0
            java.lang.String r0 = "java.lang.Cloneable"
            javassist.bytecode.analysis.Type r0 = lookupType(r0)
            javassist.bytecode.analysis.Type.CLONEABLE = r0
            java.lang.String r0 = "java.lang.Throwable"
            javassist.bytecode.analysis.Type r0 = lookupType(r0)
            javassist.bytecode.analysis.Type.THROWABLE = r0
            java.util.Map<javassist.CtClass, javassist.bytecode.analysis.Type> r0 = javassist.bytecode.analysis.Type.prims
            javassist.CtClass r1 = javassist.CtClass.doubleType
            javassist.bytecode.analysis.Type r2 = javassist.bytecode.analysis.Type.DOUBLE
            java.lang.Object r0 = r0.put(r1, r2)
            java.util.Map<javassist.CtClass, javassist.bytecode.analysis.Type> r0 = javassist.bytecode.analysis.Type.prims
            javassist.CtClass r1 = javassist.CtClass.longType
            javassist.bytecode.analysis.Type r2 = javassist.bytecode.analysis.Type.LONG
            java.lang.Object r0 = r0.put(r1, r2)
            java.util.Map<javassist.CtClass, javassist.bytecode.analysis.Type> r0 = javassist.bytecode.analysis.Type.prims
            javassist.CtClass r1 = javassist.CtClass.charType
            javassist.bytecode.analysis.Type r2 = javassist.bytecode.analysis.Type.CHAR
            java.lang.Object r0 = r0.put(r1, r2)
            java.util.Map<javassist.CtClass, javassist.bytecode.analysis.Type> r0 = javassist.bytecode.analysis.Type.prims
            javassist.CtClass r1 = javassist.CtClass.shortType
            javassist.bytecode.analysis.Type r2 = javassist.bytecode.analysis.Type.SHORT
            java.lang.Object r0 = r0.put(r1, r2)
            java.util.Map<javassist.CtClass, javassist.bytecode.analysis.Type> r0 = javassist.bytecode.analysis.Type.prims
            javassist.CtClass r1 = javassist.CtClass.intType
            javassist.bytecode.analysis.Type r2 = javassist.bytecode.analysis.Type.INTEGER
            java.lang.Object r0 = r0.put(r1, r2)
            java.util.Map<javassist.CtClass, javassist.bytecode.analysis.Type> r0 = javassist.bytecode.analysis.Type.prims
            javassist.CtClass r1 = javassist.CtClass.floatType
            javassist.bytecode.analysis.Type r2 = javassist.bytecode.analysis.Type.FLOAT
            java.lang.Object r0 = r0.put(r1, r2)
            java.util.Map<javassist.CtClass, javassist.bytecode.analysis.Type> r0 = javassist.bytecode.analysis.Type.prims
            javassist.CtClass r1 = javassist.CtClass.byteType
            javassist.bytecode.analysis.Type r2 = javassist.bytecode.analysis.Type.BYTE
            java.lang.Object r0 = r0.put(r1, r2)
            java.util.Map<javassist.CtClass, javassist.bytecode.analysis.Type> r0 = javassist.bytecode.analysis.Type.prims
            javassist.CtClass r1 = javassist.CtClass.booleanType
            javassist.bytecode.analysis.Type r2 = javassist.bytecode.analysis.Type.BOOLEAN
            java.lang.Object r0 = r0.put(r1, r2)
            java.util.Map<javassist.CtClass, javassist.bytecode.analysis.Type> r0 = javassist.bytecode.analysis.Type.prims
            javassist.CtClass r1 = javassist.CtClass.voidType
            javassist.bytecode.analysis.Type r2 = javassist.bytecode.analysis.Type.VOID
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }
}
