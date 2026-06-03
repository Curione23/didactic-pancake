package org.lwjgl.nanovg;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/UIHandler.class */
public abstract class UIHandler extends org.lwjgl.system.Callback implements org.lwjgl.nanovg.UIHandlerI {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/UIHandler$Container.class */
    private static final class Container extends org.lwjgl.nanovg.UIHandler {
        private final org.lwjgl.nanovg.UIHandlerI delegate;

        Container(long r5, org.lwjgl.nanovg.UIHandlerI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.nanovg.UIHandlerI
        public void invoke(int r5, int r6) {
                r4 = this;
                r0 = r4
                org.lwjgl.nanovg.UIHandlerI r0 = r0.delegate
                r1 = r5
                r2 = r6
                r0.invoke(r1, r2)
                return
        }
    }

    public static org.lwjgl.nanovg.UIHandler create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.nanovg.UIHandlerI r0 = (org.lwjgl.nanovg.UIHandlerI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.nanovg.UIHandler
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.nanovg.UIHandler r0 = (org.lwjgl.nanovg.UIHandler) r0
            goto L1f
        L16:
            org.lwjgl.nanovg.UIHandler$Container r0 = new org.lwjgl.nanovg.UIHandler$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.UIHandler createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.nanovg.UIHandler r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.nanovg.UIHandler create(org.lwjgl.nanovg.UIHandlerI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.nanovg.UIHandler
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.nanovg.UIHandler r0 = (org.lwjgl.nanovg.UIHandler) r0
            goto L1c
        Le:
            org.lwjgl.nanovg.UIHandler$Container r0 = new org.lwjgl.nanovg.UIHandler$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected UIHandler() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.nanovg.UIHandler.CIF
            r0.<init>(r1)
            return
    }

    UIHandler(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
