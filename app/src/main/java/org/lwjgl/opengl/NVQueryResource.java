package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVQueryResource.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVQueryResource.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVQueryResource.class */
public class NVQueryResource {
    public static final int GL_QUERY_RESOURCE_TYPE_VIDMEM_ALLOC_NV = 38208;
    public static final int GL_QUERY_RESOURCE_MEMTYPE_VIDMEM_NV = 38210;
    public static final int GL_QUERY_RESOURCE_SYS_RESERVED_NV = 38212;
    public static final int GL_QUERY_RESOURCE_TEXTURE_NV = 38213;
    public static final int GL_QUERY_RESOURCE_RENDERBUFFER_NV = 38214;
    public static final int GL_QUERY_RESOURCE_BUFFEROBJECT_NV = 38215;

    protected NVQueryResource() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native int nglQueryResourceNV(int r0, int r1, int r2, long r3);

    @org.lwjgl.system.NativeType("GLint")
    public static int glQueryResourceNV(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nglQueryResourceNV(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glQueryResourceNV(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glQueryResourceNV
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r8
            r2 = r9
            int r2 = r2.length
            r3 = r9
            r4 = r10
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2, r3, r4)
            return r0
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
