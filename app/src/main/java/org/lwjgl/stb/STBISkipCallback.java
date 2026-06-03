package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBISkipCallback.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBISkipCallback.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBISkipCallback.class */
public abstract class STBISkipCallback extends org.lwjgl.system.Callback implements org.lwjgl.stb.STBISkipCallbackI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBISkipCallback$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBISkipCallback$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBISkipCallback$Container.class */
    private static final class Container extends org.lwjgl.stb.STBISkipCallback {
        private final org.lwjgl.stb.STBISkipCallbackI delegate;

        Container(long r5, org.lwjgl.stb.STBISkipCallbackI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.stb.STBISkipCallbackI
        public void invoke(long r6, int r8) {
                r5 = this;
                r0 = r5
                org.lwjgl.stb.STBISkipCallbackI r0 = r0.delegate
                r1 = r6
                r2 = r8
                r0.invoke(r1, r2)
                return
        }
    }

    public static org.lwjgl.stb.STBISkipCallback create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.stb.STBISkipCallbackI r0 = (org.lwjgl.stb.STBISkipCallbackI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.stb.STBISkipCallback
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.stb.STBISkipCallback r0 = (org.lwjgl.stb.STBISkipCallback) r0
            goto L1f
        L16:
            org.lwjgl.stb.STBISkipCallback$Container r0 = new org.lwjgl.stb.STBISkipCallback$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBISkipCallback createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.stb.STBISkipCallback r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.stb.STBISkipCallback create(org.lwjgl.stb.STBISkipCallbackI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.stb.STBISkipCallback
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.stb.STBISkipCallback r0 = (org.lwjgl.stb.STBISkipCallback) r0
            goto L1c
        Le:
            org.lwjgl.stb.STBISkipCallback$Container r0 = new org.lwjgl.stb.STBISkipCallback$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected STBISkipCallback() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.stb.STBISkipCallback.CIF
            r0.<init>(r1)
            return
    }

    STBISkipCallback(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
