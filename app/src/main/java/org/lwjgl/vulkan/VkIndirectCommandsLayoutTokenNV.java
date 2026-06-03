package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutTokenNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutTokenNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutTokenNV.class */
public class VkIndirectCommandsLayoutTokenNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int TOKENTYPE = 0;
    public static final int STREAM = 0;
    public static final int OFFSET = 0;
    public static final int VERTEXBINDINGUNIT = 0;
    public static final int VERTEXDYNAMICSTRIDE = 0;
    public static final int PUSHCONSTANTPIPELINELAYOUT = 0;
    public static final int PUSHCONSTANTSHADERSTAGEFLAGS = 0;
    public static final int PUSHCONSTANTOFFSET = 0;
    public static final int PUSHCONSTANTSIZE = 0;
    public static final int INDIRECTSTATEFLAGS = 0;
    public static final int INDEXTYPECOUNT = 0;
    public static final int PINDEXTYPES = 0;
    public static final int PINDEXTYPEVALUES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutTokenNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutTokenNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutTokenNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV, org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkIndirectCommandsTokenTypeNV")
        public int tokenType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.ntokenType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int stream$() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.nstream$(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.noffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int vertexBindingUnit() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.nvertexBindingUnit(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean vertexDynamicStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.nvertexDynamicStride(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineLayout")
        public long pushconstantPipelineLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.npushconstantPipelineLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderStageFlags")
        public int pushconstantShaderStageFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.npushconstantShaderStageFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int pushconstantOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.npushconstantOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int pushconstantSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.npushconstantSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkIndirectStateFlagsNV")
        public int indirectStateFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.nindirectStateFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int indexTypeCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.nindexTypeCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkIndexType const *")
        public java.nio.IntBuffer pIndexTypes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.npIndexTypes(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("uint32_t const *")
        public java.nio.IntBuffer pIndexTypeValues() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.npIndexTypeValues(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000277003(0x3b9f040b, float:0.004852777)
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer tokenType(@org.lwjgl.system.NativeType("VkIndirectCommandsTokenTypeNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.ntokenType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer stream$(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.nstream$(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.noffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer vertexBindingUnit(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.nvertexBindingUnit(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer vertexDynamicStride(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.nvertexDynamicStride(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer pushconstantPipelineLayout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.npushconstantPipelineLayout(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer pushconstantShaderStageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.npushconstantShaderStageFlags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer pushconstantOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.npushconstantOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer pushconstantSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.npushconstantSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer indirectStateFlags(@org.lwjgl.system.NativeType("VkIndirectStateFlagsNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.nindirectStateFlags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer indexTypeCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.nindexTypeCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer pIndexTypes(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkIndexType const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.npIndexTypes(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer pIndexTypeValues(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.npIndexTypeValues(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.create(r0)
                org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkIndirectCommandsLayoutTokenNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = new org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkIndirectCommandsLayoutTokenNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.SIZEOF
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

    @org.lwjgl.system.NativeType("VkIndirectCommandsTokenTypeNV")
    public int tokenType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntokenType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int stream$() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstream$(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int vertexBindingUnit() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvertexBindingUnit(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean vertexDynamicStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvertexDynamicStride(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkPipelineLayout")
    public long pushconstantPipelineLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npushconstantPipelineLayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkShaderStageFlags")
    public int pushconstantShaderStageFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npushconstantShaderStageFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int pushconstantOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npushconstantOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int pushconstantSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npushconstantSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkIndirectStateFlagsNV")
    public int indirectStateFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nindirectStateFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int indexTypeCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nindexTypeCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkIndexType const *")
    public java.nio.IntBuffer pIndexTypes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npIndexTypes(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("uint32_t const *")
    public java.nio.IntBuffer pIndexTypeValues() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npIndexTypeValues(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000277003(0x3b9f040b, float:0.004852777)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV tokenType(@org.lwjgl.system.NativeType("VkIndirectCommandsTokenTypeNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntokenType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV stream$(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstream$(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV vertexBindingUnit(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertexBindingUnit(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV vertexDynamicStride(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nvertexDynamicStride(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV pushconstantPipelineLayout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npushconstantPipelineLayout(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV pushconstantShaderStageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npushconstantShaderStageFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV pushconstantOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npushconstantOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV pushconstantSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npushconstantSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV indirectStateFlags(@org.lwjgl.system.NativeType("VkIndirectStateFlagsNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindirectStateFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV indexTypeCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexTypeCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV pIndexTypes(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkIndexType const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npIndexTypes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV pIndexTypeValues(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npIndexTypeValues(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV set(int r5, long r6, int r8, int r9, int r10, int r11, boolean r12, long r13, int r15, int r16, int r17, int r18, int r19, @javax.annotation.Nullable java.nio.IntBuffer r20, @javax.annotation.Nullable java.nio.IntBuffer r21) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.tokenType(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.stream$(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.offset(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.vertexBindingUnit(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.vertexDynamicStride(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.pushconstantPipelineLayout(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.pushconstantShaderStageFlags(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.pushconstantOffset(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.pushconstantSize(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.indirectStateFlags(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.indexTypeCount(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.pIndexTypes(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.pIndexTypeValues(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV set(org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV malloc() {
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = new org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV calloc() {
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = new org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV create() {
            int r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = new org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV create(long r6) {
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = new org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = new org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer r0 = new org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer r0 = new org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer r0 = new org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer
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

    public static org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer r0 = new org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer r0 = new org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = new org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = new org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer r0 = new org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer r0 = new org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int ntokenType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.TOKENTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstream$(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.STREAM
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int noffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nvertexBindingUnit(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.VERTEXBINDINGUNIT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nvertexDynamicStride(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.VERTEXDYNAMICSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npushconstantPipelineLayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTPIPELINELAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int npushconstantShaderStageFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTSHADERSTAGEFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npushconstantOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npushconstantSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nindirectStateFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.INDIRECTSTATEFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nindexTypeCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.INDEXTYPECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer npIndexTypes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PINDEXTYPES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nindexTypeCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer npIndexTypeValues(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PINDEXTYPEVALUES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nindexTypeCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ntokenType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.TOKENTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstream$(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.STREAM
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void noffset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nvertexBindingUnit(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.VERTEXBINDINGUNIT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nvertexDynamicStride(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.VERTEXDYNAMICSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npushconstantPipelineLayout(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTPIPELINELAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void npushconstantShaderStageFlags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTSHADERSTAGEFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npushconstantOffset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npushconstantSize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nindirectStateFlags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.INDIRECTSTATEFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nindexTypeCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.INDEXTYPECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npIndexTypes(long r5, @javax.annotation.Nullable java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PINDEXTYPES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npIndexTypeValues(long r5, @javax.annotation.Nullable java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PINDEXTYPEVALUES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r0 = nindexTypeCount(r0)
            if (r0 == 0) goto L21
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PINDEXTYPES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PINDEXTYPEVALUES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L21:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 15
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.POINTER_SIZE
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
            r3 = 8
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
            r1 = r0
            r2 = 13
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            int r3 = org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.TOKENTYPE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.STREAM = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.OFFSET = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.VERTEXBINDINGUNIT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.VERTEXDYNAMICSTRIDE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTPIPELINELAYOUT = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTSHADERSTAGEFLAGS = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTOFFSET = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PUSHCONSTANTSIZE = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.INDIRECTSTATEFLAGS = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.INDEXTYPECOUNT = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PINDEXTYPES = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkIndirectCommandsLayoutTokenNV.PINDEXTYPEVALUES = r0
            return
    }
}
