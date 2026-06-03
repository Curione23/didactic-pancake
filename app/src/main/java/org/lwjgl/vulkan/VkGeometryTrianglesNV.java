package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeometryTrianglesNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeometryTrianglesNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeometryTrianglesNV.class */
public class VkGeometryTrianglesNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkGeometryTrianglesNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int VERTEXDATA = 0;
    public static final int VERTEXOFFSET = 0;
    public static final int VERTEXCOUNT = 0;
    public static final int VERTEXSTRIDE = 0;
    public static final int VERTEXFORMAT = 0;
    public static final int INDEXDATA = 0;
    public static final int INDEXOFFSET = 0;
    public static final int INDEXCOUNT = 0;
    public static final int INDEXTYPE = 0;
    public static final int TRANSFORMDATA = 0;
    public static final int TRANSFORMOFFSET = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeometryTrianglesNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeometryTrianglesNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeometryTrianglesNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkGeometryTrianglesNV, org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkGeometryTrianglesNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkGeometryTrianglesNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBuffer")
        public long vertexData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.nvertexData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long vertexOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.nvertexOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int vertexCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.nvertexCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long vertexStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.nvertexStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int vertexFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.nvertexFormat(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBuffer")
        public long indexData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.nindexData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long indexOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.nindexOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int indexCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.nindexCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkIndexType")
        public int indexType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.nindexType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBuffer")
        public long transformData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.ntransformData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long transformOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.ntransformOffset(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGeometryTrianglesNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000165004(0x3b9d4e8c, float:0.0048006233)
                org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeometryTrianglesNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer vertexData(@org.lwjgl.system.NativeType("VkBuffer") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeometryTrianglesNV.nvertexData(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer vertexOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeometryTrianglesNV.nvertexOffset(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer vertexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGeometryTrianglesNV.nvertexCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer vertexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeometryTrianglesNV.nvertexStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer vertexFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGeometryTrianglesNV.nvertexFormat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer indexData(@org.lwjgl.system.NativeType("VkBuffer") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeometryTrianglesNV.nindexData(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer indexOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeometryTrianglesNV.nindexOffset(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer indexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGeometryTrianglesNV.nindexCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer indexType(@org.lwjgl.system.NativeType("VkIndexType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGeometryTrianglesNV.nindexType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer transformData(@org.lwjgl.system.NativeType("VkBuffer") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeometryTrianglesNV.ntransformData(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer transformOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkGeometryTrianglesNV.ntransformOffset(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.create(r0)
                org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkGeometryTrianglesNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkGeometryTrianglesNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = new org.lwjgl.vulkan.VkGeometryTrianglesNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkGeometryTrianglesNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
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

    @org.lwjgl.system.NativeType("VkBuffer")
    public long vertexData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvertexData(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long vertexOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvertexOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int vertexCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvertexCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long vertexStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvertexStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int vertexFormat() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvertexFormat(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBuffer")
    public long indexData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nindexData(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long indexOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nindexOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int indexCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nindexCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkIndexType")
    public int indexType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nindexType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBuffer")
    public long transformData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ntransformData(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long transformOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ntransformOffset(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000165004(0x3b9d4e8c, float:0.0048006233)
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV vertexData(@org.lwjgl.system.NativeType("VkBuffer") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvertexData(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV vertexOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvertexOffset(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV vertexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertexCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV vertexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvertexStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV vertexFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertexFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV indexData(@org.lwjgl.system.NativeType("VkBuffer") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nindexData(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV indexOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nindexOffset(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV indexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV indexType(@org.lwjgl.system.NativeType("VkIndexType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV transformData(@org.lwjgl.system.NativeType("VkBuffer") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ntransformData(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV transformOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ntransformOffset(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV set(int r5, long r6, long r8, long r10, int r12, long r13, int r15, long r16, long r18, int r20, int r21, long r22, long r24) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.vertexData(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.vertexOffset(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.vertexCount(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.vertexStride(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.vertexFormat(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.indexData(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.indexOffset(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.indexCount(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.indexType(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.transformData(r1)
            r0 = r4
            r1 = r24
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.transformOffset(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV set(org.lwjgl.vulkan.VkGeometryTrianglesNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryTrianglesNV malloc() {
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = new org.lwjgl.vulkan.VkGeometryTrianglesNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryTrianglesNV calloc() {
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = new org.lwjgl.vulkan.VkGeometryTrianglesNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryTrianglesNV create() {
            int r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = new org.lwjgl.vulkan.VkGeometryTrianglesNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryTrianglesNV create(long r6) {
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = new org.lwjgl.vulkan.VkGeometryTrianglesNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkGeometryTrianglesNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = new org.lwjgl.vulkan.VkGeometryTrianglesNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer r0 = new org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer r0 = new org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer r0 = new org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer
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

    public static org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer r0 = new org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer r0 = new org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryTrianglesNV mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryTrianglesNV callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryTrianglesNV mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryTrianglesNV callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryTrianglesNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = new org.lwjgl.vulkan.VkGeometryTrianglesNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryTrianglesNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = new org.lwjgl.vulkan.VkGeometryTrianglesNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer r0 = new org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryTrianglesNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer r0 = new org.lwjgl.vulkan.VkGeometryTrianglesNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeometryTrianglesNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvertexData(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.VERTEXDATA
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nvertexOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.VERTEXOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nvertexCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.VERTEXCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nvertexStride(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.VERTEXSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nvertexFormat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.VERTEXFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nindexData(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.INDEXDATA
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nindexOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.INDEXOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nindexCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.INDEXCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nindexType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.INDEXTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ntransformData(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.TRANSFORMDATA
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long ntransformOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.TRANSFORMOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeometryTrianglesNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvertexData(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.VERTEXDATA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nvertexOffset(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.VERTEXOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nvertexCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.VERTEXCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nvertexStride(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.VERTEXSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nvertexFormat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.VERTEXFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nindexData(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.INDEXDATA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nindexOffset(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.INDEXOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nindexCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.INDEXCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nindexType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.INDEXTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ntransformData(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.TRANSFORMDATA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void ntransformOffset(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.TRANSFORMOFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 8
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
            r3 = 8
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkGeometryTrianglesNV.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeometryTrianglesNV.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeometryTrianglesNV.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeometryTrianglesNV.VERTEXDATA = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeometryTrianglesNV.VERTEXOFFSET = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeometryTrianglesNV.VERTEXCOUNT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeometryTrianglesNV.VERTEXSTRIDE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeometryTrianglesNV.VERTEXFORMAT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeometryTrianglesNV.INDEXDATA = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeometryTrianglesNV.INDEXOFFSET = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeometryTrianglesNV.INDEXCOUNT = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeometryTrianglesNV.INDEXTYPE = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeometryTrianglesNV.TRANSFORMDATA = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeometryTrianglesNV.TRANSFORMOFFSET = r0
            return
    }
}
