package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToMemoryInfoEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToMemoryInfoEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToMemoryInfoEXT.class */
public class VkCopyImageToMemoryInfoEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int SRCIMAGE = 0;
    public static final int SRCIMAGELAYOUT = 0;
    public static final int REGIONCOUNT = 0;
    public static final int PREGIONS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToMemoryInfoEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToMemoryInfoEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyImageToMemoryInfoEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT, org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkHostImageCopyFlagsEXT")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImage")
        public long srcImage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.nsrcImage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageLayout")
        public int srcImageLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.nsrcImageLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int regionCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.nregionCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageToMemoryCopyEXT const *")
        public org.lwjgl.vulkan.VkImageToMemoryCopyEXT.Buffer pRegions() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkImageToMemoryCopyEXT$Buffer r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.npRegions(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000270004(0x3b9ee8b4, float:0.0048495177)
                org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer flags(@org.lwjgl.system.NativeType("VkHostImageCopyFlagsEXT") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer srcImage(@org.lwjgl.system.NativeType("VkImage") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.nsrcImage(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer srcImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.nsrcImageLayout(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer pRegions(@org.lwjgl.system.NativeType("VkImageToMemoryCopyEXT const *") org.lwjgl.vulkan.VkImageToMemoryCopyEXT.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.npRegions(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.create(r0)
                org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkCopyImageToMemoryInfoEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkCopyImageToMemoryInfoEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int regionCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nregionCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageToMemoryCopyEXT const *")
    public org.lwjgl.vulkan.VkImageToMemoryCopyEXT.Buffer pRegions() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkImageToMemoryCopyEXT$Buffer r0 = npRegions(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000270004(0x3b9ee8b4, float:0.0048495177)
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT flags(@org.lwjgl.system.NativeType("VkHostImageCopyFlagsEXT") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT srcImage(@org.lwjgl.system.NativeType("VkImage") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcImage(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT srcImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcImageLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT pRegions(@org.lwjgl.system.NativeType("VkImageToMemoryCopyEXT const *") org.lwjgl.vulkan.VkImageToMemoryCopyEXT.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npRegions(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT set(int r5, long r6, int r8, long r9, int r11, org.lwjgl.vulkan.VkImageToMemoryCopyEXT.Buffer r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = r0.srcImage(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = r0.srcImageLayout(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = r0.pRegions(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT set(org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT malloc() {
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT calloc() {
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT create() {
            int r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT create(long r6) {
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer
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

    public static org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = new org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer r0 = new org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nsrcImage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SRCIMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nsrcImageLayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SRCIMAGELAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nregionCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.REGIONCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageToMemoryCopyEXT.Buffer npRegions(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.PREGIONS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nregionCount(r1)
            org.lwjgl.vulkan.VkImageToMemoryCopyEXT$Buffer r0 = org.lwjgl.vulkan.VkImageToMemoryCopyEXT.create(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsrcImage(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SRCIMAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nsrcImageLayout(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SRCIMAGELAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nregionCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.REGIONCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npRegions(long r5, org.lwjgl.vulkan.VkImageToMemoryCopyEXT.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.PREGIONS
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

    public static void validate(long r6) {
            r0 = r6
            int r0 = nregionCount(r0)
            r8 = r0
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.PREGIONS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r9 = r0
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = r8
            int r2 = org.lwjgl.vulkan.VkImageToMemoryCopyEXT.SIZEOF
            void r3 = org.lwjgl.vulkan.VkImageToMemoryCopyEXT::validate
            validate(r0, r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 7
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.POINTER_SIZE
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SRCIMAGE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.SRCIMAGELAYOUT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.REGIONCOUNT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyImageToMemoryInfoEXT.PREGIONS = r0
            return
    }
}
