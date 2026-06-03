package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateCreateInfo.class */
public class VkPipelineRasterizationStateCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int DEPTHCLAMPENABLE = 0;
    public static final int RASTERIZERDISCARDENABLE = 0;
    public static final int POLYGONMODE = 0;
    public static final int CULLMODE = 0;
    public static final int FRONTFACE = 0;
    public static final int DEPTHBIASENABLE = 0;
    public static final int DEPTHBIASCONSTANTFACTOR = 0;
    public static final int DEPTHBIASCLAMP = 0;
    public static final int DEPTHBIASSLOPEFACTOR = 0;
    public static final int LINEWIDTH = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineRasterizationStateCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo, org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineRasterizationStateCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean depthClampEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ndepthClampEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean rasterizerDiscardEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.nrasterizerDiscardEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkPolygonMode")
        public int polygonMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.npolygonMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkCullModeFlags")
        public int cullMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ncullMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFrontFace")
        public int frontFace() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.nfrontFace(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean depthBiasEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ndepthBiasEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public float depthBiasConstantFactor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ndepthBiasConstantFactor(r0)
                return r0
        }

        public float depthBiasClamp() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ndepthBiasClamp(r0)
                return r0
        }

        public float depthBiasSlopeFactor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ndepthBiasSlopeFactor(r0)
                return r0
        }

        public float lineWidth() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.nlineWidth(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 23
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkDepthBiasRepresentationInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDepthBiasRepresentationInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineRasterizationConservativeStateCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineRasterizationConservativeStateCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineRasterizationDepthClipStateCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineRasterizationDepthClipStateCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineRasterizationProvokingVertexStateCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineRasterizationProvokingVertexStateCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineRasterizationStateRasterizationOrderAMD r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineRasterizationStateRasterizationOrderAMD r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineRasterizationStateStreamCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineRasterizationStateStreamCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VkPipelineRasterizationStateCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer depthClampEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ndepthClampEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer rasterizerDiscardEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.nrasterizerDiscardEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer polygonMode(@org.lwjgl.system.NativeType("VkPolygonMode") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.npolygonMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer cullMode(@org.lwjgl.system.NativeType("VkCullModeFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ncullMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer frontFace(@org.lwjgl.system.NativeType("VkFrontFace") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.nfrontFace(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer depthBiasEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ndepthBiasEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer depthBiasConstantFactor(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ndepthBiasConstantFactor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer depthBiasClamp(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ndepthBiasClamp(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer depthBiasSlopeFactor(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ndepthBiasSlopeFactor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer lineWidth(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.nlineWidth(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.create(r0)
                org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPipelineRasterizationStateCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPipelineRasterizationStateCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkPipelineRasterizationStateCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean depthClampEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndepthClampEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean rasterizerDiscardEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrasterizerDiscardEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkPolygonMode")
    public int polygonMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npolygonMode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkCullModeFlags")
    public int cullMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncullMode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFrontFace")
    public int frontFace() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfrontFace(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean depthBiasEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndepthBiasEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public float depthBiasConstantFactor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = ndepthBiasConstantFactor(r0)
            return r0
    }

    public float depthBiasClamp() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = ndepthBiasClamp(r0)
            return r0
    }

    public float depthBiasSlopeFactor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = ndepthBiasSlopeFactor(r0)
            return r0
    }

    public float lineWidth() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = nlineWidth(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 23
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo pNext(org.lwjgl.vulkan.VkDepthBiasRepresentationInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDepthBiasRepresentationInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo pNext(org.lwjgl.vulkan.VkPipelineRasterizationConservativeStateCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineRasterizationConservativeStateCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo pNext(org.lwjgl.vulkan.VkPipelineRasterizationDepthClipStateCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineRasterizationDepthClipStateCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo pNext(org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo pNext(org.lwjgl.vulkan.VkPipelineRasterizationProvokingVertexStateCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineRasterizationProvokingVertexStateCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo pNext(org.lwjgl.vulkan.VkPipelineRasterizationStateRasterizationOrderAMD r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineRasterizationStateRasterizationOrderAMD r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo pNext(org.lwjgl.vulkan.VkPipelineRasterizationStateStreamCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineRasterizationStateStreamCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo flags(@org.lwjgl.system.NativeType("VkPipelineRasterizationStateCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo depthClampEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            ndepthClampEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo rasterizerDiscardEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nrasterizerDiscardEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo polygonMode(@org.lwjgl.system.NativeType("VkPolygonMode") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npolygonMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo cullMode(@org.lwjgl.system.NativeType("VkCullModeFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncullMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo frontFace(@org.lwjgl.system.NativeType("VkFrontFace") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfrontFace(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo depthBiasEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            ndepthBiasEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo depthBiasConstantFactor(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndepthBiasConstantFactor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo depthBiasClamp(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndepthBiasClamp(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo depthBiasSlopeFactor(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndepthBiasSlopeFactor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo lineWidth(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlineWidth(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo set(int r5, long r6, int r8, boolean r9, boolean r10, int r11, int r12, int r13, boolean r14, float r15, float r16, float r17, float r18) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.depthClampEnable(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.rasterizerDiscardEnable(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.polygonMode(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.cullMode(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.frontFace(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.depthBiasEnable(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.depthBiasConstantFactor(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.depthBiasClamp(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.depthBiasSlopeFactor(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.lineWidth(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo set(org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo malloc() {
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo calloc() {
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer
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

    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndepthClampEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHCLAMPENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nrasterizerDiscardEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.RASTERIZERDISCARDENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npolygonMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.POLYGONMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ncullMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.CULLMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfrontFace(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.FRONTFACE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndepthBiasEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static float ndepthBiasConstantFactor(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASCONSTANTFACTOR
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float ndepthBiasClamp(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASCLAMP
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float ndepthBiasSlopeFactor(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASSLOPEFACTOR
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static float nlineWidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.LINEWIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndepthClampEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHCLAMPENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nrasterizerDiscardEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.RASTERIZERDISCARDENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npolygonMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.POLYGONMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncullMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.CULLMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nfrontFace(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.FRONTFACE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndepthBiasEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndepthBiasConstantFactor(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASCONSTANTFACTOR
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void ndepthBiasClamp(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASCLAMP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void ndepthBiasSlopeFactor(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASSLOPEFACTOR
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nlineWidth(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.LINEWIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 13
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.POINTER_SIZE
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHCLAMPENABLE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.RASTERIZERDISCARDENABLE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.POLYGONMODE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.CULLMODE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.FRONTFACE = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASENABLE = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASCONSTANTFACTOR = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASCLAMP = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.DEPTHBIASSLOPEFACTOR = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo.LINEWIDTH = r0
            return
    }
}
