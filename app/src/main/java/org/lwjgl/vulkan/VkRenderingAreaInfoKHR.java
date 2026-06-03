package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAreaInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAreaInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAreaInfoKHR.class */
public class VkRenderingAreaInfoKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkRenderingAreaInfoKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int VIEWMASK = 0;
    public static final int COLORATTACHMENTCOUNT = 0;
    public static final int PCOLORATTACHMENTFORMATS = 0;
    public static final int DEPTHATTACHMENTFORMAT = 0;
    public static final int STENCILATTACHMENTFORMAT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAreaInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAreaInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAreaInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkRenderingAreaInfoKHR, org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkRenderingAreaInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkRenderingAreaInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int viewMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.nviewMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int colorAttachmentCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.ncolorAttachmentCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkFormat const *")
        public java.nio.IntBuffer pColorAttachmentFormats() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.npColorAttachmentFormats(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int depthAttachmentFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.ndepthAttachmentFormat(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int stencilAttachmentFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.nstencilAttachmentFormat(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAreaInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000470003(0x3ba1f5f3, float:0.0049426495)
                org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRenderingAreaInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer viewMask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAreaInfoKHR.nviewMask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer colorAttachmentCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAreaInfoKHR.ncolorAttachmentCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer pColorAttachmentFormats(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkFormat const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAreaInfoKHR.npColorAttachmentFormats(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer depthAttachmentFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAreaInfoKHR.ndepthAttachmentFormat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer stencilAttachmentFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAreaInfoKHR.nstencilAttachmentFormat(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.create(r0)
                org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkRenderingAreaInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkRenderingAreaInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAreaInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkRenderingAreaInfoKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int viewMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nviewMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int colorAttachmentCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncolorAttachmentCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkFormat const *")
    public java.nio.IntBuffer pColorAttachmentFormats() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npColorAttachmentFormats(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int depthAttachmentFormat() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndepthAttachmentFormat(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int stencilAttachmentFormat() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstencilAttachmentFormat(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAreaInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAreaInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000470003(0x3ba1f5f3, float:0.0049426495)
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAreaInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAreaInfoKHR viewMask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nviewMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAreaInfoKHR colorAttachmentCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncolorAttachmentCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAreaInfoKHR pColorAttachmentFormats(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkFormat const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npColorAttachmentFormats(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAreaInfoKHR depthAttachmentFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndepthAttachmentFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAreaInfoKHR stencilAttachmentFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstencilAttachmentFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAreaInfoKHR set(int r5, long r6, int r8, int r9, @javax.annotation.Nullable java.nio.IntBuffer r10, int r11, int r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = r0.viewMask(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = r0.colorAttachmentCount(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = r0.pColorAttachmentFormats(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = r0.depthAttachmentFormat(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = r0.stencilAttachmentFormat(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAreaInfoKHR set(org.lwjgl.vulkan.VkRenderingAreaInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAreaInfoKHR malloc() {
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAreaInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAreaInfoKHR calloc() {
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAreaInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAreaInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAreaInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAreaInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAreaInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderingAreaInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAreaInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAreaInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAreaInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAreaInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAreaInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAreaInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAreaInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nviewMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.VIEWMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ncolorAttachmentCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.COLORATTACHMENTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer npColorAttachmentFormats(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.PCOLORATTACHMENTFORMATS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ncolorAttachmentCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static int ndepthAttachmentFormat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.DEPTHATTACHMENTFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstencilAttachmentFormat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.STENCILATTACHMENTFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nviewMask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.VIEWMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncolorAttachmentCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.COLORATTACHMENTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npColorAttachmentFormats(long r5, @javax.annotation.Nullable java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.PCOLORATTACHMENTFORMATS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            if (r0 == 0) goto L19
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            ncolorAttachmentCount(r0, r1)
        L19:
            return
    }

    public static void ndepthAttachmentFormat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.DEPTHATTACHMENTFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstencilAttachmentFormat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.STENCILATTACHMENTFORMAT
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
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkRenderingAreaInfoKHR.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR.VIEWMASK = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR.COLORATTACHMENTCOUNT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR.PCOLORATTACHMENTFORMATS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR.DEPTHATTACHMENTFORMAT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingAreaInfoKHR.STENCILATTACHMENTFORMAT = r0
            return
    }
}
