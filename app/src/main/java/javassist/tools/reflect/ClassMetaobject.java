package javassist.tools.reflect;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/tools/reflect/ClassMetaobject.class */
public class ClassMetaobject implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    static final java.lang.String methodPrefix = "_m_";
    static final int methodPrefixLen = 3;
    private java.lang.Class<?> javaClass;
    private java.lang.reflect.Constructor<?>[] constructors;
    private java.lang.reflect.Method[] methods;
    public static boolean useContextClassLoader;

    public ClassMetaobject(java.lang.String[] r7) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            r1 = r6
            r2 = r7
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.ClassNotFoundException -> L12
            java.lang.Class r1 = r1.getClassObject(r2)     // Catch: java.lang.ClassNotFoundException -> L12
            r0.javaClass = r1     // Catch: java.lang.ClassNotFoundException -> L12
            goto L3f
        L12:
            r8 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "not found: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            r4 = 0
            r3 = r3[r4]
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", useContextClassLoader: "
            java.lang.StringBuilder r2 = r2.append(r3)
            boolean r3 = javassist.tools.reflect.ClassMetaobject.useContextClassLoader
            java.lang.String r3 = java.lang.Boolean.toString(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r8
            r1.<init>(r2, r3)
            throw r0
        L3f:
            r0 = r6
            r1 = r6
            java.lang.Class<?> r1 = r1.javaClass
            java.lang.reflect.Constructor[] r1 = r1.getConstructors()
            r0.constructors = r1
            r0 = r6
            r1 = 0
            r0.methods = r1
            return
    }

    private void writeObject(java.io.ObjectOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = r3
            java.lang.Class<?> r1 = r1.javaClass
            java.lang.String r1 = r1.getName()
            r0.writeUTF(r1)
            return
    }

    private void readObject(java.io.ObjectInputStream r5) throws java.io.IOException, java.lang.ClassNotFoundException {
            r4 = this;
            r0 = r4
            r1 = r4
            r2 = r5
            java.lang.String r2 = r2.readUTF()
            java.lang.Class r1 = r1.getClassObject(r2)
            r0.javaClass = r1
            r0 = r4
            r1 = r4
            java.lang.Class<?> r1 = r1.javaClass
            java.lang.reflect.Constructor[] r1 = r1.getConstructors()
            r0.constructors = r1
            r0 = r4
            r1 = 0
            r0.methods = r1
            return
    }

    private java.lang.Class<?> getClassObject(java.lang.String r4) throws java.lang.ClassNotFoundException {
            r3 = this;
            boolean r0 = javassist.tools.reflect.ClassMetaobject.useContextClassLoader
            if (r0 == 0) goto L11
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r1 = r4
            java.lang.Class r0 = r0.loadClass(r1)
            return r0
        L11:
            r0 = r4
            java.lang.Class r0 = java.lang.Class.forName(r0)
            return r0
    }

    public final java.lang.Class<?> getJavaClass() {
            r2 = this;
            r0 = r2
            java.lang.Class<?> r0 = r0.javaClass
            return r0
    }

    public final java.lang.String getName() {
            r2 = this;
            r0 = r2
            java.lang.Class<?> r0 = r0.javaClass
            java.lang.String r0 = r0.getName()
            return r0
    }

    public final boolean isInstance(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            java.lang.Class<?> r0 = r0.javaClass
            r1 = r4
            boolean r0 = r0.isInstance(r1)
            return r0
    }

    public final java.lang.Object newInstance(java.lang.Object[] r5) throws javassist.tools.reflect.CannotCreateException {
            r4 = this;
            r0 = r4
            java.lang.reflect.Constructor<?>[] r0 = r0.constructors
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r7 = r0
        L8:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L47
            r0 = r4
            java.lang.reflect.Constructor<?>[] r0 = r0.constructors     // Catch: java.lang.IllegalArgumentException -> L18 java.lang.InstantiationException -> L1d java.lang.IllegalAccessException -> L29 java.lang.reflect.InvocationTargetException -> L35
            r1 = r7
            r0 = r0[r1]     // Catch: java.lang.IllegalArgumentException -> L18 java.lang.InstantiationException -> L1d java.lang.IllegalAccessException -> L29 java.lang.reflect.InvocationTargetException -> L35
            r1 = r5
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.IllegalArgumentException -> L18 java.lang.InstantiationException -> L1d java.lang.IllegalAccessException -> L29 java.lang.reflect.InvocationTargetException -> L35
            return r0
        L18:
            r8 = move-exception
            goto L41
        L1d:
            r8 = move-exception
            javassist.tools.reflect.CannotCreateException r0 = new javassist.tools.reflect.CannotCreateException
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            throw r0
        L29:
            r8 = move-exception
            javassist.tools.reflect.CannotCreateException r0 = new javassist.tools.reflect.CannotCreateException
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            throw r0
        L35:
            r8 = move-exception
            javassist.tools.reflect.CannotCreateException r0 = new javassist.tools.reflect.CannotCreateException
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            throw r0
        L41:
            int r7 = r7 + 1
            goto L8
        L47:
            javassist.tools.reflect.CannotCreateException r0 = new javassist.tools.reflect.CannotCreateException
            r1 = r0
            java.lang.String r2 = "no constructor matches"
            r1.<init>(r2)
            throw r0
    }

    public java.lang.Object trapFieldRead(java.lang.String r5) {
            r4 = this;
            r0 = r4
            java.lang.Class r0 = r0.getJavaClass()
            r6 = r0
            r0 = r6
            r1 = r5
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.NoSuchFieldException -> Lf java.lang.IllegalAccessException -> L1c
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.NoSuchFieldException -> Lf java.lang.IllegalAccessException -> L1c
            return r0
        Lf:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L1c:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public void trapFieldWrite(java.lang.String r5, java.lang.Object r6) {
            r4 = this;
            r0 = r4
            java.lang.Class r0 = r0.getJavaClass()
            r7 = r0
            r0 = r7
            r1 = r5
            java.lang.reflect.Field r0 = r0.getField(r1)     // Catch: java.lang.NoSuchFieldException -> L12 java.lang.IllegalAccessException -> L21
            r1 = 0
            r2 = r6
            r0.set(r1, r2)     // Catch: java.lang.NoSuchFieldException -> L12 java.lang.IllegalAccessException -> L21
            goto L30
        L12:
            r8 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L21:
            r8 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r8
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L30:
            return
    }

    public static java.lang.Object invoke(java.lang.Object r4, int r5, java.lang.Object[] r6) throws java.lang.Throwable {
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "_m_"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9 = r0
            r0 = 0
            r10 = r0
        L24:
            r0 = r10
            r1 = r8
            if (r0 >= r1) goto L5e
            r0 = r7
            r1 = r10
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            r1 = r9
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L58
            r0 = r7
            r1 = r10
            r0 = r0[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L4c
            r1 = r4
            r2 = r6
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L4c
            return r0
        L44:
            r11 = move-exception
            r0 = r11
            java.lang.Throwable r0 = r0.getTargetException()
            throw r0
        L4c:
            r11 = move-exception
            javassist.tools.reflect.CannotInvokeException r0 = new javassist.tools.reflect.CannotInvokeException
            r1 = r0
            r2 = r11
            r1.<init>(r2)
            throw r0
        L58:
            int r10 = r10 + 1
            goto L24
        L5e:
            javassist.tools.reflect.CannotInvokeException r0 = new javassist.tools.reflect.CannotInvokeException
            r1 = r0
            java.lang.String r2 = "cannot find a method"
            r1.<init>(r2)
            throw r0
    }

    public java.lang.Object trapMethodcall(int r5, java.lang.Object[] r6) throws java.lang.Throwable {
            r4 = this;
            r0 = r4
            java.lang.reflect.Method[] r0 = r0.getReflectiveMethods()     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.IllegalAccessException -> L14
            r7 = r0
            r0 = r7
            r1 = r5
            r0 = r0[r1]     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.IllegalAccessException -> L14
            r1 = 0
            r2 = r6
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> Le java.lang.IllegalAccessException -> L14
            return r0
        Le:
            r7 = move-exception
            r0 = r7
            java.lang.Throwable r0 = r0.getTargetException()
            throw r0
        L14:
            r7 = move-exception
            javassist.tools.reflect.CannotInvokeException r0 = new javassist.tools.reflect.CannotInvokeException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
    }

    public final java.lang.reflect.Method[] getReflectiveMethods() {
            r5 = this;
            r0 = r5
            java.lang.reflect.Method[] r0 = r0.methods
            if (r0 == 0) goto Lc
            r0 = r5
            java.lang.reflect.Method[] r0 = r0.methods
            return r0
        Lc:
            r0 = r5
            java.lang.Class r0 = r0.getJavaClass()
            r6 = r0
            r0 = r6
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = r8
            int[] r0 = new int[r0]
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
        L24:
            r0 = r11
            r1 = r8
            if (r0 >= r1) goto L8c
            r0 = r7
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            java.lang.String r0 = r0.getName()
            r13 = r0
            r0 = r13
            java.lang.String r1 = "_m_"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L86
            r0 = 0
            r14 = r0
            r0 = 3
            r15 = r0
        L47:
            r0 = r13
            r1 = r15
            char r0 = r0.charAt(r1)
            r16 = r0
            r0 = 48
            r1 = r16
            if (r0 > r1) goto L71
            r0 = r16
            r1 = 57
            if (r0 > r1) goto L71
            r0 = r14
            r1 = 10
            int r0 = r0 * r1
            r1 = r16
            int r0 = r0 + r1
            r1 = 48
            int r0 = r0 - r1
            r14 = r0
            int r15 = r15 + 1
            goto L47
        L71:
            r0 = r9
            r1 = r11
            int r14 = r14 + 1
            r2 = r14
            r0[r1] = r2
            r0 = r14
            r1 = r10
            if (r0 <= r1) goto L86
            r0 = r14
            r10 = r0
        L86:
            int r11 = r11 + 1
            goto L24
        L8c:
            r0 = r5
            r1 = r10
            java.lang.reflect.Method[] r1 = new java.lang.reflect.Method[r1]
            r0.methods = r1
            r0 = 0
            r11 = r0
        L98:
            r0 = r11
            r1 = r8
            if (r0 >= r1) goto Lbc
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            if (r0 <= 0) goto Lb6
            r0 = r5
            java.lang.reflect.Method[] r0 = r0.methods
            r1 = r9
            r2 = r11
            r1 = r1[r2]
            r2 = 1
            int r1 = r1 - r2
            r2 = r7
            r3 = r11
            r2 = r2[r3]
            r0[r1] = r2
        Lb6:
            int r11 = r11 + 1
            goto L98
        Lbc:
            r0 = r5
            java.lang.reflect.Method[] r0 = r0.methods
            return r0
    }

    public final java.lang.reflect.Method getMethod(int r4) {
            r3 = this;
            r0 = r3
            java.lang.reflect.Method[] r0 = r0.getReflectiveMethods()
            r1 = r4
            r0 = r0[r1]
            return r0
    }

    public final java.lang.String getMethodName(int r4) {
            r3 = this;
            r0 = r3
            java.lang.reflect.Method[] r0 = r0.getReflectiveMethods()
            r1 = r4
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            r5 = r0
            r0 = 3
            r6 = r0
        Lc:
            r0 = r5
            r1 = r6
            int r6 = r6 + 1
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r7
            r1 = 48
            if (r0 < r1) goto L2a
            r0 = 57
            r1 = r7
            if (r0 >= r1) goto L27
            goto L2a
        L27:
            goto Lc
        L2a:
            r0 = r5
            r1 = r6
            java.lang.String r0 = r0.substring(r1)
            return r0
    }

    public final java.lang.Class<?>[] getParameterTypes(int r4) {
            r3 = this;
            r0 = r3
            java.lang.reflect.Method[] r0 = r0.getReflectiveMethods()
            r1 = r4
            r0 = r0[r1]
            java.lang.Class[] r0 = r0.getParameterTypes()
            return r0
    }

    public final java.lang.Class<?> getReturnType(int r4) {
            r3 = this;
            r0 = r3
            java.lang.reflect.Method[] r0 = r0.getReflectiveMethods()
            r1 = r4
            r0 = r0[r1]
            java.lang.Class r0 = r0.getReturnType()
            return r0
    }

    public final int getMethodIndex(java.lang.String r6, java.lang.Class<?>[] r7) throws java.lang.NoSuchMethodException {
            r5 = this;
            r0 = r5
            java.lang.reflect.Method[] r0 = r0.getReflectiveMethods()
            r8 = r0
            r0 = 0
            r9 = r0
        L8:
            r0 = r9
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto L3d
            r0 = r8
            r1 = r9
            r0 = r0[r1]
            if (r0 != 0) goto L19
            goto L37
        L19:
            r0 = r5
            r1 = r9
            java.lang.String r0 = r0.getMethodName(r1)
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            r0 = r7
            r1 = r8
            r2 = r9
            r1 = r1[r2]
            java.lang.Class[] r1 = r1.getParameterTypes()
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L37
            r0 = r9
            return r0
        L37:
            int r9 = r9 + 1
            goto L8
        L3d:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Method "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " not found"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    static {
            r0 = 0
            javassist.tools.reflect.ClassMetaobject.useContextClassLoader = r0
            return
    }
}
