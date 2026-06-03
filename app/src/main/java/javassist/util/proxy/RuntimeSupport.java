package javassist.util.proxy;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/RuntimeSupport.class */
public class RuntimeSupport {
    public static javassist.util.proxy.MethodHandler default_interceptor;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/RuntimeSupport$DefaultMethodHandler.class */
    static class DefaultMethodHandler implements javassist.util.proxy.MethodHandler, java.io.Serializable {
        private static final long serialVersionUID = 1;

        DefaultMethodHandler() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // javassist.util.proxy.MethodHandler
        public java.lang.Object invoke(java.lang.Object r5, java.lang.reflect.Method r6, java.lang.reflect.Method r7, java.lang.Object[] r8) throws java.lang.Exception {
                r4 = this;
                r0 = r7
                r1 = r5
                r2 = r8
                java.lang.Object r0 = r0.invoke(r1, r2)
                return r0
        }
    }

    public RuntimeSupport() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void find2Methods(java.lang.Class<?> r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.String r10, java.lang.reflect.Method[] r11) {
            r0 = r11
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            r2 = r8
            if (r2 != 0) goto Ld
            r2 = 0
            goto L14
        Ld:
            r2 = r6
            r3 = r8
            r4 = r10
            java.lang.reflect.Method r2 = findMethod(r2, r3, r4)
        L14:
            r0[r1] = r2
            r0 = r11
            r1 = r9
            r2 = r6
            r3 = r7
            r4 = r10
            java.lang.reflect.Method r2 = findSuperClassMethod(r2, r3, r4)
            r0[r1] = r2
            return
    }

    @java.lang.Deprecated
    public static void find2Methods(java.lang.Object r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.String r10, java.lang.reflect.Method[] r11) {
            r0 = r11
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            r2 = r8
            if (r2 != 0) goto Ld
            r2 = 0
            goto L14
        Ld:
            r2 = r6
            r3 = r8
            r4 = r10
            java.lang.reflect.Method r2 = findMethod(r2, r3, r4)
        L14:
            r0[r1] = r2
            r0 = r11
            r1 = r9
            r2 = r6
            r3 = r7
            r4 = r10
            java.lang.reflect.Method r2 = findSuperMethod(r2, r3, r4)
            r0[r1] = r2
            return
    }

    @java.lang.Deprecated
    public static java.lang.reflect.Method findMethod(java.lang.Object r4, java.lang.String r5, java.lang.String r6) {
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            r1 = r5
            r2 = r6
            java.lang.reflect.Method r0 = findMethod2(r0, r1, r2)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L17
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            r1 = r5
            r2 = r6
            error(r0, r1, r2)
        L17:
            r0 = r7
            return r0
    }

    public static java.lang.reflect.Method findMethod(java.lang.Class<?> r4, java.lang.String r5, java.lang.String r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.reflect.Method r0 = findMethod2(r0, r1, r2)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L11
            r0 = r4
            r1 = r5
            r2 = r6
            error(r0, r1, r2)
        L11:
            r0 = r7
            return r0
    }

    public static java.lang.reflect.Method findSuperMethod(java.lang.Object r4, java.lang.String r5, java.lang.String r6) {
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            r7 = r0
            r0 = r7
            r1 = r5
            r2 = r6
            java.lang.reflect.Method r0 = findSuperClassMethod(r0, r1, r2)
            return r0
    }

    public static java.lang.reflect.Method findSuperClassMethod(java.lang.Class<?> r4, java.lang.String r5, java.lang.String r6) {
            r0 = r4
            java.lang.Class r0 = r0.getSuperclass()
            r1 = r5
            r2 = r6
            java.lang.reflect.Method r0 = findSuperMethod2(r0, r1, r2)
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L15
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.reflect.Method r0 = searchInterfaces(r0, r1, r2)
            r7 = r0
        L15:
            r0 = r7
            if (r0 != 0) goto L1f
            r0 = r4
            r1 = r5
            r2 = r6
            error(r0, r1, r2)
        L1f:
            r0 = r7
            return r0
    }

    private static void error(java.lang.Class<?> r5, java.lang.String r6, java.lang.String r7) {
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "not found "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ":"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " in "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private static java.lang.reflect.Method findSuperMethod2(java.lang.Class<?> r4, java.lang.String r5, java.lang.String r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.reflect.Method r0 = findMethod2(r0, r1, r2)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto Ld
            r0 = r7
            return r0
        Ld:
            r0 = r4
            java.lang.Class r0 = r0.getSuperclass()
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L26
            r0 = r8
            r1 = r5
            r2 = r6
            java.lang.reflect.Method r0 = findSuperMethod2(r0, r1, r2)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L26
            r0 = r7
            return r0
        L26:
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.reflect.Method r0 = searchInterfaces(r0, r1, r2)
            return r0
    }

    private static java.lang.reflect.Method searchInterfaces(java.lang.Class<?> r4, java.lang.String r5, java.lang.String r6) {
            r0 = 0
            r7 = r0
            r0 = r4
            java.lang.Class[] r0 = r0.getInterfaces()
            r8 = r0
            r0 = 0
            r9 = r0
        Lb:
            r0 = r9
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto L2a
            r0 = r8
            r1 = r9
            r0 = r0[r1]
            r1 = r5
            r2 = r6
            java.lang.reflect.Method r0 = findSuperMethod2(r0, r1, r2)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L24
            r0 = r7
            return r0
        L24:
            int r9 = r9 + 1
            goto Lb
        L2a:
            r0 = r7
            return r0
    }

    private static java.lang.reflect.Method findMethod2(java.lang.Class<?> r3, java.lang.String r4, java.lang.String r5) {
            r0 = r3
            java.lang.reflect.Method[] r0 = javassist.util.proxy.SecurityActions.getDeclaredMethods(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        Lc:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L3a
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            java.lang.String r0 = makeDescriptor(r0)
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L34
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            return r0
        L34:
            int r8 = r8 + 1
            goto Lc
        L3a:
            r0 = 0
            return r0
    }

    public static java.lang.String makeDescriptor(java.lang.reflect.Method r3) {
            r0 = r3
            java.lang.Class[] r0 = r0.getParameterTypes()
            r4 = r0
            r0 = r4
            r1 = r3
            java.lang.Class r1 = r1.getReturnType()
            java.lang.String r0 = makeDescriptor(r0, r1)
            return r0
    }

    public static java.lang.String makeDescriptor(java.lang.Class<?>[] r4, java.lang.Class<?> r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 0
            r7 = r0
        L11:
            r0 = r7
            r1 = r4
            int r1 = r1.length
            if (r0 >= r1) goto L24
            r0 = r6
            r1 = r4
            r2 = r7
            r1 = r1[r2]
            makeDesc(r0, r1)
            int r7 = r7 + 1
            goto L11
        L24:
            r0 = r6
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            if (r0 == 0) goto L34
            r0 = r6
            r1 = r5
            makeDesc(r0, r1)
        L34:
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String makeDescriptor(java.lang.String r4, java.lang.Class<?> r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r5
            makeDesc(r0, r1)
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static void makeDesc(java.lang.StringBuilder r5, java.lang.Class<?> r6) {
            r0 = r6
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L19
            r0 = r5
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r6
            java.lang.Class r1 = r1.getComponentType()
            makeDesc(r0, r1)
            goto Lf1
        L19:
            r0 = r6
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto Ld7
            r0 = r6
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 != r1) goto L31
            r0 = r5
            r1 = 86
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lf1
        L31:
            r0 = r6
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto L42
            r0 = r5
            r1 = 73
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lf1
        L42:
            r0 = r6
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 != r1) goto L53
            r0 = r5
            r1 = 66
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lf1
        L53:
            r0 = r6
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto L64
            r0 = r5
            r1 = 74
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lf1
        L64:
            r0 = r6
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto L75
            r0 = r5
            r1 = 68
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lf1
        L75:
            r0 = r6
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L86
            r0 = r5
            r1 = 70
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lf1
        L86:
            r0 = r6
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 != r1) goto L97
            r0 = r5
            r1 = 67
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lf1
        L97:
            r0 = r6
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 != r1) goto La8
            r0 = r5
            r1 = 83
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lf1
        La8:
            r0 = r6
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 != r1) goto Lb9
            r0 = r5
            r1 = 90
            java.lang.StringBuilder r0 = r0.append(r1)
            goto Lf1
        Lb9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad type: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Ld7:
            r0 = r5
            r1 = 76
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.String r1 = r1.getName()
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 59
            java.lang.StringBuilder r0 = r0.append(r1)
        Lf1:
            return
    }

    public static javassist.util.proxy.SerializedProxy makeSerializedProxy(java.lang.Object r6) throws java.io.InvalidClassException {
            r0 = r6
            java.lang.Class r0 = r0.getClass()
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r6
            boolean r0 = r0 instanceof javassist.util.proxy.ProxyObject
            if (r0 == 0) goto L1b
            r0 = r6
            javassist.util.proxy.ProxyObject r0 = (javassist.util.proxy.ProxyObject) r0
            javassist.util.proxy.MethodHandler r0 = r0.getHandler()
            r8 = r0
            goto L2a
        L1b:
            r0 = r6
            boolean r0 = r0 instanceof javassist.util.proxy.Proxy
            if (r0 == 0) goto L2a
            r0 = r6
            javassist.util.proxy.Proxy r0 = (javassist.util.proxy.Proxy) r0
            javassist.util.proxy.MethodHandler r0 = javassist.util.proxy.ProxyFactory.getHandler(r0)
            r8 = r0
        L2a:
            javassist.util.proxy.SerializedProxy r0 = new javassist.util.proxy.SerializedProxy
            r1 = r0
            r2 = r7
            r3 = r7
            byte[] r3 = javassist.util.proxy.ProxyFactory.getFilterSignature(r3)
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }

    static {
            javassist.util.proxy.RuntimeSupport$DefaultMethodHandler r0 = new javassist.util.proxy.RuntimeSupport$DefaultMethodHandler
            r1 = r0
            r1.<init>()
            javassist.util.proxy.RuntimeSupport.default_interceptor = r0
            return
    }
}
