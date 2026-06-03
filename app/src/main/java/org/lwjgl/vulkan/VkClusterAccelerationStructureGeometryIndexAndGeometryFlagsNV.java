package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.class */
public class VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int BITFIELD0 = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV, org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer
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
        protected org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int geometryIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ngeometryIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int reserved() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.nreserved(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int geometryFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ngeometryFlags(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer geometryIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ngeometryIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer reserved(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.nreserved(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer geometryFlags(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ngeometryFlags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4096create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.create(r0)
                org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int geometryIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ngeometryIndex(r0)
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int geometryFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ngeometryFlags(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV geometryIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngeometryIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV reserved(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nreserved(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV geometryFlags(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngeometryFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV set(int r4, int r5, int r6) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = r0.geometryIndex(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = r0.reserved(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = r0.geometryFlags(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV set(org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV malloc() {
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV calloc() {
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV create() {
            int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV create(long r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer
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

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nbitfield0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.BITFIELD0
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ngeometryIndex(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r1
            return r0
    }

    public static int nreserved(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 520093696(0x1f000000, float:2.7105054E-20)
            r0 = r0 & r1
            r1 = 24
            int r0 = r0 >>> r1
            return r0
    }

    public static int ngeometryFlags(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 29
            int r0 = r0 >>> r1
            return r0
    }

    public static void nbitfield0(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.BITFIELD0
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ngeometryIndex(long r6, int r8) {
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
            r2 = 520093696(0x1f000000, float:2.7105054E-20)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -520093697(0xffffffffe0ffffff, float:-1.4757394E20)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void ngeometryFlags(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 29
            int r1 = r1 << r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 1
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.BITFIELD0 = r0
            return
    }
}
