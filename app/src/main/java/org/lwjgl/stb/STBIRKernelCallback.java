package org.lwjgl.stb;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIRKernelCallback.class */
public abstract class STBIRKernelCallback extends org.lwjgl.system.Callback implements org.lwjgl.stb.STBIRKernelCallbackI {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIRKernelCallback$Container.class */
    private static final class Container extends org.lwjgl.stb.STBIRKernelCallback {
        private final org.lwjgl.stb.STBIRKernelCallbackI delegate;

        Container(long r5, org.lwjgl.stb.STBIRKernelCallbackI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.stb.STBIRKernelCallbackI
        public float invoke(float r7, float r8, long r9) {
                r6 = this;
                r0 = r6
                org.lwjgl.stb.STBIRKernelCallbackI r0 = r0.delegate
                r1 = r7
                r2 = r8
                r3 = r9
                float r0 = r0.invoke(r1, r2, r3)
                return r0
        }
    }

    public static org.lwjgl.stb.STBIRKernelCallback create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.stb.STBIRKernelCallbackI r0 = (org.lwjgl.stb.STBIRKernelCallbackI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.stb.STBIRKernelCallback
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.stb.STBIRKernelCallback r0 = (org.lwjgl.stb.STBIRKernelCallback) r0
            goto L1f
        L16:
            org.lwjgl.stb.STBIRKernelCallback$Container r0 = new org.lwjgl.stb.STBIRKernelCallback$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    public static org.lwjgl.stb.STBIRKernelCallback createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.stb.STBIRKernelCallback r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.stb.STBIRKernelCallback create(org.lwjgl.stb.STBIRKernelCallbackI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.stb.STBIRKernelCallback
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.stb.STBIRKernelCallback r0 = (org.lwjgl.stb.STBIRKernelCallback) r0
            goto L1c
        Le:
            org.lwjgl.stb.STBIRKernelCallback$Container r0 = new org.lwjgl.stb.STBIRKernelCallback$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected STBIRKernelCallback() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.Callback$Descriptor r1 = org.lwjgl.stb.STBIRKernelCallback.DESCRIPTOR
            r0.<init>(r1)
            return
    }

    STBIRKernelCallback(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
