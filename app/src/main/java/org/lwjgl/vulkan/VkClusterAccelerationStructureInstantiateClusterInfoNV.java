package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureInstantiateClusterInfoNV.class */
public class VkClusterAccelerationStructureInstantiateClusterInfoNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int CLUSTERIDOFFSET = 0;
    public static final int BITFIELD0 = 0;
    public static final int CLUSTERTEMPLATEADDRESS = 0;
    public static final int VERTEXBUFFER = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV, org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF
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

        Buffer(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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
        protected org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer
                r1 = r0
                r2 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int clusterIdOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.nclusterIdOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int geometryIndexOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.ngeometryIndexOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int reserved() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.nreserved(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long clusterTemplateAddress() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.nclusterTemplateAddress(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkStridedDeviceAddressNV vertexBuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkStridedDeviceAddressNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.nvertexBuffer(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer clusterIdOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.nclusterIdOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer geometryIndexOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.ngeometryIndexOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer reserved(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.nreserved(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer clusterTemplateAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.nclusterTemplateAddress(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer vertexBuffer(org.lwjgl.vulkan.VkStridedDeviceAddressNV r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.nvertexBuffer(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer vertexBuffer(java.util.function.Consumer<org.lwjgl.vulkan.VkStridedDeviceAddressNV> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkStridedDeviceAddressNV r1 = r1.vertexBuffer()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4105create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.create(r0)
                org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkClusterAccelerationStructureInstantiateClusterInfoNV(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkClusterAccelerationStructureInstantiateClusterInfoNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int clusterIdOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nclusterIdOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int geometryIndexOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ngeometryIndexOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int reserved() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nreserved(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long clusterTemplateAddress() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nclusterTemplateAddress(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkStridedDeviceAddressNV vertexBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkStridedDeviceAddressNV r0 = nvertexBuffer(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV clusterIdOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nclusterIdOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV geometryIndexOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngeometryIndexOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV reserved(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nreserved(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV clusterTemplateAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nclusterTemplateAddress(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV vertexBuffer(org.lwjgl.vulkan.VkStridedDeviceAddressNV r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertexBuffer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV vertexBuffer(java.util.function.Consumer<org.lwjgl.vulkan.VkStridedDeviceAddressNV> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkStridedDeviceAddressNV r1 = r1.vertexBuffer()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV set(int r5, int r6, int r7, long r8, org.lwjgl.vulkan.VkStridedDeviceAddressNV r10) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = r0.clusterIdOffset(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = r0.geometryIndexOffset(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = r0.reserved(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = r0.clusterTemplateAddress(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = r0.vertexBuffer(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV set(org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV malloc() {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV calloc() {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV create() {
            int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV create(long r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer
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

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nclusterIdOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.CLUSTERIDOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nbitfield0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.BITFIELD0
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ngeometryIndexOffset(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            return r0
    }

    public static int nreserved(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 24
            int r0 = r0 >>> r1
            return r0
    }

    public static long nclusterTemplateAddress(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.CLUSTERTEMPLATEADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkStridedDeviceAddressNV nvertexBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.VERTEXBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkStridedDeviceAddressNV r0 = org.lwjgl.vulkan.VkStridedDeviceAddressNV.create(r0)
            return r0
    }

    public static void nclusterIdOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.CLUSTERIDOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nbitfield0(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.BITFIELD0
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ngeometryIndexOffset(long r6, int r8) {
            r0 = r6
            r1 = r6
            int r1 = nbitfield0(r1)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r2
            r2 = r8
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nreserved(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 24
            int r1 = r1 << r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nclusterTemplateAddress(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.CLUSTERTEMPLATEADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nvertexBuffer(long r7, org.lwjgl.vulkan.VkStridedDeviceAddressNV r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.VERTEXBUFFER
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkStridedDeviceAddressNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkStridedDeviceAddressNV.SIZEOF
            int r4 = org.lwjgl.vulkan.VkStridedDeviceAddressNV.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.CLUSTERIDOFFSET = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.BITFIELD0 = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.CLUSTERTEMPLATEADDRESS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureInstantiateClusterInfoNV.VERTEXBUFFER = r0
            return
    }
}
