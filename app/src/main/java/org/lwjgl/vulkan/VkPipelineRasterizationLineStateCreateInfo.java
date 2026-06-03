package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineRasterizationLineStateCreateInfo.class */
public class VkPipelineRasterizationLineStateCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int LINERASTERIZATIONMODE = 0;
    public static final int STIPPLEDLINEENABLE = 0;
    public static final int LINESTIPPLEFACTOR = 0;
    public static final int LINESTIPPLEPATTERN = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineRasterizationLineStateCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo, org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer
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
        protected org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkLineRasterizationMode")
        public int lineRasterizationMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.nlineRasterizationMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean stippledLineEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.nstippledLineEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int lineStippleFactor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.nlineStippleFactor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short lineStipplePattern() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.nlineStipplePattern(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000259001(0x3b9ebdb9, float:0.004844394)
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer lineRasterizationMode(@org.lwjgl.system.NativeType("VkLineRasterizationMode") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.nlineRasterizationMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer stippledLineEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.nstippledLineEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer lineStippleFactor(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.nlineStippleFactor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer lineStipplePattern(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.nlineStipplePattern(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer mo6333create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.create(r0)
                org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPipelineRasterizationLineStateCreateInfo(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPipelineRasterizationLineStateCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkLineRasterizationMode")
    public int lineRasterizationMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlineRasterizationMode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean stippledLineEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstippledLineEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int lineStippleFactor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlineStippleFactor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short lineStipplePattern() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nlineStipplePattern(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000259001(0x3b9ebdb9, float:0.004844394)
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo lineRasterizationMode(@org.lwjgl.system.NativeType("VkLineRasterizationMode") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlineRasterizationMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo stippledLineEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nstippledLineEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo lineStippleFactor(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlineStippleFactor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo lineStipplePattern(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlineStipplePattern(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo set(int r5, long r6, int r8, boolean r9, int r10, short r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = r0.lineRasterizationMode(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = r0.stippledLineEnable(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = r0.lineStippleFactor(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = r0.lineStipplePattern(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo set(org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo malloc() {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo calloc() {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer
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

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nlineRasterizationMode(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.LINERASTERIZATIONMODE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nstippledLineEnable(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.STIPPLEDLINEENABLE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nlineStippleFactor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.LINESTIPPLEFACTOR
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static short nlineStipplePattern(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.LINESTIPPLEPATTERN
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nlineRasterizationMode(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.LINERASTERIZATIONMODE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nstippledLineEnable(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.STIPPLEDLINEENABLE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nlineStippleFactor(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.LINESTIPPLEFACTOR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nlineStipplePattern(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.LINESTIPPLEPATTERN
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.POINTER_SIZE
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
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.LINERASTERIZATIONMODE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.STIPPLEDLINEENABLE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.LINESTIPPLEFACTOR = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineRasterizationLineStateCreateInfo.LINESTIPPLEPATTERN = r0
            return
    }
}
