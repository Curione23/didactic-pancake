package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryAccessJNI.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryAccessJNI.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/MemoryAccessJNI.class */
final class MemoryAccessJNI {
    static final long malloc = 0;
    static final long calloc = 0;
    static final long realloc = 0;
    static final long free = 0;
    static final long aligned_alloc = 0;
    static final long aligned_free = 0;

    private MemoryAccessJNI() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    static native int getPointerSize();

    @org.lwjgl.system.NativeType("void * (*) (size_t)")
    private static native long malloc();

    @org.lwjgl.system.NativeType("void * (*) (size_t, size_t)")
    private static native long calloc();

    @org.lwjgl.system.NativeType("void * (*) (void *, size_t)")
    private static native long realloc();

    @org.lwjgl.system.NativeType("void (*) (void *)")
    private static native long free();

    @org.lwjgl.system.NativeType("void * (*) (size_t, size_t)")
    private static native long aligned_alloc();

    @org.lwjgl.system.NativeType("void (*) (void *)")
    private static native long aligned_free();

    static native byte ngetByte(long r0);

    @org.lwjgl.system.NativeType("int8_t")
    static byte getByte(@org.lwjgl.system.NativeType("void *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            byte r0 = ngetByte(r0)
            return r0
    }

    static native short ngetShort(long r0);

    @org.lwjgl.system.NativeType("int16_t")
    static short getShort(@org.lwjgl.system.NativeType("void *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            short r0 = ngetShort(r0)
            return r0
    }

    static native int ngetInt(long r0);

    @org.lwjgl.system.NativeType("int32_t")
    static int getInt(@org.lwjgl.system.NativeType("void *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            int r0 = ngetInt(r0)
            return r0
    }

    static native long ngetLong(long r0);

    @org.lwjgl.system.NativeType("int64_t")
    static long getLong(@org.lwjgl.system.NativeType("void *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            long r0 = ngetLong(r0)
            return r0
    }

    static native float ngetFloat(long r0);

    static float getFloat(@org.lwjgl.system.NativeType("void *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            float r0 = ngetFloat(r0)
            return r0
    }

    static native double ngetDouble(long r0);

    static double getDouble(@org.lwjgl.system.NativeType("void *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            double r0 = ngetDouble(r0)
            return r0
    }

    static native long ngetAddress(long r0);

    @org.lwjgl.system.NativeType("uintptr_t")
    static long getAddress(@org.lwjgl.system.NativeType("void *") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            long r0 = ngetAddress(r0)
            return r0
    }

    static native void nputByte(long r0, byte r2);

    static void putByte(@org.lwjgl.system.NativeType("void *") long r4, @org.lwjgl.system.NativeType("int8_t") byte r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nputByte(r0, r1)
            return
    }

    static native void nputShort(long r0, short r2);

    static void putShort(@org.lwjgl.system.NativeType("void *") long r4, @org.lwjgl.system.NativeType("int16_t") short r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nputShort(r0, r1)
            return
    }

    static native void nputInt(long r0, int r2);

    static void putInt(@org.lwjgl.system.NativeType("void *") long r4, @org.lwjgl.system.NativeType("int32_t") int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nputInt(r0, r1)
            return
    }

    static native void nputLong(long r0, long r2);

    static void putLong(@org.lwjgl.system.NativeType("void *") long r5, @org.lwjgl.system.NativeType("int64_t") long r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            nputLong(r0, r1)
            return
    }

    static native void nputFloat(long r0, float r2);

    static void putFloat(@org.lwjgl.system.NativeType("void *") long r4, float r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nputFloat(r0, r1)
            return
    }

    static native void nputDouble(long r0, double r2);

    static void putDouble(@org.lwjgl.system.NativeType("void *") long r5, double r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            nputDouble(r0, r1)
            return
    }

    static native void nputAddress(long r0, long r2);

    static void putAddress(@org.lwjgl.system.NativeType("void *") long r5, @org.lwjgl.system.NativeType("uintptr_t") long r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            nputAddress(r0, r1)
            return
    }

    static {
            org.lwjgl.system.Library.initialize()
            long r0 = malloc()
            org.lwjgl.system.MemoryAccessJNI.malloc = r0
            long r0 = calloc()
            org.lwjgl.system.MemoryAccessJNI.calloc = r0
            long r0 = realloc()
            org.lwjgl.system.MemoryAccessJNI.realloc = r0
            long r0 = free()
            org.lwjgl.system.MemoryAccessJNI.free = r0
            long r0 = aligned_alloc()
            org.lwjgl.system.MemoryAccessJNI.aligned_alloc = r0
            long r0 = aligned_free()
            org.lwjgl.system.MemoryAccessJNI.aligned_free = r0
            return
    }
}
