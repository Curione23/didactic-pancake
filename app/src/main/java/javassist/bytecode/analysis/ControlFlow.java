package javassist.bytecode.analysis;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/ControlFlow.class */
public class ControlFlow {
    private javassist.CtClass clazz;
    private javassist.bytecode.MethodInfo methodInfo;
    private javassist.bytecode.analysis.ControlFlow.Block[] basicBlocks;
    private javassist.bytecode.analysis.Frame[] frames;




    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/ControlFlow$Access.class */
    static abstract class Access {
        javassist.bytecode.analysis.ControlFlow.Node[] all;

        Access(javassist.bytecode.analysis.ControlFlow.Node[] r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.all = r1
                return
        }

        javassist.bytecode.analysis.ControlFlow.Node node(javassist.bytecode.stackmap.BasicBlock r4) {
                r3 = this;
                r0 = r3
                javassist.bytecode.analysis.ControlFlow$Node[] r0 = r0.all
                r1 = r4
                javassist.bytecode.analysis.ControlFlow$Block r1 = (javassist.bytecode.analysis.ControlFlow.Block) r1
                int r1 = r1.index
                r0 = r0[r1]
                return r0
        }

        abstract javassist.bytecode.stackmap.BasicBlock[] exits(javassist.bytecode.analysis.ControlFlow.Node r1);

        abstract javassist.bytecode.stackmap.BasicBlock[] entrances(javassist.bytecode.analysis.ControlFlow.Node r1);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/ControlFlow$Block.class */
    public static class Block extends javassist.bytecode.stackmap.BasicBlock {
        public java.lang.Object clientData;
        int index;
        javassist.bytecode.MethodInfo method;
        javassist.bytecode.analysis.ControlFlow.Block[] entrances;

        Block(int r4, javassist.bytecode.MethodInfo r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
                r0 = r3
                r1 = 0
                r0.clientData = r1
                r0 = r3
                r1 = r5
                r0.method = r1
                return
        }

        @Override // javassist.bytecode.stackmap.BasicBlock
        protected void toString2(java.lang.StringBuilder r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                super.toString2(r1)
                r0 = r5
                java.lang.String r1 = ", incoming{"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = 0
                r6 = r0
            Le:
                r0 = r6
                r1 = r4
                javassist.bytecode.analysis.ControlFlow$Block[] r1 = r1.entrances
                int r1 = r1.length
                if (r0 >= r1) goto L30
                r0 = r5
                r1 = r4
                javassist.bytecode.analysis.ControlFlow$Block[] r1 = r1.entrances
                r2 = r6
                r1 = r1[r2]
                int r1 = r1.position
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
                int r6 = r6 + 1
                goto Le
            L30:
                r0 = r5
                r1 = 125(0x7d, float:1.75E-43)
                java.lang.StringBuilder r0 = r0.append(r1)
                return
        }

        javassist.bytecode.stackmap.BasicBlock[] getExit() {
                r2 = this;
                r0 = r2
                javassist.bytecode.stackmap.BasicBlock[] r0 = r0.exit
                return r0
        }

        public int index() {
                r2 = this;
                r0 = r2
                int r0 = r0.index
                return r0
        }

        public int position() {
                r2 = this;
                r0 = r2
                int r0 = r0.position
                return r0
        }

        public int length() {
                r2 = this;
                r0 = r2
                int r0 = r0.length
                return r0
        }

        public int incomings() {
                r2 = this;
                r0 = r2
                int r0 = r0.incoming
                return r0
        }

        public javassist.bytecode.analysis.ControlFlow.Block incoming(int r4) {
                r3 = this;
                r0 = r3
                javassist.bytecode.analysis.ControlFlow$Block[] r0 = r0.entrances
                r1 = r4
                r0 = r0[r1]
                return r0
        }

        public int exits() {
                r2 = this;
                r0 = r2
                javassist.bytecode.stackmap.BasicBlock[] r0 = r0.exit
                if (r0 != 0) goto Lb
                r0 = 0
                goto L10
            Lb:
                r0 = r2
                javassist.bytecode.stackmap.BasicBlock[] r0 = r0.exit
                int r0 = r0.length
            L10:
                return r0
        }

        public javassist.bytecode.analysis.ControlFlow.Block exit(int r4) {
                r3 = this;
                r0 = r3
                javassist.bytecode.stackmap.BasicBlock[] r0 = r0.exit
                r1 = r4
                r0 = r0[r1]
                javassist.bytecode.analysis.ControlFlow$Block r0 = (javassist.bytecode.analysis.ControlFlow.Block) r0
                return r0
        }

        public javassist.bytecode.analysis.ControlFlow.Catcher[] catchers() {
                r5 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r6 = r0
                r0 = r5
                javassist.bytecode.stackmap.BasicBlock$Catch r0 = r0.toCatch
                r7 = r0
            Ld:
                r0 = r7
                if (r0 == 0) goto L28
                r0 = r6
                javassist.bytecode.analysis.ControlFlow$Catcher r1 = new javassist.bytecode.analysis.ControlFlow$Catcher
                r2 = r1
                r3 = r7
                r2.<init>(r3)
                boolean r0 = r0.add(r1)
                r0 = r7
                javassist.bytecode.stackmap.BasicBlock$Catch r0 = r0.next
                r7 = r0
                goto Ld
            L28:
                r0 = r6
                r1 = r6
                int r1 = r1.size()
                javassist.bytecode.analysis.ControlFlow$Catcher[] r1 = new javassist.bytecode.analysis.ControlFlow.Catcher[r1]
                java.lang.Object[] r0 = r0.toArray(r1)
                javassist.bytecode.analysis.ControlFlow$Catcher[] r0 = (javassist.bytecode.analysis.ControlFlow.Catcher[]) r0
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/ControlFlow$Catcher.class */
    public static class Catcher {
        private javassist.bytecode.analysis.ControlFlow.Block node;
        private int typeIndex;

        Catcher(javassist.bytecode.stackmap.BasicBlock.Catch r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                javassist.bytecode.stackmap.BasicBlock r1 = r1.body
                javassist.bytecode.analysis.ControlFlow$Block r1 = (javassist.bytecode.analysis.ControlFlow.Block) r1
                r0.node = r1
                r0 = r3
                r1 = r4
                int r1 = r1.typeIndex
                r0.typeIndex = r1
                return
        }

        public javassist.bytecode.analysis.ControlFlow.Block block() {
                r2 = this;
                r0 = r2
                javassist.bytecode.analysis.ControlFlow$Block r0 = r0.node
                return r0
        }

        public java.lang.String type() {
                r3 = this;
                r0 = r3
                int r0 = r0.typeIndex
                if (r0 != 0) goto La
                java.lang.String r0 = "java.lang.Throwable"
                return r0
            La:
                r0 = r3
                javassist.bytecode.analysis.ControlFlow$Block r0 = r0.node
                javassist.bytecode.MethodInfo r0 = r0.method
                javassist.bytecode.ConstPool r0 = r0.getConstPool()
                r1 = r3
                int r1 = r1.typeIndex
                java.lang.String r0 = r0.getClassInfo(r1)
                return r0
        }

        static /* synthetic */ javassist.bytecode.analysis.ControlFlow.Block access$100(javassist.bytecode.analysis.ControlFlow.Catcher r2) {
                r0 = r2
                javassist.bytecode.analysis.ControlFlow$Block r0 = r0.node
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/ControlFlow$Node.class */
    public static class Node {
        private javassist.bytecode.analysis.ControlFlow.Block block;
        private javassist.bytecode.analysis.ControlFlow.Node parent;
        private javassist.bytecode.analysis.ControlFlow.Node[] children;

        Node(javassist.bytecode.analysis.ControlFlow.Block r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.block = r1
                r0 = r3
                r1 = 0
                r0.parent = r1
                return
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r5 = r0
                r0 = r5
                java.lang.String r1 = "Node[pos="
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r4
                javassist.bytecode.analysis.ControlFlow$Block r1 = r1.block()
                int r1 = r1.position()
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                java.lang.String r1 = ", parent="
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                r1 = r4
                javassist.bytecode.analysis.ControlFlow$Node r1 = r1.parent
                if (r1 != 0) goto L2d
                java.lang.String r1 = "*"
                goto L3a
            L2d:
                r1 = r4
                javassist.bytecode.analysis.ControlFlow$Node r1 = r1.parent
                javassist.bytecode.analysis.ControlFlow$Block r1 = r1.block()
                int r1 = r1.position()
                java.lang.String r1 = java.lang.Integer.toString(r1)
            L3a:
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                java.lang.String r1 = ", children{"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = 0
                r6 = r0
            L47:
                r0 = r6
                r1 = r4
                javassist.bytecode.analysis.ControlFlow$Node[] r1 = r1.children
                int r1 = r1.length
                if (r0 >= r1) goto L6c
                r0 = r5
                r1 = r4
                javassist.bytecode.analysis.ControlFlow$Node[] r1 = r1.children
                r2 = r6
                r1 = r1[r2]
                javassist.bytecode.analysis.ControlFlow$Block r1 = r1.block()
                int r1 = r1.position()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
                int r6 = r6 + 1
                goto L47
            L6c:
                r0 = r5
                java.lang.String r1 = "}]"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r5
                java.lang.String r0 = r0.toString()
                return r0
        }

        public javassist.bytecode.analysis.ControlFlow.Block block() {
                r2 = this;
                r0 = r2
                javassist.bytecode.analysis.ControlFlow$Block r0 = r0.block
                return r0
        }

        public javassist.bytecode.analysis.ControlFlow.Node parent() {
                r2 = this;
                r0 = r2
                javassist.bytecode.analysis.ControlFlow$Node r0 = r0.parent
                return r0
        }

        public int children() {
                r2 = this;
                r0 = r2
                javassist.bytecode.analysis.ControlFlow$Node[] r0 = r0.children
                int r0 = r0.length
                return r0
        }

        public javassist.bytecode.analysis.ControlFlow.Node child(int r4) {
                r3 = this;
                r0 = r3
                javassist.bytecode.analysis.ControlFlow$Node[] r0 = r0.children
                r1 = r4
                r0 = r0[r1]
                return r0
        }

        int makeDepth1stTree(javassist.bytecode.analysis.ControlFlow.Node r8, boolean[] r9, int r10, int[] r11, javassist.bytecode.analysis.ControlFlow.Access r12) {
                r7 = this;
                r0 = r7
                javassist.bytecode.analysis.ControlFlow$Block r0 = r0.block
                int r0 = r0.index
                r13 = r0
                r0 = r9
                r1 = r13
                r0 = r0[r1]
                if (r0 == 0) goto L12
                r0 = r10
                return r0
            L12:
                r0 = r9
                r1 = r13
                r2 = 1
                r0[r1] = r2
                r0 = r7
                r1 = r8
                r0.parent = r1
                r0 = r12
                r1 = r7
                javassist.bytecode.stackmap.BasicBlock[] r0 = r0.exits(r1)
                r14 = r0
                r0 = r14
                if (r0 == 0) goto L53
                r0 = 0
                r15 = r0
            L2c:
                r0 = r15
                r1 = r14
                int r1 = r1.length
                if (r0 >= r1) goto L53
                r0 = r12
                r1 = r14
                r2 = r15
                r1 = r1[r2]
                javassist.bytecode.analysis.ControlFlow$Node r0 = r0.node(r1)
                r16 = r0
                r0 = r16
                r1 = r7
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                int r0 = r0.makeDepth1stTree(r1, r2, r3, r4, r5)
                r10 = r0
                int r15 = r15 + 1
                goto L2c
            L53:
                r0 = r11
                r1 = r13
                r2 = r10
                int r10 = r10 + 1
                r0[r1] = r2
                r0 = r10
                return r0
        }

        boolean makeDominatorTree(boolean[] r6, int[] r7, javassist.bytecode.analysis.ControlFlow.Access r8) {
                r5 = this;
                r0 = r5
                javassist.bytecode.analysis.ControlFlow$Block r0 = r0.block
                int r0 = r0.index
                r9 = r0
                r0 = r6
                r1 = r9
                r0 = r0[r1]
                if (r0 == 0) goto L12
                r0 = 0
                return r0
            L12:
                r0 = r6
                r1 = r9
                r2 = 1
                r0[r1] = r2
                r0 = 0
                r10 = r0
                r0 = r8
                r1 = r5
                javassist.bytecode.stackmap.BasicBlock[] r0 = r0.exits(r1)
                r11 = r0
                r0 = r11
                if (r0 == 0) goto L50
                r0 = 0
                r12 = r0
            L29:
                r0 = r12
                r1 = r11
                int r1 = r1.length
                if (r0 >= r1) goto L50
                r0 = r8
                r1 = r11
                r2 = r12
                r1 = r1[r2]
                javassist.bytecode.analysis.ControlFlow$Node r0 = r0.node(r1)
                r13 = r0
                r0 = r13
                r1 = r6
                r2 = r7
                r3 = r8
                boolean r0 = r0.makeDominatorTree(r1, r2, r3)
                if (r0 == 0) goto L4a
                r0 = 1
                r10 = r0
            L4a:
                int r12 = r12 + 1
                goto L29
            L50:
                r0 = r8
                r1 = r5
                javassist.bytecode.stackmap.BasicBlock[] r0 = r0.entrances(r1)
                r12 = r0
                r0 = r12
                if (r0 == 0) goto L99
                r0 = 0
                r13 = r0
            L5f:
                r0 = r13
                r1 = r12
                int r1 = r1.length
                if (r0 >= r1) goto L99
                r0 = r5
                javassist.bytecode.analysis.ControlFlow$Node r0 = r0.parent
                if (r0 == 0) goto L93
                r0 = r5
                javassist.bytecode.analysis.ControlFlow$Node r0 = r0.parent
                r1 = r8
                r2 = r12
                r3 = r13
                r2 = r2[r3]
                javassist.bytecode.analysis.ControlFlow$Node r1 = r1.node(r2)
                r2 = r7
                javassist.bytecode.analysis.ControlFlow$Node r0 = getAncestor(r0, r1, r2)
                r14 = r0
                r0 = r14
                r1 = r5
                javassist.bytecode.analysis.ControlFlow$Node r1 = r1.parent
                if (r0 == r1) goto L93
                r0 = r5
                r1 = r14
                r0.parent = r1
                r0 = 1
                r10 = r0
            L93:
                int r13 = r13 + 1
                goto L5f
            L99:
                r0 = r10
                return r0
        }

        private static javassist.bytecode.analysis.ControlFlow.Node getAncestor(javassist.bytecode.analysis.ControlFlow.Node r4, javassist.bytecode.analysis.ControlFlow.Node r5, int[] r6) {
            L0:
                r0 = r4
                r1 = r5
                if (r0 == r1) goto L31
                r0 = r6
                r1 = r4
                javassist.bytecode.analysis.ControlFlow$Block r1 = r1.block
                int r1 = r1.index
                r0 = r0[r1]
                r1 = r6
                r2 = r5
                javassist.bytecode.analysis.ControlFlow$Block r2 = r2.block
                int r2 = r2.index
                r1 = r1[r2]
                if (r0 >= r1) goto L22
                r0 = r4
                javassist.bytecode.analysis.ControlFlow$Node r0 = r0.parent
                r4 = r0
                goto L27
            L22:
                r0 = r5
                javassist.bytecode.analysis.ControlFlow$Node r0 = r0.parent
                r5 = r0
            L27:
                r0 = r4
                if (r0 == 0) goto L2f
                r0 = r5
                if (r0 != 0) goto L0
            L2f:
                r0 = 0
                return r0
            L31:
                r0 = r4
                return r0
        }

        private static void setChildren(javassist.bytecode.analysis.ControlFlow.Node[] r7) {
                r0 = r7
                int r0 = r0.length
                r8 = r0
                r0 = r8
                int[] r0 = new int[r0]
                r9 = r0
                r0 = 0
                r10 = r0
            L9:
                r0 = r10
                r1 = r8
                if (r0 >= r1) goto L18
                r0 = r9
                r1 = r10
                r2 = 0
                r0[r1] = r2
                int r10 = r10 + 1
                goto L9
            L18:
                r0 = 0
                r10 = r0
            L1a:
                r0 = r10
                r1 = r8
                if (r0 >= r1) goto L40
                r0 = r7
                r1 = r10
                r0 = r0[r1]
                javassist.bytecode.analysis.ControlFlow$Node r0 = r0.parent
                r11 = r0
                r0 = r11
                if (r0 == 0) goto L3a
                r0 = r9
                r1 = r11
                javassist.bytecode.analysis.ControlFlow$Block r1 = r1.block
                int r1 = r1.index
                r2 = r0; r3 = r1; 
                r2 = r2[r3]
                r3 = 1
                int r2 = r2 + r3
                r0[r1] = r2
            L3a:
                int r10 = r10 + 1
                goto L1a
            L40:
                r0 = 0
                r10 = r0
            L42:
                r0 = r10
                r1 = r8
                if (r0 >= r1) goto L59
                r0 = r7
                r1 = r10
                r0 = r0[r1]
                r1 = r9
                r2 = r10
                r1 = r1[r2]
                javassist.bytecode.analysis.ControlFlow$Node[] r1 = new javassist.bytecode.analysis.ControlFlow.Node[r1]
                r0.children = r1
                int r10 = r10 + 1
                goto L42
            L59:
                r0 = 0
                r10 = r0
            L5b:
                r0 = r10
                r1 = r8
                if (r0 >= r1) goto L6a
                r0 = r9
                r1 = r10
                r2 = 0
                r0[r1] = r2
                int r10 = r10 + 1
                goto L5b
            L6a:
                r0 = 0
                r10 = r0
            L6c:
                r0 = r10
                r1 = r8
                if (r0 >= r1) goto L9f
                r0 = r7
                r1 = r10
                r0 = r0[r1]
                r11 = r0
                r0 = r11
                javassist.bytecode.analysis.ControlFlow$Node r0 = r0.parent
                r12 = r0
                r0 = r12
                if (r0 == 0) goto L99
                r0 = r12
                javassist.bytecode.analysis.ControlFlow$Node[] r0 = r0.children
                r1 = r9
                r2 = r12
                javassist.bytecode.analysis.ControlFlow$Block r2 = r2.block
                int r2 = r2.index
                r3 = r1; r4 = r2; 
                r3 = r3[r4]
                r4 = r3; r3 = r2; r2 = r1; r1 = r4; 
                r5 = 1
                int r4 = r4 + r5
                r2[r3] = r4
                r2 = r11
                r0[r1] = r2
            L99:
                int r10 = r10 + 1
                goto L6c
            L9f:
                return
        }

        static /* synthetic */ javassist.bytecode.analysis.ControlFlow.Block access$200(javassist.bytecode.analysis.ControlFlow.Node r2) {
                r0 = r2
                javassist.bytecode.analysis.ControlFlow$Block r0 = r0.block
                return r0
        }

        static /* synthetic */ void access$300(javassist.bytecode.analysis.ControlFlow.Node[] r2) {
                r0 = r2
                setChildren(r0)
                return
        }
    }

    public ControlFlow(javassist.CtMethod r5) throws javassist.bytecode.BadBytecode {
            r4 = this;
            r0 = r4
            r1 = r5
            javassist.CtClass r1 = r1.getDeclaringClass()
            r2 = r5
            javassist.bytecode.MethodInfo r2 = r2.getMethodInfo2()
            r0.<init>(r1, r2)
            return
    }

    public ControlFlow(javassist.CtClass r8, javassist.bytecode.MethodInfo r9) throws javassist.bytecode.BadBytecode {
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r7
            r1 = r8
            r0.clazz = r1
            r0 = r7
            r1 = r9
            r0.methodInfo = r1
            r0 = r7
            r1 = 0
            r0.frames = r1
            r0 = r7
            javassist.bytecode.analysis.ControlFlow$1 r1 = new javassist.bytecode.analysis.ControlFlow$1
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r2 = r9
            javassist.bytecode.stackmap.BasicBlock[] r1 = r1.make(r2)
            javassist.bytecode.analysis.ControlFlow$Block[] r1 = (javassist.bytecode.analysis.ControlFlow.Block[]) r1
            r0.basicBlocks = r1
            r0 = r7
            javassist.bytecode.analysis.ControlFlow$Block[] r0 = r0.basicBlocks
            if (r0 != 0) goto L35
            r0 = r7
            r1 = 0
            javassist.bytecode.analysis.ControlFlow$Block[] r1 = new javassist.bytecode.analysis.ControlFlow.Block[r1]
            r0.basicBlocks = r1
        L35:
            r0 = r7
            javassist.bytecode.analysis.ControlFlow$Block[] r0 = r0.basicBlocks
            int r0 = r0.length
            r10 = r0
            r0 = r10
            int[] r0 = new int[r0]
            r11 = r0
            r0 = 0
            r12 = r0
        L43:
            r0 = r12
            r1 = r10
            if (r0 >= r1) goto L72
            r0 = r7
            javassist.bytecode.analysis.ControlFlow$Block[] r0 = r0.basicBlocks
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            r1 = r12
            r0.index = r1
            r0 = r13
            r1 = r13
            int r1 = r1.incomings()
            javassist.bytecode.analysis.ControlFlow$Block[] r1 = new javassist.bytecode.analysis.ControlFlow.Block[r1]
            r0.entrances = r1
            r0 = r11
            r1 = r12
            r2 = 0
            r0[r1] = r2
            int r12 = r12 + 1
            goto L43
        L72:
            r0 = 0
            r12 = r0
        L75:
            r0 = r12
            r1 = r10
            if (r0 >= r1) goto Lf2
            r0 = r7
            javassist.bytecode.analysis.ControlFlow$Block[] r0 = r0.basicBlocks
            r1 = r12
            r0 = r0[r1]
            r13 = r0
            r0 = 0
            r14 = r0
        L87:
            r0 = r14
            r1 = r13
            int r1 = r1.exits()
            if (r0 >= r1) goto Lb5
            r0 = r13
            r1 = r14
            javassist.bytecode.analysis.ControlFlow$Block r0 = r0.exit(r1)
            r15 = r0
            r0 = r15
            javassist.bytecode.analysis.ControlFlow$Block[] r0 = r0.entrances
            r1 = r11
            r2 = r15
            int r2 = r2.index
            r3 = r1; r4 = r2; 
            r3 = r3[r4]
            r4 = r3; r3 = r2; r2 = r1; r1 = r4; 
            r5 = 1
            int r4 = r4 + r5
            r2[r3] = r4
            r2 = r13
            r0[r1] = r2
            int r14 = r14 + 1
            goto L87
        Lb5:
            r0 = r13
            javassist.bytecode.analysis.ControlFlow$Catcher[] r0 = r0.catchers()
            r14 = r0
            r0 = 0
            r15 = r0
        Lbf:
            r0 = r15
            r1 = r14
            int r1 = r1.length
            if (r0 >= r1) goto Lec
            r0 = r14
            r1 = r15
            r0 = r0[r1]
            javassist.bytecode.analysis.ControlFlow$Block r0 = javassist.bytecode.analysis.ControlFlow.Catcher.access$100(r0)
            r16 = r0
            r0 = r16
            javassist.bytecode.analysis.ControlFlow$Block[] r0 = r0.entrances
            r1 = r11
            r2 = r16
            int r2 = r2.index
            r3 = r1; r4 = r2; 
            r3 = r3[r4]
            r4 = r3; r3 = r2; r2 = r1; r1 = r4; 
            r5 = 1
            int r4 = r4 + r5
            r2[r3] = r4
            r2 = r13
            r0[r1] = r2
            int r15 = r15 + 1
            goto Lbf
        Lec:
            int r12 = r12 + 1
            goto L75
        Lf2:
            return
    }

    public javassist.bytecode.analysis.ControlFlow.Block[] basicBlocks() {
            r2 = this;
            r0 = r2
            javassist.bytecode.analysis.ControlFlow$Block[] r0 = r0.basicBlocks
            return r0
    }

    public javassist.bytecode.analysis.Frame frameAt(int r6) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.bytecode.analysis.Frame[] r0 = r0.frames
            if (r0 != 0) goto L1d
            r0 = r5
            javassist.bytecode.analysis.Analyzer r1 = new javassist.bytecode.analysis.Analyzer
            r2 = r1
            r2.<init>()
            r2 = r5
            javassist.CtClass r2 = r2.clazz
            r3 = r5
            javassist.bytecode.MethodInfo r3 = r3.methodInfo
            javassist.bytecode.analysis.Frame[] r1 = r1.analyze(r2, r3)
            r0.frames = r1
        L1d:
            r0 = r5
            javassist.bytecode.analysis.Frame[] r0 = r0.frames
            r1 = r6
            r0 = r0[r1]
            return r0
    }

    public javassist.bytecode.analysis.ControlFlow.Node[] dominatorTree() {
            r7 = this;
            r0 = r7
            javassist.bytecode.analysis.ControlFlow$Block[] r0 = r0.basicBlocks
            int r0 = r0.length
            r8 = r0
            r0 = r8
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r8
            javassist.bytecode.analysis.ControlFlow$Node[] r0 = new javassist.bytecode.analysis.ControlFlow.Node[r0]
            r9 = r0
            r0 = r8
            boolean[] r0 = new boolean[r0]
            r10 = r0
            r0 = r8
            int[] r0 = new int[r0]
            r11 = r0
            r0 = 0
            r12 = r0
        L1d:
            r0 = r12
            r1 = r8
            if (r0 >= r1) goto L40
            r0 = r9
            r1 = r12
            javassist.bytecode.analysis.ControlFlow$Node r2 = new javassist.bytecode.analysis.ControlFlow$Node
            r3 = r2
            r4 = r7
            javassist.bytecode.analysis.ControlFlow$Block[] r4 = r4.basicBlocks
            r5 = r12
            r4 = r4[r5]
            r3.<init>(r4)
            r0[r1] = r2
            r0 = r10
            r1 = r12
            r2 = 0
            r0[r1] = r2
            int r12 = r12 + 1
            goto L1d
        L40:
            javassist.bytecode.analysis.ControlFlow$2 r0 = new javassist.bytecode.analysis.ControlFlow$2
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            r12 = r0
            r0 = r9
            r1 = 0
            r0 = r0[r1]
            r1 = 0
            r2 = r10
            r3 = 0
            r4 = r11
            r5 = r12
            int r0 = r0.makeDepth1stTree(r1, r2, r3, r4, r5)
        L59:
            r0 = 0
            r13 = r0
        L5c:
            r0 = r13
            r1 = r8
            if (r0 >= r1) goto L6d
            r0 = r10
            r1 = r13
            r2 = 0
            r0[r1] = r2
            int r13 = r13 + 1
            goto L5c
        L6d:
            r0 = r9
            r1 = 0
            r0 = r0[r1]
            r1 = r10
            r2 = r11
            r3 = r12
            boolean r0 = r0.makeDominatorTree(r1, r2, r3)
            if (r0 != 0) goto L59
            r0 = r9
            javassist.bytecode.analysis.ControlFlow.Node.access$300(r0)
            r0 = r9
            return r0
    }

    public javassist.bytecode.analysis.ControlFlow.Node[] postDominatorTree() {
            r7 = this;
            r0 = r7
            javassist.bytecode.analysis.ControlFlow$Block[] r0 = r0.basicBlocks
            int r0 = r0.length
            r8 = r0
            r0 = r8
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = r8
            javassist.bytecode.analysis.ControlFlow$Node[] r0 = new javassist.bytecode.analysis.ControlFlow.Node[r0]
            r9 = r0
            r0 = r8
            boolean[] r0 = new boolean[r0]
            r10 = r0
            r0 = r8
            int[] r0 = new int[r0]
            r11 = r0
            r0 = 0
            r12 = r0
        L1d:
            r0 = r12
            r1 = r8
            if (r0 >= r1) goto L40
            r0 = r9
            r1 = r12
            javassist.bytecode.analysis.ControlFlow$Node r2 = new javassist.bytecode.analysis.ControlFlow$Node
            r3 = r2
            r4 = r7
            javassist.bytecode.analysis.ControlFlow$Block[] r4 = r4.basicBlocks
            r5 = r12
            r4 = r4[r5]
            r3.<init>(r4)
            r0[r1] = r2
            r0 = r10
            r1 = r12
            r2 = 0
            r0[r1] = r2
            int r12 = r12 + 1
            goto L1d
        L40:
            javassist.bytecode.analysis.ControlFlow$3 r0 = new javassist.bytecode.analysis.ControlFlow$3
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            r12 = r0
            r0 = 0
            r13 = r0
            r0 = 0
            r14 = r0
        L51:
            r0 = r14
            r1 = r8
            if (r0 >= r1) goto L7b
            r0 = r9
            r1 = r14
            r0 = r0[r1]
            javassist.bytecode.analysis.ControlFlow$Block r0 = javassist.bytecode.analysis.ControlFlow.Node.access$200(r0)
            int r0 = r0.exits()
            if (r0 != 0) goto L75
            r0 = r9
            r1 = r14
            r0 = r0[r1]
            r1 = 0
            r2 = r10
            r3 = r13
            r4 = r11
            r5 = r12
            int r0 = r0.makeDepth1stTree(r1, r2, r3, r4, r5)
            r13 = r0
        L75:
            int r14 = r14 + 1
            goto L51
        L7b:
            r0 = 0
            r15 = r0
        L7e:
            r0 = r15
            r1 = r8
            if (r0 >= r1) goto L8f
            r0 = r10
            r1 = r15
            r2 = 0
            r0[r1] = r2
            int r15 = r15 + 1
            goto L7e
        L8f:
            r0 = 0
            r14 = r0
            r0 = 0
            r15 = r0
        L95:
            r0 = r15
            r1 = r8
            if (r0 >= r1) goto Lc0
            r0 = r9
            r1 = r15
            r0 = r0[r1]
            javassist.bytecode.analysis.ControlFlow$Block r0 = javassist.bytecode.analysis.ControlFlow.Node.access$200(r0)
            int r0 = r0.exits()
            if (r0 != 0) goto Lba
            r0 = r9
            r1 = r15
            r0 = r0[r1]
            r1 = r10
            r2 = r11
            r3 = r12
            boolean r0 = r0.makeDominatorTree(r1, r2, r3)
            if (r0 == 0) goto Lba
            r0 = 1
            r14 = r0
        Lba:
            int r15 = r15 + 1
            goto L95
        Lc0:
            r0 = r14
            if (r0 != 0) goto L7b
            r0 = r9
            javassist.bytecode.analysis.ControlFlow.Node.access$300(r0)
            r0 = r9
            return r0
    }

    static /* synthetic */ javassist.bytecode.MethodInfo access$000(javassist.bytecode.analysis.ControlFlow r2) {
            r0 = r2
            javassist.bytecode.MethodInfo r0 = r0.methodInfo
            return r0
    }
}
