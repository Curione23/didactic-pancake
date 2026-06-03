package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/MMAN.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/MMAN.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/MMAN.class */
public class MMAN {
    public static final long MAP_FAILED = -1;
    public static final int PROT_EXEC = 4;
    public static final int PROT_READ = 1;
    public static final int PROT_WRITE = 2;
    public static final int PROT_NONE = 0;
    public static final int PROT_GROWSDOWN = 16777216;
    public static final int PROT_GROWSUP = 33554432;
    public static final int MAP_SHARED = 1;
    public static final int MAP_SHARED_VALIDATE = 3;
    public static final int MAP_PRIVATE = 2;
    public static final int MAP_HUGE_SHIFT = 26;
    public static final int MAP_HUGE_MASK = 63;
    public static final int MAP_32BIT = 64;
    public static final int MAP_ANONYMOUS = 32;
    public static final int MAP_ANON = 32;
    public static final int MAP_DENYWRITE = 2048;
    public static final int MAP_EXECUTABLE = 4096;
    public static final int MAP_FILE = 0;
    public static final int MAP_FIXED = 16;
    public static final int MAP_FIXED_NOREPLACE = 1048576;
    public static final int MAP_GROWSDOWN = 256;
    public static final int MAP_HUGETLB = 262144;
    public static final int MAP_HUGE_2MB = 1409286144;
    public static final int MAP_HUGE_1GB = 2013265920;
    public static final int MAP_LOCKED = 8192;
    public static final int MAP_NONBLOCK = 65536;
    public static final int MAP_NORESERVE = 16384;
    public static final int MAP_POPULATE = 32768;
    public static final int MAP_STACK = 131072;
    public static final int MAP_SYNC = 524288;
    public static final int MAP_UNINITIALIZED = 67108864;

    protected MMAN() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static native long mmap(@org.lwjgl.system.NativeType("void *") long r0, @org.lwjgl.system.NativeType("size_t") long r2, int r4, int r5, int r6, @org.lwjgl.system.NativeType("off_t") long r7);

    public static native int nmunmap(long r0, long r2);

    public static int munmap(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5) {
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            int r1 = r1.remaining()
            long r1 = (long) r1
            int r0 = nmunmap(r0, r1)
            return r0
    }

    static {
            org.lwjgl.system.Library.initialize()
            return
    }
}
