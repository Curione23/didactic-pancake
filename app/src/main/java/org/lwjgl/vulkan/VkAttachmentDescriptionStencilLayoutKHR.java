package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentDescriptionStencilLayoutKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentDescriptionStencilLayoutKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentDescriptionStencilLayoutKHR.class */
public class VkAttachmentDescriptionStencilLayoutKHR extends org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentDescriptionStencilLayoutKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentDescriptionStencilLayoutKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAttachmentDescriptionStencilLayoutKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer {
        private static final org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
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

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer
        public org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer
        public org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000241002(0x3b9e776a, float:0.0048360126)
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer
        public org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer
        public org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.Buffer stencilInitialLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.nstencilInitialLayout(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer
        public org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.Buffer stencilFinalLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.nstencilFinalLayout(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer stencilFinalLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer r0 = r0.stencilFinalLayout(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer stencilInitialLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer r0 = r0.stencilInitialLayout(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.create(r0)
                org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAttachmentDescriptionStencilLayoutKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = new org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAttachmentDescriptionStencilLayoutKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000241002(0x3b9e776a, float:0.0048360126)
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR stencilInitialLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstencilInitialLayout(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR stencilFinalLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstencilFinalLayout(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR set(int r5, long r6, int r8, int r9) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = r0.stencilInitialLayout(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = r0.stencilFinalLayout(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR set(org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR malloc() {
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = new org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR calloc() {
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = new org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR create() {
            int r0 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = new org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR create(long r6) {
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = new org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = new org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer
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

    public static org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = new org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = new org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer r0 = new org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout set(int r8, long r9, int r11, int r12) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            r4 = r12
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = r0.set(r1, r2, r3, r4)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout stencilFinalLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = r0.stencilFinalLayout(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout stencilInitialLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = r0.stencilInitialLayout(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout pNext(@org.lwjgl.system.NativeType("void *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayout, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkAttachmentDescriptionStencilLayoutKHR r0 = r0.create(r1, r2)
            return r0
    }
}
