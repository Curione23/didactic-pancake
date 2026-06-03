package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC.class */
public final class ALC {

    @javax.annotation.Nullable
    private static org.lwjgl.system.FunctionProviderLocal functionProvider;

    @javax.annotation.Nullable
    private static org.lwjgl.openal.ALCCapabilities router;
    private static final java.lang.ThreadLocal<org.lwjgl.openal.ALCCapabilities> capabilitiesTLS = null;

    @javax.annotation.Nullable
    private static org.lwjgl.openal.ALC.ICD icd;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC$1.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC$1.class
     */
    /* JADX INFO: renamed from: org.lwjgl.openal.ALC$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$lwjgl$system$Platform = null;

        static {
                org.lwjgl.system.Platform[] r0 = org.lwjgl.system.Platform.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.lwjgl.openal.ALC.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform = r0
                int[] r0 = org.lwjgl.openal.ALC.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform     // Catch: java.lang.NoSuchFieldError -> L17
                org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.LINUX     // Catch: java.lang.NoSuchFieldError -> L17
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L17
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L17
                goto L18
            L17:
                r4 = move-exception
            L18:
                int[] r0 = org.lwjgl.openal.ALC.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform     // Catch: java.lang.NoSuchFieldError -> L26
                org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.MACOSX     // Catch: java.lang.NoSuchFieldError -> L26
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L26
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L26
                goto L27
            L26:
                r4 = move-exception
            L27:
                int[] r0 = org.lwjgl.openal.ALC.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform     // Catch: java.lang.NoSuchFieldError -> L35
                org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.WINDOWS     // Catch: java.lang.NoSuchFieldError -> L35
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L35
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L35
                goto L36
            L35:
                r4 = move-exception
            L36:
                return
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC$ICD.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC$ICD.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC$ICD.class */
    private interface ICD {
        default void set(@javax.annotation.Nullable org.lwjgl.openal.ALCCapabilities r2) {
                r1 = this;
                return
        }

        @javax.annotation.Nullable
        org.lwjgl.openal.ALCCapabilities get();
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC$ICDStatic.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC$ICDStatic.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC$ICDStatic.class */
    private static class ICDStatic implements org.lwjgl.openal.ALC.ICD {

        @javax.annotation.Nullable
        private static org.lwjgl.openal.ALCCapabilities tempCaps;

        /* JADX WARN: Classes with same name are omitted, all sources:
          DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC$ICDStatic$WriteOnce.class
          DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC$ICDStatic$WriteOnce.class
         */
        /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC$ICDStatic$WriteOnce.class */
        private static final class WriteOnce {
            static final org.lwjgl.openal.ALCCapabilities caps = null;

            private WriteOnce() {
                    r2 = this;
                    r0 = r2
                    r0.<init>()
                    return
            }

            static {
                    org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.ICDStatic.access$200()
                    r4 = r0
                    r0 = r4
                    if (r0 != 0) goto L12
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "No ALCCapabilities instance has been set"
                    r1.<init>(r2)
                    throw r0
                L12:
                    r0 = r4
                    org.lwjgl.openal.ALC.ICDStatic.WriteOnce.caps = r0
                    return
            }
        }

        private ICDStatic() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // org.lwjgl.openal.ALC.ICD
        public void set(@javax.annotation.Nullable org.lwjgl.openal.ALCCapabilities r4) {
                r3 = this;
                org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.ICDStatic.tempCaps
                if (r0 != 0) goto Ld
                r0 = r4
                org.lwjgl.openal.ALC.ICDStatic.tempCaps = r0
                goto L36
            Ld:
                r0 = r4
                if (r0 == 0) goto L36
                r0 = r4
                org.lwjgl.openal.ALCCapabilities r1 = org.lwjgl.openal.ALC.ICDStatic.tempCaps
                if (r0 == r1) goto L36
                org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.ICDStatic.tempCaps
                org.lwjgl.PointerBuffer r0 = r0.addresses
                r1 = r4
                org.lwjgl.PointerBuffer r1 = r1.addresses
                boolean r0 = org.lwjgl.system.ThreadLocalUtil.areCapabilitiesDifferent(r0, r1)
                if (r0 == 0) goto L36
                java.lang.String r0 = "[WARNING] Incompatible context detected. Falling back to thread/process lookup for AL contexts."
                org.lwjgl.system.APIUtil.apiLog(r0)
                void r0 = org.lwjgl.openal.ALC::getCapabilities
                org.lwjgl.openal.ALC$ICD r0 = org.lwjgl.openal.ALC.access$102(r0)
            L36:
                return
        }

        @Override // org.lwjgl.openal.ALC.ICD
        public org.lwjgl.openal.ALCCapabilities get() {
                r2 = this;
                org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.ICDStatic.WriteOnce.caps
                return r0
        }

        /* synthetic */ ICDStatic(org.lwjgl.openal.ALC.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static /* synthetic */ org.lwjgl.openal.ALCCapabilities access$200() {
                org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.ICDStatic.tempCaps
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC$SharedLibraryAL.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC$SharedLibraryAL.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALC$SharedLibraryAL.class */
    private static class SharedLibraryAL extends org.lwjgl.system.SharedLibrary.Delegate implements org.lwjgl.system.FunctionProviderLocal {
        private final long alcGetProcAddress;

        protected SharedLibraryAL(org.lwjgl.system.SharedLibrary r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r0.<init>(r1)
                r0 = r5
                r1 = r5
                java.lang.String r2 = "alcGetProcAddress"
                long r1 = r1.getFunctionAddress(r2)
                r0.alcGetProcAddress = r1
                r0 = r5
                long r0 = r0.alcGetProcAddress
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L22
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.String r2 = "A core ALC function is missing. Make sure that the OpenAL library has been loaded correctly."
                r1.<init>(r2)
                throw r0
            L22:
                return
        }

        @Override // org.lwjgl.system.FunctionProvider
        public long getFunctionAddress(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                org.lwjgl.system.SharedLibrary r0 = r0.library
                r1 = r6
                long r0 = r0.getFunctionAddress(r1)
                r7 = r0
                r0 = r7
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L1d
                boolean r0 = org.lwjgl.system.Checks.DEBUG_FUNCTIONS
                if (r0 == 0) goto L1d
                java.lang.String r0 = "ALC core"
                r1 = r6
                org.lwjgl.system.APIUtil.apiLogMissing(r0, r1)
            L1d:
                r0 = r7
                return r0
        }

        @Override // org.lwjgl.system.FunctionProviderLocal
        public long getFunctionAddress(long r8, java.nio.ByteBuffer r10) {
                r7 = this;
                r0 = r7
                org.lwjgl.system.SharedLibrary r0 = r0.library
                r1 = r10
                long r0 = r0.getFunctionAddress(r1)
                r11 = r0
                r0 = r11
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L27
                r0 = r8
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L27
                r0 = r8
                r1 = r10
                long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
                r2 = r7
                long r2 = r2.alcGetProcAddress
                long r0 = org.lwjgl.system.JNI.invokePPP(r0, r1, r2)
                r11 = r0
            L27:
                r0 = r11
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L3a
                boolean r0 = org.lwjgl.system.Checks.DEBUG_FUNCTIONS
                if (r0 == 0) goto L3a
                java.lang.String r0 = "ALC"
                r1 = r10
                org.lwjgl.system.APIUtil.apiLogMissing(r0, r1)
            L3a:
                r0 = r11
                return r0
        }
    }

    private ALC() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void create() {
            int[] r0 = org.lwjgl.openal.ALC.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.get()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L24;
                case 2: goto L24;
                case 3: goto L2a;
                default: goto L30;
            }
        L24:
            java.lang.String r0 = "openal"
            r3 = r0
            goto L38
        L2a:
            java.lang.String r0 = "OpenAL"
            r3 = r0
            goto L38
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L38:
            org.lwjgl.system.Configuration<java.lang.String> r0 = org.lwjgl.system.Configuration.OPENAL_LIBRARY_NAME
            r1 = r3
            java.lang.String r1 = org.lwjgl.system.Platform.mapLibraryNameBundled(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            create(r0)
            return
    }

    public static void create(java.lang.String r5) {
            java.lang.Class<org.lwjgl.openal.ALC> r0 = org.lwjgl.openal.ALC.class
            java.lang.String r1 = "org.lwjgl.openal"
            r2 = r5
            r3 = 1
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2, r3)
            r6 = r0
            org.lwjgl.openal.ALC$SharedLibraryAL r0 = new org.lwjgl.openal.ALC$SharedLibraryAL     // Catch: java.lang.RuntimeException -> L18
            r1 = r0
            r2 = r6
            r1.<init>(r2)     // Catch: java.lang.RuntimeException -> L18
            create(r0)     // Catch: java.lang.RuntimeException -> L18
            goto L21
        L18:
            r7 = move-exception
            r0 = r6
            r0.free()
            r0 = r7
            throw r0
        L21:
            return
    }

    public static void create(org.lwjgl.system.FunctionProviderLocal r4) {
            org.lwjgl.system.FunctionProviderLocal r0 = org.lwjgl.openal.ALC.functionProvider
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "ALC has already been created."
            r1.<init>(r2)
            throw r0
        L10:
            r0 = r4
            org.lwjgl.openal.ALC.functionProvider = r0
            r0 = 0
            org.lwjgl.openal.ALCCapabilities r0 = createCapabilities(r0)
            org.lwjgl.openal.ALC.router = r0
            org.lwjgl.openal.AL.init()
            return
    }

    public static void destroy() {
            org.lwjgl.system.FunctionProviderLocal r0 = org.lwjgl.openal.ALC.functionProvider
            if (r0 != 0) goto L7
            return
        L7:
            org.lwjgl.openal.AL.destroy()
            r0 = 0
            org.lwjgl.openal.ALC.router = r0
            org.lwjgl.system.FunctionProviderLocal r0 = org.lwjgl.openal.ALC.functionProvider
            boolean r0 = r0 instanceof org.lwjgl.system.NativeResource
            if (r0 == 0) goto L22
            org.lwjgl.system.FunctionProviderLocal r0 = org.lwjgl.openal.ALC.functionProvider
            org.lwjgl.system.NativeResource r0 = (org.lwjgl.system.NativeResource) r0
            r0.free()
        L22:
            r0 = 0
            org.lwjgl.openal.ALC.functionProvider = r0
            return
    }

    static <T> T check(@javax.annotation.Nullable T r4) {
            r0 = r4
            if (r0 != 0) goto Le
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "OpenAL library has not been loaded."
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r4
            return r0
    }

    public static org.lwjgl.system.FunctionProviderLocal getFunctionProvider() {
            org.lwjgl.system.FunctionProviderLocal r0 = org.lwjgl.openal.ALC.functionProvider
            java.lang.Object r0 = check(r0)
            org.lwjgl.system.FunctionProviderLocal r0 = (org.lwjgl.system.FunctionProviderLocal) r0
            return r0
    }

    public static void setCapabilities(@javax.annotation.Nullable org.lwjgl.openal.ALCCapabilities r4) {
            java.lang.ThreadLocal<org.lwjgl.openal.ALCCapabilities> r0 = org.lwjgl.openal.ALC.capabilitiesTLS
            r1 = r4
            r0.set(r1)
            org.lwjgl.openal.ALC$ICD r0 = org.lwjgl.openal.ALC.icd
            if (r0 != 0) goto L18
            org.lwjgl.openal.ALC$ICDStatic r0 = new org.lwjgl.openal.ALC$ICDStatic
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            org.lwjgl.openal.ALC.icd = r0
        L18:
            org.lwjgl.openal.ALC$ICD r0 = org.lwjgl.openal.ALC.icd
            r1 = r4
            r0.set(r1)
            return
    }

    public static org.lwjgl.openal.ALCCapabilities getCapabilities() {
            java.lang.ThreadLocal<org.lwjgl.openal.ALCCapabilities> r0 = org.lwjgl.openal.ALC.capabilitiesTLS
            java.lang.Object r0 = r0.get()
            org.lwjgl.openal.ALCCapabilities r0 = (org.lwjgl.openal.ALCCapabilities) r0
            r2 = r0
            r0 = r2
            if (r0 != 0) goto L12
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.router
            r2 = r0
        L12:
            r0 = r2
            org.lwjgl.openal.ALCCapabilities r0 = checkCapabilities(r0)
            return r0
    }

    private static org.lwjgl.openal.ALCCapabilities checkCapabilities(@javax.annotation.Nullable org.lwjgl.openal.ALCCapabilities r4) {
            r0 = r4
            if (r0 != 0) goto Le
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "No ALCCapabilities instance set"
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r4
            return r0
    }

    public static org.lwjgl.openal.ALCCapabilities createCapabilities(long r4) {
            r0 = r4
            r1 = 0
            org.lwjgl.openal.ALCCapabilities r0 = createCapabilities(r0, r1)
            return r0
    }

    public static org.lwjgl.openal.ALCCapabilities createCapabilities(long r9, @javax.annotation.Nullable java.util.function.IntFunction<org.lwjgl.PointerBuffer> r11) {
            org.lwjgl.system.FunctionProviderLocal r0 = getFunctionProvider()
            r12 = r0
            r0 = r12
            java.lang.String r1 = "alcGetIntegerv"
            long r0 = r0.getFunctionAddress(r1)
            r13 = r0
            r0 = r12
            java.lang.String r1 = "alcGetString"
            long r0 = r0.getFunctionAddress(r1)
            r15 = r0
            r0 = r12
            java.lang.String r1 = "alcIsExtensionPresent"
            long r0 = r0.getFunctionAddress(r1)
            r17 = r0
            r0 = r13
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L37
            r0 = r15
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L37
            r0 = r17
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L41
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Core ALC functions could not be found. Make sure that OpenAL has been loaded."
            r1.<init>(r2)
            throw r0
        L41:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r21 = r0
            r0 = 0
            r22 = r0
            r0 = r21
            r1 = 1
            java.nio.IntBuffer r0 = r0.mallocInt(r1)     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> Lae
            r23 = r0
            r0 = r9
            r1 = 4096(0x1000, float:5.74E-42)
            r2 = 1
            r3 = r23
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> Lae
            r4 = r13
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> Lae
            r0 = r23
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> Lae
            r19 = r0
            r0 = r9
            r1 = 4097(0x1001, float:5.741E-42)
            r2 = 1
            r3 = r23
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> Lae
            r4 = r13
            org.lwjgl.system.JNI.invokePPV(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> Lae
            r0 = r23
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> La5 java.lang.Throwable -> Lae
            r20 = r0
            r0 = r21
            if (r0 == 0) goto Ld6
            r0 = r22
            if (r0 == 0) goto L9d
            r0 = r21
            r0.close()     // Catch: java.lang.Throwable -> L91
            goto Ld6
        L91:
            r23 = move-exception
            r0 = r22
            r1 = r23
            r0.addSuppressed(r1)
            goto Ld6
        L9d:
            r0 = r21
            r0.close()
            goto Ld6
        La5:
            r23 = move-exception
            r0 = r23
            r22 = r0
            r0 = r23
            throw r0     // Catch: java.lang.Throwable -> Lae
        Lae:
            r24 = move-exception
            r0 = r21
            if (r0 == 0) goto Ld3
            r0 = r22
            if (r0 == 0) goto Lce
            r0 = r21
            r0.close()     // Catch: java.lang.Throwable -> Lc2
            goto Ld3
        Lc2:
            r25 = move-exception
            r0 = r22
            r1 = r25
            r0.addSuppressed(r1)
            goto Ld3
        Lce:
            r0 = r21
            r0.close()
        Ld3:
            r0 = r24
            throw r0
        Ld6:
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
            r21 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = 16
            r1.<init>(r2)
            r22 = r0
            r0 = 1
            r23 = r0
        Lf8:
            r0 = r23
            r1 = r21
            int r1 = r1.length
            if (r0 > r1) goto L165
            r0 = r21
            r1 = r23
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r24 = r0
            r0 = r24
            r25 = r0
            r0 = r25
            int r0 = r0.length
            r26 = r0
            r0 = 0
            r27 = r0
        L115:
            r0 = r27
            r1 = r26
            if (r0 >= r1) goto L15f
            r0 = r25
            r1 = r27
            r0 = r0[r1]
            r28 = r0
            r0 = r23
            r1 = r19
            if (r0 < r1) goto L138
            r0 = r23
            r1 = r19
            if (r0 != r1) goto L159
            r0 = r28
            r1 = r20
            if (r0 > r1) goto L159
        L138:
            r0 = r22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "OpenALC"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r23
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r28
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        L159:
            int r27 = r27 + 1
            goto L115
        L15f:
            int r23 = r23 + 1
            goto Lf8
        L165:
            r0 = r9
            r1 = 4102(0x1006, float:5.748E-42)
            r2 = r15
            long r0 = org.lwjgl.system.JNI.invokePP(r0, r1, r2)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            r23 = r0
            r0 = r23
            if (r0 == 0) goto L212
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r1 = r0
            r2 = r23
            r1.<init>(r2)
            r24 = r0
        L183:
            r0 = r24
            boolean r0 = r0.hasMoreTokens()
            if (r0 == 0) goto L212
            r0 = r24
            java.lang.String r0 = r0.nextToken()
            r25 = r0
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r26 = r0
            r0 = 0
            r27 = r0
            r0 = r9
            r1 = r26
            r2 = r25
            r3 = 1
            java.nio.ByteBuffer r1 = r1.ASCII(r2, r3)     // Catch: java.lang.Throwable -> L1de java.lang.Throwable -> L1e7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L1de java.lang.Throwable -> L1e7
            r2 = r17
            boolean r0 = org.lwjgl.system.JNI.invokePPZ(r0, r1, r2)     // Catch: java.lang.Throwable -> L1de java.lang.Throwable -> L1e7
            if (r0 == 0) goto L1b8
            r0 = r22
            r1 = r25
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L1de java.lang.Throwable -> L1e7
        L1b8:
            r0 = r26
            if (r0 == 0) goto L20f
            r0 = r27
            if (r0 == 0) goto L1d6
            r0 = r26
            r0.close()     // Catch: java.lang.Throwable -> L1ca
            goto L20f
        L1ca:
            r28 = move-exception
            r0 = r27
            r1 = r28
            r0.addSuppressed(r1)
            goto L20f
        L1d6:
            r0 = r26
            r0.close()
            goto L20f
        L1de:
            r28 = move-exception
            r0 = r28
            r27 = r0
            r0 = r28
            throw r0     // Catch: java.lang.Throwable -> L1e7
        L1e7:
            r29 = move-exception
            r0 = r26
            if (r0 == 0) goto L20c
            r0 = r27
            if (r0 == 0) goto L207
            r0 = r26
            r0.close()     // Catch: java.lang.Throwable -> L1fb
            goto L20c
        L1fb:
            r30 = move-exception
            r0 = r27
            r1 = r30
            r0.addSuppressed(r1)
            goto L20c
        L207:
            r0 = r26
            r0.close()
        L20c:
            r0 = r29
            throw r0
        L20f:
            goto L183
        L212:
            r0 = r22
            org.lwjgl.system.Configuration<java.lang.Object> r1 = org.lwjgl.system.Configuration.OPENAL_EXTENSION_FILTER
            org.lwjgl.system.APIUtil.apiFilterExtensions(r0, r1)
            org.lwjgl.openal.ALCCapabilities r0 = new org.lwjgl.openal.ALCCapabilities
            r1 = r0
            r2 = r12
            r3 = r9
            r4 = r22
            r5 = r11
            if (r5 != 0) goto L22e
            org.lwjgl.openal.ALCCapabilities r5 = org.lwjgl.BufferUtils::createPointerBuffer
            goto L22f
        L22e:
            r5 = r11
        L22f:
            r1.<init>(r2, r3, r4, r5)
            r24 = r0
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L23f
            r0 = r24
            setCapabilities(r0)
        L23f:
            r0 = r24
            return r0
    }

    static org.lwjgl.openal.ALCCapabilities getICD() {
            org.lwjgl.openal.ALC$ICD r0 = org.lwjgl.openal.ALC.icd
            if (r0 != 0) goto La
            r0 = 0
            goto L12
        La:
            org.lwjgl.openal.ALC$ICD r0 = org.lwjgl.openal.ALC.icd
            org.lwjgl.openal.ALCCapabilities r0 = r0.get()
        L12:
            r2 = r0
            r0 = r2
            if (r0 != 0) goto L1b
            org.lwjgl.openal.ALCCapabilities r0 = org.lwjgl.openal.ALC.router
            r2 = r0
        L1b:
            r0 = r2
            java.lang.Object r0 = check(r0)
            org.lwjgl.openal.ALCCapabilities r0 = (org.lwjgl.openal.ALCCapabilities) r0
            return r0
    }

    static /* synthetic */ org.lwjgl.openal.ALC.ICD access$102(org.lwjgl.openal.ALC.ICD r3) {
            r0 = r3
            r1 = r0
            org.lwjgl.openal.ALC.icd = r1
            return r0
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r1 = r0
            r1.<init>()
            org.lwjgl.openal.ALC.capabilitiesTLS = r0
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.OPENAL_EXPLICIT_INIT
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L20
            create()
        L20:
            return
    }
}
