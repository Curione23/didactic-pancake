package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageBlit.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageBlit.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageBlit.class */
public class VkImageBlit extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkImageBlit> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int SRCSUBRESOURCE = 0;
    public static final int SRCOFFSETS = 0;
    public static final int DSTSUBRESOURCE = 0;
    public static final int DSTOFFSETS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageBlit$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageBlit$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageBlit$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkImageBlit, org.lwjgl.vulkan.VkImageBlit.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkImageBlit ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkImageBlit.SIZEOF
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
        protected org.lwjgl.vulkan.VkImageBlit.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkImageBlit getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkImageBlit r0 = org.lwjgl.vulkan.VkImageBlit.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.VkImageSubresourceLayers srcSubresource() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkImageSubresourceLayers r0 = org.lwjgl.vulkan.VkImageBlit.nsrcSubresource(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkOffset3D[2]")
        public org.lwjgl.vulkan.VkOffset3D.Buffer srcOffsets() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkOffset3D$Buffer r0 = org.lwjgl.vulkan.VkImageBlit.nsrcOffsets(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkOffset3D srcOffsets(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkOffset3D r0 = org.lwjgl.vulkan.VkImageBlit.nsrcOffsets(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageSubresourceLayers dstSubresource() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkImageSubresourceLayers r0 = org.lwjgl.vulkan.VkImageBlit.ndstSubresource(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkOffset3D[2]")
        public org.lwjgl.vulkan.VkOffset3D.Buffer dstOffsets() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkOffset3D$Buffer r0 = org.lwjgl.vulkan.VkImageBlit.ndstOffsets(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkOffset3D dstOffsets(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkOffset3D r0 = org.lwjgl.vulkan.VkImageBlit.ndstOffsets(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageBlit.Buffer srcSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageBlit.nsrcSubresource(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageBlit.Buffer srcSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.srcSubresource()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkImageBlit.Buffer srcOffsets(@org.lwjgl.system.NativeType("VkOffset3D[2]") org.lwjgl.vulkan.VkOffset3D.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageBlit.nsrcOffsets(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageBlit.Buffer srcOffsets(int r6, org.lwjgl.vulkan.VkOffset3D r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.VkImageBlit.nsrcOffsets(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkImageBlit.Buffer srcOffsets(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D.Buffer> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkOffset3D$Buffer r1 = r1.srcOffsets()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkImageBlit.Buffer srcOffsets(int r5, java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r6) {
                r4 = this;
                r0 = r6
                r1 = r4
                r2 = r5
                org.lwjgl.vulkan.VkOffset3D r1 = r1.srcOffsets(r2)
                r0.accept(r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageBlit.Buffer dstSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageBlit.ndstSubresource(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageBlit.Buffer dstSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.dstSubresource()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkImageBlit.Buffer dstOffsets(@org.lwjgl.system.NativeType("VkOffset3D[2]") org.lwjgl.vulkan.VkOffset3D.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageBlit.ndstOffsets(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageBlit.Buffer dstOffsets(int r6, org.lwjgl.vulkan.VkOffset3D r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.vulkan.VkImageBlit.ndstOffsets(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkImageBlit.Buffer dstOffsets(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D.Buffer> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkOffset3D$Buffer r1 = r1.dstOffsets()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkImageBlit.Buffer dstOffsets(int r5, java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r6) {
                r4 = this;
                r0 = r6
                r1 = r4
                r2 = r5
                org.lwjgl.vulkan.VkOffset3D r1 = r1.dstOffsets(r2)
                r0.accept(r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageBlit r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageBlit$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkImageBlit r0 = org.lwjgl.vulkan.VkImageBlit.create(r0)
                org.lwjgl.vulkan.VkImageBlit.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkImageBlit(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkImageBlit create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkImageBlit r0 = new org.lwjgl.vulkan.VkImageBlit
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkImageBlit(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageBlit.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkImageBlit.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceLayers srcSubresource() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkImageSubresourceLayers r0 = nsrcSubresource(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkOffset3D[2]")
    public org.lwjgl.vulkan.VkOffset3D.Buffer srcOffsets() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkOffset3D$Buffer r0 = nsrcOffsets(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkOffset3D srcOffsets(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.vulkan.VkOffset3D r0 = nsrcOffsets(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceLayers dstSubresource() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkImageSubresourceLayers r0 = ndstSubresource(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkOffset3D[2]")
    public org.lwjgl.vulkan.VkOffset3D.Buffer dstOffsets() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkOffset3D$Buffer r0 = ndstOffsets(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkOffset3D dstOffsets(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.vulkan.VkOffset3D r0 = ndstOffsets(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageBlit srcSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcSubresource(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageBlit srcSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.srcSubresource()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageBlit srcOffsets(@org.lwjgl.system.NativeType("VkOffset3D[2]") org.lwjgl.vulkan.VkOffset3D.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcOffsets(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageBlit srcOffsets(int r6, org.lwjgl.vulkan.VkOffset3D r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nsrcOffsets(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkImageBlit srcOffsets(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D.Buffer> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkOffset3D$Buffer r1 = r1.srcOffsets()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageBlit srcOffsets(int r5, java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r6) {
            r4 = this;
            r0 = r6
            r1 = r4
            r2 = r5
            org.lwjgl.vulkan.VkOffset3D r1 = r1.srcOffsets(r2)
            r0.accept(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageBlit dstSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstSubresource(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageBlit dstSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.dstSubresource()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageBlit dstOffsets(@org.lwjgl.system.NativeType("VkOffset3D[2]") org.lwjgl.vulkan.VkOffset3D.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstOffsets(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageBlit dstOffsets(int r6, org.lwjgl.vulkan.VkOffset3D r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            ndstOffsets(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkImageBlit dstOffsets(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D.Buffer> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkOffset3D$Buffer r1 = r1.dstOffsets()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageBlit dstOffsets(int r5, java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r6) {
            r4 = this;
            r0 = r6
            r1 = r4
            r2 = r5
            org.lwjgl.vulkan.VkOffset3D r1 = r1.dstOffsets(r2)
            r0.accept(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageBlit set(org.lwjgl.vulkan.VkImageSubresourceLayers r4, org.lwjgl.vulkan.VkOffset3D.Buffer r5, org.lwjgl.vulkan.VkImageSubresourceLayers r6, org.lwjgl.vulkan.VkOffset3D.Buffer r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageBlit r0 = r0.srcSubresource(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkImageBlit r0 = r0.srcOffsets(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.VkImageBlit r0 = r0.dstSubresource(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.VkImageBlit r0 = r0.dstOffsets(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageBlit set(org.lwjgl.vulkan.VkImageBlit r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkImageBlit.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkImageBlit malloc() {
            org.lwjgl.vulkan.VkImageBlit r0 = new org.lwjgl.vulkan.VkImageBlit
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkImageBlit.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageBlit calloc() {
            org.lwjgl.vulkan.VkImageBlit r0 = new org.lwjgl.vulkan.VkImageBlit
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkImageBlit.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageBlit create() {
            int r0 = org.lwjgl.vulkan.VkImageBlit.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkImageBlit r0 = new org.lwjgl.vulkan.VkImageBlit
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageBlit create(long r6) {
            org.lwjgl.vulkan.VkImageBlit r0 = new org.lwjgl.vulkan.VkImageBlit
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageBlit createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageBlit r0 = new org.lwjgl.vulkan.VkImageBlit
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkImageBlit.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkImageBlit$Buffer r0 = new org.lwjgl.vulkan.VkImageBlit$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageBlit.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageBlit.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkImageBlit$Buffer r0 = new org.lwjgl.vulkan.VkImageBlit$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkImageBlit.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageBlit.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkImageBlit.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkImageBlit$Buffer r0 = new org.lwjgl.vulkan.VkImageBlit$Buffer
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

    public static org.lwjgl.vulkan.VkImageBlit.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkImageBlit$Buffer r0 = new org.lwjgl.vulkan.VkImageBlit$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageBlit.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageBlit$Buffer r0 = new org.lwjgl.vulkan.VkImageBlit$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageBlit mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageBlit r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageBlit callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageBlit r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageBlit mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkImageBlit r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageBlit callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkImageBlit r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageBlit.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageBlit$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageBlit.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageBlit$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageBlit.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageBlit$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageBlit.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageBlit$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageBlit malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkImageBlit r0 = new org.lwjgl.vulkan.VkImageBlit
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageBlit.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkImageBlit.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageBlit calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkImageBlit r0 = new org.lwjgl.vulkan.VkImageBlit
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageBlit.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkImageBlit.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageBlit.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageBlit$Buffer r0 = new org.lwjgl.vulkan.VkImageBlit$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageBlit.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageBlit.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageBlit.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageBlit$Buffer r0 = new org.lwjgl.vulkan.VkImageBlit$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageBlit.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageBlit.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceLayers nsrcSubresource(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageBlit.SRCSUBRESOURCE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkImageSubresourceLayers r0 = org.lwjgl.vulkan.VkImageSubresourceLayers.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkOffset3D.Buffer nsrcOffsets(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageBlit.SRCOFFSETS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            org.lwjgl.vulkan.VkOffset3D$Buffer r0 = org.lwjgl.vulkan.VkOffset3D.create(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkOffset3D nsrcOffsets(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.VkImageBlit.SRCOFFSETS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 2
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkOffset3D r0 = org.lwjgl.vulkan.VkOffset3D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceLayers ndstSubresource(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageBlit.DSTSUBRESOURCE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkImageSubresourceLayers r0 = org.lwjgl.vulkan.VkImageSubresourceLayers.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkOffset3D.Buffer ndstOffsets(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageBlit.DSTOFFSETS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            org.lwjgl.vulkan.VkOffset3D$Buffer r0 = org.lwjgl.vulkan.VkOffset3D.create(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkOffset3D ndstOffsets(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.VkImageBlit.DSTOFFSETS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 2
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkOffset3D r0 = org.lwjgl.vulkan.VkOffset3D.create(r0)
            return r0
    }

    public static void nsrcSubresource(long r7, org.lwjgl.vulkan.VkImageSubresourceLayers r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkImageBlit.SRCSUBRESOURCE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nsrcOffsets(long r7, org.lwjgl.vulkan.VkOffset3D.Buffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkImageBlit.SRCOFFSETS
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            int r3 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nsrcOffsets(long r9, int r11, org.lwjgl.vulkan.VkOffset3D r12) {
            r0 = r12
            long r0 = r0.address()
            r1 = r9
            int r2 = org.lwjgl.vulkan.VkImageBlit.SRCOFFSETS
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r11
            r3 = 2
            long r2 = org.lwjgl.system.Checks.check(r2, r3)
            int r3 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
            long r3 = (long) r3
            long r2 = r2 * r3
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
            int r2 = org.lwjgl.vulkan.VkImageBlit.DSTSUBRESOURCE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ndstOffsets(long r7, org.lwjgl.vulkan.VkOffset3D.Buffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkImageBlit.DSTOFFSETS
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            int r3 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ndstOffsets(long r9, int r11, org.lwjgl.vulkan.VkOffset3D r12) {
            r0 = r12
            long r0 = r0.address()
            r1 = r9
            int r2 = org.lwjgl.vulkan.VkImageBlit.DSTOFFSETS
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r11
            r3 = 2
            long r2 = org.lwjgl.system.Checks.check(r2, r3)
            int r3 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
            long r3 = (long) r3
            long r2 = r2 * r3
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
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
            org.lwjgl.vulkan.VkImageBlit r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
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
            r5 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4, r5)
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
            r5 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4, r5)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r7 = r0
            r0 = r7
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkImageBlit.SIZEOF = r0
            r0 = r7
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkImageBlit.ALIGNOF = r0
            r0 = r7
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageBlit.SRCSUBRESOURCE = r0
            r0 = r7
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageBlit.SRCOFFSETS = r0
            r0 = r7
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageBlit.DSTSUBRESOURCE = r0
            r0 = r7
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageBlit.DSTOFFSETS = r0
            return
    }
}
