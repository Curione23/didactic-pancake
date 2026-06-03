package javassist.compiler.ast;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/compiler/ast/IntConst.class */
public class IntConst extends javassist.compiler.ast.ASTree {
    private static final long serialVersionUID = 1;
    protected long value;
    protected int type;

    public IntConst(long r5, int r7) {
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

    public long get() {
            r3 = this;
            r0 = r3
            long r0 = r0.value
            return r0
    }

    public void set(long r5) {
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
            long r0 = r0.value
            java.lang.String r0 = java.lang.Long.toString(r0)
            return r0
    }

    @Override // javassist.compiler.ast.ASTree
    public void accept(javassist.compiler.ast.Visitor r4) throws javassist.compiler.CompileError {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.atIntConst(r1)
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
            javassist.compiler.ast.IntConst r0 = r0.compute0(r1, r2)
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

    private javassist.compiler.ast.IntConst compute0(int r7, javassist.compiler.ast.IntConst r8) {
            r6 = this;
            r0 = r6
            int r0 = r0.type
            r9 = r0
            r0 = r8
            int r0 = r0.type
            r10 = r0
            r0 = r9
            r1 = 403(0x193, float:5.65E-43)
            if (r0 == r1) goto L1a
            r0 = r10
            r1 = 403(0x193, float:5.65E-43)
            if (r0 != r1) goto L22
        L1a:
            r0 = 403(0x193, float:5.65E-43)
            r11 = r0
            goto L3e
        L22:
            r0 = r9
            r1 = 401(0x191, float:5.62E-43)
            if (r0 != r1) goto L39
            r0 = r10
            r1 = 401(0x191, float:5.62E-43)
            if (r0 != r1) goto L39
            r0 = 401(0x191, float:5.62E-43)
            r11 = r0
            goto L3e
        L39:
            r0 = 402(0x192, float:5.63E-43)
            r11 = r0
        L3e:
            r0 = r6
            long r0 = r0.value
            r12 = r0
            r0 = r8
            long r0 = r0.value
            r14 = r0
            r0 = r7
            switch(r0) {
                case 37: goto Ld4;
                case 38: goto Lf2;
                case 42: goto Lc0;
                case 43: goto Lac;
                case 45: goto Lb6;
                case 47: goto Lca;
                case 94: goto Le8;
                case 124: goto Lde;
                case 364: goto Lfc;
                case 366: goto L10c;
                case 370: goto L11c;
                default: goto L12c;
            }
        Lac:
            r0 = r12
            r1 = r14
            long r0 = r0 + r1
            r16 = r0
            goto L12e
        Lb6:
            r0 = r12
            r1 = r14
            long r0 = r0 - r1
            r16 = r0
            goto L12e
        Lc0:
            r0 = r12
            r1 = r14
            long r0 = r0 * r1
            r16 = r0
            goto L12e
        Lca:
            r0 = r12
            r1 = r14
            long r0 = r0 / r1
            r16 = r0
            goto L12e
        Ld4:
            r0 = r12
            r1 = r14
            long r0 = r0 % r1
            r16 = r0
            goto L12e
        Lde:
            r0 = r12
            r1 = r14
            long r0 = r0 | r1
            r16 = r0
            goto L12e
        Le8:
            r0 = r12
            r1 = r14
            long r0 = r0 ^ r1
            r16 = r0
            goto L12e
        Lf2:
            r0 = r12
            r1 = r14
            long r0 = r0 & r1
            r16 = r0
            goto L12e
        Lfc:
            r0 = r6
            long r0 = r0.value
            r1 = r14
            int r1 = (int) r1
            long r0 = r0 << r1
            r16 = r0
            r0 = r9
            r11 = r0
            goto L12e
        L10c:
            r0 = r6
            long r0 = r0.value
            r1 = r14
            int r1 = (int) r1
            long r0 = r0 >> r1
            r16 = r0
            r0 = r9
            r11 = r0
            goto L12e
        L11c:
            r0 = r6
            long r0 = r0.value
            r1 = r14
            int r1 = (int) r1
            long r0 = r0 >>> r1
            r16 = r0
            r0 = r9
            r11 = r0
            goto L12e
        L12c:
            r0 = 0
            return r0
        L12e:
            javassist.compiler.ast.IntConst r0 = new javassist.compiler.ast.IntConst
            r1 = r0
            r2 = r16
            r3 = r11
            r1.<init>(r2, r3)
            return r0
    }

    private javassist.compiler.ast.DoubleConst compute0(int r7, javassist.compiler.ast.DoubleConst r8) {
            r6 = this;
            r0 = r6
            long r0 = r0.value
            double r0 = (double) r0
            r9 = r0
            r0 = r8
            double r0 = r0.value
            r11 = r0
            r0 = r7
            switch(r0) {
                case 37: goto L6c;
                case 38: goto L75;
                case 39: goto L75;
                case 40: goto L75;
                case 41: goto L75;
                case 42: goto L5a;
                case 43: goto L48;
                case 44: goto L75;
                case 45: goto L51;
                case 46: goto L75;
                case 47: goto L63;
                default: goto L75;
            }
        L48:
            r0 = r9
            r1 = r11
            double r0 = r0 + r1
            r13 = r0
            goto L77
        L51:
            r0 = r9
            r1 = r11
            double r0 = r0 - r1
            r13 = r0
            goto L77
        L5a:
            r0 = r9
            r1 = r11
            double r0 = r0 * r1
            r13 = r0
            goto L77
        L63:
            r0 = r9
            r1 = r11
            double r0 = r0 / r1
            r13 = r0
            goto L77
        L6c:
            r0 = r9
            r1 = r11
            double r0 = r0 % r1
            r13 = r0
            goto L77
        L75:
            r0 = 0
            return r0
        L77:
            javassist.compiler.ast.DoubleConst r0 = new javassist.compiler.ast.DoubleConst
            r1 = r0
            r2 = r13
            r3 = r8
            int r3 = r3.type
            r1.<init>(r2, r3)
            return r0
    }
}
