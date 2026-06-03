package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToImageInfoEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToImageInfoEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToImageInfoEXT.class */
public class VkCopyImageToImageInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkCopyImageToImageInfoEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int SRCIMAGE = 0;
    public static final int SRCIMAGELAYOUT = 0;
    public static final int DSTIMAGE = 0;
    public static final int DSTIMAGELAYOUT = 0;
    public static final int REGIONCOUNT = 0;
    public static final int PREGIONS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToImageInfoEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToImageInfoEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToImageInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkCopyImageToImageInfoEXT, org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkCopyImageToImageInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkCopyImageToImageInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkHostImageCopyFlagsEXT")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImage")
        public long srcImage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.nsrcImage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageLayout")
        public int srcImageLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.nsrcImageLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImage")
        public long dstImage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.ndstImage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageLayout")
        public int dstImageLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.ndstImageLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int regionCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.nregionCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageCopy2 const *")
        public org.lwjgl.vulkan.VkImageCopy2.Buffer pRegions() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkImageCopy2$Buffer r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.npRegions(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000270007(0x3b9ee8b7, float:0.004849519)
                org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer flags(@org.lwjgl.system.NativeType("VkHostImageCopyFlagsEXT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer srcImage(@org.lwjgl.system.NativeType("VkImage") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.nsrcImage(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer srcImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.nsrcImageLayout(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer dstImage(@org.lwjgl.system.NativeType("VkImage") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.ndstImage(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer dstImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.ndstImageLayout(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer pRegions(@org.lwjgl.system.NativeType("VkImageCopy2 const *") org.lwjgl.vulkan.VkImageCopy2.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.npRegions(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.create(r0)
                org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkCopyImageToImageInfoEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkCopyImageToImageInfoEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToImageInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkCopyImageToImageInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("VkHostImageCopyFlagsEXT")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImage")
    public long srcImage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsrcImage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageLayout")
    public int srcImageLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsrcImageLayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImage")
    public long dstImage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndstImage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageLayout")
    public int dstImageLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndstImageLayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int regionCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nregionCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageCopy2 const *")
    public org.lwjgl.vulkan.VkImageCopy2.Buffer pRegions() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkImageCopy2$Buffer r0 = npRegions(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000270007(0x3b9ee8b7, float:0.004849519)
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT flags(@org.lwjgl.system.NativeType("VkHostImageCopyFlagsEXT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT srcImage(@org.lwjgl.system.NativeType("VkImage") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcImage(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT srcImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcImageLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT dstImage(@org.lwjgl.system.NativeType("VkImage") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndstImage(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT dstImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstImageLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT pRegions(@org.lwjgl.system.NativeType("VkImageCopy2 const *") org.lwjgl.vulkan.VkImageCopy2.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npRegions(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT set(int r5, long r6, int r8, long r9, int r11, long r12, int r14, org.lwjgl.vulkan.VkImageCopy2.Buffer r15) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = r0.srcImage(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = r0.srcImageLayout(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = r0.dstImage(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = r0.dstImageLayout(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = r0.pRegions(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToImageInfoEXT set(org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToImageInfoEXT malloc() {
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToImageInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToImageInfoEXT calloc() {
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToImageInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToImageInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToImageInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToImageInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToImageInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCopyImageToImageInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToImageInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToImageInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToImageInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToImageInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToImageInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToImageInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nsrcImage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SRCIMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nsrcImageLayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SRCIMAGELAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ndstImage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.DSTIMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int ndstImageLayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.DSTIMAGELAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nregionCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.REGIONCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCopy2.Buffer npRegions(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.PREGIONS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nregionCount(r1)
            org.lwjgl.vulkan.VkImageCopy2$Buffer r0 = org.lwjgl.vulkan.VkImageCopy2.create(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsrcImage(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SRCIMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nsrcImageLayout(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SRCIMAGELAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndstImage(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.DSTIMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void ndstImageLayout(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.DSTIMAGELAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nregionCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.REGIONCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npRegions(long r5, org.lwjgl.vulkan.VkImageCopy2.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.PREGIONS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            nregionCount(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.PREGIONS
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
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 8
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
            int r3 = org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SRCIMAGE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.SRCIMAGELAYOUT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.DSTIMAGE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.DSTIMAGELAYOUT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.REGIONCOUNT = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToImageInfoEXT.PREGIONS = r0
            return
    }
}
