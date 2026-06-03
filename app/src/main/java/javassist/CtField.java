package javassist;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtField.class */
public class CtField extends javassist.CtMember {
    static final java.lang.String javaLangString = "java.lang.String";
    protected javassist.bytecode.FieldInfo fieldInfo;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtField$ArrayInitializer.class */
    static class ArrayInitializer extends javassist.CtField.Initializer {
        javassist.CtClass type;
        int size;

        ArrayInitializer(javassist.CtClass r4, int r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.type = r1
                r0 = r3
                r1 = r5
                r0.size = r1
                return
        }

        private void addNewarray(javassist.bytecode.Bytecode r5) {
                r4 = this;
                r0 = r4
                javassist.CtClass r0 = r0.type
                boolean r0 = r0.isPrimitive()
                if (r0 == 0) goto L1f
                r0 = r5
                r1 = r4
                javassist.CtClass r1 = r1.type
                javassist.CtPrimitiveType r1 = (javassist.CtPrimitiveType) r1
                int r1 = r1.getArrayType()
                r2 = r4
                int r2 = r2.size
                r0.addNewarray(r1, r2)
                goto L2b
            L1f:
                r0 = r5
                r1 = r4
                javassist.CtClass r1 = r1.type
                r2 = r4
                int r2 = r2.size
                r0.addAnewarray(r1, r2)
            L2b:
                return
        }

        @Override // javassist.CtField.Initializer
        int compile(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.CtClass[] r9, javassist.compiler.Javac r10) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = 0
                r0.addAload(r1)
                r0 = r5
                r1 = r8
                r0.addNewarray(r1)
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutfield(r1, r2, r3)
                r0 = 2
                return r0
        }

        @Override // javassist.CtField.Initializer
        int compileIfStatic(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.compiler.Javac r9) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r5
                r1 = r8
                r0.addNewarray(r1)
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutstatic(r1, r2, r3)
                r0 = 1
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtField$CodeInitializer.class */
    static class CodeInitializer extends javassist.CtField.CodeInitializer0 {
        private java.lang.String expression;

        CodeInitializer(java.lang.String r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.expression = r1
                return
        }

        @Override // javassist.CtField.CodeInitializer0
        void compileExpr(javassist.compiler.Javac r4) throws javassist.compiler.CompileError {
                r3 = this;
                r0 = r4
                r1 = r3
                java.lang.String r1 = r1.expression
                r0.compileExpr(r1)
                return
        }

        @Override // javassist.CtField.Initializer
        int getConstantValue(javassist.bytecode.ConstPool r6, javassist.CtClass r7) {
                r5 = this;
                r0 = r5
                java.lang.String r0 = r0.expression     // Catch: javassist.compiler.CompileError -> L17
                javassist.compiler.SymbolTable r1 = new javassist.compiler.SymbolTable     // Catch: javassist.compiler.CompileError -> L17
                r2 = r1
                r2.<init>()     // Catch: javassist.compiler.CompileError -> L17
                javassist.compiler.ast.ASTree r0 = javassist.compiler.Javac.parseExpr(r0, r1)     // Catch: javassist.compiler.CompileError -> L17
                r8 = r0
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                int r0 = r0.getConstantValue2(r1, r2, r3)     // Catch: javassist.compiler.CompileError -> L17
                return r0
            L17:
                r8 = move-exception
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtField$CodeInitializer0.class */
    static abstract class CodeInitializer0 extends javassist.CtField.Initializer {
        CodeInitializer0() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        abstract void compileExpr(javassist.compiler.Javac r1) throws javassist.compiler.CompileError;

        @Override // javassist.CtField.Initializer
        int compile(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.CtClass[] r9, javassist.compiler.Javac r10) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = 0
                r0.addAload(r1)     // Catch: javassist.compiler.CompileError -> L1c
                r0 = r5
                r1 = r10
                r0.compileExpr(r1)     // Catch: javassist.compiler.CompileError -> L1c
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS     // Catch: javassist.compiler.CompileError -> L1c
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)     // Catch: javassist.compiler.CompileError -> L1c
                r0.addPutfield(r1, r2, r3)     // Catch: javassist.compiler.CompileError -> L1c
                r0 = r8
                int r0 = r0.getMaxStack()     // Catch: javassist.compiler.CompileError -> L1c
                return r0
            L1c:
                r11 = move-exception
                javassist.CannotCompileException r0 = new javassist.CannotCompileException
                r1 = r0
                r2 = r11
                r1.<init>(r2)
                throw r0
        }

        @Override // javassist.CtField.Initializer
        int compileIfStatic(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.compiler.Javac r9) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r5
                r1 = r9
                r0.compileExpr(r1)     // Catch: javassist.compiler.CompileError -> L17
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS     // Catch: javassist.compiler.CompileError -> L17
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)     // Catch: javassist.compiler.CompileError -> L17
                r0.addPutstatic(r1, r2, r3)     // Catch: javassist.compiler.CompileError -> L17
                r0 = r8
                int r0 = r0.getMaxStack()     // Catch: javassist.compiler.CompileError -> L17
                return r0
            L17:
                r10 = move-exception
                javassist.CannotCompileException r0 = new javassist.CannotCompileException
                r1 = r0
                r2 = r10
                r1.<init>(r2)
                throw r0
        }

        int getConstantValue2(javassist.bytecode.ConstPool r5, javassist.CtClass r6, javassist.compiler.ast.ASTree r7) {
                r4 = this;
                r0 = r6
                boolean r0 = r0.isPrimitive()
                if (r0 == 0) goto L85
                r0 = r7
                boolean r0 = r0 instanceof javassist.compiler.ast.IntConst
                if (r0 == 0) goto L55
                r0 = r7
                javassist.compiler.ast.IntConst r0 = (javassist.compiler.ast.IntConst) r0
                long r0 = r0.get()
                r8 = r0
                r0 = r6
                javassist.CtClass r1 = javassist.CtClass.doubleType
                if (r0 != r1) goto L26
                r0 = r5
                r1 = r8
                double r1 = (double) r1
                int r0 = r0.addDoubleInfo(r1)
                return r0
            L26:
                r0 = r6
                javassist.CtClass r1 = javassist.CtClass.floatType
                if (r0 != r1) goto L35
                r0 = r5
                r1 = r8
                float r1 = (float) r1
                int r0 = r0.addFloatInfo(r1)
                return r0
            L35:
                r0 = r6
                javassist.CtClass r1 = javassist.CtClass.longType
                if (r0 != r1) goto L43
                r0 = r5
                r1 = r8
                int r0 = r0.addLongInfo(r1)
                return r0
            L43:
                r0 = r6
                javassist.CtClass r1 = javassist.CtClass.voidType
                if (r0 == r1) goto L52
                r0 = r5
                r1 = r8
                int r1 = (int) r1
                int r0 = r0.addIntegerInfo(r1)
                return r0
            L52:
                goto La4
            L55:
                r0 = r7
                boolean r0 = r0 instanceof javassist.compiler.ast.DoubleConst
                if (r0 == 0) goto La4
                r0 = r7
                javassist.compiler.ast.DoubleConst r0 = (javassist.compiler.ast.DoubleConst) r0
                double r0 = r0.get()
                r8 = r0
                r0 = r6
                javassist.CtClass r1 = javassist.CtClass.floatType
                if (r0 != r1) goto L74
                r0 = r5
                r1 = r8
                float r1 = (float) r1
                int r0 = r0.addFloatInfo(r1)
                return r0
            L74:
                r0 = r6
                javassist.CtClass r1 = javassist.CtClass.doubleType
                if (r0 != r1) goto L82
                r0 = r5
                r1 = r8
                int r0 = r0.addDoubleInfo(r1)
                return r0
            L82:
                goto La4
            L85:
                r0 = r7
                boolean r0 = r0 instanceof javassist.compiler.ast.StringL
                if (r0 == 0) goto La4
                r0 = r6
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "java.lang.String"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto La4
                r0 = r5
                r1 = r7
                javassist.compiler.ast.StringL r1 = (javassist.compiler.ast.StringL) r1
                java.lang.String r1 = r1.get()
                int r0 = r0.addStringInfo(r1)
                return r0
            La4:
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtField$DoubleInitializer.class */
    static class DoubleInitializer extends javassist.CtField.Initializer {
        double value;

        DoubleInitializer(double r5) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.value = r1
                return
        }

        @Override // javassist.CtField.Initializer
        void check(java.lang.String r5) throws javassist.CannotCompileException {
                r4 = this;
                r0 = r5
                java.lang.String r1 = "D"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L13
                javassist.CannotCompileException r0 = new javassist.CannotCompileException
                r1 = r0
                java.lang.String r2 = "type mismatch"
                r1.<init>(r2)
                throw r0
            L13:
                return
        }

        @Override // javassist.CtField.Initializer
        int compile(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.CtClass[] r9, javassist.compiler.Javac r10) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = 0
                r0.addAload(r1)
                r0 = r8
                r1 = r5
                double r1 = r1.value
                r0.addLdc2w(r1)
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutfield(r1, r2, r3)
                r0 = 3
                return r0
        }

        @Override // javassist.CtField.Initializer
        int compileIfStatic(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.compiler.Javac r9) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = r5
                double r1 = r1.value
                r0.addLdc2w(r1)
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutstatic(r1, r2, r3)
                r0 = 2
                return r0
        }

        @Override // javassist.CtField.Initializer
        int getConstantValue(javassist.bytecode.ConstPool r5, javassist.CtClass r6) {
                r4 = this;
                r0 = r6
                javassist.CtClass r1 = javassist.CtClass.doubleType
                if (r0 != r1) goto L10
                r0 = r5
                r1 = r4
                double r1 = r1.value
                int r0 = r0.addDoubleInfo(r1)
                return r0
            L10:
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtField$FloatInitializer.class */
    static class FloatInitializer extends javassist.CtField.Initializer {
        float value;

        FloatInitializer(float r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.value = r1
                return
        }

        @Override // javassist.CtField.Initializer
        void check(java.lang.String r5) throws javassist.CannotCompileException {
                r4 = this;
                r0 = r5
                java.lang.String r1 = "F"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L13
                javassist.CannotCompileException r0 = new javassist.CannotCompileException
                r1 = r0
                java.lang.String r2 = "type mismatch"
                r1.<init>(r2)
                throw r0
            L13:
                return
        }

        @Override // javassist.CtField.Initializer
        int compile(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.CtClass[] r9, javassist.compiler.Javac r10) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = 0
                r0.addAload(r1)
                r0 = r8
                r1 = r5
                float r1 = r1.value
                r0.addFconst(r1)
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutfield(r1, r2, r3)
                r0 = 3
                return r0
        }

        @Override // javassist.CtField.Initializer
        int compileIfStatic(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.compiler.Javac r9) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = r5
                float r1 = r1.value
                r0.addFconst(r1)
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutstatic(r1, r2, r3)
                r0 = 2
                return r0
        }

        @Override // javassist.CtField.Initializer
        int getConstantValue(javassist.bytecode.ConstPool r4, javassist.CtClass r5) {
                r3 = this;
                r0 = r5
                javassist.CtClass r1 = javassist.CtClass.floatType
                if (r0 != r1) goto L10
                r0 = r4
                r1 = r3
                float r1 = r1.value
                int r0 = r0.addFloatInfo(r1)
                return r0
            L10:
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtField$Initializer.class */
    public static abstract class Initializer {
        public Initializer() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public static javassist.CtField.Initializer constant(int r4) {
                javassist.CtField$IntInitializer r0 = new javassist.CtField$IntInitializer
                r1 = r0
                r2 = r4
                r1.<init>(r2)
                return r0
        }

        public static javassist.CtField.Initializer constant(boolean r4) {
                javassist.CtField$IntInitializer r0 = new javassist.CtField$IntInitializer
                r1 = r0
                r2 = r4
                if (r2 == 0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                r1.<init>(r2)
                return r0
        }

        public static javassist.CtField.Initializer constant(long r5) {
                javassist.CtField$LongInitializer r0 = new javassist.CtField$LongInitializer
                r1 = r0
                r2 = r5
                r1.<init>(r2)
                return r0
        }

        public static javassist.CtField.Initializer constant(float r4) {
                javassist.CtField$FloatInitializer r0 = new javassist.CtField$FloatInitializer
                r1 = r0
                r2 = r4
                r1.<init>(r2)
                return r0
        }

        public static javassist.CtField.Initializer constant(double r5) {
                javassist.CtField$DoubleInitializer r0 = new javassist.CtField$DoubleInitializer
                r1 = r0
                r2 = r5
                r1.<init>(r2)
                return r0
        }

        public static javassist.CtField.Initializer constant(java.lang.String r4) {
                javassist.CtField$StringInitializer r0 = new javassist.CtField$StringInitializer
                r1 = r0
                r2 = r4
                r1.<init>(r2)
                return r0
        }

        public static javassist.CtField.Initializer byParameter(int r3) {
                javassist.CtField$ParamInitializer r0 = new javassist.CtField$ParamInitializer
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r4
                r1 = r3
                r0.nthParam = r1
                r0 = r4
                return r0
        }

        public static javassist.CtField.Initializer byNew(javassist.CtClass r3) {
                javassist.CtField$NewInitializer r0 = new javassist.CtField$NewInitializer
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r4
                r1 = r3
                r0.objectType = r1
                r0 = r4
                r1 = 0
                r0.stringParams = r1
                r0 = r4
                r1 = 0
                r0.withConstructorParams = r1
                r0 = r4
                return r0
        }

        public static javassist.CtField.Initializer byNew(javassist.CtClass r3, java.lang.String[] r4) {
                javassist.CtField$NewInitializer r0 = new javassist.CtField$NewInitializer
                r1 = r0
                r1.<init>()
                r5 = r0
                r0 = r5
                r1 = r3
                r0.objectType = r1
                r0 = r5
                r1 = r4
                r0.stringParams = r1
                r0 = r5
                r1 = 0
                r0.withConstructorParams = r1
                r0 = r5
                return r0
        }

        public static javassist.CtField.Initializer byNewWithParams(javassist.CtClass r3) {
                javassist.CtField$NewInitializer r0 = new javassist.CtField$NewInitializer
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r4
                r1 = r3
                r0.objectType = r1
                r0 = r4
                r1 = 0
                r0.stringParams = r1
                r0 = r4
                r1 = 1
                r0.withConstructorParams = r1
                r0 = r4
                return r0
        }

        public static javassist.CtField.Initializer byNewWithParams(javassist.CtClass r3, java.lang.String[] r4) {
                javassist.CtField$NewInitializer r0 = new javassist.CtField$NewInitializer
                r1 = r0
                r1.<init>()
                r5 = r0
                r0 = r5
                r1 = r3
                r0.objectType = r1
                r0 = r5
                r1 = r4
                r0.stringParams = r1
                r0 = r5
                r1 = 1
                r0.withConstructorParams = r1
                r0 = r5
                return r0
        }

        public static javassist.CtField.Initializer byCall(javassist.CtClass r3, java.lang.String r4) {
                javassist.CtField$MethodInitializer r0 = new javassist.CtField$MethodInitializer
                r1 = r0
                r1.<init>()
                r5 = r0
                r0 = r5
                r1 = r3
                r0.objectType = r1
                r0 = r5
                r1 = r4
                r0.methodName = r1
                r0 = r5
                r1 = 0
                r0.stringParams = r1
                r0 = r5
                r1 = 0
                r0.withConstructorParams = r1
                r0 = r5
                return r0
        }

        public static javassist.CtField.Initializer byCall(javassist.CtClass r3, java.lang.String r4, java.lang.String[] r5) {
                javassist.CtField$MethodInitializer r0 = new javassist.CtField$MethodInitializer
                r1 = r0
                r1.<init>()
                r6 = r0
                r0 = r6
                r1 = r3
                r0.objectType = r1
                r0 = r6
                r1 = r4
                r0.methodName = r1
                r0 = r6
                r1 = r5
                r0.stringParams = r1
                r0 = r6
                r1 = 0
                r0.withConstructorParams = r1
                r0 = r6
                return r0
        }

        public static javassist.CtField.Initializer byCallWithParams(javassist.CtClass r3, java.lang.String r4) {
                javassist.CtField$MethodInitializer r0 = new javassist.CtField$MethodInitializer
                r1 = r0
                r1.<init>()
                r5 = r0
                r0 = r5
                r1 = r3
                r0.objectType = r1
                r0 = r5
                r1 = r4
                r0.methodName = r1
                r0 = r5
                r1 = 0
                r0.stringParams = r1
                r0 = r5
                r1 = 1
                r0.withConstructorParams = r1
                r0 = r5
                return r0
        }

        public static javassist.CtField.Initializer byCallWithParams(javassist.CtClass r3, java.lang.String r4, java.lang.String[] r5) {
                javassist.CtField$MethodInitializer r0 = new javassist.CtField$MethodInitializer
                r1 = r0
                r1.<init>()
                r6 = r0
                r0 = r6
                r1 = r3
                r0.objectType = r1
                r0 = r6
                r1 = r4
                r0.methodName = r1
                r0 = r6
                r1 = r5
                r0.stringParams = r1
                r0 = r6
                r1 = 1
                r0.withConstructorParams = r1
                r0 = r6
                return r0
        }

        public static javassist.CtField.Initializer byNewArray(javassist.CtClass r5, int r6) throws javassist.NotFoundException {
                javassist.CtField$ArrayInitializer r0 = new javassist.CtField$ArrayInitializer
                r1 = r0
                r2 = r5
                javassist.CtClass r2 = r2.getComponentType()
                r3 = r6
                r1.<init>(r2, r3)
                return r0
        }

        public static javassist.CtField.Initializer byNewArray(javassist.CtClass r5, int[] r6) {
                javassist.CtField$MultiArrayInitializer r0 = new javassist.CtField$MultiArrayInitializer
                r1 = r0
                r2 = r5
                r3 = r6
                r1.<init>(r2, r3)
                return r0
        }

        public static javassist.CtField.Initializer byExpr(java.lang.String r4) {
                javassist.CtField$CodeInitializer r0 = new javassist.CtField$CodeInitializer
                r1 = r0
                r2 = r4
                r1.<init>(r2)
                return r0
        }

        static javassist.CtField.Initializer byExpr(javassist.compiler.ast.ASTree r4) {
                javassist.CtField$PtreeInitializer r0 = new javassist.CtField$PtreeInitializer
                r1 = r0
                r2 = r4
                r1.<init>(r2)
                return r0
        }

        void check(java.lang.String r2) throws javassist.CannotCompileException {
                r1 = this;
                return
        }

        abstract int compile(javassist.CtClass r1, java.lang.String r2, javassist.bytecode.Bytecode r3, javassist.CtClass[] r4, javassist.compiler.Javac r5) throws javassist.CannotCompileException;

        abstract int compileIfStatic(javassist.CtClass r1, java.lang.String r2, javassist.bytecode.Bytecode r3, javassist.compiler.Javac r4) throws javassist.CannotCompileException;

        int getConstantValue(javassist.bytecode.ConstPool r3, javassist.CtClass r4) {
                r2 = this;
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtField$IntInitializer.class */
    static class IntInitializer extends javassist.CtField.Initializer {
        int value;

        IntInitializer(int r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.value = r1
                return
        }

        @Override // javassist.CtField.Initializer
        void check(java.lang.String r5) throws javassist.CannotCompileException {
                r4 = this;
                r0 = r5
                r1 = 0
                char r0 = r0.charAt(r1)
                r6 = r0
                r0 = r6
                r1 = 73
                if (r0 == r1) goto L2e
                r0 = r6
                r1 = 83
                if (r0 == r1) goto L2e
                r0 = r6
                r1 = 66
                if (r0 == r1) goto L2e
                r0 = r6
                r1 = 67
                if (r0 == r1) goto L2e
                r0 = r6
                r1 = 90
                if (r0 == r1) goto L2e
                javassist.CannotCompileException r0 = new javassist.CannotCompileException
                r1 = r0
                java.lang.String r2 = "type mismatch"
                r1.<init>(r2)
                throw r0
            L2e:
                return
        }

        @Override // javassist.CtField.Initializer
        int compile(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.CtClass[] r9, javassist.compiler.Javac r10) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = 0
                r0.addAload(r1)
                r0 = r8
                r1 = r5
                int r1 = r1.value
                r0.addIconst(r1)
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutfield(r1, r2, r3)
                r0 = 2
                return r0
        }

        @Override // javassist.CtField.Initializer
        int compileIfStatic(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.compiler.Javac r9) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = r5
                int r1 = r1.value
                r0.addIconst(r1)
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutstatic(r1, r2, r3)
                r0 = 1
                return r0
        }

        @Override // javassist.CtField.Initializer
        int getConstantValue(javassist.bytecode.ConstPool r4, javassist.CtClass r5) {
                r3 = this;
                r0 = r4
                r1 = r3
                int r1 = r1.value
                int r0 = r0.addIntegerInfo(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtField$LongInitializer.class */
    static class LongInitializer extends javassist.CtField.Initializer {
        long value;

        LongInitializer(long r5) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.value = r1
                return
        }

        @Override // javassist.CtField.Initializer
        void check(java.lang.String r5) throws javassist.CannotCompileException {
                r4 = this;
                r0 = r5
                java.lang.String r1 = "J"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L13
                javassist.CannotCompileException r0 = new javassist.CannotCompileException
                r1 = r0
                java.lang.String r2 = "type mismatch"
                r1.<init>(r2)
                throw r0
            L13:
                return
        }

        @Override // javassist.CtField.Initializer
        int compile(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.CtClass[] r9, javassist.compiler.Javac r10) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = 0
                r0.addAload(r1)
                r0 = r8
                r1 = r5
                long r1 = r1.value
                r0.addLdc2w(r1)
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutfield(r1, r2, r3)
                r0 = 3
                return r0
        }

        @Override // javassist.CtField.Initializer
        int compileIfStatic(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.compiler.Javac r9) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = r5
                long r1 = r1.value
                r0.addLdc2w(r1)
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutstatic(r1, r2, r3)
                r0 = 2
                return r0
        }

        @Override // javassist.CtField.Initializer
        int getConstantValue(javassist.bytecode.ConstPool r5, javassist.CtClass r6) {
                r4 = this;
                r0 = r6
                javassist.CtClass r1 = javassist.CtClass.longType
                if (r0 != r1) goto L10
                r0 = r5
                r1 = r4
                long r1 = r1.value
                int r0 = r0.addLongInfo(r1)
                return r0
            L10:
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtField$MethodInitializer.class */
    static class MethodInitializer extends javassist.CtField.NewInitializer {
        java.lang.String methodName;

        MethodInitializer() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // javassist.CtField.NewInitializer, javassist.CtField.Initializer
        int compile(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.CtClass[] r9, javassist.compiler.Javac r10) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = 0
                r0.addAload(r1)
                r0 = r8
                r1 = 0
                r0.addAload(r1)
                r0 = r5
                java.lang.String[] r0 = r0.stringParams
                if (r0 != 0) goto L17
                r0 = 2
                r11 = r0
                goto L20
            L17:
                r0 = r5
                r1 = r8
                int r0 = r0.compileStringParameter(r1)
                r1 = 2
                int r0 = r0 + r1
                r11 = r0
            L20:
                r0 = r5
                boolean r0 = r0.withConstructorParams
                if (r0 == 0) goto L33
                r0 = r11
                r1 = r8
                r2 = r9
                r3 = 1
                int r1 = javassist.CtNewWrappedMethod.compileParameterList(r1, r2, r3)
                int r0 = r0 + r1
                r11 = r0
            L33:
                r0 = r6
                java.lang.String r0 = javassist.bytecode.Descriptor.of(r0)
                r12 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r1 = r5
                java.lang.String r1 = r1.getDescriptor()
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r12
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r13 = r0
                r0 = r8
                r1 = r5
                javassist.CtClass r1 = r1.objectType
                r2 = r5
                java.lang.String r2 = r2.methodName
                r3 = r13
                r0.addInvokestatic(r1, r2, r3)
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r12
                r0.addPutfield(r1, r2, r3)
                r0 = r11
                return r0
        }

        private java.lang.String getDescriptor() {
                r2 = this;
                java.lang.String r0 = "(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/Object;)"
                r3 = r0
                r0 = r2
                java.lang.String[] r0 = r0.stringParams
                if (r0 != 0) goto L17
                r0 = r2
                boolean r0 = r0.withConstructorParams
                if (r0 == 0) goto L14
                java.lang.String r0 = "(Ljava/lang/Object;[Ljava/lang/Object;)"
                return r0
            L14:
                java.lang.String r0 = "(Ljava/lang/Object;)"
                return r0
            L17:
                r0 = r2
                boolean r0 = r0.withConstructorParams
                if (r0 == 0) goto L21
                java.lang.String r0 = "(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/Object;)"
                return r0
            L21:
                java.lang.String r0 = "(Ljava/lang/Object;[Ljava/lang/String;)"
                return r0
        }

        @Override // javassist.CtField.NewInitializer, javassist.CtField.Initializer
        int compileIfStatic(javassist.CtClass r7, java.lang.String r8, javassist.bytecode.Bytecode r9, javassist.compiler.Javac r10) throws javassist.CannotCompileException {
                r6 = this;
                r0 = 1
                r12 = r0
                r0 = r6
                java.lang.String[] r0 = r0.stringParams
                if (r0 != 0) goto L11
                java.lang.String r0 = "()"
                r11 = r0
                goto L1f
            L11:
                java.lang.String r0 = "([Ljava/lang/String;)"
                r11 = r0
                r0 = r12
                r1 = r6
                r2 = r9
                int r1 = r1.compileStringParameter(r2)
                int r0 = r0 + r1
                r12 = r0
            L1f:
                r0 = r7
                java.lang.String r0 = javassist.bytecode.Descriptor.of(r0)
                r13 = r0
                r0 = r9
                r1 = r6
                javassist.CtClass r1 = r1.objectType
                r2 = r6
                java.lang.String r2 = r2.methodName
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r4 = r3
                r4.<init>()
                r4 = r11
                java.lang.StringBuilder r3 = r3.append(r4)
                r4 = r13
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r0.addInvokestatic(r1, r2, r3)
                r0 = r9
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r8
                r3 = r13
                r0.addPutstatic(r1, r2, r3)
                r0 = r12
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtField$MultiArrayInitializer.class */
    static class MultiArrayInitializer extends javassist.CtField.Initializer {
        javassist.CtClass type;
        int[] dim;

        MultiArrayInitializer(javassist.CtClass r4, int[] r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.type = r1
                r0 = r3
                r1 = r5
                r0.dim = r1
                return
        }

        @Override // javassist.CtField.Initializer
        void check(java.lang.String r5) throws javassist.CannotCompileException {
                r4 = this;
                r0 = r5
                r1 = 0
                char r0 = r0.charAt(r1)
                r1 = 91
                if (r0 == r1) goto L14
                javassist.CannotCompileException r0 = new javassist.CannotCompileException
                r1 = r0
                java.lang.String r2 = "type mismatch"
                r1.<init>(r2)
                throw r0
            L14:
                return
        }

        @Override // javassist.CtField.Initializer
        int compile(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.CtClass[] r9, javassist.compiler.Javac r10) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = 0
                r0.addAload(r1)
                r0 = r8
                r1 = r6
                r2 = r5
                int[] r2 = r2.dim
                int r0 = r0.addMultiNewarray(r1, r2)
                r11 = r0
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutfield(r1, r2, r3)
                r0 = r11
                r1 = 1
                int r0 = r0 + r1
                return r0
        }

        @Override // javassist.CtField.Initializer
        int compileIfStatic(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.compiler.Javac r9) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = r6
                r2 = r5
                int[] r2 = r2.dim
                int r0 = r0.addMultiNewarray(r1, r2)
                r10 = r0
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutstatic(r1, r2, r3)
                r0 = r10
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtField$NewInitializer.class */
    static class NewInitializer extends javassist.CtField.Initializer {
        javassist.CtClass objectType;
        java.lang.String[] stringParams;
        boolean withConstructorParams;

        NewInitializer() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // javassist.CtField.Initializer
        int compile(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.CtClass[] r9, javassist.compiler.Javac r10) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = 0
                r0.addAload(r1)
                r0 = r8
                r1 = r5
                javassist.CtClass r1 = r1.objectType
                r0.addNew(r1)
                r0 = r8
                r1 = 89
                r0.add(r1)
                r0 = r8
                r1 = 0
                r0.addAload(r1)
                r0 = r5
                java.lang.String[] r0 = r0.stringParams
                if (r0 != 0) goto L25
                r0 = 4
                r11 = r0
                goto L2e
            L25:
                r0 = r5
                r1 = r8
                int r0 = r0.compileStringParameter(r1)
                r1 = 4
                int r0 = r0 + r1
                r11 = r0
            L2e:
                r0 = r5
                boolean r0 = r0.withConstructorParams
                if (r0 == 0) goto L41
                r0 = r11
                r1 = r8
                r2 = r9
                r3 = 1
                int r1 = javassist.CtNewWrappedMethod.compileParameterList(r1, r2, r3)
                int r0 = r0 + r1
                r11 = r0
            L41:
                r0 = r8
                r1 = r5
                javassist.CtClass r1 = r1.objectType
                java.lang.String r2 = "<init>"
                r3 = r5
                java.lang.String r3 = r3.getDescriptor()
                r0.addInvokespecial(r1, r2, r3)
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutfield(r1, r2, r3)
                r0 = r11
                return r0
        }

        private java.lang.String getDescriptor() {
                r2 = this;
                java.lang.String r0 = "(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/Object;)V"
                r3 = r0
                r0 = r2
                java.lang.String[] r0 = r0.stringParams
                if (r0 != 0) goto L17
                r0 = r2
                boolean r0 = r0.withConstructorParams
                if (r0 == 0) goto L14
                java.lang.String r0 = "(Ljava/lang/Object;[Ljava/lang/Object;)V"
                return r0
            L14:
                java.lang.String r0 = "(Ljava/lang/Object;)V"
                return r0
            L17:
                r0 = r2
                boolean r0 = r0.withConstructorParams
                if (r0 == 0) goto L21
                java.lang.String r0 = "(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/Object;)V"
                return r0
            L21:
                java.lang.String r0 = "(Ljava/lang/Object;[Ljava/lang/String;)V"
                return r0
        }

        @Override // javassist.CtField.Initializer
        int compileIfStatic(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.compiler.Javac r9) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = r5
                javassist.CtClass r1 = r1.objectType
                r0.addNew(r1)
                r0 = r8
                r1 = 89
                r0.add(r1)
                r0 = 2
                r11 = r0
                r0 = r5
                java.lang.String[] r0 = r0.stringParams
                if (r0 != 0) goto L1f
                java.lang.String r0 = "()V"
                r10 = r0
                goto L2d
            L1f:
                java.lang.String r0 = "([Ljava/lang/String;)V"
                r10 = r0
                r0 = r11
                r1 = r5
                r2 = r8
                int r1 = r1.compileStringParameter(r2)
                int r0 = r0 + r1
                r11 = r0
            L2d:
                r0 = r8
                r1 = r5
                javassist.CtClass r1 = r1.objectType
                java.lang.String r2 = "<init>"
                r3 = r10
                r0.addInvokespecial(r1, r2, r3)
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutstatic(r1, r2, r3)
                r0 = r11
                return r0
        }

        protected final int compileStringParameter(javassist.bytecode.Bytecode r5) throws javassist.CannotCompileException {
                r4 = this;
                r0 = r4
                java.lang.String[] r0 = r0.stringParams
                int r0 = r0.length
                r6 = r0
                r0 = r5
                r1 = r6
                r0.addIconst(r1)
                r0 = r5
                java.lang.String r1 = "java.lang.String"
                r0.addAnewarray(r1)
                r0 = 0
                r7 = r0
            L13:
                r0 = r7
                r1 = r6
                if (r0 >= r1) goto L39
                r0 = r5
                r1 = 89
                r0.add(r1)
                r0 = r5
                r1 = r7
                r0.addIconst(r1)
                r0 = r5
                r1 = r4
                java.lang.String[] r1 = r1.stringParams
                r2 = r7
                r1 = r1[r2]
                r0.addLdc(r1)
                r0 = r5
                r1 = 83
                r0.add(r1)
                int r7 = r7 + 1
                goto L13
            L39:
                r0 = 4
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtField$ParamInitializer.class */
    static class ParamInitializer extends javassist.CtField.Initializer {
        int nthParam;

        ParamInitializer() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // javassist.CtField.Initializer
        int compile(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.CtClass[] r9, javassist.compiler.Javac r10) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r9
                if (r0 == 0) goto L3a
                r0 = r5
                int r0 = r0.nthParam
                r1 = r9
                int r1 = r1.length
                if (r0 >= r1) goto L3a
                r0 = r8
                r1 = 0
                r0.addAload(r1)
                r0 = r5
                int r0 = r0.nthParam
                r1 = r9
                r2 = 0
                int r0 = nthParamToLocal(r0, r1, r2)
                r11 = r0
                r0 = r8
                r1 = r11
                r2 = r6
                int r0 = r0.addLoad(r1, r2)
                r1 = 1
                int r0 = r0 + r1
                r12 = r0
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutfield(r1, r2, r3)
                r0 = r12
                return r0
            L3a:
                r0 = 0
                return r0
        }

        static int nthParamToLocal(int r3, javassist.CtClass[] r4, boolean r5) {
                javassist.CtClass r0 = javassist.CtClass.longType
                r6 = r0
                javassist.CtClass r0 = javassist.CtClass.doubleType
                r7 = r0
                r0 = r5
                if (r0 == 0) goto L13
                r0 = 0
                r8 = r0
                goto L16
            L13:
                r0 = 1
                r8 = r0
            L16:
                r0 = 0
                r9 = r0
            L19:
                r0 = r9
                r1 = r3
                if (r0 >= r1) goto L41
                r0 = r4
                r1 = r9
                r0 = r0[r1]
                r10 = r0
                r0 = r10
                r1 = r6
                if (r0 == r1) goto L32
                r0 = r10
                r1 = r7
                if (r0 != r1) goto L38
            L32:
                int r8 = r8 + 2
                goto L3b
            L38:
                int r8 = r8 + 1
            L3b:
                int r9 = r9 + 1
                goto L19
            L41:
                r0 = r8
                return r0
        }

        @Override // javassist.CtField.Initializer
        int compileIfStatic(javassist.CtClass r3, java.lang.String r4, javassist.bytecode.Bytecode r5, javassist.compiler.Javac r6) throws javassist.CannotCompileException {
                r2 = this;
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtField$PtreeInitializer.class */
    static class PtreeInitializer extends javassist.CtField.CodeInitializer0 {
        private javassist.compiler.ast.ASTree expression;

        PtreeInitializer(javassist.compiler.ast.ASTree r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.expression = r1
                return
        }

        @Override // javassist.CtField.CodeInitializer0
        void compileExpr(javassist.compiler.Javac r4) throws javassist.compiler.CompileError {
                r3 = this;
                r0 = r4
                r1 = r3
                javassist.compiler.ast.ASTree r1 = r1.expression
                r0.compileExpr(r1)
                return
        }

        @Override // javassist.CtField.Initializer
        int getConstantValue(javassist.bytecode.ConstPool r6, javassist.CtClass r7) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r5
                javassist.compiler.ast.ASTree r3 = r3.expression
                int r0 = r0.getConstantValue2(r1, r2, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/CtField$StringInitializer.class */
    static class StringInitializer extends javassist.CtField.Initializer {
        java.lang.String value;

        StringInitializer(java.lang.String r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.value = r1
                return
        }

        @Override // javassist.CtField.Initializer
        int compile(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.CtClass[] r9, javassist.compiler.Javac r10) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = 0
                r0.addAload(r1)
                r0 = r8
                r1 = r5
                java.lang.String r1 = r1.value
                r0.addLdc(r1)
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutfield(r1, r2, r3)
                r0 = 2
                return r0
        }

        @Override // javassist.CtField.Initializer
        int compileIfStatic(javassist.CtClass r6, java.lang.String r7, javassist.bytecode.Bytecode r8, javassist.compiler.Javac r9) throws javassist.CannotCompileException {
                r5 = this;
                r0 = r8
                r1 = r5
                java.lang.String r1 = r1.value
                r0.addLdc(r1)
                r0 = r8
                javassist.CtClass r1 = javassist.bytecode.Bytecode.THIS
                r2 = r7
                r3 = r6
                java.lang.String r3 = javassist.bytecode.Descriptor.of(r3)
                r0.addPutstatic(r1, r2, r3)
                r0 = 1
                return r0
        }

        @Override // javassist.CtField.Initializer
        int getConstantValue(javassist.bytecode.ConstPool r4, javassist.CtClass r5) {
                r3 = this;
                r0 = r5
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "java.lang.String"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L15
                r0 = r4
                r1 = r3
                java.lang.String r1 = r1.value
                int r0 = r0.addStringInfo(r1)
                return r0
            L15:
                r0 = 0
                return r0
        }
    }

    public CtField(javassist.CtClass r6, java.lang.String r7, javassist.CtClass r8) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r1 = javassist.bytecode.Descriptor.of(r1)
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public CtField(javassist.CtField r6, javassist.CtClass r7) throws javassist.CannotCompileException {
            r5 = this;
            r0 = r5
            r1 = r6
            javassist.bytecode.FieldInfo r1 = r1.fieldInfo
            java.lang.String r1 = r1.getDescriptor()
            r2 = r6
            javassist.bytecode.FieldInfo r2 = r2.fieldInfo
            java.lang.String r2 = r2.getName()
            r3 = r7
            r0.<init>(r1, r2, r3)
            r0 = r5
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            r8 = r0
            r0 = r8
            r1 = r6
            javassist.bytecode.FieldInfo r1 = r1.fieldInfo
            int r1 = r1.getAccessFlags()
            r0.setAccessFlags(r1)
            r0 = r8
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r9 = r0
            r0 = r6
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            java.util.List r0 = r0.getAttributes()
            r10 = r0
            r0 = r10
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L3b:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L60
            r0 = r11
            java.lang.Object r0 = r0.next()
            javassist.bytecode.AttributeInfo r0 = (javassist.bytecode.AttributeInfo) r0
            r12 = r0
            r0 = r8
            r1 = r12
            r2 = r9
            r3 = 0
            javassist.bytecode.AttributeInfo r1 = r1.copy(r2, r3)
            r0.addAttribute(r1)
            goto L3b
        L60:
            return
    }

    private CtField(java.lang.String r8, java.lang.String r9, javassist.CtClass r10) throws javassist.CannotCompileException {
            r7 = this;
            r0 = r7
            r1 = r10
            r0.<init>(r1)
            r0 = r10
            javassist.bytecode.ClassFile r0 = r0.getClassFile2()
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L2e
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad declaring class: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r10
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L2e:
            r0 = r7
            javassist.bytecode.FieldInfo r1 = new javassist.bytecode.FieldInfo
            r2 = r1
            r3 = r11
            javassist.bytecode.ConstPool r3 = r3.getConstPool()
            r4 = r9
            r5 = r8
            r2.<init>(r3, r4, r5)
            r0.fieldInfo = r1
            return
    }

    CtField(javassist.bytecode.FieldInfo r4, javassist.CtClass r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.fieldInfo = r1
            return
    }

    @Override // javassist.CtMember
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            javassist.CtClass r1 = r1.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            javassist.bytecode.FieldInfo r1 = r1.fieldInfo
            java.lang.String r1 = r1.getDescriptor()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // javassist.CtMember
    protected void extendToString(java.lang.StringBuilder r4) {
            r3 = this;
            r0 = r4
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r3
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = 32
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r3
            javassist.bytecode.FieldInfo r1 = r1.fieldInfo
            java.lang.String r1 = r1.getDescriptor()
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }

    protected javassist.compiler.ast.ASTree getInitAST() {
            r2 = this;
            r0 = 0
            return r0
    }

    javassist.CtField.Initializer getInit() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTree r0 = r0.getInitAST()
            r3 = r0
            r0 = r3
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            r0 = r3
            javassist.CtField$Initializer r0 = javassist.CtField.Initializer.byExpr(r0)
            return r0
    }

    public static javassist.CtField make(java.lang.String r4, javassist.CtClass r5) throws javassist.CannotCompileException {
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
            boolean r0 = r0 instanceof javassist.CtField     // Catch: javassist.compiler.CompileError -> L1e
            if (r0 == 0) goto L1b
            r0 = r7
            javassist.CtField r0 = (javassist.CtField) r0     // Catch: javassist.compiler.CompileError -> L1e
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
            java.lang.String r2 = "not a field"
            r1.<init>(r2)
            throw r0
    }

    public javassist.bytecode.FieldInfo getFieldInfo() {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r2
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            return r0
    }

    public javassist.bytecode.FieldInfo getFieldInfo2() {
            r2 = this;
            r0 = r2
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            return r0
    }

    @Override // javassist.CtMember
    public javassist.CtClass getDeclaringClass() {
            r2 = this;
            r0 = r2
            javassist.CtClass r0 = super.getDeclaringClass()
            return r0
    }

    @Override // javassist.CtMember
    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            java.lang.String r0 = r0.getName()
            return r0
    }

    public void setName(java.lang.String r4) {
            r3 = this;
            r0 = r3
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r3
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            r1 = r4
            r0.setName(r1)
            return
    }

    @Override // javassist.CtMember
    public int getModifiers() {
            r2 = this;
            r0 = r2
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            int r0 = r0.getAccessFlags()
            int r0 = javassist.bytecode.AccessFlag.toModifier(r0)
            return r0
    }

    @Override // javassist.CtMember
    public void setModifiers(int r4) {
            r3 = this;
            r0 = r3
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r3
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            r1 = r4
            int r1 = javassist.bytecode.AccessFlag.of(r1)
            r0.setAccessFlags(r1)
            return
    }

    @Override // javassist.CtMember
    public boolean hasAnnotation(java.lang.String r6) {
            r5 = this;
            r0 = r5
            javassist.bytecode.FieldInfo r0 = r0.getFieldInfo2()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r8 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r9 = r0
            r0 = r6
            r1 = r5
            javassist.CtClass r1 = r1.getDeclaringClass()
            javassist.ClassPool r1 = r1.getClassPool()
            r2 = r8
            r3 = r9
            boolean r0 = javassist.CtClassType.hasAnnotationType(r0, r1, r2, r3)
            return r0
    }

    @Override // javassist.CtMember
    public java.lang.Object getAnnotation(java.lang.Class<?> r6) throws java.lang.ClassNotFoundException {
            r5 = this;
            r0 = r5
            javassist.bytecode.FieldInfo r0 = r0.getFieldInfo2()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r8 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r9 = r0
            r0 = r6
            r1 = r5
            javassist.CtClass r1 = r1.getDeclaringClass()
            javassist.ClassPool r1 = r1.getClassPool()
            r2 = r8
            r3 = r9
            java.lang.Object r0 = javassist.CtClassType.getAnnotationType(r0, r1, r2, r3)
            return r0
    }

    @Override // javassist.CtMember
    public java.lang.Object[] getAnnotations() throws java.lang.ClassNotFoundException {
            r3 = this;
            r0 = r3
            r1 = 0
            java.lang.Object[] r0 = r0.getAnnotations(r1)
            return r0
    }

    @Override // javassist.CtMember
    public java.lang.Object[] getAvailableAnnotations() {
            r5 = this;
            r0 = r5
            r1 = 1
            java.lang.Object[] r0 = r0.getAnnotations(r1)     // Catch: java.lang.ClassNotFoundException -> L6
            return r0
        L6:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Unexpected exception"
            r3 = r6
            r1.<init>(r2, r3)
            throw r0
    }

    private java.lang.Object[] getAnnotations(boolean r6) throws java.lang.ClassNotFoundException {
            r5 = this;
            r0 = r5
            javassist.bytecode.FieldInfo r0 = r0.getFieldInfo2()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeInvisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r8 = r0
            r0 = r7
            java.lang.String r1 = "RuntimeVisibleAnnotations"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.AnnotationsAttribute r0 = (javassist.bytecode.AnnotationsAttribute) r0
            r9 = r0
            r0 = r6
            r1 = r5
            javassist.CtClass r1 = r1.getDeclaringClass()
            javassist.ClassPool r1 = r1.getClassPool()
            r2 = r8
            r3 = r9
            java.lang.Object[] r0 = javassist.CtClassType.toAnnotationType(r0, r1, r2, r3)
            return r0
    }

    @Override // javassist.CtMember
    public java.lang.String getSignature() {
            r2 = this;
            r0 = r2
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            java.lang.String r0 = r0.getDescriptor()
            return r0
    }

    @Override // javassist.CtMember
    public java.lang.String getGenericSignature() {
            r3 = this;
            r0 = r3
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            java.lang.String r1 = "Signature"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.SignatureAttribute r0 = (javassist.bytecode.SignatureAttribute) r0
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L15
            r0 = 0
            goto L19
        L15:
            r0 = r4
            java.lang.String r0 = r0.getSignature()
        L19:
            return r0
    }

    @Override // javassist.CtMember
    public void setGenericSignature(java.lang.String r7) {
            r6 = this;
            r0 = r6
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r6
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            javassist.bytecode.SignatureAttribute r1 = new javassist.bytecode.SignatureAttribute
            r2 = r1
            r3 = r6
            javassist.bytecode.FieldInfo r3 = r3.fieldInfo
            javassist.bytecode.ConstPool r3 = r3.getConstPool()
            r4 = r7
            r2.<init>(r3, r4)
            r0.addAttribute(r1)
            return
    }

    public javassist.CtClass getType() throws javassist.NotFoundException {
            r3 = this;
            r0 = r3
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            java.lang.String r0 = r0.getDescriptor()
            r1 = r3
            javassist.CtClass r1 = r1.declaringClass
            javassist.ClassPool r1 = r1.getClassPool()
            javassist.CtClass r0 = javassist.bytecode.Descriptor.toCtClass(r0, r1)
            return r0
    }

    public void setType(javassist.CtClass r4) {
            r3 = this;
            r0 = r3
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r3
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            r1 = r4
            java.lang.String r1 = javassist.bytecode.Descriptor.of(r1)
            r0.setDescriptor(r1)
            return
    }

    public java.lang.Object getConstantValue() {
            r6 = this;
            r0 = r6
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            int r0 = r0.getConstantValue()
            r7 = r0
            r0 = r7
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r6
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r8 = r0
            r0 = r8
            r1 = r7
            int r0 = r0.getTag(r1)
            switch(r0) {
                case 3: goto L5b;
                case 4: goto L49;
                case 5: goto L40;
                case 6: goto L52;
                case 7: goto L89;
                case 8: goto L83;
                default: goto L89;
            }
        L40:
            r0 = r8
            r1 = r7
            long r0 = r0.getLongInfo(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L49:
            r0 = r8
            r1 = r7
            float r0 = r0.getFloatInfo(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L52:
            r0 = r8
            r1 = r7
            double r0 = r0.getDoubleInfo(r1)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L5b:
            r0 = r8
            r1 = r7
            int r0 = r0.getIntegerInfo(r1)
            r9 = r0
            java.lang.String r0 = "Z"
            r1 = r6
            javassist.bytecode.FieldInfo r1 = r1.fieldInfo
            java.lang.String r1 = r1.getDescriptor()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7e
            r0 = r9
            if (r0 == 0) goto L79
            r0 = 1
            goto L7a
        L79:
            r0 = 0
        L7a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L7e:
            r0 = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L83:
            r0 = r8
            r1 = r7
            java.lang.String r0 = r0.getStringInfo(r1)
            return r0
        L89:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad tag: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            r4 = r7
            int r3 = r3.getTag(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " at "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.CtMember
    public byte[] getAttribute(java.lang.String r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            r1 = r4
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r5
            byte[] r0 = r0.get()
            return r0
    }

    @Override // javassist.CtMember
    public void setAttribute(java.lang.String r8, byte[] r9) {
            r7 = this;
            r0 = r7
            javassist.CtClass r0 = r0.declaringClass
            r0.checkModify()
            r0 = r7
            javassist.bytecode.FieldInfo r0 = r0.fieldInfo
            javassist.bytecode.AttributeInfo r1 = new javassist.bytecode.AttributeInfo
            r2 = r1
            r3 = r7
            javassist.bytecode.FieldInfo r3 = r3.fieldInfo
            javassist.bytecode.ConstPool r3 = r3.getConstPool()
            r4 = r8
            r5 = r9
            r2.<init>(r3, r4, r5)
            r0.addAttribute(r1)
            return
    }
}
