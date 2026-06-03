package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMemoryToImageCopyEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMemoryToImageCopyEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMemoryToImageCopyEXT.class */
public class VkMemoryToImageCopyEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkMemoryToImageCopyEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int PHOSTPOINTER = 0;
    public static final int MEMORYROWLENGTH = 0;
    public static final int MEMORYIMAGEHEIGHT = 0;
    public static final int IMAGESUBRESOURCE = 0;
    public static final int IMAGEOFFSET = 0;
    public static final int IMAGEEXTENT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMemoryToImageCopyEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMemoryToImageCopyEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkMemoryToImageCopyEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkMemoryToImageCopyEXT, org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkMemoryToImageCopyEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkMemoryToImageCopyEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pHostPointer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.npHostPointer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int memoryRowLength() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.nmemoryRowLength(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int memoryImageHeight() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.nmemoryImageHeight(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkImageSubresourceLayers imageSubresource() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkImageSubresourceLayers r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.nimageSubresource(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkOffset3D imageOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkOffset3D r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.nimageOffset(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent3D imageExtent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent3D r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.nimageExtent(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMemoryToImageCopyEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000270002(0x3b9ee8b2, float:0.004849517)
                org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkMemoryToImageCopyEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer pHostPointer(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkMemoryToImageCopyEXT.npHostPointer(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer memoryRowLength(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMemoryToImageCopyEXT.nmemoryRowLength(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer memoryImageHeight(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMemoryToImageCopyEXT.nmemoryImageHeight(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer imageSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMemoryToImageCopyEXT.nimageSubresource(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer imageSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.imageSubresource()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer imageOffset(org.lwjgl.vulkan.VkOffset3D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMemoryToImageCopyEXT.nimageOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer imageOffset(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkOffset3D r1 = r1.imageOffset()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer imageExtent(org.lwjgl.vulkan.VkExtent3D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkMemoryToImageCopyEXT.nimageExtent(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer imageExtent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent3D> r4) {
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
                org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.create(r0)
                org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkMemoryToImageCopyEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkMemoryToImageCopyEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = new org.lwjgl.vulkan.VkMemoryToImageCopyEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkMemoryToImageCopyEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("void const *")
    public long pHostPointer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npHostPointer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int memoryRowLength() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmemoryRowLength(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int memoryImageHeight() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmemoryImageHeight(r0)
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

    public org.lwjgl.vulkan.VkMemoryToImageCopyEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryToImageCopyEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000270002(0x3b9ee8b2, float:0.004849517)
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryToImageCopyEXT pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryToImageCopyEXT pHostPointer(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npHostPointer(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryToImageCopyEXT memoryRowLength(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmemoryRowLength(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryToImageCopyEXT memoryImageHeight(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmemoryImageHeight(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryToImageCopyEXT imageSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageSubresource(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryToImageCopyEXT imageSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.imageSubresource()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryToImageCopyEXT imageOffset(org.lwjgl.vulkan.VkOffset3D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryToImageCopyEXT imageOffset(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkOffset3D r1 = r1.imageOffset()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryToImageCopyEXT imageExtent(org.lwjgl.vulkan.VkExtent3D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageExtent(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryToImageCopyEXT imageExtent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent3D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkExtent3D r1 = r1.imageExtent()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryToImageCopyEXT set(int r5, long r6, long r8, int r10, int r11, org.lwjgl.vulkan.VkImageSubresourceLayers r12, org.lwjgl.vulkan.VkOffset3D r13, org.lwjgl.vulkan.VkExtent3D r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = r0.pHostPointer(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = r0.memoryRowLength(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = r0.memoryImageHeight(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = r0.imageSubresource(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = r0.imageOffset(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = r0.imageExtent(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkMemoryToImageCopyEXT set(org.lwjgl.vulkan.VkMemoryToImageCopyEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryToImageCopyEXT malloc() {
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = new org.lwjgl.vulkan.VkMemoryToImageCopyEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryToImageCopyEXT calloc() {
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = new org.lwjgl.vulkan.VkMemoryToImageCopyEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryToImageCopyEXT create() {
            int r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = new org.lwjgl.vulkan.VkMemoryToImageCopyEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryToImageCopyEXT create(long r6) {
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = new org.lwjgl.vulkan.VkMemoryToImageCopyEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkMemoryToImageCopyEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = new org.lwjgl.vulkan.VkMemoryToImageCopyEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer r0 = new org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer r0 = new org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer r0 = new org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer
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

    public static org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer r0 = new org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer r0 = new org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryToImageCopyEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = new org.lwjgl.vulkan.VkMemoryToImageCopyEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryToImageCopyEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = new org.lwjgl.vulkan.VkMemoryToImageCopyEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer r0 = new org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkMemoryToImageCopyEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer r0 = new org.lwjgl.vulkan.VkMemoryToImageCopyEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long npHostPointer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.PHOSTPOINTER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nmemoryRowLength(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.MEMORYROWLENGTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmemoryImageHeight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.MEMORYIMAGEHEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceLayers nimageSubresource(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.IMAGESUBRESOURCE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkImageSubresourceLayers r0 = org.lwjgl.vulkan.VkImageSubresourceLayers.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkOffset3D nimageOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.IMAGEOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkOffset3D r0 = org.lwjgl.vulkan.VkOffset3D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent3D nimageExtent(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.IMAGEEXTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent3D r0 = org.lwjgl.vulkan.VkExtent3D.create(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npHostPointer(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.PHOSTPOINTER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmemoryRowLength(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.MEMORYROWLENGTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmemoryImageHeight(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.MEMORYIMAGEHEIGHT
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
            int r2 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.IMAGESUBRESOURCE
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
            int r2 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.IMAGEOFFSET
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
            int r2 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.IMAGEEXTENT
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkExtent3D.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.PHOSTPOINTER
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
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkMemoryToImageCopyEXT.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF
            int r4 = org.lwjgl.vulkan.VkImageSubresourceLayers.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkOffset3D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkExtent3D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent3D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT.PHOSTPOINTER = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT.MEMORYROWLENGTH = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT.MEMORYIMAGEHEIGHT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT.IMAGESUBRESOURCE = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT.IMAGEOFFSET = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkMemoryToImageCopyEXT.IMAGEEXTENT = r0
            return
    }
}
