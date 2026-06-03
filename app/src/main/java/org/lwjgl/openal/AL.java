package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL.class */
public final class AL {
    static long alContext;
    static org.lwjgl.openal.ALCdevice alcDevice;
    static org.lwjgl.openal.ALCCapabilities alContextCaps;
    static org.lwjgl.openal.ALCapabilities alCaps;
    private static boolean created_lwjgl2;

    @javax.annotation.Nullable
    private static org.lwjgl.openal.ALCapabilities processCaps;
    private static final java.lang.ThreadLocal<org.lwjgl.openal.ALCapabilities> capabilitiesTLS = null;
    private static org.lwjgl.openal.AL.ICD icd;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL$1.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL$1.class
     */
    /* JADX INFO: renamed from: org.lwjgl.openal.AL$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL$1.class */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL$ICD.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL$ICD.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL$ICD.class */
    private interface ICD {
        default void set(@javax.annotation.Nullable org.lwjgl.openal.ALCapabilities r2) {
                r1 = this;
                return
        }

        @javax.annotation.Nullable
        org.lwjgl.openal.ALCapabilities get();
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL$ICDStatic.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL$ICDStatic.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL$ICDStatic.class */
    private static class ICDStatic implements org.lwjgl.openal.AL.ICD {

        @javax.annotation.Nullable
        private static org.lwjgl.openal.ALCapabilities tempCaps;

        /* JADX WARN: Classes with same name are omitted, all sources:
          DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL$ICDStatic$WriteOnce.class
          DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL$ICDStatic$WriteOnce.class
         */
        /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/AL$ICDStatic$WriteOnce.class */
        private static final class WriteOnce {
            static final org.lwjgl.openal.ALCapabilities caps = null;

            private WriteOnce() {
                    r2 = this;
                    r0 = r2
                    r0.<init>()
                    return
            }

            static {
                    org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.ICDStatic.access$200()
                    r4 = r0
                    r0 = r4
                    if (r0 != 0) goto L12
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "No ALCapabilities instance has been set"
                    r1.<init>(r2)
                    throw r0
                L12:
                    r0 = r4
                    org.lwjgl.openal.AL.ICDStatic.WriteOnce.caps = r0
                    return
            }
        }

        private ICDStatic() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // org.lwjgl.openal.AL.ICD
        public void set(@javax.annotation.Nullable org.lwjgl.openal.ALCapabilities r4) {
                r3 = this;
                org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.ICDStatic.tempCaps
                if (r0 != 0) goto Ld
                r0 = r4
                org.lwjgl.openal.AL.ICDStatic.tempCaps = r0
                goto L36
            Ld:
                r0 = r4
                if (r0 == 0) goto L36
                r0 = r4
                org.lwjgl.openal.ALCapabilities r1 = org.lwjgl.openal.AL.ICDStatic.tempCaps
                if (r0 == r1) goto L36
                org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.ICDStatic.tempCaps
                org.lwjgl.PointerBuffer r0 = r0.addresses
                r1 = r4
                org.lwjgl.PointerBuffer r1 = r1.addresses
                boolean r0 = org.lwjgl.system.ThreadLocalUtil.areCapabilitiesDifferent(r0, r1)
                if (r0 == 0) goto L36
                java.lang.String r0 = "[WARNING] Incompatible context detected. Falling back to thread/process lookup for AL contexts."
                org.lwjgl.system.APIUtil.apiLog(r0)
                void r0 = org.lwjgl.openal.AL::getCapabilities
                org.lwjgl.openal.AL$ICD r0 = org.lwjgl.openal.AL.access$102(r0)
            L36:
                return
        }

        @Override // org.lwjgl.openal.AL.ICD
        public org.lwjgl.openal.ALCapabilities get() {
                r2 = this;
                org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.ICDStatic.WriteOnce.caps
                return r0
        }

        /* synthetic */ ICDStatic(org.lwjgl.openal.AL.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static /* synthetic */ org.lwjgl.openal.ALCapabilities access$200() {
                org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.ICDStatic.tempCaps
                return r0
        }
    }

    public static void create(java.lang.String r6, int r7, int r8, boolean r9) throws org.lwjgl.LWJGLException {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 1
            create(r0, r1, r2, r3, r4)
            return
    }

    public static void create(java.lang.String r5, int r6, int r7, boolean r8, boolean r9) throws org.lwjgl.LWJGLException {
            long r0 = org.lwjgl.openal.AL.alContext
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lac
            r0 = r9
            if (r0 == 0) goto Lac
            r0 = r5
            long r0 = org.lwjgl.openal.ALC10.alcOpenDevice(r0)
            r10 = r0
            r0 = r10
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L24
            org.lwjgl.LWJGLException r0 = new org.lwjgl.LWJGLException
            r1 = r0
            java.lang.String r2 = "Cannot open the device"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = 16
            java.nio.IntBuffer r0 = org.lwjgl.BufferUtils.createIntBuffer(r0)
            r12 = r0
            r0 = r12
            r1 = 4103(0x1007, float:5.75E-42)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r12
            r1 = r6
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r12
            r1 = 4104(0x1008, float:5.751E-42)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r12
            r1 = r7
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r12
            r1 = 4105(0x1009, float:5.752E-42)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r12
            r1 = r8
            if (r1 == 0) goto L5e
            r1 = 1
            goto L5f
        L5e:
            r1 = 0
        L5f:
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r12
            r1 = 0
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r12
            java.nio.Buffer r0 = r0.flip()
            r0 = r10
            r1 = r12
            long r0 = org.lwjgl.openal.ALC10.alcCreateContext(r0, r1)
            r13 = r0
            r0 = r13
            boolean r0 = org.lwjgl.openal.ALC10.alcMakeContextCurrent(r0)
            r0 = r13
            r1 = 0
            java.nio.IntBuffer r1 = (java.nio.IntBuffer) r1
            long r0 = org.lwjgl.openal.ALC10.alcCreateContext(r0, r1)
            org.lwjgl.openal.AL.alContext = r0
            r0 = r10
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.createCapabilities(r0)
            org.lwjgl.openal.AL.alContextCaps = r0
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.AL.alContextCaps
            org.lwjgl.openal.ALCapabilities r0 = createCapabilities(r0)
            org.lwjgl.openal.AL.alCaps = r0
            org.lwjgl.openal.ALCdevice r0 = new org.lwjgl.openal.ALCdevice
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            org.lwjgl.openal.AL.alcDevice = r0
            r0 = 1
            org.lwjgl.openal.AL.created_lwjgl2 = r0
        Lac:
            return
    }

    public static void create() throws org.lwjgl.LWJGLException {
            long r0 = org.lwjgl.openal.AL.alContext
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L92
            r0 = 0
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            long r0 = org.lwjgl.openal.ALC10.alcOpenDevice(r0)
            r5 = r0
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L20
            org.lwjgl.LWJGLException r0 = new org.lwjgl.LWJGLException
            r1 = r0
            java.lang.String r2 = "Cannot open the device"
            r1.<init>(r2)
            throw r0
        L20:
            r0 = 16
            java.nio.IntBuffer r0 = org.lwjgl.BufferUtils.createIntBuffer(r0)
            r7 = r0
            r0 = r7
            r1 = 4103(0x1007, float:5.75E-42)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r7
            r1 = 44100(0xac44, float:6.1797E-41)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r7
            r1 = 4104(0x1008, float:5.751E-42)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r7
            r1 = 60
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r7
            r1 = 4105(0x1009, float:5.752E-42)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r7
            r1 = 0
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r7
            r1 = 0
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r7
            java.nio.Buffer r0 = r0.flip()
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.openal.ALC10.alcCreateContext(r0, r1)
            r8 = r0
            r0 = r8
            boolean r0 = org.lwjgl.openal.ALC10.alcMakeContextCurrent(r0)
            r0 = r8
            r1 = 0
            java.nio.IntBuffer r1 = (java.nio.IntBuffer) r1
            long r0 = org.lwjgl.openal.ALC10.alcCreateContext(r0, r1)
            org.lwjgl.openal.AL.alContext = r0
            r0 = r5
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.createCapabilities(r0)
            org.lwjgl.openal.AL.alContextCaps = r0
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.AL.alContextCaps
            org.lwjgl.openal.ALCapabilities r0 = createCapabilities(r0)
            org.lwjgl.openal.AL.alCaps = r0
            org.lwjgl.openal.ALCdevice r0 = new org.lwjgl.openal.ALCdevice
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            org.lwjgl.openal.AL.alcDevice = r0
            r0 = 1
            org.lwjgl.openal.AL.created_lwjgl2 = r0
        L92:
            return
    }

    public static boolean isCreated() {
            boolean r0 = org.lwjgl.openal.AL.created_lwjgl2
            return r0
    }

    public static org.lwjgl.openal.ALCdevice getDevice() {
            org.lwjgl.openal.ALCdevice r0 = org.lwjgl.openal.AL.alcDevice
            return r0
    }

    private AL() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static void init() {
            return
    }

    public static void destroy() {
            boolean r0 = org.lwjgl.openal.AL.created_lwjgl2
            if (r0 == 0) goto L29
            r0 = 0
            boolean r0 = org.lwjgl.openal.ALC10.alcMakeContextCurrent(r0)
            long r0 = org.lwjgl.openal.AL.alContext
            org.lwjgl.openal.ALC10.alcDestroyContext(r0)
            org.lwjgl.openal.ALCdevice r0 = org.lwjgl.openal.AL.alcDevice
            long r0 = r0.device
            boolean r0 = org.lwjgl.openal.ALC10.alcCloseDevice(r0)
            r0 = -1
            org.lwjgl.openal.AL.alContext = r0
            r0 = 0
            org.lwjgl.openal.AL.alcDevice = r0
            r0 = 0
            org.lwjgl.openal.AL.created_lwjgl2 = r0
        L29:
            r0 = 0
            setCurrentProcess(r0)
            return
    }

    public static void setCurrentProcess(@javax.annotation.Nullable org.lwjgl.openal.ALCapabilities r3) {
            r0 = r3
            org.lwjgl.openal.AL.processCaps = r0
            java.lang.ThreadLocal<org.lwjgl.openal.ALCapabilities> r0 = org.lwjgl.openal.AL.capabilitiesTLS
            r1 = 0
            r0.set(r1)
            org.lwjgl.openal.AL$ICD r0 = org.lwjgl.openal.AL.icd
            r1 = r3
            r0.set(r1)
            return
    }

    public static void setCurrentThread(@javax.annotation.Nullable org.lwjgl.openal.ALCapabilities r3) {
            java.lang.ThreadLocal<org.lwjgl.openal.ALCapabilities> r0 = org.lwjgl.openal.AL.capabilitiesTLS
            r1 = r3
            r0.set(r1)
            org.lwjgl.openal.AL$ICD r0 = org.lwjgl.openal.AL.icd
            r1 = r3
            r0.set(r1)
            return
    }

    public static org.lwjgl.openal.ALCapabilities getCapabilities() {
            java.lang.ThreadLocal<org.lwjgl.openal.ALCapabilities> r0 = org.lwjgl.openal.AL.capabilitiesTLS
            java.lang.Object r0 = r0.get()
            org.lwjgl.openal.ALCapabilities r0 = (org.lwjgl.openal.ALCapabilities) r0
            r2 = r0
            r0 = r2
            if (r0 != 0) goto L12
            org.lwjgl.openal.ALCapabilities r0 = org.lwjgl.openal.AL.processCaps
            r2 = r0
        L12:
            r0 = r2
            org.lwjgl.openal.ALCapabilities r0 = checkCapabilities(r0)
            return r0
    }

    private static org.lwjgl.openal.ALCapabilities checkCapabilities(@javax.annotation.Nullable org.lwjgl.openal.ALCapabilities r4) {
            r0 = r4
            if (r0 != 0) goto Le
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "No ALCapabilities instance set for the current thread or process. Possible solutions:\n\ta) Call AL.createCapabilities() after making a context current.\n\tb) Call AL.setCurrentProcess() or AL.setCurrentThread() if an ALCapabilities instance already exists."
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r4
            return r0
    }

    public static org.lwjgl.openal.ALCapabilities createCapabilities(org.lwjgl.openal.ALCCapabilities r3) {
            r0 = r3
            r1 = 0
            org.lwjgl.openal.ALCapabilities r0 = createCapabilities(r0, r1)
            return r0
    }

    public static org.lwjgl.openal.ALCapabilities createCapabilities(org.lwjgl.openal.ALCCapabilities r8, @javax.annotation.Nullable java.util.function.IntFunction<org.lwjgl.PointerBuffer> r9) {
            org.lwjgl.system.FunctionProviderLocal r0 = org.lwjgl.openal.ALC.getFunctionProvider()
            r1 = 0
            java.lang.String r2 = "alGetProcAddress"
            long r0 = r0.getFunctionAddress(r1, r2)
            r10 = r0
            r0 = r10
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1c
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "A core AL function is missing. Make sure that the OpenAL library has been loaded correctly."
            r1.<init>(r2)
            throw r0
        L1c:
            r0 = r10
            org.lwjgl.openal.ALCapabilities r0 = (v1) -> { // org.lwjgl.system.FunctionProvider.getFunctionAddress(java.nio.ByteBuffer):long
                return lambda$createCapabilities$0(r0, v1);
            }
            r12 = r0
            r0 = r12
            java.lang.String r1 = "alGetString"
            long r0 = r0.getFunctionAddress(r1)
            r13 = r0
            r0 = r12
            java.lang.String r1 = "alGetError"
            long r0 = r0.getFunctionAddress(r1)
            r15 = r0
            r0 = r12
            java.lang.String r1 = "alIsExtensionPresent"
            long r0 = r0.getFunctionAddress(r1)
            r17 = r0
            r0 = r13
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L5a
            r0 = r15
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L5a
            r0 = r17
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L64
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Core OpenAL functions could not be found. Make sure that the OpenAL library has been loaded correctly."
            r1.<init>(r2)
            throw r0
        L64:
            r0 = 45058(0xb002, float:6.314E-41)
            r1 = r13
            long r0 = org.lwjgl.system.JNI.invokeP(r0, r1)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            r19 = r0
            r0 = r19
            if (r0 == 0) goto L7d
            r0 = r15
            int r0 = org.lwjgl.system.JNI.invokeI(r0)
            if (r0 == 0) goto L87
        L7d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "There is no OpenAL context current in the current thread or process."
            r1.<init>(r2)
            throw r0
        L87:
            r0 = r19
            org.lwjgl.system.APIUtil$APIVersion r0 = org.lwjgl.system.APIUtil.apiParseVersion(r0)
            r20 = r0
            r0 = r20
            int r0 = r0.major
            r21 = r0
            r0 = r20
            int r0 = r0.minor
            r22 = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 2
            int[] r3 = new int[r3]
            r4 = r3
            r5 = 0
            r6 = 0
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 1
            r4[r5] = r6
            r1[r2] = r3
            r23 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = 32
            r1.<init>(r2)
            r24 = r0
            r0 = 1
            r25 = r0
        Lbe:
            r0 = r25
            r1 = r23
            int r1 = r1.length
            if (r0 > r1) goto L12b
            r0 = r23
            r1 = r25
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r26 = r0
            r0 = r26
            r27 = r0
            r0 = r27
            int r0 = r0.length
            r28 = r0
            r0 = 0
            r29 = r0
        Ldb:
            r0 = r29
            r1 = r28
            if (r0 >= r1) goto L125
            r0 = r27
            r1 = r29
            r0 = r0[r1]
            r30 = r0
            r0 = r25
            r1 = r21
            if (r0 < r1) goto Lfe
            r0 = r25
            r1 = r21
            if (r0 != r1) goto L11f
            r0 = r30
            r1 = r22
            if (r0 > r1) goto L11f
        Lfe:
            r0 = r24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "OpenAL"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r25
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r30
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        L11f:
            int r29 = r29 + 1
            goto Ldb
        L125:
            int r25 = r25 + 1
            goto Lbe
        L12b:
            r0 = 45060(0xb004, float:6.3143E-41)
            r1 = r13
            long r0 = org.lwjgl.system.JNI.invokeP(r0, r1)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            r25 = r0
            r0 = r25
            if (r0 == 0) goto L1dc
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r26 = r0
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r1 = r0
            r2 = r25
            r1.<init>(r2)
            r27 = r0
        L14c:
            r0 = r27
            boolean r0 = r0.hasMoreTokens()
            if (r0 == 0) goto L1dc
            r0 = r27
            java.lang.String r0 = r0.nextToken()
            r28 = r0
            r0 = r26
            org.lwjgl.system.MemoryStack r0 = r0.push()
            r29 = r0
            r0 = 0
            r30 = r0
            r0 = r29
            r1 = r28
            r2 = 1
            java.nio.ByteBuffer r0 = r0.ASCII(r1, r2)     // Catch: java.lang.Throwable -> L1a8 java.lang.Throwable -> L1b1
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L1a8 java.lang.Throwable -> L1b1
            r1 = r17
            boolean r0 = org.lwjgl.system.JNI.invokePZ(r0, r1)     // Catch: java.lang.Throwable -> L1a8 java.lang.Throwable -> L1b1
            if (r0 == 0) goto L182
            r0 = r24
            r1 = r28
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L1a8 java.lang.Throwable -> L1b1
        L182:
            r0 = r29
            if (r0 == 0) goto L1d9
            r0 = r30
            if (r0 == 0) goto L1a0
            r0 = r29
            r0.close()     // Catch: java.lang.Throwable -> L194
            goto L1d9
        L194:
            r31 = move-exception
            r0 = r30
            r1 = r31
            r0.addSuppressed(r1)
            goto L1d9
        L1a0:
            r0 = r29
            r0.close()
            goto L1d9
        L1a8:
            r31 = move-exception
            r0 = r31
            r30 = r0
            r0 = r31
            throw r0     // Catch: java.lang.Throwable -> L1b1
        L1b1:
            r32 = move-exception
            r0 = r29
            if (r0 == 0) goto L1d6
            r0 = r30
            if (r0 == 0) goto L1d1
            r0 = r29
            r0.close()     // Catch: java.lang.Throwable -> L1c5
            goto L1d6
        L1c5:
            r33 = move-exception
            r0 = r30
            r1 = r33
            r0.addSuppressed(r1)
            goto L1d6
        L1d1:
            r0 = r29
            r0.close()
        L1d6:
            r0 = r32
            throw r0
        L1d9:
            goto L14c
        L1dc:
            r0 = r8
            boolean r0 = r0.ALC_EXT_EFX
            if (r0 == 0) goto L1ed
            r0 = r24
            java.lang.String r1 = "ALC_EXT_EFX"
            boolean r0 = r0.add(r1)
        L1ed:
            r0 = r24
            org.lwjgl.system.Configuration<java.lang.Object> r1 = org.lwjgl.system.Configuration.OPENAL_EXTENSION_FILTER
            org.lwjgl.system.APIUtil.apiFilterExtensions(r0, r1)
            org.lwjgl.openal.ALCapabilities r0 = new org.lwjgl.openal.ALCapabilities
            r1 = r0
            r2 = r12
            r3 = r24
            r4 = r9
            if (r4 != 0) goto L209
            org.lwjgl.openal.ALCapabilities r4 = org.lwjgl.BufferUtils::createPointerBuffer
            goto L20a
        L209:
            r4 = r9
        L20a:
            r1.<init>(r2, r3, r4)
            r26 = r0
            r0 = r8
            boolean r0 = r0.ALC_EXT_thread_local_context
            if (r0 == 0) goto L226
            long r0 = org.lwjgl.openal.EXTThreadLocalContext.alcGetThreadContext()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L226
            r0 = r26
            setCurrentThread(r0)
            goto L22b
        L226:
            r0 = r26
            setCurrentProcess(r0)
        L22b:
            r0 = r26
            return r0
    }

    static org.lwjgl.openal.ALCapabilities getICD() {
            org.lwjgl.openal.AL$ICD r0 = org.lwjgl.openal.AL.icd
            org.lwjgl.openal.ALCapabilities r0 = r0.get()
            java.lang.Object r0 = org.lwjgl.openal.ALC.check(r0)
            org.lwjgl.openal.ALCapabilities r0 = (org.lwjgl.openal.ALCapabilities) r0
            return r0
    }

    private static /* synthetic */ long lambda$createCapabilities$0(long r5, java.nio.ByteBuffer r7) {
            r0 = r7
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r5
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1)
            r8 = r0
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1b
            boolean r0 = org.lwjgl.system.Checks.DEBUG_FUNCTIONS
            if (r0 == 0) goto L1b
            java.lang.String r0 = "AL"
            r1 = r7
            org.lwjgl.system.APIUtil.apiLogMissing(r0, r1)
        L1b:
            r0 = r8
            return r0
    }

    static /* synthetic */ org.lwjgl.openal.AL.ICD access$102(org.lwjgl.openal.AL.ICD r3) {
            r0 = r3
            r1 = r0
            org.lwjgl.openal.AL.icd = r1
            return r0
    }

    static {
            r0 = 0
            org.lwjgl.openal.AL.created_lwjgl2 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r1 = r0
            r1.<init>()
            org.lwjgl.openal.AL.capabilitiesTLS = r0
            org.lwjgl.openal.AL$ICDStatic r0 = new org.lwjgl.openal.AL$ICDStatic
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            org.lwjgl.openal.AL.icd = r0
            return
    }
}
