package javassist.util.proxy;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/util/proxy/FactoryHelper.class */
public class FactoryHelper {
    public static final java.lang.Class<?>[] primitiveTypes = null;
    public static final java.lang.String[] wrapperTypes = null;
    public static final java.lang.String[] wrapperDesc = null;
    public static final java.lang.String[] unwarpMethods = null;
    public static final java.lang.String[] unwrapDesc = null;
    public static final int[] dataSize = null;

    public FactoryHelper() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static final int typeIndex(java.lang.Class<?> r5) {
            r0 = 0
            r6 = r0
        L2:
            r0 = r6
            java.lang.Class<?>[] r1 = javassist.util.proxy.FactoryHelper.primitiveTypes
            int r1 = r1.length
            if (r0 >= r1) goto L1b
            java.lang.Class<?>[] r0 = javassist.util.proxy.FactoryHelper.primitiveTypes
            r1 = r6
            r0 = r0[r1]
            r1 = r5
            if (r0 != r1) goto L15
            r0 = r6
            return r0
        L15:
            int r6 = r6 + 1
            goto L2
        L1b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad type:"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public static java.lang.Class<?> toClass(javassist.bytecode.ClassFile r5, java.lang.ClassLoader r6) throws javassist.CannotCompileException {
            r0 = r5
            r1 = 0
            r2 = r6
            r3 = 0
            java.lang.Class r0 = toClass(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.Class<?> toClass(javassist.bytecode.ClassFile r5, java.lang.ClassLoader r6, java.security.ProtectionDomain r7) throws javassist.CannotCompileException {
            r0 = r5
            r1 = 0
            r2 = r6
            r3 = r7
            java.lang.Class r0 = toClass(r0, r1, r2, r3)
            return r0
    }

    public static java.lang.Class<?> toClass(javassist.bytecode.ClassFile r6, java.lang.Class<?> r7, java.lang.ClassLoader r8, java.security.ProtectionDomain r9) throws javassist.CannotCompileException {
            r0 = r6
            byte[] r0 = toBytecode(r0)     // Catch: java.io.IOException -> L23
            r10 = r0
            boolean r0 = javassist.util.proxy.ProxyFactory.onlyPublicMethods     // Catch: java.io.IOException -> L23
            if (r0 == 0) goto L16
            r0 = r6
            java.lang.String r0 = r0.getName()     // Catch: java.io.IOException -> L23
            r1 = r10
            java.lang.Class r0 = javassist.util.proxy.DefineClassHelper.toPublicClass(r0, r1)     // Catch: java.io.IOException -> L23
            return r0
        L16:
            r0 = r6
            java.lang.String r0 = r0.getName()     // Catch: java.io.IOException -> L23
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.Class r0 = javassist.util.proxy.DefineClassHelper.toClass(r0, r1, r2, r3, r4)     // Catch: java.io.IOException -> L23
            return r0
        L23:
            r10 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            throw r0
    }

    public static java.lang.Class<?> toClass(javassist.bytecode.ClassFile r4, java.lang.invoke.MethodHandles.Lookup r5) throws javassist.CannotCompileException {
            r0 = r4
            byte[] r0 = toBytecode(r0)     // Catch: java.io.IOException -> Lb
            r6 = r0
            r0 = r5
            r1 = r6
            java.lang.Class r0 = javassist.util.proxy.DefineClassHelper.toClass(r0, r1)     // Catch: java.io.IOException -> Lb
            return r0
        Lb:
            r6 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    private static byte[] toBytecode(javassist.bytecode.ClassFile r4) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = r0
            r1.<init>()
            r5 = r0
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r4
            r1 = r6
            r0.write(r1)     // Catch: java.lang.Throwable -> L1d
            r0 = r6
            r0.close()
            goto L24
        L1d:
            r7 = move-exception
            r0 = r6
            r0.close()
            r0 = r7
            throw r0
        L24:
            r0 = r5
            byte[] r0 = r0.toByteArray()
            return r0
    }

    public static void writeFile(javassist.bytecode.ClassFile r4, java.lang.String r5) throws javassist.CannotCompileException {
            r0 = r4
            r1 = r5
            writeFile0(r0, r1)     // Catch: java.io.IOException -> L8
            goto L12
        L8:
            r6 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L12:
            return
    }

    private static void writeFile0(javassist.bytecode.ClassFile r8, java.lang.String r9) throws javassist.CannotCompileException, java.io.IOException {
            r0 = r8
            java.lang.String r0 = r0.getName()
            r10 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            char r1 = java.io.File.separatorChar
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            r2 = 46
            char r3 = java.io.File.separatorChar
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ".class"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11 = r0
            r0 = r11
            char r1 = java.io.File.separatorChar
            int r0 = r0.lastIndexOf(r1)
            r12 = r0
            r0 = r12
            if (r0 <= 0) goto L59
            r0 = r11
            r1 = 0
            r2 = r12
            java.lang.String r0 = r0.substring(r1, r2)
            r13 = r0
            r0 = r13
            java.lang.String r1 = "."
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L59
            java.io.File r0 = new java.io.File
            r1 = r0
            r2 = r13
            r1.<init>(r2)
            boolean r0 = r0.mkdirs()
        L59:
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r1 = r0
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            r3 = r2
            java.io.FileOutputStream r4 = new java.io.FileOutputStream
            r5 = r4
            r6 = r11
            r5.<init>(r6)
            r3.<init>(r4)
            r1.<init>(r2)
            r13 = r0
            r0 = r8
            r1 = r13
            r0.write(r1)     // Catch: java.io.IOException -> L7f java.lang.Throwable -> L84
            r0 = r13
            r0.close()
            goto L8e
        L7f:
            r14 = move-exception
            r0 = r14
            throw r0     // Catch: java.lang.Throwable -> L84
        L84:
            r15 = move-exception
            r0 = r13
            r0.close()
            r0 = r15
            throw r0
        L8e:
            return
    }

    static {
            r0 = 9
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = r0
            r2 = 0
            java.lang.Class r3 = java.lang.Boolean.TYPE
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.Class r3 = java.lang.Byte.TYPE
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.Class r3 = java.lang.Character.TYPE
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.Class r3 = java.lang.Short.TYPE
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.Class r3 = java.lang.Integer.TYPE
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.Class r3 = java.lang.Long.TYPE
            r1[r2] = r3
            r1 = r0
            r2 = 6
            java.lang.Class r3 = java.lang.Float.TYPE
            r1[r2] = r3
            r1 = r0
            r2 = 7
            java.lang.Class r3 = java.lang.Double.TYPE
            r1[r2] = r3
            r1 = r0
            r2 = 8
            java.lang.Class r3 = java.lang.Void.TYPE
            r1[r2] = r3
            javassist.util.proxy.FactoryHelper.primitiveTypes = r0
            r0 = 9
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "java.lang.Boolean"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "java.lang.Byte"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "java.lang.Character"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "java.lang.Short"
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.String r3 = "java.lang.Integer"
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.String r3 = "java.lang.Long"
            r1[r2] = r3
            r1 = r0
            r2 = 6
            java.lang.String r3 = "java.lang.Float"
            r1[r2] = r3
            r1 = r0
            r2 = 7
            java.lang.String r3 = "java.lang.Double"
            r1[r2] = r3
            r1 = r0
            r2 = 8
            java.lang.String r3 = "java.lang.Void"
            r1[r2] = r3
            javassist.util.proxy.FactoryHelper.wrapperTypes = r0
            r0 = 8
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "(Z)V"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "(B)V"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "(C)V"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "(S)V"
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.String r3 = "(I)V"
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.String r3 = "(J)V"
            r1[r2] = r3
            r1 = r0
            r2 = 6
            java.lang.String r3 = "(F)V"
            r1[r2] = r3
            r1 = r0
            r2 = 7
            java.lang.String r3 = "(D)V"
            r1[r2] = r3
            javassist.util.proxy.FactoryHelper.wrapperDesc = r0
            r0 = 8
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "booleanValue"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "byteValue"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "charValue"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "shortValue"
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.String r3 = "intValue"
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.String r3 = "longValue"
            r1[r2] = r3
            r1 = r0
            r2 = 6
            java.lang.String r3 = "floatValue"
            r1[r2] = r3
            r1 = r0
            r2 = 7
            java.lang.String r3 = "doubleValue"
            r1[r2] = r3
            javassist.util.proxy.FactoryHelper.unwarpMethods = r0
            r0 = 8
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "()Z"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "()B"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "()C"
            r1[r2] = r3
            r1 = r0
            r2 = 3
            java.lang.String r3 = "()S"
            r1[r2] = r3
            r1 = r0
            r2 = 4
            java.lang.String r3 = "()I"
            r1[r2] = r3
            r1 = r0
            r2 = 5
            java.lang.String r3 = "()J"
            r1[r2] = r3
            r1 = r0
            r2 = 6
            java.lang.String r3 = "()F"
            r1[r2] = r3
            r1 = r0
            r2 = 7
            java.lang.String r3 = "()D"
            r1[r2] = r3
            javassist.util.proxy.FactoryHelper.unwrapDesc = r0
            r0 = 8
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 2
            r1[r2] = r3
            javassist.util.proxy.FactoryHelper.dataSize = r0
            return
    }
}
