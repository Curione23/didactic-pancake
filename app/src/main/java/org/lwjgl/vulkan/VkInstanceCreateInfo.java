package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkInstanceCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkInstanceCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkInstanceCreateInfo.class */
public class VkInstanceCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkInstanceCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int PAPPLICATIONINFO = 0;
    public static final int ENABLEDLAYERCOUNT = 0;
    public static final int PPENABLEDLAYERNAMES = 0;
    public static final int ENABLEDEXTENSIONCOUNT = 0;
    public static final int PPENABLEDEXTENSIONNAMES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkInstanceCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkInstanceCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkInstanceCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkInstanceCreateInfo, org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkInstanceCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF
                int r2 = r2 / r3
                r0.<init>(r1, r2)
                return
        }

        public Buffer(long r10, int r12) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = 0
                r3 = -1
                r4 = 0
                r5 = r12
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        Buffer(long r10, @javax.annotation.Nullable java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkInstanceCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkInstanceCreateInfo r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkInstanceCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.nflags(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkApplicationInfo const *")
        public org.lwjgl.vulkan.VkApplicationInfo pApplicationInfo() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkApplicationInfo r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.npApplicationInfo(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int enabledLayerCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.nenabledLayerCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const * const *")
        public org.lwjgl.PointerBuffer ppEnabledLayerNames() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.PointerBuffer r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.nppEnabledLayerNames(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int enabledExtensionCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.nenabledExtensionCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const * const *")
        public org.lwjgl.PointerBuffer ppEnabledExtensionNames() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.PointerBuffer r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.nppEnabledExtensionNames(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkInstanceCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1
                org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkInstanceCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkDebugReportCallbackCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDebugReportCallbackCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkDebugUtilsMessengerCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDebugUtilsMessengerCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkDirectDriverLoadingListLUNARG r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDirectDriverLoadingListLUNARG r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkValidationFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkValidationFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkValidationFlagsEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkValidationFlagsEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VkInstanceCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkInstanceCreateInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer pApplicationInfo(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkApplicationInfo const *") org.lwjgl.vulkan.VkApplicationInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkInstanceCreateInfo.npApplicationInfo(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer ppEnabledLayerNames(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const * const *") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkInstanceCreateInfo.nppEnabledLayerNames(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer ppEnabledExtensionNames(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const * const *") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkInstanceCreateInfo.nppEnabledExtensionNames(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkInstanceCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkInstanceCreateInfo r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.create(r0)
                org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkInstanceCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkInstanceCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = new org.lwjgl.vulkan.VkInstanceCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkInstanceCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkStructureType")
    public int sType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void const *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkInstanceCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkApplicationInfo const *")
    public org.lwjgl.vulkan.VkApplicationInfo pApplicationInfo() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkApplicationInfo r0 = npApplicationInfo(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int enabledLayerCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenabledLayerCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const * const *")
    public org.lwjgl.PointerBuffer ppEnabledLayerNames() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.PointerBuffer r0 = nppEnabledLayerNames(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int enabledExtensionCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenabledExtensionCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const * const *")
    public org.lwjgl.PointerBuffer ppEnabledExtensionNames() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.PointerBuffer r0 = nppEnabledExtensionNames(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkInstanceCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkInstanceCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkInstanceCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkInstanceCreateInfo pNext(org.lwjgl.vulkan.VkDebugReportCallbackCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDebugReportCallbackCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkInstanceCreateInfo pNext(org.lwjgl.vulkan.VkDebugUtilsMessengerCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDebugUtilsMessengerCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkInstanceCreateInfo pNext(org.lwjgl.vulkan.VkDirectDriverLoadingListLUNARG r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDirectDriverLoadingListLUNARG r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkInstanceCreateInfo pNext(org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkInstanceCreateInfo pNext(org.lwjgl.vulkan.VkValidationFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkValidationFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkInstanceCreateInfo pNext(org.lwjgl.vulkan.VkValidationFlagsEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkValidationFlagsEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkInstanceCreateInfo flags(@org.lwjgl.system.NativeType("VkInstanceCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkInstanceCreateInfo pApplicationInfo(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkApplicationInfo const *") org.lwjgl.vulkan.VkApplicationInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npApplicationInfo(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkInstanceCreateInfo ppEnabledLayerNames(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const * const *") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nppEnabledLayerNames(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkInstanceCreateInfo ppEnabledExtensionNames(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const * const *") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nppEnabledExtensionNames(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkInstanceCreateInfo set(int r5, long r6, int r8, @javax.annotation.Nullable org.lwjgl.vulkan.VkApplicationInfo r9, @javax.annotation.Nullable org.lwjgl.PointerBuffer r10, @javax.annotation.Nullable org.lwjgl.PointerBuffer r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = r0.pApplicationInfo(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = r0.ppEnabledLayerNames(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = r0.ppEnabledExtensionNames(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkInstanceCreateInfo set(org.lwjgl.vulkan.VkInstanceCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkInstanceCreateInfo malloc() {
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = new org.lwjgl.vulkan.VkInstanceCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkInstanceCreateInfo calloc() {
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = new org.lwjgl.vulkan.VkInstanceCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkInstanceCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = new org.lwjgl.vulkan.VkInstanceCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkInstanceCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = new org.lwjgl.vulkan.VkInstanceCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkInstanceCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = new org.lwjgl.vulkan.VkInstanceCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer
            r1 = r0
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = -1
            r5 = 0
            r6 = r10
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkInstanceCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkInstanceCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkInstanceCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkInstanceCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkInstanceCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = new org.lwjgl.vulkan.VkInstanceCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkInstanceCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = new org.lwjgl.vulkan.VkInstanceCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkInstanceCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkInstanceCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkInstanceCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkApplicationInfo npApplicationInfo(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkInstanceCreateInfo.PAPPLICATIONINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkApplicationInfo r0 = org.lwjgl.vulkan.VkApplicationInfo.createSafe(r0)
            return r0
    }

    public static int nenabledLayerCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.ENABLEDLAYERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.PointerBuffer nppEnabledLayerNames(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkInstanceCreateInfo.PPENABLEDLAYERNAMES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nenabledLayerCount(r1)
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static int nenabledExtensionCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.ENABLEDEXTENSIONCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.PointerBuffer nppEnabledExtensionNames(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkInstanceCreateInfo.PPENABLEDEXTENSIONNAMES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nenabledExtensionCount(r1)
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkInstanceCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npApplicationInfo(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkApplicationInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkInstanceCreateInfo.PAPPLICATIONINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nenabledLayerCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.ENABLEDLAYERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nppEnabledLayerNames(long r5, @javax.annotation.Nullable org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkInstanceCreateInfo.PPENABLEDLAYERNAMES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1 = r7
            int r1 = r1.remaining()
        L1a:
            nenabledLayerCount(r0, r1)
            return
    }

    public static void nenabledExtensionCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkInstanceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.ENABLEDEXTENSIONCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nppEnabledExtensionNames(long r5, @javax.annotation.Nullable org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkInstanceCreateInfo.PPENABLEDEXTENSIONNAMES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1 = r7
            int r1 = r1.remaining()
        L1a:
            nenabledExtensionCount(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r0 = nenabledLayerCount(r0)
            if (r0 == 0) goto L14
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkInstanceCreateInfo.PPENABLEDLAYERNAMES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r5
            int r0 = nenabledExtensionCount(r0)
            if (r0 == 0) goto L28
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkInstanceCreateInfo.PPENABLEDEXTENSIONNAMES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L28:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkInstanceCreateInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkInstanceCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkInstanceCreateInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkInstanceCreateInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkInstanceCreateInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkInstanceCreateInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkInstanceCreateInfo.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkInstanceCreateInfo.PAPPLICATIONINFO = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkInstanceCreateInfo.ENABLEDLAYERCOUNT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkInstanceCreateInfo.PPENABLEDLAYERNAMES = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkInstanceCreateInfo.ENABLEDEXTENSIONCOUNT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkInstanceCreateInfo.PPENABLEDEXTENSIONNAMES = r0
            return
    }
}
