package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/UNISTD.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/UNISTD.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/UNISTD.class */
public class UNISTD {
    public static final int _SC_OPEN_MAX = 4;
    public static final int _SC_PAGE_SIZE = 30;
    public static final int _SC_IOV_MAX = 60;

    protected UNISTD() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native int close(int r0);

    public static native long sysconf(int r0);

    public static native long nread(int r0, long r1, long r3);

    @org.lwjgl.system.NativeType("ssize_t")
    public static long read(int r6, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r7) {
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r2 = r2.remaining()
            long r2 = (long) r2
            long r0 = nread(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("pid_t")
    public static native int getpid();

    @org.lwjgl.system.NativeType("pid_t")
    public static native int getppid();

    @org.lwjgl.system.NativeType("pid_t")
    public static native int gettid();

    static {
            org.lwjgl.system.Library.initialize()
            return
    }
}
