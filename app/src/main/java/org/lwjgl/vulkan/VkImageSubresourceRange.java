package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageSubresourceRange.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageSubresourceRange.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageSubresourceRange.class */
public class VkImageSubresourceRange extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkImageSubresourceRange> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int ASPECTMASK = 0;
    public static final int BASEMIPLEVEL = 0;
    public static final int LEVELCOUNT = 0;
    public static final int BASEARRAYLAYER = 0;
    public static final int LAYERCOUNT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageSubresourceRange$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageSubresourceRange$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageSubresourceRange$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkImageSubresourceRange, org.lwjgl.vulkan.VkImageSubresourceRange.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkImageSubresourceRange ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
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
        protected org.lwjgl.vulkan.VkImageSubresourceRange.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkImageSubresourceRange getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkImageSubresourceRange r0 = org.lwjgl.vulkan.VkImageSubresourceRange.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageAspectFlags")
        public int aspectMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageSubresourceRange.naspectMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int baseMipLevel() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageSubresourceRange.nbaseMipLevel(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int levelCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageSubresourceRange.nlevelCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int baseArrayLayer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageSubresourceRange.nbaseArrayLayer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int layerCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageSubresourceRange.nlayerCount(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkImageSubresourceRange.Buffer aspectMask(@org.lwjgl.system.NativeType("VkImageAspectFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageSubresourceRange.naspectMask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageSubresourceRange.Buffer baseMipLevel(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageSubresourceRange.nbaseMipLevel(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageSubresourceRange.Buffer levelCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageSubresourceRange.nlevelCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageSubresourceRange.Buffer baseArrayLayer(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageSubresourceRange.nbaseArrayLayer(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageSubresourceRange.Buffer layerCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageSubresourceRange.nlayerCount(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageSubresourceRange r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageSubresourceRange$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkImageSubresourceRange r0 = org.lwjgl.vulkan.VkImageSubresourceRange.create(r0)
                org.lwjgl.vulkan.VkImageSubresourceRange.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkImageSubresourceRange(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkImageSubresourceRange create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = new org.lwjgl.vulkan.VkImageSubresourceRange
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkImageSubresourceRange(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageAspectFlags")
    public int aspectMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = naspectMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int baseMipLevel() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbaseMipLevel(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int levelCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlevelCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int baseArrayLayer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbaseArrayLayer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int layerCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlayerCount(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceRange aspectMask(@org.lwjgl.system.NativeType("VkImageAspectFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            naspectMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceRange baseMipLevel(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbaseMipLevel(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceRange levelCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlevelCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceRange baseArrayLayer(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbaseArrayLayer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceRange layerCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlayerCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceRange set(int r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = r0.aspectMask(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = r0.baseMipLevel(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = r0.levelCount(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = r0.baseArrayLayer(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = r0.layerCount(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceRange set(org.lwjgl.vulkan.VkImageSubresourceRange r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceRange malloc() {
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = new org.lwjgl.vulkan.VkImageSubresourceRange
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceRange calloc() {
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = new org.lwjgl.vulkan.VkImageSubresourceRange
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceRange create() {
            int r0 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = new org.lwjgl.vulkan.VkImageSubresourceRange
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceRange create(long r6) {
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = new org.lwjgl.vulkan.VkImageSubresourceRange
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageSubresourceRange createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = new org.lwjgl.vulkan.VkImageSubresourceRange
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceRange.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkImageSubresourceRange$Buffer r0 = new org.lwjgl.vulkan.VkImageSubresourceRange$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceRange.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkImageSubresourceRange$Buffer r0 = new org.lwjgl.vulkan.VkImageSubresourceRange$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceRange.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkImageSubresourceRange$Buffer r0 = new org.lwjgl.vulkan.VkImageSubresourceRange$Buffer
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

    public static org.lwjgl.vulkan.VkImageSubresourceRange.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkImageSubresourceRange$Buffer r0 = new org.lwjgl.vulkan.VkImageSubresourceRange$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageSubresourceRange.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageSubresourceRange$Buffer r0 = new org.lwjgl.vulkan.VkImageSubresourceRange$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageSubresourceRange mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageSubresourceRange callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageSubresourceRange mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageSubresourceRange callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageSubresourceRange.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageSubresourceRange$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageSubresourceRange.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageSubresourceRange$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageSubresourceRange.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageSubresourceRange$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageSubresourceRange.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageSubresourceRange$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceRange malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = new org.lwjgl.vulkan.VkImageSubresourceRange
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceRange calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = new org.lwjgl.vulkan.VkImageSubresourceRange
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceRange.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageSubresourceRange$Buffer r0 = new org.lwjgl.vulkan.VkImageSubresourceRange$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceRange.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageSubresourceRange$Buffer r0 = new org.lwjgl.vulkan.VkImageSubresourceRange$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int naspectMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageSubresourceRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.ASPECTMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nbaseMipLevel(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageSubresourceRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.BASEMIPLEVEL
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nlevelCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageSubresourceRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.LEVELCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nbaseArrayLayer(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageSubresourceRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.BASEARRAYLAYER
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nlayerCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageSubresourceRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.LAYERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void naspectMask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageSubresourceRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.ASPECTMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nbaseMipLevel(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageSubresourceRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.BASEMIPLEVEL
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nlevelCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageSubresourceRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.LEVELCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nbaseArrayLayer(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageSubresourceRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.BASEARRAYLAYER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nlayerCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageSubresourceRange.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.LAYERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkImageSubresourceRange.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageSubresourceRange.ASPECTMASK = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageSubresourceRange.BASEMIPLEVEL = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageSubresourceRange.LEVELCOUNT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageSubresourceRange.BASEARRAYLAYER = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageSubresourceRange.LAYERCOUNT = r0
            return
    }
}
