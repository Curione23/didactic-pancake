package javassist.bytecode.annotation;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/annotation/AnnotationImpl.class */
public class AnnotationImpl implements java.lang.reflect.InvocationHandler {
    private static final java.lang.String JDK_ANNOTATION_CLASS_NAME = "java.lang.annotation.Annotation";
    private static java.lang.reflect.Method JDK_ANNOTATION_TYPE_METHOD;
    private javassist.bytecode.annotation.Annotation annotation;
    private javassist.ClassPool pool;
    private java.lang.ClassLoader classLoader;
    private transient java.lang.Class<?> annotationType;
    private transient int cachedHashCode;

    public static java.lang.Object make(java.lang.ClassLoader r6, java.lang.Class<?> r7, javassist.ClassPool r8, javassist.bytecode.annotation.Annotation r9) throws java.lang.IllegalArgumentException {
            javassist.bytecode.annotation.AnnotationImpl r0 = new javassist.bytecode.annotation.AnnotationImpl
            r1 = r0
            r2 = r9
            r3 = r8
            r4 = r6
            r1.<init>(r2, r3, r4)
            r10 = r0
            r0 = r6
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = r1
            r3 = 0
            r4 = r7
            r2[r3] = r4
            r2 = r10
            java.lang.Object r0 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r2)
            return r0
    }

    private AnnotationImpl(javassist.bytecode.annotation.Annotation r4, javassist.ClassPool r5, java.lang.ClassLoader r6) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.cachedHashCode = r1
            r0 = r3
            r1 = r4
            r0.annotation = r1
            r0 = r3
            r1 = r5
            r0.pool = r1
            r0 = r3
            r1 = r6
            r0.classLoader = r1
            return
    }

    public java.lang.String getTypeName() {
            r2 = this;
            r0 = r2
            javassist.bytecode.annotation.Annotation r0 = r0.annotation
            java.lang.String r0 = r0.getTypeName()
            return r0
    }

    private java.lang.Class<?> getAnnotationType() {
            r5 = this;
            r0 = r5
            java.lang.Class<?> r0 = r0.annotationType
            if (r0 != 0) goto L44
            r0 = r5
            javassist.bytecode.annotation.Annotation r0 = r0.annotation
            java.lang.String r0 = r0.getTypeName()
            r6 = r0
            r0 = r5
            r1 = r5
            java.lang.ClassLoader r1 = r1.classLoader     // Catch: java.lang.ClassNotFoundException -> L1e
            r2 = r6
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.ClassNotFoundException -> L1e
            r0.annotationType = r1     // Catch: java.lang.ClassNotFoundException -> L1e
            goto L44
        L1e:
            r7 = move-exception
            java.lang.NoClassDefFoundError r0 = new java.lang.NoClassDefFoundError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Error loading annotation class: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r8 = r0
            r0 = r8
            r1 = r7
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            r0.setStackTrace(r1)
            r0 = r8
            throw r0
        L44:
            r0 = r5
            java.lang.Class<?> r0 = r0.annotationType
            return r0
    }

    public javassist.bytecode.annotation.Annotation getAnnotation() {
            r2 = this;
            r0 = r2
            javassist.bytecode.annotation.Annotation r0 = r0.annotation
            return r0
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) throws java.lang.Throwable {
            r5 = this;
            r0 = r7
            java.lang.String r0 = r0.getName()
            r9 = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r1 = r7
            java.lang.Class r1 = r1.getDeclaringClass()
            if (r0 != r1) goto L4c
            java.lang.String r0 = "equals"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
            r0 = r8
            r1 = 0
            r0 = r0[r1]
            r10 = r0
            r0 = r5
            r1 = r10
            boolean r0 = r0.checkEquals(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L28:
            java.lang.String r0 = "toString"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3a
            r0 = r5
            javassist.bytecode.annotation.Annotation r0 = r0.annotation
            java.lang.String r0 = r0.toString()
            return r0
        L3a:
            java.lang.String r0 = "hashCode"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L63
            r0 = r5
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L4c:
            java.lang.String r0 = "annotationType"
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L63
            r0 = r7
            java.lang.Class[] r0 = r0.getParameterTypes()
            int r0 = r0.length
            if (r0 != 0) goto L63
            r0 = r5
            java.lang.Class r0 = r0.getAnnotationType()
            return r0
        L63:
            r0 = r5
            javassist.bytecode.annotation.Annotation r0 = r0.annotation
            r1 = r9
            javassist.bytecode.annotation.MemberValue r0 = r0.getMemberValue(r1)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L7b
            r0 = r5
            r1 = r9
            r2 = r7
            java.lang.Object r0 = r0.getDefault(r1, r2)
            return r0
        L7b:
            r0 = r10
            r1 = r5
            java.lang.ClassLoader r1 = r1.classLoader
            r2 = r5
            javassist.ClassPool r2 = r2.pool
            r3 = r7
            java.lang.Object r0 = r0.getValue(r1, r2, r3)
            return r0
    }

    private java.lang.Object getDefault(java.lang.String r6, java.lang.reflect.Method r7) throws java.lang.ClassNotFoundException, java.lang.RuntimeException {
            r5 = this;
            r0 = r5
            javassist.bytecode.annotation.Annotation r0 = r0.annotation
            java.lang.String r0 = r0.getTypeName()
            r8 = r0
            r0 = r5
            javassist.ClassPool r0 = r0.pool
            if (r0 == 0) goto L74
            r0 = r5
            javassist.ClassPool r0 = r0.pool     // Catch: javassist.NotFoundException -> L57
            r1 = r8
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> L57
            r9 = r0
            r0 = r9
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()     // Catch: javassist.NotFoundException -> L57
            r10 = r0
            r0 = r10
            r1 = r6
            javassist.bytecode.MethodInfo r0 = r0.getMethod(r1)     // Catch: javassist.NotFoundException -> L57
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L54
            r0 = r11
            java.lang.String r1 = "AnnotationDefault"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)     // Catch: javassist.NotFoundException -> L57
            javassist.bytecode.AnnotationDefaultAttribute r0 = (javassist.bytecode.AnnotationDefaultAttribute) r0     // Catch: javassist.NotFoundException -> L57
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L54
            r0 = r12
            javassist.bytecode.annotation.MemberValue r0 = r0.getDefaultValue()     // Catch: javassist.NotFoundException -> L57
            r13 = r0
            r0 = r13
            r1 = r5
            java.lang.ClassLoader r1 = r1.classLoader     // Catch: javassist.NotFoundException -> L57
            r2 = r5
            javassist.ClassPool r2 = r2.pool     // Catch: javassist.NotFoundException -> L57
            r3 = r7
            java.lang.Object r0 = r0.getValue(r1, r2, r3)     // Catch: javassist.NotFoundException -> L57
            return r0
        L54:
            goto L74
        L57:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "cannot find a class file: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L74:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "no default value: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "()"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public int hashCode() {
            r6 = this;
            r0 = r6
            int r0 = r0.cachedHashCode
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto Ld1
            r0 = 0
            r7 = r0
            r0 = r6
            java.lang.Class r0 = r0.getAnnotationType()
            r0 = r6
            java.lang.Class<?> r0 = r0.annotationType
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r8 = r0
            r0 = 0
            r9 = r0
        L1a:
            r0 = r9
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto Lcc
            r0 = r8
            r1 = r9
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r6
            javassist.bytecode.annotation.Annotation r0 = r0.annotation
            r1 = r10
            javassist.bytecode.annotation.MemberValue r0 = r0.getMemberValue(r1)
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = r12
            if (r0 == 0) goto L50
            r0 = r12
            r1 = r6
            java.lang.ClassLoader r1 = r1.classLoader     // Catch: java.lang.RuntimeException -> L63 java.lang.Exception -> L68
            r2 = r6
            javassist.ClassPool r2 = r2.pool     // Catch: java.lang.RuntimeException -> L63 java.lang.Exception -> L68
            r3 = r8
            r4 = r9
            r3 = r3[r4]     // Catch: java.lang.RuntimeException -> L63 java.lang.Exception -> L68
            java.lang.Object r0 = r0.getValue(r1, r2, r3)     // Catch: java.lang.RuntimeException -> L63 java.lang.Exception -> L68
            r13 = r0
        L50:
            r0 = r13
            if (r0 != 0) goto L60
            r0 = r6
            r1 = r10
            r2 = r8
            r3 = r9
            r2 = r2[r3]     // Catch: java.lang.RuntimeException -> L63 java.lang.Exception -> L68
            java.lang.Object r0 = r0.getDefault(r1, r2)     // Catch: java.lang.RuntimeException -> L63 java.lang.Exception -> L68
            r13 = r0
        L60:
            goto L97
        L63:
            r14 = move-exception
            r0 = r14
            throw r0
        L68:
            r14 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Error retrieving value "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " for annotation "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            javassist.bytecode.annotation.Annotation r3 = r3.annotation
            java.lang.String r3 = r3.getTypeName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r14
            r1.<init>(r2, r3)
            throw r0
        L97:
            r0 = r13
            if (r0 == 0) goto Lb8
            r0 = r13
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto Lb1
            r0 = r13
            int r0 = arrayHashCode(r0)
            r11 = r0
            goto Lb8
        Lb1:
            r0 = r13
            int r0 = r0.hashCode()
            r11 = r0
        Lb8:
            r0 = r7
            r1 = 127(0x7f, float:1.78E-43)
            r2 = r10
            int r2 = r2.hashCode()
            int r1 = r1 * r2
            r2 = r11
            r1 = r1 ^ r2
            int r0 = r0 + r1
            r7 = r0
            int r9 = r9 + 1
            goto L1a
        Lcc:
            r0 = r6
            r1 = r7
            r0.cachedHashCode = r1
        Ld1:
            r0 = r6
            int r0 = r0.cachedHashCode
            return r0
    }

    private boolean checkEquals(java.lang.Object r7) throws java.lang.Exception {
            r6 = this;
            r0 = r7
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r7
            boolean r0 = r0 instanceof java.lang.reflect.Proxy
            if (r0 == 0) goto L2a
            r0 = r7
            java.lang.reflect.InvocationHandler r0 = java.lang.reflect.Proxy.getInvocationHandler(r0)
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof javassist.bytecode.annotation.AnnotationImpl
            if (r0 == 0) goto L2a
            r0 = r8
            javassist.bytecode.annotation.AnnotationImpl r0 = (javassist.bytecode.annotation.AnnotationImpl) r0
            r9 = r0
            r0 = r6
            javassist.bytecode.annotation.Annotation r0 = r0.annotation
            r1 = r9
            javassist.bytecode.annotation.Annotation r1 = r1.annotation
            boolean r0 = r0.equals(r1)
            return r0
        L2a:
            java.lang.reflect.Method r0 = javassist.bytecode.annotation.AnnotationImpl.JDK_ANNOTATION_TYPE_METHOD
            r1 = r7
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Class r0 = (java.lang.Class) r0
            r8 = r0
            r0 = r6
            java.lang.Class r0 = r0.getAnnotationType()
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            r0 = 0
            return r0
        L46:
            r0 = r6
            java.lang.Class<?> r0 = r0.annotationType
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r9 = r0
            r0 = 0
            r10 = r0
        L51:
            r0 = r10
            r1 = r9
            int r1 = r1.length
            if (r0 >= r1) goto L103
            r0 = r9
            r1 = r10
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            r11 = r0
            r0 = r6
            javassist.bytecode.annotation.Annotation r0 = r0.annotation
            r1 = r11
            javassist.bytecode.annotation.MemberValue r0 = r0.getMemberValue(r1)
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r12
            if (r0 == 0) goto L8a
            r0 = r12
            r1 = r6
            java.lang.ClassLoader r1 = r1.classLoader     // Catch: java.lang.RuntimeException -> Lac java.lang.Exception -> Lb1
            r2 = r6
            javassist.ClassPool r2 = r2.pool     // Catch: java.lang.RuntimeException -> Lac java.lang.Exception -> Lb1
            r3 = r9
            r4 = r10
            r3 = r3[r4]     // Catch: java.lang.RuntimeException -> Lac java.lang.Exception -> Lb1
            java.lang.Object r0 = r0.getValue(r1, r2, r3)     // Catch: java.lang.RuntimeException -> Lac java.lang.Exception -> Lb1
            r13 = r0
        L8a:
            r0 = r13
            if (r0 != 0) goto L9b
            r0 = r6
            r1 = r11
            r2 = r9
            r3 = r10
            r2 = r2[r3]     // Catch: java.lang.RuntimeException -> Lac java.lang.Exception -> Lb1
            java.lang.Object r0 = r0.getDefault(r1, r2)     // Catch: java.lang.RuntimeException -> Lac java.lang.Exception -> Lb1
            r13 = r0
        L9b:
            r0 = r9
            r1 = r10
            r0 = r0[r1]     // Catch: java.lang.RuntimeException -> Lac java.lang.Exception -> Lb1
            r1 = r7
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.RuntimeException -> Lac java.lang.Exception -> Lb1
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.RuntimeException -> Lac java.lang.Exception -> Lb1
            r14 = r0
            goto Le0
        Lac:
            r15 = move-exception
            r0 = r15
            throw r0
        Lb1:
            r15 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Error retrieving value "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " for annotation "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            javassist.bytecode.annotation.Annotation r3 = r3.annotation
            java.lang.String r3 = r3.getTypeName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r15
            r1.<init>(r2, r3)
            throw r0
        Le0:
            r0 = r13
            if (r0 != 0) goto Lec
            r0 = r14
            if (r0 == 0) goto Lec
            r0 = 0
            return r0
        Lec:
            r0 = r13
            if (r0 == 0) goto Lfd
            r0 = r13
            r1 = r14
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lfd
            r0 = 0
            return r0
        Lfd:
            int r10 = r10 + 1
            goto L51
        L103:
            r0 = 1
            return r0
    }

    private static int arrayHashCode(java.lang.Object r3) {
            r0 = r3
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            r4 = r0
            r0 = r3
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r5 = r0
            r0 = 0
            r6 = r0
        Lf:
            r0 = r6
            r1 = r5
            int r1 = r1.length
            if (r0 >= r1) goto L34
            r0 = 0
            r7 = r0
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            if (r0 == 0) goto L26
            r0 = r5
            r1 = r6
            r0 = r0[r1]
            int r0 = r0.hashCode()
            r7 = r0
        L26:
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r7
            int r0 = r0 + r1
            r4 = r0
            int r6 = r6 + 1
            goto Lf
        L34:
            r0 = r4
            return r0
    }

    static {
            r0 = 0
            javassist.bytecode.annotation.AnnotationImpl.JDK_ANNOTATION_TYPE_METHOD = r0
            java.lang.String r0 = "java.lang.annotation.Annotation"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1a
            r4 = r0
            r0 = r4
            java.lang.String r1 = "annotationType"
            r2 = 0
            java.lang.Class[] r2 = (java.lang.Class[]) r2     // Catch: java.lang.Exception -> L1a
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L1a
            javassist.bytecode.annotation.AnnotationImpl.JDK_ANNOTATION_TYPE_METHOD = r0     // Catch: java.lang.Exception -> L1a
            goto L1b
        L1a:
            r4 = move-exception
        L1b:
            return
    }
}
