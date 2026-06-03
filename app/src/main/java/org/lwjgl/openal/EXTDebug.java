package org.lwjgl.openal;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/EXTDebug.class */
public class EXTDebug {
    public static final int ALC_CONTEXT_FLAGS_EXT = 6607;
    public static final int ALC_CONTEXT_DEBUG_BIT_EXT = 1;
    public static final int AL_CONTEXT_FLAGS_EXT = 6607;
    public static final int AL_CONTEXT_DEBUG_BIT_EXT = 1;
    public static final int AL_DEBUG_OUTPUT_EXT = 6578;
    public static final int AL_DEBUG_CALLBACK_FUNCTION_EXT = 6579;
    public static final int AL_DEBUG_CALLBACK_USER_PARAM_EXT = 6580;
    public static final int AL_DEBUG_SOURCE_API_EXT = 6581;
    public static final int AL_DEBUG_SOURCE_AUDIO_SYSTEM_EXT = 6582;
    public static final int AL_DEBUG_SOURCE_THIRD_PARTY_EXT = 6583;
    public static final int AL_DEBUG_SOURCE_APPLICATION_EXT = 6584;
    public static final int AL_DEBUG_SOURCE_OTHER_EXT = 6585;
    public static final int AL_DEBUG_TYPE_ERROR_EXT = 6586;
    public static final int AL_DEBUG_TYPE_DEPRECATED_BEHAVIOR_EXT = 6587;
    public static final int AL_DEBUG_TYPE_UNDEFINED_BEHAVIOR_EXT = 6588;
    public static final int AL_DEBUG_TYPE_PORTABILITY_EXT = 6589;
    public static final int AL_DEBUG_TYPE_PERFORMANCE_EXT = 6590;
    public static final int AL_DEBUG_TYPE_MARKER_EXT = 6591;
    public static final int AL_DEBUG_TYPE_OTHER_EXT = 6594;
    public static final int AL_DEBUG_TYPE_PUSH_GROUP_EXT = 6592;
    public static final int AL_DEBUG_TYPE_POP_GROUP_EXT = 6593;
    public static final int AL_DEBUG_SEVERITY_HIGH_EXT = 6595;
    public static final int AL_DEBUG_SEVERITY_MEDIUM_EXT = 6596;
    public static final int AL_DEBUG_SEVERITY_LOW_EXT = 6597;
    public static final int AL_DEBUG_SEVERITY_NOTIFICATION_EXT = 6598;
    public static final int AL_DONT_CARE_EXT = 2;
    public static final int AL_DEBUG_LOGGED_MESSAGES_EXT = 6599;
    public static final int AL_DEBUG_NEXT_LOGGED_MESSAGE_LENGTH_EXT = 6600;
    public static final int AL_MAX_DEBUG_MESSAGE_LENGTH_EXT = 6601;
    public static final int AL_MAX_DEBUG_LOGGED_MESSAGES_EXT = 6602;
    public static final int AL_MAX_DEBUG_GROUP_STACK_DEPTH_EXT = 6603;
    public static final int AL_MAX_LABEL_LENGTH_EXT = 6604;
    public static final int AL_STACK_OVERFLOW_EXT = 6605;
    public static final int AL_STACK_UNDERFLOW_EXT = 6606;
    public static final int AL_BUFFER_EXT = 4105;
    public static final int AL_SOURCE_EXT = 6608;
    public static final int AL_FILTER_EXT = 6609;
    public static final int AL_EFFECT_EXT = 6610;
    public static final int AL_AUXILIARY_EFFECT_SLOT_EXT = 6611;

    protected EXTDebug() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nalDebugMessageCallbackEXT(long r7, long r9) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDebugMessageCallbackEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r9
            r2 = r11
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDebugMessageCallbackEXT(@org.lwjgl.system.NativeType("ALDEBUGPROCEXT") org.lwjgl.openal.EXTDebugProcI r5, @org.lwjgl.system.NativeType("ALvoid *") long r6) {
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddressSafe(r0)
            r1 = r6
            nalDebugMessageCallbackEXT(r0, r1)
            return
    }

    public static void nalDebugMessageCallbackDirectEXT(long r9, long r11, long r13) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDebugMessageCallbackDirectEXT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDebugMessageCallbackDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r7, @org.lwjgl.system.NativeType("ALDEBUGPROCEXT") org.lwjgl.openal.EXTDebugProcI r9, @org.lwjgl.system.NativeType("ALvoid *") long r10) {
            r0 = r7
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            r2 = r10
            nalDebugMessageCallbackDirectEXT(r0, r1, r2)
            return
    }

    public static void nalDebugMessageInsertEXT(int r10, int r11, int r12, int r13, int r14, long r15) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDebugMessageInsertEXT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r17
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDebugMessageInsertEXT(@org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALuint") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALchar const *") java.nio.ByteBuffer r12) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            int r4 = r4.remaining()
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nalDebugMessageInsertEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDebugMessageInsertEXT(@org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALuint") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALchar const *") java.lang.CharSequence r12) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r12
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L32
            r15 = r0
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L32
            r16 = r0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r15
            r5 = r16
            nalDebugMessageInsertEXT(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L32
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            goto L3e
        L32:
            r18 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r18
            throw r0
        L3e:
            return
    }

    public static void nalDebugMessageInsertDirectEXT(long r12, int r14, int r15, int r16, int r17, int r18, long r19) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDebugMessageInsertDirectEXT
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r21
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDebugMessageInsertDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r10, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALuint") int r14, @org.lwjgl.system.NativeType("ALenum") int r15, @org.lwjgl.system.NativeType("ALchar const *") java.nio.ByteBuffer r16) {
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            int r5 = r5.remaining()
            r6 = r16
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nalDebugMessageInsertDirectEXT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDebugMessageInsertDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r10, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALuint") int r14, @org.lwjgl.system.NativeType("ALenum") int r15, @org.lwjgl.system.NativeType("ALchar const *") java.lang.CharSequence r16) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r17 = r0
            r0 = r17
            int r0 = r0.getPointer()
            r18 = r0
            r0 = r17
            r1 = r16
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L35
            r19 = r0
            r0 = r17
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L35
            r20 = r0
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r19
            r6 = r20
            nalDebugMessageInsertDirectEXT(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L35
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            goto L41
        L35:
            r22 = move-exception
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r22
            throw r0
        L41:
            return
    }

    public static void nalDebugMessageControlEXT(int r10, int r11, int r12, int r13, long r14, boolean r16) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDebugMessageControlEXT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r16
            r6 = r17
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDebugMessageControlEXT(@org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALenum") int r10, @org.lwjgl.system.NativeType("ALuint const *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("ALboolean") boolean r12) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            int r3 = org.lwjgl.system.Checks.remainingSafe(r3)
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r12
            nalDebugMessageControlEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nalDebugMessageControlDirectEXT(long r12, int r14, int r15, int r16, int r17, long r18, boolean r20) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDebugMessageControlDirectEXT
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r20
            r7 = r21
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDebugMessageControlDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r10, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALenum") int r14, @org.lwjgl.system.NativeType("ALuint const *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("ALboolean") boolean r16) {
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            int r4 = org.lwjgl.system.Checks.remainingSafe(r4)
            r5 = r15
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r16
            nalDebugMessageControlDirectEXT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void nalPushDebugGroupEXT(int r8, int r9, int r10, long r11) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alPushDebugGroupEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alPushDebugGroupEXT(@org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALuint") int r7, @org.lwjgl.system.NativeType("ALchar const *") java.nio.ByteBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nalPushDebugGroupEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alPushDebugGroupEXT(@org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALuint") int r7, @org.lwjgl.system.NativeType("ALchar const *") java.lang.CharSequence r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = r8
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L2a
            r11 = r0
            r0 = r9
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2a
            r12 = r0
            r0 = r6
            r1 = r7
            r2 = r11
            r3 = r12
            nalPushDebugGroupEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            goto L35
        L2a:
            r14 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r14
            throw r0
        L35:
            return
    }

    public static void nalPushDebugGroupDirectEXT(long r10, int r12, int r13, int r14, long r15) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alPushDebugGroupDirectEXT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r17
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alPushDebugGroupDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r8, @org.lwjgl.system.NativeType("ALenum") int r10, @org.lwjgl.system.NativeType("ALuint") int r11, @org.lwjgl.system.NativeType("ALchar const *") java.nio.ByteBuffer r12) {
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            int r3 = r3.remaining()
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nalPushDebugGroupDirectEXT(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alPushDebugGroupDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r8, @org.lwjgl.system.NativeType("ALenum") int r10, @org.lwjgl.system.NativeType("ALuint") int r11, @org.lwjgl.system.NativeType("ALchar const *") java.lang.CharSequence r12) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r12
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L31
            r15 = r0
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L31
            r16 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r15
            r4 = r16
            nalPushDebugGroupDirectEXT(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L31
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            goto L3d
        L31:
            r18 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r18
            throw r0
        L3d:
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alPopDebugGroupEXT() {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alPopDebugGroupEXT
            r3 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r3
            org.lwjgl.system.JNI.invokeV(r0)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alPopDebugGroupDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r5) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alPopDebugGroupDirectEXT
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L17:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.invokePV(r0, r1)
            return
    }

    public static int nalGetDebugMessageLogEXT(int r17, int r18, long r19, long r21, long r23, long r25, long r27, long r29) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetDebugMessageLogEXT
            r31 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r31
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r23
            r5 = r25
            r6 = r27
            r7 = r29
            r8 = r31
            int r0 = org.lwjgl.system.JNI.invokePPPPPPI(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @org.lwjgl.system.NativeType("ALuint")
    public static int alGetDebugMessageLogEXT(@org.lwjgl.system.NativeType("ALenum *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("ALenum *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("ALuint *") java.nio.IntBuffer r17, @org.lwjgl.system.NativeType("ALenum *") java.nio.IntBuffer r18, @org.lwjgl.system.NativeType("ALsizei *") java.nio.IntBuffer r19, @org.lwjgl.system.NativeType("ALchar *") java.nio.ByteBuffer r20) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L27
            r0 = r16
            r1 = r15
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r17
            r1 = r15
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r18
            r1 = r15
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r19
            r1 = r15
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L27:
            r0 = r15
            int r0 = org.lwjgl.system.Checks.remainingSafe(r0)
            r1 = r20
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r15
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r16
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r18
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r19
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            r7 = r20
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            int r0 = nalGetDebugMessageLogEXT(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static int nalGetDebugMessageLogDirectEXT(long r19, int r21, int r22, long r23, long r25, long r27, long r29, long r31, long r33) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetDebugMessageLogDirectEXT
            r35 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r35
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r25
            r5 = r27
            r6 = r29
            r7 = r31
            r8 = r33
            r9 = r35
            int r0 = org.lwjgl.system.JNI.invokePPPPPPPI(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    @org.lwjgl.system.NativeType("ALuint")
    public static int alGetDebugMessageLogDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r17, @org.lwjgl.system.NativeType("ALenum *") java.nio.IntBuffer r19, @org.lwjgl.system.NativeType("ALenum *") java.nio.IntBuffer r20, @org.lwjgl.system.NativeType("ALuint *") java.nio.IntBuffer r21, @org.lwjgl.system.NativeType("ALenum *") java.nio.IntBuffer r22, @org.lwjgl.system.NativeType("ALsizei *") java.nio.IntBuffer r23, @org.lwjgl.system.NativeType("ALchar *") java.nio.ByteBuffer r24) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L29
            r0 = r20
            r1 = r19
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r21
            r1 = r19
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r22
            r1 = r19
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r23
            r1 = r19
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L29:
            r0 = r17
            r1 = r19
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r24
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r19
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r20
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r21
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r22
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            r7 = r23
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            r8 = r24
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            int r0 = nalGetDebugMessageLogDirectEXT(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static void nalObjectLabelEXT(int r8, int r9, int r10, long r11) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alObjectLabelEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alObjectLabelEXT(@org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALuint") int r7, @org.lwjgl.system.NativeType("ALchar const *") java.nio.ByteBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nalObjectLabelEXT(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alObjectLabelEXT(@org.lwjgl.system.NativeType("ALenum") int r6, @org.lwjgl.system.NativeType("ALuint") int r7, @org.lwjgl.system.NativeType("ALchar const *") java.lang.CharSequence r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = r8
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L2a
            r11 = r0
            r0 = r9
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L2a
            r12 = r0
            r0 = r6
            r1 = r7
            r2 = r11
            r3 = r12
            nalObjectLabelEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            goto L35
        L2a:
            r14 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r14
            throw r0
        L35:
            return
    }

    public static void nalObjectLabelDirectEXT(long r10, int r12, int r13, int r14, long r15) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alObjectLabelDirectEXT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r17
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alObjectLabelDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r8, @org.lwjgl.system.NativeType("ALenum") int r10, @org.lwjgl.system.NativeType("ALuint") int r11, @org.lwjgl.system.NativeType("ALchar const *") java.nio.ByteBuffer r12) {
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            int r3 = r3.remaining()
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nalObjectLabelDirectEXT(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alObjectLabelDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r8, @org.lwjgl.system.NativeType("ALenum") int r10, @org.lwjgl.system.NativeType("ALuint") int r11, @org.lwjgl.system.NativeType("ALchar const *") java.lang.CharSequence r12) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r12
            r2 = 0
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L31
            r15 = r0
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L31
            r16 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r15
            r4 = r16
            nalObjectLabelDirectEXT(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L31
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            goto L3d
        L31:
            r18 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r18
            throw r0
        L3d:
            return
    }

    public static void nalGetObjectLabelEXT(int r10, int r11, int r12, long r13, long r15) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetObjectLabelEXT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
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
    public static void alGetObjectLabelEXT(@org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALuint") int r9, @org.lwjgl.system.NativeType("ALsizei *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("ALchar *") java.nio.ByteBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nalGetObjectLabelEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void nalGetObjectLabelDirectEXT(long r12, int r14, int r15, int r16, long r17, long r19) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetObjectLabelDirectEXT
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r19
            r6 = r21
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetObjectLabelDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r10, @org.lwjgl.system.NativeType("ALenum") int r12, @org.lwjgl.system.NativeType("ALuint") int r13, @org.lwjgl.system.NativeType("ALsizei *") java.nio.IntBuffer r14, @org.lwjgl.system.NativeType("ALchar *") java.nio.ByteBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r15
            int r3 = org.lwjgl.system.Checks.remainingSafe(r3)
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r15
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            nalGetObjectLabelDirectEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid *")
    public static long alGetPointerEXT(@org.lwjgl.system.NativeType("ALenum") int r4) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetPointerEXT
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r4
            r1 = r5
            long r0 = org.lwjgl.system.JNI.invokeP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ALvoid *")
    public static long alGetPointerDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r6, @org.lwjgl.system.NativeType("ALenum") int r8) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetPointerDirectEXT
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L17:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2)
            return r0
    }

    public static void nalGetPointervEXT(int r6, long r7) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetPointervEXT
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.system.JNI.invokePV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetPointervEXT(@org.lwjgl.system.NativeType("ALenum") int r4, @org.lwjgl.system.NativeType("ALvoid **") org.lwjgl.PointerBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nalGetPointervEXT(r0, r1)
            return
    }

    public static void nalGetPointervDirectEXT(long r8, int r10, long r11) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetPointervDirectEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetPointervDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r6, @org.lwjgl.system.NativeType("ALenum") int r8, @org.lwjgl.system.NativeType("ALvoid **") org.lwjgl.PointerBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nalGetPointervDirectEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDebugMessageControlEXT(@org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALenum") int r10, @org.lwjgl.system.NativeType("ALenum") int r11, @org.lwjgl.system.NativeType("ALuint const *") int[] r12, @org.lwjgl.system.NativeType("ALboolean") boolean r13) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDebugMessageControlEXT
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            int r3 = org.lwjgl.system.Checks.lengthSafe(r3)
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.system.JNI.invokePV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alDebugMessageControlDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r11, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALenum") int r14, @org.lwjgl.system.NativeType("ALenum") int r15, @org.lwjgl.system.NativeType("ALuint const *") int[] r16, @org.lwjgl.system.NativeType("ALboolean") boolean r17) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alDebugMessageControlDirectEXT
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            int r4 = org.lwjgl.system.Checks.lengthSafe(r4)
            r5 = r16
            r6 = r17
            r7 = r18
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @org.lwjgl.system.NativeType("ALuint")
    public static int alGetDebugMessageLogEXT(@org.lwjgl.system.NativeType("ALenum *") int[] r12, @org.lwjgl.system.NativeType("ALenum *") int[] r13, @org.lwjgl.system.NativeType("ALuint *") int[] r14, @org.lwjgl.system.NativeType("ALenum *") int[] r15, @org.lwjgl.system.NativeType("ALsizei *") int[] r16, @org.lwjgl.system.NativeType("ALchar *") java.nio.ByteBuffer r17) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetDebugMessageLogEXT
            r18 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L35
            r0 = r18
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = r12
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r14
            r1 = r12
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r15
            r1 = r12
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r16
            r1 = r12
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L35:
            r0 = r12
            int r0 = org.lwjgl.system.Checks.lengthSafe(r0)
            r1 = r17
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            long r7 = org.lwjgl.system.MemoryUtil.memAddressSafe(r7)
            r8 = r18
            int r0 = org.lwjgl.system.JNI.invokePPPPPPI(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @org.lwjgl.system.NativeType("ALuint")
    public static int alGetDebugMessageLogDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r14, @org.lwjgl.system.NativeType("ALenum *") int[] r16, @org.lwjgl.system.NativeType("ALenum *") int[] r17, @org.lwjgl.system.NativeType("ALuint *") int[] r18, @org.lwjgl.system.NativeType("ALenum *") int[] r19, @org.lwjgl.system.NativeType("ALsizei *") int[] r20, @org.lwjgl.system.NativeType("ALchar *") java.nio.ByteBuffer r21) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetDebugMessageLogDirectEXT
            r22 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L3c
            r0 = r22
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r17
            r1 = r16
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r18
            r1 = r16
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r19
            r1 = r16
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r20
            r1 = r16
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L3c:
            r0 = r14
            r1 = r16
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            r2 = r21
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            long r8 = org.lwjgl.system.MemoryUtil.memAddressSafe(r8)
            r9 = r22
            int r0 = org.lwjgl.system.JNI.invokePPPPPPPI(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetObjectLabelEXT(@org.lwjgl.system.NativeType("ALenum") int r9, @org.lwjgl.system.NativeType("ALuint") int r10, @org.lwjgl.system.NativeType("ALsizei *") int[] r11, @org.lwjgl.system.NativeType("ALchar *") java.nio.ByteBuffer r12) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetObjectLabelEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r11
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r13
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4, r5)
            return
    }

    @org.lwjgl.system.NativeType("ALvoid")
    public static void alGetObjectLabelDirectEXT(@org.lwjgl.system.NativeType("ALCcontext *") long r11, @org.lwjgl.system.NativeType("ALenum") int r13, @org.lwjgl.system.NativeType("ALuint") int r14, @org.lwjgl.system.NativeType("ALsizei *") int[] r15, @org.lwjgl.system.NativeType("ALchar *") java.nio.ByteBuffer r16) {
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.getICD()
            long r0 = r0.alGetObjectLabelDirectEXT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1f:
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r16
            int r3 = org.lwjgl.system.Checks.remainingSafe(r3)
            r4 = r15
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r17
            org.lwjgl.system.JNI.invokePPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }
}
