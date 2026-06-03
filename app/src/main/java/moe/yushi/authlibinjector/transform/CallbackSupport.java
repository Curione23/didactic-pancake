package moe.yushi.authlibinjector.transform;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/other_login/authlib-injector.jar:moe/yushi/authlibinjector/transform/CallbackSupport.class */
final class CallbackSupport {
    private static final java.lang.String METAFACTORY_NAME = "__authlibinjector_metafactory";
    private static final java.lang.String METAFACTORY_SIGNATURE = "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;)Ljava/lang/invoke/CallSite;";

    private CallbackSupport() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static java.lang.reflect.Method findCallbackMethod(java.lang.Class<?> r5, java.lang.String r6) {
            r0 = r5
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        Lb:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L4d
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            int r0 = r0.getModifiers()
            r11 = r0
            r0 = r11
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L47
            r0 = r11
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L47
            r0 = r6
            r1 = r10
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L47
            r0 = r10
            java.lang.Class<moe.yushi.authlibinjector.transform.CallbackMethod> r1 = moe.yushi.authlibinjector.transform.CallbackMethod.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            if (r0 == 0) goto L47
            r0 = r10
            return r0
        L47:
            int r9 = r9 + 1
            goto Lb
        L4d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "No such method: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    static void callWithInvokeDynamic(moe.yushi.authlibinjector.internal.org.objectweb.asm.MethodVisitor r9, java.lang.Class<?> r10, java.lang.String r11, moe.yushi.authlibinjector.transform.TransformContext r12) {
            r0 = r10
            r1 = r11
            java.lang.reflect.Method r0 = findCallbackMethod(r0, r1)
            java.lang.String r0 = moe.yushi.authlibinjector.internal.org.objectweb.asm.Type.getMethodDescriptor(r0)
            r13 = r0
            moe.yushi.authlibinjector.internal.org.objectweb.asm.Handle r0 = new moe.yushi.authlibinjector.internal.org.objectweb.asm.Handle
            r1 = r0
            r2 = 6
            r3 = r12
            java.lang.String r3 = r3.getClassName()
            r4 = 46
            r5 = 47
            java.lang.String r3 = r3.replace(r4, r5)
            java.lang.String r4 = "__authlibinjector_metafactory"
            java.lang.String r5 = "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;)Ljava/lang/invoke/CallSite;"
            r6 = r12
            boolean r6 = r6.isInterface()
            r1.<init>(r2, r3, r4, r5, r6)
            r14 = r0
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = r4
            r6 = 0
            r7 = r10
            java.lang.String r7 = r7.getName()
            r5[r6] = r7
            r0.visitInvokeDynamicInsn(r1, r2, r3, r4)
            return
    }

    static void callWithIntermediateMethod(moe.yushi.authlibinjector.internal.org.objectweb.asm.MethodVisitor r8, java.lang.Class<?> r9, java.lang.String r10, moe.yushi.authlibinjector.transform.TransformContext r11) {
            r0 = r9
            r1 = r10
            java.lang.reflect.Method r0 = findCallbackMethod(r0, r1)
            r12 = r0
            r0 = r12
            java.lang.String r0 = moe.yushi.authlibinjector.internal.org.objectweb.asm.Type.getMethodDescriptor(r0)
            r13 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "__authlibinjector_intermediate__"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.String r1 = r1.getName()
            r2 = 46
            r3 = 95
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "__"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14 = r0
            r0 = r8
            r1 = 184(0xb8, float:2.58E-43)
            r2 = r11
            java.lang.String r2 = r2.getClassName()
            r3 = 46
            r4 = 47
            java.lang.String r2 = r2.replace(r3, r4)
            r3 = r14
            r4 = r13
            r5 = r11
            boolean r5 = r5.isInterface()
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r11
            r1 = r14
            r2 = r12
            r3 = r14
            r4 = r13
            r5 = r9
            r6 = r10
            void r2 = (v5) -> { // java.util.function.Consumer.accept(java.lang.Object):void
                lambda$callWithIntermediateMethod$0(r2, r3, r4, r5, r6, v5);
            }
            r0.addGeneratedMethod(r1, r2)
            return
    }

    private static void pushType(moe.yushi.authlibinjector.internal.org.objectweb.asm.MethodVisitor r6, java.lang.Class<?> r7) {
            r0 = r7
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto Ld6
            r0 = r7
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 != r1) goto L1e
            r0 = r6
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Boolean"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Lde
        L1e:
            r0 = r7
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 != r1) goto L35
            r0 = r6
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Byte"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Lde
        L35:
            r0 = r7
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 != r1) goto L4c
            r0 = r6
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Character"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Lde
        L4c:
            r0 = r7
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 != r1) goto L63
            r0 = r6
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Short"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Lde
        L63:
            r0 = r7
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto L7a
            r0 = r6
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Integer"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Lde
        L7a:
            r0 = r7
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L91
            r0 = r6
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Float"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Lde
        L91:
            r0 = r7
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto La8
            r0 = r6
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Long"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Lde
        La8:
            r0 = r7
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto Lbf
            r0 = r6
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Double"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Lde
        Lbf:
            r0 = r7
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 != r1) goto Lde
            r0 = r6
            r1 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = "java/lang/Void"
            java.lang.String r3 = "TYPE"
            java.lang.String r4 = "Ljava/lang/Class;"
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Lde
        Ld6:
            r0 = r6
            r1 = r7
            moe.yushi.authlibinjector.internal.org.objectweb.asm.Type r1 = moe.yushi.authlibinjector.internal.org.objectweb.asm.Type.getType(r1)
            r0.visitLdcInsn(r1)
        Lde:
            return
    }

    static void insertMetafactory(moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor r7) {
            r0 = r7
            r1 = 4106(0x100a, float:5.754E-42)
            java.lang.String r2 = "__authlibinjector_metafactory"
            java.lang.String r3 = "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;)Ljava/lang/invoke/CallSite;"
            r4 = 0
            r5 = 0
            moe.yushi.authlibinjector.internal.org.objectweb.asm.MethodVisitor r0 = r0.visitMethod(r1, r2, r3, r4, r5)
            r8 = r0
            r0 = r8
            r0.visitCode()
            r0 = r8
            r1 = 187(0xbb, float:2.62E-43)
            java.lang.String r2 = "java/lang/invoke/ConstantCallSite"
            r0.visitTypeInsn(r1, r2)
            r0 = r8
            r1 = 89
            r0.visitInsn(r1)
            r0 = r8
            r1 = 25
            r2 = 0
            r0.visitVarInsn(r1, r2)
            r0 = r8
            r1 = 184(0xb8, float:2.58E-43)
            java.lang.String r2 = "java/lang/ClassLoader"
            java.lang.String r3 = "getSystemClassLoader"
            java.lang.String r4 = "()Ljava/lang/ClassLoader;"
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r8
            r1 = 25
            r2 = 3
            r0.visitVarInsn(r1, r2)
            r0 = r8
            r1 = 182(0xb6, float:2.55E-43)
            java.lang.String r2 = "java/lang/ClassLoader"
            java.lang.String r3 = "loadClass"
            java.lang.String r4 = "(Ljava/lang/String;)Ljava/lang/Class;"
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r8
            r1 = 25
            r2 = 1
            r0.visitVarInsn(r1, r2)
            r0 = r8
            r1 = 25
            r2 = 2
            r0.visitVarInsn(r1, r2)
            r0 = r8
            r1 = 182(0xb6, float:2.55E-43)
            java.lang.String r2 = "java/lang/invoke/MethodHandles$Lookup"
            java.lang.String r3 = "findStatic"
            java.lang.String r4 = "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;"
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r8
            r1 = 183(0xb7, float:2.56E-43)
            java.lang.String r2 = "java/lang/invoke/ConstantCallSite"
            java.lang.String r3 = "<init>"
            java.lang.String r4 = "(Ljava/lang/invoke/MethodHandle;)V"
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r8
            r1 = 176(0xb0, float:2.47E-43)
            r0.visitInsn(r1)
            r0 = r8
            r1 = -1
            r2 = -1
            r0.visitMaxs(r1, r2)
            r0 = r8
            r0.visitEnd()
            return
    }

    private static /* synthetic */ void lambda$callWithIntermediateMethod$0(java.lang.reflect.Method r7, java.lang.String r8, java.lang.String r9, java.lang.Class r10, java.lang.String r11, moe.yushi.authlibinjector.internal.org.objectweb.asm.ClassVisitor r12) {
            r0 = r7
            int r0 = r0.getParameterCount()
            r13 = r0
            r0 = r7
            java.lang.Class[] r0 = r0.getParameterTypes()
            r14 = r0
            r0 = r7
            java.lang.Class r0 = r0.getReturnType()
            r15 = r0
            r0 = r12
            r1 = 4106(0x100a, float:5.754E-42)
            r2 = r8
            r3 = r9
            r4 = 0
            r5 = 0
            moe.yushi.authlibinjector.internal.org.objectweb.asm.MethodVisitor r0 = r0.visitMethod(r1, r2, r3, r4, r5)
            r16 = r0
            r0 = r16
            r0.visitCode()
            r0 = r16
            r1 = 184(0xb8, float:2.58E-43)
            java.lang.String r2 = "java/lang/invoke/MethodHandles"
            java.lang.String r3 = "publicLookup"
            java.lang.String r4 = "()Ljava/lang/invoke/MethodHandles$Lookup;"
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r16
            r1 = 184(0xb8, float:2.58E-43)
            java.lang.String r2 = "java/lang/ClassLoader"
            java.lang.String r3 = "getSystemClassLoader"
            java.lang.String r4 = "()Ljava/lang/ClassLoader;"
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r16
            r1 = r10
            java.lang.String r1 = r1.getName()
            r0.visitLdcInsn(r1)
            r0 = r16
            r1 = 182(0xb6, float:2.55E-43)
            java.lang.String r2 = "java/lang/ClassLoader"
            java.lang.String r3 = "loadClass"
            java.lang.String r4 = "(Ljava/lang/String;)Ljava/lang/Class;"
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r16
            r1 = r11
            r0.visitLdcInsn(r1)
            r0 = r16
            r1 = r15
            pushType(r0, r1)
            r0 = r16
            r1 = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.visitLdcInsn(r1)
            r0 = r16
            r1 = 189(0xbd, float:2.65E-43)
            java.lang.String r2 = "java/lang/Class"
            r0.visitTypeInsn(r1, r2)
            r0 = 0
            r17 = r0
        L87:
            r0 = r17
            r1 = r13
            if (r0 >= r1) goto Lb6
            r0 = r16
            r1 = 89
            r0.visitInsn(r1)
            r0 = r16
            r1 = r17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.visitLdcInsn(r1)
            r0 = r16
            r1 = r14
            r2 = r17
            r1 = r1[r2]
            pushType(r0, r1)
            r0 = r16
            r1 = 83
            r0.visitInsn(r1)
            int r17 = r17 + 1
            goto L87
        Lb6:
            r0 = r16
            r1 = 184(0xb8, float:2.58E-43)
            java.lang.String r2 = "java/lang/invoke/MethodType"
            java.lang.String r3 = "methodType"
            java.lang.String r4 = "(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;"
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r16
            r1 = 182(0xb6, float:2.55E-43)
            java.lang.String r2 = "java/lang/invoke/MethodHandles$Lookup"
            java.lang.String r3 = "findStatic"
            java.lang.String r4 = "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;"
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = 0
            r17 = r0
        Ldd:
            r0 = r17
            r1 = r13
            if (r0 >= r1) goto L16a
            r0 = r14
            r1 = r17
            r0 = r0[r1]
            r18 = r0
            r0 = r18
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 == r1) goto L113
            r0 = r18
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 == r1) goto L113
            r0 = r18
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 == r1) goto L113
            r0 = r18
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 == r1) goto L113
            r0 = r18
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto L11f
        L113:
            r0 = r16
            r1 = 21
            r2 = r17
            r0.visitVarInsn(r1, r2)
            goto L164
        L11f:
            r0 = r18
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto L133
            r0 = r16
            r1 = 22
            r2 = r17
            r0.visitVarInsn(r1, r2)
            goto L164
        L133:
            r0 = r18
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L147
            r0 = r16
            r1 = 23
            r2 = r17
            r0.visitVarInsn(r1, r2)
            goto L164
        L147:
            r0 = r18
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto L15b
            r0 = r16
            r1 = 24
            r2 = r17
            r0.visitVarInsn(r1, r2)
            goto L164
        L15b:
            r0 = r16
            r1 = 25
            r2 = r17
            r0.visitVarInsn(r1, r2)
        L164:
            int r17 = r17 + 1
            goto Ldd
        L16a:
            r0 = r16
            r1 = 182(0xb6, float:2.55E-43)
            java.lang.String r2 = "java/lang/invoke/MethodHandle"
            java.lang.String r3 = "invokeExact"
            r4 = r9
            r5 = 0
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            r0 = r15
            java.lang.Class r1 = java.lang.Void.TYPE
            if (r0 != r1) goto L18d
            r0 = r16
            r1 = 177(0xb1, float:2.48E-43)
            r0.visitInsn(r1)
            goto L201
        L18d:
            r0 = r15
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 == r1) goto L1b5
            r0 = r15
            java.lang.Class r1 = java.lang.Byte.TYPE
            if (r0 == r1) goto L1b5
            r0 = r15
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 == r1) goto L1b5
            r0 = r15
            java.lang.Class r1 = java.lang.Short.TYPE
            if (r0 == r1) goto L1b5
            r0 = r15
            java.lang.Class r1 = java.lang.Integer.TYPE
            if (r0 != r1) goto L1c0
        L1b5:
            r0 = r16
            r1 = 172(0xac, float:2.41E-43)
            r0.visitInsn(r1)
            goto L201
        L1c0:
            r0 = r15
            java.lang.Class r1 = java.lang.Long.TYPE
            if (r0 != r1) goto L1d3
            r0 = r16
            r1 = 173(0xad, float:2.42E-43)
            r0.visitInsn(r1)
            goto L201
        L1d3:
            r0 = r15
            java.lang.Class r1 = java.lang.Float.TYPE
            if (r0 != r1) goto L1e6
            r0 = r16
            r1 = 174(0xae, float:2.44E-43)
            r0.visitInsn(r1)
            goto L201
        L1e6:
            r0 = r15
            java.lang.Class r1 = java.lang.Double.TYPE
            if (r0 != r1) goto L1f9
            r0 = r16
            r1 = 175(0xaf, float:2.45E-43)
            r0.visitInsn(r1)
            goto L201
        L1f9:
            r0 = r16
            r1 = 176(0xb0, float:2.47E-43)
            r0.visitInsn(r1)
        L201:
            r0 = r16
            r1 = -1
            r2 = -1
            r0.visitMaxs(r1, r2)
            r0 = r16
            r0.visitEnd()
            return
    }
}
