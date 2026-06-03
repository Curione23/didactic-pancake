package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC10.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC10.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC10.class */
public class ALC10 {
    static org.lwjgl.openal.ALCcontext alcContext;
    public static final int ALC_INVALID = -1;
    public static final int ALC_FALSE = 0;
    public static final int ALC_TRUE = 1;
    public static final int ALC_FREQUENCY = 4103;
    public static final int ALC_REFRESH = 4104;
    public static final int ALC_SYNC = 4105;
    public static final int ALC_NO_ERROR = 0;
    public static final int ALC_INVALID_DEVICE = 40961;
    public static final int ALC_INVALID_CONTEXT = 40962;
    public static final int ALC_INVALID_ENUM = 40963;
    public static final int ALC_INVALID_VALUE = 40964;
    public static final int ALC_OUT_OF_MEMORY = 40965;
    public static final int ALC_DEFAULT_DEVICE_SPECIFIER = 4100;
    public static final int ALC_DEVICE_SPECIFIER = 4101;
    public static final int ALC_EXTENSIONS = 4102;
    public static final int ALC_MAJOR_VERSION = 4096;
    public static final int ALC_MINOR_VERSION = 4097;
    public static final int ALC_ATTRIBUTES_SIZE = 4098;
    public static final int ALC_ALL_ATTRIBUTES = 4099;

    public static org.lwjgl.openal.ALCcontext alcCreateContext(org.lwjgl.openal.ALCdevice r5, java.nio.IntBuffer r6) {
            r0 = r5
            long r0 = r0.device
            r1 = r6
            long r0 = alcCreateContext(r0, r1)
            r7 = r0
            org.lwjgl.openal.ALCcontext r0 = new org.lwjgl.openal.ALCcontext
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            org.lwjgl.openal.ALC10.alcContext = r0
            org.lwjgl.openal.ALCcontext r0 = org.lwjgl.openal.ALC10.alcContext
            return r0
    }

    public static org.lwjgl.openal.ALCdevice alcGetContextsDevice(org.lwjgl.openal.ALCcontext r2) {
            org.lwjgl.openal.ALCdevice r0 = org.lwjgl.openal.AL.alcDevice
            return r0
    }

    public static void alcGetInteger(org.lwjgl.openal.ALCdevice r4, int r5, java.nio.IntBuffer r6) {
            r0 = r4
            long r0 = r0.device
            r1 = r5
            int r0 = alcGetInteger(r0, r1)
            r7 = r0
            r0 = r6
            r1 = 0
            r2 = r7
            java.nio.IntBuffer r0 = r0.put(r1, r2)
            return
    }

    public static java.lang.String alcGetString(org.lwjgl.openal.ALCdevice r4, int r5) {
            r0 = r4
            long r0 = r0.device
            r1 = r5
            java.lang.String r0 = alcGetString(r0, r1)
            return r0
    }

    protected ALC10() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nalcOpenDevice(long r5) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcOpenDevice
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCdevice *")
    public static long alcOpenDevice(@javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCchar const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            long r0 = nalcOpenDevice(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCdevice *")
    public static long alcOpenDevice(@javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCchar const *") java.lang.CharSequence r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L2b
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
            long r0 = nalcOpenDevice(r0)     // Catch: java.lang.Throwable -> L2b
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

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alcCloseDevice(@org.lwjgl.system.NativeType("ALCdevice const *") long r5) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcCloseDevice
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    public static long nalcCreateContext(long r7, long r9) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcCreateContext
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L13
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L13:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCcontext *")
    public static long alcCreateContext(@org.lwjgl.system.NativeType("ALCdevice const *") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCint const *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNTSafe(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            long r0 = nalcCreateContext(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alcMakeContextCurrent(@org.lwjgl.system.NativeType("ALCcontext *") long r5) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcMakeContextCurrent
            r7 = r0
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcProcessContext(@org.lwjgl.system.NativeType("ALCcontext *") long r5) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcProcessContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcSuspendContext(@org.lwjgl.system.NativeType("ALCcontext *") long r5) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcSuspendContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcDestroyContext(@org.lwjgl.system.NativeType("ALCcontext *") long r5) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcDestroyContext
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALCcontext *")
    public static long alcGetCurrentContext() {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcGetCurrentContext
            r3 = r0
            r0 = r3
            long r0 = org.lwjgl.system.JNI.invokeP(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCdevice *")
    public static long alcGetContextsDevice(@org.lwjgl.system.NativeType("ALCcontext *") long r5) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcGetContextsDevice
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    public static boolean nalcIsExtensionPresent(long r7, long r9) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcIsExtensionPresent
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alcIsExtensionPresent(@org.lwjgl.system.NativeType("ALCdevice const *") long r5, @org.lwjgl.system.NativeType("ALCchar const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            boolean r0 = nalcIsExtensionPresent(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alcIsExtensionPresent(@org.lwjgl.system.NativeType("ALCdevice const *") long r5, @org.lwjgl.system.NativeType("ALCchar const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L28
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L28
            r10 = r0
            r0 = r5
            r1 = r10
            boolean r0 = nalcIsExtensionPresent(r0, r1)     // Catch: java.lang.Throwable -> L28
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L28:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static long nalcGetProcAddress(long r7, long r9) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcGetProcAddress
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long alcGetProcAddress(@org.lwjgl.system.NativeType("ALCdevice const *") long r5, @org.lwjgl.system.NativeType("ALchar const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            long r0 = nalcGetProcAddress(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long alcGetProcAddress(@org.lwjgl.system.NativeType("ALCdevice const *") long r5, @org.lwjgl.system.NativeType("ALchar const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L28
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L28
            r10 = r0
            r0 = r5
            r1 = r10
            long r0 = nalcGetProcAddress(r0, r1)     // Catch: java.lang.Throwable -> L28
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L28:
            r14 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static int nalcGetEnumValue(long r7, long r9) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcGetEnumValue
            r11 = r0
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.invokePPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCenum")
    public static int alcGetEnumValue(@org.lwjgl.system.NativeType("ALCdevice const *") long r5, @org.lwjgl.system.NativeType("ALCchar const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nalcGetEnumValue(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCenum")
    public static int alcGetEnumValue(@org.lwjgl.system.NativeType("ALCdevice const *") long r5, @org.lwjgl.system.NativeType("ALCchar const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L28
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L28
            r10 = r0
            r0 = r5
            r1 = r10
            int r0 = nalcGetEnumValue(r0, r1)     // Catch: java.lang.Throwable -> L28
            r12 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            return r0
        L28:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    @org.lwjgl.system.NativeType("ALCenum")
    public static int alcGetError(@org.lwjgl.system.NativeType("ALCdevice *") long r5) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcGetError
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    public static long nalcGetString(long r6, int r8) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcGetString
            r9 = r0
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("ALCchar const *")
    public static java.lang.String alcGetString(@org.lwjgl.system.NativeType("ALCdevice *") long r4, @org.lwjgl.system.NativeType("ALCenum") int r6) {
            r0 = r4
            r1 = r6
            long r0 = nalcGetString(r0, r1)
            r7 = r0
            r0 = r7
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    public static void nalcGetIntegerv(long r9, int r11, int r12, long r13) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcGetIntegerv
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcGetIntegerv(@org.lwjgl.system.NativeType("ALCdevice *") long r7, @org.lwjgl.system.NativeType("ALCenum") int r9, @org.lwjgl.system.NativeType("ALCint *") java.nio.IntBuffer r10) {
            r0 = r7
            r1 = r9
            r2 = r10
            int r2 = r2.remaining()
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nalcGetIntegerv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static int alcGetInteger(@org.lwjgl.system.NativeType("ALCdevice *") long r7, @org.lwjgl.system.NativeType("ALCenum") int r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r7
            r1 = r9
            r2 = 1
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nalcGetIntegerv(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r12
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r13 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r13
            return r0
        L2d:
            r14 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    @org.lwjgl.system.NativeType("ALCcontext *")
    public static long alcCreateContext(@org.lwjgl.system.NativeType("ALCdevice const *") long r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("ALCint const *") int[] r8) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcCreateContext
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L16:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCvoid")
    public static void alcGetIntegerv(@org.lwjgl.system.NativeType("ALCdevice *") long r8, @org.lwjgl.system.NativeType("ALCenum") int r10, @org.lwjgl.system.NativeType("ALCint *") int[] r11) {
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.getICD()
            long r0 = r0.alcGetIntegerv
            r12 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            int r2 = r2.length
            r3 = r11
            r4 = r12
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4)
            return
    }
}
