package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureInputInfoNV.class */
public class VkClusterAccelerationStructureInputInfoNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int MAXACCELERATIONSTRUCTURECOUNT = 0;
    public static final int FLAGS = 0;
    public static final int OPTYPE = 0;
    public static final int OPMODE = 0;
    public static final int OPINPUT = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureInputInfoNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV, org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer
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
        protected org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxAccelerationStructureCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.nmaxAccelerationStructureCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBuildAccelerationStructureFlagsKHR")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkClusterAccelerationStructureOpTypeNV")
        public int opType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.nopType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkClusterAccelerationStructureOpModeNV")
        public int opMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.nopMode(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV opInput() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.nopInput(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000569005(0x3ba378ad, float:0.004988751)
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer maxAccelerationStructureCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.nmaxAccelerationStructureCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer flags(@org.lwjgl.system.NativeType("VkBuildAccelerationStructureFlagsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer opType(@org.lwjgl.system.NativeType("VkClusterAccelerationStructureOpTypeNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.nopType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer opMode(@org.lwjgl.system.NativeType("VkClusterAccelerationStructureOpModeNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.nopMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer opInput(org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.nopInput(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer opInput(java.util.function.Consumer<org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r1 = r1.opInput()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4102create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.create(r0)
                org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkClusterAccelerationStructureInputInfoNV(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkClusterAccelerationStructureInputInfoNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
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
    public int maxAccelerationStructureCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxAccelerationStructureCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBuildAccelerationStructureFlagsKHR")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkClusterAccelerationStructureOpTypeNV")
    public int opType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nopType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkClusterAccelerationStructureOpModeNV")
    public int opMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nopMode(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV opInput() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r0 = nopInput(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000569005(0x3ba378ad, float:0.004988751)
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV maxAccelerationStructureCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxAccelerationStructureCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV flags(@org.lwjgl.system.NativeType("VkBuildAccelerationStructureFlagsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV opType(@org.lwjgl.system.NativeType("VkClusterAccelerationStructureOpTypeNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nopType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV opMode(@org.lwjgl.system.NativeType("VkClusterAccelerationStructureOpModeNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nopMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV opInput(org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nopInput(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV opInput(java.util.function.Consumer<org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r1 = r1.opInput()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV set(int r5, long r6, int r8, int r9, int r10, int r11, org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = r0.maxAccelerationStructureCount(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = r0.flags(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = r0.opType(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = r0.opMode(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = r0.opInput(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV set(org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV malloc() {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV calloc() {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV create() {
            int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV create(long r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer
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

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nmaxAccelerationStructureCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.MAXACCELERATIONSTRUCTURECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nopType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.OPTYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nopMode(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.OPMODE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV nopInput(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.OPINPUT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.create(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmaxAccelerationStructureCount(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.MAXACCELERATIONSTRUCTURECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nflags(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nopType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.OPTYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nopMode(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.OPMODE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nopInput(long r7, org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.OPINPUT
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
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
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.SIZEOF
            int r4 = org.lwjgl.vulkan.VkClusterAccelerationStructureOpInputNV.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.MAXACCELERATIONSTRUCTURECOUNT = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.FLAGS = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.OPTYPE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.OPMODE = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureInputInfoNV.OPINPUT = r0
            return
    }
}
