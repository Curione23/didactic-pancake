package javassist.bytecode.annotation;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/annotation/Annotation.class */
public class Annotation {
    javassist.bytecode.ConstPool pool;
    int typeIndex;
    java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation.Pair> members;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/annotation/Annotation$Pair.class */
    static class Pair {
        int name;
        javassist.bytecode.annotation.MemberValue value;

        Pair() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    public Annotation(int r4, javassist.bytecode.ConstPool r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r5
            r0.pool = r1
            r0 = r3
            r1 = r4
            r0.typeIndex = r1
            r0 = r3
            r1 = 0
            r0.members = r1
            return
    }

    public Annotation(java.lang.String r5, javassist.bytecode.ConstPool r6) {
            r4 = this;
            r0 = r4
            r1 = r6
            r2 = r5
            java.lang.String r2 = javassist.bytecode.Descriptor.of(r2)
            int r1 = r1.addUtf8Info(r2)
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    public Annotation(javassist.bytecode.ConstPool r6, javassist.CtClass r7) throws javassist.NotFoundException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = javassist.bytecode.Descriptor.of(r2)
            int r1 = r1.addUtf8Info(r2)
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r7
            boolean r0 = r0.isInterface()
            if (r0 != 0) goto L21
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Only interfaces are allowed for Annotation creation."
            r1.<init>(r2)
            throw r0
        L21:
            r0 = r7
            javassist.CtMethod[] r0 = r0.getDeclaredMethods()
            r8 = r0
            r0 = r8
            int r0 = r0.length
            if (r0 <= 0) goto L36
            r0 = r5
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = r1
            r2.<init>()
            r0.members = r1
        L36:
            r0 = r8
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L41:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L67
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r5
            r1 = r12
            java.lang.String r1 = r1.getName()
            r2 = r6
            r3 = r12
            javassist.CtClass r3 = r3.getReturnType()
            javassist.bytecode.annotation.MemberValue r2 = createMemberValue(r2, r3)
            r0.addMemberValue(r1, r2)
            int r11 = r11 + 1
            goto L41
        L67:
            return
    }

    public static javassist.bytecode.annotation.MemberValue createMemberValue(javassist.bytecode.ConstPool r5, javassist.CtClass r6) throws javassist.NotFoundException {
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.booleanType
            if (r0 != r1) goto L10
            javassist.bytecode.annotation.BooleanMemberValue r0 = new javassist.bytecode.annotation.BooleanMemberValue
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
        L10:
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.byteType
            if (r0 != r1) goto L20
            javassist.bytecode.annotation.ByteMemberValue r0 = new javassist.bytecode.annotation.ByteMemberValue
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
        L20:
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.charType
            if (r0 != r1) goto L30
            javassist.bytecode.annotation.CharMemberValue r0 = new javassist.bytecode.annotation.CharMemberValue
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
        L30:
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.shortType
            if (r0 != r1) goto L40
            javassist.bytecode.annotation.ShortMemberValue r0 = new javassist.bytecode.annotation.ShortMemberValue
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
        L40:
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.intType
            if (r0 != r1) goto L50
            javassist.bytecode.annotation.IntegerMemberValue r0 = new javassist.bytecode.annotation.IntegerMemberValue
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
        L50:
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.longType
            if (r0 != r1) goto L60
            javassist.bytecode.annotation.LongMemberValue r0 = new javassist.bytecode.annotation.LongMemberValue
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
        L60:
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.floatType
            if (r0 != r1) goto L70
            javassist.bytecode.annotation.FloatMemberValue r0 = new javassist.bytecode.annotation.FloatMemberValue
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
        L70:
            r0 = r6
            javassist.CtClass r1 = javassist.CtClass.doubleType
            if (r0 != r1) goto L80
            javassist.bytecode.annotation.DoubleMemberValue r0 = new javassist.bytecode.annotation.DoubleMemberValue
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
        L80:
            r0 = r6
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "java.lang.Class"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L95
            javassist.bytecode.annotation.ClassMemberValue r0 = new javassist.bytecode.annotation.ClassMemberValue
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
        L95:
            r0 = r6
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "java.lang.String"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Laa
            javassist.bytecode.annotation.StringMemberValue r0 = new javassist.bytecode.annotation.StringMemberValue
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            return r0
        Laa:
            r0 = r6
            boolean r0 = r0.isArray()
            if (r0 == 0) goto Lc6
            r0 = r6
            javassist.CtClass r0 = r0.getComponentType()
            r7 = r0
            r0 = r5
            r1 = r7
            javassist.bytecode.annotation.MemberValue r0 = createMemberValue(r0, r1)
            r8 = r0
            javassist.bytecode.annotation.ArrayMemberValue r0 = new javassist.bytecode.annotation.ArrayMemberValue
            r1 = r0
            r2 = r8
            r3 = r5
            r1.<init>(r2, r3)
            return r0
        Lc6:
            r0 = r6
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto Le1
            javassist.bytecode.annotation.Annotation r0 = new javassist.bytecode.annotation.Annotation
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r7 = r0
            javassist.bytecode.annotation.AnnotationMemberValue r0 = new javassist.bytecode.annotation.AnnotationMemberValue
            r1 = r0
            r2 = r7
            r3 = r5
            r1.<init>(r2, r3)
            return r0
        Le1:
            javassist.bytecode.annotation.EnumMemberValue r0 = new javassist.bytecode.annotation.EnumMemberValue
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            r1 = r6
            java.lang.String r1 = r1.getName()
            r0.setType(r1)
            r0 = r7
            return r0
    }

    public void addMemberValue(int r4, javassist.bytecode.annotation.MemberValue r5) {
            r3 = this;
            javassist.bytecode.annotation.Annotation$Pair r0 = new javassist.bytecode.annotation.Annotation$Pair
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = r4
            r0.name = r1
            r0 = r6
            r1 = r5
            r0.value = r1
            r0 = r3
            r1 = r6
            r0.addMemberValue(r1)
            return
    }

    public void addMemberValue(java.lang.String r5, javassist.bytecode.annotation.MemberValue r6) {
            r4 = this;
            javassist.bytecode.annotation.Annotation$Pair r0 = new javassist.bytecode.annotation.Annotation$Pair
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            r1 = r4
            javassist.bytecode.ConstPool r1 = r1.pool
            r2 = r5
            int r1 = r1.addUtf8Info(r2)
            r0.name = r1
            r0 = r7
            r1 = r6
            r0.value = r1
            r0 = r4
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            if (r0 != 0) goto L2b
            r0 = r4
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = r1
            r2.<init>()
            r0.members = r1
        L2b:
            r0 = r4
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            r1 = r5
            r2 = r7
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    private void addMemberValue(javassist.bytecode.annotation.Annotation.Pair r5) {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.pool
            r1 = r5
            int r1 = r1.name
            java.lang.String r0 = r0.getUtf8Info(r1)
            r6 = r0
            r0 = r4
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            if (r0 != 0) goto L1e
            r0 = r4
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r2 = r1
            r2.<init>()
            r0.members = r1
        L1e:
            r0 = r4
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            r1 = r6
            r2 = r5
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            r1 = 64
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r4
            java.lang.String r1 = r1.getTypeName()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            if (r0 == 0) goto L74
            r0 = r5
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        L35:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L63
            r0 = r6
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r7 = r0
            r0 = r5
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 61
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            r2 = r7
            javassist.bytecode.annotation.MemberValue r1 = r1.getMemberValue(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L35
        L63:
            r0 = r5
            r1 = r5
            int r1 = r1.length()
            r2 = 2
            int r1 = r1 - r2
            r0.setLength(r1)
            r0 = r5
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
        L74:
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String getTypeName() {
            r3 = this;
            r0 = r3
            javassist.bytecode.ConstPool r0 = r0.pool
            r1 = r3
            int r1 = r1.typeIndex
            java.lang.String r0 = r0.getUtf8Info(r1)
            java.lang.String r0 = javassist.bytecode.Descriptor.toClassName(r0)
            return r0
    }

    public java.util.Set<java.lang.String> getMemberNames() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r2
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public javassist.bytecode.annotation.MemberValue getMemberValue(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            if (r0 == 0) goto L14
            r0 = r3
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L16
        L14:
            r0 = 0
            return r0
        L16:
            r0 = r3
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.annotation.Annotation$Pair r0 = (javassist.bytecode.annotation.Annotation.Pair) r0
            javassist.bytecode.annotation.MemberValue r0 = r0.value
            return r0
    }

    public java.lang.Object toAnnotationType(java.lang.ClassLoader r6, javassist.ClassPool r7) throws java.lang.ClassNotFoundException, javassist.bytecode.annotation.NoSuchClassError {
            r5 = this;
            r0 = r6
            r1 = r5
            java.lang.String r1 = r1.getTypeName()
            java.lang.Class r0 = javassist.bytecode.annotation.MemberValue.loadClass(r0, r1)
            r8 = r0
            r0 = r6
            r1 = r8
            r2 = r7
            r3 = r5
            java.lang.Object r0 = javassist.bytecode.annotation.AnnotationImpl.make(r0, r1, r2, r3)     // Catch: java.lang.IllegalArgumentException -> L11 java.lang.IllegalAccessError -> L21
            return r0
        L11:
            r9 = move-exception
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.getName()
            r3 = r9
            r1.<init>(r2, r3)
            throw r0
        L21:
            r9 = move-exception
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.getName()
            r3 = r9
            r1.<init>(r2, r3)
            throw r0
    }

    public void write(javassist.bytecode.annotation.AnnotationsWriter r5) throws java.io.IOException {
            r4 = this;
            r0 = r4
            javassist.bytecode.ConstPool r0 = r0.pool
            r1 = r4
            int r1 = r1.typeIndex
            java.lang.String r0 = r0.getUtf8Info(r1)
            r6 = r0
            r0 = r4
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            if (r0 != 0) goto L1a
            r0 = r5
            r1 = r6
            r2 = 0
            r0.annotation(r1, r2)
            return
        L1a:
            r0 = r5
            r1 = r6
            r2 = r4
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r2 = r2.members
            int r2 = r2.size()
            r0.annotation(r1, r2)
            r0 = r4
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L37:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L60
            r0 = r7
            java.lang.Object r0 = r0.next()
            javassist.bytecode.annotation.Annotation$Pair r0 = (javassist.bytecode.annotation.Annotation.Pair) r0
            r8 = r0
            r0 = r5
            r1 = r8
            int r1 = r1.name
            r0.memberValuePair(r1)
            r0 = r8
            javassist.bytecode.annotation.MemberValue r0 = r0.value
            r1 = r5
            r0.write(r1)
            goto L37
        L60:
            return
    }

    public int hashCode() {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.getTypeName()
            int r0 = r0.hashCode()
            r1 = r3
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r1 = r1.members
            if (r1 != 0) goto L12
            r1 = 0
            goto L1b
        L12:
            r1 = r3
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r1 = r1.members
            int r1 = r1.hashCode()
        L1b:
            int r0 = r0 + r1
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = r4
            if (r0 == 0) goto L12
            r0 = r4
            boolean r0 = r0 instanceof javassist.bytecode.annotation.Annotation
            if (r0 != 0) goto L14
        L12:
            r0 = 0
            return r0
        L14:
            r0 = r4
            javassist.bytecode.annotation.Annotation r0 = (javassist.bytecode.annotation.Annotation) r0
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.getTypeName()
            r1 = r5
            java.lang.String r1 = r1.getTypeName()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            r0 = 0
            return r0
        L29:
            r0 = r5
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            r6 = r0
            r0 = r3
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            r1 = r6
            if (r0 != r1) goto L38
            r0 = 1
            return r0
        L38:
            r0 = r3
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            if (r0 != 0) goto L49
            r0 = r6
            if (r0 != 0) goto L47
            r0 = 1
            goto L48
        L47:
            r0 = 0
        L48:
            return r0
        L49:
            r0 = r6
            if (r0 != 0) goto L4f
            r0 = 0
            return r0
        L4f:
            r0 = r3
            java.util.Map<java.lang.String, javassist.bytecode.annotation.Annotation$Pair> r0 = r0.members
            r1 = r6
            boolean r0 = r0.equals(r1)
            return r0
    }
}
