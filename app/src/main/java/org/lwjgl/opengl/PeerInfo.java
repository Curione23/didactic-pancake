package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/PeerInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/PeerInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/PeerInfo.class */
abstract class PeerInfo {
    private final java.nio.ByteBuffer handle;
    private java.lang.Thread locking_thread;
    private int lock_count;

    protected PeerInfo(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.handle = r1
            return
    }

    private void lockAndInitHandle() throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = r2
            r0.doLockAndInitHandle()
            return
    }

    public final synchronized void unlock() throws org.lwjgl.LWJGLException {
            r5 = this;
            r0 = r5
            int r0 = r0.lock_count
            if (r0 > 0) goto L11
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "PeerInfo not locked!"
            r1.<init>(r2)
            throw r0
        L11:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = r5
            java.lang.Thread r1 = r1.locking_thread
            if (r0 == r1) goto L39
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "PeerInfo already locked by "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.Thread r3 = r3.locking_thread
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L39:
            r0 = r5
            r1 = r0
            int r1 = r1.lock_count
            r2 = 1
            int r1 = r1 - r2
            r0.lock_count = r1
            r0 = r5
            int r0 = r0.lock_count
            if (r0 != 0) goto L57
            r0 = r5
            r0.doUnlock()
            r0 = r5
            r1 = 0
            r0.locking_thread = r1
            r0 = r5
            r0.notify()
        L57:
            return
    }

    protected abstract void doLockAndInitHandle() throws org.lwjgl.LWJGLException;

    protected abstract void doUnlock() throws org.lwjgl.LWJGLException;

    public final synchronized java.nio.ByteBuffer lockAndGetHandle() throws org.lwjgl.LWJGLException {
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r5 = r0
        L4:
            r0 = r4
            java.lang.Thread r0 = r0.locking_thread
            if (r0 == 0) goto L34
            r0 = r4
            java.lang.Thread r0 = r0.locking_thread
            r1 = r5
            if (r0 == r1) goto L34
            r0 = r4
            r0.wait()     // Catch: java.lang.InterruptedException -> L1a
            goto L4
        L1a:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Interrupted while waiting for PeerInfo lock: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.LWJGLUtil.log(r0)
            goto L4
        L34:
            r0 = r4
            int r0 = r0.lock_count
            if (r0 != 0) goto L44
            r0 = r4
            r1 = r5
            r0.locking_thread = r1
            r0 = r4
            r0.doLockAndInitHandle()
        L44:
            r0 = r4
            r1 = r0
            int r1 = r1.lock_count
            r2 = 1
            int r1 = r1 + r2
            r0.lock_count = r1
            r0 = r4
            java.nio.ByteBuffer r0 = r0.getHandle()
            return r0
    }

    protected final java.nio.ByteBuffer getHandle() {
            r2 = this;
            r0 = r2
            java.nio.ByteBuffer r0 = r0.handle
            return r0
    }

    public void destroy() {
            r1 = this;
            return
    }
}
