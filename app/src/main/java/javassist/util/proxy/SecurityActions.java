package javassist.util.proxy;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/SecurityActions.class */
class SecurityActions extends java.lang.SecurityManager {
    public static final javassist.util.proxy.SecurityActions stack = null;









    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/SecurityActions$TheUnsafe.class */
    class TheUnsafe {
        final java.lang.Class<?> unsafe;
        final java.lang.Object theUnsafe;
        final java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> methods;
        final /* synthetic */ javassist.util.proxy.SecurityActions this$0;

        TheUnsafe(javassist.util.proxy.SecurityActions r8, java.lang.Class<?> r9, java.lang.Object r10) {
                r7 = this;
                r0 = r7
                r1 = r8
                r0.this$0 = r1
                r0 = r7
                r0.<init>()
                r0 = r7
                java.util.HashMap r1 = new java.util.HashMap
                r2 = r1
                r2.<init>()
                r0.methods = r1
                r0 = r7
                r1 = r9
                r0.unsafe = r1
                r0 = r7
                r1 = r10
                r0.theUnsafe = r1
                r0 = r7
                java.lang.Class<?> r0 = r0.unsafe
                java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
                r11 = r0
                r0 = r11
                int r0 = r0.length
                r12 = r0
                r0 = 0
                r13 = r0
            L2f:
                r0 = r13
                r1 = r12
                if (r0 >= r1) goto Lc5
                r0 = r11
                r1 = r13
                r0 = r0[r1]
                r14 = r0
                r0 = r7
                java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> r0 = r0.methods
                r1 = r14
                java.lang.String r1 = r1.getName()
                boolean r0 = r0.containsKey(r1)
                if (r0 != 0) goto L65
                r0 = r7
                java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> r0 = r0.methods
                r1 = r14
                java.lang.String r1 = r1.getName()
                r2 = r14
                java.util.List r2 = java.util.Collections.singletonList(r2)
                java.lang.Object r0 = r0.put(r1, r2)
                goto Lbf
            L65:
                r0 = r7
                java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> r0 = r0.methods
                r1 = r14
                java.lang.String r1 = r1.getName()
                java.lang.Object r0 = r0.get(r1)
                java.util.List r0 = (java.util.List) r0
                int r0 = r0.size()
                r1 = 1
                if (r0 != r1) goto La6
                r0 = r7
                java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> r0 = r0.methods
                r1 = r14
                java.lang.String r1 = r1.getName()
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = r2
                r4 = r7
                java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> r4 = r4.methods
                r5 = r14
                java.lang.String r5 = r5.getName()
                java.lang.Object r4 = r4.get(r5)
                java.util.Collection r4 = (java.util.Collection) r4
                r3.<init>(r4)
                java.lang.Object r0 = r0.put(r1, r2)
            La6:
                r0 = r7
                java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> r0 = r0.methods
                r1 = r14
                java.lang.String r1 = r1.getName()
                java.lang.Object r0 = r0.get(r1)
                java.util.List r0 = (java.util.List) r0
                r1 = r14
                boolean r0 = r0.add(r1)
            Lbf:
                int r13 = r13 + 1
                goto L2f
            Lc5:
                return
        }

        private java.lang.reflect.Method getM(java.lang.String r4, java.lang.Object[] r5) {
                r3 = this;
                r0 = r3
                java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> r0 = r0.methods
                r1 = r4
                java.lang.Object r0 = r0.get(r1)
                java.util.List r0 = (java.util.List) r0
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                return r0
        }

        public java.lang.Object call(java.lang.String r5, java.lang.Object... r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                java.lang.reflect.Method r0 = r0.getM(r1, r2)     // Catch: java.lang.Throwable -> Lf
                r1 = r4
                java.lang.Object r1 = r1.theUnsafe     // Catch: java.lang.Throwable -> Lf
                r2 = r6
                java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> Lf
                return r0
            Lf:
                r7 = move-exception
                r0 = r7
                r0.printStackTrace()
                r0 = 0
                return r0
        }
    }

    SecurityActions() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public java.lang.Class<?> getCallerClass() {
            r3 = this;
            r0 = r3
            java.lang.Class[] r0 = r0.getClassContext()
            r1 = 2
            r0 = r0[r1]
            return r0
    }

    static java.lang.reflect.Method[] getDeclaredMethods(java.lang.Class<?> r4) {
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 != 0) goto Lb
            r0 = r4
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            return r0
        Lb:
            javassist.util.proxy.SecurityActions$1 r0 = new javassist.util.proxy.SecurityActions$1
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.reflect.Method[] r0 = (java.lang.reflect.Method[]) r0
            return r0
    }

    static java.lang.reflect.Constructor<?>[] getDeclaredConstructors(java.lang.Class<?> r4) {
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 != 0) goto Lb
            r0 = r4
            java.lang.reflect.Constructor[] r0 = r0.getDeclaredConstructors()
            return r0
        Lb:
            javassist.util.proxy.SecurityActions$2 r0 = new javassist.util.proxy.SecurityActions$2
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            java.lang.reflect.Constructor[] r0 = (java.lang.reflect.Constructor[]) r0
            return r0
    }

    static java.lang.invoke.MethodHandle getMethodHandle(java.lang.Class<?> r6, java.lang.String r7, java.lang.Class<?>[] r8) throws java.lang.NoSuchMethodException {
            javassist.util.proxy.SecurityActions$3 r0 = new javassist.util.proxy.SecurityActions$3     // Catch: java.security.PrivilegedActionException -> L11
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)     // Catch: java.security.PrivilegedActionException -> L11
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L11
            java.lang.invoke.MethodHandle r0 = (java.lang.invoke.MethodHandle) r0     // Catch: java.security.PrivilegedActionException -> L11
            return r0
        L11:
            r9 = move-exception
            r0 = r9
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof java.lang.NoSuchMethodException
            if (r0 == 0) goto L24
            r0 = r9
            java.lang.Throwable r0 = r0.getCause()
            java.lang.NoSuchMethodException r0 = (java.lang.NoSuchMethodException) r0
            throw r0
        L24:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r9
            java.lang.Throwable r2 = r2.getCause()
            r1.<init>(r2)
            throw r0
    }

    static java.lang.reflect.Method getDeclaredMethod(java.lang.Class<?> r6, java.lang.String r7, java.lang.Class<?>[] r8) throws java.lang.NoSuchMethodException {
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 != 0) goto Ld
            r0 = r6
            r1 = r7
            r2 = r8
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)
            return r0
        Ld:
            javassist.util.proxy.SecurityActions$4 r0 = new javassist.util.proxy.SecurityActions$4     // Catch: java.security.PrivilegedActionException -> L1e
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)     // Catch: java.security.PrivilegedActionException -> L1e
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L1e
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.security.PrivilegedActionException -> L1e
            return r0
        L1e:
            r9 = move-exception
            r0 = r9
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof java.lang.NoSuchMethodException
            if (r0 == 0) goto L31
            r0 = r9
            java.lang.Throwable r0 = r0.getCause()
            java.lang.NoSuchMethodException r0 = (java.lang.NoSuchMethodException) r0
            throw r0
        L31:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r9
            java.lang.Throwable r2 = r2.getCause()
            r1.<init>(r2)
            throw r0
    }

    static java.lang.reflect.Constructor<?> getDeclaredConstructor(java.lang.Class<?> r5, java.lang.Class<?>[] r6) throws java.lang.NoSuchMethodException {
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 != 0) goto Lc
            r0 = r5
            r1 = r6
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)
            return r0
        Lc:
            javassist.util.proxy.SecurityActions$5 r0 = new javassist.util.proxy.SecurityActions$5     // Catch: java.security.PrivilegedActionException -> L1c
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)     // Catch: java.security.PrivilegedActionException -> L1c
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L1c
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0     // Catch: java.security.PrivilegedActionException -> L1c
            return r0
        L1c:
            r7 = move-exception
            r0 = r7
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof java.lang.NoSuchMethodException
            if (r0 == 0) goto L2f
            r0 = r7
            java.lang.Throwable r0 = r0.getCause()
            java.lang.NoSuchMethodException r0 = (java.lang.NoSuchMethodException) r0
            throw r0
        L2f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r7
            java.lang.Throwable r2 = r2.getCause()
            r1.<init>(r2)
            throw r0
    }

    static void setAccessible(java.lang.reflect.AccessibleObject r5, boolean r6) {
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 != 0) goto Le
            r0 = r5
            r1 = r6
            r0.setAccessible(r1)
            goto L1b
        Le:
            javassist.util.proxy.SecurityActions$6 r0 = new javassist.util.proxy.SecurityActions$6
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
        L1b:
            return
    }

    static void set(java.lang.reflect.Field r6, java.lang.Object r7, java.lang.Object r8) throws java.lang.IllegalAccessException {
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 != 0) goto Lf
            r0 = r6
            r1 = r7
            r2 = r8
            r0.set(r1, r2)
            goto L3f
        Lf:
            javassist.util.proxy.SecurityActions$7 r0 = new javassist.util.proxy.SecurityActions$7     // Catch: java.security.PrivilegedActionException -> L20
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)     // Catch: java.security.PrivilegedActionException -> L20
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L20
            goto L3f
        L20:
            r9 = move-exception
            r0 = r9
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof java.lang.NoSuchMethodException
            if (r0 == 0) goto L33
            r0 = r9
            java.lang.Throwable r0 = r0.getCause()
            java.lang.IllegalAccessException r0 = (java.lang.IllegalAccessException) r0
            throw r0
        L33:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r9
            java.lang.Throwable r2 = r2.getCause()
            r1.<init>(r2)
            throw r0
        L3f:
            return
    }

    static javassist.util.proxy.SecurityActions.TheUnsafe getSunMiscUnsafeAnonymously() throws java.lang.ClassNotFoundException {
            javassist.util.proxy.SecurityActions$8 r0 = new javassist.util.proxy.SecurityActions$8     // Catch: java.security.PrivilegedActionException -> Le
            r1 = r0
            r1.<init>()     // Catch: java.security.PrivilegedActionException -> Le
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> Le
            javassist.util.proxy.SecurityActions$TheUnsafe r0 = (javassist.util.proxy.SecurityActions.TheUnsafe) r0     // Catch: java.security.PrivilegedActionException -> Le
            return r0
        Le:
            r5 = move-exception
            r0 = r5
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof java.lang.ClassNotFoundException
            if (r0 == 0) goto L21
            r0 = r5
            java.lang.Throwable r0 = r0.getCause()
            java.lang.ClassNotFoundException r0 = (java.lang.ClassNotFoundException) r0
            throw r0
        L21:
            r0 = r5
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof java.lang.NoSuchFieldException
            if (r0 == 0) goto L39
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r1 = r0
            java.lang.String r2 = "No such instance."
            r3 = r5
            java.lang.Throwable r3 = r3.getCause()
            r1.<init>(r2, r3)
            throw r0
        L39:
            r0 = r5
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof java.lang.IllegalAccessException
            if (r0 != 0) goto L4d
            r0 = r5
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof java.lang.SecurityException
            if (r0 == 0) goto L5b
        L4d:
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r1 = r0
            java.lang.String r2 = "Security denied access."
            r3 = r5
            java.lang.Throwable r3 = r3.getCause()
            r1.<init>(r2, r3)
            throw r0
        L5b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            java.lang.Throwable r2 = r2.getCause()
            r1.<init>(r2)
            throw r0
    }

    static void disableWarning(javassist.util.proxy.SecurityActions.TheUnsafe r12) {
            int r0 = javassist.bytecode.ClassFile.MAJOR_VERSION     // Catch: java.lang.Exception -> L3d
            r1 = 53
            if (r0 >= r1) goto L9
            return
        L9:
            java.lang.String r0 = "jdk.internal.module.IllegalAccessLogger"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L3d
            r13 = r0
            r0 = r13
            java.lang.String r1 = "logger"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L3d
            r14 = r0
            r0 = r12
            java.lang.String r1 = "putObjectVolatile"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L3d
            r3 = r2
            r4 = 0
            r5 = r13
            r3[r4] = r5     // Catch: java.lang.Exception -> L3d
            r3 = r2
            r4 = 1
            r5 = r12
            java.lang.String r6 = "staticFieldOffset"
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L3d
            r8 = r7
            r9 = 0
            r10 = r14
            r8[r9] = r10     // Catch: java.lang.Exception -> L3d
            java.lang.Object r5 = r5.call(r6, r7)     // Catch: java.lang.Exception -> L3d
            r3[r4] = r5     // Catch: java.lang.Exception -> L3d
            r3 = r2
            r4 = 2
            r5 = 0
            r3[r4] = r5     // Catch: java.lang.Exception -> L3d
            java.lang.Object r0 = r0.call(r1, r2)     // Catch: java.lang.Exception -> L3d
            goto L3e
        L3d:
            r13 = move-exception
        L3e:
            return
    }

    static {
            javassist.util.proxy.SecurityActions r0 = new javassist.util.proxy.SecurityActions
            r1 = r0
            r1.<init>()
            javassist.util.proxy.SecurityActions.stack = r0
            return
    }
}
