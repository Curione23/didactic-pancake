package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVDrawVulkanImage.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVDrawVulkanImage.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVDrawVulkanImage.class */
public class NVDrawVulkanImage {
    protected NVDrawVulkanImage() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glDrawVkImageNV(@org.lwjgl.system.NativeType("GLuint64") long r0, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLfloat") float r3, @org.lwjgl.system.NativeType("GLfloat") float r4, @org.lwjgl.system.NativeType("GLfloat") float r5, @org.lwjgl.system.NativeType("GLfloat") float r6, @org.lwjgl.system.NativeType("GLfloat") float r7, @org.lwjgl.system.NativeType("GLfloat") float r8, @org.lwjgl.system.NativeType("GLfloat") float r9, @org.lwjgl.system.NativeType("GLfloat") float r10, @org.lwjgl.system.NativeType("GLfloat") float r11);

    public static native long nglGetVkProcAddrNV(long r0);

    @org.lwjgl.system.NativeType("VULKANPROCNV")
    public static long glGetVkProcAddrNV(@org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            long r0 = nglGetVkProcAddrNV(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VULKANPROCNV")
    public static long glGetVkProcAddrNV(@org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L23
            r0 = r5
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L23
            r7 = r0
            r0 = r7
            long r0 = nglGetVkProcAddrNV(r0)     // Catch: java.lang.Throwable -> L23
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

    public static native void glWaitVkSemaphoreNV(@org.lwjgl.system.NativeType("GLuint64") long r0);

    public static native void glSignalVkSemaphoreNV(@org.lwjgl.system.NativeType("GLuint64") long r0);

    public static native void glSignalVkFenceNV(@org.lwjgl.system.NativeType("GLuint64") long r0);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
