package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtNewConstructor.class */
public class CtNewConstructor {
    public static final int PASS_NONE = 0;
    public static final int PASS_ARRAY = 1;
    public static final int PASS_PARAMS = 2;

    public CtNewConstructor() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static javassist.CtConstructor make(java.lang.String r4, javassist.CtClass r5) throws javassist.CannotCompileException {
            javassist.compiler.Javac r0 = new javassist.compiler.Javac
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r6
            r1 = r4
            javassist.CtMember r0 = r0.compile(r1)     // Catch: javassist.compiler.CompileError -> L1e
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof javassist.CtConstructor     // Catch: javassist.compiler.CompileError -> L1e
            if (r0 == 0) goto L1b
            r0 = r7
            javassist.CtConstructor r0 = (javassist.CtConstructor) r0     // Catch: javassist.compiler.CompileError -> L1e
            return r0
        L1b:
            goto L28
        L1e:
            r7 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            throw r0
        L28:
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "not a constructor"
            r1.<init>(r2)
            throw r0
    }

    public static javassist.CtConstructor make(javassist.CtClass[] r5, javassist.CtClass[] r6, java.lang.String r7, javassist.CtClass r8) throws javassist.CannotCompileException {
            javassist.CtConstructor r0 = new javassist.CtConstructor     // Catch: javassist.NotFoundException -> L1a
            r1 = r0
            r2 = r5
            r3 = r8
            r1.<init>(r2, r3)     // Catch: javassist.NotFoundException -> L1a
            r9 = r0
            r0 = r9
            r1 = r6
            r0.setExceptionTypes(r1)     // Catch: javassist.NotFoundException -> L1a
            r0 = r9
            r1 = r7
            r0.setBody(r1)     // Catch: javassist.NotFoundException -> L1a
            r0 = r9
            return r0
        L1a:
            r9 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r9
            r1.<init>(r2)
            throw r0
    }

    public static javassist.CtConstructor copy(javassist.CtConstructor r6, javassist.CtClass r7, javassist.ClassMap r8) throws javassist.CannotCompileException {
            javassist.CtConstructor r0 = new javassist.CtConstructor
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            return r0
    }

    public static javassist.CtConstructor defaultConstructor(javassist.CtClass r6) throws javassist.CannotCompileException {
            javassist.CtConstructor r0 = new javassist.CtConstructor
            r1 = r0
            r2 = 0
            javassist.CtClass[] r2 = (javassist.CtClass[]) r2
            r3 = r6
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r8 = r0
            javassist.bytecode.Bytecode r0 = new javassist.bytecode.Bytecode
            r1 = r0
            r2 = r8
            r3 = 1
            r4 = 1
            r1.<init>(r2, r3, r4)
            r9 = r0
            r0 = r9
            r1 = 0
            r0.addAload(r1)
            r0 = r9
            r1 = r6
            javassist.CtClass r1 = r1.getSuperclass()     // Catch: javassist.NotFoundException -> L34
            java.lang.String r2 = "<init>"
            java.lang.String r3 = "()V"
            r0.addInvokespecial(r1, r2, r3)     // Catch: javassist.NotFoundException -> L34
            goto L40
        L34:
            r10 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            throw r0
        L40:
            r0 = r9
            r1 = 177(0xb1, float:2.48E-43)
            r0.add(r1)
            r0 = r7
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo2()
            r1 = r9
            javassist.bytecode.CodeAttribute r1 = r1.toCodeAttribute()
            r0.setCodeAttribute(r1)
            r0 = r7
            return r0
    }

    public static javassist.CtConstructor skeleton(javassist.CtClass[] r7, javassist.CtClass[] r8, javassist.CtClass r9) throws javassist.CannotCompileException {
            r0 = r7
            r1 = r8
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r9
            javassist.CtConstructor r0 = make(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static javassist.CtConstructor make(javassist.CtClass[] r7, javassist.CtClass[] r8, javassist.CtClass r9) throws javassist.CannotCompileException {
            r0 = r7
            r1 = r8
            r2 = 2
            r3 = 0
            r4 = 0
            r5 = r9
            javassist.CtConstructor r0 = make(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static javassist.CtConstructor make(javassist.CtClass[] r7, javassist.CtClass[] r8, int r9, javassist.CtMethod r10, javassist.CtMethod.ConstParameter r11, javassist.CtClass r12) throws javassist.CannotCompileException {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            javassist.CtConstructor r0 = javassist.CtNewWrappedConstructor.wrapped(r0, r1, r2, r3, r4, r5)
            return r0
    }
}
