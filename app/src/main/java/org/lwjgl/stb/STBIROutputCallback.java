package org.lwjgl.stb;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIROutputCallback.class */
public abstract class STBIROutputCallback extends org.lwjgl.system.Callback implements org.lwjgl.stb.STBIROutputCallbackI {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIROutputCallback$Container.class */
    private static final class Container extends org.lwjgl.stb.STBIROutputCallback {
        private final org.lwjgl.stb.STBIROutputCallbackI delegate;

        Container(long r5, org.lwjgl.stb.STBIROutputCallbackI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.stb.STBIROutputCallbackI
        public void invoke(long r10, int r12, int r13, int r14, long r15) {
                r9 = this;
                r0 = r9
                org.lwjgl.stb.STBIROutputCallbackI r0 = r0.delegate
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r0.invoke(r1, r2, r3, r4, r5)
                return
        }
    }

    public static org.lwjgl.stb.STBIROutputCallback create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.stb.STBIROutputCallbackI r0 = (org.lwjgl.stb.STBIROutputCallbackI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.stb.STBIROutputCallback
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.stb.STBIROutputCallback r0 = (org.lwjgl.stb.STBIROutputCallback) r0
            goto L1f
        L16:
            org.lwjgl.stb.STBIROutputCallback$Container r0 = new org.lwjgl.stb.STBIROutputCallback$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    public static org.lwjgl.stb.STBIROutputCallback createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.stb.STBIROutputCallback r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.stb.STBIROutputCallback create(org.lwjgl.stb.STBIROutputCallbackI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.stb.STBIROutputCallback
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.stb.STBIROutputCallback r0 = (org.lwjgl.stb.STBIROutputCallback) r0
            goto L1c
        Le:
            org.lwjgl.stb.STBIROutputCallback$Container r0 = new org.lwjgl.stb.STBIROutputCallback$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected STBIROutputCallback() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.Callback$Descriptor r1 = org.lwjgl.stb.STBIROutputCallback.DESCRIPTOR
            r0.<init>(r1)
            return
    }

    STBIROutputCallback(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
