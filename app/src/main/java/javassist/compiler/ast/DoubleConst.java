package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/DoubleConst.class */
public class DoubleConst extends javassist.compiler.ast.ASTree {
    private static final long serialVersionUID = 1;
    protected double value;
    protected int type;

    public DoubleConst(double r5, int r7) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.value = r1
            r0 = r4
            r1 = r7
            r0.type = r1
            return
    }

    public double get() {
            r3 = this;
            r0 = r3
            double r0 = r0.value
            return r0
    }

    public void set(double r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.value = r1
            return
    }

    public int getType() {
            r2 = this;
            r0 = r2
            int r0 = r0.type
            return r0
    }

    @Override // javassist.compiler.ast.ASTree
    public java.lang.String toString() {
            r3 = this;
            r0 = r3
            double r0 = r0.value
            java.lang.String r0 = java.lang.Double.toString(r0)
            return r0
    }

    @Override // javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atDoubleConst(r1)
            return
    }

    public javassist.compiler.ast.ASTree compute(int r5, javassist.compiler.ast.ASTree r6) {
            r4 = this;
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.IntConst
            if (r0 == 0) goto L11
            r0 = r4
            r1 = r5
            r2 = r6
            javassist.compiler.ast.IntConst r2 = (javassist.compiler.ast.IntConst) r2
            javassist.compiler.ast.DoubleConst r0 = r0.compute0(r1, r2)
            return r0
        L11:
            r0 = r6
            boolean r0 = r0 instanceof javassist.compiler.ast.DoubleConst
            if (r0 == 0) goto L22
            r0 = r4
            r1 = r5
            r2 = r6
            javassist.compiler.ast.DoubleConst r2 = (javassist.compiler.ast.DoubleConst) r2
            javassist.compiler.ast.DoubleConst r0 = r0.compute0(r1, r2)
            return r0
        L22:
            r0 = 0
            return r0
    }

    private javassist.compiler.ast.DoubleConst compute0(int r8, javassist.compiler.ast.DoubleConst r9) {
            r7 = this;
            r0 = r7
            int r0 = r0.type
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L14
            r0 = r9
            int r0 = r0.type
            r1 = 405(0x195, float:5.68E-43)
            if (r0 != r1) goto L1b
        L14:
            r0 = 405(0x195, float:5.68E-43)
            r10 = r0
            goto L1f
        L1b:
            r0 = 404(0x194, float:5.66E-43)
            r10 = r0
        L1f:
            r0 = r8
            r1 = r7
            double r1 = r1.value
            r2 = r9
            double r2 = r2.value
            r3 = r10
            javassist.compiler.ast.DoubleConst r0 = compute(r0, r1, r2, r3)
            return r0
    }

    private javassist.compiler.ast.DoubleConst compute0(int r8, javassist.compiler.ast.IntConst r9) {
            r7 = this;
            r0 = r8
            r1 = r7
            double r1 = r1.value
            r2 = r9
            long r2 = r2.value
            double r2 = (double) r2
            r3 = r7
            int r3 = r3.type
            javassist.compiler.ast.DoubleConst r0 = compute(r0, r1, r2, r3)
            return r0
    }

    private static javassist.compiler.ast.DoubleConst compute(int r6, double r7, double r9, int r11) {
            r0 = r6
            switch(r0) {
                case 37: goto L5c;
                case 38: goto L64;
                case 39: goto L64;
                case 40: goto L64;
                case 41: goto L64;
                case 42: goto L4c;
                case 43: goto L3c;
                case 44: goto L64;
                case 45: goto L44;
                case 46: goto L64;
                case 47: goto L54;
                default: goto L64;
            }
        L3c:
            r0 = r7
            r1 = r9
            double r0 = r0 + r1
            r12 = r0
            goto L66
        L44:
            r0 = r7
            r1 = r9
            double r0 = r0 - r1
            r12 = r0
            goto L66
        L4c:
            r0 = r7
            r1 = r9
            double r0 = r0 * r1
            r12 = r0
            goto L66
        L54:
            r0 = r7
            r1 = r9
            double r0 = r0 / r1
            r12 = r0
            goto L66
        L5c:
            r0 = r7
            r1 = r9
            double r0 = r0 % r1
            r12 = r0
            goto L66
        L64:
            r0 = 0
            return r0
        L66:
            javassist.compiler.ast.DoubleConst r0 = new javassist.compiler.ast.DoubleConst
            r1 = r0
            r2 = r12
            r3 = r11
            r1.<init>(r2, r3)
            return r0
    }
}
