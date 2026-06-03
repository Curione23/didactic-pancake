package javassist.compiler;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/SymbolTable.class */
public final class SymbolTable extends java.util.HashMap<java.lang.String, javassist.compiler.ast.Declarator> {
    private static final long serialVersionUID = 1;
    private javassist.compiler.SymbolTable parent;

    public SymbolTable() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    public SymbolTable(javassist.compiler.SymbolTable r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.parent = r1
            return
    }

    public javassist.compiler.SymbolTable getParent() {
            r2 = this;
            r0 = r2
            javassist.compiler.SymbolTable r0 = r0.parent
            return r0
    }

    public javassist.compiler.ast.Declarator lookup(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            javassist.compiler.ast.Declarator r0 = (javassist.compiler.ast.Declarator) r0
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L1d
            r0 = r3
            javassist.compiler.SymbolTable r0 = r0.parent
            if (r0 == 0) goto L1d
            r0 = r3
            javassist.compiler.SymbolTable r0 = r0.parent
            r1 = r4
            javassist.compiler.ast.Declarator r0 = r0.lookup(r1)
            return r0
        L1d:
            r0 = r5
            return r0
    }

    public void append(java.lang.String r5, javassist.compiler.ast.Declarator r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }
}
