package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderPropertiesEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderPropertiesEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderPropertiesEXT.class */
public class VkPhysicalDeviceMeshShaderPropertiesEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int MAXTASKWORKGROUPTOTALCOUNT = 0;
    public static final int MAXTASKWORKGROUPCOUNT = 0;
    public static final int MAXTASKWORKGROUPINVOCATIONS = 0;
    public static final int MAXTASKWORKGROUPSIZE = 0;
    public static final int MAXTASKPAYLOADSIZE = 0;
    public static final int MAXTASKSHAREDMEMORYSIZE = 0;
    public static final int MAXTASKPAYLOADANDSHAREDMEMORYSIZE = 0;
    public static final int MAXMESHWORKGROUPTOTALCOUNT = 0;
    public static final int MAXMESHWORKGROUPCOUNT = 0;
    public static final int MAXMESHWORKGROUPINVOCATIONS = 0;
    public static final int MAXMESHWORKGROUPSIZE = 0;
    public static final int MAXMESHSHAREDMEMORYSIZE = 0;
    public static final int MAXMESHPAYLOADANDSHAREDMEMORYSIZE = 0;
    public static final int MAXMESHOUTPUTMEMORYSIZE = 0;
    public static final int MAXMESHPAYLOADANDOUTPUTMEMORYSIZE = 0;
    public static final int MAXMESHOUTPUTCOMPONENTS = 0;
    public static final int MAXMESHOUTPUTVERTICES = 0;
    public static final int MAXMESHOUTPUTPRIMITIVES = 0;
    public static final int MAXMESHOUTPUTLAYERS = 0;
    public static final int MAXMESHMULTIVIEWVIEWCOUNT = 0;
    public static final int MESHOUTPUTPERVERTEXGRANULARITY = 0;
    public static final int MESHOUTPUTPERPRIMITIVEGRANULARITY = 0;
    public static final int MAXPREFERREDTASKWORKGROUPINVOCATIONS = 0;
    public static final int MAXPREFERREDMESHWORKGROUPINVOCATIONS = 0;
    public static final int PREFERSLOCALINVOCATIONVERTEXOUTPUT = 0;
    public static final int PREFERSLOCALINVOCATIONPRIMITIVEOUTPUT = 0;
    public static final int PREFERSCOMPACTVERTEXOUTPUT = 0;
    public static final int PREFERSCOMPACTPRIMITIVEOUTPUT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT, org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxTaskWorkGroupTotalCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupTotalCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t[3]")
        public java.nio.IntBuffer maxTaskWorkGroupCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxTaskWorkGroupCount(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupCount(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxTaskWorkGroupInvocations() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupInvocations(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t[3]")
        public java.nio.IntBuffer maxTaskWorkGroupSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxTaskWorkGroupSize(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskWorkGroupSize(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxTaskPayloadSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskPayloadSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxTaskSharedMemorySize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskSharedMemorySize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxTaskPayloadAndSharedMemorySize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxTaskPayloadAndSharedMemorySize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxMeshWorkGroupTotalCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupTotalCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t[3]")
        public java.nio.IntBuffer maxMeshWorkGroupCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxMeshWorkGroupCount(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupCount(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxMeshWorkGroupInvocations() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupInvocations(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t[3]")
        public java.nio.IntBuffer maxMeshWorkGroupSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxMeshWorkGroupSize(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshWorkGroupSize(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxMeshSharedMemorySize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshSharedMemorySize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxMeshPayloadAndSharedMemorySize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshPayloadAndSharedMemorySize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxMeshOutputMemorySize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshOutputMemorySize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxMeshPayloadAndOutputMemorySize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshPayloadAndOutputMemorySize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxMeshOutputComponents() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshOutputComponents(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxMeshOutputVertices() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshOutputVertices(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxMeshOutputPrimitives() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshOutputPrimitives(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxMeshOutputLayers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshOutputLayers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxMeshMultiviewViewCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxMeshMultiviewViewCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int meshOutputPerVertexGranularity() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmeshOutputPerVertexGranularity(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int meshOutputPerPrimitiveGranularity() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmeshOutputPerPrimitiveGranularity(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPreferredTaskWorkGroupInvocations() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxPreferredTaskWorkGroupInvocations(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPreferredMeshWorkGroupInvocations() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nmaxPreferredMeshWorkGroupInvocations(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean prefersLocalInvocationVertexOutput() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nprefersLocalInvocationVertexOutput(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean prefersLocalInvocationPrimitiveOutput() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nprefersLocalInvocationPrimitiveOutput(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean prefersCompactVertexOutput() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nprefersCompactVertexOutput(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean prefersCompactPrimitiveOutput() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nprefersCompactPrimitiveOutput(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000328001(0x3b9fcb41, float:0.0048765247)
                org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceMeshShaderPropertiesEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceMeshShaderPropertiesEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("void *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxTaskWorkGroupTotalCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxTaskWorkGroupTotalCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t[3]")
    public java.nio.IntBuffer maxTaskWorkGroupCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nmaxTaskWorkGroupCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxTaskWorkGroupCount(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nmaxTaskWorkGroupCount(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxTaskWorkGroupInvocations() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxTaskWorkGroupInvocations(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t[3]")
    public java.nio.IntBuffer maxTaskWorkGroupSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nmaxTaskWorkGroupSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxTaskWorkGroupSize(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nmaxTaskWorkGroupSize(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxTaskPayloadSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxTaskPayloadSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxTaskSharedMemorySize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxTaskSharedMemorySize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxTaskPayloadAndSharedMemorySize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxTaskPayloadAndSharedMemorySize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxMeshWorkGroupTotalCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxMeshWorkGroupTotalCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t[3]")
    public java.nio.IntBuffer maxMeshWorkGroupCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nmaxMeshWorkGroupCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxMeshWorkGroupCount(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nmaxMeshWorkGroupCount(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxMeshWorkGroupInvocations() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxMeshWorkGroupInvocations(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t[3]")
    public java.nio.IntBuffer maxMeshWorkGroupSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nmaxMeshWorkGroupSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxMeshWorkGroupSize(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nmaxMeshWorkGroupSize(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxMeshSharedMemorySize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxMeshSharedMemorySize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxMeshPayloadAndSharedMemorySize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxMeshPayloadAndSharedMemorySize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxMeshOutputMemorySize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxMeshOutputMemorySize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxMeshPayloadAndOutputMemorySize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxMeshPayloadAndOutputMemorySize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxMeshOutputComponents() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxMeshOutputComponents(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxMeshOutputVertices() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxMeshOutputVertices(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxMeshOutputPrimitives() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxMeshOutputPrimitives(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxMeshOutputLayers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxMeshOutputLayers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxMeshMultiviewViewCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxMeshMultiviewViewCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int meshOutputPerVertexGranularity() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmeshOutputPerVertexGranularity(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int meshOutputPerPrimitiveGranularity() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmeshOutputPerPrimitiveGranularity(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPreferredTaskWorkGroupInvocations() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPreferredTaskWorkGroupInvocations(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPreferredMeshWorkGroupInvocations() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPreferredMeshWorkGroupInvocations(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean prefersLocalInvocationVertexOutput() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nprefersLocalInvocationVertexOutput(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean prefersLocalInvocationPrimitiveOutput() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nprefersLocalInvocationPrimitiveOutput(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean prefersCompactVertexOutput() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nprefersCompactVertexOutput(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean prefersCompactPrimitiveOutput() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nprefersCompactPrimitiveOutput(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000328001(0x3b9fcb41, float:0.0048765247)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT set(org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nmaxTaskWorkGroupTotalCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPTOTALCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer nmaxTaskWorkGroupCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nmaxTaskWorkGroupCount(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 3
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxTaskWorkGroupInvocations(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPINVOCATIONS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer nmaxTaskWorkGroupSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nmaxTaskWorkGroupSize(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 3
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxTaskPayloadSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKPAYLOADSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxTaskSharedMemorySize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKSHAREDMEMORYSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxTaskPayloadAndSharedMemorySize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKPAYLOADANDSHAREDMEMORYSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxMeshWorkGroupTotalCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPTOTALCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer nmaxMeshWorkGroupCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nmaxMeshWorkGroupCount(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 3
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxMeshWorkGroupInvocations(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPINVOCATIONS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer nmaxMeshWorkGroupSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nmaxMeshWorkGroupSize(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 3
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxMeshSharedMemorySize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHSHAREDMEMORYSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxMeshPayloadAndSharedMemorySize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHPAYLOADANDSHAREDMEMORYSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxMeshOutputMemorySize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHOUTPUTMEMORYSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxMeshPayloadAndOutputMemorySize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHPAYLOADANDOUTPUTMEMORYSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxMeshOutputComponents(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHOUTPUTCOMPONENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxMeshOutputVertices(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHOUTPUTVERTICES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxMeshOutputPrimitives(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHOUTPUTPRIMITIVES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxMeshOutputLayers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHOUTPUTLAYERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxMeshMultiviewViewCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHMULTIVIEWVIEWCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmeshOutputPerVertexGranularity(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MESHOUTPUTPERVERTEXGRANULARITY
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmeshOutputPerPrimitiveGranularity(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MESHOUTPUTPERPRIMITIVEGRANULARITY
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPreferredTaskWorkGroupInvocations(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXPREFERREDTASKWORKGROUPINVOCATIONS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPreferredMeshWorkGroupInvocations(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXPREFERREDMESHWORKGROUPINVOCATIONS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nprefersLocalInvocationVertexOutput(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.PREFERSLOCALINVOCATIONVERTEXOUTPUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nprefersLocalInvocationPrimitiveOutput(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.PREFERSLOCALINVOCATIONPRIMITIVEOUTPUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nprefersCompactVertexOutput(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.PREFERSCOMPACTVERTEXOUTPUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nprefersCompactPrimitiveOutput(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.PREFERSCOMPACTPRIMITIVEOUTPUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 30
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.POINTER_SIZE
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
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
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
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 25
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 26
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 27
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 28
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 29
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPTOTALCOUNT = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPCOUNT = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPINVOCATIONS = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKWORKGROUPSIZE = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKPAYLOADSIZE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKSHAREDMEMORYSIZE = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXTASKPAYLOADANDSHAREDMEMORYSIZE = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPTOTALCOUNT = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPCOUNT = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPINVOCATIONS = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHWORKGROUPSIZE = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHSHAREDMEMORYSIZE = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHPAYLOADANDSHAREDMEMORYSIZE = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHOUTPUTMEMORYSIZE = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHPAYLOADANDOUTPUTMEMORYSIZE = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHOUTPUTCOMPONENTS = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHOUTPUTVERTICES = r0
            r0 = r6
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHOUTPUTPRIMITIVES = r0
            r0 = r6
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHOUTPUTLAYERS = r0
            r0 = r6
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXMESHMULTIVIEWVIEWCOUNT = r0
            r0 = r6
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MESHOUTPUTPERVERTEXGRANULARITY = r0
            r0 = r6
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MESHOUTPUTPERPRIMITIVEGRANULARITY = r0
            r0 = r6
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXPREFERREDTASKWORKGROUPINVOCATIONS = r0
            r0 = r6
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.MAXPREFERREDMESHWORKGROUPINVOCATIONS = r0
            r0 = r6
            r1 = 26
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.PREFERSLOCALINVOCATIONVERTEXOUTPUT = r0
            r0 = r6
            r1 = 27
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.PREFERSLOCALINVOCATIONPRIMITIVEOUTPUT = r0
            r0 = r6
            r1 = 28
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.PREFERSCOMPACTVERTEXOUTPUT = r0
            r0 = r6
            r1 = 29
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT.PREFERSCOMPACTPRIMITIVEOUTPUT = r0
            return
    }
}
