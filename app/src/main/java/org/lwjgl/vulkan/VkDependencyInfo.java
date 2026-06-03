package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDependencyInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDependencyInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDependencyInfo.class */
public class VkDependencyInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDependencyInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int DEPENDENCYFLAGS = 0;
    public static final int MEMORYBARRIERCOUNT = 0;
    public static final int PMEMORYBARRIERS = 0;
    public static final int BUFFERMEMORYBARRIERCOUNT = 0;
    public static final int PBUFFERMEMORYBARRIERS = 0;
    public static final int IMAGEMEMORYBARRIERCOUNT = 0;
    public static final int PIMAGEMEMORYBARRIERS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDependencyInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDependencyInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDependencyInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDependencyInfo, org.lwjgl.vulkan.VkDependencyInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDependencyInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkDependencyInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDependencyInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDependencyInfo r0 = org.lwjgl.vulkan.VkDependencyInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDependencyInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDependencyInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDependencyFlags")
        public int dependencyFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDependencyInfo.ndependencyFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int memoryBarrierCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDependencyInfo.nmemoryBarrierCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkMemoryBarrier2 const *")
        public org.lwjgl.vulkan.VkMemoryBarrier2.Buffer pMemoryBarriers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkMemoryBarrier2$Buffer r0 = org.lwjgl.vulkan.VkDependencyInfo.npMemoryBarriers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int bufferMemoryBarrierCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDependencyInfo.nbufferMemoryBarrierCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkBufferMemoryBarrier2 const *")
        public org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer pBufferMemoryBarriers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkBufferMemoryBarrier2$Buffer r0 = org.lwjgl.vulkan.VkDependencyInfo.npBufferMemoryBarriers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int imageMemoryBarrierCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDependencyInfo.nimageMemoryBarrierCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkImageMemoryBarrier2 const *")
        public org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer pImageMemoryBarriers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkImageMemoryBarrier2$Buffer r0 = org.lwjgl.vulkan.VkDependencyInfo.npImageMemoryBarriers(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDependencyInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDependencyInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDependencyInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000314003(0x3b9f9493, float:0.0048700063)
                org.lwjgl.vulkan.VkDependencyInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDependencyInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDependencyInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDependencyInfo.Buffer dependencyFlags(@org.lwjgl.system.NativeType("VkDependencyFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDependencyInfo.ndependencyFlags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDependencyInfo.Buffer pMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMemoryBarrier2 const *") org.lwjgl.vulkan.VkMemoryBarrier2.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDependencyInfo.npMemoryBarriers(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDependencyInfo.Buffer pBufferMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBufferMemoryBarrier2 const *") org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDependencyInfo.npBufferMemoryBarriers(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDependencyInfo.Buffer pImageMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkImageMemoryBarrier2 const *") org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDependencyInfo.npImageMemoryBarriers(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDependencyInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDependencyInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDependencyInfo r0 = org.lwjgl.vulkan.VkDependencyInfo.create(r0)
                org.lwjgl.vulkan.VkDependencyInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDependencyInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDependencyInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDependencyInfo r0 = new org.lwjgl.vulkan.VkDependencyInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDependencyInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkDependencyFlags")
    public int dependencyFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndependencyFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int memoryBarrierCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmemoryBarrierCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkMemoryBarrier2 const *")
    public org.lwjgl.vulkan.VkMemoryBarrier2.Buffer pMemoryBarriers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkMemoryBarrier2$Buffer r0 = npMemoryBarriers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int bufferMemoryBarrierCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbufferMemoryBarrierCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkBufferMemoryBarrier2 const *")
    public org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer pBufferMemoryBarriers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkBufferMemoryBarrier2$Buffer r0 = npBufferMemoryBarriers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int imageMemoryBarrierCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimageMemoryBarrierCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkImageMemoryBarrier2 const *")
    public org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer pImageMemoryBarriers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkImageMemoryBarrier2$Buffer r0 = npImageMemoryBarriers(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDependencyInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDependencyInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000314003(0x3b9f9493, float:0.0048700063)
            org.lwjgl.vulkan.VkDependencyInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDependencyInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDependencyInfo dependencyFlags(@org.lwjgl.system.NativeType("VkDependencyFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndependencyFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDependencyInfo pMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMemoryBarrier2 const *") org.lwjgl.vulkan.VkMemoryBarrier2.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npMemoryBarriers(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDependencyInfo pBufferMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkBufferMemoryBarrier2 const *") org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npBufferMemoryBarriers(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDependencyInfo pImageMemoryBarriers(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkImageMemoryBarrier2 const *") org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npImageMemoryBarriers(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDependencyInfo set(int r5, long r6, int r8, @javax.annotation.Nullable org.lwjgl.vulkan.VkMemoryBarrier2.Buffer r9, @javax.annotation.Nullable org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer r10, @javax.annotation.Nullable org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDependencyInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDependencyInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDependencyInfo r0 = r0.dependencyFlags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkDependencyInfo r0 = r0.pMemoryBarriers(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkDependencyInfo r0 = r0.pBufferMemoryBarriers(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkDependencyInfo r0 = r0.pImageMemoryBarriers(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDependencyInfo set(org.lwjgl.vulkan.VkDependencyInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfo malloc() {
            org.lwjgl.vulkan.VkDependencyInfo r0 = new org.lwjgl.vulkan.VkDependencyInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfo calloc() {
            org.lwjgl.vulkan.VkDependencyInfo r0 = new org.lwjgl.vulkan.VkDependencyInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfo create() {
            int r0 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDependencyInfo r0 = new org.lwjgl.vulkan.VkDependencyInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfo create(long r6) {
            org.lwjgl.vulkan.VkDependencyInfo r0 = new org.lwjgl.vulkan.VkDependencyInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDependencyInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDependencyInfo r0 = new org.lwjgl.vulkan.VkDependencyInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDependencyInfo$Buffer r0 = new org.lwjgl.vulkan.VkDependencyInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDependencyInfo$Buffer r0 = new org.lwjgl.vulkan.VkDependencyInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDependencyInfo$Buffer r0 = new org.lwjgl.vulkan.VkDependencyInfo$Buffer
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

    public static org.lwjgl.vulkan.VkDependencyInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDependencyInfo$Buffer r0 = new org.lwjgl.vulkan.VkDependencyInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDependencyInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDependencyInfo$Buffer r0 = new org.lwjgl.vulkan.VkDependencyInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDependencyInfo r0 = new org.lwjgl.vulkan.VkDependencyInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDependencyInfo r0 = new org.lwjgl.vulkan.VkDependencyInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDependencyInfo$Buffer r0 = new org.lwjgl.vulkan.VkDependencyInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDependencyInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDependencyInfo$Buffer r0 = new org.lwjgl.vulkan.VkDependencyInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDependencyInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDependencyInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDependencyInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int ndependencyFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDependencyInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.DEPENDENCYFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmemoryBarrierCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDependencyInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.MEMORYBARRIERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkMemoryBarrier2.Buffer npMemoryBarriers(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDependencyInfo.PMEMORYBARRIERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nmemoryBarrierCount(r1)
            org.lwjgl.vulkan.VkMemoryBarrier2$Buffer r0 = org.lwjgl.vulkan.VkMemoryBarrier2.createSafe(r0, r1)
            return r0
    }

    public static int nbufferMemoryBarrierCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDependencyInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.BUFFERMEMORYBARRIERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer npBufferMemoryBarriers(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDependencyInfo.PBUFFERMEMORYBARRIERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nbufferMemoryBarrierCount(r1)
            org.lwjgl.vulkan.VkBufferMemoryBarrier2$Buffer r0 = org.lwjgl.vulkan.VkBufferMemoryBarrier2.createSafe(r0, r1)
            return r0
    }

    public static int nimageMemoryBarrierCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDependencyInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.IMAGEMEMORYBARRIERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer npImageMemoryBarriers(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDependencyInfo.PIMAGEMEMORYBARRIERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nimageMemoryBarrierCount(r1)
            org.lwjgl.vulkan.VkImageMemoryBarrier2$Buffer r0 = org.lwjgl.vulkan.VkImageMemoryBarrier2.createSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDependencyInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDependencyInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ndependencyFlags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDependencyInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.DEPENDENCYFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmemoryBarrierCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDependencyInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.MEMORYBARRIERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npMemoryBarriers(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkMemoryBarrier2.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDependencyInfo.PMEMORYBARRIERS
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
            nmemoryBarrierCount(r0, r1)
            return
    }

    public static void nbufferMemoryBarrierCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDependencyInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.BUFFERMEMORYBARRIERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npBufferMemoryBarriers(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkBufferMemoryBarrier2.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDependencyInfo.PBUFFERMEMORYBARRIERS
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
            nbufferMemoryBarrierCount(r0, r1)
            return
    }

    public static void nimageMemoryBarrierCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDependencyInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.IMAGEMEMORYBARRIERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npImageMemoryBarriers(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDependencyInfo.PIMAGEMEMORYBARRIERS
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
            nimageMemoryBarrierCount(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r0 = nmemoryBarrierCount(r0)
            if (r0 == 0) goto L14
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDependencyInfo.PMEMORYBARRIERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r5
            int r0 = nbufferMemoryBarrierCount(r0)
            if (r0 == 0) goto L28
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDependencyInfo.PBUFFERMEMORYBARRIERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L28:
            r0 = r5
            int r0 = nimageMemoryBarrierCount(r0)
            if (r0 == 0) goto L3c
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDependencyInfo.PIMAGEMEMORYBARRIERS
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
            org.lwjgl.vulkan.VkDependencyInfo r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkDependencyInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDependencyInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDependencyInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDependencyInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDependencyInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDependencyInfo.DEPENDENCYFLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDependencyInfo.MEMORYBARRIERCOUNT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDependencyInfo.PMEMORYBARRIERS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDependencyInfo.BUFFERMEMORYBARRIERCOUNT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDependencyInfo.PBUFFERMEMORYBARRIERS = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDependencyInfo.IMAGEMEMORYBARRIERCOUNT = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDependencyInfo.PIMAGEMEMORYBARRIERS = r0
            return
    }
}
