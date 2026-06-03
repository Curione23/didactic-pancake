package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/Declarator.class */
public class Declarator extends javassist.compiler.ast.ASTList implements javassist.compiler.TokenId {
    private static final long serialVersionUID = 1;
    protected int varType;
    protected int arrayDim;
    protected int localVar;
    protected java.lang.String qualifiedClass;

    public Declarator(int r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.varType = r1
            r0 = r3
            r1 = r5
            r0.arrayDim = r1
            r0 = r3
            r1 = -1
            r0.localVar = r1
            r0 = r3
            r1 = 0
            r0.qualifiedClass = r1
            return
    }

    public Declarator(javassist.compiler.ast.ASTList r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = 0
            r0.<init>(r1)
            r0 = r4
            r1 = 307(0x133, float:4.3E-43)
            r0.varType = r1
            r0 = r4
            r1 = r6
            r0.arrayDim = r1
            r0 = r4
            r1 = -1
            r0.localVar = r1
            r0 = r4
            r1 = r5
            r2 = 47
            java.lang.String r1 = astToClassName(r1, r2)
            r0.qualifiedClass = r1
            return
    }

    public Declarator(int r4, java.lang.String r5, int r6, int r7, javassist.compiler.ast.Symbol r8) {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.<init>(r1)
            r0 = r3
            r1 = r4
            r0.varType = r1
            r0 = r3
            r1 = r6
            r0.arrayDim = r1
            r0 = r3
            r1 = r7
            r0.localVar = r1
            r0 = r3
            r1 = r5
            r0.qualifiedClass = r1
            r0 = r3
            r1 = r8
            r0.setLeft(r1)
            r0 = r3
            r1 = 0
            javassist.compiler.ast.ASTList r0 = append(r0, r1)
            return
    }

    public javassist.compiler.ast.Declarator make(javassist.compiler.ast.Symbol r7, int r8, javassist.compiler.ast.ASTree r9) {
            r6 = this;
            javassist.compiler.ast.Declarator r0 = new javassist.compiler.ast.Declarator
            r1 = r0
            r2 = r6
            int r2 = r2.varType
            r3 = r6
            int r3 = r3.arrayDim
            r4 = r8
            int r3 = r3 + r4
            r1.<init>(r2, r3)
            r10 = r0
            r0 = r10
            r1 = r6
            java.lang.String r1 = r1.qualifiedClass
            r0.qualifiedClass = r1
            r0 = r10
            r1 = r7
            r0.setLeft(r1)
            r0 = r10
            r1 = r9
            javassist.compiler.ast.ASTList r0 = append(r0, r1)
            r0 = r10
            return r0
    }

    public int getType() {
            r2 = this;
            r0 = r2
            int r0 = r0.varType
            return r0
    }

    public int getArrayDim() {
            r2 = this;
            r0 = r2
            int r0 = r0.arrayDim
            return r0
    }

    public void addArrayDim(int r5) {
            r4 = this;
            r0 = r4
            r1 = r0
            int r1 = r1.arrayDim
            r2 = r5
            int r1 = r1 + r2
            r0.arrayDim = r1
            return
    }

    public java.lang.String getClassName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.qualifiedClass
            return r0
    }

    public void setClassName(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.qualifiedClass = r1
            return
    }

    public javassist.compiler.ast.Symbol getVariable() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTree r0 = r0.getLeft()
            javassist.compiler.ast.Symbol r0 = (javassist.compiler.ast.Symbol) r0
            return r0
    }

    public void setVariable(javassist.compiler.ast.Symbol r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.setLeft(r1)
            return
    }

    public javassist.compiler.ast.ASTree getInitializer() {
            r2 = this;
            r0 = r2
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r3 = r0
            r0 = r3
            if (r0 == 0) goto Le
            r0 = r3
            javassist.compiler.ast.ASTree r0 = r0.head()
            return r0
        Le:
            r0 = 0
            return r0
    }

    public void setLocalVar(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.localVar = r1
            return
    }

    public int getLocalVar() {
            r2 = this;
            r0 = r2
            int r0 = r0.localVar
            return r0
    }

    @Override // javassist.compiler.ast.ASTree
    public java.lang.String getTag() {
            r2 = this;
            java.lang.String r0 = "decl"
            return r0
    }

    @Override // javassist.compiler.ast.ASTList, javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atDeclarator(r1)
            return
    }

    public static java.lang.String astToClassName(javassist.compiler.ast.ASTList r4, char r5) {
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            r1 = r4
            r2 = r5
            astToClassName(r0, r1, r2)
            r0 = r6
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static void astToClassName(java.lang.StringBuilder r4, javassist.compiler.ast.ASTList r5, char r6) {
        L0:
            r0 = r5
            javassist.compiler.ast.ASTree r0 = r0.head()
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof javassist.compiler.ast.Symbol
            if (r0 == 0) goto L1b
            r0 = r4
            r1 = r7
            javassist.compiler.ast.Symbol r1 = (javassist.compiler.ast.Symbol) r1
            java.lang.String r1 = r1.get()
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L2b
        L1b:
            r0 = r7
            boolean r0 = r0 instanceof javassist.compiler.ast.ASTList
            if (r0 == 0) goto L2b
            r0 = r4
            r1 = r7
            javassist.compiler.ast.ASTList r1 = (javassist.compiler.ast.ASTList) r1
            r2 = r6
            astToClassName(r0, r1, r2)
        L2b:
            r0 = r5
            javassist.compiler.ast.ASTList r0 = r0.tail()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L37
            goto L40
        L37:
            r0 = r4
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L0
        L40:
            return
    }
}
