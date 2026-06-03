package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfoKHR.class */
public class VkSemaphoreWaitInfoKHR extends org.lwjgl.vulkan.VkSemaphoreWaitInfo {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer {
        private static final org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
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

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000207004(0x3b9df29c, float:0.004820181)
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer flags(@org.lwjgl.system.NativeType("VkSemaphoreWaitFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.nflags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer semaphoreCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.nsemaphoreCount(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer pSemaphores(@org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.npSemaphores(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer pValues(@org.lwjgl.system.NativeType("uint64_t const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.npValues(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer pValues(@org.lwjgl.system.NativeType("uint64_t const *") java.nio.LongBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = r0.pValues(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer pSemaphores(@org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = r0.pSemaphores(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer semaphoreCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = r0.semaphoreCount(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer flags(@org.lwjgl.system.NativeType("VkSemaphoreWaitFlags") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = r0.flags(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.create(r0)
                org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkSemaphoreWaitInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkSemaphoreWaitInfoKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000207004(0x3b9df29c, float:0.004820181)
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR flags(@org.lwjgl.system.NativeType("VkSemaphoreWaitFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR semaphoreCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsemaphoreCount(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR pSemaphores(@org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSemaphores(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR pValues(@org.lwjgl.system.NativeType("uint64_t const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npValues(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR set(int r5, long r6, int r8, int r9, java.nio.LongBuffer r10, java.nio.LongBuffer r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.semaphoreCount(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.pSemaphores(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.pValues(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR set(org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR malloc() {
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR calloc() {
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo set(int r10, long r11, int r13, int r14, java.nio.LongBuffer r15, java.nio.LongBuffer r16) {
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.set(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo pValues(@org.lwjgl.system.NativeType("uint64_t const *") java.nio.LongBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.pValues(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo pSemaphores(@org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.pSemaphores(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo semaphoreCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.semaphoreCount(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo flags(@org.lwjgl.system.NativeType("VkSemaphoreWaitFlags") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.flags(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSemaphoreWaitInfo create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSemaphoreWaitInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkSemaphoreWaitInfoKHR r0 = r0.create(r1, r2)
            return r0
    }
}
