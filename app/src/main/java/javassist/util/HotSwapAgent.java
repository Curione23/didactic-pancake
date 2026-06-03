package javassist.util;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/HotSwapAgent.class */
public class HotSwapAgent {
    private static java.lang.instrument.Instrumentation instrumentation;

    public HotSwapAgent() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public java.lang.instrument.Instrumentation instrumentation() {
            r2 = this;
            java.lang.instrument.Instrumentation r0 = javassist.util.HotSwapAgent.instrumentation
            return r0
    }

    public static void premain(java.lang.String r3, java.lang.instrument.Instrumentation r4) throws java.lang.Throwable {
            r0 = r3
            r1 = r4
            agentmain(r0, r1)
            return
    }

    public static void agentmain(java.lang.String r4, java.lang.instrument.Instrumentation r5) throws java.lang.Throwable {
            r0 = r5
            boolean r0 = r0.isRedefineClassesSupported()
            if (r0 != 0) goto L13
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "this JVM does not support redefinition of classes"
            r1.<init>(r2)
            throw r0
        L13:
            r0 = r5
            javassist.util.HotSwapAgent.instrumentation = r0
            return
    }

    public static void redefine(java.lang.Class<?> r5, javassist.CtClass r6) throws javassist.NotFoundException, java.io.IOException, javassist.CannotCompileException {
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = r0
            r2 = 0
            r3 = r5
            r1[r2] = r3
            r7 = r0
            r0 = 1
            javassist.CtClass[] r0 = new javassist.CtClass[r0]
            r1 = r0
            r2 = 0
            r3 = r6
            r1[r2] = r3
            r8 = r0
            r0 = r7
            r1 = r8
            redefine(r0, r1)
            return
    }

    public static void redefine(java.lang.Class<?>[] r8, javassist.CtClass[] r9) throws javassist.NotFoundException, java.io.IOException, javassist.CannotCompileException {
            startAgent()
            r0 = r8
            int r0 = r0.length
            java.lang.instrument.ClassDefinition[] r0 = new java.lang.instrument.ClassDefinition[r0]
            r10 = r0
            r0 = 0
            r11 = r0
        Lb:
            r0 = r11
            r1 = r8
            int r1 = r1.length
            if (r0 >= r1) goto L2a
            r0 = r10
            r1 = r11
            java.lang.instrument.ClassDefinition r2 = new java.lang.instrument.ClassDefinition
            r3 = r2
            r4 = r8
            r5 = r11
            r4 = r4[r5]
            r5 = r9
            r6 = r11
            r5 = r5[r6]
            byte[] r5 = r5.toBytecode()
            r3.<init>(r4, r5)
            r0[r1] = r2
            int r11 = r11 + 1
            goto Lb
        L2a:
            java.lang.instrument.Instrumentation r0 = javassist.util.HotSwapAgent.instrumentation     // Catch: java.lang.ClassNotFoundException -> L36 java.lang.instrument.UnmodifiableClassException -> L44
            r1 = r10
            r0.redefineClasses(r1)     // Catch: java.lang.ClassNotFoundException -> L36 java.lang.instrument.UnmodifiableClassException -> L44
            goto L52
        L36:
            r11 = move-exception
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            r2 = r11
            java.lang.String r2 = r2.getMessage()
            r3 = r11
            r1.<init>(r2, r3)
            throw r0
        L44:
            r11 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r11
            java.lang.String r2 = r2.getMessage()
            r3 = r11
            r1.<init>(r2, r3)
            throw r0
        L52:
            return
    }

    private static void startAgent() throws javassist.NotFoundException {
            java.lang.instrument.Instrumentation r0 = javassist.util.HotSwapAgent.instrumentation
            if (r0 == 0) goto L7
            return
        L7:
            java.io.File r0 = createJarFile()     // Catch: java.lang.Exception -> L35
            r5 = r0
            java.lang.management.RuntimeMXBean r0 = java.lang.management.ManagementFactory.getRuntimeMXBean()     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L35
            r6 = r0
            r0 = r6
            r1 = 0
            r2 = r6
            r3 = 64
            int r2 = r2.indexOf(r3)     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = r0.substring(r1, r2)     // Catch: java.lang.Exception -> L35
            r7 = r0
            r0 = r7
            com.sun.tools.attach.VirtualMachine r0 = com.sun.tools.attach.VirtualMachine.attach(r0)     // Catch: java.lang.Exception -> L35
            r8 = r0
            r0 = r8
            r1 = r5
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L35
            r2 = 0
            r0.loadAgent(r1, r2)     // Catch: java.lang.Exception -> L35
            r0 = r8
            r0.detach()     // Catch: java.lang.Exception -> L35
            goto L41
        L35:
            r5 = move-exception
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            java.lang.String r2 = "hotswap agent"
            r3 = r5
            r1.<init>(r2, r3)
            throw r0
        L41:
            r0 = 0
            r5 = r0
        L43:
            r0 = r5
            r1 = 10
            if (r0 >= r1) goto L69
            java.lang.instrument.Instrumentation r0 = javassist.util.HotSwapAgent.instrumentation
            if (r0 == 0) goto L50
            return
        L50:
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L59
            goto L63
        L59:
            r6 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L69
        L63:
            int r5 = r5 + 1
            goto L43
        L69:
            javassist.NotFoundException r0 = new javassist.NotFoundException
            r1 = r0
            java.lang.String r2 = "hotswap agent (timeout)"
            r1.<init>(r2)
            throw r0
    }

    public static java.io.File createAgentJarFile(java.lang.String r4) throws java.io.IOException, javassist.CannotCompileException, javassist.NotFoundException {
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            java.io.File r0 = createJarFile(r0)
            return r0
    }

    private static java.io.File createJarFile() throws java.io.IOException, javassist.CannotCompileException, javassist.NotFoundException {
            java.lang.String r0 = "agent"
            java.lang.String r1 = ".jar"
            java.io.File r0 = java.io.File.createTempFile(r0, r1)
            r3 = r0
            r0 = r3
            r0.deleteOnExit()
            r0 = r3
            java.io.File r0 = createJarFile(r0)
            return r0
    }

    private static java.io.File createJarFile(java.io.File r7) throws java.io.IOException, javassist.CannotCompileException, javassist.NotFoundException {
            java.util.jar.Manifest r0 = new java.util.jar.Manifest
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r8
            java.util.jar.Attributes r0 = r0.getMainAttributes()
            r9 = r0
            r0 = r9
            java.util.jar.Attributes$Name r1 = java.util.jar.Attributes.Name.MANIFEST_VERSION
            java.lang.String r2 = "1.0"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r9
            java.util.jar.Attributes$Name r1 = new java.util.jar.Attributes$Name
            r2 = r1
            java.lang.String r3 = "Premain-Class"
            r2.<init>(r3)
            java.lang.Class<javassist.util.HotSwapAgent> r2 = javassist.util.HotSwapAgent.class
            java.lang.String r2 = r2.getName()
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r9
            java.util.jar.Attributes$Name r1 = new java.util.jar.Attributes$Name
            r2 = r1
            java.lang.String r3 = "Agent-Class"
            r2.<init>(r3)
            java.lang.Class<javassist.util.HotSwapAgent> r2 = javassist.util.HotSwapAgent.class
            java.lang.String r2 = r2.getName()
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r9
            java.util.jar.Attributes$Name r1 = new java.util.jar.Attributes$Name
            r2 = r1
            java.lang.String r3 = "Can-Retransform-Classes"
            r2.<init>(r3)
            java.lang.String r2 = "true"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r9
            java.util.jar.Attributes$Name r1 = new java.util.jar.Attributes$Name
            r2 = r1
            java.lang.String r3 = "Can-Redefine-Classes"
            r2.<init>(r3)
            java.lang.String r2 = "true"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = 0
            r10 = r0
            java.util.jar.JarOutputStream r0 = new java.util.jar.JarOutputStream     // Catch: java.lang.Throwable -> Lc7
            r1 = r0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lc7
            r3 = r2
            r4 = r7
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lc7
            r3 = r8
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lc7
            r10 = r0
            java.lang.Class<javassist.util.HotSwapAgent> r0 = javassist.util.HotSwapAgent.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Lc7
            r11 = r0
            java.util.jar.JarEntry r0 = new java.util.jar.JarEntry     // Catch: java.lang.Throwable -> Lc7
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc7
            r3 = r2
            r3.<init>()     // Catch: java.lang.Throwable -> Lc7
            r3 = r11
            r4 = 46
            r5 = 47
            java.lang.String r3 = r3.replace(r4, r5)     // Catch: java.lang.Throwable -> Lc7
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r3 = ".class"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lc7
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc7
            r12 = r0
            r0 = r10
            r1 = r12
            r0.putNextEntry(r1)     // Catch: java.lang.Throwable -> Lc7
            javassist.ClassPool r0 = javassist.ClassPool.getDefault()     // Catch: java.lang.Throwable -> Lc7
            r13 = r0
            r0 = r13
            r1 = r11
            javassist.CtClass r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc7
            r14 = r0
            r0 = r10
            r1 = r14
            byte[] r1 = r1.toBytecode()     // Catch: java.lang.Throwable -> Lc7
            r0.write(r1)     // Catch: java.lang.Throwable -> Lc7
            r0 = r10
            r0.closeEntry()     // Catch: java.lang.Throwable -> Lc7
            r0 = r10
            if (r0 == 0) goto Ld4
            r0 = r10
            r0.close()
            goto Ld4
        Lc7:
            r15 = move-exception
            r0 = r10
            if (r0 == 0) goto Ld1
            r0 = r10
            r0.close()
        Ld1:
            r0 = r15
            throw r0
        Ld4:
            r0 = r7
            return r0
    }

    static {
            r0 = 0
            javassist.util.HotSwapAgent.instrumentation = r0
            return
    }
}
