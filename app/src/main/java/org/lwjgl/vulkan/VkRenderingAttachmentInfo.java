package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfo.class */
public class VkRenderingAttachmentInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkRenderingAttachmentInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int IMAGEVIEW = 0;
    public static final int IMAGELAYOUT = 0;
    public static final int RESOLVEMODE = 0;
    public static final int RESOLVEIMAGEVIEW = 0;
    public static final int RESOLVEIMAGELAYOUT = 0;
    public static final int LOADOP = 0;
    public static final int STOREOP = 0;
    public static final int CLEARVALUE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkRenderingAttachmentInfo, org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkRenderingAttachmentInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkRenderingAttachmentInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageView")
        public long imageView() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.nimageView(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageLayout")
        public int imageLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.nimageLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkResolveModeFlagBits")
        public int resolveMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.nresolveMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageView")
        public long resolveImageView() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.nresolveImageView(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageLayout")
        public int resolveImageLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.nresolveImageLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAttachmentLoadOp")
        public int loadOp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.nloadOp(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAttachmentStoreOp")
        public int storeOp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.nstoreOp(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkClearValue clearValue() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkClearValue r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.nclearValue(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000044001(0x3b9b75e1, float:0.004744277)
                org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRenderingAttachmentInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer imageView(@org.lwjgl.system.NativeType("VkImageView") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRenderingAttachmentInfo.nimageView(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer imageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfo.nimageLayout(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer resolveMode(@org.lwjgl.system.NativeType("VkResolveModeFlagBits") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfo.nresolveMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer resolveImageView(@org.lwjgl.system.NativeType("VkImageView") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRenderingAttachmentInfo.nresolveImageView(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer resolveImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfo.nresolveImageLayout(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer loadOp(@org.lwjgl.system.NativeType("VkAttachmentLoadOp") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfo.nloadOp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer storeOp(@org.lwjgl.system.NativeType("VkAttachmentStoreOp") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfo.nstoreOp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer clearValue(org.lwjgl.vulkan.VkClearValue r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfo.nclearValue(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer clearValue(java.util.function.Consumer<org.lwjgl.vulkan.VkClearValue> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkClearValue r1 = r1.clearValue()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.create(r0)
                org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkRenderingAttachmentInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkRenderingAttachmentInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkRenderingAttachmentInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkImageView")
    public long imageView() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nimageView(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageLayout")
    public int imageLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimageLayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResolveModeFlagBits")
    public int resolveMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nresolveMode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageView")
    public long resolveImageView() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nresolveImageView(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageLayout")
    public int resolveImageLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nresolveImageLayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkAttachmentLoadOp")
    public int loadOp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nloadOp(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkAttachmentStoreOp")
    public int storeOp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstoreOp(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkClearValue clearValue() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkClearValue r0 = nclearValue(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAttachmentInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAttachmentInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000044001(0x3b9b75e1, float:0.004744277)
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAttachmentInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAttachmentInfo imageView(@org.lwjgl.system.NativeType("VkImageView") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nimageView(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAttachmentInfo imageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAttachmentInfo resolveMode(@org.lwjgl.system.NativeType("VkResolveModeFlagBits") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nresolveMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAttachmentInfo resolveImageView(@org.lwjgl.system.NativeType("VkImageView") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nresolveImageView(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAttachmentInfo resolveImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nresolveImageLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAttachmentInfo loadOp(@org.lwjgl.system.NativeType("VkAttachmentLoadOp") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nloadOp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAttachmentInfo storeOp(@org.lwjgl.system.NativeType("VkAttachmentStoreOp") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstoreOp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAttachmentInfo clearValue(org.lwjgl.vulkan.VkClearValue r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nclearValue(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAttachmentInfo clearValue(java.util.function.Consumer<org.lwjgl.vulkan.VkClearValue> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkClearValue r1 = r1.clearValue()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAttachmentInfo set(int r5, long r6, long r8, int r10, int r11, long r12, int r14, int r15, int r16, org.lwjgl.vulkan.VkClearValue r17) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = r0.imageView(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = r0.imageLayout(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = r0.resolveMode(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = r0.resolveImageView(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = r0.resolveImageLayout(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = r0.loadOp(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = r0.storeOp(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = r0.clearValue(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAttachmentInfo set(org.lwjgl.vulkan.VkRenderingAttachmentInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo malloc() {
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo calloc() {
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo create() {
            int r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo create(long r6) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer
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

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nimageView(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.IMAGEVIEW
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nimageLayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.IMAGELAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nresolveMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.RESOLVEMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nresolveImageView(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.RESOLVEIMAGEVIEW
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nresolveImageLayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.RESOLVEIMAGELAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nloadOp(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.LOADOP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstoreOp(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.STOREOP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkClearValue nclearValue(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.CLEARVALUE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkClearValue r0 = org.lwjgl.vulkan.VkClearValue.create(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nimageView(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.IMAGEVIEW
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nimageLayout(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.IMAGELAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nresolveMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.RESOLVEMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nresolveImageView(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.RESOLVEIMAGEVIEW
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nresolveImageLayout(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.RESOLVEIMAGELAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nloadOp(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.LOADOP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstoreOp(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.STOREOP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nclearValue(long r7, org.lwjgl.vulkan.VkClearValue r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.CLEARVALUE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkClearValue.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.POINTER_SIZE
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.VkClearValue.SIZEOF
            int r4 = org.lwjgl.vulkan.VkClearValue.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkRenderingAttachmentInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkRenderingAttachmentInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAttachmentInfo.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAttachmentInfo.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAttachmentInfo.IMAGEVIEW = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAttachmentInfo.IMAGELAYOUT = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAttachmentInfo.RESOLVEMODE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAttachmentInfo.RESOLVEIMAGEVIEW = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAttachmentInfo.RESOLVEIMAGELAYOUT = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAttachmentInfo.LOADOP = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAttachmentInfo.STOREOP = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAttachmentInfo.CLEARVALUE = r0
            return
    }
}
