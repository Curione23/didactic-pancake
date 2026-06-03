package org.lwjgl.system.libc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libc/LibCStdlib.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/libc/LibCStdlib.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libc/LibCStdlib.class */
public class LibCStdlib {
    protected LibCStdlib() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native long nmalloc(long r0);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer malloc(@org.lwjgl.system.NativeType("size_t") long r5) {
            r0 = r5
            long r0 = nmalloc(r0)
            r7 = r0
            r0 = r7
            r1 = r5
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native long ncalloc(long r0, long r2);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer calloc(@org.lwjgl.system.NativeType("size_t") long r6, @org.lwjgl.system.NativeType("size_t") long r8) {
            r0 = r6
            r1 = r8
            long r0 = ncalloc(r0, r1)
            r10 = r0
            r0 = r10
            r1 = r6
            int r1 = (int) r1
            r2 = r8
            int r2 = (int) r2
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native long nrealloc(long r0, long r2);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer realloc(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("size_t") long r6) {
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r6
            long r0 = nrealloc(r0, r1)
            r8 = r0
            r0 = r8
            r1 = r6
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native void nfree(long r0);

    public static void free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nfree(r0)
            return
    }

    public static void free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nfree(r0)
            return
    }

    public static void free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nfree(r0)
            return
    }

    public static void free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.LongBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nfree(r0)
            return
    }

    public static void free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nfree(r0)
            return
    }

    public static void free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nfree(r0)
            return
    }

    public static void free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") org.lwjgl.PointerBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            nfree(r0)
            return
    }

    public static native long naligned_alloc(long r0, long r2);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer aligned_alloc(@org.lwjgl.system.NativeType("size_t") long r5, @org.lwjgl.system.NativeType("size_t") long r7) {
            r0 = r5
            r1 = r7
            long r0 = naligned_alloc(r0, r1)
            r9 = r0
            r0 = r9
            r1 = r7
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static native void naligned_free(long r0);

    public static void aligned_free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            naligned_free(r0)
            return
    }

    public static void aligned_free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            naligned_free(r0)
            return
    }

    public static void aligned_free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            naligned_free(r0)
            return
    }

    public static void aligned_free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.LongBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            naligned_free(r0)
            return
    }

    public static void aligned_free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            naligned_free(r0)
            return
    }

    public static void aligned_free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            naligned_free(r0)
            return
    }

    public static void aligned_free(@javax.annotation.Nullable @org.lwjgl.system.NativeType("void *") org.lwjgl.PointerBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            naligned_free(r0)
            return
    }

    static {
            org.lwjgl.system.Library.initialize()
            return
    }
}
