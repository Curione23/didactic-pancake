package org.lwjgl.system.libc;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libc/LibCLocale.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/libc/LibCLocale.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libc/LibCLocale.class */
public class LibCLocale {
    public static final int LC_ALL = 0;
    public static final int LC_COLLATE = 0;
    public static final int LC_CTYPE = 0;
    public static final int LC_MONETARY = 0;
    public static final int LC_NUMERIC = 0;
    public static final int LC_TIME = 0;

    protected LibCLocale() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    private static native int LC_ALL();

    private static native int LC_COLLATE();

    private static native int LC_CTYPE();

    private static native int LC_MONETARY();

    private static native int LC_NUMERIC();

    private static native int LC_TIME();

    public static native long nsetlocale(int r0, long r1);

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char *")
    public static java.lang.String setlocale(int r4, @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r5
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = nsetlocale(r0, r1)
            r6 = r0
            r0 = r6
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char *")
    public static java.lang.String setlocale(int r4, @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = r5
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L2d
            r0 = r6
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2d
            r8 = r0
            r0 = r4
            r1 = r8
            long r0 = nsetlocale(r0, r1)     // Catch: java.lang.Throwable -> L2d
            r10 = r0
            r0 = r10
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    static {
            org.lwjgl.system.Library.initialize()
            int r0 = LC_ALL()
            org.lwjgl.system.libc.LibCLocale.LC_ALL = r0
            int r0 = LC_COLLATE()
            org.lwjgl.system.libc.LibCLocale.LC_COLLATE = r0
            int r0 = LC_CTYPE()
            org.lwjgl.system.libc.LibCLocale.LC_CTYPE = r0
            int r0 = LC_MONETARY()
            org.lwjgl.system.libc.LibCLocale.LC_MONETARY = r0
            int r0 = LC_NUMERIC()
            org.lwjgl.system.libc.LibCLocale.LC_NUMERIC = r0
            int r0 = LC_TIME()
            org.lwjgl.system.libc.LibCLocale.LC_TIME = r0
            return
    }
}
