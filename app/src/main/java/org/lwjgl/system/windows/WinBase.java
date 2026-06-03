package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WinBase.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WinBase.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WinBase.class */
public class WinBase {
    public static final int FALSE = 0;
    public static final int TRUE = 1;

    protected WinBase() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native long nLocalFree(long r0);

    @org.lwjgl.system.NativeType("HLOCAL")
    public static long LocalFree(@org.lwjgl.system.NativeType("HLOCAL") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            long r0 = nLocalFree(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public static native int GetLastError();

    @org.lwjgl.system.NativeType("DWORD")
    public static native int getLastError();

    public static native long nGetModuleHandle(long r0);

    @org.lwjgl.system.NativeType("HMODULE")
    public static long GetModuleHandle(@javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCTSTR") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT2Safe(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            long r0 = nGetModuleHandle(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("HMODULE")
    public static long GetModuleHandle(@javax.annotation.Nullable @org.lwjgl.system.NativeType("LPCTSTR") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF16Safe(r1, r2)     // Catch: java.lang.Throwable -> L2b
            r0 = r4
            if (r0 != 0) goto L18
            r0 = 0
            goto L1c
        L18:
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2b
        L1c:
            r7 = r0
            r0 = r7
            long r0 = nGetModuleHandle(r0)     // Catch: java.lang.Throwable -> L2b
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L2b:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native int nGetModuleFileName(long r0, long r2, int r4);

    @org.lwjgl.system.NativeType("DWORD")
    public static int GetModuleFileName(@org.lwjgl.system.NativeType("HMODULE") long r7, @org.lwjgl.system.NativeType("LPTSTR") java.nio.ByteBuffer r9) {
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 >> r3
            int r0 = nGetModuleFileName(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public static java.lang.String GetModuleFileName(@org.lwjgl.system.NativeType("HMODULE") long r6, @org.lwjgl.system.NativeType("DWORD") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = r8
            java.nio.ByteBuffer r0 = r0.malloc(r1)     // Catch: java.lang.Throwable -> L2f
            r11 = r0
            r0 = r6
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L2f
            r2 = r8
            int r0 = nGetModuleFileName(r0, r1, r2)     // Catch: java.lang.Throwable -> L2f
            r12 = r0
            r0 = r11
            r1 = r12
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF16(r0, r1)     // Catch: java.lang.Throwable -> L2f
            r13 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            return r0
        L2f:
            r14 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static native long nLoadLibrary(long r0);

    @org.lwjgl.system.NativeType("HMODULE")
    public static long LoadLibrary(@org.lwjgl.system.NativeType("LPCTSTR") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT2(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            long r0 = nLoadLibrary(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("HMODULE")
    public static long LoadLibrary(@org.lwjgl.system.NativeType("LPCTSTR") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF16(r1, r2)     // Catch: java.lang.Throwable -> L23
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L23
            r7 = r0
            r0 = r7
            long r0 = nLoadLibrary(r0)     // Catch: java.lang.Throwable -> L23
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L23:
            r11 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native long nGetProcAddress(long r0, long r2);

    @org.lwjgl.system.NativeType("FARPROC")
    public static long GetProcAddress(@org.lwjgl.system.NativeType("HMODULE") long r5, @org.lwjgl.system.NativeType("LPCSTR") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        Lf:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = nGetProcAddress(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FARPROC")
    public static long GetProcAddress(@org.lwjgl.system.NativeType("HMODULE") long r5, @org.lwjgl.system.NativeType("LPCSTR") java.lang.CharSequence r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L33
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L33
            r10 = r0
            r0 = r5
            r1 = r10
            long r0 = nGetProcAddress(r0, r1)     // Catch: java.lang.Throwable -> L33
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L33:
            r14 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static native int nFreeLibrary(long r0);

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean FreeLibrary(@org.lwjgl.system.NativeType("HMODULE") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            int r0 = nFreeLibrary(r0)
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    static {
            org.lwjgl.system.Library.initialize()
            return
    }
}
