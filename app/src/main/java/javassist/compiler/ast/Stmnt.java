package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/Stmnt.class */
public class Stmnt extends javassist.compiler.ast.ASTList implements javassist.compiler.TokenId {
    private static final long serialVersionUID = 1;
    protected int operatorId;

    public Stmnt(int r5, javassist.compiler.ast.ASTree r6, javassist.compiler.ast.ASTList r7) {
            r4 = this;
            r0 = r4
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r5
            r0.operatorId = r1
            return
    }

    public Stmnt(int r4, javassist.compiler.ast.ASTree r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.operatorId = r1
            return
    }

    public Stmnt(int r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public static javassist.compiler.ast.Stmnt make(int r8, javassist.compiler.ast.ASTree r9, javassist.compiler.ast.ASTree r10) {
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = r8
            r3 = r9
            javassist.compiler.ast.ASTList r4 = new javassist.compiler.ast.ASTList
            r5 = r4
            r6 = r10
            r5.<init>(r6)
            r1.<init>(r2, r3, r4)
            return r0
    }

    public static javassist.compiler.ast.Stmnt make(int r11, javassist.compiler.ast.ASTree r12, javassist.compiler.ast.ASTree r13, javassist.compiler.ast.ASTree r14) {
            javassist.compiler.ast.Stmnt r0 = new javassist.compiler.ast.Stmnt
            r1 = r0
            r2 = r11
            r3 = r12
            javassist.compiler.ast.ASTList r4 = new javassist.compiler.ast.ASTList
            r5 = r4
            r6 = r13
            javassist.compiler.ast.ASTList r7 = new javassist.compiler.ast.ASTList
            r8 = r7
            r9 = r14
            r8.<init>(r9)
            r5.<init>(r6, r7)
            r1.<init>(r2, r3, r4)
            return r0
    }

    @Override // javassist.compiler.ast.ASTList, javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atStmnt(r1)
            return
    }

    public int getOperator() {
            r2 = this;
            r0 = r2
            int r0 = r0.operatorId
            return r0
    }

    @Override // javassist.compiler.ast.ASTree
    protected java.lang.String getTag() {
            r3 = this;
            r0 = r3
            int r0 = r0.operatorId
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "stmnt:"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.operatorId
            char r1 = (char) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L22:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "stmnt:"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            int r1 = r1.operatorId
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
