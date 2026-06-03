package javassist.bytecode.analysis;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/components/MioLibPatcher.jar:javassist/bytecode/analysis/Util.class */
public class Util implements javassist.bytecode.Opcode {
    public Util() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static int getJumpTarget(int r5, javassist.bytecode.CodeIterator r6) {
            r0 = r6
            r1 = r5
            int r0 = r0.byteAt(r1)
            r7 = r0
            r0 = r5
            r1 = r7
            r2 = 201(0xc9, float:2.82E-43)
            if (r1 == r2) goto L15
            r1 = r7
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L1f
        L15:
            r1 = r6
            r2 = r5
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.s32bitAt(r2)
            goto L26
        L1f:
            r1 = r6
            r2 = r5
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.s16bitAt(r2)
        L26:
            int r0 = r0 + r1
            r5 = r0
            r0 = r5
            return r0
    }

    public static boolean isJumpInstruction(int r3) {
            r0 = r3
            r1 = 153(0x99, float:2.14E-43)
            if (r0 < r1) goto Le
            r0 = r3
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 <= r1) goto L2a
        Le:
            r0 = r3
            r1 = 198(0xc6, float:2.77E-43)
            if (r0 == r1) goto L2a
            r0 = r3
            r1 = 199(0xc7, float:2.79E-43)
            if (r0 == r1) goto L2a
            r0 = r3
            r1 = 201(0xc9, float:2.82E-43)
            if (r0 == r1) goto L2a
            r0 = r3
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L2e
        L2a:
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
    }

    public static boolean isGoto(int r3) {
            r0 = r3
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 == r1) goto Le
            r0 = r3
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L12
        Le:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public static boolean isJsr(int r3) {
            r0 = r3
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 == r1) goto Le
            r0 = r3
            r1 = 201(0xc9, float:2.82E-43)
            if (r0 != r1) goto L12
        Le:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public static boolean isReturn(int r3) {
            r0 = r3
            r1 = 172(0xac, float:2.41E-43)
            if (r0 < r1) goto L12
            r0 = r3
            r1 = 177(0xb1, float:2.48E-43)
            if (r0 > r1) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }
}
