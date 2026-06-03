package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTCallbackBuffer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTCallbackBuffer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/SOFTCallbackBuffer.class */
public class SOFTCallbackBuffer {
    public static final int AL_BUFFER_CALLBACK_FUNCTION_SOFT = 6560;
    public static final int AL_BUFFER_CALLBACK_USER_PARAM_SOFT = 6561;

    protected SOFTCallbackBuffer() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nalBufferCallbackSOFT(int r10, int r11, int r12, long r13, long r15) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferCallbackSOFT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1a:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            r5 = r17
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferCallbackSOFT(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALsizei") int r10, @org.lwjgl.system.NativeType("ALBUFFERCALLBACKTYPESOFT") org.lwjgl.openal.SOFTCallbackBufferTypeI r11, @org.lwjgl.system.NativeType("ALvoid *") long r12) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            long r3 = r3.address()
            r4 = r12
            nalBufferCallbackSOFT(r0, r1, r2, r3, r4)
            return
    }

    public static void nalGetBufferPtrSOFT(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBufferPtrSOFT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetBufferPtrSOFT(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALvoid **") org.lwjgl.PointerBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetBufferPtrSOFT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static long alGetBufferPtrSOFT(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            org.lwjgl.PointerBuffer r0 = r0.callocPointer(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nalGetBufferPtrSOFT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r12 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static void nalGetBuffer3PtrSOFT(int r11, int r12, long r13, long r15, long r17) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBuffer3PtrSOFT
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r19
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetBuffer3PtrSOFT(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALenum") int r10, @org.lwjgl.system.NativeType("ALvoid **") org.lwjgl.PointerBuffer r11, @org.lwjgl.system.NativeType("ALvoid **") org.lwjgl.PointerBuffer r12, @org.lwjgl.system.NativeType("ALvoid **") org.lwjgl.PointerBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r9
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nalGetBuffer3PtrSOFT(r0, r1, r2, r3, r4)
            return
    }

    public static void nalGetBufferPtrvSOFT(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBufferPtrvSOFT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetBufferPtrvSOFT(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALvoid **") org.lwjgl.PointerBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetBufferPtrvSOFT(r0, r1, r2)
            return
    }
}
