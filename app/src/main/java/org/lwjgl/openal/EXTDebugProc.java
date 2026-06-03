package org.lwjgl.openal;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/EXTDebugProc.class */
public abstract class EXTDebugProc extends org.lwjgl.system.Callback implements org.lwjgl.openal.EXTDebugProcI {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/EXTDebugProc$Container.class */
    private static final class Container extends org.lwjgl.openal.EXTDebugProc {
        private final org.lwjgl.openal.EXTDebugProcI delegate;

        Container(long r5, org.lwjgl.openal.EXTDebugProcI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.openal.EXTDebugProcI
        public void invoke(int r12, int r13, int r14, int r15, int r16, long r17, long r19) {
                r11 = this;
                r0 = r11
                org.lwjgl.openal.EXTDebugProcI r0 = r0.delegate
                r1 = r12
                r2 = r13
                r3 = r14
                r4 = r15
                r5 = r16
                r6 = r17
                r7 = r19
                r0.invoke(r1, r2, r3, r4, r5, r6, r7)
                return
        }
    }

    public static org.lwjgl.openal.EXTDebugProc create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.openal.EXTDebugProcI r0 = (org.lwjgl.openal.EXTDebugProcI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.openal.EXTDebugProc
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.openal.EXTDebugProc r0 = (org.lwjgl.openal.EXTDebugProc) r0
            goto L1f
        L16:
            org.lwjgl.openal.EXTDebugProc$Container r0 = new org.lwjgl.openal.EXTDebugProc$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    public static org.lwjgl.openal.EXTDebugProc createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.openal.EXTDebugProc r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.openal.EXTDebugProc create(org.lwjgl.openal.EXTDebugProcI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.openal.EXTDebugProc
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.openal.EXTDebugProc r0 = (org.lwjgl.openal.EXTDebugProc) r0
            goto L1c
        Le:
            org.lwjgl.openal.EXTDebugProc$Container r0 = new org.lwjgl.openal.EXTDebugProc$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected EXTDebugProc() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.Callback$Descriptor r1 = org.lwjgl.openal.EXTDebugProc.DESCRIPTOR
            r0.<init>(r1)
            return
    }

    EXTDebugProc(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
