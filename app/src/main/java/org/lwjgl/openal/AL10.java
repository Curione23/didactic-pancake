package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL10.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL10.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL10.class */
public class AL10 {
    public static final int AL_INVALID = -1;
    public static final int AL_NONE = 0;
    public static final int AL_FALSE = 0;
    public static final int AL_TRUE = 1;
    public static final int AL_NO_ERROR = 0;
    public static final int AL_INVALID_NAME = 40961;
    public static final int AL_INVALID_ENUM = 40962;
    public static final int AL_INVALID_VALUE = 40963;
    public static final int AL_INVALID_OPERATION = 40964;
    public static final int AL_OUT_OF_MEMORY = 40965;
    public static final int AL_DOPPLER_FACTOR = 49152;
    public static final int AL_DISTANCE_MODEL = 53248;
    public static final int AL_VENDOR = 45057;
    public static final int AL_VERSION = 45058;
    public static final int AL_RENDERER = 45059;
    public static final int AL_EXTENSIONS = 45060;
    public static final int AL_INVERSE_DISTANCE = 53249;
    public static final int AL_INVERSE_DISTANCE_CLAMPED = 53250;
    public static final int AL_SOURCE_ABSOLUTE = 513;
    public static final int AL_SOURCE_RELATIVE = 514;
    public static final int AL_POSITION = 4100;
    public static final int AL_VELOCITY = 4102;
    public static final int AL_GAIN = 4106;
    public static final int AL_CONE_INNER_ANGLE = 4097;
    public static final int AL_CONE_OUTER_ANGLE = 4098;
    public static final int AL_PITCH = 4099;
    public static final int AL_DIRECTION = 4101;
    public static final int AL_LOOPING = 4103;
    public static final int AL_BUFFER = 4105;
    public static final int AL_SOURCE_STATE = 4112;
    public static final int AL_CONE_OUTER_GAIN = 4130;
    public static final int AL_SOURCE_TYPE = 4135;
    public static final int AL_INITIAL = 4113;
    public static final int AL_PLAYING = 4114;
    public static final int AL_PAUSED = 4115;
    public static final int AL_STOPPED = 4116;
    public static final int AL_ORIENTATION = 4111;
    public static final int AL_BUFFERS_QUEUED = 4117;
    public static final int AL_BUFFERS_PROCESSED = 4118;
    public static final int AL_MIN_GAIN = 4109;
    public static final int AL_MAX_GAIN = 4110;
    public static final int AL_REFERENCE_DISTANCE = 4128;
    public static final int AL_ROLLOFF_FACTOR = 4129;
    public static final int AL_MAX_DISTANCE = 4131;
    public static final int AL_FREQUENCY = 8193;
    public static final int AL_BITS = 8194;
    public static final int AL_CHANNELS = 8195;
    public static final int AL_SIZE = 8196;
    public static final int AL_FORMAT_MONO8 = 4352;
    public static final int AL_FORMAT_MONO16 = 4353;
    public static final int AL_FORMAT_STEREO8 = 4354;
    public static final int AL_FORMAT_STEREO16 = 4355;
    public static final int AL_UNUSED = 8208;
    public static final int AL_PENDING = 8209;
    public static final int AL_PROCESSED = 8210;

    public static void alGetDouble(int r3, java.nio.DoubleBuffer r4) {
            r0 = r3
            r1 = r4
            alGetDoublev(r0, r1)
            return
    }

    public static void alGetFloat(int r3, java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            alGetFloatv(r0, r1)
            return
    }

    public static void alGetInteger(int r3, java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            alGetIntegerv(r0, r1)
            return
    }

    public static void alGetListener(int r3, java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            alGetListenerfv(r0, r1)
            return
    }

    public static void alGetSource(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            alGetSourcefv(r0, r1, r2)
            return
    }

    public static void alListener(int r3, java.nio.FloatBuffer r4) {
            r0 = r3
            r1 = r4
            alListenerfv(r0, r1)
            return
    }

    public static void alSource(int r4, int r5, java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            alSourcefv(r0, r1, r2)
            return
    }

    public static void alSourcePause(java.nio.IntBuffer r2) {
            r0 = r2
            alSourcePausev(r0)
            return
    }

    public static void alSourcePlay(java.nio.IntBuffer r2) {
            r0 = r2
            alSourcePlayv(r0)
            return
    }

    public static void alSourceRewind(java.nio.IntBuffer r2) {
            r0 = r2
            alSourceRewindv(r0)
            return
    }

    public static void alSourceStop(java.nio.IntBuffer r2) {
            r0 = r2
            alSourceStopv(r0)
            return
    }

    protected AL10() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("ALenum")
    public static int alGetError() {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetError
            r3 = r0
            r0 = r3
            int r0 = org.lwjgl.system.JNI.invokeI(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alEnable(@org.lwjgl.system.NativeType("ALenum") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alEnable
            r5 = r0
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.invokeV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDisable(@org.lwjgl.system.NativeType("ALenum") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDisable
            r5 = r0
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.invokeV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALboolean")
    public static boolean alIsEnabled(@org.lwjgl.system.NativeType("ALenum") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alIsEnabled
            r5 = r0
            r0 = r4
            r1 = r5
            boolean r0 = org.lwjgl.system.JNI.invokeZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALboolean")
    public static boolean alGetBoolean(@org.lwjgl.system.NativeType("ALenum") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBoolean
            r5 = r0
            r0 = r4
            r1 = r5
            boolean r0 = org.lwjgl.system.JNI.invokeZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALint")
    public static int alGetInteger(@org.lwjgl.system.NativeType("ALenum") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetInteger
            r5 = r0
            r0 = r4
            r1 = r5
            int r0 = org.lwjgl.system.JNI.invokeI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALfloat")
    public static float alGetFloat(@org.lwjgl.system.NativeType("ALenum") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetFloat
            r5 = r0
            r0 = r4
            r1 = r5
            float r0 = org.lwjgl.system.JNI.invokeF(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALdouble")
    public static double alGetDouble(@org.lwjgl.system.NativeType("ALenum") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetDouble
            r5 = r0
            r0 = r4
            r1 = r5
            double r0 = org.lwjgl.system.JNI.invokeD(r0, r1)
            return r0
    }

    public static void nalGetBooleanv(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBooleanv
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetBooleanv(@org.lwjgl.system.NativeType("ALenum") int r4, @org.lwjgl.system.NativeType("ALboolean *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalGetBooleanv(r0, r1)
            return
    }

    public static void nalGetIntegerv(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetIntegerv
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetIntegerv(@org.lwjgl.system.NativeType("ALenum") int r4, @org.lwjgl.system.NativeType("ALint *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalGetIntegerv(r0, r1)
            return
    }

    public static void nalGetFloatv(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetFloatv
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetFloatv(@org.lwjgl.system.NativeType("ALenum") int r4, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalGetFloatv(r0, r1)
            return
    }

    public static void nalGetDoublev(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetDoublev
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetDoublev(@org.lwjgl.system.NativeType("ALenum") int r4, @org.lwjgl.system.NativeType("ALdouble *") java.nio.DoubleBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalGetDoublev(r0, r1)
            return
    }

    public static long nalGetString(int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetString
            r5 = r0
            r0 = r4
            r1 = r5
            long r0 = org.lwjgl.system.JNI.invokeP(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("ALchar const *")
    public static java.lang.String alGetString(@org.lwjgl.system.NativeType("ALenum") int r3) {
            r0 = r3
            long r0 = nalGetString(r0)
            r4 = r0
            r0 = r4
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDistanceModel(@org.lwjgl.system.NativeType("ALenum") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDistanceModel
            r5 = r0
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.invokeV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDopplerFactor(@org.lwjgl.system.NativeType("ALfloat") float r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDopplerFactor
            r5 = r0
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.invokeV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDopplerVelocity(@org.lwjgl.system.NativeType("ALfloat") float r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDopplerVelocity
            r5 = r0
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.invokeV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alListenerf(@org.lwjgl.system.NativeType("ALenum") int r5, @org.lwjgl.system.NativeType("ALfloat") float r6) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alListenerf
            r7 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.invokeV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alListeneri(@org.lwjgl.system.NativeType("ALenum") int r5, @org.lwjgl.system.NativeType("ALint") int r6) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alListeneri
            r7 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.invokeV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alListener3f(@org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat") float r8, @org.lwjgl.system.NativeType("ALfloat") float r9, @org.lwjgl.system.NativeType("ALfloat") float r10) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alListener3f
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3, r4)
            return
    }

    public static void nalListenerfv(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alListenerfv
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alListenerfv(@org.lwjgl.system.NativeType("ALenum") int r4, @org.lwjgl.system.NativeType("ALfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalListenerfv(r0, r1)
            return
    }

    public static void nalGetListenerf(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetListenerf
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetListenerf(@org.lwjgl.system.NativeType("ALenum") int r4, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalGetListenerf(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static float alGetListenerf(@org.lwjgl.system.NativeType("ALenum") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L26
            r7 = r0
            r0 = r4
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L26
            nalGetListenerf(r0, r1)     // Catch: java.lang.Throwable -> L26
            r0 = r7
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            return r0
        L26:
            r9 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            throw r0
    }

    public static void nalGetListeneri(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetListeneri
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetListeneri(@org.lwjgl.system.NativeType("ALenum") int r4, @org.lwjgl.system.NativeType("ALint *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalGetListeneri(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static int alGetListeneri(@org.lwjgl.system.NativeType("ALenum") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L26
            r7 = r0
            r0 = r4
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L26
            nalGetListeneri(r0, r1)     // Catch: java.lang.Throwable -> L26
            r0 = r7
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            return r0
        L26:
            r9 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            throw r0
    }

    public static void nalGetListener3f(int r10, long r11, long r13, long r15) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetListener3f
            r17 = r0
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r15
            r4 = r17
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetListener3f(@org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r9, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r10, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L15:
            r0 = r8
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nalGetListener3f(r0, r1, r2, r3)
            return
    }

    public static void nalGetListenerfv(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetListenerfv
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetListenerfv(@org.lwjgl.system.NativeType("ALenum") int r4, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalGetListenerfv(r0, r1)
            return
    }

    public static void nalGenSources(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGenSources
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGenSources(@org.lwjgl.system.NativeType("ALuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalGenSources(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static int alGenSources() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r4 = r0
            r0 = r4
            int r0 = r0.getPointer()
            r5 = r0
            r0 = r4
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L24
            r6 = r0
            r0 = 1
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L24
            nalGenSources(r0, r1)     // Catch: java.lang.Throwable -> L24
            r0 = r6
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L24
            r7 = r0
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r7
            return r0
        L24:
            r8 = move-exception
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r8
            throw r0
    }

    public static void nalDeleteSources(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDeleteSources
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeleteSources(@org.lwjgl.system.NativeType("ALuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalDeleteSources(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeleteSources(@org.lwjgl.system.NativeType("ALuint *") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L1f
            r7 = r0
            r0 = 1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L1f
            nalDeleteSources(r0, r1)     // Catch: java.lang.Throwable -> L1f
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            goto L29
        L1f:
            r8 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            throw r0
        L29:
            return
    }

    @org.lwjgl.system.NativeType("ALboolean")
    public static boolean alIsSource(@org.lwjgl.system.NativeType("ALuint") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alIsSource
            r5 = r0
            r0 = r4
            r1 = r5
            boolean r0 = org.lwjgl.system.JNI.invokeZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcef(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat") float r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcef
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSource3f(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALfloat") float r10, @org.lwjgl.system.NativeType("ALfloat") float r11, @org.lwjgl.system.NativeType("ALfloat") float r12) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSource3f
            r13 = r0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nalSourcefv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcefv
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcefv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALfloat const *") java.nio.FloatBuffer r7) {
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
            nalSourcefv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcei(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint") int r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcei
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokeV(r0, r1, r2, r3)
            return
    }

    public static void nalGetSourcef(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourcef
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetSourcef(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r7) {
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
            nalGetSourcef(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static float alGetSourcef(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nalGetSourcef(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static void nalGetSource3f(int r11, int r12, long r13, long r15, long r17) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSource3f
            r19 = r0
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
    public static void alGetSource3f(@org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALenum") int r10, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r11, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r12, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r13) {
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
            nalGetSource3f(r0, r1, r2, r3, r4)
            return
    }

    public static void nalGetSourcefv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourcefv
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetSourcefv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r7) {
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
            nalGetSourcefv(r0, r1, r2)
            return
    }

    public static void nalGetSourcei(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourcei
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetSourcei(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint *") java.nio.IntBuffer r7) {
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
            nalGetSourcei(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static int alGetSourcei(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nalGetSourcei(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static void nalGetSourceiv(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourceiv
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetSourceiv(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint *") java.nio.IntBuffer r7) {
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
            nalGetSourceiv(r0, r1, r2)
            return
    }

    public static void nalSourceQueueBuffers(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourceQueueBuffers
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourceQueueBuffers(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALuint *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalSourceQueueBuffers(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourceQueueBuffers(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALuint *") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = r6
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L22
            r9 = r0
            r0 = r5
            r1 = 1
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L22
            nalSourceQueueBuffers(r0, r1, r2)     // Catch: java.lang.Throwable -> L22
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            goto L2c
        L22:
            r10 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            throw r0
        L2c:
            return
    }

    public static void nalSourceUnqueueBuffers(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourceUnqueueBuffers
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourceUnqueueBuffers(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALuint *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalSourceUnqueueBuffers(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static int alSourceUnqueueBuffers(@org.lwjgl.system.NativeType("ALuint") int r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L27
            r8 = r0
            r0 = r5
            r1 = 1
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L27
            nalSourceUnqueueBuffers(r0, r1, r2)     // Catch: java.lang.Throwable -> L27
            r0 = r8
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L27
            r9 = r0
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r9
            return r0
        L27:
            r10 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r10
            throw r0
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcePlay(@org.lwjgl.system.NativeType("ALuint") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcePlay
            r5 = r0
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.invokeV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcePause(@org.lwjgl.system.NativeType("ALuint") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcePause
            r5 = r0
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.invokeV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourceStop(@org.lwjgl.system.NativeType("ALuint") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourceStop
            r5 = r0
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.invokeV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourceRewind(@org.lwjgl.system.NativeType("ALuint") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourceRewind
            r5 = r0
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.invokeV(r0, r1)
            return
    }

    public static void nalSourcePlayv(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcePlayv
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcePlayv(@org.lwjgl.system.NativeType("ALuint const *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalSourcePlayv(r0, r1)
            return
    }

    public static void nalSourcePausev(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcePausev
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcePausev(@org.lwjgl.system.NativeType("ALuint const *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalSourcePausev(r0, r1)
            return
    }

    public static void nalSourceStopv(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourceStopv
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourceStopv(@org.lwjgl.system.NativeType("ALuint const *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalSourceStopv(r0, r1)
            return
    }

    public static void nalSourceRewindv(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourceRewindv
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourceRewindv(@org.lwjgl.system.NativeType("ALuint const *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalSourceRewindv(r0, r1)
            return
    }

    public static void nalGenBuffers(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGenBuffers
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGenBuffers(@org.lwjgl.system.NativeType("ALuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalGenBuffers(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static int alGenBuffers() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r4 = r0
            r0 = r4
            int r0 = r0.getPointer()
            r5 = r0
            r0 = r4
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L24
            r6 = r0
            r0 = 1
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L24
            nalGenBuffers(r0, r1)     // Catch: java.lang.Throwable -> L24
            r0 = r6
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L24
            r7 = r0
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r7
            return r0
        L24:
            r8 = move-exception
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r8
            throw r0
    }

    public static void nalDeleteBuffers(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDeleteBuffers
            r9 = r0
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeleteBuffers(@org.lwjgl.system.NativeType("ALuint const *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalDeleteBuffers(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeleteBuffers(@org.lwjgl.system.NativeType("ALuint const *") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L1f
            r7 = r0
            r0 = 1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L1f
            nalDeleteBuffers(r0, r1)     // Catch: java.lang.Throwable -> L1f
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            goto L29
        L1f:
            r8 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            throw r0
        L29:
            return
    }

    @org.lwjgl.system.NativeType("ALboolean")
    public static boolean alIsBuffer(@org.lwjgl.system.NativeType("ALuint") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alIsBuffer
            r5 = r0
            r0 = r4
            r1 = r5
            boolean r0 = org.lwjgl.system.JNI.invokeZ(r0, r1)
            return r0
    }

    public static void nalGetBufferf(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBufferf
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetBufferf(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALfloat *") java.nio.FloatBuffer r7) {
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
            nalGetBufferf(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static float alGetBufferf(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nalGetBufferf(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static void nalGetBufferi(int r7, int r8, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBufferi
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetBufferi(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALint *") java.nio.IntBuffer r7) {
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
            nalGetBufferi(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static int alGetBufferi(@org.lwjgl.system.NativeType("ALuint") int r5, @org.lwjgl.system.NativeType("ALenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nalGetBufferi(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static void nalBufferData(int r9, int r10, long r11, int r13, int r14) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferData
            r15 = r0
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
    public static void alBufferData(@org.lwjgl.system.NativeType("ALuint") int r7, @org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("ALsizei") int r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            int r3 = r3.remaining()
            r4 = r10
            nalBufferData(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferData(@org.lwjgl.system.NativeType("ALuint") int r7, @org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.ShortBuffer r9, @org.lwjgl.system.NativeType("ALsizei") int r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            int r3 = r3.remaining()
            r4 = 1
            int r3 = r3 << r4
            r4 = r10
            nalBufferData(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferData(@org.lwjgl.system.NativeType("ALuint") int r7, @org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("ALsizei") int r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            int r3 = r3.remaining()
            r4 = 2
            int r3 = r3 << r4
            r4 = r10
            nalBufferData(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferData(@org.lwjgl.system.NativeType("ALuint") int r7, @org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALvoid const *") java.nio.FloatBuffer r9, @org.lwjgl.system.NativeType("ALsizei") int r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            int r3 = r3.remaining()
            r4 = 2
            int r3 = r3 << r4
            r4 = r10
            nalBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static int nalGetEnumValue(long r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetEnumValue
            r7 = r0
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.invokePI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALuint")
    public static int alGetEnumValue(@org.lwjgl.system.NativeType("ALchar const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            int r0 = nalGetEnumValue(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("ALuint")
    public static int alGetEnumValue(@org.lwjgl.system.NativeType("ALchar const *") java.lang.CharSequence r4) {
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
            int r0 = nalGetEnumValue(r0)     // Catch: java.lang.Throwable -> L23
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L23:
            r10 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r10
            throw r0
    }

    public static long nalGetProcAddress(long r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetProcAddress
            r7 = r0
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long alGetProcAddress(@org.lwjgl.system.NativeType("ALchar const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            long r0 = nalGetProcAddress(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public static long alGetProcAddress(@org.lwjgl.system.NativeType("ALchar const *") java.lang.CharSequence r4) {
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
            long r0 = nalGetProcAddress(r0)     // Catch: java.lang.Throwable -> L23
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

    public static boolean nalIsExtensionPresent(long r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alIsExtensionPresent
            r7 = r0
            r0 = r5
            r1 = r7
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alIsExtensionPresent(@org.lwjgl.system.NativeType("ALchar const *") java.nio.ByteBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r3
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            boolean r0 = nalIsExtensionPresent(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("ALCboolean")
    public static boolean alIsExtensionPresent(@org.lwjgl.system.NativeType("ALchar const *") java.lang.CharSequence r4) {
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
            boolean r0 = nalIsExtensionPresent(r0)     // Catch: java.lang.Throwable -> L23
            r9 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r9
            return r0
        L23:
            r10 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r10
            throw r0
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetIntegerv(@org.lwjgl.system.NativeType("ALenum") int r5, @org.lwjgl.system.NativeType("ALint *") int[] r6) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetIntegerv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetFloatv(@org.lwjgl.system.NativeType("ALenum") int r5, @org.lwjgl.system.NativeType("ALfloat *") float[] r6) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetFloatv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetDoublev(@org.lwjgl.system.NativeType("ALenum") int r5, @org.lwjgl.system.NativeType("ALdouble *") double[] r6) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetDoublev
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alListenerfv(@org.lwjgl.system.NativeType("ALenum") int r5, @org.lwjgl.system.NativeType("ALfloat const *") float[] r6) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alListenerfv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetListenerf(@org.lwjgl.system.NativeType("ALenum") int r5, @org.lwjgl.system.NativeType("ALfloat *") float[] r6) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetListenerf
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetListeneri(@org.lwjgl.system.NativeType("ALenum") int r5, @org.lwjgl.system.NativeType("ALint *") int[] r6) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetListeneri
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetListener3f(@org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat *") float[] r8, @org.lwjgl.system.NativeType("ALfloat *") float[] r9, @org.lwjgl.system.NativeType("ALfloat *") float[] r10) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetListener3f
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1d:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetListenerfv(@org.lwjgl.system.NativeType("ALenum") int r5, @org.lwjgl.system.NativeType("ALfloat *") float[] r6) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetListenerfv
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGenSources(@org.lwjgl.system.NativeType("ALuint *") int[] r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGenSources
            r6 = r0
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeleteSources(@org.lwjgl.system.NativeType("ALuint *") int[] r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDeleteSources
            r6 = r0
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcefv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat const *") float[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcefv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetSourcef(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat *") float[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourcef
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetSource3f(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALfloat *") float[] r10, @org.lwjgl.system.NativeType("ALfloat *") float[] r11, @org.lwjgl.system.NativeType("ALfloat *") float[] r12) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSource3f
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetSourcefv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat *") float[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourcefv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetSourcei(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint *") int[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourcei
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetSourceiv(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint *") int[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetSourceiv
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourceQueueBuffers(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALuint *") int[] r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourceQueueBuffers
            r8 = r0
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourceUnqueueBuffers(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALuint *") int[] r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourceUnqueueBuffers
            r8 = r0
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcePlayv(@org.lwjgl.system.NativeType("ALuint const *") int[] r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcePlayv
            r6 = r0
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourcePausev(@org.lwjgl.system.NativeType("ALuint const *") int[] r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourcePausev
            r6 = r0
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourceStopv(@org.lwjgl.system.NativeType("ALuint const *") int[] r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourceStopv
            r6 = r0
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alSourceRewindv(@org.lwjgl.system.NativeType("ALuint const *") int[] r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alSourceRewindv
            r6 = r0
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGenBuffers(@org.lwjgl.system.NativeType("ALuint *") int[] r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGenBuffers
            r6 = r0
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDeleteBuffers(@org.lwjgl.system.NativeType("ALuint const *") int[] r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDeleteBuffers
            r6 = r0
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetBufferf(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALfloat *") float[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBufferf
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetBufferi(@org.lwjgl.system.NativeType("ALuint") int r6, @org.lwjgl.system.NativeType("ALenum") int r7, @org.lwjgl.system.NativeType("ALint *") int[] r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetBufferi
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alBufferData(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALvoid const *") short[] r10, @org.lwjgl.system.NativeType("ALsizei") int r11) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferData
            r12 = r0
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
    public static void alBufferData(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALvoid const *") int[] r10, @org.lwjgl.system.NativeType("ALsizei") int r11) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferData
            r12 = r0
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
    public static void alBufferData(@org.lwjgl.system.NativeType("ALuint") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALvoid const *") float[] r10, @org.lwjgl.system.NativeType("ALsizei") int r11) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alBufferData
            r12 = r0
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
