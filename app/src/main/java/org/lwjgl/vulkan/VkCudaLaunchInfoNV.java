package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCudaLaunchInfoNV.class */
public class VkCudaLaunchInfoNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkCudaLaunchInfoNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FUNCTION = 0;
    public static final int GRIDDIMX = 0;
    public static final int GRIDDIMY = 0;
    public static final int GRIDDIMZ = 0;
    public static final int BLOCKDIMX = 0;
    public static final int BLOCKDIMY = 0;
    public static final int BLOCKDIMZ = 0;
    public static final int SHAREDMEMBYTES = 0;
    public static final int PARAMCOUNT = 0;
    public static final int PPARAMS = 0;
    public static final int EXTRACOUNT = 0;
    public static final int PEXTRAS = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCudaLaunchInfoNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkCudaLaunchInfoNV, org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkCudaLaunchInfoNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer
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
        protected org.lwjgl.vulkan.VkCudaLaunchInfoNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkCudaFunctionNV")
        public long function() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.nfunction(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int gridDimX() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.ngridDimX(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int gridDimY() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.ngridDimY(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int gridDimZ() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.ngridDimZ(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int blockDimX() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.nblockDimX(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int blockDimY() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.nblockDimY(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int blockDimZ() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.nblockDimZ(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int sharedMemBytes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.nsharedMemBytes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long paramCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.nparamCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const * const *")
        public org.lwjgl.PointerBuffer pParams() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.PointerBuffer r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.npParams(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long extraCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.nextraCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const * const *")
        public org.lwjgl.PointerBuffer pExtras() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.PointerBuffer r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.npExtras(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCudaLaunchInfoNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000307002(0x3b9f793a, float:0.0048667463)
                org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCudaLaunchInfoNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer function(@org.lwjgl.system.NativeType("VkCudaFunctionNV") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCudaLaunchInfoNV.nfunction(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer gridDimX(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCudaLaunchInfoNV.ngridDimX(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer gridDimY(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCudaLaunchInfoNV.ngridDimY(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer gridDimZ(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCudaLaunchInfoNV.ngridDimZ(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer blockDimX(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCudaLaunchInfoNV.nblockDimX(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer blockDimY(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCudaLaunchInfoNV.nblockDimY(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer blockDimZ(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCudaLaunchInfoNV.nblockDimZ(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer sharedMemBytes(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCudaLaunchInfoNV.nsharedMemBytes(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer paramCount(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCudaLaunchInfoNV.nparamCount(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer pParams(@org.lwjgl.system.NativeType("void const * const *") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCudaLaunchInfoNV.npParams(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer extraCount(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCudaLaunchInfoNV.nextraCount(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer pExtras(@org.lwjgl.system.NativeType("void const * const *") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCudaLaunchInfoNV.npExtras(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4252create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.create(r0)
                org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkCudaLaunchInfoNV(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkCudaLaunchInfoNV create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkCudaLaunchInfoNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SIZEOF
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

    @org.lwjgl.system.NativeType("VkCudaFunctionNV")
    public long function() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nfunction(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int gridDimX() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ngridDimX(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int gridDimY() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ngridDimY(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int gridDimZ() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ngridDimZ(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int blockDimX() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nblockDimX(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int blockDimY() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nblockDimY(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int blockDimZ() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nblockDimZ(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int sharedMemBytes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsharedMemBytes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long paramCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nparamCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void const * const *")
    public org.lwjgl.PointerBuffer pParams() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.PointerBuffer r0 = npParams(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long extraCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nextraCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void const * const *")
    public org.lwjgl.PointerBuffer pExtras() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.PointerBuffer r0 = npExtras(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000307002(0x3b9f793a, float:0.0048667463)
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV function(@org.lwjgl.system.NativeType("VkCudaFunctionNV") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nfunction(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV gridDimX(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngridDimX(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV gridDimY(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngridDimY(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV gridDimZ(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngridDimZ(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV blockDimX(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nblockDimX(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV blockDimY(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nblockDimY(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV blockDimZ(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nblockDimZ(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV sharedMemBytes(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsharedMemBytes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV paramCount(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nparamCount(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV pParams(@org.lwjgl.system.NativeType("void const * const *") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npParams(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV extraCount(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nextraCount(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV pExtras(@org.lwjgl.system.NativeType("void const * const *") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npExtras(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV set(int r5, long r6, long r8, int r10, int r11, int r12, int r13, int r14, int r15, int r16, long r17, org.lwjgl.PointerBuffer r19, long r20, org.lwjgl.PointerBuffer r22) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.function(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.gridDimX(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.gridDimY(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.gridDimZ(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.blockDimX(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.blockDimY(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.blockDimZ(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.sharedMemBytes(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.paramCount(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.pParams(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.extraCount(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.pExtras(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCudaLaunchInfoNV set(org.lwjgl.vulkan.VkCudaLaunchInfoNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkCudaLaunchInfoNV malloc() {
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCudaLaunchInfoNV calloc() {
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCudaLaunchInfoNV create() {
            int r0 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCudaLaunchInfoNV create(long r6) {
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCudaLaunchInfoNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer
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

    public static org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCudaLaunchInfoNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCudaLaunchInfoNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCudaLaunchInfoNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkCudaLaunchInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nfunction(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.FUNCTION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int ngridDimX(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.GRIDDIMX
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ngridDimY(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.GRIDDIMY
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ngridDimZ(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.GRIDDIMZ
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nblockDimX(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.BLOCKDIMX
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nblockDimY(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.BLOCKDIMY
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nblockDimZ(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.BLOCKDIMZ
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsharedMemBytes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SHAREDMEMBYTES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long nparamCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.PARAMCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static org.lwjgl.PointerBuffer npParams(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.PPARAMS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            long r1 = nparamCount(r1)
            int r1 = (int) r1
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static long nextraCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.EXTRACOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static org.lwjgl.PointerBuffer npExtras(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.PEXTRAS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            long r1 = nextraCount(r1)
            int r1 = (int) r1
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nfunction(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.FUNCTION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void ngridDimX(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.GRIDDIMX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ngridDimY(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.GRIDDIMY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ngridDimZ(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.GRIDDIMZ
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nblockDimX(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.BLOCKDIMX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nblockDimY(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.BLOCKDIMY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nblockDimZ(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.BLOCKDIMZ
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsharedMemBytes(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.SHAREDMEMBYTES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nparamCount(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.PARAMCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npParams(long r5, org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.PPARAMS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            if (r0 == 0) goto L1a
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            long r1 = (long) r1
            nparamCount(r0, r1)
        L1a:
            return
    }

    public static void nextraCount(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.EXTRACOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npExtras(long r5, org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.PEXTRAS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            if (r0 == 0) goto L1a
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            long r1 = (long) r1
            nextraCount(r0, r1)
        L1a:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkCudaLaunchInfoNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 14
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
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
            int r3 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            int r3 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            int r3 = org.lwjgl.vulkan.VkCudaLaunchInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.FUNCTION = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.GRIDDIMX = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.GRIDDIMY = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.GRIDDIMZ = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.BLOCKDIMX = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.BLOCKDIMY = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.BLOCKDIMZ = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.SHAREDMEMBYTES = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.PARAMCOUNT = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.PPARAMS = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.EXTRACOUNT = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCudaLaunchInfoNV.PEXTRAS = r0
            return
    }
}
