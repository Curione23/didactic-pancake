package org.lwjgl.system.libc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libc/LibCStdio.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/libc/LibCStdio.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libc/LibCStdio.class */
public class LibCStdio {
    public static final long sscanf = 0;
    public static final long snprintf = 0;

    protected LibCStdio() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("void *")
    private static native long sscanf();

    public static native int nvsscanf(long r0, long r2, long r4);

    public static int vsscanf(@org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("va_list") long r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r8
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r0 = nvsscanf(r0, r1, r2)
            return r0
    }

    public static int vsscanf(@org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r7, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r8, @org.lwjgl.system.NativeType("va_list") long r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L49
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L49
            r13 = r0
            r0 = r11
            r1 = r8
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L49
            r0 = r11
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L49
            r15 = r0
            r0 = r13
            r1 = r15
            r2 = r9
            int r0 = nvsscanf(r0, r1, r2)     // Catch: java.lang.Throwable -> L49
            r17 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r17
            return r0
        L49:
            r18 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    @org.lwjgl.system.NativeType("void *")
    private static native long snprintf();

    public static native int nvsnprintf(long r0, long r2, long r4, long r6);

    public static int vsnprintf(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("va_list") long r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lf:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r9
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            long r1 = (long) r1
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            int r0 = nvsnprintf(r0, r1, r2, r3)
            return r0
    }

    public static int vsnprintf(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r10, @org.lwjgl.system.NativeType("va_list") long r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r10
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L41
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L41
            r15 = r0
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)     // Catch: java.lang.Throwable -> L41
            r1 = r9
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)     // Catch: java.lang.Throwable -> L41
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L41
            r2 = r15
            r3 = r11
            int r0 = nvsnprintf(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L41
            r17 = r0
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r17
            return r0
        L41:
            r18 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    static {
            org.lwjgl.system.Library.initialize()
            long r0 = sscanf()
            org.lwjgl.system.libc.LibCStdio.sscanf = r0
            long r0 = snprintf()
            org.lwjgl.system.libc.LibCStdio.snprintf = r0
            return
    }
}
