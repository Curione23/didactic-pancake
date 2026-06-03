package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDescriptionDepthStencilResolve.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDescriptionDepthStencilResolve.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDescriptionDepthStencilResolve.class */
public class VkSubpassDescriptionDepthStencilResolve extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int DEPTHRESOLVEMODE = 0;
    public static final int STENCILRESOLVEMODE = 0;
    public static final int PDEPTHSTENCILRESOLVEATTACHMENT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDescriptionDepthStencilResolve$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDescriptionDepthStencilResolve$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDescriptionDepthStencilResolve$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve, org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF
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
        protected org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkResolveModeFlagBits")
        public int depthResolveMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.ndepthResolveMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkResolveModeFlagBits")
        public int stencilResolveMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.nstencilResolveMode(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkAttachmentReference2 const *")
        public org.lwjgl.vulkan.VkAttachmentReference2 pDepthStencilResolveAttachment() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkAttachmentReference2 r0 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.npDepthStencilResolveAttachment(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000199001(0x3b9dd359, float:0.0048164544)
                org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer depthResolveMode(@org.lwjgl.system.NativeType("VkResolveModeFlagBits") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.ndepthResolveMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer stencilResolveMode(@org.lwjgl.system.NativeType("VkResolveModeFlagBits") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.nstencilResolveMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer pDepthStencilResolveAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2 r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.npDepthStencilResolveAttachment(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.create(r0)
                org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkSubpassDescriptionDepthStencilResolve(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = new org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkSubpassDescriptionDepthStencilResolve(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF
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

    @org.lwjgl.system.NativeType("VkResolveModeFlagBits")
    public int depthResolveMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndepthResolveMode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkResolveModeFlagBits")
    public int stencilResolveMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstencilResolveMode(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkAttachmentReference2 const *")
    public org.lwjgl.vulkan.VkAttachmentReference2 pDepthStencilResolveAttachment() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkAttachmentReference2 r0 = npDepthStencilResolveAttachment(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000199001(0x3b9dd359, float:0.0048164544)
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve depthResolveMode(@org.lwjgl.system.NativeType("VkResolveModeFlagBits") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndepthResolveMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve stencilResolveMode(@org.lwjgl.system.NativeType("VkResolveModeFlagBits") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstencilResolveMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve pDepthStencilResolveAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2 r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDepthStencilResolveAttachment(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve set(int r5, long r6, int r8, int r9, @javax.annotation.Nullable org.lwjgl.vulkan.VkAttachmentReference2 r10) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = r0.depthResolveMode(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = r0.stencilResolveMode(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = r0.pDepthStencilResolveAttachment(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve set(org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve malloc() {
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = new org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve calloc() {
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = new org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve create() {
            int r0 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = new org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve create(long r6) {
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = new org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = new org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer
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

    public static org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = new org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = new org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int ndepthResolveMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.DEPTHRESOLVEMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstencilResolveMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.STENCILRESOLVEMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAttachmentReference2 npDepthStencilResolveAttachment(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.PDEPTHSTENCILRESOLVEATTACHMENT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkAttachmentReference2 r0 = org.lwjgl.vulkan.VkAttachmentReference2.createSafe(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ndepthResolveMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.DEPTHRESOLVEMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstencilResolveMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.STENCILRESOLVEMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npDepthStencilResolveAttachment(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkAttachmentReference2 r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.PDEPTHSTENCILRESOLVEATTACHMENT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.DEPTHRESOLVEMODE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.STENCILRESOLVEMODE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubpassDescriptionDepthStencilResolve.PDEPTHSTENCILRESOLVEATTACHMENT = r0
            return
    }
}
