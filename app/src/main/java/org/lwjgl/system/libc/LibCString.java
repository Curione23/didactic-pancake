package org.lwjgl.system.libc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libc/LibCString.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/libc/LibCString.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libc/LibCString.class */
public class LibCString {
    protected LibCString() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native long nmemset(long r0, int r2, long r3);

    @org.lwjgl.system.NativeType("void *")
    public static long memset(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r6, int r7) {
            r0 = r6
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            r2 = r6
            int r2 = r2.remaining()
            long r2 = (long) r2
            long r0 = nmemset(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long memset(@org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r7, int r8) {
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            r2 = r7
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            long r0 = nmemset(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long memset(@org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r7, int r8) {
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            r2 = r7
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            long r0 = nmemset(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long memset(@org.lwjgl.system.NativeType("void *") java.nio.LongBuffer r7, int r8) {
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            r2 = r7
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            long r0 = nmemset(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long memset(@org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r7, int r8) {
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            r2 = r7
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            long r0 = nmemset(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long memset(@org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r7, int r8) {
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            r2 = r7
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            long r0 = nmemset(r0, r1, r2)
            return r0
    }

    public static native long nmemcpy(long r0, long r2, long r4);

    @org.lwjgl.system.NativeType("void *")
    public static long memcpy(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            int r2 = r2.remaining()
            long r2 = (long) r2
            long r0 = nmemcpy(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long memcpy(@org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r8, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            long r0 = nmemcpy(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long memcpy(@org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            long r0 = nmemcpy(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long memcpy(@org.lwjgl.system.NativeType("void *") java.nio.LongBuffer r8, @org.lwjgl.system.NativeType("void const *") java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            long r0 = nmemcpy(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long memcpy(@org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r8, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            long r0 = nmemcpy(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long memcpy(@org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r8, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            long r0 = nmemcpy(r0, r1, r2)
            return r0
    }

    public static native long nmemmove(long r0, long r2, long r4);

    @org.lwjgl.system.NativeType("void *")
    public static long memmove(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r8
            int r2 = r2.remaining()
            long r2 = (long) r2
            long r0 = nmemmove(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long memmove(@org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r8, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            long r0 = nmemmove(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long memmove(@org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            long r0 = nmemmove(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long memmove(@org.lwjgl.system.NativeType("void *") java.nio.LongBuffer r8, @org.lwjgl.system.NativeType("void const *") java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            long r0 = nmemmove(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long memmove(@org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r8, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            long r0 = nmemmove(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long memmove(@org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r8, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            long r0 = nmemmove(r0, r1, r2)
            return r0
    }

    public static native long nstrlen(long r0);

    @org.lwjgl.system.NativeType("size_t")
    public static long strlen(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            long r0 = nstrlen(r0)
            return r0
    }

    public static native long nstrerror(int r0);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char *")
    public static java.lang.String strerror(int r3) {
            r0 = r3
            long r0 = nstrerror(r0)
            r4 = r0
            r0 = r4
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    public static native long nmemset(byte[] r0, int r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memset(@org.lwjgl.system.NativeType("void *") byte[] r6, int r7) {
            r0 = r6
            r1 = r7
            r2 = r6
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 0
            long r2 = r2 << r3
            long r0 = nmemset(r0, r1, r2)
            return r0
    }

    public static native long nmemset(short[] r0, int r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memset(@org.lwjgl.system.NativeType("void *") short[] r6, int r7) {
            r0 = r6
            r1 = r7
            r2 = r6
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            long r0 = nmemset(r0, r1, r2)
            return r0
    }

    public static native long nmemset(int[] r0, int r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memset(@org.lwjgl.system.NativeType("void *") int[] r6, int r7) {
            r0 = r6
            r1 = r7
            r2 = r6
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            long r0 = nmemset(r0, r1, r2)
            return r0
    }

    public static native long nmemset(long[] r0, int r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memset(@org.lwjgl.system.NativeType("void *") long[] r6, int r7) {
            r0 = r6
            r1 = r7
            r2 = r6
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            long r0 = nmemset(r0, r1, r2)
            return r0
    }

    public static native long nmemset(float[] r0, int r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memset(@org.lwjgl.system.NativeType("void *") float[] r6, int r7) {
            r0 = r6
            r1 = r7
            r2 = r6
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            long r0 = nmemset(r0, r1, r2)
            return r0
    }

    public static native long nmemset(double[] r0, int r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memset(@org.lwjgl.system.NativeType("void *") double[] r6, int r7) {
            r0 = r6
            r1 = r7
            r2 = r6
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            long r0 = nmemset(r0, r1, r2)
            return r0
    }

    public static native long nmemcpy(byte[] r0, byte[] r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memcpy(@org.lwjgl.system.NativeType("void *") byte[] r6, @org.lwjgl.system.NativeType("void const *") byte[] r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = r7
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r6
            r1 = r7
            r2 = r7
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 0
            long r2 = r2 << r3
            long r0 = nmemcpy(r0, r1, r2)
            return r0
    }

    public static native long nmemcpy(short[] r0, short[] r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memcpy(@org.lwjgl.system.NativeType("void *") short[] r6, @org.lwjgl.system.NativeType("void const *") short[] r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = r7
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r6
            r1 = r7
            r2 = r7
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            long r0 = nmemcpy(r0, r1, r2)
            return r0
    }

    public static native long nmemcpy(int[] r0, int[] r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memcpy(@org.lwjgl.system.NativeType("void *") int[] r6, @org.lwjgl.system.NativeType("void const *") int[] r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = r7
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r6
            r1 = r7
            r2 = r7
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            long r0 = nmemcpy(r0, r1, r2)
            return r0
    }

    public static native long nmemcpy(long[] r0, long[] r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memcpy(@org.lwjgl.system.NativeType("void *") long[] r6, @org.lwjgl.system.NativeType("void const *") long[] r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = r7
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r6
            r1 = r7
            r2 = r7
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            long r0 = nmemcpy(r0, r1, r2)
            return r0
    }

    public static native long nmemcpy(float[] r0, float[] r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memcpy(@org.lwjgl.system.NativeType("void *") float[] r6, @org.lwjgl.system.NativeType("void const *") float[] r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = r7
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r6
            r1 = r7
            r2 = r7
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            long r0 = nmemcpy(r0, r1, r2)
            return r0
    }

    public static native long nmemcpy(double[] r0, double[] r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memcpy(@org.lwjgl.system.NativeType("void *") double[] r6, @org.lwjgl.system.NativeType("void const *") double[] r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = r7
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r6
            r1 = r7
            r2 = r7
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            long r0 = nmemcpy(r0, r1, r2)
            return r0
    }

    public static native long nmemmove(byte[] r0, byte[] r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memmove(@org.lwjgl.system.NativeType("void *") byte[] r6, @org.lwjgl.system.NativeType("void const *") byte[] r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = r7
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r6
            r1 = r7
            r2 = r7
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 0
            long r2 = r2 << r3
            long r0 = nmemmove(r0, r1, r2)
            return r0
    }

    public static native long nmemmove(short[] r0, short[] r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memmove(@org.lwjgl.system.NativeType("void *") short[] r6, @org.lwjgl.system.NativeType("void const *") short[] r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = r7
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r6
            r1 = r7
            r2 = r7
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 1
            long r2 = r2 << r3
            long r0 = nmemmove(r0, r1, r2)
            return r0
    }

    public static native long nmemmove(int[] r0, int[] r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memmove(@org.lwjgl.system.NativeType("void *") int[] r6, @org.lwjgl.system.NativeType("void const *") int[] r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = r7
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r6
            r1 = r7
            r2 = r7
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            long r0 = nmemmove(r0, r1, r2)
            return r0
    }

    public static native long nmemmove(long[] r0, long[] r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memmove(@org.lwjgl.system.NativeType("void *") long[] r6, @org.lwjgl.system.NativeType("void const *") long[] r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = r7
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r6
            r1 = r7
            r2 = r7
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            long r0 = nmemmove(r0, r1, r2)
            return r0
    }

    public static native long nmemmove(float[] r0, float[] r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memmove(@org.lwjgl.system.NativeType("void *") float[] r6, @org.lwjgl.system.NativeType("void const *") float[] r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = r7
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r6
            r1 = r7
            r2 = r7
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 2
            long r2 = r2 << r3
            long r0 = nmemmove(r0, r1, r2)
            return r0
    }

    public static native long nmemmove(double[] r0, double[] r1, long r2);

    @org.lwjgl.system.NativeType("void *")
    public static long memmove(@org.lwjgl.system.NativeType("void *") double[] r6, @org.lwjgl.system.NativeType("void const *") double[] r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r6
            r1 = r7
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r6
            r1 = r7
            r2 = r7
            int r2 = r2.length
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = 3
            long r2 = r2 << r3
            long r0 = nmemmove(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static <T extends org.lwjgl.system.CustomBuffer<T>> long memset(@org.lwjgl.system.NativeType("void *") T r8, @org.lwjgl.system.NativeType("int") int r9) {
            r0 = r8
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r9
            r2 = r8
            int r2 = r2.remaining()
            long r2 = java.lang.Integer.toUnsignedLong(r2)
            r3 = r8
            int r3 = r3.sizeof()
            long r3 = (long) r3
            long r2 = r2 * r3
            long r0 = nmemset(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static <T extends org.lwjgl.system.CustomBuffer<T>> long memcpy(@org.lwjgl.system.NativeType("void *") T r9, @org.lwjgl.system.NativeType("void const *") T r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r10
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r10
            int r3 = r3.sizeof()
            long r3 = (long) r3
            long r2 = r2 * r3
            long r0 = nmemcpy(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static <T extends org.lwjgl.system.CustomBuffer<T>> long memmove(@org.lwjgl.system.NativeType("void *") T r9, @org.lwjgl.system.NativeType("void const *") T r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r10
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            int r2 = r2.remaining()
            long r2 = (long) r2
            r3 = r10
            int r3 = r3.sizeof()
            long r3 = (long) r3
            long r2 = r2 * r3
            long r0 = nmemmove(r0, r1, r2)
            return r0
    }

    static {
            org.lwjgl.system.Library.initialize()
            return
    }
}
