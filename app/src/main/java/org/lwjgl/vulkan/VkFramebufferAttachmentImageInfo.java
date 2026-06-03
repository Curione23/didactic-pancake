package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkFramebufferAttachmentImageInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkFramebufferAttachmentImageInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkFramebufferAttachmentImageInfo.class */
public class VkFramebufferAttachmentImageInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int USAGE = 0;
    public static final int WIDTH = 0;
    public static final int HEIGHT = 0;
    public static final int LAYERCOUNT = 0;
    public static final int VIEWFORMATCOUNT = 0;
    public static final int PVIEWFORMATS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkFramebufferAttachmentImageInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkFramebufferAttachmentImageInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkFramebufferAttachmentImageInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo, org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageUsageFlags")
        public int usage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.nusage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.nwidth(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.nheight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int layerCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.nlayerCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int viewFormatCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.nviewFormatCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkFormat const *")
        public java.nio.IntBuffer pViewFormats() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.npViewFormats(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000108002(0x3b9c6fe2, float:0.0047740797)
                org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer flags(@org.lwjgl.system.NativeType("VkImageCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer usage(@org.lwjgl.system.NativeType("VkImageUsageFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.nusage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer width(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.nwidth(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer height(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.nheight(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer layerCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.nlayerCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer pViewFormats(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkFormat const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.npViewFormats(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.create(r0)
                org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkFramebufferAttachmentImageInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = new org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkFramebufferAttachmentImageInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkImageCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageUsageFlags")
    public int usage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nusage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nwidth(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int height() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nheight(r0)
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int viewFormatCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nviewFormatCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkFormat const *")
    public java.nio.IntBuffer pViewFormats() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npViewFormats(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000108002(0x3b9c6fe2, float:0.0047740797)
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo flags(@org.lwjgl.system.NativeType("VkImageCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo usage(@org.lwjgl.system.NativeType("VkImageUsageFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nusage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo width(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nwidth(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo height(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheight(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo layerCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlayerCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo pViewFormats(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkFormat const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npViewFormats(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo set(int r5, long r6, int r8, int r9, int r10, int r11, int r12, @javax.annotation.Nullable java.nio.IntBuffer r13) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = r0.usage(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = r0.width(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = r0.height(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = r0.layerCount(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = r0.pViewFormats(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo set(org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo malloc() {
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = new org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo calloc() {
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = new org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo create() {
            int r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = new org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo create(long r6) {
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = new org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = new org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer r0 = new org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer r0 = new org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer r0 = new org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer
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

    public static org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer r0 = new org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer r0 = new org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = new org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = new org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer r0 = new org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer r0 = new org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nusage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.USAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nwidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nheight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nlayerCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.LAYERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nviewFormatCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.VIEWFORMATCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer npViewFormats(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.PVIEWFORMATS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nviewFormatCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nusage(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.USAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nwidth(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nheight(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nlayerCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.LAYERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nviewFormatCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.VIEWFORMATCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npViewFormats(long r5, @javax.annotation.Nullable java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.PVIEWFORMATS
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
            nviewFormatCount(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r0 = nviewFormatCount(r0)
            if (r0 == 0) goto L14
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.PVIEWFORMATS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.USAGE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.WIDTH = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.HEIGHT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.LAYERCOUNT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.VIEWFORMATCOUNT = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkFramebufferAttachmentImageInfo.PVIEWFORMATS = r0
            return
    }
}
