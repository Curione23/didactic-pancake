package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WindowProc.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WindowProc.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WindowProc.class */
public abstract class WindowProc extends org.lwjgl.system.Callback implements org.lwjgl.system.windows.WindowProcI {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WindowProc$Container.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WindowProc$Container.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WindowProc$Container.class */
    private static final class Container extends org.lwjgl.system.windows.WindowProc {
        private final org.lwjgl.system.windows.WindowProcI delegate;

        Container(long r5, org.lwjgl.system.windows.WindowProcI r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.<init>(r1)
                r0 = r4
                r1 = r7
                r0.delegate = r1
                return
        }

        @Override // org.lwjgl.system.windows.WindowProcI
        public long invoke(long r10, int r12, long r13, long r15) {
                r9 = this;
                r0 = r9
                org.lwjgl.system.windows.WindowProcI r0 = r0.delegate
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r15
                long r0 = r0.invoke(r1, r2, r3, r4)
                return r0
        }
    }

    public static org.lwjgl.system.windows.WindowProc create(long r6) {
            r0 = r6
            org.lwjgl.system.CallbackI r0 = org.lwjgl.system.Callback.get(r0)
            org.lwjgl.system.windows.WindowProcI r0 = (org.lwjgl.system.windows.WindowProcI) r0
            r8 = r0
            r0 = r8
            boolean r0 = r0 instanceof org.lwjgl.system.windows.WindowProc
            if (r0 == 0) goto L16
            r0 = r8
            org.lwjgl.system.windows.WindowProc r0 = (org.lwjgl.system.windows.WindowProc) r0
            goto L1f
        L16:
            org.lwjgl.system.windows.WindowProc$Container r0 = new org.lwjgl.system.windows.WindowProc$Container
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L1f:
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.WindowProc createSafe(long r5) {
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto Le
        La:
            r0 = r5
            org.lwjgl.system.windows.WindowProc r0 = create(r0)
        Le:
            return r0
    }

    public static org.lwjgl.system.windows.WindowProc create(org.lwjgl.system.windows.WindowProcI r6) {
            r0 = r6
            boolean r0 = r0 instanceof org.lwjgl.system.windows.WindowProc
            if (r0 == 0) goto Le
            r0 = r6
            org.lwjgl.system.windows.WindowProc r0 = (org.lwjgl.system.windows.WindowProc) r0
            goto L1c
        Le:
            org.lwjgl.system.windows.WindowProc$Container r0 = new org.lwjgl.system.windows.WindowProc$Container
            r1 = r0
            r2 = r6
            long r2 = r2.address()
            r3 = r6
            r1.<init>(r2, r3)
        L1c:
            return r0
    }

    protected WindowProc() {
            r3 = this;
            r0 = r3
            org.lwjgl.system.libffi.FFICIF r1 = org.lwjgl.system.windows.WindowProc.CIF
            r0.<init>(r1)
            return
    }

    WindowProc(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }
}
