package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureOpInputNV.class */
public class VkClusterAccelerationStructureOpInputNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int PCLUSTERSBOTTOMLEVEL = 0;
    public static final int PTRIANGLECLUSTERS = 0;
    public static final int PMOVEOBJECTS = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureOpInputNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV, org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer
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
        protected org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkClusterAccelerationStructureClustersBottomLevelInputNV *")
        public org.lwjgl.vulkan.VkClusterAccelerationStructureClustersBottomLevelInputNV pClustersBottomLevel() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkClusterAccelerationStructureClustersBottomLevelInputNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.npClustersBottomLevel(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkClusterAccelerationStructureTriangleClusterInputNV *")
        public org.lwjgl.vulkan.VkClusterAccelerationStructureTriangleClusterInputNV pTriangleClusters() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkClusterAccelerationStructureTriangleClusterInputNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.npTriangleClusters(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkClusterAccelerationStructureMoveObjectsInputNV *")
        public org.lwjgl.vulkan.VkClusterAccelerationStructureMoveObjectsInputNV pMoveObjects() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkClusterAccelerationStructureMoveObjectsInputNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.npMoveObjects(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.Buffer pClustersBottomLevel(@org.lwjgl.system.NativeType("VkClusterAccelerationStructureClustersBottomLevelInputNV *") org.lwjgl.vulkan.VkClusterAccelerationStructureClustersBottomLevelInputNV r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.npClustersBottomLevel(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.Buffer pTriangleClusters(@org.lwjgl.system.NativeType("VkClusterAccelerationStructureTriangleClusterInputNV *") org.lwjgl.vulkan.VkClusterAccelerationStructureTriangleClusterInputNV r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.npTriangleClusters(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.Buffer pMoveObjects(@org.lwjgl.system.NativeType("VkClusterAccelerationStructureMoveObjectsInputNV *") org.lwjgl.vulkan.VkClusterAccelerationStructureMoveObjectsInputNV r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.npMoveObjects(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4114create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.create(r0)
                org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkClusterAccelerationStructureOpInputNV(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkClusterAccelerationStructureOpInputNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkClusterAccelerationStructureClustersBottomLevelInputNV *")
    public org.lwjgl.vulkan.VkClusterAccelerationStructureClustersBottomLevelInputNV pClustersBottomLevel() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkClusterAccelerationStructureClustersBottomLevelInputNV r0 = npClustersBottomLevel(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkClusterAccelerationStructureTriangleClusterInputNV *")
    public org.lwjgl.vulkan.VkClusterAccelerationStructureTriangleClusterInputNV pTriangleClusters() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkClusterAccelerationStructureTriangleClusterInputNV r0 = npTriangleClusters(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkClusterAccelerationStructureMoveObjectsInputNV *")
    public org.lwjgl.vulkan.VkClusterAccelerationStructureMoveObjectsInputNV pMoveObjects() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkClusterAccelerationStructureMoveObjectsInputNV r0 = npMoveObjects(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV pClustersBottomLevel(@org.lwjgl.system.NativeType("VkClusterAccelerationStructureClustersBottomLevelInputNV *") org.lwjgl.vulkan.VkClusterAccelerationStructureClustersBottomLevelInputNV r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npClustersBottomLevel(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV pTriangleClusters(@org.lwjgl.system.NativeType("VkClusterAccelerationStructureTriangleClusterInputNV *") org.lwjgl.vulkan.VkClusterAccelerationStructureTriangleClusterInputNV r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npTriangleClusters(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV pMoveObjects(@org.lwjgl.system.NativeType("VkClusterAccelerationStructureMoveObjectsInputNV *") org.lwjgl.vulkan.VkClusterAccelerationStructureMoveObjectsInputNV r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npMoveObjects(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV set(org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV malloc() {
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV calloc() {
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV create() {
            int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV create(long r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer
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

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureClustersBottomLevelInputNV npClustersBottomLevel(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.PCLUSTERSBOTTOMLEVEL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkClusterAccelerationStructureClustersBottomLevelInputNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureClustersBottomLevelInputNV.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureTriangleClusterInputNV npTriangleClusters(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.PTRIANGLECLUSTERS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkClusterAccelerationStructureTriangleClusterInputNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureTriangleClusterInputNV.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureMoveObjectsInputNV npMoveObjects(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.PMOVEOBJECTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkClusterAccelerationStructureMoveObjectsInputNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureMoveObjectsInputNV.create(r0)
            return r0
    }

    public static void npClustersBottomLevel(long r5, org.lwjgl.vulkan.VkClusterAccelerationStructureClustersBottomLevelInputNV r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.PCLUSTERSBOTTOMLEVEL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npTriangleClusters(long r5, org.lwjgl.vulkan.VkClusterAccelerationStructureTriangleClusterInputNV r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.PTRIANGLECLUSTERS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npMoveObjects(long r5, org.lwjgl.vulkan.VkClusterAccelerationStructureMoveObjectsInputNV r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.PMOVEOBJECTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __union(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.PCLUSTERSBOTTOMLEVEL = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.PTRIANGLECLUSTERS = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.PMOVEOBJECTS = r0
            return
    }
}
