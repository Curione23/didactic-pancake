package org.lwjgl.system.freebsd;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/freebsd/FreeBSDLibrary.class */
public class FreeBSDLibrary extends org.lwjgl.system.SharedLibrary.Default {
    public FreeBSDLibrary(java.lang.String r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r6
            long r2 = loadLibrary(r2)
            r0.<init>(r1, r2)
            return
    }

    public FreeBSDLibrary(java.lang.String r6, long r7) {
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
            java.nio.ByteBuffer r0 = r0.UTF8(r1)     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L3d
            r1 = 1
            long r0 = org.lwjgl.system.freebsd.DynamicLinkLoader.dlopen(r0, r1)     // Catch: java.lang.Throwable -> L34 java.lang.Throwable -> L3d
            r6 = r0
            r0 = r8
            if (r0 == 0) goto L62
            r0 = r9
            if (r0 == 0) goto L2d
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L21
            goto L62
        L21:
            r10 = move-exception
            r0 = r9
            r1 = r10
            r0.addSuppressed(r1)
            goto L62
        L2d:
            r0 = r8
            r0.close()
            goto L62
        L34:
            r10 = move-exception
            r0 = r10
            r9 = r0
            r0 = r10
            throw r0     // Catch: java.lang.Throwable -> L3d
        L3d:
            r11 = move-exception
            r0 = r8
            if (r0 == 0) goto L5f
            r0 = r9
            if (r0 == 0) goto L5b
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L4f
            goto L5f
        L4f:
            r12 = move-exception
            r0 = r9
            r1 = r12
            r0.addSuppressed(r1)
            goto L5f
        L5b:
            r0 = r8
            r0.close()
        L5f:
            r0 = r11
            throw r0
        L62:
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L93
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Failed to dynamically load library: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "(error = "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = org.lwjgl.system.freebsd.DynamicLinkLoader.dlerror()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ")"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L93:
            r0 = r6
            return r0
    }

    @Override // org.lwjgl.system.SharedLibrary
    public java.lang.String getPath() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = org.lwjgl.system.SharedLibraryUtil.getLibraryPath(r0)
            return r0
    }

    @Override // org.lwjgl.system.FunctionProvider
    public long getFunctionAddress(java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            long r0 = org.lwjgl.system.freebsd.DynamicLinkLoader.dlsym(r0, r1)
            return r0
    }

    @Override // org.lwjgl.system.NativeResource
    public void free() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = org.lwjgl.system.freebsd.DynamicLinkLoader.dlclose(r0)
            return
    }
}
