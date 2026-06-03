package javassist.bytecode;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeIterator.class */
public class CodeIterator implements javassist.bytecode.Opcode {
    protected javassist.bytecode.CodeAttribute codeAttr;
    protected byte[] bytecode;
    protected int endPos;
    protected int currentPos;
    protected int mark;
    protected int mark2;
    private static final int[] opcodeLength = null;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeIterator$AlignmentException.class */
    static class AlignmentException extends java.lang.Exception {
        private static final long serialVersionUID = 1;

        AlignmentException() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeIterator$Branch.class */
    static abstract class Branch {
        int pos;
        int orgPos;

        Branch(int r6) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                r1 = r5
                r2 = r6
                r3 = r2; r2 = r1; r1 = r3; 
                r2.orgPos = r3
                r0.pos = r1
                return
        }

        void shift(int r5, int r6, boolean r7) {
                r4 = this;
                r0 = r5
                r1 = r4
                int r1 = r1.pos
                if (r0 < r1) goto L14
                r0 = r5
                r1 = r4
                int r1 = r1.pos
                if (r0 != r1) goto L1e
                r0 = r7
                if (r0 == 0) goto L1e
            L14:
                r0 = r4
                r1 = r0
                int r1 = r1.pos
                r2 = r6
                int r1 = r1 + r2
                r0.pos = r1
            L1e:
                return
        }

        static int shiftOffset(int r3, int r4, int r5, int r6, boolean r7) {
                r0 = r3
                r1 = r4
                int r0 = r0 + r1
                r8 = r0
                r0 = r3
                r1 = r5
                if (r0 >= r1) goto L22
                r0 = r5
                r1 = r8
                if (r0 < r1) goto L1b
                r0 = r7
                if (r0 == 0) goto L60
                r0 = r5
                r1 = r8
                if (r0 != r1) goto L60
            L1b:
                r0 = r4
                r1 = r6
                int r0 = r0 + r1
                r4 = r0
                goto L60
            L22:
                r0 = r3
                r1 = r5
                if (r0 != r1) goto L4b
                r0 = r8
                r1 = r5
                if (r0 >= r1) goto L39
                r0 = r7
                if (r0 == 0) goto L39
                r0 = r4
                r1 = r6
                int r0 = r0 - r1
                r4 = r0
                goto L60
            L39:
                r0 = r5
                r1 = r8
                if (r0 >= r1) goto L60
                r0 = r7
                if (r0 != 0) goto L60
                r0 = r4
                r1 = r6
                int r0 = r0 + r1
                r4 = r0
                goto L60
            L4b:
                r0 = r8
                r1 = r5
                if (r0 < r1) goto L5c
                r0 = r7
                if (r0 != 0) goto L60
                r0 = r5
                r1 = r8
                if (r0 != r1) goto L60
            L5c:
                r0 = r4
                r1 = r6
                int r0 = r0 - r1
                r4 = r0
            L60:
                r0 = r4
                return r0
        }

        boolean expanded() {
                r2 = this;
                r0 = 0
                return r0
        }

        int gapChanged() {
                r2 = this;
                r0 = 0
                return r0
        }

        int deltaSize() {
                r2 = this;
                r0 = 0
                return r0
        }

        abstract int write(int r1, byte[] r2, int r3, byte[] r4) throws javassist.bytecode.BadBytecode;
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeIterator$Branch16.class */
    static abstract class Branch16 extends javassist.bytecode.CodeIterator.Branch {
        int offset;
        int state;
        static final int BIT16 = 0;
        static final int EXPAND = 1;
        static final int BIT32 = 2;

        Branch16(int r4, int r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r5
                r0.offset = r1
                r0 = r3
                r1 = 0
                r0.state = r1
                return
        }

        @Override // javassist.bytecode.CodeIterator.Branch
        void shift(int r8, int r9, boolean r10) {
                r7 = this;
                r0 = r7
                r1 = r7
                int r1 = r1.pos
                r2 = r7
                int r2 = r2.offset
                r3 = r8
                r4 = r9
                r5 = r10
                int r1 = shiftOffset(r1, r2, r3, r4, r5)
                r0.offset = r1
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                super.shift(r1, r2, r3)
                r0 = r7
                int r0 = r0.state
                if (r0 != 0) goto L39
                r0 = r7
                int r0 = r0.offset
                r1 = -32768(0xffffffffffff8000, float:NaN)
                if (r0 < r1) goto L34
                r0 = 32767(0x7fff, float:4.5916E-41)
                r1 = r7
                int r1 = r1.offset
                if (r0 >= r1) goto L39
            L34:
                r0 = r7
                r1 = 1
                r0.state = r1
            L39:
                return
        }

        @Override // javassist.bytecode.CodeIterator.Branch
        boolean expanded() {
                r3 = this;
                r0 = r3
                int r0 = r0.state
                r1 = 1
                if (r0 != r1) goto Lf
                r0 = r3
                r1 = 2
                r0.state = r1
                r0 = 1
                return r0
            Lf:
                r0 = 0
                return r0
        }

        @Override // javassist.bytecode.CodeIterator.Branch
        abstract int deltaSize();

        abstract void write32(int r1, byte[] r2, int r3, byte[] r4);

        @Override // javassist.bytecode.CodeIterator.Branch
        int write(int r7, byte[] r8, int r9, byte[] r10) {
                r6 = this;
                r0 = r6
                int r0 = r0.state
                r1 = 2
                if (r0 != r1) goto L14
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r0.write32(r1, r2, r3, r4)
                goto L27
            L14:
                r0 = r10
                r1 = r9
                r2 = r8
                r3 = r7
                r2 = r2[r3]
                r0[r1] = r2
                r0 = r6
                int r0 = r0.offset
                r1 = r10
                r2 = r9
                r3 = 1
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            L27:
                r0 = 3
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeIterator$Gap.class */
    public static class Gap {
        public int position;
        public int length;

        public Gap() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeIterator$If16.class */
    static class If16 extends javassist.bytecode.CodeIterator.Branch16 {
        If16(int r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        @Override // javassist.bytecode.CodeIterator.Branch16, javassist.bytecode.CodeIterator.Branch
        int deltaSize() {
                r3 = this;
                r0 = r3
                int r0 = r0.state
                r1 = 2
                if (r0 != r1) goto Lc
                r0 = 5
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // javassist.bytecode.CodeIterator.Branch16
        void write32(int r7, byte[] r8, int r9, byte[] r10) {
                r6 = this;
                r0 = r10
                r1 = r9
                r2 = r6
                r3 = r8
                r4 = r7
                r3 = r3[r4]
                r4 = 255(0xff, float:3.57E-43)
                r3 = r3 & r4
                int r2 = r2.opcode(r3)
                byte r2 = (byte) r2
                r0[r1] = r2
                r0 = r10
                r1 = r9
                r2 = 1
                int r1 = r1 + r2
                r2 = 0
                r0[r1] = r2
                r0 = r10
                r1 = r9
                r2 = 2
                int r1 = r1 + r2
                r2 = 8
                r0[r1] = r2
                r0 = r10
                r1 = r9
                r2 = 3
                int r1 = r1 + r2
                r2 = -56
                r0[r1] = r2
                r0 = r6
                int r0 = r0.offset
                r1 = 3
                int r0 = r0 - r1
                r1 = r10
                r2 = r9
                r3 = 4
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
                return
        }

        int opcode(int r4) {
                r3 = this;
                r0 = r4
                r1 = 198(0xc6, float:2.77E-43)
                if (r0 != r1) goto Lb
                r0 = 199(0xc7, float:2.79E-43)
                return r0
            Lb:
                r0 = r4
                r1 = 199(0xc7, float:2.79E-43)
                if (r0 != r1) goto L16
                r0 = 198(0xc6, float:2.77E-43)
                return r0
            L16:
                r0 = r4
                r1 = 153(0x99, float:2.14E-43)
                int r0 = r0 - r1
                r1 = 1
                r0 = r0 & r1
                if (r0 != 0) goto L24
                r0 = r4
                r1 = 1
                int r0 = r0 + r1
                return r0
            L24:
                r0 = r4
                r1 = 1
                int r0 = r0 - r1
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeIterator$Jump16.class */
    static class Jump16 extends javassist.bytecode.CodeIterator.Branch16 {
        Jump16(int r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        @Override // javassist.bytecode.CodeIterator.Branch16, javassist.bytecode.CodeIterator.Branch
        int deltaSize() {
                r3 = this;
                r0 = r3
                int r0 = r0.state
                r1 = 2
                if (r0 != r1) goto Lc
                r0 = 2
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // javassist.bytecode.CodeIterator.Branch16
        void write32(int r6, byte[] r7, int r8, byte[] r9) {
                r5 = this;
                r0 = r9
                r1 = r8
                r2 = r7
                r3 = r6
                r2 = r2[r3]
                r3 = 255(0xff, float:3.57E-43)
                r2 = r2 & r3
                r3 = 167(0xa7, float:2.34E-43)
                if (r2 != r3) goto L16
                r2 = 200(0xc8, float:2.8E-43)
                goto L19
            L16:
                r2 = 201(0xc9, float:2.82E-43)
            L19:
                byte r2 = (byte) r2
                r0[r1] = r2
                r0 = r5
                int r0 = r0.offset
                r1 = r9
                r2 = r8
                r3 = 1
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeIterator$Jump32.class */
    static class Jump32 extends javassist.bytecode.CodeIterator.Branch {
        int offset;

        Jump32(int r4, int r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r5
                r0.offset = r1
                return
        }

        @Override // javassist.bytecode.CodeIterator.Branch
        void shift(int r8, int r9, boolean r10) {
                r7 = this;
                r0 = r7
                r1 = r7
                int r1 = r1.pos
                r2 = r7
                int r2 = r2.offset
                r3 = r8
                r4 = r9
                r5 = r10
                int r1 = shiftOffset(r1, r2, r3, r4, r5)
                r0.offset = r1
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                super.shift(r1, r2, r3)
                return
        }

        @Override // javassist.bytecode.CodeIterator.Branch
        int write(int r6, byte[] r7, int r8, byte[] r9) {
                r5 = this;
                r0 = r9
                r1 = r8
                r2 = r7
                r3 = r6
                r2 = r2[r3]
                r0[r1] = r2
                r0 = r5
                int r0 = r0.offset
                r1 = r9
                r2 = r8
                r3 = 1
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
                r0 = 5
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeIterator$LdcW.class */
    static class LdcW extends javassist.bytecode.CodeIterator.Branch {
        int index;
        boolean state;

        LdcW(int r4, int r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = r5
                r0.index = r1
                r0 = r3
                r1 = 1
                r0.state = r1
                return
        }

        @Override // javassist.bytecode.CodeIterator.Branch
        boolean expanded() {
                r3 = this;
                r0 = r3
                boolean r0 = r0.state
                if (r0 == 0) goto Le
                r0 = r3
                r1 = 0
                r0.state = r1
                r0 = 1
                return r0
            Le:
                r0 = 0
                return r0
        }

        @Override // javassist.bytecode.CodeIterator.Branch
        int deltaSize() {
                r2 = this;
                r0 = 1
                return r0
        }

        @Override // javassist.bytecode.CodeIterator.Branch
        int write(int r6, byte[] r7, int r8, byte[] r9) {
                r5 = this;
                r0 = r9
                r1 = r8
                r2 = 19
                r0[r1] = r2
                r0 = r5
                int r0 = r0.index
                r1 = r9
                r2 = r8
                r3 = 1
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
                r0 = 2
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeIterator$Lookup.class */
    static class Lookup extends javassist.bytecode.CodeIterator.Switcher {
        int[] matches;

        Lookup(int r7, int r8, int[] r9, int[] r10, javassist.bytecode.CodeIterator.Pointers r11) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r10
                r4 = r11
                r0.<init>(r1, r2, r3, r4)
                r0 = r6
                r1 = r9
                r0.matches = r1
                return
        }

        @Override // javassist.bytecode.CodeIterator.Switcher
        int write2(int r6, byte[] r7) {
                r5 = this;
                r0 = r5
                int[] r0 = r0.matches
                int r0 = r0.length
                r8 = r0
                r0 = r8
                r1 = r7
                r2 = r6
                javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
                int r6 = r6 + 4
                r0 = 0
                r9 = r0
            L12:
                r0 = r9
                r1 = r8
                if (r0 >= r1) goto L3b
                r0 = r5
                int[] r0 = r0.matches
                r1 = r9
                r0 = r0[r1]
                r1 = r7
                r2 = r6
                javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
                r0 = r5
                int[] r0 = r0.offsets
                r1 = r9
                r0 = r0[r1]
                r1 = r7
                r2 = r6
                r3 = 4
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
                int r6 = r6 + 8
                int r9 = r9 + 1
                goto L12
            L3b:
                r0 = 4
                r1 = 8
                r2 = r8
                int r1 = r1 * r2
                int r0 = r0 + r1
                return r0
        }

        @Override // javassist.bytecode.CodeIterator.Switcher
        int tableSize() {
                r4 = this;
                r0 = 4
                r1 = 8
                r2 = r4
                int[] r2 = r2.matches
                int r2 = r2.length
                int r1 = r1 * r2
                int r0 = r0 + r1
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeIterator$Pointers.class */
    static class Pointers {
        int cursor;
        int mark0;
        int mark;
        int mark2;
        javassist.bytecode.ExceptionTable etable;
        javassist.bytecode.LineNumberAttribute line;
        javassist.bytecode.LocalVariableAttribute vars;
        javassist.bytecode.LocalVariableAttribute types;
        javassist.bytecode.StackMapTable stack;
        javassist.bytecode.StackMap stack2;

        Pointers(int r5, int r6, int r7, int r8, javassist.bytecode.ExceptionTable r9, javassist.bytecode.CodeAttribute r10) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.cursor = r1
                r0 = r4
                r1 = r6
                r0.mark = r1
                r0 = r4
                r1 = r7
                r0.mark2 = r1
                r0 = r4
                r1 = r8
                r0.mark0 = r1
                r0 = r4
                r1 = r9
                r0.etable = r1
                r0 = r4
                r1 = r10
                java.lang.String r2 = "LineNumberTable"
                javassist.bytecode.AttributeInfo r1 = r1.getAttribute(r2)
                javassist.bytecode.LineNumberAttribute r1 = (javassist.bytecode.LineNumberAttribute) r1
                r0.line = r1
                r0 = r4
                r1 = r10
                java.lang.String r2 = "LocalVariableTable"
                javassist.bytecode.AttributeInfo r1 = r1.getAttribute(r2)
                javassist.bytecode.LocalVariableAttribute r1 = (javassist.bytecode.LocalVariableAttribute) r1
                r0.vars = r1
                r0 = r4
                r1 = r10
                java.lang.String r2 = "LocalVariableTypeTable"
                javassist.bytecode.AttributeInfo r1 = r1.getAttribute(r2)
                javassist.bytecode.LocalVariableAttribute r1 = (javassist.bytecode.LocalVariableAttribute) r1
                r0.types = r1
                r0 = r4
                r1 = r10
                java.lang.String r2 = "StackMapTable"
                javassist.bytecode.AttributeInfo r1 = r1.getAttribute(r2)
                javassist.bytecode.StackMapTable r1 = (javassist.bytecode.StackMapTable) r1
                r0.stack = r1
                r0 = r4
                r1 = r10
                java.lang.String r2 = "StackMap"
                javassist.bytecode.AttributeInfo r1 = r1.getAttribute(r2)
                javassist.bytecode.StackMap r1 = (javassist.bytecode.StackMap) r1
                r0.stack2 = r1
                return
        }

        void shiftPc(int r6, int r7, boolean r8) throws javassist.bytecode.BadBytecode {
                r5 = this;
                r0 = r6
                r1 = r5
                int r1 = r1.cursor
                if (r0 < r1) goto L14
                r0 = r6
                r1 = r5
                int r1 = r1.cursor
                if (r0 != r1) goto L1e
                r0 = r8
                if (r0 == 0) goto L1e
            L14:
                r0 = r5
                r1 = r0
                int r1 = r1.cursor
                r2 = r7
                int r1 = r1 + r2
                r0.cursor = r1
            L1e:
                r0 = r6
                r1 = r5
                int r1 = r1.mark
                if (r0 < r1) goto L32
                r0 = r6
                r1 = r5
                int r1 = r1.mark
                if (r0 != r1) goto L3c
                r0 = r8
                if (r0 == 0) goto L3c
            L32:
                r0 = r5
                r1 = r0
                int r1 = r1.mark
                r2 = r7
                int r1 = r1 + r2
                r0.mark = r1
            L3c:
                r0 = r6
                r1 = r5
                int r1 = r1.mark2
                if (r0 < r1) goto L50
                r0 = r6
                r1 = r5
                int r1 = r1.mark2
                if (r0 != r1) goto L5a
                r0 = r8
                if (r0 == 0) goto L5a
            L50:
                r0 = r5
                r1 = r0
                int r1 = r1.mark2
                r2 = r7
                int r1 = r1 + r2
                r0.mark2 = r1
            L5a:
                r0 = r6
                r1 = r5
                int r1 = r1.mark0
                if (r0 < r1) goto L6e
                r0 = r6
                r1 = r5
                int r1 = r1.mark0
                if (r0 != r1) goto L78
                r0 = r8
                if (r0 == 0) goto L78
            L6e:
                r0 = r5
                r1 = r0
                int r1 = r1.mark0
                r2 = r7
                int r1 = r1 + r2
                r0.mark0 = r1
            L78:
                r0 = r5
                javassist.bytecode.ExceptionTable r0 = r0.etable
                r1 = r6
                r2 = r7
                r3 = r8
                r0.shiftPc(r1, r2, r3)
                r0 = r5
                javassist.bytecode.LineNumberAttribute r0 = r0.line
                if (r0 == 0) goto L93
                r0 = r5
                javassist.bytecode.LineNumberAttribute r0 = r0.line
                r1 = r6
                r2 = r7
                r3 = r8
                r0.shiftPc(r1, r2, r3)
            L93:
                r0 = r5
                javassist.bytecode.LocalVariableAttribute r0 = r0.vars
                if (r0 == 0) goto La4
                r0 = r5
                javassist.bytecode.LocalVariableAttribute r0 = r0.vars
                r1 = r6
                r2 = r7
                r3 = r8
                r0.shiftPc(r1, r2, r3)
            La4:
                r0 = r5
                javassist.bytecode.LocalVariableAttribute r0 = r0.types
                if (r0 == 0) goto Lb5
                r0 = r5
                javassist.bytecode.LocalVariableAttribute r0 = r0.types
                r1 = r6
                r2 = r7
                r3 = r8
                r0.shiftPc(r1, r2, r3)
            Lb5:
                r0 = r5
                javassist.bytecode.StackMapTable r0 = r0.stack
                if (r0 == 0) goto Lc6
                r0 = r5
                javassist.bytecode.StackMapTable r0 = r0.stack
                r1 = r6
                r2 = r7
                r3 = r8
                r0.shiftPc(r1, r2, r3)
            Lc6:
                r0 = r5
                javassist.bytecode.StackMap r0 = r0.stack2
                if (r0 == 0) goto Ld7
                r0 = r5
                javassist.bytecode.StackMap r0 = r0.stack2
                r1 = r6
                r2 = r7
                r3 = r8
                r0.shiftPc(r1, r2, r3)
            Ld7:
                return
        }

        void shiftForSwitch(int r5, int r6) throws javassist.bytecode.BadBytecode {
                r4 = this;
                r0 = r4
                javassist.bytecode.StackMapTable r0 = r0.stack
                if (r0 == 0) goto L10
                r0 = r4
                javassist.bytecode.StackMapTable r0 = r0.stack
                r1 = r5
                r2 = r6
                r0.shiftForSwitch(r1, r2)
            L10:
                r0 = r4
                javassist.bytecode.StackMap r0 = r0.stack2
                if (r0 == 0) goto L20
                r0 = r4
                javassist.bytecode.StackMap r0 = r0.stack2
                r1 = r5
                r2 = r6
                r0.shiftForSwitch(r1, r2)
            L20:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeIterator$Switcher.class */
    static abstract class Switcher extends javassist.bytecode.CodeIterator.Branch {
        int gap;
        int defaultByte;
        int[] offsets;
        javassist.bytecode.CodeIterator.Pointers pointers;

        Switcher(int r6, int r7, int[] r8, javassist.bytecode.CodeIterator.Pointers r9) {
                r5 = this;
                r0 = r5
                r1 = r6
                r0.<init>(r1)
                r0 = r5
                r1 = 3
                r2 = r6
                r3 = 3
                r2 = r2 & r3
                int r1 = r1 - r2
                r0.gap = r1
                r0 = r5
                r1 = r7
                r0.defaultByte = r1
                r0 = r5
                r1 = r8
                r0.offsets = r1
                r0 = r5
                r1 = r9
                r0.pointers = r1
                return
        }

        @Override // javassist.bytecode.CodeIterator.Branch
        void shift(int r9, int r10, boolean r11) {
                r8 = this;
                r0 = r8
                int r0 = r0.pos
                r12 = r0
                r0 = r8
                r1 = r12
                r2 = r8
                int r2 = r2.defaultByte
                r3 = r9
                r4 = r10
                r5 = r11
                int r1 = shiftOffset(r1, r2, r3, r4, r5)
                r0.defaultByte = r1
                r0 = r8
                int[] r0 = r0.offsets
                int r0 = r0.length
                r13 = r0
                r0 = 0
                r14 = r0
            L20:
                r0 = r14
                r1 = r13
                if (r0 >= r1) goto L43
                r0 = r8
                int[] r0 = r0.offsets
                r1 = r14
                r2 = r12
                r3 = r8
                int[] r3 = r3.offsets
                r4 = r14
                r3 = r3[r4]
                r4 = r9
                r5 = r10
                r6 = r11
                int r2 = shiftOffset(r2, r3, r4, r5, r6)
                r0[r1] = r2
                int r14 = r14 + 1
                goto L20
            L43:
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
                super.shift(r1, r2, r3)
                return
        }

        @Override // javassist.bytecode.CodeIterator.Branch
        int gapChanged() {
                r4 = this;
                r0 = 3
                r1 = r4
                int r1 = r1.pos
                r2 = 3
                r1 = r1 & r2
                int r0 = r0 - r1
                r5 = r0
                r0 = r5
                r1 = r4
                int r1 = r1.gap
                if (r0 <= r1) goto L1f
                r0 = r5
                r1 = r4
                int r1 = r1.gap
                int r0 = r0 - r1
                r6 = r0
                r0 = r4
                r1 = r5
                r0.gap = r1
                r0 = r6
                return r0
            L1f:
                r0 = 0
                return r0
        }

        @Override // javassist.bytecode.CodeIterator.Branch
        int deltaSize() {
                r5 = this;
                r0 = r5
                int r0 = r0.gap
                r1 = 3
                r2 = r5
                int r2 = r2.orgPos
                r3 = 3
                r2 = r2 & r3
                int r1 = r1 - r2
                int r0 = r0 - r1
                return r0
        }

        @Override // javassist.bytecode.CodeIterator.Branch
        int write(int r6, byte[] r7, int r8, byte[] r9) throws javassist.bytecode.BadBytecode {
                r5 = this;
                r0 = 3
                r1 = r5
                int r1 = r1.pos
                r2 = 3
                r1 = r1 & r2
                int r0 = r0 - r1
                r10 = r0
                r0 = r5
                int r0 = r0.gap
                r1 = r10
                int r0 = r0 - r1
                r11 = r0
                r0 = 5
                r1 = 3
                r2 = r5
                int r2 = r2.orgPos
                r3 = 3
                r2 = r2 & r3
                int r1 = r1 - r2
                int r0 = r0 + r1
                r1 = r5
                int r1 = r1.tableSize()
                int r0 = r0 + r1
                r12 = r0
                r0 = r11
                if (r0 <= 0) goto L31
                r0 = r5
                r1 = r12
                r2 = r11
                r0.adjustOffsets(r1, r2)
            L31:
                r0 = r9
                r1 = r8
                int r8 = r8 + 1
                r2 = r7
                r3 = r6
                r2 = r2[r3]
                r0[r1] = r2
            L3b:
                r0 = r10
                int r10 = r10 + (-1)
                if (r0 <= 0) goto L4e
                r0 = r9
                r1 = r8
                int r8 = r8 + 1
                r2 = 0
                r0[r1] = r2
                goto L3b
            L4e:
                r0 = r5
                int r0 = r0.defaultByte
                r1 = r9
                r2 = r8
                javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
                r0 = r5
                r1 = r8
                r2 = 4
                int r1 = r1 + r2
                r2 = r9
                int r0 = r0.write2(r1, r2)
                r13 = r0
                r0 = r8
                r1 = r13
                r2 = 4
                int r1 = r1 + r2
                int r0 = r0 + r1
                r8 = r0
            L6a:
                r0 = r11
                int r11 = r11 + (-1)
                if (r0 <= 0) goto L7d
                r0 = r9
                r1 = r8
                int r8 = r8 + 1
                r2 = 0
                r0[r1] = r2
                goto L6a
            L7d:
                r0 = 5
                r1 = 3
                r2 = r5
                int r2 = r2.orgPos
                r3 = 3
                r2 = r2 & r3
                int r1 = r1 - r2
                int r0 = r0 + r1
                r1 = r13
                int r0 = r0 + r1
                return r0
        }

        abstract int write2(int r1, byte[] r2);

        abstract int tableSize();

        void adjustOffsets(int r6, int r7) throws javassist.bytecode.BadBytecode {
                r5 = this;
                r0 = r5
                javassist.bytecode.CodeIterator$Pointers r0 = r0.pointers
                r1 = r5
                int r1 = r1.pos
                r2 = r6
                int r1 = r1 + r2
                r2 = r7
                r0.shiftForSwitch(r1, r2)
                r0 = r5
                int r0 = r0.defaultByte
                r1 = r6
                if (r0 != r1) goto L20
                r0 = r5
                r1 = r0
                int r1 = r1.defaultByte
                r2 = r7
                int r1 = r1 - r2
                r0.defaultByte = r1
            L20:
                r0 = 0
                r8 = r0
            L22:
                r0 = r8
                r1 = r5
                int[] r1 = r1.offsets
                int r1 = r1.length
                if (r0 >= r1) goto L45
                r0 = r5
                int[] r0 = r0.offsets
                r1 = r8
                r0 = r0[r1]
                r1 = r6
                if (r0 != r1) goto L3f
                r0 = r5
                int[] r0 = r0.offsets
                r1 = r8
                r2 = r0; r3 = r1; 
                r2 = r2[r3]
                r3 = r7
                int r2 = r2 - r3
                r0[r1] = r2
            L3f:
                int r8 = r8 + 1
                goto L22
            L45:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/CodeIterator$Table.class */
    static class Table extends javassist.bytecode.CodeIterator.Switcher {
        int low;
        int high;

        Table(int r7, int r8, int r9, int r10, int[] r11, javassist.bytecode.CodeIterator.Pointers r12) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r11
                r4 = r12
                r0.<init>(r1, r2, r3, r4)
                r0 = r6
                r1 = r9
                r0.low = r1
                r0 = r6
                r1 = r10
                r0.high = r1
                return
        }

        @Override // javassist.bytecode.CodeIterator.Switcher
        int write2(int r6, byte[] r7) {
                r5 = this;
                r0 = r5
                int r0 = r0.low
                r1 = r7
                r2 = r6
                javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
                r0 = r5
                int r0 = r0.high
                r1 = r7
                r2 = r6
                r3 = 4
                int r2 = r2 + r3
                javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
                r0 = r5
                int[] r0 = r0.offsets
                int r0 = r0.length
                r8 = r0
                int r6 = r6 + 8
                r0 = 0
                r9 = r0
            L20:
                r0 = r9
                r1 = r8
                if (r0 >= r1) goto L3b
                r0 = r5
                int[] r0 = r0.offsets
                r1 = r9
                r0 = r0[r1]
                r1 = r7
                r2 = r6
                javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
                int r6 = r6 + 4
                int r9 = r9 + 1
                goto L20
            L3b:
                r0 = 8
                r1 = 4
                r2 = r8
                int r1 = r1 * r2
                int r0 = r0 + r1
                return r0
        }

        @Override // javassist.bytecode.CodeIterator.Switcher
        int tableSize() {
                r4 = this;
                r0 = 8
                r1 = 4
                r2 = r4
                int[] r2 = r2.offsets
                int r2 = r2.length
                int r1 = r1 * r2
                int r0 = r0 + r1
                return r0
        }
    }

    protected CodeIterator(javassist.bytecode.CodeAttribute r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.codeAttr = r1
            r0 = r3
            r1 = r4
            byte[] r1 = r1.getCode()
            r0.bytecode = r1
            r0 = r3
            r0.begin()
            return
    }

    public void begin() {
            r6 = this;
            r0 = r6
            r1 = r6
            r2 = r6
            r3 = 0
            r4 = r3; r3 = r2; r2 = r4; 
            r3.mark2 = r4
            r3 = r2; r2 = r1; r1 = r3; 
            r2.mark = r3
            r0.currentPos = r1
            r0 = r6
            r1 = r6
            int r1 = r1.getCodeLength()
            r0.endPos = r1
            return
    }

    public void move(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.currentPos = r1
            return
    }

    public void setMark(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.mark = r1
            return
    }

    public void setMark2(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.mark2 = r1
            return
    }

    public int getMark() {
            r2 = this;
            r0 = r2
            int r0 = r0.mark
            return r0
    }

    public int getMark2() {
            r2 = this;
            r0 = r2
            int r0 = r0.mark2
            return r0
    }

    public javassist.bytecode.CodeAttribute get() {
            r2 = this;
            r0 = r2
            javassist.bytecode.CodeAttribute r0 = r0.codeAttr
            return r0
    }

    public int getCodeLength() {
            r2 = this;
            r0 = r2
            byte[] r0 = r0.bytecode
            int r0 = r0.length
            return r0
    }

    public int byteAt(int r4) {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.bytecode
            r1 = r4
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            return r0
    }

    public int signedByteAt(int r4) {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.bytecode
            r1 = r4
            r0 = r0[r1]
            return r0
    }

    public void writeByte(int r5, int r6) {
            r4 = this;
            r0 = r4
            byte[] r0 = r0.bytecode
            r1 = r6
            r2 = r5
            byte r2 = (byte) r2
            r0[r1] = r2
            return
    }

    public int u16bitAt(int r4) {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.bytecode
            r1 = r4
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            return r0
    }

    public int s16bitAt(int r4) {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.bytecode
            r1 = r4
            int r0 = javassist.bytecode.ByteArray.readS16bit(r0, r1)
            return r0
    }

    public void write16bit(int r5, int r6) {
            r4 = this;
            r0 = r5
            r1 = r4
            byte[] r1 = r1.bytecode
            r2 = r6
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            return
    }

    public int s32bitAt(int r4) {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.bytecode
            r1 = r4
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)
            return r0
    }

    public void write32bit(int r5, int r6) {
            r4 = this;
            r0 = r5
            r1 = r4
            byte[] r1 = r1.bytecode
            r2 = r6
            javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
            return
    }

    public void write(byte[] r6, int r7) {
            r5 = this;
            r0 = r6
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L6:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L1f
            r0 = r5
            byte[] r0 = r0.bytecode
            r1 = r7
            int r7 = r7 + 1
            r2 = r6
            r3 = r9
            r2 = r2[r3]
            r0[r1] = r2
            int r9 = r9 + 1
            goto L6
        L1f:
            return
    }

    public boolean hasNext() {
            r3 = this;
            r0 = r3
            int r0 = r0.currentPos
            r1 = r3
            int r1 = r1.endPos
            if (r0 >= r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public int next() throws javassist.bytecode.BadBytecode {
            r4 = this;
            r0 = r4
            int r0 = r0.currentPos
            r5 = r0
            r0 = r4
            r1 = r4
            byte[] r1 = r1.bytecode
            r2 = r5
            int r1 = nextOpcode(r1, r2)
            r0.currentPos = r1
            r0 = r5
            return r0
    }

    public int lookAhead() {
            r2 = this;
            r0 = r2
            int r0 = r0.currentPos
            return r0
    }

    public int skipConstructor() throws javassist.bytecode.BadBytecode {
            r3 = this;
            r0 = r3
            r1 = -1
            int r0 = r0.skipSuperConstructor0(r1)
            return r0
    }

    public int skipSuperConstructor() throws javassist.bytecode.BadBytecode {
            r3 = this;
            r0 = r3
            r1 = 0
            int r0 = r0.skipSuperConstructor0(r1)
            return r0
    }

    public int skipThisConstructor() throws javassist.bytecode.BadBytecode {
            r3 = this;
            r0 = r3
            r1 = 1
            int r0 = r0.skipSuperConstructor0(r1)
            return r0
    }

    private int skipSuperConstructor0(int r5) throws javassist.bytecode.BadBytecode {
            r4 = this;
            r0 = r4
            r0.begin()
            r0 = r4
            javassist.bytecode.CodeAttribute r0 = r0.codeAttr
            javassist.bytecode.ConstPool r0 = r0.getConstPool()
            r6 = r0
            r0 = r4
            javassist.bytecode.CodeAttribute r0 = r0.codeAttr
            java.lang.String r0 = r0.getDeclaringClass()
            r7 = r0
            r0 = 0
            r8 = r0
        L17:
            r0 = r4
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L8c
            r0 = r4
            int r0 = r0.next()
            r9 = r0
            r0 = r4
            r1 = r9
            int r0 = r0.byteAt(r1)
            r10 = r0
            r0 = r10
            r1 = 187(0xbb, float:2.62E-43)
            if (r0 != r1) goto L3a
            int r8 = r8 + 1
            goto L89
        L3a:
            r0 = r10
            r1 = 183(0xb7, float:2.56E-43)
            if (r0 != r1) goto L89
            r0 = r4
            byte[] r0 = r0.bytecode
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.readU16bit(r0, r1)
            r11 = r0
            r0 = r6
            r1 = r11
            java.lang.String r0 = r0.getMethodrefName(r1)
            java.lang.String r1 = "<init>"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L89
            int r8 = r8 + (-1)
            r0 = r8
            if (r0 >= 0) goto L89
            r0 = r5
            if (r0 >= 0) goto L6c
            r0 = r9
            return r0
        L6c:
            r0 = r6
            r1 = r11
            java.lang.String r0 = r0.getMethodrefClassName(r1)
            r12 = r0
            r0 = r12
            r1 = r7
            boolean r0 = r0.equals(r1)
            r1 = r5
            if (r1 <= 0) goto L82
            r1 = 1
            goto L83
        L82:
            r1 = 0
        L83:
            if (r0 != r1) goto L8c
            r0 = r9
            return r0
        L89:
            goto L17
        L8c:
            r0 = r4
            r0.begin()
            r0 = -1
            return r0
    }

    public int insert(byte[] r6) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            r1 = r5
            int r1 = r1.currentPos
            r2 = r6
            r3 = 0
            int r0 = r0.insert0(r1, r2, r3)
            return r0
    }

    public void insert(int r6, byte[] r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            int r0 = r0.insert0(r1, r2, r3)
            return
    }

    public int insertAt(int r6, byte[] r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            int r0 = r0.insert0(r1, r2, r3)
            return r0
    }

    public int insertEx(byte[] r6) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            r1 = r5
            int r1 = r1.currentPos
            r2 = r6
            r3 = 1
            int r0 = r0.insert0(r1, r2, r3)
            return r0
    }

    public void insertEx(int r6, byte[] r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 1
            int r0 = r0.insert0(r1, r2, r3)
            return
    }

    public int insertExAt(int r6, byte[] r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 1
            int r0 = r0.insert0(r1, r2, r3)
            return r0
    }

    private int insert0(int r6, byte[] r7, boolean r8) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r7
            int r0 = r0.length
            r9 = r0
            r0 = r9
            if (r0 > 0) goto Lb
            r0 = r6
            return r0
        Lb:
            r0 = r5
            r1 = r6
            r2 = r9
            r3 = r8
            javassist.bytecode.CodeIterator$Gap r0 = r0.insertGapAt(r1, r2, r3)
            int r0 = r0.position
            r6 = r0
            r0 = r6
            r10 = r0
            r0 = 0
            r11 = r0
        L1d:
            r0 = r11
            r1 = r9
            if (r0 >= r1) goto L38
            r0 = r5
            byte[] r0 = r0.bytecode
            r1 = r10
            int r10 = r10 + 1
            r2 = r7
            r3 = r11
            r2 = r2[r3]
            r0[r1] = r2
            int r11 = r11 + 1
            goto L1d
        L38:
            r0 = r6
            return r0
    }

    public int insertGap(int r6) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            r1 = r5
            int r1 = r1.currentPos
            r2 = r6
            r3 = 0
            javassist.bytecode.CodeIterator$Gap r0 = r0.insertGapAt(r1, r2, r3)
            int r0 = r0.position
            return r0
    }

    public int insertGap(int r6, int r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            javassist.bytecode.CodeIterator$Gap r0 = r0.insertGapAt(r1, r2, r3)
            int r0 = r0.length
            return r0
    }

    public int insertExGap(int r6) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            r1 = r5
            int r1 = r1.currentPos
            r2 = r6
            r3 = 1
            javassist.bytecode.CodeIterator$Gap r0 = r0.insertGapAt(r1, r2, r3)
            int r0 = r0.position
            return r0
    }

    public int insertExGap(int r6, int r7) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 1
            javassist.bytecode.CodeIterator$Gap r0 = r0.insertGapAt(r1, r2, r3)
            int r0 = r0.length
            return r0
    }

    public javassist.bytecode.CodeIterator.Gap insertGapAt(int r10, int r11, boolean r12) throws javassist.bytecode.BadBytecode {
            r9 = this;
            javassist.bytecode.CodeIterator$Gap r0 = new javassist.bytecode.CodeIterator$Gap
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = r11
            if (r0 > 0) goto L1c
            r0 = r13
            r1 = r10
            r0.position = r1
            r0 = r13
            r1 = 0
            r0.length = r1
            r0 = r13
            return r0
        L1c:
            r0 = r9
            byte[] r0 = r0.bytecode
            int r0 = r0.length
            r1 = r11
            int r0 = r0 + r1
            r1 = 32767(0x7fff, float:4.5916E-41)
            if (r0 <= r1) goto L4f
            r0 = r9
            r1 = r9
            byte[] r1 = r1.bytecode
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r9
            javassist.bytecode.CodeAttribute r5 = r5.get()
            javassist.bytecode.ExceptionTable r5 = r5.getExceptionTable()
            r6 = r9
            javassist.bytecode.CodeAttribute r6 = r6.codeAttr
            r7 = r13
            byte[] r0 = r0.insertGapCore0w(r1, r2, r3, r4, r5, r6, r7)
            r14 = r0
            r0 = r13
            int r0 = r0.position
            r10 = r0
            r0 = r11
            r15 = r0
            goto Ld1
        L4f:
            r0 = r9
            int r0 = r0.currentPos
            r16 = r0
            r0 = r9
            byte[] r0 = r0.bytecode
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r9
            javassist.bytecode.CodeAttribute r4 = r4.get()
            javassist.bytecode.ExceptionTable r4 = r4.getExceptionTable()
            r5 = r9
            javassist.bytecode.CodeAttribute r5 = r5.codeAttr
            byte[] r0 = insertGapCore0(r0, r1, r2, r3, r4, r5)
            r14 = r0
            r0 = r14
            int r0 = r0.length
            r1 = r9
            byte[] r1 = r1.bytecode
            int r1 = r1.length
            int r0 = r0 - r1
            r15 = r0
            r0 = r13
            r1 = r10
            r0.position = r1
            r0 = r13
            r1 = r15
            r0.length = r1
            r0 = r16
            r1 = r10
            if (r0 < r1) goto L93
            r0 = r9
            r1 = r16
            r2 = r15
            int r1 = r1 + r2
            r0.currentPos = r1
        L93:
            r0 = r9
            int r0 = r0.mark
            r1 = r10
            if (r0 > r1) goto La7
            r0 = r9
            int r0 = r0.mark
            r1 = r10
            if (r0 != r1) goto Lb2
            r0 = r12
            if (r0 == 0) goto Lb2
        La7:
            r0 = r9
            r1 = r0
            int r1 = r1.mark
            r2 = r15
            int r1 = r1 + r2
            r0.mark = r1
        Lb2:
            r0 = r9
            int r0 = r0.mark2
            r1 = r10
            if (r0 > r1) goto Lc6
            r0 = r9
            int r0 = r0.mark2
            r1 = r10
            if (r0 != r1) goto Ld1
            r0 = r12
            if (r0 == 0) goto Ld1
        Lc6:
            r0 = r9
            r1 = r0
            int r1 = r1.mark2
            r2 = r15
            int r1 = r1 + r2
            r0.mark2 = r1
        Ld1:
            r0 = r9
            javassist.bytecode.CodeAttribute r0 = r0.codeAttr
            r1 = r14
            r0.setCode(r1)
            r0 = r9
            r1 = r14
            r0.bytecode = r1
            r0 = r9
            r1 = r9
            int r1 = r1.getCodeLength()
            r0.endPos = r1
            r0 = r9
            r1 = r10
            r2 = r15
            r0.updateCursors(r1, r2)
            r0 = r13
            return r0
    }

    protected void updateCursors(int r2, int r3) {
            r1 = this;
            return
    }

    public void insert(javassist.bytecode.ExceptionTable r6, int r7) {
            r5 = this;
            r0 = r5
            javassist.bytecode.CodeAttribute r0 = r0.codeAttr
            javassist.bytecode.ExceptionTable r0 = r0.getExceptionTable()
            r1 = 0
            r2 = r6
            r3 = r7
            r0.add(r1, r2, r3)
            return
    }

    public int append(byte[] r6) {
            r5 = this;
            r0 = r5
            int r0 = r0.getCodeLength()
            r7 = r0
            r0 = r6
            int r0 = r0.length
            r8 = r0
            r0 = r8
            if (r0 > 0) goto Le
            r0 = r7
            return r0
        Le:
            r0 = r5
            r1 = r8
            r0.appendGap(r1)
            r0 = r5
            byte[] r0 = r0.bytecode
            r9 = r0
            r0 = 0
            r10 = r0
        L1c:
            r0 = r10
            r1 = r8
            if (r0 >= r1) goto L33
            r0 = r9
            r1 = r10
            r2 = r7
            int r1 = r1 + r2
            r2 = r6
            r3 = r10
            r2 = r2[r3]
            r0[r1] = r2
            int r10 = r10 + 1
            goto L1c
        L33:
            r0 = r7
            return r0
    }

    public void appendGap(int r6) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.bytecode
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = r8
            r1 = r6
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            r9 = r0
            r0 = 0
            r10 = r0
        L12:
            r0 = r10
            r1 = r8
            if (r0 >= r1) goto L27
            r0 = r9
            r1 = r10
            r2 = r7
            r3 = r10
            r2 = r2[r3]
            r0[r1] = r2
            int r10 = r10 + 1
            goto L12
        L27:
            r0 = r8
            r10 = r0
        L2a:
            r0 = r10
            r1 = r8
            r2 = r6
            int r1 = r1 + r2
            if (r0 >= r1) goto L3e
            r0 = r9
            r1 = r10
            r2 = 0
            r0[r1] = r2
            int r10 = r10 + 1
            goto L2a
        L3e:
            r0 = r5
            javassist.bytecode.CodeAttribute r0 = r0.codeAttr
            r1 = r9
            r0.setCode(r1)
            r0 = r5
            r1 = r9
            r0.bytecode = r1
            r0 = r5
            r1 = r5
            int r1 = r1.getCodeLength()
            r0.endPos = r1
            return
    }

    public void append(javassist.bytecode.ExceptionTable r6, int r7) {
            r5 = this;
            r0 = r5
            javassist.bytecode.CodeAttribute r0 = r0.codeAttr
            javassist.bytecode.ExceptionTable r0 = r0.getExceptionTable()
            r8 = r0
            r0 = r8
            r1 = r8
            int r1 = r1.size()
            r2 = r6
            r3 = r7
            r0.add(r1, r2, r3)
            return
    }

    static int nextOpcode(byte[] r4, int r5) throws javassist.bytecode.BadBytecode {
            r0 = r4
            r1 = r5
            r0 = r0[r1]     // Catch: java.lang.IndexOutOfBoundsException -> Lb
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r6 = r0
            goto L16
        Lb:
            r7 = move-exception
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.String r2 = "invalid opcode address"
            r1.<init>(r2)
            throw r0
        L16:
            int[] r0 = javassist.bytecode.CodeIterator.opcodeLength     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            r1 = r6
            r0 = r0[r1]     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            r7 = r0
            r0 = r7
            if (r0 <= 0) goto L24
            r0 = r5
            r1 = r7
            int r0 = r0 + r1
            return r0
        L24:
            r0 = r6
            r1 = 196(0xc4, float:2.75E-43)
            if (r0 != r1) goto L3e
            r0 = r4
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            r1 = -124(0xffffffffffffff84, float:NaN)
            if (r0 != r1) goto L3a
            r0 = r5
            r1 = 6
            int r0 = r0 + r1
            return r0
        L3a:
            r0 = r5
            r1 = 4
            int r0 = r0 + r1
            return r0
        L3e:
            r0 = r5
            r1 = -4
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 + r1
            r8 = r0
            r0 = r6
            r1 = 171(0xab, float:2.4E-43)
            if (r0 != r1) goto L61
            r0 = r4
            r1 = r8
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            r9 = r0
            r0 = r8
            r1 = r9
            r2 = 8
            int r1 = r1 * r2
            int r0 = r0 + r1
            r1 = 4
            int r0 = r0 + r1
            return r0
        L61:
            r0 = r6
            r1 = 170(0xaa, float:2.38E-43)
            if (r0 != r1) goto L8a
            r0 = r4
            r1 = r8
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            r9 = r0
            r0 = r4
            r1 = r8
            r2 = 4
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L8d
            r10 = r0
            r0 = r8
            r1 = r10
            r2 = r9
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 + r2
            r2 = 4
            int r1 = r1 * r2
            int r0 = r0 + r1
            r1 = 8
            int r0 = r0 + r1
            return r0
        L8a:
            goto L8e
        L8d:
            r7 = move-exception
        L8e:
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
    }

    static byte[] insertGapCore0(byte[] r7, int r8, int r9, boolean r10, javassist.bytecode.ExceptionTable r11, javassist.bytecode.CodeAttribute r12) throws javassist.bytecode.BadBytecode {
            r0 = r9
            if (r0 > 0) goto L6
            r0 = r7
            return r0
        L6:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            byte[] r0 = insertGapCore1(r0, r1, r2, r3, r4, r5)     // Catch: javassist.bytecode.CodeIterator.AlignmentException -> L12
            return r0
        L12:
            r13 = move-exception
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = 3
            int r2 = r2 + r3
            r3 = -4
            r2 = r2 & r3
            r3 = r10
            r4 = r11
            r5 = r12
            byte[] r0 = insertGapCore1(r0, r1, r2, r3, r4, r5)     // Catch: javassist.bytecode.CodeIterator.AlignmentException -> L25
            return r0
        L25:
            r14 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "fatal error?"
            r1.<init>(r2)
            throw r0
    }

    private static byte[] insertGapCore1(byte[] r7, int r8, int r9, boolean r10, javassist.bytecode.ExceptionTable r11, javassist.bytecode.CodeAttribute r12) throws javassist.bytecode.BadBytecode, javassist.bytecode.CodeIterator.AlignmentException {
            r0 = r7
            int r0 = r0.length
            r13 = r0
            r0 = r13
            r1 = r9
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            r14 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r13
            r4 = r14
            r5 = r10
            insertGap2(r0, r1, r2, r3, r4, r5)
            r0 = r11
            r1 = r8
            r2 = r9
            r3 = r10
            r0.shiftPc(r1, r2, r3)
            r0 = r12
            java.lang.String r1 = "LineNumberTable"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.LineNumberAttribute r0 = (javassist.bytecode.LineNumberAttribute) r0
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L38
            r0 = r15
            r1 = r8
            r2 = r9
            r3 = r10
            r0.shiftPc(r1, r2, r3)
        L38:
            r0 = r12
            java.lang.String r1 = "LocalVariableTable"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.LocalVariableAttribute r0 = (javassist.bytecode.LocalVariableAttribute) r0
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L51
            r0 = r16
            r1 = r8
            r2 = r9
            r3 = r10
            r0.shiftPc(r1, r2, r3)
        L51:
            r0 = r12
            java.lang.String r1 = "LocalVariableTypeTable"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.LocalVariableAttribute r0 = (javassist.bytecode.LocalVariableAttribute) r0
            r17 = r0
            r0 = r17
            if (r0 == 0) goto L6a
            r0 = r17
            r1 = r8
            r2 = r9
            r3 = r10
            r0.shiftPc(r1, r2, r3)
        L6a:
            r0 = r12
            java.lang.String r1 = "StackMapTable"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.StackMapTable r0 = (javassist.bytecode.StackMapTable) r0
            r18 = r0
            r0 = r18
            if (r0 == 0) goto L83
            r0 = r18
            r1 = r8
            r2 = r9
            r3 = r10
            r0.shiftPc(r1, r2, r3)
        L83:
            r0 = r12
            java.lang.String r1 = "StackMap"
            javassist.bytecode.AttributeInfo r0 = r0.getAttribute(r1)
            javassist.bytecode.StackMap r0 = (javassist.bytecode.StackMap) r0
            r19 = r0
            r0 = r19
            if (r0 == 0) goto L9c
            r0 = r19
            r1 = r8
            r2 = r9
            r3 = r10
            r0.shiftPc(r1, r2, r3)
        L9c:
            r0 = r14
            return r0
    }

    private static void insertGap2(byte[] r6, int r7, int r8, int r9, byte[] r10, boolean r11) throws javassist.bytecode.BadBytecode, javassist.bytecode.CodeIterator.AlignmentException {
            r0 = 0
            r13 = r0
            r0 = 0
            r14 = r0
        L6:
            r0 = r13
            r1 = r9
            if (r0 >= r1) goto L26d
            r0 = r13
            r1 = r7
            if (r0 != r1) goto L2b
            r0 = r14
            r1 = r8
            int r0 = r0 + r1
            r15 = r0
        L18:
            r0 = r14
            r1 = r15
            if (r0 >= r1) goto L2b
            r0 = r10
            r1 = r14
            int r14 = r14 + 1
            r2 = 0
            r0[r1] = r2
            goto L18
        L2b:
            r0 = r6
            r1 = r13
            int r0 = nextOpcode(r0, r1)
            r12 = r0
            r0 = r6
            r1 = r13
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r15 = r0
            r0 = 153(0x99, float:2.14E-43)
            r1 = r15
            if (r0 > r1) goto L4d
            r0 = r15
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 <= r1) goto L5d
        L4d:
            r0 = r15
            r1 = 198(0xc6, float:2.77E-43)
            if (r0 == r1) goto L5d
            r0 = r15
            r1 = 199(0xc7, float:2.79E-43)
            if (r0 != r1) goto L9a
        L5d:
            r0 = r6
            r1 = r13
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 8
            int r0 = r0 << r1
            r1 = r6
            r2 = r13
            r3 = 2
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            r16 = r0
            r0 = r13
            r1 = r16
            r2 = r7
            r3 = r8
            r4 = r11
            int r0 = newOffset(r0, r1, r2, r3, r4)
            r16 = r0
            r0 = r10
            r1 = r14
            r2 = r6
            r3 = r13
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r16
            r1 = r10
            r2 = r14
            r3 = 1
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write16bit(r0, r1, r2)
            int r14 = r14 + 3
            goto L266
        L9a:
            r0 = r15
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto Laa
            r0 = r15
            r1 = 201(0xc9, float:2.82E-43)
            if (r0 != r1) goto Ldc
        Laa:
            r0 = r6
            r1 = r13
            r2 = 1
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)
            r16 = r0
            r0 = r13
            r1 = r16
            r2 = r7
            r3 = r8
            r4 = r11
            int r0 = newOffset(r0, r1, r2, r3, r4)
            r16 = r0
            r0 = r10
            r1 = r14
            int r14 = r14 + 1
            r2 = r6
            r3 = r13
            r2 = r2[r3]
            r0[r1] = r2
            r0 = r16
            r1 = r10
            r2 = r14
            javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
            int r14 = r14 + 4
            goto L266
        Ldc:
            r0 = r15
            r1 = 170(0xaa, float:2.38E-43)
            if (r0 != r1) goto L19b
            r0 = r13
            r1 = r14
            if (r0 == r1) goto Lf9
            r0 = r8
            r1 = 3
            r0 = r0 & r1
            if (r0 == 0) goto Lf9
            javassist.bytecode.CodeIterator$AlignmentException r0 = new javassist.bytecode.CodeIterator$AlignmentException
            r1 = r0
            r1.<init>()
            throw r0
        Lf9:
            r0 = r13
            r1 = -4
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 + r1
            r16 = r0
            r0 = r10
            r1 = r14
            r2 = r6
            r3 = r13
            r4 = r16
            int r0 = copyGapBytes(r0, r1, r2, r3, r4)
            r14 = r0
            r0 = r13
            r1 = r6
            r2 = r16
            int r1 = javassist.bytecode.ByteArray.read32bit(r1, r2)
            r2 = r7
            r3 = r8
            r4 = r11
            int r0 = newOffset(r0, r1, r2, r3, r4)
            r17 = r0
            r0 = r17
            r1 = r10
            r2 = r14
            javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
            r0 = r6
            r1 = r16
            r2 = 4
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)
            r18 = r0
            r0 = r18
            r1 = r10
            r2 = r14
            r3 = 4
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
            r0 = r6
            r1 = r16
            r2 = 8
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)
            r19 = r0
            r0 = r19
            r1 = r10
            r2 = r14
            r3 = 8
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
            int r14 = r14 + 12
            r0 = r16
            r1 = 12
            int r0 = r0 + r1
            r20 = r0
            r0 = r20
            r1 = r19
            r2 = r18
            int r1 = r1 - r2
            r2 = 1
            int r1 = r1 + r2
            r2 = 4
            int r1 = r1 * r2
            int r0 = r0 + r1
            r16 = r0
        L16e:
            r0 = r20
            r1 = r16
            if (r0 >= r1) goto L198
            r0 = r13
            r1 = r6
            r2 = r20
            int r1 = javassist.bytecode.ByteArray.read32bit(r1, r2)
            r2 = r7
            r3 = r8
            r4 = r11
            int r0 = newOffset(r0, r1, r2, r3, r4)
            r21 = r0
            r0 = r21
            r1 = r10
            r2 = r14
            javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
            int r14 = r14 + 4
            int r20 = r20 + 4
            goto L16e
        L198:
            goto L266
        L19b:
            r0 = r15
            r1 = 171(0xab, float:2.4E-43)
            if (r0 != r1) goto L24d
            r0 = r13
            r1 = r14
            if (r0 == r1) goto L1b8
            r0 = r8
            r1 = 3
            r0 = r0 & r1
            if (r0 == 0) goto L1b8
            javassist.bytecode.CodeIterator$AlignmentException r0 = new javassist.bytecode.CodeIterator$AlignmentException
            r1 = r0
            r1.<init>()
            throw r0
        L1b8:
            r0 = r13
            r1 = -4
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 + r1
            r16 = r0
            r0 = r10
            r1 = r14
            r2 = r6
            r3 = r13
            r4 = r16
            int r0 = copyGapBytes(r0, r1, r2, r3, r4)
            r14 = r0
            r0 = r13
            r1 = r6
            r2 = r16
            int r1 = javassist.bytecode.ByteArray.read32bit(r1, r2)
            r2 = r7
            r3 = r8
            r4 = r11
            int r0 = newOffset(r0, r1, r2, r3, r4)
            r17 = r0
            r0 = r17
            r1 = r10
            r2 = r14
            javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
            r0 = r6
            r1 = r16
            r2 = 4
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)
            r18 = r0
            r0 = r18
            r1 = r10
            r2 = r14
            r3 = 4
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
            int r14 = r14 + 8
            r0 = r16
            r1 = 8
            int r0 = r0 + r1
            r19 = r0
            r0 = r19
            r1 = r18
            r2 = 8
            int r1 = r1 * r2
            int r0 = r0 + r1
            r16 = r0
        L212:
            r0 = r19
            r1 = r16
            if (r0 >= r1) goto L24a
            r0 = r6
            r1 = r19
            r2 = r10
            r3 = r14
            javassist.bytecode.ByteArray.copy32bit(r0, r1, r2, r3)
            r0 = r13
            r1 = r6
            r2 = r19
            r3 = 4
            int r2 = r2 + r3
            int r1 = javassist.bytecode.ByteArray.read32bit(r1, r2)
            r2 = r7
            r3 = r8
            r4 = r11
            int r0 = newOffset(r0, r1, r2, r3, r4)
            r20 = r0
            r0 = r20
            r1 = r10
            r2 = r14
            r3 = 4
            int r2 = r2 + r3
            javassist.bytecode.ByteArray.write32bit(r0, r1, r2)
            int r14 = r14 + 8
            int r19 = r19 + 8
            goto L212
        L24a:
            goto L266
        L24d:
            r0 = r13
            r1 = r12
            if (r0 >= r1) goto L266
            r0 = r10
            r1 = r14
            int r14 = r14 + 1
            r2 = r6
            r3 = r13
            int r13 = r13 + 1
            r2 = r2[r3]
            r0[r1] = r2
            goto L24d
        L266:
            r0 = r12
            r13 = r0
            goto L6
        L26d:
            return
    }

    private static int copyGapBytes(byte[] r5, int r6, byte[] r7, int r8, int r9) {
            r0 = r9
            r1 = r8
            int r0 = r0 - r1
            switch(r0) {
                case 1: goto L48;
                case 2: goto L3c;
                case 3: goto L30;
                case 4: goto L24;
                default: goto L54;
            }
        L24:
            r0 = r5
            r1 = r6
            int r6 = r6 + 1
            r2 = r7
            r3 = r8
            int r8 = r8 + 1
            r2 = r2[r3]
            r0[r1] = r2
        L30:
            r0 = r5
            r1 = r6
            int r6 = r6 + 1
            r2 = r7
            r3 = r8
            int r8 = r8 + 1
            r2 = r2[r3]
            r0[r1] = r2
        L3c:
            r0 = r5
            r1 = r6
            int r6 = r6 + 1
            r2 = r7
            r3 = r8
            int r8 = r8 + 1
            r2 = r2[r3]
            r0[r1] = r2
        L48:
            r0 = r5
            r1 = r6
            int r6 = r6 + 1
            r2 = r7
            r3 = r8
            int r8 = r8 + 1
            r2 = r2[r3]
            r0[r1] = r2
        L54:
            r0 = r6
            return r0
    }

    private static int newOffset(int r3, int r4, int r5, int r6, boolean r7) {
            r0 = r3
            r1 = r4
            int r0 = r0 + r1
            r8 = r0
            r0 = r3
            r1 = r5
            if (r0 >= r1) goto L22
            r0 = r5
            r1 = r8
            if (r0 < r1) goto L1b
            r0 = r7
            if (r0 == 0) goto L49
            r0 = r5
            r1 = r8
            if (r0 != r1) goto L49
        L1b:
            r0 = r4
            r1 = r6
            int r0 = r0 + r1
            r4 = r0
            goto L49
        L22:
            r0 = r3
            r1 = r5
            if (r0 != r1) goto L34
            r0 = r8
            r1 = r5
            if (r0 >= r1) goto L49
            r0 = r4
            r1 = r6
            int r0 = r0 - r1
            r4 = r0
            goto L49
        L34:
            r0 = r8
            r1 = r5
            if (r0 < r1) goto L45
            r0 = r7
            if (r0 != 0) goto L49
            r0 = r5
            r1 = r8
            if (r0 != r1) goto L49
        L45:
            r0 = r4
            r1 = r6
            int r0 = r0 - r1
            r4 = r0
        L49:
            r0 = r4
            return r0
    }

    static byte[] changeLdcToLdcW(byte[] r9, javassist.bytecode.ExceptionTable r10, javassist.bytecode.CodeAttribute r11, javassist.bytecode.CodeAttribute.LdcEntry r12) throws javassist.bytecode.BadBytecode {
            javassist.bytecode.CodeIterator$Pointers r0 = new javassist.bytecode.CodeIterator$Pointers
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r13 = r0
            r0 = r9
            r1 = r9
            int r1 = r1.length
            r2 = r13
            java.util.List r0 = makeJumpList(r0, r1, r2)
            r14 = r0
        L19:
            r0 = r12
            if (r0 == 0) goto L2b
            r0 = r12
            r1 = r14
            addLdcW(r0, r1)
            r0 = r12
            javassist.bytecode.CodeAttribute$LdcEntry r0 = r0.next
            r12 = r0
            goto L19
        L2b:
            r0 = r9
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r14
            r5 = r13
            byte[] r0 = insertGap2w(r0, r1, r2, r3, r4, r5)
            r15 = r0
            r0 = r15
            return r0
    }

    private static void addLdcW(javassist.bytecode.CodeAttribute.LdcEntry r5, java.util.List<javassist.bytecode.CodeIterator.Branch> r6) {
            r0 = r5
            int r0 = r0.where
            r7 = r0
            javassist.bytecode.CodeIterator$LdcW r0 = new javassist.bytecode.CodeIterator$LdcW
            r1 = r0
            r2 = r7
            r3 = r5
            int r3 = r3.index
            r1.<init>(r2, r3)
            r8 = r0
            r0 = r6
            int r0 = r0.size()
            r9 = r0
            r0 = 0
            r10 = r0
        L1d:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L46
            r0 = r7
            r1 = r6
            r2 = r10
            java.lang.Object r1 = r1.get(r2)
            javassist.bytecode.CodeIterator$Branch r1 = (javassist.bytecode.CodeIterator.Branch) r1
            int r1 = r1.orgPos
            if (r0 >= r1) goto L40
            r0 = r6
            r1 = r10
            r2 = r8
            r0.add(r1, r2)
            return
        L40:
            int r10 = r10 + 1
            goto L1d
        L46:
            r0 = r6
            r1 = r8
            boolean r0 = r0.add(r1)
            return
    }

    private byte[] insertGapCore0w(byte[] r10, int r11, int r12, boolean r13, javassist.bytecode.ExceptionTable r14, javassist.bytecode.CodeAttribute r15, javassist.bytecode.CodeIterator.Gap r16) throws javassist.bytecode.BadBytecode {
            r9 = this;
            r0 = r12
            if (r0 > 0) goto L6
            r0 = r10
            return r0
        L6:
            javassist.bytecode.CodeIterator$Pointers r0 = new javassist.bytecode.CodeIterator$Pointers
            r1 = r0
            r2 = r9
            int r2 = r2.currentPos
            r3 = r9
            int r3 = r3.mark
            r4 = r9
            int r4 = r4.mark2
            r5 = r11
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r17 = r0
            r0 = r10
            r1 = r10
            int r1 = r1.length
            r2 = r17
            java.util.List r0 = makeJumpList(r0, r1, r2)
            r18 = r0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r18
            r5 = r17
            byte[] r0 = insertGap2w(r0, r1, r2, r3, r4, r5)
            r19 = r0
            r0 = r9
            r1 = r17
            int r1 = r1.cursor
            r0.currentPos = r1
            r0 = r9
            r1 = r17
            int r1 = r1.mark
            r0.mark = r1
            r0 = r9
            r1 = r17
            int r1 = r1.mark2
            r0.mark2 = r1
            r0 = r17
            int r0 = r0.mark0
            r20 = r0
            r0 = r20
            r1 = r9
            int r1 = r1.currentPos
            if (r0 != r1) goto L72
            r0 = r13
            if (r0 != 0) goto L72
            r0 = r9
            r1 = r0
            int r1 = r1.currentPos
            r2 = r12
            int r1 = r1 + r2
            r0.currentPos = r1
        L72:
            r0 = r13
            if (r0 == 0) goto L7d
            r0 = r20
            r1 = r12
            int r0 = r0 - r1
            r20 = r0
        L7d:
            r0 = r16
            r1 = r20
            r0.position = r1
            r0 = r16
            r1 = r12
            r0.length = r1
            r0 = r19
            return r0
    }

    private static byte[] insertGap2w(byte[] r5, int r6, int r7, boolean r8, java.util.List<javassist.bytecode.CodeIterator.Branch> r9, javassist.bytecode.CodeIterator.Pointers r10) throws javassist.bytecode.BadBytecode {
            r0 = r7
            if (r0 <= 0) goto L36
            r0 = r10
            r1 = r6
            r2 = r7
            r3 = r8
            r0.shiftPc(r1, r2, r3)
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r11 = r0
        L15:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L36
            r0 = r11
            java.lang.Object r0 = r0.next()
            javassist.bytecode.CodeIterator$Branch r0 = (javassist.bytecode.CodeIterator.Branch) r0
            r12 = r0
            r0 = r12
            r1 = r6
            r2 = r7
            r3 = r8
            r0.shift(r1, r2, r3)
            goto L15
        L36:
            r0 = 1
            r11 = r0
        L39:
            r0 = r11
            if (r0 == 0) goto Lb5
            r0 = 0
            r11 = r0
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
        L4a:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lb2
            r0 = r12
            java.lang.Object r0 = r0.next()
            javassist.bytecode.CodeIterator$Branch r0 = (javassist.bytecode.CodeIterator.Branch) r0
            r13 = r0
            r0 = r13
            boolean r0 = r0.expanded()
            if (r0 == 0) goto Laf
            r0 = 1
            r11 = r0
            r0 = r13
            int r0 = r0.pos
            r14 = r0
            r0 = r13
            int r0 = r0.deltaSize()
            r15 = r0
            r0 = r10
            r1 = r14
            r2 = r15
            r3 = 0
            r0.shiftPc(r1, r2, r3)
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
        L8c:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Laf
            r0 = r16
            java.lang.Object r0 = r0.next()
            javassist.bytecode.CodeIterator$Branch r0 = (javassist.bytecode.CodeIterator.Branch) r0
            r17 = r0
            r0 = r17
            r1 = r14
            r2 = r15
            r3 = 0
            r0.shift(r1, r2, r3)
            goto L8c
        Laf:
            goto L4a
        Lb2:
            goto L39
        Lb5:
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
        Lbe:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L123
            r0 = r12
            java.lang.Object r0 = r0.next()
            javassist.bytecode.CodeIterator$Branch r0 = (javassist.bytecode.CodeIterator.Branch) r0
            r13 = r0
            r0 = r13
            int r0 = r0.gapChanged()
            r14 = r0
            r0 = r14
            if (r0 <= 0) goto L120
            r0 = 1
            r11 = r0
            r0 = r13
            int r0 = r0.pos
            r15 = r0
            r0 = r10
            r1 = r15
            r2 = r14
            r3 = 0
            r0.shiftPc(r1, r2, r3)
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r16 = r0
        Lfd:
            r0 = r16
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L120
            r0 = r16
            java.lang.Object r0 = r0.next()
            javassist.bytecode.CodeIterator$Branch r0 = (javassist.bytecode.CodeIterator.Branch) r0
            r17 = r0
            r0 = r17
            r1 = r15
            r2 = r14
            r3 = 0
            r0.shift(r1, r2, r3)
            goto Lfd
        L120:
            goto Lbe
        L123:
            r0 = r11
            if (r0 != 0) goto L39
            r0 = r5
            r1 = r9
            r2 = r6
            r3 = r7
            byte[] r0 = makeExapndedCode(r0, r1, r2, r3)
            return r0
    }

    private static java.util.List<javassist.bytecode.CodeIterator.Branch> makeJumpList(byte[] r10, int r11, javassist.bytecode.CodeIterator.Pointers r12) throws javassist.bytecode.BadBytecode {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = 0
            r15 = r0
        Lb:
            r0 = r15
            r1 = r11
            if (r0 >= r1) goto L1be
            r0 = r10
            r1 = r15
            int r0 = nextOpcode(r0, r1)
            r14 = r0
            r0 = r10
            r1 = r15
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r16 = r0
            r0 = 153(0x99, float:2.14E-43)
            r1 = r16
            if (r0 > r1) goto L33
            r0 = r16
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 <= r1) goto L43
        L33:
            r0 = r16
            r1 = 198(0xc6, float:2.77E-43)
            if (r0 == r1) goto L43
            r0 = r16
            r1 = 199(0xc7, float:2.79E-43)
            if (r0 != r1) goto L92
        L43:
            r0 = r10
            r1 = r15
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 8
            int r0 = r0 << r1
            r1 = r10
            r2 = r15
            r3 = 2
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            r17 = r0
            r0 = r16
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 == r1) goto L69
            r0 = r16
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 != r1) goto L79
        L69:
            javassist.bytecode.CodeIterator$Jump16 r0 = new javassist.bytecode.CodeIterator$Jump16
            r1 = r0
            r2 = r15
            r3 = r17
            r1.<init>(r2, r3)
            r18 = r0
            goto L86
        L79:
            javassist.bytecode.CodeIterator$If16 r0 = new javassist.bytecode.CodeIterator$If16
            r1 = r0
            r2 = r15
            r3 = r17
            r1.<init>(r2, r3)
            r18 = r0
        L86:
            r0 = r13
            r1 = r18
            boolean r0 = r0.add(r1)
            goto L1b7
        L92:
            r0 = r16
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto La2
            r0 = r16
            r1 = 201(0xc9, float:2.82E-43)
            if (r0 != r1) goto Lc1
        La2:
            r0 = r10
            r1 = r15
            r2 = 1
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)
            r17 = r0
            r0 = r13
            javassist.bytecode.CodeIterator$Jump32 r1 = new javassist.bytecode.CodeIterator$Jump32
            r2 = r1
            r3 = r15
            r4 = r17
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
            goto L1b7
        Lc1:
            r0 = r16
            r1 = 170(0xaa, float:2.38E-43)
            if (r0 != r1) goto L13f
            r0 = r15
            r1 = -4
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 + r1
            r17 = r0
            r0 = r10
            r1 = r17
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)
            r18 = r0
            r0 = r10
            r1 = r17
            r2 = 4
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)
            r19 = r0
            r0 = r10
            r1 = r17
            r2 = 8
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)
            r20 = r0
            r0 = r17
            r1 = 12
            int r0 = r0 + r1
            r21 = r0
            r0 = r20
            r1 = r19
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            r22 = r0
            r0 = r22
            int[] r0 = new int[r0]
            r23 = r0
            r0 = 0
            r24 = r0
        L108:
            r0 = r24
            r1 = r22
            if (r0 >= r1) goto L123
            r0 = r23
            r1 = r24
            r2 = r10
            r3 = r21
            int r2 = javassist.bytecode.ByteArray.read32bit(r2, r3)
            r0[r1] = r2
            int r21 = r21 + 4
            int r24 = r24 + 1
            goto L108
        L123:
            r0 = r13
            javassist.bytecode.CodeIterator$Table r1 = new javassist.bytecode.CodeIterator$Table
            r2 = r1
            r3 = r15
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r23
            r8 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            boolean r0 = r0.add(r1)
            goto L1b7
        L13f:
            r0 = r16
            r1 = 171(0xab, float:2.4E-43)
            if (r0 != r1) goto L1b7
            r0 = r15
            r1 = -4
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 + r1
            r17 = r0
            r0 = r10
            r1 = r17
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)
            r18 = r0
            r0 = r10
            r1 = r17
            r2 = 4
            int r1 = r1 + r2
            int r0 = javassist.bytecode.ByteArray.read32bit(r0, r1)
            r19 = r0
            r0 = r17
            r1 = 8
            int r0 = r0 + r1
            r20 = r0
            r0 = r19
            int[] r0 = new int[r0]
            r21 = r0
            r0 = r19
            int[] r0 = new int[r0]
            r22 = r0
            r0 = 0
            r23 = r0
        L178:
            r0 = r23
            r1 = r19
            if (r0 >= r1) goto L1a0
            r0 = r21
            r1 = r23
            r2 = r10
            r3 = r20
            int r2 = javassist.bytecode.ByteArray.read32bit(r2, r3)
            r0[r1] = r2
            r0 = r22
            r1 = r23
            r2 = r10
            r3 = r20
            r4 = 4
            int r3 = r3 + r4
            int r2 = javassist.bytecode.ByteArray.read32bit(r2, r3)
            r0[r1] = r2
            int r20 = r20 + 8
            int r23 = r23 + 1
            goto L178
        L1a0:
            r0 = r13
            javassist.bytecode.CodeIterator$Lookup r1 = new javassist.bytecode.CodeIterator$Lookup
            r2 = r1
            r3 = r15
            r4 = r18
            r5 = r21
            r6 = r22
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            boolean r0 = r0.add(r1)
        L1b7:
            r0 = r14
            r15 = r0
            goto Lb
        L1be:
            r0 = r13
            return r0
    }

    private static byte[] makeExapndedCode(byte[] r6, java.util.List<javassist.bytecode.CodeIterator.Branch> r7, int r8, int r9) throws javassist.bytecode.BadBytecode {
            r0 = r7
            int r0 = r0.size()
            r10 = r0
            r0 = r6
            int r0 = r0.length
            r1 = r9
            int r0 = r0 + r1
            r11 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
        L16:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L39
            r0 = r12
            java.lang.Object r0 = r0.next()
            javassist.bytecode.CodeIterator$Branch r0 = (javassist.bytecode.CodeIterator.Branch) r0
            r13 = r0
            r0 = r11
            r1 = r13
            int r1 = r1.deltaSize()
            int r0 = r0 + r1
            r11 = r0
            goto L16
        L39:
            r0 = r11
            byte[] r0 = new byte[r0]
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r6
            int r0 = r0.length
            r16 = r0
            r0 = 0
            r1 = r10
            if (r0 >= r1) goto L68
            r0 = r7
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.CodeIterator$Branch r0 = (javassist.bytecode.CodeIterator.Branch) r0
            r17 = r0
            r0 = r17
            int r0 = r0.orgPos
            r18 = r0
            goto L6f
        L68:
            r0 = 0
            r17 = r0
            r0 = r16
            r18 = r0
        L6f:
            r0 = r13
            r1 = r16
            if (r0 >= r1) goto Lfb
            r0 = r13
            r1 = r8
            if (r0 != r1) goto L95
            r0 = r14
            r1 = r9
            int r0 = r0 + r1
            r19 = r0
        L82:
            r0 = r14
            r1 = r19
            if (r0 >= r1) goto L95
            r0 = r12
            r1 = r14
            int r14 = r14 + 1
            r2 = 0
            r0[r1] = r2
            goto L82
        L95:
            r0 = r13
            r1 = r18
            if (r0 == r1) goto Lae
            r0 = r12
            r1 = r14
            int r14 = r14 + 1
            r2 = r6
            r3 = r13
            int r13 = r13 + 1
            r2 = r2[r3]
            r0[r1] = r2
            goto L6f
        Lae:
            r0 = r17
            r1 = r13
            r2 = r6
            r3 = r14
            r4 = r12
            int r0 = r0.write(r1, r2, r3, r4)
            r19 = r0
            r0 = r13
            r1 = r19
            int r0 = r0 + r1
            r13 = r0
            r0 = r14
            r1 = r19
            r2 = r17
            int r2 = r2.deltaSize()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r14 = r0
            int r15 = r15 + 1
            r0 = r15
            r1 = r10
            if (r0 >= r1) goto Lf1
            r0 = r7
            r1 = r15
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.CodeIterator$Branch r0 = (javassist.bytecode.CodeIterator.Branch) r0
            r17 = r0
            r0 = r17
            int r0 = r0.orgPos
            r18 = r0
            goto Lf8
        Lf1:
            r0 = 0
            r17 = r0
            r0 = r16
            r18 = r0
        Lf8:
            goto L6f
        Lfb:
            r0 = r12
            return r0
    }

    static {
            r0 = 202(0xca, float:2.83E-43)
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
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 25
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 26
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 27
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 28
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 29
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 30
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 31
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 32
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 33
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 34
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 35
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 36
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 37
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 38
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 39
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 40
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 41
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 42
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 43
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 44
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 45
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 46
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 47
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 48
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 49
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 50
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 51
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 52
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 53
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 54
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 55
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 56
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 57
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 58
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 59
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 60
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 61
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 62
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 63
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 64
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 65
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 66
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 67
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 68
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 69
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 70
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 71
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 72
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 73
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 74
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 75
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 76
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 77
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 78
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 79
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 80
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 81
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 82
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 83
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 84
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 85
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 86
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 87
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 88
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 89
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 90
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 91
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 92
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 93
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 94
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 95
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 96
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 97
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 98
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 99
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 100
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 101(0x65, float:1.42E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 102(0x66, float:1.43E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 103(0x67, float:1.44E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 104(0x68, float:1.46E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 105(0x69, float:1.47E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 106(0x6a, float:1.49E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 107(0x6b, float:1.5E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 108(0x6c, float:1.51E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 109(0x6d, float:1.53E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 110(0x6e, float:1.54E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 111(0x6f, float:1.56E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 112(0x70, float:1.57E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 113(0x71, float:1.58E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 114(0x72, float:1.6E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 115(0x73, float:1.61E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 116(0x74, float:1.63E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 117(0x75, float:1.64E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 118(0x76, float:1.65E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 119(0x77, float:1.67E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 120(0x78, float:1.68E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 121(0x79, float:1.7E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 122(0x7a, float:1.71E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 123(0x7b, float:1.72E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 124(0x7c, float:1.74E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 125(0x7d, float:1.75E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 126(0x7e, float:1.77E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 127(0x7f, float:1.78E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 128(0x80, float:1.8E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 129(0x81, float:1.81E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 130(0x82, float:1.82E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 131(0x83, float:1.84E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 132(0x84, float:1.85E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 133(0x85, float:1.86E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 134(0x86, float:1.88E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 135(0x87, float:1.89E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 136(0x88, float:1.9E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 137(0x89, float:1.92E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 138(0x8a, float:1.93E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 139(0x8b, float:1.95E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 140(0x8c, float:1.96E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 141(0x8d, float:1.98E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 142(0x8e, float:1.99E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 143(0x8f, float:2.0E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 144(0x90, float:2.02E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 145(0x91, float:2.03E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 146(0x92, float:2.05E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 147(0x93, float:2.06E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 148(0x94, float:2.07E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 149(0x95, float:2.09E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 150(0x96, float:2.1E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 151(0x97, float:2.12E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 152(0x98, float:2.13E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 153(0x99, float:2.14E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 154(0x9a, float:2.16E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 155(0x9b, float:2.17E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 156(0x9c, float:2.19E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 157(0x9d, float:2.2E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 158(0x9e, float:2.21E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 159(0x9f, float:2.23E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 160(0xa0, float:2.24E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 162(0xa2, float:2.27E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 163(0xa3, float:2.28E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 164(0xa4, float:2.3E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 165(0xa5, float:2.31E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 166(0xa6, float:2.33E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 167(0xa7, float:2.34E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 168(0xa8, float:2.35E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 169(0xa9, float:2.37E-43)
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 170(0xaa, float:2.38E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 171(0xab, float:2.4E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 172(0xac, float:2.41E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 173(0xad, float:2.42E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 174(0xae, float:2.44E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 175(0xaf, float:2.45E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 176(0xb0, float:2.47E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 177(0xb1, float:2.48E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 178(0xb2, float:2.5E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 179(0xb3, float:2.51E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 180(0xb4, float:2.52E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 181(0xb5, float:2.54E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 182(0xb6, float:2.55E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 183(0xb7, float:2.56E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 184(0xb8, float:2.58E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 185(0xb9, float:2.59E-43)
            r3 = 5
            r1[r2] = r3
            r1 = r0
            r2 = 186(0xba, float:2.6E-43)
            r3 = 5
            r1[r2] = r3
            r1 = r0
            r2 = 187(0xbb, float:2.62E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 188(0xbc, float:2.63E-43)
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 189(0xbd, float:2.65E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 190(0xbe, float:2.66E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 191(0xbf, float:2.68E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 192(0xc0, float:2.69E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 193(0xc1, float:2.7E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 194(0xc2, float:2.72E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 195(0xc3, float:2.73E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 196(0xc4, float:2.75E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 197(0xc5, float:2.76E-43)
            r3 = 4
            r1[r2] = r3
            r1 = r0
            r2 = 198(0xc6, float:2.77E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 199(0xc7, float:2.79E-43)
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 5
            r1[r2] = r3
            r1 = r0
            r2 = 201(0xc9, float:2.82E-43)
            r3 = 5
            r1[r2] = r3
            javassist.bytecode.CodeIterator.opcodeLength = r0
            return
    }
}
