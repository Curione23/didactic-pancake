package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyMemoryToImageIndirectCommandNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyMemoryToImageIndirectCommandNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyMemoryToImageIndirectCommandNV.class */
public class VkCopyMemoryToImageIndirectCommandNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int SRCADDRESS = 0;
    public static final int BUFFERROWLENGTH = 0;
    public static final int BUFFERIMAGEHEIGHT = 0;
    public static final int IMAGESUBRESOURCE = 0;
    public static final int IMAGEOFFSET = 0;
    public static final int IMAGEEXTENT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyMemoryToImageIndirectCommandNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyMemoryToImageIndirectCommandNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyMemoryToImageIndirectCommandNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV, org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long srcAddress() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.nsrcAddress(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int bufferRowLength() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.nbufferRowLength(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int bufferImageHeight() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.nbufferImageHeight(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkImageSubresourceLayers imageSubresource() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkImageSubresourceLayers r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.nimageSubresource(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkOffset3D imageOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkOffset3D r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.nimageOffset(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent3D imageExtent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent3D r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.nimageExtent(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer srcAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.nsrcAddress(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer bufferRowLength(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.nbufferRowLength(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer bufferImageHeight(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.nbufferImageHeight(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer imageSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.nimageSubresource(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer imageSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.imageSubresource()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer imageOffset(org.lwjgl.vulkan.VkOffset3D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.nimageOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer imageOffset(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkOffset3D r1 = r1.imageOffset()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer imageExtent(org.lwjgl.vulkan.VkExtent3D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.nimageExtent(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer imageExtent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent3D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkExtent3D r1 = r1.imageExtent()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.create(r0)
                org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkCopyMemoryToImageIndirectCommandNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = new org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkCopyMemoryToImageIndirectCommandNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long srcAddress() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsrcAddress(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int bufferRowLength() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbufferRowLength(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int bufferImageHeight() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbufferImageHeight(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceLayers imageSubresource() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkImageSubresourceLayers r0 = nimageSubresource(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkOffset3D imageOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkOffset3D r0 = nimageOffset(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent3D imageExtent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent3D r0 = nimageExtent(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV srcAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcAddress(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV bufferRowLength(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbufferRowLength(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV bufferImageHeight(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbufferImageHeight(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV imageSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageSubresource(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV imageSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.imageSubresource()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV imageOffset(org.lwjgl.vulkan.VkOffset3D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV imageOffset(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkOffset3D r1 = r1.imageOffset()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV imageExtent(org.lwjgl.vulkan.VkExtent3D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageExtent(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV imageExtent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent3D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkExtent3D r1 = r1.imageExtent()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV set(long r5, int r7, int r8, org.lwjgl.vulkan.VkImageSubresourceLayers r9, org.lwjgl.vulkan.VkOffset3D r10, org.lwjgl.vulkan.VkExtent3D r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = r0.srcAddress(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = r0.bufferRowLength(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = r0.bufferImageHeight(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = r0.imageSubresource(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = r0.imageOffset(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = r0.imageExtent(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV set(org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV malloc() {
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = new org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV calloc() {
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = new org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV create() {
            int r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = new org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV create(long r6) {
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = new org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = new org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV$Buffer r0 = new org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV$Buffer r0 = new org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV$Buffer r0 = new org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV$Buffer
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

    public static org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV$Buffer r0 = new org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV$Buffer r0 = new org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = new org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = new org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV$Buffer r0 = new org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV$Buffer r0 = new org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long nsrcAddress(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SRCADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nbufferRowLength(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.BUFFERROWLENGTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nbufferImageHeight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.BUFFERIMAGEHEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceLayers nimageSubresource(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.IMAGESUBRESOURCE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkImageSubresourceLayers r0 = org.lwjgl.vulkan.VkImageSubresourceLayers.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkOffset3D nimageOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.IMAGEOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkOffset3D r0 = org.lwjgl.vulkan.VkOffset3D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent3D nimageExtent(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.IMAGEEXTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent3D r0 = org.lwjgl.vulkan.VkExtent3D.create(r0)
            return r0
    }

    public static void nsrcAddress(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SRCADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nbufferRowLength(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.BUFFERROWLENGTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nbufferImageHeight(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.BUFFERIMAGEHEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimageSubresource(long r7, org.lwjgl.vulkan.VkImageSubresourceLayers r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.IMAGESUBRESOURCE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nimageOffset(long r7, org.lwjgl.vulkan.VkOffset3D r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.IMAGEOFFSET
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nimageExtent(long r7, org.lwjgl.vulkan.VkExtent3D r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.IMAGEEXTENT
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkExtent3D.SIZEOF
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
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 8
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
            int r3 = org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF
            int r4 = org.lwjgl.vulkan.VkImageSubresourceLayers.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkOffset3D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkExtent3D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent3D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.SRCADDRESS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.BUFFERROWLENGTH = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.BUFFERIMAGEHEIGHT = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.IMAGESUBRESOURCE = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.IMAGEOFFSET = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyMemoryToImageIndirectCommandNV.IMAGEEXTENT = r0
            return
    }
}
