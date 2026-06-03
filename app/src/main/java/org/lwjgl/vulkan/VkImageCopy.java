package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageCopy.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageCopy.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageCopy.class */
public class VkImageCopy extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkImageCopy> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int SRCSUBRESOURCE = 0;
    public static final int SRCOFFSET = 0;
    public static final int DSTSUBRESOURCE = 0;
    public static final int DSTOFFSET = 0;
    public static final int EXTENT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageCopy$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageCopy$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageCopy$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkImageCopy, org.lwjgl.vulkan.VkImageCopy.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkImageCopy ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkImageCopy.SIZEOF
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
        protected org.lwjgl.vulkan.VkImageCopy.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkImageCopy getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkImageCopy r0 = org.lwjgl.vulkan.VkImageCopy.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.VkImageSubresourceLayers srcSubresource() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkImageSubresourceLayers r0 = org.lwjgl.vulkan.VkImageCopy.nsrcSubresource(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkOffset3D srcOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkOffset3D r0 = org.lwjgl.vulkan.VkImageCopy.nsrcOffset(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkImageSubresourceLayers dstSubresource() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkImageSubresourceLayers r0 = org.lwjgl.vulkan.VkImageCopy.ndstSubresource(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkOffset3D dstOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkOffset3D r0 = org.lwjgl.vulkan.VkImageCopy.ndstOffset(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent3D extent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent3D r0 = org.lwjgl.vulkan.VkImageCopy.nextent(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCopy.Buffer srcSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCopy.nsrcSubresource(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCopy.Buffer srcSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.srcSubresource()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkImageCopy.Buffer srcOffset(org.lwjgl.vulkan.VkOffset3D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCopy.nsrcOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCopy.Buffer srcOffset(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkOffset3D r1 = r1.srcOffset()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkImageCopy.Buffer dstSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCopy.ndstSubresource(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCopy.Buffer dstSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.dstSubresource()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkImageCopy.Buffer dstOffset(org.lwjgl.vulkan.VkOffset3D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCopy.ndstOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCopy.Buffer dstOffset(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkOffset3D r1 = r1.dstOffset()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkImageCopy.Buffer extent(org.lwjgl.vulkan.VkExtent3D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCopy.nextent(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCopy.Buffer extent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent3D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkExtent3D r1 = r1.extent()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageCopy r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageCopy$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkImageCopy r0 = org.lwjgl.vulkan.VkImageCopy.create(r0)
                org.lwjgl.vulkan.VkImageCopy.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkImageCopy(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkImageCopy create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkImageCopy r0 = new org.lwjgl.vulkan.VkImageCopy
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkImageCopy(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCopy.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkImageCopy.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceLayers srcSubresource() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkImageSubresourceLayers r0 = nsrcSubresource(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkOffset3D srcOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkOffset3D r0 = nsrcOffset(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceLayers dstSubresource() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkImageSubresourceLayers r0 = ndstSubresource(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkOffset3D dstOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkOffset3D r0 = ndstOffset(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent3D extent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent3D r0 = nextent(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCopy srcSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcSubresource(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCopy srcSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.srcSubresource()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageCopy srcOffset(org.lwjgl.vulkan.VkOffset3D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCopy srcOffset(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkOffset3D r1 = r1.srcOffset()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageCopy dstSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstSubresource(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCopy dstSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.dstSubresource()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageCopy dstOffset(org.lwjgl.vulkan.VkOffset3D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCopy dstOffset(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkOffset3D r1 = r1.dstOffset()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageCopy extent(org.lwjgl.vulkan.VkExtent3D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nextent(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCopy extent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent3D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkExtent3D r1 = r1.extent()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageCopy set(org.lwjgl.vulkan.VkImageSubresourceLayers r4, org.lwjgl.vulkan.VkOffset3D r5, org.lwjgl.vulkan.VkImageSubresourceLayers r6, org.lwjgl.vulkan.VkOffset3D r7, org.lwjgl.vulkan.VkExtent3D r8) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageCopy r0 = r0.srcSubresource(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkImageCopy r0 = r0.srcOffset(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.VkImageCopy r0 = r0.dstSubresource(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.VkImageCopy r0 = r0.dstOffset(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.VkImageCopy r0 = r0.extent(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageCopy set(org.lwjgl.vulkan.VkImageCopy r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkImageCopy.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCopy malloc() {
            org.lwjgl.vulkan.VkImageCopy r0 = new org.lwjgl.vulkan.VkImageCopy
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkImageCopy.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCopy calloc() {
            org.lwjgl.vulkan.VkImageCopy r0 = new org.lwjgl.vulkan.VkImageCopy
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkImageCopy.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCopy create() {
            int r0 = org.lwjgl.vulkan.VkImageCopy.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkImageCopy r0 = new org.lwjgl.vulkan.VkImageCopy
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCopy create(long r6) {
            org.lwjgl.vulkan.VkImageCopy r0 = new org.lwjgl.vulkan.VkImageCopy
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageCopy createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageCopy r0 = new org.lwjgl.vulkan.VkImageCopy
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCopy.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkImageCopy$Buffer r0 = new org.lwjgl.vulkan.VkImageCopy$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageCopy.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCopy.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkImageCopy$Buffer r0 = new org.lwjgl.vulkan.VkImageCopy$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkImageCopy.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCopy.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkImageCopy.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkImageCopy$Buffer r0 = new org.lwjgl.vulkan.VkImageCopy$Buffer
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

    public static org.lwjgl.vulkan.VkImageCopy.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkImageCopy$Buffer r0 = new org.lwjgl.vulkan.VkImageCopy$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageCopy.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageCopy$Buffer r0 = new org.lwjgl.vulkan.VkImageCopy$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCopy mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageCopy r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCopy callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageCopy r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCopy mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkImageCopy r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCopy callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkImageCopy r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCopy.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageCopy$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCopy.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageCopy$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCopy.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageCopy$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCopy.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageCopy$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCopy malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkImageCopy r0 = new org.lwjgl.vulkan.VkImageCopy
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageCopy.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkImageCopy.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCopy calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkImageCopy r0 = new org.lwjgl.vulkan.VkImageCopy
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCopy.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkImageCopy.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCopy.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageCopy$Buffer r0 = new org.lwjgl.vulkan.VkImageCopy$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageCopy.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageCopy.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCopy.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageCopy$Buffer r0 = new org.lwjgl.vulkan.VkImageCopy$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageCopy.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageCopy.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceLayers nsrcSubresource(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageCopy.SRCSUBRESOURCE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkImageSubresourceLayers r0 = org.lwjgl.vulkan.VkImageSubresourceLayers.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkOffset3D nsrcOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageCopy.SRCOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkOffset3D r0 = org.lwjgl.vulkan.VkOffset3D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceLayers ndstSubresource(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageCopy.DSTSUBRESOURCE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkImageSubresourceLayers r0 = org.lwjgl.vulkan.VkImageSubresourceLayers.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkOffset3D ndstOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageCopy.DSTOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkOffset3D r0 = org.lwjgl.vulkan.VkOffset3D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent3D nextent(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageCopy.EXTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent3D r0 = org.lwjgl.vulkan.VkExtent3D.create(r0)
            return r0
    }

    public static void nsrcSubresource(long r7, org.lwjgl.vulkan.VkImageSubresourceLayers r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkImageCopy.SRCSUBRESOURCE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nsrcOffset(long r7, org.lwjgl.vulkan.VkOffset3D r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkImageCopy.SRCOFFSET
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ndstSubresource(long r7, org.lwjgl.vulkan.VkImageSubresourceLayers r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkImageCopy.DSTSUBRESOURCE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ndstOffset(long r7, org.lwjgl.vulkan.VkOffset3D r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkImageCopy.DSTOFFSET
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nextent(long r7, org.lwjgl.vulkan.VkExtent3D r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkImageCopy.EXTENT
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
            org.lwjgl.vulkan.VkImageCopy r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF
            int r4 = org.lwjgl.vulkan.VkImageSubresourceLayers.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkOffset3D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF
            int r4 = org.lwjgl.vulkan.VkImageSubresourceLayers.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkOffset3D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.vulkan.VkExtent3D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent3D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkImageCopy.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkImageCopy.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCopy.SRCSUBRESOURCE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCopy.SRCOFFSET = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCopy.DSTSUBRESOURCE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCopy.DSTOFFSET = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCopy.EXTENT = r0
            return
    }
}
