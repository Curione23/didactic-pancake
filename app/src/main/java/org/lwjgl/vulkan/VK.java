package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK.class */
public final class VK {
    private static org.lwjgl.system.FunctionProvider functionProvider;
    private static org.lwjgl.vulkan.VK.GlobalCommands globalCommands;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK$1.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK$1.class
     */
    /* JADX INFO: renamed from: org.lwjgl.vulkan.VK$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$lwjgl$system$Platform = null;

        static {
                org.lwjgl.system.Platform[] r0 = org.lwjgl.system.Platform.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.lwjgl.vulkan.VK.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform = r0
                int[] r0 = org.lwjgl.vulkan.VK.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform     // Catch: java.lang.NoSuchFieldError -> L17
                org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.LINUX     // Catch: java.lang.NoSuchFieldError -> L17
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L17
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L17
                goto L18
            L17:
                r4 = move-exception
            L18:
                int[] r0 = org.lwjgl.vulkan.VK.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform     // Catch: java.lang.NoSuchFieldError -> L26
                org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.WINDOWS     // Catch: java.lang.NoSuchFieldError -> L26
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L26
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L26
                goto L27
            L26:
                r4 = move-exception
            L27:
                int[] r0 = org.lwjgl.vulkan.VK.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform     // Catch: java.lang.NoSuchFieldError -> L35
                org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.MACOSX     // Catch: java.lang.NoSuchFieldError -> L35
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
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK$GlobalCommands.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK$GlobalCommands.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VK$GlobalCommands.class */
    static final class GlobalCommands {
        final long vkGetInstanceProcAddr;
        final long vkCreateInstance;
        final long vkEnumerateInstanceExtensionProperties;
        final long vkEnumerateInstanceLayerProperties;
        final long vkEnumerateInstanceVersion;

        GlobalCommands(org.lwjgl.system.FunctionProvider r6) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                r1 = r6
                java.lang.String r2 = "vkGetInstanceProcAddr"
                long r1 = r1.getFunctionAddress(r2)
                r0.vkGetInstanceProcAddr = r1
                r0 = r5
                long r0 = r0.vkGetInstanceProcAddr
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L23
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "A critical function is missing. Make sure that Vulkan is available."
                r1.<init>(r2)
                throw r0
            L23:
                r0 = r5
                r1 = r5
                java.lang.String r2 = "vkCreateInstance"
                long r1 = r1.getFunctionAddress(r2)
                r0.vkCreateInstance = r1
                r0 = r5
                r1 = r5
                java.lang.String r2 = "vkEnumerateInstanceExtensionProperties"
                long r1 = r1.getFunctionAddress(r2)
                r0.vkEnumerateInstanceExtensionProperties = r1
                r0 = r5
                r1 = r5
                java.lang.String r2 = "vkEnumerateInstanceLayerProperties"
                long r1 = r1.getFunctionAddress(r2)
                r0.vkEnumerateInstanceLayerProperties = r1
                r0 = r5
                r1 = r5
                java.lang.String r2 = "vkEnumerateInstanceVersion"
                r3 = 0
                long r1 = r1.getFunctionAddress(r2, r3)
                r0.vkEnumerateInstanceVersion = r1
                return
        }

        private long getFunctionAddress(java.lang.String r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = 1
                long r0 = r0.getFunctionAddress(r1, r2)
                return r0
        }

        private long getFunctionAddress(java.lang.String r8, boolean r9) {
                r7 = this;
                org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
                r10 = r0
                r0 = 0
                r1 = r10
                r2 = r8
                java.nio.ByteBuffer r1 = r1.ASCII(r2)     // Catch: java.lang.Throwable -> L3a
                long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L3a
                r2 = r7
                long r2 = r2.vkGetInstanceProcAddr     // Catch: java.lang.Throwable -> L3a
                long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2)     // Catch: java.lang.Throwable -> L3a
                r11 = r0
                r0 = r11
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L2b
                r0 = r9
                if (r0 == 0) goto L2b
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L3a
                r1 = r0
                java.lang.String r2 = "A critical function is missing. Make sure that Vulkan is available."
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L3a
                throw r0     // Catch: java.lang.Throwable -> L3a
            L2b:
                r0 = r11
                r13 = r0
                r0 = r10
                if (r0 == 0) goto L37
                r0 = r10
                r0.close()
            L37:
                r0 = r13
                return r0
            L3a:
                r11 = move-exception
                r0 = r10
                if (r0 == 0) goto L50
                r0 = r10
                r0.close()     // Catch: java.lang.Throwable -> L47
                goto L50
            L47:
                r12 = move-exception
                r0 = r11
                r1 = r12
                r0.addSuppressed(r1)
            L50:
                r0 = r11
                throw r0
        }
    }

    private VK() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void create() {
            int[] r0 = org.lwjgl.vulkan.VK.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.get()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L24;
                case 2: goto L59;
                case 3: goto L70;
                default: goto La6;
            }
        L24:
            org.lwjgl.system.Configuration<java.lang.String> r0 = org.lwjgl.system.Configuration.VULKAN_LIBRARY_NAME
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L3e
            java.lang.Class<org.lwjgl.vulkan.VK> r0 = org.lwjgl.vulkan.VK.class
            java.lang.String r1 = "org.lwjgl.vulkan"
            r2 = r9
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2)
            r8 = r0
            goto Lae
        L3e:
            java.lang.Class<org.lwjgl.vulkan.VK> r0 = org.lwjgl.vulkan.VK.class
            java.lang.String r1 = "org.lwjgl.vulkan"
            java.lang.String r2 = "libvulkan.so"
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2)     // Catch: java.lang.Throwable -> L4b
            r8 = r0
            goto Lae
        L4b:
            r10 = move-exception
            java.lang.Class<org.lwjgl.vulkan.VK> r0 = org.lwjgl.vulkan.VK.class
            java.lang.String r1 = "org.lwjgl.vulkan"
            java.lang.String r2 = "libvulkan.so.1"
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2)
            r8 = r0
            goto Lae
        L59:
            java.lang.Class<org.lwjgl.vulkan.VK> r0 = org.lwjgl.vulkan.VK.class
            java.lang.String r1 = "org.lwjgl.vulkan"
            org.lwjgl.system.Configuration<java.lang.String> r2 = org.lwjgl.system.Configuration.VULKAN_LIBRARY_NAME
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "vulkan-1"
            r4[r5] = r6
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2, r3)
            r8 = r0
            goto Lae
        L70:
            org.lwjgl.system.Configuration<java.lang.String> r0 = org.lwjgl.system.Configuration.VULKAN_LIBRARY_NAME
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L8a
            java.lang.Class<org.lwjgl.vulkan.VK> r0 = org.lwjgl.vulkan.VK.class
            java.lang.String r1 = "org.lwjgl.vulkan"
            r2 = r9
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2)
            r8 = r0
            goto Lae
        L8a:
            java.lang.Class<org.lwjgl.vulkan.VK> r0 = org.lwjgl.vulkan.VK.class
            java.lang.String r1 = "org.lwjgl.vulkan"
            java.lang.String r2 = "MoltenVK"
            r3 = 1
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L98
            r8 = r0
            goto Lae
        L98:
            r10 = move-exception
            java.lang.Class<org.lwjgl.vulkan.VK> r0 = org.lwjgl.vulkan.VK.class
            java.lang.String r1 = "org.lwjgl.vulkan"
            java.lang.String r2 = "libvulkan.1.dylib"
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2)
            r8 = r0
            goto Lae
        La6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        Lae:
            r0 = r8
            create(r0)
            return
    }

    public static void create(java.lang.String r4) {
            java.lang.Class<org.lwjgl.vulkan.VK> r0 = org.lwjgl.vulkan.VK.class
            java.lang.String r1 = "org.lwjgl.vulkan"
            r2 = r4
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2)
            create(r0)
            return
    }

    public static void create(org.lwjgl.system.FunctionProvider r4) {
            org.lwjgl.system.FunctionProvider r0 = org.lwjgl.vulkan.VK.functionProvider
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Vulkan has already been created."
            r1.<init>(r2)
            throw r0
        L10:
            r0 = r4
            org.lwjgl.vulkan.VK.functionProvider = r0
            org.lwjgl.vulkan.VK$GlobalCommands r0 = new org.lwjgl.vulkan.VK$GlobalCommands
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            org.lwjgl.vulkan.VK.globalCommands = r0
            return
    }

    public static void destroy() {
            org.lwjgl.system.FunctionProvider r0 = org.lwjgl.vulkan.VK.functionProvider
            if (r0 != 0) goto L7
            return
        L7:
            org.lwjgl.system.FunctionProvider r0 = org.lwjgl.vulkan.VK.functionProvider
            boolean r0 = r0 instanceof org.lwjgl.system.NativeResource
            if (r0 == 0) goto L1b
            org.lwjgl.system.FunctionProvider r0 = org.lwjgl.vulkan.VK.functionProvider
            org.lwjgl.system.NativeResource r0 = (org.lwjgl.system.NativeResource) r0
            r0.free()
        L1b:
            r0 = 0
            org.lwjgl.vulkan.VK.functionProvider = r0
            r0 = 0
            org.lwjgl.vulkan.VK.globalCommands = r0
            return
    }

    private static <T> T check(T r4) {
            r0 = r4
            if (r0 != 0) goto Le
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Vulkan library has not been loaded."
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r4
            return r0
    }

    public static org.lwjgl.system.FunctionProvider getFunctionProvider() {
            org.lwjgl.system.FunctionProvider r0 = org.lwjgl.vulkan.VK.functionProvider
            java.lang.Object r0 = check(r0)
            org.lwjgl.system.FunctionProvider r0 = (org.lwjgl.system.FunctionProvider) r0
            return r0
    }

    public static int getInstanceVersionSupported() {
            org.lwjgl.vulkan.VK$GlobalCommands r0 = getGlobalCommands()
            long r0 = r0.vkEnumerateInstanceVersion
            r5 = r0
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L51
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r7 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L3b
            r8 = r0
            r0 = r8
            int r0 = org.lwjgl.vulkan.VK11.vkEnumerateInstanceVersion(r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L30
            r0 = r8
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L3b
            r9 = r0
            r0 = r7
            if (r0 == 0) goto L2d
            r0 = r7
            r0.close()
        L2d:
            r0 = r9
            return r0
        L30:
            r0 = r7
            if (r0 == 0) goto L51
            r0 = r7
            r0.close()
            goto L51
        L3b:
            r8 = move-exception
            r0 = r7
            if (r0 == 0) goto L4f
            r0 = r7
            r0.close()     // Catch: java.lang.Throwable -> L47
            goto L4f
        L47:
            r9 = move-exception
            r0 = r8
            r1 = r9
            r0.addSuppressed(r1)
        L4f:
            r0 = r8
            throw r0
        L51:
            int r0 = org.lwjgl.vulkan.VK11.VK_API_VERSION_1_0
            return r0
    }

    static org.lwjgl.vulkan.VK.GlobalCommands getGlobalCommands() {
            org.lwjgl.vulkan.VK$GlobalCommands r0 = org.lwjgl.vulkan.VK.globalCommands
            java.lang.Object r0 = check(r0)
            org.lwjgl.vulkan.VK$GlobalCommands r0 = (org.lwjgl.vulkan.VK.GlobalCommands) r0
            return r0
    }

    static java.util.Set<java.lang.String> getEnabledExtensionSet(int r5, org.lwjgl.PointerBuffer r6) {
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = 16
            r1.<init>(r2)
            r7 = r0
            r0 = r5
            int r0 = org.lwjgl.vulkan.VK11.VK_VERSION_MAJOR(r0)
            r8 = r0
            r0 = r5
            int r0 = org.lwjgl.vulkan.VK11.VK_VERSION_MINOR(r0)
            r9 = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 3
            r1[r2] = r3
            r10 = r0
            r0 = r8
            r1 = r10
            int r1 = r1.length
            int r0 = java.lang.Math.min(r0, r1)
            r11 = r0
            r0 = 1
            r12 = r0
        L2a:
            r0 = r12
            r1 = r11
            if (r0 > r1) goto L7f
            r0 = r10
            r1 = r12
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r13 = r0
            r0 = r12
            r1 = r8
            if (r0 != r1) goto L49
            r0 = r9
            r1 = r13
            int r0 = java.lang.Math.min(r0, r1)
            r13 = r0
        L49:
            r0 = 0
            r14 = r0
        L4c:
            r0 = r14
            r1 = r13
            if (r0 > r1) goto L79
            r0 = r7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "Vulkan"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r12
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r14
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            int r14 = r14 + 1
            goto L4c
        L79:
            int r12 = r12 + 1
            goto L2a
        L7f:
            r0 = r6
            if (r0 == 0) goto La5
            r0 = r6
            int r0 = r0.position()
            r12 = r0
        L89:
            r0 = r12
            r1 = r6
            int r1 = r1.limit()
            if (r0 >= r1) goto La5
            r0 = r7
            r1 = r6
            r2 = r12
            java.lang.String r1 = r1.getStringUTF8(r2)
            boolean r0 = r0.add(r1)
            int r12 = r12 + 1
            goto L89
        La5:
            r0 = r7
            return r0
    }

    private static void printUnsupportedVersion(int r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "[Vulkan] Detected unsupported Vulkan version: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 46
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLog(r0)
            return
    }

    public static native void onVKFrame();

    public static void markFramePresented() {
            onVKFrame()
            return
    }

    static {
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.VULKAN_EXPLICIT_INIT
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L16
            create()
        L16:
            return
    }
}
