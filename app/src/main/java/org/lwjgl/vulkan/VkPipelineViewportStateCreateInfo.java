package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineViewportStateCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineViewportStateCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineViewportStateCreateInfo.class */
public class VkPipelineViewportStateCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int VIEWPORTCOUNT = 0;
    public static final int PVIEWPORTS = 0;
    public static final int SCISSORCOUNT = 0;
    public static final int PSCISSORS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineViewportStateCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineViewportStateCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineViewportStateCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo, org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineViewportStateCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int viewportCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.nviewportCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkViewport const *")
        public org.lwjgl.vulkan.VkViewport.Buffer pViewports() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkViewport$Buffer r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.npViewports(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int scissorCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.nscissorCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkRect2D const *")
        public org.lwjgl.vulkan.VkRect2D.Buffer pScissors() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkRect2D$Buffer r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.npScissors(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 22
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineViewportCoarseSampleOrderStateCreateInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineViewportCoarseSampleOrderStateCreateInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineViewportDepthClipControlCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineViewportDepthClipControlCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineViewportExclusiveScissorStateCreateInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineViewportExclusiveScissorStateCreateInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineViewportShadingRateImageStateCreateInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineViewportShadingRateImageStateCreateInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineViewportSwizzleStateCreateInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineViewportSwizzleStateCreateInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineViewportWScalingStateCreateInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineViewportWScalingStateCreateInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VkPipelineViewportStateCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer viewportCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.nviewportCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer pViewports(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkViewport const *") org.lwjgl.vulkan.VkViewport.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.npViewports(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer scissorCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.nscissorCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer pScissors(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRect2D const *") org.lwjgl.vulkan.VkRect2D.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.npScissors(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.create(r0)
                org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPipelineViewportStateCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPipelineViewportStateCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkPipelineViewportStateCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int viewportCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nviewportCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkViewport const *")
    public org.lwjgl.vulkan.VkViewport.Buffer pViewports() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkViewport$Buffer r0 = npViewports(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int scissorCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nscissorCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkRect2D const *")
    public org.lwjgl.vulkan.VkRect2D.Buffer pScissors() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkRect2D$Buffer r0 = npScissors(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 22
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo pNext(org.lwjgl.vulkan.VkPipelineViewportCoarseSampleOrderStateCreateInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineViewportCoarseSampleOrderStateCreateInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo pNext(org.lwjgl.vulkan.VkPipelineViewportDepthClipControlCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineViewportDepthClipControlCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo pNext(org.lwjgl.vulkan.VkPipelineViewportExclusiveScissorStateCreateInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineViewportExclusiveScissorStateCreateInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo pNext(org.lwjgl.vulkan.VkPipelineViewportShadingRateImageStateCreateInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineViewportShadingRateImageStateCreateInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo pNext(org.lwjgl.vulkan.VkPipelineViewportSwizzleStateCreateInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineViewportSwizzleStateCreateInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo pNext(org.lwjgl.vulkan.VkPipelineViewportWScalingStateCreateInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineViewportWScalingStateCreateInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo flags(@org.lwjgl.system.NativeType("VkPipelineViewportStateCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo viewportCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nviewportCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo pViewports(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkViewport const *") org.lwjgl.vulkan.VkViewport.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npViewports(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo scissorCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nscissorCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo pScissors(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRect2D const *") org.lwjgl.vulkan.VkRect2D.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npScissors(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo set(int r5, long r6, int r8, int r9, @javax.annotation.Nullable org.lwjgl.vulkan.VkViewport.Buffer r10, int r11, @javax.annotation.Nullable org.lwjgl.vulkan.VkRect2D.Buffer r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.viewportCount(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.pViewports(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.scissorCount(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.pScissors(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo set(org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo malloc() {
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo calloc() {
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer
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

    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nviewportCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.VIEWPORTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkViewport.Buffer npViewports(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.PVIEWPORTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nviewportCount(r1)
            org.lwjgl.vulkan.VkViewport$Buffer r0 = org.lwjgl.vulkan.VkViewport.createSafe(r0, r1)
            return r0
    }

    public static int nscissorCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SCISSORCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRect2D.Buffer npScissors(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.PSCISSORS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nscissorCount(r1)
            org.lwjgl.vulkan.VkRect2D$Buffer r0 = org.lwjgl.vulkan.VkRect2D.createSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nviewportCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.VIEWPORTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npViewports(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkViewport.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.PVIEWPORTS
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
            nviewportCount(r0, r1)
        L19:
            return
    }

    public static void nscissorCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SCISSORCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npScissors(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkRect2D.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.PSCISSORS
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
            nscissorCount(r0, r1)
        L19:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.VIEWPORTCOUNT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.PVIEWPORTS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.SCISSORCOUNT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineViewportStateCreateInfo.PSCISSORS = r0
            return
    }
}
