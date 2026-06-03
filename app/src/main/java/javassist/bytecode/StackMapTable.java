package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMapTable.class */
public class StackMapTable extends javassist.bytecode.AttributeInfo {
    public static final java.lang.String tag = "StackMapTable";
    public static final int TOP = 0;
    public static final int INTEGER = 1;
    public static final int FLOAT = 2;
    public static final int DOUBLE = 3;
    public static final int LONG = 4;
    public static final int NULL = 5;
    public static final int THIS = 6;
    public static final int OBJECT = 7;
    public static final int UNINIT = 8;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMapTable$Copier.class */
    static class Copier extends javassist.bytecode.StackMapTable.SimpleCopy {
        private javassist.bytecode.ConstPool srcPool;
        private javassist.bytecode.ConstPool destPool;
        private java.util.Map<java.lang.String, java.lang.String> classnames;

        public Copier(javassist.bytecode.ConstPool r4, byte[] r5, javassist.bytecode.ConstPool r6, java.util.Map<java.lang.String, java.lang.String> r7) {
                r3 = this;
                r0 = r3
                r1 = r5
                r0.<init>(r1)
                r0 = r3
                r1 = r4
                r0.srcPool = r1
                r0 = r3
                r1 = r6
                r0.destPool = r1
                r0 = r3
                r1 = r7
                r0.classnames = r1
                return
        }

        @Override // javassist.bytecode.StackMapTable.SimpleCopy
        protected int copyData(int r6, int r7) {
                r5 = this;
                r0 = r6
                r1 = 7
                if (r0 != r1) goto L17
                r0 = r5
                javassist.bytecode.ConstPool r0 = r0.srcPool
                r1 = r7
                r2 = r5
                javassist.bytecode.ConstPool r2 = r2.destPool
                r3 = r5
                java.util.Map<java.lang.String, java.lang.String> r3 = r3.classnames
                int r0 = r0.copy(r1, r2, r3)
                return r0
            L17:
                r0 = r7
                return r0
        }

        @Override // javassist.bytecode.StackMapTable.SimpleCopy
        protected int[] copyData(int[] r8, int[] r9) {
                r7 = this;
                r0 = r9
                int r0 = r0.length
                int[] r0 = new int[r0]
                r10 = r0
                r0 = 0
                r11 = r0
            L8:
                r0 = r11
                r1 = r9
                int r1 = r1.length
                if (r0 >= r1) goto L40
                r0 = r8
                r1 = r11
                r0 = r0[r1]
                r1 = 7
                if (r0 != r1) goto L32
                r0 = r10
                r1 = r11
                r2 = r7
                javassist.bytecode.ConstPool r2 = r2.srcPool
                r3 = r9
                r4 = r11
                r3 = r3[r4]
                r4 = r7
                javassist.bytecode.ConstPool r4 = r4.destPool
                r5 = r7
                java.util.Map<java.lang.String, java.lang.String> r5 = r5.classnames
                int r2 = r2.copy(r3, r4, r5)
                r0[r1] = r2
                goto L3a
            L32:
                r0 = r10
                r1 = r11
                r2 = r9
                r3 = r11
                r2 = r2[r3]
                r0[r1] = r2
            L3a:
                int r11 = r11 + 1
                goto L8
            L40:
                r0 = r10
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMapTable$InsertLocal.class */
    static class InsertLocal extends javassist.bytecode.StackMapTable.SimpleCopy {
        private int varIndex;
        private int varTag;
        private int varData;

        public InsertLocal(byte[] r4, int r5, int r6, int r7) {
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

        @Override // javassist.bytecode.StackMapTable.SimpleCopy, javassist.bytecode.StackMapTable.Walker
        public void fullFrame(int r9, int r10, int[] r11, int[] r12, int[] r13, int[] r14) {
                r8 = this;
                r0 = r11
                int r0 = r0.length
                r15 = r0
                r0 = r15
                r1 = r8
                int r1 = r1.varIndex
                if (r0 >= r1) goto L1b
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                super.fullFrame(r1, r2, r3, r4, r5, r6)
                return
            L1b:
                r0 = r8
                int r0 = r0.varTag
                r1 = 4
                if (r0 == r1) goto L2b
                r0 = r8
                int r0 = r0.varTag
                r1 = 3
                if (r0 != r1) goto L2f
            L2b:
                r0 = 2
                goto L30
            L2f:
                r0 = 1
            L30:
                r16 = r0
                r0 = r15
                r1 = r16
                int r0 = r0 + r1
                int[] r0 = new int[r0]
                r17 = r0
                r0 = r15
                r1 = r16
                int r0 = r0 + r1
                int[] r0 = new int[r0]
                r18 = r0
                r0 = r8
                int r0 = r0.varIndex
                r19 = r0
                r0 = 0
                r20 = r0
                r0 = 0
                r21 = r0
            L50:
                r0 = r21
                r1 = r15
                if (r0 >= r1) goto L81
                r0 = r20
                r1 = r19
                if (r0 != r1) goto L65
                r0 = r20
                r1 = r16
                int r0 = r0 + r1
                r20 = r0
            L65:
                r0 = r17
                r1 = r20
                r2 = r11
                r3 = r21
                r2 = r2[r3]
                r0[r1] = r2
                r0 = r18
                r1 = r20
                int r20 = r20 + 1
                r2 = r12
                r3 = r21
                r2 = r2[r3]
                r0[r1] = r2
                int r21 = r21 + 1
                goto L50
            L81:
                r0 = r17
                r1 = r19
                r2 = r8
                int r2 = r2.varTag
                r0[r1] = r2
                r0 = r18
                r1 = r19
                r2 = r8
                int r2 = r2.varData
                r0[r1] = r2
                r0 = r16
                r1 = 1
                if (r0 <= r1) goto La9
                r0 = r17
                r1 = r19
                r2 = 1
                int r1 = r1 + r2
                r2 = 0
                r0[r1] = r2
                r0 = r18
                r1 = r19
                r2 = 1
                int r1 = r1 + r2
                r2 = 0
                r0[r1] = r2
            La9:
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r17
                r4 = r18
                r5 = r13
                r6 = r14
                super.fullFrame(r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMapTable$NewRemover.class */
    static class NewRemover extends javassist.bytecode.StackMapTable.SimpleCopy {
        int posOfNew;

        public NewRemover(byte[] r4, int r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r5
                r0.posOfNew = r1
                return
        }

        @Override // javassist.bytecode.StackMapTable.SimpleCopy, javassist.bytecode.StackMapTable.Walker
        public void sameLocals(int r7, int r8, int r9, int r10) {
                r6 = this;
                r0 = r9
                r1 = 8
                if (r0 != r1) goto L18
                r0 = r10
                r1 = r6
                int r1 = r1.posOfNew
                if (r0 != r1) goto L18
                r0 = r6
                r1 = r7
                r2 = r8
                super.sameFrame(r1, r2)
                goto L21
            L18:
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                super.sameLocals(r1, r2, r3, r4)
            L21:
                return
        }

        @Override // javassist.bytecode.StackMapTable.SimpleCopy, javassist.bytecode.StackMapTable.Walker
        public void fullFrame(int r9, int r10, int[] r11, int[] r12, int[] r13, int[] r14) {
                r8 = this;
                r0 = r13
                int r0 = r0.length
                r1 = 1
                int r0 = r0 - r1
                r15 = r0
                r0 = 0
                r16 = r0
            La:
                r0 = r16
                r1 = r15
                if (r0 >= r1) goto L9c
                r0 = r13
                r1 = r16
                r0 = r0[r1]
                r1 = 8
                if (r0 != r1) goto L96
                r0 = r14
                r1 = r16
                r0 = r0[r1]
                r1 = r8
                int r1 = r1.posOfNew
                if (r0 != r1) goto L96
                r0 = r13
                r1 = r16
                r2 = 1
                int r1 = r1 + r2
                r0 = r0[r1]
                r1 = 8
                if (r0 != r1) goto L96
                r0 = r14
                r1 = r16
                r2 = 1
                int r1 = r1 + r2
                r0 = r0[r1]
                r1 = r8
                int r1 = r1.posOfNew
                if (r0 != r1) goto L96
                int r15 = r15 + 1
                r0 = r15
                r1 = 2
                int r0 = r0 - r1
                int[] r0 = new int[r0]
                r17 = r0
                r0 = r15
                r1 = 2
                int r0 = r0 - r1
                int[] r0 = new int[r0]
                r18 = r0
                r0 = 0
                r19 = r0
                r0 = 0
                r20 = r0
            L5a:
                r0 = r20
                r1 = r15
                if (r0 >= r1) goto L8b
                r0 = r20
                r1 = r16
                if (r0 != r1) goto L6e
                int r20 = r20 + 1
                goto L85
            L6e:
                r0 = r17
                r1 = r19
                r2 = r13
                r3 = r20
                r2 = r2[r3]
                r0[r1] = r2
                r0 = r18
                r1 = r19
                int r19 = r19 + 1
                r2 = r14
                r3 = r20
                r2 = r2[r3]
                r0[r1] = r2
            L85:
                int r20 = r20 + 1
                goto L5a
            L8b:
                r0 = r17
                r13 = r0
                r0 = r18
                r14 = r0
                goto L9c
            L96:
                int r16 = r16 + 1
                goto La
            L9c:
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r6 = r14
                super.fullFrame(r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMapTable$OffsetShifter.class */
    static class OffsetShifter extends javassist.bytecode.StackMapTable.Walker {
        int where;
        int gap;

        public OffsetShifter(javassist.bytecode.StackMapTable r4, int r5, int r6) {
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

        @Override // javassist.bytecode.StackMapTable.Walker
        public void objectOrUninitialized(int r5, int r6, int r7) {
                r4 = this;
                r0 = r5
                r1 = 8
                if (r0 != r1) goto L1c
                r0 = r4
                int r0 = r0.where
                r1 = r6
                if (r0 > r1) goto L1c
                r0 = r6
                r1 = r4
                int r1 = r1.gap
                int r0 = r0 + r1
                r1 = r4
                byte[] r1 = r1.info
                r2 = r7
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            L1c:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMapTable$Printer.class */
    static class Printer extends javassist.bytecode.StackMapTable.Walker {
        private java.io.PrintWriter writer;
        private int offset;

        public static void print(javassist.bytecode.StackMapTable r5, java.io.PrintWriter r6) {
                javassist.bytecode.StackMapTable$Printer r0 = new javassist.bytecode.StackMapTable$Printer     // Catch: javassist.bytecode.BadBytecode -> L12
                r1 = r0
                r2 = r5
                byte[] r2 = r2.get()     // Catch: javassist.bytecode.BadBytecode -> L12
                r3 = r6
                r1.<init>(r2, r3)     // Catch: javassist.bytecode.BadBytecode -> L12
                r0.parse()     // Catch: javassist.bytecode.BadBytecode -> L12
                goto L1b
            L12:
                r7 = move-exception
                r0 = r6
                r1 = r7
                java.lang.String r1 = r1.getMessage()
                r0.println(r1)
            L1b:
                return
        }

        Printer(byte[] r4, java.io.PrintWriter r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r5
                r0.writer = r1
                r0 = r3
                r1 = -1
                r0.offset = r1
                return
        }

        @Override // javassist.bytecode.StackMapTable.Walker
        public void sameFrame(int r6, int r7) {
                r5 = this;
                r0 = r5
                r1 = r0
                int r1 = r1.offset
                r2 = r7
                r3 = 1
                int r2 = r2 + r3
                int r1 = r1 + r2
                r0.offset = r1
                r0 = r5
                java.io.PrintWriter r0 = r0.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                r2.<init>()
                r2 = r5
                int r2 = r2.offset
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " same frame: "
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r7
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.println(r1)
                return
        }

        @Override // javassist.bytecode.StackMapTable.Walker
        public void sameLocals(int r6, int r7, int r8, int r9) {
                r5 = this;
                r0 = r5
                r1 = r0
                int r1 = r1.offset
                r2 = r7
                r3 = 1
                int r2 = r2 + r3
                int r1 = r1 + r2
                r0.offset = r1
                r0 = r5
                java.io.PrintWriter r0 = r0.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                r2.<init>()
                r2 = r5
                int r2 = r2.offset
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " same locals: "
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r7
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.println(r1)
                r0 = r5
                r1 = r8
                r2 = r9
                r0.printTypeInfo(r1, r2)
                return
        }

        @Override // javassist.bytecode.StackMapTable.Walker
        public void chopFrame(int r6, int r7, int r8) {
                r5 = this;
                r0 = r5
                r1 = r0
                int r1 = r1.offset
                r2 = r7
                r3 = 1
                int r2 = r2 + r3
                int r1 = r1 + r2
                r0.offset = r1
                r0 = r5
                java.io.PrintWriter r0 = r0.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                r2.<init>()
                r2 = r5
                int r2 = r2.offset
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " chop frame: "
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r7
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = ",    "
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r8
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " last locals"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.println(r1)
                return
        }

        @Override // javassist.bytecode.StackMapTable.Walker
        public void appendFrame(int r6, int r7, int[] r8, int[] r9) {
                r5 = this;
                r0 = r5
                r1 = r0
                int r1 = r1.offset
                r2 = r7
                r3 = 1
                int r2 = r2 + r3
                int r1 = r1 + r2
                r0.offset = r1
                r0 = r5
                java.io.PrintWriter r0 = r0.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                r2.<init>()
                r2 = r5
                int r2 = r2.offset
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " append frame: "
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r7
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.println(r1)
                r0 = 0
                r10 = r0
            L30:
                r0 = r10
                r1 = r8
                int r1 = r1.length
                if (r0 >= r1) goto L4a
                r0 = r5
                r1 = r8
                r2 = r10
                r1 = r1[r2]
                r2 = r9
                r3 = r10
                r2 = r2[r3]
                r0.printTypeInfo(r1, r2)
                int r10 = r10 + 1
                goto L30
            L4a:
                return
        }

        @Override // javassist.bytecode.StackMapTable.Walker
        public void fullFrame(int r6, int r7, int[] r8, int[] r9, int[] r10, int[] r11) {
                r5 = this;
                r0 = r5
                r1 = r0
                int r1 = r1.offset
                r2 = r7
                r3 = 1
                int r2 = r2 + r3
                int r1 = r1 + r2
                r0.offset = r1
                r0 = r5
                java.io.PrintWriter r0 = r0.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r2 = r1
                r2.<init>()
                r2 = r5
                int r2 = r2.offset
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " full frame: "
                java.lang.StringBuilder r1 = r1.append(r2)
                r2 = r7
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.println(r1)
                r0 = r5
                java.io.PrintWriter r0 = r0.writer
                java.lang.String r1 = "[locals]"
                r0.println(r1)
                r0 = 0
                r12 = r0
            L39:
                r0 = r12
                r1 = r8
                int r1 = r1.length
                if (r0 >= r1) goto L53
                r0 = r5
                r1 = r8
                r2 = r12
                r1 = r1[r2]
                r2 = r9
                r3 = r12
                r2 = r2[r3]
                r0.printTypeInfo(r1, r2)
                int r12 = r12 + 1
                goto L39
            L53:
                r0 = r5
                java.io.PrintWriter r0 = r0.writer
                java.lang.String r1 = "[stack]"
                r0.println(r1)
                r0 = 0
                r12 = r0
            L5f:
                r0 = r12
                r1 = r10
                int r1 = r1.length
                if (r0 >= r1) goto L7b
                r0 = r5
                r1 = r10
                r2 = r12
                r1 = r1[r2]
                r2 = r11
                r3 = r12
                r2 = r2[r3]
                r0.printTypeInfo(r1, r2)
                int r12 = r12 + 1
                goto L5f
            L7b:
                return
        }

        private void printTypeInfo(int r4, int r5) {
                r3 = this;
                r0 = 0
                r6 = r0
                r0 = r4
                switch(r0) {
                    case 0: goto L34;
                    case 1: goto L3a;
                    case 2: goto L40;
                    case 3: goto L46;
                    case 4: goto L4c;
                    case 5: goto L52;
                    case 6: goto L58;
                    case 7: goto L5e;
                    case 8: goto L7a;
                    default: goto L93;
                }
            L34:
                java.lang.String r0 = "top"
                r6 = r0
                goto L93
            L3a:
                java.lang.String r0 = "integer"
                r6 = r0
                goto L93
            L40:
                java.lang.String r0 = "float"
                r6 = r0
                goto L93
            L46:
                java.lang.String r0 = "double"
                r6 = r0
                goto L93
            L4c:
                java.lang.String r0 = "long"
                r6 = r0
                goto L93
            L52:
                java.lang.String r0 = "null"
                r6 = r0
                goto L93
            L58:
                java.lang.String r0 = "this"
                r6 = r0
                goto L93
            L5e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                java.lang.String r1 = "object (cpool_index "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r5
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6 = r0
                goto L93
            L7a:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                java.lang.String r1 = "uninitialized (offset "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r5
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6 = r0
            L93:
                r0 = r3
                java.io.PrintWriter r0 = r0.writer
                java.lang.String r1 = "    "
                r0.print(r1)
                r0 = r3
                java.io.PrintWriter r0 = r0.writer
                r1 = r6
                r0.println(r1)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMapTable$RuntimeCopyException.class */
    public static class RuntimeCopyException extends java.lang.RuntimeException {
        private static final long serialVersionUID = 1;

        public RuntimeCopyException(java.lang.String r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMapTable$Shifter.class */
    static class Shifter extends javassist.bytecode.StackMapTable.Walker {
        private javassist.bytecode.StackMapTable stackMap;
        int where;
        int gap;
        int position;
        byte[] updatedInfo;
        boolean exclusive;
        static final /* synthetic */ boolean $assertionsDisabled = false;

        public Shifter(javassist.bytecode.StackMapTable r4, int r5, int r6, boolean r7) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r4
                r0.stackMap = r1
                r0 = r3
                r1 = r5
                r0.where = r1
                r0 = r3
                r1 = r6
                r0.gap = r1
                r0 = r3
                r1 = 0
                r0.position = r1
                r0 = r3
                r1 = 0
                r0.updatedInfo = r1
                r0 = r3
                r1 = r7
                r0.exclusive = r1
                return
        }

        public void doit() throws javassist.bytecode.BadBytecode {
                r3 = this;
                r0 = r3
                r0.parse()
                r0 = r3
                byte[] r0 = r0.updatedInfo
                if (r0 == 0) goto L16
                r0 = r3
                javassist.bytecode.StackMapTable r0 = r0.stackMap
                r1 = r3
                byte[] r1 = r1.updatedInfo
                r0.set(r1)
            L16:
                return
        }

        @Override // javassist.bytecode.StackMapTable.Walker
        public void sameFrame(int r7, int r8) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = 0
                r4 = 251(0xfb, float:3.52E-43)
                r0.update(r1, r2, r3, r4)
                return
        }

        @Override // javassist.bytecode.StackMapTable.Walker
        public void sameLocals(int r7, int r8, int r9, int r10) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = 64
                r4 = 247(0xf7, float:3.46E-43)
                r0.update(r1, r2, r3, r4)
                return
        }

        void update(int r6, int r7, int r8, int r9) {
                r5 = this;
                r0 = r5
                int r0 = r0.position
                r10 = r0
                r0 = r5
                r1 = r10
                r2 = r7
                int r1 = r1 + r2
                r2 = r10
                if (r2 != 0) goto L14
                r2 = 0
                goto L15
            L14:
                r2 = 1
            L15:
                int r1 = r1 + r2
                r0.position = r1
                r0 = r5
                boolean r0 = r0.exclusive
                if (r0 == 0) goto L4a
                r0 = r10
                if (r0 != 0) goto L2c
                r0 = r5
                int r0 = r0.where
                if (r0 == 0) goto L40
            L2c:
                r0 = r10
                r1 = r5
                int r1 = r1.where
                if (r0 >= r1) goto L44
                r0 = r5
                int r0 = r0.where
                r1 = r5
                int r1 = r1.position
                if (r0 > r1) goto L44
            L40:
                r0 = 1
                goto L45
            L44:
                r0 = 0
            L45:
                r11 = r0
                goto L65
            L4a:
                r0 = r10
                r1 = r5
                int r1 = r1.where
                if (r0 > r1) goto L62
                r0 = r5
                int r0 = r0.where
                r1 = r5
                int r1 = r1.position
                if (r0 >= r1) goto L62
                r0 = 1
                goto L63
            L62:
                r0 = 0
            L63:
                r11 = r0
            L65:
                r0 = r11
                if (r0 == 0) goto Lde
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r12 = r0
                r0 = r7
                r1 = r5
                int r1 = r1.gap
                int r0 = r0 + r1
                r13 = r0
                r0 = r5
                r1 = r0
                int r1 = r1.position
                r2 = r5
                int r2 = r2.gap
                int r1 = r1 + r2
                r0.position = r1
                r0 = r13
                r1 = 64
                if (r0 >= r1) goto La0
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                r2 = r13
                r3 = r8
                int r2 = r2 + r3
                byte r2 = (byte) r2
                r0[r1] = r2
                goto Lde
            La0:
                r0 = r7
                r1 = 64
                if (r0 >= r1) goto Ld2
                r0 = r12
                r1 = r9
                if (r0 == r1) goto Ld2
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                r2 = 2
                byte[] r0 = insertGap(r0, r1, r2)
                r14 = r0
                r0 = r14
                r1 = r6
                r2 = r9
                byte r2 = (byte) r2
                r0[r1] = r2
                r0 = r13
                r1 = r14
                r2 = r6
                r3 = 1
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
                r0 = r5
                r1 = r14
                r0.updatedInfo = r1
                goto Lde
            Ld2:
                r0 = r13
                r1 = r5
                byte[] r1 = r1.info
                r2 = r6
                r3 = 1
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            Lde:
                return
        }

        static byte[] insertGap(byte[] r7, int r8, int r9) {
                r0 = r7
                int r0 = r0.length
                r10 = r0
                r0 = r10
                r1 = r9
                int r0 = r0 + r1
                byte[] r0 = new byte[r0]
                r11 = r0
                r0 = r8
                if (r0 > 0) goto L1a
                r0 = r7
                r1 = 0
                r2 = r11
                r3 = r9
                r4 = r10
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                goto L58
            L1a:
                r0 = r8
                r1 = r10
                if (r0 < r1) goto L2b
                r0 = r7
                r1 = 0
                r2 = r11
                r3 = 0
                r4 = r10
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                goto L58
            L2b:
                boolean r0 = javassist.bytecode.StackMapTable.Shifter.$assertionsDisabled
                if (r0 != 0) goto L42
                r0 = r8
                if (r0 <= 0) goto L3a
                r0 = r8
                r1 = r10
                if (r0 < r1) goto L42
            L3a:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r1 = r0
                r1.<init>()
                throw r0
            L42:
                r0 = r7
                r1 = 0
                r2 = r11
                r3 = 0
                r4 = r8
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r7
                r1 = r8
                r2 = r11
                r3 = r8
                r4 = r9
                int r3 = r3 + r4
                r4 = r10
                r5 = r8
                int r4 = r4 - r5
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            L58:
                r0 = r11
                return r0
        }

        @Override // javassist.bytecode.StackMapTable.Walker
        public void chopFrame(int r5, int r6, int r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.update(r1, r2)
                return
        }

        @Override // javassist.bytecode.StackMapTable.Walker
        public void appendFrame(int r5, int r6, int[] r7, int[] r8) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.update(r1, r2)
                return
        }

        @Override // javassist.bytecode.StackMapTable.Walker
        public void fullFrame(int r5, int r6, int[] r7, int[] r8, int[] r9, int[] r10) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.update(r1, r2)
                return
        }

        void update(int r6, int r7) {
                r5 = this;
                r0 = r5
                int r0 = r0.position
                r8 = r0
                r0 = r5
                r1 = r8
                r2 = r7
                int r1 = r1 + r2
                r2 = r8
                if (r2 != 0) goto L11
                r2 = 0
                goto L12
            L11:
                r2 = 1
            L12:
                int r1 = r1 + r2
                r0.position = r1
                r0 = r5
                boolean r0 = r0.exclusive
                if (r0 == 0) goto L45
                r0 = r8
                if (r0 != 0) goto L28
                r0 = r5
                int r0 = r0.where
                if (r0 == 0) goto L3b
            L28:
                r0 = r8
                r1 = r5
                int r1 = r1.where
                if (r0 >= r1) goto L3f
                r0 = r5
                int r0 = r0.where
                r1 = r5
                int r1 = r1.position
                if (r0 > r1) goto L3f
            L3b:
                r0 = 1
                goto L40
            L3f:
                r0 = 0
            L40:
                r9 = r0
                goto L5f
            L45:
                r0 = r8
                r1 = r5
                int r1 = r1.where
                if (r0 > r1) goto L5c
                r0 = r5
                int r0 = r0.where
                r1 = r5
                int r1 = r1.position
                if (r0 >= r1) goto L5c
                r0 = 1
                goto L5d
            L5c:
                r0 = 0
            L5d:
                r9 = r0
            L5f:
                r0 = r9
                if (r0 == 0) goto L85
                r0 = r7
                r1 = r5
                int r1 = r1.gap
                int r0 = r0 + r1
                r10 = r0
                r0 = r10
                r1 = r5
                byte[] r1 = r1.info
                r2 = r6
                r3 = 1
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
                r0 = r5
                r1 = r0
                int r1 = r1.position
                r2 = r5
                int r2 = r2.gap
                int r1 = r1 + r2
                r0.position = r1
            L85:
                return
        }

        static {
                java.lang.Class<javassist.bytecode.StackMapTable> r0 = javassist.bytecode.StackMapTable.class
                boolean r0 = r0.desiredAssertionStatus()
                if (r0 != 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                javassist.bytecode.StackMapTable.Shifter.$assertionsDisabled = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMapTable$SimpleCopy.class */
    static class SimpleCopy extends javassist.bytecode.StackMapTable.Walker {
        private javassist.bytecode.StackMapTable.Writer writer;

        public SimpleCopy(byte[] r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r0.<init>(r1)
                r0 = r5
                javassist.bytecode.StackMapTable$Writer r1 = new javassist.bytecode.StackMapTable$Writer
                r2 = r1
                r3 = r6
                int r3 = r3.length
                r2.<init>(r3)
                r0.writer = r1
                return
        }

        public byte[] doit() throws javassist.bytecode.BadBytecode {
                r2 = this;
                r0 = r2
                r0.parse()
                r0 = r2
                javassist.bytecode.StackMapTable$Writer r0 = r0.writer
                byte[] r0 = r0.toByteArray()
                return r0
        }

        @Override // javassist.bytecode.StackMapTable.Walker
        public void sameFrame(int r4, int r5) {
                r3 = this;
                r0 = r3
                javassist.bytecode.StackMapTable$Writer r0 = r0.writer
                r1 = r5
                r0.sameFrame(r1)
                return
        }

        @Override // javassist.bytecode.StackMapTable.Walker
        public void sameLocals(int r8, int r9, int r10, int r11) {
                r7 = this;
                r0 = r7
                javassist.bytecode.StackMapTable$Writer r0 = r0.writer
                r1 = r9
                r2 = r10
                r3 = r7
                r4 = r10
                r5 = r11
                int r3 = r3.copyData(r4, r5)
                r0.sameLocals(r1, r2, r3)
                return
        }

        @Override // javassist.bytecode.StackMapTable.Walker
        public void chopFrame(int r5, int r6, int r7) {
                r4 = this;
                r0 = r4
                javassist.bytecode.StackMapTable$Writer r0 = r0.writer
                r1 = r6
                r2 = r7
                r0.chopFrame(r1, r2)
                return
        }

        @Override // javassist.bytecode.StackMapTable.Walker
        public void appendFrame(int r8, int r9, int[] r10, int[] r11) {
                r7 = this;
                r0 = r7
                javassist.bytecode.StackMapTable$Writer r0 = r0.writer
                r1 = r9
                r2 = r10
                r3 = r7
                r4 = r10
                r5 = r11
                int[] r3 = r3.copyData(r4, r5)
                r0.appendFrame(r1, r2, r3)
                return
        }

        @Override // javassist.bytecode.StackMapTable.Walker
        public void fullFrame(int r10, int r11, int[] r12, int[] r13, int[] r14, int[] r15) {
                r9 = this;
                r0 = r9
                javassist.bytecode.StackMapTable$Writer r0 = r0.writer
                r1 = r11
                r2 = r12
                r3 = r9
                r4 = r12
                r5 = r13
                int[] r3 = r3.copyData(r4, r5)
                r4 = r14
                r5 = r9
                r6 = r14
                r7 = r15
                int[] r5 = r5.copyData(r6, r7)
                r0.fullFrame(r1, r2, r3, r4, r5)
                return
        }

        protected int copyData(int r3, int r4) {
                r2 = this;
                r0 = r4
                return r0
        }

        protected int[] copyData(int[] r3, int[] r4) {
                r2 = this;
                r0 = r4
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMapTable$SwitchShifter.class */
    static class SwitchShifter extends javassist.bytecode.StackMapTable.Shifter {
        SwitchShifter(javassist.bytecode.StackMapTable r7, int r8, int r9) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // javassist.bytecode.StackMapTable.Shifter
        void update(int r6, int r7, int r8, int r9) {
                r5 = this;
                r0 = r5
                int r0 = r0.position
                r10 = r0
                r0 = r5
                r1 = r10
                r2 = r7
                int r1 = r1 + r2
                r2 = r10
                if (r2 != 0) goto L14
                r2 = 0
                goto L15
            L14:
                r2 = 1
            L15:
                int r1 = r1 + r2
                r0.position = r1
                r0 = r7
                r11 = r0
                r0 = r5
                int r0 = r0.where
                r1 = r5
                int r1 = r1.position
                if (r0 != r1) goto L32
                r0 = r7
                r1 = r5
                int r1 = r1.gap
                int r0 = r0 - r1
                r11 = r0
                goto L47
            L32:
                r0 = r5
                int r0 = r0.where
                r1 = r10
                if (r0 != r1) goto L46
                r0 = r7
                r1 = r5
                int r1 = r1.gap
                int r0 = r0 + r1
                r11 = r0
                goto L47
            L46:
                return
            L47:
                r0 = r7
                r1 = 64
                if (r0 >= r1) goto L87
                r0 = r11
                r1 = 64
                if (r0 >= r1) goto L62
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                r2 = r11
                r3 = r8
                int r2 = r2 + r3
                byte r2 = (byte) r2
                r0[r1] = r2
                goto Lb7
            L62:
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                r2 = 2
                byte[] r0 = insertGap(r0, r1, r2)
                r12 = r0
                r0 = r12
                r1 = r6
                r2 = r9
                byte r2 = (byte) r2
                r0[r1] = r2
                r0 = r11
                r1 = r12
                r2 = r6
                r3 = 1
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
                r0 = r5
                r1 = r12
                r0.updatedInfo = r1
                goto Lb7
            L87:
                r0 = r11
                r1 = 64
                if (r0 >= r1) goto Lab
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                r2 = 2
                byte[] r0 = deleteGap(r0, r1, r2)
                r12 = r0
                r0 = r12
                r1 = r6
                r2 = r11
                r3 = r8
                int r2 = r2 + r3
                byte r2 = (byte) r2
                r0[r1] = r2
                r0 = r5
                r1 = r12
                r0.updatedInfo = r1
                goto Lb7
            Lab:
                r0 = r11
                r1 = r5
                byte[] r1 = r1.info
                r2 = r6
                r3 = 1
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            Lb7:
                return
        }

        static byte[] deleteGap(byte[] r5, int r6, int r7) {
                r0 = r6
                r1 = r7
                int r0 = r0 + r1
                r6 = r0
                r0 = r5
                int r0 = r0.length
                r8 = r0
                r0 = r8
                r1 = r7
                int r0 = r0 - r1
                byte[] r0 = new byte[r0]
                r9 = r0
                r0 = 0
                r10 = r0
            L11:
                r0 = r10
                r1 = r8
                if (r0 >= r1) goto L32
                r0 = r9
                r1 = r10
                r2 = r10
                r3 = r6
                if (r2 >= r3) goto L25
                r2 = 0
                goto L26
            L25:
                r2 = r7
            L26:
                int r1 = r1 - r2
                r2 = r5
                r3 = r10
                r2 = r2[r3]
                r0[r1] = r2
                int r10 = r10 + 1
                goto L11
            L32:
                r0 = r9
                return r0
        }

        @Override // javassist.bytecode.StackMapTable.Shifter
        void update(int r6, int r7) {
                r5 = this;
                r0 = r5
                int r0 = r0.position
                r8 = r0
                r0 = r5
                r1 = r8
                r2 = r7
                int r1 = r1 + r2
                r2 = r8
                if (r2 != 0) goto L11
                r2 = 0
                goto L12
            L11:
                r2 = 1
            L12:
                int r1 = r1 + r2
                r0.position = r1
                r0 = r7
                r9 = r0
                r0 = r5
                int r0 = r0.where
                r1 = r5
                int r1 = r1.position
                if (r0 != r1) goto L2f
                r0 = r7
                r1 = r5
                int r1 = r1.gap
                int r0 = r0 - r1
                r9 = r0
                goto L43
            L2f:
                r0 = r5
                int r0 = r0.where
                r1 = r8
                if (r0 != r1) goto L42
                r0 = r7
                r1 = r5
                int r1 = r1.gap
                int r0 = r0 + r1
                r9 = r0
                goto L43
            L42:
                return
            L43:
                r0 = r9
                r1 = r5
                byte[] r1 = r1.info
                r2 = r6
                r3 = 1
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMapTable$Walker.class */
    public static class Walker {
        byte[] info;
        int numOfEntries;

        public Walker(javassist.bytecode.StackMapTable r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                byte[] r1 = r1.get()
                r0.<init>(r1)
                return
        }

        public Walker(byte[] r5) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.info = r1
                r0 = r4
                r1 = r5
                r2 = 0
                int r1 = javassist.bytecode.ByteArray.readU16bit(r1, r2)
                r0.numOfEntries = r1
                return
        }

        public final int size() {
                r2 = this;
                r0 = r2
                int r0 = r0.numOfEntries
                return r0
        }

        public void parse() throws javassist.bytecode.BadBytecode {
                r4 = this;
                r0 = r4
                int r0 = r0.numOfEntries
                r5 = r0
                r0 = 2
                r6 = r0
                r0 = 0
                r7 = r0
            L9:
                r0 = r7
                r1 = r5
                if (r0 >= r1) goto L1b
                r0 = r4
                r1 = r6
                r2 = r7
                int r0 = r0.stackMapFrames(r1, r2)
                r6 = r0
                int r7 = r7 + 1
                goto L9
            L1b:
                return
        }

        int stackMapFrames(int r7, int r8) throws javassist.bytecode.BadBytecode {
                r6 = this;
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r9 = r0
                r0 = r9
                r1 = 64
                if (r0 >= r1) goto L1d
                r0 = r6
                r1 = r7
                r2 = r9
                r0.sameFrame(r1, r2)
                int r7 = r7 + 1
                goto Ld4
            L1d:
                r0 = r9
                r1 = 128(0x80, float:1.8E-43)
                if (r0 >= r1) goto L2e
                r0 = r6
                r1 = r7
                r2 = r9
                int r0 = r0.sameLocals(r1, r2)
                r7 = r0
                goto Ld4
            L2e:
                r0 = r9
                r1 = 247(0xf7, float:3.46E-43)
                if (r0 >= r1) goto L67
                javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
                r1 = r0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = r2
                r3.<init>()
                java.lang.String r3 = "bad frame_type "
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r9
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = " in StackMapTable (pos: "
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r7
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = ", frame no.:"
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = r8
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = ")"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r0
            L67:
                r0 = r9
                r1 = 247(0xf7, float:3.46E-43)
                if (r0 != r1) goto L78
                r0 = r6
                r1 = r7
                r2 = r9
                int r0 = r0.sameLocals(r1, r2)
                r7 = r0
                goto Ld4
            L78:
                r0 = r9
                r1 = 251(0xfb, float:3.52E-43)
                if (r0 >= r1) goto L9d
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                r2 = 1
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r10 = r0
                r0 = r6
                r1 = r7
                r2 = r10
                r3 = 251(0xfb, float:3.52E-43)
                r4 = r9
                int r3 = r3 - r4
                r0.chopFrame(r1, r2, r3)
                int r7 = r7 + 3
                goto Ld4
            L9d:
                r0 = r9
                r1 = 251(0xfb, float:3.52E-43)
                if (r0 != r1) goto Lbd
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                r2 = 1
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r10 = r0
                r0 = r6
                r1 = r7
                r2 = r10
                r0.sameFrame(r1, r2)
                int r7 = r7 + 3
                goto Ld4
            Lbd:
                r0 = r9
                r1 = 255(0xff, float:3.57E-43)
                if (r0 >= r1) goto Lce
                r0 = r6
                r1 = r7
                r2 = r9
                int r0 = r0.appendFrame(r1, r2)
                r7 = r0
                goto Ld4
            Lce:
                r0 = r6
                r1 = r7
                int r0 = r0.fullFrame(r1)
                r7 = r0
            Ld4:
                r0 = r7
                return r0
        }

        public void sameFrame(int r2, int r3) throws javassist.bytecode.BadBytecode {
                r1 = this;
                return
        }

        private int sameLocals(int r7, int r8) throws javassist.bytecode.BadBytecode {
                r6 = this;
                r0 = r7
                r9 = r0
                r0 = r8
                r1 = 128(0x80, float:1.8E-43)
                if (r0 >= r1) goto L12
                r0 = r8
                r1 = 64
                int r0 = r0 - r1
                r10 = r0
                goto L21
            L12:
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                r2 = 1
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r10 = r0
                int r7 = r7 + 2
            L21:
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                r2 = 1
                int r1 = r1 + r2
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r11 = r0
                r0 = 0
                r12 = r0
                r0 = r11
                r1 = 7
                if (r0 == r1) goto L40
                r0 = r11
                r1 = 8
                if (r0 != r1) goto L5a
            L40:
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                r2 = 2
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r12 = r0
                r0 = r6
                r1 = r11
                r2 = r12
                r3 = r7
                r4 = 2
                int r3 = r3 + r4
                r0.objectOrUninitialized(r1, r2, r3)
                int r7 = r7 + 2
            L5a:
                r0 = r6
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r0.sameLocals(r1, r2, r3, r4)
                r0 = r7
                r1 = 2
                int r0 = r0 + r1
                return r0
        }

        public void sameLocals(int r2, int r3, int r4, int r5) throws javassist.bytecode.BadBytecode {
                r1 = this;
                return
        }

        public void chopFrame(int r2, int r3, int r4) throws javassist.bytecode.BadBytecode {
                r1 = this;
                return
        }

        private int appendFrame(int r7, int r8) throws javassist.bytecode.BadBytecode {
                r6 = this;
                r0 = r8
                r1 = 251(0xfb, float:3.52E-43)
                int r0 = r0 - r1
                r9 = r0
                r0 = r6
                byte[] r0 = r0.info
                r1 = r7
                r2 = 1
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r10 = r0
                r0 = r9
                int[] r0 = new int[r0]
                r11 = r0
                r0 = r9
                int[] r0 = new int[r0]
                r12 = r0
                r0 = r7
                r1 = 3
                int r0 = r0 + r1
                r13 = r0
                r0 = 0
                r14 = r0
            L24:
                r0 = r14
                r1 = r9
                if (r0 >= r1) goto L80
                r0 = r6
                byte[] r0 = r0.info
                r1 = r13
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r15 = r0
                r0 = r11
                r1 = r14
                r2 = r15
                r0[r1] = r2
                r0 = r15
                r1 = 7
                if (r0 == r1) goto L4c
                r0 = r15
                r1 = 8
                if (r0 != r1) goto L71
            L4c:
                r0 = r12
                r1 = r14
                r2 = r6
                byte[] r2 = r2.info
                r3 = r13
                r4 = 1
                int r3 = r3 + r4
                int r2 = javassist.bytecode.ByteArray.readU16bit(r2, r3)
                r0[r1] = r2
                r0 = r6
                r1 = r15
                r2 = r12
                r3 = r14
                r2 = r2[r3]
                r3 = r13
                r4 = 1
                int r3 = r3 + r4
                r0.objectOrUninitialized(r1, r2, r3)
                int r13 = r13 + 3
                goto L7a
            L71:
                r0 = r12
                r1 = r14
                r2 = 0
                r0[r1] = r2
                int r13 = r13 + 1
            L7a:
                int r14 = r14 + 1
                goto L24
            L80:
                r0 = r6
                r1 = r7
                r2 = r10
                r3 = r11
                r4 = r12
                r0.appendFrame(r1, r2, r3, r4)
                r0 = r13
                return r0
        }

        public void appendFrame(int r2, int r3, int[] r4, int[] r5) throws javassist.bytecode.BadBytecode {
                r1 = this;
                return
        }

        private int fullFrame(int r9) throws javassist.bytecode.BadBytecode {
                r8 = this;
                r0 = r8
                byte[] r0 = r0.info
                r1 = r9
                r2 = 1
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r10 = r0
                r0 = r8
                byte[] r0 = r0.info
                r1 = r9
                r2 = 3
                int r1 = r1 + r2
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r11 = r0
                r0 = r11
                int[] r0 = new int[r0]
                r12 = r0
                r0 = r11
                int[] r0 = new int[r0]
                r13 = r0
                r0 = r8
                r1 = r9
                r2 = 5
                int r1 = r1 + r2
                r2 = r11
                r3 = r12
                r4 = r13
                int r0 = r0.verifyTypeInfo(r1, r2, r3, r4)
                r14 = r0
                r0 = r8
                byte[] r0 = r0.info
                r1 = r14
                int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
                r15 = r0
                r0 = r15
                int[] r0 = new int[r0]
                r16 = r0
                r0 = r15
                int[] r0 = new int[r0]
                r17 = r0
                r0 = r8
                r1 = r14
                r2 = 2
                int r1 = r1 + r2
                r2 = r15
                r3 = r16
                r4 = r17
                int r0 = r0.verifyTypeInfo(r1, r2, r3, r4)
                r14 = r0
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r12
                r4 = r13
                r5 = r16
                r6 = r17
                r0.fullFrame(r1, r2, r3, r4, r5, r6)
                r0 = r14
                return r0
        }

        public void fullFrame(int r2, int r3, int[] r4, int[] r5, int[] r6, int[] r7) throws javassist.bytecode.BadBytecode {
                r1 = this;
                return
        }

        private int verifyTypeInfo(int r6, int r7, int[] r8, int[] r9) {
                r5 = this;
                r0 = 0
                r10 = r0
            L3:
                r0 = r10
                r1 = r7
                if (r0 >= r1) goto L4e
                r0 = r5
                byte[] r0 = r0.info
                r1 = r6
                int r6 = r6 + 1
                r0 = r0[r1]
                r1 = 255(0xff, float:3.57E-43)
                r0 = r0 & r1
                r11 = r0
                r0 = r8
                r1 = r10
                r2 = r11
                r0[r1] = r2
                r0 = r11
                r1 = 7
                if (r0 == r1) goto L2c
                r0 = r11
                r1 = 8
                if (r0 != r1) goto L48
            L2c:
                r0 = r9
                r1 = r10
                r2 = r5
                byte[] r2 = r2.info
                r3 = r6
                int r2 = javassist.bytecode.ByteArray.readU16bit(r2, r3)
                r0[r1] = r2
                r0 = r5
                r1 = r11
                r2 = r9
                r3 = r10
                r2 = r2[r3]
                r3 = r6
                r0.objectOrUninitialized(r1, r2, r3)
                int r6 = r6 + 2
            L48:
                int r10 = r10 + 1
                goto L3
            L4e:
                r0 = r6
                return r0
        }

        public void objectOrUninitialized(int r2, int r3, int r4) {
                r1 = this;
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/StackMapTable$Writer.class */
    public static class Writer {
        java.io.ByteArrayOutputStream output;
        int numOfEntries;

        public Writer(int r6) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
                r2 = r1
                r3 = r6
                r2.<init>(r3)
                r0.output = r1
                r0 = r5
                r1 = 0
                r0.numOfEntries = r1
                r0 = r5
                java.io.ByteArrayOutputStream r0 = r0.output
                r1 = 0
                r0.write(r1)
                r0 = r5
                java.io.ByteArrayOutputStream r0 = r0.output
                r1 = 0
                r0.write(r1)
                return
        }

        public byte[] toByteArray() {
                r4 = this;
                r0 = r4
                java.io.ByteArrayOutputStream r0 = r0.output
                byte[] r0 = r0.toByteArray()
                r5 = r0
                r0 = r4
                int r0 = r0.numOfEntries
                r1 = r5
                r2 = 0
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
                r0 = r5
                return r0
        }

        public javassist.bytecode.StackMapTable toStackMapTable(javassist.bytecode.ConstPool r6) {
                r5 = this;
                javassist.bytecode.StackMapTable r0 = new javassist.bytecode.StackMapTable
                r1 = r0
                r2 = r6
                r3 = r5
                byte[] r3 = r3.toByteArray()
                r1.<init>(r2, r3)
                return r0
        }

        public void sameFrame(int r5) {
                r4 = this;
                r0 = r4
                r1 = r0
                int r1 = r1.numOfEntries
                r2 = 1
                int r1 = r1 + r2
                r0.numOfEntries = r1
                r0 = r5
                r1 = 64
                if (r0 >= r1) goto L1b
                r0 = r4
                java.io.ByteArrayOutputStream r0 = r0.output
                r1 = r5
                r0.write(r1)
                goto L2a
            L1b:
                r0 = r4
                java.io.ByteArrayOutputStream r0 = r0.output
                r1 = 251(0xfb, float:3.52E-43)
                r0.write(r1)
                r0 = r4
                r1 = r5
                r0.write16(r1)
            L2a:
                return
        }

        public void sameLocals(int r5, int r6, int r7) {
                r4 = this;
                r0 = r4
                r1 = r0
                int r1 = r1.numOfEntries
                r2 = 1
                int r1 = r1 + r2
                r0.numOfEntries = r1
                r0 = r5
                r1 = 64
                if (r0 >= r1) goto L1e
                r0 = r4
                java.io.ByteArrayOutputStream r0 = r0.output
                r1 = r5
                r2 = 64
                int r1 = r1 + r2
                r0.write(r1)
                goto L2d
            L1e:
                r0 = r4
                java.io.ByteArrayOutputStream r0 = r0.output
                r1 = 247(0xf7, float:3.46E-43)
                r0.write(r1)
                r0 = r4
                r1 = r5
                r0.write16(r1)
            L2d:
                r0 = r4
                r1 = r6
                r2 = r7
                r0.writeTypeInfo(r1, r2)
                return
        }

        public void chopFrame(int r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r0
                int r1 = r1.numOfEntries
                r2 = 1
                int r1 = r1 + r2
                r0.numOfEntries = r1
                r0 = r4
                java.io.ByteArrayOutputStream r0 = r0.output
                r1 = 251(0xfb, float:3.52E-43)
                r2 = r6
                int r1 = r1 - r2
                r0.write(r1)
                r0 = r4
                r1 = r5
                r0.write16(r1)
                return
        }

        public void appendFrame(int r6, int[] r7, int[] r8) {
                r5 = this;
                r0 = r5
                r1 = r0
                int r1 = r1.numOfEntries
                r2 = 1
                int r1 = r1 + r2
                r0.numOfEntries = r1
                r0 = r7
                int r0 = r0.length
                r9 = r0
                r0 = r5
                java.io.ByteArrayOutputStream r0 = r0.output
                r1 = r9
                r2 = 251(0xfb, float:3.52E-43)
                int r1 = r1 + r2
                r0.write(r1)
                r0 = r5
                r1 = r6
                r0.write16(r1)
                r0 = 0
                r10 = r0
            L23:
                r0 = r10
                r1 = r9
                if (r0 >= r1) goto L3c
                r0 = r5
                r1 = r7
                r2 = r10
                r1 = r1[r2]
                r2 = r8
                r3 = r10
                r2 = r2[r3]
                r0.writeTypeInfo(r1, r2)
                int r10 = r10 + 1
                goto L23
            L3c:
                return
        }

        public void fullFrame(int r6, int[] r7, int[] r8, int[] r9, int[] r10) {
                r5 = this;
                r0 = r5
                r1 = r0
                int r1 = r1.numOfEntries
                r2 = 1
                int r1 = r1 + r2
                r0.numOfEntries = r1
                r0 = r5
                java.io.ByteArrayOutputStream r0 = r0.output
                r1 = 255(0xff, float:3.57E-43)
                r0.write(r1)
                r0 = r5
                r1 = r6
                r0.write16(r1)
                r0 = r7
                int r0 = r0.length
                r11 = r0
                r0 = r5
                r1 = r11
                r0.write16(r1)
                r0 = 0
                r12 = r0
            L26:
                r0 = r12
                r1 = r11
                if (r0 >= r1) goto L3f
                r0 = r5
                r1 = r7
                r2 = r12
                r1 = r1[r2]
                r2 = r8
                r3 = r12
                r2 = r2[r3]
                r0.writeTypeInfo(r1, r2)
                int r12 = r12 + 1
                goto L26
            L3f:
                r0 = r9
                int r0 = r0.length
                r11 = r0
                r0 = r5
                r1 = r11
                r0.write16(r1)
                r0 = 0
                r12 = r0
            L4d:
                r0 = r12
                r1 = r11
                if (r0 >= r1) goto L68
                r0 = r5
                r1 = r9
                r2 = r12
                r1 = r1[r2]
                r2 = r10
                r3 = r12
                r2 = r2[r3]
                r0.writeTypeInfo(r1, r2)
                int r12 = r12 + 1
                goto L4d
            L68:
                return
        }

        private void writeTypeInfo(int r4, int r5) {
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
                r0.write16(r1)
            L19:
                return
        }

        private void write16(int r5) {
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

    StackMapTable(javassist.bytecode.ConstPool r6, byte[] r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            java.lang.String r2 = "StackMapTable"
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    StackMapTable(javassist.bytecode.ConstPool r6, int r7, java.io.DataInputStream r8) throws java.io.IOException {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // javassist.bytecode.AttributeInfo
    public javassist.bytecode.AttributeInfo copy(javassist.bytecode.ConstPool r11, java.util.Map<java.lang.String, java.lang.String> r12) throws javassist.bytecode.StackMapTable.RuntimeCopyException {
            r10 = this;
            javassist.bytecode.StackMapTable r0 = new javassist.bytecode.StackMapTable     // Catch: javassist.bytecode.BadBytecode -> L1d
            r1 = r0
            r2 = r11
            javassist.bytecode.StackMapTable$Copier r3 = new javassist.bytecode.StackMapTable$Copier     // Catch: javassist.bytecode.BadBytecode -> L1d
            r4 = r3
            r5 = r10
            javassist.bytecode.ConstPool r5 = r5.constPool     // Catch: javassist.bytecode.BadBytecode -> L1d
            r6 = r10
            byte[] r6 = r6.info     // Catch: javassist.bytecode.BadBytecode -> L1d
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8)     // Catch: javassist.bytecode.BadBytecode -> L1d
            byte[] r3 = r3.doit()     // Catch: javassist.bytecode.BadBytecode -> L1d
            r1.<init>(r2, r3)     // Catch: javassist.bytecode.BadBytecode -> L1d
            return r0
        L1d:
            r13 = move-exception
            javassist.bytecode.StackMapTable$RuntimeCopyException r0 = new javassist.bytecode.StackMapTable$RuntimeCopyException
            r1 = r0
            java.lang.String r2 = "bad bytecode. fatal?"
            r1.<init>(r2)
            throw r0
    }

    @Override // javassist.bytecode.AttributeInfo
    void write(java.io.DataOutputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = r3
            r1 = r4
            super.write(r1)
            return
    }

    public void insertLocal(int r8, int r9, int r10) throws javassist.bytecode.BadBytecode {
            r7 = this;
            javassist.bytecode.StackMapTable$InsertLocal r0 = new javassist.bytecode.StackMapTable$InsertLocal
            r1 = r0
            r2 = r7
            byte[] r2 = r2.get()
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

    public static int typeTagOf(char r2) {
            r0 = r2
            switch(r0) {
                case 68: goto L34;
                case 70: goto L36;
                case 74: goto L38;
                case 76: goto L3a;
                case 91: goto L3a;
                default: goto L3d;
            }
        L34:
            r0 = 3
            return r0
        L36:
            r0 = 2
            return r0
        L38:
            r0 = 4
            return r0
        L3a:
            r0 = 7
            return r0
        L3d:
            r0 = 1
            return r0
    }

    public void println(java.io.PrintWriter r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            javassist.bytecode.StackMapTable.Printer.print(r0, r1)
            return
    }

    public void println(java.io.PrintStream r7) {
            r6 = this;
            r0 = r6
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r2 = r1
            r3 = r7
            r4 = 1
            r2.<init>(r3, r4)
            javassist.bytecode.StackMapTable.Printer.print(r0, r1)
            return
    }

    void shiftPc(int r8, int r9, boolean r10) throws javassist.bytecode.BadBytecode {
            r7 = this;
            javassist.bytecode.StackMapTable$OffsetShifter r0 = new javassist.bytecode.StackMapTable$OffsetShifter
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4)
            r0.parse()
            javassist.bytecode.StackMapTable$Shifter r0 = new javassist.bytecode.StackMapTable$Shifter
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5)
            r0.doit()
            return
    }

    void shiftForSwitch(int r7, int r8) throws javassist.bytecode.BadBytecode {
            r6 = this;
            javassist.bytecode.StackMapTable$SwitchShifter r0 = new javassist.bytecode.StackMapTable$SwitchShifter
            r1 = r0
            r2 = r6
            r3 = r7
            r4 = r8
            r1.<init>(r2, r3, r4)
            r0.doit()
            return
    }

    public void removeNew(int r6) throws javassist.CannotCompileException {
            r5 = this;
            javassist.bytecode.StackMapTable$NewRemover r0 = new javassist.bytecode.StackMapTable$NewRemover     // Catch: javassist.bytecode.BadBytecode -> L18
            r1 = r0
            r2 = r5
            byte[] r2 = r2.get()     // Catch: javassist.bytecode.BadBytecode -> L18
            r3 = r6
            r1.<init>(r2, r3)     // Catch: javassist.bytecode.BadBytecode -> L18
            byte[] r0 = r0.doit()     // Catch: javassist.bytecode.BadBytecode -> L18
            r7 = r0
            r0 = r5
            r1 = r7
            r0.set(r1)     // Catch: javassist.bytecode.BadBytecode -> L18
            goto L24
        L18:
            r7 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "bad stack map table"
            r3 = r7
            r1.<init>(r2, r3)
            throw r0
        L24:
            return
    }
}
