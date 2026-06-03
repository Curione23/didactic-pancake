package javassist.bytecode.analysis;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/Frame.class */
public class Frame {
    private javassist.bytecode.analysis.Type[] locals;
    private javassist.bytecode.analysis.Type[] stack;
    private int top;
    private boolean jsrMerged;
    private boolean retMerged;

    public Frame(int r4, int r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            javassist.bytecode.analysis.Type[] r1 = new javassist.bytecode.analysis.Type[r1]
            r0.locals = r1
            r0 = r3
            r1 = r5
            javassist.bytecode.analysis.Type[] r1 = new javassist.bytecode.analysis.Type[r1]
            r0.stack = r1
            return
    }

    public javassist.bytecode.analysis.Type getLocal(int r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.analysis.Type[] r0 = r0.locals
            r1 = r4
            r0 = r0[r1]
            return r0
    }

    public void setLocal(int r5, javassist.bytecode.analysis.Type r6) {
            r4 = this;
            r0 = r4
            javassist.bytecode.analysis.Type[] r0 = r0.locals
            r1 = r5
            r2 = r6
            r0[r1] = r2
            return
    }

    public javassist.bytecode.analysis.Type getStack(int r4) {
            r3 = this;
            r0 = r3
            javassist.bytecode.analysis.Type[] r0 = r0.stack
            r1 = r4
            r0 = r0[r1]
            return r0
    }

    public void setStack(int r5, javassist.bytecode.analysis.Type r6) {
            r4 = this;
            r0 = r4
            javassist.bytecode.analysis.Type[] r0 = r0.stack
            r1 = r5
            r2 = r6
            r0[r1] = r2
            return
    }

    public void clearStack() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.top = r1
            return
    }

    public int getTopIndex() {
            r3 = this;
            r0 = r3
            int r0 = r0.top
            r1 = 1
            int r0 = r0 - r1
            return r0
    }

    public int localsLength() {
            r2 = this;
            r0 = r2
            javassist.bytecode.analysis.Type[] r0 = r0.locals
            int r0 = r0.length
            return r0
    }

    public javassist.bytecode.analysis.Type peek() {
            r4 = this;
            r0 = r4
            int r0 = r0.top
            r1 = 1
            if (r0 >= r1) goto L12
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            java.lang.String r2 = "Stack is empty"
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r4
            javassist.bytecode.analysis.Type[] r0 = r0.stack
            r1 = r4
            int r1 = r1.top
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            return r0
    }

    public javassist.bytecode.analysis.Type pop() {
            r5 = this;
            r0 = r5
            int r0 = r0.top
            r1 = 1
            if (r0 >= r1) goto L12
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            java.lang.String r2 = "Stack is empty"
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r5
            javassist.bytecode.analysis.Type[] r0 = r0.stack
            r1 = r5
            r2 = r1
            int r2 = r2.top
            r3 = 1
            int r2 = r2 - r3
            r3 = r2; r2 = r1; r1 = r3; 
            r2.top = r3
            r0 = r0[r1]
            return r0
    }

    public void push(javassist.bytecode.analysis.Type r7) {
            r6 = this;
            r0 = r6
            javassist.bytecode.analysis.Type[] r0 = r0.stack
            r1 = r6
            r2 = r1
            int r2 = r2.top
            r3 = r2; r2 = r1; r1 = r3; 
            r4 = 1
            int r3 = r3 + r4
            r2.top = r3
            r2 = r7
            r0[r1] = r2
            return
    }

    public javassist.bytecode.analysis.Frame copy() {
            r6 = this;
            javassist.bytecode.analysis.Frame r0 = new javassist.bytecode.analysis.Frame
            r1 = r0
            r2 = r6
            javassist.bytecode.analysis.Type[] r2 = r2.locals
            int r2 = r2.length
            r3 = r6
            javassist.bytecode.analysis.Type[] r3 = r3.stack
            int r3 = r3.length
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            javassist.bytecode.analysis.Type[] r0 = r0.locals
            r1 = 0
            r2 = r7
            javassist.bytecode.analysis.Type[] r2 = r2.locals
            r3 = 0
            r4 = r6
            javassist.bytecode.analysis.Type[] r4 = r4.locals
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r6
            javassist.bytecode.analysis.Type[] r0 = r0.stack
            r1 = 0
            r2 = r7
            javassist.bytecode.analysis.Type[] r2 = r2.stack
            r3 = 0
            r4 = r6
            javassist.bytecode.analysis.Type[] r4 = r4.stack
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r7
            r1 = r6
            int r1 = r1.top
            r0.top = r1
            r0 = r7
            return r0
    }

    public javassist.bytecode.analysis.Frame copyStack() {
            r6 = this;
            javassist.bytecode.analysis.Frame r0 = new javassist.bytecode.analysis.Frame
            r1 = r0
            r2 = r6
            javassist.bytecode.analysis.Type[] r2 = r2.locals
            int r2 = r2.length
            r3 = r6
            javassist.bytecode.analysis.Type[] r3 = r3.stack
            int r3 = r3.length
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r6
            javassist.bytecode.analysis.Type[] r0 = r0.stack
            r1 = 0
            r2 = r7
            javassist.bytecode.analysis.Type[] r2 = r2.stack
            r3 = 0
            r4 = r6
            javassist.bytecode.analysis.Type[] r4 = r4.stack
            int r4 = r4.length
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r7
            r1 = r6
            int r1 = r1.top
            r0.top = r1
            r0 = r7
            return r0
    }

    public boolean mergeStack(javassist.bytecode.analysis.Frame r6) {
            r5 = this;
            r0 = 0
            r7 = r0
            r0 = r5
            int r0 = r0.top
            r1 = r6
            int r1 = r1.top
            if (r0 == r1) goto L17
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Operand stacks could not be merged, they are different sizes!"
            r1.<init>(r2)
            throw r0
        L17:
            r0 = 0
            r8 = r0
        L19:
            r0 = r8
            r1 = r5
            int r1 = r1.top
            if (r0 >= r1) goto L84
            r0 = r5
            javassist.bytecode.analysis.Type[] r0 = r0.stack
            r1 = r8
            r0 = r0[r1]
            if (r0 == 0) goto L7e
            r0 = r5
            javassist.bytecode.analysis.Type[] r0 = r0.stack
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            r1 = r6
            javassist.bytecode.analysis.Type[] r1 = r1.stack
            r2 = r8
            r1 = r1[r2]
            javassist.bytecode.analysis.Type r0 = r0.merge(r1)
            r10 = r0
            r0 = r10
            javassist.bytecode.analysis.Type r1 = javassist.bytecode.analysis.Type.BOGUS
            if (r0 != r1) goto L62
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Operand stacks could not be merged due to differing primitive types: pos = "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L62:
            r0 = r5
            javassist.bytecode.analysis.Type[] r0 = r0.stack
            r1 = r8
            r2 = r10
            r0[r1] = r2
            r0 = r10
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7c
            r0 = r10
            boolean r0 = r0.popChanged()
            if (r0 == 0) goto L7e
        L7c:
            r0 = 1
            r7 = r0
        L7e:
            int r8 = r8 + 1
            goto L19
        L84:
            r0 = r7
            return r0
    }

    public boolean merge(javassist.bytecode.analysis.Frame r6) {
            r5 = this;
            r0 = 0
            r7 = r0
            r0 = 0
            r8 = r0
        L4:
            r0 = r8
            r1 = r5
            javassist.bytecode.analysis.Type[] r1 = r1.locals
            int r1 = r1.length
            if (r0 >= r1) goto L67
            r0 = r5
            javassist.bytecode.analysis.Type[] r0 = r0.locals
            r1 = r8
            r0 = r0[r1]
            if (r0 == 0) goto L4a
            r0 = r5
            javassist.bytecode.analysis.Type[] r0 = r0.locals
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            r1 = r6
            javassist.bytecode.analysis.Type[] r1 = r1.locals
            r2 = r8
            r1 = r1[r2]
            javassist.bytecode.analysis.Type r0 = r0.merge(r1)
            r10 = r0
            r0 = r5
            javassist.bytecode.analysis.Type[] r0 = r0.locals
            r1 = r8
            r2 = r10
            r0[r1] = r2
            r0 = r10
            r1 = r9
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L45
            r0 = r10
            boolean r0 = r0.popChanged()
            if (r0 == 0) goto L47
        L45:
            r0 = 1
            r7 = r0
        L47:
            goto L61
        L4a:
            r0 = r6
            javassist.bytecode.analysis.Type[] r0 = r0.locals
            r1 = r8
            r0 = r0[r1]
            if (r0 == 0) goto L61
            r0 = r5
            javassist.bytecode.analysis.Type[] r0 = r0.locals
            r1 = r8
            r2 = r6
            javassist.bytecode.analysis.Type[] r2 = r2.locals
            r3 = r8
            r2 = r2[r3]
            r0[r1] = r2
            r0 = 1
            r7 = r0
        L61:
            int r8 = r8 + 1
            goto L4
        L67:
            r0 = r7
            r1 = r5
            r2 = r6
            boolean r1 = r1.mergeStack(r2)
            r0 = r0 | r1
            r7 = r0
            r0 = r7
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "locals = ["
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 0
            r6 = r0
        L11:
            r0 = r6
            r1 = r4
            javassist.bytecode.analysis.Type[] r1 = r1.locals
            int r1 = r1.length
            if (r0 >= r1) goto L4e
            r0 = r5
            r1 = r4
            javassist.bytecode.analysis.Type[] r1 = r1.locals
            r2 = r6
            r1 = r1[r2]
            if (r1 != 0) goto L29
            java.lang.String r1 = "empty"
            goto L32
        L29:
            r1 = r4
            javassist.bytecode.analysis.Type[] r1 = r1.locals
            r2 = r6
            r1 = r1[r2]
            java.lang.String r1 = r1.toString()
        L32:
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r4
            javassist.bytecode.analysis.Type[] r1 = r1.locals
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L48
            r0 = r5
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        L48:
            int r6 = r6 + 1
            goto L11
        L4e:
            r0 = r5
            java.lang.String r1 = "] stack = ["
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 0
            r6 = r0
        L57:
            r0 = r6
            r1 = r4
            int r1 = r1.top
            if (r0 >= r1) goto L81
            r0 = r5
            r1 = r4
            javassist.bytecode.analysis.Type[] r1 = r1.stack
            r2 = r6
            r1 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r4
            int r1 = r1.top
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L7b
            r0 = r5
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        L7b:
            int r6 = r6 + 1
            goto L57
        L81:
            r0 = r5
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    boolean isJsrMerged() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.jsrMerged
            return r0
    }

    void setJsrMerged(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.jsrMerged = r1
            return
    }

    boolean isRetMerged() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.retMerged
            return r0
    }

    void setRetMerged(boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.retMerged = r1
            return
    }
}
