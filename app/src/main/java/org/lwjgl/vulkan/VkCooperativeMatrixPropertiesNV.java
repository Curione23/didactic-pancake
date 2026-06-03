package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesNV.class */
public class VkCooperativeMatrixPropertiesNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int MSIZE = 0;
    public static final int NSIZE = 0;
    public static final int KSIZE = 0;
    public static final int ATYPE = 0;
    public static final int BTYPE = 0;
    public static final int CTYPE = 0;
    public static final int DTYPE = 0;
    public static final int SCOPE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV, org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int MSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nMSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int NSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nNSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int KSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nKSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkComponentTypeNV")
        public int AType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nAType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkComponentTypeNV")
        public int BType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nBType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkComponentTypeNV")
        public int CType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nCType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkComponentTypeNV")
        public int DType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nDType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkScopeNV")
        public int scope() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nscope(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000249001(0x3b9e96a9, float:0.0048397374)
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer MSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nMSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer NSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nNSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer KSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nKSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer AType(@org.lwjgl.system.NativeType("VkComponentTypeNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nAType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer BType(@org.lwjgl.system.NativeType("VkComponentTypeNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nBType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer CType(@org.lwjgl.system.NativeType("VkComponentTypeNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nCType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer DType(@org.lwjgl.system.NativeType("VkComponentTypeNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nDType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer scope(@org.lwjgl.system.NativeType("VkScopeNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.nscope(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.create(r0)
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkCooperativeMatrixPropertiesNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkCooperativeMatrixPropertiesNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SIZEOF
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
    public int MSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nMSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int NSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nNSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int KSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nKSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkComponentTypeNV")
    public int AType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nAType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkComponentTypeNV")
    public int BType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nBType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkComponentTypeNV")
    public int CType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nCType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkComponentTypeNV")
    public int DType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nDType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkScopeNV")
    public int scope() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nscope(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000249001(0x3b9e96a9, float:0.0048397374)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV MSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nMSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV NSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nNSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV KSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nKSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV AType(@org.lwjgl.system.NativeType("VkComponentTypeNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nAType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV BType(@org.lwjgl.system.NativeType("VkComponentTypeNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nBType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV CType(@org.lwjgl.system.NativeType("VkComponentTypeNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nCType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV DType(@org.lwjgl.system.NativeType("VkComponentTypeNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nDType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV scope(@org.lwjgl.system.NativeType("VkScopeNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nscope(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV set(int r5, long r6, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = r0.MSize(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = r0.NSize(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = r0.KSize(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = r0.AType(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = r0.BType(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = r0.CType(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = r0.DType(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = r0.scope(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV set(org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV malloc() {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV calloc() {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV create() {
            int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV create(long r6) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer
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

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nMSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.MSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nNSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.NSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nKSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.KSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nAType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.ATYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nBType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.BTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nCType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.CTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nDType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.DTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nscope(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SCOPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nMSize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.MSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nNSize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.NSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nKSize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.KSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nAType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.ATYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nBType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.BTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nCType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.CTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nDType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.DTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nscope(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SCOPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.MSIZE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.NSIZE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.KSIZE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.ATYPE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.BTYPE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.CTYPE = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.DTYPE = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesNV.SCOPE = r0
            return
    }
}
