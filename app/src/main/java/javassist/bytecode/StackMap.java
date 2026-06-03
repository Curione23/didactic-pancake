package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMap.class */
public class StackMap extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "StackMap";
    public static final int TOP = 0;
    public static final int INTEGER = 1;
    public static final int FLOAT = 2;
    public static final int DOUBLE = 3;
    public static final int LONG = 4;
    public static final int NULL = 5;
    public static final int THIS = 6;
    public static final int OBJECT = 7;
    public static final int UNINIT = 8;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMap$Copier.class */
    static class Copier extends javassist.bytecode.StackMap.Walker {
        byte[] dest;
        javassist.bytecode.ConstPool srcCp;
        javassist.bytecode.ConstPool destCp;
        java.util.Map<java.lang.String, java.lang.String> classnames;

        Copier(javassist.bytecode.StackMap r4, javassist.bytecode.ConstPool r5, java.util.Map<java.lang.String, java.lang.String> r6) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r4
                javassist.bytecode.ConstPool r1 = r1.getConstPool()
                r0.srcCp = r1
                r0 = r3
                r1 = r3
                byte[] r1 = r1.info
                int r1 = r1.length
                byte[] r1 = new byte[r1]
                r0.dest = r1
                r0 = r3
                r1 = r5
                r0.destCp = r1
                r0 = r3
                r1 = r6
                r0.classnames = r1
                return
        }

        @Override // javassist.bytecode.StackMap.Walker
        public void visit() {
                r4 = this;
                r0 = r4
                byte[] r0 = r0.info
                r1 = 0
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r5 = r0
                r0 = r5
                r1 = r4
                byte[] r1 = r1.dest
                r2 = 0
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
                r0 = r4
                super.visit()
                return
        }

        @Override // javassist.bytecode.StackMap.Walker
        public int locals(int r6, int r7, int r8) {
                r5 = this;
                r0 = r7
                r1 = r5
                byte[] r1 = r1.dest
                r2 = r6
                r3 = 4
                int r2 = r2 - r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                int r0 = super.locals(r1, r2, r3)
                return r0
        }

        @Override // javassist.bytecode.StackMap.Walker
        public int typeInfoArray(int r7, int r8, int r9, boolean r10) {
                r6 = this;
                r0 = r9
                r1 = r6
                byte[] r1 = r1.dest
                r2 = r7
                r3 = 2
                int r2 = r2 - r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                int r0 = super.typeInfoArray(r1, r2, r3, r4)
                return r0
        }

        @Override // javassist.bytecode.StackMap.Walker
        public void typeInfo(int r5, byte r6) {
                r4 = this;
                r0 = r4
                byte[] r0 = r0.dest
                r1 = r5
                r2 = r6
                r0[r1] = r2
                return
        }

        @Override // javassist.bytecode.StackMap.Walker
        public void objectVariable(int r6, int r7) {
                r5 = this;
                r0 = r5
                byte[] r0 = r0.dest
                r1 = r6
                r2 = 7
                r0[r1] = r2
                r0 = r5
                javassist.bytecode.ConstPool r0 = r0.srcCp
                r1 = r7
                r2 = r5
                javassist.bytecode.ConstPool r2 = r2.destCp
                r3 = r5
                java.util.Map<java.lang.String, java.lang.String> r3 = r3.classnames
                int r0 = r0.copy(r1, r2, r3)
                r8 = r0
                r0 = r8
                r1 = r5
                byte[] r1 = r1.dest
                r2 = r6
                r3 = 1
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
                return
        }

        @Override // javassist.bytecode.StackMap.Walker
        public void uninitialized(int r6, int r7) {
                r5 = this;
                r0 = r5
                byte[] r0 = r0.dest
                r1 = r6
                r2 = 8
                r0[r1] = r2
                r0 = r7
                r1 = r5
                byte[] r1 = r1.dest
                r2 = r6
                r3 = 1
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
                return
        }

        public javassist.bytecode.StackMap getStackMap() {
                r5 = this;
                javassist.bytecode.StackMap r0 = new javassist.bytecode.StackMap
                r1 = r0
                r2 = r5
                javassist.bytecode.ConstPool r2 = r2.destCp
                r3 = r5
                byte[] r3 = r3.dest
                r1.<init>(r2, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMap$InsertLocal.class */
    static class InsertLocal extends javassist.bytecode.StackMap.SimpleCopy {
        private int varIndex;
        private int varTag;
        private int varData;

        InsertLocal(javassist.bytecode.StackMap r4, int r5, int r6, int r7) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r5
                r0.varIndex = r1
                r0 = r3
                r1 = r6
                r0.varTag = r1
                r0 = r3
                r1 = r7
                r0.varData = r1
                return
        }

        @Override // javassist.bytecode.StackMap.SimpleCopy, javassist.bytecode.StackMap.Walker
        public int typeInfoArray(int r7, int r8, int r9, boolean r10) {
                r6 = this;
                r0 = r10
                if (r0 == 0) goto Ld
                r0 = r9
                r1 = r6
                int r1 = r1.varIndex
                if (r0 >= r1) goto L17
            Ld:
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                int r0 = super.typeInfoArray(r1, r2, r3, r4)
                return r0
            L17:
                r0 = r6
                javassist.bytecode.StackMap$Writer r0 = r0.writer
                r1 = r9
                r2 = 1
                int r1 = r1 + r2
                r0.write16bit(r1)
                r0 = 0
                r11 = r0
            L24:
                r0 = r11
                r1 = r9
                if (r0 >= r1) goto L45
                r0 = r11
                r1 = r6
                int r1 = r1.varIndex
                if (r0 != r1) goto L37
                r0 = r6
                r0.writeVarTypeInfo()
            L37:
                r0 = r6
                r1 = r11
                r2 = r7
                int r0 = r0.typeInfoArray2(r1, r2)
                r7 = r0
                int r11 = r11 + 1
                goto L24
            L45:
                r0 = r9
                r1 = r6
                int r1 = r1.varIndex
                if (r0 != r1) goto L51
                r0 = r6
                r0.writeVarTypeInfo()
            L51:
                r0 = r7
                return r0
        }

        private void writeVarTypeInfo() {
                r4 = this;
                r0 = r4
                int r0 = r0.varTag
                r1 = 7
                if (r0 != r1) goto L19
                r0 = r4
                javassist.bytecode.StackMap$Writer r0 = r0.writer
                r1 = 7
                r2 = r4
                int r2 = r2.varData
                r0.writeVerifyTypeInfo(r1, r2)
                goto L3e
            L19:
                r0 = r4
                int r0 = r0.varTag
                r1 = 8
                if (r0 != r1) goto L32
                r0 = r4
                javassist.bytecode.StackMap$Writer r0 = r0.writer
                r1 = 8
                r2 = r4
                int r2 = r2.varData
                r0.writeVerifyTypeInfo(r1, r2)
                goto L3e
            L32:
                r0 = r4
                javassist.bytecode.StackMap$Writer r0 = r0.writer
                r1 = r4
                int r1 = r1.varTag
                r2 = 0
                r0.writeVerifyTypeInfo(r1, r2)
            L3e:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMap$NewRemover.class */
    static class NewRemover extends javassist.bytecode.StackMap.SimpleCopy {
        int posOfNew;

        NewRemover(javassist.bytecode.StackMap r4, int r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r5
                r0.posOfNew = r1
                return
        }

        @Override // javassist.bytecode.StackMap.Walker
        public int stack(int r6, int r7, int r8) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                int r0 = r0.stackTypeInfoArray(r1, r2, r3)
                return r0
        }

        private int stackTypeInfoArray(int r5, int r6, int r7) {
                r4 = this;
                r0 = r5
                r8 = r0
                r0 = 0
                r9 = r0
                r0 = 0
                r10 = r0
            L9:
                r0 = r10
                r1 = r7
                if (r0 >= r1) goto L54
                r0 = r4
                byte[] r0 = r0.info
                r1 = r8
                r0 = r0[r1]
                r11 = r0
                r0 = r11
                r1 = 7
                if (r0 != r1) goto L25
                int r8 = r8 + 3
                goto L4e
            L25:
                r0 = r11
                r1 = 8
                if (r0 != r1) goto L4b
                r0 = r4
                byte[] r0 = r0.info
                r1 = r8
                r2 = 1
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r12 = r0
                r0 = r12
                r1 = r4
                int r1 = r1.posOfNew
                if (r0 != r1) goto L45
                int r9 = r9 + 1
            L45:
                int r8 = r8 + 3
                goto L4e
            L4b:
                int r8 = r8 + 1
            L4e:
                int r10 = r10 + 1
                goto L9
            L54:
                r0 = r4
                javassist.bytecode.StackMap$Writer r0 = r0.writer
                r1 = r7
                r2 = r9
                int r1 = r1 - r2
                r0.write16bit(r1)
                r0 = 0
                r10 = r0
            L62:
                r0 = r10
                r1 = r7
                if (r0 >= r1) goto Lc9
                r0 = r4
                byte[] r0 = r0.info
                r1 = r5
                r0 = r0[r1]
                r11 = r0
                r0 = r11
                r1 = 7
                if (r0 != r1) goto L90
                r0 = r4
                byte[] r0 = r0.info
                r1 = r5
                r2 = 1
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r12 = r0
                r0 = r4
                r1 = r5
                r2 = r12
                r0.objectVariable(r1, r2)
                int r5 = r5 + 3
                goto Lc3
            L90:
                r0 = r11
                r1 = 8
                if (r0 != r1) goto Lb9
                r0 = r4
                byte[] r0 = r0.info
                r1 = r5
                r2 = 1
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r12 = r0
                r0 = r12
                r1 = r4
                int r1 = r1.posOfNew
                if (r0 == r1) goto Lb3
                r0 = r4
                r1 = r5
                r2 = r12
                r0.uninitialized(r1, r2)
            Lb3:
                int r5 = r5 + 3
                goto Lc3
            Lb9:
                r0 = r4
                r1 = r5
                r2 = r11
                r0.typeInfo(r1, r2)
                int r5 = r5 + 1
            Lc3:
                int r10 = r10 + 1
                goto L62
            Lc9:
                r0 = r5
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMap$Printer.class */
    static class Printer extends javassist.bytecode.StackMap.Walker {
        private java.io.PrintWriter writer;

        public Printer(javassist.bytecode.StackMap r4, java.io.PrintWriter r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r5
                r0.writer = r1
                return
        }

        public void print() {
                r4 = this;
                r0 = r4
                byte[] r0 = r0.info
                r1 = 0
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r5 = r0
                r0 = r4
                java.io.PrintWriter r0 = r0.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                r2.<init>()
                r2 = r5
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " entries"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.println(r1)
                r0 = r4
                r0.visit()
                return
        }

        @Override // javassist.bytecode.StackMap.Walker
        public int locals(int r6, int r7, int r8) {
                r5 = this;
                r0 = r5
                java.io.PrintWriter r0 = r0.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                r2.<init>()
                java.lang.String r2 = "  * offset "
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r7
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.println(r1)
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                int r0 = super.locals(r1, r2, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMap$Shifter.class */
    static class Shifter extends javassist.bytecode.StackMap.Walker {
        private int where;
        private int gap;
        private boolean exclusive;

        public Shifter(javassist.bytecode.StackMap r4, int r5, int r6, boolean r7) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r5
                r0.where = r1
                r0 = r3
                r1 = r6
                r0.gap = r1
                r0 = r3
                r1 = r7
                r0.exclusive = r1
                return
        }

        @Override // javassist.bytecode.StackMap.Walker
        public int locals(int r6, int r7, int r8) {
                r5 = this;
                r0 = r5
                boolean r0 = r0.exclusive
                if (r0 == 0) goto L12
                r0 = r5
                int r0 = r0.where
                r1 = r7
                if (r0 > r1) goto L2a
                goto L1a
            L12:
                r0 = r5
                int r0 = r0.where
                r1 = r7
                if (r0 >= r1) goto L2a
            L1a:
                r0 = r7
                r1 = r5
                int r1 = r1.gap
                int r0 = r0 + r1
                r1 = r5
                byte[] r1 = r1.info
                r2 = r6
                r3 = 4
                int r2 = r2 - r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            L2a:
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                int r0 = super.locals(r1, r2, r3)
                return r0
        }

        @Override // javassist.bytecode.StackMap.Walker
        public void uninitialized(int r6, int r7) {
                r5 = this;
                r0 = r5
                int r0 = r0.where
                r1 = r7
                if (r0 > r1) goto L18
                r0 = r7
                r1 = r5
                int r1 = r1.gap
                int r0 = r0 + r1
                r1 = r5
                byte[] r1 = r1.info
                r2 = r6
                r3 = 1
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            L18:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMap$SimpleCopy.class */
    static class SimpleCopy extends javassist.bytecode.StackMap.Walker {
        javassist.bytecode.StackMap.Writer writer;

        SimpleCopy(javassist.bytecode.StackMap r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                javassist.bytecode.StackMap$Writer r1 = new javassist.bytecode.StackMap$Writer
                r2 = r1
                r2.<init>()
                r0.writer = r1
                return
        }

        byte[] doit() {
                r2 = this;
                r0 = r2
                r0.visit()
                r0 = r2
                javassist.bytecode.StackMap$Writer r0 = r0.writer
                byte[] r0 = r0.toByteArray()
                return r0
        }

        @Override // javassist.bytecode.StackMap.Walker
        public void visit() {
                r3 = this;
                r0 = r3
                byte[] r0 = r0.info
                r1 = 0
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r4 = r0
                r0 = r3
                javassist.bytecode.StackMap$Writer r0 = r0.writer
                r1 = r4
                r0.write16bit(r1)
                r0 = r3
                super.visit()
                return
        }

        @Override // javassist.bytecode.StackMap.Walker
        public int locals(int r6, int r7, int r8) {
                r5 = this;
                r0 = r5
                javassist.bytecode.StackMap$Writer r0 = r0.writer
                r1 = r7
                r0.write16bit(r1)
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                int r0 = super.locals(r1, r2, r3)
                return r0
        }

        @Override // javassist.bytecode.StackMap.Walker
        public int typeInfoArray(int r7, int r8, int r9, boolean r10) {
                r6 = this;
                r0 = r6
                javassist.bytecode.StackMap$Writer r0 = r0.writer
                r1 = r9
                r0.write16bit(r1)
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                int r0 = super.typeInfoArray(r1, r2, r3, r4)
                return r0
        }

        @Override // javassist.bytecode.StackMap.Walker
        public void typeInfo(int r5, byte r6) {
                r4 = this;
                r0 = r4
                javassist.bytecode.StackMap$Writer r0 = r0.writer
                r1 = r6
                r2 = 0
                r0.writeVerifyTypeInfo(r1, r2)
                return
        }

        @Override // javassist.bytecode.StackMap.Walker
        public void objectVariable(int r5, int r6) {
                r4 = this;
                r0 = r4
                javassist.bytecode.StackMap$Writer r0 = r0.writer
                r1 = 7
                r2 = r6
                r0.writeVerifyTypeInfo(r1, r2)
                return
        }

        @Override // javassist.bytecode.StackMap.Walker
        public void uninitialized(int r5, int r6) {
                r4 = this;
                r0 = r4
                javassist.bytecode.StackMap$Writer r0 = r0.writer
                r1 = 8
                r2 = r6
                r0.writeVerifyTypeInfo(r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMap$SwitchShifter.class */
    static class SwitchShifter extends javassist.bytecode.StackMap.Walker {
        private int where;
        private int gap;

        public SwitchShifter(javassist.bytecode.StackMap r4, int r5, int r6) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r5
                r0.where = r1
                r0 = r3
                r1 = r6
                r0.gap = r1
                return
        }

        @Override // javassist.bytecode.StackMap.Walker
        public int locals(int r6, int r7, int r8) {
                r5 = this;
                r0 = r5
                int r0 = r0.where
                r1 = r6
                r2 = r7
                int r1 = r1 + r2
                if (r0 != r1) goto L1d
                r0 = r7
                r1 = r5
                int r1 = r1.gap
                int r0 = r0 - r1
                r1 = r5
                byte[] r1 = r1.info
                r2 = r6
                r3 = 4
                int r2 = r2 - r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
                goto L35
            L1d:
                r0 = r5
                int r0 = r0.where
                r1 = r6
                if (r0 != r1) goto L35
                r0 = r7
                r1 = r5
                int r1 = r1.gap
                int r0 = r0 + r1
                r1 = r5
                byte[] r1 = r1.info
                r2 = r6
                r3 = 4
                int r2 = r2 - r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            L35:
                r0 = r5
                r1 = r6
                r2 = r7
                r3 = r8
                int r0 = super.locals(r1, r2, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMap$Walker.class */
    public static class Walker {
        byte[] info;

        public Walker(javassist.bytecode.StackMap r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                byte[] r1 = r1.get()
                r0.info = r1
                return
        }

        public void visit() {
                r5 = this;
                r0 = r5
                byte[] r0 = r0.info
                r1 = 0
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r6 = r0
                r0 = 2
                r7 = r0
                r0 = 0
                r8 = r0
            Ld:
                r0 = r8
                r1 = r6
                if (r0 >= r1) goto L50
                r0 = r5
                byte[] r0 = r0.info
                r1 = r7
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r9 = r0
                r0 = r5
                byte[] r0 = r0.info
                r1 = r7
                r2 = 2
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r10 = r0
                r0 = r5
                r1 = r7
                r2 = 4
                int r1 = r1 + r2
                r2 = r9
                r3 = r10
                int r0 = r0.locals(r1, r2, r3)
                r7 = r0
                r0 = r5
                byte[] r0 = r0.info
                r1 = r7
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r11 = r0
                r0 = r5
                r1 = r7
                r2 = 2
                int r1 = r1 + r2
                r2 = r9
                r3 = r11
                int r0 = r0.stack(r1, r2, r3)
                r7 = r0
                int r8 = r8 + 1
                goto Ld
            L50:
                return
        }

        public int locals(int r7, int r8, int r9) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = 1
                int r0 = r0.typeInfoArray(r1, r2, r3, r4)
                return r0
        }

        public int stack(int r7, int r8, int r9) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = 0
                int r0 = r0.typeInfoArray(r1, r2, r3, r4)
                return r0
        }

        public int typeInfoArray(int r5, int r6, int r7, boolean r8) {
                r4 = this;
                r0 = 0
                r9 = r0
            L3:
                r0 = r9
                r1 = r7
                if (r0 >= r1) goto L17
                r0 = r4
                r1 = r9
                r2 = r5
                int r0 = r0.typeInfoArray2(r1, r2)
                r5 = r0
                int r9 = r9 + 1
                goto L3
            L17:
                r0 = r5
                return r0
        }

        int typeInfoArray2(int r5, int r6) {
                r4 = this;
                r0 = r4
                byte[] r0 = r0.info
                r1 = r6
                r0 = r0[r1]
                r7 = r0
                r0 = r7
                r1 = 7
                if (r0 != r1) goto L26
                r0 = r4
                byte[] r0 = r0.info
                r1 = r6
                r2 = 1
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r8 = r0
                r0 = r4
                r1 = r6
                r2 = r8
                r0.objectVariable(r1, r2)
                int r6 = r6 + 3
                goto L4e
            L26:
                r0 = r7
                r1 = 8
                if (r0 != r1) goto L45
                r0 = r4
                byte[] r0 = r0.info
                r1 = r6
                r2 = 1
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r8 = r0
                r0 = r4
                r1 = r6
                r2 = r8
                r0.uninitialized(r1, r2)
                int r6 = r6 + 3
                goto L4e
            L45:
                r0 = r4
                r1 = r6
                r2 = r7
                r0.typeInfo(r1, r2)
                int r6 = r6 + 1
            L4e:
                r0 = r6
                return r0
        }

        public void typeInfo(int r2, byte r3) {
                r1 = this;
                return
        }

        public void objectVariable(int r2, int r3) {
                r1 = this;
                return
        }

        public void uninitialized(int r2, int r3) {
                r1 = this;
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMap$Writer.class */
    public static class Writer {
        private java.io.ByteArrayOutputStream output;

        public Writer() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
                r2 = r1
                r2.<init>()
                r0.output = r1
                return
        }

        public byte[] toByteArray() {
                r2 = this;
                r0 = r2
                java.io.ByteArrayOutputStream r0 = r0.output
                byte[] r0 = r0.toByteArray()
                return r0
        }

        public javassist.bytecode.StackMap toStackMap(javassist.bytecode.ConstPool r6) {
                r5 = this;
                javassist.bytecode.StackMap r0 = new javassist.bytecode.StackMap
                r1 = r0
                r2 = r6
                r3 = r5
                java.io.ByteArrayOutputStream r3 = r3.output
                byte[] r3 = r3.toByteArray()
                r1.<init>(r2, r3)
                return r0
        }

        public void writeVerifyTypeInfo(int r4, int r5) {
                r3 = this;
                r0 = r3
                java.io.ByteArrayOutputStream r0 = r0.output
                r1 = r4
                r0.write(r1)
                r0 = r4
                r1 = 7
                if (r0 == r1) goto L14
                r0 = r4
                r1 = 8
                if (r0 != r1) goto L19
            L14:
                r0 = r3
                r1 = r5
                r0.write16bit(r1)
            L19:
                return
        }

        public void write16bit(int r5) {
                r4 = this;
                r0 = r4
                java.io.ByteArrayOutputStream r0 = r0.output
                r1 = r5
                r2 = 8
                int r1 = r1 >>> r2
                r2 = 255(0xff, float:3.57E-43)
                r1 = r1 & r2
                r0.write(r1)
                r0 = r4
                java.io.ByteArrayOutputStream r0 = r0.output
                r1 = r5
                r2 = 255(0xff, float:3.57E-43)
                r1 = r1 & r2
                r0.write(r1)
                return
        }
    }

    StackMap(javassist.bytecode.ConstPool r6, byte[] r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "StackMap"
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    StackMap(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    public int numOfEntries() {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.info
            r1 = 0
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r7, java.util.Map<java.lang.String, java.lang.String> r8) {
            r6 = this;
            javassist.bytecode.StackMap$Copier r0 = new javassist.bytecode.StackMap$Copier
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            r9 = r0
            r0 = r9
            r0.visit()
            r0 = r9
            javassist.bytecode.StackMap r0 = r0.getStackMap()
            return r0
    }

    public void insertLocal(int r8, int r9, int r10) throws javassist.bytecode.BadBytecode {
            r7 = this;
            javassist.bytecode.StackMap$InsertLocal r0 = new javassist.bytecode.StackMap$InsertLocal
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            byte[] r0 = r0.doit()
            r11 = r0
            r0 = r7
            r1 = r11
            r0.set(r1)
            return
    }

    void shiftPc(int r8, int r9, boolean r10) throws javassist.bytecode.BadBytecode {
            r7 = this;
            javassist.bytecode.StackMap$Shifter r0 = new javassist.bytecode.StackMap$Shifter
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            r0.visit()
            return
    }

    void shiftForSwitch(int r7, int r8) throws javassist.bytecode.BadBytecode {
            r6 = this;
            javassist.bytecode.StackMap$SwitchShifter r0 = new javassist.bytecode.StackMap$SwitchShifter
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            r0.visit()
            return
    }

    public void removeNew(int r6) throws javassist.CannotCompileException {
            r5 = this;
            javassist.bytecode.StackMap$NewRemover r0 = new javassist.bytecode.StackMap$NewRemover
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            byte[] r0 = r0.doit()
            r7 = r0
            r0 = r5
            r1 = r7
            r0.set(r1)
            return
    }

    public void print(java.io.PrintWriter r6) {
            r5 = this;
            javassist.bytecode.StackMap$Printer r0 = new javassist.bytecode.StackMap$Printer
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            r0.print()
            return
    }
}
