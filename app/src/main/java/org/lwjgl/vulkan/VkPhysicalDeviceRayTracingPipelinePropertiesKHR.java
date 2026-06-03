package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPipelinePropertiesKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPipelinePropertiesKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPipelinePropertiesKHR.class */
public class VkPhysicalDeviceRayTracingPipelinePropertiesKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int SHADERGROUPHANDLESIZE = 0;
    public static final int MAXRAYRECURSIONDEPTH = 0;
    public static final int MAXSHADERGROUPSTRIDE = 0;
    public static final int SHADERGROUPBASEALIGNMENT = 0;
    public static final int SHADERGROUPHANDLECAPTUREREPLAYSIZE = 0;
    public static final int MAXRAYDISPATCHINVOCATIONCOUNT = 0;
    public static final int SHADERGROUPHANDLEALIGNMENT = 0;
    public static final int MAXRAYHITATTRIBUTESIZE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR, org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int shaderGroupHandleSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupHandleSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxRayRecursionDepth() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxRayRecursionDepth(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxShaderGroupStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxShaderGroupStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int shaderGroupBaseAlignment() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupBaseAlignment(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int shaderGroupHandleCaptureReplaySize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupHandleCaptureReplaySize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxRayDispatchInvocationCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxRayDispatchInvocationCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int shaderGroupHandleAlignment() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nshaderGroupHandleAlignment(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxRayHitAttributeSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nmaxRayHitAttributeSize(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000347001(0x3ba01579, float:0.0048853722)
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceRayTracingPipelinePropertiesKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("void *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int shaderGroupHandleSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderGroupHandleSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxRayRecursionDepth() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxRayRecursionDepth(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxShaderGroupStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxShaderGroupStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int shaderGroupBaseAlignment() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderGroupBaseAlignment(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int shaderGroupHandleCaptureReplaySize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderGroupHandleCaptureReplaySize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxRayDispatchInvocationCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxRayDispatchInvocationCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int shaderGroupHandleAlignment() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderGroupHandleAlignment(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxRayHitAttributeSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxRayHitAttributeSize(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000347001(0x3ba01579, float:0.0048853722)
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR set(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nshaderGroupHandleSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPHANDLESIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxRayRecursionDepth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXRAYRECURSIONDEPTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxShaderGroupStride(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXSHADERGROUPSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderGroupBaseAlignment(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPBASEALIGNMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderGroupHandleCaptureReplaySize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPHANDLECAPTUREREPLAYSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxRayDispatchInvocationCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXRAYDISPATCHINVOCATIONCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderGroupHandleAlignment(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPHANDLEALIGNMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxRayHitAttributeSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXRAYHITATTRIBUTESIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPHANDLESIZE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXRAYRECURSIONDEPTH = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXSHADERGROUPSTRIDE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPBASEALIGNMENT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPHANDLECAPTUREREPLAYSIZE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXRAYDISPATCHINVOCATIONCOUNT = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.SHADERGROUPHANDLEALIGNMENT = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR.MAXRAYHITATTRIBUTESIZE = r0
            return
    }
}
