package javassist.util.proxy;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/DefineClassHelper.class */
public class DefineClassHelper {
    private static final javassist.util.proxy.DefineClassHelper.Helper privileged = null;

    /* JADX INFO: renamed from: javassist.util.proxy.DefineClassHelper$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/DefineClassHelper$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/DefineClassHelper$Helper.class */
    private static abstract class Helper {
        private Helper() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        abstract java.lang.Class<?> defineClass(java.lang.String r1, byte[] r2, int r3, int r4, java.lang.Class<?> r5, java.lang.ClassLoader r6, java.security.ProtectionDomain r7) throws java.lang.ClassFormatError, javassist.CannotCompileException;

        /* synthetic */ Helper(javassist.util.proxy.DefineClassHelper.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/DefineClassHelper$Java11.class */
    private static class Java11 extends javassist.util.proxy.DefineClassHelper.JavaOther {
        private Java11() {
                r3 = this;
                r0 = r3
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // javassist.util.proxy.DefineClassHelper.JavaOther, javassist.util.proxy.DefineClassHelper.Helper
        java.lang.Class<?> defineClass(java.lang.String r10, byte[] r11, int r12, int r13, java.lang.Class<?> r14, java.lang.ClassLoader r15, java.security.ProtectionDomain r16) throws java.lang.ClassFormatError, javassist.CannotCompileException {
                r9 = this;
                r0 = r14
                if (r0 == 0) goto Lc
                r0 = r14
                r1 = r11
                java.lang.Class r0 = javassist.util.proxy.DefineClassHelper.toClass(r0, r1)
                return r0
            Lc:
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r7 = r16
                java.lang.Class r0 = super.defineClass(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }

        /* synthetic */ Java11(javassist.util.proxy.DefineClassHelper.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/DefineClassHelper$Java7.class */
    private static class Java7 extends javassist.util.proxy.DefineClassHelper.Helper {
        private final javassist.util.proxy.SecurityActions stack;
        private final java.lang.invoke.MethodHandle defineClass;

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
                java.lang.invoke.MethodHandle r1 = r1.getDefineClassMethodHandle()
                r0.defineClass = r1
                return
        }

        private final java.lang.invoke.MethodHandle getDefineClassMethodHandle() {
                r7 = this;
                javassist.util.proxy.DefineClassHelper$Helper r0 = javassist.util.proxy.DefineClassHelper.access$400()
                if (r0 == 0) goto L1e
                r0 = r7
                javassist.util.proxy.SecurityActions r0 = r0.stack
                java.lang.Class r0 = r0.getCallerClass()
                r1 = r7
                java.lang.Class r1 = r1.getClass()
                if (r0 == r1) goto L1e
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r1 = r0
                java.lang.String r2 = "Access denied for caller."
                r1.<init>(r2)
                throw r0
            L1e:
                java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
                java.lang.String r1 = "defineClass"
                r2 = 5
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L45
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L45
                r3 = r2
                r4 = 1
                java.lang.Class<byte[]> r5 = byte[].class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L45
                r3 = r2
                r4 = 2
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L45
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L45
                r3 = r2
                r4 = 3
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L45
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L45
                r3 = r2
                r4 = 4
                java.lang.Class<java.security.ProtectionDomain> r5 = java.security.ProtectionDomain.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L45
                java.lang.invoke.MethodHandle r0 = javassist.util.proxy.SecurityActions.getMethodHandle(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L45
                return r0
            L45:
                r8 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.String r2 = "cannot initialize"
                r3 = r8
                r1.<init>(r2, r3)
                throw r0
        }

        @Override // javassist.util.proxy.DefineClassHelper.Helper
        java.lang.Class<?> defineClass(java.lang.String r7, byte[] r8, int r9, int r10, java.lang.Class<?> r11, java.lang.ClassLoader r12, java.security.ProtectionDomain r13) throws java.lang.ClassFormatError {
                r6 = this;
                r0 = r6
                javassist.util.proxy.SecurityActions r0 = r0.stack
                java.lang.Class r0 = r0.getCallerClass()
                java.lang.Class<javassist.util.proxy.DefineClassHelper> r1 = javassist.util.proxy.DefineClassHelper.class
                if (r0 == r1) goto L16
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r1 = r0
                java.lang.String r2 = "Access denied for caller."
                r1.<init>(r2)
                throw r0
            L16:
                r0 = r6
                java.lang.invoke.MethodHandle r0 = r0.defineClass     // Catch: java.lang.Throwable -> L47
                r1 = 6
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L47
                r2 = r1
                r3 = 0
                r4 = r12
                r2[r3] = r4     // Catch: java.lang.Throwable -> L47
                r2 = r1
                r3 = 1
                r4 = r7
                r2[r3] = r4     // Catch: java.lang.Throwable -> L47
                r2 = r1
                r3 = 2
                r4 = r8
                r2[r3] = r4     // Catch: java.lang.Throwable -> L47
                r2 = r1
                r3 = 3
                r4 = r9
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L47
                r2[r3] = r4     // Catch: java.lang.Throwable -> L47
                r2 = r1
                r3 = 4
                r4 = r10
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L47
                r2[r3] = r4     // Catch: java.lang.Throwable -> L47
                r2 = r1
                r3 = 5
                r4 = r13
                r2[r3] = r4     // Catch: java.lang.Throwable -> L47
                java.lang.Object r0 = r0.invokeWithArguments(r1)     // Catch: java.lang.Throwable -> L47
                java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L47
                return r0
            L47:
                r14 = move-exception
                r0 = r14
                boolean r0 = r0 instanceof java.lang.RuntimeException
                if (r0 == 0) goto L57
                r0 = r14
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
                throw r0
            L57:
                r0 = r14
                boolean r0 = r0 instanceof java.lang.ClassFormatError
                if (r0 == 0) goto L65
                r0 = r14
                java.lang.ClassFormatError r0 = (java.lang.ClassFormatError) r0
                throw r0
            L65:
                java.lang.ClassFormatError r0 = new java.lang.ClassFormatError
                r1 = r0
                r2 = r14
                java.lang.String r2 = r2.getMessage()
                r1.<init>(r2)
                throw r0
        }

        /* synthetic */ Java7(javassist.util.proxy.DefineClassHelper.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/DefineClassHelper$Java9.class */
    private static class Java9 extends javassist.util.proxy.DefineClassHelper.Helper {
        private final java.lang.Object stack;
        private final java.lang.reflect.Method getCallerClass;
        private final javassist.util.proxy.DefineClassHelper.Java9.ReferencedUnsafe sunMiscUnsafe;

        /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/DefineClassHelper$Java9$ReferencedUnsafe.class */
        final class ReferencedUnsafe {
            private final javassist.util.proxy.SecurityActions.TheUnsafe sunMiscUnsafeTheUnsafe;
            private final java.lang.invoke.MethodHandle defineClass;
            final /* synthetic */ javassist.util.proxy.DefineClassHelper.Java9 this$0;

            ReferencedUnsafe(javassist.util.proxy.DefineClassHelper.Java9 r4, javassist.util.proxy.SecurityActions.TheUnsafe r5, java.lang.invoke.MethodHandle r6) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    r0.this$0 = r1
                    r0 = r3
                    r0.<init>()
                    r0 = r3
                    r1 = r5
                    r0.sunMiscUnsafeTheUnsafe = r1
                    r0 = r3
                    r1 = r6
                    r0.defineClass = r1
                    return
            }

            java.lang.Class<?> defineClass(java.lang.String r7, byte[] r8, int r9, int r10, java.lang.ClassLoader r11, java.security.ProtectionDomain r12) throws java.lang.ClassFormatError {
                    r6 = this;
                    r0 = r6
                    javassist.util.proxy.DefineClassHelper$Java9 r0 = r0.this$0     // Catch: java.lang.Exception -> L27
                    java.lang.reflect.Method r0 = javassist.util.proxy.DefineClassHelper.Java9.access$200(r0)     // Catch: java.lang.Exception -> L27
                    r1 = r6
                    javassist.util.proxy.DefineClassHelper$Java9 r1 = r1.this$0     // Catch: java.lang.Exception -> L27
                    java.lang.Object r1 = javassist.util.proxy.DefineClassHelper.Java9.access$100(r1)     // Catch: java.lang.Exception -> L27
                    r2 = 0
                    java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L27
                    java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L27
                    java.lang.Class<javassist.util.proxy.DefineClassHelper$Java9> r1 = javassist.util.proxy.DefineClassHelper.Java9.class
                    if (r0 == r1) goto L24
                    java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError     // Catch: java.lang.Exception -> L27
                    r1 = r0
                    java.lang.String r2 = "Access denied for caller."
                    r1.<init>(r2)     // Catch: java.lang.Exception -> L27
                    throw r0     // Catch: java.lang.Exception -> L27
                L24:
                    goto L35
                L27:
                    r13 = move-exception
                    java.lang.RuntimeException r0 = new java.lang.RuntimeException
                    r1 = r0
                    java.lang.String r2 = "cannot initialize"
                    r3 = r13
                    r1.<init>(r2, r3)
                    throw r0
                L35:
                    r0 = r6
                    java.lang.invoke.MethodHandle r0 = r0.defineClass     // Catch: java.lang.Throwable -> L71
                    r1 = 7
                    java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L71
                    r2 = r1
                    r3 = 0
                    r4 = r6
                    javassist.util.proxy.SecurityActions$TheUnsafe r4 = r4.sunMiscUnsafeTheUnsafe     // Catch: java.lang.Throwable -> L71
                    java.lang.Object r4 = r4.theUnsafe     // Catch: java.lang.Throwable -> L71
                    r2[r3] = r4     // Catch: java.lang.Throwable -> L71
                    r2 = r1
                    r3 = 1
                    r4 = r7
                    r2[r3] = r4     // Catch: java.lang.Throwable -> L71
                    r2 = r1
                    r3 = 2
                    r4 = r8
                    r2[r3] = r4     // Catch: java.lang.Throwable -> L71
                    r2 = r1
                    r3 = 3
                    r4 = r9
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L71
                    r2[r3] = r4     // Catch: java.lang.Throwable -> L71
                    r2 = r1
                    r3 = 4
                    r4 = r10
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L71
                    r2[r3] = r4     // Catch: java.lang.Throwable -> L71
                    r2 = r1
                    r3 = 5
                    r4 = r11
                    r2[r3] = r4     // Catch: java.lang.Throwable -> L71
                    r2 = r1
                    r3 = 6
                    r4 = r12
                    r2[r3] = r4     // Catch: java.lang.Throwable -> L71
                    java.lang.Object r0 = r0.invokeWithArguments(r1)     // Catch: java.lang.Throwable -> L71
                    java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L71
                    return r0
                L71:
                    r13 = move-exception
                    r0 = r13
                    boolean r0 = r0 instanceof java.lang.RuntimeException
                    if (r0 == 0) goto L81
                    r0 = r13
                    java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
                    throw r0
                L81:
                    r0 = r13
                    boolean r0 = r0 instanceof java.lang.ClassFormatError
                    if (r0 == 0) goto L8f
                    r0 = r13
                    java.lang.ClassFormatError r0 = (java.lang.ClassFormatError) r0
                    throw r0
                L8f:
                    java.lang.ClassFormatError r0 = new java.lang.ClassFormatError
                    r1 = r0
                    r2 = r13
                    java.lang.String r2 = r2.getMessage()
                    r1.<init>(r2)
                    throw r0
            }
        }

        Java9() {
                r9 = this;
                r0 = r9
                r1 = 0
                r0.<init>(r1)
                r0 = r9
                r1 = r9
                javassist.util.proxy.DefineClassHelper$Java9$ReferencedUnsafe r1 = r1.getReferencedUnsafe()
                r0.sunMiscUnsafe = r1
                r0 = 0
                r10 = r0
                java.lang.String r0 = "java.lang.StackWalker"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L18
                r10 = r0
                goto L19
            L18:
                r11 = move-exception
            L19:
                r0 = r10
                if (r0 == 0) goto L63
                java.lang.String r0 = "java.lang.StackWalker$Option"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L57
                r11 = r0
                r0 = r9
                r1 = r10
                java.lang.String r2 = "getInstance"
                r3 = 1
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L57
                r4 = r3
                r5 = 0
                r6 = r11
                r4[r5] = r6     // Catch: java.lang.Throwable -> L57
                java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L57
                r2 = 0
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L57
                r4 = r3
                r5 = 0
                r6 = r11
                java.lang.Object[] r6 = r6.getEnumConstants()     // Catch: java.lang.Throwable -> L57
                r7 = 0
                r6 = r6[r7]     // Catch: java.lang.Throwable -> L57
                r4[r5] = r6     // Catch: java.lang.Throwable -> L57
                java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Throwable -> L57
                r0.stack = r1     // Catch: java.lang.Throwable -> L57
                r0 = r9
                r1 = r10
                java.lang.String r2 = "getCallerClass"
                r3 = 0
                java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L57
                java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L57
                r0.getCallerClass = r1     // Catch: java.lang.Throwable -> L57
                goto L6d
            L57:
                r11 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.String r2 = "cannot initialize"
                r3 = r11
                r1.<init>(r2, r3)
                throw r0
            L63:
                r0 = r9
                r1 = 0
                r0.stack = r1
                r0 = r9
                r1 = 0
                r0.getCallerClass = r1
            L6d:
                return
        }

        private final javassist.util.proxy.DefineClassHelper.Java9.ReferencedUnsafe getReferencedUnsafe() {
                r6 = this;
                javassist.util.proxy.DefineClassHelper$Helper r0 = javassist.util.proxy.DefineClassHelper.access$400()     // Catch: java.lang.Exception -> L29
                if (r0 == 0) goto L26
                r0 = r6
                java.lang.reflect.Method r0 = r0.getCallerClass     // Catch: java.lang.Exception -> L29
                r1 = r6
                java.lang.Object r1 = r1.stack     // Catch: java.lang.Exception -> L29
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L29
                java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L29
                r1 = r6
                java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Exception -> L29
                if (r0 == r1) goto L26
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError     // Catch: java.lang.Exception -> L29
                r1 = r0
                java.lang.String r2 = "Access denied for caller."
                r1.<init>(r2)     // Catch: java.lang.Exception -> L29
                throw r0     // Catch: java.lang.Exception -> L29
            L26:
                goto L35
            L29:
                r7 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.String r2 = "cannot initialize"
                r3 = r7
                r1.<init>(r2, r3)
                throw r0
            L35:
                javassist.util.proxy.SecurityActions$TheUnsafe r0 = javassist.util.proxy.SecurityActions.getSunMiscUnsafeAnonymously()     // Catch: java.lang.Throwable -> L6b
                r7 = r0
                r0 = r7
                java.util.Map<java.lang.String, java.util.List<java.lang.reflect.Method>> r0 = r0.methods     // Catch: java.lang.Throwable -> L6b
                java.lang.String r1 = "defineClass"
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L6b
                java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L6b
                r8 = r0
                r0 = 0
                r1 = r8
                if (r0 != r1) goto L4f
                r0 = 0
                return r0
            L4f:
                java.lang.invoke.MethodHandles$Lookup r0 = java.lang.invoke.MethodHandles.lookup()     // Catch: java.lang.Throwable -> L6b
                r1 = r8
                r2 = 0
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L6b
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L6b
                java.lang.invoke.MethodHandle r0 = r0.unreflect(r1)     // Catch: java.lang.Throwable -> L6b
                r9 = r0
                javassist.util.proxy.DefineClassHelper$Java9$ReferencedUnsafe r0 = new javassist.util.proxy.DefineClassHelper$Java9$ReferencedUnsafe     // Catch: java.lang.Throwable -> L6b
                r1 = r0
                r2 = r6
                r3 = r7
                r4 = r9
                r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L6b
                return r0
            L6b:
                r7 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.String r2 = "cannot initialize"
                r3 = r7
                r1.<init>(r2, r3)
                throw r0
        }

        @Override // javassist.util.proxy.DefineClassHelper.Helper
        java.lang.Class<?> defineClass(java.lang.String r9, byte[] r10, int r11, int r12, java.lang.Class<?> r13, java.lang.ClassLoader r14, java.security.ProtectionDomain r15) throws java.lang.ClassFormatError {
                r8 = this;
                r0 = r8
                java.lang.reflect.Method r0 = r0.getCallerClass     // Catch: java.lang.Exception -> L21
                r1 = r8
                java.lang.Object r1 = r1.stack     // Catch: java.lang.Exception -> L21
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L21
                java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L21
                java.lang.Class<javassist.util.proxy.DefineClassHelper> r1 = javassist.util.proxy.DefineClassHelper.class
                if (r0 == r1) goto L1e
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError     // Catch: java.lang.Exception -> L21
                r1 = r0
                java.lang.String r2 = "Access denied for caller."
                r1.<init>(r2)     // Catch: java.lang.Exception -> L21
                throw r0     // Catch: java.lang.Exception -> L21
            L1e:
                goto L2f
            L21:
                r16 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.String r2 = "cannot initialize"
                r3 = r16
                r1.<init>(r2, r3)
                throw r0
            L2f:
                r0 = r8
                javassist.util.proxy.DefineClassHelper$Java9$ReferencedUnsafe r0 = r0.sunMiscUnsafe
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r14
                r6 = r15
                java.lang.Class r0 = r0.defineClass(r1, r2, r3, r4, r5, r6)
                return r0
        }

        static /* synthetic */ java.lang.Object access$100(javassist.util.proxy.DefineClassHelper.Java9 r2) {
                r0 = r2
                java.lang.Object r0 = r0.stack
                return r0
        }

        static /* synthetic */ java.lang.reflect.Method access$200(javassist.util.proxy.DefineClassHelper.Java9 r2) {
                r0 = r2
                java.lang.reflect.Method r0 = r0.getCallerClass
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/DefineClassHelper$JavaOther.class */
    private static class JavaOther extends javassist.util.proxy.DefineClassHelper.Helper {
        private final java.lang.reflect.Method defineClass;
        private final javassist.util.proxy.SecurityActions stack;

        private JavaOther() {
                r3 = this;
                r0 = r3
                r1 = 0
                r0.<init>(r1)
                r0 = r3
                r1 = r3
                java.lang.reflect.Method r1 = r1.getDefineClassMethod()
                r0.defineClass = r1
                r0 = r3
                javassist.util.proxy.SecurityActions r1 = javassist.util.proxy.SecurityActions.stack
                r0.stack = r1
                return
        }

        private final java.lang.reflect.Method getDefineClassMethod() {
                r7 = this;
                javassist.util.proxy.DefineClassHelper$Helper r0 = javassist.util.proxy.DefineClassHelper.access$400()
                if (r0 == 0) goto L1e
                r0 = r7
                javassist.util.proxy.SecurityActions r0 = r0.stack
                java.lang.Class r0 = r0.getCallerClass()
                r1 = r7
                java.lang.Class r1 = r1.getClass()
                if (r0 == r1) goto L1e
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r1 = r0
                java.lang.String r2 = "Access denied for caller."
                r1.<init>(r2)
                throw r0
            L1e:
                java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
                java.lang.String r1 = "defineClass"
                r2 = 5
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L45
                r3 = r2
                r4 = 0
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L45
                r3 = r2
                r4 = 1
                java.lang.Class<byte[]> r5 = byte[].class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L45
                r3 = r2
                r4 = 2
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L45
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L45
                r3 = r2
                r4 = 3
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L45
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L45
                r3 = r2
                r4 = 4
                java.lang.Class<java.security.ProtectionDomain> r5 = java.security.ProtectionDomain.class
                r3[r4] = r5     // Catch: java.lang.NoSuchMethodException -> L45
                java.lang.reflect.Method r0 = javassist.util.proxy.SecurityActions.getDeclaredMethod(r0, r1, r2)     // Catch: java.lang.NoSuchMethodException -> L45
                return r0
            L45:
                r8 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.String r2 = "cannot initialize"
                r3 = r8
                r1.<init>(r2, r3)
                throw r0
        }

        @Override // javassist.util.proxy.DefineClassHelper.Helper
        java.lang.Class<?> defineClass(java.lang.String r8, byte[] r9, int r10, int r11, java.lang.Class<?> r12, java.lang.ClassLoader r13, java.security.ProtectionDomain r14) throws java.lang.ClassFormatError, javassist.CannotCompileException {
                r7 = this;
                r0 = r7
                javassist.util.proxy.SecurityActions r0 = r0.stack
                java.lang.Class r0 = r0.getCallerClass()
                r15 = r0
                r0 = r15
                java.lang.Class<javassist.util.proxy.DefineClassHelper> r1 = javassist.util.proxy.DefineClassHelper.class
                if (r0 == r1) goto L23
                r0 = r15
                r1 = r7
                java.lang.Class r1 = r1.getClass()
                if (r0 == r1) goto L23
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r1 = r0
                java.lang.String r2 = "Access denied for caller."
                r1.<init>(r2)
                throw r0
            L23:
                r0 = r7
                java.lang.reflect.Method r0 = r0.defineClass     // Catch: java.lang.Throwable -> L58
                r1 = 1
                javassist.util.proxy.SecurityActions.setAccessible(r0, r1)     // Catch: java.lang.Throwable -> L58
                r0 = r7
                java.lang.reflect.Method r0 = r0.defineClass     // Catch: java.lang.Throwable -> L58
                r1 = r13
                r2 = 5
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L58
                r3 = r2
                r4 = 0
                r5 = r8
                r3[r4] = r5     // Catch: java.lang.Throwable -> L58
                r3 = r2
                r4 = 1
                r5 = r9
                r3[r4] = r5     // Catch: java.lang.Throwable -> L58
                r3 = r2
                r4 = 2
                r5 = r10
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L58
                r3[r4] = r5     // Catch: java.lang.Throwable -> L58
                r3 = r2
                r4 = 3
                r5 = r11
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L58
                r3[r4] = r5     // Catch: java.lang.Throwable -> L58
                r3 = r2
                r4 = 4
                r5 = r14
                r3[r4] = r5     // Catch: java.lang.Throwable -> L58
                java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L58
                java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L58
                return r0
            L58:
                r16 = move-exception
                r0 = r16
                boolean r0 = r0 instanceof java.lang.ClassFormatError
                if (r0 == 0) goto L68
                r0 = r16
                java.lang.ClassFormatError r0 = (java.lang.ClassFormatError) r0
                throw r0
            L68:
                r0 = r16
                boolean r0 = r0 instanceof java.lang.RuntimeException
                if (r0 == 0) goto L76
                r0 = r16
                java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
                throw r0
            L76:
                javassist.CannotCompileException r0 = new javassist.CannotCompileException
                r1 = r0
                r2 = r16
                r1.<init>(r2)
                throw r0
        }

        /* synthetic */ JavaOther(javassist.util.proxy.DefineClassHelper.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    public static java.lang.Class<?> toClass(java.lang.String r9, java.lang.Class<?> r10, java.lang.ClassLoader r11, java.security.ProtectionDomain r12, byte[] r13) throws javassist.CannotCompileException {
            javassist.util.proxy.DefineClassHelper$Helper r0 = javassist.util.proxy.DefineClassHelper.privileged     // Catch: java.lang.RuntimeException -> L11 javassist.CannotCompileException -> L16 java.lang.ClassFormatError -> L1b java.lang.Exception -> L38
            r1 = r9
            r2 = r13
            r3 = 0
            r4 = r13
            int r4 = r4.length     // Catch: java.lang.RuntimeException -> L11 javassist.CannotCompileException -> L16 java.lang.ClassFormatError -> L1b java.lang.Exception -> L38
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.Class r0 = r0.defineClass(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L11 javassist.CannotCompileException -> L16 java.lang.ClassFormatError -> L1b java.lang.Exception -> L38
            return r0
        L11:
            r14 = move-exception
            r0 = r14
            throw r0
        L16:
            r14 = move-exception
            r0 = r14
            throw r0
        L1b:
            r14 = move-exception
            r0 = r14
            java.lang.Throwable r0 = r0.getCause()
            r15 = r0
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r15
            if (r2 != 0) goto L32
            r2 = r14
            goto L34
        L32:
            r2 = r15
        L34:
            r1.<init>(r2)
            throw r0
        L38:
            r14 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r14
            r1.<init>(r2)
            throw r0
    }

    public static java.lang.Class<?> toClass(java.lang.Class<?> r5, byte[] r6) throws javassist.CannotCompileException {
            java.lang.Class<javassist.util.proxy.DefineClassHelper> r0 = javassist.util.proxy.DefineClassHelper.class
            java.lang.Module r0 = r0.getModule()     // Catch: java.lang.Throwable -> L1d
            r1 = r5
            java.lang.Module r1 = r1.getModule()     // Catch: java.lang.Throwable -> L1d
            java.lang.Module r0 = r0.addReads(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.invoke.MethodHandles$Lookup r0 = java.lang.invoke.MethodHandles.lookup()     // Catch: java.lang.Throwable -> L1d
            r7 = r0
            r0 = r5
            r1 = r7
            java.lang.invoke.MethodHandles$Lookup r0 = java.lang.invoke.MethodHandles.privateLookupIn(r0, r1)     // Catch: java.lang.Throwable -> L1d
            r8 = r0
            r0 = r8
            r1 = r6
            java.lang.Class r0 = r0.defineClass(r1)     // Catch: java.lang.Throwable -> L1d
            return r0
        L1d:
            r7 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r7
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " has no permission to define the class"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public static java.lang.Class<?> toClass(java.lang.invoke.MethodHandles.Lookup r4, byte[] r5) throws javassist.CannotCompileException {
            r0 = r4
            r1 = r5
            java.lang.Class r0 = r0.defineClass(r1)     // Catch: java.lang.Throwable -> L6
            return r0
        L6:
            r6 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.getMessage()
            r1.<init>(r2)
            throw r0
    }

    static java.lang.Class<?> toPublicClass(java.lang.String r4, byte[] r5) throws javassist.CannotCompileException {
            java.lang.invoke.MethodHandles$Lookup r0 = java.lang.invoke.MethodHandles.lookup()     // Catch: java.lang.Throwable -> L10
            r6 = r0
            r0 = r6
            r1 = 2
            java.lang.invoke.MethodHandles$Lookup r0 = r0.dropLookupMode(r1)     // Catch: java.lang.Throwable -> L10
            r6 = r0
            r0 = r6
            r1 = r5
            java.lang.Class r0 = r0.defineClass(r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r6 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    private DefineClassHelper() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static /* synthetic */ javassist.util.proxy.DefineClassHelper.Helper access$400() {
            javassist.util.proxy.DefineClassHelper$Helper r0 = javassist.util.proxy.DefineClassHelper.privileged
            return r0
    }

    static {
            int r0 = javassist.bytecode.ClassFile.MAJOR_VERSION
            r1 = 54
            if (r0 <= r1) goto L13
            javassist.util.proxy.DefineClassHelper$Java11 r0 = new javassist.util.proxy.DefineClassHelper$Java11
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            goto L40
        L13:
            int r0 = javassist.bytecode.ClassFile.MAJOR_VERSION
            r1 = 53
            if (r0 < r1) goto L25
            javassist.util.proxy.DefineClassHelper$Java9 r0 = new javassist.util.proxy.DefineClassHelper$Java9
            r1 = r0
            r1.<init>()
            goto L40
        L25:
            int r0 = javassist.bytecode.ClassFile.MAJOR_VERSION
            r1 = 51
            if (r0 < r1) goto L38
            javassist.util.proxy.DefineClassHelper$Java7 r0 = new javassist.util.proxy.DefineClassHelper$Java7
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            goto L40
        L38:
            javassist.util.proxy.DefineClassHelper$JavaOther r0 = new javassist.util.proxy.DefineClassHelper$JavaOther
            r1 = r0
            r2 = 0
            r1.<init>(r2)
        L40:
            javassist.util.proxy.DefineClassHelper.privileged = r0
            return
    }
}
