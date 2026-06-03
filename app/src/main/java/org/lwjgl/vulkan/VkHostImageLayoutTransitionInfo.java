package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkHostImageLayoutTransitionInfo.class */
public class VkHostImageLayoutTransitionInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int IMAGE = 0;
    public static final int OLDLAYOUT = 0;
    public static final int NEWLAYOUT = 0;
    public static final int SUBRESOURCERANGE = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkHostImageLayoutTransitionInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo, org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF
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

        Buffer(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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
        protected org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer
                r1 = r0
                r2 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImage")
        public long image() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.nimage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageLayout")
        public int oldLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.noldLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageLayout")
        public int newLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.nnewLayout(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkImageSubresourceRange subresourceRange() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkImageSubresourceRange r0 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.nsubresourceRange(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000270006(0x3b9ee8b6, float:0.0048495186)
                org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer image(@org.lwjgl.system.NativeType("VkImage") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.nimage(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer oldLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.noldLayout(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer newLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.nnewLayout(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer subresourceRange(org.lwjgl.vulkan.VkImageSubresourceRange r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.nsubresourceRange(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer subresourceRange(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceRange> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkImageSubresourceRange r1 = r1.subresourceRange()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4775create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.create(r0)
                org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkHostImageLayoutTransitionInfo(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkHostImageLayoutTransitionInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkImage")
    public long image() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nimage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageLayout")
    public int oldLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noldLayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageLayout")
    public int newLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnewLayout(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceRange subresourceRange() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = nsubresourceRange(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000270006(0x3b9ee8b6, float:0.0048495186)
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo image(@org.lwjgl.system.NativeType("VkImage") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nimage(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo oldLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noldLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo newLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnewLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo subresourceRange(org.lwjgl.vulkan.VkImageSubresourceRange r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsubresourceRange(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo subresourceRange(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceRange> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkImageSubresourceRange r1 = r1.subresourceRange()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo set(int r5, long r6, long r8, int r10, int r11, org.lwjgl.vulkan.VkImageSubresourceRange r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = r0.image(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = r0.oldLayout(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = r0.newLayout(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = r0.subresourceRange(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo set(org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo malloc() {
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo calloc() {
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo create() {
            int r0 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo create(long r6) {
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer
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

    public static org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer r0 = new org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nimage(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.IMAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int noldLayout(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.OLDLAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nnewLayout(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.NEWLAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceRange nsubresourceRange(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SUBRESOURCERANGE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkImageSubresourceRange r0 = org.lwjgl.vulkan.VkImageSubresourceRange.create(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nimage(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.IMAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void noldLayout(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.OLDLAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nnewLayout(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.NEWLAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsubresourceRange(long r7, org.lwjgl.vulkan.VkImageSubresourceRange r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SUBRESOURCERANGE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
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
            int r3 = org.lwjgl.vulkan.VkImageSubresourceRange.SIZEOF
            int r4 = org.lwjgl.vulkan.VkImageSubresourceRange.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.IMAGE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.OLDLAYOUT = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.NEWLAYOUT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkHostImageLayoutTransitionInfo.SUBRESOURCERANGE = r0
            return
    }
}
