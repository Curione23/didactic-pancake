package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/SerialVersionUID.class */
public class SerialVersionUID {




    public SerialVersionUID() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void setSerialVersionUID(javassist.CtClass r6) throws javassist.CannotCompileException, javassist.NotFoundException {
            r0 = r6
            java.lang.String r1 = "serialVersionUID"
            javassist.CtField r0 = r0.getDeclaredField(r1)     // Catch: javassist.NotFoundException -> L8
            return
        L8:
            r7 = move-exception
            r0 = r6
            boolean r0 = isSerializable(r0)
            if (r0 != 0) goto L11
            return
        L11:
            javassist.CtField r0 = new javassist.CtField
            r1 = r0
            javassist.CtClass r2 = javassist.CtClass.longType
            java.lang.String r3 = "serialVersionUID"
            r4 = r6
            r1.<init>(r2, r3, r4)
            r7 = r0
            r0 = r7
            r1 = 26
            r0.setModifiers(r1)
            r0 = r6
            r1 = r7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r6
            long r3 = calculateDefault(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "L"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.addField(r1, r2)
            return
    }

    private static boolean isSerializable(javassist.CtClass r4) throws javassist.NotFoundException {
            r0 = r4
            javassist.ClassPool r0 = r0.getClassPool()
            r5 = r0
            r0 = r4
            r1 = r5
            java.lang.String r2 = "java.io.Serializable"
            javassist.CtClass r1 = r1.get(r2)
            boolean r0 = r0.subtypeOf(r1)
            return r0
    }

    public static long calculateDefault(javassist.CtClass r5) throws javassist.CannotCompileException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r1 = r0
            r1.<init>()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r6 = r0
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r1 = r0
            r2 = r6
            r1.<init>(r2)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r7 = r0
            r0 = r5
            javassist.bytecode.ClassFile r0 = r0.getClassFile()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r8 = r0
            r0 = r5
            java.lang.String r0 = javaName(r0)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r9 = r0
            r0 = r7
            r1 = r9
            r0.writeUTF(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0 = r5
            javassist.CtMethod[] r0 = r0.getDeclaredMethods()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r10 = r0
            r0 = r5
            int r0 = r0.getModifiers()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r11 = r0
            r0 = r11
            r1 = 512(0x200, float:7.17E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L50
            r0 = r10
            int r0 = r0.length     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            if (r0 <= 0) goto L48
            r0 = r11
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 | r1
            r11 = r0
            goto L50
        L48:
            r0 = r11
            r1 = -1025(0xfffffffffffffbff, float:NaN)
            r0 = r0 & r1
            r11 = r0
        L50:
            r0 = r7
            r1 = r11
            r0.writeInt(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0 = r8
            java.lang.String[] r0 = r0.getInterfaces()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r12 = r0
            r0 = 0
            r13 = r0
        L5f:
            r0 = r13
            r1 = r12
            int r1 = r1.length     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            if (r0 >= r1) goto L7a
            r0 = r12
            r1 = r13
            r2 = r12
            r3 = r13
            r2 = r2[r3]     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            java.lang.String r2 = javaName(r2)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0[r1] = r2     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            int r13 = r13 + 1
            goto L5f
        L7a:
            r0 = r12
            java.util.Arrays.sort(r0)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0 = 0
            r13 = r0
        L82:
            r0 = r13
            r1 = r12
            int r1 = r1.length     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            if (r0 >= r1) goto L99
            r0 = r7
            r1 = r12
            r2 = r13
            r1 = r1[r2]     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0.writeUTF(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            int r13 = r13 + 1
            goto L82
        L99:
            r0 = r5
            javassist.CtField[] r0 = r0.getDeclaredFields()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r13 = r0
            r0 = r13
            javassist.SerialVersionUID$1 r1 = new javassist.SerialVersionUID$1     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r2 = r1
            r2.<init>()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            java.util.Arrays.sort(r0, r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0 = 0
            r14 = r0
        Lae:
            r0 = r14
            r1 = r13
            int r1 = r1.length     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            if (r0 >= r1) goto Lf5
            r0 = r13
            r1 = r14
            r0 = r0[r1]     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r15 = r0
            r0 = r15
            int r0 = r0.getModifiers()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r16 = r0
            r0 = r16
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto Ld4
            r0 = r16
            r1 = 136(0x88, float:1.9E-43)
            r0 = r0 & r1
            if (r0 != 0) goto Lef
        Ld4:
            r0 = r7
            r1 = r15
            java.lang.String r1 = r1.getName()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0.writeUTF(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0 = r7
            r1 = r16
            r0.writeInt(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0 = r7
            r1 = r15
            javassist.bytecode.FieldInfo r1 = r1.getFieldInfo2()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            java.lang.String r1 = r1.getDescriptor()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0.writeUTF(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
        Lef:
            int r14 = r14 + 1
            goto Lae
        Lf5:
            r0 = r8
            javassist.bytecode.MethodInfo r0 = r0.getStaticInitializer()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            if (r0 == 0) goto L10e
            r0 = r7
            java.lang.String r1 = "<clinit>"
            r0.writeUTF(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0 = r7
            r1 = 8
            r0.writeInt(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0 = r7
            java.lang.String r1 = "()V"
            r0.writeUTF(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
        L10e:
            r0 = r5
            javassist.CtConstructor[] r0 = r0.getDeclaredConstructors()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r14 = r0
            r0 = r14
            javassist.SerialVersionUID$2 r1 = new javassist.SerialVersionUID$2     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r2 = r1
            r2.<init>()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            java.util.Arrays.sort(r0, r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0 = 0
            r15 = r0
        L123:
            r0 = r15
            r1 = r14
            int r1 = r1.length     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            if (r0 >= r1) goto L165
            r0 = r14
            r1 = r15
            r0 = r0[r1]     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r16 = r0
            r0 = r16
            int r0 = r0.getModifiers()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r17 = r0
            r0 = r17
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L15f
            r0 = r7
            java.lang.String r1 = "<init>"
            r0.writeUTF(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0 = r7
            r1 = r17
            r0.writeInt(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0 = r7
            r1 = r16
            javassist.bytecode.MethodInfo r1 = r1.getMethodInfo2()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            java.lang.String r1 = r1.getDescriptor()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r2 = 47
            r3 = 46
            java.lang.String r1 = r1.replace(r2, r3)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0.writeUTF(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
        L15f:
            int r15 = r15 + 1
            goto L123
        L165:
            r0 = r10
            javassist.SerialVersionUID$3 r1 = new javassist.SerialVersionUID$3     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r2 = r1
            r2.<init>()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            java.util.Arrays.sort(r0, r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0 = 0
            r15 = r0
        L174:
            r0 = r15
            r1 = r10
            int r1 = r1.length     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            if (r0 >= r1) goto L1bd
            r0 = r10
            r1 = r15
            r0 = r0[r1]     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r16 = r0
            r0 = r16
            int r0 = r0.getModifiers()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r1 = 3391(0xd3f, float:4.752E-42)
            r0 = r0 & r1
            r17 = r0
            r0 = r17
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L1b7
            r0 = r7
            r1 = r16
            java.lang.String r1 = r1.getName()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0.writeUTF(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0 = r7
            r1 = r17
            r0.writeInt(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0 = r7
            r1 = r16
            javassist.bytecode.MethodInfo r1 = r1.getMethodInfo2()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            java.lang.String r1 = r1.getDescriptor()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r2 = 47
            r3 = 46
            java.lang.String r1 = r1.replace(r2, r3)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r0.writeUTF(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
        L1b7:
            int r15 = r15 + 1
            goto L174
        L1bd:
            r0 = r7
            r0.flush()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            java.lang.String r0 = "SHA"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r15 = r0
            r0 = r15
            r1 = r6
            byte[] r1 = r1.toByteArray()     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            byte[] r0 = r0.digest(r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = r16
            int r0 = r0.length     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r1 = 8
            int r0 = java.lang.Math.min(r0, r1)     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r1 = 1
            int r0 = r0 - r1
            r19 = r0
        L1e2:
            r0 = r19
            if (r0 < 0) goto L1ff
            r0 = r17
            r1 = 8
            long r0 = r0 << r1
            r1 = r16
            r2 = r19
            r1 = r1[r2]     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            long r1 = (long) r1     // Catch: java.io.IOException -> L202 java.security.NoSuchAlgorithmException -> L20c
            long r0 = r0 | r1
            r17 = r0
            int r19 = r19 + (-1)
            goto L1e2
        L1ff:
            r0 = r17
            return r0
        L202:
            r6 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L20c:
            r6 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    private static java.lang.String javaName(javassist.CtClass r2) {
            r0 = r2
            java.lang.String r0 = javassist.bytecode.Descriptor.toJvmName(r0)
            java.lang.String r0 = javassist.bytecode.Descriptor.toJavaName(r0)
            return r0
    }

    private static java.lang.String javaName(java.lang.String r2) {
            r0 = r2
            java.lang.String r0 = javassist.bytecode.Descriptor.toJvmName(r0)
            java.lang.String r0 = javassist.bytecode.Descriptor.toJavaName(r0)
            return r0
    }
}
