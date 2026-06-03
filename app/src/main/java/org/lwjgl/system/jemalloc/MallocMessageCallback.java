package org.lwjgl.system.jemalloc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/MallocMessageCallback.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/MallocMessageCallback.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/MallocMessageCallback.class */
public abstract class MallocMessageCallback extends org.lwjgl.system.Callback implements org.lwjgl.system.jemalloc.MallocMessageCallbackI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/MallocMessageCallback$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/MallocMessageCallback$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/jemalloc/MallocMessageCallback$Container.class */
    private static final class Container extends org.lwjgl.system.jemalloc.MallocMessageCallback {
        private final org.lwjgl.system.jemalloc.MallocMessageCallbackI delegate;

        Container(long r5, org.lwjgl.system.jemalloc.MallocMessageCallbackI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.system.jemalloc.MallocMessageCallbackI
        public void invoke(long r7, long r9) {
                r6 = this;
                r0 = r6
                org.lwjgl.system.jemalloc.MallocMessageCallbackI r0 = r0.delegate
                r1 = r7
                r2 = r9
                r0.invoke(r1, r2)
                return
        }
    }

    public static org.lwjgl.system.jemalloc.MallocMessageCallback create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.system.jemalloc.MallocMessageCallbackI r0 = (org.lwjgl.system.jemalloc.MallocMessageCallbackI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.system.jemalloc.MallocMessageCallback
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.system.jemalloc.MallocMessageCallback r0 = (org.lwjgl.system.jemalloc.MallocMessageCallback) r0
            goto L1f
        L16:
            org.lwjgl.system.jemalloc.MallocMessageCallback$Container r0 = new org.lwjgl.system.jemalloc.MallocMessageCallback$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.jemalloc.MallocMessageCallback createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.system.jemalloc.MallocMessageCallback r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.system.jemalloc.MallocMessageCallback create(org.lwjgl.system.jemalloc.MallocMessageCallbackI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.system.jemalloc.MallocMessageCallback
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.system.jemalloc.MallocMessageCallback r0 = (org.lwjgl.system.jemalloc.MallocMessageCallback) r0
            goto L1c
        Le:
            org.lwjgl.system.jemalloc.MallocMessageCallback$Container r0 = new org.lwjgl.system.jemalloc.MallocMessageCallback$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected MallocMessageCallback() {
            r3 = this;
            r0 = r3
            java.lang.String r1 = "(pp)v"
            r0.<init>(r1)
            return
    }

    MallocMessageCallback(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }

    public static java.lang.String getMessage(long r3) {
            r0 = r3
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0)
            return r0
    }
}
