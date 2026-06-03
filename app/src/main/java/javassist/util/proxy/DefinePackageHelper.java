package javassist.util.proxy;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/DefinePackageHelper.class */
public class DefinePackageHelper {
    private static final javassist.util.proxy.DefinePackageHelper.Helper privileged = null;

    /* JADX INFO: renamed from: javassist.util.proxy.DefinePackageHelper$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/DefinePackageHelper$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/DefinePackageHelper$Helper.class */
    private static abstract class Helper {
        private Helper() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        abstract java.lang.Package definePackage(java.lang.ClassLoader r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.net.URL r9) throws java.lang.IllegalArgumentException;

        /* synthetic */ Helper(javassist.util.proxy.DefinePackageHelper.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/DefinePackageHelper$Java7.class */
    private static class Java7 extends javassist.util.proxy.DefinePackageHelper.Helper {
        private final javassist.util.proxy.SecurityActions stack;
        private final java.lang.invoke.MethodHandle definePackage;

        private Java7() {
                r3 = this;
                r0 = r3
                r1 = 0
                r0.<init>(r1)
                r0 = r3
                javassist.util.proxy.SecurityActions r1 = javassist.util.proxy.SecurityActions.stack
                r0.stack = r1
                r0 = r3
                r1 = r3
                java.lang.invoke.MethodHandle r1 = r1.getDefinePackageMethodHandle()
                r0.definePackage = r1
                return
        }

        private java.lang.invoke.MethodHandle getDefinePackageMethodHandle() {
                r7 = this;
                r0 = r7
                javassist.util.proxy.SecurityActions r0 = r0.stack
                java.lang.Class r0 = r0.getCallerClass()
                r1 = r7
                java.lang.Class r1 = r1.getClass()
                if (r0 == r1) goto L18
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r1 = r0
                java.lang.String r2 = "Access denied for caller."
                r1.<init>(r2)
                throw r0
            L18:
                java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
                java.lang.String r1 = "definePackage"
                r2 = 8
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 1
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 2
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 3
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 4
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 5
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 6
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 7
                java.lang.Class<java.net.URL> r5 = java.net.URL.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                java.lang.invoke.MethodHandle r0 = javassist.util.proxy.SecurityActions.getMethodHandle(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L4f
                return r0
            L4f:
                r8 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.String r2 = "cannot initialize"
                r3 = r8
                r1.<init>(r2, r3)
                throw r0
        }

        @Override // javassist.util.proxy.DefinePackageHelper.Helper
        java.lang.Package definePackage(java.lang.ClassLoader r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.net.URL r15) throws java.lang.IllegalArgumentException {
                r6 = this;
                r0 = r6
                javassist.util.proxy.SecurityActions r0 = r0.stack
                java.lang.Class r0 = r0.getCallerClass()
                java.lang.Class<javassist.util.proxy.DefinePackageHelper> r1 = javassist.util.proxy.DefinePackageHelper.class
                if (r0 == r1) goto L16
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r1 = r0
                java.lang.String r2 = "Access denied for caller."
                r1.<init>(r2)
                throw r0
            L16:
                r0 = r6
                java.lang.invoke.MethodHandle r0 = r0.definePackage     // Catch: java.lang.Throwable -> L53
                r1 = 9
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L53
                r2 = r1
                r3 = 0
                r4 = r7
                r2[r3] = r4     // Catch: java.lang.Throwable -> L53
                r2 = r1
                r3 = 1
                r4 = r8
                r2[r3] = r4     // Catch: java.lang.Throwable -> L53
                r2 = r1
                r3 = 2
                r4 = r9
                r2[r3] = r4     // Catch: java.lang.Throwable -> L53
                r2 = r1
                r3 = 3
                r4 = r10
                r2[r3] = r4     // Catch: java.lang.Throwable -> L53
                r2 = r1
                r3 = 4
                r4 = r11
                r2[r3] = r4     // Catch: java.lang.Throwable -> L53
                r2 = r1
                r3 = 5
                r4 = r12
                r2[r3] = r4     // Catch: java.lang.Throwable -> L53
                r2 = r1
                r3 = 6
                r4 = r13
                r2[r3] = r4     // Catch: java.lang.Throwable -> L53
                r2 = r1
                r3 = 7
                r4 = r14
                r2[r3] = r4     // Catch: java.lang.Throwable -> L53
                r2 = r1
                r3 = 8
                r4 = r15
                r2[r3] = r4     // Catch: java.lang.Throwable -> L53
                java.lang.Object r0 = r0.invokeWithArguments(r1)     // Catch: java.lang.Throwable -> L53
                java.lang.Package r0 = (java.lang.Package) r0     // Catch: java.lang.Throwable -> L53
                return r0
            L53:
                r16 = move-exception
                r0 = r16
                boolean r0 = r0 instanceof java.lang.IllegalArgumentException
                if (r0 == 0) goto L63
                r0 = r16
                java.lang.IllegalArgumentException r0 = (java.lang.IllegalArgumentException) r0
                throw r0
            L63:
                r0 = r16
                boolean r0 = r0 instanceof java.lang.RuntimeException
                if (r0 == 0) goto L71
                r0 = r16
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
                throw r0
            L71:
                r0 = 0
                return r0
        }

        /* synthetic */ Java7(javassist.util.proxy.DefinePackageHelper.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/DefinePackageHelper$Java9.class */
    private static class Java9 extends javassist.util.proxy.DefinePackageHelper.Helper {
        private Java9() {
                r3 = this;
                r0 = r3
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // javassist.util.proxy.DefinePackageHelper.Helper
        java.lang.Package definePackage(java.lang.ClassLoader r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.net.URL r13) throws java.lang.IllegalArgumentException {
                r4 = this;
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.String r2 = "define package has been disabled for jigsaw"
                r1.<init>(r2)
                throw r0
        }

        /* synthetic */ Java9(javassist.util.proxy.DefinePackageHelper.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/DefinePackageHelper$JavaOther.class */
    private static class JavaOther extends javassist.util.proxy.DefinePackageHelper.Helper {
        private final javassist.util.proxy.SecurityActions stack;
        private final java.lang.reflect.Method definePackage;

        private JavaOther() {
                r3 = this;
                r0 = r3
                r1 = 0
                r0.<init>(r1)
                r0 = r3
                javassist.util.proxy.SecurityActions r1 = javassist.util.proxy.SecurityActions.stack
                r0.stack = r1
                r0 = r3
                r1 = r3
                java.lang.reflect.Method r1 = r1.getDefinePackageMethod()
                r0.definePackage = r1
                return
        }

        private java.lang.reflect.Method getDefinePackageMethod() {
                r7 = this;
                r0 = r7
                javassist.util.proxy.SecurityActions r0 = r0.stack
                java.lang.Class r0 = r0.getCallerClass()
                r1 = r7
                java.lang.Class r1 = r1.getClass()
                if (r0 == r1) goto L18
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r1 = r0
                java.lang.String r2 = "Access denied for caller."
                r1.<init>(r2)
                throw r0
            L18:
                java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
                java.lang.String r1 = "definePackage"
                r2 = 8
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 1
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 2
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 3
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 4
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 5
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 6
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                r3 = r2
                r4 = 7
                java.lang.Class<java.net.URL> r5 = java.net.URL.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L4f
                java.lang.reflect.Method r0 = javassist.util.proxy.SecurityActions.getDeclaredMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L4f
                return r0
            L4f:
                r8 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.String r2 = "cannot initialize"
                r3 = r8
                r1.<init>(r2, r3)
                throw r0
        }

        @Override // javassist.util.proxy.DefinePackageHelper.Helper
        java.lang.Package definePackage(java.lang.ClassLoader r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.net.URL r16) throws java.lang.IllegalArgumentException {
                r7 = this;
                r0 = r7
                javassist.util.proxy.SecurityActions r0 = r0.stack
                java.lang.Class r0 = r0.getCallerClass()
                java.lang.Class<javassist.util.proxy.DefinePackageHelper> r1 = javassist.util.proxy.DefinePackageHelper.class
                if (r0 == r1) goto L16
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r1 = r0
                java.lang.String r2 = "Access denied for caller."
                r1.<init>(r2)
                throw r0
            L16:
                r0 = r7
                java.lang.reflect.Method r0 = r0.definePackage     // Catch: java.lang.Throwable -> L57
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L57
                r0 = r7
                java.lang.reflect.Method r0 = r0.definePackage     // Catch: java.lang.Throwable -> L57
                r1 = r8
                r2 = 8
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L57
                r3 = r2
                r4 = 0
                r5 = r9
                r3[r4] = r5     // Catch: java.lang.Throwable -> L57
                r3 = r2
                r4 = 1
                r5 = r10
                r3[r4] = r5     // Catch: java.lang.Throwable -> L57
                r3 = r2
                r4 = 2
                r5 = r11
                r3[r4] = r5     // Catch: java.lang.Throwable -> L57
                r3 = r2
                r4 = 3
                r5 = r12
                r3[r4] = r5     // Catch: java.lang.Throwable -> L57
                r3 = r2
                r4 = 4
                r5 = r13
                r3[r4] = r5     // Catch: java.lang.Throwable -> L57
                r3 = r2
                r4 = 5
                r5 = r14
                r3[r4] = r5     // Catch: java.lang.Throwable -> L57
                r3 = r2
                r4 = 6
                r5 = r15
                r3[r4] = r5     // Catch: java.lang.Throwable -> L57
                r3 = r2
                r4 = 7
                r5 = r16
                r3[r4] = r5     // Catch: java.lang.Throwable -> L57
                java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L57
                java.lang.Package r0 = (java.lang.Package) r0     // Catch: java.lang.Throwable -> L57
                return r0
            L57:
                r17 = move-exception
                r0 = r17
                boolean r0 = r0 instanceof java.lang.reflect.InvocationTargetException
                if (r0 == 0) goto L79
                r0 = r17
                java.lang.reflect.InvocationTargetException r0 = (java.lang.reflect.InvocationTargetException) r0
                java.lang.Throwable r0 = r0.getTargetException()
                r18 = r0
                r0 = r18
                boolean r0 = r0 instanceof java.lang.IllegalArgumentException
                if (r0 == 0) goto L79
                r0 = r18
                java.lang.IllegalArgumentException r0 = (java.lang.IllegalArgumentException) r0
                throw r0
            L79:
                r0 = r17
                boolean r0 = r0 instanceof java.lang.RuntimeException
                if (r0 == 0) goto L87
                r0 = r17
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
                throw r0
            L87:
                r0 = 0
                return r0
        }

        /* synthetic */ JavaOther(javassist.util.proxy.DefinePackageHelper.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    public static void definePackage(java.lang.String r11, java.lang.ClassLoader r12) throws javassist.CannotCompileException {
            javassist.util.proxy.DefinePackageHelper$Helper r0 = javassist.util.proxy.DefinePackageHelper.privileged     // Catch: java.lang.IllegalArgumentException -> L13 java.lang.Exception -> L15
            r1 = r12
            r2 = r11
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.Package r0 = r0.definePackage(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.IllegalArgumentException -> L13 java.lang.Exception -> L15
            goto L1f
        L13:
            r13 = move-exception
            return
        L15:
            r13 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            throw r0
        L1f:
            return
    }

    private DefinePackageHelper() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static {
            int r0 = javassist.bytecode.ClassFile.MAJOR_VERSION
            r1 = 53
            if (r0 < r1) goto L13
            javassist.util.proxy.DefinePackageHelper$Java9 r0 = new javassist.util.proxy.DefinePackageHelper$Java9
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            goto L2e
        L13:
            int r0 = javassist.bytecode.ClassFile.MAJOR_VERSION
            r1 = 51
            if (r0 < r1) goto L26
            javassist.util.proxy.DefinePackageHelper$Java7 r0 = new javassist.util.proxy.DefinePackageHelper$Java7
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            goto L2e
        L26:
            javassist.util.proxy.DefinePackageHelper$JavaOther r0 = new javassist.util.proxy.DefinePackageHelper$JavaOther
            r1 = r0
            r2 = 0
            r1.<init>(r2)
        L2e:
            javassist.util.proxy.DefinePackageHelper.privileged = r0
            return
    }
}
