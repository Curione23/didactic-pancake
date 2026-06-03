package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/MemberResolver.class */
public class MemberResolver implements javassist.compiler.TokenId {
    private javassist.ClassPool classPool;
    private static final int YES = 0;
    private static final int NO = -1;
    private static final java.lang.String INVALID = "<invalid>";
    private static java.util.Map<javassist.ClassPool, java.lang.ref.Reference<java.util.Map<java.lang.String, java.lang.String>>> invalidNamesMap;
    private java.util.Map<java.lang.String, java.lang.String> invalidNames;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/MemberResolver$Method.class */
    public static class Method {
        public javassist.CtClass declaring;
        public javassist.bytecode.MethodInfo info;
        public int notmatch;

        public Method(javassist.CtClass r4, javassist.bytecode.MethodInfo r5, int r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.declaring = r1
                r0 = r3
                r1 = r5
                r0.info = r1
                r0 = r3
                r1 = r6
                r0.notmatch = r1
                return
        }

        public boolean isStatic() {
                r3 = this;
                r0 = r3
                javassist.bytecode.MethodInfo r0 = r0.info
                int r0 = r0.getAccessFlags()
                r4 = r0
                r0 = r4
                r1 = 8
                r0 = r0 & r1
                if (r0 == 0) goto L13
                r0 = 1
                goto L14
            L13:
                r0 = 0
            L14:
                return r0
        }
    }

    public MemberResolver(javassist.ClassPool r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.invalidNames = r1
            r0 = r3
            r1 = r4
            r0.classPool = r1
            return
    }

    public javassist.ClassPool getClassPool() {
            r2 = this;
            r0 = r2
            javassist.ClassPool r0 = r0.classPool
            return r0
    }

    private static void fatal() throws javassist.compiler.CompileError {
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.String r2 = "fatal"
            r1.<init>(r2)
            throw r0
    }

    public javassist.compiler.MemberResolver.Method lookupMethod(javassist.CtClass r9, javassist.CtClass r10, javassist.bytecode.MethodInfo r11, java.lang.String r12, int[] r13, int[] r14, java.lang.String[] r15) throws javassist.compiler.CompileError {
            r8 = this;
            r0 = 0
            r16 = r0
            r0 = r11
            if (r0 == 0) goto L47
            r0 = r9
            r1 = r10
            if (r0 != r1) goto L47
            r0 = r11
            java.lang.String r0 = r0.getName()
            r1 = r12
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L47
            r0 = r8
            r1 = r11
            java.lang.String r1 = r1.getDescriptor()
            r2 = r13
            r3 = r14
            r4 = r15
            int r0 = r0.compareSignature(r1, r2, r3, r4)
            r17 = r0
            r0 = r17
            r1 = -1
            if (r0 == r1) goto L47
            javassist.compiler.MemberResolver$Method r0 = new javassist.compiler.MemberResolver$Method
            r1 = r0
            r2 = r9
            r3 = r11
            r4 = r17
            r1.<init>(r2, r3, r4)
            r18 = r0
            r0 = r17
            if (r0 != 0) goto L43
            r0 = r18
            return r0
        L43:
            r0 = r18
            r16 = r0
        L47:
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            if (r6 == 0) goto L5a
            r6 = 1
            goto L5b
        L5a:
            r6 = 0
        L5b:
            javassist.compiler.MemberResolver$Method r0 = r0.lookupMethod(r1, r2, r3, r4, r5, r6)
            r17 = r0
            r0 = r17
            if (r0 == 0) goto L68
            r0 = r17
            return r0
        L68:
            r0 = r16
            return r0
    }

    private javassist.compiler.MemberResolver.Method lookupMethod(javassist.CtClass r9, java.lang.String r10, int[] r11, int[] r12, java.lang.String[] r13, boolean r14) throws javassist.compiler.CompileError {
            r8 = this;
            r0 = 0
            r15 = r0
            r0 = r9
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L8d
            r0 = r16
            java.util.List r0 = r0.getMethods()
            r17 = r0
            r0 = r17
            java.util.Iterator r0 = r0.iterator()
            r18 = r0
        L1e:
            r0 = r18
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L8d
            r0 = r18
            java.lang.Object r0 = r0.next()
            javassist.bytecode.MethodInfo r0 = (javassist.bytecode.MethodInfo) r0
            r19 = r0
            r0 = r19
            java.lang.String r0 = r0.getName()
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L8a
            r0 = r19
            int r0 = r0.getAccessFlags()
            r1 = 64
            r0 = r0 & r1
            if (r0 != 0) goto L8a
            r0 = r8
            r1 = r19
            java.lang.String r1 = r1.getDescriptor()
            r2 = r11
            r3 = r12
            r4 = r13
            int r0 = r0.compareSignature(r1, r2, r3, r4)
            r20 = r0
            r0 = r20
            r1 = -1
            if (r0 == r1) goto L8a
            javassist.compiler.MemberResolver$Method r0 = new javassist.compiler.MemberResolver$Method
            r1 = r0
            r2 = r9
            r3 = r19
            r4 = r20
            r1.<init>(r2, r3, r4)
            r21 = r0
            r0 = r20
            if (r0 != 0) goto L77
            r0 = r21
            return r0
        L77:
            r0 = r15
            if (r0 == 0) goto L86
            r0 = r15
            int r0 = r0.notmatch
            r1 = r20
            if (r0 <= r1) goto L8a
        L86:
            r0 = r21
            r15 = r0
        L8a:
            goto L1e
        L8d:
            r0 = r14
            if (r0 == 0) goto L98
            r0 = 0
            r15 = r0
            goto La0
        L98:
            r0 = r15
            if (r0 == 0) goto La0
            r0 = r15
            return r0
        La0:
            r0 = r9
            int r0 = r0.getModifiers()
            r17 = r0
            r0 = r17
            boolean r0 = javassist.Modifier.isInterface(r0)
            r18 = r0
            r0 = r18
            if (r0 != 0) goto Ld5
            r0 = r9
            javassist.CtClass r0 = r0.getSuperclass()     // Catch: javassist.NotFoundException -> Ld8
            r19 = r0
            r0 = r19
            if (r0 == 0) goto Ld5
            r0 = r8
            r1 = r19
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            javassist.compiler.MemberResolver$Method r0 = r0.lookupMethod(r1, r2, r3, r4, r5, r6)     // Catch: javassist.NotFoundException -> Ld8
            r20 = r0
            r0 = r20
            if (r0 == 0) goto Ld5
            r0 = r20
            return r0
        Ld5:
            goto Lda
        Ld8:
            r19 = move-exception
        Lda:
            r0 = r9
            javassist.CtClass[] r0 = r0.getInterfaces()     // Catch: javassist.NotFoundException -> L143
            r19 = r0
            r0 = r19
            r20 = r0
            r0 = r20
            int r0 = r0.length     // Catch: javassist.NotFoundException -> L143
            r21 = r0
            r0 = 0
            r22 = r0
        Lec:
            r0 = r22
            r1 = r21
            if (r0 >= r1) goto L118
            r0 = r20
            r1 = r22
            r0 = r0[r1]     // Catch: javassist.NotFoundException -> L143
            r23 = r0
            r0 = r8
            r1 = r23
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            javassist.compiler.MemberResolver$Method r0 = r0.lookupMethod(r1, r2, r3, r4, r5, r6)     // Catch: javassist.NotFoundException -> L143
            r24 = r0
            r0 = r24
            if (r0 == 0) goto L112
            r0 = r24
            return r0
        L112:
            int r22 = r22 + 1
            goto Lec
        L118:
            r0 = r18
            if (r0 == 0) goto L140
            r0 = r9
            javassist.CtClass r0 = r0.getSuperclass()     // Catch: javassist.NotFoundException -> L143
            r20 = r0
            r0 = r20
            if (r0 == 0) goto L140
            r0 = r8
            r1 = r20
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            javassist.compiler.MemberResolver$Method r0 = r0.lookupMethod(r1, r2, r3, r4, r5, r6)     // Catch: javassist.NotFoundException -> L143
            r21 = r0
            r0 = r21
            if (r0 == 0) goto L140
            r0 = r21
            return r0
        L140:
            goto L145
        L143:
            r19 = move-exception
        L145:
            r0 = r15
            return r0
    }

    private int compareSignature(java.lang.String r5, int[] r6, int[] r7, java.lang.String[] r8) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = 0
            r9 = r0
            r0 = 1
            r10 = r0
            r0 = r6
            int r0 = r0.length
            r11 = r0
            r0 = r11
            r1 = r5
            int r1 = javassist.bytecode.Descriptor.numOfParameters(r1)
            if (r0 == r1) goto L15
            r0 = -1
            return r0
        L15:
            r0 = r5
            int r0 = r0.length()
            r12 = r0
            r0 = 0
            r13 = r0
        L1e:
            r0 = r10
            r1 = r12
            if (r0 >= r1) goto L17c
            r0 = r5
            r1 = r10
            int r10 = r10 + 1
            char r0 = r0.charAt(r1)
            r14 = r0
            r0 = r14
            r1 = 41
            if (r0 != r1) goto L45
            r0 = r13
            r1 = r11
            if (r0 != r1) goto L43
            r0 = r9
            goto L44
        L43:
            r0 = -1
        L44:
            return r0
        L45:
            r0 = r13
            r1 = r11
            if (r0 < r1) goto L4e
            r0 = -1
            return r0
        L4e:
            r0 = 0
            r15 = r0
        L51:
            r0 = r14
            r1 = 91
            if (r0 != r1) goto L69
            int r15 = r15 + 1
            r0 = r5
            r1 = r10
            int r10 = r10 + 1
            char r0 = r0.charAt(r1)
            r14 = r0
            goto L51
        L69:
            r0 = r6
            r1 = r13
            r0 = r0[r1]
            r1 = 412(0x19c, float:5.77E-43)
            if (r0 != r1) goto L97
            r0 = r15
            if (r0 != 0) goto L81
            r0 = r14
            r1 = 76
            if (r0 == r1) goto L81
            r0 = -1
            return r0
        L81:
            r0 = r14
            r1 = 76
            if (r0 != r1) goto L176
            r0 = r5
            r1 = 59
            r2 = r10
            int r0 = r0.indexOf(r1, r2)
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
            goto L176
        L97:
            r0 = r7
            r1 = r13
            r0 = r0[r1]
            r1 = r15
            if (r0 == r1) goto Lcf
            r0 = r15
            if (r0 != 0) goto Lb7
            r0 = r14
            r1 = 76
            if (r0 != r1) goto Lb7
            r0 = r5
            java.lang.String r1 = "java/lang/Object;"
            r2 = r10
            boolean r0 = r0.startsWith(r1, r2)
            if (r0 != 0) goto Lb9
        Lb7:
            r0 = -1
            return r0
        Lb9:
            r0 = r5
            r1 = 59
            r2 = r10
            int r0 = r0.indexOf(r1, r2)
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
            int r9 = r9 + 1
            r0 = r10
            if (r0 > 0) goto L176
            r0 = -1
            return r0
        Lcf:
            r0 = r14
            r1 = 76
            if (r0 != r1) goto L13a
            r0 = r5
            r1 = 59
            r2 = r10
            int r0 = r0.indexOf(r1, r2)
            r16 = r0
            r0 = r16
            if (r0 < 0) goto Lef
            r0 = r6
            r1 = r13
            r0 = r0[r1]
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto Lf1
        Lef:
            r0 = -1
            return r0
        Lf1:
            r0 = r5
            r1 = r10
            r2 = r16
            java.lang.String r0 = r0.substring(r1, r2)
            r17 = r0
            r0 = r17
            r1 = r8
            r2 = r13
            r1 = r1[r2]
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L131
            r0 = r4
            r1 = r8
            r2 = r13
            r1 = r1[r2]
            javassist.CtClass r0 = r0.lookupClassByJvmName(r1)
            r18 = r0
            r0 = r18
            r1 = r4
            r2 = r17
            javassist.CtClass r1 = r1.lookupClassByJvmName(r2)     // Catch: javassist.NotFoundException -> L12c
            boolean r0 = r0.subtypeOf(r1)     // Catch: javassist.NotFoundException -> L12c
            if (r0 == 0) goto L127
            int r9 = r9 + 1
            goto L129
        L127:
            r0 = -1
            return r0
        L129:
            goto L131
        L12c:
            r19 = move-exception
            int r9 = r9 + 1
        L131:
            r0 = r16
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
            goto L176
        L13a:
            r0 = r14
            int r0 = descToType(r0)
            r16 = r0
            r0 = r6
            r1 = r13
            r0 = r0[r1]
            r17 = r0
            r0 = r16
            r1 = r17
            if (r0 == r1) goto L176
            r0 = r16
            r1 = 324(0x144, float:4.54E-43)
            if (r0 != r1) goto L174
            r0 = r17
            r1 = 334(0x14e, float:4.68E-43)
            if (r0 == r1) goto L16e
            r0 = r17
            r1 = 303(0x12f, float:4.25E-43)
            if (r0 == r1) goto L16e
            r0 = r17
            r1 = 306(0x132, float:4.29E-43)
            if (r0 != r1) goto L174
        L16e:
            int r9 = r9 + 1
            goto L176
        L174:
            r0 = -1
            return r0
        L176:
            int r13 = r13 + 1
            goto L1e
        L17c:
            r0 = -1
            return r0
    }

    public javassist.CtField lookupFieldByJvmName2(java.lang.String r6, javassist.compiler.ast.Symbol r7, javassist.compiler.ast.ASTree r8) throws javassist.compiler.NoFieldException {
            r5 = this;
            r0 = r7
            java.lang.String r0 = r0.get()
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r5
            r1 = r6
            java.lang.String r1 = jvmToJavaName(r1)     // Catch: javassist.compiler.CompileError -> L17
            r2 = 1
            javassist.CtClass r0 = r0.lookupClass(r1, r2)     // Catch: javassist.compiler.CompileError -> L17
            r10 = r0
            goto L3a
        L17:
            r11 = move-exception
            javassist.compiler.NoFieldException r0 = new javassist.compiler.NoFieldException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "/"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r8
            r1.<init>(r2, r3)
            throw r0
        L3a:
            r0 = r10
            r1 = r9
            javassist.CtField r0 = r0.getField(r1)     // Catch: javassist.NotFoundException -> L42
            return r0
        L42:
            r11 = move-exception
            r0 = r10
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = javaToJvmName(r0)
            r6 = r0
            javassist.compiler.NoFieldException r0 = new javassist.compiler.NoFieldException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "$"
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r9
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r8
            r1.<init>(r2, r3)
            throw r0
    }

    public javassist.CtField lookupFieldByJvmName(java.lang.String r5, javassist.compiler.ast.Symbol r6) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.String r1 = jvmToJavaName(r1)
            r2 = r6
            javassist.CtField r0 = r0.lookupField(r1, r2)
            return r0
    }

    public javassist.CtField lookupField(java.lang.String r6, javassist.compiler.ast.Symbol r7) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            javassist.CtClass r0 = r0.lookupClass(r1, r2)
            r8 = r0
            r0 = r8
            r1 = r7
            java.lang.String r1 = r1.get()     // Catch: javassist.NotFoundException -> L10
            javassist.CtField r0 = r0.getField(r1)     // Catch: javassist.NotFoundException -> L10
            return r0
        L10:
            r9 = move-exception
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "no such field: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.String r3 = r3.get()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public javassist.CtClass lookupClassByName(javassist.compiler.ast.ASTList r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 46
            java.lang.String r1 = javassist.compiler.ast.Declarator.astToClassName(r1, r2)
            r2 = 0
            javassist.CtClass r0 = r0.lookupClass(r1, r2)
            return r0
    }

    public javassist.CtClass lookupClassByJvmName(java.lang.String r5) throws javassist.compiler.CompileError {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.String r1 = jvmToJavaName(r1)
            r2 = 0
            javassist.CtClass r0 = r0.lookupClass(r1, r2)
            return r0
    }

    public javassist.CtClass lookupClass(javassist.compiler.ast.Declarator r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            r1 = r6
            int r1 = r1.getType()
            r2 = r6
            int r2 = r2.getArrayDim()
            r3 = r6
            java.lang.String r3 = r3.getClassName()
            javassist.CtClass r0 = r0.lookupClass(r1, r2, r3)
            return r0
    }

    public javassist.CtClass lookupClass(int r5, int r6, java.lang.String r7) throws javassist.compiler.CompileError {
            r4 = this;
            java.lang.String r0 = ""
            r8 = r0
            r0 = r5
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto L23
            r0 = r4
            r1 = r7
            javassist.CtClass r0 = r0.lookupClassByJvmName(r1)
            r9 = r0
            r0 = r6
            if (r0 <= 0) goto L20
            r0 = r9
            java.lang.String r0 = r0.getName()
            r8 = r0
            goto L29
        L20:
            r0 = r9
            return r0
        L23:
            r0 = r5
            java.lang.String r0 = getTypeName(r0)
            r8 = r0
        L29:
            r0 = r6
            int r6 = r6 + (-1)
            if (r0 <= 0) goto L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "[]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8 = r0
            goto L29
        L49:
            r0 = r4
            r1 = r8
            r2 = 0
            javassist.CtClass r0 = r0.lookupClass(r1, r2)
            return r0
    }

    static java.lang.String getTypeName(int r2) throws javassist.compiler.CompileError {
            java.lang.String r0 = ""
            r3 = r0
            r0 = r2
            switch(r0) {
                case 301: goto L58;
                case 303: goto L64;
                case 306: goto L5e;
                case 312: goto L82;
                case 317: goto L7c;
                case 324: goto L70;
                case 326: goto L76;
                case 334: goto L6a;
                case 344: goto L88;
                default: goto L8e;
            }
        L58:
            java.lang.String r0 = "boolean"
            r3 = r0
            goto L91
        L5e:
            java.lang.String r0 = "char"
            r3 = r0
            goto L91
        L64:
            java.lang.String r0 = "byte"
            r3 = r0
            goto L91
        L6a:
            java.lang.String r0 = "short"
            r3 = r0
            goto L91
        L70:
            java.lang.String r0 = "int"
            r3 = r0
            goto L91
        L76:
            java.lang.String r0 = "long"
            r3 = r0
            goto L91
        L7c:
            java.lang.String r0 = "float"
            r3 = r0
            goto L91
        L82:
            java.lang.String r0 = "double"
            r3 = r0
            goto L91
        L88:
            java.lang.String r0 = "void"
            r3 = r0
            goto L91
        L8e:
            fatal()
        L91:
            r0 = r3
            return r0
    }

    public javassist.CtClass lookupClass(java.lang.String r6, boolean r7) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r5
            java.util.Map r0 = r0.getInvalidNames()
            r8 = r0
            r0 = r8
            r1 = r6
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r9
            java.lang.String r1 = "<invalid>"
            if (r0 != r1) goto L33
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "no such class: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L33:
            r0 = r9
            if (r0 == 0) goto L44
            r0 = r5
            javassist.ClassPool r0 = r0.classPool     // Catch: javassist.NotFoundException -> L42
            r1 = r9
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> L42
            return r0
        L42:
            r10 = move-exception
        L44:
            r0 = 0
            r10 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            javassist.CtClass r0 = r0.lookupClass0(r1, r2)     // Catch: javassist.NotFoundException -> L52
            r10 = r0
            goto L5b
        L52:
            r11 = move-exception
            r0 = r5
            r1 = r6
            javassist.CtClass r0 = r0.searchImports(r1)
            r10 = r0
        L5b:
            r0 = r8
            r1 = r6
            r2 = r10
            java.lang.String r2 = r2.getName()
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r10
            return r0
    }

    public static int getInvalidMapSize() {
            java.util.Map<javassist.ClassPool, java.lang.ref.Reference<java.util.Map<java.lang.String, java.lang.String>>> r0 = javassist.compiler.MemberResolver.invalidNamesMap
            int r0 = r0.size()
            return r0
    }

    private java.util.Map<java.lang.String, java.lang.String> getInvalidNames() {
            r6 = this;
            r0 = r6
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.invalidNames
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L5c
            java.lang.Class<javassist.compiler.MemberResolver> r0 = javassist.compiler.MemberResolver.class
            r1 = r0
            r8 = r1
            monitor-enter(r0)
            java.util.Map<javassist.ClassPool, java.lang.ref.Reference<java.util.Map<java.lang.String, java.lang.String>>> r0 = javassist.compiler.MemberResolver.invalidNamesMap     // Catch: java.lang.Throwable -> L50
            r1 = r6
            javassist.ClassPool r1 = r1.classPool     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0     // Catch: java.lang.Throwable -> L50
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L2a
            r0 = r9
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L50
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> L50
            r7 = r0
        L2a:
            r0 = r7
            if (r0 != 0) goto L4b
            java.util.Hashtable r0 = new java.util.Hashtable     // Catch: java.lang.Throwable -> L50
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L50
            r7 = r0
            java.util.Map<javassist.ClassPool, java.lang.ref.Reference<java.util.Map<java.lang.String, java.lang.String>>> r0 = javassist.compiler.MemberResolver.invalidNamesMap     // Catch: java.lang.Throwable -> L50
            r1 = r6
            javassist.ClassPool r1 = r1.classPool     // Catch: java.lang.Throwable -> L50
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L50
            r3 = r2
            r4 = r7
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L50
        L4b:
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            goto L57
        L50:
            r10 = move-exception
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            r0 = r10
            throw r0
        L57:
            r0 = r6
            r1 = r7
            r0.invalidNames = r1
        L5c:
            r0 = r7
            return r0
    }

    private javassist.CtClass searchImports(java.lang.String r6) throws javassist.compiler.CompileError {
            r5 = this;
            r0 = r6
            r1 = 46
            int r0 = r0.indexOf(r1)
            if (r0 >= 0) goto L7e
            r0 = r5
            javassist.ClassPool r0 = r0.classPool
            java.util.Iterator r0 = r0.getImportedPackages()
            r7 = r0
        L11:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L7e
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r8
            java.lang.String r2 = "\\.$"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.replaceAll(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9 = r0
            r0 = r5
            javassist.ClassPool r0 = r0.classPool     // Catch: javassist.NotFoundException -> L50
            r1 = r9
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> L50
            return r0
        L50:
            r10 = move-exception
            r0 = r8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: javassist.NotFoundException -> L79
            r2 = r1
            r2.<init>()     // Catch: javassist.NotFoundException -> L79
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: javassist.NotFoundException -> L79
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: javassist.NotFoundException -> L79
            java.lang.String r1 = r1.toString()     // Catch: javassist.NotFoundException -> L79
            boolean r0 = r0.endsWith(r1)     // Catch: javassist.NotFoundException -> L79
            if (r0 == 0) goto L76
            r0 = r5
            javassist.ClassPool r0 = r0.classPool     // Catch: javassist.NotFoundException -> L79
            r1 = r8
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> L79
            return r0
        L76:
            goto L7b
        L79:
            r11 = move-exception
        L7b:
            goto L11
        L7e:
            r0 = r5
            java.util.Map r0 = r0.getInvalidNames()
            r1 = r6
            java.lang.String r2 = "<invalid>"
            java.lang.Object r0 = r0.put(r1, r2)
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "no such class: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private javassist.CtClass lookupClass0(java.lang.String r5, boolean r6) throws javassist.NotFoundException {
            r4 = this;
            r0 = 0
            r7 = r0
        L2:
            r0 = r4
            javassist.ClassPool r0 = r0.classPool     // Catch: javassist.NotFoundException -> Le
            r1 = r5
            javassist.CtClass r0 = r0.get(r1)     // Catch: javassist.NotFoundException -> Le
            r7 = r0
            goto L3d
        Le:
            r8 = move-exception
            r0 = r5
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r9 = r0
            r0 = r6
            if (r0 != 0) goto L21
            r0 = r9
            if (r0 >= 0) goto L24
        L21:
            r0 = r8
            throw r0
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r10 = r0
            r0 = r10
            r1 = r9
            r2 = 36
            r0.setCharAt(r1, r2)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r5 = r0
        L3d:
            r0 = r7
            if (r0 == 0) goto L2
            r0 = r7
            return r0
    }

    public java.lang.String resolveClassName(javassist.compiler.ast.ASTList r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r3
            r1 = r4
            javassist.CtClass r0 = r0.lookupClassByName(r1)
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = javaToJvmName(r0)
            return r0
    }

    public java.lang.String resolveJvmClassName(java.lang.String r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r3
            r1 = r4
            javassist.CtClass r0 = r0.lookupClassByJvmName(r1)
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = javaToJvmName(r0)
            return r0
    }

    public static javassist.CtClass getSuperclass(javassist.CtClass r5) throws javassist.compiler.CompileError {
            r0 = r5
            javassist.CtClass r0 = r0.getSuperclass()     // Catch: javassist.NotFoundException -> Le
            r6 = r0
            r0 = r6
            if (r0 == 0) goto Lb
            r0 = r6
            return r0
        Lb:
            goto Lf
        Le:
            r6 = move-exception
        Lf:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "cannot find the super class of "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public static javassist.CtClass getSuperInterface(javassist.CtClass r5, java.lang.String r6) throws javassist.compiler.CompileError {
            r0 = r5
            javassist.CtClass[] r0 = r0.getInterfaces()     // Catch: javassist.NotFoundException -> L27
            r7 = r0
            r0 = 0
            r8 = r0
        L7:
            r0 = r8
            r1 = r7
            int r1 = r1.length     // Catch: javassist.NotFoundException -> L27
            if (r0 >= r1) goto L24
            r0 = r7
            r1 = r8
            r0 = r0[r1]     // Catch: javassist.NotFoundException -> L27
            java.lang.String r0 = r0.getName()     // Catch: javassist.NotFoundException -> L27
            r1 = r6
            boolean r0 = r0.equals(r1)     // Catch: javassist.NotFoundException -> L27
            if (r0 == 0) goto L1e
            r0 = r7
            r1 = r8
            r0 = r0[r1]     // Catch: javassist.NotFoundException -> L27
            return r0
        L1e:
            int r8 = r8 + 1
            goto L7
        L24:
            goto L28
        L27:
            r7 = move-exception
        L28:
            javassist.compiler.CompileError r0 = new javassist.compiler.CompileError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "cannot find the super interface "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " of "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public static java.lang.String javaToJvmName(java.lang.String r4) {
            r0 = r4
            r1 = 46
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    public static java.lang.String jvmToJavaName(java.lang.String r4) {
            r0 = r4
            r1 = 47
            r2 = 46
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    public static int descToType(char r2) throws javassist.compiler.CompileError {
            r0 = r2
            switch(r0) {
                case 66: goto L80;
                case 67: goto L7c;
                case 68: goto L94;
                case 69: goto La0;
                case 70: goto L90;
                case 71: goto La0;
                case 72: goto La0;
                case 73: goto L88;
                case 74: goto L8c;
                case 75: goto La0;
                case 76: goto L9c;
                case 77: goto La0;
                case 78: goto La0;
                case 79: goto La0;
                case 80: goto La0;
                case 81: goto La0;
                case 82: goto La0;
                case 83: goto L84;
                case 84: goto La0;
                case 85: goto La0;
                case 86: goto L98;
                case 87: goto La0;
                case 88: goto La0;
                case 89: goto La0;
                case 90: goto L78;
                case 91: goto L9c;
                default: goto La0;
            }
        L78:
            r0 = 301(0x12d, float:4.22E-43)
            return r0
        L7c:
            r0 = 306(0x132, float:4.29E-43)
            return r0
        L80:
            r0 = 303(0x12f, float:4.25E-43)
            return r0
        L84:
            r0 = 334(0x14e, float:4.68E-43)
            return r0
        L88:
            r0 = 324(0x144, float:4.54E-43)
            return r0
        L8c:
            r0 = 326(0x146, float:4.57E-43)
            return r0
        L90:
            r0 = 317(0x13d, float:4.44E-43)
            return r0
        L94:
            r0 = 312(0x138, float:4.37E-43)
            return r0
        L98:
            r0 = 344(0x158, float:4.82E-43)
            return r0
        L9c:
            r0 = 307(0x133, float:4.3E-43)
            return r0
        La0:
            fatal()
            r0 = 344(0x158, float:4.82E-43)
            return r0
    }

    public static int getModifiers(javassist.compiler.ast.ASTList r3) {
            r0 = 0
            r4 = r0
        L2:
            r0 = r3
            if (r0 == 0) goto Lc0
            r0 = r3
            javassist.compiler.ast.ASTree r0 = r0.head()
            javassist.compiler.ast.Keyword r0 = (javassist.compiler.ast.Keyword) r0
            r5 = r0
            r0 = r3
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r3 = r0
            r0 = r5
            int r0 = r0.get()
            switch(r0) {
                case 300: goto L88;
                case 315: goto L78;
                case 330: goto L9f;
                case 331: goto L98;
                case 332: goto L91;
                case 335: goto L70;
                case 338: goto L80;
                case 342: goto Lae;
                case 345: goto La6;
                case 347: goto Lb7;
                default: goto Lbd;
            }
        L70:
            r0 = r4
            r1 = 8
            r0 = r0 | r1
            r4 = r0
            goto Lbd
        L78:
            r0 = r4
            r1 = 16
            r0 = r0 | r1
            r4 = r0
            goto Lbd
        L80:
            r0 = r4
            r1 = 32
            r0 = r0 | r1
            r4 = r0
            goto Lbd
        L88:
            r0 = r4
            r1 = 1024(0x400, float:1.435E-42)
            r0 = r0 | r1
            r4 = r0
            goto Lbd
        L91:
            r0 = r4
            r1 = 1
            r0 = r0 | r1
            r4 = r0
            goto Lbd
        L98:
            r0 = r4
            r1 = 4
            r0 = r0 | r1
            r4 = r0
            goto Lbd
        L9f:
            r0 = r4
            r1 = 2
            r0 = r0 | r1
            r4 = r0
            goto Lbd
        La6:
            r0 = r4
            r1 = 64
            r0 = r0 | r1
            r4 = r0
            goto Lbd
        Lae:
            r0 = r4
            r1 = 128(0x80, float:1.8E-43)
            r0 = r0 | r1
            r4 = r0
            goto Lbd
        Lb7:
            r0 = r4
            r1 = 2048(0x800, float:2.87E-42)
            r0 = r0 | r1
            r4 = r0
        Lbd:
            goto L2
        Lc0:
            r0 = r4
            return r0
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = r0
            r1.<init>()
            javassist.compiler.MemberResolver.invalidNamesMap = r0
            return
    }
}
