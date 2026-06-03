package javassist.bytecode.analysis;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/SubroutineScanner.class */
public class SubroutineScanner implements javassist.bytecode.Opcode {
    private javassist.bytecode.analysis.Subroutine[] subroutines;
    java.util.Map<java.lang.Integer, javassist.bytecode.analysis.Subroutine> subTable;
    java.util.Set<java.lang.Integer> done;

    public SubroutineScanner() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.subTable = r1
            r0 = r4
            java.util.HashSet r1 = new java.util.HashSet
            r2 = r1
            r2.<init>()
            r0.done = r1
            return
    }

    public javassist.bytecode.analysis.Subroutine[] scan(javassist.bytecode.MethodInfo r8) throws javassist.bytecode.BadBytecode {
            r7 = this;
            r0 = r8
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            r9 = r0
            r0 = r9
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r10 = r0
            r0 = r7
            r1 = r9
            int r1 = r1.getCodeLength()
            javassist.bytecode.analysis.Subroutine[] r1 = new javassist.bytecode.analysis.Subroutine[r1]
            r0.subroutines = r1
            r0 = r7
            java.util.Map<java.lang.Integer, javassist.bytecode.analysis.Subroutine> r0 = r0.subTable
            r0.clear()
            r0 = r7
            java.util.Set<java.lang.Integer> r0 = r0.done
            r0.clear()
            r0 = r7
            r1 = 0
            r2 = r10
            r3 = 0
            r0.scan(r1, r2, r3)
            r0 = r9
            javassist.bytecode.ExceptionTable r0 = r0.getExceptionTable()
            r11 = r0
            r0 = 0
            r12 = r0
        L37:
            r0 = r12
            r1 = r11
            int r1 = r1.size()
            if (r0 >= r1) goto L63
            r0 = r11
            r1 = r12
            int r0 = r0.handlerPc(r1)
            r13 = r0
            r0 = r7
            r1 = r13
            r2 = r10
            r3 = r7
            javassist.bytecode.analysis.Subroutine[] r3 = r3.subroutines
            r4 = r11
            r5 = r12
            int r4 = r4.startPc(r5)
            r3 = r3[r4]
            r0.scan(r1, r2, r3)
            int r12 = r12 + 1
            goto L37
        L63:
            r0 = r7
            javassist.bytecode.analysis.Subroutine[] r0 = r0.subroutines
            return r0
    }

    private void scan(int r6, javassist.bytecode.CodeIterator r7, javassist.bytecode.analysis.Subroutine r8) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            java.util.Set<java.lang.Integer> r0 = r0.done
            r1 = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L11
            return
        L11:
            r0 = r5
            java.util.Set<java.lang.Integer> r0 = r0.done
            r1 = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
            r0 = r7
            int r0 = r0.lookAhead()
            r9 = r0
            r0 = r7
            r1 = r6
            r0.move(r1)
        L2a:
            r0 = r7
            int r0 = r0.next()
            r6 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            boolean r0 = r0.scanOp(r1, r2, r3)
            if (r0 == 0) goto L44
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L2a
            r0 = r7
            r1 = r9
            r0.move(r1)
            return
    }

    private boolean scanOp(int r6, javassist.bytecode.CodeIterator r7, javassist.bytecode.analysis.Subroutine r8) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r5
            javassist.bytecode.analysis.Subroutine[] r0 = r0.subroutines
            r1 = r6
            r2 = r8
            r0[r1] = r2
            r0 = r7
            r1 = r6
            int r0 = r0.byteAt(r1)
            r9 = r0
            r0 = r9
            r1 = 170(0xaa, float:2.38E-43)
            if (r0 != r1) goto L1f
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.scanTableSwitch(r1, r2, r3)
            r0 = 0
            return r0
        L1f:
            r0 = r9
            r1 = 171(0xab, float:2.4E-43)
            if (r0 != r1) goto L30
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.scanLookupSwitch(r1, r2, r3)
            r0 = 0
            return r0
        L30:
            r0 = r9
            boolean r0 = javassist.bytecode.analysis.Util.isReturn(r0)
            if (r0 != 0) goto L48
            r0 = r9
            r1 = 169(0xa9, float:2.37E-43)
            if (r0 == r1) goto L48
            r0 = r9
            r1 = 191(0xbf, float:2.68E-43)
            if (r0 != r1) goto L4a
        L48:
            r0 = 0
            return r0
        L4a:
            r0 = r9
            boolean r0 = javassist.bytecode.analysis.Util.isJumpInstruction(r0)
            if (r0 == 0) goto Lc5
            r0 = r6
            r1 = r7
            int r0 = javassist.bytecode.analysis.Util.getJumpTarget(r0, r1)
            r10 = r0
            r0 = r9
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 == r1) goto L69
            r0 = r9
            r1 = 201(0xc9, float:2.82E-43)
            if (r0 != r1) goto Lb3
        L69:
            r0 = r5
            java.util.Map<java.lang.Integer, javassist.bytecode.analysis.Subroutine> r0 = r0.subTable
            r1 = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            javassist.bytecode.analysis.Subroutine r0 = (javassist.bytecode.analysis.Subroutine) r0
            r11 = r0
            r0 = r11
            if (r0 != 0) goto Laa
            javassist.bytecode.analysis.Subroutine r0 = new javassist.bytecode.analysis.Subroutine
            r1 = r0
            r2 = r10
            r3 = r6
            r1.<init>(r2, r3)
            r11 = r0
            r0 = r5
            java.util.Map<java.lang.Integer, javassist.bytecode.analysis.Subroutine> r0 = r0.subTable
            r1 = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = r11
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            r1 = r10
            r2 = r7
            r3 = r11
            r0.scan(r1, r2, r3)
            goto Lb0
        Laa:
            r0 = r11
            r1 = r6
            r0.addCaller(r1)
        Lb0:
            goto Lc5
        Lb3:
            r0 = r5
            r1 = r10
            r2 = r7
            r3 = r8
            r0.scan(r1, r2, r3)
            r0 = r9
            boolean r0 = javassist.bytecode.analysis.Util.isGoto(r0)
            if (r0 == 0) goto Lc5
            r0 = 0
            return r0
        Lc5:
            r0 = 1
            return r0
    }

    private void scanLookupSwitch(int r6, javassist.bytecode.CodeIterator r7, javassist.bytecode.analysis.Subroutine r8) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r6
            r1 = -4
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 + r1
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r9
            int r2 = r2.s32bitAt(r3)
            int r1 = r1 + r2
            r2 = r7
            r3 = r8
            r0.scan(r1, r2, r3)
            r0 = r7
            int r9 = r9 + 4
            r1 = r9
            int r0 = r0.s32bitAt(r1)
            r10 = r0
            r0 = r10
            r1 = 8
            int r0 = r0 * r1
            int r9 = r9 + 4
            r1 = r9
            int r0 = r0 + r1
            r11 = r0
            int r9 = r9 + 4
        L31:
            r0 = r9
            r1 = r11
            if (r0 >= r1) goto L50
            r0 = r7
            r1 = r9
            int r0 = r0.s32bitAt(r1)
            r1 = r6
            int r0 = r0 + r1
            r12 = r0
            r0 = r5
            r1 = r12
            r2 = r7
            r3 = r8
            r0.scan(r1, r2, r3)
            int r9 = r9 + 8
            goto L31
        L50:
            return
    }

    private void scanTableSwitch(int r6, javassist.bytecode.CodeIterator r7, javassist.bytecode.analysis.Subroutine r8) throws javassist.bytecode.BadBytecode {
            r5 = this;
            r0 = r6
            r1 = -4
            r0 = r0 & r1
            r1 = 4
            int r0 = r0 + r1
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r9
            int r2 = r2.s32bitAt(r3)
            int r1 = r1 + r2
            r2 = r7
            r3 = r8
            r0.scan(r1, r2, r3)
            r0 = r7
            int r9 = r9 + 4
            r1 = r9
            int r0 = r0.s32bitAt(r1)
            r10 = r0
            r0 = r7
            int r9 = r9 + 4
            r1 = r9
            int r0 = r0.s32bitAt(r1)
            r11 = r0
            r0 = r11
            r1 = r10
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            r1 = 4
            int r0 = r0 * r1
            int r9 = r9 + 4
            r1 = r9
            int r0 = r0 + r1
            r12 = r0
        L3d:
            r0 = r9
            r1 = r12
            if (r0 >= r1) goto L5c
            r0 = r7
            r1 = r9
            int r0 = r0.s32bitAt(r1)
            r1 = r6
            int r0 = r0 + r1
            r13 = r0
            r0 = r5
            r1 = r13
            r2 = r7
            r3 = r8
            r0.scan(r1, r2, r3)
            int r9 = r9 + 4
            goto L3d
        L5c:
            return
    }
}
