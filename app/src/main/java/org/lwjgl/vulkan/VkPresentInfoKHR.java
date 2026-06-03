package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPresentInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPresentInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPresentInfoKHR.class */
public class VkPresentInfoKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPresentInfoKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int WAITSEMAPHORECOUNT = 0;
    public static final int PWAITSEMAPHORES = 0;
    public static final int SWAPCHAINCOUNT = 0;
    public static final int PSWAPCHAINS = 0;
    public static final int PIMAGEINDICES = 0;
    public static final int PRESULTS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPresentInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPresentInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPresentInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPresentInfoKHR, org.lwjgl.vulkan.VkPresentInfoKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPresentInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkPresentInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPresentInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPresentInfoKHR r0 = org.lwjgl.vulkan.VkPresentInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPresentInfoKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPresentInfoKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int waitSemaphoreCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPresentInfoKHR.nwaitSemaphoreCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkSemaphore const *")
        public java.nio.LongBuffer pWaitSemaphores() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkPresentInfoKHR.npWaitSemaphores(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int swapchainCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPresentInfoKHR.nswapchainCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSwapchainKHR const *")
        public java.nio.LongBuffer pSwapchains() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkPresentInfoKHR.npSwapchains(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t const *")
        public java.nio.IntBuffer pImageIndices() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkPresentInfoKHR.npImageIndices(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkResult *")
        public java.nio.IntBuffer pResults() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkPresentInfoKHR.npResults(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPresentInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000001001(0x3b9acde9, float:0.0047242534)
                org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPresentInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkDeviceGroupPresentInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceGroupPresentInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkDisplayPresentInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDisplayPresentInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkFrameBoundaryEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkFrameBoundaryEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkPresentIdKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPresentIdKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkPresentRegionsKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPresentRegionsKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkPresentTimesInfoGOOGLE r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPresentTimesInfoGOOGLE r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkSwapchainPresentFenceInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSwapchainPresentFenceInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkSwapchainPresentModeInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSwapchainPresentModeInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer pWaitSemaphores(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPresentInfoKHR.npWaitSemaphores(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer swapchainCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPresentInfoKHR.nswapchainCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer pSwapchains(@org.lwjgl.system.NativeType("VkSwapchainKHR const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPresentInfoKHR.npSwapchains(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer pImageIndices(@org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPresentInfoKHR.npImageIndices(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPresentInfoKHR.Buffer pResults(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkResult *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPresentInfoKHR.npResults(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPresentInfoKHR r0 = org.lwjgl.vulkan.VkPresentInfoKHR.create(r0)
                org.lwjgl.vulkan.VkPresentInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPresentInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPresentInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = new org.lwjgl.vulkan.VkPresentInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPresentInfoKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPresentInfoKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int swapchainCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nswapchainCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSwapchainKHR const *")
    public java.nio.LongBuffer pSwapchains() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = npSwapchains(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t const *")
    public java.nio.IntBuffer pImageIndices() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npImageIndices(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkResult *")
    public java.nio.IntBuffer pResults() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npResults(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000001001(0x3b9acde9, float:0.0047242534)
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR pNext(org.lwjgl.vulkan.VkDeviceGroupPresentInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceGroupPresentInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR pNext(org.lwjgl.vulkan.VkDisplayPresentInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDisplayPresentInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR pNext(org.lwjgl.vulkan.VkFrameBoundaryEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkFrameBoundaryEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR pNext(org.lwjgl.vulkan.VkPresentIdKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPresentIdKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR pNext(org.lwjgl.vulkan.VkPresentRegionsKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPresentRegionsKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR pNext(org.lwjgl.vulkan.VkPresentTimesInfoGOOGLE r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPresentTimesInfoGOOGLE r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR pNext(org.lwjgl.vulkan.VkSwapchainPresentFenceInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSwapchainPresentFenceInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR pNext(org.lwjgl.vulkan.VkSwapchainPresentModeInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSwapchainPresentModeInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR pWaitSemaphores(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npWaitSemaphores(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR swapchainCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nswapchainCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR pSwapchains(@org.lwjgl.system.NativeType("VkSwapchainKHR const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSwapchains(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR pImageIndices(@org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npImageIndices(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR pResults(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkResult *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npResults(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR set(int r5, long r6, @javax.annotation.Nullable java.nio.LongBuffer r8, int r9, java.nio.LongBuffer r10, java.nio.IntBuffer r11, @javax.annotation.Nullable java.nio.IntBuffer r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.pWaitSemaphores(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.swapchainCount(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.pSwapchains(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.pImageIndices(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.pResults(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPresentInfoKHR set(org.lwjgl.vulkan.VkPresentInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPresentInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentInfoKHR malloc() {
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = new org.lwjgl.vulkan.VkPresentInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPresentInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentInfoKHR calloc() {
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = new org.lwjgl.vulkan.VkPresentInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkPresentInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = new org.lwjgl.vulkan.VkPresentInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = new org.lwjgl.vulkan.VkPresentInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPresentInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = new org.lwjgl.vulkan.VkPresentInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPresentInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPresentInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPresentInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPresentInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkPresentInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPresentInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPresentInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPresentInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentInfoKHR mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentInfoKHR callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentInfoKHR mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentInfoKHR callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentInfoKHR.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentInfoKHR.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentInfoKHR.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPresentInfoKHR.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = new org.lwjgl.vulkan.VkPresentInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPresentInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = new org.lwjgl.vulkan.VkPresentInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPresentInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPresentInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPresentInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPresentInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPresentInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPresentInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPresentInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPresentInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPresentInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nwaitSemaphoreCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPresentInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.WAITSEMAPHORECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npWaitSemaphores(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPresentInfoKHR.PWAITSEMAPHORES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nwaitSemaphoreCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    public static int nswapchainCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPresentInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.SWAPCHAINCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.LongBuffer npSwapchains(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPresentInfoKHR.PSWAPCHAINS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nswapchainCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            return r0
    }

    public static java.nio.IntBuffer npImageIndices(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPresentInfoKHR.PIMAGEINDICES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nswapchainCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer npResults(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPresentInfoKHR.PRESULTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nswapchainCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPresentInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPresentInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nwaitSemaphoreCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPresentInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.WAITSEMAPHORECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npWaitSemaphores(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPresentInfoKHR.PWAITSEMAPHORES
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
            nwaitSemaphoreCount(r0, r1)
            return
    }

    public static void nswapchainCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPresentInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.SWAPCHAINCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npSwapchains(long r5, java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPresentInfoKHR.PSWAPCHAINS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npImageIndices(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPresentInfoKHR.PIMAGEINDICES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npResults(long r5, @javax.annotation.Nullable java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPresentInfoKHR.PRESULTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r0 = nwaitSemaphoreCount(r0)
            if (r0 == 0) goto L14
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPresentInfoKHR.PWAITSEMAPHORES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPresentInfoKHR.PSWAPCHAINS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPresentInfoKHR.PIMAGEINDICES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPresentInfoKHR r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkPresentInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPresentInfoKHR.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPresentInfoKHR.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPresentInfoKHR.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPresentInfoKHR.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPresentInfoKHR.WAITSEMAPHORECOUNT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPresentInfoKHR.PWAITSEMAPHORES = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPresentInfoKHR.SWAPCHAINCOUNT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPresentInfoKHR.PSWAPCHAINS = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPresentInfoKHR.PIMAGEINDICES = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPresentInfoKHR.PRESULTS = r0
            return
    }
}
