package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDependency.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDependency.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDependency.class */
public class VkSubpassDependency extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkSubpassDependency> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int SRCSUBPASS = 0;
    public static final int DSTSUBPASS = 0;
    public static final int SRCSTAGEMASK = 0;
    public static final int DSTSTAGEMASK = 0;
    public static final int SRCACCESSMASK = 0;
    public static final int DSTACCESSMASK = 0;
    public static final int DEPENDENCYFLAGS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDependency$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDependency$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDependency$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkSubpassDependency, org.lwjgl.vulkan.VkSubpassDependency.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkSubpassDependency ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkSubpassDependency.SIZEOF
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
        protected org.lwjgl.vulkan.VkSubpassDependency.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkSubpassDependency getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkSubpassDependency r0 = org.lwjgl.vulkan.VkSubpassDependency.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int srcSubpass() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSubpassDependency.nsrcSubpass(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int dstSubpass() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSubpassDependency.ndstSubpass(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineStageFlags")
        public int srcStageMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSubpassDependency.nsrcStageMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineStageFlags")
        public int dstStageMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSubpassDependency.ndstStageMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAccessFlags")
        public int srcAccessMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSubpassDependency.nsrcAccessMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAccessFlags")
        public int dstAccessMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSubpassDependency.ndstAccessMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDependencyFlags")
        public int dependencyFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSubpassDependency.ndependencyFlags(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkSubpassDependency.Buffer srcSubpass(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDependency.nsrcSubpass(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSubpassDependency.Buffer dstSubpass(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDependency.ndstSubpass(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSubpassDependency.Buffer srcStageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDependency.nsrcStageMask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSubpassDependency.Buffer dstStageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDependency.ndstStageMask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSubpassDependency.Buffer srcAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDependency.nsrcAccessMask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSubpassDependency.Buffer dstAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDependency.ndstAccessMask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSubpassDependency.Buffer dependencyFlags(@org.lwjgl.system.NativeType("VkDependencyFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDependency.ndependencyFlags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSubpassDependency r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSubpassDependency$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkSubpassDependency r0 = org.lwjgl.vulkan.VkSubpassDependency.create(r0)
                org.lwjgl.vulkan.VkSubpassDependency.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkSubpassDependency(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkSubpassDependency create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkSubpassDependency r0 = new org.lwjgl.vulkan.VkSubpassDependency
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkSubpassDependency(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkSubpassDependency.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int srcSubpass() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsrcSubpass(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int dstSubpass() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndstSubpass(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkPipelineStageFlags")
    public int srcStageMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsrcStageMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkPipelineStageFlags")
    public int dstStageMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndstStageMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkAccessFlags")
    public int srcAccessMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsrcAccessMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkAccessFlags")
    public int dstAccessMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndstAccessMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDependencyFlags")
    public int dependencyFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndependencyFlags(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDependency srcSubpass(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcSubpass(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDependency dstSubpass(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstSubpass(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDependency srcStageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcStageMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDependency dstStageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstStageMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDependency srcAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcAccessMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDependency dstAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstAccessMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDependency dependencyFlags(@org.lwjgl.system.NativeType("VkDependencyFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndependencyFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDependency set(int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubpassDependency r0 = r0.srcSubpass(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkSubpassDependency r0 = r0.dstSubpass(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.VkSubpassDependency r0 = r0.srcStageMask(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.VkSubpassDependency r0 = r0.dstStageMask(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.VkSubpassDependency r0 = r0.srcAccessMask(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.VkSubpassDependency r0 = r0.dstAccessMask(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.VkSubpassDependency r0 = r0.dependencyFlags(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDependency set(org.lwjgl.vulkan.VkSubpassDependency r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkSubpassDependency.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDependency malloc() {
            org.lwjgl.vulkan.VkSubpassDependency r0 = new org.lwjgl.vulkan.VkSubpassDependency
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkSubpassDependency.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDependency calloc() {
            org.lwjgl.vulkan.VkSubpassDependency r0 = new org.lwjgl.vulkan.VkSubpassDependency
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDependency create() {
            int r0 = org.lwjgl.vulkan.VkSubpassDependency.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkSubpassDependency r0 = new org.lwjgl.vulkan.VkSubpassDependency
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDependency create(long r6) {
            org.lwjgl.vulkan.VkSubpassDependency r0 = new org.lwjgl.vulkan.VkSubpassDependency
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSubpassDependency createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSubpassDependency r0 = new org.lwjgl.vulkan.VkSubpassDependency
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDependency.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkSubpassDependency$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDependency$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDependency.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkSubpassDependency$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDependency$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDependency.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkSubpassDependency.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkSubpassDependency$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDependency$Buffer
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

    public static org.lwjgl.vulkan.VkSubpassDependency.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkSubpassDependency$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDependency$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSubpassDependency.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSubpassDependency$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDependency$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDependency mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSubpassDependency r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDependency callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSubpassDependency r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDependency mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkSubpassDependency r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDependency callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkSubpassDependency r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDependency.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSubpassDependency$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDependency.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSubpassDependency$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDependency.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubpassDependency$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDependency.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubpassDependency$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDependency malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkSubpassDependency r0 = new org.lwjgl.vulkan.VkSubpassDependency
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkSubpassDependency.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDependency calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkSubpassDependency r0 = new org.lwjgl.vulkan.VkSubpassDependency
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkSubpassDependency.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDependency.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSubpassDependency$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDependency$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSubpassDependency.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDependency.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSubpassDependency$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDependency$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSubpassDependency.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsrcSubpass(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDependency.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.SRCSUBPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndstSubpass(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDependency.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.DSTSUBPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsrcStageMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDependency.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.SRCSTAGEMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndstStageMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDependency.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.DSTSTAGEMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsrcAccessMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDependency.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.SRCACCESSMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndstAccessMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDependency.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.DSTACCESSMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndependencyFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDependency.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.DEPENDENCYFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsrcSubpass(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDependency.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.SRCSUBPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndstSubpass(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDependency.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.DSTSUBPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsrcStageMask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDependency.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.SRCSTAGEMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndstStageMask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDependency.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.DSTSTAGEMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsrcAccessMask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDependency.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.SRCACCESSMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndstAccessMask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDependency.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.DSTACCESSMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndependencyFlags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSubpassDependency.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDependency.DEPENDENCYFLAGS
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
            org.lwjgl.vulkan.VkSubpassDependency r0 = r0.create(r1, r2)
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
            org.lwjgl.vulkan.VkSubpassDependency.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkSubpassDependency.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubpassDependency.SRCSUBPASS = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubpassDependency.DSTSUBPASS = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubpassDependency.SRCSTAGEMASK = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubpassDependency.DSTSTAGEMASK = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubpassDependency.SRCACCESSMASK = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubpassDependency.DSTACCESSMASK = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSubpassDependency.DEPENDENCYFLAGS = r0
            return
    }
}
