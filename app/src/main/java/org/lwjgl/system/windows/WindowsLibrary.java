package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WindowsLibrary.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WindowsLibrary.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/WindowsLibrary.class */
public class WindowsLibrary extends org.lwjgl.system.SharedLibrary.Default {
    public static final long HINSTANCE = 0;

    public WindowsLibrary(java.lang.String r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r6
            long r2 = loadLibrary(r2)
            r0.<init>(r1, r2)
            return
    }

    public WindowsLibrary(java.lang.String r6, long r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2)
            return
    }

    private static long loadLibrary(java.lang.String r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            r1 = r5
            java.nio.ByteBuffer r0 = r0.UTF16(r1)     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L3c
            long r0 = org.lwjgl.system.windows.WinBase.LoadLibrary(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L3c
            r6 = r0
            r0 = r8
            if (r0 == 0) goto L61
            r0 = r9
            if (r0 == 0) goto L2c
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L20
            goto L61
        L20:
            r10 = move-exception
            r0 = r9
            r1 = r10
            r0.addSuppressed(r1)
            goto L61
        L2c:
            r0 = r8
            r0.close()
            goto L61
        L33:
            r10 = move-exception
            r0 = r10
            r9 = r0
            r0 = r10
            throw r0     // Catch: java.lang.Throwable -> L3c
        L3c:
            r11 = move-exception
            r0 = r8
            if (r0 == 0) goto L5e
            r0 = r9
            if (r0 == 0) goto L5a
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L4e
            goto L5e
        L4e:
            r12 = move-exception
            r0 = r9
            r1 = r12
            r0.addSuppressed(r1)
            goto L5e
        L5a:
            r0 = r8
            r0.close()
        L5e:
            r0 = r11
            throw r0
        L61:
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L92
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Failed to load library: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " (error code = "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = org.lwjgl.system.windows.WinBase.getLastError()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ")"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L92:
            r0 = r6
            return r0
    }

    @Override // org.lwjgl.system.SharedLibrary
    @javax.annotation.Nullable
    public java.lang.String getPath() {
            r4 = this;
            r0 = 256(0x100, float:3.59E-43)
            r5 = r0
            r0 = r5
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memAlloc(r0)
            r6 = r0
        L9:
            r0 = r4
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L52
            r1 = r6
            int r0 = org.lwjgl.system.windows.WinBase.GetModuleFileName(r0, r1)     // Catch: java.lang.Throwable -> L52
            r7 = r0
            int r0 = org.lwjgl.system.windows.WinBase.getLastError()     // Catch: java.lang.Throwable -> L52
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L32
            r0 = r7
            if (r0 != 0) goto L24
            r0 = 0
            goto L29
        L24:
            r0 = r6
            r1 = r7
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF16(r0, r1)     // Catch: java.lang.Throwable -> L52
        L29:
            r9 = r0
            r0 = r6
            org.lwjgl.system.MemoryUtil.memFree(r0)
            r0 = r9
            return r0
        L32:
            r0 = r8
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 == r1) goto L43
            r0 = 0
            r9 = r0
            r0 = r6
            org.lwjgl.system.MemoryUtil.memFree(r0)
            r0 = r9
            return r0
        L43:
            r0 = r6
            r1 = r5
            r2 = 3
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 / r2
            r2 = r1
            r5 = r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memRealloc(r0, r1)     // Catch: java.lang.Throwable -> L52
            r6 = r0
            goto L9
        L52:
            r10 = move-exception
            r0 = r6
            org.lwjgl.system.MemoryUtil.memFree(r0)
            r0 = r10
            throw r0
    }

    @Override // org.lwjgl.system.FunctionProvider
    public long getFunctionAddress(java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            long r0 = org.lwjgl.system.windows.WinBase.GetProcAddress(r0, r1)
            return r0
    }

    @Override // org.lwjgl.system.NativeResource
    public void free() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = org.lwjgl.system.windows.WinBase.FreeLibrary(r0)
            if (r0 != 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Failed to unload library: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.windows.WindowsUtil.windowsThrowException(r0)
        L23:
            return
    }

    static {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            java.lang.String r1 = org.lwjgl.system.Library.JNI_LIBRARY_NAME     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L49
            java.nio.ByteBuffer r0 = r0.UTF16(r1)     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L49
            long r0 = org.lwjgl.system.windows.WinBase.GetModuleHandle(r0)     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L49
            org.lwjgl.system.windows.WindowsLibrary.HINSTANCE = r0     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L49
            long r0 = org.lwjgl.system.windows.WindowsLibrary.HINSTANCE     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L49
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L25
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L49
            r1 = r0
            java.lang.String r2 = "Failed to retrieve LWJGL module handle."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L49
            throw r0     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L49
        L25:
            r0 = r5
            if (r0 == 0) goto L6a
            r0 = r6
            if (r0 == 0) goto L3d
            r0 = r5
            r0.close()     // Catch: java.lang.Throwable -> L34
            goto L6a
        L34:
            r7 = move-exception
            r0 = r6
            r1 = r7
            r0.addSuppressed(r1)
            goto L6a
        L3d:
            r0 = r5
            r0.close()
            goto L6a
        L44:
            r7 = move-exception
            r0 = r7
            r6 = r0
            r0 = r7
            throw r0     // Catch: java.lang.Throwable -> L49
        L49:
            r8 = move-exception
            r0 = r5
            if (r0 == 0) goto L68
            r0 = r6
            if (r0 == 0) goto L64
            r0 = r5
            r0.close()     // Catch: java.lang.Throwable -> L59
            goto L68
        L59:
            r9 = move-exception
            r0 = r6
            r1 = r9
            r0.addSuppressed(r1)
            goto L68
        L64:
            r0 = r5
            r0.close()
        L68:
            r0 = r8
            throw r0
        L6a:
            return
    }
}
