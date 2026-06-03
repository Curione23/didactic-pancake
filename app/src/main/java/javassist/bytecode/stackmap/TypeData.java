package javassist.bytecode.stackmap;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/TypeData.class */
public abstract class TypeData {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/TypeData$AbsTypeVar.class */
    public static abstract class AbsTypeVar extends javassist.bytecode.stackmap.TypeData {
        public AbsTypeVar() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public abstract void merge(javassist.bytecode.stackmap.TypeData r1);

        @Override // javassist.bytecode.stackmap.TypeData
        public int getTypeTag() {
                r2 = this;
                r0 = 7
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public int getTypeData(javassist.bytecode.ConstPool r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                java.lang.String r1 = r1.getName()
                int r0 = r0.addClassInfo(r1)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public boolean eq(javassist.bytecode.stackmap.TypeData r4) {
                r3 = this;
                r0 = r4
                boolean r0 = r0.isUninit()
                if (r0 == 0) goto Ld
                r0 = r4
                r1 = r3
                boolean r0 = r0.eq(r1)
                return r0
            Ld:
                r0 = r3
                java.lang.String r0 = r0.getName()
                r1 = r4
                java.lang.String r1 = r1.getName()
                boolean r0 = r0.equals(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/TypeData$ArrayElement.class */
    public static class ArrayElement extends javassist.bytecode.stackmap.TypeData.AbsTypeVar {
        private javassist.bytecode.stackmap.TypeData.AbsTypeVar array;

        private ArrayElement(javassist.bytecode.stackmap.TypeData.AbsTypeVar r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.array = r1
                return
        }

        public static javassist.bytecode.stackmap.TypeData make(javassist.bytecode.stackmap.TypeData r5) throws javassist.bytecode.BadBytecode {
                r0 = r5
                boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.ArrayType
                if (r0 == 0) goto Lf
                r0 = r5
                javassist.bytecode.stackmap.TypeData$ArrayType r0 = (javassist.bytecode.stackmap.TypeData.ArrayType) r0
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.elementType()
                return r0
            Lf:
                r0 = r5
                boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.AbsTypeVar
                if (r0 == 0) goto L22
                javassist.bytecode.stackmap.TypeData$ArrayElement r0 = new javassist.bytecode.stackmap.TypeData$ArrayElement
                r1 = r0
                r2 = r5
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r2 = (javassist.bytecode.stackmap.TypeData.AbsTypeVar) r2
                r1.<init>(r2)
                return r0
            L22:
                r0 = r5
                boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.ClassName
                if (r0 == 0) goto L3f
                r0 = r5
                boolean r0 = r0.isNullType()
                if (r0 != 0) goto L3f
                javassist.bytecode.stackmap.TypeData$ClassName r0 = new javassist.bytecode.stackmap.TypeData$ClassName
                r1 = r0
                r2 = r5
                java.lang.String r2 = r2.getName()
                java.lang.String r2 = typeName(r2)
                r1.<init>(r2)
                return r0
            L3f:
                javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r3.<init>()
                java.lang.String r3 = "bad AASTORE: "
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r5
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
        }

        @Override // javassist.bytecode.stackmap.TypeData.AbsTypeVar
        public void merge(javassist.bytecode.stackmap.TypeData r6) {
                r5 = this;
                r0 = r6
                boolean r0 = r0.isNullType()     // Catch: javassist.bytecode.BadBytecode -> L15
                if (r0 != 0) goto L12
                r0 = r5
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.array     // Catch: javassist.bytecode.BadBytecode -> L15
                r1 = r6
                javassist.bytecode.stackmap.TypeData r1 = javassist.bytecode.stackmap.TypeData.ArrayType.make(r1)     // Catch: javassist.bytecode.BadBytecode -> L15
                r0.merge(r1)     // Catch: javassist.bytecode.BadBytecode -> L15
            L12:
                goto L31
            L15:
                r7 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r3.<init>()
                java.lang.String r3 = "fatal: "
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r7
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
            L31:
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public java.lang.String getName() {
                r2 = this;
                r0 = r2
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.array
                java.lang.String r0 = r0.getName()
                java.lang.String r0 = typeName(r0)
                return r0
        }

        public javassist.bytecode.stackmap.TypeData.AbsTypeVar arrayType() {
                r2 = this;
                r0 = r2
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.array
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData.BasicType isBasicType() {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public boolean is2WordType() {
                r2 = this;
                r0 = 0
                return r0
        }

        private static java.lang.String typeName(java.lang.String r5) {
                r0 = r5
                int r0 = r0.length()
                r1 = 1
                if (r0 <= r1) goto L3d
                r0 = r5
                r1 = 0
                char r0 = r0.charAt(r1)
                r1 = 91
                if (r0 != r1) goto L3d
                r0 = r5
                r1 = 1
                char r0 = r0.charAt(r1)
                r6 = r0
                r0 = r6
                r1 = 76
                if (r0 != r1) goto L31
                r0 = r5
                r1 = 2
                r2 = r5
                int r2 = r2.length()
                r3 = 1
                int r2 = r2 - r3
                java.lang.String r0 = r0.substring(r1, r2)
                r1 = 47
                r2 = 46
                java.lang.String r0 = r0.replace(r1, r2)
                return r0
            L31:
                r0 = r6
                r1 = 91
                if (r0 != r1) goto L3d
                r0 = r5
                r1 = 1
                java.lang.String r0 = r0.substring(r1)
                return r0
            L3d:
                java.lang.String r0 = "java.lang.Object"
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public void setType(java.lang.String r5, javassist.ClassPool r6) throws javassist.bytecode.BadBytecode {
                r4 = this;
                r0 = r4
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.array
                r1 = r5
                java.lang.String r1 = javassist.bytecode.stackmap.TypeData.ArrayType.typeName(r1)
                r2 = r6
                r0.setType(r1, r2)
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData
        protected javassist.bytecode.stackmap.TypeData.TypeVar toTypeVar(int r5) {
                r4 = this;
                r0 = r4
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.array
                r1 = r5
                r2 = 1
                int r1 = r1 - r2
                javassist.bytecode.stackmap.TypeData$TypeVar r0 = r0.toTypeVar(r1)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData getArrayType(int r5) throws javassist.NotFoundException {
                r4 = this;
                r0 = r4
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.array
                r1 = r5
                r2 = 1
                int r1 = r1 - r2
                javassist.bytecode.stackmap.TypeData r0 = r0.getArrayType(r1)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public int dfs(java.util.List<javassist.bytecode.stackmap.TypeData> r6, int r7, javassist.ClassPool r8) throws javassist.NotFoundException {
                r5 = this;
                r0 = r5
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.array
                r1 = r6
                r2 = r7
                r3 = r8
                int r0 = r0.dfs(r1, r2, r3)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        java.lang.String toString2(java.util.Set<javassist.bytecode.stackmap.TypeData> r5) {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                java.lang.String r1 = "*"
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r4
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r1 = r1.array
                r2 = r5
                java.lang.String r1 = r1.toString2(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        static /* synthetic */ java.lang.String access$000(java.lang.String r2) {
                r0 = r2
                java.lang.String r0 = typeName(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/TypeData$ArrayType.class */
    public static class ArrayType extends javassist.bytecode.stackmap.TypeData.AbsTypeVar {
        private javassist.bytecode.stackmap.TypeData.AbsTypeVar element;

        private ArrayType(javassist.bytecode.stackmap.TypeData.AbsTypeVar r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.element = r1
                return
        }

        static javassist.bytecode.stackmap.TypeData make(javassist.bytecode.stackmap.TypeData r5) throws javassist.bytecode.BadBytecode {
                r0 = r5
                boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.ArrayElement
                if (r0 == 0) goto Lf
                r0 = r5
                javassist.bytecode.stackmap.TypeData$ArrayElement r0 = (javassist.bytecode.stackmap.TypeData.ArrayElement) r0
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.arrayType()
                return r0
            Lf:
                r0 = r5
                boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.AbsTypeVar
                if (r0 == 0) goto L22
                javassist.bytecode.stackmap.TypeData$ArrayType r0 = new javassist.bytecode.stackmap.TypeData$ArrayType
                r1 = r0
                r2 = r5
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r2 = (javassist.bytecode.stackmap.TypeData.AbsTypeVar) r2
                r1.<init>(r2)
                return r0
            L22:
                r0 = r5
                boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.ClassName
                if (r0 == 0) goto L3f
                r0 = r5
                boolean r0 = r0.isNullType()
                if (r0 != 0) goto L3f
                javassist.bytecode.stackmap.TypeData$ClassName r0 = new javassist.bytecode.stackmap.TypeData$ClassName
                r1 = r0
                r2 = r5
                java.lang.String r2 = r2.getName()
                java.lang.String r2 = typeName(r2)
                r1.<init>(r2)
                return r0
            L3f:
                javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r3.<init>()
                java.lang.String r3 = "bad AASTORE: "
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r5
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
        }

        @Override // javassist.bytecode.stackmap.TypeData.AbsTypeVar
        public void merge(javassist.bytecode.stackmap.TypeData r6) {
                r5 = this;
                r0 = r6
                boolean r0 = r0.isNullType()     // Catch: javassist.bytecode.BadBytecode -> L15
                if (r0 != 0) goto L12
                r0 = r5
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.element     // Catch: javassist.bytecode.BadBytecode -> L15
                r1 = r6
                javassist.bytecode.stackmap.TypeData r1 = javassist.bytecode.stackmap.TypeData.ArrayElement.make(r1)     // Catch: javassist.bytecode.BadBytecode -> L15
                r0.merge(r1)     // Catch: javassist.bytecode.BadBytecode -> L15
            L12:
                goto L31
            L15:
                r7 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r3.<init>()
                java.lang.String r3 = "fatal: "
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r7
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
            L31:
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public java.lang.String getName() {
                r2 = this;
                r0 = r2
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.element
                java.lang.String r0 = r0.getName()
                java.lang.String r0 = typeName(r0)
                return r0
        }

        public javassist.bytecode.stackmap.TypeData.AbsTypeVar elementType() {
                r2 = this;
                r0 = r2
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.element
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData.BasicType isBasicType() {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public boolean is2WordType() {
                r2 = this;
                r0 = 0
                return r0
        }

        public static java.lang.String typeName(java.lang.String r5) {
                r0 = r5
                r1 = 0
                char r0 = r0.charAt(r1)
                r1 = 91
                if (r0 != r1) goto L1e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                java.lang.String r1 = "["
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r5
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L1e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                java.lang.String r1 = "[L"
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r5
                r2 = 46
                r3 = 47
                java.lang.String r1 = r1.replace(r2, r3)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ";"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public void setType(java.lang.String r5, javassist.ClassPool r6) throws javassist.bytecode.BadBytecode {
                r4 = this;
                r0 = r4
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.element
                r1 = r5
                java.lang.String r1 = javassist.bytecode.stackmap.TypeData.ArrayElement.access$000(r1)
                r2 = r6
                r0.setType(r1, r2)
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData
        protected javassist.bytecode.stackmap.TypeData.TypeVar toTypeVar(int r5) {
                r4 = this;
                r0 = r4
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.element
                r1 = r5
                r2 = 1
                int r1 = r1 + r2
                javassist.bytecode.stackmap.TypeData$TypeVar r0 = r0.toTypeVar(r1)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData getArrayType(int r5) throws javassist.NotFoundException {
                r4 = this;
                r0 = r4
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.element
                r1 = r5
                r2 = 1
                int r1 = r1 + r2
                javassist.bytecode.stackmap.TypeData r0 = r0.getArrayType(r1)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public int dfs(java.util.List<javassist.bytecode.stackmap.TypeData> r6, int r7, javassist.ClassPool r8) throws javassist.NotFoundException {
                r5 = this;
                r0 = r5
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = r0.element
                r1 = r6
                r2 = r7
                r3 = r8
                int r0 = r0.dfs(r1, r2, r3)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        java.lang.String toString2(java.util.Set<javassist.bytecode.stackmap.TypeData> r5) {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                java.lang.String r1 = "["
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r4
                javassist.bytecode.stackmap.TypeData$AbsTypeVar r1 = r1.element
                r2 = r5
                java.lang.String r1 = r1.toString2(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/TypeData$BasicType.class */
    protected static class BasicType extends javassist.bytecode.stackmap.TypeData {
        private java.lang.String name;
        private int typeTag;
        private char decodedName;

        public BasicType(java.lang.String r4, int r5, char r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.name = r1
                r0 = r3
                r1 = r5
                r0.typeTag = r1
                r0 = r3
                r1 = r6
                r0.decodedName = r1
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public int getTypeTag() {
                r2 = this;
                r0 = r2
                int r0 = r0.typeTag
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public int getTypeData(javassist.bytecode.ConstPool r3) {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData join() {
                r3 = this;
                r0 = r3
                javassist.bytecode.stackmap.TypeData$BasicType r1 = javassist.bytecode.stackmap.TypeTag.TOP
                if (r0 != r1) goto L9
                r0 = r3
                return r0
            L9:
                r0 = r3
                javassist.bytecode.stackmap.TypeData r0 = super.join()
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData.BasicType isBasicType() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public boolean is2WordType() {
                r3 = this;
                r0 = r3
                int r0 = r0.typeTag
                r1 = 4
                if (r0 == r1) goto L10
                r0 = r3
                int r0 = r0.typeTag
                r1 = 3
                if (r0 != r1) goto L14
            L10:
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public boolean eq(javassist.bytecode.stackmap.TypeData r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                if (r0 != r1) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public java.lang.String getName() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.name
                return r0
        }

        public char getDecodedName() {
                r2 = this;
                r0 = r2
                char r0 = r0.decodedName
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public void setType(java.lang.String r6, javassist.ClassPool r7) throws javassist.bytecode.BadBytecode {
                r5 = this;
                javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r3.<init>()
                java.lang.String r3 = "conflict: "
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r5
                java.lang.String r3 = r3.name
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = " and "
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r6
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData getArrayType(int r7) throws javassist.NotFoundException {
                r6 = this;
                r0 = r6
                javassist.bytecode.stackmap.TypeData$BasicType r1 = javassist.bytecode.stackmap.TypeTag.TOP
                if (r0 != r1) goto L9
                r0 = r6
                return r0
            L9:
                r0 = r7
                if (r0 >= 0) goto L2b
                javassist.NotFoundException r0 = new javassist.NotFoundException
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r3.<init>()
                java.lang.String r3 = "no element type: "
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r6
                java.lang.String r3 = r3.name
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
            L2b:
                r0 = r7
                if (r0 != 0) goto L31
                r0 = r6
                return r0
            L31:
                r0 = r7
                r1 = 1
                int r0 = r0 + r1
                char[] r0 = new char[r0]
                r8 = r0
                r0 = 0
                r9 = r0
            L39:
                r0 = r9
                r1 = r7
                if (r0 >= r1) goto L49
                r0 = r8
                r1 = r9
                r2 = 91
                r0[r1] = r2
                int r9 = r9 + 1
                goto L39
            L49:
                r0 = r8
                r1 = r7
                r2 = r6
                char r2 = r2.decodedName
                r0[r1] = r2
                javassist.bytecode.stackmap.TypeData$ClassName r0 = new javassist.bytecode.stackmap.TypeData$ClassName
                r1 = r0
                java.lang.String r2 = new java.lang.String
                r3 = r2
                r4 = r8
                r3.<init>(r4)
                r1.<init>(r2)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        java.lang.String toString2(java.util.Set<javassist.bytecode.stackmap.TypeData> r3) {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.name
                return r0
        }

        static /* synthetic */ char access$100(javassist.bytecode.stackmap.TypeData.BasicType r2) {
                r0 = r2
                char r0 = r0.decodedName
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/TypeData$ClassName.class */
    public static class ClassName extends javassist.bytecode.stackmap.TypeData {
        private java.lang.String name;

        public ClassName(java.lang.String r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.name = r1
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public java.lang.String getName() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.name
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData.BasicType isBasicType() {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public boolean is2WordType() {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public int getTypeTag() {
                r2 = this;
                r0 = 7
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public int getTypeData(javassist.bytecode.ConstPool r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                java.lang.String r1 = r1.getName()
                int r0 = r0.addClassInfo(r1)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public boolean eq(javassist.bytecode.stackmap.TypeData r4) {
                r3 = this;
                r0 = r4
                boolean r0 = r0.isUninit()
                if (r0 == 0) goto Ld
                r0 = r4
                r1 = r3
                boolean r0 = r0.eq(r1)
                return r0
            Ld:
                r0 = r3
                java.lang.String r0 = r0.name
                r1 = r4
                java.lang.String r1 = r1.getName()
                boolean r0 = r0.equals(r1)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public void setType(java.lang.String r2, javassist.ClassPool r3) throws javassist.bytecode.BadBytecode {
                r1 = this;
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData getArrayType(int r8) throws javassist.NotFoundException {
                r7 = this;
                r0 = r8
                if (r0 != 0) goto L6
                r0 = r7
                return r0
            L6:
                r0 = r8
                if (r0 <= 0) goto L70
                r0 = r8
                char[] r0 = new char[r0]
                r9 = r0
                r0 = 0
                r10 = r0
            L10:
                r0 = r10
                r1 = r8
                if (r0 >= r1) goto L20
                r0 = r9
                r1 = r10
                r2 = 91
                r0[r1] = r2
                int r10 = r10 + 1
                goto L10
            L20:
                r0 = r7
                java.lang.String r0 = r0.getName()
                r10 = r0
                r0 = r10
                r1 = 0
                char r0 = r0.charAt(r1)
                r1 = 91
                if (r0 == r1) goto L4f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                java.lang.String r1 = "L"
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r10
                r2 = 46
                r3 = 47
                java.lang.String r1 = r1.replace(r2, r3)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ";"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r10 = r0
            L4f:
                javassist.bytecode.stackmap.TypeData$ClassName r0 = new javassist.bytecode.stackmap.TypeData$ClassName
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r3.<init>()
                java.lang.String r3 = new java.lang.String
                r4 = r3
                r5 = r9
                r4.<init>(r5)
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r10
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                return r0
            L70:
                r0 = 0
                r9 = r0
            L72:
                r0 = r9
                r1 = r8
                int r1 = -r1
                if (r0 >= r1) goto Lb2
                r0 = r7
                java.lang.String r0 = r0.name
                r1 = r9
                char r0 = r0.charAt(r1)
                r1 = 91
                if (r0 == r1) goto Lac
                javassist.NotFoundException r0 = new javassist.NotFoundException
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r3.<init>()
                java.lang.String r3 = "no "
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r8
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = " dimensional array type: "
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r7
                java.lang.String r3 = r3.getName()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
            Lac:
                int r9 = r9 + 1
                goto L72
            Lb2:
                r0 = r7
                java.lang.String r0 = r0.name
                r1 = r8
                int r1 = -r1
                char r0 = r0.charAt(r1)
                r9 = r0
                r0 = r9
                r1 = 91
                if (r0 != r1) goto Ld3
                javassist.bytecode.stackmap.TypeData$ClassName r0 = new javassist.bytecode.stackmap.TypeData$ClassName
                r1 = r0
                r2 = r7
                java.lang.String r2 = r2.name
                r3 = r8
                int r3 = -r3
                java.lang.String r2 = r2.substring(r3)
                r1.<init>(r2)
                return r0
            Ld3:
                r0 = r9
                r1 = 76
                if (r0 != r1) goto Lfc
                javassist.bytecode.stackmap.TypeData$ClassName r0 = new javassist.bytecode.stackmap.TypeData$ClassName
                r1 = r0
                r2 = r7
                java.lang.String r2 = r2.name
                r3 = r8
                int r3 = -r3
                r4 = 1
                int r3 = r3 + r4
                r4 = r7
                java.lang.String r4 = r4.name
                int r4 = r4.length()
                r5 = 1
                int r4 = r4 - r5
                java.lang.String r2 = r2.substring(r3, r4)
                r3 = 47
                r4 = 46
                java.lang.String r2 = r2.replace(r3, r4)
                r1.<init>(r2)
                return r0
            Lfc:
                r0 = r9
                javassist.bytecode.stackmap.TypeData$BasicType r1 = javassist.bytecode.stackmap.TypeTag.DOUBLE
                char r1 = javassist.bytecode.stackmap.TypeData.BasicType.access$100(r1)
                if (r0 != r1) goto L10a
                javassist.bytecode.stackmap.TypeData$BasicType r0 = javassist.bytecode.stackmap.TypeTag.DOUBLE
                return r0
            L10a:
                r0 = r9
                javassist.bytecode.stackmap.TypeData$BasicType r1 = javassist.bytecode.stackmap.TypeTag.FLOAT
                char r1 = javassist.bytecode.stackmap.TypeData.BasicType.access$100(r1)
                if (r0 != r1) goto L118
                javassist.bytecode.stackmap.TypeData$BasicType r0 = javassist.bytecode.stackmap.TypeTag.FLOAT
                return r0
            L118:
                r0 = r9
                javassist.bytecode.stackmap.TypeData$BasicType r1 = javassist.bytecode.stackmap.TypeTag.LONG
                char r1 = javassist.bytecode.stackmap.TypeData.BasicType.access$100(r1)
                if (r0 != r1) goto L126
                javassist.bytecode.stackmap.TypeData$BasicType r0 = javassist.bytecode.stackmap.TypeTag.LONG
                return r0
            L126:
                javassist.bytecode.stackmap.TypeData$BasicType r0 = javassist.bytecode.stackmap.TypeTag.INTEGER
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        java.lang.String toString2(java.util.Set<javassist.bytecode.stackmap.TypeData> r3) {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.name
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/TypeData$NullType.class */
    public static class NullType extends javassist.bytecode.stackmap.TypeData.ClassName {
        public NullType() {
                r3 = this;
                r0 = r3
                java.lang.String r1 = "null-type"
                r0.<init>(r1)
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData.ClassName, javassist.bytecode.stackmap.TypeData
        public int getTypeTag() {
                r2 = this;
                r0 = 5
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public boolean isNullType() {
                r2 = this;
                r0 = 1
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData.ClassName, javassist.bytecode.stackmap.TypeData
        public int getTypeData(javassist.bytecode.ConstPool r3) {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData.ClassName, javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData getArrayType(int r3) {
                r2 = this;
                r0 = r2
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/TypeData$TypeVar.class */
    public static class TypeVar extends javassist.bytecode.stackmap.TypeData.AbsTypeVar {
        protected java.util.List<javassist.bytecode.stackmap.TypeData> lowers;
        protected java.util.List<javassist.bytecode.stackmap.TypeData> usedBy;
        protected java.util.List<java.lang.String> uppers;
        protected java.lang.String fixedType;
        private boolean is2WordType;
        private int visited;
        private int smallest;
        private boolean inList;
        private int dimension;

        public TypeVar(javassist.bytecode.stackmap.TypeData r6) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                r1 = 0
                r0.visited = r1
                r0 = r5
                r1 = 0
                r0.smallest = r1
                r0 = r5
                r1 = 0
                r0.inList = r1
                r0 = r5
                r1 = 0
                r0.dimension = r1
                r0 = r5
                r1 = 0
                r0.uppers = r1
                r0 = r5
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r3 = 2
                r2.<init>(r3)
                r0.lowers = r1
                r0 = r5
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r3 = 2
                r2.<init>(r3)
                r0.usedBy = r1
                r0 = r5
                r1 = r6
                r0.merge(r1)
                r0 = r5
                r1 = 0
                r0.fixedType = r1
                r0 = r5
                r1 = r6
                boolean r1 = r1.is2WordType()
                r0.is2WordType = r1
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public java.lang.String getName() {
                r3 = this;
                r0 = r3
                java.lang.String r0 = r0.fixedType
                if (r0 != 0) goto L18
                r0 = r3
                java.util.List<javassist.bytecode.stackmap.TypeData> r0 = r0.lowers
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                javassist.bytecode.stackmap.TypeData r0 = (javassist.bytecode.stackmap.TypeData) r0
                java.lang.String r0 = r0.getName()
                return r0
            L18:
                r0 = r3
                java.lang.String r0 = r0.fixedType
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData.BasicType isBasicType() {
                r3 = this;
                r0 = r3
                java.lang.String r0 = r0.fixedType
                if (r0 != 0) goto L18
                r0 = r3
                java.util.List<javassist.bytecode.stackmap.TypeData> r0 = r0.lowers
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                javassist.bytecode.stackmap.TypeData r0 = (javassist.bytecode.stackmap.TypeData) r0
                javassist.bytecode.stackmap.TypeData$BasicType r0 = r0.isBasicType()
                return r0
            L18:
                r0 = 0
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public boolean is2WordType() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.fixedType
                if (r0 != 0) goto Lc
                r0 = r2
                boolean r0 = r0.is2WordType
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public boolean isNullType() {
                r3 = this;
                r0 = r3
                java.lang.String r0 = r0.fixedType
                if (r0 != 0) goto L18
                r0 = r3
                java.util.List<javassist.bytecode.stackmap.TypeData> r0 = r0.lowers
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                javassist.bytecode.stackmap.TypeData r0 = (javassist.bytecode.stackmap.TypeData) r0
                boolean r0 = r0.isNullType()
                return r0
            L18:
                r0 = 0
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public boolean isUninit() {
                r3 = this;
                r0 = r3
                java.lang.String r0 = r0.fixedType
                if (r0 != 0) goto L18
                r0 = r3
                java.util.List<javassist.bytecode.stackmap.TypeData> r0 = r0.lowers
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                javassist.bytecode.stackmap.TypeData r0 = (javassist.bytecode.stackmap.TypeData) r0
                boolean r0 = r0.isUninit()
                return r0
            L18:
                r0 = 0
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData.AbsTypeVar
        public void merge(javassist.bytecode.stackmap.TypeData r4) {
                r3 = this;
                r0 = r3
                java.util.List<javassist.bytecode.stackmap.TypeData> r0 = r0.lowers
                r1 = r4
                boolean r0 = r0.add(r1)
                r0 = r4
                boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.TypeVar
                if (r0 == 0) goto L20
                r0 = r4
                javassist.bytecode.stackmap.TypeData$TypeVar r0 = (javassist.bytecode.stackmap.TypeData.TypeVar) r0
                java.util.List<javassist.bytecode.stackmap.TypeData> r0 = r0.usedBy
                r1 = r3
                boolean r0 = r0.add(r1)
            L20:
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData.AbsTypeVar, javassist.bytecode.stackmap.TypeData
        public int getTypeTag() {
                r3 = this;
                r0 = r3
                java.lang.String r0 = r0.fixedType
                if (r0 != 0) goto L18
                r0 = r3
                java.util.List<javassist.bytecode.stackmap.TypeData> r0 = r0.lowers
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                javassist.bytecode.stackmap.TypeData r0 = (javassist.bytecode.stackmap.TypeData) r0
                int r0 = r0.getTypeTag()
                return r0
            L18:
                r0 = r3
                int r0 = super.getTypeTag()
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData.AbsTypeVar, javassist.bytecode.stackmap.TypeData
        public int getTypeData(javassist.bytecode.ConstPool r4) {
                r3 = this;
                r0 = r3
                java.lang.String r0 = r0.fixedType
                if (r0 != 0) goto L19
                r0 = r3
                java.util.List<javassist.bytecode.stackmap.TypeData> r0 = r0.lowers
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                javassist.bytecode.stackmap.TypeData r0 = (javassist.bytecode.stackmap.TypeData) r0
                r1 = r4
                int r0 = r0.getTypeData(r1)
                return r0
            L19:
                r0 = r3
                r1 = r4
                int r0 = super.getTypeData(r1)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public void setType(java.lang.String r5, javassist.ClassPool r6) throws javassist.bytecode.BadBytecode {
                r4 = this;
                r0 = r4
                java.util.List<java.lang.String> r0 = r0.uppers
                if (r0 != 0) goto L12
                r0 = r4
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r2.<init>()
                r0.uppers = r1
            L12:
                r0 = r4
                java.util.List<java.lang.String> r0 = r0.uppers
                r1 = r5
                boolean r0 = r0.add(r1)
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData
        protected javassist.bytecode.stackmap.TypeData.TypeVar toTypeVar(int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.dimension = r1
                r0 = r3
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData getArrayType(int r5) throws javassist.NotFoundException {
                r4 = this;
                r0 = r5
                if (r0 != 0) goto L6
                r0 = r4
                return r0
            L6:
                r0 = r4
                javassist.bytecode.stackmap.TypeData$BasicType r0 = r0.isBasicType()
                r6 = r0
                r0 = r6
                if (r0 != 0) goto L2e
                r0 = r4
                boolean r0 = r0.isNullType()
                if (r0 == 0) goto L1e
                javassist.bytecode.stackmap.TypeData$NullType r0 = new javassist.bytecode.stackmap.TypeData$NullType
                r1 = r0
                r1.<init>()
                return r0
            L1e:
                javassist.bytecode.stackmap.TypeData$ClassName r0 = new javassist.bytecode.stackmap.TypeData$ClassName
                r1 = r0
                r2 = r4
                java.lang.String r2 = r2.getName()
                r1.<init>(r2)
                r1 = r5
                javassist.bytecode.stackmap.TypeData r0 = r0.getArrayType(r1)
                return r0
            L2e:
                r0 = r6
                r1 = r5
                javassist.bytecode.stackmap.TypeData r0 = r0.getArrayType(r1)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public int dfs(java.util.List<javassist.bytecode.stackmap.TypeData> r6, int r7, javassist.ClassPool r8) throws javassist.NotFoundException {
                r5 = this;
                r0 = r5
                int r0 = r0.visited
                if (r0 <= 0) goto L9
                r0 = r7
                return r0
            L9:
                r0 = r5
                r1 = r5
                int r7 = r7 + 1
                r2 = r7
                r3 = r2; r2 = r1; r1 = r3; 
                r2.smallest = r3
                r0.visited = r1
                r0 = r6
                r1 = r5
                boolean r0 = r0.add(r1)
                r0 = r5
                r1 = 1
                r0.inList = r1
                r0 = r5
                java.util.List<javassist.bytecode.stackmap.TypeData> r0 = r0.lowers
                int r0 = r0.size()
                r9 = r0
                r0 = 0
                r10 = r0
            L31:
                r0 = r10
                r1 = r9
                if (r0 >= r1) goto La0
                r0 = r5
                java.util.List<javassist.bytecode.stackmap.TypeData> r0 = r0.lowers
                r1 = r10
                java.lang.Object r0 = r0.get(r1)
                javassist.bytecode.stackmap.TypeData r0 = (javassist.bytecode.stackmap.TypeData) r0
                r1 = r5
                int r1 = r1.dimension
                javassist.bytecode.stackmap.TypeData$TypeVar r0 = r0.toTypeVar(r1)
                r11 = r0
                r0 = r11
                if (r0 == 0) goto L9a
                r0 = r11
                int r0 = r0.visited
                if (r0 != 0) goto L7d
                r0 = r11
                r1 = r6
                r2 = r7
                r3 = r8
                int r0 = r0.dfs(r1, r2, r3)
                r7 = r0
                r0 = r11
                int r0 = r0.smallest
                r1 = r5
                int r1 = r1.smallest
                if (r0 >= r1) goto L9a
                r0 = r5
                r1 = r11
                int r1 = r1.smallest
                r0.smallest = r1
                goto L9a
            L7d:
                r0 = r11
                boolean r0 = r0.inList
                if (r0 == 0) goto L9a
                r0 = r11
                int r0 = r0.visited
                r1 = r5
                int r1 = r1.smallest
                if (r0 >= r1) goto L9a
                r0 = r5
                r1 = r11
                int r1 = r1.visited
                r0.smallest = r1
            L9a:
                int r10 = r10 + 1
                goto L31
            La0:
                r0 = r5
                int r0 = r0.visited
                r1 = r5
                int r1 = r1.smallest
                if (r0 != r1) goto Le4
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r10 = r0
            Lb4:
                r0 = r6
                r1 = r6
                int r1 = r1.size()
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object r0 = r0.remove(r1)
                javassist.bytecode.stackmap.TypeData$TypeVar r0 = (javassist.bytecode.stackmap.TypeData.TypeVar) r0
                r11 = r0
                r0 = r11
                r1 = 0
                r0.inList = r1
                r0 = r10
                r1 = r11
                boolean r0 = r0.add(r1)
                r0 = r11
                r1 = r5
                if (r0 != r1) goto Lb4
                r0 = r5
                r1 = r10
                r2 = r8
                r0.fixTypes(r1, r2)
            Le4:
                r0 = r7
                return r0
        }

        private void fixTypes(java.util.List<javassist.bytecode.stackmap.TypeData> r7, javassist.ClassPool r8) throws javassist.NotFoundException {
                r6 = this;
                java.util.HashSet r0 = new java.util.HashSet
                r1 = r0
                r1.<init>()
                r9 = r0
                r0 = 0
                r10 = r0
                r0 = 0
                r11 = r0
                r0 = r7
                int r0 = r0.size()
                r12 = r0
                r0 = 0
                r13 = r0
            L19:
                r0 = r13
                r1 = r12
                if (r0 >= r1) goto Ld4
                r0 = r7
                r1 = r13
                java.lang.Object r0 = r0.get(r1)
                javassist.bytecode.stackmap.TypeData$TypeVar r0 = (javassist.bytecode.stackmap.TypeData.TypeVar) r0
                r14 = r0
                r0 = r14
                java.util.List<javassist.bytecode.stackmap.TypeData> r0 = r0.lowers
                r15 = r0
                r0 = r15
                int r0 = r0.size()
                r16 = r0
                r0 = 0
                r17 = r0
            L40:
                r0 = r17
                r1 = r16
                if (r0 >= r1) goto Lce
                r0 = r15
                r1 = r17
                java.lang.Object r0 = r0.get(r1)
                javassist.bytecode.stackmap.TypeData r0 = (javassist.bytecode.stackmap.TypeData) r0
                r18 = r0
                r0 = r18
                r1 = r14
                int r1 = r1.dimension
                javassist.bytecode.stackmap.TypeData r0 = r0.getArrayType(r1)
                r19 = r0
                r0 = r19
                javassist.bytecode.stackmap.TypeData$BasicType r0 = r0.isBasicType()
                r20 = r0
                r0 = r11
                if (r0 != 0) goto L8e
                r0 = r20
                if (r0 != 0) goto L84
                r0 = 0
                r10 = r0
                r0 = r19
                r11 = r0
                r0 = r19
                boolean r0 = r0.isUninit()
                if (r0 == 0) goto Laf
                goto Lce
            L84:
                r0 = 1
                r10 = r0
                r0 = r20
                r11 = r0
                goto Laf
            L8e:
                r0 = r20
                if (r0 != 0) goto L98
                r0 = r10
                if (r0 != 0) goto La4
            L98:
                r0 = r20
                if (r0 == 0) goto Laf
                r0 = r11
                r1 = r20
                if (r0 == r1) goto Laf
            La4:
                r0 = 1
                r10 = r0
                javassist.bytecode.stackmap.TypeData$BasicType r0 = javassist.bytecode.stackmap.TypeTag.TOP
                r11 = r0
                goto Lce
            Laf:
                r0 = r20
                if (r0 != 0) goto Lc8
                r0 = r19
                boolean r0 = r0.isNullType()
                if (r0 != 0) goto Lc8
                r0 = r9
                r1 = r19
                java.lang.String r1 = r1.getName()
                boolean r0 = r0.add(r1)
            Lc8:
                int r17 = r17 + 1
                goto L40
            Lce:
                int r13 = r13 + 1
                goto L19
            Ld4:
                r0 = r10
                if (r0 == 0) goto Lec
                r0 = r6
                r1 = r11
                boolean r1 = r1.is2WordType()
                r0.is2WordType = r1
                r0 = r6
                r1 = r7
                r2 = r11
                r0.fixTypes1(r1, r2)
                goto L103
            Lec:
                r0 = r6
                r1 = r7
                r2 = r9
                r3 = r8
                java.lang.String r0 = r0.fixTypes2(r1, r2, r3)
                r13 = r0
                r0 = r6
                r1 = r7
                javassist.bytecode.stackmap.TypeData$ClassName r2 = new javassist.bytecode.stackmap.TypeData$ClassName
                r3 = r2
                r4 = r13
                r3.<init>(r4)
                r0.fixTypes1(r1, r2)
            L103:
                return
        }

        private void fixTypes1(java.util.List<javassist.bytecode.stackmap.TypeData> r4, javassist.bytecode.stackmap.TypeData r5) throws javassist.NotFoundException {
                r3 = this;
                r0 = r4
                int r0 = r0.size()
                r6 = r0
                r0 = 0
                r7 = r0
            La:
                r0 = r7
                r1 = r6
                if (r0 >= r1) goto L65
                r0 = r4
                r1 = r7
                java.lang.Object r0 = r0.get(r1)
                javassist.bytecode.stackmap.TypeData$TypeVar r0 = (javassist.bytecode.stackmap.TypeData.TypeVar) r0
                r8 = r0
                r0 = r5
                r1 = r8
                int r1 = r1.dimension
                int r1 = -r1
                javassist.bytecode.stackmap.TypeData r0 = r0.getArrayType(r1)
                r9 = r0
                r0 = r9
                javassist.bytecode.stackmap.TypeData$BasicType r0 = r0.isBasicType()
                if (r0 != 0) goto L3e
                r0 = r8
                r1 = r9
                java.lang.String r1 = r1.getName()
                r0.fixedType = r1
                goto L5f
            L3e:
                r0 = r8
                java.util.List<javassist.bytecode.stackmap.TypeData> r0 = r0.lowers
                r0.clear()
                r0 = r8
                java.util.List<javassist.bytecode.stackmap.TypeData> r0 = r0.lowers
                r1 = r9
                boolean r0 = r0.add(r1)
                r0 = r8
                r1 = r9
                boolean r1 = r1.is2WordType()
                r0.is2WordType = r1
            L5f:
                int r7 = r7 + 1
                goto La
            L65:
                return
        }

        private java.lang.String fixTypes2(java.util.List<javassist.bytecode.stackmap.TypeData> r7, java.util.Set<java.lang.String> r8, javassist.ClassPool r9) throws javassist.NotFoundException {
                r6 = this;
                r0 = r8
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
                r0 = r8
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L13
                r0 = 0
                return r0
            L13:
                r0 = r8
                int r0 = r0.size()
                r1 = 1
                if (r0 != r1) goto L28
                r0 = r10
                java.lang.Object r0 = r0.next()
                java.lang.String r0 = (java.lang.String) r0
                return r0
            L28:
                r0 = r9
                r1 = r10
                java.lang.Object r1 = r1.next()
                java.lang.String r1 = (java.lang.String) r1
                javassist.CtClass r0 = r0.get(r1)
                r11 = r0
            L38:
                r0 = r10
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L5a
                r0 = r11
                r1 = r9
                r2 = r10
                java.lang.Object r2 = r2.next()
                java.lang.String r2 = (java.lang.String) r2
                javassist.CtClass r1 = r1.get(r2)
                javassist.CtClass r0 = commonSuperClassEx(r0, r1)
                r11 = r0
                goto L38
            L5a:
                r0 = r11
                javassist.CtClass r0 = r0.getSuperclass()
                if (r0 == 0) goto L6a
                r0 = r11
                boolean r0 = isObjectArray(r0)
                if (r0 == 0) goto L7b
            L6a:
                r0 = r6
                r1 = r7
                r2 = r9
                java.util.HashSet r3 = new java.util.HashSet
                r4 = r3
                r4.<init>()
                r4 = r11
                javassist.CtClass r0 = r0.fixByUppers(r1, r2, r3, r4)
                r11 = r0
            L7b:
                r0 = r11
                boolean r0 = r0.isArray()
                if (r0 == 0) goto L89
                r0 = r11
                java.lang.String r0 = javassist.bytecode.Descriptor.toJvmName(r0)
                return r0
            L89:
                r0 = r11
                java.lang.String r0 = r0.getName()
                return r0
        }

        private static boolean isObjectArray(javassist.CtClass r2) throws javassist.NotFoundException {
                r0 = r2
                boolean r0 = r0.isArray()
                if (r0 == 0) goto L15
                r0 = r2
                javassist.CtClass r0 = r0.getComponentType()
                javassist.CtClass r0 = r0.getSuperclass()
                if (r0 != 0) goto L15
                r0 = 1
                goto L16
            L15:
                r0 = 0
            L16:
                return r0
        }

        private javassist.CtClass fixByUppers(java.util.List<javassist.bytecode.stackmap.TypeData> r7, javassist.ClassPool r8, java.util.Set<javassist.bytecode.stackmap.TypeData> r9, javassist.CtClass r10) throws javassist.NotFoundException {
                r6 = this;
                r0 = r7
                if (r0 != 0) goto L7
                r0 = r10
                return r0
            L7:
                r0 = r7
                int r0 = r0.size()
                r11 = r0
                r0 = 0
                r12 = r0
            L12:
                r0 = r12
                r1 = r11
                if (r0 >= r1) goto L90
                r0 = r7
                r1 = r12
                java.lang.Object r0 = r0.get(r1)
                javassist.bytecode.stackmap.TypeData$TypeVar r0 = (javassist.bytecode.stackmap.TypeData.TypeVar) r0
                r13 = r0
                r0 = r9
                r1 = r13
                boolean r0 = r0.add(r1)
                if (r0 != 0) goto L34
                r0 = r10
                return r0
            L34:
                r0 = r13
                java.util.List<java.lang.String> r0 = r0.uppers
                if (r0 == 0) goto L7b
                r0 = r13
                java.util.List<java.lang.String> r0 = r0.uppers
                int r0 = r0.size()
                r14 = r0
                r0 = 0
                r15 = r0
            L4b:
                r0 = r15
                r1 = r14
                if (r0 >= r1) goto L7b
                r0 = r8
                r1 = r13
                java.util.List<java.lang.String> r1 = r1.uppers
                r2 = r15
                java.lang.Object r1 = r1.get(r2)
                java.lang.String r1 = (java.lang.String) r1
                javassist.CtClass r0 = r0.get(r1)
                r16 = r0
                r0 = r16
                r1 = r10
                boolean r0 = r0.subtypeOf(r1)
                if (r0 == 0) goto L75
                r0 = r16
                r10 = r0
            L75:
                int r15 = r15 + 1
                goto L4b
            L7b:
                r0 = r6
                r1 = r13
                java.util.List<javassist.bytecode.stackmap.TypeData> r1 = r1.usedBy
                r2 = r8
                r3 = r9
                r4 = r10
                javassist.CtClass r0 = r0.fixByUppers(r1, r2, r3, r4)
                r10 = r0
                int r12 = r12 + 1
                goto L12
            L90:
                r0 = r10
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        java.lang.String toString2(java.util.Set<javassist.bytecode.stackmap.TypeData> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                boolean r0 = r0.add(r1)
                r0 = r3
                java.util.List<javassist.bytecode.stackmap.TypeData> r0 = r0.lowers
                int r0 = r0.size()
                if (r0 <= 0) goto L36
                r0 = r3
                java.util.List<javassist.bytecode.stackmap.TypeData> r0 = r0.lowers
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                javassist.bytecode.stackmap.TypeData r0 = (javassist.bytecode.stackmap.TypeData) r0
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L36
                r0 = r4
                r1 = r5
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L36
                r0 = r5
                r1 = r4
                java.lang.String r0 = r0.toString2(r1)
                return r0
            L36:
                java.lang.String r0 = "?"
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/TypeData$UninitData.class */
    public static class UninitData extends javassist.bytecode.stackmap.TypeData.ClassName {
        int offset;
        boolean initialized;

        UninitData(int r4, java.lang.String r5) {
                r3 = this;
                r0 = r3
                r1 = r5
                r0.<init>(r1)
                r0 = r3
                r1 = r4
                r0.offset = r1
                r0 = r3
                r1 = 0
                r0.initialized = r1
                return
        }

        public javassist.bytecode.stackmap.TypeData.UninitData copy() {
                r5 = this;
                javassist.bytecode.stackmap.TypeData$UninitData r0 = new javassist.bytecode.stackmap.TypeData$UninitData
                r1 = r0
                r2 = r5
                int r2 = r2.offset
                r3 = r5
                java.lang.String r3 = r3.getName()
                r1.<init>(r2, r3)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData.ClassName, javassist.bytecode.stackmap.TypeData
        public int getTypeTag() {
                r2 = this;
                r0 = 8
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData.ClassName, javassist.bytecode.stackmap.TypeData
        public int getTypeData(javassist.bytecode.ConstPool r3) {
                r2 = this;
                r0 = r2
                int r0 = r0.offset
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData join() {
                r6 = this;
                r0 = r6
                boolean r0 = r0.initialized
                if (r0 == 0) goto L1a
                javassist.bytecode.stackmap.TypeData$TypeVar r0 = new javassist.bytecode.stackmap.TypeData$TypeVar
                r1 = r0
                javassist.bytecode.stackmap.TypeData$ClassName r2 = new javassist.bytecode.stackmap.TypeData$ClassName
                r3 = r2
                r4 = r6
                java.lang.String r4 = r4.getName()
                r3.<init>(r4)
                r1.<init>(r2)
                return r0
            L1a:
                javassist.bytecode.stackmap.TypeData$UninitTypeVar r0 = new javassist.bytecode.stackmap.TypeData$UninitTypeVar
                r1 = r0
                r2 = r6
                javassist.bytecode.stackmap.TypeData$UninitData r2 = r2.copy()
                r1.<init>(r2)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public boolean isUninit() {
                r2 = this;
                r0 = 1
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData.ClassName, javassist.bytecode.stackmap.TypeData
        public boolean eq(javassist.bytecode.stackmap.TypeData r4) {
                r3 = this;
                r0 = r4
                boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.UninitData
                if (r0 == 0) goto L2b
                r0 = r4
                javassist.bytecode.stackmap.TypeData$UninitData r0 = (javassist.bytecode.stackmap.TypeData.UninitData) r0
                r5 = r0
                r0 = r3
                int r0 = r0.offset
                r1 = r5
                int r1 = r1.offset
                if (r0 != r1) goto L29
                r0 = r3
                java.lang.String r0 = r0.getName()
                r1 = r5
                java.lang.String r1 = r1.getName()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L29
                r0 = 1
                goto L2a
            L29:
                r0 = 0
            L2a:
                return r0
            L2b:
                r0 = 0
                return r0
        }

        public int offset() {
                r2 = this;
                r0 = r2
                int r0 = r0.offset
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public void constructorCalled(int r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                int r1 = r1.offset
                if (r0 != r1) goto Ld
                r0 = r3
                r1 = 1
                r0.initialized = r1
            Ld:
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData.ClassName, javassist.bytecode.stackmap.TypeData
        java.lang.String toString2(java.util.Set<javassist.bytecode.stackmap.TypeData> r4) {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r1 = r3
                java.lang.String r1 = r1.getName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ","
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r3
                int r1 = r1.offset
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/TypeData$UninitThis.class */
    public static class UninitThis extends javassist.bytecode.stackmap.TypeData.UninitData {
        UninitThis(java.lang.String r5) {
                r4 = this;
                r0 = r4
                r1 = -1
                r2 = r5
                r0.<init>(r1, r2)
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData.UninitData
        public javassist.bytecode.stackmap.TypeData.UninitData copy() {
                r4 = this;
                javassist.bytecode.stackmap.TypeData$UninitThis r0 = new javassist.bytecode.stackmap.TypeData$UninitThis
                r1 = r0
                r2 = r4
                java.lang.String r2 = r2.getName()
                r1.<init>(r2)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData.UninitData, javassist.bytecode.stackmap.TypeData.ClassName, javassist.bytecode.stackmap.TypeData
        public int getTypeTag() {
                r2 = this;
                r0 = 6
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData.UninitData, javassist.bytecode.stackmap.TypeData.ClassName, javassist.bytecode.stackmap.TypeData
        public int getTypeData(javassist.bytecode.ConstPool r3) {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData.UninitData, javassist.bytecode.stackmap.TypeData.ClassName, javassist.bytecode.stackmap.TypeData
        java.lang.String toString2(java.util.Set<javassist.bytecode.stackmap.TypeData> r3) {
                r2 = this;
                java.lang.String r0 = "uninit:this"
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/TypeData$UninitTypeVar.class */
    public static class UninitTypeVar extends javassist.bytecode.stackmap.TypeData.AbsTypeVar {
        protected javassist.bytecode.stackmap.TypeData type;

        public UninitTypeVar(javassist.bytecode.stackmap.TypeData.UninitData r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.type = r1
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData.AbsTypeVar, javassist.bytecode.stackmap.TypeData
        public int getTypeTag() {
                r2 = this;
                r0 = r2
                javassist.bytecode.stackmap.TypeData r0 = r0.type
                int r0 = r0.getTypeTag()
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData.AbsTypeVar, javassist.bytecode.stackmap.TypeData
        public int getTypeData(javassist.bytecode.ConstPool r4) {
                r3 = this;
                r0 = r3
                javassist.bytecode.stackmap.TypeData r0 = r0.type
                r1 = r4
                int r0 = r0.getTypeData(r1)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData.BasicType isBasicType() {
                r2 = this;
                r0 = r2
                javassist.bytecode.stackmap.TypeData r0 = r0.type
                javassist.bytecode.stackmap.TypeData$BasicType r0 = r0.isBasicType()
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public boolean is2WordType() {
                r2 = this;
                r0 = r2
                javassist.bytecode.stackmap.TypeData r0 = r0.type
                boolean r0 = r0.is2WordType()
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public boolean isUninit() {
                r2 = this;
                r0 = r2
                javassist.bytecode.stackmap.TypeData r0 = r0.type
                boolean r0 = r0.isUninit()
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData.AbsTypeVar, javassist.bytecode.stackmap.TypeData
        public boolean eq(javassist.bytecode.stackmap.TypeData r4) {
                r3 = this;
                r0 = r3
                javassist.bytecode.stackmap.TypeData r0 = r0.type
                r1 = r4
                boolean r0 = r0.eq(r1)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public java.lang.String getName() {
                r2 = this;
                r0 = r2
                javassist.bytecode.stackmap.TypeData r0 = r0.type
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        protected javassist.bytecode.stackmap.TypeData.TypeVar toTypeVar(int r3) {
                r2 = this;
                r0 = 0
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData join() {
                r2 = this;
                r0 = r2
                javassist.bytecode.stackmap.TypeData r0 = r0.type
                javassist.bytecode.stackmap.TypeData r0 = r0.join()
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public void setType(java.lang.String r5, javassist.ClassPool r6) throws javassist.bytecode.BadBytecode {
                r4 = this;
                r0 = r4
                javassist.bytecode.stackmap.TypeData r0 = r0.type
                r1 = r5
                r2 = r6
                r0.setType(r1, r2)
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData.AbsTypeVar
        public void merge(javassist.bytecode.stackmap.TypeData r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                javassist.bytecode.stackmap.TypeData r1 = r1.type
                boolean r0 = r0.eq(r1)
                if (r0 != 0) goto L12
                r0 = r3
                javassist.bytecode.stackmap.TypeData$BasicType r1 = javassist.bytecode.stackmap.TypeTag.TOP
                r0.type = r1
            L12:
                return
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public void constructorCalled(int r4) {
                r3 = this;
                r0 = r3
                javassist.bytecode.stackmap.TypeData r0 = r0.type
                r1 = r4
                r0.constructorCalled(r1)
                return
        }

        public int offset() {
                r4 = this;
                r0 = r4
                javassist.bytecode.stackmap.TypeData r0 = r0.type
                boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.UninitData
                if (r0 == 0) goto L15
                r0 = r4
                javassist.bytecode.stackmap.TypeData r0 = r0.type
                javassist.bytecode.stackmap.TypeData$UninitData r0 = (javassist.bytecode.stackmap.TypeData.UninitData) r0
                int r0 = r0.offset
                return r0
            L15:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.String r2 = "not available"
                r1.<init>(r2)
                throw r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        public javassist.bytecode.stackmap.TypeData getArrayType(int r4) throws javassist.NotFoundException {
                r3 = this;
                r0 = r3
                javassist.bytecode.stackmap.TypeData r0 = r0.type
                r1 = r4
                javassist.bytecode.stackmap.TypeData r0 = r0.getArrayType(r1)
                return r0
        }

        @Override // javassist.bytecode.stackmap.TypeData
        java.lang.String toString2(java.util.Set<javassist.bytecode.stackmap.TypeData> r3) {
                r2 = this;
                java.lang.String r0 = ""
                return r0
        }
    }

    public static javassist.bytecode.stackmap.TypeData[] make(int r4) {
            r0 = r4
            javassist.bytecode.stackmap.TypeData[] r0 = new javassist.bytecode.stackmap.TypeData[r0]
            r5 = r0
            r0 = 0
            r6 = r0
        L7:
            r0 = r6
            r1 = r4
            if (r0 >= r1) goto L18
            r0 = r5
            r1 = r6
            javassist.bytecode.stackmap.TypeData$BasicType r2 = javassist.bytecode.stackmap.TypeTag.TOP
            r0[r1] = r2
            int r6 = r6 + 1
            goto L7
        L18:
            r0 = r5
            return r0
    }

    protected TypeData() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static void setType(javassist.bytecode.stackmap.TypeData r4, java.lang.String r5, javassist.ClassPool r6) throws javassist.bytecode.BadBytecode {
            r0 = r4
            r1 = r5
            r2 = r6
            r0.setType(r1, r2)
            return
    }

    public abstract int getTypeTag();

    public abstract int getTypeData(javassist.bytecode.ConstPool r1);

    public javassist.bytecode.stackmap.TypeData join() {
            r4 = this;
            javassist.bytecode.stackmap.TypeData$TypeVar r0 = new javassist.bytecode.stackmap.TypeData$TypeVar
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
    }

    public abstract javassist.bytecode.stackmap.TypeData.BasicType isBasicType();

    public abstract boolean is2WordType();

    public boolean isNullType() {
            r2 = this;
            r0 = 0
            return r0
    }

    public boolean isUninit() {
            r2 = this;
            r0 = 0
            return r0
    }

    public abstract boolean eq(javassist.bytecode.stackmap.TypeData r1);

    public abstract java.lang.String getName();

    public abstract void setType(java.lang.String r1, javassist.ClassPool r2) throws javassist.bytecode.BadBytecode;

    public abstract javassist.bytecode.stackmap.TypeData getArrayType(int r1) throws javassist.NotFoundException;

    public int dfs(java.util.List<javassist.bytecode.stackmap.TypeData> r3, int r4, javassist.ClassPool r5) throws javassist.NotFoundException {
            r2 = this;
            r0 = r4
            return r0
    }

    protected javassist.bytecode.stackmap.TypeData.TypeVar toTypeVar(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    public void constructorCalled(int r2) {
            r1 = this;
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r5
            java.lang.String r1 = super.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.util.HashSet r2 = new java.util.HashSet
            r3 = r2
            r3.<init>()
            java.lang.String r1 = r1.toString2(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    abstract java.lang.String toString2(java.util.Set<javassist.bytecode.stackmap.TypeData> r1);

    public static javassist.CtClass commonSuperClassEx(javassist.CtClass r4, javassist.CtClass r5) throws javassist.NotFoundException {
            r0 = r4
            r1 = r5
            if (r0 != r1) goto L7
            r0 = r4
            return r0
        L7:
            r0 = r4
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L5f
            r0 = r5
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L5f
            r0 = r4
            javassist.CtClass r0 = r0.getComponentType()
            r6 = r0
            r0 = r5
            javassist.CtClass r0 = r0.getComponentType()
            r7 = r0
            r0 = r6
            r1 = r7
            javassist.CtClass r0 = commonSuperClassEx(r0, r1)
            r8 = r0
            r0 = r8
            r1 = r6
            if (r0 != r1) goto L2e
            r0 = r4
            return r0
        L2e:
            r0 = r8
            r1 = r7
            if (r0 != r1) goto L36
            r0 = r5
            return r0
        L36:
            r0 = r4
            javassist.ClassPool r0 = r0.getClassPool()
            r1 = r8
            if (r1 != 0) goto L44
            java.lang.String r1 = "java.lang.Object"
            goto L5b
        L44:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r8
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "[]"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L5b:
            javassist.CtClass r0 = r0.get(r1)
            return r0
        L5f:
            r0 = r4
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto L6d
            r0 = r5
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L6f
        L6d:
            r0 = 0
            return r0
        L6f:
            r0 = r4
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L7d
            r0 = r5
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L87
        L7d:
            r0 = r4
            javassist.ClassPool r0 = r0.getClassPool()
            java.lang.String r1 = "java.lang.Object"
            javassist.CtClass r0 = r0.get(r1)
            return r0
        L87:
            r0 = r4
            r1 = r5
            javassist.CtClass r0 = commonSuperClass(r0, r1)
            return r0
    }

    public static javassist.CtClass commonSuperClass(javassist.CtClass r3, javassist.CtClass r4) throws javassist.NotFoundException {
            r0 = r3
            r5 = r0
            r0 = r4
            r6 = r0
            r0 = r6
            r7 = r0
            r0 = r5
            r8 = r0
        La:
            r0 = r5
            r1 = r6
            boolean r0 = eq(r0, r1)
            if (r0 == 0) goto L1b
            r0 = r5
            javassist.CtClass r0 = r0.getSuperclass()
            if (r0 == 0) goto L1b
            r0 = r5
            return r0
        L1b:
            r0 = r5
            javassist.CtClass r0 = r0.getSuperclass()
            r9 = r0
            r0 = r6
            javassist.CtClass r0 = r0.getSuperclass()
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L32
            r0 = r7
            r6 = r0
            goto L52
        L32:
            r0 = r9
            if (r0 != 0) goto L49
            r0 = r8
            r5 = r0
            r0 = r7
            r8 = r0
            r0 = r5
            r7 = r0
            r0 = r6
            r5 = r0
            r0 = r7
            r6 = r0
            goto L52
        L49:
            r0 = r9
            r5 = r0
            r0 = r10
            r6 = r0
            goto La
        L52:
            r0 = r5
            javassist.CtClass r0 = r0.getSuperclass()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L5e
            goto L68
        L5e:
            r0 = r8
            javassist.CtClass r0 = r0.getSuperclass()
            r8 = r0
            goto L52
        L68:
            r0 = r8
            r5 = r0
        L6b:
            r0 = r5
            r1 = r6
            boolean r0 = eq(r0, r1)
            if (r0 != 0) goto L80
            r0 = r5
            javassist.CtClass r0 = r0.getSuperclass()
            r5 = r0
            r0 = r6
            javassist.CtClass r0 = r0.getSuperclass()
            r6 = r0
            goto L6b
        L80:
            r0 = r5
            return r0
    }

    static boolean eq(javassist.CtClass r3, javassist.CtClass r4) {
            r0 = r3
            r1 = r4
            if (r0 == r1) goto L1b
            r0 = r3
            if (r0 == 0) goto L1f
            r0 = r4
            if (r0 == 0) goto L1f
            r0 = r3
            java.lang.String r0 = r0.getName()
            r1 = r4
            java.lang.String r1 = r1.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
        L1b:
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    public static void aastore(javassist.bytecode.stackmap.TypeData r5, javassist.bytecode.stackmap.TypeData r6, javassist.ClassPool r7) throws javassist.bytecode.BadBytecode {
            r0 = r5
            boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.AbsTypeVar
            if (r0 == 0) goto L19
            r0 = r6
            boolean r0 = r0.isNullType()
            if (r0 != 0) goto L19
            r0 = r5
            javassist.bytecode.stackmap.TypeData$AbsTypeVar r0 = (javassist.bytecode.stackmap.TypeData.AbsTypeVar) r0
            r1 = r6
            javassist.bytecode.stackmap.TypeData r1 = javassist.bytecode.stackmap.TypeData.ArrayType.make(r1)
            r0.merge(r1)
        L19:
            r0 = r6
            boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.AbsTypeVar
            if (r0 == 0) goto L69
            r0 = r5
            boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.AbsTypeVar
            if (r0 == 0) goto L2f
            r0 = r5
            javassist.bytecode.stackmap.TypeData r0 = javassist.bytecode.stackmap.TypeData.ArrayElement.make(r0)
            goto L69
        L2f:
            r0 = r5
            boolean r0 = r0 instanceof javassist.bytecode.stackmap.TypeData.ClassName
            if (r0 == 0) goto L4e
            r0 = r5
            boolean r0 = r0.isNullType()
            if (r0 != 0) goto L69
            r0 = r5
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = javassist.bytecode.stackmap.TypeData.ArrayElement.access$000(r0)
            r8 = r0
            r0 = r6
            r1 = r8
            r2 = r7
            r0.setType(r1, r2)
            goto L69
        L4e:
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "bad AASTORE: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L69:
            return
    }
}
