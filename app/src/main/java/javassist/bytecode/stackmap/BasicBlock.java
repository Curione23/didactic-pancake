package javassist.bytecode.stackmap;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/BasicBlock.class */
public class BasicBlock {
    protected int position;
    protected int length;
    protected int incoming;
    protected javassist.bytecode.stackmap.BasicBlock[] exit;
    protected boolean stop;
    protected javassist.bytecode.stackmap.BasicBlock.Catch toCatch;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/BasicBlock$Catch.class */
    public static class Catch {
        public javassist.bytecode.stackmap.BasicBlock.Catch next;
        public javassist.bytecode.stackmap.BasicBlock body;
        public int typeIndex;

        Catch(javassist.bytecode.stackmap.BasicBlock r4, int r5, javassist.bytecode.stackmap.BasicBlock.Catch r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.body = r1
                r0 = r3
                r1 = r5
                r0.typeIndex = r1
                r0 = r3
                r1 = r6
                r0.next = r1
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/BasicBlock$JsrBytecode.class */
    static class JsrBytecode extends javassist.bytecode.BadBytecode {
        private static final long serialVersionUID = 1;

        JsrBytecode() {
                r3 = this;
                r0 = r3
                java.lang.String r1 = "JSR"
                r0.<init>(r1)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/BasicBlock$Maker.class */
    public static class Maker {
        public Maker() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        protected javassist.bytecode.stackmap.BasicBlock makeBlock(int r5) {
                r4 = this;
                javassist.bytecode.stackmap.BasicBlock r0 = new javassist.bytecode.stackmap.BasicBlock
                r1 = r0
                r2 = r5
                r1.<init>(r2)
                return r0
        }

        protected javassist.bytecode.stackmap.BasicBlock[] makeArray(int r3) {
                r2 = this;
                r0 = r3
                javassist.bytecode.stackmap.BasicBlock[] r0 = new javassist.bytecode.stackmap.BasicBlock[r0]
                return r0
        }

        private javassist.bytecode.stackmap.BasicBlock[] makeArray(javassist.bytecode.stackmap.BasicBlock r5) {
                r4 = this;
                r0 = r4
                r1 = 1
                javassist.bytecode.stackmap.BasicBlock[] r0 = r0.makeArray(r1)
                r6 = r0
                r0 = r6
                r1 = 0
                r2 = r5
                r0[r1] = r2
                r0 = r6
                return r0
        }

        private javassist.bytecode.stackmap.BasicBlock[] makeArray(javassist.bytecode.stackmap.BasicBlock r5, javassist.bytecode.stackmap.BasicBlock r6) {
                r4 = this;
                r0 = r4
                r1 = 2
                javassist.bytecode.stackmap.BasicBlock[] r0 = r0.makeArray(r1)
                r7 = r0
                r0 = r7
                r1 = 0
                r2 = r5
                r0[r1] = r2
                r0 = r7
                r1 = 1
                r2 = r6
                r0[r1] = r2
                r0 = r7
                return r0
        }

        public javassist.bytecode.stackmap.BasicBlock[] make(javassist.bytecode.MethodInfo r7) throws javassist.bytecode.BadBytecode {
                r6 = this;
                r0 = r7
                javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
                r8 = r0
                r0 = r8
                if (r0 != 0) goto Lb
                r0 = 0
                return r0
            Lb:
                r0 = r8
                javassist.bytecode.CodeIterator r0 = r0.iterator()
                r9 = r0
                r0 = r6
                r1 = r9
                r2 = 0
                r3 = r9
                int r3 = r3.getCodeLength()
                r4 = r8
                javassist.bytecode.ExceptionTable r4 = r4.getExceptionTable()
                javassist.bytecode.stackmap.BasicBlock[] r0 = r0.make(r1, r2, r3, r4)
                return r0
        }

        public javassist.bytecode.stackmap.BasicBlock[] make(javassist.bytecode.CodeIterator r7, int r8, int r9, javassist.bytecode.ExceptionTable r10) throws javassist.bytecode.BadBytecode {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                java.util.Map r0 = r0.makeMarks(r1, r2, r3, r4)
                r11 = r0
                r0 = r6
                r1 = r11
                javassist.bytecode.stackmap.BasicBlock[] r0 = r0.makeBlocks(r1)
                r12 = r0
                r0 = r6
                r1 = r12
                r2 = r10
                r0.addCatchers(r1, r2)
                r0 = r12
                return r0
        }

        private javassist.bytecode.stackmap.BasicBlock.Mark makeMark(java.util.Map<java.lang.Integer, javassist.bytecode.stackmap.BasicBlock.Mark> r7, int r8) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = 1
                r4 = 1
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = r0.makeMark0(r1, r2, r3, r4)
                return r0
        }

        private javassist.bytecode.stackmap.BasicBlock.Mark makeMark(java.util.Map<java.lang.Integer, javassist.bytecode.stackmap.BasicBlock.Mark> r7, int r8, javassist.bytecode.stackmap.BasicBlock[] r9, int r10, boolean r11) {
                r6 = this;
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = 0
                r4 = 0
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = r0.makeMark0(r1, r2, r3, r4)
                r12 = r0
                r0 = r12
                r1 = r9
                r2 = r10
                r3 = r11
                r0.setJump(r1, r2, r3)
                r0 = r12
                return r0
        }

        private javassist.bytecode.stackmap.BasicBlock.Mark makeMark0(java.util.Map<java.lang.Integer, javassist.bytecode.stackmap.BasicBlock.Mark> r5, int r6, boolean r7, boolean r8) {
                r4 = this;
                r0 = r6
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r9 = r0
                r0 = r5
                r1 = r9
                java.lang.Object r0 = r0.get(r1)
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = (javassist.bytecode.stackmap.BasicBlock.Mark) r0
                r10 = r0
                r0 = r10
                if (r0 != 0) goto L2d
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = new javassist.bytecode.stackmap.BasicBlock$Mark
                r1 = r0
                r2 = r6
                r1.<init>(r2)
                r10 = r0
                r0 = r5
                r1 = r9
                r2 = r10
                java.lang.Object r0 = r0.put(r1, r2)
            L2d:
                r0 = r7
                if (r0 == 0) goto L56
                r0 = r10
                javassist.bytecode.stackmap.BasicBlock r0 = r0.block
                if (r0 != 0) goto L43
                r0 = r10
                r1 = r4
                r2 = r6
                javassist.bytecode.stackmap.BasicBlock r1 = r1.makeBlock(r2)
                r0.block = r1
            L43:
                r0 = r8
                if (r0 == 0) goto L56
                r0 = r10
                javassist.bytecode.stackmap.BasicBlock r0 = r0.block
                r1 = r0
                int r1 = r1.incoming
                r2 = 1
                int r1 = r1 + r2
                r0.incoming = r1
            L56:
                r0 = r10
                return r0
        }

        private java.util.Map<java.lang.Integer, javassist.bytecode.stackmap.BasicBlock.Mark> makeMarks(javassist.bytecode.CodeIterator r9, int r10, int r11, javassist.bytecode.ExceptionTable r12) throws javassist.bytecode.BadBytecode {
                r8 = this;
                r0 = r9
                r0.begin()
                r0 = r9
                r1 = r10
                r0.move(r1)
                java.util.HashMap r0 = new java.util.HashMap
                r1 = r0
                r1.<init>()
                r13 = r0
            L12:
                r0 = r9
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L2a5
                r0 = r9
                int r0 = r0.next()
                r14 = r0
                r0 = r14
                r1 = r11
                if (r0 < r1) goto L28
                goto L2a5
            L28:
                r0 = r9
                r1 = r14
                int r0 = r0.byteAt(r1)
                r15 = r0
                r0 = 153(0x99, float:2.14E-43)
                r1 = r15
                if (r0 > r1) goto L40
                r0 = r15
                r1 = 166(0xa6, float:2.33E-43)
                if (r0 <= r1) goto L50
            L40:
                r0 = r15
                r1 = 198(0xc6, float:2.77E-43)
                if (r0 == r1) goto L50
                r0 = r15
                r1 = 199(0xc7, float:2.79E-43)
                if (r0 != r1) goto L8b
            L50:
                r0 = r8
                r1 = r13
                r2 = r14
                r3 = r9
                r4 = r14
                r5 = 1
                int r4 = r4 + r5
                int r3 = r3.s16bitAt(r4)
                int r2 = r2 + r3
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = r0.makeMark(r1, r2)
                r16 = r0
                r0 = r8
                r1 = r13
                r2 = r14
                r3 = 3
                int r2 = r2 + r3
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = r0.makeMark(r1, r2)
                r17 = r0
                r0 = r8
                r1 = r13
                r2 = r14
                r3 = r8
                r4 = r16
                javassist.bytecode.stackmap.BasicBlock r4 = r4.block
                r5 = r17
                javassist.bytecode.stackmap.BasicBlock r5 = r5.block
                javassist.bytecode.stackmap.BasicBlock[] r3 = r3.makeArray(r4, r5)
                r4 = 3
                r5 = 0
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = r0.makeMark(r1, r2, r3, r4, r5)
                goto L2a2
            L8b:
                r0 = 167(0xa7, float:2.34E-43)
                r1 = r15
                if (r0 > r1) goto L21b
                r0 = r15
                r1 = 171(0xab, float:2.4E-43)
                if (r0 > r1) goto L21b
                r0 = r15
                switch(r0) {
                    case 167: goto Lc0;
                    case 168: goto Ld7;
                    case 169: goto Lee;
                    case 170: goto Lfd;
                    case 171: goto L192;
                    default: goto L218;
                }
            Lc0:
                r0 = r8
                r1 = r13
                r2 = r14
                r3 = r14
                r4 = r9
                r5 = r14
                r6 = 1
                int r5 = r5 + r6
                int r4 = r4.s16bitAt(r5)
                int r3 = r3 + r4
                r4 = 3
                r0.makeGoto(r1, r2, r3, r4)
                goto L218
            Ld7:
                r0 = r8
                r1 = r13
                r2 = r14
                r3 = r14
                r4 = r9
                r5 = r14
                r6 = 1
                int r5 = r5 + r6
                int r4 = r4.s16bitAt(r5)
                int r3 = r3 + r4
                r4 = 3
                r0.makeJsr(r1, r2, r3, r4)
                goto L218
            Lee:
                r0 = r8
                r1 = r13
                r2 = r14
                r3 = 0
                r4 = 2
                r5 = 1
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = r0.makeMark(r1, r2, r3, r4, r5)
                goto L218
            Lfd:
                r0 = r14
                r1 = -4
                r0 = r0 & r1
                r1 = 4
                int r0 = r0 + r1
                r16 = r0
                r0 = r9
                r1 = r16
                r2 = 4
                int r1 = r1 + r2
                int r0 = r0.s32bitAt(r1)
                r17 = r0
                r0 = r9
                r1 = r16
                r2 = 8
                int r1 = r1 + r2
                int r0 = r0.s32bitAt(r1)
                r18 = r0
                r0 = r18
                r1 = r17
                int r0 = r0 - r1
                r1 = 1
                int r0 = r0 + r1
                r19 = r0
                r0 = r8
                r1 = r19
                r2 = 1
                int r1 = r1 + r2
                javassist.bytecode.stackmap.BasicBlock[] r0 = r0.makeArray(r1)
                r20 = r0
                r0 = r20
                r1 = 0
                r2 = r8
                r3 = r13
                r4 = r14
                r5 = r9
                r6 = r16
                int r5 = r5.s32bitAt(r6)
                int r4 = r4 + r5
                javassist.bytecode.stackmap.BasicBlock$Mark r2 = r2.makeMark(r3, r4)
                javassist.bytecode.stackmap.BasicBlock r2 = r2.block
                r0[r1] = r2
                r0 = r16
                r1 = 12
                int r0 = r0 + r1
                r21 = r0
                r0 = r21
                r1 = r19
                r2 = 4
                int r1 = r1 * r2
                int r0 = r0 + r1
                r22 = r0
                r0 = 1
                r23 = r0
            L157:
                r0 = r21
                r1 = r22
                if (r0 >= r1) goto L17e
                r0 = r20
                r1 = r23
                int r23 = r23 + 1
                r2 = r8
                r3 = r13
                r4 = r14
                r5 = r9
                r6 = r21
                int r5 = r5.s32bitAt(r6)
                int r4 = r4 + r5
                javassist.bytecode.stackmap.BasicBlock$Mark r2 = r2.makeMark(r3, r4)
                javassist.bytecode.stackmap.BasicBlock r2 = r2.block
                r0[r1] = r2
                int r21 = r21 + 4
                goto L157
            L17e:
                r0 = r8
                r1 = r13
                r2 = r14
                r3 = r20
                r4 = r22
                r5 = r14
                int r4 = r4 - r5
                r5 = 1
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = r0.makeMark(r1, r2, r3, r4, r5)
                goto L218
            L192:
                r0 = r14
                r1 = -4
                r0 = r0 & r1
                r1 = 4
                int r0 = r0 + r1
                r16 = r0
                r0 = r9
                r1 = r16
                r2 = 4
                int r1 = r1 + r2
                int r0 = r0.s32bitAt(r1)
                r17 = r0
                r0 = r8
                r1 = r17
                r2 = 1
                int r1 = r1 + r2
                javassist.bytecode.stackmap.BasicBlock[] r0 = r0.makeArray(r1)
                r18 = r0
                r0 = r18
                r1 = 0
                r2 = r8
                r3 = r13
                r4 = r14
                r5 = r9
                r6 = r16
                int r5 = r5.s32bitAt(r6)
                int r4 = r4 + r5
                javassist.bytecode.stackmap.BasicBlock$Mark r2 = r2.makeMark(r3, r4)
                javassist.bytecode.stackmap.BasicBlock r2 = r2.block
                r0[r1] = r2
                r0 = r16
                r1 = 8
                int r0 = r0 + r1
                r1 = 4
                int r0 = r0 + r1
                r19 = r0
                r0 = r19
                r1 = r17
                r2 = 8
                int r1 = r1 * r2
                int r0 = r0 + r1
                r1 = 4
                int r0 = r0 - r1
                r20 = r0
                r0 = 1
                r21 = r0
            L1dd:
                r0 = r19
                r1 = r20
                if (r0 >= r1) goto L204
                r0 = r18
                r1 = r21
                int r21 = r21 + 1
                r2 = r8
                r3 = r13
                r4 = r14
                r5 = r9
                r6 = r19
                int r5 = r5.s32bitAt(r6)
                int r4 = r4 + r5
                javassist.bytecode.stackmap.BasicBlock$Mark r2 = r2.makeMark(r3, r4)
                javassist.bytecode.stackmap.BasicBlock r2 = r2.block
                r0[r1] = r2
                int r19 = r19 + 8
                goto L1dd
            L204:
                r0 = r8
                r1 = r13
                r2 = r14
                r3 = r18
                r4 = r20
                r5 = r14
                int r4 = r4 - r5
                r5 = 1
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = r0.makeMark(r1, r2, r3, r4, r5)
                goto L218
            L218:
                goto L2a2
            L21b:
                r0 = 172(0xac, float:2.41E-43)
                r1 = r15
                if (r0 > r1) goto L22b
                r0 = r15
                r1 = 177(0xb1, float:2.48E-43)
                if (r0 <= r1) goto L233
            L22b:
                r0 = r15
                r1 = 191(0xbf, float:2.68E-43)
                if (r0 != r1) goto L242
            L233:
                r0 = r8
                r1 = r13
                r2 = r14
                r3 = 0
                r4 = 1
                r5 = 1
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = r0.makeMark(r1, r2, r3, r4, r5)
                goto L2a2
            L242:
                r0 = r15
                r1 = 200(0xc8, float:2.8E-43)
                if (r0 != r1) goto L261
                r0 = r8
                r1 = r13
                r2 = r14
                r3 = r14
                r4 = r9
                r5 = r14
                r6 = 1
                int r5 = r5 + r6
                int r4 = r4.s32bitAt(r5)
                int r3 = r3 + r4
                r4 = 5
                r0.makeGoto(r1, r2, r3, r4)
                goto L2a2
            L261:
                r0 = r15
                r1 = 201(0xc9, float:2.82E-43)
                if (r0 != r1) goto L280
                r0 = r8
                r1 = r13
                r2 = r14
                r3 = r14
                r4 = r9
                r5 = r14
                r6 = 1
                int r5 = r5 + r6
                int r4 = r4.s32bitAt(r5)
                int r3 = r3 + r4
                r4 = 5
                r0.makeJsr(r1, r2, r3, r4)
                goto L2a2
            L280:
                r0 = r15
                r1 = 196(0xc4, float:2.75E-43)
                if (r0 != r1) goto L2a2
                r0 = r9
                r1 = r14
                r2 = 1
                int r1 = r1 + r2
                int r0 = r0.byteAt(r1)
                r1 = 169(0xa9, float:2.37E-43)
                if (r0 != r1) goto L2a2
                r0 = r8
                r1 = r13
                r2 = r14
                r3 = 0
                r4 = 4
                r5 = 1
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = r0.makeMark(r1, r2, r3, r4, r5)
            L2a2:
                goto L12
            L2a5:
                r0 = r12
                if (r0 == 0) goto L2da
                r0 = r12
                int r0 = r0.size()
                r14 = r0
            L2b1:
                int r14 = r14 + (-1)
                r0 = r14
                if (r0 < 0) goto L2da
                r0 = r8
                r1 = r13
                r2 = r12
                r3 = r14
                int r2 = r2.startPc(r3)
                r3 = 1
                r4 = 0
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = r0.makeMark0(r1, r2, r3, r4)
                r0 = r8
                r1 = r13
                r2 = r12
                r3 = r14
                int r2 = r2.handlerPc(r3)
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = r0.makeMark(r1, r2)
                goto L2b1
            L2da:
                r0 = r13
                return r0
        }

        private void makeGoto(java.util.Map<java.lang.Integer, javassist.bytecode.stackmap.BasicBlock.Mark> r8, int r9, int r10, int r11) {
                r7 = this;
                r0 = r7
                r1 = r8
                r2 = r10
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = r0.makeMark(r1, r2)
                r12 = r0
                r0 = r7
                r1 = r12
                javassist.bytecode.stackmap.BasicBlock r1 = r1.block
                javassist.bytecode.stackmap.BasicBlock[] r0 = r0.makeArray(r1)
                r13 = r0
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r13
                r4 = r11
                r5 = 1
                javassist.bytecode.stackmap.BasicBlock$Mark r0 = r0.makeMark(r1, r2, r3, r4, r5)
                return
        }

        protected void makeJsr(java.util.Map<java.lang.Integer, javassist.bytecode.stackmap.BasicBlock.Mark> r4, int r5, int r6, int r7) throws javassist.bytecode.BadBytecode {
                r3 = this;
                javassist.bytecode.stackmap.BasicBlock$JsrBytecode r0 = new javassist.bytecode.stackmap.BasicBlock$JsrBytecode
                r1 = r0
                r1.<init>()
                throw r0
        }

        private javassist.bytecode.stackmap.BasicBlock[] makeBlocks(java.util.Map<java.lang.Integer, javassist.bytecode.stackmap.BasicBlock.Mark> r5) {
                r4 = this;
                r0 = r5
                java.util.Collection r0 = r0.values()
                r1 = r5
                int r1 = r1.size()
                javassist.bytecode.stackmap.BasicBlock$Mark[] r1 = new javassist.bytecode.stackmap.BasicBlock.Mark[r1]
                java.lang.Object[] r0 = r0.toArray(r1)
                javassist.bytecode.stackmap.BasicBlock$Mark[] r0 = (javassist.bytecode.stackmap.BasicBlock.Mark[]) r0
                r6 = r0
                r0 = r6
                java.util.Arrays.sort(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r7 = r0
                r0 = 0
                r8 = r0
                r0 = r6
                int r0 = r0.length
                if (r0 <= 0) goto L4d
                r0 = r6
                r1 = 0
                r0 = r0[r1]
                int r0 = r0.position
                if (r0 != 0) goto L4d
                r0 = r6
                r1 = 0
                r0 = r0[r1]
                javassist.bytecode.stackmap.BasicBlock r0 = r0.block
                if (r0 == 0) goto L4d
                r0 = r6
                r1 = r8
                int r8 = r8 + 1
                r0 = r0[r1]
                javassist.bytecode.stackmap.BasicBlock r0 = getBBlock(r0)
                r9 = r0
                goto L54
            L4d:
                r0 = r4
                r1 = 0
                javassist.bytecode.stackmap.BasicBlock r0 = r0.makeBlock(r1)
                r9 = r0
            L54:
                r0 = r7
                r1 = r9
                boolean r0 = r0.add(r1)
            L5d:
                r0 = r8
                r1 = r6
                int r1 = r1.length
                if (r0 >= r1) goto L157
                r0 = r6
                r1 = r8
                int r8 = r8 + 1
                r0 = r0[r1]
                r10 = r0
                r0 = r10
                javassist.bytecode.stackmap.BasicBlock r0 = getBBlock(r0)
                r11 = r0
                r0 = r11
                if (r0 != 0) goto Lc8
                r0 = r9
                int r0 = r0.length
                if (r0 <= 0) goto L9b
                r0 = r4
                r1 = r9
                int r1 = r1.position
                r2 = r9
                int r2 = r2.length
                int r1 = r1 + r2
                javassist.bytecode.stackmap.BasicBlock r0 = r0.makeBlock(r1)
                r9 = r0
                r0 = r7
                r1 = r9
                boolean r0 = r0.add(r1)
            L9b:
                r0 = r9
                r1 = r10
                int r1 = r1.position
                r2 = r10
                int r2 = r2.size
                int r1 = r1 + r2
                r2 = r9
                int r2 = r2.position
                int r1 = r1 - r2
                r0.length = r1
                r0 = r9
                r1 = r10
                javassist.bytecode.stackmap.BasicBlock[] r1 = r1.jump
                r0.exit = r1
                r0 = r9
                r1 = r10
                boolean r1 = r1.alwaysJmp
                r0.stop = r1
                goto L154
            Lc8:
                r0 = r9
                int r0 = r0.length
                if (r0 != 0) goto Lf9
                r0 = r9
                r1 = r10
                int r1 = r1.position
                r2 = r9
                int r2 = r2.position
                int r1 = r1 - r2
                r0.length = r1
                r0 = r11
                r1 = r0
                int r1 = r1.incoming
                r2 = 1
                int r1 = r1 + r2
                r0.incoming = r1
                r0 = r9
                r1 = r4
                r2 = r11
                javassist.bytecode.stackmap.BasicBlock[] r1 = r1.makeArray(r2)
                r0.exit = r1
                goto L147
            Lf9:
                r0 = r9
                int r0 = r0.position
                r1 = r9
                int r1 = r1.length
                int r0 = r0 + r1
                r1 = r10
                int r1 = r1.position
                if (r0 >= r1) goto L147
                r0 = r4
                r1 = r9
                int r1 = r1.position
                r2 = r9
                int r2 = r2.length
                int r1 = r1 + r2
                javassist.bytecode.stackmap.BasicBlock r0 = r0.makeBlock(r1)
                r9 = r0
                r0 = r7
                r1 = r9
                boolean r0 = r0.add(r1)
                r0 = r9
                r1 = r10
                int r1 = r1.position
                r2 = r9
                int r2 = r2.position
                int r1 = r1 - r2
                r0.length = r1
                r0 = r9
                r1 = 1
                r0.stop = r1
                r0 = r9
                r1 = r4
                r2 = r11
                javassist.bytecode.stackmap.BasicBlock[] r1 = r1.makeArray(r2)
                r0.exit = r1
            L147:
                r0 = r7
                r1 = r11
                boolean r0 = r0.add(r1)
                r0 = r11
                r9 = r0
            L154:
                goto L5d
            L157:
                r0 = r7
                r1 = r4
                r2 = r7
                int r2 = r2.size()
                javassist.bytecode.stackmap.BasicBlock[] r1 = r1.makeArray(r2)
                java.lang.Object[] r0 = r0.toArray(r1)
                javassist.bytecode.stackmap.BasicBlock[] r0 = (javassist.bytecode.stackmap.BasicBlock[]) r0
                return r0
        }

        private static javassist.bytecode.stackmap.BasicBlock getBBlock(javassist.bytecode.stackmap.BasicBlock.Mark r3) {
                r0 = r3
                javassist.bytecode.stackmap.BasicBlock r0 = r0.block
                r4 = r0
                r0 = r4
                if (r0 == 0) goto L28
                r0 = r3
                int r0 = r0.size
                if (r0 <= 0) goto L28
                r0 = r4
                r1 = r3
                javassist.bytecode.stackmap.BasicBlock[] r1 = r1.jump
                r0.exit = r1
                r0 = r4
                r1 = r3
                int r1 = r1.size
                r0.length = r1
                r0 = r4
                r1 = r3
                boolean r1 = r1.alwaysJmp
                r0.stop = r1
            L28:
                r0 = r4
                return r0
        }

        private void addCatchers(javassist.bytecode.stackmap.BasicBlock[] r8, javassist.bytecode.ExceptionTable r9) throws javassist.bytecode.BadBytecode {
                r7 = this;
                r0 = r9
                if (r0 != 0) goto L5
                return
            L5:
                r0 = r9
                int r0 = r0.size()
                r10 = r0
            La:
                int r10 = r10 + (-1)
                r0 = r10
                if (r0 < 0) goto L8a
                r0 = r8
                r1 = r9
                r2 = r10
                int r1 = r1.handlerPc(r2)
                javassist.bytecode.stackmap.BasicBlock r0 = javassist.bytecode.stackmap.BasicBlock.find(r0, r1)
                r11 = r0
                r0 = r9
                r1 = r10
                int r0 = r0.startPc(r1)
                r12 = r0
                r0 = r9
                r1 = r10
                int r0 = r0.endPc(r1)
                r13 = r0
                r0 = r9
                r1 = r10
                int r0 = r0.catchType(r1)
                r14 = r0
                r0 = r11
                r1 = r0
                int r1 = r1.incoming
                r2 = 1
                int r1 = r1 - r2
                r0.incoming = r1
                r0 = 0
                r15 = r0
            L3f:
                r0 = r15
                r1 = r8
                int r1 = r1.length
                if (r0 >= r1) goto L87
                r0 = r8
                r1 = r15
                r0 = r0[r1]
                r16 = r0
                r0 = r16
                int r0 = r0.position
                r17 = r0
                r0 = r12
                r1 = r17
                if (r0 > r1) goto L81
                r0 = r17
                r1 = r13
                if (r0 >= r1) goto L81
                r0 = r16
                javassist.bytecode.stackmap.BasicBlock$Catch r1 = new javassist.bytecode.stackmap.BasicBlock$Catch
                r2 = r1
                r3 = r11
                r4 = r14
                r5 = r16
                javassist.bytecode.stackmap.BasicBlock$Catch r5 = r5.toCatch
                r2.<init>(r3, r4, r5)
                r0.toCatch = r1
                r0 = r11
                r1 = r0
                int r1 = r1.incoming
                r2 = 1
                int r1 = r1 + r2
                r0.incoming = r1
            L81:
                int r15 = r15 + 1
                goto L3f
            L87:
                goto La
            L8a:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/stackmap/BasicBlock$Mark.class */
    static class Mark implements java.lang.Comparable<javassist.bytecode.stackmap.BasicBlock.Mark> {
        int position;
        javassist.bytecode.stackmap.BasicBlock block;
        javassist.bytecode.stackmap.BasicBlock[] jump;
        boolean alwaysJmp;
        int size;
        javassist.bytecode.stackmap.BasicBlock.Catch catcher;

        Mark(int r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.position = r1
                r0 = r3
                r1 = 0
                r0.block = r1
                r0 = r3
                r1 = 0
                r0.jump = r1
                r0 = r3
                r1 = 0
                r0.alwaysJmp = r1
                r0 = r3
                r1 = 0
                r0.size = r1
                r0 = r3
                r1 = 0
                r0.catcher = r1
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(javassist.bytecode.stackmap.BasicBlock.Mark r4) {
                r3 = this;
                r0 = 0
                r1 = r4
                if (r0 != r1) goto L7
                r0 = -1
                return r0
            L7:
                r0 = r3
                int r0 = r0.position
                r1 = r4
                int r1 = r1.position
                int r0 = r0 - r1
                return r0
        }

        void setJump(javassist.bytecode.stackmap.BasicBlock[] r4, int r5, boolean r6) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.jump = r1
                r0 = r3
                r1 = r5
                r0.size = r1
                r0 = r3
                r1 = r6
                r0.alwaysJmp = r1
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(javassist.bytecode.stackmap.BasicBlock.Mark r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                javassist.bytecode.stackmap.BasicBlock$Mark r1 = (javassist.bytecode.stackmap.BasicBlock.Mark) r1
                int r0 = r0.compareTo2(r1)
                return r0
        }
    }

    protected BasicBlock(int r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.position = r1
            r0 = r3
            r1 = 0
            r0.length = r1
            r0 = r3
            r1 = 0
            r0.incoming = r1
            return
    }

    public static javassist.bytecode.stackmap.BasicBlock find(javassist.bytecode.stackmap.BasicBlock[] r5, int r6) throws javassist.bytecode.BadBytecode {
            r0 = r5
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L8:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L35
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            int r0 = r0.position
            r1 = r6
            if (r0 > r1) goto L2f
            r0 = r6
            r1 = r10
            int r1 = r1.position
            r2 = r10
            int r2 = r2.length
            int r1 = r1 + r2
            if (r0 >= r1) goto L2f
            r0 = r10
            return r0
        L2f:
            int r9 = r9 + 1
            goto L8
        L35:
            javassist.bytecode.BadBytecode r0 = new javassist.bytecode.BadBytecode
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "no basic block at "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r5
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r7 = r0
            r0 = r7
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            r8 = r0
            r0 = r6
            r1 = r8
            if (r1 >= 0) goto L20
            r1 = r7
            goto L27
        L20:
            r1 = r7
            r2 = r8
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r1 = r1.substring(r2)
        L27:
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r6
            r0.toString2(r1)
            r0 = r6
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
    }

    protected void toString2(java.lang.StringBuilder r4) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "pos="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.position
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", len="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", in="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.incoming
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", exit{"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            javassist.bytecode.stackmap.BasicBlock[] r0 = r0.exit
            if (r0 == 0) goto L5e
            r0 = r3
            javassist.bytecode.stackmap.BasicBlock[] r0 = r0.exit
            r5 = r0
            r0 = r5
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r7 = r0
        L3d:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L5e
            r0 = r5
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r4
            r1 = r8
            int r1 = r1.position
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 44
            java.lang.StringBuilder r0 = r0.append(r1)
            int r7 = r7 + 1
            goto L3d
        L5e:
            r0 = r4
            java.lang.String r1 = "}, {"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r3
            javassist.bytecode.stackmap.BasicBlock$Catch r0 = r0.toCatch
            r5 = r0
        L6a:
            r0 = r5
            if (r0 == 0) goto L98
            r0 = r4
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            javassist.bytecode.stackmap.BasicBlock r1 = r1.body
            int r1 = r1.position
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            int r1 = r1.typeIndex
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "), "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            javassist.bytecode.stackmap.BasicBlock$Catch r0 = r0.next
            r5 = r0
            goto L6a
        L98:
            r0 = r4
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }
}
