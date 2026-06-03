package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubmitInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubmitInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubmitInfo.class */
public class VkSubmitInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkSubmitInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int WAITSEMAPHORECOUNT = 0;
    public static final int PWAITSEMAPHORES = 0;
    public static final int PWAITDSTSTAGEMASK = 0;
    public static final int COMMANDBUFFERCOUNT = 0;
    public static final int PCOMMANDBUFFERS = 0;
    public static final int SIGNALSEMAPHORECOUNT = 0;
    public static final int PSIGNALSEMAPHORES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubmitInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubmitInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubmitInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkSubmitInfo, org.lwjgl.vulkan.VkSubmitInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkSubmitInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkSubmitInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkSubmitInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkSubmitInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkSubmitInfo r0 = org.lwjgl.vulkan.VkSubmitInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSubmitInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkSubmitInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int waitSemaphoreCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSubmitInfo.nwaitSemaphoreCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkSemaphore const *")
        public java.nio.LongBuffer pWaitSemaphores() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkSubmitInfo.npWaitSemaphores(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPipelineStageFlags const *")
        public java.nio.IntBuffer pWaitDstStageMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkSubmitInfo.npWaitDstStageMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int commandBufferCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSubmitInfo.ncommandBufferCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkCommandBuffer const *")
        public org.lwjgl.PointerBuffer pCommandBuffers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.PointerBuffer r0 = org.lwjgl.vulkan.VkSubmitInfo.npCommandBuffers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int signalSemaphoreCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSubmitInfo.nsignalSemaphoreCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkSemaphore const *")
        public java.nio.LongBuffer pSignalSemaphores() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkSubmitInfo.npSignalSemaphores(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubmitInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 4
                org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSubmitInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pNext(org.lwjgl.vulkan.VkAmigoProfilingSubmitInfoSEC r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkAmigoProfilingSubmitInfoSEC r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pNext(org.lwjgl.vulkan.VkD3D12FenceSubmitInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkD3D12FenceSubmitInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pNext(org.lwjgl.vulkan.VkDeviceGroupSubmitInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceGroupSubmitInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pNext(org.lwjgl.vulkan.VkDeviceGroupSubmitInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceGroupSubmitInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pNext(org.lwjgl.vulkan.VkFrameBoundaryEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkFrameBoundaryEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pNext(org.lwjgl.vulkan.VkPerformanceQuerySubmitInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPerformanceQuerySubmitInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pNext(org.lwjgl.vulkan.VkProtectedSubmitInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkProtectedSubmitInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pNext(org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pNext(org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pNext(org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pNext(org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer waitSemaphoreCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubmitInfo.nwaitSemaphoreCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pWaitSemaphores(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubmitInfo.npWaitSemaphores(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pWaitDstStageMask(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineStageFlags const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubmitInfo.npWaitDstStageMask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pCommandBuffers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkCommandBuffer const *") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubmitInfo.npCommandBuffers(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSubmitInfo.Buffer pSignalSemaphores(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubmitInfo.npSignalSemaphores(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSubmitInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkSubmitInfo r0 = org.lwjgl.vulkan.VkSubmitInfo.create(r0)
                org.lwjgl.vulkan.VkSubmitInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkSubmitInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkSubmitInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkSubmitInfo r0 = new org.lwjgl.vulkan.VkSubmitInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkSubmitInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkSubmitInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int waitSemaphoreCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nwaitSemaphoreCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkSemaphore const *")
    public java.nio.LongBuffer pWaitSemaphores() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = npWaitSemaphores(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkPipelineStageFlags const *")
    public java.nio.IntBuffer pWaitDstStageMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npWaitDstStageMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int commandBufferCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncommandBufferCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkCommandBuffer const *")
    public org.lwjgl.PointerBuffer pCommandBuffers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.PointerBuffer r0 = npCommandBuffers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int signalSemaphoreCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsignalSemaphoreCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkSemaphore const *")
    public java.nio.LongBuffer pSignalSemaphores() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = npSignalSemaphores(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 4
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pNext(org.lwjgl.vulkan.VkAmigoProfilingSubmitInfoSEC r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkAmigoProfilingSubmitInfoSEC r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pNext(org.lwjgl.vulkan.VkD3D12FenceSubmitInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkD3D12FenceSubmitInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pNext(org.lwjgl.vulkan.VkDeviceGroupSubmitInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceGroupSubmitInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pNext(org.lwjgl.vulkan.VkDeviceGroupSubmitInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceGroupSubmitInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pNext(org.lwjgl.vulkan.VkFrameBoundaryEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkFrameBoundaryEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pNext(org.lwjgl.vulkan.VkPerformanceQuerySubmitInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPerformanceQuerySubmitInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pNext(org.lwjgl.vulkan.VkProtectedSubmitInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkProtectedSubmitInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pNext(org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pNext(org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pNext(org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pNext(org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkWin32KeyedMutexAcquireReleaseInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo waitSemaphoreCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nwaitSemaphoreCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pWaitSemaphores(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npWaitSemaphores(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pWaitDstStageMask(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPipelineStageFlags const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npWaitDstStageMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pCommandBuffers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkCommandBuffer const *") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npCommandBuffers(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo pSignalSemaphores(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSignalSemaphores(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo set(int r5, long r6, int r8, @javax.annotation.Nullable java.nio.LongBuffer r9, @javax.annotation.Nullable java.nio.IntBuffer r10, @javax.annotation.Nullable org.lwjgl.PointerBuffer r11, @javax.annotation.Nullable java.nio.LongBuffer r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.waitSemaphoreCount(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pWaitSemaphores(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pWaitDstStageMask(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pCommandBuffers(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.pSignalSemaphores(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubmitInfo set(org.lwjgl.vulkan.VkSubmitInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkSubmitInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkSubmitInfo malloc() {
            org.lwjgl.vulkan.VkSubmitInfo r0 = new org.lwjgl.vulkan.VkSubmitInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkSubmitInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubmitInfo calloc() {
            org.lwjgl.vulkan.VkSubmitInfo r0 = new org.lwjgl.vulkan.VkSubmitInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubmitInfo create() {
            int r0 = org.lwjgl.vulkan.VkSubmitInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkSubmitInfo r0 = new org.lwjgl.vulkan.VkSubmitInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubmitInfo create(long r6) {
            org.lwjgl.vulkan.VkSubmitInfo r0 = new org.lwjgl.vulkan.VkSubmitInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSubmitInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSubmitInfo r0 = new org.lwjgl.vulkan.VkSubmitInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSubmitInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = new org.lwjgl.vulkan.VkSubmitInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubmitInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = new org.lwjgl.vulkan.VkSubmitInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubmitInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkSubmitInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = new org.lwjgl.vulkan.VkSubmitInfo$Buffer
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

    public static org.lwjgl.vulkan.VkSubmitInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = new org.lwjgl.vulkan.VkSubmitInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSubmitInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = new org.lwjgl.vulkan.VkSubmitInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubmitInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSubmitInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubmitInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSubmitInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubmitInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkSubmitInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubmitInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkSubmitInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubmitInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubmitInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubmitInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubmitInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubmitInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkSubmitInfo r0 = new org.lwjgl.vulkan.VkSubmitInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkSubmitInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubmitInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkSubmitInfo r0 = new org.lwjgl.vulkan.VkSubmitInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkSubmitInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubmitInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = new org.lwjgl.vulkan.VkSubmitInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSubmitInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubmitInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSubmitInfo$Buffer r0 = new org.lwjgl.vulkan.VkSubmitInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSubmitInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubmitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubmitInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nwaitSemaphoreCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubmitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.WAITSEMAPHORECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npWaitSemaphores(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubmitInfo.PWAITSEMAPHORES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nwaitSemaphoreCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer npWaitDstStageMask(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubmitInfo.PWAITDSTSTAGEMASK
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nwaitSemaphoreCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static int ncommandBufferCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubmitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.COMMANDBUFFERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.PointerBuffer npCommandBuffers(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubmitInfo.PCOMMANDBUFFERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ncommandBufferCount(r1)
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static int nsignalSemaphoreCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubmitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.SIGNALSEMAPHORECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npSignalSemaphores(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubmitInfo.PSIGNALSEMAPHORES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nsignalSemaphoreCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubmitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubmitInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nwaitSemaphoreCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubmitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.WAITSEMAPHORECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npWaitSemaphores(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubmitInfo.PWAITSEMAPHORES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npWaitDstStageMask(long r5, @javax.annotation.Nullable java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubmitInfo.PWAITDSTSTAGEMASK
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ncommandBufferCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubmitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.COMMANDBUFFERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npCommandBuffers(long r5, @javax.annotation.Nullable org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubmitInfo.PCOMMANDBUFFERS
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
            ncommandBufferCount(r0, r1)
            return
    }

    public static void nsignalSemaphoreCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubmitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.SIGNALSEMAPHORECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npSignalSemaphores(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubmitInfo.PSIGNALSEMAPHORES
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
            nsignalSemaphoreCount(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r0 = nwaitSemaphoreCount(r0)
            if (r0 == 0) goto L14
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubmitInfo.PWAITSEMAPHORES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r5
            int r0 = ncommandBufferCount(r0)
            if (r0 == 0) goto L28
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubmitInfo.PCOMMANDBUFFERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L28:
            r0 = r5
            int r0 = nsignalSemaphoreCount(r0)
            if (r0 == 0) goto L3c
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubmitInfo.PSIGNALSEMAPHORES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L3c:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkSubmitInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkSubmitInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkSubmitInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkSubmitInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubmitInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubmitInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubmitInfo.WAITSEMAPHORECOUNT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubmitInfo.PWAITSEMAPHORES = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubmitInfo.PWAITDSTSTAGEMASK = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubmitInfo.COMMANDBUFFERCOUNT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubmitInfo.PCOMMANDBUFFERS = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubmitInfo.SIGNALSEMAPHORECOUNT = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubmitInfo.PSIGNALSEMAPHORES = r0
            return
    }
}
