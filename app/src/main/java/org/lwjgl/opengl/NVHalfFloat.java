package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVHalfFloat.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVHalfFloat.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVHalfFloat.class */
public class NVHalfFloat {
    public static final int GL_HALF_FLOAT_NV = 5131;

    protected NVHalfFloat() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glVertex2hNV(@org.lwjgl.system.NativeType("GLhalfNV") short r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1);

    public static native void nglVertex2hvNV(long r0);

    public static void glVertex2hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertex2hvNV(r0)
            return
    }

    public static native void glVertex3hNV(@org.lwjgl.system.NativeType("GLhalfNV") short r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1, @org.lwjgl.system.NativeType("GLhalfNV") short r2);

    public static native void nglVertex3hvNV(long r0);

    public static void glVertex3hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertex3hvNV(r0)
            return
    }

    public static native void glVertex4hNV(@org.lwjgl.system.NativeType("GLhalfNV") short r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1, @org.lwjgl.system.NativeType("GLhalfNV") short r2, @org.lwjgl.system.NativeType("GLhalfNV") short r3);

    public static native void nglVertex4hvNV(long r0);

    public static void glVertex4hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertex4hvNV(r0)
            return
    }

    public static native void glNormal3hNV(@org.lwjgl.system.NativeType("GLhalfNV") short r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1, @org.lwjgl.system.NativeType("GLhalfNV") short r2);

    public static native void nglNormal3hvNV(long r0);

    public static void glNormal3hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglNormal3hvNV(r0)
            return
    }

    public static native void glColor3hNV(@org.lwjgl.system.NativeType("GLhalfNV") short r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1, @org.lwjgl.system.NativeType("GLhalfNV") short r2);

    public static native void nglColor3hvNV(long r0);

    public static void glColor3hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor3hvNV(r0)
            return
    }

    public static native void glColor4hNV(@org.lwjgl.system.NativeType("GLhalfNV") short r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1, @org.lwjgl.system.NativeType("GLhalfNV") short r2, @org.lwjgl.system.NativeType("GLhalfNV") short r3);

    public static native void nglColor4hvNV(long r0);

    public static void glColor4hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglColor4hvNV(r0)
            return
    }

    public static native void glTexCoord1hNV(@org.lwjgl.system.NativeType("GLhalfNV") short r0);

    public static native void nglTexCoord1hvNV(long r0);

    public static void glTexCoord1hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord1hvNV(r0)
            return
    }

    public static native void glTexCoord2hNV(@org.lwjgl.system.NativeType("GLhalfNV") short r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1);

    public static native void nglTexCoord2hvNV(long r0);

    public static void glTexCoord2hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord2hvNV(r0)
            return
    }

    public static native void glTexCoord3hNV(@org.lwjgl.system.NativeType("GLhalfNV") short r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1, @org.lwjgl.system.NativeType("GLhalfNV") short r2);

    public static native void nglTexCoord3hvNV(long r0);

    public static void glTexCoord3hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord3hvNV(r0)
            return
    }

    public static native void glTexCoord4hNV(@org.lwjgl.system.NativeType("GLhalfNV") short r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1, @org.lwjgl.system.NativeType("GLhalfNV") short r2, @org.lwjgl.system.NativeType("GLhalfNV") short r3);

    public static native void nglTexCoord4hvNV(long r0);

    public static void glTexCoord4hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglTexCoord4hvNV(r0)
            return
    }

    public static native void glMultiTexCoord1hNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1);

    public static native void nglMultiTexCoord1hvNV(int r0, long r1);

    public static void glMultiTexCoord1hvNV(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord1hvNV(r0, r1)
            return
    }

    public static native void glMultiTexCoord2hNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1, @org.lwjgl.system.NativeType("GLhalfNV") short r2);

    public static native void nglMultiTexCoord2hvNV(int r0, long r1);

    public static void glMultiTexCoord2hvNV(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord2hvNV(r0, r1)
            return
    }

    public static native void glMultiTexCoord3hNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1, @org.lwjgl.system.NativeType("GLhalfNV") short r2, @org.lwjgl.system.NativeType("GLhalfNV") short r3);

    public static native void nglMultiTexCoord3hvNV(int r0, long r1);

    public static void glMultiTexCoord3hvNV(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord3hvNV(r0, r1)
            return
    }

    public static native void glMultiTexCoord4hNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1, @org.lwjgl.system.NativeType("GLhalfNV") short r2, @org.lwjgl.system.NativeType("GLhalfNV") short r3, @org.lwjgl.system.NativeType("GLhalfNV") short r4);

    public static native void nglMultiTexCoord4hvNV(int r0, long r1);

    public static void glMultiTexCoord4hvNV(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMultiTexCoord4hvNV(r0, r1)
            return
    }

    public static native void glFogCoordhNV(@org.lwjgl.system.NativeType("GLhalfNV") short r0);

    public static native void nglFogCoordhvNV(long r0);

    public static void glFogCoordhvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglFogCoordhvNV(r0)
            return
    }

    public static native void glSecondaryColor3hNV(@org.lwjgl.system.NativeType("GLhalfNV") short r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1, @org.lwjgl.system.NativeType("GLhalfNV") short r2);

    public static native void nglSecondaryColor3hvNV(long r0);

    public static void glSecondaryColor3hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglSecondaryColor3hvNV(r0)
            return
    }

    public static native void glVertexWeighthNV(@org.lwjgl.system.NativeType("GLhalfNV") short r0);

    public static native void nglVertexWeighthvNV(long r0);

    public static void glVertexWeighthvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglVertexWeighthvNV(r0)
            return
    }

    public static native void glVertexAttrib1hNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1);

    public static native void nglVertexAttrib1hvNV(int r0, long r1);

    public static void glVertexAttrib1hvNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib1hvNV(r0, r1)
            return
    }

    public static native void glVertexAttrib2hNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1, @org.lwjgl.system.NativeType("GLhalfNV") short r2);

    public static native void nglVertexAttrib2hvNV(int r0, long r1);

    public static void glVertexAttrib2hvNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib2hvNV(r0, r1)
            return
    }

    public static native void glVertexAttrib3hNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1, @org.lwjgl.system.NativeType("GLhalfNV") short r2, @org.lwjgl.system.NativeType("GLhalfNV") short r3);

    public static native void nglVertexAttrib3hvNV(int r0, long r1);

    public static void glVertexAttrib3hvNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib3hvNV(r0, r1)
            return
    }

    public static native void glVertexAttrib4hNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLhalfNV") short r1, @org.lwjgl.system.NativeType("GLhalfNV") short r2, @org.lwjgl.system.NativeType("GLhalfNV") short r3, @org.lwjgl.system.NativeType("GLhalfNV") short r4);

    public static native void nglVertexAttrib4hvNV(int r0, long r1);

    public static void glVertexAttrib4hvNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttrib4hvNV(r0, r1)
            return
    }

    public static native void nglVertexAttribs1hvNV(int r0, int r1, long r2);

    public static void glVertexAttribs1hvNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglVertexAttribs1hvNV(r0, r1, r2)
            return
    }

    public static native void nglVertexAttribs2hvNV(int r0, int r1, long r2);

    public static void glVertexAttribs2hvNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 1
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglVertexAttribs2hvNV(r0, r1, r2)
            return
    }

    public static native void nglVertexAttribs3hvNV(int r0, int r1, long r2);

    public static void glVertexAttribs3hvNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 3
            int r1 = r1 / r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglVertexAttribs3hvNV(r0, r1, r2)
            return
    }

    public static native void nglVertexAttribs4hvNV(int r0, int r1, long r2);

    public static void glVertexAttribs4hvNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLhalfNV const *") java.nio.ShortBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 2
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglVertexAttribs4hvNV(r0, r1, r2)
            return
    }

    public static void glVertex2hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertex2hvNV
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glVertex3hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertex3hvNV
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glVertex4hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertex4hvNV
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glNormal3hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNormal3hvNV
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glColor3hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColor3hvNV
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glColor4hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glColor4hvNV
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord1hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord1hvNV
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord2hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord2hvNV
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord3hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord3hvNV
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glTexCoord4hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTexCoord4hvNV
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glMultiTexCoord1hvNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLhalfNV const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord1hvNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glMultiTexCoord2hvNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLhalfNV const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord2hvNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glMultiTexCoord3hvNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLhalfNV const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord3hvNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glMultiTexCoord4hvNV(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLhalfNV const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiTexCoord4hvNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glFogCoordhvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glFogCoordhvNV
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glSecondaryColor3hvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSecondaryColor3hvNV
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glVertexWeighthvNV(@org.lwjgl.system.NativeType("GLhalfNV const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexWeighthvNV
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glVertexAttrib1hvNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLhalfNV const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib1hvNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib2hvNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLhalfNV const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib2hvNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib3hvNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLhalfNV const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib3hvNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttrib4hvNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLhalfNV const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttrib4hvNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttribs1hvNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLhalfNV const *") short[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribs1hvNV
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribs2hvNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLhalfNV const *") short[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribs2hvNV
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 1
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribs3hvNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLhalfNV const *") short[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribs3hvNV
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 3
            int r1 = r1 / r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glVertexAttribs4hvNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLhalfNV const *") short[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribs4hvNV
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 2
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
