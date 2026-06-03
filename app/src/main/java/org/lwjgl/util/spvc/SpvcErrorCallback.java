package org.lwjgl.util.spvc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcErrorCallback.class */
public abstract class SpvcErrorCallback extends org.lwjgl.system.Callback implements org.lwjgl.util.spvc.SpvcErrorCallbackI {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/spvc/SpvcErrorCallback$Container.class */
    private static final class Container extends org.lwjgl.util.spvc.SpvcErrorCallback {
        private final org.lwjgl.util.spvc.SpvcErrorCallbackI delegate;

        Container(long r5, org.lwjgl.util.spvc.SpvcErrorCallbackI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.util.spvc.SpvcErrorCallbackI
        public void invoke(long r7, long r9) {
                r6 = this;
                r0 = r6
                org.lwjgl.util.spvc.SpvcErrorCallbackI r0 = r0.delegate
                r1 = r7
                r2 = r9
                r0.invoke(r1, r2)
                return
        }
    }

    public static org.lwjgl.util.spvc.SpvcErrorCallback create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.util.spvc.SpvcErrorCallbackI r0 = (org.lwjgl.util.spvc.SpvcErrorCallbackI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.util.spvc.SpvcErrorCallback
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.util.spvc.SpvcErrorCallback r0 = (org.lwjgl.util.spvc.SpvcErrorCallback) r0
            goto L1f
        L16:
            org.lwjgl.util.spvc.SpvcErrorCallback$Container r0 = new org.lwjgl.util.spvc.SpvcErrorCallback$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcErrorCallback createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.util.spvc.SpvcErrorCallback r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.util.spvc.SpvcErrorCallback create(org.lwjgl.util.spvc.SpvcErrorCallbackI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.util.spvc.SpvcErrorCallback
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.util.spvc.SpvcErrorCallback r0 = (org.lwjgl.util.spvc.SpvcErrorCallback) r0
            goto L1c
        Le:
            org.lwjgl.util.spvc.SpvcErrorCallback$Container r0 = new org.lwjgl.util.spvc.SpvcErrorCallback$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected SpvcErrorCallback() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.Callback$Descriptor r1 = org.lwjgl.util.spvc.SpvcErrorCallback.DESCRIPTOR
            r0.<init>(r1)
            return
    }

    SpvcErrorCallback(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }

    public static java.lang.String getError(long r3) {
            r0 = r3
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }
}
