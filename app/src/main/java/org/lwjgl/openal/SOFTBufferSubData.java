package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTBufferSubData.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTBufferSubData.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTBufferSubData.class */
public class SOFTBufferSubData {
    public static final int AL_BYTE_RW_OFFSETS_SOFT = 4145;
    public static final int AL_SAMPLE_RW_OFFSETS_SOFT = 4146;

    protected SOFTBufferSubData() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nalBufferSubDataSOFT(int r9, int r10, long r11, int r13, int r14) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferSubDataSOFT
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

    public static void alBufferSubDataSOFT(@org.lwjgl.system.NativeType("ALuint") int r7, @org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("ALsizei") int r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            r4 = r9
            int r4 = r4.remaining()
            nalBufferSubDataSOFT(r0, r1, r2, r3, r4)
            return
    }

    public static void alBufferSubDataSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.ShortBuffer r10, @org.lwjgl.system.NativeType("ALsizei") int r11) {
            r0 = r8
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = r10
            int r4 = r4.remaining()
            r5 = 1
            int r4 = r4 << r5
            nalBufferSubDataSOFT(r0, r1, r2, r3, r4)
            return
    }

    public static void alBufferSubDataSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("ALsizei") int r11) {
            r0 = r8
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = r10
            int r4 = r4.remaining()
            r5 = 2
            int r4 = r4 << r5
            nalBufferSubDataSOFT(r0, r1, r2, r3, r4)
            return
    }

    public static void alBufferSubDataSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.FloatBuffer r10, @org.lwjgl.system.NativeType("ALsizei") int r11) {
            r0 = r8
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = r10
            int r4 = r4.remaining()
            r5 = 2
            int r4 = r4 << r5
            nalBufferSubDataSOFT(r0, r1, r2, r3, r4)
            return
    }

    public static void alBufferSubDataSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALvoid const *") short[] r10, @org.lwjgl.system.NativeType("ALsizei") int r11) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferSubDataSOFT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r10
            int r4 = r4.length
            r5 = 1
            int r4 = r4 << r5
            r5 = r12
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void alBufferSubDataSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALvoid const *") int[] r10, @org.lwjgl.system.NativeType("ALsizei") int r11) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferSubDataSOFT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r10
            int r4 = r4.length
            r5 = 2
            int r4 = r4 << r5
            r5 = r12
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void alBufferSubDataSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALvoid const *") float[] r10, @org.lwjgl.system.NativeType("ALsizei") int r11) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferSubDataSOFT
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r10
            int r4 = r4.length
            r5 = 2
            int r4 = r4 << r5
            r5 = r12
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5)
            return
    }
}
