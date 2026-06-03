package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesKHR.class */
public class VkCooperativeMatrixPropertiesKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR> implements org.lwjgl.system.NativeResource {
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
    public static final int RESULTTYPE = 0;
    public static final int SATURATINGACCUMULATION = 0;
    public static final int SCOPE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCooperativeMatrixPropertiesKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR, org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int MSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nMSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int NSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nNSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int KSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nKSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkComponentTypeKHR")
        public int AType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nAType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkComponentTypeKHR")
        public int BType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nBType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkComponentTypeKHR")
        public int CType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nCType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkComponentTypeKHR")
        public int ResultType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nResultType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean saturatingAccumulation() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nsaturatingAccumulation(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkScopeKHR")
        public int scope() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nscope(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000506001(0x3ba28291, float:0.0049594124)
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer MSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nMSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer NSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nNSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer KSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nKSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer AType(@org.lwjgl.system.NativeType("VkComponentTypeKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nAType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer BType(@org.lwjgl.system.NativeType("VkComponentTypeKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nBType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer CType(@org.lwjgl.system.NativeType("VkComponentTypeKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nCType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer ResultType(@org.lwjgl.system.NativeType("VkComponentTypeKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nResultType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer saturatingAccumulation(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nsaturatingAccumulation(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer scope(@org.lwjgl.system.NativeType("VkScopeKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.nscope(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.create(r0)
                org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkCooperativeMatrixPropertiesKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkCooperativeMatrixPropertiesKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("VkComponentTypeKHR")
    public int AType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nAType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkComponentTypeKHR")
    public int BType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nBType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkComponentTypeKHR")
    public int CType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nCType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkComponentTypeKHR")
    public int ResultType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nResultType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean saturatingAccumulation() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsaturatingAccumulation(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkScopeKHR")
    public int scope() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nscope(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000506001(0x3ba28291, float:0.0049594124)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR MSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nMSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR NSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nNSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR KSize(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nKSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR AType(@org.lwjgl.system.NativeType("VkComponentTypeKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nAType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR BType(@org.lwjgl.system.NativeType("VkComponentTypeKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nBType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR CType(@org.lwjgl.system.NativeType("VkComponentTypeKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nCType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR ResultType(@org.lwjgl.system.NativeType("VkComponentTypeKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nResultType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR saturatingAccumulation(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nsaturatingAccumulation(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR scope(@org.lwjgl.system.NativeType("VkScopeKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nscope(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR set(int r5, long r6, int r8, int r9, int r10, int r11, int r12, int r13, int r14, boolean r15, int r16) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = r0.MSize(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = r0.NSize(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = r0.KSize(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = r0.AType(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = r0.BType(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = r0.CType(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = r0.ResultType(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = r0.saturatingAccumulation(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = r0.scope(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR set(org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR malloc() {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR calloc() {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR create() {
            int r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR create(long r6) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer
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

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nMSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.MSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nNSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.NSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nKSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.KSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nAType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.ATYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nBType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.BTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nCType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.CTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nResultType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.RESULTTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsaturatingAccumulation(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SATURATINGACCUMULATION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nscope(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SCOPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nMSize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.MSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nNSize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.NSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nKSize(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.KSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nAType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.ATYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nBType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.BTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nCType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.CTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nResultType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.RESULTTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsaturatingAccumulation(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SATURATINGACCUMULATION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nscope(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SCOPE
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
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 11
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.MSIZE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.NSIZE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.KSIZE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.ATYPE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.BTYPE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.CTYPE = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.RESULTTYPE = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SATURATINGACCUMULATION = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCooperativeMatrixPropertiesKHR.SCOPE = r0
            return
    }
}
