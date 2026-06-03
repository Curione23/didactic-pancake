package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBindSparseInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBindSparseInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBindSparseInfo.class */
public class VkBindSparseInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkBindSparseInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int WAITSEMAPHORECOUNT = 0;
    public static final int PWAITSEMAPHORES = 0;
    public static final int BUFFERBINDCOUNT = 0;
    public static final int PBUFFERBINDS = 0;
    public static final int IMAGEOPAQUEBINDCOUNT = 0;
    public static final int PIMAGEOPAQUEBINDS = 0;
    public static final int IMAGEBINDCOUNT = 0;
    public static final int PIMAGEBINDS = 0;
    public static final int SIGNALSEMAPHORECOUNT = 0;
    public static final int PSIGNALSEMAPHORES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBindSparseInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBindSparseInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBindSparseInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkBindSparseInfo, org.lwjgl.vulkan.VkBindSparseInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkBindSparseInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkBindSparseInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkBindSparseInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkBindSparseInfo r0 = org.lwjgl.vulkan.VkBindSparseInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkBindSparseInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkBindSparseInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int waitSemaphoreCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkBindSparseInfo.nwaitSemaphoreCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkSemaphore const *")
        public java.nio.LongBuffer pWaitSemaphores() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkBindSparseInfo.npWaitSemaphores(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int bufferBindCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkBindSparseInfo.nbufferBindCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkSparseBufferMemoryBindInfo const *")
        public org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.Buffer pBufferBinds() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo$Buffer r0 = org.lwjgl.vulkan.VkBindSparseInfo.npBufferBinds(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int imageOpaqueBindCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkBindSparseInfo.nimageOpaqueBindCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkSparseImageOpaqueMemoryBindInfo const *")
        public org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.Buffer pImageOpaqueBinds() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo$Buffer r0 = org.lwjgl.vulkan.VkBindSparseInfo.npImageOpaqueBinds(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int imageBindCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkBindSparseInfo.nimageBindCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkSparseImageMemoryBindInfo const *")
        public org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.Buffer pImageBinds() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkSparseImageMemoryBindInfo$Buffer r0 = org.lwjgl.vulkan.VkBindSparseInfo.npImageBinds(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int signalSemaphoreCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkBindSparseInfo.nsignalSemaphoreCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkSemaphore const *")
        public java.nio.LongBuffer pSignalSemaphores() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkBindSparseInfo.npSignalSemaphores(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkBindSparseInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBindSparseInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBindSparseInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 7
                org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBindSparseInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkBindSparseInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkBindSparseInfo.Buffer pNext(org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBindSparseInfo.Buffer pNext(org.lwjgl.vulkan.VkDeviceGroupBindSparseInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceGroupBindSparseInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBindSparseInfo.Buffer pNext(org.lwjgl.vulkan.VkFrameBoundaryEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkFrameBoundaryEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBindSparseInfo.Buffer pNext(org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBindSparseInfo.Buffer pNext(org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBindSparseInfo.Buffer pWaitSemaphores(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBindSparseInfo.npWaitSemaphores(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBindSparseInfo.Buffer pBufferBinds(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseBufferMemoryBindInfo const *") org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBindSparseInfo.npBufferBinds(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBindSparseInfo.Buffer pImageOpaqueBinds(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageOpaqueMemoryBindInfo const *") org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBindSparseInfo.npImageOpaqueBinds(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBindSparseInfo.Buffer pImageBinds(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageMemoryBindInfo const *") org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBindSparseInfo.npImageBinds(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBindSparseInfo.Buffer pSignalSemaphores(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBindSparseInfo.npSignalSemaphores(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBindSparseInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkBindSparseInfo r0 = org.lwjgl.vulkan.VkBindSparseInfo.create(r0)
                org.lwjgl.vulkan.VkBindSparseInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkBindSparseInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkBindSparseInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkBindSparseInfo r0 = new org.lwjgl.vulkan.VkBindSparseInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkBindSparseInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF
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
    public int bufferBindCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbufferBindCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkSparseBufferMemoryBindInfo const *")
    public org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.Buffer pBufferBinds() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo$Buffer r0 = npBufferBinds(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int imageOpaqueBindCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimageOpaqueBindCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkSparseImageOpaqueMemoryBindInfo const *")
    public org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.Buffer pImageOpaqueBinds() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo$Buffer r0 = npImageOpaqueBinds(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int imageBindCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimageBindCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkSparseImageMemoryBindInfo const *")
    public org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.Buffer pImageBinds() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkSparseImageMemoryBindInfo$Buffer r0 = npImageBinds(r0)
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

    public org.lwjgl.vulkan.VkBindSparseInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBindSparseInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 7
            org.lwjgl.vulkan.VkBindSparseInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBindSparseInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkBindSparseInfo pNext(org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceGroupBindSparseInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkBindSparseInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBindSparseInfo pNext(org.lwjgl.vulkan.VkDeviceGroupBindSparseInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceGroupBindSparseInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkBindSparseInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBindSparseInfo pNext(org.lwjgl.vulkan.VkFrameBoundaryEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkFrameBoundaryEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkBindSparseInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBindSparseInfo pNext(org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkBindSparseInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBindSparseInfo pNext(org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkTimelineSemaphoreSubmitInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkBindSparseInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBindSparseInfo pWaitSemaphores(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npWaitSemaphores(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBindSparseInfo pBufferBinds(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseBufferMemoryBindInfo const *") org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npBufferBinds(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBindSparseInfo pImageOpaqueBinds(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageOpaqueMemoryBindInfo const *") org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npImageOpaqueBinds(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBindSparseInfo pImageBinds(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSparseImageMemoryBindInfo const *") org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npImageBinds(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBindSparseInfo pSignalSemaphores(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSignalSemaphores(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBindSparseInfo set(int r5, long r6, @javax.annotation.Nullable java.nio.LongBuffer r8, @javax.annotation.Nullable org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.Buffer r9, @javax.annotation.Nullable org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.Buffer r10, @javax.annotation.Nullable org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.Buffer r11, @javax.annotation.Nullable java.nio.LongBuffer r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkBindSparseInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkBindSparseInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkBindSparseInfo r0 = r0.pWaitSemaphores(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkBindSparseInfo r0 = r0.pBufferBinds(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkBindSparseInfo r0 = r0.pImageOpaqueBinds(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkBindSparseInfo r0 = r0.pImageBinds(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkBindSparseInfo r0 = r0.pSignalSemaphores(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBindSparseInfo set(org.lwjgl.vulkan.VkBindSparseInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkBindSparseInfo malloc() {
            org.lwjgl.vulkan.VkBindSparseInfo r0 = new org.lwjgl.vulkan.VkBindSparseInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindSparseInfo calloc() {
            org.lwjgl.vulkan.VkBindSparseInfo r0 = new org.lwjgl.vulkan.VkBindSparseInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindSparseInfo create() {
            int r0 = org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkBindSparseInfo r0 = new org.lwjgl.vulkan.VkBindSparseInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindSparseInfo create(long r6) {
            org.lwjgl.vulkan.VkBindSparseInfo r0 = new org.lwjgl.vulkan.VkBindSparseInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkBindSparseInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkBindSparseInfo r0 = new org.lwjgl.vulkan.VkBindSparseInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkBindSparseInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = new org.lwjgl.vulkan.VkBindSparseInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindSparseInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = new org.lwjgl.vulkan.VkBindSparseInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindSparseInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = new org.lwjgl.vulkan.VkBindSparseInfo$Buffer
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

    public static org.lwjgl.vulkan.VkBindSparseInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = new org.lwjgl.vulkan.VkBindSparseInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkBindSparseInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = new org.lwjgl.vulkan.VkBindSparseInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBindSparseInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkBindSparseInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBindSparseInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkBindSparseInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBindSparseInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkBindSparseInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBindSparseInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkBindSparseInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBindSparseInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBindSparseInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBindSparseInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBindSparseInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindSparseInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkBindSparseInfo r0 = new org.lwjgl.vulkan.VkBindSparseInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindSparseInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkBindSparseInfo r0 = new org.lwjgl.vulkan.VkBindSparseInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindSparseInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = new org.lwjgl.vulkan.VkBindSparseInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindSparseInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkBindSparseInfo$Buffer r0 = new org.lwjgl.vulkan.VkBindSparseInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBindSparseInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nwaitSemaphoreCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBindSparseInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.WAITSEMAPHORECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npWaitSemaphores(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PWAITSEMAPHORES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nwaitSemaphoreCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    public static int nbufferBindCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBindSparseInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.BUFFERBINDCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.Buffer npBufferBinds(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PBUFFERBINDS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nbufferBindCount(r1)
            org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo$Buffer r0 = org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.createSafe(r0, r1)
            return r0
    }

    public static int nimageOpaqueBindCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBindSparseInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.IMAGEOPAQUEBINDCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.Buffer npImageOpaqueBinds(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PIMAGEOPAQUEBINDS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nimageOpaqueBindCount(r1)
            org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo$Buffer r0 = org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.createSafe(r0, r1)
            return r0
    }

    public static int nimageBindCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBindSparseInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.IMAGEBINDCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.Buffer npImageBinds(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PIMAGEBINDS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nimageBindCount(r1)
            org.lwjgl.vulkan.VkSparseImageMemoryBindInfo$Buffer r0 = org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.createSafe(r0, r1)
            return r0
    }

    public static int nsignalSemaphoreCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBindSparseInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.SIGNALSEMAPHORECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npSignalSemaphores(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PSIGNALSEMAPHORES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nsignalSemaphoreCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBindSparseInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nwaitSemaphoreCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBindSparseInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.WAITSEMAPHORECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npWaitSemaphores(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PWAITSEMAPHORES
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

    public static void nbufferBindCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBindSparseInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.BUFFERBINDCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npBufferBinds(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PBUFFERBINDS
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
            nbufferBindCount(r0, r1)
            return
    }

    public static void nimageOpaqueBindCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBindSparseInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.IMAGEOPAQUEBINDCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npImageOpaqueBinds(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PIMAGEOPAQUEBINDS
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
            nimageOpaqueBindCount(r0, r1)
            return
    }

    public static void nimageBindCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBindSparseInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.IMAGEBINDCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npImageBinds(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PIMAGEBINDS
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
            nimageBindCount(r0, r1)
            return
    }

    public static void nsignalSemaphoreCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBindSparseInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.SIGNALSEMAPHORECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npSignalSemaphores(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PSIGNALSEMAPHORES
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

    public static void validate(long r6) {
            r0 = r6
            int r0 = nwaitSemaphoreCount(r0)
            if (r0 == 0) goto L14
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PWAITSEMAPHORES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r6
            int r0 = nbufferBindCount(r0)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L39
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PBUFFERBINDS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r9 = r0
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = r8
            int r2 = org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo.SIZEOF
            void r3 = org.lwjgl.vulkan.VkSparseBufferMemoryBindInfo::validate
            validate(r0, r1, r2, r3)
        L39:
            r0 = r6
            int r0 = nimageOpaqueBindCount(r0)
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L61
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PIMAGEOPAQUEBINDS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r10 = r0
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = r9
            int r2 = org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo.SIZEOF
            void r3 = org.lwjgl.vulkan.VkSparseImageOpaqueMemoryBindInfo::validate
            validate(r0, r1, r2, r3)
        L61:
            r0 = r6
            int r0 = nimageBindCount(r0)
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L8c
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PIMAGEBINDS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r11 = r0
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = r10
            int r2 = org.lwjgl.vulkan.VkSparseImageMemoryBindInfo.SIZEOF
            void r3 = org.lwjgl.vulkan.VkSparseImageMemoryBindInfo::validate
            validate(r0, r1, r2, r3)
        L8c:
            r0 = r6
            int r0 = nsignalSemaphoreCount(r0)
            if (r0 == 0) goto La0
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkBindSparseInfo.PSIGNALSEMAPHORES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        La0:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkBindSparseInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 12
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.vulkan.VkBindSparseInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkBindSparseInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkBindSparseInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBindSparseInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBindSparseInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBindSparseInfo.WAITSEMAPHORECOUNT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBindSparseInfo.PWAITSEMAPHORES = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBindSparseInfo.BUFFERBINDCOUNT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBindSparseInfo.PBUFFERBINDS = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBindSparseInfo.IMAGEOPAQUEBINDCOUNT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBindSparseInfo.PIMAGEOPAQUEBINDS = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBindSparseInfo.IMAGEBINDCOUNT = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBindSparseInfo.PIMAGEBINDS = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBindSparseInfo.SIGNALSEMAPHORECOUNT = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBindSparseInfo.PSIGNALSEMAPHORES = r0
            return
    }
}
