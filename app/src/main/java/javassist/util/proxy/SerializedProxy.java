package javassist.util.proxy;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/SerializedProxy.class */
class SerializedProxy implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private java.lang.String superClass;
    private java.lang.String[] interfaces;
    private byte[] filterSignature;
    private javassist.util.proxy.MethodHandler handler;


    SerializedProxy(java.lang.Class<?> r5, byte[] r6, javassist.util.proxy.MethodHandler r7) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r6
            r0.filterSignature = r1
            r0 = r4
            r1 = r7
            r0.handler = r1
            r0 = r4
            r1 = r5
            java.lang.Class r1 = r1.getSuperclass()
            java.lang.String r1 = r1.getName()
            r0.superClass = r1
            r0 = r5
            java.lang.Class[] r0 = r0.getInterfaces()
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r9 = r0
            r0 = r4
            r1 = r9
            r2 = 1
            int r1 = r1 - r2
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.interfaces = r1
            java.lang.Class<javassist.util.proxy.ProxyObject> r0 = javassist.util.proxy.ProxyObject.class
            java.lang.String r0 = r0.getName()
            r10 = r0
            java.lang.Class<javassist.util.proxy.Proxy> r0 = javassist.util.proxy.Proxy.class
            java.lang.String r0 = r0.getName()
            r11 = r0
            r0 = 0
            r12 = r0
        L40:
            r0 = r12
            r1 = r9
            if (r0 >= r1) goto L74
            r0 = r8
            r1 = r12
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            r13 = r0
            r0 = r13
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6e
            r0 = r13
            r1 = r11
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6e
            r0 = r4
            java.lang.String[] r0 = r0.interfaces
            r1 = r12
            r2 = r13
            r0[r1] = r2
        L6e:
            int r12 = r12 + 1
            goto L40
        L74:
            return
    }

    protected java.lang.Class<?> loadClass(java.lang.String r6) throws java.lang.ClassNotFoundException {
            r5 = this;
            javassist.util.proxy.SerializedProxy$1 r0 = new javassist.util.proxy.SerializedProxy$1     // Catch: java.security.PrivilegedActionException -> L10
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)     // Catch: java.security.PrivilegedActionException -> L10
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L10
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.security.PrivilegedActionException -> L10
            return r0
        L10:
            r7 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "cannot load the class: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r7
            java.lang.Exception r3 = r3.getException()
            r1.<init>(r2, r3)
            throw r0
    }

    java.lang.Object readResolve() throws java.io.ObjectStreamException {
            r6 = this;
            r0 = r6
            java.lang.String[] r0 = r0.interfaces     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            int r0 = r0.length     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            r7 = r0
            r0 = r7
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            r8 = r0
            r0 = 0
            r9 = r0
        Ld:
            r0 = r9
            r1 = r7
            if (r0 >= r1) goto L25
            r0 = r8
            r1 = r9
            r2 = r6
            r3 = r6
            java.lang.String[] r3 = r3.interfaces     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            r4 = r9
            r3 = r3[r4]     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            java.lang.Class r2 = r2.loadClass(r3)     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            r0[r1] = r2     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            int r9 = r9 + 1
            goto Ld
        L25:
            javassist.util.proxy.ProxyFactory r0 = new javassist.util.proxy.ProxyFactory     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            r1 = r0
            r1.<init>()     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            r9 = r0
            r0 = r9
            r1 = r6
            r2 = r6
            java.lang.String r2 = r2.superClass     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            java.lang.Class r1 = r1.loadClass(r2)     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            r0.setSuperclass(r1)     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            r0 = r9
            r1 = r8
            r0.setInterfaces(r1)     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            r0 = r9
            r1 = r6
            byte[] r1 = r1.filterSignature     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            java.lang.Class r0 = r0.createClass(r1)     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            javassist.util.proxy.Proxy r0 = (javassist.util.proxy.Proxy) r0     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            r10 = r0
            r0 = r10
            r1 = r6
            javassist.util.proxy.MethodHandler r1 = r1.handler     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            r0.setHandler(r1)     // Catch: java.lang.NoSuchMethodException -> L67 java.lang.reflect.InvocationTargetException -> L74 java.lang.ClassNotFoundException -> L81 java.lang.InstantiationException -> L8e java.lang.IllegalAccessException -> L9b
            r0 = r10
            return r0
        L67:
            r7 = move-exception
            java.io.InvalidClassException r0 = new java.io.InvalidClassException
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.getMessage()
            r1.<init>(r2)
            throw r0
        L74:
            r7 = move-exception
            java.io.InvalidClassException r0 = new java.io.InvalidClassException
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.getMessage()
            r1.<init>(r2)
            throw r0
        L81:
            r7 = move-exception
            java.io.InvalidClassException r0 = new java.io.InvalidClassException
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.getMessage()
            r1.<init>(r2)
            throw r0
        L8e:
            r7 = move-exception
            java.io.InvalidObjectException r0 = new java.io.InvalidObjectException
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.getMessage()
            r1.<init>(r2)
            throw r0
        L9b:
            r7 = move-exception
            java.io.InvalidClassException r0 = new java.io.InvalidClassException
            r1 = r0
            r2 = r7
            java.lang.String r2 = r2.getMessage()
            r1.<init>(r2)
            throw r0
    }
}
