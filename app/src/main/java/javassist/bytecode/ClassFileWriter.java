package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ClassFileWriter.class */
public class ClassFileWriter {
    private javassist.bytecode.ByteStream output;
    private javassist.bytecode.ClassFileWriter.ConstPoolWriter constPool;
    private javassist.bytecode.ClassFileWriter.FieldWriter fields;
    private javassist.bytecode.ClassFileWriter.MethodWriter methods;
    int thisClass;
    int superClass;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ClassFileWriter$AttributeWriter.class */
    public interface AttributeWriter {
        int size();

        void write(java.io.DataOutputStream r1) throws java.io.IOException;
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ClassFileWriter$ConstPoolWriter.class */
    public static final class ConstPoolWriter {
        javassist.bytecode.ByteStream output;
        protected int startPos;
        protected int num;

        ConstPoolWriter(javassist.bytecode.ByteStream r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.output = r1
                r0 = r3
                r1 = r4
                int r1 = r1.getPos()
                r0.startPos = r1
                r0 = r3
                r1 = 1
                r0.num = r1
                r0 = r3
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 1
                r0.writeShort(r1)
                return
        }

        public int[] addClassInfo(java.lang.String[] r7) {
                r6 = this;
                r0 = r7
                int r0 = r0.length
                r8 = r0
                r0 = r8
                int[] r0 = new int[r0]
                r9 = r0
                r0 = 0
                r10 = r0
            La:
                r0 = r10
                r1 = r8
                if (r0 >= r1) goto L22
                r0 = r9
                r1 = r10
                r2 = r6
                r3 = r7
                r4 = r10
                r3 = r3[r4]
                int r2 = r2.addClassInfo(r3)
                r0[r1] = r2
                int r10 = r10 + 1
                goto La
            L22:
                r0 = r9
                return r0
        }

        public int addClassInfo(java.lang.String r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                int r0 = r0.addUtf8Info(r1)
                r7 = r0
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 7
                r0.write(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r7
                r0.writeShort(r1)
                r0 = r5
                r1 = r0
                int r1 = r1.num
                r2 = r1; r1 = r0; r0 = r2; 
                r3 = 1
                int r2 = r2 + r3
                r1.num = r2
                return r0
        }

        public int addClassInfo(int r6) {
                r5 = this;
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 7
                r0.write(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r6
                r0.writeShort(r1)
                r0 = r5
                r1 = r0
                int r1 = r1.num
                r2 = r1; r1 = r0; r0 = r2; 
                r3 = 1
                int r2 = r2 + r3
                r1.num = r2
                return r0
        }

        public int addNameAndTypeInfo(java.lang.String r6, java.lang.String r7) {
                r5 = this;
                r0 = r5
                r1 = r5
                r2 = r6
                int r1 = r1.addUtf8Info(r2)
                r2 = r5
                r3 = r7
                int r2 = r2.addUtf8Info(r3)
                int r0 = r0.addNameAndTypeInfo(r1, r2)
                return r0
        }

        public int addNameAndTypeInfo(int r6, int r7) {
                r5 = this;
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 12
                r0.write(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r6
                r0.writeShort(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r7
                r0.writeShort(r1)
                r0 = r5
                r1 = r0
                int r1 = r1.num
                r2 = r1; r1 = r0; r0 = r2; 
                r3 = 1
                int r2 = r2 + r3
                r1.num = r2
                return r0
        }

        public int addFieldrefInfo(int r6, int r7) {
                r5 = this;
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 9
                r0.write(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r6
                r0.writeShort(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r7
                r0.writeShort(r1)
                r0 = r5
                r1 = r0
                int r1 = r1.num
                r2 = r1; r1 = r0; r0 = r2; 
                r3 = 1
                int r2 = r2 + r3
                r1.num = r2
                return r0
        }

        public int addMethodrefInfo(int r6, int r7) {
                r5 = this;
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 10
                r0.write(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r6
                r0.writeShort(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r7
                r0.writeShort(r1)
                r0 = r5
                r1 = r0
                int r1 = r1.num
                r2 = r1; r1 = r0; r0 = r2; 
                r3 = 1
                int r2 = r2 + r3
                r1.num = r2
                return r0
        }

        public int addInterfaceMethodrefInfo(int r6, int r7) {
                r5 = this;
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 11
                r0.write(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r6
                r0.writeShort(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r7
                r0.writeShort(r1)
                r0 = r5
                r1 = r0
                int r1 = r1.num
                r2 = r1; r1 = r0; r0 = r2; 
                r3 = 1
                int r2 = r2 + r3
                r1.num = r2
                return r0
        }

        public int addMethodHandleInfo(int r6, int r7) {
                r5 = this;
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 15
                r0.write(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r6
                r0.write(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r7
                r0.writeShort(r1)
                r0 = r5
                r1 = r0
                int r1 = r1.num
                r2 = r1; r1 = r0; r0 = r2; 
                r3 = 1
                int r2 = r2 + r3
                r1.num = r2
                return r0
        }

        public int addMethodTypeInfo(int r6) {
                r5 = this;
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 16
                r0.write(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r6
                r0.writeShort(r1)
                r0 = r5
                r1 = r0
                int r1 = r1.num
                r2 = r1; r1 = r0; r0 = r2; 
                r3 = 1
                int r2 = r2 + r3
                r1.num = r2
                return r0
        }

        public int addInvokeDynamicInfo(int r6, int r7) {
                r5 = this;
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 18
                r0.write(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r6
                r0.writeShort(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r7
                r0.writeShort(r1)
                r0 = r5
                r1 = r0
                int r1 = r1.num
                r2 = r1; r1 = r0; r0 = r2; 
                r3 = 1
                int r2 = r2 + r3
                r1.num = r2
                return r0
        }

        public int addDynamicInfo(int r6, int r7) {
                r5 = this;
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 17
                r0.write(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r6
                r0.writeShort(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r7
                r0.writeShort(r1)
                r0 = r5
                r1 = r0
                int r1 = r1.num
                r2 = r1; r1 = r0; r0 = r2; 
                r3 = 1
                int r2 = r2 + r3
                r1.num = r2
                return r0
        }

        public int addStringInfo(java.lang.String r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                int r0 = r0.addUtf8Info(r1)
                r7 = r0
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 8
                r0.write(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r7
                r0.writeShort(r1)
                r0 = r5
                r1 = r0
                int r1 = r1.num
                r2 = r1; r1 = r0; r0 = r2; 
                r3 = 1
                int r2 = r2 + r3
                r1.num = r2
                return r0
        }

        public int addIntegerInfo(int r6) {
                r5 = this;
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 3
                r0.write(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r6
                r0.writeInt(r1)
                r0 = r5
                r1 = r0
                int r1 = r1.num
                r2 = r1; r1 = r0; r0 = r2; 
                r3 = 1
                int r2 = r2 + r3
                r1.num = r2
                return r0
        }

        public int addFloatInfo(float r6) {
                r5 = this;
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 4
                r0.write(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r6
                r0.writeFloat(r1)
                r0 = r5
                r1 = r0
                int r1 = r1.num
                r2 = r1; r1 = r0; r0 = r2; 
                r3 = 1
                int r2 = r2 + r3
                r1.num = r2
                return r0
        }

        public int addLongInfo(long r5) {
                r4 = this;
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 5
                r0.write(r1)
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r5
                r0.writeLong(r1)
                r0 = r4
                int r0 = r0.num
                r7 = r0
                r0 = r4
                r1 = r0
                int r1 = r1.num
                r2 = 2
                int r1 = r1 + r2
                r0.num = r1
                r0 = r7
                return r0
        }

        public int addDoubleInfo(double r5) {
                r4 = this;
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 6
                r0.write(r1)
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r5
                r0.writeDouble(r1)
                r0 = r4
                int r0 = r0.num
                r7 = r0
                r0 = r4
                r1 = r0
                int r1 = r1.num
                r2 = 2
                int r1 = r1 + r2
                r0.num = r1
                r0 = r7
                return r0
        }

        public int addUtf8Info(java.lang.String r6) {
                r5 = this;
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 1
                r0.write(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r6
                r0.writeUTF(r1)
                r0 = r5
                r1 = r0
                int r1 = r1.num
                r2 = r1; r1 = r0; r0 = r2; 
                r3 = 1
                int r2 = r2 + r3
                r1.num = r2
                return r0
        }

        void end() {
                r4 = this;
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r4
                int r1 = r1.startPos
                r2 = r4
                int r2 = r2.num
                r0.writeShort(r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ClassFileWriter$FieldWriter.class */
    public static final class FieldWriter {
        protected javassist.bytecode.ByteStream output;
        protected javassist.bytecode.ClassFileWriter.ConstPoolWriter constPool;
        private int fieldCount;

        FieldWriter(javassist.bytecode.ClassFileWriter.ConstPoolWriter r6) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                javassist.bytecode.ByteStream r1 = new javassist.bytecode.ByteStream
                r2 = r1
                r3 = 128(0x80, float:1.8E-43)
                r2.<init>(r3)
                r0.output = r1
                r0 = r5
                r1 = r6
                r0.constPool = r1
                r0 = r5
                r1 = 0
                r0.fieldCount = r1
                return
        }

        public void add(int r7, java.lang.String r8, java.lang.String r9, javassist.bytecode.ClassFileWriter.AttributeWriter r10) {
                r6 = this;
                r0 = r6
                javassist.bytecode.ClassFileWriter$ConstPoolWriter r0 = r0.constPool
                r1 = r8
                int r0 = r0.addUtf8Info(r1)
                r11 = r0
                r0 = r6
                javassist.bytecode.ClassFileWriter$ConstPoolWriter r0 = r0.constPool
                r1 = r9
                int r0 = r0.addUtf8Info(r1)
                r12 = r0
                r0 = r6
                r1 = r7
                r2 = r11
                r3 = r12
                r4 = r10
                r0.add(r1, r2, r3, r4)
                return
        }

        public void add(int r5, int r6, int r7, javassist.bytecode.ClassFileWriter.AttributeWriter r8) {
                r4 = this;
                r0 = r4
                r1 = r0
                int r1 = r1.fieldCount
                r2 = 1
                int r1 = r1 + r2
                r0.fieldCount = r1
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r5
                r0.writeShort(r1)
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r6
                r0.writeShort(r1)
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r7
                r0.writeShort(r1)
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r8
                r2 = 0
                javassist.bytecode.ClassFileWriter.writeAttribute(r0, r1, r2)
                return
        }

        int size() {
                r2 = this;
                r0 = r2
                int r0 = r0.fieldCount
                return r0
        }

        int dataSize() {
                r2 = this;
                r0 = r2
                javassist.bytecode.ByteStream r0 = r0.output
                int r0 = r0.size()
                return r0
        }

        void write(java.io.OutputStream r4) throws java.io.IOException {
                r3 = this;
                r0 = r3
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r4
                r0.writeTo(r1)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/ClassFileWriter$MethodWriter.class */
    public static final class MethodWriter {
        protected javassist.bytecode.ByteStream output;
        protected javassist.bytecode.ClassFileWriter.ConstPoolWriter constPool;
        private int methodCount;
        protected int codeIndex;
        protected int throwsIndex;
        protected int stackIndex;
        private int startPos;
        private boolean isAbstract;
        private int catchPos;
        private int catchCount;

        MethodWriter(javassist.bytecode.ClassFileWriter.ConstPoolWriter r6) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                javassist.bytecode.ByteStream r1 = new javassist.bytecode.ByteStream
                r2 = r1
                r3 = 256(0x100, float:3.59E-43)
                r2.<init>(r3)
                r0.output = r1
                r0 = r5
                r1 = r6
                r0.constPool = r1
                r0 = r5
                r1 = 0
                r0.methodCount = r1
                r0 = r5
                r1 = 0
                r0.codeIndex = r1
                r0 = r5
                r1 = 0
                r0.throwsIndex = r1
                r0 = r5
                r1 = 0
                r0.stackIndex = r1
                return
        }

        public void begin(int r8, java.lang.String r9, java.lang.String r10, java.lang.String[] r11, javassist.bytecode.ClassFileWriter.AttributeWriter r12) {
                r7 = this;
                r0 = r7
                javassist.bytecode.ClassFileWriter$ConstPoolWriter r0 = r0.constPool
                r1 = r9
                int r0 = r0.addUtf8Info(r1)
                r13 = r0
                r0 = r7
                javassist.bytecode.ClassFileWriter$ConstPoolWriter r0 = r0.constPool
                r1 = r10
                int r0 = r0.addUtf8Info(r1)
                r14 = r0
                r0 = r11
                if (r0 != 0) goto L1f
                r0 = 0
                r15 = r0
                goto L2a
            L1f:
                r0 = r7
                javassist.bytecode.ClassFileWriter$ConstPoolWriter r0 = r0.constPool
                r1 = r11
                int[] r0 = r0.addClassInfo(r1)
                r15 = r0
            L2a:
                r0 = r7
                r1 = r8
                r2 = r13
                r3 = r14
                r4 = r15
                r5 = r12
                r0.begin(r1, r2, r3, r4, r5)
                return
        }

        public void begin(int r5, int r6, int r7, int[] r8, javassist.bytecode.ClassFileWriter.AttributeWriter r9) {
                r4 = this;
                r0 = r4
                r1 = r0
                int r1 = r1.methodCount
                r2 = 1
                int r1 = r1 + r2
                r0.methodCount = r1
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r5
                r0.writeShort(r1)
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r6
                r0.writeShort(r1)
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r7
                r0.writeShort(r1)
                r0 = r4
                r1 = r5
                r2 = 1024(0x400, float:1.435E-42)
                r1 = r1 & r2
                if (r1 == 0) goto L2f
                r1 = 1
                goto L30
            L2f:
                r1 = 0
            L30:
                r0.isAbstract = r1
                r0 = r4
                boolean r0 = r0.isAbstract
                if (r0 == 0) goto L3e
                r0 = 0
                goto L3f
            L3e:
                r0 = 1
            L3f:
                r10 = r0
                r0 = r8
                if (r0 == 0) goto L49
                int r10 = r10 + 1
            L49:
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r9
                r2 = r10
                javassist.bytecode.ClassFileWriter.writeAttribute(r0, r1, r2)
                r0 = r8
                if (r0 == 0) goto L5f
                r0 = r4
                r1 = r8
                r0.writeThrows(r1)
            L5f:
                r0 = r4
                boolean r0 = r0.isAbstract
                if (r0 != 0) goto L99
                r0 = r4
                int r0 = r0.codeIndex
                if (r0 != 0) goto L7a
                r0 = r4
                r1 = r4
                javassist.bytecode.ClassFileWriter$ConstPoolWriter r1 = r1.constPool
                java.lang.String r2 = "Code"
                int r1 = r1.addUtf8Info(r2)
                r0.codeIndex = r1
            L7a:
                r0 = r4
                r1 = r4
                javassist.bytecode.ByteStream r1 = r1.output
                int r1 = r1.getPos()
                r0.startPos = r1
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r4
                int r1 = r1.codeIndex
                r0.writeShort(r1)
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 12
                r0.writeBlank(r1)
            L99:
                r0 = r4
                r1 = -1
                r0.catchPos = r1
                r0 = r4
                r1 = 0
                r0.catchCount = r1
                return
        }

        private void writeThrows(int[] r5) {
                r4 = this;
                r0 = r4
                int r0 = r0.throwsIndex
                if (r0 != 0) goto L14
                r0 = r4
                r1 = r4
                javassist.bytecode.ClassFileWriter$ConstPoolWriter r1 = r1.constPool
                java.lang.String r2 = "Exceptions"
                int r1 = r1.addUtf8Info(r2)
                r0.throwsIndex = r1
            L14:
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r4
                int r1 = r1.throwsIndex
                r0.writeShort(r1)
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r5
                int r1 = r1.length
                r2 = 2
                int r1 = r1 * r2
                r2 = 2
                int r1 = r1 + r2
                r0.writeInt(r1)
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r5
                int r1 = r1.length
                r0.writeShort(r1)
                r0 = 0
                r6 = r0
            L37:
                r0 = r6
                r1 = r5
                int r1 = r1.length
                if (r0 >= r1) goto L4d
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r5
                r2 = r6
                r1 = r1[r2]
                r0.writeShort(r1)
                int r6 = r6 + 1
                goto L37
            L4d:
                return
        }

        public void add(int r4) {
                r3 = this;
                r0 = r3
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r4
                r0.write(r1)
                return
        }

        public void add16(int r4) {
                r3 = this;
                r0 = r3
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r4
                r0.writeShort(r1)
                return
        }

        public void add32(int r4) {
                r3 = this;
                r0 = r3
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r4
                r0.writeInt(r1)
                return
        }

        public void addInvoke(int r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
                r4 = this;
                r0 = r4
                javassist.bytecode.ClassFileWriter$ConstPoolWriter r0 = r0.constPool
                r1 = r6
                int r0 = r0.addClassInfo(r1)
                r9 = r0
                r0 = r4
                javassist.bytecode.ClassFileWriter$ConstPoolWriter r0 = r0.constPool
                r1 = r7
                r2 = r8
                int r0 = r0.addNameAndTypeInfo(r1, r2)
                r10 = r0
                r0 = r4
                javassist.bytecode.ClassFileWriter$ConstPoolWriter r0 = r0.constPool
                r1 = r9
                r2 = r10
                int r0 = r0.addMethodrefInfo(r1, r2)
                r11 = r0
                r0 = r4
                r1 = r5
                r0.add(r1)
                r0 = r4
                r1 = r11
                r0.add16(r1)
                return
        }

        public void codeEnd(int r6, int r7) {
                r5 = this;
                r0 = r5
                boolean r0 = r0.isAbstract
                if (r0 != 0) goto L5a
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r5
                int r1 = r1.startPos
                r2 = 6
                int r1 = r1 + r2
                r2 = r6
                r0.writeShort(r1, r2)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r5
                int r1 = r1.startPos
                r2 = 8
                int r1 = r1 + r2
                r2 = r7
                r0.writeShort(r1, r2)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r5
                int r1 = r1.startPos
                r2 = 10
                int r1 = r1 + r2
                r2 = r5
                javassist.bytecode.ByteStream r2 = r2.output
                int r2 = r2.getPos()
                r3 = r5
                int r3 = r3.startPos
                int r2 = r2 - r3
                r3 = 14
                int r2 = r2 - r3
                r0.writeInt(r1, r2)
                r0 = r5
                r1 = r5
                javassist.bytecode.ByteStream r1 = r1.output
                int r1 = r1.getPos()
                r0.catchPos = r1
                r0 = r5
                r1 = 0
                r0.catchCount = r1
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = 0
                r0.writeShort(r1)
            L5a:
                return
        }

        public void addCatch(int r5, int r6, int r7, int r8) {
                r4 = this;
                r0 = r4
                r1 = r0
                int r1 = r1.catchCount
                r2 = 1
                int r1 = r1 + r2
                r0.catchCount = r1
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r5
                r0.writeShort(r1)
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r6
                r0.writeShort(r1)
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r7
                r0.writeShort(r1)
                r0 = r4
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r8
                r0.writeShort(r1)
                return
        }

        public void end(javassist.bytecode.StackMapTable.Writer r6, javassist.bytecode.ClassFileWriter.AttributeWriter r7) {
                r5 = this;
                r0 = r5
                boolean r0 = r0.isAbstract
                if (r0 == 0) goto L8
                return
            L8:
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r5
                int r1 = r1.catchPos
                r2 = r5
                int r2 = r2.catchCount
                r0.writeShort(r1, r2)
                r0 = r6
                if (r0 != 0) goto L1f
                r0 = 0
                goto L20
            L1f:
                r0 = 1
            L20:
                r8 = r0
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r7
                r2 = r8
                javassist.bytecode.ClassFileWriter.writeAttribute(r0, r1, r2)
                r0 = r6
                if (r0 == 0) goto L66
                r0 = r5
                int r0 = r0.stackIndex
                if (r0 != 0) goto L42
                r0 = r5
                r1 = r5
                javassist.bytecode.ClassFileWriter$ConstPoolWriter r1 = r1.constPool
                java.lang.String r2 = "StackMapTable"
                int r1 = r1.addUtf8Info(r2)
                r0.stackIndex = r1
            L42:
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r5
                int r1 = r1.stackIndex
                r0.writeShort(r1)
                r0 = r6
                byte[] r0 = r0.toByteArray()
                r9 = r0
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r9
                int r1 = r1.length
                r0.writeInt(r1)
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r9
                r0.write(r1)
            L66:
                r0 = r5
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r5
                int r1 = r1.startPos
                r2 = 2
                int r1 = r1 + r2
                r2 = r5
                javassist.bytecode.ByteStream r2 = r2.output
                int r2 = r2.getPos()
                r3 = r5
                int r3 = r3.startPos
                int r2 = r2 - r3
                r3 = 6
                int r2 = r2 - r3
                r0.writeInt(r1, r2)
                return
        }

        public int size() {
                r3 = this;
                r0 = r3
                javassist.bytecode.ByteStream r0 = r0.output
                int r0 = r0.getPos()
                r1 = r3
                int r1 = r1.startPos
                int r0 = r0 - r1
                r1 = 14
                int r0 = r0 - r1
                return r0
        }

        int numOfMethods() {
                r2 = this;
                r0 = r2
                int r0 = r0.methodCount
                return r0
        }

        int dataSize() {
                r2 = this;
                r0 = r2
                javassist.bytecode.ByteStream r0 = r0.output
                int r0 = r0.size()
                return r0
        }

        void write(java.io.OutputStream r4) throws java.io.IOException {
                r3 = this;
                r0 = r3
                javassist.bytecode.ByteStream r0 = r0.output
                r1 = r4
                r0.writeTo(r1)
                return
        }
    }

    public ClassFileWriter(int r6, int r7) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            javassist.bytecode.ByteStream r1 = new javassist.bytecode.ByteStream
            r2 = r1
            r3 = 512(0x200, float:7.17E-43)
            r2.<init>(r3)
            r0.output = r1
            r0 = r5
            javassist.bytecode.ByteStream r0 = r0.output
            r1 = -889275714(0xffffffffcafebabe, float:-8346975.0)
            r0.writeInt(r1)
            r0 = r5
            javassist.bytecode.ByteStream r0 = r0.output
            r1 = r7
            r0.writeShort(r1)
            r0 = r5
            javassist.bytecode.ByteStream r0 = r0.output
            r1 = r6
            r0.writeShort(r1)
            r0 = r5
            javassist.bytecode.ClassFileWriter$ConstPoolWriter r1 = new javassist.bytecode.ClassFileWriter$ConstPoolWriter
            r2 = r1
            r3 = r5
            javassist.bytecode.ByteStream r3 = r3.output
            r2.<init>(r3)
            r0.constPool = r1
            r0 = r5
            javassist.bytecode.ClassFileWriter$FieldWriter r1 = new javassist.bytecode.ClassFileWriter$FieldWriter
            r2 = r1
            r3 = r5
            javassist.bytecode.ClassFileWriter$ConstPoolWriter r3 = r3.constPool
            r2.<init>(r3)
            r0.fields = r1
            r0 = r5
            javassist.bytecode.ClassFileWriter$MethodWriter r1 = new javassist.bytecode.ClassFileWriter$MethodWriter
            r2 = r1
            r3 = r5
            javassist.bytecode.ClassFileWriter$ConstPoolWriter r3 = r3.constPool
            r2.<init>(r3)
            r0.methods = r1
            return
    }

    public javassist.bytecode.ClassFileWriter.ConstPoolWriter getConstPool() {
            r2 = this;
            r0 = r2
            javassist.bytecode.ClassFileWriter$ConstPoolWriter r0 = r0.constPool
            return r0
    }

    public javassist.bytecode.ClassFileWriter.FieldWriter getFieldWriter() {
            r2 = this;
            r0 = r2
            javassist.bytecode.ClassFileWriter$FieldWriter r0 = r0.fields
            return r0
    }

    public javassist.bytecode.ClassFileWriter.MethodWriter getMethodWriter() {
            r2 = this;
            r0 = r2
            javassist.bytecode.ClassFileWriter$MethodWriter r0 = r0.methods
            return r0
    }

    public byte[] end(int r5, int r6, int r7, int[] r8, javassist.bytecode.ClassFileWriter.AttributeWriter r9) {
            r4 = this;
            r0 = r4
            javassist.bytecode.ClassFileWriter$ConstPoolWriter r0 = r0.constPool
            r0.end()
            r0 = r4
            javassist.bytecode.ByteStream r0 = r0.output
            r1 = r5
            r0.writeShort(r1)
            r0 = r4
            javassist.bytecode.ByteStream r0 = r0.output
            r1 = r6
            r0.writeShort(r1)
            r0 = r4
            javassist.bytecode.ByteStream r0 = r0.output
            r1 = r7
            r0.writeShort(r1)
            r0 = r8
            if (r0 != 0) goto L2f
            r0 = r4
            javassist.bytecode.ByteStream r0 = r0.output
            r1 = 0
            r0.writeShort(r1)
            goto L59
        L2f:
            r0 = r8
            int r0 = r0.length
            r10 = r0
            r0 = r4
            javassist.bytecode.ByteStream r0 = r0.output
            r1 = r10
            r0.writeShort(r1)
            r0 = 0
            r11 = r0
        L40:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L59
            r0 = r4
            javassist.bytecode.ByteStream r0 = r0.output
            r1 = r8
            r2 = r11
            r1 = r1[r2]
            r0.writeShort(r1)
            int r11 = r11 + 1
            goto L40
        L59:
            r0 = r4
            javassist.bytecode.ByteStream r0 = r0.output
            r1 = r4
            javassist.bytecode.ClassFileWriter$FieldWriter r1 = r1.fields
            int r1 = r1.dataSize()
            r2 = r4
            javassist.bytecode.ClassFileWriter$MethodWriter r2 = r2.methods
            int r2 = r2.dataSize()
            int r1 = r1 + r2
            r2 = 6
            int r1 = r1 + r2
            r0.enlarge(r1)
            r0 = r4
            javassist.bytecode.ByteStream r0 = r0.output     // Catch: java.io.IOException -> La7
            r1 = r4
            javassist.bytecode.ClassFileWriter$FieldWriter r1 = r1.fields     // Catch: java.io.IOException -> La7
            int r1 = r1.size()     // Catch: java.io.IOException -> La7
            r0.writeShort(r1)     // Catch: java.io.IOException -> La7
            r0 = r4
            javassist.bytecode.ClassFileWriter$FieldWriter r0 = r0.fields     // Catch: java.io.IOException -> La7
            r1 = r4
            javassist.bytecode.ByteStream r1 = r1.output     // Catch: java.io.IOException -> La7
            r0.write(r1)     // Catch: java.io.IOException -> La7
            r0 = r4
            javassist.bytecode.ByteStream r0 = r0.output     // Catch: java.io.IOException -> La7
            r1 = r4
            javassist.bytecode.ClassFileWriter$MethodWriter r1 = r1.methods     // Catch: java.io.IOException -> La7
            int r1 = r1.numOfMethods()     // Catch: java.io.IOException -> La7
            r0.writeShort(r1)     // Catch: java.io.IOException -> La7
            r0 = r4
            javassist.bytecode.ClassFileWriter$MethodWriter r0 = r0.methods     // Catch: java.io.IOException -> La7
            r1 = r4
            javassist.bytecode.ByteStream r1 = r1.output     // Catch: java.io.IOException -> La7
            r0.write(r1)     // Catch: java.io.IOException -> La7
            goto La9
        La7:
            r10 = move-exception
        La9:
            r0 = r4
            javassist.bytecode.ByteStream r0 = r0.output
            r1 = r9
            r2 = 0
            writeAttribute(r0, r1, r2)
            r0 = r4
            javassist.bytecode.ByteStream r0 = r0.output
            byte[] r0 = r0.toByteArray()
            return r0
    }

    public void end(java.io.DataOutputStream r5, int r6, int r7, int r8, int[] r9, javassist.bytecode.ClassFileWriter.AttributeWriter r10) throws java.io.IOException {
            r4 = this;
            r0 = r4
            javassist.bytecode.ClassFileWriter$ConstPoolWriter r0 = r0.constPool
            r0.end()
            r0 = r4
            javassist.bytecode.ByteStream r0 = r0.output
            r1 = r5
            r0.writeTo(r1)
            r0 = r5
            r1 = r6
            r0.writeShort(r1)
            r0 = r5
            r1 = r7
            r0.writeShort(r1)
            r0 = r5
            r1 = r8
            r0.writeShort(r1)
            r0 = r9
            if (r0 != 0) goto L2c
            r0 = r5
            r1 = 0
            r0.writeShort(r1)
            goto L50
        L2c:
            r0 = r9
            int r0 = r0.length
            r11 = r0
            r0 = r5
            r1 = r11
            r0.writeShort(r1)
            r0 = 0
            r12 = r0
        L3a:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L50
            r0 = r5
            r1 = r9
            r2 = r12
            r1 = r1[r2]
            r0.writeShort(r1)
            int r12 = r12 + 1
            goto L3a
        L50:
            r0 = r5
            r1 = r4
            javassist.bytecode.ClassFileWriter$FieldWriter r1 = r1.fields
            int r1 = r1.size()
            r0.writeShort(r1)
            r0 = r4
            javassist.bytecode.ClassFileWriter$FieldWriter r0 = r0.fields
            r1 = r5
            r0.write(r1)
            r0 = r5
            r1 = r4
            javassist.bytecode.ClassFileWriter$MethodWriter r1 = r1.methods
            int r1 = r1.numOfMethods()
            r0.writeShort(r1)
            r0 = r4
            javassist.bytecode.ClassFileWriter$MethodWriter r0 = r0.methods
            r1 = r5
            r0.write(r1)
            r0 = r10
            if (r0 != 0) goto L83
            r0 = r5
            r1 = 0
            r0.writeShort(r1)
            goto L96
        L83:
            r0 = r5
            r1 = r10
            int r1 = r1.size()
            r0.writeShort(r1)
            r0 = r10
            r1 = r5
            r0.write(r1)
        L96:
            return
    }

    static void writeAttribute(javassist.bytecode.ByteStream r4, javassist.bytecode.ClassFileWriter.AttributeWriter r5, int r6) {
            r0 = r5
            if (r0 != 0) goto La
            r0 = r4
            r1 = r6
            r0.writeShort(r1)
            return
        La:
            r0 = r4
            r1 = r5
            int r1 = r1.size()
            r2 = r6
            int r1 = r1 + r2
            r0.writeShort(r1)
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r7 = r0
            r0 = r5
            r1 = r7
            r0.write(r1)     // Catch: java.io.IOException -> L2d
            r0 = r7
            r0.flush()     // Catch: java.io.IOException -> L2d
            goto L2f
        L2d:
            r8 = move-exception
        L2f:
            return
    }
}
