package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfo.class */
public class VkSemaphoreWaitInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkSemaphoreWaitInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int SEMAPHORECOUNT = 0;
    public static final int PSEMAPHORES = 0;
    public static final int PVALUES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSemaphoreWaitInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkSemaphoreWaitInfo, org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkSemaphoreWaitInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkSemaphoreWaitInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSemaphoreWaitFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int semaphoreCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.nsemaphoreCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSemaphore const *")
        public java.nio.LongBuffer pSemaphores() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.npSemaphores(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint64_t const *")
        public java.nio.LongBuffer pValues() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.LongBuffer r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.npValues(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreWaitInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000207004(0x3b9df29c, float:0.004820181)
                org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSemaphoreWaitInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer flags(@org.lwjgl.system.NativeType("VkSemaphoreWaitFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreWaitInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer semaphoreCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreWaitInfo.nsemaphoreCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer pSemaphores(@org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreWaitInfo.npSemaphores(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer pValues(@org.lwjgl.system.NativeType("uint64_t const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSemaphoreWaitInfo.npValues(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.create(r0)
                org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkSemaphoreWaitInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkSemaphoreWaitInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkSemaphoreWaitInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkSemaphoreWaitFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int semaphoreCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsemaphoreCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSemaphore const *")
    public java.nio.LongBuffer pSemaphores() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = npSemaphores(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint64_t const *")
    public java.nio.LongBuffer pValues() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.LongBuffer r0 = npValues(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkSemaphoreWaitInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSemaphoreWaitInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000207004(0x3b9df29c, float:0.004820181)
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSemaphoreWaitInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkSemaphoreWaitInfo flags(@org.lwjgl.system.NativeType("VkSemaphoreWaitFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSemaphoreWaitInfo semaphoreCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsemaphoreCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSemaphoreWaitInfo pSemaphores(@org.lwjgl.system.NativeType("VkSemaphore const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSemaphores(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSemaphoreWaitInfo pValues(@org.lwjgl.system.NativeType("uint64_t const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npValues(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSemaphoreWaitInfo set(int r5, long r6, int r8, int r9, java.nio.LongBuffer r10, java.nio.LongBuffer r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = r0.semaphoreCount(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = r0.pSemaphores(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = r0.pValues(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSemaphoreWaitInfo set(org.lwjgl.vulkan.VkSemaphoreWaitInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfo malloc() {
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfo calloc() {
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfo create() {
            int r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfo create(long r6) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSemaphoreWaitInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer
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

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSemaphoreWaitInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer r0 = new org.lwjgl.vulkan.VkSemaphoreWaitInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsemaphoreCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SEMAPHORECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.LongBuffer npSemaphores(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.PSEMAPHORES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nsemaphoreCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            return r0
    }

    public static java.nio.LongBuffer npValues(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.PVALUES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nsemaphoreCount(r1)
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsemaphoreCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.SEMAPHORECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npSemaphores(long r5, java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.PSEMAPHORES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npValues(long r5, java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.PVALUES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.PSEMAPHORES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.PVALUES
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
            org.lwjgl.vulkan.VkSemaphoreWaitInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkSemaphoreWaitInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkSemaphoreWaitInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkSemaphoreWaitInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSemaphoreWaitInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSemaphoreWaitInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSemaphoreWaitInfo.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSemaphoreWaitInfo.SEMAPHORECOUNT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSemaphoreWaitInfo.PSEMAPHORES = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSemaphoreWaitInfo.PVALUES = r0
            return
    }
}
