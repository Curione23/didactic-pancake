package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/EXTStaticBuffer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/EXTStaticBuffer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/EXTStaticBuffer.class */
public class EXTStaticBuffer {
    protected EXTStaticBuffer() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nalBufferDataStatic(int r9, int r10, long r11, int r13, int r14) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferDataStatic
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferDataStatic(@org.lwjgl.system.NativeType("ALint") int r7, @org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALvoid *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("ALsizei") int r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            int r3 = r3.remaining()
            r4 = r10
            nalBufferDataStatic(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferDataStatic(@org.lwjgl.system.NativeType("ALint") int r7, @org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALvoid *") java.nio.ShortBuffer r9, @org.lwjgl.system.NativeType("ALsizei") int r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            int r3 = r3.remaining()
            r4 = 1
            int r3 = r3 << r4
            r4 = r10
            nalBufferDataStatic(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferDataStatic(@org.lwjgl.system.NativeType("ALint") int r7, @org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALvoid *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("ALsizei") int r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            int r3 = r3.remaining()
            r4 = 2
            int r3 = r3 << r4
            r4 = r10
            nalBufferDataStatic(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferDataStatic(@org.lwjgl.system.NativeType("ALint") int r7, @org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALvoid *") java.nio.FloatBuffer r9, @org.lwjgl.system.NativeType("ALsizei") int r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            int r3 = r3.remaining()
            r4 = 2
            int r3 = r3 << r4
            r4 = r10
            nalBufferDataStatic(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferDataStatic(@org.lwjgl.system.NativeType("ALint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALvoid *") short[] r10, @org.lwjgl.system.NativeType("ALsizei") int r11) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferDataStatic
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r10
            int r3 = r3.length
            r4 = 1
            int r3 = r3 << r4
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferDataStatic(@org.lwjgl.system.NativeType("ALint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALvoid *") int[] r10, @org.lwjgl.system.NativeType("ALsizei") int r11) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferDataStatic
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r10
            int r3 = r3.length
            r4 = 2
            int r3 = r3 << r4
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferDataStatic(@org.lwjgl.system.NativeType("ALint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALvoid *") float[] r10, @org.lwjgl.system.NativeType("ALsizei") int r11) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferDataStatic
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r10
            int r3 = r3.length
            r4 = 2
            int r3 = r3 << r4
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5)
            return
    }
}
